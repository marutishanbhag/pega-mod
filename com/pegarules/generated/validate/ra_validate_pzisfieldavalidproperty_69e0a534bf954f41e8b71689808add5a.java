package com.pegarules.generated.validate;
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
public class ra_validate_pzisfieldavalidproperty_69e0a534bf954f41e8b71689808add5a  extends com.pega.pegarules.priv.AbstractFUASupport implements EditValidate, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Edit_Validate.pzIsFieldAValidProperty.Validate");
	public ra_validate_pzisfieldavalidproperty_69e0a534bf954f41e8b71689808add5a(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}
public boolean evaluate(ClipboardProperty theProperty) {
	boolean isEncryptedProperty = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertyEncrypted(theProperty, tools);
	String  theValue = theProperty.getStringValue();
	if(isEncryptedProperty) {
	theValue = tools.getPRCrypto().decryptPropertyValue(theValue);
	}
	char  itsType = theProperty.getType();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-EDIT-VALIDATE PZISFIELDAVALIDPROPERTY #20180713T134052.690 GMT	Pega-Reporting:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
String strProperty = tools.getStepPage().getString(".pyFilterName");

String  strPropOrig = strProperty;
String  strPropPageStripped = "";
ClipboardPage cp_TopLevelPage = null;
String prefix = "";
String prefixClassName = "" ;
boolean bFound = false, hasPrefix = false, isLinked = false;
ImmutablePropertyInfo propInfo = null;
/*GRP-39563*/
/*BUG-55403*/
tools.getStepPage().remove( "pzPropertyType");
ClipboardPage pgReportDefinition = null;
if(tools.getStepPage().getTopLevelPage().getIfPresent(".pzPageToDisplay") != null){
	pgReportDefinition = tools.findPage(tools.getStepPage().getTopLevelPage().getString("pzPageToDisplay")+".pyReportDefinition");
}else{
	pgReportDefinition = tools.getStepPage().getTopLevelPage();
}
/* Commenting Trend Validation
//Calls function validation
if(strProperty.startsWith("@@"))
{
	if(!tools.editValidate(tools.getStepPage().getProperty(".pyFilterName"),"pyValidateFunction"))
	{
		return false;
	}
	else
	{
		return true;
	}
}*/

if (strProperty.equals("") || strProperty.equals("*") ){
	return true;
}		

/* Check if the name of the property does not have the "." period in it.*/
if (strProperty.indexOf(".") == -1  ){
	return bFound;			
}

if (strProperty.indexOf(".") != 0){
	prefix=strProperty.substring(0 , strProperty.indexOf("."));
	strProperty = strProperty.substring(strProperty.indexOf("."));
        strPropPageStripped = strProperty;
	hasPrefix = true;
}
/*GRP-43953: Linked properties support*/
tools.getStepPage().remove(".pyRuntimeFilterNameProp");
String[] linked = pega_rulesengine_reportingutils.pzParseLinkProperty(strPropOrig,pgReportDefinition ,tools);
isLinked = linked[0] != null && linked[0].equalsIgnoreCase("true");
if(isLinked){
	String strReference = tools.getStepPage().getReference();
	if(strReference.contains("pyJoinInfo(")){
                //cannot be LHS of join filter
		return false;
	}
}

if (hasPrefix){
	/* Check if the class exists in Pages&Classes tab. If it exists then check if the property exists in that class */
	bFound = false;	
	ClipboardProperty pPagesAndClasses = null;
	ClipboardProperty pJoins = null;
	ClipboardProperty pIndexes = null;
	ClipboardProperty pAssociations = null;
	ClipboardProperty pSubreports = null;
	ClipboardPage cpPrimaryPage = null;

	if(tools.getStepPage().getTopLevelPage().getIfPresent(".pzPageToDisplay") != null){
		cpPrimaryPage = tools.findPage(tools.getStepPage().getTopLevelPage().getString("pzPageToDisplay")+".pyReportDefinition");
		pPagesAndClasses = tools.findPage(tools.getStepPage().getTopLevelPage().getString("pzPageToDisplay")).getProperty(".pyReportDefinition.pyPagesAndClasses");
		pJoins = tools.findPage(tools.getStepPage().getTopLevelPage().getString("pzPageToDisplay")).getProperty(".pyReportDefinition.pyUI.pySource.pyJoinInfo");
		pIndexes = tools.findPage(tools.getStepPage().getTopLevelPage().getString("pzPageToDisplay")).getProperty(".pyReportDefinition.pyUI.pySource.pyIndexInfo");
		pAssociations = tools.findPage(tools.getStepPage().getTopLevelPage().getString("pzPageToDisplay")).getProperty(".pyReportDefinition.pyUI.pySource.pyAssociations");
		pSubreports = tools.findPage(tools.getStepPage().getTopLevelPage().getString("pzPageToDisplay")).getProperty(".pyReportDefinition.pyUI.pySource.pySubReportInfo");
	}else{
		cpPrimaryPage = tools.getPrimaryPage();
		pPagesAndClasses = tools.getStepPage().getTopLevelPage().getProperty(".pyPagesAndClasses");
		pJoins = tools.getStepPage().getTopLevelPage().getProperty(".pyUI.pySource.pyJoinInfo");
		pIndexes = tools.getStepPage().getTopLevelPage().getProperty(".pyUI.pySource.pyIndexInfo");
		pAssociations = tools.getStepPage().getTopLevelPage().getProperty(".pyUI.pySource.pyAssociations");
		pSubreports = tools.getStepPage().getTopLevelPage().getProperty(".pyUI.pySource.pySubReportInfo");
	}
	
	
	java.util.Iterator itr_SubReports = pSubreports.iterator();
	while (itr_SubReports.hasNext()) 
	{
		ClipboardPage pgSubReport = ((ClipboardProperty ) itr_SubReports.next()).getPageValue();
		String strCurrentPrefix = pgSubReport.getString(".pyPrefix");
		String strCurrentClass = pgSubReport.getString(".pyClassName");
		if (strCurrentPrefix.equals(prefix) && pgSubReport.getBoolean(".pyUsageInfo(LHSFilter)"))
		{
			if (strProperty.startsWith(".")) 
				strProperty= strProperty.substring(1);
		
			ClipboardProperty cpCols = pgSubReport.getProperty(".pyColumns");
			java.util.Iterator itr_Cols = cpCols.iterator();
			while (itr_Cols.hasNext())
			{
				ClipboardPage pgCol = ((ClipboardProperty) itr_Cols.next()).getPageValue();
				String strAlias = pgCol.getString(".pyAlias");
				String fieldName = pgCol.getString(".pyFieldName");
				String fieldPrefix = pgCol.getString(".pyPrefix");


				if (strAlias.equals(strProperty))
				{
					/*BUG-55403: only case where we don't validate scalar, since already validated in SR*/
					/*BUG-69997: Do not check for unexposed for SR columns
					if(fieldPrefix.indexOf(".") < 1){
						if(!pega_rules_utilities.isDBColumn(strCurrentClass,fieldName)) {
							tools.getStepPage().putString("pzPropertyType","unexposed");
						}
					}else{
						//GRP-43953: Linked properties support
						//need to figure out if this is an unexposed property
						ClipboardPage pgTestMe = tools.createPage("Rule-Obj-Report-Definition",null);
						pgTestMe.putString(".pyClassName",strCurrentClass);
						linked = pega_rulesengine_reportingutils.pzParseLinkProperty(fieldName,pgTestMe ,tools);
						pgTestMe.removeFromClipboard();
						if(!pega_rules_utilities.isDBColumn(linked[2],linked[4])) {
	              					tools.getStepPage().putString("pzPropertyType","unexposed");
	          				}
					}
					*/
					bFound = true;
					return bFound;
				}			     
			}
			
				 
		}
		    
	}
	
	java.util.Iterator itr_params = pPagesAndClasses.iterator();
	while (itr_params.hasNext()) {
		ClipboardProperty cp_aPageAndClass = (ClipboardProperty ) itr_params.next();
		ClipboardPage pg_aParam = cp_aPageAndClass.getPageValue();
		String strPyPrefix = pg_aParam.getString(".pyPagesAndClassesPage");
		if (strPyPrefix.equals(prefix))
		{
			prefixClassName = pg_aParam.getString(".pyPagesAndClassesClass");
			
			
			//propInfo = tools.getDictionary().getImmutablePropertyInfo(prefixClassName, strProperty);
			propInfo = tools.getDictionary().getClassInfo(prefixClassName).getImmutableTerminalPropertyInfo(strProperty);
			if (strProperty.startsWith(".")) {
				strProperty= strProperty.substring(1);
			 }
  		    if (propInfo != null) {
				if (strProperty.indexOf("(") > -1) 
				    strProperty = strProperty.substring(0, strProperty.indexOf("("));
			
				int charPosition = strProperty.indexOf(".");
				if (charPosition > 0 ) 
					strProperty = strProperty.substring(0, charPosition);
			
				StringMap propPage = new HashStringMap();
				propPage.putString("pxObjClass", "Rule-Obj-Property");
				propPage.putString("pyPropertyName", strProperty);         
				propPage.putString("pyClassName", prefixClassName);
				try{
					RulesetContext rulesetContext = tools.getDatabase().getRulesetContext(cpPrimaryPage);
					if (rulesetContext.open(propPage) == null){
						bFound = false;
						return bFound;
					} 
					bFound = rulesetContext.getDictionary().validateReferenceWithCaseSensitivity(prefixClassName, strPropOrig);
					if (!bFound)
						return bFound;
					}catch(DatabaseException dbex) {
						return bFound;		
					}
			    bFound = true;
			    break;
			}
			else{
			    bFound = false;					 
			    return bFound;
			}
		}
	}
	if(bFound){
		if(pJoins.size() > 0 || pIndexes.size() > 0 || pAssociations.size() > 0){
			java.util.Iterator itr_Joins = pJoins.iterator();
			while (itr_Joins.hasNext()) {
				ClipboardProperty cp_Joins = (ClipboardProperty ) itr_Joins.next();
				ClipboardPage pg_Joins = cp_Joins.getPageValue();
				String strJoins = pg_Joins.getString(".pyPrefix");
				String strJoinsClass = pg_Joins.getString(".pyJoinClassName");
				if (strJoins.equals(prefix) && strJoinsClass.equals(prefixClassName))
				{
					/*BUG-55403*/
					if(!pega_rules_utilities.isDBColumn(strJoinsClass,strPropPageStripped)) {
						String[] arrUnexposedProp = new String[5];      
						arrUnexposedProp = pega_rulesengine_reportingutils.pzIsValidUnexposedScalarProperty(strPropOrig,pgReportDefinition,tools);
						if(arrUnexposedProp[0] != null && !arrUnexposedProp[0].equalsIgnoreCase("true")){
							return false;	
						}
						if(!strPropPageStripped.contains("pzRuleResolvedInsKey"))
						tools.getStepPage().putString("pzPropertyType","unexposed");
					}
					bFound = true;
					return !isLinked;
				}else{
					bFound = false;					 
				}
			}
			java.util.Iterator itr_Indexes = pIndexes.iterator();
			while (itr_Indexes.hasNext()) {
				ClipboardProperty cp_Indexes = (ClipboardProperty ) itr_Indexes.next();
				ClipboardPage pg_Indexes = cp_Indexes.getPageValue();
				String strIndex = pg_Indexes.getString(".pyPrefix");
				String strIndexClass = pg_Indexes.getString(".pyIndexClassName");
				if (strIndex.equals(prefix) && strIndexClass.equals(prefixClassName))
				{   
					bFound = true;
					return bFound;
				}else{
					bFound = false;					 
				}
			}
			java.util.Iterator itr_Associations = pAssociations.iterator();
			while (itr_Associations.hasNext()) {
				ClipboardProperty cp_Associations = (ClipboardProperty ) itr_Associations.next();
				ClipboardPage pg_Associations = cp_Associations.getPageValue();
				String strPurpose = pg_Associations.getString(".pyPurpose");
				String strAssociatedClass = pg_Associations.getString(".pyAssociatedClass");
				if (strPurpose.equals(prefix) && strAssociatedClass.equals(prefixClassName))
				{   

					/*BUG-55403*/
					if(!pega_rules_utilities.isDBColumn(strAssociatedClass,strPropPageStripped)) {
						String[] arrUnexposedProp = new String[5];      
						arrUnexposedProp = pega_rulesengine_reportingutils.pzIsValidUnexposedScalarProperty(strPropOrig,pgReportDefinition,tools);
						if(arrUnexposedProp[0] != null && !arrUnexposedProp[0].equalsIgnoreCase("true")){
							return false;	
						}
						if(!strPropPageStripped.contains("pzRuleResolvedInsKey"))
						tools.getStepPage().putString("pzPropertyType","unexposed");
					}
					bFound = true;
					return !isLinked;
				}else{
					bFound = false;					 
				}
			}
		} else{
			bFound = false;					 
			return bFound;
		}
	}
	if(!bFound){
		return bFound;
	}
} else{
	if(isLinked){
		if(!pega_rules_utilities.isDBColumn(linked[2],linked[4])) {
		if(!linked[4].contains("pzRuleResolvedInsKey"))
			tools.getStepPage().putString("pzPropertyType","unexposed");
		}
		return true;
	}
	 bFound = false;
	 ClipboardPage cpPrimaryPage = null;
	 ClipboardPage pgTopReportDefinition = null;
	if (!strProperty.equals("") && !strProperty.equals("*") )
	{
		if(tools.getStepPage().getTopLevelPage().getIfPresent(".pzPageToDisplay") != null)
		{
			cpPrimaryPage = tools.findPage(tools.getStepPage().getTopLevelPage().getString("pzPageToDisplay")+".pyReportDefinition");
			
			cp_TopLevelPage = tools.findPage(tools.getStepPage().getTopLevelPage().getString("pzPageToDisplay")).getProperty(".pyReportDefinition").getPageValue();	
			
                           if(!cp_TopLevelPage.getString(".pyRuleName").equals("pyDefaultReport"))	         
                                   pgTopReportDefinition = cp_TopLevelPage;
                           else
                                pgTopReportDefinition = tools.getStepPage().getTopLevelPage().getProperty(".pyReportDefinition").getPageValue();   
		}
		else
		{
			cpPrimaryPage = tools.getPrimaryPage();
			cp_TopLevelPage = tools.getStepPage().getTopLevelPage();
			pgTopReportDefinition = cp_TopLevelPage;
		}
		String[] arrTemp = pega_wb_reportcontentbuilder.getClassNameAndPropertyName(cp_TopLevelPage, strProperty);

				
				
		if(!arrTemp[0].equals("")){
			if (strProperty.indexOf("(") > -1) 
				    strProperty = strProperty.substring(0, strProperty.indexOf("("));
			
			
			if (strProperty.indexOf(".") == 0  ){
				strProperty = strProperty.substring(1);
			}
			
			int charPosition = strProperty.indexOf(".");
			if (charPosition > 0 ) 
				strProperty = strProperty.substring(0, charPosition);
  

				
			StringMap propPage = new HashStringMap();
			propPage.putString("pxObjClass", "Rule-Obj-Property");
			propPage.putString("pyPropertyName", strProperty);         
			propPage.putString("pyClassName", cp_TopLevelPage.getString("pyClassName"));
			try
			{
				RulesetContext rulesetContext = tools.getDatabase().getRulesetContext(pgTopReportDefinition); 
				
				if (rulesetContext.open(propPage) == null)
				{
					bFound = false;
					return bFound;
				} 
				bFound = rulesetContext.getDictionary().validateReferenceWithCaseSensitivity(cp_TopLevelPage.getString("pyClassName"), strPropOrig);
				if (!bFound)
					return bFound;
			}
			catch(DatabaseException dbex) 
			{
				return bFound;		
			}
			
			bFound = true;
		}
	}
}

String strReportClassName = cp_TopLevelPage.getString("pyClassName");

if(!pega_rules_utilities.isDBColumn(strReportClassName,strPropOrig)) {
	/*GRP-39563*/
	String[] arrUnexposedProp = new String[5];      
	arrUnexposedProp = pega_rulesengine_reportingutils.pzIsValidUnexposedScalarProperty(strPropOrig,pgReportDefinition,tools);
	if(arrUnexposedProp[0] != null && !arrUnexposedProp[0].equalsIgnoreCase("true")){
		return false;	
	}
	if(!strPropOrig.contains("pzRuleResolvedInsKey"))
         tools.getStepPage().putString("pzPropertyType","unexposed");
}
return bFound;
}
	} catch (java.lang.SecurityException se) {
		throw se;
	}
	 catch (Throwable aThrown) {
		throw new IndeterminateConditionalException(aThrown);
	}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Edit-Validate:PZISFIELDAVALIDPROPERTY"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZISFIELDAVALIDPROPERTY","Rule-Edit-Validate","",false,"","Pega-Reporting","08-01-01","RULE-EDIT-VALIDATE PZISFIELDAVALIDPROPERTY #20180713T134052.690 GMT","PZISFIELDAVALIDPROPERTY",true,false,"ABSOLUTE_CLASSLESS",434007557)
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
//	RULE-EDIT-VALIDATE PZISFIELDAVALIDPROPERTY #20180713T134052.690 GMT:20180713T134052.690 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e3a4ccec42e8f5e0dab73fed6fbf98c3";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Validate";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-EDIT-VALIDATE PZISFIELDAVALIDPROPERTY #20180713T134052.690 GMT", "pzIsFieldAValidProperty", "Pega-Reporting", "08-01-01", "20180713T134052.690 GMT");
}
