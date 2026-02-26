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
public class ra_action_pzaddhistorymemoforcaselp_ba3d74f5db1006959cb5ed6a81a1629c extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzAddHistoryMemoForCaseLP.Rule_Obj_CaseType.Action");
	public ra_action_pzaddhistorymemoforcaselp_ba3d74f5db1006959cb5ed6a81a1629c(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT	Pega-ProcessArchitect:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
ClipboardProperty pz_4 = pega.findDataPage("D_pzCaseSettings", true, "className", scalarValueQuery_1.resolveToString(tools, pzPrimPage, ImmutablePropertyInfo.TYPE_TEXT)).getIfPresent("pySettings");
pageRef = pz_4;
} 
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
pz_CurrentStepNum = "2.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_0_circum0");
}
PRStackFrame pz_StackFrame2_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_0 Circum: 0" );
try {
pz_Status = step2_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_0_circum0, false);
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
	"Rule-Obj-Activity:PZADDHISTORYMEMOFORCASELP"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZADDHISTORYMEMOFORCASELP","Rule-Obj-Activity","RULE-OBJ-CASETYPE",false,"","Pega-ProcessArchitect","08-04-01","RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT","!PZADDHISTORYMEMOFORCASELP",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",209769278)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT:20190731T105248.331 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "44453afe0afa77055efb204d9de76bf5";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-CaseType";
	}
public String getAspect() {
return "Action";
}
/**
 * If settings data page does not exist exit activity.
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
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("className", PropertyInfo.TYPE_TEXT, scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Default.PageExists(D_pzCaseSettings[className:Param.className])");
try {
boolean pz_3 = (pega.<java.lang.Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, "Default", new Object[]{("D_pzCaseSettings")})).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Default.PageExists(D_pzCaseSettings[className:Param.className])",pz_3);
if (!pz_3) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzAddHistoryMemoForCaseLP - Transition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Default.PageExists(D_pzCaseSettings[className:Param.className]) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Iterate on Case settings to add history memo for visited settings options.
 * <p>
 * Step 2.0 <code>Java</code> [on page D_pzCaseSettings[className:.pyClassName].pySettings] <br>
 */
public boolean step2_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_selectedStage = tools.findPage(tools.getParamValue("selectedStage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyIsVisited");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyIsVisited", "FUAInstance-NullMyStepPage");
}
boolean pz_6 = scalarValueQuery_5.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyIsVisited",pz_6);
if (!pz_6) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyIsVisited " + anyException.getMessage(), anyException);
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
ClipboardProperty nestedPageRef = null;
java.util.Iterator myNestedPageList = null;
ClipboardProperty nextNestedPage = null;
ClipboardPage nestedStepPage = null;
ClipboardPage thisStepPage = null;

// Code to call nested step 2_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_1_circum0");
}
PRStackFrame pz_StackFrame2_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_2_circum0");
}
String pz_7 = "CaseTypeStages";
nestedStepPage = tools.findPage(pz_7, true);
PRStackFrame pz_StackFrame2_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("AC"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_3_circum0");
}
PRStackFrame pz_StackFrame2_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_4_circum0");
}
String pz_8 = "CaseTypeStages";
nestedStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame2_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SP"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_circum0");
}
PRStackFrame pz_StackFrame2_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_6_circum0");
}
String pz_9 = "CaseTypeStages";
nestedStepPage = tools.findPage(pz_9, true);
PRStackFrame pz_StackFrame2_6_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("GEN"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_7_circum0");
}
PRStackFrame pz_StackFrame2_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_8_circum0");
}
PRStackFrame pz_StackFrame2_8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_9_circum0");
}
PRStackFrame pz_StackFrame2_9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_10_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CAL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_10_circum0");
}
PRStackFrame pz_StackFrame2_10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_11_circum0");
}
PRStackFrame pz_StackFrame2_11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_12_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_12_circum0");
}
PRStackFrame pz_StackFrame2_12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_13_circum0");
}
PRStackFrame pz_StackFrame2_13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_13 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_13_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_14_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_14_circum0");
}
PRStackFrame pz_StackFrame2_14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_14 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_14_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_15_circum0");
}
PRStackFrame pz_StackFrame2_15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_15 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_15_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_16_circum0");
}
PRStackFrame pz_StackFrame2_16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_16 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_16_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_17_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_17_circum0");
}
PRStackFrame pz_StackFrame2_17_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_17 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_17_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_18_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_18_circum0");
}
PRStackFrame pz_StackFrame2_18_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_18 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_18_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_18_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_19_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ES"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.19";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_19_circum0");
}
PRStackFrame pz_StackFrame2_19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT Step: 2_19 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_19_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_19_circum0, false);
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
pz_CurrentStepNum = "2.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_0_circum0 definition

