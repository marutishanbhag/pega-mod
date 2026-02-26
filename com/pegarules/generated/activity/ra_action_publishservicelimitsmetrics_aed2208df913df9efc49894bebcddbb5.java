package com.pegarules.generated.activity;
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
import Pega.*;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.*;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
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
import com.pegarules.generated.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class ra_action_publishservicelimitsmetrics_aed2208df913df9efc49894bebcddbb5 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.PublishServiceLimitsMetrics.PegaAESRemote_Interface_CDHMetricsInfo.Action");
	public ra_action_publishservicelimitsmetrics_aed2208df913df9efc49894bebcddbb5(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-CDHMETRICSINFO PUBLISHSERVICELIMITSMETRICS #20230619T005635.174 GMT	PegaAESRemote:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-CDHMETRICSINFO PUBLISHSERVICELIMITSMETRICS #20230619T005635.174 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_circum0");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-CDHMETRICSINFO PUBLISHSERVICELIMITSMETRICS #20230619T005635.174 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-CDHMETRICSINFO PUBLISHSERVICELIMITSMETRICS #20230619T005635.174 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SEND"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-CDHMETRICSINFO PUBLISHSERVICELIMITSMETRICS #20230619T005635.174 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ACS"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-CDHMETRICSINFO PUBLISHSERVICELIMITSMETRICS #20230619T005635.174 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} 
} catch (ActivityTerminateException ate) {
throw ate; // Terminate all activity processing
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (PRRuntimeException prre) {
if (!pz_methodStatusUpdated) {pega.setThreadPropertyValue(".pxMethodStatus", prre.toString());}
pega.activityStepExceptionHandler(prre, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw prre;
} catch (RuntimeException re) {
pega.setThreadPropertyValue(".pxMethodStatus", re.toString());
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pega.activityEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo);}
}
} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

	public boolean isAllowedInWeb() {
	 return isAllowedInWeb;
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:PUBLISHSERVICELIMITSMETRICS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PUBLISHSERVICELIMITSMETRICS","Rule-Obj-Activity","PEGAAESREMOTE-INTERFACE-CDHMETRICSINFO",false,"","PegaAESRemote","08-23-01","RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-CDHMETRICSINFO PUBLISHSERVICELIMITSMETRICS #20230619T005635.174 GMT","!PUBLISHSERVICELIMITSMETRICS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1129110451)
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
//	RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-CDHMETRICSINFO PUBLISHSERVICELIMITSMETRICS #20230619T005635.174 GMT:20230619T005635.174 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "6a181ec70248dc450f78c5845bf1c253";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAESRemote-Interface-CDHMetricsInfo";
	}
