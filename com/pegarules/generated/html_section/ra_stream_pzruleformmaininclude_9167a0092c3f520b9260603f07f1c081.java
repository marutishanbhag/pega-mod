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
import com.pega.pegarules.priv.runtime.IStaticContentRuntime;
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
 * Builds JSP stream @BASECLASS!PZRULEFORMMAININCLUDE.
 */
public class ra_stream_pzruleformmaininclude_9167a0092c3f520b9260603f07f1c081 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzRuleformMainInclude.Data_Admin_Operator_ID.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -791235598;
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
	public ra_stream_pzruleformmaininclude_9167a0092c3f520b9260603f07f1c081(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "f48181a19a12e8455e2c1347057c3edf6248f41a";
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
/* Instance RULE-HTML-SECTION @BASECLASS PZRULEFORMMAININCLUDE #20191020T020200.930 GMT	Pega-Desktop:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "f48181a19a12e8455e2c1347057c3edf6248f41a";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzRuleformMainInclude",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, true, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
pxIsNonTemplateStream = true;
pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_1");
/*
 * Begin RULE-HTML-SECTION @BASECLASS PZRULEFORMMAININCLUDE #20191020T020200.930 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PZRULEFORMMAININCLUDE #20191020T020200.930 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION @BASECLASS PZRULEFORMMAININCLUDE #20191020T020200.930 GMT */
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
	"Rule-File-Text:WEBWB!PZPEGA_DESKTOP_HIGHLIGHT!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_DESKTOP_RESIZABLEPANEL!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_DESKTOP_SEARCH!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_DESKTOP_RULEREFERENCES!CSS", 
	"Rule-File-Text:WEBWB!PZPEGA_DESKTOP_RULECOMPARE!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_RULEFORM_SLIDE_PANEL!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_VIEW_REFERENCES_UTILS!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_DESKTOP_RULECOMPARE!CSS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Section:PZRULEFORMMAININCLUDE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("WEBWB!PZPEGA_DESKTOP_HIGHLIGHT!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_HIGHLIGHT!JS #20201112T202205.619 GMT","WEBWB!PZPEGA_DESKTOP_HIGHLIGHT!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_DESKTOP_RESIZABLEPANEL!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_RESIZABLEPANEL!JS #20180713T135110.270 GMT","WEBWB!PZPEGA_DESKTOP_RESIZABLEPANEL!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_DESKTOP_SEARCH!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_SEARCH!JS #20180713T135110.299 GMT","WEBWB!PZPEGA_DESKTOP_SEARCH!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_DESKTOP_RULEREFERENCES!CSS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_RULEREFERENCES!CSS #20210127T192138.725 GMT","WEBWB!PZPEGA_DESKTOP_RULEREFERENCES!CSS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_DESKTOP_RULECOMPARE!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_RULECOMPARE!JS #20191230T103057.783 GMT","WEBWB!PZPEGA_DESKTOP_RULECOMPARE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_RULEFORM_SLIDE_PANEL!JS","Rule-File-Text","",false,"","Pega-UIDesign","","RULE-FILE-TEXT WEBWB PZPEGA_RULEFORM_SLIDE_PANEL!JS #20191020T020201.779 GMT","WEBWB!PZPEGA_RULEFORM_SLIDE_PANEL!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_VIEW_REFERENCES_UTILS!JS","Rule-File-Text","",false,"","Pega-UIDesign","","RULE-FILE-TEXT WEBWB PZPEGA_VIEW_REFERENCES_UTILS!JS #20210127T192136.356 GMT","WEBWB!PZPEGA_VIEW_REFERENCES_UTILS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_DESKTOP_RULECOMPARE!CSS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_RULECOMPARE!CSS #20190125T215550.642 GMT","WEBWB!PZPEGA_DESKTOP_RULECOMPARE!CSS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZRULEFORMMAININCLUDE","Rule-HTML-Section","@BASECLASS",false,"","Pega-Desktop","08-04-01","RULE-HTML-SECTION @BASECLASS PZRULEFORMMAININCLUDE #20191020T020200.930 GMT","!PZRULEFORMMAININCLUDE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-791235598)
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
//	RULE-HTML-SECTION @BASECLASS PZRULEFORMMAININCLUDE #20191020T020200.930 GMT:20191020T020200.930 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_RESIZABLEPANEL!JS #20180713T135110.270 GMT:20180713T135110.270 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_HIGHLIGHT!JS #20201112T202205.619 GMT:20201112T202205.619 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_SEARCH!JS #20180713T135110.299 GMT:20180803T232815.791 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_RULECOMPARE!JS #20191230T103057.783 GMT:20191230T103057.783 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_RULEFORM_SLIDE_PANEL!JS #20191020T020201.779 GMT:20191114T145347.081 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_VIEW_REFERENCES_UTILS!JS #20210127T192136.356 GMT:20210127T192136.356 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_RULECOMPARE!CSS #20190125T215550.642 GMT:20190125T215550.642 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_DESKTOP_RULEREFERENCES!CSS #20210127T192138.725 GMT:20210127T192138.725 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "8151d0e9e421ca2b2af93d0606ccd066";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__3(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString(" ");
	IStaticContentRuntime pzStatic__16 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__16.addFile("pzpega_desktop_rulereferences", "12320821766", "css");
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__2(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString(" ");
	IStaticContentRuntime pzStatic__14 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__14.addFile("pzpega_desktop_rulecompare", "12483084008", "css");
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
private boolean when_4() throws Throwable {
boolean whenResult_6 = pega.invokeWhen("pyRuleCompareEnabled", "", "");
return whenResult_6;
}
private boolean when_1() throws Throwable {
boolean whenResult_1 = pega.invokeWhen("pxInDesignMode", "", "");
return whenResult_1;
}
private boolean when_3() throws Throwable {
boolean whenResult_4 = pega.invokeWhen("pyRuleCompareEnabled", "", "");
return whenResult_4;
}
private boolean when_2() throws Throwable {
boolean whenResult_2 = pega.invokeWhen("pzIncludeSearchAndHighlightJS", "", "");
return whenResult_2;
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__1(PageContext aPageContext, java.lang.String aType, java.lang.String aApp) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString(" ");
	IStaticContentRuntime pzStatic__2 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__2.addFile("pzpega_desktop_resizablepanel", "11178257955", "js");
tools.appendString(" ");
boolean whenResult_3 = pega.invokeWhen("pzIncludeSearchAndHighlightJS", "", "");
	if (whenResult_3) {
tools.appendString(" ");
	IStaticContentRuntime pzStatic__4 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__4.addFile("pzpega_desktop_highlight", "166609256", "js");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__6 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__6.addFile("pzpega_desktop_search", "12380390789", "js");
tools.appendString(" ");
	}
tools.appendString(" ");
boolean whenResult_5 = pega.invokeWhen("pyRuleCompareEnabled", "", "");
	if (whenResult_5) {
tools.appendString(" ");
	IStaticContentRuntime pzStatic__8 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__8.addFile("pzpega_desktop_rulecompare", "11096646825", "js");
tools.appendString(" ");
	}
tools.appendString(" ");
	IStaticContentRuntime pzStatic__10 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__10.addFile("pzpega_ruleform_slide_panel", "11707056113", "js");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__12 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__12.addFile("pzpega_view_references_utils", "11640122418", "js");
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_static_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_static_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_static_);
return false;
}
/**
 * OnlyOnce condition: RuleformMainScripts
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("RuleformMainScripts")) {
tools.appendString(" ");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb")) {
	return;
}
tools.appendString(" ");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1()) {
tools.appendString(" Javascript/CSS includes for Search, Highlight, and Rule Compare ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
onlyOnce_1();
tools.appendString(" ");
boolean whenResult_7 = pega.invokeWhen("pyRuleCompareEnabled", "", "");
	if (whenResult_7) {
tools.appendString(" ");
if (_jspx_meth_pega_static__2(pageContext, "style", "webwb")) {
	return;
}
tools.appendString(" ");
	}
tools.appendString(" ");
if (_jspx_meth_pega_static__3(pageContext, "style", "webwb")) {
	return;
}
tools.appendString(" ");
}
}
private void performStream_1() throws Throwable {
choose_1();
tools.appendString(" ");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PZRULEFORMMAININCLUDE #20191020T020200.930 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzRuleformMainInclude");
	oStreamProperties_1.put("pyRuleSetVersion", "08-04-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PZRULEFORMMAININCLUDE #20191020T020200.930 GMT", "@baseclass pzRuleformMainInclude", "Pega-Desktop", "08-04-01", "20191020T020200.930 GMT");
}
