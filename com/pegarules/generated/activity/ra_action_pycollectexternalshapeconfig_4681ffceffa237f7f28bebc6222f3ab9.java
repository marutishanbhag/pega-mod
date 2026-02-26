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
public class ra_action_pycollectexternalshapeconfig_4681ffceffa237f7f28bebc6222f3ab9 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pyCollectExternalShapeConfig.PegaGadget_PDMViewer.Action");
	public ra_action_pycollectexternalshapeconfig_4681ffceffa237f7f28bebc6222f3ab9(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PYCOLLECTEXTERNALSHAPECONFIG #20180713T143405.854 GMT	Pega-DecisionArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PYCOLLECTEXTERNALSHAPECONFIG #20180713T143405.854 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PYCOLLECTEXTERNALSHAPECONFIG #20180713T143405.854 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PYCOLLECTEXTERNALSHAPECONFIG #20180713T143405.854 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PYCOLLECTEXTERNALSHAPECONFIG #20180713T143405.854 GMT Step: 3 Circum: 0" );
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
	"Rule-Obj-Activity:PYCOLLECTEXTERNALSHAPECONFIG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYCOLLECTEXTERNALSHAPECONFIG","Rule-Obj-Activity","PEGAGADGET-PDMVIEWER",false,"","Pega-DecisionArchitect","08-01-01","RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PYCOLLECTEXTERNALSHAPECONFIG #20180713T143405.854 GMT","!PYCOLLECTEXTERNALSHAPECONFIG",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-167888040)
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
//	RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PYCOLLECTEXTERNALSHAPECONFIG #20180713T143405.854 GMT:20180713T143405.854 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f072acd9f30bdd8e8bb9b3bcd81c79c7";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaGadget-PDMViewer";
	}
