package com.pegarules.generated.html;
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
 * Builds JSP stream RULE-OBJ-LISTVIEW!LISTVIEWPAGINATION.
 */
public class ra_stream_listviewpagination_a89283b1e83a40c9106d6b4d9bbb73fa extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_HTML.ListViewPagination.Rule_Obj_ListView.Stream");
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
	public ra_stream_listviewpagination_a89283b1e83a40c9106d6b4d9bbb73fa(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "17d3767539345ea8da6354b41c724ede6ebf6df6";
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
/* Instance RULE-OBJ-HTML RULE-OBJ-LISTVIEW LISTVIEWPAGINATION #20180713T134253.120 GMT	Pega-Reporting:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML RULE-OBJ-LISTVIEW LISTVIEWPAGINATION #20180713T134253.120 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML RULE-OBJ-LISTVIEW LISTVIEWPAGINATION #20180713T134253.120 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-HTML");
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
/* end RULE-OBJ-HTML RULE-OBJ-LISTVIEW LISTVIEWPAGINATION #20180713T134253.120 GMT */
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
	"Rule-Obj-HTML:LISTVIEWPAGINATION", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Property:PYPAGINGALIGNMENT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("LISTVIEWPAGINATION","Rule-Obj-HTML","RULE-OBJ-LISTVIEW",false,"","Pega-Reporting","08-01-01","RULE-OBJ-HTML RULE-OBJ-LISTVIEW LISTVIEWPAGINATION #20180713T134253.120 GMT","!LISTVIEWPAGINATION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1753020777), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-HTML","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYPAGINGALIGNMENT","Rule-Obj-Property","EMBED-LISTVIEWPAGINATION",true,"Embed-ListViewPagination","Pega-WB","08-01-01","RULE-OBJ-PROPERTY EMBED-LISTVIEWPAGINATION PYPAGINGALIGNMENT #20180713T131455.267 GMT","!PYPAGINGALIGNMENT",true,false,"ABSOLUTE_IS_NOT_PRIMARY",0)
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
//	RULE-OBJ-HTML RULE-OBJ-LISTVIEW LISTVIEWPAGINATION #20180713T134253.120 GMT:20180713T134253.120 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-OBJ-PROPERTY EMBED-LISTVIEWPAGINATION PYPAGINGALIGNMENT #20180713T131455.267 GMT:20180713T131455.267 GMT
//	RULE-OBJ-PROPERTY EMBED-LISTVIEWPAGINATION PYPAGINGALIGNMENT #20180713T131455.267 GMT:20180713T131455.267 GMT
//	RULE-OBJ-PROPERTY EMBED-LISTVIEWPAGINATION PYPAGINGALIGNMENT #20180713T131455.267 GMT:20180713T131455.267 GMT
//	RULE-OBJ-PROPERTY EMBED-LISTVIEWPAGINATION PYPAGINGALIGNMENT #20180713T131455.267 GMT:20180713T131455.267 GMT
//	RULE-OBJ-PROPERTY EMBED-LISTVIEWPAGINATION PYPAGINGALIGNMENT #20180713T131455.267 GMT:20180713T131455.267 GMT
//	RULE-OBJ-PROPERTY EMBED-LISTVIEWPAGINATION PYPAGINGALIGNMENT #20180713T131455.267 GMT:20180713T131455.267 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "25c052151a4c61ac4666f54d3d158464";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-ListView";
	}
