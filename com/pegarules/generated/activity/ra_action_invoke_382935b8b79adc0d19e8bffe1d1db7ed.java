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
public class ra_action_invoke_382935b8b79adc0d19e8bffe1d1db7ed extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.Invoke.Rule_Connect_REST.Action");
	public ra_action_invoke_382935b8b79adc0d19e8bffe1d1db7ed(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT	Pega-IntegrationEngine:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pyParameters", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_4 = pzPrimPage.getIfPresent("pyParameters");
pageRef = pz_4;
} 
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
// we need to check to see if the class of this page is in the list
// of valid pages for this ForEach call.
pz_thisPageClass = thisStepPage.getClassName();
if ( "Embed-MethodParams".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-MethodParams").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_0_circum0");
}
PRStackFrame pz_StackFrame2_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT Step: 2_0 Circum: 0" );
try {
pz_Status = step2_0_circum0_Embed_MethodParams();
} finally {
pega.popStackFrame(pz_StackFrame2_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
else{
pz_forEachSkipClass++;
tools.putParamValue("pyForEachSkipClass", Integer.toString(pz_forEachSkipClass));
}
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 5_circum0");
}
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT Step: 5 Circum: 0" );
try {
pz_Status = step5_circum0();
} finally {
pega.popStackFrame(pz_StackFrame5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 6_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 6_circum0");
}
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 8_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CALL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
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
	"Rule-Obj-Activity:INVOKE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("INVOKE","Rule-Obj-Activity","RULE-CONNECT-REST",false,"","Pega-IntegrationEngine","08-23-01","RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT","!INVOKE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1409448362)
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
//	RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT:20230618T001644.538 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "a3ec93f164ba11429596a131c0c13038";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Connect-REST";
	}
public String getAspect() {
return "Action";
}
/**
 * Validate the primary page.
 * <p>
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
enableLogsForPerformanceDss = "true".equalsIgnoreCase(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-IntegrationEngine","connector/enableLogsForPerformanceormance"));
if(enableLogsForPerformanceDss){
 try{
    org.opensaml.common.impl.SecureRandomIdentifierGenerator sr = new org.opensaml.common.impl.SecureRandomIdentifierGenerator();
    LogContext.push("TID:REST_CONNECTOR_"+ sr.generateIdentifier()+":TID"+ "#");
   	startexecution = System.nanoTime();
  }catch(Exception e){
	oLog.error("Problem in generating Random Number");
  }
}
ClipboardPage primaryPage = tools.getPrimaryPage();
if (primaryPage == null) {
	String val = "Fail:Missing";
	String msg = "Primary page may not be null.";
	oLog.error("Rule-Connect-REST: " + msg);
	tools.putParamValue("pyStatusVal", val);
	tools.putParamValue("pyStatusMsg", msg);
	throw new PRRuntimeException(msg);
}
String pzInsKey = primaryPage.getString("pzInsKey");
if (pzInsKey == null || pzInsKey.length() == 0)
{
	String val = "Fail:Missing";
	String msg = "Primary page does not contain a valid rule instance.";
	oLog.error("Rule-Connect-REST: " + msg);
	tools.putParamValue("pyStatusVal", val);
	tools.putParamValue("pyStatusMsg", msg);
	throw new PRRuntimeException(msg);
}

String dataPageName = tools.getParamValue("pyObjName");

if (dataPageName.length() == 0)
  throw new PRRuntimeException("Required parameter value was not provided: pyObjName");
  dataPage = tools.findPage(dataPageName);
if (dataPage == null)
  throw new PRRuntimeException("Couldn't find required clipboard page: " + dataPageName);

if (oLog.isDebugEnabled())
  oLog.debug("Invoked in " + tools.getParamValue("pyExecutionMode") + " execution mode");
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Step 2.0 <code>Property-Set</code> [on page .pyParameters] <br>
 */
public boolean step2_0_circum0_Embed_MethodParams() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    parameterName = scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
ClipboardProperty nestedPageRef = null;
java.util.Iterator myNestedPageList = null;
ClipboardProperty nextNestedPage = null;
ClipboardPage nestedStepPage = null;
ClipboardPage thisStepPage = null;

