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
 * Builds JSP stream RULE-OBJ-PROPERTY!PZOLDAUTOPOPULATE.
 */
public class ra_stream_pzoldautopopulate_59d396936cf3b0cca58278a9ef409b3b extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzOldAutoPopulate.Rule_Obj_Property.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -724720524;
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
	public ra_stream_pzoldautopopulate_59d396936cf3b0cca58278a9ef409b3b(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "148ffc858c9edd6bb26ccdf1abb3c32006382bdb";
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
/* Instance RULE-HTML-SECTION RULE-OBJ-PROPERTY PZOLDAUTOPOPULATE #20180713T135658.199 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "148ffc858c9edd6bb26ccdf1abb3c32006382bdb";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzOldAutoPopulate",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-OBJ-PROPERTY PZOLDAUTOPOPULATE #20180713T135658.199 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-OBJ-PROPERTY PZOLDAUTOPOPULATE #20180713T135658.199 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-OBJ-PROPERTY PZOLDAUTOPOPULATE #20180713T135658.199 GMT */
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
	"Rule-HTML-Section:PZOLDAUTOPOPULATE", 
	"Rule-Obj-Property:PYASSOCREFERENCEKEY", 
	"Rule-Obj-Property:PYASSOCDECLARETEMPLATE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZOLDAUTOPOPULATE","Rule-HTML-Section","RULE-OBJ-PROPERTY",false,"","Pega-SystemArchitect","08-01-01","RULE-HTML-SECTION RULE-OBJ-PROPERTY PZOLDAUTOPOPULATE #20180713T135658.199 GMT","!PZOLDAUTOPOPULATE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-724720524), 
		new DependentRuleInfo("PYASSOCREFERENCEKEY","Rule-Obj-Property","RULE-OBJ-PROPERTY",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYASSOCREFERENCEKEY #20180713T131303.732 GMT","!PYASSOCREFERENCEKEY",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYASSOCDECLARETEMPLATE","Rule-Obj-Property","RULE-OBJ-PROPERTY",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYASSOCDECLARETEMPLATE #20180713T131303.728 GMT","!PYASSOCDECLARETEMPLATE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0)
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
//	RULE-HTML-SECTION RULE-OBJ-PROPERTY PZOLDAUTOPOPULATE #20180713T135658.199 GMT:20180713T135658.199 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYASSOCREFERENCEKEY #20180713T131303.732 GMT:20180713T131303.732 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYASSOCREFERENCEKEY #20180713T131303.732 GMT:20180713T131303.732 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYASSOCDECLARETEMPLATE #20180713T131303.728 GMT:20180713T131303.728 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYASSOCDECLARETEMPLATE #20180713T131303.728 GMT:20180713T131303.728 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLDEFAULTVALUES #20180713T133337.840 GMT:20180713T133337.840 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T132449.639 GMT:20180713T132449.639 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T133337.901 GMT:20180713T133337.901 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDREPEATINGLISTSECTION--(STRIND344E744BC366BE97F9DBB59F94DEA87 #20180713T133338.032 GMT:20180713T133338.032 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDSECTIONBODYELEMENTS--(STRINGFC27BFECDD5F0250930FF8FA168BE1FF #20180713T133338.055 GMT:20180713T133338.055 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELINCLUDE #20181206T140519.218 GMT:20181206T140519.218 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEPERSISTINGRDPARAMS #20180713T133339.854 GMT:20180713T133339.854 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
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
		return "2aebe409b11f6bf4628f0c729f761138";
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
pzLayoutBodyWrapper_1();
pzLayoutBodyWrapper_2();
pzLayoutBodyWrapper_3();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzOldAutoPopulate",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzOldAutoPopulate','insKey':'RULE-HTML-SECTION RULE-OBJ-PROPERTY PZOLDAUTOPOPULATE #20180713T135658.199 GMT','sectionType':'null'}");
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")) ){
pzLayout_1();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")) ){
pzLayout_2();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")) ){
pzLayout_3();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")) ){
pzLayout_4();
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
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "AppendToPageList");
config.put("DeferLoadActivity", "RemoveFromPageList");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "AppendToPageList");
config.put("DeferLoadActivity", "RemoveFromPageList");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
}
public void pzLayoutBodyWrapper_7() {
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_2();
}
tools.putSaveValue("rowClass","");
}


