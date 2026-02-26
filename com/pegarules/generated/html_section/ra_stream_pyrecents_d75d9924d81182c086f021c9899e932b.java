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
 * Builds JSP stream DATA-PORTAL!PYRECENTS.
 */
public class ra_stream_pyrecents_d75d9924d81182c086f021c9899e932b extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pyRecents.Data_Portal.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -749283225;
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
	public ra_stream_pyrecents_d75d9924d81182c086f021c9899e932b(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "b763536c66c67c87a4cc1b7d7551d3c41fe2a1fa";
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
/* Instance RULE-HTML-SECTION DATA-PORTAL PYRECENTS #20180713T134755.220 GMT	Pega-EndUserUI:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "b763536c66c67c87a4cc1b7d7551d3c41fe2a1fa";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pyRecents",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION DATA-PORTAL PYRECENTS #20180713T134755.220 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION DATA-PORTAL PYRECENTS #20180713T134755.220 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION DATA-PORTAL PYRECENTS #20180713T134755.220 GMT */
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
	"Rule-HTML-Section:PYRECENTS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYRECENTS","Rule-HTML-Section","DATA-PORTAL",false,"","Pega-EndUserUI","08-01-01","RULE-HTML-SECTION DATA-PORTAL PYRECENTS #20180713T134755.220 GMT","!PYRECENTS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-749283225)
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
//	RULE-HTML-SECTION DATA-PORTAL PYRECENTS #20180713T134755.220 GMT:20180713T134755.220 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayout_1(
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION GRID GETTOTALRECORDS #20180713T133337.740 GMT:20180718T092706.975 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
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
		return "1d753551c58b4bb95397cfcd7c62e757";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){
pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzLayoutBodyWrapper_2();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pyRecents",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pyRecents','insKey':'RULE-HTML-SECTION DATA-PORTAL PYRECENTS #20180713T134755.220 GMT','sectionType':'standard'}");
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")) ){
pzLayout_1();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzLayout_2();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void secureInvokeAction_1(Map<String, String> configMap) {
String page = configMap.get("configPage");
ClipboardPage actionPage = tools.findPage(page);
com.pega.pegarules.priv.runtime.IUIAction uiAction = pega.getUIEngine().getUIAction(actionPage.getProperty(".pyAction").getStringValue(), null);
if(uiAction != null) {
((com.pega.pegarules.priv.runtime.IUIActionRuntime)uiAction).prepareConfigRuntime(actionPage);
uiAction.register();
}
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("paginate", null).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutHeader_1() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionpyRecentsBB"));
metadataPage.put("titleType","Field Value");
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
String sectionTitle = "Recent";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Recent", "pyCaption");
metadataPage.put("title", sectionTitle);
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
metadataPage.put("uniqueid", "202602210109220259");
metadataPage.put("automationId", "");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
headerComponent.endComponent();
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_4() {
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div>");
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
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + "   '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("20160408135732062423695") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead","dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","RecentsPrivilegeInsufficientMessage") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20160408135732062423695")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "RecentsPrivilegeInsufficientMessage";
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
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpyRecentsBB","",true);
}
public void LayoutWrapperTableStart_2() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='layout layout-outline layout-outline-explorer' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpyRecentsBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_2(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=StringUtils.escapeIntoJavaString(tools.getLocalizedTextForParameterizedString("pyCaption","Recent"));
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel8519' data-layout-id='202602210109220233" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel8519'>" + l_sectionTitle + "</h2><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpyRecentsBB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash4 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash4 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash4 != null && !"".equals(spxUniqueStreamHash4)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash4,pxUniqueStreamHash+"_4");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString(" class='" + " content  layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash4 != null && !"".equals(spxUniqueStreamHash4)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_4");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","default");
		pg_dlmeta.put("isFlex","false");
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
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void LayoutWrapperTableEnd_2() {
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
	String paramName = "EXPANDEDSubSectionpyRecentsBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-explorer");
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxpyDoesNotHaveRecentsGadgetPrivilege", pxUniqueStreamHash+"_7");IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_7");
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
if(pzAuto.handleEvaluateWhen(" wxpyDoesNotHaveRecentsGadgetPrivilege","pyDoesNotHaveRecentsGadgetPrivilege", "layout", "visible" )) {pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_2(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_2();
}
pzLayoutBodyWrapper_4();
 LayoutWrapperTableEnd_2(); }
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBodyWrapper_3() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridCentreLayout_1();
  

 tools.putParamValue("totalRecords", "");
 tools.putSaveValue("totalRecords", "");
 tools.putParamValue("isHidePagingWhenOnePage", ""); 
 tools.putParamValue("pyPageSize", ""); 
 tools.putSaveValue("pyPageSize", ""); 
 tools.putParamValue("pyPageMode", ""); 
 tools.putParamValue("totalPages", "");
 tools.putSaveValue("totalPages", "");
 tools.putParamValue("startIndex",""); 
 tools.putParamValue("endIndex",""); 
 tools.putParamValue("currentPageIndex",""); 
 tools.putSaveValue("currentPageIndex",""); 
 tools.putParamValue("endPageIndex",""); 
 tools.putParamValue("pyReturnResultCount", "");
 tools.putParamValue("currentDisplay",""); 
 tools.putSaveValue("currentDisplay",""); 
 tools.putParamValue("recordsInCurrentPage",""); 
 tools.putSaveValue("recordsInCurrentPage",""); 
 tools.getParameterPage().remove("filteredResultsSet"); 
  

				gridEndLayout_1();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}
