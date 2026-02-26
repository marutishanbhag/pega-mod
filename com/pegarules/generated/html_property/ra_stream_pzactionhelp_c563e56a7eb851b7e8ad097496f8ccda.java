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
import com.pega.pegarules.jsptags.WhenTag;
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
 * Builds JSP stream PZACTIONHELP.
 */
public class ra_stream_pzactionhelp_c563e56a7eb851b7e8ad097496f8ccda extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pzActionHelp.Stream");
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
	public ra_stream_pzactionhelp_c563e56a7eb851b7e8ad097496f8ccda(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "6ce5a237db8d045419c63221b4833205aca19a9";
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
/* Instance RULE-HTML-PROPERTY PZACTIONHELP #20200824T120614.805 GMT	Pega-Gadgets:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZACTIONHELP #20200824T120614.805 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZACTIONHELP #20200824T120614.805 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY PZACTIONHELP #20200824T120614.805 GMT */
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
	"Rule-Obj-HTML:ACTIONHEADER_HELPBUTTON", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Property:PYACTIONINSTRUCTIONSCAPTION", 
	"Rule-Obj-Property:PYHELPTYPE", 
	"Rule-HTML-Property:PZACTIONHELP"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("ACTIONHEADER_HELPBUTTON","Rule-Obj-HTML","WORK-",false,"","Pega-Gadgets","08-04-01","RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT","!ACTIONHEADER_HELPBUTTON",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1629971289), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-HTML","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYACTIONINSTRUCTIONSCAPTION","Rule-Obj-Property","EMBED-PEGA-ASSIGNACTION",true,"Embed-Pega-AssignAction","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY EMBED-PEGA-ASSIGNACTION PYACTIONINSTRUCTIONSCAPTION #20180713T131905.971 GMT","!PYACTIONINSTRUCTIONSCAPTION",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PYHELPTYPE","Rule-Obj-Property","EMBED-PEGA-ASSIGNACTION",true,"Embed-Pega-AssignAction","Pega-ProCom","08-01-01","RULE-OBJ-PROPERTY EMBED-PEGA-ASSIGNACTION PYHELPTYPE #20180713T131905.982 GMT","!PYHELPTYPE",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0), 
		new DependentRuleInfo("PZACTIONHELP","Rule-HTML-Property","",false,"","Pega-Gadgets","08-06-01","RULE-HTML-PROPERTY PZACTIONHELP #20200824T120614.805 GMT","PZACTIONHELP",true,false,"ABSOLUTE_CLASSLESS",410735851)
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
//	RULE-HTML-PROPERTY PZACTIONHELP #20200824T120614.805 GMT:20200824T120614.805 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY EMBED-PEGA-ASSIGNACTION PYHELPTYPE #20180713T131905.982 GMT:20180713T131905.982 GMT
//	RULE-OBJ-PROPERTY EMBED-PEGA-ASSIGNACTION PYACTIONINSTRUCTIONSCAPTION #20180713T131905.971 GMT:20180713T131905.971 GMT
//	RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT:20191205T110924.615 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-OBJ-PROPERTY EMBED-PEGA-ASSIGNACTION PYACTIONINSTRUCTIONSCAPTION #20180713T131905.971 GMT:20180713T131905.971 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "77dd095f4ba262b0352b7efb37793d10";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private static final String[] showMeParams_1 = {
"", "", "", "", "Work-", "", "04-02", "", "Rule-Obj-HTML", "Yes", "", "Pega-Gadgets", "08-04-01", "", "ActionHeader_HelpButton", "", "RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT" };
private void performStream_1() throws Throwable {

	ClipboardPage myParamPage = tools.findPage("myParamPage",true);
	boolean isNewActionSection = false;
	if(myParamPage != null && myParamPage.getIfPresent("pyDisplayMode") != null){
		isNewActionSection = true;
	}	

tools.appendString("\n\n");
	if (WhenTag.evaluateWhen(pega, "newAssignPage.pyAssignActions($save(indexInList)).pyActionHelpPresent==\"true\"", null, false)) {
tools.appendString("\n\t");
	boolean foundChoice_1 = false;
tools.appendString("\n\t\t");
if (!foundChoice_1 && (pega.isPreviewMode() || isNewActionSection)) {
tools.appendString("\n\t\t\t<button title='' onclick=\"displayHelp(event)\" id=\"HelpButton\" name=\"HelpButton\" class=\"iconHelp\" onmouseover=\"this.className='iconHelp_on'\" onmouseout=\"this.className='iconHelp'\" >\n\t\t\t</button>\n\t\t");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString("\n\t\t");
if (!foundChoice_1) {
tools.appendString("\n\t\t\t<button title='");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "newAssignPage.pyAssignActions($save(indexInList)).pyActionInstructionsCaption")) {
	return;
}
tools.appendString("' onclick=\"displayHelp(event)\" id=\"HelpButton\" name=\"HelpButton\" >\n\t\t\t<span class=\"iconHelp\" onmouseover=\"this.className='iconHelp_on'\" onmouseout=\"this.className='iconHelp'\">\n\t\t\t</span>\n\t\t\t</button>\n\t\t");
}
tools.appendString("\n\t\n");
	}
}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Yes");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "");
	oStreamProperties_2.put("pyClassName", "Work-");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "ActionHeader_HelpButton");
	oStreamProperties_2.put("pyRuleSetVersion", "08-04-01");
}
/**
 * Build stream RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT	Pega-Gadgets:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
/*
 * Begin RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
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
/* end RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_3(String aParam1) throws Throwable {
	return (pega.isPreviewMode() || (((!(invokeWhenRule(tools, aParam1))))));
}
private boolean when_2(String aParam1, String aParam2, String aParam3) throws Throwable {
	return (pega.isPreviewMode() || ((areValsEqual(tools.getProperty(aParam1).getStringValue(), aParam2)) && (((!(invokeWhenRule(tools, aParam3)))))));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_2("myParamPage.pyDisplayMode", "ActionDropdown", "pzInScreenFlow")) {
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("ActionSection_HelpButton", null, null, "Rule-Obj-HTML", null);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice && when_2("myParamPage.pyDisplayMode", "ActionMenuBar", "pzInScreenFlow")) {
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("ActionSection_HelpButton", null, null, "Rule-Obj-HTML", null);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
	if (when_3("pzShowActionAsButtons")) {
tools.appendString(" ");
/* Include stream RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT */
include_1();

