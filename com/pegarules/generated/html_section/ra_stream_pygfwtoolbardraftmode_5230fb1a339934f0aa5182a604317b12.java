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
 * Builds JSP stream RULE-OBJ-FLOW!PYGFWTOOLBARDRAFTMODE.
 */
public class ra_stream_pygfwtoolbardraftmode_5230fb1a339934f0aa5182a604317b12 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pyGFWToolbarDraftMode.Rule_Obj_Flow.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1814732490;
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
	public ra_stream_pygfwtoolbardraftmode_5230fb1a339934f0aa5182a604317b12(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "93ed6400e47d69f319546014c4199761ce570bd8";
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
/* Instance RULE-HTML-SECTION RULE-OBJ-FLOW PYGFWTOOLBARDRAFTMODE #20180713T140924.966 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "93ed6400e47d69f319546014c4199761ce570bd8";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pyGFWToolbarDraftMode",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-OBJ-FLOW PYGFWTOOLBARDRAFTMODE #20180713T140924.966 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-OBJ-FLOW PYGFWTOOLBARDRAFTMODE #20180713T140924.966 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-OBJ-FLOW PYGFWTOOLBARDRAFTMODE #20180713T140924.966 GMT */
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
	"Rule-HTML-Section:PYGFWTOOLBARDRAFTMODE", 
	"Rule-HTML-Property:PXICON", 
	"Rule-File-Binary:WEBWB!PZMXGEDITOR_DRAFT!PNG", 
	"Rule-File-Binary:WEBWB!PZMXGEDITOR_DRAFT!PNG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYGFWTOOLBARDRAFTMODE","Rule-HTML-Section","RULE-OBJ-FLOW",false,"","Pega-ProcessArchitect","08-01-01","RULE-HTML-SECTION RULE-OBJ-FLOW PYGFWTOOLBARDRAFTMODE #20180713T140924.966 GMT","!PYGFWTOOLBARDRAFTMODE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1814732490), 
		new DependentRuleInfo("PXICON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT","PXICON",true,false,"ABSOLUTE_CLASSLESS",-794576025), 
		new DependentRuleInfo("WEBWB!PZMXGEDITOR_DRAFT!PNG","Rule-File-Binary","",false,"","","","","WEBWB!PZMXGEDITOR_DRAFT!PNG",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZMXGEDITOR_DRAFT!PNG","Rule-File-Binary","",false,"","Pega-ProcessArchitect","","RULE-FILE-BINARY WEBWB PZMXGEDITOR_DRAFT!PNG #20190311T133634.947 GMT","WEBWB!PZMXGEDITOR_DRAFT!PNG",true,false,"ABSOLUTE_CLASSLESS",1)
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
//	RULE-HTML-SECTION RULE-OBJ-FLOW PYGFWTOOLBARDRAFTMODE #20180713T140924.966 GMT:20180713T140924.966 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BINARY WEBWB PZMXGEDITOR_DRAFT!PNG #20190311T133634.947 GMT:20190311T133634.947 GMT
//	RULE-FILE-BINARY WEBWB PZMXGEDITOR_DRAFT!PNG #20190311T133634.947 GMT:20190311T133634.947 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BINARY WEBWB PZMXGEDITOR_DRAFT!PNG #20190311T133634.947 GMT:20190311T133634.947 GMT
//	RULE-FILE-BINARY WEBWB PZMXGEDITOR_DRAFT!PNG #20190311T133634.947 GMT:20190311T133634.947 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BINARY WEBWB PZMXGEDITOR_DRAFT!PNG #20190311T133634.947 GMT:20190311T133634.947 GMT
//	RULE-FILE-BINARY WEBWB PZMXGEDITOR_DRAFT!PNG #20190311T133634.947 GMT:20190311T133634.947 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BINARY WEBWB PZMXGEDITOR_DRAFT!PNG #20190311T133634.947 GMT:20190311T133634.947 GMT
//	RULE-FILE-BINARY WEBWB PZMXGEDITOR_DRAFT!PNG #20190311T133634.947 GMT:20190311T133634.947 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_2(
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONREFRESH--(CLIPBOARDPAGE,8AECDFE4A5256F13DC3F6C7D56453947 #20190320T065455.847 GMT:20190424T132824.042 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNACTIVITY #20190830T074358.805 GMT:20190830T074358.805 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSETSTYLE #20180713T133344.632 GMT:20180713T133344.632 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEICON #20220323T120107.529 GMT:20220323T120107.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "5680f1bfc0568e5b830ba80b23624f08";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Flow";
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
  pzSection.beginSection("pyGFWToolbarDraftMode",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pyGFWToolbarDraftMode','insKey':'RULE-HTML-SECTION RULE-OBJ-FLOW PYGFWTOOLBARDRAFTMODE #20180713T140924.966 GMT','sectionType':'standard'}");
pzLayout_1();
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
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pzHandleModelerDraftModeToolbarClick");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "ViewerManager.executeAction");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pzHandleModelerDraftModeToolbarClick");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "ViewerManager.executeAction");
pega.getUIEngine().getUIAction("runScript", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzHandleModelerDraftModeToolbarClick");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "ViewerManager.executeAction");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "ViewerManager.executeAction");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzHandleModelerDraftModeToolbarClick");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "ViewerManager.executeAction");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "ViewerManager.executeAction");
pega.getUIEngine().getUIAction("runScript", config).register();
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_2() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public String 
getUIActionsMetaData_5() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-84px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
				refreshActionRequest.registerFixedParameter("StreamList", "pzRuleFormDiagram|Rule-HTML-Section|:");
				staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
				staticURLStr.append("&PreActivity=pzHandleModelerDraftModeToolbarClick");
				tools.appendString("[\"refresh\", [\"otherSection\",\"pzRuleFormDiagram\", \"pzHandleModelerDraftModeToolbarClick\", \"");
				refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
				tools.appendString("=\", \"\", \",");
				refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
				tools.appendString("\",\":event\",\"\",[\"");
				if(!"".equals(preActParamStr.toString())) {
					staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
					}
					if(!"".equals(preDTParamStr.toString())) {
						staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
						}
						tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
						pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }						tools.appendString("[\"runScript\", [\"ViewerManager.executeAction({name:\\\\u0022refresh\\\\u0022,args:{loadChildren:1}})\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }						tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");						String returnString = actionsStringBuilder.toString();
						tools.popStreamBody();
						return returnString;
					}