public String getAspect() {
return "Action";
}
/**
 * Hard check on CDH system, publish only on 4GMT to 6 GMT and production system.
 * <p>
 * Step 1 <code>Log-Message</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"PegaMKT-Install\",\"MKTCurrentVersion\")!=\"\"");
try {
boolean pz_1 = (!(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "PegaMKT-Install", "MKTCurrentVersion" }).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"PegaMKT-Install\",\"MKTCurrentVersion\")!=\"\"",pz_1);
if (!pz_1) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PublishServiceLimitsMetrics - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@getDataSystemSetting(\"PegaMKT-Install\",\"MKTCurrentVersion\")!=\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(@hour(@String.toDecimal(@DateTime.dateStringToBigDecimal(@substring(@getCurrentTimeStamp(),0,23),\"DateTime\",tools))))&gt;3&amp;&amp;(@hour(@String.toDecimal(@DateTime.dateStringToBigDecimal(@substring(@getCurrentTimeStamp(),0,23),\"DateTime\",tools))))&lt;=6");
try {
boolean pz_2 = (((pega.<Integer>resolveMethodCall("hour--(BigDecimal)", "hour", null, null, new Object[] { pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("toDecimal--(String)", "toDecimal", null, "String", new Object[] { pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("dateStringToBigDecimal--(String,String,PublicAPI)", "dateStringToBigDecimal", null, "DateTime", new Object[] { pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, null, new Object[] { PRDateFormat.formatIDT(System.currentTimeMillis()), 0, 23 }), "DateTime", tools }).format(-1, -1) }) })).intValue() > 3) && ((pega.<Integer>resolveMethodCall("hour--(BigDecimal)", "hour", null, null, new Object[] { pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("toDecimal--(String)", "toDecimal", null, "String", new Object[] { pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("dateStringToBigDecimal--(String,String,PublicAPI)", "dateStringToBigDecimal", null, "DateTime", new Object[] { pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, null, new Object[] { PRDateFormat.formatIDT(System.currentTimeMillis()), 0, 23 }), "DateTime", tools }).format(-1, -1) }) })).intValue() <= 6));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(@hour(@String.toDecimal(@DateTime.dateStringToBigDecimal(@substring(@getCurrentTimeStamp(),0,23),\"DateTime\",tools))))&gt;3&amp;&amp;(@hour(@String.toDecimal(@DateTime.dateStringToBigDecimal(@substring(@getCurrentTimeStamp(),0,23),\"DateTime\",tools))))&lt;=6",pz_2);
if (!pz_2) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PublishServiceLimitsMetrics - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(@hour(@String.toDecimal(@DateTime.dateStringToBigDecimal(@substring(@getCurrentTimeStamp(),0,23),\"DateTime\",tools))))&gt;3&amp;&amp;(@hour(@String.toDecimal(@DateTime.dateStringToBigDecimal(@substring(@getCurrentTimeStamp(),0,23),\"DateTime\",tools))))&lt;=6 " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "pxProcess.pzProductionLevel==5");
try {
boolean pz_4 = (scalarValueQuery_3.resolveToInt(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_INTEGER) == 5);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "pxProcess.pzProductionLevel==5",pz_4);
if (!pz_4) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("pxProcess.pzProductionLevel==5 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "PegaAESRemote : PublishServiceLimitsMetrics Invoked for prod system"
if( oLog.isInfoEnabled() ){
oLog.info("PegaAESRemote : PublishServiceLimitsMetrics Invoked for prod system");
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "pxProcess.pzProductionLevel==5");
try {
boolean pz_5 = (scalarValueQuery_3.resolveToInt(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_INTEGER) == 5);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "pxProcess.pzProductionLevel==5",pz_5);
if (pz_5) {
// branch to block SEND
nextBlock = "SEND";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("pxProcess.pzProductionLevel==5 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Check time limit for other than prod systems.
 * <p>
 * Step 2 <code>Log-Message</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"PegaAESRemote\",\"aessetting/captureRunMetricsTill\")!=\"\"");
try {
boolean pz_6 = (!(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "PegaAESRemote", "aessetting/captureRunMetricsTill" }).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"PegaAESRemote\",\"aessetting/captureRunMetricsTill\")!=\"\"",pz_6);
if (!pz_6) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PublishServiceLimitsMetrics - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@getDataSystemSetting(\"PegaAESRemote\",\"aessetting/captureRunMetricsTill\")!=\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@DateTimeDifference(@DateTime.CurrentDateTime(),@getDataSystemSetting(\"PegaAESRemote\",\"aessetting/captureRunMetricsTill\"),\"h\")&gt;=0");
try {
boolean pz_7 = (BigDecimal.valueOf((pega.<Double>resolveMethodCall("DateTimeDifference--(String,String,String)", "DateTimeDifference", null, null, new Object[] { PRDateFormat.formatIDT(System.currentTimeMillis()), pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "PegaAESRemote", "aessetting/captureRunMetricsTill" }), "h" })).doubleValue()).compareTo(BigDecimal.ZERO) >= 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@DateTimeDifference(@DateTime.CurrentDateTime(),@getDataSystemSetting(\"PegaAESRemote\",\"aessetting/captureRunMetricsTill\"),\"h\")&gt;=0",pz_7);
if (!pz_7) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PublishServiceLimitsMetrics - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@DateTimeDifference(@DateTime.CurrentDateTime(),@getDataSystemSetting(\"PegaAESRemote\",\"aessetting/captureRunMetricsTill\"),\"h\")&gt;=0 " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@DateTimeDifference(@DateTime.CurrentDateTime(),@getDataSystemSetting(\"PegaAESRemote\",\"aessetting/captureRunMetricsTill\"),\"h\")&lt;=240");
try {
boolean pz_8 = (BigDecimal.valueOf((pega.<Double>resolveMethodCall("DateTimeDifference--(String,String,String)", "DateTimeDifference", null, null, new Object[] { PRDateFormat.formatIDT(System.currentTimeMillis()), pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "PegaAESRemote", "aessetting/captureRunMetricsTill" }), "h" })).doubleValue()).compareTo(BigDecimal.valueOf(240)) <= 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@DateTimeDifference(@DateTime.CurrentDateTime(),@getDataSystemSetting(\"PegaAESRemote\",\"aessetting/captureRunMetricsTill\"),\"h\")&lt;=240",pz_8);
if (!pz_8) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PublishServiceLimitsMetrics - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@DateTimeDifference(@DateTime.CurrentDateTime(),@getDataSystemSetting(\"PegaAESRemote\",\"aessetting/captureRunMetricsTill\"),\"h\")&lt;=240 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "PegaAESRemote : PublishServiceLimitsMetrics Invoked for staging system"
if( oLog.isInfoEnabled() ){
oLog.info("PegaAESRemote : PublishServiceLimitsMetrics Invoked for staging system");
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Queue the SendServiceLimitsMetricsAsync activity because any failure on data push, agent never stop.
 * <p>
 * Step 3 [SEND] <code>Queue SendServiceLimitsMetricsAsync</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Queue SendServiceLimitsMetricsAsync");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Queue SendServiceLimitsMetricsAsync", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Queue SendServiceLimitsMetricsAsync
if (myStepPage == null) {
}
// Queuing Activity : SendServiceLimitsMetricsAsync
String activityClass = null;
if (myStepPage != null) {
activityClass = myStepPage.getClassName();
}
if ((activityClass == null) || (activityClass.length() == 0)) { 
activityClass = "PegaAESRemote-Interface-CDHMetricsInfo";
}
ParameterPage newParamsPage = null;
newParamsPage = tools.getParameterPage();
if(newParamsPage != null) {
newParamsPage.putString("pzIsQueuedActivity","true");
}
tools.getRequestor().queueBatchActivity(activityClass,"SendServiceLimitsMetricsAsync",newParamsPage);
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.generator.RuleNotFoundException rnf) {
// Handle RuleNotFoundException via pyOnException block defined for this step
FUAUtil.activityStepStatusUpdateForException(pega, rnf);
nextBlock = "ACS";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "ACS";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__1 = pega.invokeWhen("StepStatusFail", "PegaAESRemote-Interface-CDHMetricsInfo", "PegaAESRemote-Interface-CDHMetricsInfo");
if (pz__1) {
// branch to block ACS
nextBlock = "ACS";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Queue SendServiceLimitsMetricsAsync",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Clear activity status if any failure.
 * <p>
 * Step 4 [ACS] <code>Activity-Clear-Status</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Activity-Clear-Status", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Activity-Clear-Status
tools.getActivityStatus().clear();
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public String nextBlock="";
boolean pz_Status = true;
boolean pz_methodStatusUpdated = false;
private boolean debugIsOn=false;
private int forEachCounter = 0;
private int pz_forEachSkipClass = 0;
private InfEngUtils infEngine = null;
ClipboardProperty nextProperty = null;
String pz_CurrentRuleKey = "";
String pz_CurrentCircumstance = "";
String pz_CurrentStepNum = "";
com.pega.pegarules.priv.tracer.ActivityTraceInfo pz_CurrentTraceInfo = null;
String pz_thisPageClass = "";
Dictionary pz_Dictionary = null;
private static final boolean isAllowedInWeb = true;
String statusReturnedFromNestedLoop = "";

public void initializeStandardLocalVariables() {
	nextBlock="";
	pz_Status = true;
	pz_methodStatusUpdated = false;
	debugIsOn=false;
	forEachCounter = 0;
	pz_forEachSkipClass = 0;
	infEngine = null;
	nextProperty = null;
	pz_CurrentRuleKey = "";
	pz_CurrentCircumstance = "";
	pz_CurrentStepNum = "";
	pz_CurrentTraceInfo = null;
	pz_thisPageClass = "";
	pz_Dictionary = null;
	statusReturnedFromNestedLoop = "";
}


public void initializeUserLocalVariables() {
}


public StringMap snapshotLocalVariables() {
	return null;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pzProductionLevel").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAAESREMOTE-INTERFACE-CDHMETRICSINFO PUBLISHSERVICELIMITSMETRICS #20230619T005635.174 GMT", "PegaAESRemote-Interface-CDHMetricsInfo PublishServiceLimitsMetrics", "PegaAESRemote", "08-23-01", false, true, "", "ACTIVITY", "20230619T005635.174 GMT" ,"Rule-Obj-Activity"); }
