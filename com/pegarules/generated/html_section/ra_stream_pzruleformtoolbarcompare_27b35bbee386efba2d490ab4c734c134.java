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
import com.pega.pegarules.priv.context.PegaThread;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.AssemblyParameters;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.runtime.ComplexParameterPage;
import com.pega.pegarules.priv.runtime.IActionRequest;
import com.pega.pegarules.priv.runtime.IActionRequestRegistrar;
import com.pega.pegarules.priv.runtime.IAutoStreamRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.runtime.jsp.JSPTagHandlerPool;
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
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream @BASECLASS!PZRULEFORMTOOLBARCOMPARE.
 */
public class ra_stream_pzruleformtoolbarcompare_27b35bbee386efba2d490ab4c734c134 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzRuleFormToolbarCompare.Rule_Obj_Model.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1572346480;
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
	public ra_stream_pzruleformtoolbarcompare_27b35bbee386efba2d490ab4c734c134(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "5366a543e5c61e8b2ac832af3718955e4b1c580a";
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
/* Instance RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARCOMPARE #20190222T152109.093 GMT	Pega-Desktop:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "5366a543e5c61e8b2ac832af3718955e4b1c580a";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzRuleFormToolbarCompare",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARCOMPARE #20190222T152109.093 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARCOMPARE #20190222T152109.093 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARCOMPARE #20190222T152109.093 GMT */
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
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Section:PZRULEFORMTOOLBARCOMPARE", 
	"Rule-Obj-Property:PYTOOLBARSAVELABEL", 
	"Rule-Obj-Property:PYTEMPLATEINPUTBOX", 
	"Rule-HTML-Property:PZTHROBBER", 
	"Rule-HTML-Property:PXBUTTON", 
	"Rule-HTML-Property:PXHIDDEN"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZRULEFORMTOOLBARCOMPARE","Rule-HTML-Section","@BASECLASS",false,"","Pega-Desktop","08-03-01","RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARCOMPARE #20190222T152109.093 GMT","!PZRULEFORMTOOLBARCOMPARE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1572346480), 
		new DependentRuleInfo("PYTOOLBARSAVELABEL","Rule-Obj-Property","@BASECLASS",true,"@baseclass","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYTOOLBARSAVELABEL #20180713T135013.376 GMT","!PYTOOLBARSAVELABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYTEMPLATEINPUTBOX","Rule-Obj-Property","@BASECLASS",false,"","Pega-UIDesign","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEINPUTBOX #20180713T133539.879 GMT","!PYTEMPLATEINPUTBOX",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PZTHROBBER","Rule-HTML-Property","",false,"","Pega-Gadgets","08-06-01","RULE-HTML-PROPERTY PZTHROBBER #20200818T070729.511 GMT","PZTHROBBER",true,false,"ABSOLUTE_CLASSLESS",-674577450), 
		new DependentRuleInfo("PXBUTTON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT","PXBUTTON",true,false,"ABSOLUTE_CLASSLESS",1928622883), 
		new DependentRuleInfo("PXHIDDEN","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT","PXHIDDEN",true,false,"ABSOLUTE_CLASSLESS",1000971257)
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
//	RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARCOMPARE #20190222T152109.093 GMT:20190222T152109.093 GMT
//	RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT:20180713T133435.722 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTOOLBARSAVELABEL #20180713T135013.376 GMT:20180713T135013.376 GMT
//	RULE-HTML-PROPERTY PXHIDDEN #20180713T133435.722 GMT:20180713T133435.722 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTOOLBARSAVELABEL #20180713T135013.376 GMT:20180713T135013.376 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEINPUTBOX #20180713T133539.879 GMT:20180713T133539.879 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEINPUTBOX #20180713T133539.879 GMT:20180713T133539.879 GMT
//	RULE-HTML-PROPERTY PZTHROBBER #20200818T070729.511 GMT:20200818T070729.511 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEINPUTBOX #20180713T133539.879 GMT:20180713T133539.879 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYTEMPLATEINPUTBOX #20180713T133539.879 GMT:20180713T133539.879 GMT
//	RULE-HTML-PROPERTY PZTHROBBER #20200818T070729.511 GMT:20200818T070729.511 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T133337.901 GMT:20180713T133337.901 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
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
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEHIDDEN--(CLIPBOARDPAGEE2BC591D2BB656F265183A20B6CFAC93 #20180713T133346.239 GMT:20180713T133346.239 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "31c885132252851758bef69391e77498";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
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
  pzSection.beginSection("pzRuleFormToolbarCompare",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzRuleFormToolbarCompare','insKey':'RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARCOMPARE #20190222T152109.093 GMT','sectionType':'standard'}");
sectionDefaultValues_1();
pzLayout_1();
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
config.put("pyFunctionName", "pega.desktop.rulecompare.hide");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pzActivityStaticParams", "CompareMode&CompareInsHandle");
config.put("CompareMode", "false");
config.put("CompareInsHandle", "");
config.put("pzActivity", "pzSetComparePanelProperties");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "postPRXML");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "onBeforeExecuteActionWrapper");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "launchStaleAction");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "clearQueueForStaleHandling");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "postRuleFormValues");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pzActivity", "pxLaunchComparePagesFromSave");
pega.getUIEngine().getUIAction("runActivity", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pega.desktop.rulecompare.clearFocus");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "clearDirtyFlags");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "pzGetFormBasedXML");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "clearQueueConditionally");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "pzSetSaveLabel");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyFunctionName", "setDirtyFlag");
pega.getUIEngine().getUIAction("runScript", config).register();
config = new HashMap<String, String>();
config.put("pyPreDataTransform.pyName", "pzRemoveWorkPage");
pega.getUIEngine().getUIAction("runDataTransform", config).register();
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_1() {
tools.appendString("<div class='layout layout-none set-width-auto'>");
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
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"setValue\", [[\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pyToolbarSaveLabel") + "\", \"\", \"\", \"\", \"Saving\"], [\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pyRMAction.pyAction") + "\", \"\", \"\", \"\", \"save\"]]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"postPRXML()\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"onBeforeExecuteActionWrapper(\\\"SAVE\\\",");
	String strPropReference42 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#";
	String strFormattedPropReference42 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference42);
	if(strPropReference42.equals(strFormattedPropReference42)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference42.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference42.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"launchStaleAction(this,event,");
	String strPropReference53 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#";
	String strFormattedPropReference53 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference53);
	if(strPropReference53.equals(strFormattedPropReference53)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference53.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference53.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(",");
	String strPropReference54 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxUpdateDateTime")+"~#";
	String strFormattedPropReference54 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference54);
	if(strPropReference54.equals(strFormattedPropReference54)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference54.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference54.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(",\\\"save\\\",");
	String strPropReference56 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsStaleRuleCheckEnabled")+"~#";
	String strFormattedPropReference56 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference56);
	if(strPropReference56.equals(strFormattedPropReference56)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference56.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference56.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"clearQueueForStaleHandling(");
	String strPropReference61 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsStaleRuleCheckEnabled")+"~#";
	String strFormattedPropReference61 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference61);
	if(strPropReference61.equals(strFormattedPropReference61)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference61.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference61.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"postRuleFormValues(\\\"pzRuleFormToolbarAction\\\",\\\"ToolbarAction=Save\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pxLaunchComparePagesFromSave");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"pega.desktop.rulecompare.clearFocus()\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"clearDirtyFlags(\\\"\\\",");
			String strPropReference102 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleFormStatus")+"~#";
			String strFormattedPropReference102 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference102);
			if(strPropReference102.equals(strFormattedPropReference102)) {
			tools.appendString("\\\"");
			tools.appendFormatted(strFormattedPropReference102.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			tools.appendString("\\\"");
			} else {
			tools.appendFormatted(strFormattedPropReference102.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			}
			tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"pzGetFormBasedXML(\\\"SAVE\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"clearQueueConditionally(");
			String strPropReference121 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleFormStatus")+"~#";
			String strFormattedPropReference121 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference121);
			if(strPropReference121.equals(strFormattedPropReference121)) {
			tools.appendString("\\\"");
			tools.appendFormatted(strFormattedPropReference121.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			tools.appendString("\\\"");
			} else {
			tools.appendFormatted(strFormattedPropReference121.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			}
			tools.appendString(",");
			String strPropReference122 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleFormStatusOld")+"~#";
			String strFormattedPropReference122 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference122);
			if(strPropReference122.equals(strFormattedPropReference122)) {
			tools.appendString("\\\"");
			tools.appendFormatted(strFormattedPropReference122.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			tools.appendString("\\\"");
			} else {
			tools.appendFormatted(strFormattedPropReference122.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			}
			tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }				{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
					com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
						StringBuffer staticURLStr = new StringBuffer();
						StringBuffer preActParamStr = new StringBuffer();
						StringBuffer preDTParamStr = new StringBuffer();
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("StreamList", "RuleFormMain|Rule-HTML-Section|:");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&PreDataTransform=pzSetSaveLabel");
						tools.appendString("[\"refresh\", [\"otherSection\",\"RuleFormMain\", \"\", \"");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("=\", \"\", \"pzSetSaveLabel,");
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

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }								tools.appendString("[\"runScript\", [\"setDirtyFlag(\\\"\\\",");
								String strPropReference142 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleFormStatus")+"~#";
								String strFormattedPropReference142 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference142);
								if(strPropReference142.equals(strFormattedPropReference142)) {
								tools.appendString("\\\"");
								tools.appendFormatted(strFormattedPropReference142.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
								tools.appendString("\\\"");
								} else {
								tools.appendFormatted(strFormattedPropReference142.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
								}
								tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }								{
									com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
									actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
									com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
									actionRequestD.registerFixedParameter("pyModelName","pzRemoveWorkPage");
										String usingPageString = "";
										usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
										tools.appendString("[\"runDataTransform\", [\"pzRemoveWorkPage\", \"=");
										actionRequestD.registerFixedParameter("","");
										tools.appendString("\", \"" + usingPageString);
										if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
										String contextClass;if(StringUtils.isBlank(usingPageString)){
										contextClass = tools.getStepPage().getString("pxObjClass");}else{
										 String oflineTmpUsgPg = usingPageString;
										if(oflineTmpUsgPg.contains("$CTX$")){
										oflineTmpUsgPg = oflineTmpUsgPg.replace("$CTX$",tools.getPrimaryPage().getReference());
										}if(oflineTmpUsgPg.matches("\\$PARENT(\\d)*\\$")){
										oflineTmpUsgPg = pzAuto.getUIComponentRuntime().replaceParentsKeyToken(oflineTmpUsgPg);}
										if(oflineTmpUsgPg.contains("$TOP$")){
										oflineTmpUsgPg = oflineTmpUsgPg.replace("$TOP$",tools.getStepPage().getTopLevelPage().getReference());}
										contextClass = tools.findPage(oflineTmpUsgPg, false).getString("pxObjClass");}
										pzPackageRuntime.packageDataTransform(contextClass, "pzRemoveWorkPage");
										}
											pzAuto.registerActionRequest(actionRequest);
											}
											tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pxUpdateDateTime"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsStaleRuleCheckEnabled"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyRuleFormStatus"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyRuleFormStatusOld"), -1);
		}}catch(Exception e){}											String returnString = actionsStringBuilder.toString();
											tools.popStreamBody();
											return returnString;
										}


