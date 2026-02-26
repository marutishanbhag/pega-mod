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
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream RULE-OBJ-CLASS!PZKEYLIST.
 */
public class ra_stream_pzkeylist_2fef80318078e6436c0658a9a7c54054 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzKeyList.Rule_Obj_Class.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1746612930;
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
	public ra_stream_pzkeylist_2fef80318078e6436c0658a9a7c54054(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "b33c15c9aaac1ce7c51f44db494181f30435ad1d";
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
/* Instance RULE-HTML-SECTION RULE-OBJ-CLASS PZKEYLIST #20181116T092010.586 GMT	Pega-SystemArchitect:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "b33c15c9aaac1ce7c51f44db494181f30435ad1d";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzKeyList",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-OBJ-CLASS PZKEYLIST #20181116T092010.586 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-OBJ-CLASS PZKEYLIST #20181116T092010.586 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-OBJ-CLASS PZKEYLIST #20181116T092010.586 GMT */
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
	"Rule-HTML-Section:PZKEYLIST", 
	"Rule-Obj-Property:PYACTIONPROMPT", 
	"Rule-HTML-Property:PXLINK"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZKEYLIST","Rule-HTML-Section","RULE-OBJ-CLASS",false,"","Pega-SystemArchitect","08-02-01","RULE-HTML-SECTION RULE-OBJ-CLASS PZKEYLIST #20181116T092010.586 GMT","!PZKEYLIST",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1746612930), 
		new DependentRuleInfo("PYACTIONPROMPT","Rule-Obj-Property","@BASECLASS",false,"","Pega-WB","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYACTIONPROMPT #20180713T131448.855 GMT","!PYACTIONPROMPT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471)
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
//	RULE-HTML-SECTION RULE-OBJ-CLASS PZKEYLIST #20181116T092010.586 GMT:20181116T092010.586 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYACTIONPROMPT #20180713T131448.855 GMT:20180713T131448.855 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYACTIONPROMPT #20180713T131448.855 GMT:20180713T131448.855 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEBUTTON #20180713T133337.825 GMT:20180713T133337.825 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLDEFAULTVALUES #20180713T133337.840 GMT:20180713T133337.840 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T132449.639 GMT:20180713T132449.639 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDREPEATINGLISTSECTION--(STRIND344E744BC366BE97F9DBB59F94DEA87 #20180713T133338.032 GMT:20180713T133338.032 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDSECTIONBODYELEMENTS--(STRINGFC27BFECDD5F0250930FF8FA168BE1FF #20180713T133338.055 GMT:20180713T133338.055 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELINCLUDE #20181206T140519.218 GMT:20181206T140519.218 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEPERSISTINGRDPARAMS #20180713T133339.854 GMT:20180713T133339.854 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEBUTTON #20180713T133341.441 GMT:20180713T133341.441 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONADDROW #20190204T044757.846 GMT:20190204T044757.846 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
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
		return "966f57b1b2e5543b20a67b8cdfb8fcee";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Class";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
pzLayoutBodyWrapper_1();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzKeyList",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzKeyList','insKey':'RULE-HTML-SECTION RULE-OBJ-CLASS PZKEYLIST #20181116T092010.586 GMT','sectionType':'standard'}");
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")) ){
pzLayout_1();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "AppendToPageList");
config.put("DeferLoadActivity", "RemoveFromPageList");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("StreamType", "Rule-Obj-FlowAction");
config.put("isModalFlowAction", "true");
config.put("ActionSection", "pyNextGenGridModalTemplate");
config.put("StreamClass", "Rule-HTML-Section");
config.put("ModalSection", "pyNextGenGridModalTemplate");
config.put("bIsModal", "true");
config.put("bIsOverlay", "false");
config.put("rowClass", "@baseclass");
config.put("pyActivity", "@baseclass.pzDoListPreAddItem");
config.put("layoutType", "Grid");
config.put("DSName", ".pxResults");
config.put("IntermediatePageName", "IntermediateAddPage");
config.put("PageListProperty", ".pxResults");
pega.getUIEngine().getUIAction("addRow", config).register();
pega.getUIEngine().getUIAction("addRow", null).register();
}
public void pzLayoutBodyWrapper_2() {
if(pzSection.getLayout().loadLayoutBody()) {
try {
tools.appendString("  <div ");
out.print(pzSection.getLayout().getInspectorData("REPEATVERTICAL",".pySections(1)"));
tools.appendString(" class = \"repeatContainer\" section_index='1' > <table class= ' ");
out.print(pzSection.getRepeatStyle());
tools.appendString(" ");
out.print(pzSection.getRepeatStyle());
tools.appendString("RowColRepeat' style='border-collapse: collapse;' PL_PROP='.pyKeyDefList' summary='Fields that make up the key' ID='ClassKeys' bReadOnly='");
out.print(tools.getProperty(".pyKeyDefList").isReadOnly());
tools.appendString("'> <tr>");
 tools.putParamValue("pega_RLindex",tools.getSaveValue("index")); 
 repeatingHeaderCell_1(); 
 repeatingHeaderCell_2(); 
 repeatingHeaderCell_3(); 
 tools.putParamValue("pega_RLindex",""); 
tools.appendString(" </tr> ");
/* pega:forEach */
com.pega.pegarules.jsptags.ForEachTag _jspx_th_pega_forEach__1 = (com.pega.pegarules.jsptags.ForEachTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ForEachTag.class);
_jspx_th_pega_forEach__1.setPageContext(pageContext);
_jspx_th_pega_forEach__1.setParent(mParentTag);
_jspx_th_pega_forEach__1.setName(".pyKeyDefList");
int _jspx_eval_pega_forEach__1 = _jspx_th_pega_forEach__1.doStartTag();
if (_jspx_eval_pega_forEach__1 != Tag.SKIP_BODY) {
	if (_jspx_eval_pega_forEach__1 != Tag.EVAL_BODY_INCLUDE) {
		BodyContent bodyContent = pageContext.pushBody();
		out = bodyContent;
		_jspx_th_pega_forEach__1.setBodyContent(bodyContent);
		_jspx_th_pega_forEach__1.doInitBody();
	}	do {
final Tag prevParentTag_2 = mParentTag;
mParentTag = _jspx_th_pega_forEach__1;
tools.appendString(" ");
/* pega:withEmbedded */
com.pega.pegarules.jsptags.WithEmbeddedTag _jspx_th_pega_withEmbedded__2 = (com.pega.pegarules.jsptags.WithEmbeddedTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithEmbeddedTag.class);
_jspx_th_pega_withEmbedded__2.setPageContext(pageContext);
_jspx_th_pega_withEmbedded__2.setParent(mParentTag);
_jspx_th_pega_withEmbedded__2.setName("$this");
int _jspx_eval_pega_withEmbedded__2 = _jspx_th_pega_withEmbedded__2.doStartTag();
if (_jspx_eval_pega_withEmbedded__2 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_3 = mParentTag;
mParentTag = _jspx_th_pega_withEmbedded__2;
tools.appendString(" ");
tools.putParamValue("expandRL","true");
tools.appendString(" ");
tools.putSaveValue("index",  String.valueOf(tools.getActive().indexOf()) );
tools.appendString(" ");
tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));
tools.appendString(" <tr ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("ReadOnly"), "-1"))) {
tools.appendString(" onkeypress=\"if(event.keyCode==13 && ");
if(pzAuto.getBrowserUtils().isIE()) {
tools.appendString(" event.srcElement.tagName!='A' && event.srcElement");
} else {
tools.appendString(" event.target.tagName!='A' && event.target");
}
tools.appendString(".tagName!='BUTTON')AppendToList('.pyKeyDefList','Embed-ClassKeys',this,'");
out.print( tools.getPrimaryPage().getName() );
tools.appendString("','', event, 'true')\" ");
	}
tools.appendString(" id='");
out.print( ".pyKeyDefList" + tools.getSaveValue("index") );
tools.appendString("' hPref = '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$this-name")) {
	return;
}
tools.appendString("' PL_INDEX = '");
if (_jspx_meth_pega_getSaved__1(pageContext, "index")) {
	return;
}
tools.appendString("' >");
 tools.putParamValue("pega_RLindex",tools.getSaveValue("index")); 
tools.appendString(" ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getActive().indexOf()%2==0)) {
tools.appendString(" ");
tools.putSaveValue("rowClass", " evenRow");
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2) {
tools.appendString(" ");
tools.putSaveValue("rowClass", " oddRow");
tools.appendString(" ");
}
 repeatingDataCell_1(); 
 repeatingDataCell_2(); 
 repeatingDataCell_4(); 
 tools.putParamValue("pega_RLindex",""); 
tools.appendString("  </tr> ");
tools.putParamValue("expandRL","false");
tools.appendString(" ");
mParentTag = prevParentTag_3;
		int evalDoAfterBody = _jspx_th_pega_withEmbedded__2.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withEmbedded__2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withEmbedded__2);
tools.appendString(" ");
mParentTag = prevParentTag_2;
		int evalDoAfterBody = _jspx_th_pega_forEach__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
	if (_jspx_eval_pega_forEach__1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
		out = pageContext.popBody();
	}
}
if (_jspx_th_pega_forEach__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_forEach__1);
tools.appendString(" <tr>");
 tools.putParamValue("pega_RLindex",tools.getSaveValue("index")); 
 repeatingDataCell_5(); 
 repeatingDataCell_6(); 
 repeatingDataCell_7(); 
 tools.putParamValue("pega_RLindex",""); 
tools.appendString(" </tr> </table> </div> ");
layoutBody_1();
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
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
tools.appendString("<label  " + pzCell.getTestIdIfEnabled("2015032715513300206375") + "  ");
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
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("REPEATVERTICAL",".pySections(1)") + "  section_index='1'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "height:22px;width:130px;",false,"","");tools.appendString("<nobr>");
	labelIncludeInCell_1("","","","",false,"",true,false,"Standard",false);
	tools.appendString("</nobr>");
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void repeatingDataCell_7() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(3).pyCells(3)")); tools.appendString("style='");
	tools.appendString("width:20px;");tools.appendString("'class=' ");
	tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(3).pyCells(2)")); tools.appendString("style='");
	tools.appendString("width:200px;");tools.appendString("'class=' ");
	tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
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


public void pxLink_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzKeyList_"+ referenceString+ "_13'";
	 String securedPropValue = null;
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20140923060908091542737") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"AppendToList\",[\".pyKeyDefList\",\"Embed-ClassKeys\",\"\",\"" + tools.getPrimaryPage().getName() + "\",\"AppendToPageList\",\":event\",\"true\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-plus-circle";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Add key",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</a>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}} catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_5() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox", ".pySections(1).pySectionBody(1).pyTable.pyRows(3).pyCells(1)")); tools.appendString("style='");
	tools.appendString("");tools.appendString("'class=' ");
	tools.appendString(pzSection.getCustomStyle(false,"pxHasInstances","dataValueRead RV1 ","dataValueWrite RV1 "));tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(pzAuto.handleEvaluateWhen(" o1! wxpzAppliesToHasInstances","!pzAppliesToHasInstances", "cell", "visible" )) {pxLink_1(); } 
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
generateButton_2() {if(tools.hasInputEnabled()){
								tools.appendString("<button type='button' id='RLDel' onkeypress='event.cancelBubble=true;' onclick=\"javascript:setUserStart('RemoveFromList');RemoveFromList('.pyKeyDefList', this, '"); tools.appendString(tools.getPrimaryPage().getName()); tools.appendString("', 'RemoveFromPageList', event, 'true')\" class='iconDelete' alt='"); getToolTip_2(); tools.appendString("' title='"); getToolTip_2(); tools.appendString("' isIcon='true' onmouseover=\"this.className='iconDelete_on'\" onmouseout=\"this.className='iconDelete'\"");tools.appendString("></button>&nbsp;");}}
