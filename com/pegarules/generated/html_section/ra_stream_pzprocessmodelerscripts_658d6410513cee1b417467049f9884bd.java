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
 * Builds JSP stream RULE-OBJ-FLOW!PZPROCESSMODELERSCRIPTS.
 */
public class ra_stream_pzprocessmodelerscripts_658d6410513cee1b417467049f9884bd extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzProcessModelerScripts.Rule_Obj_Flow.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 234558388;
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
	public ra_stream_pzprocessmodelerscripts_658d6410513cee1b417467049f9884bd(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "3d866570bb5ece6452432ee34d35549bbbaba974";
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
/* Instance RULE-HTML-SECTION RULE-OBJ-FLOW PZPROCESSMODELERSCRIPTS #20180713T140929.269 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "3d866570bb5ece6452432ee34d35549bbbaba974";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzProcessModelerScripts",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
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
 * Begin RULE-HTML-SECTION RULE-OBJ-FLOW PZPROCESSMODELERSCRIPTS #20180713T140929.269 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-OBJ-FLOW PZPROCESSMODELERSCRIPTS #20180713T140929.269 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-OBJ-FLOW PZPROCESSMODELERSCRIPTS #20180713T140929.269 GMT */
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
	"Rule-HTML-Section:PZPROCESSMODELERSCRIPTS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZPROCESSMODELERSCRIPTS","Rule-HTML-Section","RULE-OBJ-FLOW",false,"","Pega-ProcessArchitect","08-01-01","RULE-HTML-SECTION RULE-OBJ-FLOW PZPROCESSMODELERSCRIPTS #20180713T140929.269 GMT","!PZPROCESSMODELERSCRIPTS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",234558388)
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
//	RULE-HTML-SECTION RULE-OBJ-FLOW PZPROCESSMODELERSCRIPTS #20180713T140929.269 GMT:20180713T140929.269 GMT
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
		return "f2c599cfc2c45ae64ae90a4022649887";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Flow";
	}
