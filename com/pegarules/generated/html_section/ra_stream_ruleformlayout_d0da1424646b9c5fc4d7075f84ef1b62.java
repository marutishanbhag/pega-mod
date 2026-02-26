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
 * Builds JSP stream RULE-OBJ-PROPERTY!RULEFORMLAYOUT.
 */
public class ra_stream_ruleformlayout_d0da1424646b9c5fc4d7075f84ef1b62 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.RuleFormLayout.Rule_Obj_Property.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 644681822;
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
	public ra_stream_ruleformlayout_d0da1424646b9c5fc4d7075f84ef1b62(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "f1c1335841c28702a3f821b19a267ae21a85bc60";
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
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMLAYOUT #20180713T135658.340 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "f1c1335841c28702a3f821b19a267ae21a85bc60";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("RuleFormLayout",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMLAYOUT #20180713T135658.340 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMLAYOUT #20180713T135658.340 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMLAYOUT #20180713T135658.340 GMT */
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
	"Rule-HTML-Section:RULEFORMLAYOUT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("RULEFORMLAYOUT","Rule-HTML-Section","RULE-OBJ-PROPERTY",false,"","Pega-SystemArchitect","08-01-01","RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMLAYOUT #20180713T135658.340 GMT","!RULEFORMLAYOUT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",644681822)
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
//	RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMLAYOUT #20180713T135658.340 GMT:20180713T135658.340 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS DEFERLOADRETRIEVALACTIVITY #20180713T132449.546 GMT:20180713T132449.546 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATETABBEDSECTIONLAYOUT--(ST0BC8EFD5459D738EF7AAAF219E7289B6 #20191016T111148.764 GMT:20191016T111148.764 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
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
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
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
		return "c1f5446d5b25fc21ab643a9c8736fd1a";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Property";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("RuleFormLayout",1,"Rule-HTML-Section","{'type':'Section','ruleName':'RuleFormLayout','insKey':'RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMLAYOUT #20180713T135658.340 GMT','sectionType':'standard'}");
pzLayout_1();
pxIsNonTemplateStream = true;
if( pzAuto.getUIComponentRuntime().isTemplateRendering() ) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");
}
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){
pzGroup_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void groupHeaderEnd_1() {
tools.appendString("<li class='rightborder'  style='list-style:none' ><span id='TABSPAN'><table cellspacing='0' cellpadding='0'><tr></tr></table></span></li></ul>");
if(pzAuto.isOrientationRTL()) {
tools.appendString("<div style=\"display:inline;height:100%;width:100%;\" class=\"rightborder\"></div>");
}else{
tools.appendString("<div style=\"display:inline-block;height:100%;width:100%;\" class=\"rightborder\"></div>");
}
if(!tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString("</div></div>");
}
}
public void invokeDeferLoadPreActivity_3() {
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()&&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){

}
}
public void pzLayoutBodyWrapper_5() {
pzSection.getLayout().setExpandParam("SubSectionRuleFormLayoutBBBBB",null,false);
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionRuleFormLayoutBBBBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='5' id='INNERDIV-SubSectionRuleFormLayoutBBBBB' class='tabbed_expandInnerDivStyle'  style=\"display:none\"  >");
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
invokeDeferLoadPreActivity_3();
includeSectionBody_5();
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("LazyLoad");
tools.appendString("<div section_index='5' id='INNERDIV-SubSectionRuleFormLayoutBBBBB' class='tabbed_expandInnerDivStyle'  style='display:none'  >");
if(true && (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()  || "true".equals(tools.getParamValue("pyPegaDesignMode")))){
includeSectionBody_5();
}
}
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.appendString("</div>");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_12","RuleFormHistory", secInfo);
}


