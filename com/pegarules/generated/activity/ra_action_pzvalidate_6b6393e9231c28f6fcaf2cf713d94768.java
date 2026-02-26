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
public class ra_action_pzvalidate_6b6393e9231c28f6fcaf2cf713d94768 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzValidate.Data_Admin_Security_Application_AuthServices.Action");
	public ra_action_pzvalidate_6b6393e9231c28f6fcaf2cf713d94768(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT	Pega-IntegrationEngine:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 1_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pyAuthServiceListInfo", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_2 = pzPrimPage.getIfPresent("pyAuthServiceListInfo");
pageRef = pz_2;
} 
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_0_circum0");
}
PRStackFrame pz_StackFrame1_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT Step: 1_0 Circum: 0" );
try {
pz_Status = step1_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
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
	"Rule-Obj-Activity:PZVALIDATE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZVALIDATE","Rule-Obj-Activity","DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES",false,"","Pega-IntegrationEngine","08-06-01","RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT","!PZVALIDATE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1757263402)
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
//	RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT:20201005T163509.846 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "5dee347da5a8b948ae28e62f776b6648";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Security-Application-AuthServices";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1.0 <code>Java</code> [on page .pyAuthServiceListInfo] <br>
 */
public boolean step1_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java

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

// Code to call nested step 1_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_1_circum0");
}
PRStackFrame pz_StackFrame1_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT Step: 1_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_2_circum0");
}
PRStackFrame pz_StackFrame1_2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT Step: 1_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_3_circum0");
}
PRStackFrame pz_StackFrame1_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT Step: 1_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_4_circum0");
}
PRStackFrame pz_StackFrame1_4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT Step: 1_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_5_circum0");
}
PRStackFrame pz_StackFrame1_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT Step: 1_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 1_6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("EndIteration"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_6_circum0");
}
PRStackFrame pz_StackFrame1_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT Step: 1_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step1_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame1_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "1.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_0_circum0 definition

/**
 * Validate For Empty Authentication Service.
 * <p>
 * Step 1.1 <code>Property-Set-Messages</code><br>
 */
