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
public class ra_action_savecircumstanceindex_6155ea1077b6c7c79b7492d2e6acf383 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.saveCircumstanceIndex.Rule_.Action");
	public ra_action_savecircumstanceindex_6155ea1077b6c7c79b7492d2e6acf383(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT	Pega-Desktop:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT Step: 3 Circum: 0" );
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
String pz_6 = "pyCirmDefIndexPage";
thisStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT Step: 4 Circum: 0" );
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
String pz_10 = "pyCirmDefIndexPage";
thisStepPage = tools.findPage(pz_10, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_10, false);
thisStepPage.putString("pxObjClass", "Index-CircumstanceDefinition");
}
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
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
	"Rule-Obj-Activity:SAVECIRCUMSTANCEINDEX"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("SAVECIRCUMSTANCEINDEX","Rule-Obj-Activity","RULE-",false,"","Pega-Desktop","08-02-01","RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT","!SAVECIRCUMSTANCEINDEX",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1493850834)
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
//	RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT:20181130T094024.226 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "905fff802c573e7e48720bb082183a33";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-";
	}
public String getAspect() {
return "Action";
}
/**
 * Set input parameter for DecisionTable.
 * <p>
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
    tools.putParamValue("PropertyName", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, null, new Object[] { pega.<String>resolveMethodCall("whatComesAfterLast--(String,char)", "whatComesAfterLast", null, null, new Object[] { scalarValueQuery_1.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), '.' }), ".", "" }));
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
 * Don't attempt to index reserved properties.
 * <p>
 * Step 2 <code>Property-Map-DecisionTable</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Map-DecisionTable");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Map-DecisionTable", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Map-DecisionTable
ClipboardPage map_1 = tools.getStepPage();
if ((map_1 == null) || (map_1.getClassName().length() == 0)) {
map_1 = tools.getThread().createPage("Rule-", "");
}

// Expression: pzRestrictedFromCircumstanceIndex
tools.putParamValue("RestrictedProperty", PropertyInfo.TYPE_TEXT, com.pegarules.generated.pega_rules_decisiontable.ObtainValue(tools, map_1, "pzRestrictedFromCircumstanceIndex", false));
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.RestrictedProperty");
try {
boolean pz_2 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "RestrictedProperty");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.RestrictedProperty",pz_2);
if (pz_2) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "saveCircumstanceIndex - Transition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.RestrictedProperty " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Map-DecisionTable",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * delete indices of this Rule.
 * <p>
 * Step 3 <code>java</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@endsWith(.pyRuleSet, \"@\") || .pxInstanceLockedBy!=\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@endsWith(.pyRuleSet, \"@\") || .pxInstanceLockedBy!=\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_5 = ((pega.<Boolean>resolveMethodCall("endsWith--(String,String)", "endsWith", null, null, new Object[] { scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "@" })).booleanValue() || (!(scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@endsWith(.pyRuleSet, \"@\") || .pxInstanceLockedBy!=\"\"",pz_5);
if (pz_5) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "saveCircumstanceIndex - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@endsWith(.pyRuleSet, \"@\") || .pxInstanceLockedBy!=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
String key = tools.getPrimaryPage().getString(".pzInsKey");			
String sql = "delete from {class:Index-CircumstanceDefinition} where pxInsIndexedKey = '" + key + "'";
ClipboardPage d = tools.createPage("Code-Pega-List", "");
d.putString(".pyObjClass", "Index-CircumstanceDefinition");
try
{
	int i = tools.getDatabase().executeRDB(sql, d);	
	//oLog.error("number of records deleted = " + i);
}
catch (DatabaseException de)
{
	oLog.error("cant delete Circumstance indices for " + key );
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Step 4 <code>Page-New</code> [on page pyCirmDefIndexPage] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "primary.pyCircumstanceType!=\"PROPERTY\"");
try {
boolean pz_8 = (!(scalarValueQuery_7.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("PROPERTY")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "primary.pyCircumstanceType!=\"PROPERTY\"",pz_8);
if (pz_8) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "saveCircumstanceIndex - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("primary.pyCircumstanceType!=\"PROPERTY\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_9 = "pyCirmDefIndexPage";
myStepPage = tools.findPage(pz_9, true);
// Expression: Index-CircumstanceDefinition
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Index-CircumstanceDefinition","pyCirmDefIndexPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("pyCirmDefIndexPage", myStepPage);
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
 * Step 5 <code>Property-Set</code> [on page pyCirmDefIndexPage] <br>
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
    indexCounter = 1;
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyDefinitionName", pRef_11, myStepPage, scalarValueQuery_12.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyTemplateName", pRef_13, myStepPage, scalarValueQuery_1.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxInsIndexedKey", pRef_14, myStepPage, scalarValueQuery_15.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxIndexPurpose", pRef_16, myStepPage, "CDef", "sTY256", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_17, myStepPage, scalarValueQuery_18.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_DATETIME), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxCreateDateTime", pRef_19, myStepPage, scalarValueQuery_18.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_DATETIME), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateOpName", pRef_20, myStepPage, scalarValueQuery_21.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxCreateOpName", pRef_22, myStepPage, scalarValueQuery_21.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateOperator", pRef_23, myStepPage, scalarValueQuery_24.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxCreateOperator", pRef_25, myStepPage, scalarValueQuery_24.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateSystemID", pRef_26, myStepPage, scalarValueQuery_27.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxCreateSystemID", pRef_28, myStepPage, scalarValueQuery_27.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pyLabel", pRef_29, myStepPage, scalarValueQuery_30.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
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
 * create index property if necessary. Create db columns.
 * <p>
 * Step 6 <code>java</code><br>
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
ProcessingStatus status = tools.getStepStatus();
int statusFlag = status.getWorstSeverity();
String statusMsg = status.getWorstMessageName();
String statusMsgParams = status.getWorstMessageParms();

String strWarningName = "PRPC_CircumstanceIndexWarning"; //if you change the warning, you need to change it in OnBeforeDisplay activity as well.
ClipboardPage rulePage = tools.getPrimaryPage();
propName = rulePage.getString(".pyCircumstanceProp").trim();
String propertyClass = "";
int dotLocation = propName.indexOf(".");

if (dotLocation == 0) {
	propName = propName.substring(1);
	propertyClass = rulePage.getString(".pyClassName");
} else if (dotLocation > 0) {
	//circumstance property in different page (ex:pxRequestor) /not primary page
	String pageName = propName.substring(0, dotLocation);
	propName = propName.substring(dotLocation + 1);

	if (pageName.equals("pxRequestor")) {
		propertyClass = "Code-Pega-Requestor";
	} else {
		//let find the class from pages and classes
		ClipboardProperty pagesClasses = rulePage.getIfPresent("pyPagesAndClasses");
		if (pagesClasses != null) {
			java.util.Iterator itrPC = pagesClasses.iterator();
			while (itrPC.hasNext()) {
				ClipboardPage temp = ((ClipboardProperty) itrPC.next()).getPageValue();
				if (pageName.equals(temp.getString(".pyPagesAndClassesPage"))) {
					propertyClass = temp.getString(".pyPagesAndClassesClass");
					break;
				}
			}
		}
	}
} else {
	propertyClass = rulePage.getString(".pyClassName");
}

// START BUG-15776
if (propertyClass.equals("")&&(rulePage.getString("pxObjClass").equals("Rule-PortalSkin")))
{
   ClipboardPage tempPage = tools.findPage("AccessGroup");
   String currentWorkPool = null;                  
   if(tempPage!=null)
   {
	currentWorkPool=tempPage.getString("pyCurrentWorkPool");
	propertyClass=currentWorkPool;
   }
}
 //END BUG-15776
 else  if (propertyClass.equals("")) {
	propertyClass = "@baseclass";
}

Database db = tools.getDatabase();
String indexClass = "Index-CircumstanceDefinition";
ClassDefinition cd = db.getClassDef(indexClass);
String ruleSet = rulePage.getString(".pxInstanceLockedRuleSet");
String ruleSetVersion = rulePage.getString(".pxInstanceLockedRuleSetVersion");
if (ruleSet.length() == 0) {
	ruleSet = rulePage.getString(".pyRuleSet");
	ruleSetVersion = rulePage.getString(".pyRuleSetVersion");
}

java.util.List missingColumns = new java.util.ArrayList();
missingColumns.add(propName);

ClipboardPage prop = tools.createPage("Rule-Obj-Property", "");
prop.putString(".pyClassName", indexClass);
prop.putString(".pyPropertyName", propName);

boolean doesPropertyExist = false;

//check if property exist.
try {
        //START BUG-164186
	ClipboardPage propRecord = tools.getDatabase().getRulesetContext(rulePage).open(prop);//db.open(prop, true);
	//case 1: property doesn't exist in Index-CircumstanceDefinition leave doesPropertyExists as false
	if (propRecord != null) {
		//case 2: property does exist in Index-CircumstanceDefinition, is it inherited?
		if (indexClass.equalsIgnoreCase(propRecord.getString(".pyClassName"))){
			//if it is in Index-CircumstanceDefinition we can just mark it as existing
			doesPropertyExist = true;
		} else {
			//if it is in a parent class and is transient we will need a non-transient copy
			if("true".equalsIgnoreCase(propRecord.getString(".pyIsTransient"))){
				doesPropertyExist = false;
			} else {
				doesPropertyExist = true;
			}
		}
	}
} catch (DatabaseException de) {
}

if (!doesPropertyExist) {
	//property doesn't exist, let's try copying it from the class of the Rule.
	prop.putString(".pyClassName", propertyClass);
	try {
		ClipboardPage propRecord = db.open(prop, true);
		if (propRecord != null) {
			//copy property to index class
			propRecord.putString(".pyClassName", indexClass);
			propRecord.putString(".pyRuleSet", ruleSet);
			propRecord.putString(".pyRuleSetVersion", ruleSetVersion);
			propRecord.putString(".pxInstanceLockedBy", "");
			propRecord.putString(".pxInstanceLockedDateTime", "");
			propRecord.putString(".pxInstanceLockedKey", "");
			propRecord.putString(".pxInstanceLockedRuleSet", "");
			propRecord.putString(".pxInstanceLockedRuleSetVersion", "");
			propRecord.putString(".pxCreateDateTime", pega_rules_datetime.CurrentDateTime());
			propRecord.putString(".pxUpdateDateTime", pega_rules_datetime.CurrentDateTime());
			propRecord.putString(".pxUpdateOpName", rulePage.getString(".pxUpdateOpName"));
			propRecord.putString(".pxCreateOpName", rulePage.getString(".pxUpdateOpName"));
			propRecord.putString(".pxUpdateOperator", rulePage.getString(".pxUpdateOperator"));
			propRecord.putString(".pxCreateOperator", rulePage.getString(".pxUpdateOperator"));
			propRecord.putString(".pyIsNonTransient", "true");
			propRecord.putString(".pyIsTransient", "false");
			db.save(propRecord, true, true);
			doesPropertyExist = true;
		} else {
			//property doesn't exist which is unexpected
			/*String strWarningMessage = "Can't create property: " + propName + " in class : " + indexClass;
			String strWarningDetails = "";
			String strWarningType = "Performance";
			int nSeverity = 2;
			String strListPageName = "";
			pega_wb_default.addWarning(strWarningName, strWarningMessage, strWarningDetails, strWarningType, nSeverity, rulePage, strListPageName);
			*/			
			HashStringMap params= new HashStringMap();
			params.put("propName",propName);							
			com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(null,"pxMissingSourceProperty",params);
		}
	} catch (DatabaseException de) {
		//can't open property
		/*String strWarningMessage = "Can't create property: " + propName + " in class : " + indexClass;
		String strWarningDetails = "";
		String strWarningType = "Performance";
		int nSeverity = 2;
		String strListPageName = "";
		pega_wb_default.addWarning(strWarningName, strWarningMessage, strWarningDetails, strWarningType, nSeverity, rulePage, strListPageName);
		*/		
		HashStringMap params= new HashStringMap();
		params.put("propName",propName);							
		com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(null,"pxCannotCreateProperty",params);
	}
}

