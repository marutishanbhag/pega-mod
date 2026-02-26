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
public class ra_action_pzsaveprocessdata_759999535f34b46295738485baaaac3e extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzSaveProcessData.Embed_StageProcess.Action");
	public ra_action_pzsaveprocessdata_759999535f34b46295738485baaaac3e(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT";
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
if (tools.getPrimaryPage() == null) {
thisStepPage = null;
} else { 
thisStepPage = tools.getPrimaryPage().getPage(".pyFlowPage");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT Step: 1 Circum: 0" );
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
if (tools.getPrimaryPage() == null) {
thisStepPage = null;
} else { 
thisStepPage = tools.getPrimaryPage().getPage(".pyFlowPage");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT Step: 2 Circum: 0" );
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
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pyFlowPage.pyModelProcess.pyShapes", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_13 = pega.getViaPropRef(".pyFlowPage.pyModelProcess.pyShapes", pRef_4, pzPrimPage, false, true);
pageRef = pz_13;
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
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT Step: 3 Circum: 0" );
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

// Code to call step 4_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
ClipboardProperty pz_17 = pega.getViaPropRef(".pyFlowPage.pyModelProcess.pyConnectors", pRef_6, pzPrimPage, false, true);
pageRef = pz_17;
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
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_circum0");
}
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pyFlowPage.pyModelProcess.pyShapes", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_21 = pega.getViaPropRef(".pyFlowPage.pyModelProcess.pyShapes", pRef_4, pzPrimPage, false, true);
pageRef = pz_21;
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
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 8_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_25 = pega.getViaPropRef(".pyFlowPage.pyModelProcess.pyShapes", pRef_4, tools.getPrimaryPage(), false, true);
pageRef = pz_25;
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
pz_CurrentStepNum = "8.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_0_circum0");
}
PRStackFrame pz_StackFrame8_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT Step: 8_0 Circum: 0" );
try {
pz_Status = step8_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_0_circum0, false);
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
	"Rule-Obj-Activity:PZSAVEPROCESSDATA"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSAVEPROCESSDATA","Rule-Obj-Activity","EMBED-STAGEPROCESS",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT","!PZSAVEPROCESSDATA",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1603006740)
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
//	RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT:20230618T001809.706 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "9a207788de547b7169c174899ef8db99";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-StageProcess";
	}
public String getAspect() {
return "Action";
}
/**
 * Get the flow key.
 * <p>
 * Step 1 <code>Property-Set</code> [on page .pyFlowPage] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("FlowKey", PropertyInfo.TYPE_TEXT, scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
 * BUG-483385: Set default rule set as case type RS for embedded flow rules.
 * <p>
 * Step 2 <code>Apply-DataTransform</code> [on page .pyFlowPage] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: pzSetCaseTypeReferencesRS
ParameterPage stepParams__1 = new ParameterPage();/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "Embed-StageProcess";
}
StringMap params__1 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__1.putString("pxObjClass", "Rule-Obj-Model");
params__1.putString("pyClassName", modelClass);
params__1.putString("pyModelName", "pzSetCaseTypeReferencesRS");
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
} finally {
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Do spec related actions, depend on pySpecPage to create/update spec.
 * <p>
 * Step 3 <code>Call pzProcessSpecification</code> [on page .pyFlowPage.pyModelProcess.pyShapes] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzProcessSpecification");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pySpecPage.pyIsDirty==\"true\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pySpecPage.pyIsDirty==\"true\"", "FUAInstance-NullMyStepPage");
}
boolean pz_16 = (scalarValueQuery_14.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pySpecPage.pyIsDirty==\"true\"",pz_16);
if (!pz_16) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pySpecPage.pyIsDirty==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzProcessSpecification", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzProcessSpecification
// Calling Activity : pzProcessSpecification

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
newParamsPage.putParamValue("pyIterationType", "embedded");
newParamsPage.putParamValue("pyHowInvoked", "ForEach");
newParamsPage.putParamValue("pyIterationTarget", ".pyFlowPage.pyModelProcess.pyShapes");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: Param.FlowKey
newParamsPage.putParamValue("FlowKey", PropertyInfo.TYPE_TEXT, tools.getParamValue("FlowKey"));
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzProcessSpecification", "Embed-StageProcess", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzProcessSpecification",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Save the specifications linked to connectors.
 * <p>
 * Step 4 <code>Call pzProcessSpecification</code> [on page .pyFlowPage.pyModelProcess.pyConnectors] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzProcessSpecification");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFromClass==\"Data-MO-Activity-Assignment\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyFromClass==\"Data-MO-Activity-Assignment\"", "FUAInstance-NullMyStepPage");
}
boolean pz_19 = (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Data-MO-Activity-Assignment"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFromClass==\"Data-MO-Activity-Assignment\"",pz_19);
if (!pz_19) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFromClass==\"Data-MO-Activity-Assignment\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pySpecPage.pyIsDirty==\"true\"");
try {
boolean pz_20 = (scalarValueQuery_14.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pySpecPage.pyIsDirty==\"true\"",pz_20);
if (!pz_20) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pySpecPage.pyIsDirty==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzProcessSpecification", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzProcessSpecification
// Calling Activity : pzProcessSpecification

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
newParamsPage.putParamValue("pyIterationType", "embedded");
newParamsPage.putParamValue("pyHowInvoked", "ForEach");
newParamsPage.putParamValue("pyIterationTarget", ".pyFlowPage.pyModelProcess.pyConnectors");
// Expression: Param.FlowKey
newParamsPage.putParamValue("FlowKey", PropertyInfo.TYPE_TEXT, tools.getParamValue("FlowKey"));
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzProcessSpecification", "Embed-StageProcess", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzProcessSpecification",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Call activity to save all dirty flows modified from CD.
 * <p>
 * Step 5 <code>call pzSaveAllDirtyFlows</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzSaveAllDirtyFlows");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call pzSaveAllDirtyFlows", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pzSaveAllDirtyFlows
if (myStepPage == null) {
}
// Calling Activity : pzSaveAllDirtyFlows

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzSaveAllDirtyFlows", "Embed-StageProcess", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzSaveAllDirtyFlows",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Save referenced process SLA rule.
 * <p>
 * Step 6 <code>Call pzSaveProcessSLAData</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSaveProcessSLAData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzSaveProcessSLAData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzSaveProcessSLAData
if (myStepPage == null) {
}
// Calling Activity : pzSaveProcessSLAData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzSaveProcessSLAData", "Embed-StageProcess", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSaveProcessSLAData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Populate the spec links for the shape which is active.
 * <p>
 * Step 7 <code>Call pzPopulateSpecLinks</code> [on page .pyFlowPage.pyModelProcess.pyShapes] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzPopulateSpecLinks");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "CaseTypeStages.pySelectedShape==.pyMOId");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("CaseTypeStages.pySelectedShape==.pyMOId", "FUAInstance-NullMyStepPage");
}
boolean pz_24 = (scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "CaseTypeStages.pySelectedShape==.pyMOId",pz_24);
if (!pz_24) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("CaseTypeStages.pySelectedShape==.pyMOId " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzPopulateSpecLinks", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzPopulateSpecLinks
// Calling Activity : pzPopulateSpecLinks
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzPopulateSpecLinks", "Embed-StageProcess", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzPopulateSpecLinks",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Step 8.0 <code>Java</code> [on page Primary.pyFlowPage.pyModelProcess.pyShapes] <br>
 */
