package com.pegarules.generated.activity;
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
import Pega.*;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.*;
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
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class ra_action_pzgetgridcoluniquevalues_2cd1e46fce7ff991fc5f20d7d5c95e8d extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzGetGridColUniqueValues._baseclass.Action");
	public ra_action_pzgetgridcoluniquevalues_2cd1e46fce7ff991fc5f20d7d5c95e8d(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT	Pega-UIEngine:08-23-02	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_circum0");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_1 = strPLParentPage;
thisStepPage = tools.findPage(pz_1, true);
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_2 = strUniqueValuesPage;
thisStepPage = tools.findPage(pz_2, true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_5 = strUniqueValuesPage;
thisStepPage = tools.findPage(pz_5, true);
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_6 = strUniqueValuesPage;
thisStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_8 = strUniqueValuesPage;
thisStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} 
} catch (ActivityTerminateException ate) {
throw ate; // Terminate all activity processing
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (PRRuntimeException prre) {
if (!pz_methodStatusUpdated) {pega.setThreadPropertyValue(".pxMethodStatus", prre.toString());}
pega.activityStepExceptionHandler(prre, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw prre;
} catch (RuntimeException re) {
pega.setThreadPropertyValue(".pxMethodStatus", re.toString());
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pega.activityEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo);}
}
} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

	public boolean isAllowedInWeb() {
	 return isAllowedInWeb;
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:PZGETGRIDCOLUNIQUEVALUES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETGRIDCOLUNIQUEVALUES","Rule-Obj-Activity","@BASECLASS",false,"","Pega-UIEngine","08-23-02","RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT","!PZGETGRIDCOLUNIQUEVALUES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",321510326)
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
//	RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT:20231013T155310.720 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "36bc00dccd7067d9e709d70cd6930388";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Action";
}
/**
 * Update the step page to point to data source's parent page.
 * <p>
 * Step 1 <code>java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
String pageName = myStepPage.getName();
// Get the base reference
String strBaseRef = tools.getParamValue("BaseReference");
String strPageListProperty = tools.getParamValue("PageListProperty");
if(strPageListProperty.startsWith(".") && !strBaseRef.equals("")){
	if(strBaseRef.startsWith(".")){
		pageName = myStepPage.getName() + strBaseRef;
	}else {
		pageName =strBaseRef;
		tools.putParamValue("pzUsingTopLevelPage","true");
	}
}
if(pageName!= null && pageName.equals(""))
	pageName = myStepPage.getReference();

strPLParentPage = pageName;
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Clear grid applied filters.
 * <p>
 * Step 2 <code>java</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
String strColumnName = tools.getParamValue("pyColumnName");

if(!tools.getParamValue("pyReportPageName").equals(""))
{
      ClipboardPage pg_RDPage = tools.findPage(tools.getParamValue("pyReportPageName"));
        if(pg_RDPage != null) {
        ClipboardPage pyUIFiltersPage = pg_RDPage.getPage(".pyUI.pyBody.pyUIFilters");
        if(pyUIFiltersPage != null){
            pega_reporting_reportdata.pzClearGridAppliedFilters(strColumnName, pyUIFiltersPage);
        }
}
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Obtain unique  values of a column in a Page List/Group.
 * <p>
 * Step 3 <code>java</code> [on page local.strPLParentPage] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
/*Get the parameter values into variables*/ 
String strPageListProperty = tools.getParamValue("PageListProperty");
String strColumnName = tools.getParamValue("pyColumnName");
String isReportDef = tools.getParamValue("isReportDef");	
String bLoadActivity = tools.getParamValue("bLoadActivity");
String subScriptForColumn = strColumnName;

