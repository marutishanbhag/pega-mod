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
public class ra_action_pzpopulatedynamicnavigationpages_16d497b93d75f712d2e9c2763af6cc6f extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzPopulateDynamicNavigationPages.Code_Pega_List.Action");
	public ra_action_pzpopulatedynamicnavigationpages_16d497b93d75f712d2e9c2763af6cc6f(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT	Pega-UIEngine:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT";
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
String pz_5 = "Application";
thisStepPage = tools.findPage(pz_5, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_5, false);
thisStepPage.putString("pxObjClass", "Rule-Application");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 2 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_8 = "RelevantRecord";
thisStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_12 = pega.findPageWithException("pyPortal", "Data-Portal").getIfPresent("pyNavigationPages");
pageRef = pz_12;
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
pz_CurrentStepNum = "4.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_0_circum0");
}
PRStackFrame pz_StackFrame4_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_0 Circum: 0" );
try {
pz_Status = step4_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 5_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_49 = tools.getPrimaryPage().getIfPresent("pxResults");
pageRef = pz_49;
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
pz_CurrentStepNum = "5.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_0_circum0");
}
PRStackFrame pz_StackFrame5_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 5_0 Circum: 0" );
try {
pz_Status = step5_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_0_circum0, false);
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
	"Rule-Obj-Activity:PZPOPULATEDYNAMICNAVIGATIONPAGES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPOPULATEDYNAMICNAVIGATIONPAGES","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-UIEngine","08-06-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT","!PZPOPULATEDYNAMICNAVIGATIONPAGES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1131625448)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT:20200818T193102.041 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "298f01ba7bd8b5acf17a8f65b54f2a4a";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Action";
}
/**
 * Set params to call pxGetUIPagesClassFromApp.
 * <p>
 * Step 1 <code>Property-Set</code> [on page Application] <br>
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
    tools.putParamValue("AppName", PropertyInfo.TYPE_TEXT, scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("AppVersion", PropertyInfo.TYPE_TEXT, scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
 * Grab UI pages class.
 * <p>
 * Step 2 <code>Call pxGetUIPagesClassFromApp</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxGetUIPagesClassFromApp");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxGetUIPagesClassFromApp", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxGetUIPagesClassFromApp
if (myStepPage == null) {
}
// Calling Activity : pxGetUIPagesClassFromApp
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxGetUIPagesClassFromApp", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxGetUIPagesClassFromApp",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Get the list of pages from relevant record.
 * <p>
 * Step 3 <code>Call  Code-Pega-List.pxLoadRuleResolvedRelevantRecords</code> [on page RelevantRecord] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call  Code-Pega-List.pxLoadRuleResolvedRelevantRecords");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call  Code-Pega-List.pxLoadRuleResolvedRelevantRecords", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call  Code-Pega-List.pxLoadRuleResolvedRelevantRecords
if (myStepPage == null) {
String pz_9 = "RelevantRecord";
myStepPage = tools.findPage(pz_9, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_9, false);
myStepPage.putString("pxObjClass", "Data-Tag-RelevantRecord");
}
}
// Calling Activity : Code-Pega-List.pxLoadRuleResolvedRelevantRecords

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "Rule-HTML-Harness"
newParamsPage.putParamValue("RecordType", PropertyInfo.TYPE_TEXT, "Rule-HTML-Harness");
// Expression: true
String pz_10 = String.valueOf(true);
newParamsPage.putParamValue("GetInactiveRecordsAlso", PropertyInfo.TYPE_TRUEFALSE, pz_10);
// Expression: true
String pz_11 = String.valueOf(true);
newParamsPage.putParamValue("InitializeWhenMissing", PropertyInfo.TYPE_TRUEFALSE, pz_11);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: param.UIPagesClassName
newParamsPage.putParamValue("ContextClass", PropertyInfo.TYPE_TEXT, tools.getParamValue("UIPagesClassName"));
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pxLoadRuleResolvedRelevantRecords", "Code-Pega-List", "Code-Pega-List");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call  Code-Pega-List.pxLoadRuleResolvedRelevantRecords",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * loop thru each page to add previously marked navs.
 * <p>
 * Step 4.0 <code>Property-Set</code> [on page pyPortal.pyNavigationPages] <br>
 */
