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
public class ra_action_pzcommonutilityapis_90a0809de372eaddd4c4843cd5e52140  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzCommonUtilityAPIs.Rule_Obj_Flow.Action");
	public ra_action_pzcommonutilityapis_90a0809de372eaddd4c4843cd5e52140(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION RULE-OBJ-FLOW PZCOMMONUTILITYAPIS #20230618T001753.613 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(true){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "APIs Extension Navigation"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("APIs Extension Navigation");
	}
}
String actionType=tools.getParamValue("Action");
boolean processShortcut= actionType.equals("pxProcessShortcut")?true:false;
boolean processAction= actionType.equals("pxProcessAction")?true:false;
String nodePath=tools.getParamValue("nodePath");
boolean isNodePathEmpty=nodePath.equals("")?true:false;
String [] nodePathArr=nodePath.split("/");
method1_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method3_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method5_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method7_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method9_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method11_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method14_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method16_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method18_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method20_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method22_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method24_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method26_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method28_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method30_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method32_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method34_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method36_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method38_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method40_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method42_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method44_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method46_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method48_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method50_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method52_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method54_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method56_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
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
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCUSTOM", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PZCOMMONUTILITYAPIS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZCOMMONUTILITYAPIS","Rule-Navigation","RULE-OBJ-FLOW",false,"","Pega-ProcessArchitect","08-23-01","RULE-NAVIGATION RULE-OBJ-FLOW PZCOMMONUTILITYAPIS #20230618T001753.613 GMT","!PZCOMMONUTILITYAPIS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1815169196)
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
//	RULE-NAVIGATION RULE-OBJ-FLOW PZCOMMONUTILITYAPIS #20230618T001753.613 GMT:20230618T001753.613 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUE #20180713T133341.510 GMT:20180713T133341.510 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUEFORCUSTOM #20180713T133341.521 GMT:20180713T133341.521 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUELOCALIZED #20180713T133341.527 GMT:20180713T133341.527 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZISREFERENCEFORCUSTOM #20180713T133341.542 GMT:20180713T133341.542 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESS--(STRING,STRING,CLIPBO23CEBAD98543B5A3EAFA23BE1E9907F7 #20180713T133342.835 GMT:20180713T133342.835 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19 #20230618T001619.186 GMT:20230618T001619.186 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONINNER--(FIRSTUSEA4574746F7C70774C55B41C005EC01EE7 #20190928T111813.415 GMT:20190928T145202.738 GMT
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
		return "13ab83ce901c41baca4ba51b1d830703";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Flow";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1358236049295000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1358236049295000")){
return;}
if(processShortcut &&"ID1358236049295000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","ID1358236049295000");actionPage1.putString( "pyImageSource","styleclass");actionPage1.putString( "pyIconStyle","pzAPIAttachContentIcon");actionPage1.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Attach content"));actionPage1.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage1.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage1.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage1.putString( "pyAutomationID","201711011102180631860");}actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","false");actionPage1.putString( "pyImage","pzAPIAttachContentIcon");if (!hideElement) { 
actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage1 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage1.putString("pyAction","runScript");ClipboardPage commandPage1 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage1.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage1.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage1.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzAttachContent");commandPage1.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage1.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage1);
behaviorPage1.putPage("pyActionAPI",commandPage1);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage1.removeFromClipboard();
ClipboardPage behaviorPage2 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","runScript");ClipboardPage commandPage2 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage2.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzAttachContent\\u0022}}");commandPage2.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage2.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage1);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method3_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1365489829606000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage3";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1365489829606000")){
return;}
if(processShortcut &&"ID1365489829606000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage3= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage3 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage3 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage3.putString("pyHidden",String.valueOf(hideElement));actionPage3.putString("pyDisabled",String.valueOf(disableElement));actionPage3.putString( "pyName","ID1365489829606000");actionPage3.putString( "pyImageSource","styleclass");actionPage3.putString( "pyIconStyle","pzAPIChangeStageIcon");actionPage3.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Change to a stage"));actionPage3.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage3.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage3.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage3.putString( "pyAutomationID","201711011102180643606");}actionPage3.putString( "pyBadgeFormat","Standard (label)");actionPage3.putString( "pyDeferLoad","false");actionPage3.putString( "pyImage","pzAPIChangeStageIcon");if (!hideElement) { 
actionPage3.putString("pyType","Action");
executePage=actionPage3.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage3 = actionPage3.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","runScript");ClipboardPage commandPage3 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage3.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage3.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage3.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pxChangeToSpecifiedStage");commandPage3.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage3.getProperty("pyParameters").getPageValue(3).putString( "pyValue","Automation");commandPage3.getProperty("pyParameters").getPageValue(3).putString( "pyName","");commandPage3.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage3);
behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage3.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
ClipboardPage behaviorPage4 = actionPage3.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","runScript");ClipboardPage commandPage4 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage4.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pxChangeToSpecifiedStage\\u0022,apiClass:\\u0022Work-\\u0022}}");commandPage4.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage4.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage4.putPage("pyActionAPI",commandPage4);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage3.getPage("pyBehaviors(<LAST>)")).register();
commandPage4.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage3);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method5_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1529613737665000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage5";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1529613737665000")){
return;}
if(processShortcut &&"ID1529613737665000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage5= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage5 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage5 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage5.putString("pyHidden",String.valueOf(hideElement));actionPage5.putString("pyDisabled",String.valueOf(disableElement));actionPage5.putString( "pyName","ID1529613737665000");actionPage5.putString( "pyImageSource","styleclass");actionPage5.putString( "pyIconStyle","pzAPIChangeStageIcon");actionPage5.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Change to next stage"));actionPage5.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage5.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage5.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage5.putString( "pyAutomationID","201806211642170306665");}actionPage5.putString( "pyBadgeFormat","Standard (label)");actionPage5.putString( "pyDeferLoad","false");actionPage5.putString( "pyImage","pzAPIChangeStageIcon");if (!hideElement) { 
actionPage5.putString("pyType","Action");
executePage=actionPage5.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage5 = actionPage5.getPage("pyBehaviors(<append>)");
behaviorPage5.putString("pyAction","runScript");ClipboardPage commandPage5 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage5.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage5.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage5.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pxChangeToNextStage");commandPage5.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage5.getProperty("pyParameters").getPageValue(3).putString( "pyValue","Work-");commandPage5.getProperty("pyParameters").getPageValue(3).putString( "pyName","");commandPage5.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage5);
behaviorPage5.putPage("pyActionAPI",commandPage5);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage5.getPage("pyBehaviors(<LAST>)")).register();
commandPage5.removeFromClipboard();
ClipboardPage behaviorPage6 = actionPage5.getPage("pyBehaviors(<append>)");
behaviorPage6.putString("pyAction","runScript");ClipboardPage commandPage6 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage6.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pxChangeToNextStage\\u0022,apiClass:\\u0022Work-\\u0022}}");commandPage6.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage6.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage6.putPage("pyActionAPI",commandPage6);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage5.getPage("pyBehaviors(<LAST>)")).register();
commandPage6.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage5);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method7_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1682347772214000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage7";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1682347772214000")){
return;}
if(processShortcut &&"ID1682347772214000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage7= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage7 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage7 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzToggle_EnableGenerativeAI20230418T060706";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage7.putString("pyHidden",String.valueOf(hideElement));actionPage7.putString("pyDisabled",String.valueOf(disableElement));actionPage7.putString( "pyName","ID1682347772214000");actionPage7.putString( "pyImageSource","styleclass");actionPage7.putString( "pyIconStyle","pzAPIGenerativeAIIcon");actionPage7.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "pxConnectGenerativeAI"));actionPage7.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage7.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage7.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage7.putString( "pyAutomationID","202304241049310485768");}actionPage7.putString( "pyBadgeFormat","Standard (label)");actionPage7.putString( "pyDeferLoad","false");actionPage7.putString( "pyImage","pzAPIGenerativeAIIcon");if (!hideElement) { 
actionPage7.putString("pyType","Action");
executePage=actionPage7.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage7 = actionPage7.getPage("pyBehaviors(<append>)");
behaviorPage7.putString("pyAction","runScript");ClipboardPage commandPage7 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage7.getProperty("pyParameters").getPageValue(1).putString( "pyValue","GenerativeAI");commandPage7.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage7.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pxConnectToGenerativeAI");commandPage7.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage7.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage7);
behaviorPage7.putPage("pyActionAPI",commandPage7);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage7.getPage("pyBehaviors(<LAST>)")).register();
commandPage7.removeFromClipboard();
ClipboardPage behaviorPage8 = actionPage7.getPage("pyBehaviors(<append>)");
behaviorPage8.putString("pyAction","runScript");ClipboardPage commandPage8 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage8.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022GenerativeAI\\u0022,args:{apiName:\\u0022pxConnectToGenerativeAI\\u0022}}");commandPage8.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage8.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage8.putPage("pyActionAPI",commandPage8);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage7.getPage("pyBehaviors(<LAST>)")).register();
commandPage8.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage7);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method9_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1353931862534000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage9";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1353931862534000")){
return;}
if(processShortcut &&"ID1353931862534000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage9= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage9 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage9 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage9.putString("pyHidden",String.valueOf(hideElement));actionPage9.putString("pyDisabled",String.valueOf(disableElement));actionPage9.putString( "pyName","ID1353931862534000");actionPage9.putString( "pyImageSource","styleclass");actionPage9.putString( "pyIconStyle","pzAPICreateCaseIcon");actionPage9.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Create case"));actionPage9.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage9.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage9.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage9.putString( "pyAutomationID","201711011102180659365");}actionPage9.putString( "pyBadgeFormat","Standard (label)");actionPage9.putString( "pyDeferLoad","false");actionPage9.putString( "pyImage","pzAPICreateCaseIcon");if (!hideElement) { 
actionPage9.putString("pyType","Action");
executePage=actionPage9.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage9 = actionPage9.getPage("pyBehaviors(<append>)");
behaviorPage9.putString("pyAction","runScript");ClipboardPage commandPage9 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage9.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage9.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage9.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzCreateCase");commandPage9.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage9.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage9);
behaviorPage9.putPage("pyActionAPI",commandPage9);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage9.getPage("pyBehaviors(<LAST>)")).register();
commandPage9.removeFromClipboard();
ClipboardPage behaviorPage10 = actionPage9.getPage("pyBehaviors(<append>)");
behaviorPage10.putString("pyAction","runScript");ClipboardPage commandPage10 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage10.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzCreateCase\\u0022}}");commandPage10.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage10.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage10.putPage("pyActionAPI",commandPage10);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage9.getPage("pyBehaviors(<LAST>)")).register();
commandPage10.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage9);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method11_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1649849743314000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1649849743314000")){
return;}
if(processShortcut &&"ID1649849743314000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pyIsConversationFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage11.putString("pyHidden",String.valueOf(hideElement));actionPage11.putString("pyDisabled",String.valueOf(disableElement));actionPage11.putString( "pyName","ID1649849743314000");actionPage11.putString( "pyImageSource","styleclass");actionPage11.putString( "pyIconStyle","pzAPICreateCaseIcon");actionPage11.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Create case"));actionPage11.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage11.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage11.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage11.putString( "pyAutomationID","202204130735420979776");}actionPage11.putString( "pyBadgeFormat","Standard (label)");actionPage11.putString( "pyDeferLoad","false");actionPage11.putString( "pyImage","pzAPICreateCaseIcon");if (!hideElement) { 
actionPage11.putString("pyType","Action");
executePage=actionPage11.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage11 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage11.putString("pyAction","runScript");ClipboardPage commandPage11 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage11.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Create case");commandPage11.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage11.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzCreateCaseConversationFlow");commandPage11.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage11.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage11);
behaviorPage11.putPage("pyActionAPI",commandPage11);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage11.removeFromClipboard();
ClipboardPage behaviorPage12 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage12.putString("pyAction","runScript");ClipboardPage commandPage12 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage12.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022CreateCase\\u0022,args:{apiName:\\u0022pzCreateCaseConversationFlow\\u0022}}");commandPage12.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage12.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage12.putPage("pyActionAPI",commandPage12);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage12.removeFromClipboard();
ClipboardPage behaviorPage13 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage13.putString("pyAction","runScript");ClipboardPage commandPage13 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage13.getProperty("pyParameters").getPageValue(1).putString( "pyValue","reload");commandPage13.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage13.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage13.putPage("pyActionAPI",commandPage13);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage13.removeFromClipboard();
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
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method14_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1367472045776001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage14";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1367472045776001")){
return;}
if(processShortcut &&"ID1367472045776001".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage14= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage14 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage14 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage14.putString("pyHidden",String.valueOf(hideElement));actionPage14.putString("pyDisabled",String.valueOf(disableElement));actionPage14.putString( "pyName","ID1367472045776001");actionPage14.putString( "pyImageSource","styleclass");actionPage14.putString( "pyIconStyle","pzAPICreatePDFIcon");actionPage14.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Create PDF"));actionPage14.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage14.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage14.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage14.putString( "pyAutomationID","201711011102180671153");}actionPage14.putString( "pyBadgeFormat","Standard (label)");actionPage14.putString( "pyDeferLoad","false");actionPage14.putString( "pyImage","pzAPICreatePDFIcon");if (!hideElement) { 
actionPage14.putString("pyType","Action");
executePage=actionPage14.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage14 = actionPage14.getPage("pyBehaviors(<append>)");
behaviorPage14.putString("pyAction","runScript");ClipboardPage commandPage14 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage14.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage14.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage14.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pxCreatePDF");commandPage14.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage14.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage14);
behaviorPage14.putPage("pyActionAPI",commandPage14);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage14.getPage("pyBehaviors(<LAST>)")).register();
commandPage14.removeFromClipboard();
ClipboardPage behaviorPage15 = actionPage14.getPage("pyBehaviors(<append>)");
behaviorPage15.putString("pyAction","runScript");ClipboardPage commandPage15 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage15.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pxCreatePDF\\u0022}}");commandPage15.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage15.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage15.putPage("pyActionAPI",commandPage15);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage14.getPage("pyBehaviors(<LAST>)")).register();
commandPage15.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage14);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method16_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1564650607136000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage16";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1564650607136000")){
return;}
if(processShortcut &&"ID1564650607136000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage16= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage16 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage16 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage16.putString("pyHidden",String.valueOf(hideElement));actionPage16.putString("pyDisabled",String.valueOf(disableElement));actionPage16.putString( "pyName","ID1564650607136000");actionPage16.putString( "pyImageSource","styleclass");actionPage16.putString( "pyIconStyle","pzAPIGenerateDocumentIcon");actionPage16.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Generate document"));actionPage16.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage16.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage16.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage16.putString( "pyAutomationID","201908010510060773232");}actionPage16.putString( "pyBadgeFormat","Standard (label)");actionPage16.putString( "pyDeferLoad","false");actionPage16.putString( "pyImage","pzAPIGenerateDocumentIcon");if (!hideElement) { 
actionPage16.putString("pyType","Action");
executePage=actionPage16.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage16 = actionPage16.getPage("pyBehaviors(<append>)");
behaviorPage16.putString("pyAction","runScript");ClipboardPage commandPage16 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage16.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage16.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage16.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pxGenerateAndAttachDocument");commandPage16.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage16.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage16);
behaviorPage16.putPage("pyActionAPI",commandPage16);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage16.getPage("pyBehaviors(<LAST>)")).register();
commandPage16.removeFromClipboard();
ClipboardPage behaviorPage17 = actionPage16.getPage("pyBehaviors(<append>)");
behaviorPage17.putString("pyAction","runScript");ClipboardPage commandPage17 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage17.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pxGenerateAndAttachDocument\\u0022}}");commandPage17.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage17.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage17.putPage("pyActionAPI",commandPage17);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage16.getPage("pyBehaviors(<LAST>)")).register();
commandPage17.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage16);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method18_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1367905557606000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage18";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1367905557606000")){
return;}
if(processShortcut &&"ID1367905557606000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage18= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage18 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage18 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage18.putString("pyHidden",String.valueOf(hideElement));actionPage18.putString("pyDisabled",String.valueOf(disableElement));actionPage18.putString( "pyName","ID1367905557606000");actionPage18.putString( "pyImageSource","styleclass");actionPage18.putString( "pyIconStyle","pzAPIPersistCaseIcon");actionPage18.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Persist case"));actionPage18.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage18.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage18.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage18.putString( "pyAutomationID","201711011102180683826");}actionPage18.putString( "pyBadgeFormat","Standard (label)");actionPage18.putString( "pyDeferLoad","false");actionPage18.putString( "pyImage","pzAPIPersistCaseIcon");if (!hideElement) { 
actionPage18.putString("pyType","Action");
executePage=actionPage18.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage18 = actionPage18.getPage("pyBehaviors(<append>)");
behaviorPage18.putString("pyAction","runScript");ClipboardPage commandPage18 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage18.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage18.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage18.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pxPersistCase");commandPage18.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage18.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage18);
behaviorPage18.putPage("pyActionAPI",commandPage18);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage18.getPage("pyBehaviors(<LAST>)")).register();
commandPage18.removeFromClipboard();
ClipboardPage behaviorPage19 = actionPage18.getPage("pyBehaviors(<append>)");
behaviorPage19.putString("pyAction","runScript");ClipboardPage commandPage19 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage19.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pxPersistCase\\u0022}}");commandPage19.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage19.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage19.putPage("pyActionAPI",commandPage19);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage18.getPage("pyBehaviors(<LAST>)")).register();
commandPage19.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage18);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method20_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1509548644615000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage20";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1509548644615000")){
return;}
if(processShortcut &&"ID1509548644615000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage20= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage20 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage20 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzIsSmartShapeVisible";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage20.putString("pyHidden",String.valueOf(hideElement));actionPage20.putString("pyDisabled",String.valueOf(disableElement));actionPage20.putString( "pyName","ID1509548644615000");actionPage20.putString( "pyImageSource","styleclass");actionPage20.putString( "pyIconStyle","pzAPISaveDataPageIcon");actionPage20.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Save data page"));actionPage20.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage20.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage20.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Save data page"));if(testIDWhen || functionalTestingWhen){actionPage20.putString( "pyAutomationID","20171101110404042911");}actionPage20.putString( "pyBadgeFormat","Standard (label)");actionPage20.putString( "pyDeferLoad","false");actionPage20.putString( "pyImage","pzAPISaveDataPageIcon");if (!hideElement) { 
actionPage20.putString("pyType","Action");
executePage=actionPage20.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage20 = actionPage20.getPage("pyBehaviors(<append>)");
behaviorPage20.putString("pyAction","runScript");ClipboardPage commandPage20 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage20.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage20.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage20.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzSaveDataPage");commandPage20.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage20.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage20);
behaviorPage20.putPage("pyActionAPI",commandPage20);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage20.getPage("pyBehaviors(<LAST>)")).register();
commandPage20.removeFromClipboard();
ClipboardPage behaviorPage21 = actionPage20.getPage("pyBehaviors(<append>)");
behaviorPage21.putString("pyAction","runScript");ClipboardPage commandPage21 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage21.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzSaveDataPage\\u0022}}");commandPage21.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage21.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage21.putPage("pyActionAPI",commandPage21);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage20.getPage("pyBehaviors(<LAST>)")).register();
commandPage21.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage20);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method22_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1516619947772000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage22";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1516619947772000")){
return;}
if(processShortcut &&"ID1516619947772000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage22= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage22 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage22 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzIsSmartShapeVisible";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage22.putString("pyHidden",String.valueOf(hideElement));actionPage22.putString("pyDisabled",String.valueOf(disableElement));actionPage22.putString( "pyName","ID1516619947772000");actionPage22.putString( "pyImageSource","styleclass");actionPage22.putString( "pyIconStyle","pzAPILoadDataPageIcon");actionPage22.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Load data page"));actionPage22.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage22.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage22.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Load data page"));if(testIDWhen || functionalTestingWhen){actionPage22.putString( "pyAutomationID","201801220619070523911");}actionPage22.putString( "pyBadgeFormat","Standard (label)");actionPage22.putString( "pyDeferLoad","false");actionPage22.putString( "pyImage","pzAPILoadDataPageIcon");if (!hideElement) { 
actionPage22.putString("pyType","Action");
executePage=actionPage22.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage22 = actionPage22.getPage("pyBehaviors(<append>)");
behaviorPage22.putString("pyAction","runScript");ClipboardPage commandPage22 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage22.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage22.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage22.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzLoadDataPage");commandPage22.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage22.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage22);
behaviorPage22.putPage("pyActionAPI",commandPage22);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage22.getPage("pyBehaviors(<LAST>)")).register();
commandPage22.removeFromClipboard();
ClipboardPage behaviorPage23 = actionPage22.getPage("pyBehaviors(<append>)");
behaviorPage23.putString("pyAction","runScript");ClipboardPage commandPage23 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage23.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzLoadDataPage\\u0022}}");commandPage23.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage23.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage23.putPage("pyActionAPI",commandPage23);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage22.getPage("pyBehaviors(<LAST>)")).register();
commandPage23.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage22);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method24_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1359959619480000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage24";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1359959619480000")){
return;}
if(processShortcut &&"ID1359959619480000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage24= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage24 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage24 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage24.putString("pyHidden",String.valueOf(hideElement));actionPage24.putString("pyDisabled",String.valueOf(disableElement));actionPage24.putString( "pyName","ID1359959619480000");actionPage24.putString( "pyImageSource","styleclass");actionPage24.putString( "pyIconStyle","pzAPIPostToSocialIcon");actionPage24.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Post to pulse"));actionPage24.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage24.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage24.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage24.putString( "pyAutomationID","201711011102180697629");}actionPage24.putString( "pyBadgeFormat","Standard (label)");actionPage24.putString( "pyDeferLoad","false");actionPage24.putString( "pyImage","pzAPIPostToSocialIcon");if (!hideElement) { 
actionPage24.putString("pyType","Action");
executePage=actionPage24.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage24 = actionPage24.getPage("pyBehaviors(<append>)");
behaviorPage24.putString("pyAction","runScript");ClipboardPage commandPage24 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage24.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage24.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage24.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzPostSocial");commandPage24.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage24.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage24);
behaviorPage24.putPage("pyActionAPI",commandPage24);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage24.getPage("pyBehaviors(<LAST>)")).register();
commandPage24.removeFromClipboard();
ClipboardPage behaviorPage25 = actionPage24.getPage("pyBehaviors(<append>)");
behaviorPage25.putString("pyAction","runScript");ClipboardPage commandPage25 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage25.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzPostSocial\\u0022}}");commandPage25.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage25.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage25.putPage("pyActionAPI",commandPage25);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage24.getPage("pyBehaviors(<LAST>)")).register();
commandPage25.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage24);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method26_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1403079565863000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage26";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1403079565863000")){
return;}
if(processShortcut &&"ID1403079565863000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage26= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage26 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage26 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage26.putString("pyHidden",String.valueOf(hideElement));actionPage26.putString("pyDisabled",String.valueOf(disableElement));actionPage26.putString( "pyName","ID1403079565863000");actionPage26.putString( "pyImageSource","styleclass");actionPage26.putString( "pyIconStyle","pzAPIPushNotificationIcon");actionPage26.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Push notification"));actionPage26.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage26.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage26.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage26.putString( "pyAutomationID","201711011102180709185");}actionPage26.putString( "pyBadgeFormat","Standard (label)");actionPage26.putString( "pyDeferLoad","false");actionPage26.putString( "pyImage","pzAPIPushNotificationIcon");if (!hideElement) { 
actionPage26.putString("pyType","Action");
executePage=actionPage26.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage26 = actionPage26.getPage("pyBehaviors(<append>)");
behaviorPage26.putString("pyAction","runScript");ClipboardPage commandPage26 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage26.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage26.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage26.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pySendPushNotification");commandPage26.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage26.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage26);
behaviorPage26.putPage("pyActionAPI",commandPage26);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage26.getPage("pyBehaviors(<LAST>)")).register();
commandPage26.removeFromClipboard();
ClipboardPage behaviorPage27 = actionPage26.getPage("pyBehaviors(<append>)");
behaviorPage27.putString("pyAction","runScript");ClipboardPage commandPage27 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage27.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pySendPushNotification\\u0022}}");commandPage27.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage27.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage27.putPage("pyActionAPI",commandPage27);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage26.getPage("pyBehaviors(<LAST>)")).register();
commandPage27.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage26);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method28_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1606938888029000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage28";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1606938888029000")){
return;}
if(processShortcut &&"ID1606938888029000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage28= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage28 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage28 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage28.putString("pyHidden",String.valueOf(hideElement));actionPage28.putString("pyDisabled",String.valueOf(disableElement));actionPage28.putString( "pyName","ID1606938888029000");actionPage28.putString( "pyImageSource","styleclass");actionPage28.putString( "pyIconStyle","pzUtilityIcon");actionPage28.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Run data transform"));actionPage28.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage28.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage28.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Run data transform"));if(testIDWhen || functionalTestingWhen){actionPage28.putString( "pyAutomationID","202012021454480013748");}actionPage28.putString( "pyBadgeFormat","Standard (label)");actionPage28.putString( "pyDeferLoad","false");actionPage28.putString( "pyImage","pzUtilityIcon");if (!hideElement) { 
actionPage28.putString("pyType","Action");
executePage=actionPage28.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage28 = actionPage28.getPage("pyBehaviors(<append>)");
behaviorPage28.putString("pyAction","runScript");ClipboardPage commandPage28 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage28.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage28.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage28.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzRunDataTransform");commandPage28.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage28.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage28);
behaviorPage28.putPage("pyActionAPI",commandPage28);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage28.getPage("pyBehaviors(<LAST>)")).register();
commandPage28.removeFromClipboard();
ClipboardPage behaviorPage29 = actionPage28.getPage("pyBehaviors(<append>)");
behaviorPage29.putString("pyAction","runScript");ClipboardPage commandPage29 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage29.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzRunDataTransform\\u0022}}");commandPage29.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage29.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage29.putPage("pyActionAPI",commandPage29);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage28.getPage("pyBehaviors(<LAST>)")).register();
commandPage29.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage28);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method30_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1525413993426000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage30";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1525413993426000")){
return;}
if(processShortcut &&"ID1525413993426000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage30= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage30 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage30 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzIsSmartShapeVisible";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage30.putString("pyHidden",String.valueOf(hideElement));actionPage30.putString("pyDisabled",String.valueOf(disableElement));actionPage30.putString( "pyName","ID1525413993426000");actionPage30.putString( "pyImageSource","styleclass");actionPage30.putString( "pyIconStyle","pzAPIRunInBGIcon");actionPage30.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Run in background"));actionPage30.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage30.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage30.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Run in background"));if(testIDWhen || functionalTestingWhen){actionPage30.putString( "pyAutomationID","20180504112124080421");}actionPage30.putString( "pyBadgeFormat","Standard (label)");actionPage30.putString( "pyDeferLoad","false");actionPage30.putString( "pyImage","pzAPIRunInBGIcon");if (!hideElement) { 
actionPage30.putString("pyType","Action");
executePage=actionPage30.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage30 = actionPage30.getPage("pyBehaviors(<append>)");
behaviorPage30.putString("pyAction","runScript");ClipboardPage commandPage30 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage30.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage30.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage30.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzRunInBackground");commandPage30.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage30.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage30);
behaviorPage30.putPage("pyActionAPI",commandPage30);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage30.getPage("pyBehaviors(<LAST>)")).register();
commandPage30.removeFromClipboard();
ClipboardPage behaviorPage31 = actionPage30.getPage("pyBehaviors(<append>)");
behaviorPage31.putString("pyAction","runScript");ClipboardPage commandPage31 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage31.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzRunInBackground\\u0022}}");commandPage31.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage31.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage31.putPage("pyActionAPI",commandPage31);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage30.getPage("pyBehaviors(<LAST>)")).register();
commandPage31.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage30);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method32_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1357109290870000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage32";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1357109290870000")){
return;}
if(processShortcut &&"ID1357109290870000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage32= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage32 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage32 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pxIsWorkClass";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage32.putString("pyHidden",String.valueOf(hideElement));actionPage32.putString("pyDisabled",String.valueOf(disableElement));actionPage32.putString( "pyName","ID1357109290870000");actionPage32.putString( "pyImageSource","styleclass");actionPage32.putString( "pyIconStyle","pzAPISendEmailIcon");actionPage32.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Send email"));actionPage32.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage32.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage32.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage32.putString( "pyAutomationID","201711011102180721783");}actionPage32.putString( "pyBadgeFormat","Standard (label)");actionPage32.putString( "pyDeferLoad","false");actionPage32.putString( "pyImage","pzAPISendEmailIcon");if (!hideElement) { 
actionPage32.putString("pyType","Action");
executePage=actionPage32.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage32 = actionPage32.getPage("pyBehaviors(<append>)");
behaviorPage32.putString("pyAction","runScript");ClipboardPage commandPage32 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage32.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage32.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage32.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzSendEmail");commandPage32.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage32.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage32);
behaviorPage32.putPage("pyActionAPI",commandPage32);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage32.getPage("pyBehaviors(<LAST>)")).register();
commandPage32.removeFromClipboard();
ClipboardPage behaviorPage33 = actionPage32.getPage("pyBehaviors(<append>)");
behaviorPage33.putString("pyAction","runScript");ClipboardPage commandPage33 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage33.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzSendEmail\\u0022}}");commandPage33.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage33.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage33.putPage("pyActionAPI",commandPage33);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage32.getPage("pyBehaviors(<LAST>)")).register();
commandPage33.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage32);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method34_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1489488517729000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage34";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1489488517729000")){
return;}
if(processShortcut &&"ID1489488517729000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage34= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage34 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage34 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage34.putString("pyHidden",String.valueOf(hideElement));actionPage34.putString("pyDisabled",String.valueOf(disableElement));actionPage34.putString( "pyName","ID1489488517729000");actionPage34.putString( "pyImageSource","styleclass");actionPage34.putString( "pyIconStyle","pzAPINotificationIcon");actionPage34.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Send notification"));actionPage34.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage34.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage34.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage34.putString( "pyAutomationID","201711011102180732632");}actionPage34.putString( "pyBadgeFormat","Standard (label)");actionPage34.putString( "pyDeferLoad","false");actionPage34.putString( "pyImage","pzAPINotificationIcon");if (!hideElement) { 
actionPage34.putString("pyType","Action");
executePage=actionPage34.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage34 = actionPage34.getPage("pyBehaviors(<append>)");
behaviorPage34.putString("pyAction","runScript");ClipboardPage commandPage34 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage34.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage34.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage34.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzNotifyWrapper");commandPage34.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage34.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage34);
behaviorPage34.putPage("pyActionAPI",commandPage34);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage34.getPage("pyBehaviors(<LAST>)")).register();
commandPage34.removeFromClipboard();
ClipboardPage behaviorPage35 = actionPage34.getPage("pyBehaviors(<append>)");
behaviorPage35.putString("pyAction","runScript");ClipboardPage commandPage35 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage35.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzNotifyWrapper\\u0022}}");commandPage35.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage35.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage35.putPage("pyActionAPI",commandPage35);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage34.getPage("pyBehaviors(<LAST>)")).register();
commandPage35.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage34);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method36_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1447417265171000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage36";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1447417265171000")){
return;}
if(processShortcut &&"ID1447417265171000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage36= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage36 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage36 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzIsSmartShapeVisible";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage36.putString("pyHidden",String.valueOf(hideElement));actionPage36.putString("pyDisabled",String.valueOf(disableElement));actionPage36.putString( "pyName","ID1447417265171000");actionPage36.putString( "pyImageSource","styleclass");actionPage36.putString( "pyIconStyle","pzAPISendViaDocuSignIcon");actionPage36.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Send via DocuSign"));actionPage36.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage36.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage36.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage36.putString( "pyAutomationID","201711011102180744985");}actionPage36.putString( "pyBadgeFormat","Standard (label)");actionPage36.putString( "pyDeferLoad","false");actionPage36.putString( "pyImage","pzAPISendViaDocuSignIcon");if (!hideElement) { 
actionPage36.putString("pyType","Action");
executePage=actionPage36.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage36 = actionPage36.getPage("pyBehaviors(<append>)");
behaviorPage36.putString("pyAction","runScript");ClipboardPage commandPage36 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage36.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage36.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage36.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pxSendViaDocusign");commandPage36.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage36.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage36);
behaviorPage36.putPage("pyActionAPI",commandPage36);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage36.getPage("pyBehaviors(<LAST>)")).register();
commandPage36.removeFromClipboard();
ClipboardPage behaviorPage37 = actionPage36.getPage("pyBehaviors(<append>)");
behaviorPage37.putString("pyAction","runScript");ClipboardPage commandPage37 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage37.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pxSendViaDocusign\\u0022}}");commandPage37.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage37.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage37.putPage("pyActionAPI",commandPage37);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage36.getPage("pyBehaviors(<LAST>)")).register();
commandPage37.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage36);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method38_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1357192724742000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage38";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1357192724742000")){
return;}
if(processShortcut &&"ID1357192724742000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage38= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage38 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage38 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage38.putString("pyHidden",String.valueOf(hideElement));actionPage38.putString("pyDisabled",String.valueOf(disableElement));actionPage38.putString( "pyName","ID1357192724742000");actionPage38.putString( "pyImageSource","styleclass");actionPage38.putString( "pyIconStyle","pzAPIUpdateCaseIcon");actionPage38.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Update a case"));actionPage38.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage38.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage38.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage38.putString( "pyAutomationID","201711011102180754340");}actionPage38.putString( "pyBadgeFormat","Standard (label)");actionPage38.putString( "pyDeferLoad","false");actionPage38.putString( "pyImage","pzAPIUpdateCaseIcon");if (!hideElement) { 
actionPage38.putString("pyType","Action");
executePage=actionPage38.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage38 = actionPage38.getPage("pyBehaviors(<append>)");
behaviorPage38.putString("pyAction","runScript");ClipboardPage commandPage38 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage38.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage38.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage38.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzUpdateWrapper");commandPage38.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage38.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage38);
behaviorPage38.putPage("pyActionAPI",commandPage38);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage38.getPage("pyBehaviors(<LAST>)")).register();
commandPage38.removeFromClipboard();
ClipboardPage behaviorPage39 = actionPage38.getPage("pyBehaviors(<append>)");
behaviorPage39.putString("pyAction","runScript");ClipboardPage commandPage39 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage39.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzUpdateWrapper\\u0022}}");commandPage39.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage39.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage39.putPage("pyActionAPI",commandPage39);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage38.getPage("pyBehaviors(<LAST>)")).register();
commandPage39.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage38);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method40_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1367472045776000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage40";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1367472045776000")){
return;}
if(processShortcut &&"ID1367472045776000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage40= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage40 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage40 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage40.putString("pyHidden",String.valueOf(hideElement));actionPage40.putString("pyDisabled",String.valueOf(disableElement));actionPage40.putString( "pyName","ID1367472045776000");actionPage40.putString( "pyImageSource","styleclass");actionPage40.putString( "pyIconStyle","pzAPICascadingApprovalIcon");actionPage40.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Approval"));actionPage40.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage40.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage40.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage40.putString( "pyAutomationID","201711011102180765863");}actionPage40.putString( "pyBadgeFormat","Standard (label)");actionPage40.putString( "pyDeferLoad","false");actionPage40.putString( "pyImage","pzAPICascadingApprovalIcon");if (!hideElement) { 
actionPage40.putString("pyType","Action");
executePage=actionPage40.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage40 = actionPage40.getPage("pyBehaviors(<append>)");
behaviorPage40.putString("pyAction","runScript");ClipboardPage commandPage40 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage40.getProperty("pyParameters").getPageValue(1).putString( "pyValue","SubProcess");commandPage40.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage40.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pxApproval");commandPage40.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage40.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage40);
behaviorPage40.putPage("pyActionAPI",commandPage40);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage40.getPage("pyBehaviors(<LAST>)")).register();
commandPage40.removeFromClipboard();
ClipboardPage behaviorPage41 = actionPage40.getPage("pyBehaviors(<append>)");
behaviorPage41.putString("pyAction","runScript");ClipboardPage commandPage41 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage41.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022SubProcess\\u0022,args:{apiName:\\u0022pxApproval\\u0022}}");commandPage41.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage41.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage41.putPage("pyActionAPI",commandPage41);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage40.getPage("pyBehaviors(<LAST>)")).register();
commandPage41.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage40);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method42_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1365412698352000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage42";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1365412698352000")){
return;}
if(processShortcut &&"ID1365412698352000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage42= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage42 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage42 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage42.putString("pyHidden",String.valueOf(hideElement));actionPage42.putString("pyDisabled",String.valueOf(disableElement));actionPage42.putString( "pyName","ID1365412698352000");actionPage42.putString( "pyImageSource","styleclass");actionPage42.putString( "pyIconStyle","pzAPIDuplicateSearchIcon");actionPage42.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Search duplicate cases"));actionPage42.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage42.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage42.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage42.putString( "pyAutomationID","201711011102180775176");}actionPage42.putString( "pyBadgeFormat","Standard (label)");actionPage42.putString( "pyDeferLoad","false");actionPage42.putString( "pyImage","pzAPIDuplicateSearchIcon");if (!hideElement) { 
actionPage42.putString("pyType","Action");
executePage=actionPage42.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage42 = actionPage42.getPage("pyBehaviors(<append>)");
behaviorPage42.putString("pyAction","runScript");ClipboardPage commandPage42 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage42.getProperty("pyParameters").getPageValue(1).putString( "pyValue","SubProcess");commandPage42.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage42.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pyDuplicateSearchCases");commandPage42.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage42.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage42);
behaviorPage42.putPage("pyActionAPI",commandPage42);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage42.getPage("pyBehaviors(<LAST>)")).register();
commandPage42.removeFromClipboard();
ClipboardPage behaviorPage43 = actionPage42.getPage("pyBehaviors(<append>)");
behaviorPage43.putString("pyAction","runScript");ClipboardPage commandPage43 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage43.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022SubProcess\\u0022,args:{apiName:\\u0022pyDuplicateSearchCases\\u0022}}");commandPage43.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage43.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage43.putPage("pyActionAPI",commandPage43);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage42.getPage("pyBehaviors(<LAST>)")).register();
commandPage43.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage42);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method44_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1472194750878000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage44";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1472194750878000")){
return;}
if(processShortcut &&"ID1472194750878000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage44= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage44 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage44 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzIsWaitShape";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage44.putString("pyHidden",String.valueOf(hideElement));actionPage44.putString("pyDisabled",String.valueOf(disableElement));actionPage44.putString( "pyName","ID1472194750878000");actionPage44.putString( "pyImageSource","styleclass");actionPage44.putString( "pyIconStyle","pzWaitIcon");actionPage44.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Wait"));actionPage44.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage44.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage44.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage44.putString( "pyAutomationID","201711011102180844418");}actionPage44.putString( "pyBadgeFormat","Standard (label)");actionPage44.putString( "pyDeferLoad","false");actionPage44.putString( "pyImage","pzWaitIcon");if (!hideElement) { 
actionPage44.putString("pyType","Action");
executePage=actionPage44.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage44 = actionPage44.getPage("pyBehaviors(<append>)");
behaviorPage44.putString("pyAction","runScript");ClipboardPage commandPage44 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage44.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Wait");commandPage44.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage44.putString( "pyFunctionName","void");executePage.putPage("pyCustom",commandPage44);
behaviorPage44.putPage("pyActionAPI",commandPage44);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage44.getPage("pyBehaviors(<LAST>)")).register();
commandPage44.removeFromClipboard();
ClipboardPage behaviorPage45 = actionPage44.getPage("pyBehaviors(<append>)");
behaviorPage45.putString("pyAction","runScript");ClipboardPage commandPage45 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage45.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Wait\\u0022}");commandPage45.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage45.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage45.putPage("pyActionAPI",commandPage45);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage44.getPage("pyBehaviors(<LAST>)")).register();
commandPage45.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage44);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method46_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1486351036372000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage46";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1486351036372000")){
return;}
if(processShortcut &&"ID1486351036372000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage46= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage46 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage46 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzShowSurveyShape";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage46.putString("pyHidden",String.valueOf(hideElement));actionPage46.putString("pyDisabled",String.valueOf(disableElement));actionPage46.putString( "pyName","ID1486351036372000");actionPage46.putString( "pyImageSource","styleclass");actionPage46.putString( "pyIconStyle","pzAPISurveyIcon");actionPage46.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Questionnaire (Deprecated)"));actionPage46.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage46.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage46.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage46.putString( "pyAutomationID","201711011102180863876");}actionPage46.putString( "pyBadgeFormat","Standard (label)");actionPage46.putString( "pyDeferLoad","false");actionPage46.putString( "pyImage","pzAPISurveyIcon");if (!hideElement) { 
actionPage46.putString("pyType","Action");
executePage=actionPage46.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage46 = actionPage46.getPage("pyBehaviors(<append>)");
behaviorPage46.putString("pyAction","runScript");ClipboardPage commandPage46 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage46.getProperty("pyParameters").getPageValue(1).putString( "pyValue","SubProcess");commandPage46.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage46.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pxSurveyDriver");commandPage46.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage46.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage46);
behaviorPage46.putPage("pyActionAPI",commandPage46);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage46.getPage("pyBehaviors(<LAST>)")).register();
commandPage46.removeFromClipboard();
ClipboardPage behaviorPage47 = actionPage46.getPage("pyBehaviors(<append>)");
behaviorPage47.putString("pyAction","runScript");ClipboardPage commandPage47 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage47.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022SubProcess\\u0022,args:{apiName:\\u0022pxSurveyDriver\\u0022,subProcessCategory:\\u0022ScreenFlow\\u0022}}");commandPage47.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage47.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage47.putPage("pyActionAPI",commandPage47);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage46.getPage("pyBehaviors(<LAST>)")).register();
commandPage47.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage46);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method48_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1602886639350000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage48";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1602886639350000")){
return;}
if(processShortcut &&"ID1602886639350000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage48= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage48 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage48 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsWorkClassAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage48.putString("pyHidden",String.valueOf(hideElement));actionPage48.putString("pyDisabled",String.valueOf(disableElement));actionPage48.putString( "pyName","ID1602886639350000");actionPage48.putString( "pyImageSource","styleclass");actionPage48.putString( "pyIconStyle","pzAPISurveyIcon");actionPage48.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Questionnaire"));actionPage48.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage48.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage48.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Create Questionnaire"));if(testIDWhen || functionalTestingWhen){actionPage48.putString( "pyAutomationID","202010161817190124927");}actionPage48.putString( "pyBadgeFormat","Standard (label)");actionPage48.putString( "pyDeferLoad","false");actionPage48.putString( "pyImage","pzAPISurveyIcon");if (!hideElement) { 
actionPage48.putString("pyType","Action");
executePage=actionPage48.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage48 = actionPage48.getPage("pyBehaviors(<append>)");
behaviorPage48.putString("pyAction","runScript");ClipboardPage commandPage48 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage48.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Utility");commandPage48.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage48.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzCreateSurvey");commandPage48.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage48.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage48);
behaviorPage48.putPage("pyActionAPI",commandPage48);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage48.getPage("pyBehaviors(<LAST>)")).register();
commandPage48.removeFromClipboard();
ClipboardPage behaviorPage49 = actionPage48.getPage("pyBehaviors(<append>)");
behaviorPage49.putString("pyAction","runScript");ClipboardPage commandPage49 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage49.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022,args:{apiName:\\u0022pzCreateSurvey\\u0022}}");commandPage49.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage49.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage49.putPage("pyActionAPI",commandPage49);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage48.getPage("pyBehaviors(<LAST>)")).register();
commandPage49.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage48);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method50_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1486351279905000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage50";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1486351279905000")){
return;}
if(processShortcut &&"ID1486351279905000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage50= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage50 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage50 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzShowQuestionShape";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage50.putString("pyHidden",String.valueOf(hideElement));actionPage50.putString("pyDisabled",String.valueOf(disableElement));actionPage50.putString( "pyName","ID1486351279905000");actionPage50.putString( "pyImageSource","styleclass");actionPage50.putString( "pyIconStyle","pzAPIQuestionIcon");actionPage50.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Question"));actionPage50.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage50.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage50.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage50.putString( "pyAutomationID","201711011102180884229");}actionPage50.putString( "pyBadgeFormat","Standard (label)");actionPage50.putString( "pyDeferLoad","false");actionPage50.putString( "pyImage","pzAPIQuestionIcon");if (!hideElement) { 
actionPage50.putString("pyType","Action");
executePage=actionPage50.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage50 = actionPage50.getPage("pyBehaviors(<append>)");
behaviorPage50.putString("pyAction","runScript");ClipboardPage commandPage50 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage50.getProperty("pyParameters").getPageValue(1).putString( "pyValue","SubProcess");commandPage50.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage50.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzQuestionShape");commandPage50.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage50.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage50);
behaviorPage50.putPage("pyActionAPI",commandPage50);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage50.getPage("pyBehaviors(<LAST>)")).register();
commandPage50.removeFromClipboard();
ClipboardPage behaviorPage51 = actionPage50.getPage("pyBehaviors(<append>)");
behaviorPage51.putString("pyAction","runScript");ClipboardPage commandPage51 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage51.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022SubProcess\\u0022,args:{apiName:\\u0022pzQuestionShape\\u0022,subProcessCategory:\\u0022ScreenFlow\\u0022}}");commandPage51.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage51.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage51.putPage("pyActionAPI",commandPage51);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage50.getPage("pyBehaviors(<LAST>)")).register();
commandPage51.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage50);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method52_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1486351392941000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage52";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1486351392941000")){
return;}
if(processShortcut &&"ID1486351392941000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage52= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage52 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage52 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzShowQuestionSFShape";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage52.putString("pyHidden",String.valueOf(hideElement));actionPage52.putString("pyDisabled",String.valueOf(disableElement));actionPage52.putString( "pyName","ID1486351392941000");actionPage52.putString( "pyImageSource","styleclass");actionPage52.putString( "pyIconStyle","pzAPIQuestionIcon");actionPage52.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Question"));actionPage52.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage52.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage52.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage52.putString( "pyAutomationID","201711011102180899924");}actionPage52.putString( "pyBadgeFormat","Standard (label)");actionPage52.putString( "pyDeferLoad","false");actionPage52.putString( "pyImage","pzAPIQuestionIcon");if (!hideElement) { 
actionPage52.putString("pyType","Action");
executePage=actionPage52.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage52 = actionPage52.getPage("pyBehaviors(<append>)");
behaviorPage52.putString("pyAction","runScript");ClipboardPage commandPage52 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage52.getProperty("pyParameters").getPageValue(1).putString( "pyValue","SupProcessSF");commandPage52.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage52.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzQuestionShapeScr");commandPage52.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage52.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage52);
behaviorPage52.putPage("pyActionAPI",commandPage52);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage52.getPage("pyBehaviors(<LAST>)")).register();
commandPage52.removeFromClipboard();
ClipboardPage behaviorPage53 = actionPage52.getPage("pyBehaviors(<append>)");
behaviorPage53.putString("pyAction","runScript");ClipboardPage commandPage53 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage53.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022SubProcessSF\\u0022,args:{apiName:\\u0022pzQuestionShapeScr\\u0022}}");commandPage53.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage53.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage53.putPage("pyActionAPI",commandPage53);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage52.getPage("pyBehaviors(<LAST>)")).register();
commandPage53.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage52);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method54_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1513259291292000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage54";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1513259291292000")){
return;}
if(processShortcut &&"ID1513259291292000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage54= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage54 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage54 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzShowQuestionPageShape";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage54.putString("pyHidden",String.valueOf(hideElement));actionPage54.putString("pyDisabled",String.valueOf(disableElement));actionPage54.putString( "pyName","ID1513259291292000");actionPage54.putString( "pyImageSource","styleclass");actionPage54.putString( "pyIconStyle","pzAPIQuestionPageIcon");actionPage54.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Question page"));actionPage54.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage54.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage54.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage54.putString( "pyAutomationID","201712140848110266518");}actionPage54.putString( "pyBadgeFormat","Standard (label)");actionPage54.putString( "pyDeferLoad","false");actionPage54.putString( "pyImage","pzAPIQuestionPageIcon");if (!hideElement) { 
actionPage54.putString("pyType","Action");
executePage=actionPage54.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage54 = actionPage54.getPage("pyBehaviors(<append>)");
behaviorPage54.putString("pyAction","runScript");ClipboardPage commandPage54 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage54.getProperty("pyParameters").getPageValue(1).putString( "pyValue","SubProcess");commandPage54.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage54.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzQuestionPage");commandPage54.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage54.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage54);
behaviorPage54.putPage("pyActionAPI",commandPage54);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage54.getPage("pyBehaviors(<LAST>)")).register();
commandPage54.removeFromClipboard();
ClipboardPage behaviorPage55 = actionPage54.getPage("pyBehaviors(<append>)");
behaviorPage55.putString("pyAction","runScript");ClipboardPage commandPage55 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage55.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022SubProcess\\u0022,args:{apiName:\\u0022pzQuestionPage\\u0022}}");commandPage55.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage55.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage55.putPage("pyActionAPI",commandPage55);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage54.getPage("pyBehaviors(<LAST>)")).register();
commandPage55.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage54);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"APIs Extension Navigation" */

