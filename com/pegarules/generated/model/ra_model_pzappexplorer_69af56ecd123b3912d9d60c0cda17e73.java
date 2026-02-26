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
public class ra_model_pzappexplorer_69af56ecd123b3912d9d60c0cda17e73 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzAppExplorer.Embed_ExplorerNode_Class.Model");
	public ra_model_pzappexplorer_69af56ecd123b3912d9d60c0cda17e73(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL EMBED-EXPLORERNODE-CLASS PZAPPEXPLORER #20180713T135514.393 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"Primary"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = tools.getPrimaryPage();
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary", ctxt_page_1);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "Update Page", null, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "Update Page", null, target_context_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_1 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_1 = pz_1;
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_2 = pega.findPageWithException("pyAppRulePage", "Code-Pega-List").getIfPresent("pxResults");
foreach_prop_1 = pz_2;
actionProlog(pz_CurrentTraceInfo,"3", "Append and Map to", pz_2, targetProperty_1);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_3 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '"pyAppRulePage.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_3;
pop_ctxt_page_3 = pega.pushScopedStepContext("SOURCE", "pyAppRulePage.pxResults(<CURRENT>)", ctxt_page_target_1);
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_2.getString("pxObjClass"))) {
	ctxt_page_2.putString("pxObjClass", "Embed-ExplorerNode-");
}
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_2);
if (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
currentLoopOffset++;
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"3", "Append and Map to", pz_2, targetProperty_1);
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_3 = tools.getPrimaryPage().getProperty("pxResults");
targetProperty_2 = pz_3;
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_4 = pega.findPageWithException("pyAppClassPage", "Code-Pega-List").getIfPresent("pxResults");
foreach_prop_2 = pz_4;
actionProlog(pz_CurrentTraceInfo,"4", "Append and Map to", pz_4, targetProperty_2);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_5 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '"pyAppClassPage.pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_5;
pop_ctxt_page_5 = pega.pushScopedStepContext("SOURCE", "pyAppClassPage.pxResults(<CURRENT>)", ctxt_page_target_2);
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_4.getString("pxObjClass"))) {
	ctxt_page_4.putString("pxObjClass", "Embed-ExplorerNode-");
}
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_4);
if (forEach_2(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
currentLoopOffset++;
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"4", "Append and Map to", pz_4, targetProperty_2);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyClassName", source_1, target_1);
{
    String pzSourceVar5 = "";
    pzSourceVar5 = tools.getParamValue("WorkPool");
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("Embed-ExplorerNode-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_6, myStepPage, pzSourceVar5, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyClassName", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyExpanded", source_2, target_2);
{
    boolean pzSourceVar8 = false;
    pzSourceVar8 = true;
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("Embed-ExplorerNode-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pyExpanded", pRef_9, myStepPage, pzSourceVar8, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyExpanded", source_2, target_2);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pxUpdateDateTime", source_3, target_3);
{
    BigDecimal pzSourceVar11 = null;
    pzSourceVar11 = com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, PRDateFormat.formatIDT(System.currentTimeMillis()));
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("Embed-ExplorerNode-Class", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pxUpdateDateTime", pRef_12, myStepPage, pzSourceVar11, "sMY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pxUpdateDateTime", source_3, target_3);
return CODE_CONTINUE;
}private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pxObjClass", source_4, target_4);
// Change obj class
String pz_16 = "";
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_12 = null;
try {
ctxt_frame_12 = pega.pushStackFrame("\"Embed-ExplorerNode-Category\"", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_12.getStepPage();
pz_16 = "Embed-ExplorerNode-Category";
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
} // return to previous step page

ClipboardPage tempPage_1 = tools.createPage(pz_16, "");
ClipboardProperty pz_15 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_11 = null;
try {
ctxt_frame_11 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_11.getStepPage();
pz_15 = propertyQuery_14.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
} // return to previous step page

ClipboardPage targetPage_1 = pz_15.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pxObjClass", source_4, target_4);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set .pyLabel", source_5, target_5);
{
    String pzSourceVar17 = "";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("Data-Rule-Summary", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pzSourceVar17 = scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_19, myStepPage, pzSourceVar17, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set .pyLabel", source_5, target_5);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.3", "Set .pyCategory", source_6, target_6);
{
    String pzSourceVar22 = "";
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("Data-Rule-Summary", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pzSourceVar22 = scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyCategory", pRef_23, myStepPage, pzSourceVar22, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.3", "Set .pyCategory", source_6, target_6);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.4", "Set .pyClass", source_7, target_7);
{
    String pzSourceVar25 = "";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Data-Rule-Summary", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pzSourceVar25 = tools.getParamValue("WorkPool");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pyClass", pRef_26, myStepPage, pzSourceVar25, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.4", "Set .pyClass", source_7, target_7);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.5", "Set .pxUpdateDateTime", source_8, target_8);
{
    BigDecimal pzSourceVar28 = null;
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("Data-Rule-Summary", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pzSourceVar28 = com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, PRDateFormat.formatIDT(System.currentTimeMillis()));
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pxUpdateDateTime", pRef_12, myStepPage, pzSourceVar28, "sMY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.5", "Set .pxUpdateDateTime", source_8, target_8);
// switch step page to scope TARGET
PRStackFrame ctxt_frame_29 = null;
try {
ctxt_frame_29 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_29.getStepPage();

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();
pz_param_1.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
pz_param_1.putParamValue("pyIterationType", "embedded");
pz_param_1.putParamValue("pyHowInvoked", "ForEach");
pz_param_1.putParamValue("pyIterationTarget", py_IterationTarget);

actionProlog(pz_CurrentTraceInfo,"3.6", "Apply Data Transform pxSetIcon", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "Embed-ExplorerNode-Class";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pxSetIcon");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"3.6", "Apply Data Transform pxSetIcon", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
} // return to previous step page
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pyClassName", source_9, target_9);
{
    String pzSourceVar30 = "";
    PRStackFrame ctxt_frame_31 = null;
    try {
        ctxt_frame_31 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_31.getStepPage();
        pzSourceVar30 = scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_31);
    }
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_6, myStepPage, pzSourceVar30, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pyClassName", source_9, target_9);
if (whenCondition_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_10 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.2", "When", null, target_10);
if (when_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.2", "When", null, target_10);
} else {
ClipboardPage target_11 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.3", "Otherwise", null, target_11);
if (otherwise_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.3", "Otherwise", null, target_11);
}
if (whenCondition_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_12 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.4", "When", null, target_12);
if (when_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.4", "When", null, target_12);
}
// switch step page to scope TARGET
PRStackFrame ctxt_frame_34 = null;
try {
ctxt_frame_34 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_34.getStepPage();

// processScalarParameters
ParameterPage pz_param_2 = new ParameterPage();
pz_param_2.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
pz_param_2.putParamValue("pyIterationType", "embedded");
pz_param_2.putParamValue("pyHowInvoked", "ForEach");
pz_param_2.putParamValue("pyIterationTarget", py_IterationTarget);

actionProlog(pz_CurrentTraceInfo,"4.5", "Apply Data Transform pzSetPin", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_2 = null;
if (myStepPage != null) {
	pz_modelClass_2 = myStepPage.getClassName();
}
if ((pz_modelClass_2 == null) || (pz_modelClass_2.length() == 0)) { 
	pz_modelClass_2 = "Embed-ExplorerNode-Class";
}
StringMap pz_modelKey_2 = new HashStringMap(3);
pz_modelKey_2.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_2.putString("pyModelName", "pzSetPin");
pz_modelKey_2.putString("pyClassName", pz_modelClass_2);
tools.applyModel(myStepPage, pz_modelKey_2, pz_param_2);
actionEpilog(pz_CurrentTraceInfo,"4.5", "Apply Data Transform pzSetPin", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
} // return to previous step page
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.6", "Set param.isOptionLabelSelected", source_10, target_13);
{
    String pzSourceVar33 = "";
    PRStackFrame ctxt_frame_36 = null;
    try {
        ctxt_frame_36 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_36.getStepPage();
        pzSourceVar33 = scalarValueQuery_34.resolveToString(tools, pega.findPageWithException("D_pxGetPreference", "Data-Preference-Operator"), ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_36);
    }
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        tools.putParamValue("isOptionLabelSelected", PropertyInfo.TYPE_TEXT, pzSourceVar33);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.6", "Set param.isOptionLabelSelected", source_10, target_13);
if (whenCondition_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_14 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.7", "When", null, target_14);
if (when_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.7", "When", null, target_14);
} else {
ClipboardPage target_15 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.8", "Otherwise", null, target_15);
if (otherwise_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.8", "Otherwise", null, target_15);
}
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.9", "Set .pxObjClass", source_11, target_16);
// Change obj class
String pz_37 = "";
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_40 = null;
try {
ctxt_frame_40 = pega.pushStackFrame("\"Embed-ExplorerNode-Class\"", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_40.getStepPage();
pz_37 = "Embed-ExplorerNode-Class";
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_40);
} // return to previous step page

ClipboardPage tempPage_2 = tools.createPage(pz_37, "");
ClipboardProperty pz_36 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_39 = null;
try {
ctxt_frame_39 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_39.getStepPage();
pz_36 = propertyQuery_14.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
} // return to previous step page

ClipboardPage targetPage_2 = pz_36.getParentPage();
targetPage_2.putAll(tempPage_2, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_2, false);
actionEpilog(pz_CurrentTraceInfo,"4.9", "Set .pxObjClass", source_11, target_16);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.10", "Set .pxUpdateDateTime", source_12, target_17);
{
    BigDecimal pzSourceVar38 = null;
    PRStackFrame ctxt_frame_42 = null;
    try {
        ctxt_frame_42 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_42.getStepPage();
        pzSourceVar38 = com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, PRDateFormat.formatIDT(System.currentTimeMillis()));
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_42);
    }
    PRStackFrame ctxt_frame_41 = null;
    try {
        ctxt_frame_41 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_41.getStepPage();
        pega.setViaPropRef(".pxUpdateDateTime", pRef_12, myStepPage, pzSourceVar38, "sMY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_41);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.10", "Set .pxUpdateDateTime", source_12, target_17);
return CODE_CONTINUE;
}private boolean whenCondition_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_45 = null;
try {
ctxt_frame_45 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_45.getStepPage();
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.Inheritance==\"Pattern\" || param.Inheritance==\"Showall\"");
try {
boolean pz_40 = ((tools.getParamValue("Inheritance").equals("Pattern")) || (tools.getParamValue("Inheritance").equals("Showall")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.Inheritance==\"Pattern\" || param.Inheritance==\"Showall\"",pz_40);
return pz_40;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.Inheritance==\"Pattern\" || param.Inheritance==\"Showall\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_45);
} // return to previous step page
}private int when_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.2.1", "Set param.className", source_13, target_18);
{
    String pzSourceVar41 = "";
    PRStackFrame ctxt_frame_47 = null;
    try {
        ctxt_frame_47 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_47.getStepPage();
        pzSourceVar41 = scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_47);
    }
    PRStackFrame ctxt_frame_46 = null;
    try {
        ctxt_frame_46 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_46.getStepPage();
        tools.putParamValue("className", PropertyInfo.TYPE_TEXT, pzSourceVar41);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_46);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.2.1", "Set param.className", source_13, target_18);
if (whenCondition_4(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_19 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.2.2", "When", null, target_19);
if (when_4(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.2.2", "When", null, target_19);
}
return CODE_CONTINUE;
}private boolean whenCondition_4(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_50 = null;
try {
ctxt_frame_50 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_50.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.PatternName, @(Pega-RULES:String).substring(.pyClassName,  0, @(Pega-RULES:String).length(param.PatternName)))");
try {
boolean pz_43 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { tools.getParamValue("PatternName"), pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", "Pega-RULES", "String", new Object[] { scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), 0, (pega.<Integer>resolveMethodCall("length--(String)", "length", "Pega-RULES", "String", new Object[] { tools.getParamValue("PatternName") })).intValue() }) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.PatternName, @(Pega-RULES:String).substring(.pyClassName,  0, @(Pega-RULES:String).length(param.PatternName)))",pz_43);
return pz_43;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(param.PatternName, @(Pega-RULES:String).substring(.pyClassName,  0, @(Pega-RULES:String).length(param.PatternName))) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_50);
} // return to previous step page
}private int when_4(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.2.2.1", "Set param.className", source_14, target_20);
{
    String pzSourceVar44 = "";
    PRStackFrame ctxt_frame_52 = null;
    try {
        ctxt_frame_52 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_52.getStepPage();
        pzSourceVar44 = pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", "Pega-RULES", "String", new Object[] { scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), (pega.<Integer>resolveMethodCall("length--(String)", "length", "Pega-RULES", "String", new Object[] { tools.getParamValue("PatternName") })).intValue(), (pega.<Integer>resolveMethodCall("length--(String)", "length", "Pega-RULES", "String", new Object[] { scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).intValue() });
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_52);
    }
    PRStackFrame ctxt_frame_51 = null;
    try {
        ctxt_frame_51 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_51.getStepPage();
        tools.putParamValue("className", PropertyInfo.TYPE_TEXT, pzSourceVar44);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_51);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.2.2.1", "Set param.className", source_14, target_20);
return CODE_CONTINUE;
}private int otherwise_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.3.1", "Set param.className", source_15, target_21);
{
    String pzSourceVar46 = "";
    PRStackFrame ctxt_frame_56 = null;
    try {
        ctxt_frame_56 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_56.getStepPage();
        pzSourceVar46 = scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_56);
    }
    PRStackFrame ctxt_frame_55 = null;
    try {
        ctxt_frame_55 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_55.getStepPage();
        tools.putParamValue("className", PropertyInfo.TYPE_TEXT, pzSourceVar46);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_55);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.3.1", "Set param.className", source_15, target_21);
return CODE_CONTINUE;
}private boolean whenCondition_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_59 = null;
try {
ctxt_frame_59 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_59.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.className==\"\"");
try {
boolean pz_48 = (tools.getParamValue("className").equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.className==\"\"",pz_48);
return pz_48;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.className==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_59);
} // return to previous step page
}private int when_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.4.1", "Set param.className", source_16, target_22);
{
    String pzSourceVar49 = "";
    PRStackFrame ctxt_frame_61 = null;
    try {
        ctxt_frame_61 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_61.getStepPage();
        pzSourceVar49 = scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_61);
    }
    PRStackFrame ctxt_frame_60 = null;
    try {
        ctxt_frame_60 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_60.getStepPage();
        tools.putParamValue("className", PropertyInfo.TYPE_TEXT, pzSourceVar49);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_60);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.4.1", "Set param.className", source_16, target_22);
return CODE_CONTINUE;
}private boolean whenCondition_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_64 = null;
try {
ctxt_frame_64 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_64.getStepPage();
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.isOptionLabelSelected==\"true\"");
try {
boolean pz_51 = (tools.getParamValue("isOptionLabelSelected").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.isOptionLabelSelected==\"true\"",pz_51);
return pz_51;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.isOptionLabelSelected==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_64);
} // return to previous step page
}private int when_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.7.1", "Set .pyLabel", source_17, target_23);
{
    String pzSourceVar52 = "";
    PRStackFrame ctxt_frame_66 = null;
    try {
        ctxt_frame_66 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_66.getStepPage();
        pzSourceVar52 = scalarValueQuery_53.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_66);
    }
    PRStackFrame ctxt_frame_65 = null;
    try {
        ctxt_frame_65 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_65.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_19, myStepPage, pzSourceVar52, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_65);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.7.1", "Set .pyLabel", source_17, target_23);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.7.2", "Set .pyRefreshLabel", source_18, target_24);
{
    String pzSourceVar55 = "";
    PRStackFrame ctxt_frame_70 = null;
    try {
        ctxt_frame_70 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_70.getStepPage();
        pzSourceVar55 = ("Refresh " + scalarValueQuery_53.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_70);
    }
    PRStackFrame ctxt_frame_69 = null;
    try {
        ctxt_frame_69 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_69.getStepPage();
        pega.setViaPropRef(".pyRefreshLabel", pRef_56, myStepPage, pzSourceVar55, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_69);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.7.2", "Set .pyRefreshLabel", source_18, target_24);
return CODE_CONTINUE;
}private int otherwise_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.8.1", "Set .pyLabel", source_19, target_25);
{
    String pzSourceVar58 = "";
    PRStackFrame ctxt_frame_74 = null;
    try {
        ctxt_frame_74 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_74.getStepPage();
        pzSourceVar58 = tools.getParamValue("className");
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_74);
    }
    PRStackFrame ctxt_frame_73 = null;
    try {
        ctxt_frame_73 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_73.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_19, myStepPage, pzSourceVar58, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_73);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.8.1", "Set .pyLabel", source_19, target_25);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.8.2", "Set .pyRefreshLabel", source_20, target_26);
{
    String pzSourceVar60 = "";
    PRStackFrame ctxt_frame_78 = null;
    try {
        ctxt_frame_78 = pega.pushStackFrame("", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_78.getStepPage();
        pzSourceVar60 = ("Refresh " + tools.getParamValue("className"));
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_78);
    }
    PRStackFrame ctxt_frame_77 = null;
    try {
        ctxt_frame_77 = pega.pushStackFrame("Embed-ExplorerNode-", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_77.getStepPage();
        pega.setViaPropRef(".pyRefreshLabel", pRef_56, myStepPage, pzSourceVar60, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_77);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.8.2", "Set .pyRefreshLabel", source_20, target_26);
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
	"Rule-Obj-Model:PZAPPEXPLORER"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZAPPEXPLORER","Rule-Obj-Model","EMBED-EXPLORERNODE-CLASS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-MODEL EMBED-EXPLORERNODE-CLASS PZAPPEXPLORER #20180713T135514.393 GMT","!PZAPPEXPLORER",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-257184737)
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
//	RULE-OBJ-MODEL EMBED-EXPLORERNODE-CLASS PZAPPEXPLORER #20180713T135514.393 GMT:20180713T135514.393 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "47fa5fb33776f4a69ed131735411bf45";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-ExplorerNode-Class";
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

public static final String[] pRef_12 = new String[] { "", "", "pxUpdateDateTime", "" };
public static final String[] pRef_23 = new String[] { "", "", "pyCategory", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyExpanded", "" };
public static final String[] pRef_21 = new String[] { "", "", "pxPages", "ROC", "pyCategory", "" };
public static final String[] pRef_56 = new String[] { "", "", "pyRefreshLabel", "" };
public static final String[] pRef_26 = new String[] { "", "", "pyClass", "" };
private static final ScalarValueQuery scalarValueQuery_53 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().scalarProperty("pzAppExplorerDisplayClassLabel").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().pageGroup("pxPages", "ROC").scalarProperty("pyCategory").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL EMBED-EXPLORERNODE-CLASS PZAPPEXPLORER #20180713T135514.393 GMT", "Embed-ExplorerNode-Class pzAppExplorer", "Pega-Desktop", "08-01-01", "20180713T135514.393 GMT");
}
