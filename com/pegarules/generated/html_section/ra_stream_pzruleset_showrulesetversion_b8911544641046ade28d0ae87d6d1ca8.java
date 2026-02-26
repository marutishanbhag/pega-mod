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
 * Builds JSP stream RULE-RULESET-VERSION!PZRULESET_SHOWRULESETVERSION.
 */
public class ra_stream_pzruleset_showrulesetversion_b8911544641046ade28d0ae87d6d1ca8 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzRuleset_ShowRuleSetVersion.Rule_RuleSet_Version.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1263887621;
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
	public ra_stream_pzruleset_showrulesetversion_b8911544641046ade28d0ae87d6d1ca8(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "5c404267534a8d29df4aa4e12becbbc39b6bce72";
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
/* Instance RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_SHOWRULESETVERSION #20180713T135703.137 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "5c404267534a8d29df4aa4e12becbbc39b6bce72";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzRuleset_ShowRuleSetVersion",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_UNIQUE_STREAMHASH, pxUniqueStreamHash);
if (!pzAuto.getUIComponentRuntime().getRuntimeContextTree().canProcessSection(pxIsNonTemplateStream, false, pxUniqueStreamHash+"_1",false)) {
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();	 return;
}
if(previousTemplatingStatus == '\0'){
	previousTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
}pzAuto.getUIComponentRuntime().getRuntimeContextTree().saveValue(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PX_IS_NONTEMPLATE_STREAM, String.valueOf(pxIsNonTemplateStream));
/*
 * Begin RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_SHOWRULESETVERSION #20180713T135703.137 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_SHOWRULESETVERSION #20180713T135703.137 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_SHOWRULESETVERSION #20180713T135703.137 GMT */
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
	"Rule-HTML-Section:PZRULESET_SHOWRULESETVERSION", 
	"Rule-Obj-Property:PYCOMPONENTINTERFACECLASS", 
	"Rule-HTML-Property:PXLINK", 
	"Rule-HTML-Property:PXBUTTON"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZRULESET_SHOWRULESETVERSION","Rule-HTML-Section","RULE-RULESET-VERSION",false,"","Pega-SystemArchitect","08-01-01","RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_SHOWRULESETVERSION #20180713T135703.137 GMT","!PZRULESET_SHOWRULESETVERSION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1263887621), 
		new DependentRuleInfo("PYCOMPONENTINTERFACECLASS","Rule-Obj-Property","RULE-RULESET-VERSION",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYCOMPONENTINTERFACECLASS #20180713T131310.132 GMT","!PYCOMPONENTINTERFACECLASS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXLINK","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT","PXLINK",true,false,"ABSOLUTE_CLASSLESS",-1085887471), 
		new DependentRuleInfo("PXBUTTON","Rule-HTML-Property","",false,"","Pega-Gadgets","08-03-01","RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT","PXBUTTON",true,false,"ABSOLUTE_CLASSLESS",1928622883)
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
//	RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_SHOWRULESETVERSION #20180713T135703.137 GMT:20180713T135703.137 GMT
//	RULE-HTML-PROPERTY PXLINK #20190131T183501.590 GMT:20190131T183501.590 GMT
//	RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYCOMPONENTINTERFACECLASS #20180713T131310.132 GMT:20180713T131310.132 GMT
//	RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYCOMPONENTINTERFACECLASS #20180713T131310.132 GMT:20180713T131310.132 GMT
//	RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYCOMPONENTINTERFACECLASS #20180713T131310.132 GMT:20180713T131310.132 GMT
//	RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYCOMPONENTINTERFACECLASS #20180713T131310.132 GMT:20180713T131310.132 GMT
//	RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYCOMPONENTINTERFACECLASS #20180713T131310.132 GMT:20180713T131310.132 GMT
//	RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYCOMPONENTINTERFACECLASS #20180713T131310.132 GMT:20180713T131310.132 GMT
//	RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYCOMPONENTINTERFACECLASS #20180713T131310.132 GMT:20180713T131310.132 GMT
//	RULE-OBJ-PROPERTY RULE-RULESET-VERSION PYCOMPONENTINTERFACECLASS #20180713T131310.132 GMT:20180713T131310.132 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-HTML-PROPERTY PXBUTTON #20190131T183501.513 GMT:20190131T183501.513 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	simpleLayout_2(
//	simpleLayout_1(
//	simpleLayout_4(
//	simpleLayout_8(
//	simpleLayout_5(
//	simpleLayout_7(
//	simpleLayout_9(
//	simpleLayout_6(
//	simpleLayout_3(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTEVENTPARAMS--(STRINGBUFFER,CLIPBOARDPAGE,BOOLEAN) #20180713T133337.845 GMT:20180713T133337.845 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEHTMLPROPERTYPARAMS #20180713T133337.901 GMT:20180713T133337.901 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONBODYHTML--(STRING8119D405D65E5FC1B82614EF9838EE7F #20230618T001619.098 GMT:20231003T113522.697 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONHTML--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20190130T075719.993 GMT:20190530T084144.624 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES--(CLIPBBDB0FDAA1582A08C0911BE4E853713C8 #20191129T095927.918 GMT:20191129T095927.918 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISNOTJSP #20180713T132451.140 GMT:20180713T132451.140 GMT
//	RULE-UTILITY-FUNCTION HARNESS ISPARAM #20180713T132451.145 GMT:20180713T132451.145 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDDESIGNTEMPLATEDEPENDENCY--(CLIPBOARDPAGE,CLIPBOARDPAGE) #20180713T133338.079 GMT:20180713T133338.079 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM #20180713T133339.603 GMT:20180713T133339.603 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEAUTOMATIONID--(CLIPBOARDPAGE,STRING) #20180713T133339.615 GMT:20180713T133339.615 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATECLIENTWHENDIV #20180713T133339.714 GMT:20180713T133339.714 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGBAC08C2213A8175CF3DB1B7FEA4664F0D #20180713T133339.741 GMT:20180713T133339.741 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEFIELDINCLUDE #20220921T145731.593 GMT:20221011T082144.170 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATELABELCELLCONTENT #20190410T165241.183 GMT:20190410T165241.183 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONDIV #20200130T140416.280 GMT:20200130T140416.280 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESECTIONHTMLHELPER--(STB164ED9B4CFDEBA54B743216A805012A #20201222T180835.792 GMT:20201222T180835.792 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATESIMPLELAYOUTHTML #20180713T133339.900 GMT:20180713T133339.900 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATETOURID #20180713T133339.904 GMT:20180713T133339.904 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEUIINSPECTORMETADATA #20180713T133339.909 GMT:20180713T133339.909 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETLAYOUTTYPE #20180713T133339.966 GMT:20180713T133339.966 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPREDATATRANSFORM--(CLIPBOARDPAGE,STRINGBUFFER) #20180713T133340.001 GMT:20180713T133340.001 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZISACTIONCONFIGUREDONSECTION--(83A8B0AB7CE3605FF27EAE9292646DA3 #20180713T133341.237 GMT:20180713T133341.237 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZSECTIONINCLUDEINCELL--(CLIPBOAF2BD5B648774E376BD18CD12B064353F #20180713T133341.324 GMT:20180713T133341.324 GMT
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
//	RULE-UTILITY-FUNCTION PXDATAMANIPULATE PXSHOWRUNONCLIENT #20180713T133533.482 GMT:20180713T133533.482 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDCONSTANT #20180713T133342.959 GMT:20180713T133342.959 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDLN #20180713T133342.968 GMT:20180713T133342.968 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONAPPENDSTRING #20180713T133342.971 GMT:20180713T133342.971 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONLOCALACTION--(CLIPBOARDP735454E5CE9DE0AF1D25BFD33036C12C #20190423T162450.172 GMT:20190423T162450.172 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONOPENURLINWINDOW #20190717T074339.248 GMT:20191031T072346.716 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZACTIONREFRESH--(CLIPBOARDPAGE,8AECDFE4A5256F13DC3F6C7D56453947 #20190320T065455.847 GMT:20190424T132824.042 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZBEHAVIORPROPERTIESCOUNT #20180713T133344.756 GMT:20180713T133344.756 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONDITION--(CLIPBOARDPEFCDC2BD7217D45AF6F510980B90D167 #20190829T145118.669 GMT:20190829T145118.669 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROL--(CLIPBOARDPAG958D4B4F290980CF271DE20E4A2E7F6E #20190405T152034.266 GMT:20190426T142746.856 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLCLIENTEVENT--(SF4D1A128F6CD72072BF94229061A5843 #20180713T133344.895 GMT:20180713T133344.895 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATELINKORBUTTON--(CLIPBOAB4DCC1531E1C4D576C7E21B7E74A2550 #20230618T001619.516 GMT:20230618T001619.516 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZMERGECONTROLPAGES #20180713T133346.497 GMT:20180713T133346.497 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZPACKAGEHOSTSECTION--(CLIPBOARDPAGE,FIRSTUSEASSEMBLER) #20180713T133346.501 GMT:20180713T133346.501 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZVALIDATEFIELDVALUE #20180713T133346.618 GMT:20180713T133346.618 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT
//	RULE-UTILITY-FUNCTION UIENGINE PZGETANIMATIONSJSONSTRING--(CLIPBOARDPAGE) #20190417T070159.744 GMT:20190430T131934.330 GMT
//	RULE-UTILITY-FUNCTION UTILITIES PZVALIDATEFIELDVALUEREFERENCE #20231004T060003.271 GMT:20231004T060003.271 GMT
//	RULE-UTILITY-FUNCTION UTILITIES VALIDATERULEEXISTENCE2 #20180713T131446.070 GMT:20180713T131446.070 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "8711d999b6aecfe660b4a4e302ef7690";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-RuleSet-Version";
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
  pzSection.beginSection("pzRuleset_ShowRuleSetVersion",1,"Rule-HTML-Section","{'type':'Section','ruleName':'pzRuleset_ShowRuleSetVersion','insKey':'RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_SHOWRULESETVERSION #20180713T135703.137 GMT','sectionType':'standard'}");
pzLayout_12();
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
config = new HashMap<String, String>();
config.put("pyPreActivity", "HistoryOfHarnessRecord");
config.put("AllVersions", "");
config.put("InsHandle", "pzInsKey");
pega.getUIEngine().getUIAction("openUrlInWindow", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "pzRuleSet_SetVersionUpdateFlag");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyModalTemplate");
config.put("NewTaskStatus", "pzRuleSet_PopupVersionInterface");
pega.getUIEngine().getUIAction("localAction", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyActivity", "pzRuleSet_SaveRuleSetVersionRecord");
config.put("StaticActivityParams", "isVersionSave=");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("ActionSection", "pyModalTemplate");
config.put("NewTaskStatus", "pzRuleSet_VersionDelete");
pega.getUIEngine().getUIAction("localAction", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "pzRuleSet_VersionDeleteRows");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
}
public void pzLayoutBody_9() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_9");simpleLayout_9();
}
public void pzLayoutBodyWrapper_12() {
tools.appendString("<div class='layout layout-noheader layout-noheader-simple_combo_group_child'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_9");simpleLayout_9();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_8() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_8");simpleLayout_8();
}
public void pzLayoutBodyWrapper_11() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_8");simpleLayout_8();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_7() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_7");simpleLayout_7();
}
public void pzLayoutBodyWrapper_10() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_7");simpleLayout_7();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_6() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_6");simpleLayout_6();
}
public void pzLayoutBodyWrapper_9() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_6");simpleLayout_6();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public int simpleLayoutCell_15( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + " remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing    " + pzSection.getCustomStyle(false, "","helper_text_dataLabelRead","helper_text_dataLabelWrite")  + " ");
	 
	tools.appendString(pzSection.getCustomStyle(false, "","dataLabelRead helper_text_dataLabelRead","dataLabelWrite helper_text_dataLabelWrite") + " ");
	 
	tools.appendString("flex flex-row ' " +   pzCell.getTestIdIfEnabled("201702080532240635128695")   + " STRING_TYPE='label' RESERVE_SPACE='false'>");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Unlock branch from branch explorer to execute any action") + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_15( int index) {
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
	pgCells.put("pyType","label");
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("partialClass","remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201702080532240635128695")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("spanClass","iconRequired _iconRequired");
	pgCells.put("labelReadClass","dataLabelRead helper_text_dataLabelRead");
	pgCells.put("labelWriteClass","dataLabelWrite helper_text_dataLabelWrite");
	pgCells.put("customROStyles","helper_text_dataLabelRead");
	pgCells.put("customRWStyles","helper_text_dataLabelWrite");
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "Unlock branch from branch explorer to execute any action";
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
public void pzSetExpandParam_12() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleset_ShowRuleSetVersionBBBBBBBBB","",false);
}


