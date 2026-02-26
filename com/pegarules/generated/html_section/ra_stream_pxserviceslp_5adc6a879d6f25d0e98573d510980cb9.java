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
 * Builds JSP stream PEGA-LANDING-DECISION-SERVICES!PXSERVICESLP.
 */
public class ra_stream_pxserviceslp_5adc6a879d6f25d0e98573d510980cb9 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pxServicesLP.Pega_Landing_Decision_Services.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 155336694;
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
	public ra_stream_pxserviceslp_5adc6a879d6f25d0e98573d510980cb9(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "47543942e2d160d547d19fd4981981dd0da0896e";
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
/* Instance RULE-HTML-SECTION PEGA-LANDING-DECISION-SERVICES PXSERVICESLP #20191210T124313.684 GMT	Pega-DecisionArchitect:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "47543942e2d160d547d19fd4981981dd0da0896e";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pxServicesLP",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION PEGA-LANDING-DECISION-SERVICES PXSERVICESLP #20191210T124313.684 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION PEGA-LANDING-DECISION-SERVICES PXSERVICESLP #20191210T124313.684 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION PEGA-LANDING-DECISION-SERVICES PXSERVICESLP #20191210T124313.684 GMT */
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
	"Rule-HTML-Section:PXSERVICESLP"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXSERVICESLP","Rule-HTML-Section","PEGA-LANDING-DECISION-SERVICES",false,"","Pega-DecisionArchitect","08-04-01","RULE-HTML-SECTION PEGA-LANDING-DECISION-SERVICES PXSERVICESLP #20191210T124313.684 GMT","!PXSERVICESLP",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",155336694)
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
//	RULE-HTML-SECTION PEGA-LANDING-DECISION-SERVICES PXSERVICESLP #20191210T124313.684 GMT:20191210T124313.684 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(

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
//	RULE-UTILITY-FUNCTION HARNESS GETPAGECLASS #20180713T132451.045 GMT:20180713T132451.045 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEGETPARAMPAGE--(CLIPBOARDPAGE,STRING) #20200702T145600.500 GMT:20200702T145600.500 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAZYLOADBOTTOM--(STRING,STRING,CLIPBOARDPAGE,STRING) #20180713T133339.970 GMT:20180713T133339.970 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAZYLOADTOP--(STRING, CLIPBOARDPAGE) #20180713T133339.980 GMT:20180713T133339.980 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION STRING TRIM #20180713T131442.833 GMT:20180713T131442.833 GMT
//	RULE-UTILITY-FUNCTION UTILITIES PZVALIDATEFIELDVALUEREFERENCE #20231004T060003.271 GMT:20231004T060003.271 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "96f0a57dd3acadf3f7da0670069e0d29";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-Landing-Decision-Services";
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
  pzSection.beginSection("pxServicesLP",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pxServicesLP','insKey':'RULE-HTML-SECTION PEGA-LANDING-DECISION-SERVICES PXSERVICESLP #20191210T124313.684 GMT','sectionType':'standard'}");
pzLayout_1();
pxIsNonTemplateStream = true;
if( pzAuto.getUIComponentRuntime().isTemplateRendering() ) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");
}
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){
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
public void invokeDeferLoadPreActivity_4() {
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()&&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){

						  {
						ParameterPage newParamsPage = new ParameterPage();
						 String strPropertyValue="";
						 String[] arReturn;
						 strPropertyValue="Stream";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"Stream",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("tabName", strPropertyValue);
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
						 keys.putString("pyActivityName", "pzSetTabName");
						 tools.doActivity(keys, tools.getStepPage(), newParamsPage);
						 } 
}
}
public void pzLayoutBodyWrapper_6() {
pzSection.getLayout().setExpandParam("SubSectionpxServicesLPBBBBBB",null,false);
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionpxServicesLPBBBBBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='6' id='INNERDIV-SubSectionpxServicesLPBBBBBB' class='tabbed_sectionBodyContainerSubHead'  style=\"display:none\"  >");
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
invokeDeferLoadPreActivity_4();
includeSectionBody_5();
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("LazyLoad");
tools.appendString("<div section_index='6' id='INNERDIV-SubSectionpxServicesLPBBBBBB' class='tabbed_sectionBodyContainerSubHead'  style='display:none'  >");
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
	secInfo.put("usingPage",".pyServiceStream");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_11","pyTab", secInfo);
}