public void pxButton_2() {boolean isDisplayTextWithParam = false;
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
	tools.putParamValue("skipHTMLEncoding", "true");
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("Save_and_compare_button") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzRuleFormToolbarCompare_$CTX$_4");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Save your changes to this record\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Save your changes to this record", ".pyActionPrompt");
	}
	pyTooltip = "Save your changes to this record";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","Strong");
	modePage2.put("imgSrc","none");
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Save changes\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Save changes", ".pyButtonLabel");
	}
	pyLabel = "Save changes";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash15 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash15 != null && !"".equals(spxUniqueStreamHash15)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash15,pxUniqueStreamHash+"_15");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_15");
	}
	modePage2.put("actionPath"," data-click='.'");
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
	ctrlComponent.beginComponent("pxButton",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzRuleFormToolbarCompare_"+ referenceString+ "_4'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("Save_and_compare_button") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"setValue\", [[\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pyToolbarSaveLabel") + "\", \"\", \"\", \"\", \"Saving\"], [\"" + pzAuto.getUIComponentRuntime().generateActionToken(".pyRMAction.pyAction") + "\", \"\", \"\", \"\", \"save\"]]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"postPRXML()\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"onBeforeExecuteActionWrapper(\\\"SAVE\\\",");
	String strPropReference42 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#";
	String strFormattedPropReference42 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference42);
	if(strPropReference42.equals(strFormattedPropReference42)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference42.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference42.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"launchStaleAction(this,event,");
	String strPropReference53 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pzInsKey")+"~#";
	String strFormattedPropReference53 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference53);
	if(strPropReference53.equals(strFormattedPropReference53)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference53.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference53.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(",");
	String strPropReference54 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pxUpdateDateTime")+"~#";
	String strFormattedPropReference54 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference54);
	if(strPropReference54.equals(strFormattedPropReference54)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference54.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference54.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(",\\\"save\\\",");
	String strPropReference56 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsStaleRuleCheckEnabled")+"~#";
	String strFormattedPropReference56 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference56);
	if(strPropReference56.equals(strFormattedPropReference56)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference56.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference56.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"clearQueueForStaleHandling(");
	String strPropReference61 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyIsStaleRuleCheckEnabled")+"~#";
	String strFormattedPropReference61 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference61);
	if(strPropReference61.equals(strFormattedPropReference61)) {
	tools.appendString("\\\"");
	tools.appendFormatted(strFormattedPropReference61.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	tools.appendString("\\\"");
	} else {
	tools.appendFormatted(strFormattedPropReference61.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
	}
	tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"postRuleFormValues(\\\"pzRuleFormToolbarAction\\\",\\\"ToolbarAction=Save\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pxLaunchComparePagesFromSave");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"pega.desktop.rulecompare.clearFocus()\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"clearDirtyFlags(\\\"\\\",");
			String strPropReference102 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleFormStatus")+"~#";
			String strFormattedPropReference102 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference102);
			if(strPropReference102.equals(strFormattedPropReference102)) {
			tools.appendString("\\\"");
			tools.appendFormatted(strFormattedPropReference102.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			tools.appendString("\\\"");
			} else {
			tools.appendFormatted(strFormattedPropReference102.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			}
			tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"pzGetFormBasedXML(\\\"SAVE\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }			tools.appendString("[\"runScript\", [\"clearQueueConditionally(");
			String strPropReference121 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleFormStatus")+"~#";
			String strFormattedPropReference121 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference121);
			if(strPropReference121.equals(strFormattedPropReference121)) {
			tools.appendString("\\\"");
			tools.appendFormatted(strFormattedPropReference121.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			tools.appendString("\\\"");
			} else {
			tools.appendFormatted(strFormattedPropReference121.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			}
			tools.appendString(",");
			String strPropReference122 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleFormStatusOld")+"~#";
			String strFormattedPropReference122 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference122);
			if(strPropReference122.equals(strFormattedPropReference122)) {
			tools.appendString("\\\"");
			tools.appendFormatted(strFormattedPropReference122.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			tools.appendString("\\\"");
			} else {
			tools.appendFormatted(strFormattedPropReference122.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
			}
			tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }				{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
					com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
						StringBuffer staticURLStr = new StringBuffer();
						StringBuffer preActParamStr = new StringBuffer();
						StringBuffer preDTParamStr = new StringBuffer();
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("StreamList", "RuleFormMain|Rule-HTML-Section|:");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&PreDataTransform=pzSetSaveLabel");
						tools.appendString("[\"refresh\", [\"otherSection\",\"RuleFormMain\", \"\", \"");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("=\", \"\", \"pzSetSaveLabel,");
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

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }								tools.appendString("[\"runScript\", [\"setDirtyFlag(\\\"\\\",");
								String strPropReference142 = "#~"+pzAuto.getUIComponentRuntime().generateActionToken(".pyRuleFormStatus")+"~#";
								String strFormattedPropReference142 = pega_uiengine_pzcontrol.pzScriptTagFormatting(strPropReference142);
								if(strPropReference142.equals(strFormattedPropReference142)) {
								tools.appendString("\\\"");
								tools.appendFormatted(strFormattedPropReference142.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
								tools.appendString("\\\"");
								} else {
								tools.appendFormatted(strFormattedPropReference142.replaceAll("\"","").replaceAll("\'", ""), StreamBuilder.FMT_NORMAL);
								}
								tools.appendString(")\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }								{
									com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
									actionRequest.registerFixedParameter("pyActivity", "pzRunActionWrapper");
									com.pega.pegarules.priv.runtime.IActionRequest actionRequestD = actionRequest.createDispatchedActionRequest();
									actionRequestD.registerFixedParameter("pyModelName","pzRemoveWorkPage");
										String usingPageString = "";
										usingPageString = pzAuto.getUIComponentRuntime().generateActionTokenForPage();
										tools.appendString("[\"runDataTransform\", [\"pzRemoveWorkPage\", \"=");
										actionRequestD.registerFixedParameter("","");
										tools.appendString("\", \"" + usingPageString);
										if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
										String contextClass;if(StringUtils.isBlank(usingPageString)){
										contextClass = tools.getStepPage().getString("pxObjClass");}else{
										 String oflineTmpUsgPg = usingPageString;
										if(oflineTmpUsgPg.contains("$CTX$")){
										oflineTmpUsgPg = oflineTmpUsgPg.replace("$CTX$",tools.getPrimaryPage().getReference());
										}if(oflineTmpUsgPg.matches("\\$PARENT(\\d)*\\$")){
										oflineTmpUsgPg = pzAuto.getUIComponentRuntime().replaceParentsKeyToken(oflineTmpUsgPg);}
										if(oflineTmpUsgPg.contains("$TOP$")){
										oflineTmpUsgPg = oflineTmpUsgPg.replace("$TOP$",tools.getStepPage().getTopLevelPage().getReference());}
										contextClass = tools.findPage(oflineTmpUsgPg, false).getString("pxObjClass");}
										pzPackageRuntime.packageDataTransform(contextClass, "pzRemoveWorkPage");
										}
											pzAuto.registerActionRequest(actionRequest);
											}
											tools.appendString("\",\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_controlAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
			ct_controlAction.trackValueChanges(tools.getProperty(".pzInsKey"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pxUpdateDateTime"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyIsStaleRuleCheckEnabled"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyRuleFormStatus"), -1);
			ct_controlAction.trackValueChanges(tools.getProperty(".pyRuleFormStatusOld"), -1);
		}}catch(Exception e){}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Save your changes to this record\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='Strong pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Save changes".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Save changes",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");										}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }										tools.putParamValue("doAutoFormatting", "false");
										tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}										} catch (Exception e) {

										
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'										&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", ".pyTemplateInputBox");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }											}


}

public void checkForScriptTags_1(String ScriptTags) {
	String isEncodingAllowed = tools.getSystemSettings().getDynamic("Pega-UIEngine","isLinkLabelEncodingAllowed");
	if("false".equals(isEncodingAllowed)){
		tools.appendString(StringUtils.crossScriptingFilter(ScriptTags));
	}
	else{if(ScriptTags.toLowerCase().contains("<script>") || ScriptTags.toLowerCase().contains("<<include") || ScriptTags.toLowerCase().contains("<%")){
		tools.appendString(StringUtils.crossScriptingFilter(ScriptTags));} else {
		tools.appendString(StringUtils.filterRichText(ScriptTags));}
	}
}
public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.desktop.rulecompare.hide()\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetComparePanelProperties");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"CompareMode\":\"false\"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"CompareInsHandle\":\"\"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}			String returnString = actionsStringBuilder.toString();
			tools.popStreamBody();
			return returnString;
		}


public void generateClientWhenDiv_3() {
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


public void pxButton_1() {boolean isDisplayTextWithParam = false;
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
	tools.putParamValue("skipHTMLEncoding", "true");
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("Exit_Compare_Button") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzRuleFormToolbarCompare_$CTX$_3");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","");
	modePage2.put("imgSrc","none");
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Exit compare\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Exit compare", ".pyButtonLabel");
	}
	pyLabel = "Exit compare";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash11 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash11 != null && !"".equals(spxUniqueStreamHash11)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash11,pxUniqueStreamHash+"_11");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_11");
	}
	modePage2.put("actionPath"," data-click='.'");
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
	ctrlComponent.beginComponent("pxButton",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzRuleFormToolbarCompare_"+ referenceString+ "_3'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("Exit_Compare_Button") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"pega.desktop.rulecompare.hide()\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringBuffer ractURLStr = new StringBuffer();
		StringBuffer ractParamStr = new StringBuffer();
		ractURLStr.append("pyActivity=pzRunActionWrapper&pzActivity=pzSetComparePanelProperties");
		tools.appendString("[\"runActivity\", [\"\", \"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"CompareMode\":\"false\"");
		ractParamStr.append((!"".equals(ractParamStr.toString())?",":"") + "\"CompareInsHandle\":\"\"");
		ractParamStr.append(!"".equals(ractParamStr.toString())? ",pyReturnsResponse:false": "pyReturnsResponse:false");
		tools.appendString("\", \"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\", \":event\", \"\", \"\", \"\", \"");
		if(!"".equals(ractParamStr.toString())) {
			ractURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + ractParamStr.toString() + "}"));
			}
			tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", ractURLStr.toString())));
			}
			tools.appendString("\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Exit compare".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Exit compare",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");		}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }		tools.putParamValue("doAutoFormatting", "false");
		tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}		} catch (Exception e) {

		
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'		&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }			}


}



