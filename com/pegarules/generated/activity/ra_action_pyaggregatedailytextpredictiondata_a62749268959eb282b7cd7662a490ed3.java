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
public class ra_action_pyaggregatedailytextpredictiondata_a62749268959eb282b7cd7662a490ed3 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyAggregateDailyTextPredictionData.Data_NLP_Reporting.Action");
	public ra_action_pyaggregatedailytextpredictiondata_a62749268959eb282b7cd7662a490ed3(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT	Pega-NLP:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 2 Circum: 0" );
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
String pz_5 = "TAList";
thisStepPage = tools.findPage(pz_5, true);
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 4 Circum: 0" );
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
String pz_7 = "ReportPage";
thisStepPage = tools.findPage(pz_7, true);
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 5 Circum: 0" );
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
String pz_9 = "DistinctDateList";
thisStepPage = tools.findPage(pz_9, true);
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 6 Circum: 0" );
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
ClipboardProperty pz_11 = pega.findPageWithException("TAList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_11;
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
PRStackFrame pz_StackFrame7_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_0 Circum: 0" );
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

// Code to call step 10_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ERR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_circum0");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("LAST"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 11 Circum: 0" );
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
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
	"Rule-Obj-Activity:PYAGGREGATEDAILYTEXTPREDICTIONDATA"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYAGGREGATEDAILYTEXTPREDICTIONDATA","Rule-Obj-Activity","DATA-NLP-REPORTING",false,"","Pega-NLP","08-06-01","RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT","!PYAGGREGATEDAILYTEXTPREDICTIONDATA",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1731049444)
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
//	RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT:20210113T161429.046 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "73d9ae1dcca1044463ade755c451bd50";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-NLP-Reporting";
	}
public String getAspect() {
return "Action";
}
/**
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
// Expression: "Start:" +  @CurrentDateTime()
if( oLog.isInfoEnabled() ){
oLog.info(("Start:" + PRDateFormat.formatIDT(System.currentTimeMillis())));
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
    ProcessStartTime = PRDateFormat.formatIDT(System.currentTimeMillis());
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
 * Step 3 <code>Page-New</code> [on page TAList] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_6 = "TAList";
myStepPage = tools.findPage(pz_6, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","TAList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("TAList", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Get distinct list of text predictions present in Data-NLP-Reporting table.
 * <p>
 * Step 4 <code>Java</code><br>
 */
public boolean step4_circum0() {
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
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyPredictionId", "pyPredictionId"))
	.distinct()
	.from("Data-NLP-Reporting","A")
  .where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("B", ".pxCreateDateTime", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.LTE, ProcessStartTime, true))
	.filterLogic("B");
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("TAList", queryBuilder, thread);

} 
catch(Exception e) 
{
  oLog.error("Failed to get list of distinct text predictions from pr_data_nlp_reporting");
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
boolean pz__1 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Reporting");
if (pz__1) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Step 5 <code>Page-New</code> [on page ReportPage] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_8 = "ReportPage";
myStepPage = tools.findPage(pz_8, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-NLP-Reporting","ReportPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("ReportPage", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Step 6 <code>Page-New</code> [on page DistinctDateList] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_10 = "DistinctDateList";
myStepPage = tools.findPage(pz_10, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","DistinctDateList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("DistinctDateList", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Step 7.0 <code>Java</code> [on page TAList.pxResults] <br>
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
PRStackFrame pz_StackFrame7_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_1 Circum: 0" );
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

// Code to call nested step 7_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_2_circum0");
}
PRStackFrame pz_StackFrame7_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_3_circum0");
}
PRStackFrame pz_StackFrame7_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_12 = pega.findPageWithException("DistinctDateList", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_12;
if (nestedPageRef != null) {
myNestedPageList = nestedPageRef.iterator();
forEachCounter = 0; // reset counter for nested loop
pz_forEachSkipClass = 0; // reset counter for nested loop
while (myNestedPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextNestedPage = (ClipboardProperty) myNestedPageList.next();
nestedStepPage = nextNestedPage.getPageValue();
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_0_circum0");
}
PRStackFrame pz_StackFrame7_4_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_0 Circum: 0" );
try {
pz_Status = step7_4_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_4_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...
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
 * Step 7.1 <code>Property-Set</code><br>
 */
public boolean step7_1_circum0() {
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
    pega.setViaPropRef(".pyPredictionId", pRef_13, pega.findPageWithException("ReportPage", "Data-NLP-Reporting"), scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    tools.putParamValue("PredictionId", PropertyInfo.TYPE_TEXT, scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
pz_CurrentStepNum = "7.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_1_circum0 definition

/**
 * Get distinct dates for a prediction from Data-NLP-Reporting table.
 * <p>
 * Step 7.2 <code>Java</code><br>
 */
public boolean step7_2_circum0() {
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
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyReportDate", "pyReportDate"))
	.distinct()
	.from("Data-NLP-Reporting","A")
	.where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("B", ".pyPredictionID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, myStepPage.getProperty(".pyPredictionId").toString(), true),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("C", ".pxCreateDateTime", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.LTE, ProcessStartTime, true))
	.filterLogic("B AND C");
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("DistinctDateList", queryBuilder, thread);

} 
catch(Exception e) 
{
  oLog.error("Failed to get distinct ReportDates for a given prediction from pr_data_nlp_reporting");
}

/*Connect SQL query:
select distinct(pyReportDate) as "pyReportDate"
from pr_data_nlp_reporting 
where pyPredictionId= {.pyPredictionId}
*/
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
boolean pz__3 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Reporting");
if (pz__3) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_2_circum0 definition

/**
 * If DistinctDateList is available, continue.
 * <p>
 * Step 7.3 <code>Java</code><br>
 */
public boolean step7_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@LengthOfPageList(DistinctDateList.pxResults)&gt;0");
try {
boolean pz_15 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.findPageWithException("DistinctDateList", "Code-Pega-List").getProperty("pxResults") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@LengthOfPageList(DistinctDateList.pxResults)&gt;0",pz_15);
if (!pz_15) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@LengthOfPageList(DistinctDateList.pxResults)&gt;0 " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "7.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_3_circum0 definition

/**
 * Step 7.4.0 <code>Java</code> [on page DistinctDateList.pxResults] <br>
 */
public boolean step7_4_0_circum0() {
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

// Code to call nested step 7_4_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_1_circum0");
}
PRStackFrame pz_StackFrame7_4_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_2_circum0");
}
String pz_16 = "ReportList";
nestedStepPage = tools.findPage(pz_16, true);
PRStackFrame pz_StackFrame7_4_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_3_circum0");
}
PRStackFrame pz_StackFrame7_4_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_4_circum0");
}
PRStackFrame pz_StackFrame7_4_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_17 = pega.findPageWithException("ReportList", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_17;
if (nestedPageRef != null) {
myNestedPageList = nestedPageRef.iterator();
forEachCounter = 0; // reset counter for nested loop
pz_forEachSkipClass = 0; // reset counter for nested loop
while (myNestedPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextNestedPage = (ClipboardProperty) myNestedPageList.next();
nestedStepPage = nextNestedPage.getPageValue();
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_0_circum0");
}
PRStackFrame pz_StackFrame7_4_5_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_0 Circum: 0" );
try {
pz_Status = step7_4_5_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_4_5_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 7_4_6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("NXTR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_6_circum0");
}
String pz_18 = "ReportList";
nestedStepPage = tools.findPage(pz_18, true);
PRStackFrame pz_StackFrame7_4_6_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_7_circum0");
}
PRStackFrame pz_StackFrame7_4_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_8_circum0");
}
PRStackFrame pz_StackFrame7_4_8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_19 = pega.findPageWithException("ReportList", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_19;
if (nestedPageRef != null) {
myNestedPageList = nestedPageRef.iterator();
forEachCounter = 0; // reset counter for nested loop
pz_forEachSkipClass = 0; // reset counter for nested loop
while (myNestedPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextNestedPage = (ClipboardProperty) myNestedPageList.next();
nestedStepPage = nextNestedPage.getPageValue();
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_0_circum0");
}
PRStackFrame pz_StackFrame7_4_9_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_0 Circum: 0" );
try {
pz_Status = step7_4_9_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_4_9_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "7.4.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_0_circum0 definition

/**
 * Step 7.4.1 <code>Property-Set</code><br>
 */
public boolean step7_4_1_circum0() {
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
    pega.setViaPropRef(".pyReportDate", pRef_20, pega.findPageWithException("ReportPage", "Data-NLP-Reporting"), scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME), "sMN", false, true);
}
{
    tools.putParamValue("pyReportDate", PropertyInfo.TYPE_DATETIME, scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME));
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
pz_CurrentStepNum = "7.4.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_1_circum0 definition

/**
 * Step 7.4.2 <code>Page-New</code> [on page ReportList] <br>
 */
public boolean step7_4_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_22 = "ReportList";
myStepPage = tools.findPage(pz_22, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","ReportList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("ReportList", myStepPage);
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
pz_CurrentStepNum = "7.4.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_2_circum0 definition

/**
 * Get aggregated ReportList for given snapshot day and Text analyzer.
 * <p>
 * Step 7.4.3 <code>Java</code><br>
 */
public boolean step7_4_3_circum0() {
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
  String[] types = new String[5];
				types[0] = "predictioncount";
				types[1] = "class";
        types[2] = "feedbackcount";
				types[3] = "language";
        types[4] = "Error";
	
com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase) tools.getDatabase();
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyOutcome", "pyOutcome"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyLanguage", "pyLanguage"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyType", "pyType"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyKey", "pyKey"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyModelName", "pyModelName"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyReportDate", "pyReportDate"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.aggregateField(com.pega.pegarules.priv.database.sqlgen.constants.AggregateType.COUNT, "A", "pyCount", "pyCount")
         )
	.from("Data-NLP-Reporting","A")
	.where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("B", ".pyPredictionID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getParameterPage().getString("PredictionId"), true),
       com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("C", ".pyReportDate", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyReportDate"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("I", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.IN, types),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("J", ".pxCreateDateTime", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.LTE, ProcessStartTime, true))
	.filterLogic("B AND C AND I AND J");
  //B AND C AND (D OR E OR F OR G OR H)
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
boolean pz__5 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Reporting");
if (pz__5) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.4.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_3_circum0 definition

/**
 * If ReportList is available, continue.
 * <p>
 * Step 7.4.4 <code>Java</code><br>
 */
public boolean step7_4_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@LengthOfPageList(ReportList.pxResults)&gt;0");
try {
boolean pz_23 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.findPageWithException("ReportList", "Code-Pega-List").getProperty("pxResults") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@LengthOfPageList(ReportList.pxResults)&gt;0",pz_23);
if (!pz_23) {
// branch to block NXTR
nextBlock = "NXTR";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@LengthOfPageList(ReportList.pxResults)&gt;0 " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "7.4.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_4_circum0 definition

/**
 * Step 7.4.5.0 <code>Java</code> [on page ReportList.pxResults] <br>
 */
public boolean step7_4_5_0_circum0() {
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

// Code to call nested step 7_4_5_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_1_circum0");
}
PRStackFrame pz_StackFrame7_4_5_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_2_circum0");
}
String pz_24 = "Snapshot";
nestedStepPage = tools.findPage(pz_24, true);
PRStackFrame pz_StackFrame7_4_5_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_3_circum0");
}
PRStackFrame pz_StackFrame7_4_5_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_4_circum0");
}
PRStackFrame pz_StackFrame7_4_5_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_5_circum0");
}
String pz_25 = "Snapshot";
nestedStepPage = tools.findPage(pz_25, true);
PRStackFrame pz_StackFrame7_4_5_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_6_circum0");
}
String pz_26 = "Snapshot";
nestedStepPage = tools.findPage(pz_26, true);
PRStackFrame pz_StackFrame7_4_5_6_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("New"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_7_circum0");
}
String pz_27 = "Snapshot";
nestedStepPage = tools.findPage(pz_27, true);
PRStackFrame pz_StackFrame7_4_5_7_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_8_circum0");
}
PRStackFrame pz_StackFrame7_4_5_8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_9_circum0");
}
String pz_28 = "Snapshot";
nestedStepPage = tools.findPage(pz_28, true);
PRStackFrame pz_StackFrame7_4_5_9_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_10_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_10_circum0");
}
PRStackFrame pz_StackFrame7_4_5_10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_11_circum0");
}
String pz_29 = "Snapshot";
nestedStepPage = tools.findPage(pz_29, true);
PRStackFrame pz_StackFrame7_4_5_11_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_5_12_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Next"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.5.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_5_12_circum0");
}
PRStackFrame pz_StackFrame7_4_5_12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_5_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_5_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_5_12_circum0, false);
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
pz_CurrentStepNum = "7.4.5.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_0_circum0 definition

/**
 * Get Daily snapshot record if available.
 * <p>
 * Step 7.4.5.1 <code>Java</code><br>
 */
public boolean step7_4_5_1_circum0() {
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
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pzInsKey", "pzInsKey"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyCount", "pyCount"),          
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyPredictionId", "pyPredictionId"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyOutcome", "pyOutcome"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyLanguage", "pyLanguage"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyType", "pyType"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyKey", "pyKey"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyIsAggregated", "pyIsAggregated"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyModelName", "pyModelName"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyWeekOfSnapShotDay", "pyWeekOfSnapShotDay"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyMonthOfSnapShotDay", "pyMonthOfSnapShotDay")
         )
	.from("Data-NLP-Snapshot","A")
	.where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("B", ".pyPredictionID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getParameterPage().getString("PredictionId"), true),
       com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("C", ".pySnapShotDay", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyReportDate"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("D", ".pyKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyKey"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("E", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyType"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("F", ".pyLanguage", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyLanguage"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("G", ".pyOutcome", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyOutcome"), true ),
		com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("H", ".pyFrequency", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, "Daily", true ),
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
  db.executeNativeSQL("SnapshotList", queryBuilder, thread);

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
boolean pz__7 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__7) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.4.5.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_1_circum0 definition

/**
 * Snapshot page to hold already existing snapshot.
 * <p>
 * Step 7.4.5.2 <code>Page-New</code> [on page Snapshot] <br>
 */
public boolean step7_4_5_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_30 = "Snapshot";
myStepPage = tools.findPage(pz_30, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-NLP-Snapshot","Snapshot",false); 
// primary page will not be added to PageList
	 pega.setStepPage("Snapshot", myStepPage);
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
pz_CurrentStepNum = "7.4.5.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_2_circum0 definition

/**
 * Copy the existing snapshot to Snapshot page.
 * <p>
 * Step 7.4.5.3 <code>Page-Copy</code><br>
 */
public boolean step7_4_5_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@LengthOfPageList(SnapshotList.pxResults)&gt;0");
try {
boolean pz_31 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.findPageWithException("SnapshotList", "Code-Pega-List").getProperty("pxResults") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@LengthOfPageList(SnapshotList.pxResults)&gt;0",pz_31);
if (!pz_31) {
// branch to block New
nextBlock = "New";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@LengthOfPageList(SnapshotList.pxResults)&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: SnapshotList.pxResults(1)
ClipboardPage pz_33 = pageQuery_32.resolve(tools, pega.findPageWithException("SnapshotList", "Code-Pega-List"));
sourcePage = pz_33;
// Expression: Snapshot
targetPage = tools.findPage("Snapshot", false);
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
pz_CurrentStepNum = "7.4.5.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_3_circum0 definition

/**
 * update snapshot pyCount.
 * <p>
 * Step 7.4.5.4 <code>Property-Set</code><br>
 */
public boolean step7_4_5_4_circum0() {
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
    pega.setViaPropRef(".pyCount", pRef_34, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), (scalarValueQuery_35.resolveToInt(tools, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_INTEGER) + scalarValueQuery_35.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER)), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_36, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "7.4.5.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_4_circum0 definition

/**
 * update the snapshot DB row with the updated pyCount value.
 * <p>
 * Step 7.4.5.5 <code>Java</code> [on page Snapshot] <br>
 */
public boolean step7_4_5_5_circum0() {
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
								com.pega.pegarules.priv.database.sqlgen.NativeSQL.updateField("pxUpdateDateTime", tools.getStepPage().getString("pxUpdateDateTime") )
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
pz_CurrentStepNum = "7.4.5.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_5_circum0 definition

/**
 * If isAggregated=true, update corresponding Weekly and Monthly snapshot DB rows.
 * <p>
 * Step 7.4.5.6 <code>Call pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows</code> [on page Snapshot] <br>
 */
public boolean step7_4_5_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyIsAggregated==\"true\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyIsAggregated==\"true\"", "FUAInstance-NullMyStepPage");
}
boolean pz_38 = (scalarValueQuery_37.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyIsAggregated==\"true\"",pz_38);
if (!pz_38) {
// branch to block Next
nextBlock = "Next";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyIsAggregated==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows
if (myStepPage == null) {
String pz_39 = "Snapshot";
myStepPage = tools.findPage(pz_39, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_39, false);
myStepPage.putString("pxObjClass", "Data-NLP-Snapshot");
}
}
// Calling Activity : pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: ReportList.pxResults(<CURRENT>).pyCount
String pz_41 = scalarValueQuery_40.resolveToString(tools, pega.findPageWithException("ReportList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER, forEachCounter);
newParamsPage.putParamValue("UpdateValue", PropertyInfo.TYPE_INTEGER, pz_41);
// Expression: false
String pz_42 = String.valueOf(false);
newParamsPage.putParamValue("IsAvgNeeded", PropertyInfo.TYPE_TRUEFALSE, pz_42);

pega.invokeActivity(myStepPage, newParamsPage, "pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows", "Data-NLP-Reporting", "");
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
boolean pz__11 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__11) {
// branch to block ERR
nextBlock = "ERR";
return false;
} else {
// branch to block Next
nextBlock = "Next";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.4.5.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step7_4_5_6_circum0 definition

/**
 * If Daily snapshot not present, Create new snapshot record.
 * <p>
 * Step 7.4.5.7 [New] <code>Page-New</code> [on page Snapshot] <br>
 */
public boolean step7_4_5_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_43 = "Snapshot";
myStepPage = tools.findPage(pz_43, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-NLP-Snapshot","Snapshot",false); 
// primary page will not be added to PageList
	 pega.setStepPage("Snapshot", myStepPage);
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
pz_CurrentStepNum = "7.4.5.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_7_circum0 definition

/**
 * Set the required properties to insert in DB row.
 * <p>
 * Step 7.4.5.8 <code>Property-Set</code><br>
 */
public boolean step7_4_5_8_circum0() {
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
    pega.setViaPropRef(".pyPredictionId", pRef_13, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), tools.getParamValue("PredictionId"), "sIN", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyOutcome", pRef_44, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_45.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyLanguage", pRef_46, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_47.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyType", pRef_48, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_49.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyKey", pRef_50, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_51.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyFrequency", pRef_52, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), "Daily", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyCount", pRef_34, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER), "sNN", false, true);
}
{
    pega.setViaPropRef(".pySnapShotDay", pRef_53, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), tools.getParamValue("pyReportDate"), "sMN", false, true);
}
{
    pega.setViaPropRef(".pyIsAggregated", pRef_54, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), "false", "sSN", false, true);
}
{
    pega.setViaPropRef(".pxCreateDateTime", pRef_55, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_36, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pyModelName", pRef_56, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_57.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pxCommitDateTime", pRef_58, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxSaveDateTime", pRef_59, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "7.4.5.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_8_circum0 definition

/**
 * Calculate the Week and Month of snapshot day to insert into DB row.
 * <p>
 * Step 7.4.5.9 <code>Java</code> [on page Snapshot] <br>
 */
public boolean step7_4_5_9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
try{
  Date snapshotday = tools.getStepPage().getDate("pySnapShotDay");
  StartOfWeek = pega_nlp_nlputilities.pzGetStartOfWeekForGivenDate(snapshotday);
  StartOfMonth = pega_nlp_nlputilities.pzGetStartOfMonthForGivenDate(snapshotday); 
} catch (Exception e) {
  e.printStackTrace();
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
pz_CurrentStepNum = "7.4.5.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_9_circum0 definition

/**
 * Set calculated values to pyWeekOfSnapShotDay and pyMonthOfSnapShotDay.
 * <p>
 * Step 7.4.5.10 <code>Property-Set</code><br>
 */
public boolean step7_4_5_10_circum0() {
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
    pega.setViaPropRef(".pyWeekOfSnapShotDay", pRef_60, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, null, new Object[] { StartOfWeek, Integer.toString(0), Integer.toString(0), Integer.toString(0), Integer.toString(0) })), "sMN", false, true);
}
{
    pega.setViaPropRef(".pyMonthOfSnapShotDay", pRef_61, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, null, new Object[] { StartOfMonth, Integer.toString(0), Integer.toString(0), Integer.toString(0), Integer.toString(0) })), "sMN", false, true);
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
pz_CurrentStepNum = "7.4.5.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_10_circum0 definition

/**
 * Insert Snapshot record to DB table.
 * <p>
 * Step 7.4.5.11 <code>Java</code> [on page Snapshot] <br>
 */
public boolean step7_4_5_11_circum0() {
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
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxSaveDateTime", tools.getStepPage().getString("pxSaveDateTime")))
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxCommitDateTime", tools.getStepPage().getString("pxCommitDateTime")))
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyWeekOfSnapShotDay", tools.getStepPage().getString("pyWeekOfSnapShotDay")))
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyMonthOfSnapShotDay", tools.getStepPage().getString("pyMonthOfSnapShotDay")));
  
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
boolean pz__13 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__13) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.4.5.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_11_circum0 definition

/**
 * delete the reporting table rows which is used for inserting the snapshot.
 * <p>
 * Step 7.4.5.12 [Next] <code>Java</code><br>
 */
public boolean step7_4_5_12_circum0() {
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
	
  int deletedCount = -1;

  while(deletedCount!=0){
    
    com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder subQuery = db.getNativeSQLBuilder()
    .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pzinskey"))
	  .from("Data-NLP-Reporting", "A")
    .where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("L", ".pxCreateDateTime", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.LTE, ProcessStartTime, true),
            com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("B", ".pyPredictionID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getParameterPage().getString("PredictionId"), true),
       com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("C", ".pyReportDate", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyReportDate"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("D", ".pyKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyKey"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("E", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyType"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("F", ".pyLanguage", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyLanguage"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("G", ".pyOutcome", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyOutcome"), true ),
		com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("I", ".pyModelName", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyModelName"), true ),
         com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("J", ".pyModelName", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.ISNULL, "",false ),
         com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("K", ".pyKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.ISNULL, "",false ));
 
      if(org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && !org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    subQuery.filterLogic("L AND B AND C AND D AND E AND F AND G  AND J").setLimitSize(1000);   
  }
  if(org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    subQuery.filterLogic("L AND B AND C AND K AND E AND F AND G  AND J").setLimitSize(1000);   
  }
  if(!org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    subQuery.filterLogic("L AND B AND C AND K AND E AND F AND G AND I").setLimitSize(1000);   
  }
  if(!org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && !org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    subQuery.filterLogic("L AND B AND C AND D AND E AND F AND G  AND I").setLimitSize(1000);   
  }

    
    com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilderDelete = db.getNativeSQLBuilder()
    .deleteFromClass("Data-NLP-Reporting")
    .where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.subQueryFilter("F1", ".pzInsKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.IN, "A"))
	  .addSubQuery(subQuery)
	  .filterLogic("F1");

    PRThread thread = (PRThread)ThreadContainer.get();
    db.executeNativeSQL("ResultPage", queryBuilderDelete, thread);
    deletedCount = tools.findPage("ResultPage").getInteger("pxResultCount");

  }
} 
catch(Exception e) 
{
  oLog.error("Failed to delete data from pr_data_nlp_reporting");
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
pz_CurrentStepNum = "7.4.5.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_5_12_circum0 definition

/**
 * Step 7.4.6 [NXTR] <code>Page-New</code> [on page ReportList] <br>
 */
public boolean step7_4_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_62 = "ReportList";
myStepPage = tools.findPage(pz_62, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","ReportList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("ReportList", myStepPage);
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
pz_CurrentStepNum = "7.4.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_6_circum0 definition

/**
 * Get aggregated average Throughput, size of words, size of characters, ReportList for given snapshot day and Text analyzer.
 * <p>
 * Step 7.4.7 <code>Java</code><br>
 */
public boolean step7_4_7_circum0() {
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
  
    String[] types = new String[3];
				types[0] = "throughput";
				types[1] = "wordcount";
        types[2] = "charcount";

com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase) tools.getDatabase();
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyOutcome", "pyOutcome"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyLanguage", "pyLanguage"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyType", "pyType"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyKey", "pyKey"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyModelName", "pyModelName"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyReportDate", "pyReportDate"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.aggregateField(com.pega.pegarules.priv.database.sqlgen.constants.AggregateType.COUNT, "A", "pyCount", "pyCount"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.aggregateField(com.pega.pegarules.priv.database.sqlgen.constants.AggregateType.AVG, "A", "pyCount", "pyAverageValue")
         )
	.from("Data-NLP-Reporting","A")
	.where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("B", ".pyPredictionID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getParameterPage().getString("PredictionId"), true),
       com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("C", ".pyReportDate", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyReportDate"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("D", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, "throughput", true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("E", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, "wordcount", true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("F", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, "charcount", true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("G", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.IN, types ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("H", ".pxCreateDateTime", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.LTE, ProcessStartTime, true))
	.filterLogic("B AND C AND G AND H");
  //B AND C AND (D OR E OR F)
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("ReportList", queryBuilder, thread);

} 
catch(Exception e) 
{
  oLog.error("Failed to get aggregated snapshot rows for a given prediction and reportDate from pr_data_nlp_reporting");
}


/*Connect SQL query:
select pyOutcome as "pyOutcome", pyLanguage as "pyLanguage", pyType as "pyType", pyKey as "pyKey", pyModelName as "pyModelName", count(pyCount) as "pyCount"
from  {Class:Data-NLP-Reporting}
where pyPredictionId= {.pyPredictionId}
and pyReportDate= {.pyReportDate}
and (pyType = "throughput" or pyType = "wordcount" or pyType = "charcount")
group by pyOutcome, pyLanguage, pyType, pyKey, pyModelName
*/
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
boolean pz__15 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Reporting");
if (pz__15) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.4.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_7_circum0 definition

/**
 * If ReportList is available, continue.
 * <p>
 * Step 7.4.8 <code>Java</code><br>
 */
public boolean step7_4_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@LengthOfPageList(ReportList.pxResults)&gt;0");
try {
boolean pz_63 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.findPageWithException("ReportList", "Code-Pega-List").getProperty("pxResults") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@LengthOfPageList(ReportList.pxResults)&gt;0",pz_63);
if (!pz_63) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@LengthOfPageList(ReportList.pxResults)&gt;0 " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "7.4.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_8_circum0 definition

/**
 * Step 7.4.9.0 <code>Java</code> [on page ReportList.pxResults] <br>
 */
public boolean step7_4_9_0_circum0() {
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

// Code to call nested step 7_4_9_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_1_circum0");
}
PRStackFrame pz_StackFrame7_4_9_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_2_circum0");
}
String pz_64 = "Snapshot";
nestedStepPage = tools.findPage(pz_64, true);
PRStackFrame pz_StackFrame7_4_9_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_3_circum0");
}
PRStackFrame pz_StackFrame7_4_9_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_4_circum0");
}
PRStackFrame pz_StackFrame7_4_9_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_5_circum0");
}
String pz_65 = "Snapshot";
nestedStepPage = tools.findPage(pz_65, true);
PRStackFrame pz_StackFrame7_4_9_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_6_circum0");
}
String pz_66 = "Snapshot";
nestedStepPage = tools.findPage(pz_66, true);
PRStackFrame pz_StackFrame7_4_9_6_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("New1"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_7_circum0");
}
String pz_67 = "Snapshot";
nestedStepPage = tools.findPage(pz_67, true);
PRStackFrame pz_StackFrame7_4_9_7_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_8_circum0");
}
PRStackFrame pz_StackFrame7_4_9_8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_9_circum0");
}
String pz_68 = "Snapshot";
nestedStepPage = tools.findPage(pz_68, true);
PRStackFrame pz_StackFrame7_4_9_9_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_10_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_10_circum0");
}
PRStackFrame pz_StackFrame7_4_9_10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_11_circum0");
}
String pz_69 = "Snapshot";
nestedStepPage = tools.findPage(pz_69, true);
PRStackFrame pz_StackFrame7_4_9_11_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 7_4_9_12_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Next1"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.4.9.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_4_9_12_circum0");
}
PRStackFrame pz_StackFrame7_4_9_12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT Step: 7_4_9_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_4_9_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_4_9_12_circum0, false);
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
pz_CurrentStepNum = "7.4.9.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_0_circum0 definition

