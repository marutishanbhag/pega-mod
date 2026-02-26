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
public class ra_action_pycasemanagerlinks_fc702ef060407c74e1810efd4d18095c  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pyCaseManagerLinks.Data_Portal.Action");
	public ra_action_pycasemanagerlinks_fc702ef060407c74e1810efd4d18095c(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION DATA-PORTAL PYCASEMANAGERLINKS #20200625T083425.903 GMT	Pega-EndUserUI:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(true){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "Manager Portal Navigation"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("Manager Portal Navigation");
	}
}
String actionType=tools.getParamValue("Action");
boolean processShortcut= actionType.equals("pxProcessShortcut")?true:false;
boolean processAction= actionType.equals("pxProcessAction")?true:false;
String nodePath=tools.getParamValue("nodePath");
boolean isNodePathEmpty=nodePath.equals("")?true:false;
String [] nodePathArr=nodePath.split("/");
method1_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method4_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method7_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method10_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method12_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method15_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method17_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method19_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method20_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
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
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSSHOWHARNESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCUSTOM", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PYCASEMANAGERLINKS"
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
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSSHOWHARNESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSSHOWHARNESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PYCASEMANAGERLINKS","Rule-Navigation","DATA-PORTAL",false,"","Pega-EndUserUI","08-05-01","RULE-NAVIGATION DATA-PORTAL PYCASEMANAGERLINKS #20200625T083425.903 GMT","!PYCASEMANAGERLINKS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2040417446)
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
//	RULE-NAVIGATION DATA-PORTAL PYCASEMANAGERLINKS #20200625T083425.903 GMT:20200625T083425.903 GMT

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
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSSHOWHARNESS #20181002T085420.943 GMT:20181029T095208.072 GMT
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
		return "444628ea801426941008fde33d603113";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"Manager Portal Navigation" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1294358612688000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1294358612688000")){
