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
public class ra_action_pzmigrateinteractioncases_d744a07760e267e709f831bb969af836 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzMigrateInteractionCases.Work_Channel_Triage.Action");
	public ra_action_pzmigrateinteractioncases_d744a07760e267e709f831bb969af836(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT	Pega-ProcessEngine:08-08-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 1 Circum: 0" );
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
String pz_2 = "D_pzGetTriageCasesMigrationStatus";
thisStepPage = tools.findPage(pz_2, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_2, false);
thisStepPage.putString("pxObjClass", "Work-Channel-Triage");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SET"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("OneCase"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 6 Circum: 0" );
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
String pz_11 = "TempColumnPages";
thisStepPage = tools.findPage(pz_11, true);
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("BATCH"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_12 = "TempColumnPages";
thisStepPage = tools.findPage(pz_12, true);
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 10_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_14 = "TempColumnPages";
thisStepPage = tools.findPage(pz_14, true);
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("BatchDelete"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 11 Circum: 0" );
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT Step: 12 Circum: 0" );
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
	"Rule-Obj-Activity:PZMIGRATEINTERACTIONCASES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZMIGRATEINTERACTIONCASES","Rule-Obj-Activity","WORK-CHANNEL-TRIAGE",false,"","Pega-ProcessEngine","08-08-01","RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT","!PZMIGRATEINTERACTIONCASES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1733709215)
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
//	RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT:20220704T132833.744 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "3def0c8df7ae0a252ed5118869ac31ac";
	}

	public String getDefinitionAppliesToClass() {
		return "Work-Channel-Triage";
	}
public String getAspect() {
return "Action";
}
/**
 * when pyForceMigrateTriageCases is true then skip checking TriageCasesMigrationStatus.
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("pyIsMultiTenant", "Work-Channel-Triage", "Work-Channel-Triage");
if (pz__1) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzMigrateInteractionCases - Precondition", null);
pz_CheckMessage = false;
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.IsBatch");
try {
boolean pz_1 = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "IsBatch");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.IsBatch",pz_1);
if (pz_1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.IsBatch " + anyException.getMessage(), anyException);
}
boolean pz__3 = pega.invokeWhen("pyForceMigrateTriageCases", "Work-Channel-Triage", "Work-Channel-Triage");
if (!pz__3) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    bIsCaseMigrationDone = false;
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
boolean pz__5 = pega.invokeWhen("Always", "Work-Channel-Triage", "Work-Channel-Triage");
if (pz__5) {
// branch to block SET
nextBlock = "SET";
return false;
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
 * Get Migration Status.
 * <p>
 * Step 2 <code>Property-Set</code> [on page D_pzGetTriageCasesMigrationStatus] <br>
 */
public boolean step2_circum0() {
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
    bIsCaseMigrationDone = scalarValueQuery_3.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
}
{
    bIsOpenCaseMigrationDone = scalarValueQuery_4.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
}
{
    bIsColumnOptimisationDone = scalarValueQuery_5.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.bIsColumnOptimisationDone==true");
try {
boolean pz_6 = (bIsColumnOptimisationDone == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.bIsColumnOptimisationDone==true",pz_6);
if (!pz_6) {
// skip step / stop remaining iterations
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.bIsColumnOptimisationDone==true " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.bIsCaseMigrationDone==true");
try {
boolean pz_7 = (bIsCaseMigrationDone == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.bIsCaseMigrationDone==true",pz_7);
if (pz_7) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzMigrateInteractionCases - Transition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.bIsCaseMigrationDone==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * setting source and destination class names(i.e., Data base table names).
 * <p>
 * Step 3 [SET] <code>Property-Set</code><br>
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
{
    sSourceClassName = "Work-Channel-Migration";
}
{
    sDestinationClassName = "Work-Channel-Triage-Email";
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
 * Call Activity pzColumnOptimizationPreProcess.
 * <p>
 * Step 4 <code>call pzColumnOptimizationPreProcess</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzColumnOptimizationPreProcess");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call pzColumnOptimizationPreProcess", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pzColumnOptimizationPreProcess
if (myStepPage == null) {
}
// Calling Activity : pzColumnOptimizationPreProcess

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzColumnOptimizationPreProcess", "Work-Channel-Triage", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzColumnOptimizationPreProcess",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Run column population job.
 * <p>
 * Step 5 <code>call pzColumnOptimizationJob</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzColumnOptimizationJob");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call pzColumnOptimizationJob", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pzColumnOptimizationJob
if (myStepPage == null) {
}
// Calling Activity : pzColumnOptimizationJob
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzColumnOptimizationJob", "Work-Channel-Triage", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzColumnOptimizationJob",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Check for ETID.
 * <p>
 * Step 6 [OneCase] <code>Property-Set</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.bIsCaseMigrationDone==true");
try {
boolean pz_8 = (bIsCaseMigrationDone == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.bIsCaseMigrationDone==true",pz_8);
if (pz_8) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzMigrateInteractionCases - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.bIsCaseMigrationDone==true " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.IsBatch");
try {
boolean pz_9 = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "IsBatch");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.IsBatch",pz_9);
if (pz_9) {
// branch to block BATCH
nextBlock = "BATCH";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.IsBatch " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxIsBlank(Param.ETCaseID)");
try {
boolean pz_10 = (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { tools.getParamValue("ETCaseID") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxIsBlank(Param.ETCaseID)",pz_10);
if (pz_10) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzMigrateInteractionCases - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxIsBlank(Param.ETCaseID) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    sEmailTriageCaseID = tools.getParamValue("ETCaseID");
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
 * Insert one ET record into pc_work_triage from pc_work table.
 * <p>
 * Step 7 <code>Java</code> [on page TempColumnPages] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
java.util.Set<String> columnSet = new java.util.HashSet<String>();
java.util.List<com.pega.pegarules.priv.database.sqlgen.model.InsertField> listofInsertColumns 
                                       = new java.util.ArrayList<com.pega.pegarules.priv.database.sqlgen.model.InsertField>();
java.util.List<com.pega.pegarules.priv.database.sqlgen.model.ProjectionField> listofSelectedColumns 
                                       = new java.util.ArrayList<com.pega.pegarules.priv.database.sqlgen.model.ProjectionField>();

ClipboardProperty results = myStepPage.getProperty("pxResults");
java.util.Iterator it = results.iterator();
while(it.hasNext()) {
  ClipboardProperty columnValue = (ClipboardProperty)it.next();
  ClipboardPage columnPage = columnValue.getPageValue();
  String column = columnPage.getString("pyLabel");
  columnSet.add(column);  
}

java.util.Iterator setIt = columnSet.iterator();
while(setIt.hasNext()) {
  String columnName = (String)setIt.next();
  listofInsertColumns.add(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertField(columnName));
  listofSelectedColumns.add(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A",columnName,columnName));
}

//To array
com.pega.pegarules.priv.database.sqlgen.model.InsertField[] insertFieldArray = listofInsertColumns.toArray(new com.pega.pegarules.priv.database.sqlgen.model.InsertField[0]);
com.pega.pegarules.priv.database.sqlgen.model.ProjectionField[] selectFieldArray = listofSelectedColumns.toArray(new com.pega.pegarules.priv.database.sqlgen.model.ProjectionField[0]);

try {
  com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase) tools.getDatabase();
  com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .insertIntoClass(sDestinationClassName)
  .insertForColumns(insertFieldArray)
  .select(selectFieldArray)
  .from(sSourceClassName,"A")
  .where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("F1", ".pyID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, sEmailTriageCaseID, true))
	.filterLogic("F1");
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("ResultPage", queryBuilder, thread);
  
  ClipboardPage resultPage  = tools.findPage("ResultPage");
  int count = resultPage.getInteger("pxResultCount");
} 
catch(Exception e) 
{
  oLog.error("Failed to insert data in pc_work_triage");
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
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Delete one ET record which is inserted into pc_work_triage.
 * <p>
 * Step 8 <code>Java</code><br>
 */
public boolean step8_circum0() {
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
  .deleteFromClass(sSourceClassName)
	.where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter("A", ".pyID", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, sEmailTriageCaseID, true))
	.filterLogic("A");
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("ResultPage", queryBuilder, thread);
  
  ClipboardPage resultPage  = tools.findPage("ResultPage");
} 
catch(Exception e) 
{
  oLog.error("Failed to delete data from pc_work");
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
boolean pz__7 = pega.invokeWhen("Always", "Work-Channel-Triage", "Work-Channel-Triage");
if (pz__7) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzMigrateInteractionCases - Transition", null);
pz_CheckMessage = false;
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzMigrateInteractionCases - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step8_circum0 definition

/**
 * check some booleans and Insert batch records into pc_work_triage from pc_work table.
 * <p>
 * Step 9 [BATCH] <code>Java</code> [on page TempColumnPages] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.bIsOpenCaseMigrationDone");
try {
boolean pz_13 = bIsOpenCaseMigrationDone;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.bIsOpenCaseMigrationDone",pz_13);
if (pz_13) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.bIsOpenCaseMigrationDone " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
java.util.Set<String> columnSet = new java.util.HashSet<String>();
java.util.List<com.pega.pegarules.priv.database.sqlgen.model.InsertField> listofInsertColumns 
                                       = new java.util.ArrayList<com.pega.pegarules.priv.database.sqlgen.model.InsertField>();
java.util.List<com.pega.pegarules.priv.database.sqlgen.model.ProjectionField> listofSelectedColumns 
                                       = new java.util.ArrayList<com.pega.pegarules.priv.database.sqlgen.model.ProjectionField>();

ClipboardProperty results = myStepPage.getProperty("pxResults");
java.util.Iterator it = results.iterator();
while(it.hasNext()) {
  ClipboardProperty columnValue = (ClipboardProperty)it.next();
  ClipboardPage columnPage = columnValue.getPageValue();
  String column = columnPage.getString("pyLabel");
  columnSet.add(column);  
}

java.util.Iterator setIt = columnSet.iterator();
while(setIt.hasNext()) {
      String columnName = (String)setIt.next();
      listofInsertColumns.add(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertField(columnName));
      listofSelectedColumns.add(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A",columnName,columnName));
}

//To array
com.pega.pegarules.priv.database.sqlgen.model.InsertField[] insertFieldArray = 
              listofInsertColumns.toArray(new com.pega.pegarules.priv.database.sqlgen.model.InsertField[0]);
com.pega.pegarules.priv.database.sqlgen.model.ProjectionField[] selectFieldArray = 
              listofSelectedColumns.toArray(new com.pega.pegarules.priv.database.sqlgen.model.ProjectionField[0]);

try
{
  com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase)tools.getDatabase(); 
  com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .insertIntoClass(sDestinationClassName)
  .insertForColumns(insertFieldArray)
  .select(selectFieldArray)
  .from(sSourceClassName,"A")
  .where(
    com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter(
    "F1", ".pystatuswork", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.NOTLIKE, "Resolved%", true),
        com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter(
    "F2", ".pxobjclass", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, sDestinationClassName, true)
    )
  .filterLogic("F1 AND F2") 
  .setLimitSize(5000);
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("ResultPage", queryBuilder, thread);
  
  ClipboardPage resultPage  = tools.findPage("ResultPage");
  int count = resultPage.getInteger("pxResultCount");
  
} 
catch(Exception e) 
{
oLog.error("Failed to insert data in pc_work_triage");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * check for resolved cases and Insert batch records into pc_work_triage from pc_work table.
 * <p>
 * Step 10 <code>Java</code> [on page TempColumnPages] <br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.bIsOpenCaseMigrationDone &amp;&amp; Local.bIsCaseMigrationDone = false");
try {
boolean pz_15 = (bIsOpenCaseMigrationDone && (bIsCaseMigrationDone == false));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.bIsOpenCaseMigrationDone &amp;&amp; Local.bIsCaseMigrationDone = false",pz_15);
if (!pz_15) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.bIsOpenCaseMigrationDone &amp;&amp; Local.bIsCaseMigrationDone = false " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
java.util.Set<String> columnSet = new java.util.HashSet<String>();
java.util.List<com.pega.pegarules.priv.database.sqlgen.model.InsertField> listofInsertColumns 
                                       = new java.util.ArrayList<com.pega.pegarules.priv.database.sqlgen.model.InsertField>();
java.util.List<com.pega.pegarules.priv.database.sqlgen.model.ProjectionField> listofSelectedColumns 
                                       = new java.util.ArrayList<com.pega.pegarules.priv.database.sqlgen.model.ProjectionField>();

ClipboardProperty results = myStepPage.getProperty("pxResults");
java.util.Iterator it = results.iterator();
while(it.hasNext()) {
  ClipboardProperty columnValue = (ClipboardProperty)it.next();
  ClipboardPage columnPage = columnValue.getPageValue();
  String column = columnPage.getString("pyLabel");
  columnSet.add(column);  
}

java.util.Iterator setIt = columnSet.iterator();
while(setIt.hasNext()) {
  String columnName = (String)setIt.next();
  listofInsertColumns.add(com.pega.pegarules.priv.database.sqlgen.NativeSQL.insertField(columnName));
  listofSelectedColumns.add(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A",columnName,columnName));
}

//To array
com.pega.pegarules.priv.database.sqlgen.model.InsertField[] insertFieldArray = 
              listofInsertColumns.toArray(new com.pega.pegarules.priv.database.sqlgen.model.InsertField[0]);
com.pega.pegarules.priv.database.sqlgen.model.ProjectionField[] selectFieldArray = 
              listofSelectedColumns.toArray(new com.pega.pegarules.priv.database.sqlgen.model.ProjectionField[0]);

try
{
  com.pega.pegarules.priv.database.PegaDatabase db = (com.pega.pegarules.priv.database.PegaDatabase)tools.getDatabase();
  com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .insertIntoClass(sDestinationClassName)
  .insertForColumns(insertFieldArray)
  .select(selectFieldArray)
  .from(sSourceClassName,"A")
  .where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.filter(
     "F1", ".pxobjclass", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.EQ, sDestinationClassName, true)
        )
  .filterLogic("F1")
  .setLimitSize(5000);
 
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("ResultPage", queryBuilder, thread);
  
  ClipboardPage resultPage  = tools.findPage("ResultPage");
  int count = resultPage.getInteger("pxResultCount");
} 
catch(Exception e)
{
oLog.error("Failed to insert data in pc_work_triage");
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
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Delete batch records which are inserted into pc_work_triage.
 * <p>
 * Step 11 [BatchDelete] <code>Java</code><br>
 */
public boolean step11_circum0() {
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
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder subQuery = db.getNativeSQLBuilder()
  .select(com.pega.pegarules.priv.database.sqlgen.NativeSQL.field("A", "pzinskey"))
	.from(sDestinationClassName, "A");
				
com.pega.pegarules.priv.database.sqlgen.INativeSQLBuilder queryBuilder = db.getNativeSQLBuilder()
  .deleteFromClass(sSourceClassName)
	.where(com.pega.pegarules.priv.database.sqlgen.NativeSQL.subQueryFilter("F1", ".pzInsKey", com.pega.pegarules.priv.database.sqlgen.constants.OperatorType.IN, "A"))
	.addSubQuery(subQuery)
	.filterLogic("F1");
  
  PRThread thread = (PRThread)ThreadContainer.get();
  db.executeNativeSQL("ResultPage", queryBuilder, thread);
  
  ClipboardPage resultPage  = tools.findPage("ResultPage");
}
catch(Exception e) 
{
  oLog.error("Failed to delete data from pc_work");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Cleanup.
 * <p>
 * Step 12 <code>Page-Remove</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: TempColumnPages
pageRemove(tools.findPage("TempColumnPages"));
// Expression: OptimizeColumnPages
pageRemove(tools.findPage("OptimizeColumnPages"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
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

public String sEmailTriageCaseID = "";
public String sDestinationClassName = "";
public boolean bIsOpenCaseMigrationDone = false;
public boolean bIsColumnOptimisationDone = false;
public boolean bIsCaseMigrationDone = false;
public String sSourceClassName = "";

public void initializeUserLocalVariables() {
	sEmailTriageCaseID = "";
	sDestinationClassName = "";
	bIsOpenCaseMigrationDone = false;
	bIsColumnOptimisationDone = false;
	bIsCaseMigrationDone = false;
	sSourceClassName = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("sEmailTriageCaseID", (sEmailTriageCaseID == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : sEmailTriageCaseID.toString());
	smRetVal.putString("sDestinationClassName", (sDestinationClassName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : sDestinationClassName.toString());
	smRetVal.putString("bIsOpenCaseMigrationDone", Boolean.toString(bIsOpenCaseMigrationDone));
	smRetVal.putString("bIsColumnOptimisationDone", Boolean.toString(bIsColumnOptimisationDone));
	smRetVal.putString("bIsCaseMigrationDone", Boolean.toString(bIsCaseMigrationDone));
	smRetVal.putString("sSourceClassName", (sSourceClassName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : sSourceClassName.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyIsCaseMigrationDone").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyIsColumnOptimisationDone").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pyIsOpenCaseMigrationDone").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY WORK-CHANNEL-TRIAGE PZMIGRATEINTERACTIONCASES #20220704T132833.744 GMT", "Work-Channel-Triage pzMigrateInteractionCases", "Pega-ProcessEngine", "08-08-01", false, true, "", "ACTIVITY", "20220704T132833.744 GMT" ,"Rule-Obj-Activity"); }
