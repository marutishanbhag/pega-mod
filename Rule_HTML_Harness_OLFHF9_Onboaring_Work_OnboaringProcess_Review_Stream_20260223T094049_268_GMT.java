package com.pegarules.generated.testgen;

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
import com.pega.pegarules.priv.runtime.ICellRuntime;
import com.pega.pegarules.priv.runtime.IControlRuntime;
import com.pega.pegarules.priv.runtime.IHarnessRuntime;
import com.pega.pegarules.priv.runtime.ILayoutRuntime;
import com.pega.pegarules.priv.runtime.IPackageRuntime;
import com.pega.pegarules.priv.runtime.ISectionRuntime;
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
 * Builds JSP stream .
 */
public class Rule_HTML_Harness_OLFHF9_Onboaring_Work_OnboaringProcess_Review_Stream_20260223T094049_268_GMT extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Harness.Review.OLFHF9_Onboaring_Work_OnboaringProcess.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 886976541;
private static boolean pz_isValidAssembly= true;
/** The current stream builder. */
	IHarnessRuntime pzHarness;
	ISectionRuntime pzSection;
	ILayoutRuntime pzLayout;
	ICellRuntime pzCell;
	IControlRuntime pzControl;

	IPackageRuntime pzPackageRuntime;

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
	public Rule_HTML_Harness_OLFHF9_Onboaring_Work_OnboaringProcess_Review_Stream_20260223T094049_268_GMT(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
		initAssemblyParameters(tools);
	}
