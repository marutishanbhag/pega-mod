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
public class ra_model_pzlanguagelist_b611deec6676bbb577636a204ab86bda extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzLanguageList.Embed_Language.Model");
	public ra_model_pzlanguagelist_b611deec6676bbb577636a204ab86bda(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL EMBED-LANGUAGE PZLANGUAGELIST #20230718T091811.389 GMT	Pega-ProCom:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ClipboardProperty pz_1 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_1 = pz_1 == null ? null : pz_1.getPageValue();
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_1);
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
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_2 = null;
ClipboardProperty pz_3 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_2 = pz_3 == null ? null : pz_3.getPageValue();
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_2);
ClipboardPage target_context_2 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "Update Page", null, target_context_2);
if (updatePage_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "Update Page", null, target_context_2);
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_3 = null;
ClipboardProperty pz_5 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_3 = pz_5 == null ? null : pz_5.getPageValue();
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_3);
ClipboardPage target_context_3 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "Update Page", null, target_context_3);
if (updatePage_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "Update Page", null, target_context_3);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_4 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_4 = null;
ClipboardProperty pz_7 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_4 = pz_7 == null ? null : pz_7.getPageValue();
pop_ctxt_page_4 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_4);
ClipboardPage target_context_4 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "Update Page", null, target_context_4);
if (updatePage_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Update Page", null, target_context_4);
} finally {
if (pop_ctxt_page_4) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_5 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_5 = null;
ClipboardProperty pz_9 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_5 = pz_9 == null ? null : pz_9.getPageValue();
pop_ctxt_page_5 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_5);
ClipboardPage target_context_5 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "Update Page", null, target_context_5);
if (updatePage_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "Update Page", null, target_context_5);
} finally {
if (pop_ctxt_page_5) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_6 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_6 = null;
ClipboardProperty pz_11 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_6 = pz_11 == null ? null : pz_11.getPageValue();
pop_ctxt_page_6 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_6);
ClipboardPage target_context_6 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6", "Update Page", null, target_context_6);
if (updatePage_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"6", "Update Page", null, target_context_6);
} finally {
if (pop_ctxt_page_6) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_7 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_7 = null;
ClipboardProperty pz_13 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_7 = pz_13 == null ? null : pz_13.getPageValue();
pop_ctxt_page_7 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_7);
ClipboardPage target_context_7 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7", "Update Page", null, target_context_7);
if (updatePage_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"7", "Update Page", null, target_context_7);
} finally {
if (pop_ctxt_page_7) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_8 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_8 = null;
ClipboardProperty pz_15 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_8 = pz_15 == null ? null : pz_15.getPageValue();
pop_ctxt_page_8 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_8);
ClipboardPage target_context_8 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"8", "Update Page", null, target_context_8);
if (updatePage_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"8", "Update Page", null, target_context_8);
} finally {
if (pop_ctxt_page_8) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_9 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_9 = null;
ClipboardProperty pz_17 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_9 = pz_17 == null ? null : pz_17.getPageValue();
pop_ctxt_page_9 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_9);
ClipboardPage target_context_9 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"9", "Update Page", null, target_context_9);
if (updatePage_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"9", "Update Page", null, target_context_9);
} finally {
if (pop_ctxt_page_9) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_10 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_10 = null;
ClipboardProperty pz_19 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_10 = pz_19 == null ? null : pz_19.getPageValue();
pop_ctxt_page_10 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_10);
ClipboardPage target_context_10 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"10", "Update Page", null, target_context_10);
if (updatePage_10(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"10", "Update Page", null, target_context_10);
} finally {
if (pop_ctxt_page_10) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_11 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_11 = null;
ClipboardProperty pz_21 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_11 = pz_21 == null ? null : pz_21.getPageValue();
pop_ctxt_page_11 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_11);
ClipboardPage target_context_11 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"11", "Update Page", null, target_context_11);
if (updatePage_11(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"11", "Update Page", null, target_context_11);
} finally {
if (pop_ctxt_page_11) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_12 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_12 = null;
ClipboardProperty pz_23 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_12 = pz_23 == null ? null : pz_23.getPageValue();
pop_ctxt_page_12 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_12);
ClipboardPage target_context_12 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"12", "Update Page", null, target_context_12);
if (updatePage_12(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"12", "Update Page", null, target_context_12);
} finally {
if (pop_ctxt_page_12) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_13 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_13 = null;
ClipboardProperty pz_25 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_13 = pz_25 == null ? null : pz_25.getPageValue();
pop_ctxt_page_13 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_13);
ClipboardPage target_context_13 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"13", "Update Page", null, target_context_13);
if (updatePage_13(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"13", "Update Page", null, target_context_13);
} finally {
if (pop_ctxt_page_13) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_14 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_14 = null;
ClipboardProperty pz_27 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_14 = pz_27 == null ? null : pz_27.getPageValue();
pop_ctxt_page_14 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_14);
ClipboardPage target_context_14 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"14", "Update Page", null, target_context_14);
if (updatePage_14(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"14", "Update Page", null, target_context_14);
} finally {
if (pop_ctxt_page_14) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_15 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_15 = null;
ClipboardProperty pz_29 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_15 = pz_29 == null ? null : pz_29.getPageValue();
pop_ctxt_page_15 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_15);
ClipboardPage target_context_15 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"15", "Update Page", null, target_context_15);
if (updatePage_15(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"15", "Update Page", null, target_context_15);
} finally {
if (pop_ctxt_page_15) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_16 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_16 = null;
ClipboardProperty pz_31 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_16 = pz_31 == null ? null : pz_31.getPageValue();
pop_ctxt_page_16 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_16);
ClipboardPage target_context_16 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"16", "Update Page", null, target_context_16);
if (updatePage_16(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"16", "Update Page", null, target_context_16);
} finally {
if (pop_ctxt_page_16) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_17 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_17 = null;
ClipboardProperty pz_33 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_17 = pz_33 == null ? null : pz_33.getPageValue();
pop_ctxt_page_17 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_17);
ClipboardPage target_context_17 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"17", "Update Page", null, target_context_17);
if (updatePage_17(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"17", "Update Page", null, target_context_17);
} finally {
if (pop_ctxt_page_17) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_18 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_18 = null;
ClipboardProperty pz_35 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_18 = pz_35 == null ? null : pz_35.getPageValue();
pop_ctxt_page_18 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_18);
ClipboardPage target_context_18 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"18", "Update Page", null, target_context_18);
if (updatePage_18(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"18", "Update Page", null, target_context_18);
} finally {
if (pop_ctxt_page_18) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_19 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_19 = null;
ClipboardProperty pz_37 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_19 = pz_37 == null ? null : pz_37.getPageValue();
pop_ctxt_page_19 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_19);
ClipboardPage target_context_19 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"19", "Update Page", null, target_context_19);
if (updatePage_19(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"19", "Update Page", null, target_context_19);
} finally {
if (pop_ctxt_page_19) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_20 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_20 = null;
ClipboardProperty pz_39 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_20 = pz_39 == null ? null : pz_39.getPageValue();
pop_ctxt_page_20 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_20);
ClipboardPage target_context_20 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"20", "Update Page", null, target_context_20);
if (updatePage_20(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"20", "Update Page", null, target_context_20);
} finally {
if (pop_ctxt_page_20) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_21 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_21 = null;
ClipboardProperty pz_41 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_21 = pz_41 == null ? null : pz_41.getPageValue();
pop_ctxt_page_21 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_21);
ClipboardPage target_context_21 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"21", "Update Page", null, target_context_21);
if (updatePage_21(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"21", "Update Page", null, target_context_21);
} finally {
if (pop_ctxt_page_21) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_22 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_22 = null;
ClipboardProperty pz_43 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_22 = pz_43 == null ? null : pz_43.getPageValue();
pop_ctxt_page_22 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_22);
ClipboardPage target_context_22 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"22", "Update Page", null, target_context_22);
if (updatePage_22(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"22", "Update Page", null, target_context_22);
} finally {
if (pop_ctxt_page_22) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_23 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_23 = null;
ClipboardProperty pz_45 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_23 = pz_45 == null ? null : pz_45.getPageValue();
pop_ctxt_page_23 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_23);
ClipboardPage target_context_23 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"23", "Update Page", null, target_context_23);
if (updatePage_23(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"23", "Update Page", null, target_context_23);
} finally {
if (pop_ctxt_page_23) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_24 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_24 = null;
ClipboardProperty pz_47 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_24 = pz_47 == null ? null : pz_47.getPageValue();
pop_ctxt_page_24 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_24);
ClipboardPage target_context_24 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"24", "Update Page", null, target_context_24);
if (updatePage_24(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"24", "Update Page", null, target_context_24);
} finally {
if (pop_ctxt_page_24) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_25 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_25 = null;
ClipboardProperty pz_49 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_25 = pz_49 == null ? null : pz_49.getPageValue();
pop_ctxt_page_25 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_25);
ClipboardPage target_context_25 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"25", "Update Page", null, target_context_25);
if (updatePage_25(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"25", "Update Page", null, target_context_25);
} finally {
if (pop_ctxt_page_25) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_26 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_26 = null;
ClipboardProperty pz_51 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_26 = pz_51 == null ? null : pz_51.getPageValue();
pop_ctxt_page_26 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_26);
ClipboardPage target_context_26 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"26", "Update Page", null, target_context_26);
if (updatePage_26(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"26", "Update Page", null, target_context_26);
} finally {
if (pop_ctxt_page_26) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_27 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_27 = null;
ClipboardProperty pz_53 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_27 = pz_53 == null ? null : pz_53.getPageValue();
pop_ctxt_page_27 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_27);
ClipboardPage target_context_27 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"27", "Update Page", null, target_context_27);
if (updatePage_27(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"27", "Update Page", null, target_context_27);
} finally {
if (pop_ctxt_page_27) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_28 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_28 = null;
ClipboardProperty pz_55 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_28 = pz_55 == null ? null : pz_55.getPageValue();
pop_ctxt_page_28 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_28);
ClipboardPage target_context_28 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"28", "Update Page", null, target_context_28);
if (updatePage_28(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"28", "Update Page", null, target_context_28);
} finally {
if (pop_ctxt_page_28) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_29 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_29 = null;
ClipboardProperty pz_57 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_29 = pz_57 == null ? null : pz_57.getPageValue();
pop_ctxt_page_29 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_29);
ClipboardPage target_context_29 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"29", "Update Page", null, target_context_29);
if (updatePage_29(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"29", "Update Page", null, target_context_29);
} finally {
if (pop_ctxt_page_29) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_30 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_30 = null;
ClipboardProperty pz_59 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_30 = pz_59 == null ? null : pz_59.getPageValue();
pop_ctxt_page_30 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_30);
ClipboardPage target_context_30 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"30", "Update Page", null, target_context_30);
if (updatePage_30(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"30", "Update Page", null, target_context_30);
} finally {
if (pop_ctxt_page_30) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_31 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_31 = null;
ClipboardProperty pz_61 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_31 = pz_61 == null ? null : pz_61.getPageValue();
pop_ctxt_page_31 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_31);
ClipboardPage target_context_31 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"31", "Update Page", null, target_context_31);
if (updatePage_31(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"31", "Update Page", null, target_context_31);
} finally {
if (pop_ctxt_page_31) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_32 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_32 = null;
ClipboardProperty pz_63 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_32 = pz_63 == null ? null : pz_63.getPageValue();
pop_ctxt_page_32 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_32);
ClipboardPage target_context_32 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"32", "Update Page", null, target_context_32);
if (updatePage_32(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"32", "Update Page", null, target_context_32);
} finally {
if (pop_ctxt_page_32) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_33 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_33 = null;
ClipboardProperty pz_65 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_33 = pz_65 == null ? null : pz_65.getPageValue();
pop_ctxt_page_33 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_33);
ClipboardPage target_context_33 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"33", "Update Page", null, target_context_33);
if (updatePage_33(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"33", "Update Page", null, target_context_33);
} finally {
if (pop_ctxt_page_33) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_34 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_34 = null;
ClipboardProperty pz_67 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_34 = pz_67 == null ? null : pz_67.getPageValue();
pop_ctxt_page_34 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_34);
ClipboardPage target_context_34 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"34", "Update Page", null, target_context_34);
if (updatePage_34(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"34", "Update Page", null, target_context_34);
} finally {
if (pop_ctxt_page_34) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_35 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_35 = null;
ClipboardProperty pz_69 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_35 = pz_69 == null ? null : pz_69.getPageValue();
pop_ctxt_page_35 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_35);
ClipboardPage target_context_35 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"35", "Update Page", null, target_context_35);
if (updatePage_35(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"35", "Update Page", null, target_context_35);
} finally {
if (pop_ctxt_page_35) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_36 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_36 = null;
ClipboardProperty pz_71 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_36 = pz_71 == null ? null : pz_71.getPageValue();
pop_ctxt_page_36 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_36);
ClipboardPage target_context_36 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"36", "Update Page", null, target_context_36);
if (updatePage_36(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"36", "Update Page", null, target_context_36);
} finally {
if (pop_ctxt_page_36) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_37 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_37 = null;
ClipboardProperty pz_73 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_37 = pz_73 == null ? null : pz_73.getPageValue();
pop_ctxt_page_37 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_37);
ClipboardPage target_context_37 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"37", "Update Page", null, target_context_37);
if (updatePage_37(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"37", "Update Page", null, target_context_37);
} finally {
if (pop_ctxt_page_37) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_38 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_38 = null;
ClipboardProperty pz_75 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_38 = pz_75 == null ? null : pz_75.getPageValue();
pop_ctxt_page_38 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_38);
ClipboardPage target_context_38 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"38", "Update Page", null, target_context_38);
if (updatePage_38(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"38", "Update Page", null, target_context_38);
} finally {
if (pop_ctxt_page_38) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_39 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_39 = null;
ClipboardProperty pz_77 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_39 = pz_77 == null ? null : pz_77.getPageValue();
pop_ctxt_page_39 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_39);
ClipboardPage target_context_39 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"39", "Update Page", null, target_context_39);
if (updatePage_39(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"39", "Update Page", null, target_context_39);
} finally {
if (pop_ctxt_page_39) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_40 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_40 = null;
ClipboardProperty pz_79 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_40 = pz_79 == null ? null : pz_79.getPageValue();
pop_ctxt_page_40 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_40);
ClipboardPage target_context_40 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"40", "Update Page", null, target_context_40);
if (updatePage_40(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"40", "Update Page", null, target_context_40);
} finally {
if (pop_ctxt_page_40) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_41 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_41 = null;
ClipboardProperty pz_81 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_41 = pz_81 == null ? null : pz_81.getPageValue();
pop_ctxt_page_41 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_41);
ClipboardPage target_context_41 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"41", "Update Page", null, target_context_41);
if (updatePage_41(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"41", "Update Page", null, target_context_41);
} finally {
if (pop_ctxt_page_41) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_42 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_42 = null;
ClipboardProperty pz_83 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_42 = pz_83 == null ? null : pz_83.getPageValue();
pop_ctxt_page_42 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_42);
ClipboardPage target_context_42 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"42", "Update Page", null, target_context_42);
if (updatePage_42(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"42", "Update Page", null, target_context_42);
} finally {
if (pop_ctxt_page_42) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_43 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_43 = null;
ClipboardProperty pz_85 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_43 = pz_85 == null ? null : pz_85.getPageValue();
pop_ctxt_page_43 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_43);
ClipboardPage target_context_43 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"43", "Update Page", null, target_context_43);
if (updatePage_43(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"43", "Update Page", null, target_context_43);
} finally {
if (pop_ctxt_page_43) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_44 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_44 = null;
ClipboardProperty pz_87 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_44 = pz_87 == null ? null : pz_87.getPageValue();
pop_ctxt_page_44 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_44);
ClipboardPage target_context_44 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"44", "Update Page", null, target_context_44);
if (updatePage_44(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"44", "Update Page", null, target_context_44);
} finally {
if (pop_ctxt_page_44) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_45 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_45 = null;
ClipboardProperty pz_89 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_45 = pz_89 == null ? null : pz_89.getPageValue();
pop_ctxt_page_45 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_45);
ClipboardPage target_context_45 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"45", "Update Page", null, target_context_45);
if (updatePage_45(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"45", "Update Page", null, target_context_45);
} finally {
if (pop_ctxt_page_45) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_46 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_46 = null;
ClipboardProperty pz_91 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_46 = pz_91 == null ? null : pz_91.getPageValue();
pop_ctxt_page_46 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_46);
ClipboardPage target_context_46 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"46", "Update Page", null, target_context_46);
if (updatePage_46(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"46", "Update Page", null, target_context_46);
} finally {
if (pop_ctxt_page_46) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_47 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_47 = null;
ClipboardProperty pz_93 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_47 = pz_93 == null ? null : pz_93.getPageValue();
pop_ctxt_page_47 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_47);
ClipboardPage target_context_47 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"47", "Update Page", null, target_context_47);
if (updatePage_47(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"47", "Update Page", null, target_context_47);
} finally {
if (pop_ctxt_page_47) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_48 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_48 = null;
ClipboardProperty pz_95 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_48 = pz_95 == null ? null : pz_95.getPageValue();
pop_ctxt_page_48 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_48);
ClipboardPage target_context_48 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"48", "Update Page", null, target_context_48);
if (updatePage_48(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"48", "Update Page", null, target_context_48);
} finally {
if (pop_ctxt_page_48) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_49 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_49 = null;
ClipboardProperty pz_97 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_49 = pz_97 == null ? null : pz_97.getPageValue();
pop_ctxt_page_49 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_49);
ClipboardPage target_context_49 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"49", "Update Page", null, target_context_49);
if (updatePage_49(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"49", "Update Page", null, target_context_49);
} finally {
if (pop_ctxt_page_49) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_50 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_50 = null;
ClipboardProperty pz_99 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_50 = pz_99 == null ? null : pz_99.getPageValue();
pop_ctxt_page_50 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_50);
ClipboardPage target_context_50 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"50", "Update Page", null, target_context_50);
if (updatePage_50(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"50", "Update Page", null, target_context_50);
} finally {
if (pop_ctxt_page_50) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_51 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_51 = null;
ClipboardProperty pz_101 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_51 = pz_101 == null ? null : pz_101.getPageValue();
pop_ctxt_page_51 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_51);
ClipboardPage target_context_51 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"51", "Update Page", null, target_context_51);
if (updatePage_51(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"51", "Update Page", null, target_context_51);
} finally {
if (pop_ctxt_page_51) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_52 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_52 = null;
ClipboardProperty pz_103 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_52 = pz_103 == null ? null : pz_103.getPageValue();
pop_ctxt_page_52 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_52);
ClipboardPage target_context_52 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"52", "Update Page", null, target_context_52);
if (updatePage_52(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"52", "Update Page", null, target_context_52);
} finally {
if (pop_ctxt_page_52) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_53 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_53 = null;
ClipboardProperty pz_105 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_53 = pz_105 == null ? null : pz_105.getPageValue();
pop_ctxt_page_53 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_53);
ClipboardPage target_context_53 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"53", "Update Page", null, target_context_53);
if (updatePage_53(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"53", "Update Page", null, target_context_53);
} finally {
if (pop_ctxt_page_53) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_54 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_54 = null;
ClipboardProperty pz_107 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_54 = pz_107 == null ? null : pz_107.getPageValue();
pop_ctxt_page_54 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_54);
ClipboardPage target_context_54 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"54", "Update Page", null, target_context_54);
if (updatePage_54(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"54", "Update Page", null, target_context_54);
} finally {
if (pop_ctxt_page_54) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
/* entering new scope */
boolean pop_ctxt_page_55 = false;
try {
/* push '".pxResults(<APPEND>)"' to scope TARGET */
ClipboardPage ctxt_page_55 = null;
ClipboardProperty pz_109 = myStepPage.getProperty(".pxResults(<append>)");
ctxt_page_55 = pz_109 == null ? null : pz_109.getPageValue();
pop_ctxt_page_55 = pega.pushScopedStepContext("TARGET", ".pxResults(<APPEND>)", ctxt_page_55);
ClipboardPage target_context_55 = pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"55", "Update Page", null, target_context_55);
if (updatePage_55(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"55", "Update Page", null, target_context_55);
} finally {
if (pop_ctxt_page_55) {
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
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set .pyDescription", source_1, target_1);
{
    String pzSourceVar111 = "";
    pzSourceVar111 = "Albanian SQ (shqiptar)";
    PRStackFrame ctxt_frame_56 = null;
    try {
        ctxt_frame_56 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_56.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar111, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_56);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1", "Set .pyDescription", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2", "Set .pyLanguage", source_2, target_2);
{
    String pzSourceVar114 = "";
    pzSourceVar114 = "sq-AL";
    PRStackFrame ctxt_frame_58 = null;
    try {
        ctxt_frame_58 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_58.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar114, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_58);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2", "Set .pyLanguage", source_2, target_2);
return CODE_CONTINUE;
}private int updatePage_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyDescription", source_3, target_3);
{
    String pzSourceVar117 = "";
    pzSourceVar117 = "Arabic AR (Saudi Arabia)";
    PRStackFrame ctxt_frame_60 = null;
    try {
        ctxt_frame_60 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_60.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar117, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_60);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyDescription", source_3, target_3);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyLanguage", source_4, target_4);
{
    String pzSourceVar119 = "";
    pzSourceVar119 = "ar-SA";
    PRStackFrame ctxt_frame_62 = null;
    try {
        ctxt_frame_62 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_62.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar119, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_62);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyLanguage", source_4, target_4);
return CODE_CONTINUE;
}private int updatePage_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pyDescription", source_5, target_5);
{
    String pzSourceVar121 = "";
    pzSourceVar121 = "Belarusian BE (беларускі)";
    PRStackFrame ctxt_frame_64 = null;
    try {
        ctxt_frame_64 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_64.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar121, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_64);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pyDescription", source_5, target_5);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set .pyLanguage", source_6, target_6);
{
    String pzSourceVar123 = "";
    pzSourceVar123 = "be-BY";
    PRStackFrame ctxt_frame_66 = null;
    try {
        ctxt_frame_66 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_66.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar123, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_66);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set .pyLanguage", source_6, target_6);
return CODE_CONTINUE;
}private int updatePage_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pyDescription", source_7, target_7);
{
    String pzSourceVar125 = "";
    pzSourceVar125 = "Bulgarian BG (български)";
    PRStackFrame ctxt_frame_68 = null;
    try {
        ctxt_frame_68 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_68.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar125, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_68);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pyDescription", source_7, target_7);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.2", "Set .pyLanguage", source_8, target_8);
{
    String pzSourceVar127 = "";
    pzSourceVar127 = "bg-BG";
    PRStackFrame ctxt_frame_70 = null;
    try {
        ctxt_frame_70 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_70.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar127, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_70);
    }
}

actionEpilog(pz_CurrentTraceInfo,"4.2", "Set .pyLanguage", source_8, target_8);
return CODE_CONTINUE;
}private int updatePage_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set .pyDescription", source_9, target_9);
{
    String pzSourceVar129 = "";
    pzSourceVar129 = "Catalan CA (Català)";
    PRStackFrame ctxt_frame_72 = null;
    try {
        ctxt_frame_72 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_72.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar129, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_72);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set .pyDescription", source_9, target_9);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2", "Set .pyLanguage", source_10, target_10);
{
    String pzSourceVar131 = "";
    pzSourceVar131 = "ca-ES";
    PRStackFrame ctxt_frame_74 = null;
    try {
        ctxt_frame_74 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_74.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar131, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_74);
    }
}

