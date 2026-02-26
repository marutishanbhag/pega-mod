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
import com.pega.pegarules.priv.factory.ThreadLocalStringMapFactoryImpl;
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
public class ra_action_pzsetshapefromtempproperties_d37496676c3718dc5230caea2a801ad9 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzSetShapeFromTempProperties.Data_MO_Activity_Assignment.Action");
	public ra_action_pzsetshapefromtempproperties_d37496676c3718dc5230caea2a801ad9(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PM"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 8_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("RB"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("FIN"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT Step: 9 Circum: 0" );
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
	"Rule-Obj-Activity:PZSETSHAPEFROMTEMPPROPERTIES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSETSHAPEFROMTEMPPROPERTIES","Rule-Obj-Activity","DATA-MO-ACTIVITY-ASSIGNMENT",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT","!PZSETSHAPEFROMTEMPPROPERTIES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",768548292)
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
//	RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT:20180713T141003.778 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "813d0626d131afee3bc59e9c9765f14a";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-MO-Activity-Assignment";
	}
public String getAspect() {
return "Action";
}
/**
 * Set routetotype in case of DS.
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
boolean pz__1 = pega.invokeWhen("pzIsPegaExpress", "Data-MO-Activity-Assignment", "Data-MO-Activity-Assignment");
if (pz__1) {
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyRouteToType", pRef_1, myStepPage, scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
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
 * Remove previous parameters for routing from workbasket.
 * <p>
 * Step 2 <code>Property-Remove</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: AssignmentPage.pyRouterProp.pyCallParams.Workbasket
ClipboardProperty pz_4 = pega.getViaPropRef(".pyRouterProp.pyCallParams.Workbasket", pRef_3, pega.findPageWithException("AssignmentPage", "Data-MO-Activity-Assignment"), false, true);
try {if (pz_4!= null) {
pz_4.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 2.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
// Expression: AssignmentPage.pyWorkBasket
ClipboardProperty pz_6 = propertyQuery_5.resolve(tools, pega.findPageWithException("AssignmentPage", "Data-MO-Activity-Assignment"));
try {if (pz_6!= null) {
pz_6.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 2.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * When routing to "current user", clear routing pyImplemtation because setting no routing to here automatically routes to current operator.
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRouteToType==\"none\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRouteToType==\"none\"", "FUAInstance-NullMyStepPage");
}
boolean pz_8 = (scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("none"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRouteToType==\"none\"",pz_8);
if (!pz_8) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRouteToType==\"none\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyRouterProp.pyImplementation", pRef_9, myStepPage, "", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyRouteTo", pRef_10, myStepPage, "Current Operator", "stN", false, true);
}
{
    pega.setViaPropRef(".pyImplementation", pRef_11, myStepPage, "WorkList", "sTN", false, true);
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
boolean pz__3 = true;
if (pz__3) {
// branch to block FIN
nextBlock = "FIN";
return false;
} else {
// branch to block FIN
nextBlock = "FIN";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step3_circum0 definition

/**
 * When routing to "specific user", set routing to ToWorkList for that user.
 * <p>
 * Step 4 <code>Property-Set</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRouteToType==\"operator\" || .pyRouteToType==\"Operator\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRouteToType==\"operator\" || .pyRouteToType==\"Operator\"", "FUAInstance-NullMyStepPage");
}
boolean pz_12 = ((scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("operator")) || (scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Operator")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRouteToType==\"operator\" || .pyRouteToType==\"Operator\"",pz_12);
if (!pz_12) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRouteToType==\"operator\" || .pyRouteToType==\"Operator\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyDisplayRouteTo==\"REPORTINGMGR\"");
try {
boolean pz_14 = (scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("REPORTINGMGR"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyDisplayRouteTo==\"REPORTINGMGR\"",pz_14);
if (pz_14) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyDisplayRouteTo==\"REPORTINGMGR\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyDisplayRouteTo==\"USERREF\"");
try {
boolean pz_15 = (scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("USERREF"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyDisplayRouteTo==\"USERREF\"",pz_15);
if (!pz_15) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyDisplayRouteTo==\"USERREF\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRouteToUser==\"\"");
try {
boolean pz_17 = (scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRouteToUser==\"\"",pz_17);
if (pz_17) {
// branch to block PM
nextBlock = "PM";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRouteToUser==\"\" " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyRouterProp.pyImplementation", pRef_9, myStepPage, "ToWorkList", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyRouterProp.pyCallParams.Operator", pRef_18, myStepPage, ((pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, null, new Object[] { scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "." })).booleanValue() ? scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) : pega.<String>resolveMethodCall("quote--(String)", "quote", "Pega-RULES", "Default", new Object[] { scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })), "s?N", false, true);
}
{
    pega.setViaPropRef(".pyRouteTo", pRef_10, myStepPage, "Operator", "stN", false, true);
}
{
    pega.setViaPropRef(".pyOperator", pRef_19, myStepPage, scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
}
{
    pega.setViaPropRef(".pyImplementation", pRef_11, myStepPage, "WorkList", "sTN", false, true);
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
// branch to block FIN
nextBlock = "FIN";
return false;
} else {
// branch to block FIN
nextBlock = "FIN";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step4_circum0 definition

/**
 * Step 5 <code>Apply-DataTransform</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.equals(.pyRouteToType,\"use business logic\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.equals(.pyRouteToType,\"use business logic\")", "FUAInstance-NullMyStepPage");
}
boolean pz_20 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "use business logic" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.equals(.pyRouteToType,\"use business logic\")",pz_20);
if (!pz_20) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.equals(.pyRouteToType,\"use business logic\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: pzSetOrResetRoutingConfiguration
ParameterPage stepParams__1 = new ParameterPage();/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "Data-MO-Activity-Assignment";
}
StringMap params__1 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__1.putString("pxObjClass", "Rule-Obj-Model");
params__1.putString("pyClassName", modelClass);
params__1.putString("pyModelName", "pzSetOrResetRoutingConfiguration");
tools.applyModel(myStepPage, params__1, stepParams__1);
ThreadLocalStringMapFactoryImpl.getFactory().release(params__1);
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
// branch to block FIN
nextBlock = "FIN";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * When routing to "Reporting Manager", set routing to user reference property.
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
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRouteToType==\"operator\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRouteToType==\"operator\"", "FUAInstance-NullMyStepPage");
}
boolean pz_21 = (scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("operator"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRouteToType==\"operator\"",pz_21);
if (!pz_21) {
// branch to block RB
nextBlock = "RB";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRouteToType==\"operator\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyDisplayRouteTo==\"REPORTINGMGR\"");
try {
boolean pz_22 = (scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("REPORTINGMGR"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyDisplayRouteTo==\"REPORTINGMGR\"",pz_22);
if (!pz_22) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyDisplayRouteTo==\"REPORTINGMGR\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyRouterProp.pyImplementation", pRef_9, myStepPage, "ToWorkList", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyRouterProp.pyCallParams.Operator", pRef_18, myStepPage, pega.<String>resolveMethodCall("quote--(String)", "quote", "Pega-RULES", "Default", new Object[] { scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), "s?N", false, true);
}
{
    pega.setViaPropRef(".pyRouteTo", pRef_10, myStepPage, "Operator", "stN", false, true);
}
{
    pega.setViaPropRef(".pyOperator", pRef_19, myStepPage, ".pxReportsToManager", "stN", false, true);
}
{
    pega.setViaPropRef(".pyImplementation", pRef_11, myStepPage, "WorkList", "sTN", false, true);
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
// branch to block FIN
nextBlock = "FIN";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Error if no user reference field is selected.
 * <p>
 * Step 7 [PM] <code>Property-set-messages</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-set-messages");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-set-messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-set-messages
// Expression: pzNoUserReferenceFieldSelected
// Expression: .pyRouteToUser
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRouteToUser", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_24 = propertyQuery_23.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;
pz_24.addMessageWithKey("pzNoUserReferenceFieldSelected", "pyMessageLabel",keyToPass);
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
// branch to block FIN
nextBlock = "FIN";
return false;
} else {
// branch to block FIN
nextBlock = "FIN";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-set-messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step7_circum0 definition

/**
 * When routing to "role-based queue", set routing to ToWorkbasket with route to role.
 * <p>
 * Step 8 [RB] <code>Property-Set</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRouteToType==\"workbasket\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRouteToType==\"workbasket\"", "FUAInstance-NullMyStepPage");
}
boolean pz_25 = (scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("workbasket"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRouteToType==\"workbasket\"",pz_25);
if (!pz_25) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRouteToType==\"workbasket\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyRouterProp.pyImplementation", pRef_9, myStepPage, "ToWorkbasket", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyRouterProp.pyCallParams.Workbasket", pRef_3, myStepPage, scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "s?N", false, true);
}
{
    pega.setViaPropRef(".pyRouteTo", pRef_10, myStepPage, "Workbasket", "stN", false, true);
}
{
    pega.setViaPropRef(".pyWorkBasket", pRef_27, myStepPage, scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
}
{
    pega.setViaPropRef(".pyImplementation", pRef_11, myStepPage, "WorkBasket", "sTN", false, true);
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
// branch to block FIN
nextBlock = "FIN";
return false;
} else {
// branch to block FIN
nextBlock = "FIN";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step8_circum0 definition

/**
 * Not removing transient properties as this is called on context switch now.
 * <p>
 * Step 9 [FIN] <code>call pzUpdateRouting</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzUpdateRouting");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRouteToType==\"Custom\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRouteToType==\"Custom\"", "FUAInstance-NullMyStepPage");
}
boolean pz_28 = (scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Custom"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRouteToType==\"Custom\"",pz_28);
if (pz_28) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRouteToType==\"Custom\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("call pzUpdateRouting", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pzUpdateRouting
if (myStepPage == null) {
}
// Calling Activity : pzUpdateRouting

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzUpdateRouting", "Data-MO-Activity-Assignment", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzUpdateRouting",pz_AttemptedStep);
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


public void initializeUserLocalVariables() {
}


public StringMap snapshotLocalVariables() {
	return null;
}

public ClipboardPage pageParam_FlowPage;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_FlowPage = null;
}

public static final String[] pRef_10 = new String[] { "", "", "pyRouteTo", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyRouterProp", "", "pyCallParams", "", "Workbasket", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyRouterProp", "", "pyImplementation", "" };
public static final String[] pRef_27 = new String[] { "", "", "pyWorkBasket", "" };
public static final String[] pRef_18 = new String[] { "", "", "pyRouterProp", "", "pyCallParams", "", "Operator", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyOperator", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyRouteToType", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyImplementation", "" };
private static final PropertyQuery propertyQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyWorkBasket").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pyDisplayRouteTo").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pyRouteToUser").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyRouteToUser").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("pyRouteTo").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pyRouteToType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().scalarProperty("pyRouteToRole").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-MO-ACTIVITY-ASSIGNMENT PZSETSHAPEFROMTEMPPROPERTIES #20180713T141003.778 GMT", "Data-MO-Activity-Assignment pzSetShapeFromTempProperties", "Pega-ProcessArchitect", "08-01-01", false, true, "", "ACTIVITY", "20180713T141003.778 GMT" ,"Rule-Obj-Activity"); }
