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
public class ra_action_pzevaluaterulesetforabvguardrail_72c6f3a80ce6d30cc36403b6e5f97954 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzEvaluateRuleSetForABVGuardrail.Rule_RuleSet_Name.Action");
	public ra_action_pzevaluaterulesetforabvguardrail_72c6f3a80ce6d30cc36403b6e5f97954(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-RULESET-NAME PZEVALUATERULESETFORABVGUARDRAIL #20230618T001801.017 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-RULESET-NAME PZEVALUATERULESETFORABVGUARDRAIL #20230618T001801.017 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-RULESET-NAME PZEVALUATERULESETFORABVGUARDRAIL #20230618T001801.017 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-RULESET-NAME PZEVALUATERULESETFORABVGUARDRAIL #20230618T001801.017 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-RULESET-NAME PZEVALUATERULESETFORABVGUARDRAIL #20230618T001801.017 GMT Step: 3 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
thisStepPage = tools.findPage(tools.getParamValue("PageToAddGRV"), true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-RULESET-NAME PZEVALUATERULESETFORABVGUARDRAIL #20230618T001801.017 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-RULESET-NAME PZEVALUATERULESETFORABVGUARDRAIL #20230618T001801.017 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
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
	"Rule-Obj-Activity:PZEVALUATERULESETFORABVGUARDRAIL"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZEVALUATERULESETFORABVGUARDRAIL","Rule-Obj-Activity","RULE-RULESET-NAME",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-ACTIVITY RULE-RULESET-NAME PZEVALUATERULESETFORABVGUARDRAIL #20230618T001801.017 GMT","!PZEVALUATERULESETFORABVGUARDRAIL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1943936672)
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
//	RULE-OBJ-ACTIVITY RULE-RULESET-NAME PZEVALUATERULESETFORABVGUARDRAIL #20230618T001801.017 GMT:20230618T001801.017 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "6eaee6f64ec4832cf55b9e95710df590";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-RuleSet-Name";
	}
public String getAspect() {
return "Action";
}
/**
 * Set up locals.
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
    RuleSetName = tools.getParamValue("RuleSetName");
}
{
    CurrentApplication = tools.getParamValue("CurrentApplication");
}
{
    Mode = tools.getParamValue("Mode");
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
 * if ABV and not branch keep going else continue interation.
 * <p>
 * Step 2 <code>Java</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_PageToAddGRV = tools.findPage(tools.getParamValue("PageToAddGRV"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-WB:RuleManagement).pyIsApplicationBasedValidationAndNotBranch(Local.RuleSetName)");
try {
boolean pz_1 = (pega.<Boolean>resolveMethodCall("pyIsApplicationBasedValidationAndNotBranch--(String)", "pyIsApplicationBasedValidationAndNotBranch", "Pega-WB", "RuleManagement", new Object[] { RuleSetName })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-WB:RuleManagement).pyIsApplicationBasedValidationAndNotBranch(Local.RuleSetName)",pz_1);
if (pz_1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzEvaluateRuleSetForABVGuardrail - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-WB:RuleManagement).pyIsApplicationBasedValidationAndNotBranch(Local.RuleSetName) " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step2_circum0 definition

/**
 * AppListDistinct with list of apps.
 * <p>
 * Step 3 <code>call Rule-RuleSet-Name.pzGetListOfAppsThatReferenceRuleset</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call Rule-RuleSet-Name.pzGetListOfAppsThatReferenceRuleset");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call Rule-RuleSet-Name.pzGetListOfAppsThatReferenceRuleset", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call Rule-RuleSet-Name.pzGetListOfAppsThatReferenceRuleset
if (myStepPage == null) {
}
// Calling Activity : Rule-RuleSet-Name.pzGetListOfAppsThatReferenceRuleset

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: Local.RuleSetName
newParamsPage.putParamValue("RuleSetName", PropertyInfo.TYPE_TEXT, RuleSetName);

pega.invokeActivity(myStepPage, newParamsPage, "pzGetListOfAppsThatReferenceRuleset", "Rule-RuleSet-Name", "Rule-RuleSet-Name");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call Rule-RuleSet-Name.pzGetListOfAppsThatReferenceRuleset",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * if List of apps size > 1 or =1 and current app is not in the list then add warning1.
 * <p>
 * Step 4 <code>java</code> [on page PageToAddGRV] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_PageToAddGRV = tools.findPage(tools.getParamValue("PageToAddGRV"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "AppListDistinct.pxResultCount&gt;1");
try {
boolean pz_3 = (scalarValueQuery_2.resolveToInt(tools, pega.findPageWithException("AppListDistinct", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER) > 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "AppListDistinct.pxResultCount&gt;1",pz_3);
if (pz_3) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("AppListDistinct.pxResultCount&gt;1 " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.CurrentApplication != \"\"");
try {
boolean pz_4 = (!(CurrentApplication.equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.CurrentApplication != \"\"",pz_4);
if (!pz_4) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.CurrentApplication != \"\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "AppListDistinct.pxResultCount==1");
try {
boolean pz_5 = (scalarValueQuery_2.resolveToInt(tools, pega.findPageWithException("AppListDistinct", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER) == 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "AppListDistinct.pxResultCount==1",pz_5);
if (!pz_5) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("AppListDistinct.pxResultCount==1 " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxIsInPageListIgnoreCase(Local.CurrentApplication,\".pxPages(app).pyProductName\",AppListDistinct.pxResults)");
try {
boolean pz_6 = (pega.<Boolean>resolveMethodCall("pxIsInPageListIgnoreCase--(String,String,ClipboardProperty)", "pxIsInPageListIgnoreCase", null, null, new Object[] { CurrentApplication, ".pxPages(app).pyProductName", pega.findPageWithException("AppListDistinct", "Code-Pega-List").getProperty("pxResults") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxIsInPageListIgnoreCase(Local.CurrentApplication,\".pxPages(app).pyProductName\",AppListDistinct.pxResults)",pz_6);
if (pz_6) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxIsInPageListIgnoreCase(Local.CurrentApplication,\".pxPages(app).pyProductName\",AppListDistinct.pxResults) " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
ClipboardProperty AppList = tools.findPage("AppListDistinct").getProperty("pxResults");
HashSet hs = new HashSet(); // Selecting distinct list of Applications (to ignore Application Versions)
	for(int index = 1; index <= AppList.size(); index++){
		String AppName = AppList.getPageValue(index).getString(".pxPages(app).pyProductName");
		hs.add(AppName);	
	}

//CurrentApplication
if (! "".equals(CurrentApplication) ) {
  hs.add(CurrentApplication);
}

NumberOfApps = hs.size();
OtherApps = hs.toString();

HashStringMap params = new HashStringMap();
params.putString("RuleSetName", RuleSetName);
params.putString("ListOfApplications", OtherApps);
params.putString("Mode", Mode);
pega_wb_default.pxAddGuardrailMessage(myStepPage.getProperty(".pxObjClass"), "pyABVRulesetInManyApplications", params);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Clean up AppListDistinct.
 * <p>
 * Step 5 <code>Page-Remove</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: AppListDistinct
pageRemove(tools.findPage("AppListDistinct"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

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

public String CurrentApplication = "";
public int NumberOfApps = 0;
public String Mode = "";
public String RuleSetName = "";
public String OtherApps = "";

public void initializeUserLocalVariables() {
	CurrentApplication = "";
	NumberOfApps = 0;
	Mode = "";
	RuleSetName = "";
	OtherApps = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("CurrentApplication", (CurrentApplication == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : CurrentApplication.toString());
	smRetVal.putString("NumberOfApps", Integer.toString(NumberOfApps));
	smRetVal.putString("Mode", (Mode == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : Mode.toString());
	smRetVal.putString("RuleSetName", (RuleSetName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : RuleSetName.toString());
	smRetVal.putString("OtherApps", (OtherApps == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : OtherApps.toString());
	return smRetVal;
}

public ClipboardPage pageParam_PageToAddGRV;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_PageToAddGRV = null;
}

private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("pxResultCount").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-RULESET-NAME PZEVALUATERULESETFORABVGUARDRAIL #20230618T001801.017 GMT", "Rule-RuleSet-Name pzEvaluateRuleSetForABVGuardrail", "Pega-ProcessArchitect", "08-23-01", false, true, "", "ACTIVITY", "20230618T001801.017 GMT" ,"Rule-Obj-Activity"); }
