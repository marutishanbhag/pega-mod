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
public class ra_action_pyrootmenu_b4232a4aa7133cd72e1485fcc73387aa  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pyRootMenu.Rule_Obj_Flow.Action");
	public ra_action_pyrootmenu_b4232a4aa7133cd72e1485fcc73387aa(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION RULE-OBJ-FLOW PYROOTMENU #20200819T081937.633 GMT	Pega-ProcessArchitect:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(true){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "Contextual Menu - Canvas"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("Contextual Menu - Canvas");
	}
}
String actionType=tools.getParamValue("Action");
boolean processShortcut= actionType.equals("pxProcessShortcut")?true:false;
boolean processAction= actionType.equals("pxProcessAction")?true:false;
String nodePath=tools.getParamValue("nodePath");
boolean isNodePathEmpty=nodePath.equals("")?true:false;
String [] nodePathArr=nodePath.split("/");
method1_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method40_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method75_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method80_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method81_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method82_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method83_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method108_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
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
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCUSTOM", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCHILDELEMENTS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PYROOTMENU"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCHILDELEMENTS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCHILDELEMENTS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PYROOTMENU","Rule-Navigation","RULE-OBJ-FLOW",false,"","Pega-ProcessArchitect","08-06-01","RULE-NAVIGATION RULE-OBJ-FLOW PYROOTMENU #20200819T081937.633 GMT","!PYROOTMENU",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",353766476)
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
//	RULE-NAVIGATION RULE-OBJ-FLOW PYROOTMENU #20200819T081937.633 GMT:20201203T093903.072 GMT

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
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCHILDELEMENTS--(CLIPBOABE009C16A86AE05EC07E24EF860BEDEA #20180713T133341.590 GMT:20180713T133341.590 GMT
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
		return "3db9c6954f3d38233f2f5cda4bcf68be";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Flow";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"Contextual Menu - Canvas" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1346795843162000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1346795843162000")){
return;}
if(processShortcut &&"ID1346795843162000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pzIsProcessFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pyAllowInteraction",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","ID1346795843162000");actionPage1.putString( "pyImageSource","styleclass");actionPage1.putString( "pyIconStyle","iconAddShapeMenu");actionPage1.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Add"));actionPage1.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage1.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage1.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage1.putString( "pyAutomationID","");}actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","false");actionPage1.putString( "pyImage","iconAddShapeMenu");if (!hideElement) { 
actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
if (!disableElement) { 
}
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
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1346795843162000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346798331278000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346798331278000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage2= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage2 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage2 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsNotConversationFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage2.putString("pyHidden",String.valueOf(hideElement));actionPage2.putString("pyDisabled",String.valueOf(disableElement));actionPage2.putString( "pyName","ID1346798331278000");actionPage2.putString( "pyImageSource","styleclass");actionPage2.putString( "pyIconStyle","pzAssignmentIcon");actionPage2.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Assignment"));actionPage2.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage2.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage2.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage2.putString( "pyAutomationID","201711290300590773312");}actionPage2.putString( "pyBadgeFormat","Standard (label)");actionPage2.putString( "pyDeferLoad","false");actionPage2.putString( "pyImage","pzAssignmentIcon");if (!hideElement) { 
actionPage2.putString("pyType","Action");
executePage=actionPage2.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage2 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","runScript");ClipboardPage commandPage2 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage2.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Assignment\\u0022}");commandPage2.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage2.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage2);
behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346798331278001".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346798331278001*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage4= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage4 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage4 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage4.putString("pyHidden",String.valueOf(hideElement));actionPage4.putString("pyDisabled",String.valueOf(disableElement));actionPage4.putString( "pyName","ID1346798331278001");actionPage4.putString( "pyImageSource","styleclass");actionPage4.putString( "pyIconStyle","pzDecisionIcon");actionPage4.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Decision"));actionPage4.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage4.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage4.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage4.putString( "pyAutomationID","201711290301000393652");}actionPage4.putString( "pyBadgeFormat","Standard (label)");actionPage4.putString( "pyDeferLoad","false");actionPage4.putString( "pyImage","pzDecisionIcon");actionPage4.putString("pyType","Action");
executePage=actionPage4.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage4 = actionPage4.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","runScript");ClipboardPage commandPage4 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage4.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Decision\\u0022}");commandPage4.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage4.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage4);
behaviorPage4.putPage("pyActionAPI",commandPage4);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage4.getPage("pyBehaviors(<LAST>)")).register();
commandPage4.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346798331278002".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346798331278002*/

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
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage6 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage6 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsNotConversationFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage6.putString("pyHidden",String.valueOf(hideElement));actionPage6.putString("pyDisabled",String.valueOf(disableElement));actionPage6.putString( "pyName","ID1346798331278002");actionPage6.putString( "pyImageSource","styleclass");actionPage6.putString( "pyIconStyle","pzSubprocessIcon");actionPage6.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Subprocess"));actionPage6.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage6.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage6.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage6.putString( "pyAutomationID","201711290301000414705");}actionPage6.putString( "pyBadgeFormat","Standard (label)");actionPage6.putString( "pyDeferLoad","false");actionPage6.putString( "pyImage","pzSubprocessIcon");if (!hideElement) { 
actionPage6.putString("pyType","Action");
executePage=actionPage6.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage6 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage6.putString("pyAction","runScript");ClipboardPage commandPage6 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage6.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022SubProcess\\u0022}");commandPage6.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage6.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage6);
behaviorPage6.putPage("pyActionAPI",commandPage6);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage6.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346795843158000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346795843158000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage8= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage8 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage8 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzShowUtilityShape";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage8.putString("pyHidden",String.valueOf(hideElement));actionPage8.putString("pyDisabled",String.valueOf(disableElement));actionPage8.putString( "pyName","ID1346795843158000");actionPage8.putString( "pyImageSource","styleclass");actionPage8.putString( "pyIconStyle","pzUtilityIcon");actionPage8.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Utility"));actionPage8.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage8.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage8.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage8.putString( "pyAutomationID","201711290301000436334");}actionPage8.putString( "pyBadgeFormat","Standard (label)");actionPage8.putString( "pyDeferLoad","false");actionPage8.putString( "pyImage","pzUtilityIcon");if (!hideElement) { 
actionPage8.putString("pyType","Action");
executePage=actionPage8.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage8 = actionPage8.getPage("pyBehaviors(<append>)");
behaviorPage8.putString("pyAction","runScript");ClipboardPage commandPage8 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage8.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022}");commandPage8.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage8.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage8);
behaviorPage8.putPage("pyActionAPI",commandPage8);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage8.getPage("pyBehaviors(<LAST>)")).register();
commandPage8.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346798331278004".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346798331278004*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage10= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage10 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage10 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage10.putString("pyHidden",String.valueOf(hideElement));actionPage10.putString("pyDisabled",String.valueOf(disableElement));actionPage10.putString( "pyName","ID1346798331278004");actionPage10.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Start"));actionPage10.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage10.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage10.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage10.putString( "pyAutomationID","201711290301000462800");}actionPage10.putString( "pyBadgeFormat","");actionPage10.putString( "pyDeferLoad","");actionPage10.putString( "pyImage","pzStartIcon");actionPage10.putString("pyType","Action");
executePage=actionPage10.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage10 = actionPage10.getPage("pyBehaviors(<append>)");
behaviorPage10.putString("pyAction","runScript");ClipboardPage commandPage10 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage10.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Start\\u0022}");commandPage10.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage10.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage10);
behaviorPage10.putPage("pyActionAPI",commandPage10);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage10.getPage("pyBehaviors(<LAST>)")).register();
commandPage10.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346798331278005".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346798331278005*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage12= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage12 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage12 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage12.putString("pyHidden",String.valueOf(hideElement));actionPage12.putString("pyDisabled",String.valueOf(disableElement));actionPage12.putString( "pyName","ID1346798331278005");actionPage12.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "End"));actionPage12.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage12.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage12.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage12.putString( "pyAutomationID","201711290301000483478");}actionPage12.putString( "pyBadgeFormat","");actionPage12.putString( "pyDeferLoad","");actionPage12.putString( "pyImage","pzEndIcon");actionPage12.putString("pyType","Action");
executePage=actionPage12.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage12 = actionPage12.getPage("pyBehaviors(<append>)");
behaviorPage12.putString("pyAction","runScript");ClipboardPage commandPage12 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage12.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022End\\u0022}");commandPage12.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage12.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage12);
behaviorPage12.putPage("pyActionAPI",commandPage12);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage12.getPage("pyBehaviors(<LAST>)")).register();
commandPage12.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1606307117800000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - ID1606307117800000*/

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
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage14 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage14 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage14.putString("pyHidden",String.valueOf(hideElement));actionPage14.putString("pyDisabled",String.valueOf(disableElement));actionPage14.putString( "pyName","ID1606307117800000");actionPage14.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage14.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage14.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage14.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage14.putString( "pyBadgeFormat","");actionPage14.putString( "pyDeferLoad","");actionPage14.putString( "pyImage","");actionPage14.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
showWhenCondition = true;
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pyIsNotProcessModelerViewAndNotConvFlow",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Obj-Flow","pyFlowShapesExtension",commonPrefix,uniqueSuffix,actionPage1, tools, "actionPage1","false",actionPage1);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//END OF WHEN CONDITION
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1366351715658001".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1366351715658001*/

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
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage18 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage18 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage18.putString("pyHidden",String.valueOf(hideElement));actionPage18.putString("pyDisabled",String.valueOf(disableElement));actionPage18.putString( "pyName","ID1366351715658001");actionPage18.putString( "pyImageSource","styleclass");actionPage18.putString( "pyIconStyle","pzAPIUtilityIcon");actionPage18.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Automations"));actionPage18.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage18.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage18.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage18.putString( "pyBadgeFormat","Standard (label)");actionPage18.putString( "pyDeferLoad","false");actionPage18.putString( "pyImage","pzAPIUtilityIcon");actionPage18.putString("pyType","Action");
executePage=actionPage18.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage18 = actionPage18.getPage("pyBehaviors(<append>)");
behaviorPage18.putString("pyAction","runScript");ClipboardPage commandPage18 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage18.putString( "pyFunctionName","void");executePage.putPage("pyCustom",commandPage18);
behaviorPage18.putPage("pyActionAPI",commandPage18);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage18.getPage("pyBehaviors(<LAST>)")).register();
commandPage18.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1366351715658001")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Obj-Flow","pzCommonUtilityAPIs",commonPrefix,uniqueSuffix,actionPage18, tools, "actionPage18","false",actionPage18);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
showWhenCondition = true;
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pyIsNotConversationFlow",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Obj-Flow","pyExtendedAPIs",commonPrefix,uniqueSuffix,actionPage18, tools, "actionPage18","false",actionPage18);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//END OF WHEN CONDITION
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1366351715658000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1366351715658000*/

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
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage24 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage24 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsNotProcessModelerViewAndNotConvFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage24.putString("pyHidden",String.valueOf(hideElement));actionPage24.putString("pyDisabled",String.valueOf(disableElement));actionPage24.putString( "pyName","ID1366351715658000");actionPage24.putString( "pyImageSource","styleclass");actionPage24.putString( "pyIconStyle","pzAPIAdvancedShapesIcon");actionPage24.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Advanced Shapes"));actionPage24.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage24.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage24.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage24.putString( "pyAutomationID","201711290301000743974");}actionPage24.putString( "pyBadgeFormat","Standard (label)");actionPage24.putString( "pyDeferLoad","false");actionPage24.putString( "pyImage","pzAPIAdvancedShapesIcon");if (!hideElement) { 
actionPage24.putString("pyType","Action");
executePage=actionPage24.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage24 = actionPage24.getPage("pyBehaviors(<append>)");
behaviorPage24.putString("pyAction","runScript");ClipboardPage commandPage24 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage24.putString( "pyFunctionName","void");executePage.putPage("pyCustom",commandPage24);
behaviorPage24.putPage("pyActionAPI",commandPage24);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage24.getPage("pyBehaviors(<LAST>)")).register();
commandPage24.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1366351715658000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Obj-Flow","pzAdvancedShapes",commonPrefix,uniqueSuffix,actionPage24, tools, "actionPage24","false",actionPage24);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1606307117693000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - ID1606307117693000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage27= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage24 != null ? actionPage24.getReference() : "" 
;actionPage27 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage27 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage27.putString("pyHidden",String.valueOf(hideElement));actionPage27.putString("pyDisabled",String.valueOf(disableElement));actionPage27.putString( "pyName","ID1606307117693000");actionPage27.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage27.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage27.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage27.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage27.putString( "pyBadgeFormat","Standard (label)");actionPage27.putString( "pyDeferLoad","false");actionPage27.putString( "pyImage","");actionPage27.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Obj-Flow","pyAdvancedFlowShapesExtension",commonPrefix,uniqueSuffix,actionPage24, tools, "actionPage24","false",actionPage24);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

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
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage32 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage32 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage32.putString("pyHidden",String.valueOf(hideElement));actionPage32.putString("pyDisabled",String.valueOf(disableElement));actionPage32.putString( "pyName","");actionPage32.putString( "pyImageSource","styleclass");actionPage32.putString( "pyIconStyle","pzConversationIcon");actionPage32.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Conversation"));actionPage32.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage32.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage32.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage32.putString( "pyBadgeFormat","Standard (label)");actionPage32.putString( "pyDeferLoad","false");actionPage32.putString( "pyImage","pzConversationIcon");actionPage32.putString("pyType","Action");
executePage=actionPage32.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Obj-Flow","pzConversationalShapes",commonPrefix,uniqueSuffix,actionPage32, tools, "actionPage32","false",actionPage32);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - */

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
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage36 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage36 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage36.putString("pyHidden",String.valueOf(hideElement));actionPage36.putString("pyDisabled",String.valueOf(disableElement));actionPage36.putString( "pyName","");actionPage36.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage36.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage36.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage36.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage36.putString( "pyBadgeFormat","");actionPage36.putString( "pyDeferLoad","");actionPage36.putString( "pyImage","");actionPage36.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346798331278010".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346798331278010*/

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
parentPageRef = actionPage1 != null ? actionPage1.getReference() : "" 
;actionPage38 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage38 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage38.putString("pyHidden",String.valueOf(hideElement));actionPage38.putString("pyDisabled",String.valueOf(disableElement));actionPage38.putString( "pyName","ID1346798331278010");actionPage38.putString( "pyImageSource","styleclass");actionPage38.putString( "pyIconStyle","pzAnnotationIcon");actionPage38.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Annotation"));actionPage38.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage38.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage38.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage38.putString( "pyAutomationID","201711290301000784553");}actionPage38.putString( "pyBadgeFormat","Standard (label)");actionPage38.putString( "pyDeferLoad","false");actionPage38.putString( "pyImage","pzAnnotationIcon");actionPage38.putString("pyType","Action");
executePage=actionPage38.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage38 = actionPage38.getPage("pyBehaviors(<append>)");
behaviorPage38.putString("pyAction","runScript");ClipboardPage commandPage38 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage38.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Annotation\\u0022}");commandPage38.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage38.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage38);
behaviorPage38.putPage("pyActionAPI",commandPage38);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage38.getPage("pyBehaviors(<LAST>)")).register();
commandPage38.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Contextual Menu - Canvas" */

