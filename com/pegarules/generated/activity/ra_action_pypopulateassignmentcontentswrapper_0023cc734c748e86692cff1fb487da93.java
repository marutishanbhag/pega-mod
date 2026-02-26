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
public class ra_action_pypopulateassignmentcontentswrapper_0023cc734c748e86692cff1fb487da93 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyPopulateAssignmentContentsWrapper.Work_.Action");
	public ra_action_pypopulateassignmentcontentswrapper_0023cc734c748e86692cff1fb487da93(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT	Pega-EndUserUI:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 1 Circum: 0" );
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
thisStepPage = tools.getPrimaryPage();
if (thisStepPage == null) {
throw new InvalidReferenceException("", "this step has no step page and attempts to use a relative reference for the Repeat string list property");
}
if (thisStepPage == null) {
throw new InvalidReferenceException(".pyLevelList", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_4 = thisStepPage.getIfPresent("pyLevelList");
pageRef = pz_4;
if (pageRef != null) {
myPageList = pageRef.iterator();
while(myPageList.hasNext() && (pz_Status == true)) {
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextProperty = (ClipboardProperty) myPageList.next();
//nextProperty will be used as the value of parameter values that refer to the repeating parameter with (<current>) to indicate its index value
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0(nextProperty);
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the for loop for For Each PropertyList/Group
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_7 = pega.findPageWithException("WorkListAssignments", "@baseclass").getIfPresent("pxResults");
pageRef = pz_7;
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
pz_CurrentStepNum = "7.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_0_circum0");
}
PRStackFrame pz_StackFrame7_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 7_0 Circum: 0" );
try {
pz_Status = step7_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
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
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_14 = pega.findPageWithException("WorkBasketAssignments", "@baseclass").getIfPresent("pxResults");
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
pz_CurrentStepNum = "11.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_0_circum0");
}
PRStackFrame pz_StackFrame11_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 11_0 Circum: 0" );
try {
pz_Status = step11_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 12_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_circum0");
}
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
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
	"Rule-Obj-Activity:PYPOPULATEASSIGNMENTCONTENTSWRAPPER"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYPOPULATEASSIGNMENTCONTENTSWRAPPER","Rule-Obj-Activity","WORK-",false,"","Pega-EndUserUI","08-05-01","RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT","!PYPOPULATEASSIGNMENTCONTENTSWRAPPER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1483465486)
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
//	RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT:20200601T053151.351 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "7086ffea2adb19157e2f8f8c8f49631f";
	}

	public String getDefinitionAppliesToClass() {
		return "Work-";
	}
public String getAspect() {
return "Action";
}
/**
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
    CaseKeysCSV = (("\"" + tools.getParamValue("WorkObjectInsKey")) + "\"");
}
{
    pzWorkPageName = pega.<String>resolveMethodCall("PageName--(ClipboardPage)", "PageName", null, null, new Object[] { pega.<ClipboardPage>resolveMethodCall("findPageByHandle--(String)", "findPageByHandle", null, null, new Object[] { tools.getParamValue("WorkObjectInsKey") }) });
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
 * Get nested cases keys as csv.
 * <p>
 * Step 2 <code>Property-Set</code><br>
 */
public boolean step2_circum0(ClipboardProperty currentProperty) {
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
    CaseKeysCSV = ((((CaseKeysCSV + ",") + "\"") + currentProperty.getStringValue()) + "\"");
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
 * Attempt shortcut for open wl/wb assign.
 * <p>
 * Step 3 <code>Call pyLoadOpenAssignmentsFromClipboard</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyLoadOpenAssignmentsFromClipboard");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@indexOf(Local.CaseKeysCSV,\",\")==-1");