public void includeSectionBody_5() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pyTab";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,".pyServiceStream",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_5(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Stream");
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_5(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"Stream\" title=\"Stream\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='6' id='Tab5' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
 if(tools.getParamValue("EXPAND_ALL").equals("true") || (tools.getParamValue("EXPANDEDSubSectionpxServicesLPBBBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")).equals("true") && tools.getParamValue("RenderSingle").equals(""))  ||tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionpxServicesLPBBBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""))){
tools.appendString(" isLoadDeferred='false' sectionBodyId='SubSectionpxServicesLPBBBBBB'");
}else{
tools.appendString(" isLoadDeferred='true' readonly='" + !tools.hasInputEnabled() + "' sectionBodyId='SubSectionpxServicesLPBBBBBB'");
}
tools.appendString(" refreshOnClick='true' sectionBodyId='SubSectionpxServicesLPBBBBBB'>");
String l_title="Stream";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602200252200926" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_5();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void invokeDeferLoadPreActivity_3() {
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()&&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){

						  {
						ParameterPage newParamsPage = new ParameterPage();
						 String strPropertyValue="";
						 String[] arReturn;
						 strPropertyValue="VBD";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"VBD",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("tabName", strPropertyValue);
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
						 keys.putString("pyActivityName", "pzSetTabName");
						 tools.doActivity(keys, tools.getStepPage(), newParamsPage);
						 } 
}
}
public void pzLayoutBodyWrapper_5() {
pzSection.getLayout().setExpandParam("SubSectionpxServicesLPBBBBB",null,false);
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionpxServicesLPBBBBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='5' id='INNERDIV-SubSectionpxServicesLPBBBBB' class='tabbed_sectionBodyContainerSubHead'  style=\"display:none\"  >");
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
invokeDeferLoadPreActivity_3();
includeSectionBody_4();
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("LazyLoad");
tools.appendString("<div section_index='5' id='INNERDIV-SubSectionpxServicesLPBBBBB' class='tabbed_sectionBodyContainerSubHead'  style='display:none'  >");
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
	secInfo.put("usingPage",".pyServiceVBD");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_10","pyTab", secInfo);
}


public void includeSectionBody_4() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pyTab";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,".pyServiceVBD",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_4(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Real-time Data Grid");
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_4(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"Real-time Data Grid\" title=\"Real-time Data Grid\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='5' id='Tab4' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
 if(tools.getParamValue("EXPAND_ALL").equals("true") || (tools.getParamValue("EXPANDEDSubSectionpxServicesLPBBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")).equals("true") && tools.getParamValue("RenderSingle").equals(""))  ||tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionpxServicesLPBBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""))){
tools.appendString(" isLoadDeferred='false' sectionBodyId='SubSectionpxServicesLPBBBBB'");
}else{
tools.appendString(" isLoadDeferred='true' readonly='" + !tools.hasInputEnabled() + "' sectionBodyId='SubSectionpxServicesLPBBBBB'");
}
tools.appendString(" refreshOnClick='true' sectionBodyId='SubSectionpxServicesLPBBBBB'>");
String l_title="Real-time Data Grid";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602200252200921" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
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
						 strPropertyValue="DataFlow";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"DataFlow",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("tabName", strPropertyValue);
						 strPropertyValue=".pyLandingNavigation.pyLevelB";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),".pyLandingNavigation.pyLevelB",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("chosenInstance", strPropertyValue);
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
						 keys.putString("pyActivityName", "pxSetChosenInstance");
						 tools.doActivity(keys, tools.getStepPage(), newParamsPage);
						 } 
}
}
public void pzLayoutBodyWrapper_4() {
pzSection.getLayout().setExpandParam("SubSectionpxServicesLPBBBB",null,false);
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionpxServicesLPBBBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='4' id='INNERDIV-SubSectionpxServicesLPBBBB' class='tabbed_sectionBodyContainerSubHead'  style=\"display:none\"  >");
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
invokeDeferLoadPreActivity_2();
includeSectionBody_3();
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("LazyLoad");
tools.appendString("<div section_index='4' id='INNERDIV-SubSectionpxServicesLPBBBB' class='tabbed_sectionBodyContainerSubHead'  style='display:none'  >");
if(true && (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()  || "true".equals(tools.getParamValue("pyPegaDesignMode")))){
includeSectionBody_3();
}
}
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage",".pyServiceDF");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_9","pyTab", secInfo);
}


