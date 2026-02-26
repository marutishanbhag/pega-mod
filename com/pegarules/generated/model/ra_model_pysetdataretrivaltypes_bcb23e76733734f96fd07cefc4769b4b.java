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
public class ra_model_pysetdataretrivaltypes_bcb23e76733734f96fd07cefc4769b4b extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pySetDataRetrivalTypes.Rule_Obj_Property.Model");
	public ra_model_pysetdataretrivaltypes_bcb23e76733734f96fd07cefc4769b4b(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL RULE-OBJ-PROPERTY PYSETDATARETRIVALTYPES #20180713T135728.759 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
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
} else {
ClipboardPage target_2 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"2", "Otherwise", null, target_2);
if (otherwise_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"2", "Otherwise", null, target_2);
}
if (whenCondition_2(pz_CurrentTraceInfo)) {
ClipboardPage target_3 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"3", "When", null, target_3);
if (when_2(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"3", "When", null, target_3);
}
if (whenCondition_3(pz_CurrentTraceInfo)) {
ClipboardPage target_4 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"4", "When", null, target_4);
if (when_3(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"4", "When", null, target_4);
}
if (whenCondition_4(pz_CurrentTraceInfo)) {
ClipboardPage target_5 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"5", "When", null, target_5);
if (when_4(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"5", "When", null, target_5);
}
if (whenCondition_5(pz_CurrentTraceInfo)) {
ClipboardPage target_6 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"6", "When", null, target_6);
if (when_5(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"6", "When", null, target_6);
}
if (whenCondition_6(pz_CurrentTraceInfo)) {
ClipboardPage target_7 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"7", "When", null, target_7);
if (when_6(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"7", "When", null, target_7);
}
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8", "Set .pyIsNonTransient", source_1, target_8);
{
    pega.setViaPropRef(".pyIsNonTransient", pRef_1, myStepPage, ((!scalarValueQuery_2.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE))), "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"8", "Set .pyIsNonTransient", source_1, target_8);
if (whenCondition_7(pz_CurrentTraceInfo)) {
ClipboardPage target_9 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"9", "When", null, target_9);
if (when_7(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"9", "When", null, target_9);
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(.pyUsesOldAutoPopulate==\"\"|| .pyUsesOldAutoPopulate==\"true\")&amp;&amp; .pyIsAssociation==\"true\"");
try {
boolean pz_5 = (((scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals("")) || (scalarValueQuery_3.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"))) && (scalarValueQuery_4.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(.pyUsesOldAutoPopulate==\"\"|| .pyUsesOldAutoPopulate==\"true\")&amp;&amp; .pyIsAssociation==\"true\"",pz_5);
return pz_5;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(.pyUsesOldAutoPopulate==\"\"|| .pyUsesOldAutoPopulate==\"true\")&amp;&amp; .pyIsAssociation==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_1, pz_modelTargetConditionFrame_1);
}
}private int when_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1", "Set .pyDataRetrievalType", source_2, target_10);
{
    pega.setViaPropRef(".pyDataRetrievalType", pRef_6, myStepPage, "AUTOMATIC", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1.1", "Set .pyDataRetrievalType", source_2, target_10);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.2", "Set .pyUsesOldAutoPopulate", source_3, target_11);
{
    pega.setViaPropRef(".pyUsesOldAutoPopulate", pRef_7, myStepPage, "true", "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1.2", "Set .pyUsesOldAutoPopulate", source_3, target_11);
if (whenCondition_8(pz_CurrentTraceInfo)) {
ClipboardPage target_12 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"1.3", "When", null, target_12);
if (when_8(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.3", "When", null, target_12);
}
return CODE_CONTINUE;
}private boolean whenCondition_8(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_2 = true;
PRStackFrame pz_modelTargetConditionFrame_2 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyAssocUseDeclareTemplate==\"true\"");
try {
boolean pz_9 = (scalarValueQuery_8.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyAssocUseDeclareTemplate==\"true\"",pz_9);
return pz_9;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyAssocUseDeclareTemplate==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_2, pz_modelTargetConditionFrame_2);
}
}private int when_8(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.3.1", "Set .pyDataObject", source_4, target_13);
{
    pega.setViaPropRef(".pyDataObject", pRef_10, myStepPage, scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1.3.1", "Set .pyDataObject", source_4, target_13);
return CODE_CONTINUE;
}private int otherwise_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2.1", "Set .pyUsesOldAutoPopulate", source_5, target_14);
{
    pega.setViaPropRef(".pyUsesOldAutoPopulate", pRef_7, myStepPage, "false", "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2.1", "Set .pyUsesOldAutoPopulate", source_5, target_14);
return CODE_CONTINUE;
}private boolean whenCondition_2(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_3 = true;
PRStackFrame pz_modelTargetConditionFrame_3 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyIsGateway==\"true\"");
try {
boolean pz_13 = (scalarValueQuery_12.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyIsGateway==\"true\"",pz_13);
return pz_13;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyIsGateway==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_3, pz_modelTargetConditionFrame_3);
}
}private int when_2(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3.1", "Set .pyAdvancedPropType", source_6, target_15);
{
    pega.setViaPropRef(".pyAdvancedPropType", pRef_14, myStepPage, "LINKED", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3.1", "Set .pyAdvancedPropType", source_6, target_15);
return CODE_CONTINUE;
}private boolean whenCondition_3(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_4 = true;
PRStackFrame pz_modelTargetConditionFrame_4 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyPropertyMode == \"String\" &amp;&amp; (.pyAdvancedPropType == \"\" || .pyAdvancedPropType == \"MANUAL\") &amp;&amp; .pyIsReference==true");
try {
boolean pz_18 = (((scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("String")) && ((scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) || (scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("MANUAL")))) && (scalarValueQuery_17.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == true));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyPropertyMode == \"String\" &amp;&amp; (.pyAdvancedPropType == \"\" || .pyAdvancedPropType == \"MANUAL\") &amp;&amp; .pyIsReference==true",pz_18);
return pz_18;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyPropertyMode == \"String\" &amp;&amp; (.pyAdvancedPropType == \"\" || .pyAdvancedPropType == \"MANUAL\") &amp;&amp; .pyIsReference==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_4, pz_modelTargetConditionFrame_4);
}
}private int when_3(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.1", "Set .pyIsReference", source_7, target_16);
{
    pega.setViaPropRef(".pyIsReference", pRef_19, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.1", "Set .pyIsReference", source_7, target_16);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4.2", "Set .pyIsManualReference", source_8, target_17);
{
    pega.setViaPropRef(".pyIsManualReference", pRef_20, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4.2", "Set .pyIsManualReference", source_8, target_17);
return CODE_CONTINUE;
}private boolean whenCondition_4(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_5 = true;
PRStackFrame pz_modelTargetConditionFrame_5 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyDataRetrievalType == \"AUTOMATIC\" &amp;&amp; .pyIsReference==\"true\"");
try {
boolean pz_22 = ((scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("AUTOMATIC")) && (scalarValueQuery_17.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyDataRetrievalType == \"AUTOMATIC\" &amp;&amp; .pyIsReference==\"true\"",pz_22);
return pz_22;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyDataRetrievalType == \"AUTOMATIC\" &amp;&amp; .pyIsReference==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_5, pz_modelTargetConditionFrame_5);
}
}private int when_4(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5.1", "Set .pyDataRetrievalType", source_9, target_18);
{
    pega.setViaPropRef(".pyDataRetrievalType", pRef_6, myStepPage, "AUTOMATIC", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5.1", "Set .pyDataRetrievalType", source_9, target_18);
return CODE_CONTINUE;
}private boolean whenCondition_5(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_6 = true;
PRStackFrame pz_modelTargetConditionFrame_6 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyDataRetrievalType == \"AUTOMATIC\" &amp;&amp; .pyIsReference==\"false\"");
try {
boolean pz_23 = ((scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("AUTOMATIC")) && (scalarValueQuery_17.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("false")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyDataRetrievalType == \"AUTOMATIC\" &amp;&amp; .pyIsReference==\"false\"",pz_23);
return pz_23;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyDataRetrievalType == \"AUTOMATIC\" &amp;&amp; .pyIsReference==\"false\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_6, pz_modelTargetConditionFrame_6);
}
}private int when_5(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6.1", "Set .pyDataRetrievalType", source_10, target_19);
{
    pega.setViaPropRef(".pyDataRetrievalType", pRef_6, myStepPage, "AUTOMATICNONREF", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6.1", "Set .pyDataRetrievalType", source_10, target_19);
return CODE_CONTINUE;
}private boolean whenCondition_6(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_7 = true;
PRStackFrame pz_modelTargetConditionFrame_7 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyPropertyMode == \"String\" &amp;&amp; .pyAdvancedPropType == \"\" &amp;&amp; .pyIsReference==false");
try {
boolean pz_24 = (((scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("String")) && (scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) && (scalarValueQuery_17.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == false));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyPropertyMode == \"String\" &amp;&amp; .pyAdvancedPropType == \"\" &amp;&amp; .pyIsReference==false",pz_24);
return pz_24;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyPropertyMode == \"String\" &amp;&amp; .pyAdvancedPropType == \"\" &amp;&amp; .pyIsReference==false " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_7, pz_modelTargetConditionFrame_7);
}
}private int when_6(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7.1", "Set .pyAdvancedPropType", source_11, target_20);
{
    pega.setViaPropRef(".pyAdvancedPropType", pRef_14, myStepPage, "MANUAL", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"7.1", "Set .pyAdvancedPropType", source_11, target_20);
return CODE_CONTINUE;
}private boolean whenCondition_7(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_8 = true;
PRStackFrame pz_modelTargetConditionFrame_8 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(.pyPropertyMode == \"Page\" || .pyPropertyMode ==\"PageList\")");
try {
boolean pz_25 = ((scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Page")) || (scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("PageList")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(.pyPropertyMode == \"Page\" || .pyPropertyMode ==\"PageList\")",pz_25);
return pz_25;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(.pyPropertyMode == \"Page\" || .pyPropertyMode ==\"PageList\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_8, pz_modelTargetConditionFrame_8);
}
}private int when_7(RuleTraceInfo pz_CurrentTraceInfo) {
if (whenCondition_9(pz_CurrentTraceInfo)) {
ClipboardPage target_21 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"9.1", "When", null, target_21);
if (when_9(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"9.1", "When", null, target_21);
}
if (whenCondition_10(pz_CurrentTraceInfo)) {
ClipboardPage target_22 =pega.getScopedStepContext("TARGET");actionProlog(pz_CurrentTraceInfo,"9.2", "When", null, target_22);
if (when_10(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"9.2", "When", null, target_22);
}
return CODE_CONTINUE;
}private boolean whenCondition_9(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_9 = true;
PRStackFrame pz_modelTargetConditionFrame_9 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyIsReference == true &amp;&amp; (.pyDataRetrievalType == \"\" ||.pyDataRetrievalType == \"MANUAL\")");
try {
boolean pz_26 = ((scalarValueQuery_17.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == true) && ((scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) || (scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("MANUAL"))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyIsReference == true &amp;&amp; (.pyDataRetrievalType == \"\" ||.pyDataRetrievalType == \"MANUAL\")",pz_26);
return pz_26;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyIsReference == true &amp;&amp; (.pyDataRetrievalType == \"\" ||.pyDataRetrievalType == \"MANUAL\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_9, pz_modelTargetConditionFrame_9);
}
}private int when_9(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.1.1", "Set .pyIsManualReference", source_12, target_23);
{
    pega.setViaPropRef(".pyIsManualReference", pRef_20, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"9.1.1", "Set .pyIsManualReference", source_12, target_23);
return CODE_CONTINUE;
}private boolean whenCondition_10(RuleTraceInfo pz_CurrentTraceInfo) {
boolean pz_CheckMessage_10 = true;
PRStackFrame pz_modelTargetConditionFrame_10 = pega.pushStackFrame("When", null, false, true);
try {	// When
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyIsReference == false &amp;&amp; .pyIsAssociation == false");
try {
boolean pz_27 = ((scalarValueQuery_17.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == false) && (scalarValueQuery_4.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == false));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyIsReference == false &amp;&amp; .pyIsAssociation == false",pz_27);
return pz_27;
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyIsReference == false &amp;&amp; .pyIsAssociation == false " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage_10, pz_modelTargetConditionFrame_10);
}
}private int when_10(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9.2.1", "Set .pyDataRetrievalType", source_13, target_24);
{
    pega.setViaPropRef(".pyDataRetrievalType", pRef_6, myStepPage, "MANUAL", "stN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"9.2.1", "Set .pyDataRetrievalType", source_13, target_24);
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
	"Rule-Obj-Model:PYSETDATARETRIVALTYPES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYSETDATARETRIVALTYPES","Rule-Obj-Model","RULE-OBJ-PROPERTY",false,"","Pega-SystemArchitect","08-01-01","RULE-OBJ-MODEL RULE-OBJ-PROPERTY PYSETDATARETRIVALTYPES #20180713T135728.759 GMT","!PYSETDATARETRIVALTYPES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1398029140)
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
//	RULE-OBJ-MODEL RULE-OBJ-PROPERTY PYSETDATARETRIVALTYPES #20180713T135728.759 GMT:20180713T135728.759 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "a265ce824b66277d03fdf328d0bdc628";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Property";
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

public static final String[] pRef_6 = new String[] { "", "", "pyDataRetrievalType", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyIsReference", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyIsNonTransient", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyUsesOldAutoPopulate", "" };
public static final String[] pRef_20 = new String[] { "", "", "pyIsManualReference", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyDataObject", "" };
public static final String[] pRef_14 = new String[] { "", "", "pyAdvancedPropType", "" };
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyPropertyMode").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyAssocUseDeclareTemplate").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().scalarProperty("pyAssocDeclareTemplate").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyIsGateway").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().scalarProperty("pyIsTransient").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pyDataRetrievalType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyIsReference").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyUsesOldAutoPopulate").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pyIsAssociation").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyAdvancedPropType").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ-PROPERTY PYSETDATARETRIVALTYPES #20180713T135728.759 GMT", "Rule-Obj-Property pySetDataRetrivalTypes", "Pega-SystemArchitect", "08-01-01", "20180713T135728.759 GMT");
}
