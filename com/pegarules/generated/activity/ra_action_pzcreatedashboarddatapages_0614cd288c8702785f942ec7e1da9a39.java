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
public class ra_action_pzcreatedashboarddatapages_0614cd288c8702785f942ec7e1da9a39 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzCreateDashboardDataPages.Data_Portal_PegaAdminStudio.Action");
	public ra_action_pzcreatedashboarddatapages_0614cd288c8702785f942ec7e1da9a39(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT	Pega-Desktop:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 9 Circum: 0" );
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
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 10 Circum: 0" );
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
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 11 Circum: 0" );
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 12 Circum: 0" );
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
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
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
	"Rule-Obj-Activity:PZCREATEDASHBOARDDATAPAGES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZCREATEDASHBOARDDATAPAGES","Rule-Obj-Activity","DATA-PORTAL-PEGAADMINSTUDIO",false,"","Pega-Desktop","08-05-01","RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT","!PZCREATEDASHBOARDDATAPAGES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",907547942)
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
//	RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT:20200108T051909.868 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "3a08c9cb493c41dacac408c6dc8de1f2";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal-PegaAdminStudio";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1 <code>Load-DataPage</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Load-DataPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Load-DataPage

String poolID = null;
// Expression: "dashboardDataPages"
poolID = "dashboardDataPages";

ParameterPage dpParameterPage = null;

