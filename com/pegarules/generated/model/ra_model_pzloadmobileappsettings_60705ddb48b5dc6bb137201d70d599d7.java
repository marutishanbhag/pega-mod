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
public class ra_model_pzloadmobileappsettings_60705ddb48b5dc6bb137201d70d599d7 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzLoadMobileAppSettings.Pega_Designer_AppSettings.Model");
	public ra_model_pzloadmobileappsettings_60705ddb48b5dc6bb137201d70d599d7(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL PEGA-DESIGNER-APPSETTINGS PZLOADMOBILEAPPSETTINGS #20180713T141242.033 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
} else {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "Otherwise", null, target_2);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "Otherwise", null, target_2);
}
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "When", null, target_3);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "When", null, target_3);
} else {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "Otherwise", null, target_4);
if (otherwise_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Otherwise", null, target_4);
}
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5", "Set .pxAppIcons(1).pyLabel", source_1, target_5);
{
    pega.setViaPropRef(".pxAppIcons(1).pyLabel", pRef_1, myStepPage, "Default", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5", "Set .pxAppIcons(1).pyLabel", source_1, target_5);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6", "Set .pxAppIcons(1).pyImage", source_2, target_6);
{
    pega.setViaPropRef(".pxAppIcons(1).pyImage", pRef_2, myStepPage, "webwb/pyAppIcon_Default.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6", "Set .pxAppIcons(1).pyImage", source_2, target_6);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7", "Set .pxAppIcons(1).pyName", source_3, target_7);
{
    pega.setViaPropRef(".pxAppIcons(1).pyName", pRef_3, myStepPage, "default", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"7", "Set .pxAppIcons(1).pyName", source_3, target_7);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8", "Set .pxAppIcons(1).pyFileName", source_4, target_8);
{
    pega.setViaPropRef(".pxAppIcons(1).pyFileName", pRef_4, myStepPage, "webwb/pyAppIcon_Default.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"8", "Set .pxAppIcons(1).pyFileName", source_4, target_8);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9", "Set .pxAppIcons(2).pyLabel", source_5, target_9);
{
    pega.setViaPropRef(".pxAppIcons(2).pyLabel", pRef_5, myStepPage, "Blue", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"9", "Set .pxAppIcons(2).pyLabel", source_5, target_9);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10", "Set .pxAppIcons(2).pyImage", source_6, target_10);
{
    pega.setViaPropRef(".pxAppIcons(2).pyImage", pRef_6, myStepPage, "webwb/pyAppIcon_Blue.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"10", "Set .pxAppIcons(2).pyImage", source_6, target_10);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11", "Set .pxAppIcons(2).pyFileName", source_7, target_11);
{
    pega.setViaPropRef(".pxAppIcons(2).pyFileName", pRef_7, myStepPage, "webwb/pyAppIcon_Blue_Selected.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"11", "Set .pxAppIcons(2).pyFileName", source_7, target_11);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12", "Set .pxAppIcons(2).pyName", source_8, target_12);
{
    pega.setViaPropRef(".pxAppIcons(2).pyName", pRef_8, myStepPage, "blue", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"12", "Set .pxAppIcons(2).pyName", source_8, target_12);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13", "Set .pxAppIcons(3).pyLabel", source_9, target_13);
{
    pega.setViaPropRef(".pxAppIcons(3).pyLabel", pRef_9, myStepPage, "Red", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"13", "Set .pxAppIcons(3).pyLabel", source_9, target_13);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"14", "Set .pxAppIcons(3).pyImage", source_10, target_14);
{
    pega.setViaPropRef(".pxAppIcons(3).pyImage", pRef_10, myStepPage, "webwb/pyAppIcon_Red.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"14", "Set .pxAppIcons(3).pyImage", source_10, target_14);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"15", "Set .pxAppIcons(3).pyFileName", source_11, target_15);
{
    pega.setViaPropRef(".pxAppIcons(3).pyFileName", pRef_11, myStepPage, "webwb/pyAppIcon_Red_Selected.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"15", "Set .pxAppIcons(3).pyFileName", source_11, target_15);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"16", "Set .pxAppIcons(3).pyName", source_12, target_16);
{
    pega.setViaPropRef(".pxAppIcons(3).pyName", pRef_12, myStepPage, "red", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"16", "Set .pxAppIcons(3).pyName", source_12, target_16);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"17", "Set .pxAppIcons(4).pyLabel", source_13, target_17);
{
    pega.setViaPropRef(".pxAppIcons(4).pyLabel", pRef_13, myStepPage, "Green", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"17", "Set .pxAppIcons(4).pyLabel", source_13, target_17);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18", "Set .pxAppIcons(4).pyImage", source_14, target_18);
{
    pega.setViaPropRef(".pxAppIcons(4).pyImage", pRef_14, myStepPage, "webwb/pyAppIcon_Green.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"18", "Set .pxAppIcons(4).pyImage", source_14, target_18);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19", "Set .pxAppIcons(4).pyFileName", source_15, target_19);
{
    pega.setViaPropRef(".pxAppIcons(4).pyFileName", pRef_15, myStepPage, "webwb/pyAppIcon_Green_Selected.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"19", "Set .pxAppIcons(4).pyFileName", source_15, target_19);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20", "Set .pxAppIcons(4).pyName", source_16, target_20);
{
    pega.setViaPropRef(".pxAppIcons(4).pyName", pRef_16, myStepPage, "green", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"20", "Set .pxAppIcons(4).pyName", source_16, target_20);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21", "Set .pxSplashScreens(1).pyLabel", source_17, target_21);
{
    pega.setViaPropRef(".pxSplashScreens(1).pyLabel", pRef_17, myStepPage, "Blue", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"21", "Set .pxSplashScreens(1).pyLabel", source_17, target_21);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"22", "Set .pxSplashScreens(1).pyImage", source_18, target_22);
{
    pega.setViaPropRef(".pxSplashScreens(1).pyImage", pRef_18, myStepPage, "webwb/pySplashScreen_Blue.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"22", "Set .pxSplashScreens(1).pyImage", source_18, target_22);
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"23", "Set .pxSplashScreens(1).pyFileName", source_19, target_23);
{
    pega.setViaPropRef(".pxSplashScreens(1).pyFileName", pRef_19, myStepPage, "webwb/pySplashScreen_Blue_Selected.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"23", "Set .pxSplashScreens(1).pyFileName", source_19, target_23);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"24", "Set .pxSplashScreens(1).pyName", source_20, target_24);
{
    pega.setViaPropRef(".pxSplashScreens(1).pyName", pRef_20, myStepPage, "blue", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"24", "Set .pxSplashScreens(1).pyName", source_20, target_24);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"25", "Set .pxSplashScreens(2).pyLabel", source_21, target_25);
{
    pega.setViaPropRef(".pxSplashScreens(2).pyLabel", pRef_21, myStepPage, "Red", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"25", "Set .pxSplashScreens(2).pyLabel", source_21, target_25);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"26", "Set .pxSplashScreens(2).pyImage", source_22, target_26);
{
    pega.setViaPropRef(".pxSplashScreens(2).pyImage", pRef_22, myStepPage, "webwb/pySplashScreen_Red.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"26", "Set .pxSplashScreens(2).pyImage", source_22, target_26);
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"27", "Set .pxSplashScreens(2).pyFileName", source_23, target_27);
{
    pega.setViaPropRef(".pxSplashScreens(2).pyFileName", pRef_23, myStepPage, "webwb/pySplashScreen_Red_Selected.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"27", "Set .pxSplashScreens(2).pyFileName", source_23, target_27);
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"28", "Set .pxSplashScreens(2).pyName", source_24, target_28);
{
    pega.setViaPropRef(".pxSplashScreens(2).pyName", pRef_24, myStepPage, "red", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"28", "Set .pxSplashScreens(2).pyName", source_24, target_28);
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"29", "Set .pxSplashScreens(3).pyLabel", source_25, target_29);
{
    pega.setViaPropRef(".pxSplashScreens(3).pyLabel", pRef_25, myStepPage, "Green", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"29", "Set .pxSplashScreens(3).pyLabel", source_25, target_29);
ClipboardPage source_26 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"30", "Set .pxSplashScreens(3).pyImage", source_26, target_30);
{
    pega.setViaPropRef(".pxSplashScreens(3).pyImage", pRef_26, myStepPage, "webwb/pySplashScreen_Green.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"30", "Set .pxSplashScreens(3).pyImage", source_26, target_30);
ClipboardPage source_27 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"31", "Set .pxSplashScreens(3).pyFileName", source_27, target_31);
{
    pega.setViaPropRef(".pxSplashScreens(3).pyFileName", pRef_27, myStepPage, "webwb/pySplashScreen_Green_Selected.png", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"31", "Set .pxSplashScreens(3).pyFileName", source_27, target_31);
ClipboardPage source_28 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"32", "Set .pxSplashScreens(3).pyName", source_28, target_32);
{
    pega.setViaPropRef(".pxSplashScreens(3).pyName", pRef_28, myStepPage, "green", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"32", "Set .pxSplashScreens(3).pyName", source_28, target_32);
ClipboardPage source_29 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"33", "Set .pyPegaMobileBuildSelected", source_29, target_33);
{
    pega.setViaPropRef(".pyPegaMobileBuildSelected", pRef_29, myStepPage, "ios", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"33", "Set .pyPegaMobileBuildSelected", source_29, target_33);
ClipboardPage source_30 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_34 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"34", "Set .pyAppIconOld", source_30, target_34);
{
    pega.setViaPropRef(".pyAppIconOld", pRef_30, myStepPage, scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"34", "Set .pyAppIconOld", source_30, target_34);
ClipboardPage source_31 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_35 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"35", "Set .pySplashScreenOld", source_31, target_35);
{
    pega.setViaPropRef(".pySplashScreenOld", pRef_32, myStepPage, scalarValueQuery_33.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"35", "Set .pySplashScreenOld", source_31, target_35);
ClipboardPage source_32 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_36 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"36", "Set .pyMobileAppNameOld", source_32, target_36);
{
    pega.setViaPropRef(".pyMobileAppNameOld", pRef_34, myStepPage, scalarValueQuery_35.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"36", "Set .pyMobileAppNameOld", source_32, target_36);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Application.pyAppIcon==\"\"");
try {
boolean pz_36 = (scalarValueQuery_31.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Application.pyAppIcon==\"\"",pz_36);
return pz_36;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Application.pyAppIcon==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_33 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_37 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set .pyAppIcon", source_33, target_37);
{
    pega.setViaPropRef(".pyAppIcon", pRef_37, myStepPage, "default", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1.1", "Set .pyAppIcon", source_33, target_37);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_34 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_38 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyAppIcon", source_34, target_38);
{
    pega.setViaPropRef(".pyAppIcon", pRef_37, myStepPage, scalarValueQuery_31.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyAppIcon", source_34, target_38);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Application.pySplashScreen==\"\"");
try {
boolean pz_38 = (scalarValueQuery_33.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Application.pySplashScreen==\"\"",pz_38);
return pz_38;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Application.pySplashScreen==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_35 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_39 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pySplashScreen", source_35, target_39);
{
    pega.setViaPropRef(".pySplashScreen", pRef_39, myStepPage, "blue", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pySplashScreen", source_35, target_39);
return CODE_CONTINUE;
}private int otherwise_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_36 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_40 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pySplashScreen", source_36, target_40);
{
    pega.setViaPropRef(".pySplashScreen", pRef_39, myStepPage, scalarValueQuery_33.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pySplashScreen", source_36, target_40);
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
	"Rule-Obj-Model:PZLOADMOBILEAPPSETTINGS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOADMOBILEAPPSETTINGS","Rule-Obj-Model","PEGA-DESIGNER-APPSETTINGS",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-MODEL PEGA-DESIGNER-APPSETTINGS PZLOADMOBILEAPPSETTINGS #20180713T141242.033 GMT","!PZLOADMOBILEAPPSETTINGS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1478755220)
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
//	RULE-OBJ-MODEL PEGA-DESIGNER-APPSETTINGS PZLOADMOBILEAPPSETTINGS #20180713T141242.033 GMT:20180713T141242.033 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "436fcb3ba098817796a3dfff13d5cc25";
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

public static final String[] pRef_37 = new String[] { "", "", "pyAppIcon", "" };
public static final String[] pRef_22 = new String[] { "", "", "pxSplashScreens", "2", "pyImage", "" };
public static final String[] pRef_11 = new String[] { "", "", "pxAppIcons", "3", "pyFileName", "" };
public static final String[] pRef_23 = new String[] { "", "", "pxSplashScreens", "2", "pyFileName", "" };
public static final String[] pRef_39 = new String[] { "", "", "pySplashScreen", "" };
public static final String[] pRef_6 = new String[] { "", "", "pxAppIcons", "2", "pyImage", "" };
public static final String[] pRef_4 = new String[] { "", "", "pxAppIcons", "1", "pyFileName", "" };
public static final String[] pRef_8 = new String[] { "", "", "pxAppIcons", "2", "pyName", "" };
public static final String[] pRef_20 = new String[] { "", "", "pxSplashScreens", "1", "pyName", "" };
public static final String[] pRef_21 = new String[] { "", "", "pxSplashScreens", "2", "pyLabel", "" };
public static final String[] pRef_1 = new String[] { "", "", "pxAppIcons", "1", "pyLabel", "" };
public static final String[] pRef_13 = new String[] { "", "", "pxAppIcons", "4", "pyLabel", "" };
public static final String[] pRef_16 = new String[] { "", "", "pxAppIcons", "4", "pyName", "" };
public static final String[] pRef_18 = new String[] { "", "", "pxSplashScreens", "1", "pyImage", "" };
public static final String[] pRef_17 = new String[] { "", "", "pxSplashScreens", "1", "pyLabel", "" };
public static final String[] pRef_5 = new String[] { "", "", "pxAppIcons", "2", "pyLabel", "" };
public static final String[] pRef_14 = new String[] { "", "", "pxAppIcons", "4", "pyImage", "" };
public static final String[] pRef_15 = new String[] { "", "", "pxAppIcons", "4", "pyFileName", "" };
public static final String[] pRef_24 = new String[] { "", "", "pxSplashScreens", "2", "pyName", "" };
public static final String[] pRef_12 = new String[] { "", "", "pxAppIcons", "3", "pyName", "" };
public static final String[] pRef_2 = new String[] { "", "", "pxAppIcons", "1", "pyImage", "" };
public static final String[] pRef_19 = new String[] { "", "", "pxSplashScreens", "1", "pyFileName", "" };
public static final String[] pRef_9 = new String[] { "", "", "pxAppIcons", "3", "pyLabel", "" };
public static final String[] pRef_28 = new String[] { "", "", "pxSplashScreens", "3", "pyName", "" };
public static final String[] pRef_10 = new String[] { "", "", "pxAppIcons", "3", "pyImage", "" };
public static final String[] pRef_32 = new String[] { "", "", "pySplashScreenOld", "" };
public static final String[] pRef_27 = new String[] { "", "", "pxSplashScreens", "3", "pyFileName", "" };
public static final String[] pRef_7 = new String[] { "", "", "pxAppIcons", "2", "pyFileName", "" };
public static final String[] pRef_26 = new String[] { "", "", "pxSplashScreens", "3", "pyImage", "" };
public static final String[] pRef_29 = new String[] { "", "", "pyPegaMobileBuildSelected", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyAppIconOld", "" };
public static final String[] pRef_34 = new String[] { "", "", "pyMobileAppNameOld", "" };
public static final String[] pRef_25 = new String[] { "", "", "pxSplashScreens", "3", "pyLabel", "" };
public static final String[] pRef_3 = new String[] { "", "", "pxAppIcons", "1", "pyName", "" };
private static final ScalarValueQuery scalarValueQuery_33 = FUAUtil.createQueryBuilder().scalarProperty("pySplashScreen").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_35 = FUAUtil.createQueryBuilder().scalarProperty("pyMobileApplicationName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().scalarProperty("pyAppIcon").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL PEGA-DESIGNER-APPSETTINGS PZLOADMOBILEAPPSETTINGS #20180713T141242.033 GMT", "Pega-Designer-AppSettings pzLoadMobileAppSettings", "Pega-ProcessArchitect", "08-01-01", "20180713T141242.033 GMT");
}
