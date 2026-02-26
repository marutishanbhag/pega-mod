package com.pegarules.generated.navigation;
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
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
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
import java.util.*;
public class ra_action_pzrasaveasactions_78df861c25606f5e0d6da2cc3fc9925f  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzRASaveAsActions.Rule_.Action");
	public ra_action_pzrasaveasactions_78df861c25606f5e0d6da2cc3fc9925f(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}

ClipboardPage stepPage = null;
String finalOutPutPageName = null;
boolean forceFullLoad = false;
boolean isDynamicFieldNameForMenu = true;
boolean functionalTestingWhen = false;
boolean testIDWhen = false;
public void perform() {
functionalTestingWhen = pega_uiengine_pznavigation.evaluateWhen("pyEnableFunctionalTesting", tools.getStepPage().getClassName(), tools);
testIDWhen = pega_uiengine_pznavigation.evaluateWhen("pzEnableTestId",tools.getStepPage().getClassName(),tools);
com.pega.pegarules.priv.tracer.RuleTraceInfo mTraceInfo = oTraceInfo_0 ;
if(mTraceInfo!=null && pega.isTraceEnabled("Rule Coverage", mTraceInfo)){pega.logTraceEvent("Rule Coverage", "Navigation Start", "GOOD", mTraceInfo,mTraceInfo.getInsKey(), "BEGIN NAVIGATION",false, tools.getPrimaryPage(), tools.getStackFrame().getParameterPage(), null);}/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-NAVIGATION RULE- PZRASAVEASACTIONS #20190514T132711.396 GMT	Pega-Desktop:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(false){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "pzRASaveAsActions"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("pzRASaveAsActions");
	}
}
String actionType=tools.getParamValue("Action");
boolean processShortcut= actionType.equals("pxProcessShortcut")?true:false;
boolean processAction= actionType.equals("pxProcessAction")?true:false;
String nodePath=tools.getParamValue("nodePath");
boolean isNodePathEmpty=nodePath.equals("")?true:false;
String [] nodePathArr=nodePath.split("/");
method1_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method6_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method11_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
}
	} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODBODY", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCUSTOM", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCREATENEWWORK", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PZRASAVEASACTIONS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCREATENEWWORK","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCREATENEWWORK",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZRASAVEASACTIONS","Rule-Navigation","RULE-",false,"","Pega-Desktop","08-03-01","RULE-NAVIGATION RULE- PZRASAVEASACTIONS #20190514T132711.396 GMT","!PZRASAVEASACTIONS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2050065041)
	};

	 /**
	 * This method returns the set of dependent rules required to build
	 * the generated code and (possibly) whole classes that the rules assembler declared.
	 * @return array of <code>DependentRuleInfo</code> objects.
	 */
	public DependentRuleInfo[] getDependentRuleInfos() {
		return oDependentRuleInfos;
	}

public static final DependentRuleInfo[] oTrackedDependencies = new DependentRuleInfo[]{oDependentRuleInfos[0]};

