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
public class ra_action_pzpopulatefeaturetree_0318ae90d878d7ef0387b3726b80d61d extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzPopulateFeatureTree.Code_Pega_List.Action");
	public ra_action_pzpopulatefeaturetree_0318ae90d878d7ef0387b3726b80d61d(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT	Pega-AppDefinition:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT";
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
ClipboardProperty pz_5 = pega.findPageWithException("FeaturesList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_5;
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 1 Circum: 0" );
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

// Code to call step 2_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_10 = tools.getPrimaryPage().getIfPresent("pxResults");
pageRef = pz_10;
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
PRStackFrame pz_StackFrame2_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_0 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
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
	"Rule-Obj-Activity:PZPOPULATEFEATURETREE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPOPULATEFEATURETREE","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-AppDefinition","08-01-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT","!PZPOPULATEFEATURETREE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",20391517)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT:20180713T141832.071 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "592c0fe520df87db4fe41956722bfdf0";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Action";
}
/**
 * Copy the top level features to data page.
 * <p>
 * Step 1 <code>Page-Copy</code> [on page FeaturesList.pxResults] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.IsSubFeatureContext &amp;&amp; (Param.parentFeatureID==.pyParentFeatureID ||Param.CopiedFrom ==.pyParentFeatureID)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("Param.IsSubFeatureContext && (Param.parentFeatureID==.pyParentFeatureID ||Param.CopiedFrom ==.pyParentFeatureID)", "FUAInstance-NullMyStepPage");
}
boolean pz_7 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "IsSubFeatureContext") && ((tools.getParamValue("parentFeatureID").equals(scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT))) || (tools.getParamValue("CopiedFrom").equals(scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.IsSubFeatureContext &amp;&amp; (Param.parentFeatureID==.pyParentFeatureID ||Param.CopiedFrom ==.pyParentFeatureID)",pz_7);
if (pz_7) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.IsSubFeatureContext &amp;&amp; (Param.parentFeatureID==.pyParentFeatureID ||Param.CopiedFrom ==.pyParentFeatureID) " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyParentFeatureID==\"\"");
try {
boolean pz_8 = (scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyParentFeatureID==\"\"",pz_8);
if (!pz_8) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyParentFeatureID==\"\" " + anyException.getMessage(), anyException);
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
ClipboardPage pz_9 = tools.getPrimaryPage().getProperty(".pxResults(<append>)").getPageValue();
targetPage = pz_9;
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Fetch the child features for each toplevel page.
 * <p>
 * Step 2.0 <code>Property-Set</code> [on page Primary.pxResults] <br>
 */
public boolean step2_0_circum0() {
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
    parentFeatureID = scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    parentCopiedID = (((!(scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) && (!(scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT))))) ? scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) : "");
}
{
    pega.setViaPropRef(".pyDoNotShowFeatureProgress", pRef_13, myStepPage, false, "sSN", false, true);
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

// Code to call nested step 2_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_1_circum0");
}
PRStackFrame pz_StackFrame2_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_2 Circum: 0" );
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
PRStackFrame pz_StackFrame2_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_3 Circum: 0" );
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
if ((nextBlock.equals("") || nextBlock.equals("bg"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_4_circum0");
}
PRStackFrame pz_StackFrame2_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_4 Circum: 0" );
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

// Code to call nested step 2_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_5_circum0");
}
PRStackFrame pz_StackFrame2_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_6_circum0");
}
PRStackFrame pz_StackFrame2_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("title"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_7_circum0");
}
PRStackFrame pz_StackFrame2_7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_8_circum0");
}
String pz_14 = "AssetsList";
nestedStepPage = tools.findPage(pz_14, true);
PRStackFrame pz_StackFrame2_8_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_9_circum0");
}
PRStackFrame pz_StackFrame2_9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_10_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_15 = pega.findPageWithException("TempAssetsList", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_15;
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
pz_CurrentStepNum = "2.10.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_10_0_circum0");
}
PRStackFrame pz_StackFrame2_10_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_10_0 Circum: 0" );
try {
pz_Status = step2_10_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_10_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 2_11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_11_circum0");
}
PRStackFrame pz_StackFrame2_11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_12_0_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("NonInt"))) {
nextBlock = "";
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_16 = pega.findPageWithException("AssetsList", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_16;
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
pz_CurrentStepNum = "2.12.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_12_0_circum0");
}
PRStackFrame pz_StackFrame2_12_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_12_0 Circum: 0" );
try {
pz_Status = step2_12_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_12_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 2_13_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Set"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_13_circum0");
}
PRStackFrame pz_StackFrame2_13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_13 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_13_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_14_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_14_circum0");
}
PRStackFrame pz_StackFrame2_14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_14 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_14_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_15_circum0");
}
PRStackFrame pz_StackFrame2_15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_15 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_15_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_15_circum0, false);
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
pz_CurrentStepNum = "2.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_0_circum0 definition

