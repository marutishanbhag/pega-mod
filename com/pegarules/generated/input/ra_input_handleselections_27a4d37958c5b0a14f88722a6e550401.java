package com.pegarules.generated.input;
/*
 * Copyright (c) 2026 Pegasystems Inc.
 * All rights reserved.
 *
 * This software is governed by a License Agreement that restricts its
 * use.  The software contains valuable trade secrets and proprietary
 * information of Pegasystems Inc and is protected by federal copyright
 * law.  It may not be copied, modified, translated or distributed in any
 * form or medium, disclosed to third parties or used in any manner not
 * expressly provided for in said License Agreement except with written
 * authorization from Pegasystems Inc.
*/
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
import com.pega.pegarules.pub.infengine.*;
import com.pega.pegarules.pub.presence.*;
import com.pega.pegarules.pub.runtime.*;
import com.pega.pegarules.pub.services.*;
import com.pega.pegarules.pub.util.*;
import com.pega.platform.clipboard.query.PageListQuery;
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.PropertyQuery;
import com.pega.platform.clipboard.query.ScalarListQuery;
import com.pega.platform.clipboard.query.ScalarValueQuery;
import com.pega.platform.executionengine.runtime.Loadtime;
import com.pegarules.generated.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
public class ra_input_handleselections_27a4d37958c5b0a14f88722a6e550401  extends com.pega.pegarules.priv.AbstractFUASupport implements EditInput, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Edit_Input.handleSelections.Input");
	public ra_input_handleselections_27a4d37958c5b0a14f88722a6e550401(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}
