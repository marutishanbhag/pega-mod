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
 * Builds JSP stream WORK-!CASETAGS.
 */
public class ra_stream_casetags_466d6b6ce1fe2b696fbb8392d83e13b8 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.CaseTags.OFON2J_ProcessO_Work_Onboarding.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 95907556;
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
	public ra_stream_casetags_466d6b6ce1fe2b696fbb8392d83e13b8(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "216d20ac5c6086e4bd0a90daa19033ea4a0014d8";
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
/* Instance RULE-HTML-SECTION WORK- CASETAGS #20210506T204027.126 GMT	Theme-Cosmos:04-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "216d20ac5c6086e4bd0a90daa19033ea4a0014d8";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("CaseTags",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION WORK- CASETAGS #20210506T204027.126 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION WORK- CASETAGS #20210506T204027.126 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION WORK- CASETAGS #20210506T204027.126 GMT */
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
	"Rule-HTML-Section:CASETAGS", 
	"Rule-HTML-Property:PXBUTTON", 
	"Rule-File-Binary:WEBWB!TAG!SVG"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("CASETAGS","Rule-HTML-Section","WORK-",false,"","Theme-Cosmos","04-01-01","RULE-HTML-SECTION WORK- CASETAGS #20210506T204027.126 GMT","!CASETAGS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",95907556), 
		new DependentRuleInfo("PXBUTTON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT","PXBUTTON",true,false,"ABSOLUTE_CLASSLESS",1928622883), 
		new DependentRuleInfo("WEBWB!TAG!SVG","Rule-File-Binary","",false,"","","","","WEBWB!TAG!SVG",true,false,"ABSOLUTE_CLASSLESS",1)
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
//	RULE-HTML-SECTION WORK- CASETAGS #20210506T204027.126 GMT:20230706T113320.980 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DATETIME CURRENTDATETIME #20180713T131432.995 GMT:20180713T131432.995 GMT
//	RULE-UTILITY-FUNCTION DATETIME FORMATDATETIME #20180713T131433.041 GMT:20180713T131433.041 GMT
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GRIDHEADERELEMENTS--(STRINGBUFFE2CEB5A8FA884B8FB8C9CC7705D04E287 #20200407T102458.616 GMT:20200427T060350.869 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTIDENTIFIER--(STRING) #20180713T133339.807 GMT:20180713T133339.807 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELAYOUTWRAPPERTABLE #20180713T133339.811 GMT:20180713T133339.811 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDEHEADERICON #20180713T133341.204 GMT:20180713T133341.204 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
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
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLOCALACTION--(CLIPBOARDP735454E5CE9DE0AF1D25BFD33036C12C #20190423T162450.172 GMT:20190423T162450.172 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONREFRESH--(CLIPBOARDPAGE,8AECDFE4A5256F13DC3F6C7D56453947 #20190320T065455.847 GMT:20190424T132824.042 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFIELDVALUEAPI #20200312T061421.553 GMT:20200319T144505.401 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCSSENGINE PZCSSADDPX #20180713T133346.650 GMT:20180713T133346.650 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION STRING TRIM #20180713T131442.833 GMT:20180713T131442.833 GMT
//	RULE-UTILITY-FUNCTION UIENGINE PZGETANIMATIONSJSONSTRING--(CLIPBOARDPAGE) #20190417T070159.744 GMT:20190430T131934.330 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "b62fcbd6e26d9817a284fbbfa56f9d27";
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
  pzSection.beginSection("CaseTags",1,"Rule-HTML-Section","{'type':'Section','ruleName':'CaseTags','insKey':'RULE-HTML-SECTION WORK- CASETAGS #20210506T204027.126 GMT','sectionType':'workareaWidget'}");
pzLayout_1();
 tools.putSaveValue("ContainerID", "");
 pzSection.endSection(); 
 tools.putSaveValue("sectionUniqueID", "");
  if(pzAuto.isForOfflineTemplate()) {
	tools.putSaveValue("offlineSectionClassKey", "");
 }
}
}
public void pzHeaderCell_1() {
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerCell = pzAuto.getUIComponent();
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
metadataPage.put("pyStyle","height:38px;width:90px;");
metadataPage.put("pyInspectorData",pzCell.getInspectorDataDynamic("pxButton","",".pySections(1).pyHeaderTable.pyRows(1).pyCells(1)"));
metadataPage.put("pyWrap","false");
metadataPage.put("pyRenderedStyle",pzSection.getCustomStyle(false, "", "", ""));
headerCell.beginComponent("pxHeaderCell",metadataPage);
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
pzHeaderCellContent_1();
headerCell.endComponent();
}
public void pzLayoutHeader_1() {
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
IUIComponent headerComponent = pzAuto.getUIComponent();
metadataPage.put("hIconSrcType", "standard");
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()) {
metadataPage.put("pyImage", "data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KPHN2ZyB3aWR0aD0iMTJweCIgaGVpZ2h0PSIxOXB4IiB2aWV3Qm94PSIwIDAgMTIgMTkiIHZlcnNpb249IjEuMSIgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIiB4bWxuczp4bGluaz0iaHR0cDovL3d3dy53My5vcmcvMTk5OS94bGluayI+CiAgICA8IS0tIEdlbmVyYXRvcjogU2tldGNoIDU3LjEgKDgzMDg4KSAtIGh0dHBzOi8vc2tldGNoLmNvbSAtLT4KICAgIDx0aXRsZT7ug5g8L3RpdGxlPgogICAgPGRlc2M+Q3JlYXRlZCB3aXRoIFNrZXRjaC48L2Rlc2M+CiAgICA8ZyBpZD0iKjguNC11c2VyLXN0b3JpZXMiIHN0cm9rZT0ibm9uZSIgc3Ryb2tlLXdpZHRoPSIxIiBmaWxsPSJub25lIiBmaWxsLXJ1bGU9ImV2ZW5vZGQiPgogICAgICAgIDxwYXRoIGQ9Ik0xMS4wNjI1LDQuNjQwNjI1IEMxMS4yOTY4NzYyLDQuODc1MDAxMTcgMTEuNDE0MDYyNSw1LjEzMjgxMTA5IDExLjQxNDA2MjUsNS40MTQwNjI1IEwxMS40MTQwNjI1LDE3LjIyNjU2MjUgQzExLjQxNDA2MjUsMTcuNTMxMjUxNSAxMS4zMDg1OTQ4LDE3Ljc4OTA2MTQgMTEuMDk3NjU2MiwxOCBDMTAuODg2NzE3NywxOC4yMTA5Mzg2IDEwLjYyODkwNzgsMTguMzE2NDA2MiAxMC4zMjQyMTg4LDE4LjMxNjQwNjIgTDEuNjc1NzgxMjUsMTguMzE2NDA2MiBDMS4zNzEwOTIyMywxOC4zMTY0MDYyIDEuMTEzMjgyMywxOC4yMTA5Mzg2IDAuOTAyMzQzNzUsMTggQzAuNjkxNDA1MTk1LDE3Ljc4OTA2MTQgMC41ODU5Mzc1LDE3LjUzMTI1MTUgMC41ODU5Mzc1LDE3LjIyNjU2MjUgTDAuNTg1OTM3NSw1LjQxNDA2MjUgQzAuNTg1OTM3NSw1LjEzMjgxMTA5IDAuNzAzMTIzODI4LDQuODc1MDAxMTcgMC45Mzc1LDQuNjQwNjI1IEw1LjI2MTcxODc1LDAuNTk3NjU2MjUgQzUuNTE5NTMyNTQsMC40MTAxNTUzMTMgNS43NjU2MjM4MywwLjMxNjQwNjI1IDYsMC4zMTY0MDYyNSBDNi4yMzQzNzYxNywwLjMxNjQwNjI1IDYuNDgwNDY3NDYsMC40MTAxNTUzMTMgNi43MzgyODEyNSwwLjU5NzY1NjI1IEwxMS4wNjI1LDQuNjQwNjI1IFogTTEwLjY3NTc4MTIsNS40MTQwNjI1IEMxMC42NzU3ODEyLDUuMzIwMzEyMDMgMTAuNjQwNjI1NCw1LjIzODI4MTYgMTAuNTcwMzEyNSw1LjE2Nzk2ODc1IEw2LjI0NjA5Mzc1LDEuMTI1IEM2LjE3NTc4MDksMS4wNTQ2ODcxNSA2LjA5Mzc1MDQ3LDEuMDE5NTMxMjUgNiwxLjAxOTUzMTI1IEM1LjkwNjI0OTUzLDEuMDE5NTMxMjUgNS44MjQyMTg3NSwxLjA1NDY4NzE1IDUuNzUzOTA2MjUsMS4xMjUgTDEuNDI5Njg3NSw1LjE2Nzk2ODc1IEMxLjM1OTM3NDY1LDUuMjM4MjgxNiAxLjMyNDIxODc1LDUuMzIwMzEyMDMgMS4zMjQyMTg3NSw1LjQxNDA2MjUgTDEuMzI0MjE4NzUsMTcuMjI2NTYyNSBDMS4zMjQyMTg3NSwxNy40NjA5Mzg3IDEuNDQxNDA1MDgsMTcuNTc4MTI1IDEuNjc1NzgxMjUsMTcuNTc4MTI1IEwxMC4zMjQyMTg4LDE3LjU3ODEyNSBDMTAuNTU4NTk0OSwxNy41NzgxMjUgMTAuNjc1NzgxMiwxNy40NjA5Mzg3IDEwLjY3NTc4MTIsMTcuMjI2NTYyNSBMMTAuNjc1NzgxMiw1LjQxNDA2MjUgWiBNNiwzLjkwMjM0Mzc1IEM2LjQ5MjE4OTk2LDMuOTAyMzQzNzUgNi45MTQwNjA3NCw0LjA3ODEyMzI0IDcuMjY1NjI1LDQuNDI5Njg3NSBDNy42MTcxODkyNiw0Ljc4MTI1MTc2IDcuNzkyOTY4NzUsNS4yMTQ4NDExNyA3Ljc5Mjk2ODc1LDUuNzMwNDY4NzUgQzcuNzkyOTY4NzUsNi4yMjI2NTg3MSA3LjYxNzE4OTI2LDYuNjQ0NTI5NDkgNy4yNjU2MjUsNi45OTYwOTM3NSBDNi45MTQwNjA3NCw3LjM0NzY1ODAxIDYuNDkyMTg5OTYsNy41MjM0Mzc1IDYsNy41MjM0Mzc1IEM1LjUwNzgxMDA0LDcuNTIzNDM3NSA1LjA4NTkzOTI2LDcuMzQ3NjU4MDEgNC43MzQzNzUsNi45OTYwOTM3NSBDNC4zODI4MTA3NCw2LjY0NDUyOTQ5IDQuMjA3MDMxMjUsNi4yMjI2NTg3MSA0LjIwNzAzMTI1LDUuNzMwNDY4NzUgQzQuMjA3MDMxMjUsNS4yMTQ4NDExNyA0LjM4MjgxMDc0LDQuNzgxMjUxNzYgNC43MzQzNzUsNC40Mjk2ODc1IEM1LjA4NTkzOTI2LDQuMDc4MTIzMjQgNS41MDc4MTAwNCwzLjkwMjM0Mzc1IDYsMy45MDIzNDM3NSBaIE02Ljc3MzQzNzUsNi40Njg3NSBDNi45ODQzNzYwNSw2LjI4MTI0OTA2IDcuMDg5ODQzNzUsNi4wMzUxNTc3NyA3LjA4OTg0Mzc1LDUuNzMwNDY4NzUgQzcuMDg5ODQzNzUsNS40MjU3Nzk3MyA2Ljk4NDM3NjA1LDUuMTY3OTY5OCA2Ljc3MzQzNzUsNC45NTcwMzEyNSBDNi41NjI0OTg5NSw0Ljc0NjA5MjcgNi4zMDQ2ODkwMiw0LjY0MDYyNSA2LDQuNjQwNjI1IEM1LjY5NTMxMDk4LDQuNjQwNjI1IDUuNDM3NTAxMDUsNC43NDYwOTI3IDUuMjI2NTYyNSw0Ljk1NzAzMTI1IEM1LjAxNTYyMzk1LDUuMTY3OTY5OCA0LjkxMDE1NjI1LDUuNDI1Nzc5NzMgNC45MTAxNTYyNSw1LjczMDQ2ODc1IEM0LjkxMDE1NjI1LDYuMDM1MTU3NzcgNS4wMTU2MjM5NSw2LjI4MTI0OTA2IDUuMjI2NTYyNSw2LjQ2ODc1IEM1LjQzNzUwMTA1LDYuNjc5Njg4NTUgNS42OTUzMTA5OCw2Ljc4NTE1NjI1IDYsNi43ODUxNTYyNSBDNi4zMDQ2ODkwMiw2Ljc4NTE1NjI1IDYuNTYyNDk4OTUsNi42Nzk2ODg1NSA2Ljc3MzQzNzUsNi40Njg3NSBaIiBpZD0i7oOYIiBmaWxsPSIjMDAwMDAwIiBmaWxsLXJ1bGU9Im5vbnplcm8iPjwvcGF0aD4KICAgIDwvZz4KPC9zdmc+");
}else{
metadataPage.put("pyImage", "webwb/tag.svg");}
metadataPage.put("headingLevel","h3");
metadataPage.put("inputhiddenparam", tools.getParamValueCSF("EXPANDEDSubSectionCaseTagsB"));
metadataPage.put("titleType","Field Value");
String sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
if(!"".equals(sectionTitleFVMeta)){
metadataPage.put("fieldValueMeta",sectionTitleFVMeta);
}
String sectionTitle = "Tagswithcount";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Tagswithcount", "pyCaption");
String inspectorFVData = pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData();
if(!"".equals(inspectorFVData)){
metadataPage.put("fieldValueInspectorData",inspectorFVData);
}
String labelName = "Tagswithcount";
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() !='N' ){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addChangeTrackProperty(".TagsCount");
try{
if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")) {
com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_fieldValParam = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
	ct_fieldValParam.trackValueChanges(tools.getProperty(".TagsCount"), -1);
}}catch(Exception e){}
}
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() !='N' ){
labelName = "Tagswithcount"+"\t"+"^~"+pzAuto.getUIComponentRuntime().generateActionToken(".TagsCount")+"~^";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
}else{
tools.appendString(tools.getLocalizedTextForString(".pyCaption","Tagswithcount"+"\t"+tools.getProperty(".TagsCount").getStringValue()));
}
metadataPage.put("title", labelName);
metadataPage.put("uniqueid", "202602230450290357");
metadataPage.put("automationId", "");
headerComponent.beginComponent("pxLayoutHeader",metadataPage);
pzHeaderCell_1();
headerComponent.endComponent();
}
public void pzLayoutBody_1() {
includeSectionBody_1();
}
public void pzLayoutBodyWrapper_1() {
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
String expandParam= tools.getSaveValue("expandParam");String expandparamalue= tools.getParamValueCSF(expandParam);
if(pzSection.getLayout().loadLayoutBody()) {
includeSectionBody_1();
}
tools.appendString("</div>");
tools.putSaveValue("rowClass","");
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
	if(pzAuto.getUIComponentRuntime().isParentNonTemplate()) {
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_4","pyShowAssociatedTags", secInfo);
}
public void buildWhiteList_1() {
Map<String, String> config;
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyFlexModalTemplate");
config.put("NewTaskStatus", "pzAssociateTags");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
}


public void includeSectionBody_1() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	tools.putParamValue("section_params","");
	
	String includedSectionName = "";includedSectionName = "pyShowAssociatedTags";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public void checkForScriptTags_1(String ScriptTags) {
	String isEncodingAllowed = tools.getSystemSettings().getDynamic("Pega-UIEngine","isLinkLabelEncodingAllowed");
	if("false".equals(isEncodingAllowed)){
		tools.appendString(StringUtils.crossScriptingFilter(ScriptTags));
	}
	else{if(ScriptTags.toLowerCase().contains("<script>") || ScriptTags.toLowerCase().contains("<<include") || ScriptTags.toLowerCase().contains("<%")){
		tools.appendString(StringUtils.crossScriptingFilter(ScriptTags));} else {
		tools.appendString(StringUtils.filterRichText(ScriptTags));}
	}
}
public String 
getUIActionsMetaData_1() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pzAssociateTags");
		String strLAClassName = "";
		String offlineUsingPage = "";
		strLAClassName = tools.getStepPage().getString("pxObjClass");
		offlineUsingPage = tools.getStepPage().getReference();
		keyMap.putString("pyClassName", strLAClassName);
		ParameterPage newParamsPage = new ParameterPage();
		newParamsPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
		try { tools.doAction(keyMap, tools.getStepPage(), newParamsPage); } catch(Exception e) { oLog.error(e.getMessage()); }
		String streamType = newParamsPage.getString("StreamType");
		newParamsPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
		try { tools.doAction(keyMap, tools.getPrimaryPage(), newParamsPage); } catch(Exception e) { oLog.error(e.getMessage()); }
		String bHasPrivilege = newParamsPage.getString("CheckSecurityRetVal");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
		pzPackageRuntime.packageLocalAction("pzAssociateTags", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyFlexModalTemplate", offlineUsingPage , strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("CaseTags",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pzAssociateTags\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"pyFlexModalTemplate\",\"%7B%22isCustomMobileAnim%22%3A%22true%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-fade-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%2C%22mobile%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-offbottom-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
								com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
									StringBuffer staticURLStr = new StringBuffer();
									StringBuffer preActParamStr = new StringBuffer();
									StringBuffer preDTParamStr = new StringBuffer();
									String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
									tools.putParamValue("runTimeSecStreamName", "");
									if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
										try{
											pzPackageRuntime.packageSection("CaseTags",
											tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
											}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
											}
											refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
											refreshActionRequest.registerFixedParameter("SectionName", "");
											staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
											staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"CaseTags"));
											tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"\", \"");
											refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
											tools.appendString("=\", \"\", \",");
											refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
											tools.appendString("\",\":event\",\"1\",[\"");
											if(!"".equals(preActParamStr.toString())) {
												staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
												}
												if(!"".equals(preDTParamStr.toString())) {
													staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
													}
													tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
													pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}													String returnString = actionsStringBuilder.toString();
													tools.popStreamBody();
													return returnString;
												}


