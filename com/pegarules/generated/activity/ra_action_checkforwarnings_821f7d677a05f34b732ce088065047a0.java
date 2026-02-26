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
public class ra_action_checkforwarnings_821f7d677a05f34b732ce088065047a0 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.CheckForWarnings.Rule_Declare_Pages.Action");
	public ra_action_checkforwarnings_821f7d677a05f34b732ce088065047a0(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT	Pega-ProcessArchitect:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
ClipboardProperty pz_8 = pzPrimPage.getIfPresent("pyDataSourceList");
pageRef = pz_8;
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
pz_CurrentStepNum = "2.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_0_circum0");
}
PRStackFrame pz_StackFrame2_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 2_0 Circum: 0" );
try {
pz_Status = step2_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_0_circum0, false);
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
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
ClipboardProperty pz_28 = pzPrimPage.getIfPresent("pyDataSourceList");
pageRef = pz_28;
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 4 Circum: 0" );
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
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
ClipboardProperty pz_30 = pzPrimPage.getIfPresent("pyDataPageSaveOptionList");
pageRef = pz_30;
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
pz_CurrentStepNum = "5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_circum0");
}
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("WHEN_WARN"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 8 Circum: 0" );
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
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
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
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pyDataSourceList", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_39 = pzPrimPage.getIfPresent("pyDataSourceList");
pageRef = pz_39;
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
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 12 Circum: 0" );
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
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 17_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_54 = "CheckForDuplicates";
thisStepPage = tools.findPage(pz_54, true);
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 17 Circum: 0" );
try {
pz_Status = step17_circum0();
} finally {
pega.popStackFrame(pz_StackFrame17_circum0, false);
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
	"Rule-Obj-Activity:CHECKFORWARNINGS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("CHECKFORWARNINGS","Rule-Obj-Activity","RULE-DECLARE-PAGES",false,"","Pega-ProcessArchitect","08-07-01","RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT","!CHECKFORWARNINGS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1439243128)
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
//	RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT:20210819T145056.618 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "81f62f2841acbbf369909240a3ad0c7f";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Declare-Pages";
	}
public String getAspect() {
return "Action";
}
/**
 * Add deprecation warning if thread family is selected.
 * <p>
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyScope==\"threadfamily\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyScope==\"threadfamily\"", "FUAInstance-NullMyStepPage");
}
boolean pz_7 = (scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("threadfamily"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyScope==\"threadfamily\"",pz_7);
if (!pz_7) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyScope==\"threadfamily\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(tools.getStepPage().getProperty("pyScope"),"pzThreadFamilyIsDeprecated",null);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Iterating over list of data sources.
 * <p>
 * Step 2.0 <code>Java</code> [on page .pyDataSourceList] <br>
 */
