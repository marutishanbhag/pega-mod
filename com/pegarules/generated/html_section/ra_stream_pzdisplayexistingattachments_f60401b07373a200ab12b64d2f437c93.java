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
 * Builds JSP stream RULE-APPLICATION!PZDISPLAYEXISTINGATTACHMENTS.
 */
public class ra_stream_pzdisplayexistingattachments_f60401b07373a200ab12b64d2f437c93 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzDisplayExistingAttachments.Rule_Application.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -1533364501;
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
	public ra_stream_pzdisplayexistingattachments_f60401b07373a200ab12b64d2f437c93(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "7ae98e25954f6c2ae1593509566553408b36fc64";
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
/* Instance RULE-HTML-SECTION RULE-APPLICATION PZDISPLAYEXISTINGATTACHMENTS #20180713T140855.991 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "7ae98e25954f6c2ae1593509566553408b36fc64";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzDisplayExistingAttachments",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-APPLICATION PZDISPLAYEXISTINGATTACHMENTS #20180713T140855.991 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-APPLICATION PZDISPLAYEXISTINGATTACHMENTS #20180713T140855.991 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-APPLICATION PZDISPLAYEXISTINGATTACHMENTS #20180713T140855.991 GMT */
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
	"Rule-HTML-Section:PZDISPLAYEXISTINGATTACHMENTS", 
	"Rule-Obj-Property:PXSUBSCRIPT", 
	"Rule-HTML-Property:PXDELETELISTITEM", 
	"Rule-File-Binary:WEBWB!PYGRIDICONS!PNG", 
	"Rule-File-Binary:WEBWB!PYGRIDICONS!PNG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZDISPLAYEXISTINGATTACHMENTS","Rule-HTML-Section","RULE-APPLICATION",false,"","Pega-ProcessArchitect","08-01-01","RULE-HTML-SECTION RULE-APPLICATION PZDISPLAYEXISTINGATTACHMENTS #20180713T140855.991 GMT","!PZDISPLAYEXISTINGATTACHMENTS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1533364501), 
		new DependentRuleInfo("PXSUBSCRIPT","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXSUBSCRIPT #20180713T131155.847 GMT","!PXSUBSCRIPT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXDELETELISTITEM","Rule-HTML-Property","",false,"","Pega-Gadgets","08-01-01","RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT","PXDELETELISTITEM",true,false,"ABSOLUTE_CLASSLESS",-991878613), 
		new DependentRuleInfo("WEBWB!PYGRIDICONS!PNG","Rule-File-Binary","",false,"","","","","WEBWB!PYGRIDICONS!PNG",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("WEBWB!PYGRIDICONS!PNG","Rule-File-Binary","",false,"","Pega-Gadgets","","RULE-FILE-BINARY WEBWB PYGRIDICONS!PNG #20180713T133416.139 GMT","WEBWB!PYGRIDICONS!PNG",true,false,"ABSOLUTE_CLASSLESS",1)
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
//	RULE-HTML-SECTION RULE-APPLICATION PZDISPLAYEXISTINGATTACHMENTS #20180713T140855.991 GMT:20180713T140855.991 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXSUBSCRIPT #20180713T131155.847 GMT:20180713T131155.847 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXSUBSCRIPT #20180713T131155.847 GMT:20180713T131155.847 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-FILE-BINARY WEBWB PYGRIDICONS!PNG #20180713T133416.139 GMT:20180713T133416.139 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXSUBSCRIPT #20180713T131155.847 GMT:20180713T131155.847 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXSUBSCRIPT #20180713T131155.847 GMT:20180713T131155.847 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXSUBSCRIPT #20180713T131155.847 GMT:20180713T131155.847 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXSUBSCRIPT #20180713T131155.847 GMT:20180713T131155.847 GMT
//	RULE-HTML-PROPERTY PXDELETELISTITEM #20180713T133433.554 GMT:20180713T133433.554 GMT
//	RULE-FILE-BINARY WEBWB PYGRIDICONS!PNG #20180713T133416.139 GMT:20180713T133416.139 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXSUBSCRIPT #20180713T131155.847 GMT:20180713T131155.847 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXSUBSCRIPT #20180713T131155.847 GMT:20180713T131155.847 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	pzLayout_1(
//	pzLayout_2(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS #20180713T131438.133 GMT:20180713T131438.133 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION GRID PZMIGRATEGRIDRIGHTCLICKACTION #20180713T133337.796 GMT:20180713T133337.796 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLCONTENT--(CLIPBOARDP5D6D7F3B008E0E7A7CAF87FF7A199E1A #20211213T082142.472 GMT:20221011T082144.112 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECELLDEFAULTVALUES #20180713T133337.840 GMT:20180713T133337.840 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEGRIDHTML--(STRINGBUFFER,429DDD37C5C7E726C74541FA5CF54A75 #20230911T050930.106 GMT:20230911T050930.106 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENARATEGRIDAUTOMATIONID--(STRDDC8C1CF07B20BEC2A04AB928C05C9C1 #20190515T135739.302 GMT:20190515T135739.302 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING,BOOLEAN) #20180713T133339.618 GMT:20180713T133339.618 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATENOROWSMESSAGE #20180713T133339.845 GMT:20180713T133339.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS VALIDATEFORLOCALIZATIONTOKEN #20180713T132451.245 GMT:20180713T132451.245 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTION--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.418 GMT:20180713T133341.418 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATECELL #20190311T210918.919 GMT:20190311T210918.919 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEGRID #20180713T133341.458 GMT:20180713T133341.458 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATEROW #20180713T133341.463 GMT:20180713T133341.463 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATESTANDARDHEADERELEMENTS #20180713T133341.476 GMT:20180713T133341.476 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONDELETEROW--(CLIPBOARDPAG0B11B94B773838E3A9E06E99689ED6C8 #20180915T103511.007 GMT:20180915T103511.007 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONEDITITEM #20180713T133343.043 GMT:20180713T133343.043 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLISTSETFOCUS #20180915T103511.020 GMT:20180915T103511.020 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONSETSTYLE #20180713T133344.632 GMT:20180713T133344.632 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEGRIDACTIONS #20180713T133346.223 GMT:20180713T133346.223 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEICON #20220323T120107.529 GMT:20220323T120107.529 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
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
		return "e1e05a64ce71a917d74909856a560010";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Application";
	}
public String getAspect() {
return "Stream";
}
public void pzSectionBody_1() {
pzSection.includeExpressions();
if("true".equals(tools.getParamValue("partialRefresh"))){
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_3")){
pzLayoutBodyWrapper_1();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_4")){
pzLayoutBodyWrapper_2();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
}else{
tools.putSaveValue("sectionUniqueID", ((new StringBuilder("SID")).append((((com.pega.pegarules.priv.context.PegaRequestor) tools.getRequestor()).currentTimeUnique()))).toString());
 if(pzAuto.isForOfflineTemplate()) {
	 try {
		tools.putSaveValue("offlineSectionClassKey", tools.getStepPage().getClassName());
	 } catch(Exception e) { } 
 }
  pzSection.beginSection("pzDisplayExistingAttachments",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzDisplayExistingAttachments','insKey':'RULE-HTML-SECTION RULE-APPLICATION PZDISPLAYEXISTINGATTACHMENTS #20180713T140855.991 GMT','sectionType':'standard'}");
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_5")) ){
pzLayout_1();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pxIsNonTemplateStream = true;
if(( pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_7")) ){
pzLayout_2();
}
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
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
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pySectionName", "pzDisplayExistingAttachments");
config.put("pySectionClass", "Rule-Application");
pega.getUIEngine().getUIAction("deleteRow", config).register();
pega.getUIEngine().getUIAction("nonTemplateGridActions", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBodyWrapper_4() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_4();gridCentreLayout_2();
				gridEndLayout_1();
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void repeatingHeaderCell_5() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='File / Link' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141208030044064026930") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "File / Link"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyCustomFields2colWidthCache2").equals("")){ tools.appendParamCSF("PpyCustomFields2colWidthCache2"); } else { tools.appendString("368"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:26px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "File / Link", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_4() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Description' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140922024435072037793") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(2).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:28px;");tools.appendString("width:"); if(!tools.getParamValueCSF("PpyCustomFields2colWidthCache1").equals("")){ tools.appendParamCSF("PpyCustomFields2colWidthCache1"); } else { tools.appendString("170"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:26px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Description", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzDisplayExistingAttachmentsBB","",false);
}
public void LayoutWrapperTableStart_2() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(2)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzDisplayExistingAttachmentsBB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void 
gridBeginLayout_4() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyCustomFieldsL23=null;

 Map selUniqMap_pyCustomFieldsL23 = null;
tools.appendString("<div  section_index='2' ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyCustomFields");tools.appendString("_pzDisplayExistingAttachments_2'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("readOnlyGrid");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString("");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='true' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='row' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bRefreshLayout='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true' OAFunc='openRuleByKeys' ");
pyCustomFields_1();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='transparent'>");
}


public void gridCentreLayout_2() {/*gridCentreLayout*/
String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
java.util.Map functionsMap = null;
java.util.Map classesMap = null;
pega_rules_utilities.pzRegisterActivity(tools, "pzPerformGridAction");
Map<String, String> config;
config = new HashMap<String, String>();
config.put("pyTargetStream", "pzGridModalHTML");
config.put("gridAction", "SUBMITROW");
config.put("pzActivity", "ShowStream");
pega.getUIEngine().getUIAction("runActivity", config).register();
pega_rules_utilities.pzRegisterActivity(tools, "pzBreakLock");
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					tools.putSaveValue("bUseMenuInline","false");

					pzGridIncludes_1();

					if(tools.getParamValue("partialRefresh").equals("")){

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyCustomFields");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='   ' class='yui-skin-sam gPXAuto grid-responsive-default ");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString(" floated ");

					}tools.appendString("' style='");

					if(!pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("display:"); if(pzAuto.getBrowserUtils().isIE()) {  tools.appendString(" inline; "); } else {  tools.appendString("inline-block;"); } }tools.appendString("' gPropIndex='PpyCustomFields2' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString("");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' ><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyCustomFields2colWidthGBL\" id=\"PpyCustomFields2colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyCustomFields2colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyCustomFields2colWidthGBR\" id=\"PpyCustomFields2colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyCustomFields2colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyCustomFields2colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' style='width:");

					 if(!tools.getParamValue("PpyCustomFields2colWidthGBL").equals("")) { tools.appendParamCSF("PpyCustomFields2colWidthGBL"); } else { 

					tools.appendString("538.0"); } 

					tools.appendString("px;' cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' PG_PROP='.pyCustomFields' PG_PROP_CLASS='Embed-CustomFieldsList' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					 repeatingHeaderCell_4(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_5(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyCustomFields").iterator(); 

					
								 boolean bGenerationForOffline = false; 

					
								 ClipboardProperty propActivePrev = tools.getActive();

					
								 while(itr_3 != null && itr_3.hasNext()){ 

					 
								 if(bGenerationForOffline) {

					
									 break;

					 
								}

					
									 ClipboardProperty cp_eachProp_3 = (ClipboardProperty)itr_3.next(); 

					
									  ClipboardPage pg_eachProp_3 = cp_eachProp_3.getPageValue();

					
									 PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, pg_eachProp_3, false, false);

					
									 tools.putActive(cp_eachProp_3); 

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().getPropertyValue("pxSubscript"))); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().getPropertyValue("pxSubscript")));

					
										 counter++; 

					 rowsDisplayed++; 

					tools.putSaveValue("curRowNum",""+rowsDisplayed );

					
						 tools.putParamValue("expandRL","true");

					
							  if((tools.getParamValue("gridAction").equals("INSERTAFTER") || tools.getParamValue("gridAction").equals("INSERTBEFORE") || tools.getParamValue("gridAction").equals("ADDCHILD")) && tools.getParamValueCSF("editRowIndex").equals(tools.getActive().getEntryHandle())) tools.setInput(true);

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t<tr ");

					tools.appendString(" class=' cellCont ' ");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
}}catch(Exception e){}

					tools.appendString(" PG_SUBSCRIPT='");
