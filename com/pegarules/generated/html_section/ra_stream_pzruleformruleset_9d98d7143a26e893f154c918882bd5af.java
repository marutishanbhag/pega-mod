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
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream RULE-!PZRULEFORMRULESET.
 */
public class ra_stream_pzruleformruleset_9d98d7143a26e893f154c918882bd5af extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzRuleFormRuleset.Rule_Obj_Flow.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 156871751;
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
	public ra_stream_pzruleformruleset_9d98d7143a26e893f154c918882bd5af(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "6d9aedba0efb94d6c71f0435310b2e812ecee20d";
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
/* Instance RULE-HTML-SECTION RULE- PZRULEFORMRULESET #20180713T135302.700 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "6d9aedba0efb94d6c71f0435310b2e812ecee20d";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzRuleFormRuleset",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE- PZRULEFORMRULESET #20180713T135302.700 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE- PZRULEFORMRULESET #20180713T135302.700 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
final Map prevPropDefs_4 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_4);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_4);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_4();

}
}
} catch (Throwable thr) {
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_4);
	mStreamResponse.setJspBaseClass(prevClass_4);
	pz_CurrentRuleKey = prevRuleKey_4;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION RULE- PZRULEFORMRULESET #20180713T135302.700 GMT */
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
	"Rule-HTML-Section:PZRULEFORMRULESET", 
	"Rule-Obj-Property:PXINSTANCELOCKEDRULESET", 
	"Rule-Obj-Property:PYRULESET", 
	"Rule-HTML-Property:PZOPENRULESETVERSION", 
	"Rule-HTML-Property:PXLPOPENRULE", 
	"Rule-HTML-Property:PZRULEOPENER"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZRULEFORMRULESET","Rule-HTML-Section","RULE-",false,"","Pega-Desktop","08-01-01","RULE-HTML-SECTION RULE- PZRULEFORMRULESET #20180713T135302.700 GMT","!PZRULEFORMRULESET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",156871751), 
		new DependentRuleInfo("PXINSTANCELOCKEDRULESET","Rule-Obj-Property","RULE-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESET #20180713T131307.825 GMT","!PXINSTANCELOCKEDRULESET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYRULESET","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYRULESET #20180713T131156.473 GMT","!PYRULESET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PZOPENRULESETVERSION","Rule-HTML-Property","",false,"","Pega-Desktop","08-01-01","RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT","PZOPENRULESETVERSION",true,false,"ABSOLUTE_CLASSLESS",849422873), 
		new DependentRuleInfo("PXLPOPENRULE","Rule-HTML-Property","",false,"","Pega-LP","08-01-01","RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT","PXLPOPENRULE",true,false,"ABSOLUTE_CLASSLESS",-1708729460), 
		new DependentRuleInfo("PZRULEOPENER","Rule-HTML-Property","",false,"","Pega-Desktop","08-06-01","RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT","PZRULEOPENER",true,false,"ABSOLUTE_CLASSLESS",1578879712)
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
//	RULE-HTML-SECTION RULE- PZRULEFORMRULESET #20180713T135302.700 GMT:20180713T135302.700 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYRULESET #20180713T131156.473 GMT:20180713T131156.473 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYRULESET #20180713T131156.473 GMT:20180713T131156.473 GMT
//	RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT:20180713T135129.748 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT:20180713T142452.409 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT:20201127T105750.471 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYRULESET #20180713T131156.473 GMT:20180713T131156.473 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYRULESET #20180713T131156.473 GMT:20180713T131156.473 GMT
//	RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT:20180713T135129.748 GMT
//	RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESET #20180713T131307.825 GMT:20180713T131307.825 GMT
//	RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESET #20180713T131307.825 GMT:20180713T131307.825 GMT
//	RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT:20180713T135129.748 GMT
//	RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESET #20180713T131307.825 GMT:20180713T131307.825 GMT
//	RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESET #20180713T131307.825 GMT:20180713T131307.825 GMT
//	RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT:20180713T135129.748 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(
//	simpleLayout_2(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T133337.901 GMT:20180713T133337.901 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
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
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
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
		return "ca846d8a6c1243a874775f34899a6e89";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-";
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
  pzSection.beginSection("pzRuleFormRuleset",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzRuleFormRuleset','insKey':'RULE-HTML-SECTION RULE- PZRULEFORMRULESET #20180713T135302.700 GMT','sectionType':'standard'}");
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
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_2() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='2' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void field_pzOpenRuleSetVersion_4() { 
try {
final ParameterPage params_4 = new ParameterPage();
params_4.putString("captionVersionProperty", "pxInstanceLockedRuleSetVersion");
params_4.putString("ellipsis", "0");
params_4.putString("captionRuleSetProperty", "pxInstanceLockedRuleSet");
params_4.putString("disableBranchLink", "0");
params_4.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_4.putString("bLocalize", "false");
	final ClipboardProperty currentProperty_4 = tools.getProperty(".pxInstanceLockedRuleSet");
	if (currentProperty_4 != null && currentProperty_4.getParentPage().getClassName().equals("Rule-Obj-Flow")) {
		final ClipboardProperty propPrevActive_4 = tools.putActive(currentProperty_4);
		final boolean prevInputMode_4 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_4 = ((PegaAPI) tools).pushStackFrame( params_4, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzOpenRuleSetVersion" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Flow_pzOpenRuleSetVersion();
		} finally {
			pega.popStackFrame(stack_4, false);
			tools.putActive(propPrevActive_4);
		}
	} else {
if (_jspx_meth_pega_reference__2(pageContext, ".pxInstanceLockedRuleSet", "display", "pzOpenRuleSetVersion")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
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
if (_jspx_meth_pega_param__1(pageContext, "captionVersionProperty", "pxInstanceLockedRuleSetVersion")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ellipsis", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "captionRuleSetProperty", "pxInstanceLockedRuleSet")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "disableBranchLink", "0")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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


public void field_pzOpenRuleSetVersion_3() { 
try {
final ParameterPage params_3 = new ParameterPage();
params_3.putString("captionVersionProperty", "pxInstanceLockedRuleSetVersion");
params_3.putString("ellipsis", "0");
params_3.putString("captionRuleSetProperty", "pxInstanceLockedRuleSet");
params_3.putString("disableBranchLink", "0");
params_3.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_3.putString("bLocalize", "false");
	final ClipboardProperty currentProperty_3 = tools.getProperty(".pxInstanceLockedRuleSet");
	if (currentProperty_3 != null && currentProperty_3.getParentPage().getClassName().equals("Rule-Obj-Flow")) {
		final ClipboardProperty propPrevActive_3 = tools.putActive(currentProperty_3);
		final boolean prevInputMode_3 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_3 = ((PegaAPI) tools).pushStackFrame( params_3, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzOpenRuleSetVersion" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Flow_pzOpenRuleSetVersion();
		} finally {
			pega.popStackFrame(stack_3, false);
			tools.putActive(propPrevActive_3);
		}
	} else {
if (_jspx_meth_pega_reference__2(pageContext, ".pxInstanceLockedRuleSet", "display", "pzOpenRuleSetVersion")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pzOpenRuleSetVersion",".pxInstanceLockedRuleSet",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   primary-navigation-links dataValueRead flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_9")) {	field_pzOpenRuleSetVersion_3();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pyCustomRequireFormat= "pyRequired";
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("localize","false");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2015013109542709953901-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pzOpenRuleSetVersion");
	pgCells.put("forLabel",".pxInstanceLockedRuleSet");
	pgCells.put("pyAutoHTML","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","primary-navigation-links");
	pgCells.put("customRWStyles","primary-navigation-links");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("pyReadOnlyWhenCond","readonlyAlways");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pzOpenRuleSetVersion",".pxInstanceLockedRuleSet",".pySections(2).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_12")) {	field_pzOpenRuleSetVersion_4();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();labelName = "";
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
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormRulesetBB","",false);
}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash8 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash8 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash8 != null && !"".equals(spxUniqueStreamHash8)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash8,pxUniqueStreamHash+"_8");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + " class='" + "flex  content  layout-content-inline_labels_left content-inline_labels_left " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash8 != null && !"".equals(spxUniqueStreamHash8)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_8");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","inline_labels_left");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("clear","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_2(index);
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
	String paramName = "EXPANDEDSubSectionpzRuleFormRulesetBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(2)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","2");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxpxIsCheckOut", pxUniqueStreamHash+"_13");metadataPage.put("lMode","Flexbox");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_13");
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
if(pzAuto.handleEvaluateWhen(" wxpxIsCheckOut","pxIsCheckOut", "layout", "visible" )) {pzSetExpandParam_2();
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
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void field_pzOpenRuleSetVersion_2() { 
try {
final ParameterPage params_2 = new ParameterPage();
params_2.putString("captionVersionProperty", "pyRuleSetVersion");
params_2.putString("ellipsis", "0");
params_2.putString("captionRuleSetProperty", "pyRuleSet");
params_2.putString("disableBranchLink", "0");
params_2.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_2.putString("bLocalize", "false");
	final ClipboardProperty currentProperty_2 = tools.getProperty(".pyRuleSet");
	if (currentProperty_2 != null && currentProperty_2.getParentPage().getClassName().equals("Rule-Obj-Flow")) {
		final ClipboardProperty propPrevActive_2 = tools.putActive(currentProperty_2);
		final boolean prevInputMode_2 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_2 = ((PegaAPI) tools).pushStackFrame( params_2, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzOpenRuleSetVersion" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Flow_pzOpenRuleSetVersion();
		} finally {
			pega.popStackFrame(stack_2, false);
			tools.putActive(propPrevActive_2);
		}
	} else {
if (_jspx_meth_pega_reference__1(pageContext, ".pyRuleSet", "display", "pzOpenRuleSetVersion")) {
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
if (_jspx_meth_pega_param__1(pageContext, "captionVersionProperty", "pyRuleSetVersion")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ellipsis", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "captionRuleSetProperty", "pyRuleSet")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "disableBranchLink", "0")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "false")) {
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
private static final String[] showMeParams_1 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Final", "", "Pega-LP", "08-01-01", "", "pxLPOpenRule", "", "RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT" };
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
private void performStream_1() throws Throwable {
 	
	if (tools.getParamValue("ellipsis").equals("-1")) 
		tools.putParamValue("ellipsis", "true"); 

tools.appendString(" ");

	String paramCaption = tools.getParamValue("caption");
	//tools.putParamValue("pzButtonVisible", true);
	// Expect 'captionType' to be either 'Property', 'String', 'Image', or 'None'
	String paramCaptionType = tools.getParamValue("captionType");
	if(!(paramCaptionType.equalsIgnoreCase("Property") || paramCaptionType.equalsIgnoreCase("String") || paramCaptionType.equalsIgnoreCase("Image")))
		paramCaptionType = "";
	String displayString = "";
	String toolTipString = tools.getParamValue("captionTooltip").trim();
	if(toolTipString != null && toolTipString != "" && toolTipString.startsWith(".")){
				toolTipString = tools.getProperty(toolTipString).getStringValue();
	}
	if (paramCaptionType.equalsIgnoreCase("String")) {
		  if(!paramCaption.contains("<script>")) displayString = paramCaption;
	                      else displayString =  StringUtils.crossScriptingFilter(paramCaption);
		 } else if (paramCaptionType.equalsIgnoreCase("Property")) {			
			if(paramCaption != null && paramCaption != ""){
				displayString = tools.getProperty(paramCaption).getStringValue();
			}	
		} else if (paramCaptionType.equalsIgnoreCase("Image")) {
		if(paramCaption.equals("")) {
			displayString = "<img style= 'vertical-align: middle;' src='webwb/pzRuleOpenerButton.png' />";
		} else {
			displayString = "<img style= 'vertical-align: middle;' src='" + StringUtils.crossScriptingFilter(paramCaption) + "' />";
		}
	} else if(paramCaptionType.equals("") && paramCaption.equals("")){
		displayString = tools.getActiveValue();
		displayString = StringUtils.crossScriptingFilter(displayString);
	}
	String paramCaptionStyle = tools.getParamValue("captionStyle");
	String paramNoValueText = StringUtils.crossScriptingFilter(tools.getParamValue("noValueText"));

	boolean useNoValueText = false;
	useNoValueText = (displayString.equals("")) && (paramNoValueText != null) && (!paramNoValueText.equals(""));
	tools.putParamValue("pzHideButton", displayString.equals(""));


tools.appendString(" ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");

			// Default to the HTML Property 'Default'
			
			if(tools.getParamValue("inputModeHtmlProperty").equals(""))
				tools.putParamValue("inputModeHtmlProperty", "Default");

			// Prepare the parameters for the custom input property
			// They should be in the format a=b,c=d,e=f where a, c and e are 
			// keys and b, d and f are their associated values.
			
			String arrParamPairs[] = null;
			try {
				String sParams = tools.getParamValue("inputModeParams");
				if(!sParams.equals("")) {
					// Save the array of 'key=value' pairs.
					arrParamPairs = sParams.split(",");
					
					// Loop through the 'key=value' pairs.
					for(int i = 0; i < arrParamPairs.length; i++) {
						// Get the key and value
						String arrKeyValue[] = arrParamPairs[i].split("=");
						try {
							// Add the param to the parampage
							tools.putParamValue(arrKeyValue[0], arrKeyValue[1]);
						}
						catch (Exception ex) {}
					}
				}
			}
			catch (Exception ex) {
				//TODO: Error Message
				tools.appendString("<script>alert('There was a problem using the specified parameters.');</script>");
			}
		
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("param.inputModeHtmlProperty", null, null, "Rule-Html-Property", null);
tools.appendString(" ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || useNoValueText)) {
tools.appendString(" <div ");
 
				String sNoValueStyle = StringUtils.crossScriptingFilter(tools.getParamValue("noValueStyle"));
				if(sNoValueStyle.indexOf(":") == -1)
					tools.appendString(" class=\""+sNoValueStyle+"\" style=\"display:inline;\" ");
				else
					tools.appendString(" style=\""+sNoValueStyle+";display:inline;\" ");
			
tools.appendString(" title=\"");
out.print(tools.getLocalizedTextForString("pxRequestor.pyCaption", "\t[@baseclass.pyCaption]" + StringUtils.crossScriptingFilter(tools.getParamValue("noValueTooltip"))) );
tools.appendString("\" > ");
out.print(paramNoValueText);
tools.appendString(" </div> ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
tools.appendString(" ");

			if(displayString==null || displayString.equals("") || displayString.equals(" ")) 
				displayString = "&nbsp;";
		
tools.appendString(" ");
	if (when_2("ellipsis", "true")) {
tools.appendString(" <table style=\"table-layout:fixed;width:100%;\"><tr><td class=\"ellipsis\" style=\"background-color:transparent;border:none\"> ");
	}
tools.appendString(" ");
	boolean foundChoice_5 = false;
tools.appendString(" ");
tools.appendString(" ");
if (!foundChoice_5 && (pega.isPreviewMode() || tools.getParamValue("showLabelWhenMissingKeys").equals("-1") && tools.getParamValue("openInsKeyProperty").equals("") && tools.getParamValue("openUrl").equals("") && (tools.getParamValue("openObjClass").equals("") || (tools.getParamValue("openRuleName").equals("") && tools.getParamValue("openKeys").equals(""))))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-value"
 */
if (_jspx_meth_p_r__1(pageContext, "$this-value")) {
	return;
}
tools.appendString(" ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5) {
tools.appendString(" <a href=\"#\" onclick=\" ");

							ClipboardPage cpActivePage = tools.getActive().getParentPage();
							String sErrorMessage = "";
							boolean bOpenerAdded = false;
							boolean hasException = false;
							
							String sOpenInsKeyProperty = tools.getParamValue("openInsKeyProperty");
							String sOpenObjClass = tools.getParamValue("openObjClass");
							String sOpenUrl = tools.getParamValue("openUrl");
							// Check for the pzInsKey property.  If the param exists, get the specified property.

							if(!sOpenInsKeyProperty.equals("")) {
								try {
									if(sOpenInsKeyProperty.indexOf(" ") == -1)
										sOpenInsKeyProperty = cpActivePage.getString(sOpenInsKeyProperty);
										
									if(!sOpenInsKeyProperty.equals("")) {
										tools.appendString("openRule('"+StringUtils.crossScriptingFilter(sOpenInsKeyProperty)+"',true, false);return false;");
										bOpenerAdded = true;
									} else {
										sErrorMessage = "Unable to open by InsKey: ''";
									}
								} catch (Exception ex) { 	
									hasException = true;
									sErrorMessage = "Attempting to open by InsKey '"+sOpenInsKeyProperty+"':" + ex.toString();
								}
							} else if(!sOpenObjClass.equals("")) {
								try {
									if(sOpenObjClass.indexOf(".") != -1)
										sOpenObjClass = cpActivePage.getString(sOpenObjClass);
									
									String sOpenKeys = tools.getParamValue("openKeys");
									if(!sOpenKeys.equals("")){
										String arrOpenKeys[] = sOpenKeys.split(",");
										String sNewRuleKeys = "";
										
										for(int i=0; i<arrOpenKeys.length; i++){	// For each key specified
											String sKey = "", sValue = "";				// Set up params
											if(arrOpenKeys[i].indexOf("=") != -1) {		// If it is a key=value pair
												String arrPair[] = arrOpenKeys[i].split("=");
												sKey = arrPair[0]; sValue = arrPair[1];	// Get the key and value;
											} else {		// Otherwise, use the param as the key and value
												sKey = sValue = arrOpenKeys[i];
											}
											if(sValue.equals("$this-value")) {
												sValue = tools.getActive().getStringValue();
											} else if(sValue.indexOf(".") == 0) {
												sValue = cpActivePage.getString(sValue);
											} else if(sValue.indexOf(".") > 0) {
												ClipboardProperty cpValue = tools.getIfPresent(sValue);
												if(cpValue != null) sValue = cpValue.toString();
												else sValue = "";
											}
											if(sKey.indexOf(".") != -1)
												sKey = pega_rules_string.whatComesAfterLast(sKey, '.');
											sNewRuleKeys += "&" + sKey + "=" + sValue;
										}
										tools.appendString("openRuleByKeys('"+StringUtils.crossScriptingFilter(sOpenObjClass)+"','"+StringUtils.crossScriptingFilter(sNewRuleKeys)+"');return false;");
										bOpenerAdded = true;

									} else {
										String sOpenRuleName= tools.getParamValue("openRuleName");
										try {
											if(sOpenRuleName.startsWith(".")){
												sOpenRuleName = cpActivePage.getString(sOpenRuleName);
											} else if(sOpenRuleName.indexOf(".") >= 0) {
												sOpenRuleName = tools.getProperty(sOpenRuleName).getStringValue();
											} 
										} catch (Exception ex2) {} // If we can't resolve the property, it might just be a string with a '.' in it.  Give it a shot.
										tools.appendString("openRuleByClassAndName('"+(StringUtils.crossScriptingFilter(pega_rules_utilities.getJSEncodedValue(sOpenRuleName)))+"','"+StringUtils.crossScriptingFilter(sOpenObjClass)+"');return false;");
										bOpenerAdded = true;
									}
								} catch (Exception ex) {
									hasException = true;
									sErrorMessage = ex.toString();
								}
							} else if(!sOpenUrl.equals("")){
								try {
									String sOpenUrlWindowName = tools.getParamValue("openUrlWindowName");
									String sOpenUrlParams = tools.getParamValue("openUrlParams");

									tools.appendString("openUrlInWindow('" + StringUtils.crossScriptingFilter(sOpenUrl) + "','" + StringUtils.crossScriptingFilter(sOpenUrlWindowName) + "','" + StringUtils.crossScriptingFilter(sOpenUrlParams) +"');return false;");
									bOpenerAdded = true;
								}catch (Exception ex) {
									hasException = true;
									sErrorMessage = ex.toString();
								}

							} else {
								sErrorMessage = "A rule link could not be generated because incorrect (or insufficient) parameters were specified. Param page: " + tools.getParameterPage().toString();
							}
							if(sErrorMessage.equals("") && !bOpenerAdded) {
								sErrorMessage = "An unknown error has occured while displaying the rule opener.  Param page: " + tools.getParameterPage().toString();
							}


							tools.putParamValue("openButtonTooltip", tools.getParamValue("openButtonTooltip").replaceAll("\\\\t", "\t")); // Check for an overly escaped tab
						
tools.appendString("\" ");
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || !bOpenerAdded || !sErrorMessage.equals(""))) {
tools.appendString(" style= \"color:red\" title=\"There was a problem adding the rule opener: ");
out.print(sErrorMessage);
tools.appendString("\" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
tools.appendString(" ");
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || !paramCaptionStyle.equals(""))) {
tools.appendString(" ");
	boolean foundChoice_8 = false;
tools.appendString(" ");
if (!foundChoice_8 && (pega.isPreviewMode() || paramCaptionStyle.indexOf(":") >= 0)) {
tools.appendString(" style=\"");
out.print(paramCaptionStyle);
tools.appendString("\" ");

foundChoice_8 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_8) {
tools.appendString(" class=\"");
out.print(paramCaptionStyle);
tools.appendString("\" ");
}
tools.appendString("  ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7) {
tools.appendString(" class=\"custom_RuleOpener\" ");
}
tools.appendString("  ");
	boolean foundChoice_9 = false;
tools.appendString(" ");
if (!foundChoice_9 && (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("captionTooltip"), "")))) {
tools.appendString(" ");
	boolean foundChoice_10 = false;
tools.appendString(" ");
if (!foundChoice_10 && (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("captionTooltip"), "pxNoTooltip")))) {
tools.appendString(" title=\"");
out.print(tools.getLocalizedTextForString("pxRequestor.pyCaption", "\t[@baseclass.pyCaption]" + StringUtils.crossScriptingFilter(toolTipString.replaceAll("\\\\t", "\t"))));
tools.appendString("\" ");

foundChoice_10 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_10) {
tools.appendString(" title=\"\" ");
}
tools.appendString("  ");

foundChoice_9 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_9) {
tools.appendString(" title=\"");
out.print(displayString);
tools.appendString("\" ");
}
tools.appendString("  ");
}
tools.appendString("  ");
//title= "=tools.getLocalizedTextForString("pxRequestor.pyCaption", "\t[@baseclass.pyCaption]" + tools.getParamValue("openButtonTooltip")) "
tools.appendString(" >");
out.print(displayString);
tools.appendString("</a> ");
}
tools.appendString(" ");
	if (when_2("ellipsis", "true")) {
tools.appendString("</td></tr></table>");
	}
}
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "Internal");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "pzRuleOpener");
	oStreamProperties_3.put("pyRuleSetVersion", "08-06-01");
}
/**
 * Generates stream property_Rule_Obj_Flow_pzRuleOpener
 */
private void property_Rule_Obj_Flow_pzRuleOpener() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT	Pega-Desktop:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_3 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_3);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_3);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_3)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_3);
	mStreamResponse.setJspBaseClass(prevClass_3);
	pz_CurrentRuleKey = prevRuleKey_3;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_3,true);
}
/* end RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_Obj_Flow_pzRuleOpener();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_2() throws Throwable {
/* Include stream RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT */
include_1();

}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "");
	oStreamProperties_2.put("pyClassName", "");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-LP");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pxLPOpenRule");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Rule_Obj_Flow_pxLPOpenRule
 */