actionEpilog(pz_CurrentTraceInfo,"5.2", "Set .pyLanguage", source_10, target_10);
return CODE_CONTINUE;
}private int updatePage_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1", "Set .pyDescription", source_11, target_11);
{
    String pzSourceVar133 = "";
    pzSourceVar133 = "Chinese ZH (China)";
    PRStackFrame ctxt_frame_76 = null;
    try {
        ctxt_frame_76 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_76.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar133, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_76);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.1", "Set .pyDescription", source_11, target_11);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.2", "Set .pyLanguage", source_12, target_12);
{
    String pzSourceVar135 = "";
    pzSourceVar135 = "zh-CN";
    PRStackFrame ctxt_frame_78 = null;
    try {
        ctxt_frame_78 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_78.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar135, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_78);
    }
}

actionEpilog(pz_CurrentTraceInfo,"6.2", "Set .pyLanguage", source_12, target_12);
return CODE_CONTINUE;
}private int updatePage_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.1", "Set .pyDescription", source_13, target_13);
{
    String pzSourceVar137 = "";
    pzSourceVar137 = "Chinese ZH (Taiwan)";
    PRStackFrame ctxt_frame_80 = null;
    try {
        ctxt_frame_80 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_80.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar137, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_80);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.1", "Set .pyDescription", source_13, target_13);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.2", "Set .pyLanguage", source_14, target_14);
{
    String pzSourceVar139 = "";
    pzSourceVar139 = "zh-TW";
    PRStackFrame ctxt_frame_82 = null;
    try {
        ctxt_frame_82 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_82.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar139, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_82);
    }
}

