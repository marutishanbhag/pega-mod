package com.pegarules.generated.model;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
public class ra_model_pyaddrecentlistitem_8a6f1f977af25597cf51efdfb8aaa579 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyAddRecentListItem._baseclass.Model");
	public ra_model_pyaddrecentlistitem_8a6f1f977af25597cf51efdfb8aaa579(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL @BASECLASS PYADDRECENTLISTITEM #20200917T130310.309 GMT	Pega-UIEngine:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_1 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1", "When", null, target_1);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"1", "When", null, target_1);
}
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
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "When", null, target_2);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "When", null, target_2);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.pyStreamName==\"pzLPApplicationDashboard\"");
try {
boolean pz_2 = (tools.getParamValue("pyStreamName").equals("pzLPApplicationDashboard"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.pyStreamName==\"pzLPApplicationDashboard\"",pz_2);
return pz_2;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.pyStreamName==\"pzLPApplicationDashboard\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
actionProlog(pz_CurrentTraceInfo,"1.1", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"1.1", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
}private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyLabel", source_1, target_3);
{
    String pzSourceVar3 = "";
    pzSourceVar3 = scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar3, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyLabel", source_1, target_3);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pyLabelRef", source_2, target_4);
{
    String pzSourceVar7 = "";
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pyLabelRef", pRef_8, myStepPage, pzSourceVar7, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pyLabelRef", source_2, target_4);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.4", "Set .pyDescriptionRef", source_3, target_5);
{
    String pzSourceVar9 = "";
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pyDescriptionRef", pRef_10, myStepPage, pzSourceVar9, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.4", "Set .pyDescriptionRef", source_3, target_5);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.5", "Set .pyImage", source_4, target_6);
{
    String pzSourceVar11 = "";
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pyImage", pRef_12, myStepPage, pzSourceVar11, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.5", "Set .pyImage", source_4, target_6);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.6", "Set .pxApplication", source_5, target_7);
{
    String pzSourceVar13 = "";
    pzSourceVar13 = scalarValueQuery_14.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        pega.setViaPropRef(".pxApplication", pRef_15, myStepPage, pzSourceVar13, "sTY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.6", "Set .pxApplication", source_5, target_7);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.7", "Set .pyIsDirty", source_6, target_8);
{
    String pzSourceVar17 = "";
    pzSourceVar17 = "false";
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyIsDirty", pRef_18, myStepPage, pzSourceVar17, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.7", "Set .pyIsDirty", source_6, target_8);
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.8", "When", null, target_9);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.8", "When", null, target_9);
}
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.9", "Set .pyIsPersisted", source_7, target_10);
{
    String pzSourceVar20 = "";
    pzSourceVar20 = tools.getParamValue("bPersist");
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyIsPersisted", pRef_21, myStepPage, pzSourceVar20, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.9", "Set .pyIsPersisted", source_7, target_10);
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_11 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.10", "When", null, target_11);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.10", "When", null, target_11);
}
if (whenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_12 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.11", "When", null, target_12);
if (when_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.11", "When", null, target_12);
} else if (otherwiseWhenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_13 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.12", "Otherwise When", null, target_13);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.12", "Otherwise When", null, target_13);
}
if (whenCondition_6(pz_CurrentTraceInfo)) {
ClipboardPage target_14 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.13", "When", null, target_14);
if (when_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.13", "When", null, target_14);
}
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_17 = null;
try {
ctxt_frame_17 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_17.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyDescription != \"\"");
try {
boolean pz_24 = (!(scalarValueQuery_23.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyDescription != \"\"",pz_24);
return pz_24;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyDescription != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
} // return to previous step page
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.8.1", "Set .pyDescription", source_8, target_15);
{
    String pzSourceVar25 = "";
    pzSourceVar25 = scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_26, myStepPage, pzSourceVar25, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.8.1", "Set .pyDescription", source_8, target_15);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_20 = null;
try {
ctxt_frame_20 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_20.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyAction ==\"showHarness\" || .pyExecute.pyAction ==\"openLanding\"");
try {
boolean pz_30 = ((scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("showHarness")) || (scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("openLanding")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyAction ==\"showHarness\" || .pyExecute.pyAction ==\"openLanding\"",pz_30);
return pz_30;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyAction ==\"showHarness\" || .pyExecute.pyAction ==\"openLanding\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
} // return to previous step page
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_7(pz_CurrentTraceInfo)) {
ClipboardPage target_16 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.10.1", "When", null, target_16);
if (when_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.10.1", "When", null, target_16);
} else if (otherwiseWhenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_17 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.10.2", "Otherwise When", null, target_17);
if (otherwiseWhen_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.10.2", "Otherwise When", null, target_17);
} else {
ClipboardPage target_18 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.10.3", "Otherwise", null, target_18);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.10.3", "Otherwise", null, target_18);
}
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.4", "Set .pyClassLabel", source_9, target_19);
{
    String pzSourceVar31 = "";
    pzSourceVar31 = scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pyClassLabel", pRef_33, myStepPage, pzSourceVar31, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.4", "Set .pyClassLabel", source_9, target_19);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.5", "Set .pyContentType", source_10, target_20);
{
    String pzSourceVar35 = "";
    pzSourceVar35 = "Harness";
    PRStackFrame ctxt_frame_23 = null;
    try {
        ctxt_frame_23 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_23.getStepPage();
        pega.setViaPropRef(".pyContentType", pRef_36, myStepPage, pzSourceVar35, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.5", "Set .pyContentType", source_10, target_20);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.6", "Set .pyRecordKey", source_11, target_21);
{
    String pzSourceVar38 = "";
    pzSourceVar38 = ((((tools.getParamValue("harnessName") + ":") + tools.getParamValue("className")) + ":") + tools.getParamValue("label"));
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyRecordKey", pRef_39, myStepPage, pzSourceVar38, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.6", "Set .pyRecordKey", source_11, target_21);
return CODE_CONTINUE;
}private boolean whenCondition_7(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_27 = null;
try {
ctxt_frame_27 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_27.getStepPage();
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyDocumentTitle !=\"\"");
try {
boolean pz_42 = (!(scalarValueQuery_41.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyDocumentTitle !=\"\"",pz_42);
return pz_42;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyDocumentTitle !=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_27);
} // return to previous step page
}private int when_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.1.1", "Set .pyLabel", source_12, target_22);
{
    String pzSourceVar43 = "";
    pzSourceVar43 = scalarValueQuery_41.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_28 = null;
    try {
        ctxt_frame_28 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_28.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar43, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.1.1", "Set .pyLabel", source_12, target_22);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.1.2", "Set .pyDescription", source_13, target_23);
{
    String pzSourceVar45 = "";
    pzSourceVar45 = scalarValueQuery_41.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_26, myStepPage, pzSourceVar45, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.1.2", "Set .pyDescription", source_13, target_23);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.1.3", "Set .pyClassLabel", source_14, target_24);
{
    String pzSourceVar47 = "";
    pzSourceVar47 = scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_32 = null;
    try {
        ctxt_frame_32 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_32.getStepPage();
        pega.setViaPropRef(".pyClassLabel", pRef_33, myStepPage, pzSourceVar47, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_32);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.1.3", "Set .pyClassLabel", source_14, target_24);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_34 = null;
try {
ctxt_frame_34 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_34.getStepPage();
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.label != \"\"");
try {
boolean pz_49 = (!(tools.getParamValue("label").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.label != \"\"",pz_49);
return pz_49;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.label != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
} // return to previous step page
}private int otherwiseWhen_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.2.1", "Set .pyLabel", source_15, target_25);
{
    String pzSourceVar50 = "";
    pzSourceVar50 = tools.getParamValue("label");
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar50, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.2.1", "Set .pyLabel", source_15, target_25);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.2.2", "Set .pyDescription", source_16, target_26);
{
    String pzSourceVar52 = "";
    pzSourceVar52 = tools.getParamValue("label");
    PRStackFrame ctxt_frame_37 = null;
    try {
        ctxt_frame_37 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_37.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_26, myStepPage, pzSourceVar52, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.2.2", "Set .pyDescription", source_16, target_26);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.2.3", "Set .pyClassLabel", source_17, target_27);
{
    String pzSourceVar54 = "";
    pzSourceVar54 = scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_39 = null;
    try {
        ctxt_frame_39 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_39.getStepPage();
        pega.setViaPropRef(".pyClassLabel", pRef_33, myStepPage, pzSourceVar54, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.2.3", "Set .pyClassLabel", source_17, target_27);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.3.1", "Set .pyLabel", source_18, target_28);
{
    String pzSourceVar56 = "";
    pzSourceVar56 = tools.getParamValue("harnessName");
    PRStackFrame ctxt_frame_41 = null;
    try {
        ctxt_frame_41 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_41.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, pzSourceVar56, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_41);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.3.1", "Set .pyLabel", source_18, target_28);
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10.3.2", "Set .pyDescription", source_19, target_29);
{
    String pzSourceVar58 = "";
    pzSourceVar58 = tools.getParamValue("harnessName");
    PRStackFrame ctxt_frame_43 = null;
    try {
        ctxt_frame_43 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_43.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_26, myStepPage, pzSourceVar58, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_43);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10.3.2", "Set .pyDescription", source_19, target_29);
return CODE_CONTINUE;
}private boolean whenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_45 = null;
try {
ctxt_frame_45 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_45.getStepPage();
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyAction==\"openLanding\"");
try {
boolean pz_60 = (scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("openLanding"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyAction==\"openLanding\"",pz_60);
return pz_60;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyAction==\"openLanding\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_45);
} // return to previous step page
}private int when_5(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_8(pz_CurrentTraceInfo)) {
ClipboardPage target_30 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.11.2", "When", null, target_30);
if (when_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.11.2", "When", null, target_30);
} else if (otherwiseWhenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_31 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.11.3", "Otherwise When", null, target_31);
if (otherwiseWhen_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.11.3", "Otherwise When", null, target_31);
} else {
ClipboardPage target_32 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.11.4", "Otherwise", null, target_32);
if (otherwise_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.11.4", "Otherwise", null, target_32);
}
return CODE_CONTINUE;
}private boolean whenCondition_8(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_46 = null;
try {
ctxt_frame_46 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_46.getStepPage();
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.pyStreamName==\"pzCaseTypeFromExplorer\" || param.pyStreamName==\"pzCaseTypeLP\"");
try {
boolean pz_61 = ((tools.getParamValue("pyStreamName").equals("pzCaseTypeFromExplorer")) || (tools.getParamValue("pyStreamName").equals("pzCaseTypeLP")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.pyStreamName==\"pzCaseTypeFromExplorer\" || param.pyStreamName==\"pzCaseTypeLP\"",pz_61);
return pz_61;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.pyStreamName==\"pzCaseTypeFromExplorer\" || param.pyStreamName==\"pzCaseTypeLP\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_46);
} // return to previous step page
}private int when_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.11.2.1", "Set .pyRecordKey", source_20, target_33);
{
    String pzSourceVar62 = "";
    pzSourceVar62 = scalarValueQuery_63.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_47 = null;
    try {
        ctxt_frame_47 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_47.getStepPage();
        pega.setViaPropRef(".pyRecordKey", pRef_39, myStepPage, pzSourceVar62, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_47);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.11.2.1", "Set .pyRecordKey", source_20, target_33);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_34 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.11.2.2", "Set .pyDescription", source_21, target_34);
{
    String pzSourceVar65 = "";
    pzSourceVar65 = "Case Designer";
    PRStackFrame ctxt_frame_49 = null;
    try {
        ctxt_frame_49 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_49.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_26, myStepPage, pzSourceVar65, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_49);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.11.2.2", "Set .pyDescription", source_21, target_34);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_51 = null;
try {
ctxt_frame_51 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_51.getStepPage();
boolean pz_CheckMessage_8 = true;
PRStackFrame pz_modelTargetConditionFrame_8 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.pyStreamName==\"pzDataTypeOverview\"");
try {
boolean pz_67 = (tools.getParamValue("pyStreamName").equals("pzDataTypeOverview"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.pyStreamName==\"pzDataTypeOverview\"",pz_67);
return pz_67;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.pyStreamName==\"pzDataTypeOverview\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_8, pz_modelTargetConditionFrame_8);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_51);
} // return to previous step page
}private int otherwiseWhen_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_35 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.11.3.1", "Set .pyDescription", source_22, target_35);
{
    String pzSourceVar68 = "";
    pzSourceVar68 = "Data Designer";
    PRStackFrame ctxt_frame_52 = null;
    try {
        ctxt_frame_52 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_52.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_26, myStepPage, pzSourceVar68, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_52);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.11.3.1", "Set .pyDescription", source_22, target_35);
return CODE_CONTINUE;
}private int otherwise_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_36 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.11.4.1", "Set .pyDescription", source_23, target_36);
{
    String pzSourceVar70 = "";
    pzSourceVar70 = "Landing Page";
    PRStackFrame ctxt_frame_54 = null;
    try {
        ctxt_frame_54 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_54.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_26, myStepPage, pzSourceVar70, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_54);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.11.4.1", "Set .pyDescription", source_23, target_36);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_56 = null;
try {
ctxt_frame_56 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_56.getStepPage();
boolean pz_CheckMessage_9 = true;
PRStackFrame pz_modelTargetConditionFrame_9 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyExecute.pyAction==\"showHarness\" &amp;&amp; Param.harnessName == \"pzViewInstances\"");
try {
boolean pz_72 = ((scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("showHarness")) && (tools.getParamValue("harnessName").equals("pzViewInstances")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyExecute.pyAction==\"showHarness\" &amp;&amp; Param.harnessName == \"pzViewInstances\"",pz_72);
return pz_72;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyExecute.pyAction==\"showHarness\" &amp;&amp; Param.harnessName == \"pzViewInstances\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_9, pz_modelTargetConditionFrame_9);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_56);
} // return to previous step page
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_37 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.12.1", "Set .pyDescription", source_24, target_37);
{
    String pzSourceVar73 = "";
    pzSourceVar73 = "Instance List";
    PRStackFrame ctxt_frame_57 = null;
    try {
        ctxt_frame_57 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_57.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_26, myStepPage, pzSourceVar73, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_57);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.12.1", "Set .pyDescription", source_24, target_37);
if (whenCondition_9(pz_CurrentTraceInfo)) {
ClipboardPage target_38 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.12.2", "When", null, target_38);
if (when_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.12.2", "When", null, target_38);
}
return CODE_CONTINUE;
}private boolean whenCondition_9(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_59 = null;
try {
ctxt_frame_59 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_59.getStepPage();
boolean pz_CheckMessage_10 = true;
PRStackFrame pz_modelTargetConditionFrame_10 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pzDocumentKey != \"\"");
try {
boolean pz_75 = (!(scalarValueQuery_63.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pzDocumentKey != \"\"",pz_75);
return pz_75;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pzDocumentKey != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_10, pz_modelTargetConditionFrame_10);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_59);
} // return to previous step page
}private int when_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_39 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.12.2.1", "Set .pyRecordKey", source_25, target_39);
{
    String pzSourceVar76 = "";
    pzSourceVar76 = scalarValueQuery_63.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_60 = null;
    try {
        ctxt_frame_60 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_60.getStepPage();
        pega.setViaPropRef(".pyRecordKey", pRef_39, myStepPage, pzSourceVar76, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_60);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.12.2.1", "Set .pyRecordKey", source_25, target_39);
return CODE_CONTINUE;
}private boolean whenCondition_6(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_62 = null;
try {
ctxt_frame_62 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_62.getStepPage();
boolean pz_CheckMessage_11 = true;
PRStackFrame pz_modelTargetConditionFrame_11 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.isMDC==\"true\"");
try {
boolean pz_78 = (tools.getParamValue("isMDC").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.isMDC==\"true\"",pz_78);
return pz_78;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.isMDC==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_11, pz_modelTargetConditionFrame_11);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_62);
} // return to previous step page
}private int when_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_26 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_40 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.13.1", "Set .pyParentKey", source_26, target_40);
{
    String pzSourceVar79 = "";
    pzSourceVar79 = tools.getParamValue("parentKey");
    PRStackFrame ctxt_frame_63 = null;
    try {
        ctxt_frame_63 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_63.getStepPage();
        pega.setViaPropRef(".pyParentKey", pRef_80, myStepPage, pzSourceVar79, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_63);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.13.1", "Set .pyParentKey", source_26, target_40);
ClipboardPage source_27 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_41 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.13.2", "Set .pyDomID", source_27, target_41);
{
    String pzSourceVar82 = "";
    pzSourceVar82 = tools.getParamValue("recordId");
    PRStackFrame ctxt_frame_65 = null;
    try {
        ctxt_frame_65 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_65.getStepPage();
        pega.setViaPropRef(".pyDomID", pRef_83, myStepPage, pzSourceVar82, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_65);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.13.2", "Set .pyDomID", source_27, target_41);
ClipboardPage source_28 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_42 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.13.3", "Set .pyIsMDC", source_28, target_42);
{
    String pzSourceVar85 = "";
    pzSourceVar85 = tools.getParamValue("isMDC");
    PRStackFrame ctxt_frame_67 = null;
    try {
        ctxt_frame_67 = pega.pushStackFrame("System-User-Recents", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_67.getStepPage();
        pega.setViaPropRef(".pyIsMDC", pRef_86, myStepPage, pzSourceVar85, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_67);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.13.3", "Set .pyIsMDC", source_28, target_42);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_12 = true;
PRStackFrame pz_modelTargetConditionFrame_12 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(pyRecentListItem.pyExecute.pyAction==\"openRule\" || pyRecentListItem.pyExecute.pyAction==\"runScript\") &amp;&amp; param.pyStreamName!=\"RuleFormHarnessError\"");
try {
boolean pz_88 = (((scalarValueQuery_28.resolveToString(tools, pega.findPageWithException("pyRecentListItem", "System-User-Recents"), ImmutablePropertyInfo.TYPE_TEXT).equals("openRule")) || (scalarValueQuery_28.resolveToString(tools, pega.findPageWithException("pyRecentListItem", "System-User-Recents"), ImmutablePropertyInfo.TYPE_TEXT).equals("runScript"))) && (!(tools.getParamValue("pyStreamName").equals("RuleFormHarnessError"))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(pyRecentListItem.pyExecute.pyAction==\"openRule\" || pyRecentListItem.pyExecute.pyAction==\"runScript\") &amp;&amp; param.pyStreamName!=\"RuleFormHarnessError\"",pz_88);
return pz_88;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(pyRecentListItem.pyExecute.pyAction==\"openRule\" || pyRecentListItem.pyExecute.pyAction==\"runScript\") &amp;&amp; param.pyStreamName!=\"RuleFormHarnessError\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_12, pz_modelTargetConditionFrame_12);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"3.1", "Apply Data Transform pyAddRuleRecentListItem", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "@baseclass";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pyAddRuleRecentListItem");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"3.1", "Apply Data Transform pyAddRuleRecentListItem", null, null);
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
		new DependentRuleInfo("PYADDRECENTLISTITEM","Rule-Obj-Model","@BASECLASS",false,"","Pega-UIEngine","08-06-01","RULE-OBJ-MODEL @BASECLASS PYADDRECENTLISTITEM #20200917T130310.309 GMT","!PYADDRECENTLISTITEM",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-733693528)
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
//	RULE-OBJ-MODEL @BASECLASS PYADDRECENTLISTITEM #20200917T130310.309 GMT:20200917T130310.309 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "516af0a0ccb70b082e1a97b0b2f261a9";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
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

public static final String[] pRef_80 = new String[] { "", "", "pyParentKey", "" };
public static final String[] pRef_36 = new String[] { "", "", "pyContentType", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyIsPersisted", "" };
public static final String[] pRef_39 = new String[] { "", "", "pyRecordKey", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyDescriptionRef", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_83 = new String[] { "", "", "pyDomID", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyImage", "" };
public static final String[] pRef_15 = new String[] { "", "", "pxApplication", "" };
public static final String[] pRef_26 = new String[] { "", "", "pyDescription", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyLabelRef", "" };
public static final String[] pRef_29 = new String[] { "", "", "pyExecute", "", "pyAction", "" };
public static final String[] pRef_33 = new String[] { "", "", "pyClassLabel", "" };
public static final String[] pRef_86 = new String[] { "", "", "pyIsMDC", "" };
public static final String[] pRef_18 = new String[] { "", "", "pyIsDirty", "" };
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pyDescription").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_63 = FUAUtil.createQueryBuilder().scalarProperty("pzDocumentKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_41 = FUAUtil.createQueryBuilder().scalarProperty("pyDocumentTitle").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_28 = FUAUtil.createQueryBuilder().page("pyExecute").scalarProperty("pyAction").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_32 = FUAUtil.createQueryBuilder().scalarProperty("pyClassLabel").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL @BASECLASS PYADDRECENTLISTITEM #20200917T130310.309 GMT", "@baseclass pyAddRecentListItem", "Pega-UIEngine", "08-06-01", "20200917T130310.309 GMT");
}
