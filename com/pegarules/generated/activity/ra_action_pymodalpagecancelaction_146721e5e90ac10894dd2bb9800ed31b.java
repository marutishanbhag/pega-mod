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
public class ra_action_pymodalpagecancelaction_146721e5e90ac10894dd2bb9800ed31b extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyModalPageCancelAction.Rule_Obj_CaseType.Action");
	public ra_action_pymodalpagecancelaction_146721e5e90ac10894dd2bb9800ed31b(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYMODALPAGECANCELACTION #20180713T133312.501 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYMODALPAGECANCELACTION #20180713T133312.501 GMT";
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
String pz_1 = "SpecPage";
thisStepPage = tools.findPage(pz_1, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_1, false);
thisStepPage.putString("pxObjClass", "Rule-Application-UseCase");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYMODALPAGECANCELACTION #20180713T133312.501 GMT Step: 1 Circum: 0" );
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
String pz_32 = "SpecPage";
thisStepPage = tools.findPage(pz_32, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_32, false);
thisStepPage.putString("pxObjClass", "Rule-Application-UseCase");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYMODALPAGECANCELACTION #20180713T133312.501 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
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
	"Rule-Obj-Activity:PYMODALPAGECANCELACTION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYMODALPAGECANCELACTION","Rule-Obj-Activity","RULE-OBJ-CASETYPE",false,"","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYMODALPAGECANCELACTION #20180713T133312.501 GMT","!PYMODALPAGECANCELACTION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-652890030)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYMODALPAGECANCELACTION #20180713T133312.501 GMT:20180713T133312.501 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "71fa9b5a4a8f2acfad52f4514241b3f2";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-CaseType";
	}
public String getAspect() {
return "Action";
}
/**
 * reset to original values.
 * <p>
 * Step 1 <code>Property-Set</code> [on page SpecPage] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.length(.pyTempInsKey) &gt; 0");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.length(.pyTempInsKey) > 0", "FUAInstance-NullMyStepPage");
}
boolean pz_3 = ((pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.length(.pyTempInsKey) &gt; 0",pz_3);
if (!pz_3) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pyModalPageCancelAction - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.length(.pyTempInsKey) &gt; 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyPurpose", pRef_4, myStepPage, scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTI64", false, true);
}
{
    pega.setViaPropRef(".pyOwner", pRef_7, myStepPage, scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyProductName", pRef_10, myStepPage, scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, true);
}
{
    pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
}
{
    pega.setViaPropRef(".pzInsKey", pRef_16, myStepPage, scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pyDescription", pRef_19, myStepPage, scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    ClipboardProperty pzSourceVar22 = pega.getViaPropRef(".pyPreviousValues.pyCustomFields", pRef_24, myStepPage, false, false);
    ClipboardProperty pzTargetVar23 = pega.getViaPropRef(".pyCustomFields", pRef_25, myStepPage, false, false);
    pzTargetVar23.setValue(pzSourceVar22);
}
{
    pega.setViaPropRef(".pyTempInsKey", pRef_28, myStepPage, "", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyIsEditable", pRef_29, myStepPage, scalarValueQuery_30.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
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
 * Reset previous values.
 * <p>
 * Step 2 <code>Property-Set</code> [on page SpecPage] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyPreviousValues.pyPurpose", pRef_6, myStepPage, "", "sTI64", false, true);
}
{
    pega.setViaPropRef(".pyPreviousValues.pyOwner", pRef_9, myStepPage, "", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPreviousValues.pyProductName", pRef_12, myStepPage, "", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyPreviousValues.pyLabel", pRef_15, myStepPage, "", "sTN64", false, true);
}
{
    pega.setViaPropRef(".pyPreviousValues.pzInsKey", pRef_18, myStepPage, "", "sIY", false, true);
}
{
    pega.setViaPropRef(".pyPreviousValues.pyDescription", pRef_21, myStepPage, "", "sTN", false, true);
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

public static final String[] pRef_28 = new String[] { "", "", "pyTempInsKey", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyOwner", "" };
public static final String[] pRef_18 = new String[] { "", "", "pyPreviousValues", "", "pzInsKey", "" };
public static final String[] pRef_29 = new String[] { "", "", "pyIsEditable", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyProductName", "" };
public static final String[] pRef_4 = new String[] { "", "", "pyPurpose", "" };
public static final String[] pRef_15 = new String[] { "", "", "pyPreviousValues", "", "pyLabel", "" };
public static final String[] pRef_16 = new String[] { "", "", "pzInsKey", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyPreviousValues", "", "pyOwner", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyPreviousValues", "", "pyPurpose", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyPreviousValues", "", "pyDescription", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyDescription", "" };
public static final String[] pRef_31 = new String[] { "", "", "pyPreviousValues", "", "pyIsEditable", "" };
public static final String[] pRef_25 = new String[] { "", "", "pyCustomFields", "" };
public static final String[] pRef_24 = new String[] { "", "", "pyPreviousValues", "", "pyCustomFields", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyPreviousValues", "", "pyProductName", "" };
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().page("pyPreviousValues").scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().page("pyPreviousValues").scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().page("pyPreviousValues").scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_30 = FUAUtil.createQueryBuilder().page("pyPreviousValues").scalarProperty("pyIsEditable").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().page("pyPreviousValues").scalarProperty("pyDescription").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().page("pyPreviousValues").scalarProperty("pyOwner").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("pyTempInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().page("pyPreviousValues").scalarProperty("pyPurpose").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-CASETYPE PYMODALPAGECANCELACTION #20180713T133312.501 GMT", "Rule-Obj-CaseType pyModalPageCancelAction", "Pega-UIEngine", "08-01-01", false, true, "", "ACTIVITY", "20180713T133312.501 GMT" ,"Rule-Obj-Activity"); }
