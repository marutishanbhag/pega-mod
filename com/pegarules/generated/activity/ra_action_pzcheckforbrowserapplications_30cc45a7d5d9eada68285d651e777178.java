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
public class ra_action_pzcheckforbrowserapplications_30cc45a7d5d9eada68285d651e777178 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzCheckForBrowserApplications.Rule_Application.Action");
	public ra_action_pzcheckforbrowserapplications_30cc45a7d5d9eada68285d651e777178(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-APPLICATION PZCHECKFORBROWSERAPPLICATIONS #20180713T141055.688 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-APPLICATION PZCHECKFORBROWSERAPPLICATIONS #20180713T141055.688 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-APPLICATION PZCHECKFORBROWSERAPPLICATIONS #20180713T141055.688 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-APPLICATION PZCHECKFORBROWSERAPPLICATIONS #20180713T141055.688 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardProperty pz_2 = pega.findPageWithException("RequestorTypeList", "Code-Pega-List").getIfPresent("pxResults");
pageRef = pz_2;
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
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-APPLICATION PZCHECKFORBROWSERAPPLICATIONS #20180713T141055.688 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...

// Code to call step 4_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
ClipboardPage  myStepPage = tools.getStepPage();
String pz_6 = "RequestorTypeList";
thisStepPage = tools.findPage(pz_6, true);
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-APPLICATION PZCHECKFORBROWSERAPPLICATIONS #20180713T141055.688 GMT Step: 4 Circum: 0" );
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
	"Rule-Obj-Activity:PZCHECKFORBROWSERAPPLICATIONS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZCHECKFORBROWSERAPPLICATIONS","Rule-Obj-Activity","RULE-APPLICATION",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-ACTIVITY RULE-APPLICATION PZCHECKFORBROWSERAPPLICATIONS #20180713T141055.688 GMT","!PZCHECKFORBROWSERAPPLICATIONS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1961977776)
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
//	RULE-OBJ-ACTIVITY RULE-APPLICATION PZCHECKFORBROWSERAPPLICATIONS #20180713T141055.688 GMT:20180713T141055.688 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ddc49606eb4e8a59a8d266025aeca4f3";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Application";
	}
public String getAspect() {
return "Action";
}
/**
 * Get a list of Requestor Type of type BROWSER.
 * <p>
 * Step 1 <code>Obj-Browse</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Obj-Browse", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Obj-Browse
// Expression: Data-Admin-Requestor
ClipboardPage browsePage = null;
// Expression: RequestorTypeList
browsePage = tools.findPage("RequestorTypeList", false);
if (browsePage == null) {
browsePage = tools.getThread().createPage("Code-Pega-List", "RequestorTypeList");
} else {
browsePage.clear();
browsePage.putString("pxObjClass", "Code-Pega-List");
}
browsePage.putString("pyObjClass", "Data-Admin-Requestor");
browsePage.putString("pyMaxRecords", "10000");

ClipboardPage cpLVContainer = tools.createPage("Rule-Obj-ListView", null);
ClipboardPage contentPage = cpLVContainer.getPage(".pyContentSource");
contentPage.putString("pxObjClass", "Embed-ListParams");
contentPage.putString("pyCriteriaLogic", "");
contentPage.putString("pyDataSource", "Data-Admin-Requestor");
contentPage.putString("pyTranslateFromLocale", "true");
contentPage.putString("pyGetRowKey", "true");
// Expression: pzInsKey
contentPage.putString("pyRowKey", "pzInsKey");
ClipboardPage selectPage = tools.createPage("Embed-Fields", null);
ClipboardPage paramPage = null;

//Code for Label : 
selectPage.putString("pyField", ".pzInsKey");
selectPage.putString("pySort", "");
contentPage.getProperty("pySelectFields").add(selectPage);
browsePage.putString(".pyMapping(1).pyPropertyName", ".pzInsKey");
browsePage.putString(".pyMapping(1).pyClassName", "Data-Admin-Requestor");
paramPage = tools.createPage("Embed-WhenConditions", null);
paramPage.putString("pyConditionLabel", "");
paramPage.putString("pyConditionFieldName", ".pzInsKey");
paramPage.putString("pyConditionOperation", "EndsWith");
paramPage.putString("pyCondValueCategory", "singlevalue");
paramPage.putString("pyConditionValue1", "\"!BROWSER\"");
paramPage.putString("pyConditionValue1String", "\"!BROWSER\"");
contentPage.getProperty("pyParameters").add(paramPage);
try {

String selectablecolumns = pega_wb_reportcontentbuilder.getListSelectClause(contentPage);
String whereClause = pega_wb_reportcontentbuilder.getWhereClause(contentPage);
String sortClause = pega_wb_reportcontentbuilder.getSortClause(contentPage);
String sql = StringUtils.concat(StringUtils.ASIS, selectablecolumns, " from {CLASS:", "Data-Admin-Requestor", "} ", whereClause, sortClause);
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Obj-Browse",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Set Param.ApplicationName to @pxGetStepPageReference() to pass in the application as a Page Parameter.
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
{
    tools.putParamValue("ApplicationName", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("pxGetStepPageReference--()", "pxGetStepPageReference", null, null, new Object[] {}));
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
 * For each browser requester type open it, open all access groups, and check their applications.
 * <p>
 * Step 3 <code>Call pzCheckForBrowserApplications_RequestorType</code> [on page RequestorTypeList.pxResults] <br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCheckForBrowserApplications_RequestorType");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@hasMessages(Primary)");
try {
boolean pz_3 = (pega.<Boolean>resolveMethodCall("hasMessages--(Page)", "hasMessages", null, null, new Object[] { tools.getPrimaryPage() })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@hasMessages(Primary)",pz_3);
if (pz_3) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@hasMessages(Primary) " + anyException.getMessage(), anyException);
}
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.ApplicationName==\"\"");
try {
boolean pz_4 = (tools.getParamValue("ApplicationName").equals(""));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.ApplicationName==\"\"",pz_4);
if (pz_4) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.ApplicationName==\"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzCheckForBrowserApplications_RequestorType", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzCheckForBrowserApplications_RequestorType
// Calling Activity : pzCheckForBrowserApplications_RequestorType

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
newParamsPage.putParamValue("pyIterationType", "embedded");
newParamsPage.putParamValue("pyHowInvoked", "ForEach");
newParamsPage.putParamValue("pyIterationTarget", "RequestorTypeList.pxResults");
// Expression: .pzInsKey
if (myStepPage == null) {
throw new InvalidReferenceException(".pzInsKey", "FUAInstance-NullMyStepPage");
}
newParamsPage.putParamValue("RequestorTypeKey", PropertyInfo.TYPE_TEXT, scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
// Expression: Param.ApplicationName
newParamsPage.putParamValue("ApplicationName", PropertyInfo.TYPE_INCLUDED_PAGE, tools.getParamValue("ApplicationName"));
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzCheckForBrowserApplications_RequestorType", "Rule-Application", "");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzCheckForBrowserApplications_RequestorType",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Step 4 <code>Page-Remove</code> [on page RequestorTypeList] <br>
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

private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().scalarProperty("pzInsKey").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-APPLICATION PZCHECKFORBROWSERAPPLICATIONS #20180713T141055.688 GMT", "Rule-Application pzCheckForBrowserApplications", "Pega-ProcessArchitect", "08-01-01", false, true, "", "ACTIVITY", "20180713T141055.688 GMT" ,"Rule-Obj-Activity"); }
