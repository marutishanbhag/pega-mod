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
public class ra_model_pxadduserstoapplicationinit_6e6aa043b9246bb63b9b0b7a2352e272 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pxAddUsersToApplicationInit.Code_Pega_List.Model");
	public ra_model_pxadduserstoapplicationinit_6e6aa043b9246bb63b9b0b7a2352e272(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL CODE-PEGA-LIST PXADDUSERSTOAPPLICATIONINIT #20180713T141228.388 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "When", null, target_2);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "When", null, target_2);
} else {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "Otherwise", null, target_3);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "Otherwise", null, target_3);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(\"\", D_pzBuildApplication.pyAccessGroup)");
try {
boolean pz_2 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { "", scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(\"\", D_pzBuildApplication.pyAccessGroup)",pz_2);
return pz_2;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(\"\", D_pzBuildApplication.pyAccessGroup) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2", "Set Primary.pxResultCount", source_1, target_4);
{
    pega.setViaPropRef(".pxResultCount", pRef_3, tools.getPrimaryPage(), 0, "sNY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1.2", "Set Primary.pxResultCount", source_1, target_4);
actionProlog(pz_CurrentTraceInfo,"1.3", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"1.3", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__1 = pega.invokeWhen("pzIsPegaAdministrator", "Code-Pega-List", "Code-Pega-List");
return pz__1;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set Primary.pxResultCount", source_2, target_5);
{
    pega.setViaPropRef(".pxResultCount", pRef_3, tools.getPrimaryPage(), 0, "sNY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set Primary.pxResultCount", source_2, target_5);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set Primary.pxResults(1).pxObjClass", source_3, target_6);
// Change obj class
String pz_7 = "Data-Admin-Operator-ID";
ClipboardPage tempPage_1 = tools.createPage(pz_7, "");
ClipboardProperty pz_6 = propertyQuery_4.resolve(tools, tools.getPrimaryPage());
ClipboardPage targetPage_1 = pz_6.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"3.1", "Set Primary.pxResults(1).pxObjClass", source_3, target_6);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set Primary.pxResults(1).pyUserIdentifier", source_4, target_7);
{
    pega.setViaPropRef(".pxResults(1).pyUserIdentifier", pRef_8, tools.getPrimaryPage(), scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("OperatorID", "Data-Admin-Operator-ID"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set Primary.pxResults(1).pyUserIdentifier", source_4, target_7);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.3", "Set Primary.pxResults(1).pyUserName", source_5, target_8);
{
    pega.setViaPropRef(".pxResults(1).pyUserName", pRef_10, tools.getPrimaryPage(), scalarValueQuery_11.resolveToString(tools, pega.findPageWithException("OperatorID", "Data-Admin-Operator-ID"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.3", "Set Primary.pxResults(1).pyUserName", source_5, target_8);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.4", "Set Primary.pxResults(1).pyEmailAddress", source_6, target_9);
{
    pega.setViaPropRef(".pxResults(1).pyEmailAddress", pRef_12, tools.getPrimaryPage(), scalarValueQuery_13.resolveToString(tools, pega.findPageWithException("OperatorID", "Data-Admin-Operator-ID"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.4", "Set Primary.pxResults(1).pyEmailAddress", source_6, target_9);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.5", "Set Primary.pxResults(1).pyIsAdminForCurrentApp", source_7, target_10);
{
    pega.setViaPropRef(".pxResults(1).pyIsAdminForCurrentApp", pRef_14, tools.getPrimaryPage(), true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.5", "Set Primary.pxResults(1).pyIsAdminForCurrentApp", source_7, target_10);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.6", "Set Primary.pxResults(1).pyAccessGroup", source_8, target_11);
{
    pega.setViaPropRef(".pxResults(1).pyAccessGroup", pRef_15, tools.getPrimaryPage(), scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.6", "Set Primary.pxResults(1).pyAccessGroup", source_8, target_11);
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_18 = pega.findDataPage("D_pzAccessGroupsByApplication", true, "AppVersion", scalarValueQuery_16.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "AppName", scalarValueQuery_17.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT)).getIfPresent("pxResults");
foreach_prop_1 = pz_18;
actionProlog(pz_CurrentTraceInfo,"3.7", "For Each Page In", null, pz_18);
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
/* push '"D_pzAccessGroupsByApplication[AppName:D_pzBuildApplication.pyApplicationName, AppVersion:D_pzBuildApplication.pyApplicationVersion].pxResults(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "D_pzAccessGroupsByApplication[AppName:D_pzBuildApplication.pyApplicationName, AppVersion:D_pzBuildApplication.pyApplicationVersion].pxResults(<CURRENT>)", ctxt_page_target_1);
/* push '"D_pzAccessGroupsByApplication[AppName:D_pzBuildApplication.pyApplicationName, AppVersion:D_pzBuildApplication.pyApplicationVersion].pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "D_pzAccessGroupsByApplication[AppName:D_pzBuildApplication.pyApplicationName, AppVersion:D_pzBuildApplication.pyApplicationVersion].pxResults(<CURRENT>)", ctxt_page_source_1);
switch (forEach_1(currentLoopOffset, foreach_prop_1.getReference(), pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
break forEachLoop_1;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
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
actionEpilog(pz_CurrentTraceInfo,"3.7", "For Each Page In", null, pz_18);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.8", "Set Primary.pxResultCount", source_9, target_12);
{
    pega.setViaPropRef(".pxResultCount", pRef_3, tools.getPrimaryPage(), 1, "sNY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.8", "Set Primary.pxResultCount", source_9, target_12);
return CODE_CONTINUE;
}private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
ClipboardPage target_13 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3.7.1", "When", null, target_13);
switch (when_3(forEachCounter, py_IterationTarget, pz_CurrentTraceInfo)) {
case CODE_EXIT_ITERATION:
traceActionEnd(pz_CurrentTraceInfo, "For Each Page In", null);
return CODE_EXIT_ITERATION;
case CODE_EXIT_MODEL:
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"3.7.1", "When", null, target_13);
}
return CODE_CONTINUE;
}private boolean whenCondition_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_5 = null;
try {
ctxt_frame_5 = pega.pushStackFrame("context switch for when", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_5.getStepPage();
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyAccessGroup==D_pzBuildApplication.pyAccessGroup");
try {
boolean pz_19 = (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyAccessGroup==D_pzBuildApplication.pyAccessGroup",pz_19);
return pz_19;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyAccessGroup==D_pzBuildApplication.pyAccessGroup " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
} // return to previous step page
}private int when_3(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.7.1.1", "Set Primary.pxResults(1).pyLabel", source_10, target_14);
{
    String pzSourceVar20 = "";
    PRStackFrame ctxt_frame_7 = null;
    try {
        ctxt_frame_7 = pega.pushStackFrame("Data-Admin-Operator-AccessGroup", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_7.getStepPage();
        pzSourceVar20 = scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_7);
    }
    PRStackFrame ctxt_frame_6 = null;
    try {
        ctxt_frame_6 = pega.pushStackFrame("Data-Admin-Operator-AccessGroup", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_6.getStepPage();
        pega.setViaPropRef(".pxResults(1).pyLabel", pRef_22, tools.getPrimaryPage(), pzSourceVar20, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
    }
}

actionEpilog(pz_CurrentTraceInfo,"3.7.1.1", "Set Primary.pxResults(1).pyLabel", source_10, target_14);
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
	"Rule-Obj-Model:PXADDUSERSTOAPPLICATIONINIT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PXADDUSERSTOAPPLICATIONINIT","Rule-Obj-Model","CODE-PEGA-LIST",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-MODEL CODE-PEGA-LIST PXADDUSERSTOAPPLICATIONINIT #20180713T141228.388 GMT","!PXADDUSERSTOAPPLICATIONINIT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2048030226)
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
//	RULE-OBJ-MODEL CODE-PEGA-LIST PXADDUSERSTOAPPLICATIONINIT #20180713T141228.388 GMT:20180713T141228.388 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "7b8d9eb69389fb459d865beb84d5a369";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
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

public static final String[] pRef_22 = new String[] { "", "", "pxResults", "1", "pyLabel", "" };
public static final String[] pRef_12 = new String[] { "", "", "pxResults", "1", "pyEmailAddress", "" };
public static final String[] pRef_5 = new String[] { "", "", "pxResults", "1", "pxObjClass", "" };
public static final String[] pRef_8 = new String[] { "", "", "pxResults", "1", "pyUserIdentifier", "" };
public static final String[] pRef_10 = new String[] { "", "", "pxResults", "1", "pyUserName", "" };
public static final String[] pRef_14 = new String[] { "", "", "pxResults", "1", "pyIsAdminForCurrentApp", "" };
public static final String[] pRef_15 = new String[] { "", "", "pxResults", "1", "pyAccessGroup", "" };
public static final String[] pRef_3 = new String[] { "", "", "pxResultCount", "" };
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyAccessGroup").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pyUserName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyApplicationName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pyEmailAddress").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyUserIdentifier").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_4 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).scalarProperty("pxObjClass").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyApplicationVersion").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PXADDUSERSTOAPPLICATIONINIT #20180713T141228.388 GMT", "Code-Pega-List pxAddUsersToApplicationInit", "Pega-ProcessArchitect", "08-01-01", "20180713T141228.388 GMT");
}