private void method40_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1347489468312000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1347489468312000")){
return;}
if(processShortcut &&"ID1347489468312000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pzIsScreenFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pyAllowInteraction",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage40.putString("pyHidden",String.valueOf(hideElement));actionPage40.putString("pyDisabled",String.valueOf(disableElement));actionPage40.putString( "pyName","ID1347489468312000");actionPage40.putString( "pyImageSource","styleclass");actionPage40.putString( "pyIconStyle","iconAddShapeMenu");actionPage40.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Add"));actionPage40.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage40.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage40.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Add a flow shape"));if(testIDWhen || functionalTestingWhen){actionPage40.putString( "pyAutomationID","");}actionPage40.putString( "pyBadgeFormat","Standard (label)");actionPage40.putString( "pyDeferLoad","false");actionPage40.putString( "pyImage","iconAddShapeMenu");if (!hideElement) { 
actionPage40.putString("pyType","Action");
executePage=actionPage40.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
if (!disableElement) { 
}
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
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1347489468312000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1347490461952000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1347490461952000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage41= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage41 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage41 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage41.putString("pyHidden",String.valueOf(hideElement));actionPage41.putString("pyDisabled",String.valueOf(disableElement));actionPage41.putString( "pyName","ID1347490461952000");actionPage41.putString( "pyImageSource","styleclass");actionPage41.putString( "pyIconStyle","pzAssignmentIcon");actionPage41.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Assignment"));actionPage41.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage41.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage41.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage41.putString( "pyAutomationID","201711290301000818361");}actionPage41.putString( "pyBadgeFormat","Standard (label)");actionPage41.putString( "pyDeferLoad","false");actionPage41.putString( "pyImage","pzAssignmentIcon");actionPage41.putString("pyType","Action");
executePage=actionPage41.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage41 = actionPage41.getPage("pyBehaviors(<append>)");
behaviorPage41.putString("pyAction","runScript");ClipboardPage commandPage41 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage41.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022AssignmentSF\\u0022}");commandPage41.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage41.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage41);
behaviorPage41.putPage("pyActionAPI",commandPage41);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage41.getPage("pyBehaviors(<LAST>)")).register();
commandPage41.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1347490461952001".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1347490461952001*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage43= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage43 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage43 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage43.putString("pyHidden",String.valueOf(hideElement));actionPage43.putString("pyDisabled",String.valueOf(disableElement));actionPage43.putString( "pyName","ID1347490461952001");actionPage43.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Decision"));actionPage43.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage43.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage43.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage43.putString( "pyAutomationID","201711290301000839764");}actionPage43.putString( "pyBadgeFormat","");actionPage43.putString( "pyDeferLoad","");actionPage43.putString( "pyImage","pzDecisionIcon");actionPage43.putString("pyType","Action");
executePage=actionPage43.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage43 = actionPage43.getPage("pyBehaviors(<append>)");
behaviorPage43.putString("pyAction","runScript");ClipboardPage commandPage43 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage43.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Decision\\u0022}");commandPage43.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage43.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage43);
behaviorPage43.putPage("pyActionAPI",commandPage43);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage43.getPage("pyBehaviors(<LAST>)")).register();
commandPage43.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1347490461952002".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1347490461952002*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage45= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage45 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage45 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage45.putString("pyHidden",String.valueOf(hideElement));actionPage45.putString("pyDisabled",String.valueOf(disableElement));actionPage45.putString( "pyName","ID1347490461952002");actionPage45.putString( "pyImageSource","styleclass");actionPage45.putString( "pyIconStyle","pzSubprocessIcon");actionPage45.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Subprocess"));actionPage45.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage45.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage45.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage45.putString( "pyAutomationID","201711290301000859566");}actionPage45.putString( "pyBadgeFormat","Standard (label)");actionPage45.putString( "pyDeferLoad","false");actionPage45.putString( "pyImage","pzSubprocessIcon");actionPage45.putString("pyType","Action");
executePage=actionPage45.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage45 = actionPage45.getPage("pyBehaviors(<append>)");
behaviorPage45.putString("pyAction","runScript");ClipboardPage commandPage45 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage45.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022SubProcessSF\\u0022}");commandPage45.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage45.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage45);
behaviorPage45.putPage("pyActionAPI",commandPage45);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage45.getPage("pyBehaviors(<LAST>)")).register();
commandPage45.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1347490461952003".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1347490461952003*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage47= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage47 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage47 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzIsNotProcessModelerViewContext";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage47.putString("pyHidden",String.valueOf(hideElement));actionPage47.putString("pyDisabled",String.valueOf(disableElement));actionPage47.putString( "pyName","ID1347490461952003");actionPage47.putString( "pyImageSource","styleclass");actionPage47.putString( "pyIconStyle","pzUtilityIcon");actionPage47.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Utility"));actionPage47.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage47.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage47.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage47.putString( "pyAutomationID","201711290301000881926");}actionPage47.putString( "pyBadgeFormat","Standard (label)");actionPage47.putString( "pyDeferLoad","false");actionPage47.putString( "pyImage","pzUtilityIcon");if (!hideElement) { 
actionPage47.putString("pyType","Action");
executePage=actionPage47.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage47 = actionPage47.getPage("pyBehaviors(<append>)");
behaviorPage47.putString("pyAction","runScript");ClipboardPage commandPage47 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage47.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022Utility\\u0022}");commandPage47.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage47.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage47);
behaviorPage47.putPage("pyActionAPI",commandPage47);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage47.getPage("pyBehaviors(<LAST>)")).register();
commandPage47.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1347490461952004".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1347490461952004*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage49= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage49 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage49 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage49.putString("pyHidden",String.valueOf(hideElement));actionPage49.putString("pyDisabled",String.valueOf(disableElement));actionPage49.putString( "pyName","ID1347490461952004");actionPage49.putString( "pyImageSource","styleclass");actionPage49.putString( "pyIconStyle","pzStartIcon");actionPage49.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Start"));actionPage49.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage49.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage49.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage49.putString( "pyAutomationID","201711290301000901743");}actionPage49.putString( "pyBadgeFormat","Standard (label)");actionPage49.putString( "pyDeferLoad","false");actionPage49.putString( "pyImage","pzStartIcon");actionPage49.putString("pyType","Action");
executePage=actionPage49.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage49 = actionPage49.getPage("pyBehaviors(<append>)");
behaviorPage49.putString("pyAction","runScript");ClipboardPage commandPage49 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage49.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022StartSF\\u0022}");commandPage49.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage49.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage49);
behaviorPage49.putPage("pyActionAPI",commandPage49);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage49.getPage("pyBehaviors(<LAST>)")).register();
commandPage49.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1347490461952005".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1347490461952005*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage51= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage51 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage51 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage51.putString("pyHidden",String.valueOf(hideElement));actionPage51.putString("pyDisabled",String.valueOf(disableElement));actionPage51.putString( "pyName","ID1347490461952005");actionPage51.putString( "pyImageSource","styleclass");actionPage51.putString( "pyIconStyle","pzEndIcon");actionPage51.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "End"));actionPage51.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage51.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage51.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage51.putString( "pyAutomationID","201711290301000922103");}actionPage51.putString( "pyBadgeFormat","Standard (label)");actionPage51.putString( "pyDeferLoad","false");actionPage51.putString( "pyImage","pzEndIcon");actionPage51.putString("pyType","Action");
executePage=actionPage51.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage51 = actionPage51.getPage("pyBehaviors(<append>)");
behaviorPage51.putString("pyAction","runScript");ClipboardPage commandPage51 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage51.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022,type:\\u0022End\\u0022}");commandPage51.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage51.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage51);
behaviorPage51.putPage("pyActionAPI",commandPage51);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage51.getPage("pyBehaviors(<LAST>)")).register();
commandPage51.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1606307118340000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - ID1606307118340000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage53= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage53 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage53 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage53.putString("pyHidden",String.valueOf(hideElement));actionPage53.putString("pyDisabled",String.valueOf(disableElement));actionPage53.putString( "pyName","ID1606307118340000");actionPage53.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage53.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage53.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage53.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage53.putString( "pyBadgeFormat","");actionPage53.putString( "pyDeferLoad","");actionPage53.putString( "pyImage","");actionPage53.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
showWhenCondition = true;
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzIsNotProcessModelerViewContext",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Obj-Flow","pyFlowShapesExtension",commonPrefix,uniqueSuffix,actionPage40, tools, "actionPage40","false",actionPage40);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//END OF WHEN CONDITION
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1347490461952006".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1347490461952006*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage57= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage57 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage57 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzIsNotProcessModelerViewContext";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage57.putString("pyHidden",String.valueOf(hideElement));actionPage57.putString("pyDisabled",String.valueOf(disableElement));actionPage57.putString( "pyName","ID1347490461952006");actionPage57.putString( "pyImageSource","styleclass");actionPage57.putString( "pyIconStyle","pzSplitForEachIcon");actionPage57.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Split For Each"));actionPage57.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage57.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage57.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage57.putString( "pyAutomationID","20171129030100097577");}actionPage57.putString( "pyBadgeFormat","Standard (label)");actionPage57.putString( "pyDeferLoad","false");actionPage57.putString( "pyImage","pzSplitForEachIcon");if (!hideElement) { 
actionPage57.putString("pyType","Action");
executePage=actionPage57.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage57 = actionPage57.getPage("pyBehaviors(<append>)");
behaviorPage57.putString("pyAction","runScript");ClipboardPage commandPage57 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage57.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022, type:\\u0022SplitForEachSF\\u0022}");commandPage57.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage57.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage57);
behaviorPage57.putPage("pyActionAPI",commandPage57);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage57.getPage("pyBehaviors(<LAST>)")).register();
commandPage57.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - */

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage59= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage59 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage59 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage59.putString("pyHidden",String.valueOf(hideElement));actionPage59.putString("pyDisabled",String.valueOf(disableElement));actionPage59.putString( "pyName","");actionPage59.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage59.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage59.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage59.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage59.putString( "pyBadgeFormat","");actionPage59.putString( "pyDeferLoad","");actionPage59.putString( "pyImage","");actionPage59.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage61= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage61 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage61 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage61.putString("pyHidden",String.valueOf(hideElement));actionPage61.putString("pyDisabled",String.valueOf(disableElement));actionPage61.putString( "pyName","");actionPage61.putString( "pyImageSource","styleclass");actionPage61.putString( "pyIconStyle","pzAPIUtilityIcon");actionPage61.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Smart Shapes"));actionPage61.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage61.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage61.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage61.putString( "pyBadgeFormat","Standard (label)");actionPage61.putString( "pyDeferLoad","false");actionPage61.putString( "pyImage","pzAPIUtilityIcon");actionPage61.putString("pyType","Action");
executePage=actionPage61.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage61 = actionPage61.getPage("pyBehaviors(<append>)");
behaviorPage61.putString("pyAction","runScript");ClipboardPage commandPage61 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage61.putString( "pyFunctionName","void");executePage.putPage("pyCustom",commandPage61);
behaviorPage61.putPage("pyActionAPI",commandPage61);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage61.getPage("pyBehaviors(<LAST>)")).register();
commandPage61.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Obj-Flow","pzCommonUtilityAPIs",commonPrefix,uniqueSuffix,actionPage61, tools, "actionPage61","false",actionPage61);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Obj-Flow","pyExtendedAPIs",commonPrefix,uniqueSuffix,actionPage61, tools, "actionPage61","false",actionPage61);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1596457934995000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1596457934995000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage67= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage67 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage67 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage67.putString("pyHidden",String.valueOf(hideElement));actionPage67.putString("pyDisabled",String.valueOf(disableElement));actionPage67.putString( "pyName","ID1596457934995000");actionPage67.putString( "pyImageSource","styleclass");actionPage67.putString( "pyIconStyle","pzConversationIcon");actionPage67.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Conversation"));actionPage67.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage67.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage67.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage67.putString( "pyAutomationID","202008030830030605205");}actionPage67.putString( "pyBadgeFormat","Standard (label)");actionPage67.putString( "pyDeferLoad","false");actionPage67.putString( "pyImage","pzConversationIcon");actionPage67.putString("pyType","Action");
executePage=actionPage67.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1596457934995000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - */

disableElement = false;
hideElement = false;
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Obj-Flow","pzConversationalShapes",commonPrefix,uniqueSuffix,actionPage67, tools, "actionPage67","false",actionPage67);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - */

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage71= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage71 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage71 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage71.putString("pyHidden",String.valueOf(hideElement));actionPage71.putString("pyDisabled",String.valueOf(disableElement));actionPage71.putString( "pyName","");actionPage71.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage71.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage71.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage71.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage71.putString( "pyBadgeFormat","");actionPage71.putString( "pyDeferLoad","");actionPage71.putString( "pyImage","");actionPage71.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1347490461952007".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1347490461952007*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage73= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage40 != null ? actionPage40.getReference() : "" 
;actionPage73 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage73 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage73.putString("pyHidden",String.valueOf(hideElement));actionPage73.putString("pyDisabled",String.valueOf(disableElement));actionPage73.putString( "pyName","ID1347490461952007");actionPage73.putString( "pyImageSource","styleclass");actionPage73.putString( "pyIconStyle","pzAnnotationIcon");actionPage73.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Annotation"));actionPage73.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage73.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage73.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage73.putString( "pyAutomationID","201711290301010081893");}actionPage73.putString( "pyBadgeFormat","Standard (label)");actionPage73.putString( "pyDeferLoad","false");actionPage73.putString( "pyImage","pzAnnotationIcon");actionPage73.putString("pyType","Action");
executePage=actionPage73.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage73 = actionPage73.getPage("pyBehaviors(<append>)");
behaviorPage73.putString("pyAction","runScript");ClipboardPage commandPage73 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage73.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022addNode\\u0022, type:\\u0022Annotation\\u0022}");commandPage73.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage73.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage73);
behaviorPage73.putPage("pyActionAPI",commandPage73);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage73.getPage("pyBehaviors(<LAST>)")).register();
commandPage73.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Contextual Menu - Canvas" */