tools.appendString(" ");
	}
tools.appendString(" ");
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
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (!areValsEqual(tools.getSaveValue(aParam1), aParam2)));
}
private void performStream_2() throws Throwable {

  ClipboardPage newAssignPage = tools.findPage("newAssignPage");
  String defaultActionName = newAssignPage.getString("pyDefaultTaskStatus");
  ClipboardProperty assignActions = newAssignPage.getProperty("pyAssignActions");
  int indexInList = pega_rules_utilities.IndexInPageList(defaultActionName,"pyActionName",assignActions);

  if(indexInList!=-1){
    ParameterPage paramPage = tools.getParameterPage();
    String index = String.valueOf(indexInList);   
    paramPage.putString("HelpTaskIndex",index);
  }  

tools.appendString(" ");
pzAuto.putSaveRef("indexInList", "Param.HelpTaskIndex", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
	if (when_1("indexInList", "")) {
tools.appendString(" <input type=\"hidden\" name=\"TaskHelpType\" value=\"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "newAssignPage.pyAssignActions($save(indexInList)).pyHelpType")) {
	return;
}
tools.appendString("\" /> <input type=\"hidden\" name=\"TaskInstructionsCaption\" value=\"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, "newAssignPage.pyAssignActions($save(indexInList)).pyActionInstructionsCaption")) {
	return;
}
tools.appendString("\" /> ");
choose_1();
tools.appendString("  ");
	}
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZACTIONHELP #20200824T120614.805 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzActionHelp");
	oStreamProperties_1.put("pyRuleSetVersion", "08-06-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZACTIONHELP #20200824T120614.805 GMT", "pzActionHelp", "Pega-Gadgets", "08-06-01", "20200824T120614.805 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML WORK- ACTIONHEADER_HELPBUTTON #20191205T110924.615 GMT", "Work- ActionHeader_HelpButton", "Pega-Gadgets", "08-04-01", "20191205T110924.615 GMT");
}