public void pxButton_1() {boolean isDisplayTextWithParam = false;
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
	tools.putParamValue("skipHTMLEncoding", "true");
	IUIComponentMetadata pxPrivilegeIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("20190708050944071128724") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","CaseTags_$CTX$_12");
		String repeatIndx = "";
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","Manage tags\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Manage tags", ".pyActionPrompt");
	}
	pyTooltip = "Manage tags";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","tooltip");
	modePage2.put("styles","Icon");
	modePage2.put("imgSrc","styleclass");
	String pyIconStyle = "";
	pyIconStyle = "pi pi-gear-solid";
	modePage2.put("image",pyIconStyle);
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyButtonLabel");
	}
	pyLabel = "";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash3 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash3 != null && !"".equals(spxUniqueStreamHash3)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash3,pxUniqueStreamHash+"_3");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_3");
	}
	modePage2.put("actionPath"," data-click='.'");
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_button.js");
	ctrlComponent.beginComponent("pxButton",metadataPage);
	ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
	tools.putParamValue("isControlEditableOriginal", true);
	ctrlComponent.endComponent();
} else {
boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='CaseTags_"+ referenceString+ "_12'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20190708050944071128724") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	{
		StringMap keyMap = new HashStringMap();
		keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
		keyMap.putString("pyActionName", "pzAssociateTags");
		String strLAClassName = "";
		String offlineUsingPage = "";
		strLAClassName = tools.getStepPage().getString("pxObjClass");
		offlineUsingPage = tools.getStepPage().getReference();
		keyMap.putString("pyClassName", strLAClassName);
		ParameterPage newParamsPage = new ParameterPage();
		newParamsPage.putString("pyFlowActionPurpose", "GETSTREAMTYPE");
		try { tools.doAction(keyMap, tools.getStepPage(), newParamsPage); } catch(Exception e) { oLog.error(e.getMessage()); }
		String streamType = newParamsPage.getString("StreamType");
		newParamsPage.putString("pyFlowActionPurpose", "CHECKSECURITY");
		try { tools.doAction(keyMap, tools.getPrimaryPage(), newParamsPage); } catch(Exception e) { oLog.error(e.getMessage()); }
		String bHasPrivilege = newParamsPage.getString("CheckSecurityRetVal");
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
		pzPackageRuntime.packageLocalAction("pzAssociateTags", offlineUsingPage , strLAClassName);
		pzPackageRuntime.packageSection("pyFlexModalTemplate", offlineUsingPage , strLAClassName, true);
		}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
		if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
			try{
				pzPackageRuntime.packageSection("CaseTags",
				tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
				}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
				}
				}
				if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
				String usingPage = "";
				if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
				if("true".equals(bHasPrivilege )) {
					tools.appendString("[\"processAction\", [\"pzAssociateTags\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"pyFlexModalTemplate\",\"%7B%22isCustomMobileAnim%22%3A%22true%22%2C%22desktop%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-fade-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%2C%22mobile%22%3A%7B%22reveal%22%3A%7B%22ease%22%3A%22standard%22%2C%22effect%22%3A%22anim-offbottom-open%22%2C%22speed%22%3A%22default%22%7D%2C%22isCustomDismiss%22%3A%22false%22%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
					} else {
						tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
						}
						}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }							{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
								com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
									StringBuffer staticURLStr = new StringBuffer();
									StringBuffer preActParamStr = new StringBuffer();
									StringBuffer preDTParamStr = new StringBuffer();
									String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
									tools.putParamValue("runTimeSecStreamName", "");
									if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
										try{
											pzPackageRuntime.packageSection("CaseTags",
											tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
											}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
											}
											refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
											refreshActionRequest.registerFixedParameter("SectionName", "");
											staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
											staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"CaseTags"));
											tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"\", \"");
											refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
											tools.appendString("=\", \"\", \",");
											refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
											tools.appendString("\",\":event\",\"1\",[\"");
											if(!"".equals(preActParamStr.toString())) {
												staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
												}
												if(!"".equals(preDTParamStr.toString())) {
													staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
													}
													tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
													pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";if(bOptimizedMarkup){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		tools.appendString("  title= '");
		 toolTipVal = tools.getLocalizedTextForString(".pyActionPrompt","Manage tags\t"+repeatIndx ,StreamBuilder.FMT_LITERAL) + "' ";
		tools.appendString(toolTipVal);tools.appendString("class='Icon pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		String classProp = "";
		 classProp ="pi pi-gear-solid";
		tools.appendString("<i aria-hidden='true'  data-click='.' class='" + classProp + "'></i>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</button>");												}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }												tools.putParamValue("doAutoFormatting", "false");
												tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}												} catch (Exception e) {

												
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'												&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }													}


}