public String getAspect() {
return "Stream";
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
private void performStream_1() throws Throwable {

	//Paging Code. 
	//Gets parameters from pyPagingParams and converts them to integer data type, if required
	//Checks if the paging parameters received are valid
	//If valid, stores the required ones using save value directive (else) exits code
	//generate the pagination bar based upon page mode selected(numeric,nextprev or dropdown) 
	
	//Gets paging parameters
	ClipboardPage pgView = tools.findPage(tools.getParamValue("pyViewPageName"));
	String strPageCount = pgView.getString(".pyPagingParams.pyPageCount");
	String strPageIndex = pgView.getString(".pyPagingParams.pyPageIndex");
	String strPageSize = pgView.getString(".pyPagingParams.pyPagingPageSize");
	String strPagingWindow = pgView.getString(".pyPagingParams.pyPagingWindow");
	String strTotalResultCount = pgView.getString(".pyPagingParams.pyTotalResultCount");
	String strpyMore = pgView.getString(".pyPagingParams.pyMore");
	String strResultCount = pgView.getString(".pyPagingParams.pyResultCount");
	
	//Initialize paging parameters
	int npyPageCount = 0;
	int npyPageIndex = 0; 
	int npyPageSize = 0; 
	int npyTotalResultCount = 0; 
	int npyPagingWindow = 0; 
	boolean bEnableAccessibility = tools.getSaveValue("bEnableAccessibility").equalsIgnoreCase("true");
	
	//Convert paging parameters to integer data type
	try { npyPageCount = Integer.parseInt(strPageCount); } catch(NumberFormatException nfe) {}
	try { npyPageIndex = Integer.parseInt(strPageIndex); } catch(NumberFormatException nfe) {}
	try { npyPageSize = Integer.parseInt(strPageSize); } catch(NumberFormatException nfe) {}
	try { npyPagingWindow = Integer.parseInt(strPagingWindow); } catch(NumberFormatException nfe) {}
	try { npyTotalResultCount = Integer.parseInt(strTotalResultCount); } catch(NumberFormatException nfe) {}

	//Check if parameters recieved can form a valid pagination bar
	boolean bNoResults = true;
	if(strResultCount == null || strResultCount.equals("0"))
		bNoResults = false;
	boolean bNotValidPagination = false;
	
	boolean bPreviewMode = tools.getParamValue("PreViewMode").equals("true")?true:false;
	tools.putSaveValue("bNotValidPagination","false");
	if(npyPageIndex == 0 || npyPageSize == 0 || npyTotalResultCount == 0 || !bNoResults  || bPreviewMode) {
		bNotValidPagination = true;
		tools.putSaveValue("bNotValidPagination","true");
	}
	
	//If valid pagination bar can be created, store values needed using save directive
	if(!bNotValidPagination) {
		String strFirstPage = "1";
		String strPrevPage = (npyPageIndex-1) + "";
		String strNextPage = (npyPageIndex+1) + "";
		String strLastPage = npyPageCount + "";

		if((npyPageIndex-1) < 1) strPrevPage = "1";
		if((npyPageIndex+1) > npyPageCount) strNextPage = npyPageCount+"";
	
		tools.putSaveValue("npyPageCount",npyPageCount+"");
		tools.putSaveValue("npyPageIndex",npyPageIndex+"");
		tools.putSaveValue("strFirstPage",strFirstPage);
		tools.putSaveValue("strPrevPage",strPrevPage);
		tools.putSaveValue("strNextPage",strNextPage);
		tools.putSaveValue("strLastPage",strLastPage);
		tools.putSaveValue("ViewingText",tools.getLocalizedTextForString("pyCaption","Viewing"));
		
		int nMaxRecords = ((npyPageIndex % npyPagingWindow) + 1) * npyPageSize * npyPagingWindow;
		int numWindows = ((npyPageIndex -1) / npyPagingWindow) ;
		int nPageStart = (numWindows * npyPagingWindow) + 1 ;
		int nPageEnd =  npyPageCount ;
		int nTotalRecords = nPageEnd * npyPageSize;
		String strPagingMode = pgView.getString(".pyPagingParams.pyPagingMode");
		if(strPagingMode != null) {
			tools.putSaveValue("strPagingMode",strPagingMode);
			//If paging mode is numeric, generate links and store in strLinks variable
			if(strPagingMode.equals("Numeric")) {
				StringBuffer strLinks = new StringBuffer();
				if(npyPageIndex == nPageStart) {
					if(npyPageIndex > npyPagingWindow && ((npyPageCount-npyPagingWindow-1) >= 0))
						strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" ><span class='pagingLinksPadding'><a class=\"pagingLinks\" href='#' onclick='javascript:navigatePagination("+ (npyPageIndex-1) + ",null,event)' title='"+tools.getSaveValue("PreviousPageTooltip")+"'> " + tools.getSaveValue("PreviousPageTxt") + " </a> </span> </td>");
				}
				else
					strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" ><span class='pagingLinksPadding'><a class=\"pagingLinks\" href='#' onclick='javascript:navigatePagination("+ (npyPageIndex-1) + ",null,event)' title='"+tools.getSaveValue("PreviousPageTooltip")+"'> " + tools.getSaveValue("PreviousPageTxt") + " </a> </span> </td>");
				if(npyPageIndex > npyPagingWindow && ((npyPageCount-npyPagingWindow-1) >= 0))
					if(bEnableAccessibility){
						strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" ><span class='pagingLinksPadding'> <a class=\"pagingLinks\" href='#' onclick='javascript:navigatePagination("+ (nPageStart-1) + ",null,event)' title='"+tools.getSaveValue("PreviousWindowTooltip")+"'> <span class='hiddenContent'>"+tools.getLocalizedTextForString("pyCaption","View page")+" "+(nPageStart-1)+"</span>. . . </a> </span> </td>");
					} else {
					strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" ><span class='pagingLinksPadding'> <a class=\"pagingLinks\" href='#' onclick='javascript:navigatePagination("+ (nPageStart-1) + ",null,event)' title='"+tools.getSaveValue("PreviousWindowTooltip")+"'> . . . </a> </span> </td>");
					}
							
				for(int i=nPageStart;i<=nPageEnd;i++) {
					if(npyPageIndex == i)
						strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" ><span class='pagingLinksPaddingUnderline'>"+ 
PRNumberFormat.format(null,PRNumberFormat.DEFAULT_INTEGER,false,null, i) + "</span> &nbsp; ");
					else{
						if(bEnableAccessibility){					
							strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" ><span class='pagingLinksPadding'><a class=\"pagingLinks\" href='#' onclick='javascript:navigatePagination("+ i + ",null,event)' title ='"+i+"'><span class='hiddenContent'>"+tools.getLocalizedTextForString("pyCaption","View page")+"</span>"+ i + "</a> </span> ");
						} else {
						strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" ><span class='pagingLinksPadding'><a class=\"pagingLinks\" href='#' onclick='javascript:navigatePagination("+ i + ",null,event)' title ='"+i+"'>"+ PRNumberFormat.format(null,PRNumberFormat.DEFAULT_INTEGER,false,null, i) + "</a> </span> ");
				}
					}
				}
				if(strpyMore != null && strpyMore.equals("true")){
						if(bEnableAccessibility){	
							strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" > <span class='pagingLinksPadding'><a class=\"pagingLinks\" href='#' onclick='javascript:navigatePagination("+ (nPageEnd+1) + ",null,event)' title='"+tools.getSaveValue("NextWindowTooltip")+"'> <span class='hiddenContent'>"+tools.getLocalizedTextForString("pyCaption","View page")+" "+(nPageEnd+1)+"</span>. . . </a> </span> </td>");
						} else {
						strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" > <span class='pagingLinksPadding'><a class=\"pagingLinks\" href='#' onclick='javascript:navigatePagination("+ (nPageEnd+1) + ",null,event)' title='"+tools.getSaveValue("NextWindowTooltip")+"'> . . . </a> </span> </td>");
						}
				}
				if(npyPageIndex == nPageEnd) {
					if(strpyMore != null && strpyMore.equals("true"))
						strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" > <span class='pagingLinksPadding'> <a class=\"pagingLinks\" href='#' onclick='javascript:navigatePagination("+ (npyPageIndex+1) + ",null,event)' title='"+tools.getSaveValue("NextPageTooltip")+"'> " + tools.getSaveValue("NextPageTxt") + " </a> </span> </td>");
				}
				else					
					strLinks.append("<td	nowrap class=\"pageTabTitleBarLabelStyle\" ><span class='pagingLinksPadding'><a class=\"pagingLinks\" href='#' onclick='javascript:navigatePagination("+ (npyPageIndex+1) + ",null,event)' title='"+tools.getSaveValue("NextPageTooltip")+"'> " + tools.getSaveValue("NextPageTxt") + " </a> </span> </td>");
				tools.putSaveValue("strLinks",strLinks.toString());
			} else if(pgView.getString(".pyPagingParams.pyPagingMode").equals("Drop_Down")) {
				tools.putSaveValue("strPagingMode",strPagingMode);
				StringBuffer strOptions = new StringBuffer();
				for(int i=1;i<=npyPageCount;i++) {
					strOptions.append("<option value=\"" + i + "\" ");
					if(i == npyPageIndex ) strOptions.append(" selected ");
					int pageStart = (npyPageSize*(i-1))+1;
					int pageEnd = (npyPageSize*(i-1))+ npyPageSize;
					if(pageEnd > npyTotalResultCount) pageEnd = npyTotalResultCount;
					strOptions.append(">"+pageStart+" - "+pageEnd +"</option> ");
				}
				tools.putSaveValue("strOptions",strOptions.toString());
			}
		}
	}

