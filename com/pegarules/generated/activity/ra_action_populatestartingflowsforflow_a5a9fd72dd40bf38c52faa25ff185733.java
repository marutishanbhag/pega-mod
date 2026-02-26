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
public class ra_action_populatestartingflowsforflow_a5a9fd72dd40bf38c52faa25ff185733 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.PopulateStartingFlowsForFlow.Rule_Obj_Flow.Action");
	public ra_action_populatestartingflowsforflow_a5a9fd72dd40bf38c52faa25ff185733(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-FLOW POPULATESTARTINGFLOWSFORFLOW #20180713T133038.362 GMT	Pega-ProcessEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW POPULATESTARTINGFLOWSFORFLOW #20180713T133038.362 GMT";
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
String pz_4 = "pxThread";
thisStepPage = tools.findPage(pz_4, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW POPULATESTARTINGFLOWSFORFLOW #20180713T133038.362 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_14 = pega.getViaPropRef(".pyWorkPoolsInApp.pxResults", pRef_1, pega.findPageWithException("Application", "Rule-Application"), false, true);
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
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW POPULATESTARTINGFLOWSFORFLOW #20180713T133038.362 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
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
if(nextBlock.equals("")) { 
ClipboardProperty pz_19 = pega.getViaPropRef(".pyWorkPoolsInApp.pxResults", pRef_1, pega.findPageWithException("Application", "Rule-Application"), false, true);
pageRef = pz_19;
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW POPULATESTARTINGFLOWSFORFLOW #20180713T133038.362 GMT Step: 3 Circum: 0" );
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
	"Rule-Obj-Activity:POPULATESTARTINGFLOWSFORFLOW"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("POPULATESTARTINGFLOWSFORFLOW","Rule-Obj-Activity","RULE-OBJ-FLOW",false,"","Pega-ProcessEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-FLOW POPULATESTARTINGFLOWSFORFLOW #20180713T133038.362 GMT","!POPULATESTARTINGFLOWSFORFLOW",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",363809262)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-FLOW POPULATESTARTINGFLOWSFORFLOW #20180713T133038.362 GMT:20180713T133038.362 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "91fda7b85df056b960dd5dfdba9fa801";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Flow";
	}
public String getAspect() {
return "Action";
}
/**
 * If Application.pyWorkPoolsInApp.pxResults is empty, populate it from Application rule.
 * <p>
 * Step 1 <code>Call getWorkPoolsInApp</code> [on page pxThread] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call getWorkPoolsInApp");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PropertyExists(\"Application.pyWorkPoolsInApp.pxResults\")");
try {
boolean pz_5 = (pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, null, new Object[] { "Application.pyWorkPoolsInApp.pxResults" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PropertyExists(\"Application.pyWorkPoolsInApp.pxResults\")",pz_5);
if (!pz_5) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PropertyExists(\"Application.pyWorkPoolsInApp.pxResults\") " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Application.pyWorkPoolsInApp.pxResults(1).pyRuleName = \"\"");
try {
boolean pz_8 = (scalarValueQuery_6.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Application.pyWorkPoolsInApp.pxResults(1).pyRuleName = \"\"",pz_8);
if (!pz_8) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Application.pyWorkPoolsInApp.pxResults(1).pyRuleName = \"\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(\"Composite\", pyPortal.pyDesktopType) || @(Pega-RULES:String).equals(\"Composite\", pyPortal.pyDesktopSubType)");
try {
boolean pz_11 = ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { "Composite", scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue() || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { "Composite", scalarValueQuery_10.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(\"Composite\", pyPortal.pyDesktopType) || @(Pega-RULES:String).equals(\"Composite\", pyPortal.pyDesktopSubType)",pz_11);
if (pz_11) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(\"Composite\", pyPortal.pyDesktopType) || @(Pega-RULES:String).equals(\"Composite\", pyPortal.pyDesktopSubType) " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(\"Mobile\", pyPortal.pyDesktopSubType)");
try {
boolean pz_12 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { "Mobile", scalarValueQuery_10.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(\"Mobile\", pyPortal.pyDesktopSubType)",pz_12);
if (!pz_12) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(\"Mobile\", pyPortal.pyDesktopSubType) " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call getWorkPoolsInApp", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call getWorkPoolsInApp
if (myStepPage == null) {
String pz_13 = "pxThread";
myStepPage = tools.findPage(pz_13, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_13, false);
myStepPage.putString("pxObjClass", "Code-Pega-Thread");
}
}
// Calling Activity : getWorkPoolsInApp

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "getWorkPoolsInApp", "Rule-Obj-Flow", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call getWorkPoolsInApp",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * flush cc and data-admin-startingflows.
 * <p>
 * Step 2 <code>call Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool</code> [on page Application.pyWorkPoolsInApp.pxResults] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyRegenStartingFlows==2");
try {
boolean pz_16 = (scalarValueQuery_15.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) == 2);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyRegenStartingFlows==2",pz_16);
if (!pz_16) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyRegenStartingFlows==2 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("call Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool
// Calling Activity : Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
newParamsPage.putParamValue("pyIterationType", "embedded");
newParamsPage.putParamValue("pyHowInvoked", "ForEach");
newParamsPage.putParamValue("pyIterationTarget", "Application.pyWorkPoolsInApp.pxResults");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: .pyRuleName
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRuleName", "FUAInstance-NullMyStepPage");
}
newParamsPage.putParamValue("WorkPool", PropertyInfo.TYPE_TEXT, scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
// Expression: false
String pz_18 = String.valueOf(false);
newParamsPage.putParamValue("KeepConclusionCache", PropertyInfo.TYPE_TRUEFALSE, pz_18);

pega.invokeActivity(myStepPage, newParamsPage, "PopulateStartingFlowsByWorkPool", "Rule-Obj-Flow", "Data-Admin-StartingFlows");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * flush just data-admin-startingflows.
 * <p>
 * Step 3 <code>call  Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool</code> [on page Application.pyWorkPoolsInApp.pxResults] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call  Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyRegenStartingFlows==1");
try {
boolean pz_20 = (scalarValueQuery_15.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) == 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyRegenStartingFlows==1",pz_20);
if (!pz_20) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyRegenStartingFlows==1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("call  Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call  Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool
// Calling Activity : Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
newParamsPage.putParamValue("pyIterationType", "embedded");
newParamsPage.putParamValue("pyHowInvoked", "ForEach");
newParamsPage.putParamValue("pyIterationTarget", "Application.pyWorkPoolsInApp.pxResults");
// Expression: true
String pz_21 = String.valueOf(true);
newParamsPage.putParamValue("KeepConclusionCache", PropertyInfo.TYPE_TRUEFALSE, pz_21);
// Expression: .pyRuleName
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRuleName", "FUAInstance-NullMyStepPage");
}
newParamsPage.putParamValue("WorkPool", PropertyInfo.TYPE_TEXT, scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "PopulateStartingFlowsByWorkPool", "Rule-Obj-Flow", "Data-Admin-StartingFlows");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call  Data-Admin-StartingFlows.PopulateStartingFlowsByWorkPool",pz_AttemptedStep);
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

public static final String[] pRef_1 = new String[] { "", "", "pyWorkPoolsInApp", "", "pxResults", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyWorkPoolsInApp", "", "pxResults", "1", "pyRuleName", "" };
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyDesktopType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyRegenStartingFlows").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyDesktopSubType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().page("pyWorkPoolsInApp").pageList("pxResults", 1).scalarProperty("pyRuleName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-FLOW POPULATESTARTINGFLOWSFORFLOW #20180713T133038.362 GMT", "Rule-Obj-Flow PopulateStartingFlowsForFlow", "Pega-ProcessEngine", "08-01-01", false, false, "", "TRIGGER", "20180713T133038.362 GMT" ,"Rule-Obj-Activity"); }