public void includeSectionBody_5() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "RuleFormHistory";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_4(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="History";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_4(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"History\" title=\"History\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='5' id='Tab4' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
 if(tools.getParamValue("EXPAND_ALL").equals("true") || (tools.getParamValue("EXPANDEDSubSectionRuleFormLayoutBBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")).equals("true") && tools.getParamValue("RenderSingle").equals(""))  ||tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionRuleFormLayoutBBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""))){
tools.appendString(" isLoadDeferred='false' sectionBodyId='SubSectionRuleFormLayoutBBBBB'");
}else{
tools.appendString(" isLoadDeferred='true' readonly='" + !tools.hasInputEnabled() + "' sectionBodyId='SubSectionRuleFormLayoutBBBBB'");
}
tools.appendString(">");
String l_title="History";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230423590604" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_4();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void invokeDeferLoadPreActivity_2() {
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()&&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){

						  {
						ParameterPage newParamsPage = new ParameterPage();
						 String strPropertyValue="";
						 String[] arReturn;
						 strPropertyValue="<pyDeferLoadRetrievalActivityParams/>";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"<pyDeferLoadRetrievalActivityParams/>",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("pxObjClass", strPropertyValue);
						 strPropertyValue="TempPlaceHolder";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"TempPlaceHolder",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("pyTempPlaceHolder", strPropertyValue);
						 newParamsPage.putString("pyTempPlaceHolder", "TempPlaceHolder");
						 HashStringMap keys = new HashStringMap();
						 keys.putString("pxObjClass", "Rule-Obj-Activity");
						 keys.putString("pyClassName",  tools.getStepPage().getString("pxObjClass") );
						 keys.putString("pyActivityName", "pzGetAssociatedSpecifications");
						 tools.doActivity(keys, tools.getStepPage(), newParamsPage);
						 } 
}
}
public void pzLayoutBodyWrapper_4() {
pzSection.getLayout().setExpandParam("SubSectionRuleFormLayoutBBBB",null,false);
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionRuleFormLayoutBBBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='4' id='INNERDIV-SubSectionRuleFormLayoutBBBB' class='tabbed_expandInnerDivStyle'  style=\"display:none\"  >");
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
invokeDeferLoadPreActivity_2();
includeSectionBody_4();
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("LazyLoad");
tools.appendString("<div section_index='4' id='INNERDIV-SubSectionRuleFormLayoutBBBB' class='tabbed_expandInnerDivStyle'  style='display:none'  >");
if(true && (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()  || "true".equals(tools.getParamValue("pyPegaDesignMode")))){
includeSectionBody_4();
}
}
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.appendString("</div>");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_11","pzSpecifications", secInfo);
}


public void includeSectionBody_4() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzSpecifications";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_3(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Specifications";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_3(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
 if(pzAuto.handleEvaluateWhen(" wxpzIsLinkableRuleType","pzIsLinkableRuleType", "tab", "visible" )) {
tools.appendString("<li role=\"tab\"  aria-label=\"Specifications\" title=\"Specifications\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='4' id='Tab3' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
 if(tools.getParamValue("EXPAND_ALL").equals("true") || (tools.getParamValue("EXPANDEDSubSectionRuleFormLayoutBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")).equals("true") && tools.getParamValue("RenderSingle").equals(""))  ||tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionRuleFormLayoutBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""))){
tools.appendString(" isLoadDeferred='false' sectionBodyId='SubSectionRuleFormLayoutBBBB'");
}else{
tools.appendString(" isLoadDeferred='true' readonly='" + !tools.hasInputEnabled() + "' sectionBodyId='SubSectionRuleFormLayoutBBBB'");
}
tools.appendString(">");
String l_title="Specifications";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230423590601" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_3();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
}
public void invokeDeferLoadPreActivity_1() {
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()&&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){

						  {
						ParameterPage newParamsPage = new ParameterPage();
						 String strPropertyValue="";
						 String[] arReturn;
						 strPropertyValue="TempPlaceHolder";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"TempPlaceHolder",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("pyTempPlaceHolder", strPropertyValue);
						 newParamsPage.putString("pyTempPlaceHolder", "TempPlaceHolder");
						 HashStringMap keys = new HashStringMap();
						 keys.putString("pxObjClass", "Rule-Obj-Activity");
						 keys.putString("pyClassName",  tools.getStepPage().getString("pxObjClass") );
						 keys.putString("pyActivityName", "RefreshKeyList");
						 tools.doActivity(keys, tools.getStepPage(), newParamsPage);
						 } 
}
}
public void pzLayoutBodyWrapper_3() {
pzSection.getLayout().setExpandParam("SubSectionRuleFormLayoutBBB",null,false);
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionRuleFormLayoutBBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='3' id='INNERDIV-SubSectionRuleFormLayoutBBB' class='tabbed_expandInnerDivStyle'  style=\"display:none\"  >");
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
invokeDeferLoadPreActivity_1();
includeSectionBody_3();
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("LazyLoad");
tools.appendString("<div section_index='3' id='INNERDIV-SubSectionRuleFormLayoutBBB' class='tabbed_expandInnerDivStyle'  style='display:none'  >");
if(true && (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()  || "true".equals(tools.getParamValue("pyPegaDesignMode")))){
includeSectionBody_3();
}
}
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}