if(!subScriptForColumn.startsWith(".")){
	subScriptForColumn = subScriptForColumn.replaceFirst("\\.","_");
}else{
	subScriptForColumn = subScriptForColumn.replaceFirst("\\.","");
}
if(isReportDef.equals("true") && subScriptForColumn.startsWith("@@")) {
	subScriptForColumn = subScriptForColumn.replaceFirst("\\@@","");
	subScriptForColumn = subScriptForColumn.replaceAll("\\,","_").replaceAll("\"","").replaceAll("[^a-zA-Z0-9]+","_");
}
subScriptForColumn = subScriptForColumn.replaceAll("\\(","").replaceAll("\\)","").replaceAll("\\.","");
String strColumnIndex = tools.getParamValue("columnIndex");
subScriptForColumn = subScriptForColumn + strColumnIndex;
tools.putParamValue("columnSubscript",subScriptForColumn);
tools.putParamValue("subScriptForColumn",(((strColumnName.indexOf("\"")>-1)?((strColumnName.startsWith("."))?strColumnName.substring(1).replaceAll("\"",""):strColumnName.replaceAll("\"","")):((strColumnName.startsWith("."))?strColumnName.substring(1):strColumnName))+strColumnIndex));
String strGridFilterCritPage = tools.getParamValue("pyGridFilterCriteriaPage");
String strPageClass = tools.getParamValue("ClassName");
String sortProp = tools.getParamValue("sortProperty");
String pyShowFilterUIBy = tools.getParamValue("pyShowFilterUIBy");
String pyRangeFiltering = tools.getParamValue("pyRangeFiltering");
String bRangeFilterByFormat = tools.getParamValue("bRangeFilterByFormat");
sortType = sortProp.equals(strColumnName)?tools.getParamValue("sortType"):"ASC";
String dataSource = "";
java.util.Map  uniqueValuesMap = new java.util.HashMap();
java.util.Map  uniqueValuesMapFromFn = new java.util.HashMap();
Iterator it = null;
String propValue = new String();
ClipboardProperty cp_embeddedPage = null;
HashStringMap keys = new HashStringMap();
if("".equals(strColumnName) || "".equals(strGridFilterCritPage)|| "".equals(strPageListProperty)|| "".equals(strPageClass)){
	doExit = "true";
	return false;
}
ClipboardProperty cp_filterPageList = null;
String strColumnType = "";
char columnType = '\u0000';
String strColumnAlias = "";
if(isReportDef.equals("true") && !bLoadActivity.equals("true") ) {
	ClipboardPage pg_RDPage = tools.findPage(tools.getParamValue("pgRepContPage"));
	if(pg_RDPage!=null) {
		ClipboardProperty cp_pyListFields = pg_RDPage.getProperty(".pyReportDefinition.pyUI.pyBody.pyUIFields");
		Iterator iter = cp_pyListFields.iterator();
		Boolean isFieldInRD = false;
		while(iter.hasNext()) {
			ClipboardProperty cp_pyListField =(ClipboardProperty)iter.next();
			ClipboardPage pg_pyListField = cp_pyListField.getPageValue();
			String strFieldName = pg_pyListField.getString("pyFieldName");
            /* BUG-324612: (HFix-37031) In case of funtion alias call in RD bound grid, set the pyColumnName to pyFieldName */
            if(strColumnName.startsWith("@@") && pg_pyListField.getString("pyFieldName").replaceAll("\"","").equals(strColumnName)){
                strColumnName = pg_pyListField.getString("pyFieldName");
                tools.putParamValue("pyColumnName",strColumnName);
            }

			String strRangeColName = strColumnName;
			if(!"".equals(pyRangeFiltering) && "format".equals(pyShowFilterUIBy)){
				strRangeColName = pyRangeFiltering;
			}
			if(strFieldName.equals(strRangeColName)) {
				isFieldInRD = true; 
                                //BUG-164788 - start
				//strColumnType = pg_pyListField.getString("pyDataType");
                                strColumnType = com.pegarules.generated.pega_reporting_reportdata.pzGetDataTypeFieldValue(pg_pyListField.getString(".pyDataType"));
                                //BUG-164788 - end
				strColumnType = strColumnType.replaceAll("\\s","");
				if(strColumnType.equals("integer")) {
					strColumnType = "Integer";
				}else if(strColumnType.equals("TrueFalse")) {
					tools.putParamValue("pyColumnActDataType","TrueFalse");
				}
				strColumnAlias = pg_pyListField.getString("pxColumnAlias");
				break;
			}
		}
		if(!isFieldInRD){
			if(!"".equals(pyRangeFiltering) && "format".equals(pyShowFilterUIBy) ){
				ImmutablePropertyInfo columnInfo = tools.getDictionary().getImmutablePropertyInfo(strPageClass,pyRangeFiltering );
                /* BUG-284622: Adding a null check for columnInfo */
                if(null != columnInfo)
                {
                  columnType = columnInfo.getType();
                }else{
                  columnType = PropertyInfo.TYPE_TEXT;
                }
				switch(columnType) {
					case PropertyInfo.TYPE_DATE :  
						strColumnType = "Date"; break;
					case PropertyInfo.TYPE_DATETIME :
						strColumnType = "DateTime"; break;
					case PropertyInfo.TYPE_INTEGER :
						strColumnType = "Integer"; break;
					case PropertyInfo.TYPE_DOUBLE :
						strColumnType = "Double"; break;
					case PropertyInfo.TYPE_DECIMAL :
						strColumnType = "Decimal"; break;
					default:
						strColumnType = "Text"; break;
				}
			}
	    }
	}
	if(strColumnType.equalsIgnoreCase("Date")) {
		columnType = PropertyInfo.TYPE_DATE;
	}else if(strColumnType.equalsIgnoreCase("DateTime")) {
		columnType = PropertyInfo.TYPE_DATETIME;
	}else if(strColumnType.equalsIgnoreCase("Integer")) {
		columnType = PropertyInfo.TYPE_INTEGER;
	}else if(strColumnType.equalsIgnoreCase("Double")) {
		columnType = PropertyInfo.TYPE_DOUBLE;
	}else if(strColumnType.equalsIgnoreCase("Decimal")) {
		columnType = PropertyInfo.TYPE_DECIMAL;
	}else {
        /*BUG-205780 : TimeOfDay dataType should be treated as a text but search should not be displayed as     
           RetrieveReportData doesn't handle TimeOfDay datatype*/
        if(strColumnType.equalsIgnoreCase("TimeOfDay")) {
		    tools.putParamValue("pyIsTimeOfDay","true");
        }
		columnType = PropertyInfo.TYPE_TEXT;
		strColumnType = "Text";
	}

}else {
	/*Retrieve the column's type*/
	ImmutablePropertyInfo columnInfo = null;
	if(!"".equals(pyRangeFiltering) && "format".equals(pyShowFilterUIBy))
	{
		columnInfo = tools.getDictionary().getImmutablePropertyInfo(strPageClass,pyRangeFiltering );
	}else {
		/* 
		 * BUG-145647 : If the column name is of format somePageName.somePropName, then we have 
		 * to get property info of the somePropName using the somePageName's class instead of 
		 * the pagelist property class.
		 */
		if(strColumnName.replaceFirst("\\.","").indexOf(".") > -1){
			int lastIndex = strColumnName.lastIndexOf(".");
			String embeddedPage = strColumnName.substring(0,lastIndex);
			/*BUG-159703: 'embeddedProp' from strColumnName.*/
			String embeddedProp = strColumnName.substring(lastIndex,strColumnName.length());
			String embeddedPageClass = tools.getDictionary().getClassName(strPageClass,embeddedPage);
			/* BUG-157702: Determine class of page group of different class embedded in the page */
			if("".equals(embeddedPageClass)) {
				ClipboardProperty cp_pageListProp = myStepPage.getProperty(strPageListProperty);
				if(cp_pageListProp.size() > 0) {
					ClipboardProperty prop = tools.getProperty(cp_pageListProp.getReference() + "(1)" + embeddedPage);
					embeddedPageClass = prop.getStringValue("pxObjClass");
				}
			}
			/* Falling back to @baseclass if the class is still not determined */
			if("".equals(embeddedPageClass)) {
				embeddedPageClass = "@baseclass";
			}
			/*BUG-159703: Pass 'embeddedProp' as second param.  This change is needed to handle the case of column property specified as ".pyExpression.pyExpression" where in ".pyExpression" is a page and the ".pyExpression" is the property in it.*/
			columnInfo = tools.getDictionary().getImmutablePropertyInfo(embeddedPageClass, embeddedProp);
		}
		else{
			columnInfo = tools.getDictionary().getImmutablePropertyInfo(strPageClass, strColumnName);
		}
	}
  
    if(null != columnInfo)
    {
      columnType = columnInfo.getType();
    }else{
      columnType = PropertyInfo.TYPE_TEXT;
    }
	
	switch(columnType) {
		case PropertyInfo.TYPE_DATE :  
			strColumnType = "Date"; break;
		case PropertyInfo.TYPE_DATETIME :
			strColumnType = "DateTime"; break;
		case PropertyInfo.TYPE_INTEGER :
			strColumnType = "Integer"; break;
		case PropertyInfo.TYPE_DOUBLE :
			strColumnType = "Double"; break;
		case PropertyInfo.TYPE_DECIMAL :
			strColumnType = "Decimal"; break;
      	case PropertyInfo.TYPE_TRUEFALSE :
      		tools.putParamValue("pyColumnActDataType","TrueFalse");
			strColumnType = "Text"; break;
      	default:
			strColumnType = "Text"; break;
	}
}

