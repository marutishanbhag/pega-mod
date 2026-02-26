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
public class ra_model_pxrecentsdefaults_072e31a9bab5838831ed74bf82cc367a extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pxRecentsDefaults.System_User_Recents.Model");
	public ra_model_pxrecentsdefaults_072e31a9bab5838831ed74bf82cc367a(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL SYSTEM-USER-RECENTS PXRECENTSDEFAULTS #20180713T135529.519 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set .pyActionName", source_1, target_1);
{
    pega.setViaPropRef(".pyActionName", pRef_1, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set .pyActionName", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2", "Set .pyContentType", source_2, target_2);
{
    pega.setViaPropRef(".pyContentType", pRef_2, myStepPage, "Work", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2", "Set .pyContentType", source_2, target_2);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set .pyDescription", source_3, target_3);
{
    pega.setViaPropRef(".pyDescription", pRef_3, myStepPage, "W-2", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set .pyDescription", source_3, target_3);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set .pyRecordKey", source_4, target_4);
{
    pega.setViaPropRef(".pyRecordKey", pRef_4, myStepPage, "Default Record Key", "sIN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set .pyRecordKey", source_4, target_4);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5", "Set .pyRecordID", source_5, target_5);
{
    pega.setViaPropRef(".pyRecordID", pRef_5, myStepPage, "W-2", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5", "Set .pyRecordID", source_5, target_5);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6", "Set .pyLabel", source_6, target_6);
{
    pega.setViaPropRef(".pyLabel", pRef_6, myStepPage, "Default Label", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6", "Set .pyLabel", source_6, target_6);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7", "Set .pyClassName", source_7, target_7);
{
    pega.setViaPropRef(".pyClassName", pRef_7, myStepPage, "PegaSample-Task", "siN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"7", "Set .pyClassName", source_7, target_7);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8", "Set .pyExecute.pyAction", source_8, target_8);
{
    pega.setViaPropRef(".pyExecute.pyAction", pRef_8, myStepPage, "openworkbyhandle", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"8", "Set .pyExecute.pyAction", source_8, target_8);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9", "Set .pyExecute.pyActionAPI.pyElementName", source_9, target_9);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pyElementName", pRef_9, myStepPage, "5d7f0192-daa0-49d1-999a-a004eb9a38ce", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"9", "Set .pyExecute.pyActionAPI.pyElementName", source_9, target_9);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10", "Set .pyExecute.pyActionAPI.pyKey", source_10, target_10);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pyKey", pRef_10, myStepPage, "PEGASAMPLE W-2", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"10", "Set .pyExecute.pyActionAPI.pyKey", source_10, target_10);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11", "Set .pyExecute.pyActionAPI.pySkipConflictCheck", source_11, target_11);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pySkipConflictCheck", pRef_11, myStepPage, true, "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"11", "Set .pyExecute.pyActionAPI.pySkipConflictCheck", source_11, target_11);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12", "Set .pyExecute.pyActionAPI.pyTargetElement", source_12, target_12);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pyTargetElement", pRef_12, myStepPage, "de12ecd7-b2b3-4849-bff1-ee2797014513", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"12", "Set .pyExecute.pyActionAPI.pyTargetElement", source_12, target_12);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13", "Set .pyExecute.pyActionAPI.pyReadOnly", source_13, target_13);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pyReadOnly", pRef_13, myStepPage, "No", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"13", "Set .pyExecute.pyActionAPI.pyReadOnly", source_13, target_13);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"14", "Set .pyExecute.pyActionAPI.pyHarnessName", source_14, target_14);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pyHarnessName", pRef_14, myStepPage, "Perform", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"14", "Set .pyExecute.pyActionAPI.pyHarnessName", source_14, target_14);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"15", "Set .pyExecute.pyActionAPI.pyUsingPage", source_15, target_15);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pyUsingPage", pRef_15, myStepPage, "Primary", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"15", "Set .pyExecute.pyActionAPI.pyUsingPage", source_15, target_15);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"16", "Set .pyExecute.pyActionAPI.pzRuleParameters(1).pyParametersParamName", source_16, target_16);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pzRuleParameters(1).pyParametersParamName", pRef_16, myStepPage, "Name1", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"16", "Set .pyExecute.pyActionAPI.pzRuleParameters(1).pyParametersParamName", source_16, target_16);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"17", "Set .pyExecute.pyActionAPI.pzRuleParameters(1).pyParametersParamType", source_17, target_17);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pzRuleParameters(1).pyParametersParamType", pRef_17, myStepPage, "String", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"17", "Set .pyExecute.pyActionAPI.pzRuleParameters(1).pyParametersParamType", source_17, target_17);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18", "Set .pyExecute.pyActionAPI.pzRuleParameters(1).pyParametersParamValue", source_18, target_18);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pzRuleParameters(1).pyParametersParamValue", pRef_18, myStepPage, "Value1", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"18", "Set .pyExecute.pyActionAPI.pzRuleParameters(1).pyParametersParamValue", source_18, target_18);
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19", "Set .pyExecute.pyActionAPI.pzRuleParameters(2).pyParametersParamName", source_19, target_19);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pzRuleParameters(2).pyParametersParamName", pRef_19, myStepPage, "Name2", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"19", "Set .pyExecute.pyActionAPI.pzRuleParameters(2).pyParametersParamName", source_19, target_19);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20", "Set .pyExecute.pyActionAPI.pzRuleParameters(2).pyParametersParamType", source_20, target_20);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pzRuleParameters(2).pyParametersParamType", pRef_20, myStepPage, "string", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"20", "Set .pyExecute.pyActionAPI.pzRuleParameters(2).pyParametersParamType", source_20, target_20);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21", "Set .pyExecute.pyActionAPI.pzRuleParameters(2).pyParametersParamValue", source_21, target_21);
{
    pega.setViaPropRef(".pyExecute.pyActionAPI.pzRuleParameters(2).pyParametersParamValue", pRef_21, myStepPage, "Value2", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"21", "Set .pyExecute.pyActionAPI.pzRuleParameters(2).pyParametersParamValue", source_21, target_21);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

/** Metadata for the rule */
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
	"Rule-Obj-Model:PXRECENTSDEFAULTS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PXRECENTSDEFAULTS","Rule-Obj-Model","SYSTEM-USER-RECENTS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-MODEL SYSTEM-USER-RECENTS PXRECENTSDEFAULTS #20180713T135529.519 GMT","!PXRECENTSDEFAULTS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",2028920951)
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
//	RULE-OBJ-MODEL SYSTEM-USER-RECENTS PXRECENTSDEFAULTS #20180713T135529.519 GMT:20180713T135529.519 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "aa2ed3b42829c543efc48c500c4bdf27";
	}

	public String getDefinitionAppliesToClass() {
		return "System-User-Recents";
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

public static final String[] pRef_19 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pzRuleParameters", "2", "pyParametersParamName", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyClassName", "" };
public static final String[] pRef_17 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pzRuleParameters", "1", "pyParametersParamType", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pyElementName", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyContentType", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pySkipConflictCheck", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyActionName", "" };
public static final String[] pRef_14 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pyHarnessName", "" };
public static final String[] pRef_4 = new String[] { "", "", "pyRecordKey", "" };
public static final String[] pRef_20 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pzRuleParameters", "2", "pyParametersParamType", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pyReadOnly", "" };
public static final String[] pRef_18 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pzRuleParameters", "1", "pyParametersParamValue", "" };
public static final String[] pRef_15 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pyUsingPage", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pzRuleParameters", "2", "pyParametersParamValue", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyDescription", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pyTargetElement", "" };
public static final String[] pRef_16 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pzRuleParameters", "1", "pyParametersParamName", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyExecute", "", "pyAction", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyRecordID", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyExecute", "", "pyActionAPI", "", "pyKey", "" };

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL SYSTEM-USER-RECENTS PXRECENTSDEFAULTS #20180713T135529.519 GMT", "System-User-Recents pxRecentsDefaults", "Pega-Desktop", "08-01-01", "20180713T135529.519 GMT");
}