private void property_Rule_Obj_Flow_pxLPOpenRule() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT	Pega-LP:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_2 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_2);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_2);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_2)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_2();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_2,true);
}
/* end RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_Obj_Flow_pxLPOpenRule();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getProperty(aParam1).getStringValue(), aParam2)));
}
private void performStream_3() throws Throwable {
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && when_1("pxRequestor.pyPegaDesignMode", "true")) {
tools.appendString(" Rule Opener for RuleSet and RSV ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");

	String sCaption 		= "";
	String sRuleSetName  	= "";
	String sRuleSetVersion 	= "";
	String sRuleSetBranch 	= "";
	String sBranchedRuleSet	= "";
	String sCaptionType	= StringUtils.crossScriptingFilter(tools.getParamValue("captionType"));
	String sEllipsis	= StringUtils.crossScriptingFilter(tools.getParamValue("ellipsis"));
	boolean bDisableBranchLink = tools.getParameterPage().getAsBoolean("disableBranchLink");
	boolean bDisplayOnly = tools.getParameterPage().getAsBoolean("displayOnly");
	try {
		// Get the parameters
		String captionRuleSetProperty = StringUtils.crossScriptingFilter(tools.getParamValue("captionRuleSetProperty"));
		String captionVersionProperty = StringUtils.crossScriptingFilter(tools.getParamValue("captionVersionProperty"));

		// Get the values
		if(sCaptionType.equalsIgnoreCase("string")) {
			sRuleSetName = captionRuleSetProperty;
			sRuleSetVersion = captionVersionProperty;
		} else {
			// If the ruleset name is blank, use the current value
			if(captionRuleSetProperty.equals("")) 
				sRuleSetName = StringUtils.crossScriptingFilter(tools.getActiveValue());
			else
				sRuleSetName = tools.getActive().getParentPage().getString(captionRuleSetProperty);
			
			if(!captionVersionProperty.equals("")) 
				sRuleSetVersion = tools.getActive().getParentPage().getString(captionVersionProperty);
		}
		
			
	} catch (Exception e) { sRuleSetName = e.toString(); }
	

	if(sRuleSetName.indexOf("_Branch_") != -1) {
		String[] ruleSetNameArray = sRuleSetName.split("_Branch_");
		if( ruleSetNameArray.length == 2 ) {
			sBranchedRuleSet = ruleSetNameArray[0];
			sRuleSetBranch = ruleSetNameArray[1];
		}
	}

tools.appendString(" ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || (sRuleSetBranch.length() != 0))) {
tools.appendString(" ");

			/* 
			 * This is the second rule opener for the branch 
			 */
			sCaption = sBranchedRuleSet + " [Branch: " + sRuleSetBranch + "]";
			tools.putParamValue("caption", sCaption );
			//tools.putParamValue("openKeys", "pyRuleSetName="+sRuleSetName);
			tools.putParamValue("openObjClass", "Rule-RuleSet-Name");
			tools.putParamValue("captionTooltip", "LPOpenLabel\\t"+sCaption);
			tools.putParamValue("captionType", "String");
			tools.putParamValue("ellipsis", sEllipsis);
			
			tools.putParamValue("openRuleName",sRuleSetName);

		
