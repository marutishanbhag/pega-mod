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
 * Builds JSP stream @BASECLASS!RULEFORMSETTINGS.
 */
public class ra_stream_ruleformsettings_9d9a9b15ad59135948ba182599461713 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.RuleFormSettings.Data_Admin_Operator_ID.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1044712667;
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
	public ra_stream_ruleformsettings_9d9a9b15ad59135948ba182599461713(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "c7963bef8066406372369f21ac08cf2d79b594b5";
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
/* Instance RULE-HTML-SECTION @BASECLASS RULEFORMSETTINGS #20180713T135143.263 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
pxUniqueStreamHash = "c7963bef8066406372369f21ac08cf2d79b594b5";
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
 * Begin RULE-HTML-SECTION @BASECLASS RULEFORMSETTINGS #20180713T135143.263 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION @BASECLASS RULEFORMSETTINGS #20180713T135143.263 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION @BASECLASS RULEFORMSETTINGS #20180713T135143.263 GMT */
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
	"Rule-HTML-Section:RULEFORMSETTINGS", 
	"Rule-Obj-Property:PXUPDATEDATETIME", 
	"Rule-Obj-Property:PXCREATEDATETIME", 
	"Rule-Obj-Property:PXOBJCLASS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("RULEFORMSETTINGS","Rule-HTML-Section","@BASECLASS",false,"","Pega-Desktop","08-01-01","RULE-HTML-SECTION @BASECLASS RULEFORMSETTINGS #20180713T135143.263 GMT","!RULEFORMSETTINGS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1044712667), 
		new DependentRuleInfo("PXUPDATEDATETIME","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT","!PXUPDATEDATETIME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXCREATEDATETIME","Rule-Obj-Property","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXCREATEDATETIME #20180713T131152.871 GMT","!PXCREATEDATETIME",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0), 
		new DependentRuleInfo("PXOBJCLASS","Rule-Obj-Property","@BASECLASS",false,"","Pega-SystemArchitect","08-01-01","RULE-OBJ-PROPERTY @BASECLASS PXOBJCLASS #20180713T135622.443 GMT","!PXOBJCLASS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",0)
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
//	RULE-HTML-SECTION @BASECLASS RULEFORMSETTINGS #20180713T135143.263 GMT:20180713T135143.263 GMT
//	RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT:20190430T113026.575 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXOBJCLASS #20180713T135622.443 GMT:20180713T135622.443 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXOBJCLASS #20180713T135622.443 GMT:20180713T135622.443 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT:20180713T131155.884 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXUPDATEDATETIME #20180713T131155.884 GMT:20180713T131155.884 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEDATETIME #20180713T131152.871 GMT:20180713T131152.871 GMT
//	RULE-OBJ-PROPERTY @BASECLASS PXCREATEDATETIME #20180713T131152.871 GMT:20180713T131152.871 GMT

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
		return "4fa0c28de3cf3127ae983dab7a564c31";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
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
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getProperty(aParam1).getStringValue(), aParam2)));
}
private void performStream_1() throws Throwable {
	if (when_1("pxRequestor.pyPegaDesignMode", "true")) {
tools.appendString(" [PRXML Text Area] ");
	}
tools.appendString(" <textarea id=\"PRXML\" name=\"PRXML\" style=\"display:none;\" > <?xml version=\"1.0\" ?> <pagedata> <pxObjClass>");

/*
 * reference tag
 * Cannot inline because: Rule-HTML-Property Default is not inlined
 */
if (_jspx_meth_p_r__1(pageContext, ".pxObjClass", "normal")) {
	return;
}
tools.appendString("</pxObjClass> <pzInsKey>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getProperty("pzInsKey").getStringValue())));
tools.appendString("</pzInsKey> <pzOriginalInstanceKey>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getProperty("pzOriginalInstanceKey").getStringValue())));
tools.appendString("</pzOriginalInstanceKey> <pxInsName>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getProperty("pxInsName").getStringValue())));
tools.appendString("</pxInsName> <pyLabel>");
tools.appendString(XMLUtils.encodeString(XMLUtils.encodeString(tools.getStepPage().getProperty("pyLabel").getStringValue())));
tools.appendString("</pyLabel> <pxUpdateDateTime>");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_p_r__1(pageContext, ".pxUpdateDateTime", "normal")) {
	return;
}
tools.appendString("</pxUpdateDateTime> <pxCreateDateTime>");

/*
 * reference tag
 * Cannot inline because: mode is "normal"
 */
if (_jspx_meth_p_r__1(pageContext, ".pxCreateDateTime", "normal")) {
	return;
}
tools.appendString("</pxCreateDateTime> <pyRuleForm>true</pyRuleForm> <pyPageName>");
out.print( tools.getPrimaryPage().getName() );
tools.appendString("</pyPageName> <pzStatus> ");

		String strValid = "valid";
		if(tools.getPrimaryPage().hasMessages()){
			strValid = "false";
		} 

		tools.appendString(strValid);
	
tools.appendString("</pzStatus> <pyToolBarSettings>");

		try{
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
	
tools.appendString("</pyToolBarSettings> <pyPagesAndClasses>");

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
						tools.appendString("<" + aRow.getName() +">"+ aRow.getStringValue() +"</"+ aRow.getName() +">");
					}
					tools.appendString("</rowdata>");
				}
			}
	
tools.appendString("</pyPagesAndClasses> </pagedata> </textarea > ");
}
private static final Map oPropDefinitions_1 = new HashMap();
static {
	oPropDefinitions_1.put("Data-Admin-Operator-ID.pxCreateDateTime", new LiteweightPropertyDefinition("Data-Admin-Operator-ID", "pxCreateDateTime", "sMY", true, true, "DateTime-Medium", false));
	oPropDefinitions_1.put("Data-Admin-Operator-ID.pxUpdateDateTime", new LiteweightPropertyDefinition("Data-Admin-Operator-ID", "pxUpdateDateTime", "sMY", true, true, "DateTime-Long", false));
	oPropDefinitions_1.put("Data-Admin-Operator-ID.pxObjClass", new LiteweightPropertyDefinition("Data-Admin-Operator-ID", "pxObjClass", "sIY", true, true, "Default", false));
}
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "@baseclass");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION @BASECLASS RULEFORMSETTINGS #20180713T135143.263 GMT");
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

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION @BASECLASS RULEFORMSETTINGS #20180713T135143.263 GMT", "@baseclass RuleFormSettings", "Pega-Desktop", "08-01-01", "20180713T135143.263 GMT");
}
