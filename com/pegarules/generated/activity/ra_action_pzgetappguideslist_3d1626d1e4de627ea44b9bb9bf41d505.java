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
public class ra_action_pzgetappguideslist_3d1626d1e4de627ea44b9bb9bf41d505 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzGetAppGuidesList.Code_Pega_List.Action");
	public ra_action_pzgetappguideslist_3d1626d1e4de627ea44b9bb9bf41d505(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT	Pega-AppDefinition:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT";
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
if(nextBlock.equals("")) { 
ClipboardProperty pz_3 = pega.findPageWithException("Application", "Rule-Application").getIfPresent("pyGuides");
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
pz_CurrentStepNum = "1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_circum0");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_5 = "GuidesWOPage";
thisStepPage = tools.findPage(pz_5, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("portal"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_0_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Guides"))) {
nextBlock = "";
ClipboardProperty pz_11 = pega.findPageWithException("Application", "Rule-Application").getIfPresent("pyGuides");
pageRef = pz_11;
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
{
if (pz_Status == true && (nextBlock.equals("") || nextBlock.equals("Guides"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_0_circum0");
}
PRStackFrame pz_StackFrame9_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_0 Circum: 0" );
try {
pz_Status = step9_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 10_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Err"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_circum0");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 12_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Remove"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
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
	"Rule-Obj-Activity:PZGETAPPGUIDESLIST"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETAPPGUIDESLIST","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-AppDefinition","08-05-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT","!PZGETAPPGUIDESLIST",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",800824236)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT:20200514T025150.662 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "d240a88a33ff86e0d1cfa96b8e3a06b3";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Action";
}
/**
 * CSV of Guides associated with application.
 * <p>
 * Step 1 <code>Property-Set</code> [on page Application.pyGuides] <br>
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
    tools.putParamValue("AppGuides", PropertyInfo.TYPE_TEXT, ((tools.getParamValue("AppGuides").equals("")) ? (("\"" + scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + "\"") : (((tools.getParamValue("AppGuides") + ",\"") + scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + "\"")));
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
 * Create page for Guides data.
 * <p>
 * Step 2 <code>Page-New</code> [on page GuidesWOPage] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.AppGuides==\"\"");
try {
boolean pz_6 = (tools.getParamValue("AppGuides").equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.AppGuides==\"\"",pz_6);
if (pz_6) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzGetAppGuidesList - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.AppGuides==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_7 = "GuidesWOPage";
myStepPage = tools.findPage(pz_7, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","GuidesWOPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("GuidesWOPage", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Set properties for pzGetAppGuidesWO RD.
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
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "pzGetAppGuidesWO");
}
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Pega-Application-Guide-Work");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "GuidesWOPage");
}
{
    tools.putParamValue("pySkipSummaryProcessing", PropertyInfo.TYPE_TEXT, true);
}
{
    tools.putParamValue("ProductName", PropertyInfo.TYPE_TEXT, scalarValueQuery_8.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("ProductVersion", PropertyInfo.TYPE_TEXT, scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT));
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
 * CallpzGetAppGuidesWO RD.
 * <p>
 * Step 4 <code>Call pxCallRetrieveReportData</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxCallRetrieveReportData");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxCallRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxCallRetrieveReportData
if (myStepPage == null) {
}
// Calling Activity : pxCallRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxCallRetrieveReportData", "Code-Pega-List", "");
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
boolean pz__1 = pega.invokeWhen("StepStatusFail", "Code-Pega-List", "Code-Pega-List");
if (pz__1) {
// branch to block Err
nextBlock = "Err";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxCallRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Set properties for pzGetAppGuidesList RD.
 * <p>
 * Step 5 <code>Property-Set</code><br>
 */
public boolean step5_circum0() {
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
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "pzGetAppGuidesList");
}
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Rule-Application-Guide");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "GuidesPage");
}
{
    tools.putParamValue("pySkipSummaryProcessing", PropertyInfo.TYPE_TEXT, true);
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
 * Call pzGetAppGuidesList RD.
 * <p>
 * Step 6 <code>Call pxCallRetrieveReportData</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxCallRetrieveReportData");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxCallRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxCallRetrieveReportData
if (myStepPage == null) {
}
// Calling Activity : pxCallRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxCallRetrieveReportData", "Code-Pega-List", "");
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
boolean pz__3 = pega.invokeWhen("StepStatusFail", "Code-Pega-List", "Code-Pega-List");
if (pz__3) {
// branch to block Err
nextBlock = "Err";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxCallRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Check if pega express.
 * <p>
 * Step 7 [portal] <code>Property-Set</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__5 = pega.invokeWhen("pzIsPegaExpress", "Code-Pega-List", "Code-Pega-List");
if (!pz__5) {
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
{
    CurrentPortal = "pxExpress";
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
boolean pz__7 = pega.invokeWhen("Always", "Code-Pega-List", "Code-Pega-List");
if (pz__7) {
// branch to block Guides
nextBlock = "Guides";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Other portals.
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
    CurrentPortal = scalarValueQuery_10.resolveToString(tools, pega.findPageWithException("pxThread", "Code-Pega-Thread"), ImmutablePropertyInfo.TYPE_TEXT);
}
{
    CurrentPortal = ((CurrentPortal.equals("Developer")) ? CurrentPortal : pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, null, new Object[] { CurrentPortal }));
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
 * Loop through guides in APP.
 * <p>
 * Step 9.0 [Guides] <code>Property-Set</code> [on page Application.pyGuides] <br>
 */
public boolean step9_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(.pyLabel,\"pxApplicationSecurityChecklist\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@equals(.pyLabel,\"pxApplicationSecurityChecklist\")", "FUAInstance-NullMyStepPage");
}
boolean pz_12 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pxApplicationSecurityChecklist" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pyLabel,\"pxApplicationSecurityChecklist\")",pz_12);
if (!pz_12) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(.pyLabel,\"pxApplicationSecurityChecklist\") " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
boolean pz__9 = pega.invokeWhen("pzIsSecurityAdministrator", "Code-Pega-List", "Embed-Guide");
if (!pz__9) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    WOIndex = (pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", null, null, new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyGuideID", pega.findPageWithException("GuidesWOPage", "Code-Pega-List").getProperty("pxResults") })).intValue();
}
{
    Index = (pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", null, null, new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyPurpose", pega.findPageWithException("GuidesPage", "Code-Pega-List").getProperty("pxResults") })).intValue();
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

// Code to call nested step 9_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_1_circum0");
}
String pz_13 = "TempGuide";
nestedStepPage = tools.findPage(pz_13, true);
PRStackFrame pz_StackFrame9_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_2_circum0");
}
PRStackFrame pz_StackFrame9_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_3_circum0");
}
String pz_14 = "TempGuide";
nestedStepPage = tools.findPage(pz_14, true);
PRStackFrame pz_StackFrame9_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_4_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("UPDATE"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_4_circum0");
}
String pz_15 = "TempGuide";
nestedStepPage = tools.findPage(pz_15, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_15, false);
nestedStepPage.putString("pxObjClass", "Pega-Application-Guide-Work");
}
PRStackFrame pz_StackFrame9_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_5_circum0");
}
String pz_16 = "TempGuide";
nestedStepPage = tools.findPage(pz_16, true);
PRStackFrame pz_StackFrame9_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_6_circum0");
}
String pz_17 = "TempGuide";
nestedStepPage = tools.findPage(pz_17, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_17, false);
nestedStepPage.putString("pxObjClass", "Pega-Application-Guide-Work");
}
PRStackFrame pz_StackFrame9_6_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SET"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_7_circum0");
}
PRStackFrame pz_StackFrame9_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_8_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Compare"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_8_circum0");
}
PRStackFrame pz_StackFrame9_8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_9_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("New"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_9_circum0");
}
PRStackFrame pz_StackFrame9_9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_10_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("COPY1"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_10_circum0");
}
PRStackFrame pz_StackFrame9_10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_11_circum0");
}
PRStackFrame pz_StackFrame9_11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_12_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Error"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_12_circum0");
}
String pz_18 = "TempGuide";
nestedStepPage = tools.findPage(pz_18, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_18, false);
nestedStepPage.putString("pxObjClass", "Pega-Application-Guide-Work");
}
PRStackFrame pz_StackFrame9_12_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 9_13_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_13_circum0");
}
String pz_19 = "TempGuide";
nestedStepPage = tools.findPage(pz_19, true);
PRStackFrame pz_StackFrame9_13_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT Step: 9_13 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step9_13_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame9_13_circum0, false);
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
pz_CurrentStepNum = "9.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_0_circum0 definition