public void simpleLayout_6() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash59 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash59 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash59 != null && !"".equals(spxUniqueStreamHash59)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash59,pxUniqueStreamHash+"_59");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806051302460460531") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + "flex  content  layout-content-inline_middle content-inline_middle " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash59 != null && !"".equals(spxUniqueStreamHash59)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_59");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isDLChild","true");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_15(index);
	}else{
		index=simpleLayoutTemplateCell_15(index);
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
	public void pzLayoutContainer_6() {
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
	String paramName = "EXPANDEDSubSectionpzRuleset_ShowRuleSetVersionBBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","132");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Flexbox");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_6();
	containerComponent.endComponent();
	}
public void pzLayout_9() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_12();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_9();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_6();
tools.putParamValue("pyInlineStyleSec","");
}
}


public int simpleLayoutCell_16( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing   flex flex-row  align-end'  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_9();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_16( int index) {
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing align-end flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	pzLayout_9();
 tools.putSaveValue("ContainerID", "");labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_11() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleset_ShowRuleSetVersionBBBBBBBB","",false);
}


public void simpleLayout_7() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash58 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash58 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash58 != null && !"".equals(spxUniqueStreamHash58)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash58,pxUniqueStreamHash+"_58");
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806051302460459965") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + " class='" + "flex  content  set-width-auto layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash58 != null && !"".equals(spxUniqueStreamHash58)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_58");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","set-width-auto");
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isDLChild","true");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_16(index);
	}else{
		index=simpleLayoutTemplateCell_16(index);
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
	public void pzLayoutContainer_7() {
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
	String paramName = "EXPANDEDSubSectionpzRuleset_ShowRuleSetVersionBBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","130");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree runtimeContextTree = pzAuto.getUIComponentRuntime().getRuntimeContextTree();
	boolean pyVisibility = false;pyVisibility = runtimeContextTree.beginVisibleWhen(" wxpzBranchisLocked", pxUniqueStreamHash+"_64");metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Flexbox");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pxWhenIdentifiers.put("pyVisibilityWhenId",pxUniqueStreamHash+"_64");
	metadataPage.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	if(pyVisibility) {
	pzLayoutBody_7();
	}
	containerComponent.endComponent();
	runtimeContextTree.endVisibleWhen();
	}
public void pzLayout_10() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
if(pzAuto.handleEvaluateWhen(" wxpzBranchisLocked","pzBranchisLocked", "layout", "visible" )) {pzSetExpandParam_11();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_10();
}
}
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_7();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_5() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_5");simpleLayout_5();
}
public void pzLayoutBodyWrapper_8() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_5");simpleLayout_5();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_4() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
}
public void pzLayoutBodyWrapper_7() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_4");simpleLayout_4();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
public void pzLayoutBody_3() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
}
public void pzLayoutBodyWrapper_6() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_3");simpleLayout_3();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void pxButton_3() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_49")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzRuleset_ShowRuleSetVersion_"+ referenceString+ "_129'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("201410270438210668282976") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }{
	StringMap keyMap = new HashStringMap();
	keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
	keyMap.putString("pyActionName", "pzRuleSet_VersionDelete");
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
	pzPackageRuntime.packageLocalAction("pzRuleSet_VersionDelete", offlineUsingPage , strLAClassName);
	pzPackageRuntime.packageSection("pyModalTemplate", offlineUsingPage , strLAClassName, true);
	}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
			pzPackageRuntime.packageSection("pzRuleset_ShowRuleSetVersion",
			tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
			}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
			}
			}
			if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
			String usingPage = "";
			if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
			if("true".equals(bHasPrivilege )) {
				tools.appendString("[\"processAction\", [\"pzRuleSet_VersionDelete\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
				} else {
					tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
					}
					}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }						{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
							com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
								StringBuffer staticURLStr = new StringBuffer();
								StringBuffer preActParamStr = new StringBuffer();
								StringBuffer preDTParamStr = new StringBuffer();
								refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
								refreshActionRequest.registerFixedParameter("StreamList", "pzRuleSet_ListRuleSetVersions|Rule-HTML-Section|:");
								staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
								staticURLStr.append("&PreDataTransform=pzRuleSet_VersionDeleteRows");
								tools.appendString("[\"refresh\", [\"otherSection\",\"pzRuleSet_ListRuleSetVersions\", \"\", \"");
								refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
								tools.appendString("=\", \"\", \"pzRuleSet_VersionDeleteRows,");
								refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
								tools.appendString("\",\":event\",\"\",[\"");
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
			String repeatIndx = "";
		if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "pzDisableRSVDelete", null, false)){
			tools.appendString(" disabled tabIndex='-1' ");
			bDisabled = true;
		}tools.appendString("class='pzhc");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		tools.appendString("<div class='pzbtn-rnd'  data-click='.'><div class='pzbtn-lft'  data-click='..' ");
		tools.appendString(" ><div class='pzbtn-rgt'  data-click='...'><div class='pzbtn-mid' ");if(bOptimizedMarkup){tools.appendString("data-bindprops='innerHTML,title' ");}tools.appendString(" data-click='....'>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Delete".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.....' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Delete",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("<img alt='' src='webwb/zblankimage.gif' class='pzbtn-i'/>");
		tools.appendString("</div></div></div></div>");
		tools.appendString("</button>");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");										tools.putParamValue("doAutoFormatting", "false");
										tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}										} catch (Exception e) {

										
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'										&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }											}


}

