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
public class ra_model_pzrbsetfilters_6c1c400fb84db1ae6c5550c2553b9556 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzRBSetFilters.Data_Report_Browser.Model");
	public ra_model_pzrbsetfilters_6c1c400fb84db1ae6c5550c2553b9556(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL DATA-REPORT-BROWSER PZRBSETFILTERS #20180713T134300.001 GMT	Pega-Reporting:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "When", null, target_3);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "When", null, target_3);
}
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "When", null, target_4);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "When", null, target_4);
}
if (whenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "When", null, target_5);
if (when_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "When", null, target_5);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.resetFilters == true || Primary.pySummaryText(1) == \"\"");
try {
boolean pz_2 = ((tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "resetFilters") == true) || (scalarValueQuery_1.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.resetFilters == true || Primary.pySummaryText(1) == \"\"",pz_2);
return pz_2;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.resetFilters == true || Primary.pySummaryText(1) == \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {

// processScalarParameters
ParameterPage pz_param_1 = new ParameterPage();

actionProlog(pz_CurrentTraceInfo,"1.1", "Apply Data Transform pyRBUpdateWhiteList7", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_1 = null;
if (myStepPage != null) {
	pz_modelClass_1 = myStepPage.getClassName();
}
if ((pz_modelClass_1 == null) || (pz_modelClass_1.length() == 0)) { 
	pz_modelClass_1 = "Data-Report-Browser";
}
StringMap pz_modelKey_1 = new HashStringMap(3);
pz_modelKey_1.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_1.putString("pyModelName", "pyRBUpdateWhiteList7");
pz_modelKey_1.putString("pyClassName", pz_modelClass_1);
tools.applyModel(myStepPage, pz_modelKey_1, pz_param_1);
actionEpilog(pz_CurrentTraceInfo,"1.1", "Apply Data Transform pyRBUpdateWhiteList7", null, null);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.resetFilters==true");
try {
boolean pz_3 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "resetFilters") == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.resetFilters==true",pz_3);
return pz_3;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.resetFilters==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pzShortcutName", source_1, target_6);
{
    pega.setViaPropRef(".pzShortcutName", pRef_4, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pzShortcutName", source_1, target_6);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.2", "Set .pyDescription", source_2, target_7);
{
    pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, "Showing recent reports", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.2", "Set .pyDescription", source_2, target_7);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3", "Set .pzTitle", source_3, target_8);
{
    pega.setViaPropRef(".pzTitle", pRef_6, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.3", "Set .pzTitle", source_3, target_8);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.4", "Set .pyCategoryName", source_4, target_9);
{
    pega.setViaPropRef(".pyCategoryName", pRef_7, myStepPage, "", "sIN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.4", "Set .pyCategoryName", source_4, target_9);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.5", "Set .pyOwnerType", source_5, target_10);
{
    pega.setViaPropRef(".pyOwnerType", pRef_8, myStepPage, "", "sIN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.5", "Set .pyOwnerType", source_5, target_10);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.6", "Set .pyOwner", source_6, target_11);
{
    pega.setViaPropRef(".pyOwner", pRef_9, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.6", "Set .pyOwner", source_6, target_11);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.7", "Set .pzShortcutCreator", source_7, target_12);
{
    pega.setViaPropRef(".pzShortcutCreator", pRef_10, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.7", "Set .pzShortcutCreator", source_7, target_12);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.8", "Set .pySearchText", source_8, target_13);
{
    pega.setViaPropRef(".pySearchText", pRef_11, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.8", "Set .pySearchText", source_8, target_13);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.9", "Set .pzShowRecents", source_9, target_14);
{
    pega.setViaPropRef(".pzShowRecents", pRef_12, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.9", "Set .pzShowRecents", source_9, target_14);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.10", "Set .pyTextValue(1)", source_10, target_15);
{
    pega.setViaPropRef(".pyTextValue(1)", pRef_13, myStepPage, "true", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.10", "Set .pyTextValue(1)", source_10, target_15);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.11", "Set .pyTextValue(2)", source_11, target_16);
{
    pega.setViaPropRef(".pyTextValue(2)", pRef_14, myStepPage, "true", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.11", "Set .pyTextValue(2)", source_11, target_16);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.12", "Set .pyTextValue(3)", source_12, target_17);
{
    pega.setViaPropRef(".pyTextValue(3)", pRef_15, myStepPage, "true", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.12", "Set .pyTextValue(3)", source_12, target_17);
if (whenCondition_6(pz_CurrentTraceInfo)) {
ClipboardPage target_18 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.14", "When", null, target_18);
if (when_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.14", "When", null, target_18);
}

// processScalarParameters
ParameterPage pz_param_2 = new ParameterPage();
// Expression: false
String pz_16 = String.valueOf(false);
pz_param_2.putParamValue("includeChart", PropertyInfo.TYPE_TRUEFALSE, pz_16);
// Expression: false
String pz_17 = String.valueOf(false);
pz_param_2.putParamValue("includeSummary", PropertyInfo.TYPE_TRUEFALSE, pz_17);
// Expression: false
String pz_18 = String.valueOf(false);
pz_param_2.putParamValue("includeList", PropertyInfo.TYPE_TRUEFALSE, pz_18);
// Expression: true
String pz_19 = String.valueOf(true);
pz_param_2.putParamValue("resetFilters", PropertyInfo.TYPE_TRUEFALSE, pz_19);

actionProlog(pz_CurrentTraceInfo,"2.15", "Apply Data Transform pzRBSetFiltersByReportType", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_2 = null;
if (myStepPage != null) {
	pz_modelClass_2 = myStepPage.getClassName();
}
if ((pz_modelClass_2 == null) || (pz_modelClass_2.length() == 0)) { 
	pz_modelClass_2 = "Data-Report-Browser";
}
StringMap pz_modelKey_2 = new HashStringMap(3);
pz_modelKey_2.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_2.putString("pyModelName", "pzRBSetFiltersByReportType");
pz_modelKey_2.putString("pyClassName", pz_modelClass_2);
tools.applyModel(myStepPage, pz_modelKey_2, pz_param_2);
actionEpilog(pz_CurrentTraceInfo,"2.15", "Apply Data Transform pzRBSetFiltersByReportType", null, null);
return CODE_CONTINUE;
}private boolean whenCondition_6(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!@PropertyExists(.pySortState)");
try {
boolean pz_21 = ((!(pega.<Boolean>resolveMethodCall("PropertyExists--(String)", "PropertyExists", null, null, new Object[] { scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!@PropertyExists(.pySortState)",pz_21);
return pz_21;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!@PropertyExists(.pySortState) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.14.1", "Set .pySortState", source_13, target_19);
{
    pega.setViaPropRef(".pySortState", pRef_22, myStepPage, "Recently updated", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.14.1", "Set .pySortState", source_13, target_19);
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.categoryName != \"\"");
try {
boolean pz_23 = (!(tools.getParamValue("categoryName").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.categoryName != \"\"",pz_23);
return pz_23;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.categoryName != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pyCategoryName", source_14, target_20);
{
    pega.setViaPropRef(".pyCategoryName", pRef_7, myStepPage, tools.getParamValue("categoryName"), "sIN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pyCategoryName", source_14, target_20);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.2", "Set .pzShowRecents", source_15, target_21);
{
    pega.setViaPropRef(".pzShowRecents", pRef_12, myStepPage, false, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.2", "Set .pzShowRecents", source_15, target_21);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.3", "Set .pyOwnerType", source_16, target_22);
{
    pega.setViaPropRef(".pyOwnerType", pRef_8, myStepPage, tools.getParamValue("categoryType"), "sIN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.3", "Set .pyOwnerType", source_16, target_22);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.4", "Set .pzShortcutCreator", source_17, target_23);
{
    pega.setViaPropRef(".pzShortcutCreator", pRef_10, myStepPage, tools.getParamValue("categoryCreator"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.4", "Set .pzShortcutCreator", source_17, target_23);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.5", "Set .pyDescription", source_18, target_24);
{
    pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, "Showing reports in category:", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.5", "Set .pyDescription", source_18, target_24);
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.6", "Set .pzTitle", source_19, target_25);
{
    pega.setViaPropRef(".pzTitle", pRef_6, myStepPage, tools.getParamValue("categoryLabel"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.6", "Set .pzTitle", source_19, target_25);

// processScalarParameters
ParameterPage pz_param_3 = new ParameterPage();
// Expression: false
String pz_24 = String.valueOf(false);
pz_param_3.putParamValue("includeChart", PropertyInfo.TYPE_TRUEFALSE, pz_24);
// Expression: false
String pz_25 = String.valueOf(false);
pz_param_3.putParamValue("includeSummary", PropertyInfo.TYPE_TRUEFALSE, pz_25);
// Expression: false
String pz_26 = String.valueOf(false);
pz_param_3.putParamValue("includeList", PropertyInfo.TYPE_TRUEFALSE, pz_26);
// Expression: true
String pz_27 = String.valueOf(true);
pz_param_3.putParamValue("resetFilters", PropertyInfo.TYPE_TRUEFALSE, pz_27);

actionProlog(pz_CurrentTraceInfo,"3.7", "Apply Data Transform pzRBSetFiltersByReportType", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_3 = null;
if (myStepPage != null) {
	pz_modelClass_3 = myStepPage.getClassName();
}
if ((pz_modelClass_3 == null) || (pz_modelClass_3.length() == 0)) { 
	pz_modelClass_3 = "Data-Report-Browser";
}
StringMap pz_modelKey_3 = new HashStringMap(3);
pz_modelKey_3.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_3.putString("pyModelName", "pzRBSetFiltersByReportType");
pz_modelKey_3.putString("pyClassName", pz_modelClass_3);
tools.applyModel(myStepPage, pz_modelKey_3, pz_param_3);
actionEpilog(pz_CurrentTraceInfo,"3.7", "Apply Data Transform pzRBSetFiltersByReportType", null, null);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.searchString != \"\"");
try {
boolean pz_28 = (!(tools.getParamValue("searchString").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.searchString != \"\"",pz_28);
return pz_28;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.searchString != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pySearchText", source_20, target_26);
{
    pega.setViaPropRef(".pySearchText", pRef_11, myStepPage, tools.getParamValue("searchString"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pySearchText", source_20, target_26);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.2", "Set .pyDescription", source_21, target_27);
{
    pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, "Showing reports which match title and description for:", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.2", "Set .pyDescription", source_21, target_27);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.3", "Set .pzTitle", source_22, target_28);
{
    pega.setViaPropRef(".pzTitle", pRef_6, myStepPage, tools.getParamValue("searchString"), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.3", "Set .pzTitle", source_22, target_28);
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.4", "Set .pzShowRecents", source_23, target_29);
{
    pega.setViaPropRef(".pzShowRecents", pRef_12, myStepPage, false, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.4", "Set .pzShowRecents", source_23, target_29);

// processScalarParameters
ParameterPage pz_param_4 = new ParameterPage();
// Expression: false
String pz_29 = String.valueOf(false);
pz_param_4.putParamValue("includeChart", PropertyInfo.TYPE_TRUEFALSE, pz_29);
// Expression: false
String pz_30 = String.valueOf(false);
pz_param_4.putParamValue("includeSummary", PropertyInfo.TYPE_TRUEFALSE, pz_30);
// Expression: false
String pz_31 = String.valueOf(false);
pz_param_4.putParamValue("includeList", PropertyInfo.TYPE_TRUEFALSE, pz_31);
// Expression: true
String pz_32 = String.valueOf(true);
pz_param_4.putParamValue("resetFilters", PropertyInfo.TYPE_TRUEFALSE, pz_32);

actionProlog(pz_CurrentTraceInfo,"4.5", "Apply Data Transform pzRBSetFiltersByReportType", null, null);
/* Get the class of the primary page.  Default if empty. */
String pz_modelClass_4 = null;
if (myStepPage != null) {
	pz_modelClass_4 = myStepPage.getClassName();
}
if ((pz_modelClass_4 == null) || (pz_modelClass_4.length() == 0)) { 
	pz_modelClass_4 = "Data-Report-Browser";
}
StringMap pz_modelKey_4 = new HashStringMap(3);
pz_modelKey_4.putString("pxObjClass", "Rule-Obj-Model");
pz_modelKey_4.putString("pyModelName", "pzRBSetFiltersByReportType");
pz_modelKey_4.putString("pyClassName", pz_modelClass_4);
tools.applyModel(myStepPage, pz_modelKey_4, pz_param_4);
actionEpilog(pz_CurrentTraceInfo,"4.5", "Apply Data Transform pzRBSetFiltersByReportType", null, null);
return CODE_CONTINUE;
}private boolean whenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.RecentsOnly != \"\"");
try {
boolean pz_33 = (!(tools.getParamValue("RecentsOnly").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.RecentsOnly != \"\"",pz_33);
return pz_33;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.RecentsOnly != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
}private int when_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set .pzShowRecents", source_24, target_30);
{
    pega.setViaPropRef(".pzShowRecents", pRef_12, myStepPage, tools.getParamValue("RecentsOnly"), "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set .pzShowRecents", source_24, target_30);
if (whenCondition_7(pz_CurrentTraceInfo)) {
ClipboardPage target_31 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5.2", "When", null, target_31);
if (when_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"5.2", "When", null, target_31);
}
return CODE_CONTINUE;
}private boolean whenCondition_7(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pzShowRecents==\"false\"");
try {
boolean pz_35 = (scalarValueQuery_34.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("false"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pzShowRecents==\"false\"",pz_35);
return pz_35;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pzShowRecents==\"false\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
}private int when_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.2.1", "Set .pyDescription", source_25, target_32);
{
    pega.setViaPropRef(".pyDescription", pRef_5, myStepPage, "Showing all reports", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5.2.1", "Set .pyDescription", source_25, target_32);
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
	"Rule-Obj-Model:PZRBSETFILTERS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZRBSETFILTERS","Rule-Obj-Model","DATA-REPORT-BROWSER",false,"","Pega-Reporting","08-01-01","RULE-OBJ-MODEL DATA-REPORT-BROWSER PZRBSETFILTERS #20180713T134300.001 GMT","!PZRBSETFILTERS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-714077358)
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
//	RULE-OBJ-MODEL DATA-REPORT-BROWSER PZRBSETFILTERS #20180713T134300.001 GMT:20180802T112806.564 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f06bd10865ab9d80deafe0dffd203824";
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

public static final String[] pRef_12 = new String[] { "", "", "pzShowRecents", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyCategoryName", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyOwner", "" };
public static final String[] pRef_10 = new String[] { "", "", "pzShortcutCreator", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyOwnerType", "" };
public static final String[] pRef_11 = new String[] { "", "", "pySearchText", "" };
public static final String[] pRef_6 = new String[] { "", "", "pzTitle", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyDescription", "" };
public static final String[] pRef_15 = new String[] { "", "", "pyTextValue", "3" };
public static final String[] pRef_4 = new String[] { "", "", "pzShortcutName", "" };
public static final String[] pRef_14 = new String[] { "", "", "pyTextValue", "2" };
public static final String[] pRef_22 = new String[] { "", "", "pySortState", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyTextValue", "1" };
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().scalarProperty("pzShowRecents").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarList("pySummaryText", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pySortState").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL DATA-REPORT-BROWSER PZRBSETFILTERS #20180713T134300.001 GMT", "Data-Report-Browser pzRBSetFilters", "Pega-Reporting", "08-01-01", "20180802T112806.564 GMT");
}
