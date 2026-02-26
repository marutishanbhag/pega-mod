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
public class ra_action_pztrackchangesforflow_680f9041240a5ddfc7175fa38e93be6e extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzTrackChangesForFlow.Rule_Obj_Flow.Action");
	public ra_action_pztrackchangesforflow_680f9041240a5ddfc7175fa38e93be6e(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT	Pega-ProcessEngine:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT Step: 1 Circum: 0" );
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
String pz_3 = "ChangeTrackModel";
thisStepPage = tools.findPage(pz_3, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PV"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_8 = "pyOriginalRecord";
thisStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("J"))) {
nextBlock = "";
ClipboardProperty pz_14 = pega.findPageWithException("ChangeTrackModel", "Rule-Obj-Model").getIfPresent("pyProperties");
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
if (pz_Status == true && (nextBlock.equals("") || nextBlock.equals("J"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_26 = "ChangeTrackModel";
thisStepPage = tools.findPage(pz_26, true);
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT Step: 9 Circum: 0" );
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
	"Rule-Obj-Activity:PZTRACKCHANGESFORFLOW"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZTRACKCHANGESFORFLOW","Rule-Obj-Activity","RULE-OBJ-FLOW",false,"","Pega-ProcessEngine","08-07-01","RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT","!PZTRACKCHANGESFORFLOW",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-141399930)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT:20211027T113315.162 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "83b0aa35d48ca5ea1b93b26c2f2673f8";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Flow";
	}
public String getAspect() {
return "Action";
}
/**
 * default pyRegenStartingFlows to 3 (nothing).
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyRegenStartingFlows", pRef_2, myStepPage, 3, "sNN", false, true);
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
 * Open Model with properties to track.
 * <p>
 * Step 2 <code>Obj-Open</code> [on page ChangeTrackModel] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_4 = "ChangeTrackModel";
myStepPage = tools.findPage(pz_4, true);
// Expression: 
// Expression: Rule-Obj-Model
myStepPage = tools.getThread().createPage("Rule-Obj-Model", pz_4);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyClassName", pRef_5, myStepPage, scalarValueQuery_6.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "siN", false, false);
}
{
    pega.setViaPropRef(".pyModelName", pRef_7, myStepPage, "pyTrackSecurityChanges", "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "ChangeTrackModel", "", false, false);
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__1 = pega.invokeWhen("StepStatusFail", "Rule-Obj-Flow", "Rule-Obj-Model");
if (!pz__1) {
// branch to block PV
nextBlock = "PV";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * If failed, clear status.
 * <p>
 * Step 3 <code>Activity-Clear-Status</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Activity-Clear-Status", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Activity-Clear-Status
tools.getActivityStatus().backoutWorst();
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
// branch to block PR
nextBlock = "PR";
return false;
} else {
// branch to block PR
nextBlock = "PR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step3_circum0 definition

/**
 * handle rule check in.
 * <p>
 * Step 4 [PV] <code>Page-Copy</code> [on page pyOriginalRecord] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageExists(\"pyOriginalRecord\")&amp;&amp;@PropertyExists(\"pzInsKey\")");
try {
boolean pz_9 = ((pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "pyOriginalRecord" })).booleanValue() && (pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, null, new Object[] { "pzInsKey" })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageExists(\"pyOriginalRecord\")&amp;&amp;@PropertyExists(\"pzInsKey\")",pz_9);
if (!pz_9) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageExists(\"pyOriginalRecord\")&amp;&amp;@PropertyExists(\"pzInsKey\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@getStepPageHandle(tools) == @getPrimaryPageHandle(tools)");
try {
boolean pz_10 = (pega.<String>resolveMethodCall("getStepPageHandle--(PublicAPI)", "getStepPageHandle", null, null, new Object[] { tools }).equals(pega.<String>resolveMethodCall("getPrimaryPageHandle--(PublicAPI)", "getPrimaryPageHandle", null, null, new Object[] { tools })));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@getStepPageHandle(tools) == @getPrimaryPageHandle(tools)",pz_10);
if (!pz_10) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@getStepPageHandle(tools) == @getPrimaryPageHandle(tools) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: .pyPreviousValues
if (myStepPage == null) {
throw new InvalidReferenceException(".pyPreviousValues", "FUAInstance-NullMyStepPage");
}
ClipboardPage pz_12 = pageQuery_11.resolve(tools, myStepPage);
sourcePage = pz_12;
// Expression: Primary.pyPreviousValues
ClipboardPage pz_13 = pageQuery_11.resolve(tools, tools.getPrimaryPage());
targetPage = pz_13;
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Make sure all previous values are present.
 * <p>
 * Step 5 <code>Java</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
boolean bIsSaveAs = false;

if (myStepPage.getBigDecimal(".pxCreateDateTime").compareTo(myStepPage.getBigDecimal(".pxUpdateDateTime")) == 0)
{
	bIsSaveAs = true;	
}
		
ClipboardPage pgPrimary = tools.getPrimaryPage();
ClipboardProperty cpPreviousValues = pgPrimary.getIfPresent("pyPreviousValues");
if (cpPreviousValues != null && bIsSaveAs == true)
{
	// Clear previous values
	cpPreviousValues.removeFromClipboard();
}
boolean bPreviousValuesWasAbsent = false;
if (cpPreviousValues == null || bIsSaveAs == true)
{
	ClipboardPage pgPreviousValues = tools.createPage(pgPrimary.getClassName(),"");
	pgPrimary.movePage("pyPreviousValues",pgPreviousValues);
 	bPreviousValuesWasAbsent = true;
} 
	
if (bIsSaveAs == false)
{
	ClipboardProperty cpPropertiesList = tools.findPage("ChangeTrackModel").getIfPresent(".pyProperties");
	if (cpPropertiesList != null) 
	{
		java.util.Iterator itPropertiesList = cpPropertiesList.iterator();
		while (itPropertiesList.hasNext()) 
		{
			ClipboardProperty cpCurrentProperty = (ClipboardProperty) itPropertiesList.next();
			String strPropertyName = cpCurrentProperty.getProperty(".pyPropertiesName").getStringValue();
			if (bPreviousValuesWasAbsent || pgPrimary.getIfPresent(".pyPreviousValues" + strPropertyName) == null)
			{
	 			ClipboardPage pgPrevious = tools.findPage("CopyOfInstance");
	 			if (pgPrevious == null)
	 			{
	 	 			try {
		 	 			String sHandle = tools.getPrimaryPage().getString(".pzInsKey");
		 	 			ClipboardPage pgOpenResult = tools.getDatabase().open(sHandle, true, false, false, null);
		 	 			if (pgOpenResult != null)
		 	 			{
		 	 	 			pgOpenResult.rename("CopyOfInstance");
		 	 	 			pgPrevious = tools.findPage("CopyOfInstance");
		 	 			} else
		 	 			{
							nextBlock = "J";
							return false;
		 	 			}
	 	 			} catch (DatabaseException dbEx) {
		 	 			oLog.error("Error in Obj-Open-By-Handle", dbEx);
	 	 			}
	 			}
	 			ClipboardProperty cpTheOldProperty = pgPrevious.getIfPresent(strPropertyName);
	 			if (cpTheOldProperty != null)
	 			{ 	
		 			cpTheOldProperty = pgPrevious.getProperty(strPropertyName);

	 	 			ClipboardProperty cpPropertyOnPreviousValues = pgPrimary.getProperty(".pyPreviousValues" + strPropertyName);
	 	 			cpPropertyOnPreviousValues.setValue(cpTheOldProperty);
	 			}
			}
		}
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
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * For each property, track changes.
 * <p>
 * Step 6 [J] <code>Java</code> [on page ChangeTrackModel.pyProperties] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyPropertiesName==\".pyRuleAvailable\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyPropertiesName==\".pyRuleAvailable\"", "FUAInstance-NullMyStepPage");
}
boolean pz_16 = (scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(".pyRuleAvailable"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyPropertiesName==\".pyRuleAvailable\"",pz_16);
if (pz_16) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyPropertiesName==\".pyRuleAvailable\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyPropertiesName == \".pyPrivilegeList(1).pyPrivilegeName\"");
try {
boolean pz_17 = (scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(".pyPrivilegeList(1).pyPrivilegeName"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyPropertiesName == \".pyPrivilegeList(1).pyPrivilegeName\"",pz_17);
if (pz_17) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyPropertiesName == \".pyPrivilegeList(1).pyPrivilegeName\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyPropertiesName==\".pyLabel\"");
try {
boolean pz_18 = (scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(".pyLabel"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyPropertiesName==\".pyLabel\"",pz_18);
if (pz_18) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyPropertiesName==\".pyLabel\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyPropertiesName==\".pyCanCreateWorkObject\"");
try {
boolean pz_19 = (scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(".pyCanCreateWorkObject"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyPropertiesName==\".pyCanCreateWorkObject\"",pz_19);
if (!pz_19) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyPropertiesName==\".pyCanCreateWorkObject\" " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
String strPropertyName = myStepPage.getString(".pyPropertiesName");
String strLastPropertyRef = strPropertyName;
String strTrackPropertyName	= strPropertyName;

int nLastPropertyDot = strPropertyName.lastIndexOf(".");
if (nLastPropertyDot > 0)
{
	// Store end of the reference to lookup fieldvalue later
	strLastPropertyRef = strPropertyName.substring(nLastPropertyDot);
	// Create string with the PageList or PageGroup property
	strTrackPropertyName = strPropertyName.substring(0,nLastPropertyDot);
}

String strPropertyDescription = myStepPage.getString(".pyPropertiesValue");
ClipboardPage pgPrimary = tools.getPrimaryPage();
ClipboardProperty cpProperty = pgPrimary.getProperty(strTrackPropertyName);
// Get property to store list of memos on
ClipboardProperty cpMemoList = tools.findPage("ChangeTrackModel").getProperty("pyChangeTrackingMemos");

if (cpProperty != null && cpMemoList != null)
{
	// Get page property that stores all the previous values and get property with old value
	ClipboardProperty cpPreviousValues = pgPrimary.getProperty("pyPreviousValues");
	ClipboardProperty cpPreviousProperty = cpPreviousValues.getProperty(strTrackPropertyName);

	// Keep copy of Previous Values so we can compare to it later
	ClipboardPage pgTempPVPage = tools.createPage("Data-Admin-Operator-ID", "");
	pgTempPVPage.put(cpPreviousValues);
	ClipboardProperty cpCopyPreviousValues = pgTempPVPage.getProperty("pyPreviousValues");
	ClipboardProperty cpCopyPreviousProperty = cpCopyPreviousValues.getProperty(strTrackPropertyName);

	// Lists and Groups are really tracking the parent property
	if (cpProperty.isListElement())
	{
		cpProperty = cpProperty.getParentProperty();
		cpPreviousProperty = cpPreviousProperty.getParentProperty();
		cpCopyPreviousProperty = cpCopyPreviousProperty.getParentProperty();
	}

	// Call comparison function based on property mode
	char cMode = cpProperty.getMode();
	if (cMode == PropertyInfo.MODE_PAGE_LIST)
	{
		boolean bRegenerateSF = com.pegarules.generated.pega_processengine_flowutilities.pzChangeTrackForPageListForFlow(cpProperty, cpCopyPreviousProperty);
		if(bRegenerateSF && (pgPrimary.getInteger("pyRegenStartingFlows") != 2)){
			// The pagelist we track is for the privileges.  If they have changed, set
			// pyRegenStartingFlows to 1 to indicate that the Data-Admin-StartingFlows
			// needs to get updated but not the application conclusion cache.
			pgPrimary.putString("pyRegenStartingFlows","1");
		}
	}
	else // else assume scalar
	{
		boolean flushCC = com.pegarules.generated.pega_processengine_flowutilities.pzChangeTrackForScalar(cpProperty, cpPreviousProperty);
		if(flushCC){
			// Flush both the Data-Admin-StartingFlows and the conclusion cache since pyCanCreateWork or pyLabel just changed
			pgPrimary.putString("pyRegenStartingFlows","2");
		}
	}

	// If the value has changed, set new value on page that stores previous values so it will be there next time
	if (pgPrimary.getInteger("pyRegenStartingFlows") != 3)
 		cpPreviousProperty.setValue(cpProperty);

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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * if "pyCanCreateWorkObject" is false don't regenerate Starting Flows.
 * <p>
 * Step 7 <code>Property-Set</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyCanCreateWorkObject==\"true\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyCanCreateWorkObject==\"true\"", "FUAInstance-NullMyStepPage");
}
boolean pz_21 = (scalarValueQuery_20.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyCanCreateWorkObject==\"true\"",pz_21);
if (pz_21) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyCanCreateWorkObject==\"true\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRegenStartingFlows==1");
try {
boolean pz_23 = (scalarValueQuery_22.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER) == 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRegenStartingFlows==1",pz_23);
if (!pz_23) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRegenStartingFlows==1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyRegenStartingFlows", pRef_2, myStepPage, 3, "sNN", false, true);
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

/**
 * Return values to rule form if necessary.
 * <p>
 * Step 8 <code>Property-Set</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageExists(\"pyReturnToClient\", tools)");
try {
boolean pz_24 = (pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", null, null, new Object[] { "pyReturnToClient", tools })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageExists(\"pyReturnToClient\", tools)",pz_24);
if (!pz_24) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageExists(\"pyReturnToClient\", tools) " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyPreviousValues", pRef_25, pega.findPageWithException("pyReturnToClient", "Rule-Obj-Flow"), pageQuery_11.resolve(tools, myStepPage), "S!N@baseclass", false, false);
}
{
    pega.setViaPropRef(".pyRegenStartingFlows", pRef_2, pega.findPageWithException("pyReturnToClient", "Rule-Obj-Flow"), scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER), "sNN", false, true);
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
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Remove clipboard page.
 * <p>
 * Step 9 [PR] <code>Page-Remove</code> [on page ChangeTrackModel] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
pageRemove(myStepPage);
// Expression: CopyOfInstance
pageRemove(tools.findPage("CopyOfInstance"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
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

public boolean bRegenerateSF = false;

public void initializeUserLocalVariables() {
	bRegenerateSF = false;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("bRegenerateSF", Boolean.toString(bRegenerateSF));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_25 = new String[] { "", "", "pyPreviousValues", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyModelName", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyRegenStartingFlows", "" };
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pyCanCreateWorkObject").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pyRegenStartingFlows").buildScalarValueQuery();
private static final PageQuery pageQuery_11 = FUAUtil.createQueryBuilder().page("pyPreviousValues").buildPageQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyPropertiesName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-FLOW PZTRACKCHANGESFORFLOW #20211027T113315.162 GMT", "Rule-Obj-Flow pzTrackChangesForFlow", "Pega-ProcessEngine", "08-07-01", false, true, "", "TRIGGER", "20211027T113315.162 GMT" ,"Rule-Obj-Activity"); }
