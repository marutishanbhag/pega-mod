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
 * Builds JSP stream EMBED-STAGEPROCESS!PZDISPLAYSTEPPALETTE.
 */
public class ra_stream_pzdisplaysteppalette_16e9ec5072e1438373825c4a404408ad extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzDisplayStepPalette.Embed_StageProcess.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1667524340;
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
	public ra_stream_pzdisplaysteppalette_16e9ec5072e1438373825c4a404408ad(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "f87878aa76775073e61146d3d501dab895027190";
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
/* Instance RULE-HTML-SECTION EMBED-STAGEPROCESS PZDISPLAYSTEPPALETTE #20180914T195414.986 GMT	Pega-ProcessArchitect:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "f87878aa76775073e61146d3d501dab895027190";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzDisplayStepPalette",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION EMBED-STAGEPROCESS PZDISPLAYSTEPPALETTE #20180914T195414.986 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION EMBED-STAGEPROCESS PZDISPLAYSTEPPALETTE #20180914T195414.986 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION EMBED-STAGEPROCESS PZDISPLAYSTEPPALETTE #20180914T195414.986 GMT */
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
	"Rule-HTML-Section:PZDISPLAYSTEPPALETTE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZDISPLAYSTEPPALETTE","Rule-HTML-Section","EMBED-STAGEPROCESS",false,"","Pega-ProcessArchitect","08-02-01","RULE-HTML-SECTION EMBED-STAGEPROCESS PZDISPLAYSTEPPALETTE #20180914T195414.986 GMT","!PZDISPLAYSTEPPALETTE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1667524340)
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
//	RULE-HTML-SECTION EMBED-STAGEPROCESS PZDISPLAYSTEPPALETTE #20180914T195414.986 GMT:20180914T195414.986 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	GetRDLRow_2( {"listSource", "String", ""},  {"index", "int", "0"}
//	getNextPage_1( {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}
//	simpleLayout_1(
//	simpleLayout_2(
//	getNextPage_2( {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}
//	simpleLayout_3(
//	GetRDLRow_1( {"listSource", "String", ""},  {"index", "int", "0"}
//	simpleLayout_4(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPREDATATRANSFORM #20180713T133339.990 GMT:20180713T133339.990 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETREFRESHWHENPREACTIVITY #20180713T133340.025 GMT:20180713T133340.025 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ebc489243a598fc51723178488a3188d";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-StageProcess";
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
  pzSection.beginSection("pzDisplayStepPalette",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzDisplayStepPalette','insKey':'RULE-HTML-SECTION EMBED-STAGEPROCESS PZDISPLAYSTEPPALETTE #20180914T195414.986 GMT','sectionType':'standard'}");
pzLayout_5();
pzLayout_7();
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
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pySectionName", "pzDisplayStepPalette");
pega.getUIEngine().getUIAction("rdlpagination", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pySectionName", "pzDisplayStepPalette");
pega.getUIEngine().getUIAction("rdlpagination", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBody_4() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
}
public void pzLayoutBodyWrapper_7() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_6() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_6();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_6() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_28","pxContextualPromptWithPreview", secInfo);
}


public void sectionBodyIncludeInCell_6() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_6();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pxContextualPromptWithPreview"; 
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
public void pzSetExpandParam_7() {
pzSection.getLayout().setExpandParam("SubSectionCellpzDisplayStepPalette420","",false);
}
public void pzLayout_6() {
pzSetExpandParam_7();
pzLayoutBodyWrapper_6();
}
public void buildSection_5() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_25","pxContextualPromptWithPreview", secInfo);
}


public void sectionBodyIncludeInCell_5() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pxContextualPromptWithPreview"; 
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


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pxContextualPromptWithPreview",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + "   flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_5();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pxContextualPromptWithPreview",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_6();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_6() {
pzSection.getLayout().setExpandParam("SubSectionpzDisplayStepPaletteBBBB","",false);
}


