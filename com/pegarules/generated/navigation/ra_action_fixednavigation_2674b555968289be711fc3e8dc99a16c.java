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
public class ra_action_fixednavigation_2674b555968289be711fc3e8dc99a16c  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.FixedNavigation.Data_Portal.Action");
	public ra_action_fixednavigation_2674b555968289be711fc3e8dc99a16c(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION DATA-PORTAL FIXEDNAVIGATION #20210506T204031.277 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(true){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "FixedNavigation"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("FixedNavigation");
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
method8_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
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
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSRUNACTIVITY", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:FIXEDNAVIGATION"
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
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSRUNACTIVITY","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSRUNACTIVITY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("FIXEDNAVIGATION","Rule-Navigation","DATA-PORTAL",false,"","Theme-Cosmos","04-01-01","RULE-NAVIGATION DATA-PORTAL FIXEDNAVIGATION #20210506T204031.277 GMT","!FIXEDNAVIGATION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",546999188)
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
//	RULE-NAVIGATION DATA-PORTAL FIXEDNAVIGATION #20210506T204031.277 GMT:20210506T204031.277 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT:20190206T111749.102 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT:20180713T133341.500 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT:20220316T072348.123 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUE #20180713T133341.510 GMT:20180713T133341.510 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUEENCODED #20180713T133341.517 GMT:20180713T133341.517 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUEFORCUSTOM #20180713T133341.521 GMT:20180713T133341.521 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZADDREFERENCEVALUELOCALIZED #20180713T133341.527 GMT:20180713T133341.527 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZGETRUNTIMEPAGEREFERENCE #20180713T133341.536 GMT:20180713T133341.536 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZISREFERENCEFORCUSTOM #20180713T133341.542 GMT:20180713T133341.542 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESS--(STRING,STRING,CLIPBO23CEBAD98543B5A3EAFA23BE1E9907F7 #20180713T133342.835 GMT:20180713T133342.835 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19 #20230618T001619.186 GMT:20230618T001619.186 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONINNER--(FIRSTUSEA4574746F7C70774C55B41C005EC01EE7 #20190928T111813.415 GMT:20190928T145202.738 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCONTEXTREFRESH #20180713T133341.611 GMT:20180713T133341.611 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCUSTOM #20180713T133341.621 GMT:20180713T133341.621 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSRUNACTIVITY #20180713T133342.796 GMT:20180713T133342.796 GMT
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
		return "efcd0d0d493659bfa3a247f0440f9561";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"FixedNavigation" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1549014905651000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1549014905651000")){
return;}
if(processShortcut &&"ID1549014905651000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","ID1549014905651000");actionPage1.putString( "pyImageSource","styleclass");actionPage1.putString( "pyIconStyle","pi pi-bell-solid");actionPage1.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Notifications"));actionPage1.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage1.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage1.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage1.putString( "pyAutomationID","20190128163309085525808");}actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","false");actionPage1.putString( "pyImage","pi pi-bell-solid");actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage1 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage1.putString("pyAction","runActivity");ClipboardPage commandPage1 = tools.createPage("Embed-SelectedContextAPI-RunActivity","commandType");
commandPage1.putString( "pyActivity","pzInvalidateNotificationsForOperator");commandPage1.putString( "pyUsingPage", tools.getStepPage().getReference());propertyValue = "OperatorID.pyUserIdentifier";
commandPage1.getProperty("pyActivityParameters").getPageValue(1).putString("pyValue",java.net.URLEncoder.encode(tools.getProperty(propertyValue).getStringValue()));commandPage1.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","recipientOperatorID");commandPage1.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage1.getProperty("pyActivityParameters").getPageValue(2).putString( "pyValue","Default");commandPage1.getProperty("pyActivityParameters").getPageValue(2).putString( "pyName","pyCategoryList");commandPage1.getProperty("pyActivityParameters").getPageValue(2).putString( "pxObjClass","Embed-NameValuePair");commandPage1.getProperty("pyActivityParameters").getPageValue(3).putString( "pyValue","");commandPage1.getProperty("pyActivityParameters").getPageValue(3).putString( "pyName","pyNotificationHeading");commandPage1.getProperty("pyActivityParameters").getPageValue(3).putString( "pxObjClass","Embed-NameValuePair");executePage.putPage("pyRunActivity",commandPage1);
behaviorPage1.putPage("pyActionAPI",commandPage1);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage1.removeFromClipboard();
ClipboardPage behaviorPage2 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","refresh");ClipboardPage commandPage2 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage2.putString( "pyTarget","otherSection");commandPage2.putString( "pyUsingPage","");commandPage2.putString( "pyActivity","");commandPage2.putString( "pySection","pyDisplayNotificationGadgetDetails");commandPage2.putString( "pyDisableSubmit","false");commandPage2.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage2.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage2.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage2.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage2.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage2.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
ClipboardPage behaviorPage3 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","runScript");ClipboardPage commandPage3 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage3.getProperty("pyParameters").getPageValue(1).putString( "pyValue","javascript:event");commandPage3.getProperty("pyParameters").getPageValue(1).putString( "pyName","event");commandPage3.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pyDisplayNotificationGadgetDetails");commandPage3.getProperty("pyParameters").getPageValue(2).putString( "pyName","sectionName");commandPage3.putString( "pyFunctionName","pega.desktop.infinity.changeRibbonContent");behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
ClipboardPage behaviorPage4 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","runActivity");ClipboardPage commandPage4 = tools.createPage("Embed-SelectedContextAPI-RunActivity","commandType");
commandPage4.putString( "pyActivity","pzQueueForNotificationReadStatus");commandPage4.putString( "pyUsingPage", tools.getStepPage().getReference());propertyValue = "OperatorID.pyUserIdentifier";
commandPage4.getProperty("pyActivityParameters").getPageValue(1).putString("pyValue",java.net.URLEncoder.encode(tools.getProperty(propertyValue).getStringValue()));commandPage4.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","recipientOperatorID");commandPage4.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage4.getProperty("pyActivityParameters").getPageValue(2).putString( "pyValue","Default");commandPage4.getProperty("pyActivityParameters").getPageValue(2).putString( "pyName","pyCategoryList");commandPage4.getProperty("pyActivityParameters").getPageValue(2).putString( "pxObjClass","Embed-NameValuePair");behaviorPage4.putPage("pyActionAPI",commandPage4);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage4.removeFromClipboard();
ClipboardPage behaviorPage5 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage5.putString("pyAction","refresh");ClipboardPage commandPage5 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage5.putString( "pyTarget","otherSection");commandPage5.putString( "pyUsingPage","");commandPage5.putString( "pyActivity","");commandPage5.putString( "pySection","pzNotificationGadget");commandPage5.putString( "pyDisableSubmit","true");commandPage5.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage5.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage5.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage5.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage5.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage5.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");behaviorPage5.putPage("pyActionAPI",commandPage5);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage5.removeFromClipboard();
executePage.putString("pyCommand","runActivity");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"FixedNavigation" */

