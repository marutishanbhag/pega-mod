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
public class ra_model_pygetpostdatasource_4c8721e583dd7a2887419562137be1e1 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyGetPostDataSource.Work_Cover_Task.Model");
	public ra_model_pygetpostdatasource_4c8721e583dd7a2887419562137be1e1(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL WORK-COVER-TASK PYGETPOSTDATASOURCE #20180907T122403.802 GMT	Pega-Social:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
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
    pzSourceVar2 = "D_pxTasks";
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
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pzSourceDataPageParameters.AssignedTo", source_3, target_4);
{
    String pzSourceVar8 = "";
    pzSourceVar8 = scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("OperatorID", "Data-Admin-Operator-ID"), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pzSourceDataPageParameters.AssignedTo", pRef_10, myStepPage, pzSourceVar8, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pzSourceDataPageParameters.AssignedTo", source_3, target_4);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.4", "Set .pzSourceDataPageParameters.CreatedBy", source_4, target_5);
{
    String pzSourceVar12 = "";
    pzSourceVar12 = scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("OperatorID", "Data-Admin-Operator-ID"), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pega.setViaPropRef(".pzSourceDataPageParameters.CreatedBy", pRef_13, myStepPage, pzSourceVar12, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.4", "Set .pzSourceDataPageParameters.CreatedBy", source_4, target_5);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.5", "Set .pzSourceDataPageParameters.Application", source_5, target_6);
{
    String pzSourceVar15 = "";
    pzSourceVar15 = scalarValueQuery_16.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        pega.setViaPropRef(".pzSourceDataPageParameters.Application", pRef_17, myStepPage, pzSourceVar15, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.5", "Set .pzSourceDataPageParameters.Application", source_5, target_6);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.6", "Set .pyLabel", source_6, target_7);
{
    String pzSourceVar19 = "";
    pzSourceVar19 = ((tools.getParamValue("Label").equals("")) ? "pyTasks" : tools.getParamValue("Label"));
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_20, myStepPage, pzSourceVar19, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.6", "Set .pyLabel", source_6, target_7);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.7", "Set .pyAllowFilter", source_7, target_8);
{
    String pzSourceVar22 = "";
    pzSourceVar22 = "true";
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyAllowFilter", pRef_23, myStepPage, pzSourceVar22, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.7", "Set .pyAllowFilter", source_7, target_8);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.8", "Set .pyClassName", source_8, target_9);
{
    String pzSourceVar25 = "";
    pzSourceVar25 = scalarValueQuery_26.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT);
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_27, myStepPage, pzSourceVar25, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.8", "Set .pyClassName", source_8, target_9);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.9", "Set .pySelected", source_9, target_10);
{
    boolean pzSourceVar29 = false;
    pzSourceVar29 = true;
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_30, myStepPage, pzSourceVar29, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.9", "Set .pySelected", source_9, target_10);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10", "Set .pyPostedWhenReference", source_10, target_11);
{
    String pzSourceVar32 = "";
    pzSourceVar32 = ".pxCreateDateTime";
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pyPostedWhenReference", pRef_33, myStepPage, pzSourceVar32, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.10", "Set .pyPostedWhenReference", source_10, target_11);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.11", "Set .pyTitleType", source_11, target_12);
{
    String pzSourceVar35 = "";
    pzSourceVar35 = "section";
    PRStackFrame ctxt_frame_23 = null;
    try {
        ctxt_frame_23 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_23.getStepPage();
        pega.setViaPropRef(".pyTitleType", pRef_36, myStepPage, pzSourceVar35, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.11", "Set .pyTitleType", source_11, target_12);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.12", "Set .pyTitleReference", source_12, target_13);
{
    String pzSourceVar38 = "";
    pzSourceVar38 = "pyPostTitleWithContext";
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyTitleReference", pRef_39, myStepPage, pzSourceVar38, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.12", "Set .pyTitleReference", source_12, target_13);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.13", "Set .pyIconType", source_13, target_14);
{
    String pzSourceVar41 = "";
    pzSourceVar41 = "iconclass";
    PRStackFrame ctxt_frame_27 = null;
    try {
        ctxt_frame_27 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_27.getStepPage();
        pega.setViaPropRef(".pyIconType", pRef_42, myStepPage, pzSourceVar41, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_27);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.13", "Set .pyIconType", source_13, target_14);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.14", "Set .pyIconReference", source_14, target_15);
{
    String pzSourceVar44 = "";
    pzSourceVar44 = "pi pi-clipboard-check";
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pega.setViaPropRef(".pyIconReference", pRef_45, myStepPage, pzSourceVar44, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.14", "Set .pyIconReference", source_14, target_15);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.15", "Set .pyMessageType", source_15, target_16);
{
    String pzSourceVar47 = "";
    pzSourceVar47 = "section";
    PRStackFrame ctxt_frame_31 = null;
    try {
        ctxt_frame_31 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_31.getStepPage();
        pega.setViaPropRef(".pyMessageType", pRef_48, myStepPage, pzSourceVar47, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_31);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.15", "Set .pyMessageType", source_15, target_16);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.16", "Set .pyMessageReference", source_16, target_17);
{
    String pzSourceVar50 = "";
    pzSourceVar50 = "pyPostDetails";
    PRStackFrame ctxt_frame_33 = null;
    try {
        ctxt_frame_33 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_33.getStepPage();
        pega.setViaPropRef(".pyMessageReference", pRef_51, myStepPage, pzSourceVar50, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.16", "Set .pyMessageReference", source_16, target_17);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.17", "Set .pyPostConfiguredSource", source_17, target_18);
{
    boolean pzSourceVar53 = false;
    pzSourceVar53 = true;
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pega.setViaPropRef(".pyPostConfiguredSource", pRef_54, myStepPage, pzSourceVar53, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.17", "Set .pyPostConfiguredSource", source_17, target_18);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.18", "Set .pyIsCommentingEnabled", source_18, target_19);
{
    boolean pzSourceVar56 = false;
    pzSourceVar56 = true;
    PRStackFrame ctxt_frame_37 = null;
    try {
        ctxt_frame_37 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_37.getStepPage();
        pega.setViaPropRef(".pyIsCommentingEnabled", pRef_57, myStepPage, pzSourceVar56, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.18", "Set .pyIsCommentingEnabled", source_18, target_19);
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.19", "Set .pyCommentContext", source_19, target_20);
{
    String pzSourceVar59 = "";
    pzSourceVar59 = ".pzInsKey";
    PRStackFrame ctxt_frame_39 = null;
    try {
        ctxt_frame_39 = pega.pushStackFrame("Embed-Feed-DataSource", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_39.getStepPage();
        pega.setViaPropRef(".pyCommentContext", pRef_60, myStepPage, pzSourceVar59, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.19", "Set .pyCommentContext", source_19, target_20);
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
		new DependentRuleInfo("PYGETPOSTDATASOURCE","Rule-Obj-Model","WORK-COVER-TASK",false,"","Pega-Social","08-02-01","RULE-OBJ-MODEL WORK-COVER-TASK PYGETPOSTDATASOURCE #20180907T122403.802 GMT","!PYGETPOSTDATASOURCE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2010346412)
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
//	RULE-OBJ-MODEL WORK-COVER-TASK PYGETPOSTDATASOURCE #20180907T122403.802 GMT:20181008T101056.036 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "2fe51ff80381554ee1c40a4e4a35663c";
	}

	public String getDefinitionAppliesToClass() {
		return "Work-Cover-Task";
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

public static final String[] pRef_30 = new String[] { "", "", "pySelected", "" };
public static final String[] pRef_27 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_36 = new String[] { "", "", "pyTitleType", "" };
public static final String[] pRef_51 = new String[] { "", "", "pyMessageReference", "" };
public static final String[] pRef_23 = new String[] { "", "", "pyAllowFilter", "" };
public static final String[] pRef_57 = new String[] { "", "", "pyIsCommentingEnabled", "" };
public static final String[] pRef_60 = new String[] { "", "", "pyCommentContext", "" };
public static final String[] pRef_33 = new String[] { "", "", "pyPostedWhenReference", "" };
public static final String[] pRef_48 = new String[] { "", "", "pyMessageType", "" };
public static final String[] pRef_20 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_54 = new String[] { "", "", "pyPostConfiguredSource", "" };
public static final String[] pRef_13 = new String[] { "", "", "pzSourceDataPageParameters", "", "CreatedBy", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyDataSourceReference", "" };
public static final String[] pRef_42 = new String[] { "", "", "pyIconType", "" };
public static final String[] pRef_39 = new String[] { "", "", "pyTitleReference", "" };
public static final String[] pRef_45 = new String[] { "", "", "pyIconReference", "" };
public static final String[] pRef_6 = new String[] { "", "", "pzSourceDataPageParameters", "", "Context", "" };
public static final String[] pRef_10 = new String[] { "", "", "pzSourceDataPageParameters", "", "AssignedTo", "" };
public static final String[] pRef_17 = new String[] { "", "", "pzSourceDataPageParameters", "", "Application", "" };
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyUserIdentifier").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL WORK-COVER-TASK PYGETPOSTDATASOURCE #20180907T122403.802 GMT", "Work-Cover-Task pyGetPostDataSource", "Pega-Social", "08-02-01", "20181008T101056.036 GMT");
}