public void pxIcon_4() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span ");tools.appendString(">");
	 }if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
	java.util.List<String> ctPropRefs = new ArrayList<String>();
	IUIComponent ctrlComponent = pzAuto.getUIComponent();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.put("generateName","true");
	cellPage.put("pyStreamName","pyGFWToolbarDraftMode");
	cellPage.put("pyCellID","5");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
	String repeatIndx = "";
	boolean disable = false;
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen("pyIsReadOnly",pxUniqueStreamHash+"_21");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyDisabledWhenId",pxUniqueStreamHash+"_21");
	pxWhenIdentifiers.put("pyDisabledWhenName","pyIsReadOnly");
	pxWhenIdentifiers.put("pyDisabledWhenClass",((String)pega.getStreamProperties().get("pyClassName")));
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Turn Draft Mode OFF\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Turn Draft Mode OFF", ".pyActionPrompt");
	}
	pyTooltip = "Turn Draft Mode OFF";
	modePage1.put("tooltip",pyTooltip);
	modePage1.put("helpertype","tooltip");
	modePage1.put("isActionabale","true");
	modePage1.put("isClickable","true");
	String pyFormatValue = "";
	StringMap whenHc=new HashStringMap();
	whenHc.putString("pyBlockName", "pyIsHybridClient");
	modePage1.put("pyIsSprite","true");
	String style="";
	String spriteUrl = "";
	if(tools.evaluateWhen(whenHc) || pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	spriteUrl = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmBy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";
	}
	else{
	spriteUrl = "webwb/pzmxgeditor_draft_1200226081.png!!.png";
	}
	modePage1.put("src",spriteUrl);
	modePage1.put("leftOffset","-84");
	modePage1.put("pyIconWidth","84");
	modePage1.put("pyIconHeight","26");
	if(disable){
	modePage1.put("pyDisabled",disable+"");
	}
	modePage1.put("iconSrc","image");
	modePage1.put("pyFormatTypeActionable","");
	modePage1.put("pyFormatValue",pyFormatValue);
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("2014093014153002368434") + " ");
	String spxUniqueStreamHash22 = getUIActionsMetaData_5();
	if(spxUniqueStreamHash22 != null && !"".equals(spxUniqueStreamHash22)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash22,pxUniqueStreamHash+"_22");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_22");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
	ctrlComponent.beginComponent("pxIcon",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pyGFWToolbarDraftMode_"+ referenceString+ "_5'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Turn Draft Mode OFF\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
			if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "pyIsReadOnly", null, false)){
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2014093014153002368434") + "  ");
		tools.appendString("onclick_func='pd(event);' href='' ");
		tools.appendString(" data-ctl='Icon' "); tools.appendString(" IsSprite='true' href_original='' class='cursordefault' disabled='disabled' style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmBy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");
		}
		else{
		
		tools.appendString("webwb/pzmxgeditor_draft_1200226081.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-84px -52px; width:84px; height:26px;' ");
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-84px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-84px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
				com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
					StringBuffer staticURLStr = new StringBuffer();
					StringBuffer preActParamStr = new StringBuffer();
					StringBuffer preDTParamStr = new StringBuffer();
					refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
					refreshActionRequest.registerFixedParameter("StreamList", "pzRuleFormDiagram|Rule-HTML-Section|:");
					staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
					staticURLStr.append("&PreActivity=pzHandleModelerDraftModeToolbarClick");
					tools.appendString("[\"refresh\", [\"otherSection\",\"pzRuleFormDiagram\", \"pzHandleModelerDraftModeToolbarClick\", \"");
					refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
					tools.appendString("=\", \"\", \",");
					refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
					tools.appendString("\",\":event\",\"\",[\"");
					if(!"".equals(preActParamStr.toString())) {
						staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
						}
						if(!"".equals(preDTParamStr.toString())) {
							staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
							}
							tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
							pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							tools.appendString("[\"runScript\", [\"ViewerManager.executeAction({name:\\\\u0022refresh\\\\u0022,args:{loadChildren:1}})\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
				tools.appendString(" disabled ");
			} else {
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2014093014153002368434") + "  ");
		tools.appendString("onclick='pd(event);' href='' ");
		tools.appendString("tabindex='0' ");
		tools.appendString("IsSprite='true' data-ctl='Icon' "); tools.appendString("style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmBy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");
		}
		else{
		
		tools.appendString("webwb/pzmxgeditor_draft_1200226081.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-84px top; width:84px; height:26px;' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }							tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-84px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-84px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }								{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
									com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
										StringBuffer staticURLStr = new StringBuffer();
										StringBuffer preActParamStr = new StringBuffer();
										StringBuffer preDTParamStr = new StringBuffer();
										refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
										refreshActionRequest.registerFixedParameter("StreamList", "pzRuleFormDiagram|Rule-HTML-Section|:");
										staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
										staticURLStr.append("&PreActivity=pzHandleModelerDraftModeToolbarClick");
										tools.appendString("[\"refresh\", [\"otherSection\",\"pzRuleFormDiagram\", \"pzHandleModelerDraftModeToolbarClick\", \"");
										refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
										tools.appendString("=\", \"\", \",");
										refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
										tools.appendString("\",\":event\",\"\",[\"");
										if(!"".equals(preActParamStr.toString())) {
											staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
											}
											if(!"".equals(preDTParamStr.toString())) {
												staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
												}
												tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
												pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }												tools.appendString("[\"runScript\", [\"ViewerManager.executeAction({name:\\\\u0022refresh\\\\u0022,args:{loadChildren:1}})\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }												tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
			}
			tools.appendString(" ></a>");
		}												}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }												tools.putParamValue("doAutoFormatting", "false");
												tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}												} catch (Exception e) {

												
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'												&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }													}


}

public String 
getUIActionsMetaData_4() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"changeStyle\",[\":event\",\"background-position:0px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
				refreshActionRequest.registerFixedParameter("StreamList", "pzRuleFormDiagram|Rule-HTML-Section|:");
				staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
				staticURLStr.append("&PreActivity=pzHandleModelerDraftModeToolbarClick");
				tools.appendString("[\"refresh\", [\"otherSection\",\"pzRuleFormDiagram\", \"pzHandleModelerDraftModeToolbarClick\", \"");
				refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
				tools.appendString("=\", \"\", \",");
				refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
				tools.appendString("\",\":event\",\"\",[\"");
				if(!"".equals(preActParamStr.toString())) {
					staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
					}
					if(!"".equals(preDTParamStr.toString())) {
						staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
						}
						tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
						pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }						tools.appendString("[\"runScript\", [\"ViewerManager.executeAction({name:\\\\u0022refresh\\\\u0022, args:{loadChildren:1}})\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }						tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");						String returnString = actionsStringBuilder.toString();
						tools.popStreamBody();
						return returnString;
					}