public boolean step4_0_circum0() {
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
    streamName = scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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

// Code to call nested step 4_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_1_circum0");
}
PRStackFrame pz_StackFrame4_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_2_circum0");
}
PRStackFrame pz_StackFrame4_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_3_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_14 = pega.findPageWithException("RelevantRecord", "Data-Tag-RelevantRecord").getIfPresent("pxResults");
nestedPageRef = pz_14;
if (nestedPageRef != null) {
myNestedPageList = nestedPageRef.iterator();
forEachCounter = 0; // reset counter for nested loop
pz_forEachSkipClass = 0; // reset counter for nested loop
while (myNestedPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextNestedPage = (ClipboardProperty) myNestedPageList.next();
nestedStepPage = nextNestedPage.getPageValue();
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.3.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_3_0_circum0");
}
PRStackFrame pz_StackFrame4_3_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_3_0 Circum: 0" );
try {
pz_Status = step4_3_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_3_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 4_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_4_circum0");
}
String pz_15 = "TempHarness";
nestedStepPage = tools.findPage(pz_15, true);
PRStackFrame pz_StackFrame4_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_5_circum0");
}
String pz_16 = "TempHarness";
nestedStepPage = tools.findPage(pz_16, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_16, false);
nestedStepPage.putString("pxObjClass", "Rule-HTML-Harness");
}
PRStackFrame pz_StackFrame4_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_7_circum0");
}
PRStackFrame pz_StackFrame4_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_9_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
nestedStepPage = tools.getStepPage();
ClipboardProperty pz_18 = pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup").getIfPresent("pyUserRoles");
nestedPageRef = pz_18;
if (nestedPageRef != null) {
myNestedPageList = nestedPageRef.iterator();
forEachCounter = 0; // reset counter for nested loop
pz_forEachSkipClass = 0; // reset counter for nested loop
while(myNestedPageList.hasNext() && (pz_Status == true)) {
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextProperty = (ClipboardProperty) myNestedPageList.next();
//nextProperty will be used as the value of parameter values that refer to the repeating parameter with (<current>) to indicate its index value
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.9.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_9_0_circum0");
}
PRStackFrame pz_StackFrame4_9_0_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_9_0 Circum: 0" );
try {
pz_Status = step4_9_0_circum0(nextProperty);
} finally {
pega.popStackFrame(pz_StackFrame4_9_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the for loop for For Each PropertyList/Group
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 4_10_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("NOTPRIV"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_10_circum0");
}
String pz_19 = "PagePrivilege";
nestedStepPage = tools.findPage(pz_19, true);
PRStackFrame pz_StackFrame4_10_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_11_circum0");
}
String pz_20 = "PagePrivilege";
nestedStepPage = tools.findPage(pz_20, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_20, false);
nestedStepPage.putString("pxObjClass", "Rule-Access-Privilege");
}
PRStackFrame pz_StackFrame4_11_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_12_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_12_circum0");
}
String pz_21 = "TempHarness";
nestedStepPage = tools.findPage(pz_21, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_21, false);
nestedStepPage.putString("pxObjClass", "Rule-HTML-Harness");
}
PRStackFrame pz_StackFrame4_12_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_13_circum0");
}
String pz_22 = "TempHarness";
nestedStepPage = tools.findPage(pz_22, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_22, false);
nestedStepPage.putString("pxObjClass", "Rule-HTML-Harness");
}
PRStackFrame pz_StackFrame4_13_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_13 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_13_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_14_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SUPERUSER"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_14_circum0");
}
PRStackFrame pz_StackFrame4_14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_14 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_14_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_15_circum0");
}
String pz_23 = "TempHarness";
nestedStepPage = tools.findPage(pz_23, true);
PRStackFrame pz_StackFrame4_15_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_15 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_15_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_16_circum0");
}
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
ClipboardProperty embeddedPageProp = tools.getPrimaryPage().getIfPresent(".pxResults(<append>)");
nestedStepPage = embeddedPageProp == null ? null : embeddedPageProp.getPageValue();
}
PRStackFrame pz_StackFrame4_16_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_16 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_16_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_17_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_17_circum0");
}
PRStackFrame pz_StackFrame4_17_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_17 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_17_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_18_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("END_IT"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_18_circum0");
}
PRStackFrame pz_StackFrame4_18_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_18 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_18_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_18_circum0, false);
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
pz_CurrentStepNum = "4.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_0_circum0 definition