return;}
if(processShortcut &&"ID1294358612688000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","ID1294358612688000");actionPage1.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Dashboard"));actionPage1.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage1.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage1.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Dashboard"));if(testIDWhen || functionalTestingWhen){actionPage1.putString( "pyAutomationID","201804190311430736116");}actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","false");actionPage1.putString( "pyImage","");actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage1 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage1.putString("pyAction","runScript");ClipboardPage commandPage1 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage1.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Dashboard");commandPage1.getProperty("pyParameters").getPageValue(1).putString( "pyName","tabName");commandPage1.getProperty("pyParameters").getPageValue(2).putString( "pyValue","Data-Portal");commandPage1.getProperty("pyParameters").getPageValue(2).putString( "pyName","className");commandPage1.getProperty("pyParameters").getPageValue(3).putString( "pyValue","pyDashboard7");commandPage1.getProperty("pyParameters").getPageValue(3).putString( "pyName","harnessName");commandPage1.getProperty("pyParameters").getPageValue(4).putString( "pyValue","pyUpdatePortalContext");commandPage1.getProperty("pyParameters").getPageValue(4).putString( "pyName","preActivityName");commandPage1.getProperty("pyParameters").getPageValue(5).putString( "pyValue","");commandPage1.getProperty("pyParameters").getPageValue(5).putString( "pyName","prepActivityParams");commandPage1.getProperty("pyParameters").getPageValue(6).putString( "pyValue","");commandPage1.getProperty("pyParameters").getPageValue(6).putString( "pyName","keyValue");commandPage1.getProperty("pyParameters").getPageValue(7).putString( "pyValue","");commandPage1.getProperty("pyParameters").getPageValue(7).putString( "pyName","readOnly");commandPage1.getProperty("pyParameters").getPageValue(8).putString( "pyValue","");commandPage1.getProperty("pyParameters").getPageValue(8).putString( "pyName","preDataTransformName");commandPage1.getProperty("pyParameters").getPageValue(9).putString( "pyValue","");commandPage1.getProperty("pyParameters").getPageValue(9).putString( "pyName","replaceCurrent");commandPage1.getProperty("pyParameters").getPageValue(10).putString( "pyValue","true");commandPage1.getProperty("pyParameters").getPageValue(10).putString( "pyName","skipConflictCheck");commandPage1.getProperty("pyParameters").getPageValue(11).putString( "pyValue","");commandPage1.getProperty("pyParameters").getPageValue(11).putString( "pyName","contentID");commandPage1.getProperty("pyParameters").getPageValue(12).putString( "pyValue","");commandPage1.getProperty("pyParameters").getPageValue(12).putString( "pyName","dynamicContainerID");commandPage1.getProperty("pyParameters").getPageValue(13).putString( "pyValue","");commandPage1.getProperty("pyParameters").getPageValue(13).putString( "pyName","skipReload");commandPage1.putString( "pyFunctionName","pega.desktop.showHarness");executePage.putPage("pyCustom",commandPage1);
behaviorPage1.putPage("pyActionAPI",commandPage1);
ClipboardPage runScriptActionSets1 = tools.createPage("Embed-Control-Mode-ActionSets", "pyRunScriptActionSets");
ClipboardPage behaviorPage2 = runScriptActionSets1.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","showHarness");ClipboardPage commandPage2 = tools.createPage("Embed-DesktopAPI-ShowHarness","commandType");
commandPage2.putString( "pyTarget","newDocument");commandPage2.putString( "pyTitle","Dashboard");commandPage2.putString( "pyActivityClass","Data-Portal");commandPage2.putString( "pyHarnessName","pyDashboard7");commandPage2.putString( "pyReadOnly","No");commandPage2.putString( "pyKey","");commandPage2.putString( "pyActivity","");commandPage2.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage2.putString( "pyUsingPage","");commandPage2.putString( "pyElementName","");commandPage2.putString( "pyTargetElement","");commandPage2.putString( "pySelectedMobileTransitionType","pega.mobile.transitions.NONE");if(tools !=null && tools.getPrimaryPage() != null){  strPageName = tools.getPrimaryPage().getReference();}commandPage2.putString("pzPrimaryPage",strPageName);commandPage2.putString( "pyKey","");commandPage2.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage2.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");commandPage2.putString( "pyAlwaysRenderFromServer","false");executePage.putPage("pyShowHarness",commandPage2);
behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(runScriptActionSets1.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
runScriptActionSets1.removeFromClipboard();
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage1.removeFromClipboard();
ClipboardPage behaviorPage3 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","runScript");ClipboardPage commandPage3 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage3.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
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
/* Method generated for Top Level Node -"" for Navigation Rule :"Manager Portal Navigation" */

private void method4_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1369341048083000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage4";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1369341048083000")){
return;}
if(processShortcut &&"ID1369341048083000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage4 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage4 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage4.putString("pyHidden",String.valueOf(hideElement));actionPage4.putString("pyDisabled",String.valueOf(disableElement));actionPage4.putString( "pyName","ID1369341048083000");actionPage4.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "My Worklist"));actionPage4.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage4.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage4.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "My Worklist"));if(testIDWhen || functionalTestingWhen){actionPage4.putString( "pyAutomationID","201804190311430750141");}actionPage4.putString( "pyBadgeFormat","Standard (label)");actionPage4.putString( "pyDeferLoad","false");actionPage4.putString( "pyImage","");actionPage4.putString("pyType","Action");
executePage=actionPage4.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage4 = actionPage4.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","runScript");ClipboardPage commandPage4 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage4.getProperty("pyParameters").getPageValue(1).putString( "pyValue","My Worklist");commandPage4.getProperty("pyParameters").getPageValue(1).putString( "pyName","tabName");commandPage4.getProperty("pyParameters").getPageValue(2).putString( "pyValue","Data-Portal");commandPage4.getProperty("pyParameters").getPageValue(2).putString( "pyName","className");commandPage4.getProperty("pyParameters").getPageValue(3).putString( "pyValue","pyMyWorklist");commandPage4.getProperty("pyParameters").getPageValue(3).putString( "pyName","harnessName");commandPage4.getProperty("pyParameters").getPageValue(4).putString( "pyValue","");commandPage4.getProperty("pyParameters").getPageValue(4).putString( "pyName","preActivityName");commandPage4.getProperty("pyParameters").getPageValue(5).putString( "pyValue","");commandPage4.getProperty("pyParameters").getPageValue(5).putString( "pyName","preActivityParams");commandPage4.getProperty("pyParameters").getPageValue(6).putString( "pyValue","");commandPage4.getProperty("pyParameters").getPageValue(6).putString( "pyName","keyValue");commandPage4.getProperty("pyParameters").getPageValue(7).putString( "pyValue","");commandPage4.getProperty("pyParameters").getPageValue(7).putString( "pyName","readOnly");commandPage4.getProperty("pyParameters").getPageValue(8).putString( "pyValue","");commandPage4.getProperty("pyParameters").getPageValue(8).putString( "pyName","preDataTransformName");commandPage4.getProperty("pyParameters").getPageValue(9).putString( "pyValue","");commandPage4.getProperty("pyParameters").getPageValue(9).putString( "pyName","replaceCurrent");commandPage4.getProperty("pyParameters").getPageValue(10).putString( "pyValue","");commandPage4.getProperty("pyParameters").getPageValue(10).putString( "pyName","skipConflictCheck");commandPage4.getProperty("pyParameters").getPageValue(11).putString( "pyValue","");commandPage4.getProperty("pyParameters").getPageValue(11).putString( "pyName","contentID");commandPage4.getProperty("pyParameters").getPageValue(12).putString( "pyValue","");commandPage4.getProperty("pyParameters").getPageValue(12).putString( "pyName","dynamicContainerID");commandPage4.getProperty("pyParameters").getPageValue(13).putString( "pyValue","true");commandPage4.getProperty("pyParameters").getPageValue(13).putString( "pyName","skipReload");commandPage4.putString( "pyFunctionName","pega.desktop.showHarness");executePage.putPage("pyCustom",commandPage4);
behaviorPage4.putPage("pyActionAPI",commandPage4);
ClipboardPage runScriptActionSets4 = tools.createPage("Embed-Control-Mode-ActionSets", "pyRunScriptActionSets");
ClipboardPage behaviorPage5 = runScriptActionSets4.getPage("pyBehaviors(<append>)");
behaviorPage5.putString("pyAction","showHarness");ClipboardPage commandPage5 = tools.createPage("Embed-DesktopAPI-ShowHarness","commandType");
commandPage5.putString( "pyTarget","newDocument");commandPage5.putString( "pyTitle","My Worklist");commandPage5.putString( "pyActivityClass","Data-Portal");commandPage5.putString( "pyHarnessName","pyMyWorklist");commandPage5.putString( "pyReadOnly","No");commandPage5.putString( "pyKey","");commandPage5.putString( "pyActivity","");commandPage5.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage5.putString( "pyUsingPage","");commandPage5.putString( "pyElementName","");commandPage5.putString( "pyTargetElement","");commandPage5.putString( "pySelectedMobileTransitionType","pega.mobile.transitions.NONE");if(tools !=null && tools.getPrimaryPage() != null){  strPageName = tools.getPrimaryPage().getReference();}commandPage5.putString("pzPrimaryPage",strPageName);commandPage5.putString( "pyKey","");commandPage5.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage5.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");commandPage5.putString( "pyAlwaysRenderFromServer","false");executePage.putPage("pyShowHarness",commandPage5);
behaviorPage5.putPage("pyActionAPI",commandPage5);
((PegaAPI)tools).getUIEngine().getUIAction(runScriptActionSets4.getPage("pyBehaviors(<LAST>)")).register();
commandPage5.removeFromClipboard();
runScriptActionSets4.removeFromClipboard();
((PegaAPI)tools).getUIEngine().getUIAction(actionPage4.getPage("pyBehaviors(<LAST>)")).register();
commandPage4.removeFromClipboard();
ClipboardPage behaviorPage6 = actionPage4.getPage("pyBehaviors(<append>)");
behaviorPage6.putString("pyAction","runScript");ClipboardPage commandPage6 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage6.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage6.putPage("pyActionAPI",commandPage6);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage4.getPage("pyBehaviors(<LAST>)")).register();
commandPage6.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage4);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Manager Portal Navigation" */