public void pxIcon_3() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span ");tools.appendString(">");
	 }if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
	java.util.List<String> ctPropRefs = new ArrayList<String>();
	IUIComponent ctrlComponent = pzAuto.getUIComponent();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.put("generateName","true");
	cellPage.put("pyStreamName","pyGFWToolbarDraftMode");
	cellPage.put("pyCellID","4");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
	String repeatIndx = "";
	boolean disable = false;
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen("pyIsReadOnly",pxUniqueStreamHash+"_16");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyDisabledWhenId",pxUniqueStreamHash+"_16");
	pxWhenIdentifiers.put("pyDisabledWhenName","pyIsReadOnly");
	pxWhenIdentifiers.put("pyDisabledWhenClass",((String)pega.getStreamProperties().get("pyClassName")));
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Turn Draft Mode ON\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Turn Draft Mode ON", ".pyActionPrompt");
	}
	pyTooltip = "Turn Draft Mode ON";
	modePage1.put("tooltip",pyTooltip);
	modePage1.put("helpertype","tooltip");
	modePage1.put("isActionabale","true");
	modePage1.put("isClickable","true");
	String pyFormatValue = "";
	StringMap whenHc=new HashStringMap();
	whenHc.putString("pyBlockName", "pyIsHybridClient");
	modePage1.put("pyIsSprite","true");
	String style="";
	String spriteUrl = "";
	if(tools.evaluateWhen(whenHc) || pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	spriteUrl = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmByvQAI/Pu0Ir37YcOZmpZmRukCZ5svdKBhJy9YoHauXRsITlef16+78IngFf+xdKmBBDj5yz5QUR+Q/cvxvJy7QwP2748/dsHzw4n8RX+fU1io/rl6tfl+ZGmpCUciegh9H5RFmRiNwBwqoACRr7sipKqqSn399ddq//79Eee0traqx48fx9VgAIp34+MFVGJUgBLvh3cUbxi0C8czNjQ0mPoo/+bNm6Y8v3EkW6YtW6YKdAyPHNyyRe3QwOzV3tIrLU1N6vHDh/HpUwOKx+LjBVRiVIDqr8cPwDTOCa/YDyKAhqfFM1Mf5fOhPK9xSHjAeUHriQnQgQMHut14e3u7Ouc8KHHmQ0eBp06distzulbWBSCAKSAu0w0KSECFR4tHBGjvQEeMICjsicjA3Fw1TXsuo09t0L9VVprty0ePqofNzWb75J49cXlOr9fqpE/tQKRb/tu2bWr87NkGKLr3uPTpgAacfiPwGgYGkdRppvHjx6t+zjRHk7Zq2Z6grYe4FDl9+nRCjQYgwCJQesMI8XB08cCZkZHRCTSvJ44mUrbXGIY5gxBvvcmWovJy1c/R2w1t1P14npQUVaTje+JSY/DffZdQHQACLF44ZFs8HF08cApMXtC8njiqPh3gvcaAR00UysCDJBksNOrAmlhsgY6N8vLyVJqOo+R4SwI3JIOQaNNCUjYwAbLEwYAaZNqHQRdGwPXUR1lMRwE+5QisyZZR06ebvw3a2A7ogcfCjRtVvu7u09LT3eP3btyIP3zQ8STQRPOMAh0wAafEhGx3B6Rf6LIxAq6nPq6nTMAPUk5CgEojCpzEgIU6KBbBo8YzgMArfvDBB67XA85oU0yAxaCHa/iwDWAARQzp95JyLmEBsatXuNfXX3/dfCeDqUM9OIXSPzNT5RUVuXDO1wOLEZ5R/A09IDzgm9eMRfCKf//mGxdARsrRppgAi7iQa/iwDWDAJV201+vKuYQFxK5eYcTOlBbfSbwZ5nyp/B406gQbc5vSsF44nzx5YrpbPk+fPlVW/icrV65M+XLJkqj6XPzJJ0orrBOcT3QsX6MBq9EG9VTH+VZi9KB4N+YbgXPIkCFmYIRHO3/+vHrw4IHVYEBpbmgw843AOVR7eSbgrx4/bgZKD+7csQoKCuiPP/6oZuvRHkJ32ZODiedRqrZuVXM+/JCJZdNdPrp/3yol0UESkFoJF1IrIU4zWbFiAbVixQJqxQJqxUoSAK21qghFaq0+Q9anzSxipTeLmWaqtpkwQrP4VysqSq0+w9OnzSwSrtjMIiHr0w6SrNhRvBUrfzigeYsWqQkbNqiUPp4Jw+qzFwKKMl9ctUrlzpypJqxfbyG1+uw9gKYOGKAKPZkwBpeVWUitPkMT84PlI0uXdsRr6f3z8tTNH35QkzdvVumeVybu/PKLOtdFJozMCRNUse8X4+0tLerKjh3qZpyZMMasWaOGO5kwLjm/5s7S9VwK+MvutOxsNX7dOpXjvAJxmve9ly9390+uXq3anvEqw6sVFSnV3fxguS/pMwyJyyz75+er/MWLVYEnE0b9pk0RSm1+RiaM24cOqfPOC/5AMEbexw6oVKBCmffPnTNASYPdjuM1jpzSUgNj4+7d6qpu4CGzZkXsJ0ueV332OKD9cnKMhxnky4RR6GTCQKmTtFIbd+5UTQFemaXx87RS+KBQFEyZzTU1BhC+b2tsVKNWrFAZzhuEAk2JY9UocroHIuBCsad9yQb8XlIaluvHOwkHqJt9OYf9jMJCF4DQlP8c61MMhXq5B67nXLYvJSOzSEpamhlVijKf+N6m5EaGL1igTq1dG0iZInSdGb53ubFiHX6oJpSslcnDsY8SqA+l1DqegnOPa4WccTJhcM7pLjJhTNLfAxvdNd/jNQGT60WxNNZZfZ53P2w4n3d9RvQQ+j4oizLxzjnJyCxSuGyZynYyYVzYskXV6Af8zZcJ41FTk3oaZyYMFIqFpXle+L/vvGFITIUC0rKyzMMPcTJhpAXMhIFi8Az3tCehPspv1R/Ky+gi0UEypS/pU8KDZiezSFrYmUXSc3NVoZMJo+PxY3XLyYRx9+hR9cTJhHF9z564LF2kK0DancQAKPnlbdvUkNmzjRIa48yEIYrxDnSk0bwNmWzpa/psT3ZmkaHl5Wb6A2mpq1OpTiaMoXPnmjgKuZFgJgweiIfzPswTZ1sski4JZfZzHr6rEXV3o2xpIG/jZTqZMNpDyoRh9RmuPmMaJOU4mTDu1daq8zpQLtq40XRPKU4mDI4/SiAThhmE6Ie8FMWSHzlK4uFR/CAnhkGxbQEyWNDF0GhcT32UxfQJDUU5otxkS1/RZ48AmpaZqTKLilxl+kedrfX15nhQwYpnOJkweBhGdtGmRFAEcQzX8GEbhaDgVl8mDCxXzqUbO+nLhMFg50U9EHjZyYTBuT05v2f1GfJE/SQnE4ZfmQTvjVohjbt2qQ6bCSPmiXqrz5A9aFtDg5kfQ5kDx441E8bNx4+bwP6xzYQRfHRt9RkuoJe2blVjnEwYuPd2mwkjIbH6TMIg6ZLNhBE6pFZCnGayYsUCasWKBdSKBdSKlSQAajNhhCM2s0jY+rSZRaz0ZjH/SaqqqrKZMEKy+PLy8tLKykqrz5D0aTOLhCs2s0jI+rSDJCt2FG/Fyh8OKAvJsoqbHXSFI6yGN3XqVJWSkmIBDQPOO3fumIVlb926ZSENAc6ioiKzkl5fhzRhQIHRu16mhTQxYf3T0aNHu/tDhw7t05AmlE8Fz8ny3KzlyZqZ7c4PbQXSrhZnZT35G77XGVJTU1VOTo7KCvhWoQjeu9V5PyY3N9etR7ZjFZZ05L5lleX8/Hx19+5dd7+goMBd6TlZnpMFcllesrS01F0iHEiLi4vVr7/+2uma7Oxs9corr0QcY5nKCxcumPVV45GJEye6S16ePXvW/GVtVNnu9YACIisQe1c49kMqy3RHE9agR/FIc3OzgQwJCilQAWd6eroBSgyA8oMKIPKhMTAYlnr07idL0BUrSo8aNcrs4y1PnDgRAent27e7LQPdy5Lo48aNM5AhQSHFAIGTtj127JhrAP5Fe3sloH4PIyJdvEBKgwYBjcYHMj5cB7CUiTehLr5HcRzHO4hFc/y683IWYDY0NLhlAhegAm13zyCGwvUcl+dhyUc5h33qFYMKSzCqKVOmdPL0L7zwgvkLpCxVfvny5Yhne5bgPYEMjwygAEuZOAHq4nt6OY6LI7ly5Yo5XlZW5npmVoX2OiBABVo/0Hh3eQa/oVAv98D1nMt2EE8ccwxKTMkoXRqNbtkP6f379003GE9XTezV7nsXB++BVxFoMzMzzT5QUR/3UuC88kpj0yAoQsDzwykKpB6u43vKAEyuFwCBn3K8+2HDiZcktvSGJH5IuUcW8g0Cp3cs4O/F8IpVVVUutJTLPjqhPu7l8OHD7rk//fSTCTdEb344EQyIeriO7ykDYP09BGVRJoYTJPSKGVAKl4VkWfUYGPwxJpDFG8xjXXg379Le6c5ruBgDjYWRAJOsshx0GXBgBAQ8M/VRPh/KE8/cU8JASMKG+vp69fPPP6uTJ092ut/2OF+gA1Ce0RszS0/HswIUzw5MYtRB42tAw9PKDI6EfZTnNY6mpiZ3rBC0npgABQR5OADEk4lliCflRuMd5IjSOt2cUzb105UDEkrFo8UjAjSG5PXS0kP0lFCndOPckwwaiTPFk7LseTye0+u1oukYQOjKAYl2pXuP16lIOOV1ZH4IEzH+mACl65YGRLmyzXFp9OwEU8dQJvB5QwfZFg+HYQCn1NmVJXrhiwa81ytJr9CT0zh5eXnufRK6yDYhh/Qa165dS2xwoXUDLF44ZFs8HAYAnKLHh13kgXrYTW4oKc87IBUOwuqRYvK1EnfSNRKLEYvSsAIqx7sD41kig5BosYkoEO8CnHI/bAepl/sEAK6nPu6fMvH81OGPA5MlhEjS5dXV1ZlYlO5eDEi6zHgF7wyA0QYjUjbGznOL3oN28dwnRsD11Mf1AEqMm8j9BwIUCIBR4PSP4vGo8Qwg8Ip0Y6IYHjJaiEDdWCnX8GEbwLgv8TheLynnEhYU+JJoca8oVkb/nBt0vjRRzyZxG3D6R/F4VI4HFbzinDlzXACBM9oUE3Uz6OEamXkBMO6rxZdTCT3LuYQFMogSYcTOlJaM/jk3zPlS+T1oR3fza9KwXjjpErFAHqqv/7/YK+Xl5SmVlZVR9cncJjr3w0nYQXfLlJL9L1wAD0oXOnjwYAMnXSCWhkcjHvRPNVmJree4ePGigZMeg4ERH0a6Eg9bCQAo8ZL8F4Pu0kKZmND90SXS61RXV/f49NZzB6g3qLcSHqRWQpxmsmLFAmrFigXUigXUipUkAGozYYQjNrNIyPpMsZPCVnqz/FeAAQAgtAUk0dJazQAAAABJRU5ErkJggg==";
	}
	else{
	spriteUrl = "webwb/pzmxgeditor_draft_1200226081.png!!.png";
	}
	modePage1.put("src",spriteUrl);
	modePage1.put("leftOffset","0");
	modePage1.put("pyIconWidth","84");
	modePage1.put("pyIconHeight","26");
	if(disable){
	modePage1.put("pyDisabled",disable+"");
	}
	modePage1.put("iconSrc","image");
	modePage1.put("pyFormatTypeActionable","");
	modePage1.put("pyFormatValue",pyFormatValue);
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("2014093014153002367807") + " ");
	String spxUniqueStreamHash17 = getUIActionsMetaData_4();
	if(spxUniqueStreamHash17 != null && !"".equals(spxUniqueStreamHash17)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash17,pxUniqueStreamHash+"_17");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_17");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
	ctrlComponent.beginComponent("pxIcon",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pyGFWToolbarDraftMode_"+ referenceString+ "_4'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Turn Draft Mode ON\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
			if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "pyIsReadOnly", null, false)){
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2014093014153002367807") + "  ");
		tools.appendString("onclick_func='pd(event);' href='' ");
		tools.appendString(" data-ctl='Icon' "); tools.appendString(" IsSprite='true' href_original='' class='cursordefault' disabled='disabled' style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmBy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");
		}
		else{
		
		tools.appendString("webwb/pzmxgeditor_draft_1200226081.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:0px -52px; width:84px; height:26px;' ");
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:0px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:0px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }			{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
				com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
					StringBuffer staticURLStr = new StringBuffer();
					StringBuffer preActParamStr = new StringBuffer();
					StringBuffer preDTParamStr = new StringBuffer();
					refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
					refreshActionRequest.registerFixedParameter("StreamList", "pzRuleFormDiagram|Rule-HTML-Section|:");
					staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
					staticURLStr.append("&PreActivity=pzHandleModelerDraftModeToolbarClick");
					tools.appendString("[\"refresh\", [\"otherSection\",\"pzRuleFormDiagram\", \"pzHandleModelerDraftModeToolbarClick\", \"");
					refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
					tools.appendString("=\", \"\", \",");
					refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
					tools.appendString("\",\":event\",\"\",[\"");
					if(!"".equals(preActParamStr.toString())) {
						staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
						}
						if(!"".equals(preDTParamStr.toString())) {
							staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
							}
							tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
							pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							tools.appendString("[\"runScript\", [\"ViewerManager.executeAction({name:\\\\u0022refresh\\\\u0022, args:{loadChildren:1}})\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
				tools.appendString(" disabled ");
			} else {
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2014093014153002367807") + "  ");
		tools.appendString("onclick='pd(event);' href='' ");
		tools.appendString("tabindex='0' ");
		tools.appendString("IsSprite='true' data-ctl='Icon' "); tools.appendString("style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmBy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");
		}
		else{
		
		tools.appendString("webwb/pzmxgeditor_draft_1200226081.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:0px top; width:84px; height:26px;' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }							tools.appendString("[\"changeStyle\",[\":event\",\"background-position:0px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							tools.appendString("[\"changeStyle\",[\":event\",\"background-position:0px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }								{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
									com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
										StringBuffer staticURLStr = new StringBuffer();
										StringBuffer preActParamStr = new StringBuffer();
										StringBuffer preDTParamStr = new StringBuffer();
										refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
										refreshActionRequest.registerFixedParameter("StreamList", "pzRuleFormDiagram|Rule-HTML-Section|:");
										staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
										staticURLStr.append("&PreActivity=pzHandleModelerDraftModeToolbarClick");
										tools.appendString("[\"refresh\", [\"otherSection\",\"pzRuleFormDiagram\", \"pzHandleModelerDraftModeToolbarClick\", \"");
										refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
										tools.appendString("=\", \"\", \",");
										refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
										tools.appendString("\",\":event\",\"\",[\"");
										if(!"".equals(preActParamStr.toString())) {
											staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
											}
											if(!"".equals(preDTParamStr.toString())) {
												staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
												}
												tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
												pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }												tools.appendString("[\"runScript\", [\"ViewerManager.executeAction({name:\\\\u0022refresh\\\\u0022, args:{loadChildren:1}})\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }												tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
			}
			tools.appendString(" ></a>");
		}												}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }												tools.putParamValue("doAutoFormatting", "false");
												tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}												} catch (Exception e) {

												
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'												&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }													}


}



