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
 * Builds JSP stream OPENRULEADVANCED.
 */
public class ra_stream_openruleadvanced_b9000af532618ce771d82a9b6c1de617 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.openruleadvanced.Stream");
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
	public ra_stream_openruleadvanced_b9000af532618ce771d82a9b6c1de617(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "696d9376b3ba76f79eede4be4635ec67ac872350";
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
/* Instance RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT	Pega-Desktop:08-23-02	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_7();

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
/* end RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT */
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
	"Rule-File-Text:WEBWB!PXOPENRULEADVANCED!JS", 
	"Rule-File-Text:WEBWB!PEGA_UI_OPENRULE!JS", 
	"Rule-File-Text:WEBWB!PEGA_RULEFORM_RMACTION!JS", 
	"Rule-File-Text:WEBWB!ISNSSMARTPROMPTZEUS!JS", 
	"Rule-File-Text:WEBWB!ISNSSMARTPROMPTCORE!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-File-Bundle:SMARTPROMPT!SCRIPT", 
	"Rule-File-Bundle:PXOPENRULE!SCRIPT", 
	"Rule-HTML-Fragment:SMARTPROMPTWITHOPENRULEINCLUDE", 
	"Rule-HTML-Fragment:RMACTION_VARIABLES", 
	"Rule-HTML-Fragment:PZACTIONSETATTRIBUTES", 
	"Rule-HTML-Fragment:SMARTPROMPT", 
	"Rule-Obj-Property:PXREQURI", 
	"Rule-Obj-Property:PXTHREADNAME", 
	"Rule-HTML-Property:OPENRULEADVANCED", 
	"Rule-HTML-Property:MESSAGES", 
	"Rule-HTML-Property:CLIENTVALIDATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("WEBWB!PEGA_UI_SMARTPROMPTONFOCUS!JS","Rule-File-Text","",false,"","Pega-UIDesign","","RULE-FILE-TEXT WEBWB PEGA_UI_SMARTPROMPTONFOCUS!JS #20180713T133619.669 GMT","WEBWB!PEGA_UI_SMARTPROMPTONFOCUS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_UI_WUTILS!JS","Rule-File-Text","",false,"","Pega-WB","","RULE-FILE-TEXT WEBWB PEGA_UI_WUTILS!JS #20180713T131539.879 GMT","WEBWB!PEGA_UI_WUTILS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PXOPENRULEADVANCED!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PXOPENRULEADVANCED!JS #20200901T092404.264 GMT","WEBWB!PXOPENRULEADVANCED!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_UI_OPENRULE!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PEGA_UI_OPENRULE!JS #20201217T121412.225 GMT","WEBWB!PEGA_UI_OPENRULE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_RULEFORM_RMACTION!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB PEGA_RULEFORM_RMACTION!JS #20180713T135106.479 GMT","WEBWB!PEGA_RULEFORM_RMACTION!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!ISNSSMARTPROMPTZEUS!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB ISNSSMARTPROMPTZEUS!JS #20190912T062232.821 GMT","WEBWB!ISNSSMARTPROMPTZEUS!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!ISNSSMARTPROMPTCORE!JS","Rule-File-Text","",false,"","Pega-Desktop","","RULE-FILE-TEXT WEBWB ISNSSMARTPROMPTCORE!JS #20190226T135044.839 GMT","WEBWB!ISNSSMARTPROMPTCORE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("SMARTPROMPT!SCRIPT","Rule-File-Bundle","",false,"","Pega-WB","","RULE-FILE-BUNDLE SMARTPROMPT SCRIPT #20180713T131524.483 GMT","SMARTPROMPT!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PXOPENRULE!SCRIPT","Rule-File-Bundle","",false,"","Pega-Desktop","","RULE-FILE-BUNDLE PXOPENRULE SCRIPT #20180713T135105.133 GMT","PXOPENRULE!SCRIPT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("SMARTPROMPTWITHOPENRULEINCLUDE","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT","SMARTPROMPTWITHOPENRULEINCLUDE",true,false,"ABSOLUTE_CLASSLESS",-344924644), 
		new DependentRuleInfo("RMACTION_VARIABLES","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT RMACTION_VARIABLES #20180713T131549.076 GMT","RMACTION_VARIABLES",true,false,"ABSOLUTE_CLASSLESS",804686993), 
		new DependentRuleInfo("PZACTIONSETATTRIBUTES","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-01-01","RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT","PZACTIONSETATTRIBUTES",true,false,"ABSOLUTE_CLASSLESS",791254997), 
		new DependentRuleInfo("SMARTPROMPT","Rule-HTML-Fragment","",false,"","Pega-UIEngine","08-05-01","RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT","SMARTPROMPT",true,false,"ABSOLUTE_CLASSLESS",23632326), 
		new DependentRuleInfo("PXREQURI","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXREQURI #20180713T131215.530 GMT","!PXREQURI",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PXTHREADNAME","Rule-Obj-Property","CODE-PEGA-THREAD",true,"Code-Pega-Thread","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY CODE-PEGA-THREAD PXTHREADNAME #20180713T131215.557 GMT","!PXTHREADNAME",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("OPENRULEADVANCED","Rule-HTML-Property","",false,"","Pega-Desktop","08-23-02","RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT","OPENRULEADVANCED",true,false,"ABSOLUTE_CLASSLESS",74845631), 
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
//	RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT:20230925T083901.516 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-BUNDLE PXOPENRULE SCRIPT #20180713T135105.133 GMT:20180713T135105.133 GMT
//	RULE-FILE-TEXT WEBWB PXOPENRULEADVANCED!JS #20200901T092404.264 GMT:20201021T161322.155 GMT
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
//	RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT:20180713T133243.581 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "46b4e27016d45c12dfdb5b685096319c";
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
private void choose_23() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n\t\t\t");
if (!foundChoice && when_4("isDeclarePageAndPropertyPrompt", "true")) {
tools.appendString("\n\t\t\t\tONKEYUP=\"handlePropAndPagePrompting()\" \n                          ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n\t\t\t\t\t\t  ");
if (!foundChoice) {
tools.appendString("\n\t\t\t\t\t\t  ONKEYUP=\"handlePropAndRulePrompting(this, event)\";\n\t\t\t\t\t\t  ");
}
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
private boolean when_4(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
private boolean when_3(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || ((areValsEqual(tools.getParamValue(aParam1), aParam2)) && (areValsEqual(tools.getParamValue(aParam3), aParam4))));
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
private void performStream_6() throws Throwable {
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_5();

}
private static final Map oPropDefinitions_7 = null;
private static final Map oStreamProperties_7 = new HashMap();
static {
	oStreamProperties_7.put("pyRuleAvailable", "Final");
	oStreamProperties_7.put("pyCircumstanceDateProp", "");
	oStreamProperties_7.put("pyCircumstanceVal", "");
	oStreamProperties_7.put("pyMethodStatus", "Internal");
	oStreamProperties_7.put("pyClassName", "");
	oStreamProperties_7.put("pyCircumstanceProp", "");
	oStreamProperties_7.put("pzInsKey", "RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT");
	oStreamProperties_7.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_7.put("pyCircumstanceDate", "");
	oStreamProperties_7.put("pyRuleEnds", "");
	oStreamProperties_7.put("pyRuleStarts", "");
	oStreamProperties_7.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_7.put("pyXMLType", "");
	oStreamProperties_7.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_7.put("pyCorrType", "");
	oStreamProperties_7.put("pyStreamName", "pzActionSetAttributes");
	oStreamProperties_7.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT
 */
private void include_6() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT	Pega-UIEngine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT
 * Set up context.
 */
final String prevRuleKey_7 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT";final String prevClass_7 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_7 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_7);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_7);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_6)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_6();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_7);
	mStreamResponse.setJspBaseClass(prevClass_7);
	pz_CurrentRuleKey = prevRuleKey_7;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_6,true);
}
/* end RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
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
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");
out.print(mode1);
tools.appendString(" ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7) {
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
	boolean foundChoice_8 = false;
tools.appendString(" ");
if (!foundChoice_8 && (pega.isPreviewMode() || isValidation == true)) {
tools.appendString("  ");
tools.putSaveValue("bAddedValidationType", "false");
tools.appendString(" ");
	boolean foundChoice_9 = false;
tools.appendString(" ");
if (!foundChoice_9 && (pega.isPreviewMode() || (areValsEqual(lookupThisDefinition(tools, "pyOnInput"), "")))) {
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

foundChoice_9 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_9) {
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

foundChoice_8 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_8) {
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
 * Generates stream property_Embed_Desktop_ValueList_AccessGroups_ClientValidation
 */
private void property_Embed_Desktop_ValueList_AccessGroups_ClientValidation() {
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
property_Embed_Desktop_ValueList_AccessGroups_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
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
	boolean foundChoice_5 = false;
tools.appendString(" ");
if (!foundChoice_5 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "");
tools.appendString(" ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "inputErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "inputError");
tools.appendString(" ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5) {
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
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" <b style=\"font-family: wingdings;color:red;cursor:hand\">x</b> ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_6 = !pega.isPreviewMode();
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
 * Generates stream property_Embed_Desktop_ValueList_AccessGroups_Messages
 */
private void property_Embed_Desktop_ValueList_AccessGroups_Messages() {
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
property_Embed_Desktop_ValueList_AccessGroups_Messages();
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
private void choose_18() throws Throwable {
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
private void choose_17() throws Throwable {
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
private void choose_16() throws Throwable {
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
private void choose_15() throws Throwable {
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
private void choose_14() throws Throwable {
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
private void choose_13() throws Throwable {
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
private void choose_12() throws Throwable {
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
private void choose_11() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n    ");
if (!foundChoice && when_2("ID", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("ID", "param.ID", IAutoStreamRuntime.SAVE_SET);
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
if (!foundChoice && when_2("Size", "")) {
tools.appendString("\n        ");
pzAuto.putSaveRef("Size", "param.Size", IAutoStreamRuntime.SAVE_SET);
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
private static final String[] showMeParams_3 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Final", "", "Pega-WB", "08-01-01", "", "SmartPromptWithOpenRuleInclude", "", "RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT" };
private static final String[] showMeParams_1 = {
"", "", "", "", "", "", "04-02", "API", "Rule-HTML-Fragment", "Final", "", "Pega-UIEngine", "08-05-01", "", "SmartPrompt", "", "RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT" };
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
tools.appendString("\n\t ");
	IStaticContentRuntime pzStatic__4 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__4.addBundle("smartprompt", "1863241345");
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
if (_jspx_meth_pega_static__2(pageContext, "script", "webwb")) {
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
 */private boolean _jspx_meth_pega_static__3(PageContext aPageContext, java.lang.String aApp, java.lang.String aType) throws Throwable {
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
	IStaticContentRuntime pzStatic__6 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__6.addFile("pega_ui_smartpromptonfocus", "13155984262", "js");
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__8 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__8.addFile("pega_ui_openrule", "12604479638", "js");
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__10 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__10.addFile("pega_ui_wutils", "13323188170", "js");
tools.appendString("\n    ");
	IStaticContentRuntime pzStatic__12 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__12.addFile("pega_ruleform_rmaction", "11183668284", "js");
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
if (_jspx_meth_pega_static__3(pageContext, "webwb", "script")) {
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
tools.appendString("\n\t\t");
	IStaticContentRuntime pzStatic__2 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__2.addBundle("pxopenrule", "1224330301");
tools.appendString("\n\t");
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
 * OnlyOnce condition: OpenRuleAdvanced
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("OpenRuleAdvanced")) {
tools.appendString("\n\t");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb")) {
	return;
}
tools.appendString("\n");
}
}
private void performStream_7() throws Throwable {

//US-393053: Fixing BAC issues in a generic way in this control when a custom query is passed to the control.

//Fetch the custom query and encrypt only the activity name parameter that is being passed with Custom query
String cQuery= tools.getParameterPage().getString("CustomQuery");

//encrypt only the non-empty parameter which has pyActivity passed.
if(cQuery!=null && cQuery!="" && cQuery.contains("pyActivity")) {

  //fetch the string that is before pyActivity to a variable.
  String cQuery_start = cQuery.substring(0,cQuery.indexOf("pyActivity"));
  int lengthOfCqueryStart = cQuery_start.length();

  //Fetch the string from pyActivity to end of cQuery into a variable.
  String cQuery1 = cQuery.substring(lengthOfCqueryStart,cQuery.length());
  String cQuery_encrypt = "";
  String cQuery_end = "";

  // if custom query has parameters appended after activity name or ends with '&'
  if(cQuery1.contains("&")){
    //fetch the string that is after &
    cQuery_end = cQuery1.substring(cQuery1.indexOf("&"),cQuery1.length());

    //fetch the main part of the parameter to encrypt i.e., pyActivity name.
    cQuery_encrypt = cQuery1.substring(0,cQuery1.indexOf("&"));
  }
  //if the custom query parameter is not ending with '&' or if there is no value after activity name...
  else{
    cQuery_end = "";
    cQuery_encrypt = cQuery1;
  }
  
  //Encrypt the activity name and append it back to custom query parameter.
  String cQuery_Encrypted=  pega_rules_utilities.pzEncryptURLActionString(tools, "Thread",cQuery_encrypt);
  tools.getParameterPage().putString("CustomQuery",cQuery_start+cQuery_Encrypted+cQuery_end); 
}


tools.appendString("\n");
onlyOnce_1();
tools.appendString("\n\n\n");

	String pAttributes = tools.getParamValue("pega_attributes");

	String parentLayoutVal = tools.getSaveValue("parentLayouttype");

    String isGrird = tools.getSaveValue("isGrid");
    if(!isGrird.equals("true")){
      tools.putSaveValue("parentLayoutVal",parentLayoutVal);
    }
    else{
      tools.putSaveValue("parentLayoutVal",""); 
    }

	if (pAttributes.indexOf("ONBLUR") > -1)
		pAttributes = pAttributes.replaceAll("ONBLUR", "ONBLUR_CUSTOM");
	if (pAttributes.indexOf("ONCHANGE") > -1)
		pAttributes = pAttributes.replaceAll("ONCHANGE", "ONCHANGE_CUSTOM");
	tools.putParamValue("pega_attributes", pAttributes);
	String textBoxToolTip = tools.getParamValue("TextBoxTooltip");
	tools.putParamValue("TextBoxTooltip", tools.getLocalizedTextForString("pyToolTip",textBoxToolTip));
	
	String OpenRuleTooltip = tools.getParamValue("OpenRuleTooltip");
	tools.putParamValue("OpenRuleTooltip", tools.getLocalizedTextForString("pyToolTip",OpenRuleTooltip));
	

          if("Rule-Declare-Pages/Rule-Obj-Property".equals(tools.getParamValue("Class"))){
		tools.putParamValue("Class","Rule-Obj-Property");
		tools.putParamValue("isDeclarePageAndPropertyPrompt","true"); 
	}else{
		tools.putParamValue("isDeclarePageAndPropertyPrompt","false");
	}

tools.appendString("\n\n<script type=\"text/javascript\">\nvar CONTROL_NOT_VISIBLE_IN_DDPROXY=true;\nvar sBUILDINGLIST='");
out.print(tools.getLocalizedTextForString("pyCaption","Building List ..."));
tools.appendString("';\nvar sMORE='");
out.print(tools.getLocalizedTextForString("pyCaption","More.."));
tools.appendString("';\n</script>\n\n\n\n");
	boolean foundChoice_1 = false;
tools.appendString("\n");
if (!foundChoice_1 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString("\n\n");
	if (when_1("prepareForDataGrid", "true")) {
tools.appendString("\n<script>\n\n\nfunction OpenRuleAdvanced_getValue(){\n\tvar fieldName=\"");

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
tools.appendString("');\n            classChanged = true;\n\t\t}else if(field.value.indexOf(\".\") == -1 && field.getAttribute(\"ISNS_CLASS\") != \"Rule-Declare-Pages\"){\n\t\t    field.setAttribute(\"ISNS_CLASS\", \"Rule-Declare-Pages\");\n            field.setAttribute(\"ISNS_PROPAUTOPROMPT\", \"NO\");\n            field.setAttribute(\"ISNS_FIELDTYPE\", \"RULEKEY\");\n\t\t\tfield.setAttribute(\"ISNS_BASECLASS\", \"\");\n\t\t    classChanged = true;\n\t\t}     \n\t\tif(classChanged)               \n\t\t\tobjSmartPrompt.doOnFocus(null, event);\n\t\tif(event.keyCode == 190 ) {\n\t\t\tISnsInputKeyUpCommon(40,field,true);\t\t\n\t\t}\n\t\t\n\t\t \n\t}\n  ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString("\n\n\nfunction fireEventOnField(eventName,fieldObj){\n\t\tif(!fieldObj) return;\n\t\tif(fieldObj.dispatchEvent){\n\t\t\tvar customevent = document.createEvent(\"HTMLEvents\");\n\t\t\tcustomevent.isnsType = true;\n\t\t\tcustomevent.initEvent(eventName,true,false);\n\t\t\tfieldObj.dispatchEvent(customevent);\n\t\t}else if(fieldObj.fireEvent){\n\t\t\tfieldObj.fireEvent(\"on\"+eventName);\n\t\t}\n}\nfunction setSmartPromptClassFieldValue(value){\n    var smartPromptClassField=document.querySelector('input[name$=\"pySmartPromptClass\"]');\n    if(smartPromptClassField){\n\t\t\tsmartPromptClassField.value=value;\n\t\t\tfireEventOnField(\"click\",smartPromptClassField);\n\t\t\t}\n}\n\nvar tempObj;\nif((tempObj=document.getElementById(\"pyRangeFiltering\"))){\n\tif(tempObj.value.indexOf(\"pyCustomerID\")!=-1){\n\t\ttempObj.value=\"\";\n\t}\n}\n\n");

	// Detect if grid or repeat dynamic layout property panel before including custom JS
  String cpBodyType = tools.getStepPage().getString("pyBodyType");
  String cpRepeatDirection = tools.getStepPage().getString("pyRepeatDirection");
  if(cpBodyType.equals("REPEATING")  && (cpRepeatDirection.equals("TreeGrid") || cpRepeatDirection.equals("RepeatGrid") ||  cpRepeatDirection.equals("Tree")) // Grid property panel check
		|| cpBodyType.equals("SIMPLELAYOUT") && cpRepeatDirection.equals("DYNAMIC")) // RDL property panel check
	{

tools.appendString("\n/*Grid related JS code (will be executed only once)*/\nif(!document.getElementById(\"grid_openRuleAdvanced_jsLoaded\")){\n    /* BUG-211425: Moving the declaration of these variables in the scope, \n     * keeping them lying around is affecting other layout property panels \n     * (specially isGridPropertyPanel was being set to true once and forever) */\n  \tvar isGridPropertyPanel = false,isRDLPropertyPanel = false;\n\n\t\n\tvar gridlRuleSet=\"\";\n\tvar gridlRuleSetVersion=\"\";\n\tvar gridsectionClassName=\"\";\n\tvar gridrowPageClassName=\"\";\n\tif(document.querySelector(\"[node_name='pzGrid_PropPanel']\")){\n\t\tisGridPropertyPanel=true;\n\t}else if(document.querySelector(\"[node_name='pzPropertyPanel_RepeatingDynamicLayoutFormat']\")){\n    isRDLPropertyPanel = true;\n  }\n  \n\tif(isGridPropertyPanel || isRDLPropertyPanel){\n\t\n\t\t/*START: reading info from pagesAndClassesTab*/\n\t\tvar inputList=document.getElementsByTagName(\"input\");\n\t\tvar pagesList=[];\n\t\tvar classesList=[];\n\t\tfor(var i=0;i<inputList.length;i++){\n\t\t\tif(inputList[i].id==\"pyPagesAndClassesPage\"){\n\t\t\t\tpagesList.push(inputList[i].value);\n\t\t\t}else if(inputList[i].id==\"pyPagesAndClassesClass\"){\n\t\t\t\tclassesList.push(inputList[i].value);\n\t\t\t}\n\t\t}\n\t\t/*END: reading info from pagesAndClassesTab*/\n\t\t\n\t\t/*reading PRXML from section xml for getting info about PagesAndClasses and Section Parameters*/\n\t\tif(document.getElementById(\"PRXML\")){\n\t\t\tvar txt=document.getElementById(\"PRXML\").value;\n\t\t\ttxt=txt.replace(/\\n[ ]*/g, \"\");\n\t\t\tif(txt.trim){\n\t\t\t\ttxt=txt.trim();\n\t\t\t}\n\t\t\tvar cache_prxml=window.cachedPRXML;\n\t\t\tif(!cache_prxml){cache_prxml=\"\";}\n\t\t\tcache_prxml=cache_prxml.replace(/\\n[ ]*/g, \"\");\n\t\t\tif(cache_prxml.trim){\n\t\t\t\tcache_prxml=cache_prxml.trim();\n\t\t\t}\n\t\t\tvar xmlDoc=pega.tools.XMLDocument.get();\n\t\t\txmlDoc.async= false;\n\t\t\txmlDoc.loadXML(txt); \n\t\t\tvar xmlDocCache=pega.tools.XMLDocument.get();\n\t\t\txmlDocCache.async= false;\n\t\t\txmlDocCache.loadXML(cache_prxml); \n\t\t\ttry{\n\t\t\t\tgridsectionClassName=xmlDoc.getElementsByTagName(\"pyClassName\")[0].text;\n\t\t\t}catch(sectionClassNotFoundError){\n\t\t\t\ttry{\n\t\t\t\t\tgridsectionClassName=xmlDocCache.getElementsByTagName(\"pyClassName\")[0].text;\n\t\t\t\t}catch(promptClassNotFoundError){\n\t\t\t\t\ttry{gridsectionClassName=xmlDoc.getElementsByTagName(\"pyPromptClass\")[0].text;}catch(err){}\n\t\t\t\t}\n\t\t\t}\n\t\t\tsetTimeout(function(){\n        setSmartPromptClassFieldValue(gridsectionClassName);\n\t\t\t},1250);\n\t\t\ttry{\n\t\t\t\tgridlRuleSet=xmlDoc.getElementsByTagName(\"pxInstanceLockedRuleSet\")[0].text;\n\t\t\t}catch(err){\n\t\t\t\ttry{gridlRuleSet=xmlDocCache.getElementsByTagName(\"pxInstanceLockedRuleSet\")[0].text;}catch(err1){}\n\t\t\t}\n\t\t\ttry{\n\t\t\t\tgridlRuleSetVersion=xmlDoc.getElementsByTagName(\"pxInstanceLockedRuleSetVersion\")[0].text;\n\t\t\t}catch(err){\n\t\t\t\ttry{gridlRuleSetVersion=xmlDocCache.getElementsByTagName(\"pxInstanceLockedRuleSetVersion\")[0].text;}catch(err2){}\n\t\t\t}\n\t\t\tvar pagesAndClasses;\n\t\t\ttry{\n\t\t\t\tpagesAndClasses=xmlDoc.getElementsByTagName(\"pyPagesAndClasses\")[0];\n\t\t\t\tif(!pagesAndClasses){\n\t\t\t\t\tpagesAndClasses=xmlDocCache.getElementsByTagName(\"pyPagesAndClasses\")[0];\n\t\t\t\t}\n\t\t\t}catch(err){\n\t\t\t}\n\t\t\tvar sectionparameters;\n\t\t\ttry{\n\t\t\t\tsectionparameters=xmlDoc.getElementsByTagName(\"pyParameters\")[0];\n\t\t\t\tif(!sectionparameters){\n\t\t\t\t\tsectionparameters=xmlDocCache.getElementsByTagName(\"pyParameters\")[0];\n\t\t\t\t}\n\t\t\t}catch(err){\n\t\t\t}\n\t\t\tif(pagesAndClasses){\n\t\t\tvar allpages=pagesAndClasses.getElementsByTagName(\"pyPagesAndClassesPage\");\n\t\t\tvar allclasses=pagesAndClasses.getElementsByTagName(\"pyPagesAndClassesClass\");\n\t\t\t}\n\t\t\ttry{\n\t\t\t\t/*storing the xml version as text for consumption in pzExpressionBuilderGadget*/\n\t\t\t\tvar gridsectionparameters_txt=sectionparameters.xml;\n\t\t\t}catch(err){\n\t\t\t\tvar gridsectionparameters_txt=\"\";\n\t\t\t}\n\t\t\ttry{\n\t\t\t\t/*storing the xml version as text for consumption in pzExpressionBuilderGadget*/\n\t\t\t\tvar gridsectionpagesandclasses_txt=pagesAndClasses.xml;\n\t\t\t}catch(err){\n\t\t\t\tvar gridsectionpagesandclasses_txt=\"\";\n\t\t\t}\n\t\t} else {\n            /* BUG-208664: PRXML is not present in case of runtime property panel. In case of \n             * runtime, when the property panel opens, the section is run on primary page\n             * pyTemp_PropPanelPage.pySections(1).pySectionBody(1)\n             * Getting the section class from pySmartPromptClass property on \n             * pyTemp_PropPanelPage.pySections(1) page\n             */\n            gridsectionClassName = '");
out.print(tools.getPrimaryPage().getParentPage().getString("pySmartPromptClass"));
tools.appendString("';\n        }\n\t\t\n    var sourceTypeField=document.querySelector('select[name$=\"pySourceType\"]');\n\t\tif(sourceTypeField){\n\t\t\t/*Tried using \"Run Script\", but it did not work, so manually registering the change listener*/\n\t\t\tpega.util.Event.addListener(sourceTypeField,\"change\", setFocusOnDSField);\n\t\t\tvar sourceFieldValue=sourceTypeField[sourceTypeField.selectedIndex].value;\n\t\t\tif(sourceFieldValue==\"Property\"){\n\t\t\t\t/*emptying the pyPageListProperty field on UI when the value is .pyTemplatePageList -> when dropping a new grid */\n\t\t\t\tif(document.getElementById(\"pyPageListProperty\") && document.getElementById(\"pyPageListProperty\").value.indexOf(\"pyTemplatePagelist\")!=-1){\n\t\t\t\t\tdocument.getElementById(\"pyPageListProperty\").value=\"\";\n\t\t\t\t}\n        var pageListPropertyClassField=document.querySelector('[name$=\"pyPageListPropertyClass\"]');\n\t\t\t\t/*Updating the rowpageclass variable*/\n\t\t\t\tif(pageListPropertyClassField){\n\t\t\t\t\tgridrowPageClassName=pageListPropertyClassField.value;\n          var smartPromptClassField=document.querySelector('[name$=\"pySmartPromptClass\"]');\n\t\t\t\t\tif(smartPromptClassField){smartPromptClassField.value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t}else if(sourceFieldValue==\"Report Definition\"){\n\t\t\t\t/*Update gridrowclass variable*/\n\t\t\t\tif(document.getElementById(\"pyRDAppliesTo\")){\n\t\t\t\t\tgridrowPageClassName=document.getElementById(\"pyRDAppliesTo\").value;\n\t\t\t\t\tvar smartPromptClassField=document.querySelector('[name$=\"pySmartPromptClass\"]');\n\t\t\t\t\tif(smartPromptClassField){smartPromptClassField.value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t\t/*Wait for DOM to be ready after Refresh Section happens.*/\n\t\t\t\t/*setTimeout(function(){setRDPageDefaults();},1000);*/\n\t\t\t}else if(sourceFieldValue==\"Data Object\"){\n\t\t\t\t/*Update rowpageclass*/\n        var dpResultsClassField=document.getElementById(\"pyDPResultsClass\");\n\t\t\t\tif(dpResultsClassField){\n\t\t\t\t\tgridrowPageClassName=dpResultsClassField.value;\n\t\t\t\t\tvar smartPromptClassField=document.querySelector('[name$=\"pySmartPromptClass\"]');\n\t\t\t\t\tif(smartPromptClassField){smartPromptClassField.value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t\tvar pageListPropertyClassField=document.querySelector('[name$=\"pyPageListPropertyClass\"]');\n\t\t\t\tif(pageListPropertyClassField){\n\t\t\t\t\tgridrowPageClassName=pageListPropertyClassField.value;\n\t\t\t\t\tvar smartPromptClassField=document.querySelector('[name$=\"pySmartPromptClass\"]');\n\t\t\t\t\tif(smartPromptClassField){smartPromptClassField.value=gridrowPageClassName;}\n\t\t\t\t}\n\t\t\t}\n\t\t\t/*updating the \"PrevValue\" with current selection.*/\n\t\t\tsourceTypeField.setAttribute(\"PrevValue\",sourceFieldValue);\n\t\t}\n\t\t/*creating a hidden DOM element to ensure that code is executed only once.*/\n\t\tvar jsLoadedIndicator=document.createElement(\"div\");\n\t\tjsLoadedIndicator.id=\"grid_openRuleAdvanced_jsLoaded\";\n\t\tjsLoadedIndicator.style.display=\"none\";\n\t\tsourceTypeField.parentNode.appendChild(jsLoadedIndicator);\n\t}\n}\n\nvar gridFieldPromptingMappings={\n\"pyActivity\":\"CUSTOMHANDLING\" /*BUG-120548*/,\n\"pyProperty\":\"ROWCLASS\",\n\"pyDataSource\":\"ROWCLASS\" /*DISPLAY->MENU*/,\n\"pyRowRefreshIndex\":\"ROWCLASS\",\n\"pyActivityClass\":\"ROWCLASS\",\n\"pySelectedFlowAction\":\"ROWCLASS\" /*PROCESS WORK->PERFORM ACTION*/,\n\"pyLocalAction\":\"CUSTOMHANDLING\" /*BUG-120596 Launch -> Local Action -> with / without using page */,\n\"pyWindowName\":\"ROWCLASS\",\n\"pyValue\":\"ROWCLASS\",\n\"pyClipboardPage\":\"ROWCLASS\",\n\"pyWhen\":\"ROWCLASS\",\n\"pyElementName\":\"ROWCLASS\",\n\"pyName\":\"CUSTOMHANDLING\" /*BUG-120599, BUG-120548*/,\n\"pyCategoryHeaderTemplate\":\"ROWCLASS\",\n\"pyInsName\":\"ROWCLASS\" /*BUG-120538*/,\n\"pyInsKey\":\"ROWCLASS\" /*BUG-120524*/,\n\"pySelectedFlow\":\"CUSTOMHANDLING\" /*BUG-120590*/,\n\"pyHarnessName\":\"CUSTOMHANDLING\" /*BUG-120593*/,\n\"pyKey\":\"ROWCLASS\" /*BUG-120524*/,\n\"pyItemId\":\"ROWCLASS\" /*BUG-120524*/\n};\n\nif(!gridFieldPromptingMappings.checkAndUpdatePrompting){\n\tgridFieldPromptingMappings.checkAndUpdatePrompting=function(fieldObj){\n\t\tif(!document.querySelector(\"[node_name='pzGrid_PropPanel']\")){\n\t\t\treturn; /*This API is intended only for Repeating Grids, Tree, TreeGrids hence returning from here in other cases. Please do not alter this logic.*/\n\t\t}\n\t\tif(!fieldObj){return;}\n\t\tif(this[fieldObj.id]==\"ROWCLASS\"){\n\t\t\tif(fieldObj.getAttribute(\"ISNS_BASECLASS\")){\n\t\t\t\tvar promptFields=document.getElementsByName(fieldObj.getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t\t}\n        setSmartPromptClassFieldValue(gridrowPageClassName);\n\t\t\t}\n\t\t}else if(this[fieldObj.id]==\"CUSTOMHANDLING\"){\n\t\t\ttry{\n\t\t\t\tGridPropertyPanelActionMappings[\"handle_\"+fieldObj.id]();\n\t\t\t\t/*Function(\"GridPropertyPanelActionMappings.handle_\"+fieldObj.id+\"();\")();*/\n\t\t\t}catch(err){\n\t\t\t\tif(window.console && window.console.log){window.console.log(\"Error: \"+err);}\n\t\t\t}\n\t\t}\n\t};\n}\n\nwindow.GridPropertyPanelActionMappings={\n\thandle_pyHarnessName:function(){ /*BUG-120593*/ /*Please don't change function name / signature*/\n\tvar tmp;\n\t\tif((tmp=document.getElementById(\"pyActivityClass\")) && tmp.value==\"\"){\n\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pyHarnessName\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t}\n\t\t\tsetSmartPromptClassFieldValue(gridrowPageClassName);\n\t\t}\n\t},\n\thandle_pySelectedFlow:function(){ /*BUG-120590*/ /*Please don't change function name / signature*/\n\t\tif(document.getElementById(\"pyUsingPage\") && document.getElementById(\"pyUsingPage\").value!=\"\"){\n\t\t\tvar pySelectedFlowPromptClass=\"\";\n\t\t\tif(pagesList.length>0 && classesList.length>0){\n\t\t\t\tfor(var q=0;q<pagesList.length;q++){\n\t\t\t\t\tif(pagesList[q]==document.getElementById(\"pyUsingPage\").value){\n\t\t\t\t\t\tpySelectedFlowPromptClass=classesList[q];\n\t\t\t\t\t}\n\t\t\t\t}\n\t\t\t}\n\t\t\tif(pySelectedFlowPromptClass!=\"\"){\n\t\t\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pySelectedFlow\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\t\t\tpromptFields[i].value=pySelectedFlowPromptClass;\n\t\t\t\t\t}\n          setSmartPromptClassFieldValue(pySelectedFlowPromptClass);\n\t\t\t\t\t\n\t\t\t}\n\t\t}else if(document.getElementById(\"pyUsingPage\") && document.getElementById(\"pyUsingPage\").value==\"\"){\n\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pySelectedFlow\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t}\n      setSmartPromptClassFieldValue(gridrowPageClassName);\t\n\t\t}\n\t},\n\thandle_pyActivity:function(){ /*Please don't change function name / signature*/\n\t\tif(document.getElementById(\"pyTarget\") && document.getElementById(\"pyTarget\")[document.getElementById(\"pyTarget\").selectedIndex].value==\"otherSection\"){\n\t\t\tthis.handleOtherSectionScenarioForDisplay_RefreshAction();\n\t\t}else{\n\t\t\tvar activityPromptFields=document.getElementsByName(document.getElementById(\"pyActivity\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\tfor(var i=0;i<activityPromptFields.length;i++){\n\t\t\t\tactivityPromptFields[i].value=gridrowPageClassName;\n\t\t\t}\n\t\t\tsetSmartPromptClassFieldValue(gridrowPageClassName);\t\n\t\t}\n\t},\n\thandle_pyName:function(){ /*Please don't change function name / signature*/\n\t\tif(document.getElementById(\"pyTarget\") && document.getElementById(\"pyTarget\")[document.getElementById(\"pyTarget\").selectedIndex].value==\"otherSection\"){\n\t\t\tthis.handleOtherSectionScenarioForDisplay_RefreshAction();\n\t\t}else{\n\t\t\t/*BUG-120599: For Report Definition nothing has to be done, but only in case of Open URL in Window (Rule-Obj-Model) some logic is required.*/ \n\t\t\t/*BUG-120585: Case of Set Value (Rule-Obj-Property) */\n\t\t\tif(document.getElementById(\"pyName\").getAttribute(\"isns_class\")==\"Rule-Obj-Model\" || document.getElementById(\"pyName\").getAttribute(\"isns_class\")==\"Rule-Obj-Property\"){ /*case of Open URL in Window*/\n\t\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pyName\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t\t}\n\t\t\t\tsetSmartPromptClassFieldValue(gridrowPageClassName);\t\n\t\t\t}\n\t\t}\n\t},\n\thandle_pyLocalAction:function(){ /*BUG-120596: Handling Local Action with & without \"using page\" */ /*Please don't change function name / signature*/\n\t\tif(document.getElementById(\"pyUsingPage\") && document.getElementById(\"pyUsingPage\").value==\"\"){ /*without using page -> prompt from row class*/\n\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pyLocalAction\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\tpromptFields[i].value=gridrowPageClassName;\n\t\t\t}\n\t\t\tsetSmartPromptClassFieldValue(gridrowPageClassName);\t\n\t\t}else if(document.getElementById(\"pyUsingPage\") && document.getElementById(\"pyUsingPage\").value!=\"\"){ /*with using page -> prompt from page class / user entered input class */\n\t\t\tif(!document.getElementById(\"pyClass\") || document.getElementById(\"pyClass\").value==\"\"){\n\t\t\t\treturn;\n\t\t\t}\n\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pyLocalAction\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\tpromptFields[i].value=document.getElementById(\"pyClass\").value;\n\t\t\t}\n      setSmartPromptClassFieldValue(document.getElementById(\"pyClass\").value);\t\n\t\t}\n\t},\n\thandleOtherSectionScenarioForDisplay_RefreshAction:function(){ /*Called from within handle_pyActivity, handle_pyName*/\n\t\tif(!document.getElementById(\"pyTarget\")){\n\t\t\treturn;\n\t\t}\n\t\tvar pyTargetDropDown=document.getElementById(\"pyTarget\");\n\t\tvar selval=pyTargetDropDown[pyTargetDropDown.selectedIndex].value;\n\t\tif(selval==\"otherSection\"){\n\t\t\tif(document.getElementById(\"pyActivityClass\") && document.getElementById(\"pyActivityClass\").value!=\"\"){\n\t\t\t\tvar promptFields=document.getElementsByName(document.getElementById(\"pyName\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\tfor(var i=0;i<promptFields.length;i++){\n\t\t\t\t\tpromptFields[i].value=document.getElementById(\"pyActivityClass\").value;\n\t\t\t\t}\n\t\t\t\tvar activityPromptFields=document.getElementsByName(document.getElementById(\"pyActivity\").getAttribute(\"ISNS_BASECLASS\"));\n\t\t\t\tfor(var i=0;i<activityPromptFields.length;i++){\n\t\t\t\t\tactivityPromptFields[i].value=document.getElementById(\"pyActivityClass\").value;\n\t\t\t\t}\n        setSmartPromptClassFieldValue(document.getElementById(\"pyActivityClass\").value);\n\t\t\t}\n\t\t}\n\t}\n};\n");

}

tools.appendString("\n\nfunction onChangeHandler(elem, event){\n\tvar evt = event || window.event;\n\tvar srcElement = evt.srcElement || evt.target;\n\tif(srcElement === elem){\n\t\tif(!OpenRuleAdvanced_isActive()) { \n\t\t\tif(elem.getAttribute(\"ONCHANGE_CUSTOM\") != null) {\n\t\t\t\teval(elem.getAttribute(\"ONCHANGE_CUSTOM\"));\n\t\t\t}\n\t\t\tif(elem.getAttribute(\"ONBLUR_CUSTOM\") !=null) {\n\t\t\t\teval(elem.getAttribute(\"ONBLUR_CUSTOM\"));\n\t\t\t}\n\t\t}\n      \t// If element has a standard data-change defined - simulate a HTML event to trigger the event infra handlers\n      \tif(elem.getAttribute(\"data-change\") != null) {\n        \tfireEventOnField(\"change\", elem);\n      \t}\n\n\t}\n\telse{\n\t\tpega.util.Event.fireEvent(elem,'onchange');\n\t\tpega.util.Event.fireEvent(elem,'onblur');\n\t}\n}\n</script>\n\n\n");
/* Include stream RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT */
include_3();

tools.appendString("\n\n\n");
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
choose_10();
tools.appendString("\n\n\n");
choose_11();
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
	if (when_2("PlaceholderText", "")) {
tools.appendString("\n\t");
pzAuto.putSaveRef("placeholderText", "param.PlaceholderText", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n");
	}
tools.appendString("\n  \n");
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
  
  String noOpenRule = tools.getParamValue("NoOpenRule");
  if(!("true".equals(noOpenRule) || "-1".equals(noOpenRule))){
    try{
      ClipboardPage actionPage = pega.getUIEngine().getUIActionPage("runActivity");
      actionPage.getPage("pyActionAPI").putString("pyActivity", "@baseclass.pzLoadClassKeysInXML");
      pega.getUIEngine().getUIAction(actionPage).register();
      actionPage.removeFromClipboard();
      //registering Embed-Display-Table-Cell.getInskeyFromXml
      actionPage = pega.getUIEngine().getUIActionPage("runActivity");
      actionPage.getPage("pyActionAPI").putString("pyActivity", "Embed-Display-Table-Cell.getInskeyFromXml");
      pega.getUIEngine().getUIAction(actionPage).register();
      actionPage.removeFromClipboard();
      //registering create work
      actionPage = pega.getUIEngine().getUIActionPage("createWork");
      actionPage.getPage("pyActionAPI").putString("pyClassName", "Work-ProjectManagement-New");
      actionPage.getPage("pyActionAPI").putString("pyFlowName", "NewModalFlow");
      pega.getUIEngine().getUIAction(actionPage).register();
      actionPage.removeFromClipboard();
    }catch(Exception ex) {
      ex.printStackTrace();
    }
  }

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
tools.appendString("\n\n\n");
choose_19();
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
tools.appendString("\n\n\n\n\n\t<table id=\"SL_Table\" cellspacing=0 cellpadding=0\n\t\tstyle='width:");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strExpectedWidth)", "literal")) {
	return;
}
tools.appendString("' >\n\t<tr>\n\t");
	boolean foundChoice_4 = false;
tools.appendString("\n     ");
 
    
    if(!("true".equals(noOpenRule) || "-1".equals(noOpenRule))){
tools.appendString("\n\t\t<td id=\"SL_Input\"\t\n    ");
 } 
tools.appendString("\n\t");
if (!foundChoice_4) {
tools.appendString("\n\t\t<td \n\t");
}
tools.appendString("\n\t\n\t\t\tSTYLE='width:");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(strTDWidth)", "literal")) {
	return;
}
tools.appendString("'>\n\t");
	if (pega.isPreviewMode() || !tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT")) {
tools.appendString("\n\t\t\t");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_4();

tools.appendString("\n\t\t");
	}
tools.appendString("\n\t<INPUT \n\t\t");
	if (when_2("SkipClientValidation", "-1")) {
tools.appendString("\n\t\t\t");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_5();

tools.appendString(" \n\t\t");
	}
tools.appendString("\n\t\t");
/* Include stream RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT */
include_6();

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
tools.appendString("\"\n\n\t\t");
	boolean foundChoice_10 = false;
tools.appendString("\n\t\t");
if (!foundChoice_10 && when_2("ID", "")) {
tools.appendString(" \n\t\t\tID=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ID)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(ID)")) {
	return;
}
tools.appendString("\"\n\t\t");

foundChoice_10 = !pega.isPreviewMode();
}
tools.appendString("\n\t\t");
if (!foundChoice_10) {
tools.appendString("\n\t\tID=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-Definition(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$this-Definition(pyPropertyName)")) {
	return;
}
out.print( StringUtils.crossScriptingFilter(tools.getParamValue("pega_RLindex")) );
tools.appendString("\" \t\t\n\t\t");
}
tools.appendString("\n\t\t\n\t\tTYPE=\"text\" value=\"");

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
	if (when_2("PlaceholderText", "")) {
tools.appendString(" \n\t\t\tPLACEHOLDER='");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(placeholderText)", "NORMAL")) {
	return;
}
tools.appendString("'\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_2("Size", "")) {
tools.appendString("\n\t\t\tSIZE=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(Size)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(Size)")) {
	return;
}
tools.appendString("\"\t\t \t\n\t\t");
	}
tools.appendString("\n\n\t\t");
	if (when_3("Width", "", "Size", "")) {
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
tools.appendString("\n\n\t\t");
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
tools.appendString("\t\n\t\t\tONFOCUS=\"if(window.objSmartPrompt && window.setGridClassNameDefaults) { objSmartPrompt.doOnFocus(null, event); setGridClassNameDefaults(this); }\" \n\t\t\tCLASS=\"InputIntellisenseStyle\"\n\t\t\tISNS_ONCHANGE = \"onChangeHandler\"\n\t\t\t");
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
tools.appendString("\n\t\t\tISNS_MYQUERY=\"");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(ISNS_MYQUERY)", "literal")) {
	return;
}
tools.appendString("\"\n\t\t");
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
	if (when_4("ListName", "")) {
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
	if (when_4("PropertyExtras", "")) {
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
tools.appendString("\n\n   ");
 if(!"".equals(tools.getParamValue("ariaLabel"))){ 
tools.appendString("\n                 aria-label='");
out.print( tools.getParamValue("ariaLabel"));
tools.appendString("'\n           ");
} 
tools.appendString("\n  \n\t\t");
choose_21();
tools.appendString("\n\t\t\n\n\t\t");
choose_22();
tools.appendString("\n\t\t\n\t\t\n\t\t");
	if (when_4("DisableInputBox", "-1")) {
tools.appendString("\n                   \tdisabled\n                   ");
	}
tools.appendString("\n  \n  \t");
	if (when_4("DisableInputBoxTF", "true")) {
tools.appendString("\n                   \tdisabled\n                   ");
	}
tools.appendString("\n                  \t\t\n\t\tISNS_POPUPTYPE=\"DIV\"\n\t\tisBaseClassSet = \"false\"\n\t\tAUTOCOMPLETE=\"off\"  \n\t\t\n\t\t");
choose_23();
tools.appendString("\n\t\t   \n\t\tonchange=\"getGridDataSourceClass(this);\"\n    ");

    pega_rules_utilities.pzRegisterActivity(tools, "Rule-Obj-Property.GetPageListPropertyClasses");
  
tools.appendString("\n\t\tonblur=\"processExpressionField(this);\"\n\t\t>\n      ");
	if (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT")) {
tools.appendString("\n\t\t\t");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_4();

tools.appendString("\n\t\t");
	}
tools.appendString("\n      </td>\n     ");
 
    
    if(!("true".equals(noOpenRule) || "-1".equals(noOpenRule))){
tools.appendString("\n\t<td style=\"font-size: 2pt;\">&nbsp;</td>\n\t");
	if (when_2("OpenRuleTooltip", "NoOpenRuleIcon")) {
tools.appendString("\n\t<td nowrap style=\"vertical-align: top;padding-top:4px;\">\n\t<BUTTON style=\"BORDER-RIGHT: 0px; BORDER-TOP: 0px; MARGIN: 0px; BORDER-LEFT: 0px; BORDER-BOTTOM:0px; width: auto;\" ONCLICK=\"setSectionClassForPageListPropertyOpen('");

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
tools.appendString("',event); return false;\" TITLE =\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(strButtonToolTip)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strButtonToolTip)")) {
	return;
}
tools.appendString("\" type=\"button\" name=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-name", "NORMAL")) {
	return;
}
tools.appendString("-button\">\n\t<SPAN class=\"iconOpenRule\" ONMOUSEOVER=\"this.className='iconOpenRule_on'\"  \n\tONMOUSEOUT=\"this.className='iconOpenRule'\" SPANTYPE=\"BUTTON\" style=\"vertical-align:middle; cursor: pointer;\"></SPAN>\n\t</BUTTON></td>\n\t");
	}
tools.appendString("\n\t");
 } 
tools.appendString("\n\t");
	if (pega.isPreviewMode() || tools.getParameterPage().getParameterValue("RuleParameters")!= null) {
tools.appendString("\n<!-- Params button, will be displayed when using GETPARAMS Html Property  -->\n\t<td nowrap>\n\t<button style=\"border-width:0;\" \nonclick=\"getRuleParams(event,'");

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
tools.appendString("\n\t</tr></table>\n  \n\n");

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
tools.appendString("\n\n\n");

  //US-393053: BAC issue fixes for open rule advanced controls used in when rule form advanced tab and configure tab of Decision Tree
  pega_rules_utilities.pzRegisterActivity(tools, "Rule-Obj-When.pzGetJavaBooleanFunctions");
  pega_rules_utilities.pzRegisterActivity(tools, "Rule-Alias-Function.ListAliases");

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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "OpenRuleAdvanced");
	oStreamProperties_1.put("pyRuleSetVersion", "08-23-02");
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
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_6 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZACTIONSETATTRIBUTES #20180713T133243.581 GMT", "pzActionSetAttributes", "Pega-UIEngine", "08-01-01", "20180713T133243.581 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY OPENRULEADVANCED #20230925T083901.516 GMT", "OpenRuleAdvanced", "Pega-Desktop", "08-23-02", "20230925T083901.516 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTPROMPT #20200403T114021.492 GMT", "SmartPrompt", "Pega-UIEngine", "08-05-01", "20200403T114021.492 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTPROMPTWITHOPENRULEINCLUDE #20180713T131549.303 GMT", "SmartPromptWithOpenRuleInclude", "Pega-WB", "08-01-01", "20180713T131549.303 GMT");
}