actionEpilog(pz_CurrentTraceInfo,"7.2", "Set .pyLanguage", source_14, target_14);
return CODE_CONTINUE;
}private int updatePage_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.1", "Set .pyDescription", source_15, target_15);
{
    String pzSourceVar141 = "";
    pzSourceVar141 = "Croatian HR (hrvatski)";
    PRStackFrame ctxt_frame_84 = null;
    try {
        ctxt_frame_84 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_84.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar141, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_84);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.1", "Set .pyDescription", source_15, target_15);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8.2", "Set .pyLanguage", source_16, target_16);
{
    String pzSourceVar143 = "";
    pzSourceVar143 = "hr";
    PRStackFrame ctxt_frame_86 = null;
    try {
        ctxt_frame_86 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_86.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar143, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_86);
    }
}

actionEpilog(pz_CurrentTraceInfo,"8.2", "Set .pyLanguage", source_16, target_16);
return CODE_CONTINUE;
}private int updatePage_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.1", "Set .pyDescription", source_17, target_17);
{
    String pzSourceVar145 = "";
    pzSourceVar145 = "Czech CS (čeština)";
    PRStackFrame ctxt_frame_88 = null;
    try {
        ctxt_frame_88 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_88.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar145, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_88);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.1", "Set .pyDescription", source_17, target_17);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.2", "Set .pyLanguage", source_18, target_18);
{
    String pzSourceVar147 = "";
    pzSourceVar147 = "cs-CZ";
    PRStackFrame ctxt_frame_90 = null;
    try {
        ctxt_frame_90 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_90.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar147, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_90);
    }
}

