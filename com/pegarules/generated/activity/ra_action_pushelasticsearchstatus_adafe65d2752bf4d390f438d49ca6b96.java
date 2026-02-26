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
public class ra_action_pushelasticsearchstatus_adafe65d2752bf4d390f438d49ca6b96 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.PushElasticSearchStatus.PegaAESRemote_Interface_ElasticSearchStatus.Action");
	public ra_action_pushelasticsearchstatus_adafe65d2752bf4d390f438d49ca6b96(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT	PegaAESRemote:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 4 Circum: 0" );
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
String pz_6 = "TempSearch";
thisStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 5 Circum: 0" );
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
String pz_8 = "TempSearch";
thisStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 6 Circum: 0" );
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
String pz_10 = "TempSearch";
thisStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_12 = "TempElasticDetails";
thisStepPage = tools.findPage(pz_12, true);
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_14 = pega.findPageWithException("TempSearch", "Pega-Search-Manager").getIfPresent("pyNodeList");
pageRef = pz_14;
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
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
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
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_21 = "ElasticSearchList";
thisStepPage = tools.findPage(pz_21, true);
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_23 = "TempSearch";
thisStepPage = tools.findPage(pz_23, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_23, false);
thisStepPage.putString("pxObjClass", "Pega-Search-Manager");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 11 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_73 = "ElasticSearchList";
thisStepPage = tools.findPage(pz_73, true);
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_75 = "ElasticSearchList";
thisStepPage = tools.findPage(pz_75, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_75, false);
thisStepPage.putString("pxObjClass", "PegaAESRemote-Interface-ElasticSearchStatus");
}
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_78 = "ElasticSearchList";
thisStepPage = tools.findPage(pz_78, true);
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 15_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CLEANUP"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
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
	"Rule-Obj-Activity:PUSHELASTICSEARCHSTATUS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PUSHELASTICSEARCHSTATUS","Rule-Obj-Activity","PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS",false,"","PegaAESRemote","08-07-01","RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT","!PUSHELASTICSEARCHSTATUS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2045391986)
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
//	RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT:20210604T130154.049 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "be7c46b599919d8cd05f57d5b2af618d";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAESRemote-Interface-ElasticSearchStatus";
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
// Expression: "PegaAESRemote : Push Elastic Search Status Info Invoked"
if( oLog.isInfoEnabled() ){
oLog.info("PegaAESRemote : Push Elastic Search Status Info Invoked");
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
 * Set pdcServiceURL.
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
    tools.putParamValue("pdcServiceURL", PropertyInfo.TYPE_TEXT, "PegaAES/v1/LogElasticSearchStatus");
}
{
    tools.putParamValue("servicename", PropertyInfo.TYPE_TEXT, "PushElasticSearchStatus");
}
{
    tools.putParamValue("message", PropertyInfo.TYPE_TEXT, "PegaAESRemote : Elastic Search Status message is");
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
 * Get the End point URL and exit if it is blank.
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\"");
try {
boolean pz_3 = (pega.<String>resolveMethodCall("trim--(String)", "trim", null, null, new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("D_ResourceConfiguration", "PegaAESRemote-"), ImmutablePropertyInfo.TYPE_TEXT) }).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\"",pz_3);
if (pz_3) {
// branch to block CLEANUP
nextBlock = "CLEANUP";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("endpointurl", PropertyInfo.TYPE_TEXT, scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("D_ResourceConfiguration", "PegaAESRemote-"), ImmutablePropertyInfo.TYPE_TEXT));
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
nextBlock = "CLEANUP";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "CLEANUP";
return true;
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Find the appenders. If the node connected to AES or not.
 * <p>
 * Step 4 <code>Call CheckAESConnection</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call CheckAESConnection");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call CheckAESConnection", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call CheckAESConnection
