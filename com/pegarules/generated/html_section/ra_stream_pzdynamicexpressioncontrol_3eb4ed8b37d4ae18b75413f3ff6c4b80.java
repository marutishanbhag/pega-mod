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
 * Builds JSP stream @BASECLASS!PZDYNAMICEXPRESSIONCONTROL.
 */
public class ra_stream_pzdynamicexpressioncontrol_3eb4ed8b37d4ae18b75413f3ff6c4b80 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzDynamicExpressionControl.Embed_MethodParams.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 597626622;
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
	public ra_stream_pzdynamicexpressioncontrol_3eb4ed8b37d4ae18b75413f3ff6c4b80(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "97a33af9b0f627cc4170facfdcf5f06077aa35c";
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
/* Instance RULE-HTML-SECTION @BASECLASS PZDYNAMICEXPRESSIONCONTROL #20220418T131707.066 GMT	Pega-Desktop:08-08-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "97a33af9b0f627cc4170facfdcf5f06077aa35c";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzDynamicExpressionControl",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
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
 * Begin RULE-HTML-SECTION @BASECLASS PZDYNAMICEXPRESSIONCONTROL #20220418T131707.066 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PZDYNAMICEXPRESSIONCONTROL #20220418T131707.066 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_2();

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
/* end RULE-HTML-SECTION @BASECLASS PZDYNAMICEXPRESSIONCONTROL #20220418T131707.066 GMT */
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
	"Rule-HTML-Section:PZDYNAMICEXPRESSIONCONTROL", 
	"Rule-HTML-Property:PZDYNAMICEXPRESSIONCONTROLINCLUDE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZDYNAMICEXPRESSIONCONTROL","Rule-HTML-Section","@BASECLASS",false,"","Pega-Desktop","08-08-01","RULE-HTML-SECTION @BASECLASS PZDYNAMICEXPRESSIONCONTROL #20220418T131707.066 GMT","!PZDYNAMICEXPRESSIONCONTROL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",597626622), 
		new DependentRuleInfo("PZDYNAMICEXPRESSIONCONTROLINCLUDE","Rule-HTML-Property","",false,"","Pega-Desktop","08-01-01","RULE-HTML-PROPERTY PZDYNAMICEXPRESSIONCONTROLINCLUDE #20180713T135129.509 GMT","PZDYNAMICEXPRESSIONCONTROLINCLUDE",true,false,"ABSOLUTE_CLASSLESS",-179773228)
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
//	RULE-HTML-SECTION @BASECLASS PZDYNAMICEXPRESSIONCONTROL #20220418T131707.066 GMT:20220418T131707.066 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	RULE-HTML-PROPERTY PZDYNAMICEXPRESSIONCONTROLINCLUDE #20180713T135129.509 GMT:20180713T135129.509 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

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
		return "7cc56c82aee3ea37a7fceff6ae5a71a8";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Stream";
}
/**
 * OnlyOnce condition: MethodParamsInputInner
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("MethodParamsInputInner")) {
tools.appendString(" <script> /* Used to manually trigger on change event on object */ function fireEvent(element,eventName){ if(!(element)){ console.log('No element passed to fireEvent!'); return; } var evt; /* Standard event creation */ if(element.dispatchEvent){ var evt = document.createEvent(\"HTMLEvents\"); evt.initEvent(eventName, true, true ); /* event type,bubbling,cancelable */ } /* IE < 9 event creation */ else if(document.createEventObject) evt = document.createEventObject(); else{ console.log(\"fireEvent can't make an event in your browser!\"); return; } /* Dispatch wasn't working as expected, had to do some hard-coding. This should be fixed at some point, having it not bubble or call events attached in other ways will be a problem eventually */ if(element.onchange){ evt.target = element; element.onchange(evt); } else if(element.attributes('ONCHANGE_CUSTOM')){ evt.target = element; var event = evt; eval(element.attributes('ONCHANGE_CUSTOM').value); } /* Standard dispatch */ else if(element.dispatchEvent) return !element.dispatchEvent(evt); /* IE < 9 dispatch */ else if(element.fireEvent) return element.fireEvent('on'+eventName,evt); else{ console.log(\"fireEvent can't trigger the event in your browser!\"); return; } } /* Custom post value since autogenerated post value throws errors when trying to use it from custom stuff */ function reloadInputAfterChange(e,paramName,stepPage,id){ var elem; if(typeof id !== 'undefined'){ elem = document.getElementById(id); fireEvent(elem,'Change'); return; } else{ e = e || window.event; var elem = pega.util.Event.getTarget(e); } var paramValue = elem.value || elem.innerText || elem.textContent || ''; var callback = { success: function(oResponse) {}, failure: function (oResponse){} }; var safeURL = SafeURL_createFromURL(pega.u.d.url); safeURL.put(\"pyClassName\",\"@baseclass\"); safeURL.put(\"pyActivity\",\"pzStoreValueInProp\"); safeURL.put(\"pzPrimaryPageName\",stepPage); var queryString = new SafeURL(); queryString.put(\"PropName\",paramName); queryString.put(\"PropValue\",paramValue); var request = pega.u.d.asyncRequest('POST',safeURL,callback,queryString); } /* function to get autocomplete ids since they generate them instead of providing a param */ function getInputIDForExpressionBuilder(outerID, propName){ var outerElem = document.getElementById(outerID); var inputElems = outerElem.getElementsByTagName('input'); for(var i = 0; i < inputElems.length; i++){ if(inputElems[i].name == propName) return inputElems[i].id; } /* If we get here its going to break no matter what we do */ throw new Error(\"Input element not found for expression builder targetting!\"); } /* function to open rule after getting the class if necessary */ function resolveClassReferencesAndOpenRule(tgtEleID, primePage, tgtClass, stpClass, thirdKey){ var tgtEle = document.getElementById(tgtEleID); if(!(tgtEle)) return; var paramValue = tgtEle.value || tgtEle.innerText || tgtEle.textContent || ''; /* Knock off spaces at ends and hanging period */ paramValue = paramValue.replace(/^\\s*(.*?)\\.?\\s*$/,'$1'); var callback = { 'success':function(o){ var response = ''; if(JSON && typeof JSON.parse === 'function') response = JSON.parse(o.responseText); else response = eval('(' + o.responseText + ')'); if(!(response.targetClass)) return; if(response.stepPageClass){ var keys = response.ruleNameKey + \"=\" + response.ruleName; keys += '&' + 'pyClassName' + \"=\" + response.stepPageClass; if(response.additionalKeys) keys += '&' + response.additionalKeys; openRuleByKeys(response.targetClass,keys); } else openRuleByClassAndName(response.ruleName,response.targetClass); }, 'failure':function(o){console.log(o.responseText);} }; var safeURL = new SafeURL('@baseclass.pzGetClassDetailsToOpenRule'); safeURL.put('TargetClass',tgtClass); safeURL.put('StepPageClass',stpClass); if(paramValue) safeURL.put('RuleName',paramValue); if(thirdKey) safeURL.put('ThirdKey',thirdKey); if(primePage) safeURL.put('pzPrimaryPageName',primePage); var request = pega.u.d.asyncRequest('GET',safeURL,callback,''); } </script> ");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("pxRequestor.pyPegaDesignMode", "true")) {
tools.appendString(" <p style='font-weight:bold'>Necessary JS Functions for pzDynamicExpressionControl</p> ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
onlyOnce_1();
tools.appendString(" ");
}
}
private void performStream_1() throws Throwable {
choose_3();
tools.appendString(" ");
}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-PROPERTY PZDYNAMICEXPRESSIONCONTROLINCLUDE #20180713T135129.509 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzDynamicExpressionControlInclude");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Embed_MethodParams_pzDynamicExpressionControlInclude
 */
private void property_Embed_MethodParams_pzDynamicExpressionControlInclude() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PZDYNAMICEXPRESSIONCONTROLINCLUDE #20180713T135129.509 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZDYNAMICEXPRESSIONCONTROLINCLUDE #20180713T135129.509 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZDYNAMICEXPRESSIONCONTROLINCLUDE #20180713T135129.509 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_1)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,true);
}
/* end RULE-HTML-PROPERTY PZDYNAMICEXPRESSIONCONTROLINCLUDE #20180713T135129.509 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY PZDYNAMICEXPRESSIONCONTROLINCLUDE #20180713T135129.509 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Embed_MethodParams_pzDynamicExpressionControlInclude();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_4(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || ((!areValsEqual(tools.getParamValue(aParam1), aParam2)) && (!areValsEqual(tools.getParamValue(aParam3), aParam4))));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 * @return true iff the remainder of the page should be skipped
 */