/**
 * Step 7.4.9.1 <code>Java</code><br>
 */
public boolean step7_4_9_1_circum0() {
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
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pzInsKey", "pzInsKey"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyCount", "pyCount"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyAverageValue", "pyAverageValue"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyIsAggregated", "pyIsAggregated"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyPredictionId", "pyPredictionId"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyOutcome", "pyOutcome"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyLanguage", "pyLanguage"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyType", "pyType"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyKey", "pyKey"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyModelName", "pyModelName"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyWeekOfSnapShotDay", "pyWeekOfSnapShotDay"),
          com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pyMonthOfSnapShotDay", "pyMonthOfSnapShotDay")
         )
	.from("Data-NLP-Snapshot","A")
	.where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("B", ".pyPredictionID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getParameterPage().getString("PredictionId"), true),
       com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("C", ".pySnapShotDay", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyReportDate"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("D", ".pyKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyKey"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("E", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyType"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("F", ".pyLanguage", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyLanguage"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("G", ".pyOutcome", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyOutcome"), true ),
		com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("H", ".pyFrequency", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, "Daily", true ),
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
  db.executeNativeSQL("SnapshotList", queryBuilder, thread);

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
boolean pz__17 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__17) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.4.9.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_1_circum0 definition

/**
 * Snapshot page to open already existing snapshot.
 * <p>
 * Step 7.4.9.2 <code>Page-New</code> [on page Snapshot] <br>
 */
