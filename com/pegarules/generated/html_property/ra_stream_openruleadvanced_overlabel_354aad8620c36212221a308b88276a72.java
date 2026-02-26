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
 * Builds JSP stream OPENRULEADVANCED_OVERLABEL.
 */
public class ra_stream_openruleadvanced_overlabel_354aad8620c36212221a308b88276a72 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.OpenRuleAdvanced_OverLabel.Stream");
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
	public ra_stream_openruleadvanced_overlabel_354aad8620c36212221a308b88276a72(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "cf3c43f4b3dae18302c0e9852db4e0b8dc7f43c9";
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
/* Instance RULE-HTML-PROPERTY OPENRULEADVANCED_OVERLABEL #20230618T003133.049 GMT	Pega-Desktop:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY OPENRULEADVANCED_OVERLABEL #20230618T003133.049 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY OPENRULEADVANCED_OVERLABEL #20230618T003133.049 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY OPENRULEADVANCED_OVERLABEL #20230618T003133.049 GMT */
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
	"Rule-HTML-Property:OPENRULEADVANCED_OVERLABEL", 
	"Rule-HTML-Property:MESSAGES", 
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
		new DependentRuleInfo("OPENRULEADVANCED_OVERLABEL","Rule-HTML-Property","",false,"","Pega-Desktop","08-23-01","RULE-HTML-PROPERTY OPENRULEADVANCED_OVERLABEL #20230618T003133.049 GMT","OPENRULEADVANCED_OVERLABEL",true,false,"ABSOLUTE_CLASSLESS",-2022749538), 
		new DependentRuleInfo("MESSAGES","Rule-HTML-Property","",false,"","Pega-UIDesign","08-01-01","RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT","MESSAGES",true,false,"ABSOLUTE_CLASSLESS",-794757422), 
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
//	RULE-HTML-PROPERTY OPENRULEADVANCED_OVERLABEL #20230618T003133.049 GMT:20230618T003133.049 GMT
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
		return "eb622f883b5c1786bdf261745094682c";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private boolean when_5() throws Throwable {
	return (pega.isPreviewMode() || ((tools.useModeInput())));
}
private boolean when_4(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(getPropertyVal(tools, aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_22() throws Throwable {
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
private void choose_21() throws Throwable {
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
private void choose_20() throws Throwable {
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
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");
out.print(mode1);
tools.appendString(" ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
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
	boolean foundChoice_5 = false;
tools.appendString(" ");
if (!foundChoice_5 && (pega.isPreviewMode() || isValidation == true)) {
tools.appendString("  ");
tools.putSaveValue("bAddedValidationType", "false");
tools.appendString(" ");
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || (areValsEqual(lookupThisDefinition(tools, "pyOnInput"), "")))) {
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
choose_20();
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_2("pega_validation", "")) {
tools.appendString("  ");
choose_20();
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

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
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

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5) {
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
 * Generates stream property_Embed_ModelParams_ClientValidation
 */
private void property_Embed_ModelParams_ClientValidation() {
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
property_Embed_ModelParams_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_19() throws Throwable {
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
private void choose_18() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("StyleClass", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("styleClass", "param.StyleClass", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice = !pega.isPreviewMode();
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
tools.appendString("\n        ");
pzAuto.putSaveRef("ISNS_BASECLASS", "param.ApplyTo", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

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
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "");
tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "inputErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "inputError");
tools.appendString(" ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
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
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" <b style=\"font-family: wingdings;color:red;cursor:hand\">x</b> ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
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
 * Generates stream property_Embed_ModelParams_Messages
 */
private void property_Embed_ModelParams_Messages() {
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
property_Embed_ModelParams_Messages();
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
private void onlyOnce_2() throws Throwable {
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
onlyOnce_2();
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
private void onlyOnce_3() throws Throwable {
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
onlyOnce_3();
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
/**
 * OnlyOnce condition: OpenRuleAdvanced_OverLabel_isActive
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("OpenRuleAdvanced_OverLabel_isActive")) {
tools.appendString("\n<script>\nfunction OpenRuleAdvanced_OverLabel_isActive(){\n\treturn ISnsPopupVisible();\n}\n\nfunction onChangeHandler_OverLabel(elem){\n\tif(!OpenRuleAdvanced_OverLabel_isActive()) { \n\t\tif(elem.getAttribute(\"ONCHANGE_CUSTOM\")!= null) {\n\t\t\teval(elem.getAttribute(\"ONCHANGE_CUSTOM\"));\n\t\t}\n\t\tif(elem.getAttribute(\"ONBLUR_CUSTOM\") !=null) {\n\t\t\teval(elem.getAttribute(\"ONBLUR_CUSTOM\"));\n\t\t}\n\t} \n}\n</script>\n");
}
}
private void performStream_6() throws Throwable {

  ClipboardPage uiActionPage = ((PegaAPI) tools).getUIEngine().getUIActionPage("openruleAdvancedActions");
  ((PegaAPI) tools).getUIEngine().getUIAction(uiActionPage).register();
  uiActionPage.removeFromClipboard();

	String pAttributes = tools.getParamValue("pega_attributes");
	if (pAttributes.indexOf("ONBLUR") > -1)
		pAttributes = pAttributes.replaceAll("ONBLUR", "ONBLUR_CUSTOM");
	if (pAttributes.indexOf("ONCHANGE") > -1)
		pAttributes = pAttributes.replaceAll("ONCHANGE", "ONCHANGE_CUSTOM");
	tools.putParamValue("pega_attributes", pAttributes);
	String textBoxToolTip = tools.getParamValue("TextBoxTooltip");
	tools.putParamValue("TextBoxTooltip", tools.getLocalizedTextForString("pyToolTip",textBoxToolTip));

tools.appendString("\n\n");
if (!pega.isResearchMode() && !pega.checkOnlyOnce("OpenRuleAdvanced_OverLabel_SmartPrompt")) {
tools.appendString("\n\n<script>\n/*\nISNS_BASECLASS for smartprompt\n*/\nfunction getSmartPromptClass_OverLabel(event, pyClassNameVar, element){\n  \n    var topLevelPrimaryPageClass = \"");
out.print(tools.getActive().getTopLevelPage().getString("pyClassName"));
tools.appendString("\";\t\n\tvar smartPromptClass = topLevelPrimaryPageClass;\n\tvar sourceElement;\n\n\tif(element == null){\n\t\tvar eObj = event || window.event;\n\t\tsourceElement = eObj.srcElement || eObj.target;\n\t}\n\telse{\n\t\tsourceElement = element;\n\t}\n\tif(sourceElement != null){\n\n\t\tvar fullNestedParentInputValue = getConcatinatedParentValue_OverLabel(sourceElement);\n   // var pgUrl = new SafeURL(\"Rule-Obj-Model.pzgetEmbedClassOfPropertyReference\");\n   var pgUrl = new SafeURL(\"");
out.print(pega_rules_utilities.pzEncryptURLActionString(tools, "Requestor","pyActivity=Rule-Obj-Model.pzgetEmbedClassOfPropertyReference"));
tools.appendString("\");\n    pgUrl.put(\"strInput\",fullNestedParentInputValue);\n    pgUrl.put(\"strClassName\",\"\");\n    var primaryPageName = \"");
out.print(tools.getActive().getTopLevelPage().getName());
tools.appendString("\";\n    pgUrl.put(\"pzPrimaryPageName\",primaryPageName);\n    var returnValue = httpRequestAsynch(pgUrl.toURL());\n    if(returnValue.indexOf(\"Please enter\")== -1)\n\t\t\tsmartPromptClass = returnValue;\n\t\t}\n\t\tsourceElement.parentElement.children[1].setAttribute(\"value\", smartPromptClass);\n\t\tvar action = getSelectedAction(sourceElement);\n\t\tif(action != null){\n      ");
  
        String queryString = "pyActivity=Rule-Obj-Property.GetPageListProperties";
        String encryptedText = pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", queryString); 
      
tools.appendString("\n      var encryptedAction=\"");
out.print(encryptedText);
tools.appendString("\";\n\t\t\tif((action == \"UPDATE_PAGE\"|| action == \"APPEND_AND_MAP_TO\" || action == \"FOR_EACH_PAGE_IN\" || action == \"APPEND_TO\" || (action == \"SORT\" && sourceElement.id == \"pyPropertiesName\")) && pyClassNameVar == \"Rule-Obj-Property\")\n\t\t\t\tsourceElement.setAttribute(\"ISNS_MYQUERY\", \"&\" + encryptedAction + \"&ClassName=\"+smartPromptClass);\t\n\t\t\t}\n  \n  /*BUG-191945:returning class for consumption in api showExpressionBuilderNewEB in control pzEBHiddenElement */\n  return smartPromptClass;\n}\n\n/*\nGiven the input \n*/\n\nfunction getSelectedAction(srcElement){\n\n\tvar actionName = null;\n\tvar n1 = srcElement.name.substring(0, srcElement.name.lastIndexOf('$'));\n\tn1 = n1+\"$ppyActionName\";\n\t\n\tvar actionInput = getObjectByName_OverLabel(n1);\n\tif(actionInput != null)\n\t\tactionName = actionInput.value;\n\n\treturn actionName;\n}\n\n\n/*\nGiven the source element, the function returns the concatinated value starting from the source element to all the up to its top most parent \n*/\n\nfunction getConcatinatedParentValue_OverLabel(sourceElement){\n\tvar nestedParentInputValue = \"\";\n\tvar immediateParentInputTextValue = \"\";\n\tvar whichElem = \"\";\n\tvar parentInputElementName = \"\";\n\tvar sourceElementName = sourceElement.name;\n\tvar depth = 0;\n\n\tif(sourceElementName.indexOf(\"pyPropertiesName\", sourceElementName.length - \"pyPropertiesName\".length) !== -1)\n\t\twhichElem = \"Target\";\n\telse if(sourceElementName.indexOf(\"pyPropertiesValue\", sourceElementName.length - \"pyPropertiesValue\".length) !== -1)\n\t\twhichElem = \"Source\";\n\telse if(sourceElementName.indexOf(\"pyAppendActionWhenProp\", sourceElementName.length - \"pyAppendActionWhenProp\".length) !== -1){\n\t\twhichElem = \"Source\";\n\t         parentInputElementName = sourceElement.name.substring(0, sourceElement.name.lastIndexOf('$'))+\"$ppyPropertiesValue\";\n\t}\n\telse if(sourceElement.id == \"pySortActionProp\"){\n\t\twhichElem = \"Target\";\n\t\tparentInputElementName = sourceElement.name.substring(0, sourceElement.name.lastIndexOf('$'))+\"$ppyPropertiesName\";\n\t}\n\n\tif(parentInputElementName == \"\")\n\t\tparentInputElementName = getParentInputNameGivenCurrentElement(sourceElement,whichElem);\n\t\n\tvar parentSourceInputElement = sourceElement;\n\tvar parentSourceInputElementName = sourceElement.name;\n    // Iterate until nested parent value is found or first step of DT is reached\n\twhile(parentInputElementName.split(\"$\").length >= 4 ){\n\t\tvar parentInputElement = getObjectByName_OverLabel(parentInputElementName);\n        // Checking if parent element is SourceContext checkbox\n\t\tif(parentInputElement == null){\n            // Storing parent element name instead of parent element DOM object to fix SE-28399\n            var currentSourceInputElementName = parentSourceInputElementName;\n\t\t\tparentSourceInputElementName = getParentInputNameGivenCurrentName(parentSourceInputElementName,\"SourceContext\");\t\t\t\n\t\t \tparentSourceInputElement = getObjectByName_OverLabel(parentSourceInputElementName);\n\t\t\tif(parentSourceInputElement != null && parentSourceInputElement.checked == true){\n\t\t\t\twhichElem = \"Target\";\n\t\t\t\tparentInputElementName = getParentInputNameGivenCurrentName(currentSourceInputElementName,\"Target\");\n\t\t\t\tparentInputElement = getObjectByName_OverLabel(parentInputElementName);\n\t\t\t}\t\n\t\t}\n        // Computing parent elemnet value if exists otherwise mark parent of current element as paraent element for further iterations \n\t\tif(parentInputElement != null){\n\t\t\tparentInputElementName = getParentInputNameGivenCurrentElement(parentInputElement,whichElem);\n\n\t\t\tvar selectedActionName = getSelectedAction(parentInputElement);\n\n\t\t\tif(!(selectedActionName  == \"WHEN\" || selectedActionName  == \"OTHERWISE_WHEN\" || selectedActionName  == \"OTHERWISE\") ){\t\n\t\t\t\timmediateParentInputTextValue = parentInputElement.value;\n\n\t\t\t\tif(depth != 0 && (selectedActionName == \"APPEND_AND_MAP_TO\" || selectedActionName == \"APPEND_TO\" || selectedActionName == \"FOR_EACH_PAGE_IN\") || selectedActionName == \"SORT\"){\n\t\t\t\t\tnestedParentInputValue = immediateParentInputTextValue+ \"()\" + nestedParentInputValue;\n\t\t\t\t} else {\n\t\t\t\t\tnestedParentInputValue = immediateParentInputTextValue+nestedParentInputValue;\n\t\t\t\t}\n\t\t\t\t// Break the loop if parent is a top level page\n\t\t\t\tif(!immediateParentInputTextValue.indexOf(\".\")== 0){\n\t\t\t\t\tbreak;\n\t\t\t\t}\n\t\t\t}\n\t\t}\n\t\telse {\n\t\t\tparentInputElementName = getParentInputNameGivenCurrentName(parentInputElementName,whichElem);\n\t\t}\n\tdepth = depth + 1;\n\t}\n\treturn nestedParentInputValue;\n}\n\n\n/*\nGets the parent input element object\n*/\n\nfunction getParentInputElement(sourceElement,Element){\n\n\tvar parentInputElement = null;\n\tvar parentInputElementTR = getParentInputName(sourceElement,Element);\n\n\tparentInputElement = getObjectByName_OverLabel(parentInputElementTR);\n\treturn parentInputElement;\n}\n\n/*\nGets the parent input element's name given the element\n*/\n\nfunction getParentInputNameGivenCurrentElement(sourceElement,Element){\n\n\tvar inputElementTR = sourceElement.name.substring(0, sourceElement.name.lastIndexOf('$'));\n\tinputElementTR = getParentInputName(inputElementTR,Element);\n\t\t\n\treturn inputElementTR;\n}\n\n/*\nGets the parent input element's name given the element's name\n*/\n\n\nfunction getParentInputNameGivenCurrentName(sourceElementName,Element){\n\n\tvar inputElementTR = sourceElementName.substring(0, sourceElementName.lastIndexOf('$'));\n\tinputElementTR = getParentInputName(inputElementTR,Element);\n\t\t\n\treturn inputElementTR;\n}\n\n/*\nGets the parent input element's name given the element's name\n*/\n\n\nfunction getParentInputName(inputElTR,Element){\n\n\tvar inputElementName = inputElTR;\n\n\tif(inputElementName != \"\"){\n\t\tinputElementName = inputElementName.substring(0, inputElementName.lastIndexOf('$'));\n\t\tif(inputElementName != \"\")\n\t\t\tinputElementName = inputElementName.substring(0, inputElementName.lastIndexOf('$'));\n\n\t}\n\tif(Element == \"Target\")\n\t\tinputElementName = inputElementName+\"$ppyPropertiesName\";\n\telse if(Element==\"Source\"){\n\t\tinputElementName = inputElementName+\"$ppyPropertiesValue\";\n\t}\n\telse if(Element==\"SourceContext\"){\n\t\tinputElementName = inputElementName+\"$ppyUpdateSourceContext\";\n\t}\t\n\treturn inputElementName;\n}\n\n\n/*\ngets the object given the name of an input element\n*/\nfunction getObjectByName_OverLabel(elementName){\n\n\tvar el = null;\n\tel = pega.util.Dom.getElementsByName(elementName);\n\t\n\tif(el != null){\n\t\t\tif(el.length > 0){\n\t\t\t\tfor(var i = 0; i < el.length; i++){\n\t\t\t\t\tif(el[i].getAttribute(\"type\") != \"hidden\"){\n\t\t\t\t\t\treturn el[i];\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t}\n\treturn el;\n}\n\n</script>\n");
}
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
tools.appendString("\n\n");
onlyOnce_1();
tools.appendString("\n\n");
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
	boolean foundChoice_3 = false;
tools.appendString("\n    ");
if (!foundChoice_3 && (pega.isPreviewMode() || !tools.getDictionary().fromDefinition(tools.getActive(), "pyExpectedSize").equals(""))) {
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

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString("\n    ");
if (!foundChoice_3 && when_2("Size", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("strExpectedSize", "param.Size", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n    ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString("\n    ");
if (!foundChoice_3) {
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
choose_18();
tools.appendString("\n \n\n");
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
tools.appendString("\n\n\n\n\n\t<table id=\"SL_Table\" cellspacing=0 cellpadding=0\n\t\tstyle='width:");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strExpectedWidth)", "literal")) {
	return;
}
tools.appendString("' >\n\t<tr>\n\t");
choose_19();
tools.appendString("\n\t\n\t\t\tSTYLE='width:");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strTDWidth)", "literal")) {
	return;
}
tools.appendString("'\n\t>\n\t\n\n\t<INPUT ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_5();

tools.appendString(" \n\t\tNAME=\"");

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
tools.appendString("\"\n\t\tPROPERTYNAME=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-Definition(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-Definition(pyPropertyName)")) {
	return;
}
tools.appendString("\"\n\t\tPLACEHOLDER=\"");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "param.OverLabel", "normal")) {
	return;
}
tools.appendString("\"\n\t\tTYPE=\"text\"\n    ONFOCUS=\"getSmartPromptClass_OverLabel(event, '");
out.print( tools.getParamValue("Class") );
tools.appendString("');");
	if (when_2("NoSmartPrompt", "-1")) {
tools.appendString("objSmartPrompt.doOnFocus(this, event)");
	}
tools.appendString("\"\n\t\t");

			String cssClass = "";
      String strValue = tools.getParamValue("NoSmartPrompt");
      strValue = StringUtils.crossScriptingFilter(strValue);
			cssClass += strValue!= "-1" ? "InputIntellisenseStyle" : "";
			cssClass += " "+tools.getSaveValue("styleClass");
		
tools.appendString("\n\t\tVALUE = \"");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value", "normal")) {
	return;
}
tools.appendString("\"\n\t\tCLASS=\"");
out.print(cssClass );
tools.appendString("\"\n\n\t\tISNS_BASECLASS=\"PrimaryPageClass\"\n\t\t");
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
tools.appendString("\n\t\t");
	if (when_2("NoSmartPrompt", "-1")) {
tools.appendString("\t\n\t\t\tISNS_ONCHANGE = \"onChangeHandler_OverLabel\"\n\t\t");
	}
tools.appendString("\n\t\t\n\t\t");
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
choose_21();
tools.appendString("\n\t\t\n\n\t\t");
choose_22();
tools.appendString("\n\t\t\n\t\t\n\t\t");
	if (when_3("DisableInputBox", "-1")) {
tools.appendString("\n                   \tdisabled\n                   ");
	}
tools.appendString("\n\n\t\t");
	if (when_4(".pyDisabled", "true")) {
tools.appendString("\n                   \tdisabled\n                   ");
	}
tools.appendString("\n                  \t\t\n\t\tISNS_POPUPTYPE=\"DIV\"\n\t\tisBaseClassSet = \"false\"\n\t\tAUTOCOMPLETE=\"off\" \n\t>\n    <input type=\"hidden\" name=\"PrimaryPageClass\" id=\"PrimaryPageClass\" value=\"\">\n</td>\n\t");
	if (when_2("NoOpenRule", "-1")) {
tools.appendString("\n\t<td style=\"font-size: 2pt;\">&nbsp;</td>\n\t<td nowrap style=\"width: 25px;\">\n\t\t<BUTTON type=\"button\" ONCLICK=\"setSectionClassForPageListPropertyOpen('");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("'); oPega_openRuleManager.pega_openRuleSP('");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("',event); return false;\">\n\t<SPAN class=\"iconOpenRule\" ONMOUSEOVER=\"this.className='iconOpenRule_on'\"  \n\tONMOUSEOUT=\"this.className='iconOpenRule'\"></SPAN>\n\t</BUTTON></td>\n\t");
	}
tools.appendString("\n\t");
	if (pega.isPreviewMode() || tools.getParameterPage().getParameterValue("RuleParameters")!= null) {
tools.appendString("\n<!-- Params button, will be displayed when using GETPARAMS Html Property  -->\n\t<td>\n         <BUTTON id=\"ParamsButton\" title=\"Configure\"  style=\"CURSOR: hand\"\nonclick=\"getRuleParams(event,'");

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
tools.appendString("\"\npageName=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(pageName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(pageName)")) {
	return;
}
tools.appendString("\"\n>\n\n    \t\t<SPAN class='buttonLeft'></SPAN>\n    \t\t<SPAN class='buttonMiddle'>\n    \t\t\t<SPAN class='buttonText'\">Configure</SPAN>\n    \t\t</SPAN>\n    \t\t<SPAN class='buttonRight'></SPAN>\n\t</BUTTON></td>    \n\t");
	}
tools.appendString("\n\t</tr></table>\n\n");
	if (when_5()) {
tools.appendString("\n");
	}
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Deprecated");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY OPENRULEADVANCED_OVERLABEL #20230618T003133.049 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "OpenRuleAdvanced_OverLabel");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT", "Messages", "Pega-UIDesign", "08-01-01", "20180713T133634.985 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT", "RMAction_Variables", "Pega-WB", "08-01-01", "20180713T131549.076 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY OPENRULEADVANCED_OVERLABEL #20230618T003133.049 GMT", "OpenRuleAdvanced_OverLabel", "Pega-Desktop", "08-23-01", "20230618T003133.049 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT", "SmartPrompt", "Pega-UIEngine", "08-05-01", "20200403T114021.492 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT", "SmartPromptWithOpenRuleInclude", "Pega-WB", "08-01-01", "20180713T131549.303 GMT");
}
