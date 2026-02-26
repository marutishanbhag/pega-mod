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
 * Builds JSP stream DATA-MO-CONNECTOR-TRANSITION!PZSCREENFLOWPROPERTIES.
 */
public class ra_stream_pzscreenflowproperties_a50b5b9c7cd015a3e24be496b000d186 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzScreenFlowProperties.Data_MO_Connector_Transition.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 2085041223;
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
	public ra_stream_pzscreenflowproperties_a50b5b9c7cd015a3e24be496b000d186(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "6f77caf742c8033732269693caade44a100f5bb9";
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
/* Instance RULE-HTML-SECTION DATA-MO-CONNECTOR-TRANSITION PZSCREENFLOWPROPERTIES #20180713T140812.068 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "6f77caf742c8033732269693caade44a100f5bb9";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzScreenFlowProperties",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION DATA-MO-CONNECTOR-TRANSITION PZSCREENFLOWPROPERTIES #20180713T140812.068 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION DATA-MO-CONNECTOR-TRANSITION PZSCREENFLOWPROPERTIES #20180713T140812.068 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION DATA-MO-CONNECTOR-TRANSITION PZSCREENFLOWPROPERTIES #20180713T140812.068 GMT */
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
	"Rule-HTML-Section:PZSCREENFLOWPROPERTIES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZSCREENFLOWPROPERTIES","Rule-HTML-Section","DATA-MO-CONNECTOR-TRANSITION",false,"","Pega-ProcessArchitect","08-01-01","RULE-HTML-SECTION DATA-MO-CONNECTOR-TRANSITION PZSCREENFLOWPROPERTIES #20180713T140812.068 GMT","!PZSCREENFLOWPROPERTIES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",2085041223)
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
//	RULE-HTML-SECTION DATA-MO-CONNECTOR-TRANSITION PZSCREENFLOWPROPERTIES #20180713T140812.068 GMT:20180713T140812.068 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATETABBEDSECTIONLAYOUT--(ST0BC8EFD5459D738EF7AAAF219E7289B6 #20191016T111148.764 GMT:20191016T111148.764 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDSECTIONBODYELEMENTS--(STRINGFC27BFECDD5F0250930FF8FA168BE1FF #20180713T133338.055 GMT:20180713T133338.055 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELINCLUDE #20181206T140519.218 GMT:20181206T140519.218 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
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
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
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
		return "6c6e8c851fa2e63ee2612b65fe60f872";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-MO-Connector-Transition";
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
  pzSection.beginSection("pzScreenFlowProperties",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzScreenFlowProperties','insKey':'RULE-HTML-SECTION DATA-MO-CONNECTOR-TRANSITION PZSCREENFLOWPROPERTIES #20180713T140812.068 GMT','sectionType':'standard'}");
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")) ){
pzLayout_1();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzLayout_2();
pzLayout_3();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")) ){
pzLayout_4();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzLayout_5();
pxIsNonTemplateStream = true;
if( pzAuto.getUIComponentRuntime().isTemplateRendering() ) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");
}
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_15")){
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
public void pzLayoutBodyWrapper_7() {
pzSection.getLayout().setExpandParam("SubSectionpzScreenFlowPropertiesBBBBBBB",null,false);
tools.appendString("<div section_index='7' id='INNERDIV-SubSectionpzScreenFlowPropertiesBBBBBBB' class='tabbed_sectionBodyContainerSubHead'  style=\"display:none\"  >");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
includeSectionBody_5();
if(isParentTemplate){
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('N');
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}


public void generateClientWhenDiv_4() {
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
tools.appendString("RWP=\".pyModel\" RW=\".pyModel Changes\"");
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
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyModel"), -1);
	}
}catch(Exception e){}
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
	secInfo.put("packageSection", true);
	secInfo.put("packageSectionClass", "Data-MO-Connector-Transition");
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(StringUtils.isBlank(expressionId)) {
		expressionId = pxUniqueStreamHash+"_20";
	}
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyModel Changes", expressionId);
		if(StringUtils.isBlank(expressionId)) {
			expressionId = pxUniqueStreamHash+"_21";
		}
			expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyModel Changes", expressionId);
			String strRWPreActivity = "";
			strRWPreActivity = "";
			String strDTransform = "";
			strDTransform = "";
			if(!StringUtils.isBlank(expressionId)) {
				secInfo.put("pyExpressionId", expressionId);
			}
			}
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_19","pzTransitionParams_Properties", secInfo);
		}


