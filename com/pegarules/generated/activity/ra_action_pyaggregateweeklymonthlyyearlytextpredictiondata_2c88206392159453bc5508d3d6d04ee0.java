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
public class ra_action_pyaggregateweeklymonthlyyearlytextpredictiondata_2c88206392159453bc5508d3d6d04ee0 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyAggregateWeeklyMonthlyYearlyTextPredictionData.Data_NLP_Reporting.Action");
	public ra_action_pyaggregateweeklymonthlyyearlytextpredictiondata_2c88206392159453bc5508d3d6d04ee0(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT	Pega-NLP:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT";
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_2 = "DailySnapshotList";
thisStepPage = tools.findPage(pz_2, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 3 Circum: 0" );
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
ClipboardProperty pz_4 = pega.findPageWithException("DailySnapshotList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_4;
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
pz_CurrentStepNum = "4.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_0_circum0");
}
PRStackFrame pz_StackFrame4_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_0 Circum: 0" );
try {
pz_Status = step4_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ERR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 7 Circum: 0" );
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
	"Rule-Obj-Activity:PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA","Rule-Obj-Activity","DATA-NLP-REPORTING",false,"","Pega-NLP","08-06-01","RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT","!PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1656549466)
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
//	RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT:20210211T064250.205 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "dbd43589fb6ce452c8ba049820d17ab2";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-NLP-Reporting";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1 <code>Page-New</code> [on page DailySnapshotList] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_3 = "DailySnapshotList";
myStepPage = tools.findPage(pz_3, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","DailySnapshotList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("DailySnapshotList", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
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
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "pyGetDailySnapshotRowsForAggregation");
}
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Data-NLP-Snapshot");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "DailySnapshotList");
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
 * get all Daily snapshots which are not yet aggregated.
 * <p>
 * Step 3 <code>Call Rule-Obj-Report-Definition.pxRetrieveReportData</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Rule-Obj-Report-Definition.pxRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Rule-Obj-Report-Definition.pxRetrieveReportData
if (myStepPage == null) {
}
// Calling Activity : Rule-Obj-Report-Definition.pxRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "Data-NLP-Reporting", "Rule-Obj-Report-Definition");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * iterate over daily snapshots.
 * <p>
 * Step 4.0 <code>Java</code> [on page DailySnapshotList.pxResults] <br>
 */
public boolean step4_0_circum0() {
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
String pz_5 = "DailySnapshot";
nestedStepPage = tools.findPage(pz_5, true);
PRStackFrame pz_StackFrame4_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_1 Circum: 0" );
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
String pz_6 = "SnapshotListWeekly";
nestedStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame4_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_2 Circum: 0" );
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
String pz_7 = "SnapshotListMonthly";
nestedStepPage = tools.findPage(pz_7, true);
PRStackFrame pz_StackFrame4_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_3 Circum: 0" );
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

// Code to call nested step 4_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_4_circum0");
}
String pz_8 = "SnapshotWeekly";
nestedStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame4_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_5_circum0");
}
String pz_9 = "SnapshotMonthly";
nestedStepPage = tools.findPage(pz_9, true);
PRStackFrame pz_StackFrame4_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_6_circum0");
}
PRStackFrame pz_StackFrame4_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_7_circum0");
}
PRStackFrame pz_StackFrame4_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_8_circum0");
}
PRStackFrame pz_StackFrame4_8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_9_circum0");
}
String pz_10 = "SnapshotWeekly";
nestedStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame4_9_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_10_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("New"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_10_circum0");
}
PRStackFrame pz_StackFrame4_10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_11_circum0");
}
String pz_11 = "SnapshotWeekly";
nestedStepPage = tools.findPage(pz_11, true);
PRStackFrame pz_StackFrame4_11_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_12_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Next"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_12_circum0");
}
PRStackFrame pz_StackFrame4_12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_13_circum0");
}
PRStackFrame pz_StackFrame4_13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_13 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_13_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_14_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_14_circum0");
}
PRStackFrame pz_StackFrame4_14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_14 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_14_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_15_circum0");
}
String pz_12 = "SnapshotMonthly";
nestedStepPage = tools.findPage(pz_12, true);
PRStackFrame pz_StackFrame4_15_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_15 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_15_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_16_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("New1"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_16_circum0");
}
PRStackFrame pz_StackFrame4_16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_16 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_16_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_17_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_17_circum0");
}
String pz_13 = "SnapshotMonthly";
nestedStepPage = tools.findPage(pz_13, true);
PRStackFrame pz_StackFrame4_17_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_17 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_17_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_18_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Next2"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_18_circum0");
}
PRStackFrame pz_StackFrame4_18_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_18 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_18_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_18_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_19_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.19";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_19_circum0");
}
PRStackFrame pz_StackFrame4_19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT Step: 4_19 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_19_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_19_circum0, false);
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
} // end of step4_0_circum0 definition