if (myStepPage == null) {
}
// Calling Activity : CheckAESConnection
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "CheckAESConnection", "PegaAESRemote-Interface-ElasticSearchStatus", "");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.SkipThisRun==\"true\"");
try {
boolean pz_5 = (tools.getParamValue("SkipThisRun").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.SkipThisRun==\"true\"",pz_5);
if (pz_5) {
// branch to block CLEANUP
nextBlock = "CLEANUP";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.SkipThisRun==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call CheckAESConnection",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Create New TempSearch Page.
 * <p>
 * Step 5 <code>Page-New</code> [on page TempSearch] <br>
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
String pz_7 = "TempSearch";
myStepPage = tools.findPage(pz_7, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Pega-Search-Manager","TempSearch",false); 
// primary page will not be added to PageList
	 pega.setStepPage("TempSearch", myStepPage);
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
 * Call OOTB pzLPFTSPopulateDefaultAndDedicatedIndexes to populate.
 * <p>
 * Step 6 <code>Call pzLPFTSPopulateDefaultAndDedicatedIndexes</code> [on page TempSearch] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzLPFTSPopulateDefaultAndDedicatedIndexes");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzLPFTSPopulateDefaultAndDedicatedIndexes", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzLPFTSPopulateDefaultAndDedicatedIndexes
if (myStepPage == null) {
String pz_9 = "TempSearch";
myStepPage = tools.findPage(pz_9, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_9, false);
myStepPage.putString("pxObjClass", "Pega-Search-Manager");
}
}
// Calling Activity : pzLPFTSPopulateDefaultAndDedicatedIndexes
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzLPFTSPopulateDefaultAndDedicatedIndexes", "PegaAESRemote-Interface-ElasticSearchStatus", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzLPFTSPopulateDefaultAndDedicatedIndexes",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Call OOTB  pzLPFTSManagerSearchNodeList to populate.
 * <p>
 * Step 7 <code>Call pzLPFTSManagerSearchNodeList</code> [on page TempSearch] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzLPFTSManagerSearchNodeList");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzLPFTSManagerSearchNodeList", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzLPFTSManagerSearchNodeList
if (myStepPage == null) {
String pz_11 = "TempSearch";
myStepPage = tools.findPage(pz_11, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_11, false);
myStepPage.putString("pxObjClass", "Pega-Search-Manager");
}
}
// Calling Activity : pzLPFTSManagerSearchNodeList
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzLPFTSManagerSearchNodeList", "PegaAESRemote-Interface-ElasticSearchStatus", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzLPFTSManagerSearchNodeList",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Call OOTB  pzLPFTSManagerIndexDetails to populate.
 * <p>
 * Step 8 <code>Call pzLPFTSManagerIndexDetails</code> [on page TempElasticDetails] <br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzLPFTSManagerIndexDetails");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzLPFTSManagerIndexDetails", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzLPFTSManagerIndexDetails
if (myStepPage == null) {
String pz_13 = "TempElasticDetails";
myStepPage = tools.findPage(pz_13, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_13, false);
myStepPage.putString("pxObjClass", "Pega-Search-Manager");
}
}
// Calling Activity : pzLPFTSManagerIndexDetails

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzLPFTSManagerIndexDetails", "PegaAESRemote-Interface-ElasticSearchStatus", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzLPFTSManagerIndexDetails",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Setting some properties to map from py properties to our own properties.
 * <p>
 * Step 9 <code>Property-Set</code> [on page TempSearch.pyNodeList] <br>
 */
