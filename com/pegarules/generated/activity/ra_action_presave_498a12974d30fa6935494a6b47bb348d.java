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
public class ra_action_presave_498a12974d30fa6935494a6b47bb348d extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.PreSave.Data_Admin_Security_OAuth2_RegisteredApplication.Action");
	public ra_action_presave_498a12974d30fa6935494a6b47bb348d(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-OAUTH2-REGISTEREDAPPLICATION PRESAVE #20210608T065126.461 GMT	Pega-IntegrationEngine:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-OAUTH2-REGISTEREDAPPLICATION PRESAVE #20210608T065126.461 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-OAUTH2-REGISTEREDAPPLICATION PRESAVE #20210608T065126.461 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-OAUTH2-REGISTEREDAPPLICATION PRESAVE #20210608T065126.461 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-OAUTH2-REGISTEREDAPPLICATION PRESAVE #20210608T065126.461 GMT Step: 3 Circum: 0" );
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
	"Rule-Obj-Activity:PRESAVE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PRESAVE","Rule-Obj-Activity","DATA-ADMIN-SECURITY-OAUTH2-REGISTEREDAPPLICATION",false,"","Pega-IntegrationEngine","08-07-01","RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-OAUTH2-REGISTEREDAPPLICATION PRESAVE #20210608T065126.461 GMT","!PRESAVE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-82207702)
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
//	RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-OAUTH2-REGISTEREDAPPLICATION PRESAVE #20210608T065126.461 GMT:20210614T095658.040 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "4593414fea32833f6060721a3ee6dcfe";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Security-OAuth2-RegisteredApplication";
	}
