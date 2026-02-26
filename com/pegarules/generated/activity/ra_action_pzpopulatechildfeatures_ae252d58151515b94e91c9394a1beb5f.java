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
public class ra_action_pzpopulatechildfeatures_ae252d58151515b94e91c9394a1beb5f extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzPopulateChildFeatures.Data_Application_Feature.Action");
	public ra_action_pzpopulatechildfeatures_ae252d58151515b94e91c9394a1beb5f(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT	Pega-AppDefinition:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT";
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
ClipboardProperty pz_13 = pega.findPageWithException("FeaturesList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_13;
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
PRStackFrame pz_StackFrame1_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_0 Circum: 0" );
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
	"Rule-Obj-Activity:PZPOPULATECHILDFEATURES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPOPULATECHILDFEATURES","Rule-Obj-Activity","DATA-APPLICATION-FEATURE",false,"","Pega-AppDefinition","08-04-01","RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT","!PZPOPULATECHILDFEATURES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1803828680)
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
//	RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT:20191023T095840.039 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "b2dba18509428cfe6684f1886657bd43";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Application-Feature";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1.0 <code>Page-Copy</code> [on page FeaturesList.pxResults] <br>
 */
public boolean step1_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ParentFeatureID==.pyParentFeatureID");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("param.ParentFeatureID==.pyParentFeatureID", "FUAInstance-NullMyStepPage");
}
boolean pz_15 = (tools.getParamValue("ParentFeatureID").equals(scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ParentFeatureID==.pyParentFeatureID",pz_15);
if (pz_15) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ParentFeatureID==.pyParentFeatureID " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.ParentCopiedID!=\"\" &amp;&amp;Param.ParentCopiedID==.pyParentFeatureID");
try {
boolean pz_16 = ((!(tools.getParamValue("ParentCopiedID").equals(""))) && (tools.getParamValue("ParentCopiedID").equals(scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.ParentCopiedID!=\"\" &amp;&amp;Param.ParentCopiedID==.pyParentFeatureID",pz_16);
if (!pz_16) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.ParentCopiedID!=\"\" &amp;&amp;Param.ParentCopiedID==.pyParentFeatureID " + anyException.getMessage(), anyException);
}
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
// Expression: Primary.pxResults(<APPEND>)
ClipboardPage pz_17 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_17;
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
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
nestedStepPage = tools.getPrimaryPage().getPage(".pxResults(<last>)");
}
PRStackFrame pz_StackFrame1_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_1 Circum: 0" );
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
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
nestedStepPage = tools.getPrimaryPage().getPage(".pxResults(<last>)");
}
PRStackFrame pz_StackFrame1_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_2 Circum: 0" );
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
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
nestedStepPage = tools.getPrimaryPage().getPage(".pxResults(<last>)");
}
PRStackFrame pz_StackFrame1_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_3 Circum: 0" );
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

// Code to call nested step 1_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_4_circum0");
}
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
nestedStepPage = tools.getPrimaryPage().getPage(".pxResults(<last>)");
}
PRStackFrame pz_StackFrame1_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("title"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_5_circum0");
}
PRStackFrame pz_StackFrame1_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_6_circum0");
}
String pz_22 = "AssetsList";
nestedStepPage = tools.findPage(pz_22, true);
PRStackFrame pz_StackFrame1_6_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_7_circum0");
}
PRStackFrame pz_StackFrame1_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_8_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_23 = pega.findPageWithException("TempAssetsList", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_23;
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
pz_CurrentStepNum = "1.8.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_8_0_circum0");
}
PRStackFrame pz_StackFrame1_8_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_8_0 Circum: 0" );
try {
pz_Status = step1_8_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_8_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 1_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_9_circum0");
}
PRStackFrame pz_StackFrame1_9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_10_0_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("NonInt"))) {
nextBlock = "";
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_24 = pega.findPageWithException("AssetsList", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_24;
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
if (pz_Status == true && (nextBlock.equals("") || nextBlock.equals("NonInt"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.10.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_10_0_circum0");
}
PRStackFrame pz_StackFrame1_10_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_10_0 Circum: 0" );
try {
pz_Status = step1_10_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_10_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 1_11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Set"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_11_circum0");
}
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
nestedStepPage = tools.getPrimaryPage().getPage(".pxResults(<last>)");
}
PRStackFrame pz_StackFrame1_11_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_12_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_12_circum0");
}
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
nestedStepPage = tools.getPrimaryPage().getPage(".pxResults(<last>)");
}
PRStackFrame pz_StackFrame1_12_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_13_circum0");
}
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
nestedStepPage = tools.getPrimaryPage().getPage(".pxResults(<last>)");
}
PRStackFrame pz_StackFrame1_13_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_13 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_13_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_14_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_14_circum0");
}
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
ClipboardProperty embeddedPageProp = tools.getPrimaryPage().getIfPresent(".pxResults(<last>)");
nestedStepPage = embeddedPageProp == null ? null : embeddedPageProp.getPageValue();
}
PRStackFrame pz_StackFrame1_14_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_14 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_14_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_15_circum0");
}
PRStackFrame pz_StackFrame1_15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_15 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_15_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_16_circum0");
}
PRStackFrame pz_StackFrame1_16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_16 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_16_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_17_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_17_circum0");
}
if (tools.getPrimaryPage() == null) {
nestedStepPage = null;
} else { 
nestedStepPage = tools.getPrimaryPage().getPage(".pxResults(<last>)");
}
PRStackFrame pz_StackFrame1_17_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_17 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_17_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_17_circum0, false);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_0_circum0 definition

