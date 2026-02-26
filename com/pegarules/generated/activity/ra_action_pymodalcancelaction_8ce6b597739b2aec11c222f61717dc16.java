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
public class ra_action_pymodalcancelaction_8ce6b597739b2aec11c222f61717dc16 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyModalCancelAction.Rule_Obj_Class.Action");
	public ra_action_pymodalcancelaction_8ce6b597739b2aec11c222f61717dc16(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT";
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
String pz_1 = tools.getParamValue("InterestPage");
thisStepPage = tools.findPage(pz_1, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CreateView"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_3 = tools.getParamValue("InterestPage");
thisStepPage = tools.findPage(pz_3, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 3 Circum: 0" );
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
String pz_7 = "CaseTypeStages";
thisStepPage = tools.findPage(pz_7, true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 7 Circum: 0" );
try {
pz_Status = step7_circum0();
} finally {
pega.popStackFrame(pz_StackFrame7_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 8_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("SP"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "8";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 8_circum0");
}
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 8 Circum: 0" );
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
String pz_12 = "SpecPage_Bkp";
thisStepPage = tools.findPage(pz_12, true);
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 9 Circum: 0" );
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
String pz_15 = "SpecPage_Bkp";
thisStepPage = tools.findPage(pz_15, true);
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 10 Circum: 0" );
try {
pz_Status = step10_circum0();
} finally {
pega.popStackFrame(pz_StackFrame10_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 11_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("AW"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "11";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 11_circum0");
}
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 11 Circum: 0" );
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 12 Circum: 0" );
try {
pz_Status = step12_circum0();
} finally {
pega.popStackFrame(pz_StackFrame12_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 13_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("NOT_CONV"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "13";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 13_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_18 = tools.getParamValue("InterestPage");
thisStepPage = tools.findPage(pz_18, true);
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 13 Circum: 0" );
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
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 15_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("CT"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
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
String pz_25 = "CaseTypePage";
thisStepPage = tools.findPage(pz_25, true);
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 17 Circum: 0" );
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
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 18 Circum: 0" );
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
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 19 Circum: 0" );
try {
pz_Status = step19_circum0();
} finally {
pega.popStackFrame(pz_StackFrame19_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 20_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "20";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 20_circum0");
}
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 20 Circum: 0" );
try {
pz_Status = step20_circum0();
} finally {
pega.popStackFrame(pz_StackFrame20_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 21_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("PR"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "21";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 21_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_35 = tools.getParamValue("InterestPage");
thisStepPage = tools.findPage(pz_35, true);
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 21 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_40 = tools.getParamValue("InterestPage");
thisStepPage = tools.findPage(pz_40, true);
PRStackFrame pz_StackFrame22_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 22 Circum: 0" );
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
PRStackFrame pz_StackFrame23_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 23 Circum: 0" );
try {
pz_Status = step23_circum0();
} finally {
pega.popStackFrame(pz_StackFrame23_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 24_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "24";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 24_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_43 = "CurrentCaseEmailConfigurations";
thisStepPage = tools.findPage(pz_43, true);
PRStackFrame pz_StackFrame24_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 24 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_45 = tools.getParamValue("InterestPage");
thisStepPage = tools.findPage(pz_45, true);
PRStackFrame pz_StackFrame25_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 25 Circum: 0" );
try {
pz_Status = step25_circum0();
} finally {
pega.popStackFrame(pz_StackFrame25_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 26_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "26";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 26_circum0");
}
PRStackFrame pz_StackFrame26_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 26 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_48 = "ValidatePage";
thisStepPage = tools.findPage(pz_48, true);
PRStackFrame pz_StackFrame27_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 27 Circum: 0" );
try {
pz_Status = step27_circum0();
} finally {
pega.popStackFrame(pz_StackFrame27_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 28_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "28";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 28_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_51 = "CaseTypePrimaryStages";
thisStepPage = tools.findPage(pz_51, true);
PRStackFrame pz_StackFrame28_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 28 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_53 = "CaseTypeStages";
thisStepPage = tools.findPage(pz_53, true);
PRStackFrame pz_StackFrame29_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 29 Circum: 0" );
try {
pz_Status = step29_circum0();
} finally {
pega.popStackFrame(pz_StackFrame29_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 30_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Proc"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "30";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 30_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_54 = tools.getParamValue("InterestPage");
thisStepPage = tools.findPage(pz_54, true);
PRStackFrame pz_StackFrame30_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 30 Circum: 0" );
try {
pz_Status = step30_circum0();
} finally {
pega.popStackFrame(pz_StackFrame30_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 31_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "31";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 31_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_56 = "CaseTypeStages";
thisStepPage = tools.findPage(pz_56, true);
PRStackFrame pz_StackFrame31_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 31 Circum: 0" );
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
PRStackFrame pz_StackFrame32_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 32 Circum: 0" );
try {
pz_Status = step32_circum0();
} finally {
pega.popStackFrame(pz_StackFrame32_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 33_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "33";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 33_circum0");
}
PRStackFrame pz_StackFrame33_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 33 Circum: 0" );
try {
pz_Status = step33_circum0();
} finally {
pega.popStackFrame(pz_StackFrame33_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 34_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Stage"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "34";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 34_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_57 = "CaseTypeStages";
thisStepPage = tools.findPage(pz_57, true);
PRStackFrame pz_StackFrame34_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 34 Circum: 0" );
try {
pz_Status = step34_circum0();
} finally {
pega.popStackFrame(pz_StackFrame34_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 35_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "35";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 35_circum0");
}
PRStackFrame pz_StackFrame35_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 35 Circum: 0" );
try {
pz_Status = step35_circum0();
} finally {
pega.popStackFrame(pz_StackFrame35_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 36_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "36";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 36_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_59 = "SavedCaseType";
thisStepPage = tools.findPage(pz_59, true);
PRStackFrame pz_StackFrame36_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 36 Circum: 0" );
try {
pz_Status = step36_circum0();
} finally {
pega.popStackFrame(pz_StackFrame36_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 37_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Case"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "37";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 37_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_60 = "Declare_CaseTree";
thisStepPage = tools.findPage(pz_60, true);
PRStackFrame pz_StackFrame37_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 37 Circum: 0" );
try {
pz_Status = step37_circum0();
} finally {
pega.popStackFrame(pz_StackFrame37_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 38_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "38";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 38_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_61 = "ClassTreePageForLP";
thisStepPage = tools.findPage(pz_61, true);
PRStackFrame pz_StackFrame38_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 38 Circum: 0" );
try {
pz_Status = step38_circum0();
} finally {
pega.popStackFrame(pz_StackFrame38_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 39_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "39";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 39_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_63 = "ClassTreePage";
thisStepPage = tools.findPage(pz_63, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_63, false);
thisStepPage.putString("pxObjClass", "$Any");
}
PRStackFrame pz_StackFrame39_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 39 Circum: 0" );
try {
pz_Status = step39_circum0();
} finally {
pega.popStackFrame(pz_StackFrame39_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 40_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "40";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 40_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_66 = "CurrentCaseEmailConfigurationsBackup";
thisStepPage = tools.findPage(pz_66, true);
PRStackFrame pz_StackFrame40_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 40 Circum: 0" );
try {
pz_Status = step40_circum0();
} finally {
pega.popStackFrame(pz_StackFrame40_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 41_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "41";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 41_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_68 = "CurrentCaseEmailConfigurations";
thisStepPage = tools.findPage(pz_68, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_68, false);
thisStepPage.putString("pxObjClass", "Code-Pega-List");
}
PRStackFrame pz_StackFrame41_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 41 Circum: 0" );
try {
pz_Status = step41_circum0();
} finally {
pega.popStackFrame(pz_StackFrame41_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 42_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "42";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 42_circum0");
}
PRStackFrame pz_StackFrame42_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 42 Circum: 0" );
try {
pz_Status = step42_circum0();
} finally {
pega.popStackFrame(pz_StackFrame42_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 43_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "43";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 43_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_72 = "ucPage";
thisStepPage = tools.findPage(pz_72, true);
PRStackFrame pz_StackFrame43_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 43 Circum: 0" );
try {
pz_Status = step43_circum0();
} finally {
pega.popStackFrame(pz_StackFrame43_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 44_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "44";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 44_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_75 = tools.getParamValue("InterestPage");
thisStepPage = tools.findPage(pz_75, true);
PRStackFrame pz_StackFrame44_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 44 Circum: 0" );
try {
pz_Status = step44_circum0();
} finally {
pega.popStackFrame(pz_StackFrame44_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 45_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "45";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 45_circum0");
}
PRStackFrame pz_StackFrame45_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 45 Circum: 0" );
try {
pz_Status = step45_circum0();
} finally {
pega.popStackFrame(pz_StackFrame45_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 46_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "46";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 46_circum0");
}
PRStackFrame pz_StackFrame46_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 46 Circum: 0" );
try {
pz_Status = step46_circum0();
} finally {
pega.popStackFrame(pz_StackFrame46_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 47_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "47";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 47_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_81 = "caseTypeRulePg";
thisStepPage = tools.findPage(pz_81, true);
PRStackFrame pz_StackFrame47_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 47 Circum: 0" );
try {
pz_Status = step47_circum0();
} finally {
pega.popStackFrame(pz_StackFrame47_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 48_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "48";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 48_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_83 = "CaseMatchRulePg";
thisStepPage = tools.findPage(pz_83, true);
PRStackFrame pz_StackFrame48_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 48 Circum: 0" );
try {
pz_Status = step48_circum0();
} finally {
pega.popStackFrame(pz_StackFrame48_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 51_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "51";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 51_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_85 = "CaseMatchRulePg";
thisStepPage = tools.findPage(pz_85, true);
PRStackFrame pz_StackFrame51_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 51 Circum: 0" );
try {
pz_Status = step51_circum0();
} finally {
pega.popStackFrame(pz_StackFrame51_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 52_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("FEED"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "52";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 52_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_88 = tools.getParamValue("InterestPage");
thisStepPage = tools.findPage(pz_88, true);
PRStackFrame pz_StackFrame52_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 52 Circum: 0" );
try {
pz_Status = step52_circum0();
} finally {
pega.popStackFrame(pz_StackFrame52_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 53_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "53";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 53_circum0");
}
PRStackFrame pz_StackFrame53_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT Step: 53 Circum: 0" );
try {
pz_Status = step53_circum0();
} finally {
pega.popStackFrame(pz_StackFrame53_circum0, false);
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
	"Rule-Obj-Activity:PYMODALCANCELACTION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYMODALCANCELACTION","Rule-Obj-Activity","RULE-OBJ-CLASS",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT","!PYMODALCANCELACTION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",544027156)
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
//	RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT:20230618T001755.774 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "176c9bdd7945de2ab161b66c08a4c6b1";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Class";
	}
public String getAspect() {
return "Action";
}
/**
 * If skills flow action is being used, on cancel, reset the skills.
 * <p>
 * Step 1 <code>Java</code> [on page param.InterestPage] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pzAddSkills\"");
try {
boolean pz_2 = (tools.getParamValue("ModalActionName").equals("pzAddSkills"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pzAddSkills\"",pz_2);
if (!pz_2) {
// branch to block CreateView
nextBlock = "CreateView";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.ModalActionName==\"pzAddSkills\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
myStepPage.getProperty("pySkills").setValue(myStepPage.getProperty("pyTempSkills"));
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
 * Remove messages in pzOpenCreateViewOverlay in form builder.
 * <p>
 * Step 2 [CreateView] <code>Java</code> [on page param.InterestPage] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.ModalActionName, \"pzOpenCreateViewOverlay\")");
try {
boolean pz_4 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { tools.getParamValue("ModalActionName"), "pzOpenCreateViewOverlay" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.ModalActionName, \"pzOpenCreateViewOverlay\")",pz_4);
if (!pz_4) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(param.ModalActionName, \"pzOpenCreateViewOverlay\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
myStepPage.clearMessages();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Clear messages from Settings page in CaseTypeSatges.
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseTypeStages\")");
try {
boolean pz_5 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseTypeStages" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseTypeStages\")",pz_5);
if (!pz_5) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"CaseTypeStages\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyCaseConfiguration(Settings).pyCaseConfigurationError", pRef_6, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), "", "sTN", false, true);
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
 * Clear CaseTypeStages if it is from data propogation modal or calculations.
 * <p>
 * Step 4 <code>Page-Clear-Messages</code> [on page CaseTypeStages] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseTypeStages\")");
try {
boolean pz_8 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseTypeStages" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseTypeStages\")",pz_8);
if (!pz_8) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"CaseTypeStages\") " + anyException.getMessage(), anyException);
}
boolean pz__1 = pega.invokeWhen("hasMessages", "Rule-Obj-Class", "Rule-Obj-CaseType");
if (!pz__1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzShowPropertyPropagation\") || @equals(param.ModalActionName,\"pzAddPropertyPropagation\") || @equals(param.ModalActionName,\"pzAddCalculations\") || @equals(param.ModalActionName,\"pzStepConditionOverlay\")");
try {
boolean pz_9 = ((((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzShowPropertyPropagation" })).booleanValue() || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzAddPropertyPropagation" })).booleanValue()) || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzAddCalculations" })).booleanValue()) || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzStepConditionOverlay" })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzShowPropertyPropagation\") || @equals(param.ModalActionName,\"pzAddPropertyPropagation\") || @equals(param.ModalActionName,\"pzAddCalculations\") || @equals(param.ModalActionName,\"pzStepConditionOverlay\")",pz_9);
if (!pz_9) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzShowPropertyPropagation\") || @equals(param.ModalActionName,\"pzAddPropertyPropagation\") || @equals(param.ModalActionName,\"pzAddCalculations\") || @equals(param.ModalActionName,\"pzStepConditionOverlay\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Restore the spec pages.
 * <p>
 * Step 5 <code>Page-Copy</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pzConfigureFields\"");
try {
boolean pz_10 = (tools.getParamValue("ModalActionName").equals("pzConfigureFields"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pzConfigureFields\"",pz_10);
if (!pz_10) {
// branch to block SP
nextBlock = "SP";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.ModalActionName==\"pzConfigureFields\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: SpecPageBkp
sourcePage = tools.findPage("SpecPageBkp", true);
// Expression: SpecPage
targetPage = tools.findPage("SpecPage", false);
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
pz_CurrentStepNum = "5";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Restore the spec links page.
 * <p>
 * Step 6 <code>Page-Copy</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: SpecLinksBkp
sourcePage = tools.findPage("SpecLinksBkp", true);
// Expression: SpecLinks
targetPage = tools.findPage("SpecLinks", false);
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
pz_CurrentStepNum = "6";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Remove the spec backup pages.
 * <p>
 * Step 7 <code>Page-Remove</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: SpecLinksBkp
pageRemove(tools.findPage("SpecLinksBkp"));
// Expression: SpecPageBkp
pageRemove(tools.findPage("SpecPageBkp"));
// Expression: ValidatePage
pageRemove(tools.findPage("ValidatePage"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Remove validation tab related changes in configure form modal.
 * <p>
 * Step 8 [SP] <code>Java</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pzConfigureFields\" || Param.ModalActionName==\"pzConfigureViewEditor\"");
try {
boolean pz_11 = ((tools.getParamValue("ModalActionName").equals("pzConfigureFields")) || (tools.getParamValue("ModalActionName").equals("pzConfigureViewEditor")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pzConfigureFields\" || Param.ModalActionName==\"pzConfigureViewEditor\"",pz_11);
if (!pz_11) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.ModalActionName==\"pzConfigureFields\" || Param.ModalActionName==\"pzConfigureViewEditor\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
pega.getDeclarativePageUtils().deleteAllInstancesOfDeclarativePage("D_pzLoadUserFriendlyWhenConditionRows");
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
 * Restor spec backup page for cancel action.
 * <p>
 * Step 9 <code>Page-Copy</code> [on page SpecPage_Bkp] <br>
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pzSpecificationDescription\"");
try {
boolean pz_13 = (tools.getParamValue("ModalActionName").equals("pzSpecificationDescription"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pzSpecificationDescription\"",pz_13);
if (!pz_13) {
// branch to block AW
nextBlock = "AW";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.ModalActionName==\"pzSpecificationDescription\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@Default.PageExists(\"SpecPage_Bkp\")");
try {
boolean pz_14 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, "Default", new Object[] { "SpecPage_Bkp" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@Default.PageExists(\"SpecPage_Bkp\")",pz_14);
if (!pz_14) {
// branch to block AW
nextBlock = "AW";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@Default.PageExists(\"SpecPage_Bkp\") " + anyException.getMessage(), anyException);
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
// Expression: SpecPage
targetPage = tools.findPage("SpecPage", false);
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
 * Step 10 <code>Page-Remove</code> [on page SpecPage_Bkp] <br>
 */
public boolean step10_circum0() {
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
pz_CurrentStepNum = "10";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * BUG fix BUG-444447 and BUG-485737 check for conversation builder specific step page and delete data page instances.
 * <p>
 * Step 11 [AW] <code>Call-Function</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@inString(param.InterestPage,\"ConversationPage.pyQuestions\") != -1");
try {
boolean pz_16 = ((pega.<Integer>resolveMethodCall("inString--(String,String)", "inString", null, null, new Object[] { tools.getParamValue("InterestPage"), "ConversationPage.pyQuestions" })).intValue() != ((-1)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@inString(param.InterestPage,\"ConversationPage.pyQuestions\") != -1",pz_16);
if (!pz_16) {
// branch to block NOT_CONV
nextBlock = "NOT_CONV";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@inString(param.InterestPage,\"ConversationPage.pyQuestions\") != -1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call-Function", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call-Function
// Expression: @(Pega-RULES:DeclarePages).pzDeleteAllInstancesOfDeclarativePage(tools, "D_pzLoadUserFriendlyWhenConditionRows")
String pz_17 = String.valueOf((pega.<Boolean>resolveMethodCall("pzDeleteAllInstancesOfDeclarativePage--(PublicAPI,String)", "pzDeleteAllInstancesOfDeclarativePage", "Pega-RULES", "DeclarePages", new Object[] { tools, "D_pzLoadUserFriendlyWhenConditionRows" })).booleanValue());
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call-Function",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Remove the question condition page.
 * <p>
 * Step 12 <code>Page-Remove</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: pyQuestionConditionPage
pageRemove(tools.findPage("pyQuestionConditionPage"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Cleanup Condition builder gadget pages on cancel modal action of CB overlay.
 * <p>
 * Step 13 [NOT_CONV] <code>Java</code> [on page param.InterestPage] <br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pxConditionBuilder\"");
try {
boolean pz_19 = (tools.getParamValue("ModalActionName").equals("pxConditionBuilder"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pxConditionBuilder\"",pz_19);
if (!pz_19) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.ModalActionName==\"pxConditionBuilder\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
//Get embedded CB contextual page reference for current context by interest page
ClipboardProperty cbGadgetCtxProp = myStepPage.getIfPresent("pyConditionBuilderContext");

if(cbGadgetCtxProp!=null){
  ClipboardPage cbGadgetCtxPg = cbGadgetCtxProp.getPageValue();
  if(cbGadgetCtxPg!=null){
    //Get WhenInsName parameter value, from embedded CB contextual page
    String whenInsName = cbGadgetCtxPg.getString("pyWhenInsName");
    String contextPageReference = cbGadgetCtxPg.getString("pyWhenGadgetContext");
    
    //Create a new param page and set Param.WhenInsName value
    ParameterPage newParamPg = new ParameterPage();
    newParamPg.putString("WhenInsName", whenInsName);
    newParamPg.putString("ContextPageReference", contextPageReference);
    
    //Remove data pages
    tools.removeDataPage("D_pzLoadUserFriendlyWhenConditionRows", newParamPg);
    tools.removeDataPage("D_pzConditionBuilderGadgetPage", newParamPg);
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
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * remove pyWhenRuleGadgetPage.
 * <p>
 * Step 14 <code>Page-Remove</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pzStepConditionOverlay\"");
try {
boolean pz_20 = (tools.getParamValue("ModalActionName").equals("pzStepConditionOverlay"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.ModalActionName==\"pzStepConditionOverlay\"",pz_20);
if (pz_20) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.ModalActionName==\"pzStepConditionOverlay\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "!@callWhen(tools,\"pzIsAuthoringSurvey\",Primary)  &amp;&amp; (Param.ModalActionName==\"pzShowWhenConditions\")");
try {
boolean pz_21 = (((!(pega.<Boolean>resolveMethodCall("callWhen--(PublicAPI,String,ClipboardPage)", "callWhen", "Pega-RULES", "Utilities", new Object[] { tools, "pzIsAuthoringSurvey", tools.getPrimaryPage() })).booleanValue())) && (tools.getParamValue("ModalActionName").equals("pzShowWhenConditions")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "!@callWhen(tools,\"pzIsAuthoringSurvey\",Primary)  &amp;&amp; (Param.ModalActionName==\"pzShowWhenConditions\")",pz_21);
if (!pz_21) {
// branch to block CT
nextBlock = "CT";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("!@callWhen(tools,\"pzIsAuthoringSurvey\",Primary)  &amp;&amp; (Param.ModalActionName==\"pzShowWhenConditions\") " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
pega.removeDataPage("D_pzLoadUserFriendlyWhenConditionRows", true, "ContextPageReference", scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("pyWhenRuleGadgetPage", "Rule-Obj-When"), ImmutablePropertyInfo.TYPE_TEXT), "WhenInsName", scalarValueQuery_23.resolveToString(tools, pega.findPageWithException("pyWhenRuleGadgetPage", "Rule-Obj-When"), ImmutablePropertyInfo.TYPE_TEXT));
// Expression: pyWhenRuleGadgetPage
pageRemove(tools.findPage("pyWhenRuleGadgetPage"));
// Expression: ConditionsParameterPage
pageRemove(tools.findPage("ConditionsParameterPage"));
// Expression: ContextPage
pageRemove(tools.findPage("ContextPage"));
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

/**
 * Step 15 [CT] <code>Java</code><br>
 */
public boolean step15_circum0() {
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
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * Step 17 <code>Page-Clear-Messages</code> [on page CaseTypePage] <br>
 */
public boolean step17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseTypeStages\") &amp;&amp; CaseTypeStages.pyCaseContext != \"\"");
try {
boolean pz_27 = ((pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseTypeStages" })).booleanValue() && (!(scalarValueQuery_26.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT).equals(""))));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseTypeStages\") &amp;&amp; CaseTypeStages.pyCaseContext != \"\"",pz_27);
if (!pz_27) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"CaseTypeStages\") &amp;&amp; CaseTypeStages.pyCaseContext != \"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseTypePage\")");
try {
boolean pz_28 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseTypePage" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseTypePage\")",pz_28);
if (!pz_28) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"CaseTypePage\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

/**
 * Copy back Config details backpage on cancel of overlay.
 * <p>
 * Step 18 <code>Page-Copy</code><br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseTypeStages\")");
try {
boolean pz_29 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseTypeStages" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseTypeStages\")",pz_29);
if (!pz_29) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"CaseTypeStages\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseConfigBackup\")");
try {
boolean pz_30 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseConfigBackup" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseConfigBackup\")",pz_30);
if (!pz_30) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"CaseConfigBackup\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: CaseConfigBackup
sourcePage = tools.findPage("CaseConfigBackup", true);
// Expression: param.InterestPage
targetPage = tools.findPage(tools.getParamValue("InterestPage"), false);
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
pz_CurrentStepNum = "18";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

/**
 * Remove backup page - BUG-370471: added pre-condition to avoid page removal for pzParticipantFields FA overlay cancel action for case participants.
 * <p>
 * Step 19 <code>Page-Remove</code><br>
 */
public boolean step19_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseConfigBackup\") ||  @(Pega-RULES:Default).PageExists(\"CaseConfigTemp\")");
try {
boolean pz_31 = ((pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseConfigBackup" })).booleanValue() || (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseConfigTemp" })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CaseConfigBackup\") ||  @(Pega-RULES:Default).PageExists(\"CaseConfigTemp\")",pz_31);
if (!pz_31) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"CaseConfigBackup\") ||  @(Pega-RULES:Default).PageExists(\"CaseConfigTemp\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@notEquals(param.ModalActionName,\"pzParticipantFields\")");
try {
boolean pz_32 = (pega.<Boolean>resolveMethodCall("notEquals--(String,String)", "notEquals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzParticipantFields" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@notEquals(param.ModalActionName,\"pzParticipantFields\")",pz_32);
if (!pz_32) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@notEquals(param.ModalActionName,\"pzParticipantFields\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: CaseConfigBackup
pageRemove(tools.findPage("CaseConfigBackup"));
// Expression: CaseConfigTemp
pageRemove(tools.findPage("CaseConfigTemp"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * US-215786: Remove participant DT page on model cancel action.
 * <p>
 * Step 20 <code>Page-Remove</code><br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageExists(\"ParticipantDTPage\")");
try {
boolean pz_33 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "ParticipantDTPage" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageExists(\"ParticipantDTPage\")",pz_33);
if (!pz_33) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageExists(\"ParticipantDTPage\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@notEquals(param.ModalActionName,\"pzParticipantFields\")");
try {
boolean pz_34 = (pega.<Boolean>resolveMethodCall("notEquals--(String,String)", "notEquals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzParticipantFields" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@notEquals(param.ModalActionName,\"pzParticipantFields\")",pz_34);
if (!pz_34) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@notEquals(param.ModalActionName,\"pzParticipantFields\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: ParticipantDTPage
pageRemove(tools.findPage("ParticipantDTPage"));
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

/**
 * Removing page added in pre of Add modal.
 * <p>
 * Step 21 [PR] <code>Property-Remove</code> [on page param.InterestPage] <br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(\"pzCaseHierarchyAddNodeWrapper\",param.ModalActionName)");
try {
boolean pz_36 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { "pzCaseHierarchyAddNodeWrapper", tools.getParamValue("ModalActionName") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(\"pzCaseHierarchyAddNodeWrapper\",param.ModalActionName)",pz_36);
if (pz_36) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(\"pzCaseHierarchyAddNodeWrapper\",param.ModalActionName) " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(\"pzCaseHierarchyAddNodeWrapperForExp\",param.ModalActionName)");
try {
boolean pz_37 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { "pzCaseHierarchyAddNodeWrapperForExp", tools.getParamValue("ModalActionName") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(\"pzCaseHierarchyAddNodeWrapperForExp\",param.ModalActionName)",pz_37);
if (pz_37) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(\"pzCaseHierarchyAddNodeWrapperForExp\",param.ModalActionName) " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(\"pzCaseExplorerAddNodeWrapper\",param.ModalActionName)");
try {
boolean pz_38 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { "pzCaseExplorerAddNodeWrapper", tools.getParamValue("ModalActionName") })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(\"pzCaseExplorerAddNodeWrapper\",param.ModalActionName)",pz_38);
if (!pz_38) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(\"pzCaseExplorerAddNodeWrapper\",param.ModalActionName) " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: .pxResults(<LAST>)
if (myStepPage == null) {
throw new InvalidReferenceException(".pxResults(<LAST>)", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_39 = myStepPage.getIfPresent(".pxResults(<last>)");
try {if (pz_39!= null) {
pz_39.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 21.";
	oLog.error(strErrMessage);
	 throw new PRRuntimeException(strErrMessage,ex);
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
pz_CurrentStepNum = "21";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * set pyEditStepProcess to false on Cancel of pzEditStepWarning model.
 * <p>
 * Step 22 <code>Java</code> [on page param.InterestPage] <br>
 */
public boolean step22_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzEditStepWarning\")");
try {
boolean pz_41 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzEditStepWarning" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzEditStepWarning\")",pz_41);
if (!pz_41) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzEditStepWarning\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
/* Set transient property to let post processing of Edit Step model 
   know - not to save process*/ 
myStepPage.getProperty("pyEditStepProcess").setValue(false);
ClipboardPage cp=tools.findPage("TempProcess");
if(cp!=null){
myStepPage.getProperty("pyStepType").setValue(cp.getString("pyStructureType"));
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
pz_CurrentStepNum = "22";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_circum0 definition

/**
 * Clean Edit Step Model pages.
 * <p>
 * Step 23 <code>Page-Remove</code><br>
 */
public boolean step23_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzEditProcessDetails\")");
try {
boolean pz_42 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzEditProcessDetails" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzEditProcessDetails\")",pz_42);
if (!pz_42) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzEditProcessDetails\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: TempProcess
pageRemove(tools.findPage("TempProcess"));
// Expression: ProcessParam
pageRemove(tools.findPage("ProcessParam"));
// Expression: CoverableClassInfo
pageRemove(tools.findPage("CoverableClassInfo"));
// Expression: SpecPage
pageRemove(tools.findPage("SpecPage"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step23_circum0 definition

/**
 * Removing page if action is pzConfigureInboundChannels.
 * <p>
 * Step 24 <code>Page-Remove</code> [on page CurrentCaseEmailConfigurations] <br>
 */
public boolean step24_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzConfigureInboundChannels\")");
try {
boolean pz_44 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzConfigureInboundChannels" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzConfigureInboundChannels\")",pz_44);
if (!pz_44) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzConfigureInboundChannels\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "24";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step24_circum0 definition

/**
 * Clear messages from interest page if action is pzConfigureInboundChannels.
 * <p>
 * Step 25 <code>Page-Clear-Messages</code> [on page param.InterestPage] <br>
 */
public boolean step25_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzConfigureInboundChannels\") || @equals(param.ModalActionName,\"pzAddParty\") || @equals(param.ModalActionName,\"pzAddOptionalProcesses\") || @equals(param.ModalActionName,\"pzAddLocalAction\")");
try {
boolean pz_46 = ((((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzConfigureInboundChannels" })).booleanValue() || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzAddParty" })).booleanValue()) || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzAddOptionalProcesses" })).booleanValue()) || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzAddLocalAction" })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzConfigureInboundChannels\") || @equals(param.ModalActionName,\"pzAddParty\") || @equals(param.ModalActionName,\"pzAddOptionalProcesses\") || @equals(param.ModalActionName,\"pzAddLocalAction\")",pz_46);
if (!pz_46) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzConfigureInboundChannels\") || @equals(param.ModalActionName,\"pzAddParty\") || @equals(param.ModalActionName,\"pzAddOptionalProcesses\") || @equals(param.ModalActionName,\"pzAddLocalAction\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "25";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step25_circum0 definition

/**
 * Clean pzCaseHierarchyAttachments.
 * <p>
 * Step 26 <code>Page-Remove</code><br>
 */
public boolean step26_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzCaseHierarchyAttachments\")");
try {
boolean pz_47 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzCaseHierarchyAttachments" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzCaseHierarchyAttachments\")",pz_47);
if (!pz_47) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzCaseHierarchyAttachments\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: CaseType
pageRemove(tools.findPage("CaseType"));
// Expression: RulesetVersions
pageRemove(tools.findPage("RulesetVersions"));
// Expression: CurrentAttachment
pageRemove(tools.findPage("CurrentAttachment"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step26_circum0 definition

/**
 * Remove ValidatePage if canceling  pzUpdateValidateOnValidationGrid modal.
 * <p>
 * Step 27 <code>Page-Remove</code> [on page ValidatePage] <br>
 */
public boolean step27_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzUpdateValidateOnValidationGrid\")");
try {
boolean pz_49 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzUpdateValidateOnValidationGrid" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzUpdateValidateOnValidationGrid\")",pz_49);
if (pz_49) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzUpdateValidateOnValidationGrid\") " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzAddValidateToValidationGrid\")");
try {
boolean pz_50 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzAddValidateToValidationGrid" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzAddValidateToValidationGrid\")",pz_50);
if (!pz_50) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzAddValidateToValidationGrid\") " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "27";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step27_circum0 definition

/**
 * Removing page if action is EditPrimaryStages.
 * <p>
 * Step 28 <code>Page-Remove</code> [on page CaseTypePrimaryStages] <br>
 */
public boolean step28_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzEditPrimaryStages\")");
try {
boolean pz_52 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzEditPrimaryStages" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzEditPrimaryStages\")",pz_52);
if (!pz_52) {
// branch to block Proc
nextBlock = "Proc";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzEditPrimaryStages\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "28";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step28_circum0 definition

/**
 * Clear messages from CaseTypeStages page.
 * <p>
 * Step 29 <code>Page-Clear-Messages</code> [on page CaseTypeStages] <br>
 */
public boolean step29_circum0() {
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
pz_CurrentStepNum = "29";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step29_circum0 definition

/**
 * Set back to single step if step type is modified.
 * <p>
 * Step 30 [Proc] <code>Java</code> [on page param.InterestPage] <br>
 */
public boolean step30_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzEditProcessDetails\")");
try {
boolean pz_55 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzEditProcessDetails" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzEditProcessDetails\")",pz_55);
if (!pz_55) {
// branch to block Stage
nextBlock = "Stage";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzEditProcessDetails\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
if(myStepPage.getBoolean("pyEditStepProcess")==true)
  myStepPage.getProperty("pyStepType").setValue("Single");
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
pz_CurrentStepNum = "30";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step30_circum0 definition

/**
 * Step 31 <code>Page-Clear-Messages</code> [on page CaseTypeStages] <br>
 */
public boolean step31_circum0() {
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
pz_CurrentStepNum = "31";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step31_circum0 definition

/**
 * Copy back the temp page to primary to reset it to saved state.
 * <p>
 * Step 32 <code>Page-Copy</code><br>
 */
public boolean step32_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: TempProcessDetails
sourcePage = tools.findPage("TempProcessDetails", true);
// Expression: param.InterestPage
targetPage = tools.findPage(tools.getParamValue("InterestPage"), false);
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
pz_CurrentStepNum = "32";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step32_circum0 definition

/**
 * Remove the temp page.
 * <p>
 * Step 33 <code>Page-Remove</code><br>
 */
public boolean step33_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: TempProcessDetails
pageRemove(tools.findPage("TempProcessDetails"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step33_circum0 definition

/**
 * Clear error messages on stages modal.
 * <p>
 * Step 34 [Stage] <code>Page-Clear-Messages</code> [on page CaseTypeStages] <br>
 */
public boolean step34_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzStageDetails\")|| @equals(param.ModalActionName,\"pzAlternateStageDetails\")|| @equals(param.ModalActionName,\"pzConfigureStageValidation\")");
try {
boolean pz_58 = (((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzStageDetails" })).booleanValue() || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzAlternateStageDetails" })).booleanValue()) || (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { tools.getParamValue("ModalActionName"), "pzConfigureStageValidation" })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(param.ModalActionName,\"pzStageDetails\")|| @equals(param.ModalActionName,\"pzAlternateStageDetails\")|| @equals(param.ModalActionName,\"pzConfigureStageValidation\")",pz_58);
if (!pz_58) {
// branch to block Case
nextBlock = "Case";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(param.ModalActionName,\"pzStageDetails\")|| @equals(param.ModalActionName,\"pzAlternateStageDetails\")|| @equals(param.ModalActionName,\"pzConfigureStageValidation\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "34";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step34_circum0 definition

/**
 * Copy back the temp page to primary to reset it to saved state.
 * <p>
 * Step 35 <code>Page-Copy</code><br>
 */
public boolean step35_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: TempStageDetails
sourcePage = tools.findPage("TempStageDetails", true);
// Expression: param.InterestPage
targetPage = tools.findPage(tools.getParamValue("InterestPage"), false);
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
pz_CurrentStepNum = "35";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step35_circum0 definition

/**
 * remove casetype page.
 * <p>
 * Step 36 <code>Page-Remove</code> [on page SavedCaseType] <br>
 */
public boolean step36_circum0() {
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
// Expression: SavedCaseType
pageRemove(tools.findPage("SavedCaseType"));
// Expression: TempStageDetails
pageRemove(tools.findPage("TempStageDetails"));
// Expression: pyCategoryList
pageRemove(tools.findPage("pyCategoryList"));
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
pz_CurrentStepNum = "36";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step36_circum0 definition

/**
 * If cancel clear messages on ClassTreePage.
 * <p>
 * Step 37 [Case] <code>Page-Clear-Messages</code> [on page Declare_CaseTree] <br>
 */
public boolean step37_circum0() {
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
pz_CurrentStepNum = "37";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step37_circum0 definition

/**
 * If cancel clear messages on ClassTreePage for new portal.
 * <p>
 * Step 38 <code>Page-Clear-Messages</code> [on page ClassTreePageForLP] <br>
 */
public boolean step38_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"ClassTreePageForLP\")");
try {
boolean pz_62 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "ClassTreePageForLP" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"ClassTreePageForLP\")",pz_62);
if (!pz_62) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"ClassTreePageForLP\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "38";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step38_circum0 definition

/**
 * set the property value to stop post processing activity after click on cancel in the modal.
 * <p>
 * Step 39 <code>Property-Set</code> [on page ClassTreePage] <br>
 */
public boolean step39_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"ClassTreePage\")");
try {
boolean pz_64 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "ClassTreePage" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"ClassTreePage\")",pz_64);
if (!pz_64) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"ClassTreePage\") " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pyIsCancelFrmEmailInstantiationModal", pRef_65, myStepPage, true, "s?N", false, true);
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
pz_CurrentStepNum = "39";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step39_circum0 definition

/**
 * Backup pages are back to original on click of cancel.
 * <p>
 * Step 40 <code>Page-Copy</code> [on page CurrentCaseEmailConfigurationsBackup] <br>
 */
public boolean step40_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CurrentCaseEmailConfigurationsBackup\")");
try {
boolean pz_67 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "CurrentCaseEmailConfigurationsBackup" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CurrentCaseEmailConfigurationsBackup\")",pz_67);
if (!pz_67) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"CurrentCaseEmailConfigurationsBackup\") " + anyException.getMessage(), anyException);
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
// Expression: CurrentCaseEmailConfigurations
targetPage = tools.findPage("CurrentCaseEmailConfigurations", false);
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
pz_CurrentStepNum = "40";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step40_circum0 definition

/**
 * setting the ResultCount on the page.
 * <p>
 * Step 41 <code>Property-Set</code> [on page CurrentCaseEmailConfigurations] <br>
 */
public boolean step41_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CurrentCaseEmailConfigurationsBackup\")");
try {
boolean pz_69 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", "Pega-RULES", "Default", new Object[] { "CurrentCaseEmailConfigurationsBackup" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(\"CurrentCaseEmailConfigurationsBackup\")",pz_69);
if (!pz_69) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(\"CurrentCaseEmailConfigurationsBackup\") " + anyException.getMessage(), anyException);
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
    pega.setViaPropRef(".pxResultCount", pRef_70, myStepPage, scalarValueQuery_71.resolveToString(tools, pega.findPageWithException("CurrentCaseEmailConfigurationsBackup", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_INTEGER), "sNY", false, true);
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
pz_CurrentStepNum = "41";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step41_circum0 definition

/**
 * remove page setup for copy if user cancels modal.
 * <p>
 * Step 42 <code>Page-Remove</code><br>
 */
public boolean step42_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: ucPageCopy
pageRemove(tools.findPage("ucPageCopy"));
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
pz_CurrentStepNum = "42";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step42_circum0 definition

/**
 * remove ucPage conditionally.
 * <p>
 * Step 43 <code>Page-Remove</code> [on page ucPage] <br>
 */
public boolean step43_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.ModalActionName, \"pzPromptForUserStory\")");
try {
boolean pz_73 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { tools.getParamValue("ModalActionName"), "pzPromptForUserStory" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.ModalActionName, \"pzPromptForUserStory\")",pz_73);
if (pz_73) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(param.ModalActionName, \"pzPromptForUserStory\") " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.ModalActionName, \"pzChooseAnotherSpecification\")");
try {
boolean pz_74 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { tools.getParamValue("ModalActionName"), "pzChooseAnotherSpecification" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(param.ModalActionName, \"pzChooseAnotherSpecification\")",pz_74);
if (pz_74) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(param.ModalActionName, \"pzChooseAnotherSpecification\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "43";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step43_circum0 definition

/**
 * to clear messages for data type definition tab on click of cancel from data access link OR from update case cancel modal.
 * <p>
 * Step 44 <code>Page-Clear-Messages</code> [on page param.InterestPage] <br>
 */
public boolean step44_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ModalActionName==\"pzBehavior\"");
try {
boolean pz_76 = (tools.getParamValue("ModalActionName").equals("pzBehavior"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ModalActionName==\"pzBehavior\"",pz_76);
if (pz_76) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ModalActionName==\"pzBehavior\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ModalActionName==\"pzUpdateCasePropertyMapper\"");
try {
boolean pz_77 = (tools.getParamValue("ModalActionName").equals("pzUpdateCasePropertyMapper"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ModalActionName==\"pzUpdateCasePropertyMapper\"",pz_77);
if (pz_77) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ModalActionName==\"pzUpdateCasePropertyMapper\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ModalActionName==\"pzUploadNewFileToAttachContent\"");
try {
boolean pz_78 = (tools.getParamValue("ModalActionName").equals("pzUploadNewFileToAttachContent"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ModalActionName==\"pzUploadNewFileToAttachContent\"",pz_78);
if (pz_78) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ModalActionName==\"pzUploadNewFileToAttachContent\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.ModalActionName==\"pzUploadNewWordTemplateFile\"");
try {
boolean pz_79 = (tools.getParamValue("ModalActionName").equals("pzUploadNewWordTemplateFile"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.ModalActionName==\"pzUploadNewWordTemplateFile\"",pz_79);
if (!pz_79) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.ModalActionName==\"pzUploadNewWordTemplateFile\" " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "44";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step44_circum0 definition

/**
 * Step 45 <code>Java</code><br>
 */
public boolean step45_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "(@(Pega-RULES:Default).PageExists(caseTypeRulePg, tools))||(@(Pega-RULES:Default).PageExists(CaseMatchRulePg, tools))");
try {
boolean pz_80 = ((pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "caseTypeRulePg", tools })).booleanValue() || (pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseMatchRulePg", tools })).booleanValue());
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "(@(Pega-RULES:Default).PageExists(caseTypeRulePg, tools))||(@(Pega-RULES:Default).PageExists(CaseMatchRulePg, tools))",pz_80);
if (!pz_80) {
// branch to block FEED
nextBlock = "FEED";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("(@(Pega-RULES:Default).PageExists(caseTypeRulePg, tools))||(@(Pega-RULES:Default).PageExists(CaseMatchRulePg, tools)) " + anyException.getMessage(), anyException);
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
pz_CurrentStepNum = "45";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step45_circum0 definition

/**
 * Step 46 <code>Page-Clear-Messages</code><br>
 */
public boolean step46_circum0() {
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
pz_CurrentStepNum = "46";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step46_circum0 definition

/**
 * Step 47 <code>Page-Clear-Messages</code> [on page caseTypeRulePg] <br>
 */
public boolean step47_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(caseTypeRulePg, tools)");
try {
boolean pz_82 = (pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "caseTypeRulePg", tools })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(caseTypeRulePg, tools)",pz_82);
if (!pz_82) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(caseTypeRulePg, tools) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "47";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step47_circum0 definition

/**
 * Step 48 <code>Page-Clear-Messages</code> [on page CaseMatchRulePg] <br>
 */
public boolean step48_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(CaseMatchRulePg, tools)");
try {
boolean pz_84 = (pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseMatchRulePg", tools })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(CaseMatchRulePg, tools)",pz_84);
if (!pz_84) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(CaseMatchRulePg, tools) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "48";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step48_circum0 definition

/**
 * Step 51 <code>Call pyCaseMatchModalCancelAction</code> [on page CaseMatchRulePg] <br>
 */
public boolean step51_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyCaseMatchModalCancelAction");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(CaseMatchRulePg, tools)");
try {
boolean pz_86 = (pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "CaseMatchRulePg", tools })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(CaseMatchRulePg, tools)",pz_86);
if (!pz_86) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(CaseMatchRulePg, tools) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pyCaseMatchModalCancelAction", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pyCaseMatchModalCancelAction
if (myStepPage == null) {
String pz_87 = "CaseMatchRulePg";
myStepPage = tools.findPage(pz_87, true);
if (myStepPage == null) {
myStepPage = tools.findPage(pz_87, false);
myStepPage.putString("pxObjClass", "Rule-Declare-CaseMatch");
}
}
// Calling Activity : pyCaseMatchModalCancelAction
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pyCaseMatchModalCancelAction", "Rule-Obj-Class", "");
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
pz_CurrentStepNum = "51";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pyCaseMatchModalCancelAction",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step51_circum0 definition

/**
 * Feed Source: Clear messages - on modal cancel.
 * <p>
 * Step 52 [FEED] <code>Page-Clear-Messages</code> [on page param.InterestPage] <br>
 */
public boolean step52_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(AddFeedSource, tools)");
try {
boolean pz_89 = (pega.<Boolean>resolveMethodCall("PageExists--(String,Activity)", "PageExists", "Pega-RULES", "Default", new Object[] { "AddFeedSource", tools })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Default).PageExists(AddFeedSource, tools)",pz_89);
if (!pz_89) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pyModalCancelAction - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Default).PageExists(AddFeedSource, tools) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
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
pz_CurrentStepNum = "52";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step52_circum0 definition

/**
 * Feed Source: Remove AddFeedSource page - on modal cancel.
 * <p>
 * Step 53 <code>Page-Remove</code><br>
 */
public boolean step53_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: AddFeedSource
pageRemove(tools.findPage("AddFeedSource"));
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
pz_CurrentStepNum = "53";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step53_circum0 definition

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

public String StageSubScript = "";

public void initializeUserLocalVariables() {
	StageSubScript = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("StageSubScript", (StageSubScript == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : StageSubScript.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_65 = new String[] { "", "", "pyIsCancelFrmEmailInstantiationModal", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyCaseConfiguration", "Settings", "pyCaseConfigurationError", "" };
public static final String[] pRef_70 = new String[] { "", "", "pxResultCount", "" };
private static final ScalarValueQuery scalarValueQuery_71 = FUAUtil.createQueryBuilder().scalarProperty("pxResultCount").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pyWhenGadgetContext").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pyWhenInsName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().scalarProperty("pyCaseContext").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-OBJ-CLASS PYMODALCANCELACTION #20230618T001755.774 GMT", "Rule-Obj-Class pyModalCancelAction", "Pega-ProcessArchitect", "08-23-01", false, true, "", "ACTIVITY", "20230618T001755.774 GMT" ,"Rule-Obj-Activity"); }