public void generateClientWhenDiv_2() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(currentTemplatingStatus =='N' )
	tools.appendString("id=\"CT\"");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
String strRWPreActivity = "";
strRWPreActivity = "";
if(currentTemplatingStatus =='N'){

}
String strDTransform = "";
strDTransform = "";
if(currentTemplatingStatus =='N') {
try {
tools.appendString("RWP=\".pyPageClass,.pyPropertyMode\" RW=\".pyPropertyMode != '' || .pyPageClass != ''\"");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
if(currentTemplatingStatus =='N')
tools.appendString(">");
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyPageClass"), -1);
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyPropertyMode"), -1);
	}
}catch(Exception e){}
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
	secInfo.put("packageSection", true);
	secInfo.put("packageSectionClass", "Rule-Obj-Property");
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(StringUtils.isBlank(expressionId)) {
		expressionId = pxUniqueStreamHash+"_9";
	}
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyPropertyMode != \'\' || .pyPageClass != \'\'", expressionId);
		if(StringUtils.isBlank(expressionId)) {
			expressionId = pxUniqueStreamHash+"_10";
		}
			expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyPropertyMode != \'\' || .pyPageClass != \'\'", expressionId);
			String strRWPreActivity = "";
			strRWPreActivity = "";
			String strDTransform = "";
			strDTransform = "";
			if(!StringUtils.isBlank(expressionId)) {
				secInfo.put("pyExpressionId", expressionId);
			}
			}
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_8","pzPropertyAdvanced", secInfo);
		}


public void includeSectionBody_3() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
	return;
	}
	String strSectionPageProp = "";
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
	pzPackageRuntime.packageSection(
	"pzPropertyAdvanced", tools.getStepPage().getReference(),"Rule-Obj-Property");}catch(Exception e1){oLog.error("Error generating package - " + e1.getMessage());}
	}
	generateClientWhenDiv_2();
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzPropertyAdvanced";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	tools.appendString("\n\t\t\t\t\t\t</div>");
	}
}

 public void pzHeaderBody_2(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="Advanced";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_2(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"Advanced\" title=\"Advanced\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='3' id='Tab2' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
 if(tools.getParamValue("EXPAND_ALL").equals("true") || (tools.getParamValue("EXPANDEDSubSectionRuleFormLayoutBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")).equals("true") && tools.getParamValue("RenderSingle").equals(""))  ||tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionRuleFormLayoutBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""))){
tools.appendString(" isLoadDeferred='false' sectionBodyId='SubSectionRuleFormLayoutBBB'");
}else{
tools.appendString(" isLoadDeferred='true' readonly='" + !tools.hasInputEnabled() + "' sectionBodyId='SubSectionRuleFormLayoutBBB'");
}
tools.appendString(">");
String l_title="Advanced";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230423590597" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_2();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void pzLayoutBodyWrapper_2() {
pzSection.getLayout().setExpandParam("SubSectionRuleFormLayoutBB",null,false);
tools.appendString("<div section_index='2' id='INNERDIV-SubSectionRuleFormLayoutBB' class='tabbed_expandInnerDivStyle'  >");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
includeSectionBody_2();
if(isParentTemplate){
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('N');
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}


public void generateClientWhenDiv_1() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(currentTemplatingStatus =='N' )
	tools.appendString("id=\"CT\"");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
