package com.pegarules.generated.html_section;
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
import com.pega.pegarules.jsptags.TagTools;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.runtime.ComplexParameterPage;
import com.pega.pegarules.priv.runtime.IActionRequest;
import com.pega.pegarules.priv.runtime.IActionRequestRegistrar;
import com.pega.pegarules.priv.runtime.IAutoStreamRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderBase;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderSection;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
import com.pega.pegarules.pub.generator.*;
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
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
/**
 * Builds JSP stream WORK-!PXASSIGNMENTVIEW.
 */
public class ra_stream_pxassignmentview_4a9472358635cdfbd1af30d1ba1099dd extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pxAssignmentView.OFON2J_ProcessO_Work_Onboarding.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1559035599;
private static boolean pz_isValidAssembly= true;
/** The current stream builder. */
	/** Properties of the stream definition for the stream that included the current stream (or null if none). */
	private Map mParentStreamProperties = null;

	/** The handle of the current stream. */
	protected String pz_CurrentRuleKey;
private IControlRuntimeUtilities controlRuntimeUtilities = null;

/**
 * Creates a stream builder.
 *
 * @param aContext the current executable
 */
	public ra_stream_pxassignmentview_4a9472358635cdfbd1af30d1ba1099dd(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
		initAssemblyParameters(tools);
	}
