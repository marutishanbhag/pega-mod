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
import com.pega.dsm.dnode.api.Operational;
import com.pega.dsm.dnode.api.dataset.DataSets;
import com.pega.dsm.dnode.util.ClipboardPageAdapter;
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
public class ra_action_pzexecutewriteusagedataflow_fd3f4c4db0213ef0b691c36999ce228d extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzExecuteWriteUsageDataFlow.Data_DM_DecisionUsage.Action");
	public ra_action_pzexecutewriteusagedataflow_fd3f4c4db0213ef0b691c36999ce228d(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT	Pega-DecisionEngine:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT";
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_3 = "DataSetPage";
thisStepPage = tools.findPage(pz_3, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 2 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_6 = "DataSetPage";
thisStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 4 Circum: 0" );
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
String pz_10 = "LoadRealTimeRuns";
thisStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 5 Circum: 0" );
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
String pz_13 = "WriteUsageData";
thisStepPage = tools.findPage(pz_13, true);
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 6 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_15 = "RunOptions";
thisStepPage = tools.findPage(pz_15, true);
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 7 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_17 = "LoadRealTimeRuns";
thisStepPage = tools.findPage(pz_17, true);
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_20 = pega.findPageWithException("LoadRealTimeRuns", "Pega-Landing-Decision-DDF").getIfPresent("pyRealTimeRunsList");
pageRef = pz_20;
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
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 9 Circum: 0" );
try {
pz_Status = step9_circum0();
} finally {
pega.popStackFrame(pz_StackFrame9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 10_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_27 = pega.findPageWithException("WriteUsageData", "Pega-Landing-Decision-DDF").getIfPresent("pyRealTimeRunsList");
pageRef = pz_27;
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
pz_CurrentStepNum = "10.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_0_circum0");
}
PRStackFrame pz_StackFrame10_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 10_0 Circum: 0" );
try {
pz_Status = step10_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CREATE"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_37 = "RunOptions";
thisStepPage = tools.findPage(pz_37, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_37, false);
thisStepPage.putString("pxObjClass", "Data-Decision-DDF-RunOptions");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 11 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_53 = "RunOptions";
thisStepPage = tools.findPage(pz_53, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_53, false);
thisStepPage.putString("pxObjClass", "Data-Decision-DDF-RunOptions");
}
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 12 Circum: 0" );
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
String pz_56 = "RunOptions";
thisStepPage = tools.findPage(pz_56, true);
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ERR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("ACS"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 17_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_circum0");
}
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 17 Circum: 0" );
try {
pz_Status = step17_circum0();
} finally {
pega.popStackFrame(pz_StackFrame17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 18_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 18_circum0");
}
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 18 Circum: 0" );
try {
pz_Status = step18_circum0();
} finally {
pega.popStackFrame(pz_StackFrame18_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 19_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "19";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 19_circum0");
}
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 19 Circum: 0" );
try {
pz_Status = step19_circum0();
} finally {
pega.popStackFrame(pz_StackFrame19_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 20_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CLEAN"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_circum0");
}
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 20 Circum: 0" );
try {
pz_Status = step20_circum0();
} finally {
pega.popStackFrame(pz_StackFrame20_circum0, false);
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
	"Rule-Obj-Activity:PZEXECUTEWRITEUSAGEDATAFLOW"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZEXECUTEWRITEUSAGEDATAFLOW","Rule-Obj-Activity","DATA-DM-DECISIONUSAGE",false,"","Pega-DecisionEngine","08-23-01","RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT","!PZEXECUTEWRITEUSAGEDATAFLOW",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",254523416)
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
//	RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT:20230618T003558.671 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "50b0ef2ea48dd37fa7e205f03d7d67ba";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-DM-DecisionUsage";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1 <code>Page-New</code> [on page DataSetPage] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_4 = "DataSetPage";
myStepPage = tools.findPage(pz_4, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-Decision-Usage","DataSetPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("DataSetPage", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Check current system is MKT, Is PegaCloud and OnPrem has repository.
 * <p>
 * Step 2 <code>Property-Set</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"PegaMKT-Install\",\"MKTCurrentVersion\")!=\"\"");
try {
boolean pz_5 = (!(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "PegaMKT-Install", "MKTCurrentVersion" }).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"PegaMKT-Install\",\"MKTCurrentVersion\")!=\"\"",pz_5);
if (!pz_5) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzExecuteWriteUsageDataFlow - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@getDataSystemSetting(\"PegaMKT-Install\",\"MKTCurrentVersion\")!=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("SkipStartDF", PropertyInfo.TYPE_TEXT, "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Truncate pzDecisionUsageStream dataset if the repository is not configured for onprem system.
 * <p>
 * Step 3 <code>DataSet-Execute</code> [on page DataSetPage] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "DataSet-Execute");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\"");
try {
boolean pz_7 = (!(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/monitor/capturedecisionusage" }).equals("true")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\"",pz_7);
if (pz_7) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\" " + anyException.getMessage(), anyException);
}
boolean pz__1 = pega.invokeWhen("pyIsDecisioningOnPegaCloud", "Data-DM-DecisionUsage", "Data-Decision-Usage");
if (pz__1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Utilities.IsInPageList(\"DecisionUsageData\",\".pyRepositoryName\",D_pzRepositoryListForUsageData.pxResults)");
try {
boolean pz_8 = (pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, "Utilities", new Object[] { "DecisionUsageData", ".pyRepositoryName", pega.findPageWithException("D_pzRepositoryListForUsageData", "Data-Repository").getProperty("pxResults") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Utilities.IsInPageList(\"DecisionUsageData\",\".pyRepositoryName\",D_pzRepositoryListForUsageData.pxResults)",pz_8);
if (pz_8) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Utilities.IsInPageList(\"DecisionUsageData\",\".pyRepositoryName\",D_pzRepositoryListForUsageData.pxResults) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("DataSet-Execute", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  DataSet-Execute
boolean inferenceEngineActive = pega.setInferenceEngineActive(false);try{String dataSetClass = myStepPage != null ? myStepPage.getClassName() : "Data-Decision-Usage";
Operational operational = DataSets.instance(tools, dataSetClass, "pzDecisionUsageStream");
com.pega.dsm.dnode.api.dataset.operation.TruncateOperation op = operational.getOperationByName("TruncateOperation");
op.truncate().await(tools);
} finally {pega.setInferenceEngineActive(inferenceEngineActive);}} finally {
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
boolean pz__3 = pega.invokeWhen("StepStatusFail", "Data-DM-DecisionUsage", "Data-Decision-Usage");
if (pz__3) {
// branch to block ACS
nextBlock = "ACS";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "DataSet-Execute",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Exit if the repository is not configured for onprem systems.
 * <p>
 * Step 4 <code>Java</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__5 = pega.invokeWhen("pyIsDecisioningOnPegaCloud", "Data-DM-DecisionUsage", "Data-DM-DecisionUsage");
if (pz__5) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Utilities.IsInPageList(\"DecisionUsageData\",\".pyRepositoryName\",D_pzRepositoryListForUsageData.pxResults)");
try {
boolean pz_9 = (pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, "Utilities", new Object[] { "DecisionUsageData", ".pyRepositoryName", pega.findPageWithException("D_pzRepositoryListForUsageData", "Data-Repository").getProperty("pxResults") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Utilities.IsInPageList(\"DecisionUsageData\",\".pyRepositoryName\",D_pzRepositoryListForUsageData.pxResults)",pz_9);
if (pz_9) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzExecuteWriteUsageDataFlow - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Utilities.IsInPageList(\"DecisionUsageData\",\".pyRepositoryName\",D_pzRepositoryListForUsageData.pxResults) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
// all preconditions return, the method body is unreachable
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step4_circum0 definition

/**
 * Create a page for all the realtime runs list.
 * <p>
 * Step 5 <code>Page-New</code> [on page LoadRealTimeRuns] <br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@DsmServices.pxHasFunctionalNodes(\"DataFlow\",\"RealTime\")");
try {
boolean pz_11 = (pega.<Boolean>resolveMethodCall("pxHasFunctionalNodes--(String,String)", "pxHasFunctionalNodes", null, "DsmServices", new Object[] { "DataFlow", "RealTime" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@DsmServices.pxHasFunctionalNodes(\"DataFlow\",\"RealTime\")",pz_11);
if (!pz_11) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzExecuteWriteUsageDataFlow - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@DsmServices.pxHasFunctionalNodes(\"DataFlow\",\"RealTime\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_12 = "LoadRealTimeRuns";
myStepPage = tools.findPage(pz_12, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Pega-Landing-Decision-DDF","LoadRealTimeRuns",false); 
// primary page will not be added to PageList
	 pega.setStepPage("LoadRealTimeRuns", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Create a page for pzWriteUsageData realtime runs list.
 * <p>
 * Step 6 <code>Page-New</code> [on page WriteUsageData] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_14 = "WriteUsageData";
myStepPage = tools.findPage(pz_14, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Pega-Landing-Decision-DDF","WriteUsageData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("WriteUsageData", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Create a fresh RunOptions page.
 * <p>
 * Step 7 <code>Page-New</code> [on page RunOptions] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_16 = "RunOptions";
myStepPage = tools.findPage(pz_16, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-Decision-DDF-RunOptions","RunOptions",false); 
// primary page will not be added to PageList
	 pega.setStepPage("RunOptions", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Load all the realtime runs; if none, jump to create.
 * <p>
 * Step 8 <code>Call pzLoadRealtimeRuns</code> [on page LoadRealTimeRuns] <br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzLoadRealtimeRuns");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzLoadRealtimeRuns", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzLoadRealtimeRuns
if (myStepPage == null) {
String pz_18 = "LoadRealTimeRuns";
myStepPage = tools.findPage(pz_18, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_18, false);
myStepPage.putString("pxObjClass", "Pega-Landing-Decision-DDF");
}
}
// Calling Activity : pzLoadRealtimeRuns

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzLoadRealtimeRuns", "Data-DM-DecisionUsage", "");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Utilities.LengthOfPageList(LoadRealTimeRuns.pyRealTimeRunsList)&gt;0");
try {
boolean pz_19 = ((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, "Utilities", new Object[] { pega.findPageWithException("LoadRealTimeRuns", "Pega-Landing-Decision-DDF").getProperty("pyRealTimeRunsList") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Utilities.LengthOfPageList(LoadRealTimeRuns.pyRealTimeRunsList)&gt;0",pz_19);
if (!pz_19) {
// branch to block CREATE
nextBlock = "CREATE";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Utilities.LengthOfPageList(LoadRealTimeRuns.pyRealTimeRunsList)&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzLoadRealtimeRuns",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Identify pzWriteUsageData dataflow runs into a separate list.
 * <p>
 * Step 9 <code>Page-Copy</code> [on page LoadRealTimeRuns.pyRealTimeRunsList] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.equals(\"Data-Decision-Usage\",.pyOptions.pyAppliesTo)&amp;&amp;@String.equals(\"pzWriteUsageData\",.pyOptions.pyRuleName)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.equals(\"Data-Decision-Usage\",.pyOptions.pyAppliesTo)&&@String.equals(\"pzWriteUsageData\",.pyOptions.pyRuleName)", "FUAInstance-NullMyStepPage");
}
boolean pz_25 = ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { "Data-Decision-Usage", scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue() && (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { "pzWriteUsageData", scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.equals(\"Data-Decision-Usage\",.pyOptions.pyAppliesTo)&amp;&amp;@String.equals(\"pzWriteUsageData\",.pyOptions.pyRuleName)",pz_25);
if (!pz_25) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.equals(\"Data-Decision-Usage\",.pyOptions.pyAppliesTo)&amp;&amp;@String.equals(\"pzWriteUsageData\",.pyOptions.pyRuleName) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
sourcePage = tools.getStepPage();
// Expression: WriteUsageData.pyRealTimeRunsList(<APPEND>)
ClipboardPage pz_26 = pega.findPageWithException("WriteUsageData", "Pega-Landing-Decision-DDF").getProperty(".pyRealTimeRunsList(<append>)").getPageValue();
targetPage = pz_26;
if (!(targetPage != null && sourcePage != null && targetPage == sourcePage)) {
if (targetPage != null) {
String pageClass = sourcePage != null ? sourcePage.getClassName() : targetPage.getClassName();
targetPage.clear();
targetPage.putString("pxObjClass", pageClass);
}

if ((targetPage != null) && (sourcePage != null)) {
targetPage.putAll(sourcePage, ClipboardPage.PUTALL_KEEPNEW);
targetPage.addMessages(sourcePage);
}
} // end self-ref check;
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Get the existing active data flow run ID to be stopped.
 * <p>
 * Step 10.0 <code>Property-Set</code> [on page WriteUsageData.pyRealTimeRunsList] <br>
 */
public boolean step10_0_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.equals(\"In progress\",.pyStatus)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@String.equals(\"In progress\",.pyStatus)", "FUAInstance-NullMyStepPage");
}
boolean pz_29 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { "In progress", scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.equals(\"In progress\",.pyStatus)",pz_29);
if (!pz_29) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.equals(\"In progress\",.pyStatus) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("runID", PropertyInfo.TYPE_TEXT, scalarValueQuery_30.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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

// Code to call nested step 10_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "10.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 10_1_circum0");
}
String pz_31 = "RunOptions";
nestedStepPage = tools.findPage(pz_31, true);
PRStackFrame pz_StackFrame10_1_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT Step: 10_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step10_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame10_1_circum0, false);
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
pz_CurrentStepNum = "10.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_0_circum0 definition

/**
 * Stop the existing active data flow run -- for backward compatibility.
 * <p>
 * Step 10.1 <code>Call pxStopById</code> [on page RunOptions] <br>
 */
public boolean step10_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxStopById");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\"");
try {
boolean pz_32 = (!(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/monitor/capturedecisionusage" }).equals("true")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\"",pz_32);
if (pz_32) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.pxIsBlank(Param.runID)");
try {
boolean pz_33 = (pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, "String", new Object[] { tools.getParamValue("runID") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.pxIsBlank(Param.runID)",pz_33);
if (pz_33) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.pxIsBlank(Param.runID) " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.equals(\"pzWriteUsageData\",Param.runID)");
try {
boolean pz_34 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, "String", new Object[] { "pzWriteUsageData", tools.getParamValue("runID") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.equals(\"pzWriteUsageData\",Param.runID)",pz_34);
if (pz_34) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.equals(\"pzWriteUsageData\",Param.runID) " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@DataFlowRun.pxRunExists(tools,Param.runID)");
try {
boolean pz_35 = (pega.<Boolean>resolveMethodCall("pxRunExists--(PublicAPI,String)", "pxRunExists", null, "DataFlowRun", new Object[] { tools, tools.getParamValue("runID") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@DataFlowRun.pxRunExists(tools,Param.runID)",pz_35);
if (!pz_35) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@DataFlowRun.pxRunExists(tools,Param.runID) " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxStopById", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxStopById
if (myStepPage == null) {
String pz_36 = "RunOptions";
myStepPage = tools.findPage(pz_36, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_36, false);
myStepPage.putString("pxObjClass", "Data-Decision-DDF-RunOptions");
}
}
// Calling Activity : pxStopById
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxStopById", "Data-DM-DecisionUsage", "");
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
boolean pz__7 = pega.invokeWhen("StepStatusFail", "Data-DM-DecisionUsage", "Data-Decision-DDF-RunOptions");
if (pz__7) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
boolean pz__9 = pega.invokeWhen("hasMessages", "Data-DM-DecisionUsage", "Data-Decision-DDF-RunOptions");
if (pz__9) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "10.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxStopById",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_1_circum0 definition

/**
 * Set metadata to create a managed run.
 * <p>
 * Step 11 [CREATE] <code>Property-Set</code> [on page RunOptions] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyAppliesTo", pRef_38, myStepPage, "Data-Decision-Usage", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyRuleName", pRef_39, myStepPage, "pzWriteUsageData", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyIsManaged", pRef_40, myStepPage, true, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyUseDetailedMetrics", pRef_41, myStepPage, false, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyIsRealTimeRun", pRef_42, myStepPage, true, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyIsTestRun", pRef_43, myStepPage, false, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyDeleteRunAfterExecution", pRef_44, myStepPage, false, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyServiceInstanceName", pRef_45, myStepPage, "RealTime", "sTN", false, true);
}
{
    tools.putParamValue("Index", PropertyInfo.TYPE_INTEGER, (pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", null, null, new Object[] { "In progress", ".pyStatus", pega.findPageWithException("WriteUsageData", "Pega-Landing-Decision-DDF").getProperty("pyRealTimeRunsList") })).intValue());
}
{
    tools.putParamValue("ExistingFlushTimeThreshold", PropertyInfo.TYPE_INTEGER, ((tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "Index") > 0) ? scalarValueQuery_46.resolveToInt(tools, pega.findPageWithException("WriteUsageData", "Pega-Landing-Decision-DDF"), ImmutablePropertyInfo.TYPE_INTEGER, tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "Index")) : 0));
}
{
    pega.setViaPropRef(".pyRuleSetName", pRef_47, myStepPage, "PegaMKT-Engine", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyNumberOfRequestors", pRef_48, myStepPage, 3, "sNN", false, true);
}
{
    tools.putParamValue("FlushTimeThreshold", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/threshold/WriteToFileThresholdInSeconds" }));
}
{
    pega.setViaPropRef(".pyResilience.pyFlushTimeThreshold", pRef_49, myStepPage, com.pega.pegarules.priv.FUAUtil.parseInt(((!(tools.getParamValue("FlushTimeThreshold").equals(""))) ? tools.getParamValue("FlushTimeThreshold") : "900")), "sNN", false, true);
}
{
    pega.setViaPropRef(".pyResilience.pyFlushThreshold", pRef_50, myStepPage, "2000000", "sNN", false, true);
}
{
    pega.setViaPropRef(".pyWorkObjectID", pRef_51, myStepPage, ((pega.<Boolean>resolveMethodCall("pxIsBlank--(String)", "pxIsBlank", null, "String", new Object[] { tools.getParamValue("CustomRunID") })).booleanValue() ? "pzWriteUsageData" : tools.getParamValue("CustomRunID")), "sTN", false, true);
}
{
    tools.putParamValue("runID", PropertyInfo.TYPE_TEXT, scalarValueQuery_52.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
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
 * To decide whether to skip the run creation.
 * <p>
 * Step 12 <code>Property-Set</code> [on page RunOptions] <br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(Param.ExistingFlushTimeThreshold&gt;0 &amp;&amp; .pyResilience.pyFlushTimeThreshold!=Param.ExistingFlushTimeThreshold)");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("(Param.ExistingFlushTimeThreshold>0 && .pyResilience.pyFlushTimeThreshold!=Param.ExistingFlushTimeThreshold)", "FUAInstance-NullMyStepPage");
}
boolean pz_55 = ((tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "ExistingFlushTimeThreshold") > 0) && (scalarValueQuery_54.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER) != tools.getParamAsInteger(PropertyInfo.TYPE_INTEGER, "ExistingFlushTimeThreshold")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(Param.ExistingFlushTimeThreshold&gt;0 &amp;&amp; .pyResilience.pyFlushTimeThreshold!=Param.ExistingFlushTimeThreshold)",pz_55);
if (!pz_55) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(Param.ExistingFlushTimeThreshold&gt;0 &amp;&amp; .pyResilience.pyFlushTimeThreshold!=Param.ExistingFlushTimeThreshold) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("SkipStartDF", PropertyInfo.TYPE_TEXT, "false");
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
 * Create a managed run.
 * <p>
 * Step 13 <code>Call pxStartRun</code> [on page RunOptions] <br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxStartRun");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\"");
try {
boolean pz_57 = (!(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/monitor/capturedecisionusage" }).equals("true")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\"",pz_57);
if (pz_57) {
// branch to block ACS
nextBlock = "ACS";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@DsmServices.pxHasFunctionalNodes(\"DataFlow\",\"RealTime\")");
try {
boolean pz_58 = (pega.<Boolean>resolveMethodCall("pxHasFunctionalNodes--(String,String)", "pxHasFunctionalNodes", null, "DsmServices", new Object[] { "DataFlow", "RealTime" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@DsmServices.pxHasFunctionalNodes(\"DataFlow\",\"RealTime\")",pz_58);
if (!pz_58) {
// branch to block CLEAN
nextBlock = "CLEAN";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@DsmServices.pxHasFunctionalNodes(\"DataFlow\",\"RealTime\") " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!@IsInPageList(\"In progress\",\".pyStatus\",WriteUsageData.pyRealTimeRunsList)");
try {
boolean pz_59 = ((!(pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { "In progress", ".pyStatus", pega.findPageWithException("WriteUsageData", "Pega-Landing-Decision-DDF").getProperty("pyRealTimeRunsList") })).booleanValue()));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!@IsInPageList(\"In progress\",\".pyStatus\",WriteUsageData.pyRealTimeRunsList)",pz_59);
if (pz_59) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!@IsInPageList(\"In progress\",\".pyStatus\",WriteUsageData.pyRealTimeRunsList) " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.SkipStartDF==\"false\"");
try {
boolean pz_60 = (tools.getParamValue("SkipStartDF").equals("false"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.SkipStartDF==\"false\"",pz_60);
if (!pz_60) {
// branch to block CLEAN
nextBlock = "CLEAN";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.SkipStartDF==\"false\" " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxStartRun", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxStartRun
if (myStepPage == null) {
String pz_61 = "RunOptions";
myStepPage = tools.findPage(pz_61, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_61, false);
myStepPage.putString("pxObjClass", "Data-Decision-DDF-RunOptions");
}
}
// Calling Activity : pxStartRun
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxStartRun", "Data-DM-DecisionUsage", "");
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
boolean pz__11 = pega.invokeWhen("StepStatusFail", "Data-DM-DecisionUsage", "Data-Decision-DDF-RunOptions");
if (pz__11) {
// branch to block ERR
nextBlock = "ERR";
return false;
}
boolean pz__13 = pega.invokeWhen("hasMessages", "Data-DM-DecisionUsage", "Data-Decision-DDF-RunOptions");
if (pz__13) {
// branch to block ERR
nextBlock = "ERR";
return false;
} else {
// branch to block CLEAN
nextBlock = "CLEAN";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxStartRun",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step13_circum0 definition

/**
 * Log errors if any and...
 * <p>
 * Step 14 [ERR] <code>Log-Message</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: @getWorstMessage(tools)
if( oLog.isDebugEnabled() ){
oLog.debug(pega.<String>resolveMethodCall("getWorstMessage--(PublicAPI)", "getWorstMessage", null, null, new Object[] { tools }));
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
pz_CurrentStepNum = "14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * Attempt to delete the corrupted run and re-create a fresh one.
 * <p>
 * Step 15 <code>Call pzDeleteAndRecreate</code><br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzDeleteAndRecreate");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzDeleteAndRecreate", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzDeleteAndRecreate
if (myStepPage == null) {
}
// Calling Activity : pzDeleteAndRecreate
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzDeleteAndRecreate", "Data-DM-DecisionUsage", "");
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
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzDeleteAndRecreate",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * ...clear activity status.
 * <p>
 * Step 16 [ACS] <code>Activity-Clear-Status</code><br>
 */
public boolean step16_circum0() {
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
pz_CurrentStepNum = "16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

/**
 * Delete the run if capture decision usage feature is disabled.
 * <p>
 * Step 17 <code>Call pzDeleteRun</code><br>
 */
public boolean step17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzDeleteRun");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\"");
try {
boolean pz_62 = (!(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-DecisionEngine", "decision/usage/monitor/capturedecisionusage" }).equals("true")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\"",pz_62);
if (!pz_62) {
// branch to block CLEAN
nextBlock = "CLEAN";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@getDataSystemSetting(\"Pega-DecisionEngine\",\"decision/usage/monitor/capturedecisionusage\")!=\"true\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.runID!=\"\"");
try {
boolean pz_63 = (!(tools.getParamValue("runID").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.runID!=\"\"",pz_63);
if (!pz_63) {
// branch to block CLEAN
nextBlock = "CLEAN";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.runID!=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzDeleteRun", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzDeleteRun
if (myStepPage == null) {
}
// Calling Activity : pzDeleteRun
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzDeleteRun", "Data-DM-DecisionUsage", "");
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
boolean pz__15 = pega.invokeWhen("StepStatusFail", "Data-DM-DecisionUsage", "Data-DM-DecisionUsage");
if (!pz__15) {
// branch to block CLEAN
nextBlock = "CLEAN";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzDeleteRun",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

/**
 * Log message.
 * <p>
 * Step 18 <code>Log-Message</code><br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: @getWorstMessage(tools)
if( oLog.isDebugEnabled() ){
oLog.debug(pega.<String>resolveMethodCall("getWorstMessage--(PublicAPI)", "getWorstMessage", null, null, new Object[] { tools }));
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
pz_CurrentStepNum = "18";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

/**
 * Step 19 <code>Activity-Clear-Status</code><br>
 */
public boolean step19_circum0() {
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
pz_CurrentStepNum = "19";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * Cleanup.
 * <p>
 * Step 20 [CLEAN] <code>Page-Remove</code><br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: LoadRealTimeRuns
pageRemove(tools.findPage("LoadRealTimeRuns"));
// Expression: WriteUsageData
pageRemove(tools.findPage("WriteUsageData"));
// Expression: RunOptions
pageRemove(tools.findPage("RunOptions"));
// Expression: DataSetPage
pageRemove(tools.findPage("DataSetPage"));
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
pz_CurrentStepNum = "20";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_circum0 definition

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

public String errorMessage = "";

public void initializeUserLocalVariables() {
	errorMessage = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("errorMessage", (errorMessage == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : errorMessage.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_45 = new String[] { "", "", "pyServiceInstanceName", "" };
public static final String[] pRef_38 = new String[] { "", "", "pyAppliesTo", "" };
public static final String[] pRef_42 = new String[] { "", "", "pyIsRealTimeRun", "" };
public static final String[] pRef_44 = new String[] { "", "", "pyDeleteRunAfterExecution", "" };
public static final String[] pRef_43 = new String[] { "", "", "pyIsTestRun", "" };
public static final String[] pRef_41 = new String[] { "", "", "pyUseDetailedMetrics", "" };
public static final String[] pRef_47 = new String[] { "", "", "pyRuleSetName", "" };
public static final String[] pRef_39 = new String[] { "", "", "pyRuleName", "" };
public static final String[] pRef_48 = new String[] { "", "", "pyNumberOfRequestors", "" };
public static final String[] pRef_50 = new String[] { "", "", "pyResilience", "", "pyFlushThreshold", "" };
public static final String[] pRef_24 = new String[] { "", "", "pyOptions", "", "pyRuleName", "" };
public static final String[] pRef_51 = new String[] { "", "", "pyWorkObjectID", "" };
public static final String[] pRef_40 = new String[] { "", "", "pyIsManaged", "" };
public static final String[] pRef_49 = new String[] { "", "", "pyResilience", "", "pyFlushTimeThreshold", "" };
public static final String[] pRef_23 = new String[] { "", "", "pyOptions", "", "pyAppliesTo", "" };
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().page("pyOptions").scalarProperty("pyRuleName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().pageList("pyRealTimeRunsList").page("pyOptions").page("pyResilience").scalarProperty("pyFlushTimeThreshold").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_30 = FUAUtil.createQueryBuilder().scalarProperty("pyWorkObjectId").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_28 = FUAUtil.createQueryBuilder().scalarProperty("pyStatus").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().page("pyOptions").scalarProperty("pyAppliesTo").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_52 = FUAUtil.createQueryBuilder().scalarProperty("pyWorkObjectID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_54 = FUAUtil.createQueryBuilder().page("pyResilience").scalarProperty("pyFlushTimeThreshold").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-DM-DECISIONUSAGE PZEXECUTEWRITEUSAGEDATAFLOW #20230618T003558.671 GMT", "Data-DM-DecisionUsage pzExecuteWriteUsageDataFlow", "Pega-DecisionEngine", "08-23-01", false, true, "", "ACTIVITY", "20230618T003558.671 GMT" ,"Rule-Obj-Activity"); }
