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
public class ra_model_pzpopulateappaliastoauthservicemapping_57000ad245a697e3e5e8f4e5531f5758 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzpopulateAppAliasToAuthServiceMapping.Data_Admin_Security_Application_AuthServices.Model");
	public ra_model_pzpopulateappaliastoauthservicemapping_57000ad245a697e3e5e8f4e5531f5758(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZPOPULATEAPPALIASTOAUTHSERVICEMAPPING #20200917T070914.664 GMT	Pega-IntegrationEngine:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_1 = tools.getPrimaryPage().getIfPresent("pyAuthServiceList");
foreach_prop_1 = pz_1;
actionProlog(pz_CurrentTraceInfo,"1", "For Each Page In", null, pz_1);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_1 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_1 = false;
boolean pop_ctxt_page_2 = false;
try {
/* push '"Primary.pyAuthServiceList(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary.pyAuthServiceList(<CURRENT>)", ctxt_page_target_1);
/* push '"Primary.pyAuthServiceList(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "Primary.pyAuthServiceList(<CURRENT>)", ctxt_page_source_1);
switch (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_1;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_2) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"1", "For Each Page In", null, pz_1);
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_1 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "When", null, target_1);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "When", null, target_1);
}
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set Param.Temp", source_1, target_2);
{
    tools.putParamValue("Temp", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxClearMessages--()", "pxClearMessages", null, null, new Object[] {})).booleanValue()));
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set Param.Temp", source_1, target_2);
actionProlog(pz_CurrentTraceInfo,"4", "Remove .pyErrorPage", null, null);
// Start Property-Remove from Remove action
{
// Expression: .pyErrorPage
ClipboardProperty pz_3 = propertyQuery_2.resolve(tools, myStepPage);
try {if (pz_3!= null) {
pz_3.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +".";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
}// End Property-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"4", "Remove .pyErrorPage", null, null);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set Param.CurrAuthService", source_2, target_3);
{
    String pzSourceVar4 = "";
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("SingleValue-Text", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pzSourceVar4 = scalarValueQuery_5.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("SingleValue-Text", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        tools.putParamValue("CurrAuthService", PropertyInfo.TYPE_TEXT, pzSourceVar4);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1", "Set Param.CurrAuthService", source_2, target_3);
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_7 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_8 = null;
try {
ctxt_frame_8 = pega.pushStackFrame("Primary.pyAuthServiceListInfo", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_8.getStepPage();
pz_7 = tools.getPrimaryPage().getProperty("pyAuthServiceListInfo");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
} // return to previous step page

targetProperty_1 = pz_7;
// Acquire a reference to the source Page; we use this as the new source context
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = pega.findDataPage("D_pzGetAuthenticationServiceDetails", false, "pyName", tools.getParamValue("CurrAuthService"));
if (ctxt_page_3 != null) {
/* entering new scope */
boolean pop_ctxt_page_3 = false;
boolean pop_ctxt_page_5 = false;
try {
/* push '"Primary.pyAuthServiceListInfo"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_11 = null;
try {
ctxt_frame_11 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_11.getStepPage();
ClipboardPage ctxt_page_2 = null;
ctxt_page_2 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "Primary.pyAuthServiceListInfo", ctxt_page_2);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
} // return to previous step page
/* push '"D_pzGetAuthenticationServiceDetails[pyName:Param.CurrAuthService]"' to scope SOURCE */
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_12 = null;
try {
ctxt_frame_12 = pega.pushStackFrame("\"switching to update SOURCE\"", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_12.getStepPage();
ClipboardPage sourcePageRef_1 = null;
sourcePageRef_1 = ctxt_page_3;
pop_ctxt_page_5 = pega.pushScopedStepContext("SOURCE", "D_pzGetAuthenticationServiceDetails[pyName:Param.CurrAuthService]", sourcePageRef_1);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
} // return to previous step page
actionProlog(pz_CurrentTraceInfo,"1.2", "Append and Map to", ctxt_page_3, targetProperty_1);
switch (appendAndMapTo_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2", "Append and Map to", ctxt_page_3, targetProperty_1);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_5) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}
return CODE_CONTINUE;
}private int appendAndMapTo_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.1", "Set .pyName", source_3, target_4);
{
    String pzSourceVar10 = "";
    PRStackFrame ctxt_frame_14 = null;
    try {
        ctxt_frame_14 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_14.getStepPage();
        pzSourceVar10 = scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_14);
    }
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pega.setViaPropRef(".pyName", pRef_12, myStepPage, pzSourceVar10, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.1", "Set .pyName", source_3, target_4);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.2", "Set .pyAuthServiceAlias", source_4, target_5);
{
    String pzSourceVar14 = "";
    PRStackFrame ctxt_frame_18 = null;
    try {
        ctxt_frame_18 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_18.getStepPage();
        pzSourceVar14 = scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_18);
    }
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pega.setViaPropRef(".pyAuthServiceAlias", pRef_16, myStepPage, pzSourceVar14, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.2", "Set .pyAuthServiceAlias", source_4, target_5);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.3", "Set .pyAuthenticationServiceType", source_5, target_6);
{
    String pzSourceVar18 = "";
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pzSourceVar18 = scalarValueQuery_19.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
    PRStackFrame ctxt_frame_21 = null;
    try {
        ctxt_frame_21 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_21.getStepPage();
        pega.setViaPropRef(".pyAuthenticationServiceType", pRef_20, myStepPage, pzSourceVar18, "stN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.3", "Set .pyAuthenticationServiceType", source_5, target_6);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.4", "Set .pyEnableAuthService", source_6, target_7);
{
    String pzSourceVar22 = "";
    PRStackFrame ctxt_frame_26 = null;
    try {
        ctxt_frame_26 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_26.getStepPage();
        pzSourceVar22 = scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_26);
    }
    PRStackFrame ctxt_frame_25 = null;
    try {
        ctxt_frame_25 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_25.getStepPage();
        pega.setViaPropRef(".pyEnableAuthService", pRef_24, myStepPage, pzSourceVar22, "sSN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_25);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.4", "Set .pyEnableAuthService", source_6, target_7);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.5", "Set .pyPreLoginScreenImage", source_7, target_8);
{
    String pzSourceVar26 = "";
    PRStackFrame ctxt_frame_30 = null;
    try {
        ctxt_frame_30 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_30.getStepPage();
        pzSourceVar26 = scalarValueQuery_27.resolveToString(tools, pega.findDataPage("D_pzGetImageForAuthService", false, "Name", scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_30);
    }
    PRStackFrame ctxt_frame_29 = null;
    try {
        ctxt_frame_29 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_29.getStepPage();
        pega.setViaPropRef(".pyPreLoginScreenImage", pRef_28, myStepPage, pzSourceVar26, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_29);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.5", "Set .pyPreLoginScreenImage", source_7, target_8);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.6", "Set .pzInsKey", source_8, target_9);
{
    String pzSourceVar30 = "";
    PRStackFrame ctxt_frame_34 = null;
    try {
        ctxt_frame_34 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_34.getStepPage();
        pzSourceVar30 = scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_34);
    }
    PRStackFrame ctxt_frame_33 = null;
    try {
        ctxt_frame_33 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_33.getStepPage();
        pega.setViaPropRef(".pzInsKey", pRef_32, myStepPage, pzSourceVar30, "sIY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_33);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.6", "Set .pzInsKey", source_8, target_9);
if (whenCondition_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_10 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2.7", "When", null, target_10);
switch (when_2(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2.7", "When", null, target_10);
}
// switch step page to scope TARGET
PRStackFrame ctxt_frame_37 = null;
try {
ctxt_frame_37 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_37.getStepPage();

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();
pz_param_1.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
pz_param_1.putParamValue("pyIterationType", "embedded");
pz_param_1.putParamValue("pyHowInvoked", "ForEach");
pz_param_1.putParamValue("pyIterationTarget", py_IterationTarget);
pz_param_1.putParamValue("serveltname", PropertyInfo.TYPE_TEXT, "");
// Expression: Primary.pyAppAlias
pz_param_1.putParamValue("AppAlias", PropertyInfo.TYPE_TEXT, scalarValueQuery_34.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));

actionProlog(pz_CurrentTraceInfo,"1.2.8", "Apply Data Transform pzSetAuthServiceLoginURL", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "Data-Admin-Security-Application-AuthServices";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pzSetAuthServiceLoginURL");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"1.2.8", "Apply Data Transform pzSetAuthServiceLoginURL", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_37);
} // return to previous step page
return CODE_CONTINUE;
}private boolean whenCondition_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_38 = null;
try {
ctxt_frame_38 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_38.getStepPage();
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__1 = pega.invokeWhen("pzIsCustomAuthenticationServiceType", "Data-Admin-Security-Application-AuthServices", "Data-Admin-AuthService");
return pz__1;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_38);
} // return to previous step page
}private int when_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.7.1", "Set .pyUrlPattern", source_9, target_11);
{
    String pzSourceVar35 = "";
    PRStackFrame ctxt_frame_40 = null;
    try {
        ctxt_frame_40 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_40.getStepPage();
        pzSourceVar35 = scalarValueQuery_36.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_40);
    }
    PRStackFrame ctxt_frame_39 = null;
    try {
        ctxt_frame_39 = pega.pushStackFrame("Data-Admin-AuthService", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_39.getStepPage();
        pega.setViaPropRef(".pyUrlPattern", pRef_37, myStepPage, pzSourceVar35, "sTI", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_39);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.2.7.1", "Set .pyUrlPattern", source_9, target_11);
return CODE_CONTINUE;
}private boolean whenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyLoginConfiguration==\"\"");
try {
boolean pz_40 = (scalarValueQuery_39.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyLoginConfiguration==\"\"",pz_40);
return pz_40;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyLoginConfiguration==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyLoginConfiguration", source_10, target_12);
{
    pega.setViaPropRef(".pyLoginConfiguration", pRef_41, myStepPage, "Interactive", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyLoginConfiguration", source_10, target_12);
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
	"Rule-Obj-Model:PZPOPULATEAPPALIASTOAUTHSERVICEMAPPING"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPOPULATEAPPALIASTOAUTHSERVICEMAPPING","Rule-Obj-Model","DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES",false,"","Pega-IntegrationEngine","08-06-01","RULE-OBJ-MODEL DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZPOPULATEAPPALIASTOAUTHSERVICEMAPPING #20200917T070914.664 GMT","!PZPOPULATEAPPALIASTOAUTHSERVICEMAPPING",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",169343118)
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
//	RULE-OBJ-MODEL DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZPOPULATEAPPALIASTOAUTHSERVICEMAPPING #20200917T070914.664 GMT:20201202T111559.879 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e2be482b2803cd23da10aabe4f39a58e";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Security-Application-AuthServices";
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

public static final String[] pRef_12 = new String[] { "", "", "pyName", "" };
public static final String[] pRef_37 = new String[] { "", "", "pyUrlPattern", "" };
public static final String[] pRef_41 = new String[] { "", "", "pyLoginConfiguration", "" };
public static final String[] pRef_24 = new String[] { "", "", "pyEnableAuthService", "" };
public static final String[] pRef_28 = new String[] { "", "", "pyPreLoginScreenImage", "" };
public static final String[] pRef_20 = new String[] { "", "", "pyAuthenticationServiceType", "" };
public static final String[] pRef_16 = new String[] { "", "", "pyAuthServiceAlias", "" };
public static final String[] pRef_32 = new String[] { "", "", "pzInsKey", "" };
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().scalarProperty("pyUrlPattern").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pyPreLoginScreenImage").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pyEnableAuthService").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_39 = FUAUtil.createQueryBuilder().scalarProperty("pyLoginConfiguration").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().pageList("pyAuthServiceList").scalarProperty("pyValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyAuthServiceAlias").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().scalarProperty("pyAppAlias").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_19 = FUAUtil.createQueryBuilder().scalarProperty("pyAuthenticationServiceType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_2 = FUAUtil.createQueryBuilder().page("pyErrorPage").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pyName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZPOPULATEAPPALIASTOAUTHSERVICEMAPPING #20200917T070914.664 GMT", "Data-Admin-Security-Application-AuthServices pzpopulateAppAliasToAuthServiceMapping", "Pega-IntegrationEngine", "08-06-01", "20201202T111559.879 GMT");
}
