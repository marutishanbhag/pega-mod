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
 * Builds JSP stream PZSHAPEDRAGDROP.
 */
public class ra_stream_pzshapedragdrop_256a7eef33983d94d44bb75089661076 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pzShapeDragDrop.Stream");
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
	public ra_stream_pzshapedragdrop_256a7eef33983d94d44bb75089661076(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "bc862f618416de3bc1d703509349e7edd16e3bf2";
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
/* Instance RULE-HTML-PROPERTY PZSHAPEDRAGDROP #20230618T001732.254 GMT	Pega-ProcessArchitect:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZSHAPEDRAGDROP #20230618T001732.254 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZSHAPEDRAGDROP #20230618T001732.254 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY PZSHAPEDRAGDROP #20230618T001732.254 GMT */
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
	"Rule-HTML-Property:PZSHAPEDRAGDROP"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZSHAPEDRAGDROP","Rule-HTML-Property","",false,"","Pega-ProcessArchitect","08-23-01","RULE-HTML-PROPERTY PZSHAPEDRAGDROP #20230618T001732.254 GMT","PZSHAPEDRAGDROP",true,false,"ABSOLUTE_CLASSLESS",-73385468)
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
//	RULE-HTML-PROPERTY PZSHAPEDRAGDROP #20230618T001732.254 GMT:20230618T001732.254 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "4231474afcf0e0bea0485864c4a86823";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private void performStream_1() throws Throwable {


String dragStageDivId = StringUtils.crossScriptingFilter(tools.getActiveValue());

String shapeIcon = tools.getStepPage().getString(".pyShapeIcon");
String label = tools.getStepPage().getString(".pyShapeName");
// Localise step name
label = tools.getLocalizedTextForParameterizedString("pyButtonLabel", label);
label = pega_rules_utilities.escapeSpecialCharsAndQuote(label);
String rowId = tools.getStepPage().getString(".pxListSubscript");
ClipboardPage processPage = tools.getStepPage().getParentPage();

//BUG-245902 fix - disable shape re-ordering/drag-drop if parent process or case type is locked
boolean caseTypeLocked = tools.findPage("CaseTypeStages").getString(".pxInstanceLockedBy") !=""? true : false;
boolean parentProcessLocked = processPage.getString(".pyCheckedOutOrLocked") != ""? true : false;
//BUG-245902 fix - end

//EPIC-16612 - get process type to disable shape re-orderring for Complex process
StringMap whenKeys1 = new HashStringMap();
whenKeys1.putString("pyClassName", processPage.getClassName());
whenKeys1.putString("pyBlockName", "pzIsComplexProcessOrHasDecision");
PRStackFrame whenCond = pega.pushStackFrame("when", null, processPage, false, false);
boolean isSimpleLinearProcess = tools.evaluateWhen(whenKeys1) ? false : true;
pega.popStackFrame(whenCond, false); 
//EPIC-16612 - end

String colourClass = "pi pi-cd-assignment";
String shapeType = tools.getStepPage().getString(".pyShapeType");
if("Assignment".equals(shapeType) || "AssignmentSF".equals(shapeType)){
  colourClass = "pi pi-cd-assignment";
}else if("Utility".equals(shapeType) || "UtilitySF".equals(shapeType) || "Wait".equals(shapeType) || "RunInteraction".equals(shapeType) || "Integrator".equals(shapeType)){
  colourClass = "pi pi-cd-utility";
}else if("SubProcess".equals(shapeType) || "SubProcessSF".equals(shapeType) || "SplitForEach".equals(shapeType) || "SplitJoin".equals(shapeType) || "ConversationFlow".equals(shapeType) ){
  colourClass = "pi pi-cd-process";
}
else if("Decision".equals(shapeType)){
  colourClass = "pi pi-cd-decision";
}
else if("GenerativeAI".equals(shapeType)){
  colourClass = "pi pi-cd-GenerativeAI";
}

boolean showSVG = false;
String svgFile = "";
String shapeImpl = tools.getStepPage().getString(".pyShapeImpl");
ClipboardPage shapePage = tools.findPage(shapeImpl);
if(shapePage != null){
  String implementation = shapePage.getString(".pyImplementation");
  if("pzChangeStageWrapper".equals(implementation) || "pxChangeToSpecifiedStage".equals(implementation) || "pxChangeToNextStage".equals(implementation)){
    showSVG = true;
    svgFile = "webwb/pzChangeStage.svg";
  }else if("pxCreatePDF".equals(implementation)){
    showSVG = true;
    svgFile = "webwb/pzCreatePDF.svg";
  }else if("pxSendViaDocusign".equals(implementation)){
    showSVG = true;
    svgFile = "webwb/pySendViaDocuSignAPIIcon.svg";
  }
  else if("pzCreateRoboticAssignment".equals(implementation)){
    showSVG = true;
    svgFile = "webwb/pzRoboticCaseAPIIcon.svg";
  }
  else if("RunInteraction".equals(implementation)){
    showSVG = true;
    svgFile = "webwb/pzRunInteractionStepIcon.svg";
  }
    else if("pzSaveDataPage".equals(implementation)){
    showSVG = true;
    svgFile = "webwb/pzSaveDataPageStepPaletteIcon.svg";
  }
  else if("pzLoadDataPage".equals(implementation)){
    showSVG = true;
    svgFile = "webwb/pzLoadDataPageStepPaletteIcon.svg";
  }
  else if("pzRunInBackground".equals(implementation)){
    showSVG = true;
    svgFile = "webwb/pzRunInBackgroundStepIcon.svg";
  }
  else if("pzGenerateDocument".equals(implementation)){
    showSVG = true;
    svgFile = "images/pyGenerateDocument.svg";
  }
  
  //decision shape icon svg
  String pxObjClass = shapePage.getString(".pxObjClass");
  if("Data-MO-Gateway-Decision".equals(pxObjClass)){
    showSVG = true;
    svgFile = "webwb/pzDecisionStepIcon.svg";
  }
}

String uniqueId = tools.getParamValue("makeIDUnique");

ClipboardPage stagePage = processPage.getParentPage();
String processPgRef = processPage.getReference();

// Check if the parent process is stage wide structured/optional process or Case wide optional process
if("Embed-Stage".equals(stagePage.getClassName())){
  //stage wide structured or optional processes
  StringMap whenKeys = new HashStringMap();
  whenKeys.putString("pyClassName", stagePage.getClassName());
  whenKeys.putString("pyBlockName", "pzIsAlternateStage");
  PRStackFrame when = pega.pushStackFrame("when", null, stagePage, false, false);

  if(!tools.evaluateWhen(whenKeys)) {
    //dragStageDivId = "CaseTypeStages."+"pyStages"+stagePage.getString(".pxListSubscript")+"."+"pyProcesses"+processPage.getString(".pxListSubscript")+"."+"pyShapeNodes"+rowId+uniqueId;
    dragStageDivId = processPgRef+"."+"pyShapeNodes"+rowId+uniqueId;
  }else{
    //dragStageDivId = "CaseTypeStages."+"pyAlternateStages"+stagePage.getString(".pxListSubscript")+"."+"pyProcesses"+processPage.getString(".pxListSubscript")+"."+"pyShapeNodes"+rowId+uniqueId;
    dragStageDivId = processPgRef+"."+"pyShapeNodes"+rowId+uniqueId;
  }

  pega.popStackFrame(when, false);
}
else{
  //case wide optional process
  //dragStageDivId = "CaseTypeStages."+"pyCaseOptionalProcesses"+processPage.getString(".pxListSubscript")+"."+"pyShapeNodes"+rowId+uniqueId;
  dragStageDivId = processPgRef+"."+"pyShapeNodes"+rowId+uniqueId;
}

//BUG-245902: enabled shape drag drop functionality only when neither parent process nor case type is locked,
//EPIC-16612: and parent process is Simple or Simple linear (Linear with decision shape is considered as complex linear)
boolean isDragDropEnabled = isSimpleLinearProcess && !parentProcessLocked && !caseTypeLocked? true : false;

//change the onmouseover cursor type to default when shape drag drop disabled
String cursorType = isDragDropEnabled ? "move" : "pointer";

tools.appendString(" ");

String dragDropClass = "";
if (isDragDropEnabled) {
  dragDropClass = "shapeDragDrop";
}

tools.appendString(" <div id=\"");
out.print( dragStageDivId );
tools.appendString("\" data-rowIndex=\"");
out.print(rowId);
tools.appendString("\" style=\"cursor:");
out.print( cursorType );
tools.appendString("\" class=\"cd-step-icon ");
out.print( colourClass );
tools.appendString(" ");
out.print( dragDropClass );
tools.appendString("\"><span> ");

if (showSVG) {

tools.appendString(" <img src=\"");
out.print(svgFile);
tools.appendString("\"> ");

} else {

tools.appendString(" <i class=\"");
out.print( shapeIcon );
tools.appendString("\"></i> ");

}

tools.appendString(" </span></div>");
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZSHAPEDRAGDROP #20230618T001732.254 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzShapeDragDrop");
	oStreamProperties_1.put("pyRuleSetVersion", "08-23-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZSHAPEDRAGDROP #20230618T001732.254 GMT", "pzShapeDragDrop", "Pega-ProcessArchitect", "08-23-01", "20230618T001732.254 GMT");
}