actionEpilog(pz_CurrentTraceInfo,"9.2", "Set .pyLanguage", source_18, target_18);
return CODE_CONTINUE;
}private int updatePage_10(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.1", "Set .pyDescription", source_19, target_19);
{
    String pzSourceVar149 = "";
    pzSourceVar149 = "Danish DA (dansk)";
    PRStackFrame ctxt_frame_92 = null;
    try {
        ctxt_frame_92 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_92.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar149, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_92);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.1", "Set .pyDescription", source_19, target_19);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10.2", "Set .pyLanguage", source_20, target_20);
{
    String pzSourceVar151 = "";
    pzSourceVar151 = "da-DK";
    PRStackFrame ctxt_frame_94 = null;
    try {
        ctxt_frame_94 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_94.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar151, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_94);
    }
}

actionEpilog(pz_CurrentTraceInfo,"10.2", "Set .pyLanguage", source_20, target_20);
return CODE_CONTINUE;
}private int updatePage_11(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.1", "Set .pyDescription", source_21, target_21);
{
    String pzSourceVar153 = "";
    pzSourceVar153 = "Dutch NL (Nederlands)";
    PRStackFrame ctxt_frame_96 = null;
    try {
        ctxt_frame_96 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_96.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar153, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_96);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.1", "Set .pyDescription", source_21, target_21);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11.2", "Set .pyLanguage", source_22, target_22);
{
    String pzSourceVar155 = "";
    pzSourceVar155 = "nl-NL";
    PRStackFrame ctxt_frame_98 = null;
    try {
        ctxt_frame_98 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_98.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar155, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_98);
    }
}

actionEpilog(pz_CurrentTraceInfo,"11.2", "Set .pyLanguage", source_22, target_22);
return CODE_CONTINUE;
}private int updatePage_12(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12.1", "Set .pyDescription", source_23, target_23);
{
    String pzSourceVar157 = "";
    pzSourceVar157 = "English EN (United States)";
    PRStackFrame ctxt_frame_100 = null;
    try {
        ctxt_frame_100 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_100.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar157, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_100);
    }
}

actionEpilog(pz_CurrentTraceInfo,"12.1", "Set .pyDescription", source_23, target_23);
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12.2", "Set .pyLanguage", source_24, target_24);
{
    String pzSourceVar159 = "";
    pzSourceVar159 = "en-US";
    PRStackFrame ctxt_frame_102 = null;
    try {
        ctxt_frame_102 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_102.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar159, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_102);
    }
}

actionEpilog(pz_CurrentTraceInfo,"12.2", "Set .pyLanguage", source_24, target_24);
return CODE_CONTINUE;
}private int updatePage_13(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.1", "Set .pyDescription", source_25, target_25);
{
    String pzSourceVar161 = "";
    pzSourceVar161 = "English EN (United Kingdom)";
    PRStackFrame ctxt_frame_104 = null;
    try {
        ctxt_frame_104 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_104.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar161, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_104);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.1", "Set .pyDescription", source_25, target_25);
ClipboardPage source_26 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13.2", "Set .pyLanguage", source_26, target_26);
{
    String pzSourceVar163 = "";
    pzSourceVar163 = "en-GB";
    PRStackFrame ctxt_frame_106 = null;
    try {
        ctxt_frame_106 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_106.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar163, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_106);
    }
}

actionEpilog(pz_CurrentTraceInfo,"13.2", "Set .pyLanguage", source_26, target_26);
return CODE_CONTINUE;
}private int updatePage_14(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_27 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"14.1", "Set .pyDescription", source_27, target_27);
{
    String pzSourceVar165 = "";
    pzSourceVar165 = "English EN (India)";
    PRStackFrame ctxt_frame_108 = null;
    try {
        ctxt_frame_108 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_108.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar165, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_108);
    }
}

actionEpilog(pz_CurrentTraceInfo,"14.1", "Set .pyDescription", source_27, target_27);
ClipboardPage source_28 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"14.2", "Set .pyLanguage", source_28, target_28);
{
    String pzSourceVar167 = "";
    pzSourceVar167 = "en-IN";
    PRStackFrame ctxt_frame_110 = null;
    try {
        ctxt_frame_110 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_110.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar167, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_110);
    }
}

actionEpilog(pz_CurrentTraceInfo,"14.2", "Set .pyLanguage", source_28, target_28);
return CODE_CONTINUE;
}private int updatePage_15(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_29 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"15.1", "Set .pyDescription", source_29, target_29);
{
    String pzSourceVar169 = "";
    pzSourceVar169 = "Estonian ET (eesti)";
    PRStackFrame ctxt_frame_112 = null;
    try {
        ctxt_frame_112 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_112.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar169, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_112);
    }
}

actionEpilog(pz_CurrentTraceInfo,"15.1", "Set .pyDescription", source_29, target_29);
ClipboardPage source_30 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"15.2", "Set .pyLanguage", source_30, target_30);
{
    String pzSourceVar171 = "";
    pzSourceVar171 = "et-EE";
    PRStackFrame ctxt_frame_114 = null;
    try {
        ctxt_frame_114 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_114.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar171, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_114);
    }
}

actionEpilog(pz_CurrentTraceInfo,"15.2", "Set .pyLanguage", source_30, target_30);
return CODE_CONTINUE;
}private int updatePage_16(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_31 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"16.1", "Set .pyDescription", source_31, target_31);
{
    String pzSourceVar173 = "";
    pzSourceVar173 = "Finnish FI (suomalainen)";
    PRStackFrame ctxt_frame_116 = null;
    try {
        ctxt_frame_116 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_116.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar173, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_116);
    }
}

actionEpilog(pz_CurrentTraceInfo,"16.1", "Set .pyDescription", source_31, target_31);
ClipboardPage source_32 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"16.2", "Set .pyLanguage", source_32, target_32);
{
    String pzSourceVar175 = "";
    pzSourceVar175 = "fi-FI";
    PRStackFrame ctxt_frame_118 = null;
    try {
        ctxt_frame_118 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_118.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar175, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_118);
    }
}

actionEpilog(pz_CurrentTraceInfo,"16.2", "Set .pyLanguage", source_32, target_32);
return CODE_CONTINUE;
}private int updatePage_17(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_33 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"17.1", "Set .pyDescription", source_33, target_33);
{
    String pzSourceVar177 = "";
    pzSourceVar177 = "French FR (Canada)";
    PRStackFrame ctxt_frame_120 = null;
    try {
        ctxt_frame_120 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_120.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar177, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_120);
    }
}

actionEpilog(pz_CurrentTraceInfo,"17.1", "Set .pyDescription", source_33, target_33);
ClipboardPage source_34 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_34 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"17.2", "Set .pyLanguage", source_34, target_34);
{
    String pzSourceVar179 = "";
    pzSourceVar179 = "fr-CA";
    PRStackFrame ctxt_frame_122 = null;
    try {
        ctxt_frame_122 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_122.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar179, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_122);
    }
}

actionEpilog(pz_CurrentTraceInfo,"17.2", "Set .pyLanguage", source_34, target_34);
return CODE_CONTINUE;
}private int updatePage_18(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_35 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_35 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18.1", "Set .pyDescription", source_35, target_35);
{
    String pzSourceVar181 = "";
    pzSourceVar181 = "French FR (France)";
    PRStackFrame ctxt_frame_124 = null;
    try {
        ctxt_frame_124 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_124.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar181, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_124);
    }
}

actionEpilog(pz_CurrentTraceInfo,"18.1", "Set .pyDescription", source_35, target_35);
ClipboardPage source_36 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_36 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18.2", "Set .pyLanguage", source_36, target_36);
{
    String pzSourceVar183 = "";
    pzSourceVar183 = "fr-FR";
    PRStackFrame ctxt_frame_126 = null;
    try {
        ctxt_frame_126 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_126.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar183, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_126);
    }
}

actionEpilog(pz_CurrentTraceInfo,"18.2", "Set .pyLanguage", source_36, target_36);
return CODE_CONTINUE;
}private int updatePage_19(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_37 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_37 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19.1", "Set .pyDescription", source_37, target_37);
{
    String pzSourceVar185 = "";
    pzSourceVar185 = "French FR (Belgium)";
    PRStackFrame ctxt_frame_128 = null;
    try {
        ctxt_frame_128 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_128.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar185, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_128);
    }
}