public String getAspect() {
return "Action";
}
/**
 * Reset all grant types except authode for public client.
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equalsIgnoreCase(.pyOAuth2ClientType,\"Public\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@equalsIgnoreCase(.pyOAuth2ClientType,\"Public\")", "FUAInstance-NullMyStepPage");
}
boolean pz_2 = (pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", null, null, new Object[] { scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Public" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equalsIgnoreCase(.pyOAuth2ClientType,\"Public\")",pz_2);
if (!pz_2) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equalsIgnoreCase(.pyOAuth2ClientType,\"Public\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(1).pyRowSelected", pRef_3, myStepPage, false, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyUserIdentifier", pRef_4, myStepPage, "", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(2).pyRowSelected", pRef_5, myStepPage, false, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(3).pyRowSelected", pRef_6, myStepPage, false, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(3).pyUseRefreshToken", pRef_7, myStepPage, false, "sSN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(4).pyRowSelected", pRef_8, myStepPage, false, "sSN", false, true);
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
 * Setting a flag on the primary page. This flag is checked to disable public client checkbox.
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
    pega.setViaPropRef(".pyTempText", pRef_9, myStepPage, true, "sTN", false, true);
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
 * for backward compatability prior to 8.1.
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
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "@equals(.pxInstanceCreatedVersion,\"\")");
try {
if (myStepPage == null) {
throw new InvalidReferenceException("@equals(.pxInstanceCreatedVersion,\"\")", "FUAInstance-NullMyStepPage");
}
boolean pz_11 = (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue();
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "@equals(.pxInstanceCreatedVersion,\"\")",pz_11);
if (!pz_11) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("@equals(.pxInstanceCreatedVersion,\"\") " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Property-Set", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Property-Set
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(1).pyRowSelected", pRef_3, myStepPage, scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(1).pyValue", pRef_14, myStepPage, scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(1).pyLocalizedValue", pRef_17, myStepPage, scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(2).pyRowSelected", pRef_5, myStepPage, scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(2).pyValue", pRef_22, myStepPage, scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(2).pyLocalizedValue", pRef_25, myStepPage, scalarValueQuery_26.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(2).pyIdentityMapping", pRef_28, myStepPage, scalarValueQuery_29.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(3).pyRowSelected", pRef_6, myStepPage, scalarValueQuery_31.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(3).pyValue", pRef_33, myStepPage, scalarValueQuery_34.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(3).pyLocalizedValue", pRef_36, myStepPage, scalarValueQuery_37.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(3).pyIdentityMapping", pRef_39, myStepPage, scalarValueQuery_40.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(4).pyRowSelected", pRef_8, myStepPage, scalarValueQuery_42.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(4).pyValue", pRef_44, myStepPage, scalarValueQuery_45.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(4).pyLocalizedValue", pRef_47, myStepPage, scalarValueQuery_48.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(4).pyIdentityMapping", pRef_50, myStepPage, scalarValueQuery_51.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(5).pyRowSelected", pRef_53, myStepPage, scalarValueQuery_54.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(5).pyValue", pRef_56, myStepPage, scalarValueQuery_57.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pyOAuth2GrantTypes(5).pyLocalizedValue", pRef_59, myStepPage, scalarValueQuery_60.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
}
{
    pega.setViaPropRef(".pxInstanceCreatedVersion", pRef_62, myStepPage, "8.1", "sTY", false, true);
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

public static final String[] pRef_36 = new String[] { "", "", "pyOAuth2GrantTypes", "3", "pyLocalizedValue", "" };
public static final String[] pRef_52 = new String[] { "", "", "pyGrantTypes", "4", "pyIdentityMapping", "" };
public static final String[] pRef_33 = new String[] { "", "", "pyOAuth2GrantTypes", "3", "pyValue", "" };
public static final String[] pRef_53 = new String[] { "", "", "pyOAuth2GrantTypes", "5", "pyRowSelected", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyGrantTypes", "1", "pyRowSelected", "" };
public static final String[] pRef_19 = new String[] { "", "", "pyGrantTypes", "1", "pyLocalizedValue", "" };
public static final String[] pRef_58 = new String[] { "", "", "pyGrantTypes", "5", "pyValue", "" };
public static final String[] pRef_55 = new String[] { "", "", "pyGrantTypes", "5", "pyRowSelected", "" };
public static final String[] pRef_24 = new String[] { "", "", "pyGrantTypes", "2", "pyValue", "" };
public static final String[] pRef_61 = new String[] { "", "", "pyGrantTypes", "5", "pyLocalizedValue", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyOAuth2GrantTypes", "2", "pyRowSelected", "" };
public static final String[] pRef_25 = new String[] { "", "", "pyOAuth2GrantTypes", "2", "pyLocalizedValue", "" };
public static final String[] pRef_41 = new String[] { "", "", "pyGrantTypes", "3", "pyIdentityMapping", "" };
public static final String[] pRef_35 = new String[] { "", "", "pyGrantTypes", "3", "pyValue", "" };
public static final String[] pRef_50 = new String[] { "", "", "pyOAuth2GrantTypes", "4", "pyIdentityMapping", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyOAuth2GrantTypes", "1", "pyRowSelected", "" };
public static final String[] pRef_27 = new String[] { "", "", "pyGrantTypes", "2", "pyLocalizedValue", "" };
public static final String[] pRef_43 = new String[] { "", "", "pyGrantTypes", "4", "pyRowSelected", "" };
public static final String[] pRef_17 = new String[] { "", "", "pyOAuth2GrantTypes", "1", "pyLocalizedValue", "" };
public static final String[] pRef_4 = new String[] { "", "", "pyUserIdentifier", "" };
public static final String[] pRef_49 = new String[] { "", "", "pyGrantTypes", "4", "pyLocalizedValue", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyOAuth2GrantTypes", "3", "pyRowSelected", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyOAuth2GrantTypes", "3", "pyUseRefreshToken", "" };
public static final String[] pRef_46 = new String[] { "", "", "pyGrantTypes", "4", "pyValue", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyGrantTypes", "2", "pyIdentityMapping", "" };
public static final String[] pRef_44 = new String[] { "", "", "pyOAuth2GrantTypes", "4", "pyValue", "" };
public static final String[] pRef_39 = new String[] { "", "", "pyOAuth2GrantTypes", "3", "pyIdentityMapping", "" };
public static final String[] pRef_14 = new String[] { "", "", "pyOAuth2GrantTypes", "1", "pyValue", "" };
public static final String[] pRef_32 = new String[] { "", "", "pyGrantTypes", "3", "pyRowSelected", "" };
public static final String[] pRef_38 = new String[] { "", "", "pyGrantTypes", "3", "pyLocalizedValue", "" };
public static final String[] pRef_47 = new String[] { "", "", "pyOAuth2GrantTypes", "4", "pyLocalizedValue", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyOAuth2GrantTypes", "4", "pyRowSelected", "" };
public static final String[] pRef_28 = new String[] { "", "", "pyOAuth2GrantTypes", "2", "pyIdentityMapping", "" };
public static final String[] pRef_59 = new String[] { "", "", "pyOAuth2GrantTypes", "5", "pyLocalizedValue", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyTempText", "" };
public static final String[] pRef_16 = new String[] { "", "", "pyGrantTypes", "1", "pyValue", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyGrantTypes", "2", "pyRowSelected", "" };
public static final String[] pRef_22 = new String[] { "", "", "pyOAuth2GrantTypes", "2", "pyValue", "" };
public static final String[] pRef_62 = new String[] { "", "", "pxInstanceCreatedVersion", "" };
public static final String[] pRef_56 = new String[] { "", "", "pyOAuth2GrantTypes", "5", "pyValue", "" };
private static final ScalarValueQuery scalarValueQuery_57 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 5).scalarProperty("pyValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 1).scalarProperty("pyRowSelected").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().scalarProperty("pxInstanceCreatedVersion").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 1).scalarProperty("pyValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_60 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 5).scalarProperty("pyLocalizedValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_37 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 3).scalarProperty("pyLocalizedValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_26 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 2).scalarProperty("pyLocalizedValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_31 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 3).scalarProperty("pyRowSelected").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_45 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 4).scalarProperty("pyValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_40 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 3).scalarProperty("pyIdentityMapping").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 1).scalarProperty("pyLocalizedValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_51 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 4).scalarProperty("pyIdentityMapping").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_34 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 3).scalarProperty("pyValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_54 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 5).scalarProperty("pyRowSelected").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_42 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 4).scalarProperty("pyRowSelected").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyOAuth2ClientType").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 2).scalarProperty("pyRowSelected").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_29 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 2).scalarProperty("pyIdentityMapping").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_23 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 2).scalarProperty("pyValue").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_48 = FUAUtil.createQueryBuilder().pageList("pyGrantTypes", 4).scalarProperty("pyLocalizedValue").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-ADMIN-SECURITY-OAUTH2-REGISTEREDAPPLICATION PRESAVE #20210608T065126.461 GMT", "Data-Admin-Security-OAuth2-RegisteredApplication PreSave", "Pega-IntegrationEngine", "08-07-01", false, true, "", "ACTIVITY", "20210614T095658.040 GMT" ,"Rule-Obj-Activity"); }