/**
 * Set the parent feature properties.
 * <p>
 * Step 2.1 <code>Java</code><br>
 */
public boolean step2_1_circum0() {
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
pz_CurrentStepNum = "2.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_1_circum0 definition

/**
 * Set level of feature in the hierarchy.
 * <p>
 * Step 2.2 <code>Property-Set</code><br>
 */
public boolean step2_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.IsSubFeatureContext");
try {
boolean pz_17 = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "IsSubFeatureContext");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.IsSubFeatureContext",pz_17);
if (pz_17) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.IsSubFeatureContext " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyFeatureLevel", pRef_18, myStepPage, "1", "sTN", false, true);
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
// branch to block bg
nextBlock = "bg";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_2_circum0 definition

/**
 * Step 2.3 <code>Property-Set</code><br>
 */
public boolean step2_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.IsSubFeatureContext");
try {
boolean pz_19 = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "IsSubFeatureContext");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.IsSubFeatureContext",pz_19);
if (!pz_19) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.IsSubFeatureContext " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyFeatureLevel", pRef_18, myStepPage, Integer.toString((tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "featureLevel") + 1)), "sTN", false, true);
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
pz_CurrentStepNum = "2.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_3_circum0 definition

/**
 * set the backgroung color for current application features.
 * <p>
 * Step 2.4 [bg] <code>Property-Set</code><br>
 */