/**
 * create new temp guide page.
 * <p>
 * Step 9.1 <code>Page-New</code> [on page TempGuide] <br>
 */
public boolean step9_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.Index&gt;0");
try {
boolean pz_20 = (Index > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.Index&gt;0",pz_20);
if (!pz_20) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.Index&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_21 = "TempGuide";
myStepPage = tools.findPage(pz_21, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Pega-Application-Guide-Work","TempGuide",false); 
// primary page will not be added to PageList
	 pega.setStepPage("TempGuide", myStepPage);
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
pz_CurrentStepNum = "9.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_1_circum0 definition

/**
 * Set Guide Ins key and other params to be passed to pzcreateGuide and pzUpdateGuide.
 * <p>
 * Step 9.2 <code>Property-Set</code><br>
 */
public boolean step9_2_circum0() {
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
    tools.putParamValue("GuideInsKey", PropertyInfo.TYPE_TEXT, scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("GuidesPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, Index));
}
{
    tools.putParamValue("CopyToPage", PropertyInfo.TYPE_TEXT, "TempGuide");
}
{
    isPortalAvailable = false;
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
pz_CurrentStepNum = "9.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_2_circum0 definition

/**
 * call activity pzCreateGuide when no work object is present.
 * <p>
 * Step 9.3 <code>Call pzCreateGuide</code> [on page TempGuide] <br>
 */
public boolean step9_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateGuide");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.WOIndex&lt;0");
try {
boolean pz_23 = (WOIndex < 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.WOIndex&lt;0",pz_23);
if (!pz_23) {
// branch to block UPDATE
nextBlock = "UPDATE";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.WOIndex&lt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzCreateGuide", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzCreateGuide
if (myStepPage == null) {
String pz_24 = "TempGuide";
myStepPage = tools.findPage(pz_24, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_24, false);
myStepPage.putString("pxObjClass", "Pega-Application-Guide-Work");
}
}
// Calling Activity : pzCreateGuide
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzCreateGuide", "Code-Pega-List", "");
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
boolean pz__11 = pega.invokeWhen("StepStatusFail", "Code-Pega-List", "Pega-Application-Guide-Work");
if (pz__11) {
// branch to block Error
nextBlock = "Error";
return false;
} else {
// branch to block Compare
nextBlock = "Compare";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "9.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateGuide",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step9_3_circum0 definition

/**
 * Set guide work object inskey to be passed to UpdateGuide.
 * <p>
 * Step 9.4 [UPDATE] <code>Property-Set</code> [on page TempGuide] <br>
 */
public boolean step9_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.WOIndex&gt;0");
try {
boolean pz_25 = (WOIndex > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.WOIndex&gt;0",pz_25);
if (!pz_25) {
// branch to block Compare
nextBlock = "Compare";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.WOIndex&gt;0 " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(GuidesPage.pxResults(Local.Index).pzInsKey,GuidesWOPage.pxResults(Local.WOIndex).pyGuideInsKey)");
try {
boolean pz_27 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("GuidesPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, Index), scalarValueQuery_26.resolveToString(tools, pega.findPageWithException("GuidesWOPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, WOIndex) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(GuidesPage.pxResults(Local.Index).pzInsKey,GuidesWOPage.pxResults(Local.WOIndex).pyGuideInsKey)",pz_27);
if (!pz_27) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(GuidesPage.pxResults(Local.Index).pzInsKey,GuidesWOPage.pxResults(Local.WOIndex).pyGuideInsKey) " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@CompareDates(GuidesPage.pxResults(Local.Index).pxUpdateDateTime,GuidesWOPage.pxResults(Local.WOIndex).pyGuideUpdateDateTime)");
try {
boolean pz_30 = (pega.<Boolean>resolveMethodCall("CompareDates--(String,String)", "CompareDates", null, null, new Object[] { scalarValueQuery_28.resolveToString(tools, pega.findPageWithException("GuidesPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_DATETIME, Index), scalarValueQuery_29.resolveToString(tools, pega.findPageWithException("GuidesWOPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_DATETIME, WOIndex) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@CompareDates(GuidesPage.pxResults(Local.Index).pxUpdateDateTime,GuidesWOPage.pxResults(Local.WOIndex).pyGuideUpdateDateTime)",pz_30);
if (!pz_30) {
// branch to block SET
nextBlock = "SET";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@CompareDates(GuidesPage.pxResults(Local.Index).pxUpdateDateTime,GuidesWOPage.pxResults(Local.WOIndex).pyGuideUpdateDateTime) " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("GuideWOInsKey", PropertyInfo.TYPE_TEXT, scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("GuidesWOPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, WOIndex));
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
pz_CurrentStepNum = "9.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_4_circum0 definition

/**
 * update guide will be copying latest tasks and chapters.
 * <p>
 * Step 9.5 <code>Call pzUpdateGuide</code> [on page TempGuide] <br>
 */
public boolean step9_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzUpdateGuide");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzUpdateGuide", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzUpdateGuide
if (myStepPage == null) {
String pz_31 = "TempGuide";
myStepPage = tools.findPage(pz_31, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_31, false);
myStepPage.putString("pxObjClass", "Pega-Application-Guide-Work");
}
}
// Calling Activity : pzUpdateGuide
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzUpdateGuide", "Code-Pega-List", "");
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
boolean pz__13 = pega.invokeWhen("StepStatusFail", "Code-Pega-List", "Pega-Application-Guide-Work");
if (pz__13) {
// branch to block Error
nextBlock = "Error";
return false;
}
boolean pz__15 = pega.invokeWhen("hasMessages", "Code-Pega-List", "Pega-Application-Guide-Work");
if (pz__15) {
// branch to block Error
nextBlock = "Error";
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.IsUpdated==\"false\"");
try {
boolean pz_32 = (tools.getParamValue("IsUpdated").equals("false"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.IsUpdated==\"false\"",pz_32);
if (pz_32) {
// branch to block SET
nextBlock = "SET";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.IsUpdated==\"false\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "9.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzUpdateGuide",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_5_circum0 definition

/**
 * set guide values.
 * <p>
 * Step 9.6 <code>Property-Set</code> [on page TempGuide] <br>
 */
public boolean step9_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(" + WOIndex + ").pyTaskCount", new String[] { "", "", "pxResults", String.valueOf(WOIndex), "pyTaskCount", "" }, pega.findPageWithException("GuidesWOPage", "Code-Pega-List"), scalarValueQuery_33.resolveToString(tools, pega.findPageWithException("TempGuide", "Pega-Application-Guide-Work"), ImmutablePropertyInfo.TYPE_INTEGER), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + WOIndex + ").pyTaskProgress", new String[] { "", "", "pxResults", String.valueOf(WOIndex), "pyTaskProgress", "" }, pega.findPageWithException("GuidesWOPage", "Code-Pega-List"), scalarValueQuery_34.resolveToString(tools, pega.findPageWithException("TempGuide", "Pega-Application-Guide-Work"), ImmutablePropertyInfo.TYPE_DOUBLE), "sEN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + WOIndex + ").pyLabel", new String[] { "", "", "pxResults", String.valueOf(WOIndex), "pyLabel", "" }, pega.findPageWithException("GuidesWOPage", "Code-Pega-List"), scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("TempGuide", "Pega-Application-Guide-Work"), ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
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
boolean pz__17 = true;
if (pz__17) {
// branch to block Compare
nextBlock = "Compare";
return false;
} else {
// branch to block Compare
nextBlock = "Compare";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "9.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step9_6_circum0 definition

/**
 * set pytaskprogress.
 * <p>
 * Step 9.7 [SET] <code>Property-Set</code><br>
 */
public boolean step9_7_circum0() {
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
    pega.setViaPropRef(".pxResults(" + WOIndex + ").pyTaskProgress", new String[] { "", "", "pxResults", String.valueOf(WOIndex), "pyTaskProgress", "" }, pega.findPageWithException("GuidesWOPage", "Code-Pega-List"), pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("round--(BigDecimal)", "round", null, null, new Object[] { scalarValueQuery_35.resolveToBigDecimal(tools, pega.findPageWithException("GuidesWOPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_DECIMAL, WOIndex) }).doubleValue(), "sEN", false, true);
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
pz_CurrentStepNum = "9.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_7_circum0 definition

/**
 * If current portal is designer studio or express check for old guides.
 * <p>
 * Step 9.8 [Compare] <code>Property-Set</code><br>
 */
public boolean step9_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.CurrentPortal==\"Developer\" || Local.CurrentPortal ==\"pxExpress\"");
try {
boolean pz_36 = ((CurrentPortal.equals("Developer")) || (CurrentPortal.equals("pxExpress")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.CurrentPortal==\"Developer\" || Local.CurrentPortal ==\"pxExpress\"",pz_36);
if (!pz_36) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.CurrentPortal==\"Developer\" || Local.CurrentPortal ==\"pxExpress\" " + anyException.getMessage(), anyException);
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
    GuideIndex = ((CurrentPortal.equals("pxExpress")) ? (pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", null, null, new Object[] { "pxExpress", "pyDisplayText", myStepPage.getProperty("pzPortalsList") })).intValue() : 0);
}
{
    GuideIndex = ((CurrentPortal.equals("Developer")) ? (pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", null, null, new Object[] { "Developer", "pyDisplayText", myStepPage.getProperty("pzPortalsList") })).intValue() : GuideIndex);
}
{
    isPortalAvailable = tools.interpretBoolean((((GuideIndex > 0) && (scalarValueQuery_37.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE, GuideIndex) == tools.interpretBoolean("true"))) ? "true" : "false"));
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.isPortalAvailable==\"true\"");
try {
boolean pz_38 = (isPortalAvailable == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.isPortalAvailable==\"true\"",pz_38);
if (pz_38) {
// branch to block COPY1
nextBlock = "COPY1";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.isPortalAvailable==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "9.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_8_circum0 definition

/**
 * Other guides.
 * <p>
 * Step 9.9 [New] <code>Property-Set</code><br>
 */
public boolean step9_9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@IndexInPageList(Local.CurrentPortal,\"pyDisplayText\",.pzPortalsList)&gt;0");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@IndexInPageList(Local.CurrentPortal,\"pyDisplayText\",.pzPortalsList)>0", "FUAInstance-NullMyStepPage");
}
boolean pz_39 = ((pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", null, null, new Object[] { CurrentPortal, "pyDisplayText", myStepPage.getProperty("pzPortalsList") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@IndexInPageList(Local.CurrentPortal,\"pyDisplayText\",.pzPortalsList)&gt;0",pz_39);
if (!pz_39) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@IndexInPageList(Local.CurrentPortal,\"pyDisplayText\",.pzPortalsList)&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    isPortalAvailable = true;
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
pz_CurrentStepNum = "9.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_9_circum0 definition

/**
 * And copy in case guide WO creation.
 * <p>
 * Step 9.10 [COPY1] <code>Page-Copy</code><br>
 */
public boolean step9_10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.isPortalAvailable==true");
try {
boolean pz_40 = (isPortalAvailable == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.isPortalAvailable==true",pz_40);
if (!pz_40) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.isPortalAvailable==true " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.WOIndex&lt;0");
try {
boolean pz_41 = (WOIndex < 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.WOIndex&lt;0",pz_41);
if (!pz_41) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.WOIndex&lt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: TempGuide
sourcePage = tools.findPage("TempGuide", true);
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_42 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_42;
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__18 = true;
if (pz__18) {
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
pz_CurrentStepNum = "9.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step9_10_circum0 definition

/**
 * OR copy in existing guide WO.
 * <p>
 * Step 9.11 <code>Page-Copy</code><br>
 */
public boolean step9_11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.isPortalAvailable==true");
try {
boolean pz_43 = (isPortalAvailable == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.isPortalAvailable==true",pz_43);
if (!pz_43) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.isPortalAvailable==true " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.WOIndex&gt;0");
try {
boolean pz_44 = (WOIndex > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.WOIndex&gt;0",pz_44);
if (!pz_44) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.WOIndex&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: GuidesWOPage.pxResults(Local.WOIndex)
ClipboardPage pz_46 = pageQuery_45.resolve(tools, pega.findPageWithException("GuidesWOPage", "Code-Pega-List"), WOIndex);
sourcePage = pz_46;
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_47 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_47;
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__19 = true;
if (pz__19) {
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
pz_CurrentStepNum = "9.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step9_11_circum0 definition

/**
 * Set error on property.
 * <p>
 * Step 9.12 [Error] <code>Property-Set</code> [on page TempGuide] <br>
 */
public boolean step9_12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__20 = pega.invokeWhen("hasMessages", "Code-Pega-List", "Pega-Application-Guide-Work");
if (!pz__20) {
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
{
    pega.setViaPropRef(".pzErrorMessage", pRef_48, pega.findPageWithException("D_pzGuide", "Pega-Application-Guide-Work"), ((scalarValueQuery_49.resolveToString(tools, pega.findPageWithException("D_pzGuide", "Pega-Application-Guide-Work"), ImmutablePropertyInfo.TYPE_TEXT).equals("")) ? pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { pega.<String>resolveMethodCall("getMessagesAll--(Page)", "getMessagesAll", null, null, new Object[] { pega.findPage("TempGuide", "Pega-Application-Guide-Work") }), "pyMessageLabel", tools }) : ((scalarValueQuery_49.resolveToString(tools, pega.findPageWithException("D_pzGuide", "Pega-Application-Guide-Work"), ImmutablePropertyInfo.TYPE_TEXT) + "") + pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { pega.<String>resolveMethodCall("getMessagesAll--(Page)", "getMessagesAll", null, null, new Object[] { pega.findPage("TempGuide", "Pega-Application-Guide-Work") }), "pyMessageLabel", tools }))), "sTN", false, true);
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
pz_CurrentStepNum = "9.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_12_circum0 definition

/**
 * Remove tempguide page.
 * <p>
 * Step 9.13 [PR] <code>Page-Remove</code> [on page TempGuide] <br>
 */
public boolean step9_13_circum0() {
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
pz_CurrentStepNum = "9.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_13_circum0 definition

/**
 * Set error on property.
 * <p>
 * Step 10 [Err] <code>Property-Set</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__22 = pega.invokeWhen("hasMessages", "Code-Pega-List", "Code-Pega-List");
if (!pz__22) {
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
{
    pega.setViaPropRef(".pzErrorMessage", pRef_48, pega.findPageWithException("D_pzGuide", "Pega-Application-Guide-Work"), pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { pega.<String>resolveMethodCall("getMessagesAll--(Page)", "getMessagesAll", null, null, new Object[] { tools.getPrimaryPage() }), "pyMessageLabel", tools }), "sTN", false, true);
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
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Set count.
 * <p>
 * Step 11 <code>Property-Set</code><br>
 */
public boolean step11_circum0() {
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
    pega.setViaPropRef(".pxResultCount", pRef_50, myStepPage, (pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { tools.getPrimaryPage().getProperty("pxResults") })).intValue(), "sNY", false, true);
}
{
    pega.setViaPropRef(".pyRetainPage", pRef_51, myStepPage, true, "sSN", false, true);
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
pz_CurrentStepNum = "11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Remove temp page.
 * <p>
 * Step 12 [Remove] <code>Page-Remove</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: GuidesWOPage
pageRemove(tools.findPage("GuidesWOPage"));
// Expression: GuidesPage
pageRemove(tools.findPage("GuidesPage"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

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

public String CurrentPortal = "";
public int GuideIndex = 0;
public int Index = 0;
public boolean isPortalAvailable = false;
public int WOIndex = 0;

public void initializeUserLocalVariables() {
	CurrentPortal = "";
	GuideIndex = 0;
	Index = 0;
	isPortalAvailable = false;
	WOIndex = 0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("CurrentPortal", (CurrentPortal == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : CurrentPortal.toString());
	smRetVal.putString("GuideIndex", Integer.toString(GuideIndex));
	smRetVal.putString("Index", Integer.toString(Index));
	smRetVal.putString("isPortalAvailable", Boolean.toString(isPortalAvailable));
	smRetVal.putString("WOIndex", Integer.toString(WOIndex));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_48 = new String[] { "", "", "pzErrorMessage", "" };
public static final String[] pRef_51 = new String[] { "", "", "pyRetainPage", "" };
public static final String[] pRef_50 = new String[] { "", "", "pxResultCount", "" };
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pxPortal").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_37 = FUAUtil.createQueryBuilder().pageList("pzPortalsList").scalarProperty("pyIsSelected").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyGuideInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().scalarProperty("pyTaskProgress").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_28 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pxUpdateDateTime").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().scalarProperty("pzErrorMessage").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarList("pyDecimalValue", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyProductVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_33 = FUAUtil.createQueryBuilder().scalarProperty("pyTaskCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyGuideUpdateDateTime").buildScalarValueQuery();
private static final PageQuery pageQuery_45 = FUAUtil.createQueryBuilder().pageList("pxResults").buildPageQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZGETAPPGUIDESLIST #20200514T025150.662 GMT", "Code-Pega-List pzGetAppGuidesList", "Pega-AppDefinition", "08-05-01", false, true, "", "ACTIVITY", "20200514T025150.662 GMT" ,"Rule-Obj-Activity"); }
