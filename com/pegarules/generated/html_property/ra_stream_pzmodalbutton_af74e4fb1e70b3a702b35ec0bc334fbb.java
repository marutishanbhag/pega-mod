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
 * Builds JSP stream PZMODALBUTTON.
 */
public class ra_stream_pzmodalbutton_af74e4fb1e70b3a702b35ec0bc334fbb extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pzModalButton.Stream");
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
	public ra_stream_pzmodalbutton_af74e4fb1e70b3a702b35ec0bc334fbb(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "53bc6babaf84c3944d5ddb058c946a55d7b98c87";
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
/* Instance RULE-HTML-PROPERTY PZMODALBUTTON #20190516T144010.491 GMT	Pega-UIEngine:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZMODALBUTTON #20190516T144010.491 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZMODALBUTTON #20190516T144010.491 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
}
/* end RULE-HTML-PROPERTY PZMODALBUTTON #20190516T144010.491 GMT */
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
	"Rule-HTML-Property:PZMODALBUTTON", 
	"Rule-HTML-Property:BUTTON", 
	"Rule-HTML-Property:CLIENTVALIDATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZMODALBUTTON","Rule-HTML-Property","",false,"","Pega-UIEngine","08-03-01","RULE-HTML-PROPERTY PZMODALBUTTON #20190516T144010.491 GMT","PZMODALBUTTON",true,false,"ABSOLUTE_CLASSLESS",-185598197), 
		new DependentRuleInfo("BUTTON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-07-01","RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT","BUTTON",true,false,"ABSOLUTE_CLASSLESS",212046735), 
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
//	RULE-HTML-PROPERTY PZMODALBUTTON #20190516T144010.491 GMT:20190516T144010.491 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT:20210728T105250.178 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT:20181008T083757.252 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "fbaa52de3513058fc6232033e8d86a2e";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private static final String[] showMeParams_1 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Final", "", "Pega-Gadgets", "08-07-01", "", "Button", "", "RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT" };
private boolean when_3(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_5() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_3("bAddedValidationType", "true")) {
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
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");
out.print(mode1);
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2) {
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
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || isValidation == true)) {
tools.appendString("  ");
tools.putSaveValue("bAddedValidationType", "false");
tools.appendString(" ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || (areValsEqual(lookupThisDefinition(tools, "pyOnInput"), "")))) {
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
choose_5();
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_1("pega_validation", "")) {
tools.appendString("  ");
choose_5();
tools.appendString("  ");
pzAuto.putSaveRef("validationAttributes", "param.pega_validation", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_3("bAddedValidationType", "true")) {
tools.appendString(" ");
pzAuto.putSaveValue("validationAttributes", "\'", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
tools.appendString(" ");
	if (when_1("pega_validation", "")) {
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

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
tools.appendString(" ");
tools.putSaveValue("validationAttributes", "");
tools.appendString(" ");
}
tools.appendString("  ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(validationAttributes)", "literal")) {
	return;
}
tools.appendString(" ");
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
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "ClientValidation");
	oStreamProperties_3.put("pyRuleSetVersion", "08-02-01");
}
/**
 * Generates stream property_Rule_RuleSet_Version_ClientValidation
 */
private void property_Rule_RuleSet_Version_ClientValidation() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT	Pega-UIEngine:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_2)) {
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_2,true);
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
property_Rule_RuleSet_Version_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__2(PageContext aPageContext, java.lang.String aName, java.lang.String aMode) throws Throwable {
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
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_4() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("ToolTip", "")) {
pzAuto.putSaveRef("strToolTip", "param.ToolTip", IAutoStreamRuntime.SAVE_SET);

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.putSaveValue("strToolTip", " ");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("Type", "")) {
pzAuto.putSaveRef("strType", "param.Type", IAutoStreamRuntime.SAVE_SET);

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.putSaveValue("strType", "button");
}
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
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
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("ButtonStyle", "")) {
pzAuto.putSaveRef("strButtonStyle", "param.ButtonStyle", IAutoStreamRuntime.SAVE_SET);

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.putSaveValue("strButtonStyle", "");
}
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("Caption", "")) {
pzAuto.putSaveRef("strCaption", "param.Caption", IAutoStreamRuntime.SAVE_SET);

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.putSaveValue("strCaption", " ");
}
}
private void performStream_2() throws Throwable {
 String strCaption = ""; 
tools.appendString(" ");
choose_1();
tools.appendString("  ");
choose_2();
tools.appendString("  ");
	if (when_1("Image", "")) {
pzAuto.putSaveRef("strImage", "param.Image", IAutoStreamRuntime.SAVE_SET);
	}
tools.appendString(" ");

	String sImage = tools.getParamValue("Image");
	if (!sImage.equals("")) {
		sImage = sImage.replaceAll("&quot;", "\"");

		tools.putSaveValue("strImage", sImage);

	}
	strCaption=StringUtils.crossScriptingFilter(tools.getParamValue("Caption"));
	tools.putSaveValue("BUTTON-caption", tools.getLocalizedTextForString(".pyButtonLabel",strCaption));

tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (areValsEqual(tools.getProperty("pxRequestor.pyPegaDesignMode").getStringValue(), "true")))) {
tools.appendString(" ");
	if (when_1("ImageOnly", "-1")) {
tools.appendString(" <table border=\"0\" class=\"buttonMainTable ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_p_r__1(pageContext, "$save(strButtonStyle)", "literal")) {
	return;
}
tools.appendString("\" cellspacing=\"0\" cellpadding=\"0\" ");
	if (when_1("TableId", "")) {
tools.appendString("id=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strTableId)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strTableId)")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" > <tr> <td class=\"buttonTdLeft\" onclick=\"if(typeof(pega) !='undefined' && pega.u.d) pega.u.d.fireButtonClick(this.parentNode);\"><div class=\"buttonLeftContent\"><div class=\"buttonLeftContentInner\">&nbsp;</div></div></td> <td nowrap class=\"buttonTdMiddle\"> ");
	}
tools.appendString(" <button class=\"buttonTdButton\" PEGA_VERSION=\"HTMLPROPERTY\"> ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("Image"), ""))) {
tools.appendString("<img style=\"padding-right:3px;vertical-align:middle\" ");

							String strImage = tools.getSaveValue("strImage");
							if(strImage.indexOf(".")!=-1)
								tools.appendString("src=" + strImage);
							else
								tools.appendString("class=" + strImage);

						
tools.appendString(" ></img>");
	}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(BUTTON-caption)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(BUTTON-caption)")) {
	return;
}
tools.appendString(" </button> ");
	if (when_1("ImageOnly", "-1")) {
tools.appendString(" </td> <td class=\"buttonTdRight\" onclick=\"if(typeof(pega) !='undefined' && pega.u.d) pega.u.d.fireButtonClick(this.parentNode);\"><div class=\"buttonRightContent\"><div class=\"buttonRightContentInner\">&nbsp;</div></div></td> </tr> </table> ");
	}
tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString("  ");
choose_3();
tools.appendString("  ");
choose_4();
tools.appendString("  ");
	if (when_1("Name", "")) {
pzAuto.putSaveRef("strName", "param.Name", IAutoStreamRuntime.SAVE_SET);
	}
tools.appendString(" ");
	if (when_1("Id", "")) {
pzAuto.putSaveRef("strId", "param.Id", IAutoStreamRuntime.SAVE_SET);
	}
tools.appendString(" ");
	if (when_1("TableId", "")) {
pzAuto.putSaveRef("strTableId", "param.TableId", IAutoStreamRuntime.SAVE_SET);
	}
tools.appendString(" ");
	if (when_1("OnClick", "")) {
pzAuto.putSaveRef("strOnClick", "param.OnClick", IAutoStreamRuntime.SAVE_SET);
	}
tools.appendString(" ");
	if (pega.isPreviewMode() || tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"Disabled") == true) {
tools.putSaveValue("strDisabled", "disabled");
	}
tools.appendString(" ");
	if (when_1("DisabledWhen", "")) {
pzAuto.putSaveRef("DisabledWhen", "param.DisabledWhen", IAutoStreamRuntime.SAVE_SET);
	}
tools.appendString(" ");

		strCaption=StringUtils.crossScriptingFilter(tools.getParamValue("Caption"));
		
		boolean isNotJSP = pega_procom_harness.IsNotJSP(strCaption);
		boolean bParam = pega_procom_harness.IsParam(strCaption);
		boolean bIsLiteral = pega_rules_string.isLiteral(strCaption);
		boolean bGetAKeyRun = bIsLiteral && isNotJSP;
		String attributeString = "";
		String valueString = "";
		if(bGetAKeyRun) {
			strCaption = tools.getLocalizedTextForString(".pyButtonLabel",strCaption);
			boolean hasAmpersand = (strCaption.indexOf("&") > - 1);
			if(hasAmpersand) {
        strCaption= strCaption.replaceAll("&amp;","&");
				attributeString = pega_uiengine_harness.pzGetAKey(".pyButtonLabel", strCaption, bParam);
				valueString = tools.getParamValue("pzULabel");
				tools.putSaveValue("BUTTON-caption", valueString);
			} else {
				tools.putSaveValue("BUTTON-caption",strCaption);
			}
		} else {
			tools.putSaveValue("BUTTON-caption", tools.getLocalizedTextForString(".pyButtonLabel",strCaption));
		}
		String strToolTip=tools.getParamValue("ToolTip");
		tools.putSaveValue("BUTTON-tooltip", tools.getLocalizedTextForString(".pyMessageLabel",strToolTip));


		String disabledWhen = tools.getSaveValue("DisabledWhen");
		if(!disabledWhen.equals("") && com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, disabledWhen, null, false)){
			tools.putSaveValue("DisabledWhen","true");
			tools.putSaveValue("strDisabled","disabled");
		}
		String strOnClick = tools.getSaveValue("strOnClick");
		strOnClick = strOnClick.trim();
		/* Check for the double quotes or single quotes at begin and end. If present trim them*/
		if((strOnClick.startsWith("\"") && strOnClick.endsWith("\"")) || (strOnClick.startsWith("'") && strOnClick.endsWith("'"))){
			strOnClick = strOnClick.substring(1,strOnClick.length()-1);
			tools.putSaveValue("strOnClick",strOnClick);
		}

	
