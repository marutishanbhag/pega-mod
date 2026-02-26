package com.pegarules.generated.html_property;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
 * Builds JSP stream PXOPERATORIMAGE.
 */
public class ra_stream_pxoperatorimage_db83d4281191205f539158b603347cf4 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pxOperatorImage.Stream");
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
	public ra_stream_pxoperatorimage_db83d4281191205f539158b603347cf4(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "45db547308d0d635eff2916d665ece46b8bae283";
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
/* Instance RULE-HTML-PROPERTY PXOPERATORIMAGE #20210809T193147.384 GMT	Pega-Social:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PXOPERATORIMAGE #20210809T193147.384 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PXOPERATORIMAGE #20210809T193147.384 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY PXOPERATORIMAGE #20210809T193147.384 GMT */
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
	"Rule-File-Text:WEBWB!PY-AVATAR!CSS", 
	"Rule-File-Text:WEBWB!PZOPERATORPRESENCESCRIPT!JS", 
	"Rule-File-Text:WEBWB!PYOPERATORPRESENCECOLORS!CSS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:PZACTIONSETATTRIBUTES", 
	"Rule-HTML-Property:PXOPERATORIMAGE", 
	"Rule-HTML-Property:CLIENTVALIDATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("WEBWB!PY-AVATAR!CSS","Rule-File-Text","",false,"","Pega-EndUserUI","","RULE-FILE-TEXT WEBWB PY-AVATAR!CSS #20180713T134720.576 GMT","WEBWB!PY-AVATAR!CSS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZOPERATORPRESENCESCRIPT!JS","Rule-File-Text","",false,"","Pega-Social","","RULE-FILE-TEXT WEBWB PZOPERATORPRESENCESCRIPT!JS #20200323T213127.710 GMT","WEBWB!PZOPERATORPRESENCESCRIPT!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PYOPERATORPRESENCECOLORS!CSS","Rule-File-Text","",false,"","Pega-Social","","RULE-FILE-TEXT WEBWB PYOPERATORPRESENCECOLORS!CSS #20200323T213127.657 GMT","WEBWB!PYOPERATORPRESENCECOLORS!CSS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZACTIONSETATTRIBUTES","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT","PZACTIONSETATTRIBUTES",true,false,"ABSOLUTE_CLASSLESS",791254997), 
		new DependentRuleInfo("PXOPERATORIMAGE","Rule-HTML-Property","",false,"","Pega-Social","08-07-01","RULE-HTML-PROPERTY PXOPERATORIMAGE #20210809T193147.384 GMT","PXOPERATORIMAGE",true,false,"ABSOLUTE_CLASSLESS",1812725946), 
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
//	RULE-HTML-PROPERTY PXOPERATORIMAGE #20210809T193147.384 GMT:20210809T193147.384 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB PZOPERATORPRESENCESCRIPT!JS #20200323T213127.710 GMT:20200323T213127.710 GMT
//	RULE-FILE-TEXT WEBWB PYOPERATORPRESENCECOLORS!CSS #20200323T213127.657 GMT:20200323T213127.657 GMT
//	RULE-FILE-TEXT WEBWB PY-AVATAR!CSS #20180713T134720.576 GMT:20180713T134720.576 GMT
//	RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT:20180713T133243.581 GMT
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
		return "9e08185592dd01ac37a59dbc7f12adc2";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a pega:contentURL tag.
 */private boolean _jspx_meth_pega_contentURL__1(PageContext aPageContext, java.lang.String aName, java.lang.String aPath, java.lang.String aClassType, java.lang.String aEnforceAbsoluteURL) throws Throwable {
/* pega:contentURL */
com.pega.pegarules.jsptags.ContentURLTag _jspx_th_pega_contentURL_ = (com.pega.pegarules.jsptags.ContentURLTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ContentURLTag.class);
_jspx_th_pega_contentURL_.setPageContext(pageContext);
_jspx_th_pega_contentURL_.setParent(mParentTag);
_jspx_th_pega_contentURL_.setName(aName);
_jspx_th_pega_contentURL_.setPath(aPath);
_jspx_th_pega_contentURL_.setClassType(aClassType);
_jspx_th_pega_contentURL_.setEnforceAbsoluteURL(aEnforceAbsoluteURL);
int _jspx_eval_pega_contentURL_ = _jspx_th_pega_contentURL_.doStartTag();
if (_jspx_th_pega_contentURL_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_contentURL_);
return false;
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

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
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
if (_jspx_meth_pega_reference__1(pageContext, "$save(validationAttributes)", "literal")) {
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
 * Generates stream property_PegaAccel_Task_BuildApplication_ClientValidation
 */
private void property_PegaAccel_Task_BuildApplication_ClientValidation() {
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
property_PegaAccel_Task_BuildApplication_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_2() throws Throwable {
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_1();

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
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzActionSetAttributes");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_2 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_2);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_2);
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
/* end RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
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
	IStaticContentRuntime pzStatic__6 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__6.addFile("py-avatar", "11622621979", "css");
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
	IStaticContentRuntime pzStatic__4 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__4.addFile("pyoperatorpresencecolors", "12077391659", "css");
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
tools.appendString(" ");
	IStaticContentRuntime pzStatic__2 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__2.addFile("pzoperatorpresencescript", "11077853251", "js");
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
 * OnlyOnce condition: OperatorPresenceStatusScripts
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("OperatorPresenceStatusScripts")) {
tools.appendString(" ");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb", true)) {
	return;
}
tools.appendString(" ");
}
}
private void performStream_3() throws Throwable {
onlyOnce_1();
tools.appendString(" ");
if (_jspx_meth_pega_static__2(pageContext, "style", "webwb")) {
	return;
}
tools.appendString(" ");

  StringMap pzIsOfflineEnabledMap = new HashStringMap();
  pzIsOfflineEnabledMap.putString("pyBlockName", "pzIsOfflineEnabled");
  boolean pzIsOfflineEnabled = tools.evaluateWhen(pzIsOfflineEnabledMap);
	String operatorPresenceEnabled = StringUtils.crossScriptingFilter(tools.getParamValue("OperatorPresenceEnabled"));
  

  // Default the availableStatusStyle for both DISCONNECTED & OFFLINE statuses
	String availableStatusStyle = "display:none;";
	String statusColourWithoutImage = "fill:#20AA50;";
  String statusColourWithImage = "background:#20AA50;";
	String status = "OFFLINE";
  String showMiniProfile = "";
  String operatorStatusClass = "defaultoperatorstatus";
  String state="";
  if(!pzIsOfflineEnabled) {
    if(!"".equals(StringUtils.crossScriptingFilter(tools.getParamValue("OperatorID")))){
      showMiniProfile = StringUtils.crossScriptingFilter(String.valueOf(tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE,"ShowMiniProfile")));
    };
    // evaluate pyOperatorPresenceStatusEnabled when rule
    if (operatorPresenceEnabled.equalsIgnoreCase("")) {
      boolean operatorPresenceWhen = false;  
      StringMap strMap = new HashStringMap();
      strMap.putString("pyBlockName", "pyOperatorPresenceStatusEnabled");
      ClipboardPage topPage = tools.getStepPage();
      PRStackFrame frame = null;
      if (topPage != null) {
        frame = ((PegaAPI)tools).pushStackFrame("when", null, topPage, true, false);
      }
      try {
        operatorPresenceWhen = tools.evaluateWhen(strMap);
      } 
      finally {
        if ((topPage != null) && (frame != null)) 
          ((PegaAPI) tools).popStackFrame(frame, false);
      }
      operatorPresenceEnabled = operatorPresenceWhen + "";
    }
    operatorPresenceEnabled = operatorPresenceEnabled.toUpperCase();
    tools.putParamValue("OperatorPresenceEnabled", operatorPresenceEnabled);
boolean designTime = "true".equalsIgnoreCase(tools.findPage("pxRequestor").getStringIfPresent("pyPegaDesignMode"));
    if (!designTime && operatorPresenceEnabled.equalsIgnoreCase("TRUE") && !(tools.getParamValue("OperatorID").equals(""))) {
      tools.putParamValue("OperatorID", StringUtils.crossScriptingFilter(tools.getParamValue("OperatorID").toLowerCase()));
      tools.putParamValue("CategoryName", PresenceQueryClause.STANDARD_CATEGORY);
      
      HashStringMap keys = new HashStringMap();
      keys.put("pxObjClass", "Rule-Obj-Activity");
      keys.put("pyClassName", "@baseclass");
      keys.put("pyActivityName", "pyGetPresenceRecordByOperatorId");
      tools.doActivity(keys, null, null);
      
      if(tools.getParameterPage().getParameterValue("OperatorPresenceRecord") != null){
        PresenceRecord record = (PresenceRecord) tools.getParameterPage().getParameterValue("OperatorPresenceRecord");
       // tools.putParamValue("status", record.getState().toString().equalsIgnoreCase("OFFLINE") ? "OFFLINE":"ACTIVE");
        tools.putParamValue("operatorStatus", record.getState().toString());
        state=record.getState().toString();
      }

     
      tools.createPage("Code-Pega-List", "OperatorPresence");
      tools.findPage("OperatorPresence").putString(".pxResults(1).pyUserIdentifier",tools.getParamValue("OperatorID"));
      
      /* Fetch classes from pyOperatorPresenceColors css file */
      if(state.equals("ACTIVE")){ 
        operatorStatusClass = "activeoperatorstatus";
      } else if(state.equals("AWAY")){
        operatorStatusClass = "awayoperatorstatus";
      } else if(state.equals("DISCONNECTED")){
        operatorStatusClass = "disconnectedoperatorstatus";
      } else if(state.equals("OFFLINE")){
        operatorStatusClass = "offlineoperatorstatus";
      }  
    }
  }
  int tabIndex = -1;
  if("true".equals(showMiniProfile)){
    tabIndex =0;
  }


tools.appendString(" ");
	if (pega.isPreviewMode() || tools.getParamValue("OperatorPresenceEnabled").equals("TRUE")) {
tools.appendString(" <div id=\"");
out.print(tools.getStepPage().getReference());
tools.appendString("\"> ");
pzAuto.emitIncludeStreamReference("pzOperatorPresence", null, null, "Rule-HTML-Section", null);
tools.appendString(" </div> ");
	}
tools.appendString(" ");

  String filename, dateTimeStamp, operatorName, operatorID;
  if(pzIsOfflineEnabled) {
    filename = "";
    operatorName = "";
    operatorID = "";
    dateTimeStamp = "";
  } else {
    operatorID = StringUtils.crossScriptingFilter(tools.getParamValue("OperatorID"));
    String storedURL = tools.getSaveValue(operatorID);

    if (storedURL != null && !storedURL.equals("")) {
        operatorName = pega_rules_string.whatComesAfterFirst(storedURL, ':');
        String tempURL = pega_rules_string.whatComesBeforeFirst(storedURL, ':');
        filename = pega_rules_string.whatComesBeforeFirst(tempURL, '?');
        dateTimeStamp = pega_rules_string.whatComesAfterFirst(tempURL, '?');
    } else {
        // Code to retrieve the operator image details from the datapage and save for next reference. 
        // This code will be replaced by retrieving data from OperatorInformationCache
        ClipboardPage userDetails = tools.createPage("@baseclass", "UserDetails");
        userDetails.getProperty("pyUser").setValue(operatorID);
        ClipboardPage pyUserDetails = userDetails.getProperty("pyUserDetails").getPageValue();

        filename = StringUtils.crossScriptingFilter(pyUserDetails.getString("pyImageFileName").trim());
        dateTimeStamp = StringUtils.crossScriptingFilter(pyUserDetails.getString("pxUpdateDateTime"));
        operatorName = StringUtils.crossScriptingFilter(pyUserDetails.getString("pyUserName"));

        userDetails.removeFromClipboard();
        tools.putSaveValue(operatorID, filename + "?" + dateTimeStamp + ":" + operatorName);
    }
    tools.putSaveValue("filename", filename);
  }
  String sWidth = StringUtils.crossScriptingFilter(tools.getParamValue("width"));
  if ("".equals(sWidth)) {
    sWidth = "40px";
  } else if (!sWidth.contains("px")) {
    sWidth += "px";
  }
  String sHeight = StringUtils.crossScriptingFilter(tools.getParamValue("height"));
  if ("".equals(sHeight)) {
    sHeight = "40px";
  } else if (!sHeight.contains("px")) {
    sHeight += "px";
  }
  
  String miniProfileURL = pega_social_utilities.pzGetMiniProfileUrl(operatorID);

tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || "".equals(filename))) {
tools.appendString(" ");

  operatorName = operatorName.trim();
  String initialsClass = "name-x";
  String initials = "X";
  boolean operatorExists = false;
  if (!"".equals(operatorName)) {
    operatorExists = true;
    StringBuilder initialSB = new StringBuilder(2);
    // if the first initial is a valid letter, set the corresponding css class
    if (Character.isLetter(operatorName.charAt(0))) {
      initialsClass = "name-" + Character.toLowerCase(operatorName.charAt(0));
    }
    initialSB.append(Character.toUpperCase(operatorName.charAt(0)));
    int index = operatorName.lastIndexOf(" ");
    if (index != -1) {
      initialSB.append(Character.toUpperCase(operatorName.charAt(index + 1)));
    }
    initials = initialSB.toString();
  }

tools.appendString(" ");
if (_jspx_meth_pega_static__3(pageContext, "style", "webwb")) {
	return;
}
tools.appendString(" <button tabindex='");
out.print( tabIndex);
tools.appendString("' ");
/* Include stream RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT */
include_2();

tools.appendString(" data-test-id=\"px-opr-image-ctrl\" class='icons avatar ");
out.print(initialsClass);
tools.appendString(" ");
out.print((operatorExists||pzIsOfflineEnabled?"":"operatorNotExists"));
tools.appendString("' style='width:");
out.print(sWidth);
tools.appendString(";height:");
out.print(sHeight);
tools.appendString(";' type=\"button\" title='");
out.print((operatorExists?operatorName:operatorID));
tools.appendString("' ");
 if("true".equals(showMiniProfile)) {
tools.appendString(" onclick=\"pega.ui.HarnessActions.openUserMiniProfileWithURL(event,'");
out.print( miniProfileURL);
tools.appendString("');\" onkeypress=\"pega.ui.HarnessActions.openUserMiniProfileOnEnter(event, '");
out.print( miniProfileURL);
tools.appendString("')\" ");
}
tools.appendString(" > <svg viewBox=\"0 0 100 100\" pointer-events=\"none\" xmlns=\"http://www.w3.org/2000/svg\" id=\"");
out.print(tools.getStepPage().getReference());
tools.appendString("WithoutImage\"> <circle cx=\"50\" cy=\"50\" r=\"50\" fill=\"purple\" /> <circle cx=\"15\" cy=\"85\" r=\"14\" id=\"operatorWithoutImage\" class=\"operatorWithoutImage ");
out.print(operatorStatusClass);
tools.appendString("\" /> <text x=\"50%\" y=\"65%\" transform=\"scale(1, 1)\" text-anchor=\"middle\" fill=\"white\" font-size=\"42\">");
out.print(initials);
tools.appendString("</text> </svg> </button> ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" <div class=\"operatorWithImageParentDiv\" ");
 if("true".equals(showMiniProfile)){
tools.appendString(" onclick=\"pega.ui.HarnessActions.openUserMiniProfileWithURL(event,'");
out.print( miniProfileURL);
tools.appendString("')\" onkeypress=\"pega.ui.HarnessActions.openUserMiniProfileOnEnter(event, '");
out.print( miniProfileURL);
tools.appendString("')\" ");
}
tools.appendString("> <img tabindex= '");
out.print( tabIndex);
tools.appendString("' ");
/* Include stream RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT */
include_2();

tools.appendString(" data-test-id=\"px-opr-image-ctrl\" data-name='");
out.print(operatorName);
tools.appendString("' class='custom_UserImage operatorImage' style='width:");
out.print(sWidth);
tools.appendString(";height:");
out.print(sHeight);
tools.appendString(";' title='");
out.print(operatorName);
tools.appendString("' alt='Show User Profile' src='");
if (_jspx_meth_pega_contentURL__1(pageContext, "$save(filename)", "/operatorimages/", "Image", "false")) {
	return;
}
tools.appendString("?");
out.print(dateTimeStamp);
tools.appendString("' onError=\"this.onerror=null;this.src='./desktopimages/pzdefaultUserPic.png';this.style.backgroundColor='white';\"/> <div class=\"operatorWithImage ");
out.print(operatorStatusClass);
tools.appendString("\" id=\"");
out.print(tools.getStepPage().getReference());
tools.appendString("WithImage\"></div> </div> ");
}
tools.appendString("  ");
	if (pega.isPreviewMode() || pzIsOfflineEnabled) {
tools.appendString(" <script> (function () { var userName = pega.ui.ClientCache.find(\"OperatorID\").get(\"pyUserName\").getValue(); var initials = userName.split(\" \").filter(function(element,index,array) {return index==0||index+1==array.length}).map(function(e) {return e[0]}).join(\"\"); var svgElement = $(\"#");
out.print(tools.getStepPage().getReference());
tools.appendString("WithoutImage\"); svgElement.children(\"text\").text(initials); var initialsClass = \"name-\" + userName[0].toLowerCase(); svgElement.parent().removeClass(\"name-x\").addClass(initialsClass); })(); </script> ");
	}
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PXOPERATORIMAGE #20210809T193147.384 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Social");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pxOperatorImage");
	oStreamProperties_1.put("pyRuleSetVersion", "08-07-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PXOPERATORIMAGE #20210809T193147.384 GMT", "pxOperatorImage", "Pega-Social", "08-07-01", "20210809T193147.384 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT", "pzActionSetAttributes", "Pega-UIEngine", "08-01-01", "20180713T133243.581 GMT");
}
