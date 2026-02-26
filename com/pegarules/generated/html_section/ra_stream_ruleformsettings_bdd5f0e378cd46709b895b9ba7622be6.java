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
 * Builds JSP stream RULE-OBJ-PROPERTY!RULEFORMSETTINGS.
 */
public class ra_stream_ruleformsettings_bdd5f0e378cd46709b895b9ba7622be6 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.RuleFormSettings.Rule_Obj_Property.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 13756035;
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
	public ra_stream_ruleformsettings_bdd5f0e378cd46709b895b9ba7622be6(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "82f077e4a6e55b412e3a0de76a46d48a28589a89";
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
/* Instance RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMSETTINGS #20180713T135251.728 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "82f077e4a6e55b412e3a0de76a46d48a28589a89";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("RuleFormSettings",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
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
 * Begin RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMSETTINGS #20180713T135251.728 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMSETTINGS #20180713T135251.728 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMSETTINGS #20180713T135251.728 GMT */
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
	"Rule-Obj-HTML:RULEFORMSETTINGSSHARED", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS", 
	"Rule-HTML-Section:RULEFORMSETTINGS", 
	"Rule-Obj-Property:PXINSTANCELOCKEDRULESET", 
	"Rule-Obj-Property:PYINTERFACE", 
	"Rule-Obj-Property:PZISPRIVATECHECKOUT", 
	"Rule-Obj-Property:PYPROPERTYMODE", 
	"Rule-Obj-Property:PYMETHODSTATUS", 
	"Rule-Obj-Property:PYRULESETVERSION", 
	"Rule-Obj-Property:PXCREATEDATETIME", 
	"Rule-Obj-Property:PYBASERULE", 
	"Rule-Obj-Property:PYRULESET", 
	"Rule-Obj-Property:PYRULENAME", 
	"Rule-Obj-Property:PXINSTANCELOCKEDRULESETVERSION", 
	"Rule-Obj-Property:PYPAGECLASS", 
	"Rule-Obj-Property:PZDOCUMENTKEY", 
	"Rule-Obj-Property:PXUPDATEDATETIME", 
	"Rule-Obj-Property:PYCLASSNAME", 
	"Rule-Obj-Property:PXOBJCLASS", 
	"Rule-Obj-Property:PYRULEAVAILABLE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("RULEFORMSETTINGSSHARED","Rule-Obj-HTML","RULE-",false,"","Pega-Desktop","08-01-01","RULE-OBJ-HTML RULE- RULEFORMSETTINGSSHARED #20180713T135503.858 GMT","!RULEFORMSETTINGSSHARED",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1281500754), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-OBJ-HTML",true,"Rule-Obj-HTML","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("RULEFORMSETTINGS","Rule-HTML-Section","RULE-OBJ-PROPERTY",false,"","Pega-Desktop","08-01-01","RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMSETTINGS #20180713T135251.728 GMT","!RULEFORMSETTINGS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",13756035), 
		new DependentRuleInfo("PXINSTANCELOCKEDRULESET","Rule-Obj-Property","RULE-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESET #20180713T131307.825 GMT","!PXINSTANCELOCKEDRULESET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYINTERFACE","Rule-Obj-Property","RULE-",false,"","Pega-WB","08-01-01","RULE-OBJ-PROPERTY RULE- PYINTERFACE #20180713T131512.331 GMT","!PYINTERFACE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PZISPRIVATECHECKOUT","Rule-Obj-Property","RULE-",false,"","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY RULE- PZISPRIVATECHECKOUT #20180713T135041.702 GMT","!PZISPRIVATECHECKOUT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYPROPERTYMODE","Rule-Obj-Property","RULE-OBJ-PROPERTY",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPROPERTYMODE #20180713T131303.959 GMT","!PYPROPERTYMODE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYMETHODSTATUS","Rule-Obj-Property","RULE-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PYMETHODSTATUS #20180713T131307.972 GMT","!PYMETHODSTATUS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYRULESETVERSION","Rule-Obj-Property","RULE-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PYRULESETVERSION #20180713T131308.011 GMT","!PYRULESETVERSION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXCREATEDATETIME","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXCREATEDATETIME #20180713T131152.871 GMT","!PXCREATEDATETIME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYBASERULE","Rule-Obj-Property","RULE-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PYBASERULE #20180713T131307.869 GMT","!PYBASERULE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYRULESET","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PYRULESET #20180713T131156.473 GMT","!PYRULESET",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYRULENAME","Rule-Obj-Property","RULE-OBJ-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-OBJ- PYRULENAME #20180713T131305.725 GMT","!PYRULENAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXINSTANCELOCKEDRULESETVERSION","Rule-Obj-Property","RULE-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESETVERSION #20180713T131307.830 GMT","!PXINSTANCELOCKEDRULESETVERSION",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYPAGECLASS","Rule-Obj-Property","RULE-OBJ-PROPERTY",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT","!PYPAGECLASS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PZDOCUMENTKEY","Rule-Obj-Property","@BASECLASS",false,"","Pega-Desktop","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PZDOCUMENTKEY #20180713T135013.492 GMT","!PZDOCUMENTKEY",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXUPDATEDATETIME","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT","!PXUPDATEDATETIME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYCLASSNAME","Rule-Obj-Property","RULE-",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT","!PYCLASSNAME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXOBJCLASS","Rule-Obj-Property","@BASECLASS",false,"","Pega-SystemArchitect","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXOBJCLASS #20180713T135622.443 GMT","!PXOBJCLASS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PYRULEAVAILABLE","Rule-Obj-Property","RULE-",false,"","Pega-WB","08-01-01","RULE-OBJ-PROPERTY RULE- PYRULEAVAILABLE #20180713T131513.819 GMT","!PYRULEAVAILABLE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0)
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
//	RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMSETTINGS #20180713T135251.728 GMT:20180713T135251.728 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	RULE-OBJ-HTML RULE- RULEFORMSETTINGSSHARED #20180713T135503.858 GMT:20180713T135503.858 GMT
//	RULE-OBJ-ACTIVITY RULE-OBJ-HTML PZASSEMBLEPREPROCESS #20180713T133312.569 GMT:20180713T133312.569 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PZDOCUMENTKEY #20180713T135013.492 GMT:20180713T135013.492 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PZDOCUMENTKEY #20180713T135013.492 GMT:20180713T135013.492 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXOBJCLASS #20180713T135622.443 GMT:20180713T135622.443 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXOBJCLASS #20180713T135622.443 GMT:20180713T135622.443 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT:20180713T131155.884 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT:20180713T131155.884 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEDATETIME #20180713T131152.871 GMT:20180713T131152.871 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEDATETIME #20180713T131152.871 GMT:20180713T131152.871 GMT
//	RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESET #20180713T131307.825 GMT:20180713T131307.825 GMT
//	RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESET #20180713T131307.825 GMT:20180713T131307.825 GMT
//	RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESETVERSION #20180713T131307.830 GMT:20180713T131307.830 GMT
//	RULE-OBJ-PROPERTY RULE- PXINSTANCELOCKEDRULESETVERSION #20180713T131307.830 GMT:20180713T131307.830 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ- PYRULENAME #20180713T131305.725 GMT:20180713T131305.725 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ- PYRULENAME #20180713T131305.725 GMT:20180713T131305.725 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-OBJ-PROPERTY RULE- PYCLASSNAME #20180713T131307.906 GMT:20180713T131307.906 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYRULESET #20180713T131156.473 GMT:20180713T131156.473 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PYRULESET #20180713T131156.473 GMT:20180713T131156.473 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULESETVERSION #20180713T131308.011 GMT:20180713T131308.011 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULESETVERSION #20180713T131308.011 GMT:20180713T131308.011 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULEAVAILABLE #20180713T131513.819 GMT:20180713T131513.819 GMT
//	RULE-OBJ-PROPERTY RULE- PYRULEAVAILABLE #20180713T131513.819 GMT:20180713T131513.819 GMT
//	RULE-OBJ-PROPERTY RULE- PYBASERULE #20180713T131307.869 GMT:20180713T131307.869 GMT
//	RULE-OBJ-PROPERTY RULE- PYBASERULE #20180713T131307.869 GMT:20180713T131307.869 GMT
//	RULE-OBJ-PROPERTY RULE- PYINTERFACE #20180713T131512.331 GMT:20180713T131512.331 GMT
//	RULE-OBJ-PROPERTY RULE- PYINTERFACE #20180713T131512.331 GMT:20180713T131512.331 GMT
//	RULE-OBJ-PROPERTY RULE- PYMETHODSTATUS #20180713T131307.972 GMT:20180713T131307.972 GMT
//	RULE-OBJ-PROPERTY RULE- PYMETHODSTATUS #20180713T131307.972 GMT:20180713T131307.972 GMT
//	RULE-OBJ-PROPERTY RULE- PZISPRIVATECHECKOUT #20180713T135041.702 GMT:20180713T135041.702 GMT
//	RULE-OBJ-PROPERTY RULE- PZISPRIVATECHECKOUT #20180713T135041.702 GMT:20180713T135041.702 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPROPERTYMODE #20180713T131303.959 GMT:20180713T131303.959 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPROPERTYMODE #20180713T131303.959 GMT:20180713T131303.959 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT:20180713T131303.947 GMT
//	RULE-OBJ-PROPERTY RULE-OBJ-PROPERTY PYPAGECLASS #20180713T131303.947 GMT:20180713T131303.947 GMT

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
		return "95f902e0f579d84ae52c745c89c9bfe2";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Property";
	}
public String getAspect() {
return "Stream";
}
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN, java.lang.String aM) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
_jspx_th_p_r_.setM(aM);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
private void performStream_1() throws Throwable {
tools.appendString("<pzDocumentKey>");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_p_r__1(pageContext, ".pzDocumentKey", "normal")) {
	return;
}
tools.appendString("</pzDocumentKey>\n<pxObjClass>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pxObjClass", "normal")) {
	return;
}
tools.appendString("</pxObjClass>\n<pzInsKey>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getString("pzInsKey") )));

tools.appendString("</pzInsKey>\n<pzOriginalInstanceKey>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getString("pzOriginalInstanceKey") )));

tools.appendString("</pzOriginalInstanceKey>\n<pxInsName>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getString("pxInsName") )));

tools.appendString("</pxInsName>\n<pyLabel>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getString("pyLabel") )));

tools.appendString("</pyLabel>\n<pxUpdateDateTime>");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_p_r__1(pageContext, ".pxUpdateDateTime", "normal")) {
	return;
}
tools.appendString("</pxUpdateDateTime>\n<pxCreateDateTime>");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_p_r__1(pageContext, ".pxCreateDateTime", "normal")) {
	return;
}
tools.appendString("</pxCreateDateTime>\n<pxInstanceLockedKey>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getString("pxInstanceLockedKey") )));

tools.appendString("</pxInstanceLockedKey>  \n<pxInstanceLockedRuleSet>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pxInstanceLockedRuleSet", "normal")) {
	return;
}
tools.appendString("</pxInstanceLockedRuleSet>\n<pxInstanceLockedRuleSetVersion>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pxInstanceLockedRuleSetVersion", "normal")) {
	return;
}
tools.appendString("</pxInstanceLockedRuleSetVersion> \n<pxInstanceLockedBy>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getString("pxInstanceLockedBy") )));

tools.appendString("</pxInstanceLockedBy>\n<pxInsId>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getString("pxInsId") )));

tools.appendString("</pxInsId> \n<pyRuleName>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pyRuleName", "normal")) {
	return;
}
tools.appendString("</pyRuleName> \n<pyClassName>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pyClassName", "normal")) {
	return;
}
tools.appendString("</pyClassName> \n<pyRuleSet>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pyRuleSet", "normal")) {
	return;
}
tools.appendString("</pyRuleSet> \n<pyRuleSetVersion>");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_p_r__1(pageContext, ".pyRuleSetVersion", "normal")) {
	return;
}
tools.appendString("</pyRuleSetVersion>\n<pyRuleAvailable>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pyRuleAvailable", "normal")) {
	return;
}
tools.appendString("</pyRuleAvailable>\n<pyBaseRule>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pyBaseRule", "normal")) {
	return;
}
tools.appendString("</pyBaseRule>\n<pyInterface>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pyInterface", "normal")) {
	return;
}
tools.appendString("</pyInterface>\n<pyMethodStatus >");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pyMethodStatus ", "normal")) {
	return;
}
tools.appendString("</pyMethodStatus>\n<pyRuleForm>true</pyRuleForm>\n<pyPageName>");
out.print( tools.getPrimaryPage().getName() );
tools.appendString("</pyPageName>\n<pzIsPrivateCheckOut>");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_p_r__1(pageContext, ".pzIsPrivateCheckOut", "normal")) {
	return;
}
tools.appendString("</pzIsPrivateCheckOut>\n<pzStatus>\n");

