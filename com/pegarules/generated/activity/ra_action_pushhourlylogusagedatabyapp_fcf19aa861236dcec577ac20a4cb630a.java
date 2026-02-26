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
public class ra_action_pushhourlylogusagedatabyapp_fcf19aa861236dcec577ac20a4cb630a extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.PushHourlyLogUsageDataByApp.PegaAESRemote_.Action");
	public ra_action_pushhourlylogusagedatabyapp_fcf19aa861236dcec577ac20a4cb630a(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT	PegaAESRemote:08-08-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 1 Circum: 0" );
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
String pz_3 = "LogUsageList";
thisStepPage = tools.findPage(pz_3, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 6 Circum: 0" );
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
String pz_7 = "NDSS";
thisStepPage = tools.findPage(pz_7, true);
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 7 Circum: 0" );
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
String pz_10 = "NDSS";
thisStepPage = tools.findPage(pz_10, true);
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("FT"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 9 Circum: 0" );
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
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 10 Circum: 0" );
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
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 11 Circum: 0" );
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 12 Circum: 0" );
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
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 15_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_14 = pega.findPageWithException("LogUsageData", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_14;
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
pz_CurrentStepNum = "15.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_0_circum0");
}
PRStackFrame pz_StackFrame15_0_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 15_0 Circum: 0" );
try {
pz_Status = step15_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_97 = "LogUsageList";
thisStepPage = tools.findPage(pz_97, true);
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 16 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_102 = "LogUsageList";
thisStepPage = tools.findPage(pz_102, true);
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 17 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_106 = "LogUsageList";
thisStepPage = tools.findPage(pz_106, true);
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 18 Circum: 0" );
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
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 19 Circum: 0" );
try {
pz_Status = step19_circum0();
} finally {
pega.popStackFrame(pz_StackFrame19_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 20_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SAVE"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_108 = "NDSS";
thisStepPage = tools.findPage(pz_108, true);
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 20 Circum: 0" );
try {
pz_Status = step20_circum0();
} finally {
pega.popStackFrame(pz_StackFrame20_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 21_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Exit"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "21";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 21_circum0");
}
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 21 Circum: 0" );
try {
pz_Status = step21_circum0();
} finally {
pega.popStackFrame(pz_StackFrame21_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 22_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "22";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 22_circum0");
}
PRStackFrame pz_StackFrame22_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 22 Circum: 0" );
try {
pz_Status = step22_circum0();
} finally {
pega.popStackFrame(pz_StackFrame22_circum0, false);
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
	"Rule-Obj-Activity:PUSHHOURLYLOGUSAGEDATABYAPP"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PUSHHOURLYLOGUSAGEDATABYAPP","Rule-Obj-Activity","PEGAAESREMOTE-",false,"","PegaAESRemote","08-08-01","RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT","!PUSHHOURLYLOGUSAGEDATABYAPP",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1158252199)
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
//	RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT:20220310T154119.369 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "d32578967fd3f502f141d29f5aa70e85";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAESRemote-";
	}
public String getAspect() {
return "Action";
}
/**
 * Log Message.
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
final PRStackFrame  methodFrame = pega.pushStackFrame("Log-Message", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Log-Message
// Expression: "PegaAESRemote : Push Hourly Log Usage Data By App Info invoked"
if( oLog.isInfoEnabled() ){
oLog.info("PegaAESRemote : Push Hourly Log Usage Data By App Info invoked");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Log-Message",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Create New LogUsageList Page.
 * <p>
 * Step 2 <code>Page-New</code> [on page LogUsageList] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_4 = "LogUsageList";
myStepPage = tools.findPage(pz_4, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Log-Usage","LogUsageList",false); 
// primary page will not be added to PageList
	 pega.setStepPage("LogUsageList", myStepPage);
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
 * Check if perf stat mode is pull or push. Default value is treated as PULL.
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
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    Mode = pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "PegaAESRemote", "aessetting/perfstatmode" });
}
{
    DSSName = "aessetting/Hourlylastpush";
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(local.Mode,\"PUSH\")");
try {
boolean pz_5 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { Mode, "PUSH" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(local.Mode,\"PUSH\")",pz_5);
if (!pz_5) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PushHourlyLogUsageDataByApp - Transition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(local.Mode,\"PUSH\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Find the appenders. If the node connected to AES for not.
 * <p>
 * Step 4 <code>Java</code><br>
 */
public boolean step4_circum0() {
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
// retrieve all appenders, it should basically contain also dynamic ones
java.util.Map appenders = LogHelper.getAppenders();

// first try to simply search aes health appender
org.apache.logging.log4j.core.Appender healthAppender = (org.apache.logging.log4j.core.Appender) appenders.get("AES-HEALTH-MSG");

// if its not there, just skip sending data
if (healthAppender == null){
    if (oLog.isDebugEnabled()) {
      oLog.debug(pz_CurrentRuleKey + ": Unable to find appender to use");
    }

	SkipThisRun = true;   
} else {
	oLog.debug(pz_CurrentRuleKey + ": Using appender: " + healthAppender.getName() );
	Appender = (Object)healthAppender;
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.SkipThisRun==true");
try {
boolean pz_6 = (SkipThisRun == true);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.SkipThisRun==true",pz_6);
if (pz_6) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "PushHourlyLogUsageDataByApp - Transition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.SkipThisRun==true " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Get the Start hour and End hour.
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
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
String currentTime = tools.getDateTimeUtils().getCurrentTimeStamp();     
   java.util.Date CurrentDate = tools.getDateTimeUtils().getDate(currentTime);
   
    int hourPart = CurrentDate.getHours();
    int dayPart =  CurrentDate.getDate();
    int monthPart = CurrentDate.getMonth(); 
    int yearPart = CurrentDate.getYear(); 
    // Now set the boundry hour as 
   java.util.Calendar c = java.util.Calendar.getInstance();
   c.setTime(CurrentDate);
   c.set(java.util.Calendar.HOUR_OF_DAY, hourPart);
   c.set(java.util.Calendar.MINUTE, 0);
   c.set(java.util.Calendar.SECOND, 0);
   c.set(java.util.Calendar.MILLISECOND, 0);
   
   java.util.Date EndHour= c.getTime();
   ParameterPage pp = tools.getParameterPage();
   String EndHourString =  tools.getDateTimeUtils().formatDateTimeStamp(EndHour); 
   pp.putString("EndHour",EndHourString);  
    
   c = java.util.Calendar.getInstance();   
   c.setTime(EndHour);
   c.add(java.util.Calendar.HOUR_OF_DAY, -1);
   EndHour= c.getTime();
   String StartHourString =  tools.getDateTimeUtils().formatDateTimeStamp(EndHour); 
   pp.putString("StartHour",StartHourString);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Updating the Start date time with Start Hour.
 * <p>
 * Step 6 <code>Property-Set</code><br>
 */
public boolean step6_circum0() {
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
    LastHourPush = tools.getParamValue("StartHour");
}
{
    tools.putParamValue("DSS", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "PegaAESRemote", DSSName }));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Create DSS page if it not exist.
 * <p>
 * Step 7 <code>Page-New</code> [on page NDSS] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@length(Param.DSS)&gt;0");
try {
boolean pz_8 = ((pega.<Integer>resolveMethodCall("length--(String)", "length", null, null, new Object[] { tools.getParamValue("DSS") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@length(Param.DSS)&gt;0",pz_8);
if (pz_8) {
// branch to block FT
nextBlock = "FT";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@length(Param.DSS)&gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_9 = "NDSS";
myStepPage = tools.findPage(pz_9, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-Admin-System-Settings","NDSS",false); 
// primary page will not be added to PageList
	 pega.setStepPage("NDSS", myStepPage);
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
 * Save DSS using OOTB.
 * <p>
 * Step 8 <code>Call pxSetDynamicSystemSetting</code> [on page NDSS] <br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxSetDynamicSystemSetting", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxSetDynamicSystemSetting
if (myStepPage == null) {
String pz_11 = "NDSS";
myStepPage = tools.findPage(pz_11, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_11, false);
myStepPage.putString("pxObjClass", "Data-Admin-System-Settings");
}
}
// Calling Activity : pxSetDynamicSystemSetting

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: Local.LastHourPush
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, LastHourPush);
// Expression: local.DSSName
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, DSSName);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "PegaAESRemote"
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, "PegaAESRemote");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "PegaAESRemote-", "");
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
 * Call VerifyHourlyPushGap.
 * <p>
 * Step 9 [FT] <code>Call VerifyHourlyPushGap</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call VerifyHourlyPushGap");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call VerifyHourlyPushGap", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call VerifyHourlyPushGap
if (myStepPage == null) {
}
// Calling Activity : VerifyHourlyPushGap
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "VerifyHourlyPushGap", "PegaAESRemote-", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call VerifyHourlyPushGap",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Verify the it is not running multiple times in same hour...
 * <p>
 * Step 10 <code>Java</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.SkipPush==\"true\"");
try {
boolean pz_12 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "SkipPush") == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.SkipPush==\"true\"",pz_12);
if (pz_12) {
// branch to block Exit
nextBlock = "Exit";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.SkipPush==\"true\" " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Set RD parameters for PushLogUsageDataToAES.
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
{
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "PushLogUsageDataByAppToAES");
}
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Log-Usage");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "LogUsageData");
}
{
    pega.setViaPropRef(".pyStyle", pRef_13, pega.findPageWithException("LogUsageList", "Log-Usage"), PRDateFormat.formatIDT(System.currentTimeMillis()), "sTN", false, true);
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
 * call PushLogUsageDataToAES RD.
 * <p>
 * Step 12 <code>Call Rule-Obj-Report-Definition.pxRetrieveReportData</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Rule-Obj-Report-Definition.pxRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Rule-Obj-Report-Definition.pxRetrieveReportData
if (myStepPage == null) {
}
// Calling Activity : Rule-Obj-Report-Definition.pxRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "PegaAESRemote-", "Rule-Obj-Report-Definition");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Set RD parameters.
 * <p>
 * Step 13 <code>Property-Set</code><br>
 */
public boolean step13_circum0() {
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
    tools.putParamValue("pyReportName", PropertyInfo.TYPE_TEXT, "GetUniqueRequestorByApp");
}
{
    tools.putParamValue("pyReportClass", PropertyInfo.TYPE_TEXT, "Log-Usage");
}
{
    tools.putParamValue("pyPageName", PropertyInfo.TYPE_TEXT, "UniqueRequestorForSystem");
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
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * Call the UniqueRequestorForSystem RD for Unique Requestor in System.
 * <p>
 * Step 14 <code>Call Rule-Obj-Report-Definition.pxRetrieveReportData</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Rule-Obj-Report-Definition.pxRetrieveReportData", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Rule-Obj-Report-Definition.pxRetrieveReportData
if (myStepPage == null) {
}
// Calling Activity : Rule-Obj-Report-Definition.pxRetrieveReportData
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pxRetrieveReportData", "PegaAESRemote-", "Rule-Obj-Report-Definition");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Rule-Obj-Report-Definition.pxRetrieveReportData",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * Loop through the log usage data.
 * <p>
 * Step 15.0 <code>Java</code> [on page LogUsageData.pxResults] <br>
 */
public boolean step15_0_circum0() {
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

// Code to call nested step 15_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_1_circum0");
}
PRStackFrame pz_StackFrame15_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 15_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step15_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame15_1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call nested step 15_2_0_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
int previousForEachCounter = forEachCounter;
int previousForEachSkipCounter = pz_forEachSkipClass;
ClipboardProperty pz_15 = pega.findPageWithException("UniqueRequestorForSystem", "Code-Pega-List").getIfPresent("pxResults");
nestedPageRef = pz_15;
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
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15.2.0";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_2_0_circum0");
}
PRStackFrame pz_StackFrame15_2_0_circum0 = pega.pushStackFrame( null, nestedStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 15_2_0 Circum: 0" );
try {
pz_Status = step15_2_0_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_2_0_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = previousForEachCounter;
pz_forEachSkipClass = previousForEachSkipCounter;
}	// end of if (nextBlock...

// Code to call nested step 15_3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15.3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_3_circum0");
}
PRStackFrame pz_StackFrame15_3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 15_3 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step15_3_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame15_3_circum0, false);
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
pz_CurrentStepNum = "15.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_0_circum0 definition

/**
 * Set the Current requester and current application.
 * <p>
 * Step 15.1 <code>Property-Set</code><br>
 */
public boolean step15_1_circum0() {
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
    ReqType = scalarValueQuery_16.resolveToString(tools, pega.findPageWithException("LogUsageData", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter);
}
{
    AppName = scalarValueQuery_17.resolveToString(tools, pega.findPageWithException("LogUsageData", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter);
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
pz_CurrentStepNum = "15.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_1_circum0 definition

/**
 * Get the counter of the unique requestor counter by app and request type..
 * <p>
 * Step 15.2.0 <code>Java</code> [on page UniqueRequestorForSystem.pxResults] <br>
 */
public boolean step15_2_0_circum0() {
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

// Code to call nested step 15_2_1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15.2.1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_2_1_circum0");
}
PRStackFrame pz_StackFrame15_2_1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT Step: 15_2_1 Circum: 0" );
try {
statusReturnedFromNestedLoop="";
pz_Status = step15_2_1_circum0();
if(statusReturnedFromNestedLoop.equals("EXIT_ITER")){
	statusReturnedFromNestedLoop="";
 return true;
}} finally {
pega.popStackFrame(pz_StackFrame15_2_1_circum0, false);
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
pz_CurrentStepNum = "15.2.0";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_2_0_circum0 definition

/**
 * Get the counter of the unique requestor counter by app and request type..
 * <p>
 * Step 15.2.1 <code>Property-Set</code><br>
 */
public boolean step15_2_1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@String.equalsIgnoreCase(UniqueRequestorForSystem.pxResults(&lt;CURRENT&gt;).pxRequestorType,Local.ReqType) &amp;&amp; @String.equalsIgnoreCase(UniqueRequestorForSystem.pxResults(&lt;CURRENT&gt;).pxApplication,Local.AppName)");
try {
boolean pz_18 = ((pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", null, "String", new Object[] { scalarValueQuery_16.resolveToString(tools, pega.findPageWithException("UniqueRequestorForSystem", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), ReqType })).booleanValue() && (pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", null, "String", new Object[] { scalarValueQuery_17.resolveToString(tools, pega.findPageWithException("UniqueRequestorForSystem", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT, forEachCounter), AppName })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@String.equalsIgnoreCase(UniqueRequestorForSystem.pxResults(&lt;CURRENT&gt;).pxRequestorType,Local.ReqType) &amp;&amp; @String.equalsIgnoreCase(UniqueRequestorForSystem.pxResults(&lt;CURRENT&gt;).pxApplication,Local.AppName)",pz_18);
if (!pz_18) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@String.equalsIgnoreCase(UniqueRequestorForSystem.pxResults(&lt;CURRENT&gt;).pxRequestorType,Local.ReqType) &amp;&amp; @String.equalsIgnoreCase(UniqueRequestorForSystem.pxResults(&lt;CURRENT&gt;).pxApplication,Local.AppName) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    Counter = tools.getParamAsInteger(PropertyInfo.TYPE_TEXT, "pyForEachCount");
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
pz_CurrentStepNum = "15.2.1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_2_1_circum0 definition

/**
 * Append to LogUsageList.
 * <p>
 * Step 15.3 <code>Property-Set</code><br>
 */
public boolean step15_3_circum0() {
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
    pega.setViaPropRef(".pxResults(<append>).pxObjClass", pRef_19, pega.findPageWithException("LogUsageList", "Log-Usage"), "Log-Usage", "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxSnapshotTime", pRef_20, pega.findPageWithException("LogUsageList", "Log-Usage"), tools.getParamValue("StartHour"), "sMY", false, true);
}
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxResults(<last>).pxRequestorType", pRef_21, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxSystemNodeID", pRef_23, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxSystemNode", pRef_25, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxSystemName", pRef_27, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).UniqueRequestors", pRef_29, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_30.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).UniqueUsers", pRef_31, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).UniqueRequestorsForSystem", pRef_33, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_34.resolveToInt(tools, pega.findPageWithException("UniqueRequestorForSystem", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER, Counter), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).UniqueUsersForSystem", pRef_35, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_36.resolveToInt(tools, pega.findPageWithException("UniqueRequestorForSystem", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER, Counter), "sNN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).ActivityCount", pRef_37, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_38.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).AlertCount", pRef_39, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_40.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).CommitCount", pRef_41, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_42.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxCommitElapsed", pRef_43, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_44.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).ConnectCount", pRef_45, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_46.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxConnectElapsed", pRef_47, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_48.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).DBInputBytes", pRef_49, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_50.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).DBOutputBytes", pRef_51, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_52.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).DeclarativeRulesInvokedCount", pRef_53, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_54.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).FlowCount", pRef_55, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_56.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).InputBytes", pRef_57, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_58.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).Interactions", pRef_59, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_60.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).JavaAssembleCount", pRef_61, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_62.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).JavaCompileCount", pRef_63, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_64.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxOtherBrowseElapsed", pRef_65, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).OtherBrowseReturned", pRef_67, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_68.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).RuleCount", pRef_69, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_70.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxRuleIOElapsed", pRef_71, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_72.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).ServiceCount", pRef_73, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_74.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxTotalReqCPU", pRef_75, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_76.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxTotalReqTime", pRef_77, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_78.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).OtherIOCount", pRef_79, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_80.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxOtherIOElapsed", pRef_81, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_82.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).OutputBytes", pRef_83, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_84.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxRuleBrowseElapsed", pRef_85, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_86.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).RuleBrowseReturned", pRef_87, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_88.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxRDBIOElapsed", pRef_89, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_90.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).RDBIOCount", pRef_91, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_92.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRN", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxDeclarativeRulesInvokedCPU", pRef_93, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_94.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DECIMAL), "sRY", false, true);
}
{
    pega.setViaPropRef(".pxResults(<last>).pxApplication", pRef_95, pega.findPageWithException("LogUsageList", "Log-Usage"), scalarValueQuery_96.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
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
pz_CurrentStepNum = "15.3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_3_circum0 definition

/**
 * Changing the LogUsageList class.
 * <p>
 * Step 16 <code>Page-Change-Class</code> [on page LogUsageList] <br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Change-Class");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "LogUsageList.pxResults(1).pxRequestorType = \"\"");
try {
boolean pz_100 = (scalarValueQuery_98.resolveToString(tools, pega.findPageWithException("LogUsageList", "Log-Usage"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "LogUsageList.pxResults(1).pxRequestorType = \"\"",pz_100);
if (pz_100) {
// branch to block SAVE
nextBlock = "SAVE";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("LogUsageList.pxResults(1).pxRequestorType = \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Change-Class", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Change-Class
// Expression: Log-Usage
// Change the page class to : Log-Usage
// Keep parameter is : 
// Expression: 
ClipboardPage  newPage = tools.getThread().createPage("Log-Usage", "");
String pz_101 = "LogUsageList";
myStepPage = tools.findPage(pz_101, true);
if (myStepPage == null) {
pega.setStepPage("LogUsageList", newPage);
} else {
ClipboardPage  tempPage = tools.getThread().createPage("Log-Usage", "");
((PegaClipboardPage)myStepPage).putAll(tempPage, ClipboardPage.PUTALL_KEEPNEW, false,(PegaClipboardPage)myStepPage.getTopLevelPage());
((PegaClipboardPage)myStepPage).putAll(newPage, ClipboardPage.PUTALL_KEEPOLD, false, (PegaClipboardPage)myStepPage.getTopLevelPage());
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Change-Class",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

/**
 * Storing the XML Stream into pyNote.
 * <p>
 * Step 17 <code>Property-Set-XML</code> [on page LogUsageList] <br>
 */
public boolean step17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-XML");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-XML", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-XML
// Expression: LogUsageListByApp
// Expression: mapfrom
StringMap  keys = new HashStringMap();
keys.putString("pxObjClass", "Rule-Obj-XML");
keys.putString("pyStreamName", "LogUsageListByApp");
if (myStepPage == null || myStepPage.getClassName().length() == 0) {
keys.putString("pyClassName", "PegaAESRemote-");
}
keys.putString("pyXMLType", "mapfrom");
// Expression: .pyNote
ClipboardProperty pz_105 = propertyQuery_103.resolve(tools, myStepPage);
pz_105.setValue(tools.getStream(keys, null));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-XML",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

/**
 * Step 18 <code>Log-Message</code> [on page LogUsageList] <br>
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
// Expression: "Push Hourly Log Usage Data   "+ .pyNote
if (myStepPage == null) {
throw new InvalidReferenceException("\"Push Hourly Log Usage Data   \"+ .pyNote", "FUAInstance-NullMyStepPage");
}
if( oLog.isInfoEnabled() ){
oLog.info(("Push Hourly Log Usage Data   " + scalarValueQuery_107.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
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
 * Push to AES/PDC.
 * <p>
 * Step 19 <code>Java</code><br>
 */
public boolean step19_circum0() {
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
org.apache.logging.log4j.core.Appender healthAppender = (org.apache.logging.log4j.core.Appender) Appender;

oLog.debug("PegaAESRemote.pushPerfStats: Using appender: " + healthAppender.getName());

oLog.logToSpecifiedAppender("ALERT", healthAppender.getName(), StringUtils.concat(StringUtils.ASIS, "PERF0001HOURLY", tools.findPage("LogUsageList").getString(".pyNote").trim()), null);

oLog.debug("Successfully Pushed Log Usage Data to AES");
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
nextBlock = "Exit";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "Exit";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__1 = pega.invokeWhen("StepStatusFail", "PegaAESRemote-", "PegaAESRemote-");
if (pz__1) {
// branch to block Exit
nextBlock = "Exit";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "19";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * Save DSS using OOTB.
 * <p>
 * Step 20 [SAVE] <code>Call pxSetDynamicSystemSetting</code> [on page NDSS] <br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pxSetDynamicSystemSetting", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pxSetDynamicSystemSetting
if (myStepPage == null) {
String pz_109 = "NDSS";
myStepPage = tools.findPage(pz_109, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_109, false);
myStepPage.putString("pxObjClass", "Data-Admin-System-Settings");
}
}
// Calling Activity : pxSetDynamicSystemSetting

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: Param.EndHour
String pz_110 = tools.getParamValue("EndHour");
newParamsPage.putParamValue("value", PropertyInfo.TYPE_TEXT, pz_110);
// Expression: local.DSSName
newParamsPage.putParamValue("setting", PropertyInfo.TYPE_TEXT, DSSName);
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "PegaAESRemote"
newParamsPage.putParamValue("owningRuleSet", PropertyInfo.TYPE_TEXT, "PegaAESRemote");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pxSetDynamicSystemSetting", "PegaAESRemote-", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pxSetDynamicSystemSetting",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_circum0 definition

/**
 * Remove unused pages.
 * <p>
 * Step 21 [Exit] <code>Page-Remove</code><br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: NDSS
pageRemove(tools.findPage("NDSS"));
// Expression: LogUsageList
pageRemove(tools.findPage("LogUsageList"));
// Expression: UniqueRequestorForSystem
pageRemove(tools.findPage("UniqueRequestorForSystem"));
// Expression: UniqueAppInfo
pageRemove(tools.findPage("UniqueAppInfo"));
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
pz_CurrentStepNum = "21";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * Clear the current activity status.
 * <p>
 * Step 22 <code>Activity-Clear-Status</code><br>
 */
public boolean step22_circum0() {
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
pz_CurrentStepNum = "22";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Activity-Clear-Status",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_circum0 definition

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

public boolean SkipThisRun = false;
public Object Appender = null;
public String ReqType = "";
public int Counter = 0;
public String LastHourPush = "";
public String NodeName = "";
public String Mode = "";
public String NodeID = "";
public String DSSName = "";
public String AppName = "";

public void initializeUserLocalVariables() {
	SkipThisRun = false;
	Appender = null;
	ReqType = "";
	Counter = 0;
	LastHourPush = "";
	NodeName = "";
	Mode = "";
	NodeID = "";
	DSSName = "";
	AppName = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("SkipThisRun", Boolean.toString(SkipThisRun));
	smRetVal.putString("Appender", (Appender == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : Appender.toString());
	smRetVal.putString("ReqType", (ReqType == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : ReqType.toString());
	smRetVal.putString("Counter", Integer.toString(Counter));
	smRetVal.putString("LastHourPush", (LastHourPush == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : LastHourPush.toString());
	smRetVal.putString("NodeName", (NodeName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : NodeName.toString());
	smRetVal.putString("Mode", (Mode == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : Mode.toString());
	smRetVal.putString("NodeID", (NodeID == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : NodeID.toString());
	smRetVal.putString("DSSName", (DSSName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : DSSName.toString());
	smRetVal.putString("AppName", (AppName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : AppName.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_81 = new String[] { "", "", "pxResults", "<last>", "pxOtherIOElapsed", "" };
public static final String[] pRef_69 = new String[] { "", "", "pxResults", "<last>", "RuleCount", "" };
public static final String[] pRef_27 = new String[] { "", "", "pxResults", "<last>", "pxSystemName", "" };
public static final String[] pRef_47 = new String[] { "", "", "pxResults", "<last>", "pxConnectElapsed", "" };
public static final String[] pRef_19 = new String[] { "", "", "pxResults", "<append>", "pxObjClass", "" };
public static final String[] pRef_35 = new String[] { "", "", "pxResults", "<last>", "UniqueUsersForSystem", "" };
public static final String[] pRef_53 = new String[] { "", "", "pxResults", "<last>", "DeclarativeRulesInvokedCount", "" };
public static final String[] pRef_71 = new String[] { "", "", "pxResults", "<last>", "pxRuleIOElapsed", "" };
public static final String[] pRef_67 = new String[] { "", "", "pxResults", "<last>", "OtherBrowseReturned", "" };
public static final String[] pRef_20 = new String[] { "", "", "pxResults", "<last>", "pxSnapshotTime", "" };
public static final String[] pRef_21 = new String[] { "", "", "pxResults", "<last>", "pxRequestorType", "" };
public static final String[] pRef_51 = new String[] { "", "", "pxResults", "<last>", "DBOutputBytes", "" };
public static final String[] pRef_75 = new String[] { "", "", "pxResults", "<last>", "pxTotalReqCPU", "" };
public static final String[] pRef_45 = new String[] { "", "", "pxResults", "<last>", "ConnectCount", "" };
public static final String[] pRef_41 = new String[] { "", "", "pxResults", "<last>", "CommitCount", "" };
public static final String[] pRef_99 = new String[] { "", "", "pxResults", "1", "pxRequestorType", "" };
public static final String[] pRef_39 = new String[] { "", "", "pxResults", "<last>", "AlertCount", "" };
public static final String[] pRef_65 = new String[] { "", "", "pxResults", "<last>", "pxOtherBrowseElapsed", "" };
public static final String[] pRef_37 = new String[] { "", "", "pxResults", "<last>", "ActivityCount", "" };
public static final String[] pRef_95 = new String[] { "", "", "pxResults", "<last>", "pxApplication", "" };
public static final String[] pRef_23 = new String[] { "", "", "pxResults", "<last>", "pxSystemNodeID", "" };
public static final String[] pRef_79 = new String[] { "", "", "pxResults", "<last>", "OtherIOCount", "" };
public static final String[] pRef_33 = new String[] { "", "", "pxResults", "<last>", "UniqueRequestorsForSystem", "" };
public static final String[] pRef_91 = new String[] { "", "", "pxResults", "<last>", "RDBIOCount", "" };
public static final String[] pRef_25 = new String[] { "", "", "pxResults", "<last>", "pxSystemNode", "" };
public static final String[] pRef_49 = new String[] { "", "", "pxResults", "<last>", "DBInputBytes", "" };
public static final String[] pRef_29 = new String[] { "", "", "pxResults", "<last>", "UniqueRequestors", "" };
public static final String[] pRef_89 = new String[] { "", "", "pxResults", "<last>", "pxRDBIOElapsed", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyStyle", "" };
public static final String[] pRef_73 = new String[] { "", "", "pxResults", "<last>", "ServiceCount", "" };
public static final String[] pRef_55 = new String[] { "", "", "pxResults", "<last>", "FlowCount", "" };
public static final String[] pRef_61 = new String[] { "", "", "pxResults", "<last>", "JavaAssembleCount", "" };
public static final String[] pRef_85 = new String[] { "", "", "pxResults", "<last>", "pxRuleBrowseElapsed", "" };
public static final String[] pRef_93 = new String[] { "", "", "pxResults", "<last>", "pxDeclarativeRulesInvokedCPU", "" };
public static final String[] pRef_63 = new String[] { "", "", "pxResults", "<last>", "JavaCompileCount", "" };
public static final String[] pRef_83 = new String[] { "", "", "pxResults", "<last>", "OutputBytes", "" };
public static final String[] pRef_43 = new String[] { "", "", "pxResults", "<last>", "pxCommitElapsed", "" };
public static final String[] pRef_87 = new String[] { "", "", "pxResults", "<last>", "RuleBrowseReturned", "" };
public static final String[] pRef_31 = new String[] { "", "", "pxResults", "<last>", "UniqueUsers", "" };
public static final String[] pRef_57 = new String[] { "", "", "pxResults", "<last>", "InputBytes", "" };
public static final String[] pRef_59 = new String[] { "", "", "pxResults", "<last>", "Interactions", "" };
public static final String[] pRef_77 = new String[] { "", "", "pxResults", "<last>", "pxTotalReqTime", "" };
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pxRequestorType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_96 = FUAUtil.createQueryBuilder().scalarProperty("pxApplication").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pxApplication").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_50 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 7).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_52 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 8).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_84 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 24).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_58 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 11).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_48 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 6).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_82 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 23).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_54 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 9).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_88 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 26).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_80 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 22).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_56 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 10).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_64 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 14).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_107 = FUAUtil.createQueryBuilder().scalarProperty("pyNote").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_28 = FUAUtil.createQueryBuilder().scalarList("pySummaryText", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_74 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 19).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_62 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 13).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_86 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 25).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_98 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).scalarProperty("pxRequestorType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_60 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 12).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_32 = FUAUtil.createQueryBuilder().scalarList("pySummaryCount", 2).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_70 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 17).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 2).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_30 = FUAUtil.createQueryBuilder().scalarList("pySummaryCount", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarList("pySummaryCount", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_72 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 18).buildScalarValueQuery();
private static final PropertyQuery propertyQuery_103 = FUAUtil.createQueryBuilder().scalarProperty("pyNote").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_38 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 1).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_36 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarList("pySummaryCount", 2).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().pageList("pxResults").scalarProperty("pxRequestorType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_90 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 27).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().scalarList("pySummaryText", 2).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 5).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_78 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 21).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_44 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 4).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_66 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 15).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_24 = FUAUtil.createQueryBuilder().scalarList("pySummaryText", 3).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_76 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 20).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_42 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 3).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_92 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 28).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_94 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 29).buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_68 = FUAUtil.createQueryBuilder().scalarList("pySummaryValue", 16).buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAAESREMOTE- PUSHHOURLYLOGUSAGEDATABYAPP #20220310T154119.369 GMT", "PegaAESRemote- PushHourlyLogUsageDataByApp", "PegaAESRemote", "08-08-01", false, true, "", "ACTIVITY", "20220310T154119.369 GMT" ,"Rule-Obj-Activity"); }