public boolean step8_0_circum0() {
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

// Code to call nested step 8_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_1_circum0");
}
PRStackFrame pz_StackFrame8_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT Step: 8_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step8_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame8_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 8_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_2_circum0");
}
PRStackFrame pz_StackFrame8_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT Step: 8_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step8_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame8_2_circum0, false);
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
pz_CurrentStepNum = "8.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_0_circum0 definition

/**
 * Step 8.1 <code>Property-Set</code><br>
 */
public boolean step8_1_circum0() {
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
    tools.putParamValue("pyActionName", PropertyInfo.TYPE_TEXT, ((scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Data-MO-Activity-Assignment-WorkAction")) ? pega.<String>resolveMethodCall("getPropertyValue--(ClipboardPage,String)", "getPropertyValue", null, null, new Object[] { myStepPage, "pyFlowAction" }) : pega.<String>resolveMethodCall("getPropertyValue--(ClipboardPage,String)", "getPropertyValue", null, null, new Object[] { myStepPage, "pyOutcomes(1).pyExpression" })));
}
{
    tools.putParamValue("pyClassName", PropertyInfo.TYPE_TEXT, scalarValueQuery_27.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT));
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
pz_CurrentStepNum = "8.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_1_circum0 definition

/**
 * Step 8.2 <code>Call pzSaveFlowAction</code><br>
 */
public boolean step8_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSaveFlowAction");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pzCheckIfDataPageExistsWithoutLoading(\"D_pzSavableFlowAction\")");
try {
boolean pz_28 = (pega.<Boolean>resolveMethodCall("pzCheckIfDataPageExistsWithoutLoading--(String)", "pzCheckIfDataPageExistsWithoutLoading", null, null, new Object[] { "D_pzSavableFlowAction" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pzCheckIfDataPageExistsWithoutLoading(\"D_pzSavableFlowAction\")",pz_28);
if (!pz_28) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pzCheckIfDataPageExistsWithoutLoading(\"D_pzSavableFlowAction\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzSaveFlowAction", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzSaveFlowAction
if (myStepPage == null) {
}
// Calling Activity : pzSaveFlowAction

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzSaveFlowAction", "Embed-StageProcess", "");
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
pz_CurrentStepNum = "8.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSaveFlowAction",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_2_circum0 definition

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

public static final String[] pRef_6 = new String[] { "", "", "pyFlowPage", "", "pyModelProcess", "", "pyConnectors", "" };
public static final String[] pRef_15 = new String[] { "", "", "pySpecPage", "", "pyIsDirty", "" };
public static final String[] pRef_4 = new String[] { "", "", "pyFlowPage", "", "pyModelProcess", "", "pyShapes", "" };
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pyMOId").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().page("pyFlowPage").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pySelectedShape").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().page("pySpecPage").scalarProperty("pyIsDirty").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pyFromClass").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY EMBED-STAGEPROCESS PZSAVEPROCESSDATA #20230618T001809.706 GMT", "Embed-StageProcess pzSaveProcessData", "Pega-ProcessArchitect", "08-23-01", false, true, "", "ACTIVITY", "20230618T001809.706 GMT" ,"Rule-Obj-Activity"); }
