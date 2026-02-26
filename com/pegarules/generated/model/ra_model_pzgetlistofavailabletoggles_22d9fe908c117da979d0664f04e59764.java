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
public class ra_model_pzgetlistofavailabletoggles_22d9fe908c117da979d0664f04e59764 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzGetListOfAvailableToggles.Pega_Landing_System_ToggleManagement.Model");
	public ra_model_pzgetlistofavailabletoggles_22d9fe908c117da979d0664f04e59764(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL PEGA-LANDING-SYSTEM-TOGGLEMANAGEMENT PZGETLISTOFAVAILABLETOGGLES #20180713T135519.300 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
}
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set .pxResults", source_1, target_3);
{
    ClipboardProperty pzSourceVar1 = pega.findPageWithException("D_pxListOfAvailableToggles", "Code-Pega-List").getProperty("pxResults");
    ClipboardProperty pzTargetVar2 = pega.getViaPropRef(".pxResults", pRef_3, myStepPage, false, false);
    pzTargetVar2.setValue(pzSourceVar1);
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set .pxResults", source_1, target_3);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set .pyIsCustomProjectManagementEnabled", source_2, target_4);
{
    pega.setViaPropRef(".pyIsCustomProjectManagementEnabled", pRef_6, myStepPage, scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("D_pxListOfAvailableToggles", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set .pyIsCustomProjectManagementEnabled", source_2, target_4);
ClipboardProperty foreach_prop_1 = null;
ClipboardProperty pz_8 = myStepPage.getIfPresent("pxResults");
foreach_prop_1 = pz_8;
actionProlog(pz_CurrentTraceInfo,"5", "For Each Page In", null, pz_8);
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
/* push '".pxResults(<CURRENT>)"' to scope TARGET */
ClipboardPage ctxt_page_target_1 = null;
ctxt_page_target_1 = ctxt_page_1;
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", ".pxResults(<CURRENT>)", ctxt_page_target_1);
/* push '".pxResults(<CURRENT>)"' to scope SOURCE */
ClipboardPage ctxt_page_source_1 = null;
ctxt_page_source_1 = ctxt_page_1;
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", ".pxResults(<CURRENT>)", ctxt_page_source_1);
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
actionEpilog(pz_CurrentTraceInfo,"5", "For Each Page In", null, pz_8);
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7", "When", null, target_5);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"7", "When", null, target_5);
}
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8", "Set param.decoy", source_3, target_6);
{
    tools.putParamValue("decoy", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pzDeleteAllInstancesOfDeclarativePage--(PublicAPI,String)", "pzDeleteAllInstancesOfDeclarativePage", "Pega-RULES", "DeclarePages", new Object[] { tools, "D_pxReferencingRulesForToggle" })).booleanValue()));
}

actionEpilog(pz_CurrentTraceInfo,"8", "Set param.decoy", source_3, target_6);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9", "Set param.decoy", source_4, target_7);
{
    tools.putParamValue("decoy", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pzDeleteAllInstancesOfDeclarativePage--(PublicAPI,String)", "pzDeleteAllInstancesOfDeclarativePage", "Pega-RULES", "DeclarePages", new Object[] { tools, "D_pxListOfAllToggleOverrides" })).booleanValue()));
}

actionEpilog(pz_CurrentTraceInfo,"9", "Set param.decoy", source_4, target_7);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.actionName != \"pzLPContent\"");
try {
boolean pz_9 = (!(tools.getParamValue("actionName").equals("pzLPContent")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.actionName != \"pzLPContent\"",pz_9);
return pz_9;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.actionName != \"pzLPContent\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_8 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1", "When", null, target_8);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "When", null, target_8);
} else {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2", "Otherwise", null, target_9);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2", "Otherwise", null, target_9);
}
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__1 = pega.invokeWhen("pzIsLPDataLatest", "Pega-Landing-System-ToggleManagement", "Pega-Landing-System-ToggleManagement");
return pz__1;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1", "Set param.ReloadRequired", source_5, target_10);
{
    tools.putParamValue("ReloadRequired", PropertyInfo.TYPE_TEXT, false);
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1", "Set param.ReloadRequired", source_5, target_10);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.1", "Set param.ReloadRequired", source_6, target_11);
{
    tools.putParamValue("ReloadRequired", PropertyInfo.TYPE_TEXT, "");
}

actionEpilog(pz_CurrentTraceInfo,"1.2.1", "Set param.ReloadRequired", source_6, target_11);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ReloadRequired==\"false\"");
try {
boolean pz_10 = (tools.getParamValue("ReloadRequired").equals("false"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ReloadRequired==\"false\"",pz_10);
return pz_10;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ReloadRequired==\"false\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
actionProlog(pz_CurrentTraceInfo,"2.1", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"2.1", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
}private int forEach_1(int forEachCounter, String py_IterationTarget, RuleTraceInfo pz_CurrentTraceInfo) {
// switch step page to scope TARGET
PRStackFrame ctxt_frame_6 = null;
try {
ctxt_frame_6 = pega.pushStackFrame("apply Data Transform", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_6.getStepPage();

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();
pz_param_1.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
pz_param_1.putParamValue("pyIterationType", "embedded");
pz_param_1.putParamValue("pyHowInvoked", "ForEach");
pz_param_1.putParamValue("pyIterationTarget", py_IterationTarget);

actionProlog(pz_CurrentTraceInfo,"5.2", "Apply Data Transform Data-Admin-Toggle.pzSetWhenRuleDetails", null, null);
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pzSetWhenRuleDetails");
pz_modelKey_1.putString("pyClassName", "Data-Admin-Toggle");
tools.applyModel(myStepPage, pz_modelKey_1, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"5.2", "Apply Data Transform Data-Admin-Toggle.pzSetWhenRuleDetails", null, null);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_6);
} // return to previous step page
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.equals(param.reloadPage,\"pyLanding\")");
try {
boolean pz_11 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { tools.getParamValue("reloadPage"), "pyLanding" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.equals(param.reloadPage,\"pyLanding\")",pz_11);
return pz_11;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.equals(param.reloadPage,\"pyLanding\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
actionProlog(pz_CurrentTraceInfo,"7.1", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"7.1", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
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
	"Rule-Obj-Model:PZGETLISTOFAVAILABLETOGGLES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETLISTOFAVAILABLETOGGLES","Rule-Obj-Model","PEGA-LANDING-SYSTEM-TOGGLEMANAGEMENT",false,"","Pega-Desktop","08-01-01","RULE-OBJ-MODEL PEGA-LANDING-SYSTEM-TOGGLEMANAGEMENT PZGETLISTOFAVAILABLETOGGLES #20180713T135519.300 GMT","!PZGETLISTOFAVAILABLETOGGLES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",526948140)
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
//	RULE-OBJ-MODEL PEGA-LANDING-SYSTEM-TOGGLEMANAGEMENT PZGETLISTOFAVAILABLETOGGLES #20180713T135519.300 GMT:20180713T135519.300 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "95e4d99b01f205b37480ae78893e9c26";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Landing-System-ToggleManagement";
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

public static final String[] pRef_3 = new String[] { "", "", "pxResults", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyIsCustomProjectManagementEnabled", "" };
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("pyIsCustomProjectManagementEnabled").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL PEGA-LANDING-SYSTEM-TOGGLEMANAGEMENT PZGETLISTOFAVAILABLETOGGLES #20180713T135519.300 GMT", "Pega-Landing-System-ToggleManagement pzGetListOfAvailableToggles", "Pega-Desktop", "08-01-01", "20180713T135519.300 GMT");
}
