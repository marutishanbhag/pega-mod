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
public class ra_action_pzvalidateapplicationstack_5f324a298bc01400f8e8436d725170a3 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzValidateApplicationStack.PegaAccel_Task_BuildApplication.Action");
	public ra_action_pzvalidateapplicationstack_5f324a298bc01400f8e8436d725170a3(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT	Pega-ProcessArchitect:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 1 Circum: 0" );
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
ClipboardProperty pz_3 = pega.findDataPage("D_ApplicationStack", true, "TopAppVersion", tools.getParamValue("builtOnAppVersion"), "TopAppName", tools.getParamValue("builtOnAppName")).getIfPresent("pxResults");
pageRef = pz_3;
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
PRStackFrame pz_StackFrame2_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_0 Circum: 0" );
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

// Code to call step 3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("AgError"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("AppError"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_circum0");
}
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("RsError"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("End"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 7 Circum: 0" );
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
	"Rule-Obj-Activity:PZVALIDATEAPPLICATIONSTACK"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZVALIDATEAPPLICATIONSTACK","Rule-Obj-Activity","PEGAACCEL-TASK-BUILDAPPLICATION",false,"","Pega-ProcessArchitect","08-06-01","RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT","!PZVALIDATEAPPLICATIONSTACK",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1539209248)
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
//	RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT:20200928T183901.641 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "de8aa47fab7c19049f2086794a64c425";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAccel-Task-BuildApplication";
	}
public String getAspect() {
return "Action";
}
/**
 * BUG-406610 set param.validateFromNewAppWiz to true to skip password checks in Validate.
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
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("validateFromNewAppWiz", PropertyInfo.TYPE_TEXT, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Get the application stack and loop through it until PegaRULES.
 * <p>
 * Step 2.0 <code>Java</code> [on page D_ApplicationStack[TopAppName:param.builtOnAppName,TopAppVersion:param.builtOnAppVersion].pxResults] <br>
 */
public boolean step2_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyProductName==\"PegaRULES\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyProductName==\"PegaRULES\"", "FUAInstance-NullMyStepPage");
}
boolean pz_5 = (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("PegaRULES"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProductName==\"PegaRULES\"",pz_5);
if (pz_5) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyProductName==\"PegaRULES\" " + anyException.getMessage(), anyException);
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
PRStackFrame pz_StackFrame2_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_1 Circum: 0" );
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
String pz_6 = "BuiltOnAppToCheck";
nestedStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame2_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_2 Circum: 0" );
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
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_3_circum0");
}
PRStackFrame pz_StackFrame2_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_3 Circum: 0" );
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
String pz_7 = "BuiltOnAppToCheck";
nestedStepPage = tools.findPage(pz_7, true);
PRStackFrame pz_StackFrame2_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_4 Circum: 0" );
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