public String getAspect() {
return "Stream";
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("pyPegaDesignMode", "true")) {
tools.appendString(" <div style=\"width:100%; color:gray; text-align:center\">Viewer Script Overrides</div> ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" <script type=\"text/javascript\"> (function() { var _started = false; var _executable = []; var _poll = function() { var queue = []; for (var i = 0; i < _executable.length; i++) { var result = _executable[i].call(window); if (! result) { queue.push(_executable[i]); } } _executable = queue; if (_executable.length > 0) { window.setTimeout(_poll, 100); } }; var _override = function() { if (typeof(ViewerManager) == \"undefined\") { console.log(\"Could not retrieve ViewerManager instance\"); return false; } var v = ViewerManager.getViewer(); if (! v || v.state !== \"started\") { console.log(\"Could not retrieve a valid Viewer instance\"); return false; } var saveInProgress = false; var flowContextChanged = false; var graph = v.graph; var dispatcher = graph.eventDispatcher; var prevFlowContext = graph.getRoot().getProperty(\"pathKey\"); var currFlowContext = graph.getRoot().getProperty(\"pathKey\"); dispatcher.unregister('dblclick.vertex*', null, v); dispatcher.unregister('dblclick.container*', null, v); dispatcher.unregister('dblclick.edge*', null, v); var doShapeActionOnSelectionChange = function (type, removed, added, selection) { var currReference = this.getRoot().getProperty(\"pathKey\"); var prevReference = \"\"; if (selection.size() === 1) { var cell1 = selection.values()[0]; currReference = cell1.getProperty(\"pathKey\"); } if (removed.length === 1) { var cell2 = removed[0]; prevReference = cell2.getProperty(\"pathKey\"); } if(saveInProgress){ pega.cd.pmviewer.pxActivateShape(prevReference, prevReference); } else{ pega.cd.pmviewer.pxActivateShape(currReference, prevReference); } }; graph.on(gfw.Graph.EVENT_TYPES.SELECTION_CHANGE, doShapeActionOnSelectionChange); setSaveInProgressFlag = function(type, full) { if(type===gfw.Graph.EVENT_TYPES.UPDATE_START) flowContextChanged = false; prevFlowContext = currFlowContext; currFlowContext = this.getRoot().getProperty(\"pathKey\"); if(type===gfw.Graph.EVENT_TYPES.UPDATE_START && full){ saveInProgress = true; } else{ saveInProgress = false; } if(prevFlowContext!=currFlowContext){ flowContextChanged = true; } }; setSelectedFlowContext = function(type, full){ if(flowContextChanged){ pega.cd.pmviewer.setCurrentFlowContext(currFlowContext); } }; graph.on(gfw.Graph.EVENT_TYPES.UPDATE_START, setSaveInProgressFlag); graph.on(gfw.Graph.EVENT_TYPES.UPDATE_END, setSaveInProgressFlag); graph.on(gfw.Graph.EVENT_TYPES.UPDATE_END, setSelectedFlowContext); updateShapeLabelOnCellPropChange = function(typeOfEvent, cell, propertyName, oldValue, newValue){ var shapePageRef = cell.getProperty(\"pathKey\"); pega.cd.pmviewer.renameShapeLabel(shapePageRef, newValue); }; graph.on(gfw.Graph.EVENT_TYPES.CELL_PROPERTY_CHANGE_END, updateShapeLabelOnCellPropChange); return true; }; _executable.push(_override); _poll(); })(); pega.cd_pmviewer = function () {}; pega.cd_pmviewer.prototype = { /* doPostProcessingAction : function(contextReference){ if(contextReference && contextReference !=\"\"){ var oSafeURL = new SafeURL(\"Rule-Obj-Flow.pzPMPropertiesPostProcessing\"); oSafeURL.put(\"PrevNodeRef\", contextReference); var callback = { success : function (responseObj) {}, failure : function (oResponse) { console.log(\"Failed to perfom post processing for: \"+contextReference); } }; var response = pega.u.d.asyncRequest('GET', oSafeURL, callback, null); } }, doPreProcessingAction : function(contextReference){ if(contextReference && contextReference !=\"\"){ var oSafeURL = new SafeURL(\"Rule-Obj-Flow.pzPMPropertiesPreProcessing\"); oSafeURL.put(\"CurrNodeRef\", contextReference); var callback = { success : function (responseObj) {}, failure : function (oResponse) { console.log(\"Failed to perfom pre processing for: \"+contextReference); } }; var response = pega.u.d.asyncRequest('GET', oSafeURL, callback, null); } }, resetProcessModelerStateOnCanvasSel : function(contextReference){ if(contextReference && contextReference !=\"\"){ var oSafeURL = new SafeURL(\"Rule-Obj-Flow.pyResetProcessModelerState\"); oSafeURL.put(\"ContextReference\", contextReference); var callback = { success : function (responseObj) { var popObj = pega.u.d.getPopOver(); if (popObj) { popObj.close(); } }, failure : function (oResponse) { console.log(\"Failed to reset process modeler state: \"+contextReference); } }; var response = pega.u.d.asyncRequest('GET', oSafeURL, callback, null); } }, activateShape : function(contextReference){ if(contextReference && contextReference !=\"\"){ var isCanvasContext = true; if(contextReference.indexOf(\"pyShapes\") !== -1 || contextReference.indexOf(\"pyConnectors\") !== -1){ isCanvasContext = false; } if(!isCanvasContext){ var sectionNode=pega.u.d.getSectionByName(\"pzDisplayProcessModelerProperties\", contextReference, document); pega.u.d.reloadSectionEncoded(sectionNode, 'pzPMPropertiesPreProcessing', \"CurrNodeRef=\" +contextReference, false, true, '-1', false); } else{ pega.cd.pmviewer.resetProcessModelerStateOnCanvasSel(contextReference); } } }, */ pxActivateShape : function(currShapeContext, prevShapeContext){ if(currShapeContext && currShapeContext !=\"\"){ var flowPage = currShapeContext; var isCanvasContext = true; if(currShapeContext.indexOf(\"pyModelProcess\") > 0){ flowPage = currShapeContext.substring(0, currShapeContext.indexOf(\"pyModelProcess\")-1); isCanvasContext = false; } var oSafeURL = new SafeURL(\"Rule-Obj-Flow.pzPMPropertiesPreProcessing\"); oSafeURL.put(\"CurrNodeRef\", currShapeContext); oSafeURL.put(\"PrevNodeRef\", prevShapeContext); oSafeURL.put(\"pzPrimaryPageName\", flowPage); var callback = { success : function (responseObj) {}, failure : function (oResponse) { console.log(\"Failed to perfom pre processing for: \"+currShapeContext); } }; var response = pega.u.d.asyncRequest('GET', oSafeURL, callback, null); if(isCanvasContext){ pega.cd.pmviewer.closePopoversOnCanvasSelect(); } } }, setCurrentFlowContext : function(FlowPageRef){ if(FlowPageRef && FlowPageRef !=\"\"){ var oSafeURL = new SafeURL(\"Rule-Obj-Flow.pzSetCurrentFlowContext\"); oSafeURL.put(\"CurrentContext\", FlowPageRef); oSafeURL.put(\"pzPrimaryPageName\", FlowPageRef); var callback = { success : function (responseObj) {}, failure : function (oResponse) { console.log(\"Failed to set the current flow context as: \"+FlowPageRef); } }; var response = pega.u.d.asyncRequest('GET', oSafeURL, callback, null); } }, refreshShapePropertyPanel : function(shapePageRef){ if(shapePageRef && shapePageRef !=\"\"){ var sectionNode=pega.u.d.getSectionByName(\"pzDisplayProcessModelerProperties\", shapePageRef, document); pega.u.d.reloadSectionEncoded(sectionNode, '', '', false, false, '-1', false); } }, renameShapeLabel : function(shapePageRef, newShapeLabel){ if(shapePageRef && shapePageRef !=\"\"){ var flowPageRef = shapePageRef.substring(0, shapePageRef.indexOf(\"pyModelProcess\")-1); var sectionNode=pega.u.d.getSectionByName(\"pzDisplayProcessModelerProperties\", flowPageRef, document); pega.u.d.reloadSectionEncoded(sectionNode, 'pzRenameShapeLabel', \"ShapeRefernce=\"+shapePageRef+\"&EditedLabel=\"+newShapeLabel, false, true, '-1', false); } }, destroyViewer : function() { if (typeof ViewerManager==='undefined'){ return false; } var v = ViewerManager.getViewer(); if (! v || v.state !== \"started\") { console.log(\"Could not retrieve a valid Viewer instance\"); return false; } v.destroy(); }, reloadViewer : function(){ if (typeof(ViewerManager) == \"undefined\") { console.log(\"Could not retrieve ViewerManager instance\"); return false; } var v = ViewerManager.getViewer(); if (! v || v.state !== \"started\") { console.log(\"Could not retrieve a valid Viewer instance\"); return false; } ViewerManager.executeAction(\"reload\"); }, closePopoversOnCanvasSelect : function(){ var popObj = pega.u.d.getPopOver(); if (popObj) { popObj.close(); } } }; pega.cd.pmviewer = new pega.cd_pmviewer(); </script> <style> g.selected rect.sleeper{ stroke-width: 15px !important; } .pm-canvas-header-tool i:not([disabled]):hover{ background-color: #ffffff; opacity: 1; } .pm-canvas-header-tool i{ opacity: 0.7; } </style> ");
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
	oStreamProperties_1.put("pyClassName", "Rule-Obj-Flow");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-OBJ-FLOW PZPROCESSMODELERSCRIPTS #20180713T140929.269 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzProcessModelerScripts");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-OBJ-FLOW PZPROCESSMODELERSCRIPTS #20180713T140929.269 GMT", "Rule-Obj-Flow pzProcessModelerScripts", "Pega-ProcessArchitect", "08-01-01", "20180713T140929.269 GMT");
}