public void simpleLayout_4() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash24 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash24 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash24 != null && !"".equals(spxUniqueStreamHash24)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash24,pxUniqueStreamHash+"_24");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201808311427400119683") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
		tools.putParamValue("bIsWrapperAdded", "true");
		}
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='" + "flex  content  layout-content-simple_list content-simple_list " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash24 != null && !"".equals(spxUniqueStreamHash24)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_24");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","simple_list");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("lMode","SimpleDiv");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_5(index);
	}else{
		index=simpleLayoutTemplateCell_3(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("</div></div>");
		tools.putParamValue("bIsWrapperAdded", "false");
		}
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_4() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpzDisplayStepPaletteBBBB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2== rx.pyContextInfo.pyDisplayReuseGadget cqShowReuseGadget", pxUniqueStreamHash+"_29");metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_29");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_4();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_7() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2== rx.pyContextInfo.pyDisplayReuseGadget cqShowReuseGadget",".pyContextInfo.pyDisplayReuseGadget == \'ShowReuseGadget\'", "layout", "visible" )) {pzSetExpandParam_6();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_7();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
public void pzLayoutBodyWrapper_5() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_4() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void getNextPage_2(String listSource, int listStartIndex, int listEndIndex) {
	IUIComponent nextPageComponent = pzAuto.getUIComponent(IUIComponent.ComponentType.NEWPAGE);
	ClipboardProperty rdlPageListProp = tools.getProperty(listSource);
	int totalRecords = rdlPageListProp.size();
	listEndIndex = (listEndIndex < 0 || listEndIndex > totalRecords) ? totalRecords : listEndIndex;
	Map map = new HashMap();
	Map<String, String> indexMap = new HashMap<String, String>();
	indexMap.put("pyStartIndex",Integer.toString(listStartIndex));
	indexMap.put("pyEndIndex",Integer.toString(listEndIndex));
	map.put("pxDataSourceId", pxUniqueStreamHash+"_18");
	map.put("pyContext", listSource);
	map.put("pyPagination", indexMap);
	IUIComponentMetadata nextPageMetadata = pzAuto.getUIComponentRuntime().createMetadata();
	nextPageMetadata.put("datasrcid",pxUniqueStreamHash+"_18");
	nextPageMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("201808311427400117296" ) + "");
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
		simpleLayoutCell_3(1);
	pega.popStackFrame(itemFrame, false);
	}
	nextPageComponent.endComponent();
	}
	

public void GetRDLRow_2(String listSource, int index) {
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
		int cellIndex=simpleLayoutCell_3(index);
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
		repeatingRow.endComponent();
		}
		pega.popStackFrame(itemFrame, false);
		tools.appendString("||RDLROWMARKUP_END||");
		}
		}
public void pzLayoutBodyWrapper_3() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_4();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_4() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_16","pzPaletteLink", secInfo);
}


public void sectionBodyIncludeInCell_4() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pzPaletteLink"; 
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
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionCellpzDisplayStepPalette707","",false);
}
public void pzLayout_3() {
pzSetExpandParam_5();
pzLayoutBodyWrapper_3();
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_13","pzPaletteLink", secInfo);
}


public void sectionBodyIncludeInCell_3() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pzPaletteLink"; 
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


