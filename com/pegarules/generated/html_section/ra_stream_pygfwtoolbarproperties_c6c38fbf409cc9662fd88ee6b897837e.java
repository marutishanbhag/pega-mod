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
 * Builds JSP stream RULE-!PYGFWTOOLBARPROPERTIES.
 */
public class ra_stream_pygfwtoolbarproperties_c6c38fbf409cc9662fd88ee6b897837e extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pyGFWToolbarProperties.Rule_Obj_Flow.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1719938904;
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
	public ra_stream_pygfwtoolbarproperties_c6c38fbf409cc9662fd88ee6b897837e(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "91cd85e5a3c22fbf26c3e68360028153f480961b";
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
/* Instance RULE-HTML-SECTION RULE- PYGFWTOOLBARPROPERTIES #20180713T140935.753 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "91cd85e5a3c22fbf26c3e68360028153f480961b";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pyGFWToolbarProperties",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE- PYGFWTOOLBARPROPERTIES #20180713T140935.753 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE- PYGFWTOOLBARPROPERTIES #20180713T140935.753 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE- PYGFWTOOLBARPROPERTIES #20180713T140935.753 GMT */
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
	"Rule-HTML-Section:PYGFWTOOLBARPROPERTIES", 
	"Rule-HTML-Property:PXICON", 
	"Rule-File-Binary:WEBWB!PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG", 
	"Rule-File-Binary:MXGRAPHCORE!PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG", 
	"Rule-File-Binary:WEBWB!PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PYGFWTOOLBARPROPERTIES","Rule-HTML-Section","RULE-",false,"","Pega-ProcessArchitect","08-01-01","RULE-HTML-SECTION RULE- PYGFWTOOLBARPROPERTIES #20180713T140935.753 GMT","!PYGFWTOOLBARPROPERTIES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1719938904), 
		new DependentRuleInfo("PXICON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT","PXICON",true,false,"ABSOLUTE_CLASSLESS",-794576025), 
		new DependentRuleInfo("WEBWB!PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG","Rule-File-Binary","",false,"","","","","WEBWB!PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("MXGRAPHCORE!PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG","Rule-File-Binary","",false,"","","","","MXGRAPHCORE!PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG","Rule-File-Binary","",false,"","Pega-ProcessArchitect","","RULE-FILE-BINARY WEBWB PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG #20180713T140748.296 GMT","WEBWB!PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG",true,false,"ABSOLUTE_CLASSLESS",1)
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
//	RULE-HTML-SECTION RULE- PYGFWTOOLBARPROPERTIES #20180713T140935.753 GMT:20180713T140935.753 GMT
//	RULE-HTML-PROPERTY PXICON #20190131T183501.575 GMT:20190131T183501.575 GMT
//	RULE-FILE-BINARY WEBWB PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG #20180713T140748.296 GMT:20180713T140748.296 GMT
//	RULE-FILE-BINARY WEBWB PZMXGEDITOR_TOOLBARICONS_UNSELECTED!PNG #20180713T140748.296 GMT:20180713T140748.296 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_1(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATECLIENTWHENDIV #20180713T133339.714 GMT:20180713T133339.714 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONRUNSCRIPT #20190828T114745.385 GMT:20190919T061924.069 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSETSTYLE #20180713T133344.632 GMT:20180713T133344.632 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEICON #20220323T120107.529 GMT:20220323T120107.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZSCRIPTTAGFORMATTING #20180713T133346.571 GMT:20180713T133346.571 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "af649f0946098c75a737e91606a39c7c";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-";
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
  pzSection.beginSection("pyGFWToolbarProperties",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pyGFWToolbarProperties','insKey':'RULE-HTML-SECTION RULE- PYGFWTOOLBARPROPERTIES #20180713T140935.753 GMT','sectionType':'standard'}");
pzLayout_1();
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
config = new HashMap<String, String>();
config.put("pyFunctionName", "ViewerManager.executeAction");
pega.getUIEngine().getUIAction("runScript", config).register();
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_1() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public String 
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-52px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"showPropertyPanel\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
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


public void pxIcon_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("<span ");tools.appendString(">");
	 }if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
	IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
	java.util.List<String> ctPropRefs = new ArrayList<String>();
	IUIComponent ctrlComponent = pzAuto.getUIComponent();
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage1.put("generateName","true");
	cellPage.put("pyStreamName","pyGFWToolbarProperties");
	cellPage.put("pyCellID","1");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDataPageInfo();
	String repeatIndx = "";
	boolean disable = false;
	if(StringUtils.isBlank(expressionId)){
	expressionId = pxUniqueStreamHash+"_4";
	}
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression(com.pega.pegarules.priv.runtime.ui.IExpressionEvaluator.DISABLE_WHEN, "Param.isShapeSelected != true", expressionId);
	if(expressionId !=null && expressionId.length() > 0){
	modePage1.put("pyExpressionId",expressionId);
	}
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","View properties for the selected shape\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("View properties for the selected shape", ".pyActionPrompt");
	}
	pyTooltip = "View properties for the selected shape";
	modePage1.put("tooltip",pyTooltip);
	modePage1.put("helpertype","tooltip");
	modePage1.put("isActionabale","true");
	modePage1.put("isClickable","true");
	String pyFormatValue = "";
	StringMap whenHc=new HashStringMap();
	whenHc.putString("pyBlockName", "pyIsHybridClient");
	modePage1.put("pyIsSprite","true");
	String style="";
	String spriteUrl = "";
	if(tools.evaluateWhen(whenHc) || pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	spriteUrl = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAnEAAABPCAYAAACEYpPMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDpGNDAyOUU5NDBGMjA2ODExODIyQUQ0NjI2QzZDMTY4NyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpFQ0Y5NjZBQjlDQTMxMUUyOTA4NTk3MjBDM0YxODNDNiIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpFQ0Y5NjZBQTlDQTMxMUUyOTA4NTk3MjBDM0YxODNDNiIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6RjUwMjlFOTQwRjIwNjgxMTgyMkFENDYyNkM2QzE2ODciIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6RjQwMjlFOTQwRjIwNjgxMTgyMkFENDYyNkM2QzE2ODciLz4gPC9yZGY6RGVzY3Jp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";
	}
	else{
	spriteUrl = "webwb/pzmxgeditor_toolbaricons_unselected_1574427382.png!!.png";
	}
	modePage1.put("src",spriteUrl);
	modePage1.put("leftOffset","-52");
	modePage1.put("pyIconWidth","26");
	modePage1.put("pyIconHeight","26");
	if(disable){
	modePage1.put("pyDisabled",disable+"");
	}
	modePage1.put("iconSrc","image");
	modePage1.put("pyFormatTypeActionable","none");
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20150623072654018131000") + " ");
	String spxUniqueStreamHash5 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash5 != null && !"".equals(spxUniqueStreamHash5)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash5,pxUniqueStreamHash+"_5");
	modePage1.put("pyActionStringID",pxUniqueStreamHash+"_5");
	}
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_icon.js");
	ctrlComponent.beginComponent("pxIcon",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
	} else {

		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pyGFWToolbarProperties_"+ referenceString+ "_1'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && false && false)){ 
			String repeatIndx = "";
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","View properties for the selected shape\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		tools.appendString("<div id='CT' ");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) 
		tools.appendString(" thread_name = '"+tools.getThread().getName()+"' ");
		tools.appendString(" name='.isShapeSelected' DISABLE_WHEN=\"Param.isShapeSelected != true\" >");
						try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
							changeTracker.trackValueChanges("Param.isShapeSelected", -1);
						}}catch(Exception e){}
			if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "Param.isShapeSelected != true", null, false)){
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20150623072654018131000") + "  ");
		tools.appendString("onclick_func='pd(event);' href='' ");
		tools.appendString(" data-ctl='Icon' "); tools.appendString(" IsSprite='true' href_original='' class='cursordefault' disabled='disabled' style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAnEAAABPCAYAAACEYpPMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDpGNDAyOUU5NDBGMjA2ODExODIyQUQ0NjI2QzZDMTY4NyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpFQ0Y5NjZBQjlDQTMxMUUyOTA4NTk3MjBDM0YxODNDNiIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpFQ0Y5NjZBQTlDQTMxMUUyOTA4NTk3MjBDM0YxODNDNiIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6RjUwMjlFOTQwRjIwNjgxMTgyMkFENDYyNkM2QzE2ODciIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6RjQwMjlFOTQwRjIwNjgxMTgyMkFENDYyNkM2QzE2ODciLz4gPC9yZGY6RGVzY3Jp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");
		}
		else{
		
		tools.appendString("webwb/pzmxgeditor_toolbaricons_unselected_1574427382.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-52px -52px; width:26px; height:26px;' ");
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-52px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-52px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"showPropertyPanel\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
				tools.appendString(" disabled ");
			} else {
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20150623072654018131000") + "  ");
		tools.appendString("onclick='pd(event);' href='' ");
		tools.appendString("tabindex='0' ");
		tools.appendString("IsSprite='true' data-ctl='Icon' "); tools.appendString("style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAnEAAABPCAYAAACEYpPMAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA2hpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDpGNDAyOUU5NDBGMjA2ODExODIyQUQ0NjI2QzZDMTY4NyIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpFQ0Y5NjZBQjlDQTMxMUUyOTA4NTk3MjBDM0YxODNDNiIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpFQ0Y5NjZBQTlDQTMxMUUyOTA4NTk3MjBDM0YxODNDNiIgeG1wOkNyZWF0b3JUb29sPSJBZG9iZSBQaG90b3Nob3AgQ1M2IChNYWNpbnRvc2gpIj4gPHhtcE1NOkRlcml2ZWRGcm9tIHN0UmVmOmluc3RhbmNlSUQ9InhtcC5paWQ6RjUwMjlFOTQwRjIwNjgxMTgyMkFENDYyNkM2QzE2ODciIHN0UmVmOmRvY3VtZW50SUQ9InhtcC5kaWQ6RjQwMjlFOTQwRjIwNjgxMTgyMkFENDYyNkM2QzE2ODciLz4gPC9yZGY6RGVzY3Jp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");
		}
		else{
		
		tools.appendString("webwb/pzmxgeditor_toolbaricons_unselected_1574427382.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-52px top; width:26px; height:26px;' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-52px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-52px -26px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		tools.appendString("[\"runScript\", [\"ViewerManager.executeAction(\\\"showPropertyPanel\\\")\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
			}
			tools.appendString(" ></a>");
		tools.appendString(" </div> ");
		}		}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }		tools.putParamValue("doAutoFormatting", "false");
		tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}		} catch (Exception e) {

		
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'		&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }			}


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
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing remove-right-spacing remove-left-spacing   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxIcon_1();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing remove-right-spacing remove-left-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20150623072654018131000-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxIcon");
	pgCells.put("forLabel",".pyTemplateInputBox");
	pgCells.put("pyAutoHTML","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("pxIcon",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxIcon_1();labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
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
	if(!pzAuto.handleEvaluateWhen(" cffalse","false","cell", "visible" )) {
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-label item-" + Integer.toString(index) + " remove-top-spacing remove-bottom-spacing remove-right-spacing   '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("2015122004264402666586") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead","dataLabelWrite") + "' >");
	String paramName = "isShapeSelected";
	String paramValue = tools.getParamValueCSF(paramName);
	tools.appendString("<input type=\"hidden\" name=\"" + paramName + "\" value='" + paramValue + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption", tools.getParamValue("isShapeSelected")) ) + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	String paramName = "isShapeSelected";
	String paramValue = tools.getParamValue(paramName);
	paramValue = tools.getLocalizedTextForString("pyCaption",paramValue);boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","label");
	pgCells.put("labelLit","false");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("partialClass","remove-top-spacing remove-bottom-spacing remove-right-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("2015122004264402666586")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelRead");
	pgCells.put("labelWriteClass","dataLabelWrite");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	pgCells.put("bParam","true");
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	if(!"".equals(dataFieldValueMeta))
	pgCells.put("startFV",dataFieldValueMeta);
	if(!"".equals(paramName))
	pgCells.put("paramName",paramName);
	if(!"".equals(paramValue))
	pgCells.put("paramVal",paramValue);
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" cffalse",pxUniqueStreamHash+"_9");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_9");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","false");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_9");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" cffalse", pxUniqueStreamHash+"_9"); 
	}
	if(pyDLCellVisibility) {
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	}
	if (!isExpression && isOffline) {
	// do nothing
	} else {
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().endVisibleWhen();
	}
	boolean generateCellMetadata = Boolean.parseBoolean(((PegaAPI)tools).getSystemSettings().getDynamic("Pega-UIEngine", "generateCellMetadata"));
	if((generateCellMetadata && pyDLCellVisibility) || !generateCellMetadata) {
	labelName = "isShapeSelected";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	}
	String uiFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
	if(!"".equals(uiFieldValueMeta)){
	pgCells.put("stopFV",uiFieldValueMeta);
	}
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpyGFWToolbarPropertiesB","",false);
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
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201807101541260386330") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + " content  layout-content-inline_middle content-inline_middle  clearfix" + "'  ");
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
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
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
	if(!StringUtils.isBlank(expressionId)) {
		metadataPage.put("pyExpressionId",expressionId);
	}
	if(!StringUtils.isBlank(expressionId_BV)) {
		metadataPage.put("expressionId_BV",expressionId_BV);
	}
	String paramName = "EXPANDEDSubSectionpyGFWToolbarPropertiesB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_1();
	containerComponent.endComponent();
	}
public void pzLayout_1() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_1();
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
	oStreamProperties_1.put("pyClassName", "Rule-");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE- PYGFWTOOLBARPROPERTIES #20180713T140935.753 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pyGFWToolbarProperties");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE- PYGFWTOOLBARPROPERTIES #20180713T140935.753 GMT", "Rule- pyGFWToolbarProperties", "Pega-ProcessArchitect", "08-01-01", "20180713T140935.753 GMT");
}