try {

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pxSubscript", "normal")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					tools.appendString(" ' id='");

					tools.appendString(tools.getActiveName());tools.appendString("' ");

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_4(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_5(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					 
								 if(bGenerationForOffline) {

					tools.putParamValue("templateRowHandle", "");

					 
								 }

					
						 tools.putParamValue("expandRL","false");

					
										 if((tools.getParamValue("gridAction").equals("INSERTAFTER") || tools.getParamValue("gridAction").equals("INSERTBEFORE") || tools.getParamValue("gridAction").equals("ADDCHILD")) && tools.getParamValueCSF("editRowIndex").equals(tools.getActive().getEntryHandle())) tools.setInput(false);

					
									  pega.popStackFrame(frame_3, false); 

					
								 }

					
									 tools.putActive(propActivePrev);

					
								 }

					
									 tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");}  

					
  { 

					 String rowsDisStr = tools.getSaveValue("rowsDisplayed"); 

					 if(!rowsDisStr.equals("")) {

					
 int rowsDisplayed = Integer.parseInt(rowsDisStr);

					
 if(rowsDisplayed == 0){ 

					
 	if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")) { 

					
 	tools.putParamValue("showOnLoadMsg", "showOnLoadMsg");

					
 	 } String tempRenderSingle = tools.getParamValue("RenderSingle");

					 tools.putParamValue("RenderSingle",""); 

					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"2\" class=\"dataLabelRead gridCell\" >");

					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
								 tools.putParamValue("RenderSingle",""); 

					
									 ClipboardPage tempNoRespg = tools.createPage("Embed-CustomFieldsList", "tempNoRespg");

					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					gridNoRowsMesgIncl_1(); 

					
									  pega.popStackFrame(frame, false);  

					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
 tempNoRespg.removeFromClipboard();

					tools.appendString("\n </td></tr>");

					 } } }   

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					 tools.putSaveValue("isGrid", "false"); 

					 tools.putSaveValue("bUseMenuInline", "false");

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyCustomFields2") && tools.getParamValue("partialRefresh").equals("false")) {

						 tools.putParamValue("partialTrigger",""); 
}

					try { tools.putActive(tools.getPrimaryPage().getProperty("pyLabel")); } catch(Exception e){e.printStackTrace();}

					
					 /* GenerateGrid: End */

					}

					public void LayoutWrapperTableEnd_2() {

					tools.appendString("</td></tr></table>");

					}