public void pzHeaderCellContent_1() {
tools.putSaveValue("parentLayouttype","");pxButton_1();
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionCaseTagsB","",true);
}
public void LayoutWrapperTableStart_1() {
tools.appendString("<div " + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyShowAssociatedTags'}") + " class='layout layout-outline layout-outline-utility' id='EXPAND-OUTERFRAME' ");
String expandParameter = "EXPANDEDSubSectionCaseTagsB";
if("true".equals(tools.getParamValue("expandRL"))) {
expandParameter += StringUtils.crossScriptingFilter(tools.getParamValue("index"));
}
tools.appendString("PARAM_NAME=\"" + expandParameter + "\">");
}

 public void pzHeaderBody_1(){ 
String rptDynamicIndex = tools.getParamValueCSF("pega_RLindex");
String rptDynamicIdx = tools.getParamValueCSF("pega_RLindex");
String strSaveTextValue="";String l_sectionTitle="";
String l_sectionTitleFVMeta = "";
l_sectionTitleFVMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
String labelName = "Tagswithcount";
if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() !='N' ){
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addChangeTrackProperty(".TagsCount");
try{
if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")) {
com.pega.pegarules.priv.runtime.IStreamChangeTracker ct_fieldValParam = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
	ct_fieldValParam.trackValueChanges(tools.getProperty(".TagsCount"), -1);
}}catch(Exception e){}
}
labelName = tools.getLocalizedTextForString(".pyCaption","Tagswithcount"+"\t"+tools.getProperty(".TagsCount").getStringValue());
l_sectionTitle = labelName;
String sectionImageTitle="";
sectionImageTitle=tools.getLocalizedTextForParameterizedString("pyCaption","");


	/***-- Grid HeaderElements: Begin --**/