private void method7_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1367325882383000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1367325882383000")){
return;}
if(processShortcut &&"ID1367325882383000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage7.putString("pyHidden",String.valueOf(hideElement));actionPage7.putString("pyDisabled",String.valueOf(disableElement));actionPage7.putString( "pyName","ID1367325882383000");actionPage7.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "My Cases"));actionPage7.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage7.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage7.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "My Cases"));if(testIDWhen || functionalTestingWhen){actionPage7.putString( "pyAutomationID","201804190311430764910");}actionPage7.putString( "pyBadgeFormat","Standard (label)");actionPage7.putString( "pyDeferLoad","false");actionPage7.putString( "pyImage","");actionPage7.putString("pyType","Action");
executePage=actionPage7.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage7 = actionPage7.getPage("pyBehaviors(<append>)");
behaviorPage7.putString("pyAction","runScript");ClipboardPage commandPage7 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage7.getProperty("pyParameters").getPageValue(1).putString( "pyValue","My Cases");commandPage7.getProperty("pyParameters").getPageValue(1).putString( "pyName","tabName");commandPage7.getProperty("pyParameters").getPageValue(2).putString( "pyValue","Data-Portal");commandPage7.getProperty("pyParameters").getPageValue(2).putString( "pyName","className");commandPage7.getProperty("pyParameters").getPageValue(3).putString( "pyValue","pyCMCases7");commandPage7.getProperty("pyParameters").getPageValue(3).putString( "pyName","harnessName");commandPage7.getProperty("pyParameters").getPageValue(4).putString( "pyValue","");commandPage7.getProperty("pyParameters").getPageValue(4).putString( "pyName","preActivityName");commandPage7.getProperty("pyParameters").getPageValue(5).putString( "pyValue","");commandPage7.getProperty("pyParameters").getPageValue(5).putString( "pyName","preActivityParams");commandPage7.getProperty("pyParameters").getPageValue(6).putString( "pyValue","");commandPage7.getProperty("pyParameters").getPageValue(6).putString( "pyName","keyValue");commandPage7.getProperty("pyParameters").getPageValue(7).putString( "pyValue","");commandPage7.getProperty("pyParameters").getPageValue(7).putString( "pyName","readOnly");commandPage7.getProperty("pyParameters").getPageValue(8).putString( "pyValue","");commandPage7.getProperty("pyParameters").getPageValue(8).putString( "pyName","preDataTransformName");commandPage7.getProperty("pyParameters").getPageValue(9).putString( "pyValue","");commandPage7.getProperty("pyParameters").getPageValue(9).putString( "pyName","replaceCurrent");commandPage7.getProperty("pyParameters").getPageValue(10).putString( "pyValue","");commandPage7.getProperty("pyParameters").getPageValue(10).putString( "pyName","skipConflictCheck");commandPage7.getProperty("pyParameters").getPageValue(11).putString( "pyValue","");commandPage7.getProperty("pyParameters").getPageValue(11).putString( "pyName","contentID");commandPage7.getProperty("pyParameters").getPageValue(12).putString( "pyValue","");commandPage7.getProperty("pyParameters").getPageValue(12).putString( "pyName","dynamicContainerID");commandPage7.getProperty("pyParameters").getPageValue(13).putString( "pyValue","true");commandPage7.getProperty("pyParameters").getPageValue(13).putString( "pyName","skipReload");commandPage7.putString( "pyFunctionName","pega.desktop.showHarness");executePage.putPage("pyCustom",commandPage7);
behaviorPage7.putPage("pyActionAPI",commandPage7);
ClipboardPage runScriptActionSets7 = tools.createPage("Embed-Control-Mode-ActionSets", "pyRunScriptActionSets");
ClipboardPage behaviorPage8 = runScriptActionSets7.getPage("pyBehaviors(<append>)");
behaviorPage8.putString("pyAction","showHarness");ClipboardPage commandPage8 = tools.createPage("Embed-DesktopAPI-ShowHarness","commandType");
commandPage8.putString( "pyTarget","newDocument");commandPage8.putString( "pyTitle","My Cases");commandPage8.putString( "pyActivityClass","Data-Portal");commandPage8.putString( "pyHarnessName","pyCMCases7");commandPage8.putString( "pyReadOnly","No");commandPage8.putString( "pyKey","");commandPage8.putString( "pyActivity","");commandPage8.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage8.putString( "pyUsingPage","");commandPage8.putString( "pyElementName","");commandPage8.putString( "pyTargetElement","");commandPage8.putString( "pySelectedMobileTransitionType","pega.mobile.transitions.NONE");if(tools !=null && tools.getPrimaryPage() != null){  strPageName = tools.getPrimaryPage().getReference();}commandPage8.putString("pzPrimaryPage",strPageName);commandPage8.putString( "pyKey","");commandPage8.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage8.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");commandPage8.putString( "pyAlwaysRenderFromServer","false");executePage.putPage("pyShowHarness",commandPage8);
behaviorPage8.putPage("pyActionAPI",commandPage8);
((PegaAPI)tools).getUIEngine().getUIAction(runScriptActionSets7.getPage("pyBehaviors(<LAST>)")).register();
commandPage8.removeFromClipboard();
runScriptActionSets7.removeFromClipboard();
((PegaAPI)tools).getUIEngine().getUIAction(actionPage7.getPage("pyBehaviors(<LAST>)")).register();
commandPage7.removeFromClipboard();
ClipboardPage behaviorPage9 = actionPage7.getPage("pyBehaviors(<append>)");
behaviorPage9.putString("pyAction","runScript");ClipboardPage commandPage9 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage9.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage9.putPage("pyActionAPI",commandPage9);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage7.getPage("pyBehaviors(<LAST>)")).register();
commandPage9.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage7);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Manager Portal Navigation" */