String strValid = "valid";
if(tools.getPrimaryPage().hasMessages()){
     strValid = "false";
} 

tools.appendString(strValid);

tools.appendString("</pzStatus>\n<pyToolBarSettings>\n");

try {
	//tools.appendString(tools.getStepPage().getProperty("pyPagesAndClasses").getPageValue().getXML());
	java.util.Set setToolBarSettings = tools.getStepPage().getProperty("pyToolBarSettings").getPageValue().entrySet();
	java.util.Iterator itToolBarSettings = setToolBarSettings.iterator();

	while (itToolBarSettings.hasNext())
	{
		java.util.Map.Entry entry = (java.util.Map.Entry)itToolBarSettings.next();
		ClipboardProperty cpProp = (ClipboardProperty)entry.getValue();
		tools.appendString("<" + cpProp.getName() +">"+ cpProp.getStringValue() +"</" + cpProp.getName() +">");
	}
}
catch(Exception e){
	tools.appendString(e.getMessage());
}
                                

tools.appendString("\n</pyToolBarSettings>\n<pyPagesAndClasses>\n");

	ClipboardProperty pagesAndClasses = tools.getStepPage().getIfPresent("pyPagesAndClasses");
         if (pagesAndClasses != null) {
		java.util.Iterator iterator = pagesAndClasses.iterator();
	         while (iterator.hasNext()) {
                  		int i = 1;
		         ClipboardProperty oneRow = (ClipboardProperty)iterator.next();
		         ClipboardProperty aRow;
                           java.util.Iterator inIterator = oneRow.iterator();
                           tools.appendString("<rowdata REPEATINGINDEX="+"'"+i+"'"+">");
		         		while (inIterator.hasNext()){
                             		aRow = (ClipboardProperty)inIterator.next();
					if(aRow.isScalar()){
		         				tools.appendString("<" + aRow.getName() +">"+ aRow.getStringValue() +"</"+ aRow.getName() +">");
					}
		                   }
			tools.appendString("</rowdata>");
	         }
         }


