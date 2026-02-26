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
public class ra_action_pzvalidatedisplayinitialization_e8c5d441c29c16d6e34f8070bf0df550 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzValidateDisplayInitialization.Rule_HTML_Harness.Action");
	public ra_action_pzvalidatedisplayinitialization_e8c5d441c29c16d6e34f8070bf0df550(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT	Pega-UIEngine:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT";
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
String pz_1 = "TempPreTransform";
thisStepPage = tools.findPage(pz_1, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_1, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Model");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("NEXT"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_12 = "TempActivity";
thisStepPage = tools.findPage(pz_12, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_12, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-Activity");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("WHENCHECK"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_20 = "TempWhen";
thisStepPage = tools.findPage(pz_20, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_20, false);
thisStepPage.putString("pxObjClass", "Rule-Obj-When");
}
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("RESET"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT Step: 7 Circum: 0" );
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
	"Rule-Obj-Activity:PZVALIDATEDISPLAYINITIALIZATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZVALIDATEDISPLAYINITIALIZATION","Rule-Obj-Activity","RULE-HTML-HARNESS",false,"","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT","!PZVALIDATEDISPLAYINITIALIZATION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1047880722)
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
//	RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT:20190416T171843.195 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e30bc15b5594110b31b1adf6f45db381";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-HTML-Harness";
	}
public String getAspect() {
return "Action";
}
/**
 * Setup pretransform page if have value set otherwise jump to next check (activity).
 * <p>
 * Step 1 <code>Property-Set</code> [on page TempPreTransform] <br>
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyActionAPI.pyPreDataTransform.pyName != \"\"");
try {
boolean pz_4 = (!(scalarValueQuery_2.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyActionAPI.pyPreDataTransform.pyName != \"\"",pz_4);
if (!pz_4) {
// branch to block NEXT
nextBlock = "NEXT";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyActionAPI.pyPreDataTransform.pyName != \"\" " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxObjClass", pRef_5, myStepPage, "Rule-Obj-Model", "sIY", false, true);
}
{
    pega.setViaPropRef(".pyModelName", pRef_6, myStepPage, scalarValueQuery_2.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, scalarValueQuery_8.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "siN", false, true);
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
 * If pretransform that was specified does not exist for use within current Harness class then display error.
 * <p>
 * Step 2 <code>Property-Set-Messages</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Utilities.pxDoesObjectExist(TempPreTransform)");
try {
boolean pz_9 = (pega.<Boolean>resolveMethodCall("pxDoesObjectExist--(ClipboardPage)", "pxDoesObjectExist", null, "Utilities", new Object[] { pega.findPage("TempPreTransform", "Rule-Obj-Model") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Utilities.pxDoesObjectExist(TempPreTransform)",pz_9);
if (pz_9) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Utilities.pxDoesObjectExist(TempPreTransform) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: Must enter a valid Data transform
// Expression: .pyActionAPI.pyPreDataTransform.pyName
if (myStepPage == null) {
throw new InvalidReferenceException(".pyActionAPI.pyPreDataTransform.pyName", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_11 = propertyQuery_10.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;
pz_11.addMessageWithKey("Must enter a valid Data transform", "pyMessageLabel",keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Setup activity page if have value set otherwise jump to next check (when).
 * <p>
 * Step 3 [NEXT] <code>Property-Set</code> [on page TempActivity] <br>
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyActionAPI.pyActivity != \"\"");
try {
boolean pz_15 = (!(scalarValueQuery_13.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyActionAPI.pyActivity != \"\"",pz_15);
if (!pz_15) {
// branch to block WHENCHECK
nextBlock = "WHENCHECK";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyActionAPI.pyActivity != \"\" " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxObjClass", pRef_5, myStepPage, "Rule-Obj-Activity", "sIY", false, true);
}
{
    pega.setViaPropRef(".pyActivityName", pRef_16, myStepPage, scalarValueQuery_13.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sIN64", false, true);
}
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, scalarValueQuery_8.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "siN", false, true);
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
 * If activity that was specified does not exist for use within current Harness class then display error.
 * <p>
 * Step 4 <code>Property-Set-Messages</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Utilities.pxDoesObjectExist(TempActivity)");
try {
boolean pz_17 = (pega.<Boolean>resolveMethodCall("pxDoesObjectExist--(ClipboardPage)", "pxDoesObjectExist", null, "Utilities", new Object[] { pega.findPage("TempActivity", "Rule-Obj-Activity") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Utilities.pxDoesObjectExist(TempActivity)",pz_17);
if (pz_17) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Utilities.pxDoesObjectExist(TempActivity) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: Must enter a valid Activity
// Expression: .pyActionAPI.pyActivity
if (myStepPage == null) {
throw new InvalidReferenceException(".pyActionAPI.pyActivity", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_19 = propertyQuery_18.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;
pz_19.addMessageWithKey("Must enter a valid Activity", "pyMessageLabel",keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Setup when page if value is not set to Always.
 * <p>
 * Step 5 [WHENCHECK] <code>Property-Set</code> [on page TempWhen] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyHarnessVisibilityOption != \"\"");
try {
boolean pz_22 = (!(scalarValueQuery_21.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyHarnessVisibilityOption != \"\"",pz_22);
if (!pz_22) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzValidateDisplayInitialization - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyHarnessVisibilityOption != \"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyHarnessVisibilityOption != \"ALWAYS\"");
try {
boolean pz_23 = (!(scalarValueQuery_21.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("ALWAYS")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyHarnessVisibilityOption != \"ALWAYS\"",pz_23);
if (!pz_23) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzValidateDisplayInitialization - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyHarnessVisibilityOption != \"ALWAYS\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyDisplayWhen != \"\"");
try {
boolean pz_25 = (!(scalarValueQuery_24.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyDisplayWhen != \"\"",pz_25);
if (!pz_25) {
// branch to block RESET
nextBlock = "RESET";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyDisplayWhen != \"\" " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxObjClass", pRef_5, myStepPage, "Rule-Obj-When", "sIY", false, true);
}
{
    pega.setViaPropRef(".pyBlockName", pRef_26, myStepPage, scalarValueQuery_24.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, scalarValueQuery_8.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "siN", false, true);
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
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Check if the property for when holds a value.
 * <p>
 * Step 6 <code>Property-Set-Messages</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Utilities.pxDoesObjectExist(TempWhen)");
try {
boolean pz_27 = (pega.<Boolean>resolveMethodCall("pxDoesObjectExist--(ClipboardPage)", "pxDoesObjectExist", null, "Utilities", new Object[] { pega.findPage("TempWhen", "Rule-Obj-When") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Utilities.pxDoesObjectExist(TempWhen)",pz_27);
if (pz_27) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzValidateDisplayInitialization - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Utilities.pxDoesObjectExist(TempWhen) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: Must enter a valid When
// Expression: .pyDisplayWhen
if (myStepPage == null) {
throw new InvalidReferenceException(".pyDisplayWhen", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_29 = propertyQuery_28.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;
pz_29.addMessageWithKey("Must enter a valid When", "pyMessageLabel",keyToPass);
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
boolean pz__1 = pega.invokeWhen("Always", "Rule-HTML-Harness", "Rule-HTML-Harness");
if (pz__1) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzValidateDisplayInitialization - Transition", null);
pz_CheckMessage = false;
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzValidateDisplayInitialization - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step6_circum0 definition

/**
 * Reset the when dropdown to Always if input field is blank.
 * <p>
 * Step 7 [RESET] <code>Property-Set</code><br>
 */
public boolean step7_circum0() {
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
    pega.setViaPropRef(".pyHarnessVisibilityOption", pRef_30, tools.getPrimaryPage(), "ALWAYS", "stN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
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


public void initializeUserLocalVariables() {
}


public StringMap snapshotLocalVariables() {
	return null;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_7 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyHarnessVisibilityOption", "" };
public static final String[] pRef_5 = new String[] { "", "", "pxObjClass", "" };
public static final String[] pRef_14 = new String[] { "", "", "pyActionAPI", "", "pyActivity", "" };
public static final String[] pRef_26 = new String[] { "", "", "pyBlockName", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyActionAPI", "", "pyPreDataTransform", "", "pyName", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyModelName", "" };
public static final String[] pRef_16 = new String[] { "", "", "pyActivityName", "" };
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().page("pyActionAPI").scalarProperty("pyActivity").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_18 = FUAUtil.createQueryBuilder().page("pyActionAPI").scalarProperty("pyActivity").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pyDisplayWhen").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_10 = FUAUtil.createQueryBuilder().page("pyActionAPI").page("pyPreDataTransform").scalarProperty("pyName").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pyHarnessVisibilityOption").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().page("pyActionAPI").page("pyPreDataTransform").scalarProperty("pyName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_28 = FUAUtil.createQueryBuilder().scalarProperty("pyDisplayWhen").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZVALIDATEDISPLAYINITIALIZATION #20190211T212754.188 GMT", "Rule-HTML-Harness pzValidateDisplayInitialization", "Pega-UIEngine", "08-03-01", false, true, "", "ACTIVITY", "20190416T171843.195 GMT" ,"Rule-Obj-Activity"); }