private void method56_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1513259291292001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage56";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1513259291292001")){
return;}
if(processShortcut &&"ID1513259291292001".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage56= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage56 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage56 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzShowQuestionPageSFShape";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage56.putString("pyHidden",String.valueOf(hideElement));actionPage56.putString("pyDisabled",String.valueOf(disableElement));actionPage56.putString( "pyName","ID1513259291292001");actionPage56.putString( "pyImageSource","styleclass");actionPage56.putString( "pyIconStyle","pzAPIQuestionPageIcon");actionPage56.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Question page"));actionPage56.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage56.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage56.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage56.putString( "pyAutomationID","201712140848110283314");}actionPage56.putString( "pyBadgeFormat","Standard (label)");actionPage56.putString( "pyDeferLoad","false");actionPage56.putString( "pyImage","pzAPIQuestionPageIcon");if (!hideElement) { 
actionPage56.putString("pyType","Action");
executePage=actionPage56.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage56 = actionPage56.getPage("pyBehaviors(<append>)");
behaviorPage56.putString("pyAction","runScript");ClipboardPage commandPage56 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage56.getProperty("pyParameters").getPageValue(1).putString( "pyValue","SubProcessSF");commandPage56.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage56.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pzQuestionPageScr");commandPage56.getProperty("pyParameters").getPageValue(2).putString( "pyName","");commandPage56.putString( "pyFunctionName","addApi");executePage.putPage("pyCustom",commandPage56);
behaviorPage56.putPage("pyActionAPI",commandPage56);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage56.getPage("pyBehaviors(<LAST>)")).register();
commandPage56.removeFromClipboard();
ClipboardPage behaviorPage57 = actionPage56.getPage("pyBehaviors(<append>)");
behaviorPage57.putString("pyAction","runScript");ClipboardPage commandPage57 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage57.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022SubProcessSF\\u0022,args:{apiName:\\u0022pzQuestionPageScr\\u0022}}");commandPage57.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage57.putString( "pyFunctionName","ViewerManager.executeAction");behaviorPage57.putPage("pyActionAPI",commandPage57);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage56.getPage("pyBehaviors(<LAST>)")).register();
commandPage57.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage56);
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION RULE-OBJ-FLOW PZCOMMONUTILITYAPIS #20230618T001753.613 GMT", "Rule-Obj-Flow pzCommonUtilityAPIs", "Pega-ProcessArchitect", "08-23-01", "20230618T001753.613 GMT");
}
