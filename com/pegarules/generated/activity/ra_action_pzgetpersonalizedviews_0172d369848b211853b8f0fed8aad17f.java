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
public class ra_action_pzgetpersonalizedviews_0172d369848b211853b8f0fed8aad17f extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzGetPersonalizedViews.Pega_UI_Component_Grid.Action");
	public ra_action_pzgetpersonalizedviews_0172d369848b211853b8f0fed8aad17f(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGA-UI-COMPONENT-GRID PZGETPERSONALIZEDVIEWS #20191120T132645.833 GMT	Pega-UIEngine:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGA-UI-COMPONENT-GRID PZGETPERSONALIZEDVIEWS #20191120T132645.833 GMT";
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
String pz_1 = "tempPage";
thisStepPage = tools.findPage(pz_1, true);
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-UI-COMPONENT-GRID PZGETPERSONALIZEDVIEWS #20191120T132645.833 GMT Step: 1 Circum: 0" );
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
String pz_3 = "tempPage";
thisStepPage = tools.findPage(pz_3, true);
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-UI-COMPONENT-GRID PZGETPERSONALIZEDVIEWS #20191120T132645.833 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-UI-COMPONENT-GRID PZGETPERSONALIZEDVIEWS #20191120T132645.833 GMT Step: 3 Circum: 0" );
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
String pz_4 = "tempPage";
thisStepPage = tools.findPage(pz_4, true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-UI-COMPONENT-GRID PZGETPERSONALIZEDVIEWS #20191120T132645.833 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
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
	"Rule-Obj-Activity:PZGETPERSONALIZEDVIEWS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGETPERSONALIZEDVIEWS","Rule-Obj-Activity","PEGA-UI-COMPONENT-GRID",false,"","Pega-UIEngine","08-04-01","RULE-OBJ-ACTIVITY PEGA-UI-COMPONENT-GRID PZGETPERSONALIZEDVIEWS #20191120T132645.833 GMT","!PZGETPERSONALIZEDVIEWS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1691006272)
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
//	RULE-OBJ-ACTIVITY PEGA-UI-COMPONENT-GRID PZGETPERSONALIZEDVIEWS #20191120T132645.833 GMT:20191120T132645.833 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "c1d854b4e92e560dd78ef5867c34b102";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-UI-Component-Grid";
	}
public String getAspect() {
return "Action";
}
/**
 * Create a temp page to hold list of personalizations.
 * <p>
 * Step 1 <code>Page-New</code> [on page tempPage] <br>
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
String pz_2 = "tempPage";
myStepPage = tools.findPage(pz_2, true);
	 myStepPage = ((com.pega.pegarules.priv.context.PegaThread)tools.getThread()).createPageForPageNew("Code-Pega-List","tempPage",false); 
// primary page will not be added to PageList
	 pega.setStepPage("tempPage", myStepPage);
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
 * Get list of personalizations.
 * <p>
 * Step 2 <code>Obj-Browse</code> [on page tempPage] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: System-User-Grids
ClipboardPage browsePage = null;
// Expression: tempPage
browsePage = tools.findPage("tempPage", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "tempPage");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "System-User-Grids");
browsePage.putString("pyMaxRecords", "10000");

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "");
contentPage.putString("pyDataSource", "System-User-Grids");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "false");
// Expression: pzInsKey
contentPage.putString("pyRowKey", "pzInsKey");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;
// Expression: Param.pyHarnessInsName

//Code for Label : 
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyHarnessInsName");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", tools.getParamValue("pyHarnessInsName"));
paramPage.putString("pyConditionValue1String", tools.getParamValue("pyHarnessInsName"));
contentPage.getProperty("pyParameters").add(paramPage);

//Code for Label : 
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pxCreateDateTime");
paramPage.putString("pyConditionOperation", "IsNotNull");
paramPage.putString("pyCondValueCategory", "singlevalue");
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: Param.pySectionInsName

//Code for Label : 
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pySectionInsName");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", tools.getParamValue("pySectionInsName"));
paramPage.putString("pyConditionValue1String", tools.getParamValue("pySectionInsName"));
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: Param.pyGridStateUniqueID

//Code for Label : 
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyGridStateUniqueID");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", tools.getParamValue("pyGridStateUniqueID"));
paramPage.putString("pyConditionValue1String", tools.getParamValue("pyGridStateUniqueID"));
contentPage.getProperty("pyParameters").add(paramPage);
// Expression: Param.pyOperatorID

//Code for Label : 
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pyOperatorID");
paramPage.putString("pyConditionOperation", "=");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", tools.getParamValue("pyOperatorID"));
paramPage.putString("pyConditionValue1String", tools.getParamValue("pyOperatorID"));
contentPage.getProperty("pyParameters").add(paramPage);
selectPage.putString("pyField", "pzPVStream");
contentPage.getProperty("pySelectFields").add(selectPage);
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "System-User-Grids", "} ", whereClause, sortClause);
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
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Loop through the list and create a page group.
 * <p>
 * Step 3 <code>Java</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
ClipboardPage tempPage = tools.findPage("tempPage", true);
pega.getUIEngine().getGridUtilities().preparePersonalizedViews(myStepPage, tempPage, tools);
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * remove the list.
 * <p>
 * Step 4 <code>Page-Remove</code> [on page tempPage] <br>
 */
public boolean step4_circum0() {
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGA-UI-COMPONENT-GRID PZGETPERSONALIZEDVIEWS #20191120T132645.833 GMT", "Pega-UI-Component-Grid pzGetPersonalizedViews", "Pega-UIEngine", "08-04-01", false, true, "", "ACTIVITY", "20191120T132645.833 GMT" ,"Rule-Obj-Activity"); }