public boolean step2_0_circum0() {
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

// Code to call nested step 2_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_1_circum0");
}
PRStackFrame pz_StackFrame2_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 2_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_2_circum0");
}
PRStackFrame pz_StackFrame2_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 2_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_3_circum0");
}
PRStackFrame pz_StackFrame2_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 2_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_4_circum0");
}
PRStackFrame pz_StackFrame2_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 2_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_5_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
if (myStepPage == null) {
throw new InvalidReferenceException(".pyAggregatedDataSourceList", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_9 = myStepPage.getIfPresent("pyAggregatedDataSourceList");
nestedPageRef = pz_9;
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
pz_CurrentStepNum = "2.5.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_0_circum0");
}
PRStackFrame pz_StackFrame2_5_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 2_5_0 Circum: 0" );
try {
pz_Status = step2_5_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_5_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "2.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_0_circum0 definition

/**
 * setting pyDeclarePagesDataSource to a local  variable.
 * <p>
 * Step 2.1 <code>Property-Set</code><br>
 */
public boolean step2_1_circum0() {
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
    dataSourceType = scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    parentsourceindex = tools.getParamValue("pyForEachCount");
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
pz_CurrentStepNum = "2.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_1_circum0 definition

/**
 * Warning message if the data page source is activity.
 * <p>
 * Step 2.2 <code>Call-Function</code><br>
 */
public boolean step2_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.equals(.pyDeclarePagesDataSource,\"LoadActivity\") &amp;&amp; !local.isActivityWarnAdded");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.equals(.pyDeclarePagesDataSource,\"LoadActivity\") && !local.isActivityWarnAdded", "FUAInstance-NullMyStepPage");
}
boolean pz_11 = ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "LoadActivity" })).booleanValue() && ((!isActivityWarnAdded)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.equals(.pyDeclarePagesDataSource,\"LoadActivity\") &amp;&amp; !local.isActivityWarnAdded",pz_11);
if (!pz_11) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.equals(.pyDeclarePagesDataSource,\"LoadActivity\") &amp;&amp; !local.isActivityWarnAdded " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call-Function", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call-Function
{
    isActivityWarnAdded = (pega.<Boolean>resolveMethodCall("pzAddGuardrailWarningForActivityAsSource--(ClipboardPage)", "pzAddGuardrailWarningForActivityAsSource", "Pega-RULES", "Utilities", new Object[] { myStepPage })).booleanValue();
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
pz_CurrentStepNum = "2.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_2_circum0 definition

/**
 * Warning message if the connector class name is same as data page class name for list type data pages.
 * <p>
 * Step 2.3 <code>Call-Function</code><br>
 */
public boolean step2_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyStructure==\"list\"");
try {
boolean pz_13 = (scalarValueQuery_12.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("list"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyStructure==\"list\"",pz_13);
if (!pz_13) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyStructure==\"list\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyDeclarePagesDataSource==\"Connector\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyDeclarePagesDataSource==\"Connector\"", "FUAInstance-NullMyStepPage");
}
boolean pz_14 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Connector"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyDeclarePagesDataSource==\"Connector\"",pz_14);
if (!pz_14) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyDeclarePagesDataSource==\"Connector\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyConnectorClassName==Primary.pyClassName");
try {
boolean pz_17 = (scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_16.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyConnectorClassName==Primary.pyClassName",pz_17);
if (!pz_17) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyConnectorClassName==Primary.pyClassName " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call-Function", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call-Function
// Expression: @(Pega-Rules:Utilities).pzAddGuardrailWarningForConnector(myStepPage)
pega.<Void>resolveMethodCall("pzAddGuardrailWarningForConnector--(ClipboardPage)", "pzAddGuardrailWarningForConnector", "Pega-RULES", "Utilities", new Object[] { myStepPage });
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
pz_CurrentStepNum = "2.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_3_circum0 definition

/**
 * Add warning for System Name is left blank for one or more of its sources.
 * <p>
 * Step 2.4 <code>Call-Function</code><br>
 */
public boolean step2_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("pzIsSourceSystemVisible", "Rule-Declare-Pages", "Embed-DeclarePageSource");
if (!pz__1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.length(@String.trim(.pyDSSystemName)) == 0");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.length(@String.trim(.pyDSSystemName)) == 0", "FUAInstance-NullMyStepPage");
}
boolean pz_19 = ((pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { pega.<String>resolveMethodCall("trim--(String)", "trim", null, "String", new Object[] { scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }) })).intValue() == 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.length(@String.trim(.pyDSSystemName)) == 0",pz_19);
if (!pz_19) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.length(@String.trim(.pyDSSystemName)) == 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call-Function", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call-Function
// Expression: @(Pega-Rules:Utilities).pzAddWarningForEmptySystemName(tools,Local.parentsourceindex, Local.dataSourceType)
pega.<Void>resolveMethodCall("pzAddWarningForEmptySystemName--(PublicAPI,String,String)", "pzAddWarningForEmptySystemName", "Pega-RULES", "Utilities", new Object[] { tools, parentsourceindex, dataSourceType });
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
pz_CurrentStepNum = "2.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_4_circum0 definition

/**
 * Iterating over list of sources within aggregate sources.
 * <p>
 * Step 2.5.0 <code>Java</code> [on page .pyAggregatedDataSourceList] <br>
 */
public boolean step2_5_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.dataSourceType==\"AggregateSources\"");
try {
boolean pz_20 = (dataSourceType.equals("AggregateSources"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.dataSourceType==\"AggregateSources\"",pz_20);
if (!pz_20) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.dataSourceType==\"AggregateSources\" " + anyException.getMessage(), anyException);
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

// Code to call nested step 2_5_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_1_circum0");
}
PRStackFrame pz_StackFrame2_5_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 2_5_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_5_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_5_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_5_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_2_circum0");
}
PRStackFrame pz_StackFrame2_5_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 2_5_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_5_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_5_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_5_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_3_circum0");
}
PRStackFrame pz_StackFrame2_5_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT Step: 2_5_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_5_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_5_3_circum0, false);
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
pz_CurrentStepNum = "2.5.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_0_circum0 definition