private void method10_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1524121997719000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage10";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1524121997719000")){
return;}
if(processShortcut &&"ID1524121997719000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage10 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage10 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage10.putString("pyHidden",String.valueOf(hideElement));actionPage10.putString("pyDisabled",String.valueOf(disableElement));actionPage10.putString( "pyName","ID1524121997719000");actionPage10.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Documents"));actionPage10.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage10.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage10.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Documents"));if(testIDWhen || functionalTestingWhen){actionPage10.putString( "pyAutomationID","201804190313170666581");}actionPage10.putString( "pyBadgeFormat","Standard (label)");actionPage10.putString( "pyDeferLoad","false");actionPage10.putString( "pyImage","");actionPage10.putString("pyType","Action");
executePage=actionPage10.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage10 = actionPage10.getPage("pyBehaviors(<append>)");
behaviorPage10.putString("pyAction","showHarness");ClipboardPage commandPage10 = tools.createPage("Embed-DesktopAPI-ShowHarness","commandType");
commandPage10.putString( "pyTarget","newDocument");commandPage10.putString( "pyTitle","Documents");commandPage10.putString( "pyActivityClass","Data-Portal");commandPage10.putString( "pyHarnessName","pyDocumentDashboard");commandPage10.putString( "pyReadOnly","No");commandPage10.putString( "pyKey","");commandPage10.putString( "pyActivity","");commandPage10.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","pzCreateDocLandingPage");commandPage10.putString( "pyUsingPage","");commandPage10.putString( "pyElementName","");commandPage10.putString( "pyTargetElement","");commandPage10.putString( "pySelectedMobileTransitionType","pega.mobile.transitions.NONE");if(tools !=null && tools.getPrimaryPage() != null){  strPageName = tools.getPrimaryPage().getReference();}commandPage10.putString("pzPrimaryPage",strPageName);commandPage10.putString( "pyKey","");commandPage10.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage10.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");commandPage10.putString( "pyAlwaysRenderFromServer","false");executePage.putPage("pyShowHarness",commandPage10);
behaviorPage10.putPage("pyActionAPI",commandPage10);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage10.getPage("pyBehaviors(<LAST>)")).register();
commandPage10.removeFromClipboard();
ClipboardPage behaviorPage11 = actionPage10.getPage("pyBehaviors(<append>)");
behaviorPage11.putString("pyAction","runScript");ClipboardPage commandPage11 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage11.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage11.putPage("pyActionAPI",commandPage11);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage10.getPage("pyBehaviors(<LAST>)")).register();
commandPage11.removeFromClipboard();
executePage.putString("pyCommand","showHarness");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage10);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Manager Portal Navigation" */