public void pzLayout_2() {
String gridLayoutMethodName="pzLayout_2";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& wxpzHasAttachments o2== rx.pxRightLayoutLPInEditMode cffalse","pzHasAttachments && .pxRightLayoutLPInEditMode == false", "layout", "visible" )) {pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_2(); 
pzLayoutBodyWrapper_4();
 LayoutWrapperTableEnd_2(); }
}
tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_3() {
if(pzSection.getLayout().loadLayoutBody()) {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_3();gridCentreLayout_1();
				gridEndLayout_1();
}
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void gridNoRowsMesgIncl_1() {
pzAuto.emitIncludeStreamReference("pyGridNoResultsMessage", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Section", null);
}


public void pxDeleteListItem_2() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_6")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDisplayExistingAttachments_"+ referenceString+ "_125'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Delete item\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20140922024435072241138") + "  ");
		tools.appendString("onclick='pd(event);' href='' ");
		tools.appendString("tabindex='0' ");
		tools.appendString("IsSprite='true' data-ctl='Icon' "); tools.appendString("style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,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");
		}
		else{
		
		tools.appendString("webwb/pygridicons_12892877635.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-128px top; width:16px; height:16px;' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-128px -16px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}} catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_6() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:26px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_2();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_2();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}
public void repeatingHeaderCell_3() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader'");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140922024435072138677") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(3)")); tools.appendString(" id='a3' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","standard_dataLabelRead","standard_dataLabelWrite"));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyCustomFields1colWidthCache3").equals("")){ tools.appendParamCSF("PpyCustomFields1colWidthCache3"); } else { tools.appendString("22"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:26px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString("&nbsp;");if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_2() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='File / Link' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20141208030044064026930") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "File / Link"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(2)")); tools.appendString(" id='a2' class='");
		tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("width:"); if(!tools.getParamValueCSF("PpyCustomFields1colWidthCache2").equals("")){ tools.appendParamCSF("PpyCustomFields1colWidthCache2"); } else { tools.appendString("416"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:26px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "File / Link", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}
public void repeatingHeaderCell_1() {
	boolean bSecured = false;
	String dataColumnProp="";
	java.util.Map classesMap = null;
	String dataPropClass = null;
	int lastDotIndex = 0;
	
	String sortImgHTML = "";
	String sortNoHTML = "";
	String strFieldValue = "";
		tools.appendString("<th title='");
		tools.appendString("'  ");
try {
tools.appendString(" role='columnheader' aria-label='Description' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		tools.appendString("  data-alignWithData=\"true\"  ");
		tools.appendString(" " + pzCell.getTestIdIfEnabled("20140922024435072037793") + " ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		 tools.appendString(' ' + pzCell.getInspectorData("Label",null, null, ".pySections(1).pySectionBody(2).pyTable.pyRows(1).pyCells(1)")); tools.appendString(" id='a1' class='");
		tools.appendString(pzSection.getCustomStyle(true,"","dataLabelRead",""));tools.appendString(" cellCont");tools.appendString(" gridCell");tools.appendString(" highlight-ele ");tools.appendString(" ");tools.appendString("  ");tools.appendString("' pyCellType = 'static' ");
		tools.appendString("");
		tools.appendString("  style='");
		tools.appendString("height:28px;");tools.appendString("width:"); if(!tools.getParamValueCSF("PpyCustomFields1colWidthCache1").equals("")){ tools.appendParamCSF("PpyCustomFields1colWidthCache1"); } else { tools.appendString("228"); } tools.appendString("px;");tools.appendString(""); tools.appendString("'>");
		if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){
									tools.appendString("<DIV class='oflowDiv'"); if(pzAuto.getBrowserUtils().isSafari() || pzAuto.getBrowserUtils().isChrome()){ 
									tools.appendString("style='height:26px;'"); } 
									tools.appendString(">"); } 
									tools.appendString("<div tabindex=0 "); 
									tools.appendString("class='divCont '");tools.appendString("><span class='wspan'></span><div class='cellIn '");tools.appendString(">");
									tools.appendString(tools.getLocalizedTextForString("pyCaption", "Description", StreamBuilder.FMT_LITERAL));if(!pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}if(pzAuto.getBrowserUtils().isIE()){
									tools.appendString("</div>");}
									tools.appendString("</div>");if(pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<span style='position:absolute; top:0px; right: 0px;'>&nbsp;</span>"); } if(!(pzAuto.getBrowserUtils().isIE() || pzAuto.getBrowserUtils().isEdge())){ 
									tools.appendString("</DIV>"); }
	tools.appendString("</th>");
	}


public void pzGridIncludes_1() {
pzAuto.emitIncludeStreamReference("pzGrid_Includes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzDisplayExistingAttachmentsB","",false);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<table role='presentation' " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'REPEATGRID','pgRef':'.pySections(1)'}") + "style='width:100%' cellspacing='0' cellpadding='0' id='EXPAND-OUTERFRAME' ");
String gridLayoutMethodName = tools.getParamValue("gridLayoutMethodName");
String expandParameter = "EXPANDEDSubSectionpzDisplayExistingAttachmentsB";
tools.appendString("PARAM_NAME=\"" + expandParameter);
if(!gridLayoutMethodName.equals("")){
tools.appendString("~" + gridLayoutMethodName);
}
tools.appendString("\"><tr><td>");
}
public void 
gridBeginLayout_3() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

 String strPageMode = "None"; 

 String strPageSize = "20"; 

 String returnTotalCount = ""; 

 ClipboardPage gFCritPage_pyCustomFieldsL19=null;

 Map selUniqMap_pyCustomFieldsL19 = null;
tools.appendString("<div  section_index='1' ");
tools.appendString(" dataSource='");tools.appendString(tools.getStepPage().getReference());tools.appendString(".pyCustomFields");tools.appendString("_pzDisplayExistingAttachments_1'");
tools.appendString(" bRowHovering='false' deferLoadAct='' class=\"");
tools.appendString("repeatContainer gridDefault    ");if(tools.hasInputEnabled()){tools.appendString("readOnlyGrid ");}tools.appendString("readOnlyGrid");
if(pzAuto.isMobile()) { tools.appendString(" grid-mobile "); }tools.appendString("\" id='PEGA_GRID' ");
tools.appendString("");
tools.appendString("bEditable='");tools.appendString(tools.getSaveValue("bEditable"));tools.appendString("'");
tools.appendString(" fixedRow='false' fixedCol='false' bValueList='false' bPageGroup='true' appendAct='' deleteAct='' bTree='false' repeatType='row' editConfig='row' editFormat='' template-name='' bGrid='true' bDragDrop='false' bTreegrid='false' bSorting='false' bRefreshLayout='false' bReportDefinition='false' bLoadActivity='false' bDataObject='false' bCBOptimize='true' OAFunc='openRuleByKeys' ");
pyCustomFields_1();
tools.appendString("><div  id='PEGA_GRID_SKIN' class='transparent'>");
}


public void gridCentreLayout_1() {/*gridCentreLayout*/
String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
java.util.Map functionsMap = null;
java.util.Map classesMap = null;
pega_rules_utilities.pzRegisterActivity(tools, "pzPerformGridAction");
Map<String, String> config;
config = new HashMap<String, String>();
config.put("pyTargetStream", "pzGridModalHTML");
config.put("gridAction", "SUBMITROW");
config.put("pzActivity", "ShowStream");
pega.getUIEngine().getUIAction("runActivity", config).register();
pega_rules_utilities.pzRegisterActivity(tools, "pzBreakLock");
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					tools.putSaveValue("bUseMenuInline","false");

					pzGridIncludes_1();

					if(tools.getParamValue("partialRefresh").equals("")){

					ClipboardProperty prop = tools.getStepPage().getProperty(".pyCustomFields");

					}

					tools.appendString("\n\t\t\t\t\t\t<div id='PEGA_GRID_CONTENT' ParitalRefresh='" + true + "' pyDisplaySelectedValuesFirst='false ' columnList='  .pyTemplateInputBox  ' class='yui-skin-sam gPXAuto grid-responsive-default ");

					if(pega_uiengine_harness.pzInStandardsMode()) {tools.appendString(" floated ");

					}tools.appendString("' style='");

					if(!pega_uiengine_harness.pzInStandardsMode()) {tools.appendString("display:"); if(pzAuto.getBrowserUtils().isIE()) {  tools.appendString(" inline; "); } else {  tools.appendString("inline-block;"); } }tools.appendString("' gPropIndex='PpyCustomFields1' editRowIndex='");

					tools.appendString(tools.getParamValueCSF("editRowIndex"));tools.appendString("' sortProperty = '");

					tools.appendParamCSF("sortProperty");tools.appendString("' sortType='");

					tools.appendParamCSF("sortType");tools.appendString("' bHideGridHdrWhenNoRows=false ");

					if(tools.getParamValueCSF("gridAction").equals("REFRESHLIST")) {

					tools.appendString("gridActiveRow='");

					tools.appendString(tools.getParamValueCSF("gridActiveRow")+"' ");

					tools.getParameterPage().remove("gridActiveRow"); 

					}

					tools.appendString("pyTargetSection=\"\"  threadProcessing=\"false\" bFiltering=\"false\" bRODetails=\"false\" showExpandedAll=\"false\" focusibleGrid = \"true\">\n\t\t\t\t\t\t\t<table id='gridLayoutTable' role='presentation' ");

					tools.appendString("");

					tools.appendString(" class='gridTable ");

					tools.appendString(pzSection.getRepeatStyle());String strSummary = "";

					strSummary = tools.getLocalizedTextForString(".pyCaption", strSummary, StreamBuilder.FMT_NORMAL);

					tools.appendString("' summary='" + StringUtils.crossScriptingFilter(strSummary) + "'");

					tools.appendString(" cellspacing='0' cellpadding='0' id='' ><tr><td valign='top' class='mainGridTableCell' ><input type=\"hidden\" name=\"PpyCustomFields1colWidthGBL\" id=\"PpyCustomFields1colWidthGBL\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyCustomFields1colWidthGBL"));tools.appendString("\" />");

					
						 tools.putParamValue("expandRL","false"); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					tools.appendString("</td><td valign='top' class='mainGridTableCell'><input type=\"hidden\" name=\"PpyCustomFields1colWidthGBR\" id=\"PpyCustomFields1colWidthGBR\" value=\"");

					tools.appendString(tools.getParamValueCSF("PpyCustomFields1colWidthGBR"));

					tools.appendString("\" />\n\t\t\t\t\t\t\t\t\t<div id='gridBody_right' style='' ruleNav=\"\" formatNav=\"\" >\n\t\t\t\t\t\t\t\t\t\t<table class='gridTable ");

					 if(!("".equals(tools.getParamValue("PpyCustomFields1colWidthGBR") ))) { tools.appendString("resizedTable"); } 

					tools.appendString("' style='width:");

					 if(!tools.getParamValue("PpyCustomFields1colWidthGBL").equals("")) { tools.appendParamCSF("PpyCustomFields1colWidthGBL"); } else { 

					tools.appendString("666.0"); } 

					tools.appendString("px;' cellspacing=0 cellpadding=0 id='bodyTbl_right'  summary='' PG_PROP='.pyCustomFields' PG_PROP_CLASS='Embed-CustomFieldsList' PRIM_PAGE='");

					tools.appendString(tools.getPrimaryPage().getName());

					tools.appendString("' GRID_REF_PAGE='");

					tools.appendString(tools.getStepPage().getReference());

					tools.appendString("'>\n\t\t\t\t\t\t\t\t\t\t<tr class='cellCont' >");

					 repeatingHeaderCell_1(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_2(); 

					activeName = tools.getActiveName();  repeatingHeaderCell_3(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
 {int counter = 0; int rowsDisplayed = 0; 

					
								 {Iterator itr_3 = null;

					
								 itr_3 = tools.getProperty(".pyCustomFields").iterator(); 

					
								 boolean bGenerationForOffline = false; 

					
								 ClipboardProperty propActivePrev = tools.getActive();

					
								 while(itr_3 != null && itr_3.hasNext()){ 

					 
								 if(bGenerationForOffline) {

					
									 break;

					 
								}

					
									 ClipboardProperty cp_eachProp_3 = (ClipboardProperty)itr_3.next(); 

					
									  ClipboardPage pg_eachProp_3 = cp_eachProp_3.getPageValue();

					
									 PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, pg_eachProp_3, false, false);

					
									 tools.putActive(cp_eachProp_3); 

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().getPropertyValue("pxSubscript"))); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().getPropertyValue("pxSubscript")));

					
										 counter++; 

					 rowsDisplayed++; 

					tools.putSaveValue("curRowNum",""+rowsDisplayed );

					
						 tools.putParamValue("expandRL","true");

					
							  if((tools.getParamValue("gridAction").equals("INSERTAFTER") || tools.getParamValue("gridAction").equals("INSERTBEFORE") || tools.getParamValue("gridAction").equals("ADDCHILD")) && tools.getParamValueCSF("editRowIndex").equals(tools.getActive().getEntryHandle())) tools.setInput(true);

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t<tr ");

					tools.appendString(" class=' cellCont ' ");

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
}}catch(Exception e){}

					tools.appendString(" PG_SUBSCRIPT='");
