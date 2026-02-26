package com.pegarules.generated.navigation;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
public class ra_action_pzprofilemenu_91920f2b8990bce49682c234e67cb1ba  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Navigation.pzProfileMenu.Data_Portal.Action");
	public ra_action_pzprofilemenu_91920f2b8990bce49682c234e67cb1ba(PegaAPI aContext) {
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
/* Instance RULE-NAVIGATION DATA-PORTAL PZPROFILEMENU #20200918T152125.360 GMT	Pega-Desktop:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
isDynamicFieldNameForMenu = !"false".equals(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine","pyIsDynamicFieldNameForMenu"));
stepPage = tools.getStepPage();
finalOutPutPageName = tools.getParamValue("PageName");
forceFullLoad = "true".equals(tools.getParamValue("forceFullLoad"));
if(!"true".equals(tools.getParamValue("isNewMenu")))forceFullLoad = true;
tools.putParamValue("ApplyToPage",stepPage.getReference());
ClipboardPage fOutputPage = null;if (StringUtils.isBlank(tools.getParamValue("deferPagePath")) && !tools.getParamValue("usingPageRef").equals("true")) {
	fOutputPage = tools.createPage("Rule-Navigation", finalOutPutPageName);
	if(true){
		fOutputPage.putString("pyLabel", tools.getLocalizedTextForString("pyLabel", "pzProfileMenu"));
	}else{
		fOutputPage.getProperty("pyLabel").setValue("pzProfileMenu");
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
method7_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method8_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method10_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method12_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method13_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method22_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method26_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
method27_circum0(null,processShortcut,processAction,nodePath,isNodePathEmpty,nodePathArr);
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
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODACCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODFINISH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENRULE", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCUSTOM", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSOPENRULEBYCLASSANDNAME", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODABSENT", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSRUNACTIVITY", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSACTIONLISTNODE", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODCALL", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESSCHILDELEMENTS", 
	"Rule-Utility-Function:NAVIGATIONFUA!PZPROCESS", 
	"Rule-Utility-Function:NAVIGATIONFUA!NAVIGATIONMETHODHEADER", 
	"Rule-Navigation:PZPROFILEMENU"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-NAVIGATION",true,"Rule-Navigation","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-NAVIGATION DOFUASSEMBLY #20190206T123921.146 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",865379769), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-03-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODBODY #20190131T111608.026 GMT","NAVIGATIONFUA!NAVIGATIONMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEFORCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUELOCALIZED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENMODALWINDOW",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODACCESS #20180713T133341.484 GMT","NAVIGATIONFUA!NAVIGATIONMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODFINISH #20180713T133341.500 GMT","NAVIGATIONFUA!NAVIGATIONMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENRULE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENRULE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCUSTOM","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCUSTOM",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSOPENRULEBYCLASSANDNAME","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSOPENRULEBYCLASSANDNAME",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODABSENT #20180713T133341.480 GMT","NAVIGATIONFUA!NAVIGATIONMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTION--(FIRSTUSEASSEMBFDBBA8DD87078D04D203F4BFD5C91A19",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCONTEXTREFRESH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSRUNACTIVITY","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSRUNACTIVITY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSACTIONLISTNODE","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSACTIONLISTNODE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODCALL #20180713T133341.496 GMT","NAVIGATIONFUA!NAVIGATIONMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZADDREFERENCEVALUEENCODED",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESSCHILDELEMENTS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESSCHILDELEMENTS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!PZPROCESS","Rule-Utility-Function","",false,"","","","","NAVIGATIONFUA!PZPROCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("NAVIGATIONFUA!NAVIGATIONMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-08-01","RULE-UTILITY-FUNCTION NAVIGATIONFUA NAVIGATIONMETHODHEADER #20220316T072348.123 GMT","NAVIGATIONFUA!NAVIGATIONMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZPROFILEMENU","Rule-Navigation","DATA-PORTAL",false,"","Pega-Desktop","08-06-01","RULE-NAVIGATION DATA-PORTAL PZPROFILEMENU #20200918T152125.360 GMT","!PZPROFILEMENU",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2026760328)
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
//	RULE-NAVIGATION DATA-PORTAL PZPROFILEMENU #20200918T152125.360 GMT:20200918T152125.360 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
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
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSACTIONLISTNODE--(FIRSTU2AC9705C05F7021E3ECC6D11477422D3 #20230618T001619.232 GMT:20230618T001619.232 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCHILDELEMENTS--(CLIPBOABE009C16A86AE05EC07E24EF860BEDEA #20180713T133341.590 GMT:20180713T133341.590 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCONTEXTREFRESH #20180713T133341.611 GMT:20180713T133341.611 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSCUSTOM #20180713T133341.621 GMT:20180713T133341.621 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENMODALWINDOW #20190423T162450.106 GMT:20190423T162450.106 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENRULE #20180713T133341.676 GMT:20180713T133341.676 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENRULEBYCLASSANDNAME #20180713T133342.756 GMT:20180713T133342.756 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSOPENURLINWINDOW--(CLIPB122B8D6918BE9A60C51EDE8C86A47243 #20181120T072650.970 GMT:20181120T072650.970 GMT
//	RULE-UTILITY-FUNCTION NAVIGATIONFUA PZPROCESSRUNACTIVITY #20180713T133342.796 GMT:20180713T133342.796 GMT
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
		return "eac81c6eebad73bc68e7dc7663317a80";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal";
	}
public String getAspect() {
return "Action";
}
/* Method generated for Top Level Node -"" for Navigation Rule :"pzProfileMenu" */

private void method1_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1402049966694000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1402049966694000")){
return;}
if(processShortcut &&"ID1402049966694000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage1.putString("pyHidden",String.valueOf(hideElement));actionPage1.putString("pyDisabled",String.valueOf(disableElement));actionPage1.putString( "pyName","ID1402049966694000");actionPage1.putString( "pyImageSource","styleclass");actionPage1.putString( "pyIconStyle","hotkey-operator-profile");actionPage1.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Profile"));actionPage1.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage1.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage1.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage1.putString( "pyAutomationID","201903180742390624456");}actionPage1.putString( "pyBadgeFormat","Standard (label)");actionPage1.putString( "pyDeferLoad","false");actionPage1.putString( "pyImage","hotkey-operator-profile");actionPage1.putString("pyType","Action");
executePage=actionPage1.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage1 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage1.putString("pyAction","openUrlInWindow");ClipboardPage commandPage1 = tools.createPage("Embed-DesktopAPI-OpenURLInWindow","commandType");
commandPage1.putString( "pyWindowName","OperatorProfile");commandPage1.putString( "pyOptions","height=600,width=831,top=200,left=300,location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=0");commandPage1.putString( "pyReplace","false");commandPage1.putString( "pyUseAlternateUrlBase","false");commandPage1.putString( "pyNoEncodingUrl","false");commandPage1.putString( "pyUrl",tools.findPage("pxThread").getString("pxReqURI"));commandPage1.getProperty(".pyPreDataTransform").getPageValue().putString("pyName","pzClearPWD");
commandPage1 .putString( "pyActivity", tools.getProperty(".pxObjClass").getStringValue() + ".ShowStream");
 commandPage1.getProperty("pyQueryString").getPageValue(1).putString( "pyValue","Operator-Profile-Full");commandPage1.getProperty("pyQueryString").getPageValue(1).putString( "pyName","pyTargetStream");String strPrimaryPageName = tools.getParamValue("pzPrimaryPageName");