tools.appendString(" ");
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || bDisplayOnly)) {
tools.appendString(" ");
out.print(sCaption );
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT */
include_2();

tools.appendString(" ");
}
tools.appendString("  ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || sRuleSetName.indexOf('@') == -1)) {
tools.appendString(" ");

			sCaption = sRuleSetName;
			if (!"".equals(sRuleSetVersion))  {
				if(!StringUtils.crossScriptingFilter(tools.getParamValue("versionSuffix")).equals("")) {
					sRuleSetVersion += "<span class=\""+StringUtils.crossScriptingFilter(tools.getParamValue("versionSuffixStyle"))+"\">" + StringUtils.crossScriptingFilter(tools.getParamValue("versionSuffix"))+ "</span>";
				}
				sCaption = sRuleSetName+":"+sRuleSetVersion;
			}
			tools.putParamValue("caption", sCaption);
			//tools.putParamValue("openKeys", "pyRuleSetName="+sRuleSetName);
			tools.putParamValue("openObjClass", "Rule-RuleSet-Name");
			tools.putParamValue("captionTooltip", "LPOpenLabel\\t"+sRuleSetName);
			tools.putParamValue("captionType", "String");
			//for BUG-48705
			tools.putParamValue("openRuleName",sRuleSetName);
		
tools.appendString(" ");
	boolean foundChoice_11 = false;
tools.appendString(" ");
if (!foundChoice_11 && (pega.isPreviewMode() || bDisplayOnly)) {
tools.appendString(" ");
out.print(sCaption);
tools.appendString(" ");

foundChoice_11 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_11) {
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT */
include_2();

tools.appendString(" ");
}
tools.appendString("  ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2) {
tools.appendString(" ");
out.print(sRuleSetName );
tools.appendString(" ");
}
tools.appendString("  ");

// Restore the caption type
tools.putParamValue("captionType", sCaptionType);
tools.putParamValue("ellipsis", sEllipsis);

tools.appendString(" ");
}
tools.appendString(" ");
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzOpenRuleSetVersion");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Rule_Obj_Flow_pzOpenRuleSetVersion
 */