/**
 * SEPARATOR FALL OUT.
 * <p>
 * Step 4.1 <code>Java</code><br>
 */
public boolean step4_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleName==\"__PEGA__SEPARATOR__\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRuleName==\"__PEGA__SEPARATOR__\"", "FUAInstance-NullMyStepPage");
}
boolean pz_26 = (scalarValueQuery_25.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("__PEGA__SEPARATOR__"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleName==\"__PEGA__SEPARATOR__\"",pz_26);
if (!pz_26) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleName==\"__PEGA__SEPARATOR__\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
tools.getPrimaryPage().putString(".pxResults(<APPEND>).pyLabel","SEPARATOR");
tools.getPrimaryPage().putString(".pxResults(<LAST>).pzPageIcon","__PEGA__SEPARATOR__");
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
// branch to block END_IT
nextBlock = "END_IT";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_1_circum0 definition

/**
 * Step 4.2 <code>Property-Set</code><br>
 */
public boolean step4_2_circum0() {
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
    matchFound = false;
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
pz_CurrentStepNum = "4.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_2_circum0 definition

/**
 * loop thru each relevant record result and if result matches current nav page check if active RR.
 * <p>
 * Step 4.3.0 <code>Java</code> [on page RelevantRecord.pxResults] <br>
 */
public boolean step4_3_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.matchFound");
try {
boolean pz_27 = matchFound;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.matchFound",pz_27);
if (pz_27) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.matchFound " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleName==local.streamName");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRuleName==local.streamName", "FUAInstance-NullMyStepPage");
}
boolean pz_28 = (scalarValueQuery_25.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(streamName));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleName==local.streamName",pz_28);
if (!pz_28) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleName==local.streamName " + anyException.getMessage(), anyException);
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

// Code to call nested step 4_3_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.3.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_3_1_circum0");
}
PRStackFrame pz_StackFrame4_3_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_3_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_3_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_3_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_3_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.3.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_3_2_circum0");
}
ClipboardProperty pz_30 = propertyQuery_29.resolve(tools, pega.findPageWithException("RelevantRecord", "Data-Tag-RelevantRecord"), forEachCounter);
nestedStepPage = pz_30 == null ? null : pz_30.getPageValue();
PRStackFrame pz_StackFrame4_3_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_3_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_3_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_3_2_circum0, false);
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
pz_CurrentStepNum = "4.3.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_3_0_circum0 definition

/**
 * Mark match found.
 * <p>
 * Step 4.3.1 <code>Property-Set</code><br>
 */
