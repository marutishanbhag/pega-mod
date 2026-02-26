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
public class ra_action_pzloadappmgmtassets_2d58bbde6163eae2af14dee83e4cf5c6 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzLoadAppMgmtAssets.Pega_Agile_Work.Action");
	public ra_action_pzloadappmgmtassets_2d58bbde6163eae2af14dee83e4cf5c6(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT	Pega-AppDefinition:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT";
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
String pz_4 = "AssetsList";
thisStepPage = tools.findPage(pz_4, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("FilterStories"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_20 = "AssetsList";
thisStepPage = tools.findPage(pz_20, true);
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("FilterBugs"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_22 = "AssetsList";
thisStepPage = tools.findPage(pz_22, true);
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 9 Circum: 0" );
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
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("FilterFeedback"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_24 = "AssetsList";
thisStepPage = tools.findPage(pz_24, true);
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 12_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 13_0_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CategorizeItems"))) {
nextBlock = "";
ClipboardProperty pz_26 = pega.findPageWithException("StoryList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_26;
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
{
if (pz_Status == true && (nextBlock.equals("") || nextBlock.equals("CategorizeItems"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_0_circum0");
}
PRStackFrame pz_StackFrame13_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 13_0 Circum: 0" );
try {
pz_Status = step13_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 14_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_37 = pega.findPageWithException("BugList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_37;
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
pz_CurrentStepNum = "14.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_0_circum0");
}
PRStackFrame pz_StackFrame14_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 14_0 Circum: 0" );
try {
pz_Status = step14_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 15_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_47 = pega.findPageWithException("FeedbackList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_47;
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
pz_CurrentStepNum = "15.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_0_circum0");
}
PRStackFrame pz_StackFrame15_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 15_0 Circum: 0" );
try {
pz_Status = step15_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
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
	"Rule-Obj-Activity:PZLOADAPPMGMTASSETS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOADAPPMGMTASSETS","Rule-Obj-Activity","PEGA-AGILE-WORK",false,"","Pega-AppDefinition","08-01-01","RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT","!PZLOADAPPMGMTASSETS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1742266763)
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
//	RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT:20180713T141929.497 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "9af155f8dba5c09fd1467f5684a82a83";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Agile-Work";
	}
public String getAspect() {
return "Action";
}
/**
 * create temp page.
 * <p>
 * Step 1 <code>Page-New</code> [on page AssetsList] <br>
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
String pz_5 = "AssetsList";
myStepPage = tools.findPage(pz_5, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","AssetsList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("AssetsList", myStepPage);
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
 * reset all counts.
 * <p>
 * Step 2 <code>Property-Set</code><br>
 */
public boolean step2_circum0() {
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
    pega.setViaPropRef(".pyToDoStoryCount", pRef_6, tools.getPrimaryPage(), 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyToDoBugCount", pRef_7, tools.getPrimaryPage(), 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyToDoFeedbackCount", pRef_8, tools.getPrimaryPage(), 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyDoingStoryCount", pRef_9, tools.getPrimaryPage(), 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyDoingBugCount", pRef_10, tools.getPrimaryPage(), 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyDoneStoryCount", pRef_11, tools.getPrimaryPage(), 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyDoneBugCount", pRef_12, tools.getPrimaryPage(), 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyDoneFeedbackCount", pRef_13, tools.getPrimaryPage(), 0, "sNN", false, true);
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
 * Set AssetsToFetch based on user selection.
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
    tools.putParamValue("AssetsToFetch", PropertyInfo.TYPE_TEXT, ((scalarValueQuery_14.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true) ? (tools.getParamValue("AssetsToFetch") + "\"Pega-Agile-Work-UserStory\"") : tools.getParamValue("AssetsToFetch")));
}
{
    tools.putParamValue("AssetsToFetch", PropertyInfo.TYPE_TEXT, ((scalarValueQuery_15.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true) ? ((tools.getParamValue("AssetsToFetch").equals("")) ? "\"Pega-Agile-Work-Bug\"" : (tools.getParamValue("AssetsToFetch") + ",\"Pega-Agile-Work-Bug\"")) : tools.getParamValue("AssetsToFetch")));
}
{
    tools.putParamValue("AssetsToFetch", PropertyInfo.TYPE_TEXT, ((scalarValueQuery_16.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true) ? ((tools.getParamValue("AssetsToFetch").equals("")) ? "\"Pega-Agile-Work-Feedback\"" : (tools.getParamValue("AssetsToFetch") + ",\"Pega-Agile-Work-Feedback\"")) : tools.getParamValue("AssetsToFetch")));
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
 * call activity to get feature filter condition.
 * <p>
 * Step 4 <code>Call pzGetFeaturesForAppMgmt</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetFeaturesForAppMgmt");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzGetFeaturesForAppMgmt", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzGetFeaturesForAppMgmt
if (myStepPage == null) {
}
// Calling Activity : pzGetFeaturesForAppMgmt
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzGetFeaturesForAppMgmt", "Pega-Agile-Work", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetFeaturesForAppMgmt",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * set properties for RD.
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.AssetsToFetch==\"\"");
try {
boolean pz_17 = (tools.getParamValue("AssetsToFetch").equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.AssetsToFetch==\"\"",pz_17);
if (pz_17) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzLoadAppMgmtAssets - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.AssetsToFetch==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Pega-Agile-Work");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "AssetsList");
}
{
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "pzGetAssetList");
}
{
    tools.putParamValue("searchreq", PropertyInfo.TYPE_TEXT, scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("pyLanding", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("Stage", PropertyInfo.TYPE_TEXT, "\"To do\",\"Doing\",\"Open\",\"Done\",\"Resolved\"");
}
{
    tools.putParamValue("FeaturesList", PropertyInfo.TYPE_TEXT, tools.getParamValue("FeaturesList"));
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
 * Call the RD.
 * <p>
 * Step 6 <code>Call Rule-Obj-Report-Definition.pxRetrieveReportData</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Rule-Obj-Report-Definition.pxRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Rule-Obj-Report-Definition.pxRetrieveReportData
if (myStepPage == null) {
}
// Calling Activity : Rule-Obj-Report-Definition.pxRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "Pega-Agile-Work", "Rule-Obj-Report-Definition");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * copy content into temp page.
 * <p>
 * Step 7 [FilterStories] <code>Page-Copy</code> [on page AssetsList] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_pzInitialValues.pyShowStoryItems==true");
try {
boolean pz_21 = (scalarValueQuery_14.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_pzInitialValues.pyShowStoryItems==true",pz_21);
if (!pz_21) {
// branch to block FilterBugs
nextBlock = "FilterBugs";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_pzInitialValues.pyShowStoryItems==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: StoryList
targetPage = tools.findPage("StoryList", false);
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
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * filter out stories.
 * <p>
 * Step 8 <code>Obj-Filter</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Filter", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Filter
// Expression: StoryList
// Expression: Pega-Agile-Work-UserStory

//Filtering of result set starts here.
ClipboardPage contentPage = tools.findPage("StoryList");
if (contentPage == null) {
throw new PRRuntimeException("StoryList","this page does not exist and cannot be shown");
}
ParameterPage paramPage = tools.getParameterPage();
ClipboardProperty cp_Results = contentPage.getProperty("pxResults");
for (int i = cp_Results.size(); i >= 1; i--) {
ClipboardPage cp_ResultPage = cp_Results.getPageValue(i);
PRStackFrame resultPage_Frame = pega.pushStackFrame("Obj-Filter", paramPage , cp_ResultPage, false, false);
myStepPage = tools.getStepPage();
try {
boolean resultWhen_0 = pega.invokeWhen("pzIsStoryItem", "Pega-Agile-Work", "Pega-Agile-Work-UserStory");
if (!(resultWhen_0)) {
cp_Results.remove(i);
}
} finally {
pega.popStackFrame(resultPage_Frame, false);
}
}
contentPage.putString(".pxResultCount", Integer.toString(cp_Results.size()));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * copy content into temp page.
 * <p>
 * Step 9 [FilterBugs] <code>Page-Copy</code> [on page AssetsList] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_pzInitialValues.pyShowBugItems==true");
try {
boolean pz_23 = (scalarValueQuery_15.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_pzInitialValues.pyShowBugItems==true",pz_23);
if (!pz_23) {
// branch to block FilterFeedback
nextBlock = "FilterFeedback";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_pzInitialValues.pyShowBugItems==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: BugList
targetPage = tools.findPage("BugList", false);
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
pz_CurrentStepNum = "9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * filter out bugs.
 * <p>
 * Step 10 <code>Obj-Filter</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Filter", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Filter
// Expression: BugList
// Expression: Pega-Agile-Work-Bug

//Filtering of result set starts here.
ClipboardPage contentPage = tools.findPage("BugList");
if (contentPage == null) {
throw new PRRuntimeException("BugList","this page does not exist and cannot be shown");
}
ParameterPage paramPage = tools.getParameterPage();
ClipboardProperty cp_Results = contentPage.getProperty("pxResults");
for (int i = cp_Results.size(); i >= 1; i--) {
ClipboardPage cp_ResultPage = cp_Results.getPageValue(i);
PRStackFrame resultPage_Frame = pega.pushStackFrame("Obj-Filter", paramPage , cp_ResultPage, false, false);
myStepPage = tools.getStepPage();
try {
boolean resultWhen_0 = pega.invokeWhen("pzIsBugItem", "Pega-Agile-Work", "Pega-Agile-Work-Bug");
if (!(resultWhen_0)) {
cp_Results.remove(i);
}
} finally {
pega.popStackFrame(resultPage_Frame, false);
}
}
contentPage.putString(".pxResultCount", Integer.toString(cp_Results.size()));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * copy content into temp page.
 * <p>
 * Step 11 [FilterFeedback] <code>Page-Copy</code> [on page AssetsList] <br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_pzInitialValues.pyShowFeedbackItems==true");
try {
boolean pz_25 = (scalarValueQuery_16.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_pzInitialValues.pyShowFeedbackItems==true",pz_25);
if (!pz_25) {
// branch to block CategorizeItems
nextBlock = "CategorizeItems";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_pzInitialValues.pyShowFeedbackItems==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: FeedbackList
targetPage = tools.findPage("FeedbackList", false);
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
pz_CurrentStepNum = "11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * filter out feedbacks.
 * <p>
 * Step 12 <code>Obj-Filter</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Filter", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Filter
// Expression: FeedbackList
// Expression: Pega-Agile-Work-Feedback

//Filtering of result set starts here.
ClipboardPage contentPage = tools.findPage("FeedbackList");
if (contentPage == null) {
throw new PRRuntimeException("FeedbackList","this page does not exist and cannot be shown");
}
ParameterPage paramPage = tools.getParameterPage();
ClipboardProperty cp_Results = contentPage.getProperty("pxResults");
for (int i = cp_Results.size(); i >= 1; i--) {
ClipboardPage cp_ResultPage = cp_Results.getPageValue(i);
PRStackFrame resultPage_Frame = pega.pushStackFrame("Obj-Filter", paramPage , cp_ResultPage, false, false);
myStepPage = tools.getStepPage();
try {
boolean resultWhen_0 = pega.invokeWhen("pzIsFDBKItem", "Pega-Agile-Work", "Pega-Agile-Work-Feedback");
if (!(resultWhen_0)) {
cp_Results.remove(i);
}
} finally {
pega.popStackFrame(resultPage_Frame, false);
}
}
contentPage.putString(".pxResultCount", Integer.toString(cp_Results.size()));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * seggregate.
 * <p>
 * Step 13.0 [CategorizeItems] <code>Java</code> [on page StoryList.pxResults] <br>
 */
public boolean step13_0_circum0() {
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

// Code to call nested step 13_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_1_circum0");
}
PRStackFrame pz_StackFrame13_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 13_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_2_circum0");
}
PRStackFrame pz_StackFrame13_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 13_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Doing"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_3_circum0");
}
PRStackFrame pz_StackFrame13_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 13_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_circum0");
}
PRStackFrame pz_StackFrame13_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 13_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Done"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_5_circum0");
}
PRStackFrame pz_StackFrame13_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 13_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_6_circum0");
}
PRStackFrame pz_StackFrame13_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 13_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_6_circum0, false);
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
pz_CurrentStepNum = "13.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_0_circum0 definition

/**
 * if it is open or to do copy here.
 * <p>
 * Step 13.1 <code>Page-Copy</code><br>
 */
public boolean step13_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\"", "FUAInstance-NullMyStepPage");
}
boolean pz_28 = ((scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("To do")) || (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Open")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\"",pz_28);
if (!pz_28) {
// branch to block Doing
nextBlock = "Doing";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: Primary.pyToDoList(<APPEND>)
ClipboardPage pz_29 = tools.getPrimaryPage().getProperty(".pyToDoList(<append>)").getPageValue();
targetPage = pz_29;
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
pz_CurrentStepNum = "13.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_1_circum0 definition

/**
 * get count of each item.
 * <p>
 * Step 13.2 <code>Property-Set</code><br>
 */
public boolean step13_2_circum0() {
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
    pega.setViaPropRef(".pyToDoStoryCount", pRef_6, tools.getPrimaryPage(), (scalarValueQuery_30.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + 1), "sNN", false, true);
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
pz_CurrentStepNum = "13.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_2_circum0 definition

/**
 * if it is doing copy here.
 * <p>
 * Step 13.3 [Doing] <code>Page-Copy</code><br>
 */
public boolean step13_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"Doing\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxCurrentStageLabel==\"Doing\"", "FUAInstance-NullMyStepPage");
}
boolean pz_31 = (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Doing"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"Doing\"",pz_31);
if (!pz_31) {
// branch to block Done
nextBlock = "Done";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxCurrentStageLabel==\"Doing\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: Primary.pyDoingList(<APPEND>)
ClipboardPage pz_32 = tools.getPrimaryPage().getProperty(".pyDoingList(<append>)").getPageValue();
targetPage = pz_32;
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
pz_CurrentStepNum = "13.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_3_circum0 definition

/**
 * get count of each item.
 * <p>
 * Step 13.4 <code>Property-Set</code><br>
 */
public boolean step13_4_circum0() {
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
    pega.setViaPropRef(".pyDoingStoryCount", pRef_9, tools.getPrimaryPage(), (scalarValueQuery_33.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + 1), "sNN", false, true);
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
pz_CurrentStepNum = "13.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_circum0 definition

/**
 * if it is done copy here.
 * <p>
 * Step 13.5 [Done] <code>Page-Copy</code><br>
 */
public boolean step13_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"Done\"||.pxCurrentStageLabel==\"Resolved\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxCurrentStageLabel==\"Done\"||.pxCurrentStageLabel==\"Resolved\"", "FUAInstance-NullMyStepPage");
}
boolean pz_34 = ((scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Done")) || (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Resolved")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"Done\"||.pxCurrentStageLabel==\"Resolved\"",pz_34);
if (!pz_34) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxCurrentStageLabel==\"Done\"||.pxCurrentStageLabel==\"Resolved\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: Primary.pyDoneList(<APPEND>)
ClipboardPage pz_35 = tools.getPrimaryPage().getProperty(".pyDoneList(<append>)").getPageValue();
targetPage = pz_35;
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
pz_CurrentStepNum = "13.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_5_circum0 definition

/**
 * get count of each item.
 * <p>
 * Step 13.6 <code>Property-Set</code><br>
 */
public boolean step13_6_circum0() {
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
    pega.setViaPropRef(".pyDoneStoryCount", pRef_11, tools.getPrimaryPage(), (scalarValueQuery_36.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + 1), "sNN", false, true);
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
pz_CurrentStepNum = "13.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_6_circum0 definition

/**
 * seggregate.
 * <p>
 * Step 14.0 <code>Java</code> [on page BugList.pxResults] <br>
 */
public boolean step14_0_circum0() {
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

// Code to call nested step 14_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_1_circum0");
}
PRStackFrame pz_StackFrame14_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 14_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_2_circum0");
}
PRStackFrame pz_StackFrame14_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 14_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("BugDoing"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_3_circum0");
}
PRStackFrame pz_StackFrame14_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 14_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_4_circum0");
}
PRStackFrame pz_StackFrame14_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 14_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("BugDone"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_5_circum0");
}
PRStackFrame pz_StackFrame14_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 14_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 14_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_6_circum0");
}
PRStackFrame pz_StackFrame14_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 14_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step14_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame14_6_circum0, false);
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
pz_CurrentStepNum = "14.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_0_circum0 definition

/**
 * if it is open or to do copy here.
 * <p>
 * Step 14.1 <code>Page-Copy</code><br>
 */
public boolean step14_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\"", "FUAInstance-NullMyStepPage");
}
boolean pz_38 = ((scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("To do")) || (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Open")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\"",pz_38);
if (!pz_38) {
// branch to block BugDoing
nextBlock = "BugDoing";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: Primary.pyToDoList(<APPEND>)
ClipboardPage pz_39 = tools.getPrimaryPage().getProperty(".pyToDoList(<append>)").getPageValue();
targetPage = pz_39;
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
pz_CurrentStepNum = "14.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_1_circum0 definition

/**
 * get count of each item.
 * <p>
 * Step 14.2 <code>Property-Set</code><br>
 */
public boolean step14_2_circum0() {
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
    pega.setViaPropRef(".pyToDoBugCount", pRef_7, tools.getPrimaryPage(), (scalarValueQuery_40.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + 1), "sNN", false, true);
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
pz_CurrentStepNum = "14.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_2_circum0 definition

/**
 * if it is doing copy here.
 * <p>
 * Step 14.3 [BugDoing] <code>Page-Copy</code><br>
 */
public boolean step14_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"Doing\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxCurrentStageLabel==\"Doing\"", "FUAInstance-NullMyStepPage");
}
boolean pz_41 = (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Doing"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"Doing\"",pz_41);
if (!pz_41) {
// branch to block BugDone
nextBlock = "BugDone";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxCurrentStageLabel==\"Doing\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: Primary.pyDoingList(<APPEND>)
ClipboardPage pz_42 = tools.getPrimaryPage().getProperty(".pyDoingList(<append>)").getPageValue();
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
} finally {
pz_CurrentStepNum = "14.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_3_circum0 definition

/**
 * get count of each item.
 * <p>
 * Step 14.4 <code>Property-Set</code><br>
 */
public boolean step14_4_circum0() {
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
    pega.setViaPropRef(".pyDoingBugCount", pRef_10, tools.getPrimaryPage(), (scalarValueQuery_43.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + 1), "sNN", false, true);
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
pz_CurrentStepNum = "14.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_4_circum0 definition

/**
 * if it is done copy here.
 * <p>
 * Step 14.5 [BugDone] <code>Page-Copy</code><br>
 */
public boolean step14_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"Done\"||.pxCurrentStageLabel==\"Resolved\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxCurrentStageLabel==\"Done\"||.pxCurrentStageLabel==\"Resolved\"", "FUAInstance-NullMyStepPage");
}
boolean pz_44 = ((scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Done")) || (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Resolved")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"Done\"||.pxCurrentStageLabel==\"Resolved\"",pz_44);
if (!pz_44) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxCurrentStageLabel==\"Done\"||.pxCurrentStageLabel==\"Resolved\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: Primary.pyDoneList(<APPEND>)
ClipboardPage pz_45 = tools.getPrimaryPage().getProperty(".pyDoneList(<append>)").getPageValue();
targetPage = pz_45;
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
pz_CurrentStepNum = "14.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_5_circum0 definition

/**
 * get count of each item.
 * <p>
 * Step 14.6 <code>Property-Set</code><br>
 */
public boolean step14_6_circum0() {
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
    pega.setViaPropRef(".pyDoneBugCount", pRef_12, tools.getPrimaryPage(), (scalarValueQuery_46.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + 1), "sNN", false, true);
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
pz_CurrentStepNum = "14.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_6_circum0 definition

/**
 * seggregate.
 * <p>
 * Step 15.0 <code>Java</code> [on page FeedbackList.pxResults] <br>
 */
public boolean step15_0_circum0() {
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

// Code to call nested step 15_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_1_circum0");
}
PRStackFrame pz_StackFrame15_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 15_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step15_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame15_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 15_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_2_circum0");
}
PRStackFrame pz_StackFrame15_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 15_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step15_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame15_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 15_3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("FdbkDone"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_3_circum0");
}
PRStackFrame pz_StackFrame15_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 15_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step15_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame15_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 15_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_4_circum0");
}
PRStackFrame pz_StackFrame15_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT Step: 15_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step15_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame15_4_circum0, false);
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
pz_CurrentStepNum = "15.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_0_circum0 definition

/**
 * if it is open or to do copy here.
 * <p>
 * Step 15.1 <code>Page-Copy</code><br>
 */
public boolean step15_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\"", "FUAInstance-NullMyStepPage");
}
boolean pz_48 = ((scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("To do")) || (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Open")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\"",pz_48);
if (!pz_48) {
// branch to block FdbkDone
nextBlock = "FdbkDone";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxCurrentStageLabel==\"To do\"||.pxCurrentStageLabel==\"Open\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: Primary.pyToDoList(<APPEND>)
ClipboardPage pz_49 = tools.getPrimaryPage().getProperty(".pyToDoList(<append>)").getPageValue();
targetPage = pz_49;
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
pz_CurrentStepNum = "15.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_1_circum0 definition

/**
 * get count of each item.
 * <p>
 * Step 15.2 <code>Property-Set</code><br>
 */
public boolean step15_2_circum0() {
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
    pega.setViaPropRef(".pyToDoFeedbackCount", pRef_8, tools.getPrimaryPage(), (scalarValueQuery_50.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + 1), "sNN", false, true);
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
pz_CurrentStepNum = "15.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_2_circum0 definition

/**
 * if it is done copy here.
 * <p>
 * Step 15.3 [FdbkDone] <code>Page-Copy</code><br>
 */
public boolean step15_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"Done\" ||.pxCurrentStageLabel==\"Resolved\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxCurrentStageLabel==\"Done\" ||.pxCurrentStageLabel==\"Resolved\"", "FUAInstance-NullMyStepPage");
}
boolean pz_51 = ((scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Done")) || (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Resolved")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxCurrentStageLabel==\"Done\" ||.pxCurrentStageLabel==\"Resolved\"",pz_51);
if (!pz_51) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxCurrentStageLabel==\"Done\" ||.pxCurrentStageLabel==\"Resolved\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: Primary.pyDoneList(<APPEND>)
ClipboardPage pz_52 = tools.getPrimaryPage().getProperty(".pyDoneList(<append>)").getPageValue();
targetPage = pz_52;
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
pz_CurrentStepNum = "15.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_3_circum0 definition

/**
 * get count of each item.
 * <p>
 * Step 15.4 <code>Property-Set</code><br>
 */
public boolean step15_4_circum0() {
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
    pega.setViaPropRef(".pyDoneFeedbackCount", pRef_13, tools.getPrimaryPage(), (scalarValueQuery_53.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + 1), "sNN", false, true);
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
pz_CurrentStepNum = "15.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_4_circum0 definition

/**
 * remove temp pages.
 * <p>
 * Step 16 <code>Page-Remove</code><br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: AssetsList
pageRemove(tools.findPage("AssetsList"));
// Expression: FeedbackList
pageRemove(tools.findPage("FeedbackList"));
// Expression: BugList
pageRemove(tools.findPage("BugList"));
// Expression: StoryList
pageRemove(tools.findPage("StoryList"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

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

public static final String[] pRef_6 = new String[] { "", "", "pyToDoStoryCount", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyToDoBugCount", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyDoingStoryCount", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyDoingBugCount", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyDoneStoryCount", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyApplication", "", "pySearchTextForGaps", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyDoneFeedbackCount", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyDoneBugCount", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyToDoFeedbackCount", "" };
private static final ScalarValueQuery scalarValueQuery_50 = FUAUtil.createQueryBuilder().scalarProperty("pyToDoFeedbackCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyShowFeedbackItems").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().scalarProperty("pyToDoBugCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().scalarProperty("pyDoneBugCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_53 = FUAUtil.createQueryBuilder().scalarProperty("pyDoneFeedbackCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().scalarProperty("pyDoneStoryCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyShowBugItems").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_30 = FUAUtil.createQueryBuilder().scalarProperty("pyToDoStoryCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyShowStoryItems").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().scalarProperty("pyDoingBugCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_33 = FUAUtil.createQueryBuilder().scalarProperty("pyDoingStoryCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pxCurrentStageLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().page("pyApplication").scalarProperty("pySearchTextForGaps").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGA-AGILE-WORK PZLOADAPPMGMTASSETS #20180713T141929.497 GMT", "Pega-Agile-Work pzLoadAppMgmtAssets", "Pega-AppDefinition", "08-01-01", false, true, "", "ACTIVITY", "20180713T141929.497 GMT" ,"Rule-Obj-Activity"); }