tools.appendString("\n</pyPagesAndClasses>");
}
private static final Map oPropDefinitions_2 = new HashMap();
static {
	oPropDefinitions_2.put("Rule-Obj-Property.pyRuleSet", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyRuleSet", "sTN", false, true, "Default", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pyRuleSetVersion", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyRuleSetVersion", "sTN", false, true, "RuleAttributes", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pxCreateDateTime", new LiteweightPropertyDefinition("Rule-Obj-Property", "pxCreateDateTime", "sMY", true, true, "DateTime-Medium", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pyInterface", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyInterface", "siN64", false, true, "Default", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pzDocumentKey", new LiteweightPropertyDefinition("Rule-Obj-Property", "pzDocumentKey", "sTN", false, true, "pxTextInput", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pxUpdateDateTime", new LiteweightPropertyDefinition("Rule-Obj-Property", "pxUpdateDateTime", "sMY", true, true, "DateTime-Long", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pxObjClass", new LiteweightPropertyDefinition("Rule-Obj-Property", "pxObjClass", "sIY", true, true, "Default", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pxInstanceLockedRuleSet", new LiteweightPropertyDefinition("Rule-Obj-Property", "pxInstanceLockedRuleSet", "sTY", true, true, "Default", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pyRuleAvailable", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyRuleAvailable", "siN", false, true, "Default", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pyClassName", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyClassName", "siN", false, true, "Default", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pzIsPrivateCheckOut", new LiteweightPropertyDefinition("Rule-Obj-Property", "pzIsPrivateCheckOut", "sTN", false, true, "pxTextInput", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pxInstanceLockedRuleSetVersion", new LiteweightPropertyDefinition("Rule-Obj-Property", "pxInstanceLockedRuleSetVersion", "sTY", true, true, "Default", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pyRuleName", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyRuleName", "sTN255", false, true, "Default", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pyMethodStatus ", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyMethodStatus ", "stN10", false, true, "Default", false));
	oPropDefinitions_2.put("Rule-Obj-Property.pyBaseRule", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyBaseRule", "sSN", false, true, "Default", false));
}
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "Internal");
	oStreamProperties_2.put("pyClassName", "Rule-");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-OBJ-HTML RULE- RULEFORMSETTINGSSHARED #20180713T135503.858 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-Obj-HTML");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "RuleFormSettingsShared");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Build stream RULE-OBJ-HTML RULE- RULEFORMSETTINGSSHARED #20180713T135503.858 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-HTML RULE- RULEFORMSETTINGSSHARED #20180713T135503.858 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-OBJ-HTML RULE- RULEFORMSETTINGSSHARED #20180713T135503.858 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-OBJ-HTML RULE- RULEFORMSETTINGSSHARED #20180713T135503.858 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
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
/* end RULE-OBJ-HTML RULE- RULEFORMSETTINGSSHARED #20180713T135503.858 GMT */
}
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_2() throws Throwable {
tools.appendString("<textarea id=\"PRXML\" name=\"PRXML\" style=\"visibility:hidden\" > <?xml version='1.0' ?> <pagedata> ");
/* Include stream RULE-OBJ-HTML RULE- RULEFORMSETTINGSSHARED #20180713T135503.858 GMT */
include_1();

tools.appendString(" <pyPropertyMode>");

/*
 * reference tag
 * Cannot inline because: included stream is too big: 22776 bytes
 */
if (_jspx_meth_p_r__1(pageContext, ".pyPropertyMode", "normal")) {
	return;
}
tools.appendString("</pyPropertyMode> <pyPageClass>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pyPageClass", "normal")) {
	return;
}
tools.appendString("</pyPageClass> </pagedata> </textarea >");
}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Rule-Obj-Property.pyPageClass", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyPageClass", "sIN", false, true, "Default", false));
	oPropDefinitions_1.put("Rule-Obj-Property.pyPropertyMode", new LiteweightPropertyDefinition("Rule-Obj-Property", "pyPropertyMode", "siN", false, true, "PromptSelect", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "Rule-Obj-Property");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMSETTINGS #20180713T135251.728 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "RuleFormSettings");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION RULE-OBJ-PROPERTY RULEFORMSETTINGS #20180713T135251.728 GMT", "Rule-Obj-Property RuleFormSettings", "Pega-Desktop", "08-01-01", "20180713T135251.728 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-HTML RULE- RULEFORMSETTINGSSHARED #20180713T135503.858 GMT", "Rule- RuleFormSettingsShared", "Pega-Desktop", "08-01-01", "20180713T135503.858 GMT");
}
