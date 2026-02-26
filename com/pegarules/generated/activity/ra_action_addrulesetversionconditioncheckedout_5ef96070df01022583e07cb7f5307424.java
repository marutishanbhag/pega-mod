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
public class ra_action_addrulesetversionconditioncheckedout_5ef96070df01022583e07cb7f5307424 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.AddRuleSetVersionConditionCheckedOut.PegaAccel_Management_Refactor.Action");
	public ra_action_addrulesetversionconditioncheckedout_5ef96070df01022583e07cb7f5307424(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT	Pega-ProCom:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
ClipboardProperty pz_11 = propertyQuery_1.resolve(tools, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"));
thisStepPage = pz_11 == null ? null : pz_11.getPageValue();
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT Step: 3 Circum: 0" );
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
ClipboardProperty pz_13 = pega.getViaPropRef(".pyContentSource.pyParameters(<append>)", pRef_3, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"), false, true);
thisStepPage = pz_13 == null ? null : pz_13.getPageValue();
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT Step: 4 Circum: 0" );
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
ClipboardProperty pz_15 = pega.getViaPropRef(".pyContentSource.pyParameters(<last>)", pRef_5, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"), false, false);
thisStepPage = pz_15 == null ? null : pz_15.getPageValue();
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT Step: 5 Circum: 0" );
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
ClipboardProperty pz_21 = pega.getViaPropRef(".pyContentSource.pyParameters(<append>)", pRef_3, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"), false, true);
thisStepPage = pz_21 == null ? null : pz_21.getPageValue();
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT Step: 6 Circum: 0" );
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
ClipboardProperty pz_23 = pega.getViaPropRef(".pyContentSource.pyParameters(<last>)", pRef_5, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"), false, false);
thisStepPage = pz_23 == null ? null : pz_23.getPageValue();
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT Step: 7 Circum: 0" );
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
ClipboardProperty pz_24 = propertyQuery_1.resolve(tools, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"));
thisStepPage = pz_24 == null ? null : pz_24.getPageValue();
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT Step: 8 Circum: 0" );
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
ClipboardProperty pz_30 = propertyQuery_1.resolve(tools, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"));
thisStepPage = pz_30 == null ? null : pz_30.getPageValue();
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("END"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
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
	"Rule-Obj-Activity:ADDRULESETVERSIONCONDITIONCHECKEDOUT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("ADDRULESETVERSIONCONDITIONCHECKEDOUT","Rule-Obj-Activity","PEGAACCEL-MANAGEMENT-REFACTOR",false,"","Pega-ProCom","08-06-01","RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT","!ADDRULESETVERSIONCONDITIONCHECKEDOUT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1793883221)
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
//	RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT:20200730T182030.316 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "a0d02357c56a80c50c4f131a865c856d";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAccel-Management-Refactor";
	}
public String getAspect() {
return "Action";
}
/**
 * Calculate the new ROS content labels.
 * <p>
 * Step 3 <code>Property-Set</code> [on page GetCheckedOutRules.pyContentSource] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    RuleSetLabel = Integer.toString(((pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, null, new Object[] { pega.getStringValueViaPropRef(".pyParameters(<last>).pyConditionLabel", pRef_12, myStepPage, false, false, false) })).intValue() + 1));
}
{
    VersionLabel = Integer.toString(((pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, null, new Object[] { RuleSetLabel })).intValue() + 1));
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
 * Create RuleSet Embed-WhenCondition.
 * <p>
 * Step 4 <code>Page-New</code> [on page GetCheckedOutRules.pyContentSource.pyParameters(<APPEND>)] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
ClipboardProperty pz_14 = pega.getViaPropRef(".pyContentSource.pyParameters(<append>)", pRef_3, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"), false, true);
myStepPage = pz_14 == null ? null : pz_14.getPageValue();
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Embed-WhenConditions","GetCheckedOutRules.pyContentSource.pyParameters(<append>)",false); 
// Expression: NewRuleObjSummaryViewWhenCondition
tools.applyModel(myStepPage, null, "NewRuleObjSummaryViewWhenCondition");
	 pega.setStepPage("GetCheckedOutRules.pyContentSource.pyParameters(<append>)", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Set condition props for RuleSet.
 * <p>
 * Step 5 <code>Property-Set</code> [on page GetCheckedOutRules.pyContentSource.pyParameters(<LAST>)] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyConditionFieldName", pRef_16, myStepPage, ".pyRuleSet", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyConditionLabel", pRef_17, myStepPage, RuleSetLabel, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyConditionOperation", pRef_18, myStepPage, "=", "stN", false, true);
}
{
    pega.setViaPropRef(".pyConditionValue1", pRef_19, myStepPage, tools.getParamValue("RuleSet"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyConditionValue1String", pRef_20, myStepPage, tools.getParamValue("RuleSet"), "sTN", false, true);
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
 * Create Version Embed-WhenCondition.
 * <p>
 * Step 6 <code>Page-New</code> [on page GetCheckedOutRules.pyContentSource.pyParameters(<APPEND>)] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
ClipboardProperty pz_22 = pega.getViaPropRef(".pyContentSource.pyParameters(<append>)", pRef_3, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"), false, true);
myStepPage = pz_22 == null ? null : pz_22.getPageValue();
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Embed-WhenConditions","GetCheckedOutRules.pyContentSource.pyParameters(<append>)",false); 
// Expression: NewRuleObjSummaryViewWhenCondition
tools.applyModel(myStepPage, null, "NewRuleObjSummaryViewWhenCondition");
	 pega.setStepPage("GetCheckedOutRules.pyContentSource.pyParameters(<append>)", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Set condition props for Version.
 * <p>
 * Step 7 <code>Property-Set</code> [on page GetCheckedOutRules.pyContentSource.pyParameters(<LAST>)] <br>
 */
public boolean step7_circum0() {
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
    pega.setViaPropRef(".pyConditionFieldName", pRef_16, myStepPage, ".pyRuleSetVersion", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyConditionLabel", pRef_17, myStepPage, VersionLabel, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyConditionOperation", pRef_18, myStepPage, "=", "stN", false, true);
}
{
    pega.setViaPropRef(".pyConditionValue1", pRef_19, myStepPage, tools.getParamValue("Version"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyConditionValue1String", pRef_20, myStepPage, tools.getParamValue("Version"), "sTN", false, true);
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
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Either add to the condition chain..
 * <p>
 * Step 8 <code>Property-Set</code> [on page GetCheckedOutRules.pyContentSource] <br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@endsWith(GetCheckedOutRules.pyContentSource.pyCriteriaLogic, \")\")");
try {
boolean pz_27 = (pega.<Boolean>resolveMethodCall("endsWith--(String,String)", "endsWith", null, null, new Object[] { scalarValueQuery_25.resolveToString(tools, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"), ImmutablePropertyInfo.TYPE_TEXT), ")" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@endsWith(GetCheckedOutRules.pyContentSource.pyCriteriaLogic, \")\")",pz_27);
if (!pz_27) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@endsWith(GetCheckedOutRules.pyContentSource.pyCriteriaLogic, \")\") " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyCriteriaLogic", pRef_28, myStepPage, (((((pega.<String>resolveMethodCall("stripCharsOffEnd--(String,String)", "stripCharsOffEnd", null, null, new Object[] { scalarValueQuery_29.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), Integer.toString(1) }) + " OR (") + RuleSetLabel) + " AND ") + VersionLabel) + "))"), "sTN", false, true);
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
 * ..Or start a new condition chain.
 * <p>
 * Step 9 <code>Property-Set</code> [on page GetCheckedOutRules.pyContentSource] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@endsWith(GetCheckedOutRules.pyContentSource.pyCriteriaLogic, \")\")");
try {
boolean pz_31 = (pega.<Boolean>resolveMethodCall("endsWith--(String,String)", "endsWith", null, null, new Object[] { scalarValueQuery_25.resolveToString(tools, pega.findPageWithException("GetCheckedOutRules", "Rule-Obj-SummaryView"), ImmutablePropertyInfo.TYPE_TEXT), ")" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@endsWith(GetCheckedOutRules.pyContentSource.pyCriteriaLogic, \")\")",pz_31);
if (pz_31) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@endsWith(GetCheckedOutRules.pyContentSource.pyCriteriaLogic, \")\") " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyCriteriaLogic", pRef_28, myStepPage, (((((scalarValueQuery_29.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + " AND ((") + RuleSetLabel) + " AND ") + VersionLabel) + "))"), "sTN", false, true);
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
pz_CurrentStepNum = "9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Exit (keep page to modify).
 * <p>
 * Step 14 [END] <code>Exit-Activity</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Exit-Activity");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Exit-Activity", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Exit-Activity
nextBlock = "***";
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Exit-Activity",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

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

public String RuleSetLabel = "";
public String VersionLabel = "";

public void initializeUserLocalVariables() {
	RuleSetLabel = "";
	VersionLabel = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("RuleSetLabel", (RuleSetLabel == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : RuleSetLabel.toString());
	smRetVal.putString("VersionLabel", (VersionLabel == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : VersionLabel.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_17 = new String[] { "", "", "pyConditionLabel", "" };
public static final String[] pRef_20 = new String[] { "", "", "pyConditionValue1String", "" };
public static final String[] pRef_28 = new String[] { "", "", "pyCriteriaLogic", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyContentSource", "", "pyParameters", "<append>" };
public static final String[] pRef_18 = new String[] { "", "", "pyConditionOperation", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyParameters", "<last>", "pyConditionLabel", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyContentSource", "", "pyParameters", "<last>" };
public static final String[] pRef_19 = new String[] { "", "", "pyConditionValue1", "" };
public static final String[] pRef_26 = new String[] { "", "", "pyContentSource", "", "pyCriteriaLogic", "" };
public static final String[] pRef_16 = new String[] { "", "", "pyConditionFieldName", "" };
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().page("pyContentSource").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_25 = FUAUtil.createQueryBuilder().page("pyContentSource").scalarProperty("pyCriteriaLogic").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().scalarProperty("pyCriteriaLogic").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAACCEL-MANAGEMENT-REFACTOR ADDRULESETVERSIONCONDITIONCHECKEDOUT #20200730T182030.316 GMT", "PegaAccel-Management-Refactor AddRuleSetVersionConditionCheckedOut", "Pega-ProCom", "08-06-01", false, true, ";@baseclass.OpenDeveloperForm", "ACTIVITY", "20200730T182030.316 GMT" ,"Rule-Obj-Activity"); }