public static Map<String, AssemblyParameters> getAssemblyParametersMap(StreamBuilderToolKit tools) {		
 initAssemblyParameters(tools);	
 Map<String, AssemblyParameters> clone = new HashMap<String, AssemblyParameters>();	
 clone.putAll(oAssemblyParamsMap);	
 return clone;
}
public static void initAssemblyParameters(StreamBuilderToolKit tools) { 
	try {
		if(oAssemblyParamsMap == null || oAssemblyParamsMap.isEmpty()){
			oAssemblyParamsMap = tools.getControlUtilities().getAssemblyParamsMap(oControlPathsMap, tools, oCellRuntimeParamsMap, pxUniqueStreamHash);
		if(oAssemblyParamsMap != null && !oAssemblyParamsMap.isEmpty()){
			oControlPathsMap = null;
			oCellRuntimeParamsMap = null;
		}
		}
	} catch(IllegalStateException e) {
	pz_isValidAssembly = false;
	}
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "4683df77c12334438f8a053e6cbd54f4420f11d9";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
	if(!pz_isValidAssembly){
	throw new PRRuntimeException("Invalid Section Assembly ");
	}
previousTemplatingStatus = '\0';
	pzAuto.beginStream(pega);
	initRequiredPages();
pageContext = pega.getJSPFactory().getPageContext(mHttpServlet, request, mStreamResponse, null, true, 0, true);
application = pageContext.getServletContext();
out = pageContext.getOut();
session = pageContext.getSession();
mStreamResponse.setContentType("text/html;charset=UTF-8");
try {
String appliesToClass = tools.getPrimaryPage() != null ? tools.getPrimaryPage().getString("pxObjClass") : "OFON2J-ProcessO-Work-Onboarding";
final RuleChooser ruleChooser_1 = ((PegaDatabase) tools.getDatabase()).getRuleChooser(appliesToClass, tools.getThread());
/* handling 1 of 2 definitions  */
if (ruleChooser_1.ruleApplies(new RuleCharacteristicsImpl("pxDeviceType", "Phone", null, RuleResolutionStatistics.CircumstanceType.valueOf("TEMPLATE") ,null, null, null, tools))) {
/* Instance RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.733 GMT	Theme-Cosmos:04-01-01	pxDeviceType=Phone	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_1();
/* handling 2 of 2 definitions (isLast)  */
} else {
/* Instance RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.725 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_2();
}
	} catch (Throwable ex) {
		handleError(ex);
	} finally {
		pzAuto.finishStream();
		if (pega.getJSPFactory() != null) {
			pega.getJSPFactory().releasePageContext(pageContext);
		}
		pega.returnHTTPServletRequest(request);
	}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Section:PXASSIGNMENTVIEW", 
	"Rule-HTML-Section:PXASSIGNMENTVIEW"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXASSIGNMENTVIEW","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.725 GMT","!PXASSIGNMENTVIEW",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1559035599), 
		new DependentRuleInfo("PXASSIGNMENTVIEW","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.733 GMT","!PXASSIGNMENTVIEW",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-280046503)
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
//	RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.733 GMT:20210520T145924.929 GMT
//	RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.725 GMT:20210506T204027.725 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(
//	GetRDLRow_1( {"listSource", "String", ""},  {"index", "int", "0"}
//	getNextPage_1( {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}
//	RepeatingRDLCell_1( {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPREDATATRANSFORM #20180713T133339.990 GMT:20180713T133339.990 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETREFRESHWHENPREACTIVITY #20180713T133340.025 GMT:20180713T133340.025 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZSECTIONINCLUDEINCELL--(CLIPBOAF2BD5B648774E376BD18CD12B064353F #20180713T133341.324 GMT:20180713T133341.324 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION STRING TRIM #20180713T131442.833 GMT:20180713T131442.833 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "9d8c973deb94e8c3bffec87615f4afce";
	}

	public String getDefinitionAppliesToClass() {
		return "Work-";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_2() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pxAssignmentView",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pxAssignmentView','insKey':'RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.725 GMT','sectionType':'workareaWidget'}");
pzLayout_3();
pzLayout_4();
pzLayout_5();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void pzLayoutBody_4() {
includeSectionBody_3();
}
public void pzLayoutBodyWrapper_5() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_3();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_5() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",false);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_6","pyAssignmentViewExt", secInfo);
}


public void includeSectionBody_3() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pyAssignmentViewExt";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionpxAssignmentViewBBB","",false);
}
public void pzLayoutContainer_4() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
String expressionId_BV = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
if(!StringUtils.isBlank(expressionId)) {
	metadataPage.put("pyExpressionId",expressionId);
}
if(!StringUtils.isBlank(expressionId_BV)) {
	metadataPage.put("expressionId_BV",expressionId_BV);
}
String paramName = "EXPANDEDSubSectionpxAssignmentViewBBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(3)','clipboardPath':'pyAssignmentViewExt'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","3");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
pzLayoutBody_4();
containerComponent.endComponent();
}
public void pzLayout_5() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(3)','clipboardPath':'pyAssignmentViewExt'}") + ">");
}
pzSetExpandParam_5();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_5();
}
if(bWrapIncSection){
tools.appendString("</span>");
}if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_3() {
includeSectionBody_2();
}
public void pzLayoutBodyWrapper_4() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_2();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_4() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",false);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_4","pyAssignmentListGadget", secInfo);
}


public void includeSectionBody_2() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pyAssignmentListGadget";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpxAssignmentViewBB","",false);
}
public void pzLayoutContainer_3() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
String expressionId_BV = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
if(!StringUtils.isBlank(expressionId)) {
	metadataPage.put("pyExpressionId",expressionId);
}
if(!StringUtils.isBlank(expressionId_BV)) {
	metadataPage.put("expressionId_BV",expressionId_BV);
}
String paramName = "EXPANDEDSubSectionpxAssignmentViewBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2)','clipboardPath':'pyAssignmentListGadget'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","2");
IUIComponent containerComponent = pzAuto.getUIComponent();
com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2&& wxShowHierarchicalAssignmentList o1! wxIsSecondaryAjaxContainerContext o1! wxpyHideToDoWidget", pxUniqueStreamHash+"_5");metadataPage.put("isSectionIncl","true");
IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_5");
metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
if(pyVisibility) {
containerComponent.addPropertyToMetadata("rwclass", "assignment-list-gadget");
containerComponent.addPropertyToMetadata("roclass", "assignment-list-gadget");
pzLayoutBody_3();
}
containerComponent.endComponent();
runtimeContextTree.endVisibleWhen();
}
public void pzLayout_4() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2&& wxShowHierarchicalAssignmentList o1! wxIsSecondaryAjaxContainerContext o1! wxpyHideToDoWidget","ShowHierarchicalAssignmentList && !IsSecondaryAjaxContainerContext && !pyHideToDoWidget", "layout", "visible" )) {boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2)','clipboardPath':'pyAssignmentListGadget'}") + ">");
}
pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
String RWClasses = "";
RWClasses += " ";
RWClasses += pzSection.getCustomStyle(false, "","assignment-list-gadget","assignment-list-gadget") ;
RWClasses += " ";
tools.putParamValue("RWClasses",RWClasses);
pzLayoutBodyWrapper_4();
}
if(bWrapIncSection){
tools.appendString("</span>");
}}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
String RWClassesHelper = "";
RWClassesHelper += " ";
RWClassesHelper += pzSection.getCustomStyle(false, "","assignment-list-gadget","assignment-list-gadget") ;
RWClassesHelper += " ";
tools.putParamValue("RWClasses",RWClassesHelper);
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_2() {
includeSectionBody_1();
}
public void pzLayoutBodyWrapper_3() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_1();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",false);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_2","pyAssignmentListFlat", secInfo);
}
public void buildWhiteList_2() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}


public void includeSectionBody_1() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pyAssignmentListFlat";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpxAssignmentViewB","",false);
}
public void pzLayoutContainer_2() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
String expressionId_BV = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
if(!StringUtils.isBlank(expressionId)) {
	metadataPage.put("pyExpressionId",expressionId);
}
if(!StringUtils.isBlank(expressionId_BV)) {
	metadataPage.put("expressionId_BV",expressionId_BV);
}
String paramName = "EXPANDEDSubSectionpxAssignmentViewB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyAssignmentListFlat'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","1");
IUIComponent containerComponent = pzAuto.getUIComponent();
com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2&& o2|| o1! wxShowHierarchicalAssignmentList wxIsSecondaryAjaxContainerContext o1! wxpyHideToDoWidget", pxUniqueStreamHash+"_3");metadataPage.put("isSectionIncl","true");
IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_3");
metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
if(pyVisibility) {
pzLayoutBody_2();
}
containerComponent.endComponent();
runtimeContextTree.endVisibleWhen();
}
public void pzLayout_3() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& o2|| o1! wxShowHierarchicalAssignmentList wxIsSecondaryAjaxContainerContext o1! wxpyHideToDoWidget","(!ShowHierarchicalAssignmentList || IsSecondaryAjaxContainerContext) && !pyHideToDoWidget", "layout", "visible" )) {boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyAssignmentListFlat'}") + ">");
}
pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_3();
}
if(bWrapIncSection){
tools.appendString("</span>");
}}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}



private void performStream_2() throws Throwable {
buildWhiteList_2();pzSectionBody_2();}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "");
	oStreamProperties_2.put("pyClassName", "Work-");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.725 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pxAssignmentView");
	oStreamProperties_2.put("pyRuleSetVersion", "04-01-01");
}
private boolean hasNonTemplateMethod_2() {	 return false;}public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pxAssignmentView",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pxAssignmentView','insKey':'RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.733 GMT','sectionType':'workareaWidget'}");
pzLayout_2();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void buildWhiteList_1() {
Map<String, String> config;
config = new HashMap<String, String>();
config.put("pySectionName", "pxAssignmentView");
pega.getUIEngine().getUIAction("rdlpagination", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutHeader_1() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("headingLevel","h3");
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpxAssignmentViewB"));
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("To do", "pyCaption");
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("title","To do");
metadataPage.put("uniqueid", "202602230450590261");
metadataPage.put("automationId", " " + pzCell.getTestIdIfEnabled("20190206080236048636") + " ");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_2() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}


public void RDLPaginator_1() {
pzAuto.emitIncludeStreamReference("pyRDLPaginator", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Section", null);
}


public void RDLNoDetails_1() {
pzAuto.emitIncludeStreamReference("pyRDLNoMoreData", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Section", null);
}


public void getNextPage_1(String listSource, int listStartIndex, int listEndIndex) {
	IUIComponent nextPageComponent = pzAuto.getUIComponent(IUIComponent.ComponentType.NEWPAGE);
	ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
	int totalRecords = rdlPageListProp.size();
	listEndIndex = (listEndIndex < 0 || listEndIndex > totalRecords) ? totalRecords : listEndIndex;
	Map map = new HashMap();
	Map<String, String> indexMap = new HashMap<String, String>();
	indexMap.put("pyStartIndex",Integer.toString(listStartIndex));
	indexMap.put("pyEndIndex",Integer.toString(listEndIndex));
	map.put("pxDataSourceId", pxUniqueStreamHash+"_7");
	map.put("pyContext", listSource);
	map.put("pyPagination", indexMap);
	IUIComponentMetadata nextPageMetadata = pzAuto.getUIComponentRuntime().createMetadata();
	nextPageMetadata.put("datasrcid",pxUniqueStreamHash+"_7");
	nextPageMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636" ) + "");
	nextPageMetadata.put("pageListProp",listSource);
	nextPageMetadata.put("strtindx",Integer.toString(listStartIndex));
	nextPageMetadata.put("endindx",Integer.toString(listEndIndex));
	nextPageMetadata.put("processChildren","false");
	nextPageMetadata.put("rdlshowdtls","false");
	nextPageComponent.addDependentScripts("pzpega_ui_nextpagetemplate.js");
	nextPageComponent.beginComponent("nextPage",nextPageMetadata,map);
	ClipboardProperty cpSource = tools.getProperty(listSource);
	ClipboardPage itemPage = null;
	Iterator itemPages = cpSource.iterator();
	if(itemPages.hasNext()) {
		itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		simpleLayoutCell_1(1);
	pega.popStackFrame(itemFrame, false);
	}
	nextPageComponent.endComponent();
	}
	

public void GetRDLRow_1(String listSource, int index) {
		ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
		ClipboardPage itemPage = rdlPageListProp.getPageValue(index);
		if(itemPage != null){
		tools.appendString("||RDLROWMARKUP_BEGIN||");
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		IUIComponent repeatingRow = null;
		if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
		repeatingRow = pzAuto.getUIComponent();
		IUIComponentMetadata pg_repeatingRowMeta = pzAuto.getUIComponentRuntime().createMetadata();
		pg_repeatingRowMeta.put("index", index + "");
		repeatingRow.beginComponent("RepeatingRow", pg_repeatingRowMeta);
		}
		int cellIndex=simpleLayoutCell_1(index);
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
		repeatingRow.endComponent();
		}
		pega.popStackFrame(itemFrame, false);
		tools.appendString("||RDLROWMARKUP_END||");
		}
		}
public void pzLayoutBodyWrapper_1() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_2();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_2() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_5","pyToDoItem", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pyToDoItem"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionCellpxAssignmentView603","",false);
}
public void pzLayout_1() {
pzSetExpandParam_2();
pzLayoutBodyWrapper_1();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_2","pyToDoItem", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pyToDoItem"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}


public void generateClientWhenDiv_1() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
if(currentTemplatingStatus =='N')
tools.appendString(" style='");
else
clientWhenAttr += "style='";
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
}


public int simpleLayoutCell_1(  int index) {
	String labelName="";
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pyToDoItem",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-bottom-spacing   flex flex-row ' ");
	boolean prevState = (tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails")))  ? true : false ;
	tools.putParamValue("bRDLShowDetails","false");
	tools.appendString("NAME='BASE_REF' BASE_REF='");
	if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'N'){
	String strSub="";
	if(tools.getStepPage().getIfPresent("pxSubscript") != null && !"".equals(tools.getStepPage().getString("pxSubscript"))) { 
	 strSub = tools.getStepPage().getString("pxListSubscript"); 
	 }else if(tools.getStepPage() != null && tools.getStepPage().getParentProperty() != null){  
	 strSub = ""+tools.getStepPage().getParentProperty().indexOf(); 
	 }
	tools.putParamValue("index",strSub);
	tools.appendString(tools.getStepPage().getReference() + "' ");
	String rowTestID = tools.getParamValue("index");
	tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636-" + rowTestID) + " ");
	}else {
	tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getStepPage().getReference(),"") + "' ");
	}
	tools.appendString(" STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_1();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.putParamValue("bRDLShowDetails",prevState);
	tools.appendString("</div>");
	index++;
	return index;
	}else{
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean prevState = (tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails")))  ? true : false ;
	tools.putParamValue("bRDLShowDetails","false");
	 baseRef = "NAME='BASE_REF' BASE_REF='";
	String strSub="";
	if( pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'N'){
	if(tools.getStepPage().getIfPresent("pxSubscript") != null && !"".equals(tools.getStepPage().getString("pxSubscript"))) { 
	 strSub = tools.getStepPage().getString("pxListSubscript"); 
	 }else if(tools.getStepPage() != null && tools.getStepPage().getParentProperty() != null){  
	 strSub = ""+tools.getStepPage().getParentProperty().indexOf(); 
	 }
	baseRef += tools.getStepPage().getReference();
	}else {
	baseRef += tools.getStepPage().getReference();
	}
	baseRef += "'";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pyToDoItem",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_1();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	tools.putParamValue("bRDLShowDetails",prevState);
	return index;
	}
}
public void pzTemplateRDL_1() {
IUIComponentMetadata pgRDMetadata = null;
IUIComponentMetadata pgSection = null;  
IUIComponentMetadata pgSectionBody = null;  
IUIComponentMetadata pgCells  = null; 
IUIComponentMetadata pyRDDataPageParams = null;
IUIComponent cc = pzAuto.getUIComponent(IUIComponent.ComponentType.RDL);
String pyInstanceId ="";
char mode = tools.getProperty("D_CaseAssignments.pxResults").getMode();
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
pgRDMetadata = pzAuto.getUIComponentRuntime().createMetadata();
pgRDMetadata.put("pyProcessChildren","false");
String strLayoutMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
pgRDMetadata.put("methodnm",strLayoutMethodName);
pgSection = pzAuto.getUIComponentRuntime().createMetadata();
pgSectionBody = pzAuto.getUIComponentRuntime().createMetadata();
pgCells = pzAuto.getUIComponentRuntime().createMetadata();
pgSection.put("class","content    flex  layout-content-stacked content-stacked "); 
pgSection.put("liveUI",""); 
pgRDMetadata.put("rdlnavigationtype","tabkey");
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression;
if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
expressionId = pxUniqueStreamHash+"_6";
expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  "D_CaseAssignments.pxResults AddDelete", expressionId, true);
expressionId = expression.getId();
}
ClipboardProperty rdlPageListProp = tools.getProperty("D_CaseAssignments.pxResults");
String rdlPageListPropRef = "D_CaseAssignments.pxResults";
if(rdlPageListProp != null) {
rdlPageListPropRef = rdlPageListProp.getReference();
}
String rdlRefreshWhenStr = "D_CaseAssignments.pxResults AddDelete";
rdlRefreshWhenStr = rdlRefreshWhenStr.replace("D_CaseAssignments.pxResults",rdlPageListPropRef);
if(!StringUtils.isBlank(expressionId)) {
	pgRDMetadata.put("pyExpressionId", expressionId);
}
pgRDMetadata.put("nextpg","getNextPage_1");
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(true);
if (pzAuto.getUIComponentRuntime().isTemplateRendering()) {
pgRDMetadata.put("nomoremsgtype", "section");
Map<String, Object> RDLNoMoreDataMessageSectionParams = new HashMap<>();
RDLNoMoreDataMessageSectionParams.put("doNotAddToMetadataTree", true);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_8","pyProgressiveRDLPaginatorShowLess", RDLNoMoreDataMessageSectionParams);
String pyNoMoreDataReference = pzAuto.getUIComponentRuntime().getRuntimeContextTree().getLastAccesedSectionHash();
pgRDMetadata.put("nomoredataref", pyNoMoreDataReference);
} else {
RDLNoDetails_1
();
}
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(false);
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(true);
if (pzAuto.getUIComponentRuntime().isTemplateRendering()) {
Map<String, Object> RDLPaginatorSectionParams = new HashMap<>();
RDLPaginatorSectionParams.put("doNotAddToMetadataTree", true);
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
RDLPaginatorSectionParams.put("packageSection", true);
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_9","pyProgressiveRDLPaginator", RDLPaginatorSectionParams);
String pyRDLPaginatorReference = pzAuto.getUIComponentRuntime().getRuntimeContextTree().getLastAccesedSectionHash();
pgRDMetadata.put("pgsection", pyRDLPaginatorReference);
}
pzAuto.getUIComponentRuntime().resetServerWhenEnabled(false);
pgRDMetadata.put("pyenableswipe","false");
pgRDMetadata.put("rdlpgmode","1");
pgRDMetadata.put("rdlpgsize","3");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_CaseAssignments.pxResults").getReference(),"", false).replaceFirst("_pa[0-9]+pz","")); 
} else {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_CaseAssignments.pxResults").getReference(),"",false)); 
}
pgSectionBody.put("sourcetype","Data Object");
Map map = new HashMap();
Map paramsMap = new HashMap();
map.put("params", paramsMap);
Map<String, String> pyPagination = new HashMap<String, String>();
pyPagination.put("pyStartIndex", "1");
pyPagination.put("pyEndIndex", Integer.toString(3));
map.put("pyPagination", pyPagination);
map.put("pxDataSourceId", pxUniqueStreamHash+"_10");
pgSectionBody.put("datasrcid",pxUniqueStreamHash+"_10");
pyRDDataPageParams = pzAuto.getUIComponentRuntime().createMetadata();
paramsMap.put("hideChildCases", "false");
pyRDDataPageParams.put("pyName","hideChildCases");
pyRDDataPageParams.put("pyValue","{\"value\":\"false\",\"isLiteral\":true}");
pgSectionBody.addMetadataInArray("rdparamslst",pyRDDataPageParams);
pyRDDataPageParams = pzAuto.getUIComponentRuntime().createMetadata();
paramsMap.put("showCompletedCases", "false");
pyRDDataPageParams.put("pyName","showCompletedCases");
pyRDDataPageParams.put("pyValue","{\"value\":\"false\",\"isLiteral\":true}");
pgSectionBody.addMetadataInArray("rdparamslst",pyRDDataPageParams);
pyRDDataPageParams = pzAuto.getUIComponentRuntime().createMetadata();
paramsMap.put("flattenedStructure", "true");
pyRDDataPageParams.put("pyName","flattenedStructure");
pyRDDataPageParams.put("pyValue","{\"value\":\"true\",\"isLiteral\":true}");
pgSectionBody.addMetadataInArray("rdparamslst",pyRDDataPageParams);
pgSectionBody.put("dpname","D_CaseAssignments");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgRDMetadata.put("generatePath","true");
}
pgSectionBody.addMetadataInArray("cells",pgCells);
pgSection.addMetadataInArray("sectionbody",pgSectionBody);
pgRDMetadata.putMetadata("section",pgSection);
pyInstanceId =String.valueOf(System.currentTimeMillis());
pgRDMetadata.put("uniqueid", "RDL" + pyInstanceId);
pgRDMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636" ) + "");
cc.addDependentScripts("pzpega_ui_RDLTemplate.js");
cc.addDependentScripts("pzpega_ui_RDLRowTemplate.js");
cc.addAdditionalScripts("rdlincludes","pzpega_ui_rdl.js");
pgRDMetadata.put("rowmethod","GetRDLRow_1");
map.put("pyContext", "D_CaseAssignments.pxResults");
cc.beginComponent("RepeatingDynamicLayout",pgRDMetadata,map);
Map<String,String> repeatMap  = null; if(tools.getParameterPage().getParameterValue("pzRepeatProperties")!=null){
repeatMap = (Map<String,String>)tools.getParameterPage().getParameterValue("pzRepeatProperties");
}else {
repeatMap = new HashMap<String,String>();
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_CaseAssignments.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""), "RDL" + pyInstanceId);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_CaseAssignments.pxResults").getReference(),"", false),pyInstanceId);
}
tools.getParameterPage().putObject("pzRepeatProperties",repeatMap);
ClipboardProperty cpSource = tools.getProperty("D_CaseAssignments.pxResults");
boolean bIsSourceEmpty = false;
ClipboardPage itemPage = null;
if(cpSource.size()==0){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().markAsDynamic();
bIsSourceEmpty=true;
ClipboardPage cpParentPage = cpSource.getTopLevelPage();
String dummyPageName = "";
if(tools.isValidDataPage(cpParentPage.getName())){
dummyPageName = "Dummy"+cpParentPage.getName();
}else{
dummyPageName = "DummyD_CaseAssignments_pxResults";
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_CaseAssignments.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""),"RDL" + pyInstanceId + ":" + dummyPageName);
itemPage = tools.createPage("Assign-",dummyPageName);
PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
simpleLayoutCell_1(1);
	pega.popStackFrame(itemFrame, false);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_CaseAssignments.pxResults").getReference(),"",false),pyInstanceId + ":" + dummyPageName);
}
}else{
if(mode =='L' || mode =='G'){
Iterator itemPages = cpSource.iterator();
int pageCounter = 0;
while(itemPages.hasNext()) {
	pageCounter++;
	itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
	PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
	if(pageCounter == 1) {
	simpleLayoutCell_1(1);
	}
	pega.popStackFrame(itemFrame, false);
}
}}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_CaseAssignments.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""));
} else {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_CaseAssignments.pxResults").getReference(),"", false));
}
cc.endComponent();
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
		pzPackageRuntime.packageSection("pxAssignmentView",
		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
		}
		}
		

public void RepeatingRDLCell_1(String listSource, int listStartIndex, int listEndIndex) {
			String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
			String rptDynamicIdx_prefix = "";
			if(!"".equals(rptDynamicIdx)) rptDynamicIdx_prefix = rptDynamicIdx + "_";
			ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
			int totalRecords = rdlPageListProp.size();
			listEndIndex = (listEndIndex < 0 || listEndIndex > totalRecords) ? totalRecords : listEndIndex;
			if(totalRecords > 0 && listStartIndex > 0 && listStartIndex <= totalRecords){
			for(int i = listStartIndex; i <= listEndIndex; i++){
			ClipboardPage itemPage = rdlPageListProp.getPageValue(i);
			if(itemPage != null){
			PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
			tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx_prefix + i);
			tools.putParamValue("pega_RLindex",rptDynamicIdx_prefix +i);
			tools.putParamValue("expandRL","true");
			int index=simpleLayoutCell_1(i);
	tools.putParamValue("expandRL","false");
			pega.popStackFrame(itemFrame, false);
			}
			}
			}
			}
public void pzHeaderCellContent_1() {
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpxAssignmentViewB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1)'}") + " class='layout layout-outline layout-outline-default' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpxAssignmentViewB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","To do");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='3' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel9459' data-layout-id='202602230450590251" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h3  class='header-title' id='headerlabel9459'>" + l_sectionTitle + "</h3><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpxAssignmentViewB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}


public void putRDLDPParams_1() {
	tools.putParamValue("hideChildCases","false");
	tools.putParamValue("showCompletedCases","false");
	tools.putParamValue("flattenedStructure","true");
	}
	

public void simpleLayout_1() {
		putRDLDPParams_1();
		String strRWPreActivity = "";
		strRWPreActivity = "";
		
		String strDTransform = "";
		strDTransform = "";
		pega_rules_utilities.pzRegisterActivity(tools, "ShowStream");
		tools.putParamValue("listPageSize","3");
		boolean bGenerateNonTemplateRDL = false;
		if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled() && !bGenerateNonTemplateRDL) {
		pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
		HashStringMap whenKeys= new HashStringMap();
		whenKeys.put("pxObjClass","Rule-Obj-When");
		whenKeys.put("pyClassName",tools.getPrimaryPage().getString("pxObjClass"));
		whenKeys.put("pyBlockName","pzIsRDLTemplatized");
		boolean isRDLTemplatized = tools.evaluateWhen(whenKeys);
		if(pzAuto.getUIComponentRuntime().isTemplateRendering() || isRDLTemplatized) {
		pzTemplateRDL_1();
		return;
		}
		} else {
		bGenerateNonTemplateRDL = true;
		tools.putParamValue("bGenerateNonTemplateRDL","true");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_11");
		}
		int totalRecords=0;
		int pageSize=3, endIndex=0;
		tools.appendString("<div class='rdlWrapperDiv'>");
		boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
		String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
		String bIsGridLayout=tools.getParamValue("bIsGridLayout");
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
		tools.putParamValue("bIsWrapperAdded", "true");
		}
		tools.appendString("<div bSimpleLayout='true' " + "data-repeat-source= '");
		tools.appendString(tools.getProperty("D_CaseAssignments.pxResults").getReference()+ "' ");
		tools.appendString("   class=' flex content   layout-content-stacked content-stacked   progressive-useraction' ");
		String strMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
		ClipboardProperty rdlPageListProperty = tools.getProperty("D_CaseAssignments.pxResults");
		String rdlPageListPropRef = "D_CaseAssignments.pxResults";
		if(rdlPageListProperty != null) {
		rdlPageListPropRef = rdlPageListProperty.getReference();
		}
		String rdlRefreshWhenStr = "D_CaseAssignments.pxResults AddDelete";
		rdlRefreshWhenStr = rdlRefreshWhenStr.replace("D_CaseAssignments.pxResults",rdlPageListPropRef);
		tools.appendString(" data-refresh=\"true\" data-methodName='" + strMethodName + "' data-rowmethodname='GetRDLRow_1' ");
try {
tools.appendString("RWP=\".pxResults\" RW=\"");
tools.appendString(rdlRefreshWhenStr);
tools.appendString("\"");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("20190206080236048636" ) + " ");
		tools.appendString(">");
		int index = 1;
		tools.putParamValue("bIsRDL","true");
		String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
		String rptDynamicIdx_prefix = "";
		if(!"".equals(rptDynamicIdx)) rptDynamicIdx_prefix = rptDynamicIdx + "_";
		ClipboardProperty rdlPageListProp =null;
		if (tools.getParamValue("pyPegaDesignMode").equals("true")) { return;}
		rdlPageListProp = tools.getProperty("D_CaseAssignments.pxResults");
		totalRecords = rdlPageListProp.size();
		Iterator itemPages = rdlPageListProp.iterator();
		if(totalRecords > 0){
		int startIndex = 1; 
		endIndex = (totalRecords < pageSize) ? totalRecords : pageSize;
		RepeatingRDLCell_1(rdlPageListProp.getReference(),startIndex, endIndex);
		}
		tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx);
		tools.putParamValue("bIsRDL","");
		tools.putParamValue("pega_RLindex","");
		tools.appendString("</div>");
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("</div></div>");
		tools.putParamValue("bIsWrapperAdded", "false");
		}
		if(totalRecords >= pageSize){
		tools.appendString("<div class='RDLPaginator' data-methodname='RepeatingRDLCell_1'");
		tools.appendString("data-pagination-config='{\"listPaginationMode\":\"Progressive\",\"listPageSize\":\""+pageSize+"\",\"listStartIndex\":\""+(endIndex+1)+"\"}'");
		tools.appendString(">");
		RDLPaginator_1
		();
		tools.appendString("</div>");
		}
		tools.appendString("</div>");
		if(bGenerateNonTemplateRDL) {
		tools.getParameterPage().remove("bGenerateNonTemplateRDL");
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
	}
	public void LayoutWrapperTableEnd_1() {
	tools.appendString("</div>");
	}
	public void pzLayoutContainer_1() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId)) {
		metadataPage.put("pyExpressionId",expressionId);
	}
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpxAssignmentViewB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-default");
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o1! wxpyHideToDoWidget", pxUniqueStreamHash+"_12");metadataPage.put("lMode","Flexbox");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_12");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutHeader_1();
	pzLayoutBody_1();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_2() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o1! wxpyHideToDoWidget","!pyHideToDoWidget", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
pzLayoutBodyWrapper_2();
 LayoutWrapperTableEnd_1(); }
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
putRDLDPParams_1();
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}

private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "Phone");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Work-");
	oStreamProperties_1.put("pyCircumstanceProp", "pxDeviceType");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.733 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pxAssignmentView");
	oStreamProperties_1.put("pyRuleSetVersion", "04-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}private void executeStream_1() {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_CIRCUMSTANCED, "true");pxUniqueStreamHash = "4683df77c12334438f8a053e6cbd54f4420f11d9";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pxAssignmentView",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.733 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.733 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.733 GMT */
}
private void executeStream_2() {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_CIRCUMSTANCED, "true");pxUniqueStreamHash = "b1b011d8ea90e0c6c917c95d7244eaacf4c84ecb";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pxAssignmentView",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_2();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.725 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.725 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
final Map prevPropDefs_2 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_2);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_2);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_1)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_2();

}
}
} catch (Throwable thr) {
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.725 GMT */
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_1;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_1.getRuleSetName(), oTraceInfo_1.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("GetRDLRow_1", new String[][] { {"listSource", "String", ""},  {"index", "int", "0"}});
pzExternalMethodMapping.put("getNextPage_1", new String[][] { {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}});
pzExternalMethodMapping.put("RepeatingRDLCell_1", new String[][] { {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.733 GMT", "Work- pxAssignmentView", "Theme-Cosmos", "04-01-01", "20210520T145924.929 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION WORK- PXASSIGNMENTVIEW #20210506T204027.725 GMT", "Work- pxAssignmentView", "Theme-Cosmos", "04-01-01", "20210506T204027.725 GMT");
}