public String 
getUIActionsMetaData_3() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("pzRuleset_ShowRuleSetVersion",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("SectionName", "");
						refreshActionRequest.registerFixedParameter("PreActivity", "pzRuleSet_SaveRuleSetVersionRecord");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzRuleset_ShowRuleSetVersion"));
						staticURLStr.append("&PreActivity=pzRuleSet_SaveRuleSetVersionRecord");
						tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzRuleSet_SaveRuleSetVersionRecord\", \"");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"isVersionSave\":\"\"");
						tools.appendString("\", \"\", \",");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("\",\":event\",\"\",[\"");
						if(!"".equals(preActParamStr.toString())) {
							staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
							}
							if(!"".equals(preDTParamStr.toString())) {
								staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
								}
								tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
								pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }									{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
										com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
											StringBuffer staticURLStr = new StringBuffer();
											StringBuffer preActParamStr = new StringBuffer();
											StringBuffer preDTParamStr = new StringBuffer();
											refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
											refreshActionRequest.registerFixedParameter("StreamList", "RuleFormLayout|Rule-HTML-Section|:");
											staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
											tools.appendString("[\"refresh\", [\"otherSection\",\"RuleFormLayout\", \"\", \"");
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


public void pxButton_2() {boolean isDisplayTextWithParam = false;
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen("pzDisableRSVSave",pxUniqueStreamHash+"_45");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	modePage2.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyDisabledWhenId",pxUniqueStreamHash+"_45");
	pxWhenIdentifiers.put("pyDisabledWhenName","pzDisableRSVSave");
	pxWhenIdentifiers.put("pyDisabledWhenClass",((String)pega.getStreamProperties().get("pyClassName")));
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId"," " + pzCell.getTestIdIfEnabled("201410270438210667281220") + " ");
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("nav",navPage);
	}
	modePage2.put("pyName","pzRuleset_ShowRuleSetVersion_$CTX$_128");
		String repeatIndx = "";
	String pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("styles","");
	modePage2.put("imgSrc","none");
	modePage2.put("pyActionImagePosition","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","Save\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("Save", ".pyButtonLabel");
	}
	pyLabel = "Save";
	modePage2.put("label",pyLabel);
	String spxUniqueStreamHash46 = getUIActionsMetaData_3();
	if(spxUniqueStreamHash46 != null && !"".equals(spxUniqueStreamHash46)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash46,pxUniqueStreamHash+"_46");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_46");
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
		 String buttonUID = "name='pzRuleset_ShowRuleSetVersion_"+ referenceString+ "_128'";
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("201410270438210667281220") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }		{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
			com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
				StringBuffer staticURLStr = new StringBuffer();
				StringBuffer preActParamStr = new StringBuffer();
				StringBuffer preDTParamStr = new StringBuffer();
				String runTimeSecStreamName = tools.getParamValue("runTimeSecStreamName");
				tools.putParamValue("runTimeSecStreamName", "");
				if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
					try{
						pzPackageRuntime.packageSection("pzRuleset_ShowRuleSetVersion",
						tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
						}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
						}
						refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
						refreshActionRequest.registerFixedParameter("SectionName", "");
						refreshActionRequest.registerFixedParameter("PreActivity", "pzRuleSet_SaveRuleSetVersionRecord");
						staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
						staticURLStr.append("&StreamName=" + ((!StringUtils.isBlank(runTimeSecStreamName))?runTimeSecStreamName:"pzRuleset_ShowRuleSetVersion"));
						staticURLStr.append("&PreActivity=pzRuleSet_SaveRuleSetVersionRecord");
						tools.appendString("[\"refresh\", [\"thisSection\",\"\", \"pzRuleSet_SaveRuleSetVersionRecord\", \"");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						preActParamStr.append((!"".equals(preActParamStr.toString())?",":"") + "\"isVersionSave\":\"\"");
						tools.appendString("\", \"\", \",");
						refreshActionRequestD = refreshActionRequest.createDispatchedActionRequest();
						tools.appendString("\",\":event\",\"\",[\"");
						if(!"".equals(preActParamStr.toString())) {
							staticURLStr.append("&pzActivityParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preActParamStr.toString() + "}"));
							}
							if(!"".equals(preDTParamStr.toString())) {
								staticURLStr.append("&pzDTParamsEncrypted=" + pega_uiengine_pzcontrol.pzURLEncodeString("{" + preDTParamStr.toString() + "}"));
								}
								tools.appendString(StringUtils.escapeIntoJSONString(pega_rules_utilities.pzEncryptURLActionString(tools, "Thread", staticURLStr.toString())) + "\",{" + preActParamStr.toString() + "},{" + preDTParamStr.toString() + "}],\"" + pzAuto.getUIComponentRuntime().generateActionTokenForPage() + "\"]");
								pzAuto.registerActionRequest(refreshActionRequest);}

		tools.appendString("]");isBehaviorAdded = true;if(isBehaviorAdded && true){ tools.appendString(","); }									{com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequest = pzAuto.getActionRequest();
										com.pega.pegarules.priv.runtime.IActionRequest refreshActionRequestD = null;
											StringBuffer staticURLStr = new StringBuffer();
											StringBuffer preActParamStr = new StringBuffer();
											StringBuffer preDTParamStr = new StringBuffer();
											refreshActionRequest.registerFixedParameter("pyActivity", "ReloadSection");
											refreshActionRequest.registerFixedParameter("StreamList", "RuleFormLayout|Rule-HTML-Section|:");
											staticURLStr.append("pyActivity=ReloadSection&StreamClass=Rule-HTML-Section");
											tools.appendString("[\"refresh\", [\"otherSection\",\"RuleFormLayout\", \"\", \"");
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
			String repeatIndx = "";
		if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, "pzDisableRSVSave", null, false)){
			tools.appendString(" disabled tabIndex='-1' ");
			bDisabled = true;
		}tools.appendString("class='pzhc pzbutton");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Save".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Save",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
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

public void pzLayoutBodyWrapper_5() {
if(pzSection.getLayout().loadLayoutBody()) {
sectionBodyIncludeInCell_6();
}
tools.putSaveValue("rowClass","");
}
public void buildSection_6() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_43","pzRuleset_ShowRuleSetLockVersion", secInfo);
}


public void sectionBodyIncludeInCell_6() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_6();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pzRuleset_ShowRuleSetLockVersion"; 
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
public void pzSetExpandParam_10() {
pzSection.getLayout().setExpandParam("SubSectionCellpzRuleset_ShowRuleSetVersion655","",false);
}
public void pzLayout_5() {
pzSetExpandParam_10();
pzLayoutBodyWrapper_5();
}
public void buildSection_5() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_40","pzRuleset_ShowRuleSetLockVersion", secInfo);
}


public void sectionBodyIncludeInCell_5() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_5();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pzRuleset_ShowRuleSetLockVersion"; 
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