tools.appendString(" ");
	if (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue("bNotValidPagination"), "false"))) {
tools.appendString(" ");
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue("strPagingMode"), "Numeric")))) {
tools.appendString("  <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" rid=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(paginatorid)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(paginatorid)")) {
	return;
}
tools.appendString("\"> <tr> ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || tools.getSaveValue("bPaginationBottom").equals("true"))) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabBottomLeft\" id=\"navLeft\"><span>&nbsp;</span></td> ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabLeft dataLabelWrite\" id=\"navLeft\"><span>&nbsp;</span></td> ");
}
tools.appendString("  ");
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || tools.getSaveValue("bPaginationBottom").equals("true"))) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabBottomMiddle\" id=\"navMiddle\" align=\"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pyPagingParams.pyPagingAlignment", "normal")) {
	return;
}
tools.appendString("\"> ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabMiddle\" id=\"navMiddle\" align=\"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pyPagingParams.pyPagingAlignment", "normal")) {
	return;
}
tools.appendString("\"> ");
}
tools.appendString("  <table cellpadding=\"0\" cellspacing=\"0\"> <tr> ");
 
					tools.appendString(tools.getSaveValue("strLinks"));
				 
tools.appendString(" </tr> </table> </td> ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || tools.getSaveValue("bPaginationBottom").equals("true"))) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabBottomRight\" id=\"navRight\"><span>&nbsp;</span></td> ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabRight dataLabelWrite\" id=\"navRight\"><span>&nbsp;</span></td> ");
}
tools.appendString("  </tr> </table> ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue("strPagingMode"), "NextPrev")))) {
tools.appendString("  <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" rid=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(paginatorid)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(paginatorid)")) {
	return;
}
tools.appendString("\"> <tr> ");
	boolean foundChoice_5 = false;
tools.appendString(" ");
if (!foundChoice_5 && (pega.isPreviewMode() || tools.getSaveValue("bPaginationBottom").equals("true"))) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabBottomLeft\" id=\"navLeft\"><span>&nbsp;</span></td> ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabLeft dataLabelWrite\" id=\"navLeft\"><span>&nbsp;</span></td> ");
}
tools.appendString("  ");
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || tools.getSaveValue("bPaginationBottom").equals("true"))) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabBottomMiddle\" id=\"navMiddle\" align=\"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pyPagingParams.pyPagingAlignment", "normal")) {
	return;
}
tools.appendString("\"> ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabMiddle\" id=\"navMiddle\" align=\"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pyPagingParams.pyPagingAlignment", "normal")) {
	return;
}
tools.appendString("\"> ");
}
tools.appendString("  <table cellpadding=\"0\" cellspacing=\"0\"> <tr> <td class=\"dataValueWrite\" style=\"height: 15px; padding-right: 6px;\"> <input type='image' title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(FirstPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" alt=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(FirstPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" class=\"iconPageTabCoverNavFirst\" onmouseover=\"this.className='iconPageTabCoverNavFirst_on'\" onmouseout=\"this.className='iconPageTabCoverNavFirst'\" src='webwb/zblankimage.gif' onclick=\"navigatePagination(");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strFirstPage)", "normal")) {
	return;
}
tools.appendString(",null,event);return false;\"/> </td> <td class=\"dataValueWrite\" style=\"height: 15px; padding-right: 12px;\"> <input type='image' title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(PreviousPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" alt=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(PreviousPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" class=\"iconPageTabCoverNavPrevious\" onmouseover=\"this.className='iconPageTabCoverNavPrevious_on'\" onmouseout=\"this.className='iconPageTabCoverNavPrevious'\" src='webwb/zblankimage.gif' onclick=\"navigatePagination(");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strPrevPage)", "normal")) {
	return;
}
tools.appendString(",null,event);return false;\"/> </td> <td class=\"dataValueWrite\" style=\"height: 15px;\"> <label>");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(PagingPageTxt)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(PagingPageTxt)")) {
	return;
}
tools.appendString("</label> </td> <td class=\"dataValueWrite\" style=\"height: 15px; padding-left: 2px; padding-right: 2px;\"> ");
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || bEnableAccessibility)) {
tools.appendString(" <input type=text onblur=\"navigatePagination(this.value,'numeric',event)\" value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(npyPageIndex)", "NORMAL")) {
	return;
}
tools.appendString("\" size=5 name=\"text1\" aria-label='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ViewingText)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(ViewingText)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(PagingPageTxt)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(PagingPageTxt)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(npyPageIndex)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(npyPageIndex)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(PagingPageofTxt)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(PagingPageofTxt)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(npyPageCount)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(npyPageCount)")) {
	return;
}
tools.appendString("'> ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7) {
tools.appendString(" <input type=text onblur=\"navigatePagination(this.value,'numeric',event)\" value=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(npyPageIndex)", "NORMAL")) {
	return;
}
tools.appendString("\" size=5 name=\"text1\"> ");
}
tools.appendString("  </td> <td class=\"dataValueWrite\" style=\"height: 15px; padding-left: 2px; padding-right: 2px;\"> <label>");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(PagingPageofTxt)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(PagingPageofTxt)")) {
	return;
}
tools.appendString(" </label> </td> <td class=\"dataValueWrite\" style=\"height: 15px; padding-left: 2px; padding-right: 2px;\"> <label>");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(npyPageCount)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(npyPageCount)")) {
	return;
}
tools.appendString("</label> </td> <td class=\"dataValueWrite\" style=\"height: 15px; padding-left: 12px;\"> <input type='image' title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(NextPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" alt=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(NextPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" class=\"iconPageTabCoverNavNext\" onmouseover=\"this.className='iconPageTabCoverNavNext_on'\" onmouseout=\"this.className='iconPageTabCoverNavNext'\" src='webwb/zblankimage.gif' onclick=\"navigatePagination(");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strNextPage)", "normal")) {
	return;
}
tools.appendString(",null,event);return false;\"/> </td> <td class=\"dataValueWrite\" style=\"height: 15px; padding-left: 6px;\"> <input type='image' title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(LastPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" alt=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(LastPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" class=\"iconPageTabCoverNavLast\" onmouseover=\"this.className='iconPageTabCoverNavLast_on'\" onmouseout=\"this.className='iconPageTabCoverNavLast'\" src='webwb/zblankimage.gif' onclick=\"navigatePagination(");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strLastPage)", "normal")) {
	return;
}
tools.appendString(",null,event);return false;\"/> </td> </tr> </table> </td> ");
	boolean foundChoice_8 = false;