public int simpleLayoutCell_3(  int index) {
	String labelName="";
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzPaletteLink",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row ' ");
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
	tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201808311427400117296-" + rowTestID) + " ");
	}else {
	tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getStepPage().getReference(),"") + "' ");
	}
	tools.appendString(" STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_3();tools.putParamValue("RenderSingle",tempRenderSingle);
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
	baseRef +="D_pxDisplayStepPalette.pxResults(";
	 baseRef += strSub; 
	baseRef += ")";
	}else {
	baseRef += tools.getStepPage().getReference();
	}
	baseRef += "'";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzPaletteLink",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_3();
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
public void pzTemplateRDL_2() {
IUIComponentMetadata pgRDMetadata = null;
IUIComponentMetadata pgSection = null;  
IUIComponentMetadata pgSectionBody = null;  
IUIComponentMetadata pgCells  = null; 
IUIComponentMetadata pyRDDataPageParams = null;
IUIComponent cc = pzAuto.getUIComponent(IUIComponent.ComponentType.RDL);
String pyInstanceId ="";
char mode = tools.getProperty("D_pxDisplayStepPalette.pxResults").getMode();
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
pgRDMetadata = pzAuto.getUIComponentRuntime().createMetadata();
pgRDMetadata.put("pyProcessChildren","false");
String strLayoutMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
pgRDMetadata.put("methodnm",strLayoutMethodName);
pgSection = pzAuto.getUIComponentRuntime().createMetadata();
pgSectionBody = pzAuto.getUIComponentRuntime().createMetadata();
pgCells = pzAuto.getUIComponentRuntime().createMetadata();
pgSection.put("class","content    flex  layout-content-inline content-inline step-palette"); 
pgSection.put("liveUI","" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + ""); 
pgRDMetadata.put("rdlnavigationtype","tabkey");
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression;
if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
expressionId = pxUniqueStreamHash+"_17";
expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  "D_pxDisplayStepPalette.pxResults AddDelete", expressionId, true);
expressionId = expression.getId();
}
ClipboardProperty rdlPageListProp = tools.getProperty("D_pxDisplayStepPalette.pxResults");
String rdlPageListPropRef = "D_pxDisplayStepPalette.pxResults";
if(rdlPageListProp != null) {
rdlPageListPropRef = rdlPageListProp.getReference();
}
String rdlRefreshWhenStr = "D_pxDisplayStepPalette.pxResults AddDelete";
rdlRefreshWhenStr = rdlRefreshWhenStr.replace("D_pxDisplayStepPalette.pxResults",rdlPageListPropRef);
if(!StringUtils.isBlank(expressionId)) {
	pgRDMetadata.put("pyExpressionId", expressionId);
}
pgRDMetadata.put("nextpg","getNextPage_2");
pgRDMetadata.put("pyenableswipe","false");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"", false).replaceFirst("_pa[0-9]+pz","")); 
} else {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"",false)); 
}
pgSectionBody.put("sourcetype","Property");
Map map = new HashMap();
Map paramsMap = new HashMap();
map.put("params", paramsMap);
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pzPackageRuntime.packageProperty(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(), null);
}
pgSectionBody.put("dpname","");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgRDMetadata.put("generatePath","true");
}
pgSectionBody.addMetadataInArray("cells",pgCells);
pgSection.addMetadataInArray("sectionbody",pgSectionBody);
pgRDMetadata.putMetadata("section",pgSection);
pyInstanceId =String.valueOf(System.currentTimeMillis());
pgRDMetadata.put("uniqueid", "RDL" + pyInstanceId);
pgRDMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("201808311427400117296" ) + "");
cc.addDependentScripts("pzpega_ui_RDLTemplate.js");
cc.addDependentScripts("pzpega_ui_RDLRowTemplate.js");
cc.addAdditionalScripts("rdlincludes","pzpega_ui_rdl.js");
pgRDMetadata.put("rowmethod","GetRDLRow_2");
map.put("pyContext", "D_pxDisplayStepPalette.pxResults");
cc.beginComponent("RepeatingDynamicLayout",pgRDMetadata,map);
Map<String,String> repeatMap  = null; if(tools.getParameterPage().getParameterValue("pzRepeatProperties")!=null){
repeatMap = (Map<String,String>)tools.getParameterPage().getParameterValue("pzRepeatProperties");
}else {
repeatMap = new HashMap<String,String>();
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""), "RDL" + pyInstanceId);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"", false),pyInstanceId);
}
tools.getParameterPage().putObject("pzRepeatProperties",repeatMap);
ClipboardProperty cpSource = tools.getProperty("D_pxDisplayStepPalette.pxResults");
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
dummyPageName = "DummyD_pxDisplayStepPalette_pxResults";
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""),"RDL" + pyInstanceId + ":" + dummyPageName);
itemPage = tools.createPage("Embed-StageProcess",dummyPageName);
PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
simpleLayoutCell_3(1);
	pega.popStackFrame(itemFrame, false);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"",false),pyInstanceId + ":" + dummyPageName);
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
	simpleLayoutCell_3(1);
	}
	pega.popStackFrame(itemFrame, false);
}
}}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""));
} else {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"", false));
}
cc.endComponent();
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
		pzPackageRuntime.packageSection("pzDisplayStepPalette",
		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
		}
		}
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzDisplayStepPaletteBBB","",false);
}