String strRWPreActivity = "";
strRWPreActivity = "";
if(currentTemplatingStatus =='N'){

}
String strDTransform = "";
strDTransform = "";
if(currentTemplatingStatus =='N') {
try {
tools.appendString("RWP=\".pyPropertyMode\" RW=\".pyPropertyMode Changes\"");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
if(currentTemplatingStatus =='N')
tools.appendString(">");
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyPropertyMode"), -1);
	}
}catch(Exception e){}
}
public void buildSection_2() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",false);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	secInfo.put("packageSection", true);
	secInfo.put("packageSectionClass", "Rule-Obj-Property");
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(StringUtils.isBlank(expressionId)) {
		expressionId = pxUniqueStreamHash+"_6";
	}
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyPropertyMode Changes", expressionId);
		if(StringUtils.isBlank(expressionId)) {
			expressionId = pxUniqueStreamHash+"_7";
		}
			expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyPropertyMode Changes", expressionId);
			String strRWPreActivity = "";
			strRWPreActivity = "";
			String strDTransform = "";
			strDTransform = "";
			if(!StringUtils.isBlank(expressionId)) {
				secInfo.put("pyExpressionId", expressionId);
			}
			}
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_5","General", secInfo);
		}


public void includeSectionBody_2() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
	pzPackageRuntime.packageSection(
	"General", tools.getStepPage().getReference(),"Rule-Obj-Property");}catch(Exception e1){oLog.error("Error generating package - " + e1.getMessage());}
	}
	generateClientWhenDiv_1();
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "General";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	tools.appendString("\n\t\t\t\t\t\t</div>");
	}
}
public void groupHeaderStart_1() {
	if(!tools.getParamValue("pyPegaDesignMode").equals("true")) {
		tools.appendString("<div class='scrlCntr' data-hide-tab-scroll='true'>");
		pzAuto.emitIncludeStreamReference("pzMenuBarInclude", null, "null","Rule-HTML-Fragment",null);
		tools.appendString("<div class='harnessHeaderIcons rightborder'><span id='TABSPAN'><table cellspacing='0' cellpadding='0'><tr>");
		pzLayout.includeHeaderIcon("","tdRightStyle");tools.appendString("</tr></table></span></div><ol  title='" + tools.getLocalizedTextForString(".pyActionPrompt", "Currently open") + "' class=\"yui-nav tsb-menu tab-ul tab-ul-t tab-ul-t-ns  headerTabsList\"><li sel_prefix='tab-li-t-ns' class=\"tab-li tab-li-t tab-li-t-ns \" ><a  role= \"link\"  aria-haspopup=\"true\"  id=\"TABANCHOR\" tabindex=\"0\" aria-label=\"" + tools.getLocalizedTextForString(".pyActionPrompt", "Currently open") + "\"> <span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \" style=\"white-space: nowrap;\"><span class=\"textMiddle\"><span class=\"textIn\" inAnchor=\"\">&#x25BC;</span></span></span></a></li></ol><div class='tStrCntr'>");
		}
	tools.appendString("<ul role = \"tablist\" class=\"yui-nav tab-ul tab-ul-t tab-ul-t-ns  headerTabsList\"");
	tools.appendString("");tools.appendString(">");
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle="General";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_1(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"General\" title=\"General\"  aria-selected=\"true\" tabindex=\"0\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='2' id='Tab1' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns selected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
tools.appendString(">");
String l_title="General";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602230423590593" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_1();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void pzLayoutBodyWrapper_1() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " noHeadExpandInnerDivStyle'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_1();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_1() { 
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_3","RuleFormHeader", secInfo);
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "RefreshKeyList");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "pzGetAssociatedSpecifications");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
}


