package com.pegarules.generated.activity;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
public class ra_action_pushdeadlockinfo_31b764c76c17cedb14cf2ace5cd965b0 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.PushDeadlockInfo.PegaAESRemote_Interface_DeadlockInfo.Action");
	public ra_action_pushdeadlockinfo_31b764c76c17cedb14cf2ace5cd965b0(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT	PegaAESRemote:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 1 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_3 = "DSSValues";
thisStepPage = tools.findPage(pz_3, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 2 Circum: 0" );
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
String pz_5 = "DSSValues";
thisStepPage = tools.findPage(pz_5, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_5, false);
thisStepPage.putString("pxObjClass", "PegaAESRemote-Interface-DeadlockInfo");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 5_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_13 = pega.findPageWithException("DeadlockList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_13;
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_0_circum0");
}
PRStackFrame pz_StackFrame5_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 5_0 Circum: 0" );
try {
pz_Status = step5_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("BAD"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_17 = pega.findPageWithException("BadStateList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_17;
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_0_circum0");
}
PRStackFrame pz_StackFrame7_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 7_0 Circum: 0" );
try {
pz_Status = step7_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 8_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CLEANUP"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
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
	"Rule-Obj-Activity:PUSHDEADLOCKINFO"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PUSHDEADLOCKINFO","Rule-Obj-Activity","PEGAAESREMOTE-INTERFACE-DEADLOCKINFO",false,"","PegaAESRemote","08-07-01","RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT","!PUSHDEADLOCKINFO",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-434187303)
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
//	RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT:20211021T110415.955 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "39df73bc95538c98a21486fa8198d97f";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAESRemote-Interface-DeadlockInfo";
	}
public String getAspect() {
return "Action";
}
/**
 * Log Message.
 * <p>
 * Step 1 <code>Log-Message</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "PegaAESRemote : Push Deadlock Info invoked"
if( oLog.isInfoEnabled() ){
oLog.info("PegaAESRemote : Push Deadlock Info invoked");
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Step 2 <code>Page-New</code> [on page DSSValues] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_4 = "DSSValues";
myStepPage = tools.findPage(pz_4, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("PegaAESRemote-Interface-DeadlockInfo","DSSValues",false); 
// primary page will not be added to PageList
	 pega.setStepPage("DSSValues", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Step 3 <code>Property-Set</code> [on page DSSValues] <br>
 */
public boolean step3_circum0() {
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
    pega.setViaPropRef(".DeadlockThreshold", pRef_6, myStepPage, com.pega.pegarules.priv.FUAUtil.parseDouble(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", "Pega-RULES", "Utilities", new Object[] { "PegaAESRemote", "PEGA0106DetectionThreshold", "5000" })), "sEN", false, true);
}
{
    pega.setViaPropRef(".ElapsedThreshold", pRef_7, myStepPage, com.pega.pegarules.priv.FUAUtil.parseDouble(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", "Pega-RULES", "Utilities", new Object[] { "PegaAESRemote", "BadDBStateElapsedThreshold", "60000" })), "sEN", false, true);
}
{
    badstatethreshold = scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DOUBLE);
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
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * For Postgres DB - get the list of deadlocks else exit activity.
 * <p>
 * Step 4 <code>RDB-List</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "RDB-List");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RulesEngine:DBSchemaUtils).pzIsPostgreSQLDB(tools)");
try {
boolean pz_9 = (pega.<Boolean>resolveMethodCall("pzIsPostgreSQLDB--(PublicAPI)", "pzIsPostgreSQLDB", "Pega-RulesEngine", "DBSchemaUtils", new Object[] { tools })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RulesEngine:DBSchemaUtils).pzIsPostgreSQLDB(tools)",pz_9);
if (!pz_9) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PushDeadlockInfo - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RulesEngine:DBSchemaUtils).pzIsPostgreSQLDB(tools) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("RDB-List", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  RDB-List
// Expression: GetDeadlockList
// Expression: PostgreSQL
// Expression: PegaAESRemote-Interface-DeadlockInfo
// Expression: 10000
String pz_10 = Integer.toString(10000);
// Expression: DeadlockList
ClipboardPage myBrowseSQLPage = tools.getThread().createPage("Code-Pega-List", "DeadlockList");
// set pyObjClass property on pySQLBrowse page
ClipboardProperty var_pySQLBrowse_pyObjClass;
var_pySQLBrowse_pyObjClass = myBrowseSQLPage.getProperty(".pyObjClass");
var_pySQLBrowse_pyObjClass.setValue("PegaAESRemote-Interface-DeadlockInfo");

// set pyMaxRecords property on pySQLBrowse page
ClipboardProperty var_pySQLBrowse_pyMaxRecords;
var_pySQLBrowse_pyMaxRecords = myBrowseSQLPage.getProperty(".pyMaxRecords");
var_pySQLBrowse_pyMaxRecords.setValue(pz_10);

/* Set whether declaratives should be performed on the results. */final ClipboardProperty var_pySQLBrowse_pyApplyDeclarativesForRDB = myBrowseSQLPage.getProperty("pyApplyDeclarativesForRDB");
var_pySQLBrowse_pyApplyDeclarativesForRDB.setValue("false");

try {
tools.getDatabase().listRDB(myBrowseSQLPage, "GetDeadlockList", "PostgreSQL", true);
} catch (ConnectionException ce) {
throw new ResourceUnavailableException("RDB-List failed",ce.getHandler(),ce);
} catch (DatabaseException de) {
oLog.error("Error in RDB-List", de);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "DeadlockList.pxResultCount&gt;0");
try {
boolean pz_12 = (scalarValueQuery_11.resolveToInt(tools, pega.findPageWithException("DeadlockList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER) > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "DeadlockList.pxResultCount&gt;0",pz_12);
if (!pz_12) {
// branch to block BAD
nextBlock = "BAD";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("DeadlockList.pxResultCount&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "RDB-List",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Loop through deadlock list.
 * <p>
 * Step 5.0 <code>Java</code> [on page DeadlockList.pxResults] <br>
 */
public boolean step5_0_circum0() {
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

// Code to call nested step 5_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_1_circum0");
}
PRStackFrame pz_StackFrame5_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 5_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step5_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame5_1_circum0, false);
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
pz_CurrentStepNum = "5.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_0_circum0 definition

/**
 * Generate PEGA0106 alert.
 * <p>
 * Step 5.1 <code>Java</code><br>
 */
public boolean step5_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
HashStringMap map = new HashStringMap();
map.put("CustomActivityName","blocked_pid : " + myStepPage.getString("blockedpid") + " blocked_user :" + myStepPage.getString("blockeduser"));
map.put("CustomActivityClassName","blocking_pid : " + myStepPage.getString("blockingpid") + " blocking_user :" + myStepPage.getString("blockinguser"));
map.put("action","blocked_stmt : " + myStepPage.getString("blockedstatement"));
map.put("actionName","blocking_stmt : " + myStepPage.getString("blockingstatement"));
map.put("StreamName","blocked_ip : " + myStepPage.getString("blocked_ip") + " blocked_ap : " + myStepPage.getString("blockedap"));
map.put("StreamClass","blocking_ip : " + myStepPage.getString("blocking_ip") + " blocking_ap : " + myStepPage.getString("blockingap"));

map.put("TaskStatus","blocked_duration : " +  myStepPage.getString("blocked_duration"));


String DeadlockMsg = "PEGA0106 database conflicting query detected. User '"+ myStepPage.getString("blockeduser") + "' PID " + myStepPage.getString("blockedpid") + " blocked by '" + myStepPage.getString("blockinguser") + "' PID " + myStepPage.getString("blockingpid") + ". Blocked statement was - " + myStepPage.getString("blockedstatement") + ". Blocking statement was - " + myStepPage.getString("blockingstatement");

oLog.alert("PEGA0106",DeadlockMsg,0,0,map,null);
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.generator.RuleNotFoundException rnf) {
// Handle RuleNotFoundException via pyOnException block defined for this step
FUAUtil.activityStepStatusUpdateForException(pega, rnf);
nextBlock = "BAD";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "BAD";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__1 = pega.invokeWhen("StepStatusFail", "PegaAESRemote-Interface-DeadlockInfo", "PegaAESRemote-Interface-DeadlockInfo");
if (pz__1) {
// branch to block BAD
nextBlock = "BAD";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "5.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_1_circum0 definition

/**
 * For Postgres DB - get the bad status of deadlocks else exit activity.
 * <p>
 * Step 6 [BAD] <code>RDB-List</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "RDB-List");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RulesEngine:DBSchemaUtils).pzIsPostgreSQLDB(tools)");
try {
boolean pz_14 = (pega.<Boolean>resolveMethodCall("pzIsPostgreSQLDB--(PublicAPI)", "pzIsPostgreSQLDB", "Pega-RulesEngine", "DBSchemaUtils", new Object[] { tools })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RulesEngine:DBSchemaUtils).pzIsPostgreSQLDB(tools)",pz_14);
if (!pz_14) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PushDeadlockInfo - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RulesEngine:DBSchemaUtils).pzIsPostgreSQLDB(tools) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("RDB-List", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  RDB-List
// Expression: GetDBBadStatus
// Expression: PostgreSQL
// Expression: PegaAESRemote-Interface-DeadlockInfo
// Expression: 10000
String pz_15 = Integer.toString(10000);
// Expression: BadStateList
ClipboardPage myBrowseSQLPage = tools.getThread().createPage("Code-Pega-List", "BadStateList");
// set pyObjClass property on pySQLBrowse page
ClipboardProperty var_pySQLBrowse_pyObjClass;
var_pySQLBrowse_pyObjClass = myBrowseSQLPage.getProperty(".pyObjClass");
var_pySQLBrowse_pyObjClass.setValue("PegaAESRemote-Interface-DeadlockInfo");

// set pyMaxRecords property on pySQLBrowse page
ClipboardProperty var_pySQLBrowse_pyMaxRecords;
var_pySQLBrowse_pyMaxRecords = myBrowseSQLPage.getProperty(".pyMaxRecords");
var_pySQLBrowse_pyMaxRecords.setValue(pz_15);

/* Set whether declaratives should be performed on the results. */final ClipboardProperty var_pySQLBrowse_pyApplyDeclarativesForRDB = myBrowseSQLPage.getProperty("pyApplyDeclarativesForRDB");
var_pySQLBrowse_pyApplyDeclarativesForRDB.setValue("false");

try {
tools.getDatabase().listRDB(myBrowseSQLPage, "GetDBBadStatus", "PostgreSQL", true);
} catch (ConnectionException ce) {
throw new ResourceUnavailableException("RDB-List failed",ce.getHandler(),ce);
} catch (DatabaseException de) {
oLog.error("Error in RDB-List", de);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "BadStateList.pxResultCount&gt;0");
try {
boolean pz_16 = (scalarValueQuery_11.resolveToInt(tools, pega.findPageWithException("BadStateList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER) > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "BadStateList.pxResultCount&gt;0",pz_16);
if (!pz_16) {
// branch to block CLEANUP
nextBlock = "CLEANUP";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("BadStateList.pxResultCount&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "RDB-List",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Loop through bad state list.
 * <p>
 * Step 7.0 <code>Java</code> [on page BadStateList.pxResults] <br>
 */
public boolean step7_0_circum0() {
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

// Code to call nested step 7_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_1_circum0");
}
PRStackFrame pz_StackFrame7_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT Step: 7_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_1_circum0, false);
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
pz_CurrentStepNum = "7.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_0_circum0 definition

/**
 * Generate DBMS0010 alert.
 * <p>
 * Step 7.1 <code>Java</code><br>
 */
public boolean step7_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
HashStringMap map = new HashStringMap();

map.put("action", "process_id : "+ myStepPage.getString("pid") + ", state_change : " + myStepPage.getString("schange") + ", client_address : " + myStepPage.getString("clientaddress") + ", application_name : " + myStepPage.getString("appname")+", query : "+ myStepPage.getString("query") ) ;
map.put("actionName", "query_start : "+ myStepPage.getString("qstart") + ", xact_start : "+ myStepPage.getString("xstart") +", elapsed_time : "+ myStepPage.getString("elapsed") );
map.put("StreamName","Reason for bad state : " + myStepPage.getString("state"));

long kObservedKPI = 0l;
long kThresholdKPI = 0l;
try {
  String value = myStepPage.getString("elapsed");
  value = value.substring(0, value.indexOf('.'));
  kObservedKPI = Long.parseLong(value);
} catch (NumberFormatException  nfe) {
  kObservedKPI = 0l;
}
try {
  String value = badstatethreshold;
  value = value.substring(0, value.indexOf('.'));
  kThresholdKPI = Long.parseLong(value);
} catch (NumberFormatException  nfe) {
  kThresholdKPI = 0l;
}

String BadStateMsg = "Database pid ["+myStepPage.getString("pid")+"] in state ["+myStepPage.getString("state")+"] for " +kObservedKPI+ " ms, the threshold is " +kThresholdKPI+ " ms" + ", last query : ["+myStepPage.getString("query")+"]";

oLog.alert("DBMS0010",BadStateMsg,kObservedKPI,kThresholdKPI,map,null);
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.generator.RuleNotFoundException rnf) {
// Handle RuleNotFoundException via pyOnException block defined for this step
FUAUtil.activityStepStatusUpdateForException(pega, rnf);
nextBlock = "CLEANUP";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "CLEANUP";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__3 = pega.invokeWhen("StepStatusFail", "PegaAESRemote-Interface-DeadlockInfo", "PegaAESRemote-Interface-DeadlockInfo");
if (pz__3) {
// branch to block CLEANUP
nextBlock = "CLEANUP";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_1_circum0 definition

/**
 * Remove unused pages.
 * <p>
 * Step 8 [CLEANUP] <code>Page-Remove</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: DeadlockList
pageRemove(tools.findPage("DeadlockList"));
// Expression: BadStateList
pageRemove(tools.findPage("BadStateList"));
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
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Clear Activity Status.
 * <p>
 * Step 9 <code>Activity-Clear-Status</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Activity-Clear-Status", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Activity-Clear-Status
tools.getActivityStatus().clear();
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
pz_CurrentStepNum = "9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

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

public Object Appender = null;
public String badstatethreshold = "";
public Object HelperAPI = null;
public String NodeName = "";
public String NodeID = "";
public StringBuffer sb = new StringBuffer();

public void initializeUserLocalVariables() {
	Appender = null;
	badstatethreshold = "";
	HelperAPI = null;
	NodeName = "";
	NodeID = "";
	sb = new StringBuffer();
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("Appender", (Appender == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : Appender.toString());
	smRetVal.putString("badstatethreshold", (badstatethreshold == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : badstatethreshold.toString());
	smRetVal.putString("HelperAPI", (HelperAPI == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : HelperAPI.toString());
	smRetVal.putString("NodeName", (NodeName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : NodeName.toString());
	smRetVal.putString("NodeID", (NodeID == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : NodeID.toString());
	smRetVal.putString("sb", (sb == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : sb.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_6 = new String[] { "", "", "DeadlockThreshold", "" };
public static final String[] pRef_7 = new String[] { "", "", "ElapsedThreshold", "" };
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pxResultCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("ElapsedThreshold").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-DEADLOCKINFO PUSHDEADLOCKINFO #20211021T110415.955 GMT", "PegaAESRemote-Interface-DeadlockInfo PushDeadlockInfo", "PegaAESRemote", "08-07-01", false, true, "", "ACTIVITY", "20211021T110415.955 GMT" ,"Rule-Obj-Activity"); }