if(strPrimaryPageName !=null && !"".equals(strPrimaryPageName) ) {
commandPage1.getProperty("pyQueryString").getPageValue(2).putString("pyValue",strPrimaryPageName);
commandPage1.getProperty("pyQueryString").getPageValue(2).putString("pyName","pzPrimaryPageName");
} else {
commandPage1.getProperty("pyQueryString").getPageValue(2).putString("pyValue", tools.getStepPage().getReference() );
commandPage1.getProperty("pyQueryString").getPageValue(2).putString("pyName","pzPrimaryPageName");
}
executePage.putPage("pyOpenUrlInWindow",commandPage1);
behaviorPage1.putPage("pyActionAPI",commandPage1);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage1.removeFromClipboard();
ClipboardPage behaviorPage2 = actionPage1.getPage("pyBehaviors(<append>)");
behaviorPage2.putString("pyAction","runScript");ClipboardPage commandPage2 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage2.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage2.putPage("pyActionAPI",commandPage2);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage1.getPage("pyBehaviors(<LAST>)")).register();
commandPage2.removeFromClipboard();
executePage.putString("pyCommand","openUrlInWindow");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzProfileMenu" */

private void method3_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1359658678845000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1359658678845000")){
return;}
if(processShortcut &&"ID1359658678845000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage3.putString("pyHidden",String.valueOf(hideElement));actionPage3.putString("pyDisabled",String.valueOf(disableElement));actionPage3.putString( "pyName","ID1359658678845000");actionPage3.putString( "pyImageSource","styleclass");actionPage3.putString( "pyIconStyle","hotkey-operator-prefs");actionPage3.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Preferences"));actionPage3.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage3.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage3.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage3.putString( "pyAutomationID","201903180742400165245");}actionPage3.putString( "pyBadgeFormat","Standard (label)");actionPage3.putString( "pyDeferLoad","false");actionPage3.putString( "pyImage","hotkey-operator-prefs");actionPage3.putString("pyType","Action");
executePage=actionPage3.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage3 = actionPage3.getPage("pyBehaviors(<append>)");
behaviorPage3.putString("pyAction","runActivity");ClipboardPage commandPage3 = tools.createPage("Embed-SelectedContextAPI-RunActivity","commandType");
commandPage3.putString( "pyActivity","pzCreatePage");commandPage3.putString( "pyUsingPage", tools.getStepPage().getReference());commandPage3.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","operatorPrefPage");commandPage3.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","pageName");commandPage3.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage3.getProperty("pyActivityParameters").getPageValue(2).putString( "pyValue","");commandPage3.getProperty("pyActivityParameters").getPageValue(2).putString( "pyName","dataTransform");commandPage3.getProperty("pyActivityParameters").getPageValue(2).putString( "pxObjClass","Embed-NameValuePair");commandPage3.getProperty("pyActivityParameters").getPageValue(3).putString( "pyValue","Data-Portal");commandPage3.getProperty("pyActivityParameters").getPageValue(3).putString( "pyName","newClass");commandPage3.getProperty("pyActivityParameters").getPageValue(3).putString( "pxObjClass","Embed-NameValuePair");executePage.putPage("pyRunActivity",commandPage3);
behaviorPage3.putPage("pyActionAPI",commandPage3);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage3.getPage("pyBehaviors(<LAST>)")).register();
commandPage3.removeFromClipboard();
ClipboardPage behaviorPage4 = actionPage3.getPage("pyBehaviors(<append>)");
behaviorPage4.putString("pyAction","localAction");ClipboardPage commandPage4 = tools.createPage("Embed-DesktopAPI-OpenModalWindow","commandType");