public void includeSectionBody_5() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
	}
	String strSectionPageProp = "";
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
	pzPackageRuntime.packageSection(
	"pzTransitionParams_Properties", tools.getStepPage().getReference(),"Data-MO-Connector-Transition");}catch(Exception e1){oLog.error("Error generating package - " + e1.getMessage());}
	}
	generateClientWhenDiv_4();
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzTransitionParams_Properties";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
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
l_sectionTitle="Set Properties";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_2(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
 if(pzAuto.handleEvaluateWhen(" wxpyDisplayPropertiesSF","pyDisplayPropertiesSF", "tab", "visible" )) {
tools.appendString("<li role=\"tab\"  aria-label=\"Set Properties\" title=\"Set Properties\"  aria-selected=\"false\" tabindex=\"-1\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='7' id='Tab2' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns unselected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
tools.appendString(">");
String l_title="Set Properties";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602210149270570" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_2();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
}
public void pzLayoutBodyWrapper_6() {
pzSection.getLayout().setExpandParam("SubSectionpzScreenFlowPropertiesBBBBBB",null,false);
tools.appendString("<div section_index='6' id='INNERDIV-SubSectionpzScreenFlowPropertiesBBBBBB' class='tabbed_sectionBodyContainerSubHead'  >");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
boolean isParentTemplate = "true".equals(pzAuto.getUIComponentRuntime().getRuntimeContextTree().getSaveValue("TAB_PARENT_TEMPLATE"));
if(isParentTemplate){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE",null);
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
includeSectionBody_4();
if(isParentTemplate){
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('N');
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}


public void generateClientWhenDiv_3() {
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
strRWPreActivity = "pzNullValues,,FromClass=#~" + tools.getProperty(".pyFromClass").getReference() + "~#";
if(currentTemplatingStatus =='N'){
pzGetRefreshWhenPreActivity_1();
}
String strDTransform = "";
strDTransform = "";
if(currentTemplatingStatus =='N') {
try {
tools.appendString("RWP=\".pyConditionType\" RW=\".pyConditionType Changes\" RWA=\"");
tools.appendString("pzNullValues,,FromClass=#~" + tools.getProperty(".pyFromClass").getReference() + "~#");
tools.appendString("\" ");
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
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyConditionType"), -1);
	}
}catch(Exception e){}
}


public void 
pzGetRefreshWhenPreActivity_1() {try{
if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_RefreshWhen = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID")); 
ct_RefreshWhen.trackValueChanges(tools.getProperty(".pyFromClass"), -1);
}}catch(Exception e){} 
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
	secInfo.put("packageSection", true);
	secInfo.put("packageSectionClass", "Data-MO-Connector-Transition");
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(StringUtils.isBlank(expressionId)) {
		expressionId = pxUniqueStreamHash+"_17";
	}
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyConditionType Changes", expressionId);
		if(StringUtils.isBlank(expressionId)) {
			expressionId = pxUniqueStreamHash+"_18";
		}
			expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyConditionType Changes", expressionId);
			String strRWPreActivity = "";
			strRWPreActivity = "pzNullValues,,FromClass=#~" + tools.getProperty(".pyFromClass").getReference() + "~#";
			pzGetRefreshWhenPreActivity_1();
			expression.addActivity("sectionRefreshWhen", "pzNullValues", "", "FromClass=#~" + tools.getProperty(".pyFromClass").getReference() + "~#");
			String strDTransform = "";
			strDTransform = "";
			if(!StringUtils.isBlank(expressionId)) {
				secInfo.put("pyExpressionId", expressionId);
			}
			}
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_16","pzScreenFlowPropertiesTab", secInfo);
		}


public void includeSectionBody_4() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
	}
	String strSectionPageProp = "";
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
	pzPackageRuntime.packageSection(
	"pzScreenFlowPropertiesTab", tools.getStepPage().getReference(),"Data-MO-Connector-Transition");}catch(Exception e1){oLog.error("Error generating package - " + e1.getMessage());}
	}
	generateClientWhenDiv_3();
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzScreenFlowPropertiesTab";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	tools.appendString("\n\t\t\t\t\t\t</div>");
	}
}
public void groupHeaderStart_1() {
	if(!tools.getParamValue("pyPegaDesignMode").equals("true")) {
		tools.appendString("<div class='scrlCntr' data-hide-tab-scroll='true'>");
		pzAuto.emitIncludeStreamReference("pzMenuBarInclude", null, "null","Rule-HTML-Fragment",null);
		tools.appendString("<div class='harnessHeaderIcons rightborder'><span id='TABSPAN'><table cellspacing='0' cellpadding='0'><tr>");
		pzLayout.includeHeaderIcon("SubSectionpzScreenFlowPropertiesBBBB","tdRightStyle");tools.appendString("</tr></table></span></div><ol  title='" + tools.getLocalizedTextForString(".pyActionPrompt", "Currently open") + "' class=\"yui-nav tsb-menu tab-ul tab-ul-t tab-ul-t-ns  subTabsList\"><li sel_prefix='tab-li-t-ns' class=\"tab-li tab-li-t tab-li-t-ns \" ><a  role= \"link\"  aria-haspopup=\"true\"  id=\"TABANCHOR\" tabindex=\"0\" aria-label=\"" + tools.getLocalizedTextForString(".pyActionPrompt", "Currently open") + "\"> <span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \" style=\"white-space: nowrap;\"><span class=\"textMiddle\"><span class=\"textIn\" inAnchor=\"\">&#x25BC;</span></span></span></a></li></ol><div class='tStrCntr'>");
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
l_sectionTitle="Connector";
tools.appendString("<span class=\"textMiddle\"><span data-stl= \"1\" class=\"textIn\" inAnchor>" + l_sectionTitle + "</span></span>");
}
public void groupHeaderItem_1(){
String elementName="", tabGroupName="";
tabGroupName="";
elementName="";
 if(pzAuto.handleEvaluateWhen(" wxpyDisplayPropertiesSF","pyDisplayPropertiesSF", "tab", "visible" )) {
tools.appendString("<li role=\"tab\"  aria-label=\"Connector\" title=\"Connector\"  aria-selected=\"true\" tabindex=\"0\" elementName='" + elementName + "' tabGroupName = '" + tabGroupName + "' section-incl-id='-wrapper' section_index='6' id='Tab1' sel_prefix='tab-li-t-ns'");
 if(tools.getParamValue("pyPegaDesignMode").equals("true")) {
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns selected\" ");
}else{
tools.appendString(" class=\"tab-li tab-li-t tab-li-t-ns \" ");
}
tools.appendString(">");
String l_title="Connector";
String l_tabtooltip = tools.getLocalizedTextForString(".pyCaption", "");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
tools.appendString("<span  data-layout-id=\"202602210149270565" + rptDynamicIdx + "\" title=\"" + l_tabtooltip + "\" id=\"TABANCHOR\" tabTitle=\"" + l_title + "\"><span id=\"TABSPAN\" class=\"textOut tab-span tab-span-t tab-span-t-ns \">");
pzHeaderBody_1();
tools.appendString("</span></span>");
tools.appendString("</li>");
}
}
public void pzLayoutBody_2() {
includeSectionBody_3();
}
public void pzLayoutBodyWrapper_5() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_3();
}
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
tools.appendString("RWP=\".pyExpression,.pyLabel\" RW=\".pyLabel Changes || .pyExpression Changes\"");
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
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyExpression"), -1);
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyLabel"), -1);
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
	secInfo.put("packageSectionClass", "Data-MO-Connector-Transition");
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(StringUtils.isBlank(expressionId)) {
		expressionId = pxUniqueStreamHash+"_11";
	}
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyLabel Changes || .pyExpression Changes", expressionId);
		if(StringUtils.isBlank(expressionId)) {
			expressionId = pxUniqueStreamHash+"_12";
		}
			expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyLabel Changes || .pyExpression Changes", expressionId);
			String strRWPreActivity = "";
			strRWPreActivity = "";
			String strDTransform = "";
			strDTransform = "";
			if(!StringUtils.isBlank(expressionId)) {
				secInfo.put("pyExpressionId", expressionId);
			}
			}
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_10","pzHiddenRefresh", secInfo);
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
	"pzHiddenRefresh", tools.getStepPage().getReference(),"Data-MO-Connector-Transition");}catch(Exception e1){oLog.error("Error generating package - " + e1.getMessage());}
	}
	generateClientWhenDiv_2();
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzHiddenRefresh";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	tools.appendString("\n\t\t\t\t\t\t</div>");
	}
}
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionpzScreenFlowPropertiesBBBBB","",false);
}
public void pzLayoutContainer_2() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
String expressionId = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
String expressionId_BV = null;
com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
if(StringUtils.isBlank(expressionId)) {
	expressionId = pxUniqueStreamHash+"_13";
}
expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyLabel Changes || .pyExpression Changes",expressionId);
String strRWPreActivity = "";
strRWPreActivity = "";
String strDTransform = "";
strDTransform = "";
if(!StringUtils.isBlank(expressionId)) {
	metadataPage.put("pyExpressionId",expressionId);
}
if(!StringUtils.isBlank(expressionId_BV)) {
	metadataPage.put("expressionId_BV",expressionId_BV);
}
String paramName = "EXPANDEDSubSectionpzScreenFlowPropertiesBBBBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(5)','clipboardPath':'pzHiddenRefresh'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","5");
IUIComponent containerComponent = pzAuto.getUIComponent();
com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxnever", pxUniqueStreamHash+"_14");metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_14");
metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
if(pyVisibility) {
pzLayoutBody_2();
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
if(pzAuto.handleEvaluateWhen(" wxnever","never", "layout", "visible" )) {boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(5)','clipboardPath':'pzHiddenRefresh'}") + ">");
}
pzSetExpandParam_5();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_5();
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
public void pzLayoutBodyWrapper_4() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_2();
}
tools.putSaveValue("rowClass","");
}
public void 
labelIncludeInCell_2(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20170629075729056717462") + "  ");
if(!labelForAttribute.equals("")){tools.appendString(" for='" + labelForAttribute + rlIndex + "' ");
}String labelForError="";if(!propertyName.equals("")){try { labelForError = pzSection.getCell().getLabelForError(pageName,propertyName);}catch(Exception e) {} }tools.appendString(labelForError);
if(!accessKey.equals("")){tools.appendString(accessKey);
}else if(bRuntimeAccesskey){String aKey = pega_uiengine_harness.pzGetAKey(".pyCaption",labelValue,pega_procom_harness.IsParam(labelValue) );tools.appendString(aKey);
}tools.appendString(" >");
if(isRequired){
tools.appendString("<span class=\"iconRequired " + sLabelFormat + "_iconRequired\">");
}
if(bRuntimeAccesskey)labelValue=tools.getParamValue("pzULabel");else if(pega_procom_harness.IsParam(labelValue) ){String paramName = labelValue.substring(labelValue.indexOf(".")+1);labelValue = tools.getParamValueCSF(paramName);if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);}else if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);tools.appendString(labelValue);
if(isRequired){
tools.appendString("</span>");
}
if(isRequired){
String reqString = "Required";
if(bLocalize){
reqString = tools.getLocalizedTextForParameterizedString("pyCaption","Required");
}
tools.appendString("<strong class=\"required-field-accessibility\">" + reqString + "</strong>");
}
tools.appendString("</label>");
}


