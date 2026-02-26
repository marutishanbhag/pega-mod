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
public class ra_action_pzdefinitionmenu_d3c9833dbf357b5df72563aef31e052d  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzDefinitionMenu.Embed_ModelParams.Action");
	public ra_action_pzdefinitionmenu_d3c9833dbf357b5df72563aef31e052d(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION EMBED-MODELPARAMS PZDEFINITIONMENU #20180713T135317.067 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(false){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "pzDefinitionMenu"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("pzDefinitionMenu");
	}
}
String actionType=tools.getParamValue("Action");
boolean processShortcut= actionType.equals("pxProcessShortcut")?true:false;
boolean processAction= actionType.equals("pxProcessAction")?true:false;
String nodePath=tools.getParamValue("nodePath");
boolean isNodePathEmpty=nodePath.equals("")?true:false;
String [] nodePathArr=nodePath.split("/");
method1_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method2_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method3_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method4_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method5_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method6_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method7_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method8_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method9_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method10_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method11_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method12_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method13_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method14_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method15_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method16_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method17_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
}
	} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODBODY", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSADDROW", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCONTEXTLOCALACTION", 
	"Rule-Navigation:PZDEFINITIONMENU"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSADDROW","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSADDROW",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCONTEXTLOCALACTION","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCONTEXTLOCALACTION",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZDEFINITIONMENU","Rule-Navigation","EMBED-MODELPARAMS",false,"","Pega-Desktop","08-01-01","RULE-NAVIGATION EMBED-MODELPARAMS PZDEFINITIONMENU #20180713T135317.067 GMT","!PZDEFINITIONMENU",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",338869321)
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
//	RULE-NAVIGATION EMBED-MODELPARAMS PZDEFINITIONMENU #20180713T135317.067 GMT:20180713T135317.067 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUE #20180713T133341.510 GMT:20180713T133341.510 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESS--(STRING,STRING,CLIPBO23CEBAD98543B5A3EAFA23BE1E9907F7 #20180713T133342.835 GMT:20180713T133342.835 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19 #20230618T001619.186 GMT:20230618T001619.186 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONINNER--(FIRSTUSEA4574746F7C70774C55B41C005EC01EE7 #20190928T111813.415 GMT:20190928T145202.738 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSADDCHILD #20180713T133341.570 GMT:20180713T133341.570 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSADDROW #20180713T133341.584 GMT:20180713T133341.584 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCONTEXTLOCALACTION #20180713T133341.603 GMT:20180809T062652.434 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENMODALWINDOW #20190423T162450.106 GMT:20190423T162450.106 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZNAVIGATION PZISREFERENCE #20180713T133347.956 GMT:20180713T133347.956 GMT
//	RULE-UTILITY-FUNCTION STRING ISDOUBLE #20180713T131441.648 GMT:20180713T131441.648 GMT
//	RULE-UTILITY-FUNCTION STRING ISINTEGER #20180713T131441.652 GMT:20180713T131441.652 GMT
//	RULE-UTILITY-FUNCTION UIENGINE PZGETANIMATIONSJSONSTRING--(CLIPBOARDPAGE) #20190417T070159.744 GMT:20190430T131934.330 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "cfb168c323d17b7f6e936dfec69024be";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-ModelParams";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1290527492879001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1290527492879001")){
return;}
if(processShortcut &&"ID1290527492879001".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","ID1290527492879001");actionPage1.putString( "pyCaption","Add Sibling Above");actionPage1.putString( "pySummary","");actionPage1.putString( "pyBadgeProperty","");actionPage1.putString( "pyToolTip","");actionPage1.putString( "pyBadgeFormat","");actionPage1.putString( "pyDeferLoad","");actionPage1.putString( "pyImage","");actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage1 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage1.putString("pyAction","addRow");ClipboardPage commandPage1 = tools.createPage("Embed-SelectedContextAPI-AddRow","commandType");
commandPage1.putString("pyPosition","BEFORE");commandPage1.putString("pyRepeatCustomTemplateName","");commandPage1.putString("pyRepeatPageListProperty","");commandPage1.putString("pyEditFlowAction","");commandPage1.putString("pyRepeatOverrideTemplate","");commandPage1.putString("pyRepeatSourceType","");commandPage1.putString("pyRepeatLayoutType","");commandPage1.putString("pyRowPromptClass","");commandPage1.putString("pyRepeatDPName","");executePage.putPage("pyAddRow",commandPage1);
behaviorPage1.putPage("pyActionAPI",commandPage1);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage1.removeFromClipboard();
executePage.putString("pyCommand","addRow");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method2_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1290527492879002".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage2";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1290527492879002")){
return;}
if(processShortcut &&"ID1290527492879002".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage2 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage2 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage2.putString("pyHidden",String.valueOf(hideElement));actionPage2.putString("pyDisabled",String.valueOf(disableElement));actionPage2.putString( "pyName","ID1290527492879002");actionPage2.putString( "pyCaption","Add Sibling Below");actionPage2.putString( "pySummary","");actionPage2.putString( "pyBadgeProperty","");actionPage2.putString( "pyToolTip","");actionPage2.putString( "pyBadgeFormat","");actionPage2.putString( "pyDeferLoad","");actionPage2.putString( "pyImage","");actionPage2.putString("pyType","Action");
executePage=actionPage2.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage2 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","addRow");ClipboardPage commandPage2 = tools.createPage("Embed-SelectedContextAPI-AddRow","commandType");
commandPage2.putString("pyPosition","AFTER");commandPage2.putString("pyRepeatCustomTemplateName","");commandPage2.putString("pyRepeatPageListProperty","");commandPage2.putString("pyEditFlowAction","");commandPage2.putString("pyRepeatOverrideTemplate","");commandPage2.putString("pyRepeatSourceType","");commandPage2.putString("pyRepeatLayoutType","");commandPage2.putString("pyRowPromptClass","");commandPage2.putString("pyRepeatDPName","");executePage.putPage("pyAddRow",commandPage2);
behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
executePage.putString("pyCommand","addRow");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage2);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method3_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1304536657904000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1304536657904000")){
return;}
if(processShortcut &&"ID1304536657904000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pzActionCanHaveChildSteps";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage3.putString("pyHidden",String.valueOf(hideElement));actionPage3.putString("pyDisabled",String.valueOf(disableElement));actionPage3.putString( "pyName","ID1304536657904000");actionPage3.putString( "pyCaption","Add Child");actionPage3.putString( "pySummary","");actionPage3.putString( "pyBadgeProperty","");actionPage3.putString( "pyToolTip","");actionPage3.putString( "pyBadgeFormat","");actionPage3.putString( "pyDeferLoad","");actionPage3.putString( "pyImage","");if (!hideElement) { 
actionPage3.putString("pyType","Action");
executePage=actionPage3.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage3 = actionPage3.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","addChild");ClipboardPage commandPage3 = tools.createPage("Embed-SelectedContextAPI-AddChild","commandType");
executePage.putPage("pyAddChild",commandPage3);
behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage3.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
executePage.putString("pyCommand","addChild");
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
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"pzDefinitionMenu" */

private void method4_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1371218373542000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1371218373542000")){
return;}
if(processShortcut &&"ID1371218373542000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage4.putString("pyHidden",String.valueOf(hideElement));actionPage4.putString("pyDisabled",String.valueOf(disableElement));actionPage4.putString( "pyName","ID1371218373542000");actionPage4.putString( "pyCaption","------------------");actionPage4.putString( "pySummary","");actionPage4.putString( "pyBadgeProperty","");actionPage4.putString( "pyToolTip","");actionPage4.putString( "pyBadgeFormat","");actionPage4.putString( "pyDeferLoad","");actionPage4.putString( "pyImage","");actionPage4.putString("pyType","Separator");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method5_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1304536657905000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1304536657905000")){
return;}
if(processShortcut &&"ID1304536657905000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pzActionCannotHaveChildSteps";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage5.putString("pyHidden",String.valueOf(hideElement));actionPage5.putString("pyDisabled",String.valueOf(disableElement));actionPage5.putString( "pyName","ID1304536657905000");actionPage5.putString( "pyCaption","Cut");actionPage5.putString( "pySummary","");actionPage5.putString( "pyBadgeProperty","");actionPage5.putString( "pyToolTip","Copy and delete current row");actionPage5.putString( "pyBadgeFormat","");actionPage5.putString( "pyDeferLoad","");actionPage5.putString( "pyImage","");if (!hideElement) { 
actionPage5.putString("pyType","Action");
executePage=actionPage5.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage5 = actionPage5.getPage("pyBehaviors(<append>)");
behaviorPage5.putString("pyAction","openLocalAction");ClipboardPage commandPage5 = tools.createPage("Embed-SelectedContextAPI-ContextLocalAction","commandType");
commandPage5.putString("pyLocalAction","pzCutAction");commandPage5.putString("pyNoThreadProcessing","");commandPage5.putString("pyCustomTemplateName","");commandPage5.putString("pyOverrideTemplate","false");executePage.putPage("pyContextLocalAction",commandPage5);
behaviorPage5.putPage("pyActionAPI",commandPage5);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage5.getPage("pyBehaviors(<LAST>)")).register();
commandPage5.removeFromClipboard();
executePage.putString("pyCommand","openLocalAction");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method6_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1304536657905001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1304536657905001")){
return;}
if(processShortcut &&"ID1304536657905001".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pzActionCanHaveChildSteps";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage6.putString("pyHidden",String.valueOf(hideElement));actionPage6.putString("pyDisabled",String.valueOf(disableElement));actionPage6.putString( "pyName","ID1304536657905001");actionPage6.putString( "pyCaption","Cut");actionPage6.putString( "pySummary","");actionPage6.putString( "pyBadgeProperty","");actionPage6.putString( "pyToolTip","Copy and delete current row and all nested rows");actionPage6.putString( "pyBadgeFormat","");actionPage6.putString( "pyDeferLoad","");actionPage6.putString( "pyImage","");if (!hideElement) { 
actionPage6.putString("pyType","Action");
executePage=actionPage6.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage6 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage6.putString("pyAction","openLocalAction");ClipboardPage commandPage6 = tools.createPage("Embed-SelectedContextAPI-ContextLocalAction","commandType");
commandPage6.putString("pyLocalAction","pzCutActionWarning");commandPage6.putString("pyNoThreadProcessing","");commandPage6.putString("pyCustomTemplateName","");commandPage6.putString("pyOverrideTemplate","false");executePage.putPage("pyContextLocalAction",commandPage6);
behaviorPage6.putPage("pyActionAPI",commandPage6);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage6.removeFromClipboard();
executePage.putString("pyCommand","openLocalAction");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method7_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1304536657905002".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1304536657905002")){
return;}
if(processShortcut &&"ID1304536657905002".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage7.putString("pyHidden",String.valueOf(hideElement));actionPage7.putString("pyDisabled",String.valueOf(disableElement));actionPage7.putString( "pyName","ID1304536657905002");actionPage7.putString( "pyCaption","Copy");actionPage7.putString( "pySummary","");actionPage7.putString( "pyBadgeProperty","");actionPage7.putString( "pyToolTip","Copy selected row and all nested rows");actionPage7.putString( "pyBadgeFormat","");actionPage7.putString( "pyDeferLoad","");actionPage7.putString( "pyImage","");actionPage7.putString("pyType","Action");
executePage=actionPage7.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage7 = actionPage7.getPage("pyBehaviors(<append>)");
behaviorPage7.putString("pyAction","openLocalAction");ClipboardPage commandPage7 = tools.createPage("Embed-SelectedContextAPI-ContextLocalAction","commandType");
commandPage7.putString("pyLocalAction","pzCopyAction");commandPage7.putString("pyNoThreadProcessing","");commandPage7.putString("pyCustomTemplateName","");commandPage7.putString("pyOverrideTemplate","false");executePage.putPage("pyContextLocalAction",commandPage7);
behaviorPage7.putPage("pyActionAPI",commandPage7);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage7.getPage("pyBehaviors(<LAST>)")).register();
commandPage7.removeFromClipboard();
executePage.putString("pyCommand","openLocalAction");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method8_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1305221210783000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage8";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1305221210783000")){
return;}
if(processShortcut &&"ID1305221210783000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage8 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage8 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
enableWhenCondition = true;
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzPageIsCopied",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
actionPage8.putString("pyHidden",String.valueOf(hideElement));actionPage8.putString("pyDisabled",String.valueOf(disableElement));actionPage8.putString( "pyName","ID1305221210783000");actionPage8.putString( "pyCaption","Paste Above");actionPage8.putString( "pySummary","");actionPage8.putString( "pyBadgeProperty","");actionPage8.putString( "pyToolTip","");actionPage8.putString( "pyBadgeFormat","");actionPage8.putString( "pyDeferLoad","");actionPage8.putString( "pyImage","");actionPage8.putString("pyType","Action");
executePage=actionPage8.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage8 = actionPage8.getPage("pyBehaviors(<append>)");
behaviorPage8.putString("pyAction","openLocalAction");ClipboardPage commandPage8 = tools.createPage("Embed-SelectedContextAPI-ContextLocalAction","commandType");
commandPage8.putString("pyLocalAction","pzPasteActionInsertBefore");commandPage8.putString("pyNoThreadProcessing","");commandPage8.putString("pyCustomTemplateName","");commandPage8.putString("pyOverrideTemplate","false");executePage.putPage("pyContextLocalAction",commandPage8);
behaviorPage8.putPage("pyActionAPI",commandPage8);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage8.getPage("pyBehaviors(<LAST>)")).register();
commandPage8.removeFromClipboard();
executePage.putString("pyCommand","openLocalAction");
if (!disableElement) { 
}
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage8);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method9_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1304536657905003".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1304536657905003")){
return;}
if(processShortcut &&"ID1304536657905003".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pzActionCanHaveChildSteps";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzPageIsCopied",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage9.putString("pyHidden",String.valueOf(hideElement));actionPage9.putString("pyDisabled",String.valueOf(disableElement));actionPage9.putString( "pyName","ID1304536657905003");actionPage9.putString( "pyCaption","Paste");actionPage9.putString( "pySummary","");actionPage9.putString( "pyBadgeProperty","");actionPage9.putString( "pyToolTip","");actionPage9.putString( "pyBadgeFormat","");actionPage9.putString( "pyDeferLoad","");actionPage9.putString( "pyImage","");if (!hideElement) { 
actionPage9.putString("pyType","Action");
executePage=actionPage9.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage9 = actionPage9.getPage("pyBehaviors(<append>)");
behaviorPage9.putString("pyAction","openLocalAction");ClipboardPage commandPage9 = tools.createPage("Embed-SelectedContextAPI-ContextLocalAction","commandType");
commandPage9.putString("pyLocalAction","pzPasteActionWarning");commandPage9.putString("pyNoThreadProcessing","");commandPage9.putString("pyCustomTemplateName","");commandPage9.putString("pyOverrideTemplate","false");executePage.putPage("pyContextLocalAction",commandPage9);
behaviorPage9.putPage("pyActionAPI",commandPage9);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage9.getPage("pyBehaviors(<LAST>)")).register();
commandPage9.removeFromClipboard();
executePage.putString("pyCommand","openLocalAction");
if (!disableElement) { 
}
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method10_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1304536657905004".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1304536657905004")){
return;}
if(processShortcut &&"ID1304536657905004".equals(nodePathArr[0]) && !isNodePathEmpty){
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
showWhenCondition = true;
String whenResolved ="pzActionCannotHaveChildSteps";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzPageIsCopied",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage10.putString("pyHidden",String.valueOf(hideElement));actionPage10.putString("pyDisabled",String.valueOf(disableElement));actionPage10.putString( "pyName","ID1304536657905004");actionPage10.putString( "pyCaption","Paste");actionPage10.putString( "pySummary","");actionPage10.putString( "pyBadgeProperty","");actionPage10.putString( "pyToolTip","");actionPage10.putString( "pyBadgeFormat","");actionPage10.putString( "pyDeferLoad","");actionPage10.putString( "pyImage","");if (!hideElement) { 
actionPage10.putString("pyType","Action");
executePage=actionPage10.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage10 = actionPage10.getPage("pyBehaviors(<append>)");
behaviorPage10.putString("pyAction","openLocalAction");ClipboardPage commandPage10 = tools.createPage("Embed-SelectedContextAPI-ContextLocalAction","commandType");
commandPage10.putString("pyLocalAction","pzPasteAction");commandPage10.putString("pyNoThreadProcessing","");commandPage10.putString("pyCustomTemplateName","");commandPage10.putString("pyOverrideTemplate","false");executePage.putPage("pyContextLocalAction",commandPage10);
behaviorPage10.putPage("pyActionAPI",commandPage10);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage10.getPage("pyBehaviors(<LAST>)")).register();
commandPage10.removeFromClipboard();
executePage.putString("pyCommand","openLocalAction");
if (!disableElement) { 
}
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage10);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method11_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1305221210783001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1305221210783001")){
return;}
if(processShortcut &&"ID1305221210783001".equals(nodePathArr[0]) && !isNodePathEmpty){
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
enableWhenCondition = true;
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzPageIsCopied",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
actionPage11.putString("pyHidden",String.valueOf(hideElement));actionPage11.putString("pyDisabled",String.valueOf(disableElement));actionPage11.putString( "pyName","ID1305221210783001");actionPage11.putString( "pyCaption","Paste Below");actionPage11.putString( "pySummary","");actionPage11.putString( "pyBadgeProperty","");actionPage11.putString( "pyToolTip","");actionPage11.putString( "pyBadgeFormat","");actionPage11.putString( "pyDeferLoad","");actionPage11.putString( "pyImage","");actionPage11.putString("pyType","Action");
executePage=actionPage11.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage11 = actionPage11.getPage("pyBehaviors(<append>)");
behaviorPage11.putString("pyAction","openLocalAction");ClipboardPage commandPage11 = tools.createPage("Embed-SelectedContextAPI-ContextLocalAction","commandType");
commandPage11.putString("pyLocalAction","pzPasteActionInsertAfter");commandPage11.putString("pyNoThreadProcessing","");commandPage11.putString("pyCustomTemplateName","");commandPage11.putString("pyOverrideTemplate","false");executePage.putPage("pyContextLocalAction",commandPage11);
behaviorPage11.putPage("pyActionAPI",commandPage11);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage11.getPage("pyBehaviors(<LAST>)")).register();
commandPage11.removeFromClipboard();
executePage.putString("pyCommand","openLocalAction");
if (!disableElement) { 
}
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage11);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"pzDefinitionMenu" */

