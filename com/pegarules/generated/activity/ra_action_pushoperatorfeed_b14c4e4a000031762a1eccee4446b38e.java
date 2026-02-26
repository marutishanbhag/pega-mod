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
import com.pega.pegarules.priv.factory.ThreadLocalStringMapFactoryImpl;
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
public class ra_action_pushoperatorfeed_b14c4e4a000031762a1eccee4446b38e extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.PushOperatorFeed.Data_Admin_Operator_ID.Action");
	public ra_action_pushoperatorfeed_b14c4e4a000031762a1eccee4446b38e(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT	PegaAESRemote:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT";
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
String pz_2 = "AlertPage";
thisStepPage = tools.findPage(pz_2, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 1 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_4 = "AlertData";
thisStepPage = tools.findPage(pz_4, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 2 Circum: 0" );
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
String pz_6 = "AlertPage";
thisStepPage = tools.findPage(pz_6, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_6, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 5 Circum: 0" );
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
String pz_10 = "AESRemoteConnection";
thisStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 8 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_15 = "QueryInputs";
thisStepPage = tools.findPage(pz_15, true);
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 9 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_17 = "QueryInputs";
thisStepPage = tools.findPage(pz_17, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_17, false);
thisStepPage.putString("pxObjClass", "Embed-QueryInputs");
}
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 10 Circum: 0" );
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
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 11 Circum: 0" );
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 13_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
// all the steps that are defined to be in block :  will be defined with this repeat loop
ClipboardPage myStepPage = tools.getStepPage();
// Expression: 1
// Expression: Local.PageCount
// Expression: 1
if (1 <= 0) {
throw new PRRuntimeException("Invalid increment value - must be a positive integer");}
for (forEachCounter = 1;(forEachCounter <= PageCount) && (pz_Status == true) && ((nextBlock.equals("")) || (nextBlock.equals("")))
; forEachCounter = forEachCounter + 1)
{
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_0_circum0");
}
PRStackFrame pz_StackFrame13_0_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_0 Circum: 0" );
try {
pz_Status = step13_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
}//close the for loop
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 14_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("UPDATE"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 15_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("RDFAIL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_83 = "AlertPage";
thisStepPage = tools.findPage(pz_83, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_83, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PUSHFAIL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_86 = "AlertPage";
thisStepPage = tools.findPage(pz_86, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_86, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 16 Circum: 0" );
try {
pz_Status = step16_circum0();
} finally {
pega.popStackFrame(pz_StackFrame16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 17_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PUSHALERT"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 17_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_87 = "AlertData";
thisStepPage = tools.findPage(pz_87, true);
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 17 Circum: 0" );
try {
pz_Status = step17_circum0();
} finally {
pega.popStackFrame(pz_StackFrame17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 18_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 18_circum0");
}
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 18 Circum: 0" );
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
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 19 Circum: 0" );
try {
pz_Status = step19_circum0();
} finally {
pega.popStackFrame(pz_StackFrame19_circum0, false);
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
	"Rule-Obj-Activity:PUSHOPERATORFEED"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PUSHOPERATORFEED","Rule-Obj-Activity","DATA-ADMIN-OPERATOR-ID",false,"","PegaAESRemote","08-23-01","RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT","!PUSHOPERATORFEED",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",175566782)
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
//	RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT:20230619T005636.700 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "d92c02e8fe13fedc28c015c436a40557";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Operator-ID";
	}
public String getAspect() {
return "Action";
}
/**
 * Creating a new page AlertPage.
 * <p>
 * Step 1 <code>Page-New</code> [on page AlertPage] <br>
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
String pz_3 = "AlertPage";
myStepPage = tools.findPage(pz_3, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","AlertPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("AlertPage", myStepPage);
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
 * Creating a new page AlertDataPage.
 * <p>
 * Step 2 <code>Page-New</code> [on page AlertData] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("IsLicenseUsageDataCapturingEnabled", "Data-Admin-Operator-ID", "PegaAESRemote-Interface-UsageData");
if (!pz__1) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PushOperatorFeed - Precondition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_5 = "AlertData";
myStepPage = tools.findPage(pz_5, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("PegaAESRemote-Interface-UsageData","AlertData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("AlertData", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Creating a parameter for Alerts.
 * <p>
 * Step 3 <code>Property-Set</code> [on page AlertPage] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("alertJson", PropertyInfo.TYPE_TEXT, "");
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
 * Set pdcServiceURL.
 * <p>
 * Step 4 <code>Property-Set</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("pdcServiceURL", PropertyInfo.TYPE_TEXT, "PegaAES/v1/UsageData");
}
{
    tools.putParamValue("servicename", PropertyInfo.TYPE_TEXT, "PushOperatorDataToPDC");
}
{
    tools.putParamValue("message", PropertyInfo.TYPE_TEXT, "PegaAESRemote : Push operator Data Info message is");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Get the End point URL, exit if it is blank.
 * <p>
 * Step 5 <code>Property-Set</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\"");
try {
boolean pz_8 = (pega.<String>resolveMethodCall("trim--(String)", "trim", null, null, new Object[] { scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("D_ResourceConfiguration", "PegaAESRemote-"), ImmutablePropertyInfo.TYPE_TEXT) }).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\"",pz_8);
if (pz_8) {
// branch to block PR
nextBlock = "PR";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@trim(D_ResourceConfiguration.RESTEndPointURL)==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("endpointurl", PropertyInfo.TYPE_TEXT, scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("D_ResourceConfiguration", "PegaAESRemote-"), ImmutablePropertyInfo.TYPE_TEXT));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Find the appenders, if the node connected to AES or not.
 * <p>
 * Step 6 <code>Call CheckAESConnection</code> [on page AESRemoteConnection] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call CheckAESConnection");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call CheckAESConnection", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call CheckAESConnection
if (myStepPage == null) {
String pz_11 = "AESRemoteConnection";
myStepPage = tools.findPage(pz_11, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_11, false);
myStepPage.putString("pxObjClass", "PegaAESRemote-");
}
}
// Calling Activity : CheckAESConnection
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "CheckAESConnection", "Data-Admin-Operator-ID", "");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.SkipThisRun==\"true\"");
try {
boolean pz_12 = (tools.getParamValue("SkipThisRun").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.SkipThisRun==\"true\"",pz_12);
if (pz_12) {
// branch to block PR
nextBlock = "PR";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.SkipThisRun==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call CheckAESConnection",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Set the DSS and ruleset in local variables for reuse.
 * <p>
 * Step 7 <code>Property-Set</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    aesruleset = "PegaAESRemote";
}
{
    chunklimitdss = "pega/analytics/chunklimit";
}
{
    lastrundatedss = "pega/analytics/operatorsagentlastrundate";
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
 * Save DSS if it doesn't exist.
 * <p>
 * Step 8 <code>Call pxSetDynamicSystemSetting</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.chunklimitdss,\"\")");
try {
boolean pz_13 = (pega.<Boolean>resolveMethodCall("pxRecordExists--(String,String,String,String)", "pxRecordExists", null, null, new Object[] { "Data-Admin-System-Settings", aesruleset, chunklimitdss, "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.chunklimitdss,\"\")",pz_13);
if (pz_13) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pxRecordExists(\"Data-Admin-System-Settings\",local.aesruleset,local.chunklimitdss,\"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxSetDynamicSystemSetting", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxSetDynamicSystemSetting
if (myStepPage == null) {
}
// Calling Activity : pxSetDynamicSystemSetting

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: local.aesruleset
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, aesruleset);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: local.chunklimitdss
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, chunklimitdss);
// Expression: 500
String pz_14 = Integer.toString(500);
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, pz_14);

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "Data-Admin-Operator-ID", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Used for pagination.
 * <p>
 * Step 9 <code>Page-New</code> [on page QueryInputs] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_16 = "QueryInputs";
myStepPage = tools.findPage(pz_16, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Embed-QueryInputs","QueryInputs",false); 
// primary page will not be added to PageList
	 pega.setStepPage("QueryInputs", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Initialize page details, latest run date, customerid and deploymentname.
 * <p>
 * Step 10 <code>Property-Set</code> [on page QueryInputs] <br>
 */
public boolean step10_circum0() {
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
    pega.setViaPropRef(".pyPagingSettings.pyPagingEnabled", pRef_18, myStepPage, true, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyPagingSettings.pyPageSize", pRef_19, myStepPage, (((pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, "String", new Object[] { pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, "Utilities", new Object[] { aesruleset, chunklimitdss }) })).intValue() == 0) ? 500 : (pega.<Integer>resolveMethodCall("toInt--(String)", "toInt", null, "String", new Object[] { pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, "Utilities", new Object[] { aesruleset, chunklimitdss }) })).intValue()), "sNN", false, true);
}
{
    pega.setViaPropRef(".pyPagingSettings.pyPageIndex", pRef_20, myStepPage, 1, "sNN", false, true);
}
{
    pega.setViaPropRef(".pyPagingSettings.pyReturnResultCount", pRef_21, myStepPage, true, "sSN", false, true);
}
{
    rundate = PRDateFormat.formatInternalDate(new java.util.Date());
}
{
    islastpublishsuccess = true;
}
{
    customerid = scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("D_pzEnvironmentDetails", "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT);
}
{
    deploymentname = scalarValueQuery_23.resolveToString(tools, pega.findPageWithException("D_pzEnvironmentDetails", "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT);
}
{
    deploymentTopology = scalarValueQuery_24.resolveToString(tools, pega.findPageWithException("D_pzEnvironmentDetails", "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT);
}
{
    platformVersion = scalarValueQuery_25.resolveToString(tools, pega.findPageWithException("D_pzEnvironmentDetails", "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT);
}
{
    productionLevel = scalarValueQuery_26.resolveToString(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_INTEGER);
}
{
    environmentName = scalarValueQuery_23.resolveToString(tools, pega.findPageWithException("D_pzEnvironmentDetails", "@baseclass"), ImmutablePropertyInfo.TYPE_TEXT);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Setting deployment topology for cloudK.
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__3 = pega.invokeWhen("pzIsPegaCloud", "Data-Admin-Operator-ID", "Data-Admin-Operator-ID");
if (!pz__3) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    deploymentTopology = "PegaCloud";
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
 * Set parameters for RD.
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
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Data-Admin-Operator-ID");
}
{
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "FetchOperatorData");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "UsageData");
}
{
    tools.putParamValue("lastSuccessfulRunDate", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, "Utilities", new Object[] { aesruleset, lastrundatedss }));
}
{
    tools.putParamValue("lastSuccessfulRunDate", PropertyInfo.TYPE_TEXT, (((((pega.<Integer>resolveMethodCall("length--(String)", "length", null, null, new Object[] { tools.getParamValue("lastSuccessfulRunDate") })).intValue()) != 0) ? true : false) ? tools.getParamValue("lastSuccessfulRunDate") : pega.<String>resolveMethodCall("addToDate--(String,String,String,String,String)", "addToDate", null, null, new Object[] { PRDateFormat.formatInternalDate(new java.util.Date()), Integer.toString(((-14))), Integer.toString(0), Integer.toString(0), Integer.toString(0) })));
}
{
    operatorIndex = 0;
}
{
    commonIndex = 0;
}
{
    index = 0;
}
{
    PageIndex = 1;
}
{
    PageCount = 2;
}
{
    tools.putParamValue("pyReportParamPageName", PropertyInfo.TYPE_TEXT, "QueryInputs");
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
 * Loop for pagination.
 * <p>
 * Step 13.0 <code>Java</code><br>
 */
public boolean step13_0_circum0() {
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

// Code to call nested step 13_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_1_circum0");
}
PRStackFrame pz_StackFrame13_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_2_circum0");
}
String pz_27 = "UsageData";
nestedStepPage = tools.findPage(pz_27, true);
PRStackFrame pz_StackFrame13_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_3_circum0");
}
String pz_28 = "RDPage";
nestedStepPage = tools.findPage(pz_28, true);
PRStackFrame pz_StackFrame13_3_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_0_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("LOOP"))) {
nextBlock = "";
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_29 = pega.findPageWithException("UsageData", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_29;
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
if ( "Data-Admin-Operator-ID".equals(pz_thisPageClass)
|| pz_Dictionary.getClassInfo("Data-Admin-Operator-ID").isAncestorOf(pz_thisPageClass)
) {
if (pz_Status == true && (nextBlock.equals("") || nextBlock.equals("LOOP"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_0_circum0");
}
PRStackFrame pz_StackFrame13_4_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_0 Circum: 0" );
try {
pz_Status = step13_4_0_circum0_Data_Admin_Operator_ID();
} finally {
pega.popStackFrame(pz_StackFrame13_4_0_circum0, false);
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

// Code to call nested step 13_5_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_5_circum0");
}
String pz_30 = "UsageData";
nestedStepPage = tools.findPage(pz_30, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_30, false);
nestedStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame13_5_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_5_circum0, false);
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
pz_CurrentStepNum = "13.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_0_circum0 definition

/**
 * resetting the index.
 * <p>
 * Step 13.1 <code>Property-Set</code><br>
 */
public boolean step13_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    index = 0;
}
{
    operatorIndex = 0;
}
{
    commonIndex = 0;
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
pz_CurrentStepNum = "13.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_1_circum0 definition

/**
 * Page for RD results.
 * <p>
 * Step 13.2 <code>Page-New</code> [on page UsageData] <br>
 */
public boolean step13_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_31 = "UsageData";
myStepPage = tools.findPage(pz_31, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","UsageData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("UsageData", myStepPage);
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
pz_CurrentStepNum = "13.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_2_circum0 definition

/**
 * Call FetchOperatorData RD to get operator details.
 * <p>
 * Step 13.3 <code>Call pxRetrieveReportData</code> [on page RDPage] <br>
 */
public boolean step13_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxRetrieveReportData");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxRetrieveReportData
if (myStepPage == null) {
String pz_32 = "RDPage";
myStepPage = tools.findPage(pz_32, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_32, false);
myStepPage.putString("pxObjClass", "Rule-Obj-Report-Definition");
}
}
// Calling Activity : pxRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "Data-Admin-Operator-ID", "");
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
boolean pz__5 = pega.invokeWhen("StepStatusFail", "Data-Admin-Operator-ID", "Rule-Obj-Report-Definition");
if (pz__5) {
// branch to block RDFAIL
nextBlock = "RDFAIL";
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "UsageData.pxTotalResultCount==0");
try {
boolean pz_34 = (scalarValueQuery_33.resolveToInt(tools, pega.findPageWithException("UsageData", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT) == 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "UsageData.pxTotalResultCount==0",pz_34);
if (pz_34) {
// branch to block UPDATE
nextBlock = "UPDATE";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("UsageData.pxTotalResultCount==0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "13.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_3_circum0 definition

/**
 * Looping through RD results.
 * <p>
 * Step 13.4.0 [LOOP] <code>Java</code> [on page UsageData.pxResults] <br>
 */
public boolean step13_4_0_circum0_Data_Admin_Operator_ID() {
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

// Code to call nested step 13_4_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_1_circum0");
}
PRStackFrame pz_StackFrame13_4_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_2_circum0");
}
String pz_35 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_35, true);
PRStackFrame pz_StackFrame13_4_2_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_2 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_2_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_3_circum0");
}
PRStackFrame pz_StackFrame13_4_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_4_circum0");
}
String pz_36 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_36, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_36, false);
nestedStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame13_4_4_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_4 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_4_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_5_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("NEST"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.5";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_5_circum0");
}
PRStackFrame pz_StackFrame13_4_5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_5 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_5_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_5_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_6_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PUSH"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.6";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_6_circum0");
}
PRStackFrame pz_StackFrame13_4_6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_6 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_6_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_7_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_7_circum0");
}
String pz_37 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_37, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_37, false);
nestedStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame13_4_7_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_7 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_7_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_8_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_8_circum0");
}
String pz_38 = "PData";
nestedStepPage = tools.findPage(pz_38, true);
PRStackFrame pz_StackFrame13_4_8_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_8 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_8_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_9_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_9_circum0");
}
String pz_39 = "PData";
nestedStepPage = tools.findPage(pz_39, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_39, false);
nestedStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData");
}
PRStackFrame pz_StackFrame13_4_9_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_9 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_9_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_9_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_10_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.10";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_10_circum0");
}
String pz_40 = "PData";
nestedStepPage = tools.findPage(pz_40, true);
PRStackFrame pz_StackFrame13_4_10_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_10 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_10_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_11_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_11_circum0");
}
PRStackFrame pz_StackFrame13_4_11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_11 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_11_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_11_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_12_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.12";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_12_circum0");
}
PRStackFrame pz_StackFrame13_4_12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_12 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_12_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_13_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_13_circum0");
}
String pz_41 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_41, true);
PRStackFrame pz_StackFrame13_4_13_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_13 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_13_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_14_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_14_circum0");
}
PRStackFrame pz_StackFrame13_4_14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_14 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_14_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_15_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_15_circum0");
}
String pz_42 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_42, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_42, false);
nestedStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame13_4_15_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_15 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_15_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_16_circum0");
}
PRStackFrame pz_StackFrame13_4_16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_16 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_16_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_16_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_17_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.17";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_17_circum0");
}
PRStackFrame pz_StackFrame13_4_17_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_17 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_17_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_18_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_18_circum0");
}
String pz_43 = "DailyUsageData";
nestedStepPage = tools.findPage(pz_43, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_43, false);
nestedStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame13_4_18_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_18 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_18_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_18_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_19_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.19";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_19_circum0");
}
String pz_44 = "PData";
nestedStepPage = tools.findPage(pz_44, true);
PRStackFrame pz_StackFrame13_4_19_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_19 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_19_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_19_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_20_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.20";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_20_circum0");
}
String pz_45 = "PData";
nestedStepPage = tools.findPage(pz_45, true);
if (nestedStepPage == null) {
nestedStepPage = tools.findPage(pz_45, false);
nestedStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData");
}
PRStackFrame pz_StackFrame13_4_20_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_20 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_20_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_20_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_21_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.21";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_21_circum0");
}
String pz_46 = "PData";
nestedStepPage = tools.findPage(pz_46, true);
PRStackFrame pz_StackFrame13_4_21_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_21 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_21_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_21_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 13_4_22_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13.4.22";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_4_22_circum0");
}
PRStackFrame pz_StackFrame13_4_22_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT Step: 13_4_22 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step13_4_22_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame13_4_22_circum0, false);
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
pz_CurrentStepNum = "13.4.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_0_circum0_Data_Admin_Operator_ID definition