public void includeSectionBody_3() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pyTab";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,".pyServiceDF",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_3(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Data Flow");
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_3(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"Data Flow\" title=\"Data Flow\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='4' id='Tab3' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
 if(tools.getParamValue("EXPAND_ALL").equals("true") || (tools.getParamValue("EXPANDEDSubSectionpxServicesLPBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")).equals("true") && tools.getParamValue("RenderSingle").equals(""))  ||tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionpxServicesLPBBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""))){
tools.appendString(" isLoadDeferred='false' sectionBodyId='SubSectionpxServicesLPBBBB'");
}else{
tools.appendString(" isLoadDeferred='true' readonly='" + !tools.hasInputEnabled() + "' sectionBodyId='SubSectionpxServicesLPBBBB'");
}
tools.appendString(" refreshOnClick='true' sectionBodyId='SubSectionpxServicesLPBBBB'>");
String l_title="Data Flow";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602200252200916" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_3();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void invokeDeferLoadPreActivity_1() {
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()&&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){

						  {
						ParameterPage newParamsPage = new ParameterPage();
						 String strPropertyValue="";
						 String[] arReturn;
						 strPropertyValue="ADM";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"ADM",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("tabName", strPropertyValue);
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
						 keys.putString("pyActivityName", "pzSetTabName");
						 tools.doActivity(keys, tools.getStepPage(), newParamsPage);
						 } 
}
}
public void pzLayoutBodyWrapper_3() {
pzSection.getLayout().setExpandParam("SubSectionpxServicesLPBBB",null,false);
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionpxServicesLPBBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='3' id='INNERDIV-SubSectionpxServicesLPBBB' class='tabbed_sectionBodyContainerSubHead'  style=\"display:none\"  >");
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
invokeDeferLoadPreActivity_1();
includeSectionBody_2();
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("LazyLoad");
tools.appendString("<div section_index='3' id='INNERDIV-SubSectionpxServicesLPBBB' class='tabbed_sectionBodyContainerSubHead'  style='display:none'  >");
if(true && (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()  || "true".equals(tools.getParamValue("pyPegaDesignMode")))){
includeSectionBody_2();
}
}
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_2() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage",".pyServiceADM");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_8","pyTab", secInfo);
}


public void includeSectionBody_2() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pyTab";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,".pyServiceADM",false,""));
	}else{oLog.warn("Section name must be provided.");}}

 public void pzHeaderBody_2(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Adaptive Decision Manager");
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_2(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"Adaptive Decision Manager\" title=\"Adaptive Decision Manager\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='3' id='Tab2' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
 if(tools.getParamValue("EXPAND_ALL").equals("true") || (tools.getParamValue("EXPANDEDSubSectionpxServicesLPBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")).equals("true") && tools.getParamValue("RenderSingle").equals(""))  ||tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionpxServicesLPBBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""))){
tools.appendString(" isLoadDeferred='false' sectionBodyId='SubSectionpxServicesLPBBB'");
}else{
tools.appendString(" isLoadDeferred='true' readonly='" + !tools.hasInputEnabled() + "' sectionBodyId='SubSectionpxServicesLPBBB'");
}
tools.appendString(" refreshOnClick='true' sectionBodyId='SubSectionpxServicesLPBBB'>");
String l_title="Adaptive Decision Manager";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602200252200910" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_2();
tools.appendString("</span></span>");
tools.appendString("</li>");
}