public void assign(ClipboardProperty theProperty, String theValue) {
	char  itsType = theProperty.getType();
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-EDIT-INPUT HANDLESELECTIONS #20180713T134052.631 GMT	Pega-Reporting:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
//Used to handle row selectios in selectable listview
//This function updates pyrowselected in case of radio button
//Also copies properties to pagelist/page depending upon users choice
if(theValue.equalsIgnoreCase("true")) {
	int single_selection = 1;
	int multiple_selection = 2;
	int nMode = 1;
	String strCopyTo = "";
	String strPageListName = "";

	ClipboardPage  pgCPList = theProperty.getParentPage();
	ClipboardProperty cp_results = pgCPList.getProperty(".pxResults");
	ClipboardProperty cp_lvselectparams = pgCPList.getProperty(".pySelectableLVParams");
	ClipboardPage pg_lvselectparams = null;
	ClipboardProperty cpTargetPageList = null;

	// Proj-862
	java.util.Hashtable htClasses = null;
	try{
		htClasses = (java.util.Hashtable)(pgCPList.getObject("pyClasses"));
	}
	catch(NullPointerException e){}

	int nResultsCount = 0;
	if(cp_results != null)
		nResultsCount = cp_results.size();
	boolean bProceed = false;
	if(cp_results != null && pgCPList != null && cp_lvselectparams != null) {
		pg_lvselectparams = cp_lvselectparams.getPageValue();
		String strMode = pg_lvselectparams.getString(".pySelectableMode");
		strCopyTo = pg_lvselectparams.getString(".pySelectableCopyTo");
		strPageListName = pg_lvselectparams.getString("pyCopyToPageList");
		if(strMode.equalsIgnoreCase("Multiple")) nMode = 2;
		if(strCopyTo.equalsIgnoreCase("PageList")) bProceed = true;
		if(strMode.equalsIgnoreCase("Single")) bProceed = true;
	}
	ClipboardPage pgTargetPage = null;
	if(bProceed) {
		if(strCopyTo.equalsIgnoreCase("PageList") || strCopyTo.equalsIgnoreCase("Page")) {
			if (strPageListName != null && !strPageListName.equals("")) {
				if(strPageListName.toLowerCase().startsWith("primary")) {
					String strPrimaryPageRef = pgCPList.getString("pyPrimaryPageRef");
					int nIndex = strPageListName.indexOf(".");
					if(nIndex > 0) {
						cpTargetPageList = tools.getProperty(strPrimaryPageRef + strPageListName.substring(strPageListName.indexOf(".")));
					} else {
						cpTargetPageList = tools.getProperty(strPrimaryPageRef);
					}
				}
				else {
					//Find the reference to pagelist
					if(strPageListName.toLowerCase().startsWith(".")) {
						String strPrimaryPageRef = pgCPList.getString("pyPrimaryPageRef");
						cpTargetPageList = tools.getProperty(strPrimaryPageRef + strPageListName);
					} else {
						int nIndex = strPageListName.indexOf(".");
						if(nIndex > 0) {
							String strTopPage = strPageListName.substring(0,(strPageListName.indexOf(".")));
							ClipboardPage pgTmpTarget = tools.findPage(strTopPage);
							if(pgTmpTarget != null) {
								cpTargetPageList = pgTmpTarget.getProperty(strPageListName.substring(strPageListName.indexOf(".")));
							}
						} else {
							pgTargetPage = tools.findPage(strPageListName);
						}
					}
				}
			}
		}
		if(nMode == single_selection) {
			String strRowNumSelected = 	pgCPList.getString(".pySingleSelection");
			try {
				int rowNumSelected = Integer.parseInt(strRowNumSelected);
				if(rowNumSelected > 0 && rowNumSelected <= nResultsCount) {
					ClipboardProperty cpSelectedRow = cp_results.getPropertyValue(rowNumSelected);
					ClipboardPage pgSelectedRow = cpSelectedRow.getPageValue();
					ClipboardProperty cpEditInputOnRow = pgSelectedRow.getProperty(".pyRowSelected");
					int nCnt = 1;
					if(!cpEditInputOnRow.getStringValue().equalsIgnoreCase("true")) {
						java.util.Iterator itr_results = cp_results.iterator();
						while (itr_results.hasNext()) {
							ClipboardProperty cp_aField = (ClipboardProperty) itr_results.next();
							ClipboardPage pg_aField = cp_aField.getPageValue();
							if(rowNumSelected != nCnt && pg_aField.getString(".pyRowSelected").equals("true")) {
								pg_aField.putString(".pyRowSelected","false");
							}
							nCnt++;
						}
					}
					cpSelectedRow = cp_results.getPropertyValue(rowNumSelected);
					pgSelectedRow = cpSelectedRow.getPageValue();
					pgSelectedRow.putString(".pyRowSelected","true");
					if(cpTargetPageList != null || pgTargetPage != null) {
						ClipboardPage tmpPage = null;
						if(pgTargetPage != null)
							tmpPage = pgTargetPage;
						else
							tmpPage = cpTargetPageList.getPageValue();
						ClipboardProperty cpMappings = pg_lvselectparams.getProperty("pyPageListMappings");
						boolean bKeyFound = false;
						if(cpMappings != null && cpMappings.size() > 0) {
							java.util.Iterator itr_mappings = cpMappings.iterator();
							while (itr_mappings.hasNext()) {
								ClipboardProperty cp_aMapping = (ClipboardProperty) itr_mappings.next();
								ClipboardPage pg_aMapping = cp_aMapping.getPageValue();
								String strTargetName = pg_aMapping.getString(".pyTargetProperty");
								String strSourceName = pg_aMapping.getString(".pySourceProperty");
								if(strSourceName.equals("pxInsHandle") || strSourceName.equals(".pxInsHandle")) {
									bKeyFound = true;
								}
								//Proj-862
								String strPrefix = "";
								String strPropNameWithoutPrefix = strSourceName;
								boolean bIsPrefixedProperty = false;
								int iDot = strSourceName.indexOf(".");
								if (iDot > 0){
									strPrefix = strSourceName.substring(0,iDot);
									if ((htClasses != null) && htClasses.containsKey(strPrefix)){
										strPropNameWithoutPrefix = strSourceName.substring(iDot);
										bIsPrefixedProperty = true;
									}
								}
								if (bIsPrefixedProperty){
									tmpPage.putString(strTargetName,pgSelectedRow.getProperty("pxPages(" + strPrefix + ")").getPageValue().getStringIfPresent(strPropNameWithoutPrefix));
								}
								else{
									tmpPage.putString(strTargetName,pgSelectedRow.getString(strSourceName));
								}
							}
							if(!bKeyFound)
								tmpPage.putString("pxInsHandle",pgSelectedRow.getString("pxInsHandle"));
						}
					}
				}
			} catch(NumberFormatException nfe) {
				//Improper row number
			}
		} else {
			//check if page already exists
			HashStringMap mRowKeys = new HashStringMap();
			if(cpTargetPageList != null) {
				java.util.Iterator itr_selectlist = cpTargetPageList.iterator();
				while (itr_selectlist.hasNext()) {
					ClipboardProperty cp_aSelectList = (ClipboardProperty) itr_selectlist.next();
					ClipboardPage pg_aSelectList = cp_aSelectList.getPageValue();
					String rowKeyVal = pg_aSelectList.getString(".pxInsHandle");
					if(!rowKeyVal.equals(""))
						mRowKeys.put(rowKeyVal,cp_aSelectList.indexOf()+"");

				}
				java.util.Iterator itr_results = cp_results.iterator();
				java.util.List rowsToRemove = new java.util.ArrayList();
				while (itr_results.hasNext())
				{
					boolean bFirstRow = false;
					ClipboardProperty cp_aResult = (ClipboardProperty) itr_results.next();
					ClipboardPage pg_aResult = cp_aResult.getPageValue();
					String strKeyValue = pg_aResult.getString(".pxInsHandle");
					if(pg_aResult.getString("pyRowSelected").equalsIgnoreCase("true")) {
						if(mRowKeys.size() == 0 || (mRowKeys.size() > 0 && !mRowKeys.containsKey(strKeyValue))){
							//add to list
							ClipboardProperty cpTmpRow = cpTargetPageList.getPropertyValue(1);
							ClipboardPage pgTmpRow = null;
							if(cpTmpRow != null) {
								pgTmpRow = cpTmpRow.getPageValue();
								if(pgTmpRow.getString("pxInsHandle").equals("")) bFirstRow = true;
							}
							String strClassName = cpTmpRow.getPageValue().getClassName();
							if(strClassName == null) strClassName = "";
							ClipboardPage tmpPage = tools.createPage(strClassName,"");
							ClipboardProperty cpMappings = pg_lvselectparams.getProperty("pyPageListMappings");
							String strRowKey = "";
							String strRowKeyValue = "";
							if(cpMappings != null && cpMappings.size() > 0) {
								java.util.Iterator itr_mappings = cpMappings.iterator();
								while (itr_mappings.hasNext()) {
									ClipboardProperty cp_aMapping = (ClipboardProperty) itr_mappings.next();
									ClipboardPage pg_aMapping = cp_aMapping.getPageValue();
									String strTargetName = pg_aMapping.getString(".pyTargetProperty");
									String strSourceName = pg_aMapping.getString(".pySourceProperty");

									//Proj-862
									String strPrefix = "";
									String strPropNameWithoutPrefix = strSourceName;
									boolean bIsPrefixedProperty = false;
									int iDot = strSourceName.indexOf(".");
									if (iDot > 0){
										strPrefix = strSourceName.substring(0,iDot);
										if ((htClasses != null) && htClasses.containsKey(strPrefix)){
											strPropNameWithoutPrefix = strSourceName.substring(iDot);
											bIsPrefixedProperty = true;
										}
									}
									if (bIsPrefixedProperty){
										tmpPage.putString(strTargetName,pg_aResult.getProperty("pxPages(" + strPrefix + ")").getPageValue().getStringIfPresent(strPropNameWithoutPrefix));
									}
									else{
										tmpPage.putString(strTargetName,pg_aResult.getString(strSourceName));
									}
								}
								tmpPage.putString("pxInsHandle",pg_aResult.getString("pxInsHandle"));
							}
							if(bFirstRow && pgTmpRow != null)
								pgTmpRow.replace(tmpPage);
							else
								cpTargetPageList.add(tmpPage);

						}
					}
					if(pg_aResult.getString("pyRowSelected").equalsIgnoreCase("false")) {
						if(mRowKeys.size() > 0 && mRowKeys.containsKey(strKeyValue)){
							//remove from list
							String strRow  = mRowKeys.getString(strKeyValue);
							try {
								int nRow = Integer.parseInt(strRow);
								rowsToRemove.add(new Integer(nRow));
							}
							catch(NumberFormatException e){}
						}
					}
				}
				if(rowsToRemove != null && rowsToRemove.size() > 0) {
					java.util.Collections.sort(rowsToRemove);
					for(int nCnt = rowsToRemove.size()-1;nCnt>=0;nCnt--) {
						cpTargetPageList.remove(((Integer)rowsToRemove.get(nCnt)).intValue());
					}
				}

			}
		}//end of multiple pagelist
	}
	//Remove listview pages based on user input
	if(pg_lvselectparams != null) {
		String strRemovePages = pg_lvselectparams.getString(".pyRemovePages");

		if(strRemovePages.equalsIgnoreCase("all") || strRemovePages.equalsIgnoreCase("listview")) {
			ClipboardPage pgPrimaryPage = null;
			String strPrimaryPage  = pgCPList.getString(".pyName");
			if(strPrimaryPage != null && !strPrimaryPage.equals("")) {
				pgPrimaryPage = tools.findPage(strPrimaryPage);
			}
			if (pgPrimaryPage != null && (strRemovePages.equalsIgnoreCase("all") || strRemovePages.equalsIgnoreCase("listview"))) {
				pgPrimaryPage.removeFromClipboard();
			}
			if(strCopyTo.equalsIgnoreCase("PageList")) {
				if(strRemovePages.equalsIgnoreCase("all")) {
					if (pgCPList != null ) {
						pgCPList.removeFromClipboard();
					}
				}
			}
		}
	}


}
}
	theProperty.setValue(theValue);
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Edit-Input:HANDLESELECTIONS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("HANDLESELECTIONS","Rule-Edit-Input","",false,"","Pega-Reporting","08-01-01","RULE-EDIT-INPUT HANDLESELECTIONS #20180713T134052.631 GMT","HANDLESELECTIONS",true,false,"ABSOLUTE_CLASSLESS",-1267747746)
	};

	 /**
	 * This method returns the set of dependent rules required to build
	 * the generated code and (possibly) whole classes that the rules assembler declared.
	 * @return array of <code>DependentRuleInfo</code> objects.
	 */
	public DependentRuleInfo[] getDependentRuleInfos() {
		return oDependentRuleInfos;
	}


//	Rules used in this assembly (order and duplicates ARE significant to hash code) :
//	RULE-EDIT-INPUT HANDLESELECTIONS #20180713T134052.631 GMT:20180713T134052.631 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "8664fff52452c6cd75d3221788e2be73";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Input";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-EDIT-INPUT HANDLESELECTIONS #20180713T134052.631 GMT", "handleSelections", "Pega-Reporting", "08-01-01", "20180713T134052.631 GMT");
}