private void method12_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1367325882383002".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage12";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1367325882383002")){
return;}
if(processShortcut &&"ID1367325882383002".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage12 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage12 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage12.putString("pyHidden",String.valueOf(hideElement));actionPage12.putString("pyDisabled",String.valueOf(disableElement));actionPage12.putString( "pyName","ID1367325882383002");actionPage12.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Calendar"));actionPage12.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage12.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage12.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Calendar"));if(testIDWhen || functionalTestingWhen){actionPage12.putString( "pyAutomationID","201804190311430778196");}actionPage12.putString( "pyBadgeFormat","Standard (label)");actionPage12.putString( "pyDeferLoad","false");actionPage12.putString( "pyImage","");actionPage12.putString("pyType","Action");
executePage=actionPage12.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage12 = actionPage12.getPage("pyBehaviors(<append>)");
behaviorPage12.putString("pyAction","runScript");ClipboardPage commandPage12 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage12.getProperty("pyParameters").getPageValue(1).putString( "pyValue","Calendar");commandPage12.getProperty("pyParameters").getPageValue(1).putString( "pyName","tabName");commandPage12.getProperty("pyParameters").getPageValue(2).putString( "pyValue","Data-Portal");commandPage12.getProperty("pyParameters").getPageValue(2).putString( "pyName","className");commandPage12.getProperty("pyParameters").getPageValue(3).putString( "pyValue","pyCMEvents7");commandPage12.getProperty("pyParameters").getPageValue(3).putString( "pyName","harnessName");commandPage12.getProperty("pyParameters").getPageValue(4).putString( "pyValue","");commandPage12.getProperty("pyParameters").getPageValue(4).putString( "pyName","preActivityName");commandPage12.getProperty("pyParameters").getPageValue(5).putString( "pyValue","");commandPage12.getProperty("pyParameters").getPageValue(5).putString( "pyName","preActivityParams");commandPage12.getProperty("pyParameters").getPageValue(6).putString( "pyValue","");commandPage12.getProperty("pyParameters").getPageValue(6).putString( "pyName","keyValue");commandPage12.getProperty("pyParameters").getPageValue(7).putString( "pyValue","");commandPage12.getProperty("pyParameters").getPageValue(7).putString( "pyName","readOnly");commandPage12.getProperty("pyParameters").getPageValue(8).putString( "pyValue","");commandPage12.getProperty("pyParameters").getPageValue(8).putString( "pyName","preDataTransformName");commandPage12.getProperty("pyParameters").getPageValue(9).putString( "pyValue","");commandPage12.getProperty("pyParameters").getPageValue(9).putString( "pyName","replaceCurrent");commandPage12.getProperty("pyParameters").getPageValue(10).putString( "pyValue","");commandPage12.getProperty("pyParameters").getPageValue(10).putString( "pyName","skipConflictCheck");commandPage12.getProperty("pyParameters").getPageValue(11).putString( "pyValue","");commandPage12.getProperty("pyParameters").getPageValue(11).putString( "pyName","contentID");commandPage12.getProperty("pyParameters").getPageValue(12).putString( "pyValue","");commandPage12.getProperty("pyParameters").getPageValue(12).putString( "pyName","dynamicContainerID");commandPage12.getProperty("pyParameters").getPageValue(13).putString( "pyValue","true");commandPage12.getProperty("pyParameters").getPageValue(13).putString( "pyName","skipReload");commandPage12.putString( "pyFunctionName","pega.desktop.showHarness");executePage.putPage("pyCustom",commandPage12);
behaviorPage12.putPage("pyActionAPI",commandPage12);
ClipboardPage runScriptActionSets12 = tools.createPage("Embed-Control-Mode-ActionSets", "pyRunScriptActionSets");
ClipboardPage behaviorPage13 = runScriptActionSets12.getPage("pyBehaviors(<append>)");
behaviorPage13.putString("pyAction","showHarness");ClipboardPage commandPage13 = tools.createPage("Embed-DesktopAPI-ShowHarness","commandType");
commandPage13.putString( "pyTarget","newDocument");commandPage13.putString( "pyTitle","Calendar");commandPage13.putString( "pyActivityClass","Data-Portal");commandPage13.putString( "pyHarnessName","pyCMEvents7");commandPage13.putString( "pyReadOnly","No");commandPage13.putString( "pyKey","");commandPage13.putString( "pyActivity","");commandPage13.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage13.putString( "pyUsingPage","");commandPage13.putString( "pyElementName","");commandPage13.putString( "pyTargetElement","");commandPage13.putString( "pySelectedMobileTransitionType","");if(tools !=null && tools.getPrimaryPage() != null){  strPageName = tools.getPrimaryPage().getReference();}commandPage13.putString("pzPrimaryPage",strPageName);commandPage13.putString( "pyKey","");commandPage13.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage13.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");commandPage13.putString( "pyAlwaysRenderFromServer","false");executePage.putPage("pyShowHarness",commandPage13);
behaviorPage13.putPage("pyActionAPI",commandPage13);
((PegaAPI)tools).getUIEngine().getUIAction(runScriptActionSets12.getPage("pyBehaviors(<LAST>)")).register();
commandPage13.removeFromClipboard();
runScriptActionSets12.removeFromClipboard();
((PegaAPI)tools).getUIEngine().getUIAction(actionPage12.getPage("pyBehaviors(<LAST>)")).register();
commandPage12.removeFromClipboard();
ClipboardPage behaviorPage14 = actionPage12.getPage("pyBehaviors(<append>)");
behaviorPage14.putString("pyAction","runScript");ClipboardPage commandPage14 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage14.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage14.putPage("pyActionAPI",commandPage14);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage12.getPage("pyBehaviors(<LAST>)")).register();
commandPage14.removeFromClipboard();
executePage.putString("pyCommand","runScript");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage12);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Manager Portal Navigation" */