//	Rules used in this assembly (order and duplicates ARE significant to hash code) :
//	RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT:crc:865379769
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT:20180713T133341.480 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT:20180713T133341.484 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT:20180713T133341.496 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-NAVIGATION RULE- PZRASAVEASACTIONS #20190514T132711.396 GMT:20190514T132711.396 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUE #20180713T133341.510 GMT:20180713T133341.510 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUEFORCUSTOM #20180713T133341.521 GMT:20180713T133341.521 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZISREFERENCEFORCUSTOM #20180713T133341.542 GMT:20180713T133341.542 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESS--(STRING,STRING,CLIPBO23CEBAD98543B5A3EAFA23BE1E9907F7 #20180713T133342.835 GMT:20180713T133342.835 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19 #20230618T001619.186 GMT:20230618T001619.186 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONINNER--(FIRSTUSEA4574746F7C70774C55B41C005EC01EE7 #20190928T111813.415 GMT:20190928T145202.738 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCREATENEWWORK #20201103T105517.453 GMT:20201103T105517.453 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCUSTOM #20180713T133341.621 GMT:20180713T133341.621 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZNAVIGATION PZISREFERENCE #20180713T133347.956 GMT:20180713T133347.956 GMT
//	RULE-UTILITY-FUNCTION STRING ISDOUBLE #20180713T131441.648 GMT:20180713T131441.648 GMT
//	RULE-UTILITY-FUNCTION STRING ISINTEGER #20180713T131441.652 GMT:20180713T131441.652 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ec65f6d45a7bf85d408e3148c7f020e3";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRASaveAsActions" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1407229256653000".equals(nodePathArr[0])  && !isNodePathEmpty)){
String uniqueSuffix = new Long(tools.getDateTimeUtils().currentTimeUnique()).toString();
String commonPrefix = "Nav_";
boolean showWhenCondition = true;
boolean isActiveNavItem = false;
boolean showHavePrivilege = true;
boolean enableWhenCondition = true;
boolean enableHavePrivilege = true;
boolean enableWhenConditionParent = true;
boolean enableHavePrivilegeParent = true;
boolean hideElement = false;
boolean disableElement = false;
boolean isChecked = false;
boolean isGroup = false;
String pyCaption = null;
String pyName = null;
String pySummary = null;
String propertyValue = null;
StringMap custActParamMap = null;
ParameterPage custParamsPage = null;
StringMap preActParamMap = null;
StringMap postActParamMap = null;
Iterator actionListIter = null;
ClipboardProperty iterListResult = null;
ClipboardProperty nodePageList = null;
ClipboardPage childListPage = null;
ParameterPage newParamsPage = null;
String strName = "";
String strValue = "";
String strPageList = "";
String nodePathName=null;
ClipboardPage executePage = null;
int startIndex=0;
boolean dontExitNow=true;
String actionPageParent="actionPage1";
boolean nodePathValidated=false;
String pyNameSuffix = "";
String parentPageRef = "";
String strPageName = "";
boolean deferLoad = false;
boolean skipNode = false;
String deferLoadPath = tools.getParamValue("deferLoadPath");
String deferPathArr[] = StringUtils.isBlank(deferLoadPath)?new String[0]:deferLoadPath.split("/");
String currentDeferPath = "";
int deferIndex = 0;
int nodeDepth=0;
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1407229256653000")){
return;}
if(processShortcut &&"ID1407229256653000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage1= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage1 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage1 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","ID1407229256653000");actionPage1.putString( "pyCaption","Save As");actionPage1.putString( "pySummary","");actionPage1.putString( "pyBadgeProperty","");actionPage1.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage1.putString( "pyAutomationID","201905100630310498477");}actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","false");actionPage1.putString( "pyImage","");actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage1 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage1.putString("pyAction","runScript");ClipboardPage commandPage1 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage1.getProperty("pyParameters").getPageValue(1).putString( "pyValue","SAVEAS");commandPage1.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage1.putString( "pyFunctionName","onBeforeExecuteActionWrapper");executePage.putPage("pyCustom",commandPage1);
behaviorPage1.putPage("pyActionAPI",commandPage1);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage1.removeFromClipboard();
ClipboardPage behaviorPage2 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","runScript");ClipboardPage commandPage2 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage2.putString( "pyFunctionName","postPRXML");behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
ClipboardPage behaviorPage3 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","runScript");ClipboardPage commandPage3 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage3.getProperty("pyParameters").getPageValue(1).putString( "pyValue","pzPostRuleFormValues");commandPage3.getProperty("pyParameters").getPageValue(1).putString( "pyName","ActivityName");commandPage3.putString( "pyFunctionName","postRuleFormValues");behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
ClipboardPage behaviorPage4 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","runScript");ClipboardPage commandPage4 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage4.putString( "pyFunctionName","RedirectRule");behaviorPage4.putPage("pyActionAPI",commandPage4);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage4.removeFromClipboard();
ClipboardPage behaviorPage5 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage5.putString("pyAction","createWork");ClipboardPage commandPage5 = tools.createPage("Embed-DesktopAPI-CreateNewWork","commandType");
commandPage5.putString( "pyClassName","Work-ProjectManagement-SaveAs");commandPage5.putString( "pyFlowName","SaveAsModalFlow");commandPage5.putString( "pyElementName","");commandPage5.putString( "pyTargetElement","");commandPage5.putString( "pyIsTargetMicroDC","");commandPage5.putString( "pyACName","");commandPage5.putString( "pySelectedMobileTransitionType","pega.mobile.transitions.NONE");propertyValue = "pxThread.pxThreadName";
commandPage5.getProperty("pyFlowParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage5.getProperty("pyFlowParameters").getPageValue(1).putString( "pyName","saveAsThreadName");commandPage5.getProperty("pyFlowParameters").getPageValue(1).putString( "pxObjClass","Embed-MethodParams");propertyValue = ".pyStepPageReference";
propertyValue = tools.getParamValue("ApplyToPage")+".pyStepPageReference";commandPage5.getProperty("pyFlowParameters").getPageValue(2).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage5.getProperty("pyFlowParameters").getPageValue(2).putString( "pyName","saveAsPageName");commandPage5.getProperty("pyFlowParameters").getPageValue(2).putString( "pxObjClass","Embed-MethodParams");commandPage5.getProperty("pyFlowParameters").getPageValue(3).putString( "pyValue","clone");commandPage5.getProperty("pyFlowParameters").getPageValue(3).putString( "pyName","pyDisplayMode");commandPage5.getProperty("pyFlowParameters").getPageValue(3).putString( "pxObjClass","Embed-MethodParams");commandPage5.getProperty("pyFlowParameters").getPageValue(4).putString( "pyValue","duplicate");commandPage5.getProperty("pyFlowParameters").getPageValue(4).putString( "pyName","pySpecializationType");commandPage5.getProperty("pyFlowParameters").getPageValue(4).putString( "pxObjClass","Embed-MethodParams");behaviorPage5.putPage("pyActionAPI",commandPage5);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage5.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage1);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRASaveAsActions" */