public int simpleLayoutCell_9( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleset_ShowRuleSetLockVersion",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + "   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_5();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_9( int index) {
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
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleset_ShowRuleSetLockVersion",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_5();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_10( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_2();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_10( int index) {
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201410270438210667281220-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_2();labelName = "";
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


public int simpleLayoutCell_11( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_3();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_11( int index) {
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201410270438210668282976-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_3();labelName = "";
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
public void pzSetExpandParam_9() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleset_ShowRuleSetVersionBBBBBBB","",false);
}


public void simpleLayout_3() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash39 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash39 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash39 != null && !"".equals(spxUniqueStreamHash39)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash39,pxUniqueStreamHash+"_39");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806051302460459813") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + " content  set-width-auto layout-content-inline_middle content-inline_middle " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash39 != null && !"".equals(spxUniqueStreamHash39)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_39");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","set-width-auto");
		pg_dlmeta.put("format","inline_middle");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_9(index);
	}else{
		index=simpleLayoutTemplateCell_9(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_10(index);
	}else{
		index=simpleLayoutTemplateCell_10(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_11(index);
	}else{
		index=simpleLayoutTemplateCell_11(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_3() {
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
	String paramName = "EXPANDEDSubSectionpzRuleset_ShowRuleSetVersionBBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","125");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_3();
	containerComponent.endComponent();
	}
public void pzLayout_6() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_9();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_6();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_3();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_2() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
}
public void pzLayoutBodyWrapper_4() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_2");simpleLayout_2();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}


public void pxButton_1() {boolean isDisplayTextWithParam = false;
String displayTextParamName = "";
String displayTextParamValue = "";

	StringBuffer pegaValidation = null;
boolean addedValidation = false;
try {


	tools.appendString("<span ");tools.appendString(">");if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_33")){boolean bDisabled = false;boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isHarnessTemplatized() && pzAuto.isOffline();
		 String pyFormatValue = "";
		 String toolTipVal = "";
		String hrefValue = "#";
		 String referenceString = tools.getStepPage().getReference();
		 boolean isParameterizedDeclarePage =  pega.getDeclarativePageUtils().isParameterizedDPName(referenceString);
		 if(isParameterizedDeclarePage){ referenceString = tools.getStepPage().getString("pzPageNameBase"); }
		 String buttonUID = "name='pzRuleset_ShowRuleSetVersion_"+ referenceString+ "_124'";
		tools.appendString("<div id='CT' ");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) 
		tools.appendString(" thread_name = '"+tools.getThread().getName()+"' ");
		tools.appendString(" name='.pyIsVersionDeleted' DISABLE_WHEN=\".pyIsVersionDeleted == 'true'\" >");
						try{if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
							changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pyIsVersionDeleted", -1);
						}}catch(Exception e){}
	 String securedPropValue = null;
		tools.appendString("<button " + pzCell.getTestIdIfEnabled("20141027044716081137138") + "  data-ctl='Button'  type='button' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }{
	StringMap keyMap = new HashStringMap();
	keyMap.putString("pxObjClass", "Rule-Obj-FlowAction");
	keyMap.putString("pyActionName", "pzRuleSet_PopupVersionInterface");
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
	pzPackageRuntime.packageLocalAction("pzRuleSet_PopupVersionInterface", offlineUsingPage , strLAClassName);
	pzPackageRuntime.packageSection("pyModalTemplate", offlineUsingPage , strLAClassName, true);
	}catch(Exception e1){oLog.error("Error generating local action package - " + e1.getMessage());}
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
		try{
			pzPackageRuntime.packageSection("pzRuleset_ShowRuleSetVersion",
			tools.getStepPage().getReference(), tools.getStepPage().getString("pxObjClass"));
			}catch(Exception e){oLog.error("Error generating section package - " + e.getMessage());}
			}
			}
			if(streamType.equals("")) { streamType = "Rule-Obj-FlowAction"; }
			String usingPage = "";
			if(("").equals(usingPage)) { usingPage = tools.getStepPage().getReference(); }
			if("true".equals(bHasPrivilege )) {
				tools.appendString("[\"processAction\", [\"pzRuleSet_PopupVersionInterface\",\"true\",\":event\",\"\",\""+streamType+"\",\"\",\"\",\"%7B%22mobile%22%3A%7B%22reveal%22%3A%7B%22effect%22%3A%22anim-null%22%7D%2C%22isCustomDismiss%22%3A%22true%22%2C%22dismiss%22%3A%7B%22effect%22%3A%22anim-null%22%7D%7D%7D\",\"true\",\""+strLAClassName+"\",\""+strLAClassName+"\",\"false\",\"false\",\"\",\"\"]");
				} else {
					tools.appendString("[\"processAction\", [\"You are not authorized to perform this Flow or Local action\"]");
					}
					}

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";
		if(com.pega.pegarules.jsptags.WhenTag.evaluateWhen(pega, ".pyIsVersionDeleted == 'true'", null, false)){
			tools.appendString(" disabled tabIndex='-1' ");
			bDisabled = true;
		}tools.appendString("class='pzhc");tools.appendString("'");if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		tools.appendString(" >");
		tools.appendString("<div class='pzbtn-rnd'  data-click='.'><div class='pzbtn-lft'  data-click='..' ");
		tools.appendString(" ><div class='pzbtn-rgt'  data-click='...'><div class='pzbtn-mid' ");if(bOptimizedMarkup){tools.appendString("data-bindprops='innerHTML,title' ");}tools.appendString(" data-click='....'>");
		boolean hasLineBreaks = false;
		 hasLineBreaks ="Interface Details".matches("(.*)<([Bb][Rr])\\s*\\/*\\s*>(.*)");
		if(hasLineBreaks) {
		tools.appendString("<span class='pzbtn-label'  data-click='.....' ");}if(bOptimizedMarkup && hasLineBreaks){
		tools.appendString("  data-bindprops='title,innerHTML' ");}
		if(hasLineBreaks) {
		tools.appendString("  > "); }
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","Interface Details",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("<img alt='' src='webwb/zblankimage.gif' class='pzbtn-i'/>");
		tools.appendString("</div></div></div></div>");
		tools.appendString("</button>");
		tools.appendString(" </div> ");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		tools.putParamValue("pega_attributes","");
	tools.appendString("</span>");					tools.putParamValue("doAutoFormatting", "false");
					tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}					} catch (Exception e) {

					
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'					&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }						}


}

/**
 * Implements a pega:save tag.
 */private boolean _jspx_meth_pega_save__1(PageContext aPageContext, java.lang.String aName, java.lang.String aAppendRef) throws Throwable {
/* pega:save */
com.pega.pegarules.jsptags.SaveTag _jspx_th_pega_save_ = (com.pega.pegarules.jsptags.SaveTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.SaveTag.class);
_jspx_th_pega_save_.setPageContext(pageContext);
_jspx_th_pega_save_.setParent(mParentTag);
_jspx_th_pega_save_.setName(aName);
_jspx_th_pega_save_.setAppendRef(aAppendRef);
int _jspx_eval_pega_save_ = _jspx_th_pega_save_.doStartTag();
if (_jspx_th_pega_save_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_save_);
return false;
}
/**
 * Implements a pega:param tag.
 */private boolean _jspx_meth_pega_param__2(PageContext aPageContext, java.lang.String aName, java.lang.String aRef) throws Throwable {
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param_ = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param_.setPageContext(pageContext);
_jspx_th_pega_param_.setParent(mParentTag);
_jspx_th_pega_param_.setName(aName);
_jspx_th_pega_param_.setRef(aRef);
int _jspx_eval_pega_param_ = _jspx_th_pega_param_.doStartTag();
if (_jspx_th_pega_param_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param_);
return false;
}
/**
 * Implements a pega:param tag.
 */private boolean _jspx_meth_pega_param__1(PageContext aPageContext, java.lang.String aName, java.lang.String aValue) throws Throwable {
/* pega:param */
com.pega.pegarules.jsptags.ParamTag _jspx_th_pega_param_ = (com.pega.pegarules.jsptags.ParamTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ParamTag.class);
_jspx_th_pega_param_.setPageContext(pageContext);
_jspx_th_pega_param_.setParent(mParentTag);
_jspx_th_pega_param_.setName(aName);
_jspx_th_pega_param_.setValue(aValue);
int _jspx_eval_pega_param_ = _jspx_th_pega_param_.doStartTag();
if (_jspx_th_pega_param_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_param_);
return false;
}
/**
 * Implements a pega:reference tag.
 */private boolean _jspx_meth_pega_reference__1(PageContext aPageContext, java.lang.String aName, java.lang.String aMode, java.lang.String aFormat) throws Throwable {
/* pega:reference */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_pega_reference_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_pega_reference_.setPageContext(pageContext);
_jspx_th_pega_reference_.setParent(mParentTag);
_jspx_th_pega_reference_.setName(aName);
_jspx_th_pega_reference_.setMode(aMode);
_jspx_th_pega_reference_.setFormat(aFormat);
int _jspx_eval_pega_reference_ = _jspx_th_pega_reference_.doStartTag();
if (_jspx_eval_pega_reference_ != Tag.SKIP_BODY) {
	do {
final Tag prevParentTag = mParentTag;
mParentTag = _jspx_th_pega_reference_;
if (_jspx_meth_pega_param__1(pageContext, "NoSmartPrompt", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "SkipClientValidation", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "DisableInputBox", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Width", "200px")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoOpenRule", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "ClassGroupInstances", "0")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "Class", "Rule-Obj-Class")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "NoEventOnPick", "0")) {
	return true;
}
if (_jspx_meth_pega_param__2(pageContext, "AJAXTrackID", "param.AJAXTrackID")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "bLocalize", "true")) {
	return true;
}
tools.putSaveValue("actionParams", "\'");
pzAuto.putSaveValue("actionParams", "\'", IAutoStreamRuntime.SAVE_APPEND);
tools.putSaveValue("attributes", " PN =.pyComponentInterfaceClass ONCHANGE= \"handleClientEvent(\'SERVER\', \'pzRuleSet_SetVersionUpdateFlag\',");
if (_jspx_meth_pega_save__1(pageContext, "attributes", "$save(actionParams)")) {
	return true;
}
pzAuto.putSaveValue("attributes", ", \'", IAutoStreamRuntime.SAVE_APPEND);
pzAuto.putSaveValue("attributes", "-1", IAutoStreamRuntime.SAVE_APPEND);
pzAuto.putSaveValue("attributes", "\', event)\"", IAutoStreamRuntime.SAVE_APPEND);
if (_jspx_meth_pega_param__2(pageContext, "pega_attributes", "$save(attributes)")) {
	return true;
}
if (_jspx_meth_pega_param__1(pageContext, "pega_events", "true")) {
	return true;
}
mParentTag = prevParentTag;
		int evalDoAfterBody = _jspx_th_pega_reference_.doAfterBody();
		if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN) {
			break;
		}
	} while (true);
}
if (_jspx_th_pega_reference_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_pega_reference_);
return false;
}