/**
 * History for User actions.
 * <p>
 * Step 2.1 <code>Java</code><br>
 */
public boolean step2_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_selectedStage = tools.findPage(tools.getParamValue("selectedStage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-UserActions\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-UserActions\"", "FUAInstance-NullMyStepPage");
}
boolean pz_11 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-UserActions"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-UserActions\"",pz_11);
if (!pz_11) {
// branch to block AC
nextBlock = "AC";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-UserActions\" " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "2.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_1_circum0 definition

/**
 * Step 2.2 <code>Call pzSetHistoryMemoForCaseConfig</code> [on page CaseTypeStages] <br>
 */
public boolean step2_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSetHistoryMemoForCaseConfig");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzSetHistoryMemoForCaseConfig", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzSetHistoryMemoForCaseConfig
if (myStepPage == null) {
String pz_12 = "CaseTypeStages";
myStepPage = tools.findPage(pz_12, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_12, false);
myStepPage.putString("pxObjClass", "Rule-Obj-CaseType");
}
}
// Calling Activity : pzSetHistoryMemoForCaseConfig

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "pyRuleMemo-AddedDeletedLocalActions\t"
newParamsPage.putParamValue("AddDeleteFieldValue", PropertyInfo.TYPE_TEXT, "pyRuleMemo-AddedDeletedLocalActions\t");
// Expression: "pyActionName"
newParamsPage.putParamValue("beforePropertyRef", PropertyInfo.TYPE_TEXT, "pyActionName");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "CaseTypeStages.pyCaseWideLocalActions"
newParamsPage.putParamValue("afterPageListRef", PropertyInfo.TYPE_TEXT, "CaseTypeStages.pyCaseWideLocalActions");
// Expression: "pyRuleMemo-DeletedLocalActions\t"
newParamsPage.putParamValue("DeleteFieldValue", PropertyInfo.TYPE_TEXT, "pyRuleMemo-DeletedLocalActions\t");
// Expression: "CaseTypeStagesBackup.pyCaseWideLocalActions"
newParamsPage.putParamValue("beforePageListRef", PropertyInfo.TYPE_TEXT, "CaseTypeStagesBackup.pyCaseWideLocalActions");
// Expression: "pyRuleMemo-AddedLocalActions\t"
newParamsPage.putParamValue("AddFieldValue", PropertyInfo.TYPE_TEXT, "pyRuleMemo-AddedLocalActions\t");
// Expression: "pyActionName"
newParamsPage.putParamValue("afterPropertyRef", PropertyInfo.TYPE_TEXT, "pyActionName");

pega.invokeActivity(myStepPage, newParamsPage, "pzSetHistoryMemoForCaseConfig", "Rule-Obj-CaseType", "");
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
boolean pz__1 = true;
if (pz__1) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSetHistoryMemoForCaseConfig",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_2_circum0 definition

/**
 * Attachment categories.
 * <p>
 * Step 2.3 [AC] <code>Java</code><br>
 */