public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxpzDraftModeOff","pzDraftModeOff","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxIcon_3();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014093014153002367807-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxIcon");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzDraftModeOff",pxUniqueStreamHash+"_19");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_19");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzDraftModeOff");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-Obj-Flow");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_19");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpzDraftModeOff", pxUniqueStreamHash+"_19"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxIcon_3();}
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
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
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
	if(!pzAuto.handleEvaluateWhen(" wxpzDraftModeOn","pzDraftModeOn","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxIcon_4();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_4( int index) {
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
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014093014153002368434-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxIcon");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzDraftModeOn",pxUniqueStreamHash+"_24");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_24");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzDraftModeOn");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-Obj-Flow");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_24");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpzDraftModeOn", pxUniqueStreamHash+"_24"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxIcon_4();}
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
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpyGFWToolbarDraftModeBB","",false);
}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash14 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash14 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash14 != null && !"".equals(spxUniqueStreamHash14)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash14,pxUniqueStreamHash+"_14");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201807101523280375934") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='" + " content  layout-content-inline_middle content-inline_middle  clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash14 != null && !"".equals(spxUniqueStreamHash14)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_14");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_3(index);
	}else{
		index=simpleLayoutTemplateCell_3(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_4(index);
	}else{
		index=simpleLayoutTemplateCell_4(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
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
	String paramName = "EXPANDEDSubSectionpyGFWToolbarDraftModeBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxpzIsInOutlineView", pxUniqueStreamHash+"_25");metadataPage.put("lMode","Inline-block");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_25");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_2();
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
if(pzAuto.handleEvaluateWhen(" wxpzIsInOutlineView","pzIsInOutlineView", "layout", "visible" )) {pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_2();
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
public void pzLayoutBodyWrapper_1() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-84px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzHandleModelerDraftModeToolbarClick");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }				{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
					com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
						StringBuffer staticURLStr = new StringBuffer();
						StringBuffer preActParamStr = new StringBuffer();
						StringBuffer preDTParamStr = new StringBuffer();
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("StreamList", "RuleFormLayout|Rule-HTML-Section|:");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						tools.appendString("[\"refresh\", [\"otherSection\",\"RuleFormLayout\", \"\", \"");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("=\", \"\", \",");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("\",\":event\",\"1\",[\"");
						if(!"".equals(preActParamStr.toString())) {
							staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
							}
							if(!"".equals(preDTParamStr.toString())) {
								staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
								}
								tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
								pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }								tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");								String returnString = actionsStringBuilder.toString();
								tools.popStreamBody();
								return returnString;
							}


public void pxIcon_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span ");tools.appendString(">");
	 }if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
	java.util.List<String> ctPropRefs = new ArrayList<String>();
	IUIComponent ctrlComponent = pzAuto.getUIComponent();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.put("generateName","true");
	cellPage.put("pyStreamName","pyGFWToolbarDraftMode");
	cellPage.put("pyCellID","2");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
	String repeatIndx = "";
	boolean disable = false;
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen("pyIsReadOnly",pxUniqueStreamHash+"_9");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyDisabledWhenId",pxUniqueStreamHash+"_9");
	pxWhenIdentifiers.put("pyDisabledWhenName","pyIsReadOnly");
	pxWhenIdentifiers.put("pyDisabledWhenClass",((String)pega.getStreamProperties().get("pyClassName")));
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Turn Draft Mode OFF\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Turn Draft Mode OFF", ".pyActionPrompt");
	}
	pyTooltip = "Turn Draft Mode OFF";
	modePage1.put("tooltip",pyTooltip);
	modePage1.put("helpertype","tooltip");
	modePage1.put("isActionabale","true");
	modePage1.put("isClickable","true");
	String pyFormatValue = "";
	StringMap whenHc=new HashStringMap();
	whenHc.putString("pyBlockName", "pyIsHybridClient");
	modePage1.put("pyIsSprite","true");
	String style="";
	String spriteUrl = "";
	if(tools.evaluateWhen(whenHc) || pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	spriteUrl = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmBy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";
	}
	else{
	spriteUrl = "webwb/pzmxgeditor_draft_1200226081.png!!.png";
	}
	modePage1.put("src",spriteUrl);
	modePage1.put("leftOffset","-84");
	modePage1.put("pyIconWidth","84");
	modePage1.put("pyIconHeight","26");
	if(disable){
	modePage1.put("pyDisabled",disable+"");
	}
	modePage1.put("iconSrc","image");
	modePage1.put("pyFormatTypeActionable","");
	modePage1.put("pyFormatValue",pyFormatValue);
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("2014093013532209447249") + " ");
	String spxUniqueStreamHash10 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash10 != null && !"".equals(spxUniqueStreamHash10)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash10,pxUniqueStreamHash+"_10");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_10");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
	ctrlComponent.beginComponent("pxIcon",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pyGFWToolbarDraftMode_"+ referenceString+ "_2'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Turn Draft Mode OFF\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
			if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "pyIsReadOnly", null, false)){
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2014093013532209447249") + "  ");
		tools.appendString("onclick_func='pd(event);' href='' ");
		tools.appendString(" data-ctl='Icon' "); tools.appendString(" IsSprite='true' href_original='' class='cursordefault' disabled='disabled' style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmBy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");
		}
		else{
		
		tools.appendString("webwb/pzmxgeditor_draft_1200226081.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-84px -52px; width:84px; height:26px;' ");
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-84px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-84px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
			StringBuffer ractURLStr = new StringBuffer();
			StringBuffer ractParamStr = new StringBuffer();
			ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzHandleModelerDraftModeToolbarClick");
			tools.appendString("[\"runActivity\", [\"\", \"");
			ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
			tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
			if(!"".equals(ractParamStr.toString())) {
				ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
				}
				tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
				}
				tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }					{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
						com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
							StringBuffer staticURLStr = new StringBuffer();
							StringBuffer preActParamStr = new StringBuffer();
							StringBuffer preDTParamStr = new StringBuffer();
							refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
							refreshActionRequest.registerFixedParameter("StreamList", "RuleFormLayout|Rule-HTML-Section|:");
							staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
							tools.appendString("[\"refresh\", [\"otherSection\",\"RuleFormLayout\", \"\", \"");
							refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
							tools.appendString("=\", \"\", \",");
							refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
							tools.appendString("\",\":event\",\"1\",[\"");
							if(!"".equals(preActParamStr.toString())) {
								staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
								}
								if(!"".equals(preDTParamStr.toString())) {
									staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
									}
									tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
									pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }									tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
				tools.appendString(" disabled ");
			} else {
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2014093013532209447249") + "  ");
		tools.appendString("onclick='pd(event);' href='' ");
		tools.appendString("tabindex='0' ");
		tools.appendString("IsSprite='true' data-ctl='Icon' "); tools.appendString("style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmBy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");
		}
		else{
		
		tools.appendString("webwb/pzmxgeditor_draft_1200226081.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-84px top; width:84px; height:26px;' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }									tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-84px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }									tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-84px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }									{
										StringBuffer ractURLStr = new StringBuffer();
										StringBuffer ractParamStr = new StringBuffer();
										ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzHandleModelerDraftModeToolbarClick");
										tools.appendString("[\"runActivity\", [\"\", \"");
										ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
										tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
										if(!"".equals(ractParamStr.toString())) {
											ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
											}
											tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
											}
											tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }												{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
													com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
														StringBuffer staticURLStr = new StringBuffer();
														StringBuffer preActParamStr = new StringBuffer();
														StringBuffer preDTParamStr = new StringBuffer();
														refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
														refreshActionRequest.registerFixedParameter("StreamList", "RuleFormLayout|Rule-HTML-Section|:");
														staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
														tools.appendString("[\"refresh\", [\"otherSection\",\"RuleFormLayout\", \"\", \"");
														refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
														tools.appendString("=\", \"\", \",");
														refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
														tools.appendString("\",\":event\",\"1\",[\"");
														if(!"".equals(preActParamStr.toString())) {
															staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
															}
															if(!"".equals(preDTParamStr.toString())) {
																staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
																}
																tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
																pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }																tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
			}
			tools.appendString(" ></a>");
		}																}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }																tools.putParamValue("doAutoFormatting", "false");
																tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}																} catch (Exception e) {

																
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'																&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }																	}


}