public void field_OpenRuleAdvanced_1() { 
if(pzAuto.handleEvaluateWhen(" o2== rx.pyIsVersionDeleted cqtrue",".pyIsVersionDeleted == \'true\'", "cell", "readonly" )){
try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyComponentInterfaceClass", "display", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
 } 
 else {try {

/*
 * reference tag
 * Cannot inline because: included stream is too big: 38240 bytes
 */
if (_jspx_meth_pega_reference__1(pageContext, ".pyComponentInterfaceClass", "input", "OpenRuleAdvanced")) {
	return;
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
 } 
}


public void generateClientWhenDiv_4() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(currentTemplatingStatus =='N' )
	tools.appendString("id=\"CT\"");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
if(currentTemplatingStatus =='N')
tools.appendString(" SWP=\".pyShowInterface\"  SHOW_WHEN=\".pyShowInterface == 'true'\"");
if(pzAuto.evaluateWhen(".pyShowInterface == 'true'",null,true)){
	if(currentTemplatingStatus =='N')
	tools.appendString(" style=' ");
	else
	clientWhenAttr += "style= '";
} else {
	if(currentTemplatingStatus =='N')
	tools.appendString(" style='display:none; ");
	else
	clientWhenAttr += "style='display:none;  ";
}
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(tools.getStepPage().getReference()+".pyShowInterface", -1);
	}
}catch(Exception e){}
}


public int simpleLayoutCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_4();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyComponentInterfaceClass",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '>");
	boolean isCellReadOnly = false;
	
 isCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(true, ".pyIsVersionDeleted == \'true\'");
	if(isCellReadOnly){
	tools.putParamValue("pzIsCellReadOnly","true");
	tools.appendString("<span  " + pzCell.getTestIdIfEnabled("20141027044716081036879-Label") + "  class='field-caption ");
	if(pzAuto.evaluateWhen(".pyIsVersionDeleted == \'true\'",null, true)) {
	tools.appendString("dataLabelForRead");
	} else {
	tools.appendString(pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite"));
	}
	tools.appendString("' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyComponentInterfaceClass" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(true, ".pyIsVersionDeleted == \'true\'");
	tools.appendString(tools.getLocalizedTextForString("pyCaption","Component Class") + "</span>");
	tools.putParamValue("pzIsCellReadOnly","false");
	}else {
	tools.appendString("<label  " + pzCell.getTestIdIfEnabled("20141027044716081036879-Label") + "  class='field-caption ");
	if(pzAuto.evaluateWhen(".pyIsVersionDeleted == \'true\'",null, true)) {
	tools.appendString("dataLabelForRead");
	} else {
	tools.appendString(pzSection.getCustomStyle(false, "","dataLabelForRead","dataLabelForWrite"));
	}
	tools.appendString("' ");
	if(!"true".equals(tools.getParamValue("pzIsCellReadOnly"))){
	tools.appendString("for='pyComponentInterfaceClass" + tools.getParamValueCSF("pega_RLindex") + "'");
	}
	tools.appendString(">");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(true, ".pyIsVersionDeleted == \'true\'");
tools.appendString(tools.getLocalizedTextForString("pyCaption","Component Class") + "</label>");
}
tools.appendString("<div class='field-item ");
if(pzAuto.handleEvaluateWhen(" o2== rx.pyIsVersionDeleted cqtrue",".pyIsVersionDeleted == \'true\'","cell", "visible")) {
tools.appendString("dataValueRead");
} else {
tools.appendString(pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite"));
}
tools.appendString("'>");
pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_27")) {field_OpenRuleAdvanced_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
index++;
return index;
}


public int simpleLayoutTemplateCell_6( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	expressionId = pxUniqueStreamHash+"_31";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  ".pyShowInterface == 'true'", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyLabelReserveSpace","true");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141027044716081036879-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","OpenRuleAdvanced");
	pgCells.put("forLabel",".pyComponentInterfaceClass");
	pgCells.put("pyAutoHTML","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	tools.putParamValue("editModeReadonlyCondition", " o2== rx.pyIsVersionDeleted cqtrue");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2== rx.pyIsVersionDeleted cqtrue",pxUniqueStreamHash+"_30");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyReadOnlyWhenId",pxUniqueStreamHash+"_30");
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
	String inspectorData=pzCell.getInspectorDataDynamic("OpenRuleAdvanced",".pyComponentInterfaceClass",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");if (pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(pxUniqueStreamHash+"_32")) {	field_OpenRuleAdvanced_1();} pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();labelName = "Component Class";
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


public int simpleLayoutCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_4();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxButton_1();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_7( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String expressionId = null;
	boolean isLabelJSP = false;
	String reqExpressionId = null;
	String disExpressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	expressionId = pxUniqueStreamHash+"_36";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  ".pyShowInterface == 'true'", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("20141027044716081137138-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxButton");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxButton",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxButton_1();labelName = "";
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
public void pzSetExpandParam_8() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleset_ShowRuleSetVersionBBBBBB","",false);
}


public void simpleLayout_2() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash26 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash26 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash26 != null && !"".equals(spxUniqueStreamHash26)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash26,pxUniqueStreamHash+"_26");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806051302460459451") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + " content  set-width-auto layout-content-inline_labels_left content-inline_labels_left " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash26 != null && !"".equals(spxUniqueStreamHash26)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_26");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","set-width-auto");
		pg_dlmeta.put("format","inline_labels_left");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_6(index);
	}else{
		index=simpleLayoutTemplateCell_6(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_7(index);
	}else{
		index=simpleLayoutTemplateCell_7(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_2() {
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
	String paramName = "EXPANDEDSubSectionpzRuleset_ShowRuleSetVersionBBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","121");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_2();
	containerComponent.endComponent();
	}
public void pzLayout_4() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_8();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_4();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_2();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void 
sectionDefaultValues_1() {
	boolean isInputEnabled=true;
	if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	isInputEnabled=tools.hasInputEnabled();
	}if(isInputEnabled){
	ClipboardPage myStepPage = tools.getPrimaryPage();
	if(!pzAuto.handleEvaluateWhen(" o2== rx.pyIsVersionDeleted cqtrue",".pyIsVersionDeleted == \'true\'", "cell", "active" )) {if(pzAuto.handleEvaluateWhen(" o2== rx.pyComponentInterfaceClass cq",".pyComponentInterfaceClass", "cell", "active" )) {
		 tools.getProperty(".pyComponentInterfaceClass").setValue(" ");if (pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){String tempDefault=tools.getProperty(".pyComponentInterfaceClass").toString();
		 tools.getProperty(".pyComponentInterfaceClass").setValue("");pzAuto.getUIComponentRuntime().getRuntimeContextTree().addDefaultValue(".pyComponentInterfaceClass",tempDefault);}
}
}
	tools.getInfEngUtils().forwardChain(tools);
	}}


public int simpleLayoutCell_8( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing float-left set-width-auto   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner set-width-auto'>");
	sectionDefaultValues_1();pzLayout_4();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_8( int index) {
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-all-spacing float-left set-width-auto");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	sectionDefaultValues_1();pzLayout_4();
 tools.putSaveValue("ContainerID", "");labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_12( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-all-spacing float-right set-width-auto   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner set-width-auto'>");
	pzLayout_6();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_12( int index) {
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-all-spacing float-right set-width-auto");
	pgCells.put("spanClass","iconRequired _iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelForRead _dataLabelForRead");
	pgCells.put("labelWriteClass","dataLabelForWrite _dataLabelForWrite");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	pzLayout_6();
 tools.putSaveValue("ContainerID", "");labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_7() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleset_ShowRuleSetVersionBBBBB","",false);
}


public void simpleLayout_4() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash25 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash25 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash25 != null && !"".equals(spxUniqueStreamHash25)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash25,pxUniqueStreamHash+"_25");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806051302460459377") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + " data-tour-id='interfaceLayoutID' class='" + " content  auto-width-column layout-content-simple_list content-simple_list  clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash25 != null && !"".equals(spxUniqueStreamHash25)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_25");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","auto-width-column clearfix");
		pg_dlmeta.put("format","simple_list");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}") + " data-tour-id='interfaceLayoutID'").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_8(index);
	}else{
		index=simpleLayoutTemplateCell_8(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_12(index);
	}else{
		index=simpleLayoutTemplateCell_12(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_4() {
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
	String paramName = "EXPANDEDSubSectionpzRuleset_ShowRuleSetVersionBBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(3).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	metadataPage.put("tourId"," data-tour-id='interfaceLayoutID'");
	String pyPrefix = null;
	metadataPage.put("sectionIndex","119");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_4();
	containerComponent.endComponent();
	}
public void pzLayout_7() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_7();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_7();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_4();
tools.putParamValue("pyInlineStyleSec","");
}
}
public void pzLayoutBody_1() {
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
}
public void pzLayoutBodyWrapper_3() {
tools.appendString("<div class='layout layout-none'>");
 String clsScroll= "";tools.appendString("<div section_index='1' class='" + clsScroll + " layout-body clearfix'>");
tools.putParamValue("LAYOUT_METHOD_NAME","simpleLayout_1");simpleLayout_1();
tools.appendString("</div></div>");
tools.putSaveValue("rowClass","");
}
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
getUIActionsMetaData_2() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();

		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=HistoryOfHarnessRecord");
	} else {
	tools.appendString("&amp;pyPreActivity=HistoryOfHarnessRecord");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&InsHandle=");
	} else {
	tools.appendString("&amp;InsHandle=");
	}
	tools.appendString("pzInsKey");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&AllVersions=");
	} else {
	tools.appendString("&amp;AllVersions=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"\", \"location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
}


public void pxLink_1() {boolean isDisplayTextWithParam = false;
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
	String uid=String.valueOf(((com.pega.pegarules.priv.context.PegaRequestor)tools.getRequestor()).currentTimeUnique());
	String navPage="pyNavigation"+uid;
	cellPage.put("automationId",pzCell.getTestIdIfEnabled("201410270438210664268724",true));
	if(false || (pzAuto.isOffline() && false) ){ 
	modePage2.put("pyNavigation",navPage);
	}
	modePage2.put("pyName","pzRuleset_ShowRuleSetVersion_$CTX$_118");
		String repeatIndx = "";
	modePage2.put("styles","");
	String pyTooltip = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyActionPrompt","\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("", ".pyActionPrompt");
	}
	pyTooltip = "";
	modePage2.put("tooltip",pyTooltip);
	modePage2.put("helpertype","none");
	modePage2.put("imgSrc","none");
	modePage2.put("actionImgPos","left");
	String customStyles = null;
	String pyLabel = "";
	if(pega.getPackageRuntime().canPackage()){
		tools.getLocalizedTextForString(".pyButtonLabel","View History\t"+repeatIndx,StreamBuilder.FMT_LITERAL);
	} else {
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue("View History", ".pyButtonLabel");
	}
	pyLabel = "View History";
	modePage2.put("pyLabel",pyLabel);
	modePage2.put("captionType","");
	if(expressionId !=null && expressionId.length() > 0){
	modePage2.put("pyExpressionId",expressionId);
	}
	modePage2.put("pyFormatTypeActionable","");
	String pyFormatValue = "";
	modePage2.put("pyFormatValue",pyFormatValue);
	String spxUniqueStreamHash20 = getUIActionsMetaData_2();
	if(spxUniqueStreamHash20 != null && !"".equals(spxUniqueStreamHash20)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash20,pxUniqueStreamHash+"_20");
	modePage2.put("pyActionStringID",pxUniqueStreamHash+"_20");
	}
	tools.putParamValue("skipHTMLEncoding", "false");
	cellPage.addMetadataInArray("pyModes",modePage1);
	cellPage.addMetadataInArray("pyModes",modePage2);
	metadataPage.putMetadata("pyCell",cellPage);
	ctrlComponent.addDependentScripts("pzpega_ui_template_link.js");
	ctrlComponent.beginComponent("pxLink",metadataPage);
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
		 String buttonUID = "name='pzRuleset_ShowRuleSetVersion_"+ referenceString+ "_118'";
	 String securedPropValue = null;
		tools.appendString("<a  " + pzCell.getTestIdIfEnabled("201410270438210664268724") + " href='"+hrefValue+"'");tools.appendString("onclick='pd(event);'  data-ctl='Link' ");if(!"true".equals(tools.getParamValue("pxAvoidUniqueAttribute")))tools.appendString(buttonUID);if(bOptimizedMarkup){tools.appendString(" data-bindprops='innerHTML,title' ");}
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,"","","","");
		{boolean isBehaviorAdded = false;isBehaviorAdded = false;
		tools.appendString(" data-click='[");if(isBehaviorAdded && true){ tools.appendString(","); }	tools.appendString("[\"openUrlInWindow\", [\"" + tools.findPage("pxThread", false).getString("pxReqURI") + "?pyActivity=@baseclass.pzProcessURLInWindow");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&pyPreActivity=HistoryOfHarnessRecord");
	} else {
	tools.appendString("&amp;pyPreActivity=HistoryOfHarnessRecord");
	}
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&InsHandle=");
	} else {
	tools.appendString("&amp;InsHandle=");
	}
	tools.appendString("pzInsKey");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&AllVersions=");
	} else {
	tools.appendString("&amp;AllVersions=");
	}
	tools.appendString("");
	if(pzAuto.isURLEncryptionEnabled()) {
	tools.appendString("&");
	} else {
	tools.appendString("&amp;");
	}
	tools.appendString("pzPrimaryPageName=" + pzAuto.getUIComponentRuntime().generateActionTokenForStepPage() + "\", \"\", \"location=0,menubar=0,toolbar=0,status=0,resizable=1,location=0,scrollbars=1\", \"false\",\":event\",\"false\", \"false\"]");

		tools.appendString("]");isBehaviorAdded = true;
		tools.appendString("]' ");
		}
			String repeatIndx = "";tools.appendString(" class='");tools.appendString("'");
		tools.appendString(" >");
		boolean hasLineBreaks = false;
		tools.appendString("");pega_uiengine_harness.pzGenAKey(tools.getLocalizedTextForString(".pyButtonLabel","View History",StreamBuilder.FMT_LITERAL)); checkForScriptTags_1(tools.getParamValue("pzULabel")); 
		tools.appendString("</a>");}

		tools.putParamValue("pega_attributes","");
	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y'){
	tools.appendString("</span>");
	 }tools.putParamValue("doAutoFormatting", "false");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_18","pzRuleSet_VersionEditPwdInclude", secInfo);
}