public String getParamPage_1() {
	ParameterPage paramPage = tools.getParameterPage();
	if(paramPage.isEmpty()) {
		return "";
	}

	List paramsToAvoid = Arrays.asList(new Object[]{"pzuiactionzzz", "labelStyle", "workClass",  "CoverClass",
	"labelForStyle", "FlowType", "OutputPageName",
	"valueStyle","isWebMashup", "CreatesTemporaryObject", "repeatPageStyle",
	"streamKeys2", "ModelToUse", "pyActivity",
	"RunRuleInsKey", "Purpose", "FolderType",
	"pzHarnessID", "streamKeys", "InsClass",
	"FormError", "RenderSingle", "section_base_ref",
	"HTMLClass", "StartingModel", "separatorStyle",
	"repeatStyle", "MergePage", "workHandle",
	"FlowHandle", "SkipNewHarness", "AlwaysShowFormLevelErrors",
	"KeepFixedVisible", "GetWorkCreateInfo", "StartingHarness",
	"lazyLoadInfo", "OnlyCreateOutputPageIfError", "ReadOnly",
	"pzTransactionId", "StreamClass", "lazyLoadId",
	"PreActivity", "PreDataTransform", "BaseReference", "lazySection","pyListViewOutput",
	"StreamName", "SectionReadOnly", "ActivityParams",
	"filteredIndicesSet", "currentRowPage", "parameters", "StreamList", "UITemplateMetaDataPath" , "UITemplatingStatus"
	});

	List paramsToSkipEncoding = Arrays.asList(new Object[]{"pzPrimaryPageName", "TempAssignPage",  "InterestPage", "UsingPage"});

	StringBuffer paramsAsNameValue = new StringBuffer();

	java.util.Set params = paramPage.keySet();
	java.util.Iterator paramsIter = params.iterator();
	String paramName = "";
	Object paramValue = null;

	while (paramsIter.hasNext()) {
		boolean skipEncoding = false;
		paramName = paramsIter.next().toString();
		if(paramsToAvoid.contains(paramName)) {
			continue;
		}else if(paramsToSkipEncoding.contains(paramName)) {
			skipEncoding = true;
		}

		paramValue = paramPage.getDefinition(paramName);
		if(paramValue == null || !(paramValue instanceof String) || "".equals(paramValue.toString())) {
			continue;
		}

		paramsAsNameValue.append("," + paramName + "=" + (skipEncoding?paramValue.toString():StringUtils.crossScriptingFilter(paramValue.toString())));
	}

	return paramsAsNameValue.toString();
}public void pzLayoutBodyWrapper_2() {
pzSection.getLayout().setExpandParam("SubSectionpxServicesLPBB",null,false);
boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
String param_Index=tools.getParamValue("index");
	String expandedSecId="";
String expandRLExprValue=(bExpandRL?param_Index:"");
expandedSecId="EXPANDEDSubSectionpxServicesLPBB" + expandRLExprValue;
tools.putSaveValue("expandParam", expandedSecId);
pega_rules_utilities.pzRegisterActivity(tools, "Show-Harness");
if(pzSection.getLayout().loadLayoutHeader()) {
tools.appendString("<div section_index='2' id='INNERDIV-SubSectionpxServicesLPBB' class='tabbed_sectionBodyContainerSubHead'  >");
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
tools.putParamValue("tempSecIDRL", "EXPANDEDSubSectionpxServicesLPBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""));
		if((tools.getParamValue("lazyLoadId").equals(tools.getParamValue("tempSecIDRL")) || tools.getParamValue("RenderSingle").equals(tools.getParamValue("tempSecIDRL")) ) ||  pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || "true".equals(tools.getParamValue("pyPegaDesignMode"))){
			 tools.putParamValue("RenderSingle" , "");
			 tools.putParamValue("lazyLoadId" , "");
			 tools.putParamValue("tempSecIDRL" , "");
			 if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() &&!"true".equals(tools.getParamValue("pyPegaDesignMode"))){
						  {
						ParameterPage newParamsPage = new ParameterPage();
						 String strPropertyValue="";
						 String[] arReturn;
						 strPropertyValue="DDS";
						 arReturn = new String[2];
						if (com.pegarules.generated.pega_rules_decision.EvaluateExpression(null,tools.getPrimaryPage(),"DDS",arReturn)){
						 strPropertyValue = arReturn[0];
						}else {
						 strPropertyValue = "";
						 }
						 newParamsPage.putString("tabName", strPropertyValue);
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
						 keys.putString("pyActivityName", "pzSetTabName");
						 tools.doActivity(keys, tools.getStepPage(), newParamsPage);
						 } tools.appendString("<div id='lazyContent'>");
			}
includeSectionBody_1();
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() && !"true".equals(tools.getParamValue("pyPegaDesignMode"))){tools.appendString("</div>");}
			tools.putParamValue("RenderSingle" , "EXPANDEDSubSectionpxServicesLPBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""));
			 tools.putParamValue("lazyLoadId" , "EXPANDEDSubSectionpxServicesLPBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""));
		}else{
		
			if(!tools.getParamValue("lazySection ").equals("pxServicesLP")){
				 String readOnly = "-1".equals(tools.getParamValue("ReadOnly")) || "-1".equals(tools.getParamValue("SectionReadOnly")) || !tools.hasInputEnabled() ? "-1" : "0";
				   tools.putSaveValue("lazyLoadDivId" , ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique() + "");String lazyLoadDivIdSaveValue=tools.getSaveValue("lazyLoadDivId");String lazyLoadInfoValue=tools.getParamValue("lazyLoadInfo");if(lazyLoadInfoValue.equals("null")){lazyLoadInfoValue="";}
						boolean pyAssociateRequestor = ((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).isAssociateRequestor();
				   tools.putParamValue("lazyLoadInfo" , lazyLoadInfoValue + tools.getSaveValue("lazyLoadDivId") + ",EXPANDEDSubSectionpxServicesLPBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")+",subscriptionId=" + tools.getParamValue("subscriptionId") + "ReadOnly=" + readOnly + getParamPage_1() + "~#LLDELIM#~");tools.appendString("<div style='display:block;' data-lazyloaddivid='" + lazyLoadDivIdSaveValue + "' data-layoutid='EXPANDEDSubSectionpxServicesLPBB' class='lazyload-layout' data-parampage='"+tools.getParamValueCSF("lazyLoadInfo").replace("~#LLDELIM#~","")+"' >");if(tools.getParamValue("RenderSingle").equals("")){pzAuto.emitIncludeStreamReference("pyLoadingMessage",null,null,"Rule-HTML-Section",null); }tools.appendString("</div>");
			}
		}
	
} else {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage("LazyLoad");
tools.appendString("<div section_index='2' id='INNERDIV-SubSectionpxServicesLPBB' class='tabbed_sectionBodyContainerSubHead'  style='display:none'  >");
if(true && (pega_uiengine_offlinesupport.pzIsForOfflineTemplate()  || "true".equals(tools.getParamValue("pyPegaDesignMode")))){
includeSectionBody_1();
}
}
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage",".pyServiceDDS");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_7","pyTab", secInfo);
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "pzSetTabName");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "pzSetTabName");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "pxSetChosenInstance");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "pzSetTabName");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "pzSetTabName");
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
	
	String includedSectionName = "";includedSectionName = "pyTab";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,".pyServiceDDS",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void groupHeaderStart_1() {
	if(!tools.getParamValue("pyPegaDesignMode").equals("true")) {
		tools.appendString("<div class='scrlCntr' data-hide-tab-scroll='true'>");
		pzAuto.emitIncludeStreamReference("pzMenuBarInclude", null, "null","Rule-HTML-Fragment",null);
		tools.appendString("<div class='harnessHeaderIcons rightborder'><span id='TABSPAN'><table cellspacing='0' cellpadding='0'><tr>");
		pzLayout.includeHeaderIcon("","tdRightStyle");tools.appendString("</tr></table></span></div><ol  title='" + tools.getLocalizedTextForString(".pyActionPrompt", "Currently open") + "' class=\"yui-nav tsb-menu tab-ul tab-ul-t tab-ul-t-ns  subTabsList\"><li sel_prefix='tab-li-t-ns' class=\"tab-li tab-li-t tab-li-t-ns \" ><a  role= \"link\"  aria-haspopup=\"true\"  id=\"TABANCHOR\" tabindex=\"0\" aria-label=\"" + tools.getLocalizedTextForString(".pyActionPrompt", "Currently open") + "\"> <span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \" style=\"white-space: nowrap;\"><span class=\"textMiddle\"><span class=\"textIn\" inAnchor=\"\">&#x25BC;</span></span></span></a></li></ol><div class='tStrCntr'>");
		}
	tools.appendString("<ul role = \"tablist\" class=\"yui-nav tab-ul tab-ul-t tab-ul-t-ns  subTabsList\"");
	tools.appendString("");tools.appendString(">");
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Decision Data Store");
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_1(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
tools.appendString("<li role=\"tab\"  aria-label=\"Decision Data Store\" title=\"Decision Data Store\"  aria-selected=\"true\" tabindex=\"0\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='2' id='Tab1' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns selected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
 if(tools.getParamValue("EXPAND_ALL").equals("true") || (tools.getParamValue("EXPANDEDSubSectionpxServicesLPBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):"")).equals("true") && tools.getParamValue("RenderSingle").equals(""))  ||tools.getParamValue("RenderSingle").equals("EXPANDEDSubSectionpxServicesLPBB"+(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL")?tools.getParamValue("index"):""))){
tools.appendString(" isLoadDeferred='false' sectionBodyId='SubSectionpxServicesLPBB'");
}else{
tools.appendString(" isLoadDeferred='true' readonly='" + !tools.hasInputEnabled() + "' sectionBodyId='SubSectionpxServicesLPBB'");
}
tools.appendString(" refreshOnClick='true' sectionBodyId='SubSectionpxServicesLPBB'>");
String l_title="Decision Data Store";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602200252200865" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_1();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_1() {
tools.appendString("<div class='layout layout-noheader layout-noheader-information'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
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


public int simpleLayoutCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + "   ");
	 
	tools.appendString(pzSection.getCustomStyle(false, "","dataLabelRead","dataLabelWrite") + " ");
	 
	tools.appendString("flex flex-row ' " +   pzCell.getTestIdIfEnabled("201912101329350804689")   + " STRING_TYPE='label' RESERVE_SPACE='false'>");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","pyUpgradeinProgress") + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	 
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","label");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201912101329350804689")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("spanClass","iconRequired _iconRequired");
	pgCells.put("labelReadClass","dataLabelRead");
	pgCells.put("labelWriteClass","dataLabelWrite");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "pyUpgradeinProgress";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpxServicesLPB","",false);
}