public void 
getToolTip_2() {
try {
 tools.putSaveValue("fieldValueRef","Delete this row\\t"+tools.getSaveValue("index")); 
tools.appendString(" ");
/* pega:lookup */
com.pega.pegarules.jsptags.LookupTag _jspx_th_pega_lookup__2 = (com.pega.pegarules.jsptags.LookupTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.LookupTag.class);
_jspx_th_pega_lookup__2.setPageContext(pageContext);
_jspx_th_pega_lookup__2.setParent(mParentTag);
_jspx_th_pega_lookup__2.setProperty(".pyActionPrompt");
_jspx_th_pega_lookup__2.setValue( tools.getSaveValue("fieldValueRef"));
int _jspx_eval_pega_lookup__2 = _jspx_th_pega_lookup__2.doStartTag();
if (_jspx_th_pega_lookup__2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_lookup__2);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_4() {
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorData("ICON",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(2).pyCells(3)")); tools.appendString(" class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString("'  style='");
	tools.appendString("width:20px;");tools.appendString("'>");
	generateButton_2();
tools.appendString("</td>");
}
public void repeatingHeaderCell_3() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140923060908091436258") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString("dataLabelRead");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:20px;");tools.appendString("'>");
		if(pega_uiengine_harness.pzIsBrowserIEEight(pzAuto)){
	tools.appendString("<div class='gradient-border'  >");
tools.appendString("</div>");
}else{
	
}
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_2() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Caption' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140923060908091335147") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",pzSection.getLabelStyle()));tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:200px;");tools.appendString("'>");
		if(pega_uiengine_harness.pzIsBrowserIEEight(pzAuto)){
	tools.appendString("<div class='gradient-border'  >");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Caption", StreamBuilder.FMT_LITERAL));
tools.appendString("</div>");
}else{
	
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Caption", StreamBuilder.FMT_LITERAL));
}
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_1() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Name' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140923060908091334963") + " ");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead RV1 ","dataValueWrite RV1 "));tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("");tools.appendString("'>");
		if(pega_uiengine_harness.pzIsBrowserIEEight(pzAuto)){
	tools.appendString("<div class='gradient-border'  >");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Name", StreamBuilder.FMT_LITERAL));
tools.appendString("</div>");
}else{
	
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Name", StreamBuilder.FMT_LITERAL));
}
	tools.appendString("</th>");
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
tools.appendString(" SWP=\".pyClassType\"  SHOW_WHEN=\".pyClassType = 'Concrete'\"");
if(pzAuto.evaluateWhen(".pyClassType = 'Concrete'",null,true)){
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
		changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pyClassType", -1);
	}
}catch(Exception e){}
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzKeyListB","",false);
}
public void pzLayout_1() {
boolean templateStatusDisabled = !pzAuto.getUIComponentRuntime().isTemplatingUIEnabled();
if(templateStatusDisabled)
generateClientWhenDiv_1();
pzSetExpandParam_1();
pzLayoutBodyWrapper_2();
if(templateStatusDisabled)
tools.appendString("\n\t\t</div>");
}
/**
 * Implements a pega:getSaved tag.
 */private boolean _jspx_meth_pega_getSaved__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:getSaved */