public void sectionBodyIncludeInCell_4() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_4();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pzRuleSet_VersionEditPwdInclude"; 
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
public void pzSetExpandParam_6() {
pzSection.getLayout().setExpandParam("SubSectionCellpzRuleset_ShowRuleSetVersion360","",false);
}
public void pzLayout_2() {
pzSetExpandParam_6();
pzLayoutBodyWrapper_2();
}
public void buildSection_3() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_15","pzRuleSet_VersionEditPwdInclude", secInfo);
}


public void sectionBodyIncludeInCell_3() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_3();
	return;
	}
	String strSectionPageProp = "";
	
	
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
	String sectionName = "pzRuleSet_VersionEditPwdInclude"; 
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


public int simpleLayoutCell_3( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleSet_VersionEditPwdInclude",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + " remove-top-spacing   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_3();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_3( int index) {
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
	pgCells.put("useLabel","true");
	pgCells.put("partialClass","remove-top-spacing");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleSet_VersionEditPwdInclude",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_2();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_4( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)") + " class='content-item content-field item-" + Integer.toString(index) + "   '  STRING_TYPE='field' RESERVE_SPACE='false'><div class='content-inner '><div class='field-item " + pzSection.getCustomStyle(false, "","dataValueRead","dataValueWrite") + "'>");
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
tools.putSaveValue("parentLayouttype","SIMPLELAYOUT");	pxLink_1();
	tools.appendString("</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_4( int index) {
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
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201410270438210664268724-Label")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("format","pxLink");
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
	String inspectorData=pzCell.getInspectorDataDynamic("pxLink",".pyTemplateInputBox",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	pxLink_1();labelName = "";
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
public void pzSetExpandParam_5() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleset_ShowRuleSetVersionBBBB","",false);
}


public void simpleLayout_1() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash14 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash14 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash14 != null && !"".equals(spxUniqueStreamHash14)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash14,pxUniqueStreamHash+"_14");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806051302460459781") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + " content  set-width-auto layout-content-inline content-inline  clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash14 != null && !"".equals(spxUniqueStreamHash14)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_14");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","set-width-auto clearfix");
		pg_dlmeta.put("format","inline");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_3(index);
	}else{
		index=simpleLayoutTemplateCell_3(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_4(index);
	}else{
		index=simpleLayoutTemplateCell_4(index);
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
	String paramName = "EXPANDEDSubSectionpzRuleset_ShowRuleSetVersionBBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","115");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_1();
	containerComponent.endComponent();
	}
public void pzLayout_3() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_5();
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
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.READ_ONLY_WHEN,".pyIsVersionDeleted == 'true'");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_13","pzRuleSet_RuleSetRequired", secInfo);
}


public void sectionBodyIncludeInCell_2() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	
	
	String inputType = "Input";
	boolean popReadOnly = false;
	if(pzAuto.evaluateWhen(".pyIsVersionDeleted == 'true'",null,false) || !tools.hasInputEnabled()) {
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pzRuleSet_RuleSetRequired"; 
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
	tools.getParameterPage().remove("SectionReadOnly");
}
public void pzSetExpandParam_4() {
pzSection.getLayout().setExpandParam("SubSectionCellpzRuleset_ShowRuleSetVersion225","",false);
}
public void pzLayout_1() {
pzSetExpandParam_4();
pzLayoutBodyWrapper_1();
}
public void buildSection_1() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",true);
	secInfo.put("preserveParamState",false);
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.READ_ONLY_WHEN,".pyIsVersionDeleted == 'true'");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_8","pzRuleSet_RuleSetRequired", secInfo);
}


public void sectionBodyIncludeInCell_1() { 
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_1();
	return;
	}
	String strSectionPageProp = "";
	
	
	String inputType = "Input";
	boolean popReadOnly = false;
	if(pzAuto.evaluateWhen(".pyIsVersionDeleted == 'true'",null,false) || !tools.hasInputEnabled()) {
		inputType = "NoInput";
	}
	if("NoInput".equals(inputType)){
		tools.putParamValue("SectionReadOnly","-1");
	}
	String sectionName = "pzRuleSet_RuleSetRequired"; 
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
	tools.getParameterPage().remove("SectionReadOnly");
}


