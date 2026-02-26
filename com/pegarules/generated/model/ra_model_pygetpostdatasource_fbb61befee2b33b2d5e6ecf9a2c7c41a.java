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
public class ra_model_pygetpostdatasource_fbb61befee2b33b2d5e6ecf9a2c7c41a extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyGetPostDataSource.PegaSocial_Message.Model");
	public ra_model_pygetpostdatasource_fbb61befee2b33b2d5e6ecf9a2c7c41a(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL PEGASOCIAL-MESSAGE PYGETPOSTDATASOURCE #20201020T053535.358 GMT	Pega-Social:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
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
/* push '"Param.postDataSourceTemplate"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = tools.findPage(tools.getParamValue("postDataSourceTemplate"), true);
if (ctxt_page_1 == null) {
ctxt_page_1 = tools.findPage(tools.getParamValue("postDataSourceTemplate"), false);
if (ctxt_page_1 != null && !ctxt_page_1.isReadOnly()) {
ctxt_page_1.putString("pxObjClass", "Embed-Feed-DataSource");
}
}
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Param.postDataSourceTemplate", ctxt_page_1);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.postDataSourceTemplate == \"\" || ! @PageExists(Param.postDataSourceTemplate)");
try {
boolean pz_1 = ((tools.getParamValue("postDataSourceTemplate").equals("")) || ((!(pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { tools.getParamValue("postDataSourceTemplate") })).booleanValue())));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.postDataSourceTemplate == \"\" || ! @PageExists(Param.postDataSourceTemplate)",pz_1);
return pz_1;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.postDataSourceTemplate == \"\" || ! @PageExists(Param.postDataSourceTemplate) " + anyException.getMessage(), anyException);
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
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyDataSourceReference", source_1, target_2);
{
    String pzSourceVar2 = "";
    pzSourceVar2 = "D_pxPosts";
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        pega.setViaPropRef(".pyDataSourceReference", pRef_3, myStepPage, pzSourceVar2, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyDataSourceReference", source_1, target_2);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pzSourceDataPageParameters.Context", source_2, target_3);
{
    String pzSourceVar5 = "";
    pzSourceVar5 = tools.getParamValue("Key");
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pega.setViaPropRef(".pzSourceDataPageParameters.Context", pRef_6, myStepPage, pzSourceVar5, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pzSourceDataPageParameters.Context", source_2, target_3);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pzSourceDataPageParameters.retrieveTags", source_3, target_4);
{
    boolean pzSourceVar8 = false;
    pzSourceVar8 = true;
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pzSourceDataPageParameters.retrieveTags", pRef_9, myStepPage, pzSourceVar8, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pzSourceDataPageParameters.retrieveTags", source_3, target_4);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.4", "Set .pyLabel", source_4, target_5);
{
    String pzSourceVar11 = "";
    pzSourceVar11 = ((tools.getParamValue("Label").equals("")) ? "pyMessages" : tools.getParamValue("Label"));
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_12, myStepPage, pzSourceVar11, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.4", "Set .pyLabel", source_4, target_5);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.5", "Set .pyAllowFilter", source_5, target_6);
{
    String pzSourceVar14 = "";
    pzSourceVar14 = "true";
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        pega.setViaPropRef(".pyAllowFilter", pRef_15, myStepPage, pzSourceVar14, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.5", "Set .pyAllowFilter", source_5, target_6);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.6", "Set .pyClassName", source_6, target_7);
{
    String pzSourceVar17 = "";
    pzSourceVar17 = scalarValueQuery_18.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_19, myStepPage, pzSourceVar17, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.6", "Set .pyClassName", source_6, target_7);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.7", "Set .pySelected", source_7, target_8);
{
    boolean pzSourceVar21 = false;
    pzSourceVar21 = true;
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_22, myStepPage, pzSourceVar21, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.7", "Set .pySelected", source_7, target_8);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.8", "Set .pyPostedWhenReference", source_8, target_9);
{
    String pzSourceVar24 = "";
    pzSourceVar24 = ".pxUpdateDateTime";
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyPostedWhenReference", pRef_25, myStepPage, pzSourceVar24, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.8", "Set .pyPostedWhenReference", source_8, target_9);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.9", "Set .pyTitleType", source_9, target_10);
{
    String pzSourceVar27 = "";
    pzSourceVar27 = "section";
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pega.setViaPropRef(".pyTitleType", pRef_28, myStepPage, pzSourceVar27, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.9", "Set .pyTitleType", source_9, target_10);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10", "Set .pyTitleReference", source_10, target_11);
{
    String pzSourceVar30 = "";
    pzSourceVar30 = "pyPostTitleWithContext";
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pyTitleReference", pRef_31, myStepPage, pzSourceVar30, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10", "Set .pyTitleReference", source_10, target_11);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.11", "Set .pyIconType", source_11, target_12);
{
    String pzSourceVar33 = "";
    pzSourceVar33 = "user";
    PRStackFrame ctxt_frame_23 = null;
    try {
        ctxt_frame_23 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_23.getStepPage();
        pega.setViaPropRef(".pyIconType", pRef_34, myStepPage, pzSourceVar33, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.11", "Set .pyIconType", source_11, target_12);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.12", "Set .pyIconReference", source_12, target_13);
{
    String pzSourceVar36 = "";
    pzSourceVar36 = ".pyUser";
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyIconReference", pRef_37, myStepPage, pzSourceVar36, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.12", "Set .pyIconReference", source_12, target_13);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.13", "Set .pyMessageType", source_13, target_14);
{
    String pzSourceVar39 = "";
    pzSourceVar39 = "Section";
    PRStackFrame ctxt_frame_27 = null;
    try {
        ctxt_frame_27 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_27.getStepPage();
        pega.setViaPropRef(".pyMessageType", pRef_40, myStepPage, pzSourceVar39, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_27);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.13", "Set .pyMessageType", source_13, target_14);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.14", "Set .pyMessageReference", source_14, target_15);
{
    String pzSourceVar42 = "";
    pzSourceVar42 = "pyPostDetails";
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pega.setViaPropRef(".pyMessageReference", pRef_43, myStepPage, pzSourceVar42, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.14", "Set .pyMessageReference", source_14, target_15);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.15", "Set .pyPostConfiguredSource", source_15, target_16);
{
    boolean pzSourceVar45 = false;
    pzSourceVar45 = true;
    PRStackFrame ctxt_frame_31 = null;
    try {
        ctxt_frame_31 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_31.getStepPage();
        pega.setViaPropRef(".pyPostConfiguredSource", pRef_46, myStepPage, pzSourceVar45, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_31);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.15", "Set .pyPostConfiguredSource", source_15, target_16);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.16", "Set .pyMessageViewReference", source_16, target_17);
{
    String pzSourceVar48 = "";
    pzSourceVar48 = "pyPostDetails";
    PRStackFrame ctxt_frame_33 = null;
    try {
        ctxt_frame_33 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_33.getStepPage();
        pega.setViaPropRef(".pyMessageViewReference", pRef_49, myStepPage, pzSourceVar48, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.16", "Set .pyMessageViewReference", source_16, target_17);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.17", "Set .pyTitleViewReference", source_17, target_18);
{
    String pzSourceVar51 = "";
    pzSourceVar51 = "pyPostTitleWithContext";
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pega.setViaPropRef(".pyTitleViewReference", pRef_52, myStepPage, pzSourceVar51, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.17", "Set .pyTitleViewReference", source_17, target_18);
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_19 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.18", "When", null, target_19);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.18", "When", null, target_19);
}
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_37 = null;
try {
ctxt_frame_37 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_37.getStepPage();
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyClassName==\"PegaSocial-Message\"");
try {
boolean pz_55 = (scalarValueQuery_54.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("PegaSocial-Message"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyClassName==\"PegaSocial-Message\"",pz_55);
return pz_55;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyClassName==\"PegaSocial-Message\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
} // return to previous step page
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.18.1", "Set .pyIsSearchEnabled", source_18, target_20);
{
    boolean pzSourceVar56 = false;
    pzSourceVar56 = true;
    PRStackFrame ctxt_frame_38 = null;
    try {
        ctxt_frame_38 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_38.getStepPage();
        pega.setViaPropRef(".pyIsSearchEnabled", pRef_57, myStepPage, pzSourceVar56, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_38);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.18.1", "Set .pyIsSearchEnabled", source_18, target_20);
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
	"Rule-Obj-Model:PYGETPOSTDATASOURCE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYGETPOSTDATASOURCE","Rule-Obj-Model","PEGASOCIAL-MESSAGE",false,"","Pega-Social","08-06-01","RULE-OBJ-MODEL PEGASOCIAL-MESSAGE PYGETPOSTDATASOURCE #20201020T053535.358 GMT","!PYGETPOSTDATASOURCE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1166601348)
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
//	RULE-OBJ-MODEL PEGASOCIAL-MESSAGE PYGETPOSTDATASOURCE #20201020T053535.358 GMT:20201020T053535.358 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "1ca4c22accecf5e6ea5ce725fd970569";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaSocial-Message";
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

public static final String[] pRef_22 = new String[] { "", "", "pySelected", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_52 = new String[] { "", "", "pyTitleViewReference", "" };
public static final String[] pRef_28 = new String[] { "", "", "pyTitleType", "" };
public static final String[] pRef_43 = new String[] { "", "", "pyMessageReference", "" };
public static final String[] pRef_15 = new String[] { "", "", "pyAllowFilter", "" };
public static final String[] pRef_25 = new String[] { "", "", "pyPostedWhenReference", "" };
public static final String[] pRef_40 = new String[] { "", "", "pyMessageType", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_46 = new String[] { "", "", "pyPostConfiguredSource", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyDataSourceReference", "" };
public static final String[] pRef_34 = new String[] { "", "", "pyIconType", "" };
public static final String[] pRef_57 = new String[] { "", "", "pyIsSearchEnabled", "" };
public static final String[] pRef_31 = new String[] { "", "", "pyTitleReference", "" };
public static final String[] pRef_9 = new String[] { "", "", "pzSourceDataPageParameters", "", "retrieveTags", "" };
public static final String[] pRef_37 = new String[] { "", "", "pyIconReference", "" };
public static final String[] pRef_6 = new String[] { "", "", "pzSourceDataPageParameters", "", "Context", "" };
public static final String[] pRef_49 = new String[] { "", "", "pyMessageViewReference", "" };
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_54 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL PEGASOCIAL-MESSAGE PYGETPOSTDATASOURCE #20201020T053535.358 GMT", "PegaSocial-Message pyGetPostDataSource", "Pega-Social", "08-06-01", "20201020T053535.358 GMT");
}