com.pega.pegarules.jsptags.GetSavedTag _jspx_th_pega_getSaved_ = (com.pega.pegarules.jsptags.GetSavedTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.GetSavedTag.class);
_jspx_th_pega_getSaved_.setPageContext(pageContext);
_jspx_th_pega_getSaved_.setParent(mParentTag);
_jspx_th_pega_getSaved_.setName(aName);
int _jspx_eval_pega_getSaved_ = _jspx_th_pega_getSaved_.doStartTag();
if (_jspx_th_pega_getSaved_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_getSaved_);
return false;
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__3(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
public void pzLayoutBodyWrapper_1() {
try {
tools.appendString("  ");
	if (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("partialTrigger"), "appendTo.pyKeyDefList1"))) {
tools.appendString(" ");

 tools.putParamValue("partialRefresh", "false");
 if(tools instanceof StreamBuilderToolKit) {
 ClipboardProperty pageListProp = tools.getProperty(".pyKeyDefList");
 ClipboardProperty pagePropInList = pageListProp.getPropertyValue(Integer.parseInt(tools.getParamValue("strIndexInList")));
 ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);
 tools.putParamValue("strIndexInList", pageListProp.size());
 }

tools.appendString("<table> ");
/* pega:withEmbedded */
com.pega.pegarules.jsptags.WithEmbeddedTag _jspx_th_pega_withEmbedded__1 = (com.pega.pegarules.jsptags.WithEmbeddedTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithEmbeddedTag.class);
_jspx_th_pega_withEmbedded__1.setPageContext(pageContext);
_jspx_th_pega_withEmbedded__1.setParent(mParentTag);
_jspx_th_pega_withEmbedded__1.setName("$this");
int _jspx_eval_pega_withEmbedded__1 = _jspx_th_pega_withEmbedded__1.doStartTag();
if (_jspx_eval_pega_withEmbedded__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_1 = mParentTag;
mParentTag = _jspx_th_pega_withEmbedded__1;
tools.appendString(" ");
tools.putParamValue("expandRL","true");
tools.appendString(" ");
tools.putSaveValue("index",  String.valueOf(tools.getActive().indexOf()) );
tools.appendString(" ");
tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));
tools.appendString(" <tr ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("ReadOnly"), "-1"))) {
tools.appendString(" onkeypress=\"if(event.keyCode==13 && ");
if(pzAuto.getBrowserUtils().isIE()) {
tools.appendString(" event.srcElement.tagName!='A' && event.srcElement");
} else {
tools.appendString(" event.target.tagName!='A' && event.target");
}
tools.appendString(".tagName!='BUTTON')AppendToList('.pyKeyDefList','Embed-ClassKeys',this,'");
out.print( tools.getPrimaryPage().getName() );
tools.appendString("','', event, 'true')\" ");
	}