public void generateClientWhenDiv_3() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(currentTemplatingStatus =='N' )
	tools.appendString("id=\"CT\"");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
if(currentTemplatingStatus =='N')
tools.appendString(" SWP=\".pyAppBasedValidation\"  SHOW_WHEN=\"Top.pyAppBasedValidation!=true\"");
if(pzAuto.evaluateWhen("Top.pyAppBasedValidation!=true",null,true)){
	if(currentTemplatingStatus =='N')
	tools.appendString(" style=' ");
	else
	clientWhenAttr += "style= '";
} else {
	if(currentTemplatingStatus =='N')
	tools.appendString(" style='display:none; ");
	else
	clientWhenAttr += "style='display:none;  ";
}
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges("Top.pyAppBasedValidation", -1);
	}
}catch(Exception e){}
}


public int simpleLayoutCell_2( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_3();
	tools.appendString("' " + pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleSet_RuleSetRequired",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-sub_section item-" + Integer.toString(index) + "   '  STRING_TYPE='sub_section' RESERVE_SPACE='false'><div class='content-inner '>");
	String tempRenderSingle = "";
	
	
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle","");
	sectionBodyIncludeInCell_1();tools.putParamValue("RenderSingle",tempRenderSingle);
	tools.appendString("</div></div>");
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
	expressionId = pxUniqueStreamHash+"_12";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  "Top.pyAppBasedValidation!=true", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","sub_section");
	pgCells.put("useLabel","true");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	tools.putParamValue("editModeReadonlyCondition", " o2== rx.pyIsVersionDeleted cqtrue");
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" o2== rx.pyIsVersionDeleted cqtrue",pxUniqueStreamHash+"_11");
	IUIComponentMetadata pxWhenIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.putMetadata("pxWhenIdentifiers",pxWhenIdentifiers);
	pxWhenIdentifiers.put("pyReadOnlyWhenId",pxUniqueStreamHash+"_11");
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	String inspectorData=pzCell.getInspectorDataDynamic("SUB_SECTION","pzRuleSet_RuleSetRequired",".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	String tempRenderSingle = "";
	tempRenderSingle = tools.getParamValue("RenderSingle");
	tools.putParamValue("RenderSingle", "");
	pzLayout_1();
 tools.putSaveValue("ContainerID", "");tools.putParamValue("RenderSingle", tempRenderSingle);
	labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_5( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " set-width-auto   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner set-width-auto'>");
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_5( int index) {
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","set-width-auto");
	pgCells.put("spanClass","iconRequired _iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelForRead _dataLabelForRead");
	pgCells.put("labelWriteClass","dataLabelForWrite _dataLabelForWrite");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	pzLayout_3();
 tools.putSaveValue("ContainerID", "");labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_13( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	pzLayout_7();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_13( int index) {
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	pzLayout_7();
 tools.putSaveValue("ContainerID", "");labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_3() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleset_ShowRuleSetVersionBBB","",false);
}


public void simpleLayout_5() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash7 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash7 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash7 != null && !"".equals(spxUniqueStreamHash7)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash7,pxUniqueStreamHash+"_7");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806051302460458726") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + " class='" + " content  layout-content-default content-default  clearfix" + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash7 != null && !"".equals(spxUniqueStreamHash7)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_7");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("class","clearfix");
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("isFlex","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_2(index);
	}else{
		index=simpleLayoutTemplateCell_2(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_5(index);
	}else{
		index=simpleLayoutTemplateCell_5(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_13(index);
	}else{
		index=simpleLayoutTemplateCell_13(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_5() {
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
	String paramName = "EXPANDEDSubSectionpzRuleset_ShowRuleSetVersionBBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(2).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","112");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_5();
	containerComponent.endComponent();
	}
public void pzLayout_8() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_3();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_8();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_5();
tools.putParamValue("pyInlineStyleSec","");
}
}


public void generateClientWhenDiv_2() {
	String clientWhenAttr = "";
	char currentTemplatingStatus = 'Y';
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	if(currentTemplatingStatus =='N' )
	tools.appendString("<div ");
	if(currentTemplatingStatus =='N' )
	tools.appendString("id=\"CT\"");
	if(tools.getThread().getName().indexOf("/$WorkProcessing") != -1 || tools.getThread().getName().indexOf("/$FlowModalProcess") != -1 ) {
	if(currentTemplatingStatus =='N'){
	tools.appendString(" thread_name = \"" + tools.getThread().getName() + "\"");
	} else{
	String threadName =tools.getThread().getName();
	clientWhenAttr += "thread_name= \""+threadName+"\" ";
	}
}
if(currentTemplatingStatus =='N')
tools.appendString(" SWP=\".pyAppBasedValidation\"  SHOW_WHEN=\"Top.pyAppBasedValidation==true\"");
if(pzAuto.evaluateWhen("Top.pyAppBasedValidation==true",null,true)){
	if(currentTemplatingStatus =='N')
	tools.appendString(" style=' ");
	else
	clientWhenAttr += "style= '";
} else {
	if(currentTemplatingStatus =='N')
	tools.appendString(" style='display:none; ");
	else
	clientWhenAttr += "style='display:none;  ";
}
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges("Top.pyAppBasedValidation", -1);
	}
}catch(Exception e){}
}


public int simpleLayoutCell_1( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_2();
	tools.appendString("' " + pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData() + pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)") + " class='content-item content-label item-" + Integer.toString(index) + " remove-bottom-spacing remove-top-spacing    " + pzSection.getCustomStyle(false, "","standard_dataLabelRead","standard_dataLabelWrite")  + " '  STRING_TYPE='label' RESERVE_SPACE='false'><div class='content-inner '>" + "<div  " + pzCell.getTestIdIfEnabled("201410270438210658262397") + "  class='field-item " + pzSection.getCustomStyle(false, "","dataLabelRead heading_4_dataLabelRead","dataLabelWrite heading_4_dataLabelWrite") + "' >");
	boolean showstar = true;
	boolean isSecCellReadOnly = false;
	
 isSecCellReadOnly = !pzAuto.getSection().getControl().isControlEditable(false, null);
	tools.appendString(tools.getLocalizedTextForString("pyCaption","In Application Validation mode \'Required RuleSets\' are disabled") + "</div>" + pega.getUIEngine().getFVInspectorUtils().stopCollectingFieldValueData() + "</div></div>");
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
	expressionId = pxUniqueStreamHash+"_6";
	expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("showWhen",  "Top.pyAppBasedValidation==true", expressionId);
	if(expression != null) { expressionId = expression.getId(); }
	 String pyCustomRequireFormat= "";
	pyCustomRequireFormat=  tools.getLocalizedTextForString("pyCaption","pyRequired");
	String dataFieldValueMeta = pega.getUIEngine().getFVInspectorUtils().startCollectingFieldValueData();
	String baseRef ="";
	boolean pyDLCellVisibility = false;
	IUIComponent cc_dlCell = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlCellMeta = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata pgCells = pzAuto.getUIComponentRuntime().createMetadata();
	pgCells.put("pyType","label");
	pgCells.put("partialClass","remove-bottom-spacing remove-top-spacing");
	pgCells.put("automationId",new StringBuilder(" ").append(pzCell.getTestIdIfEnabled("201410270438210658262397")).append(" ").toString().replace("data-test-id=","").trim());
	pgCells.put("spanClass","iconRequired heading_4_iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelRead heading_4_dataLabelRead");
	pgCells.put("labelWriteClass","dataLabelWrite heading_4_dataLabelWrite");
	pgCells.put("customROStyles","standard_dataLabelRead");
	pgCells.put("customRWStyles","standard_dataLabelWrite");
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
	String inspectorData=pzCell.getInspectorDataDynamic("Label",null,".pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1)");
	if(!inspectorData.isEmpty()) {
	pgCells.put("liveUI",inspectorData);
	}
	labelName = "In Application Validation mode 'Required RuleSets' are disabled";
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


public int simpleLayoutCell_14( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-bottom-spacing   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner '>");
	pzLayout_8();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_14( int index) {
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-bottom-spacing");
	pgCells.put("spanClass","iconRequired _iconRequired");
	pgCells.put("isFlex","false");
	pgCells.put("labelReadClass","dataLabelForRead _dataLabelForRead");
	pgCells.put("labelWriteClass","dataLabelForWrite _dataLabelForWrite");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	pzLayout_8();
 tools.putSaveValue("ContainerID", "");labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}


public int simpleLayoutCell_17( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	if(!pzAuto.handleEvaluateWhen(" wxpzBranchisLocked","pzBranchisLocked","cell", "visible" )) {
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		return index;
	}
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + " remove-bottom-spacing float-right set-width-auto   '  STRING_TYPE='layout' RESERVE_SPACE='false'><div class='content-inner set-width-auto'>");
	pzLayout_10();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div></div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_17( int index) {
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","remove-bottom-spacing float-right set-width-auto");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("isFlex","false");
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addWhen(" wxpzBranchisLocked",pxUniqueStreamHash+"_66");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_66");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenName","pzBranchisLocked");
	pxWhenIdentifiersForCell.put("pyVisibilityWhenClass","Rule-RuleSet-Version");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	} else {
	pxWhenIdentifiersForCell.put("pyVisibilityWhenId",pxUniqueStreamHash+"_66");
	pg_dlCellMeta.putMetadata("pxWhenIdentifiers",pxWhenIdentifiersForCell);
	}
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	if (!isExpression && isOffline) {
	pyDLCellVisibility = true;
	} else {
	pyDLCellVisibility = pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginVisibleWhen(" wxpzBranchisLocked", pxUniqueStreamHash+"_66"); 
	}
	if(pyDLCellVisibility) {
	pzLayout_10();
 tools.putSaveValue("ContainerID", "");}
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
public void pzSetExpandParam_2() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleset_ShowRuleSetVersionBB","",false);
}


public void simpleLayout_8() {
	char parentTemplatingStatus = pzAuto.getUIComponentRuntime().getTemplatingUIStatus();
	char currentTemplatingStatus = 'Y';
	if(!tools.getParamValue("UITemplatingStatus").equals("N")){
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
	} else{
	currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('N');
	}
	String spxUniqueStreamHash3 = "";
	if(currentTemplatingStatus != 'N'){
	spxUniqueStreamHash3 = getUIActionsMetaData_1();
	if(spxUniqueStreamHash3 != null && !"".equals(spxUniqueStreamHash3)){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash3,pxUniqueStreamHash+"_3");
	}
	}
	String refreshAttributes = "";
	String strMethodName = "";
	IUIComponent cc_dl = null;
	cc_dl = pzAuto.getUIComponent();
	IUIComponentMetadata pg_dlmeta = pzAuto.getUIComponentRuntime().createMetadata();
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806051302460458605") + " ");
	String subscriptionID = null;
	String ackEnabled = null;
	if(currentTemplatingStatus != 'Y'){
		tools.appendString("<div bSimpleLayout='true' ");
		if(((PegaAPI)tools).getUIEngine().getPushServiceUtils().isPushEnabled() && subscriptionID!=null){
		tools.appendString(" data-subscription-id='"+subscriptionID+"' data-ack-enabled='"+ackEnabled+"'");
		}
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + " class='" + " content  layout-content-default content-default " + "'  ");
		if(!tools.getParamValue("pyPegaDesignMode").equals("true")){
		tools.appendString(" ");
		}
		tools.appendString(" " + refreshAttributes + ">");
		}else {
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		if(!tools.getParamValue("pyPegaDesignMode").equals("true") && spxUniqueStreamHash3 != null && !"".equals(spxUniqueStreamHash3)){
		pg_dlmeta.put("pyActionStringID",pxUniqueStreamHash+"_3");
		}
		if(!StringUtils.isBlank(expressionId)) {
		pg_dlmeta.put("pyExpressionId",expressionId);
		}
		if(!"".equals(strMethodName))
		pg_dlmeta.put("methodnm",strMethodName);
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}") + "").append("\"").toString();
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
		index=simpleLayoutCell_14(index);
	}else{
		index=simpleLayoutTemplateCell_14(index);
	}
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_17(index);
	}else{
		index=simpleLayoutTemplateCell_17(index);
	}
		if(currentTemplatingStatus != 'Y'){
		tools.appendString("</div>");
		}else {
		cc_dl.endComponent();
		}
		pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(parentTemplatingStatus);
	}
	public void pzLayoutContainer_8() {
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
	String paramName = "EXPANDEDSubSectionpzRuleset_ShowRuleSetVersionBB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1).pySectionBody(1).pyTable.pyRows(1).pyCells(1).pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("sectionIndex","109");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("dlChild","true");
	metadataPage.put("lMode","Inline-block");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_8();
	containerComponent.endComponent();
	}