StringMap commandPage4Map = new HashStringMap();
commandPage4Map.putString("pxObjClass", "Rule-Obj-FlowAction");
commandPage4Map.putString("pyActionName","pzPreferences");
commandPage4Map.putString("pyClassName", "Data-Portal");
ParameterPage commandPage4ParamPage = new ParameterPage();
commandPage4ParamPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
try{
tools.doAction(commandPage4Map, tools.getStepPage(), commandPage4ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
String commandPage4Type = commandPage4ParamPage.getString("StreamType"); commandPage4ParamPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
try{
tools.doAction(commandPage4Map, tools.getStepPage(), commandPage4ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
String bcommandPage4HasPrivilege = commandPage4ParamPage.getString("CheckSecurityRetVal"); commandPage4ParamPage.putString("pyFlowActionPurpose", "GETLABEL");
try{
tools.doAction(commandPage4Map, tools.getStepPage(), commandPage4ParamPage);
}catch(Exception e){
oLog.error(e.getMessage());
}
ClipboardPage commandPage4targetAnimation = tools.createPage("","");
 commandPage4targetAnimation.putString("pyLaunch","anim-null");
 commandPage4targetAnimation.putString("pyDismiss","anim-null");
ClipboardPage commandPage4newTargetAnimation = tools.createPage("","");
 commandPage4newTargetAnimation.putString("pyValue","%7B%22isCustomMobileAnim%22%3A%22true%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22none%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%2C%22mobile%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-offbottom-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D");
String commandPage4FALabel= commandPage4ParamPage.getString("pzFALabel");
 if(commandPage4Type.equals("")) {commandPage4Type = "Rule-Obj-FlowAction";}if("true".equals(bcommandPage4HasPrivilege )){
commandPage4.putString("pyLocalAction", "pzPreferences");}else {
commandPage4.putString("pyLocalAction", "pyLocalActionPrivilegeError");
commandPage4.putString("pyActionPrivilegeError",tools.getLocalizedTextForString("pyMessageLabel","pzFlowActionAuthorization"));} 
commandPage4.putString("pyStreamType", commandPage4Type);
commandPage4.putString("pyFALabel", commandPage4FALabel);
commandPage4.putString("pyClassName", commandPage4Map.getString("pyClassName"));
commandPage4.putString("pyUsingPage","operatorPrefPage");
commandPage4.putString("pyModalDialog","");
commandPage4.putString("pyLATarget","true");
commandPage4.putString("pyModalFullScreen","true");
commandPage4.putPage("pyAnimations(DesktopReveal)",commandPage4newTargetAnimation);
commandPage4.putString("pyFormatStyle","");
commandPage4.putString("pyCustomTemplateName","");
commandPage4.putString("pyDisableOverlayClickAway","false");
commandPage4.putString("pyShowOverlayInCenter","false");behaviorPage4.putPage("pyActionAPI",commandPage4);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage3.getPage("pyBehaviors(<LAST>)")).register();
commandPage4.removeFromClipboard();
ClipboardPage behaviorPage5 = actionPage3.getPage("pyBehaviors(<append>)");
behaviorPage5.putString("pyAction","refresh");ClipboardPage commandPage5 = tools.createPage("Embed-SelectedContextAPI-Refresh","commandType");
commandPage5.putString( "pyTarget","otherSection");commandPage5.putString( "pyUsingPage","");commandPage5.putString( "pyActivity","");commandPage5.putString( "pySection","pzStudioHeader");commandPage5.putString( "pyDisableSubmit","true");commandPage5.getProperty("pyPreDataTransform").getPageValue().putString( "pyName","");commandPage5.getProperty("pyActivityParameters").getPageValue(1).putString( "pyValue","");commandPage5.getProperty("pyActivityParameters").getPageValue(1).putString( "pyName","");commandPage5.getProperty("pyActivityParameters").getPageValue(1).putString( "pxObjClass","Embed-NameValuePair");commandPage5.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyValue","");commandPage5.getPage("pyPreDataTransform").getProperty("pyDataTransformParams").getPageValue(1).putString( "pyName","");behaviorPage5.putPage("pyActionAPI",commandPage5);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage3.getPage("pyBehaviors(<LAST>)")).register();
commandPage5.removeFromClipboard();
ClipboardPage behaviorPage6 = actionPage3.getPage("pyBehaviors(<append>)");
behaviorPage6.putString("pyAction","runScript");ClipboardPage commandPage6 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage6.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage6.putPage("pyActionAPI",commandPage6);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage3.getPage("pyBehaviors(<LAST>)")).register();
commandPage6.removeFromClipboard();
executePage.putString("pyCommand","runActivity");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage3);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"pzProfileMenu" */

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
actionPage7.putString("pyHidden",String.valueOf(hideElement));actionPage7.putString("pyDisabled",String.valueOf(disableElement));actionPage7.putString( "pyName","");actionPage7.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage7.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage7.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage7.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage7.putString( "pyBadgeFormat","");actionPage7.putString( "pyDeferLoad","");actionPage7.putString( "pyImage","");actionPage7.putString("pyType","Separator");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzProfileMenu" */

private void method8_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1265889599741002".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1265889599741002")){
return;}
if(processShortcut &&"ID1265889599741002".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage8.putString("pyHidden",String.valueOf(hideElement));actionPage8.putString("pyDisabled",String.valueOf(disableElement));actionPage8.putString( "pyName","ID1265889599741002");actionPage8.putString( "pyImageSource","styleclass");actionPage8.putString( "pyIconStyle","hotkey-operator-rf");actionPage8.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Operator"));actionPage8.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage8.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage8.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage8.putString( "pyAutomationID","201903180742400314318");}actionPage8.putString( "pyBadgeFormat","Standard (label)");actionPage8.putString( "pyDeferLoad","false");actionPage8.putString( "pyImage","hotkey-operator-rf");actionPage8.putString("pyType","Action");
executePage=actionPage8.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage8 = actionPage8.getPage("pyBehaviors(<append>)");
behaviorPage8.putString("pyAction","openRuleByClassAndName");ClipboardPage commandPage8 = tools.createPage("Embed-DesktopAPI-OpenRuleByClassAndName","commandType");
propertyValue = "OperatorID.pxInsName";
commandPage8.putString("pyInsName",tools.getProperty(propertyValue).getStringValue());commandPage8.putString( "pyObjClass","Data-Admin-Operator-ID");commandPage8.putString( "pyElementName","");commandPage8.putString( "pyTargetElement","");executePage.putPage("pyOpenRuleByClassAndName",commandPage8);
behaviorPage8.putPage("pyActionAPI",commandPage8);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage8.getPage("pyBehaviors(<LAST>)")).register();
commandPage8.removeFromClipboard();
ClipboardPage behaviorPage9 = actionPage8.getPage("pyBehaviors(<append>)");
behaviorPage9.putString("pyAction","runScript");ClipboardPage commandPage9 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage9.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage9.putPage("pyActionAPI",commandPage9);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage8.getPage("pyBehaviors(<LAST>)")).register();
commandPage9.removeFromClipboard();
executePage.putString("pyCommand","openRuleByClassAndName");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzProfileMenu" */