private void method15_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1375890601182000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage15";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1375890601182000")){
return;}
if(processShortcut &&"ID1375890601182000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage15= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage15 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage15 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage15.putString("pyHidden",String.valueOf(hideElement));actionPage15.putString("pyDisabled",String.valueOf(disableElement));actionPage15.putString( "pyName","ID1375890601182000");actionPage15.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Reports"));actionPage15.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage15.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage15.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Reports"));if(testIDWhen || functionalTestingWhen){actionPage15.putString( "pyAutomationID","201804190311430789145");}actionPage15.putString( "pyBadgeFormat","Standard (label)");actionPage15.putString( "pyDeferLoad","false");actionPage15.putString( "pyImage","");actionPage15.putString("pyType","Action");
executePage=actionPage15.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage15 = actionPage15.getPage("pyBehaviors(<append>)");
behaviorPage15.putString("pyAction","showHarness");ClipboardPage commandPage15 = tools.createPage("Embed-DesktopAPI-ShowHarness","commandType");
commandPage15.putString( "pyTarget","newDocument");commandPage15.putString( "pyTitle","ReportBrowser");commandPage15.putString( "pyActivityClass","Data-Portal");commandPage15.putString( "pyHarnessName","pyReportBrowser");commandPage15.putString( "pyReadOnly","No");commandPage15.putString( "pyKey","");commandPage15.putString( "pyActivity","pzInvalidateRBDataPages");commandPage15.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","pzRBSetFiltersWrapper");commandPage15.putString( "pyUsingPage","");commandPage15.putString( "pyElementName","");commandPage15.putString( "pyTargetElement","");commandPage15.putString( "pySelectedMobileTransitionType","pega.mobile.transitions.NONE");if(tools !=null && tools.getPrimaryPage() != null){  strPageName = tools.getPrimaryPage().getReference();}commandPage15.putString("pzPrimaryPage",strPageName);commandPage15.putString( "pyKey","");commandPage15.getProperty("pyActivityParams").getPageValue(1).putString( "pyValue","");commandPage15.getProperty("pyActivityParams").getPageValue(1).putString( "pyName","");commandPage15.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage15.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");commandPage15.putString( "pyAlwaysRenderFromServer","false");executePage.putPage("pyShowHarness",commandPage15);
behaviorPage15.putPage("pyActionAPI",commandPage15);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage15.getPage("pyBehaviors(<LAST>)")).register();
commandPage15.removeFromClipboard();
ClipboardPage behaviorPage16 = actionPage15.getPage("pyBehaviors(<append>)");
behaviorPage16.putString("pyAction","runScript");ClipboardPage commandPage16 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage16.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage16.putPage("pyActionAPI",commandPage16);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage15.getPage("pyBehaviors(<LAST>)")).register();
commandPage16.removeFromClipboard();
executePage.putString("pyCommand","showHarness");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage15);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Manager Portal Navigation" */