tools.appendString(" id='");
out.print( ".pyKeyDefList" + tools.getSaveValue("index") );
tools.appendString("' hPref = '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__3(pageContext, "$this-name")) {
	return;
}
tools.appendString("' PL_INDEX = '");
if (_jspx_meth_pega_getSaved__1(pageContext, "index")) {
	return;
}
tools.appendString("' >");
 tools.putParamValue("pega_RLindex",tools.getSaveValue("index")); 
tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || tools.getActive().indexOf()%2==0)) {
tools.appendString(" ");
tools.putSaveValue("rowClass", " evenRow");
tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");
tools.putSaveValue("rowClass", " oddRow");
tools.appendString(" ");
}
 repeatingDataCell_1(); 
 repeatingDataCell_2(); 
 repeatingDataCell_3(); 
 tools.putParamValue("pega_RLindex",""); 
tools.appendString("  </tr> ");
tools.putParamValue("expandRL","false");
tools.appendString(" ");
mParentTag = prevParentTag_1;
		int evalDoAfterBody = _jspx_th_pega_withEmbedded__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withEmbedded__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withEmbedded__1);
tools.appendString("</table>");
	}
tools.appendString(" ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
tools.putSaveValue("rowClass","");
}
public void 
generateButton_1() {if(tools.hasInputEnabled()){
								tools.appendString("<button type='button' id='RLDel' onkeypress='event.cancelBubble=true;' onclick=\"javascript:setUserStart('RemoveFromList');RemoveFromList('.pyKeyDefList', this, '"); tools.appendString(tools.getPrimaryPage().getName()); tools.appendString("', 'RemoveFromPageList', event, 'true')\" class='iconDelete' alt='"); getToolTip_1(); tools.appendString("' title='"); getToolTip_1(); tools.appendString("' isIcon='true' onmouseover=\"this.className='iconDelete_on'\" onmouseout=\"this.className='iconDelete'\"");tools.appendString("></button>&nbsp;");}}
