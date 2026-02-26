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
public class ra_action_pzdeletereportshortcut_983cd68013e331793e76acadadcb6dba extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzDeleteReportShortcut.Rule_Obj_Report_Definition.Action");
	public ra_action_pzdeletereportshortcut_983cd68013e331793e76acadadcb6dba(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT	Pega-Reporting:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_9 = pega.findPageWithException("pyShortcutList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_9;
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
// we need to check to see if the class of this page is in the list
// of valid pages for this ForEach call.
pz_thisPageClass = thisStepPage.getClassName();
if ( "Data-Report-Shortcut".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Data-Report-Shortcut").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_0_circum0");
}
PRStackFrame pz_StackFrame4_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 4_0 Circum: 0" );
try {
pz_Status = step4_0_circum0_Data_Report_Shortcut();
} finally {
pega.popStackFrame(pz_StackFrame4_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
else{
pz_forEachSkipClass++;
tools.putParamValue("pyForEachSkipClass", Integer.toString(pz_forEachSkipClass));
}
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_circum0");
}
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 6_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_19 = pega.findPageWithException("pyRuleShortcutList", (String) null).getIfPresent("pxResults");
pageRef = pz_19;
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
// we need to check to see if the class of this page is in the list
// of valid pages for this ForEach call.
pz_thisPageClass = thisStepPage.getClassName();
if ( "Rule-Shortcut".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Rule-Shortcut").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_0_circum0");
}
PRStackFrame pz_StackFrame6_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 6_0 Circum: 0" );
try {
pz_Status = step6_0_circum0_Rule_Shortcut();
} finally {
pega.popStackFrame(pz_StackFrame6_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
else{
pz_forEachSkipClass++;
tools.putParamValue("pyForEachSkipClass", Integer.toString(pz_forEachSkipClass));
}
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("END"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 7 Circum: 0" );
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
	"Rule-Obj-Activity:PZDELETEREPORTSHORTCUT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZDELETEREPORTSHORTCUT","Rule-Obj-Activity","RULE-OBJ-REPORT-DEFINITION",false,"","Pega-Reporting","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT","!PZDELETEREPORTSHORTCUT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",801908126)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT:20180713T134212.434 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "bead138f20f50bb2aae9e56631c286bb";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Report-Definition";
	}
public String getAspect() {
return "Action";
}
/**
 * store the report key.
 * <p>
 * Step 1 <code>Property-Set</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageName(Primary) = \"CheckInRulePage\" || Primary.pyToolBarSettings.pyCheckIn == true");
try {
boolean pz_5 = ((pega.<String>resolveMethodCall("PageName--(ClipboardPage)", "PageName", null, null, new Object[] { tools.getPrimaryPage() }).equals("CheckInRulePage")) || (scalarValueQuery_3.resolveToBoolean(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageName(Primary) = \"CheckInRulePage\" || Primary.pyToolBarSettings.pyCheckIn == true",pz_5);
if (pz_5) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzDeleteReportShortcut - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageName(Primary) = \"CheckInRulePage\" || Primary.pyToolBarSettings.pyCheckIn == true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    key = scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    insname = scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Get all reports witn same pxInsName.
 * <p>
 * Step 2 <code>Obj-Browse</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Rule-Obj-Report-Definition
ClipboardPage browsePage = null;
// Expression: pyRDList
browsePage = tools.findPage("pyRDList", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "pyRDList");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Rule-Obj-Report-Definition");
browsePage.putString("pyMaxRecords", "10000");

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "");
contentPage.putString("pyDataSource", "Rule-Obj-Report-Definition");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "true");
// Expression: pzInsKey
contentPage.putString("pyRowKey", "pzInsKey");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;
// Expression: local.insname

//Code for Label : 
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pxInsName");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", insname);
paramPage.putString("pyConditionValue1String", insname);
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: local.key

//Code for Label : 
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pzInsKey");
paramPage.putString("pyConditionOperation", "<>");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", key);
paramPage.putString("pyConditionValue1String", key);
contentPage.getProperty("pyParameters").add(paramPage);
selectPage.putString("pyField", "pzPVStream");
contentPage.getProperty("pySelectFields").add(selectPage);
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Rule-Obj-Report-Definition", "} ", whereClause, sortClause);
	tools.getDatabase().executeRDB(sql , browsePage);
}	catch (DatabaseException e) {
		browsePage.addMessage(e.getMessage());
		}	catch (Exception e) {
		browsePage.addMessage(e.getMessage());
		}
catch (PRRuntimeError e) {
		browsePage.addMessage(e.getMessage());
		} finally {
	if (contentPage != null) {
		contentPage.removeFromClipboard();
	}
	if (selectPage != null) {
		selectPage.removeFromClipboard();
	}
	if (paramPage != null) {
		paramPage.removeFromClipboard();
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Size(\"pyRDList.pxResults\",tools) &gt; 0");
try {
boolean pz_8 = ((pega.<Integer>resolveMethodCall("Size--(String,Activity)", "Size", null, null, new Object[] { "pyRDList.pxResults", tools })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Size(\"pyRDList.pxResults\",tools) &gt; 0",pz_8);
if (pz_8) {
// branch to block END
nextBlock = "END";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Size(\"pyRDList.pxResults\",tools) &gt; 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Get all the data shortcuts that are pointing to the given report.
 * <p>
 * Step 3 <code>Obj-Browse</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Data-Report-Shortcut
ClipboardPage browsePage = null;
// Expression: pyShortcutList
browsePage = tools.findPage("pyShortcutList", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "pyShortcutList");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Data-Report-Shortcut");
browsePage.putString("pyMaxRecords", "10000");

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "A");
contentPage.putString("pyDataSource", "Data-Report-Shortcut");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "false");
// Expression: 
contentPage.putString("pyRowKey", "");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;
// Expression: Local.key

//Code for Label : A
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "A");
paramPage.putString("pyConditionFieldName", ".pzReportKey");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", key);
paramPage.putString("pyConditionValue1String", key);
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : B
selectPage.putString("pyField", ".pzKey");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(1).pyPropertyName", ".pzKey");
browsePage.putString(".pyMapping(1).pyClassName", "Data-Report-Shortcut");

//Code for Label : C
selectPage.putString("pyField", ".pzOwner");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(2).pyPropertyName", ".pzOwner");
browsePage.putString(".pyMapping(2).pyClassName", "Data-Report-Shortcut");

//Code for Label : D
selectPage.putString("pyField", ".pzCategory");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(3).pyPropertyName", ".pzCategory");
browsePage.putString(".pyMapping(3).pyClassName", "Data-Report-Shortcut");
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Data-Report-Shortcut", "} ", whereClause, sortClause);
	tools.getDatabase().executeRDB(sql , browsePage);
}	catch (DatabaseException e) {
		browsePage.addMessage(e.getMessage());
		}	catch (Exception e) {
		browsePage.addMessage(e.getMessage());
		}
catch (PRRuntimeError e) {
		browsePage.addMessage(e.getMessage());
		} finally {
	if (contentPage != null) {
		contentPage.removeFromClipboard();
	}
	if (selectPage != null) {
		selectPage.removeFromClipboard();
	}
	if (paramPage != null) {
		paramPage.removeFromClipboard();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Delete the data shortcuts.
 * <p>
 * Step 4.0 <code>Java</code> [on page pyShortcutList.pxResults] <br>
 */
public boolean step4_0_circum0_Data_Report_Shortcut() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java

} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
ClipboardProperty nestedPageRef = null;
java.util.Iterator myNestedPageList = null;
ClipboardProperty nextNestedPage = null;
ClipboardPage nestedStepPage = null;
ClipboardPage thisStepPage = null;

// Code to call nested step 4_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_1_circum0");
}
PRStackFrame pz_StackFrame4_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 4_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_2_circum0");
}
String pz_10 = "pyShortcutPage";
nestedStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame4_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 4_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_3_circum0");
}
String pz_11 = "pyShortcutPage";
nestedStepPage = tools.findPage(pz_11, true);
PRStackFrame pz_StackFrame4_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 4_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "4.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_0_circum0_Data_Report_Shortcut definition