public boolean step2_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_selectedStage = tools.findPage(tools.getParamValue("selectedStage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-AttachmentCategories\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-AttachmentCategories\"", "FUAInstance-NullMyStepPage");
}
boolean pz_13 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-AttachmentCategories"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-AttachmentCategories\"",pz_13);
if (!pz_13) {
// branch to block SP
nextBlock = "SP";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-AttachmentCategories\" " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "2.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_3_circum0 definition

/**
 * Step 2.4 <code>Call pzSetHistoryMemoForCaseConfig</code> [on page CaseTypeStages] <br>
 */
public boolean step2_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSetHistoryMemoForCaseConfig");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzSetHistoryMemoForCaseConfig", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzSetHistoryMemoForCaseConfig
if (myStepPage == null) {
String pz_14 = "CaseTypeStages";
myStepPage = tools.findPage(pz_14, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_14, false);
myStepPage.putString("pxObjClass", "Rule-Obj-CaseType");
}
}
// Calling Activity : pzSetHistoryMemoForCaseConfig

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "pyAttachmentCategory"
newParamsPage.putParamValue("beforePropertyRef", PropertyInfo.TYPE_TEXT, "pyAttachmentCategory");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "pyRuleMemo-DeletedAttachmentCategories\t"
newParamsPage.putParamValue("DeleteFieldValue", PropertyInfo.TYPE_TEXT, "pyRuleMemo-DeletedAttachmentCategories\t");
// Expression: "pyAttachmentCategory"
newParamsPage.putParamValue("afterPropertyRef", PropertyInfo.TYPE_TEXT, "pyAttachmentCategory");
// Expression: "CaseTypeStages.pyAttachments"
newParamsPage.putParamValue("afterPageListRef", PropertyInfo.TYPE_TEXT, "CaseTypeStages.pyAttachments");
// Expression: "pyRuleMemo-AddedDeletedAttachmentCategories\t"
newParamsPage.putParamValue("AddDeleteFieldValue", PropertyInfo.TYPE_TEXT, "pyRuleMemo-AddedDeletedAttachmentCategories\t");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "CaseTypeStagesBackup.pyAttachments"
newParamsPage.putParamValue("beforePageListRef", PropertyInfo.TYPE_TEXT, "CaseTypeStagesBackup.pyAttachments");
// Expression: "pyRuleMemo-AddedAttachmentCategories\t"
newParamsPage.putParamValue("AddFieldValue", PropertyInfo.TYPE_TEXT, "pyRuleMemo-AddedAttachmentCategories\t");

pega.invokeActivity(myStepPage, newParamsPage, "pzSetHistoryMemoForCaseConfig", "Rule-Obj-CaseType", "");
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
boolean pz__2 = true;
if (pz__2) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSetHistoryMemoForCaseConfig",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_4_circum0 definition

/**
 * History for Supporting processes.
 * <p>
 * Step 2.5 [SP] <code>Java</code><br>
 */
public boolean step2_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_selectedStage = tools.findPage(tools.getParamValue("selectedStage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-SupportingProcess\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-SupportingProcess\"", "FUAInstance-NullMyStepPage");
}
boolean pz_15 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-SupportingProcess"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-SupportingProcess\"",pz_15);
if (!pz_15) {
// branch to block GEN
nextBlock = "GEN";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-SupportingProcess\" " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "2.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_circum0 definition

/**
 * Step 2.6 <code>Call pzSetHistoryMemoForCaseConfig</code> [on page CaseTypeStages] <br>
 */
public boolean step2_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSetHistoryMemoForCaseConfig");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzSetHistoryMemoForCaseConfig", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzSetHistoryMemoForCaseConfig
if (myStepPage == null) {
String pz_16 = "CaseTypeStages";
myStepPage = tools.findPage(pz_16, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_16, false);
myStepPage.putString("pxObjClass", "Rule-Obj-CaseType");
}
}
// Calling Activity : pzSetHistoryMemoForCaseConfig

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "CaseTypeStages.pyFlowsToStart"
newParamsPage.putParamValue("afterPageListRef", PropertyInfo.TYPE_TEXT, "CaseTypeStages.pyFlowsToStart");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "pyFlowType"
newParamsPage.putParamValue("afterPropertyRef", PropertyInfo.TYPE_TEXT, "pyFlowType");
// Expression: "pyRuleMemo-AddedDeletedSupportingProcesses\t"
newParamsPage.putParamValue("AddDeleteFieldValue", PropertyInfo.TYPE_TEXT, "pyRuleMemo-AddedDeletedSupportingProcesses\t");
// Expression: "CaseTypeStagesBackup.pyFlowsToStart"
newParamsPage.putParamValue("beforePageListRef", PropertyInfo.TYPE_TEXT, "CaseTypeStagesBackup.pyFlowsToStart");
// Expression: "pyRuleMemo-DeletedSupportingProcesses\t"
newParamsPage.putParamValue("DeleteFieldValue", PropertyInfo.TYPE_TEXT, "pyRuleMemo-DeletedSupportingProcesses\t");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "pyFlowType"
newParamsPage.putParamValue("beforePropertyRef", PropertyInfo.TYPE_TEXT, "pyFlowType");
// Expression: "pyRuleMemo-AddedSupportingProcesses\t"
newParamsPage.putParamValue("AddFieldValue", PropertyInfo.TYPE_TEXT, "pyRuleMemo-AddedSupportingProcesses\t");