public void simpleLayout_2() {
	String strRWPreActivity = "";
	strRWPreActivity = "";
	
	String strDTransform = "";
	strDTransform = "";
	pega_rules_utilities.pzRegisterActivity(tools, "ShowStream");
	boolean bGenerateNonTemplateRDL = false;
	if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled() && !bGenerateNonTemplateRDL) {
	pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	HashStringMap whenKeys= new HashStringMap();
	whenKeys.put("pxObjClass","Rule-Obj-When");
	whenKeys.put("pyClassName",tools.getPrimaryPage().getString("pxObjClass"));
	whenKeys.put("pyBlockName","pzIsRDLTemplatized");
	boolean isRDLTemplatized = tools.evaluateWhen(whenKeys);
	if(pzAuto.getUIComponentRuntime().isTemplateRendering() || isRDLTemplatized) {
	pzTemplateRDL_2();
	return;
	}
	} else {
	bGenerateNonTemplateRDL = true;
	tools.putParamValue("bGenerateNonTemplateRDL","true");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_19");
	}
	int totalRecords=0;
	tools.appendString("<div class='rdlWrapperDiv'>");
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
	tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
	tools.putParamValue("bIsWrapperAdded", "true");
	}
	tools.appendString("<div bSimpleLayout='true' " + "data-repeat-source= '");
	tools.appendString(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference()+ "' ");
	tools.appendString(" " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "  class=' flex content   layout-content-inline content-inline step-palette ' ");
	String strMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
	ClipboardProperty rdlPageListProperty = tools.getProperty("D_pxDisplayStepPalette.pxResults");
	String rdlPageListPropRef = "D_pxDisplayStepPalette.pxResults";
	if(rdlPageListProperty != null) {
	rdlPageListPropRef = rdlPageListProperty.getReference();
	}
	String rdlRefreshWhenStr = "D_pxDisplayStepPalette.pxResults AddDelete";
	rdlRefreshWhenStr = rdlRefreshWhenStr.replace("D_pxDisplayStepPalette.pxResults",rdlPageListPropRef);
	tools.appendString(" data-refresh=\"true\" data-methodName='" + strMethodName + "' data-rowmethodname='GetRDLRow_2' ");