tools.appendString(" ");
if (!foundChoice_8 && (pega.isPreviewMode() || tools.getSaveValue("bPaginationBottom").equals("true"))) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabBottomRight\" id=\"navRight\"><span>&nbsp;</span></td> ");

foundChoice_8 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_8) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabRight dataLabelWrite\" id=\"navRight\"><span>&nbsp;</span></td> ");
}
tools.appendString("  </tr> </table> ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1 && (pega.isPreviewMode() || (areValsEqual(tools.getSaveValue("strPagingMode"), "Drop_Down")))) {
tools.appendString(" <!-- Drop-Down Pagination Bar Code goes here --> <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" rid=\"");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(paginatorid)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(paginatorid)")) {
	return;
}
tools.appendString("\"> <tr> ");
	boolean foundChoice_9 = false;
tools.appendString(" ");
if (!foundChoice_9 && (pega.isPreviewMode() || tools.getSaveValue("bPaginationBottom").equals("true"))) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabBottomLeft\" id=\"navLeft\"><span>&nbsp;</span></td> ");

foundChoice_9 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_9) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabLeft dataLabelWrite\" id=\"navLeft\"><span>&nbsp;</span></td> ");
}
tools.appendString("  ");
	boolean foundChoice_10 = false;
tools.appendString(" ");
if (!foundChoice_10 && (pega.isPreviewMode() || tools.getSaveValue("bPaginationBottom").equals("true"))) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabBottomMiddle\" id=\"navMiddle\" align=\"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pyPagingParams.pyPagingAlignment", "normal")) {
	return;
}
tools.appendString("\"> ");