private void method10_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1265889599741003".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1265889599741003")){
return;}
if(processShortcut &&"ID1265889599741003".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage10.putString("pyHidden",String.valueOf(hideElement));actionPage10.putString("pyDisabled",String.valueOf(disableElement));actionPage10.putString( "pyName","ID1265889599741003");actionPage10.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Access Group"));actionPage10.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage10.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage10.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage10.putString( "pyAutomationID","201903180742400497656");}actionPage10.putString( "pyBadgeFormat","Standard (label)");actionPage10.putString( "pyDeferLoad","false");actionPage10.putString( "pyImage","");actionPage10.putString("pyType","Action");
executePage=actionPage10.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage10 = actionPage10.getPage("pyBehaviors(<append>)");
behaviorPage10.putString("pyAction","openRuleByClassAndName");ClipboardPage commandPage10 = tools.createPage("Embed-DesktopAPI-OpenRuleByClassAndName","commandType");
propertyValue = "AccessGroup.pxInsName";
commandPage10.putString("pyInsName",tools.getProperty(propertyValue).getStringValue());commandPage10.putString( "pyObjClass","Data-Admin-Operator-AccessGroup");commandPage10.putString( "pyElementName","");commandPage10.putString( "pyTargetElement","");executePage.putPage("pyOpenRuleByClassAndName",commandPage10);
behaviorPage10.putPage("pyActionAPI",commandPage10);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage10.getPage("pyBehaviors(<LAST>)")).register();
commandPage10.removeFromClipboard();
ClipboardPage behaviorPage11 = actionPage10.getPage("pyBehaviors(<append>)");
behaviorPage11.putString("pyAction","runScript");ClipboardPage commandPage11 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage11.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage11.putPage("pyActionAPI",commandPage11);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage10.getPage("pyBehaviors(<LAST>)")).register();
commandPage11.removeFromClipboard();
executePage.putString("pyCommand","openRuleByClassAndName");
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
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"pzProfileMenu" */

private void method12_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
actionPage12.putString("pyHidden",String.valueOf(hideElement));actionPage12.putString("pyDisabled",String.valueOf(disableElement));actionPage12.putString( "pyName","");actionPage12.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage12.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage12.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage12.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage12.putString( "pyBadgeFormat","");actionPage12.putString( "pyDeferLoad","");actionPage12.putString( "pyImage","");actionPage12.putString("pyType","Separator");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzProfileMenu" */

