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
public class ra_action_saveas_07f77e8ec1c7d90fb536abf6e6fb1d2c extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.SaveAs.Rule_.Action");
	public ra_action_saveas_07f77e8ec1c7d90fb536abf6e6fb1d2c(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT	Pega-Desktop:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT";
pz_CurrentCircumstance = "0";
pega.noteLegacyAPIUse();
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 2 Circum: 0" );
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
String pz_2 = "pyReturnToClient";
thisStepPage = tools.findPage(pz_2, true);
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 8 Circum: 0" );
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
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 9 Circum: 0" );
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
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 10 Circum: 0" );
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
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 11 Circum: 0" );
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 12 Circum: 0" );
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
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 13 Circum: 0" );
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
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 14 Circum: 0" );
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
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 16_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "16";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 16_circum0");
}
PRStackFrame pz_StackFrame16_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 16 Circum: 0" );
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
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 17 Circum: 0" );
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
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 18 Circum: 0" );
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
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 19 Circum: 0" );
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
PRStackFrame pz_StackFrame20_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 20 Circum: 0" );
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
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 21 Circum: 0" );
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
PRStackFrame pz_StackFrame22_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 22 Circum: 0" );
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
PRStackFrame pz_StackFrame23_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 23 Circum: 0" );
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
PRStackFrame pz_StackFrame24_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 24 Circum: 0" );
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
PRStackFrame pz_StackFrame25_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 25 Circum: 0" );
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
PRStackFrame pz_StackFrame26_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 26 Circum: 0" );
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
PRStackFrame pz_StackFrame27_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 27 Circum: 0" );
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
PRStackFrame pz_StackFrame28_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 28 Circum: 0" );
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
PRStackFrame pz_StackFrame29_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 29 Circum: 0" );
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
PRStackFrame pz_StackFrame30_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 30 Circum: 0" );
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
PRStackFrame pz_StackFrame31_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 31 Circum: 0" );
try {
pz_Status = step31_circum0();
} finally {
pega.popStackFrame(pz_StackFrame31_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 32_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Chk"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "32";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 32_circum0");
}
PRStackFrame pz_StackFrame32_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 32 Circum: 0" );
try {
pz_Status = step32_circum0();
} finally {
pega.popStackFrame(pz_StackFrame32_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 33_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Err"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "33";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 33_circum0");
}
PRStackFrame pz_StackFrame33_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 33 Circum: 0" );
try {
pz_Status = step33_circum0();
} finally {
pega.popStackFrame(pz_StackFrame33_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 34_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("RB"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "34";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 34_circum0");
}
PRStackFrame pz_StackFrame34_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT Step: 34 Circum: 0" );
try {
pz_Status = step34_circum0();
} finally {
pega.popStackFrame(pz_StackFrame34_circum0, false);
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
	"Rule-Obj-Activity:SAVEAS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("SAVEAS","Rule-Obj-Activity","RULE-",false,"","Pega-Desktop","08-03-01","RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT","!SAVEAS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1938608292)
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
//	RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT:20190329T084002.329 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "79411679d526d0d8aea425c151bccd53";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-";
	}
public String getAspect() {
return "Action";
}
/**
 * Entry point.
 * <p>
 * Step 1 <code>Call PreSaveAs</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PreSaveAs");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call PreSaveAs", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call PreSaveAs
if (myStepPage == null) {
}
// Calling Activity : PreSaveAs
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "PreSaveAs", "Rule-", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call PreSaveAs",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Save off the original rulename.
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
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    OriginalRuleName = scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
 * Create page so validate won't fail.
 * <p>
 * Step 3 <code>Page-New</code> [on page pyReturnToClient] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@PageExists(\"pyReturnToClient\")");
try {
boolean pz_3 = (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "pyReturnToClient" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@PageExists(\"pyReturnToClient\")",pz_3);
if (pz_3) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@PageExists(\"pyReturnToClient\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-New", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-New
String pz_4 = "pyReturnToClient";
myStepPage = tools.findPage(pz_4, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Rule-","pyReturnToClient",false); 
// primary page will not be added to PageList
	 pega.setStepPage("pyReturnToClient", myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-New",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Set Locked Record properties to "".
 * <p>
 * Step 4 <code>Property-Set-Special</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Special", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Special
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxInstanceLockedBy", pRef_5, myStepPage, "", "sTY", false, true);
}
{
    pega.setViaPropRef(".pxInstanceLockedDateTime", pRef_6, myStepPage, "", "sMY", false, true);
}
{
    pega.setViaPropRef(".pxInstanceLockedKey", pRef_7, myStepPage, "", "sTY", false, true);
}
{
    pega.setViaPropRef(".pxInstanceLockedRuleSet", pRef_8, myStepPage, "", "sTY", false, true);
}
{
    pega.setViaPropRef(".pxInstanceLockedRuleSetVersion", pRef_9, myStepPage, "", "sTY", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Set pzOriginalInstanceKey to match key (for cases like saving a template where we are not giong through the desktop).
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pzInsKey==\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pzInsKey==\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_11 = (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pzInsKey==\"\"",pz_11);
if (pz_11) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pzInsKey==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pzOriginalInstanceKey", pRef_12, myStepPage, scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
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
 * Set pyBaseRule to false.
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyBaseRule", pRef_13, myStepPage, false, "sSN", false, true);
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
 * Get Create date time, store locally.
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
    createDateTime = PRDateFormat.formatIDT(System.currentTimeMillis());
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
 * Set Create date time (since it's new).
 * <p>
 * Step 8 <code>Property-Set-Special</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Special", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Special
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxCreateDateTime", pRef_14, myStepPage, com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, createDateTime), "sMY", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * set create operator if necessary.
 * <p>
 * Step 9 <code>Property-Set-Special</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "= Lib(Pega-RULES:String).equals(.pxCreateOperator, \"\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("= Lib(Pega-RULES:String).equals(.pxCreateOperator, \"\")", "FUAInstance-NullMyStepPage");
}
boolean pz_16 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "= Lib(Pega-RULES:String).equals(.pxCreateOperator, \"\")",pz_16);
if (!pz_16) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("= Lib(Pega-RULES:String).equals(.pxCreateOperator, \"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Special", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Special
{
    pega.setViaPropRef(".pxCreateOperator", pRef_17, myStepPage, scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * set create operator name if necessary.
 * <p>
 * Step 10 <code>Property-Set-Special</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "= Lib(Pega-RULES:String).equals(.pxCreateOpName, \"\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("= Lib(Pega-RULES:String).equals(.pxCreateOpName, \"\")", "FUAInstance-NullMyStepPage");
}
boolean pz_20 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { scalarValueQuery_19.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "= Lib(Pega-RULES:String).equals(.pxCreateOpName, \"\")",pz_20);
if (!pz_20) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("= Lib(Pega-RULES:String).equals(.pxCreateOpName, \"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Special", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Special
{
    pega.setViaPropRef(".pxCreateOpName", pRef_21, myStepPage, scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * set create system id if necessary.
 * <p>
 * Step 11 <code>Property-Set-Special</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "= Lib(Pega-RULES:String).equals(.pxCreateSystemID, \"\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("= Lib(Pega-RULES:String).equals(.pxCreateSystemID, \"\")", "FUAInstance-NullMyStepPage");
}
boolean pz_24 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "= Lib(Pega-RULES:String).equals(.pxCreateSystemID, \"\")",pz_24);
if (!pz_24) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("= Lib(Pega-RULES:String).equals(.pxCreateSystemID, \"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Special", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Special
{
    pega.setViaPropRef(".pxCreateSystemID", pRef_25, myStepPage, scalarValueQuery_26.resolveToString(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * remove pyWorkKey.
 * <p>
 * Step 12 <code>Property-Remove</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: pyWorkKey
try {if ("pyWorkKey"!= null) {
myStepPage.remove("pyWorkKey");
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 12.";
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
pz_CurrentStepNum = "12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Set Skim Fields to Blank on SaveAs.
 * <p>
 * Step 13 <code>Property-Set-Special</code><br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Special", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Special
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxOriginalCreateOpName", pRef_27, myStepPage, "", "sTY", false, true);
}
{
    pega.setViaPropRef(".pxOriginalCreateOperator", pRef_28, myStepPage, "", "sTY", false, true);
}
{
    pega.setViaPropRef(".pxOriginalCreateDateTime", pRef_29, myStepPage, "", "sMY", false, true);
}
{
    pega.setViaPropRef(".pxOriginalCreateSystemID", pRef_30, myStepPage, "", "sTY", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * remove warnings.
 * <p>
 * Step 14 <code>Property-Remove</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: .pxWarningsToDisplay
if (myStepPage == null) {
throw new InvalidReferenceException(".pxWarningsToDisplay", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_31 = myStepPage.getIfPresent("pxWarningsToDisplay");
try {if (pz_31!= null) {
pz_31.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 14.";
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
pz_CurrentStepNum = "14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * calls validate activity of the object (if available or always if of type flow).
 * <p>
 * Step 15 <code>Java</code><br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(.pxObjClass, \"Rule-Obj-Flow\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@(Pega-RULES:String).equals(.pxObjClass, \"Rule-Obj-Flow\")", "FUAInstance-NullMyStepPage");
}
boolean pz_33 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Rule-Obj-Flow" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).equals(.pxObjClass, \"Rule-Obj-Flow\")",pz_33);
if (pz_33) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).equals(.pxObjClass, \"Rule-Obj-Flow\") " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable != \"No\"");
try {
boolean pz_35 = (!(scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("No")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable != \"No\"",pz_35);
if (!pz_35) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable != \"No\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable != \"Blocked\"");
try {
boolean pz_36 = (!(scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Blocked")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable != \"Blocked\"",pz_36);
if (!pz_36) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable != \"Blocked\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable != \"Withdrawn\"");
try {
boolean pz_37 = (!(scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Withdrawn")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable != \"Withdrawn\"",pz_37);
if (!pz_37) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable != \"Withdrawn\" " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// System.out.println("Pega -- " + pega);
Pz_15_0_1 javaStepObject = new Pz_15_0_1(pega);
// System.out.println("Instantiated class");
pz_StepStat = javaStepObject.step();
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
nextBlock = "Err";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "Err";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@hasMessages(myStepPage)");
try {
boolean pz_38 = (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", null, null, new Object[] { myStepPage })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@hasMessages(myStepPage)",pz_38);
if (pz_38) {
// branch to block RB
nextBlock = "RB";
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@hasMessages(myStepPage) " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

public class Pz_15_0_1 extends Pega.Activity {
private PublicAPI tools = null;
private PegaAPI pega = null;
public Pz_15_0_1(PegaAPI aContext) {
super(aContext);
// System.out.println("Pega in Inner -- " + pega);
tools = aContext;
pega = aContext;
}
public void perform() {}
public boolean step() {
Page  myStepPage = new Page(tools, tools.getStepPage());
ParameterPage  newParamsPage = new ParameterPage();
newParamsPage.setValue("Operation", "SaveAs");

// BUG-71559 skip starting flow validation for case type rule form SaveAs
newParamsPage.setValue("SkipSFValidation", tools.getParamValue("SkipSFValidation")); 

if (!tools.getParamValue("validateParamName1").equals(""))
   newParamsPage.setValue(tools.getParamValue("validateParamName1"), tools.getParamValue("validateParamValue1"));
						
editRule(myStepPage);
ClipboardPage cbpStepPage = tools.getStepPage();

/** Bug-38018 RUF with changed params cannot be saved in ruleset which has Checkout disabled.Removing pzInsKey*/
String stepPgClass= myStepPage.getObjClass();
/* BUG-103486: Setting pzInsKey into pyActionName to use it in CheckIfKeyChanged activity in case of Save As of RUF with changed params */
if(stepPgClass.equals("Rule-Utility-Function"))
     cbpStepPage.getProperty("pyActionName").setValue(cbpStepPage.getString("pzInsKey"));
cbpStepPage.remove("pzInsKey");

doActivity(stepPgClass, "StandardValidate", myStepPage, newParamsPage);
myStepPage.doActivity("Validate", newParamsPage);
editRule(null);

/*
B-12945 - duplicate records loophole closure.
BUG-31235 - Moved this check below the call to Validate so functions have a chance to get a new key if params are different
Clearing the psInKey so doesRuleAlreadyExist will work correctly
*/
cbpStepPage.remove("pzInsKey");
boolean bDuplicateRule = ((PegaDatabase)tools.getDatabase()).doesRuleAlreadyExist(cbpStepPage);
if (bDuplicateRule)
{
	/*Duplicate record already exists. 
	Same RR properties AND different pzInsKey 
	*/
	cbpStepPage.addMessage("pzRuleAlreadyExists");
}
return true;

}//close the method
}//close the inner class

