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
public class ra_model_pzrbsetfiltersbyreporttype_201fa2e212f1e24267a017dfa2c86cb1 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzRBSetFiltersByReportType.Data_Report_Browser.Model");
	public ra_model_pzrbsetfiltersbyreporttype_201fa2e212f1e24267a017dfa2c86cb1(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL DATA-REPORT-BROWSER PZRBSETFILTERSBYREPORTTYPE #20180713T134300.008 GMT	Pega-Reporting:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
} else {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "Otherwise", null, target_2);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "Otherwise", null, target_2);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.resetFilters==true");
try {
boolean pz_1 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "resetFilters") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.resetFilters==true",pz_1);
return pz_1;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.resetFilters==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pzIncludeCharts", source_1, target_3);
{
    pega.setViaPropRef(".pzIncludeCharts", pRef_2, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pzIncludeCharts", source_1, target_3);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pzIncludeLists", source_2, target_4);
{
    pega.setViaPropRef(".pzIncludeLists", pRef_3, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pzIncludeLists", source_2, target_4);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pzIncludeSummary", source_3, target_5);
{
    pega.setViaPropRef(".pzIncludeSummary", pRef_4, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pzIncludeSummary", source_3, target_5);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.5", "Set .pySearchAllReports", source_4, target_6);
{
    pega.setViaPropRef(".pySearchAllReports", pRef_5, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.5", "Set .pySearchAllReports", source_4, target_6);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.6", "Set .pySearchMyReports", source_5, target_7);
{
    pega.setViaPropRef(".pySearchMyReports", pRef_6, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.6", "Set .pySearchMyReports", source_5, target_7);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_8 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.2", "When", null, target_8);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.2", "When", null, target_8);
} else {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.3", "Otherwise", null, target_9);
if (otherwise_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.3", "Otherwise", null, target_9);
}
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_10 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.5", "When", null, target_10);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.5", "When", null, target_10);
} else {
ClipboardPage target_11 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.6", "Otherwise", null, target_11);
if (otherwise_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.6", "Otherwise", null, target_11);
}
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_12 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.8", "When", null, target_12);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.8", "When", null, target_12);
} else {
ClipboardPage target_13 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.9", "Otherwise", null, target_13);
if (otherwise_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.9", "Otherwise", null, target_13);
}
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.includeChart==true");
try {
boolean pz_7 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "includeChart") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.includeChart==true",pz_7);
return pz_7;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.includeChart==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.2.1", "Set .pzIncludeCharts", source_6, target_14);
{
    pega.setViaPropRef(".pzIncludeCharts", pRef_2, myStepPage, "c", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.2.1", "Set .pzIncludeCharts", source_6, target_14);
return CODE_CONTINUE;
}private int otherwise_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.3.1", "Set .pzIncludeCharts", source_7, target_15);
{
    pega.setViaPropRef(".pzIncludeCharts", pRef_2, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.3.1", "Set .pzIncludeCharts", source_7, target_15);
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.includeList==true");
try {
boolean pz_8 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "includeList") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.includeList==true",pz_8);
return pz_8;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.includeList==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.5.1", "Set .pzIncludeLists", source_8, target_16);
{
    pega.setViaPropRef(".pzIncludeLists", pRef_3, myStepPage, "l", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.5.1", "Set .pzIncludeLists", source_8, target_16);
return CODE_CONTINUE;
}private int otherwise_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.6.1", "Set .pzIncludeLists", source_9, target_17);
{
    pega.setViaPropRef(".pzIncludeLists", pRef_3, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.6.1", "Set .pzIncludeLists", source_9, target_17);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.includeSummary==true");
try {
boolean pz_9 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "includeSummary") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.includeSummary==true",pz_9);
return pz_9;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.includeSummary==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.8.1", "Set .pzIncludeSummary", source_10, target_18);
{
    pega.setViaPropRef(".pzIncludeSummary", pRef_4, myStepPage, "s", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.8.1", "Set .pzIncludeSummary", source_10, target_18);
return CODE_CONTINUE;
}private int otherwise_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.9.1", "Set .pzIncludeSummary", source_11, target_19);
{
    pega.setViaPropRef(".pzIncludeSummary", pRef_4, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.9.1", "Set .pzIncludeSummary", source_11, target_19);
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
	"Rule-Obj-Model:PZRBSETFILTERSBYREPORTTYPE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZRBSETFILTERSBYREPORTTYPE","Rule-Obj-Model","DATA-REPORT-BROWSER",false,"","Pega-Reporting","08-01-01","RULE-OBJ-MODEL DATA-REPORT-BROWSER PZRBSETFILTERSBYREPORTTYPE #20180713T134300.008 GMT","!PZRBSETFILTERSBYREPORTTYPE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1181316861)
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
//	RULE-OBJ-MODEL DATA-REPORT-BROWSER PZRBSETFILTERSBYREPORTTYPE #20180713T134300.008 GMT:20180730T071407.813 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "589c1cd321eea5ab69deba6cfe69f254";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Report-Browser";
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

public static final String[] pRef_5 = new String[] { "", "", "pySearchAllReports", "" };
public static final String[] pRef_2 = new String[] { "", "", "pzIncludeCharts", "" };
public static final String[] pRef_3 = new String[] { "", "", "pzIncludeLists", "" };
public static final String[] pRef_6 = new String[] { "", "", "pySearchMyReports", "" };
public static final String[] pRef_4 = new String[] { "", "", "pzIncludeSummary", "" };

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL DATA-REPORT-BROWSER PZRBSETFILTERSBYREPORTTYPE #20180713T134300.008 GMT", "Data-Report-Browser pzRBSetFiltersByReportType", "Pega-Reporting", "08-01-01", "20180730T071407.813 GMT");
}
