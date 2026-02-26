package com.pegarules.generated.html_property;
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
import com.pega.pegarules.priv.util.JSPResponse;
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
 * Builds JSP stream PZLAYERS.
 */
public class ra_stream_pzlayers_162e500bfeba80a56335db81d2542a7d extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pzLayers.Stream");
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
	public ra_stream_pzlayers_162e500bfeba80a56335db81d2542a7d(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "6b6803736ed1a024cd4594de7c1c78c1314f5dc2";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
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
/* Instance RULE-HTML-PROPERTY PZLAYERS #20181221T205716.750 GMT	Pega-LP-Application:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZLAYERS #20181221T205716.750 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZLAYERS #20181221T205716.750 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-HTML-PROPERTY PZLAYERS #20181221T205716.750 GMT */
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
	"Rule-HTML-Property:PZLAYERS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZLAYERS","Rule-HTML-Property","",false,"","Pega-LP-Application","08-03-01","RULE-HTML-PROPERTY PZLAYERS #20181221T205716.750 GMT","PZLAYERS",true,false,"ABSOLUTE_CLASSLESS",1872252184)
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
//	RULE-HTML-PROPERTY PZLAYERS #20181221T205716.750 GMT:20181221T205716.750 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "10502bb21dfcac00bc5e686635ecdcff";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private void performStream_1() throws Throwable {
tools.appendString("<div class=\"layer-cake\"> <ul class=\"grid-layers on-load\"> <li class=\"layer1\"> <div> <ul class=\"first\"> <li class=\"block block__green\"></li> <li class=\"block block__green\"></li> <li class=\"block block__green\"></li> <li class=\"block block__green\"></li> </ul> <ul class=\"second\"> <li class=\"block block__green\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> </ul> <ul class=\"third\"> <li class=\"block block__white border--t border--l border--b\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> </ul> <ul class=\"fourth\"> <li class=\"block block__white border--t border--r\"></li> <li class=\"block block__white border--l border--r\"></li> <li class=\"block block__white border--l border--r\"></li> <li class=\"block block__white border--l border--r border--b\"></li> </ul> </div> </li> <li class=\"layer2\"> <div> <ul class=\"first\"> <li class=\"block block__green\"></li> <li class=\"block block__green\"></li> <li class=\"block block__green\"></li> <li class=\"block block__green\"></li> </ul> <ul class=\"second\"> <li class=\"block block__green\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> </ul> <ul class=\"third\"> <li class=\"block block__white\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> </ul> <ul class=\"fourth\"> <li class=\"block block__white\"></li> <li class=\"block block__white\"></li> <li class=\"block block__white\"></li> <li class=\"block block__white\"></li> </ul> </div> </li> <li class=\"layer3\"> <div> <ul class=\"first\"> <li class=\"block block__green\"></li> <li class=\"block block__green\"></li> <li class=\"block block__green\"></li> <li class=\"block block__green\"></li> </ul> <ul class=\"second\"> <li class=\"block block__green\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> </ul> <ul class=\"third\"> <li class=\"block block__white\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> <li class=\"block block__pink\"></li> </ul> <ul class=\"fourth\"> <li class=\"block block__white\"></li> <li class=\"block block__white\"></li> <li class=\"block block__white\"></li> <li class=\"block block__white\"></li> </ul> </div> </li> </ul> </div> <script> (function() { var gridLayersEl = document.getElementsByClassName(\"grid-layers\")[0]; gridLayersEl.classList.remove(\"on-load\"); /*Block colors*/ var layerColors = ['white', 'pink', 'green']; /*Layer with blocks*/ var layer1 = document.getElementsByClassName(\"layer1\")[0]; var greenBlocks = layer1.getElementsByClassName(\"block__green\"); var pinkBlocks = layer1.getElementsByClassName(\"block__pink\"); var whiteBlocks = layer1.getElementsByClassName(\"block__white\"); var layerBlocks = [whiteBlocks, pinkBlocks, greenBlocks]; /*Application label layers (can contain anywhere from 1-3+ labels*/ var labelLayersEl = document.querySelector(\".layer-detail-list\"); var labelLayerChildren = labelLayersEl.children; /*Launching overlay data*/ var actionURL = new SafeURL(); /*actionURL.put(\"BaseReference\", \"\");*/ actionURL.put(\"IgnoreSectionSubmit\", true); actionURL.put(\"bInvokedFromControl\", true); var taskStatus = \"pzAppInfo\"; var taskIndex = \"\"; var streamType = \"Rule-HTML-Section\"; var prevTaskIndex = \"\"; var prevTaskStatus = \"\"; var bIsModal = \"overlay\"; var modalSection = \"pzModalTemplate\"; var urlObj = actionURL; var reloadElement = \"\"; var bCalledFromGrid = \"\"; var modalStyle = \"\"; var callbackObj = \"\"; var options = {animObj : {animIn:\"anim-bottom\", animOut: \"anim-bottom\"}, fAObjClass:\"Rule-Application\", isCenterOverlay:\"false\", isLocalAction:true, mTObjClass:\"Rule-Application\"}; var bIsDisableClickaway = \"false\"; /*When mouse enters area, add color to grid and label class list*/ function bindMouseOver(colorIndex) { return function() { gridLayersEl.classList.add(layerColors[colorIndex]); labelLayersEl.classList.add(layerColors[colorIndex]); }; } /*When mouse leaves area, remove color from grid and label class list*/ function bindMouseOut(colorIndex) { return function() { gridLayersEl.classList.remove(layerColors[colorIndex]); labelLayersEl.classList.remove(layerColors[colorIndex]); }; } /*When mouse clicks area, display overlay with information about that application*/ function bindMouseClick(layerIndex) { return function(event) { if(typeof labelLayerChildren[layerIndex] !== 'undefined') { event.target.parentElement.setAttribute(\"base_ref\", labelLayerChildren[layerIndex].getAttribute(\"base_ref\")); event.target.parentElement.setAttribute(\"name\", \"BASE_REF\"); var eventObj = {$ev:event, type:\"click\", target:event.target}; pega.u.d.processAction(taskStatus, taskIndex, streamType, prevTaskIndex, prevTaskStatus, bIsModal, eventObj, modalSection, urlObj, reloadElement, bCalledFromGrid, modalStyle, callbackObj, options, bIsDisableClickaway); } }; } /*For up to 3 layers, add mouse over, out and click events for the grid blocks and labels*/ for(var i=0; i<3; i++) { /*Ensure we have have an application layer label as there may be less than 3*/ if(typeof labelLayerChildren[i] !== 'undefined') { labelLayerChildren[i].addEventListener(\"mouseover\", bindMouseOver(i)); labelLayerChildren[i].addEventListener(\"mouseout\", bindMouseOut(i)); } var blockLayer = layerBlocks[i]; /*For each of the grid blocks, update class list with mouse action*/ for(var j=0; j<blockLayer.length; j++) { blockLayer[j].addEventListener(\"mouseenter\", bindMouseOver(i)); blockLayer[j].addEventListener(\"mouseout\", bindMouseOut(i)); /*Only add click action if we have an application layer*/ blockLayer[j].addEventListener(\"click\", bindMouseClick(i)); }; } })(); </script>");
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZLAYERS #20181221T205716.750 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-LP-Application");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzLayers");
	oStreamProperties_1.put("pyRuleSetVersion", "08-03-01");
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
	}
	else {
		pzAuto = null;
	}
	mParentTag = null;
	mStreamResponse = (JSPResponse) tools;
	mHttpServlet = aContext == null ? null : (HttpServlet) aContext.getHttpServlet();
	request = aContext == null ? null : (HttpServletRequest)aContext.getHttpServletRequest();
	mParentStreamProperties = null;
	pz_CurrentRuleKey = null;
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Property");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZLAYERS #20181221T205716.750 GMT", "pzLayers", "Pega-LP-Application", "08-03-01", "20181221T205716.750 GMT");
}
