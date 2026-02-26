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
public class ra_action_pzgetstartingflowsfromapp_f6e53464f3f42d8f1df74fbafe3bbc42 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzGetStartingFlowsFromApp.Rule_Obj_Flow.Action");
	public ra_action_pzgetstartingflowsfromapp_f6e53464f3f42d8f1df74fbafe3bbc42(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT	Pega-EndUserUI:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 1_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_5 = pega.findPageWithException("Application", "Rule-Application").getIfPresent("pyWorkMetaData");
pageRef = pz_5;
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
pz_CurrentStepNum = "1.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_0_circum0");
}
PRStackFrame pz_StackFrame1_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_0 Circum: 0" );
try {
pz_Status = step1_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_56 = "D_StartingFlows";
thisStepPage = tools.findPage(pz_56, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_56, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_58 = pega.findPageWithException("D_StartingFlows", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_58;
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
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...
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
	"Rule-Obj-Activity:PZGETSTARTINGFLOWSFROMAPP"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETSTARTINGFLOWSFROMAPP","Rule-Obj-Activity","RULE-OBJ-FLOW",false,"","Pega-EndUserUI","08-06-01","RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT","!PZGETSTARTINGFLOWSFROMAPP",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-524012078)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT:20201127T133016.796 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "2212d18c88876e417471b159c699f896";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Flow";
	}
public String getAspect() {
return "Action";
}
/**
 * Iterate thru pyWorkMetaData and populate starting flows.
 * <p>
 * Step 1.0 <code>Property-Set</code> [on page Application.pyWorkMetaData] <br>
 */
public boolean step1_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.WorkPool != \"\"");
try {
boolean pz_6 = (!(tools.getParamValue("WorkPool").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.WorkPool != \"\"",pz_6);
if (!pz_6) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.WorkPool != \"\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyWorkPoolName==param.WorkPool");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyWorkPoolName==param.WorkPool", "FUAInstance-NullMyStepPage");
}
boolean pz_8 = (scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(tools.getParamValue("WorkPool")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyWorkPoolName==param.WorkPool",pz_8);
if (!pz_8) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyWorkPoolName==param.WorkPool " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    caseTypeOnApplication = scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    showInNewWorkMenu = scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    workPoolClass = scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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

// Code to call nested step 1_1_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Offline"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_1_circum0");
}
String pz_11 = "TempCase";
nestedStepPage = tools.findPage(pz_11, true);
PRStackFrame pz_StackFrame1_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_2_circum0");
}
PRStackFrame pz_StackFrame1_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Package"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_3_circum0");
}
PRStackFrame pz_StackFrame1_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_4_circum0");
}
PRStackFrame pz_StackFrame1_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Flows"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_5_circum0");
}
PRStackFrame pz_StackFrame1_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_6_circum0");
}
PRStackFrame pz_StackFrame1_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_7_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_12 = pega.findPageWithException("StartingFlows", "Code-Pega-List").getIfPresent("pxResults");
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
pz_CurrentStepNum = "1.7.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_7_0_circum0");
}
PRStackFrame pz_StackFrame1_7_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_7_0 Circum: 0" );
try {
pz_Status = step1_7_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_7_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 1_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_8_circum0");
}
String pz_13 = "StartingFlows";
nestedStepPage = tools.findPage(pz_13, true);
PRStackFrame pz_StackFrame1_8_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_9_circum0");
}
String pz_14 = "TempCase";
nestedStepPage = tools.findPage(pz_14, true);
PRStackFrame pz_StackFrame1_9_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_9_circum0, false);
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
pz_CurrentStepNum = "1.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_0_circum0 definition

/**
 * Open if the isForOfflineTemplate param is true.
 * <p>
 * Step 1.1 [Offline] <code>Obj-Open</code> [on page TempCase] <br>
 */