private void method17_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1422006385671000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage17";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1422006385671000")){
return;}
if(processShortcut &&"ID1422006385671000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage17= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage17 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage17 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzIsDelegatedRulesAvailable";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage17.putString("pyHidden",String.valueOf(hideElement));actionPage17.putString("pyDisabled",String.valueOf(disableElement));actionPage17.putString( "pyName","ID1422006385671000");actionPage17.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Manage Change"));actionPage17.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage17.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage17.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Manage Change"));if(testIDWhen || functionalTestingWhen){actionPage17.putString( "pyAutomationID","201804190311430805386");}actionPage17.putString( "pyBadgeFormat","Standard (label)");actionPage17.putString( "pyDeferLoad","false");actionPage17.putString( "pyImage","");if (!hideElement) { 
actionPage17.putString("pyType","Action");
executePage=actionPage17.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage17 = actionPage17.getPage("pyBehaviors(<append>)");
behaviorPage17.putString("pyAction","showHarness");ClipboardPage commandPage17 = tools.createPage("Embed-DesktopAPI-ShowHarness","commandType");
commandPage17.putString( "pyTarget","newDocument");commandPage17.putString( "pyTitle","Manage Change");commandPage17.putString( "pyActivityClass","Data-Portal");commandPage17.putString( "pyHarnessName","pzDelegatedRules");commandPage17.putString( "pyReadOnly","No");commandPage17.putString( "pyKey","");commandPage17.putString( "pyActivity","");commandPage17.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","pzFlushDelegationDataPage");commandPage17.putString( "pyUsingPage","");commandPage17.putString( "pyElementName","");commandPage17.putString( "pyTargetElement","");commandPage17.putString( "pySelectedMobileTransitionType","pega.mobile.transitions.NONE");if(tools !=null && tools.getPrimaryPage() != null){  strPageName = tools.getPrimaryPage().getReference();}commandPage17.putString("pzPrimaryPage",strPageName);commandPage17.putString( "pyKey","");commandPage17.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage17.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");commandPage17.putString( "pyAlwaysRenderFromServer","false");executePage.putPage("pyShowHarness",commandPage17);
behaviorPage17.putPage("pyActionAPI",commandPage17);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage17.getPage("pyBehaviors(<LAST>)")).register();
commandPage17.removeFromClipboard();
ClipboardPage behaviorPage18 = actionPage17.getPage("pyBehaviors(<append>)");
behaviorPage18.putString("pyAction","runScript");ClipboardPage commandPage18 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage18.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage18.putPage("pyActionAPI",commandPage18);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage17.getPage("pyBehaviors(<LAST>)")).register();
commandPage18.removeFromClipboard();
executePage.putString("pyCommand","showHarness");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage17);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"Manager Portal Navigation" */