pega.invokeActivity(myStepPage, newParamsPage, "pzSetHistoryMemoForCaseConfig", "Rule-Obj-CaseType", "");
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
boolean pz__3 = true;
if (pz__3) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSetHistoryMemoForCaseConfig",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_6_circum0 definition

/**
 * History for General - Case Icon.
 * <p>
 * Step 2.7 [GEN] <code>Property-Set</code><br>
 */
public boolean step2_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-General\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-General\"", "FUAInstance-NullMyStepPage");
}
boolean pz_17 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-General"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-General\"",pz_17);
if (!pz_17) {
// branch to block CAL
nextBlock = "CAL";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-General\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyIcon!=CaseTypeStages.pyIcon");
try {
boolean pz_19 = (!(scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("CaseTypeStagesBackup", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyIcon!=CaseTypeStages.pyIcon",pz_19);
if (!pz_19) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("CaseTypeStagesBackup.pyIcon!=CaseTypeStages.pyIcon " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, "pyRuleMemo-UpdatedCaseIcon\t" }), "sTN255", false, true);
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
pz_CurrentStepNum = "2.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_7_circum0 definition

/**
 * History for General - Offline.
 * <p>
 * Step 2.8 <code>Property-Set</code><br>
 */
public boolean step2_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyOfflineEnabled!=CaseTypeStages.pyOfflineEnabled");
try {
boolean pz_22 = (scalarValueQuery_21.resolveToBoolean(tools, pega.findPageWithException("CaseTypeStagesBackup", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TRUEFALSE) != scalarValueQuery_21.resolveToBoolean(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TRUEFALSE));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyOfflineEnabled!=CaseTypeStages.pyOfflineEnabled",pz_22);
if (!pz_22) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("CaseTypeStagesBackup.pyOfflineEnabled!=CaseTypeStages.pyOfflineEnabled " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    value = ((scalarValueQuery_21.resolveToBoolean(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true) ? "Enabled" : "Disabled");
}
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ((("pyRuleMemo-EditedCaseTypeOfflineConfig\t" + value) + "\t") + scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
pz_CurrentStepNum = "2.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_8_circum0 definition

/**
 * History for General - GeoLocation.
 * <p>
 * Step 2.9 <code>Property-Set</code><br>
 */
public boolean step2_9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyLPGeolocationEnabled!=CaseTypeStages.pyLPGeolocationEnabled");
try {
boolean pz_25 = (!(scalarValueQuery_24.resolveToString(tools, pega.findPageWithException("CaseTypeStagesBackup", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_24.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyLPGeolocationEnabled!=CaseTypeStages.pyLPGeolocationEnabled",pz_25);
if (!pz_25) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("CaseTypeStagesBackup.pyLPGeolocationEnabled!=CaseTypeStages.pyLPGeolocationEnabled " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ((("pyRuleMemo-EditedCaseTypeGeolocationTracking\t" + scalarValueQuery_24.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT)) + "\t") + scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
boolean pz__4 = true;
if (pz__4) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_9_circum0 definition

/**
 * History for Calculations.
 * <p>
 * Step 2.10 [CAL] <code>Property-Set</code><br>
 */
public boolean step2_10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-Calculations\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-Calculations\"", "FUAInstance-NullMyStepPage");
}
boolean pz_26 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-Calculations"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-Calculations\"",pz_26);
if (!pz_26) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-Calculations\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ("pyRuleMemo-EditedCaseTypeCalculations\t" + scalarValueQuery_23.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
boolean pz__5 = true;
if (pz__5) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_10_circum0 definition

/**
 * History for Collaboration-Tags.
 * <p>
 * Step 2.11 <code>Property-Set</code><br>
 */
public boolean step2_11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyCollaborationSettings.pyEnableTags!=CaseTypeStages.pyCollaborationSettings.pyEnableTags");
try {
boolean pz_29 = (!(scalarValueQuery_27.resolveToString(tools, pega.findPageWithException("CaseTypeStagesBackup", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_27.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyCollaborationSettings.pyEnableTags!=CaseTypeStages.pyCollaborationSettings.pyEnableTags",pz_29);
if (!pz_29) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("CaseTypeStagesBackup.pyCollaborationSettings.pyEnableTags!=CaseTypeStages.pyCollaborationSettings.pyEnableTags " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    value = ((scalarValueQuery_27.resolveToBoolean(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) == true) ? "Enabled" : "Disabled");
}
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ((("pyRuleMemo-EditedCaseTypeEnableTags\t" + value) + "\t") + scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
pz_CurrentStepNum = "2.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_11_circum0 definition

/**
 * History for Collaboration-Follow.
 * <p>
 * Step 2.12 <code>Property-Set</code><br>
 */
public boolean step2_12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyCollaborationSettings.pyEnableFollow!=CaseTypeStages.pyCollaborationSettings.pyEnableFollow");
try {
boolean pz_32 = (!(scalarValueQuery_30.resolveToString(tools, pega.findPageWithException("CaseTypeStagesBackup", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_30.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyCollaborationSettings.pyEnableFollow!=CaseTypeStages.pyCollaborationSettings.pyEnableFollow",pz_32);
if (!pz_32) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("CaseTypeStagesBackup.pyCollaborationSettings.pyEnableFollow!=CaseTypeStages.pyCollaborationSettings.pyEnableFollow " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    value = ((scalarValueQuery_30.resolveToBoolean(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT) == true) ? "Enabled" : "Disabled");
}
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ((("pyRuleMemo-EditedCaseTypeEnableFollow\t" + value) + "\t") + scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
pz_CurrentStepNum = "2.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_12_circum0 definition

/**
 * History for Data propagation.
 * <p>
 * Step 2.13 <code>Property-Set</code><br>
 */
public boolean step2_13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-DataPropagation\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-DataPropagation\"", "FUAInstance-NullMyStepPage");
}
boolean pz_33 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-DataPropagation"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-DataPropagation\"",pz_33);
if (!pz_33) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-DataPropagation\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ("pyRuleMemo-EditedCaseTypeDataPropagation\t" + scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
boolean pz__6 = true;
if (pz__6) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_13_circum0 definition

/**
 * History for Email instantiation.
 * <p>
 * Step 2.14 <code>Property-Set</code><br>
 */
public boolean step2_14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-EmailInstantiation\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-EmailInstantiation\"", "FUAInstance-NullMyStepPage");
}
boolean pz_34 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-EmailInstantiation"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-EmailInstantiation\"",pz_34);
if (!pz_34) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-EmailInstantiation\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ("pyRuleMemo-EditedEmailnstantiation\t" + scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
boolean pz__7 = true;
if (pz__7) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_14_circum0 definition

/**
 * History for Goals and Deadlines.
 * <p>
 * Step 2.15 <code>Property-Set</code><br>
 */
public boolean step2_15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-GoalAndDeadline\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-GoalAndDeadline\"", "FUAInstance-NullMyStepPage");
}
boolean pz_35 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-GoalAndDeadline"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-GoalAndDeadline\"",pz_35);
if (!pz_35) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-GoalAndDeadline\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ("pyRuleMemo-EditedCaseSLA\t" + scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
boolean pz__8 = true;
if (pz__8) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_15_circum0 definition

/**
 * History for Locking.
 * <p>
 * Step 2.16 <code>Property-Set</code><br>
 */
public boolean step2_16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-Locking\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-Locking\"", "FUAInstance-NullMyStepPage");
}
boolean pz_36 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-Locking"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-Locking\"",pz_36);
if (!pz_36) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-Locking\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyLockingMode!=CaseTypeStages.pyLockingMode");
try {
boolean pz_38 = (!(scalarValueQuery_37.resolveToString(tools, pega.findPageWithException("CaseTypeStagesBackup", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_37.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "CaseTypeStagesBackup.pyLockingMode!=CaseTypeStages.pyLockingMode",pz_38);
if (!pz_38) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("CaseTypeStagesBackup.pyLockingMode!=CaseTypeStages.pyLockingMode " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ("pyRuleMemo-EditedCaseLocking\t" + scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
boolean pz__9 = true;
if (pz__9) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_16_circum0 definition

/**
 * History for WorkParties.
 * <p>
 * Step 2.17 <code>Property-Set</code><br>
 */
public boolean step2_17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-Parties\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-Parties\"", "FUAInstance-NullMyStepPage");
}
boolean pz_39 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-Parties"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-Parties\"",pz_39);
if (!pz_39) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-Parties\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ("pyRuleMemo-EditedCaseParties\t" + scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
boolean pz__10 = true;
if (pz__10) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_17_circum0 definition

/**
 * History for Duplicate Search.
 * <p>
 * Step 2.18 <code>Property-Set</code><br>
 */
public boolean step2_18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-TrackDuplicates\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxObjClass==\"Pega-Case-Settings-TrackDuplicates\"", "FUAInstance-NullMyStepPage");
}
boolean pz_40 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Case-Settings-TrackDuplicates"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Pega-Case-Settings-TrackDuplicates\"",pz_40);
if (!pz_40) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Pega-Case-Settings-TrackDuplicates\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyPendingActionMemos(<append>).pyMemo", pRef_20, tools.getPrimaryPage(), pega.<String>resolveMethodCall("getRuleMessage--(PublicAPI,String)", "getRuleMessage", null, null, new Object[] { tools, ("pyRuleMemo-EditedCaseTypeDuplicateSearch\t" + scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)) }), "sTN255", false, true);
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
boolean pz__11 = true;
if (pz__11) {
// branch to block ES
nextBlock = "ES";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.18";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_18_circum0 definition

/**
 * Exit Step.
 * <p>
 * Step 2.19 [ES] <code>Java</code><br>
 */
public boolean step2_19_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_selectedStage = tools.findPage(tools.getParamValue("selectedStage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__12 = true;
if (pz__12) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
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
pz_CurrentStepNum = "2.19";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_19_circum0 definition

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

public String value = "";

public void initializeUserLocalVariables() {
	value = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("value", (value == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : value.toString());
	return smRetVal;
}

public ClipboardPage pageParam_selectedStage;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_selectedStage = null;
}

public static final String[] pRef_28 = new String[] { "", "", "pyCollaborationSettings", "", "pyEnableTags", "" };
public static final String[] pRef_20 = new String[] { "", "", "pyPendingActionMemos", "<append>", "pyMemo", "" };
public static final String[] pRef_31 = new String[] { "", "", "pyCollaborationSettings", "", "pyEnableFollow", "" };
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyIsVisited").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pyIcon").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pyLPGeolocationEnabled").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_30 = FUAUtil.createQueryBuilder().page("pyCollaborationSettings").scalarProperty("pyEnableFollow").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().page("pyCollaborationSettings").scalarProperty("pyEnableTags").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pyOfflineEnabled").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_37 = FUAUtil.createQueryBuilder().scalarProperty("pyLockingMode").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PZADDHISTORYMEMOFORCASELP #20190712T104924.982 GMT", "Rule-Obj-CaseType pzAddHistoryMemoForCaseLP", "Pega-ProcessArchitect", "08-04-01", false, true, "", "ACTIVITY", "20190731T105248.331 GMT" ,"Rule-Obj-Activity"); }