if (!doesPropertyExist) {
	bCreateIndex = false;
	status.set(statusFlag, statusMsg, statusMsgParams);
	return true;
}

bCreateIndex = true;
boolean bColumn = false;
try {
	StringBuffer propColName_map = new StringBuffer();
	int isColumn = cd.isPropertyMappedtoAnotherName(propName, tools, propColName_map);//cd.isPropertyExposed(name, tools);
	if (isColumn == ClassDefinition.NO_DB_COL_PROP_EXIST) {
		bColumn = false;
	} else {
    
		bColumn = true;
		if (isColumn == ClassDefinition.DB_COL__PROP_EXIST_WITH_OTHER_NAME) {
			//column is mapped to another property, so we can't use it.
			bCreateIndex = false;
		   /* String strWarningMessage = "Can't index property " + propName + " because the database column is mapped to another property: " + propColName_map.toString();
			String strWarningDetails = "";
			String strWarningType = "Performance";
			int nSeverity = 2;
			String strListPageName = "";
			pega_wb_default.addWarning(strWarningName, strWarningMessage, strWarningDetails, strWarningType, nSeverity, rulePage, strListPageName);
			*/					
			HashStringMap params= new HashStringMap();
			params.put("propName",propName);			
			params.put("propColName_map	",propColName_map.toString());	
			com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(null,"pxCannotIndexProperty",params);
		}
		status.set(statusFlag, statusMsg, statusMsgParams);
		return true;
	}
} catch (DatabaseException e) {}
oLog.debug("Missing columns "+missingColumns);
//create db columns for properties that are not db columns.
if (missingColumns.size() > 0) 
{
  
	StringBuffer ddlCode = new StringBuffer();
	String error = "";
	boolean success = false;
  String dbschemaChanges = tools.getSystemSettings().getDynamic("Pega-RULES", "database/AutoDBSchemaChanges");
  if(dbschemaChanges != null && dbschemaChanges.equals("true")) {
	 try {
	  	bCreateIndex = true;
		  success = pega.executeDBAddIndexColumns(indexClass, missingColumns, ddlCode);
	 } catch (Exception e) {
	  	bCreateIndex = false;
		  error = e.getMessage();
	 }
  } else {
    oLog.warnForced("Auto DB Schema Changes set to false. Ignoring schema changes");
  }
	
	if (!success) {
		bCreateIndex = false;
		/*String strWarningMessage = StringUtils.concat(StringUtils.ASIS, "Can't create Circumstance Index because the following column can't be created: ", propName, ".\n", ddlCode.toString());
		if (error.length() > 0) {
			strWarningMessage = StringUtils.concat(StringUtils.ASIS, strWarningMessage, "\n", error);
		}
		String strWarningDetails = ddlCode.toString();
		String strWarningType = "Performance";
		int nSeverity = 2;
		String strListPageName = "";
		pega_wb_default.addWarning(strWarningName, strWarningMessage, strWarningDetails, strWarningType, nSeverity, rulePage, strListPageName);*/
		
		HashStringMap params= new HashStringMap();
		params.put("propName",propName);			
		params.put("ddlCode",ddlCode.toString());	
		com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(null,"pxCannotCreateColumn",params);
	}
}
status.set(statusFlag, statusMsg, statusMsgParams);
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
 * save index page.
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.bCreateIndex");
try {
boolean pz_31 = bCreateIndex;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.bCreateIndex",pz_31);
if (!pz_31) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.bCreateIndex " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
ProcessingStatus status = tools.getStepStatus();
int statusFlag = status.getWorstSeverity();
String statusMsg = status.getWorstMessageName(); 
String statusMsgParams = status.getWorstMessageParms(); 

Database db = tools.getDatabase();
String strWarningName = "PRPC_CircumstanceIndexWarning"; 

ClipboardPage pgIndexPage = tools.findPage("pyCirmDefIndexPage");
pgIndexPage.putString(".pzInsKey", "");		
pgIndexPage.putString(".pxIndexCount", Integer.toString(indexCounter));
pgIndexPage.putString(".pxCreateDateTime", pega_rules_datetime.CurrentDateTime());
pgIndexPage.putString(".pxUpdateDateTime", pega_rules_datetime.CurrentDateTime());
String indexClass = "Index-CircumstanceDefinition";
String insKey = tools.getPrimaryPage().getString(".pzInsKey");

//save index data to the database.
pgIndexPage.putString("." + propName, tools.getPrimaryPage().getString(".pyCircumstanceVal"));
try
{
	db.saveDeferred(pgIndexPage, true, false);
}
catch (DatabaseException ex)
{
	oLog.error("Can't save Index for Circumstance Definition Rule " + tools.getPrimaryPage().getString(".pzInsKey") , ex);
	/*String strWarningMessage = "Can't save Index. " + ex.getMessage();
	String strWarningDetails = "";
	String strWarningType = "Performance";
	*/
	
	HashStringMap params= new HashStringMap();
	params.put("insKey",insKey);							
	com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(null,"pxUnableToIndexCircumstanceDefinition",params);
}
status.set(statusFlag, statusMsg , statusMsgParams);
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

public boolean bCreateIndex = false;
public int indexCounter = 0;
public String propName = "";

public void initializeUserLocalVariables() {
	bCreateIndex = false;
	indexCounter = 0;
	propName = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("bCreateIndex", Boolean.toString(bCreateIndex));
	smRetVal.putString("indexCounter", Integer.toString(indexCounter));
	smRetVal.putString("propName", (propName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : propName.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_11 = new String[] { "", "", "pyDefinitionName", "" };
public static final String[] pRef_28 = new String[] { "", "", "pxCreateSystemID", "" };
public static final String[] pRef_17 = new String[] { "", "", "pxUpdateDateTime", "" };
public static final String[] pRef_29 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_19 = new String[] { "", "", "pxCreateDateTime", "" };
public static final String[] pRef_14 = new String[] { "", "", "pxInsIndexedKey", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyTemplateName", "" };
public static final String[] pRef_23 = new String[] { "", "", "pxUpdateOperator", "" };
public static final String[] pRef_26 = new String[] { "", "", "pxUpdateSystemID", "" };
public static final String[] pRef_16 = new String[] { "", "", "pxIndexPurpose", "" };
public static final String[] pRef_20 = new String[] { "", "", "pxUpdateOpName", "" };
public static final String[] pRef_22 = new String[] { "", "", "pxCreateOpName", "" };
public static final String[] pRef_25 = new String[] { "", "", "pxCreateOperator", "" };
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pxInstanceLockedBy").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pyCircumstanceType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_30 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyCircumstanceProp").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pxUpdateDateTime").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pxUpdateOpName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pxUpdateOperator").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyCircumstanceVal").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pxUpdateSystemID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSet").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE- SAVECIRCUMSTANCEINDEX #20181024T153922.295 GMT", "Rule- saveCircumstanceIndex", "Pega-Desktop", "08-02-01", false, false, "", "TRIGGER", "20181130T094024.226 GMT" ,"Rule-Obj-Activity"); }
