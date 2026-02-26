package com.pegarules.generated.html_section;
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
 * Builds JSP stream DATA-PORTAL-PEGAADMINSTUDIO!PZADMINSTUDIOMAIN.
 */
public class ra_stream_pzadminstudiomain_4a8ec050eb6429624d8fb6177d7fadde extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzAdminStudioMain.Data_Portal_PegaAdminStudio.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1597491309;
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
	public ra_stream_pzadminstudiomain_4a8ec050eb6429624d8fb6177d7fadde(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "28b24036096b6212d274531cd36667736eae45ed";
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
/* Instance RULE-HTML-SECTION DATA-PORTAL-PEGAADMINSTUDIO PZADMINSTUDIOMAIN #20180713T135157.795 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "28b24036096b6212d274531cd36667736eae45ed";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzAdminStudioMain",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION DATA-PORTAL-PEGAADMINSTUDIO PZADMINSTUDIOMAIN #20180713T135157.795 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION DATA-PORTAL-PEGAADMINSTUDIO PZADMINSTUDIOMAIN #20180713T135157.795 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION DATA-PORTAL-PEGAADMINSTUDIO PZADMINSTUDIOMAIN #20180713T135157.795 GMT */
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
	"Rule-HTML-Section:PZADMINSTUDIOMAIN"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZADMINSTUDIOMAIN","Rule-HTML-Section","DATA-PORTAL-PEGAADMINSTUDIO",false,"","Pega-Desktop","08-01-01","RULE-HTML-SECTION DATA-PORTAL-PEGAADMINSTUDIO PZADMINSTUDIOMAIN #20180713T135157.795 GMT","!PZADMINSTUDIOMAIN",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1597491309)
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
//	RULE-HTML-SECTION DATA-PORTAL-PEGAADMINSTUDIO PZADMINSTUDIOMAIN #20180713T135157.795 GMT:20180713T135157.795 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDYNAMICCONTAINER--(CLIBFE6765C56269549A2FABEAB6C2F5146 #20210819T133932.196 GMT:20210819T133932.196 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGB2D03618C4D6FCE3A07CB882EBEA3D958 #20201222T180835.601 GMT:20201222T180835.601 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "866391960a6048db59b452fccdbbc751";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal-PegaAdminStudio";
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
  pzSection.beginSection("pzAdminStudioMain",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzAdminStudioMain','insKey':'RULE-HTML-SECTION DATA-PORTAL-PEGAADMINSTUDIO PZADMINSTUDIOMAIN #20180713T135157.795 GMT','sectionType':'standard'}");

tools.putParamValue("pyIsDCSPA","true");tools.putParamValue("pyIsMultiSession","false");elementModel_1("c83a7abd-ec92-4470-afb4-b6436c220fba","5bea58d6-0c9a-4f05-bc8c-20c9e85b4525","Title","true","1","Harness","Loaded","NoIFrame","true");pzLayout_1();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void pzLayoutBody_1() {
includeSectionBody_1();
}
public void pzLayoutBodyWrapper_1() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_1();
}
tools.putSaveValue("rowClass","");
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void isSPADC_1(){
tools.putParamValue("pyIsSPA","true");
}


public void includeSectionBody_1() { 
	buildWhiteList_1();
	String strSectionPageProp = "";
	isSPADC_1();
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		 try {
			 pzPackageRuntime.getOfflineUtils().setHasDynamicContainer(true);
		} catch(Exception e) {
			 oLog.error("Packaging | Failed to set has dynamic container flag in offline utils", e);
		}
	} 

	try {
		if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")) {
			com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			if(!pzAuto.isOffline()){
				dataModelChangeTracker.trackValueChanges(tools.findPage("Declare_pzRecentsCache").getProperty("pyClearedRecentItems"),-1);
			}
		}
	}catch(Exception e){}
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
				}
			}
		}
	}
	((PegaAPI)tools).getUIEngine().getDCInstance().registerActionsForSingleDocPortals(true);
	if(("true").equalsIgnoreCase(bIsScreenLayout)){
	String strSectionDetails = tools.getParamValue("sectionsDetails");
	String strIncludedScripts = tools.getParamValue("strIncludedScripts");
		pega_uiengine_portal.pzGeneratePortalElementModel(tools, strSectionDetails, "pzAdminStudioMain", strIncludedScripts);
	}
	IUIComponentMetadata dcMetadata = pzAuto.getUIComponentRuntime().createMetadata();
	java.util.HashMap dcParamsMap = null;
	dcMetadata.put("liveUI","" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyAdminStudioDashboard'}") + "");
	dcMetadata.put("DCMode","Single");
	dcMetadata.put("tabGrpName","c83a7abd-ec92-4470-afb4-b6436c220fba");
	dcMetadata.put("isFrameless","true");
	dcMetadata.put("isHarnessInclude","true");
	dcMetadata.put("isAccessible",String.valueOf(pzAuto.isAccessible()));
	dcMetadata.put("isDCResponsive","false");
	dcMetadata.put("isDCSPA","true");
	dcMetadata.put("DT","");
	dcMetadata.put("streamName","pyAdminStudioDashboard");
	dcMetadata.put("streamObjClass","RULE-HTML-HARNESS");
	dcMetadata.put("ariaRole","main");
	dcMetadata.put("streamClass",tools.getStepPage().getString("pxObjClass"));
	dcMetadata.put("thread","");
	dcMetadata.put("usingPage","");
	dcMetadata.put("isSLInclude",bIsScreenLayout);
	dcMetadata.put("isStretchMarkup",String.valueOf(tools.getParamValue("pySectionIncludeHeight").equalsIgnoreCase("Stretch")));
	String portalName = tools.findPage("pxThread").getString("pxPortal");
	ClipboardPage cpPrevPyDisplay= null;
	ClipboardPage pg_dec_PyDisplay = tools.findPage("Declare_pyDisplay");
	ClipboardProperty cp_PrevPyDisplay = pg_dec_PyDisplay.getIfPresent("pyDisplay");
	if(cp_PrevPyDisplay != null){
		cpPrevPyDisplay = cp_PrevPyDisplay.getPageValue(portalName);
	}
	if(cpPrevPyDisplay !=null){
		dcMetadata.put("docsJSON",cpPrevPyDisplay.getJSON("pyUIElements",true));}
	ClipboardPage pg_customTabHeaders = tools.findPage("pyCustomTabHeaders");
	if(pg_customTabHeaders !=null){
		String headerJsonObj= pg_customTabHeaders.getJSON(true);pg_customTabHeaders.removeFromClipboard();dcMetadata.put("headerJsonObj",headerJsonObj);}
	boolean isTemplatingEnabled = pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
	IUIComponent dcComponent = null;
	if (isTemplatingEnabled) {
		dcComponent = pzAuto.getUIComponent();
		if (!pzAuto.hasStaticContentJSOptimization()) {
		dcComponent.addDependentScripts("pzpega_ui_template_dynamiccontainer.js");
	}
	if(!("true").equals(tools.findPage("pxRequestor").getStringIfPresent("pyPegaDesignMode"))) {
			if (!pzAuto.hasStaticContentJSOptimization() ) {
				dcComponent.addAdditionalFragment("pzFrameLessDCScripts","pzDynamicContainerScriptFrameLess");
			}
			if (!pzAuto.hasStaticContentJSOptimization()) {
				dcComponent.addAdditionalFragment("pzPegaCompositeGadgetScripts","PegaCompositeGadgetInclude");
			}
			}
			dcComponent.beginComponent("pxDynamicContainer", dcMetadata);
		} else {
			dcParamsMap = new java.util.HashMap();
			dcParamsMap.put("Metadata",dcMetadata);
			dcParamsMap.put("Part","START");
		tools.appendString(pega_uiengine_harness.pzGetDynamicContainerHTML(dcParamsMap));
		}
		boolean skipWorkAreaContent = ((PegaAPI)tools).getUIEngine().getDCInstance().shouldSkipWorkAreaInDCSPA();
		if (!skipWorkAreaContent) {
			String portalLaunch = tools.getParamValue("portalLaunch");
			tools.putParamValue("portalLaunch","false");
			StringMap portalKeys = new HashStringMap();
			ClipboardPage pg_newPrimaryPage = null; 
			if(!"".equals("")){
				pg_newPrimaryPage = tools.findPage("", true);
			}
			if(!"".equals("")){
				if(pg_newPrimaryPage == null){
					pg_newPrimaryPage = tools.getStepPage();
				}
				tools.applyModel(pg_newPrimaryPage, new ParameterPage(),"");
			}
			portalKeys.putString("pxObjClass","Rule-HTML-Harness");
			portalKeys.putString("pyStreamName","pyAdminStudioDashboard");
			tools.putParamValue("skipPortalChrome","true");
			tools.putParamValue("innerHarnessName","pyAdminStudioDashboard");
			tools.putParamValue("skipDCDataModelUpdation","true");
			tools.putParamValue("skipResetQueryStringRegistration","true");
			tools.appendString(tools.getStream(portalKeys,pg_newPrimaryPage));
			tools.putParamValue("skipPortalChrome","");
			tools.putParamValue("innerHarnessName","");
			tools.putParamValue("skipDCDataModelUpdation","");
			tools.putParamValue("skipResetQueryStringRegistration","");
			tools.putParamValue("portalLaunch",portalLaunch); 
		}
		if(dcComponent!=null) {
			dcComponent.endComponent();
		} else {
			if(dcParamsMap!=null) {
				dcParamsMap.put("Part","END");
				tools.appendString(pega_uiengine_harness.pzGetDynamicContainerHTML(dcParamsMap));
				dcMetadata = null;
				dcParamsMap = null;
			}
			if(!("true").equals(tools.findPage("pxRequestor").getStringIfPresent("pyPegaDesignMode"))) {
			if(!pzAuto.isOffline()){ 
				pzAuto.emitIncludeStreamReference("pzDynamicContainerScriptFrameLess", null, "null","Rule-HTML-Fragment",null);
			}
			if (pzAuto.doOnlyOnce("pxWorkAreaTabsContainer")) {
				pzAuto.emitIncludeStreamReference("PegaCompositeGadgetInclude",null,"null", "Rule-HTML-Fragment",null ); 
			}
		}
	}
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzAdminStudioMainB","",false);
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
String paramName = "EXPANDEDSubSectionpzAdminStudioMainB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyAdminStudioDashboard'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","1");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
pzLayoutBody_1();
}
public void pzLayout_1() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyAdminStudioDashboard'}") + ">");
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_1();
}
if(bWrapIncSection){
tools.appendString("</span>");
}if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}


