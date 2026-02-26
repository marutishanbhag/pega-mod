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
public class ra_action_pzprocessusagedata_a866f23e09811833abb59dd37f9c3459 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzProcessUsageData.Data_DM_DecisionUsage.Action");
	public ra_action_pzprocessusagedata_a866f23e09811833abb59dd37f9c3459(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT	Pega-DecisionEngine:08-23-02	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Continue"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 6 Circum: 0" );
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
String pz_10 = "RepoFiles";
thisStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 8_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_12 = pega.findDataPage("D_pxListFiles", true, "folderPath", tools.getParamValue("SourceFolderPath"), "repositoryName", tools.getParamValue("RepositoryName")).getIfPresent("pxResults");
pageRef = pz_12;
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
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 9_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
// all the steps that are defined to be in block :  will be defined with this repeat loop
ClipboardPage myStepPage = tools.getStepPage();
// Expression: 1
// Expression: Local.hoursDiff
// Expression: 1
if (1 <= 0) {
throw new PRRuntimeException("Invalid increment value - must be a positive integer");}
for (forEachCounter = 1;(forEachCounter <= hoursDiff) && (pz_Status == true) && ((nextBlock.equals("")) || (nextBlock.equals("")))
; forEachCounter = forEachCounter + 1)
{
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_0_circum0");
}
PRStackFrame pz_StackFrame9_0_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 9_0 Circum: 0" );
try {
pz_Status = step9_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
}//close the for loop
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 10_0_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Queue"))) {
nextBlock = "";
ClipboardProperty pz_20 = tools.getPrimaryPage().getIfPresent("pxResults");
pageRef = pz_20;
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
{
if (pz_Status == true && (nextBlock.equals("") || nextBlock.equals("Queue"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_0_circum0");
}
PRStackFrame pz_StackFrame10_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 10_0 Circum: 0" );
try {
pz_Status = step10_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 12_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 13_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("End"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_circum0");
}
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
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
	"Rule-Obj-Activity:PZPROCESSUSAGEDATA"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPROCESSUSAGEDATA","Rule-Obj-Activity","DATA-DM-DECISIONUSAGE",false,"","Pega-DecisionEngine","08-23-02","RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT","!PZPROCESSUSAGEDATA",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1145058612)
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
//	RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT:20231115T141156.257 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "433174b5df620c7876636e479c2b38fb";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-DM-DecisionUsage";
	}
public String getAspect() {
return "Action";
}
/**
 * skip if non cdh system.
 * <p>
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"PegaMKT-Install\",\"MKTCurrentVersion\")!=\"\"");
try {
boolean pz_3 = (!(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "PegaMKT-Install", "MKTCurrentVersion" }).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"PegaMKT-Install\",\"MKTCurrentVersion\")!=\"\"",pz_3);
if (!pz_3) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzProcessUsageData - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@getDataSystemSetting(\"PegaMKT-Install\",\"MKTCurrentVersion\")!=\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\"");
try {
boolean pz_4 = (!(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/monitor/capturedecisionusage" }).equals("true")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\"",pz_4);
if (pz_4) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzProcessUsageData - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java

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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * set the mergedfilecutoffTime and sessionTimeWindow.
 * <p>
 * Step 2 <code>Property-Set</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    mergefilecutoffTime = pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/monitor/filemergecutoff", "19700101T000000.000 GMT" });
}
{
    sessionTimeWindowInDSS = pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/monitor/sessionWIndowInMins", Integer.toString(30) });
}
{
    sessionTimeWindowInDSS = ((sessionTimeWindowInDSS.compareTo(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/monitor/maxSessionWIndowInMins", Integer.toString(60) })) > 0) ? pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/monitor/maxSessionWIndowInMins", Integer.toString(60) }) : sessionTimeWindowInDSS);
}
{
    aggregationTimeWindowInDSS = pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/monitor/aggregationWindowInMins", Integer.toString(30) });
}
{
    aggregationTimeWindow = Integer.toString(((pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, "String", new Object[] { sessionTimeWindowInDSS })).intValue() + (pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, "String", new Object[] { aggregationTimeWindowInDSS })).intValue()));
}
{
    sessionTimeWindow = ("-" + sessionTimeWindowInDSS);
}
{
    aggregationTimeWindow = ("-" + aggregationTimeWindow);
}
{
    fileSnapshotWindowInDSS = pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/threshold/WriteToFileThresholdInSeconds", Integer.toString(900) });
}
{
    fileSnapshotWindow = ("-" + fileSnapshotWindowInDSS);
}
{
    tools.putParamValue("CurrentDelayTime", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, "DateTime", new Object[] { PRDateFormat.formatIDT(System.currentTimeMillis()), "", "", "", fileSnapshotWindow }));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Set the start and end date time incase 1st time checking with default date.
 * <p>
 * Step 3 <code>Property-Set</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.mergefilecutoffTime==\"19700101T000000.000 GMT\"");
try {
boolean pz_5 = (mergefilecutoffTime.equals("19700101T000000.000 GMT"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.mergefilecutoffTime==\"19700101T000000.000 GMT\"",pz_5);
if (!pz_5) {
// branch to block Continue
nextBlock = "Continue";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.mergefilecutoffTime==\"19700101T000000.000 GMT\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).pyTextValue(1)", pRef_6, tools.getPrimaryPage(), pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, "DateTime", new Object[] { (pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { tools.getParamValue("CurrentDelayTime"), 0, 11 }) + "0000.000 GMT"), "", "", aggregationTimeWindow, "" }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyTextValue(2)", pRef_7, tools.getPrimaryPage(), (pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { tools.getParamValue("CurrentDelayTime"), 0, 11 }) + "0000.000 GMT"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyTextValue(3)", pRef_8, tools.getPrimaryPage(), pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, "DateTime", new Object[] { (pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { tools.getParamValue("CurrentDelayTime"), 0, 11 }) + "0000.000 GMT"), "", "", "", fileSnapshotWindowInDSS }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_9, tools.getPrimaryPage(), "Data-DM-DecisionUsage", "sIY", false, true);
}
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
nextBlock = "End";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "End";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__1 = pega.invokeWhen("Always", "Data-DM-DecisionUsage", "Data-DM-DecisionUsage");
if (pz__1) {
// branch to block Queue
nextBlock = "Queue";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Set the hoursDiff to look for all the remaining files.
 * <p>
 * Step 4 [Continue] <code>Property-Set</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    hoursDiff = FUAUtil.intValue((pega.<Double>resolveMethodCall("DateTimeDifference--(String,String,String)", "DateTimeDifference", null, "DateTime", new Object[] { mergefilecutoffTime, (pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { tools.getParamValue("CurrentDelayTime"), 0, 13 }) + "00.000 GMT"), "m" })).doubleValue());
}
{
    hoursDiff = ((pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, null, new Object[] { Integer.toString(hoursDiff) })).intValue() / (pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, null, new Object[] { aggregationTimeWindowInDSS })).intValue());
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Get Repository name.
 * <p>
 * Step 5 <code>Call pxGetUsageDataRepository</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxGetUsageDataRepository");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxGetUsageDataRepository", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxGetUsageDataRepository
if (myStepPage == null) {
}
// Calling Activity : pxGetUsageDataRepository
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxGetUsageDataRepository", "Data-DM-DecisionUsage", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxGetUsageDataRepository",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Get offset time and server time.
 * <p>
 * Step 6 <code>Property-Set</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("RepositoryName", PropertyInfo.TYPE_TEXT, tools.getParamValue("RepositoryName"));
}
{
    tools.putParamValue("SourceFolderPath", PropertyInfo.TYPE_TEXT, ((!(pega.<String>resolveMethodCall("whatComesBeforeLast--(String,char)", "whatComesBeforeLast", null, "String", new Object[] { tools.getParamValue("FilePath"), '/' }).equals(""))) ? (pega.<String>resolveMethodCall("whatComesBeforeLast--(String,char)", "whatComesBeforeLast", null, "String", new Object[] { tools.getParamValue("FilePath"), '/' }) + "/") : pega.<String>resolveMethodCall("whatComesBeforeLast--(String,char)", "whatComesBeforeLast", null, "String", new Object[] { tools.getParamValue("FilePath"), '/' })));
}
{
    tools.putParamValue("currentGMTTime", PropertyInfo.TYPE_TEXT, (pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { PRDateFormat.formatIDT(System.currentTimeMillis()), 0, 13 }) + "00.000 GMT"));
}
{
    tools.putParamValue("currentServerTime", PropertyInfo.TYPE_TEXT, (pega.<String>resolveMethodCall("whatComesBeforeFirst--(String,char)", "whatComesBeforeFirst", null, "String", new Object[] { pega.<String>resolveMethodCall("FormatDateTime--(String,String,String,String)", "FormatDateTime", null, "DateTime", new Object[] { tools.getParamValue("currentGMTTime"), "", "", "" }), ' ' }) + " GMT"));
}
{
    offSetToGMT = Double.toString((pega.<Double>resolveMethodCall("DateTimeDifference--(String,String,String)", "DateTimeDifference", null, "DateTime", new Object[] { tools.getParamValue("currentServerTime"), tools.getParamValue("currentGMTTime"), "m" })).doubleValue());
}
{
    offSetToServer = Double.toString((pega.<Double>resolveMethodCall("DateTimeDifference--(String,String,String)", "DateTimeDifference", null, "DateTime", new Object[] { tools.getParamValue("currentGMTTime"), tools.getParamValue("currentServerTime"), "m" })).doubleValue());
}
{
    offSetToGMT = pega.<String>resolveMethodCall("whatComesBeforeFirst--(String,char)", "whatComesBeforeFirst", null, "String", new Object[] { offSetToGMT, '.' });
}
{
    offSetToServer = pega.<String>resolveMethodCall("whatComesBeforeFirst--(String,char)", "whatComesBeforeFirst", null, "String", new Object[] { offSetToServer, '.' });
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
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Create page.
 * <p>
 * Step 7 <code>Page-New</code> [on page RepoFiles] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_11 = "RepoFiles";
myStepPage = tools.findPage(pz_11, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","RepoFiles",false); 
// primary page will not be added to PageList
	 pega.setStepPage("RepoFiles", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Loop over pxListFiles and copy to the clipboard page.
 * <p>
 * Step 8 <code>Property-Set</code> [on page D_pxListFiles[repositoryName:Param.RepositoryName,folderPath:Param.SourceFolderPath].pxResults] <br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.startsWith(.pyName,\".\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.startsWith(.pyName,\".\")", "FUAInstance-NullMyStepPage");
}
boolean pz_14 = (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, "String", new Object[] { scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "." })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.startsWith(.pyName,\".\")",pz_14);
if (pz_14) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.startsWith(.pyName,\".\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).pyName", pRef_15, pega.findPageWithException("RepoFiles", "Code-Pega-List"), scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyPath", pRef_16, pega.findPageWithException("RepoFiles", "Code-Pega-List"), scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    tools.putParamValue("filePath", PropertyInfo.TYPE_TEXT, scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    fileDateTime = (((((pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { pega.<String>resolveMethodCall("whatComesAfterLast--(String,char)", "whatComesAfterLast", null, "String", new Object[] { tools.getParamValue("filePath"), '-' }), 0, 8 }) + "T") + pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { pega.<String>resolveMethodCall("whatComesAfterLast--(String,char)", "whatComesAfterLast", null, "String", new Object[] { tools.getParamValue("filePath"), '-' }), 8, 14 })) + ".") + pega.<String>resolveMethodCall("whatComesAfterLast--(String,char)", "whatComesAfterLast", null, "String", new Object[] { tools.getParamValue("filePath"), '_' })) + " GMT");
}
{
    IsValidDate = (pega.<Boolean>resolveMethodCall("pxContainsViaRegex--(String,String,boolean)", "pxContainsViaRegex", null, null, new Object[] { fileDateTime, "[0-9]{8}T[0-9]{6}[.][0-9]{3}?( GMT)+?", true })).booleanValue();
}
{
    tools.putParamValue("FileCreationDateTime", PropertyInfo.TYPE_DATETIME, com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, ((IsValidDate == tools.interpretBoolean("true")) ? pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, "DateTime", new Object[] { fileDateTime, "", "", offSetToGMT, "" }) : "")));
}
{
    pega.setViaPropRef(".pxResults(<last>).pxCreateDateTime", pRef_18, pega.findPageWithException("RepoFiles", "Code-Pega-List"), tools.getParamValue("FileCreationDateTime"), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyTempTrueFalse", pRef_19, pega.findPageWithException("RepoFiles", "Code-Pega-List"), IsValidDate, "sSN", false, true);
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
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Loop all the time difference and prepare the timewindow.
 * <p>
 * Step 9.0 <code>Property-Set</code><br>
 */
public boolean step9_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    startTimeAdjust = ((tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "pyForEachCount") == 1) ? 0 : (((pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, "String", new Object[] { tools.getParamValue("pyForEachCount") })).intValue() - 1) * (pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, "String", new Object[] { aggregationTimeWindowInDSS })).intValue()));
}
{
    adjustInMins = com.pega.pegarules.priv.FUAUtil.parseInt(sessionTimeWindowInDSS);
}
{
    convertForEachCount = Integer.toString(((tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "pyForEachCount") == 1) ? (pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, "String", new Object[] { aggregationTimeWindowInDSS })).intValue() : ((pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, "String", new Object[] { tools.getParamValue("pyForEachCount") })).intValue() * (pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, "String", new Object[] { aggregationTimeWindowInDSS })).intValue())));
}
{
    reduceSessionTime = (startTimeAdjust - adjustInMins);
}
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