private void method13_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1265889599741005".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1265889599741005")){
return;}
if(processShortcut &&"ID1265889599741005".equals(nodePathArr[0]) && !isNodePathEmpty){
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
actionPage13.putString("pyHidden",String.valueOf(hideElement));actionPage13.putString("pyDisabled",String.valueOf(disableElement));actionPage13.putString( "pyName","ID1265889599741005");actionPage13.putString( "pyImageSource","styleclass");actionPage13.putString( "pyIconStyle","hotkey-operator-faves");actionPage13.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "My Favorites"));actionPage13.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage13.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage13.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage13.putString( "pyAutomationID","201903180742400869617");}actionPage13.putString( "pyBadgeFormat","Standard (label)");actionPage13.putString( "pyDeferLoad","false");actionPage13.putString( "pyImage","hotkey-operator-faves");actionPage13.putString("pyType","Action");
executePage=actionPage13.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","");
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage13);
if(nodePathValidated==false){
}
}
}
deferLoad = false;
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1265889599741005")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1265889599724001".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1265889599724001*/

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
parentPageRef = actionPage13 != null ? actionPage13.getReference() : "" 
;actionPage14 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage14 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage14.putString("pyHidden",String.valueOf(hideElement));actionPage14.putString("pyDisabled",String.valueOf(disableElement));actionPage14.putString( "pyName","ID1265889599724001");actionPage14.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Edit Favorites"));actionPage14.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage14.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage14.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage14.putString( "pyAutomationID","201903180742400517596");}actionPage14.putString( "pyBadgeFormat","Standard (label)");actionPage14.putString( "pyDeferLoad","false");actionPage14.putString( "pyImage","");actionPage14.putString("pyType","Action");
executePage=actionPage14.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage14 = actionPage14.getPage("pyBehaviors(<append>)");
behaviorPage14.putString("pyAction","openUrlInWindow");ClipboardPage commandPage14 = tools.createPage("Embed-DesktopAPI-OpenURLInWindow","commandType");
commandPage14.putString( "pyWindowName","My Favorites");commandPage14.putString( "pyOptions","height=600,width=800,location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1");commandPage14.putString( "pyReplace","false");commandPage14.putString( "pyUseAlternateUrlBase","false");commandPage14.putString( "pyNoEncodingUrl","false");commandPage14.putString( "pyUrl",tools.findPage("pxThread").getString("pxReqURI"));commandPage14 .putString( "pyActivity","System-User-MyRules.EditMyRules");
 propertyValue = "pxRequestor.pyUserIdentifier";
