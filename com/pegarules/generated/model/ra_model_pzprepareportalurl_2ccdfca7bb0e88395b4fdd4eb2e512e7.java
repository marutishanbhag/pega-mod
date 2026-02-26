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
public class ra_model_pzprepareportalurl_2ccdfca7bb0e88395b4fdd4eb2e512e7 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzPreparePortalURL.Data_Portal.Model");
	public ra_model_pzprepareportalurl_2ccdfca7bb0e88395b4fdd4eb2e512e7(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL DATA-PORTAL PZPREPAREPORTALURL #20180713T135510.643 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
// Start Page-Copy from Set action
{
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1", "Set ProcessList", source_1, target_1);
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: D_StartingFlows
sourcePage = tools.findPage("D_StartingFlows", true);
// Expression: ProcessList
targetPage = tools.findPage("ProcessList", false);
if (!(targetPage != null && sourcePage != null && targetPage == sourcePage)) {
if (targetPage != null) {
String pageClass = sourcePage != null ? sourcePage.getClassName() : targetPage.getClassName();
targetPage.clear();
targetPage.putString("pxObjClass", pageClass);
}

if ((targetPage != null) && (sourcePage != null)) {
targetPage.putAll(sourcePage, ClipboardPage.PUTALL_KEEPNEW);
targetPage.addMessages(sourcePage);
}
} // end self-ref check;
actionEpilog(pz_CurrentTraceInfo,"1", "Set ProcessList", source_1, target_1);
}// End Page-Copy from Set action
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_1 = pega.findPageWithException("ProcessList", "Code-Pega-List").getIfPresent("pxResults");
foreach_prop_1 = pz_1;
actionProlog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_1);
if (foreach_prop_1 != null) {
Iterator collectionIt = foreach_prop_1.iterator();
int currentLoopOffset = 1;
forEachLoop_1: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_1 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_1 = false;
try {
/* push '"ProcessList.pxResults(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "ProcessList.pxResults(<CURRENT>)", ctxt_page_target_1);
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
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"2", "For Each Page In", null, pz_1);
ClipboardProperty foreach_prop_2 = null;
ClipboardProperty pz_2 = pega.findPageWithException("pyPortalsList", "Data-Admin-Operator-AccessGroup").getIfPresent("pyUserPortals");
foreach_prop_2 = pz_2;
actionProlog(pz_CurrentTraceInfo,"3", "For Each Page In", null, pz_2);
if (foreach_prop_2 != null) {
Iterator collectionIt = foreach_prop_2.iterator();
int currentLoopOffset = 1;
forEachLoop_2: while (collectionIt.hasNext()) {
tools.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset));
ClipboardPage ctxt_page_2 = ((ClipboardProperty) collectionIt.next()).getPageValue();
/* entering new scope */
boolean pop_ctxt_page_2 = false;
try {
/* push '"pyPortalsList.pyUserPortals(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_2 = null;
ctxt_page_target_2 = ctxt_page_2;
pop_ctxt_page_2 = pega.pushScopedStepContext("TARGET", "pyPortalsList.pyUserPortals(<CURRENT>)", ctxt_page_target_2);
switch (forEach_2(currentLoopOffset, foreach_prop_2.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_2;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
currentLoopOffset++;
} finally {
if (pop_ctxt_page_2) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
}
}
actionEpilog(pz_CurrentTraceInfo,"3", "For Each Page In", null, pz_2);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set param.pyClassName", source_2, target_2);
{
    String pzSourceVar3 = "";
    pzSourceVar3 = scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("ProcessList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter);
    PRStackFrame ctxt_frame_3 = null;
    try {
        ctxt_frame_3 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_3.getStepPage();
        tools.putParamValue("pyClassName", PropertyInfo.TYPE_TEXT, pzSourceVar3);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set param.pyClassName", source_2, target_2);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set param.pyFlowType", source_3, target_3);
{
    String pzSourceVar6 = "";
    pzSourceVar6 = scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("ProcessList", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter);
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        tools.putParamValue("pyFlowType", PropertyInfo.TYPE_TEXT, pzSourceVar6);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set param.pyFlowType", source_3, target_3);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pyLabelOld", source_4, target_4);
{
    String pzSourceVar9 = "";
    pzSourceVar9 = ((((((((("pyActivity%3D" + tools.getParamValue("pyClassName")) + ".NewFromFlow%26InsClass%3D") + tools.getParamValue("pyClassName")) + "%26FlowType%3D") + tools.getParamValue("pyFlowType")) + "%26param%3D") + tools.getParamValue("pyClassName")) + "%26pzSkinName%3D") + tools.getParamValue("pzSkinName"));
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("Rule-Obj-Flow", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pega.setViaPropRef(".pyLabelOld", pRef_10, myStepPage, pzSourceVar9, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pyLabelOld", source_4, target_4);
return CODE_CONTINUE;
}private int forEach_2(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set param.pyPortalLayout", source_5, target_5);
{
    String pzSourceVar12 = "";
    pzSourceVar12 = scalarValueQuery_13.resolveToString(tools, pega.findPageWithException("pyPortalsList", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter);
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("Embed-PortalLayout", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        tools.putParamValue("pyPortalLayout", PropertyInfo.TYPE_TEXT, pzSourceVar12);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set param.pyPortalLayout", source_5, target_5);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set param.pyPortalURL", source_6, target_6);
{
    String pzSourceVar15 = "";
    pzSourceVar15 = (((((("pyActivity%3DData-Portal.ShowSelectedPortal%26portal%3D" + tools.getParamValue("pyPortalLayout")) + "%26Name%3D ") + tools.getParamValue("pyPortalLayout")) + "%26pzSkinName%3D") + tools.getParamValue("pzSkinName")) + "%26developer%3D");
    PRStackFrame ctxt_frame_11 = null;
    try {
        ctxt_frame_11 = pega.pushStackFrame("Embed-PortalLayout", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_11.getStepPage();
        tools.putParamValue("pyPortalURL", PropertyInfo.TYPE_TEXT, pzSourceVar15);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_11);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set param.pyPortalURL", source_6, target_6);
if (whenCondition_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_7 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3.3", "When", null, target_7);
switch (when_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"3.3", "When", null, target_7);
} else {
ClipboardPage target_8 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3.4", "Otherwise", null, target_8);
switch (otherwise_1(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"3.4", "Otherwise", null, target_8);
}
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.5", "Set param.portalThreadName", source_7, target_9);
{
    String pzSourceVar17 = "";
    pzSourceVar17 = ("OpenPortal_" + tools.getParamValue("pyPortalLayout"));
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("Embed-PortalLayout", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        tools.putParamValue("portalThreadName", PropertyInfo.TYPE_TEXT, pzSourceVar17);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.5", "Set param.portalThreadName", source_7, target_9);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.6", "Set .pyPortalThreadName", source_8, target_10);
{
    String pzSourceVar19 = "";
    pzSourceVar19 = tools.getParamValue("portalThreadName");
    PRStackFrame ctxt_frame_15 = null;
    try {
        ctxt_frame_15 = pega.pushStackFrame("Embed-PortalLayout", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_15.getStepPage();
        pega.setViaPropRef(".pyPortalThreadName", pRef_20, myStepPage, pzSourceVar19, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_15);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.6", "Set .pyPortalThreadName", source_8, target_10);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.7", "Set param.pyPortalURL", source_9, target_11);
{
    String pzSourceVar22 = "";
    pzSourceVar22 = ((tools.getParamValue("pyPortalURL") + "%26ThreadName%3D") + tools.getParamValue("portalThreadName"));
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Embed-PortalLayout", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        tools.putParamValue("pyPortalURL", PropertyInfo.TYPE_TEXT, pzSourceVar22);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.7", "Set param.pyPortalURL", source_9, target_11);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.8", "Set .pyPortalURL", source_10, target_12);
{
    String pzSourceVar24 = "";
    pzSourceVar24 = (tools.getParamValue("pyPortalURL") + "%26launchPortal%3Dtrue");
    PRStackFrame ctxt_frame_19 = null;
    try {
        ctxt_frame_19 = pega.pushStackFrame("Embed-PortalLayout", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_19.getStepPage();
        pega.setViaPropRef(".pyPortalURL", pRef_25, myStepPage, pzSourceVar24, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_19);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.8", "Set .pyPortalURL", source_10, target_12);
return CODE_CONTINUE;
}private boolean whenCondition_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_21 = null;
try {
ctxt_frame_21 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_21.getStepPage();
boolean pz_CheckMessage_1 = true;
PRStackFrame pz_modelTargetConditionFrame_1 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyDesktopType  == \"Developer\" || .pyDesktopType  == \"developer\"");
try {
boolean pz_28 = ((scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Developer")) || (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("developer")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyDesktopType  == \"Developer\" || .pyDesktopType  == \"developer\"",pz_28);
return pz_28;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyDesktopType  == \"Developer\" || .pyDesktopType  == \"developer\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
} // return to previous step page
}private int when_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.3.1", "Set param.pyPortalURL", source_11, target_13);
{
    String pzSourceVar29 = "";
    pzSourceVar29 = (tools.getParamValue("pyPortalURL") + "true");
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Embed-PortalLayout", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        tools.putParamValue("pyPortalURL", PropertyInfo.TYPE_TEXT, pzSourceVar29);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.3.1", "Set param.pyPortalURL", source_11, target_13);
return CODE_CONTINUE;
}private int otherwise_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.4.1", "Set param.pyPortalURL", source_12, target_14);
{
    String pzSourceVar31 = "";
    pzSourceVar31 = (tools.getParamValue("pyPortalURL") + "false");
    PRStackFrame ctxt_frame_24 = null;
    try {
        ctxt_frame_24 = pega.pushStackFrame("Embed-PortalLayout", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_24.getStepPage();
        tools.putParamValue("pyPortalURL", PropertyInfo.TYPE_TEXT, pzSourceVar31);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_24);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.4.1", "Set param.pyPortalURL", source_12, target_14);
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
	"Rule-Obj-Model:PZPREPAREPORTALURL"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPREPAREPORTALURL","Rule-Obj-Model","DATA-PORTAL",false,"","Pega-Desktop","08-01-01","RULE-OBJ-MODEL DATA-PORTAL PZPREPAREPORTALURL #20180713T135510.643 GMT","!PZPREPAREPORTALURL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",412102322)
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
//	RULE-OBJ-MODEL DATA-PORTAL PZPREPAREPORTALURL #20180713T135510.643 GMT:20180713T135510.643 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "cc7cb93af4bea3fa728b62959f0a47fc";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal";
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

public static final String[] pRef_25 = new String[] { "", "", "pyPortalURL", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyLabelOld", "" };
public static final String[] pRef_20 = new String[] { "", "", "pyPortalThreadName", "" };
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pyDesktopType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().pageList("pyUserPortals").scalarProperty("pyPortalLayout").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyFlowType").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL DATA-PORTAL PZPREPAREPORTALURL #20180713T135510.643 GMT", "Data-Portal pzPreparePortalURL", "Pega-Desktop", "08-01-01", "20180713T135510.643 GMT");
}
