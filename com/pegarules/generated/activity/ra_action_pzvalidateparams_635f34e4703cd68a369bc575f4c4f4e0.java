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
public class ra_action_pzvalidateparams_635f34e4703cd68a369bc575f4c4f4e0 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzValidateParams.Embed_DeclarePageSource.Action");
	public ra_action_pzvalidateparams_635f34e4703cd68a369bc575f4c4f4e0(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY EMBED-DECLAREPAGESOURCE PZVALIDATEPARAMS #20180713T135706.989 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY EMBED-DECLAREPAGESOURCE PZVALIDATEPARAMS #20180713T135706.989 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-DECLAREPAGESOURCE PZVALIDATEPARAMS #20180713T135706.989 GMT Step: 1 Circum: 0" );
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
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY EMBED-DECLAREPAGESOURCE PZVALIDATEPARAMS #20180713T135706.989 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
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
	"Rule-Obj-Activity:PZVALIDATEPARAMS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZVALIDATEPARAMS","Rule-Obj-Activity","EMBED-DECLAREPAGESOURCE",false,"","Pega-SystemArchitect","08-01-01","RULE-OBJ-ACTIVITY EMBED-DECLAREPAGESOURCE PZVALIDATEPARAMS #20180713T135706.989 GMT","!PZVALIDATEPARAMS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1174674122)
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
//	RULE-OBJ-ACTIVITY EMBED-DECLAREPAGESOURCE PZVALIDATEPARAMS #20180713T135706.989 GMT:20180713T135706.989 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "9fcf31d1895f458f0390b00667933a9f";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-DeclarePageSource";
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
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, "Param.ignoreValidations==\"true\"");
try {
boolean pz_1 = (tools.getParamValue("ignoreValidations").equals("true"));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, "Param.ignoreValidations==\"true\"",pz_1);
if (pz_1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("Param.ignoreValidations==\"true\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
String paramList=tools.getParamValue("paramList");
ClipboardProperty parameterList = tools.getProperty(paramList);
String typeOfDataSource=tools.getParamValue("typeOfDataSource");
String dataSourceName=tools.getParamValue("dataSourceName");
ClipboardPage primaryPage = tools.getPrimaryPage();
ClipboardPage topLevelPage = primaryPage.getTopLevelPage();
ClipboardProperty topLevelPageParameters = topLevelPage.getProperty("pyParameters");


int dotIndex = -1;
String propClassName = null;

String requiredCondition ="";
if(typeOfDataSource.equals("LoadActivity"))
	requiredCondition ="Y";
else if(typeOfDataSource.equals("ReportDefinition"))
	requiredCondition ="Y";
else if(typeOfDataSource.equals("DataTransform"))
	requiredCondition="-1";
else if(typeOfDataSource.equals("WhenRule"))
	requiredCondition="-1";

	//list of parameters
try {

ClipboardProperty cpParams = myStepPage.getProperty(paramList);
Iterator paramsIter = cpParams.iterator();
while ( paramsIter.hasNext() ) {

	ClipboardProperty param = ((ClipboardProperty) paramsIter.next());
	ClipboardPage pageFields = param.getPageValue();
	String paramValue = pageFields.getString("pyValue");
	String paramName = pageFields.getString("pyName");
	String isRequired = pageFields.getString("pyParameterRequired");

	
	if (  !"pyTempPlaceHolder".equalsIgnoreCase(paramName) && !(paramValue.startsWith("\"") && paramValue.endsWith("\"")) ) {

		
		
      if(typeOfDataSource.equals("LoadActivity")){	//When activity is chosen as Data Source.	  
		      if( !isRequired.equals("") && (isRequired.equals("Y")||isRequired.equals("-1")) ) {
	                    if(paramValue.trim().equals("")){
		                    String moreInfo = "";
		                    if(dataSourceName!=null && !dataSourceName.equals("")) {
		                           moreInfo = "Click on parameters link of "+ typeOfDataSource +"("+dataSourceName+") to enter correct values.";
		                    }
		                    pageFields.getProperty("pyValue").addMessage("pzParamBlank\t" + paramName+" \t" + moreInfo); 

                        }
             }
          }	

        if(!typeOfDataSource.equals("LoadActivity")){		//When any Data source other than activity is chosen.	  
	           if(!isRequired.equals("") && requiredCondition.equals(isRequired) ){// && paramValue.trim().equals("")){
	           	        if(paramValue.trim().equals("")){ 
	                    String moreInfo = "";
	                    if(dataSourceName!=null && !dataSourceName.equals("")) {
	                           moreInfo = "Click on parameters link of "+ typeOfDataSource +"("+dataSourceName+") to enter correct values.";
	                    }
	                    pageFields.getProperty("pyValue").addMessage("pzParamBlank\t" + paramName+" \t" + moreInfo);
	                }

	            }
		}

		if (typeOfDataSource.equals("LoadActivity") && "loaderActivityClass".equals(paramName)) {
				if ( tools.getDatabase().getClassDef(paramValue) == null ){
                    pageFields.getProperty("pyValue").addMessage("pzParamClassInvalid\t" + paramName);
				}
        }

       if (typeOfDataSource.equals("LoadActivity") && "loaderActivityName".equals(paramName)) {
                HashStringMap keyAct = new HashStringMap();
                keyAct.putString("pxObjClass", "Rule-Obj-Activity");
                keyAct.putString("pyClassName", topLevelPage.getPage("pyLoadActivityParameters").getString(".loaderActivityClass"));
                keyAct.putString("pyActivityName", paramValue );
                ClipboardPage refAct = tools.getDatabase().open(keyAct, false);
	                if(refAct == null){
	                    pageFields.getProperty("pyValue").addMessage("pzParamActivityInvalid\t" + paramName);
	                }
                keyAct.clear();
        }
        if (typeOfDataSource.equals("LoadActivity") && "loaderActivityPageName".equals(paramName) && paramValue.contains(".")){
           		 pageFields.getProperty("pyValue").addMessage("Invalid_PageReference for loaderActivityPageName \t" + paramValue);
           		 pageFields.getProperty("pyValue").addMessage("pzPageReferenceInvalid\t" + paramValue);
        }  		 
		if ( paramValue.indexOf('.') > 0 && !paramValue.toLowerCase().startsWith("param.")) {
			//named page reference, let's see if it's defined.
					dotIndex = paramValue.lastIndexOf(".");
					String assocPageName = null;			
					ClipboardPage propTopLevelPage = myStepPage;					
					if(dotIndex > 0){
						if(!paramValue.startsWith(".")) {						
							assocPageName = paramValue.substring(0,dotIndex);
							String[] propPages = assocPageName.split("[.]");						
							ClipboardProperty pcList = topLevelPage.getProperty(".pyPagesAndClasses");											
							if(pcList != null){
								Iterator pcIter = pcList.iterator();
								boolean pageFound = false;
								while (pcIter.hasNext()) {													
									ClipboardPage pc = ((ClipboardProperty)pcIter.next()).getPageValue();
									String pcName = pc.getString("pyPagesAndClassesPage");													
									if (pcName.equals(propPages[0])) {
										pageFound = true;
										propTopLevelPage = pc;
										propClassName = propTopLevelPage.getString("pyPagesAndClassesClass"); 
										if(propPages.length>1){
											for(int i=1; i<propPages.length; i++){
												String parentPropClass = propClassName;
												if(!propPages[i].equals("")){
													propClassName = tools.getDictionary().fromDefinition(propClassName, propPages[i],"pyPageClass");
												//Check if it is gateway property?
													if (propClassName == null || propClassName.length() == 0) {
														String gwClass = tools.getDictionary().getGatewayClass(parentPropClass, propPages[i]); 
														if (gwClass != null && gwClass.length() > 0) {
															propClassName = gwClass;
														}
													}	
												}
												parentPropClass = propClassName;
											}
										}
										ImmutablePropertyInfo propInfo = tools.getDictionary().getImmutablePropertyInfo(propClassName, paramValue.substring(dotIndex+1));
										if(propInfo == null){
											pageFields.getProperty("pyValue").addMessage("pzPropertyNameInvalid\t" + paramValue);
										}
											break;
									}	
								}
								if(!pageFound)
									pageFields.getProperty("pyValue").addMessage("pzPageNameInvalid\t" + paramValue);
							}
						}
						else {
							pageFields.getProperty("pyValue").addMessage("pzDirectReferenceNotAllowed\t" + paramValue);
						}
					}	
				
		} if (paramValue.toLowerCase().startsWith("param.")) {
			    // Check if the wrong parameters are set.				
					Iterator topLevelParamsIter = topLevelPageParameters.iterator();
				    boolean isCorrectParam = false;
				    while(topLevelParamsIter.hasNext()) {				 				 	
					 	ClipboardPage topLevelPageFields = ((ClipboardProperty) topLevelParamsIter.next()).getPageValue();		 
						String topLevelParamName = topLevelPageFields.getString("pyParametersParamName");
						String paramValueName = paramValue.substring(paramValue.indexOf(".")+1);
						if(paramValueName.equals(topLevelParamName)){
						    isCorrectParam = true;
						}
				 }
				  if(!isCorrectParam){
                       pageFields.getProperty("pyValue").addMessage("pzParamNameInvalid\t" + paramValue+" \t" + paramName);
				    }				  			
		}
		if(paramValue.indexOf('.') == 0){
	        	//validating parameter references
				 pageFields.getProperty("pyValue").addMessage("pzPageNotDefinedInPagesAndClasses\t" + paramValue);
	    }


	}//end of if pyTempPlaceHolder 
} // end of while 

} // end of try

catch (DatabaseException ex) {
primaryPage.getProperty("pyDeclarePagesDataSource").addMessage(ex.getMessage());
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

/**
 * Step 2 <code>Page-Remove</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
boolean pz__1 = pega.invokeWhen("hasMessages", "Embed-DeclarePageSource", "Embed-DeclarePageSource");
if (pz__1) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
// Expression: TempDataSource
pageRemove(tools.findPage("TempDataSource"));
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY EMBED-DECLAREPAGESOURCE PZVALIDATEPARAMS #20180713T135706.989 GMT", "Embed-DeclarePageSource pzValidateParams", "Pega-SystemArchitect", "08-01-01", false, true, "", "ACTIVITY", "20180713T135706.989 GMT" ,"Rule-Obj-Activity"); }