commandPage14.getProperty("pyQueryString").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage14.getProperty("pyQueryString").getPageValue(1).putString( "pyName","userID");commandPage14.getProperty("pyQueryString").getPageValue(2).putString( "pyValue","WorkTab");commandPage14.getProperty("pyQueryString").getPageValue(2).putString( "pyName","Purpose");commandPage14.getProperty("pyQueryString").getPageValue(3).putString( "pyValue","false");commandPage14.getProperty("pyQueryString").getPageValue(3).putString( "pyName","bFromModal");executePage.putPage("pyOpenUrlInWindow",commandPage14);
behaviorPage14.putPage("pyActionAPI",commandPage14);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage14.getPage("pyBehaviors(<LAST>)")).register();
commandPage14.removeFromClipboard();
ClipboardPage behaviorPage15 = actionPage14.getPage("pyBehaviors(<append>)");
behaviorPage15.putString("pyAction","runScript");ClipboardPage commandPage15 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage15.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage15.putPage("pyActionAPI",commandPage15);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage14.getPage("pyBehaviors(<LAST>)")).register();
commandPage15.removeFromClipboard();
executePage.putString("pyCommand","openUrlInWindow");
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
ClipboardPage actionPage17= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage13 != null ? actionPage13.getReference() : "" 
;actionPage17 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage17 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="pzShowSeparator";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage17.putString("pyHidden",String.valueOf(hideElement));actionPage17.putString("pyDisabled",String.valueOf(disableElement));actionPage17.putString( "pyName","");actionPage17.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage17.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage17.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage17.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage17.putString( "pyBadgeFormat","");actionPage17.putString( "pyDeferLoad","");actionPage17.putString( "pyImage","");if (!hideElement) { 
actionPage17.putString("pyType","Separator");
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
/*Node Generated for caption -  and Name - */

nodePageList = tools.getIfPresent("pxRequestor.pyMyRules");
String strChildListPageRef19 = null;
if (nodePageList != null) {
String actionListParentPage19 = tools.getParamValue("ApplyToPage");	Iterator actionListIter19 = nodePageList.iterator();
	while (actionListIter19.hasNext()) {		iterListResult = (ClipboardProperty)actionListIter19.next();
		childListPage = iterListResult.getPageValue();
		;
		strChildListPageRef19 = childListPage.getReference();
		;
		if(strChildListPageRef19.lastIndexOf(".") == 0) {
			strChildListPageRef19 = "pxRequestor" + strChildListPageRef19;
		}
		tools.putParamValue("ApplyToPage", strChildListPageRef19);
		((PegaAPI)tools).pushStackFrame("navigation", null, childListPage, false, false);
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
parentPageRef = actionPage13 != null ? actionPage13.getReference() : "" 
;actionPage19 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage19 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage19.putString("pyHidden",String.valueOf(hideElement));actionPage19.putString("pyDisabled",String.valueOf(disableElement));actionPage19.putString( "pyName","");propertyValue = ".pyAdviceText";
propertyValue = tools.getParamValue("ApplyToPage")+".pyAdviceText";if(!isDynamicFieldNameForMenu){actionPage19.putString("pyCaption",tools.getLocalizedTextForString("pyCaption", tools.getProperty(propertyValue).getStringValue()));}else{actionPage19.putString("pyCaption",tools.getLocalizedTextForString(".pyAdviceText", "\t["+tools.getProperty(tools.getParamValue("ApplyToPage")+".pxObjClass").getStringValue()+".pyAdviceText]"+tools.getProperty(propertyValue).getStringValue()));}actionPage19.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage19.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage19.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage19.putString( "pyBadgeFormat","Standard (label)");actionPage19.putString( "pyDeferLoad","");propertyValue = ".pxListSubscript";
propertyValue = tools.getParamValue("ApplyToPage")+".pxListSubscript";actionPage19.putString("pySubscript",tools.getProperty(propertyValue).getStringValue());if(testIDWhen || functionalTestingWhen){if(!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue())) {actionPage19.putString("pyAutomationID","201903180742400544752" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue());}else if (!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue())) {actionPage19.putString("pyAutomationID","201903180742400544752" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue());}else {actionPage19.putString( "pyAutomationID","201903180742400544752");}}actionPage19.putString( "pyImage","");actionPage19.putString("pyType","Action");
executePage=actionPage19.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage19 = actionPage19.getPage("pyBehaviors(<append>)");
behaviorPage19.putString("pyAction","openRule");ClipboardPage commandPage19 = tools.createPage("Embed-DesktopAPI-OpenRule","commandType");
propertyValue = ".pyInsHandle";
propertyValue = tools.getParamValue("ApplyToPage")+".pyInsHandle";commandPage19.putString("pyHandle",tools.getProperty(propertyValue).getStringValue());boolean whenCondition;
whenCondition = false;
whenCondition = pega_uiengine_pznavigation.evaluateWhen("pzSpecificOpen",tools.getStepPage().getClassName(),tools);
if(whenCondition) { 
commandPage19.putString("pyOpenSpecificVersion","true");
}
else { 
commandPage19.putString("pyOpenSpecificVersion","false");
}
commandPage19.putString( "pyElementName","");commandPage19.putString( "pyTargetElement","");executePage.putPage("pyOpenRule",commandPage19);
behaviorPage19.putPage("pyActionAPI",commandPage19);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage19.getPage("pyBehaviors(<LAST>)")).register();
commandPage19.removeFromClipboard();
ClipboardPage behaviorPage20 = actionPage19.getPage("pyBehaviors(<append>)");
behaviorPage20.putString("pyAction","runScript");ClipboardPage commandPage20 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage20.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage20.putPage("pyActionAPI",commandPage20);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage19.getPage("pyBehaviors(<LAST>)")).register();
commandPage20.removeFromClipboard();
executePage.putString("pyCommand","openRule");
}
deferLoad = false;
pyNameSuffix = new Long(tools.getDateTimeUtils().currentTimeUnique()).toString();
String deferPagePath = tools.getParamValue("deferPagePath");
if( (StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length) && actionPage13 != null) {
		actionPage13.getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
}else{
tools.findPage(deferPagePath).getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
}
	}
	tools.putParamValue("ApplyToPage", actionListParentPage19);}
		((PegaAPI)tools).pushStackFrame("navigation", null, stepPage, false, false);
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"" for Navigation Rule :"pzProfileMenu" */