/**
 * Warning message if the given aggregated source is activity.
 * <p>
 * Step 2.5.1 <code>Call-Function</code><br>
 */
public boolean step2_5_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.equals(.pyDeclarePagesDataSource,\"LoadActivity\") &amp;&amp; !local.isActivityWarnAdded");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.equals(.pyDeclarePagesDataSource,\"LoadActivity\") && !local.isActivityWarnAdded", "FUAInstance-NullMyStepPage");
}
boolean pz_21 = ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "LoadActivity" })).booleanValue() && ((!isActivityWarnAdded)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.equals(.pyDeclarePagesDataSource,\"LoadActivity\") &amp;&amp; !local.isActivityWarnAdded",pz_21);
if (!pz_21) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.equals(.pyDeclarePagesDataSource,\"LoadActivity\") &amp;&amp; !local.isActivityWarnAdded " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call-Function", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call-Function
{
    isActivityWarnAdded = (pega.<Boolean>resolveMethodCall("pzAddGuardrailWarningForActivityAsSource--(ClipboardPage)", "pzAddGuardrailWarningForActivityAsSource", "Pega-RULES", "Utilities", new Object[] { myStepPage })).booleanValue();
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
pz_CurrentStepNum = "2.5.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_1_circum0 definition

/**
 * Warning message if the connector class name is same as data page class name for list type data pages.
 * <p>
 * Step 2.5.2 <code>Call-Function</code><br>
 */
public boolean step2_5_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyStructure==\"list\"");
try {
boolean pz_22 = (scalarValueQuery_12.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("list"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyStructure==\"list\"",pz_22);
if (!pz_22) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyStructure==\"list\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyDeclarePagesDataSource==\"Connector\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyDeclarePagesDataSource==\"Connector\"", "FUAInstance-NullMyStepPage");
}
boolean pz_23 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Connector"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyDeclarePagesDataSource==\"Connector\"",pz_23);
if (!pz_23) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyDeclarePagesDataSource==\"Connector\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyConnectorClassName==Primary.pyClassName");
try {
boolean pz_24 = (scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_16.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyConnectorClassName==Primary.pyClassName",pz_24);
if (!pz_24) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyConnectorClassName==Primary.pyClassName " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call-Function", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call-Function
// Expression: @(Pega-Rules:Utilities).pzAddGuardrailWarningForConnector(myStepPage)
pega.<Void>resolveMethodCall("pzAddGuardrailWarningForConnector--(ClipboardPage)", "pzAddGuardrailWarningForConnector", "Pega-RULES", "Utilities", new Object[] { myStepPage });
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
pz_CurrentStepNum = "2.5.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_2_circum0 definition

/**
 * Add warning for System Name is left blank for one or more of its sources.
 * <p>
 * Step 2.5.3 <code>Call-Function</code><br>
 */
public boolean step2_5_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__3 = pega.invokeWhen("pzIsSourceSystemVisible", "Rule-Declare-Pages", "Embed-DeclarePageSource");
if (!pz__3) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.length(@String.trim(.pyDSSystemName)) == 0");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.length(@String.trim(.pyDSSystemName)) == 0", "FUAInstance-NullMyStepPage");
}
boolean pz_25 = ((pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { pega.<String>resolveMethodCall("trim--(String)", "trim", null, "String", new Object[] { scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }) })).intValue() == 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.length(@String.trim(.pyDSSystemName)) == 0",pz_25);
if (!pz_25) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.length(@String.trim(.pyDSSystemName)) == 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call-Function", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call-Function
// Expression: @(Pega-Rules:Utilities).pzAddWarningForEmptySystemName(tools,Local.parentsourceindex, Local.dataSourceType)
pega.<Void>resolveMethodCall("pzAddWarningForEmptySystemName--(PublicAPI,String,String)", "pzAddWarningForEmptySystemName", "Pega-RULES", "Utilities", new Object[] { tools, parentsourceindex, dataSourceType });
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
pz_CurrentStepNum = "2.5.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_3_circum0 definition