foundChoice_10 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_10) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabMiddle\" id=\"navMiddle\" align=\"");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__2(pageContext, ".pyPagingParams.pyPagingAlignment", "normal")) {
	return;
}
tools.appendString("\"> ");
}
tools.appendString("  <table cellpadding=\"0\" cellspacing=\"0\"> <tr> <td class=\"dataValueWrite\" style=\"height: 15px; padding-right: 6px;\"> <input type='image' title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(FirstPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" alt=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(FirstPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" class=\"iconPageTabCoverNavFirst\" onmouseover=\"this.className='iconPageTabCoverNavFirst_on'\" onmouseout=\"this.className='iconPageTabCoverNavFirst'\" src='webwb/zblankimage.gif' onclick=\"navigatePagination(");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strFirstPage)", "normal")) {
	return;
}
tools.appendString(",null,event);return false;\"/> </td> <td class=\"dataValueWrite\" style=\"height: 15px; padding-right: 12px;\"> <input type='image' title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(PreviousPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" alt=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(PreviousPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" class=\"iconPageTabCoverNavPrevious\" onmouseover=\"this.className='iconPageTabCoverNavPrevious_on'\" onmouseout=\"this.className='iconPageTabCoverNavPrevious'\" src='webwb/zblankimage.gif' onclick=\"navigatePagination(");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strPrevPage)", "normal")) {
	return;
}
tools.appendString(",null,event);return false;\"/> </td> <td class=\"dataValueWrite\" style=\"height: 15px; padding-right: 2px; padding-left: 2px;\"> <label>");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(PagingRowsTxt)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(PagingRowsTxt)")) {
	return;
}
tools.appendString("</label> ");
	boolean foundChoice_11 = false;