private void method6_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1376335186574002".equals(nodePathArr[0])  && !isNodePathEmpty)){
String uniqueSuffix = new Long(tools.getDateTimeUtils().currentTimeUnique()).toString();
String commonPrefix = "Nav_";
boolean showWhenCondition = true;
boolean isActiveNavItem = false;
boolean showHavePrivilege = true;
boolean enableWhenCondition = true;
boolean enableHavePrivilege = true;
boolean enableWhenConditionParent = true;
boolean enableHavePrivilegeParent = true;
boolean hideElement = false;
boolean disableElement = false;
boolean isChecked = false;
boolean isGroup = false;
String pyCaption = null;
String pyName = null;
String pySummary = null;
String propertyValue = null;
StringMap custActParamMap = null;
ParameterPage custParamsPage = null;
StringMap preActParamMap = null;
StringMap postActParamMap = null;
Iterator actionListIter = null;
ClipboardProperty iterListResult = null;
ClipboardProperty nodePageList = null;
ClipboardPage childListPage = null;
ParameterPage newParamsPage = null;
String strName = "";
String strValue = "";
String strPageList = "";
String nodePathName=null;
ClipboardPage executePage = null;
int startIndex=0;
boolean dontExitNow=true;
String actionPageParent="actionPage6";
boolean nodePathValidated=false;
String pyNameSuffix = "";
String parentPageRef = "";
String strPageName = "";
boolean deferLoad = false;
boolean skipNode = false;
String deferLoadPath = tools.getParamValue("deferLoadPath");
String deferPathArr[] = StringUtils.isBlank(deferLoadPath)?new String[0]:deferLoadPath.split("/");
String currentDeferPath = "";
int deferIndex = 0;
int nodeDepth=0;
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1376335186574002")){
return;}
if(processShortcut &&"ID1376335186574002".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage6= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage6 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage6 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzCanSpecByClassOrRuleset";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage6.putString("pyHidden",String.valueOf(hideElement));actionPage6.putString("pyDisabled",String.valueOf(disableElement));actionPage6.putString( "pyName","ID1376335186574002");actionPage6.putString( "pyCaption","Specialize by class or ruleset");actionPage6.putString( "pySummary","");actionPage6.putString( "pyBadgeProperty","");actionPage6.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage6.putString( "pyAutomationID","201905100630310704841");}actionPage6.putString( "pyBadgeFormat","Standard (label)");actionPage6.putString( "pyDeferLoad","false");actionPage6.putString( "pyImage","");if (!hideElement) { 
actionPage6.putString("pyType","Action");
executePage=actionPage6.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage6 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage6.putString("pyAction","runScript");ClipboardPage commandPage6 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage6.getProperty("pyParameters").getPageValue(1).putString( "pyValue","SAVEAS");commandPage6.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage6.putString( "pyFunctionName","onBeforeExecuteActionWrapper");executePage.putPage("pyCustom",commandPage6);
behaviorPage6.putPage("pyActionAPI",commandPage6);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage6.removeFromClipboard();
ClipboardPage behaviorPage7 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage7.putString("pyAction","runScript");ClipboardPage commandPage7 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage7.putString( "pyFunctionName","postPRXML");behaviorPage7.putPage("pyActionAPI",commandPage7);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage7.removeFromClipboard();
ClipboardPage behaviorPage8 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage8.putString("pyAction","runScript");ClipboardPage commandPage8 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage8.getProperty("pyParameters").getPageValue(1).putString( "pyValue","pzPostRuleFormValues");commandPage8.getProperty("pyParameters").getPageValue(1).putString( "pyName","ActivityName");commandPage8.putString( "pyFunctionName","postRuleFormValues");behaviorPage8.putPage("pyActionAPI",commandPage8);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage8.removeFromClipboard();
ClipboardPage behaviorPage9 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage9.putString("pyAction","runScript");ClipboardPage commandPage9 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage9.putString( "pyFunctionName","RedirectRule");behaviorPage9.putPage("pyActionAPI",commandPage9);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage9.removeFromClipboard();
ClipboardPage behaviorPage10 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage10.putString("pyAction","createWork");ClipboardPage commandPage10 = tools.createPage("Embed-DesktopAPI-CreateNewWork","commandType");
commandPage10.putString( "pyClassName","Work-ProjectManagement-SaveAs");commandPage10.putString( "pyFlowName","SaveAsModalFlow");commandPage10.putString( "pyElementName","");commandPage10.putString( "pyTargetElement","");commandPage10.putString( "pyIsTargetMicroDC","");commandPage10.putString( "pyACName","");commandPage10.putString( "pySelectedMobileTransitionType","pega.mobile.transitions.NONE");propertyValue = "pxThread.pxThreadName";
commandPage10.getProperty("pyFlowParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage10.getProperty("pyFlowParameters").getPageValue(1).putString( "pyName","saveAsThreadName");commandPage10.getProperty("pyFlowParameters").getPageValue(1).putString( "pxObjClass","Embed-MethodParams");propertyValue = ".pyStepPageReference";
propertyValue = tools.getParamValue("ApplyToPage")+".pyStepPageReference";commandPage10.getProperty("pyFlowParameters").getPageValue(2).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage10.getProperty("pyFlowParameters").getPageValue(2).putString( "pyName","saveAsPageName");commandPage10.getProperty("pyFlowParameters").getPageValue(2).putString( "pxObjClass","Embed-MethodParams");commandPage10.getProperty("pyFlowParameters").getPageValue(3).putString( "pyValue","specialize");commandPage10.getProperty("pyFlowParameters").getPageValue(3).putString( "pyName","pyDisplayMode");commandPage10.getProperty("pyFlowParameters").getPageValue(3).putString( "pxObjClass","Embed-MethodParams");commandPage10.getProperty("pyFlowParameters").getPageValue(4).putString( "pyValue","CLASS");commandPage10.getProperty("pyFlowParameters").getPageValue(4).putString( "pyName","pySpecializationType");commandPage10.getProperty("pyFlowParameters").getPageValue(4).putString( "pxObjClass","Embed-MethodParams");behaviorPage10.putPage("pyActionAPI",commandPage10);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage10.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage6);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzRASaveAsActions" */

private void method11_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1376335186574001".equals(nodePathArr[0])  && !isNodePathEmpty)){
String uniqueSuffix = new Long(tools.getDateTimeUtils().currentTimeUnique()).toString();
String commonPrefix = "Nav_";
boolean showWhenCondition = true;
boolean isActiveNavItem = false;
boolean showHavePrivilege = true;
boolean enableWhenCondition = true;
boolean enableHavePrivilege = true;
boolean enableWhenConditionParent = true;
boolean enableHavePrivilegeParent = true;
boolean hideElement = false;
boolean disableElement = false;
boolean isChecked = false;
boolean isGroup = false;
String pyCaption = null;
String pyName = null;
String pySummary = null;
String propertyValue = null;
StringMap custActParamMap = null;
ParameterPage custParamsPage = null;
StringMap preActParamMap = null;
StringMap postActParamMap = null;
Iterator actionListIter = null;
ClipboardProperty iterListResult = null;
ClipboardProperty nodePageList = null;
ClipboardPage childListPage = null;
ParameterPage newParamsPage = null;
String strName = "";
String strValue = "";
String strPageList = "";
String nodePathName=null;
ClipboardPage executePage = null;
int startIndex=0;
boolean dontExitNow=true;
String actionPageParent="actionPage11";
boolean nodePathValidated=false;
String pyNameSuffix = "";
String parentPageRef = "";
String strPageName = "";
boolean deferLoad = false;
boolean skipNode = false;
String deferLoadPath = tools.getParamValue("deferLoadPath");
String deferPathArr[] = StringUtils.isBlank(deferLoadPath)?new String[0]:deferLoadPath.split("/");
String currentDeferPath = "";
int deferIndex = 0;
int nodeDepth=0;
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1376335186574001")){
return;}
if(processShortcut &&"ID1376335186574001".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage11= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage11 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage11 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzShowCircumstanceOption";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage11.putString("pyHidden",String.valueOf(hideElement));actionPage11.putString("pyDisabled",String.valueOf(disableElement));actionPage11.putString( "pyName","ID1376335186574001");actionPage11.putString( "pyCaption","Specialize by circumstance");actionPage11.putString( "pySummary","");actionPage11.putString( "pyBadgeProperty","");actionPage11.putString( "pyToolTip","");if(testIDWhen || functionalTestingWhen){actionPage11.putString( "pyAutomationID","201905100630310722667");}actionPage11.putString( "pyBadgeFormat","Standard (label)");actionPage11.putString( "pyDeferLoad","false");actionPage11.putString( "pyImage","");if (!hideElement) { 
actionPage11.putString("pyType","Action");
executePage=actionPage11.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage11 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage11.putString("pyAction","runScript");ClipboardPage commandPage11 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage11.getProperty("pyParameters").getPageValue(1).putString( "pyValue","SAVEAS");commandPage11.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage11.putString( "pyFunctionName","onBeforeExecuteActionWrapper");executePage.putPage("pyCustom",commandPage11);
behaviorPage11.putPage("pyActionAPI",commandPage11);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage11.removeFromClipboard();
ClipboardPage behaviorPage12 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage12.putString("pyAction","runScript");ClipboardPage commandPage12 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage12.putString( "pyFunctionName","postPRXML");behaviorPage12.putPage("pyActionAPI",commandPage12);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage12.removeFromClipboard();
ClipboardPage behaviorPage13 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage13.putString("pyAction","runScript");ClipboardPage commandPage13 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage13.getProperty("pyParameters").getPageValue(1).putString( "pyValue","pzPostRuleFormValues");commandPage13.getProperty("pyParameters").getPageValue(1).putString( "pyName","ActivityName");commandPage13.putString( "pyFunctionName","postRuleFormValues");behaviorPage13.putPage("pyActionAPI",commandPage13);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage13.removeFromClipboard();
ClipboardPage behaviorPage14 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage14.putString("pyAction","runScript");ClipboardPage commandPage14 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage14.putString( "pyFunctionName","RedirectRule");behaviorPage14.putPage("pyActionAPI",commandPage14);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage14.removeFromClipboard();
ClipboardPage behaviorPage15 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage15.putString("pyAction","createWork");ClipboardPage commandPage15 = tools.createPage("Embed-DesktopAPI-CreateNewWork","commandType");
commandPage15.putString( "pyClassName","Work-ProjectManagement-SaveAs");commandPage15.putString( "pyFlowName","SaveAsModalFlow");commandPage15.putString( "pyElementName","");commandPage15.putString( "pyTargetElement","");commandPage15.putString( "pyIsTargetMicroDC","");commandPage15.putString( "pyACName","");commandPage15.putString( "pySelectedMobileTransitionType","");propertyValue = "pxThread.pxThreadName";
commandPage15.getProperty("pyFlowParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage15.getProperty("pyFlowParameters").getPageValue(1).putString( "pyName","saveAsThreadName");commandPage15.getProperty("pyFlowParameters").getPageValue(1).putString( "pxObjClass","Embed-MethodParams");propertyValue = ".pyStepPageReference";
propertyValue = tools.getParamValue("ApplyToPage")+".pyStepPageReference";commandPage15.getProperty("pyFlowParameters").getPageValue(2).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage15.getProperty("pyFlowParameters").getPageValue(2).putString( "pyName","saveAsPageName");commandPage15.getProperty("pyFlowParameters").getPageValue(2).putString( "pxObjClass","Embed-MethodParams");commandPage15.getProperty("pyFlowParameters").getPageValue(3).putString( "pyValue","specialize");commandPage15.getProperty("pyFlowParameters").getPageValue(3).putString( "pyName","pyDisplayMode");commandPage15.getProperty("pyFlowParameters").getPageValue(3).putString( "pxObjClass","Embed-MethodParams");commandPage15.getProperty("pyFlowParameters").getPageValue(4).putString( "pyValue","TEMPLATE");commandPage15.getProperty("pyFlowParameters").getPageValue(4).putString( "pyName","pySpecializationType");commandPage15.getProperty("pyFlowParameters").getPageValue(4).putString( "pxObjClass","Embed-MethodParams");behaviorPage15.putPage("pyActionAPI",commandPage15);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage15.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage11);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION RULE- PZRASAVEASACTIONS #20190514T132711.396 GMT", "Rule- pzRASaveAsActions", "Pega-Desktop", "08-03-01", "20190514T132711.396 GMT");
}
