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
public class ra_action_pzgetmyapps_3b32589fcd26c903d2d7da009a8cbfce extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzGetMyApps.Code_Pega_List.Action");
	public ra_action_pzgetmyapps_3b32589fcd26c903d2d7da009a8cbfce(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETMYAPPS #20190320T085529.760 GMT	Pega-ProcessEngine:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETMYAPPS #20190320T085529.760 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 1_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_3 = pega.getViaPropRef(".pxSecuritySnapshot.pxAvailableApps", pRef_1, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), false, true);
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
pz_CurrentStepNum = "1.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_0_circum0");
}
PRStackFrame pz_StackFrame1_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETMYAPPS #20190320T085529.760 GMT Step: 1_0 Circum: 0" );
try {
pz_Status = step1_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_0_circum0, false);
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
	"Rule-Obj-Activity:PZGETMYAPPS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETMYAPPS","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-ProcessEngine","08-03-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETMYAPPS #20190320T085529.760 GMT","!PZGETMYAPPS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-837793577)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETMYAPPS #20190320T085529.760 GMT:20190320T085529.760 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "819992185229f81b9d56efd7cb5d4bca";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Action";
}
/**
 * Copy all the available apps.
 * <p>
 * Step 1.0 <code>Java</code> [on page pxRequestor.pxSecuritySnapshot.pxAvailableApps] <br>
 */
public boolean step1_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.Search==\"\"");
try {
boolean pz_4 = (tools.getParamValue("Search").equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.Search==\"\"",pz_4);
if (pz_4) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.Search==\"\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@contains(@toUpperCase(.pxApplicationLabel), @toUpperCase(Param.Search))");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@contains(@toUpperCase(.pxApplicationLabel), @toUpperCase(Param.Search))", "FUAInstance-NullMyStepPage");
}
boolean pz_6 = (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", null, null, new Object[] { pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, null, new Object[] { scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, null, new Object[] { tools.getParamValue("Search") }) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@contains(@toUpperCase(.pxApplicationLabel), @toUpperCase(Param.Search))",pz_6);
if (!pz_6) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@contains(@toUpperCase(.pxApplicationLabel), @toUpperCase(Param.Search)) " + anyException.getMessage(), anyException);
}
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

// Code to call nested step 1_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_1_circum0");
}
PRStackFrame pz_StackFrame1_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETMYAPPS #20190320T085529.760 GMT Step: 1_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_2_circum0");
}
PRStackFrame pz_StackFrame1_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETMYAPPS #20190320T085529.760 GMT Step: 1_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_3_circum0");
}
PRStackFrame pz_StackFrame1_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETMYAPPS #20190320T085529.760 GMT Step: 1_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_3_circum0, false);
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
pz_CurrentStepNum = "1.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_0_circum0 definition

/**
 * Fetch the Index of the access group.
 * <p>
 * Step 1.1 <code>Property-Set</code><br>
 */
public boolean step1_1_circum0() {
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
    AGIndex = (pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", null, null, new Object[] { scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyProductName", tools.getPrimaryPage().getProperty("pxResults") })).intValue();
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
pz_CurrentStepNum = "1.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_1_circum0 definition

/**
 * Copy application details if the Access group doesnt exist in list.
 * <p>
 * Step 1.2 <code>Property-Set</code><br>
 */
