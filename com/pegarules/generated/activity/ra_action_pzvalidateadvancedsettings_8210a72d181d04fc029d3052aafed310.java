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
public class ra_action_pzvalidateadvancedsettings_8210a72d181d04fc029d3052aafed310 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzValidateAdvancedSettings.PegaAccel_Task_BuildApplication.Action");
	public ra_action_pzvalidateadvancedsettings_8210a72d181d04fc029d3052aafed310(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT	Pega-ProcessArchitect:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT";
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
String pz_6 = "D_pzAdvancedApplicationSettings";
thisStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 1 Circum: 0" );
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
String pz_7 = "D_pzAdvancedApplicationSettings";
thisStepPage = tools.findPage(pz_7, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 3 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_8 = "pyTempAPIWorkPage";
thisStepPage = tools.findPage(pz_8, true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 4 Circum: 0" );
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
String pz_10 = "pyTempAPIWorkPage";
thisStepPage = tools.findPage(pz_10, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_10, false);
thisStepPage.putString("pxObjClass", "Data-Application-Configuration");
}
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 5 Circum: 0" );
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
String pz_19 = "pyTempAPIWorkPage";
thisStepPage = tools.findPage(pz_19, true);
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 6 Circum: 0" );
try {
pz_Status = step6_circum0();
} finally {
pega.popStackFrame(pz_StackFrame6_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 7_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("App"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "7";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 7_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
ClipboardProperty pz_22 = propertyQuery_21.resolve(tools, pega.findPageWithException("pyTempAPIWorkPage", "Data-Application-Configuration"));
thisStepPage = pz_22 == null ? null : pz_22.getPageValue();
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 7 Circum: 0" );
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
ClipboardProperty pz_31 = propertyQuery_21.resolve(tools, pega.findPageWithException("pyTempAPIWorkPage", "Data-Application-Configuration"));
thisStepPage = pz_31 == null ? null : pz_31.getPageValue();
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Org"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
ClipboardProperty pz_33 = propertyQuery_21.resolve(tools, pega.findPageWithException("pyTempAPIWorkPage", "Data-Application-Configuration"));
thisStepPage = pz_33 == null ? null : pz_33.getPageValue();
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 9 Circum: 0" );
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
ClipboardProperty pz_37 = propertyQuery_21.resolve(tools, pega.findPageWithException("pyTempAPIWorkPage", "Data-Application-Configuration"));
thisStepPage = pz_37 == null ? null : pz_37.getPageValue();
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CG"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 11 Circum: 0" );
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 13_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CL"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_circum0");
}
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CL1"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 14 Circum: 0" );
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
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CL2"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 16 Circum: 0" );
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
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 17 Circum: 0" );
try {
pz_Status = step17_circum0();
} finally {
pega.popStackFrame(pz_StackFrame17_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 18_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CL3"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "18";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 18_circum0");
}
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 18 Circum: 0" );
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
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 19 Circum: 0" );
try {
pz_Status = step19_circum0();
} finally {
pega.popStackFrame(pz_StackFrame19_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 20_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CL4"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_circum0");
}
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 20 Circum: 0" );
try {
pz_Status = step20_circum0();
} finally {
pega.popStackFrame(pz_StackFrame20_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 21_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "21";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 21_circum0");
}
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 21 Circum: 0" );
try {
pz_Status = step21_circum0();
} finally {
pega.popStackFrame(pz_StackFrame21_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 22_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CL5"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "22";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 22_circum0");
}
PRStackFrame pz_StackFrame22_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 22 Circum: 0" );
try {
pz_Status = step22_circum0();
} finally {
pega.popStackFrame(pz_StackFrame22_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 23_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "23";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 23_circum0");
}
PRStackFrame pz_StackFrame23_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 23 Circum: 0" );
try {
pz_Status = step23_circum0();
} finally {
pega.popStackFrame(pz_StackFrame23_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 24_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("DI"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "24";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 24_circum0");
}
PRStackFrame pz_StackFrame24_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 24 Circum: 0" );
try {
pz_Status = step24_circum0();
} finally {
pega.popStackFrame(pz_StackFrame24_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 25_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "25";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 25_circum0");
}
PRStackFrame pz_StackFrame25_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 25 Circum: 0" );
try {
pz_Status = step25_circum0();
} finally {
pega.popStackFrame(pz_StackFrame25_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 26_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("UN"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "26";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 26_circum0");
}
PRStackFrame pz_StackFrame26_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 26 Circum: 0" );
try {
pz_Status = step26_circum0();
} finally {
pega.popStackFrame(pz_StackFrame26_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 27_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "27";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 27_circum0");
}
PRStackFrame pz_StackFrame27_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 27 Circum: 0" );
try {
pz_Status = step27_circum0();
} finally {
pega.popStackFrame(pz_StackFrame27_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 28_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Apply"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "28";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 28_circum0");
}
PRStackFrame pz_StackFrame28_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 28 Circum: 0" );
try {
pz_Status = step28_circum0();
} finally {
pega.popStackFrame(pz_StackFrame28_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 29_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "29";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 29_circum0");
}
PRStackFrame pz_StackFrame29_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 29 Circum: 0" );
try {
pz_Status = step29_circum0();
} finally {
pega.popStackFrame(pz_StackFrame29_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 30_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "30";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 30_circum0");
}
PRStackFrame pz_StackFrame30_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 30 Circum: 0" );
try {
pz_Status = step30_circum0();
} finally {
pega.popStackFrame(pz_StackFrame30_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 31_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Cases"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "31";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 31_circum0");
}
PRStackFrame pz_StackFrame31_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 31 Circum: 0" );
try {
pz_Status = step31_circum0();
} finally {
pega.popStackFrame(pz_StackFrame31_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 32_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "32";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 32_circum0");
}
PRStackFrame pz_StackFrame32_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 32 Circum: 0" );
try {
pz_Status = step32_circum0();
} finally {
pega.popStackFrame(pz_StackFrame32_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 33_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Revert"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "33";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 33_circum0");
}
PRStackFrame pz_StackFrame33_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 33 Circum: 0" );
try {
pz_Status = step33_circum0();
} finally {
pega.popStackFrame(pz_StackFrame33_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 34_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "34";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 34_circum0");
}
PRStackFrame pz_StackFrame34_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 34 Circum: 0" );
try {
pz_Status = step34_circum0();
} finally {
pega.popStackFrame(pz_StackFrame34_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 35_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Exit"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "35";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 35_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_96 = "pyTempAPIWorkPage";
thisStepPage = tools.findPage(pz_96, true);
PRStackFrame pz_StackFrame35_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT Step: 35 Circum: 0" );
try {
pz_Status = step35_circum0();
} finally {
pega.popStackFrame(pz_StackFrame35_circum0, false);
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
	"Rule-Obj-Activity:PZVALIDATEADVANCEDSETTINGS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZVALIDATEADVANCEDSETTINGS","Rule-Obj-Activity","PEGAACCEL-TASK-BUILDAPPLICATION",false,"","Pega-ProcessArchitect","08-02-01","RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT","!PZVALIDATEADVANCEDSETTINGS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-697701060)
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
//	RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT:20180917T205606.133 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "37a44ae11d8fbfd8c1d456b1b25d9b8d";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaAccel-Task-BuildApplication";
	}
public String getAspect() {
return "Action";
}
/**
 * Clear any non-UI edit validate errors from advanced settings.
 * <p>
 * Step 1 <code>Page-Clear-Messages</code> [on page D_pzAdvancedApplicationSettings] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Clear-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Clear-Messages
if(myStepPage != null) {
myStepPage.clearMessages();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Copy any message from UI to primary to keep the modal open in case of errors.
 * <p>
 * Step 2 <code>Page-Set-Messages</code> [on page D_pzAdvancedApplicationSettings] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("hasMessages", "PegaAccel-Task-BuildApplication", "PegaAccel-Task-BuildApplication");
if (!pz__1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
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
// Expression: @getMessagesAll(myStepPage)
if (myStepPage == null) {
throw new InvalidReferenceException("@getMessagesAll(myStepPage)", "FUAInstance-NullMyStepPage");
}
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = pega.<String>resolveMethodCall("getMessagesAll--(Page)", "getMessagesAll", null, null, new Object[] { myStepPage });
targetPage.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
boolean pz__3 = true;
if (pz__3) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzValidateAdvancedSettings - Transition", null);
pz_CheckMessage = false;
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzValidateAdvancedSettings - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step2_circum0 definition

/**
 * Clear any previous errors from primary page.
 * <p>
 * Step 3 <code>Page-Clear-Messages</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Clear-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Clear-Messages
if(myStepPage != null) {
myStepPage.clearMessages();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Create a temp page.
 * <p>
 * Step 4 <code>Page-New</code> [on page pyTempAPIWorkPage] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_9 = "pyTempAPIWorkPage";
myStepPage = tools.findPage(pz_9, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Data-Application-Configuration","pyTempAPIWorkPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("pyTempAPIWorkPage", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Set values necessary for validation for new application.
 * <p>
 * Step 5 <code>Property-Set</code> [on page pyTempAPIWorkPage] <br>
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyBuiltOnApplicationName", pRef_11, myStepPage, scalarValueQuery_12.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyBuiltOnApplicationVersion", pRef_13, myStepPage, scalarValueQuery_14.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    tools.putParamValue("AppName", PropertyInfo.TYPE_TEXT, ((scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals("")) ? scalarValueQuery_16.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT) : scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT)));
}
{
    tools.putParamValue("AppVersion", PropertyInfo.TYPE_TEXT, scalarValueQuery_17.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("OrgName", PropertyInfo.TYPE_TEXT, scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT));
}
{
    tools.putParamValue("CheckIfTestOpsExist", PropertyInfo.TYPE_TEXT, false);
}
{
    tools.putParamValue("ApplyMessageToPageOnFail", PropertyInfo.TYPE_TEXT, false);
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
 * Validate application, organization, access group(s), operator(s).
 * <p>
 * Step 6 <code>Call pzValidateNewAppAPIParameters</code> [on page pyTempAPIWorkPage] <br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzValidateNewAppAPIParameters");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzValidateNewAppAPIParameters", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzValidateNewAppAPIParameters
if (myStepPage == null) {
String pz_20 = "pyTempAPIWorkPage";
myStepPage = tools.findPage(pz_20, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_20, false);
myStepPage.putString("pxObjClass", "Data-Application-Configuration");
}
}
// Calling Activity : pzValidateNewAppAPIParameters
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzValidateNewAppAPIParameters", "PegaAccel-Task-BuildApplication", "");
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
boolean pz__4 = pega.invokeWhen("StepStatusFail", "PegaAccel-Task-BuildApplication", "Data-Application-Configuration");
if (!pz__4) {
// branch to block CG
nextBlock = "CG";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzValidateNewAppAPIParameters",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Set error for application name if pxCheckApplicationName / pxCheckRuleSetExists / pzCheckIfAccessGroupsExist / pzCheckIfTestOperatorsExist fails on Primary page to prevent modal submission.
 * <p>
 * Step 7 [App] <code>Property-Set-Messages</code> [on page pyTempAPIWorkPage.pxNewAppAPIStatus] <br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxNewAppAPIMethod==\"pxCheckApplicationName\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxNewAppAPIMethod==\"pxCheckApplicationName\"", "FUAInstance-NullMyStepPage");
}
boolean pz_24 = (scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pxCheckApplicationName"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxNewAppAPIMethod==\"pxCheckApplicationName\"",pz_24);
if (pz_24) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxNewAppAPIMethod==\"pxCheckApplicationName\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxNewAppAPIMethod==\"pxCheckIfRuleSetsExist\"");
try {
boolean pz_25 = (scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pxCheckIfRuleSetsExist"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxNewAppAPIMethod==\"pxCheckIfRuleSetsExist\"",pz_25);
if (pz_25) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxNewAppAPIMethod==\"pxCheckIfRuleSetsExist\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxNewAppAPIMethod==\"pzCheckIfAccessGroupsExist\"");
try {
boolean pz_26 = (scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pzCheckIfAccessGroupsExist"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxNewAppAPIMethod==\"pzCheckIfAccessGroupsExist\"",pz_26);
if (pz_26) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxNewAppAPIMethod==\"pzCheckIfAccessGroupsExist\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxNewAppAPIMethod==\"pzCheckIfTestOperatorsExist\"");
try {
boolean pz_27 = (scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pzCheckIfTestOperatorsExist"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxNewAppAPIMethod==\"pzCheckIfTestOperatorsExist\"",pz_27);
if (!pz_27) {
// branch to block Org
nextBlock = "Org";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxNewAppAPIMethod==\"pzCheckIfTestOperatorsExist\" " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: .pxNewAppAPIMethodStatusMessageName
// Expression: Primary.pyApplicationName
ClipboardProperty pz_30 = propertyQuery_29.resolve(tools, tools.getPrimaryPage());
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
pz_30.addMessageWithKey("(Embed-NewAppAPI-Status)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Set error for application name if pxCheckApplicationName / pxCheckRuleSetExists / pzCheckIfAccessGroupsExist / pzCheckIfTestOperatorsExist fails on D_pzAdvancedApplicationSettings page so error is shown.
 * <p>
 * Step 8 <code>Property-Set-Messages</code> [on page pyTempAPIWorkPage.pxNewAppAPIStatus] <br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: .pxNewAppAPIMethodStatusMessageName
if (myStepPage == null) {
throw new InvalidReferenceException(".pxNewAppAPIMethodStatusMessageName", "FUAInstance-NullMyStepPage");
}
// Expression: D_pzAdvancedApplicationSettings.pyApplicationName
ClipboardProperty pz_32 = propertyQuery_29.resolve(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"));
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
pz_32.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
boolean pz__6 = pega.invokeWhen("Always", "PegaAccel-Task-BuildApplication", "Embed-NewAppAPI-Status");
if (pz__6) {
// branch to block Exit
nextBlock = "Exit";
return false;
} else {
// branch to block Exit
nextBlock = "Exit";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step8_circum0 definition

/**
 * Set error for organization name if pxCheckOrganizationName fails on Primary page to prevent modal submission.
 * <p>
 * Step 9 [Org] <code>Property-Set-Messages</code> [on page pyTempAPIWorkPage.pxNewAppAPIStatus] <br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pxNewAppAPIMethod==\"pxCheckOrganizationName\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pxNewAppAPIMethod==\"pxCheckOrganizationName\"", "FUAInstance-NullMyStepPage");
}
boolean pz_34 = (scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("pxCheckOrganizationName"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pxNewAppAPIMethod==\"pxCheckOrganizationName\"",pz_34);
if (!pz_34) {
// branch to block CG
nextBlock = "CG";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pxNewAppAPIMethod==\"pxCheckOrganizationName\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: .pxNewAppAPIMethodStatusMessageName
// Expression: Primary.pyOrganizationName
ClipboardProperty pz_36 = propertyQuery_35.resolve(tools, tools.getPrimaryPage());
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
pz_36.addMessageWithKey("(Embed-NewAppAPI-Status)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Set error for organization name if pxCheckOrganizationName fails on D_pzAdvancedApplicationSettings page so error is shown.
 * <p>
 * Step 10 <code>Property-Set-Messages</code> [on page pyTempAPIWorkPage.pxNewAppAPIStatus] <br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: .pxNewAppAPIMethodStatusMessageName
if (myStepPage == null) {
throw new InvalidReferenceException(".pxNewAppAPIMethodStatusMessageName", "FUAInstance-NullMyStepPage");
}
// Expression: D_pzAdvancedApplicationSettings.pyOrganizationName
ClipboardProperty pz_38 = propertyQuery_35.resolve(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"));
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = scalarValueQuery_28.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
pz_38.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
boolean pz__8 = pega.invokeWhen("Always", "PegaAccel-Task-BuildApplication", "Embed-NewAppAPI-Status");
if (pz__8) {
// branch to block Exit
nextBlock = "Exit";
return false;
} else {
// branch to block Exit
nextBlock = "Exit";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step10_circum0 definition

/**
 * Set a message if pyExpApplicationClassGroup exceeds 56 characters on Primary page to prevent modal submission.
 * <p>
 * Step 11 [CG] <code>Page-Set-Messages</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__10 = pega.invokeWhen("pzIsClassStructureTooLong", "PegaAccel-Task-BuildApplication", "PegaAccel-Task-BuildApplication");
if (!pz__10) {
// branch to block CL
nextBlock = "CL";
pega.activityStepSkipped("Jump To Step");
return false;
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
// Expression: "pyClassNameTooLong\t"+ D_pzAdvancedApplicationSettings.pyExpApplicationClassGroup
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = ("pyClassNameTooLong\t" + scalarValueQuery_39.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT));
targetPage.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
boolean pz__12 = pega.invokeWhen("Always", "PegaAccel-Task-BuildApplication", "PegaAccel-Task-BuildApplication");
if (pz__12) {
// branch to block Exit
nextBlock = "Exit";
return false;
} else {
// branch to block Exit
nextBlock = "Exit";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step11_circum0 definition

/**
 * // Validate class layers.
 * <p>
 * Step 12 <code>Java</code><br>
 */
public boolean step12_circum0() {
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
pz_CurrentStepNum = "12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Check if Unicode rule names are enabled.
 * <p>
 * Step 13 [CL] <code>Property-Set</code><br>
 */
public boolean step13_circum0() {
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
    bUnicodeIsEnabled = (pega.<Boolean>resolveMethodCall("pxAreUnicodeRuleNamesValid--()", "pxAreUnicodeRuleNamesValid", null, null, new Object[] {})).booleanValue();
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.bUnicodeIsEnabled");
try {
boolean pz_40 = bUnicodeIsEnabled;
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.bUnicodeIsEnabled",pz_40);
if (pz_40) {
// branch to block Apply
nextBlock = "Apply";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.bUnicodeIsEnabled " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * If org class layer has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 14 [CL1] <code>Property-Set-Messages</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyOrgClassLayer)");
try {
boolean pz_42 = (pega.<Boolean>resolveMethodCall("pzDoesRuleDescriptionContainUnicode--(String)", "pzDoesRuleDescriptionContainUnicode", null, null, new Object[] { scalarValueQuery_41.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyOrgClassLayer)",pz_42);
if (!pz_42) {
// branch to block CL2
nextBlock = "CL2";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyOrgClassLayer) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: .pyOrgClassLayer
if (myStepPage == null) {
throw new InvalidReferenceException(".pyOrgClassLayer", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_44 = propertyQuery_43.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_44.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * If org class layer has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 15 <code>Property-Set-Messages</code><br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: D_pzAdvancedApplicationSettings.pyOrgClassLayer
ClipboardProperty pz_45 = propertyQuery_43.resolve(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"));
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_45.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * If div class layer has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 16 [CL2] <code>Property-Set-Messages</code><br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyDivClassLayer)");
try {
boolean pz_47 = (pega.<Boolean>resolveMethodCall("pzDoesRuleDescriptionContainUnicode--(String)", "pzDoesRuleDescriptionContainUnicode", null, null, new Object[] { scalarValueQuery_46.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyDivClassLayer)",pz_47);
if (!pz_47) {
// branch to block CL3
nextBlock = "CL3";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyDivClassLayer) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: D_pzAdvancedApplicationSettings.pyDivClassLayer
ClipboardProperty pz_49 = propertyQuery_48.resolve(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"));
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_49.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

/**
 * If div class layer has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 17 <code>Property-Set-Messages</code><br>
 */
public boolean step17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: .pyDivClassLayer
if (myStepPage == null) {
throw new InvalidReferenceException(".pyDivClassLayer", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_50 = propertyQuery_48.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_50.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

/**
 * If unit class layer has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 18 [CL3] <code>Property-Set-Messages</code><br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyUnitClassLayer)");
try {
boolean pz_52 = (pega.<Boolean>resolveMethodCall("pzDoesRuleDescriptionContainUnicode--(String)", "pzDoesRuleDescriptionContainUnicode", null, null, new Object[] { scalarValueQuery_51.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyUnitClassLayer)",pz_52);
if (!pz_52) {
// branch to block CL4
nextBlock = "CL4";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyUnitClassLayer) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: D_pzAdvancedApplicationSettings.pyUnitClassLayer
ClipboardProperty pz_54 = propertyQuery_53.resolve(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"));
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_54.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

/**
 * If unit class layer has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 19 <code>Property-Set-Messages</code><br>
 */
public boolean step19_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: .pyUnitClassLayer
if (myStepPage == null) {
throw new InvalidReferenceException(".pyUnitClassLayer", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_55 = propertyQuery_53.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_55.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * If app class layer has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 20 [CL4] <code>Property-Set-Messages</code><br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyApplicationClassLayer)");
try {
boolean pz_57 = (pega.<Boolean>resolveMethodCall("pzDoesRuleDescriptionContainUnicode--(String)", "pzDoesRuleDescriptionContainUnicode", null, null, new Object[] { scalarValueQuery_56.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyApplicationClassLayer)",pz_57);
if (!pz_57) {
// branch to block CL5
nextBlock = "CL5";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyApplicationClassLayer) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: D_pzAdvancedApplicationSettings.pyApplicationClassLayer
ClipboardProperty pz_59 = propertyQuery_58.resolve(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"));
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_59.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_circum0 definition

/**
 * If app class layer has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 21 <code>Property-Set-Messages</code><br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: .pyApplicationClassLayer
if (myStepPage == null) {
throw new InvalidReferenceException(".pyApplicationClassLayer", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_60 = propertyQuery_58.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_60.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * If class group class layer has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 22 [CL5] <code>Property-Set-Messages</code><br>
 */
public boolean step22_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyClassGroupName)");
try {
boolean pz_62 = (pega.<Boolean>resolveMethodCall("pzDoesRuleDescriptionContainUnicode--(String)", "pzDoesRuleDescriptionContainUnicode", null, null, new Object[] { scalarValueQuery_61.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyClassGroupName)",pz_62);
if (!pz_62) {
// branch to block DI
nextBlock = "DI";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyClassGroupName) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: D_pzAdvancedApplicationSettings.pyClassGroupName
ClipboardProperty pz_64 = propertyQuery_63.resolve(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"));
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_64.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_circum0 definition

/**
 * If class group class layer has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 23 <code>Property-Set-Messages</code><br>
 */
public boolean step23_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: .pyClassGroupName
if (myStepPage == null) {
throw new InvalidReferenceException(".pyClassGroupName", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_65 = propertyQuery_63.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_65.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pz_CurrentStepNum = "23";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step23_circum0 definition

/**
 * If division name has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 24 [DI] <code>Property-Set-Messages</code><br>
 */
public boolean step24_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyDivisionName)");
try {
boolean pz_67 = (pega.<Boolean>resolveMethodCall("pzDoesRuleDescriptionContainUnicode--(String)", "pzDoesRuleDescriptionContainUnicode", null, null, new Object[] { scalarValueQuery_66.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyDivisionName)",pz_67);
if (!pz_67) {
// branch to block UN
nextBlock = "UN";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyDivisionName) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: D_pzAdvancedApplicationSettings.pyDivisionName
ClipboardProperty pz_69 = propertyQuery_68.resolve(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"));
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_69.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pz_CurrentStepNum = "24";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step24_circum0 definition

/**
 * If division name has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 25 <code>Property-Set-Messages</code><br>
 */
public boolean step25_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: .pyDivisionName
if (myStepPage == null) {
throw new InvalidReferenceException(".pyDivisionName", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_70 = propertyQuery_68.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_70.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pz_CurrentStepNum = "25";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step25_circum0 definition

/**
 * If unit name has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 26 [UN] <code>Property-Set-Messages</code><br>
 */
public boolean step26_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyUnitName)");
try {
boolean pz_72 = (pega.<Boolean>resolveMethodCall("pzDoesRuleDescriptionContainUnicode--(String)", "pzDoesRuleDescriptionContainUnicode", null, null, new Object[] { scalarValueQuery_71.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyUnitName)",pz_72);
if (!pz_72) {
// branch to block Apply
nextBlock = "Apply";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@pzDoesRuleDescriptionContainUnicode(D_pzAdvancedApplicationSettings.pyUnitName) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: D_pzAdvancedApplicationSettings.pyUnitName
ClipboardProperty pz_74 = propertyQuery_73.resolve(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"));
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_74.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pz_CurrentStepNum = "26";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step26_circum0 definition

/**
 * If unit name has unicode and unicode is not enabled on this system then add error.
 * <p>
 * Step 27 <code>Property-Set-Messages</code><br>
 */
public boolean step27_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Messages
// Expression: pzUnicodeRulesNotEnabled
// Expression: .pyUnitName
if (myStepPage == null) {
throw new InvalidReferenceException(".pyUnitName", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_75 = propertyQuery_73.resolve(tools, myStepPage);
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = "pzUnicodeRulesNotEnabled";
pz_75.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
pz_CurrentStepNum = "27";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step27_circum0 definition

/**
 * Cache off all of the properties in advanced configuration before submit.
 * <p>
 * Step 28 [Apply] <code>Property-Set</code><br>
 */
public boolean step28_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@hasMessages(\"D_pzAdvancedApplicationSettings\")");
try {
boolean pz_76 = (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", null, null, new Object[] { tools.findPage("D_pzAdvancedApplicationSettings") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@hasMessages(\"D_pzAdvancedApplicationSettings\")",pz_76);
if (pz_76) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzValidateAdvancedSettings - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@hasMessages(\"D_pzAdvancedApplicationSettings\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    origStructure = scalarValueQuery_77.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    origAppName = scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    origAppVersion = scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    origOrgName = scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    origDivName = scalarValueQuery_66.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    origUnitName = scalarValueQuery_71.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    origCreateDiv = scalarValueQuery_78.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
}
{
    origCreateUnit = scalarValueQuery_79.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
}
{
    origOrgClass = scalarValueQuery_41.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    origDivClass = scalarValueQuery_46.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    origUnitClass = scalarValueQuery_51.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    origAppClass = scalarValueQuery_56.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
}
{
    origClassGroup = scalarValueQuery_61.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
pz_CurrentStepNum = "28";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step28_circum0 definition

/**
 * Apply advanced settings.
 * <p>
 * Step 29 <code>Apply-DataTransform</code><br>
 */
public boolean step29_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: pzApplyAdvancedSettings
ParameterPage stepParams__1 = new ParameterPage();/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "PegaAccel-Task-BuildApplication";
}
StringMap params__1 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__1.putString("pxObjClass", "Rule-Obj-Model");
params__1.putString("pyClassName", modelClass);
params__1.putString("pyModelName", "pzApplyAdvancedSettings");
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
pz_CurrentStepNum = "29";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step29_circum0 definition

/**
 * If there were error messages as a result of Edit Validates firing, then set error message on top level page.
 * <p>
 * Step 30 <code>Page-Set-Messages</code><br>
 */
public boolean step30_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__14 = pega.invokeWhen("hasMessages", "PegaAccel-Task-BuildApplication", "PegaAccel-Task-BuildApplication");
if (!pz__14) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
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
// Expression: @getMessagesAll(myStepPage)
if (myStepPage == null) {
throw new InvalidReferenceException("@getMessagesAll(myStepPage)", "FUAInstance-NullMyStepPage");
}
String keyToPass = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isShowMeValidationEnabled()? pz_CurrentRuleKey : null;

String messageToAdd = pega.<String>resolveMethodCall("getMessagesAll--(Page)", "getMessagesAll", null, null, new Object[] { myStepPage });
targetPage.addMessageWithKey("(PegaAccel-Task-BuildApplication)" + messageToAdd, keyToPass);
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
boolean pz__16 = pega.invokeWhen("Always", "PegaAccel-Task-BuildApplication", "PegaAccel-Task-BuildApplication");
if (pz__16) {
// branch to block Revert
nextBlock = "Revert";
return false;
} else {
// branch to block Revert
nextBlock = "Revert";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "30";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Set-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step30_circum0 definition

/**
 * Validate the class tree.
 * <p>
 * Step 31 [Cases] <code>Call pzValidateClassTree</code><br>
 */
public boolean step31_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzValidateClassTree");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzValidateClassTree", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzValidateClassTree
if (myStepPage == null) {
}
// Calling Activity : pzValidateClassTree

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzValidateClassTree", "PegaAccel-Task-BuildApplication", "");
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
boolean pz__18 = pega.invokeWhen("hasMessages", "PegaAccel-Task-BuildApplication", "PegaAccel-Task-BuildApplication");
if (pz__18) {
// branch to block Revert
nextBlock = "Revert";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "31";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzValidateClassTree",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step31_circum0 definition

/**
 * Set pyClassTreeForCaseTypes from D_pzConvertCaseToClassTree and that we visited advanced configuration.
 * <p>
 * Step 32 <code>Property-Set</code><br>
 */
public boolean step32_circum0() {
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
// LHS: .pyClassTreeForCaseTypes
// RHS: "D_pzConvertCaseToClassTree"
pega.setViaPropRef(".pyClassTreeForCaseTypes", pRef_80, myStepPage, "D_pzConvertCaseToClassTree", "S*NCode-Pega-List", false, false);

{
    pega.setViaPropRef(".pyAdvancedConfigVisited", pRef_81, myStepPage, true, "sSN", false, true);
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
boolean pz__20 = pega.invokeWhen("Always", "PegaAccel-Task-BuildApplication", "PegaAccel-Task-BuildApplication");
if (pz__20) {
// branch to block Exit
nextBlock = "Exit";
return false;
} else {
// branch to block Exit
nextBlock = "Exit";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "32";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step32_circum0 definition

/**
 * If desired, clear advanced settings on fail.
 * <p>
 * Step 33 [Revert] <code>Apply-DataTransform</code><br>
 */
public boolean step33_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.clearAdvancedSettings");
try {
boolean pz_82 = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "clearAdvancedSettings");
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.clearAdvancedSettings",pz_82);
if (!pz_82) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.clearAdvancedSettings " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Apply-DataTransform", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Apply-DataTransform
// Expression: pzResetAdvancedApplicationSettings
ParameterPage stepParams__2 = new ParameterPage();/* Get the class of the primary page.  Default if empty. */
String modelClass = null;
if (myStepPage != null) {
	modelClass = myStepPage.getClassName();
}
if ((modelClass == null) || (modelClass.length() == 0)) { 
	modelClass = "PegaAccel-Task-BuildApplication";
}
StringMap params__2 = ThreadLocalStringMapFactoryImpl.getFactory().acquire();
params__2.putString("pxObjClass", "Rule-Obj-Model");
params__2.putString("pyClassName", modelClass);
params__2.putString("pyModelName", "pzResetAdvancedApplicationSettings");
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
pz_CurrentStepNum = "33";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Apply-DataTransform",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step33_circum0 definition

/**
 * Revert fields back to what they were if there are errors present.
 * <p>
 * Step 34 <code>Property-Set</code><br>
 */
public boolean step34_circum0() {
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyCreateLayerOptionSelected", pRef_83, myStepPage, origStructure, "stN", false, true);
}
{
    pega.setViaPropRef(".pyApplicationName", pRef_84, myStepPage, origAppName, "sTI", false, true);
}
{
    pega.setViaPropRef(".pyApplicationVersion", pRef_85, myStepPage, origAppVersion, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOrganizationName", pRef_86, myStepPage, origOrgName, "sTN32", false, true);
}
{
    pega.setViaPropRef(".pyDivisionName", pRef_87, myStepPage, origDivName, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyUnitName", pRef_88, myStepPage, origUnitName, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyCreateDivClassLayer", pRef_89, myStepPage, origCreateDiv, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyCreateUnitClassLayer", pRef_90, myStepPage, origCreateUnit, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyOrgClassLayer", pRef_91, myStepPage, origOrgClass, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyDivClassLayer", pRef_92, myStepPage, origDivClass, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyUnitClassLayer", pRef_93, myStepPage, origUnitClass, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyApplicationClassLayer", pRef_94, myStepPage, origAppClass, "sTN", false, true);
}
{
    pega.setViaPropRef(".pyClassGroupName", pRef_95, myStepPage, origClassGroup, "sTI", false, true);
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
boolean pz__22 = pega.invokeWhen("Always", "PegaAccel-Task-BuildApplication", "PegaAccel-Task-BuildApplication");
if (pz__22) {
// branch to block Exit
nextBlock = "Exit";
return false;
} else {
// branch to block Exit
nextBlock = "Exit";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "34";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step34_circum0 definition

/**
 * Remove temp page.
 * <p>
 * Step 35 [Exit] <code>Page-Remove</code> [on page pyTempAPIWorkPage] <br>
 */
public boolean step35_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
pageRemove(myStepPage);
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
pz_CurrentStepNum = "35";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step35_circum0 definition

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

public String origAppName = "";
public String origOrgName = "";
public String origStructure = "";
public String origDivClass = "";
public String origUnitClass = "";
public String origAppVersion = "";
public boolean origCreateUnit = false;
public boolean origCreateDiv = false;
public boolean bUnicodeIsEnabled = false;
public String origAppClass = "";
public String origOrgClass = "";
public String origDivName = "";
public String origUnitName = "";
public String origClassGroup = "";

public void initializeUserLocalVariables() {
	origAppName = "";
	origOrgName = "";
	origStructure = "";
	origDivClass = "";
	origUnitClass = "";
	origAppVersion = "";
	origCreateUnit = false;
	origCreateDiv = false;
	bUnicodeIsEnabled = false;
	origAppClass = "";
	origOrgClass = "";
	origDivName = "";
	origUnitName = "";
	origClassGroup = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("origAppName", (origAppName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origAppName.toString());
	smRetVal.putString("origOrgName", (origOrgName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origOrgName.toString());
	smRetVal.putString("origStructure", (origStructure == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origStructure.toString());
	smRetVal.putString("origDivClass", (origDivClass == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origDivClass.toString());
	smRetVal.putString("origUnitClass", (origUnitClass == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origUnitClass.toString());
	smRetVal.putString("origAppVersion", (origAppVersion == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origAppVersion.toString());
	smRetVal.putString("origCreateUnit", Boolean.toString(origCreateUnit));
	smRetVal.putString("origCreateDiv", Boolean.toString(origCreateDiv));
	smRetVal.putString("bUnicodeIsEnabled", Boolean.toString(bUnicodeIsEnabled));
	smRetVal.putString("origAppClass", (origAppClass == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origAppClass.toString());
	smRetVal.putString("origOrgClass", (origOrgClass == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origOrgClass.toString());
	smRetVal.putString("origDivName", (origDivName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origDivName.toString());
	smRetVal.putString("origUnitName", (origUnitName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origUnitName.toString());
	smRetVal.putString("origClassGroup", (origClassGroup == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : origClassGroup.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_94 = new String[] { "", "", "pyApplicationClassLayer", "" };
public static final String[] pRef_81 = new String[] { "", "", "pyAdvancedConfigVisited", "" };
public static final String[] pRef_88 = new String[] { "", "", "pyUnitName", "" };
public static final String[] pRef_95 = new String[] { "", "", "pyClassGroupName", "" };
public static final String[] pRef_89 = new String[] { "", "", "pyCreateDivClassLayer", "" };
public static final String[] pRef_90 = new String[] { "", "", "pyCreateUnitClassLayer", "" };
public static final String[] pRef_93 = new String[] { "", "", "pyUnitClassLayer", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyBuiltOnApplicationVersion", "" };
public static final String[] pRef_92 = new String[] { "", "", "pyDivClassLayer", "" };
public static final String[] pRef_84 = new String[] { "", "", "pyApplicationName", "" };
public static final String[] pRef_87 = new String[] { "", "", "pyDivisionName", "" };
public static final String[] pRef_86 = new String[] { "", "", "pyOrganizationName", "" };
public static final String[] pRef_85 = new String[] { "", "", "pyApplicationVersion", "" };
public static final String[] pRef_80 = new String[] { "", "", "pyClassTreeForCaseTypes", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyBuiltOnApplicationName", "" };
public static final String[] pRef_91 = new String[] { "", "", "pyOrgClassLayer", "" };
public static final String[] pRef_83 = new String[] { "", "", "pyCreateLayerOptionSelected", "" };
private static final PropertyQuery propertyQuery_73 = FUAUtil.createQueryBuilder().scalarProperty("pyUnitName").buildPropertyQuery();
private static final PropertyQuery propertyQuery_29 = FUAUtil.createQueryBuilder().scalarProperty("pyApplicationName").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_46 = FUAUtil.createQueryBuilder().scalarProperty("pyDivClassLayer").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_43 = FUAUtil.createQueryBuilder().scalarProperty("pyOrgClassLayer").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_51 = FUAUtil.createQueryBuilder().scalarProperty("pyUnitClassLayer").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_66 = FUAUtil.createQueryBuilder().scalarProperty("pyDivisionName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().scalarProperty("pySelectedApplicationTemplateVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_41 = FUAUtil.createQueryBuilder().scalarProperty("pyOrgClassLayer").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_68 = FUAUtil.createQueryBuilder().scalarProperty("pyDivisionName").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().scalarProperty("pyApplicationVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_71 = FUAUtil.createQueryBuilder().scalarProperty("pyUnitName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_28 = FUAUtil.createQueryBuilder().scalarProperty("pxNewAppAPIMethodStatusMessageName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_39 = FUAUtil.createQueryBuilder().scalarProperty("pyExpApplicationClassGroup").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_53 = FUAUtil.createQueryBuilder().scalarProperty("pyUnitClassLayer").buildPropertyQuery();
private static final PropertyQuery propertyQuery_63 = FUAUtil.createQueryBuilder().scalarProperty("pyClassGroupName").buildPropertyQuery();
private static final PropertyQuery propertyQuery_35 = FUAUtil.createQueryBuilder().scalarProperty("pyOrganizationName").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_58 = FUAUtil.createQueryBuilder().scalarProperty("pyApplicationClassLayer").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_78 = FUAUtil.createQueryBuilder().scalarProperty("pyCreateDivClassLayer").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_48 = FUAUtil.createQueryBuilder().scalarProperty("pyDivClassLayer").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pxNewAppAPIMethod").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pySelectedApplicationTemplate").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pyOrganizationName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_56 = FUAUtil.createQueryBuilder().scalarProperty("pyApplicationClassLayer").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_77 = FUAUtil.createQueryBuilder().scalarProperty("pyCreateLayerOptionSelected").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyApplicationName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_79 = FUAUtil.createQueryBuilder().scalarProperty("pyCreateUnitClassLayer").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().page("pxNewAppAPIStatus").buildPropertyQuery();
private static final PropertyQuery propertyQuery_21 = FUAUtil.createQueryBuilder().page("pxNewAppAPIStatus").ifPresent().buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_61 = FUAUtil.createQueryBuilder().scalarProperty("pyClassGroupName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAACCEL-TASK-BUILDAPPLICATION PZVALIDATEADVANCEDSETTINGS #20180917T205606.133 GMT", "PegaAccel-Task-BuildApplication pzValidateAdvancedSettings", "Pega-ProcessArchitect", "08-02-01", false, true, "", "ACTIVITY", "20180917T205606.133 GMT" ,"Rule-Obj-Activity"); }