tools.appendString("  ");
	if (when_1("ImageOnly", "-1")) {
tools.appendString(" <table border=\"0\" class=\"buttonMainTable ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_p_r__1(pageContext, "$save(strButtonStyle)", "literal")) {
	return;
}
tools.appendString("\" cellspacing=\"0\" cellpadding=\"0\" ");
	if (when_1("TableId", "")) {
tools.appendString("id=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strTableId)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strTableId)")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" > <tr> <td class=\"buttonTdLeft\" onclick=\"if(typeof(pega) !='undefined' && pega.u.d) pega.u.d.fireButtonClick(this.parentNode);\"><div class=\"buttonLeftContent\"><div class=\"buttonLeftContentInner\">&nbsp;</div></div></td> <td nowrap class=\"buttonTdMiddle\"> ");
	}
tools.appendString(" <button ");
out.print(attributeString);
tools.appendString(" class=\"buttonTdButton\" PEGA_VERSION=\"HTMLPROPERTY\" ");
	if (when_1("Id", "")) {
tools.appendString("id=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strId)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strId)")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" ");
	if (when_1("Name", "")) {
tools.appendString("name=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strName)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strName)")) {
	return;
}
tools.appendString("\"");
	}
tools.appendString(" ");
	if (when_1("OnClick", "")) {
tools.appendString("onclick=\"if(typeof(pega) !='undefined' && pega.u.d) setUserStart(); ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strOnClick)", "literal")) {
	return;
}
tools.appendString("; \"");
	}
tools.appendString(" ");
	if (pega.isPreviewMode() || tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"BindKeyupOnly") == true) {
tools.appendString(" onkeydown=\"if(event.keyCode==13) pega.util.Event.preventDefault(event);\" onkeyup=\"if(event.keyCode==13){if(typeof(pega) !='undefined' && pega.u.d) setUserStart(); ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strOnClick)", "literal")) {
	return;
}
tools.appendString(";}\" ");
	}
tools.appendString("  ");
	if (when_2("bGridButton", "true")) {
tools.appendString("onkeypress=\"pega.util.Event.stopPropagation(event)\"");
	}
tools.appendString(" ");
	if (pega.isPreviewMode() || (tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"Disabled") == true)
						||  tools.getSaveValue("DisabledWhen") == "true") {

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strDisabled)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strDisabled)")) {
	return;
}
	}
tools.appendString(" type=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strType)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strType)")) {
	return;
}
tools.appendString("\" ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("ToolTip"), ""))) {
tools.appendString("title = \"");
out.print(tools.getSaveValue("BUTTON-tooltip"));
tools.appendString("\" alt = \"");
out.print(tools.getSaveValue("BUTTON-tooltip"));
tools.appendString("\"");
	}
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

tools.appendString(" > ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("Image"), ""))) {
tools.appendString("<img style=\"padding-right:3px;vertical-align:middle\" ");

							String strImage = tools.getSaveValue("strImage");
							if(strImage.indexOf(".")!=-1)
								tools.appendString("src=" + strImage);
							else
								tools.appendString("class=" + strImage);

						
tools.appendString(" ></img>");
	}