/*Find the top level page of Grid Filter criteria*/
ClipboardPage pg_gridFilterCriteria = tools.findPage(strGridFilterCritPage, true);
if (pg_gridFilterCriteria==null) {
	pg_gridFilterCriteria = tools.createPage("Pega-GridFilterCriteria", strGridFilterCritPage);
}
ClipboardPage pg_columnFilterCriteria = tools.createPage("Pega-ColumnFilterCriteria", "");
java.util.Map fieldsMap = null;
String uniqueColPageClass = "";

switch(columnType) {
	case PropertyInfo.TYPE_DATETIME :
		uniqueColPageClass = "Pega-ColumnFilterCriteria-UniqueValues-DateTime";
		break;
	case PropertyInfo.TYPE_DATE :
		uniqueColPageClass = "Pega-ColumnFilterCriteria-UniqueValues-Date";
		break;
	case PropertyInfo.TYPE_INTEGER :
		uniqueColPageClass = "Pega-ColumnFilterCriteria-UniqueValues-Integer";
		break;
	case PropertyInfo.TYPE_DOUBLE :
		uniqueColPageClass = "Pega-ColumnFilterCriteria-UniqueValues-Double";
		break;
	case PropertyInfo.TYPE_DECIMAL :
		uniqueColPageClass = "Pega-ColumnFilterCriteria-UniqueValues-Decimal";
		break;
	default: //Text
		uniqueColPageClass = "Pega-ColumnFilterCriteria-UniqueValues-Text";
		break;
}

