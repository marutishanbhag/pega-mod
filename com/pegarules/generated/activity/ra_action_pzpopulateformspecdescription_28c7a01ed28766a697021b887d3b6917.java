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
public class ra_action_pzpopulateformspecdescription_28c7a01ed28766a697021b887d3b6917 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzPopulateFormSpecDescription.Data_MO.Action");
	public ra_action_pzpopulateformspecdescription_28c7a01ed28766a697021b887d3b6917(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 3 Circum: 0" );
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
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
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
PRStackFrame pz_StackFrame6_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 6 Circum: 0" );
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
PRStackFrame pz_StackFrame7_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 7 Circum: 0" );
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
PRStackFrame pz_StackFrame8_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 8 Circum: 0" );
try {
pz_Status = step8_circum0();
} finally {
pega.popStackFrame(pz_StackFrame8_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 9_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("GetLinks"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "9";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 9_circum0");
}
PRStackFrame pz_StackFrame9_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 9 Circum: 0" );
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
PRStackFrame pz_StackFrame10_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 10 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
String pz_13 = "SpecPage";
thisStepPage = tools.findPage(pz_13, true);
PRStackFrame pz_StackFrame11_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 11 Circum: 0" );
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
PRStackFrame pz_StackFrame12_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 12 Circum: 0" );
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
String pz_17 = "SpecPage";
thisStepPage = tools.findPage(pz_17, true);
PRStackFrame pz_StackFrame13_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 13 Circum: 0" );
try {
pz_Status = step13_circum0();
} finally {
pega.popStackFrame(pz_StackFrame13_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 14_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("RemoveLinks"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "14";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 14_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_28 = "SpecLinks";
thisStepPage = tools.findPage(pz_28, true);
PRStackFrame pz_StackFrame14_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 14 Circum: 0" );
try {
pz_Status = step14_circum0();
} finally {
pega.popStackFrame(pz_StackFrame14_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 15_circum0
pz_Status = true;
if ((nextBlock.equals("") || nextBlock.equals("Set"))) {
nextBlock = "";
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "15";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 15_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_29 = "SpecPage";
thisStepPage = tools.findPage(pz_29, true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(pz_29, false);
thisStepPage.putString("pxObjClass", "Rule-Application-UseCase");
}
PRStackFrame pz_StackFrame15_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT Step: 15 Circum: 0" );
try {
pz_Status = step15_circum0();
} finally {
pega.popStackFrame(pz_StackFrame15_circum0, false);
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
	"Rule-Obj-Activity:PZPOPULATEFORMSPECDESCRIPTION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPOPULATEFORMSPECDESCRIPTION","Rule-Obj-Activity","DATA-MO",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT","!PZPOPULATEFORMSPECDESCRIPTION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1274737209)
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
//	RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT:20180713T141012.871 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "64f60bac26ce4a89bcab553f5b7410cf";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-MO";
	}
public String getAspect() {
return "Action";
}
/**
 * Create backup of step specification information.
 * <p>
 * Step 1 <code>Page-Copy</code><br>
 */
public boolean step1_circum0() {
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
// Expression: SpecPage
sourcePage = tools.findPage("SpecPage", true);
// Expression: SpecPageBkp
targetPage = tools.findPage("SpecPageBkp", false);
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Create backup of step specification  links  information.
 * <p>
 * Step 2 <code>Page-Copy</code><br>
 */
public boolean step2_circum0() {
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
// Expression: SpecLinks
sourcePage = tools.findPage("SpecLinks", true);
// Expression: SpecLinksBkp
targetPage = tools.findPage("SpecLinksBkp", false);
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
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Remove the spec related  pages.
 * <p>
 * Step 3 <code>Page-Remove</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: SpecLinks
pageRemove(tools.findPage("SpecLinks"));
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
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Get the connector name.
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
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    connectorName = scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
 * Get the flow inskey.
 * <p>
 * Step 6 <code>java</code><br>
 */
public boolean step6_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pageParam_FlowPage = tools.findPage(tools.getParamValue("FlowPage"));
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
boolean isFlowPage = true;
ClipboardPage flowPage = myStepPage;
while(isFlowPage){
  
  flowPage = flowPage.getParentPage();
  if(flowPage.getString(".pxObjClass").equals("Rule-Obj-Flow")){
    isFlowPage = false;
  }
}

if(flowPage != null){
  flowKey= flowPage.getString("pzInsKey");
}

tools.putParamValue("FlowPage",flowPage.getReference());
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step6_circum0 definition

/**
 * Copy the spec details from connector to SpecPage.
 * <p>
 * Step 7 <code>Page-Copy</code><br>
 */
public boolean step7_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "FlowPage.pyModelProcess.pyConnectors(local.connectorName).pySpecPage.pyPurpose!=\"\"");
try {
boolean pz_3 = (!(scalarValueQuery_2.resolveToString(tools, pega.findPage(tools.getParamValue("FlowPage"), "Rule-Obj-Flow"), ImmutablePropertyInfo.TYPE_TEXT, connectorName).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "FlowPage.pyModelProcess.pyConnectors(local.connectorName).pySpecPage.pyPurpose!=\"\"",pz_3);
if (!pz_3) {
// branch to block GetLinks
nextBlock = "GetLinks";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("FlowPage.pyModelProcess.pyConnectors(local.connectorName).pySpecPage.pyPurpose!=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: FlowPage.pyModelProcess.pyConnectors(local.connectorName).pySpecPage
ClipboardPage pz_5 = pageQuery_4.resolve(tools, pega.findPage(tools.getParamValue("FlowPage"), "Rule-Obj-Flow"), connectorName);
sourcePage = pz_5;
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
pz_CurrentStepNum = "7";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step7_circum0 definition

/**
 * Copy the spec links from connector to SpecLinks.
 * <p>
 * Step 8 <code>Page-Copy</code><br>
 */
public boolean step8_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Copy", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Copy
ClipboardPage sourcePage = null;
ClipboardPage targetPage = null;
// Expression: FlowPage.pyModelProcess.pyConnectors(local.connectorName).pySpecLinks
ClipboardPage pz_7 = pageQuery_6.resolve(tools, pega.findPage(tools.getParamValue("FlowPage"), "Rule-Obj-Flow"), connectorName);
sourcePage = pz_7;
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__1 = true;
if (pz__1) {
// branch to block Set
nextBlock = "Set";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "8";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Copy",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step8_circum0 definition

/**
 * Get flow's specification links.
 * <p>
 * Step 9 [GetLinks] <code>Obj-Browse</code><br>
 */
public boolean step9_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyUseCaseName!=\"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyUseCaseName!=\"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_9 = (!(scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyUseCaseName!=\"\"",pz_9);
if (!pz_9) {
// branch to block Set
nextBlock = "Set";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyUseCaseName!=\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Link-UseCase
ClipboardPage browsePage = null;
// Expression: SpecLinks
browsePage = tools.findPage("SpecLinks", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "SpecLinks");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Link-UseCase");
browsePage.putString("pyMaxRecords", "10000");

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "");
contentPage.putString("pyDataSource", "Link-UseCase");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "true");
// Expression: pzInsKey
contentPage.putString("pyRowKey", "pzInsKey");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;
// Expression: local.flowKey

//Code for Label : 
selectPage.putString("pyField", ".pyFlowKey");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(1).pyPropertyName", ".pyFlowKey");
browsePage.putString(".pyMapping(1).pyClassName", "Link-UseCase");
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyFlowKey");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", flowKey);
paramPage.putString("pyConditionValue1String", flowKey);
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: Param.MOId

//Code for Label : 
selectPage.putString("pyField", ".pyTaskID");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(2).pyPropertyName", ".pyTaskID");
browsePage.putString(".pyMapping(2).pyClassName", "Link-UseCase");
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyTaskID");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", tools.getParamValue("MOId"));
paramPage.putString("pyConditionValue1String", tools.getParamValue("MOId"));
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : 
selectPage.putString("pyField", ".pxLinkedRefFrom");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(3).pyPropertyName", ".pxLinkedRefFrom");
browsePage.putString(".pyMapping(3).pyClassName", "Link-UseCase");
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pxLinkedRefFrom");
paramPage.putString("pyConditionOperation", "IsNotNull");
paramPage.putString("pyCondValueCategory", "singlevalue");
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : 
selectPage.putString("pyField", ".pzInsKey");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(4).pyPropertyName", ".pzInsKey");
browsePage.putString(".pyMapping(4).pyClassName", "Link-UseCase");
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Link-UseCase", "} ", whereClause, sortClause);
	tools.getDatabase().executeRDB(sql , browsePage);
}	catch (DatabaseException e) {
		browsePage.addMessage(e.getMessage());
		}	catch (Exception e) {
		browsePage.addMessage(e.getMessage());
		}
catch (PRRuntimeError e) {
		browsePage.addMessage(e.getMessage());
		} finally {
	if (contentPage != null) {
		contentPage.removeFromClipboard();
	}
	if (selectPage != null) {
		selectPage.removeFromClipboard();
	}
	if (paramPage != null) {
		paramPage.removeFromClipboard();
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
}	// end try block for step body
PRStackFrame pz_tranStackFrame = pega.pushStackFrame(null, false, true, PRStackFrame.Type.TRANSITIONS );
try {	// Transitions
boolean pz__2 = pega.invokeWhen("StepStatusFail", "Data-MO", "Data-MO");
if (pz__2) {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzPopulateFormSpecDescription - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "9";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step9_circum0 definition

/**
 * Get the spec inskey from links.
 * <p>
 * Step 10 <code>Property-Set</code><br>
 */
public boolean step10_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Utilities).SizeOfPropertyList(SpecLinks.pxResults) &gt;0");
try {
boolean pz_10 = ((pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", "Pega-RULES", "Utilities", new Object[] { pega.findPageWithException("SpecLinks", "Code-Pega-List").getProperty("pxResults") })).intValue() > 0);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Utilities).SizeOfPropertyList(SpecLinks.pxResults) &gt;0",pz_10);
if (!pz_10) {
// branch to block Set
nextBlock = "Set";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Utilities).SizeOfPropertyList(SpecLinks.pxResults) &gt;0 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    SpecificationLink = scalarValueQuery_11.resolveToString(tools, pega.findPageWithException("SpecLinks", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT);
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
 * Step 11 <code>Obj-Open-By-Handle</code> [on page SpecPage] <br>
 */
public boolean step11_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle");
try {
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Local.SpecificationLink==\"\"");
try {
boolean pz_14 = (SpecificationLink.equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Local.SpecificationLink==\"\"",pz_14);
if (pz_14) {
// branch to block Set
nextBlock = "Set";
pega.activityStepSkipped("Jump To Step");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Local.SpecificationLink==\"\" " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@(Pega-RULES:Utilities).SizeOfPropertyList(SpecLinks.pxResults) ==1");
try {
boolean pz_15 = ((pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", "Pega-RULES", "Utilities", new Object[] { pega.findPageWithException("SpecLinks", "Code-Pega-List").getProperty("pxResults") })).intValue() == 1);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@(Pega-RULES:Utilities).SizeOfPropertyList(SpecLinks.pxResults) ==1",pz_15);
if (!pz_15) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@(Pega-RULES:Utilities).SizeOfPropertyList(SpecLinks.pxResults) ==1 " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open-By-Handle", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open-By-Handle
String pz_16 = "SpecPage";
myStepPage = tools.findPage(pz_16, true);
// Expression: Local.SpecificationLink
// Expression: 
// Obj-Open-By-Handle
try {
	ClipboardPage temp = objOpenByHandle(SpecificationLink, "SpecPage", "", false, false, false);
	if(temp != null)
		myStepPage = temp;
} catch (DatabaseException dbEx) {
	oLog.error("Error in Obj-Open-By-Handle", dbEx);
}} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
boolean pz__4 = pega.invokeWhen("StepStatusGood", "Data-MO", "Rule-Application-UseCase");
if (pz__4) {
// branch to block Set
nextBlock = "Set";
return false;
} else {
// Skip remaining steps in this activity
nextBlock = "***";
tools.getStepStatus().set(ProcessingStatus.SEVERITY_GOOD, "pzPopulateFormSpecDescription - Transition", null);
pz_CheckMessage = false;
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "11";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open-By-Handle",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step11_circum0 definition

/**
 * Get productname , owner and purpose.
 * <p>
 * Step 12 <code>Obj-Browse</code><br>
 */
public boolean step12_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Rule-Application-UseCase
ClipboardPage browsePage = null;
// Expression: TempSpecPage
browsePage = tools.findPage("TempSpecPage", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "TempSpecPage");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Rule-Application-UseCase");
browsePage.putString("pyMaxRecords", "10000");

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "");
contentPage.putString("pyDataSource", "Rule-Application-UseCase");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "true");
// Expression: pzInsKey
contentPage.putString("pyRowKey", "pzInsKey");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;

//Code for Label : 
selectPage.putString("pyField", ".pyProductName");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(1).pyPropertyName", ".pyProductName");
browsePage.putString(".pyMapping(1).pyClassName", "Rule-Application-UseCase");

//Code for Label : 
selectPage.putString("pyField", ".pyOwner");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(2).pyPropertyName", ".pyOwner");
browsePage.putString(".pyMapping(2).pyClassName", "Rule-Application-UseCase");

//Code for Label : 
selectPage.putString("pyField", ".pyPurpose");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(3).pyPropertyName", ".pyPurpose");
browsePage.putString(".pyMapping(3).pyClassName", "Rule-Application-UseCase");
// Expression: Local.SpecificationLink

//Code for Label : 
selectPage.putString("pyField", ".pzInsKey");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(4).pyPropertyName", ".pzInsKey");
browsePage.putString(".pyMapping(4).pyClassName", "Rule-Application-UseCase");
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pzInsKey");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", SpecificationLink);
paramPage.putString("pyConditionValue1String", SpecificationLink);
contentPage.getProperty("pyParameters").add(paramPage);
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Rule-Application-UseCase", "} ", whereClause, sortClause);
	tools.getDatabase().executeRDB(sql , browsePage);
}	catch (DatabaseException e) {
		browsePage.addMessage(e.getMessage());
		}	catch (Exception e) {
		browsePage.addMessage(e.getMessage());
		}
catch (PRRuntimeError e) {
		browsePage.addMessage(e.getMessage());
		} finally {
	if (contentPage != null) {
		contentPage.removeFromClipboard();
	}
	if (selectPage != null) {
		selectPage.removeFromClipboard();
	}
	if (paramPage != null) {
		paramPage.removeFromClipboard();
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
pz_CurrentStepNum = "12";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step12_circum0 definition

/**
 * Open specification for this process.
 * <p>
 * Step 13 <code>Obj-Open</code> [on page SpecPage] <br>
 */
public boolean step13_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open");
try {
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Open", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Open
String pz_18 = "SpecPage";
myStepPage = tools.findPage(pz_18, true);
// Expression: 
// Expression: Rule-Application-UseCase
myStepPage = tools.getThread().createPage("Rule-Application-UseCase", pz_18);
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyProductName", pRef_19, myStepPage, scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("TempSpecPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT), "sIN", false, false);
}
{
    pega.setViaPropRef(".pyPurpose", pRef_22, myStepPage, scalarValueQuery_23.resolveToString(tools, pega.findPageWithException("TempSpecPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT), "sTI64", false, false);
}
{
    pega.setViaPropRef(".pyOwner", pRef_25, myStepPage, scalarValueQuery_26.resolveToString(tools, pega.findPageWithException("TempSpecPage", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, false);
}
// Obj-Open
try {
	objOpen(myStepPage, "SpecPage", "", false, false);
} catch (DatabaseException dbEx) {
	oLog.error("Error in Obj-Open", dbEx);
}} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
boolean pz__6 = pega.invokeWhen("StepStatusFail", "Data-MO", "Rule-Application-UseCase");
if (pz__6) {
// branch to block RemoveLinks
nextBlock = "RemoveLinks";
return false;
} else {
// branch to block Set
nextBlock = "Set";
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_tranStackFrame);
}
} finally {
pz_CurrentStepNum = "13";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Open",pz_AttemptedStep);
}	// end try block for prolog/epilog
} // end of step13_circum0 definition

/**
 * Step 14 [RemoveLinks] <code>Page-Remove</code> [on page SpecLinks] <br>
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
pz_CurrentStepNum = "14";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step14_circum0 definition

/**
 * Step 15 [Set] <code>Property-Set</code> [on page SpecPage] <br>
 */
public boolean step15_circum0() {
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
    pega.setViaPropRef(".pzSpecViewMode", pRef_30, myStepPage, "Form", "sTN", false, true);
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
pz_CurrentStepNum = "15";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step15_circum0 definition

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

public String Owner = "";
public String SpecificationLink = "";
public String connectorName = "";
public String flowKey = "";

public void initializeUserLocalVariables() {
	Owner = "";
	SpecificationLink = "";
	connectorName = "";
	flowKey = "";
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("Owner", (Owner == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : Owner.toString());
	smRetVal.putString("SpecificationLink", (SpecificationLink == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : SpecificationLink.toString());
	smRetVal.putString("connectorName", (connectorName == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : connectorName.toString());
	smRetVal.putString("flowKey", (flowKey == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : flowKey.toString());
	return smRetVal;
}

public ClipboardPage pageParam_FlowPage;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_FlowPage = null;
}

public static final String[] pRef_27 = new String[] { "", "", "pxResults", "1", "pyOwner", "" };
public static final String[] pRef_21 = new String[] { "", "", "pxResults", "1", "pyProductName", "" };
public static final String[] pRef_25 = new String[] { "", "", "pyOwner", "" };
public static final String[] pRef_30 = new String[] { "", "", "pzSpecViewMode", "" };
public static final String[] pRef_12 = new String[] { "", "", "pxResults", "1", "pxLinkedRefFrom", "" };
public static final String[] pRef_24 = new String[] { "", "", "pxResults", "1", "pyPurpose", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyProductName", "" };
public static final String[] pRef_22 = new String[] { "", "", "pyPurpose", "" };
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyMOId").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().page("pyModelProcess").pageGroup("pyConnectors").page("pySpecPage").scalarProperty("pyPurpose").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyUseCaseName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).scalarProperty("pyProductName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).scalarProperty("pyPurpose").buildScalarValueQuery();
private static final PageQuery pageQuery_6 = FUAUtil.createQueryBuilder().page("pyModelProcess").pageGroup("pyConnectors").page("pySpecLinks").buildPageQuery();
private static final PageQuery pageQuery_4 = FUAUtil.createQueryBuilder().page("pyModelProcess").pageGroup("pyConnectors").page("pySpecPage").buildPageQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).scalarProperty("pyOwner").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().pageList("pxResults", 1).scalarProperty("pxLinkedRefFrom").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-MO PZPOPULATEFORMSPECDESCRIPTION #20180713T141012.871 GMT", "Data-MO pzPopulateFormSpecDescription", "Pega-ProcessArchitect", "08-01-01", false, true, "", "ACTIVITY", "20180713T141012.871 GMT" ,"Rule-Obj-Activity"); }
