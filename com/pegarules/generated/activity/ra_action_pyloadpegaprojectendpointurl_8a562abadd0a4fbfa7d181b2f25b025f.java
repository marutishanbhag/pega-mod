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
public class ra_action_pyloadpegaprojectendpointurl_8a562abadd0a4fbfa7d181b2f25b025f extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyLoadPegaProjectEndPointURL.Pega_Int_PAT.Action");
	public ra_action_pyloadpegaprojectendpointurl_8a562abadd0a4fbfa7d181b2f25b025f(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGA-INT-PAT PYLOADPEGAPROJECTENDPOINTURL #20180713T141930.260 GMT	Pega-AppDefinition:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGA-INT-PAT PYLOADPEGAPROJECTENDPOINTURL #20180713T141930.260 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-INT-PAT PYLOADPEGAPROJECTENDPOINTURL #20180713T141930.260 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-INT-PAT PYLOADPEGAPROJECTENDPOINTURL #20180713T141930.260 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGA-INT-PAT PYLOADPEGAPROJECTENDPOINTURL #20180713T141930.260 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
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
	"Rule-Obj-Activity:PYLOADPEGAPROJECTENDPOINTURL"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYLOADPEGAPROJECTENDPOINTURL","Rule-Obj-Activity","PEGA-INT-PAT",false,"","Pega-AppDefinition","08-01-01","RULE-OBJ-ACTIVITY PEGA-INT-PAT PYLOADPEGAPROJECTENDPOINTURL #20180713T141930.260 GMT","!PYLOADPEGAPROJECTENDPOINTURL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1514576559)
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
//	RULE-OBJ-ACTIVITY PEGA-INT-PAT PYLOADPEGAPROJECTENDPOINTURL #20180713T141930.260 GMT:20180713T141930.260 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "d85144f338c4cbe07aa904197e8c0765";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Int-PAT";
	}
public String getAspect() {
return "Action";
}
/**
 * Set Pega Project end point URL from system settings.
 * <p>
 * Step 1 <code>Property-Set</code><br>
 */
public boolean step1_circum0() {
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
    pega.setViaPropRef(".pyPegaProjectEndpoint", pRef_1, myStepPage, pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", "Pega-RULES", "Utilities", new Object[] { pega.<String>resolveMethodCall("getPMFDSSRuleSetName--()", "getPMFDSSRuleSetName", "Pega-RULES", "Utilities", new Object[] {}), "PegaProjectEndPointURL" }), "sTN", false, true);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Property-Set",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Set the pat url.
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
    pega.setViaPropRef(".pyPegaProjectURL", pRef_2, myStepPage, pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", "Pega-RULES", "Utilities", new Object[] { pega.<String>resolveMethodCall("getPMFDSSRuleSetName--()", "getPMFDSSRuleSetName", "Pega-RULES", "Utilities", new Object[] {}), "PegaProjectURL" }), "sTN", false, true);
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
 * Set the product rest service url for assets list.
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
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
if (myStepPage == null) {
throw new InvalidReferenceException("<code block>", "FUAInstance-NullMyStepPage");
}
{
    pega.setViaPropRef(".pyPegaProjectCheckinsEndPoint", pRef_3, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/Checkins"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectFeatureCRUDEndPoint", pRef_5, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/Features/{ID}"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectRegisterDevEnvEndPoint", pRef_6, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/RegisterDevEnvironment"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectProductEndPoint", pRef_7, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/Product"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectReleaseEndPoint", pRef_8, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/Release"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectTaskEndPoint", pRef_9, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/Task/{ID}"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectAppLockEndPoint", pRef_10, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/UpdateReleaseLockStatus"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectIndexFeaturesEndPoint", pRef_11, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/IndexFeatures"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectBugEndPoint", pRef_12, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/Bugs/{ID}"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectWorkEndPoint", pRef_13, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/SyncProjectWork"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectAssetStatusEndPoint", pRef_14, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/Status"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyGetSprintDetailsByOperIDEndPoint", pRef_15, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/CompleteSprintDetailsByOperID/{OperatorID}"), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPegaProjectPropertyValuesEndPoint", pRef_16, myStepPage, (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/PegaProject/api/ValidValues"), "sTN", false, true);
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

public static final String[] pRef_16 = new String[] { "", "", "pyPegaProjectPropertyValuesEndPoint", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyPegaProjectWorkEndPoint", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyPegaProjectTaskEndPoint", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyPegaProjectAppLockEndPoint", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyPegaProjectCheckinsEndPoint", "" };
public static final String[] pRef_14 = new String[] { "", "", "pyPegaProjectAssetStatusEndPoint", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyPegaProjectFeatureCRUDEndPoint", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyPegaProjectEndpoint", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyPegaProjectIndexFeaturesEndPoint", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyPegaProjectBugEndPoint", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyPegaProjectRegisterDevEnvEndPoint", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyPegaProjectURL", "" };
public static final String[] pRef_15 = new String[] { "", "", "pyGetSprintDetailsByOperIDEndPoint", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyPegaProjectProductEndPoint", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyPegaProjectReleaseEndPoint", "" };
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pyPegaProjectEndpoint").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGA-INT-PAT PYLOADPEGAPROJECTENDPOINTURL #20180713T141930.260 GMT", "Pega-Int-PAT pyLoadPegaProjectEndPointURL", "Pega-AppDefinition", "08-01-01", false, false, "", "LOADDECLARATIVEPAGE", "20180713T141930.260 GMT" ,"Rule-Obj-Activity"); }
