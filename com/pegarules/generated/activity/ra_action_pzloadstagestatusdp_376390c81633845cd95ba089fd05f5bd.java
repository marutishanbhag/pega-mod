package com.pegarules.generated.activity;
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
public class ra_action_pzloadstagestatusdp_376390c81633845cd95ba089fd05f5bd extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzLoadStageStatusDP.Code_Pega_List.Action");
	public ra_action_pzloadstagestatusdp_376390c81633845cd95ba089fd05f5bd(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT	Pega-ProcessEngine:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Temp"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
thisStepPage = tools.findPage(tools.getParamValue("workPage"), true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 4 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_9 = "TempPage";
thisStepPage = tools.findPage(pz_9, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_9, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 5 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_15 = "TempPage";
thisStepPage = tools.findPage(pz_15, true);
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_17 = pega.findPageWithException("TempPage", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_17;
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
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 8_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_38 = pega.findPageWithException("AlternateStages", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_38;
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
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 10_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_circum0");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 11 Circum: 0" );
try {
pz_Status = step11_circum0();
} finally {
pega.popStackFrame(pz_StackFrame11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 12_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 12_circum0");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
thisStepPage = tools.findPage(tools.getParamValue("workPage"), true);
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CLN"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
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
	"Rule-Obj-Activity:PZLOADSTAGESTATUSDP"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOADSTAGESTATUSDP","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-ProcessEngine","08-06-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT","!PZLOADSTAGESTATUSDP",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-367955301)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT:20200826T052410.155 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e016d11ee444d8d426f8f4c65bebc5eb";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Action";
}
/**
 * Go to Temp if param.workPage is not empty and page exists.
 * <p>
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_workPage = tools.findPage(tools.getParamValue("workPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.workPage != \"\"");
try {
boolean pz_3 = (!(tools.getParamValue("workPage").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.workPage != \"\"",pz_3);
if (!pz_3) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.workPage != \"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageExists(param.workPage)");
try {
boolean pz_4 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { tools.getParamValue("workPage") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageExists(param.workPage)",pz_4);
if (pz_4) {
// branch to block Temp
nextBlock = "Temp";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageExists(param.workPage) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * If param.InsHandle is not empty find it on the clipboard or open it.
 * <p>
 * Step 2 <code>java</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_workPage = tools.findPage(tools.getParamValue("workPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.InsHandle==\"\"");
try {
boolean pz_5 = (tools.getParamValue("InsHandle").equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.InsHandle==\"\"",pz_5);
if (pz_5) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.InsHandle==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
ClipboardPage workPage = tools.findPageByHandle(tools.getParamValue("InsHandle"));
if (workPage == null) {
  Database db = tools.getDatabase();
  try {
    workPage = db.open(tools.getParamValue("InsHandle"), false);
    if (workPage != null) {
      ClipboardPage tempWorkPage = tools.createPage(workPage.getClassName(), "pyTempCaseStagesWorkPage");
      tempWorkPage.putAll(workPage);
      tools.putParamValue("workPage", "pyTempCaseStagesWorkPage");
    }
  } catch (DatabaseException dbe) {
    oLog.error(dbe);
  }
} else {
  tools.putParamValue("workPage", workPage.getReference());
  
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Set Param to pyWorkPage if not set.
 * <p>
 * Step 3 <code>Property-Set</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.workPage, \"\")");
try {
boolean pz_6 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { tools.getParamValue("workPage"), "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.workPage, \"\")",pz_6);
if (!pz_6) {
// branch to block Temp
nextBlock = "Temp";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(param.workPage, \"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("workPage", PropertyInfo.TYPE_INCLUDED_PAGE, "pyWorkPage");
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
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Set the Primary stages status.
 * <p>
 * Step 4 [Temp] <code>Java</code> [on page workPage] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_workPage = tools.findPage(tools.getParamValue("workPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.workPage, \"\")");
try {
boolean pz_7 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { tools.getParamValue("workPage"), "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.workPage, \"\")",pz_7);
if (pz_7) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzLoadStageStatusDP - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(param.workPage, \"\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageExists(param.workPage)");
try {
boolean pz_8 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { tools.getParamValue("workPage") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageExists(param.workPage)",pz_8);
if (!pz_8) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzLoadStageStatusDP - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageExists(param.workPage) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
//Calling purpose to get stages list of the case
ClipboardPage workPage = tools.findPage(tools.getParamValue("workPage"));
String processPageName = "pySupportProcessList";
ParameterPage pp = new ParameterPage();
pp.putString("pyPageName","StagesList");
int count = 0;

com.pegarules.generated.pega_rules_utilities.pxCallCaseType(workPage, "STAGE_GETPRIMARY", pp);

ClipboardPage stagesList=tools.findPage("StagesList");
boolean isExisting=false;

ClipboardProperty pxStages=myStepPage.getProperty("pxStageHistory");

if(stagesList!=null){

	java.util.Iterator stagesIterator = stagesList.getProperty("pxResults").iterator();
   
	currentStageID=myStepPage.getString("pxCurrentStage"); // This will now contain D 

         //Iterating over the complete stage list of case
	while(stagesIterator.hasNext()) {
		
		ClipboardPage stage = ((ClipboardProperty) stagesIterator.next()).getPageValue();
		String stageName=stage.getString("pyStageID");
      
      	// Populate the process history
      	pega_processengine_flowutilities.pzLoadStageProcessesDP(tools, stage, myStepPage, "PRIMARY");
		
		//If the stage is current stage,set the stageStatus to Active and continue with next iteration

		stage.putString("pyStageStatus","Future");

        //Iterating over Stages History to check completed stages
			
		java.util.Iterator stagesHistoryIterator = pxStages.iterator();
		while(stagesHistoryIterator.hasNext()) { 
   		
			ClipboardProperty stageFromHistory = (ClipboardProperty) stagesHistoryIterator.next();
		
   			String stageNameFromHistory=stageFromHistory.getStringValue("pxStageID");
        	if(stageName.equals(stageNameFromHistory))
			{
				if(currentStageID.equals(stageNameFromHistory)){
					stage.putString("pyStageStatus","Active");
			}
					//Completed stages will have pxCompletedBy set with the value.
					String completedBy = stageFromHistory.getStringValue("pxCompletedBy");
					// SE-27250 In some cusotmer scenario, completeBy is coming as expty. So using completed time also
                	String completedStageTime = stageFromHistory.getStringValue("pxCompletedStageTime");
					if(!completedBy.equals("") || !completedStageTime.equals("")){
     					stage.putString("pyStageStatus","Past");						
			        }
                
                //do not copy from stage history if the stage is in future
				if(stage.getString("pyStageStatus").equals("Future"))
          continue;

				ClipboardProperty processList = stage.getProperty("pxProcesses");
				//If the stage has already process List 
				if(processList.size() > 0) {
					ClipboardProperty processHistoryList = stageFromHistory.getProperty("pxProcesses");
					ClipboardPage processHistory = null;
					ClipboardPage process = null;
					HashSet<Integer> copiedIndices = new HashSet<Integer>(); //list of indices in processList that we have already copied history entries to
					for (int i = 1; i <= processHistoryList.size(); i++) {
						
						processHistory = processHistoryList.getPageValue(i);
						if (processHistory.getBoolean("pxIsOptional")) {
 							processList.add(i, processHistory);
                           	pega_processengine_flowutilities.pzLoadStageStepsDP(processList.getPageValue(i), workPage, processHistory);
						} /*else if (!processHistory.getString("pxProcessName").equals(process.getString("pyFlowName"))) { //non-optional, doesn't match => sequential process (converse is not true though)
							
						} */else {
							for (int j = 1; j <= processList.size(); j++) {
								process = processList.getPageValue(j);
 								if (processHistory.getString("pxFlowID").equals(process.getString("pxFlowID")) && !copiedIndices.contains(new Integer(j))) {
                                  process.replace(processHistory);
                                  
                                  // Add shapes and shape history
                                  pega_processengine_flowutilities.pzLoadStageStepsDP(process, workPage, processHistory);
                                  copiedIndices.add(new Integer(j));
								  break;
								}
							}
						}
					}
                    	// Add steps to processes not in history
                    for (int k = 1; k <= processList.size(); k++) {
                      ClipboardPage pgProc = processList.getPageValue(k);
                      ClipboardProperty cpSteps = pgProc.getIfPresent(".pxSteps");
                      if (cpSteps == null) {
                        pega_processengine_flowutilities.pzLoadStageStepsDP(pgProc, workPage, null);

                      }

                    }

				} else {
                  // Add processes and steps when there is history but no process list
                  	ClipboardProperty cpHistoryProcesses = stageFromHistory.getProperty("pxProcesses");
                    ClipboardProperty cpStageListProcesses = stage.getProperty(".pxProcesses");
                   	for (int n = 1; n <= cpHistoryProcesses.size(); n++) {
                      ClipboardPage pgHistoryProcess = cpHistoryProcesses.getPageValue(n);
                      cpStageListProcesses.add(pgHistoryProcess);
                      pega_processengine_flowutilities.pzLoadStageStepsDP(cpStageListProcesses.getPageValue(n), workPage, pgHistoryProcess);
                    }
				}	     
			}				
		}
	}
	// Add shapes to future stages
	Iterator futureIt = stagesList.getProperty("pxResults").iterator();
	while (futureIt.hasNext()) {
		ClipboardProperty cpStage = (ClipboardProperty) futureIt.next();
		ClipboardPage pgStage = cpStage.getPageValue();
		if (pgStage.getString(".pyStageStatus").equals("Future")) {
			ClipboardProperty cpProcesses = pgStage.getProperty(".pxProcesses");
			Iterator prIt = cpProcesses.iterator();
			while (prIt.hasNext()) {
				ClipboardProperty cpProcess = (ClipboardProperty) prIt.next();
				pega_processengine_flowutilities.pzLoadStageStepsDP(cpProcess.getPageValue(), workPage, null);
			}
		}
	}

} else {
    nextBlock = "****";	
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Copy stages history to temp page.
 * <p>
 * Step 5 <code>Property-Set</code> [on page TempPage] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
// LHS: TempPage.pxResults
// RHS: workPage.pxStageHistory
ClipboardProperty pzSourceVar13 = pega.findPage(tools.getParamValue("workPage"), "Work-").getProperty("pxStageHistory");
ClipboardProperty pzTargetVar14 = pega.getViaPropRef(".pxResults", pRef_12, pega.findPageWithException("TempPage", "Code-Pega-List"), false, false);
pzTargetVar14.setValue(pzSourceVar13);

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
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Sort by date - descending.
 * <p>
 * Step 6 <code>Obj-Sort</code> [on page TempPage] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Sort");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Sort", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Sort
// Expression: pxResults
// Expression: pxEnterStageTime
String[] mySortKey = new String[1];
boolean[] mySortOrder = new boolean[1];
String[] myComparator = new String[1];
mySortKey[0] = "pxEnterStageTime";
mySortOrder[0] = false;
myComparator[0] = "";
if (myStepPage == null) {
String pz_16 = "TempPage";
myStepPage = tools.findPage(pz_16, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_16, false);
myStepPage.putString("pxObjClass", "Code-Pega-List");
}
}
if (myStepPage == null) {
throw new InvalidReferenceException("TempPage", "this step page does not exist and cannot be shown");
}
ClipboardProperty pageList = myStepPage.getProperty("pxResults");
if (! pega.sortPageList(pageList, mySortKey, mySortOrder, myComparator)) {
// status reports why sort failed
return false;
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
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Sort",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Get alternated stages from sorted page.
 * <p>
 * Step 7 <code>Property-Set</code> [on page TempPage.pxResults] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equalsIgnoreCase(\"Alternate\", .pxStageType)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@(Pega-RULES:String).equalsIgnoreCase(\"Alternate\", .pxStageType)", "FUAInstance-NullMyStepPage");
}
boolean pz_19 = (pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", "Pega-RULES", "String", new Object[] { "Alternate", scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equalsIgnoreCase(\"Alternate\", .pxStageType)",pz_19);
if (!pz_19) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equalsIgnoreCase(\"Alternate\", .pxStageType) " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equalsIgnoreCase(.pxCameFrom, .pxStageID)");
try {
boolean pz_22 = (pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equalsIgnoreCase(.pxCameFrom, .pxStageID)",pz_22);
if (pz_22) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equalsIgnoreCase(.pxCameFrom, .pxStageID) " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@contains(@toLowerCase(local.alternateStages),@toLowerCase(\"&lt;\" + .pxStageID + \"&gt;\"))");
try {
boolean pz_23 = (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", null, null, new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", null, null, new Object[] { alternateStages }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", null, null, new Object[] { (("<" + scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + ">") }) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@contains(@toLowerCase(local.alternateStages),@toLowerCase(\"&lt;\" + .pxStageID + \"&gt;\"))",pz_23);
if (pz_23) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@contains(@toLowerCase(local.alternateStages),@toLowerCase(\"&lt;\" + .pxStageID + \"&gt;\")) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    alternateStages = (((alternateStages + "<") + scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + ">");
}
{
    tools.putParamValue("AlternateStageEntryTime", PropertyInfo.TYPE_TEXT, scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME));
}
{
    pega.setViaPropRef(".pxResults(<prepend>).pxStageName", pRef_25, pega.findPageWithException("AlternateStages", "Code-Pega-List"), scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(1).pxCompletedBy", pRef_27, pega.findPageWithException("AlternateStages", "Code-Pega-List"), scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(1).pxCompletedStageTime", pRef_29, pega.findPageWithException("AlternateStages", "Code-Pega-List"), scalarValueQuery_30.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxResults(1).pxStageID", pRef_31, pega.findPageWithException("AlternateStages", "Code-Pega-List"), scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(1).pxCameFrom", pRef_32, pega.findPageWithException("AlternateStages", "Code-Pega-List"), scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    ClipboardProperty pzSourceVar33 = myStepPage.getProperty("pxProcesses");
    ClipboardProperty pzTargetVar34 = pega.getViaPropRef(".pxResults(1).pxProcesses", pRef_35, pega.findPageWithException("AlternateStages", "Code-Pega-List"), false, false);
    pzTargetVar34.setValue(pzSourceVar33);
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
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Insert alternate stages to the StagesList page.
 * <p>
 * Step 8 <code>Java</code> [on page AlternateStages.pxResults] <br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_workPage = tools.findPage(tools.getParamValue("workPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage StagesList = tools.findPage("StagesList");
ClipboardProperty results = StagesList.getProperty("pxResults");
ClipboardPage workPage = tools.findPage(tools.getParamValue("workPage"));


String stageName = myStepPage.getString("pxStageName");
String stageID = myStepPage.getString("pxStageID");
String cameFrom = myStepPage.getString("pxCameFrom");
ClipboardProperty pxProcesses = myStepPage.getProperty("pxProcesses");

ClipboardPage TempPage = tools.createPage("Embed-Stage",null);
if(currentStageID.equalsIgnoreCase(stageID)){
	TempPage.putString("pyStageStatus","Active");
  	String completedBy = myStepPage.getString("pxCompletedBy");
					
                	String completedStageTime = myStepPage.getString("pxCompletedStageTime");
					if(!completedBy.equals("") || !completedStageTime.equals("")){
     					TempPage.putString("pyStageStatus","Past");						
			        }
}
else{
	TempPage.putString("pyStageStatus","Past");
}
int cameFromIndex = pega_rules_utilities.IndexInPageList(cameFrom, "pyStageID", results); 

String processPageName = "pySupportProcessList";

TempPage.putString("pxObjClass","Embed-Stage");
TempPage.putString("pyStageName",stageName);
TempPage.putString("pyStageID",stageID);
//TempPage.put("pxProcesses", pxProcesses); BUG-151599: let's do the processes afterwards so we can insert optional processes (which are not in pySupportProcessList) in the right place
TempPage.putString("pyStageTransition", "manual");

// Populate the process history
pega_processengine_flowutilities.pzLoadStageProcessesDP(tools, TempPage, workPage, "ALTERNATE");


if (pxProcesses != null) {
	ClipboardProperty tempProcessList = TempPage.getProperty(".pxProcesses");
	for (int i = 1; i <= pxProcesses.size(); i++) {
		ClipboardPage processPage = pxProcesses.getPageValue(i);
		boolean isOptional = processPage.getBoolean(".pxIsOptional");
		if (isOptional) {
			tempProcessList.add(i, processPage);
            pega_processengine_flowutilities.pzLoadStageStepsDP(tempProcessList.getPageValue(i), workPage, processPage);
		} else {
			for (int j = 1; j <= tempProcessList.size(); j++) {
				ClipboardPage tempProcessPage = tempProcessList.getPageValue(i);
				if (tempProcessPage.getString(".pxFlowID").equals(processPage.getString(".pxFlowID"))) {
					tempProcessPage.replace(processPage);
                	pega_processengine_flowutilities.pzLoadStageStepsDP(tempProcessPage, workPage, processPage);
                }
			}
		}
	}
  
  	// Add steps to processes not in history
  	for (int k = 1; k <= tempProcessList.size(); k++) {
      ClipboardPage pgProc = tempProcessList.getPageValue(k);
      ClipboardProperty cpSteps = pgProc.getIfPresent(".pxSteps");
      if (cpSteps == null) {
      	pega_processengine_flowutilities.pzLoadStageStepsDP(pgProc, workPage, null);
        
      }
      
    }

}

// Append alternate stage from where it came from
// Append at the end if alternate stage doesnot have cameFrom Value
		
if (cameFromIndex > 0) {
	results.add(cameFromIndex+1,TempPage);
} else {
	results.add(TempPage);
}

TempPage.removeFromClipboard();
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

/**
 * Styling for chevrons.
 * <p>
 * Step 9 <code>Java</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_workPage = tools.findPage(tools.getParamValue("workPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
int i = 0;
currentStageIndex = -1;
//Iterating over stages to set next stage status on every stage
ClipboardPage stagesList = tools.findPage("StagesList");
java.util.Iterator stagesListIterator = stagesList.getProperty("pxResults").iterator();
ClipboardPage nextStage=null;
ClipboardPage stage=null;
while(stagesListIterator.hasNext())
{
    i++;
	if(nextStage==null){
		stage = ((ClipboardProperty) stagesListIterator.next()).getPageValue();
	}else {
		stage=nextStage;
	}
	if(stagesListIterator.hasNext())
	{
		nextStage=((ClipboardProperty) stagesListIterator.next()).getPageValue();
		stage.putString("pyNextStageStatus",nextStage.getString("pyStageStatus"));
        if (stage.getString("pyStageStatus").equals("Active")) {
          currentStageIndex = i;  
        }
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
pz_CurrentStepNum = "9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * find current step.
 * <p>
 * Step 10 <code>Java</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_workPage = tools.findPage(tools.getParamValue("workPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage workPage = tools.findPage(tools.getParamValue("workPage"));
ClipboardPage stagesList=tools.findPage("StagesList");
java.util.Iterator stagesIterator = stagesList.getProperty("pxResults").iterator();
while(stagesIterator.hasNext())
{
	ClipboardPage stagePage = ((ClipboardProperty) stagesIterator.next()).getPageValue();
	String StageId = stagePage.getString("pyStageID");
	ClipboardProperty processList = stagePage.getProperty("pxProcesses");
	ClipboardPage assignPage = tools.findPage("newAssignPage");
	
	
	if(assignPage != null)
	{
		String assignStageId = assignPage.getString("pxStageID");
		String flowType = assignPage.getString("pxTopLevelFlowName");
		//If the top level flow is not available (which happens sometimes for reasons I don't understand), use the current flow
		if(flowType.equals("")) {
			flowType = assignPage.getString("pxFlowName");
		}
		//if stage name matches the assign page data
		if(StageId.equalsIgnoreCase(assignStageId))
		{
            
			java.util.Iterator processListIterator  = processList.iterator();
			while(processListIterator.hasNext())
			{
				ClipboardPage process = ((ClipboardProperty)processListIterator.next()).getPageValue();
				String subs = process.getString("pxSubscript");
				// if this is current process
				/* even though pxSubscripts are not unique through all of pxStageHistory, they are unique among non-complete processes, so we can be sure that it's the correct one */
				if(flowType.equalsIgnoreCase(subs) && !process.getString(".pxIsComplete").equalsIgnoreCase("true")){
					process.putString("pxIsCurrent","true");
                  	// Set pxIsCurrent on the step being performed
                  	// If it is a complex flow, just set current on the first step
                  	if ("Complex".equalsIgnoreCase(process.getString(".pxStructureType"))) {
                  		process.getProperty(".pxSteps(1).pxIsCurrent").setValue("true");
                    } else {
                      // Otherwise set pxIsCurrent on the current shape in the top flow.
                      String sTaskName = workPage.getString(".pxFlow(" + flowType + ").pyLastFlowStep");
                      java.util.Iterator stepIt = process.getProperty(".pxSteps").iterator();
                      while (stepIt.hasNext()) {
                        ClipboardProperty cpStep = (ClipboardProperty) stepIt.next();
                        ClipboardPage pgStep = cpStep.getPageValue();
                     	String sLastStepID = pgStep.getString(".pxStepID");
                     	String isComplete= pgStep.getString(".pxIsComplete");
                        if (sTaskName.equals(sLastStepID) && !isComplete.equals("True")) {
                          pgStep.putString(".pxIsCurrent", "true");
                          break;
                        }
                      }
                   }
                    break;
				}
			}
		}
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
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Copy the StagesList to Data Page.
 * <p>
 * Step 11 <code>Property-Set</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
// LHS: Primary.pxResults
// RHS: StagesList.pxResults
ClipboardProperty pzSourceVar41 = pega.findPageWithException("StagesList", "Code-Pega-List").getProperty("pxResults");
ClipboardProperty pzTargetVar42 = pega.getViaPropRef(".pxResults", pRef_12, tools.getPrimaryPage(), false, false);
pzTargetVar42.setValue(pzSourceVar41);

{
    tools.putParamValue("CurrentStage", PropertyInfo.TYPE_TEXT, ((currentStageIndex == ((-1))) ? "" : scalarValueQuery_43.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT, currentStageIndex)));
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
pz_CurrentStepNum = "11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * set count to make it easier to get.
 * <p>
 * Step 12 <code>Property-Set</code><br>
 */
public boolean step12_circum0() {
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
    pega.setViaPropRef(".pxResultCount", pRef_44, myStepPage, (pega.<Integer>resolveMethodCall("Count--(String,Activity)", "Count", "Pega-RULES", "Default", new Object[] { ".pxResults", tools })).intValue(), "sNY", false, true);
}
{
    pega.setViaPropRef(".pyPageIndex", pRef_45, myStepPage, currentStageIndex, "sNN", false, true);
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
pz_CurrentStepNum = "12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * if pyPageIndex is -1 skip retrieving next stage name.
 * <p>
 * Step 13 <code>Call pzGetNextStage</code> [on page workPage] <br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetNextStage");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.CurrentStage==\"\"");
try {
boolean pz_46 = (tools.getParamValue("CurrentStage").equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.CurrentStage==\"\"",pz_46);
if (pz_46) {
// branch to block CLN
nextBlock = "CLN";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.CurrentStage==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzGetNextStage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzGetNextStage
if (myStepPage == null) {
myStepPage = tools.findPage(tools.getParamValue("workPage"), true);
if (myStepPage == null) {
myStepPage = tools.findPage(tools.getParamValue("workPage"), false);
if (myStepPage != null && !myStepPage.isReadOnly()) {
myStepPage.putString("pxObjClass", "Work-");
}
}
}
// Calling Activity : pzGetNextStage

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: Primary.pzNextPrimStage
ClipboardProperty pz_48 = propertyQuery_47.resolve(tools, tools.getPrimaryPage());
newParamsPage.putParamValue("NextStage", PropertyInfo.TYPE_TEXT, pz_48);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: Param.CurrentStage
newParamsPage.putParamValue("CurrentStage", PropertyInfo.TYPE_TEXT, tools.getParamValue("CurrentStage"));
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzGetNextStage", "Code-Pega-List", "");
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
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzGetNextStage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * Remove the temp page.
 * <p>
 * Step 14 [CLN] <code>Page-Remove</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: TempPage
pageRemove(tools.findPage("TempPage"));
// Expression: AlternateStages
pageRemove(tools.findPage("AlternateStages"));
// Expression: StagesList
pageRemove(tools.findPage("StagesList"));
// Expression: pySupportProcessList
pageRemove(tools.findPage("pySupportProcessList"));
// Expression: pyTempCaseStagesWorkPage
pageRemove(tools.findPage("pyTempCaseStagesWorkPage"));
// Expression: ShapeList
pageRemove(tools.findPage("ShapeList"));
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
pz_CurrentStepNum = "14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

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

public String alternateStages = "";
public String currentStageID = "";
public String lastFutureStageName = "";
public int currentStageIndex = 0;

public void initializeUserLocalVariables() {
	alternateStages = "";
	currentStageID = "";
	lastFutureStageName = "";
	currentStageIndex = 0;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("alternateStages", (alternateStages == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : alternateStages.toString());
	smRetVal.putString("currentStageID", (currentStageID == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : currentStageID.toString());
	smRetVal.putString("lastFutureStageName", (lastFutureStageName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : lastFutureStageName.toString());
	smRetVal.putString("currentStageIndex", Integer.toString(currentStageIndex));
	return smRetVal;
}

public ClipboardPage pageParam_workPage;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_workPage = null;
}

public static final String[] pRef_12 = new String[] { "", "", "pxResults", "" };
public static final String[] pRef_35 = new String[] { "", "", "pxResults", "1", "pxProcesses", "" };
public static final String[] pRef_29 = new String[] { "", "", "pxResults", "1", "pxCompletedStageTime", "" };
public static final String[] pRef_45 = new String[] { "", "", "pyPageIndex", "" };
public static final String[] pRef_32 = new String[] { "", "", "pxResults", "1", "pxCameFrom", "" };
public static final String[] pRef_31 = new String[] { "", "", "pxResults", "1", "pxStageID", "" };
public static final String[] pRef_27 = new String[] { "", "", "pxResults", "1", "pxCompletedBy", "" };
public static final String[] pRef_25 = new String[] { "", "", "pxResults", "<prepend>", "pxStageName", "" };
public static final String[] pRef_44 = new String[] { "", "", "pxResultCount", "" };
private static final ScalarValueQuery scalarValueQuery_30 = FUAUtil.createQueryBuilder().scalarProperty("pxCompletedStageTime").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_43 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pyStageID").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_47 = FUAUtil.createQueryBuilder().scalarProperty("pzNextPrimStage").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pxEnterStageTime").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().scalarProperty("pxStageName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().scalarProperty("pxStageID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pxStageType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pxCameFrom").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_28 = FUAUtil.createQueryBuilder().scalarProperty("pxCompletedBy").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADSTAGESTATUSDP #20200826T052410.155 GMT", "Code-Pega-List pzLoadStageStatusDP", "Pega-ProcessEngine", "08-06-01", false, false, "", "LOADDECLARATIVEPAGE", "20200826T052410.155 GMT" ,"Rule-Obj-Activity"); }