public String getAspect() {
return "Action";
}
/**
 * exit if shape extension is not enabled.
 * <p>
 * Step 1 <code>Exit-Activity</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Exit-Activity");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyEnableShapeExtension");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyEnableShapeExtension", "FUAInstance-NullMyStepPage");
}
boolean pz_2 = scalarValueQuery_1.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyEnableShapeExtension",pz_2);
if (pz_2) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyEnableShapeExtension " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Exit-Activity", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Exit-Activity
nextBlock = "***";
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Exit-Activity",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Find the gadget page for canvas configuration.
 * <p>
 * Step 2 <code>Java</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
String tempGadgetID = StringUtils.crossScriptingFilter(tools.getParamValue("newSectionID"));

if(!tempGadgetID.equals("")){
	ClipboardPage pyDocuments = tools.findPage("pyDocuments",false);
	ClipboardProperty pyDocument = pyDocuments.getProperty("pyDocument");
	String harnessID = tools.getParamValue("pzHarnessID");
	if(!harnessID.equals("")){
		ClipboardProperty myDocProp = pyDocument.getPropertyValue(harnessID);
		ClipboardProperty pyGadgets = myDocProp.getProperty("pyGadgets");
			
		if(myDocProp.isEmpty())	
			pyDocument.add(harnessID,pyGadgets);
		ClipboardPage myGadgetPage = pyGadgets.getPageValue(tempGadgetID);		
		String className = myGadgetPage.getString("pxObjClass");

gadgetPage = myGadgetPage;
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
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
ClipboardPage viewerPage = (ClipboardPage) gadgetPage;
if (viewerPage == null) {
      oLog.error("Cannot find the gadget page that contains the one viewer configuration.");
      return false;
}


String shapeBaseClass = viewerPage.getString("pyShapeBaseClass");

/** build a set of built-in Strategy shapes */
	java.util.Set nodeClasses = new java.util.HashSet();
	for (Iterator it = viewerPage.getProperty("pyNodeClasses").iterator(); it.hasNext();) {
		ClipboardPage nodeClass = ((ClipboardProperty)it.next()).getPageValue();
		nodeClasses.add(nodeClass.getString("pyNodeClassname"));
	}

	/** get the list of classes of extension shapes */
	// Call Rule-Obj-Class "  pzGetChildClassCacheXML
	ParameterPage params = new ParameterPage();
	params.putString("class", shapeBaseClass);

	StringMap keys = new HashStringMap();
	keys.putString("pyActivityName", "pzGetChildClassCacheXML");
	keys.putString("pyClassName", "Rule-Obj-Class");

	tools.doActivity(keys, null, params);

	ClipboardPage classList = tools.createPage("Code-Pega-List","");
	try {
                  ClipboardPage threadPage = tools.getThread().getThreadPage();
		classList.adoptXMLForm(threadPage.getString("pyXMLStream"));
                  threadPage.remove("pyXMLStream"); // do not show
                  
	} catch (InvalidStreamError ise) {
		oLog.error("Cannot get child classes of " + shapeBaseClass + ".");
		return false;
	}


	/** Check pyNodes and pyNodeClasses */
	final String config = viewerPage.getString("pyExternalShapeConfigSource");
	for (Iterator it = classList.getProperty("pxResults").iterator(); it.hasNext();) {
		String clazz = ((ClipboardProperty)it.next()).getStringValue("pyClassName");
		if (!nodeClasses.contains(clazz)) {
			// get the configuration from shape level, it's now in pyShapePresentation
			keys.clear();
                           keys.putString("pxObjClass", "Rule-HTML-Section");
			keys.putString("pyClassName", clazz);
			keys.putString("pyStreamName", config);

			try {
				// TODO: missing a configuration rule type, so wrap the configuration in a section rule
				ClipboardPage sectionRule = tools.getDatabase().open(keys, true); // configuration is wrapped in a section rule
				for (int i = 1; sectionRule != null && i <= sectionRule.getProperty("pySections").size(); i++) { 
					// the configuration is in a section include pzConfigurationPanelBase
					ClipboardPage page = sectionRule.getProperty("pySections").getPageValue(i).getProperty("pySectionBody").getPageValue(1);
					if ("pzConfigurationPanelBase".equals(page.getStringIfPresent("pyInclude"))) {
						ClipboardPage shapeViewerPage = page.getPage("pzSectionParamPage"); // get the viewer page for shape
						// append node class definition to viewerPage - only 1 node class will be defined in shapeViewerPage
						viewerPage.getProperty("pyNodeClasses").add(shapeViewerPage.getProperty("pyNodeClasses").getPageValue(1));

						// append nodes to viewerPage - multiple nodes might be defined in shapeViewerPage
						for(int j = 1; j <= shapeViewerPage.getProperty("pyNodes").size(); j++) {
							ClipboardPage shapeNode = shapeViewerPage.getProperty("pyNodes").getPageValue(j);
							ArrayList results = pega_rules_utilities.findInPageList(shapeNode.getString("pyNodeType"), "pyNodeType", viewerPage.getProperty("pyNodes"));
							if (results.isEmpty()) { // append only if it's not defined yet
								viewerPage.getProperty("pyNodes").add(shapeNode);
							}
						}
					}
				}
			} catch (DatabaseException dbe) {
				oLog.error("Cannot open the design time configuration for the shape class " + clazz + ". This shape type will not be loaded");
			}
		}
	}

tools.getStepPage().putAll(viewerPage,ClipboardPage.PUTALL_KEEPNEW);
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

public Object gadgetPage = null;

public void initializeUserLocalVariables() {
	gadgetPage = null;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("gadgetPage", (gadgetPage == null) ? com.pega.pegarules.priv.runtime.ITracerMetaData.LV_NULL_VALUE : gadgetPage.toString());
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyEnableShapeExtension").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY PEGAGADGET-PDMVIEWER PYCOLLECTEXTERNALSHAPECONFIG #20180713T143405.854 GMT", "PegaGadget-PDMViewer pyCollectExternalShapeConfig", "Pega-DecisionArchitect", "08-01-01", false, true, "", "ACTIVITY", "20180713T143405.854 GMT" ,"Rule-Obj-Activity"); }
