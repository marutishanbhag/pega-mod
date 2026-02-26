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
public class ra_action_pzruleformtoolbarmenu_099aff6d40cf726cdf4a1fa8c946d9c5  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzRuleFormToolbarMenu.Rule_Application.Action");
	public ra_action_pzruleformtoolbarmenu_099aff6d40cf726cdf4a1fa8c946d9c5(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION RULE-APPLICATION PZRULEFORMTOOLBARMENU #20190710T105703.062 GMT	Pega-Desktop:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(true){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "Ruleform Toolbar Menu"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("Ruleform Toolbar Menu");
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
method5_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method6_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method7_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method8_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method9_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
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
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCHILDELEMENTS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PZRULEFORMTOOLBARMENU"
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
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCHILDELEMENTS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCHILDELEMENTS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZRULEFORMTOOLBARMENU","Rule-Navigation","RULE-APPLICATION",false,"","Pega-Desktop","08-04-01","RULE-NAVIGATION RULE-APPLICATION PZRULEFORMTOOLBARMENU #20190710T105703.062 GMT","!PZRULEFORMTOOLBARMENU",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-190950552)
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
//	RULE-NAVIGATION RULE-APPLICATION PZRULEFORMTOOLBARMENU #20190710T105703.062 GMT:20190717T133325.765 GMT

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
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCHILDELEMENTS--(CLIPBOABE009C16A86AE05EC07E24EF860BEDEA #20180713T133341.590 GMT:20180713T133341.590 GMT
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
		return "7c3de92521c8757d691ee8e9f1cf713c";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Application";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"Ruleform Toolbar Menu" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
if(processShortcut &&"".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Application","pzRuleFormToolbarActionsMenu",commonPrefix,uniqueSuffix,outputPage,tools, tools.getParamValue("PageName"),"true" ,null);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Ruleform Toolbar Menu" */

private void method2_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1562331117314000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1562331117314000")){
return;}
if(processShortcut &&"ID1562331117314000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage2.putString("pyHidden",String.valueOf(hideElement));actionPage2.putString("pyDisabled",String.valueOf(disableElement));actionPage2.putString( "pyName","ID1562331117314000");actionPage2.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Copy application URL"));actionPage2.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage2.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage2.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage2.putString( "pyAutomationID","201907050851570279495");}actionPage2.putString( "pyBadgeFormat","Standard (label)");actionPage2.putString( "pyDeferLoad","false");actionPage2.putString( "pyImage","");actionPage2.putString("pyType","Action");
executePage=actionPage2.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage2 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","runScript");ClipboardPage commandPage2 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
propertyValue = ".pxApplicationURL";
propertyValue = tools.getParamValue("ApplyToPage")+".pxApplicationURL";commandPage2.getProperty("pyParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage2.getProperty("pyParameters").getPageValue(1).putString( "pyName","SimpleURLValue");commandPage2.putString( "pyFunctionName","CopyContentToClipboard");executePage.putPage("pyCustom",commandPage2);
behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
ClipboardPage behaviorPage3 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","runActivity");ClipboardPage commandPage3 = tools.createPage("Embed-SelectedContextAPI-RunActivity","commandType");
commandPage3.putString( "pyActivity","pxSetApplicationURLCopiedVisible");commandPage3.putString( "pyUsingPage", tools.getStepPage().getReference());commandPage3.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","true");commandPage3.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","Visible");commandPage3.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
ClipboardPage behaviorPage4 = actionPage2.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","refresh");ClipboardPage commandPage4 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage4.putString( "pyTarget","otherSection");commandPage4.putString( "pyUsingPage","");commandPage4.putString( "pyActivity","");commandPage4.putString( "pySection","RuleFormLayout");commandPage4.putString( "pyDisableSubmit","false");commandPage4.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage4.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage4.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage4.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage4.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage4.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");behaviorPage4.putPage("pyActionAPI",commandPage4);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage2.getPage("pyBehaviors(<LAST>)")).register();
commandPage4.removeFromClipboard();
executePage.putString("pyCommand","runScript");
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
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"Ruleform Toolbar Menu" */

private void method5_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
String whenResolved ="pzRuleFormToolbarShowViewXMLSeparator";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage5.putString("pyHidden",String.valueOf(hideElement));actionPage5.putString("pyDisabled",String.valueOf(disableElement));actionPage5.putString( "pyName","");actionPage5.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage5.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage5.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage5.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage5.putString( "pyBadgeFormat","");actionPage5.putString( "pyDeferLoad","");actionPage5.putString( "pyImage","");if (!hideElement) { 
actionPage5.putString("pyType","Separator");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"Ruleform Toolbar Menu" */

private void method6_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
if(processShortcut &&"".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Application","pzRuleFormToolbarViewMenu",commonPrefix,uniqueSuffix,outputPage,tools, tools.getParamValue("PageName"),"true" ,null);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"Ruleform Toolbar Menu" */

private void method7_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
String whenResolved ="pzReqNotFromLP";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage7.putString("pyHidden",String.valueOf(hideElement));actionPage7.putString("pyDisabled",String.valueOf(disableElement));actionPage7.putString( "pyName","");actionPage7.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage7.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage7.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage7.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage7.putString( "pyBadgeFormat","");actionPage7.putString( "pyDeferLoad","");actionPage7.putString( "pyImage","");if (!hideElement) { 
actionPage7.putString("pyType","Separator");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"Ruleform Toolbar Menu" */

private void method8_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
if(processShortcut &&"".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Application","pzRuleFormToolbarHelpMenu",commonPrefix,uniqueSuffix,outputPage,tools, tools.getParamValue("PageName"),"true" ,null);
tools.putParamValue("deferLoadPath", deferLoadPath);
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"Ruleform Toolbar Menu" */

private void method9_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
if(processShortcut &&"".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
showWhenCondition = pega_uiengine_pznavigation.evaluateWhen("pzShowNewMenu",tools.getStepPage().getClassName(),tools);
hideElement = !showWhenCondition;
if (!hideElement) { 
currentDeferPath="";
for(int i=deferIndex; i<deferPathArr.length; i++){
currentDeferPath = deferPathArr[i] + "/" + currentDeferPath;
}
tools.putParamValue("deferLoadPath", currentDeferPath);
pega_uiengine_pznavigation.pzProcessNavigationNode("Rule-Application","pzRuleFormToolbarCreate",commonPrefix,uniqueSuffix,outputPage,tools, tools.getParamValue("PageName"),"true" ,null);
tools.putParamValue("deferLoadPath", deferLoadPath);
}
}//end of if for pxProcessShortcut
}//end of method
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION RULE-APPLICATION PZRULEFORMTOOLBARMENU #20190710T105703.062 GMT", "Rule-Application pzRuleFormToolbarMenu", "Pega-Desktop", "08-04-01", "20190717T133325.765 GMT");
}