// Code to call nested step 2_1_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_6 = pega.getViaPropRef(".pyEmbeddedURL.pyResourcePathParameters", pRef_2, tools.getPrimaryPage(), false, true);
nestedPageRef = pz_6;
if (nestedPageRef != null) {
myNestedPageList = nestedPageRef.iterator();
forEachCounter = 0; // reset counter for nested loop
pz_forEachSkipClass = 0; // reset counter for nested loop
while (myNestedPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextNestedPage = (ClipboardProperty) myNestedPageList.next();
nestedStepPage = nextNestedPage.getPageValue();
// we need to check to see if the class of this page is in the list
// of valid pages for this ForEach call.
pz_thisPageClass = nestedStepPage.getClassName();
if ( "Embed-URL-Parameter-ResourcePath".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Embed-URL-Parameter-ResourcePath").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_1_circum0");
}
PRStackFrame pz_StackFrame2_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT Step: 2_1 Circum: 0" );
try {
pz_Status = step2_1_circum0_Embed_URL_Parameter_ResourcePath();
} finally {
pega.popStackFrame(pz_StackFrame2_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
else{
pz_forEachSkipClass++;
tools.putParamValue("pyForEachSkipClass", Integer.toString(pz_forEachSkipClass));
}
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "2.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_0_circum0_Embed_MethodParams definition

/**
 * Step 2.1 <code>Property-Set</code> [on page Primary.pyEmbeddedURL.pyResourcePathParameters] <br>
 */
public boolean step2_1_circum0_Embed_URL_Parameter_ResourcePath() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyMapFromKey", pRef_7, myStepPage, pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, null, new Object[] { scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), (("{" + parameterName) + "}"), pega.<String>resolveMethodCall("getParam--(String)", "getParam", null, null, new Object[] { parameterName }) }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyParameterName", pRef_9, myStepPage, pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, null, new Object[] { scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), (("{" + parameterName) + "}"), pega.<String>resolveMethodCall("getParam--(String)", "getParam", null, null, new Object[] { parameterName }) }), "sTN", false, true);
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
pz_CurrentStepNum = "2.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_1_circum0_Embed_URL_Parameter_ResourcePath definition