actionEpilog(pz_CurrentTraceInfo,"19.1", "Set .pyDescription", source_37, target_37);
ClipboardPage source_38 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_38 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19.2", "Set .pyLanguage", source_38, target_38);
{
    String pzSourceVar187 = "";
    pzSourceVar187 = "fr-BE";
    PRStackFrame ctxt_frame_130 = null;
    try {
        ctxt_frame_130 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_130.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar187, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_130);
    }
}

actionEpilog(pz_CurrentTraceInfo,"19.2", "Set .pyLanguage", source_38, target_38);
return CODE_CONTINUE;
}private int updatePage_20(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_39 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_39 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20.1", "Set .pyDescription", source_39, target_39);
{
    String pzSourceVar189 = "";
    pzSourceVar189 = "German DE (Austria)";
    PRStackFrame ctxt_frame_132 = null;
    try {
        ctxt_frame_132 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_132.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar189, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_132);
    }
}

actionEpilog(pz_CurrentTraceInfo,"20.1", "Set .pyDescription", source_39, target_39);
ClipboardPage source_40 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_40 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20.2", "Set .pyLanguage", source_40, target_40);
{
    String pzSourceVar191 = "";
    pzSourceVar191 = "de-AT";
    PRStackFrame ctxt_frame_134 = null;
    try {
        ctxt_frame_134 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_134.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar191, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_134);
    }
}

actionEpilog(pz_CurrentTraceInfo,"20.2", "Set .pyLanguage", source_40, target_40);
return CODE_CONTINUE;
}private int updatePage_21(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_41 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_41 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.1", "Set .pyDescription", source_41, target_41);
{
    String pzSourceVar193 = "";
    pzSourceVar193 = "German DE (Germany)";
    PRStackFrame ctxt_frame_136 = null;
    try {
        ctxt_frame_136 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_136.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar193, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_136);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.1", "Set .pyDescription", source_41, target_41);
ClipboardPage source_42 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_42 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21.2", "Set .pyLanguage", source_42, target_42);
{
    String pzSourceVar195 = "";
    pzSourceVar195 = "de-DE";
    PRStackFrame ctxt_frame_138 = null;
    try {
        ctxt_frame_138 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_138.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar195, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_138);
    }
}

actionEpilog(pz_CurrentTraceInfo,"21.2", "Set .pyLanguage", source_42, target_42);
return CODE_CONTINUE;
}private int updatePage_22(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_43 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_43 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"22.1", "Set .pyDescription", source_43, target_43);
{
    String pzSourceVar197 = "";
    pzSourceVar197 = "German DE (Luxembourg)";
    PRStackFrame ctxt_frame_140 = null;
    try {
        ctxt_frame_140 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_140.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar197, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_140);
    }
}

actionEpilog(pz_CurrentTraceInfo,"22.1", "Set .pyDescription", source_43, target_43);
ClipboardPage source_44 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_44 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"22.2", "Set .pyLanguage", source_44, target_44);
{
    String pzSourceVar199 = "";
    pzSourceVar199 = "de-LU";
    PRStackFrame ctxt_frame_142 = null;
    try {
        ctxt_frame_142 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_142.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar199, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_142);
    }
}

actionEpilog(pz_CurrentTraceInfo,"22.2", "Set .pyLanguage", source_44, target_44);
return CODE_CONTINUE;
}private int updatePage_23(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_45 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_45 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"23.1", "Set .pyDescription", source_45, target_45);
{
    String pzSourceVar201 = "";
    pzSourceVar201 = "German DE (Switzerland)";
    PRStackFrame ctxt_frame_144 = null;
    try {
        ctxt_frame_144 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_144.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar201, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_144);
    }
}

actionEpilog(pz_CurrentTraceInfo,"23.1", "Set .pyDescription", source_45, target_45);
ClipboardPage source_46 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_46 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"23.2", "Set .pyLanguage", source_46, target_46);
{
    String pzSourceVar203 = "";
    pzSourceVar203 = "de-CH";
    PRStackFrame ctxt_frame_146 = null;
    try {
        ctxt_frame_146 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_146.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar203, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_146);
    }
}

actionEpilog(pz_CurrentTraceInfo,"23.2", "Set .pyLanguage", source_46, target_46);
return CODE_CONTINUE;
}private int updatePage_24(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_47 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_47 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"24.1", "Set .pyDescription", source_47, target_47);
{
    String pzSourceVar205 = "";
    pzSourceVar205 = "Greek EL (ελληνικά)";
    PRStackFrame ctxt_frame_148 = null;
    try {
        ctxt_frame_148 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_148.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar205, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_148);
    }
}

actionEpilog(pz_CurrentTraceInfo,"24.1", "Set .pyDescription", source_47, target_47);
ClipboardPage source_48 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_48 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"24.2", "Set .pyLanguage", source_48, target_48);
{
    String pzSourceVar207 = "";
    pzSourceVar207 = "el-GR";
    PRStackFrame ctxt_frame_150 = null;
    try {
        ctxt_frame_150 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_150.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar207, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_150);
    }
}

actionEpilog(pz_CurrentTraceInfo,"24.2", "Set .pyLanguage", source_48, target_48);
return CODE_CONTINUE;
}private int updatePage_25(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_49 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_49 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"25.1", "Set .pyDescription", source_49, target_49);
{
    String pzSourceVar209 = "";
    pzSourceVar209 = "Hebrew IW (hibru)";
    PRStackFrame ctxt_frame_152 = null;
    try {
        ctxt_frame_152 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_152.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar209, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_152);
    }
}

actionEpilog(pz_CurrentTraceInfo,"25.1", "Set .pyDescription", source_49, target_49);
ClipboardPage source_50 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_50 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"25.2", "Set .pyLanguage", source_50, target_50);
{
    String pzSourceVar211 = "";
    pzSourceVar211 = "iw-IL";
    PRStackFrame ctxt_frame_154 = null;
    try {
        ctxt_frame_154 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_154.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar211, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_154);
    }
}

actionEpilog(pz_CurrentTraceInfo,"25.2", "Set .pyLanguage", source_50, target_50);
return CODE_CONTINUE;
}private int updatePage_26(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_51 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_51 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"26.1", "Set .pyDescription", source_51, target_51);
{
    String pzSourceVar213 = "";
    pzSourceVar213 = "Hindi HI (हिंदी)'";
    PRStackFrame ctxt_frame_156 = null;
    try {
        ctxt_frame_156 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_156.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar213, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_156);
    }
}

actionEpilog(pz_CurrentTraceInfo,"26.1", "Set .pyDescription", source_51, target_51);
ClipboardPage source_52 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_52 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"26.2", "Set .pyLanguage", source_52, target_52);
{
    String pzSourceVar215 = "";
    pzSourceVar215 = "hi-IN";
    PRStackFrame ctxt_frame_158 = null;
    try {
        ctxt_frame_158 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_158.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar215, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_158);
    }
}

actionEpilog(pz_CurrentTraceInfo,"26.2", "Set .pyLanguage", source_52, target_52);
return CODE_CONTINUE;
}private int updatePage_27(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_53 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_53 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"27.1", "Set .pyDescription", source_53, target_53);
{
    String pzSourceVar217 = "";
    pzSourceVar217 = "Hungarian HU (magyar)";
    PRStackFrame ctxt_frame_160 = null;
    try {
        ctxt_frame_160 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_160.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar217, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_160);
    }
}

actionEpilog(pz_CurrentTraceInfo,"27.1", "Set .pyDescription", source_53, target_53);
ClipboardPage source_54 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_54 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"27.2", "Set .pyLanguage", source_54, target_54);
{
    String pzSourceVar219 = "";
    pzSourceVar219 = "hu-HU";
    PRStackFrame ctxt_frame_162 = null;
    try {
        ctxt_frame_162 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_162.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar219, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_162);
    }
}

actionEpilog(pz_CurrentTraceInfo,"27.2", "Set .pyLanguage", source_54, target_54);
return CODE_CONTINUE;
}private int updatePage_28(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_55 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_55 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"28.1", "Set .pyDescription", source_55, target_55);
{
    String pzSourceVar221 = "";
    pzSourceVar221 = "Icelandic IS (Icelandic)";
    PRStackFrame ctxt_frame_164 = null;
    try {
        ctxt_frame_164 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_164.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar221, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_164);
    }
}

actionEpilog(pz_CurrentTraceInfo,"28.1", "Set .pyDescription", source_55, target_55);
ClipboardPage source_56 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_56 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"28.2", "Set .pyLanguage", source_56, target_56);
{
    String pzSourceVar223 = "";
    pzSourceVar223 = "is-IS";
    PRStackFrame ctxt_frame_166 = null;
    try {
        ctxt_frame_166 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_166.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar223, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_166);
    }
}