/**
 * set the local properties.
 * <p>
 * Step 4.1 <code>Property-Set</code><br>
 */
public boolean step4_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    owner = scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    name = scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    category = scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_1_circum0 definition

/**
 * Open the shortcut instance.
 * <p>
 * Step 4.2 <code>Obj-Open</code> [on page pyShortcutPage] <br>
 */
public boolean step4_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_15 = "pyShortcutPage";
myStepPage = tools.findPage(pz_15, true);
// Expression: 
// Expression: Data-Report-Shortcut
myStepPage = tools.getThread().createPage("Data-Report-Shortcut", pz_15);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pzOwner", pRef_16, myStepPage, owner, "sIN", false, false);
}
{
    pega.setViaPropRef(".pzCategory", pRef_17, myStepPage, category, "sIN", false, false);
}
{
    pega.setViaPropRef(".pzName", pRef_18, myStepPage, name, "sIN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "pyShortcutPage", "", false, false);
} catch (DatabaseException dbEx) {
	oLog.error("Error in Obj-Open", dbEx);
}} finally {
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_2_circum0 definition

/**
 * Delete the shortcutinstance.
 * <p>
 * Step 4.3 <code>Obj-Delete</code> [on page pyShortcutPage] <br>
 */
public boolean step4_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Delete");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Delete", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Delete
try {
tools.getDatabase().delete(myStepPage, true);
} catch (DatabaseException dbEx) {
oLog.error("Error in Obj-Delete", dbEx);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Delete",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_3_circum0 definition

/**
 * Get all the rule shortcuts that are pointing to the given report.
 * <p>
 * Step 5 <code>Obj-Browse</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Rule-Shortcut
ClipboardPage browsePage = null;
// Expression: pyRuleShortcutList
browsePage = tools.findPage("pyRuleShortcutList", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "pyRuleShortcutList");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Rule-Shortcut");
browsePage.putString("pyMaxRecords", "10000");

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "A");
contentPage.putString("pyDataSource", "Rule-Shortcut");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "false");
// Expression: 
contentPage.putString("pyRowKey", "");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;
// Expression: Local.insname

//Code for Label : A
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "A");
paramPage.putString("pyConditionFieldName", ".pyRuleInsName");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", insname);
paramPage.putString("pyConditionValue1String", insname);
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : F
selectPage.putString("pyField", ".pzInsKey");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(1).pyPropertyName", ".pzInsKey");
browsePage.putString(".pyMapping(1).pyClassName", "Rule-Shortcut");
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Rule-Shortcut", "} ", whereClause, sortClause);
	tools.getDatabase().executeRDB(sql , browsePage);
}	catch (DatabaseException e) {
		browsePage.addMessage(e.getMessage());
		}	catch (Exception e) {
		browsePage.addMessage(e.getMessage());
		}
catch (PRRuntimeError e) {
		browsePage.addMessage(e.getMessage());
		} finally {
	if (contentPage != null) {
		contentPage.removeFromClipboard();
	}
	if (selectPage != null) {
		selectPage.removeFromClipboard();
	}
	if (paramPage != null) {
		paramPage.removeFromClipboard();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Delete the rule shortcuts.
 * <p>
 * Step 6.0 <code>Java</code> [on page pyRuleShortcutList.pxResults] <br>
 */
public boolean step6_0_circum0_Rule_Shortcut() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java

} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
ClipboardProperty nestedPageRef = null;
java.util.Iterator myNestedPageList = null;
ClipboardProperty nextNestedPage = null;
ClipboardPage nestedStepPage = null;
ClipboardPage thisStepPage = null;

// Code to call nested step 6_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_1_circum0");
}
PRStackFrame pz_StackFrame6_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 6_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step6_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame6_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 6_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_2_circum0");
}
String pz_20 = "pyRuleShortcutPage";
nestedStepPage = tools.findPage(pz_20, true);
PRStackFrame pz_StackFrame6_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 6_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step6_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame6_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 6_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_3_circum0");
}
String pz_21 = "pyRuleShortcutPage";
nestedStepPage = tools.findPage(pz_21, true);
PRStackFrame pz_StackFrame6_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 6_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step6_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame6_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 6_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_4_circum0");
}
String pz_22 = "pyRuleShortcutPage";
nestedStepPage = tools.findPage(pz_22, true);
PRStackFrame pz_StackFrame6_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 6_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step6_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame6_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 6_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_5_circum0");
}
String pz_23 = "pyRuleSetVersionContentPage";
nestedStepPage = tools.findPage(pz_23, true);
PRStackFrame pz_StackFrame6_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT Step: 6_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step6_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame6_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "6.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_0_circum0_Rule_Shortcut definition