private void method75_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1346797498255000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage75";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1346797498255000")){
return;}
if(processShortcut &&"ID1346797498255000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage75= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage75 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage75 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
enableWhenCondition = true;
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pyAllowInteraction",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
actionPage75.putString("pyHidden",String.valueOf(hideElement));actionPage75.putString("pyDisabled",String.valueOf(disableElement));actionPage75.putString( "pyName","ID1346797498255000");actionPage75.putString( "pyImageSource","styleclass");actionPage75.putString( "pyIconStyle","MxGraphViewerCtxMenuAutoLayout");actionPage75.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Layout"));actionPage75.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage75.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage75.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Auto Layout Shapes"));if(testIDWhen || functionalTestingWhen){actionPage75.putString( "pyAutomationID","201711290301010147974");}actionPage75.putString( "pyBadgeFormat","Standard (label)");actionPage75.putString( "pyDeferLoad","false");actionPage75.putString( "pyImage","MxGraphViewerCtxMenuAutoLayout");actionPage75.putString("pyType","Action");
executePage=actionPage75.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
if (!disableElement) { 
}
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage75);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1346797498255000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346797871537000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346797871537000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage76= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage75 != null ? actionPage75.getReference() : "" 
;actionPage76 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage76 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage76.putString("pyHidden",String.valueOf(hideElement));actionPage76.putString("pyDisabled",String.valueOf(disableElement));actionPage76.putString( "pyName","ID1346797871537000");actionPage76.putString( "pyImageSource","styleclass");actionPage76.putString( "pyIconStyle","MxGraphViewerCtxMenuAutoLayoutH");actionPage76.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Align horizontally"));actionPage76.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage76.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage76.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage76.putString( "pyAutomationID","20171129030101011313");}actionPage76.putString( "pyBadgeFormat","Standard (label)");actionPage76.putString( "pyDeferLoad","false");actionPage76.putString( "pyImage","MxGraphViewerCtxMenuAutoLayoutH");actionPage76.putString("pyType","Action");
executePage=actionPage76.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage76 = actionPage76.getPage("pyBehaviors(<append>)");
behaviorPage76.putString("pyAction","runScript");ClipboardPage commandPage76 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage76.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022autoLayout\\u0022,layout:\\u0022horizontal\\u0022}");commandPage76.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage76.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage76);
behaviorPage76.putPage("pyActionAPI",commandPage76);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage76.getPage("pyBehaviors(<LAST>)")).register();
commandPage76.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346797871537001".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346797871537001*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage78= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage75 != null ? actionPage75.getReference() : "" 
;actionPage78 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage78 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage78.putString("pyHidden",String.valueOf(hideElement));actionPage78.putString("pyDisabled",String.valueOf(disableElement));actionPage78.putString( "pyName","ID1346797871537001");actionPage78.putString( "pyImageSource","styleclass");actionPage78.putString( "pyIconStyle","MxGraphViewerCtxMenuAutoLayoutV");actionPage78.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Align vertically"));actionPage78.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage78.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage78.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage78.putString( "pyAutomationID","201711290301010135119");}actionPage78.putString( "pyBadgeFormat","Standard (label)");actionPage78.putString( "pyDeferLoad","false");actionPage78.putString( "pyImage","MxGraphViewerCtxMenuAutoLayoutV");actionPage78.putString("pyType","Action");
executePage=actionPage78.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage78 = actionPage78.getPage("pyBehaviors(<append>)");
behaviorPage78.putString("pyAction","runScript");ClipboardPage commandPage78 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage78.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022autoLayout\\u0022,layout:\\u0022vertical\\u0022}");commandPage78.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage78.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage78);
behaviorPage78.putPage("pyActionAPI",commandPage78);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage78.getPage("pyBehaviors(<LAST>)")).register();
commandPage78.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Contextual Menu - Canvas" */