public void repeatingDataCell_3() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pyRecentWorkContent", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	if(Integer.parseInt(tools.getSaveValue("rowsDisplayed")) == 1) {tools.appendString("width:"); if(!tools.getParamValueCSF("Declare_pxRecentsPpxResults1colWidthCache1").equals("")) { tools.appendParamCSF("Declare_pxRecentsPpxResults1colWidthCache1");} else { tools.appendString("auto;"); }}tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pyRecentWorkContent_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void repeatingDataCell_2() {
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20160408135732062311393") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" gridCell");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:28px;");tools.appendString("width:"); if(!tools.getParamValueCSF("Declare_pxRecentsPpxResults1colWidthCache1").equals("")) { tools.appendParamCSF("Declare_pxRecentsPpxResults1colWidthCache1");} else { tools.appendString("auto;"); }tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:28px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">"); if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</td>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public void pzHeaderCellContent_1() {
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpyRecentsB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1)'}") + " class='layout layout-outline layout-outline-explorer' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpyRecentsB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\">");
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=StringUtils.escapeIntoJavaString(tools.getLocalizedTextForParameterizedString("pyCaption","Recent"));
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='2' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel8429' data-layout-id='202602210109220202" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><h2  class='header-title' id='headerlabel8429'>" + l_sectionTitle + "</h2><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpyRecentsB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}
public void 
gridBeginLayout_2() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());
if(tools.getParamValue("currentDisplay").equals("")) {
tools.putParamValue("currentDisplay", "" +"First X Results");
tools.putSaveValue("currentDisplay", "" +"First X Results");
    } else {
tools.putSaveValue("currentDisplay", tools.getParamValue("currentDisplay"));
}
boolean bShowingAll = tools.getParamValue("currentDisplay").equals("Show All");

 String strPageMode = "First X Results"; 

 String strPageSize = "5"; 

 String returnTotalCount = ""; 
tools.putParamValue("Work","true");
tools.putParamValue("Rule","true");
ClipboardPage tmpDeclarePageParams = null;
String dpParams = tools.getParamValue("declarePageParams");
java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("(\\{)(.+?)(:)|(,)(.+?)(:)");
java.util.regex.Matcher matcher = pattern.matcher(dpParams);
while (matcher.find()) {
String name = matcher.group(2);
String name1 = matcher.group(5);
if (name != null)
dpParams = dpParams.replace(name, name.replaceAll("\\.", "_"));
if (name1 != null)
dpParams = dpParams.replace(name1, name1.replaceAll("\\.", "_"));
}
try {
if (!"".equals(dpParams)) {
Object dpParamsList = tools.createPage("@baseclass","Temp_Grid_DeclarePageParams");
tmpDeclarePageParams = (ClipboardPage)dpParamsList;
tmpDeclarePageParams.adoptJSONObject(dpParams);
}
if (tmpDeclarePageParams != null && tmpDeclarePageParams.getProperty("Declare_pxRecents_pxResults_pyRecents_1") != null) {
ClipboardPage paramList = tmpDeclarePageParams.getProperty("Declare_pxRecents_pxResults_pyRecents_1").getPageValue();
java.util.Collection col= paramList.values();
Iterator it = col.iterator();
while(it.hasNext()){
ClipboardProperty cp= (ClipboardProperty)it.next();
tools.putParamValue(cp.getName(),cp.toString());
}
}
} catch(InvalidStreamError e){
oLog.error("ReloadSections:Invalid JSON Stream for data page params : "+e.getMessage());
} catch(Exception e){
oLog.error("ReloadSections:Expection : "+e.getMessage());
}

 ClipboardPage gFCritPageDeclare_pxRecents_pxResultsL3=null;

 Map selUniqMapDeclare_pxRecents_pxResultsL3 = null;

 Set filteredIndicesSetDeclare_pxRecents_pxResultsL3 = null;

	 String strFCPage = "pyFilterCriteria_Declare_pxRecents.pxResults_pyRecents_1";

	 strFCPage = strFCPage.replaceAll("[^\\w]","_");

	 ClipboardPage pg_fcPage = tools.findPage(strFCPage, true);

if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")){

	 if(pg_fcPage!=null){pg_fcPage.removeFromClipboard();}

}

	 gFCritPageDeclare_pxRecents_pxResultsL3 = tools.findPage(strFCPage, true);

	 if(gFCritPageDeclare_pxRecents_pxResultsL3==null){gFCritPageDeclare_pxRecents_pxResultsL3 = tools.createPage("Pega-GridFilterCriteria", strFCPage);}

tools.putParamValue("pyGridFilterCriteriaPage", strFCPage);

gFCritPageDeclare_pxRecents_pxResultsL3.getProperty("pyRowVisibleWhenCondition").setValue("pyShowRecents");

  selUniqMapDeclare_pxRecents_pxResultsL3 = null; // reset the variable

 if(gFCritPageDeclare_pxRecents_pxResultsL3 != null){ 

 		 filteredIndicesSetDeclare_pxRecents_pxResultsL3 = pega_uiengine_uiengine.pzPopulateFilteredindicesMap(gFCritPageDeclare_pxRecents_pxResultsL3, "Declare_pxRecents.pxResults");

 		 tools.getParameterPage().put("filteredIndicesSet", filteredIndicesSetDeclare_pxRecents_pxResultsL3);

 tools.putParamValue("populateSelectedUIValues", "true");

 		 selUniqMapDeclare_pxRecents_pxResultsL3 = pega_uiengine_uiengine.pzPopulateSelectedValues(gFCritPageDeclare_pxRecents_pxResultsL3); 

 		 tools.getParameterPage().put("selUniqMapDeclare_pxRecents_pxResultsL3", selUniqMapDeclare_pxRecents_pxResultsL3);

 tools.putParamValue("populateSelectedUIValues", "");

 }