/**
 * set the local properties.
 * <p>
 * Step 6.1 <code>Property-Set</code><br>
 */
public boolean step6_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    shortcutkey = scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_1_circum0 definition

/**
 * Open the shortcut instance.
 * <p>
 * Step 6.2 <code>Obj-Open-By-Handle</code> [on page pyRuleShortcutPage] <br>
 */
public boolean step6_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open-By-Handle", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open-By-Handle
String pz_24 = "pyRuleShortcutPage";
myStepPage = tools.findPage(pz_24, true);
// Expression: local.shortcutkey
// Expression: 
// Obj-Open-By-Handle
try {
	ClipboardPage temp = objOpenByHandle(shortcutkey, "pyRuleShortcutPage", "", false, false, false);
	if(temp != null)
		myStepPage = temp;
} catch (DatabaseException dbEx) {
	oLog.error("Error in Obj-Open-By-Handle", dbEx);
}} finally {
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_2_circum0 definition

/**
 * See if the shortcut is in a secured ruleset or unlocked ruleset.
 * <p>
 * Step 6.3 <code>Obj-Browse</code> [on page pyRuleShortcutPage] <br>
 */
public boolean step6_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Rule-RuleSet-Version
ClipboardPage browsePage = null;
// Expression: pyRuleSetVersionContentPage
browsePage = tools.findPage("pyRuleSetVersionContentPage", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "pyRuleSetVersionContentPage");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Rule-RuleSet-Version");
browsePage.putString("pyMaxRecords", "10000");

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "");
contentPage.putString("pyDataSource", "Rule-RuleSet-Version");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "true");
// Expression: pzInsKey
contentPage.putString("pyRowKey", "pzInsKey");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;
// Expression: Rule-RuleSet-Version