public boolean step1_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.AGIndex&gt;0");
try {
boolean pz_8 = (AGIndex > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.AGIndex&gt;0",pz_8);
if (pz_8) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.AGIndex&gt;0 " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxResults(<append>).pyProductName", pRef_9, tools.getPrimaryPage(), scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyLabel", pRef_10, tools.getPrimaryPage(), scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyProductVersion", pRef_11, tools.getPrimaryPage(), scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pzTaggedAccessGroups(<append>).pyLabel", pRef_13, tools.getPrimaryPage(), scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pzTaggedAccessGroups(<last>).pyAccessGroup", pRef_15, tools.getPrimaryPage(), scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyAccessGroup", pRef_17, tools.getPrimaryPage(), pega.<String>resolveMethodCall("whatComesBeforeFirst--(String,char)", "whatComesBeforeFirst", null, null, new Object[] { scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ':' }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxCurrentApplication", pRef_18, tools.getPrimaryPage(), String.valueOf(((pega.<Boolean>resolveMethodCall("when--(String)", "when", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pzIsCurrentApplicationCaseMgr" })).booleanValue() ? true : false)), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyCount", pRef_19, tools.getPrimaryPage(), (pega.getIntegerValueViaPropRef(".pxResults(<last>).pyCount", pRef_19, tools.getPrimaryPage(), false, false, false) + 1), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxObjClass", pRef_20, tools.getPrimaryPage(), "Rule-Application", "sIY", false, true);
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
pz_CurrentStepNum = "1.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_2_circum0 definition

/**
 * Copy application details if the access group already exists in list.
 * <p>
 * Step 1.3 <code>Property-Set</code><br>
 */
public boolean step1_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.AGIndex&gt;0");
try {
boolean pz_21 = (AGIndex > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.AGIndex&gt;0",pz_21);
if (!pz_21) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.AGIndex&gt;0 " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxResults(" + AGIndex + ").pzTaggedAccessGroups(<append>).pyLabel", new String[] { "", "", "pxResults", String.valueOf(AGIndex), "pzTaggedAccessGroups", "<append>", "pyLabel", "" }, tools.getPrimaryPage(), scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + AGIndex + ").pzTaggedAccessGroups(<last>).pyAccessGroup", new String[] { "", "", "pxResults", String.valueOf(AGIndex), "pzTaggedAccessGroups", "<last>", "pyAccessGroup", "" }, tools.getPrimaryPage(), scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + AGIndex + ").pyCount", new String[] { "", "", "pxResults", String.valueOf(AGIndex), "pyCount", "" }, tools.getPrimaryPage(), (scalarValueQuery_22.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER, AGIndex) + 1), "sNN", false, true);
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
pz_CurrentStepNum = "1.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_3_circum0 definition

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

public int AGIndex = 0;

public void initializeUserLocalVariables() {
	AGIndex = 0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("AGIndex", Integer.toString(AGIndex));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_15 = new String[] { "", "", "pxResults", "<last>", "pzTaggedAccessGroups", "<last>", "pyAccessGroup", "" };
public static final String[] pRef_13 = new String[] { "", "", "pxResults", "<last>", "pzTaggedAccessGroups", "<append>", "pyLabel", "" };
public static final String[] pRef_9 = new String[] { "", "", "pxResults", "<append>", "pyProductName", "" };
public static final String[] pRef_19 = new String[] { "", "", "pxResults", "<last>", "pyCount", "" };
public static final String[] pRef_1 = new String[] { "", "", "pxSecuritySnapshot", "", "pxAvailableApps", "" };
public static final String[] pRef_10 = new String[] { "", "", "pxResults", "<last>", "pyLabel", "" };
public static final String[] pRef_17 = new String[] { "", "", "pxResults", "<last>", "pyAccessGroup", "" };
public static final String[] pRef_20 = new String[] { "", "", "pxResults", "<last>", "pxObjClass", "" };
public static final String[] pRef_11 = new String[] { "", "", "pxResults", "<last>", "pyProductVersion", "" };
public static final String[] pRef_18 = new String[] { "", "", "pxResults", "<last>", "pxCurrentApplication", "" };
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pxAccessGroupLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pxApplicationLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pxAccessGroup").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pxApplicationName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pxApplicationVersion").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETMYAPPS #20190320T085529.760 GMT", "Code-Pega-List pzGetMyApps", "Pega-ProcessEngine", "08-03-01", false, true, "", "ACTIVITY", "20190320T085529.760 GMT" ,"Rule-Obj-Activity"); }