public void field_pzThrobber_2() { 
try {
final ParameterPage params_2 = new ParameterPage();
params_2.putString("sizeClass", "horizontal");
params_2.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_2.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_2 = tools.getProperty(".pyTemplateInputBox");
	if (currentProperty_2 != null && currentProperty_2.getParentPage().getClassName().equals("Rule-Obj-Model")) {
		final ClipboardProperty propPrevActive_2 = tools.putActive(currentProperty_2);
		final boolean prevInputMode_2 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput((tools.hasInputEnabled()  || tools.hasEditableEnabled()) && !currentProperty_2.hasAttrProtected());
		final PRStackFrame stack_2 = ((PegaAPI) tools).pushStackFrame( params_2, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzThrobber" );
		try {
			final String currentPropertyRef_2 = currentProperty_2.getReference();
			if (((PegaStreamAPI) tools).isResearchMode()) {
				pega.researchPropertyReference("input", currentPropertyRef_2);
			} else {
				((PegaThread) tools.getThread()).noteInputProperty(currentPropertyRef_2);
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Model_pzThrobber();
			}
		} finally {
			pega.popStackFrame(stack_2, false);
			tools.putActive(propPrevActive_2);
		}
	} else {
if (_jspx_meth_pega_reference__1(pageContext, ".pyTemplateInputBox", "input", "pzThrobber")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
/**
 * Implements a pega:param tag.
 */private boolean _jspx_meth_pega_param__2(PageContext aPageContext, java.lang.String aName, java.lang.String aRef) throws Throwable {
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param_ = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param_.setPageContext(pageContext);
_jspx_th_pega_param_.setParent(mParentTag);
_jspx_th_pega_param_.setName(aName);
_jspx_th_pega_param_.setRef(aRef);
int _jspx_eval_pega_param_ = _jspx_th_pega_param_.doStartTag();
if (_jspx_th_pega_param_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param_);
return false;
}
/**
 * Implements a pega:param tag.
 */private boolean _jspx_meth_pega_param__1(PageContext aPageContext, java.lang.String aName, java.lang.String aValue) throws Throwable {
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param_ = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param_.setPageContext(pageContext);
_jspx_th_pega_param_.setParent(mParentTag);
_jspx_th_pega_param_.setName(aName);
_jspx_th_pega_param_.setValue(aValue);
int _jspx_eval_pega_param_ = _jspx_th_pega_param_.doStartTag();
if (_jspx_th_pega_param_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param_);
return false;
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
_jspx_th_pega_reference_.setMode(aMode);
_jspx_th_pega_reference_.setFormat(aFormat);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_eval_pega_reference_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_reference_;
if (_jspx_meth_pega_param__1(pageContext, "sizeClass", "horizontal")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "true")) {
	return true;
}
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_reference_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
private void performStream_1() throws Throwable {
tools.appendString("<!-- the throbber styles are loaded from pzbase-browser.css file which gets loaded by default through skin sizeClass param values can be 1. novalue(shows full 9 dots) 2. horizontal 3. vertical According to class either full icon or first row (3 horizontal dots) or first column (3 vertical dots) would be displayed --> ");

  String sizeclass="";
  sizeclass=StringUtils.crossScriptingFilter(tools.getParamValue("sizeClass")).trim();
  if(sizeclass.equalsIgnoreCase("horizontal") || sizeclass.equalsIgnoreCase("vertical")){
    sizeclass = "small";
  }

tools.appendString(" <div class=\"throbber ");
out.print( sizeclass );
tools.appendString("\" role=\"progressbar\" aria-valuetext='Loading content' tabindex='0'> <div class=\"loader\"></div> </div>");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZTHROBBER #20200818T070729.511 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzThrobber");
	oStreamProperties_1.put("pyRuleSetVersion", "08-06-01");
}
/**
 * Generates stream property_Rule_Obj_Model_pzThrobber
 */
private void property_Rule_Obj_Model_pzThrobber() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PZTHROBBER #20200818T070729.511 GMT	Pega-Gadgets:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZTHROBBER #20200818T070729.511 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZTHROBBER #20200818T070729.511 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_1)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,true);
}
/* end RULE-HTML-PROPERTY PZTHROBBER #20200818T070729.511 GMT */
}
}


public void field_pzThrobber_1() { 
try {
final ParameterPage params_1 = new ParameterPage();
params_1.putString("sizeClass", "horizontal");
params_1.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_1.putString("bLocalize", "true");
	final ClipboardProperty currentProperty_1 = tools.getProperty(".pyTemplateInputBox");
	if (currentProperty_1 != null && currentProperty_1.getParentPage().getClassName().equals("Rule-Obj-Model")) {
		final ClipboardProperty propPrevActive_1 = tools.putActive(currentProperty_1);
		final boolean prevInputMode_1 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput((tools.hasInputEnabled()  || tools.hasEditableEnabled()) && !currentProperty_1.hasAttrProtected());
		final PRStackFrame stack_1 = ((PegaAPI) tools).pushStackFrame( params_1, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzThrobber" );
		try {
			final String currentPropertyRef_1 = currentProperty_1.getReference();
			if (((PegaStreamAPI) tools).isResearchMode()) {
				pega.researchPropertyReference("input", currentPropertyRef_1);
			} else {
				((PegaThread) tools.getThread()).noteInputProperty(currentPropertyRef_1);
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Model_pzThrobber();
			}
		} finally {
			pega.popStackFrame(stack_1, false);
			tools.putActive(propPrevActive_1);
		}
	} else {
if (_jspx_meth_pega_reference__1(pageContext, ".pyTemplateInputBox", "input", "pzThrobber")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
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
if(currentTemplatingStatus =='N')
tools.appendString(" SWP=\".pyToolbarSaveLabel,.pyRuleFormStatus\"  SHOW_WHEN=\".pyToolbarSaveLabel = 'Saving' || .pyRuleFormStatus != 'Good' && .pyRuleFormStatus != 'Error' && .pyRuleFormStatus!='Cancel'\"");
if(pzAuto.evaluateWhen(".pyToolbarSaveLabel = 'Saving' || .pyRuleFormStatus != 'Good' && .pyRuleFormStatus != 'Error' && .pyRuleFormStatus!='Cancel'",null,true)){
	if(currentTemplatingStatus =='N')
	tools.appendString(" style=' ");
	else
	clientWhenAttr += "style= '";
} else {
	if(currentTemplatingStatus =='N')
	tools.appendString(" style='display:none; ");
	else
	clientWhenAttr += "style='display:none;  ";
}
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pyToolbarSaveLabel", -1);
		changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pyRuleFormStatus", -1);
	}
}catch(Exception e){}
}


public void pxHidden_2(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle();
	 String securedPropValue = null;
	 String activePropValue = null;
	 boolean isSecuredProp = false;
	 try {
			 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), tools.getActive(), tools);
			 if(propSecInfo !=null && propSecInfo.isObfuscated()) {
					 securedPropValue = propSecInfo.getPropValue(); 
			 }else if ("ENCRYPTED".equalsIgnoreCase(propSecInfo.getPropType().toString())){
					 isSecuredProp = true;
					 activePropValue = propSecInfo.getPropValue();
			}
	 } catch(Exception e) { }
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
	 }
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
	java.util.List<String> ctPropRefs = new ArrayList<String>();
	IUIComponent ctrlComponent = pzAuto.getUIComponent();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String repeatIndx = "";
	IUIComponentMetadata pyUserData = pzAuto.getUIComponentRuntime().createMetadata();
	cellPage.put("pyValue",".pyToolbarSaveLabel");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);	cellPage.put("pyID","pyToolbarSaveLabel");
	modePage2.put("pyContent","associated");
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2014102117201604151108",true));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyToolbarSaveLabel");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyToolbarSaveLabel", ".pyCaption");
	String spxUniqueStreamHash4 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash4 != null && !"".equals(spxUniqueStreamHash4)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash4,pxUniqueStreamHash+"_4");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_4");
	}
	String errorMsgHTML = pzAuto.getCell().getErrorMessagesHTML("SIMPLELAYOUT","");
	modePage1.put("errMsgHTML",errorMsgHTML);
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
	modePage2.put("clintValidAttrs",clientValidationAttributes);
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_hidden.js");
	ctrlComponent.beginComponent("pxHidden",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {
boolean bUITemplatized = pzAuto.getUIComponentRuntime().isTemplateRendering();pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);
	tools.appendString("<input  type=\"hidden\"  " + pzCell.getTestIdIfEnabled("2014102117201604151108") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"hidden"));
