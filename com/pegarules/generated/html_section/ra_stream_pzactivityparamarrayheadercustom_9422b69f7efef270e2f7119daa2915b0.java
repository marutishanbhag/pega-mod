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
/**
 * Builds JSP stream EMBED-ACTIVITYSTEPS!PZACTIVITYPARAMARRAYHEADERCUSTOM.
 */
public class ra_stream_pzactivityparamarrayheadercustom_9422b69f7efef270e2f7119daa2915b0 extends StreamBuilderSection implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Section.pzActivityParamArrayHeaderCustom.Embed_ActivitySteps.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = -966967022;
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
	public ra_stream_pzactivityparamarrayheadercustom_9422b69f7efef270e2f7119daa2915b0(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "3d5352cc81d1390c65817f5ba08c66fe1dd17ea0";
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
/* Instance RULE-HTML-SECTION EMBED-ACTIVITYSTEPS PZACTIVITYPARAMARRAYHEADERCUSTOM #20180713T135208.641 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=true */
pxUniqueStreamHash = "3d5352cc81d1390c65817f5ba08c66fe1dd17ea0";
pzAuto.getUIComponentRuntime().getRuntimeContextTree().pushSection("pzActivityParamArrayHeaderCustom",pxUniqueStreamHash);pxIsNonTemplateStream = hasNonTemplateMethod_1();
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
 * Begin RULE-HTML-SECTION EMBED-ACTIVITYSTEPS PZACTIVITYPARAMARRAYHEADERCUSTOM #20180713T135208.641 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-SECTION EMBED-ACTIVITYSTEPS PZACTIVITYPARAMARRAYHEADERCUSTOM #20180713T135208.641 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
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
/* end RULE-HTML-SECTION EMBED-ACTIVITYSTEPS PZACTIVITYPARAMARRAYHEADERCUSTOM #20180713T135208.641 GMT */
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
	"Rule-HTML-Section:PZACTIVITYPARAMARRAYHEADERCUSTOM"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-SECTION",true,"Rule-HTML-Section","Pega-UIEngine","08-03-01","RULE-OBJ-ACTIVITY RULE-HTML-SECTION PZASSEMBLEPREPROCESS #20190207T102426.651 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZACTIVITYPARAMARRAYHEADERCUSTOM","Rule-HTML-Section","EMBED-ACTIVITYSTEPS",false,"","Pega-Desktop","08-01-01","RULE-HTML-SECTION EMBED-ACTIVITYSTEPS PZACTIVITYPARAMARRAYHEADERCUSTOM #20180713T135208.641 GMT","!PZACTIVITYPARAMARRAYHEADERCUSTOM",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-966967022)
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
//	RULE-HTML-SECTION EMBED-ACTIVITYSTEPS PZACTIVITYPARAMARRAYHEADERCUSTOM #20180713T135208.641 GMT:20180713T135208.641 GMT
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
		return "12a99af08a0cf9617ae705a3e7820fcf";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-ActivitySteps";
	}
public String getAspect() {
return "Stream";
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getProperty(aParam1).getStringValue(), aParam2)));
}
private void performStream_1() throws Throwable {
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && when_1("pxRequestor.pyPegaDesignMode", "true")) {
tools.appendString(" Uses XML Signature to make title row ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");
 //Yes this is a hack, there is a good reason though, it had to be done to match layout with the inner params.  Look at RuleFormMainRowDetailsMethodParams for explanation 
tools.appendString(" </th> ");

	ClipboardPage currStepPage = tools.getStepPage().getProperty("pyParamArray").getPageValue(1);
	ClipboardProperty stepsParamUI = currStepPage.getProperty("pyStepsParamUI");	
	String thAppendString = "class=\"cellCont\" BASE_REF=\"\" NAME=\"BASE_REF\"";

	if(stepsParamUI !=null){
		Iterator paramUIIter = stepsParamUI.iterator();
		//This uses the xml signature to make the header cells for the repeating params	
		
		while(paramUIIter.hasNext()){
			ClipboardProperty currNode = (ClipboardProperty)paramUIIter.next();
			ClipboardPage currPage = currNode.getPageValue();
			String 	paramName 	= currPage.getString("pyParametersParamName"),
				paramDesc 	= currPage.getString("pyParametersParamDesc"),
				paramReqStr	= currPage.getString("pyParametersParamReq"),
				paramInOutStr	= currPage.getString("pyParametersParamInOut"),
				paramSize 	= currPage.getString("pyParametersParamSize");		
			boolean	paramReq		= paramReqStr.equals("true"),
				paramInOut	= paramInOutStr.equals("true");
			String 	inOutImageLoc 	=  (paramInOut)? "webwb/zstepvaluein.gif" : "webwb/zstepvalueout.gif";	

			String 	paramSPStr	= currPage.getString("pyParametersParamSmartPrompt"),
				paramSPRClass 	= currPage.getString("pyParametersParamIntelliRule");
					
   			String tdStyle = "font-weight:bold;padding-left:5px;";
   
			if(paramName.equals("Required") || paramName.equals("Continue")){
   					tdStyle += "text-align:right;";
			}else if(paramName.equals("PropertyName"))	{	
   					tdStyle += "width:200px;";
			}else if(paramName.equals("PropertiesName")){		
   					tdStyle += "width:25%;";
			}
			tools.appendString("<td "+"style='"+tdStyle+"'"+thAppendString +">");
			   
			if(paramReq){
				tools.appendString("<img src='images/requiredstar.gif' title='' alt='' />");
			}
			tools.appendString("<text title='"+paramDesc+"'>"+paramName+"</text>");

			/** Add the append icon **/
			StringMap iconInOutStreamKeys = new HashStringMap();
			iconInOutStreamKeys.putString("pxObjClass","Rule-HTML-Section");
			iconInOutStreamKeys.putString("pyClassName","Embed-ActivitySteps");
			iconInOutStreamKeys.putString("pyStreamName","pzParamsInOutIcon");
			tools.putParamValue("InParameter", paramInOut);
			tools.appendStream(iconInOutStreamKeys, tools.getParameterPage());

			tools.appendString("</td>");
		}
	
	}

tools.appendString(" <th ");
out.print( thAppendString );
tools.appendString(" > ");
}
tools.appendString(" ");
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Final");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "Internal");
	oStreamProperties_1.put("pyClassName", "Embed-ActivitySteps");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-SECTION EMBED-ACTIVITYSTEPS PZACTIVITYPARAMARRAYHEADERCUSTOM #20180713T135208.641 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Section");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzActivityParamArrayHeaderCustom");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
private boolean hasNonTemplateMethod_1() {	 return true;}public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
private boolean hasNonTemplateComponent() {	 return true;}

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-SECTION EMBED-ACTIVITYSTEPS PZACTIVITYPARAMARRAYHEADERCUSTOM #20180713T135208.641 GMT", "Embed-ActivitySteps pzActivityParamArrayHeaderCustom", "Pega-Desktop", "08-01-01", "20180713T135208.641 GMT");
}