private void method22_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1316522708880000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1316522708880000")){
return;}
if(processShortcut &&"ID1316522708880000".equals(nodePathArr[0]) && !isNodePathEmpty){
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
String whenResolved ="never";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("never",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage22.putString("pyHidden",String.valueOf(hideElement));actionPage22.putString("pyDisabled",String.valueOf(disableElement));actionPage22.putString( "pyName","ID1316522708880000");actionPage22.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "My Recent Work"));actionPage22.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage22.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage22.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage22.putString( "pyAutomationID","201903180742400930522");}actionPage22.putString( "pyBadgeFormat","Standard (label)");actionPage22.putString( "pyDeferLoad","false");actionPage22.putString( "pyImage","");if (!hideElement) { 
actionPage22.putString("pyType","Action");
executePage=actionPage22.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
executePage.putString("pyCommand","__empty__");
if (!disableElement) { 
}
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
if((!deferLoad && StringUtils.isBlank(deferLoadPath)) || (!StringUtils.isBlank(deferLoadPath) && ( deferIndex>=deferPathArr.length || deferPathArr[deferIndex].equalsIgnoreCase("ID1316522708880000")))){
deferIndex ++;
if(!isNodePathEmpty && matchFound){ 
if(currentElement < nodePathArr.length-1)
currentElement++;
matchFound=false;
} 
if(processAction||("ID1316598773216000".equals(nodePathArr[currentElement])&& processShortcut && !isNodePathEmpty)){ 
matchFound=true;
if(processShortcut && !isNodePathEmpty && dontExitNow ){ 
if(nodeDepth==nodePathArr.length){ 
nodePathValidated=true;
dontExitNow=false;
} 
nodeDepth++;
} 
if(dontExitNow){ //start of dnt exit now condition
/*Node Generated for caption -  and Name - ID1316598773216000*/

nodePageList = tools.getIfPresent("pyMyRecentWork.pxResults");
String strChildListPageRef23 = null;
if (nodePageList != null) {
String actionListParentPage23 = tools.getParamValue("ApplyToPage");	Iterator actionListIter23 = nodePageList.iterator();
	while (actionListIter23.hasNext()) {		iterListResult = (ClipboardProperty)actionListIter23.next();
		childListPage = iterListResult.getPageValue();
		;
		strChildListPageRef23 = childListPage.getReference();
		;
		if(strChildListPageRef23.lastIndexOf(".") == 0) {
			strChildListPageRef23 = "pyMyRecentWork" + strChildListPageRef23;
		}
		tools.putParamValue("ApplyToPage", strChildListPageRef23);
		((PegaAPI)tools).pushStackFrame("navigation", null, childListPage, false, false);
if(!forceFullLoad && !StringUtils.isBlank(deferLoadPath) && deferIndex<deferPathArr.length){
skipNode = true;}
else{
skipNode = false;}
ClipboardPage actionPage23= null;if(!skipNode){
isChecked = false;isGroup = false;
disableElement = false;
hideElement = false;
String deferPagePath = tools.getParamValue("deferPagePath");
if(StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length){
parentPageRef = actionPage22 != null ? actionPage22.getReference() : "" 
;actionPage23 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage23 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
actionPage23.putString("pyHidden",String.valueOf(hideElement));actionPage23.putString("pyDisabled",String.valueOf(disableElement));actionPage23.putString( "pyName","ID1316598773216000");propertyValue = ".pzItem";
propertyValue = tools.getParamValue("ApplyToPage")+".pzItem";if(!isDynamicFieldNameForMenu){actionPage23.putString("pyCaption",tools.getLocalizedTextForString("pyCaption", tools.getProperty(propertyValue).getStringValue()));}else{actionPage23.putString("pyCaption",tools.getLocalizedTextForString(".pzItem", "\t["+tools.getProperty(tools.getParamValue("ApplyToPage")+".pxObjClass").getStringValue()+".pzItem]"+tools.getProperty(propertyValue).getStringValue()));}actionPage23.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage23.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage23.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage23.putString( "pyBadgeFormat","Standard (label)");actionPage23.putString( "pyDeferLoad","");propertyValue = ".pxListSubscript";
propertyValue = tools.getParamValue("ApplyToPage")+".pxListSubscript";actionPage23.putString("pySubscript",tools.getProperty(propertyValue).getStringValue());if(testIDWhen || functionalTestingWhen){if(!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue())) {actionPage23.putString("pyAutomationID","20190318074240088794" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxListSubscript").getStringValue());}else if (!"".equals(tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue())) {actionPage23.putString("pyAutomationID","20190318074240088794" + "_" + tools.getProperty(tools.getParamValue("ApplyToPage")+".pxSubscript").getStringValue());}else {actionPage23.putString( "pyAutomationID","20190318074240088794");}}actionPage23.putString( "pyImage","");actionPage23.putString("pyType","Action");
executePage=actionPage23.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage23 = actionPage23.getPage("pyBehaviors(<append>)");
behaviorPage23.putString("pyAction","runScript");ClipboardPage commandPage23 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
propertyValue = ".pzInsKey";
propertyValue = tools.getParamValue("ApplyToPage")+".pzInsKey";commandPage23.getProperty("pyParameters").getPageValue(1).putString("pyValue",tools.getProperty(propertyValue).getStringValue());commandPage23.getProperty("pyParameters").getPageValue(1).putString( "pyName","insKey");commandPage23.putString( "pyFunctionName","openWorkByHandle");executePage.putPage("pyCustom",commandPage23);
behaviorPage23.putPage("pyActionAPI",commandPage23);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage23.getPage("pyBehaviors(<LAST>)")).register();
commandPage23.removeFromClipboard();
ClipboardPage behaviorPage24 = actionPage23.getPage("pyBehaviors(<append>)");
behaviorPage24.putString("pyAction","runScript");ClipboardPage commandPage24 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage24.putString( "pyFunctionName","removeScreenLayoutMask");behaviorPage24.putPage("pyActionAPI",commandPage24);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage23.getPage("pyBehaviors(<LAST>)")).register();
commandPage24.removeFromClipboard();
executePage.putString("pyCommand","runScript");
}
deferLoad = false;
pyNameSuffix = new Long(tools.getDateTimeUtils().currentTimeUnique()).toString();
String deferPagePath = tools.getParamValue("deferPagePath");
if( (StringUtils.isBlank(deferPagePath) || deferIndex>deferPathArr.length) && actionPage22 != null) {
		actionPage22.getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
}else{
tools.findPage(deferPagePath).getProperty("pyElements(<last>)").getPageValue().putString("pyName","ID"+pyNameSuffix);
}
	}
	tools.putParamValue("ApplyToPage", actionListParentPage23);}
		((PegaAPI)tools).pushStackFrame("navigation", null, stepPage, false, false);
}//end of dnt exit now condition
}//end of condition
deferIndex --;
}
}//end of if for pxProcessShortcut
}//end of method
/* Method generated for Top Level Node -"------------------" for Navigation Rule :"pzProfileMenu" */