private void method80_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1346797871626000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage80";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1346797871626000")){
return;}
if(processShortcut &&"ID1346797871626000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage80= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage80 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage80 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyAllowInteraction";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage80.putString("pyHidden",String.valueOf(hideElement));actionPage80.putString("pyDisabled",String.valueOf(disableElement));actionPage80.putString( "pyName","ID1346797871626000");actionPage80.putString( "pyImageSource","styleclass");actionPage80.putString( "pyIconStyle","MxGraphViewerCtxMenuSelectAll");actionPage80.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Select All"));actionPage80.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage80.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage80.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage80.putString( "pyAutomationID","201711290301010173276");}actionPage80.putString( "pyBadgeFormat","Standard (label)");actionPage80.putString( "pyDeferLoad","");actionPage80.putString( "pyImage","MxGraphViewerCtxMenuSelectAll");if (!hideElement) { 
actionPage80.putString("pyType","Action");
executePage=actionPage80.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage80 = actionPage80.getPage("pyBehaviors(<append>)");
behaviorPage80.putString("pyAction","runScript");ClipboardPage commandPage80 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage80.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022select\\u0022, type:\\u0022all\\u0022}");commandPage80.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage80.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage80);
behaviorPage80.putPage("pyActionAPI",commandPage80);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage80.getPage("pyBehaviors(<LAST>)")).register();
commandPage80.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage80);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Contextual Menu - Canvas" */

