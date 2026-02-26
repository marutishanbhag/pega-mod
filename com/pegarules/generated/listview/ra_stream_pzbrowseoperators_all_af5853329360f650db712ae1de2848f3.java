package com.pegarules.generated.listview;
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
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream DATA-ADMIN-OPERATOR-ID!PZBROWSEOPERATORS!ALL.
 */
public class ra_stream_pzbrowseoperators_all_af5853329360f650db712ae1de2848f3 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_ListView.pzBrowseOperators.ALL.Data_Admin_Operator_ID.Stream");
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
	public ra_stream_pzbrowseoperators_all_af5853329360f650db712ae1de2848f3(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return false;
	}
private static String pxUniqueStreamHash = "8c2cd6c01fa2c8fcf0119067faa8803e67110315";
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
/* Instance RULE-OBJ-LISTVIEW DATA-ADMIN-OPERATOR-ID PZBROWSEOPERATORS!ALL #20180713T142741.674 GMT	Pega-LP-OrgAndSecurity:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-LISTVIEW DATA-ADMIN-OPERATOR-ID PZBROWSEOPERATORS!ALL #20180713T142741.674 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-LISTVIEW DATA-ADMIN-OPERATOR-ID PZBROWSEOPERATORS!ALL #20180713T142741.674 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-ListView");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
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
/* end RULE-OBJ-LISTVIEW DATA-ADMIN-OPERATOR-ID PZBROWSEOPERATORS!ALL #20180713T142741.674 GMT */
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
	"Rule-HTML-Fragment:SHOWME-VIEWINSERT", 
	"Rule-Obj-ListView:PZBROWSEOPERATORS!ALL"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-ListView","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("SHOWME-VIEWINSERT","Rule-HTML-Fragment","",false,"","Pega-WB","08-01-01","RULE-HTML-FRAGMENT SHOWME-VIEWINSERT #20180713T131549.246 GMT","SHOWME-VIEWINSERT",true,false,"ABSOLUTE_CLASSLESS",965821247), 
		new DependentRuleInfo("PZBROWSEOPERATORS!ALL","Rule-Obj-ListView","DATA-ADMIN-OPERATOR-ID",false,"","Pega-LP-OrgAndSecurity","08-01-01","RULE-OBJ-LISTVIEW DATA-ADMIN-OPERATOR-ID PZBROWSEOPERATORS!ALL #20180713T142741.674 GMT","!PZBROWSEOPERATORS!ALL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-947734659)
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
//	RULE-OBJ-LISTVIEW DATA-ADMIN-OPERATOR-ID PZBROWSEOPERATORS!ALL #20180713T142741.674 GMT:20180713T142741.674 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-HTML-FRAGMENT SHOWME-VIEWINSERT #20180713T131549.246 GMT:20180713T131549.246 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "a7844aaa4523e2d8ebd18a0311d2d937";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Operator-ID";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a pega:withPage tag.
 */private boolean _jspx_meth_pega_withPage__3(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:withPage */
com.pega.pegarules.jsptags.WithPageTag _jspx_th_pega_withPage_ = (com.pega.pegarules.jsptags.WithPageTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithPageTag.class);
_jspx_th_pega_withPage_.setPageContext(pageContext);
_jspx_th_pega_withPage_.setParent(mParentTag);
_jspx_th_pega_withPage_.setName(aName);
int _jspx_eval_pega_withPage_ = _jspx_th_pega_withPage_.doStartTag();
if (_jspx_eval_pega_withPage_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_withPage_;
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("ListViewFooter", null, null, "Rule-Obj-HTML", null);
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_withPage_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withPage_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withPage_);
return false;
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN) throws Throwable {
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
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("PreViewMode", "true")) {
tools.appendString(" <tr id='tr_nodata'> ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" <tr class='lvFixedHeaderRow' style='height:100%;'> ");
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
/**
 * Implements a pega:withPage tag.
 */private boolean _jspx_meth_pega_withPage__2(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:withPage */
com.pega.pegarules.jsptags.WithPageTag _jspx_th_pega_withPage_ = (com.pega.pegarules.jsptags.WithPageTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithPageTag.class);
_jspx_th_pega_withPage_.setPageContext(pageContext);
_jspx_th_pega_withPage_.setParent(mParentTag);
_jspx_th_pega_withPage_.setName(aName);
int _jspx_eval_pega_withPage_ = _jspx_th_pega_withPage_.doStartTag();
if (_jspx_eval_pega_withPage_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_withPage_;
tools.appendString(" ");
tools.putSaveValue("bPaginationBottom", "false");
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("ListViewPagination", null, null, "Rule-Obj-HTML", null);
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_withPage_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withPage_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withPage_);
return false;
}
/**
 * Build stream RULE-HTML-FRAGMENT SHOWME-VIEWINSERT #20180713T131549.246 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
StringMap  keys_1 = new HashStringMap();
keys_1.putString("pxObjClass", "Rule-HTML-Fragment");
keys_1.putString("pyStreamName", "ShowMe-ViewInsert");
tools.appendStream(keys_1);
keys_1 = null;
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * Implements a pega:withPage tag.
 */private boolean _jspx_meth_pega_withPage__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:withPage */
com.pega.pegarules.jsptags.WithPageTag _jspx_th_pega_withPage_ = (com.pega.pegarules.jsptags.WithPageTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithPageTag.class);
_jspx_th_pega_withPage_.setPageContext(pageContext);
_jspx_th_pega_withPage_.setParent(mParentTag);
_jspx_th_pega_withPage_.setName(aName);
int _jspx_eval_pega_withPage_ = _jspx_th_pega_withPage_.doStartTag();
if (_jspx_eval_pega_withPage_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_withPage_;
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("ListViewHeader", null, null, "Rule-Obj-HTML", null);
tools.appendString(" ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_withPage_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withPage_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withPage_);
return false;
}
private void performStream_1() throws Throwable {
tools.appendString(" ");
if (_jspx_meth_pega_withPage__1(pageContext, "param.pyViewPageName")) {
	return;
}
tools.appendString(" ");
tools.putSaveValue("ViewFieldsCount", "5");
tools.appendString(" ");
String strKeyParams = "&pyClassName=$stream-definition(pyClassName)&pyStreamName=$stream-definition(pyStreamName)&pyOwner=$stream-definition(pyOwner)";tools.putSaveValue("keyParams", strKeyParams);
tools.appendString(" ");
pzAuto.putSaveRef("key", "$stream-definition(pxObjClass)=$stream-definition(pyClassName).$stream-definition(pyStreamName).$stream-definition(pyOwner)", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
pzAuto.putSaveRef("objClass", "$stream-definition(pxObjClass)", IAutoStreamRuntime.SAVE_SET);
tools.appendString(" ");
/* Include stream RULE-HTML-FRAGMENT SHOWME-VIEWINSERT #20180713T131549.246 GMT */
include_1();

tools.appendString(" ");
if (_jspx_meth_pega_withPage__2(pageContext, "param.pyViewPageName")) {
	return;
}
tools.appendString(" ");

ClipboardPage pgData = tools.findPage("pyViewOperators");	
if(pgData != null) { 
	tools.putSaveValue("QueryTimeStamp",pgData.getString("pyQueryTimeStamp"));	
	String strMessages = pgData.getMessagesObject().trim();	
	tools.putSaveValue("strMessages",strMessages); 
}

tools.putSaveValue("lvdefSortColumn0",".pyUserName");tools.putSaveValue("lvdefSortingOrder0","A");
tools.appendString(" <div class='lvTableContainer' id='lvdata1' height='100%;' > ");
 
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {
	tools.putSaveValue("strLVSummary","summary='"+StringUtils.crossScriptingFilter(tools.getSaveValue("strLVTitle"))+"'" ); 
 } 

tools.appendString(" ");

 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {
 tools.putSaveValue("strLVOnKeyDown","onkeydown='document_onkeydown()'" ); 
 } 

tools.appendString(" <table class='ViewTableStyle' id='ViewTable' tabindex='-1' ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strLVSummary)", "literal")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strLVOnKeyDown)", "literal")) {
	return;
}
tools.appendString(" cellpadding=0 cellspacing=0 hRows='true' onmouseover='return ViewTable_onmouseover()'> ");
choose_1();
tools.appendString("  ");

 /*For order of columns*/ 
 java.util.ArrayList lvColsToDisplay = new java.util.ArrayList(); 
 String strDisplayCols = com.pega.pegarules.pub.util.StringUtils.crossScriptingFilter(tools.getParamValue("lv_displaycols")); 
 if(!strDisplayCols.equals("")) { 
	String[] t_cols = strDisplayCols.split("_");
	for (int x=0; x<t_cols.length; x++) {
		lvColsToDisplay.add(t_cols[x]);
	}
 }

tools.appendString(" ");
  
 int lvFilterRecordCount = 0;  
 /* For storing html properties with paramters*/  
 ParameterPage parampgHTML0= new ParameterPage();
 ParameterPage parampgHTML1= new ParameterPage();
 ParameterPage parampgHTML2= new ParameterPage();
 ParameterPage parampgHTML3= new ParameterPage();
 ParameterPage parampgHTML4= new ParameterPage();
 ClipboardPage pgLV = tools.findPage(tools.getParamValue("pyViewPageName")); 

tools.appendString(" ");

 for (int colIndex=0; colIndex<5; colIndex++) { 
	int displayColIndex = colIndex; 
	int nColsSize = lvColsToDisplay.size(); 
	if(nColsSize > 0) { 
		if(colIndex < nColsSize) { 
			String strTmpIndex = (String)lvColsToDisplay.get(colIndex);
			try { 
				displayColIndex = Integer.parseInt(strTmpIndex)-1; 
			}catch(NumberFormatException e) {} 
		} else { 
			break; 
		} 
	} 
	
tools.appendString(" ");

		String strFilterColumn = tools.getParamValue("lv_filtercol" + displayColIndex ); 
		String coldatatype = pgLV.getProperty(".pyFields("+ (displayColIndex+1) + ").pyDataType").getStringValue();
		
tools.appendString(" ");
 tools.putSaveValue("strColSpan",""); tools.putSaveValue("strColOrderTip",""); tools.putSaveValue("strColOrder",""); tools.putSaveValue("strSortClass","");  boolean filterallowed = true;  String strDblClk= " ondblclick='javascript:window.event.cancelBubble = true;'"; 
tools.appendString(" ");
 if(displayColIndex == 0) { 
tools.appendString(" ");

		parampgHTML0.putString("openObjClass","Data-Admin-Operator-ID");
		parampgHTML0.putString("openRuleName",".pyUserIdentifier");
		parampgHTML0.putString("ellipsis","-1");
		
tools.appendString(" <th valign='top' scope='col' class='ViewHeaderStyle' id='th_FullName' width ='118px' ");
tools.putSaveValue("columnProperty", pgLV.getProperty(".pyFields(1).pySelectionProperty").getStringValue());
tools.appendString(" ");
out.print(strDblClk);
tools.appendString(" style='cursor: pointer;cursor: hand;' onclick='sortColumn(\".pyUserName\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' ><div class=\"lv_header_col\" colIndex=\"1\">");
 pega_reporting_listview.pzAddLVSortParamValues(".pyUserName",0,true, tools);  
 pega_reporting_listview.pzSaveLVParamValues(tools,"Full Name","", true);  
 pega_reporting_listview.pzAddLVSortSpanMarkUp(pgLV,1,tools,".pyUserName");  

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnCaption)", "literal")) {
	return;
}
tools.appendString(" <span nowrap='nowrap' class='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strSortClass)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strSortClass)")) {
	return;
}
tools.appendString("' style='width:12px;position:absolute;' title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(ImageToolTip)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(ImageToolTip)")) {
	return;
}
tools.appendString("'> </span> <span class='hiddenContent'>, ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColOrderTip)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(strColOrderTip)")) {
	return;
}
tools.appendString("</span></a></span></div> </th> ");
 } else if(displayColIndex == 1) { 
tools.appendString(" ");

		parampgHTML1.putString("openObjClass","Data-Admin-Operator-ID");
		parampgHTML1.putString("openRuleName",".pyUserIdentifier");
		parampgHTML1.putString("ellipsis","-1");
		
tools.appendString(" <th valign='top' scope='col' class='ViewHeaderStyle' id='th_OperatorID' width ='118px' ");
tools.putSaveValue("columnProperty", pgLV.getProperty(".pyFields(2).pySelectionProperty").getStringValue());
tools.appendString(" ");
out.print(strDblClk);
tools.appendString(" style='cursor: pointer;cursor: hand;' onclick='sortColumn(\".pyUserIdentifier\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' ><div class=\"lv_header_col\" colIndex=\"2\">");
 pega_reporting_listview.pzAddLVSortParamValues(".pyUserIdentifier",1,true, tools);  
 pega_reporting_listview.pzSaveLVParamValues(tools,"Operator ID","", true);  
 pega_reporting_listview.pzAddLVSortSpanMarkUp(pgLV,2,tools,".pyUserIdentifier");  

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnCaption)", "literal")) {
	return;
}
tools.appendString(" <span nowrap='nowrap' class='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strSortClass)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strSortClass)")) {
	return;
}
tools.appendString("' style='width:12px;position:absolute;' title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(ImageToolTip)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(ImageToolTip)")) {
	return;
}
tools.appendString("'> </span> <span class='hiddenContent'>, ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColOrderTip)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(strColOrderTip)")) {
	return;
}
tools.appendString("</span></a></span></div> </th> ");
 } else if(displayColIndex == 2) { 
tools.appendString(" <th valign='top' scope='col' class='ViewHeaderStyle' id='th_JobPosition/Title' width ='118px' ");
tools.putSaveValue("columnProperty", pgLV.getProperty(".pyFields(3).pySelectionProperty").getStringValue());
tools.appendString(" ");
out.print(strDblClk);
tools.appendString(" style='cursor: pointer;cursor: hand;' onclick='sortColumn(\".pyPosition\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' ><div class=\"lv_header_col\" colIndex=\"3\">");
 pega_reporting_listview.pzAddLVSortParamValues(".pyPosition",2,true, tools);  
 pega_reporting_listview.pzSaveLVParamValues(tools,"Job Position/Title","", true);  
 pega_reporting_listview.pzAddLVSortSpanMarkUp(pgLV,3,tools,".pyPosition");  

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnCaption)", "literal")) {
	return;
}
tools.appendString(" <span nowrap='nowrap' class='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strSortClass)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strSortClass)")) {
	return;
}
tools.appendString("' style='width:12px;position:absolute;' title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(ImageToolTip)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(ImageToolTip)")) {
	return;
}
tools.appendString("'> </span> <span class='hiddenContent'>, ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColOrderTip)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(strColOrderTip)")) {
	return;
}
tools.appendString("</span></a></span></div> </th> ");
 } else if(displayColIndex == 3) { 
tools.appendString(" ");

		parampgHTML3.putString("openObjClass","Data-Admin-Operator-AccessGroup");
		parampgHTML3.putString("noValueStyle","custom_NoValueStyleWarn");
		parampgHTML3.putString("noValueText","None");
		parampgHTML3.putString("noValueTooltip","NoAccessGroupDefinedForOperator");
		parampgHTML3.putString("openRuleName",".pyAccessGroup");
		parampgHTML3.putString("ellipsis","-1");
		
tools.appendString(" <th valign='top' scope='col' class='ViewHeaderStyle' id='th_AccessGroup' width ='118px' ");
tools.putSaveValue("columnProperty", pgLV.getProperty(".pyFields(4).pySelectionProperty").getStringValue());
tools.appendString(" ");
out.print(strDblClk);
tools.appendString(" style='cursor: pointer;cursor: hand;' onclick='sortColumn(\".pyAccessGroup\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' ><div class=\"lv_header_col\" colIndex=\"4\">");
 pega_reporting_listview.pzAddLVSortParamValues(".pyAccessGroup",3,true, tools);  
 pega_reporting_listview.pzSaveLVParamValues(tools,"Access Group","", true);  
 pega_reporting_listview.pzAddLVSortSpanMarkUp(pgLV,4,tools,".pyAccessGroup");  

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnCaption)", "literal")) {
	return;
}
tools.appendString(" <span nowrap='nowrap' class='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strSortClass)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strSortClass)")) {
	return;
}
tools.appendString("' style='width:12px;position:absolute;' title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(ImageToolTip)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(ImageToolTip)")) {
	return;
}
tools.appendString("'> </span> <span class='hiddenContent'>, ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColOrderTip)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(strColOrderTip)")) {
	return;
}
tools.appendString("</span></a></span></div> </th> ");
 } else if(displayColIndex == 4) { 
tools.appendString(" <th valign='top' scope='col' class='ViewHeaderStyle' id='th_LastSignOn' width ='118px' ");
tools.putSaveValue("columnProperty", pgLV.getProperty(".pyFields(5).pySelectionProperty").getStringValue());
tools.appendString(" ");
out.print(strDblClk);
tools.appendString(" style='cursor: pointer;cursor: hand;' onclick='sortColumn(\".pyLastSignon\",\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(QueryTimeStamp)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(QueryTimeStamp)")) {
	return;
}
tools.appendString("\",event)' ><div class=\"lv_header_col\" colIndex=\"5\">");
 pega_reporting_listview.pzAddLVSortParamValues(".pyLastSignon",4,true, tools);  
 pega_reporting_listview.pzSaveLVParamValues(tools,"Last Sign On","", true);  
 pega_reporting_listview.pzAddLVSortSpanMarkUp(pgLV,5,tools,".pyLastSignon");  

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strColumnCaption)", "literal")) {
	return;
}
tools.appendString(" <span nowrap='nowrap' class='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strSortClass)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strSortClass)")) {
	return;
}
tools.appendString("' style='width:12px;position:absolute;' title='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(ImageToolTip)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(ImageToolTip)")) {
	return;
}
tools.appendString("'> </span> <span class='hiddenContent'>, ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strColOrderTip)"
 */
if (_jspx_meth_p_r__1(pageContext, "$SAVE(strColOrderTip)")) {
	return;
}
tools.appendString("</span></a></span></div> </th> ");
 } 