public boolean step7_4_9_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_70 = "Snapshot";
myStepPage = tools.findPage(pz_70, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-NLP-Snapshot","Snapshot",false); 
// primary page will not be added to PageList
	 pega.setStepPage("Snapshot", myStepPage);
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
pz_CurrentStepNum = "7.4.9.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_2_circum0 definition

/**
 * Step 7.4.9.3 <code>Page-Copy</code><br>
 */
public boolean step7_4_9_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@LengthOfPageList(SnapshotList.pxResults)&gt;0");
try {
boolean pz_71 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.findPageWithException("SnapshotList", "Code-Pega-List").getProperty("pxResults") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@LengthOfPageList(SnapshotList.pxResults)&gt;0",pz_71);
if (!pz_71) {
// branch to block New1
nextBlock = "New1";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@LengthOfPageList(SnapshotList.pxResults)&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: SnapshotList.pxResults(1)
ClipboardPage pz_72 = pageQuery_32.resolve(tools, pega.findPageWithException("SnapshotList", "Code-Pega-List"));
sourcePage = pz_72;
// Expression: Snapshot
targetPage = tools.findPage("Snapshot", false);
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
pz_CurrentStepNum = "7.4.9.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_3_circum0 definition

/**
 * update snapshot pyCount and pyAverageValue.
 * <p>
 * Step 7.4.9.4 <code>Property-Set</code><br>
 */
public boolean step7_4_9_4_circum0() {
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
    pega.setViaPropRef(".pyAverageValue", pRef_73, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("divide--(com.pega.ibm.icu.math.BigDec6479e0195f6b35f17f2ac30d103972d9", "divide", null, null, new Object[] { ((scalarValueQuery_74.resolveToBigDecimal(tools, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_DOUBLE).multiply(scalarValueQuery_35.resolveToBigDecimal(tools, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_INTEGER))).add((scalarValueQuery_74.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_DOUBLE).multiply(scalarValueQuery_35.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER))))), BigDecimal.valueOf((scalarValueQuery_35.resolveToInt(tools, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_INTEGER) + scalarValueQuery_35.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER))) }).doubleValue(), "sEN", false, true);
}
{
    pega.setViaPropRef(".pyCount", pRef_34, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), (scalarValueQuery_35.resolveToInt(tools, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), ImmutablePropertyInfo.TYPE_INTEGER) + scalarValueQuery_35.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER)), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_36, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "7.4.9.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_4_circum0 definition

