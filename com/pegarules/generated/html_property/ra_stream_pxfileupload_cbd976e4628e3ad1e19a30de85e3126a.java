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
import com.pega.pegarules.priv.runtime.IStaticContentRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.runtime.jsp.JSPTagHandlerPool;
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
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream PXFILEUPLOAD.
 */
public class ra_stream_pxfileupload_cbd976e4628e3ad1e19a30de85e3126a extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pxFileUpload.Stream");
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
	public ra_stream_pxfileupload_cbd976e4628e3ad1e19a30de85e3126a(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "81ed4e6eb9ca3aab2ae791b6c219fbd3fea1ede1";
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
/* Instance RULE-HTML-PROPERTY PXFILEUPLOAD #20230618T001653.077 GMT	Pega-Social:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PXFILEUPLOAD #20230618T001653.077 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PXFILEUPLOAD #20230618T001653.077 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_2();

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
/* end RULE-HTML-PROPERTY PXFILEUPLOAD #20230618T001653.077 GMT */
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
	"Rule-File-Text:WEBWB!PZPEGA_CONTROL_ATTACHUTIL!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Property:PXFILEUPLOAD", 
	"Rule-HTML-Property:CLIENTVALIDATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("WEBWB!PZPEGA_CONTROL_ATTACHUTIL!JS","Rule-File-Text","",false,"","Pega-UIEngine","","RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_ATTACHUTIL!JS #20230618T001608.967 GMT","WEBWB!PZPEGA_CONTROL_ATTACHUTIL!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PXFILEUPLOAD","Rule-HTML-Property","",false,"","Pega-Social","08-23-01","RULE-HTML-PROPERTY PXFILEUPLOAD #20230618T001653.077 GMT","PXFILEUPLOAD",true,false,"ABSOLUTE_CLASSLESS",-764178337), 
		new DependentRuleInfo("CLIENTVALIDATION","Rule-HTML-Property","",false,"","Pega-UIEngine","08-02-01","RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT","CLIENTVALIDATION",true,false,"ABSOLUTE_CLASSLESS",1287463259)
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
//	RULE-HTML-PROPERTY PXFILEUPLOAD #20230618T001653.077 GMT:20230724T070056.354 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT:20181008T083757.252 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_ATTACHUTIL!JS #20230618T001608.967 GMT:20230618T001608.967 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "fed4c2502dd3e32b1eca72408d32be8a";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName, java.lang.String aMode) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
_jspx_th_pega_reference_.setMode(aMode);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("bAddedValidationType", "true")) {
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", ",", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
tools.putSaveValue("validationAttributes", "validationType=\'");
tools.appendString(" ");
tools.putSaveValue("bAddedValidationType", "true");
tools.appendString(" ");
}
}
private void performStream_1() throws Throwable {
tools.appendString(" ");
out.print( tools.getParamValue("pega_attributes") );
tools.appendString(" ");

  String mode1 = tools.getSaveValue("mode1Action");
  String mode2 = tools.getSaveValue("mode2Action");

tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");
out.print(mode1);
tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");
out.print(mode2);
tools.appendString(" ");
}
tools.appendString("  ");

  /* BUG-394080: resetting mode1Action and mode2Action after added to control */
  tools.putSaveValue("mode1Action", "");
  tools.putSaveValue("mode2Action", "");

tools.appendString("  ");

String pvclientval = "";
com.pega.pegarules.pub.context.PRStackFrame previousStack = tools.getStackFrame().getPrevious();
int i = 5;
while(i != 0 && previousStack != null && previousStack.getParameterPage() != null){
pvclientval = previousStack.getParameterPage().getString("PVClientVal");
if(pvclientval != null && pvclientval.length() > 0) {
break;
}
i--;
previousStack = previousStack.getPrevious();

}