/**
 * Set the mandatory parameters.
 * <p>
 * Step 13.4.1 <code>Property-Set</code><br>
 */
public boolean step13_4_1_circum0() {
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
    pega.setViaPropRef(".pxCustomerID", pRef_47, myStepPage, customerid, "sTY", false, true);
}
{
    pega.setViaPropRef(".EnvironmentName", pRef_48, myStepPage, environmentName, "sTN", false, true);
}
{
    pega.setViaPropRef(".pxDeploymentTopology", pRef_49, myStepPage, ((!(deploymentTopology.equals("PegaCloud"))) ? "OnPrem" : deploymentTopology), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxPlatformVersion", pRef_50, myStepPage, platformVersion, "sTY", false, true);
}
{
    pega.setViaPropRef(".pyCategory", pRef_51, myStepPage, productionLevel, "sTN", false, true);
}
{
    pega.setViaPropRef(".IsLicenseData", pRef_52, myStepPage, "True", "sSN", false, true);
}
{
    pega.setViaPropRef(".EventType", pRef_53, myStepPage, "OP-DTLS", "sTN", false, true);
}
{
    pega.setViaPropRef(".EventDate", pRef_54, myStepPage, com.pega.pegarules.priv.FUAUtil.parseStringAsDate(pega, PRDateFormat.formatInternalDate(new java.util.Date())), "sDN", false, true);
}
{
    tools.putParamValue("eventDate", PropertyInfo.TYPE_TEXT, scalarValueQuery_55.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATE));
}
{
    operatorIndex = (operatorIndex + 1);
}
{
    index = (index + 1);
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
pz_CurrentStepNum = "13.4.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_1_circum0 definition

/**
 * Creating a new page to copy the relevant data from usage data.
 * <p>
 * Step 13.4.2 <code>Page-New</code> [on page DailyUsageData] <br>
 */
public boolean step13_4_2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.commonIndex==0");
try {
boolean pz_56 = (commonIndex == 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.commonIndex==0",pz_56);
if (!pz_56) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.commonIndex==0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_57 = "DailyUsageData";
myStepPage = tools.findPage(pz_57, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","DailyUsageData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("DailyUsageData", myStepPage);
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
pz_CurrentStepNum = "13.4.2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_2_circum0 definition

/**
 * Incrementing the common index and resetting the operator index.
 * <p>
 * Step 13.4.3 <code>Property-Set</code><br>
 */
public boolean step13_4_3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.commonIndex==0");
try {
boolean pz_58 = (commonIndex == 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.commonIndex==0",pz_58);
if (pz_58) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.commonIndex==0 " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.operatorIndex&gt;10");
try {
boolean pz_59 = (operatorIndex > 10);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.operatorIndex&gt;10",pz_59);
if (!pz_59) {
// branch to block NEST
nextBlock = "NEST";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.operatorIndex&gt;10 " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    commonIndex = (commonIndex + 1);
}
{
    operatorIndex = 1;
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.commonIndex&gt;50");
try {
boolean pz_60 = (commonIndex > 50);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.commonIndex&gt;50",pz_60);
if (pz_60) {
// branch to block PUSH
nextBlock = "PUSH";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.commonIndex&gt;50 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "13.4.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_3_circum0 definition

/**
 * Set the common properties.
 * <p>
 * Step 13.4.4 <code>Property-Set</code> [on page DailyUsageData] <br>
 */
public boolean step13_4_4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").pxCustomerID", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "pxCustomerID", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), customerid, "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EnvironmentName", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EnvironmentName", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), environmentName, "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").pxDeploymentTopology", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "pxDeploymentTopology", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), ((!(deploymentTopology.equals("PegaCloud"))) ? "OnPrem" : deploymentTopology), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").pxPlatformVersion", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "pxPlatformVersion", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), platformVersion, "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").pyCategory", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "pyCategory", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), productionLevel, "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").IsLicenseData", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "IsLicenseData", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), "True", "sSN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventType", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventType", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), "OP-DTLS", "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventDate", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventDate", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), com.pega.pegarules.priv.FUAUtil.parseStringAsDate(pega, PRDateFormat.formatInternalDate(new java.util.Date())), "sDN", false, true);
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
pz_CurrentStepNum = "13.4.4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_4_circum0 definition

/**
 * Set the operator specific properties.
 * <p>
 * Step 13.4.5 [NEST] <code>Property-Set</code><br>
 */
public boolean step13_4_5_circum0() {
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
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyUserIdentifier", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyUserIdentifier", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), pega.<String>resolveMethodCall("pyGetMD5Hash--(String)", "pyGetMD5Hash", null, "Utilities", new Object[] { scalarValueQuery_61.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyOrganization", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyOrganization", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_62.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN32", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyOrgDivision", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyOrgDivision", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_63.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN32", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyOrgUnit", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyOrgUnit", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_64.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN32", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyLicenseType", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyLicenseType", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_65.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyDefaultTimeZone", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyDefaultTimeZone", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pzMCPAutogenerated", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pzMCPAutogenerated", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_67.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
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
pz_CurrentStepNum = "13.4.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_5_circum0 definition

/**
 * Forming the JSON and pushing the data.
 * <p>
 * Step 13.4.6 [PUSH] <code>Property-Set</code><br>
 */
public boolean step13_4_6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "UsageData.pxResultCount==local.index");
try {
boolean pz_69 = (scalarValueQuery_68.resolveToInt(tools, pega.findPageWithException("UsageData", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER) == index);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "UsageData.pxResultCount==local.index",pz_69);
if (pz_69) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("UsageData.pxResultCount==local.index " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.commonIndex&gt;50");
try {
boolean pz_70 = (commonIndex > 50);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.commonIndex&gt;50",pz_70);
if (!pz_70) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.commonIndex&gt;50 " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("executionMode", PropertyInfo.TYPE_TEXT, "SERIALIZE");
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
pz_CurrentStepNum = "13.4.6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_6_circum0 definition

/**
 * Get operators data JSON.
 * <p>
 * Step 13.4.7 <code>Apply-DataTransform</code> [on page DailyUsageData] <br>
 */
public boolean step13_4_7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: ConvertOperatorData
ParameterPage stepParams__1= null;/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "Data-Admin-Operator-ID";
}
StringMap params__1 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__1.putString("pxObjClass", "Rule-Obj-Model");
params__1.putString("pyClassName", modelClass);
params__1.putString("pyModelName", "ConvertOperatorData");
tools.applyModel(myStepPage, params__1, stepParams__1);
ThreadLocalStringMapFactoryImpl.getFactory().release(params__1);
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
pz_CurrentStepNum = "13.4.7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_7_circum0 definition

/**
 * Creating a new page for PDCRestPush.
 * <p>
 * Step 13.4.8 <code>Page-New</code> [on page PData] <br>
 */
public boolean step13_4_8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_71 = "PData";
myStepPage = tools.findPage(pz_71, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("PegaAESRemote-Interface-UsageData","PData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("PData", myStepPage);
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
pz_CurrentStepNum = "13.4.8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_8_circum0 definition

/**
 * Setting the pyNote params for PDCRestPush.
 * <p>
 * Step 13.4.9 <code>Property-Set</code> [on page PData] <br>
 */
public boolean step13_4_9_circum0() {
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
    pega.setViaPropRef(".pyNote", pRef_72, myStepPage, tools.getParamValue("jsonData"), "sTN", false, true);
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
pz_CurrentStepNum = "13.4.9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_9_circum0 definition

/**
 * Pushing data to PDC.
 * <p>
 * Step 13.4.10 <code>Call PDCRestPush</code> [on page PData] <br>
 */
public boolean step13_4_10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PDCRestPush");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call PDCRestPush", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call PDCRestPush
if (myStepPage == null) {
String pz_73 = "PData";
myStepPage = tools.findPage(pz_73, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_73, false);
myStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData");
}
}
// Calling Activity : PDCRestPush
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "PDCRestPush", "Data-Admin-Operator-ID", "");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "PData.pyHTTPResponseCode==\"\"||PData.pyHTTPResponseCode&gt;=400");
try {
boolean pz_75 = ((scalarValueQuery_74.resolveToString(tools, pega.findPageWithException("PData", "PegaAESRemote-Interface-UsageData"), ImmutablePropertyInfo.TYPE_INTEGER).equals("")) || (scalarValueQuery_74.resolveToInt(tools, pega.findPageWithException("PData", "PegaAESRemote-Interface-UsageData"), ImmutablePropertyInfo.TYPE_INTEGER) >= 400));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "PData.pyHTTPResponseCode==\"\"||PData.pyHTTPResponseCode&gt;=400",pz_75);
if (pz_75) {
// branch to block PUSHFAIL
nextBlock = "PUSHFAIL";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("PData.pyHTTPResponseCode==\"\"||PData.pyHTTPResponseCode&gt;=400 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "13.4.10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PDCRestPush",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_10_circum0 definition

/**
 * Log a success message.
 * <p>
 * Step 13.4.11 <code>Log-Message</code><br>
 */
public boolean step13_4_11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "Operator data has been pushed successfully"
if( oLog.isDebugEnabled() ){
oLog.debug("Operator data has been pushed successfully");
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
pz_CurrentStepNum = "13.4.11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_11_circum0 definition

/**
 * Resetting the common index and operator index if push has happened due to common index limit.
 * <p>
 * Step 13.4.12 <code>Property-Set</code><br>
 */
public boolean step13_4_12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.commonIndex&gt;50");
try {
boolean pz_76 = (commonIndex > 50);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.commonIndex&gt;50",pz_76);
if (!pz_76) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.commonIndex&gt;50 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    commonIndex = 0;
}
{
    operatorIndex = 0;
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
pz_CurrentStepNum = "13.4.12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_12_circum0 definition

/**
 * Creating the new page for the next set of data.
 * <p>
 * Step 13.4.13 <code>Page-New</code> [on page DailyUsageData] <br>
 */
public boolean step13_4_13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_77 = "DailyUsageData";
myStepPage = tools.findPage(pz_77, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","DailyUsageData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("DailyUsageData", myStepPage);
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
pz_CurrentStepNum = "13.4.13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_13_circum0 definition

/**
 * Setting the common index and the operator index.
 * <p>
 * Step 13.4.14 <code>Property-Set</code><br>
 */
public boolean step13_4_14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    commonIndex = (commonIndex + 1);
}
{
    operatorIndex = 1;
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
pz_CurrentStepNum = "13.4.14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_14_circum0 definition

/**
 * Set the common properties.
 * <p>
 * Step 13.4.15 <code>Property-Set</code> [on page DailyUsageData] <br>
 */
public boolean step13_4_15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").pxCustomerID", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "pxCustomerID", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), customerid, "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EnvironmentName", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EnvironmentName", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), environmentName, "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").pxDeploymentTopology", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "pxDeploymentTopology", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), ((!(deploymentTopology.equals("PegaCloud"))) ? "OnPrem" : deploymentTopology), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").pxPlatformVersion", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "pxPlatformVersion", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), platformVersion, "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").pyCategory", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "pyCategory", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), productionLevel, "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").IsLicenseData", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "IsLicenseData", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), "True", "sSN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventType", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventType", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), "OP-DTLS", "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventDate", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventDate", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), com.pega.pegarules.priv.FUAUtil.parseStringAsDate(pega, PRDateFormat.formatInternalDate(new java.util.Date())), "sDN", false, true);
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
pz_CurrentStepNum = "13.4.15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_15_circum0 definition

/**
 * Set the operator specific properties.
 * <p>
 * Step 13.4.16 <code>Property-Set</code><br>
 */
public boolean step13_4_16_circum0() {
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
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyUserIdentifier", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyUserIdentifier", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), pega.<String>resolveMethodCall("pyGetMD5Hash--(String)", "pyGetMD5Hash", null, "Utilities", new Object[] { scalarValueQuery_61.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyOrganization", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyOrganization", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_62.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN32", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyOrgDivision", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyOrgDivision", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_63.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN32", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyOrgUnit", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyOrgUnit", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_64.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN32", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyLicenseType", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyLicenseType", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_65.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pyDefaultTimeZone", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pyDefaultTimeZone", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(" + commonIndex + ").EventData(" + operatorIndex + ").pzMCPAutogenerated", new String[] { "", "", "pxResults", String.valueOf(commonIndex), "EventData", String.valueOf(operatorIndex), "pzMCPAutogenerated", "" }, pega.findPageWithException("DailyUsageData", "Code-Pega-List"), scalarValueQuery_67.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
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
pz_CurrentStepNum = "13.4.16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_16_circum0 definition

/**
 * Forming the JSON and pushing the data if the current record is the last record.
 * <p>
 * Step 13.4.17 <code>Property-Set</code><br>
 */
public boolean step13_4_17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "UsageData.pxResultCount==local.index");
try {
boolean pz_78 = (scalarValueQuery_68.resolveToInt(tools, pega.findPageWithException("UsageData", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER) == index);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "UsageData.pxResultCount==local.index",pz_78);
if (!pz_78) {
// skip / exit this iteration
pega.activityStepSkipped("Exit Iteration");
statusReturnedFromNestedLoop="EXIT_ITER";
return true;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("UsageData.pxResultCount==local.index " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("executionMode", PropertyInfo.TYPE_TEXT, "SERIALIZE");
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
pz_CurrentStepNum = "13.4.17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_17_circum0 definition

/**
 * Get operators data JSON.
 * <p>
 * Step 13.4.18 <code>Apply-DataTransform</code> [on page DailyUsageData] <br>
 */
public boolean step13_4_18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: ConvertOperatorData
ParameterPage stepParams__2= null;/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "Data-Admin-Operator-ID";
}
StringMap params__2 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__2.putString("pxObjClass", "Rule-Obj-Model");
params__2.putString("pyClassName", modelClass);
params__2.putString("pyModelName", "ConvertOperatorData");
tools.applyModel(myStepPage, params__2, stepParams__2);
ThreadLocalStringMapFactoryImpl.getFactory().release(params__2);
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
pz_CurrentStepNum = "13.4.18";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_18_circum0 definition

/**
 * Creating a new page for PDCRestPush.
 * <p>
 * Step 13.4.19 <code>Page-New</code> [on page PData] <br>
 */
public boolean step13_4_19_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_79 = "PData";
myStepPage = tools.findPage(pz_79, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("PegaAESRemote-Interface-UsageData","PData",false); 
// primary page will not be added to PageList
	 pega.setStepPage("PData", myStepPage);
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
pz_CurrentStepNum = "13.4.19";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_19_circum0 definition

/**
 * Setting the pyNote params for PDCRestPush.
 * <p>
 * Step 13.4.20 <code>Property-Set</code> [on page PData] <br>
 */
public boolean step13_4_20_circum0() {
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
    pega.setViaPropRef(".pyNote", pRef_72, myStepPage, tools.getParamValue("jsonData"), "sTN", false, true);
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
pz_CurrentStepNum = "13.4.20";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_20_circum0 definition

/**
 * Pushing data to PDC.
 * <p>
 * Step 13.4.21 <code>Call PDCRestPush</code> [on page PData] <br>
 */
public boolean step13_4_21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PDCRestPush");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call PDCRestPush", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call PDCRestPush
if (myStepPage == null) {
String pz_80 = "PData";
myStepPage = tools.findPage(pz_80, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_80, false);
myStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData");
}
}
// Calling Activity : PDCRestPush
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "PDCRestPush", "Data-Admin-Operator-ID", "");
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "PData.pyHTTPResponseCode==\"\"||PData.pyHTTPResponseCode&gt;=400");
try {
boolean pz_81 = ((scalarValueQuery_74.resolveToString(tools, pega.findPageWithException("PData", "PegaAESRemote-Interface-UsageData"), ImmutablePropertyInfo.TYPE_INTEGER).equals("")) || (scalarValueQuery_74.resolveToInt(tools, pega.findPageWithException("PData", "PegaAESRemote-Interface-UsageData"), ImmutablePropertyInfo.TYPE_INTEGER) >= 400));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "PData.pyHTTPResponseCode==\"\"||PData.pyHTTPResponseCode&gt;=400",pz_81);
if (pz_81) {
// branch to block PUSHFAIL
nextBlock = "PUSHFAIL";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("PData.pyHTTPResponseCode==\"\"||PData.pyHTTPResponseCode&gt;=400 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "13.4.21";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PDCRestPush",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_21_circum0 definition

/**
 * Log a success message.
 * <p>
 * Step 13.4.22 <code>Log-Message</code><br>
 */
public boolean step13_4_22_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "Operator data has been pushed successfully"
if( oLog.isDebugEnabled() ){
oLog.debug("Operator data has been pushed successfully");
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
pz_CurrentStepNum = "13.4.22";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_4_22_circum0 definition

/**
 * Resetting the pagination properties.
 * <p>
 * Step 13.5 <code>Property-Set</code> [on page UsageData] <br>
 */
public boolean step13_5_circum0() {
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
    PageCount = scalarValueQuery_82.resolveToInt(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    PageIndex = (PageIndex + 1);
}
{
    pega.setViaPropRef(".pyPagingSettings.pyPageIndex", pRef_20, pega.findPageWithException("QueryInputs", "Embed-QueryInputs"), PageIndex, "sNN", false, true);
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
pz_CurrentStepNum = "13.5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_5_circum0 definition

/**
 * Update the last run date time.
 * <p>
 * Step 14 [UPDATE] <code>Call pxSetDynamicSystemSetting</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxSetDynamicSystemSetting", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxSetDynamicSystemSetting
if (myStepPage == null) {
}
// Calling Activity : pxSetDynamicSystemSetting

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: local.aesruleset
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, aesruleset);
// Expression: local.lastrundatedss
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, lastrundatedss);
// Expression: local.rundate
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, rundate);

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "Data-Admin-Operator-ID", "");
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
boolean pz__7 = pega.invokeWhen("Always", "Data-Admin-Operator-ID", "Data-Admin-Operator-ID");
if (pz__7) {
// branch to block PR
nextBlock = "PR";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * Adding an alert if RD fails.
 * <p>
 * Step 15 [RDFAIL] <code>Property-Set</code> [on page AlertPage] <br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    tools.putParamValue("stepInfo", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("getWorstMessage--(PublicAPI)", "getWorstMessage", null, null, new Object[] { tools }));
}
{
    tools.putParamValue("stepInfo", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, null, new Object[] { tools.getParamValue("stepInfo"), "\"", "" }));
}
{
    pega.setViaPropRef(".pxResults(<append>).AlertMessage", pRef_84, pega.findPageWithException("AlertPage", "Code-Pega-List"), ((("DateTime: " + PRDateFormat.formatIDT(System.currentTimeMillis())) + ", Reason: ") + tools.getParamValue("stepInfo")), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).TypeOfFeed", pRef_85, pega.findPageWithException("AlertPage", "Code-Pega-List"), "Operator feed", "sTN", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("alertJson", PropertyInfo.TYPE_TEXT, ((!(tools.getParamValue("alertJson").equals(""))) ? ((tools.getParamValue("alertJson") + ",") + pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, myStepPage, "json" })) : (tools.getParamValue("alertJson") + pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, myStepPage, "json" }))));
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
boolean pz__9 = pega.invokeWhen("Always", "Data-Admin-Operator-ID", "Code-Pega-List");
if (pz__9) {
// branch to block PUSHALERT
nextBlock = "PUSHALERT";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * Adding an alert if connect-rest fails.
 * <p>
 * Step 16 [PUSHFAIL] <code>Property-Set</code> [on page AlertPage] <br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pxResults(<append>).AlertMessage", pRef_84, pega.findPageWithException("AlertPage", "Code-Pega-List"), (((("DateTime: " + PRDateFormat.formatIDT(System.currentTimeMillis())) + ", ResponseCode: ") + scalarValueQuery_74.resolveToString(tools, pega.findPageWithException("PData", "PegaAESRemote-Interface-UsageData"), ImmutablePropertyInfo.TYPE_INTEGER)) + " for push operator data."), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).TypeOfFeed", pRef_85, pega.findPageWithException("AlertPage", "Code-Pega-List"), "Operator feed", "sTN", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    tools.putParamValue("alertJson", PropertyInfo.TYPE_TEXT, ((!(tools.getParamValue("alertJson").equals(""))) ? ((tools.getParamValue("alertJson") + ",") + pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, myStepPage, "json" })) : (tools.getParamValue("alertJson") + pega.<String>resolveMethodCall("pxConvertPageToString--(PublicAPI,ClipboardPage,String)", "pxConvertPageToString", "Pega-RULES", "Page", new Object[] { tools, myStepPage, "json" }))));
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
pz_CurrentStepNum = "16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

/**
 * Pushing the alerts to PDC using generic API.
 * <p>
 * Step 17 [PUSHALERT] <code>Call SendLicenceData</code> [on page AlertData] <br>
 */
public boolean step17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call SendLicenceData");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.alertJson!=\"\"");
try {
boolean pz_88 = (!(tools.getParamValue("alertJson").equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.alertJson!=\"\"",pz_88);
if (!pz_88) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.alertJson!=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call SendLicenceData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call SendLicenceData
if (myStepPage == null) {
String pz_89 = "AlertData";
myStepPage = tools.findPage(pz_89, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_89, false);
myStepPage.putString("pxObjClass", "PegaAESRemote-Interface-UsageData");
}
}
// Calling Activity : SendLicenceData

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: ALERT-MESSAGE
newParamsPage.putParamValue("eventType", PropertyInfo.TYPE_TEXT, "ALERT-MESSAGE");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: AlertPage
newParamsPage.putParamValue("InputPageList", PropertyInfo.TYPE_INCLUDED_PAGE, "AlertPage");

pega.invokeActivity(myStepPage, newParamsPage, "SendLicenceData", "Data-Admin-Operator-ID", "");
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
pz_CurrentStepNum = "17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call SendLicenceData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

/**
 * Remove pages.
 * <p>
 * Step 18 [PR] <code>Page-Remove</code><br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: RDPage
pageRemove(tools.findPage("RDPage"));
// Expression: UsageData
pageRemove(tools.findPage("UsageData"));
// Expression: QueryInputs
pageRemove(tools.findPage("QueryInputs"));
// Expression: DailyUsageData
pageRemove(tools.findPage("DailyUsageData"));
// Expression: AlertPage
pageRemove(tools.findPage("AlertPage"));
// Expression: AlertData
pageRemove(tools.findPage("AlertData"));
// Expression: PData
pageRemove(tools.findPage("PData"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

/**
 * Clear activity status.
 * <p>
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

public String productionLevel = "";
public String chunklimitdss = "";
public String deploymentname = "";
public String lastrundatedss = "";
public int index = 0;
public int chunkcount = 0;
public int chunklimit = 0;
public int commonIndex = 0;
public int PageIndex = 0;
public boolean islastpublishsuccess = false;
public int operatorIndex = 0;
public String rundate = "";
public int PageCount = 0;
public String environmentName = "";
public String endpointurl = "";
public String platformVersion = "";
public String customerid = "";
public String deploymentTopology = "";
public String aesruleset = "";

public void initializeUserLocalVariables() {
	productionLevel = "";
	chunklimitdss = "";
	deploymentname = "";
	lastrundatedss = "";
	index = 0;
	chunkcount = 0;
	chunklimit = 0;
	commonIndex = 0;
	PageIndex = 0;
	islastpublishsuccess = false;
	operatorIndex = 0;
	rundate = "";
	PageCount = 0;
	environmentName = "";
	endpointurl = "";
	platformVersion = "";
	customerid = "";
	deploymentTopology = "";
	aesruleset = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("productionLevel", (productionLevel == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : productionLevel.toString());
	smRetVal.putString("chunklimitdss", (chunklimitdss == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : chunklimitdss.toString());
	smRetVal.putString("deploymentname", (deploymentname == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : deploymentname.toString());
	smRetVal.putString("lastrundatedss", (lastrundatedss == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : lastrundatedss.toString());
	smRetVal.putString("index", Integer.toString(index));
	smRetVal.putString("chunkcount", Integer.toString(chunkcount));
	smRetVal.putString("chunklimit", Integer.toString(chunklimit));
	smRetVal.putString("commonIndex", Integer.toString(commonIndex));
	smRetVal.putString("PageIndex", Integer.toString(PageIndex));
	smRetVal.putString("islastpublishsuccess", Boolean.toString(islastpublishsuccess));
	smRetVal.putString("operatorIndex", Integer.toString(operatorIndex));
	smRetVal.putString("rundate", (rundate == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : rundate.toString());
	smRetVal.putString("PageCount", Integer.toString(PageCount));
	smRetVal.putString("environmentName", (environmentName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : environmentName.toString());
	smRetVal.putString("endpointurl", (endpointurl == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : endpointurl.toString());
	smRetVal.putString("platformVersion", (platformVersion == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : platformVersion.toString());
	smRetVal.putString("customerid", (customerid == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : customerid.toString());
	smRetVal.putString("deploymentTopology", (deploymentTopology == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : deploymentTopology.toString());
	smRetVal.putString("aesruleset", (aesruleset == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : aesruleset.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_51 = new String[] { "", "", "pyCategory", "" };
public static final String[] pRef_53 = new String[] { "", "", "EventType", "" };
public static final String[] pRef_20 = new String[] { "", "", "pyPagingSettings", "", "pyPageIndex", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyPagingSettings", "", "pyPageSize", "" };
public static final String[] pRef_72 = new String[] { "", "", "pyNote", "" };
public static final String[] pRef_84 = new String[] { "", "", "pxResults", "<append>", "AlertMessage", "" };
public static final String[] pRef_52 = new String[] { "", "", "IsLicenseData", "" };
public static final String[] pRef_18 = new String[] { "", "", "pyPagingSettings", "", "pyPagingEnabled", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyPagingSettings", "", "pyReturnResultCount", "" };
public static final String[] pRef_48 = new String[] { "", "", "EnvironmentName", "" };
public static final String[] pRef_47 = new String[] { "", "", "pxCustomerID", "" };
public static final String[] pRef_54 = new String[] { "", "", "EventDate", "" };
public static final String[] pRef_50 = new String[] { "", "", "pxPlatformVersion", "" };
public static final String[] pRef_85 = new String[] { "", "", "pxResults", "<last>", "TypeOfFeed", "" };
public static final String[] pRef_49 = new String[] { "", "", "pxDeploymentTopology", "" };
private static final ScalarValueQuery scalarValueQuery_25 = FUAUtil.createQueryBuilder().scalarProperty("pxPlatformVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_33 = FUAUtil.createQueryBuilder().scalarProperty("pxTotalResultCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_68 = FUAUtil.createQueryBuilder().scalarProperty("pxResultCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_62 = FUAUtil.createQueryBuilder().scalarProperty("pyOrganization").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_66 = FUAUtil.createQueryBuilder().scalarProperty("pyDefaultTimeZone").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_61 = FUAUtil.createQueryBuilder().scalarProperty("pyUserIdentifier").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_74 = FUAUtil.createQueryBuilder().scalarProperty("pyHTTPResponseCode").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pxDeploymentName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().scalarProperty("pzProductionLevel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_67 = FUAUtil.createQueryBuilder().scalarProperty("pzMCPAutogenerated").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pxCustomerID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_64 = FUAUtil.createQueryBuilder().scalarProperty("pyOrgUnit").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_55 = FUAUtil.createQueryBuilder().scalarProperty("EventDate").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().scalarProperty("RESTEndPointURL").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarProperty("pxDeploymentTopology").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_82 = FUAUtil.createQueryBuilder().scalarProperty("pxPageCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_9 = FUAUtil.createQueryBuilder().scalarProperty("FinalRESTEndPointURL").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_65 = FUAUtil.createQueryBuilder().scalarProperty("pyLicenseType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_63 = FUAUtil.createQueryBuilder().scalarProperty("pyOrgDivision").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ID PUSHOPERATORFEED #20230619T005636.700 GMT", "Data-Admin-Operator-ID PushOperatorFeed", "PegaAESRemote", "08-23-01", false, true, "", "ACTIVITY", "20230619T005636.700 GMT" ,"Rule-Obj-Activity"); }