/**
 * Step 7.4.9.5 <code>Java</code> [on page Snapshot] <br>
 */
public boolean step7_4_9_5_circum0() {
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
boolean pz__19 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__19) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.4.9.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_5_circum0 definition

/**
 * Step 7.4.9.6 <code>Call pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows</code> [on page Snapshot] <br>
 */
public boolean step7_4_9_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyIsAggregated==\"true\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyIsAggregated==\"true\"", "FUAInstance-NullMyStepPage");
}
boolean pz_75 = (scalarValueQuery_37.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyIsAggregated==\"true\"",pz_75);
if (!pz_75) {
// branch to block Next1
nextBlock = "Next1";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyIsAggregated==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows
if (myStepPage == null) {
String pz_76 = "Snapshot";
myStepPage = tools.findPage(pz_76, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_76, false);
myStepPage.putString("pxObjClass", "Data-NLP-Snapshot");
}
}
// Calling Activity : pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: ReportList.pxResults(<CURRENT>).pyCount
String pz_77 = scalarValueQuery_40.resolveToString(tools, pega.findPageWithException("ReportList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER, forEachCounter);
newParamsPage.putParamValue("UpdateValue", PropertyInfo.TYPE_INTEGER, pz_77);
// Expression: ReportList.pxResults(<CURRENT>).pyAverageValue
String pz_79 = scalarValueQuery_78.resolveToString(tools, pega.findPageWithException("ReportList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_DOUBLE, forEachCounter);
newParamsPage.putParamValue("UpdateAverage", PropertyInfo.TYPE_DOUBLE, pz_79);
// Expression: true
String pz_80 = String.valueOf(true);
newParamsPage.putParamValue("IsAvgNeeded", PropertyInfo.TYPE_TRUEFALSE, pz_80);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows", "Data-NLP-Reporting", "");
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
boolean pz__21 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__21) {
// branch to block ERR
nextBlock = "ERR";
return false;
} else {
// branch to block Next1
nextBlock = "Next1";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.4.9.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyUpdateWeeklyMonthlyYearlyAlreadyAggregatedRows",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step7_4_9_6_circum0 definition

/**
 * Create new snapshot record.
 * <p>
 * Step 7.4.9.7 [New1] <code>Page-New</code> [on page Snapshot] <br>
 */
public boolean step7_4_9_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_81 = "Snapshot";
myStepPage = tools.findPage(pz_81, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-NLP-Snapshot","Snapshot",false); 
// primary page will not be added to PageList
	 pega.setStepPage("Snapshot", myStepPage);
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
pz_CurrentStepNum = "7.4.9.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_7_circum0 definition

/**
 * Step 7.4.9.8 <code>Property-Set</code><br>
 */
public boolean step7_4_9_8_circum0() {
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
    pega.setViaPropRef(".pyPredictionId", pRef_13, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), tools.getParamValue("PredictionId"), "sIN", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyOutcome", pRef_44, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_45.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyLanguage", pRef_46, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_47.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyType", pRef_48, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_49.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyKey", pRef_50, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_51.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyFrequency", pRef_52, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), "Daily", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyCount", pRef_34, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER), "sNN", false, true);
}
{
    pega.setViaPropRef(".pySnapShotDay", pRef_53, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), tools.getParamValue("pyReportDate"), "sMN", false, true);
}
{
    pega.setViaPropRef(".pyIsAggregated", pRef_54, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), "false", "sSN", false, true);
}
{
    pega.setViaPropRef(".pyAverageValue", pRef_73, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_74.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DOUBLE), "sEN", false, true);
}
{
    pega.setViaPropRef(".pxCreateDateTime", pRef_55, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_36, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pyModelName", pRef_56, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), scalarValueQuery_57.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pxCommitDateTime", pRef_58, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxSaveDateTime", pRef_59, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
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
pz_CurrentStepNum = "7.4.9.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_8_circum0 definition

/**
 * Step 7.4.9.9 <code>Java</code> [on page Snapshot] <br>
 */
public boolean step7_4_9_9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
try{
  Date snapshotday = tools.getStepPage().getDate("pySnapShotDay");
  StartOfWeek = pega_nlp_nlputilities.pzGetStartOfWeekForGivenDate(snapshotday);
  StartOfMonth = pega_nlp_nlputilities.pzGetStartOfMonthForGivenDate(snapshotday); 
} catch (Exception e) {
  e.printStackTrace();
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
pz_CurrentStepNum = "7.4.9.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_9_circum0 definition

/**
 * Step 7.4.9.10 <code>Property-Set</code><br>
 */
public boolean step7_4_9_10_circum0() {
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
    pega.setViaPropRef(".pyWeekOfSnapShotDay", pRef_60, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, null, new Object[] { StartOfWeek, Integer.toString(0), Integer.toString(0), Integer.toString(0), Integer.toString(0) })), "sMN", false, true);
}
{
    pega.setViaPropRef(".pyMonthOfSnapShotDay", pRef_61, pega.findPageWithException("Snapshot", "Data-NLP-Snapshot"), com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, null, new Object[] { StartOfMonth, Integer.toString(0), Integer.toString(0), Integer.toString(0), Integer.toString(0) })), "sMN", false, true);
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
pz_CurrentStepNum = "7.4.9.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_10_circum0 definition

