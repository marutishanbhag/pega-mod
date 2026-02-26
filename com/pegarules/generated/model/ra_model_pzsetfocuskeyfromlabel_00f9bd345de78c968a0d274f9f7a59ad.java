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
public class ra_model_pzsetfocuskeyfromlabel_00f9bd345de78c968a0d274f9f7a59ad extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzSetFocusKeyFromLabel.Rule_.Model");
	public ra_model_pzsetfocuskeyfromlabel_00f9bd345de78c968a0d274f9f7a59ad(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL RULE- PZSETFOCUSKEYFROMLABEL #20190427T023338.718 GMT	Pega-Desktop:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_1 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "When", null, target_1);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "When", null, target_1);
}
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "When", null, target_2);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "When", null, target_2);
}
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "When", null, target_3);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "When", null, target_3);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass==\"Rule-Obj-CaseType\"");
try {
boolean pz_2 = (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Rule-Obj-CaseType"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass==\"Rule-Obj-CaseType\"",pz_2);
return pz_2;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass==\"Rule-Obj-CaseType\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
actionProlog(pz_CurrentTraceInfo,"2.1", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"2.1", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxObjClass != \"Rule-Obj-FieldValue\"");
try {
boolean pz_3 = (!(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Rule-Obj-FieldValue")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxObjClass != \"Rule-Obj-FieldValue\"",pz_3);
return pz_3;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxObjClass != \"Rule-Obj-FieldValue\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pyFocusKeyRemoveSpaces", source_1, target_4);
{
    pega.setViaPropRef(".pyFocusKeyRemoveSpaces", pRef_4, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pyFocusKeyRemoveSpaces", source_1, target_4);
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
boolean pz__1 = pega.invokeWhen("pzHasKeyFocusKey", "Rule-", "Rule-");
return pz__1;
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set Param.pyFocusKeyValue", source_2, target_5);
{
    tools.putParamValue("pyFocusKeyValue", PropertyInfo.TYPE_TEXT, scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set Param.pyFocusKeyValue", source_2, target_5);
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5.2", "When", null, target_6);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.2", "When", null, target_6);
}
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyEditedName!=true || Param.pyFocusKeyValue ==\"\" || Param.sOnlyUpdatePrefix==\"true\"");
try {
boolean pz_7 = (((scalarValueQuery_6.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) != true) || (tools.getParamValue("pyFocusKeyValue").equals(""))) || (tools.getParamValue("sOnlyUpdatePrefix").equals("true")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyEditedName!=true || Param.pyFocusKeyValue ==\"\" || Param.sOnlyUpdatePrefix==\"true\"",pz_7);
return pz_7;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyEditedName!=true || Param.pyFocusKeyValue ==\"\" || Param.sOnlyUpdatePrefix==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_7 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5.2.1", "When", null, target_7);
if (when_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.2.1", "When", null, target_7);
} else if (otherwiseWhenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_8 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5.2.2", "Otherwise When", null, target_8);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.2.2", "Otherwise When", null, target_8);
} else {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5.2.3", "Otherwise", null, target_9);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.2.3", "Otherwise", null, target_9);
}
actionProlog(pz_CurrentTraceInfo,"5.2.4", "Apply Data Transform pySplitFocusKey", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "Rule-";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pySplitFocusKey");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, null);
actionEpilog(pz_CurrentTraceInfo,"5.2.4", "Apply Data Transform pySplitFocusKey", null, null);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2.5", "Set Param.NewPrefix", source_3, target_10);
{
    tools.putParamValue("NewPrefix", PropertyInfo.TYPE_TEXT, scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}

actionEpilog(pz_CurrentTraceInfo,"5.2.5", "Set Param.NewPrefix", source_3, target_10);
actionProlog(pz_CurrentTraceInfo,"5.2.6", "Apply Data Transform pySpecialFocusKeyHandler", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_2 = null;
if (myStepPage != null) {
	pz_modelClass_2 = myStepPage.getClassName();
}
if ((pz_modelClass_2 == null) || (pz_modelClass_2.length() == 0)) { 
	pz_modelClass_2 = "Rule-";
}
StringMap pz_modelKey_2 = new HashStringMap(3);
pz_modelKey_2.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_2.putString("pyModelName", "pySpecialFocusKeyHandler");
pz_modelKey_2.putString("pyClassName", pz_modelClass_2);
tools.applyModel(myStepPage, pz_modelKey_2, null);
actionEpilog(pz_CurrentTraceInfo,"5.2.6", "Apply Data Transform pySpecialFocusKeyHandler", null, null);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2.7", "Set Param.noop", source_4, target_11);
{
    tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxPutString--(ClipboardPage,String,String)", "pxPutString", "Pega-RULES", "Property", new Object[] { myStepPage, scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), tools.getParamValue("IdentFocusValue") })).booleanValue()));
}

actionEpilog(pz_CurrentTraceInfo,"5.2.7", "Set Param.noop", source_4, target_11);
return CODE_CONTINUE;
}private boolean whenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.sOnlyUpdatePrefix==\"true\"");
try {
boolean pz_10 = (tools.getParamValue("sOnlyUpdatePrefix").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.sOnlyUpdatePrefix==\"true\"",pz_10);
return pz_10;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.sOnlyUpdatePrefix==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
}private int when_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2.1.1", "Set Param.IdentFocusValue", source_5, target_12);
{
    tools.putParamValue("IdentFocusValue", PropertyInfo.TYPE_TEXT, tools.getParamValue("pyFocusKeyValue"));
}

actionEpilog(pz_CurrentTraceInfo,"5.2.1.1", "Set Param.IdentFocusValue", source_5, target_12);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFocusKeyRemoveSpaces==true || .pxObjClass == \"Rule-Declare-Pages\" || @startsWith(.pxObjClass,\"Rule-Connect-\") || .pxObjClass == \"Rule-Test-Unit-Case\" || .pxObjClass == \"Rule-Test-Suite\" || .pxObjClass == \"Rule-Test-Functional-Suite\"");
try {
boolean pz_12 = ((((((scalarValueQuery_11.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == true) || (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Rule-Declare-Pages"))) || (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, null, new Object[] { scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Rule-Connect-" })).booleanValue()) || (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Rule-Test-Unit-Case"))) || (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Rule-Test-Suite"))) || (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Rule-Test-Functional-Suite")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFocusKeyRemoveSpaces==true || .pxObjClass == \"Rule-Declare-Pages\" || @startsWith(.pxObjClass,\"Rule-Connect-\") || .pxObjClass == \"Rule-Test-Unit-Case\" || .pxObjClass == \"Rule-Test-Suite\" || .pxObjClass == \"Rule-Test-Functional-Suite\"",pz_12);
return pz_12;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFocusKeyRemoveSpaces==true || .pxObjClass == \"Rule-Declare-Pages\" || @startsWith(.pxObjClass,\"Rule-Connect-\") || .pxObjClass == \"Rule-Test-Unit-Case\" || .pxObjClass == \"Rule-Test-Suite\" || .pxObjClass == \"Rule-Test-Functional-Suite\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2.2.1", "Set Param.IdentFocusValue", source_6, target_13);
{
    tools.putParamValue("IdentFocusValue", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("pzMakeRecordID--(String,String)", "pzMakeRecordID", null, "pxRuleManagement", new Object[] { scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" }));
}

actionEpilog(pz_CurrentTraceInfo,"5.2.2.1", "Set Param.IdentFocusValue", source_6, target_13);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2.3.1", "Set Param.IdentFocusValue", source_7, target_14);
{
    tools.putParamValue("IdentFocusValue", PropertyInfo.TYPE_TEXT, scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}

actionEpilog(pz_CurrentTraceInfo,"5.2.3.1", "Set Param.IdentFocusValue", source_7, target_14);
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
	"Rule-Obj-Model:PZSETFOCUSKEYFROMLABEL"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSETFOCUSKEYFROMLABEL","Rule-Obj-Model","RULE-",false,"","Pega-Desktop","08-03-01","RULE-OBJ-MODEL RULE- PZSETFOCUSKEYFROMLABEL #20190427T023338.718 GMT","!PZSETFOCUSKEYFROMLABEL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1460902583)
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
//	RULE-OBJ-MODEL RULE- PZSETFOCUSKEYFROMLABEL #20190427T023338.718 GMT:20190427T023338.718 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "13867cefba11beba06cbec70f620a208";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-";
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

public static final String[] pRef_4 = new String[] { "", "", "pyFocusKeyRemoveSpaces", "" };
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyRulePrefix").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyRefToFocusKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("pyFocusKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().scalarProperty("pyEditedName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pyFocusKeyRemoveSpaces").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL RULE- PZSETFOCUSKEYFROMLABEL #20190427T023338.718 GMT", "Rule- pzSetFocusKeyFromLabel", "Pega-Desktop", "08-03-01", "20190427T023338.718 GMT");
}