actionEpilog(pz_CurrentTraceInfo,"28.2", "Set .pyLanguage", source_56, target_56);
return CODE_CONTINUE;
}private int updatePage_29(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_57 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_57 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"29.1", "Set .pyDescription", source_57, target_57);
{
    String pzSourceVar225 = "";
    pzSourceVar225 = "Indonesian ID (Indonesia)";
    PRStackFrame ctxt_frame_168 = null;
    try {
        ctxt_frame_168 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_168.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar225, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_168);
    }
}

actionEpilog(pz_CurrentTraceInfo,"29.1", "Set .pyDescription", source_57, target_57);
ClipboardPage source_58 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_58 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"29.2", "Set .pyLanguage", source_58, target_58);
{
    String pzSourceVar227 = "";
    pzSourceVar227 = "in-ID";
    PRStackFrame ctxt_frame_170 = null;
    try {
        ctxt_frame_170 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_170.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar227, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_170);
    }
}

actionEpilog(pz_CurrentTraceInfo,"29.2", "Set .pyLanguage", source_58, target_58);
return CODE_CONTINUE;
}private int updatePage_30(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_59 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_59 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"30.1", "Set .pyDescription", source_59, target_59);
{
    String pzSourceVar229 = "";
    pzSourceVar229 = "Italian IT (italiano)";
    PRStackFrame ctxt_frame_172 = null;
    try {
        ctxt_frame_172 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_172.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar229, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_172);
    }
}

actionEpilog(pz_CurrentTraceInfo,"30.1", "Set .pyDescription", source_59, target_59);
ClipboardPage source_60 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_60 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"30.2", "Set .pyLanguage", source_60, target_60);
{
    String pzSourceVar231 = "";
    pzSourceVar231 = "it-IT";
    PRStackFrame ctxt_frame_174 = null;
    try {
        ctxt_frame_174 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_174.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar231, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_174);
    }
}

actionEpilog(pz_CurrentTraceInfo,"30.2", "Set .pyLanguage", source_60, target_60);
return CODE_CONTINUE;
}private int updatePage_31(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_61 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_61 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"31.1", "Set .pyDescription", source_61, target_61);
{
    String pzSourceVar233 = "";
    pzSourceVar233 = "Italian IT (Switzerland)";
    PRStackFrame ctxt_frame_176 = null;
    try {
        ctxt_frame_176 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_176.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar233, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_176);
    }
}

actionEpilog(pz_CurrentTraceInfo,"31.1", "Set .pyDescription", source_61, target_61);
ClipboardPage source_62 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_62 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"31.2", "Set .pyLanguage", source_62, target_62);
{
    String pzSourceVar235 = "";
    pzSourceVar235 = "it-CH";
    PRStackFrame ctxt_frame_178 = null;
    try {
        ctxt_frame_178 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_178.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar235, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_178);
    }
}

actionEpilog(pz_CurrentTraceInfo,"31.2", "Set .pyLanguage", source_62, target_62);
return CODE_CONTINUE;
}private int updatePage_32(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_63 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_63 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"32.1", "Set .pyDescription", source_63, target_63);
{
    String pzSourceVar237 = "";
    pzSourceVar237 = "Japanese JA - Japan(日本の)";
    PRStackFrame ctxt_frame_180 = null;
    try {
        ctxt_frame_180 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_180.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar237, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_180);
    }
}

actionEpilog(pz_CurrentTraceInfo,"32.1", "Set .pyDescription", source_63, target_63);
ClipboardPage source_64 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_64 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"32.2", "Set .pyLanguage", source_64, target_64);
{
    String pzSourceVar239 = "";
    pzSourceVar239 = "ja-JP";
    PRStackFrame ctxt_frame_182 = null;
    try {
        ctxt_frame_182 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_182.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar239, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_182);
    }
}

actionEpilog(pz_CurrentTraceInfo,"32.2", "Set .pyLanguage", source_64, target_64);
return CODE_CONTINUE;
}private int updatePage_33(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_65 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_65 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"33.1", "Set .pyDescription", source_65, target_65);
{
    String pzSourceVar241 = "";
    pzSourceVar241 = "Korean KO (한국의)";
    PRStackFrame ctxt_frame_184 = null;
    try {
        ctxt_frame_184 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_184.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar241, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_184);
    }
}

actionEpilog(pz_CurrentTraceInfo,"33.1", "Set .pyDescription", source_65, target_65);
ClipboardPage source_66 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_66 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"33.2", "Set .pyLanguage", source_66, target_66);
{
    String pzSourceVar243 = "";
    pzSourceVar243 = "ko-KR";
    PRStackFrame ctxt_frame_186 = null;
    try {
        ctxt_frame_186 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_186.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar243, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_186);
    }
}

actionEpilog(pz_CurrentTraceInfo,"33.2", "Set .pyLanguage", source_66, target_66);
return CODE_CONTINUE;
}private int updatePage_34(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_67 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_67 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"34.1", "Set .pyDescription", source_67, target_67);
{
    String pzSourceVar245 = "";
    pzSourceVar245 = "Latvian LV (Latvijas)";
    PRStackFrame ctxt_frame_188 = null;
    try {
        ctxt_frame_188 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_188.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar245, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_188);
    }
}

actionEpilog(pz_CurrentTraceInfo,"34.1", "Set .pyDescription", source_67, target_67);
ClipboardPage source_68 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_68 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"34.2", "Set .pyLanguage", source_68, target_68);
{
    String pzSourceVar247 = "";
    pzSourceVar247 = "lv-LV";
    PRStackFrame ctxt_frame_190 = null;
    try {
        ctxt_frame_190 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_190.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar247, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_190);
    }
}

actionEpilog(pz_CurrentTraceInfo,"34.2", "Set .pyLanguage", source_68, target_68);
return CODE_CONTINUE;
}private int updatePage_35(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_69 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_69 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"35.1", "Set .pyDescription", source_69, target_69);
{
    String pzSourceVar249 = "";
    pzSourceVar249 = "Lithuanian LT (Lietuvos)";
    PRStackFrame ctxt_frame_192 = null;
    try {
        ctxt_frame_192 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_192.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar249, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_192);
    }
}

actionEpilog(pz_CurrentTraceInfo,"35.1", "Set .pyDescription", source_69, target_69);
ClipboardPage source_70 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_70 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"35.2", "Set .pyLanguage", source_70, target_70);
{
    String pzSourceVar251 = "";
    pzSourceVar251 = "lt-LT";
    PRStackFrame ctxt_frame_194 = null;
    try {
        ctxt_frame_194 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_194.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar251, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_194);
    }
}

actionEpilog(pz_CurrentTraceInfo,"35.2", "Set .pyLanguage", source_70, target_70);
return CODE_CONTINUE;
}private int updatePage_36(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_71 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_71 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"36.1", "Set .pyDescription", source_71, target_71);
{
    String pzSourceVar253 = "";
    pzSourceVar253 = "Macedonian MK (македонски)";
    PRStackFrame ctxt_frame_196 = null;
    try {
        ctxt_frame_196 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_196.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar253, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_196);
    }
}

actionEpilog(pz_CurrentTraceInfo,"36.1", "Set .pyDescription", source_71, target_71);
ClipboardPage source_72 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_72 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"36.2", "Set .pyLanguage", source_72, target_72);
{
    String pzSourceVar255 = "";
    pzSourceVar255 = "mk-MK";
    PRStackFrame ctxt_frame_198 = null;
    try {
        ctxt_frame_198 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_198.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar255, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_198);
    }
}

actionEpilog(pz_CurrentTraceInfo,"36.2", "Set .pyLanguage", source_72, target_72);
return CODE_CONTINUE;
}private int updatePage_37(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_73 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_73 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"37.1", "Set .pyDescription", source_73, target_73);
{
    String pzSourceVar257 = "";
    pzSourceVar257 = "Norwegian NO (norsk)";
    PRStackFrame ctxt_frame_200 = null;
    try {
        ctxt_frame_200 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_200.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar257, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_200);
    }
}

actionEpilog(pz_CurrentTraceInfo,"37.1", "Set .pyDescription", source_73, target_73);
ClipboardPage source_74 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_74 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"37.2", "Set .pyLanguage", source_74, target_74);
{
    String pzSourceVar259 = "";
    pzSourceVar259 = "no-NO";
    PRStackFrame ctxt_frame_202 = null;
    try {
        ctxt_frame_202 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_202.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar259, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_202);
    }
}

actionEpilog(pz_CurrentTraceInfo,"37.2", "Set .pyLanguage", source_74, target_74);
return CODE_CONTINUE;
}private int updatePage_38(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_75 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_75 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"38.1", "Set .pyDescription", source_75, target_75);
{
    String pzSourceVar261 = "";
    pzSourceVar261 = "Polish PL (polski)";
    PRStackFrame ctxt_frame_204 = null;
    try {
        ctxt_frame_204 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_204.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar261, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_204);
    }
}