public void layoutBody_2() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(4)") + "  section_index='4'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(4).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "width:130px;",false,"","");tools.appendString("<nobr>");
	labelIncludeInCell_2("","","","",false,"",false,false,"Standard",false);
	tools.appendString("</nobr>");
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzScreenFlowPropertiesBBBB","",false);
}
public void pzLayout_4() {
pzSetExpandParam_4();
pzLayoutBodyWrapper_4();
}
public void pzLayoutBody_1() {
includeSectionBody_2();
}
public void pzLayoutBodyWrapper_3() {
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_2();
}
tools.putSaveValue("rowClass","");
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
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_7","pzEmptySection", secInfo);
}


public void includeSectionBody_2() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzEmptySection";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpzScreenFlowPropertiesBBB","",false);
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
String paramName = "EXPANDEDSubSectionpzScreenFlowPropertiesBBB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(3)','clipboardPath':'pzEmptySection'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("sectionIndex","3");
IUIComponent containerComponent = pzAuto.getUIComponent();
com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxpyDisplayPropertiesSF", pxUniqueStreamHash+"_8");metadataPage.put("isSectionIncl","true");
metadataPage.put("lMode","Inline-block");
IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_8");
metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
if(pyVisibility) {
pzLayoutBody_1();
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
if(pzAuto.handleEvaluateWhen(" wxpyDisplayPropertiesSF","pyDisplayPropertiesSF", "layout", "visible" )) {boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(3)','clipboardPath':'pzEmptySection'}") + ">");
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
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_2() {
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " blank_sectionBodyContainerSubHead'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_1();
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
strRWPreActivity = "pzSetLabel,";
if(currentTemplatingStatus =='N'){

}
String strDTransform = "";
strDTransform = "";
if(currentTemplatingStatus =='N') {
try {
tools.appendString("RWP=\".pyExpression\" RW=\".pyExpression Changes\" RWA=\"");
tools.appendString("pzSetLabel,");
tools.appendString("\" ");
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
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyExpression"), -1);
	}
}catch(Exception e){}
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
	secInfo.put("packageSection", true);
	secInfo.put("packageSectionClass", "Data-MO-Connector-Transition");
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(StringUtils.isBlank(expressionId)) {
		expressionId = pxUniqueStreamHash+"_5";
	}
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyExpression Changes", expressionId);
		if(StringUtils.isBlank(expressionId)) {
			expressionId = pxUniqueStreamHash+"_6";
		}
			expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyExpression Changes", expressionId);
			String strRWPreActivity = "";
			strRWPreActivity = "pzSetLabel,";
			
			expression.addActivity("sectionRefreshWhen", "pzSetLabel", null, null);
			String strDTransform = "";
			strDTransform = "";
			if(!StringUtils.isBlank(expressionId)) {
				secInfo.put("pyExpressionId", expressionId);
			}
			}
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_4","pzNamePropertiesSection", secInfo);
		}
public void buildWhiteList_1() {
Map<String, String> config;
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "pzSetLabel");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
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
config.put("pyActivity", "pzNullValues");
config.put("DeferLoadActivity", "");
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
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
	pzPackageRuntime.packageSection(
	"pzNamePropertiesSection", tools.getStepPage().getReference(),"Data-MO-Connector-Transition");}catch(Exception e1){oLog.error("Error generating package - " + e1.getMessage());}
	}
	generateClientWhenDiv_1();
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pzNamePropertiesSection";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	tools.appendString("\n\t\t\t\t\t\t</div>");
	}
}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzScreenFlowPropertiesBB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(2)','clipboardPath':'pzNamePropertiesSection'}") + "class='blank_groupBoxStyle' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzScreenFlowPropertiesBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\"><tr><td>");
}
public void LayoutWrapperTableEnd_1() {
tools.appendString("</td></tr></table>");
}
public void pzLayout_2() {
char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")) {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxpyDisplayPropertiesSF","pyDisplayPropertiesSF", "layout", "visible" )) {boolean bWrapIncSection = (!pzAuto.getBrowserUtils().isIE() || !"8.0".equals(pzAuto.getBrowserUtils().getBrowserVersion())) && !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(bWrapIncSection){
tools.appendString("<span class='inspector-span' >");
}
pzSetExpandParam_2();
if(parentTemplatingStatus == 'Y') {
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus('Y');
}
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
pzLayoutBodyWrapper_2();
 LayoutWrapperTableEnd_1(); if(bWrapIncSection){
tools.appendString("</span>");
}}
}
} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
}
public void pzLayoutBodyWrapper_1() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_1();
}
tools.putSaveValue("rowClass","");
}
public void 
labelIncludeInCell_1(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2017062907572905643804") + "  ");
if(!labelForAttribute.equals("")){tools.appendString(" for='" + labelForAttribute + rlIndex + "' ");
}String labelForError="";if(!propertyName.equals("")){try { labelForError = pzSection.getCell().getLabelForError(pageName,propertyName);}catch(Exception e) {} }tools.appendString(labelForError);
if(!accessKey.equals("")){tools.appendString(accessKey);
}else if(bRuntimeAccesskey){String aKey = pega_uiengine_harness.pzGetAKey(".pyCaption",labelValue,pega_procom_harness.IsParam(labelValue) );tools.appendString(aKey);
}tools.appendString(" >");
if(isRequired){
tools.appendString("<span class=\"iconRequired " + sLabelFormat + "_iconRequired\">");
}
if(bRuntimeAccesskey)labelValue=tools.getParamValue("pzULabel");else if(pega_procom_harness.IsParam(labelValue) ){String paramName = labelValue.substring(labelValue.indexOf(".")+1);labelValue = tools.getParamValueCSF(paramName);if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);}else if(bLocalize)labelValue=tools.getLocalizedTextForParameterizedString("pyCaption",labelValue);tools.appendString(labelValue);
if(isRequired){
tools.appendString("</span>");
}
if(isRequired){
String reqString = "Required";
if(bLocalize){
reqString = tools.getLocalizedTextForParameterizedString("pyCaption","Required");
}
tools.appendString("<strong class=\"required-field-accessibility\">" + reqString + "</strong>");
}
tools.appendString("</label>");
}