//Code for Label : 
selectPage.putString("pyField", ".pxObjClass");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(1).pyPropertyName", ".pxObjClass");
browsePage.putString(".pyMapping(1).pyClassName", "Rule-RuleSet-Version");
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pxObjClass");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", "Rule-RuleSet-Version");
paramPage.putString("pyConditionValue1String", "Rule-RuleSet-Version");
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: .pyRuleSet

//Code for Label : 
selectPage.putString("pyField", ".pyRuleSetName");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(2).pyPropertyName", ".pyRuleSetName");
browsePage.putString(".pyMapping(2).pyClassName", "Rule-RuleSet-Version");
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyRuleSetName");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
paramPage.putString("pyConditionValue1String", scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: .pyRuleSetVersion

//Code for Label : 
selectPage.putString("pyField", ".pyRuleSetVersionID");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(3).pyPropertyName", ".pyRuleSetVersionID");
browsePage.putString(".pyMapping(3).pyClassName", "Rule-RuleSet-Version");
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyRuleSetVersionID");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", scalarValueQuery_30.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
paramPage.putString("pyConditionValue1String", scalarValueQuery_30.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : 
selectPage.putString("pyField", ".pyVersionSecure");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(4).pyPropertyName", ".pyVersionSecure");
browsePage.putString(".pyMapping(4).pyClassName", "Rule-RuleSet-Version");
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyVersionSecure");
paramPage.putString("pyConditionOperation", "IsFalse");
paramPage.putString("pyCondValueCategory", "singlevalue");
contentPage.getProperty("pyParameters").add(paramPage);
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Rule-RuleSet-Version", "} ", whereClause, sortClause);
	tools.getDatabase().executeRDB(sql , browsePage);
}	catch (DatabaseException e) {
		browsePage.addMessage(e.getMessage());
		}	catch (Exception e) {
		browsePage.addMessage(e.getMessage());
		}