try {
boolean pz_5 = ((pega.<Integer>resolveMethodCall("indexOf--(String,String)", "indexOf", null, null, new Object[] { CaseKeysCSV, "," })).intValue() == ((-1)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@indexOf(Local.CaseKeysCSV,\",\")==-1",pz_5);
if (!pz_5) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@indexOf(Local.CaseKeysCSV,\",\")==-1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pyLoadOpenAssignmentsFromClipboard", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pyLoadOpenAssignmentsFromClipboard
if (myStepPage == null) {
}
// Calling Activity : pyLoadOpenAssignmentsFromClipboard
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pyLoadOpenAssignmentsFromClipboard", "Work-", "");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.skipOpenAssignmentsReport");
try {
boolean pz_6 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "skipOpenAssignmentsReport");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.skipOpenAssignmentsReport",pz_6);
if (pz_6) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pyPopulateAssignmentContentsWrapper - Transition", null);
pz_CheckMessage = false;
return false;
} else {
// skip step / stop remaining iterations
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.skipOpenAssignmentsReport " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyLoadOpenAssignmentsFromClipboard",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step3_circum0 definition

/**
 * Set params for worklist assignment report.
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
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("InsKey", PropertyInfo.TYPE_TEXT, CaseKeysCSV);
}
{
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "pyWorklistAssignmentsDefinition");
}
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Assign-Worklist");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "WorkListAssignments");
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Get worklist assignments.
 * <p>
 * Step 6 <code>Call-Function</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call-Function", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call-Function
// Expression: @(Pega-RulesEngine:ReportingUtils).pzRetrieveReportDataByCSVInBatches("InsKey")
pega.<Void>resolveMethodCall("pzRetrieveReportDataByCSVInBatches--(String)", "pzRetrieveReportDataByCSVInBatches", "Pega-RulesEngine", "ReportingUtils", new Object[] { "InsKey" });
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Copy wl assignment to case tree.
 * <p>
 * Step 7.0 <code>Property-Set</code> [on page WorkListAssignments.pxResults] <br>
 */
public boolean step7_0_circum0() {
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
    pega.setViaPropRef(".pyLabel", pRef_8, myStepPage, scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pyTempText", pRef_11, myStepPage, scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyTreeGridIcon", pRef_13, myStepPage, "images/pyOpenAssignment.png", "sTN", false, true);
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

// Code to call nested step 7_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_1_circum0");
}
PRStackFrame pz_StackFrame7_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 7_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step7_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame7_1_circum0, false);
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
pz_CurrentStepNum = "7.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_0_circum0 definition

/**
 * Step 7.1 <code>Java</code><br>
 */
public boolean step7_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// get the assignment instructions
String instructions = myStepPage.getString("pyInstructions");
String instructionsLabel = "";
if ((instructions != null) && (instructions.length() > 0)) {
    instructionsLabel = instructions;
}
// get the flow name
String flow = myStepPage.getString("pxFlowName");
String pyDesc = myStepPage.getString("pyLabel");// Flow Label is set pylabel in the previous step
String taskLabel = myStepPage.getString("pxTaskLabel");//Assignment Label
String flowName = "";
if ((flow != null) && (flow.length() > 0)) {
    flowName = flow; // Using flow label if it is not empty
}
//get localized label for instructions
if (!instructionsLabel.equals("")) {
    if (!pzWorkPageName.equals(""))
      instructionsLabel = tools.getLocalizedTextForString("pzWorkPageName.pyInstructions",instructionsLabel);
    else
      instructionsLabel = tools.getLocalizedTextForString("pyInstructions",instructionsLabel);
}
// parse out the pyClassName of the flow from its key
/*Unused code
String flowKey = myStepPage.getString("pxFlowInsKey");
String flowClass = flowKey.substring(14,flowKey.length()-1);
flowClass = flowClass.substring(0, flowClass.indexOf(' '));
*/

//For UI-KIt Precedence Order 1. Assignment Label 2. Flow Label 3. Instructions
//For non UI-KIt Precedence Order 1. Instructions 2. Flow Label 3. Flow Name // Here never Assignment label is shown.
if (instructionsLabel.equals("")) {
	// if there are no instructions for this assignment
	if (flowName.indexOf('_') > 0) {
		// if the flow name has a weird underscore/number thing at the end
		instructionsLabel = tools.getLocalizedTextForString("pyCaption",pyDesc);
		if("".equals(pyDesc))
		{
			instructionsLabel = tools.getLocalizedTextForString("pyCaption",flowName);
		}
	}else if (myStepPage.getString("pyLabel").equals("")) {
		instructionsLabel = tools.getLocalizedTextForString("pyCaption",flowName);	
	}else{
		instructionsLabel = tools.getLocalizedTextForString("pyCaption",pyDesc);
	}	
}
// use this in the section to display the assignment label
myStepPage.putString("pyPropertyValue", instructionsLabel);
myStepPage.putString("pzCaseContentsDeadline", myStepPage.getString("pxDeadlineTime"));
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
pz_CurrentStepNum = "7.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_1_circum0 definition

/**
 * Set params for workbasket assignment report.
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
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("InsKey", PropertyInfo.TYPE_TEXT, CaseKeysCSV);
}
{
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "pyWorkBasketAssignmentsDefinition");
}
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Assign-WorkBasket");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "WorkBasketAssignments");
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
 * Get workbasket assignments.
 * <p>
 * Step 10 <code>Call-Function</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call-Function", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call-Function
// Expression: @(Pega-RulesEngine:ReportingUtils).pzRetrieveReportDataByCSVInBatches("InsKey")
pega.<Void>resolveMethodCall("pzRetrieveReportDataByCSVInBatches--(String)", "pzRetrieveReportDataByCSVInBatches", "Pega-RulesEngine", "ReportingUtils", new Object[] { "InsKey" });
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Copy wb assignment to case tree.
 * <p>
 * Step 11.0 <code>Property-Set</code> [on page WorkBasketAssignments.pxResults] <br>
 */
public boolean step11_0_circum0() {
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
    pega.setViaPropRef(".pyLabel", pRef_8, myStepPage, scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pyTreeGridIcon", pRef_13, myStepPage, "images/pyOpenAssignment.png", "sTN", false, true);
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

// Code to call nested step 11_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_1_circum0");
}
PRStackFrame pz_StackFrame11_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT Step: 11_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step11_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame11_1_circum0, false);
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
pz_CurrentStepNum = "11.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_0_circum0 definition

/**
 * Step 11.1 <code>Java</code><br>
 */
public boolean step11_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// get the assignment instructions
String instructions = myStepPage.getString("pyInstructions");
String instructionsLabel = "";
if ((instructions != null) && (instructions.length() > 0)) {
    instructionsLabel = instructions;
}
// get the flow name
String flow = myStepPage.getString("pxFlowName");
String pyDesc = myStepPage.getString("pyLabel");// Flow Label is set pylabel in the previous step
String taskLabel = myStepPage.getString("pxTaskLabel");//Assignment Label
String flowName = "";
if ((flow != null) && (flow.length() > 0)) {
    flowName = flow;
}
//get localized label for instructions
if (!instructionsLabel.equals("")) {
    if (!pzWorkPageName.equals(""))
      instructionsLabel = tools.getLocalizedTextForString("pzWorkPageName.pyInstructions",instructionsLabel);
    else
      instructionsLabel = tools.getLocalizedTextForString("pyInstructions",instructionsLabel);
}
// parse out the pyClassName of the flow from its key
/*Unused code
String flowKey = myStepPage.getString("pxFlowInsKey");
String flowClass = flowKey.substring(14,flowKey.length()-1);
flowClass = flowClass.substring(0, flowClass.indexOf(' '));
*/

//For UI-KIt Precedence Order 1. Assignment Label 2. Flow Label 3. Instructions
//For non UI-KIt Precedence Order 1. Instructions 2. Flow Label 3. Flow Name // Here never Assignment label is shown.
if (instructionsLabel.equals("")) {
	// if there are no instructions for this assignment
	if (flowName.indexOf('_') > 0) {
		// if the flow name has a weird underscore/number thing at the end
		instructionsLabel = tools.getLocalizedTextForString("pyCaption",pyDesc);	
		if("".equals(pyDesc))
		{
			instructionsLabel = tools.getLocalizedTextForString("pyCaption",flowName);
		}
	}else if (myStepPage.getString("pyLabel").equals("")) {
		instructionsLabel = tools.getLocalizedTextForString("pyCaption",flowName);	
	}else{
		instructionsLabel = tools.getLocalizedTextForString("pyCaption",pyDesc);
	}	
}
// use this in the section to display the assignment label
myStepPage.putString("pyPropertyValue", instructionsLabel);
myStepPage.putString("pzCaseContentsDeadline", myStepPage.getString("pxDeadlineTime"));
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
pz_CurrentStepNum = "11.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_1_circum0 definition

/**
 * Copy assignments to relevant case node in tree.
 * <p>
 * Step 12 <code>Call pyPopulateAssignmentContents</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPopulateAssignmentContents");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pyPopulateAssignmentContents", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pyPopulateAssignmentContents
if (myStepPage == null) {
}
// Calling Activity : pyPopulateAssignmentContents
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pyPopulateAssignmentContents", "Work-", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyPopulateAssignmentContents",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Step 13 <code>Page-Remove</code><br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: WorkListAssignments
pageRemove(tools.findPage("WorkListAssignments"));
// Expression: WorkBasketAssignments
pageRemove(tools.findPage("WorkBasketAssignments"));
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
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

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

public String pzWorkPageName = "";
public String CaseKeysCSV = "";

public void initializeUserLocalVariables() {
	pzWorkPageName = "";
	CaseKeysCSV = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("pzWorkPageName", (pzWorkPageName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : pzWorkPageName.toString());
	smRetVal.putString("CaseKeysCSV", (CaseKeysCSV == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : CaseKeysCSV.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_8 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_10 = new String[] { "", "", "pxPages", "FlowPage", "pyLabel", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyTempText", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyTreeGridIcon", "" };
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "FlowPage").scalarProperty("pyLabel").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY WORK- PYPOPULATEASSIGNMENTCONTENTSWRAPPER #20200601T053151.351 GMT", "Work- pyPopulateAssignmentContentsWrapper", "Pega-EndUserUI", "08-05-01", false, true, "", "ACTIVITY", "20200601T053151.351 GMT" ,"Rule-Obj-Activity"); }