// Code to call nested step 2_5_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
nestedStepPage = tools.getStepPage();
ClipboardProperty pz_9 = pega.findPageWithException("BuiltOnAppToCheck", "Rule-Application").getIfPresent("pyRuleSetList");
nestedPageRef = pz_9;
if (nestedPageRef != null) {
myNestedPageList = nestedPageRef.iterator();
forEachCounter = 0; // reset counter for nested loop
pz_forEachSkipClass = 0; // reset counter for nested loop
while(myNestedPageList.hasNext() && (pz_Status == true)) {
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextProperty = (ClipboardProperty) myNestedPageList.next();
//nextProperty will be used as the value of parameter values that refer to the repeating parameter with (<current>) to indicate its index value
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_0_circum0");
}
PRStackFrame pz_StackFrame2_5_0_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_5_0 Circum: 0" );
try {
pz_Status = step2_5_0_circum0(nextProperty);
} finally {
pega.popStackFrame(pz_StackFrame2_5_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the for loop for For Each PropertyList/Group
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
pz_CurrentStepNum = "2.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_0_circum0 definition

/**
 * Set current builtOn app values.
 * <p>
 * Step 2.1 <code>Property-Set</code><br>
 */
public boolean step2_1_circum0() {
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
    curAppName = scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    curAppVersion = scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
pz_CurrentStepNum = "2.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_1_circum0 definition

/**
 * Open the built on application record.
 * <p>
 * Step 2.2 <code>Obj-Open</code> [on page BuiltOnAppToCheck] <br>
 */
public boolean step2_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_11 = "BuiltOnAppToCheck";
myStepPage = tools.findPage(pz_11, true);
// Expression: 
// Expression: Rule-Application
myStepPage = tools.getThread().createPage("Rule-Application", pz_11);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyProductName", pRef_12, myStepPage, curAppName, "sIN", false, false);
}
{
    pega.setViaPropRef(".pyProductVersion", pRef_13, myStepPage, curAppVersion, "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "BuiltOnAppToCheck", "", false, false);
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
pz_CurrentStepNum = "2.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_2_circum0 definition

/**
 * Check that application's pyAccessGroupForAdministrator is valid.
 * <p>
 * Step 2.3 <code>Java</code><br>
 */
public boolean step2_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "BuiltOnAppToCheck.pyAccessGroupForAdministrator==\"\"");
try {
boolean pz_15 = (scalarValueQuery_14.resolveToString(tools, pega.findPageWithException("BuiltOnAppToCheck", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "BuiltOnAppToCheck.pyAccessGroupForAdministrator==\"\"",pz_15);
if (pz_15) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("BuiltOnAppToCheck.pyAccessGroupForAdministrator==\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@IsInPageList(BuiltOnAppToCheck.pyAccessGroupForAdministrator, \"pyAccessGroup\", D_pzAccessGroupsByApplicationWithPortal[AppName: local.curAppName, AppVersion: local.curAppVersion, PortalName: \"Developer\"].pxResults)");
try {
boolean pz_16 = (pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { scalarValueQuery_14.resolveToString(tools, pega.findPageWithException("BuiltOnAppToCheck", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "pyAccessGroup", pega.findDataPage("D_pzAccessGroupsByApplicationWithPortal", false, "AppVersion", curAppVersion, "PortalName", "Developer", "AppName", curAppName).getProperty("pxResults") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@IsInPageList(BuiltOnAppToCheck.pyAccessGroupForAdministrator, \"pyAccessGroup\", D_pzAccessGroupsByApplicationWithPortal[AppName: local.curAppName, AppVersion: local.curAppVersion, PortalName: \"Developer\"].pxResults)",pz_16);
if (pz_16) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
} else {
// branch to block AgError
nextBlock = "AgError";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@IsInPageList(BuiltOnAppToCheck.pyAccessGroupForAdministrator, \"pyAccessGroup\", D_pzAccessGroupsByApplicationWithPortal[AppName: local.curAppName, AppVersion: local.curAppVersion, PortalName: \"Developer\"].pxResults) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
// all preconditions return, the method body is unreachable
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
} // end of step2_3_circum0 definition

/**
 * Validate the built on application, exit if found errors.
 * <p>
 * Step 2.4 <code>Call Validate</code> [on page BuiltOnAppToCheck] <br>
 */
public boolean step2_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Validate");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Validate", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Validate
if (myStepPage == null) {
String pz_17 = "BuiltOnAppToCheck";
myStepPage = tools.findPage(pz_17, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_17, false);
myStepPage.putString("pxObjClass", "Rule-Application");
}
}
// Calling Activity : Validate

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: true
String pz_18 = String.valueOf(true);
newParamsPage.putParamValue("ValidateContentsOnly", PropertyInfo.TYPE_TRUEFALSE, pz_18);

pega.invokeActivity(myStepPage, newParamsPage, "Validate", "PegaAccel-Task-BuildApplication", "");
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
boolean pz__1 = pega.invokeWhen("hasMessages", "PegaAccel-Task-BuildApplication", "Rule-Application");
if (pz__1) {
// branch to block AppError
nextBlock = "AppError";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Validate",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_4_circum0 definition

/**
 * For each ruleset version defined for the current ruleset.
 * <p>
 * Step 2.5.0 <code>Java</code><br>
 */
public boolean step2_5_0_circum0(ClipboardProperty currentProperty) {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.contains(&lt;current&gt;, \"_Branch_\")");
try {
boolean pz_19 = (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", null, "String", new Object[] { currentProperty.getStringValue(), "_Branch_" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.contains(&lt;current&gt;, \"_Branch_\")",pz_19);
if (pz_19) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.contains(&lt;current&gt;, \"_Branch_\") " + anyException.getMessage(), anyException);
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

// Code to call nested step 2_5_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_1_circum0");
}
String pz_20 = "CurrRs";
nestedStepPage = tools.findPage(pz_20, true);
PRStackFrame pz_StackFrame2_5_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_5_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_5_1_circum0(currentProperty);
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_5_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_5_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_2_circum0");
}
PRStackFrame pz_StackFrame2_5_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_5_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_5_2_circum0(currentProperty);
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_5_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_5_3_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_21 = pega.findPageWithException("RuleSetVersionsListPage", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_21;
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
pz_CurrentStepNum = "2.5.3.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_3_0_circum0");
}
PRStackFrame pz_StackFrame2_5_3_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_5_3_0 Circum: 0" );
try {
pz_Status = step2_5_3_0_circum0(currentProperty);
} finally {
pega.popStackFrame(pz_StackFrame2_5_3_0_circum0, false);
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
pz_CurrentStepNum = "2.5.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_0_circum0 definition

/**
 * Open the ruleset to check whether it is ABV or RSP.
 * <p>
 * Step 2.5.1 <code>Obj-Open</code> [on page CurrRs] <br>
 */
public boolean step2_5_1_circum0(ClipboardProperty currentProperty) {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_22 = "CurrRs";
myStepPage = tools.findPage(pz_22, true);
// Expression: 
// Expression: Rule-RuleSet-Name
myStepPage = tools.getThread().createPage("Rule-RuleSet-Name", pz_22);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyRuleSetName", pRef_23, myStepPage, pega.<String>resolveMethodCall("whatComesBeforeFirst--(String,char)", "whatComesBeforeFirst", null, "String", new Object[] { currentProperty.getStringValue(), ':' }), "sTN64", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "CurrRs", "", false, false);
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
pz_CurrentStepNum = "2.5.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_1_circum0 definition

/**
 * Get the RuleSet versions for current ruleset if not using ABV.
 * <p>
 * Step 2.5.2 <code>Obj-Browse</code><br>
 */
public boolean step2_5_2_circum0(ClipboardProperty currentProperty) {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "CurrRs.pyAppBasedValidation");
try {
boolean pz_25 = scalarValueQuery_24.resolveToBoolean(tools, pega.findPageWithException("CurrRs", "Rule-RuleSet-Name"), ImmutablePropertyInfo.TYPE_TEXT);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "CurrRs.pyAppBasedValidation",pz_25);
if (pz_25) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("CurrRs.pyAppBasedValidation " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Rule-RuleSet-Version
// Expression: 500
String pz_26 = Integer.toString(500);
ClipboardPage browsePage = null;
// Expression: RuleSetVersionsListPage
browsePage = tools.findPage("RuleSetVersionsListPage", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "RuleSetVersionsListPage");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Rule-RuleSet-Version");
browsePage.putString("pyMaxRecords", pz_26);

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
// Expression: CurrRs.pyRuleSetName

//Code for Label : 
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyRuleSetName");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", scalarValueQuery_29.resolveToString(tools, pega.findPageWithException("CurrRs", "Rule-RuleSet-Name"), ImmutablePropertyInfo.TYPE_TEXT));
paramPage.putString("pyConditionValue1String", scalarValueQuery_29.resolveToString(tools, pega.findPageWithException("CurrRs", "Rule-RuleSet-Name"), ImmutablePropertyInfo.TYPE_TEXT));
contentPage.getProperty("pyParameters").add(paramPage);
selectPage.putString("pyField", "pzPVStream");
contentPage.getProperty("pySelectFields").add(selectPage);
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
pz_CurrentStepNum = "2.5.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_2_circum0 definition

/**
 * For each ruleset version..
 * <p>
 * Step 2.5.3.0 <code>Java</code> [on page RuleSetVersionsListPage.pxResults] <br>
 */
public boolean step2_5_3_0_circum0(ClipboardProperty currentProperty) {
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

// Code to call nested step 2_5_3_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5.3.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_3_1_circum0");
}
String pz_30 = "CurrRsv";
nestedStepPage = tools.findPage(pz_30, true);
PRStackFrame pz_StackFrame2_5_3_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_5_3_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_5_3_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_5_3_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_5_3_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5.3.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_3_2_circum0");
}
String pz_31 = "CurrRsv";
nestedStepPage = tools.findPage(pz_31, true);
PRStackFrame pz_StackFrame2_5_3_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT Step: 2_5_3_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_5_3_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_5_3_2_circum0, false);
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
pz_CurrentStepNum = "2.5.3.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_3_0_circum0 definition

/**
 * Open the version.
 * <p>
 * Step 2.5.3.1 <code>Obj-Open</code> [on page CurrRsv] <br>
 */
public boolean step2_5_3_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_32 = "CurrRsv";
myStepPage = tools.findPage(pz_32, true);
// Expression: 
// Expression: Rule-RuleSet-Version
myStepPage = tools.getThread().createPage("Rule-RuleSet-Version", pz_32);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyRuleSetName", pRef_23, myStepPage, scalarValueQuery_33.resolveToString(tools, pega.findPageWithException("RuleSetVersionsListPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), "stN64", false, false);
}
{
    pega.setViaPropRef(".pyRuleSetVersionID", pRef_34, myStepPage, scalarValueQuery_35.resolveToString(tools, pega.findPageWithException("RuleSetVersionsListPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "CurrRsv", "", false, false);
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
pz_CurrentStepNum = "2.5.3.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_3_1_circum0 definition

/**
 * Validate the version.
 * <p>
 * Step 2.5.3.2 <code>Call Validate</code> [on page CurrRsv] <br>
 */
public boolean step2_5_3_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Validate");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Validate", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Validate
if (myStepPage == null) {
String pz_36 = "CurrRsv";
myStepPage = tools.findPage(pz_36, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_36, false);
myStepPage.putString("pxObjClass", "Rule-RuleSet-Version");
}
}
// Calling Activity : Validate
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "Validate", "PegaAccel-Task-BuildApplication", "");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@hasMessages(CurrRsv)");
try {
boolean pz_37 = (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", null, null, new Object[] { pega.findPage("CurrRsv", "Rule-RuleSet-Version") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@hasMessages(CurrRsv)",pz_37);
if (pz_37) {
// branch to block RsError
nextBlock = "RsError";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@hasMessages(CurrRsv) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.5.3.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Validate",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_3_2_circum0 definition

/**
 * No errors were found, just go to End.
 * <p>
 * Step 3 <code>Java</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__3 = true;
if (pz__3) {
// branch to block End
nextBlock = "End";
pega.activityStepSkipped("Jump To Step");
return false;
} else {
// branch to block End
nextBlock = "End";
pega.activityStepSkipped("Jump To Step");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
// all preconditions return, the method body is unreachable
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step3_circum0 definition

/**
 * Set error for invalid access group.
 * <p>
 * Step 4 [AgError] <code>Property-Set-Messages</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzInvalidAccessGroupForAdministrator + "\t" + BuiltOnAppToCheck.pyLabel + "\t" + BuiltOnAppToCheck.pyProductName + "\t" + BuiltOnAppToCheck.pyProductVersion + "\t" + BuiltOnAppToCheck.pyAccessGroupForAdministrator
// Expression: .pySelectedApplicationTemplateLabel
if (myStepPage == null) {
throw new InvalidReferenceException(".pySelectedApplicationTemplateLabel", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_40 = propertyQuery_39.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;
pz_40.addMessageWithKey((((((((("pzInvalidAccessGroupForAdministrator" + "\t") + scalarValueQuery_38.resolveToString(tools, pega.findPageWithException("BuiltOnAppToCheck", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)) + "\t") + scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("BuiltOnAppToCheck", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)) + "\t") + scalarValueQuery_10.resolveToString(tools, pega.findPageWithException("BuiltOnAppToCheck", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)) + "\t") + scalarValueQuery_14.resolveToString(tools, pega.findPageWithException("BuiltOnAppToCheck", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)), "pyMessageLabel",keyToPass);
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
// branch to block End
nextBlock = "End";
return false;
} else {
// branch to block End
nextBlock = "End";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step4_circum0 definition

/**
 * Set error for application validation failed.
 * <p>
 * Step 5 [AppError] <code>Property-Set-Messages</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzDCOVerifyFWAppSave + "\t " + BuiltOnAppToCheck.pyLabel + " (" + local.curAppName + ":" + local.curAppVersion +")"
// Expression: .pySelectedApplicationTemplateLabel
if (myStepPage == null) {
throw new InvalidReferenceException(".pySelectedApplicationTemplateLabel", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_41 = propertyQuery_39.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = ((((((("pzDCOVerifyFWAppSave" + "\t ") + scalarValueQuery_38.resolveToString(tools, pega.findPageWithException("BuiltOnAppToCheck", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)) + " (") + curAppName) + ":") + curAppVersion) + ")");
pz_41.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
// branch to block End
nextBlock = "End";
return false;
} else {
// branch to block End
nextBlock = "End";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step5_circum0 definition

/**
 * Set error for ruleset pre-reqs.
 * <p>
 * Step 6 [RsError] <code>Property-Set-Messages</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzDCOVerifyFWAppSave + "\t" + CurrRs.pyLabel + " (" + CurrRs.pyRuleSetName + ":" + CurrRsv.pyRuleSetVersionID + ") in application " + BuiltOnAppToCheck.pyLabel + " (" + local.curAppName + ":" + local.curAppVersion +")"
// Expression: .pySelectedApplicationTemplateLabel
if (myStepPage == null) {
throw new InvalidReferenceException(".pySelectedApplicationTemplateLabel", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_43 = propertyQuery_39.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = ((((((((((((("pzDCOVerifyFWAppSave" + "\t") + scalarValueQuery_38.resolveToString(tools, pega.findPageWithException("CurrRs", "Rule-RuleSet-Name"), ImmutablePropertyInfo.TYPE_TEXT)) + " (") + scalarValueQuery_29.resolveToString(tools, pega.findPageWithException("CurrRs", "Rule-RuleSet-Name"), ImmutablePropertyInfo.TYPE_TEXT)) + ":") + scalarValueQuery_42.resolveToString(tools, pega.findPageWithException("CurrRsv", "Rule-RuleSet-Version"), ImmutablePropertyInfo.TYPE_TEXT)) + ") in application ") + scalarValueQuery_38.resolveToString(tools, pega.findPageWithException("BuiltOnAppToCheck", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)) + " (") + curAppName) + ":") + curAppVersion) + ")");
pz_43.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Cleanup temporary pages.
 * <p>
 * Step 7 [End] <code>Page-Remove</code><br>
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
// Expression: BuiltOnAppToCheck
pageRemove(tools.findPage("BuiltOnAppToCheck"));
// Expression: CurrRs
pageRemove(tools.findPage("CurrRs"));
// Expression: CurrRsv
pageRemove(tools.findPage("CurrRsv"));
// Expression: RuleSetVersionsListPage
pageRemove(tools.findPage("RuleSetVersionsListPage"));
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

public String curAppName = "";
public String curAppVersion = "";

public void initializeUserLocalVariables() {
	curAppName = "";
	curAppVersion = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("curAppName", (curAppName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : curAppName.toString());
	smRetVal.putString("curAppVersion", (curAppVersion == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : curAppVersion.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_34 = new String[] { "", "", "pyRuleSetVersionID", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyProductVersion", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyProductName", "" };
public static final String[] pRef_23 = new String[] { "", "", "pyRuleSetName", "" };
private static final PropertyQuery propertyQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSetName").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_38 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSetName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pyAppBasedValidation").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyRuleSetVersionID").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_39 = FUAUtil.createQueryBuilder().scalarProperty("pySelectedApplicationTemplateLabel").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_33 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyRuleSetName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_42 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSetVersionID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyProductVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyAccessGroupForAdministrator").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEAPPLICATIONSTACK #20200928T183901.641 GMT", "PegaAccel-Task-BuildApplication pzValidateApplicationStack", "Pega-ProcessArchitect", "08-06-01", false, true, "", "ACTIVITY", "20200928T183901.641 GMT" ,"Rule-Obj-Activity"); }