actionEpilog(pz_CurrentTraceInfo,"38.1", "Set .pyDescription", source_75, target_75);
ClipboardPage source_76 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_76 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"38.2", "Set .pyLanguage", source_76, target_76);
{
    String pzSourceVar263 = "";
    pzSourceVar263 = "pl-PL";
    PRStackFrame ctxt_frame_206 = null;
    try {
        ctxt_frame_206 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_206.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar263, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_206);
    }
}

actionEpilog(pz_CurrentTraceInfo,"38.2", "Set .pyLanguage", source_76, target_76);
return CODE_CONTINUE;
}private int updatePage_39(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_77 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_77 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"39.1", "Set .pyDescription", source_77, target_77);
{
    String pzSourceVar265 = "";
    pzSourceVar265 = "Portuguese BR (Brasil)";
    PRStackFrame ctxt_frame_208 = null;
    try {
        ctxt_frame_208 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_208.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar265, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_208);
    }
}

actionEpilog(pz_CurrentTraceInfo,"39.1", "Set .pyDescription", source_77, target_77);
ClipboardPage source_78 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_78 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"39.2", "Set .pyLanguage", source_78, target_78);
{
    String pzSourceVar267 = "";
    pzSourceVar267 = "pt-BR";
    PRStackFrame ctxt_frame_210 = null;
    try {
        ctxt_frame_210 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_210.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar267, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_210);
    }
}

actionEpilog(pz_CurrentTraceInfo,"39.2", "Set .pyLanguage", source_78, target_78);
return CODE_CONTINUE;
}private int updatePage_40(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_79 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_79 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"40.1", "Set .pyDescription", source_79, target_79);
{
    String pzSourceVar269 = "";
    pzSourceVar269 = "Portuguese PT (português)";
    PRStackFrame ctxt_frame_212 = null;
    try {
        ctxt_frame_212 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_212.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar269, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_212);
    }
}

actionEpilog(pz_CurrentTraceInfo,"40.1", "Set .pyDescription", source_79, target_79);
ClipboardPage source_80 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_80 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"40.2", "Set .pyLanguage", source_80, target_80);
{
    String pzSourceVar271 = "";
    pzSourceVar271 = "pt-PT";
    PRStackFrame ctxt_frame_214 = null;
    try {
        ctxt_frame_214 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_214.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar271, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_214);
    }
}

actionEpilog(pz_CurrentTraceInfo,"40.2", "Set .pyLanguage", source_80, target_80);
return CODE_CONTINUE;
}private int updatePage_41(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_81 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_81 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"41.1", "Set .pyDescription", source_81, target_81);
{
    String pzSourceVar273 = "";
    pzSourceVar273 = "Romanian RO (român)";
    PRStackFrame ctxt_frame_216 = null;
    try {
        ctxt_frame_216 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_216.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar273, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_216);
    }
}

actionEpilog(pz_CurrentTraceInfo,"41.1", "Set .pyDescription", source_81, target_81);
ClipboardPage source_82 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_82 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"41.2", "Set .pyLanguage", source_82, target_82);
{
    String pzSourceVar275 = "";
    pzSourceVar275 = "ro-RO";
    PRStackFrame ctxt_frame_218 = null;
    try {
        ctxt_frame_218 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_218.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar275, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_218);
    }
}

actionEpilog(pz_CurrentTraceInfo,"41.2", "Set .pyLanguage", source_82, target_82);
return CODE_CONTINUE;
}private int updatePage_42(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_83 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_83 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"42.1", "Set .pyDescription", source_83, target_83);
{
    String pzSourceVar277 = "";
    pzSourceVar277 = "Russian RU (русский)";
    PRStackFrame ctxt_frame_220 = null;
    try {
        ctxt_frame_220 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_220.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar277, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_220);
    }
}

actionEpilog(pz_CurrentTraceInfo,"42.1", "Set .pyDescription", source_83, target_83);
ClipboardPage source_84 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_84 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"42.2", "Set .pyLanguage", source_84, target_84);
{
    String pzSourceVar279 = "";
    pzSourceVar279 = "ru-RU";
    PRStackFrame ctxt_frame_222 = null;
    try {
        ctxt_frame_222 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_222.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar279, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_222);
    }
}

actionEpilog(pz_CurrentTraceInfo,"42.2", "Set .pyLanguage", source_84, target_84);
return CODE_CONTINUE;
}private int updatePage_43(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_85 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_85 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"43.1", "Set .pyDescription", source_85, target_85);
{
    String pzSourceVar281 = "";
    pzSourceVar281 = "Slovak SK (slovenský)";
    PRStackFrame ctxt_frame_224 = null;
    try {
        ctxt_frame_224 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_224.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar281, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_224);
    }
}

actionEpilog(pz_CurrentTraceInfo,"43.1", "Set .pyDescription", source_85, target_85);
ClipboardPage source_86 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_86 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"43.2", "Set .pyLanguage", source_86, target_86);
{
    String pzSourceVar283 = "";
    pzSourceVar283 = "sk-SK";
    PRStackFrame ctxt_frame_226 = null;
    try {
        ctxt_frame_226 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_226.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar283, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_226);
    }
}

actionEpilog(pz_CurrentTraceInfo,"43.2", "Set .pyLanguage", source_86, target_86);
return CODE_CONTINUE;
}private int updatePage_44(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_87 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_87 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"44.1", "Set .pyDescription", source_87, target_87);
{
    String pzSourceVar285 = "";
    pzSourceVar285 = "Slovenian SL (slovenščina)";
    PRStackFrame ctxt_frame_228 = null;
    try {
        ctxt_frame_228 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_228.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar285, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_228);
    }
}

actionEpilog(pz_CurrentTraceInfo,"44.1", "Set .pyDescription", source_87, target_87);
ClipboardPage source_88 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_88 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"44.2", "Set .pyLanguage", source_88, target_88);
{
    String pzSourceVar287 = "";
    pzSourceVar287 = "sl-SL";
    PRStackFrame ctxt_frame_230 = null;
    try {
        ctxt_frame_230 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_230.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar287, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_230);
    }
}

actionEpilog(pz_CurrentTraceInfo,"44.2", "Set .pyLanguage", source_88, target_88);
return CODE_CONTINUE;
}private int updatePage_45(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_89 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_89 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"45.1", "Set .pyDescription", source_89, target_89);
{
    String pzSourceVar289 = "";
    pzSourceVar289 = "Spanish ES (español)";
    PRStackFrame ctxt_frame_232 = null;
    try {
        ctxt_frame_232 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_232.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar289, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_232);
    }
}

actionEpilog(pz_CurrentTraceInfo,"45.1", "Set .pyDescription", source_89, target_89);
ClipboardPage source_90 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_90 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"45.2", "Set .pyLanguage", source_90, target_90);
{
    String pzSourceVar291 = "";
    pzSourceVar291 = "es-ES";
    PRStackFrame ctxt_frame_234 = null;
    try {
        ctxt_frame_234 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_234.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar291, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_234);
    }
}

actionEpilog(pz_CurrentTraceInfo,"45.2", "Set .pyLanguage", source_90, target_90);
return CODE_CONTINUE;
}private int updatePage_46(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_91 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_91 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"46.1", "Set .pyDescription", source_91, target_91);
{
    String pzSourceVar293 = "";
    pzSourceVar293 = "Spanish ES  (United States)";
    PRStackFrame ctxt_frame_236 = null;
    try {
        ctxt_frame_236 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_236.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar293, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_236);
    }
}

actionEpilog(pz_CurrentTraceInfo,"46.1", "Set .pyDescription", source_91, target_91);
ClipboardPage source_92 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_92 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"46.2", "Set .pyLanguage", source_92, target_92);
{
    String pzSourceVar295 = "";
    pzSourceVar295 = "es-US";
    PRStackFrame ctxt_frame_238 = null;
    try {
        ctxt_frame_238 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_238.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar295, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_238);
    }
}

actionEpilog(pz_CurrentTraceInfo,"46.2", "Set .pyLanguage", source_92, target_92);
return CODE_CONTINUE;
}private int updatePage_47(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_93 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_93 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"47.1", "Set .pyDescription", source_93, target_93);
{
    String pzSourceVar297 = "";
    pzSourceVar297 = "Spanish ES (Mexico)";
    PRStackFrame ctxt_frame_240 = null;
    try {
        ctxt_frame_240 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_240.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar297, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_240);
    }
}

actionEpilog(pz_CurrentTraceInfo,"47.1", "Set .pyDescription", source_93, target_93);
ClipboardPage source_94 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_94 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"47.2", "Set .pyLanguage", source_94, target_94);
{
    String pzSourceVar299 = "";
    pzSourceVar299 = "es-MX";
    PRStackFrame ctxt_frame_242 = null;
    try {
        ctxt_frame_242 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_242.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar299, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_242);
    }
}