private void method6_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1549014905651001".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1549014905651001")){
return;}
if(processShortcut &&"ID1549014905651001".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage6.putString("pyHidden",String.valueOf(hideElement));actionPage6.putString("pyDisabled",String.valueOf(disableElement));actionPage6.putString( "pyName","ID1549014905651001");actionPage6.putString( "pyImageSource","styleclass");actionPage6.putString( "pyIconStyle","pi pi-history-solid");actionPage6.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Recents"));actionPage6.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage6.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage6.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage6.putString( "pyAutomationID","20190128153409038839106");}actionPage6.putString( "pyBadgeFormat","Standard (label)");actionPage6.putString( "pyDeferLoad","false");actionPage6.putString( "pyImage","pi pi-history-solid");actionPage6.putString("pyType","Action");
executePage=actionPage6.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage6 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage6.putString("pyAction","refresh");ClipboardPage commandPage6 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage6.putString( "pyTarget","otherSection");commandPage6.putString( "pyUsingPage","");commandPage6.putString( "pyActivity","");commandPage6.putString( "pySection","pyDisplayRecents");commandPage6.putString( "pyDisableSubmit","false");commandPage6.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage6.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage6.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage6.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage6.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage6.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");executePage.putPage("pyRefresh",commandPage6);
behaviorPage6.putPage("pyActionAPI",commandPage6);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage6.removeFromClipboard();
ClipboardPage behaviorPage7 = actionPage6.getPage("pyBehaviors(<append>)");
behaviorPage7.putString("pyAction","runScript");ClipboardPage commandPage7 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage7.getProperty("pyParameters").getPageValue(1).putString( "pyValue","javascript:event");commandPage7.getProperty("pyParameters").getPageValue(1).putString( "pyName","event");commandPage7.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pyDisplayRecents");commandPage7.getProperty("pyParameters").getPageValue(2).putString( "pyName","sectionName");commandPage7.putString( "pyFunctionName","pega.desktop.infinity.changeRibbonContent");behaviorPage7.putPage("pyActionAPI",commandPage7);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage6.getPage("pyBehaviors(<LAST>)")).register();
commandPage7.removeFromClipboard();
executePage.putString("pyCommand","refresh");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage6);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"FixedNavigation" */