tools.appendString(" ");
tools.putSaveValue("validationAttributes", "");
tools.appendString("  ");
boolean isValidation = "true".equals(tools.getSaveValue("bClientValidation")) || "true".equals(pvclientval);
tools.appendString(" ");
	if (pega.isPreviewMode() || tools.getActive()!=null) {
tools.appendString(" ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || isValidation == true)) {
tools.appendString("  ");
tools.putSaveValue("bAddedValidationType", "false");
tools.appendString(" ");
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || (areValsEqual(lookupThisDefinition(tools, "pyOnInput"), "")))) {
tools.appendString("  ");
	if (pega.isPreviewMode() || (!areValsEqual(lookupThisDefinition(tools, "pyEditValidate"), ""))) {
tools.appendString("  ");
tools.putSaveValue("validationAttributes", "validationType=\'");
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyEditValidate").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
tools.putSaveValue("bAddedValidationType", "true");
tools.appendString(" ");
	}
tools.appendString(" ");
	if (pega.isPreviewMode() || !tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").equalsIgnoreCase("text")) {
tools.appendString(" ");
choose_1();
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_2("pega_validation", "")) {
tools.appendString("  ");
choose_1();
tools.appendString("  ");
pzAuto.putSaveRef("validationAttributes", "param.pega_validation", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_1("bAddedValidationType", "true")) {
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", "\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
tools.appendString(" ");
	if (when_2("pega_validation", "")) {
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes", "validationType=\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
pzAuto.putSaveRef("validationAttributes", "param.pega_validation", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", "\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
}
tools.appendString("  ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2) {
tools.appendString(" ");
tools.putSaveValue("validationAttributes", "");
tools.appendString(" ");
}
tools.appendString("  ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(validationAttributes)", "literal")) {
	return;
}
tools.appendString(" ");
	}
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
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "ClientValidation");
	oStreamProperties_2.put("pyRuleSetVersion", "08-02-01");
}
/**
 * Generates stream property_PegaSocial_Message_ClientValidation
 */
private void property_PegaSocial_Message_ClientValidation() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT	Pega-UIEngine:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_PegaSocial_Message_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN, java.lang.String aM) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
_jspx_th_p_r_.setM(aM);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__1(PageContext aPageContext, java.lang.String aType, java.lang.String aApp, boolean aMoveToEnd) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setType(aType);
_jspx_th_pega_static_.setApp(aApp);
_jspx_th_pega_static_.setMoveToEnd(aMoveToEnd);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString("\n        ");
	IStaticContentRuntime pzStatic__2 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__2.addFile("pzpega_control_attachutil", "11733279689", "js");
tools.appendString("\n    ");
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
 * OnlyOnce condition: pzpega_control_attachcontent
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("pzpega_control_attachcontent")) {
tools.appendString("\n    ");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb", true)) {
	return;
}
tools.appendString("\n");
}
}
private void performStream_2() throws Throwable {

pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection","","pyMaxFileSizeViolation",null,null);
pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection","","pxUploadFile",null,null);
pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection","","pzUploadFileWrapper",null,null);
pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection","","pzUploadFileWrapperForPost",null,null);
if(tools.getParamValue("UploadActivity") != "") {
pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection","",tools.getParamValue("UploadActivity"),null,null);
}

long maxFileSizeFromDSS = 0;
long maxFileUploadSizeBytes = 0;
String strMaxFileSizeDSS = "prconfig/Initialization/MaximumFileUploadSizeMB/default";
String strMaxFileSizeMBFromDSS = tools.getSystemSettings().getDynamic("Pega-Engine", strMaxFileSizeDSS);
strMaxFileSizeMBFromDSS = strMaxFileSizeMBFromDSS == null || strMaxFileSizeMBFromDSS.equals("") ? "0" : strMaxFileSizeMBFromDSS;
boolean selectMultipleFiles = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"SelectMultipleFiles");
boolean appendUniqueIdToFileName = tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"AppendUniqueIdToFileName");

pega_rules_utilities.pzRegisterRefresh(tools,"SingleSection","","pxUploadFile",null,null);
String selectMultiple = "";
if (selectMultipleFiles) {
  selectMultiple = "multiple";
}
try 
{
	maxFileSizeFromDSS = Long.parseLong(strMaxFileSizeMBFromDSS);
	maxFileSizeFromDSS = maxFileSizeFromDSS * 1048576; // Mega bytes to bytes
}
catch(NumberFormatException NFE) {}

