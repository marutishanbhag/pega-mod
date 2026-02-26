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
public class ra_model_pydefautuserdashboard_8999eafa60a2532c9bcc2d54ed6fd818 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyDefautUserDashboard.System_User_Dashboard.Model");
	public ra_model_pydefautuserdashboard_8999eafa60a2532c9bcc2d54ed6fd818(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20190711T131551.723 GMT	Theme-Cosmos:01-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set .pyLabel", source_1, target_1);
{
    pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, "Default dashboard", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set .pyLabel", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2", "Set .pyTemplateLabel", source_2, target_2);
{
    pega.setViaPropRef(".pyTemplateLabel", pRef_2, myStepPage, "Two up", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2", "Set .pyTemplateLabel", source_2, target_2);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set .pyTemplateIcon", source_3, target_3);
{
    pega.setViaPropRef(".pyTemplateIcon", pRef_3, myStepPage, "webwb/pyUserDashboardTemplateTwoUp.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set .pyTemplateIcon", source_3, target_3);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set .pySectionName", source_4, target_4);
{
    pega.setViaPropRef(".pySectionName", pRef_4, myStepPage, "pyUserDashboardTemplateTwoUp", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set .pySectionName", source_4, target_4);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5", "Set .pyOwnerType", source_5, target_5);
{
    pega.setViaPropRef(".pyOwnerType", pRef_5, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5", "Set .pyOwnerType", source_5, target_5);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6", "Set .pyOwner", source_6, target_6);
{
    pega.setViaPropRef(".pyOwner", pRef_6, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6", "Set .pyOwner", source_6, target_6);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7", "Set .pyCategory", source_7, target_7);
{
    pega.setViaPropRef(".pyCategory", pRef_7, myStepPage, tools.getParamValue("UserDashboardCategory"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"7", "Set .pyCategory", source_7, target_7);
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '".pySlots(1).pyWidgets(1)"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ClipboardProperty pz_10 = propertyQuery_8.resolve(tools, myStepPage);
ctxt_page_1 = pz_10 == null ? null : pz_10.getPageValue();
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pySlots(1).pyWidgets(1)", ctxt_page_1);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"8", "Update Page", null, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"8", "Update Page", null, target_context_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '".pySlots(2).pyWidgets(1)"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ClipboardProperty pz_14 = propertyQuery_12.resolve(tools, myStepPage);
ctxt_page_2 = pz_14 == null ? null : pz_14.getPageValue();
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", ".pySlots(2).pyWidgets(1)", ctxt_page_2);
ClipboardPage target_context_2 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"9", "Update Page", null, target_context_2);
if (updatePage_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"9", "Update Page", null, target_context_2);
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '".pySlots(3).pyWidgets(1)"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ClipboardProperty pz_18 = propertyQuery_16.resolve(tools, myStepPage);
ctxt_page_3 = pz_18 == null ? null : pz_18.getPageValue();
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pySlots(3).pyWidgets(1)", ctxt_page_3);
ClipboardPage target_context_3 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10", "Update Page", null, target_context_3);
if (updatePage_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"10", "Update Page", null, target_context_3);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_20 = myStepPage.getProperty("pySlots");
targetProperty_1 = pz_20;
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ctxt_page_4 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_4);
actionProlog(pz_CurrentTraceInfo,"11", "Append and Map to", null, targetProperty_1);
if (appendAndMapTo_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"11", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_2 = null;
ClipboardProperty pz_21 = myStepPage.getProperty("pySlots");
targetProperty_2 = pz_21;
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_5 = null;
ctxt_page_5 = targetProperty_2.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_5);
actionProlog(pz_CurrentTraceInfo,"12", "Append and Map to", null, targetProperty_2);
if (appendAndMapTo_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"12", "Append and Map to", null, targetProperty_2);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_3 = null;
ClipboardProperty pz_22 = myStepPage.getProperty("pySlots");
targetProperty_3 = pz_22;
/* entering new scope */
boolean pop_ctxt_page_6 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_6 = null;
ctxt_page_6 = targetProperty_3.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_6 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_6);
actionProlog(pz_CurrentTraceInfo,"13", "Append and Map to", null, targetProperty_3);
if (appendAndMapTo_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"13", "Append and Map to", null, targetProperty_3);
} finally {
if (pop_ctxt_page_6) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_4 = null;
ClipboardProperty pz_23 = myStepPage.getProperty("pySlots");
targetProperty_4 = pz_23;
/* entering new scope */
boolean pop_ctxt_page_7 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_7 = null;
ctxt_page_7 = targetProperty_4.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_7 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_7);
actionProlog(pz_CurrentTraceInfo,"14", "Append and Map to", null, targetProperty_4);
if (appendAndMapTo_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"14", "Append and Map to", null, targetProperty_4);
} finally {
if (pop_ctxt_page_7) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_5 = null;
ClipboardProperty pz_24 = myStepPage.getProperty("pySlots");
targetProperty_5 = pz_24;
/* entering new scope */
boolean pop_ctxt_page_8 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_8 = null;
ctxt_page_8 = targetProperty_5.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_8 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_8);
actionProlog(pz_CurrentTraceInfo,"15", "Append and Map to", null, targetProperty_5);
if (appendAndMapTo_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"15", "Append and Map to", null, targetProperty_5);
} finally {
if (pop_ctxt_page_8) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_6 = null;
ClipboardProperty pz_25 = myStepPage.getProperty("pySlots");
targetProperty_6 = pz_25;
/* entering new scope */
boolean pop_ctxt_page_9 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_9 = null;
ctxt_page_9 = targetProperty_6.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_9 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_9);
actionProlog(pz_CurrentTraceInfo,"16", "Append and Map to", null, targetProperty_6);
if (appendAndMapTo_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"16", "Append and Map to", null, targetProperty_6);
} finally {
if (pop_ctxt_page_9) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_7 = null;
ClipboardProperty pz_26 = myStepPage.getProperty("pySlots");
targetProperty_7 = pz_26;
/* entering new scope */
boolean pop_ctxt_page_10 = false;
try {
/* push '".pySlots"' to scope TARGET */
ClipboardPage ctxt_page_10 = null;
ctxt_page_10 = targetProperty_7.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_10 = pega.pushScopedStepContext("TARGET", ".pySlots", ctxt_page_10);
actionProlog(pz_CurrentTraceInfo,"17", "Append and Map to", null, targetProperty_7);
if (appendAndMapTo_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"17", "Append and Map to", null, targetProperty_7);
} finally {
if (pop_ctxt_page_10) {
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
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.1", "Set .pySectionName", source_8, target_8);
{
    String pzSourceVar27 = "";
    pzSourceVar27 = "pyWorkListWidget";
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        pega.setViaPropRef(".pySectionName", pRef_4, myStepPage, pzSourceVar27, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.1", "Set .pySectionName", source_8, target_8);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.2", "Set .pyClassName", source_9, target_9);
{
    String pzSourceVar29 = "";
    pzSourceVar29 = "Data-Portal";
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_30, myStepPage, pzSourceVar29, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.2", "Set .pyClassName", source_9, target_9);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.3", "Set .pyWidgetOptionsSectionName", source_10, target_10);
{
    String pzSourceVar32 = "";
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyWidgetOptionsSectionName", pRef_33, myStepPage, pzSourceVar32, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.3", "Set .pyWidgetOptionsSectionName", source_10, target_10);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.4", "Set .pyLabel", source_11, target_11);
{
    String pzSourceVar34 = "";
    pzSourceVar34 = "Worklist";
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar34, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.4", "Set .pyLabel", source_11, target_11);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.5", "Set .pyDescription", source_12, target_12);
{
    String pzSourceVar36 = "";
    pzSourceVar36 = "Worklist";
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_37, myStepPage, pzSourceVar36, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.5", "Set .pyDescription", source_12, target_12);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.6", "Set .pySelected", source_13, target_13);
{
    boolean pzSourceVar39 = false;
    pzSourceVar39 = false;
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_40, myStepPage, pzSourceVar39, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.6", "Set .pySelected", source_13, target_13);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.7", "Set .pyWidgetIsMasked", source_14, target_14);
{
    boolean pzSourceVar42 = false;
    pzSourceVar42 = false;
    PRStackFrame ctxt_frame_23 = null;
    try {
        ctxt_frame_23 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_23.getStepPage();
        pega.setViaPropRef(".pyWidgetIsMasked", pRef_43, myStepPage, pzSourceVar42, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.7", "Set .pyWidgetIsMasked", source_14, target_14);
/* entering new scope */
boolean pop_ctxt_page_11 = false;
try {
/* push '".pyWidget"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_26 = null;
try {
ctxt_frame_26 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_26.getStepPage();
ClipboardPage ctxt_page_11 = null;
ClipboardProperty pz_46 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_25 = null;
try {
ctxt_frame_25 = pega.pushStackFrame(".pyWidget", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_25.getStepPage();
pz_46 = propertyQuery_45.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
} // return to previous step page

ctxt_page_11 = pz_46 == null ? null : pz_46.getPageValue();
pop_ctxt_page_11 = pega.pushScopedStepContext("TARGET", ".pyWidget", ctxt_page_11);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
} // return to previous step page
ClipboardPage target_context_4 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"8.8", "Update Page", null, target_context_4);
if (updatePage_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"8.8", "Update Page", null, target_context_4);
} finally {
if (pop_ctxt_page_11) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.8.1", "Set .pxObjClass", source_15, target_15);
// Change obj class
String pz_50 = "Data-Portal";
ClipboardPage tempPage_1 = tools.createPage(pz_50, "");
ClipboardProperty pz_49 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_27 = null;
try {
ctxt_frame_27 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_27.getStepPage();
pz_49 = propertyQuery_48.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_27);
} // return to previous step page

ClipboardPage targetPage_1 = pz_49.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"8.8.1", "Set .pxObjClass", source_15, target_15);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.8.2", "Set .pxUserDashboardWidgetOptions.pxObjClass", source_16, target_16);
// Change obj class
String pz_54 = "Data-Portal";
ClipboardPage tempPage_2 = tools.createPage(pz_54, "");
ClipboardProperty pz_53 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_28 = null;
try {
ctxt_frame_28 = pega.pushStackFrame(".pxUserDashboardWidgetOptions.pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_28.getStepPage();
pz_53 = propertyQuery_51.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_28);
} // return to previous step page

ClipboardPage targetPage_2 = pz_53.getParentPage();
targetPage_2.putAll(tempPage_2, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_2, false);
actionEpilog(pz_CurrentTraceInfo,"8.8.2", "Set .pxUserDashboardWidgetOptions.pxObjClass", source_16, target_16);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.8.3", "Set .pxUserDashboardWidgetOptions.pySelected", source_17, target_17);
{
    boolean pzSourceVar55 = false;
    pzSourceVar55 = true;
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pega.setViaPropRef(".pxUserDashboardWidgetOptions.pySelected", pRef_56, myStepPage, pzSourceVar55, "s?N", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.8.3", "Set .pxUserDashboardWidgetOptions.pySelected", source_17, target_17);
return CODE_CONTINUE;
}private int updatePage_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.1", "Set .pySectionName", source_18, target_18);
{
    String pzSourceVar58 = "";
    pzSourceVar58 = "pyPulseWidget";
    PRStackFrame ctxt_frame_31 = null;
    try {
        ctxt_frame_31 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_31.getStepPage();
        pega.setViaPropRef(".pySectionName", pRef_4, myStepPage, pzSourceVar58, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_31);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.1", "Set .pySectionName", source_18, target_18);
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.2", "Set .pyClassName", source_19, target_19);
{
    String pzSourceVar60 = "";
    pzSourceVar60 = "Data-Portal";
    PRStackFrame ctxt_frame_33 = null;
    try {
        ctxt_frame_33 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_33.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_30, myStepPage, pzSourceVar60, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.2", "Set .pyClassName", source_19, target_19);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.3", "Set .pyWidgetOptionsSectionName", source_20, target_20);
{
    String pzSourceVar62 = "";
    PRStackFrame ctxt_frame_35 = null;
    try {
        ctxt_frame_35 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_35.getStepPage();
        pega.setViaPropRef(".pyWidgetOptionsSectionName", pRef_33, myStepPage, pzSourceVar62, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_35);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.3", "Set .pyWidgetOptionsSectionName", source_20, target_20);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.4", "Set .pyLabel", source_21, target_21);
{
    String pzSourceVar63 = "";
    pzSourceVar63 = "Pulse";
    PRStackFrame ctxt_frame_37 = null;
    try {
        ctxt_frame_37 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_37.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar63, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.4", "Set .pyLabel", source_21, target_21);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.5", "Set .pyDescription", source_22, target_22);
{
    String pzSourceVar65 = "";
    pzSourceVar65 = "Pulse";
    PRStackFrame ctxt_frame_39 = null;
    try {
        ctxt_frame_39 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_39.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_37, myStepPage, pzSourceVar65, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.5", "Set .pyDescription", source_22, target_22);
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.6", "Set .pySelected", source_23, target_23);
{
    boolean pzSourceVar67 = false;
    pzSourceVar67 = false;
    PRStackFrame ctxt_frame_41 = null;
    try {
        ctxt_frame_41 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_41.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_40, myStepPage, pzSourceVar67, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_41);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.6", "Set .pySelected", source_23, target_23);
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.7", "Set .pyWidgetIsMasked", source_24, target_24);
{
    boolean pzSourceVar69 = false;
    pzSourceVar69 = false;
    PRStackFrame ctxt_frame_43 = null;
    try {
        ctxt_frame_43 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_43.getStepPage();
        pega.setViaPropRef(".pyWidgetIsMasked", pRef_43, myStepPage, pzSourceVar69, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_43);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.7", "Set .pyWidgetIsMasked", source_24, target_24);
/* entering new scope */
boolean pop_ctxt_page_12 = false;
try {
/* push '".pyWidget"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_46 = null;
try {
ctxt_frame_46 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_46.getStepPage();
ClipboardPage ctxt_page_12 = null;
ClipboardProperty pz_71 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_45 = null;
try {
ctxt_frame_45 = pega.pushStackFrame(".pyWidget", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_45.getStepPage();
pz_71 = propertyQuery_45.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_45);
} // return to previous step page

ctxt_page_12 = pz_71 == null ? null : pz_71.getPageValue();
pop_ctxt_page_12 = pega.pushScopedStepContext("TARGET", ".pyWidget", ctxt_page_12);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_46);
} // return to previous step page
ClipboardPage target_context_5 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"9.8", "Update Page", null, target_context_5);
if (updatePage_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"9.8", "Update Page", null, target_context_5);
} finally {
if (pop_ctxt_page_12) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.8.1", "Set .pxObjClass", source_25, target_25);
// Change obj class
String pz_74 = "Data-Portal";
ClipboardPage tempPage_3 = tools.createPage(pz_74, "");
ClipboardProperty pz_73 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_47 = null;
try {
ctxt_frame_47 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_47.getStepPage();
pz_73 = propertyQuery_48.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_47);
} // return to previous step page

ClipboardPage targetPage_3 = pz_73.getParentPage();
targetPage_3.putAll(tempPage_3, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_3, false);
actionEpilog(pz_CurrentTraceInfo,"9.8.1", "Set .pxObjClass", source_25, target_25);
return CODE_CONTINUE;
}private int updatePage_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_26 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.1", "Set .pySectionName", source_26, target_26);
{
    String pzSourceVar75 = "";
    pzSourceVar75 = "pyFollowingWidget";
    PRStackFrame ctxt_frame_48 = null;
    try {
        ctxt_frame_48 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_48.getStepPage();
        pega.setViaPropRef(".pySectionName", pRef_4, myStepPage, pzSourceVar75, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_48);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.1", "Set .pySectionName", source_26, target_26);
ClipboardPage source_27 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.2", "Set .pyClassName", source_27, target_27);
{
    String pzSourceVar77 = "";
    pzSourceVar77 = "Data-Portal";
    PRStackFrame ctxt_frame_50 = null;
    try {
        ctxt_frame_50 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_50.getStepPage();
        pega.setViaPropRef(".pyClassName", pRef_30, myStepPage, pzSourceVar77, "siN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_50);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.2", "Set .pyClassName", source_27, target_27);
ClipboardPage source_28 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.3", "Set .pyWidgetOptionsSectionName", source_28, target_28);
{
    String pzSourceVar79 = "";
    PRStackFrame ctxt_frame_52 = null;
    try {
        ctxt_frame_52 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_52.getStepPage();
        pega.setViaPropRef(".pyWidgetOptionsSectionName", pRef_33, myStepPage, pzSourceVar79, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_52);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.3", "Set .pyWidgetOptionsSectionName", source_28, target_28);
ClipboardPage source_29 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.4", "Set .pyLabel", source_29, target_29);
{
    String pzSourceVar80 = "";
    pzSourceVar80 = "Follow";
    PRStackFrame ctxt_frame_54 = null;
    try {
        ctxt_frame_54 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_54.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar80, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_54);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.4", "Set .pyLabel", source_29, target_29);
ClipboardPage source_30 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.5", "Set .pyDescription", source_30, target_30);
{
    String pzSourceVar82 = "";
    pzSourceVar82 = "Follow";
    PRStackFrame ctxt_frame_56 = null;
    try {
        ctxt_frame_56 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_56.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_37, myStepPage, pzSourceVar82, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_56);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.5", "Set .pyDescription", source_30, target_30);
ClipboardPage source_31 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.6", "Set .pySelected", source_31, target_31);
{
    boolean pzSourceVar84 = false;
    pzSourceVar84 = false;
    PRStackFrame ctxt_frame_58 = null;
    try {
        ctxt_frame_58 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_58.getStepPage();
        pega.setViaPropRef(".pySelected", pRef_40, myStepPage, pzSourceVar84, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_58);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.6", "Set .pySelected", source_31, target_31);
ClipboardPage source_32 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.7", "Set .pyWidgetIsMasked", source_32, target_32);
{
    boolean pzSourceVar86 = false;
    pzSourceVar86 = false;
    PRStackFrame ctxt_frame_60 = null;
    try {
        ctxt_frame_60 = pega.pushStackFrame("System-User-Dashboard-Widget", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_60.getStepPage();
        pega.setViaPropRef(".pyWidgetIsMasked", pRef_43, myStepPage, pzSourceVar86, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_60);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.7", "Set .pyWidgetIsMasked", source_32, target_32);
/* entering new scope */
boolean pop_ctxt_page_13 = false;
try {
/* push '".pyWidget"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_63 = null;
try {
ctxt_frame_63 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_63.getStepPage();
ClipboardPage ctxt_page_13 = null;
ClipboardProperty pz_88 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_62 = null;
try {
ctxt_frame_62 = pega.pushStackFrame(".pyWidget", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_62.getStepPage();
pz_88 = propertyQuery_45.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_62);
} // return to previous step page

ctxt_page_13 = pz_88 == null ? null : pz_88.getPageValue();
pop_ctxt_page_13 = pega.pushScopedStepContext("TARGET", ".pyWidget", ctxt_page_13);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_63);
} // return to previous step page
ClipboardPage target_context_6 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10.8", "Update Page", null, target_context_6);
if (updatePage_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"10.8", "Update Page", null, target_context_6);
} finally {
if (pop_ctxt_page_13) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int updatePage_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_33 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.8.1", "Set .pxObjClass", source_33, target_33);
// Change obj class
String pz_91 = "Data-Portal";
ClipboardPage tempPage_4 = tools.createPage(pz_91, "");
ClipboardProperty pz_90 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_64 = null;
try {
ctxt_frame_64 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_64.getStepPage();
pz_90 = propertyQuery_48.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_64);
} // return to previous step page

ClipboardPage targetPage_4 = pz_90.getParentPage();
targetPage_4.putAll(tempPage_4, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_4, false);
actionEpilog(pz_CurrentTraceInfo,"10.8.1", "Set .pxObjClass", source_33, target_33);
return CODE_CONTINUE;
}private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_34 =null;
ClipboardPage target_34 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1", "Set .pyLabel", source_34, target_34);
{
    String pzSourceVar92 = "";
    pzSourceVar92 = "Slot 4";
    PRStackFrame ctxt_frame_65 = null;
    try {
        ctxt_frame_65 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_65.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar92, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_65);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1", "Set .pyLabel", source_34, target_34);
return CODE_CONTINUE;
}private int appendAndMapTo_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_35 =null;
ClipboardPage target_35 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12.1", "Set .pyLabel", source_35, target_35);
{
    String pzSourceVar94 = "";
    pzSourceVar94 = "Slot 5";
    PRStackFrame ctxt_frame_67 = null;
    try {
        ctxt_frame_67 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_67.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar94, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_67);
    }
}

actionEpilog(pz_CurrentTraceInfo,"12.1", "Set .pyLabel", source_35, target_35);
return CODE_CONTINUE;
}private int appendAndMapTo_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_36 =null;
ClipboardPage target_36 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.1", "Set .pyLabel", source_36, target_36);
{
    String pzSourceVar96 = "";
    pzSourceVar96 = "Slot 6";
    PRStackFrame ctxt_frame_69 = null;
    try {
        ctxt_frame_69 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_69.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar96, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_69);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.1", "Set .pyLabel", source_36, target_36);
return CODE_CONTINUE;
}private int appendAndMapTo_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_37 =null;
ClipboardPage target_37 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"14.1", "Set .pyLabel", source_37, target_37);
{
    String pzSourceVar98 = "";
    pzSourceVar98 = "Slot 7";
    PRStackFrame ctxt_frame_71 = null;
    try {
        ctxt_frame_71 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_71.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar98, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_71);
    }
}

actionEpilog(pz_CurrentTraceInfo,"14.1", "Set .pyLabel", source_37, target_37);
return CODE_CONTINUE;
}private int appendAndMapTo_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_38 =null;
ClipboardPage target_38 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"15.1", "Set .pyLabel", source_38, target_38);
{
    String pzSourceVar100 = "";
    pzSourceVar100 = "Slot 8";
    PRStackFrame ctxt_frame_73 = null;
    try {
        ctxt_frame_73 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_73.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar100, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_73);
    }
}

actionEpilog(pz_CurrentTraceInfo,"15.1", "Set .pyLabel", source_38, target_38);
return CODE_CONTINUE;
}private int appendAndMapTo_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_39 =null;
ClipboardPage target_39 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"16.1", "Set .pyLabel", source_39, target_39);
{
    String pzSourceVar102 = "";
    pzSourceVar102 = "Slot 9";
    PRStackFrame ctxt_frame_75 = null;
    try {
        ctxt_frame_75 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_75.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar102, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_75);
    }
}

actionEpilog(pz_CurrentTraceInfo,"16.1", "Set .pyLabel", source_39, target_39);
return CODE_CONTINUE;
}private int appendAndMapTo_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_40 =null;
ClipboardPage target_40 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"17.1", "Set .pyLabel", source_40, target_40);
{
    String pzSourceVar104 = "";
    pzSourceVar104 = "Slot 10";
    PRStackFrame ctxt_frame_77 = null;
    try {
        ctxt_frame_77 = pega.pushStackFrame("System-User-Dashboard-Slot", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_77.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, pzSourceVar104, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_77);
    }
}

actionEpilog(pz_CurrentTraceInfo,"17.1", "Set .pyLabel", source_40, target_40);
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
	"Rule-Obj-Model:PYDEFAUTUSERDASHBOARD"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYDEFAUTUSERDASHBOARD","Rule-Obj-Model","SYSTEM-USER-DASHBOARD",false,"","Theme-Cosmos","01-01-01","RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20190711T131551.723 GMT","!PYDEFAUTUSERDASHBOARD",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1193373392)
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
//	RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20190711T131551.723 GMT:20190711T131551.723 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "43cd38c8e49e3b1305946067f4d2d97b";
	}

	public String getDefinitionAppliesToClass() {
		return "System-User-Dashboard";
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

public static final String[] pRef_13 = new String[] { "", "", "pySlots", "2", "pyWidgets", "1" };
public static final String[] pRef_7 = new String[] { "", "", "pyCategory", "" };
public static final String[] pRef_40 = new String[] { "", "", "pySelected", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_4 = new String[] { "", "", "pySectionName", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyOwner", "" };
public static final String[] pRef_17 = new String[] { "", "", "pySlots", "3", "pyWidgets", "1" };
public static final String[] pRef_43 = new String[] { "", "", "pyWidgetIsMasked", "" };
public static final String[] pRef_56 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pySelected", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyOwnerType", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_33 = new String[] { "", "", "pyWidgetOptionsSectionName", "" };
public static final String[] pRef_37 = new String[] { "", "", "pyDescription", "" };
public static final String[] pRef_52 = new String[] { "", "", "pxUserDashboardWidgetOptions", "", "pxObjClass", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyTemplateLabel", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyTemplateIcon", "" };
public static final String[] pRef_9 = new String[] { "", "", "pySlots", "1", "pyWidgets", "1" };
private static final PropertyQuery propertyQuery_45 = FUAUtil.createQueryBuilder().page("pyWidget").buildPropertyQuery();
private static final PropertyQuery propertyQuery_16 = FUAUtil.createQueryBuilder().pageList("pySlots", 3).pageList("pyWidgets", 1).buildPropertyQuery();
private static final PropertyQuery propertyQuery_8 = FUAUtil.createQueryBuilder().pageList("pySlots", 1).pageList("pyWidgets", 1).buildPropertyQuery();
private static final PropertyQuery propertyQuery_48 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_51 = FUAUtil.createQueryBuilder().page("pxUserDashboardWidgetOptions").scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_12 = FUAUtil.createQueryBuilder().pageList("pySlots", 2).pageList("pyWidgets", 1).buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL SYSTEM-USER-DASHBOARD PYDEFAUTUSERDASHBOARD #20190711T131551.723 GMT", "System-User-Dashboard pyDefautUserDashboard", "Theme-Cosmos", "01-01-01", "20190711T131551.723 GMT");
}
