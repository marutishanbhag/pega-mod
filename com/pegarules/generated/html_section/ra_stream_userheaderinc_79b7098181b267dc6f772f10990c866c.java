package com.pegarules.generated.html_section;
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
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderSection;
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
 * Builds JSP stream DATA-PORTAL!USERHEADERINC.
 */
public class ra_stream_userheaderinc_79b7098181b267dc6f772f10990c866c extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.UserHeaderInc.Data_Portal.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1437293284;
private static boolean pz_isValidAssembly= true;
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
	public ra_stream_userheaderinc_79b7098181b267dc6f772f10990c866c(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "f59617d0747d9a2d834348cf025711af5438ef4f";
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
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-SECTION DATA-PORTAL USERHEADERINC #20210506T204031.080 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "f59617d0747d9a2d834348cf025711af5438ef4f";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("UserHeaderInc",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, true, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
pxIsNonTemplateStream = true;
pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_1");
/*
 * Begin RULE-HTML-SECTION DATA-PORTAL USERHEADERINC #20210506T204031.080 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION DATA-PORTAL USERHEADERINC #20210506T204031.080 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Section");
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

	performStream_2();

}
}
} catch (Throwable thr) {
	pzSection.abortComponent();
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_1);
	mStreamResponse.setJspBaseClass(prevClass_1);
	pz_CurrentRuleKey = prevRuleKey_1;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_0,false);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION DATA-PORTAL USERHEADERINC #20210506T204031.080 GMT */
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
	"Rule-Obj-HTML:PZLOCALEDATAFORCOSMOS", 
	"Rule-File-Text:WEBWB!PY-COSMOS-CUSTOM-CSS!CSS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-File-Bundle:PY-COSMOS-CUSTOM-STYLES!STYLE", 
	"Rule-HTML-Section:USERHEADERINC"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZLOCALEDATAFORCOSMOS","Rule-Obj-HTML","@BASECLASS",false,"","Theme-Cosmos","04-01-01","RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT","!PZLOCALEDATAFORCOSMOS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1219579713), 
		new DependentRuleInfo("WEBWB!PY-COSMOS-CUSTOM-CSS!CSS","Rule-File-Text","",false,"","Theme-Cosmos","","RULE-FILE-TEXT WEBWB PY-COSMOS-CUSTOM-CSS!CSS #20210506T204026.064 GMT","WEBWB!PY-COSMOS-CUSTOM-CSS!CSS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-HTML","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PY-COSMOS-CUSTOM-STYLES!STYLE","Rule-File-Bundle","",false,"","Theme-Cosmos","","RULE-FILE-BUNDLE PY-COSMOS-CUSTOM-STYLES STYLE #20210506T204026.027 GMT","PY-COSMOS-CUSTOM-STYLES!STYLE",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("USERHEADERINC","Rule-HTML-Section","DATA-PORTAL",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION DATA-PORTAL USERHEADERINC #20210506T204031.080 GMT","!USERHEADERINC",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1437293284)
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
//	RULE-HTML-SECTION DATA-PORTAL USERHEADERINC #20210506T204031.080 GMT:20230608T090135.265 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT:20210506T204032.581 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-FILE-BUNDLE PY-COSMOS-CUSTOM-STYLES STYLE #20210506T204026.027 GMT:20210506T204026.027 GMT
//	RULE-FILE-TEXT WEBWB PY-COSMOS-CUSTOM-CSS!CSS #20210506T204026.064 GMT:20210506T204026.064 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "6b9a463c74ac6808998e78c959125954";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal";
	}
public String getAspect() {
return "Stream";
}
private static final String[] showMeParams_1 = {
"", "", "", "", "@baseclass", "", "04-02", "", "Rule-Obj-HTML", "Final", "", "Theme-Cosmos", "04-01-01", "", "pzLocaleDataForCosmos", "", "RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT" };
private void performStream_1() throws Throwable {
tools.appendString("<script type=\"text/javascript\" id=\"lcoalevars\">\n\n   pega.u.d.fieldValuesList.put(\"Readmore\",'");
out.print(tools.getLocalizedTextForString("pyCaption","Read more", StreamBuilder.FMT_JAVASCRIPT));
tools.appendString("');\n   pega.u.d.fieldValuesList.put(\"Readless\",'");
out.print(tools.getLocalizedTextForString("pyCaption","Read less", StreamBuilder.FMT_JAVASCRIPT));
tools.appendString("');\n   pega.u.d.fieldValuesList.put(\"Preview\",'");
out.print(tools.getLocalizedTextForString("pyCaption","Preview", StreamBuilder.FMT_JAVASCRIPT));
tools.appendString("');\n</script>");
}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "");
	oStreamProperties_2.put("pyClassName", "@baseclass");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzLocaleDataForCosmos");
	oStreamProperties_2.put("pyRuleSetVersion", "04-01-01");
}
/**
 * Build stream RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
/* end RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT */
}
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
/**
 * OnlyOnce condition: cosmoslocale
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("cosmoslocale")) {
tools.appendString(" ");
/* Include stream RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT */
include_1();