public void elementModel_1(String tgName,String tname,String title,String active,String index,String type,String defered,String dcMode,String isDC) { 

try {

ClipboardPage pg_displayTemp = tools.findPage("pyDisplayTemp",true);

if(pg_displayTemp == null) {

	pg_displayTemp = tools.createPage("Pega-UI-RunTime-Display", "pyDisplayTemp");

}

ClipboardPage pg_SectionTab = null;
ClipboardPage pg_element = null;
ClipboardPage pg_activeElement = null;
if("true".equalsIgnoreCase(isDC)){

ClipboardProperty cp_DCList = pg_displayTemp.getProperty("pyContainerList");

 cp_DCList.getPropertyValue(1).setValue(tgName);
}

	pg_SectionTab = tools.findPage("pyDisplayTemp").getProperty("pyElements").getPageValue("pzAdminStudioMain");

	pg_element = pg_SectionTab.getProperty("pyUIElements").getPageValue(ClipboardProperty.LIST_APPEND);

	 index = (pg_SectionTab.getProperty("pyUIElements").size())+"";

	 if( dcMode != null && (!"".equalsIgnoreCase(dcMode.trim()))){

	 pg_element.putString("pyMode", dcMode);

	 } 

	pg_element.putString("pyIsDCSPA", tools.getParamValue("pyIsDCSPA"));

	pg_element.putString("pyTabGroupName", tgName);

	pg_element.putString("pyElementName", tname);

	pg_element.putString("pyLabel", title);

	pg_element.putString("pyIsActive",active);

	pg_element.putString("pyIsDirty", "false");

	pg_element.putString("pyIndex", index);

	pg_element.putString("pyIsStatic", "true");

	pg_element.putString("pyType",type );

	 pg_element.putString("pyStatus",defered);

	 if("true".equals(active)){

		 pg_element.putString("pyLastActiveTimeinMS","1");

	 }

	 if(!"".equals(tgName) && "true".equalsIgnoreCase(active)){

	pg_activeElement = pg_SectionTab.getProperty("pyUIActive").getPageValue(ClipboardProperty.LIST_APPEND);

	pg_activeElement.putAll(pg_element,ClipboardPage.PUTALL_KEEPNEW);

	}

	}catch(Exception e){}
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
	oStreamProperties_1.put("pyClassName", "Data-Portal-PegaAdminStudio");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION DATA-PORTAL-PEGAADMINSTUDIO PZADMINSTUDIOMAIN #20180713T135157.795 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzAdminStudioMain");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION DATA-PORTAL-PEGAADMINSTUDIO PZADMINSTUDIOMAIN #20180713T135157.795 GMT", "Data-Portal-PegaAdminStudio pzAdminStudioMain", "Pega-Desktop", "08-01-01", "20180713T135157.795 GMT");
}
