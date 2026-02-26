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
public class ra_model_pzpopulateexpexplorerdata_f785aab4d2a28e6e49087c26376ecfdf extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzPopulateExpExplorerData.Code_Pega_List.Model");
	public ra_model_pzpopulateexpexplorerdata_f785aab4d2a28e6e49087c26376ecfdf(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PZPOPULATEEXPEXPLORERDATA #20200616T113836.624 GMT	Pega-SystemArchitect:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_1 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_1 = pz_1;
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_2 = pega.findPage(tools.getParamValue("DataSource"), "Code-Pega-List").getIfPresent("pxResults");
foreach_prop_1 = pz_2;
actionProlog(pz_CurrentTraceInfo,"1", "Append and Map to", pz_2, targetProperty_1);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_2 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '"DataSource.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_2;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "DataSource.pxResults(<CURRENT>)", ctxt_page_target_1);
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_1.getString("pxObjClass"))) {
	ctxt_page_1.putString("pxObjClass", "Rule-Obj-Class");
}
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_1);
if (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
currentLoopOffset++;
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"1", "Append and Map to", pz_2, targetProperty_1);
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2", "Set .pxResultCount", source_1, target_1);
{
    pega.setViaPropRef(".pxResultCount", pRef_3, myStepPage, (pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { tools.getPrimaryPage().getProperty("pxResults") })).intValue(), "sNY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2", "Set .pxResultCount", source_1, target_1);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set param.draftmode", source_2, target_2);
{
    boolean pzSourceVar4 = false;
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pzSourceVar4 = false;
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        tools.putParamValue("draftmode", PropertyInfo.TYPE_TEXT, pzSourceVar4);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1", "Set param.draftmode", source_2, target_2);
if (whenCondition_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2", "When", null, target_3);
if (when_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2", "When", null, target_3);
} else {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.3", "Otherwise", null, target_4);
if (otherwise_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.3", "Otherwise", null, target_4);
}
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.4", "Set .pyDataTypeName", source_3, target_5);
{
    String pzSourceVar6 = "";
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        pzSourceVar6 = scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pyDataTypeName", pRef_8, myStepPage, pzSourceVar6, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.4", "Set .pyDataTypeName", source_3, target_5);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.5", "Set .pzInsKey", source_4, target_6);
{
    String pzSourceVar11 = "";
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pzSourceVar11 = scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        pega.setViaPropRef(".pzInsKey", pRef_13, myStepPage, pzSourceVar11, "sIY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.5", "Set .pzInsKey", source_4, target_6);
if (whenCondition_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_7 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.6", "When", null, target_7);
if (when_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.6", "When", null, target_7);
}
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.7", "Set D_pzManageDataPageSource.pySelected", source_5, target_8);
{
    boolean pzSourceVar15 = false;
    PRStackFrame ctxt_frame_16 = null;
    try {
        ctxt_frame_16 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_16.getStepPage();
        pzSourceVar15 = true;
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_16);
    }
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_16, pega.findPageWithException("D_pzManageDataPageSource", "Embed-DeclarePageSource"), pzSourceVar15, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.7", "Set D_pzManageDataPageSource.pySelected", source_5, target_8);
return CODE_CONTINUE;
}private boolean whenCondition_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_19 = null;
try {
ctxt_frame_19 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_19.getStepPage();
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.GetDataObjects==true");
try {
boolean pz_18 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "GetDataObjects") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.GetDataObjects==true",pz_18);
return pz_18;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.GetDataObjects==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
} // return to previous step page
}private int when_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.1", "Set .pyLabel", source_6, target_9);
{
    String pzSourceVar19 = "";
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pzSourceVar19 = scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
    PRStackFrame ctxt_frame_20 = null;
    try {
        ctxt_frame_20 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_20.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_21, myStepPage, pzSourceVar19, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.1", "Set .pyLabel", source_6, target_9);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.2", "Set .pyPurpose", source_7, target_10);
{
    String pzSourceVar23 = "";
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pzSourceVar23 = scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
    PRStackFrame ctxt_frame_24 = null;
    try {
        ctxt_frame_24 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_24.getStepPage();
        pega.setViaPropRef(".pyPurpose", pRef_25, myStepPage, pzSourceVar23, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_24);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.2", "Set .pyPurpose", source_7, target_10);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.3", "Set .pyRuleSetName", source_8, target_11);
{
    String pzSourceVar27 = "";
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pzSourceVar27 = scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
    PRStackFrame ctxt_frame_28 = null;
    try {
        ctxt_frame_28 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_28.getStepPage();
        pega.setViaPropRef(".pyRuleSetName", pRef_29, myStepPage, pzSourceVar27, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.3", "Set .pyRuleSetName", source_8, target_11);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.4", "Set .pyRuleSetVersion", source_9, target_12);
{
    String pzSourceVar31 = "";
    PRStackFrame ctxt_frame_33 = null;
    try {
        ctxt_frame_33 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_33.getStepPage();
        pzSourceVar31 = scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
    }
    PRStackFrame ctxt_frame_32 = null;
    try {
        ctxt_frame_32 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_32.getStepPage();
        pega.setViaPropRef(".pyRuleSetVersion", pRef_33, myStepPage, pzSourceVar31, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_32);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.4", "Set .pyRuleSetVersion", source_9, target_12);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.5", "Set .pxPages(ROC).pyRuleSet", source_10, target_13);
{
    String pzSourceVar35 = "";
    PRStackFrame ctxt_frame_37 = null;
    try {
        ctxt_frame_37 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_37.getStepPage();
        pzSourceVar35 = scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
    }
    PRStackFrame ctxt_frame_36 = null;
    try {
        ctxt_frame_36 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_36.getStepPage();
        pega.setViaPropRef(".pxPages(ROC).pyRuleSet", pRef_37, myStepPage, pzSourceVar35, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_36);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.5", "Set .pxPages(ROC).pyRuleSet", source_10, target_13);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.6", "Set .pxPages(ROC).pyInitialVersion", source_11, target_14);
{
    String pzSourceVar39 = "";
    PRStackFrame ctxt_frame_41 = null;
    try {
        ctxt_frame_41 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_41.getStepPage();
        pzSourceVar39 = scalarValueQuery_40.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_41);
    }
    PRStackFrame ctxt_frame_40 = null;
    try {
        ctxt_frame_40 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_40.getStepPage();
        pega.setViaPropRef(".pxPages(ROC).pyInitialVersion", pRef_41, myStepPage, pzSourceVar39, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_40);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.6", "Set .pxPages(ROC).pyInitialVersion", source_11, target_14);
if (whenCondition_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_15 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2.7", "When", null, target_15);
if (when_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2.7", "When", null, target_15);
} else {
ClipboardPage target_16 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2.8", "Otherwise", null, target_16);
if (otherwise_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2.8", "Otherwise", null, target_16);
}
return CODE_CONTINUE;
}private boolean whenCondition_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_44 = null;
try {
ctxt_frame_44 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_44.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "DataSource.pxResults(&lt;CURRENT&gt;).pyClassName != \"\"");
try {
boolean pz_44 = (!(scalarValueQuery_43.resolveToString(tools, pega.findPage(tools.getParamValue("DataSource"), "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "DataSource.pxResults(&lt;CURRENT&gt;).pyClassName != \"\"",pz_44);
return pz_44;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("DataSource.pxResults(&lt;CURRENT&gt;).pyClassName != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_44);
} // return to previous step page
}private int when_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.7.1", "Set .pyClassName", source_12, target_17);
{
    String pzSourceVar45 = "";
    PRStackFrame ctxt_frame_46 = null;
    try {
        ctxt_frame_46 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_46.getStepPage();
        pzSourceVar45 = scalarValueQuery_46.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_46);
    }
    PRStackFrame ctxt_frame_45 = null;
    try {
        ctxt_frame_45 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_45.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_47, myStepPage, pzSourceVar45, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_45);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.7.1", "Set .pyClassName", source_12, target_17);
return CODE_CONTINUE;
}private int otherwise_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.8.1", "Set .pyDraftMode", source_13, target_18);
{
    boolean pzSourceVar49 = false;
    PRStackFrame ctxt_frame_50 = null;
    try {
        ctxt_frame_50 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_50.getStepPage();
        pzSourceVar49 = true;
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_50);
    }
    PRStackFrame ctxt_frame_49 = null;
    try {
        ctxt_frame_49 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_49.getStepPage();
        pega.setViaPropRef(".pyDraftMode", pRef_50, myStepPage, pzSourceVar49, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_49);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.8.1", "Set .pyDraftMode", source_13, target_18);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.8.2", "Set param.draftmode", source_14, target_19);
{
    boolean pzSourceVar52 = false;
    PRStackFrame ctxt_frame_54 = null;
    try {
        ctxt_frame_54 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_54.getStepPage();
        pzSourceVar52 = true;
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_54);
    }
    PRStackFrame ctxt_frame_53 = null;
    try {
        ctxt_frame_53 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_53.getStepPage();
        tools.putParamValue("draftmode", PropertyInfo.TYPE_TEXT, pzSourceVar52);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_53);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.8.2", "Set param.draftmode", source_14, target_19);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.8.3", "Set .pyDraftObjectLabel", source_15, target_20);
{
    String pzSourceVar54 = "";
    PRStackFrame ctxt_frame_58 = null;
    try {
        ctxt_frame_58 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_58.getStepPage();
        pzSourceVar54 = (((scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + " (") + pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "Draft", "pyCaption", tools })) + ")");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_58);
    }
    PRStackFrame ctxt_frame_57 = null;
    try {
        ctxt_frame_57 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_57.getStepPage();
        pega.setViaPropRef(".pyDraftObjectLabel", pRef_55, myStepPage, pzSourceVar54, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_57);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.8.3", "Set .pyDraftObjectLabel", source_15, target_20);
return CODE_CONTINUE;
}private int otherwise_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.1", "Set .pyClassName", source_16, target_21);
{
    String pzSourceVar57 = "";
    PRStackFrame ctxt_frame_62 = null;
    try {
        ctxt_frame_62 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_62.getStepPage();
        pzSourceVar57 = scalarValueQuery_58.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_62);
    }
    PRStackFrame ctxt_frame_61 = null;
    try {
        ctxt_frame_61 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_61.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_47, myStepPage, pzSourceVar57, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_61);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.1", "Set .pyClassName", source_16, target_21);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.2", "Set .pyRuleSetName", source_17, target_22);
{
    String pzSourceVar60 = "";
    PRStackFrame ctxt_frame_66 = null;
    try {
        ctxt_frame_66 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_66.getStepPage();
        pzSourceVar60 = scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_66);
    }
    PRStackFrame ctxt_frame_65 = null;
    try {
        ctxt_frame_65 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_65.getStepPage();
        pega.setViaPropRef(".pyRuleSetName", pRef_29, myStepPage, pzSourceVar60, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_65);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.2", "Set .pyRuleSetName", source_17, target_22);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.3", "Set .pyRuleSetVersion", source_18, target_23);
{
    String pzSourceVar62 = "";
    PRStackFrame ctxt_frame_70 = null;
    try {
        ctxt_frame_70 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_70.getStepPage();
        pzSourceVar62 = scalarValueQuery_40.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_70);
    }
    PRStackFrame ctxt_frame_69 = null;
    try {
        ctxt_frame_69 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_69.getStepPage();
        pega.setViaPropRef(".pyRuleSetVersion", pRef_33, myStepPage, pzSourceVar62, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_69);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.3", "Set .pyRuleSetVersion", source_18, target_23);
return CODE_CONTINUE;
}private boolean whenCondition_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_73 = null;
try {
ctxt_frame_73 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_73.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.draftmode != true");
try {
boolean pz_64 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "draftmode") != true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.draftmode != true",pz_64);
return pz_64;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.draftmode != true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_73);
} // return to previous step page
}private int when_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.1", "Set param.dummy", source_19, target_24);
{
    String pzSourceVar65 = "";
    PRStackFrame ctxt_frame_75 = null;
    try {
        ctxt_frame_75 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_75.getStepPage();
        pzSourceVar65 = String.valueOf((pega.<Boolean>resolveMethodCall("pzCopyUniqueDataViews--(Clipboar23bf291e9cdb143ab4b4cac9ae77b800", "pzCopyUniqueDataViews", "Pega-IntegrationEngine", "Default", new Object[] { pega.getViaPropRef(".pxResults(" + forEachCounter + ").pyDataSourcesList", new String[] { "", "", "pxResults", String.valueOf(forEachCounter), "pyDataSourcesList", "" }, tools.getPrimaryPage(), false, false), pega.getViaPropRef(".pxResults(" + forEachCounter + ").pyIntegrationSystemsOfClass", new String[] { "", "", "pxResults", String.valueOf(forEachCounter), "pyIntegrationSystemsOfClass", "" }, tools.getPrimaryPage(), false, false), "pyIntegrationSystemId" })).booleanValue());
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_75);
    }
    PRStackFrame ctxt_frame_74 = null;
    try {
        ctxt_frame_74 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_74.getStepPage();
        tools.putParamValue("dummy", PropertyInfo.TYPE_TEXT, pzSourceVar65);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_74);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.6.1", "Set param.dummy", source_19, target_24);
if (whenCondition_4(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_25 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.6.2", "When", null, target_25);
if (when_4(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.6.2", "When", null, target_25);
}
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_67 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_78 = null;
try {
ctxt_frame_78 = pega.pushStackFrame(".pyIntegrationSystemsOfClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_78.getStepPage();
pz_67 = myStepPage.getIfPresent("pyIntegrationSystemsOfClass");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_78);
} // return to previous step page

foreach_prop_2 = pz_67;
actionProlog(pz_CurrentTraceInfo,"1.6.3", "For Each Page In", null, pz_67);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
try {
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_3 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_3 = false;
boolean pop_ctxt_page_4 = false;
try {
/* push '".pyIntegrationSystemsOfClass(<CURRENT>)"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_79 = null;
try {
ctxt_frame_79 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_79.getStepPage();
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_3;
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pyIntegrationSystemsOfClass(<CURRENT>)", ctxt_page_target_2);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_79);
} // return to previous step page
/* push '".pyIntegrationSystemsOfClass(<CURRENT>)"' to scope SOURCE */
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_80 = null;
try {
ctxt_frame_80 = pega.pushStackFrame("\"switching to update SOURCE\"", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_80.getStepPage();
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_3;
pop_ctxt_page_4 = pega.pushScopedStepContext("SOURCE", ".pyIntegrationSystemsOfClass(<CURRENT>)", ctxt_page_source_1);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_80);
} // return to previous step page
switch (forEach_2(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_2;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_4) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
} finally {
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
}
}
actionEpilog(pz_CurrentTraceInfo,"1.6.3", "For Each Page In", null, pz_67);
return CODE_CONTINUE;
}private boolean whenCondition_4(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_81 = null;
try {
ctxt_frame_81 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_81.getStepPage();
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.AppOverview != true");
try {
boolean pz_68 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "AppOverview") != true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.AppOverview != true",pz_68);
return pz_68;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.AppOverview != true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_81);
} // return to previous step page
}private int when_4(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.2.1", "Set param.dummy", source_20, target_26);
{
    String pzSourceVar69 = "";
    PRStackFrame ctxt_frame_83 = null;
    try {
        ctxt_frame_83 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_83.getStepPage();
        pzSourceVar69 = String.valueOf((pega.<Boolean>resolveMethodCall("pzCopyUniqueDataViews--(Clipboar23bf291e9cdb143ab4b4cac9ae77b800", "pzCopyUniqueDataViews", "Pega-IntegrationEngine", "Default", new Object[] { pega.getViaPropRef(".pxResults(" + forEachCounter + ").pyDataSourcesList", new String[] { "", "", "pxResults", String.valueOf(forEachCounter), "pyDataSourcesList", "" }, tools.getPrimaryPage(), false, false), pega.getViaPropRef(".pxResults(" + forEachCounter + ").pyDataViewsList", new String[] { "", "", "pxResults", String.valueOf(forEachCounter), "pyDataViewsList", "" }, tools.getPrimaryPage(), false, false), "pyPageName" })).booleanValue());
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_83);
    }
    PRStackFrame ctxt_frame_82 = null;
    try {
        ctxt_frame_82 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_82.getStepPage();
        tools.putParamValue("dummy", PropertyInfo.TYPE_TEXT, pzSourceVar69);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_82);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.6.2.1", "Set param.dummy", source_20, target_26);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.2.2", "Set .pyHasSimulatedDataView", source_21, target_27);
{
    boolean pzSourceVar71 = false;
    PRStackFrame ctxt_frame_87 = null;
    try {
        ctxt_frame_87 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_87.getStepPage();
        pzSourceVar71 = (pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { "true", ".pxPages(DS).pyIsSimulated", pega.getViaPropRef(".pxResults(" + forEachCounter + ").pyDataViewsList", new String[] { "", "", "pxResults", String.valueOf(forEachCounter), "pyDataViewsList", "" }, tools.getPrimaryPage(), false, false) })).booleanValue();
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_87);
    }
    PRStackFrame ctxt_frame_86 = null;
    try {
        ctxt_frame_86 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_86.getStepPage();
        pega.setViaPropRef(".pyHasSimulatedDataView", pRef_72, myStepPage, pzSourceVar71, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_86);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.6.2.2", "Set .pyHasSimulatedDataView", source_21, target_27);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.2.3", "Set .pyLinkMoreReferences", source_22, target_28);
{
    String pzSourceVar74 = "";
    PRStackFrame ctxt_frame_91 = null;
    try {
        ctxt_frame_91 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_91.getStepPage();
        pzSourceVar74 = (("+" + Integer.toString(((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, null, new Object[] { pega.getViaPropRef(".pxResults(" + forEachCounter + ").pyReferenceList", new String[] { "", "", "pxResults", String.valueOf(forEachCounter), "pyReferenceList", "" }, tools.getPrimaryPage(), false, false) })).intValue() - 2))) + " more");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_91);
    }
    PRStackFrame ctxt_frame_90 = null;
    try {
        ctxt_frame_90 = pega.pushStackFrame("Rule-Obj-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_90.getStepPage();
        pega.setViaPropRef(".pyLinkMoreReferences", pRef_75, myStepPage, pzSourceVar74, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_90);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.6.2.3", "Set .pyLinkMoreReferences", source_22, target_28);
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_5(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_29 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.6.3.2", "When", null, target_29);
switch (when_5(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.6.3.2", "When", null, target_29);
}
return CODE_CONTINUE;
}private boolean whenCondition_5(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_94 = null;
try {
ctxt_frame_94 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_94.getStepPage();
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(.pxPages(DS).pyIsSimulated|| .pxPages(DS).pyDeclarePagesDataSource== \"LoadActivity\" || .pxPages(DS).pyDeclarePagesDataSource== \"DataTransform\" )&amp;&amp; .pyIntegrationSystemId !=\"\"  &amp;&amp; .pyIntegrationSystem.pySystemId==\"\"");
try {
boolean pz_84 = ((((scalarValueQuery_77.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) || (scalarValueQuery_78.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("LoadActivity"))) || (scalarValueQuery_78.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("DataTransform"))) && (!(scalarValueQuery_79.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")))) && (scalarValueQuery_80.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(.pxPages(DS).pyIsSimulated|| .pxPages(DS).pyDeclarePagesDataSource== \"LoadActivity\" || .pxPages(DS).pyDeclarePagesDataSource== \"DataTransform\" )&amp;&amp; .pyIntegrationSystemId !=\"\"  &amp;&amp; .pyIntegrationSystem.pySystemId==\"\"",pz_84);
return pz_84;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(.pxPages(DS).pyIsSimulated|| .pxPages(DS).pyDeclarePagesDataSource== \"LoadActivity\" || .pxPages(DS).pyDeclarePagesDataSource== \"DataTransform\" )&amp;&amp; .pyIntegrationSystemId !=\"\"  &amp;&amp; .pyIntegrationSystem.pySystemId==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_94);
} // return to previous step page
}private int when_5(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.3.2.1", "Set .pyIntegrationSystem.pySystemId", source_23, target_30);
{
    String pzSourceVar85 = "";
    PRStackFrame ctxt_frame_96 = null;
    try {
        ctxt_frame_96 = pega.pushStackFrame("Rule-Declare-Pages", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_96.getStepPage();
        pzSourceVar85 = scalarValueQuery_79.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_96);
    }
    PRStackFrame ctxt_frame_95 = null;
    try {
        ctxt_frame_95 = pega.pushStackFrame("Rule-Declare-Pages", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_95.getStepPage();
        pega.setViaPropRef(".pyIntegrationSystem.pySystemId", pRef_83, myStepPage, pzSourceVar85, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_95);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.6.3.2.1", "Set .pyIntegrationSystem.pySystemId", source_23, target_30);
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.3.2.2", "Set .pyIntegrationSystem.pyLabel", source_24, target_31);
{
    String pzSourceVar87 = "";
    PRStackFrame ctxt_frame_100 = null;
    try {
        ctxt_frame_100 = pega.pushStackFrame("Rule-Declare-Pages", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_100.getStepPage();
        pzSourceVar87 = scalarValueQuery_79.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_100);
    }
    PRStackFrame ctxt_frame_99 = null;
    try {
        ctxt_frame_99 = pega.pushStackFrame("Rule-Declare-Pages", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_99.getStepPage();
        pega.setViaPropRef(".pyIntegrationSystem.pyLabel", pRef_88, myStepPage, pzSourceVar87, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_99);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.6.3.2.2", "Set .pyIntegrationSystem.pyLabel", source_24, target_31);
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.3.2.3", "Set .pyIntegrationSystem.pySystemIcon", source_25, target_32);
{
    String pzSourceVar90 = "";
    PRStackFrame ctxt_frame_104 = null;
    try {
        ctxt_frame_104 = pega.pushStackFrame("Rule-Declare-Pages", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_104.getStepPage();
        pzSourceVar90 = "integrationsystem/pzGeneric2.svg";
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_104);
    }
    PRStackFrame ctxt_frame_103 = null;
    try {
        ctxt_frame_103 = pega.pushStackFrame("Rule-Declare-Pages", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_103.getStepPage();
        pega.setViaPropRef(".pyIntegrationSystem.pySystemIcon", pRef_91, myStepPage, pzSourceVar90, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_103);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.6.3.2.3", "Set .pyIntegrationSystem.pySystemIcon", source_25, target_32);
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
	"Rule-Obj-Model:PZPOPULATEEXPEXPLORERDATA"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPOPULATEEXPEXPLORERDATA","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-SystemArchitect","08-05-01","RULE-OBJ-MODEL CODE-PEGA-LIST PZPOPULATEEXPEXPLORERDATA #20200616T113836.624 GMT","!PZPOPULATEEXPEXPLORERDATA",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",730979005)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PZPOPULATEEXPEXPLORERDATA #20200616T113836.624 GMT:20200616T113836.624 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "b964d78e17cbdbf865c1e42fc2376fba";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
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

public static final String[] pRef_16 = new String[] { "", "", "pySelected", "" };
public static final String[] pRef_47 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_81 = new String[] { "", "", "pxPages", "DS", "pyIsSimulated", "" };
public static final String[] pRef_37 = new String[] { "", "", "pxPages", "ROC", "pyRuleSet", "" };
public static final String[] pRef_82 = new String[] { "", "", "pxPages", "DS", "pyDeclarePagesDataSource", "" };
public static final String[] pRef_72 = new String[] { "", "", "pyHasSimulatedDataView", "" };
public static final String[] pRef_29 = new String[] { "", "", "pyRuleSetName", "" };
public static final String[] pRef_88 = new String[] { "", "", "pyIntegrationSystem", "", "pyLabel", "" };
public static final String[] pRef_25 = new String[] { "", "", "pyPurpose", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyDataTypeName", "" };
public static final String[] pRef_13 = new String[] { "", "", "pzInsKey", "" };
public static final String[] pRef_33 = new String[] { "", "", "pyRuleSetVersion", "" };
public static final String[] pRef_75 = new String[] { "", "", "pyLinkMoreReferences", "" };
public static final String[] pRef_91 = new String[] { "", "", "pyIntegrationSystem", "", "pySystemIcon", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_83 = new String[] { "", "", "pyIntegrationSystem", "", "pySystemId", "" };
public static final String[] pRef_41 = new String[] { "", "", "pxPages", "ROC", "pyInitialVersion", "" };
public static final String[] pRef_55 = new String[] { "", "", "pyDraftObjectLabel", "" };
public static final String[] pRef_50 = new String[] { "", "", "pyDraftMode", "" };
public static final String[] pRef_3 = new String[] { "", "", "pxResultCount", "" };
public static final String[] pRef_10 = new String[] { "", "", "pxPages", "ROC", "pyLabel", "" };
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "ROC").scalarProperty("pyInitialVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_77 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "DS").scalarProperty("pyIsSimulated").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "ROC").scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_78 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "DS").scalarProperty("pyDeclarePagesDataSource").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_79 = FUAUtil.createQueryBuilder().scalarProperty("pyIntegrationSystemId").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_32 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSetVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pyPurpose").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_80 = FUAUtil.createQueryBuilder().page("pyIntegrationSystem").scalarProperty("pySystemId").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_58 = FUAUtil.createQueryBuilder().scalarProperty("pyMetadataKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_28 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleSet").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "ROC").scalarProperty("pyRuleSet").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZPOPULATEEXPEXPLORERDATA #20200616T113836.624 GMT", "Code-Pega-List pzPopulateExpExplorerData", "Pega-SystemArchitect", "08-05-01", "20200616T113836.624 GMT");
}