try {

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pxSubscript", "normal")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					tools.appendString(" ' id='");

					tools.appendString(tools.getActiveName());tools.appendString("' ");

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" >");

					tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_2(); 

					activeName = tools.getActiveName(); tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");

					 repeatingDataCell_6(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					 
								 if(bGenerationForOffline) {

					tools.putParamValue("templateRowHandle", "");

					 
								 }

					
						 tools.putParamValue("expandRL","false");

					
										 if((tools.getParamValue("gridAction").equals("INSERTAFTER") || tools.getParamValue("gridAction").equals("INSERTBEFORE") || tools.getParamValue("gridAction").equals("ADDCHILD")) && tools.getParamValueCSF("editRowIndex").equals(tools.getActive().getEntryHandle())) tools.setInput(false);

					
									  pega.popStackFrame(frame_3, false); 

					
								 }

					
									 tools.putActive(propActivePrev);

					
								 }

					
									 tools.putSaveValue("rowsDisplayed",rowsDisplayed+"");}  

					
  { 

					 String rowsDisStr = tools.getSaveValue("rowsDisplayed"); 

					 if(!rowsDisStr.equals("")) {

					
 int rowsDisplayed = Integer.parseInt(rowsDisStr);

					
 if(rowsDisplayed == 0){ 

					
 	if(tools.getParamValue("pyGridFilterCriteriaPage").equals("")) { 

					
 	tools.putParamValue("showOnLoadMsg", "showOnLoadMsg");

					
 	 } String tempRenderSingle = tools.getParamValue("RenderSingle");

					 tools.putParamValue("RenderSingle",""); 

					tools.appendString("\n \t<tr id=\"Grid_NoResults\" class=\"cellCont\" >\n \t\t <td colspan=\"3\" class=\"dataLabelRead gridCell\" >");

					
								 String tempRenderSingle1 = tools.getParamValue("RenderSingle");

					
								 tools.putParamValue("RenderSingle",""); 

					
									 ClipboardPage tempNoRespg = tools.createPage("Embed-CustomFieldsList", "tempNoRespg");

					
									 tools.putParamValue("noResParam","tempNoRespg"); 

					
									 PRStackFrame frame = pega.pushStackFrame("GridNoResults", null, tempNoRespg, false, false); 

					gridNoRowsMesgIncl_1(); 

					
									  pega.popStackFrame(frame, false);  

					
								 tools.putParamValue("RenderSingle",tempRenderSingle1); 

					
								 tools.putParamValue("showOnLoadMsg", ""); 

					
 tempNoRespg.removeFromClipboard();

					tools.appendString("\n </td></tr>");

					 } } }   

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t\t\t\t</div></td></tr>\n\t\t\t\t\t\t\t</table>\n\t\t\t\t\t\t</div>\n\t\t\t\t\t\t<div style='clear:left;' ></div>");

					 tools.putSaveValue("isGrid", "false"); 

					 tools.putSaveValue("bUseMenuInline", "false");

					 if( tools.getParamValue("partialTrigger").equals("getChildNodes.pyCustomFields1") && tools.getParamValue("partialRefresh").equals("false")) {

						 tools.putParamValue("partialTrigger",""); 
}

					try { tools.putActive(tools.getPrimaryPage().getProperty("pyLabel")); } catch(Exception e){e.printStackTrace();}

					
					 /* GenerateGrid: End */

					}

					public void 
