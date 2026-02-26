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
public class ra_action_pypopulateassignmentcontents_f0296760f4ccadf25b63e6d2ba9687a3 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyPopulateAssignmentContents.Assign_.Action");
	public ra_action_pypopulateassignmentcontents_f0296760f4ccadf25b63e6d2ba9687a3(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY ASSIGN- PYPOPULATEASSIGNMENTCONTENTS #20210719T123019.394 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY ASSIGN- PYPOPULATEASSIGNMENTCONTENTS #20210719T123019.394 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY ASSIGN- PYPOPULATEASSIGNMENTCONTENTS #20210719T123019.394 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY ASSIGN- PYPOPULATEASSIGNMENTCONTENTS #20210719T123019.394 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY ASSIGN- PYPOPULATEASSIGNMENTCONTENTS #20210719T123019.394 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY ASSIGN- PYPOPULATEASSIGNMENTCONTENTS #20210719T123019.394 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 5_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pxResults", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_37 = pzPrimPage.getIfPresent("pxResults");
pageRef = pz_37;
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY ASSIGN- PYPOPULATEASSIGNMENTCONTENTS #20210719T123019.394 GMT Step: 5 Circum: 0" );
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
	"Rule-Obj-Activity:PYPOPULATEASSIGNMENTCONTENTS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYPOPULATEASSIGNMENTCONTENTS","Rule-Obj-Activity","ASSIGN-",false,"","Theme-Cosmos","04-01-01","RULE-OBJ-ACTIVITY ASSIGN- PYPOPULATEASSIGNMENTCONTENTS #20210719T123019.394 GMT","!PYPOPULATEASSIGNMENTCONTENTS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",2003780995)
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
//	RULE-OBJ-ACTIVITY ASSIGN- PYPOPULATEASSIGNMENTCONTENTS #20210719T123019.394 GMT:20231108T140937.285 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "4ed08ad68821ce34aa3562f3a0fd7988";
	}

	public String getDefinitionAppliesToClass() {
		return "Assign-";
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
    pega.setViaPropRef(".pxResults(<append>).pxObjClass", pRef_2, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), ((pega.<Boolean>resolveMethodCall("callWhen--(PublicAPI,String,ClipboardPage)", "callWhen", "Pega-RULES", "Utilities", new Object[] { tools, "pzIsWorkbasketObject", tools.getPrimaryPage() })).booleanValue() ? "Assign-WorkBasket" : "Assign-Worklist"), "sIY", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxResults(<last>).pyLabel", pRef_3, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxTaskLabel", pRef_5, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY128", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxUrgencyAssign", pRef_7, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxRefObjectKey", pRef_9, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY255", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxGoalTime", pRef_11, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyAssignmentStatus", pRef_13, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pzInsKey", pRef_15, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxCreateDateTime", pRef_17, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyPropertyValue", pRef_19, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pyTaskIDLabel", pRef_21, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxApplication", pRef_23, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
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
 * Step 2 <code>Property-Set</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@SizeOfPropertyList(.pxPages)&gt;0");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@SizeOfPropertyList(.pxPages)>0", "FUAInstance-NullMyStepPage");
}
boolean pz_25 = ((pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { myStepPage.getProperty("pxPages") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@SizeOfPropertyList(.pxPages)&gt;0",pz_25);
if (!pz_25) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@SizeOfPropertyList(.pxPages)&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    ClipboardProperty pzSourceVar26 = myStepPage.getProperty("pxPages");
    ClipboardProperty pzTargetVar27 = pega.getViaPropRef(".pxResults(<last>).pxPages", pRef_28, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), false, false);
    pzTargetVar27.setValue(pzSourceVar26);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@SizeOfPropertyList(.pyAssignActions)&gt;0");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@SizeOfPropertyList(.pyAssignActions)>0", "FUAInstance-NullMyStepPage");
}
boolean pz_31 = ((pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { myStepPage.getProperty("pyAssignActions") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@SizeOfPropertyList(.pyAssignActions)&gt;0",pz_31);
if (!pz_31) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@SizeOfPropertyList(.pyAssignActions)&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    ClipboardProperty pzSourceVar32 = myStepPage.getProperty("pyAssignActions");
    ClipboardProperty pzTargetVar33 = pega.getViaPropRef(".pxResults(<last>).pyAssignActions", pRef_34, pega.findPage(tools.getParamValue("workPage"), "@baseclass"), false, false);
    pzTargetVar33.setValue(pzSourceVar32);
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
 * Step 4 <code>java</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_workPage = tools.findPage(tools.getParamValue("workPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
String origPageName = tools.getParamValue("workPage");
String className = myStepPage.getString(".pxObjClass");
ClipboardPage cp = tools.findPage(origPageName);
ClipboardProperty prop = cp.getIfPresent("pxResults");
if(prop!=null) {
  tmpWorkPage = origPageName + ".pxResults(" + prop.size() + ")";
  ClipboardPage cp1 = prop.getPageValue(prop.size());
  ClipboardPage cpParent = myStepPage.getParentPage();

  // -- Don't need these for nested cases
  if(myStepPage.getStringIfPresent("pyID")==null) {
    String str = myStepPage.getStringIfPresent("pyStatusWork");
    if(str != null) cp1.putString("pyAssignmentStatus", str);

    String urgencyWork=myStepPage.getStringIfPresent("pxUrgencyWork");
    if(urgencyWork != null) cp1.putString("pxUrgencyAssign", urgencyWork);
    
    cp1.putString("pxAssignDateTime", myStepPage.getString("pxCreateDateTime"));
    cp1.putString("pxRefObjectClass", myStepPage.getString("pxRefObjectClass"));
  
    String Owner="";
    String OwnerID="";
    if(className.startsWith("Assign-Worklist"))
    {
      Owner = myStepPage.getString("pxAssignedUserName");
      OwnerID = myStepPage.getString("pxAssignedOperatorID");
    }
    else if(className.startsWith("Assign-WorkBasket"))
    {
      Owner = myStepPage.getString("pxAssignedOperatorID");
      OwnerID = myStepPage.getString("pxAssignedOperatorID");
    }
    else if(className.startsWith("History-"))
    {
      Owner = myStepPage.getString("pyPerformer");
      OwnerID = myStepPage.getString("pxAddedByID");
    } else {
      Owner = myStepPage.getString("pyAssignedOperator");
      OwnerID = myStepPage.getString("pxAssignedOperatorID");
    }
    cp1.putString("pxAssignedUserName", Owner);
    cp1.putString("pxAssignedOperatorID", OwnerID);

    String deadline=myStepPage.getStringIfPresent("pzCaseContentsDeadline");
    if(deadline != null) {
      cp1.putString("pzCaseContentsDeadline", deadline);
    }
  } else {
    cp1.putString("pyExpanded", "true");
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Step 5 <code>call Assign-.pyPopulateAssignmentContents</code> [on page .pxResults] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call Assign-.pyPopulateAssignmentContents");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call Assign-.pyPopulateAssignmentContents", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call Assign-.pyPopulateAssignmentContents
// Calling Activity : Assign-.pyPopulateAssignmentContents

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
newParamsPage.putParamValue("pyIterationType", "embedded");
newParamsPage.putParamValue("pyHowInvoked", "ForEach");
newParamsPage.putParamValue("pyIterationTarget", ".pxResults");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: local.tmpWorkPage
newParamsPage.putParamValue("workPage", PropertyInfo.TYPE_INCLUDED_PAGE, tmpWorkPage);

pega.invokeActivity(myStepPage, newParamsPage, "pyPopulateAssignmentContents", "Assign-", "Assign-");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call Assign-.pyPopulateAssignmentContents",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

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

public String tmpWorkPage = "";

public void initializeUserLocalVariables() {
	tmpWorkPage = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("tmpWorkPage", (tmpWorkPage == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : tmpWorkPage.toString());
	return smRetVal;
}

public ClipboardPage pageParam_workPage;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_workPage = null;
}

public static final String[] pRef_19 = new String[] { "", "", "pxResults", "<last>", "pyPropertyValue", "" };
public static final String[] pRef_28 = new String[] { "", "", "pxResults", "<last>", "pxPages", "" };
public static final String[] pRef_5 = new String[] { "", "", "pxResults", "<last>", "pxTaskLabel", "" };
public static final String[] pRef_2 = new String[] { "", "", "pxResults", "<append>", "pxObjClass", "" };
public static final String[] pRef_13 = new String[] { "", "", "pxResults", "<last>", "pyAssignmentStatus", "" };
public static final String[] pRef_23 = new String[] { "", "", "pxResults", "<last>", "pxApplication", "" };
public static final String[] pRef_17 = new String[] { "", "", "pxResults", "<last>", "pxCreateDateTime", "" };
public static final String[] pRef_21 = new String[] { "", "", "pxResults", "<last>", "pyTaskIDLabel", "" };
public static final String[] pRef_9 = new String[] { "", "", "pxResults", "<last>", "pxRefObjectKey", "" };
public static final String[] pRef_7 = new String[] { "", "", "pxResults", "<last>", "pxUrgencyAssign", "" };
public static final String[] pRef_15 = new String[] { "", "", "pxResults", "<last>", "pzInsKey", "" };
public static final String[] pRef_3 = new String[] { "", "", "pxResults", "<last>", "pyLabel", "" };
public static final String[] pRef_11 = new String[] { "", "", "pxResults", "<last>", "pxGoalTime", "" };
public static final String[] pRef_34 = new String[] { "", "", "pxResults", "<last>", "pyAssignActions", "" };
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pxApplication").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyAssignmentStatus").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pyPropertyValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pxCreateDateTime").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pxUrgencyAssign").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pyTaskIDLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pxTaskLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pxRefObjectKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pxGoalTime").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY ASSIGN- PYPOPULATEASSIGNMENTCONTENTS #20210719T123019.394 GMT", "Assign- pyPopulateAssignmentContents", "Theme-Cosmos", "04-01-01", false, true, "", "ACTIVITY", "20231108T140937.285 GMT" ,"Rule-Obj-Activity"); }