public boolean step4_3_1_circum0() {
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
    matchFound = true;
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
pz_CurrentStepNum = "4.3.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_3_1_circum0 definition

/**
 * If is inactive jump to END_IT to skip add of page to results.
 * <p>
 * Step 4.3.2 <code>Java</code> [on page RelevantRecord.pxResults(<CURRENT>)] <br>
 */
public boolean step4_3_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxIsActive!=true");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxIsActive!=true", "FUAInstance-NullMyStepPage");
}
boolean pz_32 = (scalarValueQuery_31.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) != true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxIsActive!=true",pz_32);
if (pz_32) {
// branch to block END_IT
nextBlock = "END_IT";
pega.activityStepSkipped("Jump To Step");
return false;
} else {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxIsActive!=true " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "4.3.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step4_3_2_circum0 definition

/**
 * open each harness to save info into data page.
 * <p>
 * Step 4.4 <code>Obj-Open</code> [on page TempHarness] <br>
 */
public boolean step4_4_circum0() {
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
String pz_33 = "TempHarness";
myStepPage = tools.findPage(pz_33, true);
// Expression: 
// Expression: Rule-HTML-Harness
myStepPage = tools.getThread().createPage("Rule-HTML-Harness", pz_33);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyStreamName", pRef_34, myStepPage, streamName, "sIN", false, false);
}
{
    pega.setViaPropRef(".pyClassName", pRef_35, myStepPage, tools.getParamValue("UIPagesClassName"), "siN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "TempHarness", "", false, false);
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
boolean pz__2 = pega.invokeWhen("StepStatusFail", "Code-Pega-List", "Rule-HTML-Harness");
if (pz__2) {
// branch to block END_IT
nextBlock = "END_IT";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_4_circum0 definition

/**
 * set icon on harness only if not listview or landingpage (of type view).
 * <p>
 * Step 4.5 <code>Property-Set</code> [on page TempHarness] <br>
 */
public boolean step4_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pzPageIcon==\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pzPageIcon==\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_37 = (scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pzPageIcon==\"\"",pz_37);
if (!pz_37) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pzPageIcon==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pzPageIcon", pRef_38, myStepPage, "pi pi-headline", "sTN", false, true);
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
pz_CurrentStepNum = "4.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_5_circum0 definition

/**
 * set values need for access role privilege check.
 * <p>
 * Step 4.7 <code>Property-Set</code><br>
 */
public boolean step4_7_circum0() {
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
    tools.putParamValue("roleName", PropertyInfo.TYPE_TEXT, "PegaRULES:SysAdm4");
}
{
    tools.putParamValue("privilege", PropertyInfo.TYPE_TEXT, "pxUIPageAuthor");
}
{
    tools.putParamValue("IsPrivilegePresent", PropertyInfo.TYPE_TEXT, false);
}
{
    tools.putParamValue("accessToClass", PropertyInfo.TYPE_TEXT, "@baseclass");
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
pz_CurrentStepNum = "4.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_7_circum0 definition

/**
 * Loop through all available roles in access group and find if PegaRULES SysAdm4 role is present with the pxUIPageAuthor priv.
 * <p>
 * Step 4.9.0 <code>Property-Set</code><br>
 */
public boolean step4_9_0_circum0(ClipboardProperty currentProperty) {
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
    tools.putParamValue("roleName", PropertyInfo.TYPE_TEXT, currentProperty.getStringValue());
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

// Code to call nested step 4_9_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.9.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_9_1_circum0");
}
PRStackFrame pz_StackFrame4_9_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_9_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_9_1_circum0(currentProperty);
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_9_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 4_9_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4.9.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_9_2_circum0");
}
PRStackFrame pz_StackFrame4_9_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 4_9_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step4_9_2_circum0(currentProperty);
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame4_9_2_circum0, false);
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
pz_CurrentStepNum = "4.9.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_9_0_circum0 definition

/**
 * check current access role for pxUIPageAuthor privilege.
 * <p>
 * Step 4.9.1 <code>Call   Rule-Access-Role-Name.pzCheckIfRoleHasPrivilege</code><br>
 */
public boolean step4_9_1_circum0(ClipboardProperty currentProperty) {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call   Rule-Access-Role-Name.pzCheckIfRoleHasPrivilege");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call   Rule-Access-Role-Name.pzCheckIfRoleHasPrivilege", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call   Rule-Access-Role-Name.pzCheckIfRoleHasPrivilege
if (myStepPage == null) {
}
// Calling Activity : Rule-Access-Role-Name.pzCheckIfRoleHasPrivilege
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzCheckIfRoleHasPrivilege", "Code-Pega-List", "Rule-Access-Role-Name");
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
pz_CurrentStepNum = "4.9.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call   Rule-Access-Role-Name.pzCheckIfRoleHasPrivilege",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_9_1_circum0 definition

/**
 * Check dependent role if current access role is not having the privilege.
 * <p>
 * Step 4.9.2 <code>Call  Data-Admin-Operator-AccessGroup.pzCheckPrivilegeForRoleAndDependency</code><br>
 */
public boolean step4_9_2_circum0(ClipboardProperty currentProperty) {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call  Data-Admin-Operator-AccessGroup.pzCheckPrivilegeForRoleAndDependency");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.IsPrivilegePresent");
try {
boolean pz_39 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "IsPrivilegePresent");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.IsPrivilegePresent",pz_39);
if (pz_39) {
// branch to block SUPERUSER
nextBlock = "SUPERUSER";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.IsPrivilegePresent " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call  Data-Admin-Operator-AccessGroup.pzCheckPrivilegeForRoleAndDependency", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call  Data-Admin-Operator-AccessGroup.pzCheckPrivilegeForRoleAndDependency
if (myStepPage == null) {
}
// Calling Activity : Data-Admin-Operator-AccessGroup.pzCheckPrivilegeForRoleAndDependency
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzCheckPrivilegeForRoleAndDependency", "Code-Pega-List", "Data-Admin-Operator-AccessGroup");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.IsPrivilegePresent");
try {
boolean pz_40 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "IsPrivilegePresent");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.IsPrivilegePresent",pz_40);
if (pz_40) {
// branch to block SUPERUSER
nextBlock = "SUPERUSER";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.IsPrivilegePresent " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4.9.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call  Data-Admin-Operator-AccessGroup.pzCheckPrivilegeForRoleAndDependency",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_9_2_circum0 definition

/**
 * temp priv page.
 * <p>
 * Step 4.10 [NOTPRIV] <code>Page-New</code> [on page PagePrivilege] <br>
 */
public boolean step4_10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.IsPrivilegePresent");
try {
boolean pz_41 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "IsPrivilegePresent");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.IsPrivilegePresent",pz_41);
if (pz_41) {
// branch to block SUPERUSER
nextBlock = "SUPERUSER";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.IsPrivilegePresent " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_42 = "PagePrivilege";
myStepPage = tools.findPage(pz_42, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Rule-Access-Privilege","PagePrivilege",false); 
// primary page will not be added to PageList
	 pega.setStepPage("PagePrivilege", myStepPage);
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
pz_CurrentStepNum = "4.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_10_circum0 definition

/**
 * set key props for opening priv.
 * <p>
 * Step 4.11 <code>Property-Set</code> [on page PagePrivilege] <br>
 */
public boolean step4_11_circum0() {
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
    pega.setViaPropRef(".pyPrivilegeName", pRef_43, myStepPage, ((scalarValueQuery_44.resolveToString(tools, pega.findPageWithException("TempHarness", "Rule-HTML-Harness"), ImmutablePropertyInfo.TYPE_TEXT) + "_") + scalarValueQuery_25.resolveToString(tools, pega.findPageWithException("TempHarness", "Rule-HTML-Harness"), ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyClassName", pRef_35, myStepPage, "Data-Portal", "siN", false, true);
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
pz_CurrentStepNum = "4.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_11_circum0 definition

/**
 * default value to be blank.
 * <p>
 * Step 4.12 <code>Property-Set</code> [on page TempHarness] <br>
 */
public boolean step4_12_circum0() {
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
    pega.setViaPropRef(".pyPrivilegeForHarness", pRef_45, myStepPage, "", "sTN", false, true);
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
pz_CurrentStepNum = "4.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_12_circum0 definition

/**
 * set pyPrivilegeForHarness if the privilege exists.
 * <p>
 * Step 4.13 <code>Property-Set</code> [on page TempHarness] <br>
 */
public boolean step4_13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxDoesObjectExist(PagePrivilege)");
try {
boolean pz_46 = (pega.<Boolean>resolveMethodCall("pxDoesObjectExist--(ClipboardPage)", "pxDoesObjectExist", null, null, new Object[] { pega.findPage("PagePrivilege", "Rule-Access-Privilege") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxDoesObjectExist(PagePrivilege)",pz_46);
if (!pz_46) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxDoesObjectExist(PagePrivilege) " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyPrivilegeForHarness", pRef_45, myStepPage, ((scalarValueQuery_44.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "_") + scalarValueQuery_25.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
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
pz_CurrentStepNum = "4.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_13_circum0 definition

/**
 * Step 4.14 [SUPERUSER] <code>Property-Set</code><br>
 */
public boolean step4_14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.IsPrivilegePresent");
try {
boolean pz_47 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "IsPrivilegePresent");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.IsPrivilegePresent",pz_47);
if (!pz_47) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.IsPrivilegePresent " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyPrivilegeForHarness", pRef_45, myStepPage, "", "sTN", false, true);
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
pz_CurrentStepNum = "4.14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_14_circum0 definition

/**
 * Parse activity and data transform params.
 * <p>
 * Step 4.15 <code>Java</code> [on page TempHarness] <br>
 */
public boolean step4_15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
boolean isParamPresent = false;
com.google.gson.JsonObject jsonObject = null;
ClipboardProperty actionPage = myStepPage.getIfPresent("pyActionAPI");
if (actionPage != null) {
  //--------------------- Activity params parsing
  ClipboardProperty cpParameters = actionPage.getPageValue().getIfPresent("pyActivityParams");
  if(cpParameters != null){
    java.util.Iterator cpIter = cpParameters.iterator();
    jsonObject = new com.google.gson.JsonObject();
    while(cpIter.hasNext()) {
      ClipboardProperty cpProp = (ClipboardProperty)cpIter.next();
      ClipboardPage cpPage = cpProp.getPageValue();
      String strParamName = cpPage.getString("pyName");
      String strParamValue = cpPage.getString("pyValue");
      jsonObject.addProperty(strParamName, strParamValue.replace("\"", ""));
      isParamPresent = true;
    }
    if (isParamPresent) {
      myStepPage.putString("pyActivityParamsForShowHarness",jsonObject.toString());
    }
  }

  //------------------ Data transform params parsing
  ClipboardProperty dtParams = actionPage.getPageValue().getIfPresent("pyPreDataTransform");
  isParamPresent = false;
  jsonObject = null;
  if (dtParams != null) { 
    String dataTransformName = dtParams.getPageValue().getString("pyName");
    if (!dataTransformName.isEmpty()) {
      cpParameters = actionPage.getPageValue().getIfPresent("pyDataTransformParams");
      if(cpParameters != null){
        java.util.Iterator cpIter = cpParameters.iterator();
        jsonObject = new com.google.gson.JsonObject();
        while(cpIter.hasNext()) {
          ClipboardProperty cpProp = (ClipboardProperty)cpIter.next();
          ClipboardPage cpPage = cpProp.getPageValue();
          String strParamName = cpPage.getString("pyName");
          String strParamValue = cpPage.getString("pyValue");
          jsonObject.addProperty(strParamName, strParamValue.replace("\"", ""));
          isParamPresent = true;
        }
        if (isParamPresent) {
          myStepPage.putString("pyDTParamsForShowHarness",jsonObject.toString());
        }
      }
    }
  }
}
/* BUG-445575 localize pyLabel */
myStepPage.putString(".pyLabel", tools.getLocalizedTextForString("pyCaption", myStepPage.getString(".pyLabel")));
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
pz_CurrentStepNum = "4.15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_15_circum0 definition

/**
 * Merge the harness only if its active relevant record.
 * <p>
 * Step 4.16 <code>Page-Merge-Into</code> [on page Primary.pxResults(<APPEND>)] <br>
 */
public boolean step4_16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Merge-Into");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Merge-Into", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Merge-Into
// Keep from parameter is : 
ClipboardPage mergePage;
if (tools.getPrimaryPage() == null) {
myStepPage = null;
} else { 
ClipboardProperty embeddedPageProp = tools.getPrimaryPage().getIfPresent(".pxResults(<append>)");
myStepPage = embeddedPageProp == null ? null : embeddedPageProp.getPageValue();
}
// putAll from page : TempHarness
// Expression: TempHarness
mergePage = tools.findPage("TempHarness", true);
if (mergePage == null) {
// do nothing
} else if (myStepPage == null) {
myStepPage = pega.setStepPage(".pxResults(<append>)", mergePage);
} else {
myStepPage.putAll(mergePage, ClipboardPage.PUTALL_KEEPOLD);
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
pz_CurrentStepNum = "4.16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Merge-Into",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_16_circum0 definition

/**
 * Step 4.17 <code>Page-Remove</code><br>
 */
public boolean step4_17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: PagePrivilege
pageRemove(tools.findPage("PagePrivilege"));
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
pz_CurrentStepNum = "4.17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_17_circum0 definition

/**
 * exit iteration when Obj-open fails.
 * <p>
 * Step 4.18 [END_IT] <code>Java</code><br>
 */
public boolean step4_18_circum0() {
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
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "4.18";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_18_circum0 definition

/**
 * Step 5.0 <code>Java</code> [on page Primary.pxResults] <br>
 */
public boolean step5_0_circum0() {
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

// Code to call nested step 5_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_1_circum0");
}
PRStackFrame pz_StackFrame5_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT Step: 5_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step5_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame5_1_circum0, false);
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
pz_CurrentStepNum = "5.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_0_circum0 definition

/**
 * Step 5.1 <code>Property-Set</code><br>
 */
public boolean step5_1_circum0() {
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
    pega.setViaPropRef(".pyReference", pRef_50, myStepPage, pega.<String>resolveMethodCall("pxGetStepPageReference--()", "pxGetStepPageReference", null, null, new Object[] {}), "sTN", false, true);
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
pz_CurrentStepNum = "5.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_1_circum0 definition

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

public String roleNameToCheck = "";
public String privilegeToCheck = "";
public boolean matchFound = false;
public String className = "";
public String streamName = "";

public void initializeUserLocalVariables() {
	roleNameToCheck = "";
	privilegeToCheck = "";
	matchFound = false;
	className = "";
	streamName = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("roleNameToCheck", (roleNameToCheck == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : roleNameToCheck.toString());
	smRetVal.putString("privilegeToCheck", (privilegeToCheck == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : privilegeToCheck.toString());
	smRetVal.putString("matchFound", Boolean.toString(matchFound));
	smRetVal.putString("className", (className == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : className.toString());
	smRetVal.putString("streamName", (streamName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : streamName.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_34 = new String[] { "", "", "pyStreamName", "" };
public static final String[] pRef_43 = new String[] { "", "", "pyPrivilegeName", "" };
public static final String[] pRef_35 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_38 = new String[] { "", "", "pzPageIcon", "" };
public static final String[] pRef_45 = new String[] { "", "", "pyPrivilegeForHarness", "" };
public static final String[] pRef_50 = new String[] { "", "", "pyReference", "" };
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().scalarProperty("pxIsActive").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_25 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pyStreamName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().scalarProperty("pzPageIcon").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_44 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_29 = FUAUtil.createQueryBuilder().pageList("pxResults").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pyProductVersion").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEDYNAMICNAVIGATIONPAGES #20200818T193102.041 GMT", "Code-Pega-List pzPopulateDynamicNavigationPages", "Pega-UIEngine", "08-06-01", false, true, "", "ACTIVITY", "20200818T193102.041 GMT" ,"Rule-Obj-Activity"); }