/**
 * Dequeue connection request.
 * <p>
 * Step 3 <code>Java</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(Param.pyExecutionMode, \"dequeue\")");
try {
boolean pz_11 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { tools.getParamValue("pyExecutionMode"), "dequeue" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(Param.pyExecutionMode, \"dequeue\")",pz_11);
if (!pz_11) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(Param.pyExecutionMode, \"dequeue\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
if (oLog.isDebugEnabled())
  oLog.debug("Executing 'dequeue' step");

ParameterPage params = tools.getParameterPage();

activityName = params.getString("pyProcessingActivity");

// deserialize headers, query, message and resource params
String strHeaders = params.getString("pySerializedHeaders");
String strQuery = params.getString("pySerializedQueryParams");
String strMessage = params.getString("pySerializedMessageData");
String strRequestDataList = params.getString("pySerializedRequestDataList");
String strResourceParams = params.getString("pySerializedResourceParameters");

//===================================================================================================================
// URL parsing changes

String strUrlQuery = params.getString("pySerializedUrlQueryParams");
String strResourcePathParams = params.getString("pySerializedResourcePathParams");

//===================================================================================================================

if (oLog.isDebugEnabled()) {
  oLog.debug("Serialized headers as a string: " + strHeaders);
  oLog.debug("Serialized Query parameters as a string: " + strQuery);
  oLog.debug("Serialized Message data as a string: " + strMessage);
  oLog.debug("Serialized request data list as a string: " + strRequestDataList);
  oLog.debug("Serialized Resource parameters as a string: " + strResourceParams);
  oLog.debug("Serialized Url Query parameters as a string: " + strUrlQuery);
  oLog.debug("Serialized Resource Path parameters as a string: " + strResourcePathParams);
}
	    

java.util.HashMap reqHeaderVals = (java.util.HashMap) pega_integrationengine_servicesutilities.pxDeserializeObject(strHeaders, java.util.HashMap.class, false, -1, -1, -1, -1, tools);
if (reqHeaderVals != null && oLog.isDebugEnabled()) {
  oLog.debug("Deserialized headers: " + reqHeaderVals.toString());
}

params.putObject("pyRequestHeaders", reqHeaderVals);

java.util.ArrayList queryParamVals = (java.util.ArrayList) pega_integrationengine_servicesutilities.pxDeserializeObject(strQuery, java.util.ArrayList.class, false, -1, -1, -1, -1, tools);
	  
if (queryParamVals != null && oLog.isDebugEnabled()) {
  oLog.debug("Deserialized Query parameters: " + queryParamVals.toString());
}

params.putObject("pyRequestParameters", queryParamVals);

java.util.HashMap messageDataVals = (java.util.HashMap) pega_integrationengine_servicesutilities.pxDeserializeObject(strMessage, java.util.HashMap.class, false, -1, -1, -1, -1, tools);  
if (messageDataVals != null && oLog.isDebugEnabled()) {
  oLog.debug("Deserialized Message data: " + messageDataVals.toString());
}

params.putObject("pyRequestData", messageDataVals);

java.util.ArrayList messageDataMap = (java.util.ArrayList) pega_integrationengine_servicesutilities.pxDeserializeObject(strRequestDataList, java.util.ArrayList.class, false, -1, -1, -1, -1, tools);  
if (messageDataMap != null && oLog.isDebugEnabled()) {
  oLog.debug("Deserialized request data list: " + messageDataMap.toString());
}

params.putObject("pyRequestDataList", messageDataMap);

java.util.HashMap resourceParamVals = (java.util.HashMap) pega_integrationengine_servicesutilities.pxDeserializeObject(strResourceParams, java.util.HashMap.class, false, -1, -1, -1, -1, tools);  
if (resourceParamVals != null && oLog.isDebugEnabled()) {
  oLog.debug("Deserialized Resource Parameters: " + resourceParamVals.toString());
}

params.putObject("pyResourceParameters", resourceParamVals);

  //===================================================================================================================
// URL parsing changes
 
java.util.ArrayList urlQueryParamVals = (java.util.ArrayList) pega_integrationengine_servicesutilities.pxDeserializeObject(strUrlQuery, java.util.ArrayList.class, false, -1, -1, -1, -1, tools);    
if (urlQueryParamVals != null && oLog.isDebugEnabled()) {
  oLog.debug("Deserialized Query parameters: " + urlQueryParamVals.toString());
}

params.putObject("pyQueryStringParameters", urlQueryParamVals);

java.util.ArrayList resourcePathParamVals = (java.util.ArrayList) pega_integrationengine_servicesutilities.pxDeserializeObject(strResourcePathParams, java.util.ArrayList.class, false, -1, -1, -1, -1, tools);    
if (resourcePathParamVals != null && oLog.isDebugEnabled()) {
  oLog.debug("Deserialized Resource Path Parameters: " + resourcePathParamVals.toString());
}

params.putObject("pyResourcePathParameters", resourcePathParamVals);
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
boolean pz__1 = pega.invokeWhen("StepStatusGood", "Rule-Connect-REST", "Rule-Connect-REST");
if (pz__1) {
// branch to block CALL
nextBlock = "CALL";
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "Invoke - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step3_circum0 definition

/**
 * Get simulation activity name.
 * <p>
 * Step 4 <code>call getSimulationActivity</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call getSimulationActivity");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call getSimulationActivity", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call getSimulationActivity
if (myStepPage == null) {
}
// Calling Activity : getSimulationActivity
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "getSimulationActivity", "Rule-Connect-REST", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call getSimulationActivity",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Identify processing activity.
 * <p>
 * Step 5 <code>Java</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
isSimulation = false;
activityName = "";

String simActivity = tools.getParamValue("SimulationActivity");
String executionMode = tools.getParamValue("pyExecutionMode");

if (simActivity.length() > 0)
{
	isSimulation = true;
	activityName = simActivity;
	if (oLog.isInfoEnabled())
	  oLog.info("Using activity " + activityName + " to simulate connector execution");
}
else
{
	activityName = "pyInvokeRESTConnector";
	if (!executionMode.equals("queue") && oLog.isInfoEnabled())
	oLog.info("Starting remote service invocation...");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.isSimulation==true");
try {
boolean pz_12 = (isSimulation == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.isSimulation==true",pz_12);
if (pz_12) {
// branch to block CALL
nextBlock = "CALL";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.isSimulation==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Map outbound data.
 * <p>
 * Step 6 <code>Java</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ParameterPage params = tools.getParameterPage();
String methodName = params.getString("MethodName");

java.util.HashMap reqHeaderVals = new java.util.HashMap();
java.util.List reqParamVals = new java.util.ArrayList();
java.util.List queryStringParamVals = new java.util.ArrayList();
java.util.HashMap reqMessageData = new java.util.HashMap();
java.util.HashMap resourceParamVals = new java.util.HashMap();
java.util.List resourcePathParamVals = new java.util.ArrayList();
java.util.List requestDataList = new java.util.ArrayList();

ServiceUtils utils = tools.getServiceUtils();

ClipboardProperty reqHeaders = myStepPage.getProperty("py" + methodName + "RequestHeaders");
ClipboardProperty reqParams = myStepPage.getProperty("py" + methodName+ "RequestParameters");
ClipboardProperty reqData = myStepPage.getProperty("py" + methodName + "RequestDataList");
ClipboardProperty resourceParams = myStepPage.getProperty("pyResourceParameters");

String postDataMappingType = myStepPage.getString("pyPOSTDataMappingType");


//===================================================================================================================
// URL parsing changes

ClipboardPage embeddedUrlPage = myStepPage.getPage("pyEmbeddedURL");
ClipboardProperty queryStringParams = null;
ClipboardProperty resourcePathParams = null;
if(embeddedUrlPage != null){
queryStringParams = embeddedUrlPage.getProperty("pyQueryStringParameters");
 if(queryStringParams!=null && queryStringParams.size()>0){
java.util.Iterator queryParamIt = queryStringParams.iterator();
while(queryParamIt.hasNext()){
  ClipboardProperty cp = (ClipboardProperty) queryParamIt.next();
  if(cp.getStringValue("pyMapFrom").equalsIgnoreCase("param")){
    cp.getPageValue().putString("pyMapFrom","Clipboard");
    cp.getPageValue().putString("pyMapFromKey","Param."+cp.getStringValue("pyMapFromKey"));
  }
  }
}

 resourcePathParams = embeddedUrlPage.getProperty("pyResourcePathParameters");
if(resourcePathParams!=null && resourcePathParams.size()>0){
java.util.Iterator resourceParamIt = resourcePathParams.iterator();
while(resourceParamIt.hasNext()){
  ClipboardProperty cp = (ClipboardProperty) resourceParamIt.next();
  if(cp.getStringValue("pyMapFrom").equalsIgnoreCase("param")){
    cp.getPageValue().putString("pyMapFrom","Clipboard");
    cp.getPageValue().putString("pyParameterName","Param."+cp.getStringValue("pyMapFromKey"));
    cp.getPageValue().putString("pyMapFromKey","Param."+cp.getStringValue("pyMapFromKey"));
    
  }
}
}
}
//===================================================================================================================

ClipboardProperty statusVal = null;
ClipboardProperty statusMsg = null;
String statusValKey = myStepPage.getString("pyStatusValProperty");
String handlerFlow =  myStepPage.getString("pyHandlerFlow");

if (statusValKey.length() > 0)
{
  statusVal = ((ClipboardPage)dataPage).getProperty(statusValKey);
  statusVal.setValue("Good");
}
String statusMsgKey = myStepPage.getString("pyStatusMsgProperty");
if (statusMsgKey.length() > 0)
{
  statusMsg = ((ClipboardPage)dataPage).getProperty(statusMsgKey);
  statusMsg.setValue("");
}
long startTimestamp =0;
// Start PAL data timer
utils.startConnectOutMapReqTimeStat();
  if(enableLogsForPerformanceDss){
 	startTimestamp = System.nanoTime();
 	}
String stepMsg = "";

try
{
  
  //==================================================================
  // URL parsing changes

  if(queryStringParams != null){
  stepMsg = "mapping request param data";
  if (oLog.isDebugEnabled())
		oLog.debug(stepMsg);
        utils.mapOutboundData(queryStringParams, queryStringParamVals, params, (ClipboardPage) dataPage);
  }
  
 
  if(resourcePathParams!=null){
    stepMsg = "mapping request param data";
  if (oLog.isDebugEnabled())
		oLog.debug(stepMsg);
  utils.mapOutboundData(resourcePathParams, resourcePathParamVals, params, (ClipboardPage) dataPage);
  }
  //==================================================================
    
    
  // Map outbound header values
  stepMsg = "maping request headers";

  
  if (oLog.isDebugEnabled())
		oLog.debug(stepMsg);
  utils.mapOutboundData(reqHeaders, (Map) reqHeaderVals, params, (ClipboardPage) dataPage);

  // Map outbound parameter values
  stepMsg = "mapping request query parameters";
  if (oLog.isDebugEnabled())
		oLog.debug(stepMsg);
  utils.mapOutboundData(reqParams, reqParamVals, params, (ClipboardPage) dataPage);

  // Map outbound parameter values
  stepMsg = "mapping request message data";
  if (oLog.isDebugEnabled())
		oLog.debug(stepMsg);
  if("URL_ENCODED".equals(postDataMappingType)) {
    utils.mapOutboundData(reqData, requestDataList, params, (ClipboardPage) dataPage);
  } else {
    utils.mapOutboundData(reqData, (Map) reqMessageData, params, (ClipboardPage) dataPage);
  }
  
  // Construct queryStringParamVals for OData sourced Connector
  String isODataConnector = embeddedUrlPage.getProperty("pyIsODataQueryable").toString();
  if(isODataConnector.equals("true")){
    queryStringParamVals = new java.util.ArrayList();
    String oDataQueryString = params.getString("ODataQueryString");
    String[] queryParams = oDataQueryString.split("&");
    for(String param: queryParams){
      queryStringParamVals.add(param);
    }
  }
  
  // Map outbound resource parameter values
  stepMsg = "mapping resource parameters";
  if (oLog.isDebugEnabled())
		oLog.debug(stepMsg);
  utils.mapOutboundData(resourceParams, (Map) resourceParamVals, params, (ClipboardPage) dataPage );		

  if (oLog.isDebugEnabled())
    oLog.debug("Headers: " + reqHeaderVals.toString());

  if (oLog.isDebugEnabled())
    oLog.debug("Params: " + reqParamVals.toString());

  params.putObject("pyRequestHeaders", reqHeaderVals);
  params.putObject("pyRequestParameters", reqParamVals);
  params.putObject("pyRequestData", reqMessageData);
  params.putObject("pyRequestDataList", requestDataList);
  params.putObject("pyResourceParameters", resourceParamVals);
  
   //==================================================================
  // URL parsing changes
  params.putObject("pyQueryStringParameters",queryStringParamVals);
  params.putObject("pyResourcePathParameters",resourcePathParamVals);
   //==================================================================
}
catch (OutboundMappingException e){
		String val = "Fail:InternalReason";
		String msg = "Failed while "  + stepMsg + ", " + e.toString();
		oLog.error(msg, e);
		params.putString("pyStatusVal", val);
		params.putString("pyStatusMsg", msg);
		if (statusVal != null)
			statusVal.setValue(val);
		if (statusMsg != null)
			statusMsg.setValue(msg);
		e.setHandler(handlerFlow);
		throw e;
}
finally
{
  // Stop PAL data timer
  utils.stopConnectOutMapReqTimeStat();
  if(enableLogsForPerformanceDss){
    oLog.infoForced("STEP:Outbound data mapping:STEP"+ "#" + "DURATION:" + (System.nanoTime()- startTimestamp)+":DURATION");

  }
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(Param.pyExecutionMode, \"queue\")");
try {
boolean pz_13 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { tools.getParamValue("pyExecutionMode"), "queue" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(Param.pyExecutionMode, \"queue\")",pz_13);
if (!pz_13) {
// branch to block CALL
nextBlock = "CALL";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(Param.pyExecutionMode, \"queue\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Queue Connect Request.
 * <p>
 * Step 7 <code>Java</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
if (oLog.isDebugEnabled())
  oLog.debug("Queuing Connector Request");
ParameterPage params = tools.getParameterPage();

java.util.HashMap reqHeaderVals = (java.util.HashMap) params.getObject("pyRequestHeaders");
java.util.List reqQueryParamVals = (java.util.List) params.getObject("pyRequestParameters");
java.util.List requestDataList = (java.util.List) params.getObject("pyRequestDataList");
java.util.HashMap reqMessageData = (java.util.HashMap) params.getObject("pyRequestData");
java.util.HashMap resourceParamVals = (java.util.HashMap) params.getObject("pyResourceParameters");

//===================================================================================================================
// URL parsing changes


java.util.List reqUrlQueryParamVals = (java.util.List) params.getObject("pyQueryStringParameters");
java.util.List resourcePathParamVals = (java.util.List) params.getObject("pyResourcePathParameters");


try{
  if (oLog.isDebugEnabled())
     oLog.debug("Serializing url Query String Parameters: " + reqUrlQueryParamVals.toString());
  java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
  java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
  oos.writeObject(reqUrlQueryParamVals);
  oos.flush();
  byte[] bar = bos.toByteArray();
  bos.close(); 
  String strUrlQuery = com.pega.pegarules.pub.util.Base64Util.encodeToString(bar);

  if (oLog.isDebugEnabled())
    oLog.debug("Serialized url querystring parameters to string: " + strUrlQuery);

  params.putString("pySerializedUrlQueryParams", strUrlQuery);
}
catch(java.io.IOException ex){
  oLog.error("Failed to serialize url querystring parameters while queing connection request:", ex);
  throw new ConnectorException ("Failed to serialize url querystring parameters while queing connection request:", ex);
}


try{
  if (oLog.isDebugEnabled())
     oLog.debug("Serializing Resource Path Parameters: " + resourcePathParamVals.toString());
  java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
  java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
  oos.writeObject(resourcePathParamVals);
  oos.flush();
  byte[] bar = bos.toByteArray();
  bos.close(); 
  String strResourcePathParams = com.pega.pegarules.pub.util.Base64Util.encodeToString(bar);

  if (oLog.isDebugEnabled())
    oLog.debug("Serialized Resource Path Parameters to string: " + strResourcePathParams);

  params.putString("pySerializedResourcePathParams", strResourcePathParams);
}
catch(java.io.IOException ex){
  oLog.error("Failed to serialize resource path parameters while queing connection request:", ex);
  throw new ConnectorException ("Failed to serialize resource path parameters while queing connection request:", ex);
}
//===================================================================================================================


try{
  if (oLog.isDebugEnabled())
     oLog.debug("Serializing Headers: " + reqHeaderVals.toString());
  java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
  java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
  oos.writeObject(reqHeaderVals);
  oos.flush();
  byte[] bar = bos.toByteArray();
  bos.close(); 
  String strHeaders = com.pega.pegarules.pub.util.Base64Util.encodeToString(bar);

  if (oLog.isDebugEnabled())
    oLog.debug("Serialized headers to string: " + strHeaders);

  params.putString("pySerializedHeaders", strHeaders);
}
catch(java.io.IOException ex){
  oLog.error("Failed to serialize request headers while queing connection request:", ex);
  throw new ConnectorException ("Failed to serialize request headers while queing connection request:", ex);
}

try{
  if (oLog.isDebugEnabled())
     oLog.debug("Serializing Query Parameters: " + reqQueryParamVals.toString());
  java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
  java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
  oos.writeObject(reqQueryParamVals);
  oos.flush();
  byte[] bar = bos.toByteArray();
  bos.close(); 
  String strQuery = com.pega.pegarules.pub.util.Base64Util.encodeToString(bar);

  if (oLog.isDebugEnabled())
    oLog.debug("Serialized query parameters to string: " + strQuery);

  params.putString("pySerializedQueryParams", strQuery);
}
catch(java.io.IOException ex){
  oLog.error("Failed to serialize query parameters while queing connection request:", ex);
  throw new ConnectorException ("Failed to serialize query parameters while queing connection request:", ex);
}

try{
  if (oLog.isDebugEnabled())
     oLog.debug("Serializing Message Data: " + reqMessageData.toString());
  java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
  java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
  oos.writeObject(reqMessageData);
  oos.flush();
  byte[] bar = bos.toByteArray();
  bos.close(); 
  String strMessage = com.pega.pegarules.pub.util.Base64Util.encodeToString(bar);

  if (oLog.isDebugEnabled())
    oLog.debug("Serialized Message Data to string: " + strMessage);

  params.putString("pySerializedMessageData", strMessage);
}
catch(java.io.IOException ex){
  oLog.error("Failed to serialize message data while queing connection request:", ex);
  throw new ConnectorException ("Failed to serialize message data while queing connection request:", ex);
}

try{
  if (oLog.isDebugEnabled())
     oLog.debug("Serializing request Data list: " + requestDataList.toString());
  java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
  java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
  oos.writeObject(requestDataList);
  oos.flush();
  byte[] bar = bos.toByteArray();
  bos.close(); 
  String strMessage = com.pega.pegarules.pub.util.Base64Util.encodeToString(bar);

  if (oLog.isDebugEnabled())
    oLog.debug("Serialized request data list to string: " + strMessage);

  params.putString("pySerializedRequestDataList", strMessage);
}
catch(java.io.IOException ex){
  oLog.error("Failed to serialize request data list while queing connection request:", ex);
  throw new ConnectorException ("Failed to serialize request data list while queing connection request:", ex);
}

try{
  if (oLog.isDebugEnabled())
     oLog.debug("Serializing Resource Parameters: " + resourceParamVals.toString());
  java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
  java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
  oos.writeObject(resourceParamVals);
  oos.flush();
  byte[] bar = bos.toByteArray();
  bos.close(); 
  String strMessage = com.pega.pegarules.pub.util.Base64Util.encodeToString(bar);

  if (oLog.isDebugEnabled())
    oLog.debug("Serialized Resource Parameters to string: " + strMessage);

  params.putString("pySerializedResourceParameters", strMessage);
}
catch(java.io.IOException ex){
  oLog.error("Failed to serialize resource parameters while queing connection request:", ex);
  throw new ConnectorException ("Failed to serialize resource parameters while queing connection request:", ex);
}

 java.util.ArrayList otherPages = new java.util.ArrayList();
 ((ClipboardPage)dataPage).putString("pyPageName", tools.getParamValue("pyObjName")); 
 otherPages.add(dataPage);

  String ruleClass = myStepPage.getClassName();  

 params.putString("pyExecutionMode", "dequeue");
 params.putString("pyProcessingActivity", activityName);
 if (isSimulation)
   params.putString("pyIsQueuedSimulation","true");
 else
   params.putString("pyIsQueuedSimulation","false");

try{ 
 tools.getThread().getRequestProcessor().queueConnectRequest(
   ruleClass, "Invoke", myStepPage, params, (java.util.List) otherPages);
}
catch (Exception ex){
  oLog.error("Failed to queue Connector Request", ex);
  throw new PRRuntimeException("Failed to queue Connect Request", ex); 
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
boolean pz__3 = pega.invokeWhen("StepStatusGood", "Rule-Connect-REST", "Rule-Connect-REST");
if (pz__3) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "Invoke - Transition", null);
pz_CheckMessage = false;
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "Invoke - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step7_circum0 definition

/**
 * Call processing activity.
 * <p>
 * Step 8 [CALL] <code>Java</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ParameterPage params = tools.getParameterPage();
params.putString("pyStatusVal", "Good");
params.putString("pyStatusMsg", "");

String dataPageName = tools.getParamValue("pyObjName");

ClipboardProperty statusValRef = null;
String statusValKey = myStepPage.getString("pyStatusValProperty");
if (statusValKey.length() > 0)
{
  statusValRef = ((ClipboardPage)dataPage).getProperty(statusValKey);
  statusValRef.setValue("Good");
}

ClipboardProperty statusMsgRef = null;
String statusMsgKey = myStepPage.getString("pyStatusMsgProperty");
if (statusMsgKey.length() > 0)
{
  statusMsgRef = ((ClipboardPage)dataPage).getProperty(statusMsgKey);
  statusMsgRef.setValue("");
}

ClipboardProperty exceptionRef = null;
String exceptionKey = myStepPage.getString("pyInvocationExceptionProperty");
if (exceptionKey.length() > 0)
{
  exceptionRef = ((ClipboardPage)dataPage).getProperty(exceptionKey);
  exceptionRef.clearValue();
}

String ruleClass = myStepPage.getClassName();
String appliesTo = myStepPage.getString("pyClassName");
String serviceName = myStepPage.getString("pyServiceName");
String handlerFlow = myStepPage.getString("pyHandlerFlow");

LogContext.push(ruleClass + "." + appliesTo + "." + serviceName);


try
{
  StringMap keys = new HashStringMap();
  keys.putString("pxObjClass", "Rule-Obj-Activity");

  if (isSimulation || (params.isDefined("pyIsQueuedSimulation") && params.getString("pyIsQueuedSimulation").equals("true"))){
    keys.putString("pyClassName", appliesTo);
	keys.putString("pyActivityName", activityName);
	tools.doActivity(keys, (ClipboardPage)dataPage, params);
  }
  else{
    keys.putString("pyClassName", ruleClass);
	keys.putString("pyActivityName", activityName);
	tools.doActivity(keys, myStepPage, params);
  }
  
}
catch (Exception e)
{
  String val = "Fail:InternalReason";
  String msg = e.toString();
  oLog.error(msg);
  params.putString("pyStatusVal", val);
  params.putString("pyStatusMsg", msg);

  if (statusValRef != null)
    statusValRef.setValue(val);
  if (statusMsgRef != null)
    statusMsgRef.setValue(msg);

  if (exceptionRef != null)
  {
    if (e instanceof ResourceUnavailableException ||
        e instanceof RemoteApplicationException)
    {
      Throwable cause = e.getCause();
      if (cause != null)
        exceptionRef.setValue(cause);
    }
  }

  ConnectorException ce = null;
  if (e instanceof ConnectorException)
    ce = (ConnectorException)e;
  else
    ce = new ConnectorException("Caught unhandled exception", e);
  ce.setHandler(handlerFlow);
  throw ce;
}
finally
{
  if (isSimulation)
    pega_intsvcs_servicesutilities.recordCompensatingAction(myStepPage, (ClipboardPage)dataPage);
  else if (oLog.isInfoEnabled())
    oLog.info("Finished remote service invocation");
    
    LogContext.pop();
  if(enableLogsForPerformanceDss){
    oLog.infoForced("STEP:REST connector execution time:STEP"+ "#" + "DURATION:" + (long)(System.nanoTime()- startexecution)+":DURATION");
     LogContext.pop();
  }
  
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
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

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

public String activityName = "";
public Object dataPage = null;
public String parameterName = "";
public boolean isSimulation = false;
public boolean enableLogsForPerformanceDss = false;
public double startexecution = 0.0;

public void initializeUserLocalVariables() {
	activityName = "";
	dataPage = null;
	parameterName = "";
	isSimulation = false;
	enableLogsForPerformanceDss = false;
	startexecution = 0.0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("activityName", (activityName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : activityName.toString());
	smRetVal.putString("dataPage", (dataPage == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : dataPage.toString());
	smRetVal.putString("parameterName", (parameterName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : parameterName.toString());
	smRetVal.putString("isSimulation", Boolean.toString(isSimulation));
	smRetVal.putString("enableLogsForPerformanceDss", Boolean.toString(enableLogsForPerformanceDss));
	smRetVal.putString("startexecution", Double.toString(startexecution));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_9 = new String[] { "", "", "pyParameterName", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyEmbeddedURL", "", "pyResourcePathParameters", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyMapFromKey", "" };
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyParameterName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyMapFromKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyParametersParamName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-CONNECT-REST INVOKE #20230618T001644.538 GMT", "Rule-Connect-REST Invoke", "Pega-IntegrationEngine", "08-23-01", false, false, "", "ACTIVITY", "20230618T001644.538 GMT" ,"Rule-Obj-Activity"); }
