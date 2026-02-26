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
public class ra_action_pzgfw_buildconfiguration_d033472f2043c17c3d080790ffc55a94 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzGFW_BuildConfiguration.PegaGadget_PDMViewer.Action");
	public ra_action_pzgfw_buildconfiguration_d033472f2043c17c3d080790ffc55a94(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PZGFW_BUILDCONFIGURATION #20180713T133511.153 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PZGFW_BUILDCONFIGURATION #20180713T133511.153 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PZGFW_BUILDCONFIGURATION #20180713T133511.153 GMT Step: 1 Circum: 0" );
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
	"Rule-Obj-Activity:PZGFW_BUILDCONFIGURATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZGFW_BUILDCONFIGURATION","Rule-Obj-Activity","PEGAGADGET-PDMVIEWER",false,"","Pega-Gadgets","08-01-01","RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PZGFW_BUILDCONFIGURATION #20180713T133511.153 GMT","!PZGFW_BUILDCONFIGURATION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",247066879)
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
//	RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PZGFW_BUILDCONFIGURATION #20180713T133511.153 GMT:20180713T133511.153 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ea1c375dc2576f4b9780995e3621662d";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaGadget-PDMViewer";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1 <code>Java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
/* Assemble Viewer Configuration JSON */
ParameterPage params = tools.getParameterPage();

boolean debug = params.getAsBoolean("debug");
String PREFIX = "GFW - [Build Configuration]: ";

if (debug) {
	oLog.debug(PREFIX + "Start");
}

ClipboardPage view = pega_gadgets_pxgfwutils.pzGetView(params, debug);

Object[] results = pega_gadgets_pxgfwutils.pzBuildConfiguration(params, pega_gadgets_pxgfwutils.pxGetConfiguration(params, null, debug), view, debug);

String[] keys = {"selection", "panning", "zoomFocus", "zoomFixed", "zoomFactor", "zoomMin", "zoomMax", "outline", "outlineExpand", "outlinePosition", "outlineWidth", "outlineHeight"};

// TODO - Review the underlying BuildConfig implementation
String mode 					=	(String) 		results[0];
String orientation				=	(String) 		results[1];
String interaction				=	(String) 		results[2];

String selection				=	(String) 		results[3];
String panning					=	(String) 		results[4];

String zoomFocus				=	(String) 		results[5];
String zoomFixed				=	(String) 		results[6];
String zoomFactor				=	(String) 		results[7];
String zoomMin					=	(String) 		results[8];
String zoomMax					=	(String) 		results[9];

String outline					=	(String) 		results[10];
String outlineExpand			=	(String) 		results[11];
String outlinePosition			=	(String) 		results[12];
String outlineWidth				=	(String) 		results[13];
String outlineHeight			=	(String) 		results[14];

String multigraph				=	(String) 		results[15];
String connectorDangling		=	(String) 		results[16];
String connectorLoop			=	(String) 		results[17];

StringBuilder sizer				=	(StringBuilder) results[18];
StringBuilder vertexTypes		=	(StringBuilder) results[19];
StringBuilder edgeTypes			=	(StringBuilder) results[20];

if (debug) {
  oLog.debug(PREFIX + "Read Only = " + !"3".equals(mode));
  oLog.debug(PREFIX + "Sizer = " + sizer.toString());
  oLog.debug(PREFIX + "Vertex Types = " + vertexTypes.toString());
  oLog.debug(PREFIX + "Edge Types = " + edgeTypes.toString());
}

if (null != view) {
	String grid = view.getStringIfPresent("pyModelerGridModeON");
	String guides = view.getStringIfPresent("pyModelerGuideModeON");
	
  	// TODO: Add these two guys to the configuration
  	tools.putParamValue("grid", (null != grid) ? grid.toLowerCase() : "false");
	tools.putParamValue("guides", (null != guides) ? guides.toLowerCase() : "false");
  
  	tools.putParamValue("multigraph", multigraph);
	tools.putParamValue("connectorDangling", connectorDangling);
	tools.putParamValue("connectorLoop", connectorLoop);
}

// TODO: Use iteration if possible
if (null != mode) {
	tools.putParamValue("mode", mode);
}

if (null != orientation) {
	tools.putParamValue("orientation", orientation.toLowerCase());
}

tools.putParamValue("interaction", (null != interaction) ? interaction.toLowerCase() : "pan");

int idx = 3;
for (String key : keys) {
  Object o = results[idx];
  if (o instanceof String) {
    tools.putParamValue(key, ((String) o));
  }
  idx += 1;
}

if ((null != sizer) && (0 < sizer.length())) {
	tools.putParamValue("sizerConfig", sizer.toString());
}

if (null != vertexTypes) {
	tools.putParamValue("vertexTypes", vertexTypes.toString());
}

if (null != edgeTypes) {
	tools.putParamValue("edgeTypes", edgeTypes.toString());
}

if (debug) {
	oLog.debug(PREFIX + "End");
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
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

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PZGFW_BUILDCONFIGURATION #20180713T133511.153 GMT", "PegaGadget-PDMViewer pzGFW_BuildConfiguration", "Pega-Gadgets", "08-01-01", false, true, "", "ACTIVITY", "20180713T133511.153 GMT" ,"Rule-Obj-Activity"); }