tools.appendString("<div ");
tools.appendString(" dataSource='");if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("Declare_pxRecents.pxResults").getReference());tools.appendString("_pyRecents_1'");
tools.appendString(" hashed-dp-page='");
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) tools.appendString(tools.getProperty("Declare_pxRecents.pxResults").getReference());tools.appendString("' bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString("");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='false' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='readOnly' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bReportDefinition='false' bLoadActivity='false' bDataObject='true' bCBOptimize='true'");
if(tools.getParamValue("pyGridFilterCriteriaPage")!="" ) {
tools.appendString(" bFilteredGrid = 'true'");
}
tools.appendString(" bRangeFilterByFormat='false' bRowVisibleWhen = 'true' DPSectionID=\"SubSectionpyRecentsB\"  openOnDblClick='false' OAFunc='openRuleByKeys' ");
Declare_pxRecents_pxResults_1();
tools.appendString(">");


 ClipboardProperty pageListProp = null;

 int startIndex = "".equals(tools.getParamValue("startIndex"))?0:Integer.parseInt(tools.getParamValue("startIndex")); 


 int currentPageIndex = 0; 

 if(startIndex == 0){ startIndex = 1; } 

 tools.putParamValue("isHidePagingWhenOnePage", "true"); 

 tools.putParamValue("pyPageMode", strPageMode); 


 tools.putParamValue("pyPageSize", "5"); 

 tools.putSaveValue("pyPageSize", "5"); 

 int pyPageSize = Integer.parseInt(tools.getParamValue("pyPageSize")); 

 currentPageIndex = (startIndex % pyPageSize ==0)? (startIndex / pyPageSize) : (startIndex / pyPageSize) +1 ; 
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {


 pageListProp = tools.getProperty("Declare_pxRecents.pxResults"); 
 int iDPTotPages = (pageListProp.size()%pyPageSize==0) ? (pageListProp.size()/pyPageSize) : (pageListProp.size()/pyPageSize)+1;
 if(((startIndex/pyPageSize)+1)>iDPTotPages) {
	 currentPageIndex = iDPTotPages;
	 startIndex = ((iDPTotPages-1)*pyPageSize)+1;
 }
if(currentPageIndex<=0) { currentPageIndex = 1; }
if(startIndex<=0) { startIndex = 1; }
}

 tools.putParamValue("startIndex",startIndex); 

 tools.putParamValue("currentPageIndex",currentPageIndex); 

 tools.putSaveValue("currentPageIndex",""+currentPageIndex); 

 int endPageIndex = (currentPageIndex%10==0)?currentPageIndex:(currentPageIndex/10+1)*10; 

 tools.putParamValue("endPageIndex",endPageIndex); 

 if(pageListProp!=null) { 

 tools.putParamValue("PageListProperty",pageListProp.getReference()); 

 } else {

 tools.putParamValue("PageListProperty","Declare_pxRecents.pxResults");}
/* to calculate the total number of records in case of filtering with pagination..false*/
/* to calculate the total number of records in case of filtering with pagination..*/
if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

 {int counter = 0; int rowsDisplayed = 0; 
ClipboardProperty propActivePrev = tools.getActive(); 

	Iterator itr = tools.getProperty("Declare_pxRecents.pxResults").iterator();
		Set filteredResultsSet = new HashSet();
			while(itr.hasNext()){
				ClipboardProperty cp_eachProp = (ClipboardProperty)itr.next();
				ClipboardPage pg_eachProp = cp_eachProp.getPageValue();
				PRStackFrame frame = pega.pushStackFrame("FilteredGrid", null, pg_eachProp, false, false);
				tools.putActive(cp_eachProp);
				boolean bFilterResult = false;
				if(gFCritPageDeclare_pxRecents_pxResultsL3!= null){
				bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageDeclare_pxRecents_pxResultsL3, selUniqMapDeclare_pxRecents_pxResultsL3);
				}
				if(bFilterResult){
					int itemIndex = cp_eachProp.indexOf() ;
						filteredResultsSet.add((Integer)itemIndex);
						}
						
 			 if (gFCritPageDeclare_pxRecents_pxResultsL3== null || bFilterResult) {
						
 			 counter++; 
						
 			 if(counter>=(Integer.parseInt(tools.getParamValue("startIndex"))) && rowsDisplayed<pyPageSize) { rowsDisplayed++; } 
						
 			 } 
						pega.popStackFrame(frame, false);
						}
						
 	   tools.putParamValue("filteredResultsSet", filteredResultsSet); 
						
 	   tools.putParamValue("totalRecords", counter); 
						tools.putActive(propActivePrev); 

						
 } 
						}
						
 if(pageListProp==null && !Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {
						pageListProp = tools.getProperty("Declare_pxRecents.pxResults"); }
						
 	   int totalRecords = 0; 
						   if(!"".equals(tools.getParamValue("totalRecords"))){
						try{
						 totalRecords = Integer.parseInt(tools.getParamValue("totalRecords"));
						}catch(Exception e){/*A number format exception has occured.*/} }
						   tools.putSaveValue("totalRecords", ""+totalRecords); 

						 if(!tools.getParamValue("totalRecords").equals("")){ 

						   int endIndex = 0;

						   endIndex = startIndex + pyPageSize - 1;

						   endIndex = endIndex>totalRecords ? totalRecords : endIndex; 

						 if(tools.getParamValue("gridAction").toLowerCase().equals("insertafter")||tools.getParamValue("gridAction").toLowerCase().equals("insertbefore")||tools.getParamValue("gridAction").toLowerCase().equals("appendlast")){ 

						   endIndex = endIndex + 1;

						}

						   tools.putParamValue("endIndex",endIndex); 

						   int totalPages = (totalRecords % pyPageSize == 0)?(totalRecords / pyPageSize):(totalRecords / pyPageSize) +1; 

						   if(totalPages==0) totalPages=1; 

						   tools.putParamValue("totalPages", totalPages); 

						   tools.putSaveValue("totalPages", ""+totalPages); 

						   if("".equals(tools.getParamValue("recordsInCurrentPage"))) {

						   	 tools.putParamValue("recordsInCurrentPage", "" +(endIndex - startIndex +1));  

						   	 tools.putSaveValue("recordsInCurrentPage", "" +(endIndex - startIndex +1));  

						   }

						}

						 String pyPageMode = tools.getParamValue("pyPageMode"); 

					tools.appendString("<div  id='PEGA_GRID_SKIN' class='transparent'>");
					}
					