private void method81_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1348611961283000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage81";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1348611961283000")){
return;}
if(processShortcut &&"ID1348611961283000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage81= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage81 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage81 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyAllowSpecification";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzHasInsKey",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage81.putString("pyHidden",String.valueOf(hideElement));actionPage81.putString("pyDisabled",String.valueOf(disableElement));actionPage81.putString( "pyName","ID1348611961283000");actionPage81.putString( "pyImageSource","styleclass");actionPage81.putString( "pyIconStyle","MxGraphViewerCtxMenuSpecification");actionPage81.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Specification"));actionPage81.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage81.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage81.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage81.putString( "pyAutomationID","201711290301010198848");}actionPage81.putString( "pyBadgeFormat","Standard (label)");actionPage81.putString( "pyDeferLoad","false");actionPage81.putString( "pyImage","MxGraphViewerCtxMenuSpecification");if (!hideElement) { 
actionPage81.putString("pyType","Action");
executePage=actionPage81.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage81 = actionPage81.getPage("pyBehaviors(<append>)");
behaviorPage81.putString("pyAction","runScript");ClipboardPage commandPage81 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage81.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022showPropertyPanel\\u0022, method:\\u0022pzEditUseCasesLinks\\u0022}");commandPage81.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage81.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage81);
behaviorPage81.putPage("pyActionAPI",commandPage81);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage81.getPage("pyBehaviors(<LAST>)")).register();
commandPage81.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if (!disableElement) { 
}
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage81);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"Contextual Menu - Canvas" */