/**
 * Step 4.1 <code>Page-New</code> [on page DailySnapshot] <br>
 */
public boolean step4_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_14 = "DailySnapshot";
myStepPage = tools.findPage(pz_14, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-NLP-Snapshot","DailySnapshot",false); 
// primary page will not be added to PageList
	 pega.setStepPage("DailySnapshot", myStepPage);
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
pz_CurrentStepNum = "4.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_1_circum0 definition

/**
 * Step 4.2 <code>Page-New</code> [on page SnapshotListWeekly] <br>
 */
public boolean step4_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_15 = "SnapshotListWeekly";
myStepPage = tools.findPage(pz_15, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","SnapshotListWeekly",false); 
// primary page will not be added to PageList
	 pega.setStepPage("SnapshotListWeekly", myStepPage);
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
pz_CurrentStepNum = "4.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_2_circum0 definition

/**
 * Step 4.3 <code>Page-New</code> [on page SnapshotListMonthly] <br>
 */
public boolean step4_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_16 = "SnapshotListMonthly";
myStepPage = tools.findPage(pz_16, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","SnapshotListMonthly",false); 
// primary page will not be added to PageList
	 pega.setStepPage("SnapshotListMonthly", myStepPage);
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
pz_CurrentStepNum = "4.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_3_circum0 definition

/**
 * Step 4.4 <code>Page-New</code> [on page SnapshotWeekly] <br>
 */
public boolean step4_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_17 = "SnapshotWeekly";
myStepPage = tools.findPage(pz_17, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-NLP-Snapshot","SnapshotWeekly",false); 
// primary page will not be added to PageList
	 pega.setStepPage("SnapshotWeekly", myStepPage);
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
pz_CurrentStepNum = "4.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_4_circum0 definition

/**
 * Step 4.5 <code>Page-New</code> [on page SnapshotMonthly] <br>
 */
public boolean step4_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_18 = "SnapshotMonthly";
myStepPage = tools.findPage(pz_18, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-NLP-Snapshot","SnapshotMonthly",false); 
// primary page will not be added to PageList
	 pega.setStepPage("SnapshotMonthly", myStepPage);
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
pz_CurrentStepNum = "4.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_5_circum0 definition

/**
 * Get corresponding weekly snapshot record if available.
 * <p>
 * Step 4.6 <code>Java</code><br>
 */
public boolean step4_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
try {
com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase) tools.getDatabase();
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pzInsKey", "pzInsKey"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyCount", "pyCount"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyAverageValue", "pyAverageValue")
         )
	.from("Data-NLP-Snapshot","A")
	.where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("B", ".pyPredictionID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyPredictionId"), true),
       com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("C", ".pySnapShotDay", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyWeekOfSnapShotDay"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("D", ".pyKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyKey"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("E", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyType"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("F", ".pyLanguage", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyLanguage"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("G", ".pyOutcome", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyOutcome"), true ),
		com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("H", ".pyFrequency", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, "Weekly", true ),
		com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("I", ".pyModelName", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyModelName"), true ),
         com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("J", ".pyModelName", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.ISNULL, "",false ),
           com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("K", ".pyKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.ISNULL, "",false )
		);
  
    if(org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && !org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    queryBuilder.filterLogic("B AND C AND D AND E AND F AND G AND H AND J");
  }
  if(org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    queryBuilder.filterLogic("B AND C AND K AND E AND F AND G AND H AND J");
  }
  if(!org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    queryBuilder.filterLogic("B AND C AND K AND E AND F AND G AND H AND I");
  }
  if(!org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && !org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    queryBuilder.filterLogic("B AND C AND D AND E AND F AND G AND H AND I");
  }
	
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("SnapshotListWeekly", queryBuilder, thread);

} 
catch(Exception e) 
{
  oLog.error("Failed to get aggregated snapshot rows for a given prediction and reportDate from pr_data_nlp_reporting");
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
pz_CurrentStepNum = "4.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_6_circum0 definition

/**
 * If available, copy the existing record into SnapshotWeekly page.
 * <p>
 * Step 4.7 <code>Page-Copy</code><br>
 */
public boolean step4_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@LengthOfPageList(SnapshotListWeekly.pxResults)&gt;0");
try {
boolean pz_19 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.findPageWithException("SnapshotListWeekly", "Code-Pega-List").getProperty("pxResults") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@LengthOfPageList(SnapshotListWeekly.pxResults)&gt;0",pz_19);
if (!pz_19) {
// branch to block New
nextBlock = "New";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@LengthOfPageList(SnapshotListWeekly.pxResults)&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: SnapshotListWeekly.pxResults(1)
ClipboardPage pz_21 = pageQuery_20.resolve(tools, pega.findPageWithException("SnapshotListWeekly", "Code-Pega-List"));
sourcePage = pz_21;
// Expression: SnapshotWeekly
targetPage = tools.findPage("SnapshotWeekly", false);
if (!(targetPage != null && sourcePage != null && targetPage == sourcePage)) {
if (targetPage != null) {
String pageClass = sourcePage != null ? sourcePage.getClassName() : targetPage.getClassName();
targetPage.clear();
targetPage.putString("pxObjClass", pageClass);
}

if ((targetPage != null) && (sourcePage != null)) {
targetPage.putAll(sourcePage, ClipboardPage.PUTALL_KEEPNEW);
targetPage.addMessages(sourcePage);
}
} // end self-ref check;
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
pz_CurrentStepNum = "4.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_7_circum0 definition

/**
 * update pyCount, pyAverageValue and pxUpdateDateTime.
 * <p>
 * Step 4.8 <code>Property-Set</code><br>
 */
public boolean step4_8_circum0() {
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
    pega.setViaPropRef(".pyAverageValue", pRef_22, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("divide--(com.pega.ibm.icu.math.BigDec6479e0195f6b35f17f2ac30d103972d9", "divide", null, null, new Object[] { ((scalarValueQuery_23.resolveToBigDecimal(tools, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_DOUBLE).multiply(scalarValueQuery_24.resolveToBigDecimal(tools, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_INTEGER))).add((scalarValueQuery_23.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_DOUBLE).multiply(scalarValueQuery_24.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER))))), BigDecimal.valueOf((scalarValueQuery_24.resolveToInt(tools, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_INTEGER) + scalarValueQuery_24.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER))) }).doubleValue(), "sEN", false, true);
}
{
    pega.setViaPropRef(".pyCount", pRef_25, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), (scalarValueQuery_24.resolveToInt(tools, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_INTEGER) + scalarValueQuery_26.resolveToInt(tools, pega.findPageWithException("DailySnapshotList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER, forEachCounter)), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_27, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "4.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_8_circum0 definition

/**
 * Update existing weekly snapshot record.
 * <p>
 * Step 4.9 <code>Java</code> [on page SnapshotWeekly] <br>
 */
public boolean step4_9_circum0() {
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
try {
com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase) tools.getDatabase();
			
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = 
						db.getNativeSQLBuilder()
						.updateInClass("Data-NLP-Snapshot")
						.updateForColumns(
								com.pega.pegarules.priv.database.sqlgen.NativeSQL.updateField("pyCount", tools.getStepPage().getString("pyCount") ),
								com.pega.pegarules.priv.database.sqlgen.NativeSQL.updateField("pxUpdateDateTime", tools.getStepPage().getString("pxUpdateDateTime") ),
  com.pega.pegarules.priv.database.sqlgen.NativeSQL.updateField("pyAverageValue", tools.getStepPage().getString("pyAverageValue") )
								)
								.where(
										com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("A", ".pzInsKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pzInsKey"),true)
										)
								.filterLogic("A");
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("dummy2", queryBuilder, thread);

} 
catch(Exception e) 
{
  oLog.error("Failed to get aggregated snapshot rows for a given prediction and reportDate from pr_data_nlp_reporting");
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
boolean pz__1 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__1) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
boolean pz__3 = true;
if (pz__3) {
// branch to block Next
nextBlock = "Next";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_9_circum0 definition

/**
 * If record not available, create new weekly snapshot record.
 * <p>
 * Step 4.10 [New] <code>Property-Set</code><br>
 */
public boolean step4_10_circum0() {
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
    pega.setViaPropRef(".pyPredictionId", pRef_28, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), scalarValueQuery_29.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyOutcome", pRef_30, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyLanguage", pRef_32, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyType", pRef_34, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyKey", pRef_36, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), scalarValueQuery_37.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyFrequency", pRef_38, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), "Weekly", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyCount", pRef_25, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER), "sNN", false, true);
}
{
    pega.setViaPropRef(".pySnapShotDay", pRef_39, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), scalarValueQuery_40.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME), "sMN", false, true);
}
{
    tools.putParamValue("pySnapShotDay", PropertyInfo.TYPE_DATETIME, com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, "DateTime", new Object[] { scalarValueQuery_41.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATE), Integer.toString(0), Integer.toString(0), Integer.toString(0), Integer.toString(0) })));
}
{
    pega.setViaPropRef(".pyAverageValue", pRef_22, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DOUBLE), "sEN", false, true);
}
{
    pega.setViaPropRef(".pxCreateDateTime", pRef_42, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_27, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pyModelName", pRef_43, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), scalarValueQuery_44.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pxSaveDateTime", pRef_45, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxCommitDateTime", pRef_46, pega.findPageWithException("SnapshotWeekly", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "4.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_10_circum0 definition

/**
 * Insert new weekly record in DB table.
 * <p>
 * Step 4.11 <code>Java</code> [on page SnapshotWeekly] <br>
 */
public boolean step4_11_circum0() {
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
//String pxInsName = tools.getStepPage().getString("pyPredictionId")+"!"+tools.getStepPage().getString("pyOutcome")+"!"+tools.getStepPage().getString("pyLanguage")+"!"+tools.getStepPage().getString("pyType")+"!"+tools.getStepPage().getString("pyKey")+"!"+tools.getStepPage().getString("pyFrequency")+"!"+tools.getStepPage().getString("pySnapShotDay");
String pxInsName = "";
final int MAX_TRIES = 5;
boolean retry = false;
int retryCount = 0;
do {
  try {
    pxInsName = Long.toString(com.pega.decision.common.ih.RandomSequentialIDGenerator.next());
  } catch (Exception e) {
    retry = retryCount++ < MAX_TRIES;
    if (retry) {
        com.pega.decision.common.ih.RandomSequentialIDGenerator.reinitialize();
    }
  }
} while (retry);
String pxObjClass = "Data-NLP-Snapshot";
try {
com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase) tools.getDatabase();
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = 
					db.getNativeSQLBuilder()
							.insertIntoClass("Data-NLP-Snapshot")
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyPredictionId", tools.getStepPage().getString("pyPredictionId")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyOutcome", tools.getStepPage().getString("pyOutcome")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyLanguage", tools.getStepPage().getString("pyLanguage")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyType", tools.getStepPage().getString("pyType")))
					        .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyKey", tools.getStepPage().getString("pyKey")))
					        .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyFrequency", tools.getStepPage().getString("pyFrequency")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyCount", tools.getStepPage().getString("pyCount")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pySnapShotDay", tools.getStepPage().getString("pySnapShotDay")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyIsAggregated", tools.getStepPage().getString("pyIsAggregated")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxCreateDateTime", tools.getStepPage().getString("pxCreateDateTime")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxUpdateDateTime", tools.getStepPage().getString("pxUpdateDateTime")))
					        .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyModelName", tools.getStepPage().getString("pyModelName")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pzInsKey", pxObjClass.toUpperCase()+" "+pxInsName.toUpperCase() ))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxObjClass", pxObjClass))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxInsName", pxInsName.toUpperCase()))
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyAverageValue",  tools.getStepPage().getString("pyAverageValue")))
    .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxSaveDateTime", tools.getStepPage().getString("pxSaveDateTime")))
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxCommitDateTime", tools.getStepPage().getString("pxCommitDateTime")));
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("dummy", queryBuilder, thread);

} 
catch(Exception e) 
{
  oLog.error("Failed to get aggregated snapshot rows for a given prediction and reportDate from pr_data_nlp_reporting");
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
boolean pz__4 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__4) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_11_circum0 definition