private void method19_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage19";
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
if(processShortcut &&"".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage19= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage19 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage19 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pyIsMobile";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage19.putString("pyHidden",String.valueOf(hideElement));actionPage19.putString("pyDisabled",String.valueOf(disableElement));actionPage19.putString( "pyName","");actionPage19.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage19.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage19.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage19.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage19.putString( "pyBadgeFormat","Standard (label)");actionPage19.putString( "pyDeferLoad","");actionPage19.putString( "pyImage","");if (!hideElement) { 
actionPage19.putString("pyType","Separator");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage19);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Manager Portal Navigation" */

private void method20_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1412714191379000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1412714191379000")){
return;}
if(processShortcut &&"ID1412714191379000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pyIsMobile";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage20.putString("pyHidden",String.valueOf(hideElement));actionPage20.putString("pyDisabled",String.valueOf(disableElement));actionPage20.putString( "pyName","ID1412714191379000");actionPage20.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Log off"));actionPage20.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage20.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage20.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "Log off"));if(testIDWhen || functionalTestingWhen){actionPage20.putString( "pyAutomationID","201804190311430830269");}actionPage20.putString( "pyBadgeFormat","Standard (label)");actionPage20.putString( "pyDeferLoad","false");actionPage20.putString( "pyImage","");if (!hideElement) { 
actionPage20.putString("pyType","Action");
executePage=actionPage20.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage20 = actionPage20.getPage("pyBehaviors(<append>)");
behaviorPage20.putString("pyAction","logOff");((PegaAPI)tools).getUIEngine().getUIAction(actionPage20.getPage("pyBehaviors(<LAST>)")).register();
executePage.putString("pyCommand","logOff");
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
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION DATA-PORTAL PYCASEMANAGERLINKS #20200625T083425.903 GMT", "Data-Portal pyCaseManagerLinks", "Pega-EndUserUI", "08-05-01", "20200625T083425.903 GMT");
}
