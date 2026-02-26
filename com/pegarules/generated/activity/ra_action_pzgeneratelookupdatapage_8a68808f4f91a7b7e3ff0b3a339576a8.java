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
public class ra_action_pzgeneratelookupdatapage_8a68808f4f91a7b7e3ff0b3a339576a8 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzGenerateLookupDataPage._baseclass.Action");
	public ra_action_pzgeneratelookupdatapage_8a68808f4f91a7b7e3ff0b3a339576a8(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT	Pega-ProcessArchitect:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT";
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
String pz_3 = "pyLookupDataPageInternal";
thisStepPage = tools.findPage(pz_3, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 1 Circum: 0" );
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
String pz_5 = "pyLookupDataPageInternal";
thisStepPage = tools.findPage(pz_5, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_5, false);
thisStepPage.putString("pxObjClass", "Rule-Declare-Pages");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 3 Circum: 0" );
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
String pz_17 = "pyLookupDataPageInternal";
thisStepPage = tools.findPage(pz_17, true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 4 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
ClipboardProperty pz_19 = propertyQuery_1.resolve(tools, pega.findPageWithException("pyLookupDataPageInternal", "Rule-Declare-Pages"));
thisStepPage = pz_19 == null ? null : pz_19.getPageValue();
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 5 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_21 = "pyLookupDataPageInternal";
thisStepPage = tools.findPage(pz_21, true);
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 6 Circum: 0" );
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
String pz_22 = "pyLookupDataPageInternal";
thisStepPage = tools.findPage(pz_22, true);
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 7 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_23 = "pyLookupDataPageInternal";
thisStepPage = tools.findPage(pz_23, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_23, false);
thisStepPage.putString("pxObjClass", "Rule-Declare-Pages");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_25 = "pyLookupDataPageInternal";
thisStepPage = tools.findPage(pz_25, true);
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 10_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Err"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_circum0");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CU"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_28 = "pyLookupDataPageInternal";
thisStepPage = tools.findPage(pz_28, true);
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
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
	"Rule-Obj-Activity:PZGENERATELOOKUPDATAPAGE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGENERATELOOKUPDATAPAGE","Rule-Obj-Activity","@BASECLASS",false,"","Pega-ProcessArchitect","08-05-01","RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT","!PZGENERATELOOKUPDATAPAGE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1832560354)
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
//	RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT:20200707T163401.697 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "681684f742142a09c7eb1acd3b694780";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Action";
}
/**
 * Initiate Data Page rule.
 * <p>
 * Step 1 <code>Page-New</code> [on page pyLookupDataPageInternal] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_4 = "pyLookupDataPageInternal";
myStepPage = tools.findPage(pz_4, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Rule-Declare-Pages","pyLookupDataPageInternal",false); 
// Expression: pyDefault
tools.applyModel(myStepPage, null, "pyDefault");
// primary page will not be added to PageList
	 pega.setStepPage("pyLookupDataPageInternal", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Set properties on the Data Page.
 * <p>
 * Step 2 <code>Property-set</code> [on page pyLookupDataPageInternal] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyPageName", pRef_6, myStepPage, tools.getParamValue("LookupDataPage"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, tools.getParamValue("ClassName"), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyStructure", pRef_8, myStepPage, "page", "stN", false, true);
}
{
    pega.setViaPropRef(".pyLabel", pRef_9, myStepPage, pega.<String>resolveMethodCall("pzGetClassInfoFromDefinition--(String,String)", "pzGetClassInfoFromDefinition", null, null, new Object[] { scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyLabel" }), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pyScope", pRef_11, myStepPage, "thread", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyDescription", pRef_12, myStepPage, ("Lookup " + scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyUsage", pRef_14, myStepPage, ("Lookup " + scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Set properties for simulating the source.
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.simulateDP");
try {
boolean pz_15 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "simulateDP");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.simulateDP",pz_15);
if (!pz_15) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.simulateDP " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("skipTopLevel", PropertyInfo.TYPE_TEXT, true);
}
{
    pega.setViaPropRef(".pyDataSourceList(1).pyIsSimulated", pRef_16, pega.findPageWithException("pyLookupDataPageInternal", "Rule-Declare-Pages"), true, "sSN", false, true);
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
 * Remove Params list, we populate it later.
 * <p>
 * Step 4 <code>Property-remove</code> [on page pyLookupDataPageInternal] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-remove
// Expression: .pyParameters
if (myStepPage == null) {
throw new InvalidReferenceException(".pyParameters", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_18 = myStepPage.getIfPresent("pyParameters");
try {if (pz_18!= null) {
pz_18.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 4.";
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Apply transform to initialize simulated source.
 * <p>
 * Step 5 <code>Apply-DataTransform</code> [on page pyLookupDataPageInternal.pyDataSourceList(1)] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.simulateDP");
try {
boolean pz_20 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "simulateDP");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.simulateDP",pz_20);
if (!pz_20) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.simulateDP " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: pzSwapWithDisabledSource
ParameterPage stepParams__1= null;/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "@baseclass";
}
StringMap params__1 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__1.putString("pxObjClass", "Rule-Obj-Model");
params__1.putString("pyClassName", modelClass);
params__1.putString("pyModelName", "pzSwapWithDisabledSource");
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
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Add parameters from keys.
 * <p>
 * Step 6 <code>java</code> [on page pyLookupDataPageInternal] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
String sClass = myStepPage.getString("pyClassName");
Dictionary dictionary = tools.getDictionary();
ClassDefinition cdClass = tools.getDatabase().getClassDef(sClass);
if(cdClass != null){
  List<String> lKeys = cdClass.getKeyPropertyList();
  Iterator<String> i = lKeys.iterator();
  ClipboardProperty cpParameters = myStepPage.getProperty("pyParameters");
  ClipboardPage pgActivityParameters = myStepPage.getPage(".pyDataSourceList(1).pyLoadActivityParameters");
  
  String simulateDP = "";
  if (tools.getParameterPage() != null) {
    simulateDP = tools.getParameterPage().getString("simulateDP");
  }
  if (simulateDP == null || simulateDP.equals("")){
    simulated = false;
  }
  else {
    simulated = simulateDP.equals("true") ? true : false; 
  }

  while(i.hasNext()){
  	String sKeyName = i.next()
  		, sKeyLabel = dictionary.fromDefinition(sClass, sKeyName,"pyLabel")
  		, sKeyType = dictionary.fromDefinition(sClass, sKeyName,"pyStringType")
  	;
    if(!(sKeyName.equals("pyGUID") && simulated)){
  	  ClipboardPage pgParameter = cpParameters.getPageValue(ClipboardProperty.LIST_APPEND);
  	  ParameterPage ppParams = new ParameterPage();
  	  
      //BUG-527909 strip dot prefix if present
      sKeyName = sKeyName.startsWith(".") ? sKeyName.substring(1,sKeyName.length()) : sKeyName ;
      
      ppParams.putParamValue("Name", sKeyName);
  	  ppParams.putParamValue("Label", sKeyLabel);
  	  ppParams.putParamValue("Type", sKeyType);
  	  ppParams.putParamValue("Required", PropertyInfo.TYPE_TRUEFALSE, true);
  	  ppParams.putParamValue("SmartpromptType", sClass);
  	  if(lKeys.size() > 1){
  		  ppParams.putParamValue("ValidateAs", sKeyName);
  	  }
  	  tools.applyModel(pgParameter, ppParams, "pzSetParameter");
    }
    if(simulated){
      ClipboardPage classKeyValue = myStepPage.getProperty(".pyDataSourceList(1).pyClassKeyValueList").getPageValue(ClipboardProperty.LIST_APPEND);
      classKeyValue.putString("pyName", sKeyName);
      classKeyValue.putString("pyValue", "SIMULATION");
    }
    else{
  	  // Have to add parameter to the load activity parameters of the lookup data source
  	  pgActivityParameters.putString(sKeyName, "param." + sKeyName);
    }

  }
  pgActivityParameters.getProperty("pyRunDataTransformOnError").setValue(true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Temp fix - use Java - pre-req issue with properties.
 * <p>
 * Step 7 <code>Java</code> [on page pyLookupDataPageInternal] <br>
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
String classNameParam = tools.getParamValue("ClassName");
String classNameLabel = myStepPage.getString("pyLabel");

myStepPage.putString(".pyKeepOneCopy", "true");
myStepPage.putString(".pyDataSourceList(1).pyDescription", "Lookup " + classNameLabel);
myStepPage.putString(".pyDataSourceList(1).pyLoadActivity", "pxCallObjOpen");
myStepPage.putString(".pyDataSourceList(1).pyClassName", classNameParam);
myStepPage.putString(".pyDataSourceList(1).pySourceWhen", "Always");
myStepPage.putString(".pyDataSourceList(1).pyDeclarePagesDataSource", "ObjOpen");
myStepPage.putString(".pyDataSourceList(1).pyLookupName", classNameLabel);
myStepPage.putString(".pyDataSourceList(1).pyLookupClassName", classNameParam);
myStepPage.putString(".pyDataSourceList(1).pyModalTitle", classNameLabel);
myStepPage.putString(".pyDataSourceList(1).pyIsRequired", "false");
if (simulated) {
  myStepPage.putString(".pyDataSourceList(1).pyDTName", "pzGetMostRecentRecord");
  myStepPage.putString(".pyDataSourceList(1).pyExecuteOnDataPage", "true");
  myStepPage.putString(".pyDataSourceList(1).pyRunDataTransformOnError", "true");
}


java.util.Iterator params = myStepPage.getProperty(".pyParameters").iterator();
int i = 0;
while (params.hasNext()) {
  i++;
  ClipboardPage param = ((ClipboardProperty) params.next()).getPageValue();
  myStepPage.putString(".pyDataSourceList(1).pyClassKeyValueList(" + i + ").pyValue", "param." + param.getString(".pyParametersParamName"));
  myStepPage.putString(".pyDataSourceList(1).pyClassKeyValueList(" + i + ").pyName", param.getString(".pyParametersParamName"));
}
myStepPage.putString(".pyDataSourceList(1).pyLoadActivityParameters.pyLookupClassName", classNameParam);
myStepPage.putString(".pyDataSourceList(1).pyLoadActivityParameters.pxObjClass", classNameParam);
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
 * Set pySourceCount at toplevel.
 * <p>
 * Step 8 <code>Property-Set</code> [on page pyLookupDataPageInternal] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pySourceCount", pRef_24, myStepPage, Integer.toString((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", "Pega-RULES", "Utilities", new Object[] { myStepPage.getProperty("pyDataSourceList") })).intValue()), "sTN", false, true);
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
 * Attempt to create the data page.
 * <p>
 * Step 9 <code>Call pxUpdateRecord</code> [on page pyLookupDataPageInternal] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxUpdateRecord");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxUpdateRecord", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxUpdateRecord
if (myStepPage == null) {
String pz_26 = "pyLookupDataPageInternal";
myStepPage = tools.findPage(pz_26, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_26, false);
myStepPage.putString("pxObjClass", "Rule-Declare-Pages");
}
}
// Calling Activity : pxUpdateRecord
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxUpdateRecord", "@baseclass", "");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@hasMessages(myStepPage)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@hasMessages(myStepPage)", "FUAInstance-NullMyStepPage");
}
boolean pz_27 = (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", null, null, new Object[] { myStepPage })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@hasMessages(myStepPage)",pz_27);
if (pz_27) {
// branch to block Err
nextBlock = "Err";
return false;
} else {
// branch to block CU
nextBlock = "CU";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@hasMessages(myStepPage) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxUpdateRecord",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step9_circum0 definition

/**
 * Set error messages on primary if errors.
 * <p>
 * Step 10 [Err] <code>Page-Set-Messages</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Set-Messages
ClipboardPage targetPage = null;
targetPage = tools.getPrimaryPage();
if (targetPage == null) {
throw new InvalidReferenceException("Primary", "this step page does not exist and cannot be modified");
}
// Expression: @getMessagesAll(pyLookupDataPageInternal)
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = pega.<String>resolveMethodCall("getMessagesAll--(Page)", "getMessagesAll", null, null, new Object[] { pega.findPage("pyLookupDataPageInternal", "Rule-Declare-Pages") });
targetPage.addMessageWithKey("(@baseclass)" + messageToAdd, keyToPass);
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
boolean pz__1 = true;
if (pz__1) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzGenerateLookupDataPage - Transition", null);
pz_CheckMessage = false;
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzGenerateLookupDataPage - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step10_circum0 definition

/**
 * Clean up if no errors.
 * <p>
 * Step 11 [CU] <code>Page-Remove</code> [on page pyLookupDataPageInternal] <br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.doNotRemovePage");
try {
boolean pz_29 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "doNotRemovePage");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.doNotRemovePage",pz_29);
if (pz_29) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.doNotRemovePage " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
pageRemove(myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

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

public boolean simulated = false;
public String pageName = "";

public void initializeUserLocalVariables() {
	simulated = false;
	pageName = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("simulated", Boolean.toString(simulated));
	smRetVal.putString("pageName", (pageName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : pageName.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_9 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyPageName", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_24 = new String[] { "", "", "pySourceCount", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyStructure", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyDescription", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyScope", "" };
public static final String[] pRef_14 = new String[] { "", "", "pyUsage", "" };
public static final String[] pRef_16 = new String[] { "", "", "pyDataSourceList", "1", "pyIsSimulated", "" };
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().pageList("pyDataSourceList", 1).buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY @BASECLASS PZGENERATELOOKUPDATAPAGE #20200311T145716.762 GMT", "@baseclass pzGenerateLookupDataPage", "Pega-ProcessArchitect", "08-05-01", false, true, "", "ACTIVITY", "20200707T163401.697 GMT" ,"Rule-Obj-Activity"); }