/**
 * Get snapshot monthly records if available.
 * <p>
 * Step 4.12 [Next] <code>Java</code><br>
 */
public boolean step4_12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
try {
com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase) tools.getDatabase();
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pzInsKey", "pzInsKey"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyCount", "pyCount"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyAverageValue", "pyAverageValue")
         )
	.from("Data-NLP-Snapshot","A")
	.where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("B", ".pyPredictionID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyPredictionId"), true),
       com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("C", ".pySnapShotDay", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyMonthOfSnapShotDay"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("D", ".pyKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyKey"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("E", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyType"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("F", ".pyLanguage", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyLanguage"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("G", ".pyOutcome", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyOutcome"), true ),
		com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("H", ".pyFrequency", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, "Monthly", true ),
		com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("I", ".pyModelName", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyModelName"), true ),       
	com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("J", ".pyModelName", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.ISNULL, "",false ),
           com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("K", ".pyKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.ISNULL, "",false )
		);
  
    if(org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && !org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    queryBuilder.filterLogic("B AND C AND D AND E AND F AND G AND H AND J");
  }
  if(org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    queryBuilder.filterLogic("B AND C AND K AND E AND F AND G AND H AND J");
  }
  if(!org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    queryBuilder.filterLogic("B AND C AND K AND E AND F AND G AND H AND I");
  }
  if(!org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && !org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    queryBuilder.filterLogic("B AND C AND D AND E AND F AND G AND H AND I");
  }
	
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("SnapshotListMonthly", queryBuilder, thread);

} 
catch(Exception e) 
{
  oLog.error("Failed to get aggregated snapshot rows for a given prediction and reportDate from pr_data_nlp_reporting");
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
pz_CurrentStepNum = "4.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_12_circum0 definition

/**
 * If available, copy the monthly record to SnapshotMonthly page.
 * <p>
 * Step 4.13 <code>Page-Copy</code><br>
 */
public boolean step4_13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@LengthOfPageList(SnapshotListMonthly.pxResults)&gt;0");
try {
boolean pz_47 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.findPageWithException("SnapshotListMonthly", "Code-Pega-List").getProperty("pxResults") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@LengthOfPageList(SnapshotListMonthly.pxResults)&gt;0",pz_47);
if (!pz_47) {
// branch to block New1
nextBlock = "New1";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@LengthOfPageList(SnapshotListMonthly.pxResults)&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: SnapshotListMonthly.pxResults(1)
ClipboardPage pz_48 = pageQuery_20.resolve(tools, pega.findPageWithException("SnapshotListMonthly", "Code-Pega-List"));
sourcePage = pz_48;
// Expression: SnapshotMonthly
targetPage = tools.findPage("SnapshotMonthly", false);
if (!(targetPage != null && sourcePage != null && targetPage == sourcePage)) {
if (targetPage != null) {
String pageClass = sourcePage != null ? sourcePage.getClassName() : targetPage.getClassName();
targetPage.clear();
targetPage.putString("pxObjClass", pageClass);
}

if ((targetPage != null) && (sourcePage != null)) {
targetPage.putAll(sourcePage, ClipboardPage.PUTALL_KEEPNEW);
targetPage.addMessages(sourcePage);
}
} // end self-ref check;
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
pz_CurrentStepNum = "4.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_13_circum0 definition

/**
 * update pyCount, pyAverageValue and pxUpdateDateTime.
 * <p>
 * Step 4.14 <code>Property-Set</code><br>
 */
public boolean step4_14_circum0() {
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
    pega.setViaPropRef(".pyAverageValue", pRef_22, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("divide--(com.pega.ibm.icu.math.BigDec6479e0195f6b35f17f2ac30d103972d9", "divide", null, null, new Object[] { ((scalarValueQuery_23.resolveToBigDecimal(tools, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_DOUBLE).multiply(scalarValueQuery_24.resolveToBigDecimal(tools, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_INTEGER))).add((scalarValueQuery_23.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_DOUBLE).multiply(scalarValueQuery_24.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER))))), BigDecimal.valueOf((scalarValueQuery_24.resolveToInt(tools, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_INTEGER) + scalarValueQuery_24.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER))) }).doubleValue(), "sEN", false, true);
}
{
    pega.setViaPropRef(".pyCount", pRef_25, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), (scalarValueQuery_24.resolveToInt(tools, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_INTEGER) + scalarValueQuery_26.resolveToInt(tools, pega.findPageWithException("DailySnapshotList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER, forEachCounter)), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_27, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "4.14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_14_circum0 definition

/**
 * Update existing monthly snapshot record.
 * <p>
 * Step 4.15 <code>Java</code> [on page SnapshotMonthly] <br>
 */
public boolean step4_15_circum0() {
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
try {
com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase) tools.getDatabase();
			
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = 
						db.getNativeSQLBuilder()
						.updateInClass("Data-NLP-Snapshot")
						.updateForColumns(
								com.pega.pegarules.priv.database.sqlgen.NativeSQL.updateField("pyCount", tools.getStepPage().getString("pyCount") ),
								com.pega.pegarules.priv.database.sqlgen.NativeSQL.updateField("pxUpdateDateTime", tools.getStepPage().getString("pxUpdateDateTime") ),
  com.pega.pegarules.priv.database.sqlgen.NativeSQL.updateField("pyAverageValue", tools.getStepPage().getString("pyAverageValue") )
								)
								.where(
										com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("A", ".pzInsKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pzInsKey"),true)
										)
								.filterLogic("A");
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("dummy2", queryBuilder, thread);

} 
catch(Exception e) 
{
  oLog.error("Failed to get aggregated snapshot rows for a given prediction and reportDate from pr_data_nlp_reporting");
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
nextBlock = "ERR";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ERR";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__6 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__6) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
boolean pz__8 = true;
if (pz__8) {
// branch to block Next2
nextBlock = "Next2";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_15_circum0 definition

/**
 * If not available, create new monthly snapshot record.
 * <p>
 * Step 4.16 [New1] <code>Property-Set</code><br>
 */
public boolean step4_16_circum0() {
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
    pega.setViaPropRef(".pyPredictionId", pRef_28, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), scalarValueQuery_29.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyOutcome", pRef_30, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyLanguage", pRef_32, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyType", pRef_34, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyKey", pRef_36, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), scalarValueQuery_37.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyFrequency", pRef_38, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), "Monthly", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyCount", pRef_25, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER), "sNN", false, true);
}
{
    pega.setViaPropRef(".pySnapShotDay", pRef_39, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), scalarValueQuery_49.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME), "sMN", false, true);
}
{
    tools.putParamValue("pySnapShotDay", PropertyInfo.TYPE_DATETIME, com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, "DateTime", new Object[] { scalarValueQuery_50.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATE), Integer.toString(0), Integer.toString(0), Integer.toString(0), Integer.toString(0) })));
}
{
    pega.setViaPropRef(".pyAverageValue", pRef_22, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DOUBLE), "sEN", false, true);
}
{
    pega.setViaPropRef(".pxCreateDateTime", pRef_42, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_27, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pyModelName", pRef_43, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), scalarValueQuery_44.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pxSaveDateTime", pRef_45, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxCommitDateTime", pRef_46, pega.findPageWithException("SnapshotMonthly", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "4.16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_16_circum0 definition

/**
 * Insert new monthly record in table.
 * <p>
 * Step 4.17 <code>Java</code> [on page SnapshotMonthly] <br>
 */
public boolean step4_17_circum0() {
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
//String pxInsName = tools.getStepPage().getString("pyPredictionId")+"!"+tools.getStepPage().getString("pyOutcome")+"!"+tools.getStepPage().getString("pyLanguage")+"!"+tools.getStepPage().getString("pyType")+"!"+tools.getStepPage().getString("pyKey")+"!"+tools.getStepPage().getString("pyFrequency")+"!"+tools.getStepPage().getString("pySnapShotDay");
String pxInsName = "";
final int MAX_TRIES = 5;
boolean retry = false;
int retryCount = 0;
do {
  try {
    pxInsName = Long.toString(com.pega.decision.common.ih.RandomSequentialIDGenerator.next());
  } catch (Exception e) {
    retry = retryCount++ < MAX_TRIES;
    if (retry) {
        com.pega.decision.common.ih.RandomSequentialIDGenerator.reinitialize();
    }
  }
} while (retry);
String pxObjClass = "Data-NLP-Snapshot";
try {
com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase) tools.getDatabase();
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = 
					db.getNativeSQLBuilder()
							.insertIntoClass("Data-NLP-Snapshot")
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyPredictionId", tools.getStepPage().getString("pyPredictionId")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyOutcome", tools.getStepPage().getString("pyOutcome")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyLanguage", tools.getStepPage().getString("pyLanguage")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyType", tools.getStepPage().getString("pyType")))
					        .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyKey", tools.getStepPage().getString("pyKey")))
					        .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyFrequency", tools.getStepPage().getString("pyFrequency")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyCount", tools.getStepPage().getString("pyCount")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pySnapShotDay", tools.getStepPage().getString("pySnapShotDay")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyIsAggregated", tools.getStepPage().getString("pyIsAggregated")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxCreateDateTime", tools.getStepPage().getString("pxCreateDateTime")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxUpdateDateTime", tools.getStepPage().getString("pxUpdateDateTime")))
					        .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyModelName", tools.getStepPage().getString("pyModelName")))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pzInsKey", pxObjClass.toUpperCase()+" "+pxInsName.toUpperCase() ))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxObjClass", pxObjClass))
							.insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxInsName", pxInsName.toUpperCase()))
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyAverageValue",  tools.getStepPage().getString("pyAverageValue")))
    .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxSaveDateTime", tools.getStepPage().getString("pxSaveDateTime")))
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxCommitDateTime", tools.getStepPage().getString("pxCommitDateTime")));
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("dummy", queryBuilder, thread);

} 
catch(Exception e) 
{
  oLog.error("Failed to get aggregated snapshot rows for a given prediction and reportDate from pr_data_nlp_reporting");
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
boolean pz__9 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__9) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_17_circum0 definition

