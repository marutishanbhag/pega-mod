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
public class ra_model_pzpreprocessing_ca60c288b8fcf11010b27234262b67a8 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzPreProcessing.PegaGadget_Filter.Model");
	public ra_model_pzpreprocessing_ca60c288b8fcf11010b27234262b67a8(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL PEGAGADGET-FILTER PZPREPROCESSING #20191113T131829.061 GMT	Pega-Gadgets:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"2", "Apply Data Transform pzLoadApplicationFiltersFromCopy", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "PegaGadget-Filter";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pzLoadApplicationFiltersFromCopy");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"2", "Apply Data Transform pzLoadApplicationFiltersFromCopy", null, null);
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_1 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "When", null, target_1);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "When", null, target_1);
} else {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "Otherwise", null, target_2);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "Otherwise", null, target_2);
}
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7", "When", null, target_3);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"7", "When", null, target_3);
} else {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10", "Otherwise", null, target_4);
if (otherwise_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"10", "Otherwise", null, target_4);
}
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"11", "When", null, target_5);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"11", "When", null, target_5);
}
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"12", "When", null, target_6);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"12", "When", null, target_6);
}
if (whenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_7 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"13", "When", null, target_7);
if (when_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"13", "When", null, target_7);
}
if (whenCondition_6(pz_CurrentTraceInfo)) {
ClipboardPage target_8 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"14", "When", null, target_8);
if (when_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"14", "When", null, target_8);
}
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"16", "Set .pyApplicationFilterChoicesCopy", source_1, target_9);
{
    ClipboardProperty pzSourceVar1 = myStepPage.getProperty("pyApplicationFilterChoices");
    ClipboardProperty pzTargetVar2 = pega.getViaPropRef(".pyApplicationFilterChoicesCopy", pRef_3, myStepPage, false, false);
    pzTargetVar2.setValue(pzSourceVar1);
}