private void method8_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1560497191585000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1560497191585000")){
return;}
if(processShortcut &&"ID1560497191585000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage8.putString("pyHidden",String.valueOf(hideElement));actionPage8.putString("pyDisabled",String.valueOf(disableElement));actionPage8.putString( "pyName","ID1560497191585000");actionPage8.putString( "pyImageSource","styleclass");actionPage8.putString( "pyIconStyle","pi pi-dot-9-solid");actionPage8.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "My applications"));actionPage8.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage8.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage8.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", "My applications"));if(testIDWhen || functionalTestingWhen){actionPage8.putString( "pyAutomationID","201906140326310579553");}actionPage8.putString( "pyBadgeFormat","Standard (label)");actionPage8.putString( "pyDeferLoad","false");actionPage8.putString( "pyImage","pi pi-dot-9-solid");actionPage8.putString("pyType","Action");
executePage=actionPage8.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage8 = actionPage8.getPage("pyBehaviors(<append>)");
behaviorPage8.putString("pyAction","refresh");ClipboardPage commandPage8 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage8.putString( "pyTarget","otherSection");commandPage8.putString( "pyUsingPage","");commandPage8.putString( "pyActivity","");commandPage8.putString( "pySection","pzMyApps");commandPage8.putString( "pyDisableSubmit","false");commandPage8.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage8.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage8.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage8.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage8.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage8.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");executePage.putPage("pyRefresh",commandPage8);
behaviorPage8.putPage("pyActionAPI",commandPage8);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage8.getPage("pyBehaviors(<LAST>)")).register();
commandPage8.removeFromClipboard();
ClipboardPage behaviorPage9 = actionPage8.getPage("pyBehaviors(<append>)");
behaviorPage9.putString("pyAction","runScript");ClipboardPage commandPage9 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage9.getProperty("pyParameters").getPageValue(1).putString( "pyValue","javascript:event");commandPage9.getProperty("pyParameters").getPageValue(1).putString( "pyName","event");commandPage9.getProperty("pyParameters").getPageValue(2).putString( "pyValue","pyAppLauncher");commandPage9.getProperty("pyParameters").getPageValue(2).putString( "pyName","sectionName");commandPage9.putString( "pyFunctionName","pega.desktop.infinity.changeRibbonContent");behaviorPage9.putPage("pyActionAPI",commandPage9);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage8.getPage("pyBehaviors(<LAST>)")).register();
commandPage9.removeFromClipboard();
executePage.putString("pyCommand","refresh");
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
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION DATA-PORTAL FIXEDNAVIGATION #20210506T204031.277 GMT", "Data-Portal FixedNavigation", "Theme-Cosmos", "04-01-01", "20210506T204031.277 GMT");
}