private boolean choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_4("ParamSPBClass", "PageClass", "ParamSPBClass", "")) {
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "pyPromptClass", "$SAVE(ParamSPBClass)")) {
	return true;
}
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "pyPromptClass", "$SAVE(StepPageClass)")) {
	return true;
}
tools.appendString(" ");
}
return false;
}
/**
 * Implements a pega:include tag.
 */private boolean _jspx_meth_pega_include__4(PageContext aPageContext, java.lang.String aName, java.lang.String aType) throws Throwable {
/* pega:include */
com.pega.pegarules.jsptags.IncludeTag _jspx_th_pega_include_ = (com.pega.pegarules.jsptags.IncludeTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.IncludeTag.class);
_jspx_th_pega_include_.setPageContext(pageContext);
_jspx_th_pega_include_.setParent(mParentTag);
_jspx_th_pega_include_.setName(aName);
_jspx_th_pega_include_.setType(aType);
int _jspx_eval_pega_include_ = _jspx_th_pega_include_.doStartTag();
if (_jspx_eval_pega_include_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_include_;
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "pyTargetElementId", "$SAVE(ParamName)")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "pyIsLaunchAsOverlay", "$SAVE(isOverlay)")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "pyShowLocalVariables", "$SAVE(localVariable)")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "pyShowCustomPages", "$SAVE(localVariable)")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "pyShowParameters", "$SAVE(localVariable)")) {
	return true;
}
tools.appendString(" <!--Bug- 199246 : Specific use-case for methods such as Obj-Browse,Link-Objects and Obj-Sort. Need to read the context class value from ObjClass field --> ");
choose_2();
tools.appendString("  ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_include_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_include_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_include_);
return false;
}
/**
 * Implements a pega:include tag.
 */private boolean _jspx_meth_pega_include__3(PageContext aPageContext, java.lang.String aName, java.lang.String aType) throws Throwable {
/* pega:include */
com.pega.pegarules.jsptags.IncludeTag _jspx_th_pega_include_ = (com.pega.pegarules.jsptags.IncludeTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.IncludeTag.class);
_jspx_th_pega_include_.setPageContext(pageContext);
_jspx_th_pega_include_.setParent(mParentTag);
_jspx_th_pega_include_.setName(aName);
_jspx_th_pega_include_.setType(aType);
int _jspx_eval_pega_include_ = _jspx_th_pega_include_.doStartTag();
if (_jspx_eval_pega_include_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_include_;
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "Size", "$SAVE(ParamSize)")) {
	return true;
}
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_include_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_include_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_include_);
return false;
}
/**
 * Implements a pega:param tag.
 */private boolean _jspx_meth_pega_param__2(PageContext aPageContext, java.lang.String aName, java.lang.String aValue) throws Throwable {
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
 * Implements a pega:include tag.
 */private boolean _jspx_meth_pega_include__2(PageContext aPageContext, java.lang.String aName, java.lang.String aType) throws Throwable {
/* pega:include */
com.pega.pegarules.jsptags.IncludeTag _jspx_th_pega_include_ = (com.pega.pegarules.jsptags.IncludeTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.IncludeTag.class);
_jspx_th_pega_include_.setPageContext(pageContext);
_jspx_th_pega_include_.setParent(mParentTag);
_jspx_th_pega_include_.setName(aName);
_jspx_th_pega_include_.setType(aType);
int _jspx_eval_pega_include_ = _jspx_th_pega_include_.doStartTag();
if (_jspx_eval_pega_include_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_include_;
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "Source", "$SAVE(DropDownSource)")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__2(pageContext, "PanelWidth", "Stretch")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__2(pageContext, "Caption", "pyLabel")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__2(pageContext, "Value", "pyNote")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__2(pageContext, "LoadMode", "Auto")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__2(pageContext, "EnableCache", "Yes")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__2(pageContext, "SetPrimaryPage", "No")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__2(pageContext, "firstRadio", "useAdvancedDiv")) {
	return true;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__2(pageContext, "HidePrompt", "Yes")) {
	return true;
}
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_include_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_include_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_include_);
return false;
}
/**
 * Implements a pega:include tag.
 */private boolean _jspx_meth_pega_include__1(PageContext aPageContext, java.lang.String aName, java.lang.String aType) throws Throwable {
/* pega:include */
com.pega.pegarules.jsptags.IncludeTag _jspx_th_pega_include_ = (com.pega.pegarules.jsptags.IncludeTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.IncludeTag.class);
_jspx_th_pega_include_.setPageContext(pageContext);
_jspx_th_pega_include_.setParent(mParentTag);
_jspx_th_pega_include_.setName(aName);
_jspx_th_pega_include_.setType(aType);
int _jspx_eval_pega_include_ = _jspx_th_pega_include_.doStartTag();
if (_jspx_eval_pega_include_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_include_;
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "ToolTip", "$SAVE(ParamDesc)")) {
	return true;
}
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_include_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_include_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_include_);
return false;
}
private boolean when_3(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_2("ParamSPRClass", "Rule-Obj-FieldValue")) {
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "AdditionalParams", "$SAVE(ParamSPDataNode)")) {
	return;
}
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice && when_3("ParamSPDataNode", "")) {
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "DisplayProperty", "$SAVE(ParamSPDataNode)")) {
	return;
}
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Implements a pega:param tag.
 */private boolean _jspx_meth_pega_param__1(PageContext aPageContext, java.lang.String aName, java.lang.String aRef) throws Throwable {
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
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getProperty(aParam1).getStringValue(), aParam2)));
}
private void performStream_2() throws Throwable {
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && when_1("pxRequestor.pyPegaDesignMode", "true")) {
tools.appendString(" <p style='font-weight:bold'>Makes inputs out of individual XML Signatures</p> ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");

	String elemTag = TagTools.getUniqueID(tools);

tools.appendString(" ");

	/**
	 * Utility class for JavaScript compatible UTF-8 encoding and decoding.
	 * 
	 * @see http://stackoverflow.com/questions/607176/java-equivalent-to-javascripts-encodeuricomponent-that-produces-identical-output
	 * @author John Topley 
	 */
	class EncodingUtil
	{
	  /**
	   * Decodes the passed UTF-8 String using an algorithm that's compatible with
	   * JavaScript's <code>decodeURIComponent</code> function. Returns
	   * <code>null</code> if the String is <code>null</code>.
	   *
	   * @param s The UTF-8 encoded String to be decoded
	   * @return the decoded String
	   */
	  public String decodeURIComponent(String s)
	  {
		if (s == null)
		{
		  return null;
		}

		String result = null;
		s = s.replaceAll("\\%!~","%");

		try
		{
		  result = java.net.URLDecoder.decode(s, "UTF-8");
		}

		// This exception should never occur.
		catch (java.io.UnsupportedEncodingException e)
		{
		  result = s;  
		}

		return result;
	  }

	  /**
	   * Encodes the passed String as UTF-8 using an algorithm that's compatible
	   * with JavaScript's <code>encodeURIComponent</code> function. Returns
	   * <code>null</code> if the String is <code>null</code>.
	   * 
	   * @param s The String to be encoded
	   * @return the encoded String
	   */
	  public String encodeURIComponent(String s)
	  {
		String result = null;

		try
		{
		  result = java.net.URLEncoder.encode(s, "UTF-8")
							 .replaceAll("\\+", "%20")
							 .replaceAll("\\%21", "!")
							 .replaceAll("\\%27", "'")
							 .replaceAll("\\%28", "(")
							 .replaceAll("\\%29", ")")
							 .replaceAll("\\%7E", "~");
		}

		// This exception should never occur.
		catch (java.io.UnsupportedEncodingException e)
		{
		  result = s;
		}

    //Modified from source to accommodate Pega use-case
		return result.replaceAll("\\%","%!~");
	  }  

	  public EncodingUtil(){}
	}

	EncodingUtil encodingUtil = new EncodingUtil();

	//Get params, process if necessary and put in saves
	String 	ParamName 	= tools.getParamValue("ParamName"),
		ParamDesc 	= tools.getParamValue("ParamDesc"),
		ParamType 	= tools.getParamValue("ParamType"),
		ParamSize 	= tools.getParamValue("ParamSize"),
		ParamSPRule	= tools.getParamValue("ParamSPRule"),
		ParamSPRClass	= tools.getParamValue("ParamSPRClass"),
		ParamSPBClass	= tools.getParamValue("ParamSPBClass"),
		ParamDropDown	= tools.getParamValue("ParamDropDown").replaceAll("&#61;","="),
		ParamDefVal	= tools.getParamValue("ParamDefVal"),
		ParamSPDataNode	= tools.getParamValue("ParamSPDataNode"),
		ParamWidth	= tools.getParamValue("width"),
		ParamRepeatType   = tools.getParamValue("RepeatType");
		
	boolean	ParamReq	= tools.getParamValue("ParamReq").equalsIgnoreCase("true"),
		ParamInOut	= tools.getParamValue("ParamInOut").equalsIgnoreCase("true"),
		ParamSP	= tools.getParamValue("ParamSP").equalsIgnoreCase("true"),
		DisableExpressions	= tools.getParamValue("DisableExpressions").equalsIgnoreCase("true"),
		ParamLaunchExpression = tools.getParamValue("LaunchExpression").equalsIgnoreCase("true");
		
	tools.putSaveValue("ParamName",ParamName);
	tools.putSaveValue("ParamDesc",ParamDesc);
	tools.putSaveValue("ParamType",ParamType);
	tools.putSaveValue("ParamSize",ParamSize);
	tools.putSaveValue("ParamSPRule",ParamSPRule);
	tools.putSaveValue("ParamSPRClass",ParamSPRClass);
	tools.putSaveValue("ParamSPBClass",ParamSPBClass);
	tools.putSaveValue("ParamDropDown",ParamDropDown);
	tools.putSaveValue("ParamDefVal",ParamDefVal);
	tools.putSaveValue("ParamSPDataNode",StringUtils.decodeURL(ParamSPDataNode));
	tools.putSaveValue("ParamWidth",ParamWidth);
	tools.putSaveValue("ParamRepeatType", ParamRepeatType);

	tools.putSaveValue("StepPageClass",tools.getParamValue("StepPageClass"));	
	tools.putSaveValue("isGrid","false");
	tools.putSaveValue("localVariable","true");
	
	if(ParamLaunchExpression){  /* TASK-300122 */
		tools.putSaveValue("isOverlay","true");
	}
	else{
		tools.putSaveValue("isOverlay","false");
	}

  // If PageClass is past in, assume they want pyStepsClassName. (Not sure why?)
	if("PageClass".equals(ParamSPBClass)){
    ParamSPBClass = "pyStepsClassName";
  }
  
  // If this is an output parameter, always show the property prompt.
  if(!ParamInOut){
    ParamType = "STRING";
    ParamSPRule = "PROPERTY";
    ParamSPRClass = "Rule-Obj-Property";
    ParamSP = true;
  }
  
  //Change the reference to the new prop name so we can include controls later with the right $this-name and $this-value
	//	Done this way since pega:reference won't allow you to use a ref and a format at the same time
  

tools.appendString(" ");
/* pega:withReference */
com.pega.pegarules.jsptags.WithReferenceTag _jspx_th_pega_withReference__1 = (com.pega.pegarules.jsptags.WithReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithReferenceTag.class);
_jspx_th_pega_withReference__1.setPageContext(pageContext);
_jspx_th_pega_withReference__1.setParent(mParentTag);
_jspx_th_pega_withReference__1.setName("$SAVE(ParamName)");
int _jspx_eval_pega_withReference__1 = _jspx_th_pega_withReference__1.doStartTag();
if (_jspx_eval_pega_withReference__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_1 = mParentTag;
mParentTag = _jspx_th_pega_withReference__1;
tools.appendString(" ");
pzAuto.putSaveRef("PropName", "$this-name", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

//Force it editable otherwise it sets it read only, not entirely sure why
boolean isEditable = !(tools.getParamValue("InputIsRO").equals("true"));
((PegaStreamAPI)tools).setModeInput(isEditable);

ClipboardPage currStepPage = tools.getStepPage();

// Standard behaviors behave erratically in non-autogenerated sections but a lot of the referencing stuff requires post-value
//Built-in a custom post value so you can always have that much, even if you are using a non-auto section and including this

//STRING and smartprompt with a rule class
if(ParamType.equalsIgnoreCase("STRING") && ParamSP && (!ParamSPRClass.equals("") || ParamSPRule.equalsIgnoreCase("PROPERTY")) || !DisableExpressions){
	//PROPERTY make autocomplete on property

tools.appendString(" ");
/* pega:include */
com.pega.pegarules.jsptags.IncludeTag _jspx_th_pega_include__1 = (com.pega.pegarules.jsptags.IncludeTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.IncludeTag.class);
_jspx_th_pega_include__1.setPageContext(pageContext);
_jspx_th_pega_include__1.setParent(mParentTag);
_jspx_th_pega_include__1.setName("OpenRuleAdvanced");
_jspx_th_pega_include__1.setType("Rule-HTML-Property");
int _jspx_eval_pega_include__1 = _jspx_th_pega_include__1.doStartTag();
if (_jspx_eval_pega_include__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_2 = mParentTag;
mParentTag = _jspx_th_pega_include__1;
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__1 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__1.setPageContext(pageContext);
_jspx_th_pega_param__1.setParent(mParentTag);
_jspx_th_pega_param__1.setName("Class");
_jspx_th_pega_param__1.setValue( ParamSPRClass );
int _jspx_eval_pega_param__1 = _jspx_th_pega_param__1.doStartTag();
if (_jspx_th_pega_param__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__1);
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "Size", "$SAVE(ParamSize)")) {
	return;
}
tools.appendString(" ");
if (_jspx_meth_pega_param__1(pageContext, "ID", "$SAVE(ParamName)")) {
	return;
}
tools.appendString(" ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("ParamSPBClass"), ""))) {
tools.appendString(" ");
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param__2 = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param__2.setPageContext(pageContext);
_jspx_th_pega_param__2.setParent(mParentTag);
_jspx_th_pega_param__2.setName("ApplyTo");
_jspx_th_pega_param__2.setValue( ParamSPBClass );
int _jspx_eval_pega_param__2 = _jspx_th_pega_param__2.doStartTag();
if (_jspx_th_pega_param__2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param__2);
tools.appendString(" ");
	}
tools.appendString(" ");
choose_1();
tools.appendString("  ");
mParentTag = prevParentTag_2;
		int evalDoAfterBody = _jspx_th_pega_include__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_include__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_include__1);
tools.appendString(" ");

//BOOLEAN make checkbox
}else if(ParamType.equalsIgnoreCase("BOOLEAN")){


tools.appendString(" ");
if (_jspx_meth_pega_include__1(pageContext, "CheckBox", "Rule-HTML-Property")) {
	return;
}
tools.appendString(" ");

//DROPDOWN make dynamic select
}else if(ParamType.equalsIgnoreCase("DROPDOWN") && !ParamDropDown.equals("")){

	tools.putSaveValue("DropDownSource", "pyActivity=@baseclass.pzMakeDropDownSelect&DDList=" + encodingUtil.encodeURIComponent(ParamDropDown));

tools.appendString(" ");
if (_jspx_meth_pega_include__2(pageContext, "DynamicSelect", "Rule-HTML-Property")) {
	return;
}
tools.appendString(" ");

//TEXTINPUT if STRING and disabling expressions
}else{

tools.appendString(" ");
if (_jspx_meth_pega_include__3(pageContext, "Text", "Rule-HTML-Property")) {
	return;
}
tools.appendString(" ");

//OTHERWISE make autocomplete for expressions
}
//If we have an autocomplete add the rule opener/expression builder button if appropriate.
	if(!DisableExpressions){	

tools.appendString(" </td> <td class='EBAndROButtons' style=\"vertical-align:baseline;\"> <div id=\"RULE_KEY\" node_type=\"MAIN_RULE\" name=\"BASE_REF\" base_ref=\"");
out.print(tools.getStepPage().getReference());
tools.appendString("\"> <!-- TASK-300122 --> ");
if (_jspx_meth_pega_include__4(pageContext, "pxExpressionBuilder", "Rule-HTML-Section")) {
	return;
}
tools.appendString(" </div> ");

}

tools.appendString(" ");
mParentTag = prevParentTag_1;
		int evalDoAfterBody = _jspx_th_pega_withReference__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withReference__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withReference__1);
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY PZDYNAMICEXPRESSIONCONTROLINCLUDE #20180713T135129.509 GMT */
include_1();

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
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PZDYNAMICEXPRESSIONCONTROL #20220418T131707.066 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzDynamicExpressionControl");
	oStreamProperties_1.put("pyRuleSetVersion", "08-08-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PZDYNAMICEXPRESSIONCONTROL #20220418T131707.066 GMT", "@baseclass pzDynamicExpressionControl", "Pega-Desktop", "08-08-01", "20220418T131707.066 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZDYNAMICEXPRESSIONCONTROLINCLUDE #20180713T135129.509 GMT", "pzDynamicExpressionControlInclude", "Pega-Desktop", "08-01-01", "20180713T135129.509 GMT");
}