// Code to call nested step 9_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_1_circum0");
}
PRStackFrame pz_StackFrame9_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 9_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_1_circum0, false);
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
pz_CurrentStepNum = "9.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_0_circum0 definition

/**
 * Set the start and end time.
 * <p>
 * Step 9.1 <code>Property-Set</code><br>
 */
public boolean step9_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).pyTextValue(1)", pRef_6, tools.getPrimaryPage(), pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, "DateTime", new Object[] { mergefilecutoffTime, "", "", Integer.toString(reduceSessionTime), "" }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyTextValue(2)", pRef_7, tools.getPrimaryPage(), pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, "DateTime", new Object[] { mergefilecutoffTime, "", "", convertForEachCount, "" }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyTextValue(3)", pRef_8, tools.getPrimaryPage(), pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, "DateTime", new Object[] { mergefilecutoffTime, "", "", convertForEachCount, fileSnapshotWindowInDSS }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_9, tools.getPrimaryPage(), "Data-DM-DecisionUsage", "sIY", false, true);
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
pz_CurrentStepNum = "9.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_1_circum0 definition

/**
 * Pass each time window to a queue processor to process the file independently.
 * <p>
 * Step 10.0 [Queue] <code>Property-Set</code> [on page Primary.pxResults] <br>
 */
