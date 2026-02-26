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
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
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
/**
 * Builds JSP stream WORK-!PYACTIVITYPAGE.
 */
public class ra_stream_pyactivitypage_6dc4254509b50bdb2aa9d57808d815dd extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pyActivityPage.OFON2J_ProcessO_Work_Onboarding.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 231527478;
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
	public ra_stream_pyactivitypage_6dc4254509b50bdb2aa9d57808d815dd(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "163dea9a5a044f4d7f07e811ff96f1f7f5898018";
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
/* Instance RULE-HTML-SECTION WORK- PYACTIVITYPAGE #20210506T204028.016 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "163dea9a5a044f4d7f07e811ff96f1f7f5898018";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pyActivityPage",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION WORK- PYACTIVITYPAGE #20210506T204028.016 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION WORK- PYACTIVITYPAGE #20210506T204028.016 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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

	performStream_1();

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
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION WORK- PYACTIVITYPAGE #20210506T204028.016 GMT */
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
	"Rule-HTML-Section:PYACTIVITYPAGE", 
	"Rule-HTML-Section:PXACTIVITYPAGETEMPLATE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYACTIVITYPAGE","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- PYACTIVITYPAGE #20210506T204028.016 GMT","!PYACTIVITYPAGE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",231527478), 
		new DependentRuleInfo("PXACTIVITYPAGETEMPLATE","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- PXACTIVITYPAGETEMPLATE #20210506T204027.719 GMT","!PXACTIVITYPAGETEMPLATE",false,false,"MISSING",100425644)
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
//	RULE-HTML-SECTION WORK- PYACTIVITYPAGE #20210506T204028.016 GMT:20210827T082907.055 GMT
//	RULE-HTML-SECTION WORK- PXACTIVITYPAGETEMPLATE #20210506T204027.719 GMT:20210506T204027.719 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZSECTIONINCLUDEINCELL--(CLIPBOAF2BD5B648774E376BD18CD12B064353F #20180713T133341.324 GMT:20180713T133341.324 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING INSTRING #20180713T131441.635 GMT:20180713T131441.635 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "0c3e5e28c5d86568ec521457e3ee95d4";
	}

	public String getDefinitionAppliesToClass() {
		return "Work-";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pyActivityPage",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pyActivityPage','insKey':'RULE-HTML-SECTION WORK- PYACTIVITYPAGE #20210506T204028.016 GMT','templated':'true','editable':'true','sectionType':'standard'}");
pzLayout_3();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_3() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBodyWrapper_2() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_4();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_4() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	secInfo.put("pxGadgetClass", "PegaGadget-Feed");
	secInfo.put("paramxml","<?xml version=\"1.0\"?><pagedata><pxObjClass>PegaGadget-Feed</pxObjClass><pyIsPostingEnabled>false</pyIsPostingEnabled><pyLabel>Pulse</pyLabel><pyPostContexts REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-PostContext</pxObjClass></rowdata></pyPostContexts><pyDataSources REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyAllowFilter>true</pyAllowFilter><pyClassName>Work-</pyClassName><pyFeedSourceReference>ArchivedPulse</pyFeedSourceReference><pyDataSourceReference/><pySelected>true</pySelected></rowdata></pyDataSources><pySelectedPostTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pyCategory>Message</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Message</pyClassName><pyDescription>Visible to everyone</pyDescription><pyLabel>Post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-globe</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Message</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyDataSourceReference>D_pxPosts</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(1)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyIsSearchEnabled>true</pyIsSearchEnabled><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyMessages</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata><rowdata REPEATINGINDEX=\"2\"><pyCategory>Private</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Post-Private</pyClassName><pyDescription>Visible to specific users</pyDescription><pyLabel>Private post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-eye-off</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Post-Private</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyDataSourceReference>D_pxDirectMessages</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(2)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyIsSearchEnabled>true</pyIsSearchEnabled><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyDirectMessages</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata><rowdata REPEATINGINDEX=\"3\"><pyCategory>Task</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>Work-Cover-Task</pyClassName><pyDescription>Create and assign task</pyDescription><pyLabel>Task</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-clipboard-check</pyImage><pySelected>false</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>pi pi-clipboard-check</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxCreateDateTime</pyPostedWhenReference><pyIconType>iconclass</pyIconType><pyClassName>Work-Cover-Task</pyClassName><pyCommentContext>.pzInsKey</pyCommentContext><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyIsCommentingEnabled>true</pyIsCommentingEnabled><pyDataSourceReference>D_pxTasks</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(3)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyTasks</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><AssignedTo>durab</AssignedTo><CreatedBy>durab</CreatedBy><Application>HelloWorld</Application><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata></pySelectedPostTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pagedata>");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_10","pxFeed", secInfo);
}