/**
 * Add warning if Activity is chosen in Post load processing.
 * <p>
 * Step 3 <code>Java</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.notEquals(.pyPostActivity,\"\") &amp;&amp; !local.isActivityWarnAdded");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.notEquals(.pyPostActivity,\"\") && !local.isActivityWarnAdded", "FUAInstance-NullMyStepPage");
}
boolean pz_27 = ((pega.<Boolean>resolveMethodCall("notEquals--(String,String)", "notEquals", null, "String", new Object[] { scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue() && ((!isActivityWarnAdded)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.notEquals(.pyPostActivity,\"\") &amp;&amp; !local.isActivityWarnAdded",pz_27);
if (!pz_27) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.notEquals(.pyPostActivity,\"\") &amp;&amp; !local.isActivityWarnAdded " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(myStepPage.getProperty("pyPostActivity") ,"pzUseActivity",null);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Add warning if RDA is chosen as source.
 * <p>
 * Step 4 <code>Java</code> [on page .pyDataSourceList] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.equals(.pyDeclarePagesDataSource,\"RoboticDesktopAutomation\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.equals(.pyDeclarePagesDataSource,\"RoboticDesktopAutomation\")", "FUAInstance-NullMyStepPage");
}
boolean pz_29 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "RoboticDesktopAutomation" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.equals(.pyDeclarePagesDataSource,\"RoboticDesktopAutomation\")",pz_29);
if (!pz_29) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.equals(.pyDeclarePagesDataSource,\"RoboticDesktopAutomation\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(myStepPage.getProperty("pyDeclarePagesDataSource") ,"pzCheckForRDADataSource",null);
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
boolean pz__5 = pega.invokeWhen("StepStatusGoodWarn", "Rule-Declare-Pages", "Embed-DeclarePageSource");
if (pz__5) {
// branch to block WHEN_WARN
nextBlock = "WHEN_WARN";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Add warning if RDA is chosen as save-type option.
 * <p>
 * Step 5 <code>Java</code> [on page .pyDataPageSaveOptionList] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.equals(.pySaveOptionType,\"robotic_desktop_automation\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.equals(.pySaveOptionType,\"robotic_desktop_automation\")", "FUAInstance-NullMyStepPage");
}
boolean pz_32 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "robotic_desktop_automation" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.equals(.pySaveOptionType,\"robotic_desktop_automation\")",pz_32);
if (!pz_32) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.equals(.pySaveOptionType,\"robotic_desktop_automation\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(myStepPage.getProperty("pySaveOptionType") ,"pzCheckForRDADataSaveType",null);
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
boolean pz__7 = pega.invokeWhen("StepStatusGoodWarn", "Rule-Declare-Pages", "Embed-DeclarePageSaveOption");
if (pz__7) {
// branch to block WHEN_WARN
nextBlock = "WHEN_WARN";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Add a warning if there is more than one data source and if the first data source when condition is 'Always'.
 * <p>
 * Step 6 [WHEN_WARN] <code>Java</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
boolean sameWarningAlreadyAdded = false;
boolean check=false;
int index;
String whencondition;
String msgWarning;
int count=0;
boolean containsWhen=true;
java.util.HashSet lookup = new HashSet(); 
java.util.HashSet duplicatesWithoutAlways = new HashSet(); // If a DP is configured with Always and Otherwise, same when rule warning shouldnt be shown.
int length = myStepPage.getProperty("pyDataSourceList").size();
for(index=1;index<=length;index++)
{
whencondition = myStepPage.getString(".pyDataSourceList("+index+").pySourceWhen");

 if(duplicatesWithoutAlways.contains(whencondition) && !sameWarningAlreadyAdded){ // To check if same when rule is configured for more than one data source, so that a warning can be shown
   sameWarningAlreadyAdded = true;   
   com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(myStepPage.getProperty("pxObjClass") ,"pxUnreachableDatasSourcesWhen",null);
  }
if(!whencondition.equalsIgnoreCase("Always")){
   duplicatesWithoutAlways.add(whencondition);
}

containsWhen = lookup.add(whencondition);
if(whencondition.equalsIgnoreCase("Always") && !check)
  {
   if(index!=length)
   {   
   com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(myStepPage.getProperty("pxObjClass") ,"pxUnreachableDataSourcesAlways",null);
   check=true;
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
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Adding severe warning if data page is of code-pega-list type.
 * <p>
 * Step 7 <code>java</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyClassName==\"Code-Pega-List\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyClassName==\"Code-Pega-List\"", "FUAInstance-NullMyStepPage");
}
boolean pz_33 = (scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Code-Pega-List"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyClassName==\"Code-Pega-List\"",pz_33);
if (!pz_33) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyClassName==\"Code-Pega-List\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
//Adding severe warning if data page is of code-pega-list type.
com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(tools.getStepPage().getProperty("pxObjClass"),"pxTypeCodePegaList",null);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Call RD to check if there are any DPs with the same name.
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
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "pzGetDPsWithSameName");
}
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Rule-Declare-Pages");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "CheckForDuplicates");
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("DataPageName", PropertyInfo.TYPE_TEXT, scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("InstancedLockedRuleSet", PropertyInfo.TYPE_TEXT, scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("InstancedLockedRuleSetVersion", PropertyInfo.TYPE_TEXT, scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("CurrentRuleSet", PropertyInfo.TYPE_TEXT, scalarValueQuery_37.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("CurrentRuleSetVersion", PropertyInfo.TYPE_TEXT, scalarValueQuery_38.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
 * Call RD to check if there are any DPs with the same name.
 * <p>
 * Step 9 <code>Call pxCallRetrieveReportData</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxCallRetrieveReportData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxCallRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxCallRetrieveReportData
if (myStepPage == null) {
}
// Calling Activity : pxCallRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxCallRetrieveReportData", "Rule-Declare-Pages", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxCallRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Get the most suitable rule and verify.
 * <p>
 * Step 10 <code>java</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
boolean structureChanged = false;
boolean typeChanged = false;
boolean scopeChangedToNode = false;
String sWarningDetails = "";
try{
	//Get all the rule sets which has the data page with the same name
	ClipboardPage duplicateRulesPage = tools.findPage("CheckForDuplicates");
	ClipboardProperty dpRuleSets = duplicateRulesPage.getProperty("pxResults");
	java.util.Iterator dpRuleSetsIterator = dpRuleSets.iterator();
    java.util.Set<String> msgSet = new java.util.HashSet<String>();
	boolean showWarning = false;
    String oldRuleSet = null;
    String oldRuleSetVersion = null;
	String className = myStepPage.getProperty("pyClassName").toString();
	String scope = myStepPage.getProperty("pyScope").toString();
	String structure = myStepPage.getProperty("pyStructure").toString();         
	String ruleSet = myStepPage.getProperty("pyRuleSet").toString();
	boolean showInformational = false;// Show informational warning if user is updating in the same ruleset.
	while(dpRuleSetsIterator.hasNext()){
    ClipboardProperty currentRecord = ((ClipboardProperty)dpRuleSetsIterator.next());
   	
   	String oldClassName = currentRecord.getProperty("pyClassName").toString();
	String oldScope = currentRecord.getProperty("pyScope").toString();
	String oldStructure = currentRecord.getProperty("pyStructure").toString();  
	oldRuleSet = currentRecord.getProperty("pyRuleSet").toString();
	oldRuleSetVersion = currentRecord.getProperty("pyRuleSetVersion").toString();
    String instanceLockedRuleSet = myStepPage.getProperty("pxInstanceLockedRuleSet").toString();
		if (instanceLockedRuleSet != null) {
			if (instanceLockedRuleSet.contains("Branch")) {
				int index = instanceLockedRuleSet.indexOf("_");
				if (index != -1) {
					if (instanceLockedRuleSet.substring(0, index).equals(oldRuleSet)) {
						showInformational = true;

					}
				}

			}

		}
//Dont show severe warning if rulesets match. 
	if(oldRuleSet!=null && oldRuleSet.equals(ruleSet) ){
		showInformational = true;
	}

		if(!className.equalsIgnoreCase(oldClassName)){
      		 typeChanged = true;         
	   if(!showInformational){
		  msgSet.add("pxDupPageType"); 
	   }
          
       else{
          msgSet.add("pxDupPageTypeInf");
       }
	   showWarning = true;       
	}
	if(!structure.equalsIgnoreCase(oldStructure)){
		structureChanged = true;		
      	msgSet.add("pxDupPageStructure");
	   if(showInformational){
      	msgSet.add("pxDupPageStructureInf");         
       }

		showWarning = true;		
	}
	
	if( "node".equals(scope) && ( "thread".equals(oldScope) ||  "requestor".equals(oldScope) || "threadfamily".equals(oldScope) ) ) { //If current scope is "node" unlike the prev versions.
		scopeChangedToNode = true;		
		msgSet.add("pxDupPageScope"); 
		if(showInformational){
			msgSet.add("pxDupPageScopeInf"); 
		}
       	
		showWarning = true;		
	}	


	if((scopeChangedToNode && typeChanged) || (typeChanged && structureChanged) || (scopeChangedToNode && structureChanged)){ //Multiple changes
		   showWarning = true;		   
		   msgSet.add("pxDupPageCatchAll"); 
		   if(showInformational){   
			msgSet.add("pxDupPageCatchAllInf"); 
		   }
		    break;
	    }

	}

	//Add warnings
	if(showWarning){	
        	 for (String msg : msgSet)
       			{
            		com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(myStepPage.getProperty("pxObjClass") ,msg ,null);
        		}           
                                        
		}	

}
catch(Exception e)
{
	oLog.error("Exception : "+e);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Add a warning if Connect-SQL or Connect-EJB are used, as they are deprecated.
 * <p>
 * Step 11 <code>java</code> [on page .pyDataSourceList] <br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyDeclarePagesDataSource==\"Connector\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyDeclarePagesDataSource==\"Connector\"", "FUAInstance-NullMyStepPage");
}
boolean pz_40 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Connector"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyDeclarePagesDataSource==\"Connector\"",pz_40);
if (!pz_40) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyDeclarePagesDataSource==\"Connector\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyConnectorList == \"Rule-Connect-SQL\" || .pyConnectorList == \"Rule-Connect-EJB\"");
try {
boolean pz_42 = ((scalarValueQuery_41.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Rule-Connect-SQL")) || (scalarValueQuery_41.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Rule-Connect-EJB")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyConnectorList == \"Rule-Connect-SQL\" || .pyConnectorList == \"Rule-Connect-EJB\"",pz_42);
if (!pz_42) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyConnectorList == \"Rule-Connect-SQL\" || .pyConnectorList == \"Rule-Connect-EJB\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
HashStringMap msgParams = new HashStringMap();
if("Rule-Connect-SQL".equals(myStepPage.getString("pyConnectorList")) && !sqlWarnAdded){
msgParams .put("connectorName","SQL");
com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(null,"pxDeprecatedConnector",msgParams);
sqlWarnAdded = true;
}
if("Rule-Connect-EJB".equals(myStepPage.getString("pyConnectorList")) && !ejbWarnAdded){
msgParams .put("connectorName","EJB");
com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(null,"pxDeprecatedConnector",msgParams);
ejbWarnAdded = true;
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Add warning if its node level data page and has reference to class with Access control policies defined.
 * <p>
 * Step 12 <code>java</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Utilities.pxIsABACEnabled()");
try {
boolean pz_43 = (pega.<Boolean>resolveMethodCall("pxIsABACEnabled--()", "pxIsABACEnabled", null, "Utilities", new Object[] {})).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Utilities.pxIsABACEnabled()",pz_43);
if (!pz_43) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Utilities.pxIsABACEnabled() " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(\"node\",.pyScope)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@equals(\"node\",.pyScope)", "FUAInstance-NullMyStepPage");
}
boolean pz_44 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { "node", scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(\"node\",.pyScope)",pz_44);
if (!pz_44) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(\"node\",.pyScope) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
String className = myStepPage.getString(".pyClassName");
//see if there are any access control policies defined on the class. If yes generate warning.
boolean policyExistsForClass = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().doesPolicyExistForClassAndAction(tools,"Read",className);
if(policyExistsForClass)
  {
  com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(tools.getStepPage().getProperty("pyScope"),"pxObjectTypeHasAccessPolicies",null);
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
pz_CurrentStepNum = "12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Add informational message is using high performance checkbox.
 * <p>
 * Step 13 <code>Java</code><br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(\"node\",.pyScope)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@equals(\"node\",.pyScope)", "FUAInstance-NullMyStepPage");
}
boolean pz_45 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { "node", scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(\"node\",.pyScope)",pz_45);
if (!pz_45) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(\"node\",.pyScope) " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(\"true\",.pyUseNewClipboard)");
try {
boolean pz_47 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { "true", scalarValueQuery_46.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(\"true\",.pyUseNewClipboard)",pz_47);
if (!pz_47) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(\"true\",.pyUseNewClipboard) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(tools.getStepPage().getProperty("pyUseNewClipboard"),"pxReadOnlyPageIsUsingHighPerformanceClipboard",null);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * check if pega unit warning needs to be added.
 * <p>
 * Step 14 <code>Call pzCheckForPegaUnitWarning</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCheckForPegaUnitWarning");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzCheckForPegaUnitWarning", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzCheckForPegaUnitWarning
if (myStepPage == null) {
}
// Calling Activity : pzCheckForPegaUnitWarning

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzCheckForPegaUnitWarning", "Rule-Declare-Pages", "");
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
pz_CurrentStepNum = "14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCheckForPegaUnitWarning",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * validate required params.
 * <p>
 * Step 15 <code>Call pzValidateRequiredParams</code><br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzValidateRequiredParams");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzValidateRequiredParams", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzValidateRequiredParams
if (myStepPage == null) {
}
// Calling Activity : pzValidateRequiredParams
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzValidateRequiredParams", "Rule-Declare-Pages", "");
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
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzValidateRequiredParams",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * Add warning if there are no parameters for a page type DP.
 * <p>
 * Step 16 <code>java</code><br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pzIsAutoGenerated");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pzIsAutoGenerated", "FUAInstance-NullMyStepPage");
}
boolean pz_49 = scalarValueQuery_48.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pzIsAutoGenerated",pz_49);
if (pz_49) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pzIsAutoGenerated " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(\"page\",.pyStructure)");
try {
boolean pz_50 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { "page", scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(\"page\",.pyStructure)",pz_50);
if (!pz_50) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(\"page\",.pyStructure) " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyParameters(1).pyParametersParamName == \"\"");
try {
boolean pz_53 = (scalarValueQuery_51.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyParameters(1).pyParametersParamName == \"\"",pz_53);
if (!pz_53) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyParameters(1).pyParametersParamName == \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(null,"pzAddAtleastOneParameterInPageType",null);
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
pz_CurrentStepNum = "16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

/**
 * Remove the page.
 * <p>
 * Step 17 <code>Page-Remove</code> [on page CheckForDuplicates] <br>
 */