tools.appendString(" ");
if (!foundChoice_11 && (pega.isPreviewMode() || bEnableAccessibility)) {
tools.appendString(" <select id='SELECT' onchange='navigatePagination(this.value,null,event)' aria-label='");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(ViewingText)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(ViewingText)")) {
	return;
}
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$save(PagingRowsTxt)"
 */
if (_jspx_meth_pega_reference__1(pageContext, "$save(PagingRowsTxt)")) {
	return;
}
tools.appendString("'> ");

foundChoice_11 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_11) {
tools.appendString(" <select id='SELECT' onchange='navigatePagination(this.value,null,event)'> ");
}
tools.appendString("  ");
 
					tools.appendString(tools.getSaveValue("strOptions"));
				 
tools.appendString(" </select> </td> <td class=\"dataValueWrite\" style=\"height: 15px; padding-left: 12px;\"> <input type='image' title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(NextPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" alt=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(NextPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" class=\"iconPageTabCoverNavNext\" onmouseover=\"this.className='iconPageTabCoverNavNext_on'\" onmouseout=\"this.className='iconPageTabCoverNavNext'\" src='webwb/zblankimage.gif' onclick=\"navigatePagination(");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$save(strNextPage)", "normal")) {
	return;
}
tools.appendString(",null,event);return false;\"/> </td> <td class=\"dataValueWrite\" style=\"height: 15px; padding-left: 6px;\"> <input type='image' title=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(LastPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" class=\"iconPageTabCoverNavLast\" alt=\"");

/*
 * reference tag
 * Cannot inline because: mode is "NORMAL"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(LastPageTooltip)", "NORMAL")) {
	return;
}
tools.appendString("\" onmouseover=\"this.className='iconPageTabCoverNavLast_on'\" onmouseout=\"this.className='iconPageTabCoverNavLast'\" src='webwb/zblankimage.gif' onclick=\"navigatePagination(");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_pega_reference__2(pageContext, "$SAVE(strLastPage)", "normal")) {
	return;
}
tools.appendString(",null,event);return false;\"/> </td> </tr> </table> </td> ");
	boolean foundChoice_12 = false;
tools.appendString(" ");
if (!foundChoice_12 && (pega.isPreviewMode() || tools.getSaveValue("bPaginationBottom").equals("true"))) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabBottomRight\" id=\"navRight\"><span>&nbsp;</span></td> ");

foundChoice_12 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_12) {
tools.appendString(" <td nowrap=\"nowrap\" class=\"pageTabRight dataLabelWrite\" id=\"navRight\"><span>&nbsp;</span></td> ");
}
tools.appendString("  </tr> </table> ");

foundChoice_1 = !pega.isPreviewMode();
}
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
	oStreamProperties_1.put("pyClassName", "Rule-Obj-ListView");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-OBJ-HTML RULE-OBJ-LISTVIEW LISTVIEWPAGINATION #20180713T134253.120 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Reporting");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "ListViewPagination");
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
	if( pega != null ) pega.setTrackMissingProperties("Rule-Obj-HTML");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML RULE-OBJ-LISTVIEW LISTVIEWPAGINATION #20180713T134253.120 GMT", "Rule-Obj-ListView ListViewPagination", "Pega-Reporting", "08-01-01", "20180713T134253.120 GMT");
}