try {
tools.appendString("RWP=\".pxResults\" RW=\"");
tools.appendString(rdlRefreshWhenStr);
tools.appendString("\"");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201808311427400117296" ) + " ");
	tools.appendString(">");
	int index = 1;
	tools.putParamValue("bIsRDL","true");
	String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
	String rptDynamicIdx_prefix = "";
	if(!"".equals(rptDynamicIdx)) rptDynamicIdx_prefix = rptDynamicIdx + "_";
	ClipboardProperty rdlPageListProp =null;
	if (tools.getParamValue("pyPegaDesignMode").equals("true")) { return;}
	rdlPageListProp = tools.getProperty("D_pxDisplayStepPalette.pxResults");
	totalRecords = rdlPageListProp.size();
	Iterator itemPages = rdlPageListProp.iterator();
	while(itemPages.hasNext()) {
		ClipboardPage itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx_prefix + index);
		tools.putParamValue("pega_RLindex",rptDynamicIdx_prefix +index);
		tools.putParamValue("expandRL","true");
		index=simpleLayoutCell_3(index);
	tools.putParamValue("expandRL","false");
		pega.popStackFrame(itemFrame, false);
	}
	tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx);
	tools.putParamValue("bIsRDL","");
	tools.putParamValue("pega_RLindex","");
	tools.appendString("</div>");
	if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
	tools.appendString("</div></div>");
	tools.putParamValue("bIsWrapperAdded", "false");
	}
	tools.appendString("</div>");
	if(bGenerateNonTemplateRDL) {
	tools.getParameterPage().remove("bGenerateNonTemplateRDL");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	}
}
public void pzLayoutContainer_2() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
String expressionId_BV = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
if(!StringUtils.isBlank(expressionId_BV)) {
	metadataPage.put("expressionId_BV",expressionId_BV);
}
String paramName = "EXPANDEDSubSectionpzDisplayStepPaletteBBB";
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
IUIComponent containerComponent = pzAuto.getUIComponent();
com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxpzIsCaseOptionalActions", pxUniqueStreamHash+"_20");metadataPage.put("dlChild","true");
metadataPage.put("lMode","SimpleDiv");
IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_20");
metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
if(pyVisibility) {
pzLayoutBody_2();
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
if(pzAuto.handleEvaluateWhen(" wxpzIsCaseOptionalActions","pzIsCaseOptionalActions", "layout", "visible" )) {pzSetExpandParam_4();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_4();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_2() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
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
	map.put("pxDataSourceId", pxUniqueStreamHash+"_8");
	map.put("pyContext", listSource);
	map.put("pyPagination", indexMap);
	IUIComponentMetadata nextPageMetadata = pzAuto.getUIComponentRuntime().createMetadata();
	nextPageMetadata.put("datasrcid",pxUniqueStreamHash+"_8");
	nextPageMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("201808311427400117296" ) + "");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_6","pzPaletteLink", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pzPaletteLink"; 
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
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionCellpzDisplayStepPalette689","",false);
}
public void pzLayout_1() {
pzSetExpandParam_3();
pzLayoutBodyWrapper_1();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_3","pzPaletteLink", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pzPaletteLink"; 
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


public int simpleLayoutCell_1(  int index) {
	String labelName="";
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') {
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzPaletteLink",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row ' ");
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
	tools.appendString( " " + pzSection.getLayout().getTestIdIfEnabled("201808311427400117296-" + rowTestID) + " ");
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
	baseRef +="D_pxDisplayStepPalette.pxResults(";
	 baseRef += strSub; 
	baseRef += ")";
	}else {
	baseRef += tools.getStepPage().getReference();
	}
	baseRef += "'";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
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
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzPaletteLink",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
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
char mode = tools.getProperty("D_pxDisplayStepPalette.pxResults").getMode();
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
pgRDMetadata = pzAuto.getUIComponentRuntime().createMetadata();
pgRDMetadata.put("pyProcessChildren","false");
String strLayoutMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
pgRDMetadata.put("methodnm",strLayoutMethodName);
pgSection = pzAuto.getUIComponentRuntime().createMetadata();
pgSectionBody = pzAuto.getUIComponentRuntime().createMetadata();
pgCells = pzAuto.getUIComponentRuntime().createMetadata();
pgSection.put("class","content    flex  layout-content-inline_grid_double content-inline_grid_double step-palette"); 
pgSection.put("liveUI","" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + ""); 
pgRDMetadata.put("rdlnavigationtype","tabkey");
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression;
if (!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
expressionId = pxUniqueStreamHash+"_7";
expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("refreshWhen",  "D_pxDisplayStepPalette.pxResults AddDelete", expressionId, true);
expressionId = expression.getId();
}
ClipboardProperty rdlPageListProp = tools.getProperty("D_pxDisplayStepPalette.pxResults");
String rdlPageListPropRef = "D_pxDisplayStepPalette.pxResults";
if(rdlPageListProp != null) {
rdlPageListPropRef = rdlPageListProp.getReference();
}
String rdlRefreshWhenStr = "D_pxDisplayStepPalette.pxResults AddDelete";
rdlRefreshWhenStr = rdlRefreshWhenStr.replace("D_pxDisplayStepPalette.pxResults",rdlPageListPropRef);
if(!StringUtils.isBlank(expressionId)) {
	pgRDMetadata.put("pyExpressionId", expressionId);
}
pgRDMetadata.put("nextpg","getNextPage_1");
pgRDMetadata.put("pyenableswipe","false");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"", false).replaceFirst("_pa[0-9]+pz","")); 
} else {
pgSectionBody.put("pageListProp",pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"",false)); 
}
pgSectionBody.put("sourcetype","Property");
Map map = new HashMap();
Map paramsMap = new HashMap();
map.put("params", paramsMap);
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pzPackageRuntime.packageProperty(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(), null);
}
pgSectionBody.put("dpname","");
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
pgRDMetadata.put("generatePath","true");
}
pgSectionBody.addMetadataInArray("cells",pgCells);
pgSection.addMetadataInArray("sectionbody",pgSectionBody);
pgRDMetadata.putMetadata("section",pgSection);
pyInstanceId =String.valueOf(System.currentTimeMillis());
pgRDMetadata.put("uniqueid", "RDL" + pyInstanceId);
pgRDMetadata.put("automationId", "" + pzSection.getLayout().getTestIdIfEnabled("201808311427400117296" ) + "");
cc.addDependentScripts("pzpega_ui_RDLTemplate.js");
cc.addDependentScripts("pzpega_ui_RDLRowTemplate.js");
cc.addAdditionalScripts("rdlincludes","pzpega_ui_rdl.js");
pgRDMetadata.put("rowmethod","GetRDLRow_1");
map.put("pyContext", "D_pxDisplayStepPalette.pxResults");
cc.beginComponent("RepeatingDynamicLayout",pgRDMetadata,map);
Map<String,String> repeatMap  = null; if(tools.getParameterPage().getParameterValue("pzRepeatProperties")!=null){
repeatMap = (Map<String,String>)tools.getParameterPage().getParameterValue("pzRepeatProperties");
}else {
repeatMap = new HashMap<String,String>();
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""), "RDL" + pyInstanceId);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"", false),pyInstanceId);
}
tools.getParameterPage().putObject("pzRepeatProperties",repeatMap);
ClipboardProperty cpSource = tools.getProperty("D_pxDisplayStepPalette.pxResults");
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
dummyPageName = "DummyD_pxDisplayStepPalette_pxResults";
}
if (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""),"RDL" + pyInstanceId + ":" + dummyPageName);
itemPage = tools.createPage("Embed-StageProcess",dummyPageName);
PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
simpleLayoutCell_1(1);
	pega.popStackFrame(itemFrame, false);
} else {
repeatMap.put(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"",false),pyInstanceId + ":" + dummyPageName);
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
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"",false).replaceFirst("_pa[0-9]+pz",""));
} else {
repeatMap.remove(pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference(),"", false));
}
cc.endComponent();
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
		pzPackageRuntime.packageSection("pzDisplayStepPalette",
		tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
		}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
		}
		}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzDisplayStepPaletteBB","",false);
}