if(tools.getParamValue("filterType").equals("true") || tools.getParamValue("filterType").equals("list")) {
	String pyPaginateActivity = tools.getParamValue("pyPaginateActivity");
	String propRef = "";
	ClipboardPage pyReportParamPageName = null;
	ClipboardPage tempDummy2 = null;
	ClipboardPage pgRepContPageWithResults = null;
	ClipboardPage contentPage = null;
	if(isReportDef.equals("true") && !bLoadActivity.equals("true")) {
		dataSource = tools.getParamValue("RDName");
		String pgRepContPage = tools.getParamValue("pgRepContPage");
		/*US-65665*/
		pgRepContPage=pgRepContPage.replace(".","__1_");
		String pgRepUniqValuesContPage = pgRepContPage + "UniqValues";
		String className = tools.getParamValue("RDAppliesToClass");
		
		String existingParamPg = "paramPage";
	    if(pgRepContPage.indexOf("pgRepPg") > -1){
		   existingParamPg+= pgRepContPage.substring(7); // extracting the unique sectionid for uniqueness of the param page name
	    }else {
		   existingParamPg+= pgRepContPage; 
	    }
		String paramPg =pgRepContPage + "_Param_Uniq_Values"  ; //this page must be uniquely identified by using section id and layoutid
        pgRepContPage=pgRepContPage.replace("__1_",".");
		pyReportParamPageName  = tools.createPage("Embed-QueryInputs", paramPg); // create a input param page to pass to pxRetrieveReportData
		
        //BUG-224873
		ClipboardPage pg_RDPage = tools.findPage(tools.getParamValue("pgRepContPage"));
		/*Copy pyUnionNotApplied from parentPage to drilldown page*/
		if(null != pg_RDPage){
		    String pyUnionNotApplied = pg_RDPage.getString(".pyReportDefinition.pyContent.pyUnionNotApplied");
            pyReportParamPageName.putString(".pyUnionNotApplied", pyUnionNotApplied);
		}
      
		ClipboardPage pyReportExistingParamPageName = tools.findPage(existingParamPg,true);
		if (null != pyReportExistingParamPageName) {
              ClipboardProperty pyAppliedFilter = pyReportExistingParamPageName.getProperty(".pyFilterSettings.pyFilter");
              if (null != pyAppliedFilter) {
                   pyReportParamPageName.getProperty(".pyFilterSettings").setValue(pyReportExistingParamPageName.getProperty(".pyFilterSettings"));
                   ClipboardProperty pyFilters = pyReportParamPageName.getProperty(".pyFilterSettings.pyFilter");
                   String pyColumnName = tools.getParamValue("pyColumnName");
                   Iterator itr = pyFilters.iterator();
                   while (itr.hasNext()) {
                        ClipboardProperty filterProp = (ClipboardProperty) itr.next();
                        String filterName = filterProp.getStringValue(".pyFilterName");
                        if (filterName.equals(pyColumnName)) {
                             filterProp.removeFromClipboard();
                         }
                    }
               }
          }
        pyReportParamPageName.getProperty("pyFilterSettings").getProperty("pyCascadingFilters").setValue("true");
	    String pyRowVisibleWhenCondition = pg_gridFilterCriteria.getString("pyRowVisibleWhenCondition");
		pyReportParamPageName.getProperty("pyFilterSettings").getProperty("pyRetainUnusedJoins").setValue("true");
		if (StringUtils.isBlank(pyRowVisibleWhenCondition)) {	
            ClipboardPage listField = tools.createPage("Embed-ReportListFields", ""); 
            if(strColumnAlias.equals("")) { 
                listField.getProperty("pyFieldName").setValue(strColumnName);
            }else {
                listField.getProperty("pyFieldName").setValue(strColumnAlias);
            }
            listField.putString("pySortType",sortType);
            listField.putString("pySortOrder","1");
            pyReportParamPageName.getProperty("pyListFields").add(listField);
            /* BUG-159724: Based on discussion, setting max records fetched for unique value calculation to 10000. */
            pyReportParamPageName.getProperty("pyMaxRecords ").setValue("10000"); //TODO: determine what is the maximum number of records that can be displayed in unique values grid.
            pyReportParamPageName.getProperty("pyListFieldsGetMode").setValue("onlylisted");
            pyReportParamPageName.getProperty("pyFilterSettings").getProperty("pyGetDistinctRows").setValue("true");
        }
        
        
		/*Pass the RD Params here*/
		String rdParamList = StringUtils.crossScriptingFilter(tools.getParamValue("RDParamsList"));
		String strBaseRef = tools.getParamValue("BaseReference");
		String[] rdparmArray = rdParamList.split(",");
		String rdParamPrefix = "";
		rdParamPrefix = tools.getParamValue("gridLayoutID"); //store the sectionID in variable to prefix for the RD params
		for (int i=0;i<rdparmArray.length;i++){
			String item = rdparmArray[i];
			// SE-62996 - changed next line to use reversibleCrossScriptingFilter so filters can contain special characters (ex: S&P)
			String paramValue =  StringUtils.reversibleCrossScriptingFilter(tools.getParamValue(rdParamPrefix+item));
			int dotIndex = paramValue.indexOf(".");
			if(dotIndex != -1) {
                 boolean isLiteralDecimalorDateTime= false;
				 if(dotIndex == 0) {
                 try{
                          Integer.parseInt(paramValue.substring(1,2)); 
                           isLiteralDecimalorDateTime = true;
                       }
                     catch(Exception ex){
                     }
                   } else {
                              //check to see if the paramvalue starts with an integer
                        try{              
                                               Integer.parseInt(paramValue.substring(0,1)); 
                                               isLiteralDecimalorDateTime = true;
                               }catch (Exception ex) {
                              }
                    }  
			
              if(!isLiteralDecimalorDateTime ){
                /*BUG-740100 Port of BUG-596805*/
                paramValue = StringUtils.restoreFilteredString(paramValue);
				        /*in case of param*/
				        if(paramValue.substring(0,dotIndex).trim().equalsIgnoreCase("param")) {
					       paramValue = StringUtils.crossScriptingFilter(tools.getParamValue(paramValue.substring(dotIndex+1).trim()));
				        } else {
					
					/*in case of property reference*/
					//unescape it for property references
					paramValue = (String)org.apache.commons.lang.StringEscapeUtils.unescapeHtml(paramValue);
					
					if(paramValue.startsWith(".")) {
						if(strBaseRef.startsWith(".")) {
							paramValue = myStepPage.getProperty(strBaseRef+paramValue).getStringValue();
						}else {
							paramValue = tools.getProperty(strBaseRef+paramValue).getStringValue();
						}
					}else {
						paramValue = tools.getProperty(paramValue).getStringValue();
					}
				}
			}
                      }
			if(!"".equals(item.trim())) {
        // SE-62996 added next line to revert the cross scripting filter so filters can contain special characters (ex: S&P)
        paramValue = StringUtils.restoreFilteredString(paramValue);
        /*BUG-234926 - HFIX-26021-replace &quot; to " before calling pxRetrieveReportData to get correct report  */
        paramValue = paramValue.replaceAll("&quot;", "\"");
				tools.putParamValue(item,paramValue);
			}
		}
		tools.putParamValue("pyReportName",dataSource);
		tools.putParamValue("pyReportClass",className);
		tools.putParamValue("pyReportParamPageName",paramPg);
		tools.putParamValue("pyPageName",pgRepUniqValuesContPage);		
		
		tempDummy2 = tools.createPage("@baseclass", "tempdummy2"); // dummy page to invoke pxRetrieveReportData
		keys.put("pxObjClass","Rule-Obj-Activity");
		keys.put("pyClassName","Rule-Obj-Report-Definition");
		keys.put("pyActivityName","pxRetrieveReportData");
		tools.doActivity(keys,tempDummy2 ,null);
		pgRepContPageWithResults = tools.findPage(pgRepUniqValuesContPage);
		tools.putParamValue("totalRecords",pgRepContPageWithResults.getProperty("pxTotalResultCount").getStringValue());
		it = pgRepContPageWithResults.getProperty("pxResults").iterator();
		propRef = strColumnName;
		int dotIndex = strColumnName.indexOf(".");
		fieldsMap = new HashStringMap();
        /*BUG-211456 : fields map is build from pgRepContPage instead of pgRepUniqValuesContPage which gives wrong functions map. Changing it to pgRepUniqValuesContPage*/
		fieldsMap = pega_uiengine_uiengine.pzGetRDFunctionsMap(tools.findPage(pgRepUniqValuesContPage));
		if(strColumnName.startsWith("@")){
			propRef = (String)fieldsMap.get(strColumnName.replaceAll("\"", ""));
		}else {
			propRef = (String)fieldsMap.get(strColumnName);
		}	
	} else if(!pyPaginateActivity.equals("") && tools.getParamValue("pyFilterHandled").equals("true") && !bLoadActivity.equals("true")) {
		//TODO: need to add isReadOnly, BaseReference and DISTINCT to signature of advanced activity.
		//TODO: Also pyPaginateActivity can be renamed appropriately
		String tempContPageName = "pyTemp"+strGridFilterCritPage;
		contentPage = tools.createPage("Code-Pega-List",tempContPageName);
		ClipboardProperty tempPageList = tools.findPage(tempContPageName).getProperty("pxResults");
		tools.putParamValue("PageListProperty",tempPageList.getReference()); 
		keys.put("pxObjClass","Rule-Obj-Activity");
		keys.put("pyActivityName",pyPaginateActivity);
		tools.putParamValue("pyGetDistinctRows","true");
		tools.putParamValue("pyDistincRowsContentPg", tempContPageName);
		tools.doActivity(keys,myStepPage,null);
		
		cp_filterPageList = contentPage.getProperty("pxResults");
		
		/*Iterate through the page list and add the column values to a Set to get unique values */
		it = cp_filterPageList.iterator();
	} else {
		/*Iterate through the page list and add the column values to a Set to get unique values */
		cp_filterPageList = myStepPage.getProperty(strPageListProperty);
		if(cp_filterPageList == null){
			 doExit = "true";
			 return false;  // added a null check to avoid NPE when the grid is empty
		}
		it = cp_filterPageList.iterator();		
	}
    /* BUG-247087: check controls that need to retain their format. */
    boolean bRetainControlFormat = false;
	if(strColumnType.equals("Date") || strColumnType.equals("DateTime") || strColumnType.equals("Text") || strColumnType.equals("Decimal") || strColumnType.equals("Integer") || strColumnType.equals("Double")){
		tools.putParamValue("bRetainControlFormat", "true");
		bRetainControlFormat = true;
	}else{
		tools.putParamValue("bRetainControlFormat", "false");
	}	
	StringMap keys2 = null;
	ClipboardProperty cp_pyUniqueValues = null;
	ClipboardPage uniqueColPg = null;
	cp_pyUniqueValues = pg_columnFilterCriteria.getProperty("pyUniqueValues");
  /*Add already selected filter values */
Iterator itFilter = null;
int j = 1;
ClipboardProperty cp_selected = pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").getPageValue(subScriptForColumn).getProperty("pyUniqueValues");
if (cp_selected != null && cp_selected.size() > 0) {
    itFilter = cp_selected.iterator();
    boolean bFilterSelected = false;
    ClipboardPage pg_filter_embeddedPage = null;
    while (itFilter.hasNext()) {
        ClipboardProperty cp_filter_embeddedPage = (ClipboardProperty) itFilter.next();
        pg_filter_embeddedPage = cp_filter_embeddedPage.getPageValue();
        bFilterSelected = pg_filter_embeddedPage.getBoolean("pySelected");
        if (bFilterSelected) {
            cp_pyUniqueValues.add(cp_filter_embeddedPage.getPageValue());
		    /* BUG-281383 - Calling StringEscapeUtils.unescapeHtml */
            uniqueValuesMap.put((Object) (String)org.apache.commons.lang.StringEscapeUtils.unescapeHtml(pg_filter_embeddedPage.getString("pyUILabel")), new Integer(j));
            j++;
        }
    }
}
/*Add already selected filter values*/
	pg_columnFilterCriteria.getProperty("IsReportDef").setValue(isReportDef);
	tools.putParamValue("tempSectionReadOnly","SectionReadOnly");
	keys2 = new HashStringMap();
	keys2.putString("pxObjClass", "Rule-HTML-Section");
	keys2.putString("pyStreamName",tools.getParamValue("sectionName"));
	keys2.putString("pyClassName", tools.getParamValue("sectionClass"));
	if (isReportDef.equals("true")) {
		if(bLoadActivity.equals("true")){
		String pgRepContPage = tools.getParamValue("pgRepContPage");
		/*US-65665*/
		pgRepContPage=pgRepContPage.replace(".","__1_");
		//String pgRepUniqValuesContPage = pgRepContPage + "UniqValues";
		fieldsMap = pega_uiengine_uiengine.pzGetRDFunctionsMap(tools.findPage(pgRepContPage));
		}
		tools.getParameterPage().put("currentFunctionsMap", fieldsMap);
	}
	int i=uniqueValuesMap.size()+1;
         

                   //US-52830 - Start
                   tools.putParamValue("optimizeFilter","true");
                   //US-52830 - end
/*US-69819*/
tools.putParamValue("populateSelectedUIValues", "true");
uniqueValuesMapFromFn=pega_uiengine_uiengine.pzPopulateSelectedValues(pg_gridFilterCriteria);
uniqueValuesMapFromFn.remove(subScriptForColumn);
pg_gridFilterCriteria.putObject("uniqueValuesMapFromFn",uniqueValuesMapFromFn);
tools.putParamValue("partialTriggerOld",tools.getParamValue("partialTrigger"));	
tools.putParamValue("subScriptForColumnOld",tools.getParamValue("subScriptForColumn"));	

StringMap keys3 = new HashStringMap();	
	keys3.putString("pxObjClass", "Rule-Obj-HTML");
	keys3.putString("pyStreamName","pzCheckAlreadyFiltered");
	keys3.putString("pyClassName", "@baseclass");
/*US-69819*/
  if(null != it){
	while(it.hasNext()) {
		cp_embeddedPage = (ClipboardProperty)it.next();

/*US-69819*/
    String  isValid=tools.getStream(keys3, cp_embeddedPage .getPageValue());
                 isValid=isValid.trim();
                 if(isValid.equals("false")){
		               continue;
                  }

tools.putParamValue("partialTrigger",tools.getParamValue("partialTriggerOld"));
tools.putParamValue("subScriptForColumn",tools.getParamValue("subScriptForColumnOld"));
/*US-69819*/

		String propForRDPL = ""; /*common string for RD and PL*/
		String pageRef = "";
		String updatedPropRef = "";
		if(isReportDef.equals("true") && !bLoadActivity.equals("true") ){
			propValue = cp_embeddedPage.getStringValue(propRef);
			updatedPropRef = propRef;
			if(propRef.lastIndexOf('.') != -1){
				updatedPropRef = propRef.substring(propRef.lastIndexOf('.')+1);
				pageRef = propRef.substring(0,propRef.lastIndexOf('.'));
				if(!".".equals(pageRef))
					strPageClass = cp_embeddedPage.getStringValue(pageRef+".pxObjClass");
			}
			propForRDPL = updatedPropRef;
			
		}else{
			propValue = cp_embeddedPage.getStringValue(strColumnName);
			propForRDPL = strColumnName;
			updatedPropRef = strColumnName;
			if(strColumnName.lastIndexOf('.') != -1){
				updatedPropRef = propForRDPL.substring(propForRDPL.lastIndexOf('.')+1);
				pageRef = propForRDPL.substring(0,propForRDPL.lastIndexOf('.'));
				if(!".".equals(pageRef))
					strPageClass = cp_embeddedPage.getStringValue(pageRef+".pxObjClass");
			}
			propForRDPL = updatedPropRef;
			
		}
		tools.putParamValue("SectionReadOnly","-1");
		tools.putParamValue("partialRefresh","true");
		tools.getParameterPage().put("currentRowPage", cp_embeddedPage);

       /* BUG-247087: Consider the value of pyShowFilterUIBy while also allowing certain controls to maintain their format */
		boolean IsFilterUIByValue = false;
		String propUIValue = "";
      	String completePropUIValue = "";
		if( (tools.getParamValue("pyShowFilterUIBy").equals("value") || tools.getParamValue("pyShowFilterUIBy").equals("")) && (strColumnType.equals("Date") || strColumnType.equals("DateTime") || strColumnType.equals("Text") || strColumnType.equals("Decimal") || strColumnType.equals("Integer") || strColumnType.equals("Double"))){
			IsFilterUIByValue = true;
		}
    /*If property is of type date/date time, displaying it in the format instead of original value*/
    ImmutablePropertyInfo propInfo = null;
    if(!("".equals(strPageClass) || "".equals(propForRDPL))){
      propInfo = tools.getDictionary().getImmutablePropertyInfo(strPageClass,propForRDPL); 
    }
    boolean isStaticColumn = "static".equals(tools.getParamValue("pyCellType"));
    if("true".equals(tools.getParamValue("bsecinclude")) || ( isStaticColumn && IsFilterUIByValue)) {////Add if conditon to satishfy filter by format for datetime to Report defintion 
			String dateFormatCode = StringUtils.restoreFilteredString(tools.getParamValue("dateFormat"));	
			String dateTimeFormatCode = tools.getParamValue("dateTimeFormat");
			String formattedPropValue = "";
			tools.putParamValue("pyDateTimeSecondCutoff",tools.getParamValue("pyDateTimeSecondCutoff"));
			if(propInfo != null && propInfo.hasTypeDateTime()){
				if("".equals(dateTimeFormatCode)){
					dateTimeFormatCode = PRDateFormat.DEFAULT_DATETIME_SHORT;
				}
				tools.putParamValue("propTypeForFormatting",""+propInfo.getType());
				formattedPropValue = pega_uiengine_formatter.pxFormatDateTime(propValue,dateTimeFormatCode,"associated",false);
				if(formattedPropValue == null)
					formattedPropValue = tools.getLocalizedTextForString("pyCaption","NoValueLabel");
				propUIValue = "<span nowrap>"+formattedPropValue+"</span>";
			}else if(propInfo != null && propInfo.hasTypeDate()){
				if("".equals(dateFormatCode)){
					dateFormatCode = PRDateFormat.DEFAULT_DATE_SHORT;
				}
				tools.putParamValue("pyFormatType","date");
				tools.putParamValue("propTypeForFormatting",""+propInfo.getType());
				formattedPropValue = pega_uiengine_formatter.pxFormatDateTime(propValue,dateFormatCode,"associated",false);
				if(formattedPropValue == null)
					formattedPropValue = tools.getLocalizedTextForString("pyCaption","NoValueLabel");
				propUIValue = "<span nowrap>"+formattedPropValue+"</span>";
			
			}else{
		//	propUIValue = "<span nowrap>"+propValue+"</span>";
       propUIValue = (String)org.apache.commons.lang.StringEscapeUtils.escapeHtml(propValue); 
			}
		}else if(tools.getParamValue("pyShowFilterUIBy").equals("format") || bRetainControlFormat || ("true".equals(tools.getParamValue("isReportDef")) && "dynamic".equals(tools.getParamValue("pyCellType")))){//Add if conditon to satishfy filter by format for datetime to Report defintion 
          	tools.putParamValue("pxAvoidUniqueAttribute", "true");/* BUG-325227: Use pxAvoidUniqueAttribute to avoid generation of name attribute with unique values. Because of unique name value duplicate values are seen in filter popup when filter by format is used. */
			
       if("".equals(propValue) ){
         if(tools.getParamValue("pyShowFilterUIBy").equals("format")){
           propUIValue = tools.getStream(keys2, null);
         }else{
           propUIValue = tools.getLocalizedTextForString("pyCaption","NoValueLabel");
         }
        }
      else {
       ClipboardPage primaryPage = tools.findPage(tools.getParamValue("BaseReference"), true);
       propUIValue = tools.getStream(keys2, primaryPage);
      }
      tools.getParameterPage().remove("pxAvoidUniqueAttribute");
      completePropUIValue = tools.getStream(keys2, null);
      if("".equals(propValue) && tools.getParamValue("pyShowFilterUIBy").equals("format") && propInfo != null && !propInfo.hasTypeTrueFalse()){ 
        completePropUIValue = tools.getLocalizedTextForString("pyCaption","NoValueLabel");
       }
		}else{
            /* BUG-281383: Escape the propValue */
			propUIValue = (String)org.apache.commons.lang.StringEscapeUtils.escapeHtml(propValue);
		}
		propUIValue = propUIValue.trim();
		/* BUG-281383: Do not unescape the value of pyUILabel */
        String escapedPropValue = (String)org.apache.commons.lang.StringEscapeUtils.unescapeHtml(propUIValue);
        //propUIValue = (String)org.apache.commons.lang.StringEscapeUtils.unescapeHtml(propUIValue);
		if(uniqueValuesMap.containsKey(escapedPropValue)){
			int indexInPL = ((Integer)uniqueValuesMap.get(escapedPropValue)).intValue();
			cp_pyUniqueValues.getPageValue(indexInPL).getProperty("pyCBMappingValueList").add(propValue);
			if ("".equals(propValue) && !"".equals(cp_pyUniqueValues.getPageValue(indexInPL).getString("pyFilterLabel"))) {
				cp_pyUniqueValues.getPageValue(indexInPL).getProperty("pyFilterLabel").setValue(propValue);
			}
			tools.putParamValue("partialRefresh","");
			tools.putParamValue("SectionReadOnly","tempSectionReadOnly");
			continue;
		} else {
			uniqueColPg = tools.createPage(uniqueColPageClass, "");
            /* BUG-281383: Escape the propValue */
			uniqueColPg.getProperty("pyFilterLabel").setValue((String)org.apache.commons.lang.StringEscapeUtils.escapeHtml(propValue));
			uniqueColPg.getProperty("pyUILabel").setValue(propUIValue);
          	if(tools.getParamValue("pyShowFilterUIBy").equals("format") || bRetainControlFormat){
              uniqueColPg.getProperty("pyUILabelForDisplay").setValue(completePropUIValue);
            }
			uniqueColPg.getProperty("pyCBMappingValueList").add(propValue);
			cp_pyUniqueValues.add(uniqueColPg);
		}
		tools.putParamValue("partialRefresh","");
		tools.putParamValue("SectionReadOnly","tempSectionReadOnly");
		/* BUG-281383: Use the unescaped value where needed */
		propValue = escapedPropValue;
		uniqueValuesMap.put((Object)propValue,new Integer(i));
		i++;
	}
  }
	/*US-69819*/
	pg_gridFilterCriteria.putString("pyPartialTrigger", "");
        tools.putParamValue("partialTrigger",tools.getParamValue("partialTriggerOld"));
	/*US-69819*/
                    //US-52830 - Start
                   tools.putParamValue("optimizeFilter","");
	String strMetaDataPageForFilter = tools.getParamValue("pyPageName");
	ClipboardPage pg_metaDataPageForFilter = tools.findPage(strMetaDataPageForFilter);
	if(pg_metaDataPageForFilter != null)
	{
		 pg_metaDataPageForFilter.removeFromClipboard();
	}
	//US-52830 - End
	if(isReportDef.equals("true") && !bLoadActivity.equals("true")){
		// cleaning up temporary pages created.
		tempDummy2.removeFromClipboard(); 
		pgRepContPageWithResults.removeFromClipboard(); 
		pyReportParamPageName.removeFromClipboard(); 
	}else if(!pyPaginateActivity.equals("") && tools.getParamValue("pyFilterHandled").equals("true")){
		contentPage.removeFromClipboard(); 
	}
}

