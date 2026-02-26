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
 * Builds JSP stream AUTOCOMPLETE.
 */
public class ra_stream_autocomplete_8ad2077897c43924d20c0c3f4ed8fc7e extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.AutoComplete.Stream");
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
	public ra_stream_autocomplete_8ad2077897c43924d20c0c3f4ed8fc7e(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "c1c142a880cc34bef99e4abc7e97ffe1668ae91a";
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
/* Instance RULE-HTML-PROPERTY AUTOCOMPLETE #20230915T093146.372 GMT	Pega-Gadgets:08-23-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY AUTOCOMPLETE #20230915T093146.372 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY AUTOCOMPLETE #20230915T093146.372 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_9();

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
/* end RULE-HTML-PROPERTY AUTOCOMPLETE #20230915T093146.372 GMT */
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
	"Rule-Obj-FieldValue:PYMESSAGELABEL!LOADING...", 
	"Rule-File-Text:WEBWB!SMARTINFOPOPUP!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_AUTOCOMPLETE!JS", 
	"Rule-File-Text:WEBWB!PEGA_TOOLS_CACHE!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_SMARTINFO!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_CONTROL_AUTOCOMPLETE!JS", 
	"Rule-File-Text:WEBWB!PZPEGA_UI_ACDATASOURCE!JS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Fragment:PZAUTOCOMPLETE_VARIABLES", 
	"Rule-HTML-Fragment:PZSETSTRLOADMSG", 
	"Rule-HTML-Fragment:PEGATOOLSCACHEINCLUDE", 
	"Rule-HTML-Fragment:SMARTINFOPOPUPINCLUDE", 
	"Rule-Obj-Property:PYMESSAGELABEL", 
	"Rule-HTML-Property:STARTSMARTFIELD", 
	"Rule-HTML-Property:MESSAGES", 
	"Rule-HTML-Property:ENDSMARTFIELD", 
	"Rule-HTML-Property:AUTOCOMPLETE", 
	"Rule-HTML-Property:CLIENTVALIDATION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYMESSAGELABEL!LOADING...","Rule-Obj-FieldValue","@BASECLASS",true,"Code-Pega-Requestor","Pega-WB","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT","!PYMESSAGELABEL!LOADING...",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("WEBWB!SMARTINFOPOPUP!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB SMARTINFOPOPUP!JS #20180713T133429.322 GMT","WEBWB!SMARTINFOPOPUP!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_AUTOCOMPLETE!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_UI_AUTOCOMPLETE!JS #20190506T071120.593 GMT","WEBWB!PZPEGA_UI_AUTOCOMPLETE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PEGA_TOOLS_CACHE!JS","Rule-File-Text","",false,"","Pega-WB","","RULE-FILE-TEXT WEBWB PEGA_TOOLS_CACHE!JS #20180713T131539.636 GMT","WEBWB!PEGA_TOOLS_CACHE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_SMARTINFO!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_UI_SMARTINFO!JS #20200214T063824.395 GMT","WEBWB!PZPEGA_UI_SMARTINFO!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_CONTROL_AUTOCOMPLETE!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_AUTOCOMPLETE!JS #20180713T133426.971 GMT","WEBWB!PZPEGA_CONTROL_AUTOCOMPLETE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZPEGA_UI_ACDATASOURCE!JS","Rule-File-Text","",false,"","Pega-Gadgets","","RULE-FILE-TEXT WEBWB PZPEGA_UI_ACDATASOURCE!JS #20200721T064152.862 GMT","WEBWB!PZPEGA_UI_ACDATASOURCE!JS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Fragment","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZAUTOCOMPLETE_VARIABLES","Rule-HTML-Fragment","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-FRAGMENT PZAUTOCOMPLETE_VARIABLES #20180713T133430.395 GMT","PZAUTOCOMPLETE_VARIABLES",true,false,"ABSOLUTE_CLASSLESS",-1819414469), 
		new DependentRuleInfo("PZSETSTRLOADMSG","Rule-HTML-Fragment","",false,"","Pega-Gadgets","08-05-01","RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT","PZSETSTRLOADMSG",true,false,"ABSOLUTE_CLASSLESS",896523198), 
		new DependentRuleInfo("PEGATOOLSCACHEINCLUDE","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT","PEGATOOLSCACHEINCLUDE",true,false,"ABSOLUTE_CLASSLESS",707659335), 
		new DependentRuleInfo("SMARTINFOPOPUPINCLUDE","Rule-HTML-Fragment","",false,"","Pega-Gadgets","08-05-01","RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT","SMARTINFOPOPUPINCLUDE",true,false,"ABSOLUTE_CLASSLESS",623244020), 
		new DependentRuleInfo("PYMESSAGELABEL","Rule-Obj-Property","@BASECLASS",true,"Code-Pega-Requestor","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYMESSAGELABEL #20180713T131842.875 GMT","!PYMESSAGELABEL",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("STARTSMARTFIELD","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT","STARTSMARTFIELD",true,false,"ABSOLUTE_CLASSLESS",-1437336844), 
		new DependentRuleInfo("MESSAGES","Rule-HTML-Property","",false,"","Pega-UIDesign","08-01-01","RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT","MESSAGES",true,false,"ABSOLUTE_CLASSLESS",-794757422), 
		new DependentRuleInfo("ENDSMARTFIELD","Rule-HTML-Property","",false,"","Pega-ProCom","08-01-01","RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT","ENDSMARTFIELD",true,false,"ABSOLUTE_CLASSLESS",1047137300), 
		new DependentRuleInfo("AUTOCOMPLETE","Rule-HTML-Property","",false,"","Pega-Gadgets","08-23-01","RULE-HTML-PROPERTY AUTOCOMPLETE #20230915T093146.372 GMT","AUTOCOMPLETE",true,false,"ABSOLUTE_CLASSLESS",-796619170), 
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
//	RULE-HTML-PROPERTY AUTOCOMPLETE #20230915T093146.372 GMT:20230915T093146.372 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT:20180713T133438.113 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT:20200428T081054.428 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_SMARTINFO!JS #20200214T063824.395 GMT:20200515T154936.126 GMT
//	RULE-FILE-TEXT WEBWB SMARTINFOPOPUP!JS #20180713T133429.322 GMT:20180713T133429.322 GMT
//	RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT:20200428T081054.535 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYMESSAGELABEL #20180713T131842.875 GMT:20180713T131842.875 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT:20180713T131654.066 GMT
//	RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT:20180713T133634.985 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-FRAGMENT PZAUTOCOMPLETE_VARIABLES #20180713T133430.395 GMT:20180713T133430.395 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_CONTROL_AUTOCOMPLETE!JS #20180713T133426.971 GMT:20180713T133426.971 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_AUTOCOMPLETE!JS #20190506T071120.593 GMT:20190506T071120.593 GMT
//	RULE-FILE-TEXT WEBWB PZPEGA_UI_ACDATASOURCE!JS #20200721T064152.862 GMT:20200721T064152.862 GMT
//	RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT:20180713T131547.021 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-FILE-TEXT WEBWB PEGA_TOOLS_CACHE!JS #20180713T131539.636 GMT:20180713T131539.636 GMT
//	RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT:20181008T083757.252 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT:20180713T132011.328 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e1229e9a2c11b9040d632f80fc44977b";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private boolean when_7(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || (((((((!(tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))))) || (((((tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam3), aParam4)))))))));
}
private void performStream_8() throws Throwable {
	if (when_7("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString(" </span> ");
	}
tools.appendString(" ");
}
private static final Map oPropDefinitions_9 = null;
private static final Map oStreamProperties_9 = new HashMap();
static {
	oStreamProperties_9.put("pyRuleAvailable", "Final");
	oStreamProperties_9.put("pyCircumstanceDateProp", "");
	oStreamProperties_9.put("pyCircumstanceVal", "");
	oStreamProperties_9.put("pyMethodStatus", "Internal");
	oStreamProperties_9.put("pyClassName", "");
	oStreamProperties_9.put("pyCircumstanceProp", "");
	oStreamProperties_9.put("pzInsKey", "RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT");
	oStreamProperties_9.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_9.put("pyCircumstanceDate", "");
	oStreamProperties_9.put("pyRuleEnds", "");
	oStreamProperties_9.put("pyRuleStarts", "");
	oStreamProperties_9.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_9.put("pyXMLType", "");
	oStreamProperties_9.put("pyRuleSet", "Pega-ProCom");
	oStreamProperties_9.put("pyCorrType", "");
	oStreamProperties_9.put("pyStreamName", "EndSmartField");
	oStreamProperties_9.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_PegaAccel_Management_Refactor_Class_EndSmartField
 */
private void property_PegaAccel_Management_Refactor_Class_EndSmartField() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT	Pega-ProCom:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT
 * Set up context.
 */
final String prevRuleKey_9 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT";final String prevClass_9 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_9 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_9);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_9);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_8)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_8();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_9);
	mStreamResponse.setJspBaseClass(prevClass_9);
	pz_CurrentRuleKey = prevRuleKey_9;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_8,true);
}
/* end RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT
 */
private void include_8() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_PegaAccel_Management_Refactor_Class_EndSmartField();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
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
private boolean when_6(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_3() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_5("bAddedValidationType", "true")) {
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
private void performStream_7() throws Throwable {
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
choose_3();
tools.appendString("  ");
pzAuto.putSaveValue("validationAttributes",   tools.getDictionary().fromDefinition(tools.getActive(), "pyStringType").toLowerCase() , IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_6("pega_validation", "")) {
tools.appendString("  ");
choose_3();
tools.appendString("  ");
pzAuto.putSaveRef("validationAttributes", "param.pega_validation", IAutoStreamRuntime.SAVE_APPEND);
tools.appendString(" ");
	}
tools.appendString(" ");
	if (when_5("bAddedValidationType", "true")) {
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
	if (when_6("pega_validation", "")) {
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
if (_jspx_meth_pega_reference__2(pageContext, "$save(validationAttributes)", "literal")) {
	return;
}
tools.appendString(" ");
	}
}
private static final Map oPropDefinitions_8 = null;
private static final Map oStreamProperties_8 = new HashMap();
static {
	oStreamProperties_8.put("pyRuleAvailable", "Final");
	oStreamProperties_8.put("pyCircumstanceDateProp", "");
	oStreamProperties_8.put("pyCircumstanceVal", "");
	oStreamProperties_8.put("pyMethodStatus", "Internal");
	oStreamProperties_8.put("pyClassName", "");
	oStreamProperties_8.put("pyCircumstanceProp", "");
	oStreamProperties_8.put("pzInsKey", "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT");
	oStreamProperties_8.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_8.put("pyCircumstanceDate", "");
	oStreamProperties_8.put("pyRuleEnds", "");
	oStreamProperties_8.put("pyRuleStarts", "");
	oStreamProperties_8.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_8.put("pyXMLType", "");
	oStreamProperties_8.put("pyRuleSet", "Pega-UIEngine");
	oStreamProperties_8.put("pyCorrType", "");
	oStreamProperties_8.put("pyStreamName", "ClientValidation");
	oStreamProperties_8.put("pyRuleSetVersion", "08-02-01");
}
/**
 * Generates stream property_PegaAccel_Management_Refactor_Class_ClientValidation
 */
private void property_PegaAccel_Management_Refactor_Class_ClientValidation() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT	Pega-UIEngine:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 * Set up context.
 */
final String prevRuleKey_8 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT";final String prevClass_8 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_8 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_8);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_8);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_7)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_7();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_8);
	mStreamResponse.setJspBaseClass(prevClass_8);
	pz_CurrentRuleKey = prevRuleKey_8;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_7,true);
}
/* end RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT
 */
private void include_7() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_PegaAccel_Management_Refactor_Class_ClientValidation();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private static final String[] showMeParams_3 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Final", "", "Pega-WB", "08-01-01", "", "PegaToolsCacheInclude", "", "RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT" };
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
	IStaticContentRuntime pzStatic__12 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__12.addFile("pega_tools_cache", "1230143793", "js");
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
 * OnlyOnce condition: PegaToolsCacheInclude
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_2() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("PegaToolsCacheInclude")) {
tools.appendString(" ");
if (_jspx_meth_pega_static__3(pageContext, "script", "webwb")) {
	return;
}
tools.appendString(" ");
}
}
private void performStream_5() throws Throwable {
onlyOnce_2();
tools.appendString(" ");
}
private static final Map oPropDefinitions_7 = null;
private static final Map oStreamProperties_7 = new HashMap();
static {
	oStreamProperties_7.put("pyRuleAvailable", "Final");
	oStreamProperties_7.put("pyCircumstanceDateProp", "");
	oStreamProperties_7.put("pyCircumstanceVal", "");
	oStreamProperties_7.put("pyMethodStatus", "");
	oStreamProperties_7.put("pyClassName", "");
	oStreamProperties_7.put("pyCircumstanceProp", "");
	oStreamProperties_7.put("pzInsKey", "RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT");
	oStreamProperties_7.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_7.put("pyCircumstanceDate", "");
	oStreamProperties_7.put("pyRuleEnds", "");
	oStreamProperties_7.put("pyRuleStarts", "");
	oStreamProperties_7.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_7.put("pyXMLType", "");
	oStreamProperties_7.put("pyRuleSet", "Pega-WB");
	oStreamProperties_7.put("pyCorrType", "");
	oStreamProperties_7.put("pyStreamName", "PegaToolsCacheInclude");
	oStreamProperties_7.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT
 */
private void include_5() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT	Pega-WB:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT
 * Set up context.
 */
final String prevRuleKey_7 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT";final String prevClass_7 = mStreamResponse.getJspBaseClass();
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

	performStream_5();

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
/* end RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_3);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:static tag.
 */private boolean _jspx_meth_pega_static__2(PageContext aPageContext, java.lang.String aType, java.lang.String aApp, boolean aMoveToEnd) throws Throwable {
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
	IStaticContentRuntime pzStatic__6 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__6.addFile("pzpega_control_autocomplete", "1176545502", "js");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__8 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__8.addFile("pzpega_ui_autocomplete", "12338942267", "js");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__10 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__10.addFile("pzpega_ui_acdatasource", "14143074172", "js");
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
 * OnlyOnce condition: pzAutoComplete_Variables
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_3() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("pzAutoComplete_Variables")) {
tools.appendString(" ");
if (_jspx_meth_pega_static__2(pageContext, "script", "webwb", true)) {
	return;
}
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT */
include_5();

tools.appendString(" ");
}
}
private void performStream_6() throws Throwable {
onlyOnce_3();
tools.appendString(" ");
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
	oStreamProperties_6.put("pzInsKey", "RULE-HTML-FRAGMENT PZAUTOCOMPLETE_VARIABLES #20180713T133430.395 GMT");
	oStreamProperties_6.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_6.put("pyCircumstanceDate", "");
	oStreamProperties_6.put("pyRuleEnds", "");
	oStreamProperties_6.put("pyRuleStarts", "");
	oStreamProperties_6.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_6.put("pyXMLType", "");
	oStreamProperties_6.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_6.put("pyCorrType", "");
	oStreamProperties_6.put("pyStreamName", "pzAutoComplete_Variables");
	oStreamProperties_6.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZAUTOCOMPLETE_VARIABLES #20180713T133430.395 GMT
 */
private void include_6() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZAUTOCOMPLETE_VARIABLES #20180713T133430.395 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZAUTOCOMPLETE_VARIABLES #20180713T133430.395 GMT
 * Set up context.
 */
final String prevRuleKey_6 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZAUTOCOMPLETE_VARIABLES #20180713T133430.395 GMT";final String prevClass_6 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Fragment");
final Map prevPropDefs_6 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_6);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_6);
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_5)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_6();

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
/* end RULE-HTML-FRAGMENT PZAUTOCOMPLETE_VARIABLES #20180713T133430.395 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_5(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue(aParam1), aParam2)));
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
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "");
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");
tools.putSaveValue("errorDivStyle", "inputErrorDiv");
tools.appendString(" ");
tools.putSaveValue("errorSpanStyle", "inputError");
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2) {
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
	if (when_5("parentLayoutVal", "SIMPLELAYOUT")) {
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
	if (when_5("parentLayoutVal", "SIMPLELAYOUT")) {
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
	if (when_5("isBad", "true")) {
tools.appendString(" id=\"PegaRULESErrorFlag\" ");
	}
tools.appendString(" > ");
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.getRequestor().getTypeName().equalsIgnoreCase(PRRequestor.sTypePortal))) {
tools.appendString(" <b style=\"font-family: wingdings;color:red;cursor:hand\">x</b> ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.getSaveValue("FieldError").equals("ERRORTEXT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.getSaveValue("parentLayoutVal").equals("SIMPLELAYOUT"))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "LITERAL"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(localizedMessage)", "LITERAL")) {
	return;
}
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
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
 * Generates stream property_PegaAccel_Management_Refactor_Class_messages
 */