actionEpilog(pz_CurrentTraceInfo,"16", "Set .pyApplicationFilterChoicesCopy", source_1, target_9);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18", "Set .pyEnteringSearchTerm", source_2, target_10);
{
    pega.setViaPropRef(".pyEnteringSearchTerm", pRef_6, myStepPage, "false", "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"18", "Set .pyEnteringSearchTerm", source_2, target_10);
if (whenCondition_7(pz_CurrentTraceInfo)) {
ClipboardPage target_11 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"19", "When", null, target_11);
if (when_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"19", "When", null, target_11);
}
if (whenCondition_8(pz_CurrentTraceInfo)) {
ClipboardPage target_12 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"20", "When", null, target_12);
if (when_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"20", "When", null, target_12);
}
if (whenCondition_9(pz_CurrentTraceInfo)) {
ClipboardPage target_13 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"21", "When", null, target_13);
if (when_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"21", "When", null, target_13);
}
if (whenCondition_10(pz_CurrentTraceInfo)) {
ClipboardPage target_14 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"22", "When", null, target_14);
if (when_10(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"22", "When", null, target_14);
}
if (whenCondition_11(pz_CurrentTraceInfo)) {
ClipboardPage target_15 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"23", "When", null, target_15);
if (when_11(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"23", "When", null, target_15);
}
if (whenCondition_12(pz_CurrentTraceInfo)) {
ClipboardPage target_16 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"24", "When", null, target_16);
if (when_12(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"24", "When", null, target_16);
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
boolean pz__1 = pega.invokeWhen("IsAPegaDeveloper", "PegaGadget-Filter", "PegaGadget-Filter");
return pz__1;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
/* entering new scope */
boolean pop_ctxt_page_1 = false;
boolean pop_ctxt_page_2 = false;
try {
/* push '"pyTempFilterPage"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
String pz_7 = "pyTempFilterPage";
ctxt_page_1 = tools.findPage(pz_7, true);
if (ctxt_page_1 == null) {
ctxt_page_1 = tools.findPage(pz_7, false);
ctxt_page_1.putString("pxObjClass", "$None");
}
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "pyTempFilterPage", ctxt_page_1);
/* push '"D_ApplicationStack[TopAppName:Application.pyProductName,TopAppVersion:Application.pyProductVersion]"' to scope SOURCE */
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = pega.findDataPage("D_ApplicationStack", false, "TopAppVersion", scalarValueQuery_8.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "TopAppName", scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT));
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "D_ApplicationStack[TopAppName:Application.pyProductName,TopAppVersion:Application.pyProductVersion]", ctxt_page_2);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");ClipboardPage source_context_1 = pega.getScopedStepContext("SOURCE");actionProlog(pz_CurrentTraceInfo,"4.1", "Update Page", source_context_1, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1", "Update Page", source_context_1, target_context_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_2) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1", "Set .pxResults", source_3, target_17);
{
    ClipboardProperty pzSourceVar12 = (ClipboardProperty) null;
    PRStackFrame ctxt_frame_6 = null;
    try {
        ctxt_frame_6 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_6.getStepPage();
        pzSourceVar12 = myStepPage.getProperty("pxResults");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
    }
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.getViaPropRef(".pxResults", pRef_13, myStepPage, false, false).setValue(pzSourceVar12);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1", "Set .pxResults", source_3, target_17);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
/* entering new scope */
boolean pop_ctxt_page_3 = false;
boolean pop_ctxt_page_4 = false;
try {
/* push '"pyTempFilterPage"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
String pz_16 = "pyTempFilterPage";
ctxt_page_3 = tools.findPage(pz_16, true);
if (ctxt_page_3 == null) {
ctxt_page_3 = tools.findPage(pz_16, false);
ctxt_page_3.putString("pxObjClass", "$None");
}
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "pyTempFilterPage", ctxt_page_3);
/* push '"D_pzApplicationStackNoPega[TopAppName:Application.pyProductName,TopAppVersion:Application.pyProductVersion]"' to scope SOURCE */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = pega.findDataPage("D_pzApplicationStackNoPega", false, "TopAppVersion", scalarValueQuery_8.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "TopAppName", scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT));
pop_ctxt_page_4 = pega.pushScopedStepContext("SOURCE", "D_pzApplicationStackNoPega[TopAppName:Application.pyProductName,TopAppVersion:Application.pyProductVersion]", ctxt_page_4);
ClipboardPage target_context_2 = pega.getScopedStepContext("TARGET");ClipboardPage source_context_2 = pega.getScopedStepContext("SOURCE");actionProlog(pz_CurrentTraceInfo,"5.1", "Update Page", source_context_2, target_context_2);
if (updatePage_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.1", "Update Page", source_context_2, target_context_2);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_4) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1.1", "Set .pxResults", source_4, target_18);
{
    ClipboardProperty pzSourceVar19 = (ClipboardProperty) null;
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pzSourceVar19 = myStepPage.getProperty("pxResults");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        pega.getViaPropRef(".pxResults", pRef_13, myStepPage, false, false).setValue(pzSourceVar19);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1.1", "Set .pxResults", source_4, target_18);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__3 = pega.invokeWhen("pyAlwaysShowPegaRules", "PegaGadget-Filter", "PegaGadget-Filter");
return pz__3;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_13(pz_CurrentTraceInfo)) {
ClipboardPage target_19 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7.1", "When", null, target_19);
if (when_13(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"7.1", "When", null, target_19);
} else {
ClipboardPage target_20 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7.2", "Otherwise", null, target_20);
if (otherwise_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"7.2", "Otherwise", null, target_20);
}
return CODE_CONTINUE;
}private boolean whenCondition_13(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__5 = pega.invokeWhen("IsAPegaDeveloper", "PegaGadget-Filter", "PegaGadget-Filter");
return pz__5;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_13(RuleTraceInfo pz_CurrentTraceInfo) {
return CODE_CONTINUE;
}private int otherwise_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.2.1", "Set param.size", source_5, target_21);
{
    tools.putParamValue("size", PropertyInfo.TYPE_INTEGER, (pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, "Utilities", new Object[] { pega.findPageWithException("D_ApplicationStack", null).getProperty("pxResults") })).intValue());
}

actionEpilog(pz_CurrentTraceInfo,"7.2.1", "Set param.size", source_5, target_21);
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_22 = pega.findPageWithException("pyTempFilterPage", "$None").getProperty("pxResults");
targetProperty_1 = pz_22;
// Acquire a reference to the source Page; we use this as the new source context
ClipboardPage ctxt_page_5 = null;
ClipboardProperty pz_24 = propertyQuery_23.resolve(tools, pega.findDataPage("D_ApplicationStack", true, "TopAppVersion", scalarValueQuery_8.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "TopAppName", scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)), tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "size"));
ctxt_page_5 = pz_24 == null ? null : pz_24.getPageValue();
if (ctxt_page_5 != null) {
pega.pushScopedStepContext("SOURCE",ctxt_page_5.getName(),ctxt_page_5);actionProlog(pz_CurrentTraceInfo,"7.2.2", "Append to", ctxt_page_5, targetProperty_1);
targetProperty_1.add(ctxt_page_5);
actionEpilog(pz_CurrentTraceInfo,"7.2.2", "Append to", ctxt_page_5, targetProperty_1);
pega.popScopedStepContext("SOURCE");
}
return CODE_CONTINUE;
}private int otherwise_2(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_14(pz_CurrentTraceInfo)) {
ClipboardPage target_22 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10.1", "When", null, target_22);
if (when_14(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"10.1", "When", null, target_22);
} else if (otherwiseWhenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_23 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10.2", "Otherwise When", null, target_23);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"10.2", "Otherwise When", null, target_23);
} else {
ClipboardPage target_24 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10.3", "Otherwise", null, target_24);
if (otherwise_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"10.3", "Otherwise", null, target_24);
}
return CODE_CONTINUE;
}private boolean whenCondition_14(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__7 = pega.invokeWhen("IsAPegaDeveloper", "PegaGadget-Filter", "PegaGadget-Filter");
return pz__7;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int when_14(RuleTraceInfo pz_CurrentTraceInfo) {
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__9 = pega.invokeWhen("pzIsPegaApplicationDeveloper", "PegaGadget-Filter", "PegaGadget-Filter");
return pz__9;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
return CODE_CONTINUE;
}private int otherwise_4(RuleTraceInfo pz_CurrentTraceInfo) {
/* entering new scope */
boolean pop_ctxt_page_6 = false;
try {
/* push '"pyTempFilterPage_Temp"' to scope TARGET */
ClipboardPage ctxt_page_6 = null;
String pz_27 = "pyTempFilterPage_Temp";
ctxt_page_6 = tools.findPage(pz_27, true);
if (ctxt_page_6 == null) {
ctxt_page_6 = tools.findPage(pz_27, false);
ctxt_page_6.putString("pxObjClass", "$None");
}
pop_ctxt_page_6 = pega.pushScopedStepContext("TARGET", "pyTempFilterPage_Temp", ctxt_page_6);
ClipboardPage target_context_3 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10.3.1", "Update Page", null, target_context_3);
if (updatePage_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"10.3.1", "Update Page", null, target_context_3);
} finally {
if (pop_ctxt_page_6) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Start Page-Copy from Set action
{
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10.3.2", "Set pyTempFilterPage", source_6, target_25);
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: pyTempFilterPage_Temp
sourcePage = tools.findPage("pyTempFilterPage_Temp", true);
// Expression: pyTempFilterPage
targetPage = tools.findPage("pyTempFilterPage", false);
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
actionEpilog(pz_CurrentTraceInfo,"10.3.2", "Set pyTempFilterPage", source_6, target_25);
}// End Page-Copy from Set action
// Start Page-Remove from Remove action
actionProlog(pz_CurrentTraceInfo,"10.3.3", "Remove pyTempFilterPage_Temp", null, null);
{
// Expression: pyTempFilterPage_Temp
myStepPage = tools.findPage("pyTempFilterPage_Temp");
if (myStepPage != null) {
ClipboardProperty parentProp = myStepPage.getParentProperty();
if (parentProp != null) {
parentProp.removeFromClipboard();
} else {
myStepPage.removeFromClipboard();
}
}
}
myStepPage = tools.getStepPage();
// End Page-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"10.3.3", "Remove pyTempFilterPage_Temp", null, null);
return CODE_CONTINUE;
}private int updatePage_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_28 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_21 = null;
try {
ctxt_frame_21 = pega.pushStackFrame("pyTempFilterPage.pxResults", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_21.getStepPage();
pz_28 = pega.findPageWithException("pyTempFilterPage", "$None").getIfPresent("pxResults");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
} // return to previous step page

foreach_prop_1 = pz_28;
actionProlog(pz_CurrentTraceInfo,"10.3.1.1", "For Each Page In", null, pz_28);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_7 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_7 = false;
boolean pop_ctxt_page_8 = false;
try {
/* push '"pyTempFilterPage.pxResults(<CURRENT>)"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_22 = null;
try {
ctxt_frame_22 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_22.getStepPage();
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_7;
pop_ctxt_page_7 = pega.pushScopedStepContext("TARGET", "pyTempFilterPage.pxResults(<CURRENT>)", ctxt_page_target_1);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
} // return to previous step page
/* push '"pyTempFilterPage.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_7;
pop_ctxt_page_8 = pega.pushScopedStepContext("SOURCE", "pyTempFilterPage.pxResults(<CURRENT>)", ctxt_page_source_1);
switch (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_1;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_7) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_8) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"10.3.1.1", "For Each Page In", null, pz_28);
return CODE_CONTINUE;
}private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_15(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_26 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10.3.1.1.1", "When", null, target_26);
switch (when_15(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"10.3.1.1.1", "When", null, target_26);
}
return CODE_CONTINUE;
}private boolean whenCondition_15(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_24 = null;
try {
ctxt_frame_24 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_24.getStepPage();
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@notEquals(@lookup(\"pyLayerClassification\",\"Rule-Application\",\"pyProductName\",.pyProductName,\"pyProductVersion\",.pyProductVersion,\"\",\"\"),\"PegaPlatform\") &amp;&amp; @notEquals(@lookup(\"pyLayerClassification\",\"Rule-Application\",\"pyProductName\",.pyProductName,\"pyProductVersion\",.pyProductVersion,\"\",\"\"),\"PegaApplication\")&amp;&amp; @notEquals(@lookup(\"pyLayerClassification\",\"Rule-Application\",\"pyProductName\",.pyProductName,\"pyProductVersion\",.pyProductVersion,\"\",\"\"),\"PegaSample\")");
try {
boolean pz_29 = (((pega.<Boolean>resolveMethodCall("notEquals--(String,String)", "notEquals", null, null, new Object[] { pega.<String>resolveMethodCall("lookup--(String,String,String,Std6af5986c45b6cb88f9367700da46181", "lookup", null, null, new Object[] { "pyLayerClassification", "Rule-Application", "pyProductName", scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyProductVersion", scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "", "" }), "PegaPlatform" })).booleanValue() && (pega.<Boolean>resolveMethodCall("notEquals--(String,String)", "notEquals", null, null, new Object[] { pega.<String>resolveMethodCall("lookup--(String,String,String,Std6af5986c45b6cb88f9367700da46181", "lookup", null, null, new Object[] { "pyLayerClassification", "Rule-Application", "pyProductName", scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyProductVersion", scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "", "" }), "PegaApplication" })).booleanValue()) && (pega.<Boolean>resolveMethodCall("notEquals--(String,String)", "notEquals", null, null, new Object[] { pega.<String>resolveMethodCall("lookup--(String,String,String,Std6af5986c45b6cb88f9367700da46181", "lookup", null, null, new Object[] { "pyLayerClassification", "Rule-Application", "pyProductName", scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyProductVersion", scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "", "" }), "PegaSample" })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@notEquals(@lookup(\"pyLayerClassification\",\"Rule-Application\",\"pyProductName\",.pyProductName,\"pyProductVersion\",.pyProductVersion,\"\",\"\"),\"PegaPlatform\") &amp;&amp; @notEquals(@lookup(\"pyLayerClassification\",\"Rule-Application\",\"pyProductName\",.pyProductName,\"pyProductVersion\",.pyProductVersion,\"\",\"\"),\"PegaApplication\")&amp;&amp; @notEquals(@lookup(\"pyLayerClassification\",\"Rule-Application\",\"pyProductName\",.pyProductName,\"pyProductVersion\",.pyProductVersion,\"\",\"\"),\"PegaSample\")",pz_29);
return pz_29;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@notEquals(@lookup(\"pyLayerClassification\",\"Rule-Application\",\"pyProductName\",.pyProductName,\"pyProductVersion\",.pyProductVersion,\"\",\"\"),\"PegaPlatform\") &amp;&amp; @notEquals(@lookup(\"pyLayerClassification\",\"Rule-Application\",\"pyProductName\",.pyProductName,\"pyProductVersion\",.pyProductVersion,\"\",\"\"),\"PegaApplication\")&amp;&amp; @notEquals(@lookup(\"pyLayerClassification\",\"Rule-Application\",\"pyProductName\",.pyProductName,\"pyProductVersion\",.pyProductVersion,\"\",\"\"),\"PegaSample\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_24);
} // return to previous step page
}private int when_15(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_30 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_25 = null;
try {
ctxt_frame_25 = pega.pushStackFrame("pyTempFilterPage_Temp.pxResults", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_25.getStepPage();
pz_30 = pega.findPageWithException("pyTempFilterPage_Temp", "$None").getProperty("pxResults");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
} // return to previous step page

targetProperty_2 = pz_30;
ClipboardPage ctxt_page_source_2 = pega.getScopedStepContext("SOURCE");
actionProlog(pz_CurrentTraceInfo,"10.3.1.1.1.1", "Append to", ctxt_page_source_2, targetProperty_2);
targetProperty_2.add(ctxt_page_source_2);
actionEpilog(pz_CurrentTraceInfo,"10.3.1.1.1.1", "Append to", ctxt_page_source_2, targetProperty_2);
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@LengthOfPageList(.pyApplicationFilterChoices)&lt;1");
try {
boolean pz_31 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { myStepPage.getProperty("pyApplicationFilterChoices") })).intValue() < 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@LengthOfPageList(.pyApplicationFilterChoices)&lt;1",pz_31);
return pz_31;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@LengthOfPageList(.pyApplicationFilterChoices)&lt;1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_16(pz_CurrentTraceInfo)) {
ClipboardPage target_27 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"11.1", "When", null, target_27);
if (when_16(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"11.1", "When", null, target_27);
} else if (otherwiseWhenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_28 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"11.2", "Otherwise When", null, target_28);
if (otherwiseWhen_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"11.2", "Otherwise When", null, target_28);
} else {
ClipboardPage target_29 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"11.3", "Otherwise", null, target_29);
if (otherwise_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"11.3", "Otherwise", null, target_29);
}
return CODE_CONTINUE;
}private boolean whenCondition_16(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_8 = true;
PRStackFrame pz_modelTargetConditionFrame_8 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__11 = pega.invokeWhen("pzShowCurrentApp", "PegaGadget-Filter", "PegaGadget-Filter");
return pz__11;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_8, pz_modelTargetConditionFrame_8);
}
}private int when_16(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_3 = null;
ClipboardProperty pz_32 = myStepPage.getProperty("pyApplicationFilterChoices");
targetProperty_3 = pz_32;
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_33 = pega.findPageWithException("pyTempFilterPage", "$None").getIfPresent("pxResults");
foreach_prop_2 = pz_33;
actionProlog(pz_CurrentTraceInfo,"11.1.1", "Append and Map to", pz_33, targetProperty_3);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_9 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_10 = false;
try {
/* push '"pyTempFilterPage.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_9;
pop_ctxt_page_10 = pega.pushScopedStepContext("SOURCE", "pyTempFilterPage.pxResults(<CURRENT>)", ctxt_page_target_2);
if (whenCondition_17(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo)) {
/* entering new scope */
boolean pop_ctxt_page_9 = false;
try {
/* push '".pyApplicationFilterChoices"' to scope TARGET */
ClipboardPage ctxt_page_8 = null;
ctxt_page_8 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_9 = pega.pushScopedStepContext("TARGET", ".pyApplicationFilterChoices", ctxt_page_8);
if (forEach_2(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
} finally {
if (pop_ctxt_page_9) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_10) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"11.1.1", "Append and Map to", pz_33, targetProperty_3);
return CODE_CONTINUE;
}private boolean whenCondition_17(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_30 = null;
try {
ctxt_frame_30 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_30.getStepPage();
boolean pz_CheckMessage_9 = true;
PRStackFrame pz_modelTargetConditionFrame_9 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__13 = pega.invokeWhen("pzShowPegaRULESFilter", "PegaGadget-Filter", "Rule-Application");
return pz__13;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_9, pz_modelTargetConditionFrame_9);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
} // return to previous step page
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1.1.1", "Set .pyFilterInsName", source_7, target_30);
{
    String pzSourceVar34 = "";
    PRStackFrame ctxt_frame_32 = null;
    try {
        ctxt_frame_32 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_32.getStepPage();
        pzSourceVar34 = scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_32);
    }
    PRStackFrame ctxt_frame_31 = null;
    try {
        ctxt_frame_31 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_31.getStepPage();
        pega.setViaPropRef(".pyFilterInsName", pRef_36, myStepPage, pzSourceVar34, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_31);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1.1.1", "Set .pyFilterInsName", source_7, target_30);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1.1.2", "Set .pyFilterName", source_8, target_31);
{
    String pzSourceVar38 = "";
    PRStackFrame ctxt_frame_36 = null;
    try {
        ctxt_frame_36 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_36.getStepPage();
        pzSourceVar38 = scalarValueQuery_39.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_36);
    }
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pega.setViaPropRef(".pyFilterName", pRef_40, myStepPage, pzSourceVar38, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1.1.2", "Set .pyFilterName", source_8, target_31);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1.1.3", "Set .pyFilterProductName", source_9, target_32);
{
    String pzSourceVar42 = "";
    PRStackFrame ctxt_frame_40 = null;
    try {
        ctxt_frame_40 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_40.getStepPage();
        pzSourceVar42 = scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_40);
    }
    PRStackFrame ctxt_frame_39 = null;
    try {
        ctxt_frame_39 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_39.getStepPage();
        pega.setViaPropRef(".pyFilterProductName", pRef_43, myStepPage, pzSourceVar42, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1.1.3", "Set .pyFilterProductName", source_9, target_32);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1.1.4", "Set .pyFilterType", source_10, target_33);
{
    String pzSourceVar45 = "";
    PRStackFrame ctxt_frame_44 = null;
    try {
        ctxt_frame_44 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_44.getStepPage();
        pzSourceVar45 = "Application";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_44);
    }
    PRStackFrame ctxt_frame_43 = null;
    try {
        ctxt_frame_43 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_43.getStepPage();
        pega.setViaPropRef(".pyFilterType", pRef_46, myStepPage, pzSourceVar45, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_43);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1.1.4", "Set .pyFilterType", source_10, target_33);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_34 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1.1.5", "Set .pyFilterVersion", source_11, target_34);
{
    String pzSourceVar48 = "";
    PRStackFrame ctxt_frame_48 = null;
    try {
        ctxt_frame_48 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_48.getStepPage();
        pzSourceVar48 = scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_48);
    }
    PRStackFrame ctxt_frame_47 = null;
    try {
        ctxt_frame_47 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_47.getStepPage();
        pega.setViaPropRef(".pyFilterVersion", pRef_49, myStepPage, pzSourceVar48, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_47);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1.1.5", "Set .pyFilterVersion", source_11, target_34);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_35 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1.1.6", "Set .pxListSubscript", source_12, target_35);
{
    String pzSourceVar51 = "";
    PRStackFrame ctxt_frame_52 = null;
    try {
        ctxt_frame_52 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_52.getStepPage();
        pzSourceVar51 = scalarValueQuery_52.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_52);
    }
    PRStackFrame ctxt_frame_51 = null;
    try {
        ctxt_frame_51 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_51.getStepPage();
        pega.setViaPropRef(".pxListSubscript", pRef_53, myStepPage, pzSourceVar51, "sTY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_51);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1.1.6", "Set .pxListSubscript", source_12, target_35);
if (whenCondition_18(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_36 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"11.1.1.7", "When", null, target_36);
if (when_17(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"11.1.1.7", "When", null, target_36);
}
return CODE_CONTINUE;
}private boolean whenCondition_18(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_55 = null;
try {
ctxt_frame_55 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_55.getStepPage();
boolean pz_CheckMessage_10 = true;
PRStackFrame pz_modelTargetConditionFrame_10 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxListSubscript==1");
try {
boolean pz_55 = (scalarValueQuery_52.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) == 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxListSubscript==1",pz_55);
return pz_55;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxListSubscript==1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_10, pz_modelTargetConditionFrame_10);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_55);
} // return to previous step page
}private int when_17(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_37 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1.1.7.1", "Set .pyFilterActive", source_13, target_37);
{
    String pzSourceVar56 = "";
    PRStackFrame ctxt_frame_57 = null;
    try {
        ctxt_frame_57 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_57.getStepPage();
        pzSourceVar56 = "true";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_57);
    }
    PRStackFrame ctxt_frame_56 = null;
    try {
        ctxt_frame_56 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_56.getStepPage();
        pega.setViaPropRef(".pyFilterActive", pRef_57, myStepPage, pzSourceVar56, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_56);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1.1.7.1", "Set .pyFilterActive", source_13, target_37);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_11 = true;
PRStackFrame pz_modelTargetConditionFrame_11 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__15 = pega.invokeWhen("pyAlwaysShowPegaRules", "PegaGadget-Filter", "PegaGadget-Filter");
return pz__15;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_11, pz_modelTargetConditionFrame_11);
}
}private int otherwiseWhen_2(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_4 = null;
ClipboardProperty pz_59 = myStepPage.getProperty("pyApplicationFilterChoices");
targetProperty_4 = pz_59;
ClipboardProperty foreach_prop_3 = null;
ClipboardProperty pz_60 = pega.findPageWithException("pyTempFilterPage", "$None").getIfPresent("pxResults");
foreach_prop_3 = pz_60;
actionProlog(pz_CurrentTraceInfo,"11.2.1", "Append and Map to", pz_60, targetProperty_4);
if (foreach_prop_3 != null) {
Iterator collectionIt = foreach_prop_3.iterator();
int currentLoopOffset = 1;
forEachLoop_3: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_11 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_12 = false;
try {
/* push '"pyTempFilterPage.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_target_3 = null;
ctxt_page_target_3 = ctxt_page_11;
pop_ctxt_page_12 = pega.pushScopedStepContext("SOURCE", "pyTempFilterPage.pxResults(<CURRENT>)", ctxt_page_target_3);
if (whenCondition_19(currentLoopOffset, foreach_prop_3.getReference(), pz_CurrentTraceInfo)) {
/* entering new scope */
boolean pop_ctxt_page_11 = false;
try {
/* push '".pyApplicationFilterChoices"' to scope TARGET */
ClipboardPage ctxt_page_10 = null;
ctxt_page_10 = targetProperty_4.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_11 = pega.pushScopedStepContext("TARGET", ".pyApplicationFilterChoices", ctxt_page_10);
if (forEach_3(currentLoopOffset, foreach_prop_3.getReference(), pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
} finally {
if (pop_ctxt_page_11) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_12) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"11.2.1", "Append and Map to", pz_60, targetProperty_4);
return CODE_CONTINUE;
}private boolean whenCondition_19(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_63 = null;
try {
ctxt_frame_63 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_63.getStepPage();
boolean pz_CheckMessage_12 = true;
PRStackFrame pz_modelTargetConditionFrame_12 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__17 = pega.invokeWhen("pzShowPegaRULESFilter", "PegaGadget-Filter", "Rule-Application");
return pz__17;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_12, pz_modelTargetConditionFrame_12);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_63);
} // return to previous step page
}private int forEach_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_38 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.2.1.1", "Set .pyFilterInsName", source_14, target_38);
{
    String pzSourceVar61 = "";
    PRStackFrame ctxt_frame_65 = null;
    try {
        ctxt_frame_65 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_65.getStepPage();
        pzSourceVar61 = scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_65);
    }
    PRStackFrame ctxt_frame_64 = null;
    try {
        ctxt_frame_64 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_64.getStepPage();
        pega.setViaPropRef(".pyFilterInsName", pRef_36, myStepPage, pzSourceVar61, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_64);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.2.1.1", "Set .pyFilterInsName", source_14, target_38);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_39 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.2.1.2", "Set .pyFilterName", source_15, target_39);
{
    String pzSourceVar63 = "";
    PRStackFrame ctxt_frame_69 = null;
    try {
        ctxt_frame_69 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_69.getStepPage();
        pzSourceVar63 = scalarValueQuery_39.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_69);
    }
    PRStackFrame ctxt_frame_68 = null;
    try {
        ctxt_frame_68 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_68.getStepPage();
        pega.setViaPropRef(".pyFilterName", pRef_40, myStepPage, pzSourceVar63, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_68);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.2.1.2", "Set .pyFilterName", source_15, target_39);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_40 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.2.1.3", "Set .pyFilterProductName", source_16, target_40);
{
    String pzSourceVar65 = "";
    PRStackFrame ctxt_frame_73 = null;
    try {
        ctxt_frame_73 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_73.getStepPage();
        pzSourceVar65 = scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_73);
    }
    PRStackFrame ctxt_frame_72 = null;
    try {
        ctxt_frame_72 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_72.getStepPage();
        pega.setViaPropRef(".pyFilterProductName", pRef_43, myStepPage, pzSourceVar65, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_72);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.2.1.3", "Set .pyFilterProductName", source_16, target_40);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_41 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.2.1.4", "Set .pyFilterType", source_17, target_41);
{
    String pzSourceVar67 = "";
    PRStackFrame ctxt_frame_77 = null;
    try {
        ctxt_frame_77 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_77.getStepPage();
        pzSourceVar67 = "Application";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_77);
    }
    PRStackFrame ctxt_frame_76 = null;
    try {
        ctxt_frame_76 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_76.getStepPage();
        pega.setViaPropRef(".pyFilterType", pRef_46, myStepPage, pzSourceVar67, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_76);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.2.1.4", "Set .pyFilterType", source_17, target_41);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_42 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.2.1.5", "Set .pyFilterVersion", source_18, target_42);
{
    String pzSourceVar69 = "";
    PRStackFrame ctxt_frame_81 = null;
    try {
        ctxt_frame_81 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_81.getStepPage();
        pzSourceVar69 = scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_81);
    }
    PRStackFrame ctxt_frame_80 = null;
    try {
        ctxt_frame_80 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_80.getStepPage();
        pega.setViaPropRef(".pyFilterVersion", pRef_49, myStepPage, pzSourceVar69, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_80);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.2.1.5", "Set .pyFilterVersion", source_18, target_42);
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_43 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.2.1.6", "Set .pxListSubscript", source_19, target_43);
{
    String pzSourceVar71 = "";
    PRStackFrame ctxt_frame_85 = null;
    try {
        ctxt_frame_85 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_85.getStepPage();
        pzSourceVar71 = scalarValueQuery_52.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_85);
    }
    PRStackFrame ctxt_frame_84 = null;
    try {
        ctxt_frame_84 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_84.getStepPage();
        pega.setViaPropRef(".pxListSubscript", pRef_53, myStepPage, pzSourceVar71, "sTY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_84);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.2.1.6", "Set .pxListSubscript", source_19, target_43);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_44 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.2.1.7", "Set .pyFilterActive", source_20, target_44);
{
    String pzSourceVar73 = "";
    PRStackFrame ctxt_frame_89 = null;
    try {
        ctxt_frame_89 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_89.getStepPage();
        pzSourceVar73 = "true";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_89);
    }
    PRStackFrame ctxt_frame_88 = null;
    try {
        ctxt_frame_88 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_88.getStepPage();
        pega.setViaPropRef(".pyFilterActive", pRef_57, myStepPage, pzSourceVar73, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_88);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.2.1.7", "Set .pyFilterActive", source_20, target_44);
return CODE_CONTINUE;
}private int otherwise_5(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_5 = null;
ClipboardProperty pz_75 = myStepPage.getProperty("pyApplicationFilterChoices");
targetProperty_5 = pz_75;
ClipboardProperty foreach_prop_4 = null;
ClipboardProperty pz_76 = pega.findPageWithException("pyTempFilterPage", "$None").getIfPresent("pxResults");
foreach_prop_4 = pz_76;
actionProlog(pz_CurrentTraceInfo,"11.3.1", "Append and Map to", pz_76, targetProperty_5);
if (foreach_prop_4 != null) {
Iterator collectionIt = foreach_prop_4.iterator();
int currentLoopOffset = 1;
forEachLoop_4: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_13 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_14 = false;
try {
/* push '"pyTempFilterPage.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_target_4 = null;
ctxt_page_target_4 = ctxt_page_13;
pop_ctxt_page_14 = pega.pushScopedStepContext("SOURCE", "pyTempFilterPage.pxResults(<CURRENT>)", ctxt_page_target_4);
if (whenCondition_20(currentLoopOffset, foreach_prop_4.getReference(), pz_CurrentTraceInfo)) {
/* entering new scope */
boolean pop_ctxt_page_13 = false;
try {
/* push '".pyApplicationFilterChoices"' to scope TARGET */
ClipboardPage ctxt_page_12 = null;
ctxt_page_12 = targetProperty_5.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_13 = pega.pushScopedStepContext("TARGET", ".pyApplicationFilterChoices", ctxt_page_12);
if (forEach_4(currentLoopOffset, foreach_prop_4.getReference(), pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
} finally {
if (pop_ctxt_page_13) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_14) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"11.3.1", "Append and Map to", pz_76, targetProperty_5);
return CODE_CONTINUE;
}private boolean whenCondition_20(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_94 = null;
try {
ctxt_frame_94 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_94.getStepPage();
boolean pz_CheckMessage_13 = true;
PRStackFrame pz_modelTargetConditionFrame_13 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__19 = pega.invokeWhen("pzShowPegaRULESFilter", "PegaGadget-Filter", "Rule-Application");
return pz__19;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_13, pz_modelTargetConditionFrame_13);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_94);
} // return to previous step page
}private int forEach_4(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_45 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.3.1.1", "Set .pyFilterInsName", source_21, target_45);
{
    String pzSourceVar77 = "";
    PRStackFrame ctxt_frame_96 = null;
    try {
        ctxt_frame_96 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_96.getStepPage();
        pzSourceVar77 = scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_96);
    }
    PRStackFrame ctxt_frame_95 = null;
    try {
        ctxt_frame_95 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_95.getStepPage();
        pega.setViaPropRef(".pyFilterInsName", pRef_36, myStepPage, pzSourceVar77, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_95);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.3.1.1", "Set .pyFilterInsName", source_21, target_45);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_46 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.3.1.2", "Set .pyFilterName", source_22, target_46);
{
    String pzSourceVar79 = "";
    PRStackFrame ctxt_frame_100 = null;
    try {
        ctxt_frame_100 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_100.getStepPage();
        pzSourceVar79 = scalarValueQuery_39.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_100);
    }
    PRStackFrame ctxt_frame_99 = null;
    try {
        ctxt_frame_99 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_99.getStepPage();
        pega.setViaPropRef(".pyFilterName", pRef_40, myStepPage, pzSourceVar79, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_99);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.3.1.2", "Set .pyFilterName", source_22, target_46);
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_47 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.3.1.3", "Set .pyFilterProductName", source_23, target_47);
{
    String pzSourceVar81 = "";
    PRStackFrame ctxt_frame_104 = null;
    try {
        ctxt_frame_104 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_104.getStepPage();
        pzSourceVar81 = scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_104);
    }
    PRStackFrame ctxt_frame_103 = null;
    try {
        ctxt_frame_103 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_103.getStepPage();
        pega.setViaPropRef(".pyFilterProductName", pRef_43, myStepPage, pzSourceVar81, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_103);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.3.1.3", "Set .pyFilterProductName", source_23, target_47);
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_48 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.3.1.4", "Set .pyFilterType", source_24, target_48);
{
    String pzSourceVar83 = "";
    PRStackFrame ctxt_frame_108 = null;
    try {
        ctxt_frame_108 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_108.getStepPage();
        pzSourceVar83 = "Application";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_108);
    }
    PRStackFrame ctxt_frame_107 = null;
    try {
        ctxt_frame_107 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_107.getStepPage();
        pega.setViaPropRef(".pyFilterType", pRef_46, myStepPage, pzSourceVar83, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_107);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.3.1.4", "Set .pyFilterType", source_24, target_48);
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_49 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.3.1.5", "Set .pyFilterVersion", source_25, target_49);
{
    String pzSourceVar85 = "";
    PRStackFrame ctxt_frame_112 = null;
    try {
        ctxt_frame_112 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_112.getStepPage();
        pzSourceVar85 = scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_112);
    }
    PRStackFrame ctxt_frame_111 = null;
    try {
        ctxt_frame_111 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_111.getStepPage();
        pega.setViaPropRef(".pyFilterVersion", pRef_49, myStepPage, pzSourceVar85, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_111);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.3.1.5", "Set .pyFilterVersion", source_25, target_49);
ClipboardPage source_26 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_50 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.3.1.6", "Set .pxListSubscript", source_26, target_50);
{
    String pzSourceVar87 = "";
    PRStackFrame ctxt_frame_116 = null;
    try {
        ctxt_frame_116 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_116.getStepPage();
        pzSourceVar87 = scalarValueQuery_52.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_116);
    }
    PRStackFrame ctxt_frame_115 = null;
    try {
        ctxt_frame_115 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_115.getStepPage();
        pega.setViaPropRef(".pxListSubscript", pRef_53, myStepPage, pzSourceVar87, "sTY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_115);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.3.1.6", "Set .pxListSubscript", source_26, target_50);
if (whenCondition_21(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_51 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"11.3.1.7", "When", null, target_51);
if (when_18(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"11.3.1.7", "When", null, target_51);
}
return CODE_CONTINUE;
}private boolean whenCondition_21(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_119 = null;
try {
ctxt_frame_119 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_119.getStepPage();
boolean pz_CheckMessage_14 = true;
PRStackFrame pz_modelTargetConditionFrame_14 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFilterProductName !=\"PegaRULES\"");
try {
boolean pz_90 = (!(scalarValueQuery_89.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("PegaRULES")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFilterProductName !=\"PegaRULES\"",pz_90);
return pz_90;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFilterProductName !=\"PegaRULES\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_14, pz_modelTargetConditionFrame_14);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_119);
} // return to previous step page
}private int when_18(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_27 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_52 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.3.1.7.1", "Set .pyFilterActive", source_27, target_52);
{
    String pzSourceVar91 = "";
    PRStackFrame ctxt_frame_121 = null;
    try {
        ctxt_frame_121 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_121.getStepPage();
        pzSourceVar91 = "true";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_121);
    }
    PRStackFrame ctxt_frame_120 = null;
    try {
        ctxt_frame_120 = pega.pushStackFrame("Embed-FilterGadget-Filter", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_120.getStepPage();
        pega.setViaPropRef(".pyFilterActive", pRef_57, myStepPage, pzSourceVar91, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_120);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.3.1.7.1", "Set .pyFilterActive", source_27, target_52);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_15 = true;
PRStackFrame pz_modelTargetConditionFrame_15 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__21 = pega.invokeWhen("pzCallPreDataTransform", "PegaGadget-Filter", "PegaGadget-Filter");
return pz__21;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_15, pz_modelTargetConditionFrame_15);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_28 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_53 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12.1", "Set .pyCallPreDataTransform", source_28, target_53);
{
    pega.setViaPropRef(".pyCallPreDataTransform", pRef_93, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"12.1", "Set .pyCallPreDataTransform", source_28, target_53);
return CODE_CONTINUE;
}private boolean whenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_16 = true;
PRStackFrame pz_modelTargetConditionFrame_16 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__23 = pega.invokeWhen("pzCallPostDataTransform", "PegaGadget-Filter", "PegaGadget-Filter");
return pz__23;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_16, pz_modelTargetConditionFrame_16);
}
}private int when_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_29 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_54 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.1", "Set .pyCallPostDataTransform", source_29, target_54);
{
    pega.setViaPropRef(".pyCallPostDataTransform", pRef_94, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"13.1", "Set .pyCallPostDataTransform", source_29, target_54);
return CODE_CONTINUE;
}private boolean whenCondition_6(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_17 = true;
PRStackFrame pz_modelTargetConditionFrame_17 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "myParamPage.pyParamEnableApplicationFilter==true");
try {
boolean pz_96 = (scalarValueQuery_95.resolveToBoolean(tools, pega.findPageWithException("myParamPage", "PegaGadget-Filter"), ImmutablePropertyInfo.TYPE_TEXT) == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "myParamPage.pyParamEnableApplicationFilter==true",pz_96);
return pz_96;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("myParamPage.pyParamEnableApplicationFilter==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_17, pz_modelTargetConditionFrame_17);
}
}private int when_6(RuleTraceInfo pz_CurrentTraceInfo) {

// processScalarParameters
ParameterPage pz_param_2 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"14.1", "Apply Data Transform pzBuildActiveApplicationFilters", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_2 = null;
if (myStepPage != null) {
	pz_modelClass_2 = myStepPage.getClassName();
}
if ((pz_modelClass_2 == null) || (pz_modelClass_2.length() == 0)) { 
	pz_modelClass_2 = "PegaGadget-Filter";
}
StringMap pz_modelKey_2 = new HashStringMap(3);
pz_modelKey_2.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_2.putString("pyModelName", "pzBuildActiveApplicationFilters");
pz_modelKey_2.putString("pyClassName", pz_modelClass_2);
tools.applyModel(myStepPage, pz_modelKey_2, pz_param_2);
actionEpilog(pz_CurrentTraceInfo,"14.1", "Apply Data Transform pzBuildActiveApplicationFilters", null, null);
return CODE_CONTINUE;
}private boolean whenCondition_7(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_18 = true;
PRStackFrame pz_modelTargetConditionFrame_18 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.initialClassList !=\"\"");
try {
boolean pz_97 = (!(tools.getParamValue("initialClassList").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.initialClassList !=\"\"",pz_97);
return pz_97;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.initialClassList !=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_18, pz_modelTargetConditionFrame_18);
}
}private int when_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_30 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_55 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19.1", "Set .pyActiveClassFiltersString", source_30, target_55);
{
    pega.setViaPropRef(".pyActiveClassFiltersString", pRef_98, myStepPage, tools.getParamValue("initialClassList"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"19.1", "Set .pyActiveClassFiltersString", source_30, target_55);
return CODE_CONTINUE;
}private boolean whenCondition_8(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_19 = true;
PRStackFrame pz_modelTargetConditionFrame_19 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!@PropertyExists(\".pyActiveClassFiltersString\")");
try {
boolean pz_99 = ((!(pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, null, new Object[] { ".pyActiveClassFiltersString" })).booleanValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!@PropertyExists(\".pyActiveClassFiltersString\")",pz_99);
return pz_99;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!@PropertyExists(\".pyActiveClassFiltersString\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_19, pz_modelTargetConditionFrame_19);
}
}private int when_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_31 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_56 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20.1", "Set .pyActiveClassFiltersString", source_31, target_56);
{
    pega.setViaPropRef(".pyActiveClassFiltersString", pRef_98, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"20.1", "Set .pyActiveClassFiltersString", source_31, target_56);
return CODE_CONTINUE;
}private boolean whenCondition_9(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_20 = true;
PRStackFrame pz_modelTargetConditionFrame_20 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.searchTerm !=\"\"");
try {
boolean pz_100 = (!(tools.getParamValue("searchTerm").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.searchTerm !=\"\"",pz_100);
return pz_100;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.searchTerm !=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_20, pz_modelTargetConditionFrame_20);
}
}private int when_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_32 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_57 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.1", "Set .pyActiveClassFilters(1).pyFilterName", source_32, target_57);
{
    pega.setViaPropRef(".pyActiveClassFilters(1).pyFilterName", pRef_101, myStepPage, tools.getParamValue("searchTerm"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"21.1", "Set .pyActiveClassFilters(1).pyFilterName", source_32, target_57);

// processScalarParameters
ParameterPage pz_param_3 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"21.2", "Apply Data Transform pzBuildActiveClassFilters", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_3 = null;
if (myStepPage != null) {
	pz_modelClass_3 = myStepPage.getClassName();
}
if ((pz_modelClass_3 == null) || (pz_modelClass_3.length() == 0)) { 
	pz_modelClass_3 = "PegaGadget-Filter";
}
StringMap pz_modelKey_3 = new HashStringMap(3);
pz_modelKey_3.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_3.putString("pyModelName", "pzBuildActiveClassFilters");
pz_modelKey_3.putString("pyClassName", pz_modelClass_3);
tools.applyModel(myStepPage, pz_modelKey_3, pz_param_3);
actionEpilog(pz_CurrentTraceInfo,"21.2", "Apply Data Transform pzBuildActiveClassFilters", null, null);
return CODE_CONTINUE;
}private boolean whenCondition_10(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_21 = true;
PRStackFrame pz_modelTargetConditionFrame_21 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!@PropertyExists(\".pySearchFilter\")");
try {
boolean pz_102 = ((!(pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, null, new Object[] { ".pySearchFilter" })).booleanValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!@PropertyExists(\".pySearchFilter\")",pz_102);
return pz_102;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!@PropertyExists(\".pySearchFilter\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_21, pz_modelTargetConditionFrame_21);
}
}private int when_10(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_33 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_58 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"22.1", "Set .pySearchFilter", source_33, target_58);
{
    pega.setViaPropRef(".pySearchFilter", pRef_103, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"22.1", "Set .pySearchFilter", source_33, target_58);
return CODE_CONTINUE;
}private boolean whenCondition_11(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_22 = true;
PRStackFrame pz_modelTargetConditionFrame_22 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.initialAppList !=\"\"");
try {
boolean pz_104 = (!(tools.getParamValue("initialAppList").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.initialAppList !=\"\"",pz_104);
return pz_104;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.initialAppList !=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_22, pz_modelTargetConditionFrame_22);
}
}private int when_11(RuleTraceInfo pz_CurrentTraceInfo) {
actionProlog(pz_CurrentTraceInfo,"23.1", "Apply Data Transform pzValidateDefaultApps", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_4 = null;
if (myStepPage != null) {
	pz_modelClass_4 = myStepPage.getClassName();
}
if ((pz_modelClass_4 == null) || (pz_modelClass_4.length() == 0)) { 
	pz_modelClass_4 = "PegaGadget-Filter";
}
StringMap pz_modelKey_4 = new HashStringMap(3);
pz_modelKey_4.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_4.putString("pyModelName", "pzValidateDefaultApps");
pz_modelKey_4.putString("pyClassName", pz_modelClass_4);
tools.applyModel(myStepPage, pz_modelKey_4, null);
actionEpilog(pz_CurrentTraceInfo,"23.1", "Apply Data Transform pzValidateDefaultApps", null, null);
if (whenCondition_22(pz_CurrentTraceInfo)) {
ClipboardPage target_59 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"23.2", "When", null, target_59);
if (when_19(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"23.2", "When", null, target_59);
}
return CODE_CONTINUE;
}private boolean whenCondition_22(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_23 = true;
PRStackFrame pz_modelTargetConditionFrame_23 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.initialAppList !=\"\"");
try {
boolean pz_105 = (!(tools.getParamValue("initialAppList").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.initialAppList !=\"\"",pz_105);
return pz_105;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.initialAppList !=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_23, pz_modelTargetConditionFrame_23);
}
}private int when_19(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_34 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_60 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"23.2.1", "Set Primary.pyActiveApplicationFiltersString", source_34, target_60);
{
    pega.setViaPropRef(".pyActiveApplicationFiltersString", pRef_106, tools.getPrimaryPage(), tools.getParamValue("initialAppList"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"23.2.1", "Set Primary.pyActiveApplicationFiltersString", source_34, target_60);
return CODE_CONTINUE;
}private boolean whenCondition_12(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_24 = true;
PRStackFrame pz_modelTargetConditionFrame_24 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.pyUsedInApplicationExplorer");
try {
boolean pz_107 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "pyUsedInApplicationExplorer");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.pyUsedInApplicationExplorer",pz_107);
return pz_107;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.pyUsedInApplicationExplorer " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_24, pz_modelTargetConditionFrame_24);
}
}private int when_12(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_35 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_61 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"24.1", "Set .pyUsedInApplicationExplorer", source_35, target_61);
{
    pega.setViaPropRef(".pyUsedInApplicationExplorer", pRef_108, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"24.1", "Set .pyUsedInApplicationExplorer", source_35, target_61);

// processScalarParameters
ParameterPage pz_param_4 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"24.2", "Apply Data Transform pzSetDefaultsInFilterGadget", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_5 = null;
if (myStepPage != null) {
	pz_modelClass_5 = myStepPage.getClassName();
}
if ((pz_modelClass_5 == null) || (pz_modelClass_5.length() == 0)) { 
	pz_modelClass_5 = "PegaGadget-Filter";
}
StringMap pz_modelKey_5 = new HashStringMap(3);
pz_modelKey_5.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_5.putString("pyModelName", "pzSetDefaultsInFilterGadget");
pz_modelKey_5.putString("pyClassName", pz_modelClass_5);
tools.applyModel(myStepPage, pz_modelKey_5, pz_param_4);
actionEpilog(pz_CurrentTraceInfo,"24.2", "Apply Data Transform pzSetDefaultsInFilterGadget", null, null);
return CODE_CONTINUE;
}/** Metadata for the rule */
private static final Map oMetaData;

// initialize metadata for the rule
static {
oMetaData = new HashMap(1);
oMetaData.put(".pyCallSuperClassModel", "true");
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
	"Rule-Obj-Model:PZPREPROCESSING"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPREPROCESSING","Rule-Obj-Model","PEGAGADGET-FILTER",false,"","Pega-Gadgets","08-04-01","RULE-OBJ-MODEL PEGAGADGET-FILTER PZPREPROCESSING #20191113T131829.061 GMT","!PZPREPROCESSING",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1249698409)
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
//	RULE-OBJ-MODEL PEGAGADGET-FILTER PZPREPROCESSING #20191113T131829.061 GMT:20191113T131829.061 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "cdaee2b7df0949b88c18f669b4a9c746";
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

public static final String[] pRef_40 = new String[] { "", "", "pyFilterName", "" };
public static final String[] pRef_94 = new String[] { "", "", "pyCallPostDataTransform", "" };
public static final String[] pRef_98 = new String[] { "", "", "pyActiveClassFiltersString", "" };
public static final String[] pRef_103 = new String[] { "", "", "pySearchFilter", "" };
public static final String[] pRef_108 = new String[] { "", "", "pyUsedInApplicationExplorer", "" };
public static final String[] pRef_43 = new String[] { "", "", "pyFilterProductName", "" };
public static final String[] pRef_13 = new String[] { "", "", "pxResults", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyApplicationFilterChoicesCopy", "" };
public static final String[] pRef_49 = new String[] { "", "", "pyFilterVersion", "" };
public static final String[] pRef_53 = new String[] { "", "", "pxListSubscript", "" };
public static final String[] pRef_36 = new String[] { "", "", "pyFilterInsName", "" };
public static final String[] pRef_101 = new String[] { "", "", "pyActiveClassFilters", "1", "pyFilterName", "" };
public static final String[] pRef_106 = new String[] { "", "", "pyActiveApplicationFiltersString", "" };
public static final String[] pRef_46 = new String[] { "", "", "pyFilterType", "" };
public static final String[] pRef_93 = new String[] { "", "", "pyCallPreDataTransform", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyEnteringSearchTerm", "" };
public static final String[] pRef_57 = new String[] { "", "", "pyFilterActive", "" };
private static final ScalarValueQuery scalarValueQuery_39 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_25 = FUAUtil.createQueryBuilder().pageList("pxResults").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().scalarProperty("pxInsId").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_52 = FUAUtil.createQueryBuilder().scalarProperty("pxListSubscript").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_89 = FUAUtil.createQueryBuilder().scalarProperty("pyFilterProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_95 = FUAUtil.createQueryBuilder().scalarProperty("pyParamEnableApplicationFilter").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_23 = FUAUtil.createQueryBuilder().pageList("pxResults").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyProductVersion").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL PEGAGADGET-FILTER PZPREPROCESSING #20191113T131829.061 GMT", "PegaGadget-Filter pzPreProcessing", "Pega-Gadgets", "08-04-01", "20191113T131829.061 GMT");
}
