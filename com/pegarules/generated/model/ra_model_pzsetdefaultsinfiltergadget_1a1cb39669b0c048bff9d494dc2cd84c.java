package com.pegarules.generated.model;
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
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.tracer.RuleTraceInfo;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class ra_model_pzsetdefaultsinfiltergadget_1a1cb39669b0c048bff9d494dc2cd84c extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzSetDefaultsInFilterGadget.PegaGadget_Filter.Model");
	public ra_model_pzsetdefaultsinfiltergadget_1a1cb39669b0c048bff9d494dc2cd84c(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL PEGAGADGET-FILTER PZSETDEFAULTSINFILTERGADGET #20180713T133523.456 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set Param.ActiveApplicationFiltersStringToSet", source_1, target_1);
{
    tools.putParamValue("ActiveApplicationFiltersStringToSet", PropertyInfo.TYPE_TEXT, scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("D_pxGetPreference", "Data-Preference-Operator"), ImmutablePropertyInfo.TYPE_TEXT));
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set Param.ActiveApplicationFiltersStringToSet", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set Param.pyAppVersionConcatQuoted", source_2, target_2);
{
    tools.putParamValue("pyAppVersionConcatQuoted", PropertyInfo.TYPE_TEXT, scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("D_pxGetPreference", "Data-Preference-Operator"), ImmutablePropertyInfo.TYPE_TEXT));
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set Param.pyAppVersionConcatQuoted", source_2, target_2);
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "When", null, target_3);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "When", null, target_3);
}
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.ActiveApplicationFiltersStringToSet != \"\"");
try {
boolean pz_5 = (!(tools.getParamValue("ActiveApplicationFiltersStringToSet").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.ActiveApplicationFiltersStringToSet != \"\"",pz_5);
return pz_5;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.ActiveApplicationFiltersStringToSet != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set Primary.pyActiveApplicationFiltersString", source_3, target_4);
{
    pega.setViaPropRef(".pyActiveApplicationFiltersString", pRef_6, tools.getPrimaryPage(), scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("D_pxGetPreference", "Data-Preference-Operator"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set Primary.pyActiveApplicationFiltersString", source_3, target_4);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2", "Set Primary.pyAppVersionConcatQuoted", source_4, target_5);
{
    pega.setViaPropRef(".pyAppVersionConcatQuoted", pRef_7, tools.getPrimaryPage(), scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("D_pxGetPreference", "Data-Preference-Operator"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5.2", "Set Primary.pyAppVersionConcatQuoted", source_4, target_5);
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_8 = tools.getPrimaryPage().getIfPresent("pyApplicationFilterChoices");
foreach_prop_1 = pz_8;
actionProlog(pz_CurrentTraceInfo,"5.3", "For Each Page In", null, pz_8);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_1 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_1 = false;
boolean pop_ctxt_page_2 = false;
try {
/* push '"Primary.pyApplicationFilterChoices(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary.pyApplicationFilterChoices(<CURRENT>)", ctxt_page_target_1);
/* push '"Primary.pyApplicationFilterChoices(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "Primary.pyApplicationFilterChoices(<CURRENT>)", ctxt_page_source_1);
switch (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_1;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_2) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"5.3", "For Each Page In", null, pz_8);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.4", "Set Primary.pyApplicationFilterChoicesCopy", source_5, target_6);
{
    ClipboardProperty pzSourceVar9 = tools.getPrimaryPage().getProperty("pyApplicationFilterChoices");
    ClipboardProperty pzTargetVar10 = pega.getViaPropRef(".pyApplicationFilterChoicesCopy", pRef_11, tools.getPrimaryPage(), false, false);
    pzTargetVar10.setValue(pzSourceVar9);
}

actionEpilog(pz_CurrentTraceInfo,"5.4", "Set Primary.pyApplicationFilterChoicesCopy", source_5, target_6);
return CODE_CONTINUE;
}private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.3.1", "Set Param.AppNameToSearch", source_6, target_7);
{
    String pzSourceVar14 = "";
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pzSourceVar14 = (("," + scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + ",");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        tools.putParamValue("AppNameToSearch", PropertyInfo.TYPE_TEXT, pzSourceVar14);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.3.1", "Set Param.AppNameToSearch", source_6, target_7);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.3.2", "Set Param.AppListToSearchIn", source_7, target_8);
{
    String pzSourceVar17 = "";
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pzSourceVar17 = (("," + tools.getParamValue("ActiveApplicationFiltersStringToSet")) + ",");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        tools.putParamValue("AppListToSearchIn", PropertyInfo.TYPE_TEXT, pzSourceVar17);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.3.2", "Set Param.AppListToSearchIn", source_7, target_8);
if (whenCondition_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5.3.3", "When", null, target_9);
switch (when_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.3.3", "When", null, target_9);
}
return CODE_CONTINUE;
}private boolean whenCondition_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_12 = null;
try {
ctxt_frame_12 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_12.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@inString(Param.AppListToSearchIn, Param.AppNameToSearch) &lt; 0");
try {
boolean pz_19 = ((pega.<Integer>resolveMethodCall("inString--(String,String)", "inString", null, null, new Object[] { tools.getParamValue("AppListToSearchIn"), tools.getParamValue("AppNameToSearch") })).intValue() < 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@inString(Param.AppListToSearchIn, Param.AppNameToSearch) &lt; 0",pz_19);
return pz_19;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@inString(Param.AppListToSearchIn, Param.AppNameToSearch) &lt; 0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
} // return to previous step page
}private int when_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.3.3.1", "Set .pyFilterActive", source_8, target_10);
{
    String pzSourceVar20 = "";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pzSourceVar20 = "false";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyFilterActive", pRef_21, myStepPage, pzSourceVar20, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.3.3.1", "Set .pyFilterActive", source_8, target_10);
return CODE_CONTINUE;
}/** Metadata for the rule */
private static final Map oMetaData;

// initialize metadata for the rule
static {
oMetaData = new HashMap(1);
oMetaData.put(".pyCallSuperClassModel", "false");
}

/** Returns metadata for this rule instance */
public Map getMetadata() {
return oMetaData;
}

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Model:PZSETDEFAULTSINFILTERGADGET"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSETDEFAULTSINFILTERGADGET","Rule-Obj-Model","PEGAGADGET-FILTER",false,"","Pega-Gadgets","08-01-01","RULE-OBJ-MODEL PEGAGADGET-FILTER PZSETDEFAULTSINFILTERGADGET #20180713T133523.456 GMT","!PZSETDEFAULTSINFILTERGADGET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1133117700)
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
//	RULE-OBJ-MODEL PEGAGADGET-FILTER PZSETDEFAULTSINFILTERGADGET #20180713T133523.456 GMT:20180713T133523.456 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "dda8bb1439f8f686ed780eb51c92271a";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaGadget-Filter";
	}
public String getAspect() {
return "Model";
}
private static final int CODE_CONTINUE = 0;
private static final int CODE_EXIT_ITERATION = 1;
private static final int CODE_EXIT_MODEL = 2;
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
		myStepPage = null;
		pz_CurrentRuleKey = "";
}
private ClipboardPage myStepPage;
String pz_CurrentRuleKey = "";

public static final String[] pRef_7 = new String[] { "", "", "pyAppVersionConcatQuoted", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyApplicationFilterChoicesCopy", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyActiveApplicationFiltersString", "" };
public static final String[] pRef_2 = new String[] { "", "", "pxAppFilterPreference", "", "pyActiveApplicationFiltersString", "" };
public static final String[] pRef_4 = new String[] { "", "", "pxAppFilterPreference", "", "pyAppVersionConcatQuoted", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyFilterActive", "" };
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().page("pxAppFilterPreference").scalarProperty("pyActiveApplicationFiltersString").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyFilterProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().page("pxAppFilterPreference").scalarProperty("pyAppVersionConcatQuoted").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL PEGAGADGET-FILTER PZSETDEFAULTSINFILTERGADGET #20180713T133523.456 GMT", "PegaGadget-Filter pzSetDefaultsInFilterGadget", "Pega-Gadgets", "08-01-01", "20180713T133523.456 GMT");
}