public boolean step1_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxIsBlank(.pyName)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@pxIsBlank(.pyName)", "FUAInstance-NullMyStepPage");
}
boolean pz_4 = (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, null, new Object[] { scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxIsBlank(.pyName)",pz_4);
if (!pz_4) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxIsBlank(.pyName) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzAuthenticationServiceShouldNotbeBlank
// Expression: .pyName
ClipboardProperty pz_6 = propertyQuery_5.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzAuthenticationServiceShouldNotbeBlank";
pz_6.addMessageWithKey("(Data-Admin-AuthService)" + messageToAdd, keyToPass);
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
boolean pz__1 = pega.invokeWhen("Always", "Data-Admin-Security-Application-AuthServices", "Data-Admin-AuthService");
if (pz__1) {
// branch to block EndIteration
nextBlock = "EndIteration";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "1.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_1_circum0 definition

/**
 * Check for Duplicate Authentication Service Added.
 * <p>
 * Step 1.2 <code>Property-Set-Messages</code><br>
 */
public boolean step1_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@countInPageList(.pyName,\"pyName\",Primary.pyAuthServiceListInfo)&gt;1");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@countInPageList(.pyName,\"pyName\",Primary.pyAuthServiceListInfo)>1", "FUAInstance-NullMyStepPage");
}
boolean pz_7 = ((pega.<Integer>resolveMethodCall("countInPageList--(String,String,ClipboardProperty)", "countInPageList", null, null, new Object[] { scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "pyName", tools.getPrimaryPage().getProperty("pyAuthServiceListInfo") })).intValue() > 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@countInPageList(.pyName,\"pyName\",Primary.pyAuthServiceListInfo)&gt;1",pz_7);
if (!pz_7) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@countInPageList(.pyName,\"pyName\",Primary.pyAuthServiceListInfo)&gt;1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: "pzDuplicateAuthenticationServiceSelected\t"+.pyName
// Expression: .pyName
ClipboardProperty pz_8 = propertyQuery_5.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = ("pzDuplicateAuthenticationServiceSelected\t" + scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
pz_8.addMessageWithKey("(Data-Admin-AuthService)" + messageToAdd, keyToPass);
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
boolean pz__3 = pega.invokeWhen("Always", "Data-Admin-Security-Application-AuthServices", "Data-Admin-AuthService");
if (pz__3) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzValidate - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "1.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_2_circum0 definition

/**
 * Validate for invalid auth service name entered in grid.
 * <p>
 * Step 1.3 <code>Page-Set-Messages</code><br>
 */
public boolean step1_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyName==\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyName==\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_9 = (scalarValueQuery_3.resolveToString(tools, pega.findDataPage("D_pzGetAuthenticationServiceDetails", false, "pyName", scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyName==\"\"",pz_9);
if (!pz_9) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyName==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Set-Messages
ClipboardPage targetPage = null;
targetPage = tools.getPrimaryPage();
if (targetPage == null) {
throw new InvalidReferenceException("Primary", "this step page does not exist and cannot be modified");
}
// Expression: "pzInvalidAuthenticationService\t"+.pyName
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = ("pzInvalidAuthenticationService\t" + scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
targetPage.addMessageWithKey("(Data-Admin-AuthService)" + messageToAdd, keyToPass);
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
boolean pz__5 = pega.invokeWhen("Always", "Data-Admin-Security-Application-AuthServices", "Data-Admin-AuthService");
if (pz__5) {
// branch to block EndIteration
nextBlock = "EndIteration";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "1.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_3_circum0 definition

/**
 * Set local variable as true for default auth service disabled condition.
 * <p>
 * Step 1.4 <code>Property-Set</code><br>
 */
public boolean step1_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyLoginConfiguration==\"Default\"");
try {
boolean pz_11 = (scalarValueQuery_10.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("Default"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyLoginConfiguration==\"Default\"",pz_11);
if (!pz_11) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyLoginConfiguration==\"Default\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyName==Primary.pyDefaultAuthServiceName");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyName==Primary.pyDefaultAuthServiceName", "FUAInstance-NullMyStepPage");
}
boolean pz_13 = (scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_12.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyName==Primary.pyDefaultAuthServiceName",pz_13);
if (!pz_13) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyName==Primary.pyDefaultAuthServiceName " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!.pyEnableAuthService");
try {
boolean pz_15 = ((!scalarValueQuery_14.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!.pyEnableAuthService",pz_15);
if (!pz_15) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!.pyEnableAuthService " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    defaultAuthServiceDisabled = true;
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
pz_CurrentStepNum = "1.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_4_circum0 definition

/**
 * Validate for disabled auth service manually entered in grid.
 * <p>
 * Step 1.5 <code>Page-Set-Messages</code><br>
 */
public boolean step1_5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyEnableAuthService == false  &amp;&amp; D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyName != \"\"  &amp;&amp; .pyName != \"\" &amp;&amp; .pyAuthenticationServiceType == \"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyEnableAuthService == false  && D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyName != \"\"  && .pyName != \"\" && .pyAuthenticationServiceType == \"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_17 = ((((scalarValueQuery_14.resolveToBoolean(tools, pega.findDataPage("D_pzGetAuthenticationServiceDetails", false, "pyName", scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TRUEFALSE) == false) && (!(scalarValueQuery_3.resolveToString(tools, pega.findDataPage("D_pzGetAuthenticationServiceDetails", false, "pyName", scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TEXT).equals("")))) && (!(scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")))) && (scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyEnableAuthService == false  &amp;&amp; D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyName != \"\"  &amp;&amp; .pyName != \"\" &amp;&amp; .pyAuthenticationServiceType == \"\"",pz_17);
if (!pz_17) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyEnableAuthService == false  &amp;&amp; D_pzGetAuthenticationServiceDetails[pyName:.pyName].pyName != \"\"  &amp;&amp; .pyName != \"\" &amp;&amp; .pyAuthenticationServiceType == \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Set-Messages
ClipboardPage targetPage = null;
targetPage = tools.getPrimaryPage();
if (targetPage == null) {
throw new InvalidReferenceException("Primary", "this step page does not exist and cannot be modified");
}
// Expression: "pzDisabledAuthService\t"+.pyName
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = ("pzDisabledAuthService\t" + scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
targetPage.addMessageWithKey("(Data-Admin-AuthService)" + messageToAdd, keyToPass);
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
pz_CurrentStepNum = "1.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_5_circum0 definition

/**
 * Step 1.6 [EndIteration] <code>Java</code><br>
 */
public boolean step1_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java

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
pz_CurrentStepNum = "1.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_6_circum0 definition

/**
 * Set Error messages for default auth service selected as blank.
 * <p>
 * Step 2 <code>Property-Set-Messages</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Primary.pyDefaultAuthServiceName == \"\" &amp;&amp; Primary.pyLoginConfiguration == \"Default\"");
try {
boolean pz_18 = ((scalarValueQuery_12.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("")) && (scalarValueQuery_10.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT).equals("Default")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Primary.pyDefaultAuthServiceName == \"\" &amp;&amp; Primary.pyLoginConfiguration == \"Default\"",pz_18);
if (!pz_18) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Primary.pyDefaultAuthServiceName == \"\" &amp;&amp; Primary.pyLoginConfiguration == \"Default\" " + anyException.getMessage(), anyException);
}
boolean pz__7 = pega.invokeWhen("pzIsLoginConfigurationApplicable", "Data-Admin-Security-Application-AuthServices", "Data-Admin-Security-Application-AuthServices");
if (!pz__7) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzDefaultAuthenticationServiceShouldNotBeBlank
// Expression: Primary.pyDefaultAuthServiceName
ClipboardProperty pz_20 = propertyQuery_19.resolve(tools, tools.getPrimaryPage());
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzDefaultAuthenticationServiceShouldNotBeBlank";
pz_20.addMessageWithKey("(Data-Admin-Security-Application-AuthServices)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

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

public boolean defaultAuthServiceDisabled = false;

public void initializeUserLocalVariables() {
	defaultAuthServiceDisabled = false;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("defaultAuthServiceDisabled", Boolean.toString(defaultAuthServiceDisabled));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pyLoginConfiguration").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pyEnableAuthService").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyDefaultAuthServiceName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyAuthenticationServiceType").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_19 = FUAUtil.createQueryBuilder().scalarProperty("pyDefaultAuthServiceName").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pyName").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-APPLICATION-AUTHSERVICES PZVALIDATE #20201005T163509.846 GMT", "Data-Admin-Security-Application-AuthServices pzValidate", "Pega-IntegrationEngine", "08-06-01", false, true, "", "ACTIVITY", "20201005T163509.846 GMT" ,"Rule-Obj-Activity"); }