public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"changeStyle\",[\":event\",\"background-position:0px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzHandleModelerDraftModeToolbarClick");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }				{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
					com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
						StringBuffer staticURLStr = new StringBuffer();
						StringBuffer preActParamStr = new StringBuffer();
						StringBuffer preDTParamStr = new StringBuffer();
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("StreamList", "RuleFormLayout|Rule-HTML-Section|:");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						tools.appendString("[\"refresh\", [\"otherSection\",\"RuleFormLayout\", \"\", \"");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("=\", \"\", \",");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("\",\":event\",\"1\",[\"");
						if(!"".equals(preActParamStr.toString())) {
							staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
							}
							if(!"".equals(preDTParamStr.toString())) {
								staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
								}
								tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
								pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }								tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");								String returnString = actionsStringBuilder.toString();
								tools.popStreamBody();
								return returnString;
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


public void pxIcon_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span ");tools.appendString(">");
	 }if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
	java.util.List<String> ctPropRefs = new ArrayList<String>();
	IUIComponent ctrlComponent = pzAuto.getUIComponent();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.put("generateName","true");
	cellPage.put("pyStreamName","pyGFWToolbarDraftMode");
	cellPage.put("pyCellID","1");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
	String repeatIndx = "";
	boolean disable = false;
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen("pyIsReadOnly",pxUniqueStreamHash+"_4");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyDisabledWhenId",pxUniqueStreamHash+"_4");
	pxWhenIdentifiers.put("pyDisabledWhenName","pyIsReadOnly");
	pxWhenIdentifiers.put("pyDisabledWhenClass",((String)pega.getStreamProperties().get("pyClassName")));
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Turn Draft Mode ON\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Turn Draft Mode ON", ".pyActionPrompt");
	}
	pyTooltip = "Turn Draft Mode ON";
	modePage1.put("tooltip",pyTooltip);
	modePage1.put("helpertype","tooltip");
	modePage1.put("isActionabale","true");
	modePage1.put("isClickable","true");
	String pyFormatValue = "";
	StringMap whenHc=new HashStringMap();
	whenHc.putString("pyBlockName", "pyIsHybridClient");
	modePage1.put("pyIsSprite","true");
	String style="";
	String spriteUrl = "";
	if(tools.evaluateWhen(whenHc) || pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	spriteUrl = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmBy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";
	}
	else{
	spriteUrl = "webwb/pzmxgeditor_draft_1200226081.png!!.png";
	}
	modePage1.put("src",spriteUrl);
	modePage1.put("leftOffset","0");
	modePage1.put("pyIconWidth","84");
	modePage1.put("pyIconHeight","26");
	if(disable){
	modePage1.put("pyDisabled",disable+"");
	}
	modePage1.put("iconSrc","image");
	modePage1.put("pyFormatTypeActionable","");
	modePage1.put("pyFormatValue",pyFormatValue);
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("2014093013532209393337") + " ");
	String spxUniqueStreamHash5 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash5 != null && !"".equals(spxUniqueStreamHash5)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash5,pxUniqueStreamHash+"_5");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_5");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
	ctrlComponent.beginComponent("pxIcon",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pyGFWToolbarDraftMode_"+ referenceString+ "_1'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Turn Draft Mode ON\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
			if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "pyIsReadOnly", null, false)){
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2014093013532209393337") + "  ");
		tools.appendString("onclick_func='pd(event);' href='' ");
		tools.appendString(" data-ctl='Icon' "); tools.appendString(" IsSprite='true' href_original='' class='cursordefault' disabled='disabled' style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmByvQAI/Pu0Ir37YcOZmpZmRukCZ5svdKBhJy9YoHauXRsITlef16+78IngFf+xdKmBBDj5yz5QUR+Q/cvxvJy7QwP2748/dsHzw4n8RX+fU1io/rl6tfl+ZGmpCUciegh9H5RFmRiNwBwqoACRr7sipKqqSn399ddq//79Eee0traqx48fx9VgAIp34+MFVGJUgBLvh3cUbxi0C8czNjQ0mPoo/+bNm6Y8v3EkW6YtW6YKdAyPHNyyRe3QwOzV3tIrLU1N6vHDh/HpUwOKx+LjBVRiVIDqr8cPwDTOCa/YDyKAhqfFM1Mf5fOhPK9xSHjAeUHriQnQgQMHut14e3u7Ouc8KHHmQ0eBp06distzulbWBSCAKSAu0w0KSECFR4tHBGjvQEeMICjsicjA3Fw1TXsuo09t0L9VVprty0ePqofNzWb75J49cXlOr9fqpE/tQKRb/tu2bWr87NkGKLr3uPTpgAacfiPwGgYGkdRppvHjx6t+zjRHk7Zq2Z6grYe4FDl9+nRCjQYgwCJQesMI8XB08cCZkZHRCTSvJ44mUrbXGIY5gxBvvcmWovJy1c/R2w1t1P14npQUVaTje+JSY/DffZdQHQACLF44ZFs8HF08cApMXtC8njiqPh3gvcaAR00UysCDJBksNOrAmlhsgY6N8vLyVJqOo+R4SwI3JIOQaNNCUjYwAbLEwYAaZNqHQRdGwPXUR1lMRwE+5QisyZZR06ebvw3a2A7ogcfCjRtVvu7u09LT3eP3btyIP3zQ8STQRPOMAh0wAafEhGx3B6Rf6LIxAq6nPq6nTMAPUk5CgEojCpzEgIU6KBbBo8YzgMArfvDBB67XA85oU0yAxaCHa/iwDWAARQzp95JyLmEBsatXuNfXX3/dfCeDqUM9OIXSPzNT5RUVuXDO1wOLEZ5R/A09IDzgm9eMRfCKf//mGxdARsrRppgAi7iQa/iwDWDAJV201+vKuYQFxK5eYcTOlBbfSbwZ5nyp/B406gQbc5vSsF44nzx5YrpbPk+fPlVW/icrV65M+XLJkqj6XPzJJ0orrBOcT3QsX6MBq9EG9VTH+VZi9KB4N+YbgXPIkCFmYIRHO3/+vHrw4IHVYEBpbmgw843AOVR7eSbgrx4/bgZKD+7csQoKCuiPP/6oZuvRHkJ32ZODiedRqrZuVXM+/JCJZdNdPrp/3yol0UESkFoJF1IrIU4zWbFiAbVixQJqxQJqxUoSAK21qghFaq0+Q9anzSxipTeLmWaqtpkwQrP4VysqSq0+w9OnzSwSrtjMIiHr0w6SrNhRvBUrfzigeYsWqQkbNqiUPp4Jw+qzFwKKMl9ctUrlzpypJqxfbyG1+uw9gKYOGKAKPZkwBpeVWUitPkMT84PlI0uXdsRr6f3z8tTNH35QkzdvVumeVybu/PKLOtdFJozMCRNUse8X4+0tLerKjh3qZpyZMMasWaOGO5kwLjm/5s7S9VwK+MvutOxsNX7dOpXjvAJxmve9ly9390+uXq3anvEqw6sVFSnV3fxguS/pMwyJyyz75+er/MWLVYEnE0b9pk0RSm1+RiaM24cOqfPOC/5AMEbexw6oVKBCmffPnTNASYPdjuM1jpzSUgNj4+7d6qpu4CGzZkXsJ0ueV332OKD9cnKMhxnky4RR6GTCQKmTtFIbd+5UTQFemaXx87RS+KBQFEyZzTU1BhC+b2tsVKNWrFAZzhuEAk2JY9UocroHIuBCsad9yQb8XlIaluvHOwkHqJt9OYf9jMJCF4DQlP8c61MMhXq5B67nXLYvJSOzSEpamhlVijKf+N6m5EaGL1igTq1dG0iZInSdGb53ubFiHX6oJpSslcnDsY8SqA+l1DqegnOPa4WccTJhcM7pLjJhTNLfAxvdNd/jNQGT60WxNNZZfZ53P2w4n3d9RvQQ+j4oizLxzjnJyCxSuGyZynYyYVzYskXV6Af8zZcJ41FTk3oaZyYMFIqFpXle+L/vvGFITIUC0rKyzMMPcTJhpAXMhIFi8Az3tCehPspv1R/Ky+gi0UEypS/pU8KDZiezSFrYmUXSc3NVoZMJo+PxY3XLyYRx9+hR9cTJhHF9z564LF2kK0DancQAKPnlbdvUkNmzjRIa48yEIYrxDnSk0bwNmWzpa/psT3ZmkaHl5Wb6A2mpq1OpTiaMoXPnmjgKuZFgJgweiIfzPswTZ1sski4JZfZzHr6rEXV3o2xpIG/jZTqZMNpDyoRh9RmuPmMaJOU4mTDu1daq8zpQLtq40XRPKU4mDI4/SiAThhmE6Ie8FMWSHzlK4uFR/CAnhkGxbQEyWNDF0GhcT32UxfQJDUU5otxkS1/RZ48AmpaZqTKLilxl+kedrfX15nhQwYpnOJkweBhGdtGmRFAEcQzX8GEbhaDgVl8mDCxXzqUbO+nLhMFg50U9EHjZyYTBuT05v2f1GfJE/SQnE4ZfmQTvjVohjbt2qQ6bCSPmiXqrz5A9aFtDg5kfQ5kDx441E8bNx4+bwP6xzYQRfHRt9RkuoJe2blVjnEwYuPd2mwkjIbH6TMIg6ZLNhBE6pFZCnGayYsUCasWKBdSKBdSKlSQAajNhhCM2s0jY+rSZRaz0ZjH/SaqqqrKZMEKy+PLy8tLKykqrz5D0aTOLhCs2s0jI+rSDJCt2FG/Fyh8OKAvJsoqbHXSFI6yGN3XqVJWSkmIBDQPOO3fumIVlb926ZSENAc6ioiKzkl5fhzRhQIHRu16mhTQxYf3T0aNHu/tDhw7t05AmlE8Fz8ny3KzlyZqZ7c4PbQXSrhZnZT35G77XGVJTU1VOTo7KCvhWoQjeu9V5PyY3N9etR7ZjFZZ05L5lleX8/Hx19+5dd7+goMBd6TlZnpMFcllesrS01F0iHEiLi4vVr7/+2uma7Oxs9corr0QcY5nKCxcumPVV45GJEye6S16ePXvW/GVtVNnu9YACIisQe1c49kMqy3RHE9agR/FIc3OzgQwJCilQAWd6eroBSgyA8oMKIPKhMTAYlnr07idL0BUrSo8aNcrs4y1PnDgRAent27e7LQPdy5Lo48aNM5AhQSHFAIGTtj127JhrAP5Fe3sloH4PIyJdvEBKgwYBjcYHMj5cB7CUiTehLr5HcRzHO4hFc/y683IWYDY0NLhlAhegAm13zyCGwvUcl+dhyUc5h33qFYMKSzCqKVOmdPL0L7zwgvkLpCxVfvny5Yhne5bgPYEMjwygAEuZOAHq4nt6OY6LI7ly5Yo5XlZW5npmVoX2OiBABVo/0Hh3eQa/oVAv98D1nMt2EE8ccwxKTMkoXRqNbtkP6f379003GE9XTezV7nsXB++BVxFoMzMzzT5QUR/3UuC88kpj0yAoQsDzwykKpB6u43vKAEyuFwCBn3K8+2HDiZcktvSGJH5IuUcW8g0Cp3cs4O/F8IpVVVUutJTLPjqhPu7l8OHD7rk//fSTCTdEb344EQyIeriO7ykDYP09BGVRJoYTJPSKGVAKl4VkWfUYGPwxJpDFG8xjXXg379Le6c5ruBgDjYWRAJOsshx0GXBgBAQ8M/VRPh/KE8/cU8JASMKG+vp69fPPP6uTJ092ut/2OF+gA1Ce0RszS0/HswIUzw5MYtRB42tAw9PKDI6EfZTnNY6mpiZ3rBC0npgABQR5OADEk4lliCflRuMd5IjSOt2cUzb105UDEkrFo8UjAjSG5PXS0kP0lFCndOPckwwaiTPFk7LseTye0+u1oukYQOjKAYl2pXuP16lIOOV1ZH4IEzH+mACl65YGRLmyzXFp9OwEU8dQJvB5QwfZFg+HYQCn1NmVJXrhiwa81ytJr9CT0zh5eXnufRK6yDYhh/Qa165dS2xwoXUDLF44ZFs8HAYAnKLHh13kgXrYTW4oKc87IBUOwuqRYvK1EnfSNRKLEYvSsAIqx7sD41kig5BosYkoEO8CnHI/bAepl/sEAK6nPu6fMvH81OGPA5MlhEjS5dXV1ZlYlO5eDEi6zHgF7wyA0QYjUjbGznOL3oN28dwnRsD11Mf1AEqMm8j9BwIUCIBR4PSP4vGo8Qwg8Ip0Y6IYHjJaiEDdWCnX8GEbwLgv8TheLynnEhYU+JJoca8oVkb/nBt0vjRRzyZxG3D6R/F4VI4HFbzinDlzXACBM9oUE3Uz6OEamXkBMO6rxZdTCT3LuYQFMogSYcTOlJaM/jk3zPlS+T1oR3fza9KwXjjpErFAHqqv/7/YK+Xl5SmVlZVR9cncJjr3w0nYQXfLlJL9L1wAD0oXOnjwYAMnXSCWhkcjHvRPNVmJree4ePGigZMeg4ERH0a6Eg9bCQAo8ZL8F4Pu0kKZmND90SXS61RXV/f49NZzB6g3qLcSHqRWQpxmsmLFAmrFigXUigXUipUkAGozYYQjNrNIyPpMsZPCVnqz/FeAAQAgtAUk0dJazQAAAABJRU5ErkJggg==");
		}
		else{
		
		tools.appendString("webwb/pzmxgeditor_draft_1200226081.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:0px -52px; width:84px; height:26px;' ");
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:0px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:0px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{
			StringBuffer ractURLStr = new StringBuffer();
			StringBuffer ractParamStr = new StringBuffer();
			ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzHandleModelerDraftModeToolbarClick");
			tools.appendString("[\"runActivity\", [\"\", \"");
			ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
			tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
			if(!"".equals(ractParamStr.toString())) {
				ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
				}
				tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
				}
				tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }					{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
						com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
							StringBuffer staticURLStr = new StringBuffer();
							StringBuffer preActParamStr = new StringBuffer();
							StringBuffer preDTParamStr = new StringBuffer();
							refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
							refreshActionRequest.registerFixedParameter("StreamList", "RuleFormLayout|Rule-HTML-Section|:");
							staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
							tools.appendString("[\"refresh\", [\"otherSection\",\"RuleFormLayout\", \"\", \"");
							refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
							tools.appendString("=\", \"\", \",");
							refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
							tools.appendString("\",\":event\",\"1\",[\"");
							if(!"".equals(preActParamStr.toString())) {
								staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
								}
								if(!"".equals(preDTParamStr.toString())) {
									staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
									}
									tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
									pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }									tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
				tools.appendString(" disabled ");
			} else {
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("2014093013532209393337") + "  ");
		tools.appendString("onclick='pd(event);' href='' ");
		tools.appendString("tabindex='0' ");
		tools.appendString("IsSprite='true' data-ctl='Icon' "); tools.appendString("style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKgAAABPCAYAAAB/Co6OAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDowNzgwMTE3NDA3MjA2ODExODIyQTkzMUNGNDE2RTg4OSIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDo3QzFCM0I5QjlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDo3QzFCM0I5QTlGMUQxMUUyQjU0NkFFM0YwNDM3N0ZEOSIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6QjA4NEFENDAyMTIwNjgxMTgwODNCMzkzNTkwNDhBQTQiIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6MDc4MDExNzQwNzIwNjgxMTgyMkE5MzFDRjQxNkU4ODkiLz4gPC9yZGY6RGVzY3JpcHRpb24+IDwvcmRmOlJERj4gPC94OnhtcG1ldGE+IDw/eHBhY2tldCBlbmQ9InIiPz44saJhAAAQLUlEQVR42uyda2gV1xaAdxJjNIkxPvJQa33FR2wTLTbS6jW26q1epEVruRcKSoULKvWnFRSEgv1RaH/4Ryr0/hCElntRGyzlVq0gya0tNT5itCZaX/hINNZHTNSoMXd/+86aO2eSE8+cMycNZi84ZGbOzN4za39r7bV3zqyd0tHRoaxY6a2SAqDbt28/obdLrDoSltqVK1eWfrlkidVnSPpMdTasMsOREqvPcPWZanVgpTeLBdRK3wB0ypQpav78+So11TIfhhQvWqT+vGGDSu3XzwIaBpyvvfaaGj16tHrzzTctpCHAOXvVKjVm5ky1YP36Pg1pwiSlp6erkpL/jwkspAnqc8AANf2999z9F8vK+jSkCT01njMrK0vt3btXLdJWn5mZGQHpgQMHOl0zbNgw9fbbb0cce/TokaqurlZnzpyJ6z5mzZqlJk2aZLYPHTpk/g4fPtzdjlX69++v3njjDTVy5Eiz/+2336oZM2a4+7t27VL37t1LqufMzstT323apBZv3qyytK4E0vkffaT2f/qpUr556+ETJqgln38ecaytpUUd3rFD1e3bF9d9/GnNGjXlrbfM9n+++MKtR7Z7PaDZ2dmquLhYvfTSS+6x77//PgLSq1evdlvGxYsX1cGDB802EAAZEhRSoALO33//3QAlBkD5QQUQ+dTW1qojR46osWPHRuwnSwbl56upixerknfecY/5Ib1y7FgnOL1yQRvjgc8+M9tly5cbyJCgkGbotgXOm+fOqYp161wDuBDQ2P8QQAfo7mfu3LlqxIgREceliwfShQsXmgatq6uLuVwaf/LkyeYDoABLmdeuXTOA8D2ei+ODBg0y1wg07zndIWC+//77bpnABahA252XFEPheo7L87Av57BPvWJQYcmAnBw1T0MwsiRy2nTau+9GQHp85051Wus2VsF7AhkfAAVYyrxaU6NGTZtmvm9ubFQzV6xQgwoKzDU1u3eb43/1eMzlel9knHYggAq0fqB5BsrtylCol3vges5lO4gnjjlQJKacN2+eC2dbW1snSCdOnKgqKioCwSkCgAKfCF5x+/btqr6+3sAJvOwDFfUB0E7deHLuV199ZcINAc8PJ4IBUQ/dNd9TBmBy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");
		}
		else{
		
		tools.appendString("webwb/pzmxgeditor_draft_1200226081.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:0px top; width:84px; height:26px;' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }									tools.appendString("[\"changeStyle\",[\":event\",\"background-position:0px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }									tools.appendString("[\"changeStyle\",[\":event\",\"background-position:0px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }									{
										StringBuffer ractURLStr = new StringBuffer();
										StringBuffer ractParamStr = new StringBuffer();
										ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzHandleModelerDraftModeToolbarClick");
										tools.appendString("[\"runActivity\", [\"\", \"");
										ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
										tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
										if(!"".equals(ractParamStr.toString())) {
											ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
											}
											tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
											}
											tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }												{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
													com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
														StringBuffer staticURLStr = new StringBuffer();
														StringBuffer preActParamStr = new StringBuffer();
														StringBuffer preDTParamStr = new StringBuffer();
														refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
														refreshActionRequest.registerFixedParameter("StreamList", "RuleFormLayout|Rule-HTML-Section|:");
														staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
														tools.appendString("[\"refresh\", [\"otherSection\",\"RuleFormLayout\", \"\", \"");
														refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
														tools.appendString("=\", \"\", \",");
														refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
														tools.appendString("\",\":event\",\"1\",[\"");
														if(!"".equals(preActParamStr.toString())) {
															staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
															}
															if(!"".equals(preDTParamStr.toString())) {
																staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
																}
																tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
																pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }																tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"setDirty\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
			}
			tools.appendString(" ></a>");
		}																}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }																tools.putParamValue("doAutoFormatting", "false");
																tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}																} catch (Exception e) {

																
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'																&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }																	}


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
	if(!pzAuto.handleEvaluateWhen(" wxpzDraftModeOff","pzDraftModeOff","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxIcon_1();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014093013532209393337-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxIcon");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzDraftModeOff",pxUniqueStreamHash+"_7");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_7");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzDraftModeOff");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-Obj-Flow");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_7");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpzDraftModeOff", pxUniqueStreamHash+"_7"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxIcon_1();}
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
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxpzDraftModeOn","pzDraftModeOn","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-all-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxIcon_2();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("partialClass","remove-all-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2014093013532209447249-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxIcon");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzDraftModeOn",pxUniqueStreamHash+"_12");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_12");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzDraftModeOn");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-Obj-Flow");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_12");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpzDraftModeOn", pxUniqueStreamHash+"_12"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxIcon_2();}
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
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpyGFWToolbarDraftModeB","",false);
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
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201807101523280374247") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-inline_middle content-inline_middle  clearfix" + "'  ");
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
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
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
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_2(index);
	}else{
		index=simpleLayoutTemplateCell_2(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
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
	String paramName = "EXPANDEDSubSectionpyGFWToolbarDraftModeB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o1! wxpzIsInOutlineView", pxUniqueStreamHash+"_13");metadataPage.put("lMode","Inline-block");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_13");
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
if(pzAuto.handleEvaluateWhen(" o1! wxpzIsInOutlineView","!pzIsInOutlineView", "layout", "visible" )) {pzSetExpandParam_1();
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


private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Rule-Obj-Flow");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-OBJ-FLOW PYGFWTOOLBARDRAFTMODE #20180713T140924.966 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pyGFWToolbarDraftMode");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-OBJ-FLOW PYGFWTOOLBARDRAFTMODE #20180713T140924.966 GMT", "Rule-Obj-Flow pyGFWToolbarDraftMode", "Pega-ProcessArchitect", "08-01-01", "20180713T140924.966 GMT");
}