/**
 * Step 7.4.9.11 <code>Java</code> [on page Snapshot] <br>
 */
public boolean step7_4_9_11_circum0() {
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
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pxCommitDateTime", tools.getStepPage().getString("pxCommitDateTime")))
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyWeekOfSnapShotDay", tools.getStepPage().getString("pyWeekOfSnapShotDay")))
  .insertForColumnsWithValues(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertFieldWithValue("pyMonthOfSnapShotDay", tools.getStepPage().getString("pyMonthOfSnapShotDay")));
  
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
boolean pz__23 = pega.invokeWhen("StepStatusFail", "Data-NLP-Reporting", "Data-NLP-Snapshot");
if (pz__23) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7.4.9.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_11_circum0 definition

/**
 * Step 7.4.9.12 [Next1] <code>Java</code><br>
 */
public boolean step7_4_9_12_circum0() {
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
	
  int deletedCount = -1;

  while(deletedCount!=0){
    
    com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder subQuery = db.getNativeSQLBuilder()
    .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pzinskey"))
	  .from("Data-NLP-Reporting", "A")
    .where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("L", ".pxCreateDateTime", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.LTE, ProcessStartTime, true),
            com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("B", ".pyPredictionID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getParameterPage().getString("PredictionId"), true),
       com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("C", ".pyReportDate", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyReportDate"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("D", ".pyKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyKey"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("E", ".pyType", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyType"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("F", ".pyLanguage", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyLanguage"), true ),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("G", ".pyOutcome", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyOutcome"), true ),
		com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("I", ".pyModelName", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, tools.getStepPage().getString("pyModelName"), true ),
         com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("J", ".pyModelName", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.ISNULL, "",false ),
         com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("K", ".pyKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.ISNULL, "",false ))
    .setLimitSize(1000);   
 
      if(org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && !org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    subQuery.filterLogic("L AND B AND C AND D AND E AND F AND G AND J");
  }
  if(org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    subQuery.filterLogic("L AND B AND C AND K AND E AND F AND G AND J");
  }
  if(!org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    subQuery.filterLogic("L AND B AND C AND K AND E AND F AND G AND I");
  }
  if(!org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyModelName")) && !org.apache.commons.lang3.StringUtils.isBlank(tools.getStepPage().getStringIfPresent("pyKey"))){
    subQuery.filterLogic("L AND B AND C AND D AND E AND F AND G AND I");
  }

    
    com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilderDelete = db.getNativeSQLBuilder()
    .deleteFromClass("Data-NLP-Reporting")
    .where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.subQueryFilter("F1", ".pzInsKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.IN, "A"))
	  .addSubQuery(subQuery)
	  .filterLogic("F1");

    PRThread thread = (PRThread)ThreadContainer.get();
    db.executeNativeSQL("ResultPage", queryBuilderDelete, thread);
    deletedCount = tools.findPage("ResultPage").getInteger("pxResultCount");

  }
} 
catch(Exception e) 
{
  oLog.error("Failed to delete data from pr_data_nlp_reporting");
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
pz_CurrentStepNum = "7.4.9.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_4_9_12_circum0 definition

/**
 * Step 10 [ERR] <code>Java</code><br>
 */
public boolean step10_circum0() {
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
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Step 11 [LAST] <code>Page-Remove</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: ReportPage
pageRemove(tools.findPage("ReportPage"));
// Expression: ReportList
pageRemove(tools.findPage("ReportList"));
// Expression: Snapshot
pageRemove(tools.findPage("Snapshot"));
// Expression: DistinctDateList
pageRemove(tools.findPage("DistinctDateList"));
// Expression: TAList
pageRemove(tools.findPage("TAList"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Step 12 <code>Log-Message</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "End:" +  @CurrentDateTime()
if( oLog.isInfoEnabled() ){
oLog.info(("End:" + PRDateFormat.formatIDT(System.currentTimeMillis())));
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
pz_CurrentStepNum = "12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

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

public String StartOfWeek = "";
public String ProcessStartTime = "";
public String StartOfMonth = "";

public void initializeUserLocalVariables() {
	StartOfWeek = "";
	ProcessStartTime = "";
	StartOfMonth = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("StartOfWeek", (StartOfWeek == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : StartOfWeek.toString());
	smRetVal.putString("ProcessStartTime", (ProcessStartTime == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : ProcessStartTime.toString());
	smRetVal.putString("StartOfMonth", (StartOfMonth == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : StartOfMonth.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_20 = new String[] { "", "", "pyReportDate", "" };
public static final String[] pRef_53 = new String[] { "", "", "pySnapShotDay", "" };
public static final String[] pRef_50 = new String[] { "", "", "pyKey", "" };
public static final String[] pRef_46 = new String[] { "", "", "pyLanguage", "" };
public static final String[] pRef_44 = new String[] { "", "", "pyOutcome", "" };
public static final String[] pRef_48 = new String[] { "", "", "pyType", "" };
public static final String[] pRef_52 = new String[] { "", "", "pyFrequency", "" };
public static final String[] pRef_56 = new String[] { "", "", "pyModelName", "" };
public static final String[] pRef_58 = new String[] { "", "", "pxCommitDateTime", "" };
public static final String[] pRef_59 = new String[] { "", "", "pxSaveDateTime", "" };
public static final String[] pRef_60 = new String[] { "", "", "pyWeekOfSnapShotDay", "" };
public static final String[] pRef_36 = new String[] { "", "", "pxUpdateDateTime", "" };
public static final String[] pRef_61 = new String[] { "", "", "pyMonthOfSnapShotDay", "" };
public static final String[] pRef_55 = new String[] { "", "", "pxCreateDateTime", "" };
public static final String[] pRef_73 = new String[] { "", "", "pyAverageValue", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyPredictionId", "" };
public static final String[] pRef_54 = new String[] { "", "", "pyIsAggregated", "" };
public static final String[] pRef_34 = new String[] { "", "", "pyCount", "" };
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyPredictionId").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_47 = FUAUtil.createQueryBuilder().scalarProperty("pyLanguage").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_74 = FUAUtil.createQueryBuilder().scalarProperty("pyAverageValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_78 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyAverageValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_57 = FUAUtil.createQueryBuilder().scalarProperty("pyModelName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_37 = FUAUtil.createQueryBuilder().scalarProperty("pyIsAggregated").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().scalarProperty("pyType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pyReportDate").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_45 = FUAUtil.createQueryBuilder().scalarProperty("pyOutcome").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_51 = FUAUtil.createQueryBuilder().scalarProperty("pyKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().scalarProperty("pyCount").buildScalarValueQuery();
private static final PageQuery pageQuery_32 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).buildPageQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-NLP-REPORTING PYAGGREGATEDAILYTEXTPREDICTIONDATA #20201215T063228.089 GMT", "Data-NLP-Reporting pyAggregateDailyTextPredictionData", "Pega-NLP", "08-06-01", false, true, "", "ACTIVITY", "20210113T161429.046 GMT" ,"Rule-Obj-Activity"); }