tools.appendString(" ");
 } 
tools.appendString(" </tr> ");
	if (pega.isPreviewMode() || !(tools.getSaveValue("strMessages").length() > 0)) {
tools.appendString(" ");
tools.putSaveValue("HasData", "false");
tools.appendString(" ");
 String strAlternateStyle = ""; 
tools.appendString(" ");
/* pega:forEach */
com.pega.pegarules.jsptags.ForEachTag _jspx_th_pega_forEach__1 = (com.pega.pegarules.jsptags.ForEachTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ForEachTag.class);
_jspx_th_pega_forEach__1.setPageContext(pageContext);
_jspx_th_pega_forEach__1.setParent(mParentTag);
_jspx_th_pega_forEach__1.setName("pyViewOperators.pxResults");
int _jspx_eval_pega_forEach__1 = _jspx_th_pega_forEach__1.doStartTag();
if (_jspx_eval_pega_forEach__1 != Tag.SKIP_BODY) {
	if (_jspx_eval_pega_forEach__1 != Tag.EVAL_BODY_INCLUDE) {
		BodyContent bodyContent = pageContext.pushBody();
		out = bodyContent;
		_jspx_th_pega_forEach__1.setBodyContent(bodyContent);
		_jspx_th_pega_forEach__1.doInitBody();
	}	do {
final Tag prevParentTag_1 = mParentTag;
mParentTag = _jspx_th_pega_forEach__1;
tools.appendString(" ");
/* pega:withEmbedded */
com.pega.pegarules.jsptags.WithEmbeddedTag _jspx_th_pega_withEmbedded__1 = (com.pega.pegarules.jsptags.WithEmbeddedTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithEmbeddedTag.class);
_jspx_th_pega_withEmbedded__1.setPageContext(pageContext);
_jspx_th_pega_withEmbedded__1.setParent(mParentTag);
_jspx_th_pega_withEmbedded__1.setName("$this");
int _jspx_eval_pega_withEmbedded__1 = _jspx_th_pega_withEmbedded__1.doStartTag();
if (_jspx_eval_pega_withEmbedded__1 != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag_2 = mParentTag;
mParentTag = _jspx_th_pega_withEmbedded__1;
tools.appendString(" ");

	ClipboardPage pgCurRow = tools.getActive().getPageValue();	
	tools.putSaveValue("filterThisRow","false");	
		
tools.appendString(" ");
 if(strAlternateStyle.equals("")){ strAlternateStyle = ""; } else { strAlternateStyle = "";} 
 if(tools.getSaveValue("bEnableAccessibility").equals("true") && (tools.getActive().indexOf() == 1)) { tools.putSaveValue("strLVOnFocus","onfocus='scrollViewTable(event);'" ); } else {tools.putSaveValue("strLVOnFocus","" );  } 
 tools.putSaveValue("strTabIndex","tabIndex=0" );  
 if(tools.getSaveValue("bEnableAccessibility").equals("true") && (tools.getActive().indexOf() == 1)) { tools.putSaveValue("strLVOnFocus","onfocus='scrollViewTable(event);'" ); } else {tools.putSaveValue("strLVOnFocus","" );  } 
 tools.putSaveValue("strTabIndex","tabIndex=0" );  
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("ListView_ProcessFilteredInRow", null, null, null, null);
tools.appendString(" ");
tools.putSaveValue("HasData", "true");
tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (tools.getActive().indexOf() % 2) == 1)) {
tools.appendString(" <tr ");
 if(tools.getActive().indexOf() == 1 || tools.getSaveValue("strSetTabIndex").equalsIgnoreCase("true")) tools.appendString(tools.getSaveValue("strTabIndex")); 
tools.appendString(" rowIndex ='");
out.print( Integer.toString(tools.getActive().indexOf()) );
tools.appendString("' class='");
out.print( strAlternateStyle);
tools.appendString(" listTableRowStyle' ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strLVOnFocus)", "literal")) {
	return;
}
tools.appendString(" > ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (tools.getActive().indexOf() % 2) == 0)) {
tools.appendString(" <tr ");
 if(tools.getActive().indexOf() == 1 || tools.getSaveValue("strSetTabIndex").equalsIgnoreCase("true")) tools.appendString(tools.getSaveValue("strTabIndex")); 
tools.appendString(" rowIndex ='");
out.print( Integer.toString(tools.getActive().indexOf()) );
tools.appendString("' class='");
out.print( strAlternateStyle);
tools.appendString(" listTableRowShadedStyle' ");

/*
 * reference tag
 * Cannot inline because: mode is "literal"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$SAVE(strLVOnFocus)", "literal")) {
	return;
}
tools.appendString(" > ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" <tr class='");
out.print( strAlternateStyle);
tools.appendString("' rowIndex ='");
out.print( Integer.toString(tools.getActive().indexOf()) );
tools.appendString("' > ");
}
tools.appendString("  ");
 
		tools.putSaveValue("SelectionChecked"," checked "); 
		ClipboardPage pgRowSelected = tools.getActive().getPageValue(); 
		if(!pgRowSelected.getString(".pyRowSelected").equalsIgnoreCase("true"))  { 
			pgRowSelected.putString("pyRowSelected","false"); 
			tools.putSaveValue("SelectionChecked",""); 
		} 
	
tools.appendString(" ");
 for (int colIndex=0; colIndex<5; colIndex++) { 
	int displayColIndex = colIndex; 
	int nColsSize = lvColsToDisplay.size(); 
	if(nColsSize > 0) { 
		if(colIndex < nColsSize) { 
			String strTmpIndex = (String)lvColsToDisplay.get(colIndex);
			try { 
				displayColIndex = Integer.parseInt(strTmpIndex)-1; 
			}catch(NumberFormatException e) {} 
		} else { 
			break; 
		} 
	} 
tools.appendString(" ");

	if(displayColIndex == 0) { 
tools.appendString(" <td class='tdLeftStyle' width ='118px' tid='");
out.print(Integer.toString(tools.getActive().indexOf()));
tools.appendString("_1' id='");
out.print(Integer.toString(tools.getActive().indexOf()));
tools.appendString("_1'scope='row' ");
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {tools.appendString(" headers='th_FullName' ");} 
tools.appendString(" > ");
    
 ClipboardPage pgCurrentPage0 = tools.getActive().getPageValue();    
 ClipboardProperty cpTmpProp0 = pgCurrentPage0.getProperty(".pyUserName");    
com.pega.pegarules.pub.context.PRStackFrame frame0 = null;
 frame0 = ((com.pega.pegarules.priv.PegaAPI)tools).pushStackFrame("lvhml_format", parampgHTML0, false, false);
try 
{
 tools.appendProperty(cpTmpProp0,"pzRuleOpener",false);    
}
finally{ 
if (frame0 != null) 
((com.pega.pegarules.priv.PegaAPI)tools).popStackFrame(frame0, false);
}

tools.appendString(" </td> ");

	} else if(displayColIndex == 1) { 
tools.appendString(" <td class='tdLeftStyle' width ='118px' tid='");
out.print(Integer.toString(tools.getActive().indexOf()));
tools.appendString("_2' id='");
out.print(Integer.toString(tools.getActive().indexOf()));
tools.appendString("_2'");
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {tools.appendString(" headers='th_OperatorID' ");} 
tools.appendString(" > ");
    
 ClipboardPage pgCurrentPage1 = tools.getActive().getPageValue();    
 ClipboardProperty cpTmpProp1 = pgCurrentPage1.getProperty(".pyUserIdentifier");    
com.pega.pegarules.pub.context.PRStackFrame frame1 = null;
 frame1 = ((com.pega.pegarules.priv.PegaAPI)tools).pushStackFrame("lvhml_format", parampgHTML1, false, false);
try 
{
 tools.appendProperty(cpTmpProp1,"pzRuleOpener",false);    
}
finally{ 
if (frame1 != null) 
((com.pega.pegarules.priv.PegaAPI)tools).popStackFrame(frame1, false);
}

tools.appendString(" </td> ");

	} else if(displayColIndex == 2) { 
tools.appendString(" <td class='tdLeftStyle' width ='118px' tid='");
out.print(Integer.toString(tools.getActive().indexOf()));
tools.appendString("_3' id='");
out.print(Integer.toString(tools.getActive().indexOf()));
tools.appendString("_3'");
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {tools.appendString(" headers='th_JobPosition/Title' ");} 
tools.appendString(" > ");
    
 ClipboardPage pgCurrentPage2 = tools.getActive().getPageValue();    
 ClipboardProperty cpTmpProp2 = pgCurrentPage2.getProperty(".pyPosition");    
 tools.appendProperty(cpTmpProp2,"pzEllipsis",false);    

tools.appendString(" </td> ");

	} else if(displayColIndex == 3) { 
tools.appendString(" <td class='tdLeftStyle' width ='118px' tid='");
out.print(Integer.toString(tools.getActive().indexOf()));
tools.appendString("_4' id='");
out.print(Integer.toString(tools.getActive().indexOf()));
tools.appendString("_4'");
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {tools.appendString(" headers='th_AccessGroup' ");} 
tools.appendString(" > ");
    
 ClipboardPage pgCurrentPage3 = tools.getActive().getPageValue();    
 ClipboardProperty cpTmpProp3 = pgCurrentPage3.getProperty(".pyAccessGroup");    
com.pega.pegarules.pub.context.PRStackFrame frame3 = null;
 frame3 = ((com.pega.pegarules.priv.PegaAPI)tools).pushStackFrame("lvhml_format", parampgHTML3, false, false);
try 
{
 tools.appendProperty(cpTmpProp3,"pzRuleOpener",false);    
}
finally{ 
if (frame3 != null) 
((com.pega.pegarules.priv.PegaAPI)tools).popStackFrame(frame3, false);
}

tools.appendString(" </td> ");

	} else if(displayColIndex == 4) { 
tools.appendString(" <td class='tdLeftStyle' width ='118px' tid='");
out.print(Integer.toString(tools.getActive().indexOf()));
tools.appendString("_5' id='");
out.print(Integer.toString(tools.getActive().indexOf()));
tools.appendString("_5'");
 if(tools.getSaveValue("bEnableAccessibility").equals("true")) {tools.appendString(" headers='th_LastSignOn' ");} 
tools.appendString(" > ");
    
 ClipboardPage pgCurrentPage4 = tools.getActive().getPageValue();    
 ClipboardProperty cpTmpProp4 = pgCurrentPage4.getProperty(".pyLastSignon");    
		tools.appendProperty(cpTmpProp4,null,false);    

tools.appendString(" </td> ");
 } 
tools.appendString(" ");
 } 
tools.appendString(" </tr> ");
mParentTag = prevParentTag_2;
		int evalDoAfterBody = _jspx_th_pega_withEmbedded__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withEmbedded__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withEmbedded__1);
tools.appendString(" ");
mParentTag = prevParentTag_1;
		int evalDoAfterBody = _jspx_th_pega_forEach__1.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
	if (_jspx_eval_pega_forEach__1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
		out = pageContext.popBody();
	}
}
if (_jspx_th_pega_forEach__1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_forEach__1);
tools.appendString(" ");
	}
tools.appendString(" ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getSaveValue("strMessages").length() > 0)) {
tools.appendString(" <TR id='tr_nodata' class='listTableRowStyle'><TD class='tdLeftStyle' colspan='5' >");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(strMessages)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strMessages)")) {
	return;
}
tools.appendString("</TD></TR> ");
	
					ClipboardPage pgDataTmp1 = tools.findPage("pyViewOperators");	
					pgDataTmp1.clearMessages(); 
				
tools.appendString(" ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.findPage("pyViewOperators").getProperty(".pxResults").size() == 0)) {
tools.appendString(" <TR id='tr_nodata' class='listTableRowStyle'><TD class='tdLeftStyle' colspan='5' >");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$SAVE(NoMatchFoundMsg)"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(NoMatchFoundMsg)")) {
	return;
}
tools.appendString("</TD></TR> ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString("  </table> </div> ");
if (_jspx_meth_pega_withPage__3(pageContext, "param.pyViewPageName")) {
	return;
}
tools.appendString(" </div></div></div> ");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Data-Admin-Operator-ID");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-OBJ-LISTVIEW DATA-ADMIN-OPERATOR-ID PZBROWSEOPERATORS!ALL #20180713T142741.674 GMT");
	oStreamProperties_1.put("pyOwner", "ALL");
	oStreamProperties_1.put("pxObjClass", "Rule-Obj-ListView");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-LP-OrgAndSecurity");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzBrowseOperators");
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
	if( pega != null ) pega.setTrackMissingProperties("Rule-Obj-ListView");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-LISTVIEW DATA-ADMIN-OPERATOR-ID PZBROWSEOPERATORS!ALL #20180713T142741.674 GMT", "Data-Admin-Operator-ID pzBrowseOperators ALL", "Pega-LP-OrgAndSecurity", "08-01-01", "20180713T142741.674 GMT");
}
