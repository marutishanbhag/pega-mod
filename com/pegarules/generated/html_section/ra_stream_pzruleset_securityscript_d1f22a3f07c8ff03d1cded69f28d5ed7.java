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
 * Builds JSP stream RULE-RULESET-NAME!PZRULESET_SECURITYSCRIPT.
 */
public class ra_stream_pzruleset_securityscript_d1f22a3f07c8ff03d1cded69f28d5ed7 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzRuleSet_SecurityScript.Rule_RuleSet_Name.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 179926858;
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
	public ra_stream_pzruleset_securityscript_d1f22a3f07c8ff03d1cded69f28d5ed7(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "361bf76597bda2f716eb698bfa0d394268253c73";
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
/* Instance RULE-HTML-SECTION RULE-RULESET-NAME PZRULESET_SECURITYSCRIPT #20180713T135658.532 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pxUniqueStreamHash = "361bf76597bda2f716eb698bfa0d394268253c73";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzRuleSet_SecurityScript",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
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
 * Begin RULE-HTML-SECTION RULE-RULESET-NAME PZRULESET_SECURITYSCRIPT #20180713T135658.532 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-RULESET-NAME PZRULESET_SECURITYSCRIPT #20180713T135658.532 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
pzAuto.getUIComponentRuntime().getRuntimeContextTree().popSection();
pzAuto.getUIComponentRuntime().resetTemplatingUIStatus(previousTemplatingStatus);
}
/* end RULE-HTML-SECTION RULE-RULESET-NAME PZRULESET_SECURITYSCRIPT #20180713T135658.532 GMT */
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
	"Rule-HTML-Section:PZRULESET_SECURITYSCRIPT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZRULESET_SECURITYSCRIPT","Rule-HTML-Section","RULE-RULESET-NAME",false,"","Pega-SystemArchitect","08-01-01","RULE-HTML-SECTION RULE-RULESET-NAME PZRULESET_SECURITYSCRIPT #20180713T135658.532 GMT","!PZRULESET_SECURITYSCRIPT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",179926858)
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
//	RULE-HTML-SECTION RULE-RULESET-NAME PZRULESET_SECURITYSCRIPT #20180713T135658.532 GMT:20180713T135658.532 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT

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
		return "76da76a022e57c54bcdaff98985a22af";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-RuleSet-Name";
	}