public void simpleLayout_1() {
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201912101329350804398") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-mimic_a_sentence content-mimic_a_sentence " + "'  ");
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
		pg_dlmeta.put("format","mimic_a_sentence");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("clear","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_1(index);
	}else{
		index=simpleLayoutTemplateCell_1(index);
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
	String paramName = "EXPANDEDSubSectionpxServicesLPB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-information");
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxpzDisableAdminOperations", pxUniqueStreamHash+"_5");metadataPage.put("lMode","Flexbox");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_5");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_1();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_1() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxpzDisableAdminOperations","pzDisableAdminOperations", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_1();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzGroup_1() {
	String expandedGrpId=tools.getParamCSF("EXPANDEDTGpxServicesLPA");
	String activatedGrpId=tools.getParamCSF("ACTIVATEDTGpxServicesLPA");
	String param_renderSingle=tools.getParamValue("RenderSingle");
	if(!expandedGrpId.equals("")){
		tools.putSaveValue("defaultTab", expandedGrpId);
	}else{
		tools.putSaveValue("defaultTab" ,"1");
	}
	if(pzAuto.handleEvaluateWhen(" o2== rx.pyLandingNavigation.pyLevelC cqDDS",".pyLandingNavigation.pyLevelC=\'DDS\'", "tab", "active" )) { 
	 tools.putParamValue("ACTIVATEDTGpxServicesLPA","1"); 
}if(pzAuto.handleEvaluateWhen(" o2== rx.pyLandingNavigation.pyLevelC cqADM",".pyLandingNavigation.pyLevelC=\'ADM\'", "tab", "active" )) { 
	 tools.putParamValue("ACTIVATEDTGpxServicesLPA","2"); 
}if(pzAuto.handleEvaluateWhen(" o2== rx.pyLandingNavigation.pyLevelC cqDataFlow",".pyLandingNavigation.pyLevelC=\'DataFlow\'", "tab", "active" )) { 
	 tools.putParamValue("ACTIVATEDTGpxServicesLPA","3"); 
}if(pzAuto.handleEvaluateWhen(" o2== rx.pyLandingNavigation.pyLevelC cqVBD",".pyLandingNavigation.pyLevelC=\'VBD\'", "tab", "active" )) { 
	 tools.putParamValue("ACTIVATEDTGpxServicesLPA","4"); 
}if(pzAuto.handleEvaluateWhen(" o2== rx.pyLandingNavigation.pyLevelC cqStream",".pyLandingNavigation.pyLevelC=\'Stream\'", "tab", "active" )) { 
	 tools.putParamValue("ACTIVATEDTGpxServicesLPA","5"); 
}
	activatedGrpId=tools.getParamCSF("ACTIVATEDTGpxServicesLPA");
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
	tools.appendString("<div " + pzSection.getLayout().getInspectorData("TABGROUP", ".pySections(2)") + " id='PEGA_TABBED'   tabGroupId='TGpxServicesLPA' tabGroupName='' activeWhenTab = '" + activeTabSaveValue + "' defaultTab='" + defaultTabSaveValue + "' class= 'yui-navset pegaTabGrp yui-navset-top subTabbed subTabbed-t' data-taberror=\"" + tools.getLocalizedTextForString("pxRequestor.pyMessageLabel","TabErrorTooltip")  + " \"  data-pos=\"Top\">");
	if(!("true").equalsIgnoreCase(bIsScreenLayout) || !("true").equals(sectionHasDynamicLayout)){
	if(param_renderSingle.equals("")){
		boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
	 String param_Index=tools.getParamValue("index");
	String expandedSecId="";
	 String expandRLExprValue=(bExpandRL?param_Index:"");expandedSecId="EXPANDEDSubSectionpxServicesLPBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("1")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpxServicesLPBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("2")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpxServicesLPBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("3")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpxServicesLPBBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("4")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpxServicesLPBBBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("5")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}
		groupHeaderStart_1();
groupHeaderItem_1();
groupHeaderItem_2();
groupHeaderItem_3();
groupHeaderItem_4();
groupHeaderItem_5();
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
	if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_2();if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_3();if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_4();if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_5();if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");}pzLayoutBodyWrapper_6();
	tools.appendString("</div><input type='hidden' name='EXPANDEDTGpxServicesLPA");
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
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Pega-Landing-Decision-Services");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION PEGA-LANDING-DECISION-SERVICES PXSERVICESLP #20191210T124313.684 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-DecisionArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pxServicesLP");
	oStreamProperties_1.put("pyRuleSetVersion", "08-04-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION PEGA-LANDING-DECISION-SERVICES PXSERVICESLP #20191210T124313.684 GMT", "Pega-Landing-Decision-Services pxServicesLP", "Pega-DecisionArchitect", "08-04-01", "20191210T124313.684 GMT");
}
