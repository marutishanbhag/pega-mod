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
public class ra_action_pzpostcustomsection_1b9b6acecb43484fffd378ce1ddc80cf extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzPostCustomSection._baseclass.Action");
	public ra_action_pzpostcustomsection_1b9b6acecb43484fffd378ce1ddc80cf(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY @BASECLASS PZPOSTCUSTOMSECTION #20230618T001807.911 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY @BASECLASS PZPOSTCUSTOMSECTION #20230618T001807.911 GMT";
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZPOSTCUSTOMSECTION #20230618T001807.911 GMT Step: 2 Circum: 0" );
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
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY @BASECLASS PZPOSTCUSTOMSECTION #20230618T001807.911 GMT Step: 3 Circum: 0" );
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
	"Rule-Obj-Activity:PZPOSTCUSTOMSECTION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZPOSTCUSTOMSECTION","Rule-Obj-Activity","@BASECLASS",false,"","Pega-ProcessArchitect","08-23-01","RULE-OBJ-ACTIVITY @BASECLASS PZPOSTCUSTOMSECTION #20230618T001807.911 GMT","!PZPOSTCUSTOMSECTION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1665158396)
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
//	RULE-OBJ-ACTIVITY @BASECLASS PZPOSTCUSTOMSECTION #20230618T001807.911 GMT:20230618T001807.911 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "df79c2530a6a75c6a92644bd1637d083";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Action";
}
/**
 * Call pxPerformFlowAction and set the callParams in the  flow rule page.
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
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("actionName",PropertyInfo.TYPE_TEXT, tools.getParamValue("inneractionName"));

//when is Case Designer fetch the draft mode from embedded flow page

StringMap whenKeys = new HashStringMap();
whenKeys.putString("pyClassName", "@baseclass");
whenKeys.putString("pyBlockName", "pzIsCDContext");
PRStackFrame when = pega.pushStackFrame("when", null, myStepPage, false, false);

if(tools.evaluateWhen(whenKeys)) {
  //In Case designer or CD process modeler Top flow context, get the Draft mode state from embedded flow page
  newParamsPage.putParamValue("DraftModeON", "true");
}else{
  //In Flow rule form or CD process modeler Sub process context, get the Draft mode state from Top level page i.e. RH_1 or D_pzGFWCache
  newParamsPage.putParamValue("DraftModeON", tools.getPrimaryPage().getTopLevelPage().getString("pyDraftModeON"));
}

pega.popStackFrame(when, false); 



HashStringMap params = new HashStringMap();
params.putString("pxObjClass", "Rule-Obj-Activity");
params.putString("pyClassName", myStepPage.getClassName());
params.putString("pyActivityName", "pxPerformFlowAction");
tools.doActivity(params, myStepPage, newParamsPage);

String sCallParams = tools.getParamValue("ParameterHolderProperty");
if ( sCallParams.equals("") ) {
       sCallParams = ".pyCallParams";
  }

ClipboardPage cpCallParamsPage = myStepPage.getParentPage().getPage(sCallParams);

//BUG-143125 Created empty pycallparams
ClipboardProperty RuleParameters = myStepPage.getParentPage().getProperty("pzRuleParameters");
	for(int i=1; i<=RuleParameters.size(); i++) {
			String paramName = RuleParameters.getPageValue(i).getString("pyParametersParamName");	
      		if(!"".equals(paramName)){
              cpCallParamsPage.putString(paramName," ");
            }
			
	}

if(cpCallParamsPage != null) {
    java.util.Iterator iter = cpCallParamsPage .keySet().iterator();
    while(iter.hasNext()) {
        String paramName = (String)iter.next();
        if(newParamsPage.containsKey(paramName)){
             cpCallParamsPage.getProperty(paramName).setValue(newParamsPage.getParameterValue(paramName));
       } else{
             cpCallParamsPage.getProperty(paramName).setValue("");
		}
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
 * if rule is dispatch type add params from called look at params of dispatched rule.
 * <p>
 * Step 3 <code>java</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.inneractionName==\"pzRunDataTransform\"");
try {
boolean pz_1 = (tools.getParamValue("inneractionName").equals("pzRunDataTransform"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.inneractionName==\"pzRunDataTransform\"",pz_1);
if (!pz_1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.inneractionName==\"pzRunDataTransform\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
String sCallParams = tools.getParamValue("ParameterHolderProperty");
if (sCallParams.equals("")) {
  sCallParams = ".pyCallParams";
}
ClipboardPage cpCallParamsPage = myStepPage.getParentPage().getPage(sCallParams);

/* copy data transform params from pyDOParamList to pyCallParams, 
as flow FUA generates parameters page with source as pyCallParams */
ClipboardProperty pyDOParamList = myStepPage.getProperty("pyDOParamList");
java.util.Iterator<ClipboardProperty> pyDOParamListItr = pyDOParamList.iterator();
while(pyDOParamListItr.hasNext()) {
  ClipboardPage pyDOParamPage = pyDOParamListItr.next().getPageValue();
  String paramName = pyDOParamPage.getString("pyName");
  if(!"".equals(paramName)) {
    cpCallParamsPage.putString(paramName, pyDOParamPage.getString("pyValue"));
  }
}

/* copy data transform parameter configuration information to pzRuleParameters, 
as flow FUA uses pzRuleParameters to determine if a parameter is IN/OUT and generate code accordingly */
ParameterPage pp = new ParameterPage();
pp.putParamValue("pyClassName", myStepPage.getClassName());
pp.putParamValue("pyModelName", myStepPage.getString("pyRunDataTransform"));
ClipboardPage D_pzGetDataTransformInfo = tools.findPage("D_pzGetDataTransformInfo", pp);
if(D_pzGetDataTransformInfo != null) {
  ClipboardProperty pzRuleParameters = myStepPage.getParentPage().getProperty("pzRuleParameters");
  java.util.Iterator<ClipboardProperty> pyParametersItr = D_pzGetDataTransformInfo.getProperty("pyParameters").iterator();
  while(pyParametersItr.hasNext()) {
    pzRuleParameters.add(pyParametersItr.next().getPageValue());
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
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY @BASECLASS PZPOSTCUSTOMSECTION #20230618T001807.911 GMT", "@baseclass pzPostCustomSection", "Pega-ProcessArchitect", "08-23-01", false, true, "", "ACTIVITY", "20230618T001807.911 GMT" ,"Rule-Obj-Activity"); }