public void includeSectionBody_1() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "RuleFormHeader";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionRuleFormLayoutB","",false);
}
public void pzLayout_1() {
char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")) {
boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'RuleFormHeader'}") + ">");
}
pzSetExpandParam_1();
if(parentTemplatingStatus == 'Y') {
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
pzLayoutBodyWrapper_1();
if(bWrapIncSection){
tools.appendString("</span>");
}} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
}
public void pzGroup_1() {
	String expandedGrpId=tools.getParamCSF("EXPANDEDTGRuleFormLayoutA");
	String activatedGrpId=tools.getParamCSF("ACTIVATEDTGRuleFormLayoutA");
	String param_renderSingle=tools.getParamValue("RenderSingle");
	if(!expandedGrpId.equals("")){
		tools.putSaveValue("defaultTab", expandedGrpId);
	}else{
		tools.putSaveValue("defaultTab" ,"1");
	}
	
	activatedGrpId=tools.getParamCSF("ACTIVATEDTGRuleFormLayoutA");
	if(!activatedGrpId.equals("")){
		tools.putSaveValue("activeTab",activatedGrpId);
	}else{
		tools.putSaveValue("activeTab" ,"");
	}
	if(param_renderSingle.equals("") && !tools.getSaveValue("activeTab").equals("")) {
		tools.putSaveValue("defaultTab",tools.getSaveValue("activeTab"));
	}
	String defaultTabSaveValue=tools.getSaveValue("defaultTab");
	String activeTabSaveValue=tools.getSaveValue("activeTab");
	String bIsScreenLayout = tools.getParamValue("bIsScreenLayout");
	if("".equals(bIsScreenLayout)){
	 ClipboardPage pg_DDisplay = tools.findPage("Declare_pyDisplay",true);
	 if(pg_DDisplay != null){
				 ClipboardProperty cp_display =  pg_DDisplay.getIfPresent("pyDisplay");
						 if(cp_display != null){
	 String modelName = tools.getThread().getThreadPage().getString("pxPortal");
	 ClipboardPage pg_portalModel = cp_display.getPageValue(modelName);
	 if(pg_portalModel.getIfPresent("pyUIElements") != null &&  pg_portalModel.getIfPresent("pyUIElements").size() >0){
	 bIsScreenLayout = "true";
	 tools.putParamValue("bIsScreenLayout","true");
	}}}}
	String sectionHasDynamicLayout = "false";
	if(("true").equalsIgnoreCase(bIsScreenLayout) && ("true").equals(sectionHasDynamicLayout)){
	tools.appendString("<div class = \"dc-main\">");
	}
	tools.appendString("<div " + pzSection.getLayout().getInspectorData("TABGROUP", ".pySections(2)") + " id='PEGA_TABBED'   tabGroupId='TGRuleFormLayoutA' tabGroupName='' activeWhenTab = '" + activeTabSaveValue + "' defaultTab='" + defaultTabSaveValue + "' class= 'yui-navset pegaTabGrp yui-navset-top headerTabbed headerTabbed-t' data-taberror=\"" + tools.getLocalizedTextForString("pxRequestor.pyMessageLabel","TabErrorTooltip")  + " \"  data-pos=\"Top\">");
	if(!("true").equalsIgnoreCase(bIsScreenLayout) || !("true").equals(sectionHasDynamicLayout)){
	if(param_renderSingle.equals("")){
		boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
	 String param_Index=tools.getParamValue("index");
	String expandedSecId="";
	 String expandRLExprValue=(bExpandRL?param_Index:"");expandedSecId="EXPANDEDSubSectionRuleFormLayoutBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("1")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionRuleFormLayoutBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("2")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionRuleFormLayoutBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("3")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionRuleFormLayoutBBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("4")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}
		groupHeaderStart_1();
groupHeaderItem_1();
groupHeaderItem_2();
groupHeaderItem_3();
groupHeaderItem_4();
groupHeaderEnd_1();
	}
	}
	if(("true").equalsIgnoreCase(bIsScreenLayout)){
	tools.appendString("<div  data-stcd=\"1\" class=\"yui-content contents tabContent");
	}else{
	tools.appendString("<div  data-stcd=\"1\" class=\"yui-content tabContent");
	}
	tools.appendString("\">");
	boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
	if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_2();if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_3();if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");} if(pzAuto.handleEvaluateWhen(" wxpzIsLinkableRuleType","pzIsLinkableRuleType", "layout", "visible" )) {pzLayoutBodyWrapper_4();}if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_5();
	tools.appendString("</div><input type='hidden' name='EXPANDEDTGRuleFormLayoutA");
	new java.util.Random().nextInt();tools.appendString("'  value='" + expandedGrpId + "'/>");
	
	if(!("true").equalsIgnoreCase(bIsScreenLayout) || !("true").equals(sectionHasDynamicLayout)){
	}
	tools.appendString("</div>");
	if(("true").equalsIgnoreCase(bIsScreenLayout) && ("true").equals(sectionHasDynamicLayout)){
	tools.appendString("</div>");
	}
}

private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Rule-Obj-Property");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMLAYOUT #20180713T135658.340 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-SystemArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "RuleFormLayout");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMLAYOUT #20180713T135658.340 GMT", "Rule-Obj-Property RuleFormLayout", "Pega-SystemArchitect", "08-01-01", "20180713T135658.340 GMT");
}