gridEndLayout_1
					() {

					
 tools.getParameterPage().remove("pyReportPageName"); 
tools.appendString("</div></div>");
}
public void LayoutWrapperTableEnd_1() {
tools.appendString("</td></tr></table>");
}
public void pzLayout_1() {
String gridLayoutMethodName="pzLayout_1";tools.putParamValue("gridLayoutMethodName",gridLayoutMethodName);
if(gridLayoutMethodName.equals(tools.getParamValue("pyCallStreamMethod"))){
tools.putParamValue("pyCallStreamMethod","");}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" o2&& wxpzHasAttachments o2!= rx.pxRightLayoutLPInEditMode cqfalse","pzHasAttachments && .pxRightLayoutLPInEditMode!= \'false\'", "layout", "visible" )) {pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
pzLayoutBodyWrapper_3();
 LayoutWrapperTableEnd_1(); }
}
tools.putParamValue("gridLayoutMethodName","");
}
public void pzLayoutBodyWrapper_2() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_2();gridDoPartialRefresh_2();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}
public void repeatingDataCell_5() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "File / Link"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzDisplayAttachmentName", ".pySections(2).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' ");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:26px;'");}tools.appendString(">");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzDisplayAttachmentName_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void repeatingDataCell_4() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzDisplayAttachmentLink", ".pySections(2).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:28px;");tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzDisplayAttachmentLink_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}
public void pzLayoutBodyWrapper_1() {
tools.putParamValue("bIsGridLayout","true");tools.putParamValue("bIsWrapperAdded","false");
				gridBeginLayout_1();gridDoPartialRefresh_1();
tools.putSaveValue("rowClass","");
tools.putParamValue("bIsGridLayout","false");
}