tools.appendString(" ");
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
	pzStatic__2.addBundle("py-cosmos-custom-styles", "1225772095");
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
 * OnlyOnce condition: pycosmoscustomstyles
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_2() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("pycosmoscustomstyles")) {
tools.appendString(" ");
if (_jspx_meth_pega_static__1(pageContext, "style", "webwb")) {
	return;
}
tools.appendString(" ");
}
}
private void performStream_2() throws Throwable {
onlyOnce_1();
tools.appendString(" ");
onlyOnce_2();
tools.appendString(" ");

   ClipboardPage newTabTempPage = tools.findPage("newTabTempPage",true);
    String actionName= "";
   String insHandle = "";
   String className = "";
   String ruleName = "";
   String preActivityName = "";
   String preActivityParams = "";
   String tabName = "";
   String preDataTransform = "";
   if(newTabTempPage != null){
    actionName = newTabTempPage.getString("pyActionName");
    insHandle = newTabTempPage.getString("pzInsKey");
    className = newTabTempPage.getString("pyClassName");
    ruleName = newTabTempPage.getString("pyRuleName");
    preActivityName = newTabTempPage.getString("pyPreActivityName");
    preActivityParams = newTabTempPage.getString("pyPreActivityParams");
    tabName = newTabTempPage.getString("pyName");
    preDataTransform = newTabTempPage.getString("pyPreDataTransform");
   }
   ClipboardPage UIActionPage = ((PegaAPI) tools).getUIEngine().getUIActionPage("openWorkByHandle");
   ClipboardPage actionAPI = UIActionPage.getPage("pyActionAPI");
   actionAPI.putString("pyKey", insHandle);
   ((PegaAPI) tools).getUIEngine().getUIAction(UIActionPage).register();
   UIActionPage.removeFromClipboard();
   pega_rules_utilities.pzRegisterActivity(tools, "pzPagesToRemove");
   pega_rules_utilities.pzRegisterActivity(tools, "pyGetPulseResults");
   Map config = new HashMap <String, String>();
   config.put("pyActivity", "@baseclass.doUIAction");
   config.put("action", "display");
   pega.getUIEngine().getUIAction("display", config).register();
   config.put("action", "openAssignment");
   pega.getUIEngine().getUIAction("openAssignment", config).register();
   config.put("action", "openWorkItem");
   pega.getUIEngine().getUIAction("openWorkItem", config).register();

   config = new HashMap <String, String>();
   config.put("harnessName", "pyPulseSearchResults");
   config.put("className", "PegaSocial-Message");
   config.put("preActivity", "pyGetPulseResults");
   config.put("preActivityParams", "{\"retrieveTags\":\"true\"}");
   config.put("target", "newDocument");
   pega.getUIEngine().getUIAction("showHarness", config).register();
   config = new HashMap<String, String>();
   config.put("harnessName", "pyTagDashboard");
   config.put("className", "Data-Social-Tag");
   config.put("preActivity", "pySetSelectedTagKey");
   config.put("target", "newDocument");
   pega.getUIEngine().getUIAction("showHarness", config).register();
   config = new HashMap<String, String>();
   config.put("harnessName", "SearchResultsPage");
   config.put("className", "Data-Portal");
   config.put("target", "newDocument");
   pega.getUIEngine().getUIAction("showHarness", config).register();
   
tools.appendString(" <script> var newTabactionName = \"");
out.print( actionName );
tools.appendString("\"; var newTabInsHandle = \"");
out.print( insHandle );
tools.appendString("\"; var encryptedNewTabUrl = '");
out.print( pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", "pyActivity=pxOpenWorkItemNewTab") );
tools.appendString("'; var encryptedGetCaseClassNameFromKey = '");
out.print( pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", "pyActivity=pzRunActionWrapper&pzActivity=@baseclass.pzGetCaseClassNameFromKey") );
tools.appendString("'; var newTabClassName = \"");
out.print( className );
tools.appendString("\"; var newTabRuleName = \"");
out.print( ruleName );
tools.appendString("\"; var preActivityName = \"");
out.print( preActivityName );
tools.appendString("\"; var preActivityParams = \"");
out.print( preActivityParams );
tools.appendString("\"; var tabName = \"");
out.print( tabName );
tools.appendString("\"; var preDataTransform = \"");
out.print( preDataTransform );
tools.appendString("\"; var newTabReqURI = pxReqURI; var newTabIsReloaded = \"\"; </script>");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Data-Portal");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION DATA-PORTAL USERHEADERINC #20210506T204031.080 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "UserHeaderInc");
	oStreamProperties_1.put("pyRuleSetVersion", "04-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION DATA-PORTAL USERHEADERINC #20210506T204031.080 GMT", "Data-Portal UserHeaderInc", "Theme-Cosmos", "04-01-01", "20230608T090135.265 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML @BASECLASS PZLOCALEDATAFORCOSMOS #20210506T204032.581 GMT", "@baseclass pzLocaleDataForCosmos", "Theme-Cosmos", "04-01-01", "20210506T204032.581 GMT");
}