public boolean step1_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.isForOfflineTemplate==\"true\"");
try {
boolean pz_15 = (tools.getParamValue("isForOfflineTemplate").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.isForOfflineTemplate==\"true\"",pz_15);
if (!pz_15) {
// branch to block Flows
nextBlock = "Flows";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.isForOfflineTemplate==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_16 = "TempCase";
myStepPage = tools.findPage(pz_16, true);
// Expression: 
// Expression: Rule-Obj-CaseType
myStepPage = tools.getThread().createPage("Rule-Obj-CaseType", pz_16);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyClassName", pRef_17, myStepPage, scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), "siN", false, false);
}
{
    pega.setViaPropRef(".pyPurpose", pRef_19, myStepPage, "pyDefault", "sTN64", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "TempCase", "", false, false);
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
pz_CurrentStepNum = "1.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_1_circum0 definition

/**
 * Copy pyOfflineCases into Application.
 * <p>
 * Step 1.2 <code>Page-Copy</code><br>
 */
public boolean step1_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "TempCase.pyOfflineEnabled==true");
try {
boolean pz_21 = (scalarValueQuery_20.resolveToBoolean(tools, pega.findPageWithException("TempCase", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "TempCase.pyOfflineEnabled==true",pz_21);
if (!pz_21) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("TempCase.pyOfflineEnabled==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: TempCase
sourcePage = tools.findPage("TempCase", true);
// Expression: Application.pyOfflineCases(<APPEND>)
ClipboardPage pz_22 = pega.findPageWithException("Application", "Rule-Application").getProperty(".pyOfflineCases(<append>)").getPageValue();
targetPage = pz_22;
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
pz_CurrentStepNum = "1.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_2_circum0 definition

/**
 * Push current caseType to pyPackagableOfflineCases.
 * <p>
 * Step 1.3 [Package] <code>Page-Copy</code><br>
 */
public boolean step1_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.pyIgnoreRules==\"true\"");
try {
boolean pz_23 = (tools.getParamValue("pyIgnoreRules").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.pyIgnoreRules==\"true\"",pz_23);
if (pz_23) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.pyIgnoreRules==\"true\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "TempCase.pyOfflineEnabled==true");
try {
boolean pz_24 = (scalarValueQuery_20.resolveToBoolean(tools, pega.findPageWithException("TempCase", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "TempCase.pyOfflineEnabled==true",pz_24);
if (!pz_24) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("TempCase.pyOfflineEnabled==true " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "TempCase.pyIsOptimisticPackaging!=true");
try {
boolean pz_26 = (scalarValueQuery_25.resolveToBoolean(tools, pega.findPageWithException("TempCase", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TRUEFALSE) != true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "TempCase.pyIsOptimisticPackaging!=true",pz_26);
if (!pz_26) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("TempCase.pyIsOptimisticPackaging!=true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: TempCase
sourcePage = tools.findPage("TempCase", true);
// Expression: Application.pyOfflineCaseTypes("full").pyComponentList(<APPEND>).pyOfflineCaseType
ClipboardPage pz_28 = pega.getViaPropRef(".pyOfflineCaseTypes(full).pyComponentList(<append>).pyOfflineCaseType", pRef_27, pega.findPageWithException("Application", "Rule-Application"), false, false).getPageValue();
targetPage = pz_28;
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
pz_CurrentStepNum = "1.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_3_circum0 definition

/**
 * Step 1.4 <code>Java</code><br>
 */
public boolean step1_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "TempCase.pyOfflineEnabled==true");
try {
boolean pz_29 = (scalarValueQuery_20.resolveToBoolean(tools, pega.findPageWithException("TempCase", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "TempCase.pyOfflineEnabled==true",pz_29);
if (!pz_29) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("TempCase.pyOfflineEnabled==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardProperty cp_WPResults = tools.getProperty("Application.pyWorkPoolsInApp.pxResults"); 
java.util.Iterator resultsIterator = cp_WPResults.iterator();

while(resultsIterator.hasNext()){
  ClipboardProperty cp_currentProperty = (ClipboardProperty) resultsIterator.next();
  ClipboardPage pg_pageValue = cp_currentProperty.getPageValue();
  
  if(pg_pageValue.getString("pyRuleName").equals(workPoolClass)){
  	pg_pageValue.putString("pyOfflineEnabled", "true");
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
pz_CurrentStepNum = "1.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_4_circum0 definition

/**
 * get starting flows for the current case type.
 * <p>
 * Step 1.5 [Flows] <code>java</code><br>
 */
public boolean step1_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.showInNewWorkMenu != \"false\"");
try {
boolean pz_30 = (!(showInNewWorkMenu.equals("false")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.showInNewWorkMenu != \"false\"",pz_30);
if (!pz_30) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.showInNewWorkMenu != \"false\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.isForOfflineTemplate==\"true\"");
try {
boolean pz_31 = (tools.getParamValue("isForOfflineTemplate").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.isForOfflineTemplate==\"true\"",pz_31);
if (!pz_31) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.isForOfflineTemplate==\"true\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
boolean pz__1 = pega.invokeWhen("pyShowNonOSCOCases", "Rule-Obj-Flow", "Embed-Application-WorkMetaData");
if (pz__1) {
doWhenProcessing = false;
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "TempCase.pyOfflineEnabled==true");
try {
boolean pz_32 = (scalarValueQuery_20.resolveToBoolean(tools, pega.findPageWithException("TempCase", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "TempCase.pyOfflineEnabled==true",pz_32);
if (!pz_32) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("TempCase.pyOfflineEnabled==true " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
String strClassName= caseTypeOnApplication;
String strPageName = "StartingFlows";

pega_processarchitect_pzprocessarchitect.pzGetStartingFlows(strClassName,false,strPageName);
ClipboardPage cp=tools.findPage(strPageName);

if(cp!=null){
	if(cp.getString("pyAction").equals("")){
		pega_rules_utilities.removeDuplicatesFromList(cp, "pxInsName", strClassName);
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
pz_CurrentStepNum = "1.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_5_circum0 definition

/**
 * Append to D_StartingFlows when showInNewWorkMenu is true.
 * <p>
 * Step 1.6 <code>Property-Set</code><br>
 */
public boolean step1_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.CaseTypeWithInitializationStage");
try {
boolean pz_33 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "CaseTypeWithInitializationStage");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.CaseTypeWithInitializationStage",pz_33);
if (!pz_33) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.CaseTypeWithInitializationStage " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).pxObjClass", pRef_34, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), "Rule-Obj-Flow", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyClassName", pRef_35, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), caseTypeOnApplication, "siN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyLabel", pRef_36, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), tools.getParamValue("CaseLabel"), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pySkipNewHarness", pRef_37, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), tools.getParamValue("SkipNewHarness"), "sSN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyCreatesTemporaryObject", pRef_38, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), tools.getParamValue("CreatesTemporaryObject"), "sSN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pzCTWithInitializationStage", pRef_39, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), true, "sSY", false, true);
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
pz_CurrentStepNum = "1.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_6_circum0 definition

/**
 * loop through StartingFlows page.
 * <p>
 * Step 1.7.0 <code>Java</code> [on page StartingFlows.pxResults] <br>
 */
public boolean step1_7_0_circum0() {
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

// Code to call nested step 1_7_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.7.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_7_1_circum0");
}
PRStackFrame pz_StackFrame1_7_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_7_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_7_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_7_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_7_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.7.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_7_2_circum0");
}
PRStackFrame pz_StackFrame1_7_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_7_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_7_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_7_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_7_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.7.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_7_3_circum0");
}
PRStackFrame pz_StackFrame1_7_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_7_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_7_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_7_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_7_4_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
if (myStepPage == null) {
throw new InvalidReferenceException(".pyPrivilegeList", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_40 = myStepPage.getIfPresent("pyPrivilegeList");
nestedPageRef = pz_40;
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
pz_CurrentStepNum = "1.7.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_7_4_circum0");
}
PRStackFrame pz_StackFrame1_7_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_7_4 Circum: 0" );
try {
pz_Status = step1_7_4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_7_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 1_7_5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Next"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.7.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_7_5_circum0");
}
PRStackFrame pz_StackFrame1_7_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_7_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_7_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_7_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_7_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.7.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_7_6_circum0");
}
PRStackFrame pz_StackFrame1_7_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_7_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_7_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_7_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_7_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.7.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_7_7_circum0");
}
PRStackFrame pz_StackFrame1_7_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_7_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_7_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_7_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_7_8_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ex"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.7.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_7_8_circum0");
}
PRStackFrame pz_StackFrame1_7_8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT Step: 1_7_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_7_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_7_8_circum0, false);
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
pz_CurrentStepNum = "1.7.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_7_0_circum0 definition

/**
 * populate insname, handle and label.
 * <p>
 * Step 1.7.1 <code>java</code><br>
 */
public boolean step1_7_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
StringMap flowKeys = new HashStringMap();
flowKeys.put("pxObjClass", "Rule-Obj-Flow");
flowKeys.put("pyClassName", caseTypeOnApplication);
flowKeys.put("pyFlowType", myStepPage.getString(".pyFlowType"));
								
String columns[] = new String[3];
columns[0] = "pzInsKey";
columns[1] = "pyLabel";
columns[2] = "pxInsName";

try {
// Do rule resolved open of that flow rule to get key information
ClipboardPage pgReturnedColumns = ((PegaDatabase)tools.getDatabase()).openSelectedColumns(flowKeys, columns);
								
if(pgReturnedColumns != null){
		// Resolved to actual case type rule, so now we have key information
								
									String sInsHandle = pgReturnedColumns.getString(".pzInsKey");
									String sLabel = pgReturnedColumns.getString(".pyLabel");
									String sInsName = pgReturnedColumns.getString(".pxInsName");
									String sSkipNewHarness = pgReturnedColumns.getStringIfPresent(".pySkipNewHarness");
									String sCreatesTemporaryObject = pgReturnedColumns.getStringIfPresent(".pyCreatesTemporaryObject");
                  if(sSkipNewHarness == null || sCreatesTemporaryObject == null){
                    ClipboardPage flowPage = tools.getDatabase().open(flowKeys,false);
                    if(flowPage!=null){
                      sSkipNewHarness = flowPage.getString(".pySkipNewHarness");
                      sCreatesTemporaryObject = flowPage.getString(".pyCreatesTemporaryObject");
                    }
                  }
  
  									myStepPage.putString(".pxInsHandle",sInsHandle);
  									myStepPage.putString(".pyLabel",sLabel);
  									myStepPage.putString(".pxInsName",sInsName);
                    myStepPage.putString(".pySkipNewHarness",sSkipNewHarness);
  									myStepPage.putString(".pyCreatesTemporaryObject",sCreatesTemporaryObject);
  
}

}

catch (DatabaseException ee)
	{
		oLog.error("openSelectedColumns failed " );
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
pz_CurrentStepNum = "1.7.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_7_1_circum0 definition

/**
 * call getPrivileges to populate pyPrivilegeList.
 * <p>
 * Step 1.7.2 <code>Call getPrivileges</code><br>
 */
public boolean step1_7_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call getPrivileges");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call getPrivileges", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call getPrivileges
if (myStepPage == null) {
}
// Calling Activity : getPrivileges

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();

pega.invokeActivity(myStepPage, newParamsPage, "getPrivileges", "Rule-Obj-Flow", "");
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
pz_CurrentStepNum = "1.7.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call getPrivileges",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_7_2_circum0 definition

/**
 * initially set havePrivilege to true.
 * <p>
 * Step 1.7.3 <code>Property-Set</code><br>
 */
public boolean step1_7_3_circum0() {
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
    havePrivilege = true;
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    className = scalarValueQuery_41.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
pz_CurrentStepNum = "1.7.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_7_3_circum0 definition

/**
 * We just need access to one of the privileges.
 * <p>
 * Step 1.7.4 <code>Java</code> [on page .pyPrivilegeList] <br>
 */
public boolean step1_7_4_circum0() {
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
ClipboardPage flowPrimaryPage = tools.createPage(className, "");

havePrivilege = tools.getAuthorizationHandle().havePrivilege(tools, myStepPage.getString("pyPrivilegeName"), 
                                                              myStepPage.getString("pyPrivilegeClass") , flowPrimaryPage);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.havePrivilege");
try {
boolean pz_42 = havePrivilege;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.havePrivilege",pz_42);
if (pz_42) {
// branch to block Next
nextBlock = "Next";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.havePrivilege " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "1.7.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_7_4_circum0 definition

/**
 * Check if user has privilege to the flow unless security is ignored.
 * <p>
 * Step 1.7.5 [Next] <code>java</code><br>
 */
public boolean step1_7_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
if ("true".equals(tools.getParamValue("IgnoreSecurity"))|| havePrivilege)
   {
      // set pyRuleName to pyClassName!pyFlowType
      String pyClassName = myStepPage.getString(".pyClassName");
      String pyFlowType = myStepPage.getString(".pyFlowType");
      myStepPage.putString("pyRuleName", pyClassName + "!" + pyFlowType); 
   }
   else 
     nextBlock = "ex";
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
pz_CurrentStepNum = "1.7.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_7_5_circum0 definition

/**
 * Append to D_StartingFlows when showInNewWorkMenu is true.
 * <p>
 * Step 1.7.6 <code>Property-Set</code><br>
 */
public boolean step1_7_6_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).pxObjClass", pRef_34, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), "Rule-Obj-Flow", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyClassName", pRef_35, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), caseTypeOnApplication, "siN", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxResults(<last>).pyFlowType", pRef_43, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), scalarValueQuery_44.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxInsHandle", pRef_45, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), scalarValueQuery_46.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyLabel", pRef_36, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), scalarValueQuery_47.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxInsName", pRef_48, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), scalarValueQuery_49.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pySkipNewHarness", pRef_37, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), scalarValueQuery_50.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyCreatesTemporaryObject", pRef_38, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), scalarValueQuery_51.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
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
pz_CurrentStepNum = "1.7.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_7_6_circum0 definition

/**
 * set pyOfflineEnabled on the starting flows.
 * <p>
 * Step 1.7.7 <code>Property-Set</code><br>
 */
public boolean step1_7_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.isForOfflineTemplate==\"true\"");
try {
boolean pz_52 = (tools.getParamValue("isForOfflineTemplate").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.isForOfflineTemplate==\"true\"",pz_52);
if (!pz_52) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.isForOfflineTemplate==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<last>).pyOfflineEnabled", pRef_53, pega.findPageWithException("D_StartingFlows", "Code-Pega-List"), scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("TempCase", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
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
pz_CurrentStepNum = "1.7.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_7_7_circum0 definition

/**
 * Step 1.7.8 [ex] <code>Java</code><br>
 */
public boolean step1_7_8_circum0() {
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
pz_CurrentStepNum = "1.7.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_7_8_circum0 definition

/**
 * Remove temp page.
 * <p>
 * Step 1.8 <code>Page-Remove</code> [on page StartingFlows] <br>
 */
public boolean step1_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageExists(\"StartingFlows\")");
try {
boolean pz_54 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "StartingFlows" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageExists(\"StartingFlows\")",pz_54);
if (!pz_54) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageExists(\"StartingFlows\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "1.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_8_circum0 definition

/**
 * Step 1.9 <code>Page-Remove</code> [on page TempCase] <br>
 */
public boolean step1_9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageExists(\"TempCase\")");
try {
boolean pz_55 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "TempCase" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageExists(\"TempCase\")",pz_55);
if (!pz_55) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageExists(\"TempCase\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "1.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_9_circum0 definition

/**
 * set the new results count.
 * <p>
 * Step 2 <code>Property-Set</code> [on page D_StartingFlows] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxResultCount", pRef_57, myStepPage, (pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { myStepPage.getProperty("pxResults") })).intValue(), "sNY", false, true);
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
 * If duplicate flows, differentiate them with class label in braces.
 * <p>
 * Step 3 <code>java</code> [on page D_StartingFlows.pxResults] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxInsName!=\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxInsName!=\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_59 = (!(scalarValueQuery_49.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxInsName!=\"\"",pz_59);
if (!pz_59) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxInsName!=\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@countInPageList(.pxInsName,pxInsName,D_StartingFlows.pxResults) &gt; 1");
try {
boolean pz_60 = ((pega.<Integer>resolveMethodCall("countInPageList--(String,String,ClipboardProperty)", "countInPageList", null, null, new Object[] { scalarValueQuery_49.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pxInsName", pega.findPageWithException("D_StartingFlows", "Code-Pega-List").getProperty("pxResults") })).intValue() > 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@countInPageList(.pxInsName,pxInsName,D_StartingFlows.pxResults) &gt; 1",pz_60);
if (!pz_60) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@countInPageList(.pxInsName,pxInsName,D_StartingFlows.pxResults) &gt; 1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
String clsName = myStepPage.getString(".pyClassName");
String flowLabel = myStepPage.getString(".pyLabel");

String classLabel = tools.getDictionary().fromDefinition(clsName, "pyLabel");
flowLabel += (" (" + classLabel + ")");

myStepPage.putString(".pyLabel",flowLabel);
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

public boolean havePrivilege = false;
public String workPoolClass = "";
public String caseTypeOnApplication = "";
public String className = "";
public String errMessage = "";
public String showInNewWorkMenu = "";

public void initializeUserLocalVariables() {
	havePrivilege = false;
	workPoolClass = "";
	caseTypeOnApplication = "";
	className = "";
	errMessage = "";
	showInNewWorkMenu = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("havePrivilege", Boolean.toString(havePrivilege));
	smRetVal.putString("workPoolClass", (workPoolClass == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : workPoolClass.toString());
	smRetVal.putString("caseTypeOnApplication", (caseTypeOnApplication == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : caseTypeOnApplication.toString());
	smRetVal.putString("className", (className == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : className.toString());
	smRetVal.putString("errMessage", (errMessage == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : errMessage.toString());
	smRetVal.putString("showInNewWorkMenu", (showInNewWorkMenu == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : showInNewWorkMenu.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_39 = new String[] { "", "", "pxResults", "<last>", "pzCTWithInitializationStage", "" };
public static final String[] pRef_17 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_34 = new String[] { "", "", "pxResults", "<append>", "pxObjClass", "" };
public static final String[] pRef_35 = new String[] { "", "", "pxResults", "<last>", "pyClassName", "" };
public static final String[] pRef_45 = new String[] { "", "", "pxResults", "<last>", "pxInsHandle", "" };
public static final String[] pRef_53 = new String[] { "", "", "pxResults", "<last>", "pyOfflineEnabled", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyPurpose", "" };
public static final String[] pRef_38 = new String[] { "", "", "pxResults", "<last>", "pyCreatesTemporaryObject", "" };
public static final String[] pRef_27 = new String[] { "", "", "pyOfflineCaseTypes", "full", "pyComponentList", "<append>", "pyOfflineCaseType", "" };
public static final String[] pRef_48 = new String[] { "", "", "pxResults", "<last>", "pxInsName", "" };
public static final String[] pRef_43 = new String[] { "", "", "pxResults", "<last>", "pyFlowType", "" };
public static final String[] pRef_37 = new String[] { "", "", "pxResults", "<last>", "pySkipNewHarness", "" };
public static final String[] pRef_36 = new String[] { "", "", "pxResults", "<last>", "pyLabel", "" };
public static final String[] pRef_57 = new String[] { "", "", "pxResultCount", "" };
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().pageList("pyWorkMetaData").scalarProperty("pyWorkTypeImplementationClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_47 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().scalarProperty("pxInsHandle").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyWorkTypeImplementationClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().scalarProperty("pxInsName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_50 = FUAUtil.createQueryBuilder().scalarProperty("pySkipNewHarness").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyShowInNewWorkMenu").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_51 = FUAUtil.createQueryBuilder().scalarProperty("pyCreatesTemporaryObject").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pyOfflineEnabled").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_41 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pyWorkPoolName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_25 = FUAUtil.createQueryBuilder().scalarProperty("pyIsOptimisticPackaging").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_44 = FUAUtil.createQueryBuilder().scalarProperty("pyFlowType").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZGETSTARTINGFLOWSFROMAPP #20201127T133016.796 GMT", "Rule-Obj-Flow pzGetStartingFlowsFromApp", "Pega-EndUserUI", "08-06-01", false, true, "", "ACTIVITY", "20201127T133016.796 GMT" ,"Rule-Obj-Activity"); }