if(!tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TEXT, "pyClearFiltering")) {
	ClipboardProperty cp_newValues = pg_columnFilterCriteria.getProperty("pyUniqueValues");
	ClipboardProperty cp_oldValues = pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").getPageValue(subScriptForColumn).getProperty("pyUniqueValues");
	if(cp_oldValues!=null && cp_oldValues.size()>0) {
		it = cp_oldValues.iterator();
		boolean bSelected = false;
		Set selectedValuesSet = new HashSet();
		ClipboardPage pg_embeddedPage = null;
		while(it.hasNext()) {
		
         	cp_embeddedPage = (ClipboardProperty)it.next();
			pg_embeddedPage = cp_embeddedPage.getPageValue();
			bSelected = pg_embeddedPage.getBoolean("pySelected");
			if(bSelected) {		
				propValue = pg_embeddedPage.getString("pyUILabel");
				if(propValue!=null){
					propValue = propValue.replaceAll("\r","");
				}
				selectedValuesSet.add((Object)propValue);
			}
		}
		it = cp_newValues.iterator();
		while(it.hasNext()) {
			
			cp_embeddedPage = (ClipboardProperty)it.next();
			pg_embeddedPage = cp_embeddedPage.getPageValue();
			propValue = pg_embeddedPage.getString("pyUILabel");
			
			if(propValue!=null){
				propValue = propValue.replaceAll("\r","");
			}
			
            //Bug -172160, HTML unescape is needed to match the selected filters.            
			 String propValueTemp = propValue;
			if(pyShowFilterUIBy.equalsIgnoreCase("value") && strColumnType.equalsIgnoreCase("Text")){
				if(selectedValuesSet.contains((Object)propValueTemp) || selectedValuesSet.contains((Object)org.apache.commons.lang.StringEscapeUtils.unescapeHtml(propValueTemp))) {
					pg_embeddedPage.getProperty("pySelected").setValue(true);
				}
            }else{			
				if(selectedValuesSet.contains((Object)propValueTemp)) {
					pg_embeddedPage.getProperty("pySelected").setValue(true);
				}
			}
		}
	}

	pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").getPageValue(subScriptForColumn).putAll(pg_columnFilterCriteria, ClipboardPage.PUTALL_KEEPNEW);
}else {
	pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").add(subScriptForColumn, pg_columnFilterCriteria);
}
pg_gridFilterCriteria.getProperty("pyRangeFilterByFormat").setValue(bRangeFilterByFormat);
/*update the column's type in the clipboard*/
pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").getPageValue(subScriptForColumn).getProperty(".pyDataType").setValue(strColumnType);
pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").getPageValue(subScriptForColumn).getProperty(".pyColumnName").setValue(strColumnName);
pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").getPageValue(subScriptForColumn).getProperty(".pyColumnIndex").setValue(strColumnIndex);
pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").getPageValue(subScriptForColumn).getProperty(".pyShowFilterUIBy").setValue(pyShowFilterUIBy);
pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").getPageValue(subScriptForColumn).getProperty(".pyRangeFiltering").setValue(pyRangeFiltering);
if (!tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TEXT, "pyClearFiltering")) {
	pg_gridFilterCriteria.getProperty(".pyPartialTrigger").setValue(tools.getParamValue("partialTrigger"));
	pg_gridFilterCriteria.getProperty(".pySectionClass").setValue(tools.getParamValue("sectionClass"));
}
pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").getPageValue(subScriptForColumn).getProperty(".pyFilterType").setValue(tools.getParamValue("filterType"));
if(".pyTemplateInputBox".equals(strColumnName) && ("value".equals(pyShowFilterUIBy) || "".equals(pyRangeFiltering))){
	strColumnType = "InvalidType";
}
tools.putParamValue("pyColumnType", strColumnType);
/*store the page Name of pyColumnFilterCriter() in local variable to use it as step page for next step*/
strUniqueValuesPage = pg_gridFilterCriteria.getProperty("pyColumnFilterCriteria").getPageValue(subScriptForColumn).getReference();
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Sort the unique values in Ascending order.
 * <p>
 * Step 4 <code>call pzSortClipBoardData</code> [on page local.strUniqueValuesPage] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzSortClipBoardData");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.doExit==\"true\"");