public void gridCentreLayout_1() {/*gridCentreLayout*/
					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
					java.util.Map functionsMap = null;
					java.util.Map classesMap = null;
					
      boolean bShowingAll = tools.getParamValue("currentDisplay").equals("Show All");
					ClipboardPage gFCritPageDeclare_pxRecents_pxResultsL3=null;
					Map selUniqMapDeclare_pxRecents_pxResultsL3 = null;
					selUniqMapDeclare_pxRecents_pxResultsL3 = null; // reset the variable
					gFCritPageDeclare_pxRecents_pxResultsL3=tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));
							 selUniqMapDeclare_pxRecents_pxResultsL3 = (Map)tools.getParameterPage().getObject("selUniqMapDeclare_pxRecents_pxResultsL3");
					pega_rules_utilities.pzRegisterActivity(tools, "pzPerformGridAction");
					Map<String, String> config;
					config = new HashMap<String, String>();
					config.put("pyTargetStream", "pzGridModalHTML");
					config.put("gridAction", "SUBMITROW");
					config.put("pzActivity", "ShowStream");
					pega.getUIEngine().getUIAction("runActivity", config).register();
					config = new HashMap<String, String>();
					config.put("SectionName", "pzGridFilterPanel");
					config.put("PreActivity", "pzGetGridColUniqueValues");
					config.put("pzActivity", "pzGetPopOverData");
					pega.getUIEngine().getUIAction("runActivity", config).register();
					pega_rules_utilities.pzRegisterActivity(tools, "pzBreakLock");
					tools.putSaveValue("bAllowRowUpdate","true");
					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					
					
					
					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					
					
					
					
					tools.putSaveValue("bUseMenuInline","false");

					
					
					
					
					
					pzGridIncludes_1();

					
					
					
					
					
					if(tools.getParamValue("partialRefresh").equals("")&& !Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()){

					
					
					
					
					
					ClipboardProperty prop = tools.getProperty("Declare_pxRecents.pxResults");

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='  ' class='yui-skin-sam gPercent");

					
					
					
					
					
					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("  ");

					
					
					
					
					
					}tools.appendString("' style='");

					
					
					
					
					
					tools.appendString("' gPropIndex='Declare_pxRecentsPpxResults1' editRowIndex='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					
					
					
					
					
					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					
					
					
					
					
					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					
					
					
					
					
					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					
					
					
					
					
					tools.appendString("gridActiveRow='");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					
					
					
					
					
					tools.getParameterPage().remove("gridActiveRow"); 

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"true\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\"");

					
					
					
					
					
					if(tools.getParamValue("showFADetails").equals("true")) { tools.appendString("callFADetails='true'"); }if(tools.getParamValue("showNextFADetails").equals("true")) { tools.appendString("callNextFADetails='true'");}if(tools.getParamValue("refreshLayoutFromConfig").equals("true")) { tools.appendString("refreshLayoutFromConfig='true'");}tools.appendString(" dpParams=\"Work,Rule\" pyPageSize = '");

					
					
					
					
					
					tools.appendParamCSF("pyPageSize"); tools.appendString("' pyReturnResultCount = '");

					
					
					
					
					
					tools.appendParamCSF("pyReturnResultCount"); tools.appendString("' pyPageMode= '");

					
					
					
					
					
					tools.appendParamCSF("pyPageMode"); tools.appendString("' totalRecords= '");

					
					
					
					
					
					tools.appendParamCSF("totalRecords"); tools.appendString("' currentPageIndex='");

					
					
					
					
					
					tools.appendParamCSF("currentPageIndex"); tools.appendString("' pySortHandled=\"false\" pyFilterHandled=\"false\">");

					
					
					
					
					
					

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					
					
					
					
					
					tools.appendString("");

					
					
					
					
					
					tools.appendString(" class='gridTable ");

					
					
					
					
					
					tools.appendString(pzSection.getRepeatStyle());String strSummary = "pyRecentList";

					
					
					
					
					
					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					
					
					
					
					
					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					
					
					
					
					
					tools.appendString(" cellspacing='0' cellpadding='0' id='' width='100%'><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"Declare_pxRecentsPpxResults1colWidthGBL\" id=\"Declare_pxRecentsPpxResults1colWidthGBL\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("Declare_pxRecentsPpxResults1colWidthGBL"));tools.appendString("\" />");

					
					
					
					
					
					
						 tools.putParamValue("expandRL","false"); 

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"Declare_pxRecentsPpxResults1colWidthGBR\" id=\"Declare_pxRecentsPpxResults1colWidthGBR\" value=\"");

					
					
					
					
					
					tools.appendString(tools.getParamValueCSF("Declare_pxRecentsPpxResults1colWidthGBR"));

					
					
					
					
					
					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					
					
					
					
					
					 if(!("".equals(tools.getParamValue("Declare_pxRecentsPpxResults1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					
					
					
					
					
					tools.appendString("' width='100%'  cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='pyRecentList' PL_PROP='Declare_pxRecents.pxResults' PL_PROP_CLASS='System-User-Recents' PRIM_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getPrimaryPage().getName());

					
					
					
					
					
					tools.appendString("' GRID_REF_PAGE='");

					
					
					
					
					
					tools.appendString(tools.getStepPage().getReference());

					
					
					
					
					
					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' style=\"display:none;\">");

					
					
					
					
					
					 repeatingDataCell_2(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
					
					
					
					
					
 {int counter = 0; int rowsDisplayed = 0; 

					
					
					
					
					
					
								 {Iterator itr_3 = null;

					
					
					
					
					
					if(!Boolean.valueOf(tools.getParamValue("pyPegaDesignMode")).booleanValue()) {

					
					
					
					
					
					
								 itr_3 = tools.getProperty("Declare_pxRecents.pxResults").iterator(); 

					
					
					
					
					
					} else {

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed", rowsDisplayed + "");

					
					
					
					
					
					}

					
					
					
					
					
					
								 boolean bGenerationForOffline = false; 

					
					
					
					
					
					
								 ClipboardProperty propActivePrev = tools.getActive();

					
					
					
					
					
					
								 while(itr_3 != null && itr_3.hasNext()){ 

					
					
					
					
					
					 
								 if(bGenerationForOffline) {

					
					
					
					
					
					
									 break;

					
					
					
					
					
					 
								}

					
					
					
					
					
					
									 ClipboardProperty cp_eachProp_3 = (ClipboardProperty)itr_3.next(); 

					
					
					
					
					
					
									  ClipboardPage pg_eachProp_3 = cp_eachProp_3.getPageValue();

					
					
					
					
					
					
									 PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, pg_eachProp_3, false, false);

					
					
					
					
					
					
									 tools.putActive(cp_eachProp_3); 

					
					
					
					
					
					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
					
					
					
					
					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
					
					
					
					
					Set filteredResultsSet = (HashSet)tools.getParameterPage().getObject("filteredResultsSet");boolean bFilterResult = false;
										 if (filteredResultsSet != null) { int itemIndex = cp_eachProp_3.indexOf() ;
										 bFilterResult = filteredResultsSet.contains(itemIndex); 
										 } else if(gFCritPageDeclare_pxRecents_pxResultsL3!= null){ 
													 bFilterResult = pega_uiengine_uiengine.pzMatchesGridFilterCriteria(gFCritPageDeclare_pxRecents_pxResultsL3, selUniqMapDeclare_pxRecents_pxResultsL3);
										 }
										 if (gFCritPageDeclare_pxRecents_pxResultsL3== null || 

					
					
					
					
					
					 tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf())) || 

					
					
					
					
					
					 bFilterResult) {

					
					
					
					
					
					
										 if(tools.getParamValue("strIndexInList").equals(String.valueOf(tools.getActive().indexOf()))) {

					
					
					
					
					
					
										 tools.getStepPage().getProperty("pyExpanded").setValue("true");

					
					
					
					
					
					}

					
					
					
					
					
					
										 counter++; 

					
					
					
					
					
					 if((counter>=(Integer.parseInt(tools.getParamValue("startIndex"))) && rowsDisplayed<(Integer.parseInt(tools.getParamValue("recordsInCurrentPage")))) || bShowingAll) { 

					
					
					
					
					
					 rowsDisplayed++; 

					
					
					
					
					
					 tools.putSaveValue("curRowNum",""+(rowsDisplayed + (Integer.parseInt(tools.getParamValue("startIndex"))) - 1)); 

					
					
					
					
					
					
						 tools.putParamValue("expandRL","true");

					
					
					
					
					
					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					
					
					
					
					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					
					
					
					
					 
								 if(!bGenerationForOffline) {

					
					
					
					
					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					
					
					
					
					}

					
					
					
					
					
					tools.appendString(" cellCont' ");

					
					
					
					
					
					 
								 if(bGenerationForOffline) {

					
					
					
					
					
					tools.putParamValue("templateRowHandle", cp_eachProp_3.getEntryHandle());

					
					
					
					
					
					tools.appendString(" ng-repeat=\"Item in rootData.Declare_pxRecents.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					
					
					
					
					 
								 }

					
					
					
					
					
					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
					
					
					
					
					
 }}catch(Exception e){}

					
					
					
					
					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					
					
					
					
					gridOpenActionIncl_1();

					
					
					
					
					
					tools.appendString(" id='");

					
					
					
					
					
					String actName =  tools.getActiveName(); if(bGenerationForOffline) {tools.appendString(actName.substring(0,actName.lastIndexOf("$")+2) + "{{$index+1}}");} else { tools.appendString(actName); }tools.appendString("'  PL_INDEX = '");

					
					
					
					
					
					if(bGenerationForOffline) {tools.appendString("{{$index+1}}");} else { tools.appendString(tools.getSaveValue("index")); }tools.appendString("' >");

					
					
					
					
					
					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					
					
					
					
					
					pzGenerateAdvParam_1(); repeatingDataCell_3(); 

					
					
					
					
					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
					
					
					
					 
								 if(bGenerationForOffline) {

					
					
					
					
					
					tools.putParamValue("templateRowHandle", "");

					
					
					
					
					
					 
								 }

					
					
					
					
					
					
						 tools.putParamValue("expandRL","false");

					
					
					
					
					
					
									 } 

					
					
					
					
					
					
										} 

					
					
					
					
					
					
									  pega.popStackFrame(frame_3, false); 

					
					
					
					
					
					
								 }

					
					
					
					
					
					
									 tools.putActive(propActivePrev);

					
					
					
					
					
					
								 }

					
					
					
					
					
					
									 tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");}  

					
					
					
					
					
					
  { 

					
					
					
					
					
					 String rowsDisStr = tools.getSaveValue("rowsDisplayed"); 

					
					
					
					
					
					 if(!rowsDisStr.equals("")) {

					
					
					
					
					
					
 int rowsDisplayed = Integer.parseInt(rowsDisStr);

					
					
					
					
					
					
 if(rowsDisplayed == 0){ 

					
					
					
					
					
					
 	if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")) { 

					
					
					
					
					
					
 	tools.putParamValue("showOnLoadMsg", "showOnLoadMsg");

					
					
					
					
					
					
 	 } else {

					
					
					
					
					
					boolean noItemsRowVisibleWhen = true;

					
					
					
					
					
					ClipboardPage pyGridFilterCriteriaPage = tools.findPage(tools.getParamValue("pyGridFilterCriteriaPage"));

					
					
					
					
					
					if (pyGridFilterCriteriaPage.getProperty("pyColumnFilterCriteria").size() != 0) {

					
					
					
					
					
						java.util.Iterator colItr = pyGridFilterCriteriaPage.getProperty("pyColumnFilterCriteria").iterator();

					
					
					
					
					
					while(colItr.hasNext()) {

					
					
					
					
					
						ClipboardProperty curCol = (ClipboardProperty)colItr.next();

					
					
					
					
					
					ClipboardPage curColPage = curCol.getPageValue();

					
					
					
					
					
						if (curColPage.getIfPresent("pyFilterCriteriaType") != null && curColPage.getIfPresent("pyUniqueValues") != null && curColPage.getIfPresent("pyUniqueValues").size() != 0) {

					
					
					
					
					
							noItemsRowVisibleWhen = false;

					
					
					
					
					
							break;

					
					
					
					
					
						}

					
					
					
					
					
					} }

					
					
					
					
					
					if (noItemsRowVisibleWhen) { tools.putParamValue("showOnLoadMsg", "showOnLoadMsg"); }

					
					
					
					
					
					
 	 } 

					
					
					
					
					
					 String tempRenderSingle = tools.getParamValue("RenderSingle");

					
					
					
					
					
					 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"1\" class=\"dataLabelRead gridCell\" >");

					
					
					
					
					
					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",""); 

					
					
					
					
					
					
									 ClipboardPage tempNoRespg = tools.createPage("System-User-Recents", "tempNoRespg");

					
					
					
					
					
					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
					
					
					
					
					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					
					
					
					
					
					gridNoRowsMesgIncl_1(); 

					
					
					
					
					
					
									  pega.popStackFrame(frame, false);  

					
					
					
					
					
					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
					
					
					
					
					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
					
					
					
					
					
 tempNoRespg.removeFromClipboard();

					
					
					
					
					
					tools.appendString("\n </td></tr>");

					
					
					
					
					
					 } } }   

					
					
					
					
					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					
					
					
					
					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					
					
					
					
					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					
					
					
					 tools.putSaveValue("bUseMenuInline", "false");

					
					
					
					
					
					 if( tools.getParamValue("partialTrigger").equals("getChildNodesDeclare_pxRecents.pxResults1") && tools.getParamValue("partialRefresh").equals("false")) {

					
					
					
					
					
						 tools.putParamValue("partialTrigger",""); 
}

					
					
					
					
					
					
					 /* GenerateGrid: End */

					
					
					
					
					
					}

					
					
					
					
					
					public void 