public void pxDeleteListItem_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_2")){
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzDisplayExistingAttachments_"+ referenceString+ "_125'";
		 String pyFormatValue = "";
		String hrefValue = "";
		String proprefAttr = "";
		boolean sectionIsReadOnly = !(tools.getParamValue("SectionReadOnly") !="-1" && tools.hasInputEnabled());
		if(!(sectionIsReadOnly && true && false)){ 
			String repeatIndx = "";
			repeatIndx = tools.getSaveValue("index");
			if(repeatIndx != null && repeatIndx.matches("^[0-9]+$"))
				repeatIndx = PRNumberFormat.format(null,"",false, null, Integer.parseInt(repeatIndx));
		String tempText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyActionPrompt","Delete item\t" + repeatIndx ,StreamBuilder.FMT_LITERAL));
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("20140922024435072241138") + "  ");
		tools.appendString("onclick='pd(event);' href='' ");
		tools.appendString("tabindex='0' ");
		tools.appendString("IsSprite='true' data-ctl='Icon' "); tools.appendString("style='overflow:hidden;background: url(");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		
		tools.appendString("data:image/png;base64,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");
		}
		else{
		
		tools.appendString("webwb/pygridicons_12892877635.png!!.png");
		}
		tools.appendString(") no-repeat;background-position:-128px top; width:16px; height:16px;' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
			tools.appendString(" title= '");
			tools.appendString(tempText+" ' ");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-hover='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"changeStyle\",[\":event\",\"background-position:-128px -16px&#59;\", \"1\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"removeFromRepeatSource\",[\":event\",\"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
		tools.appendString(" onmouseover = 'pega.c.cbe.processHoverEvent(event)' ");
			tools.appendString(" ></a>");
		}}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");tools.putParamValue("doAutoFormatting", "false");
tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}} catch (Exception e) {


	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }	}


}

public void repeatingDataCell_3() {
	boolean bSuppressTD = "true".equals(tools.getParamValue("bSuppressTD")); 
	if(!bSuppressTD){ 
	tools.appendString("<td  title='");
	tools.appendString("'   ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = ""; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("pxDeleteListItem",".pyTemplateInputBox", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(3)")); tools.appendString("headers='a3'");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:26px;'");}tools.appendString("class='");
	tools.appendString(" gridCell");tools.appendString(" '>");
	} 
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	if(!pzAuto.getBrowserUtils().isIE()){ 
									tools.appendString("<DIV class='oflowDivM '>");pxDeleteListItem_1();
									tools.appendString("</DIV>"); } else { pxDeleteListItem_1();}
	tools.putParamValue("pega_RLindex","");
	if(!bSuppressTD){ 
tools.appendString("</td>");
} 
}


public void pzDisplayAttachmentName_1() {
pzAuto.emitIncludeStreamReference("pzDisplayAttachmentName", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_2() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "File / Link"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzDisplayAttachmentName", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(2)")); tools.appendString(" headers='a2' class='");
	tools.appendString(" gridCell");tools.appendString("  wrapText");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' ");
	if(!pzAuto.getBrowserUtils().isIE()){ tools.appendString("style='height:26px;'");}tools.appendString(">");
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzDisplayAttachmentName_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}


public void pzDisplayAttachmentLink_1() {
pzAuto.emitIncludeStreamReference("pzDisplayAttachmentLink", null, !tools.hasInputEnabled()?"NoInput":"Input", "Rule-HTML-Section", null);
}
public void repeatingDataCell_1() {
	
								 ClipboardProperty activeValue = tools.getActive();
	tools.appendString("<td  title='");
	tools.appendString("'  ");
try {
tools.appendString(" data-importance='secondary' data-attribute-name='");
 String columnHeaderValue = "Description"; if(!columnHeaderValue.contains(" ") && pega_procom_harness.IsParam(columnHeaderValue) && tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1)) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getParamValueCSF(columnHeaderValue.substring(columnHeaderValue.indexOf(".")+1))); }  else if(!columnHeaderValue.contains(" ") && columnHeaderValue.matches(".*[.][a-zA-Z]+.*") && !columnHeaderValue.endsWith(".") && tools.getIfPresent(columnHeaderValue) != null) { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", tools.getIfPresent(columnHeaderValue).getStringValue()); }  else { columnHeaderValue = tools.getLocalizedTextForString("pyCaption", columnHeaderValue, StreamBuilder.FMT_NORMAL); }  tools.appendString(StringUtils.crossScriptingFilter(columnHeaderValue)); 
tools.appendString("' ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	 tools.appendString(' ' + pzCell.getInspectorDataDynamic("SUB_SECTION","pzDisplayAttachmentLink", ".pySections(1).pySectionBody(2).pyTable.pyRows(2).pyCells(1)")); tools.appendString(" class='");
	tools.appendString(" gridCell");tools.appendString("  ");tools.appendString(" ' NAME='BASE_REF' BASE_REF='" + tools.getStepPage().getReference() + "' style='");
	tools.appendString("height:28px;");tools.appendString(""); tools.appendString("'>");
	if(tools.getIfPresent("pyRowStatus") != null){ tools.appendProperty(tools.getProperty(".pyRowStatus"),"Messages",false); }
	{
	String tempRenderSingle = tools.getParamValueCSF("RenderSingle");
	String tempIndex= tools.getSaveValue("index");
	String tempRowClass =  tools.getSaveValue("rowClass");
	tools.putParamValue("RenderSingle","");
	
	tools.putParamValue("pega_RLindex",tools.getSaveValue("index"));
	pzDisplayAttachmentLink_1();
	tools.putParamValue("pega_RLindex","");
	tools.putParamValue("RenderSingle",tempRenderSingle);
	 tools.putSaveValue("index",tempIndex);
	 tools.putSaveValue("rowClass",tempRowClass);}
	tools.appendString("</td>");
	
									 tools.putActive(activeValue);
}


public void gridOpenActionIncl_1() {
pzAuto.emitIncludeStreamReference("pzGridOpenAction", null, !tools.hasInputEnabled()?"NoInput":"null", "Rule-HTML-Fragment", null);
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
public void 
getInlineStyle_1() {
}


public void pyCustomFields_1() {
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-dblclick='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"editRepeatItem\",[\":event\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-keyup='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"editRepeatItem\",[\":event\"]");

		tools.appendString(",");
		tools.appendString(",\"enter\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":-1}]");

		tools.appendString(",");
		tools.appendString(",\"up\"");
		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":1}]");

		tools.appendString(",");
		tools.appendString(",\"down\"");
		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }tools.appendString("[\"doGridAction\",[\":event\",\"SETFOCUS\",null,{\"offset\":0}]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
}

