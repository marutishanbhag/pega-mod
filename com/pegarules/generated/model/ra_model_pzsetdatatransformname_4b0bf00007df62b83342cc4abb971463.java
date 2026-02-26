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
public class ra_model_pzsetdatatransformname_4b0bf00007df62b83342cc4abb971463 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzSetDataTransformName._baseclass.Model");
	public ra_model_pzsetdatatransformname_4b0bf00007df62b83342cc4abb971463(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL @BASECLASS PZSETDATATRANSFORMNAME #20230618T001816.341 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set param.CachedValue", source_1, target_1);
{
    tools.putParamValue("CachedValue", PropertyInfo.TYPE_TEXT, scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set param.CachedValue", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2", "Set Param.noop", source_2, target_2);
{
    tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxPutString--(ClipboardPage,String,String)", "pxPutString", null, "Property", new Object[] { myStepPage, tools.getParamValue("DTPropName"), tools.getParamValue("DTName") })).booleanValue()));
}

actionEpilog(pz_CurrentTraceInfo,"2", "Set Param.noop", source_2, target_2);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set .pyTempValue", source_3, target_3);
{
    pega.setViaPropRef(".pyTempValue", pRef_2, myStepPage, tools.getParamValue("DTName"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set .pyTempValue", source_3, target_3);
if (whenCondition_1(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "When", null, target_4);
if (when_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "When", null, target_4);
} else {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6", "Otherwise", null, target_5);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"6", "Otherwise", null, target_5);
}
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7", "When", null, target_6);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"7", "When", null, target_6);
}
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8", "Set param.noop", source_4, target_7);
{
    tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pzDeleteAllInstancesOfDeclarativePage--(PublicAPI,String)", "pzDeleteAllInstancesOfDeclarativePage", null, "DeclarePages", new Object[] { tools, "D_pzGetCaseStepDataTransforms" })).booleanValue()));
}

actionEpilog(pz_CurrentTraceInfo,"8", "Set param.noop", source_4, target_7);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9", "Set param.DataPageName", source_5, target_8);
{
    tools.putParamValue("DataPageName", PropertyInfo.TYPE_TEXT, "D_pxRuleResolvedRelevantRecords");
}

actionEpilog(pz_CurrentTraceInfo,"9", "Set param.DataPageName", source_5, target_8);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10", "Set param.ParamName1", source_6, target_9);
{
    tools.putParamValue("ParamName1", PropertyInfo.TYPE_TEXT, "ContextClass");
}

actionEpilog(pz_CurrentTraceInfo,"10", "Set param.ParamName1", source_6, target_9);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11", "Set param.ParamValue1", source_7, target_10);
{
    tools.putParamValue("ParamValue1", PropertyInfo.TYPE_TEXT, tools.getParamValue("DTClass"));
}

actionEpilog(pz_CurrentTraceInfo,"11", "Set param.ParamValue1", source_7, target_10);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12", "Set param.ParamName2", source_8, target_11);
{
    tools.putParamValue("ParamName2", PropertyInfo.TYPE_TEXT, "RecordType");
}

actionEpilog(pz_CurrentTraceInfo,"12", "Set param.ParamName2", source_8, target_11);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13", "Set param.ParamValue2", source_9, target_12);
{
    tools.putParamValue("ParamValue2", PropertyInfo.TYPE_TEXT, "Rule-Obj-Model");
}

actionEpilog(pz_CurrentTraceInfo,"13", "Set param.ParamValue2", source_9, target_12);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"14", "Set param.noop", source_10, target_13);
{
    tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxExecuteAnActivity--(ClipboardPage,String)", "pxExecuteAnActivity", null, "Utilities", new Object[] { myStepPage, "pzFlushDataPage" })).booleanValue()));
}

actionEpilog(pz_CurrentTraceInfo,"14", "Set param.noop", source_10, target_13);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.DTName == \"\" || param.DTName == \"CREATE_NEW\"");
try {
boolean pz_3 = ((tools.getParamValue("DTName").equals("")) || (tools.getParamValue("DTName").equals("CREATE_NEW")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.DTName == \"\" || param.DTName == \"CREATE_NEW\"",pz_3);
return pz_3;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.DTName == \"\" || param.DTName == \"CREATE_NEW\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
actionProlog(pz_CurrentTraceInfo,"5.1", "Remove .pyDOParamList", null, null);
// Start Property-Remove from Remove action
{
// Expression: .pyDOParamList
ClipboardProperty pz_4 = myStepPage.getIfPresent("pyDOParamList");
try {if (pz_4!= null) {
pz_4.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +".";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
}
}// End Property-Remove from Remove action
actionEpilog(pz_CurrentTraceInfo,"5.1", "Remove .pyDOParamList", null, null);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();
// Expression: param.DTName
pz_param_1.putParamValue("ModelName", PropertyInfo.TYPE_TEXT, tools.getParamValue("DTName"));
// Expression: param.DTClass
pz_param_1.putParamValue("ClassName", PropertyInfo.TYPE_TEXT, tools.getParamValue("DTClass"));

actionProlog(pz_CurrentTraceInfo,"6.1", "Apply Data Transform pzMapDataTransformParameters", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "@baseclass";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pzMapDataTransformParameters");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"6.1", "Apply Data Transform pzMapDataTransformParameters", null, null);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.CachedValue != \"CREATE_NEW\"");
try {
boolean pz_5 = (!(tools.getParamValue("CachedValue").equals("CREATE_NEW")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.CachedValue != \"CREATE_NEW\"",pz_5);
return pz_5;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.CachedValue != \"CREATE_NEW\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
actionProlog(pz_CurrentTraceInfo,"7.1", "Exit Data Transform", null, null);
actionEpilog(pz_CurrentTraceInfo,"7.1", "Exit Data Transform", null, null);
// Exit model
return CODE_EXIT_MODEL;
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
	"Rule-Obj-Model:PZSETDATATRANSFORMNAME"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSETDATATRANSFORMNAME","Rule-Obj-Model","@BASECLASS",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-MODEL @BASECLASS PZSETDATATRANSFORMNAME #20230618T001816.341 GMT","!PZSETDATATRANSFORMNAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1736266482)
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
//	RULE-OBJ-MODEL @BASECLASS PZSETDATATRANSFORMNAME #20230618T001816.341 GMT:20230618T001816.341 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ba7b19add021899e6a9d18aa497f8c37";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
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

public static final String[] pRef_2 = new String[] { "", "", "pyTempValue", "" };
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyTempValue").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL @BASECLASS PZSETDATATRANSFORMNAME #20230618T001816.341 GMT", "@baseclass pzSetDataTransformName", "Pega-ProcessArchitect", "08-23-01", "20230618T001816.341 GMT");
}