/**
 * set current time in local variable to update the Daily record pxUpdatedateTime.
 * <p>
 * Step 4.18 [Next2] <code>Property-Set</code><br>
 */
public boolean step4_18_circum0() {
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
    pxUpdateDateTime = PRDateFormat.formatIDT(System.currentTimeMillis());
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
pz_CurrentStepNum = "4.18";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_18_circum0 definition

/**
 * update the Daily record pyIsAggregated to true and update pxUpdateDateTime.
 * <p>
 * Step 4.19 <code>Java</code><br>
 */
public boolean step4_19_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
try {
com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase) tools.getDatabase();
			
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = 
						db.getNativeSQLBuilder()
						.updateInClass("Data-NLP-Snapshot")
						.updateForColumns(
								com.pega.pegarules.priv.database.sqlgen.NativeSQL.updateField("pyIsAggregated", "true" ),
								com.pega.pegarules.priv.database.sqlgen.NativeSQL.updateField("pxUpdateDateTime", pxUpdateDateTime )
								)
								.where(
										com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("A", ".pzInsKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pzInsKey"),true)
										)
								.filterLogic("A");
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("ReportList", queryBuilder, thread);

} 
catch(Exception e) 
{
  oLog.error("Failed to get aggregated snapshot rows for a given prediction and reportDate from pr_data_nlp_reporting");
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
pz_CurrentStepNum = "4.19";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_19_circum0 definition

/**
 * Step 5 <code>Commit</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Commit");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Commit", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Commit
boolean autoPopulateDisabledStatus = tools.getThread().getDisableAutoPopulate();
try {
tools.getThread().setDisableAutoPopulate(true);tools.getDatabase().commit();
} catch (DatabaseException de) { 
oLog.error("Error in commit()", de); 
} finally {
tools.getThread().setDisableAutoPopulate(autoPopulateDisabledStatus);}} finally {
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Commit",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Step 6 [ERR] <code>Rollback</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Rollback");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Rollback", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Rollback
try {
	tools.getDatabase().rollback();
} catch (PRException pre) { oLog.error(pre); }
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Rollback",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Step 7 <code>Page-Remove</code><br>
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
// Expression: SnapshotListWeekly
pageRemove(tools.findPage("SnapshotListWeekly"));
// Expression: SnapshotListMonthly
pageRemove(tools.findPage("SnapshotListMonthly"));
// Expression: SnapshotWeekly
pageRemove(tools.findPage("SnapshotWeekly"));
// Expression: SnapshotYearly
pageRemove(tools.findPage("SnapshotYearly"));
// Expression: SnapshotMonthly
pageRemove(tools.findPage("SnapshotMonthly"));
// Expression: DailySnapshotList
pageRemove(tools.findPage("DailySnapshotList"));
// Expression: DailySnapshot
pageRemove(tools.findPage("DailySnapshot"));
// Expression: SnapshotListYearly
pageRemove(tools.findPage("SnapshotListYearly"));
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

public String pxUpdateDateTime = "";

public void initializeUserLocalVariables() {
	pxUpdateDateTime = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("pxUpdateDateTime", (pxUpdateDateTime == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : pxUpdateDateTime.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_39 = new String[] { "", "", "pySnapShotDay", "" };
public static final String[] pRef_36 = new String[] { "", "", "pyKey", "" };
public static final String[] pRef_32 = new String[] { "", "", "pyLanguage", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyOutcome", "" };
public static final String[] pRef_34 = new String[] { "", "", "pyType", "" };
public static final String[] pRef_38 = new String[] { "", "", "pyFrequency", "" };
public static final String[] pRef_43 = new String[] { "", "", "pyModelName", "" };
public static final String[] pRef_45 = new String[] { "", "", "pxSaveDateTime", "" };
public static final String[] pRef_46 = new String[] { "", "", "pxCommitDateTime", "" };
public static final String[] pRef_27 = new String[] { "", "", "pxUpdateDateTime", "" };
public static final String[] pRef_42 = new String[] { "", "", "pxCreateDateTime", "" };
public static final String[] pRef_22 = new String[] { "", "", "pyAverageValue", "" };
public static final String[] pRef_28 = new String[] { "", "", "pyPredictionId", "" };
public static final String[] pRef_25 = new String[] { "", "", "pyCount", "" };
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().scalarProperty("pyPredictionId").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_33 = FUAUtil.createQueryBuilder().scalarProperty("pyLanguage").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pyAverageValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_44 = FUAUtil.createQueryBuilder().scalarProperty("pyModelName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_50 = FUAUtil.createQueryBuilder().scalarList("pyDateValue", 2).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().scalarProperty("pyType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().scalarProperty("pyOutcome").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_37 = FUAUtil.createQueryBuilder().scalarProperty("pyKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_41 = FUAUtil.createQueryBuilder().scalarList("pyDateValue", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pyCount").buildScalarValueQuery();
private static final PageQuery pageQuery_20 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).buildPageQuery();
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().scalarProperty("pyMonthOfSnapShotDay").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().scalarProperty("pyWeekOfSnapShotDay").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEWEEKLYMONTHLYYEARLYTEXTPREDICTIONDATA #20201215T063228.098 GMT", "Data-NLP-Reporting pyAggregateWeeklyMonthlyYearlyTextPredictionData", "Pega-NLP", "08-06-01", false, true, "", "ACTIVITY", "20210211T064250.205 GMT" ,"Rule-Obj-Activity"); }
