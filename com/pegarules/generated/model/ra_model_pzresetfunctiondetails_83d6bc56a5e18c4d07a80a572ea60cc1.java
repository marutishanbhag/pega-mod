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
public class ra_model_pzresetfunctiondetails_83d6bc56a5e18c4d07a80a572ea60cc1 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzResetFunctionDetails.Embed_Fields.Model");
	public ra_model_pzresetfunctiondetails_83d6bc56a5e18c4d07a80a572ea60cc1(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL EMBED-FIELDS PZRESETFUNCTIONDETAILS #20180713T141235.670 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
} else if (otherwiseWhenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "Otherwise When", null, target_2);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "Otherwise When", null, target_2);
} else if (otherwiseWhenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "Otherwise When", null, target_3);
if (otherwiseWhen_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "Otherwise When", null, target_3);
} else if (otherwiseWhenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_4);
if (otherwiseWhen_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_4);
} else if (otherwiseWhenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "Otherwise When", null, target_5);
if (otherwiseWhen_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "Otherwise When", null, target_5);
} else if (otherwiseWhenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6", "Otherwise When", null, target_6);
if (otherwiseWhen_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"6", "Otherwise When", null, target_6);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFunction = \"Select\" || .pyFunction = \"\"");
try {
boolean pz_2 = ((scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Select")) || (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFunction = \"Select\" || .pyFunction = \"\"",pz_2);
return pz_2;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFunction = \"Select\" || .pyFunction = \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_7 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.1", "When", null, target_7);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "When", null, target_7);
} else {
ClipboardPage target_8 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.2", "Otherwise", null, target_8);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.2", "Otherwise", null, target_8);
}
actionProlog(pz_CurrentTraceInfo,"1.3", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"1.3", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyStringType  = \"Integer\" || .pyStringType = \"Decimal\"");
try {
boolean pz_4 = ((scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Integer")) || (scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Decimal")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyStringType  = \"Integer\" || .pyStringType = \"Decimal\"",pz_4);
return pz_4;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyStringType  = \"Integer\" || .pyStringType = \"Decimal\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1", "Set .pyFunctionHelperText", source_1, target_9);
{
    pega.setViaPropRef(".pyFunctionHelperText", pRef_5, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1", "Set .pyFunctionHelperText", source_1, target_9);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2.1", "Set .pyFunctionHelperText", source_2, target_10);
{
    pega.setViaPropRef(".pyFunctionHelperText", pRef_5, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Use dot for field prompts to enter simple equation", "pyLabel", tools }), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1.2.1", "Set .pyFunctionHelperText", source_2, target_10);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFunction==\"SUM\"");
try {
boolean pz_6 = (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("SUM"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFunction==\"SUM\"",pz_6);
return pz_6;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFunction==\"SUM\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyFunctionHelperText", source_3, target_11);
{
    pega.setViaPropRef(".pyFunctionHelperText", pRef_5, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Sums the values in the list", "pyLabel", tools }), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyFunctionHelperText", source_3, target_11);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFunction==\"AVERAGE\"");
try {
boolean pz_7 = (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("AVERAGE"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFunction==\"AVERAGE\"",pz_7);
return pz_7;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFunction==\"AVERAGE\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int otherwiseWhen_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pyFunctionHelperText", source_4, target_12);
{
    pega.setViaPropRef(".pyFunctionHelperText", pRef_5, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Averages the values in the list", "pyLabel", tools }), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pyFunctionHelperText", source_4, target_12);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFunction==\"MINIMUM\"");
try {
boolean pz_8 = (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("MINIMUM"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFunction==\"MINIMUM\"",pz_8);
return pz_8;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFunction==\"MINIMUM\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
}private int otherwiseWhen_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pyFunctionHelperText", source_5, target_13);
{
    pega.setViaPropRef(".pyFunctionHelperText", pRef_5, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Returns the minimum value in the list", "pyLabel", tools }), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pyFunctionHelperText", source_5, target_13);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFunction==\"MAXIMUM\"");
try {
boolean pz_9 = (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("MAXIMUM"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFunction==\"MAXIMUM\"",pz_9);
return pz_9;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFunction==\"MAXIMUM\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
}private int otherwiseWhen_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set .pyFunctionHelperText", source_6, target_14);
{
    pega.setViaPropRef(".pyFunctionHelperText", pRef_5, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Returns the maximum value in the list", "pyLabel", tools }), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set .pyFunctionHelperText", source_6, target_14);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyFunction==\"EQUALS\"");
try {
boolean pz_10 = (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("EQUALS"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyFunction==\"EQUALS\"",pz_10);
return pz_10;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyFunction==\"EQUALS\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
}private int otherwiseWhen_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1", "Set .pyFunctionHelperText", source_7, target_15);
{
    pega.setViaPropRef(".pyFunctionHelperText", pRef_5, myStepPage, pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Use dot for field prompts to enter simple equation", "pyLabel", tools }), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.1", "Set .pyFunctionHelperText", source_7, target_15);
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
	"Rule-Obj-Model:PZRESETFUNCTIONDETAILS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZRESETFUNCTIONDETAILS","Rule-Obj-Model","EMBED-FIELDS",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-MODEL EMBED-FIELDS PZRESETFUNCTIONDETAILS #20180713T141235.670 GMT","!PZRESETFUNCTIONDETAILS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1296414471)
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
//	RULE-OBJ-MODEL EMBED-FIELDS PZRESETFUNCTIONDETAILS #20180713T141235.670 GMT:20180713T141235.670 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "343305a3b144390dcadf94de60f5e355";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-Fields";
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

public static final String[] pRef_5 = new String[] { "", "", "pyFunctionHelperText", "" };
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyFunction").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyStringType").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL EMBED-FIELDS PZRESETFUNCTIONDETAILS #20180713T141235.670 GMT", "Embed-Fields pzResetFunctionDetails", "Pega-ProcessArchitect", "08-01-01", "20180713T141235.670 GMT");
}