public boolean step10_0_circum0() {
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
    tools.putParamValue("StartDateTime", PropertyInfo.TYPE_TEXT, scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("EndDateTime", PropertyInfo.TYPE_TEXT, scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
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

// Code to call nested step 10_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_1_circum0");
}
PRStackFrame pz_StackFrame10_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 10_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step10_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame10_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 10_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_2_circum0");
}
PRStackFrame pz_StackFrame10_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT Step: 10_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step10_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame10_2_circum0, false);
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
pz_CurrentStepNum = "10.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_0_circum0 definition

/**
 * Get required files for aggregation.
 * <p>
 * Step 10.1 <code>Call pzGetFilesForAggregation</code><br>
 */
public boolean step10_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetFilesForAggregation");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzGetFilesForAggregation", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzGetFilesForAggregation
if (myStepPage == null) {
}
// Calling Activity : pzGetFilesForAggregation
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzGetFilesForAggregation", "Data-DM-DecisionUsage", "");
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
pz_CurrentStepNum = "10.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetFilesForAggregation",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_1_circum0 definition

/**
 * Call the dedicated QP.
 * <p>
 * Step 10.2 <code>Queue-For-Processing</code><br>
 */
public boolean step10_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Queue-For-Processing");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@SizeOfPropertyList(.pzRepoFiles)&gt;0");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@SizeOfPropertyList(.pzRepoFiles)>0", "FUAInstance-NullMyStepPage");
}
boolean pz_23 = ((pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { myStepPage.getProperty("pzRepoFiles") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@SizeOfPropertyList(.pzRepoFiles)&gt;0",pz_23);
if (!pz_23) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@SizeOfPropertyList(.pzRepoFiles)&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Queue-For-Processing", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Queue-For-Processing
// Expression: 
// Expression: pzComputeDecisionUsage
	if (myStepPage == null) {
		throw new InvalidReferenceException("", "this step page does not exist and cannot be used");
	}
	else {
			QueueProcessorLockConfiguration lockConfig = QueueProcessorLockConfiguration.getConfigForNoLock();
			EnqueueOperationConfig enqueueConfig = new EnqueueOperationBuilder().withLockConfiguration(lockConfig)
			.withActivityStepExecutionContext(new ActivityStepExecutionContext("Data-DM-DecisionUsage", "pzProcessUsageData", "13", "Pega-DecisionEngine", "08-23-02", "0"))
			.writeNow()
			.withSnapshot()
			.build();
			String itemId = tools.getThread().getDedicatedQueueProcessor("pzComputeDecisionUsage").enqueue(myStepPage, enqueueConfig);
	 tools.getParameterPage().putString("pxItemID", itemId);
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
pz_CurrentStepNum = "10.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Queue-For-Processing",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_2_circum0 definition

/**
 * Set the lastUpdateDateTime to a local variable from the last results.
 * <p>
 * Step 11 <code>Property-Set</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Utilities.LengthOfPageList(Primary.pxResults) &gt; 0");
try {
boolean pz_24 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, "Utilities", new Object[] { tools.getPrimaryPage().getProperty("pxResults") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Utilities.LengthOfPageList(Primary.pxResults) &gt; 0",pz_24);
if (!pz_24) {
// branch to block End
nextBlock = "End";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Utilities.LengthOfPageList(Primary.pxResults) &gt; 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    lastUpdateDateTime = pega.getStringValueViaPropRef(".pxResults(<last>).pyTextValue(2)", pRef_7, tools.getPrimaryPage(), false, false, false);
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
pz_CurrentStepNum = "11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Set the lastUpdateDateTime  to a DSS to look the next job run pick from this date.
 * <p>
 * Step 12 <code>Call pxSetDynamicSystemSetting</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.lastUpdateDateTime!=\"\"");
try {
boolean pz_25 = (!(lastUpdateDateTime.equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.lastUpdateDateTime!=\"\"",pz_25);
if (!pz_25) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.lastUpdateDateTime!=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxSetDynamicSystemSetting", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxSetDynamicSystemSetting
if (myStepPage == null) {
}
// Calling Activity : pxSetDynamicSystemSetting

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: decision/usage/monitor/filemergecutoff
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, "decision/usage/monitor/filemergecutoff");
// Expression: Local.lastUpdateDateTime
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, lastUpdateDateTime);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: Pega-DecisionEngine
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, "Pega-DecisionEngine");

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "Data-DM-DecisionUsage", "");
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
pz_CurrentStepNum = "12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * End.
 * <p>
 * Step 13 [End] <code>Page-Remove</code><br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: RepoFiles
pageRemove(tools.findPage("RepoFiles"));
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
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

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

public String lastUpdateDateTime = "";
public String aggregationTimeWindowInDSS = "";
public int reduceSessionTime = 0;
public int adjustInMins = 0;
public String mergefilecutoffTime = "";
public String fileSnapshotWindowInDSS = "";
public String offSetToGMT = "";
public int startTimeAdjust = 0;
public String fileDateTime = "";
public int hoursDiff = 0;
public boolean IsValidDate = false;
public String sessionTimeWindow = "";
public String convertForEachCount = "";
public String sessionTimeWindowInDSS = "";
public String offSetToServer = "";
public String aggregationTimeWindow = "";
public String fileSnapshotWindow = "";

public void initializeUserLocalVariables() {
	lastUpdateDateTime = "";
	aggregationTimeWindowInDSS = "";
	reduceSessionTime = 0;
	adjustInMins = 0;
	mergefilecutoffTime = "";
	fileSnapshotWindowInDSS = "";
	offSetToGMT = "";
	startTimeAdjust = 0;
	fileDateTime = "";
	hoursDiff = 0;
	IsValidDate = false;
	sessionTimeWindow = "";
	convertForEachCount = "";
	sessionTimeWindowInDSS = "";
	offSetToServer = "";
	aggregationTimeWindow = "";
	fileSnapshotWindow = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("lastUpdateDateTime", (lastUpdateDateTime == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : lastUpdateDateTime.toString());
	smRetVal.putString("aggregationTimeWindowInDSS", (aggregationTimeWindowInDSS == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : aggregationTimeWindowInDSS.toString());
	smRetVal.putString("reduceSessionTime", Integer.toString(reduceSessionTime));
	smRetVal.putString("adjustInMins", Integer.toString(adjustInMins));
	smRetVal.putString("mergefilecutoffTime", (mergefilecutoffTime == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : mergefilecutoffTime.toString());
	smRetVal.putString("fileSnapshotWindowInDSS", (fileSnapshotWindowInDSS == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : fileSnapshotWindowInDSS.toString());
	smRetVal.putString("offSetToGMT", (offSetToGMT == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : offSetToGMT.toString());
	smRetVal.putString("startTimeAdjust", Integer.toString(startTimeAdjust));
	smRetVal.putString("fileDateTime", (fileDateTime == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : fileDateTime.toString());
	smRetVal.putString("hoursDiff", Integer.toString(hoursDiff));
	smRetVal.putString("IsValidDate", Boolean.toString(IsValidDate));
	smRetVal.putString("sessionTimeWindow", (sessionTimeWindow == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : sessionTimeWindow.toString());
	smRetVal.putString("convertForEachCount", (convertForEachCount == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : convertForEachCount.toString());
	smRetVal.putString("sessionTimeWindowInDSS", (sessionTimeWindowInDSS == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : sessionTimeWindowInDSS.toString());
	smRetVal.putString("offSetToServer", (offSetToServer == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : offSetToServer.toString());
	smRetVal.putString("aggregationTimeWindow", (aggregationTimeWindow == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : aggregationTimeWindow.toString());
	smRetVal.putString("fileSnapshotWindow", (fileSnapshotWindow == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : fileSnapshotWindow.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_19 = new String[] { "", "", "pxResults", "<last>", "pyTempTrueFalse", "" };
public static final String[] pRef_16 = new String[] { "", "", "pxResults", "<last>", "pyPath", "" };
public static final String[] pRef_15 = new String[] { "", "", "pxResults", "<append>", "pyName", "" };
public static final String[] pRef_8 = new String[] { "", "", "pxResults", "<last>", "pyTextValue", "3" };
public static final String[] pRef_18 = new String[] { "", "", "pxResults", "<last>", "pxCreateDateTime", "" };
public static final String[] pRef_6 = new String[] { "", "", "pxResults", "<append>", "pyTextValue", "1" };
public static final String[] pRef_7 = new String[] { "", "", "pxResults", "<last>", "pyTextValue", "2" };
public static final String[] pRef_9 = new String[] { "", "", "pxResults", "<last>", "pxObjClass", "" };
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarList("pyTextValue", 3).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyPath").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarList("pyTextValue", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pyName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZPROCESSUSAGEDATA #20231115T141156.257 GMT", "Data-DM-DecisionUsage pzProcessUsageData", "Pega-DecisionEngine", "08-23-02", false, true, "", "ACTIVITY", "20231115T141156.257 GMT" ,"Rule-Obj-Activity"); }