public void 
gridBeginLayout_1() {
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());
}


public void gridDoPartialRefresh_1() { /*gridDoPartialRefresh*/
String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
java.util.Map functionsMap = null;
java.util.Map classesMap = null;
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					if(tools.getParamValue("partialTrigger").equals("appendTo.pyCustomFields1")|| tools.getParamValue("partialTrigger").equals("editRow.pyCustomFields1") ){

					tools.putParamValue("partialRefresh", "false");

					Iterator propItr = null;

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardPage jsonRefreshRows = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

					tools.appendString("<table id='bodyTbl_right'><tbody>");

					if(jsonRefreshRows != null)

					propItr = jsonRefreshRows.getProperty("JSONArrayList").iterator(); 

					}

					while(!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows") || (propItr != null && propItr.hasNext())){

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardProperty cp = (ClipboardProperty) propItr.next();

					String pyPropRef = cp.getProperty("pyPropRef").getStringValue();

					String curRowNum = cp.getProperty("curRowNum").getStringValue();

					if ("true".equals(cp.getProperty("editRow").getStringValue()))

						tools.setInput(true);

					tools.putParamValue("strIndexInList", tools.getStepPage().getProperty(pyPropRef).indexOf());

					tools.putParamValue("curRowNum", curRowNum);

					}

					if(tools instanceof StreamBuilderToolKit) {

					ClipboardProperty pageListProp = tools.getProperty(".pyCustomFields");

					ClipboardProperty pagePropInList = pageListProp.getPropertyValue(tools.getParamValue("Subscript"));

					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);

					if(tools.getParamValue("EditRow").equals("false") && pagePropInList.getPageValue().hasMessages()){ tools.putParamValue("hasErrors", "true");tools.setInput(true);} 

					}

					
						 tools.putParamValue("expandRL","false"); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().getPropertyValue("pxSubscript"))); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().getPropertyValue("pxSubscript")));

					
						 tools.putParamValue("expandRL","true");

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t<tr ");

					 tools.appendString(" class='"); if(tools.hasInputEnabled()) tools.appendString("editMode "); tools.appendString("cellCont' "); 

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
}}catch(Exception e){}

					tools.appendString(" PG_SUBSCRIPT='");
try {

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pxSubscript", "normal")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					tools.appendString(" ' id='");

					tools.appendString(tools.getActiveName());tools.appendString("' ");

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" >");

					

					 repeatingDataCell_1(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_2(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_3(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
						 tools.putParamValue("expandRL","false");

					
									  pega.popStackFrame(frame_3, false); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					if (!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					break;

					}

					}//close the refresh rows while loop

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					tools.appendString("</tbody></table>||END||");

					ClipboardPage jsonClipboardPage = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

					if(jsonClipboardPage != null)

					jsonClipboardPage.removeFromClipboard();

					}

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					 } 

					 tools.putSaveValue("isGrid", "false"); 

					
	 /* generate the transaction ID if it has been changed due to DB commit operations */ 

					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyCustomFields1")) {

					
		String latestTransID = tools.getRequestor().getRequestorPage().getString("pxClientExchange");

					
		String postedTransID = tools.getParamValue("pzTransactionId");

					
		if(!postedTransID.trim().equals(latestTransID.trim())){

					tools.appendString("\n\t\t\t||GRIDCOMMIT||");

					tools.appendString(latestTransID.trim());tools.appendString("||");

					
		 }

					
			 tools.putParamValue("partialRefresh", "false");

					
		 }

					
  if(tools.getParamValue("partialTrigger").equals("delete")) { 

					
	 if(tools instanceof StreamBuilderToolKit) {

					
		 ClipboardProperty pageListProp = null;

					
		 pageListProp = tools.getProperty(".pyCustomFields");

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
	 }

					
  } 

					try { tools.putActive(tools.getPrimaryPage().getProperty("pyLabel")); } catch(Exception e){e.printStackTrace();}

					
					 /* GenerateGrid: End */

					}

					public void 
gridBeginLayout_2
					() {

					tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());
}