private void method26_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
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
String whenResolved ="never";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
if (!hideElement) {
}
actionPage26.putString("pyHidden",String.valueOf(hideElement));actionPage26.putString("pyDisabled",String.valueOf(disableElement));actionPage26.putString( "pyName","");actionPage26.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "------------------"));actionPage26.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage26.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage26.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));actionPage26.putString( "pyBadgeFormat","");actionPage26.putString( "pyDeferLoad","");actionPage26.putString( "pyImage","");if (!hideElement) { 
actionPage26.putString("pyType","Separator");
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
/* Method generated for Top Level Node -"" for Navigation Rule :"pzProfileMenu" */

private void method27_circum0(ClipboardPage outputPage,boolean processShortcut,boolean processAction,String nodePath,boolean isNodePathEmpty,String[] nodePathArr) {
boolean matchFound=true;
int currentElement=0;
if( processAction ||(processShortcut && "ID1358184853338000".equals(nodePathArr[0])  && !isNodePathEmpty)){
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
String actionPageParent="actionPage27";
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
if(!StringUtils.isBlank(deferLoadPath) && deferPathArr.length>0 && !deferPathArr[deferIndex].equalsIgnoreCase("ID1358184853338000")){
return;}
if(processShortcut &&"ID1358184853338000".equals(nodePathArr[0]) && !isNodePathEmpty){
nodeDepth++;
if(nodeDepth==nodePathArr.length){
nodePathValidated=true;
}
}
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
parentPageRef = tools.findPage(tools.getParamValue("PageName"), true).getReference();
actionPage27 =tools.findPage(parentPageRef).getPage("pyElements(<append>)");
}else{
actionPage27 =tools.findPage(deferPagePath).getPage("pyElements(<append>)");
}
showWhenCondition = true;
String whenResolved ="always";
if (!whenResolved.isEmpty()) {
try{showWhenCondition = pega_uiengine_pznavigation.evaluateWhen(whenResolved,tools.getStepPage().getClassName(),tools);
}catch(Exception e){oLog.error("Failed to resolve when rule:" + e);}
}
hideElement = !showWhenCondition;
enableWhenCondition = true;
if (!hideElement) {
enableWhenCondition = pega_uiengine_pznavigation.evaluateWhen("always",tools.getStepPage().getClassName(),tools);
disableElement = !enableWhenCondition;
if(!disableElement) {
}
}
actionPage27.putString("pyHidden",String.valueOf(hideElement));actionPage27.putString("pyDisabled",String.valueOf(disableElement));actionPage27.putString( "pyName","ID1358184853338000");actionPage27.putString( "pyImageSource","styleclass");actionPage27.putString( "pyIconStyle","hotkey-logoff");actionPage27.putString("pyCaption", tools.getLocalizedTextForString("pyCaption", "Log off"));actionPage27.putString("pySummary", tools.getLocalizedTextForString("pySummary", ""));actionPage27.putString("pyBadgeProperty", tools.getLocalizedTextForString("pyBadgeProperty", ""));actionPage27.putString("pyToolTip", tools.getLocalizedTextForString("pyToolTip", ""));if(testIDWhen || functionalTestingWhen){actionPage27.putString( "pyAutomationID","201903180742400951352");}actionPage27.putString( "pyBadgeFormat","Standard (label)");actionPage27.putString( "pyDeferLoad","");actionPage27.putString( "pyImage","hotkey-logoff");if (!hideElement) { 
actionPage27.putString("pyType","Action");
executePage=actionPage27.getProperty("pyExecute").getPageValue();
executePage.putString("pyRefreshLayout","false");
ClipboardPage behaviorPage27 = actionPage27.getPage("pyBehaviors(<append>)");
behaviorPage27.putString("pyAction","runScript");ClipboardPage commandPage27 = tools.createPage("Embed-DesktopAPI-Custom","commandType");
commandPage27.putString( "pyFunctionName","closeWindows");executePage.putPage("pyCustom",commandPage27);
behaviorPage27.putPage("pyActionAPI",commandPage27);
((PegaAPI)tools).getUIEngine().getUIAction(actionPage27.getPage("pyBehaviors(<LAST>)")).register();
commandPage27.removeFromClipboard();
ClipboardPage behaviorPage28 = actionPage27.getPage("pyBehaviors(<append>)");
behaviorPage28.putString("pyAction","logOff");((PegaAPI)tools).getUIEngine().getUIAction(actionPage27.getPage("pyBehaviors(<LAST>)")).register();
executePage.putString("pyCommand","runScript");
if (!disableElement) { 
}
if(!processShortcut){
}else {
if(!(nodePath.indexOf("/")!=-1))
outputPage.getProperty(".pyElements(<append>)").getPageValue().putAll(actionPage27);
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-NAVIGATION DATA-PORTAL PZPROFILEMENU #20200918T152125.360 GMT", "Data-Portal pzProfileMenu", "Pega-Desktop", "08-06-01", "20200918T152125.360 GMT");
}