catch (PRRuntimeError e) {
		browsePage.addMessage(e.getMessage());
		} finally {
	if (contentPage != null) {
		contentPage.removeFromClipboard();
	}
	if (selectPage != null) {
		selectPage.removeFromClipboard();
	}
	if (paramPage != null) {
		paramPage.removeFromClipboard();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_3_circum0 definition

/**
 * Delete the shortcutinstance if it is in unlocked ruleset.
 * <p>
 * Step 6.4 <code>Obj-Delete</code> [on page pyRuleShortcutPage] <br>
 */
public boolean step6_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Delete");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageExists(pyRuleSetVersionContentPage) &amp;&amp; pyRuleSetVersionContentPage.pxResultCount==1");
try {
boolean pz_32 = ((pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "pyRuleSetVersionContentPage" })).booleanValue() && (scalarValueQuery_31.resolveToInt(tools, pega.findPageWithException("pyRuleSetVersionContentPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER) == 1));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageExists(pyRuleSetVersionContentPage) &amp;&amp; pyRuleSetVersionContentPage.pxResultCount==1",pz_32);
if (!pz_32) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageExists(pyRuleSetVersionContentPage) &amp;&amp; pyRuleSetVersionContentPage.pxResultCount==1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Delete", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Delete
try {
tools.getDatabase().delete(myStepPage, true);
} catch (DatabaseException dbEx) {
oLog.error("Error in Obj-Delete", dbEx);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Delete",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_4_circum0 definition

/**
 * Remove the temp page created.
 * <p>
 * Step 6.5 <code>Page-Remove</code> [on page pyRuleSetVersionContentPage] <br>
 */
public boolean step6_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
pageRemove(myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_5_circum0 definition

/**
 * Remove the temp pages.
 * <p>
 * Step 7 [END] <code>Page-Remove</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: pyShortcutList
pageRemove(tools.findPage("pyShortcutList"));
// Expression: pyShortcutPage
pageRemove(tools.findPage("pyShortcutPage"));
// Expression: pyRuleShortcutList
pageRemove(tools.findPage("pyRuleShortcutList"));
// Expression: pyRuleShortcutPage
pageRemove(tools.findPage("pyRuleShortcutPage"));
// Expression: pyRDList
pageRemove(tools.findPage("pyRDList"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
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

public String owner = "";
public String insname = "";
public String shortcutkey = "";
public String name = "";
public String category = "";
public String key = "";

public void initializeUserLocalVariables() {
	owner = "";
	insname = "";
	shortcutkey = "";
	name = "";
	category = "";
	key = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("owner", (owner == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : owner.toString());
	smRetVal.putString("insname", (insname == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : insname.toString());
	smRetVal.putString("shortcutkey", (shortcutkey == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : shortcutkey.toString());
	smRetVal.putString("name", (name == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : name.toString());
	smRetVal.putString("category", (category == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : category.toString());
	smRetVal.putString("key", (key == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : key.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_4 = new String[] { "", "", "pyToolBarSettings", "", "pyCheckIn", "" };
public static final String[] pRef_17 = new String[] { "", "", "pzCategory", "" };
public static final String[] pRef_16 = new String[] { "", "", "pzOwner", "" };
public static final String[] pRef_18 = new String[] { "", "", "pzName", "" };
private static final PropertyQuery propertyQuery_25 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSet").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pxInsName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().page("pyToolBarSettings").scalarProperty("pyCheckIn").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().scalarProperty("pxResultCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pzName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_28 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSetVersion").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pzCategory").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pzOwner").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_30 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSetVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSet").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-REPORT-DEFINITION PZDELETEREPORTSHORTCUT #20180713T134212.434 GMT", "Rule-Obj-Report-Definition pzDeleteReportShortcut", "Pega-Reporting", "08-01-01", false, false, "", "TRIGGER", "20180713T134212.434 GMT" ,"Rule-Obj-Activity"); }