public void field_OpenRuleAdvanced_2() { 
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__5 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__5.setPageContext(pageContext);
_jspx_th_pega_reference__5.setParent(mParentTag);
_jspx_th_pega_reference__5.setName(".pyAssocDeclareTemplate");
_jspx_th_pega_reference__5.setMode("input");
_jspx_th_pega_reference__5.setFormat("OpenRuleAdvanced");
int _jspx_eval_pega_reference__5 = _jspx_th_pega_reference__5.doStartTag();
if (_jspx_eval_pega_reference__5 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_11 = mParentTag;
mParentTag = _jspx_th_pega_reference__5;
tools.putParamValue("bLocalize","true");
mParentTag = prevParentTag_11;
		int evalDoAfterBody = _jspx_th_pega_reference__5.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference__5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__5);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public void layoutBody_2() { 
	tools.appendString("<table role='presentation' " + pzSection.getLayout().getInspectorData("FREEFORM",".pySections(4)") + "  section_index='4'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(4).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "",false,"","");labelIncludeInCell_1("","","","",false,"Use Data Page to Perform Load:",true,false,"Standard",false);
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyAssocDeclareTemplate",".pySections(4).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead RV1","dataValueWrite RV1"), "",false," wxIsAssocUseDeclarePageTemplate","IsAssocUseDeclarePageTemplate");if(pzAuto.handleEvaluateWhen(" wxIsAssocUseDeclarePageTemplate","IsAssocUseDeclarePageTemplate", "cell", "visible" )) {tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")) {field_OpenRuleAdvanced_2();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionpzOldAutoPopulateBBBB","",false);
}
public void pzLayout_4() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxIsAssocUseDeclarePageTemplate","IsAssocUseDeclarePageTemplate ", "layout", "visible" )) {pzSetExpandParam_4();
pzLayoutBodyWrapper_7();
}
}
}
public void pzLayoutBodyWrapper_6() {
 String clsScroll= "";tools.appendString("<div section_index='3' class='" + clsScroll + " sectionBodyContainerSubHead'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
try {
tools.appendString("  <div class = \"repeatContainer\" > <table class= ' ");
out.print(pzSection.getRepeatStyle());
tools.appendString(" ");
out.print(pzSection.getRepeatStyle());
tools.appendString("RowColRepeat' style='border-collapse: collapse;' PL_PROP='.pyAssocReferenceOneKeyList' summary='pyReferenceKeyList' ID='' bReadOnly='");
out.print(tools.getProperty(".pyAssocReferenceOneKeyList").isReadOnly());
tools.appendString("'> <tr>");
 tools.putParamValue("pega_RLindex",tools.getSaveValue("index")); 
 repeatingHeaderCell_3(); 
 repeatingHeaderCell_4(); 
 repeatingDataCell_9(); 
 tools.putParamValue("pega_RLindex",""); 
tools.appendString(" </tr> ");
/* pega:forEach */
com.pega.pegarules.jsptags.ForEachTag _jspx_th_pega_forEach__2 = (com.pega.pegarules.jsptags.ForEachTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ForEachTag.class);
_jspx_th_pega_forEach__2.setPageContext(pageContext);
_jspx_th_pega_forEach__2.setParent(mParentTag);
_jspx_th_pega_forEach__2.setName(".pyAssocReferenceOneKeyList");
int _jspx_eval_pega_forEach__2 = _jspx_th_pega_forEach__2.doStartTag();
if (_jspx_eval_pega_forEach__2 != Tag.SKIP_BODY) {
	if (_jspx_eval_pega_forEach__2 != Tag.EVAL_BODY_INCLUDE) {
		BodyContent bodyContent = pageContext.pushBody();
		out = bodyContent;
		_jspx_th_pega_forEach__2.setBodyContent(bodyContent);
		_jspx_th_pega_forEach__2.doInitBody();
	}	do {
final Tag prevParentTag_9 = mParentTag;
mParentTag = _jspx_th_pega_forEach__2;
tools.appendString(" ");
/* pega:withEmbedded */
com.pega.pegarules.jsptags.WithEmbeddedTag _jspx_th_pega_withEmbedded__4 = (com.pega.pegarules.jsptags.WithEmbeddedTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithEmbeddedTag.class);
_jspx_th_pega_withEmbedded__4.setPageContext(pageContext);
_jspx_th_pega_withEmbedded__4.setParent(mParentTag);
_jspx_th_pega_withEmbedded__4.setName("$this");
int _jspx_eval_pega_withEmbedded__4 = _jspx_th_pega_withEmbedded__4.doStartTag();
if (_jspx_eval_pega_withEmbedded__4 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_10 = mParentTag;
mParentTag = _jspx_th_pega_withEmbedded__4;
tools.appendString(" ");
tools.putParamValue("expandRL","true");
tools.appendString(" ");
tools.putSaveValue("index",  String.valueOf(tools.getActive().indexOf()) );
tools.appendString(" ");
tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));
tools.appendString(" <tr hPref = '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("' PL_INDEX = '");
if (_jspx_meth_pega_getSaved__1(pageContext, "index")) {
	return;
}
tools.appendString("' >");
 tools.putParamValue("pega_RLindex",tools.getSaveValue("index")); 
tools.appendString(" ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || tools.getActive().indexOf()%2==0)) {
tools.appendString(" ");
tools.putSaveValue("rowClass", " evenRow");
tools.appendString(" ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
tools.appendString(" ");
tools.putSaveValue("rowClass", " oddRow");
tools.appendString(" ");
}
 repeatingDataCell_10(); 
 repeatingDataCell_5(); 
 repeatingDataCell_6(); 
 tools.putParamValue("pega_RLindex",""); 
tools.appendString("  </tr> ");
tools.putParamValue("expandRL","false");
tools.appendString(" ");
mParentTag = prevParentTag_10;
		int evalDoAfterBody = _jspx_th_pega_withEmbedded__4.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withEmbedded__4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withEmbedded__4);
tools.appendString(" ");
mParentTag = prevParentTag_9;
		int evalDoAfterBody = _jspx_th_pega_forEach__2.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
	if (_jspx_eval_pega_forEach__2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
		out = pageContext.popBody();
	}
}
if (_jspx_th_pega_forEach__2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_forEach__2);
tools.appendString(" </table> </div> ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void 
pegaReferenceTag_5() {
try {

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__4 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__4.setPageContext(pageContext);
_jspx_th_pega_reference__4.setParent(mParentTag);
_jspx_th_pega_reference__4.setName(".pyKeyName");
_jspx_th_pega_reference__4.setMode("display");
_jspx_th_pega_reference__4.setFormat("Default");
int _jspx_eval_pega_reference__4 = _jspx_th_pega_reference__4.doStartTag();
if (_jspx_eval_pega_reference__4 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_8 = mParentTag;
mParentTag = _jspx_th_pega_reference__4;
tools.putParamValue("bLocalize","true");
mParentTag = prevParentTag_8;
		int evalDoAfterBody = _jspx_th_pega_reference__4.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference__4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__4);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_10() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("Default",".pyKeyName", ".pySections(3).pySectionBody(1).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("");getInlineStyle_1(); tools.appendString("");tools.appendString("'class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString(" ");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	
				pegaReferenceTag_5();
				hiddenPropParamStringMethod_1();
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingDataCell_9() {
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString("");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" class='");
		tools.appendString("dataLabelRead");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:67px;");getInlineStyle_3(); tools.appendString("");tools.appendString("'>");
		
	tools.appendString("</td>");
	}
public void repeatingHeaderCell_4() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Value from Property' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString("");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead RVF","dataValueWrite RVF"));tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("");tools.appendString("'>");
		if(pega_uiengine_harness.pzIsBrowserIEEight(pzAuto)){
	tools.appendString("<div class='gradient-border'  >");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Value from Property", StreamBuilder.FMT_LITERAL));
tools.appendString("</div>");
}else{
	
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Value from Property", StreamBuilder.FMT_LITERAL));
}
	tools.appendString("</th>");
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
tools.appendString(" role='columnheader' aria-label='Key of Auto-Populate Instance:' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString("");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(3).pySectionBody(1).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",pzSection.getLabelStyle()));tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("");getInlineStyle_2(); tools.appendString("");tools.appendString("'>");
		if(pega_uiengine_harness.pzIsBrowserIEEight(pzAuto)){
	tools.appendString("<div class='gradient-border'  >");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Key of Auto-Populate Instance:", StreamBuilder.FMT_LITERAL));
tools.appendString("</div>");
}else{
	
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Key of Auto-Populate Instance:", StreamBuilder.FMT_LITERAL));
}
	tools.appendString("</th>");
	}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpzOldAutoPopulateBBB","",true);
}
public void LayoutWrapperTableStart_3() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATVERTICAL','pgRef':'.pySections(3)'}") + "class='groupBoxStyle' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzOldAutoPopulateBBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\"><tr><td>");
}

 public void pzHeaderBody_3(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Auto-populate using class keys from parent page");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
String expandCollapseText="";
expandCollapseText=tools.getLocalizedTextForString("pyWorkPage.pyActionPrompt","Click to collapse");
tools.appendString("\t\t\t<table cellspacing='0' cellpadding='0' width='100%' id='RULE_KEY' node_type='HEADER'  class='titleBarBorderExpanded'  tabIndex='0' aria-label='" + l_sectionTitle + "'section_index='3'>\t\t\t\t<tr><td nowrap='nowrap' class='groupTitleBarNoExpand'><span class='groupTitleBarIconSPANNoExpand'></span></td><td nowrap='nowrap' class='groupTitleBarBackgroundExpanded'>\t<table cellpadding='0' cellspacing='0' width='100%'>\n<tr><td nowrap='nowrap' class='tdLeftStyle'><table cellpadding='0' cellspacing='0'><tr><td nowrap='nowrap'><span  class='groupTitleBarTitleStyleExpanded' >" + l_sectionTitle + "</span></td><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr></tr></table></td>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzOldAutoPopulateBBB","tdRightStyle");}
tools.appendString("</tr></table></td><td nowrap='nowrap' class='groupTitleBarRightExpanded'>&nbsp;</td></tr></table>");

	 /***Grid HeaderElements: End ***/

}
public void pzLayout_3() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxIsAssocOneKeylist","IsAssocOneKeylist", "layout", "visible" )) {pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_3(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_3();
}
pzLayoutBodyWrapper_6();
 LayoutWrapperTableEnd_1(); }
}
}
public void pzLayoutBodyWrapper_5() {
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " sectionBodyContainerSubHead'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
try {
tools.appendString("  <div class = \"repeatContainer\" > <table class= ' ");
out.print(pzSection.getRepeatStyle());
tools.appendString(" ");
out.print(pzSection.getRepeatStyle());
tools.appendString("RowColRepeat' style='border-collapse: collapse;' PL_PROP='.pyAssocReferenceManyKeyList' summary='' ID='' bReadOnly='");
out.print(tools.getProperty(".pyAssocReferenceManyKeyList").isReadOnly());
tools.appendString("'> <tr>");
 tools.putParamValue("pega_RLindex",tools.getSaveValue("index")); 
 repeatingHeaderCell_1(); 
 repeatingHeaderCell_2(); 
 repeatingDataCell_7(); 
 tools.putParamValue("pega_RLindex",""); 
tools.appendString(" </tr> ");
/* pega:forEach */
com.pega.pegarules.jsptags.ForEachTag _jspx_th_pega_forEach__1 = (com.pega.pegarules.jsptags.ForEachTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ForEachTag.class);
_jspx_th_pega_forEach__1.setPageContext(pageContext);
_jspx_th_pega_forEach__1.setParent(mParentTag);
_jspx_th_pega_forEach__1.setName(".pyAssocReferenceManyKeyList");
int _jspx_eval_pega_forEach__1 = _jspx_th_pega_forEach__1.doStartTag();
if (_jspx_eval_pega_forEach__1 != Tag.SKIP_BODY) {
	if (_jspx_eval_pega_forEach__1 != Tag.EVAL_BODY_INCLUDE) {
		BodyContent bodyContent = pageContext.pushBody();
		out = bodyContent;
		_jspx_th_pega_forEach__1.setBodyContent(bodyContent);
		_jspx_th_pega_forEach__1.doInitBody();
	}	do {
final Tag prevParentTag_6 = mParentTag;
mParentTag = _jspx_th_pega_forEach__1;
tools.appendString(" ");
/* pega:withEmbedded */
com.pega.pegarules.jsptags.WithEmbeddedTag _jspx_th_pega_withEmbedded__3 = (com.pega.pegarules.jsptags.WithEmbeddedTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithEmbeddedTag.class);
_jspx_th_pega_withEmbedded__3.setPageContext(pageContext);
_jspx_th_pega_withEmbedded__3.setParent(mParentTag);
_jspx_th_pega_withEmbedded__3.setName("$this");
int _jspx_eval_pega_withEmbedded__3 = _jspx_th_pega_withEmbedded__3.doStartTag();
if (_jspx_eval_pega_withEmbedded__3 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_7 = mParentTag;
mParentTag = _jspx_th_pega_withEmbedded__3;
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
tools.appendString(".tagName!='BUTTON')AppendToList('.pyAssocReferenceManyKeyList','Embed-ReferenceKeys',this,'");
out.print( tools.getPrimaryPage().getName() );
tools.appendString("','', event, 'true')\" ");
	}
tools.appendString(" id='");
out.print( ".pyAssocReferenceManyKeyList" + tools.getSaveValue("index") );
tools.appendString("' hPref = '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("' PL_INDEX = '");
if (_jspx_meth_pega_getSaved__1(pageContext, "index")) {
	return;
}
tools.appendString("' >");
 tools.putParamValue("pega_RLindex",tools.getSaveValue("index")); 
tools.appendString(" ");
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.getActive().indexOf()%2==0)) {
tools.appendString(" ");
tools.putSaveValue("rowClass", " evenRow");
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
tools.appendString(" ");
tools.putSaveValue("rowClass", " oddRow");
tools.appendString(" ");
}
 repeatingDataCell_8(); 
 repeatingDataCell_2(); 
 repeatingDataCell_3(); 
 tools.putParamValue("pega_RLindex",""); 
tools.appendString("  </tr> ");
tools.putParamValue("expandRL","false");
tools.appendString(" ");
mParentTag = prevParentTag_7;
		int evalDoAfterBody = _jspx_th_pega_withEmbedded__3.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withEmbedded__3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withEmbedded__3);
tools.appendString(" ");
mParentTag = prevParentTag_6;
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
tools.appendString(" </table> </div> ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
}
public void 
pegaReferenceTag_4() {
try {

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__3 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__3.setPageContext(pageContext);
_jspx_th_pega_reference__3.setParent(mParentTag);
_jspx_th_pega_reference__3.setName(".pyKeyName");
_jspx_th_pega_reference__3.setMode("display");
_jspx_th_pega_reference__3.setFormat("Default");
int _jspx_eval_pega_reference__3 = _jspx_th_pega_reference__3.doStartTag();
if (_jspx_eval_pega_reference__3 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_5 = mParentTag;
mParentTag = _jspx_th_pega_reference__3;
tools.putParamValue("bLocalize","true");
mParentTag = prevParentTag_5;
		int evalDoAfterBody = _jspx_th_pega_reference__3.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference__3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__3);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_8() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("Default",".pyKeyName", ".pySections(2).pySectionBody(1).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("");getInlineStyle_1(); tools.appendString("");tools.appendString("'class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString(" ");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	
				pegaReferenceTag_4();
				hiddenPropParamStringMethod_1();
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void 
getInlineStyle_3() {
try {
tools.appendString("visibility:hidden;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_7() {
		tools.appendString("<td title='");
		tools.appendString("'    ");
		tools.appendString("");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" class='");
		tools.appendString("dataLabelRead");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:30px;");getInlineStyle_3(); tools.appendString("");tools.appendString("'>");
		
	tools.appendString("</td>");
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
tools.appendString(" role='columnheader' aria-label='Value from Property' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString("");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead RVF","dataValueWrite RVF"));tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("");tools.appendString("'>");
		if(pega_uiengine_harness.pzIsBrowserIEEight(pzAuto)){
	tools.appendString("<div class='gradient-border'  >");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Value from Property", StreamBuilder.FMT_LITERAL));
tools.appendString("</div>");
}else{
	
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Value from Property", StreamBuilder.FMT_LITERAL));
}
	tools.appendString("</th>");
	}
public void 
getInlineStyle_2() {
try {
tools.appendString("width:220px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
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
tools.appendString(" role='columnheader' aria-label='List Condition for Auto-Populate Instances:' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString("");
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",pzSection.getLabelStyle()));tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("");getInlineStyle_2(); tools.appendString("");tools.appendString("'>");
		if(pega_uiengine_harness.pzIsBrowserIEEight(pzAuto)){
	tools.appendString("<div class='gradient-border'  >");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "List Condition for Auto-Populate Instances:", StreamBuilder.FMT_LITERAL));
tools.appendString("</div>");
}else{
	
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "List Condition for Auto-Populate Instances:", StreamBuilder.FMT_LITERAL));
}
	tools.appendString("</th>");
	}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzOldAutoPopulateBB","",true);
}
public void LayoutWrapperTableStart_2() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATVERTICAL','pgRef':'.pySections(2)'}") + "class='groupBoxStyle' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzOldAutoPopulateBB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\"><tr><td>");
}

 public void pzHeaderBody_2(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Auto-Populate List using Conditions");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
String expandCollapseText="";
expandCollapseText=tools.getLocalizedTextForString("pyWorkPage.pyActionPrompt","Click to collapse");
tools.appendString("\t\t\t<table cellspacing='0' cellpadding='0' width='100%' id='RULE_KEY' node_type='HEADER'  class='titleBarBorderExpanded'  tabIndex='0' aria-label='" + l_sectionTitle + "'section_index='2'>\t\t\t\t<tr><td nowrap='nowrap' class='groupTitleBarNoExpand'><span class='groupTitleBarIconSPANNoExpand'></span></td><td nowrap='nowrap' class='groupTitleBarBackgroundExpanded'>\t<table cellpadding='0' cellspacing='0' width='100%'>\n<tr><td nowrap='nowrap' class='tdLeftStyle'><table cellpadding='0' cellspacing='0'><tr><td nowrap='nowrap'><span  class='groupTitleBarTitleStyleExpanded' >" + l_sectionTitle + "</span></td><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr></tr></table></td>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzOldAutoPopulateBB","tdRightStyle");}
tools.appendString("</tr></table></td><td nowrap='nowrap' class='groupTitleBarRightExpanded'>&nbsp;</td></tr></table>");

	 /***Grid HeaderElements: End ***/

}
public void pzLayout_2() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxIsAssocManyKeyList","IsAssocManyKeyList", "layout", "visible" )) {pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_2(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_2();
}
pzLayoutBodyWrapper_5();
 LayoutWrapperTableEnd_1(); }
}
}
public void pzLayoutBodyWrapper_4() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " sectionBodyContainerSubHead'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
layoutBody_1();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
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
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__3(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
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
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ApplyTo", "pyClassName")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Property")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Width", "200")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "FieldType", "PROPERTY")) {
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