public void simpleLayout_1() {
	String strRWPreActivity = "";
	strRWPreActivity = "";
	
	String strDTransform = "";
	strDTransform = "";
	pega_rules_utilities.pzRegisterActivity(tools, "ShowStream");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_9");
	}
	int totalRecords=0;
	tools.appendString("<div class='rdlWrapperDiv'>");
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
	tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
	tools.putParamValue("bIsWrapperAdded", "true");
	}
	tools.appendString("<div bSimpleLayout='true' " + "data-repeat-source= '");
	tools.appendString(tools.getProperty("D_pxDisplayStepPalette.pxResults").getReference()+ "' ");
	tools.appendString(" " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "  class=' flex content   layout-content-inline_grid_double content-inline_grid_double step-palette ' ");
	String strMethodName = tools.getParamValue("LAYOUT_METHOD_NAME");
	ClipboardProperty rdlPageListProperty = tools.getProperty("D_pxDisplayStepPalette.pxResults");
	String rdlPageListPropRef = "D_pxDisplayStepPalette.pxResults";
	if(rdlPageListProperty != null) {
	rdlPageListPropRef = rdlPageListProperty.getReference();
	}
	String rdlRefreshWhenStr = "D_pxDisplayStepPalette.pxResults AddDelete";
	rdlRefreshWhenStr = rdlRefreshWhenStr.replace("D_pxDisplayStepPalette.pxResults",rdlPageListPropRef);
	tools.appendString(" data-refresh=\"true\" data-methodName='" + strMethodName + "' data-rowmethodname='GetRDLRow_1' ");