tools.appendString(" ");
out.print(tools.getSaveValue("BUTTON-caption"));
tools.appendString(" </button> ");
	if (when_1("ImageOnly", "-1")) {
tools.appendString(" </td> <td class=\"buttonTdRight\" onclick=\"if(typeof(pega) !='undefined' && pega.u.d) pega.u.d.fireButtonClick(this.parentNode);\"><div class=\"buttonRightContent\"><div class=\"buttonRightContentInner\">&nbsp;</div></div></td> </tr> </table> ");
	}
tools.appendString(" ");
tools.putSaveValue("DisabledWhen","");
tools.appendString(" ");
}
tools.appendString(" ");
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
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "Button");
	oStreamProperties_2.put("pyRuleSetVersion", "08-07-01");
}
/**
 * Generates stream property_Rule_RuleSet_Version_Button
 */
private void property_Rule_RuleSet_Version_Button() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT	Pega-Gadgets:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,true);
}
/* end RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_RuleSet_Version_Button();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_3() throws Throwable {

boolean bShowFAButtons = Boolean.parseBoolean(tools.getSaveValue("pyShowFAButtons"));
Boolean isOnline = !pega_uiengine_offlinesupport.pzIsForOfflineTemplate();
Boolean isForcedForPackaging = Boolean.parseBoolean(tools.getParamValue("forcedForPackaging"));
/*Regardless of setting always package modal buttons and hide/show based on packaged value*/
if(!isOnline || isForcedForPackaging){
  bShowFAButtons = false;
}
if(bShowFAButtons)//If display the buttons from FA rule is seleted then dont display any buttons.
	return;

boolean bCustomizeLabels = Boolean.parseBoolean(tools.getSaveValue("pyCustomizeFALabels"));
//sings9: Don't generate the custom label on buttons if it is for Offline.
if(!isOnline || isForcedForPackaging){
  bCustomizeLabels = false;
}

String caption = tools.getParamValue("Caption");
if(tools.getParamValue("Action").toUpperCase().equals("SUBMIT")){
  if(tools.getParamValue("OnClick").equals(""))
    tools.putParamValue("OnClick", "doModalAction(pega.u.d.submitModalDlgParam,event)");

  if(bCustomizeLabels){
    caption = tools.getSaveValue("pySubmitLabel");	
  }else if(tools.getParamValue("Caption").equals("")){
    caption = "Ok";
  }
}else if(tools.getParamValue("Action").toUpperCase().equals("CANCEL")){
  /* BUG-482526: Register SubmitModalFlowAction for non-template grid */
  com.pega.pegarules.priv.context.PegaThread prThread = (com.pega.pegarules.priv.context.PegaThread) tools.getThread();
  java.util.Map<String, String> config = new java.util.HashMap<String, String>();
  config.put("pyActivity","SubmitModalFlowAction");
  prThread.registerQueryString(prThread.getName(), config);
  
  if(bCustomizeLabels){
    caption = tools.getSaveValue("pyCancelLabel");		
  }else if(tools.getParamValue("Caption").equals("")){
    caption = "Cancel";
  }
  if(tools.getParamValue("OnClick").equals(""))
    tools.putParamValue("OnClick", "doModalAction('',event)");
}
else if(tools.getParamValue("Action").toUpperCase().equals("NEXT")){
  if(bCustomizeLabels){
    caption = tools.getSaveValue("pyNextLabel");	
  }else if(tools.getParamValue("Caption").equals("")){
    caption = "Next";
  }
}else if(tools.getParamValue("Action").toUpperCase().equals("PREVIOUS")){
  if(bCustomizeLabels){
    caption = tools.getSaveValue("pyPreviousLabel");	
  }else if(tools.getParamValue("Caption").equals("")){
    caption = "Previous";
  }
}	
if(bCustomizeLabels){
  tools.putParamValue("ToolTip", caption);
}else{
  if(tools.getParamValue("ToolTip").equals("")){
    tools.putParamValue("ToolTip", "");
  }
}
tools.putParamValue("Caption", caption);


tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT */
include_2();

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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZMODALBUTTON #20190516T144010.491 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzModalButton");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZMODALBUTTON #20190516T144010.491 GMT", "pzModalButton", "Pega-UIEngine", "08-03-01", "20190516T144010.491 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY BUTTON #20210706T092242.273 GMT", "Button", "Pega-Gadgets", "08-07-01", "20210728T105250.178 GMT");
}