public static Map<String, AssemblyParameters> getAssemblyParametersMap(StreamBuilderToolKit tools) {		
 initAssemblyParameters(tools);	
 Map<String, AssemblyParameters> clone = new HashMap<String, AssemblyParameters>();	
 clone.putAll(oAssemblyParamsMap);	
 return clone;
}
public static void initAssemblyParameters(StreamBuilderToolKit tools) { 
	try {
		if(oAssemblyParamsMap == null || oAssemblyParamsMap.isEmpty()){
			oAssemblyParamsMap = tools.getControlUtilities().getAssemblyParamsMap(oControlPathsMap, tools, oCellRuntimeParamsMap, pxUniqueStreamHash);
		if(oAssemblyParamsMap != null && !oAssemblyParamsMap.isEmpty()){
			oControlPathsMap = null;
			oCellRuntimeParamsMap = null;
		}
		}
	} catch(IllegalStateException e) {
	pz_isValidAssembly = false;
	}
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "536b90faead19c9c36dbf6b55330e17cba691bdc";
private boolean pxIsNonTemplateStream = false;
private char previousTemplatingStatus = '\0';
public void execute() {
	if(!pz_isValidAssembly){
	throw new PRRuntimeException("Invalid Section Assembly ");
	}
previousTemplatingStatus = '\0';
	pzAuto.beginStream(pega);
	initRequiredPages();
pageContext = pega.getJSPFactory().getPageContext(mHttpServlet, request, mStreamResponse, null, true, 0, true);
application = pageContext.getServletContext();
out = pageContext.getOut();
session = pageContext.getSession();
mStreamResponse.setContentType("text/html;charset=UTF-8");
try {
/*
 * Begin 
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Harness");
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
/* end  */
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
	"Rule-Obj-Property:PYCAPTION"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-HARNESS",true,"Rule-HTML-Harness","Pega-UIEngine","08-23-01","RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZASSEMBLEPREPROCESS #20230618T001616.622 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYCAPTION","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT","!PYCAPTION",true,false,"GUESS_IS_PRIMARY",1)
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
//	RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZASSEMBLEPREPROCESS #20230618T001616.622 GMT:20230618T001616.622 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYCAPTION #20180713T131156.091 GMT:20180713T131156.091 GMT
//	includeSectionBody_1(
//	addSectionForOfflinePackaging_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESHOWSTREAMINSERT--(STRINGBUFFER,BOOLEAN) #20180713T132451.012 GMT:20180713T132451.012 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDCUSTOMCSS2 #20230618T001619.119 GMT:20230618T001619.119 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDHTMLHEADER #20180713T133338.084 GMT:20180713T133338.084 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDHTMLMETA #20180713T133338.092 GMT:20180713T133338.092 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDOCSTATETRACK--() #20180713T133339.728 GMT:20180713T133339.728 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGB2D03618C4D6FCE3A07CB882EBEA3D958 #20201222T180835.601 GMT:20201222T180835.601 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEMODALDIALOG--(BOOLEAN) #20180713T133339.841 GMT:20180713T133339.841 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDELAZYLOAD #20180713T133341.208 GMT:20180713T133341.208 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATEHARNESS--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.407 GMT:20180713T133341.407 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION PORTAL GENERATELAYOUT--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20230618T001619.291 GMT:20230618T001619.291 GMT
//	RULE-UTILITY-FUNCTION PORTAL PZGENERATESTYLESANDSCRIPTS--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190128T113328.069 GMT:20190128T113328.069 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "85ef1b26fe8976bbc388715a4fe8b8ee";
	}

	public String getDefinitionAppliesToClass() {
		return "OLFHF9-Onboaring-Work-OnboaringProcess";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a pega:withReference tag.
 */private boolean _jspx_meth_pega_withReference__1(PageContext aPageContext, java.lang.String aName) throws Throwable {
/* pega:withReference */
com.pega.pegarules.jsptags.WithReferenceTag _jspx_th_pega_withReference_ = (com.pega.pegarules.jsptags.WithReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.WithReferenceTag.class);
_jspx_th_pega_withReference_.setPageContext(pageContext);
_jspx_th_pega_withReference_.setParent(mParentTag);
_jspx_th_pega_withReference_.setName(aName);
int _jspx_eval_pega_withReference_ = _jspx_th_pega_withReference_.doStartTag();
if (_jspx_eval_pega_withReference_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_withReference_;
tools.appendString(" <input type='hidden' id='pySpecialtyComponentData' name='");
tools.appendString("' value='' /> ");
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_withReference_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_withReference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_withReference_);
return false;
}
private boolean when_1(String aTest, String aName, boolean aJava) throws Throwable {
	return (WhenTag.evaluateWhen(pega, aTest, aName, aJava));
}
/**
 * Handles a choose tag.
 * @throws Throwable if there is an issue with a runtime tag handler
 */
private void choose_1() throws Throwable {
	boolean foundChoice = false;
tools.appendString(" ");
if (!foundChoice && when_1("pyPortal.pyDesktopType==\'Developer\' && pyPortal.pyDesktopSubType == \'Composite\'", null, false)) {
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pzPortalIcon", null, null, "Rule-HTML-Fragment", null);
tools.appendString(" ");

foundChoice = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice) {
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pyPortalIcon", null, null, "Rule-HTML-Fragment", null);
tools.appendString(" ");
}
}
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
/**
 * OnlyOnce condition: IncludeOptimizedStaticContentMiddle
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("IncludeOptimizedStaticContentMiddle")) {
pzAuto.emitIncludeStreamReference("pzOptimizedMiddleStaticContent", null, null, "Rule-HTML-Fragment", null);
}
}
/**
 * OnlyOnce condition: IncludeOptimizedStaticContentBottom
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_2() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("IncludeOptimizedStaticContentBottom")) {
pzAuto.emitIncludeStreamReference("pzOptimizedBottomStaticContent", null, null, "Rule-HTML-Fragment", null);
}
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",false);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_1","pzC11nReviewSection", secInfo);
}
public void buildWhiteList_1() {
Map<String, String> config;
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
}


public void includeSectionBody_1() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	
	
	String includedSectionName = "";includedSectionName = "pzC11nReviewSection";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void addSectionForOfflinePackaging_1() {
tools.putParamValue("bIsScreenLayout","true");
String strSectionPageProp="";
String strSectionPageClass="";
String currentRWMode = tools.getParamValue("ReadOnly");
if("".equals(strSectionPageProp)){ strSectionPageProp = tools.getStepPage().getName(); }
 tools.putParamValue("ReadOnly","0");
pzPackageRuntime.packageSection("pzC11nReviewSection", strSectionPageProp, null);
strSectionPageProp = "";
strSectionPageClass = "";
tools.putParamValue("bIsScreenLayout","");
 tools.putParamValue("ReadOnly",currentRWMode);
}
public void getMainPanelSection_1(){
tools.putParamValue("mainPanelSection","OLFHF9-Onboaring-Work-OnboaringProcess!pzC11nReviewSection");
}


public void elementModel_1() { 

	try {

 ClipboardPage pg_dec_PyDisplay = tools.findPage("Declare_pyDisplay");

 ClipboardProperty cp_tempPage = pg_dec_PyDisplay.getIfPresent("pyDisplay");

				 ClipboardPage pg_DisplayState = pg_dec_PyDisplay.getProperty("pyDCDisplayState").getPageValue();

  pg_DisplayState.getEntryHandle("pyActiveDocumentType");

 ClipboardPage pg_prevDisplay= null;

 String portalName = tools.findPage("pxThread").getString("pxPortal");

 if(cp_tempPage != null ){

 pg_prevDisplay = cp_tempPage.getPageValue(portalName);

}

 ClipboardPage pg_displayTemp = tools.findPage("pyDisplayTemp", true);

if(pg_displayTemp != null) {

				 pg_DisplayState.putString("pyActiveDocumentType","HOME");

	ClipboardPage pg_display = tools.createPage("Pega-UI-RunTime-Display", "pyDisplay");

	 pg_display.getProperty("pyPortalName").setValue(portalName);

		if(pg_displayTemp.getProperty("pyElements").size() > 0) {

			ClipboardProperty cp_SectionTabs = pg_displayTemp.getProperty("pyElements");

			Iterator iter_elements = cp_SectionTabs.iterator();

			while(iter_elements.hasNext()){

				ClipboardPage pg_elem = ((ClipboardProperty)iter_elements.next()).getPageValue();

				Iterator iter_elements2 = null;

				iter_elements2 = pg_elem.getProperty("pyUIElements").iterator();

				while(iter_elements2.hasNext()){

					ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

					 if(!"".equalsIgnoreCase(pg_innerElem.getStringIfPresent("pyMode"))){pg_display.putString("pyMode",pg_innerElem.getString("pyMode"));

					 pg_innerElem.getProperty("pyMode").removeFromClipboard(); 

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 dataModelChangeTracker.trackValueChanges(tools.findPage("Declare_pyDisplay").getProperty("pyDisplay").getPageValue(portalName).getProperty("pyCandidateIndices"),-1);

					}}catch(Exception e){} }

					 else{

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 }}catch(Exception e){} 

					 }

					pg_display.movePage("pyUIElements(<APPEND>)", pg_innerElem);

				}

				iter_elements2 = pg_elem.getProperty("pyUIActive").iterator(); 

				while(iter_elements2.hasNext()){ 

					ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

						if(!("").equalsIgnoreCase(pg_innerElem.getString("pyMode"))){pg_innerElem.getProperty("pyMode").removeFromClipboard();} 

					pg_display.movePage("pyUIActive(<APPEND>)", pg_innerElem);

				}

			}

		}

		if(pg_display.getProperty("pyUIElements").size() == 0){

			pg_display.removeFromClipboard();

		} else {

			pg_display.put(pg_displayTemp.getProperty("pyContainerList"));

		}

		tools.findPage("pyDisplayTemp").removeFromClipboard();

	 if(pg_prevDisplay !=null){

 boolean bIsDCSPA =  pg_prevDisplay.getBoolean("pyIsDCSPA");

 boolean isActivateDocCase =  "activate".equals(tools.getRootParamValue("api"));

 boolean isHistoryStateNull = "true".equals(tools.getRootParamValue("isHistoryStateNull"));
if("NoHeader".equalsIgnoreCase(pg_display.getString("pyMode"))){

	 pg_display.putString("pyCandidateIndices",pg_prevDisplay.getString("pyCandidateIndices"));

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 dataModelChangeTracker.trackValueChanges(tools.findPage("Declare_pyDisplay").getProperty("pyDisplay").getPageValue(portalName).getProperty("pyCandidateIndices"),-1);

					}}catch(Exception e){} }

	 pg_display.getProperty("pyHANotify").setValue("false");

	 ClipboardProperty cp_DisplayLayouts = pg_prevDisplay.getIfPresent("pyLayout");

	 int prevElementsCnt = pg_prevDisplay.getProperty("pyUIElements").size();

	 int elementsCnt =pg_displayTemp.getIfPresent("pyElements").size();

 String activeCtdID="";

 boolean  isStaticEleActive=false;

 ClipboardProperty pg_prevUIActive = pg_prevDisplay.getProperty("pyUIActive");

 if(pg_prevUIActive!=null && pg_prevUIActive.size()>0){

 activeCtdID = pg_prevUIActive.getPageValue(1).getString("pyElementName");

 isStaticEleActive = pg_prevUIActive.getPageValue(1).getBoolean("pyIsStatic");

 if(bIsDCSPA && (!isActivateDocCase && !isHistoryStateNull)){

	 pg_display.getProperty("pyUIActive").setValue(pg_prevUIActive);

 }

	 } 

 if(cp_DisplayLayouts == null){

 Iterator iter_prevDisplay = pg_prevDisplay.getProperty("pyUIElements").iterator();

 elementsCnt =0;

 while(iter_prevDisplay.hasNext()){

 elementsCnt++; 
 ClipboardPage pg_prevUIElement = ((ClipboardProperty)iter_prevDisplay.next()).getPageValue();

 if(bIsDCSPA){

 ClipboardPage pg_currentElement = pg_display.getProperty("pyUIElements").getPageValue(1);

	 if(!isActivateDocCase && !isHistoryStateNull){

	 pg_currentElement.replace(pg_prevUIElement);

	 }

	 continue;

}

 if(pg_prevUIElement.getString("pyIsStatic").equals("false")){

						 pg_prevUIElement.putString("pyStatus","Deferred");
int isize = 0; ClipboardProperty cp_currElems = pg_display.getIfPresent("pyUIElements");
if(cp_currElems != null){
 isize = cp_currElems.size();
}
 isize++; pg_prevUIElement.putString("pyIndex", isize+"");

 if( pg_prevUIElement != null && pg_prevUIElement.getBoolean("pyIsActive")){ 

  pg_display.getProperty("pyUIActive").getPropertyValue(1).setValue(pg_prevUIElement);

 }

 pg_display.movePage("pyUIElements(<APPEND>)", pg_prevUIElement); 

	}else {
ClipboardProperty staticUIElements = pg_display.getIfPresent("pyUIElements");
if(staticUIElements != null && staticUIElements.size() > 0){
String strCtdId = pg_prevUIElement.getString("pyElementName");

 Iterator iter_staticEles = staticUIElements.iterator();
 while(iter_staticEles.hasNext()){
 ClipboardPage pg_staticEle = ((ClipboardProperty)iter_staticEles.next()).getPageValue();
 String stroldEleCntdID = pg_staticEle.getString("pyElementName");
 String strIsStatic = pg_staticEle.getString("pyIsStatic");
 if("true".equalsIgnoreCase(strIsStatic)){
 if(!"".equals(stroldEleCntdID) && stroldEleCntdID !=null && stroldEleCntdID.equalsIgnoreCase(strCtdId)){
 pg_prevUIElement.putString("pyIndex",pg_staticEle.getString("pyIndex"));
 pg_staticEle.replace(pg_prevUIElement);break;
}
}else{break;}
}
}

	if(isStaticEleActive){
ClipboardProperty UIElements = pg_display.getIfPresent("pyUIElements");
if(UIElements != null && UIElements.size() > 0){

 Iterator iter_Eles = UIElements.iterator();
 while(iter_Eles.hasNext()){
 ClipboardPage pg_staticEle = ((ClipboardProperty)iter_Eles.next()).getPageValue();
 String strEleCntdID = pg_staticEle.getString("pyElementName");
 String strIsStatic = pg_staticEle.getString("pyIsStatic");
 if("true".equalsIgnoreCase(strIsStatic) && strEleCntdID.equalsIgnoreCase(activeCtdID)){
 	pg_staticEle.putString("pyIsActive","true"); 

  pg_display.getProperty("pyUIActive").getPropertyValue(1).setValue(pg_staticEle);
}else{
 	pg_staticEle.putString("pyIsActive","false");

	 }}}

	 }

	}}}

	   }

	 ClipboardProperty dcp_Display = pg_dec_PyDisplay.getProperty("pyDisplay");

	 ClipboardPage tpyDip=dcp_Display.getPageValue(portalName);

	 String strMode = tpyDip.getString("pyMode");

	 if("NoFrame".equals(strMode) || "NoIFrame".equals(strMode)){

	 tpyDip.putString("pyMode","NoIFrame");

	 }else{

	 ClipboardProperty pyMicroDCDisplay = tpyDip.getIfPresent("pyMicroDCDisplay");

	 if(pyMicroDCDisplay != null){ 

	 pg_display.getProperty("pyMicroDCDisplay").setValue(pyMicroDCDisplay);

	 }

	 tpyDip.clear(); ClipboardProperty cp_pyLayouts = tpyDip.getProperty("pyLayout");

	 cp_pyLayouts.removeFromClipboard();

	 }

	 String pyIsDCSPA = tools.getParamValue("pyIsDCSPA");

	 if(pyIsDCSPA != null && !("").equalsIgnoreCase(pyIsDCSPA)){

		 tpyDip.putString("pyIsDCSPA",pyIsDCSPA);

		 if("true".equals(tools.getParamValue("pyIsMultiSession")) || "true".equals(tools.getParamValue("bMultiPortalSession"))){

		 tpyDip.putString("bIsMultiSession","true");

		 tpyDip.putString("pxThreadName", tools.findPage("pxThread").getString("pxThreadName"));

		 }

	 }

	  tpyDip.putAll(pg_display,ClipboardPage.PUTALL_KEEPNEW);

 pg_display.removeFromClipboard();}

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 dataModelChangeTracker.trackValueChanges(tools.findPage("Declare_pyDisplay").getProperty("pyDCDisplayState").getPageValue().getProperty("pyActiveDocumentType"),-1);

					}}catch(Exception e){} 

	} catch(Exception e){

		
}

	}


public void putLazyLoadInfo_1() {
	if(!"".equals(tools.getParamValue("lazyLoadInfo"))) {
		((StreamBuilderToolKit)tools).appendString("<span style='display:none' id='lazyLoadInfo'>"+((StreamBuilderToolKit)tools).getParamValueCSF("lazyLoadInfo")+"</span>");
	}
}private void performStream_1() throws Throwable {
 boolean pzIsOfflineEnabled = "true".equals(tools.getProperty("pxRequestor.pzIsOfflineEnabled").getStringValue()); 
 boolean pxIsMobileClient = pega.getUIEngine().getWhenEvaluator().evaluate("pxIsMobileClient"); 
 boolean isOfflineMobileClient = pzIsOfflineEnabled && pxIsMobileClient; 
tools.appendString(" ");
 if(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"skipHarnessExecution")){
 return;
} 
tools.appendString(" ");
 if(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"packagePanelSections")){
addSectionForOfflinePackaging_1();
 return;
} 
tools.appendString(" ");
 if(tools.getParamAsBoolean(ImmutablePropertyInfo.TYPE_TRUEFALSE,"getMainPanelSection")){
getMainPanelSection_1();
 return;
} 
tools.appendString(" ");
 pzHarness.resetQueryStringRegistration();
 if("true".equals(tools.getRootParamValue("isWebMashup"))){
 tools.getThread().getThreadPage().putString("isWebMashup","true");
}
tools.appendString(" ");
 pzHarness.setAjaxContainerProperties();
tools.appendString(" ");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || isOfflineMobileClient){
tools.appendString(" ");
pzAuto.getUIComponentRuntime().forceTemplateStatus('A');
tools.appendString(" ");
 tools.putParamValue("enableTemplate", "default"); 
tools.appendString(" ");
}
tools.appendString(" ");
 if("true".equals(tools.findPage("pxRequestor").getString("pxIsUnsupportedBrowser"))) { 
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pyUnsupportedBrowserLoginMessage", null, null, "Rule-HTML-Fragment", null);
tools.appendString(" ");
 } else { 
 boolean isActivateDocCase = ("activate").equals(tools.getRootParamValue("api")); 
 boolean isDCSPA = ("true").equals(tools.getRootParamValue("isDCSPA")); 
 boolean generateOnlyMain =  (isActivateDocCase && isDCSPA); 
 boolean includeOnlyScriptsAndStyles = tools.getParamValue("includeOnlyScriptsAndStyles").equalsIgnoreCase("true");String ajaxTrackID = tools.getRootParamValue("AJAXTrackID"); com.pega.pegarules.priv.runtime.IStreamChangeTracker tracker= null; String hID=null; if(!includeOnlyScriptsAndStyles){ hID = pzAuto.createActionRequestRegistrar();tools.putParamValue("pzHarnessID",hID);
if("".equals(ajaxTrackID)) {
tracker = pzAuto.getChangeTracker(null,tools.getPrimaryPage().getName(),hID);
String portalThreadName = "";
if(tools.getParamValue("portalLaunch").equalsIgnoreCase("true")){
portalThreadName = tools.getThread().getName();
}else{
portalThreadName = tools.getParamValue("portalThreadName");}
if(!"".equals(portalThreadName)) {

tracker.setPortalThreadName(portalThreadName);}
tracker.enablePathCompression();
tracker.trackValueChanges(tools.getProperty("pxThread.pxClientExchange"), -1);
tracker.trackValueChanges(tools.getProperty("pxThread.pxClientFrame"), -1);} else {
	 tracker = pzAuto.getChangeTracker(ajaxTrackID);}
String trackerID = tracker.getID();
tools.putParamValue("AJAXTrackID", trackerID);
tools.appendString(" ");
	if (WhenTag.evaluateWhen(pega, "param.EnableDirectStreaming== \"true\"", null, false)) {
tools.appendString(" ");
 pega.enableDirectStreaming(); 
tools.appendString(" ");
	}
tools.appendString(" ");
 pzAuto.enableDeferredStaticContent(); 
tools.appendString(" ");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || isOfflineMobileClient) {
tools.appendString(" ");
if( pzAuto.isOffline()){ pzAuto.enableCacheManifest(); } 
tools.appendString(" ");


	 boolean bDeveloperThread  =tools.findPage("pxThread").getString("pxThreadName").equalsIgnoreCase("Developer");
	 ClipboardPage appPage = tools.findPage("Application",true);
	 if(appPage!=null){

	 if(appPage.getStringIfPresent("pyUseWebstandardsUI")!=null){

	 if(appPage.getStringIfPresent("pyUseWebstandardsUI").equalsIgnoreCase("true") && !bDeveloperThread){
		 if(pega_uiengine_harness.pzDoctypeSupportedForBrowser(tools)) {
			 tools.appendString("<!DOCTYPE html>");
			tools.putParamValue("inStandardsMode", true);
		}
	}
}
}
tools.appendString(" ");
 } else { tools.putParamValue("inStandardsMode", true); } 
 String currentLocale = tools.findPage("pxRequestor.pxSecuritySnapshot").getString("pxUseLocale");if(currentLocale==""){currentLocale = tools.findPage("pxRequestor").getString("pxReqLocale");    }
tools.appendString(" ");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || isOfflineMobileClient) {
tools.appendString(" <html lang='");
out.print( currentLocale.replace("_", "-"));
tools.appendString("' ");
if(pzAuto.isOffline() && !pxIsMobileClient){ 
tools.appendString(" manifest=\"?");
out.print(pega_rules_utilities.pzEncryptURLActionString(tools, "Global","pyActivity=Data-Portal.pyGenerateAppCacheManifest"));
tools.appendString("\" ");
 } 
tools.appendString(" class=\"");
out.print(pega_uiengine_harness.pzGetBrowserClassString(pzAuto));
 if (pzAuto.isIOS()) { 
tools.appendString(" iOS");
 } 
 if (pzAuto.isAndroid()) { 
tools.appendString(" android");
 } 
 if (pzAuto.isMSMobile()) { 
tools.appendString(" microsoft");
 } 
 if (pzAuto.isMobilePhone()) { 
tools.appendString(" phone");
 } 
 if (pzAuto.isTablet()) { 
tools.appendString(" tablet");
 } 
 if (pzAuto.isHybridClient()) { 
tools.appendString(" pega-hybrid");
 } 
tools.appendString(" yui-skin-sam\"");
if(pzAuto.isOrientationRTL()){
tools.appendString("dir=\"rtl\"");
}
tools.appendString("> <head> ");
 } 
StringMap parameters = new HashStringMap();parameters.putString("pyHarnessNameForUpdate","Review");parameters.putString("pyHarnessShortDesc","Review work object");pzHarness.updateClipboardModels(parameters);
tools.appendString(" ");
 tools.putSaveValue("bClientValidation", "true"); 
tools.appendString(" ");
 tools.putParamValue("InHarness", "true"); 
tools.appendString(" ");
 if (pzAuto.isAccessible()) tools.putSaveValue("bAccessible", "true"); 
tools.appendString(" ");
 tools.putParamValue("FormError", ""); 
tools.appendString(" ");
 tools.putParamValue("FieldError", ""); 
tools.appendString(" ");
 tools.putParamValue("pyCustomError", ""); 
tools.appendString(" ");
 tools.putParamValue("titleOnPortalLaunch", "Review work object"); 
tools.appendString(" ");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || isOfflineMobileClient) {
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pyMetaTags", null, null, null, null);
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pzAddWebAnalyticsMetaTags", null, null, "Rule-HTML-Fragment", null);
tools.appendString(" <title>");
if (_jspx_meth_pega_lookup__1(pageContext, ".pyCaption", "Review work object")) {
	return;
}
tools.appendString("</title> ");
choose_1();
tools.appendString("  ");
 } 
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pyImageTags", null, null, null, null);
tools.appendString(" ");
 tools.putParamValue("bExcludeLegacyJS", "true"); 
tools.appendString(" ");
tools.putSaveValue("harnessType", "screen-layout");
} //End of includeOnlyScripsAndStyles 
tools.appendString(" ");
if(!includeOnlyScriptsAndStyles){
tools.appendString(" ");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || pxIsMobileClient) {
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("WorkformStyles", null, null, "Rule-HTML-Fragment", null);
tools.appendString(" ");
 } 
} //End of includeOnlyScripsAndStyles 
tools.appendString(" ");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || pxIsMobileClient) {
tools.appendString(" ");
 } 
tools.appendString(" ");
if(!includeOnlyScriptsAndStyles){
tools.appendString(" ");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || pxIsMobileClient) {
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("WorkFormStandard", null, null, "Rule-HTML-Fragment", null);
tools.appendString(" ");
 } 
 } 
tools.appendString(" ");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || pxIsMobileClient) {
pzAuto.getUIComponentRuntime().enableScriptCapturing();
pzAuto.getUIComponentRuntime().disableScriptCapturing();
tools.appendString(" ");
 }  
tools.appendString(" ");
  if(!includeOnlyScriptsAndStyles){ 
tools.appendString(" ");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || isOfflineMobileClient) {
tools.appendString(" ");
  tools.appendString(pzHarness.getCanonicalElement()); 
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pzCPMTheme", null, null, null, null);
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pzRuntimeToolsInclude", null, null, null, null);
tools.appendString(" </head> ");
 pega.flushToBrowser(); 
tools.appendString(" <body class='screen-layout-body' onload='screenLayoutResize'>");
 if(pzAuto.hasStaticContentJSOptimization()){ 
onlyOnce_1();
 } 
tools.appendString(" <noscript><style>.screen-layout{display:none;} body{background:none;background-color:white}</style><div> <div id='jsDisabledHeader' style='color:blue;text-align:center;margin: 70px;'>");
out.print( tools.getLocalizedTextForString(".pyMessageLabel", "javascript disabled title") );
tools.appendString("</div> <div id='jsDisabledMessage' style='color:blue;text-align:center;margin: 70px;'>");
out.print( tools.getLocalizedTextForString(".pyMessageLabel", "javascript disabled") );
tools.appendString("</div> </div></noscript> ");
 } 
 if ("true".equals(tools.getParamValue("portalLaunch"))) { 
tools.appendString(" ");
 tools.appendString(pzAuto.getSection().getSectionStream("pySkipLinksToTarget","",true,"")); 
tools.appendString(" ");
}
 if(pega_uiengine_harness.pzInStandardsMode() == true){ 
tools.appendString("<div class=\"modal-overlay\" id=\"modalOverlay\" class=\"yui-skin-sam\"><div class =\"modal-align-table\" ><div class=\"modal-align-cell\"><div class=\"modal-wrapper\" id=\"modalWrapper\" role=\"dialog\" aria-labelledby=\"modalDialog_Title\" aria-modal=\"true\"><div class=\"modal-content\" id=\"modalContent\"></div></div></div></div></div>");
}else {
tools.appendString("<div style=\"display:none\" id=\"modaldialog\" role=\"dialog\" aria-labelledby=\"modalDialog_Title\" aria-modal=\"true\"><b class=\"b1\" id='mCurve'></b><b class=\"b2\" id='mCurve'></b><b class=\"b3\" id='mCurve'></b><b class=\"b4\" id='mCurve'></b><div class=\"bd\" id=\"modaldialog_bd\" style=\"overflow-x:auto;padding:0px\"></div><div class=\"ft footer\" id=\"modaldialog_ft\" style=\"height:10px\"></div><b class=\"b4b\" id='mCurve'></b><b class=\"b3b\" id='mCurve'></b><b class=\"b2b\" id='mCurve'></b><b class=\"b1b\" id='mCurve'></b></div>");
}
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pzMobileAppNotification", null, null, "Rule-HTML-Fragment", null);
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pzRuntimeToolsBar", null, null, "Rule-HTML-Fragment", null);
  tools.appendString(pzHarness.getFormErrorMarkerDiv()); 
tools.appendString("<input type='hidden' id='pzHarnessID' value='");
out.print(hID);
tools.appendString("'>");
String topHarness = tools.getParamValue("topHarness");if ("yes".equals(topHarness)) {com.pega.pegarules.pub.context.PRAuthorization auth = tools.getAuthorizationHandle();com.pega.pegarules.pub.util.PRSystemSettings syssettings = tools.getSystemSettings();boolean hasPriv = auth.havePrivilege ( tools.getThread(), "pxClientActivityTracking",  "@baseclass", null);String strHasSut = syssettings.getDynamic("Pega-Rules", "pzPegaSUT");if (hasPriv || "true".equals(strHasSut)) { 
tools.appendString("<div class='document-statetracker' data-state-busy-status='busy'></div>");
}}
tools.appendString(" ");
 if(pzHarness.canRecoverPassivatedData()){ ((PegaAPI)tools).getUIEngine().getDCInstance().createDataModel();  tools.appendString(pzHarness.getHAMessage()); }

		 tools.putParamValue("bIsScreenLayout",true);String topPanelRole ="banner";String centerPanelRole ="main";String lrPanelRole ="complementary";if(!tools.getParamValue("contentID").equals("")){ lrPanelRole = topPanelRole = centerPanelRole ="contentinfo";}
tools.appendString(" <div ");
out.print( pzHarness.getInspectorData() );
tools.appendString(" data-portalHarnessInsName = \"OLFHF9-Onboaring-Work-OnboaringProcess!Review\" class=\"flex screen-layout screen-layout-modern screen-layout-content_only \" style=''> ");
pzAuto.getSection().includeShowMeHarnessInsert();
 tools.putParamValue("pySectionIncludeHeight", "Auto"); 
tools.appendString("<div id='screen-layout-mask'></div> <main data-skip-target=\"main\" ");
out.print( pzHarness.getInspectorDataForPanel("CENTER") );
tools.appendString(" id='l2' class='screen-layout-region screen-layout-region-main screen-layout-region-main-middle not-nav' aria-label='");
out.print( tools.getLocalizedTextForString(".pyCaption", "Center Panel") );
tools.appendString("' role='");
out.print( centerPanelRole );
tools.appendString("' ><div class='screen-layout-region-content' ");
 if (pzAuto.isAccessible()) { 
tools.appendString("id='screen-layout-center'");
 } 
tools.appendString(">");
 tools.putParamValue("sectionsDetails", "PortalStyles:pyPortalInlineStyle=,pyPortalInlineClass=,pyPortalLayoutMode=Flexbox&CENTER:pzC11nReviewSection,OLFHF9-Onboaring-Work-OnboaringProcess,false,content_only,\"\",\"\",default,main&OLFHF9-Onboaring-Work-OnboaringProcess!Review"); 
 tools.putParamValue("strIncludedScripts", ""); 
 tools.putParamValue("bIsScreenLayout", "true"); 
if(pzAuto.isOffline() && !tools.findPage("pyPortal").getString("pyOwner").equals("Developer") && !"true".equals(tools.getParamValue("isForOfflineTemplate"))){
pzAuto.emitIncludeStreamReference("PegaCompositeGadgetInclude", null, null, null, null);
tools.appendString("<div class='lazyload-harness' bIsScreenLayout ='true' sectionsDetails='PortalStyles:pyPortalInlineStyle=,pyPortalInlineClass=,pyPortalLayoutMode=Flexbox&CENTER:pzC11nReviewSection,OLFHF9-Onboaring-Work-OnboaringProcess,false,content_only,\\\"\\\",\\\"\\\",default,main&OLFHF9-Onboaring-Work-OnboaringProcess!Review' strIncludedScripts='' data-localStoreId='OLFHF9-ONBOARING-WORK-ONBOARINGPROCESS!PZC11NREVIEWSECTION' data-deferinvoke='includeSectionBody_1'>");
pzAuto.emitIncludeStreamReference("pyLoadingMessage",null,null,"Rule-HTML-Section",null);
tools.appendString("</div>");
}else{
includeSectionBody_1();
}
tools.appendString(" </div></main> </DIV> ");
tools.putSaveValue("AutoDocInfoInclude", "true");
elementModel_1();
tools.appendString(" ");
 putLazyLoadInfo_1(); 
tools.appendString(" ");
if (_jspx_meth_pega_withReference__1(pageContext, ".pySpecialtyComponentData")) {
	return;
}
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pzOnlyOnceChanges", null, null, "Rule-Obj-HTML", null);
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pzIncludeSkeletons", null, null, "Rule-Obj-HTML", null);
tools.appendString(" ");
if("".equals(ajaxTrackID) && tracker != null) {
tools.appendString(" ");
tracker.disableXSSEncoding();
tools.appendString(" <div style='display:none;' id='AJAXCT' data-json='");
out.print(tracker.getCurrentValuesAsJSON().replace("&quot;","\\&quot;"));
tools.appendString("'></div> ");
tools.putParamValue("AJAXTrackID", "");
tools.appendString(" ");
tracker.clearChangeList();
tools.appendString(" ");
}else if(("true").equals(tools.getRootParamValue("isDCSPA"))){
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pzTrackerChanges", null, null, "Rule-Obj-HTML", null);
tools.appendString(" ");
}
 if(pzAuto.getUIComponentRuntime().getScriptLoader().isTemplateScriptReorderEnabled()){pzAuto.getUIComponentRuntime().getScriptLoader().emitTemplateDeferedScripts();}
 if(pzAuto.hasStaticContentJSOptimization()){ 
onlyOnce_2();
 } 
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("DocumentInfo", null, null, "Rule-HTML-Fragment", null);
 if(!pzAuto.getUIComponentRuntime().getScriptLoader().isTemplateScriptReorderEnabled()){pzAuto.getUIComponentRuntime().getScriptLoader().emitTemplateDeferedScripts();}
tools.appendString(" <input type='hidden' id='XCSRFToken' name='XCSRFToken' value='");
out.print( tools.getCSRFToken(tools.getThread()) );
tools.appendString("'> ");
boolean whenResult_1 = pega.invokeWhen("pyGeolocationTrackingIsEnabled", "", "");
	if (whenResult_1) {
tools.appendString(" <input type='hidden' id='pxRequestorPyLatitude' name='");
out.print( tools.getThread().getRequestorPage().getProperty("pyLatitude").getEntryHandle() );
tools.appendString("' value='");
out.print( StringUtils.crossScriptingFilter(tools.getThread().getRequestorPage().getProperty("pyLatitude").getStringValue()) );
tools.appendString("'> <input type='hidden' id='pxRequestorPyLongitude' name='");
out.print( tools.getThread().getRequestorPage().getProperty("pyLongitude").getEntryHandle() );
tools.appendString("' value='");
out.print( StringUtils.crossScriptingFilter(tools.getThread().getRequestorPage().getProperty("pyLongitude").getStringValue()) );
tools.appendString("'> ");
	}
tools.appendString(" ");
if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate() || isOfflineMobileClient) {
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pzHarnessBodyScripts", null, null, "Rule-HTML-Fragment", null);
tools.appendString(" </html> ");
 if (pzAuto.isCacheManifestEnabled()) { 
       String localeDataIncludeUrl = tools.getSaveValue("localeDataIncludeURL");
       String portalAndAppDataIncludeUrl = tools.getSaveValue("portalAndAppDataIncludeURL");
       pzAuto.addCacheManifestURL(localeDataIncludeUrl);
       pzAuto.addCacheManifestURL(portalAndAppDataIncludeUrl);
}
tools.appendString(" ");
if (pzAuto.isOffline()) {
 String manifestURLs = pzAuto.getCacheManifestURLs(); tools.getPrimaryPage().putString("pymanifestURLs",manifestURLs);
 if(isOfflineMobileClient && pega.getPackageRuntime().canPackage()) {
	 pega.getPackageRuntime().packageHarnessStaticAssets(manifestURLs);
 }
} 
tools.appendString(" ");
 } 
 }//end of includeOnlyScriptsAndStyle 
tools.appendString("  ");
 } 
}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("OLFHF9-Onboaring-Work-OnboaringProcess.pyCaption", new LiteweightPropertyDefinition("OLFHF9-Onboaring-Work-OnboaringProcess", "pyCaption", "siN", false, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "OLFHF9-Onboaring-Work-OnboaringProcess");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Harness");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "OnboaringProcess");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "Review");
	oStreamProperties_1.put("pyRuleSetVersion", "01-01-01");
}
public void cleanForReuse(PegaAPI aContext) {
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
	pzHarness = pzAuto.getHarness();
	pzSection = pzAuto.getSection();
	pzLayout = pzSection.getLayout();
	pzCell = pzLayout.getCell();
	pzControl = pzCell.getControl();
	pzPackageRuntime = pega.getPackageRuntime();
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
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Harness");
}
protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("includeSectionBody_1", new String[][] {});
pzExternalMethodMapping.put("addSectionForOfflinePackaging_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("", "OLFHF9-Onboaring-Work-OnboaringProcess Review", "OnboaringProcess", "01-01-01", "20210114T162756.105 GMT");
}