private void property_PegaAccel_Management_Refactor_Class_messages() {
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
property_PegaAccel_Management_Refactor_Class_messages();
	} finally {
		pega.setStreamProperties(streamProperties);
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
private boolean when_4(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_2() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_4("SmartInfoHeader", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartLabel", "$this-definition(pyLabel)", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartLabel", "param.SmartInfoHeader", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
}
}
private boolean when_3(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (((tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))));
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || ((((!(tools.useModeInput())) && (!areValsEqual(tools.getParamValue(aParam1), aParam2))))));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
tools.appendString(" ");
if (!foundChoice && when_2("ReadOnlySmartInfo", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartInfoSection", "param.ReadOnlySmartInfo", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
tools.appendString(" ");
if (!foundChoice && when_3("ReadWriteSmartInfo", "")) {
tools.appendString(" ");
pzAuto.putSaveRef("SmartInfoSection", "param.ReadWriteSmartInfo", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
tools.putSaveValue("SmartInfoSection", "");
tools.appendString(" ");
}
}
private static final String[] showMeParams_2 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Fragment", "Final", "", "Pega-Gadgets", "08-05-01", "", "SmartInfoPopupInclude", "", "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT" };
/**
 * Implements a pega:lookup tag.
 */private boolean _jspx_meth_pega_lookup__1(PageContext aPageContext, java.lang.String aProperty, java.lang.String aValue) throws Throwable {
/* pega:lookup */
com.pega.pegarules.jsptags.LookupTag _jspx_th_pega_lookup_ = (com.pega.pegarules.jsptags.LookupTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.LookupTag.class);
_jspx_th_pega_lookup_.setPageContext(pageContext);
_jspx_th_pega_lookup_.setParent(mParentTag);
_jspx_th_pega_lookup_.setProperty(aProperty);
_jspx_th_pega_lookup_.setValue(aValue);
int _jspx_eval_pega_lookup_ = _jspx_th_pega_lookup_.doStartTag();
if (_jspx_th_pega_lookup_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_lookup_);
return false;
}
private static final String[] showMeParams_1 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYMESSAGELABEL!LOADING... #20180713T131654.066 GMT", "Rule-Obj-FieldValue", "Pega-WB", "pyMessageLabel", "Code-Pega-Requestor", "Loading..." };
private void performStream_1() throws Throwable {
tools.appendString("<script> var strLoadMsg = \"");

/* Field value Code-Pega-Requestor pxRequestor.pyMessageLabel Loading... */
if (mInline_pxRequestor) {
	out.write("Loading...");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_1);
} else {
if (_jspx_meth_pega_lookup__1(pageContext, "pxRequestor.pyMessageLabel", "Loading...")) {
	return;
}
}
tools.appendString("\"; </script>");
}
private static final Map oPropDefinitions_4 = new HashMap();
static {
	oPropDefinitions_4.put("Code-Pega-Requestor.pyMessageLabel", new LiteweightPropertyDefinition("Code-Pega-Requestor", "pyMessageLabel", "siN", false, true, "Default", false));
}
private static final Map oStreamProperties_4 = new HashMap();
static {
	oStreamProperties_4.put("pyRuleAvailable", "Final");
	oStreamProperties_4.put("pyCircumstanceDateProp", "");
	oStreamProperties_4.put("pyCircumstanceVal", "");
	oStreamProperties_4.put("pyMethodStatus", "Internal");
	oStreamProperties_4.put("pyClassName", "");
	oStreamProperties_4.put("pyCircumstanceProp", "");
	oStreamProperties_4.put("pzInsKey", "RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT");
	oStreamProperties_4.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_4.put("pyCircumstanceDate", "");
	oStreamProperties_4.put("pyRuleEnds", "");
	oStreamProperties_4.put("pyRuleStarts", "");
	oStreamProperties_4.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_4.put("pyXMLType", "");
	oStreamProperties_4.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_4.put("pyCorrType", "");
	oStreamProperties_4.put("pyStreamName", "pzSetStrLoadMsg");
	oStreamProperties_4.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT	Pega-Gadgets:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT
 * Set up context.
 */
final String prevRuleKey_4 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT";final String prevClass_4 = mStreamResponse.getJspBaseClass();
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

	performStream_1();

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
/* end RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
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
tools.appendString(" ");
	IStaticContentRuntime pzStatic__2 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__2.addFile("pzpega_ui_smartinfo", "13318087721", "js");
tools.appendString(" ");
	IStaticContentRuntime pzStatic__4 = (IStaticContentRuntime)pageContext.getAttribute("static_tag_fields");
	pzStatic__4.addFile("smartinfopopup", "1421806147", "js");
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT */
include_1();

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
 * OnlyOnce condition: StreamIncluded_SmartInfo_Script
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("StreamIncluded_SmartInfo_Script")) {
tools.appendString(" ");
if (_jspx_meth_pega_static__1(pageContext, "script", "webwb")) {
	return;
}
tools.appendString(" ");
}
}
private void performStream_2() throws Throwable {
onlyOnce_1();
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Fragment");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "SmartInfoPopupInclude");
	oStreamProperties_3.put("pyRuleSetVersion", "08-05-01");
}
/**
 * Build stream RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT	Pega-Gadgets:08-05-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
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

	performStream_2();

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
/* end RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_2);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_3() throws Throwable {
	if (when_1("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT */
include_2();

tools.appendString(" ");
	}
tools.appendString(" ");
choose_1();
tools.appendString("  ");
choose_2();
tools.appendString("  ");
	if (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue("SmartInfoSection"), ""))) {
tools.appendString(" <SPAN id=\"SI\" class=\"smartInfo\" si_usingpage='' si_headertext= '");
out.print(tools.getLocalizedTextForString("pyLabel", tools.getSaveValue("SmartLabel") ) );
tools.appendString(" ' si_sectionname = '");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(SmartInfoSection)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(SmartInfoSection)")) {
	return;
}
tools.appendString("' name='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-definition(pyPropertyName)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-definition(pyPropertyName)")) {
	return;
}
tools.appendString("' > ");
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
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "StartSmartField");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_PegaAccel_Management_Refactor_Class_StartSmartField
 */
private void property_PegaAccel_Management_Refactor_Class_StartSmartField() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT
 */
private void include_3() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_PegaAccel_Management_Refactor_Class_StartSmartField();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_1(String aParam1, String aParam2, String aParam3, String aParam4) throws Throwable {
	return (pega.isPreviewMode() || ((!areValsEqual(tools.getParamValue(aParam1), aParam2)) || (!areValsEqual(tools.getParamValue(aParam3), aParam4))));
}
private void performStream_9() throws Throwable {
pega_rules_utilities.pzRegisterActivity(tools,"@baseclass.AcDataSource_Driver");
tools.appendString("\n");
	if (when_1("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString("\n\t");
/* Include stream RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT */
include_3();

tools.appendString("\n");
	}
tools.appendString("\n");
	boolean foundChoice_1 = false;
tools.appendString("\n\t");
if (!foundChoice_1 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString("\n\t\t");
/* Include stream RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT */
include_4();

tools.appendString("\n\t\t");
pzAuto.putSaveRef("acName", "$this-name", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t\t");
pzAuto.putSaveRef("acValue", "$this-value", IAutoStreamRuntime.SAVE_SET);
tools.appendString("\n\t\t");

		    
	   	          com.pega.pegarules.priv.runtime.IActionRequest actionRequest = pzAuto.getActionRequest();
                            actionRequest.registerFixedParameter("pyActivity","@baseclass.AcDataSource_Driver");                
			String acUID = TagTools.getUniqueID(tools);
			String acPropName = tools.getSaveValue("acName");
			String acPropValue = tools.getSaveValue("acValue");
			String acWidth = tools.getParamValue("width");
			String acWidthStyle = "";
			String acSize = tools.getParamValue("size");
			String acSizeText = "size='50'";
			String acMinChars = tools.getParamValue("minChars");			
			String acToolTip = "";
			String acMetaData = "";
			String acDSString = "";
			String acShowListString = "";
			String acPropListString = "";
			String acHighlight = tools.getParamValue("highlight");
			String acListingWidth = tools.getParamValue("listingWidth");
			String acDSType = tools.getParamValue("DataSourceType");
			String acDSSourceName = tools.getParamValue("sourceName");
			String acDSActivityClassName = tools.getParamValue("activityClassName");
			String acDSSearchPropName = tools.getParamValue("searchPropertyName");
			String acDSPartialSearch = tools.getParamValue("partialSearch");
			String acDSDisplayField = tools.getParamValue("displayField");
			String acDSMaxResults = tools.getParamValue("maxResults");
			String acDSClientCache = tools.getParamValue("clientCache");
			String acDSCategoryField = tools.getParamValue("categoryField");
			String acDSSendSearchTerm = tools.getParamValue("sendSearchTerm");
			String acDSUseBestBet = tools.getParamValue("useBestBet");
			String acDSUseCategoryField = tools.getParamValue("useCategoryField");
			String acDSAdditionalFields = tools.getParamValue("dsFields");
			String acSkipDSFieldsReset = tools.getParamValue("skipDSFieldsReset");
			String acDSAddParams = tools.getParamValue("additionalParams");
			String acIgnoreCase = tools.getParamValue("ignoreCase");
			String acFirstColWidth = tools.getParamValue("firstColumnWidth");
			String acColAlignment= tools.getParamValue("columnAlignment");
			String acTypingTimeout = tools.getParamValue("typingTimeout");
			String acSendingTimeout = tools.getParamValue("sendingTimeout");
			String acDelimiter = tools.getParamValue("delimiter");
			StringBuffer acHiddenInputMarkup = new StringBuffer();
			acDSAddParams = acDSAddParams == null?"":acDSAddParams;
	      		String acSkipParent = tools.getParamValue("skipParent");
			String isFromReportFilter =tools.getParamValue("isFromReportFilter");
			
			 if("reportdefinition".equalsIgnoreCase(acDSType)){
		        
			 actionRequest.registerFixedParameter("CustomActivityName", "pzPopulateFromDS");
			 actionRequest.registerFixedParameter("CustomActivityClassName", "baseclass");
			 actionRequest.registerFixedParameter("pyReportName", tools.getParamValue("reportDefinitionName"));
			 actionRequest.registerFixedParameter("pyReportClass", tools.getParamValue("reportDefinitionClassName"));
			
			}else if("clipboardpage".equalsIgnoreCase(acDSType)){
			
			 actionRequest.registerFixedParameter("pyDataSourcePageName", acDSSourceName);
			 actionRequest.registerFixedParameter("SearchPropertyName", "pxResults");
			
			}else {

			 // BUG-199024 Report_PropertyPrompt Control is Causing Security Alerts
			 //actionRequest.registerFixedParameter("CustomActivityName", acDSSourceName);
			 String customActivityName =acDSSourceName;
			 int indexOfParameters = customActivityName.indexOf('&');
			 if(indexOfParameters != -1){
				 customActivityName=customActivityName.substring(0,indexOfParameters);
			 }
			 actionRequest.registerFixedParameter("CustomActivityName", customActivityName);
			 actionRequest.registerFixedParameter("CustomActivityClassName", acDSActivityClassName );		
	
			}
                            actionRequest.registerFixedParameter("DisplayField",acDSDisplayField);
			 actionRequest.registerEnumeratedParameter("MaxResults", acDSMaxResults.replace("_mr_",""));		
			 actionRequest.registerEnumeratedParameter("MaxResults", "10");		
			 actionRequest.registerFixedParameter("SearchPropertyName", "pxResults");
			 actionRequest.registerFixedParameter("AllFields", "false");
			 
			
			
			if(acDSAdditionalFields != null && !acDSAdditionalFields.equals("")){
				String[] fieldsArray = acDSAdditionalFields.split("!!!");
				String strName = "";
				StringBuffer propBuffer = new StringBuffer();
				for(int i=0; i<fieldsArray.length; i++){
					String strParam = fieldsArray[i];
					if (!strParam.equals("")){
						String[] strParamArray = strParam.split("&");
						String strParamName = strParamArray[0];
						String strPropertyName = strParamArray[1];
						String strShow = strParamArray[2];
						if (!strParamName.equals("")){
							/* Removing dot before property as it was causing issue while fetching data */
							if (strParamName.startsWith(".")) {
								strParamName = strParamName.substring(strParamName.indexOf(".")+1);
							}
							acShowListString += "\"" + strParamName + "\"" + ":" + strShow + ",";
							if (strPropertyName != null && !strPropertyName.equals("")){
    	        				if(strPropertyName.toLowerCase().startsWith("primary")){
									String sPrimaryPageName = tools.getPrimaryPage().getReference();
									int nIndex = strPropertyName.indexOf(".");
									if (nIndex > 0){
										strPropertyName = sPrimaryPageName + strPropertyName.substring(nIndex);
									}
								}
								else if (strPropertyName.startsWith("."))
									strPropertyName = tools.getStepPage().getReference() + strPropertyName;
								else
									strPropertyName = tools.getStepPage().getReference() + "." + strPropertyName;
								strName =tools.getEntryHandle(strPropertyName);
    	        				ClipboardProperty cpTest =tools.getProperty(strPropertyName);
    	        				String strPropValue = cpTest.getStringValue();
								if (!strName.equals(acPropName))
									acHiddenInputMarkup.append("<INPUT type = 'hidden' id='" + strName + "' name='" + strName + "' value='" + StringUtils.crossScriptingFilter(strPropValue) +"' />\n");
								acPropListString += "\"" + strParamName + "\":\"" + strName + "\",";
    	        			}
						}
					}
				}
				if(acPropListString.endsWith(",")){
					acPropListString = acPropListString.substring(0,acPropListString.lastIndexOf(","));
				}
			}
        	
			if(!tools.getProperty("pxRequestor.pyPegaDesignMode").getStringValue().equals("true")){
				String[] paramsArray = acDSAddParams.split("&");
				StringBuffer tempBuffer = new StringBuffer();
				for (int j=0; j < paramsArray.length; j++)
				{
					String strParam = paramsArray[j];
					if (!strParam.equals("")){
						String[] strParamArray = strParam.split("=");
						String strParamName = strParamArray[0];
						String strParamValue = strParamArray[1];
						if (!strParamName.equals("")){
							if (strParamValue.charAt(0) == '[' && strParamValue.charAt(strParamValue.length() -1) == ']')
							{
									String strTemp = strParamValue.substring(1, strParamValue.length()-1);
									if(strTemp.indexOf(".")<0)
										strTemp = "." + strTemp;
									String strHandle = "";
									String pageToDelete = "";
									boolean bDeleteProperty = false;
									if(tools.getIfPresent(strTemp)== null) {
										bDeleteProperty = true;
										ClipboardPage pgStepPage = tools.getStepPage();
										String pageName = pgStepPage.getReference();
										String propName = strTemp;
										if(!strTemp.startsWith(".")){
											pageName = strTemp.substring(0,strTemp.indexOf("."));
											propName = strTemp.substring(strTemp.indexOf("."));	
											pgStepPage = tools.findPage(pageName,true);
										}
										if(pgStepPage == null){
											pageToDelete = pageName;
										}else {
											String [] arrProp = propName.split("\\.");
											String prop = pageName +".";
											for(int i=0;i<arrProp.length-1;i++){									
												if(arrProp[i].equals(""))
													continue;
												prop += arrProp[i];
												if(tools.findPage(prop,true) == null){
													pageToDelete = prop;
													break;
												}
												prop +=".";
											}
										}
									}
									strHandle = tools.getProperty(strTemp).getEntryHandle();
									if (!strHandle.equals(""))
											strParamValue = "[" + strHandle + "]";
									if(bDeleteProperty)
										tools.getProperty(strTemp).removeFromClipboard();
									if(!pageToDelete.equals(""))  {
										if(pageToDelete.indexOf(".") == pageToDelete.length()-1)
											pageToDelete = pageToDelete.substring(0,pageToDelete.length()-1);
										if(pageToDelete.indexOf(".") <0)
											tools.findPage(pageToDelete).removeFromClipboard();
										else
											tools.getProperty(pageToDelete).removeFromClipboard();
									}
								}
							}
							tempBuffer.append("&" + strParamName + "=" + strParamValue);
					}
                  

				}
				acDSAddParams = tempBuffer.toString();
			}
        	
			/*Client Event Customization for AutoComplete starts*/
			String pAttributes = tools.getParamValue("pega_attributes");
			if (pAttributes.indexOf("ONBLUR") > -1)
				pAttributes = pAttributes.replaceAll("ONBLUR", "ONBLUR_CUSTOM");
			if (pAttributes.indexOf("ONCHANGE") > -1)
				pAttributes = pAttributes.replaceAll("ONCHANGE", "ONCHANGE_CUSTOM");
			tools.putParamValue("pega_attributes", pAttributes);
			/*Client Event Customization for AutoComplete ends*/
			
			if(acWidth!= null && !acWidth.trim().equals("")){
				acWidthStyle = "style='width:" + acWidth + ";'";
			} 
			if(acSize!= null && !acSize.trim().equals("")){
				acSizeText = "size='" + acSize + "'";
			}
			if(acMinChars== null || acMinChars.trim().equals("")){
				acMinChars = "2";
			}
			/* Tooltip creation starts*/
			ClipboardPage tmpPageLocale = tools.createPage("@baseclass","pyLocalePage");	
			if(acMinChars.equals("0")) {
				acToolTip = tools.getLocalizedTextForString( "pyLocalePage.pyMessageLabel","\t["+tmpPageLocale.getClassName()+".pyMessageLabel]AutocompleteTooltipZeroChars");
			} else {
				acToolTip= tools.getLocalizedTextForString( "pyLocalePage.pyMessageLabel","\t["+tmpPageLocale.getClassName()+".pyMessageLabel]AutocompleteTooltip\t"+acMinChars);
			}
			tmpPageLocale.removeFromClipboard();
			/* Tooltip creation complete*/
			
			/*Metadata creation starts*/
			if(acHighlight.equals("-1")){
				acHighlight = "true";
			} else if(acHighlight.equals("0")) {
				acHighlight = "false";
			}	
				
			acListingWidth = acListingWidth == null?"":acListingWidth;
			
			/*Datasource array creation starts*/

			acDSType = acDSType == null?"":acDSType;
			acDSSourceName = acDSSourceName == null?"":acDSSourceName;
			acDSActivityClassName = acDSActivityClassName == null?"":acDSActivityClassName;
			acDSSearchPropName = acDSSearchPropName == null?"":acDSSearchPropName;
			acDSPartialSearch = acDSPartialSearch.equals("-1")?"true":(acDSPartialSearch.equals("0")?"false":acDSPartialSearch);
			acDSDisplayField = acDSDisplayField == null?"":acDSDisplayField;
			acDSMaxResults = acDSMaxResults == null?"":acDSMaxResults;	
			acDSClientCache = acDSClientCache.equals("-1")?"true":(acDSClientCache.equals("0")?"false":acDSClientCache);
			acDSCategoryField = acDSCategoryField == null?"":acDSCategoryField;
			acDelimiter = acDelimiter == null?"":acDelimiter;
			acDelimiter = acDelimiter.replaceAll("~atdrate~", "@");
			acDSSendSearchTerm = acDSSendSearchTerm.equals("-1")?"true":(acDSSendSearchTerm.equals("0")?"false":acDSSendSearchTerm);
			/* NOTE: From some section param value coming as "1" in case of true.
			   Its causing problem in displaying use bestbets div in auto complete.
			   Added checking for "0" to set false
			*/
			acDSUseBestBet = acDSUseBestBet.equals("-1")?"true":(acDSUseBestBet.equals("0")?"false":acDSUseBestBet);
			acDSUseCategoryField = acDSUseCategoryField.equals("-1")?"true":(acDSUseCategoryField.equals("0")?"false":acDSUseCategoryField);
			acDSAdditionalFields = acDSAdditionalFields == null?"":acDSAdditionalFields;
			acFirstColWidth = acFirstColWidth == null?"":acFirstColWidth;
			acColAlignment = acColAlignment == null?"":acColAlignment;
			acSkipDSFieldsReset = (acSkipDSFieldsReset == null || "".equals(acSkipDSFieldsReset))?"false":"true";

			if(!acDSCategoryField.equals("") && acShowListString.indexOf(acDSCategoryField+":") == -1){
				acShowListString += "\""+acDSCategoryField + "\"" + ":true,";
			}	
			
			acShowListString = "{" + acShowListString + "\"" + acDSDisplayField + "\""+ ":true}";
			acPropListString = "{"+ acPropListString +"}";
			
			acDSString = "[\""+acDSType+"\",\"" + acDSSourceName + "\",\"" + acDSActivityClassName + "\",\"" + acDSSearchPropName + "\"," + acDSPartialSearch + ",\"" + acDSDisplayField + "\",\"" + acDSCategoryField + "\"," + acDSClientCache + "," + acDSSendSearchTerm + "," + acDSUseBestBet + "," + acDSUseCategoryField + ",\"" + acDSAddParams + "\"," + acShowListString + ",\"" + acDSMaxResults + "\"," + acPropListString + ",\"" + acFirstColWidth + "\",\""  + acColAlignment + "\",\"" + acDelimiter + "\",\"" + acSkipDSFieldsReset + "\",\"" + acSkipParent + "\",\"" + isFromReportFilter + "\"]";
			
			/*Datasource array creation ends*/

			acMetaData = "["+acHighlight+"," + acListingWidth + "," + acMinChars + "," + acDSString + "]";
			/*Metadata creation ends*/
			
			pzAuto.registerActionRequest(actionRequest);
			boolean isAccessible = com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega,"isAccessible",null,false); /*HFix-9911*/

		
tools.appendString("\n\t\t");
/* Include stream RULE-HTML-FRAGMENT PZAUTOCOMPLETE_VARIABLES #20180713T133430.395 GMT */
include_6();

tools.appendString("\n\t\t<table CELLSPACING='0' CELLPADDING='0' role=\"presentation\">\n\t\t\t<tr>\n\t\t\t\t<td style='padding-left:0px; padding-right:0px; border:0px none; overflow:visible;'>\n\t\t\t\t\t<input class='autocomplete_input' role='combobox' aria-owns='acresults-list' aria-autocomplete='list' id='");
out.print(acUID);
tools.appendString("' \n\t\t\t\t\t");
if(isAccessible){
tools.appendString("\n\t\t\t\t\t\tbAriaLabel='true' \n\t\t\t\t\t\t");
if(!"".equals(tools.getSaveValue("ariaLabelForAC"))){
tools.appendString("\n\t\t\t\t\t\t\taria-label='");
out.print( tools.getSaveValue("ariaLabelForAC"));
tools.appendString("'\n\t\t\t\t\t\t\n\t\t\t\t\t");
}} else if(!"".equals(tools.getParamValue("ariaLabel"))){ 
tools.appendString("\n                 aria-label='");
out.print( tools.getParamValue("ariaLabel"));
tools.appendString("'\n           ");
} 
tools.appendString("       \n\n\t\t\t\t\ttype='text' name='");
out.print(acPropName);
tools.appendString("' data-ctl='[\"AutoComplete\"]' value='");
out.print(StringUtils.crossScriptingFilter(acPropValue));
tools.appendString("' autocomplete='off' ");
out.print(acWidthStyle);
tools.appendString(" ");
out.print(acSizeText);
tools.appendString(" data-config='");
out.print(acMetaData);
tools.appendString("' ");
/* Include stream RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT */
include_7();

tools.appendString(" />\n\t\t\t\t</td>\n\t\t\t\t<td style='vertical-align:middle; padding-left:0px; padding-right:0px; border:0px none; overflow:visible;'>\n\t\t\t\t\t<div style='position:relative;'>\n\t\t\t\t\t\t<div class='autocomplete_icon' title='");
out.print(acToolTip);
tools.appendString("'></div>\n\t\t\t\t\t</div>\n\t\t\t\t</td>\n\t\t\t</tr>\n\t\t</table>\n\t\t");
out.print(acHiddenInputMarkup.toString());
tools.appendString("\n\t");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString("\n\t");
if (!foundChoice_1) {
tools.appendString("\n\t\t");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-value"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$this-value")) {
	return;
}
tools.appendString("\n\t");
}
tools.appendString("\n\n");
	if (when_1("ReadOnlySmartInfo", "", "ReadWriteSmartInfo", "")) {
tools.appendString("\n\t");
/* Include stream RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT */
include_8();

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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY AUTOCOMPLETE #20230915T093146.372 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "AutoComplete");
	oStreamProperties_1.put("pyRuleSetVersion", "08-23-01");
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
	private boolean mInline_pxRequestor = false;
protected void initRequiredPages() {
	ClipboardPage cpCheck = null;
	cpCheck = tools.findPage("pxRequestor");
	mInline_pxRequestor = ((cpCheck != null) && (cpCheck.getClassName().equals("Code-Pega-Requestor")));
}
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_8 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY ENDSMARTFIELD #20180713T132011.328 GMT", "EndSmartField", "Pega-ProCom", "08-01-01", "20180713T132011.328 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_7 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY CLIENTVALIDATION #20181008T083757.252 GMT", "ClientValidation", "Pega-UIEngine", "08-02-01", "20181008T083757.252 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_4 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY MESSAGES #20180713T133634.985 GMT", "Messages", "Pega-UIDesign", "08-01-01", "20180713T133634.985 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_3 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZSETSTRLOADMSG #20200428T081054.535 GMT", "pzSetStrLoadMsg", "Pega-Gadgets", "08-05-01", "20200428T081054.535 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_6 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PEGATOOLSCACHEINCLUDE #20180713T131547.021 GMT", "PegaToolsCacheInclude", "Pega-WB", "08-01-01", "20180713T131547.021 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_5 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT PZAUTOCOMPLETE_VARIABLES #20180713T133430.395 GMT", "pzAutoComplete_Variables", "Pega-Gadgets", "08-01-01", "20180713T133430.395 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY AUTOCOMPLETE #20230915T093146.372 GMT", "AutoComplete", "Pega-Gadgets", "08-23-01", "20230915T093146.372 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-FRAGMENT SMARTINFOPOPUPINCLUDE #20200428T081054.428 GMT", "SmartInfoPopupInclude", "Pega-Gadgets", "08-05-01", "20200428T081054.428 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY STARTSMARTFIELD #20180713T133438.113 GMT", "StartSmartField", "Pega-Gadgets", "08-01-01", "20180713T133438.113 GMT");
}