try{
  String maxDragDropSize = tools.getSystemSettings().get("Pega-ProcessEngine", "pyMaxDragDropAttachSizeMB");
  maxDragDropSize = maxDragDropSize == null || maxDragDropSize.equals("") ? "1024" : maxDragDropSize;
  long maxFileUploadSizeMB = Long.parseLong(maxDragDropSize);
  maxFileUploadSizeBytes = maxFileUploadSizeMB * 1048576; //convert to bytes

  if(maxFileSizeFromDSS!=0)
	  maxFileUploadSizeBytes = maxFileUploadSizeBytes > maxFileSizeFromDSS ? maxFileSizeFromDSS : maxFileUploadSizeBytes;
}catch(NumberFormatException NFE) {}


tools.appendString("\n<script type=\"text/javascript\">\n\tif(window.name && window.name.indexOf(\"yuiIO\")==0) {\n\t\twindow.onerror=function(){return true;};\n\t}\n</script>\n\n<input type=\"hidden\" value=\"");
out.print(tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"AppendUniqueIdToFileName"));
tools.appendString("\" name=\"appendUniqueIdToFileName\">\n\n");
 
 if("pzUploadFile".equals(tools.getParameterPage().getString("FileSection")) || "pzUploadFileWithIcon".equals(tools.getParameterPage().getString("FileSection"))){

tools.appendString("\n<div class=\"file-input\">\n");

 }else{

tools.appendString("\n<div class =\"file-input file-input-comments\">\n");

 }