try {
tools.appendString("RWP=\".pxResults\" RW=\"");
tools.appendString(rdlRefreshWhenStr);
tools.appendString("\"");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	tools.appendString(" " + pzSection.getLayout().getTestIdIfEnabled("201808311427400117296" ) + " ");
	tools.appendString(">");
	int index = 1;
	tools.putParamValue("bIsRDL","true");
	String rptDynamicIdx = tools.getParamValue("RepeatDynamicIndex");
	String rptDynamicIdx_prefix = "";
	if(!"".equals(rptDynamicIdx)) rptDynamicIdx_prefix = rptDynamicIdx + "_";
	ClipboardProperty rdlPageListProp =null;
	if (tools.getParamValue("pyPegaDesignMode").equals("true")) { return;}
	rdlPageListProp = tools.getProperty("D_pxDisplayStepPalette.pxResults");
	totalRecords = rdlPageListProp.size();
	Iterator itemPages = rdlPageListProp.iterator();
	while(itemPages.hasNext()) {
		ClipboardPage itemPage = ((ClipboardProperty)itemPages.next()).getPageValue();
		PRStackFrame itemFrame = pega.pushStackFrame("DynamicItem", null, itemPage, true, false);
		tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx_prefix + index);
		tools.putParamValue("pega_RLindex",rptDynamicIdx_prefix +index);
		tools.putParamValue("expandRL","true");
		index=simpleLayoutCell_1(index);
	tools.putParamValue("expandRL","false");
		pega.popStackFrame(itemFrame, false);
	}
	tools.putParamValue("RepeatDynamicIndex", rptDynamicIdx);
	tools.putParamValue("bIsRDL","");
	tools.putParamValue("pega_RLindex","");
	tools.appendString("</div>");
	if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
	tools.appendString("</div></div>");
	tools.putParamValue("bIsWrapperAdded", "false");
	}
	tools.appendString("</div>");
	if(bGenerateNonTemplateRDL) {
	tools.getParameterPage().remove("bGenerateNonTemplateRDL");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	}
}
public void pzLayoutContainer_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
String expressionId_BV = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
if(!StringUtils.isBlank(expressionId_BV)) {
	metadataPage.put("expressionId_BV",expressionId_BV);
}
String paramName = "EXPANDEDSubSectionpzDisplayStepPaletteBB";
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICREPEATING','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
IUIComponent containerComponent = pzAuto.getUIComponent();
com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o1! wxpzIsCaseOptionalActions", pxUniqueStreamHash+"_10");metadataPage.put("dlChild","true");
metadataPage.put("lMode","SimpleDiv");
IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_10");
metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
if(pyVisibility) {
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
if(pzAuto.handleEvaluateWhen(" o1! wxpzIsCaseOptionalActions","!pzIsCaseOptionalActions", "layout", "visible" )) {pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_2();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
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
public String 
getUIActionsMetaData_1() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();
	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o1! wxpzIsCaseOptionalActions","!pzIsCaseOptionalActions","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_2();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o1! wxpzIsCaseOptionalActions",pxUniqueStreamHash+"_12");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_12");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","!pzIsCaseOptionalActions");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Embed-StageProcess");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_12");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o1! wxpzIsCaseOptionalActions", pxUniqueStreamHash+"_12"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_2();
 tools.putSaveValue("ContainerID", "");}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxpzIsCaseOptionalActions","pzIsCaseOptionalActions","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_4();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-all-spacing flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = false;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzIsCaseOptionalActions",pxUniqueStreamHash+"_22");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_22");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzIsCaseOptionalActions");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Embed-StageProcess");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_22");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpzIsCaseOptionalActions", pxUniqueStreamHash+"_22"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_4();
 tools.putSaveValue("ContainerID", "");}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzDisplayStepPaletteB","",false);
}


public void simpleLayout_3() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash2 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash2 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash2 != null && !"".equals(spxUniqueStreamHash2)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash2,pxUniqueStreamHash+"_2");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201809121530370824808") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
		tools.putParamValue("bIsWrapperAdded", "true");
		}
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-stacked content-stacked " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash2 != null && !"".equals(spxUniqueStreamHash2)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_2");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","stacked");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("clear","false");
		pg_dlmeta.put("lMode","SimpleDiv");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_2(index);
	}else{
		index=simpleLayoutTemplateCell_1(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_4(index);
	}else{
		index=simpleLayoutTemplateCell_2(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("</div></div>");
		tools.putParamValue("bIsWrapperAdded", "false");
		}
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_3() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpzDisplayStepPaletteB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o2!= rx.pyContextInfo.pyDisplayReuseGadget cqShowReuseGadget", pxUniqueStreamHash+"_23");metadataPage.put("lMode","SimpleDiv");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_23");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_3();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_5() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2!= rx.pyContextInfo.pyDisplayReuseGadget cqShowReuseGadget",".pyContextInfo.pyDisplayReuseGadget != \'ShowReuseGadget\'", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_5();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
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
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Embed-StageProcess");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION EMBED-STAGEPROCESS PZDISPLAYSTEPPALETTE #20180914T195414.986 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzDisplayStepPalette");
	oStreamProperties_1.put("pyRuleSetVersion", "08-02-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("GetRDLRow_2", new String[][] { {"listSource", "String", ""},  {"index", "int", "0"}});
pzExternalMethodMapping.put("getNextPage_1", new String[][] { {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("getNextPage_2", new String[][] { {"listSource", "String", ""},  {"listStartIndex", "int", "0"},  {"listEndIndex", "int", "0"}});
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
pzExternalMethodMapping.put("GetRDLRow_1", new String[][] { {"listSource", "String", ""},  {"index", "int", "0"}});
pzExternalMethodMapping.put("simpleLayout_4", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION EMBED-STAGEPROCESS PZDISPLAYSTEPPALETTE #20180914T195414.986 GMT", "Embed-StageProcess pzDisplayStepPalette", "Pega-ProcessArchitect", "08-02-01", "20180914T195414.986 GMT");
}