actionEpilog(pz_CurrentTraceInfo,"47.2", "Set .pyLanguage", source_94, target_94);
return CODE_CONTINUE;
}private int updatePage_48(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_95 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_95 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"48.1", "Set .pyDescription", source_95, target_95);
{
    String pzSourceVar301 = "";
    pzSourceVar301 = "Spanish ES (Latin America)";
    PRStackFrame ctxt_frame_244 = null;
    try {
        ctxt_frame_244 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_244.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar301, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_244);
    }
}

actionEpilog(pz_CurrentTraceInfo,"48.1", "Set .pyDescription", source_95, target_95);
ClipboardPage source_96 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_96 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"48.2", "Set .pyLanguage", source_96, target_96);
{
    String pzSourceVar303 = "";
    pzSourceVar303 = "es-XL";
    PRStackFrame ctxt_frame_246 = null;
    try {
        ctxt_frame_246 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_246.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar303, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_246);
    }
}

actionEpilog(pz_CurrentTraceInfo,"48.2", "Set .pyLanguage", source_96, target_96);
return CODE_CONTINUE;
}private int updatePage_49(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_97 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_97 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"49.1", "Set .pyDescription", source_97, target_97);
{
    String pzSourceVar305 = "";
    pzSourceVar305 = "Swedish SV (Svenska)";
    PRStackFrame ctxt_frame_248 = null;
    try {
        ctxt_frame_248 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_248.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar305, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_248);
    }
}

actionEpilog(pz_CurrentTraceInfo,"49.1", "Set .pyDescription", source_97, target_97);
ClipboardPage source_98 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_98 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"49.2", "Set .pyLanguage", source_98, target_98);
{
    String pzSourceVar307 = "";
    pzSourceVar307 = "sv-SE";
    PRStackFrame ctxt_frame_250 = null;
    try {
        ctxt_frame_250 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_250.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar307, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_250);
    }
}

actionEpilog(pz_CurrentTraceInfo,"49.2", "Set .pyLanguage", source_98, target_98);
return CODE_CONTINUE;
}private int updatePage_50(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_99 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_99 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"50.1", "Set .pyDescription", source_99, target_99);
{
    String pzSourceVar309 = "";
    pzSourceVar309 = "Thai TH (ภาษาไทย)";
    PRStackFrame ctxt_frame_252 = null;
    try {
        ctxt_frame_252 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_252.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar309, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_252);
    }
}

actionEpilog(pz_CurrentTraceInfo,"50.1", "Set .pyDescription", source_99, target_99);
ClipboardPage source_100 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_100 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"50.2", "Set .pyLanguage", source_100, target_100);
{
    String pzSourceVar311 = "";
    pzSourceVar311 = "th-TH";
    PRStackFrame ctxt_frame_254 = null;
    try {
        ctxt_frame_254 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_254.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar311, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_254);
    }
}

actionEpilog(pz_CurrentTraceInfo,"50.2", "Set .pyLanguage", source_100, target_100);
return CODE_CONTINUE;
}private int updatePage_51(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_101 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_101 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"51.1", "Set .pyDescription", source_101, target_101);
{
    String pzSourceVar313 = "";
    pzSourceVar313 = "Turkish TR (Türk)";
    PRStackFrame ctxt_frame_256 = null;
    try {
        ctxt_frame_256 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_256.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar313, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_256);
    }
}

actionEpilog(pz_CurrentTraceInfo,"51.1", "Set .pyDescription", source_101, target_101);
ClipboardPage source_102 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_102 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"51.2", "Set .pyLanguage", source_102, target_102);
{
    String pzSourceVar315 = "";
    pzSourceVar315 = "tr-TR";
    PRStackFrame ctxt_frame_258 = null;
    try {
        ctxt_frame_258 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_258.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar315, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_258);
    }
}

actionEpilog(pz_CurrentTraceInfo,"51.2", "Set .pyLanguage", source_102, target_102);
return CODE_CONTINUE;
}private int updatePage_52(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_103 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_103 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"52.1", "Set .pyDescription", source_103, target_103);
{
    String pzSourceVar317 = "";
    pzSourceVar317 = "Ukrainian UK (Український)";
    PRStackFrame ctxt_frame_260 = null;
    try {
        ctxt_frame_260 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_260.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar317, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_260);
    }
}

actionEpilog(pz_CurrentTraceInfo,"52.1", "Set .pyDescription", source_103, target_103);
ClipboardPage source_104 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_104 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"52.2", "Set .pyLanguage", source_104, target_104);
{
    String pzSourceVar319 = "";
    pzSourceVar319 = "uk-UA";
    PRStackFrame ctxt_frame_262 = null;
    try {
        ctxt_frame_262 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_262.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar319, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_262);
    }
}

actionEpilog(pz_CurrentTraceInfo,"52.2", "Set .pyLanguage", source_104, target_104);
return CODE_CONTINUE;
}private int updatePage_53(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_105 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_105 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"53.1", "Set .pyDescription", source_105, target_105);
{
    String pzSourceVar321 = "";
    pzSourceVar321 = "Vietnamese VI (Việt)";
    PRStackFrame ctxt_frame_264 = null;
    try {
        ctxt_frame_264 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_264.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar321, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_264);
    }
}

actionEpilog(pz_CurrentTraceInfo,"53.1", "Set .pyDescription", source_105, target_105);
ClipboardPage source_106 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_106 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"53.2", "Set .pyLanguage", source_106, target_106);
{
    String pzSourceVar323 = "";
    pzSourceVar323 = "vi-VN";
    PRStackFrame ctxt_frame_266 = null;
    try {
        ctxt_frame_266 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_266.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar323, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_266);
    }
}

actionEpilog(pz_CurrentTraceInfo,"53.2", "Set .pyLanguage", source_106, target_106);
return CODE_CONTINUE;
}private int updatePage_54(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_107 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_107 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"54.1", "Set .pyDescription", source_107, target_107);
{
    String pzSourceVar325 = "";
    pzSourceVar325 = "Welsh CY_GB (Cymraeg)";
    PRStackFrame ctxt_frame_268 = null;
    try {
        ctxt_frame_268 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_268.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar325, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_268);
    }
}

actionEpilog(pz_CurrentTraceInfo,"54.1", "Set .pyDescription", source_107, target_107);
ClipboardPage source_108 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_108 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"54.2", "Set .pyLanguage", source_108, target_108);
{
    String pzSourceVar327 = "";
    pzSourceVar327 = "cy-GB";
    PRStackFrame ctxt_frame_270 = null;
    try {
        ctxt_frame_270 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_270.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar327, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_270);
    }
}

actionEpilog(pz_CurrentTraceInfo,"54.2", "Set .pyLanguage", source_108, target_108);
return CODE_CONTINUE;
}private int updatePage_55(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_109 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_109 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"55.1", "Set .pyDescription", source_109, target_109);
{
    String pzSourceVar329 = "";
    pzSourceVar329 = "Dutch NL_BE (Belgium)";
    PRStackFrame ctxt_frame_272 = null;
    try {
        ctxt_frame_272 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_272.getStepPage();
        pega.setViaPropRef(".pyDescription", pRef_112, myStepPage, pzSourceVar329, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_272);
    }
}

actionEpilog(pz_CurrentTraceInfo,"55.1", "Set .pyDescription", source_109, target_109);
ClipboardPage source_110 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_110 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"55.2", "Set .pyLanguage", source_110, target_110);
{
    String pzSourceVar331 = "";
    pzSourceVar331 = "nl-BE";
    PRStackFrame ctxt_frame_274 = null;
    try {
        ctxt_frame_274 = pega.pushStackFrame("Embed-Language", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_274.getStepPage();
        pega.setViaPropRef(".pyLanguage", pRef_115, myStepPage, pzSourceVar331, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_274);
    }
}

actionEpilog(pz_CurrentTraceInfo,"55.2", "Set .pyLanguage", source_110, target_110);
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
	"Rule-Obj-Model:PZLANGUAGELIST"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLANGUAGELIST","Rule-Obj-Model","EMBED-LANGUAGE",false,"","Pega-ProCom","08-23-01","RULE-OBJ-MODEL EMBED-LANGUAGE PZLANGUAGELIST #20230718T091811.389 GMT","!PZLANGUAGELIST",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1229120993)
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
//	RULE-OBJ-MODEL EMBED-LANGUAGE PZLANGUAGELIST #20230718T091811.389 GMT:20230718T091811.389 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "c23b8d3b6c2721c83ded80c92d1a0ddd";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-Language";
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

public static final String[] pRef_112 = new String[] { "", "", "pyDescription", "" };
public static final String[] pRef_115 = new String[] { "", "", "pyLanguage", "" };

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL EMBED-LANGUAGE PZLANGUAGELIST #20230718T091811.389 GMT", "Embed-Language pzLanguageList", "Pega-ProCom", "08-23-01", "20230718T091811.389 GMT");
}