tools.appendString("\" value=\"");if(bUITemplatized){
	tools.appendString(pzAuto.getUIComponentRuntime().getRuntimeContextTree().generateContextToken("pyToolbarSaveLabel"));}else {
	tools.appendCSF(isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true));}
	tools.appendString("\" name=\"");
	tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getActive().getEntryHandle(),"entryHandle"));
	tools.appendString("\" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
	tools.appendString(" data-ctl ");if(bUITemplatized){
	tools.appendString(" data-bindprops=\"value\" ");}
	tools.appendString(">");		}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }		tools.putParamValue("doAutoFormatting", "false");
		tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
	tools.putActive(propActivePrev); 		} catch (Exception e) {

		
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'		&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }			}


}



public void pxHidden_1(String propName, int maxLength, String pyOnInput, String pyEditValidate, String pyStringType) {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
try {

tools.putParamValue("isControlEditableOriginal", true);
	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";tools.putActive(tools.getStepPage().getProperty(propName));
	sEntryHandle = tools.getActive().getEntryHandle();
	 String securedPropValue = null;
	 String activePropValue = null;
	 boolean isSecuredProp = false;
	 try {
			 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), tools.getActive(), tools);
			 if(propSecInfo !=null && propSecInfo.isObfuscated()) {
					 securedPropValue = propSecInfo.getPropValue(); 
			 }else if ("ENCRYPTED".equalsIgnoreCase(propSecInfo.getPropType().toString())){
					 isSecuredProp = true;
					 activePropValue = propSecInfo.getPropValue();
			}
	 } catch(Exception e) { }
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span " + ((pzAuto.isAccessible() && true)?"tabindex='0' ":"") + "");if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 tools.appendString("data-propref='" + sEntryHandle + "'" );}tools.appendString(">");
	 }
		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
	java.util.List<String> ctPropRefs = new ArrayList<String>();
	IUIComponent ctrlComponent = pzAuto.getUIComponent();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String repeatIndx = "";
	IUIComponentMetadata pyUserData = pzAuto.getUIComponentRuntime().createMetadata();
	cellPage.put("pyValue",".pyToolbarSaveLabel");
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);	cellPage.put("pyID","pyToolbarSaveLabel");
	modePage2.put("pyContent","associated");
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("2014102117201604151108",true));
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(".pyToolbarSaveLabel");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(".pyToolbarSaveLabel", ".pyCaption");
	String spxUniqueStreamHash3 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash3 != null && !"".equals(spxUniqueStreamHash3)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash3,pxUniqueStreamHash+"_3");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_3");
	}
	String errorMsgHTML = pzAuto.getCell().getErrorMessagesHTML("SIMPLELAYOUT","");
	modePage1.put("errMsgHTML",errorMsgHTML);
	String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
	modePage2.put("clintValidAttrs",clientValidationAttributes);
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_hidden.js");
	ctrlComponent.beginComponent("pxHidden",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {
boolean bUITemplatized = pzAuto.getUIComponentRuntime().isTemplateRendering();pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);
	tools.appendString("<input  type=\"hidden\"  " + pzCell.getTestIdIfEnabled("2014102117201604151108") + "  id=\"");
		tools.appendString(tools.getHTMLIDForProperty(true,"hidden"));
tools.appendString("\" value=\"");if(bUITemplatized){
	tools.appendString(pzAuto.getUIComponentRuntime().getRuntimeContextTree().generateContextToken("pyToolbarSaveLabel"));}else {
	tools.appendCSF(isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true));}
	tools.appendString("\" name=\"");
	tools.appendString(pzAuto.getUIComponentRuntime().changeTrackProperty(tools.getActive().getEntryHandle(),"entryHandle"));
	tools.appendString("\" ");
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());
	tools.appendString(" data-ctl ");if(bUITemplatized){
	tools.appendString(" data-bindprops=\"value\" ");}
	tools.appendString(">");		}

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }		tools.putParamValue("doAutoFormatting", "false");
		tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
	tools.putActive(propActivePrev); 		} catch (Exception e) {

		
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'		&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }			}


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
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxHidden_1(".pyToolbarSaveLabel",0,"","","Text");
	return index;
}