public void field_OpenRuleAdvanced_1() { 
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__3(pageContext, ".pyAssocReferenceKey", "input", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void 
labelIncludeInCell_1(String labelForAttribute,String pageName,String propertyName, String accessKey,boolean bRuntimeAccesskey,String labelValue,boolean bLocalize,boolean isRequired,String sLabelFormat,boolean bJSRCompliance) {
if(pega_procom_harness.IsParam(labelValue)) {String paramName = labelValue.substring(labelValue.indexOf(".")+1);String paramValue = tools.getParamValueCSF(paramName);if(bLocalize){paramValue = tools.getLocalizedTextForParameterizedString("pyCaption",paramValue);}tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
}if(isRequired && bJSRCompliance){
tools.appendString("<span>*</span>");
}
String rlIndex=tools.getParamValueCSF("pega_RLindex");
tools.appendString("<label  ");
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
	tools.appendString("<table role='presentation'  cellpadding='0' cellspacing='0' ID=''>");
	
	/*Row Begin*/
	tools.appendString("\n\t\t\t\t\t\t\t<tr>");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)"),"  ",pzSection.getCustomStyle(false,"","dataLabelRead",pzSection.getLabelStyle()), "width:220px;width:220px;",false," o2&& wxIsAssocUseAdvancedOptions o2== rx.pyAssocUseReferenceKey cqInstanceHandle","IsAssocUseAdvancedOptions && .pyAssocUseReferenceKey == \'InstanceHandle\'");if(pzAuto.handleEvaluateWhen(" o2&& wxIsAssocUseAdvancedOptions o2== rx.pyAssocUseReferenceKey cqInstanceHandle","IsAssocUseAdvancedOptions && .pyAssocUseReferenceKey == \'InstanceHandle\'", "cell", "visible" )) {labelIncludeInCell_1("","","","",false,"Get handle of auto-populate instance from:",true,false,"Standard",false);
	}
	 pzCell.endCell("td");
	
	 pzCell.beginCellWhen("td",pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyAssocReferenceKey",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)"),"  ",pzSection.getCustomStyle(false,"","dataValueRead RV1","dataValueWrite RV1"), "",false," o2&& wxIsAssocUseAdvancedOptions o2== rx.pyAssocUseReferenceKey cqInstanceHandle","IsAssocUseAdvancedOptions && .pyAssocUseReferenceKey == \'InstanceHandle\'");if(pzAuto.handleEvaluateWhen(" o2&& wxIsAssocUseAdvancedOptions o2== rx.pyAssocUseReferenceKey cqInstanceHandle","IsAssocUseAdvancedOptions && .pyAssocUseReferenceKey == \'InstanceHandle\'", "cell", "visible" )) {tools.putSaveValue("parentLayouttype","");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")) {field_OpenRuleAdvanced_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();}
	 pzCell.endCell("td");
	tools.appendString("\n\t\t\t\t\t\t\t</tr>");
	/*Row end*/
tools.appendString("\n\t\t\t\t\t\t\t</table>");
 } 