gridEndLayout_1
					
					
					
					
					
					() {

					
					
					
					
					
					
 tools.getParameterPage().remove("pyReportPageName"); 

					
					
					
					
					
					
 tools.getParameterPage().remove("pyGridFilterCriteriaPage"); 

					
					
					
					
					tools.appendString("</div></div>");

					
					
					
					
					}

					
					
					
					
					public void LayoutWrapperTableEnd_1() {

					
					
					
					
					tools.appendString("</div>");

					
					
					
					
					}
public void pzLayout_1() {
String gridLayoutMethodName="pzLayout_1";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxpyHasRecentsGadgetPrivilege","pyHasRecentsGadgetPrivilege", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
pzLayoutBodyWrapper_3();
 LayoutWrapperTableEnd_1(); }
}
tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_2() {

tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();gridLastRow_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pyRecentWorkContent_1() {
pzAuto.emitIncludeStreamReference("pyRecentWorkContent", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}


public void 
pzGenerateAdvParam_1() {{ String newSectionID = "GID_" + (((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
{
ClipboardPage pyDocuments = tools.findPage("pyDocuments",false);
ClipboardProperty pyDocument = pyDocuments.getProperty("pyDocument");
String harnessID = tools.getParamValue("pzHarnessID");
 if(!harnessID.equals("")){
 ClipboardProperty myDocProp = pyDocument.getPropertyValue(harnessID);
 ClipboardProperty pyGadgets = myDocProp.getProperty("pyGadgets");
 if(myDocProp.isEmpty())	 pyDocument.add(harnessID,pyGadgets);
 ClipboardPage pg_Gadgets = pyGadgets.getPageValue();
 java.util.Set subscriptsKey = pg_Gadgets.keySet();
 String oldcontainerIDList = tools.getParamValue("SectionIDList");
 if(!oldcontainerIDList.equals("")) { 
 StringTokenizer st = new StringTokenizer(oldcontainerIDList, ":"); 
 while (st.hasMoreTokens()) {
 String eachtoken = st.nextToken();
 java.util.Iterator iter_subscripts = subscriptsKey.iterator();
 while(iter_subscripts.hasNext()){ 
 String Key = (String)iter_subscripts.next();
 if(Key.indexOf(eachtoken) > -1) { 
 ClipboardProperty paramPageProperty = (ClipboardProperty)pg_Gadgets.get(Key) ;
 ClipboardPage paramPage = paramPageProperty.getPageValue();
 pg_Gadgets.remove(Key);
 } 
	 }
	 } 
		 }
		ClipboardPage pyAdvParams = tools.createPage("PegaGadget-RecentList","");
		
								pyAdvParams.putString("pyListSize","10");
								pyAdvParams.putString("pxObjClass","PegaGadget-RecentList");
								pyAdvParams.putString("pxCreateOperator","jalds");
								pyAdvParams.putString("pxCreateDateTime","20121227T075123.705 GMT");
								pyAdvParams.putString("pxCreateSystemID","sde");
								pyAdvParams.putString("pyAppliesTo","@baseclass");
								pyAdvParams.putString("pxCreateOpName","Sreekanth Jaldi");
		pyAdvParams.putString("SectionName","pyRecentWorkContent");
		pyGadgets.add(newSectionID, pyAdvParams);
			 } 
				 } 
				tools.putParamValue("newSectionID",newSectionID); } 
				}
public void repeatingDataCell_1() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pyRecentWorkContent", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pyRecentWorkContent_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}


public void gridOpenActionIncl_1() {
pzAuto.emitIncludeStreamReference("pzGridOpenAction", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Fragment", null);
}
public void 
getInlineStyle_1() {
}


public void Declare_pxRecents_pxResults_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":-1}]");

		tools.appendString(",");
		tools.appendString(",\"up\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":1}]");

		tools.appendString(",");
		tools.appendString(",\"down\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
}

public void 
gridBeginLayout_1() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());
}


public void gridDoPartialRefresh_1() { /*gridDoPartialRefresh*/
String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
java.util.Map functionsMap = null;
java.util.Map classesMap = null;
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					if(tools.getParamValue("partialTrigger").equals("appendToDeclare_pxRecents.pxResults1")|| tools.getParamValue("partialTrigger").equals("editRowDeclare_pxRecents.pxResults1") ){

					tools.putParamValue("partialRefresh", "false");

					Iterator propItr = null;

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardPage jsonRefreshRows = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

					tools.appendString("<table id='bodyTbl_right'><tbody>");

					if(jsonRefreshRows != null)

					propItr = jsonRefreshRows.getProperty("JSONArrayList").iterator(); 

					}

					while(!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows") || (propItr != null && propItr.hasNext())){

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardProperty cp = (ClipboardProperty) propItr.next();

					String pyPropRef = cp.getProperty("pyPropRef").getStringValue();

					String curRowNum = cp.getProperty("curRowNum").getStringValue();

					tools.putParamValue("strIndexInList", tools.getStepPage().getProperty(pyPropRef).indexOf());

					tools.putParamValue("curRowNum", curRowNum);

					}

					if(tools instanceof StreamBuilderToolKit) {

					ClipboardProperty pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					ClipboardProperty pagePropInList = pageListProp.getPropertyValue(Integer.parseInt(tools.getParamValue("strIndexInList")));

					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);

					tools.putParamValue("strIndexInList", pageListProp.size());

					}

					
						 tools.putParamValue("expandRL","false"); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
						 tools.putParamValue("expandRL","true");

					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					tools.appendString(tools.getSaveValue("rowClass"));  

					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.Declare_pxRecents.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
 }}catch(Exception e){}

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" id='");

					 tools.appendString(tools.getActiveName()); tools.appendString("'  PL_INDEX = '");

					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					pzGenerateAdvParam_1(); repeatingDataCell_1(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
						 tools.putParamValue("expandRL","false");

					
									  pega.popStackFrame(frame_3, false); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					if (!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					break;

					}

					}//close the refresh rows while loop

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					tools.appendString("</tbody></table>||END||");

					ClipboardPage jsonClipboardPage = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

					if(jsonClipboardPage != null)

					jsonClipboardPage.removeFromClipboard();

					}

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					 } 

					 tools.putSaveValue("isGrid", "false"); 

					
	 /* generate the transaction ID if it has been changed due to DB commit operations */ 

					
	 if(tools.getParamValue("partialTrigger").equals("dragdropDeclare_pxRecents.pxResults1")) {

					
		String latestTransID = tools.getRequestor().getRequestorPage().getString("pxClientExchange");

					
		String postedTransID = tools.getParamValue("pzTransactionId");

					
		if(!postedTransID.trim().equals(latestTransID.trim())){

					tools.appendString("\n\t\t\t||GRIDCOMMIT||");

					tools.appendString(latestTransID.trim());tools.appendString("||");

					
		 }

					
			 tools.putParamValue("partialRefresh", "false");

					
		 }

					
  if(tools.getParamValue("partialTrigger").equals("delete")) { 

					
	 if(tools instanceof StreamBuilderToolKit) {

					
		 ClipboardProperty pageListProp = null;

					pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
	 }

					
  } 

					
 if(tools.getParamValue("partialTrigger").equals("filterpopupDeclare_pxRecents.pxResults1")) { 

					
			String subScriptForColumn = tools.getParamValue("subScriptForColumn");

					
			int columnIndex = tools.getParamAsInteger(ImmutablePropertyInfo.TYPE_INTEGER,"columnIndex");

					
			int dynamicColumnIndex = tools.getParamAsInteger(ImmutablePropertyInfo.TYPE_INTEGER, "dynamicColumnIndex");

					String strCellType = tools.getParamValue("pyCellType"); 

					if(strCellType.equals("")){ strCellType = "static"; 

					if(columnIndex < dynamicColumnIndex) 

					{ 

					   strCellType = "static"; 

					}else if(columnIndex >= (dynamicColumnIndex+dynamicColCount)) 

					{ 

					   strCellType = "static"; 

					}else { 

					   strCellType = "dynamic"; 

					}} 

					
			 } 

					
					 /* GenerateGrid: End */

					}

					