try {
boolean pz_3 = (doExit.equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.doExit==\"true\"",pz_3);
if (pz_3) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzGetGridColUniqueValues - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.doExit==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("call pzSortClipBoardData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pzSortClipBoardData
if (myStepPage == null) {
String pz_4 = strUniqueValuesPage;
myStepPage = tools.findPage(pz_4, false);
}
// Calling Activity : pzSortClipBoardData

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: ".pyFilterLabel"
newParamsPage.putParamValue("sortProperty", PropertyInfo.TYPE_TEXT, ".pyFilterLabel");
// Expression: local.sortType
newParamsPage.putParamValue("sortType", PropertyInfo.TYPE_TEXT, sortType);
// Expression: ".pyUniqueValues"
newParamsPage.putParamValue("PageListProperty", PropertyInfo.TYPE_TEXT, ".pyUniqueValues");

pega.invokeActivity(myStepPage, newParamsPage, "pzSortClipBoardData", "@baseclass", "");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzSortClipBoardData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Set pyDisplaySelectedValuesFirst param to local.
 * <p>
 * Step 5 <code>Java</code> [on page local.strUniqueValuesPage] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
//US-52836 - start
pyDisplaySelectedValuesFirst = tools.getParamAsBoolean(ImmutablePropertyInfo.MODE_STRING,"pyDisplaySelectedValuesFirst");
//US-52836 - end
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Check if separator is already added else add a separator.
 * <p>
 * Step 6 <code>Java</code> [on page local.strUniqueValuesPage] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.pyDisplaySelectedValuesFirst");
try {
boolean pz_7 = pyDisplaySelectedValuesFirst;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.pyDisplaySelectedValuesFirst",pz_7);
if (!pz_7) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzGetGridColUniqueValues - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.pyDisplaySelectedValuesFirst " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
//US-52836 - start
ClipboardProperty prop = myStepPage.getProperty(".pyUniqueValues");
Iterator propItr = prop.iterator();
boolean bSeparatorPresent = false;
int selected = 0;
while(propItr.hasNext()) {
	ClipboardProperty cp = (ClipboardProperty) propItr.next();
	String pySeparator = cp.getProperty(".pySeparator").getStringValue();
	if("true".equals(pySeparator)){
	   bSeparatorPresent = true;
	}
        String pySelected = cp.getProperty(".pySelected").getStringValue();
	if("true".equals(pySelected)){
	  selected = selected  +1;
	}
}

if(selected!=0 && selected !=prop.size() && !bSeparatorPresent)
{
  ClipboardPage separatorPage = tools.createPage("Pega-ColumnFilterCriteria-UniqueValues-Text", "separatorPage");
  separatorPage.getProperty(".pySelected").setValue(false);
  /* BUG-267867: Check the value of bRetainControlFormat before adding the separator div */
  if(!"true".equals(tools.getParamValue("bRetainControlFormat"))){
	  separatorPage.putString(".pyFilterLabel","<div class='filterPanelSeparator'></div>");    
  }else{
      separatorPage.putString(".pyUILabel","<div class='filterPanelSeparator'></div>");
  }
  separatorPage.putString(".pyUILabel","<div class='filterPanelSeparator'></div>");
  separatorPage.getProperty(".pySeparator").setValue(true);
  prop.add(separatorPage);
}
//US-52836 - start
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Sort the unique values in Descending order to display selected values top.
 * <p>
 * Step 7 <code>call pzSortClipBoardData</code> [on page local.strUniqueValuesPage] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzSortClipBoardData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call pzSortClipBoardData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pzSortClipBoardData
if (myStepPage == null) {
String pz_9 = strUniqueValuesPage;
myStepPage = tools.findPage(pz_9, false);
}
// Calling Activity : pzSortClipBoardData

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: ".pySelected"
newParamsPage.putParamValue("sortProperty", PropertyInfo.TYPE_TEXT, ".pySelected");
// Expression: "DESC"
newParamsPage.putParamValue("sortType", PropertyInfo.TYPE_TEXT, "DESC");
// Expression: ".pyUniqueValues"
newParamsPage.putParamValue("PageListProperty", PropertyInfo.TYPE_TEXT, ".pyUniqueValues");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzSortClipBoardData", "@baseclass", "");
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzSortClipBoardData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public String nextBlock="";
boolean pz_Status = true;
boolean pz_methodStatusUpdated = false;
private boolean debugIsOn=false;
private int forEachCounter = 0;
private int pz_forEachSkipClass = 0;
private InfEngUtils infEngine = null;
ClipboardProperty nextProperty = null;
String pz_CurrentRuleKey = "";
String pz_CurrentCircumstance = "";
String pz_CurrentStepNum = "";
com.pega.pegarules.priv.tracer.ActivityTraceInfo pz_CurrentTraceInfo = null;
String pz_thisPageClass = "";
Dictionary pz_Dictionary = null;
private static final boolean isAllowedInWeb = true;
String statusReturnedFromNestedLoop = "";

public void initializeStandardLocalVariables() {
	nextBlock="";
	pz_Status = true;
	pz_methodStatusUpdated = false;
	debugIsOn=false;
	forEachCounter = 0;
	pz_forEachSkipClass = 0;
	infEngine = null;
	nextProperty = null;
	pz_CurrentRuleKey = "";
	pz_CurrentCircumstance = "";
	pz_CurrentStepNum = "";
	pz_CurrentTraceInfo = null;
	pz_thisPageClass = "";
	pz_Dictionary = null;
	statusReturnedFromNestedLoop = "";
}

public String sortType = "";
public String doExit = "";
public boolean pyDisplaySelectedValuesFirst = false;
public String strPLParentPage = "";
public String strUniqueValuesPage = "";

public void initializeUserLocalVariables() {
	sortType = "";
	doExit = "";
	pyDisplaySelectedValuesFirst = false;
	strPLParentPage = "";
	strUniqueValuesPage = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("sortType", (sortType == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : sortType.toString());
	smRetVal.putString("doExit", (doExit == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : doExit.toString());
	smRetVal.putString("pyDisplaySelectedValuesFirst", Boolean.toString(pyDisplaySelectedValuesFirst));
	smRetVal.putString("strPLParentPage", (strPLParentPage == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : strPLParentPage.toString());
	smRetVal.putString("strUniqueValuesPage", (strUniqueValuesPage == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : strUniqueValuesPage.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY @BASECLASS PZGETGRIDCOLUNIQUEVALUES #20231013T155310.720 GMT", "@baseclass pzGetGridColUniqueValues", "Pega-UIEngine", "08-23-02", false, true, "", "ACTIVITY", "20231013T155310.720 GMT" ,"Rule-Obj-Activity"); }