private void method82_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1606307118938000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage82";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1606307118938000")){
return;}
if(processShortcut &&"ID1606307118938000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage82= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage82 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage82 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage82.putString("pyHidden",String.valueOf(hideElement));actionPage82.putString("pyDisabled",String.valueOf(disableElement));actionPage82.putString( "pyName","ID1606307118938000");actionPage82.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage82.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage82.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage82.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage82.putString( "pyBadgeFormat","");actionPage82.putString( "pyDeferLoad","");actionPage82.putString( "pyImage","");actionPage82.putString("pyType","Separator");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage82);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Contextual Menu - Canvas" */

private void method83_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1346797871626001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage83";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1346797871626001")){
return;}
if(processShortcut &&"ID1346797871626001".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage83= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage83 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage83 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage83.putString("pyHidden",String.valueOf(hideElement));actionPage83.putString("pyDisabled",String.valueOf(disableElement));actionPage83.putString( "pyName","ID1346797871626001");actionPage83.putString( "pyImageSource","styleclass");actionPage83.putString( "pyIconStyle","MxGraphViewerCtxMenuZoom");actionPage83.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Zoom"));actionPage83.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage83.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage83.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage83.putString( "pyAutomationID","");}actionPage83.putString( "pyBadgeFormat","Standard (label)");actionPage83.putString( "pyDeferLoad","false");actionPage83.putString( "pyImage","MxGraphViewerCtxMenuZoom");actionPage83.putString("pyType","Action");
executePage=actionPage83.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage83);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1346797871626001")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346797871614000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346797871614000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage84= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage84 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage84 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage84.putString("pyHidden",String.valueOf(hideElement));actionPage84.putString("pyDisabled",String.valueOf(disableElement));actionPage84.putString( "pyName","ID1346797871614000");actionPage84.putString( "pyImageSource","styleclass");actionPage84.putString( "pyIconStyle","MxGraphViewerCtxMenuZoomIn");actionPage84.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Zoom In"));actionPage84.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage84.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage84.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage84.putString( "pyAutomationID","201711290301010260571");}actionPage84.putString( "pyBadgeFormat","Standard (label)");actionPage84.putString( "pyDeferLoad","false");actionPage84.putString( "pyImage","MxGraphViewerCtxMenuZoomIn");actionPage84.putString("pyType","Action");
executePage=actionPage84.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage84 = actionPage84.getPage("pyBehaviors(<append>)");
behaviorPage84.putString("pyAction","runScript");ClipboardPage commandPage84 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage84.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022zoom\\u0022, zoom:\\u0022in\\u0022, fixed:true}");commandPage84.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage84.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage84);
behaviorPage84.putPage("pyActionAPI",commandPage84);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage84.getPage("pyBehaviors(<LAST>)")).register();
commandPage84.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346797871614001".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346797871614001*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage86= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage86 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage86 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage86.putString("pyHidden",String.valueOf(hideElement));actionPage86.putString("pyDisabled",String.valueOf(disableElement));actionPage86.putString( "pyName","ID1346797871614001");actionPage86.putString( "pyImageSource","styleclass");actionPage86.putString( "pyIconStyle","MxGraphViewerCtxMenuZoomOut");actionPage86.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Zoom Out"));actionPage86.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage86.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage86.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage86.putString( "pyAutomationID","201711290301010281163");}actionPage86.putString( "pyBadgeFormat","Standard (label)");actionPage86.putString( "pyDeferLoad","false");actionPage86.putString( "pyImage","MxGraphViewerCtxMenuZoomOut");actionPage86.putString("pyType","Action");
executePage=actionPage86.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage86 = actionPage86.getPage("pyBehaviors(<append>)");
behaviorPage86.putString("pyAction","runScript");ClipboardPage commandPage86 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage86.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022zoom\\u0022, zoom:\\u0022out\\u0022, fixed:true}");commandPage86.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage86.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage86);
behaviorPage86.putPage("pyActionAPI",commandPage86);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage86.getPage("pyBehaviors(<LAST>)")).register();
commandPage86.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1606307118907000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - ID1606307118907000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage88= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage88 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage88 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage88.putString("pyHidden",String.valueOf(hideElement));actionPage88.putString("pyDisabled",String.valueOf(disableElement));actionPage88.putString( "pyName","ID1606307118907000");actionPage88.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage88.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage88.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage88.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage88.putString( "pyBadgeFormat","");actionPage88.putString( "pyDeferLoad","");actionPage88.putString( "pyImage","");actionPage88.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346877648723000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346877648723000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage90= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage90 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage90 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage90.putString("pyHidden",String.valueOf(hideElement));actionPage90.putString("pyDisabled",String.valueOf(disableElement));actionPage90.putString( "pyName","ID1346877648723000");actionPage90.putString( "pyImageSource","styleclass");actionPage90.putString( "pyIconStyle","MxGraphViewerCtxMenuZoomActual");actionPage90.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Actual Size"));actionPage90.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage90.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage90.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage90.putString( "pyAutomationID","201711290301010321550");}actionPage90.putString( "pyBadgeFormat","Standard (label)");actionPage90.putString( "pyDeferLoad","false");actionPage90.putString( "pyImage","MxGraphViewerCtxMenuZoomActual");actionPage90.putString("pyType","Action");
executePage=actionPage90.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage90 = actionPage90.getPage("pyBehaviors(<append>)");
behaviorPage90.putString("pyAction","runScript");ClipboardPage commandPage90 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage90.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022zoom\\u0022, zoom:\\u0022actual\\u0022, fixed:true}");commandPage90.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage90.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage90);
behaviorPage90.putPage("pyActionAPI",commandPage90);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage90.getPage("pyBehaviors(<LAST>)")).register();
commandPage90.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346879878955000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346879878955000*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage92= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage92 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage92 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage92.putString("pyHidden",String.valueOf(hideElement));actionPage92.putString("pyDisabled",String.valueOf(disableElement));actionPage92.putString( "pyName","ID1346879878955000");actionPage92.putString( "pyImageSource","styleclass");actionPage92.putString( "pyIconStyle","MxGraphViewerCtxMenuZoomFit");actionPage92.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Fit to Screen"));actionPage92.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage92.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage92.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage92.putString( "pyAutomationID","201711290301010342345");}actionPage92.putString( "pyBadgeFormat","Standard (label)");actionPage92.putString( "pyDeferLoad","false");actionPage92.putString( "pyImage","MxGraphViewerCtxMenuZoomFit");actionPage92.putString("pyType","Action");
executePage=actionPage92.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage92 = actionPage92.getPage("pyBehaviors(<append>)");
behaviorPage92.putString("pyAction","runScript");ClipboardPage commandPage92 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage92.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022zoom\\u0022, zoom:\\u0022fit\\u0022, fixed:true}");commandPage92.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage92.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage92);
behaviorPage92.putPage("pyActionAPI",commandPage92);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage92.getPage("pyBehaviors(<LAST>)")).register();
commandPage92.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption - ------------------ and Name - */

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage94= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage94 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage94 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage94.putString("pyHidden",String.valueOf(hideElement));actionPage94.putString("pyDisabled",String.valueOf(disableElement));actionPage94.putString( "pyName","");actionPage94.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage94.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage94.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage94.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage94.putString( "pyBadgeFormat","");actionPage94.putString( "pyDeferLoad","");actionPage94.putString( "pyImage","");actionPage94.putString("pyType","Separator");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346797871614002".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346797871614002*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage96= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage96 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage96 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage96.putString("pyHidden",String.valueOf(hideElement));actionPage96.putString("pyDisabled",String.valueOf(disableElement));actionPage96.putString( "pyName","ID1346797871614002");actionPage96.putString( "pyImageSource","styleclass");actionPage96.putString( "pyIconStyle","MxGraphViewerCtxMenuZoomPercentage");actionPage96.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "25%"));actionPage96.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage96.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage96.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage96.putString( "pyAutomationID","201711290301010381573");}actionPage96.putString( "pyBadgeFormat","Standard (label)");actionPage96.putString( "pyDeferLoad","false");actionPage96.putString( "pyImage","MxGraphViewerCtxMenuZoomPercentage");actionPage96.putString("pyType","Action");
executePage=actionPage96.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage96 = actionPage96.getPage("pyBehaviors(<append>)");
behaviorPage96.putString("pyAction","runScript");ClipboardPage commandPage96 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage96.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022zoom\\u0022, zoom:25, fixed:true}");commandPage96.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage96.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage96);
behaviorPage96.putPage("pyActionAPI",commandPage96);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage96.getPage("pyBehaviors(<LAST>)")).register();
commandPage96.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346797871614003".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346797871614003*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage98= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage98 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage98 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage98.putString("pyHidden",String.valueOf(hideElement));actionPage98.putString("pyDisabled",String.valueOf(disableElement));actionPage98.putString( "pyName","ID1346797871614003");actionPage98.putString( "pyImageSource","styleclass");actionPage98.putString( "pyIconStyle","MxGraphViewerCtxMenuZoomPercentage");actionPage98.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "50%"));actionPage98.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage98.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage98.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage98.putString( "pyAutomationID","201711290301010402112");}actionPage98.putString( "pyBadgeFormat","Standard (label)");actionPage98.putString( "pyDeferLoad","false");actionPage98.putString( "pyImage","MxGraphViewerCtxMenuZoomPercentage");actionPage98.putString("pyType","Action");
executePage=actionPage98.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage98 = actionPage98.getPage("pyBehaviors(<append>)");
behaviorPage98.putString("pyAction","runScript");ClipboardPage commandPage98 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage98.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022zoom\\u0022, zoom:50, fixed:true}");commandPage98.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage98.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage98);
behaviorPage98.putPage("pyActionAPI",commandPage98);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage98.getPage("pyBehaviors(<LAST>)")).register();
commandPage98.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346797871614004".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346797871614004*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage100= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage100 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage100 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage100.putString("pyHidden",String.valueOf(hideElement));actionPage100.putString("pyDisabled",String.valueOf(disableElement));actionPage100.putString( "pyName","ID1346797871614004");actionPage100.putString( "pyImageSource","styleclass");actionPage100.putString( "pyIconStyle","MxGraphViewerCtxMenuZoomPercentage");actionPage100.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "75%"));actionPage100.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage100.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage100.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage100.putString( "pyAutomationID","201711290301010423540");}actionPage100.putString( "pyBadgeFormat","Standard (label)");actionPage100.putString( "pyDeferLoad","false");actionPage100.putString( "pyImage","MxGraphViewerCtxMenuZoomPercentage");actionPage100.putString("pyType","Action");
executePage=actionPage100.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage100 = actionPage100.getPage("pyBehaviors(<append>)");
behaviorPage100.putString("pyAction","runScript");ClipboardPage commandPage100 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage100.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022zoom\\u0022, zoom:75, fixed:true}");commandPage100.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage100.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage100);
behaviorPage100.putPage("pyActionAPI",commandPage100);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage100.getPage("pyBehaviors(<LAST>)")).register();
commandPage100.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346797871614005".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346797871614005*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage102= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage102 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage102 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage102.putString("pyHidden",String.valueOf(hideElement));actionPage102.putString("pyDisabled",String.valueOf(disableElement));actionPage102.putString( "pyName","ID1346797871614005");actionPage102.putString( "pyImageSource","styleclass");actionPage102.putString( "pyIconStyle","MxGraphViewerCtxMenuZoomPercentage");actionPage102.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "100%"));actionPage102.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage102.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage102.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage102.putString( "pyAutomationID","201711290301010444852");}actionPage102.putString( "pyBadgeFormat","Standard (label)");actionPage102.putString( "pyDeferLoad","false");actionPage102.putString( "pyImage","MxGraphViewerCtxMenuZoomPercentage");actionPage102.putString("pyType","Action");
executePage=actionPage102.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage102 = actionPage102.getPage("pyBehaviors(<append>)");
behaviorPage102.putString("pyAction","runScript");ClipboardPage commandPage102 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage102.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022zoom\\u0022, zoom:100, fixed:true}");commandPage102.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage102.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage102);
behaviorPage102.putPage("pyActionAPI",commandPage102);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage102.getPage("pyBehaviors(<LAST>)")).register();
commandPage102.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346797871614006".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346797871614006*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage104= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage104 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage104 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage104.putString("pyHidden",String.valueOf(hideElement));actionPage104.putString("pyDisabled",String.valueOf(disableElement));actionPage104.putString( "pyName","ID1346797871614006");actionPage104.putString( "pyImageSource","styleclass");actionPage104.putString( "pyIconStyle","MxGraphViewerCtxMenuZoomPercentage");actionPage104.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "200%"));actionPage104.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage104.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage104.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage104.putString( "pyAutomationID","201711290301010465819");}actionPage104.putString( "pyBadgeFormat","Standard (label)");actionPage104.putString( "pyDeferLoad","false");actionPage104.putString( "pyImage","MxGraphViewerCtxMenuZoomPercentage");actionPage104.putString("pyType","Action");
executePage=actionPage104.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage104 = actionPage104.getPage("pyBehaviors(<append>)");
behaviorPage104.putString("pyAction","runScript");ClipboardPage commandPage104 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage104.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022zoom\\u0022, zoom:200, fixed:true}");commandPage104.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage104.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage104);
behaviorPage104.putPage("pyActionAPI",commandPage104);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage104.getPage("pyBehaviors(<LAST>)")).register();
commandPage104.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1346797871614007".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1346797871614007*/