tools.appendString(" \n  \n  <input type=\"file\" ");
out.print(selectMultiple);
tools.appendString(" class=\"file-upload\" style=\"cursor:pointer;\" aria-label='");
out.print(tools.getLocalizedTextForString("pyActionPrompt", "\t[@baseclass.pyActionPrompt]" +  "No file chosen"));
tools.appendString("' title='");
out.print(tools.getLocalizedTextForString("pyActionPrompt", "\t[@baseclass.pyActionPrompt]" +  "No file chosen"));
tools.appendString("' name=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\" value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\" id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\" size=\"0\" contenteditable=\"false\" tabindex=\"-1\" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" onchange=\"uploadfile(this, event, '");
out.print(StringUtils.crossScriptingFilter(tools.getParamValue("UploadActivity")));
tools.appendString("', '");
out.print(StringUtils.crossScriptingFilter(tools.getParamValue("ReloadSection")));
tools.appendString("', '");
out.print(tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"ReloadCurrentSection"));
tools.appendString("','");
out.print(appendUniqueIdToFileName);
tools.appendString("');\" />\n  \n  \n\n  <div class=\"visible-file\" id=\"visible");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\">\n   ");
pzAuto.emitIncludeStreamReference("Param.FileSection", null, null, "Rule-HTML-Section", null);
tools.appendString(" \n  </div>\n\n</div>\n\n<style type=\"text/css\">\ninput[type=file]::-webkit-file-upload-button { /* chromes and blink button */\n    cursor: pointer; \n}\n</style>\n");
onlyOnce_1();
tools.appendString("  \n<script>\n  var targetObj;\n  function PopupFileBrowser(event){\n    $(event.target).closest(\"div.file-input\").children()[0].click();\n  }\n  \n  function uploadfile(src,event,activity,refreshSection,isRefreshCurrentSection,appendUniqueIdToFileName) {\n     pega.ctx.setFormEncoding(true);\n      if(activity == ''){\n        activity = 'pxUploadFile';\n      }\n\n      if (window.File && window.FileReader && window.FileList && window.Blob){\n        if ( pega.c.AttachUtil.isMaxFileSizeExceeded(");
out.print(maxFileUploadSizeBytes);
tools.appendString(", src) ) {\n          pega.c.AttachUtil.showMaxFileSizeViolation( event );\n          return;\n        }\n      }\n \n\t\t/* Refresh pzAttachFileDDFileList section to display the list of uploaded files*/\n\t\tif(!event)\n\t\t  event = window.event;\n    targetObj=pega.c.AttachUtil.getSelectedFileName(src);\n\t\tvar params=\"hiddenFileName=\"+encodeURIComponent(targetObj)+\"&MultipleFiles=\" + \"");
out.print(selectMultipleFiles);
tools.appendString("\" + \"&appendUniqueIdToFileName=\"+ appendUniqueIdToFileName;\n    \n   \n    //Need to refresh current section if the current section is not part of refreshsection passed     \n    if(isRefreshCurrentSection=='true'){      \n         var currentSectionNode=pega.u.d.getSectionsByName($(event.target).closest(\"div.sectionDivStyle\").attr(\"node_name\"), document);     \n         pega.u.d.reloadSection(currentSectionNode[0],null,params,true,true,null,null,event);\n         // Other section needs to be refreshed after refreshing current section i.e. submitting file upload request so using setInterval and refreshing section after current section is refreshed\n         var resetEncod = setInterval(function(){if(!pega.u.d.gIsScriptsLoading && !pega.u.d.isAjaxInProgress()){refreshUploadSection();clearInterval(resetEncod);}}, 200);       \n    }else {\n         refreshUploadSection();\n         setTimeout(function(){\n\t\t\t\t\t      pega.p.resetEncoding();\n\t\t     }, 200);\n    }  \t\t\n\t\t\n    function refreshUploadSection(){\n      \n      if(isRefreshCurrentSection=='true'){     \n        pega.p.resetEncoding();\n      }\n      \n      var sectionNodes = pega.u.d.getSectionsByName(refreshSection, document);\n\t\t  var sectionNode;\n      if (sectionNodes) {\n      var sectionsLen = sectionNodes.length;\n\t\t  if(activity != \"pzUploadFileWrapper\" && activity != \"pzUploadFileWrapperForPost\"){\n      for (i = 0; i < sectionsLen; i++) {\n\t      sectionNode = sectionNodes[i];\n\t\t\t  if(sectionNode && pega.util.Dom.isAncestor(sectionNode,pega.util.Event.getTarget(event))){\t\t\t\n\t\t\t\tbreak;\n      \t\t}\n      } \n       pega.u.d.reloadSection(sectionNode,activity,params,true,true,null,null,event); \n      }else{\n       for (i = 0; i < sectionsLen; i++) {\n\t       sectionNode = sectionNodes[i];\n\t\t\t  if(sectionNode) \n\t\t\t\t  pega.u.d.reloadSection(sectionNode,activity,params,true,true,null,null,event); \n        }\n      }\n      } else {\n\t\t    pega.u.d.reloadSection(sectionNode,activity,params,true,true,null,null,event); \t\n\t    }\n   \n      if($(src).parents(\"[data-node-id^='pyDisplayReplies']\").length>0){\t\n  \t\t\t$(src).parents(\"[data-node-id^='pyDisplayReplies']\").find(\"#pyReplyText\").focus();\n        }\n  \t\telse{\n  \t\t\t$(src).parents(\"[data-node-id='pyPostMessage']\").find(\"#pyMessage\").focus();        \n        }\n    \n    var overlayReplyNode=$(\"[node_name='pyPulseUploadReply']\");\n    if(overlayReplyNode)  {\n      overlayReplyNode = overlayReplyNode.parents('div#po0');\n    if(overlayReplyNode)\n      overlayReplyNode.remove();\n     }\n      \n    var overlayReplyNode=$(\"[node_name='pyPulseUploadComments']\");\n    if(overlayReplyNode)  {\n      overlayReplyNode = overlayReplyNode.parents('div#po0');\n    if(overlayReplyNode)\n      overlayReplyNode.remove();\n     }\n    \n    var overlayPostNode=$(\"[node_name='pyPulseUpload']\");\n        if(overlayPostNode)  {\n          overlayPostNode = overlayPostNode.parents('div#po0');\n        if(overlayPostNode)\n          overlayPostNode.remove();\n       }              \n\t\t      \n    }\n    \n\t}\n  \t \ntry{    \n      \ndocument.getElementById('\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\"').style.float=\"right\";\n                                                       \n\t\t \n}catch(e){}\t\n</script>");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PXFILEUPLOAD #20230618T001653.077 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Social");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pxFileUpload");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PXFILEUPLOAD #20230618T001653.077 GMT", "pxFileUpload", "Pega-Social", "08-23-01", "20230724T070056.354 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
}