public boolean step17_circum0() {
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
pz_CurrentStepNum = "17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

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

public boolean sqlWarnAdded = false;
public boolean isActivityWarnAdded = false;
public boolean ejbWarnAdded = false;
public String parentsourceindex = "";
public String dataSourceType = "";

public void initializeUserLocalVariables() {
	sqlWarnAdded = false;
	isActivityWarnAdded = false;
	ejbWarnAdded = false;
	parentsourceindex = "";
	dataSourceType = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("sqlWarnAdded", Boolean.toString(sqlWarnAdded));
	smRetVal.putString("isActivityWarnAdded", Boolean.toString(isActivityWarnAdded));
	smRetVal.putString("ejbWarnAdded", Boolean.toString(ejbWarnAdded));
	smRetVal.putString("parentsourceindex", (parentsourceindex == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : parentsourceindex.toString());
	smRetVal.putString("dataSourceType", (dataSourceType == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : dataSourceType.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_52 = new String[] { "", "", "pyParameters", "1", "pyParametersParamName", "" };
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyDeclarePagesDataSource").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().scalarProperty("pxInstanceLockedRuleSetVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pyScope").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().scalarProperty("pyUseNewClipboard").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_51 = FUAUtil.createQueryBuilder().pageList("pyParameters", 1).scalarProperty("pyParametersParamName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyConnectorClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().scalarProperty("pySaveOptionType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_38 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSetVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().scalarProperty("pyPageName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().scalarProperty("pyPostActivity").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyStructure").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_41 = FUAUtil.createQueryBuilder().scalarProperty("pyConnectorList").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_48 = FUAUtil.createQueryBuilder().scalarProperty("pzIsAutoGenerated").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().scalarProperty("pxInstanceLockedRuleSet").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pyDSSystemName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_37 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSet").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-DECLARE-PAGES CHECKFORWARNINGS #20210818T130738.282 GMT", "Rule-Declare-Pages CheckForWarnings", "Pega-ProcessArchitect", "08-07-01", false, true, "", "ACTIVITY", "20210819T145056.618 GMT" ,"Rule-Obj-Activity"); }
