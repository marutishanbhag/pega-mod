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
public class ra_action_dofuassembly_c6132e432be1067e2ee168d123a74dc1 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.DoFUAssembly.Rule_HTML_Harness.Action");
	public ra_action_dofuassembly_c6132e432be1067e2ee168d123a74dc1(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-HTML-HARNESS DOFUASSEMBLY #20230618T003002.013 GMT	Pega-ProcessEngine:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-HTML-HARNESS DOFUASSEMBLY #20230618T003002.013 GMT";
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
thisStepPage = tools.findPage(tools.getParamValue("pyGenJava"), true);
if (thisStepPage == null) {
thisStepPage = tools.findPage(tools.getParamValue("pyGenJava"), false);
if (thisStepPage != null && !thisStepPage.isReadOnly()) {
thisStepPage.putString("pxObjClass", "Code-Pega-GeneratedJava");
}
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-HTML-HARNESS DOFUASSEMBLY #20230618T003002.013 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
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
	"Rule-Obj-Activity:DOFUASSEMBLY"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-HTML-HARNESS",false,"","Pega-ProcessEngine","08-23-01","RULE-OBJ-ACTIVITY RULE-HTML-HARNESS DOFUASSEMBLY #20230618T003002.013 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",2017938718)
	};

	 /**
	 * This method returns the set of dependent rules required to build
	 * the generated code and (possibly) whole classes that the rules assembler declared.
	 * @return array of <code>DependentRuleInfo</code> objects.
	 */
	public DependentRuleInfo[] getDependentRuleInfos() {
		return oDependentRuleInfos;
	}

public static final DependentRuleInfo oTrackedSelfDependency = oDependentRuleInfos[0];

//	Rules used in this assembly (order and duplicates ARE significant to hash code) :
//	RULE-OBJ-ACTIVITY RULE-HTML-HARNESS DOFUASSEMBLY #20230618T003002.013 GMT:20230618T003002.013 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "7274b1136855ed0c59db2db39c776be9";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-HTML-Harness";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1 <code>Property-Set</code> [on page pyGenJava] <br>
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
    pega.setViaPropRef(".pyInterfaceVersionAssembler", pRef_1, myStepPage, "04-01-01", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyLibraryClassName", pRef_2, myStepPage, "com.pegarules.generated.pega_processengine_dxapifua", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyMethodAbsentName", pRef_3, myStepPage, "pzHarnessDXAPIMethodAbsent", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyMethodAccessName", pRef_4, myStepPage, "pzHarnessDXAPIMethodAccess", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyMethodBodyName", pRef_5, myStepPage, "pzHarnessDXAPIMethodBody", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyMethodCallName", pRef_6, myStepPage, "pzHarnessDXAPIMethodCall", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyMethodFinishName", pRef_7, myStepPage, "pzHarnessDXAPIMethodFinish", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyMethodHeaderName", pRef_8, myStepPage, "pzHarnessDXAPIMethodHeader", "sIN", false, true);
}
{
    pega.setViaPropRef(".pyDefinedPrimaryPageClass", pRef_9, myStepPage, ".pyClassName", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyInterfaceName", pRef_10, myStepPage, "Activity, FUASupport", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyPagesAndClassesName", pRef_11, myStepPage, "pyPagesAndClasses", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyParametersName", pRef_12, myStepPage, "pyParameters", "sTN", false, true);
}
{
    pega.setViaPropRef(".pyLocalParametersName", pRef_13, myStepPage, "pyLocalParameters", "sTN", false, true);
}
} finally {
	pega.unwind(methodFrame, true);
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

public ClipboardPage pageParam_pyGenJava;
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
pageParam_pyGenJava = null;
}

public static final String[] pRef_6 = new String[] { "", "", "pyMethodCallName", "" };
public static final String[] pRef_4 = new String[] { "", "", "pyMethodAccessName", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyParametersName", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyLibraryClassName", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyMethodHeaderName", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyMethodAbsentName", "" };
public static final String[] pRef_1 = new String[] { "", "", "pyInterfaceVersionAssembler", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyDefinedPrimaryPageClass", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyMethodFinishName", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyInterfaceName", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyLocalParametersName", "" };
public static final String[] pRef_5 = new String[] { "", "", "pyMethodBodyName", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyPagesAndClassesName", "" };

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-HTML-HARNESS DOFUASSEMBLY #20230618T003002.013 GMT", "Rule-HTML-Harness DoFUAssembly", "Pega-ProcessEngine", "08-23-01", false, true, "", "ASSEMBLER", "20230618T003002.013 GMT" ,"Rule-Obj-Activity"); }
