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
 * Builds JSP stream PZGRIDACTIVEPAGE.
 */
public class ra_stream_pzgridactivepage_bb9cfb5c5118115fcb02334b6babd158 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pzGridActivePage.Stream");
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
	public ra_stream_pzgridactivepage_bb9cfb5c5118115fcb02334b6babd158(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "73c836289d369d0b90396b33a4005f577d25c4d1";
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
/* Instance RULE-HTML-PROPERTY PZGRIDACTIVEPAGE #20180713T133437.729 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZGRIDACTIVEPAGE #20180713T133437.729 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZGRIDACTIVEPAGE #20180713T133437.729 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-PROPERTY PZGRIDACTIVEPAGE #20180713T133437.729 GMT */
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
	"Rule-Obj-FieldValue:PYCAPTION!OF", 
	"Rule-Obj-FieldValue:PYCAPTION!CURRENT PAGE. PAGE", 
	"Rule-Obj-FieldValue:PYCAPTION!PAGE", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Property:PYCAPTION", 
	"Rule-HTML-Property:PZGRIDACTIVEPAGE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYCAPTION!OF","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-SearchEngine","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!OF #20180713T132852.693 GMT","!PYCAPTION!OF",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYCAPTION!CURRENT PAGE. PAGE","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-RULES","01-01-01","Rule-Obj-FieldValue @BASECLASS  pyCaption","!PYCAPTION!CURRENT PAGE. PAGE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PYCAPTION!PAGE","Rule-Obj-FieldValue","@BASECLASS",false,"","Pega-WB","08-01-01","RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!PAGE #20180713T131650.958 GMT","!PYCAPTION!PAGE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYCAPTION","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT","!PYCAPTION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1), 
		new DependentRuleInfo("PZGRIDACTIVEPAGE","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PZGRIDACTIVEPAGE #20180713T133437.729 GMT","PZGRIDACTIVEPAGE",true,false,"ABSOLUTE_CLASSLESS",994612944)
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
//	RULE-HTML-PROPERTY PZGRIDACTIVEPAGE #20180713T133437.729 GMT:20180713T133437.729 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!PAGE #20180713T131650.958 GMT:20180713T131650.958 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!OF #20180713T132852.693 GMT:20180713T132852.693 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!PAGE #20180713T131650.958 GMT:20180713T131650.958 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	Rule-Obj-FieldValue @BASECLASS  pyCaption:null
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!OF #20180713T132852.693 GMT:20180713T132852.693 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "bbe291f1918863fadec9a4fbda4046f2";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a pega:getSaved tag.
 */private boolean _jspx_meth_pega_getSaved__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:getSaved */
com.pega.pegarules.jsptags.GetSavedTag _jspx_th_pega_getSaved_ = (com.pega.pegarules.jsptags.GetSavedTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.GetSavedTag.class);
_jspx_th_pega_getSaved_.setPageContext(pageContext);
_jspx_th_pega_getSaved_.setParent(mParentTag);
_jspx_th_pega_getSaved_.setName(aName);
int _jspx_eval_pega_getSaved_ = _jspx_th_pega_getSaved_.doStartTag();
if (_jspx_th_pega_getSaved_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_getSaved_);
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
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString("\n  ");
if (!foundChoice && when_2("myParamPage.pyPageMode", "Next Previous")) {
tools.appendString("\n   <input type=\"text\" disabled size=\"6\"/>\n  ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n  ");
if (!foundChoice && when_2("myParamPage.pyPageMode", "First X Results")) {
tools.appendString("\n   <a ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_p_r__1(pageContext, "$save(LinkStyle)", "literal")) {
	return;
}
tools.appendString(" href=\"javascript:void(0)\" >First X Results</a>\n  ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n  ");
if (!foundChoice && when_2("myParamPage.pyPageMode", "Drop-Down")) {
tools.appendString("\n   <select disabled> </select>\n  ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString("\n  ");
if (!foundChoice && when_2("myParamPage.pyPageMode", "Numeric")) {
tools.appendString("\n   <a ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_p_r__1(pageContext, "$save(LinkStyle)", "literal")) {
	return;
}
tools.appendString(" href=\"javascript:void(0)\" >1</a> <a href=\"javascript:void(0)\" >2</a>...\n  ");

foundChoice = !pega.isPreviewMode();
}
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getProperty(aParam1).getStringValue(), aParam2)));
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
private static final String[] showMeParams_1 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!PAGE #20180713T131650.958 GMT", "Rule-Obj-FieldValue", "Pega-WB", "pyCaption", "Data-Admin-System-Settings", "Page" };
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
private static final String[] showMeParams_2 = {
"RULE-OBJ-FIELDVALUE @BASECLASS PYCAPTION!OF #20180713T132852.693 GMT", "Rule-Obj-FieldValue", "Pega-SearchEngine", "pyCaption", "Data-Admin-System-Settings", "of" };
private static final String[] showMeParams_3 = {
"", "Rule-Obj-FieldValue", "", "pyCaption", "Data-Admin-System-Settings", "Current Page. Page" };
private void performStream_1() throws Throwable {
	boolean foundChoice_1 = false;
tools.appendString("\n  ");
if (!foundChoice_1 && when_1("LinkStyle", "")) {
tools.appendString("\n    ");
tools.putSaveValue("LinkStyle", "");
tools.appendString("\n  ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString("\n  ");
if (!foundChoice_1) {
tools.appendString("\n    ");
 tools.putSaveValue("LinkStyle", "class=\"" + tools.getParamValue("LinkStyle") + "\""); 
tools.appendString("\n  ");
}
tools.appendString("\n\n\n");
	boolean foundChoice_2 = false;
tools.appendString("\n");
if (!foundChoice_2 && when_2("pxRequestor.pyPegaDesignMode", "true")) {
tools.appendString("\n ");
choose_1();
tools.appendString("\n \n");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString("\n");
if (!foundChoice_2) {
tools.appendString("\n\n\n\n\n");
int iTotalNoOfPages = Integer.parseInt(tools.getSaveValue("totalPages"));
int iCurrentPage = Integer.parseInt(tools.getSaveValue("currentPageIndex"));
int iStartPage = (iCurrentPage%10==0)?(iCurrentPage-9):((iCurrentPage/10*10)+1);
int iEndPage = (iTotalNoOfPages>(iStartPage+9))?iStartPage+9:iTotalNoOfPages;

tools.appendString("\n");
	if (pega.isPreviewMode() || (areValsEqual(tools.getProperty("myParamPage.pyPageMode").getStringValue(), "Next Previous"))) {
tools.appendString("\n<input type=\"text\" name=\"pyGridActivePage\" id=\"pyGridActivePage\" onChange=\"Grids.getActiveGrid(event).gridPaginator(event,this.value)\" \nonkeydown=\"if(event.keyCode == 13 ) {  \tif(!pega.util.Event.isSafari)  \t{ event.cancelBubble = true;if(event.stopPropagation) event.stopPropagation(); } this.blur();  }else{ var charCode = (event.which) ? event.which : event.keyCode;     if (charCode > 31 && (charCode < 48 || charCode > 57) && (charCode < 96 || charCode > 105)) { \tif(!pega.util.Event.isSafari)  \t{ event.cancelBubble = true;if(event.stopPropagation) event.stopPropagation(); }         return false;     } }\" \nvalue='");
if (_jspx_meth_pega_getSaved__1(pageContext, "currentPageIndex")) {
	return;
}
tools.appendString("' size=\"3\"\naria-label='");

/* Field value Data-Admin-System-Settings .pyCaption Page */
if(tools.getStepPage() != null && "Data-Admin-System-Settings".equals(tools.getStepPage().getClassName())){
out.write("Page");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "Page")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_1);
tools.appendString(" ");
if (_jspx_meth_pega_getSaved__1(pageContext, "currentPageIndex")) {
	return;
}
tools.appendString(" ");

/* Field value Data-Admin-System-Settings .pyCaption of */
if(tools.getStepPage() != null && "Data-Admin-System-Settings".equals(tools.getStepPage().getClassName())){
out.write("of");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "of")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_2);
tools.appendString(" ");
out.print(iTotalNoOfPages);
tools.appendString(".'\n/>\n");
	}
tools.appendString("\n   \n");
	if (pega.isPreviewMode() || (areValsEqual(tools.getProperty("myParamPage.pyPageMode").getStringValue(), "Drop-Down"))) {
tools.appendString("\n\n");
int iTotalRecords = Integer.parseInt(tools.getSaveValue("totalRecords"));
tools.appendString("\n<select onChange=\"Grids.getActiveGrid(event).gridPaginator(event,this.value);\" name=\"pyGridActivePage\" id=\"pyGridActivePage\">\n\t");
for(int i=1; i<=iTotalNoOfPages; i++){
	int iPageRange = Integer.parseInt(tools.getSaveValue("pyPageSize"));  
	int iStartIndex = (i-1)*iPageRange+1;
	int iEndIndex = (i==iTotalNoOfPages)?iTotalRecords:(iStartIndex+iPageRange-1);
	
tools.appendString("\n\t<option id=\"");
out.print(i);
tools.appendString("\" value=\"");
out.print(i);
tools.appendString("\" ");
	if (pega.isPreviewMode() || (i==iCurrentPage)) {
tools.appendString(" selected ");
	}
tools.appendString(">");
out.print(iStartIndex);
tools.appendString("-");
out.print(iEndIndex);
tools.appendString("</option>\n\t");
}
tools.appendString("\n</select>\n");
	}
tools.appendString("\n");
	if (pega.isPreviewMode() || (areValsEqual(tools.getProperty("myParamPage.pyPageMode").getStringValue(), "Numeric"))) {
tools.appendString("\n\t");

	for(int i=iStartPage; i<=iEndPage; i++){
	if (pega.isPreviewMode() || (i!=iCurrentPage)) {
tools.appendString("<a href=\"#\" onClick=\"Grids.getActiveGrid(event).gridPaginator(event,'");
out.print(i);
tools.appendString("');return false;\" aria-label='");

/* Field value Data-Admin-System-Settings .pyCaption Page */
if(tools.getStepPage() != null && "Data-Admin-System-Settings".equals(tools.getStepPage().getClassName())){
out.write("Page");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "Page")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_1);
tools.appendString(" ");
out.print(i);
tools.appendString("'>");
out.print(i);
tools.appendString(" </a>");
	}
	if (pega.isPreviewMode() || (i==iCurrentPage)) {
tools.appendString(" <a href=\"#\" onclick=\"return false;\" class=\"inactiveLink\" id=\"pyGridActivePage\" style=\"font-weight:700;\" aria-label='");

/* Field value Data-Admin-System-Settings .pyCaption Current Page. Page */
out.write("Current Page. Page");
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_3);
tools.appendString(" ");
out.print(i);
tools.appendString(" ");

/* Field value Data-Admin-System-Settings .pyCaption of */
if(tools.getStepPage() != null && "Data-Admin-System-Settings".equals(tools.getStepPage().getClassName())){
out.write("of");
}else{
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "of")) {
	return;
}

}	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_FIELDVALUE, showMeParams_2);
tools.appendString(" ");
out.print(iTotalNoOfPages);
tools.appendString("'>");
out.print(i);
tools.appendString(" </a>");
	}
}
tools.appendString("\n\n");
	}