public void sectionBodyIncludeInCell_4() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
	}
try {
tools.appendString("  ");
{ String newSectionID = "GID_" + (((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
 
tools.appendString(" ");
{
									ClipboardPage pyDocuments = tools.findPage("pyDocuments",false);
									ClipboardProperty pyDocument = pyDocuments.getProperty("pyDocument");
									String harnessID = tools.getParamValue("pzHarnessID");
									 if(!harnessID.equals("")){
									 ClipboardProperty myDocProp = pyDocument.getPropertyValue(harnessID);
									 ClipboardProperty pyGadgets = myDocProp.getProperty("pyGadgets");
									 if(myDocProp.isEmpty())	 pyDocument.add(harnessID,pyGadgets);
									 ClipboardPage pg_Gadgets = pyGadgets.getPageValue();
									 java.util.Set subscriptsKey = pg_Gadgets.keySet();
									 String oldcontainerIDList = tools.getParamValue("SectionIDList");
									 if(!oldcontainerIDList.equals("")) { 
										 StringTokenizer st = new StringTokenizer(oldcontainerIDList, ":"); 
										 while (st.hasMoreTokens()) {
											 String eachtoken = st.nextToken();
											 java.util.Iterator iter_subscripts = subscriptsKey.iterator();
											 while(iter_subscripts.hasNext()){ 
												 String Key = (String)iter_subscripts.next();
												 if(Key.indexOf(eachtoken) > -1) { 
													 ClipboardProperty paramPageProperty = (ClipboardProperty)pg_Gadgets.get(Key) ;
													 ClipboardPage paramPage = paramPageProperty.getPageValue();
													 pg_Gadgets.remove(Key);
												 } 
											 }
										 } 
									 }
								ClipboardPage pyAdvParams = tools.createPage("PegaGadget-Feed","");
								pyAdvParams.adoptXMLForm("<?xml version=\"1.0\"?><pagedata><pxObjClass>PegaGadget-Feed</pxObjClass><pyIsPostingEnabled>false</pyIsPostingEnabled><pyLabel>Pulse</pyLabel><pyPostContexts REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-PostContext</pxObjClass></rowdata></pyPostContexts><pyDataSources REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyAllowFilter>true</pyAllowFilter><pyClassName>Work-</pyClassName><pyFeedSourceReference>ArchivedPulse</pyFeedSourceReference><pyDataSourceReference/><pySelected>true</pySelected></rowdata></pyDataSources><pySelectedPostTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pyCategory>Message</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Message</pyClassName><pyDescription>Visible to everyone</pyDescription><pyLabel>Post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-globe</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Message</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyDataSourceReference>D_pxPosts</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(1)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyIsSearchEnabled>true</pyIsSearchEnabled><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyMessages</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata><rowdata REPEATINGINDEX=\"2\"><pyCategory>Private</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Post-Private</pyClassName><pyDescription>Visible to specific users</pyDescription><pyLabel>Private post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-eye-off</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Post-Private</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyDataSourceReference>D_pxDirectMessages</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(2)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyIsSearchEnabled>true</pyIsSearchEnabled><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyDirectMessages</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata><rowdata REPEATINGINDEX=\"3\"><pyCategory>Task</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>Work-Cover-Task</pyClassName><pyDescription>Create and assign task</pyDescription><pyLabel>Task</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-clipboard-check</pyImage><pySelected>false</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>pi pi-clipboard-check</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxCreateDateTime</pyPostedWhenReference><pyIconType>iconclass</pyIconType><pyClassName>Work-Cover-Task</pyClassName><pyCommentContext>.pzInsKey</pyCommentContext><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyIsCommentingEnabled>true</pyIsCommentingEnabled><pyDataSourceReference>D_pxTasks</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(3)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyTasks</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><AssignedTo>durab</AssignedTo><CreatedBy>durab</CreatedBy><Application>HelloWorld</Application><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata></pySelectedPostTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pagedata>");
								pyAdvParams.putString("SectionName","pxFeed");
								pyGadgets.add(newSectionID, pyAdvParams);
								 } 
								 } 
								tools.putParamValue("newSectionID",newSectionID); 
} 
tools.appendString(" ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pxFeed"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionCellpyActivityPage588","",false);
}
public void pzLayout_2() {
pzSetExpandParam_3();
pzLayoutBodyWrapper_2();
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	secInfo.put("pxGadgetClass", "PegaGadget-Feed");
	secInfo.put("paramxml","<?xml version=\"1.0\"?><pagedata><pxObjClass>PegaGadget-Feed</pxObjClass><pyIsPostingEnabled>false</pyIsPostingEnabled><pyLabel>Pulse</pyLabel><pyPostContexts REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-PostContext</pxObjClass></rowdata></pyPostContexts><pyDataSources REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyAllowFilter>true</pyAllowFilter><pyClassName>Work-</pyClassName><pyFeedSourceReference>ArchivedPulse</pyFeedSourceReference><pyDataSourceReference/><pySelected>true</pySelected></rowdata></pyDataSources><pySelectedPostTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pyCategory>Message</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Message</pyClassName><pyDescription>Visible to everyone</pyDescription><pyLabel>Post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-globe</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Message</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyDataSourceReference>D_pxPosts</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(1)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyIsSearchEnabled>true</pyIsSearchEnabled><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyMessages</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata><rowdata REPEATINGINDEX=\"2\"><pyCategory>Private</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Post-Private</pyClassName><pyDescription>Visible to specific users</pyDescription><pyLabel>Private post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-eye-off</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Post-Private</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyDataSourceReference>D_pxDirectMessages</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(2)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyIsSearchEnabled>true</pyIsSearchEnabled><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyDirectMessages</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata><rowdata REPEATINGINDEX=\"3\"><pyCategory>Task</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>Work-Cover-Task</pyClassName><pyDescription>Create and assign task</pyDescription><pyLabel>Task</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-clipboard-check</pyImage><pySelected>false</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>pi pi-clipboard-check</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxCreateDateTime</pyPostedWhenReference><pyIconType>iconclass</pyIconType><pyClassName>Work-Cover-Task</pyClassName><pyCommentContext>.pzInsKey</pyCommentContext><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyIsCommentingEnabled>true</pyIsCommentingEnabled><pyDataSourceReference>D_pxTasks</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(3)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyTasks</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><AssignedTo>durab</AssignedTo><CreatedBy>durab</CreatedBy><Application>HelloWorld</Application><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata></pySelectedPostTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pagedata>");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_7","pxFeed", secInfo);
}


public void sectionBodyIncludeInCell_3() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
	return;
	}
try {
tools.appendString("  ");
{ String newSectionID = "GID_" + (((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
 
tools.appendString(" ");
{
									ClipboardPage pyDocuments = tools.findPage("pyDocuments",false);
									ClipboardProperty pyDocument = pyDocuments.getProperty("pyDocument");
									String harnessID = tools.getParamValue("pzHarnessID");
									 if(!harnessID.equals("")){
									 ClipboardProperty myDocProp = pyDocument.getPropertyValue(harnessID);
									 ClipboardProperty pyGadgets = myDocProp.getProperty("pyGadgets");
									 if(myDocProp.isEmpty())	 pyDocument.add(harnessID,pyGadgets);
									 ClipboardPage pg_Gadgets = pyGadgets.getPageValue();
									 java.util.Set subscriptsKey = pg_Gadgets.keySet();
									 String oldcontainerIDList = tools.getParamValue("SectionIDList");
									 if(!oldcontainerIDList.equals("")) { 
										 StringTokenizer st = new StringTokenizer(oldcontainerIDList, ":"); 
										 while (st.hasMoreTokens()) {
											 String eachtoken = st.nextToken();
											 java.util.Iterator iter_subscripts = subscriptsKey.iterator();
											 while(iter_subscripts.hasNext()){ 
												 String Key = (String)iter_subscripts.next();
												 if(Key.indexOf(eachtoken) > -1) { 
													 ClipboardProperty paramPageProperty = (ClipboardProperty)pg_Gadgets.get(Key) ;
													 ClipboardPage paramPage = paramPageProperty.getPageValue();
													 pg_Gadgets.remove(Key);
												 } 
											 }
										 } 
									 }
								ClipboardPage pyAdvParams = tools.createPage("PegaGadget-Feed","");
								pyAdvParams.adoptXMLForm("<?xml version=\"1.0\"?><pagedata><pxObjClass>PegaGadget-Feed</pxObjClass><pyIsPostingEnabled>false</pyIsPostingEnabled><pyLabel>Pulse</pyLabel><pyPostContexts REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-PostContext</pxObjClass></rowdata></pyPostContexts><pyDataSources REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyAllowFilter>true</pyAllowFilter><pyClassName>Work-</pyClassName><pyFeedSourceReference>ArchivedPulse</pyFeedSourceReference><pyDataSourceReference/><pySelected>true</pySelected></rowdata></pyDataSources><pySelectedPostTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pyCategory>Message</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Message</pyClassName><pyDescription>Visible to everyone</pyDescription><pyLabel>Post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-globe</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Message</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyDataSourceReference>D_pxPosts</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(1)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyIsSearchEnabled>true</pyIsSearchEnabled><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyMessages</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata><rowdata REPEATINGINDEX=\"2\"><pyCategory>Private</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Post-Private</pyClassName><pyDescription>Visible to specific users</pyDescription><pyLabel>Private post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-eye-off</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Post-Private</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyDataSourceReference>D_pxDirectMessages</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(2)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyIsSearchEnabled>true</pyIsSearchEnabled><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyDirectMessages</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata><rowdata REPEATINGINDEX=\"3\"><pyCategory>Task</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>Work-Cover-Task</pyClassName><pyDescription>Create and assign task</pyDescription><pyLabel>Task</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-clipboard-check</pyImage><pySelected>false</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>pi pi-clipboard-check</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxCreateDateTime</pyPostedWhenReference><pyIconType>iconclass</pyIconType><pyClassName>Work-Cover-Task</pyClassName><pyCommentContext>.pzInsKey</pyCommentContext><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyIsCommentingEnabled>true</pyIsCommentingEnabled><pyDataSourceReference>D_pxTasks</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(3)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyTasks</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><AssignedTo>durab</AssignedTo><CreatedBy>durab</CreatedBy><Application>HelloWorld</Application><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata></pySelectedPostTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pagedata>");
								pyAdvParams.putString("SectionName","pxFeed");
								pyGadgets.add(newSectionID, pyAdvParams);
								 } 
								 } 
								tools.putParamValue("newSectionID",newSectionID); 
} 
tools.appendString(" ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pxFeed"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}


public void 
pzGenerateAdvParam_1() {{ String newSectionID = "GID_" + (((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique());
{
ClipboardPage pyDocuments = tools.findPage("pyDocuments",false);
ClipboardProperty pyDocument = pyDocuments.getProperty("pyDocument");
String harnessID = tools.getParamValue("pzHarnessID");
 if(!harnessID.equals("")){
 ClipboardProperty myDocProp = pyDocument.getPropertyValue(harnessID);
 ClipboardProperty pyGadgets = myDocProp.getProperty("pyGadgets");
 if(myDocProp.isEmpty())	 pyDocument.add(harnessID,pyGadgets);
 ClipboardPage pg_Gadgets = pyGadgets.getPageValue();
 java.util.Set subscriptsKey = pg_Gadgets.keySet();
 String oldcontainerIDList = tools.getParamValue("SectionIDList");
 if(!oldcontainerIDList.equals("")) { 
 StringTokenizer st = new StringTokenizer(oldcontainerIDList, ":"); 
 while (st.hasMoreTokens()) {
 String eachtoken = st.nextToken();
 java.util.Iterator iter_subscripts = subscriptsKey.iterator();
 while(iter_subscripts.hasNext()){ 
 String Key = (String)iter_subscripts.next();
 if(Key.indexOf(eachtoken) > -1) { 
 ClipboardProperty paramPageProperty = (ClipboardProperty)pg_Gadgets.get(Key) ;
 ClipboardPage paramPage = paramPageProperty.getPageValue();
 pg_Gadgets.remove(Key);
 } 
	 }
	 } 
		 }
		ClipboardPage pyAdvParams = tools.createPage("PegaGadget-Feed","");
		try{pyAdvParams.adoptXMLForm("<?xml version=\"1.0\"?><pagedata><pxObjClass>PegaGadget-Feed</pxObjClass><pyIsPostingEnabled>false</pyIsPostingEnabled><pyLabel>Pulse</pyLabel><pyPostContexts REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-PostContext</pxObjClass></rowdata></pyPostContexts><pyDataSources REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyAllowFilter>true</pyAllowFilter><pyClassName>Work-</pyClassName><pyFeedSourceReference>ArchivedPulse</pyFeedSourceReference><pyDataSourceReference/><pySelected>true</pySelected></rowdata></pyDataSources><pySelectedPostTypes REPEATINGTYPE=\"PageList\"><rowdata REPEATINGINDEX=\"1\"><pyCategory>Message</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Message</pyClassName><pyDescription>Visible to everyone</pyDescription><pyLabel>Post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-globe</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Message</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyDataSourceReference>D_pxPosts</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(1)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyIsSearchEnabled>true</pyIsSearchEnabled><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyMessages</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata><rowdata REPEATINGINDEX=\"2\"><pyCategory>Private</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>PegaSocial-Post-Private</pyClassName><pyDescription>Visible to specific users</pyDescription><pyLabel>Private post</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-eye-off</pyImage><pySelected>true</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>.pyUser</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxUpdateDateTime</pyPostedWhenReference><pyIconType>user</pyIconType><pyClassName>PegaSocial-Post-Private</pyClassName><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyDataSourceReference>D_pxDirectMessages</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(2)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyIsSearchEnabled>true</pyIsSearchEnabled><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyDirectMessages</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata><rowdata REPEATINGINDEX=\"3\"><pyCategory>Task</pyCategory><pxObjClass>@baseclass</pxObjClass><pyClassName>Work-Cover-Task</pyClassName><pyDescription>Create and assign task</pyDescription><pyLabel>Task</pyLabel><pyPostTypeConfigureWhen>true</pyPostTypeConfigureWhen><pyImage>pi pi-clipboard-check</pyImage><pySelected>false</pySelected><pyFeedDataSource><pyTitleViewReference>pyPostTitleWithContext</pyTitleViewReference><pyIconReference>pi pi-clipboard-check</pyIconReference><pyTitleType>section</pyTitleType><pyPostedWhenReference>.pxCreateDateTime</pyPostedWhenReference><pyIconType>iconclass</pyIconType><pyClassName>Work-Cover-Task</pyClassName><pyCommentContext>.pzInsKey</pyCommentContext><pyMessageReference>pyPostDetails</pyMessageReference><pyMessageViewReference>pyPostDetails</pyMessageViewReference><pyIsCommentingEnabled>true</pyIsCommentingEnabled><pyDataSourceReference>D_pxTasks</pyDataSourceReference><pxObjClass>Embed-Feed-DataSource</pxObjClass><pyMessageType>Section</pyMessageType><pyAllowFilter>true</pyAllowFilter><pyNote>pyTemp_Section.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pzSectionParamPage.pySelectedPostTypes(3)</pyNote><pyTitleReference>pyPostTitleWithContext</pyTitleReference><pyPostConfiguredSource>true</pyPostConfiguredSource><pyLabel>pyTasks</pyLabel><pySelected>true</pySelected><pzSourceDataPageParameters><Context/><AssignedTo>durab</AssignedTo><CreatedBy>durab</CreatedBy><Application>HelloWorld</Application><retrieveTags>true</retrieveTags></pzSourceDataPageParameters></pyFeedDataSource></rowdata></pySelectedPostTypes><pxWarningsToDisplay REPEATINGTYPE=\"PageList\"/></pagedata>");
		}catch(Exception e){oLog.error("Error parsing XML in pzGenerateAdvParam");}
		pyAdvParams.putString("SectionName","pxFeed");
		pyGadgets.add(newSectionID, pyAdvParams);
			 } 
				 } 
				tools.putParamValue("newSectionID",newSectionID); } 
				}
public void pzLayoutBodyWrapper_1() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_2();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_2() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_6","PulseGadget", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "PulseGadget"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionCellpyActivityPage261","",false);
}
public void pzLayout_1() {
pzSetExpandParam_2();
pzLayoutBodyWrapper_1();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_3","PulseGadget", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String inputType = "Input";
	boolean popReadOnly = false;
	String readOnlyParam = tools.getParamValue("ReadOnly");
	if(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true") || !tools.hasInputEnabled()){
		if(!(readOnlyParam.equalsIgnoreCase("-1") || readOnlyParam.equalsIgnoreCase("true")) && !tools.hasInputEnabled()){
			popReadOnly = true;
		}
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "PulseGadget"; 
	String usingPage = null;
	ClipboardPage pg_usingPage = null;
	if(usingPage != null && !"".equals(usingPage)){
		pg_usingPage = tools.findPage(usingPage);
	}
		PRStackFrame pz_StackFrame1 = null;
	String lazyInfoBefore = null;
	if(pg_usingPage != null){
	 lazyInfoBefore = tools.getParamValue("lazyLoadInfo");
		pz_StackFrame1 = pega.pushStackFrame(null, pg_usingPage, false, false,PRStackFrame.Type.APPEND_STREAM,"Rule-HTML-Section",sectionName);
	tools.putParamValue("lazyLoadInfo","");
	}
	if(usingPage == null || "".equals(usingPage) || (pg_usingPage != null &&  !pg_usingPage.getString("pxObjClass").trim().equals(""))){
	String tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	if(!tools.getParamValue("SecBaseRefParam").equals("false") ){
		tools.putParamValue("section_base_ref"," NAME='BASE_REF' BASE_REF='"+pega_uiengine_harness.pzGetUsingPageName(usingPage,pg_usingPage)+"'");
	}
	pzAuto.emitIncludeStreamReference(sectionName, null, inputType, "Rule-HTML-Section",null );
		tools.putParamValue("section_base_ref","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	}
	if(pg_usingPage != null){
	String lazyInfoAfter = tools.getParamValue("lazyLoadInfo");
		pega.popStackFrame(pz_StackFrame1,false);
	tools.putParamValue("lazyLoadInfo",lazyInfoBefore + lazyInfoAfter);
	}
	if(popReadOnly){
		tools.getParameterPage().remove("SectionReadOnly");
	}
}


public void generateClientWhenDiv_1() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
if(currentTemplatingStatus =='N')
tools.appendString(" style='");
else
clientWhenAttr += "style='";
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
}
public String 
getUIActionsMetaData_1() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();
	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
}


public int simpleLayoutCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" o1! wxpyShowArchivedCase","!pyShowArchivedCase","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","PulseGadget",".pyRegions(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-top-spacing remove-left-spacing    " + pzSection.getCustomStyle(false, "","padding-t-1x","padding-t-1x")  + " flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_1();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("partialClass","remove-top-spacing remove-left-spacing flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","padding-t-1x");
	pgCells.put("customRWStyles","padding-t-1x");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = true;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o1! wxpyShowArchivedCase",pxUniqueStreamHash+"_5");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_5");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","!pyShowArchivedCase");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_5");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" o1! wxpyShowArchivedCase", pxUniqueStreamHash+"_5"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","PulseGadget",".pyRegions(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_1();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxpyShowArchivedCase","pyShowArchivedCase","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pxFeed",".pyRegions(1).pyCells(2)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-bottom-spacing remove-right-spacing    " + pzSection.getCustomStyle(false, "","padding-1x","padding-1x")  + " flex flex-row '  STRING_TYPE='sub_section' RESERVE_SPACE='false'>");
	String tempRenderSingle = "";
	
	pzGenerateAdvParam_1();
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_3();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-bottom-spacing remove-right-spacing flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("customROStyles","padding-1x");
	pgCells.put("customRWStyles","padding-1x");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pgCells.put("pyVisibility","true");
	IUIComponentMetadata pxWhenIdentifiersForCell = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	isExpression = false;
	isOffline = pzAuto.getUIComponentRuntime().getRuntimeContextTree().isOfflinePackaging();
	if (!isExpression && isOffline) {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpyShowArchivedCase",pxUniqueStreamHash+"_9");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_9");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pyShowArchivedCase");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Work-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_9");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpyShowArchivedCase", pxUniqueStreamHash+"_9"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pxFeed",".pyRegions(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_2();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpyActivityPageB","",false);
}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash2 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash2 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash2 != null && !"".equals(spxUniqueStreamHash2)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash2,pxUniqueStreamHash+"_2");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	boolean bIsIe = (pzAuto.getBrowserUtils().isIE());
	String bIsWrapperAdded=tools.getParamValue("bIsWrapperAdded");
	String bIsGridLayout=tools.getParamValue("bIsGridLayout");
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201809261225530375679") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("<div class='flex-grid-table-wrapper'><div class='flex-grid-tablecell-wrapper'>");
		tools.putParamValue("bIsWrapperAdded", "true");
		}
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)','region':'Main content'}") + " class='" + "flex  content  layout-content-stacked content-stacked main-content" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash2 != null && !"".equals(spxUniqueStreamHash2)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_2");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("customClassName","main-content");
		pg_dlmeta.put("format","stacked");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)','region':'Main content'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("clear","false");
		pg_dlmeta.put("lMode","SimpleDiv");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_1(index);
	}else{
		index=simpleLayoutTemplateCell_1(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_2(index);
	}else{
		index=simpleLayoutTemplateCell_2(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		if(bIsIe && "true".equals(bIsGridLayout)&&!"true".equals(bIsWrapperAdded)){
		tools.appendString("</div></div>");
		tools.putParamValue("bIsWrapperAdded", "false");
		}
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_1() {
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	String expressionId_BV = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression_BV = null;
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpyActivityPageB";
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)','region':'Main content'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","SimpleDiv");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_1();
	containerComponent.endComponent();
	}
public void pzLayout_3() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_3();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_1();
tools.putParamValue("pyInlineStyleSec","");
}
}

private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Work-");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION WORK- PYACTIVITYPAGE #20210506T204028.016 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pyActivityPage");
	oStreamProperties_1.put("pyRuleSetVersion", "04-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION WORK- PYACTIVITYPAGE #20210506T204028.016 GMT", "Work- pyActivityPage", "Theme-Cosmos", "04-01-01", "20210827T082907.055 GMT");
}