if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage106= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage83 != null ? actionPage83.getReference() : "" 
;actionPage106 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage106 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage106.putString("pyHidden",String.valueOf(hideElement));actionPage106.putString("pyDisabled",String.valueOf(disableElement));actionPage106.putString( "pyName","ID1346797871614007");actionPage106.putString( "pyImageSource","styleclass");actionPage106.putString( "pyIconStyle","MxGraphViewerCtxMenuZoomPercentage");actionPage106.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "400%"));actionPage106.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage106.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage106.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage106.putString( "pyAutomationID","201711290301010485338");}actionPage106.putString( "pyBadgeFormat","Standard (label)");actionPage106.putString( "pyDeferLoad","false");actionPage106.putString( "pyImage","MxGraphViewerCtxMenuZoomPercentage");actionPage106.putString("pyType","Action");
executePage=actionPage106.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage106 = actionPage106.getPage("pyBehaviors(<append>)");
behaviorPage106.putString("pyAction","runScript");ClipboardPage commandPage106 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage106.getProperty("pyParameters").getPageValue(1).putString( "pyValue","script:{name:\\u0022zoom\\u0022, zoom:400, fixed:true}");commandPage106.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage106.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage106);
behaviorPage106.putPage("pyActionAPI",commandPage106);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage106.getPage("pyBehaviors(<LAST>)")).register();
commandPage106.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Contextual Menu - Canvas" */

private void method108_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1346797871626002".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage108";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1346797871626002")){
return;}
if(processShortcut &&"ID1346797871626002".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage108= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage108 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage108 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsNotConversationFlow";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pyDMEnablePaste",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage108.putString("pyHidden",String.valueOf(hideElement));actionPage108.putString("pyDisabled",String.valueOf(disableElement));actionPage108.putString( "pyName","ID1346797871626002");actionPage108.putString( "pyImageSource","styleclass");actionPage108.putString( "pyIconStyle","MxGraphViewerCtxMenuPaste");actionPage108.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Paste"));actionPage108.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage108.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage108.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage108.putString( "pyAutomationID","201711290301010506735");}actionPage108.putString( "pyBadgeFormat","Standard (label)");actionPage108.putString( "pyDeferLoad","false");actionPage108.putString( "pyImage","MxGraphViewerCtxMenuPaste");if (!hideElement) { 
actionPage108.putString("pyType","Action");
executePage=actionPage108.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage108 = actionPage108.getPage("pyBehaviors(<append>)");
behaviorPage108.putString("pyAction","runScript");ClipboardPage commandPage108 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage108.getProperty("pyParameters").getPageValue(1).putString( "pyValue","paste");commandPage108.getProperty("pyParameters").getPageValue(1).putString( "pyName","");commandPage108.putString( "pyFunctionName","ViewerManager.executeAction");executePage.putPage("pyCustom",commandPage108);
behaviorPage108.putPage("pyActionAPI",commandPage108);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage108.getPage("pyBehaviors(<LAST>)")).register();
commandPage108.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if (!disableElement) { 
}
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage108);
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION RULE-OBJ-FLOW PYROOTMENU #20200819T081937.633 GMT", "Rule-Obj-Flow pyRootMenu", "Pega-ProcessArchitect", "08-06-01", "20201203T093903.072 GMT");
}
