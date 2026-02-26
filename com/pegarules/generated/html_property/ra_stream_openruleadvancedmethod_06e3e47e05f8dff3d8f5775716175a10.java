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
 * Builds JSP stream OPENRULEADVANCEDMETHOD.
 */
public class ra_stream_openruleadvancedmethod_06e3e47e05f8dff3d8f5775716175a10 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.OpenRuleAdvancedMethod.Stream");
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
	public ra_stream_openruleadvancedmethod_06e3e47e05f8dff3d8f5775716175a10(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "8dab3aa7ac01a5c5a9bad5a0b47990120cd7257d";
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
/* Instance RULE-HTML-PROPERTY OPENRULEADVANCEDMETHOD #20180713T135129.145 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY OPENRULEADVANCEDMETHOD #20180713T135129.145 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY OPENRULEADVANCEDMETHOD #20180713T135129.145 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_6();

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
/* end RULE-HTML-PROPERTY OPENRULEADVANCEDMETHOD #20180713T135129.145 GMT */
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
	"Rule-File-Text:WEBWB!PEGA_UI_SMARTPROMPTONFOCUS!JS", 
	"Rule-File-Text:WEBWB!PEGA_UI_WUTILS!JS", 
	"Rule-File-Text:WEBWB!PEGA_UI_OPENRULE!JS", 
	"Rule-File-Text:WEBWB!PEGA_RULEFORM_RMACTION!JS", 
	"Rule-File-Text:WEBWB!ISNSSMARTPROMPTZEUS!JS", 
	"Rule-File-Text:WEBWB!ISNSSMARTPROMPTCORE!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:SMARTPROMPTWITHOPENRULEINCLUDE", 
	"Rule-HTML-Fragment:RMACTION_VARIABLES", 
	"Rule-HTML-Fragment:SMARTPROMPT", 
	"Rule-File-Bundle:SMARTPROMPT!SCRIPT", 
	"Rule-Obj-Property:PXREQURI", 
	"Rule-Obj-Property:PXTHREADNAME", 
	"Rule-HTML-Property:MESSAGES", 
	"Rule-HTML-Property:OPENRULEADVANCEDMETHOD", 
	"Rule-HTML-Property:CLIENTVALIDATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("WEBWB!PEGA_UI_SMARTPROMPTONFOCUS!JS","Rule-File-Text","",false,"","Pega-UIDesign","","RULE-FILE-TEXT WEBWB PEGA_UI_SMARTPROMPTONFOCUS!JS #20180713T133619.669 GMT","WEBWB!PEGA_UI_SMARTPROMPTONFOCUS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_UI_WUTILS!JS","Rule-File-Text","",false,"","Pega-WB","","RULE-FILE-TEXT WEBWB PEGA_UI_WUTILS!JS #20180713T131539.879 GMT","WEBWB!PEGA_UI_WUTILS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_UI_OPENRULE!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PEGA_UI_OPENRULE!JS #20201217T121412.225 GMT","WEBWB!PEGA_UI_OPENRULE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_RULEFORM_RMACTION!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PEGA_RULEFORM_RMACTION!JS #20180713T135106.479 GMT","WEBWB!PEGA_RULEFORM_RMACTION!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!ISNSSMARTPROMPTZEUS!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB ISNSSMARTPROMPTZEUS!JS #20190912T062232.821 GMT","WEBWB!ISNSSMARTPROMPTZEUS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!ISNSSMARTPROMPTCORE!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB ISNSSMARTPROMPTCORE!JS #20190226T135044.839 GMT","WEBWB!ISNSSMARTPROMPTCORE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("SMARTPROMPTWITHOPENRULEINCLUDE","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT","SMARTPROMPTWITHOPENRULEINCLUDE",true,false,"ABSOLUTE_CLASSLESS",-344924644), 
		new DependentRuleInfo("RMACTION_VARIABLES","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT","RMACTION_VARIABLES",true,false,"ABSOLUTE_CLASSLESS",804686993), 
		new DependentRuleInfo("SMARTPROMPT","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-05-01","RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT","SMARTPROMPT",true,false,"ABSOLUTE_CLASSLESS",23632326), 
		new DependentRuleInfo("SMARTPROMPT!SCRIPT","Rule-File-Bundle","",false,"","Pega-WB","","RULE-FILE-BUNDLE SMARTPROMPT SCRIPT #20180713T131524.483 GMT","SMARTPROMPT!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PXREQURI","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXREQURI #20180713T131215.530 GMT","!PXREQURI",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXTHREADNAME","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXTHREADNAME #20180713T131215.557 GMT","!PXTHREADNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("MESSAGES","Rule-HTML-Property","",false,"","Pega-UIDesign","08-01-01","RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT","MESSAGES",true,false,"ABSOLUTE_CLASSLESS",-794757422), 
		new DependentRuleInfo("OPENRULEADVANCEDMETHOD","Rule-HTML-Property","",false,"","Pega-Desktop","08-01-01","RULE-HTML-PROPERTY OPENRULEADVANCEDMETHOD #20180713T135129.145 GMT","OPENRULEADVANCEDMETHOD",true,false,"ABSOLUTE_CLASSLESS",2142208745), 
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
//	RULE-HTML-PROPERTY OPENRULEADVANCEDMETHOD #20180713T135129.145 GMT:20180713T135129.145 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT:20180713T131549.303 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT:20200403T114021.492 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXREQURI #20180713T131215.530 GMT:20180713T131215.530 GMT
//	RULE-FILE-BUNDLE SMARTPROMPT SCRIPT #20180713T131524.483 GMT:20180713T131524.483 GMT
//	RULE-FILE-TEXT WEBWB ISNSSMARTPROMPTCORE!JS #20190226T135044.839 GMT:20190522T125947.212 GMT
//	RULE-FILE-TEXT WEBWB ISNSSMARTPROMPTZEUS!JS #20190912T062232.821 GMT:20191129T094244.850 GMT
//	RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT:20180713T131549.076 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXTHREADNAME #20180713T131215.557 GMT:20180713T131215.557 GMT
//	RULE-FILE-TEXT WEBWB PEGA_UI_SMARTPROMPTONFOCUS!JS #20180713T133619.669 GMT:20180713T133619.669 GMT
//	RULE-FILE-TEXT WEBWB PEGA_UI_OPENRULE!JS #20201217T121412.225 GMT:20201217T121412.225 GMT
//	RULE-FILE-TEXT WEBWB PEGA_UI_WUTILS!JS #20180713T131539.879 GMT:20180713T131539.879 GMT
//	RULE-FILE-TEXT WEBWB PEGA_RULEFORM_RMACTION!JS #20180713T135106.479 GMT:20180713T135106.479 GMT
//	RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT:20180713T133634.985 GMT
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
		return "d718025f800c0d21f7615630f16cda85";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_22() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t\t\t");
if (!foundChoice && when_3("isDeclarePageAndPropertyPrompt", "true")) {
tools.appendString("\n\t\t\t\tONKEYUP=\"handlePropAndPagePrompting(event)\" \n\t\t\t");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n\t\t\t");
if (!foundChoice) {
tools.appendString("\n\t\t\t\tONKEYUP=\"handlePropAndRulePrompting(this, event);updateActivityMethodQueryOnKeyUp(this, event);\";\n\t\t\t");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_21() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t\t\t");
if (!foundChoice && when_2("LabelField", "")) {
tools.appendString("\n\t\t\t\t");
pzAuto.putSaveRef("ISNS_LABELFIELD", "param.LabelField", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t\t\t");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_20() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t\t\t");
if (!foundChoice && when_2("MaxRows", "")) {
tools.appendString("\n\t\t\t\t");
pzAuto.putSaveRef("ISNS_MAXROWS", "param.MaxRows", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t\t\t");

foundChoice = !pega.isPreviewMode();
}
}
private boolean when_3(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__2(PageContext aPageContext, java.lang.String aName) throws Throwable {
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
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_19() throws Throwable {
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
private void performStream_5() throws Throwable {
tools.appendString(" ");
out.print( tools.getParamValue("pega_attributes") );
tools.appendString(" ");

  String mode1 = tools.getSaveValue("mode1Action");
  String mode2 = tools.getSaveValue("mode2Action");

tools.appendString(" ");
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");
out.print(mode1);
tools.appendString(" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
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
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || isValidation == true)) {
tools.appendString("  ");
tools.putSaveValue("bAddedValidationType", "false");
tools.appendString(" ");
	boolean foundChoice_8 = false;
tools.appendString(" ");
if (!foundChoice_8 && (pega.isPreviewMode() || (areValsEqual(lookupThisDefinition(tools, "pyOnInput"), "")))) {
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
choose_19();
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_2("pega_validation", "")) {
tools.appendString("  ");
choose_19();
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

foundChoice_8 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_8) {
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

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7) {
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
private static final Map oPropDefinitions_6 = null;
private static final Map oStreamProperties_6 = new HashMap();
static {
	oStreamProperties_6.put("pyRuleAvailable", "Final");
	oStreamProperties_6.put("pyCircumstanceDateProp", "");
	oStreamProperties_6.put("pyCircumstanceVal", "");
	oStreamProperties_6.put("pyMethodStatus", "Internal");
	oStreamProperties_6.put("pyClassName", "");
	oStreamProperties_6.put("pyCircumstanceProp", "");
	oStreamProperties_6.put("pzInsKey", "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT");
	oStreamProperties_6.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_6.put("pyCircumstanceDate", "");
	oStreamProperties_6.put("pyRuleEnds", "");
	oStreamProperties_6.put("pyRuleStarts", "");
	oStreamProperties_6.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_6.put("pyXMLType", "");
	oStreamProperties_6.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_6.put("pyCorrType", "");
	oStreamProperties_6.put("pyStreamName", "ClientValidation");
	oStreamProperties_6.put("pyRuleSetVersion", "08-02-01");
}
/**
 * Generates stream property_Embed_ActivitySteps_ClientValidation
 */
private void property_Embed_ActivitySteps_ClientValidation() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT	Pega-UIEngine:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 * Set up context.
 */
final String prevRuleKey_6 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT";final String prevClass_6 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_6 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_6);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_6);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_5)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_5();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_6);
	mStreamResponse.setJspBaseClass(prevClass_6);
	pz_CurrentRuleKey = prevRuleKey_6;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_5,true);
}
/* end RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 */
private void include_5() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Embed_ActivitySteps_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_18() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t");
if (!foundChoice && when_2("NoOpenRule", "-1")) {
tools.appendString("\n\t\t<td id=\"SL_Input\"\t\n\t");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n\t");
if (!foundChoice) {
tools.appendString("\n\t\t<td \n\t");
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_17() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ClassGroupInstances", "false")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_CLASSGROUPONLY", "ON", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_16() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("XMLObjName", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_XMLOBJNAME", "param.XMLObjName", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_15() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("PropertyExtras", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_PROPERTYEXTRAS", "param.PropertyExtras", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_14() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ShowGroups", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_SHOWGROUPS", "param.ShowGroups", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_13() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("PropertyAutoPrompt", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_PROPAUTOPROMPT", "param.PropertyAutoPrompt", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_12() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("FieldType", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_FIELDTYPE", "param.FieldType", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_11() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ValueTooltip", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("VALUETOOLTIP", "param.ValueTooltip", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_10() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ListName", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_LISTNAME", "param.ListName", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_9() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("DisplayPropertyTooltip", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_TTIPNODE", "param.DisplayPropertyTooltip", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_8() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("AdditionalParams", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_ADDLPARAMS", "param.AdditionalParams", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_7() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("DisplayProperty", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_DATANODE", "param.DisplayProperty", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_6() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("CustomQuery", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_MYQUERY", "param.CustomQuery", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_5() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("OtherKeyValuePairs", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("OTHERKEYVALUEPAIRS", "param.OtherKeyValuePairs", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_4() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("OpenRuleTooltip", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("strButtonToolTip", "param.OpenRuleTooltip", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("TextBoxTooltip", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("strToolTip", "param.TextBoxTooltip", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ApplyTo", "")) {
tools.appendString("\n           ");
pzAuto.putSaveRef("ISNS_BASECLASS", "param.ApplyTo", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\t\n    ");

foundChoice = !pega.isPreviewMode();
}
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("Class", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_CLASS", "param.Class", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
}
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__2(PageContext aPageContext, java.lang.String aN) throws Throwable {
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
private void performStream_4() throws Throwable {


boolean isBadVal = false;

if (tools.getActive().getMessages().length() == 0) {
	isBadVal = tools.getActive().isBad();
} else {
	isBadVal = true;
}
tools.putSaveValue("isBad",Boolean.toString(isBadVal));



tools.appendString(" ");
pzAuto.putSaveRef("messages", "$this-message", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue("isBad"), "false"))) {
tools.appendString(" ");


	String message = tools.getSaveValue("messages");

	try {
		message = tools.getLocalizedTextForString("pxRequestor.pyMessageLabel", message);
	} catch(Exception e) {
		oLog.error(e);
	}
	message = XMLUtils.encodeString(message);

	if(message != null) {
		if(tools.getSaveValue("FieldError").equals("ERRORTEXT")){
			 message= message.replaceAll("\n"," "); 

		}
	         else{
			message= message.replaceAll("\n","&#10");
		}
		tools.putSaveValue("localizedMessage",message);
	}

tools.appendString(" ");
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "");
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "inputErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "inputError");
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
tools.appendString("  ");
tools.putSaveValue("errorDivStyle", "iconErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "iconError");
tools.appendString(" ");
}
tools.appendString("  <div id=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("Error\" class=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(errorDivStyle)"
 */
if (_jspx_meth_p_r__2(pageContext, "$SAVE(errorDivStyle)")) {
	return;
}
tools.appendString(" ");
	if (when_1("parentLayoutVal", "SIMPLELAYOUT")) {
tools.appendString(" dynamic-icon-error-div ");
	}
tools.appendString("\" style=\"display:block;\" > <span class=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(errorSpanStyle)"
 */
if (_jspx_meth_p_r__2(pageContext, "$SAVE(errorSpanStyle)")) {
	return;
}
tools.appendString(" ");
	if (when_1("parentLayoutVal", "SIMPLELAYOUT")) {
tools.appendString(" dynamic-icon-error ");
	}
tools.appendString("\" errId=\"\" title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "javascript"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "javascript")) {
	return;
}
tools.appendString("\" ");
	if (when_1("isBad", "true")) {
tools.appendString(" id=\"PegaRULESErrorFlag\" ");
	}
tools.appendString(" > ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" <b style=\"font-family: wingdings;color:red;cursor:hand\">x</b> ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString("  </span> </div> ");
	}
}
private static final Map oPropDefinitions_5 = null;
private static final Map oStreamProperties_5 = new HashMap();
static {
	oStreamProperties_5.put("pyRuleAvailable", "Final");
	oStreamProperties_5.put("pyCircumstanceDateProp", "");
	oStreamProperties_5.put("pyCircumstanceVal", "");
	oStreamProperties_5.put("pyMethodStatus", "Internal");
	oStreamProperties_5.put("pyClassName", "");
	oStreamProperties_5.put("pyCircumstanceProp", "");
	oStreamProperties_5.put("pzInsKey", "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT");
	oStreamProperties_5.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_5.put("pyCircumstanceDate", "");
	oStreamProperties_5.put("pyRuleEnds", "");
	oStreamProperties_5.put("pyRuleStarts", "");
	oStreamProperties_5.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_5.put("pyXMLType", "");
	oStreamProperties_5.put("pyRuleSet", "Pega-UIDesign");
	oStreamProperties_5.put("pyCorrType", "");
	oStreamProperties_5.put("pyStreamName", "Messages");
	oStreamProperties_5.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Embed_ActivitySteps_Messages
 */
private void property_Embed_ActivitySteps_Messages() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT	Pega-UIDesign:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 * Set up context.
 */
final String prevRuleKey_5 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT";final String prevClass_5 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_5 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_5);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_5);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_4)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_4();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_5);
	mStreamResponse.setJspBaseClass(prevClass_5);
	pz_CurrentRuleKey = prevRuleKey_5;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_4,true);
}
/* end RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT
 */
private void include_4() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Embed_ActivitySteps_Messages();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private static final String[] showMeParams_3 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Final", "", "Pega-WB", "08-01-01", "", "SmartPromptWithOpenRuleInclude", "", "RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT" };
private static final String[] showMeParams_1 = {
"", "", "", "", "", "", "04-02", "API", "Rule-HTML-Fragment", "Final", "", "Pega-UIEngine", "08-05-01", "", "SmartPrompt", "", "RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT" };
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
tools.appendString("\n\t ");
	IStaticContentRuntime pzStatic__2 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__2.addBundle("smartprompt", "1863241345");
tools.appendString("\n");
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
 * OnlyOnce condition: SmartPrompt
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("SmartPrompt")) {
tools.appendString("\n\n<script> var gsServerReqURI = \"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "pxThread.pxReqURI", "normal")) {
	return;
}
tools.appendString("\";</script>\n");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb")) {
	return;
}
tools.appendString("\n\n<script>\n\tfunction SmartPromptFocusHandler(e) {\n\t\tvar evt = e || window.event || arguments.callee.caller.arguments[0];\n \t\tif(typeof(evt)  != \"undefined\" ) {\n\t\t\tvar evtTarget = evt.srcElement || evt.target;\n\t\t\tif (ISnsSmartPromptInitActive(evtTarget, false))\n\t\t\t\treturn;\n\t\t}\t\t\n\t}\n\tfunction zUtil_SmartPromptFocusHandler(e) {\n\t\tvar evt = e || window.event || arguments.callee.caller.arguments[0];\n\t\tSmartPromptFocusHandler(evt);\n\t}\n</script>\n\n");
}
}
private void performStream_1() throws Throwable {
onlyOnce_1();
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "API");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "SmartPrompt");
	oStreamProperties_3.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT	Pega-UIEngine:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_3 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_3);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_3);
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
/* end RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__2(PageContext aPageContext, java.lang.String aApp, java.lang.String aType) throws Throwable {
/* pega:static */
com.pega.pegarules.jsptags.StaticTag _jspx_th_pega_static_ = (com.pega.pegarules.jsptags.StaticTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.StaticTag.class);
_jspx_th_pega_static_.setPageContext(pageContext);
_jspx_th_pega_static_.setParent(mParentTag);
_jspx_th_pega_static_.setApp(aApp);
_jspx_th_pega_static_.setType(aType);
int _jspx_eval_pega_static_ = _jspx_th_pega_static_.doStartTag();
if (_jspx_eval_pega_static_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_static_;
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__4 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__4.addFile("pega_ui_smartpromptonfocus", "13155984262", "js");
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__6 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__6.addFile("pega_ui_openrule", "12604479638", "js");
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__8 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__8.addFile("pega_ui_wutils", "13323188170", "js");
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__10 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__10.addFile("pega_ruleform_rmaction", "11183668284", "js");
tools.appendString("\n  ");
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
private static final String[] showMeParams_2 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Yes", "", "Pega-WB", "08-01-01", "", "RMAction_Variables", "", "RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT" };
private void performStream_2() throws Throwable {
tools.appendString("<script>\nvar gCurrentThread = \"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "pxThread.pxThreadName", "normal")) {
	return;
}
tools.appendString("\";\n</script>");
}
private static final Map oPropDefinitions_4 = null;
private static final Map oStreamProperties_4 = new HashMap();
static {
	oStreamProperties_4.put("pyRuleAvailable", "Yes");
	oStreamProperties_4.put("pyCircumstanceDateProp", "");
	oStreamProperties_4.put("pyCircumstanceVal", "");
	oStreamProperties_4.put("pyMethodStatus", "");
	oStreamProperties_4.put("pyClassName", "");
	oStreamProperties_4.put("pyCircumstanceProp", "");
	oStreamProperties_4.put("pzInsKey", "RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-WB");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "RMAction_Variables");
	oStreamProperties_4.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT	Pega-WB:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
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
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_3)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_2();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_4);
	mStreamResponse.setJspBaseClass(prevClass_4);
	pz_CurrentRuleKey = prevRuleKey_4;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_3,true);
}
/* end RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_2);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * OnlyOnce condition: SmartPromptWithOpenRule
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_2() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("SmartPromptWithOpenRule")) {
tools.appendString("\n  ");
/* Include stream RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT */
include_2();

tools.appendString("\n  ");
if (_jspx_meth_pega_static__2(pageContext, "webwb", "script")) {
	return;
}
tools.appendString("\n");
}
}
private void performStream_3() throws Throwable {
/* Include stream RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT */
include_1();

tools.appendString("\n");
onlyOnce_2();
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
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-WB");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "SmartPromptWithOpenRuleInclude");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT
 */
private void include_3() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT	Pega-WB:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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

	performStream_3();

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
/* end RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_3);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
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
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
private void performStream_6() throws Throwable {

	String pAttributes = tools.getParamValue("pega_attributes");
	if (pAttributes.indexOf("ONBLUR") > -1)
		pAttributes = pAttributes.replaceAll("ONBLUR", "ONBLUR_CUSTOM");
	if (pAttributes.indexOf("ONCHANGE") > -1)
		pAttributes = pAttributes.replaceAll("ONCHANGE", "ONCHANGE_CUSTOM");
	tools.putParamValue("pega_attributes", pAttributes);
	String textBoxToolTip = tools.getParamValue("TextBoxTooltip");
	tools.putParamValue("TextBoxTooltip", tools.getLocalizedTextForString("pyToolTip",textBoxToolTip));
          if("Rule-Declare-Pages/Rule-Obj-Property".equals(tools.getParamValue("Class"))){
		tools.putParamValue("Class","Rule-Obj-Property");
		tools.putParamValue("isDeclarePageAndPropertyPrompt","true"); 
	}else{
		tools.putParamValue("isDeclarePageAndPropertyPrompt","false");
	}
	String visibilityStyle = "visibility:hidden;";
	String activeValueUC = tools.getActiveValue().toUpperCase();
	
	if(activeValueUC.indexOf("CALL ") == 0 || 
			activeValueUC.indexOf("BRANCH ") == 0 || 
			activeValueUC.indexOf("QUEUE ") == 0 ||
			activeValueUC.indexOf("COLLECT ") == 0 ||
			activeValueUC.indexOf("FLOW-NEW ") == 0) {
		visibilityStyle = "visibility:visible;";
	}

tools.appendString("\n\n");
	boolean foundChoice_1 = false;
tools.appendString("\n");
if (!foundChoice_1 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString("\n\n");
	if (when_1("prepareForDataGrid", "true")) {
tools.appendString("\n<script>\n\nfunction OpenRuleAdvanced_getValue(){\n\tvar fieldName=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\";\n\tvar field = document.getElementsByName(fieldName)[0];\n\tif (field){\n\t\treturn field.value;\n\t}\n\telse{\n\t\treturn \"\";\n\t}\n}\nfunction OpenRuleAdvanced_setValue(val){\n\tvar fieldName=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\";\n\tvar field = document.getElementsByName(fieldName)[0];\n\tif (field){\n\t\tfield.value = val;\n\t}\n}\nfunction OpenRuleAdvanced_setFocus(){\n\tvar fieldName=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\";\n\tvar field = document.getElementsByName(fieldName)[0];\n\tif ((field.tagName == \"INPUT\") || (field.tagName == \"input\")){\n\t\tfield.focus();\n\t}\n}\n</script>\n");
	}
tools.appendString("\n\n<script>\n");
	boolean foundChoice_2 = false;
tools.appendString("\n  ");
if (!foundChoice_2 && (pega.isPreviewMode() || (areValsEqual(tools.getParamValue("isDeclarePageAndPropertyPrompt"), "true")))) {
tools.appendString("\n\tfunction handlePropAndPagePrompting(event){   \n\t\tevent = pega.util.Event.getEvent(event);\n\t\tvar field = pega.util.Event.getTarget(event);\n\t\tif(field.dupCheck && field.dupCheck == true) return; \n\t\tvar classChanged = false;\n\t\tif(field.value.indexOf(\".\") != -1 && field.getAttribute(\"ISNS_CLASS\") != \"Rule-Obj-Property\"){\n\t\t    field.setAttribute(\"ISNS_CLASS\", \"Rule-Obj-Property\");\n            field.setAttribute(\"ISNS_PROPAUTOPROMPT\", \"NO\");\n            field.setAttribute(\"ISNS_FIELDTYPE\", \"PROPERTY\");\n\t\t\tfield.setAttribute(\"ISNS_BASECLASS\", '");
out.print( tools.getParamValue("ApplyTo"));
tools.appendString("');\n            classChanged = true;\n\t\t}else if(field.value.indexOf(\".\") == -1 && field.getAttribute(\"ISNS_CLASS\") != \"Rule-Declare-Pages\"){\n\t\t    field.setAttribute(\"ISNS_CLASS\", \"Rule-Declare-Pages\");\n            field.setAttribute(\"ISNS_PROPAUTOPROMPT\", \"NO\");\n            field.setAttribute(\"ISNS_FIELDTYPE\", \"RULEKEY\");\n\t\t\tfield.setAttribute(\"ISNS_BASECLASS\", \"\");\n\t\t    classChanged = true;\n\t\t}     \n\t\tif(classChanged)               \n\t\t\tobjSmartPrompt.doOnFocus(this, event);\n\t\tif(event.keyCode == 190 ) {\n\t\t\tISnsInputKeyUpCommon(40,field,true);\t\t\n\t\t}\n\t\t\n\t\t \n\t}\n  ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString("\n\n\nfunction fireEventOnField(eventName,fieldObj){\n\t\tif(!fieldObj) return;\n\t\tif(fieldObj.dispatchEvent){\n\t\t\tvar customevent = document.createEvent(\"HTMLEvents\");\n\t\t\tcustomevent.initEvent(eventName,true,false);\n\t\t\tfieldObj.dispatchEvent(customevent);\n\t\t}else if(fieldObj.fireEvent){\n\t\t\tfieldObj.fireEvent(\"on\"+eventName);\n\t\t}\n}\n\n/*\nUpdating the pyPageListProperty, pyPageListPropertyClass values when toggling the pySourceType\n\n*/\nfunction setFocusOnDSField(event){\n\tevent = pega.util.Event.getEvent(event);\n\tvar field = pega.util.Event.getTarget(event);\n\tif(field.id==\"pySourceType\"){\n\t\tvar srcType=field[field.selectedIndex].value;\n\t\tif(srcType==\"Property\"){\n\t\t\t/*waiting for dom to be ready for pyPageListProperty when toggling pySourceType*/\n\t\t\tsetTimeout(function(){\n\t\t\t/*document.getElementById(\"pyPageListProperty\").onchange();*/\n\t\t\tfireEventOnField(\"change\",document.getElementById(\"pyPageListProperty\"));\n\t\t\t},750);\n\t\t\t/*clearing the properties when toggling to \"Property\" from DataObject / RD */\n\t\t\tif(field.getAttribute(\"PrevValue\") && (field.getAttribute(\"PrevValue\")==\"Data Object\" || field.getAttribute(\"PrevValue\")==\"Report Definition\")){\n\t\t\t\t\tvar oDoc=document;\n\t\t\t\t\tif(oDoc.getElementById(\"pyDPName\")){\n\t\t\t\t\t\toDoc.getElementById(\"pyDPName\").value=\"\";\n\t\t\t\t\t}\n\t\t\t\t\tif(oDoc.getElementById(\"pyPageListProperty\")){\n\t\t\t\t\t\toDoc.getElementById(\"pyPageListProperty\").value=\"\";\n\t\t\t\t\t}\n\t\t\t\t\tif(oDoc.getElementById(\"pyPageListPropertyClass\")){\n\t\t\t\t\t\toDoc.getElementById(\"pyPageListPropertyClass\").value=\"\";\n\t\t\t\t\t}\n\t\t\t\t\tif(oDoc.getElementById(\"pyPageProperty\")){\n\t\t\t\t\t\toDoc.getElementById(\"pyPageProperty\").value=\"\";\n\t\t\t\t\t}\n\t\t\t\t\tif(oDoc.getElementById(\"pyPageClassProperty\")){\n\t\t\t\t\t\toDoc.getElementById(\"pyPageClassProperty\").value=\"\";\n\t\t\t\t\t}\n\t\t\t\t\tgridrowPageClassName=\"\";\n\t\t\t\t\t/*document.getElementById(\"pyPageListProperty\").onchange();*/\n\t\t\t\t\tfireEventOnField(\"change\",document.getElementById(\"pyPageListProperty\"));\n\t\t\t}\n\t\t}else if(srcType==\"Report Definition\"){\n\t\t\t/*focus and blur ensures that rowpageclass variable is automatically updated when the property panel is opened again*/\n\t\t\ttry{\n\t\t\tsetTimeout(function(){\n\t\t\t\t/*document.getElementById(\"pyRDAppliesTo\").onchange();*/\n\t\t\t\tfireEventOnField(\"change\",document.getElementById(\"pyRDAppliesTo\"));\n\t\t\t},750);\n\t\t\t}catch(err){}\n\t\t\t/*for triggering the pagination info updation logic. Reason for using 1000ms: Opening the property panel again.*/\n\t\t\t/*setTimeout(function(){setRDPageDefaults();},1000);*/\n\t\t}else if(srcType==\"Data Object\"){\n\t\t\t/*timeout required when opening the property panel again. focus and blur ensures that rowpageclass variable is updated correctly.*/\n\t\t\tsetTimeout(function(){\n\t\t\t/*document.getElementById(\"pyDPName\").onchange();*/\n\t\t\tfireEventOnField(\"change\",document.getElementById(\"pyDPName\"));\n\t\t\t},750);\n\t\t\t/*clearing properties when current selection is Data Page but previous selection was either Property / RD */\n\t\t\tif(field.getAttribute(\"PrevValue\") && (field.getAttribute(\"PrevValue\")==\"Property\" || field.getAttribute(\"PrevValue\")==\"Report Definition\")){\n\t\t\t\t\tvar oDoc=document;\n\t\t\t\t\tif(oDoc.getElementById(\"pyDPName\")){\n\t\t\t\t\t\toDoc.getElementById(\"pyDPName\").value=\"\";\n\t\t\t\t\t}\n\t\t\t\t\tif(oDoc.getElementById(\"pyPageListProperty\")){\n\t\t\t\t\t\toDoc.getElementById(\"pyPageListProperty\").value=\"\";\n\t\t\t\t\t}\n\t\t\t\t\tif(oDoc.getElementById(\"pyPageListPropertyClass\")){\n\t\t\t\t\t\toDoc.getElementById(\"pyPageListPropertyClass\").value=\"\";\n\t\t\t\t\t}\n\t\t\t\t\tif(oDoc.getElementById(\"pyPageProperty\")){\n\t\t\t\t\t\toDoc.getElementById(\"pyPageProperty\").value=\"\";\n\t\t\t\t\t}\n\t\t\t\t\tif(oDoc.getElementById(\"pyPageClassProperty\")){\n\t\t\t\t\t\toDoc.getElementById(\"pyPageClassProperty\").value=\"\";\n\t\t\t\t\t}\n\t\t\t\t\tgridrowPageClassName=\"\";\n\t\t\t\t\t/*focus and blur ensures that rowpageclass variable is updated with correct value when property panel is reopened.*/\n\t\t\t\t\t/*document.getElementById(\"pyDPName\").onchange();*/\n\t\t\t\t\tfireEventOnField(\"change\",document.getElementById(\"pyDPName\"));\n\t\t\t}\n\t\t}\n\t\t/*Updating the current selection in the PrevValue attribute*/\n\t\tdocument.getElementById(\"pySourceType\").setAttribute(\"PrevValue\",srcType);\n\t}\n}\n\n/*Grid related JS code (will be executed only once)*/\nif(!document.getElementById(\"grid_openRuleAdvanced_jsLoaded\")){\n\tvar isGridPropertyPanel=false;\n\tvar gridlRuleSet=\"\";\n\tvar gridlRuleSetVersion=\"\";\n\tvar gridsectionClassName=\"\";\n\tvar gridrowPageClassName=\"\";\n\tif(document.getElementById(\"pySourceType\") && document.getElementById(\"pyRowVisible\")){\n\t\tisGridPropertyPanel=true;\n\t}\n\tif(isGridPropertyPanel){\n\t\n\t\t/*START: reading info from pagesAndClassesTab*/\n\t\tvar inputList=document.getElementsByTagName(\"input\");\n\t\tvar pagesList=[];\n\t\tvar classesList=[];\n\t\tfor(var i=0;i<inputList.length;i++){\n\t\t\tif(inputList[i].id==\"pyPagesAndClassesPage\"){\n\t\t\t\tpagesList.push(inputList[i].value);\n\t\t\t}else if(inputList[i].id==\"pyPagesAndClassesClass\"){\n\t\t\t\tclassesList.push(inputList[i].value);\n\t\t\t}\n\t\t}\n\t\t/*END: reading info from pagesAndClassesTab*/\n\t\t\n\t\t/*reading PRXML from section xml for getting info about PagesAndClasses and Section Parameters*/\n\t\tif(document.getElementById(\"PRXML\")){\n\t\t\tvar txt=document.getElementById(\"PRXML\").value;\n\t\t\ttxt=txt.replace(/\\n[ ]*/g, \"\");\n\t\t\tif(txt.trim){\n\t\t\t\ttxt=txt.trim();\n\t\t\t}\n\t\t\tvar cache_prxml=window.cachedPRXML;\n\t\t\tif(!cache_prxml){cache_prxml=\"\";}\n\t\t\tcache_prxml=cache_prxml.replace(/\\n[ ]*/g, \"\");\n\t\t\tif(cache_prxml.trim){\n\t\t\t\tcache_prxml=cache_prxml.trim();\n\t\t\t}\n\t\t\tvar xmlDoc=pega.tools.XMLDocument.get();\n\t\t\txmlDoc.async= false;\n\t\t\txmlDoc.loadXML(txt); \n\t\t\tvar xmlDocCache=pega.tools.XMLDocument.get();\n\t\t\txmlDocCache.async= false;\n\t\t\txmlDocCache.loadXML(cache_prxml); \n\t\t\ttry{\n\t\t\t\tgridsectionClassName=xmlDoc.getElementsByTagName(\"pyClassName\")[0].text;\n\t\t\t}catch(sectionClassNotFoundError){\n\t\t\t\ttry{\n\t\t\t\t\tgridsectionClassName=xmlDocCache.getElementsByTagName(\"pyClassName\")[0].text;\n\t\t\t\t}catch(promptClassNotFoundError){\n\t\t\t\t\ttry{gridsectionClassName=xmlDoc.getElementsByTagName(\"pyPromptClass\")[0].text;}catch(err){}\n\t\t\t\t}\n\t\t\t}\n\t\t\tsetTimeout(function(){\n\t\t\t\tif(document.getElementById(\"pySmartPromptClass\")){\n\t\t\t\t\tdocument.getElementById(\"pySmartPromptClass\").value=gridsectionClassName;\n\t\t\t\t\t\tfireEventOnField(\"click\",document.getElementById(\"pySmartPromptClass\"));\n\t\t\t\t}\n\t\t\t},1250);\n\t\t\ttry{\n\t\t\t\tgridlRuleSet=xmlDoc.getElementsByTagName(\"pxInstanceLockedRuleSet\")[0].text;\n\t\t\t}catch(err){\n\t\t\t\ttry{gridlRuleSet=xmlDocCache.getElementsByTagName(\"pxInstanceLockedRuleSet\")[0].text;}catch(err1){}\n\t\t\t}\n\t\t\ttry{\n\t\t\t\tgridlRuleSetVersion=xmlDoc.getElementsByTagName(\"pxInstanceLockedRuleSetVersion\")[0].text;\n\t\t\t}catch(err){\n\t\t\t\ttry{gridlRuleSetVersion=xmlDocCache.getElementsByTagName(\"pxInstanceLockedRuleSetVersion\")[0].text;}catch(err2){}\n\t\t\t}\n\t\t\tvar pagesAndClasses;\n\t\t\ttry{\n\t\t\t\tpagesAndClasses=xmlDoc.getElementsByTagName(\"pyPagesAndClasses\")[0];\n\t\t\t\tif(!pagesAndClasses){\n\t\t\t\t\tpagesAndClasses=xmlDocCache.getElementsByTagName(\"pyPagesAndClasses\")[0];\n\t\t\t\t}\n\t\t\t}catch(err){\n\t\t\t}\n\t\t\tvar sectionparameters;\n\t\t\ttry{\n\t\t\t\tsectionparameters=xmlDoc.getElementsByTagName(\"pyParameters\")[0];\n\t\t\t\tif(!sectionparameters){\n\t\t\t\t\tsectionparameters=xmlDocCache.getElementsByTagName(\"pyParameters\")[0];\n\t\t\t\t}\n\t\t\t}catch(err){\n\t\t\t}\n\t\t\tif(pagesAndClasses){\n\t\t\tvar allpages=pagesAndClasses.getElementsByTagName(\"pyPagesAndClassesPage\");\n\t\t\tvar allclasses=pagesAndClasses.getElementsByTagName(\"pyPagesAndClassesClass\");\n\t\t\t}\n\t\t\ttry{\n\t\t\t\t/*storing the xml version as text for consumption in pzExpressionBuilderGadget*/\n\t\t\t\tvar gridsectionparameters_txt=sectionparameters.xml;\n\t\t\t\tvar gridsectionpagesandclasses_txt=pagesAndClasses.xml;\n\t\t\t}catch(err){/*do nothing*/}\n\t\t\t\n\t\t}\n\t\t\n\t\tif(document.getElementById(\"pySourceType\")){\n\t\t\t/*Tried using \"Run Script\", but it did not work, so manually registering the change listener*/\n\t\t\tpega.util.Event.addListener(document.getElementById(\"pySourceType\"),\"change\", setFocusOnDSField);\n\t\t\tvar sourceTypeField=document.getElementById(\"pySourceType\");\n\t\t\tvar sourceFieldValue=sourceTypeField[sourceTypeField.selectedIndex].value;\n\t\t\tif(sourceFieldValue==\"Property\"){\n\t\t\t\t/*emptying the pyPageListProperty field on UI when the value is .pyTemplatePageList -> when dropping a new grid */\n\t\t\t\tif(document.getElementById(\"pyPageListProperty\") && document.getElementById(\"pyPageListProperty\").value.indexOf(\"pyTemplatePagelist\")!=-1){\n\t\t\t\t\tdocument.getElementById(\"pyPageListProperty\").value=\"\";\n\t\t\t\t}\n\t\t\t\t/*Updating the rowpageclass variable*/\n\t\t\t\tif(document.getElementById(\"pyPageListPropertyClass\")){\n\t\t\t\t\tgridrowPageClassName=document.getElementById(\"pyPageListPropertyClass\").value;\n\t\t\t\t\tif(document.getElementById(\"pySmartPromptClass\")){document.getElementById(\"pySmartPromptClass\").value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t}else if(sourceFieldValue==\"Report Definition\"){\n\t\t\t\t/*Update gridrowclass variable*/\n\t\t\t\tif(document.getElementById(\"pyRDAppliesTo\")){\n\t\t\t\t\tgridrowPageClassName=document.getElementById(\"pyRDAppliesTo\").value;\n\t\t\t\t\tif(document.getElementById(\"pySmartPromptClass\")){document.getElementById(\"pySmartPromptClass\").value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t\t/*Wait for DOM to be ready after Refresh Section happens.*/\n\t\t\t\t/*setTimeout(function(){setRDPageDefaults();},1000);*/\n\t\t\t}else if(sourceFieldValue==\"Data Object\"){\n\t\t\t\t/*Update rowpageclass*/\n\t\t\t\tif(document.getElementById(\"pyDPResultsClass\")){\n\t\t\t\t\tgridrowPageClassName=document.getElementById(\"pyDPResultsClass\").value;\n\t\t\t\t\tif(document.getElementById(\"pySmartPromptClass\")){document.getElementById(\"pySmartPromptClass\").value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t\tif(document.getElementById(\"pyPageListPropertyClass\")){\n\t\t\t\t\tgridrowPageClassName=document.getElementById(\"pyPageListPropertyClass\").value;\n\t\t\t\t\tif(document.getElementById(\"pySmartPromptClass\")){document.getElementById(\"pySmartPromptClass\").value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t}\n\t\t\t/*updating the \"PrevValue\" with current selection.*/\n\t\t\tdocument.getElementById(\"pySourceType\").setAttribute(\"PrevValue\",sourceFieldValue);\n\t\t}\n\t\t/*creating a hidden DOM element to ensure that code is executed only once.*/\n\t\tvar jsLoadedIndicator=document.createElement(\"div\");\n\t\tjsLoadedIndicator.id=\"grid_openRuleAdvanced_jsLoaded\";\n\t\tjsLoadedIndicator.style.display=\"none\";\n\t\tdocument.getElementById(\"pySourceType\").parentNode.appendChild(jsLoadedIndicator);\n\t}\n}\n\nvar gridFieldPromptingMappings={\n\"pyActivity\":\"ROWCLASS\",\n\"pyProperty\":\"ROWCLASS\",\n\"pyDataSource\":\"ROWCLASS\" /*DISPLAY->MENU*/,\n\"pyRowRefreshIndex\":\"ROWCLASS\",\n\"pyActivityClass\":\"ROWCLASS\",\n\"pySelectedFlowAction\":\"ROWCLASS\" /*PROCESS WORK->PERFORM ACTION*/,\n\"pyLocalAction\":\"ROWCLASS\" /*Launch -> Local Action*/,\n\"pySelectedFlow\":\"ROWCLASS\"/*Launch -> Flow in Modal Dialog*/,\n\"pyWindowName\":\"ROWCLASS\",\n\"pyValue\":\"ROWCLASS\",\n\"pyClipboardPage\":\"ROWCLASS\",\n\"pyWhen\":\"ROWCLASS\",\n\"pyElementName\":\"ROWCLASS\",\n\"pyName\":\"ROWCLASS\"\n};\n\nif(!gridFieldPromptingMappings.checkAndUpdatePrompting){\n\tgridFieldPromptingMappings.checkAndUpdatePrompting=function(fieldObj){\n\t\tif(!fieldObj){return;}\n\t\tif(this[fieldObj.id]==\"ROWCLASS\"){\n\t\t\tif(fieldObj.getAttribute(\"ISNS_BASECLASS\")){\n\t\t\t\tvar promptFields=document.getElementsByName(fieldObj.getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t\t}\n\t\t\t\tif(document.getElementById(\"pySmartPromptClass\")){\n\t\t\t\t\tdocument.getElementById(\"pySmartPromptClass\").value=gridrowPageClassName;\n\t\t\t\t\tfireEventOnField(\"click\",document.getElementById(\"pySmartPromptClass\"));\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t};\n}\n\n/*To update the correct ISNS_BASECLASS for ui elements that use OpenRuleAdvanced and are grid specific*/\nfunction setGridClassNameDefaults(fieldObj){\n\t/* event = pega.util.Event.getEvent(event);\n\tvar field = pega.util.Event.getTarget(event); */\n\tvar field=fieldObj;\n\tif(document.getElementById(\"pySourceType\") && document.getElementById(\"pyRowVisible\")){\n\t\tif(document.getElementById(\"pySmartPromptClass\")){\n\t\t\tdocument.getElementById(\"pySmartPromptClass\").value=gridrowPageClassName;\n\t\t}\n\t}\n\tif(document.getElementById(\"pySourceType\") && document.getElementById(\"pyRowVisible\")){\n\t\tgridFieldPromptingMappings.checkAndUpdatePrompting(fieldObj);\n\t}\n\tif(field.id==\"pyPageListProperty\" && field.getAttribute(\"ClearValues\")==\"true\"){\n\t\tfield.value=\"\";\n\t\tdocument.getElementById(\"pyPageListPropertyClass\").value=\"\";\n\t}\n\tif(field.id==\"pyPageListProperty\" || field.id==\"pyRowVisibleCondition\" || field.id==\"pyRowRefresh\" || field.id==\"pyPaginateActivity\"){\n\t\tfield.setAttribute(\"ISNS_BASECLASS\",\"pyGridPromptClass\");\n\t}\n\tif((field.id==\"pyContainerVisibleWhen\" || field.id==\"pyDisplayWhen\") && isGridPropertyPanel){ /*ensuring that ISNS_BASECLASS for pyContainerVisibleWhen and pyDisplayWhen is corrected only when it is in Grid PropertyPanel*/\n\t\tfield.setAttribute(\"ISNS_BASECLASS\",\"pyGridPromptClass\");\n\t}\n\tvar isGridRequest=((\"\"+window.top.location).indexOf(\"gEB=Y\")!=-1);\n\tvar smartpromptclassFieldList=\"|pyFirstLeftOperand|pyFirstRightOperand|pySecondWhenRule|pySecondLeftOperand|pySecondRightOperand|\";\n\tif(isGridRequest && smartpromptclassFieldList.indexOf(\"|\"+field.id+\"|\")!=-1){\n\t\tfield.setAttribute(\"ISNS_BASECLASS\",\"pySmartPromptClass\");\n\t}\n\tif(isGridRequest && field.id==\"pyFirstWhenRule\"){\n\t\tfield.setAttribute(\"ISNS_BASECLASS\",\"pyWhenRuleClass\");\n\t}\n\tif(field.id==\"pyRDName\"){\n\t\tfield.setAttribute(\"ISNS_BASECLASS\",\"pyRDAppliesTo\");\n\t}\n\t/*Specify the fields that require Section class for prompting*/\n\tif(isGridPropertyPanel && (field.id==\"pyPageListProperty\" || field.id==\"pyPaginateActivity\" || field.id==\"pyContainerVisibleWhen\" || field.id==\"pyDisplayWhen\" || field.id==\"pyAppendActivity\" || field.id==\"pyDeleteActivity\" || field.id==\"pyTargetSection\") && document.getElementById(\"pyGridPromptClass\")){\n\t\t\tdocument.getElementById(\"pyGridPromptClass\").value=gridsectionClassName;\n\t\t\tif(document.getElementById(\"pySmartPromptClass\")){\n\t\t\t\tdocument.getElementById(\"pySmartPromptClass\").value=gridrowPageClassName;\n\t\t\t}\n\n\t}\n\t/*Specify the fields that require Row class for prompting*/\n\tif(isGridPropertyPanel && (field.id==\"pyRowVisibleCondition\" || field.id==\"pyRowRefresh\" || field.id==\"pyEditAction\" || field.id==\"pyCondition\" || field.id==\"pyDeferLoadActivity\") && document.getElementById(\"pyGridPromptClass\")){\n\t\tdocument.getElementById(\"pyGridPromptClass\").value=gridrowPageClassName;\n\t} \n}\n\nfunction processExpressionField(fieldObject){\n/* event = pega.util.Event.getEvent(event);\nvar fieldObj = pega.util.Event.getTarget(event);*/\nvar fieldObj=fieldObject;\n if(!fieldObj || !document.getElementById(\"pySourceType\")){\n\treturn;\n}\nif(fieldObj.id!=\"pyRowVisibleCondition\" && fieldObj.id!=\"pyRowRefresh\" && fieldObj.id!=\"pyContainerVisibleWhen\" && fieldObj.id!=\"pyDisplayWhen\" && fieldObj.id!=\"pyCondition\"){\n\treturn;\n}\nvar fieldValue=fieldObj.value;\nvar re=new RegExp(\"\\\"\",\"g\");\nfieldValue=fieldValue.replace(re,\"\\'\");\nfieldObj.value=fieldValue;\n}\n\n/*determining DataSource info based upon pySourceType*/\nfunction getGridDataSourceClass(fieldObj){\n\tif(!fieldObj){\n\t\treturn;\n\t}\n\t/* event = pega.util.Event.getEvent(event);\n\tvar field = pega.util.Event.getTarget(event); */\n\tvar field=fieldObj;\nif(!isGridPropertyPanel || (field.id!=\"pyPageListProperty\" && field.id!=\"pyDPName\" && field.id!=\"pyRDName\")){\n\treturn;\n}\n\nvar sourceTypeStr=\"\";\nif(document.getElementById(\"pySourceType\")){\n\t\tvar sourceType=document.getElementById(\"pySourceType\");\n\t\tsourceTypeStr=sourceType[sourceType.selectedIndex].value;\n}\nif(sourceTypeStr!=\"\" && sourceTypeStr==\"Property\"){\n\t/*Getting the pagelist property class*/\n\tvar objTempSafeURL = new SafeURL();\n\tobjTempSafeURL.put(\"pyActivity\",\"Rule-Obj-Property.GetPageListPropertyClasses\");\n\tobjTempSafeURL.put(\"ClassName\" , gridsectionClassName);\n\tobjTempSafeURL.put(\"PageListProperty\" , document.getElementById(\"pyPageListProperty\").value);\t\t\t\t\t\t\n\tvar strSafeURL = objTempSafeURL.toURL();\n\tvar retXML = httpRequestAsynch(strSafeURL);\n\tvar ruleXML;\n\tif(window.DOMParser){\n\t  parser=new DOMParser();\n\t  ruleXML=parser.parseFromString(retXML,\"text/xml\");\n\t}\n\telse{ /*IE*/\n\t  ruleXML=new ActiveXObject(\"Microsoft.XMLDOM\");\n\t  ruleXML.async=false;\n\t  ruleXML.loadXML(retXML); \n\t}\n\t/*var ruleXML= new ActiveXObject(\"microsoft.xmldom\");\n\truleXML.async= false;\n\truleXML.loadXML(retXML);*/\n\tvar pglistpropval=document.getElementById(\"pyPageListProperty\").value;\n\tif(pglistpropval.charAt(pglistpropval.length-1)==\".\"){\n\t\tpglistpropval=pglistpropval.substring(0,pglistpropval.length-1);\n\t\tdocument.getElementById(\"pyPageListProperty\").value=pglistpropval;\n\t}\n\ttry{\n\t\tvar dataSourceClassName = ruleXML.selectSingleNode(\"//pxResults\").selectSingleNode(\"rowdata\").selectSingleNode(\"pyClassName\").text;\n\t\t/*if pagelist property class is empty in response xml then read pagesAndClasses*/\n\t\tif(dataSourceClassName==\"\"){\n\t\t\t/*\n\t\t\tcomparing the pages and classes info from the PagesAndClasses tab instead of PRXML.\n\t\t\tPRXML may contain stale info, but PagesAndClasses tab will always contain the updated entries.\n\t\t\t*/\n\t\t\tif(pagesList.length>0 && classesList.length>0){\n\t\t\t\tfor(var q=0;q<pagesList.length;q++){\n\t\t\t\t\tif(pagesList[q]==document.getElementById(\"pyPageListProperty\").value){\n\t\t\t\t\t\tdataSourceClassName=classesList[q];\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tif(dataSourceClassName==\"\"){\n\t\t\t/*read pages and classes info*/\n\t\t\t\tif(document.getElementById(\"PRXML\") && pagesAndClasses){\n\t\t\t\t\tfor(var q=0;q<allpages.length;q++){\n\t\t\t\t\t\tif(allpages[q].text==document.getElementById(\"pyPageListProperty\").value){\n\t\t\t\t\t\t\tdataSourceClassName=allclasses[q].text;\n\t\t\t\t\t\t}\n\t\t\t\t\t}\n\t\t\t\t\t\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\tdocument.getElementById(\"pyPageListPropertyClass\").value=dataSourceClassName;\n\t\tgridrowPageClassName=dataSourceClassName;\n\t\tif(document.getElementById(\"pySmartPromptClass\")){document.getElementById(\"pySmartPromptClass\").value=gridrowPageClassName;}\n\t\tif(document.getElementById(\"pyGridPromptClass\")){\n\t\t\tdocument.getElementById(\"pyGridPromptClass\").value=dataSourceClassName;\n\t\t}\t\t\n\t}catch(e){}\n}else if(sourceTypeStr!=\"\" && sourceTypeStr==\"Data Object\"){\n\t/*getting the dp class*/\n\tvar objTempSafeURL = new SafeURL();\n\tobjTempSafeURL.put(\"pyActivity\",\"@baseclass.pzGetDeclarePageListClassName\");\n\tobjTempSafeURL.put(\"DeclarePageName\" , document.getElementById(\"pyDPName\").value);\t\t\t\t\t\t\n\tvar strSafeURL = objTempSafeURL.toURL();\n\tvar retXML = httpRequestAsynch(strSafeURL);\n\tif(document.getElementById(\"pyPageListProperty\")){\n\t\tdocument.getElementById(\"pyPageListProperty\").value=document.getElementById(\"pyDPName\").value+\".pxResults\";\n\t}\n\tif(document.getElementById(\"pyDPResultsClass\")){document.getElementById(\"pyDPResultsClass\").value=retXML;}\n\tif(document.getElementById(\"pyPageListPropertyClass\")){\n\t\tdocument.getElementById(\"pyPageListPropertyClass\").value=retXML;\n\t}\n\tgridrowPageClassName=retXML;\n\tif(document.getElementById(\"pySmartPromptClass\")){document.getElementById(\"pySmartPromptClass\").value=gridrowPageClassName;}\n\tif(document.getElementById(\"pyGridPromptClass\")){\n\t\tdocument.getElementById(\"pyGridPromptClass\").value=retXML;\n\t}\n}\n}\n\n/*For correcting the class when open icon is clicked in case of pyPageListProperty*/\nfunction setSectionClassForPageListPropertyOpen(fieldname){\nif(fieldname.indexOf(\"pyPageListProperty\")!=-1 && document.getElementById(\"pySourceType\")){\n\tvar srcTypeDropDown=document.getElementById(\"pySourceType\");\n\tvar selectedSrc=srcTypeDropDown[srcTypeDropDown.selectedIndex].value;\n\tif(selectedSrc==\"Property\" && document.getElementById(\"pyGridPromptClass\")){\n\t\tdocument.getElementById(\"pyGridPromptClass\").value=gridsectionClassName;\n\t}\n}\n}\n\n/*\nHandle prompting for pyRowVisibleCondition, pyRowRefresh, pyContainerVisibleWhen, pyDisplayWhen\nIn case of \"Condition (when)\" prompting the When rules instead of properties.\n\n##################################################\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nThis function \"handlePropAndRulePrompting\" is \nspecifically written for the new propertypanels\nof Repeating Grid.\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n##################################################\n*/\nfunction handlePropAndRulePrompting(fieldObj, event){\n\t/* event = pega.util.Event.getEvent(event);\n\tvar field = pega.util.Event.getTarget(event); */\n\tif(!fieldObj){\n\t\treturn;\n\t}\n\tvar field=fieldObj;\n\tif(field && field.id!=\"pyRowVisibleCondition\" && field.id!=\"pyRowRefresh\" && field.id!=\"pyContainerVisibleWhen\" && field.id!=\"pyDisplayWhen\" && field.id!=\"pyCondition\"){\n\t\treturn; /*This API is specifically written for Grid Related Properties.*/\n\t}\n\tif(document.getElementById(\"pySourceType\")){\n\t\tvar sourceType=document.getElementById(\"pySourceType\");\n\t\tvar sourceTypeStr=sourceType[sourceType.selectedIndex].value;\n\t\tvar rdClass=\"\";\n\t\tif(sourceTypeStr==\"Report Definition\" && document.getElementById(\"pyRDAppliesTo\")){\n\t\t\trdClass=document.getElementById(\"pyRDAppliesTo\").value;\n\t\t\tgridrowPageClassName=rdClass;\n\t\t\tif(document.getElementById(\"pySmartPromptClass\")){document.getElementById(\"pySmartPromptClass\").value=gridrowPageClassName;}\n\t\t\t/*if(document.getElementById(\"pyGridPromptClass\")){\n\t\t\t\tdocument.getElementById(\"pyGridPromptClass\").value=rdClass;\n\t\t\t}*/\n\t\t}\n\t}\n\n\t/*if(field.dupCheck && field.dupCheck == true) return; */\n\tvar classChanged = false;\n\tif(field.value.indexOf(\".\") != -1 && field.getAttribute(\"ISNS_CLASS\") != \"Rule-Obj-Property\"){\n\t\tif(field.id==\"pyRowVisibleCondition\"){ /*Prompting only when rules and not properties in case of \"Condition (when)\"*/\n\t\t\tvar dropdownelem=document.getElementById(\"pyRowVisible\");\n\t\t\tif(dropdownelem){\n\t\t\t\tif(dropdownelem[dropdownelem.selectedIndex].value==\"WhenCondition\"){\n\t\t\t\t\treturn;\n\t\t\t\t}\n\t\t\t}\n\t\t}else if(field.id==\"pyRowRefresh\"){ /*Prompting only when rules and not properties in case of \"Condition (when)\"*/\n\t\t\tvar dropdownelem=document.getElementById(\"pyShowRowRefresh\");\n\t\t\tif(dropdownelem){\n\t\t\t\tif(dropdownelem[dropdownelem.selectedIndex].value==\"WhenCondition\"){\n\t\t\t\t\treturn;\n\t\t\t\t}\n\t\t\t}\n\t\t}else if(field.id==\"pyContainerVisibleWhen\" && document.getElementById(\"pySourceType\")){ /*Only for grid return for condition.*/ /*Prompting only when rules and not properties in case of \"Condition (when)\"*/\n\t\t\tvar dropdownelem=document.getElementById(\"pyIsVisibilityOption\");\n\t\t\tif(dropdownelem){\n\t\t\t\tif(dropdownelem[dropdownelem.selectedIndex].value==\"CONDITION\"){\n\t\t\t\t\treturn;\n\t\t\t\t}\n\t\t\t}\n\t\t}else if(field.id==\"pyDisplayWhen\"){ /*Prompting only when rules and not properties in case of \"Condition (when)\"*/\n\t\t\tvar dropdownelem=document.getElementById(\"pyDisplayWhenOptions\");\n\t\t\tif(dropdownelem){\n\t\t\t\tif(dropdownelem[dropdownelem.selectedIndex].value==\"WhenCondition\"){\n\t\t\t\t\treturn;\n\t\t\t\t}\n\t\t\t}\n\t\t}else if(field.id==\"pyCondition\" && document.getElementById(\"pySourceType\")){ /*Only for grid return for condition.*/ /*Prompting only when rules and not properties in case of \"Condition (when)\"*/\n\t\t\tvar dropdownelem=document.getElementById(\"pyVisible\");\n\t\t\tif(dropdownelem){\n\t\t\t\tif(dropdownelem[dropdownelem.selectedIndex].value==\"WhenCondition\"){\n\t\t\t\t\treturn;\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\t\n\t\t  field.setAttribute(\"ISNS_CLASS\", \"Rule-Obj-Property\");\n\t\t  field.setAttribute(\"ISNS_PROPAUTOPROMPT\",  \"NO\");\n\t\t  field.setAttribute(\"ISNS_FIELDTYPE\", \"PROPERTY\");\n\t\t  classChanged = true;\n\t\t\n\t}else if(field.value.indexOf(\".\") == -1){\n\t\tfield.setAttribute(\"ISNS_CLASS\", \"Rule-Obj-When\");\n\t\tfield.setAttribute(\"ISNS_PROPAUTOPROMPT\", \"NO\");\n\t\tfield.setAttribute(\"ISNS_FIELDTYPE\", \"RULEKEY\");\n\t\tclassChanged = true;\n\t}\n\tif(classChanged){               \n\t\tobjSmartPrompt.doOnFocus(fieldObj, event);\n\t}\n\tif(event.keyCode == 190 ) {\n\t\tISnsInputKeyUpCommon(40,field,true);\t\t\n\t}\n}\nfunction OpenRuleAdvanced_isActive(){\n\treturn ISnsPopupVisible();\n}\n\nfunction onChangeHandler(elem){\n\tif(window.event.srcElement === elem){\n\t\tif(!OpenRuleAdvanced_isActive()) { \n\t\t\tif(elem.getAttribute(\"ONCHANGE_CUSTOM\") != null) {\n\t\t\t\teval(elem.getAttribute(\"ONCHANGE_CUSTOM\"));\n\t\t\t}\n\t\t\tif(elem.getAttribute(\"ONBLUR_CUSTOM\") !=null) {\n\t\t\t\teval(elem.getAttribute(\"ONBLUR_CUSTOM\"));\n\t\t\t}\n\t\t} \n\t}\n\telse{\n\t\tpega.util.Event.fireEvent(elem,'onchange');\n\t\tpega.util.Event.fireEvent(elem,'onblur');\n\t}\n}\n\nfunction findElement(dataElementName, srcElement){\n\tvar theParent = srcElement.parentElement;\n\twhile (theParent != null) {\n\t\t\n\t\tdataElement = theParent.getElementsByTagName(\"INPUT\")[0];\n\t\tif (dataElement != null && (dataElement.name == dataElementName || dataElement.id == dataElementName))\n\t\t\ttheParent = null;\n\t\telse\n\t\t\ttheParent = theParent.parentElement;\n\t}\n\treturn dataElement;\n}\n\nfunction openMethodRule(dataElementName, objEvent){\n\tvar srcElement = objEvent.target || objEvent.srcElement;\n\tvar dataElement = findElement(dataElementName, srcElement);\n\n\tvar objClass = dataElement.getAttribute(\"ISNS_CLASS\");\n\tvar value = dataElement.value;\n\t\n \t/* http request for keys */\n\tvar strUrl = new SafeURL(\"Embed-ActivitySteps.pzGetStepInfo\");\n\tstrUrl.put(\"method\", value);\n\t\n\tvar stepPageReference = objSmartPrompt.getElemRef(\"pyStepPageReference\", dataElement).value;\n\t\n\tstrUrl.put(\"stepPage\", stepPageReference);\n\tvar callback2 = {\n\t\tsuccess: function(response){\n\t\t\tvar newRule = true;\n\t\t\tvar pyClassName = \"\";\n\t\t\tvar pyRuleName = \"\";\n\t\t\tvar flowParamArray = [];\n\t\t\t//Evaluate the server response\n\t\t\tvar params = response.responseText.split(\"&\");\n\t\t\tfor (i in params){\n\t\t\t\tvar paramPair = params[i].split(\"=\");\n\t\t\t\tif(paramPair[0]&&paramPair[1]) {\n\t\t\t\t\tif(paramPair[0]==\"pyClassName\"){\n\t\t\t\t\t\tpyClassName = paramPair[1];\n\t\t\t\t\t} else if(paramPair[0]==\"pzInsKey\" && paramPair[1]!=\"\"){\n\t\t\t\t\t\t\tnewRule = false;\n\t\t\t\t\t} else {\n\t\t\t\t\t\tflowParamArray.push(paramPair);\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\t\n\t\t\tif (!newRule){\n\t\t\tpega.desktop.openRuleByKeys(objClass, response.responseText);\n\t\t\t} else {\n\t\t\t\tvar strClassName = \"Work-ProjectManagement-New\",\n\t\t\t\t\tharnessVersion = \"\",\n\t\t\t\t\tstrFlowName = \"NewModalFlow\",\n\t\t\t\t\tflowParams = \"\",\n\t\t\t\t\tcontentID = \"\",\n\t\t\t\t\tdynamicContainerID = \"\",\n\t\t\t\t\tactionRequestID = \"\",\n\t\t\t\t\tskipConflictCheck = \"\";\n\t\t\t\tflowParams += \"&newObjClass=\"+objClass;\n\t\t\t\tflowParams += \"&newClassName=\"+pyClassName;\n\t\t\t\tfor(var i in flowParamArray){\n\t\t\t\t\tflowParams += \"&Key\"+flowParamArray[i][0]+\"=\"+flowParamArray[i][1];\n\t\t\t\t}\n\t\t\t\t//flowParams += \"&KeypyBlockName=\"+\"testRuleName\";\n\t\t\t\tpega.desktop.createNewWork(strClassName, harnessVersion, strFlowName, flowParams,contentID, dynamicContainerID,actionRequestID, skipConflictCheck);\n\t\t\t}\n\n\t\t},\n\t\tscope: this\n\t};\n\tpega.u.d.asyncRequest('GET', strUrl, callback2, null);\n\t\n}\n\nfunction updateActivityMethodQueryOnKeyUp(sourceElement, event){\n\tif (event && event.keyCode === 40) {\n\t\tif(sourceElement.lastMethodQuery == sourceElement.value){\n\t\t\treturn;\n\t\t}\n\t\tsourceElement.lastMethodQuery = sourceElement.value;\n\t\tupdateActivityMethodQuery(sourceElement, event);\n\t}\n}\n\nfunction updateActivityMethodQueryButton(name,event){\n\n\tupdateActivityMethodQuery(document.getElementsByName(name)[0], event);\n\topenMethodRule(name,event);\n}\n\n/* Custom Query for Activity Methods.  */\nfunction updateActivityMethodQuery(sourceElement, event){\n\n\n  \n  \t//SE-27021 Making use of safeurl to parse the query string instead of hardcoded values  \t\n  \tvar stepsActivityName = objSmartPrompt.getElemRef(\"pyStepsActivityName\", sourceElement).value;\n  \tvar stepPageReference = objSmartPrompt.getElemRef(\"pyStepPageReference\", sourceElement).value;\t\t\n  \n  \tvar objTempSafeURL = new SafeURL();\n\tobjTempSafeURL.put(\"pyActivity\",\"Embed-ActivitySteps.pzGetActivityMethods\");\n\tobjTempSafeURL.put(\"method\" , stepsActivityName);\n\tobjTempSafeURL.put(\"stepPageReference\" , stepPageReference);\n  \t\n  \t//query = \"&\"+query;\n\t/* add param for method or activity */\n\t/* if activity */\n\tvar inputText = sourceElement.value;\n\tif(sourceElement.value.indexOf(\" \", inputText.length - 1) !== -1) {\t\t\n      \tobjTempSafeURL.put(\"spaceCheck\" , true); \n\t}\n  \t\n  \tvar query = \"&\" + objTempSafeURL.toQueryString();\n  \n\tsourceElement.setAttribute(\"ISNS_MYQUERY\", query);\n\tif(inputText.toUpperCase().indexOf(\"CALL \") == 0 || inputText.toUpperCase().indexOf(\"BRANCH \") == 0 || inputText.toUpperCase().indexOf(\"QUEUE \") == 0){\n\t\tsourceElement.setAttribute(\"ISNS_CLASS\", \"Rule-Obj-Activity\");\n\t\tsourceElement.setAttribute(\"ISNS_BASECLASS\", \"pyStepsClassName\");\n\t\tsourceElement.setAttribute(\"ISNS_DATANODE\", \"pyActivityName\");\n\t}\n\telse if(inputText.toUpperCase().indexOf(\"COLLECT \") == 0){\n\t\tsourceElement.setAttribute(\"ISNS_CLASS\", \"Rule-Declare-Collection\");\n\t\tsourceElement.setAttribute(\"ISNS_BASECLASS\", \"pyStepsClassName\");\n\t\tsourceElement.setAttribute(\"ISNS_DATANODE\", \"pyPurpose\");\n\t}\n\telse if(inputText.toUpperCase().indexOf(\"FLOW-NEW \") == 0){\n\t\tsourceElement.setAttribute(\"ISNS_CLASS\", \"Rule-Obj-Flow\");\n\t\tsourceElement.setAttribute(\"ISNS_BASECLASS\", \"pyStepsClassName\");\n\t\tsourceElement.setAttribute(\"ISNS_DATANODE\", \"pyFlowType\");\n\t}\n\telse{\n\t\tsourceElement.setAttribute(\"ISNS_CLASS\", \"Rule-Method\");\n\t\tsourceElement.setAttribute(\"ISNS_BASECLASS\", \"\");\n\t\tsourceElement.setAttribute(\"ISNS_DATANODE\", \"pyRuleName\");\n\t}\n\n\t/* evaluate properties in query */\n\tobjSmartPrompt.updateISNSCustomQuery(sourceElement);\n}\n\n\n\n</script>\n\n");
/* Include stream RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT */
include_3();

tools.appendString("\n");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_4();

tools.appendString("\n\n");
choose_1();
tools.appendString("\n\n\n");
choose_2();
tools.appendString("\n\n\n");
choose_3();
tools.appendString("\n\n\n");
choose_4();
tools.appendString("\n\n\n");
choose_5();
tools.appendString("\n\n\n");
choose_6();
tools.appendString("\n\n\n");
choose_7();
tools.appendString("\n\n\n");
choose_8();
tools.appendString("\n\n\n");
choose_9();
tools.appendString("\n\n\n");
	if (when_2("GroupNode", "")) {
tools.appendString("\n\t");
pzAuto.putSaveRef("ISNS_GROUPNODE", "param.GroupNode", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n");
	}
tools.appendString("\n\n");
	if (when_2("MaxRows", "")) {
tools.appendString("\n\t");
pzAuto.putSaveRef("ISNS_MAXROWS", "param.MaxRows", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n");
	}
tools.appendString("\n\n");
	if (when_2("LabelField", "")) {
tools.appendString("\n\t");
pzAuto.putSaveRef("ISNS_LABELFIELD", "param.LabelField", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n");
	}
tools.appendString("\n\n");
	boolean foundChoice_5 = false;
tools.appendString("\n    ");
if (!foundChoice_5 && (pega.isPreviewMode() || !tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize").equals(""))) {
tools.appendString("\n        \n\t");
 
	tools.putSaveValue("pzResult", ""); //Bug-11491 : reset the save variable
	float expSize = 0;
	try{
		expSize  = (float)Integer.parseInt(tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize"));
		expSize += java.lang.Math.ceil(expSize*20/100);
	} catch(NumberFormatException e){
		/* Use zero. */
	}
	String strExpectedSize = (int)expSize + "";
	tools.putSaveValue("strExpectedSize",strExpectedSize);
	
tools.appendString("\n    ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString("\n    ");
if (!foundChoice_5 && when_2("Size", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("strExpectedSize", "param.Size", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString("\n    ");
if (!foundChoice_5) {
tools.appendString("\n\t");
tools.putSaveValue("strExpectedSize", "");
tools.appendString("\n    ");
}
tools.appendString("\n\n\n\n");
pzAuto.putSaveRef("strExpectedWidth", "param.Width", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\n\n");

	String strExpectedSize = tools.getSaveValue("strExpectedSize");
	if(strExpectedSize != ""){
		String strActualSize = tools.getSaveValue("strExpectedSize");
		tools.putSaveValue("strExpectedSize",strActualSize);
	}

	
	String strInputWidth = "";
	String strTDWidth = "";
	String strExpectedWidth = tools.getSaveValue("strExpectedWidth");


	if( strExpectedWidth != ""){
		if( strExpectedWidth.endsWith("px") ){ /* Pixel-based */
			String strTableWidth = "";
			strInputWidth = strExpectedWidth;
/*
			int index = strExpectedWidth.indexOf("px");
			String subStr = strExpectedWidth.substring(0,index);
			tools.putSaveValue("subStr", subStr);		
			strInputWidth = (Integer.parseInt(tools.getSaveValue("subStr")) - 21) + "px";
			tools.putSaveValue("strExpectedWidth",strTableWidth);
*/
		}	
		else if( strExpectedWidth.endsWith("%") ){ /* Percentage-based */
			strInputWidth = "100%";
			strTDWidth = "100%";
			tools.putSaveValue("strExpectedWidth",strExpectedWidth);
		}
		else if ( strExpectedWidth.indexOf("auto") >= 0) { /* auto */
			strInputWidth = "auto";
			strTDWidth = "auto";
			tools.putSaveValue("strExpectedWidth","auto");
		}
	}

	

	tools.putSaveValue("strInputWidth",strInputWidth);
	tools.putSaveValue("strTDWidth",strTDWidth);

tools.appendString("\n\n\n");
choose_10();
tools.appendString("\n\n\n");
choose_11();
tools.appendString("\n\n\n");
choose_12();
tools.appendString("\n\n\n");
choose_13();
tools.appendString("\n\n\n");
choose_14();
tools.appendString("\n\n\n");
choose_15();
tools.appendString("\n\n\n");
choose_16();
tools.appendString("\n\n\n");
choose_17();
tools.appendString("\n\n\n");
 String pageName = tools.getStepPage().getName();
   if(pageName.equals("")){
      pageName = tools.getActive().getTopLevelPage().getName();
      
   }
   tools.putSaveValue("pageName",pageName);

tools.appendString("\n\n<!-- Save the RF_GetParams HTML Property Parameters values if RuleParameters node exists --> \n\n");
	if (pega.isPreviewMode() || tools.getParameterPage().getParameterValue("RuleParameters")!= null) {
tools.appendString("\n\t");
pzAuto.putSaveRef("RuleType", "param.RuleType", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t");
pzAuto.putSaveRef("RuleClass", "param.RuleClass", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t");
pzAuto.putSaveRef("RuleParameters", "param.RuleParameters", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t");
pzAuto.putSaveRef("HideParametersList", "param.HideParametersList", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n");
	}
tools.appendString("\n\n\n\t<INPUT type=\"hidden\" id=\"pyStepsClassName\" value=\"@baseclass\">\n\t\n\t<table id=\"SL_Table\" cellspacing=0 cellpadding=0\n\t\tstyle='width:");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strExpectedWidth)", "literal")) {
	return;
}
tools.appendString("' >\n\t<tr>\n\t");
choose_18();
tools.appendString("\n\t\n\t\t\tSTYLE='width:");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strTDWidth)", "literal")) {
	return;
}
tools.appendString("'>\n\n\t<INPUT \n\t\t");
	if (when_2("SkipClientValidation", "-1")) {
tools.appendString("\n\t\t\t");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_5();

tools.appendString(" \n\t\t");
	}
tools.appendString("\nname=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("\"\n\t\tSIZE=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strExpectedSize)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strExpectedSize)")) {
	return;
}
tools.appendString("\"\n\t\tID=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-Definition(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-Definition(pyPropertyName)")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" \t\t\n\t\tTYPE=\"text\" value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\"\n\t\t");
	if (when_2("Width", "")) {
tools.appendString(" \n\t\t\tSTYLE='width:");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strInputWidth)", "literal")) {
	return;
}
tools.appendString(";'\n\t\t");
	}
tools.appendString("\n\t\t");
	if (when_3("Width", "")) {
tools.appendString("\n\t\t\tSIZE=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-Definition(pyExpectedSize)", "NORMAL")) {
	return;
}
tools.appendString("\"\t\t \t\n\t\t");
	}
tools.appendString("\n\n\t\t\n\t\t");
	if (when_2("Class", "")) {
tools.appendString("\n\t\t\tISNS_CLASS=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_CLASS)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_CLASS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\t\t");
	if (when_2("ApplyTo", "")) {
tools.appendString("\n\t\t\tISNS_BASECLASS=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_BASECLASS)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_BASECLASS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("TextBoxTooltip", "")) {
tools.appendString("\n\t\t\tTITLE=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strToolTip)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strToolTip)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\t\t\n\t\t");
	if (when_2("NoSmartPrompt", "-1")) {
tools.appendString("\t\n\t\t\tONFOCUS=\"objSmartPrompt.doOnFocus(this, event); setGridClassNameDefaults(this);\" \n\t\t\tCLASS=\"InputIntellisenseStyle\"\n\t\t\tISNS_ONCHANGE = \"onChangeHandler\"\n\t\t\t");
	if (when_2("NoEventOnPick", "-1")) {
tools.appendString("\n\t\t\t\tISNS_ONPICK = \"onChangeHandler\"\n\t\t\t");
	}
tools.appendString("\n\t\t");
	}
tools.appendString("\t\t\n\t\t\n\t\t");
	if (when_2("OtherKeyValuePairs", "")) {
tools.appendString("\n\t\t\t ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(OTHERKEYVALUEPAIRS)", "literal")) {
	return;
}
tools.appendString("\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("CustomQuery", "")) {
tools.appendString("\n\t\t\tISNS_MYQUERY=");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(ISNS_MYQUERY)", "literal")) {
	return;
}
tools.appendString("\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("DisplayProperty", "")) {
tools.appendString("\n\t\t\tISNS_DATANODE=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_DATANODE)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_DATANODE)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("DisplayPropertyTooltip", "")) {
tools.appendString("\n\t\t\tISNS_TTIPNODE=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_TTIPNODE)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_TTIPNODE)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("AdditionalParams", "")) {
tools.appendString("\n\t\t\tISNS_ADDLPARAMS = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_ADDLPARAMS)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_ADDLPARAMS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n                  ");
	if (when_3("ListName", "")) {
tools.appendString("\n\t\t\tISNS_LISTNAME=\"List\"\n\t\t");
	}
tools.appendString("\n\t\t");
	if (when_2("ListName", "")) {
tools.appendString("\n\t\t\tISNS_LISTNAME = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_LISTNAME)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_LISTNAME)")) {
	return;
}
tools.appendString("\"\n\n                  ");
	}
tools.appendString("\n                  ");
	if (when_2("FieldType", "")) {
tools.appendString("\n\t\t\tISNS_FIELDTYPE = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_FIELDTYPE)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_FIELDTYPE)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n                   \n\t\t");
	if (when_2("ShowGroups", "")) {
tools.appendString("\n\t\t\tISNS_SHOWGROUPS = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_SHOWGROUPS)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_SHOWGROUPS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n                   \n\t\t");
	if (when_2("PropertyAutoPrompt", "")) {
tools.appendString("\n\t\t\tISNS_PROPAUTOPROMPT = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_PROPAUTOPROMPT)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_PROPAUTOPROMPT)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("PropertyExtras", "")) {
tools.appendString("\n\t\t\tISNS_PROPERTYEXTRAS = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_PROPERTYEXTRAS)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_PROPERTYEXTRAS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\t\t");
	if (when_3("PropertyExtras", "")) {
tools.appendString("\n\t\t\tISNS_PROPERTYEXTRAS = \"oOpenRuleAdvPropExtra\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("XMLObjName", "")) {
tools.appendString("\n\t\t\tISNS_XMLOBJNAME = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_XMLOBJNAME)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_XMLOBJNAME)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("ClassGroupInstances", "false")) {
tools.appendString("\n\t\t\tISNS_CLASSGROUPONLY = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_CLASSGROUPONLY)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_CLASSGROUPONLY)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("GroupNode", "")) {
tools.appendString("\n\t\t\tISNS_GROUPNODE = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_GROUPNODE)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_GROUPNODE)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("MaxRows", "")) {
tools.appendString("\n\t\t\tISNS_MAXROWS = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_MAXROWS)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_MAXROWS)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("LabelField", "")) {
tools.appendString("\n\t\t\tISNS_LABELFIELD = \"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_LABELFIELD)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_LABELFIELD)")) {
	return;
}
tools.appendString("\"\n\t\t");
	}
tools.appendString("\n\t\t\n\t\t");
choose_20();
tools.appendString("\n\t\t\n\n\t\t");
choose_21();
tools.appendString("\n\t\t\n\t\t\n\t\t");
	if (when_3("DisableInputBox", "-1")) {
tools.appendString("\n                   \tdisabled\n                   ");
	}
tools.appendString("\n                  \t\t\n\t\tISNS_POPUPTYPE=\"DIV\"\n\t\tisBaseClassSet = \"false\"\n\t\tAUTOCOMPLETE=\"off\"  \n\t\t\n\t\t");
choose_22();
tools.appendString("\n\t\t   \n\t\tonchange=\"getGridDataSourceClass(this);\"\n\t\tonblur=\"processExpressionField(this);\"\n\t\t></td>\n\t");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("NoOpenRule"), "-1"))) {
tools.appendString("\n\t<td style=\"font-size: 2pt;\">&nbsp;</td>\n\t");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("OpenRuleTooltip"), "NoOpenRuleIcon"))) {
tools.appendString("\n\t<td nowrap>\n\t<BUTTON style=\"BORDER-RIGHT: 0px; BORDER-TOP: 0px; MARGIN: 0px; BORDER-LEFT: 0px; BORDER-BOTTOM:0px;");
out.print(visibilityStyle);
tools.appendString("\" ONCLICK=\"setSectionClassForPageListPropertyOpen('");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("'); updateActivityMethodQueryButton('");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("', event); return false;\" TITLE =\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strButtonToolTip)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strButtonToolTip)")) {
	return;
}
tools.appendString("\" type=\"button\">\n\t<SPAN class=\"iconOpenRule\" ONMOUSEOVER=\"this.className='iconOpenRule_on'\"  \n\tONMOUSEOUT=\"this.className='iconOpenRule'\"></SPAN>\n\t</BUTTON></td>\n\t");
	}
tools.appendString("\n\t");
	}
tools.appendString("\n\t");
	if (pega.isPreviewMode() || tools.getParameterPage().getParameterValue("RuleParameters")!= null) {
tools.appendString("\n<!-- Params button, will be displayed when using GETPARAMS Html Property  -->\n\t<td nowrap>\n\t<button style=\"border-width: 0; height: 16px;");
out.print(visibilityStyle);
tools.appendString("\" \nonclick=\"getRuleParams(event,'");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-name"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-name")) {
	return;
}
tools.appendString("')\"\nRuleType=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(RuleType)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(RuleType)")) {
	return;
}
tools.appendString("\"\nRuleClass=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(RuleClass)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(RuleClass)")) {
	return;
}
tools.appendString("\"\nRuleParameters=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(RuleParameters)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(RuleParameters)")) {
	return;
}
tools.appendString("\"\nHideParametersList=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(HideParametersList)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(HideParametersList)")) {
	return;
}
tools.appendString("\"\nAdditionalParams=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ISNS_ADDLPARAMS)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ISNS_ADDLPARAMS)")) {
	return;
}
tools.appendString("\"\npageName=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(pageName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(pageName)")) {
	return;
}
tools.appendString("\"\ntype=\"button\">\n\t<span class=\"iconUpdate\" onmouseover=\"this.className='iconUpdate_on'\"  \n\tonmouseout=\"this.className='iconUpdate'\"></span>\n\t</button></td>  \n\t");
	}
tools.appendString("\n\t</tr></table>\n\n");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice_1) {
tools.appendString("\n");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "NORMAL")) {
	return;
}
tools.appendString("\n");
}
tools.appendString("\n");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY OPENRULEADVANCEDMETHOD #20180713T135129.145 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "OpenRuleAdvancedMethod");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT", "Messages", "Pega-UIDesign", "08-01-01", "20180713T133634.985 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT", "RMAction_Variables", "Pega-WB", "08-01-01", "20180713T131549.076 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY OPENRULEADVANCEDMETHOD #20180713T135129.145 GMT", "OpenRuleAdvancedMethod", "Pega-Desktop", "08-01-01", "20180713T135129.145 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT", "SmartPrompt", "Pega-UIEngine", "08-05-01", "20200403T114021.492 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT", "SmartPromptWithOpenRuleInclude", "Pega-WB", "08-01-01", "20180713T131549.303 GMT");
}