public void gridDoPartialRefresh_2() { /*gridDoPartialRefresh*/
String expandPaneHeader = "";if(pzAuto.isAccessible()){expandPaneHeader = " aria-live='polite' tabindex=0 title='Expand / Collapse Header' ";}String activeName=null;int dynamicColCount=0,catColCnt=0,visibleColCount = 1;
java.util.Map functionsMap = null;
java.util.Map classesMap = null;
tools.putSaveValue("bAllowRowUpdate","true");
tools.putSaveValue("bEditable", "" + tools.hasInputEnabled());

					/*-- GenerateGrid: Begin -- */tools.putSaveValue("isGrid", "true");

					if(tools.getParamValue("partialTrigger").equals("appendTo.pyCustomFields2")|| tools.getParamValue("partialTrigger").equals("editRow.pyCustomFields2") ){

					tools.putParamValue("partialRefresh", "false");

					Iterator propItr = null;

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardPage jsonRefreshRows = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

					tools.appendString("<table id='bodyTbl_right'><tbody>");

					if(jsonRefreshRows != null)

					propItr = jsonRefreshRows.getProperty("JSONArrayList").iterator(); 

					}

					while(!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows") || (propItr != null && propItr.hasNext())){

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					ClipboardProperty cp = (ClipboardProperty) propItr.next();

					String pyPropRef = cp.getProperty("pyPropRef").getStringValue();

					String curRowNum = cp.getProperty("curRowNum").getStringValue();

					if ("true".equals(cp.getProperty("editRow").getStringValue()))

						tools.setInput(true);

					tools.putParamValue("strIndexInList", tools.getStepPage().getProperty(pyPropRef).indexOf());

					tools.putParamValue("curRowNum", curRowNum);

					}

					if(tools instanceof StreamBuilderToolKit) {

					ClipboardProperty pageListProp = tools.getProperty(".pyCustomFields");

					ClipboardProperty pagePropInList = pageListProp.getPropertyValue(tools.getParamValue("Subscript"));

					ClipboardProperty prevActiveProp = ((StreamBuilderToolKit)tools).putActive(pagePropInList);

					if(tools.getParamValue("EditRow").equals("false") && pagePropInList.getPageValue().hasMessages()){ tools.putParamValue("hasErrors", "true");tools.setInput(true);} 

					}

					
						 tools.putParamValue("expandRL","false"); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) { tools.appendString("||PEGA||GRID||<table>"); } 

					
 if(!tools.getParamValue("EditRow").equals("true") && !tools.getParamValue("hasErrors").equals("true")) tools.setInput(false); 

					
									  PRStackFrame frame_3 = pega.pushStackFrame("RepeatGrid", null, tools.getActive().getPageValue(), false, false);

					
							 tools.putSaveValue("index",String.valueOf(tools.getActive().getPropertyValue("pxSubscript"))); 

					
							 tools.putParamValue("index",String.valueOf(tools.getActive().getPropertyValue("pxSubscript")));

					
						 tools.putParamValue("expandRL","true");

					tools.appendString("\n\t\t\t\t\t\t\t\t\t\t<tr ");

					 tools.appendString(" class='"); if(tools.hasInputEnabled()) tools.appendString("editMode "); tools.appendString("cellCont' "); 

					
 try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_gridAction = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					
}}catch(Exception e){}

					tools.appendString(" PG_SUBSCRIPT='");
try {

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pxSubscript", "normal")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}

					tools.appendString(" ' id='");

					tools.appendString(tools.getActiveName());tools.appendString("' ");

					 tools.putParamValue("GenOAFunc", "false"); 

					gridOpenActionIncl_1();

					tools.appendString(" >");

					

					 repeatingDataCell_4(); 

					activeName = tools.getActiveName(); 

					 repeatingDataCell_5(); 

					activeName = tools.getActiveName(); tools.appendString("\n\t\t\t\t\t\t\t\t\t\t</tr>");

					
						 tools.putParamValue("expandRL","false");

					
									  pega.popStackFrame(frame_3, false); 

					
 if(!tools.getParamValue("EditRow").equals("true")) tools.setInput(Boolean.parseBoolean(tools.getSaveValue("bEditable"))); 

					if (!tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					break;

					}

					}//close the refresh rows while loop

					if (tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) {

					tools.appendString("</tbody></table>||END||");

					ClipboardPage jsonClipboardPage = tools.findPage(tools.getParamValue("pxRefreshRowsJsonPage"));

					if(jsonClipboardPage != null)

					jsonClipboardPage.removeFromClipboard();

					}

					 if(tools.getParamValue("table").equals("") && !tools.getParamValue("gridAction").toLowerCase().equals("refreshrows")) tools.appendString("</table>||END||");  

					 } 

					 tools.putSaveValue("isGrid", "false"); 

					
	 /* generate the transaction ID if it has been changed due to DB commit operations */ 

					
	 if(tools.getParamValue("partialTrigger").equals("dragdrop.pyCustomFields2")) {

					
		String latestTransID = tools.getRequestor().getRequestorPage().getString("pxClientExchange");

					
		String postedTransID = tools.getParamValue("pzTransactionId");

					
		if(!postedTransID.trim().equals(latestTransID.trim())){

					tools.appendString("\n\t\t\t||GRIDCOMMIT||");

					tools.appendString(latestTransID.trim());tools.appendString("||");

					
		 }

					
			 tools.putParamValue("partialRefresh", "false");

					
		 }

					
  if(tools.getParamValue("partialTrigger").equals("delete")) { 

					
	 if(tools instanceof StreamBuilderToolKit) {

					
		 ClipboardProperty pageListProp = null;

					
		 pageListProp = tools.getProperty(".pyCustomFields");

					
		 String strSizeBD= tools.getParamValue("PLSizeBeforeDelete");

					
		 if(!strSizeBD.equals("")){

					
		 int iSizeBeforeDelete = Integer.parseInt(strSizeBD);

					
		 if(iSizeBeforeDelete == pageListProp.size()+1) {

					tools.appendString("\n\t\t\t PEGA_GRID_DELETE||DELETE_SUCCESS||");

					
		 } }

					
			tools.putParamValue("partialRefresh", "false");

					
	 }

					
  } 

					try { tools.putActive(tools.getPrimaryPage().getProperty("pyLabel")); } catch(Exception e){e.printStackTrace();}

					
					 /* GenerateGrid: End */

					}
private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Rule-Application.pxSubscript", new LiteweightPropertyDefinition("Rule-Application", "pxSubscript", "sIY", true, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Rule-Application");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-APPLICATION PZDISPLAYEXISTINGATTACHMENTS #20180713T140855.991 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzDisplayExistingAttachments");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("pzLayout_1", new String[][] {});
pzExternalMethodMapping.put("pzLayout_2", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-APPLICATION PZDISPLAYEXISTINGATTACHMENTS #20180713T140855.991 GMT", "Rule-Application pzDisplayExistingAttachments", "Pega-ProcessArchitect", "08-01-01", "20180713T140855.991 GMT");
}