// Queueing DP for asynchronous load.
boolean isADPQueued = false;
if (dpParameterPage != null) {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzClusterMembersInformation", dpParameterPage, poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzClusterMembersInformation", dpParameterPage);
}
} else {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzClusterMembersInformation", poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzClusterMembersInformation");
}
}
if (isADPQueued) {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzClusterMembersInformation' for asychronous loading successful.");
} else {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzClusterMembersInformation' for asychronous loading is unsuccessful.");
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Step 2 <code>Load-DataPage</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Load-DataPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Load-DataPage

String poolID = null;
// Expression: "dashboardDataPages"
poolID = "dashboardDataPages";

ParameterPage dpParameterPage = null;
// Expression: 
// Expression: false
String pz_1 = String.valueOf(false);
// Building parameter page required for loading it.
dpParameterPage = new ParameterPage();
dpParameterPage.putString("appendAllNodesToNodesList", pz_1);

// Queueing DP for asynchronous load.
boolean isADPQueued = false;
if (dpParameterPage != null) {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzNodesInCluster", dpParameterPage, poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzNodesInCluster", dpParameterPage);
}
} else {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzNodesInCluster", poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzNodesInCluster");
}
}
if (isADPQueued) {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzNodesInCluster' for asychronous loading successful.");
} else {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzNodesInCluster' for asychronous loading is unsuccessful.");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Step 3 <code>Load-DataPage</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Load-DataPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Load-DataPage

String poolID = null;
// Expression: "dashboardDataPages"
poolID = "dashboardDataPages";

ParameterPage dpParameterPage = null;

// Queueing DP for asynchronous load.
boolean isADPQueued = false;
if (dpParameterPage != null) {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzAgentsInCluster", dpParameterPage, poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzAgentsInCluster", dpParameterPage);
}
} else {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzAgentsInCluster", poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzAgentsInCluster");
}
}
if (isADPQueued) {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzAgentsInCluster' for asychronous loading successful.");
} else {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzAgentsInCluster' for asychronous loading is unsuccessful.");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Step 4 <code>Load-DataPage</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Load-DataPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Load-DataPage

String poolID = null;
// Expression: "dashboardDataPages"
poolID = "dashboardDataPages";

ParameterPage dpParameterPage = null;
// Expression: 
// Expression: "All nodes"
// Building parameter page required for loading it.
dpParameterPage = new ParameterPage();
dpParameterPage.putString("NodeId", "All nodes");

// Queueing DP for asynchronous load.
boolean isADPQueued = false;
if (dpParameterPage != null) {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzRequestorPools", dpParameterPage, poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzRequestorPools", dpParameterPage);
}
} else {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzRequestorPools", poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzRequestorPools");
}
}
if (isADPQueued) {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzRequestorPools' for asychronous loading successful.");
} else {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzRequestorPools' for asychronous loading is unsuccessful.");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Step 5 <code>Load-DataPage</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Load-DataPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Load-DataPage

String poolID = null;
// Expression: "dashboardDataPages"
poolID = "dashboardDataPages";

ParameterPage dpParameterPage = null;

// Queueing DP for asynchronous load.
boolean isADPQueued = false;
if (dpParameterPage != null) {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzQueueProcessorSummaryInfo", dpParameterPage, poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzQueueProcessorSummaryInfo", dpParameterPage);
}
} else {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzQueueProcessorSummaryInfo", poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzQueueProcessorSummaryInfo");
}
}
if (isADPQueued) {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzQueueProcessorSummaryInfo' for asychronous loading successful.");
} else {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzQueueProcessorSummaryInfo' for asychronous loading is unsuccessful.");
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
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Step 6 <code>Load-DataPage</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Load-DataPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Load-DataPage

String poolID = null;
// Expression: "dashboardDataPages"
poolID = "dashboardDataPages";

ParameterPage dpParameterPage = null;

// Queueing DP for asynchronous load.
boolean isADPQueued = false;
if (dpParameterPage != null) {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzJobSummaryInfo", dpParameterPage, poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzJobSummaryInfo", dpParameterPage);
}
} else {
if (poolID != null) {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzJobSummaryInfo", poolID);
} else {
isADPQueued = pega.loadAsyncDeclarativePage("D_pzJobSummaryInfo");
}
}
if (isADPQueued) {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzJobSummaryInfo' for asychronous loading successful.");
} else {
if (oLog.isDebugEnabled()) oLog.debug("Queueing DP 'D_pzJobSummaryInfo' for asychronous loading is unsuccessful.");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Load-DataPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Step 7 <code>Connect-Wait</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Connect-Wait");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Connect-Wait", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Connect-Wait
// Expression: 30
String pz_2 = Integer.toString(30);
// Expression: "dashboardDataPages"

// get requestor
PRRequestor req = tools.getRequestor();

// Wait for requestor(s) for 30 Seconds
try {
long startWaitForChildReq = System.currentTimeMillis();
  req.waitOnAllBatchActivities(Long.parseLong(pz_2) * 1000);
long endWaitForChildReq = System.currentTimeMillis();
pega.waitOnLoadDataPageActivities("dashboardDataPages", (Long.parseLong(pz_2) * 1000 ) - (endWaitForChildReq - startWaitForChildReq));
}
catch(PRTimeoutExpiredException e) {
  oLog.error("Wait for all requestors failed: time out occurred");
  tools.getStepStatus().add(ProcessingStatus.SEVERITY_FAIL,
    "Fail: time out occurred, child requestor(s)still running", null);
}
catch(PRDataPagePoolException e) {
  oLog.error("Wait failed : " + e.getMessage());
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Connect-Wait",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Step 8 <code>Call pzCreateRequestorsPage</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateRequestorsPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzCreateRequestorsPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzCreateRequestorsPage
if (myStepPage == null) {
}
// Calling Activity : pzCreateRequestorsPage

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzCreateRequestorsPage", "Data-Portal-PegaAdminStudio", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateRequestorsPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Step 9 <code>Call pzCreateClusterPage</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateClusterPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzCreateClusterPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzCreateClusterPage
if (myStepPage == null) {
}
// Calling Activity : pzCreateClusterPage

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzCreateClusterPage", "Data-Portal-PegaAdminStudio", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateClusterPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Step 10 <code>Call pzCreateAgentsPage</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateAgentsPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzCreateAgentsPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzCreateAgentsPage
if (myStepPage == null) {
}
// Calling Activity : pzCreateAgentsPage

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzCreateAgentsPage", "Data-Portal-PegaAdminStudio", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateAgentsPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Step 11 <code>Call pzCreateRequestorsPoolPage</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateRequestorsPoolPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzCreateRequestorsPoolPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzCreateRequestorsPoolPage
if (myStepPage == null) {
}
// Calling Activity : pzCreateRequestorsPoolPage

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzCreateRequestorsPoolPage", "Data-Portal-PegaAdminStudio", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateRequestorsPoolPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Step 12 <code>Call pzCreateQueueProcessingPage</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateQueueProcessingPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzCreateQueueProcessingPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzCreateQueueProcessingPage
if (myStepPage == null) {
}
// Calling Activity : pzCreateQueueProcessingPage

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzCreateQueueProcessingPage", "Data-Portal-PegaAdminStudio", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateQueueProcessingPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Step 13 <code>Call pzCreateJobSchedulingPage</code><br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateJobSchedulingPage");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzCreateJobSchedulingPage", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzCreateJobSchedulingPage
if (myStepPage == null) {
}
// Calling Activity : pzCreateJobSchedulingPage

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzCreateJobSchedulingPage", "Data-Portal-PegaAdminStudio", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCreateJobSchedulingPage",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-PORTAL-PEGAADMINSTUDIO PZCREATEDASHBOARDDATAPAGES #20200108T051909.868 GMT", "Data-Portal-PegaAdminStudio pzCreateDashboardDataPages", "Pega-Desktop", "08-05-01", false, true, "", "ACTIVITY", "20200108T051909.868 GMT" ,"Rule-Obj-Activity"); }
