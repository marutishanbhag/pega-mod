package com.pegarules.generated.flowaction;
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
import com.pega.pegarules.priv.context.PegaThread;
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
/**
 * Builds JSP stream DATA-MO-CONNECTOR-TRANSITION!PZPROPERTYPANELMODAL.
 */
public class ra_stream_pzpropertypanelmodal_893ba93bea4365ba8ccb6258d4201e4b extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_FlowAction.pzPropertyPanelModal.Data_MO_Connector_Transition.Stream");
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
	public ra_stream_pzpropertypanelmodal_893ba93bea4365ba8ccb6258d4201e4b(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "8a3f63dc2f4ab2c538b18b07fd3b485bc74a6d06";
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
final PegaThread thread_1 = (PegaThread) pega.getThread();
Date ruleResolutionDate_1 = thread_1.getRuleDateOverride();
if (ruleResolutionDate_1 == null) {
	ruleResolutionDate_1 = new Date();
}
final RuleChooser ruleChooser_1 = ((PegaDatabase) tools.getDatabase()).getRuleChooser(tools.getThread());
/* handling 1 of 2 definitions  */
if (ruleChooser_1.ruleApplies(new RuleCharacteristicsImpl(".pyDSMType", "Inheritance", null, RuleResolutionStatistics.CircumstanceType.valueOf("PROPERTY") ,null, null, null, tools))) {
/* Instance RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T143446.893 GMT	Pega-DecisionArchitect:08-01-01	.pyDSMType=Inheritance	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_1();
/* handling 2 of 2 definitions (isLast)  */
} else {
/* Instance RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T141209.950 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
executeStream_2();
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
	"Rule-Obj-FlowAction:PZPROPERTYPANELMODAL", 
	"Rule-Obj-FlowAction:PZPROPERTYPANELMODAL"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-FLOWACTION",true,"Rule-Obj-FlowAction","Pega-UIEngine","08-23-01","RULE-OBJ-ACTIVITY RULE-OBJ-FLOWACTION PZASSEMBLEPREPROCESS #20230618T001616.699 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZPROPERTYPANELMODAL","Rule-Obj-FlowAction","DATA-MO-CONNECTOR-TRANSITION",false,"","Pega-ProcessArchitect","08-01-01","RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T141209.950 GMT","!PZPROPERTYPANELMODAL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",586167569), 
		new DependentRuleInfo("PZPROPERTYPANELMODAL","Rule-Obj-FlowAction","DATA-MO-CONNECTOR-TRANSITION",false,"","Pega-DecisionArchitect","08-01-01","RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T143446.893 GMT","!PZPROPERTYPANELMODAL",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1255262268)
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
//	RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T143446.893 GMT:20180713T143446.893 GMT
//	RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T141209.950 GMT:20180713T141209.950 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-FLOWACTION PZASSEMBLEPREPROCESS #20230618T001616.699 GMT:20230618T001616.699 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-FLOWACTION PZASSEMBLEPREPROCESS #20230618T001616.699 GMT:20230618T001616.699 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION DEFAULT ISJAVARESERVEDWORD #20180713T131436.845 GMT:20180713T131436.845 GMT
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION DEFAULT VALIDATEUNICODEIDENTIFIER #20180713T131438.339 GMT:20180713T131438.339 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATECLIENTWHENDIV #20180713T133337.849 GMT:20180713T133337.849 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATEFLOWACTIONHTML #20180713T133337.870 GMT:20180810T090941.571 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESETDEFAULTVALUES #20180713T132451.001 GMT:20180713T132451.001 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESHOWSTREAMINSERT--(STRINGBUFFER,BOOLEAN) #20180713T132451.012 GMT:20180713T132451.012 GMT
//	RULE-UTILITY-FUNCTION HARNESS GETCLIENTWHENPROPERTIES #20180713T133337.962 GMT:20180713T133337.962 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPREDATATRANSFORM #20180713T133339.990 GMT:20180713T133339.990 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETPROPSFORTRACKING--(BOOLEAN,STRING) #20190520T091856.371 GMT:20190520T091856.371 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGETREFRESHWHENPREACTIVITY #20180713T133340.025 GMT:20180713T133340.025 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
//	RULE-UTILITY-FUNCTION PAGE GETCLASS #20180713T131440.090 GMT:20180713T131440.090 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT
//	RULE-UTILITY-FUNCTION STRING ISLITERAL #20180713T131441.656 GMT:20180713T131441.656 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "30d90a76eb85955574e113181aa3f448";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-MO-Connector-Transition";
	}
public String getAspect() {
return "Stream";
}


public void generateClientWhenDiv_1() {
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
String strRWPreActivity = "";
strRWPreActivity = "pzSetLabel,,resultVal=";
if(currentTemplatingStatus =='N'){

}
String strDTransform = "";
strDTransform = "";
if(currentTemplatingStatus =='N') {
try {
tools.appendString("RWP=\".pyConditionType\" RW=\".pyConditionType Changes && .pyConditionType != ''\" RWA=\"");
tools.appendString("pzSetLabel,,resultVal=");
tools.appendString("\" ");
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
if(currentTemplatingStatus =='N')
tools.appendString(">");
if(currentTemplatingStatus =='Y')
clientWhenAttr += "'";
if(currentTemplatingStatus =='Y')
tools.putParamValue("clientWhenAttr", clientWhenAttr);
try{
	if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){
		com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));
		changeTracker.trackValueChanges(pega_uiengine_harness.pzGetPropertyNameForTracking(".pyConditionType"), -1);
	}
}catch(Exception e){}
}
public void buildSection_2() { 
	Map<String, Object> secInfo = new HashMap<String, Object>();
	secInfo.put("usingPage","");
	secInfo.put("isUsingPagePropertyRef",false);
	secInfo.put("doNotConsiderDecParams",false);
	secInfo.put("keepStreamProperties",false);
	secInfo.put("preserveParamState",false);
	Map<String, String> secParams = new HashMap<String, String>();
	secInfo.put(com.pega.pegarules.priv.runtime.ui.IRuntimeContextTree.PARAMETERS, secParams);
	secInfo.put("packageSection", true);
	secInfo.put("packageSectionClass", "Data-MO-Connector-Transition");
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(StringUtils.isBlank(expressionId)) {
		expressionId = pxUniqueStreamHash+"_2";
	}
		expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyConditionType Changes  && .pyConditionType != \'\'", expressionId);
		if(StringUtils.isBlank(expressionId)) {
			expressionId = pxUniqueStreamHash+"_3";
		}
			expression = pzAuto.getUIComponentRuntime().getExpressionEvaluator().addExpression("sectionRefreshWhen",  ".pyConditionType Changes  && .pyConditionType != \'\'", expressionId);
			String strRWPreActivity = "";
			strRWPreActivity = "pzSetLabel,,resultVal=";
			
			expression.addActivity("sectionRefreshWhen", "pzSetLabel", "", "resultVal=");
			String strDTransform = "";
			strDTransform = "";
			if(!StringUtils.isBlank(expressionId)) {
				secInfo.put("pyExpressionId", expressionId);
			}
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_1","pzPropertyPanelWrapper", secInfo);
		}
public void buildWhiteList_2() {
Map<String, String> config;
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "pzSetLabel");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "pzSetLabel");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "pzNullValues");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("addRow", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "AppendToPageList");
config.put("DeferLoadActivity", "RemoveFromPageList");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("addRow", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "pzSetLabel");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "pzNullValues");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("openruleAdvancedActions", null).register();
pega.getUIEngine().getUIAction("openRule", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("addRow", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
pega.getUIEngine().getUIAction("refresh", null).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "AppendToPageList");
config.put("DeferLoadActivity", "RemoveFromPageList");
pega.getUIEngine().getUIAction("refresh", config).register();
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("pyActivity", "");
config.put("DeferLoadActivity", "");
pega.getUIEngine().getUIAction("refresh", config).register();
pega.getUIEngine().getUIAction("addRow", null).register();
}


public void includeSectionBody_2() { 
	buildWhiteList_2();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
	try{
	pzPackageRuntime.packageSection(
	"pzPropertyPanelWrapper", tools.getStepPage().getReference(),"Data-MO-Connector-Transition");}catch(Exception e1){oLog.error("Error generating package - " + e1.getMessage());}
	}
	generateClientWhenDiv_1();
	
	
	String includedSectionName = "";includedSectionName = "pzPropertyPanelWrapper";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}if (!pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	tools.appendString("\n\t\t\t\t\t\t</div>");
	}
}
private void performStream_2() throws Throwable {
tools.appendString(" ");
 tools.putSaveValue("bClientValidation", "true"); 
tools.appendString(" ");
 tools.putSaveValue("FlowActionValidate", "NO_VALIDATION"); 
tools.appendString(" ");
pzAuto.getSection().includeShowMeHarnessInsert();
tools.appendString(" ");
	if (when_1()) {
tools.appendString(" ");
	}
tools.putParamValue("flowActionUIRef","pzPropertyPanelWrapper"); 
tools.appendString(" ");

tools.putParamValue("pyShowFAButtons","false");
String bshowFAButtons = tools.getParamValue("pyShowFAButtons");
tools.putParamValue("pyCustomizeFALabels","false");
tools.putParamValue("pySubmitLabel","Submit");
tools.putParamValue("pyCancelLabel","Cancel");
tools.putParamValue("pyNextLabel","Next");
tools.putParamValue("pyPreviousLabel","Previous");
tools.putParamValue("StreamType","Rule-Obj-FlowAction");

 if(pzAuto.isInspectMode()){ 
tools.appendString("<span ");
out.print( pzAuto.getInpectorData("FlowAction", "", "","pzPropertyPanelModal","Rule-Obj-FlowAction","Data-MO-Connector-Transition") );
tools.appendString(" >");
 } 
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
pzPackageRuntime.packageSection("pzPropertyPanelWrapper",tools.getStepPage().getReference(), null);
tools.appendString("<div id='section-placeholder' data-class='");
out.print(tools.getStepPage().getString("pxObjClass"));
tools.appendString("' data-section='pzPropertyPanelWrapper'></div> ");
} else {
includeSectionBody_2();
}
tools.appendString("<span style=\"display: none;\" uitype=\"Rule-HTML-Section\" id=\"pzFlowActionUITypeRef\" uiref=\"pzPropertyPanelWrapper\"></span> ");
tools.putParamValue("pyShowFAButtons",bshowFAButtons);
 if(pzAuto.isInspectMode()){ 
tools.appendString("</span>");
 } 
}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "Data-MO-Connector-Transition");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T141209.950 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-Obj-FlowAction");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-ProcessArchitect");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pzPropertyPanelModal");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
private boolean when_1() throws Throwable {
	return (pega.isPreviewMode() || ((tools.hasInputEnabled())));
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_1","pzDMPropertyPanel", secInfo);
}
public void buildWhiteList_1() {
Map<String, String> config;
config = new HashMap<String, String>();
config.put("pyTarget", "thisSection");
config.put("pyPreDataTransform.pyName", "");
config.put("reloadType", "multipleSections");
config.put("pyActivity", "pzSetLabel");
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
	
	
	String includedSectionName = "";includedSectionName = "pzDMPropertyPanel";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
private void performStream_1() throws Throwable {
tools.appendString(" ");
 tools.putSaveValue("bClientValidation", "true"); 
tools.appendString(" ");
 tools.putSaveValue("FlowActionValidate", "NO_VALIDATION"); 
tools.appendString(" ");
pzAuto.getSection().includeShowMeHarnessInsert();
tools.appendString(" ");
	if (when_1()) {
tools.appendString(" ");
	}
tools.putParamValue("flowActionUIRef","pzDMPropertyPanel"); 
tools.appendString(" ");

tools.putParamValue("pyShowFAButtons","false");
String bshowFAButtons = tools.getParamValue("pyShowFAButtons");
tools.putParamValue("pyCustomizeFALabels","false");
tools.putParamValue("pySubmitLabel","Submit");
tools.putParamValue("pyCancelLabel","Cancel");
tools.putParamValue("pyNextLabel","Next");
tools.putParamValue("pyPreviousLabel","Previous");
tools.putParamValue("StreamType","Rule-Obj-FlowAction");

 if(pzAuto.isInspectMode()){ 
tools.appendString("<span ");
out.print( pzAuto.getInpectorData("FlowAction", "", "","pzPropertyPanelModal","Rule-Obj-FlowAction","Data-MO-Connector-Transition") );
tools.appendString(" >");
 } 
if(pega_uiengine_offlinesupport.pzIsForOfflineTemplate()){
pzPackageRuntime.packageSection("pzDMPropertyPanel",tools.getStepPage().getReference(), null);
tools.appendString("<div id='section-placeholder' data-class='");
out.print(tools.getStepPage().getString("pxObjClass"));
tools.appendString("' data-section='pzDMPropertyPanel'></div> ");
} else {
includeSectionBody_1();
}
tools.appendString("<span style=\"display: none;\" uitype=\"Rule-HTML-Section\" id=\"pzFlowActionUITypeRef\" uiref=\"pzDMPropertyPanel\"></span> ");
tools.putParamValue("pyShowFAButtons",bshowFAButtons);
 if(pzAuto.isInspectMode()){ 
tools.appendString("</span>");
 } 
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "Inheritance");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Data-MO-Connector-Transition");
	oStreamProperties_1.put("pyCircumstanceProp", ".pyDSMType");
	oStreamProperties_1.put("pzInsKey", "RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T143446.893 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-Obj-FlowAction");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-DecisionArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzPropertyPanelModal");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private void executeStream_1() {
/*
 * Begin RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T143446.893 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T143446.893 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-FlowAction");
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
/* end RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T143446.893 GMT */
}
private void executeStream_2() {
/*
 * Begin RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T141209.950 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T141209.950 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-Obj-FlowAction");
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

	performStream_2();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_2);
	mStreamResponse.setJspBaseClass(prevClass_2);
	pz_CurrentRuleKey = prevRuleKey_2;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,false);
}
/* end RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T141209.950 GMT */
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_1;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_1.getRuleSetName(), oTraceInfo_1.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T143446.893 GMT", "Data-MO-Connector-Transition pzPropertyPanelModal", "Pega-DecisionArchitect", "08-01-01", "20180713T143446.893 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-FLOWACTION DATA-MO-CONNECTOR-TRANSITION PZPROPERTYPANELMODAL #20180713T141209.950 GMT", "Data-MO-Connector-Transition pzPropertyPanelModal", "Pega-ProcessArchitect", "08-01-01", "20180713T141209.950 GMT");
}