tools.appendString("<div class='header header-bar test clearfix' role='heading' aria-level='3' id='RULE_KEY' node_type='HEADER' aria-labelledby='headerlabel3997' data-layout-id='202602230450290342" + rptDynamicIdx + "'><div class='header-left'><i class='icon icon-openclose'></i></div><div class='header-content' " + l_sectionTitleFVMeta + " ><span class='header-element'><img src='webwb/tag.svg'  alt= '" + sectionImageTitle + "'  title= '" + sectionImageTitle + "'  /></span><h3  class='header-title' id='headerlabel3997'>" + l_sectionTitle + "</h3><span class='header-element header-title-table " + pzSection.getCustomStyle(false, "", "", "") + "' style='");
try {
tools.appendString("height:38px;width:90px;");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
tools.appendString("'><nobr>");
pzHeaderCellContent_1();
tools.appendString("</nobr></span>");
boolean showContainerIcons=tools.getParamValue("showContainerIcons").equals("true")?true:false;
tools.appendString("<span class='header-element header-title-table'>");
if(showContainerIcons){
tools.appendString("<table cellspacing='0' cellpadding='0'><tr>");
}
if(showContainerIcons){
pzLayout.includeHeaderIcon("SubSectionCaseTagsB","tdRightStyle");}
if(showContainerIcons){
tools.appendString("</tr></table>");
}
tools.appendString("</span>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div><div class='header-right'></div></div>");

	 /***Grid HeaderElements: End ***/

}
public void LayoutWrapperTableEnd_1() {
tools.appendString("</div>");
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
String paramName = "EXPANDEDSubSectionCaseTagsB";
metadataPage.put("paramName", paramName);
String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'SECTIONINCLUDE','pgRef':'.pySections(1)','clipboardPath':'pyShowAssociatedTags'}");
if(!inspectorLayoutData.isEmpty()) {
metadataPage.put("liveUI", inspectorLayoutData);
}
String pyPrefix = null;
metadataPage.put("prefix","-utility");
metadataPage.put("sectionIndex","1");
IUIComponent containerComponent = pzAuto.getUIComponent();
metadataPage.put("isSectionIncl","true");
containerComponent.beginComponent("pxLayoutContainer",metadataPage);
pzLayoutHeader_1();
containerComponent.addPropertyToMetadata("rwclass", "utils-pane-tags flex-header utility");
containerComponent.addPropertyToMetadata("roclass", "utils-pane-tags flex-header utility");
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
tools.putParamValue("RWClasses","");
 LayoutWrapperTableStart_1(); 
if(tools.getParamValue("RenderSingle").equals("")){
pzHeaderBody_1();
}
String RWClasses = "";
RWClasses += " ";
RWClasses += pzSection.getCustomStyle(false, "","utils-pane-tags flex-header utility","utils-pane-tags flex-header utility") ;
RWClasses += " ";
tools.putParamValue("RWClasses",RWClasses);
pzLayoutBodyWrapper_1();
 LayoutWrapperTableEnd_1(); }
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
String RWClassesHelper = "";
RWClassesHelper += " ";
RWClassesHelper += pzSection.getCustomStyle(false, "","utils-pane-tags flex-header utility","utils-pane-tags flex-header utility") ;
RWClassesHelper += " ";
tools.putParamValue("RWClasses",RWClassesHelper);
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
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION WORK- CASETAGS #20210506T204027.126 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Theme-Cosmos");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "CaseTags");
	oStreamProperties_1.put("pyRuleSetVersion", "04-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION WORK- CASETAGS #20210506T204027.126 GMT", "Work- CaseTags", "Theme-Cosmos", "04-01-01", "20230706T113320.980 GMT");
}