public String getAspect() {
return "Stream";
}
private void performStream_1() throws Throwable {
tools.appendString("<script>\npega.u.d.disablePasswordReload();\npega.rf.formProxy.registerTabChangeListener(setUseCheckOut);\n\n/* Commented below code for BUG-104127 - User must be able to change back from OVERRIDE setting but unable to create new OVERRIDE rulesets*/\n/*Disable the RuleSet Type dropdown when the ruleset type is Override\nif(pega.util.Dom.getElementsById(\"pyRuleSetType\")[0]) {\n\tvar ruleSetTypeEle = pega.util.Dom.getElementsById(\"pyRuleSetType\")[0];\n\tif(ruleSetTypeEle && ruleSetTypeEle.value == \"OVERRIDE\") {\n\t\truleSetTypeEle.disabled = true;\n\t}\n}*/\n\n/*Register the event to add to the Versions list in the ruleset form when clicked create button in new dialog window*/\nregisterEventListener(\"OpenOtherEvent\",addToVersionsList);\nregisterEventListener(\"NewRuleCreatedEvent\",addSavedToVersionsList);\nregisterEventListener(\"EmbeddedRuleEvent\",addToList);\n  \npega.u.d.attachOnUnload(function() {\n  cancelEventListener(\"OpenOtherEvent\",addToVersionsList);\n  cancelEventListener(\"NewRuleCreatedEvent\",addSavedToVersionsList);\n  cancelEventListener(\"EmbeddedRuleEvent\",addToList);\n});\n\n/*Add to the versions list when new version created via Quick Create or Save As */ \nfunction addSavedToVersionsList(oFormData) {\n\t/*If condition becomes true in case of quick create */\n\tif(oFormData.pxObjClass.toUpperCase() == \"RULE-RULESET-VERSION\" && oFormData.pzInsKey) {\n\t\t/*Get the RuleSet pzInsKey */\n\t\tvar strInsKey = pega.rf.formProxy._getPRXML().selectSingleNode(\"//pzInsKey\").text;\n\t\t\n\t\t/* Not working\n\t\tvar ptInsKeyObj = new pega.tools.InsKey(oFormData.pzInsKey);\n\t\tvar strRuleName = ptInsKeyObj.getKeys()[ptInsKeyObj.getKeyCount()-2]\n\t\tvar strFormDataInsKey = \"RULE-RULESET-NAME \"+strRuleName;\n\t\t*/\n\t\t\n\t\t// Derive potential ruleset name from the version pzInsKey\n\t\tvar formDataInsKeyArr = oFormData.pzInsKey.split(\" \");\n\t\tvar strFormDataInsKey = \"RULE-RULESET-NAME \"+formDataInsKeyArr[1];\n\t\t\n\t\t/* Compare the opened ruleset form pzInskey and created one */\n\t\tif(strInsKey.toUpperCase() == strFormDataInsKey.toUpperCase()) {\n\t\t\tvar versionsListDivEle = pega.u.d.getSectionByName(\"pzRuleSet_ListRuleSetVersions\",\"\",\"\");\n\t\t\tvar actParams = \"&pzPrimaryPageName=\"+ pega.rf.formProxy._getPRXML().selectSingleNode(\"//pyPageName\").text+\n\t\t\t\"&EventType=QuickCreate&insHandle=\"+oFormData.pzInsKey;\n\t\t\t/* Add the created version to Versions list and reload the versions section */\n\t\t\tpega.u.d.reloadSection(versionsListDivEle, \"pzRuleSet_UpdateVersionsList\", actParams , false, true, \"\", false);\n\t\t}\n\t}\n}\n\n/*Add to the versions list when clicked on Create button in new dialog window */ \nfunction addToVersionsList(ruleSetInsKey) {\n\tif(ruleSetInsKey){\n\t\t/*Get the RuleSet name pzInsKey */\n\t\tvar strInsKey = pega.rf.formProxy._getPRXML().selectSingleNode(\"//pzInsKey\").text;\n\t\t/* Compare the opened ruleset form pzInskey and created one */\n\t\tif(ruleSetInsKey.toUpperCase() == strInsKey.toUpperCase()) {\n\t\t\tvar versionsListDivEle = pega.u.d.getSectionByName(\"pzRuleSet_ListRuleSetVersions\",\"\",\"\");\n\t\t\tvar actParams = \"&pzPrimaryPageName=\"+ pega.rf.formProxy._getPRXML().selectSingleNode(\"//pyPageName\").text;\n\t\t\t/* Add the created version to Versions list and reload the versions section */\n\t\t\tpega.u.d.reloadSection(versionsListDivEle, \"pzRuleSet_UpdateVersionsList\", actParams , false, true, \"\", false);\n\t\t}\n\t}\n}\n\nfunction addToList(eventDetais) {\n\tif(eventDetais) {\n\t\tif(eventDetais.eventName == \"SAVEAS\") {\n\t\t\tvar ruleSetInsKey = eventDetais.pzInsKey;\n\t\t\tif(ruleSetInsKey){\n\t\t\t\t/*Get the RuleSet name pzInsKey */\n\t\t\t\tvar strInsKey = pega.rf.formProxy._getPRXML().selectSingleNode(\"//pzInsKey\").text;\n\t\t\t\t/* Compare the opened ruleset form pzInskey and created one */\n\t\t\t\tif(ruleSetInsKey.toUpperCase() == strInsKey.toUpperCase()) {\n\t\t\t\t\tvar versionsListDivEle = pega.u.d.getSectionByName(\"pzRuleSet_ListRuleSetVersions\",\"\",\"\");\n\t\t\t\t\tvar actParams = \"&pzPrimaryPageName=\"+ pega.rf.formProxy._getPRXML().selectSingleNode(\"//pyPageName\").text+\n\t\t\t\t\t\"&EventType=SAVEAS\";\n\t\t\t\t\t/* Add the created version to Versions list and reload the versions section */\n\t\t\t\t\tpega.u.d.reloadSection(versionsListDivEle, \"pzRuleSet_UpdateVersionsList\", actParams , false, true, \"\", false);\n\t\t\t\t}\n\t\t\t}\t\t\n\t\t}\n\t}\n}\n\n</script>");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Rule-RuleSet-Name");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-RULESET-NAME PZRULESET_SECURITYSCRIPT #20180713T135658.532 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-SystemArchitect");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzRuleSet_SecurityScript");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-RULESET-NAME PZRULESET_SECURITYSCRIPT #20180713T135658.532 GMT", "Rule-RuleSet-Name pzRuleSet_SecurityScript", "Pega-SystemArchitect", "08-01-01", "20180713T135658.532 GMT");
}