private void method12_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1371218373542001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1371218373542001")){
return;}
if(processShortcut &&"ID1371218373542001".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage12.putString("pyHidden",String.valueOf(hideElement));actionPage12.putString("pyDisabled",String.valueOf(disableElement));actionPage12.putString( "pyName","ID1371218373542001");actionPage12.putString( "pyCaption","------------------");actionPage12.putString( "pySummary","");actionPage12.putString( "pyBadgeProperty","");actionPage12.putString( "pyToolTip","");actionPage12.putString( "pyBadgeFormat","");actionPage12.putString( "pyDeferLoad","");actionPage12.putString( "pyImage","");actionPage12.putString("pyType","Separator");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method13_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1303152097007000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage13";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1303152097007000")){
return;}
if(processShortcut &&"ID1303152097007000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage13= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage13 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage13 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzIsParentEnabled";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzIsRowDisabled",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage13.putString("pyHidden",String.valueOf(hideElement));actionPage13.putString("pyDisabled",String.valueOf(disableElement));actionPage13.putString( "pyName","ID1303152097007000");actionPage13.putString( "pyCaption","Enable");actionPage13.putString( "pySummary","");actionPage13.putString( "pyBadgeProperty","");actionPage13.putString( "pyToolTip","Enable this row");actionPage13.putString( "pyBadgeFormat","");actionPage13.putString( "pyDeferLoad","");actionPage13.putString( "pyImage","");if (!hideElement) { 
actionPage13.putString("pyType","Action");
executePage=actionPage13.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage13 = actionPage13.getPage("pyBehaviors(<append>)");
behaviorPage13.putString("pyAction","openLocalAction");ClipboardPage commandPage13 = tools.createPage("Embed-SelectedContextAPI-ContextLocalAction","commandType");
commandPage13.putString("pyLocalAction","pzEnableModelRow");commandPage13.putString("pyNoThreadProcessing","");commandPage13.putString("pyCustomTemplateName","");commandPage13.putString("pyOverrideTemplate","false");executePage.putPage("pyContextLocalAction",commandPage13);
behaviorPage13.putPage("pyActionAPI",commandPage13);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage13.getPage("pyBehaviors(<LAST>)")).register();
commandPage13.removeFromClipboard();
executePage.putString("pyCommand","openLocalAction");
if (!disableElement) { 
}
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage13);
if(nodePathValidated==false){
}
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method14_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1303413893084000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1303413893084000")){
return;}
if(processShortcut &&"ID1303413893084000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pzIsParentDisabled";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("Never",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage14.putString("pyHidden",String.valueOf(hideElement));actionPage14.putString("pyDisabled",String.valueOf(disableElement));actionPage14.putString( "pyName","ID1303413893084000");actionPage14.putString( "pyCaption","Enable");actionPage14.putString( "pySummary","");actionPage14.putString( "pyBadgeProperty","");actionPage14.putString( "pyToolTip","Parent is disabled");actionPage14.putString( "pyBadgeFormat","");actionPage14.putString( "pyDeferLoad","");actionPage14.putString( "pyImage","");if (!hideElement) { 
actionPage14.putString("pyType","Action");
executePage=actionPage14.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyContextAPI","true");
executePage.putString("pyCommand","__empty__");
if (!disableElement) { 
}
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method15_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1303152097025000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1303152097025000")){
return;}
if(processShortcut &&"ID1303152097025000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
enableWhenCondition = true;
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzIsRowEnabled",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
actionPage15.putString("pyHidden",String.valueOf(hideElement));actionPage15.putString("pyDisabled",String.valueOf(disableElement));actionPage15.putString( "pyName","ID1303152097025000");actionPage15.putString( "pyCaption","Disable");actionPage15.putString( "pySummary","");actionPage15.putString( "pyBadgeProperty","");actionPage15.putString( "pyToolTip","Disable the Row");actionPage15.putString( "pyBadgeFormat","");actionPage15.putString( "pyDeferLoad","");actionPage15.putString( "pyImage","");actionPage15.putString("pyType","Action");
executePage=actionPage15.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage15 = actionPage15.getPage("pyBehaviors(<append>)");
behaviorPage15.putString("pyAction","localAction");ClipboardPage commandPage15 = tools.createPage("Embed-DesktopAPI-OpenModalWindow","commandType");

StringMap commandPage15Map = new HashStringMap();
commandPage15Map.putString("pxObjClass", "Rule-Obj-FlowAction");
commandPage15Map.putString("pyActionName","pzDisableModelRow");
commandPage15Map.putString("pyClassName",tools.getProperty("pxObjClass").getStringValue());
ParameterPage commandPage15ParamPage = new ParameterPage();
commandPage15ParamPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
try{
tools.doAction(commandPage15Map, tools.getStepPage(), commandPage15ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
String commandPage15Type = commandPage15ParamPage.getString("StreamType"); commandPage15ParamPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
try{
tools.doAction(commandPage15Map, tools.getStepPage(), commandPage15ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
String bcommandPage15HasPrivilege = commandPage15ParamPage.getString("CheckSecurityRetVal"); commandPage15ParamPage.putString("pyFlowActionPurpose", "GETLABEL");
try{
tools.doAction(commandPage15Map, tools.getStepPage(), commandPage15ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
ClipboardPage commandPage15targetAnimation = tools.createPage("","");
 commandPage15targetAnimation.putString("pyLaunch","anim-null");
 commandPage15targetAnimation.putString("pyDismiss","anim-null");
ClipboardPage commandPage15newTargetAnimation = tools.createPage("","");
 commandPage15newTargetAnimation.putString("pyValue","%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D");
String commandPage15FALabel= commandPage15ParamPage.getString("pzFALabel");
 if(commandPage15Type.equals("")) {commandPage15Type = "Rule-Obj-FlowAction";}if("true".equals(bcommandPage15HasPrivilege )){
commandPage15.putString("pyLocalAction", "pzDisableModelRow");}else {
commandPage15.putString("pyLocalAction", "pyLocalActionPrivilegeError");
commandPage15.putString("pyActionPrivilegeError",tools.getLocalizedTextForString("pyMessageLabel","pzFlowActionAuthorization"));} 
commandPage15.putString("pyStreamType", commandPage15Type);
commandPage15.putString("pyFALabel", commandPage15FALabel);
commandPage15.putString("pyClassName", commandPage15Map.getString("pyClassName"));
commandPage15.putString("pyUsingPage","");
commandPage15.putString("pyModalDialog","");
commandPage15.putString("pyLATarget","true");
commandPage15.putString("pyModalFullScreen","true");
commandPage15.putPage("pyAnimations(DesktopReveal)",commandPage15newTargetAnimation);
commandPage15.putString("pyFormatStyle","");
commandPage15.putString("pyCustomTemplateName","");
commandPage15.putString("pyDisableOverlayClickAway","false");
commandPage15.putString("pyShowOverlayInCenter","false");executePage.putPage("pyOpenModalWindow",commandPage15);
behaviorPage15.putPage("pyActionAPI",commandPage15);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage15.getPage("pyBehaviors(<LAST>)")).register();
commandPage15.removeFromClipboard();
executePage.putString("pyCommand","localAction");
if (!disableElement) { 
}
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method16_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1304536657905005".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1304536657905005")){
return;}
if(processShortcut &&"ID1304536657905005".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pzActionCannotHaveChildSteps";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage16.putString("pyHidden",String.valueOf(hideElement));actionPage16.putString("pyDisabled",String.valueOf(disableElement));actionPage16.putString( "pyName","ID1304536657905005");actionPage16.putString( "pyCaption","Delete");actionPage16.putString( "pySummary","");actionPage16.putString( "pyBadgeProperty","");actionPage16.putString( "pyToolTip","Delete row and all nested rows");actionPage16.putString( "pyBadgeFormat","");actionPage16.putString( "pyDeferLoad","");actionPage16.putString( "pyImage","");if (!hideElement) { 
actionPage16.putString("pyType","Action");
executePage=actionPage16.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage16 = actionPage16.getPage("pyBehaviors(<append>)");
behaviorPage16.putString("pyAction","openLocalAction");ClipboardPage commandPage16 = tools.createPage("Embed-SelectedContextAPI-ContextLocalAction","commandType");
commandPage16.putString("pyLocalAction","pzDeleteAction");commandPage16.putString("pyNoThreadProcessing","");commandPage16.putString("pyCustomTemplateName","");commandPage16.putString("pyOverrideTemplate","false");executePage.putPage("pyContextLocalAction",commandPage16);
behaviorPage16.putPage("pyActionAPI",commandPage16);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage16.getPage("pyBehaviors(<LAST>)")).register();
commandPage16.removeFromClipboard();
executePage.putString("pyCommand","openLocalAction");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzDefinitionMenu" */

private void method17_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1304536657905006".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1304536657905006")){
return;}
if(processShortcut &&"ID1304536657905006".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="pzActionCanHaveChildSteps";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage17.putString("pyHidden",String.valueOf(hideElement));actionPage17.putString("pyDisabled",String.valueOf(disableElement));actionPage17.putString( "pyName","ID1304536657905006");actionPage17.putString( "pyCaption","Delete");actionPage17.putString( "pySummary","");actionPage17.putString( "pyBadgeProperty","");actionPage17.putString( "pyToolTip","Delete row and all nested rows");actionPage17.putString( "pyBadgeFormat","");actionPage17.putString( "pyDeferLoad","");actionPage17.putString( "pyImage","");if (!hideElement) { 
actionPage17.putString("pyType","Action");
executePage=actionPage17.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","true");
executePage.putString("pyContextAPI","true");
ClipboardPage behaviorPage17 = actionPage17.getPage("pyBehaviors(<append>)");
behaviorPage17.putString("pyAction","openLocalAction");ClipboardPage commandPage17 = tools.createPage("Embed-SelectedContextAPI-ContextLocalAction","commandType");
commandPage17.putString("pyLocalAction","pzDeleteActionWarning");commandPage17.putString("pyNoThreadProcessing","");commandPage17.putString("pyCustomTemplateName","");commandPage17.putString("pyOverrideTemplate","false");executePage.putPage("pyContextLocalAction",commandPage17);
behaviorPage17.putPage("pyActionAPI",commandPage17);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage17.getPage("pyBehaviors(<LAST>)")).register();
commandPage17.removeFromClipboard();
executePage.putString("pyCommand","openLocalAction");
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
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION EMBED-MODELPARAMS PZDEFINITIONMENU #20180713T135317.067 GMT", "Embed-ModelParams pzDefinitionMenu", "Pega-Desktop", "08-01-01", "20180713T135317.067 GMT");
}