public void layoutBody_1() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(1)") + "  section_index='1'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "width:130px;",false,"","");tools.appendString("<nobr>");
	labelIncludeInCell_1("","","","",false,"No properties to set.",false,false,"Standard",false);
	tools.appendString("</nobr>");
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzScreenFlowPropertiesB","",false);
}
public void pzLayout_1() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxpyDisplayNoPropertiesSF","pyDisplayNoPropertiesSF", "layout", "visible" )) {pzSetExpandParam_1();
pzLayoutBodyWrapper_1();
}
}
}
public void pzGroup_1() {
	String expandedGrpId=tools.getParamCSF("EXPANDEDTGpzScreenFlowPropertiesA");
	String activatedGrpId=tools.getParamCSF("ACTIVATEDTGpzScreenFlowPropertiesA");
	String param_renderSingle=tools.getParamValue("RenderSingle");
	if(!expandedGrpId.equals("")){
		tools.putSaveValue("defaultTab", expandedGrpId);
	}else{
		tools.putSaveValue("defaultTab" ,"1");
	}
	
	activatedGrpId=tools.getParamCSF("ACTIVATEDTGpzScreenFlowPropertiesA");
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
	tools.appendString("<div " + pzSection.getLayout().getInspectorData("TABGROUP", ".pySections(6)") + " id='PEGA_TABBED'   tabGroupId='TGpzScreenFlowPropertiesA' tabGroupName='' activeWhenTab = '" + activeTabSaveValue + "' defaultTab='" + defaultTabSaveValue + "' class= 'yui-navset pegaTabGrp yui-navset-top subTabbed subTabbed-t' data-taberror=\"" + tools.getLocalizedTextForString("pxRequestor.pyMessageLabel","TabErrorTooltip")  + " \"  data-pos=\"Top\">");
	if(!("true").equalsIgnoreCase(bIsScreenLayout) || !("true").equals(sectionHasDynamicLayout)){
	if(param_renderSingle.equals("")){
		boolean bExpandRL=tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"expandRL");
	 String param_Index=tools.getParamValue("index");
	String expandedSecId="";
	 String expandRLExprValue=(bExpandRL?param_Index:"");expandedSecId="EXPANDEDSubSectionpzScreenFlowPropertiesBBBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("1")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}expandedSecId="EXPANDEDSubSectionpzScreenFlowPropertiesBBBBBBB"+ expandRLExprValue;if(defaultTabSaveValue.equals("2")){ 
		 tools.putParamValue(expandedSecId,"true");
	} else {
		tools.putParamValue(expandedSecId,"false");
}
		groupHeaderStart_1();
groupHeaderItem_1();
groupHeaderItem_2();
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
	if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");} if(pzAuto.handleEvaluateWhen(" wxpyDisplayPropertiesSF","pyDisplayPropertiesSF", "layout", "visible" )) {pzLayoutBodyWrapper_6();}if(isParentTemplate){pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue("TAB_PARENT_TEMPLATE", "true");} if(pzAuto.handleEvaluateWhen(" wxpyDisplayPropertiesSF","pyDisplayPropertiesSF", "layout", "visible" )) {pzLayoutBodyWrapper_7();}
	tools.appendString("</div><input type='hidden' name='EXPANDEDTGpzScreenFlowPropertiesA");
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
	oStreamProperties_1.put("pyClassName", "Data-MO-Connector-Transition");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION DATA-MO-CONNECTOR-TRANSITION PZSCREENFLOWPROPERTIES #20180713T140812.068 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzScreenFlowProperties");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION DATA-MO-CONNECTOR-TRANSITION PZSCREENFLOWPROPERTIES #20180713T140812.068 GMT", "Data-MO-Connector-Transition pzScreenFlowProperties", "Pega-ProcessArchitect", "08-01-01", "20180713T140812.068 GMT");
}