tools.appendString("\n\n");
	if (pega.isPreviewMode() || (areValsEqual(tools.getProperty("myParamPage.pyPageMode").getStringValue(), "First X Results"))) {
tools.appendString("\n\t");

		String currentDisplay = tools.getSaveValue("currentDisplay");
		int recordsInCurrentPage = 0;
		try{
		recordsInCurrentPage = Integer.parseInt(tools.getSaveValue("recordsInCurrentPage"));  
		}catch (Exception e){}

	
tools.appendString("\n");
	boolean foundChoice_3 = false;
tools.appendString("\n");
if (!foundChoice_3 && (pega.isPreviewMode() || (currentDisplay.equals("First X Results")))) {
tools.appendString("<a id=\"pyGridActivePage\" ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_p_r__1(pageContext, "$save(LinkStyle)", "literal")) {
	return;
}
tools.appendString("  href=\"#\" onClick=\"Grids.getActiveGrid(event).gridPaginator(event,'Show All');return false;\">");
out.print( tools.getLocalizedTextForString("pyButtonLabel", "Show All") );
tools.appendString("</a>");

foundChoice_3 = !pega.isPreviewMode();
}
if (!foundChoice_3 && (pega.isPreviewMode() || (currentDisplay.equals("Show All")))) {
tools.appendString("<a id=\"pyGridActivePage\" ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_p_r__1(pageContext, "$save(LinkStyle)", "literal")) {
	return;
}
tools.appendString(" href=\"#\" onClick=\"Grids.getActiveGrid(event).gridPaginator(event,'First X Results');return false;\">");
out.print( tools.getLocalizedTextForString("pyButtonLabel", "First") );
tools.appendString(" ");
out.print( recordsInCurrentPage );
tools.appendString(" ");
out.print( tools.getLocalizedTextForString("pyButtonLabel", "Results") 
		);
tools.appendString("</a>");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString("\n\n\n\n");
	}
tools.appendString("\n\n");
}
tools.appendString("\n");
}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Data-Admin-System-Settings.pyCaption", new LiteweightPropertyDefinition("Data-Admin-System-Settings", "pyCaption", "siN", false, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZGRIDACTIVEPAGE #20180713T133437.729 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Gadgets");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzGridActivePage");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZGRIDACTIVEPAGE #20180713T133437.729 GMT", "pzGridActivePage", "Pega-Gadgets", "08-01-01", "20180713T133437.729 GMT");
}