private void property_Rule_Obj_Flow_pzOpenRuleSetVersion() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_3();

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
/* end RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT */
}
}


public void field_pzOpenRuleSetVersion_1() { 
try {
final ParameterPage params_1 = new ParameterPage();
params_1.putString("captionVersionProperty", "pyRuleSetVersion");
params_1.putString("ellipsis", "0");
params_1.putString("captionRuleSetProperty", "pyRuleSet");
params_1.putString("disableBranchLink", "0");
params_1.putString("AJAXTrackID", pega.getValue("param.AJAXTrackID"));
params_1.putString("bLocalize", "false");
	final ClipboardProperty currentProperty_1 = tools.getProperty(".pyRuleSet");
	if (currentProperty_1 != null && currentProperty_1.getParentPage().getClassName().equals("Rule-Obj-Flow")) {
		final ClipboardProperty propPrevActive_1 = tools.putActive(currentProperty_1);
		final boolean prevInputMode_1 = tools.useModeInput();
		pega.setEditable(false);
		pega.setModeInput(false);
		final PRStackFrame stack_1 = ((PegaAPI) tools).pushStackFrame( params_1, false, false, PRStackFrame.Type.APPEND_STREAM, "Rule-HTML-Property", "pzOpenRuleSetVersion" );
		try {
				pega.checkIfActivePropertyMissing();
property_Rule_Obj_Flow_pzOpenRuleSetVersion();
		} finally {
			pega.popStackFrame(stack_1, false);
			tools.putActive(propPrevActive_1);
		}
	} else {
if (_jspx_meth_pega_reference__1(pageContext, ".pyRuleSet", "display", "pzOpenRuleSetVersion")) {
	return;
}
	}} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
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


public int simpleLayoutCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pzOpenRuleSetVersion",".pyRuleSet",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   primary-navigation-links dataValueRead flex flex-row '  STRING_TYPE='field' RESERVE_SPACE='false'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")) {	field_pzOpenRuleSetVersion_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString(pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
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
	pyCustomRequireFormat= "pyRequired";
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("localize","false");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2015013109542709941944-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pzOpenRuleSetVersion");
	pgCells.put("forLabel",".pyRuleSet");
	pgCells.put("pyAutoHTML","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","primary-navigation-links");
	pgCells.put("customRWStyles","primary-navigation-links");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("pyReadOnlyWhenCond","readonlyAlways");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pzOpenRuleSetVersion",".pyRuleSet",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")) {	field_pzOpenRuleSetVersion_2();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();labelName = "";
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
pzSection.getLayout().setExpandParam("SubSectionpzRuleFormRulesetB","",false);
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-inline_labels_left content-inline_labels_left " + "'  ");
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
		pg_dlmeta.put("format","inline_labels_left");
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
	String paramName = "EXPANDEDSubSectionpzRuleFormRulesetB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" o1! wxpxIsCheckOut", pxUniqueStreamHash+"_7");metadataPage.put("lMode","Flexbox");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_7");
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
if(pzAuto.handleEvaluateWhen(" o1! wxpxIsCheckOut","!pxIsCheckOut", "layout", "visible" )) {pzSetExpandParam_1();
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


private void performStream_4() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_4 = new HashMap();
static {
	oPropDefinitions_4.put("Rule-Obj-Flow.pyRuleSet", new LiteweightPropertyDefinition("Rule-Obj-Flow", "pyRuleSet", "sTN", false, true, "Default", false));
	oPropDefinitions_4.put("Rule-Obj-Flow.pxInstanceLockedRuleSet", new LiteweightPropertyDefinition("Rule-Obj-Flow", "pxInstanceLockedRuleSet", "sTY", true, true, "Default", false));
}
private static final Map oStreamProperties_4 = new HashMap();
static {
	oStreamProperties_4.put("pyRuleAvailable", "Final");
	oStreamProperties_4.put("pyCircumstanceDateProp", "");
	oStreamProperties_4.put("pyCircumstanceVal", "");
	oStreamProperties_4.put("pyMethodStatus", "Internal");
	oStreamProperties_4.put("pyClassName", "Rule-");
	oStreamProperties_4.put("pyCircumstanceProp", "");
	oStreamProperties_4.put("pzInsKey", "RULE-HTML-SECTION RULE- PZRULEFORMRULESET #20180713T135302.700 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "pzRuleFormRuleset");
	oStreamProperties_4.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT", "pzRuleOpener", "Pega-Desktop", "08-06-01", "20201127T105750.471 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE- PZRULEFORMRULESET #20180713T135302.700 GMT", "Rule- pzRuleFormRuleset", "Pega-Desktop", "08-01-01", "20180713T135302.700 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT", "pxLPOpenRule", "Pega-LP", "08-01-01", "20180713T142452.409 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT", "pzOpenRuleSetVersion", "Pega-Desktop", "08-01-01", "20180713T135129.748 GMT");
}
