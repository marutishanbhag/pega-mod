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
public class ra_model_pzconditiondefaulttoalways_4610d8d95a6f61bf65ed5d93341b9ba2 extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzConditionDefaultToAlways.Embed_StageProcess.Model");
	public ra_model_pzconditiondefaulttoalways_4610d8d95a6f61bf65ed5d93341b9ba2(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL EMBED-STAGEPROCESS PZCONDITIONDEFAULTTOALWAYS #20190415T062543.138 GMT	Pega-ProcessArchitect:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
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
} else {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6", "Otherwise", null, target_3);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"6", "Otherwise", null, target_3);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(.pyAutomaticStart,\"true\")");
try {
boolean pz_2 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "true" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pyAutomaticStart,\"true\")",pz_2);
return pz_2;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(.pyAutomaticStart,\"true\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.1", "When", null, target_4);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.1", "When", null, target_4);
}
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2.3", "When", null, target_5);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"2.3", "When", null, target_5);
}
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(.pyConditionSelectorAuto==\"pxPegaExpressCompareFields\"  &amp;&amp;  .pyStartWhenForCase==\"\") || (.pyConditionSelectorAuto==\"existingWhen\"  &amp;&amp;  .pyExistingWhenRuleAuto==\"\")");
try {
boolean pz_6 = (((scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pxPegaExpressCompareFields")) && (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) || ((scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("existingWhen")) && (scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(.pyConditionSelectorAuto==\"pxPegaExpressCompareFields\"  &amp;&amp;  .pyStartWhenForCase==\"\") || (.pyConditionSelectorAuto==\"existingWhen\"  &amp;&amp;  .pyExistingWhenRuleAuto==\"\")",pz_6);
return pz_6;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(.pyConditionSelectorAuto==\"pxPegaExpressCompareFields\"  &amp;&amp;  .pyStartWhenForCase==\"\") || (.pyConditionSelectorAuto==\"existingWhen\"  &amp;&amp;  .pyExistingWhenRuleAuto==\"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.1", "Set .pyAutoStartWhenType", source_1, target_6);
{
    pega.setViaPropRef(".pyAutoStartWhenType", pRef_7, myStepPage, "always", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1.1", "Set .pyAutoStartWhenType", source_1, target_6);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.2", "Set .pyConditionSelectorAuto", source_2, target_7);
{
    pega.setViaPropRef(".pyConditionSelectorAuto", pRef_8, myStepPage, "Always", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1.2", "Set .pyConditionSelectorAuto", source_2, target_7);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.3", "Set .pyExistingWhenRuleAuto", source_3, target_8);
{
    pega.setViaPropRef(".pyExistingWhenRuleAuto", pRef_9, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1.3", "Set .pyExistingWhenRuleAuto", source_3, target_8);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.4", "Set .pyWhenEvaluatesToAuto", source_4, target_9);
{
    pega.setViaPropRef(".pyWhenEvaluatesToAuto", pRef_10, myStepPage, "", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1.4", "Set .pyWhenEvaluatesToAuto", source_4, target_9);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1.5", "Set .pyStartWhenForCase", source_5, target_10);
{
    pega.setViaPropRef(".pyStartWhenForCase", pRef_11, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1.5", "Set .pyStartWhenForCase", source_5, target_10);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyAutoStartWhenType==\"always\"");
try {
boolean pz_13 = (scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("always"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyAutoStartWhenType==\"always\"",pz_13);
return pz_13;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyAutoStartWhenType==\"always\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.3.1", "Set .pyStartWhenForCase", source_6, target_11);
{
    pega.setViaPropRef(".pyStartWhenForCase", pRef_11, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.3.1", "Set .pyStartWhenForCase", source_6, target_11);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(.pyManualStart,\"true\")");
try {
boolean pz_15 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "true" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pyManualStart,\"true\")",pz_15);
return pz_15;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(.pyManualStart,\"true\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_12 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.1", "When", null, target_12);
if (when_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.1", "When", null, target_12);
}
if (whenCondition_6(pz_CurrentTraceInfo)) {
ClipboardPage target_13 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4.3", "When", null, target_13);
if (when_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"4.3", "When", null, target_13);
}
return CODE_CONTINUE;
}private boolean whenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(.pyConditionSelector==\"pxPegaExpressCompareFields\"  &amp;&amp;  .pyWhen==\"\") || (.pyConditionSelector==\"existingWhen\" &amp;&amp; .pyExistingWhenRule==\"\")");
try {
boolean pz_19 = (((scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pxPegaExpressCompareFields")) && (scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) || ((scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("existingWhen")) && (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(.pyConditionSelector==\"pxPegaExpressCompareFields\"  &amp;&amp;  .pyWhen==\"\") || (.pyConditionSelector==\"existingWhen\" &amp;&amp; .pyExistingWhenRule==\"\")",pz_19);
return pz_19;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(.pyConditionSelector==\"pxPegaExpressCompareFields\"  &amp;&amp;  .pyWhen==\"\") || (.pyConditionSelector==\"existingWhen\" &amp;&amp; .pyExistingWhenRule==\"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
}private int when_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.1", "Set .pySkipOrAllowType", source_7, target_14);
{
    pega.setViaPropRef(".pySkipOrAllowType", pRef_20, myStepPage, "always", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1.1", "Set .pySkipOrAllowType", source_7, target_14);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.2", "Set .pyConditionSelector", source_8, target_15);
{
    pega.setViaPropRef(".pyConditionSelector", pRef_21, myStepPage, "Always", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1.2", "Set .pyConditionSelector", source_8, target_15);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.3", "Set .pyExistingWhenRule", source_9, target_16);
{
    pega.setViaPropRef(".pyExistingWhenRule", pRef_22, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1.3", "Set .pyExistingWhenRule", source_9, target_16);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.4", "Set .pyWhenEvaluatesTo", source_10, target_17);
{
    pega.setViaPropRef(".pyWhenEvaluatesTo", pRef_23, myStepPage, "", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1.4", "Set .pyWhenEvaluatesTo", source_10, target_17);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1.5", "Set .pyWhen", source_11, target_18);
{
    pega.setViaPropRef(".pyWhen", pRef_24, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1.5", "Set .pyWhen", source_11, target_18);
return CODE_CONTINUE;
}private boolean whenCondition_6(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pySkipOrAllowType==\"always\"");
try {
boolean pz_26 = (scalarValueQuery_25.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("always"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pySkipOrAllowType==\"always\"",pz_26);
return pz_26;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pySkipOrAllowType==\"always\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
}private int when_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.3.1", "Set .pyWhen", source_12, target_19);
{
    pega.setViaPropRef(".pyWhen", pRef_24, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.3.1", "Set .pyWhen", source_12, target_19);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_7(pz_CurrentTraceInfo)) {
ClipboardPage target_20 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6.1", "When", null, target_20);
if (when_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"6.1", "When", null, target_20);
}
if (whenCondition_8(pz_CurrentTraceInfo)) {
ClipboardPage target_21 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6.3", "When", null, target_21);
if (when_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"6.3", "When", null, target_21);
}
return CODE_CONTINUE;
}private boolean whenCondition_7(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(.pyConditionSelector==\"pxPegaExpressCompareFields\" &amp;&amp; .pyStartWhen==\"\") || (.pyConditionSelector==\"existingWhen\" &amp;&amp; .pyExistingWhenRule==\"\")");
try {
boolean pz_28 = (((scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pxPegaExpressCompareFields")) && (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) || ((scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("existingWhen")) && (scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(.pyConditionSelector==\"pxPegaExpressCompareFields\" &amp;&amp; .pyStartWhen==\"\") || (.pyConditionSelector==\"existingWhen\" &amp;&amp; .pyExistingWhenRule==\"\")",pz_28);
return pz_28;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(.pyConditionSelector==\"pxPegaExpressCompareFields\" &amp;&amp; .pyStartWhen==\"\") || (.pyConditionSelector==\"existingWhen\" &amp;&amp; .pyExistingWhenRule==\"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
}private int when_7(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.1", "Set .pySkipOrAllowType", source_13, target_22);
{
    pega.setViaPropRef(".pySkipOrAllowType", pRef_20, myStepPage, "always", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.1.1", "Set .pySkipOrAllowType", source_13, target_22);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.2", "Set .pyConditionSelector", source_14, target_23);
{
    pega.setViaPropRef(".pyConditionSelector", pRef_21, myStepPage, "Always", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.1.2", "Set .pyConditionSelector", source_14, target_23);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.3", "Set .pyExistingWhenRule", source_15, target_24);
{
    pega.setViaPropRef(".pyExistingWhenRule", pRef_22, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.1.3", "Set .pyExistingWhenRule", source_15, target_24);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.4", "Set .pyWhenEvaluatesTo", source_16, target_25);
{
    pega.setViaPropRef(".pyWhenEvaluatesTo", pRef_23, myStepPage, "", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.1.4", "Set .pyWhenEvaluatesTo", source_16, target_25);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.5", "Set .pyStartWhen", source_17, target_26);
{
    pega.setViaPropRef(".pyStartWhen", pRef_29, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.1.5", "Set .pyStartWhen", source_17, target_26);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1.6", "Set .pyWhenToSkip", source_18, target_27);
{
    pega.setViaPropRef(".pyWhenToSkip", pRef_30, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.1.6", "Set .pyWhenToSkip", source_18, target_27);
return CODE_CONTINUE;
}private boolean whenCondition_8(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_8 = true;
PRStackFrame pz_modelTargetConditionFrame_8 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pySkipOrAllowType==\"always\"");
try {
boolean pz_31 = (scalarValueQuery_25.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("always"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pySkipOrAllowType==\"always\"",pz_31);
return pz_31;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pySkipOrAllowType==\"always\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_8, pz_modelTargetConditionFrame_8);
}
}private int when_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.3.1", "Set .pyWhenToSkip", source_19, target_28);
{
    pega.setViaPropRef(".pyWhenToSkip", pRef_30, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.3.1", "Set .pyWhenToSkip", source_19, target_28);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.3.2", "Set .pyStartWhen", source_20, target_29);
{
    pega.setViaPropRef(".pyStartWhen", pRef_29, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.3.2", "Set .pyStartWhen", source_20, target_29);
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
	"Rule-Obj-Model:PZCONDITIONDEFAULTTOALWAYS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZCONDITIONDEFAULTTOALWAYS","Rule-Obj-Model","EMBED-STAGEPROCESS",false,"","Pega-ProcessArchitect","08-03-01","RULE-OBJ-MODEL EMBED-STAGEPROCESS PZCONDITIONDEFAULTTOALWAYS #20190415T062543.138 GMT","!PZCONDITIONDEFAULTTOALWAYS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1332116269)
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
//	RULE-OBJ-MODEL EMBED-STAGEPROCESS PZCONDITIONDEFAULTTOALWAYS #20190415T062543.138 GMT:20190530T130811.007 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "b76f0121494ec43f0904800d97c4ea21";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-StageProcess";
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

public static final String[] pRef_23 = new String[] { "", "", "pyWhenEvaluatesTo", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyConditionSelectorAuto", "" };
public static final String[] pRef_24 = new String[] { "", "", "pyWhen", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyStartWhenForCase", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyConditionSelector", "" };
public static final String[] pRef_29 = new String[] { "", "", "pyStartWhen", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyWhenToSkip", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyWhenEvaluatesToAuto", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyAutoStartWhenType", "" };
public static final String[] pRef_20 = new String[] { "", "", "pySkipOrAllowType", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyExistingWhenRuleAuto", "" };
public static final String[] pRef_22 = new String[] { "", "", "pyExistingWhenRule", "" };
private static final ScalarValueQuery scalarValueQuery_25 = FUAUtil.createQueryBuilder().scalarProperty("pySkipOrAllowType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pyStartWhenForCase").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pyExistingWhenRule").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyAutoStartWhenType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyConditionSelector").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyWhen").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyAutomaticStart").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_27 = FUAUtil.createQueryBuilder().scalarProperty("pyStartWhen").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyConditionSelectorAuto").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyExistingWhenRuleAuto").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyManualStart").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL EMBED-STAGEPROCESS PZCONDITIONDEFAULTTOALWAYS #20190415T062543.138 GMT", "Embed-StageProcess pzConditionDefaultToAlways", "Pega-ProcessArchitect", "08-03-01", "20190530T130811.007 GMT");
}