public boolean step2_4_circum0() {
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
boolean pz_21 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pyProductName,Application.pyProductName)",pz_21);
if (!pz_21) {
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
boolean pz_23 = (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProductVersion==Application.pyProductVersion",pz_23);
if (!pz_23) {
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
    tools.putParamValue("Code", PropertyInfo.TYPE_TEXT, scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    pega.setViaPropRef(".pyBackGroundColor", pRef_25, myStepPage, pega.<String>resolveMethodCall("evaluateDecisionTable--(String)", "evaluateDecisionTable", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pyBackgroundColorsForFeatures" }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyFeatureTileIcon", pRef_26, myStepPage, pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", null, "String", new Object[] { pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "Current", "pyCaption", tools }) }), "sTN", false, true);
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
pz_CurrentStepNum = "2.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_4_circum0 definition

/**
 * set the backgroung color for builton features.
 * <p>
 * Step 2.5 <code>Property-Set</code><br>
 */
public boolean step2_5_circum0() {
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
boolean pz_27 = (!(scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProductName!=Application.pyProductName",pz_27);
if (!pz_27) {
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
    pega.setViaPropRef(".pyFeatureTileIcon", pRef_26, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "BuiltOn", "pyCaption", tools }), "sTN", false, true);
}
{
    tools.putParamValue("Code", PropertyInfo.TYPE_TEXT, 0);
}
{
    pega.setViaPropRef(".pyBackGroundColor", pRef_25, myStepPage, pega.<String>resolveMethodCall("evaluateDecisionTable--(String)", "evaluateDecisionTable", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pyBackgroundColorsForFeatures" }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyDoNotShowFeatureProgress", pRef_13, myStepPage, true, "sSN", false, true);
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
boolean pz__3 = true;
if (pz__3) {
// branch to block title
nextBlock = "title";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_5_circum0 definition

/**
 * set the backgroung color for lower version features.
 * <p>
 * Step 2.6 <code>Property-Set</code><br>
 */
public boolean step2_6_circum0() {
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
boolean pz_28 = (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProductName==Application.pyProductName",pz_28);
if (!pz_28) {
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
boolean pz_29 = (!(scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyProductVersion !=Application.pyProductVersion",pz_29);
if (!pz_29) {
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
    pega.setViaPropRef(".pyFeatureTileIcon", pRef_26, myStepPage, scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    tools.putParamValue("Code", PropertyInfo.TYPE_TEXT, 0);
}
{
    pega.setViaPropRef(".pyBackGroundColor", pRef_25, myStepPage, pega.<String>resolveMethodCall("evaluateDecisionTable--(String)", "evaluateDecisionTable", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pyBackgroundColorsForFeatures" }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyDoNotShowFeatureProgress", pRef_13, myStepPage, true, "sSN", false, true);
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
pz_CurrentStepNum = "2.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_6_circum0 definition

/**
 * Set counts if applicable and title going onwards.
 * <p>
 * Step 2.7 [title] <code>Property-Set</code><br>
 */
public boolean step2_7_circum0() {
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
    tools.putParamValue("FeatureID", PropertyInfo.TYPE_TEXT, scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}
{
    pega.setViaPropRef(".pyTotalWorkItemsCount", pRef_30, myStepPage, 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenBugCount", pRef_31, myStepPage, 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenUserStoryCount", pRef_32, myStepPage, 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenFeedbackCount", pRef_33, myStepPage, 0, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyCurrentSubFeatureCount", pRef_34, myStepPage, 0, "sNN", false, true);
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
pz_CurrentStepNum = "2.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_7_circum0 definition

/**
 * This step is needed as AssetsList page will be used in recursive activity pzPopulateChildFeatures.
 * <p>
 * Step 2.8 <code>Page-Copy</code> [on page AssetsList] <br>
 */
public boolean step2_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__4 = pega.invokeWhen("pzIsIntegrated", "Code-Pega-List", "Code-Pega-List");
if (!pz__4) {
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
pz_CurrentStepNum = "2.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_8_circum0 definition

/**
 * Filter out the instance corresponding to this feature.
 * <p>
 * Step 2.9 <code>Obj-Filter</code><br>
 */
public boolean step2_9_circum0() {
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
boolean resultWhen_0 = pega.invokeWhen("pzIsCurrentFeature", "Code-Pega-List", "Pega-Agile-Work");
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
pz_CurrentStepNum = "2.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Filter",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_9_circum0 definition

/**
 * Set work item count.
 * <p>
 * Step 2.10.0 <code>Property-Set</code> [on page TempAssetsList.pxResults] <br>
 */
public boolean step2_10_0_circum0() {
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

// Code to call nested step 2_10_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.10.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_10_1_circum0");
}
PRStackFrame pz_StackFrame2_10_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_10_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_10_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_10_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_10_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.10.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_10_2_circum0");
}
PRStackFrame pz_StackFrame2_10_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_10_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_10_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_10_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_10_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.10.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_10_3_circum0");
}
PRStackFrame pz_StackFrame2_10_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_10_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_10_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_10_3_circum0, false);
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
pz_CurrentStepNum = "2.10.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_10_0_circum0 definition

/**
 * Set user story count.
 * <p>
 * Step 2.10.1 <code>Property-Set</code><br>
 */
public boolean step2_10_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__6 = pega.invokeWhen("pzIsOpenUserStory", "Code-Pega-List", "Pega-Agile-Work");
if (!pz__6) {
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
pz_CurrentStepNum = "2.10.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_10_1_circum0 definition

/**
 * Set bug count.
 * <p>
 * Step 2.10.2 <code>Property-Set</code><br>
 */
public boolean step2_10_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__8 = pega.invokeWhen("pzIsOpenBug", "Code-Pega-List", "Pega-Agile-Work");
if (!pz__8) {
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
pz_CurrentStepNum = "2.10.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_10_2_circum0 definition

/**
 * Set feedback count.
 * <p>
 * Step 2.10.3 <code>Property-Set</code><br>
 */
public boolean step2_10_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__10 = pega.invokeWhen("pzIsOpenFeedback", "Code-Pega-List", "Pega-Agile-Work");
if (!pz__10) {
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
pz_CurrentStepNum = "2.10.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_10_3_circum0 definition

/**
 * Jump to Later Step "Set".
 * <p>
 * Step 2.11 <code>Java</code><br>
 */
public boolean step2_11_circum0() {
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
boolean pz__12 = true;
if (pz__12) {
// branch to block Set
nextBlock = "Set";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_11_circum0 definition

/**
 * Set work item count.
 * <p>
 * Step 2.12.0 [NonInt] <code>Property-Set</code> [on page AssetsList.pxResults] <br>
 */
public boolean step2_12_0_circum0() {
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
boolean pz_35 = (tools.getParamValue("FeatureID").equals(scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.FeatureID==.pyFeatureID",pz_35);
if (!pz_35) {
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
    WorkItemCount = (WorkItemCount + scalarValueQuery_36.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER));
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

// Code to call nested step 2_12_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.12.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_12_1_circum0");
}
PRStackFrame pz_StackFrame2_12_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_12_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_12_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_12_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_12_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.12.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_12_2_circum0");
}
PRStackFrame pz_StackFrame2_12_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_12_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_12_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_12_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 2_12_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.12.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_12_3_circum0");
}
PRStackFrame pz_StackFrame2_12_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT Step: 2_12_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step2_12_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame2_12_3_circum0, false);
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
pz_CurrentStepNum = "2.12.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_12_0_circum0 definition

/**
 * Set user story count.
 * <p>
 * Step 2.12.1 <code>Property-Set</code><br>
 */
public boolean step2_12_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__13 = pega.invokeWhen("pzIsOpenUserStory", "Code-Pega-List", "Pega-Agile-Work");
if (!pz__13) {
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
    UserStoryCount = (UserStoryCount + scalarValueQuery_36.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER));
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
pz_CurrentStepNum = "2.12.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_12_1_circum0 definition

/**
 * Set bug count.
 * <p>
 * Step 2.12.2 <code>Property-Set</code><br>
 */
public boolean step2_12_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__15 = pega.invokeWhen("pzIsOpenBug", "Code-Pega-List", "Pega-Agile-Work");
if (!pz__15) {
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
    BugCount = (BugCount + scalarValueQuery_36.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER));
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
pz_CurrentStepNum = "2.12.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_12_2_circum0 definition

/**
 * Set feedback count.
 * <p>
 * Step 2.12.3 <code>Property-Set</code><br>
 */
public boolean step2_12_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__17 = pega.invokeWhen("pzIsOpenFeedback", "Code-Pega-List", "Pega-Agile-Work");
if (!pz__17) {
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
    FeedbackCount = (FeedbackCount + scalarValueQuery_36.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER));
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
pz_CurrentStepNum = "2.12.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_12_3_circum0 definition

/**
 * Set final counts on work item.
 * <p>
 * Step 2.13 [Set] <code>Property-Set</code><br>
 */
public boolean step2_13_circum0() {
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
    pega.setViaPropRef(".pyTotalWorkItemsCount", pRef_30, myStepPage, WorkItemCount, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenBugCount", pRef_31, myStepPage, BugCount, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenUserStoryCount", pRef_32, myStepPage, UserStoryCount, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyOpenFeedbackCount", pRef_33, myStepPage, FeedbackCount, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyResolvedWorkItemsCount", pRef_37, myStepPage, (scalarValueQuery_38.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER) - ((scalarValueQuery_39.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER) + scalarValueQuery_40.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER)) + scalarValueQuery_41.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER))), "sNN", false, true);
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
pz_CurrentStepNum = "2.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_13_circum0 definition

/**
 * Set the lp title, set the featurelevel for child features.
 * <p>
 * Step 2.14 <code>Property-Set</code><br>
 */
public boolean step2_14_circum0() {
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
    pega.setViaPropRef(".pyTitle", pRef_42, myStepPage, ((scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + ": ") + scalarValueQuery_43.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyProjectFeatureURL", pRef_44, myStepPage, ((((((scalarValueQuery_45.resolveToString(tools, pega.findPageWithException("D_pzPegaProjectURL", "Pega-Int-PAT"), ImmutablePropertyInfo.TYPE_TEXT) + "?pyActivity=Data-Portal.OpenAsset&Asset=") + scalarValueQuery_46.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + "&Product=") + scalarValueQuery_47.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + "&Release=") + scalarValueQuery_48.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}
{
    featureLevel = scalarValueQuery_24.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
pz_CurrentStepNum = "2.14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_14_circum0 definition

/**
 * populate the child features.
 * <p>
 * Step 2.15 <code>Call pzPopulateChildFeatures</code><br>
 */
public boolean step2_15_circum0() {
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
}
// Calling Activity : pzPopulateChildFeatures

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: local.parentFeatureID
newParamsPage.putParamValue("ParentFeatureID", PropertyInfo.TYPE_TEXT, parentFeatureID);
// Expression: local.parentCopiedID
newParamsPage.putParamValue("ParentCopiedID", PropertyInfo.TYPE_TEXT, parentCopiedID);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: local.featureLevel
String pz_49 = Integer.toString(featureLevel);
newParamsPage.putParamValue("FeatureLevel", PropertyInfo.TYPE_TEXT, pz_49);

pega.invokeActivity(myStepPage, newParamsPage, "pzPopulateChildFeatures", "Code-Pega-List", "");
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
pz_CurrentStepNum = "2.15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzPopulateChildFeatures",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_15_circum0 definition

/**
 * Remove Asset Page.
 * <p>
 * Step 3 <code>Page-Remove</code><br>
 */
public boolean step3_circum0() {
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
// Expression: TempAssetsList
pageRemove(tools.findPage("TempAssetsList"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

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
public String parentFeatureID = "";
public String parentCopiedID = "";
public int BugCount = 0;
public int WorkItemCount = 0;
public int FeedbackCount = 0;
public int featureLevel = 0;

public void initializeUserLocalVariables() {
	UserStoryCount = 0;
	parentFeatureID = "";
	parentCopiedID = "";
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
	smRetVal.putString("parentFeatureID", (parentFeatureID == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : parentFeatureID.toString());
	smRetVal.putString("parentCopiedID", (parentCopiedID == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : parentCopiedID.toString());
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

public static final String[] pRef_18 = new String[] { "", "", "pyFeatureLevel", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyDoNotShowFeatureProgress", "" };
public static final String[] pRef_44 = new String[] { "", "", "pyProjectFeatureURL", "" };
public static final String[] pRef_25 = new String[] { "", "", "pyBackGroundColor", "" };
public static final String[] pRef_31 = new String[] { "", "", "pyOpenBugCount", "" };
public static final String[] pRef_34 = new String[] { "", "", "pyCurrentSubFeatureCount", "" };
public static final String[] pRef_42 = new String[] { "", "", "pyTitle", "" };
public static final String[] pRef_32 = new String[] { "", "", "pyOpenUserStoryCount", "" };
public static final String[] pRef_37 = new String[] { "", "", "pyResolvedWorkItemsCount", "" };
public static final String[] pRef_26 = new String[] { "", "", "pyFeatureTileIcon", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyTotalWorkItemsCount", "" };
public static final String[] pRef_33 = new String[] { "", "", "pyOpenFeedbackCount", "" };
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().scalarProperty("pyPMFFeatureID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_41 = FUAUtil.createQueryBuilder().scalarProperty("pyOpenFeedbackCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_47 = FUAUtil.createQueryBuilder().scalarProperty("pyProductID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().scalarList("pySummaryCount", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pyParentFeatureID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_45 = FUAUtil.createQueryBuilder().scalarProperty("pyPegaProjectURL").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pyFeatureID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pyProductVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_39 = FUAUtil.createQueryBuilder().scalarProperty("pyOpenUserStoryCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().scalarProperty("pyOpenBugCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyCopiedFrom").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_48 = FUAUtil.createQueryBuilder().scalarProperty("pyReleaseID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pyFeatureLevel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().scalarProperty("pyFeatureName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_38 = FUAUtil.createQueryBuilder().scalarProperty("pyTotalWorkItemsCount").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZPOPULATEFEATURETREE #20180713T141832.071 GMT", "Code-Pega-List pzPopulateFeatureTree", "Pega-AppDefinition", "08-01-01", false, true, "", "ACTIVITY", "20180713T141832.071 GMT" ,"Rule-Obj-Activity"); }
