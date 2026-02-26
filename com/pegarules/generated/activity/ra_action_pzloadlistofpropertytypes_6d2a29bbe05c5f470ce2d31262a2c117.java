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
public class ra_action_pzloadlistofpropertytypes_6d2a29bbe05c5f470ce2d31262a2c117 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzLoadListOfPropertyTypes.Code_Pega_List.Action");
	public ra_action_pzloadlistofpropertytypes_6d2a29bbe05c5f470ce2d31262a2c117(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT	Pega-ProcessArchitect:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 4 Circum: 0" );
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
PRStackFrame pz_StackFrame5_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 5 Circum: 0" );
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 8 Circum: 0" );
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
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 9 Circum: 0" );
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
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 10 Circum: 0" );
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
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 11 Circum: 0" );
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 12 Circum: 0" );
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
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 13 Circum: 0" );
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
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 14 Circum: 0" );
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
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 15 Circum: 0" );
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
PRStackFrame pz_StackFrame17_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 17 Circum: 0" );
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
PRStackFrame pz_StackFrame18_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 18 Circum: 0" );
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
PRStackFrame pz_StackFrame19_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 19 Circum: 0" );
try {
pz_Status = step19_circum0();
} finally {
pega.popStackFrame(pz_StackFrame19_circum0, false);
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
PRStackFrame pz_StackFrame21_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 21 Circum: 0" );
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
PRStackFrame pz_StackFrame22_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 22 Circum: 0" );
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
PRStackFrame pz_StackFrame23_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 23 Circum: 0" );
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
PRStackFrame pz_StackFrame24_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT Step: 24 Circum: 0" );
try {
pz_Status = step24_circum0();
} finally {
pega.popStackFrame(pz_StackFrame24_circum0, false);
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
	"Rule-Obj-Activity:PZLOADLISTOFPROPERTYTYPES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOADLISTOFPROPERTYTYPES","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-ProcessArchitect","08-04-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT","!PZLOADLISTOFPROPERTYTYPES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",506430736)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT:20190715T200517.813 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "49a967151fce2eae0633a72be7e35112";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Action";
}
/**
 * Adds Text (single line).
 * <p>
 * Step 2 <code>Call pzAddPropertyType</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
// Expression: "Text (single line)"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Text (single line)");
// Expression: "Text"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Text");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: "pxTextInput"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxTextInput");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Adds Text (paragraph).
 * <p>
 * Step 3 <code>Call pzAddPropertyType</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "Text"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Text");
// Expression: "Paragraph"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "Paragraph");
// Expression: "Text (paragraph)"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Text (paragraph)");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Adds Boolean.
 * <p>
 * Step 4 <code>Call pzAddPropertyType</code><br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "TrueFalse"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "TrueFalse");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
// Expression: "Boolean"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Boolean");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "pxCheckbox"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxCheckbox");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

/**
 * Adds Currency.
 * <p>
 * Step 5 <code>Call pzAddPropertyType</code><br>
 */
public boolean step5_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "pxCurrency"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxCurrency");
// Expression: "Decimal"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Decimal");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
// Expression: "Currency"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Currency");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step5_circum0 definition

/**
 * Adds Date & time.
 * <p>
 * Step 6 <code>Call pzAddPropertyType</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: "Date & time"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Date & time");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "pxDateTime"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxDateTime");
// Expression: "DateTime"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "DateTime");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Adds Date only.
 * <p>
 * Step 7 <code>Call pzAddPropertyType</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "pxDateTime"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxDateTime");
// Expression: "Date only"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Date only");
// Expression: "Date"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Date");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Adds Decimal.
 * <p>
 * Step 8 <code>Call pzAddPropertyType</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "Decimal"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Decimal");
// Expression: "pxNumber"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxNumber");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Decimal"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Decimal");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Adds Email.
 * <p>
 * Step 9 <code>Call pzAddPropertyType</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "pxEmail"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxEmail");
// Expression: "Email"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Email");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
// Expression: "Text"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Text");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Adds Integer.
 * <p>
 * Step 10 <code>Call pzAddPropertyType</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Integer"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Integer");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
// Expression: "Integer"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Integer");
// Expression: "pxInteger"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxInteger");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step10_circum0 definition

/**
 * Adds Percentage.
 * <p>
 * Step 11 <code>Call pzAddPropertyType</code><br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Decimal"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Decimal");
// Expression: "pxPercentage"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxPercentage");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
// Expression: "Percentage"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Percentage");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step11_circum0 definition

/**
 * Adds Phone.
 * <p>
 * Step 12 <code>Call pzAddPropertyType</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "pxPhone"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxPhone");
// Expression: "Phone"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Phone");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: "Text"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Text");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Adds Picklist.
 * <p>
 * Step 13 <code>Call pzAddPropertyType</code><br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "Picklist"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Picklist");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: "Text"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Text");
// Expression: "Picklist"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "Picklist");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step13_circum0 definition

/**
 * Adds Time.
 * <p>
 * Step 14 <code>Call pzAddPropertyType</code><br>
 */
public boolean step14_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: "pxDateTime"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxDateTime");
// Expression: "Time"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Time");
// Expression: "TimeOfDay"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "TimeOfDay");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * Adds URL.
 * <p>
 * Step 15 <code>Call pzAddPropertyType</code><br>
 */
public boolean step15_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "Text"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Text");
// Expression: "URL"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "URL");
// Expression: "pxURL"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxURL");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Simple"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Simple");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

/**
 * Adds Attachment (Hidden for data types).
 * <p>
 * Step 17 <code>Call pzAddPropertyType</code><br>
 */
public boolean step17_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.Mode!=\"ChangeType\"");
try {
boolean pz_1 = (!(tools.getParamValue("Mode").equals("ChangeType")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.Mode!=\"ChangeType\"",pz_1);
if (!pz_1) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzLoadListOfPropertyTypes - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.Mode!=\"ChangeType\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.IsCaseType==\"false\"");
try {
boolean pz_2 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "IsCaseType") == tools.interpretBoolean("false"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.IsCaseType==\"false\"",pz_2);
if (pz_2) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.IsCaseType==\"false\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.Mode!=\"SubField\"");
try {
boolean pz_3 = (!(tools.getParamValue("Mode").equals("SubField")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.Mode!=\"SubField\"",pz_3);
if (!pz_3) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.Mode!=\"SubField\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "Attachment"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Attachment");
// Expression: "Page"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "Page");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Fancy"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Fancy");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "Attachment"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "Attachment");
// Expression: "Page"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Page");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step17_circum0 definition

/**
 * Adds Location.
 * <p>
 * Step 18 <code>Call pzAddPropertyType</code><br>
 */
public boolean step18_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.Mode!=\"SubField\"");
try {
boolean pz_4 = (!(tools.getParamValue("Mode").equals("SubField")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.Mode!=\"SubField\"",pz_4);
if (!pz_4) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.Mode!=\"SubField\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "pxAddressMap"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "pxAddressMap");
// Expression: "Location"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Location");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "Page"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Page");
// Expression: "Fancy"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Fancy");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Page"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "Page");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step18_circum0 definition

/**
 * Adds User reference.
 * <p>
 * Step 19 <code>Call pzAddPropertyType</code><br>
 */
public boolean step19_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "User reference"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "User reference");
// Expression: "String"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "String");
// Expression: "UserReference"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "UserReference");
// Expression: "Fancy"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Fancy");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Text"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Text");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step19_circum0 definition

/**
 * Adds Page (Field group).
 * <p>
 * Step 21 <code>Call pzAddPropertyType</code><br>
 */
public boolean step21_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.Mode!=\"SubField\"");
try {
boolean pz_5 = (!(tools.getParamValue("Mode").equals("SubField")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.Mode!=\"SubField\"",pz_5);
if (!pz_5) {
// Skip remaining steps in this activity
nextBlock = "***";
pega.activityStepSkipped("Exit Activity");
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzLoadListOfPropertyTypes - Precondition", null);
pz_CheckMessage = false;
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.Mode!=\"SubField\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "Page"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Page");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: ""
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "");
// Expression: "Object"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Object");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "Page"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "Page");
// Expression: "Complex types"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Complex types");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step21_circum0 definition

/**
 * Adds Page List (Field group list).
 * <p>
 * Step 22 <code>Call pzAddPropertyType</code><br>
 */
public boolean step22_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "Complex types"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Complex types");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Page List"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Page List");
// Expression: "List of objects"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "List of objects");
// Expression: "PageList"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "PageList");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: ""
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step22_circum0 definition

/**
 * Adds Data reference.
 * <p>
 * Step 23 <code>Call pzAddPropertyType</code><br>
 */
public boolean step23_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "DataReference"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "DataReference");
// Expression: "Page"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Page");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: "Data reference"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Data reference");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Page"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "Page");
// Expression: "Complex types"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Complex types");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step23_circum0 definition