/**
 * Check MT compatibility.
 * <p>
 * Step 16 <code>call pzValidateForMT</code><br>
 */
public boolean step16_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzValidateForMT");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).startsWith(.pxObjClass, \"Rule-\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@(Pega-RULES:String).startsWith(.pxObjClass, \"Rule-\")", "FUAInstance-NullMyStepPage");
}
boolean pz_39 = (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", "Pega-RULES", "String", new Object[] { scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Rule-" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).startsWith(.pxObjClass, \"Rule-\")",pz_39);
if (!pz_39) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).startsWith(.pxObjClass, \"Rule-\") " + anyException.getMessage(), anyException);
}
boolean pz__1 = pega.invokeWhen("pyIsTenant", "Rule-", "Rule-");
if (!pz__1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("call pzValidateForMT", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pzValidateForMT
if (myStepPage == null) {
}
// Calling Activity : pzValidateForMT

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzValidateForMT", "Rule-", "");
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
nextBlock = "Err";
return true;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
// OnException block defined for this step
nextBlock = "Err";
return true;
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__3 = pega.invokeWhen("hasMessages", "Rule-", "Rule-");
if (pz__3) {
// branch to block RB
nextBlock = "RB";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "16";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzValidateForMT",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step16_circum0 definition

/**
 * Check MT compatibility - this validation is common for all rule records.
 * <p>
 * Step 17 <code>call pzStandardValidateForMT</code><br>
 */
public boolean step17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzStandardValidateForMT");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__5 = pega.invokeWhen("pyIsMultiTenant", "Rule-", "Rule-");
if (!pz__5) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:String).startsWith(.pxObjClass, \"Rule-\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@(Pega-RULES:String).startsWith(.pxObjClass, \"Rule-\")", "FUAInstance-NullMyStepPage");
}
boolean pz_40 = (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", "Pega-RULES", "String", new Object[] { scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Rule-" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:String).startsWith(.pxObjClass, \"Rule-\")",pz_40);
if (!pz_40) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:String).startsWith(.pxObjClass, \"Rule-\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("call pzStandardValidateForMT", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pzStandardValidateForMT
if (myStepPage == null) {
}
// Calling Activity : pzStandardValidateForMT

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzStandardValidateForMT", "Rule-", "");
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
boolean pz__7 = pega.invokeWhen("hasMessages", "Rule-", "Rule-");
if (pz__7) {
// branch to block RB
nextBlock = "RB";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "17";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pzStandardValidateForMT",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

/**
 * set pzInvalidateCss to true and add pulse entry.
 * <p>
 * Step 18 <code>Java</code><br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// System.out.println("Pega -- " + pega);
Pz_18_0_1 javaStepObject = new Pz_18_0_1(pega);
// System.out.println("Instantiated class");
pz_StepStat = javaStepObject.step();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

public class Pz_18_0_1 extends Pega.Activity {
private PublicAPI tools = null;
private PegaAPI pega = null;
public Pz_18_0_1(PegaAPI aContext) {
super(aContext);
// System.out.println("Pega in Inner -- " + pega);
tools = aContext;
pega = aContext;
}
public void perform() {}
public boolean step() {
Page  myStepPage = new Page(tools, tools.getStepPage());
ClipboardPage page = tools.getPrimaryPage();
boolean isAParentOf = tools.getThread().getDictionary().getClassInfo("Rule-Stream").isAncestorOf(page.getClassName()) 
|| tools.getThread().getDictionary().getClassInfo("Rule-Obj-Property").isAncestorOf(page.getClassName()) || tools.getThread().getDictionary().getClassInfo("Rule-Portal-Skin").isAncestorOf(page.getClassName()) 
|| (tools.getThread().getDictionary().getClassInfo("Rule-File-Text").isAncestorOf(page.getClassName()) && page.getString("pyFileType").equals("js"));

if(isAParentOf){
    page.getProperty("pzInvalidateCss").setValue("true");
}
return true;

}//close the method
}//close the inner class

/**
 * If RuleAvailable No/Blocked/Withdrawn, remove warnings.
 * <p>
 * Step 19 <code>Property-Remove</code><br>
 */
public boolean step19_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean doWhenProcessing = true;
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"No\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRuleAvailable==\"No\"", "FUAInstance-NullMyStepPage");
}
boolean pz_41 = (scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("No"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"No\"",pz_41);
if (pz_41) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable==\"No\" " + anyException.getMessage(), anyException);
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Withdrawn\"");
try {
boolean pz_42 = (scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Withdrawn"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Withdrawn\"",pz_42);
if (pz_42) {
doWhenProcessing = false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable==\"Withdrawn\" " + anyException.getMessage(), anyException);
}
}
if (doWhenProcessing) {
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Blocked\"");
try {
boolean pz_43 = (scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Blocked"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Blocked\"",pz_43);
if (!pz_43) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable==\"Blocked\" " + anyException.getMessage(), anyException);
}
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: .pxWarnings
ClipboardProperty pz_44 = myStepPage.getIfPresent("pxWarnings");
try {if (pz_44!= null) {
pz_44.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 19.";
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
pz_CurrentStepNum = "19";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * clear the cache.
 * <p>
 * Step 20 <code>call CheckCache</code><br>
 */
public boolean step20_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call CheckCache");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call CheckCache", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call CheckCache
if (myStepPage == null) {
}
// Calling Activity : CheckCache

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "Save As"
newParamsPage.putParamValue("Operation", PropertyInfo.TYPE_TEXT, "Save As");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "CheckCache", "Rule-", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call CheckCache",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step20_circum0 definition

/**
 * Set Update fields (AFTER cache).
 * <p>
 * Step 21 <code>Property-Set-Special</code><br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set-Special", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set-Special
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pxUpdateOperator", pRef_45, myStepPage, scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateOpName", pRef_46, myStepPage, scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateDateTime", pRef_47, myStepPage, com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, createDateTime), "sMY", false, true);
}
{
    pega.setViaPropRef(".pxUpdateSystemID", pRef_48, myStepPage, scalarValueQuery_26.resolveToString(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set-Special",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * See containing activity for behavior, if any.
 * <p>
 * Step 22 <code>Call pzSetManageChangeLogParameters</code><br>
 */
public boolean step22_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSetManageChangeLogParameters");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzSetManageChangeLogParameters", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzSetManageChangeLogParameters
if (myStepPage == null) {
}
// Calling Activity : pzSetManageChangeLogParameters
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pzSetManageChangeLogParameters", "Rule-", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSetManageChangeLogParameters",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_circum0 definition

/**
 * Step 23 <code>call History_add</code><br>
 */
public boolean step23_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call History_add");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call History_add", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call History_add
if (myStepPage == null) {
}
// Calling Activity : History_add

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "SaveAs"
newParamsPage.putParamValue("RuleAction", PropertyInfo.TYPE_TEXT, "SaveAs");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: pxRequestor.pyUserIdentifier
newParamsPage.putParamValue("ForOperatorID", PropertyInfo.TYPE_TEXT, scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT));
// Expression: Param.HistoryMemo
newParamsPage.putParamValue("HistoryMemo", PropertyInfo.TYPE_TEXT, tools.getParamValue("HistoryMemo"));
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "History_add", "Rule-", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call History_add",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step23_circum0 definition

/**
 * Do a deferred save.
 * <p>
 * Step 24 <code>Obj-Save</code><br>
 */
public boolean step24_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Save");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Save", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Save
String myPageName = myStepPage.getName();
boolean autoPopulateDisabledStatus = tools.getThread().getDisableAutoPopulate();
try {
tools.getThread().setDisableAutoPopulate(true);tools.getDatabase().saveDeferred(myStepPage, false, true, false);
} catch (BadInputException bie) {
if (oLog.isDebugEnabled()) oLog.debug("obj-save failed due to an invalid page.", bie);
} catch (PRException pre) {
oLog.error("obj-save failed.", pre);
} finally {
tools.getThread().setDisableAutoPopulate(autoPopulateDisabledStatus);}} finally {
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
boolean pz__9 = pega.invokeWhen("StepStatusGood", "Rule-", "Rule-");
if (!pz__9) {
// branch to block Err
nextBlock = "Err";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "24";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Save",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step24_circum0 definition

/**
 * See containing activity for behavior, if any.
 * <p>
 * Step 25 <code>Call pzManageChangeLog</code><br>
 */
public boolean step25_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzManageChangeLog");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzManageChangeLog", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzManageChangeLog
if (myStepPage == null) {
}
// Calling Activity : pzManageChangeLog

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: Param.DoesRuleAlreadyExist
newParamsPage.putParamValue("DoesRuleAlreadyExist", PropertyInfo.TYPE_TEXT, tools.getParamValue("DoesRuleAlreadyExist"));
// Expression: save
newParamsPage.putParamValue("CalledBy", PropertyInfo.TYPE_TEXT, "save");
// Expression: Param.SourceSaveDateTime
newParamsPage.putParamValue("SourceSaveDateTime", PropertyInfo.TYPE_DATETIME, tools.getParamValue("SourceSaveDateTime"));

pega.invokeActivity(myStepPage, newParamsPage, "pzManageChangeLog", "Rule-", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzManageChangeLog",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step25_circum0 definition

/**
 * add a pulse entry to the base version of the rule after checkin is successful.
 * <p>
 * Step 26 <code>java</code><br>
 */
public boolean step26_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
// System.out.println("Pega -- " + pega);
Pz_26_0_1 javaStepObject = new Pz_26_0_1(pega);
// System.out.println("Instantiated class");
pz_StepStat = javaStepObject.step();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step26_circum0 definition

public class Pz_26_0_1 extends Pega.Activity {
private PublicAPI tools = null;
private PegaAPI pega = null;
public Pz_26_0_1(PegaAPI aContext) {
super(aContext);
// System.out.println("Pega in Inner -- " + pega);
tools = aContext;
pega = aContext;
}
public void perform() {}
public boolean step() {
Page  myStepPage = new Page(tools, tools.getStepPage());
ClipboardPage page = tools.getStepPage();
boolean  pzInvalidateCss = page.getBoolean("pzInvalidateCss");

if(pzInvalidateCss)
{
Dictionary dictionary = tools.getThread().getDictionary();
		boolean isAParentOf = dictionary.getClassInfo("Rule-Stream").isAncestorOf(page.getClassName()) 
		|| dictionary.getClassInfo("Rule-Obj-Property").isAncestorOf(page.getClassName());
    if(isAParentOf)
    {
      page.putString("pzInvalidateCss","true");
      //Add to updates Cache
      try{
         tools.getDatabase().addToUpdatesCache("Cache", page, 
               "false&pyRuleSet="+page.getString("pyRuleSet")+
               "&pzInvalidateCss=true", false, true);
         }catch(DatabaseException exception){
            oLog.error("DatabaseException while trying to add Streams to UpdatesCache", exception);
        }
    }

}
return true;

}//close the method
}//close the inner class

/**
 * Call pyPostSave extension activity.
 * <p>
 * Step 27 <code>call pyPostSaveAs</code><br>
 */
public boolean step27_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pyPostSaveAs");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("call pyPostSaveAs", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  call pyPostSaveAs
if (myStepPage == null) {
}
// Calling Activity : pyPostSaveAs
ParameterPage newParamsPage = null;
pega.invokeActivity(myStepPage, newParamsPage, "pyPostSaveAs", "Rule-", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "call pyPostSaveAs",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step27_circum0 definition

/**
 * setting the orginal instance key in case its empty.
 * <p>
 * Step 28 <code>Property-Set</code><br>
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pzOriginalInstanceKey==\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pzOriginalInstanceKey==\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_50 = (scalarValueQuery_49.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pzOriginalInstanceKey==\"\"",pz_50);
if (!pz_50) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pzOriginalInstanceKey==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pzOriginalInstanceKey", pRef_12, myStepPage, scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
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
 * Copy any links.
 * <p>
 * Step 29 <code>Call CopyLinksForSaveAs</code><br>
 */
public boolean step29_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call CopyLinksForSaveAs");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"No\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRuleAvailable==\"No\"", "FUAInstance-NullMyStepPage");
}
boolean pz_51 = (scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("No"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"No\"",pz_51);
if (pz_51) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable==\"No\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Blocked\"");
try {
boolean pz_52 = (scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Blocked"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Blocked\"",pz_52);
if (pz_52) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable==\"Blocked\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Withdrawn\"");
try {
boolean pz_53 = (scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Withdrawn"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Withdrawn\"",pz_53);
if (pz_53) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable==\"Withdrawn\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call CopyLinksForSaveAs", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call CopyLinksForSaveAs
if (myStepPage == null) {
}
// Calling Activity : CopyLinksForSaveAs

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: local.OriginalRuleName
newParamsPage.putParamValue("OriginalRuleName", PropertyInfo.TYPE_TEXT, OriginalRuleName);
// Expression: true
String pz_54 = String.valueOf(true);
newParamsPage.putParamValue("DoNotUpdateFeatureLinks", PropertyInfo.TYPE_TRUEFALSE, pz_54);
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "CopyLinksForSaveAs", "Rule-", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call CopyLinksForSaveAs",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step29_circum0 definition

/**
 * Remove property pyLinkedSpecsForRule if rule name changes.
 * <p>
 * Step 30 <code>Property-Remove</code><br>
 */
public boolean step30_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__11 = pega.invokeWhen("pyFeaturesToggle", "Rule-", "Rule-");
if (!pz__11) {
// branch to block Chk
nextBlock = "Chk";
pega.activityStepSkipped("Jump To Step");
return false;
}
boolean pz__13 = pega.invokeWhen("pzIsLinkableRuleType", "Rule-", "Rule-");
if (!pz__13) {
// branch to block Chk
nextBlock = "Chk";
pega.activityStepSkipped("Jump To Step");
return false;
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.OriginalRuleName==primary.pyRuleName");
try {
boolean pz_55 = (tools.getParamValue("OriginalRuleName").equals(scalarValueQuery_1.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.OriginalRuleName==primary.pyRuleName",pz_55);
if (pz_55) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.OriginalRuleName==primary.pyRuleName " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Remove
// Expression: .pyLinkedFeaturesForRule
if (myStepPage == null) {
throw new InvalidReferenceException(".pyLinkedFeaturesForRule", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_56 = myStepPage.getIfPresent("pyLinkedFeaturesForRule");
try {if (pz_56!= null) {
pz_56.removeFromClipboard();
}
} catch (Exception ex ) {
	String strErrMessage = "Exception caught in "+ pz_CurrentRuleKey +" at Step 30.";
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
pz_CurrentStepNum = "30";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step30_circum0 definition

/**
 * Copy links.
 * <p>
 * Step 31 <code>Call Link-Feature.pxUpdateFeatureRuleLink</code><br>
 */
public boolean step31_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Link-Feature.pxUpdateFeatureRuleLink");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"No\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyRuleAvailable==\"No\"", "FUAInstance-NullMyStepPage");
}
boolean pz_57 = (scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("No"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"No\"",pz_57);
if (pz_57) {
// branch to block Chk
nextBlock = "Chk";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable==\"No\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Blocked\"");
try {
boolean pz_58 = (scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Blocked"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Blocked\"",pz_58);
if (pz_58) {
// branch to block Chk
nextBlock = "Chk";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable==\"Blocked\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Withdrawn\"");
try {
boolean pz_59 = (scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Withdrawn"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyRuleAvailable==\"Withdrawn\"",pz_59);
if (pz_59) {
// branch to block Chk
nextBlock = "Chk";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyRuleAvailable==\"Withdrawn\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "local.OriginalRuleName==primary.pyRuleName");
try {
boolean pz_60 = (OriginalRuleName.equals(scalarValueQuery_1.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "local.OriginalRuleName==primary.pyRuleName",pz_60);
if (!pz_60) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("local.OriginalRuleName==primary.pyRuleName " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pzOriginalInstanceKey==\"\"");
try {
boolean pz_61 = (scalarValueQuery_49.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pzOriginalInstanceKey==\"\"",pz_61);
if (pz_61) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pzOriginalInstanceKey==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call Link-Feature.pxUpdateFeatureRuleLink", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call Link-Feature.pxUpdateFeatureRuleLink
if (myStepPage == null) {
}
// Calling Activity : Link-Feature.pxUpdateFeatureRuleLink

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: true
String pz_62 = String.valueOf(true);
newParamsPage.putParamValue("SkipCommit", PropertyInfo.TYPE_TRUEFALSE, pz_62);
// Expression: false
String pz_63 = String.valueOf(false);
newParamsPage.putParamValue("OnlyDelete", PropertyInfo.TYPE_TRUEFALSE, pz_63);
// Expression: Primary.pzOriginalInstanceKey
newParamsPage.putParamValue("RuleKey", PropertyInfo.TYPE_TEXT, scalarValueQuery_49.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
// Expression: false
String pz_64 = String.valueOf(false);
newParamsPage.putParamValue("DeleteSourceRules", PropertyInfo.TYPE_TRUEFALSE, pz_64);

pega.invokeActivity(myStepPage, newParamsPage, "pxUpdateFeatureRuleLink", "Rule-", "Link-Feature");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call Link-Feature.pxUpdateFeatureRuleLink",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step31_circum0 definition

/**
 * If bad status from copying links, clear it.
 * <p>
 * Step 32 [Chk] <code>Java</code><br>
 */
public boolean step32_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__15 = pega.invokeWhen("StepStatusFail", "Rule-", "Rule-");
if (!pz__15) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "SaveAs - Precondition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// System.out.println("Pega -- " + pega);
Pz_32_0_1 javaStepObject = new Pz_32_0_1(pega);
// System.out.println("Instantiated class");
pz_StepStat = javaStepObject.step();
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
boolean pz__17 = true;
if (pz__17) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "SaveAs - Transition", null);
pz_CheckMessage = false;
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "SaveAs - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "32";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step32_circum0 definition

public class Pz_32_0_1 extends Pega.Activity {
private PublicAPI tools = null;
private PegaAPI pega = null;
public Pz_32_0_1(PegaAPI aContext) {
super(aContext);
// System.out.println("Pega in Inner -- " + pega);
tools = aContext;
pega = aContext;
}
public void perform() {}
public boolean step() {
Page  myStepPage = new Page(tools, tools.getStepPage());
tools.getActivityStatus().backoutWorst();
return true;

}//close the method
}//close the inner class

/**
 * Add a fail message to page.
 * <p>
 * Step 33 [Err] <code>Java</code><br>
 */
public boolean step33_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// System.out.println("Pega -- " + pega);
Pz_33_0_1 javaStepObject = new Pz_33_0_1(pega);
// System.out.println("Instantiated class");
pz_StepStat = javaStepObject.step();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step33_circum0 definition

public class Pz_33_0_1 extends Pega.Activity {
private PublicAPI tools = null;
private PegaAPI pega = null;
public Pz_33_0_1(PegaAPI aContext) {
super(aContext);
// System.out.println("Pega in Inner -- " + pega);
tools = aContext;
pega = aContext;
}
public void perform() {}
public boolean step() {
Page  myStepPage = new Page(tools, tools.getStepPage());
String strMessage = tools.getActivityStatus().getWorstMessage();
tools.getPrimaryPage().addMessage("pySaveFailed\t" + strMessage);
return true;

}//close the method
}//close the inner class

/**
 * Rollback after error.
 * <p>
 * Step 34 [RB] <code>Java</code><br>
 */
public boolean step34_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// System.out.println("Pega -- " + pega);
Pz_34_0_1 javaStepObject = new Pz_34_0_1(pega);
// System.out.println("Instantiated class");
pz_StepStat = javaStepObject.step();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step34_circum0 definition

public class Pz_34_0_1 extends Pega.Activity {
private PublicAPI tools = null;
private PegaAPI pega = null;
public Pz_34_0_1(PegaAPI aContext) {
super(aContext);
// System.out.println("Pega in Inner -- " + pega);
tools = aContext;
pega = aContext;
}
public void perform() {}
public boolean step() {
Page  myStepPage = new Page(tools, tools.getStepPage());
try
{
	tools.getDatabase().rollback();
} 
catch (DatabaseException e)
{
	tools.getPrimaryPage().addMessage("pyRollBackFailed\t" + e.getMessage());
}
return true;

}//close the method
}//close the inner class

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

public String OriginalRuleName = "";
public String createDateTime = "";

public void initializeUserLocalVariables() {
	OriginalRuleName = "";
	createDateTime = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("OriginalRuleName", (OriginalRuleName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : OriginalRuleName.toString());
	smRetVal.putString("createDateTime", (createDateTime == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : createDateTime.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

public static final String[] pRef_27 = new String[] { "", "", "pxOriginalCreateOpName", "" };
public static final String[] pRef_5 = new String[] { "", "", "pxInstanceLockedBy", "" };
public static final String[] pRef_7 = new String[] { "", "", "pxInstanceLockedKey", "" };
public static final String[] pRef_12 = new String[] { "", "", "pzOriginalInstanceKey", "" };
public static final String[] pRef_25 = new String[] { "", "", "pxCreateSystemID", "" };
public static final String[] pRef_28 = new String[] { "", "", "pxOriginalCreateOperator", "" };
public static final String[] pRef_29 = new String[] { "", "", "pxOriginalCreateDateTime", "" };
public static final String[] pRef_47 = new String[] { "", "", "pxUpdateDateTime", "" };
public static final String[] pRef_9 = new String[] { "", "", "pxInstanceLockedRuleSetVersion", "" };
public static final String[] pRef_14 = new String[] { "", "", "pxCreateDateTime", "" };
public static final String[] pRef_45 = new String[] { "", "", "pxUpdateOperator", "" };
public static final String[] pRef_48 = new String[] { "", "", "pxUpdateSystemID", "" };
public static final String[] pRef_6 = new String[] { "", "", "pxInstanceLockedDateTime", "" };
public static final String[] pRef_8 = new String[] { "", "", "pxInstanceLockedRuleSet", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyBaseRule", "" };
public static final String[] pRef_30 = new String[] { "", "", "pxOriginalCreateSystemID", "" };
public static final String[] pRef_17 = new String[] { "", "", "pxCreateOperator", "" };
public static final String[] pRef_21 = new String[] { "", "", "pxCreateOpName", "" };
public static final String[] pRef_46 = new String[] { "", "", "pxUpdateOpName", "" };
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_22 = FUAUtil.createQueryBuilder().scalarProperty("pyUserName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_49 = FUAUtil.createQueryBuilder().scalarProperty("pzOriginalInstanceKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_32 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pyUserIdentifier").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().scalarProperty("pxSystemName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_19 = FUAUtil.createQueryBuilder().scalarProperty("pxCreateOpName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().scalarProperty("pxCreateSystemID").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleAvailable").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pxCreateOperator").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE- SAVEAS #20190329T084002.329 GMT", "Rule- SaveAs", "Pega-Desktop", "08-03-01", true, false, "", "ACTIVITY", "20190329T084002.329 GMT" ,"Rule-Obj-Activity"); }
