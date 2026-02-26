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
public class ra_model_pyaddrecentlistitem_11bdb5a19a7f1e1fefbaf5e481c89277 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyAddRecentListItem.Work_.Model");
	public ra_model_pyaddrecentlistitem_11bdb5a19a7f1e1fefbaf5e481c89277(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL WORK- PYADDRECENTLISTITEM #20180713T133325.486 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"pyRecentListItem"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
String pz_1 = "pyRecentListItem";
ctxt_page_1 = tools.findPage(pz_1, true);
if (ctxt_page_1 == null) {
ctxt_page_1 = tools.findPage(pz_1, false);
ctxt_page_1.putString("pxObjClass", "System-User-Recents");
}
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "pyRecentListItem", ctxt_page_1);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1", "Update Page", null, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"1", "Update Page", null, target_context_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_1 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1", "When", null, target_1);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "When", null, target_1);
}
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2", "When", null, target_2);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2", "When", null, target_2);
}
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.3", "When", null, target_3);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.3", "When", null, target_3);
}
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.4", "When", null, target_4);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.4", "When", null, target_4);
}
if (whenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.5", "When", null, target_5);
if (when_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.5", "When", null, target_5);
}
if (whenCondition_6(pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.6", "When", null, target_6);
if (when_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.6", "When", null, target_6);
}
return CODE_CONTINUE;
}private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_2 = null;
try {
ctxt_frame_2 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_2.getStepPage();
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyAction == \"openworkbyhandle\" || .pyExecute.pyAction == \"createWork\" || .pyExecute.pyAction == \"openassignment\"  || .pyExecute.pyAction == \"openWizard\"");
try {
boolean pz_4 = ((((scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("openworkbyhandle")) || (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("createWork"))) || (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("openassignment"))) || (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("openWizard")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyAction == \"openworkbyhandle\" || .pyExecute.pyAction == \"createWork\" || .pyExecute.pyAction == \"openassignment\"  || .pyExecute.pyAction == \"openWizard\"",pz_4);
return pz_4;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyAction == \"openworkbyhandle\" || .pyExecute.pyAction == \"createWork\" || .pyExecute.pyAction == \"openassignment\"  || .pyExecute.pyAction == \"openWizard\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_2);
} // return to previous step page
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1", "Set .pyRecordID", source_1, target_7);
{
    String pzSourceVar5 = "";
    pzSourceVar5 = scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        pega.setViaPropRef(".pyRecordID", pRef_7, myStepPage, pzSourceVar5, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1", "Set .pyRecordID", source_1, target_7);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.2", "Set .pyRecordKey", source_2, target_8);
{
    String pzSourceVar9 = "";
    pzSourceVar9 = scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pyRecordKey", pRef_11, myStepPage, pzSourceVar9, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.2", "Set .pyRecordKey", source_2, target_8);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.3", "Set .pyContentType", source_3, target_9);
{
    String pzSourceVar13 = "";
    pzSourceVar13 = "Work";
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pyContentType", pRef_14, myStepPage, pzSourceVar13, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.3", "Set .pyContentType", source_3, target_9);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.4", "Set .pyLabel", source_4, target_10);
{
    String pzSourceVar16 = "";
    pzSourceVar16 = scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_18, myStepPage, pzSourceVar16, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.4", "Set .pyLabel", source_4, target_10);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.5", "Set .pyLabelRef", source_5, target_11);
{
    String pzSourceVar20 = "";
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        pega.setViaPropRef(".pyLabelRef", pRef_21, myStepPage, pzSourceVar20, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.5", "Set .pyLabelRef", source_5, target_11);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.6", "Set .pyDescription", source_6, target_12);
{
    String pzSourceVar22 = "";
    pzSourceVar22 = scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_24, myStepPage, pzSourceVar22, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.6", "Set .pyDescription", source_6, target_12);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.7", "Set .pyDescriptionRef", source_7, target_13);
{
    String pzSourceVar26 = "";
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyDescriptionRef", pRef_27, myStepPage, pzSourceVar26, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.7", "Set .pyDescriptionRef", source_7, target_13);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.8", "Set .pyIsDirty", source_8, target_14);
{
    String pzSourceVar28 = "";
    pzSourceVar28 = "false";
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyIsDirty", pRef_29, myStepPage, pzSourceVar28, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.8", "Set .pyIsDirty", source_8, target_14);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.9", "Set .pyClassName", source_9, target_15);
{
    String pzSourceVar31 = "";
    pzSourceVar31 = scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_33, myStepPage, pzSourceVar31, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.9", "Set .pyClassName", source_9, target_15);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.10", "Set .pyImage", source_10, target_16);
{
    String pzSourceVar35 = "";
    pzSourceVar35 = pega.<String>resolveMethodCall("pxGetWorkIcon--(PublicAPI)", "pxGetWorkIcon", "Pega-ProcessEngine", "WorkUtilities", new Object[] { tools });
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pyImage", pRef_36, myStepPage, pzSourceVar35, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.10", "Set .pyImage", source_10, target_16);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_23 = null;
try {
ctxt_frame_23 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_23.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyAction==\"createWork\"");
try {
boolean pz_38 = (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("createWork"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyAction==\"createWork\"",pz_38);
return pz_38;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyAction==\"createWork\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
} // return to previous step page
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.1", "Set .pyRecordKey", source_11, target_17);
{
    String pzSourceVar39 = "";
    PRStackFrame ctxt_frame_24 = null;
    try {
        ctxt_frame_24 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_24.getStepPage();
        pega.setViaPropRef(".pyRecordKey", pRef_11, myStepPage, pzSourceVar39, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_24);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.1", "Set .pyRecordKey", source_11, target_17);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.2", "Set .pyIsPersisted", source_12, target_18);
{
    boolean pzSourceVar40 = false;
    pzSourceVar40 = false;
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pega.setViaPropRef(".pyIsPersisted", pRef_41, myStepPage, pzSourceVar40, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.2", "Set .pyIsPersisted", source_12, target_18);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.3", "Set .pyLabel", source_13, target_19);
{
    String pzSourceVar43 = "";
    pzSourceVar43 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "New", "pyLabel", tools });
    PRStackFrame ctxt_frame_28 = null;
    try {
        ctxt_frame_28 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_28.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_18, myStepPage, pzSourceVar43, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.3", "Set .pyLabel", source_13, target_19);
if (whenCondition_7(pz_CurrentTraceInfo)) {
ClipboardPage target_20 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2.4", "When", null, target_20);
if (when_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2.4", "When", null, target_20);
}
if (whenCondition_8(pz_CurrentTraceInfo)) {
ClipboardPage target_21 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2.5", "When", null, target_21);
if (when_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2.5", "When", null, target_21);
}
if (whenCondition_9(pz_CurrentTraceInfo)) {
ClipboardPage target_22 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2.6", "When", null, target_22);
if (when_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2.6", "When", null, target_22);
}
return CODE_CONTINUE;
}private boolean whenCondition_7(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_30 = null;
try {
ctxt_frame_30 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_30.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(pyWorkPage)");
try {
boolean pz_45 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "pyWorkPage" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(pyWorkPage)",pz_45);
return pz_45;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(pyWorkPage) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
} // return to previous step page
}private int when_7(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_10(pz_CurrentTraceInfo)) {
ClipboardPage target_23 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2.4.1", "When", null, target_23);
if (when_10(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2.4.1", "When", null, target_23);
} else {
ClipboardPage target_24 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2.4.2", "Otherwise", null, target_24);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2.4.2", "Otherwise", null, target_24);
}
return CODE_CONTINUE;
}private boolean whenCondition_10(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_31 = null;
try {
ctxt_frame_31 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_31.getStepPage();
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "pyWorkPage.pyRulePage.pxObjClass != \"\"");
try {
boolean pz_48 = (!(scalarValueQuery_46.resolveToString(tools, pega.findPageWithException("pyWorkPage", (String) null), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "pyWorkPage.pyRulePage.pxObjClass != \"\"",pz_48);
return pz_48;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("pyWorkPage.pyRulePage.pxObjClass != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_31);
} // return to previous step page
}private int when_10(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_11(pz_CurrentTraceInfo)) {
ClipboardPage target_25 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2.4.1.1", "When", null, target_25);
if (when_11(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2.4.1.1", "When", null, target_25);
} else {
ClipboardPage target_26 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2.4.1.2", "Otherwise", null, target_26);
if (otherwise_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2.4.1.2", "Otherwise", null, target_26);
}
return CODE_CONTINUE;
}private boolean whenCondition_11(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_32 = null;
try {
ctxt_frame_32 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_32.getStepPage();
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "pyWorkPage.pyRulePage.pyMode==\"Component\"");
try {
boolean pz_51 = (scalarValueQuery_49.resolveToString(tools, pega.findPageWithException("pyWorkPage", (String) null), ImmutablePropertyInfo.TYPE_TEXT).equals("Component"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "pyWorkPage.pyRulePage.pyMode==\"Component\"",pz_51);
return pz_51;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("pyWorkPage.pyRulePage.pyMode==\"Component\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_32);
} // return to previous step page
}private int when_11(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.4.1.1.1", "Set .pyDescription", source_14, target_27);
{
    String pzSourceVar52 = "";
    pzSourceVar52 = "Component";
    PRStackFrame ctxt_frame_33 = null;
    try {
        ctxt_frame_33 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_33.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_24, myStepPage, pzSourceVar52, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.4.1.1.1", "Set .pyDescription", source_14, target_27);
return CODE_CONTINUE;
}private int otherwise_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.4.1.2.1", "Set .pyDescription", source_15, target_28);
{
    String pzSourceVar54 = "";
    pzSourceVar54 = pega.<String>resolveMethodCall("lookup--(String,String,String,String,String)", "lookup", "Pega-RULES", "Utilities", new Object[] { "pyLabel", "Rule-Obj-Class", "pyClassName", scalarValueQuery_46.resolveToString(tools, pega.findPageWithException("pyWorkPage", (String) null), ImmutablePropertyInfo.TYPE_TEXT), "" });
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_24, myStepPage, pzSourceVar54, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.4.1.2.1", "Set .pyDescription", source_15, target_28);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.4.2.1", "Set .pyDescription", source_16, target_29);
{
    String pzSourceVar56 = "";
    pzSourceVar56 = pega.<String>resolveMethodCall("lookup--(String,String,String,String,String)", "lookup", "Pega-RULES", "Utilities", new Object[] { "pyLabel", "Rule-Obj-Class", "pyClassName", scalarValueQuery_32.resolveToString(tools, pega.findPageWithException("pyWorkPage", (String) null), ImmutablePropertyInfo.TYPE_TEXT), "" });
    PRStackFrame ctxt_frame_37 = null;
    try {
        ctxt_frame_37 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_37.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_24, myStepPage, pzSourceVar56, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.4.2.1", "Set .pyDescription", source_16, target_29);
return CODE_CONTINUE;
}private boolean whenCondition_8(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_39 = null;
try {
ctxt_frame_39 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_39.getStepPage();
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.label != \"\"");
try {
boolean pz_58 = (!(tools.getParamValue("label").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.label != \"\"",pz_58);
return pz_58;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.label != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
} // return to previous step page
}private int when_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.5.1", "Set .pyLabel", source_17, target_30);
{
    String pzSourceVar59 = "";
    pzSourceVar59 = tools.getParamValue("label");
    PRStackFrame ctxt_frame_40 = null;
    try {
        ctxt_frame_40 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_40.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_18, myStepPage, pzSourceVar59, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_40);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.5.1", "Set .pyLabel", source_17, target_30);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.5.2", "Set .pyLabel", source_18, target_31);
{
    String pzSourceVar61 = "";
    pzSourceVar61 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "New", "pyLabel", tools });
    PRStackFrame ctxt_frame_42 = null;
    try {
        ctxt_frame_42 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_42.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_18, myStepPage, pzSourceVar61, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_42);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.5.2", "Set .pyLabel", source_18, target_31);
return CODE_CONTINUE;
}private boolean whenCondition_9(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_44 = null;
try {
ctxt_frame_44 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_44.getStepPage();
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(pyWorkPage) &amp;&amp; pyWorkPage.pxObjClass==\"Work-ProjectManagement-SaveAs\"");
try {
boolean pz_63 = ((pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "pyWorkPage" })).booleanValue() && (scalarValueQuery_32.resolveToString(tools, pega.findPageWithException("pyWorkPage", (String) null), ImmutablePropertyInfo.TYPE_TEXT).equals("Work-ProjectManagement-SaveAs")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(pyWorkPage) &amp;&amp; pyWorkPage.pxObjClass==\"Work-ProjectManagement-SaveAs\"",pz_63);
return pz_63;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(pyWorkPage) &amp;&amp; pyWorkPage.pxObjClass==\"Work-ProjectManagement-SaveAs\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_44);
} // return to previous step page
}private int when_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.6.1", "Set .pyLabel", source_19, target_32);
{
    String pzSourceVar64 = "";
    pzSourceVar64 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { ("Save as label\t" + scalarValueQuery_65.resolveToString(tools, pega.findPageWithException("pyWorkPage", (String) null), ImmutablePropertyInfo.TYPE_TEXT)), "pyLabel", tools });
    PRStackFrame ctxt_frame_45 = null;
    try {
        ctxt_frame_45 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_45.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_18, myStepPage, pzSourceVar64, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_45);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.6.1", "Set .pyLabel", source_19, target_32);
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_47 = null;
try {
ctxt_frame_47 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_47.getStepPage();
boolean pz_CheckMessage_8 = true;
PRStackFrame pz_modelTargetConditionFrame_8 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyAction==\"openWizard\"");
try {
boolean pz_68 = (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("openWizard"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyAction==\"openWizard\"",pz_68);
return pz_68;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyAction==\"openWizard\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_8, pz_modelTargetConditionFrame_8);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_47);
} // return to previous step page
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.1", "Set .pyLabel", source_20, target_33);
{
    String pzSourceVar69 = "";
    pzSourceVar69 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "New", "pyLabel", tools });
    PRStackFrame ctxt_frame_48 = null;
    try {
        ctxt_frame_48 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_48.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_18, myStepPage, pzSourceVar69, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_48);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.1", "Set .pyLabel", source_20, target_33);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_34 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.2", "Set .pyDescription", source_21, target_34);
{
    String pzSourceVar71 = "";
    pzSourceVar71 = tools.getParamValue("wizardLabel");
    PRStackFrame ctxt_frame_50 = null;
    try {
        ctxt_frame_50 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_50.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_24, myStepPage, pzSourceVar71, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_50);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.2", "Set .pyDescription", source_21, target_34);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_35 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.3", "Set .pyIsPersisted", source_22, target_35);
{
    boolean pzSourceVar73 = false;
    pzSourceVar73 = false;
    PRStackFrame ctxt_frame_52 = null;
    try {
        ctxt_frame_52 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_52.getStepPage();
        pega.setViaPropRef(".pyIsPersisted", pRef_41, myStepPage, pzSourceVar73, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_52);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.3", "Set .pyIsPersisted", source_22, target_35);
if (whenCondition_12(pz_CurrentTraceInfo)) {
ClipboardPage target_36 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.3.4", "When", null, target_36);
if (when_12(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.3.4", "When", null, target_36);
}
if (whenCondition_13(pz_CurrentTraceInfo)) {
ClipboardPage target_37 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.3.6", "When", null, target_37);
if (when_13(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.3.6", "When", null, target_37);
}
return CODE_CONTINUE;
}private boolean whenCondition_12(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_54 = null;
try {
ctxt_frame_54 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_54.getStepPage();
boolean pz_CheckMessage_9 = true;
PRStackFrame pz_modelTargetConditionFrame_9 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.wizardLabel != \"\"");
try {
boolean pz_75 = (!(tools.getParamValue("wizardLabel").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.wizardLabel != \"\"",pz_75);
return pz_75;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.wizardLabel != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_9, pz_modelTargetConditionFrame_9);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_54);
} // return to previous step page
}private int when_12(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_38 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.4.1", "Set .pyRecordKey", source_23, target_38);
{
    String pzSourceVar76 = "";
    pzSourceVar76 = tools.getParamValue("wizardLabel");
    PRStackFrame ctxt_frame_55 = null;
    try {
        ctxt_frame_55 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_55.getStepPage();
        pega.setViaPropRef(".pyRecordKey", pRef_11, myStepPage, pzSourceVar76, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_55);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.4.1", "Set .pyRecordKey", source_23, target_38);
return CODE_CONTINUE;
}private boolean whenCondition_13(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_57 = null;
try {
ctxt_frame_57 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_57.getStepPage();
boolean pz_CheckMessage_10 = true;
PRStackFrame pz_modelTargetConditionFrame_10 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.pyIsExistingWizard==\"true\"");
try {
boolean pz_78 = (tools.getParamValue("pyIsExistingWizard").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.pyIsExistingWizard==\"true\"",pz_78);
return pz_78;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.pyIsExistingWizard==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_10, pz_modelTargetConditionFrame_10);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_57);
} // return to previous step page
}private int when_13(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_14(pz_CurrentTraceInfo)) {
ClipboardPage target_39 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.3.6.1", "When", null, target_39);
if (when_14(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.3.6.1", "When", null, target_39);
}
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_40 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.6.2", "Set .pyLabel", source_24, target_40);
{
    String pzSourceVar79 = "";
    pzSourceVar79 = scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_58 = null;
    try {
        ctxt_frame_58 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_58.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_18, myStepPage, pzSourceVar79, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_58);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.6.2", "Set .pyLabel", source_24, target_40);
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_41 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.6.3", "Set .pyDescription", source_25, target_41);
{
    String pzSourceVar81 = "";
    pzSourceVar81 = scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_60 = null;
    try {
        ctxt_frame_60 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_60.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_24, myStepPage, pzSourceVar81, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_60);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.6.3", "Set .pyDescription", source_25, target_41);
return CODE_CONTINUE;
}private boolean whenCondition_14(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_62 = null;
try {
ctxt_frame_62 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_62.getStepPage();
boolean pz_CheckMessage_11 = true;
PRStackFrame pz_modelTargetConditionFrame_11 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLabel != \"\"");
try {
boolean pz_83 = (!(scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLabel != \"\"",pz_83);
return pz_83;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLabel != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_11, pz_modelTargetConditionFrame_11);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_62);
} // return to previous step page
}private int when_14(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_26 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_42 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.6.1.1", "Set .pyRecordKey", source_26, target_42);
{
    String pzSourceVar84 = "";
    pzSourceVar84 = scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_63 = null;
    try {
        ctxt_frame_63 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_63.getStepPage();
        pega.setViaPropRef(".pyRecordKey", pRef_11, myStepPage, pzSourceVar84, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_63);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.3.6.1.1", "Set .pyRecordKey", source_26, target_42);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_65 = null;
try {
ctxt_frame_65 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_65.getStepPage();
boolean pz_CheckMessage_12 = true;
PRStackFrame pz_modelTargetConditionFrame_12 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyDocumentTitle !=\"\"");
try {
boolean pz_87 = (!(scalarValueQuery_86.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyDocumentTitle !=\"\"",pz_87);
return pz_87;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyDocumentTitle !=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_12, pz_modelTargetConditionFrame_12);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_65);
} // return to previous step page
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_27 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_43 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.4.1", "Set .pyLabel", source_27, target_43);
{
    String pzSourceVar88 = "";
    pzSourceVar88 = scalarValueQuery_86.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_66 = null;
    try {
        ctxt_frame_66 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_66.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_18, myStepPage, pzSourceVar88, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_66);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.4.1", "Set .pyLabel", source_27, target_43);
return CODE_CONTINUE;
}private boolean whenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_68 = null;
try {
ctxt_frame_68 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_68.getStepPage();
boolean pz_CheckMessage_13 = true;
PRStackFrame pz_modelTargetConditionFrame_13 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyAction==\"openworkbyhandle\"");
try {
boolean pz_90 = (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("openworkbyhandle"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyAction==\"openworkbyhandle\"",pz_90);
return pz_90;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyAction==\"openworkbyhandle\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_13, pz_modelTargetConditionFrame_13);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_68);
} // return to previous step page
}private int when_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_28 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_44 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.5.1", "Set .pyDescription", source_28, target_44);
{
    String pzSourceVar91 = "";
    pzSourceVar91 = scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_69 = null;
    try {
        ctxt_frame_69 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_69.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_24, myStepPage, pzSourceVar91, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_69);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.5.1", "Set .pyDescription", source_28, target_44);
return CODE_CONTINUE;
}private boolean whenCondition_6(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_71 = null;
try {
ctxt_frame_71 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_71.getStepPage();
boolean pz_CheckMessage_14 = true;
PRStackFrame pz_modelTargetConditionFrame_14 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__1 = pega.invokeWhen("pzIsTransistionRule", "Work-", "System-User-Recents");
return pz__1;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_14, pz_modelTargetConditionFrame_14);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_71);
} // return to previous step page
}private int when_6(RuleTraceInfo pz_CurrentTraceInfo) {
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '"pyRecentListItem.pyExecute"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_74 = null;
try {
ctxt_frame_74 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_74.getStepPage();
ClipboardPage ctxt_page_2 = null;
ClipboardProperty pz_94 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_72 = null;
try {
ctxt_frame_72 = pega.pushStackFrame("pyRecentListItem.pyExecute", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_72.getStepPage();
pz_94 = propertyQuery_93.resolve(tools, pega.findPageWithException("pyRecentListItem", "System-User-Recents"));
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_72);
} // return to previous step page

ctxt_page_2 = pz_94 == null ? null : pz_94.getPageValue();
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", "pyRecentListItem.pyExecute", ctxt_page_2);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_74);
} // return to previous step page
ClipboardPage target_context_2 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.6.1", "Update Page", null, target_context_2);
if (updatePage_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.6.1", "Update Page", null, target_context_2);
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_29 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_45 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.1.1", "Set .pyAction", source_29, target_45);
{
    String pzSourceVar96 = "";
    pzSourceVar96 = "runScript";
    PRStackFrame ctxt_frame_75 = null;
    try {
        ctxt_frame_75 = pega.pushStackFrame("Embed-DesktopAPI", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_75.getStepPage();
        pega.setViaPropRef(".pyAction", pRef_97, myStepPage, pzSourceVar96, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_75);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.6.1.1", "Set .pyAction", source_29, target_45);
ClipboardPage source_30 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_46 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.1.2", "Set .pyActionAPI.pxObjClass", source_30, target_46);
// Change obj class
String pz_102 = "Embed-DesktopAPI-Custom";
ClipboardPage tempPage_1 = tools.createPage(pz_102, "");
ClipboardProperty pz_101 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_77 = null;
try {
ctxt_frame_77 = pega.pushStackFrame(".pyActionAPI.pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_77.getStepPage();
pz_101 = propertyQuery_99.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_77);
} // return to previous step page

ClipboardPage targetPage_1 = pz_101.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"1.6.1.2", "Set .pyActionAPI.pxObjClass", source_30, target_46);
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '"pyRecentListItem.pyExecute.pyActionAPI"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_80 = null;
try {
ctxt_frame_80 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_80.getStepPage();
ClipboardPage ctxt_page_3 = null;
ClipboardProperty pz_105 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_78 = null;
try {
ctxt_frame_78 = pega.pushStackFrame("pyRecentListItem.pyExecute.pyActionAPI", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_78.getStepPage();
pz_105 = propertyQuery_103.resolve(tools, pega.findPageWithException("pyRecentListItem", "System-User-Recents"));
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_78);
} // return to previous step page

ctxt_page_3 = pz_105 == null ? null : pz_105.getPageValue();
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "pyRecentListItem.pyExecute.pyActionAPI", ctxt_page_3);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_80);
} // return to previous step page
ClipboardPage target_context_3 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.6.1.3", "Update Page", null, target_context_3);
if (updatePage_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.6.1.3", "Update Page", null, target_context_3);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_108 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_81 = null;
try {
ctxt_frame_81 = pega.pushStackFrame("pyRecentListItem.pyExecute.pyActionAPI.pyParameters", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_81.getStepPage();
pz_108 = pega.getViaPropRef(".pyExecute.pyActionAPI.pyParameters", pRef_107, pega.findPageWithException("pyRecentListItem", "System-User-Recents"), false, false);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_81);
} // return to previous step page

targetProperty_1 = pz_108;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '"pyRecentListItem.pyExecute.pyActionAPI.pyParameters"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_82 = null;
try {
ctxt_frame_82 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_82.getStepPage();
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", "pyRecentListItem.pyExecute.pyActionAPI.pyParameters", ctxt_page_4);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_82);
} // return to previous step page
actionProlog(pz_CurrentTraceInfo,"1.6.1.4", "Append and Map to", null, targetProperty_1);
if (appendAndMapTo_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.6.1.4", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_31 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_47 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.1.3.1", "Set .pyFunctionName", source_31, target_47);
{
    String pzSourceVar109 = "";
    pzSourceVar109 = "OpenWorkByHandle";
    PRStackFrame ctxt_frame_83 = null;
    try {
        ctxt_frame_83 = pega.pushStackFrame("Embed-DesktopAPI-Custom", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_83.getStepPage();
        pega.setViaPropRef(".pyFunctionName", pRef_110, myStepPage, pzSourceVar109, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_83);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.6.1.3.1", "Set .pyFunctionName", source_31, target_47);
return CODE_CONTINUE;
}private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_32 =null;
ClipboardPage target_48 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.6.1.4.1", "Set .pyValue", source_32, target_48);
{
    String pzSourceVar112 = "";
    pzSourceVar112 = scalarValueQuery_10.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_85 = null;
    try {
        ctxt_frame_85 = pega.pushStackFrame("Embed-NameValuePair", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_85.getStepPage();
        pega.setViaPropRef(".pyValue", pRef_113, myStepPage, pzSourceVar112, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_85);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.6.1.4.1", "Set .pyValue", source_32, target_48);
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
	"Rule-Obj-Model:PYADDRECENTLISTITEM"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYADDRECENTLISTITEM","Rule-Obj-Model","WORK-",false,"","Pega-UIEngine","08-01-01","RULE-OBJ-MODEL WORK- PYADDRECENTLISTITEM #20180713T133325.486 GMT","!PYADDRECENTLISTITEM",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1044233092)
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
//	RULE-OBJ-MODEL WORK- PYADDRECENTLISTITEM #20180713T133325.486 GMT:20180809T074355.925 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "d8669cb98e82d47283b6a525b06a26f3";
	}

	public String getDefinitionAppliesToClass() {
		return "Work-";
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

public static final String[] pRef_33 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_14 = new String[] { "", "", "pyContentType", "" };
public static final String[] pRef_47 = new String[] { "", "", "pyRulePage", "", "pxObjClass", "" };
public static final String[] pRef_97 = new String[] { "", "", "pyAction", "" };
public static final String[] pRef_41 = new String[] { "", "", "pyIsPersisted", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyRecordKey", "" };
public static final String[] pRef_27 = new String[] { "", "", "pyDescriptionRef", "" };
public static final String[] pRef_50 = new String[] { "", "", "pyRulePage", "", "pyMode", "" };
public static final String[] pRef_18 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_110 = new String[] { "", "", "pyFunctionName", "" };
public static final String[] pRef_36 = new String[] { "", "", "pyImage", "" };
public static final String[] pRef_24 = new String[] { "", "", "pyDescription", "" };
public static final String[] pRef_104 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyLabelRef", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyExecute", "", "pyAction", "" };
public static final String[] pRef_107 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pyParameters", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyRecordID", "" };
public static final String[] pRef_100 = new String[] { "", "", "pyActionAPI", "", "pxObjClass", "" };
public static final String[] pRef_29 = new String[] { "", "", "pyIsDirty", "" };
public static final String[] pRef_67 = new String[] { "", "", "pyRulePage", "", "pyLabel", "" };
public static final String[] pRef_113 = new String[] { "", "", "pyValue", "" };
private static final ScalarValueQuery scalarValueQuery_65 = FUAUtil.createQueryBuilder().page("pyRulePage").scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_103 = FUAUtil.createQueryBuilder().page("pyExecute").page("pyActionAPI").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_32 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().page("pyRulePage").scalarProperty("pyMode").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_86 = FUAUtil.createQueryBuilder().scalarProperty("pyDocumentTitle").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().page("pyExecute").scalarProperty("pyAction").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_99 = FUAUtil.createQueryBuilder().page("pyActionAPI").scalarProperty("pxObjClass").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().page("pyRulePage").scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pyID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pyDescription").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_93 = FUAUtil.createQueryBuilder().page("pyExecute").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL WORK- PYADDRECENTLISTITEM #20180713T133325.486 GMT", "Work- pyAddRecentListItem", "Pega-UIEngine", "08-01-01", "20180809T074355.925 GMT");
}