public boolean step9_circum0() {
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
    pega.setViaPropRef(".NodeDir", pRef_15, myStepPage, scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".NodeState", pRef_17, myStepPage, scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".NodeID", pRef_19, myStepPage, scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
pz_CurrentStepNum = "9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Create New ElasticSearchList Page.
 * <p>
 * Step 10 <code>Page-New</code> [on page ElasticSearchList] <br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_22 = "ElasticSearchList";
myStepPage = tools.findPage(pz_22, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("PegaAESRemote-Interface-ElasticSearchStatus","ElasticSearchList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("ElasticSearchList", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Setting the properties on the REST page for sending it to PDC.
 * <p>
 * Step 11 <code>Property-Set</code> [on page TempSearch] <br>
 */
public boolean step11_circum0() {
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
    pega.setViaPropRef(".RuleIndexState", pRef_24, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), scalarValueQuery_25.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".RuleIndexSize", pRef_27, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), ((com.pega.pegarules.priv.FUAUtil.divide(pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("round--(BigDecimal)", "round", null, null, new Object[] { (scalarValueQuery_28.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL).multiply(BigDecimal.valueOf(100))) }), BigDecimal.valueOf(100))).format(-1, -1) + " MB"), "sTN", false, true);
}
{
    pega.setViaPropRef(".RuleNumDocs", pRef_30, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), scalarValueQuery_31.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sNN", false, true);
}
{
    pega.setViaPropRef(".DataIndexState", pRef_33, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".DataIndexSize", pRef_36, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), ((com.pega.pegarules.priv.FUAUtil.divide(pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("round--(BigDecimal)", "round", null, null, new Object[] { (scalarValueQuery_37.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL).multiply(BigDecimal.valueOf(100))) }), BigDecimal.valueOf(100))).format(-1, -1) + " MB"), "sTN", false, true);
}
{
    pega.setViaPropRef(".DataNumDocs", pRef_39, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), scalarValueQuery_40.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sNN", false, true);
}
{
    pega.setViaPropRef(".WorkIndexState", pRef_42, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".WorkIndexSize", pRef_45, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), ((com.pega.pegarules.priv.FUAUtil.divide(pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("round--(BigDecimal)", "round", null, null, new Object[] { (scalarValueQuery_46.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL).multiply(BigDecimal.valueOf(100))) }), BigDecimal.valueOf(100))).format(-1, -1) + " MB"), "sTN", false, true);
}
{
    pega.setViaPropRef(".WorkNumDocs", pRef_48, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), scalarValueQuery_49.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sNN", false, true);
}
{
    ClipboardProperty pzSourceVar51 = myStepPage.getProperty("pyNodeList");
    ClipboardProperty pzTargetVar52 = pega.getViaPropRef(".IndexNodeList", pRef_53, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), false, false);
    pzTargetVar52.setValue(pzSourceVar51);
}
{
    pega.setViaPropRef(".SearchIndexingStatus", pRef_56, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), scalarValueQuery_57.resolveToString(tools, pega.findPageWithException("TempElasticDetails", "Pega-Search-Manager"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sTN", false, true);
}
{
    pega.setViaPropRef(".WorkIndexStatus", pRef_58, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), scalarValueQuery_59.resolveToString(tools, pega.findPageWithException("TempElasticDetails", "Pega-Search-Manager"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sTN", false, true);
}
{
    pega.setViaPropRef(".RuleIndexStatus", pRef_60, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), scalarValueQuery_61.resolveToString(tools, pega.findPageWithException("TempElasticDetails", "Pega-Search-Manager"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sTN", false, true);
}
{
    pega.setViaPropRef(".DataIndexStatus", pRef_62, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), scalarValueQuery_63.resolveToString(tools, pega.findPageWithException("TempElasticDetails", "Pega-Search-Manager"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sTN", false, true);
}
{
    pega.setViaPropRef(".RulePrimarySize", pRef_64, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), ((com.pega.pegarules.priv.FUAUtil.divide(pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("round--(BigDecimal)", "round", null, null, new Object[] { (scalarValueQuery_65.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL).multiply(BigDecimal.valueOf(100))) }), BigDecimal.valueOf(100))).format(-1, -1) + " MB"), "sTN", false, true);
}
{
    pega.setViaPropRef(".DataPrimarySize", pRef_67, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), ((com.pega.pegarules.priv.FUAUtil.divide(pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("round--(BigDecimal)", "round", null, null, new Object[] { (scalarValueQuery_68.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL).multiply(BigDecimal.valueOf(100))) }), BigDecimal.valueOf(100))).format(-1, -1) + " MB"), "sTN", false, true);
}
{
    pega.setViaPropRef(".WorkPrimarySize", pRef_70, pega.findPageWithException("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), ((com.pega.pegarules.priv.FUAUtil.divide(pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("round--(BigDecimal)", "round", null, null, new Object[] { (scalarValueQuery_71.resolveToBigDecimal(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL).multiply(BigDecimal.valueOf(100))) }), BigDecimal.valueOf(100))).format(-1, -1) + " MB"), "sTN", false, true);
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
 * Step 12 <code>Call-Function</code> [on page ElasticSearchList] <br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call-Function", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call-Function
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyNote", pRef_74, myStepPage, pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, pega.findPage("ElasticSearchList", "PegaAESRemote-Interface-ElasticSearchStatus"), "json" }), "sTN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Append Cluster Name.
 * <p>
 * Step 13 <code>Property-Set</code> [on page ElasticSearchList] <br>
 */
public boolean step13_circum0() {
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
    pega.setViaPropRef(".pyNote", pRef_74, myStepPage, ((scalarValueQuery_76.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "!") + scalarValueQuery_77.resolveToString(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
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
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * Push to AES/PDC.
 * <p>
 * Step 14 <code>Call PDCRestPush</code> [on page ElasticSearchList] <br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PDCRestPush");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call PDCRestPush", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call PDCRestPush
if (myStepPage == null) {
String pz_79 = "ElasticSearchList";
myStepPage = tools.findPage(pz_79, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_79, false);
myStepPage.putString("pxObjClass", "PegaAESRemote-Interface-ElasticSearchStatus");
}
}
// Calling Activity : PDCRestPush
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "PDCRestPush", "PegaAESRemote-Interface-ElasticSearchStatus", "");
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
pz_CurrentStepNum = "14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PDCRestPush",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * Remove unused pages.
 * <p>
 * Step 15 [CLEANUP] <code>Page-Remove</code><br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: ElasticSearchList
pageRemove(tools.findPage("ElasticSearchList"));
// Expression: TempSearch
pageRemove(tools.findPage("TempSearch"));
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
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * Clear the current activity status.
 * <p>
 * Step 16 <code>Activity-Clear-Status</code><br>
 */
public boolean step16_circum0() {
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
pz_CurrentStepNum = "16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

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

public String tenantHash = "";
public String beforeHash = "";

public void initializeUserLocalVariables() {
	tenantHash = "";
	beforeHash = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("tenantHash", (tenantHash == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : tenantHash.toString());
	smRetVal.putString("beforeHash", (beforeHash == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : beforeHash.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_17 = new String[] { "", "", "NodeState", "" };
public static final String[] pRef_36 = new String[] { "", "", "DataIndexSize", "" };
public static final String[] pRef_41 = new String[] { "", "", "pyDefaultIndex", "2", "pyNumDocs", "" };
public static final String[] pRef_72 = new String[] { "", "", "pyDefaultIndex", "3", "pyPrimarySize", "" };
public static final String[] pRef_29 = new String[] { "", "", "pyDefaultIndex", "1", "pyTotalSize", "" };
public static final String[] pRef_39 = new String[] { "", "", "DataNumDocs", "" };
public static final String[] pRef_33 = new String[] { "", "", "DataIndexState", "" };
public static final String[] pRef_53 = new String[] { "", "", "IndexNodeList", "" };
public static final String[] pRef_30 = new String[] { "", "", "RuleNumDocs", "" };
public static final String[] pRef_74 = new String[] { "", "", "pyNote", "" };
public static final String[] pRef_24 = new String[] { "", "", "RuleIndexState", "" };
public static final String[] pRef_69 = new String[] { "", "", "pyDefaultIndex", "2", "pyPrimarySize", "" };
public static final String[] pRef_44 = new String[] { "", "", "pyDefaultIndex", "3", "pyIndexState", "" };
public static final String[] pRef_56 = new String[] { "", "", "SearchIndexingStatus", "" };
public static final String[] pRef_62 = new String[] { "", "", "DataIndexStatus", "" };
public static final String[] pRef_26 = new String[] { "", "", "pyDefaultIndex", "1", "pyIndexState", "" };
public static final String[] pRef_67 = new String[] { "", "", "DataPrimarySize", "" };
public static final String[] pRef_45 = new String[] { "", "", "WorkIndexSize", "" };
public static final String[] pRef_64 = new String[] { "", "", "RulePrimarySize", "" };
public static final String[] pRef_66 = new String[] { "", "", "pyDefaultIndex", "1", "pyPrimarySize", "" };
public static final String[] pRef_42 = new String[] { "", "", "WorkIndexState", "" };
public static final String[] pRef_60 = new String[] { "", "", "RuleIndexStatus", "" };
public static final String[] pRef_48 = new String[] { "", "", "WorkNumDocs", "" };
public static final String[] pRef_19 = new String[] { "", "", "NodeID", "" };
public static final String[] pRef_47 = new String[] { "", "", "pyDefaultIndex", "3", "pyTotalSize", "" };
public static final String[] pRef_70 = new String[] { "", "", "WorkPrimarySize", "" };
public static final String[] pRef_58 = new String[] { "", "", "WorkIndexStatus", "" };
public static final String[] pRef_50 = new String[] { "", "", "pyDefaultIndex", "3", "pyNumDocs", "" };
public static final String[] pRef_27 = new String[] { "", "", "RuleIndexSize", "" };
public static final String[] pRef_38 = new String[] { "", "", "pyDefaultIndex", "2", "pyTotalSize", "" };
public static final String[] pRef_15 = new String[] { "", "", "NodeDir", "" };
public static final String[] pRef_35 = new String[] { "", "", "pyDefaultIndex", "2", "pyIndexState", "" };
public static final String[] pRef_32 = new String[] { "", "", "pyDefaultIndex", "1", "pyNumDocs", "" };
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 3).scalarProperty("pyIndexState").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pyNodeHostName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 3).scalarProperty("pyTotalSize").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_37 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 2).scalarProperty("pyTotalSize").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_59 = FUAUtil.createQueryBuilder().scalarProperty("pyWorkEnabled").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyNodeHostDir").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_71 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 3).scalarProperty("pyPrimarySize").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pyNodeStatus").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_28 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 1).scalarProperty("pyTotalSize").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 3).scalarProperty("pyNumDocs").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_61 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleEnabled").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_76 = FUAUtil.createQueryBuilder().scalarProperty("pyNote").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 2).scalarProperty("pyIndexState").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_65 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 1).scalarProperty("pyPrimarySize").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 2).scalarProperty("pyNumDocs").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_57 = FUAUtil.createQueryBuilder().scalarProperty("pyIndexEnabled").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("RESTEndPointURL").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_63 = FUAUtil.createQueryBuilder().scalarProperty("pyDataEnabled").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_77 = FUAUtil.createQueryBuilder().scalarProperty("pxSystemName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 1).scalarProperty("pyNumDocs").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_68 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 2).scalarProperty("pyPrimarySize").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("FinalRESTEndPointURL").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_25 = FUAUtil.createQueryBuilder().pageList("pyDefaultIndex", 1).scalarProperty("pyIndexState").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-ELASTICSEARCHSTATUS PUSHELASTICSEARCHSTATUS #20210604T130154.049 GMT", "PegaAESRemote-Interface-ElasticSearchStatus PushElasticSearchStatus", "PegaAESRemote", "08-07-01", false, true, "", "ACTIVITY", "20210604T130154.049 GMT" ,"Rule-Obj-Activity"); }