public void 
getToolTip_1() {
try {
 tools.putSaveValue("fieldValueRef","Delete this row\\t"+tools.getSaveValue("index")); 
tools.appendString(" ");
/* pega:lookup */
com.pega.pegarules.jsptags.LookupTag _jspx_th_pega_lookup__1 = (com.pega.pegarules.jsptags.LookupTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.LookupTag.class);
_jspx_th_pega_lookup__1.setPageContext(pageContext);
_jspx_th_pega_lookup__1.setParent(mParentTag);
_jspx_th_pega_lookup__1.setProperty(".pyActionPrompt");
_jspx_th_pega_lookup__1.setValue( tools.getSaveValue("fieldValueRef"));
int _jspx_eval_pega_lookup__1 = _jspx_th_pega_lookup__1.doStartTag();
if (_jspx_th_pega_lookup__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_lookup__1);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_3() {
	tools.appendString("<td  title='");
	tools.appendString("'  ");
	 tools.appendString(' ' + pzCell.getInspectorData("ICON",null, null, ".pySections(1).pySectionBody(1).pyTable.pyRows(2).pyCells(3)")); tools.appendString(" class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString("'  style='");
	tools.appendString("width:20px;");tools.appendString("'>");
	generateButton_1();
tools.appendString("</td>");
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__2(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "Width", "200")) {
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
public void 
pegaReferenceTag_2() {
try {

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pyKeyCaption", "input", "Default")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_2() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("Default",".pyKeyCaption", ".pySections(1).pySectionBody(1).pyTable.pyRows(2).pyCells(2)")); tools.appendString("style='");
	tools.appendString("width:200px;");tools.appendString("'class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString(" ");
	tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	
				pegaReferenceTag_2();
				hiddenPropParamStringMethod_1();
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
hiddenPropParamStringMethod_1() {
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
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ListName", "List")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ApplyTo", "pyDerivesFrom")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Property")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
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
public void 
pegaReferenceTag_1() {
try {

/*
 * reference tag
 * Cannot inline because: cannot identify property ".pyKeyName" at assembly time
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyKeyName", "input", "RF_OpenClassKeys")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("RF_OpenClassKeys",".pyKeyName", ".pySections(1).pySectionBody(1).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("");tools.appendString("'class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString(" ");
	tools.appendString(pzSection.getCustomStyle(false,"","dataValueRead RV1 ","dataValueWrite RV1 "));tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	
				pegaReferenceTag_1();
				hiddenPropParamStringMethod_1();
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Rule-Obj-Class.pyActionPrompt", new LiteweightPropertyDefinition("Rule-Obj-Class", "pyActionPrompt", "stN", false, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Rule-Obj-Class");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-OBJ-CLASS PZKEYLIST #20181116T092010.586 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-SystemArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzKeyList");
	oStreamProperties_1.put("pyRuleSetVersion", "08-02-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-OBJ-CLASS PZKEYLIST #20181116T092010.586 GMT", "Rule-Obj-Class pzKeyList", "Pega-SystemArchitect", "08-02-01", "20181116T092010.586 GMT");
}