public int simpleLayoutTemplateCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxHidden_2(".pyToolbarSaveLabel",0,"","","Text");
	index++;
	return index;
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_2();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pzThrobber",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + "   " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")) {	field_pzThrobber_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	expressionId = pxUniqueStreamHash+"_8";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  ".pyToolbarSaveLabel = 'Saving' || .pyRuleFormStatus != 'Good' && .pyRuleFormStatus != 'Error' && .pyRuleFormStatus!='Cancel'", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201410211720160418289-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pzThrobber");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pzThrobber",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")) {	field_pzThrobber_2();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();labelName = "";
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


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_3();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-field item-" + Integer.toString(index) + "   " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_1();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("Exit_Compare_Button-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_1();labelName = "";
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


public int simpleLayoutCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o2&& wxpzRuleFormToolbarShowSaveButton o1! wxpzSaveRefresh","pzRuleFormToolbarShowSaveButton && !pzSaveRefresh","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_3();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)") + " class='content-item content-field item-" + Integer.toString(index) + "    " + pzSection.getCustomStyle(false, "","hotkey-ruleform-save","hotkey-ruleform-save")  + " " +  pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite")  + " flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_2();
	tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pgCells.put("labelLit","false");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("Save_and_compare_button-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","hotkey-ruleform-save");
	pgCells.put("customRWStyles","hotkey-ruleform-save");
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
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2&& wxpzRuleFormToolbarShowSaveButton o1! wxpzSaveRefresh",pxUniqueStreamHash+"_17");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_17");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzRuleFormToolbarShowSaveButton && !pzSaveRefresh");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","@baseclass");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_17");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o2&& wxpzRuleFormToolbarShowSaveButton o1! wxpzSaveRefresh", pxUniqueStreamHash+"_17"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(4)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_2();}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	try{
	labelName = ".pyTemplateInputBox";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(labelName);
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	}catch(Exception ex){
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
if(currentTemplatingStatus =='N')
tools.appendString(" SWP=\".pyToolBarSettings.pyCompareMode\"  SHOW_WHEN=\".pyToolBarSettings.pyCompareMode == true\"");
if(currentTemplatingStatus =='N')
tools.appendString(" data-simplelayout = \"true\" ");
else
clientWhenAttr += "data-simplelayout=true ";
if(pzAuto.evaluateWhen(".pyToolBarSettings.pyCompareMode == true",null,true)){
	if(currentTemplatingStatus =='N')
	tools.appendString(" style=' ");
	else
	clientWhenAttr += "style= '";
} else {
	if(currentTemplatingStatus =='N')
	tools.appendString(" style='display:none; ");
	else
	clientWhenAttr += "style='display:none;  ";
}
if(currentTemplatingStatus =='N')
tools.appendString("'");
else
clientWhenAttr += "'";
if(currentTemplatingStatus =='N')
tools.appendString(">");
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pyToolBarSettings.pyCompareMode", -1);
	}
}catch(Exception e){}
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormToolbarCompareB","",false);
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201801081656080103504") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  set-width-auto layout-content-inline_middle content-inline_middle rule-actions nowrap pzRuleFormToolbarSave" + "'  ");
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
		pg_dlmeta.put("customClassName","rule-actions nowrap pzRuleFormToolbarSave");
		pg_dlmeta.put("class","set-width-auto");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
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
	expressionId = pxUniqueStreamHash+"_18";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen", ".pyToolBarSettings.pyCompareMode == true", expressionId);
	expressionId = expression.getId();
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId)) {
		metadataPage.put("pyExpressionId",expressionId);
	}
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpzRuleFormToolbarCompareB";
	metadataPage.put("paramName", paramName);
	metadataPage.put("floatClass"," set-width-auto");
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Flexbox");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_1();
	containerComponent.endComponent();
	}