/**
 * Adds Data reference list (hidden for case types / visualizer / when in express / if in form builder).
 * <p>
 * Step 24 <code>Call pzAddPropertyType</code><br>
 */
public boolean step24_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.IsFormBuilder==\"true\"");
try {
boolean pz_6 = (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "IsFormBuilder") == tools.interpretBoolean("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.IsFormBuilder==\"true\"",pz_6);
if (pz_6) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.IsFormBuilder==\"true\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.Mode==\"ERNav\"");
try {
boolean pz_7 = (tools.getParamValue("Mode").equals("ERNav"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.Mode==\"ERNav\"",pz_7);
if (pz_7) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.Mode==\"ERNav\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "param.IsExpressMode==\"true\" || param.IsCaseType==\"true\"");
try {
boolean pz_8 = ((tools.getParamValue("IsExpressMode").equals("true")) || (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "IsCaseType") == tools.interpretBoolean("true")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "param.IsExpressMode==\"true\" || param.IsCaseType==\"true\"",pz_8);
if (pz_8) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("param.IsExpressMode==\"true\" || param.IsCaseType==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzAddPropertyType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzAddPropertyType
if (myStepPage == null) {
}
// Calling Activity : pzAddPropertyType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
// Expression: "DataReference"
newParamsPage.putParamValue("Control", PropertyInfo.TYPE_TEXT, "DataReference");
// Expression: "PageList"
newParamsPage.putParamValue("PropertyMode", PropertyInfo.TYPE_TEXT, "PageList");
// Expression: "Page List"
newParamsPage.putParamValue("StringType", PropertyInfo.TYPE_TEXT, "Page List");
// Expression: "Data reference (list)"
newParamsPage.putParamValue("Label", PropertyInfo.TYPE_TEXT, "Data reference (list)");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");
// Expression: "Complex types"
newParamsPage.putParamValue("FieldsGrouping", PropertyInfo.TYPE_TEXT, "Complex types");

pega.invokeActivity(myStepPage, newParamsPage, "pzAddPropertyType", "Code-Pega-List", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzAddPropertyType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step24_circum0 definition

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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZLOADLISTOFPROPERTYTYPES #20190709T203856.094 GMT", "Code-Pega-List pzLoadListOfPropertyTypes", "Pega-ProcessArchitect", "08-04-01", false, true, "", "LOADDECLARATIVEPAGE", "20190715T200517.813 GMT" ,"Rule-Obj-Activity"); }
