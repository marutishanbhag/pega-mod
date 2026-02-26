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
public class ra_action_pzcheckforinlinestylewarnings_e07da0ccc60295bbbf0ee9145e683a13 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzCheckForInlineStyleWarnings.Embed_Harness_Section.Action");
	public ra_action_pzcheckforinlinestylewarnings_e07da0ccc60295bbbf0ee9145e683a13(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY EMBED-HARNESS-SECTION PZCHECKFORINLINESTYLEWARNINGS #20180713T133838.554 GMT	Pega-UIDesign:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY EMBED-HARNESS-SECTION PZCHECKFORINLINESTYLEWARNINGS #20180713T133838.554 GMT";
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
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pySectionBody", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_2 = pzPrimPage.getIfPresent("pySectionBody");
pageRef = pz_2;
} 
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
pz_CurrentStepNum = "1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_circum0");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-HARNESS-SECTION PZCHECKFORINLINESTYLEWARNINGS #20180713T133838.554 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...
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
	"Rule-Obj-Activity:PZCHECKFORINLINESTYLEWARNINGS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZCHECKFORINLINESTYLEWARNINGS","Rule-Obj-Activity","EMBED-HARNESS-SECTION",false,"","Pega-UIDesign","08-01-01","RULE-OBJ-ACTIVITY EMBED-HARNESS-SECTION PZCHECKFORINLINESTYLEWARNINGS #20180713T133838.554 GMT","!PZCHECKFORINLINESTYLEWARNINGS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2053102371)
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
//	RULE-OBJ-ACTIVITY EMBED-HARNESS-SECTION PZCHECKFORINLINESTYLEWARNINGS #20180713T133838.554 GMT:20180713T133838.554 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e0f75da48e86d40909b6e80e26c27bf4";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-Harness-Section";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1 <code>Java</code> [on page .pySectionBody] <br>
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
ClipboardProperty propTable = myStepPage.getProperty("pyTable");
ClipboardProperty pyRows = propTable.getProperty("pyRows");
java.util.Iterator iter_Rows = pyRows.iterator();
boolean foundInlineStyle = false;
ClipboardProperty cp_pyRows;
java.util.Iterator iter_pyCells = null;
ClipboardProperty cp_pyCells;
ClipboardProperty cp_pyCell;
while (iter_Rows.hasNext()) {
	cp_pyRows = (ClipboardProperty) iter_Rows.next();
	cp_pyCells = cp_pyRows.getProperty("pyCells");
	iter_pyCells = cp_pyCells.iterator();
	while (iter_pyCells.hasNext()) {
		cp_pyCell = (ClipboardProperty) iter_pyCells.next();
		//String ctrlType = cp_pyCell.getProperty("pyType").getStringValue();
	    //if("layout".equalsIgnoreCase(ctrlType)){
			//Case-1 : when inline style directly in cell
			if (cp_pyCell.getPageValue().containsKey("pyInlineStyle")){
				String pyStyle= cp_pyCell.getProperty("pyInlineStyle").getStringValue();
				if(!"".equals(pyStyle)) {
					foundInlineStyle = true;		
                  	com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(myStepPage.getTopLevelPage().getProperty("pySections"),"pxInlineStyles",null);
				}
			}
          	if(!foundInlineStyle){	
				ClipboardProperty cp_pySections = cp_pyCell.getProperty("pySections");					
				if(!foundInlineStyle){
					//Case-2 : when inline style is not present iterator 
					java.util.Iterator secIter = cp_pySections.iterator();	
					while(secIter.hasNext()){
						ClipboardProperty cp_thisSection =(ClipboardProperty)secIter.next();
						ClipboardPage pg_thisSection = cp_thisSection.getPageValue();
						
                      	//Case-3 : when inline style directly in pySections 
                        if(pg_thisSection != null){
                          //if(cp_pySections.getPageValue().containsKey("pyInlineStyle")){
                            ClipboardProperty cpInlineStyle = pg_thisSection.getProperty("pyInlineStyle");
                            if(cpInlineStyle != null){
                              String pyStyle = cpInlineStyle.getStringValue();
                              if(!"".equals(pyStyle)) {
                                foundInlineStyle = true;
                                com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(myStepPage.getTopLevelPage().getProperty("pySections"),"pxInlineStyles",null);
                              }
                            }
                          //}
                        }
                      
						if(!foundInlineStyle){
							StringMap activityMap = new HashStringMap();
							activityMap.putString("pyClassName", "Embed-Harness-Section");
							activityMap.putString("pyActivityName", "pzCheckForInlineStyleWarnings");
                          	tools.doActivity(activityMap, pg_thisSection, tools.getParameterPage());
						} else{
							break;
						}
					}
				} else{
					break;
				}
			} else {
				break;
			}
			continue;
		//}
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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY EMBED-HARNESS-SECTION PZCHECKFORINLINESTYLEWARNINGS #20180713T133838.554 GMT", "Embed-Harness-Section pzCheckForInlineStyleWarnings", "Pega-UIDesign", "08-01-01", false, true, "", "ACTIVITY", "20180713T133838.554 GMT" ,"Rule-Obj-Activity"); }