/**
 * Set the sub features properties, feature level.
 * <p>
 * Step 1.1 <code>Property-Set</code> [on page Primary.pxResults(<LAST>)] <br>
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
    pega.setViaPropRef(".pyFeatureLevel", pRef_30, myStepPage, tools.getParamValue("FeatureLevel"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyDoNotShowFeatureProgress", pRef_31, myStepPage, true, "sSN", false, true);
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
 * set the backgroung color for current application features.
 * <p>
 * Step 1.2 <code>Property-Set</code> [on page Primary.pxResults(<LAST>)] <br>
 */
public boolean step1_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(.pyProductName,Application.pyProductName)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@equals(.pyProductName,Application.pyProductName)", "FUAInstance-NullMyStepPage");
}
boolean pz_33 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_32.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pyProductName,Application.pyProductName)",pz_33);
if (!pz_33) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(.pyProductName,Application.pyProductName) " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyProductVersion==Application.pyProductVersion");
try {
boolean pz_35 = (scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_34.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProductVersion==Application.pyProductVersion",pz_35);
if (!pz_35) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyProductVersion==Application.pyProductVersion " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("Code", PropertyInfo.TYPE_TEXT, scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    pega.setViaPropRef(".pyBackGroundColor", pRef_37, myStepPage, pega.<String>resolveMethodCall("evaluateDecisionTable--(String)", "evaluateDecisionTable", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pyBackgroundColorsForFeatures" }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyFeatureTileIcon", pRef_38, myStepPage, pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, "String", new Object[] { pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "Current", "pyCaption", tools }) }), "sTN", false, true);
}
{
    pega.setViaPropRef("Top.pyDoNotShowFeatureProgress", pRef_39, myStepPage, false, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyDoNotShowFeatureProgress", pRef_31, myStepPage, false, "sSN", false, true);
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
boolean pz__1 = true;
if (pz__1) {
// branch to block title
nextBlock = "title";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "1.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_2_circum0 definition

/**
 * set the backgroung color for builton features.
 * <p>
 * Step 1.3 <code>Property-Set</code> [on page Primary.pxResults(<LAST>)] <br>
 */
public boolean step1_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyProductName!=Application.pyProductName");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyProductName!=Application.pyProductName", "FUAInstance-NullMyStepPage");
}
boolean pz_40 = (!(scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_32.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProductName!=Application.pyProductName",pz_40);
if (!pz_40) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyProductName!=Application.pyProductName " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyFeatureTileIcon", pRef_38, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "BuiltOn", "pyCaption", tools }), "sTN", false, true);
}
{
    tools.putParamValue("Code", PropertyInfo.TYPE_TEXT, 0);
}
{
    pega.setViaPropRef(".pyBackGroundColor", pRef_37, myStepPage, pega.<String>resolveMethodCall("evaluateDecisionTable--(String)", "evaluateDecisionTable", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pyBackgroundColorsForFeatures" }), "sTN", false, true);
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
boolean pz__2 = true;
if (pz__2) {
// branch to block title
nextBlock = "title";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "1.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_3_circum0 definition

/**
 * set the backgroung color for lower version features.
 * <p>
 * Step 1.4 <code>Property-Set</code> [on page Primary.pxResults(<LAST>)] <br>
 */
public boolean step1_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyProductName==Application.pyProductName");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyProductName==Application.pyProductName", "FUAInstance-NullMyStepPage");
}
boolean pz_41 = (scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_32.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProductName==Application.pyProductName",pz_41);
if (!pz_41) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyProductName==Application.pyProductName " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyProductVersion !=Application.pyProductVersion");
try {
boolean pz_42 = (!(scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_34.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProductVersion !=Application.pyProductVersion",pz_42);
if (!pz_42) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyProductVersion !=Application.pyProductVersion " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyFeatureTileIcon", pRef_38, myStepPage, scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    tools.putParamValue("Code", PropertyInfo.TYPE_TEXT, 0);
}
{
    pega.setViaPropRef(".pyBackGroundColor", pRef_37, myStepPage, pega.<String>resolveMethodCall("evaluateDecisionTable--(String)", "evaluateDecisionTable", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pyBackgroundColorsForFeatures" }), "sTN", false, true);
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
pz_CurrentStepNum = "1.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_4_circum0 definition

/**
 * Set counts if applicable and title going onwards.
 * <p>
 * Step 1.5 [title] <code>Property-Set</code><br>
 */
public boolean step1_5_circum0() {
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
    tools.putParamValue("FeatureID", PropertyInfo.TYPE_TEXT, scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    pega.setViaPropRef(".pyTotalWorkItemsCount", pRef_44, myStepPage, 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenBugCount", pRef_45, myStepPage, 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenUserStoryCount", pRef_46, myStepPage, 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenFeedbackCount", pRef_47, myStepPage, 0, "sNN", false, true);
}
{
    BugCount = 0;
}
{
    UserStoryCount = 0;
}
{
    FeedbackCount = 0;
}
{
    WorkItemCount = 0;
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
pz_CurrentStepNum = "1.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_5_circum0 definition

/**
 * If Integrated , Jump to later step.
 * <p>
 * Step 1.6 <code>Page-Copy</code> [on page AssetsList] <br>
 */
public boolean step1_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__3 = pega.invokeWhen("pzIsIntegrated", "Data-Application-Feature", "Code-Pega-List");
if (!pz__3) {
// branch to block NonInt
nextBlock = "NonInt";
pega.activityStepSkipped("Jump To Step");
return false;
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
// Expression: TempAssetsList
targetPage = tools.findPage("TempAssetsList", false);
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
pz_CurrentStepNum = "1.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_6_circum0 definition

/**
 * Filter out the instance corresponding to this feature.
 * <p>
 * Step 1.7 <code>Obj-Filter</code><br>
 */
public boolean step1_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Filter", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Filter
// Expression: TempAssetsList
// Expression: Pega-Agile-Work

//Filtering of result set starts here.
ClipboardPage contentPage = tools.findPage("TempAssetsList");
if (contentPage == null) {
throw new PRRuntimeException("TempAssetsList","this page does not exist and cannot be shown");
}
ParameterPage paramPage = tools.getParameterPage();
ClipboardProperty cp_Results = contentPage.getProperty("pxResults");
for (int i = cp_Results.size(); i >= 1; i--) {
ClipboardPage cp_ResultPage = cp_Results.getPageValue(i);
PRStackFrame resultPage_Frame = pega.pushStackFrame("Obj-Filter", paramPage , cp_ResultPage, false, false);
myStepPage = tools.getStepPage();
try {
boolean resultWhen_0 = pega.invokeWhen("pzIsCurrentFeature", "Data-Application-Feature", "Pega-Agile-Work");
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
pz_CurrentStepNum = "1.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_7_circum0 definition

/**
 * Set work item count.
 * <p>
 * Step 1.8.0 <code>Property-Set</code> [on page TempAssetsList.pxResults] <br>
 */
public boolean step1_8_0_circum0() {
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
    WorkItemCount = (WorkItemCount + 1);
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

// Code to call nested step 1_8_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.8.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_8_1_circum0");
}
PRStackFrame pz_StackFrame1_8_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_8_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_8_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_8_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_8_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.8.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_8_2_circum0");
}
PRStackFrame pz_StackFrame1_8_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_8_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_8_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_8_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_8_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.8.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_8_3_circum0");
}
PRStackFrame pz_StackFrame1_8_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_8_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_8_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_8_3_circum0, false);
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
pz_CurrentStepNum = "1.8.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_8_0_circum0 definition

/**
 * Set user story count.
 * <p>
 * Step 1.8.1 <code>Property-Set</code><br>
 */
public boolean step1_8_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__5 = pega.invokeWhen("pzIsOpenUserStory", "Data-Application-Feature", "Pega-Agile-Work");
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
    UserStoryCount = (UserStoryCount + 1);
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
pz_CurrentStepNum = "1.8.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_8_1_circum0 definition

/**
 * Set bug count.
 * <p>
 * Step 1.8.2 <code>Property-Set</code><br>
 */
public boolean step1_8_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__7 = pega.invokeWhen("pzIsOpenBug", "Data-Application-Feature", "Pega-Agile-Work");
if (!pz__7) {
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
    BugCount = (BugCount + 1);
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
pz_CurrentStepNum = "1.8.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_8_2_circum0 definition

/**
 * Set feedback count.
 * <p>
 * Step 1.8.3 <code>Property-Set</code><br>
 */
public boolean step1_8_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__9 = pega.invokeWhen("pzIsOpenFeedback", "Data-Application-Feature", "Pega-Agile-Work");
if (!pz__9) {
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
    FeedbackCount = (FeedbackCount + 1);
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
pz_CurrentStepNum = "1.8.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_8_3_circum0 definition

/**
 * Jump to Later Step "Set".
 * <p>
 * Step 1.9 <code>Java</code><br>
 */
public boolean step1_9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__11 = true;
if (pz__11) {
// branch to block Set
nextBlock = "Set";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "1.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_9_circum0 definition

/**
 * Set work item count.
 * <p>
 * Step 1.10.0 [NonInt] <code>Property-Set</code> [on page AssetsList.pxResults] <br>
 */
public boolean step1_10_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.FeatureID==.pyFeatureID");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("Param.FeatureID==.pyFeatureID", "FUAInstance-NullMyStepPage");
}
boolean pz_48 = (tools.getParamValue("FeatureID").equals(scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.FeatureID==.pyFeatureID",pz_48);
if (!pz_48) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.FeatureID==.pyFeatureID " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    WorkItemCount = (WorkItemCount + scalarValueQuery_49.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER));
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

// Code to call nested step 1_10_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.10.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_10_1_circum0");
}
PRStackFrame pz_StackFrame1_10_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_10_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_10_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_10_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_10_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.10.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_10_2_circum0");
}
PRStackFrame pz_StackFrame1_10_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_10_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_10_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_10_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_10_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.10.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_10_3_circum0");
}
PRStackFrame pz_StackFrame1_10_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT Step: 1_10_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_10_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_10_3_circum0, false);
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
pz_CurrentStepNum = "1.10.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_10_0_circum0 definition

/**
 * Set user story count.
 * <p>
 * Step 1.10.1 <code>Property-Set</code><br>
 */
public boolean step1_10_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__12 = pega.invokeWhen("pzIsOpenUserStory", "Data-Application-Feature", "Pega-Agile-Work");
if (!pz__12) {
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    UserStoryCount = (UserStoryCount + scalarValueQuery_49.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER));
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
pz_CurrentStepNum = "1.10.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_10_1_circum0 definition

/**
 * Set bug count.
 * <p>
 * Step 1.10.2 <code>Property-Set</code><br>
 */
public boolean step1_10_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__14 = pega.invokeWhen("pzIsOpenBug", "Data-Application-Feature", "Pega-Agile-Work");
if (!pz__14) {
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    BugCount = (BugCount + scalarValueQuery_49.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER));
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
pz_CurrentStepNum = "1.10.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_10_2_circum0 definition

/**
 * Set feedback count.
 * <p>
 * Step 1.10.3 <code>Property-Set</code><br>
 */
public boolean step1_10_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__16 = pega.invokeWhen("pzIsOpenFeedback", "Data-Application-Feature", "Pega-Agile-Work");
if (!pz__16) {
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    FeedbackCount = (FeedbackCount + scalarValueQuery_49.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER));
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
pz_CurrentStepNum = "1.10.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_10_3_circum0 definition

/**
 * Set final counts on work item.
 * <p>
 * Step 1.11 [Set] <code>Property-Set</code> [on page Primary.pxResults(<LAST>)] <br>
 */
public boolean step1_11_circum0() {
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
    pega.setViaPropRef(".pyOpenUserStoryCount", pRef_46, myStepPage, UserStoryCount, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenBugCount", pRef_45, myStepPage, BugCount, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenFeedbackCount", pRef_47, myStepPage, FeedbackCount, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyTotalWorkItemsCount", pRef_44, myStepPage, WorkItemCount, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyResolvedWorkItemsCount", pRef_50, myStepPage, (scalarValueQuery_51.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER) - ((scalarValueQuery_52.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER) + scalarValueQuery_53.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER)) + scalarValueQuery_54.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER))), "sNN", false, true);
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
pz_CurrentStepNum = "1.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_11_circum0 definition

/**
 * Set the lp title, set the featurelevel for next child features.
 * <p>
 * Step 1.12 <code>Property-Set</code> [on page Primary.pxResults(<LAST>)] <br>
 */
public boolean step1_12_circum0() {
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
    pega.setViaPropRef(".pyTitle", pRef_55, myStepPage, ((scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + ": ") + scalarValueQuery_56.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyProjectFeatureURL", pRef_57, myStepPage, ((((((scalarValueQuery_58.resolveToString(tools, pega.findPageWithException("D_pzPegaProjectURL", "Pega-Int-PAT"), ImmutablePropertyInfo.TYPE_TEXT) + "?pyActivity=Data-Portal.OpenAsset&Asset=") + scalarValueQuery_59.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + "&Product=") + scalarValueQuery_60.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + "&Release=") + scalarValueQuery_61.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}
{
    featureLevel = 0;
}
{
    featureLevel = scalarValueQuery_36.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    featureLevel = (featureLevel + 1);
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
pz_CurrentStepNum = "1.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_12_circum0 definition

/**
 * Increment current subfeature count by 1 if it is current version.
 * <p>
 * Step 1.13 <code>Property-Set</code> [on page Primary.pxResults(<LAST>)] <br>
 */
public boolean step1_13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyBackGroundColor==\"#227bc4\" || .pyFeatureTileIcon==\"CURRENT\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyBackGroundColor==\"#227bc4\" || .pyFeatureTileIcon==\"CURRENT\"", "FUAInstance-NullMyStepPage");
}
boolean pz_64 = ((scalarValueQuery_62.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("#227bc4")) || (scalarValueQuery_63.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("CURRENT")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyBackGroundColor==\"#227bc4\" || .pyFeatureTileIcon==\"CURRENT\"",pz_64);
if (!pz_64) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyBackGroundColor==\"#227bc4\" || .pyFeatureTileIcon==\"CURRENT\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyCurrentSubFeatureCount", pRef_65, myStepPage, (scalarValueQuery_66.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER) + 1), "sNN", false, true);
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
pz_CurrentStepNum = "1.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_13_circum0 definition

/**
 * Call the same activity to populate the Child features for this feature.
 * <p>
 * Step 1.14 <code>Call pzPopulateChildFeatures</code> [on page Primary.pxResults(<LAST>)] <br>
 */
public boolean step1_14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzPopulateChildFeatures");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzPopulateChildFeatures", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzPopulateChildFeatures
if (myStepPage == null) {
if (tools.getPrimaryPage() == null) {
myStepPage = null;
} else { 
myStepPage = tools.getPrimaryPage().getPage(".pxResults(<last>)");
}
}
// Calling Activity : pzPopulateChildFeatures

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: local.featureLevel
String pz_68 = Integer.toString(featureLevel);
newParamsPage.putParamValue("FeatureLevel", PropertyInfo.TYPE_TEXT, pz_68);
// Expression: .pyCopiedFrom
if (myStepPage == null) {
throw new InvalidReferenceException(".pyCopiedFrom", "FUAInstance-NullMyStepPage");
}
newParamsPage.putParamValue("ParentCopiedID", PropertyInfo.TYPE_TEXT, scalarValueQuery_69.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
// Expression: .pyFeatureID
newParamsPage.putParamValue("ParentFeatureID", PropertyInfo.TYPE_TEXT, scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzPopulateChildFeatures", "Data-Application-Feature", "");
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
pz_CurrentStepNum = "1.14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzPopulateChildFeatures",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_14_circum0 definition

/**
 * Set Counts on parent.
 * <p>
 * Step 1.15 <code>Property-Set</code><br>
 */
public boolean step1_15_circum0() {
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
    pega.setViaPropRef(".pyOpenUserStoryCount", pRef_46, tools.getPrimaryPage(), (scalarValueQuery_52.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + pega.getIntegerValueViaPropRef(".pxResults(<last>).pyOpenUserStoryCount", pRef_70, tools.getPrimaryPage(), false, false, false)), "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenBugCount", pRef_45, tools.getPrimaryPage(), (scalarValueQuery_53.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + pega.getIntegerValueViaPropRef(".pxResults(<last>).pyOpenBugCount", pRef_71, tools.getPrimaryPage(), false, false, false)), "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenFeedbackCount", pRef_47, tools.getPrimaryPage(), (scalarValueQuery_54.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + pega.getIntegerValueViaPropRef(".pxResults(<last>).pyOpenFeedbackCount", pRef_72, tools.getPrimaryPage(), false, false, false)), "sNN", false, true);
}
{
    pega.setViaPropRef(".pyTotalWorkItemsCount", pRef_44, tools.getPrimaryPage(), (scalarValueQuery_51.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + pega.getIntegerValueViaPropRef(".pxResults(<last>).pyTotalWorkItemsCount", pRef_73, tools.getPrimaryPage(), false, false, false)), "sNN", false, true);
}
{
    pega.setViaPropRef(".pyResolvedWorkItemsCount", pRef_50, tools.getPrimaryPage(), (scalarValueQuery_74.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + pega.getIntegerValueViaPropRef(".pxResults(<last>).pyResolvedWorkItemsCount", pRef_75, tools.getPrimaryPage(), false, false, false)), "sNN", false, true);
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
pz_CurrentStepNum = "1.15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_15_circum0 definition

/**
 * Calculating current subfeature count for parent feature.
 * <p>
 * Step 1.16 <code>Property-Set</code><br>
 */
public boolean step1_16_circum0() {
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
    pega.setViaPropRef(".pyCurrentSubFeatureCount", pRef_65, tools.getPrimaryPage(), (scalarValueQuery_66.resolveToInt(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_INTEGER) + pega.getIntegerValueViaPropRef(".pxResults(<last>).pyCurrentSubFeatureCount", pRef_76, tools.getPrimaryPage(), false, false, false)), "sNN", false, true);
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
pz_CurrentStepNum = "1.16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_16_circum0 definition

/**
 * Decrement current subfeature count by 1 if it is current version to give actual count.
 * <p>
 * Step 1.17 <code>Property-Set</code> [on page Primary.pxResults(<LAST>)] <br>
 */
public boolean step1_17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyBackGroundColor==\"#227bc4\" || .pyFeatureTileIcon==\"CURRENT\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyBackGroundColor==\"#227bc4\" || .pyFeatureTileIcon==\"CURRENT\"", "FUAInstance-NullMyStepPage");
}
boolean pz_77 = ((scalarValueQuery_62.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("#227bc4")) || (scalarValueQuery_63.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("CURRENT")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyBackGroundColor==\"#227bc4\" || .pyFeatureTileIcon==\"CURRENT\"",pz_77);
if (!pz_77) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyBackGroundColor==\"#227bc4\" || .pyFeatureTileIcon==\"CURRENT\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyCurrentSubFeatureCount", pRef_65, myStepPage, (scalarValueQuery_66.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER) - 1), "sNN", false, true);
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
pz_CurrentStepNum = "1.17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_17_circum0 definition

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

public int UserStoryCount = 0;
public int BugCount = 0;
public int WorkItemCount = 0;
public int FeedbackCount = 0;
public int featureLevel = 0;

public void initializeUserLocalVariables() {
	UserStoryCount = 0;
	BugCount = 0;
	WorkItemCount = 0;
	FeedbackCount = 0;
	featureLevel = 0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("UserStoryCount", Integer.toString(UserStoryCount));
	smRetVal.putString("BugCount", Integer.toString(BugCount));
	smRetVal.putString("WorkItemCount", Integer.toString(WorkItemCount));
	smRetVal.putString("FeedbackCount", Integer.toString(FeedbackCount));
	smRetVal.putString("featureLevel", Integer.toString(featureLevel));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_37 = new String[] { "", "", "pyBackGroundColor", "" };
public static final String[] pRef_72 = new String[] { "", "", "pxResults", "<last>", "pyOpenFeedbackCount", "" };
public static final String[] pRef_46 = new String[] { "", "", "pyOpenUserStoryCount", "" };
public static final String[] pRef_50 = new String[] { "", "", "pyResolvedWorkItemsCount", "" };
public static final String[] pRef_38 = new String[] { "", "", "pyFeatureTileIcon", "" };
public static final String[] pRef_70 = new String[] { "", "", "pxResults", "<last>", "pyOpenUserStoryCount", "" };
public static final String[] pRef_76 = new String[] { "", "", "pxResults", "<last>", "pyCurrentSubFeatureCount", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyFeatureLevel", "" };
public static final String[] pRef_31 = new String[] { "", "", "pyDoNotShowFeatureProgress", "" };
public static final String[] pRef_57 = new String[] { "", "", "pyProjectFeatureURL", "" };
public static final String[] pRef_75 = new String[] { "", "", "pxResults", "<last>", "pyResolvedWorkItemsCount", "" };
public static final String[] pRef_73 = new String[] { "", "", "pxResults", "<last>", "pyTotalWorkItemsCount", "" };
public static final String[] pRef_39 = new String[] { "Top", "", "pyDoNotShowFeatureProgress", "" };
public static final String[] pRef_71 = new String[] { "", "", "pxResults", "<last>", "pyOpenBugCount", "" };
public static final String[] pRef_45 = new String[] { "", "", "pyOpenBugCount", "" };
public static final String[] pRef_65 = new String[] { "", "", "pyCurrentSubFeatureCount", "" };
public static final String[] pRef_55 = new String[] { "", "", "pyTitle", "" };
public static final String[] pRef_44 = new String[] { "", "", "pyTotalWorkItemsCount", "" };
public static final String[] pRef_47 = new String[] { "", "", "pyOpenFeedbackCount", "" };
private static final ScalarValueQuery scalarValueQuery_63 = FUAUtil.createQueryBuilder().scalarProperty("pyFeatureTileIcon").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_59 = FUAUtil.createQueryBuilder().scalarProperty("pyPMFFeatureID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_54 = FUAUtil.createQueryBuilder().scalarProperty("pyOpenFeedbackCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_60 = FUAUtil.createQueryBuilder().scalarProperty("pyProductID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().scalarList("pySummaryCount", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyParentFeatureID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_58 = FUAUtil.createQueryBuilder().scalarProperty("pyPegaProjectURL").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().scalarProperty("pyProductVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().scalarProperty("pyFeatureID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_52 = FUAUtil.createQueryBuilder().scalarProperty("pyOpenUserStoryCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_53 = FUAUtil.createQueryBuilder().scalarProperty("pyOpenBugCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_66 = FUAUtil.createQueryBuilder().scalarProperty("pyCurrentSubFeatureCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_69 = FUAUtil.createQueryBuilder().scalarProperty("pyCopiedFrom").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_62 = FUAUtil.createQueryBuilder().scalarProperty("pyBackGroundColor").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_32 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_61 = FUAUtil.createQueryBuilder().scalarProperty("pyReleaseID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_74 = FUAUtil.createQueryBuilder().scalarProperty("pyResolvedWorkItemsCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().scalarProperty("pyFeatureLevel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_56 = FUAUtil.createQueryBuilder().scalarProperty("pyFeatureName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_51 = FUAUtil.createQueryBuilder().scalarProperty("pyTotalWorkItemsCount").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-APPLICATION-FEATURE PZPOPULATECHILDFEATURES #20191023T095840.039 GMT", "Data-Application-Feature pzPopulateChildFeatures", "Pega-AppDefinition", "08-04-01", false, true, "", "ACTIVITY", "20191023T095840.039 GMT" ,"Rule-Obj-Activity"); }
