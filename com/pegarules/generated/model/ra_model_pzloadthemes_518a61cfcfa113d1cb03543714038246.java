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
public class ra_model_pzloadthemes_518a61cfcfa113d1cb03543714038246 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzLoadThemes.Pega_Designer_AppSettings.Model");
	public ra_model_pzloadthemes_518a61cfcfa113d1cb03543714038246(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL PEGA-DESIGNER-APPSETTINGS PZLOADTHEMES #20190621T145345.895 GMT	Pega-ProcessArchitect:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set param.inheritedSkin", source_1, target_1);
{
    tools.putParamValue("inheritedSkin", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("lookup--(String,String,String,String,String)", "lookup", null, null, new Object[] { ".pyInheritedSkins(1).pyPurpose", "Rule-PortalSkin", "pyPurpose", scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "" }));
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set param.inheritedSkin", source_1, target_1);
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "When", null, target_2);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "When", null, target_2);
} else if (otherwiseWhenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "Otherwise When", null, target_3);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "Otherwise When", null, target_3);
} else {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "Otherwise", null, target_4);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Otherwise", null, target_4);
}
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5", "Set Application.pyLogoReference", source_2, target_5);
{
    pega.setViaPropRef(".pyLogoReference", pRef_2, pega.findPageWithException("Application", "Rule-Application"), ((scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT).equals("")) ? "webwb/py-logo.svg" : scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5", "Set Application.pyLogoReference", source_2, target_5);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6", "Set .pxResults(1).pxObjClass", source_3, target_6);
// Change obj class
String pz_7 = "@baseclass";
ClipboardPage tempPage_1 = tools.createPage(pz_7, "");
ClipboardProperty pz_6 = propertyQuery_4.resolve(tools, myStepPage);
ClipboardPage targetPage_1 = pz_6.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"6", "Set .pxResults(1).pxObjClass", source_3, target_6);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7", "Set .pxResults(1).pyName", source_4, target_7);
{
    pega.setViaPropRef(".pxResults(1).pyName", pRef_8, myStepPage, "pyEndUser_ExpressDefault", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"7", "Set .pxResults(1).pyName", source_4, target_7);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8", "Set .pxResults(1).pyImage", source_5, target_8);
{
    pega.setViaPropRef(".pxResults(1).pyImage", pRef_9, myStepPage, "webwb/pyTheme_Default.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"8", "Set .pxResults(1).pyImage", source_5, target_8);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9", "Set .pxResults(1).pyLabel", source_6, target_9);
{
    pega.setViaPropRef(".pxResults(1).pyLabel", pRef_10, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Default", ".pyButtonLabel", tools }), "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"9", "Set .pxResults(1).pyLabel", source_6, target_9);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10", "Set .pxResults(2).pxObjClass", source_7, target_10);
// Change obj class
String pz_14 = "@baseclass";
ClipboardPage tempPage_2 = tools.createPage(pz_14, "");
ClipboardProperty pz_13 = propertyQuery_11.resolve(tools, myStepPage);
ClipboardPage targetPage_2 = pz_13.getParentPage();
targetPage_2.putAll(tempPage_2, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_2, false);
actionEpilog(pz_CurrentTraceInfo,"10", "Set .pxResults(2).pxObjClass", source_7, target_10);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11", "Set .pxResults(2).pyName", source_8, target_11);
{
    pega.setViaPropRef(".pxResults(2).pyName", pRef_15, myStepPage, "pyEndUser_Mantis", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"11", "Set .pxResults(2).pyName", source_8, target_11);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12", "Set .pxResults(2).pyImage", source_9, target_12);
{
    pega.setViaPropRef(".pxResults(2).pyImage", pRef_16, myStepPage, "webwb/pyTheme_Zen.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"12", "Set .pxResults(2).pyImage", source_9, target_12);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13", "Set .pxResults(2).pyLabel", source_10, target_13);
{
    pega.setViaPropRef(".pxResults(2).pyLabel", pRef_17, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Mantis", ".pyButtonLabel", tools }), "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"13", "Set .pxResults(2).pyLabel", source_10, target_13);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"14", "Set .pxResults(3).pxObjClass", source_11, target_14);
// Change obj class
String pz_21 = "@baseclass";
ClipboardPage tempPage_3 = tools.createPage(pz_21, "");
ClipboardProperty pz_20 = propertyQuery_18.resolve(tools, myStepPage);
ClipboardPage targetPage_3 = pz_20.getParentPage();
targetPage_3.putAll(tempPage_3, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_3, false);
actionEpilog(pz_CurrentTraceInfo,"14", "Set .pxResults(3).pxObjClass", source_11, target_14);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"15", "Set .pxResults(3).pyName", source_12, target_15);
{
    pega.setViaPropRef(".pxResults(3).pyName", pRef_22, myStepPage, "pyEndUser_Flame", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"15", "Set .pxResults(3).pyName", source_12, target_15);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"16", "Set .pxResults(3).pyImage", source_13, target_16);
{
    pega.setViaPropRef(".pxResults(3).pyImage", pRef_23, myStepPage, "webwb/pyTheme_Zen.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"16", "Set .pxResults(3).pyImage", source_13, target_16);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"17", "Set .pxResults(3).pyLabel", source_14, target_17);
{
    pega.setViaPropRef(".pxResults(3).pyLabel", pRef_24, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Flame", ".pyButtonLabel", tools }), "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"17", "Set .pxResults(3).pyLabel", source_14, target_17);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18", "Set .pxResults(4).pxObjClass", source_15, target_18);
// Change obj class
String pz_28 = "@baseclass";
ClipboardPage tempPage_4 = tools.createPage(pz_28, "");
ClipboardProperty pz_27 = propertyQuery_25.resolve(tools, myStepPage);
ClipboardPage targetPage_4 = pz_27.getParentPage();
targetPage_4.putAll(tempPage_4, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_4, false);
actionEpilog(pz_CurrentTraceInfo,"18", "Set .pxResults(4).pxObjClass", source_15, target_18);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19", "Set .pxResults(4).pyName", source_16, target_19);
{
    pega.setViaPropRef(".pxResults(4).pyName", pRef_29, myStepPage, "pyEndUser_PictonBlue", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"19", "Set .pxResults(4).pyName", source_16, target_19);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20", "Set .pxResults(4).pyImage", source_17, target_20);
{
    pega.setViaPropRef(".pxResults(4).pyImage", pRef_30, myStepPage, "webwb/pyTheme_Zen.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"20", "Set .pxResults(4).pyImage", source_17, target_20);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21", "Set .pxResults(4).pyLabel", source_18, target_21);
{
    pega.setViaPropRef(".pxResults(4).pyLabel", pRef_31, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "PictonBlue", ".pyButtonLabel", tools }), "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"21", "Set .pxResults(4).pyLabel", source_18, target_21);
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"22", "Set .pxResults(5).pxObjClass", source_19, target_22);
// Change obj class
String pz_35 = "@baseclass";
ClipboardPage tempPage_5 = tools.createPage(pz_35, "");
ClipboardProperty pz_34 = propertyQuery_32.resolve(tools, myStepPage);
ClipboardPage targetPage_5 = pz_34.getParentPage();
targetPage_5.putAll(tempPage_5, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_5, false);
actionEpilog(pz_CurrentTraceInfo,"22", "Set .pxResults(5).pxObjClass", source_19, target_22);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"23", "Set .pxResults(5).pyName", source_20, target_23);
{
    pega.setViaPropRef(".pxResults(5).pyName", pRef_36, myStepPage, "pyEndUser_HoneyFlower", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"23", "Set .pxResults(5).pyName", source_20, target_23);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"24", "Set .pxResults(5).pyImage", source_21, target_24);
{
    pega.setViaPropRef(".pxResults(5).pyImage", pRef_37, myStepPage, "webwb/pyTheme_Zen.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"24", "Set .pxResults(5).pyImage", source_21, target_24);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"25", "Set .pxResults(5).pyLabel", source_22, target_25);
{
    pega.setViaPropRef(".pxResults(5).pyLabel", pRef_38, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "HoneyFlower", ".pyButtonLabel", tools }), "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"25", "Set .pxResults(5).pyLabel", source_22, target_25);
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"26", "Set .pxResults(6).pxObjClass", source_23, target_26);
// Change obj class
String pz_42 = "@baseclass";
ClipboardPage tempPage_6 = tools.createPage(pz_42, "");
ClipboardProperty pz_41 = propertyQuery_39.resolve(tools, myStepPage);
ClipboardPage targetPage_6 = pz_41.getParentPage();
targetPage_6.putAll(tempPage_6, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_6, false);
actionEpilog(pz_CurrentTraceInfo,"26", "Set .pxResults(6).pxObjClass", source_23, target_26);
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"27", "Set .pxResults(6).pyName", source_24, target_27);
{
    pega.setViaPropRef(".pxResults(6).pyName", pRef_43, myStepPage, "pyEndUser_Keppel", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"27", "Set .pxResults(6).pyName", source_24, target_27);
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"28", "Set .pxResults(6).pyImage", source_25, target_28);
{
    pega.setViaPropRef(".pxResults(6).pyImage", pRef_44, myStepPage, "webwb/pyTheme_Zen.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"28", "Set .pxResults(6).pyImage", source_25, target_28);
ClipboardPage source_26 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"29", "Set .pxResults(6).pyLabel", source_26, target_29);
{
    pega.setViaPropRef(".pxResults(6).pyLabel", pRef_45, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Keppel", ".pyButtonLabel", tools }), "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"29", "Set .pxResults(6).pyLabel", source_26, target_29);
ClipboardPage source_27 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"30", "Set .pxResults(7).pxObjClass", source_27, target_30);
// Change obj class
String pz_49 = "@baseclass";
ClipboardPage tempPage_7 = tools.createPage(pz_49, "");
ClipboardProperty pz_48 = propertyQuery_46.resolve(tools, myStepPage);
ClipboardPage targetPage_7 = pz_48.getParentPage();
targetPage_7.putAll(tempPage_7, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_7, false);
actionEpilog(pz_CurrentTraceInfo,"30", "Set .pxResults(7).pxObjClass", source_27, target_30);
ClipboardPage source_28 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"31", "Set .pxResults(7).pyName", source_28, target_31);
{
    pega.setViaPropRef(".pxResults(7).pyName", pRef_50, myStepPage, "pyEndUser_DeepCerise", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"31", "Set .pxResults(7).pyName", source_28, target_31);
ClipboardPage source_29 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"32", "Set .pxResults(7).pyImage", source_29, target_32);
{
    pega.setViaPropRef(".pxResults(7).pyImage", pRef_51, myStepPage, "webwb/pyTheme_Zen.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"32", "Set .pxResults(7).pyImage", source_29, target_32);
ClipboardPage source_30 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"33", "Set .pxResults(7).pyLabel", source_30, target_33);
{
    pega.setViaPropRef(".pxResults(7).pyLabel", pRef_52, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "DeepCerise", ".pyButtonLabel", tools }), "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"33", "Set .pxResults(7).pyLabel", source_30, target_33);
ClipboardPage source_31 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_34 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"34", "Set .pxResults(8).pxObjClass", source_31, target_34);
// Change obj class
String pz_56 = "@baseclass";
ClipboardPage tempPage_8 = tools.createPage(pz_56, "");
ClipboardProperty pz_55 = propertyQuery_53.resolve(tools, myStepPage);
ClipboardPage targetPage_8 = pz_55.getParentPage();
targetPage_8.putAll(tempPage_8, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_8, false);
actionEpilog(pz_CurrentTraceInfo,"34", "Set .pxResults(8).pxObjClass", source_31, target_34);
ClipboardPage source_32 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_35 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"35", "Set .pxResults(8).pyName", source_32, target_35);
{
    pega.setViaPropRef(".pxResults(8).pyName", pRef_57, myStepPage, "pyEndUser_TulipTree", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"35", "Set .pxResults(8).pyName", source_32, target_35);
ClipboardPage source_33 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_36 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"36", "Set .pxResults(8).pyImage", source_33, target_36);
{
    pega.setViaPropRef(".pxResults(8).pyImage", pRef_58, myStepPage, "webwb/pyTheme_Zen.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"36", "Set .pxResults(8).pyImage", source_33, target_36);
ClipboardPage source_34 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_37 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"37", "Set .pxResults(8).pyLabel", source_34, target_37);
{
    pega.setViaPropRef(".pxResults(8).pyLabel", pRef_59, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "TulipTree", ".pyButtonLabel", tools }), "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"37", "Set .pxResults(8).pyLabel", source_34, target_37);
ClipboardPage source_35 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_38 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"38", "Set .pyLegacyThemes(1).pyName", source_35, target_38);
{
    pega.setViaPropRef(".pyLegacyThemes(1).pyName", pRef_60, myStepPage, "pyEndUser71", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"38", "Set .pyLegacyThemes(1).pyName", source_35, target_38);
ClipboardPage source_36 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_39 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"39", "Set .pyLegacyThemes(2).pyName", source_36, target_39);
{
    pega.setViaPropRef(".pyLegacyThemes(2).pyName", pRef_61, myStepPage, "pyEndUser", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"39", "Set .pyLegacyThemes(2).pyName", source_36, target_39);
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
boolean pz__1 = pega.invokeWhen("pzIsInheritedFromExpressSkins", "Pega-Designer-AppSettings", "Pega-Designer-AppSettings");
return pz__1;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_37 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_40 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyName", source_37, target_40);
{
    pega.setViaPropRef(".pyName", pRef_62, myStepPage, tools.getParamValue("inheritedSkin"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyName", source_37, target_40);
ClipboardPage source_38 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_41 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pySkinInheritingFromExpress", source_38, target_41);
{
    pega.setViaPropRef(".pySkinInheritingFromExpress", pRef_63, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pySkinInheritingFromExpress", source_38, target_41);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.inheritedSkin==\"CosmosSkin\"");
try {
boolean pz_64 = (tools.getParamValue("inheritedSkin").equals("CosmosSkin"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.inheritedSkin==\"CosmosSkin\"",pz_64);
return pz_64;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.inheritedSkin==\"CosmosSkin\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_39 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_42 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pyName", source_39, target_42);
{
    pega.setViaPropRef(".pyName", pRef_62, myStepPage, tools.getParamValue("inheritedSkin"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pyName", source_39, target_42);
ClipboardPage source_40 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_43 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set .pySkinInheritingFromExpress", source_40, target_43);
{
    pega.setViaPropRef(".pySkinInheritingFromExpress", pRef_63, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set .pySkinInheritingFromExpress", source_40, target_43);
actionProlog(pz_CurrentTraceInfo,"3.3", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"3.3", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_41 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_44 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pyName", source_41, target_44);
{
    pega.setViaPropRef(".pyName", pRef_62, myStepPage, scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pyName", source_41, target_44);
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
	"Rule-Obj-Model:PZLOADTHEMES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOADTHEMES","Rule-Obj-Model","PEGA-DESIGNER-APPSETTINGS",false,"","Pega-ProcessArchitect","08-04-01","RULE-OBJ-MODEL PEGA-DESIGNER-APPSETTINGS PZLOADTHEMES #20190621T145345.895 GMT","!PZLOADTHEMES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1002136375)
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
//	RULE-OBJ-MODEL PEGA-DESIGNER-APPSETTINGS PZLOADTHEMES #20190621T145345.895 GMT:20191210T065727.654 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ca4d3be59acaa4f752b321998544664f";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Designer-AppSettings";
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

public static final String[] pRef_60 = new String[] { "", "", "pyLegacyThemes", "1", "pyName", "" };
public static final String[] pRef_24 = new String[] { "", "", "pxResults", "3", "pyLabel", "" };
public static final String[] pRef_5 = new String[] { "", "", "pxResults", "1", "pxObjClass", "" };
public static final String[] pRef_40 = new String[] { "", "", "pxResults", "6", "pxObjClass", "" };
public static final String[] pRef_45 = new String[] { "", "", "pxResults", "6", "pyLabel", "" };
public static final String[] pRef_22 = new String[] { "", "", "pxResults", "3", "pyName", "" };
public static final String[] pRef_63 = new String[] { "", "", "pySkinInheritingFromExpress", "" };
public static final String[] pRef_36 = new String[] { "", "", "pxResults", "5", "pyName", "" };
public static final String[] pRef_10 = new String[] { "", "", "pxResults", "1", "pyLabel", "" };
public static final String[] pRef_61 = new String[] { "", "", "pyLegacyThemes", "2", "pyName", "" };
public static final String[] pRef_31 = new String[] { "", "", "pxResults", "4", "pyLabel", "" };
public static final String[] pRef_26 = new String[] { "", "", "pxResults", "4", "pxObjClass", "" };
public static final String[] pRef_57 = new String[] { "", "", "pxResults", "8", "pyName", "" };
public static final String[] pRef_12 = new String[] { "", "", "pxResults", "2", "pxObjClass", "" };
public static final String[] pRef_23 = new String[] { "", "", "pxResults", "3", "pyImage", "" };
public static final String[] pRef_29 = new String[] { "", "", "pxResults", "4", "pyName", "" };
public static final String[] pRef_44 = new String[] { "", "", "pxResults", "6", "pyImage", "" };
public static final String[] pRef_62 = new String[] { "", "", "pyName", "" };
public static final String[] pRef_47 = new String[] { "", "", "pxResults", "7", "pxObjClass", "" };
public static final String[] pRef_52 = new String[] { "", "", "pxResults", "7", "pyLabel", "" };
public static final String[] pRef_51 = new String[] { "", "", "pxResults", "7", "pyImage", "" };
public static final String[] pRef_33 = new String[] { "", "", "pxResults", "5", "pxObjClass", "" };
public static final String[] pRef_50 = new String[] { "", "", "pxResults", "7", "pyName", "" };
public static final String[] pRef_16 = new String[] { "", "", "pxResults", "2", "pyImage", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyLogoReference", "" };
public static final String[] pRef_8 = new String[] { "", "", "pxResults", "1", "pyName", "" };
public static final String[] pRef_59 = new String[] { "", "", "pxResults", "8", "pyLabel", "" };
public static final String[] pRef_30 = new String[] { "", "", "pxResults", "4", "pyImage", "" };
public static final String[] pRef_37 = new String[] { "", "", "pxResults", "5", "pyImage", "" };
public static final String[] pRef_9 = new String[] { "", "", "pxResults", "1", "pyImage", "" };
public static final String[] pRef_58 = new String[] { "", "", "pxResults", "8", "pyImage", "" };
public static final String[] pRef_15 = new String[] { "", "", "pxResults", "2", "pyName", "" };
public static final String[] pRef_19 = new String[] { "", "", "pxResults", "3", "pxObjClass", "" };
public static final String[] pRef_54 = new String[] { "", "", "pxResults", "8", "pxObjClass", "" };
public static final String[] pRef_38 = new String[] { "", "", "pxResults", "5", "pyLabel", "" };
public static final String[] pRef_43 = new String[] { "", "", "pxResults", "6", "pyName", "" };
public static final String[] pRef_17 = new String[] { "", "", "pxResults", "2", "pyLabel", "" };
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyLogoReference").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_46 = FUAUtil.createQueryBuilder().pageList("pxResults", 7).scalarProperty("pxObjClass").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pySkinType").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_32 = FUAUtil.createQueryBuilder().pageList("pxResults", 5).scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_11 = FUAUtil.createQueryBuilder().pageList("pxResults", 2).scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_25 = FUAUtil.createQueryBuilder().pageList("pxResults", 4).scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_53 = FUAUtil.createQueryBuilder().pageList("pxResults", 8).scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_39 = FUAUtil.createQueryBuilder().pageList("pxResults", 6).scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_4 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).scalarProperty("pxObjClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_18 = FUAUtil.createQueryBuilder().pageList("pxResults", 3).scalarProperty("pxObjClass").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL PEGA-DESIGNER-APPSETTINGS PZLOADTHEMES #20190621T145345.895 GMT", "Pega-Designer-AppSettings pzLoadThemes", "Pega-ProcessArchitect", "08-04-01", "20191210T065727.654 GMT");
}