public void pzLayout_11() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_2();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_11();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_8();
tools.putParamValue("pyInlineStyleSec","");
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


public int simpleLayoutCell_18( int index) {
	IUIComponent uiComp = null;
	String labelName = "";
	String ariahiddenString = "";
	String baseRef ="";
	generateClientWhenDiv_1();
	tools.appendString("'  class='content-item content-layout item-" + Integer.toString(index) + "   flex flex-row '  STRING_TYPE='layout' RESERVE_SPACE='false'>");
	pzLayout_11();
 tools.putSaveValue("ContainerID", "");tools.appendString("</div>");
	index++;
	return index;
}


public int simpleLayoutTemplateCell_18( int index) {
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
	pgCells.put("pyType","layout");
	pgCells.put("RWActive","false");
	pgCells.put("partialClass","flex flex-row");
	pgCells.put("spanClass","iconRequired standard_iconRequired");
	pgCells.put("cstmreqfor",pyCustomRequireFormat);
	if(!StringUtils.isBlank(expressionId)) 
	pgCells.put("pyExpressionId",expressionId);
	if(!"".equals(baseRef))
	pgCells.put("pyBaseRef",String.valueOf(baseRef));
	pgCells.put("labelJSP",String.valueOf(isLabelJSP));
	pgCells.put("pyPreventXSSInLabel",false);
	pg_dlCellMeta.putMetadata("pyCell",pgCells);
	boolean isExpression = false;
	boolean isOffline = false;
	cc_dlCell.beginComponent("DynamicLayoutCell", pg_dlCellMeta);
	pzLayout_11();
 tools.putSaveValue("ContainerID", "");labelName = "";
	if(!pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(labelName, "pyCaption");
	} else {
	StringUtils.crossScriptingFilter(tools.getLocalizedTextForString("pyCaption",labelName));
	}
	pgCells.put("pyLabelValue",labelName);
	cc_dlCell.endComponent();
	index++;
	return index;
}
public void pzSetExpandParam_1() {
pzSection.getLayout().setExpandParam("SubSectionpzRuleset_ShowRuleSetVersionB","",false);
}


public void simpleLayout_9() {
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
	pg_dlmeta.put("automationId"," " + pzCell.getTestIdIfEnabled("201806051303190565435") + " ");
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
		tools.appendString("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + " class='" + "flex  content  layout-content-default content-default " + "'  ");
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
		pg_dlmeta.put("format","default");
		String inspectorData= new StringBuilder("\"").append("" + pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}") + "").append("\"").toString();
		if(!inspectorData.equals("\"\"")) {
		pg_dlmeta.put("liveUI",inspectorData);
		}
		pg_dlmeta.put("clear","false");
		pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
		cc_dl.beginComponent("DynamicLayout",pg_dlmeta);
		}
		int index = 1;
		if(currentTemplatingStatus != 'Y') {
		index=simpleLayoutCell_18(index);
	}else{
		index=simpleLayoutTemplateCell_18(index);
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
	public void pzLayoutContainer_9() {
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
	String paramName = "EXPANDEDSubSectionpzRuleset_ShowRuleSetVersionB";
	metadataPage.put("paramName", paramName);
	String inspectorLayoutData = pzAuto.getDataUIMetaAttribute("{'type':'Layout','subType':'DYNAMICLAYOUT','pgRef':'.pySections(1)'}");
	if(!inspectorLayoutData.isEmpty()) {
	metadataPage.put("liveUI", inspectorLayoutData);
	}
	String pyPrefix = null;
	metadataPage.put("prefix","-simple_combo_group_child");
	metadataPage.put("sectionIndex","1");
	IUIComponent containerComponent = pzAuto.getUIComponent();
	metadataPage.put("lMode","Flexbox");
	containerComponent.beginComponent("pxLayoutContainer",metadataPage);
	pzLayoutBody_9();
	containerComponent.endComponent();
	}
public void pzLayout_12() {
char currentTemplatingStatus = pzAuto.getUIComponentRuntime().setTemplatingUIStatus('Y');
if(currentTemplatingStatus == 'Y'){
	pzAuto.getUIComponentRuntime().insertComponentPlaceholderPage();
}
pzSetExpandParam_1();
tools.putParamValue("RWClasses","");
if(!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
pzLayoutBodyWrapper_12();
}
if(pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
tools.putParamValue("pyInlineStyleSec","");
pzLayoutContainer_9();
tools.putParamValue("pyInlineStyleSec","");
}
}









private void performStream_1() throws Throwable {
buildWhiteList_1();pzSectionBody_1();}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Rule-RuleSet-Version.pyComponentInterfaceClass", new LiteweightPropertyDefinition("Rule-RuleSet-Version", "pyComponentInterfaceClass", "sTN", false, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Rule-RuleSet-Version");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_SHOWRULESETVERSION #20180713T135703.137 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-SystemArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzRuleset_ShowRuleSetVersion");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return false;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return false;}protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("simpleLayout_2", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_1", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_4", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_8", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_5", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_7", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_9", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_6", new String[][] {});
pzExternalMethodMapping.put("simpleLayout_3", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-RULESET-VERSION PZRULESET_SHOWRULESETVERSION #20180713T135703.137 GMT", "Rule-RuleSet-Version pzRuleset_ShowRuleSetVersion", "Pega-SystemArchitect", "08-01-01", "20180713T135703.137 GMT");
}