public void gridLastRow_1() { /*gridLastRow*/

					String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;

					java.util.Map functionsMap = null;

					java.util.Map classesMap = null;

					tools.putSaveValue("bAllowRowUpdate","true");

					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					
					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					
					if(tools.getParamValue("partialTrigger").equals("appendToDeclare_pxRecents.pxResults1") ){

					
					tools.putParamValue("partialRefresh", "false");

					
					if(tools instanceof StreamBuilderToolKit) {

					
					ClipboardProperty pageListProp = tools.getProperty(tools.getParamValue("PageListProperty"));

					
					String strIndex1 = tools.getParamValue("lastRowToRetrieve");

					
					if("".equals(strIndex1) || Integer.parseInt(strIndex1) > pageListProp.size())

					
					strIndex1 = tools.getParamValue("strIndexInList");

					
					ClipboardProperty pagePropInList = pageListProp.getPropertyValue(Integer.parseInt(strIndex1));

					
					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);

					
					tools.putParamValue("strIndexInList", pageListProp.size());

					
					}

					
					
						 tools.putParamValue("expandRL","false"); 

					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().indexOf())); 

					
					
							 tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));

					
					
 if(!"".equals(tools.getParamValue("curRowNum"))) { tools.putSaveValue("curRowNum",""+tools.getParamValue("curRowNum")); } else {tools.putSaveValue("curRowNum",""+tools.getActive().indexOf());}

					
					
						 tools.putParamValue("expandRL","true");

					
					
							 if((Integer.parseInt(tools.getSaveValue("curRowNum")))%2==0) { 

					
					 tools.putSaveValue("rowClass","evenRow"); } else { tools.putSaveValue("rowClass","oddRow"); } 

					
					tools.appendString("\n\t\t\t\t\t\t\t<tr class='");

					
					tools.appendString(tools.getSaveValue("rowClass"));  

					
					tools.appendString(" cellCont'  ng-repeat=\"Item in rootData.Declare_pxRecents.pxResults\" ng-class-odd=\"'oddRow'\" ng-class-even=\"'evenRow'\"");

					
					 tools.putParamValue("GenOAFunc", "false"); 

					
					gridOpenActionIncl_1();

					
					tools.appendString(" id='");

					
					 tools.appendString(tools.getActiveName()); tools.appendString("'  PL_INDEX = '");

					
					 tools.appendString(tools.getSaveValue("index")); tools.appendString("' >");

					
					pzGenerateAdvParam_1(); repeatingDataCell_1(); 

					
					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
					
						 tools.putParamValue("expandRL","false");

					
					
									  pega.popStackFrame(frame_3, false); 

					
					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					
					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					
					 } 

					
					 tools.putSaveValue("isGrid", "false"); 

					
					
					 /* GenerateGrid: End */

					
					}
private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Extension");
	oStreamProperties_1.put("pyClassName", "Data-Portal");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION DATA-PORTAL PYRECENTS #20180713T134755.220 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-EndUserUI");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pyRecents");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION DATA-PORTAL PYRECENTS #20180713T134755.220 GMT", "Data-Portal pyRecents", "Pega-EndUserUI", "08-01-01", "20180713T134755.220 GMT");
}