public void pzHeaderCellContent_1() {
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzOldAutoPopulateB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'FREEFORM','pgRef':'.pySections(1)'}") + "class='groupBoxStyle' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionpzOldAutoPopulateB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\"><tr><td>");
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
l_sectionTitle=tools.getLocalizedTextForParameterizedString("pyCaption","Auto-populate using instance handle from parent page");
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
String expandCollapseText="";
expandCollapseText=tools.getLocalizedTextForString("pyWorkPage.pyActionPrompt","Click to collapse");
tools.appendString("\t\t\t<table cellspacing='0' cellpadding='0' width='100%' id='RULE_KEY' node_type='HEADER'  class='titleBarBorderExpanded'  tabIndex='0' aria-label='" + l_sectionTitle + "'section_index='1'>\t\t\t\t<tr><td nowrap='nowrap' class='groupTitleBarNoExpand'><span class='groupTitleBarIconSPANNoExpand'></span></td><td nowrap='nowrap' class='groupTitleBarBackgroundExpanded'>\t<table cellpadding='0' cellspacing='0' width='100%'>\n<tr><td nowrap='nowrap' class='tdLeftStyle'><table cellpadding='0' cellspacing='0'><tr><td nowrap='nowrap'><span  class='groupTitleBarTitleStyleExpanded' >" + l_sectionTitle + "</span></td><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr></tr></table></td>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionpzOldAutoPopulateB","tdRightStyle");}
tools.appendString("</tr></table></td><td nowrap='nowrap' class='groupTitleBarRightExpanded'>&nbsp;</td></tr></table>");

	 /***Grid HeaderElements: End ***/

}
public void LayoutWrapperTableEnd_1() {
tools.appendString("</td></tr></table>");
}
public void pzLayout_1() {
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxIsAssocUseInstanceHandle","IsAssocUseInstanceHandle", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
pzLayoutBodyWrapper_4();
 LayoutWrapperTableEnd_1(); }
}
}
public void pzLayoutBodyWrapper_3() {

tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_2() {
try {
tools.appendString("  ");
	if (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("partialTrigger"), "appendTo.pyAssocReferenceOneKeyList3"))) {
tools.appendString(" ");

 tools.putParamValue("partialRefresh", "false");
 if(tools instanceof StreamBuilderToolKit) {
 ClipboardProperty pageListProp = tools.getProperty(".pyAssocReferenceOneKeyList");
 ClipboardProperty pagePropInList = pageListProp.getPropertyValue(Integer.parseInt(tools.getParamValue("strIndexInList")));
 ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);
 tools.putParamValue("strIndexInList", pageListProp.size());
 }

tools.appendString("<table> ");
/* pega:withEmbedded */
com.pega.pegarules.jsptags.WithEmbeddedTag _jspx_th_pega_withEmbedded__2 = (com.pega.pegarules.jsptags.WithEmbeddedTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithEmbeddedTag.class);
_jspx_th_pega_withEmbedded__2.setPageContext(pageContext);
_jspx_th_pega_withEmbedded__2.setParent(mParentTag);
_jspx_th_pega_withEmbedded__2.setName("$this");
int _jspx_eval_pega_withEmbedded__2 = _jspx_th_pega_withEmbedded__2.doStartTag();
if (_jspx_eval_pega_withEmbedded__2 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_4 = mParentTag;
mParentTag = _jspx_th_pega_withEmbedded__2;
tools.appendString(" ");
tools.putParamValue("expandRL","true");
tools.appendString(" ");
tools.putSaveValue("index",  String.valueOf(tools.getActive().indexOf()) );
tools.appendString(" ");
tools.putParamValue("index",String.valueOf(tools.getActive().indexOf()));
tools.appendString(" <tr hPref = '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
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
 repeatingDataCell_4(); 
 repeatingDataCell_5(); 
 repeatingDataCell_6(); 
 tools.putParamValue("pega_RLindex",""); 
tools.appendString("  </tr> ");
tools.putParamValue("expandRL","false");
tools.appendString(" ");
mParentTag = prevParentTag_4;
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
tools.appendString("</table>");
	}
tools.appendString(" ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
tools.putSaveValue("rowClass","");
}
public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(3).pySectionBody(1).pyTable.pyRows(2).pyCells(3)")); tools.appendString("style='");
	tools.appendString("width:67px;");tools.appendString("'class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString(" ");
	tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingDataCell_5() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyKeyValue", ".pySections(3).pySectionBody(1).pyTable.pyRows(2).pyCells(2)")); tools.appendString("style='");
	tools.appendString("");tools.appendString("'class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString(" ");
	tools.appendString(pzSection.getCustomStyle(false,"","dataValueRead RVF","dataValueWrite RVF"));tools.appendString(" '>");
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
pegaReferenceTag_3() {
try {

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__2 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__2.setPageContext(pageContext);
_jspx_th_pega_reference__2.setParent(mParentTag);
_jspx_th_pega_reference__2.setName(".pyKeyName");
_jspx_th_pega_reference__2.setMode("display");
_jspx_th_pega_reference__2.setFormat("Default");
int _jspx_eval_pega_reference__2 = _jspx_th_pega_reference__2.doStartTag();
if (_jspx_eval_pega_reference__2 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_3 = mParentTag;
mParentTag = _jspx_th_pega_reference__2;
tools.putParamValue("bLocalize","true");
mParentTag = prevParentTag_3;
		int evalDoAfterBody = _jspx_th_pega_reference__2.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference__2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__2);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_4() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("Default",".pyKeyName", ".pySections(3).pySectionBody(1).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("");getInlineStyle_1(); tools.appendString("");tools.appendString("'class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString(" ");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	
				pegaReferenceTag_3();
				hiddenPropParamStringMethod_1();
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
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
 */private boolean _jspx_meth_pega_reference__2(PageContext aPageContext, java.lang.String aName) throws Throwable {
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
	if (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("partialTrigger"), "appendTo.pyAssocReferenceManyKeyList2"))) {
tools.appendString(" ");

 tools.putParamValue("partialRefresh", "false");
 if(tools instanceof StreamBuilderToolKit) {
 ClipboardProperty pageListProp = tools.getProperty(".pyAssocReferenceManyKeyList");
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
final Tag prevParentTag_2 = mParentTag;
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
tools.appendString(".tagName!='BUTTON')AppendToList('.pyAssocReferenceManyKeyList','Embed-ReferenceKeys',this,'");
out.print( tools.getPrimaryPage().getName() );
tools.appendString("','', event, 'true')\" ");
	}
tools.appendString(" id='");
out.print( ".pyAssocReferenceManyKeyList" + tools.getSaveValue("index") );
tools.appendString("' hPref = '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
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
mParentTag = prevParentTag_2;
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
public void repeatingDataCell_3() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(1).pyTable.pyRows(2).pyCells(3)")); tools.appendString("style='");
	tools.appendString("width:30px;");tools.appendString("'class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString(" ");
	tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
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
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ApplyTo", "pyClassName")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
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
pegaReferenceTag_2() {
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyKeyValue", "input", "OpenRuleAdvanced")) {
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
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyKeyValue", ".pySections(2).pySectionBody(1).pyTable.pyRows(2).pyCells(2)")); tools.appendString("style='");
	tools.appendString("");tools.appendString("'class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString(" ");
	tools.appendString(pzSection.getCustomStyle(false,"","dataValueRead RVF","dataValueWrite RVF"));tools.appendString(" '>");
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
public void 
pegaReferenceTag_1() {
try {

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference__1 = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference__1.setPageContext(pageContext);
_jspx_th_pega_reference__1.setParent(mParentTag);
_jspx_th_pega_reference__1.setName(".pyKeyName");
_jspx_th_pega_reference__1.setMode("display");
_jspx_th_pega_reference__1.setFormat("Default");
int _jspx_eval_pega_reference__1 = _jspx_th_pega_reference__1.doStartTag();
if (_jspx_eval_pega_reference__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_1 = mParentTag;
mParentTag = _jspx_th_pega_reference__1;
tools.putParamValue("bLocalize","true");
mParentTag = prevParentTag_1;
		int evalDoAfterBody = _jspx_th_pega_reference__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference__1);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void 
getInlineStyle_1() {
try {
tools.appendString("text-align:center;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void repeatingDataCell_1() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("Default",".pyKeyName", ".pySections(2).pySectionBody(1).pyTable.pyRows(2).pyCells(1)")); tools.appendString("style='");
	tools.appendString("");getInlineStyle_1(); tools.appendString("");tools.appendString("'class='");
	tools.appendString(tools.getSaveValue("rowClass"));
	tools.appendString(" ");
	tools.appendString(pzSection.getCustomStyle(true,"","dataValueRead",""));tools.appendString(" '>");
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
	oPropDefinitions_1.put("Rule-Obj-Property.pyAssocReferenceKey", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyAssocReferenceKey", "sTN", false, true, "Default", false));
	oPropDefinitions_1.put("Rule-Obj-Property.pyAssocDeclareTemplate", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyAssocDeclareTemplate", "sTN", false, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Rule-Obj-Property");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-OBJ-PROPERTY PZOLDAUTOPOPULATE #20180713T135658.199 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-SystemArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzOldAutoPopulate");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-OBJ-PROPERTY PZOLDAUTOPOPULATE #20180713T135658.199 GMT", "Rule-Obj-Property pzOldAutoPopulate", "Pega-SystemArchitect", "08-01-01", "20180713T135658.199 GMT");
}