public void pzLayout_1() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
boolean templateStatusDisabled = !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(templateStatusDisabled)
generateClientWhenDiv_1();
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_1();
}
if(templateStatusDisabled)
tools.appendString("\n\t\t</div>");
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void 
sectionDefaultValues_1() {
	boolean isInputEnabled=true;
	if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	isInputEnabled=tools.hasInputEnabled();
	}if(isInputEnabled){
	ClipboardPage myStepPage = tools.getPrimaryPage();
	if(pzAuto.handleEvaluateWhen(" o2== rx.pyToolbarSaveLabel cq",".pyToolbarSaveLabel", "cell", "active" )) {
		 tools.getProperty(".pyToolbarSaveLabel").setValue("Save");if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){String tempDefault=tools.getProperty(".pyToolbarSaveLabel").toString();
		 tools.getProperty(".pyToolbarSaveLabel").setValue("");pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDefaultValue(".pyToolbarSaveLabel",tempDefault);}
}
	tools.getInfEngUtils().forwardChain(tools);
	}}

private void performStream_2() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_2 = new HashMap();
static {
	oPropDefinitions_2.put("Rule-Obj-Model.pyTemplateInputBox", new LiteweightPropertyDefinition("Rule-Obj-Model", "pyTemplateInputBox", "sTN", false, true, "Default", false));
}
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "@baseclass");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARCOMPARE #20190222T152109.093 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzRuleFormToolbarCompare");
	oStreamProperties_2.put("pyRuleSetVersion", "08-03-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PZRULEFORMTOOLBARCOMPARE #20190222T152109.093 GMT", "@baseclass pzRuleFormToolbarCompare", "Pega-Desktop", "08-03-01", "20190222T152109.093 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZTHROBBER #20200818T070729.511 GMT", "pzThrobber", "Pega-Gadgets", "08-06-01", "20200818T070729.511 GMT");
}
