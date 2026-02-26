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
/**
 * Builds JSP stream @BASECLASS!PZDISABLEVIEWWHENLABELBLANK.
 */
public class ra_stream_pzdisableviewwhenlabelblank_365b601e5983042319b8488e8ece372b extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzDisableViewWhenLabelBlank.Rule_HTML_Section.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -184802422;
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
	public ra_stream_pzdisableviewwhenlabelblank_365b601e5983042319b8488e8ece372b(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "fedd39a18e423fa22ea992de1349950c09644d10";
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
/* Instance RULE-HTML-SECTION @BASECLASS PZDISABLEVIEWWHENLABELBLANK #20201111T155154.957 GMT	Pega-ProcessArchitect:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "fedd39a18e423fa22ea992de1349950c09644d10";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzDisableViewWhenLabelBlank",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
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
 * Begin RULE-HTML-SECTION @BASECLASS PZDISABLEVIEWWHENLABELBLANK #20201111T155154.957 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS PZDISABLEVIEWWHENLABELBLANK #20201111T155154.957 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION @BASECLASS PZDISABLEVIEWWHENLABELBLANK #20201111T155154.957 GMT */
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
	"Rule-HTML-Section:PZDISABLEVIEWWHENLABELBLANK"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZDISABLEVIEWWHENLABELBLANK","Rule-HTML-Section","@BASECLASS",false,"","Pega-ProcessArchitect","08-06-01","RULE-HTML-SECTION @BASECLASS PZDISABLEVIEWWHENLABELBLANK #20201111T155154.957 GMT","!PZDISABLEVIEWWHENLABELBLANK",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-184802422)
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
//	RULE-HTML-SECTION @BASECLASS PZDISABLEVIEWWHENLABELBLANK #20201111T155154.957 GMT:20201111T155154.957 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

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
		return "19f96c99e0945f3f6aa4a919e579bb38";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Stream";
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
private void performStream_1() throws Throwable {
	if (when_1("pyPegaDesignMode", "true")) {
tools.appendString(" <span style=\"width:100; color:gray; text-align:center\">Proxy section to disable inputs when readonly</span> ");
	}
tools.appendString(" ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("pyPegaDesignMode"), "true"))) {
tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || !"".equals(tools.getStepPage().getString(".pyLabel")) && !"New View".equals(tools.getStepPage().getString(".pyLabel")))) {
tools.appendString(" <script> /* The view name field is getting focused automatically even when its not empty. * Its very inconsistent and happening in few browsers. * Added work around to focus on pencil icon to handle it temporarily. */ function focusPencil() { var pencilField = $('i.pi-pencil'); if (pencilField.length > 0) { setTimeout(function() { pencilField.focus();}, 10); } } window.setTimeout(function() { /* need to use timeout to disable dynamic selects */ focusPencil(); }, 10); </script> ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" <script> /* * Focus the input field if the input is blank or New View */ function focusInput() { /* auto focus the label field in the configure view on load if it is empty or New View */ var labelField = $('div.configure-view-label input'); if (labelField.length > 0) { setTimeout(function() { labelField.focus();}, 10); } } window.setTimeout(function() { /* need to use timeout to disable dynamic selects */ focusInput(); },10); </script> ");
}
tools.appendString("  ");
boolean whenResult_1 = pega.invokeWhen("pzIsLabelEmptyOrHasMessages", "", "");
	if (whenResult_1) {
tools.appendString(" <script> function disableAllElements() { var labelField = $('div.configure-view-label input'); var dom = pega.util.Dom; var dialog_section = pega.u.d.getSectionByName(\"");
out.print( tools.getParamValue("sectionName"));
tools.appendString("\",\"\",document); var inputElements = new Array(); var inputTypes = new Array(\"input\", \"select\", \"textarea\", \"a\" , \"label\", \"i\", \"div\"); for(var i=0; i<inputTypes.length; i++){ /* var inputElementArray = dialog_section.getElementsByTagName(inputTypes[i]); */ var inputElementArray = pega.util.Dom.getElementsBy(function(el) { return true; }, inputTypes[i], dialog_section); for(var j=0; j<inputElementArray.length; j++){ if(inputElementArray[j].type != 'hidden' && inputElementArray[j].id != \"TABANCHOR\"){ /* need to keep close button enabled */ if(inputElementArray[j].id == \"container_close\") continue; /* need to keep Open Rule buttons enabled */ if(inputElementArray[j].type == \"button\") { if (pega.util.Dom.getElementsByClassName('iconOpenRule', 'span',inputElementArray[j]).length > 0) continue; var el = dom.getElementsBy(function (e) { var nodes = e.childNodes; var len = nodes.length; var isCancel = false; for(var a=0;a<len;a++){ if(nodes[a].nodeType==3){ if(!nodes[a].nodeValue.match(/^[\\s]*$/)){ if (nodes[a].nodeValue == \"Cancel\") { isCancel = true; break; } } } } return isCancel; }, \"div\", inputElementArray[j]); if (el.length > 0) continue; } if(inputElementArray[j].tagName == \"A\"){ /* need to keep Open Section and View Action Specification and Add/View/Edit fields enabled */ if(inputElementArray[j].hasAttribute(\"data-click\")) { var dataClick = inputElementArray[j].getAttribute(\"data-click\"); if(!( (dataClick.indexOf(\"processAction\") != -1 && dataClick.indexOf(\"pzPropertyPanelModalDM\") != -1) || (dataClick.indexOf(\"openRuleByKey\") != -1 && dataClick.indexOf(\"Rule-HTML-Section\") != -1) || (dataClick.indexOf(\"processAction\") != -1 && dataClick.indexOf(\"pzConfigureFields\") != -1) )) { inputElementArray[j].setAttribute(\"data-click\",\"\"); inputElementArray[j].disabled = \"true\"; } var dataKU = inputElementArray[j].getAttribute(\"data-keyup\"); if(dataKU != null){ inputElementArray[j].setAttribute(\"data-click\",\"\"); inputElementArray[j].setAttribute(\"data-keyup\",\"\"); inputElementArray[j].disabled = \"true\"; } } else { inputElementArray[j].disabled = \"true\"; } inputElementArray[j].href = \"#\"; } else { inputElementArray[j].disabled = \"true\"; inputElementArray[j].setAttribute(\"data-click\",\"\"); } if(inputElementArray[j].getAttribute(\"isIcon\") == \"true\"){ inputElementArray[j].className = inputElementArray[j].className + \"_disabled\"; } if(inputElementArray[j].onclick){ inputElementArray[j].onclick_cpy = inputElementArray[j].onclick; inputElementArray[j].onclick = null; } } inputElementArray[j].style.cursor = \"default\"; } } /* do not disable label */ $(labelField).prop('disabled', false); } window.setTimeout(function(){ /* need to use timeout to disable dynamic selects */ disableAllElements(); },500); </script> ");
	}
tools.appendString(" ");
	}
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS PZDISABLEVIEWWHENLABELBLANK #20201111T155154.957 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzDisableViewWhenLabelBlank");
	oStreamProperties_1.put("pyRuleSetVersion", "08-06-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS PZDISABLEVIEWWHENLABELBLANK #20201111T155154.957 GMT", "@baseclass pzDisableViewWhenLabelBlank", "Pega-ProcessArchitect", "08-06-01", "20201111T155154.957 GMT");
}
