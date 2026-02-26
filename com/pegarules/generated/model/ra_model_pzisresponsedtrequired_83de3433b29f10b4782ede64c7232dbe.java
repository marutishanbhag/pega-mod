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
public class ra_model_pzisresponsedtrequired_83de3433b29f10b4782ede64c7232dbe extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzIsResponseDTRequired.Embed_DeclarePageSource.Model");
	public ra_model_pzisresponsedtrequired_83de3433b29f10b4782ede64c7232dbe(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL EMBED-DECLAREPAGESOURCE PZISRESPONSEDTREQUIRED #20190920T064626.653 GMT	Pega-SystemArchitect:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set .pyIsRequired", source_1, target_1);
{
    pega.setViaPropRef(".pyIsRequired", pRef_1, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set .pyIsRequired", source_1, target_1);
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "When", null, target_2);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "When", null, target_2);
}
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "When", null, target_3);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "When", null, target_3);
} else if (otherwiseWhenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_4);
if (otherwiseWhen_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Otherwise When", null, target_4);
} else if (otherwiseWhenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "Otherwise When", null, target_5);
if (otherwiseWhen_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "Otherwise When", null, target_5);
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
boolean pz__1 = pega.invokeWhen("pzIsAggregatedDPSource", "Embed-DeclarePageSource", "Embed-DeclarePageSource");
return pz__1;
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(.pyDeclarePagesDataSource, \"ReportDefinition\")");
try {
boolean pz_3 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "ReportDefinition" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pyDeclarePagesDataSource, \"ReportDefinition\")",pz_3);
return pz_3;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(.pyDeclarePagesDataSource, \"ReportDefinition\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3.1", "When", null, target_6);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"3.1", "When", null, target_6);
}
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).pxIsAncestorOf( .pyReportDefinitionClass, .pyClassName) &amp;&amp; Top.pyStructure!=\"page\"");
try {
boolean pz_6 = ((pega.<Boolean>resolveMethodCall("pxIsAncestorOf--(String,String)", "pxIsAncestorOf", "Pega-RULES", "Default", new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue() && (!(myStepPage.getString("Top.pyStructure").equals("page"))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).pxIsAncestorOf( .pyReportDefinitionClass, .pyClassName) &amp;&amp; Top.pyStructure!=\"page\"",pz_6);
return pz_6;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).pxIsAncestorOf( .pyReportDefinitionClass, .pyClassName) &amp;&amp; Top.pyStructure!=\"page\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1.1", "Set .pyIsRequired", source_2, target_7);
{
    pega.setViaPropRef(".pyIsRequired", pRef_1, myStepPage, false, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.1.1", "Set .pyIsRequired", source_2, target_7);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_1(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(.pyDeclarePagesDataSource, \"Connector\")");
try {
boolean pz_7 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Connector" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pyDeclarePagesDataSource, \"Connector\")",pz_7);
return pz_7;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(.pyDeclarePagesDataSource, \"Connector\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int otherwiseWhen_1(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_8 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.1", "When", null, target_8);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1", "When", null, target_8);
}
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).pxIsAncestorOf(.pyConnectorClassName, .pyClassName)");
try {
boolean pz_9 = (pega.<Boolean>resolveMethodCall("pxIsAncestorOf--(String,String)", "pxIsAncestorOf", "Pega-RULES", "Default", new Object[] { scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).pxIsAncestorOf(.pyConnectorClassName, .pyClassName)",pz_9);
return pz_9;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).pxIsAncestorOf(.pyConnectorClassName, .pyClassName) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.1.1", "When", null, target_9);
if (when_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1.1", "When", null, target_9);
}
return CODE_CONTINUE;
}private boolean whenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(Top.pyStructure,\"page\") || @equals(.pyConnectorList,\"Rule-Connect-SQL\")");
try {
boolean pz_11 = ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { myStepPage.getString("Top.pyStructure"), "page" })).booleanValue() || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Rule-Connect-SQL" })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(Top.pyStructure,\"page\") || @equals(.pyConnectorList,\"Rule-Connect-SQL\")",pz_11);
return pz_11;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(Top.pyStructure,\"page\") || @equals(.pyConnectorList,\"Rule-Connect-SQL\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
}private int when_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1.1", "Set .pyIsRequired", source_3, target_10);
{
    pega.setViaPropRef(".pyIsRequired", pRef_1, myStepPage, false, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1.1", "Set .pyIsRequired", source_3, target_10);
return CODE_CONTINUE;
}private boolean otherwiseWhenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(.pyDeclarePagesDataSource, \"ObjOpen\")");
try {
boolean pz_12 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "ObjOpen" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pyDeclarePagesDataSource, \"ObjOpen\")",pz_12);
return pz_12;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(.pyDeclarePagesDataSource, \"ObjOpen\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
}private int otherwiseWhen_2(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_6(pz_CurrentTraceInfo)) {
ClipboardPage target_11 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5.1", "When", null, target_11);
if (when_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.1", "When", null, target_11);
}
return CODE_CONTINUE;
}private boolean whenCondition_6(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_8 = true;
PRStackFrame pz_modelTargetConditionFrame_8 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).pxIsAncestorOf( .pyLookupClassName, .pyClassName) &amp;&amp; Top.pyStructure!=\"list\"");
try {
boolean pz_14 = ((pega.<Boolean>resolveMethodCall("pxIsAncestorOf--(String,String)", "pxIsAncestorOf", "Pega-RULES", "Default", new Object[] { scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue() && (!(myStepPage.getString("Top.pyStructure").equals("list"))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).pxIsAncestorOf( .pyLookupClassName, .pyClassName) &amp;&amp; Top.pyStructure!=\"list\"",pz_14);
return pz_14;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).pxIsAncestorOf( .pyLookupClassName, .pyClassName) &amp;&amp; Top.pyStructure!=\"list\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_8, pz_modelTargetConditionFrame_8);
}
}private int when_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1.1", "Set .pyIsRequired", source_4, target_12);
{
    pega.setViaPropRef(".pyIsRequired", pRef_1, myStepPage, false, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5.1.1", "Set .pyIsRequired", source_4, target_12);
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
	"Rule-Obj-Model:PZISRESPONSEDTREQUIRED"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZISRESPONSEDTREQUIRED","Rule-Obj-Model","EMBED-DECLAREPAGESOURCE",false,"","Pega-SystemArchitect","08-04-01","RULE-OBJ-MODEL EMBED-DECLAREPAGESOURCE PZISRESPONSEDTREQUIRED #20190920T064626.653 GMT","!PZISRESPONSEDTREQUIRED",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1353152647)
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
//	RULE-OBJ-MODEL EMBED-DECLAREPAGESOURCE PZISRESPONSEDTREQUIRED #20190920T064626.653 GMT:20191003T091152.828 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "853ac8c5543fd20ddf66a35702c568ae";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-DeclarePageSource";
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

public static final String[] pRef_1 = new String[] { "", "", "pyIsRequired", "" };
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("pyDeclarePagesDataSource").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyConnectorList").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().scalarProperty("pyLookupClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pyReportDefinitionClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyConnectorClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyClassName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL EMBED-DECLAREPAGESOURCE PZISRESPONSEDTREQUIRED #20190920T064626.653 GMT", "Embed-DeclarePageSource pzIsResponseDTRequired", "Pega-SystemArchitect", "08-04-01", "20191003T091152.828 GMT");
}
