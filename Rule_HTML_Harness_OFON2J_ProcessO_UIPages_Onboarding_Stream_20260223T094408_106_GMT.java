package com.pegarules.generated.testgen;

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
import com.pega.pegarules.jsptags.WhenTag;
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
import com.pega.pegarules.priv.runtime.ICellRuntime;
import com.pega.pegarules.priv.runtime.IControlRuntime;
import com.pega.pegarules.priv.runtime.IHarnessRuntime;
import com.pega.pegarules.priv.runtime.ILayoutRuntime;
import com.pega.pegarules.priv.runtime.IPackageRuntime;
import com.pega.pegarules.priv.runtime.ISectionRuntime;
import com.pega.pegarules.priv.runtime.IStaticContentRuntime;
import com.pega.pegarules.priv.runtime.PegaStreamAPI;
import com.pega.pegarules.priv.runtime.jsp.JSPTagHandlerPool;
import com.pega.pegarules.priv.runtime.jsp.StreamBuilderBase;
import com.pega.pegarules.priv.util.JSPResponse;
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
 * Builds JSP stream .
 */
public class Rule_HTML_Harness_OFON2J_ProcessO_UIPages_Onboarding_Stream_20260223T094408_106_GMT extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Harness.Onboarding.OFON2J_ProcessO_UIPages.Stream");
private static Map<String,String[]> oCellRuntimeParamsMap = new HashMap<String,String[]>();
private static Map<String, String> oControlPathsMap = new HashMap<String, String>();
private static Map<String, AssemblyParameters> oAssemblyParamsMap = null;
private static final int pzChecksum = 1499310194;
private static boolean pz_isValidAssembly= true;
/** The current stream builder. */
	IHarnessRuntime pzHarness;
	ISectionRuntime pzSection;
	ILayoutRuntime pzLayout;
	ICellRuntime pzCell;
	IControlRuntime pzControl;

	IPackageRuntime pzPackageRuntime;

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
	public Rule_HTML_Harness_OFON2J_ProcessO_UIPages_Onboarding_Stream_20260223T094408_106_GMT(com.pega.pegarules.priv.PegaAPI aContext) {
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
private static String pxUniqueStreamHash = "1b5af394b79a93129281a1b7ac3c6d03150c434e";
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
/*
 * Begin 
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Harness");
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
/* end  */
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
	"Rule-Obj-Activity:PZASSEMBLEPREPROCESS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-HTML-HARNESS",true,"Rule-HTML-Harness","Pega-UIEngine","08-23-01","RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZASSEMBLEPREPROCESS #20230618T001616.622 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1)
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
//	RULE-OBJ-ACTIVITY RULE-HTML-HARNESS PZASSEMBLEPREPROCESS #20230618T001616.622 GMT:20230618T001616.622 GMT
//	generateWorkAreaLayouts_1(
//	includeSectionBody_1(
//	includeSectionBody_2(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT HASMESSAGES #20180713T131436.731 GMT:20180713T131436.731 GMT
//	RULE-UTILITY-FUNCTION HARNESS GENERATESECTIONPROPERTYPARAMS--(12B0C95B359D6764824177DF4BC335BF #20181206T131216.951 GMT:20181206T131216.951 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDCUSTOMCSS2 #20230618T001619.119 GMT:20230618T001619.119 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDHTMLHEADER #20180713T133338.084 GMT:20180713T133338.084 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZADDHTMLMETA #20180713T133338.092 GMT:20180713T133338.092 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEADVPARAM--(STRINGBUFFER,CLIPBOARDPROPERTY,STRING) #20180713T133339.606 GMT:20180713T133339.606 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDECLAREPARAMS--(STRINGFDC1A05E906C7D1540A87AB36D46644C #20180713T133339.722 GMT:20180713T133339.722 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEDOCSTATETRACK--() #20180713T133339.728 GMT:20180713T133339.728 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEELEMENTMODEL--(STRINGB2D03618C4D6FCE3A07CB882EBEA3D958 #20201222T180835.601 GMT:20201222T180835.601 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODY #20221007T070330.438 GMT:20221010T104158.645 GMT
//	RULE-UTILITY-FUNCTION HARNESS PZINCLUDESECTIONBODYCONTENT--(CL762755102FCAC7F04E931D9162F7533A #20180713T133341.219 GMT:20180713T133341.219 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATEHARNESS--(CLIPBOARDPAGE,BOOLEAN) #20180713T133341.407 GMT:20180713T133341.407 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATESECTIONINCLUDES #20200409T062442.142 GMT:20200409T062442.142 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATETHIRDPARTYPARAMS #20180713T133341.437 GMT:20180713T133341.437 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE VALIDATERULEEXISTENCE #20180713T133341.471 GMT:20180713T133341.471 GMT
//	RULE-UTILITY-FUNCTION STRING EQUALS #20180713T131441.596 GMT:20180713T131441.596 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "31b734d7833a43fa7439aad20759b874";
	}

	public String getDefinitionAppliesToClass() {
		return "OFON2J-ProcessO-UIPages";
	}
public String getAspect() {
return "Stream";
}
private boolean when_2() throws Throwable {
boolean whenResult_1 = pega.invokeWhen("recordEvent", "", "");
return whenResult_1;
}


public void elementModel_1() { 

	try {

 ClipboardPage pg_dec_PyDisplay = tools.findPage("Declare_pyDisplay");

 ClipboardProperty cp_tempPage = pg_dec_PyDisplay.getIfPresent("pyDisplay");

				 ClipboardPage pg_DisplayState = pg_dec_PyDisplay.getProperty("pyDCDisplayState").getPageValue();

  pg_DisplayState.getEntryHandle("pyActiveDocumentType");

 ClipboardPage pg_prevDisplay= null;

 String portalName = tools.findPage("pxThread").getString("pxPortal");

 if(cp_tempPage != null ){

 pg_prevDisplay = cp_tempPage.getPageValue(portalName);

}

 ClipboardPage pg_displayTemp = tools.findPage("pyDisplayTemp", true);

if(pg_displayTemp != null) {

				 pg_DisplayState.putString("pyActiveDocumentType","HOME");

	ClipboardPage pg_display = tools.createPage("Pega-UI-RunTime-Display", "pyDisplay");

	 pg_display.getProperty("pyPortalName").setValue(portalName);

		if(pg_displayTemp.getProperty("pyElements").size() > 0) {

			ClipboardProperty cp_SectionTabs = pg_displayTemp.getProperty("pyElements");

			Iterator iter_elements = cp_SectionTabs.iterator();

			while(iter_elements.hasNext()){

				ClipboardPage pg_elem = ((ClipboardProperty)iter_elements.next()).getPageValue();

				Iterator iter_elements2 = null;

				iter_elements2 = pg_elem.getProperty("pyUIElements").iterator();

				while(iter_elements2.hasNext()){

					ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

					 if(!"".equalsIgnoreCase(pg_innerElem.getStringIfPresent("pyMode"))){pg_display.putString("pyMode",pg_innerElem.getString("pyMode"));

					 pg_innerElem.getProperty("pyMode").removeFromClipboard(); 

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 dataModelChangeTracker.trackValueChanges(tools.findPage("Declare_pyDisplay").getProperty("pyDisplay").getPageValue(portalName).getProperty("pyCandidateIndices"),-1);

					}}catch(Exception e){} }

					 else{

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 }}catch(Exception e){} 

					 }

					pg_display.movePage("pyUIElements(<APPEND>)", pg_innerElem);

				}

				iter_elements2 = pg_elem.getProperty("pyUIActive").iterator(); 

				while(iter_elements2.hasNext()){ 

					ClipboardPage pg_innerElem = ((ClipboardProperty)iter_elements2.next()).getPageValue();

						if(!("").equalsIgnoreCase(pg_innerElem.getString("pyMode"))){pg_innerElem.getProperty("pyMode").removeFromClipboard();} 

					pg_display.movePage("pyUIActive(<APPEND>)", pg_innerElem);

				}

			}

		}

		if(pg_display.getProperty("pyUIElements").size() == 0){

			pg_display.removeFromClipboard();

		} else {

			pg_display.put(pg_displayTemp.getProperty("pyContainerList"));

		}

		tools.findPage("pyDisplayTemp").removeFromClipboard();

	 if(pg_prevDisplay !=null){

 boolean bIsDCSPA =  pg_prevDisplay.getBoolean("pyIsDCSPA");

 boolean isActivateDocCase =  "activate".equals(tools.getRootParamValue("api"));

 boolean isHistoryStateNull = "true".equals(tools.getRootParamValue("isHistoryStateNull"));
if("NoHeader".equalsIgnoreCase(pg_display.getString("pyMode"))){

	 pg_display.putString("pyCandidateIndices",pg_prevDisplay.getString("pyCandidateIndices"));

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 dataModelChangeTracker.trackValueChanges(tools.findPage("Declare_pyDisplay").getProperty("pyDisplay").getPageValue(portalName).getProperty("pyCandidateIndices"),-1);

					}}catch(Exception e){} }

	 pg_display.getProperty("pyHANotify").setValue("false");

	 ClipboardProperty cp_DisplayLayouts = pg_prevDisplay.getIfPresent("pyLayout");

	 int prevElementsCnt = pg_prevDisplay.getProperty("pyUIElements").size();

	 int elementsCnt =pg_displayTemp.getIfPresent("pyElements").size();

 String activeCtdID="";

 boolean  isStaticEleActive=false;

 ClipboardProperty pg_prevUIActive = pg_prevDisplay.getProperty("pyUIActive");

 if(pg_prevUIActive!=null && pg_prevUIActive.size()>0){

 activeCtdID = pg_prevUIActive.getPageValue(1).getString("pyElementName");

 isStaticEleActive = pg_prevUIActive.getPageValue(1).getBoolean("pyIsStatic");

 if(bIsDCSPA && (!isActivateDocCase && !isHistoryStateNull)){

	 pg_display.getProperty("pyUIActive").setValue(pg_prevUIActive);

 }

	 } 

 if(cp_DisplayLayouts == null){

 Iterator iter_prevDisplay = pg_prevDisplay.getProperty("pyUIElements").iterator();

 elementsCnt =0;

 while(iter_prevDisplay.hasNext()){

 elementsCnt++; 
 ClipboardPage pg_prevUIElement = ((ClipboardProperty)iter_prevDisplay.next()).getPageValue();

 if(bIsDCSPA){

 ClipboardPage pg_currentElement = pg_display.getProperty("pyUIElements").getPageValue(1);

	 if(!isActivateDocCase && !isHistoryStateNull){

	 pg_currentElement.replace(pg_prevUIElement);

	 }

	 continue;

}

 if(pg_prevUIElement.getString("pyIsStatic").equals("false")){

						 pg_prevUIElement.putString("pyStatus","Deferred");
int isize = 0; ClipboardProperty cp_currElems = pg_display.getIfPresent("pyUIElements");
if(cp_currElems != null){
 isize = cp_currElems.size();
}
 isize++; pg_prevUIElement.putString("pyIndex", isize+"");

 if( pg_prevUIElement != null && pg_prevUIElement.getBoolean("pyIsActive")){ 

  pg_display.getProperty("pyUIActive").getPropertyValue(1).setValue(pg_prevUIElement);

 }

 pg_display.movePage("pyUIElements(<APPEND>)", pg_prevUIElement); 

	}else {
ClipboardProperty staticUIElements = pg_display.getIfPresent("pyUIElements");
if(staticUIElements != null && staticUIElements.size() > 0){
String strCtdId = pg_prevUIElement.getString("pyElementName");

 Iterator iter_staticEles = staticUIElements.iterator();
 while(iter_staticEles.hasNext()){
 ClipboardPage pg_staticEle = ((ClipboardProperty)iter_staticEles.next()).getPageValue();
 String stroldEleCntdID = pg_staticEle.getString("pyElementName");
 String strIsStatic = pg_staticEle.getString("pyIsStatic");
 if("true".equalsIgnoreCase(strIsStatic)){
 if(!"".equals(stroldEleCntdID) && stroldEleCntdID !=null && stroldEleCntdID.equalsIgnoreCase(strCtdId)){
 pg_prevUIElement.putString("pyIndex",pg_staticEle.getString("pyIndex"));
 pg_staticEle.replace(pg_prevUIElement);break;
}
}else{break;}
}
}

	if(isStaticEleActive){
ClipboardProperty UIElements = pg_display.getIfPresent("pyUIElements");
if(UIElements != null && UIElements.size() > 0){

 Iterator iter_Eles = UIElements.iterator();
 while(iter_Eles.hasNext()){
 ClipboardPage pg_staticEle = ((ClipboardProperty)iter_Eles.next()).getPageValue();
 String strEleCntdID = pg_staticEle.getString("pyElementName");
 String strIsStatic = pg_staticEle.getString("pyIsStatic");
 if("true".equalsIgnoreCase(strIsStatic) && strEleCntdID.equalsIgnoreCase(activeCtdID)){
 	pg_staticEle.putString("pyIsActive","true"); 

  pg_display.getProperty("pyUIActive").getPropertyValue(1).setValue(pg_staticEle);
}else{
 	pg_staticEle.putString("pyIsActive","false");

	 }}}

	 }

	}}}

	   }

	 ClipboardProperty dcp_Display = pg_dec_PyDisplay.getProperty("pyDisplay");

	 ClipboardPage tpyDip=dcp_Display.getPageValue(portalName);

	 String strMode = tpyDip.getString("pyMode");

	 if("NoFrame".equals(strMode) || "NoIFrame".equals(strMode)){

	 tpyDip.putString("pyMode","NoIFrame");

	 }else{

	 ClipboardProperty pyMicroDCDisplay = tpyDip.getIfPresent("pyMicroDCDisplay");

	 if(pyMicroDCDisplay != null){ 

	 pg_display.getProperty("pyMicroDCDisplay").setValue(pyMicroDCDisplay);

	 }

	 tpyDip.clear(); ClipboardProperty cp_pyLayouts = tpyDip.getProperty("pyLayout");

	 cp_pyLayouts.removeFromClipboard();

	 }

	 String pyIsDCSPA = tools.getParamValue("pyIsDCSPA");

	 if(pyIsDCSPA != null && !("").equalsIgnoreCase(pyIsDCSPA)){

		 tpyDip.putString("pyIsDCSPA",pyIsDCSPA);

		 if("true".equals(tools.getParamValue("pyIsMultiSession")) || "true".equals(tools.getParamValue("bMultiPortalSession"))){

		 tpyDip.putString("bIsMultiSession","true");

		 tpyDip.putString("pxThreadName", tools.findPage("pxThread").getString("pxThreadName"));

		 }

	 }

	  tpyDip.putAll(pg_display,ClipboardPage.PUTALL_KEEPNEW);

 pg_display.removeFromClipboard();}

					 try{ if(tools.getParamValue("AJAXTrackID") != null && !tools.getParamValue("AJAXTrackID").equals("")){

					 com.pega.pegarules.priv.runtime.IStreamChangeTracker dataModelChangeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));

					 dataModelChangeTracker.trackValueChanges(tools.findPage("Declare_pyDisplay").getProperty("pyDCDisplayState").getPageValue().getProperty("pyActiveDocumentType"),-1);

					}}catch(Exception e){} 

	} catch(Exception e){

		
}

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
	String expressionId = null;
	com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
	if(!StringUtils.isBlank(expressionId)) {
		secInfo.put("pyExpressionId", expressionId);
	}
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_4","OnboardingContent", secInfo);
}


public void includeSectionBody_2() { 
	buildWhiteList_1();
	if (pzAuto.getUIComponentRuntime().isTemplatingUIEnabled()) {
	buildSection_2();
	return;
	}
	String strSectionPageProp = "";
	
	
	String includedSectionName = "";includedSectionName = "OnboardingContent";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
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
	pzAuto.getUIComponentRuntime().getRuntimeContextTree().loadSection(pxUniqueStreamHash+"_3","OnboardingHeader", secInfo);
}
public void buildWhiteList_1() {
Map<String, String> config;
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
config.put("pyActivity", "");
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
	
	
	String includedSectionName = "";includedSectionName = "OnboardingHeader";if(!"".equals(includedSectionName.trim())){tools.appendString(pzAuto.getSection().getSectionStream(includedSectionName,"",false,""));
	}else{oLog.warn("Section name must be provided.");}}
public IUIComponentMetadata 
generateWorkAreaMetaData_1() {
	IUIComponentMetadata pg_workarea = pzAuto.getUIComponentRuntime().createMetadata();
	pg_workarea.put("isHeaderFixed","true");
	pg_workarea.put("isFooterFixed","false");
	pg_workarea.put("wrapperDivClass","workarea-view-scroll-wrapper");
	pg_workarea.put("startWrapperDiv","false");
	pg_workarea.put("endWrapperDiv","true");
	return pg_workarea;
}
public IUIComponentMetadata 
generateWorkAreaHeaderMetaData_1() {
	IUIComponentMetadata pg_workarea = pzAuto.getUIComponentRuntime().createMetadata();
	pg_workarea.put("finalHeaderClass","workarea-view-header workarea-view-header-fixed");
	pg_workarea.put("topInspectorData",pzHarness.getInspectorDataForPanel("TOP"));
	pg_workarea.put("ariaLabelTopPanel",tools.getLocalizedTextForString(".pyCaption", "Top Panel"));
	return pg_workarea;
}
public IUIComponentMetadata 
generateWorkAreaLeftMetaData_1() {
	IUIComponentMetadata pg_workarea = pzAuto.getUIComponentRuntime().createMetadata();
	pg_workarea.put("leftInspectorData",pzHarness.getInspectorDataForPanel("LEFT"));
	pg_workarea.put("ariaLabelLeftPanel",tools.getLocalizedTextForString(".pyCaption", "Left Panel"));
	pg_workarea.put("wrapperDivClass","");
	pg_workarea.put("isResizable","false");
	pg_workarea.put("isRTL",Boolean.toString(pzAuto.isOrientationRTL()));
	pg_workarea.put("startWrapperDiv","true");
	pg_workarea.put("endWrapperDiv","false");
	return pg_workarea;
}
public IUIComponentMetadata 
generateWorkAreaContentMetaData_1() {
	IUIComponentMetadata pg_workarea = pzAuto.getUIComponentRuntime().createMetadata();
	pg_workarea.put("scrollClass","");
	pg_workarea.put("centerInspectorData",pzHarness.getInspectorDataForPanel("CENTER"));
	pg_workarea.put("ariaLabelCenterPanel",tools.getLocalizedTextForString(".pyCaption", "Center Panel"));
	pg_workarea.put("startWrapperDiv","true");
	pg_workarea.put("endWrapperDiv","false");
	return pg_workarea;
}
public IUIComponentMetadata 
generateWorkAreaRightMetaData_1() {
	IUIComponentMetadata pg_workarea = pzAuto.getUIComponentRuntime().createMetadata();
	pg_workarea.put("wrapperDivClass","");
	pg_workarea.put("rightInspectorData",pzHarness.getInspectorDataForPanel("RIGTH"));
	pg_workarea.put("ariaLabelRightPanel",tools.getLocalizedTextForString(".pyCaption", "Right Panel"));
	pg_workarea.put("isResizable","false");
	pg_workarea.put("isRTL",Boolean.toString(pzAuto.isOrientationRTL()));
	pg_workarea.put("startWrapperDiv","false");
	pg_workarea.put("endWrapperDiv","true");
	return pg_workarea;
}
public IUIComponentMetadata 
generateWorkAreaFooterMetaData_1() {
	IUIComponentMetadata pg_workarea = pzAuto.getUIComponentRuntime().createMetadata();
	pg_workarea.put("finalFooterClass","");
	pg_workarea.put("bottomInspectorData",pzHarness.getInspectorDataForPanel("BOTTOM"));
	pg_workarea.put("ariaLabelBottomPanel",tools.getLocalizedTextForString(".pyCaption", "Bottom Panel"));
	return pg_workarea;
}
public void generateWorkAreaLayouts_1(){
	IUIComponentMetadata workAreaMetadata = generateWorkAreaMetaData_1();
	IUIComponentMetadata workAreaHeaderMetadata = generateWorkAreaHeaderMetaData_1();
	IUIComponentMetadata workAreaLeftMetadata = generateWorkAreaLeftMetaData_1();
	IUIComponentMetadata workAreaContentMetadata = generateWorkAreaContentMetaData_1();
	IUIComponentMetadata workAreaRightMetadata = generateWorkAreaRightMetaData_1();
	IUIComponentMetadata workAreaFooterMetadata = generateWorkAreaFooterMetaData_1();
	if(workAreaMetadata!= null){
	com.pega.pegarules.priv.runtime.IHarnessWorkAreaUIBuilder uiBuilder = pzHarness.getWorkAreaSLBuilder();
	uiBuilder.begin(workAreaMetadata);
	tools.putParamValue("pySectionIncludeHeight", "Auto");
	uiBuilder.beginHeader(workAreaHeaderMetadata);
	tools.putParamValue("bIsScreenLayout", "true");
try {
includeSectionBody_1();
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	uiBuilder.endHeader(workAreaHeaderMetadata);
	tools.putParamValue("pySectionIncludeHeight", "Auto");
	uiBuilder.beginCenter(workAreaContentMetadata);
	tools.putParamValue("bIsScreenLayout", "true");
try {
includeSectionBody_2();
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
	uiBuilder.endCenter(workAreaContentMetadata);
	uiBuilder.end(workAreaMetadata);
	}
}
public void processWorkAreaLayouts_1() {
	generateWorkAreaLayouts_1();
}
public void createFormElement_1() {
	IUIComponentMetadata pg_form = pzAuto.getUIComponentRuntime().createMetadata();
	IUIComponentMetadata hcMetdata = pzAuto.getUIComponentRuntime().createMetadata();
	pg_form.put("target",StringUtils.crossScriptingFilter(tools.getRootParamValue("target")));
	pg_form.put("pzHarnessID",tools.getParamValue("pzHarnessID"));
	pg_form.put("pzCTkn",tools.getCSRFToken(tools.getThread()));
	pg_form.put("pzBFP",((PegaAPI)tools).getBrowserFingerprint());
	if("".equals(tools.getParamValue("RenderSingle"))){
		pg_form.put("streamName","Onboarding");
		pg_form.put("RO",StringUtils.crossScriptingFilter(tools.getParamValue("ReadOnly")));
		pg_form.put("folderKey",StringUtils.crossScriptingFilter(tools.getParamValue("FolderKey")));
		pg_form.put("inputEnabled",String.valueOf(tools.hasInputEnabled()));
		pg_form.put("formPost",tools.getPrimaryPage().getProperty("pyFormPost").getEntryHandle());
		StringMap keys =  new HashStringMap();
		keys.putString("pxObjClass", "Rule-Obj-When");
		keys.putString("pyClassName", tools.getStepPage().getClassName());
		keys.putString("pyBlockName", "pyGeolocationTrackingIsEnabled");
		boolean isGeoTrackingEnabled = tools.evaluateWhen(keys);
		String strIsMDC = tools.getRootParamValue("isMDC");
		pg_form.put("isGeoEnabled",isGeoTrackingEnabled);
		if(isGeoTrackingEnabled) {
			pg_form.put("lat",tools.getThread().getRequestorPage().getProperty("pyLatitude").getEntryHandle());
			pg_form.put("latValue",tools.getThread().getRequestorPage().getProperty("pyLatitude").getStringValue());
			pg_form.put("long",tools.getThread().getRequestorPage().getProperty("pyLongitude").getEntryHandle());
			pg_form.put("longValue",tools.getThread().getRequestorPage().getProperty("pyLongitude").getStringValue());
		}
		pg_form.put("compData",tools.getPrimaryPage().getProperty("pySpecialtyComponentData").getEntryHandle());
		pg_form.put("fromActionURL",pzHarness.getBuilder().getFormActionURL("formaction"));
		pg_form.put("isMDC","true".equals(strIsMDC)?true:false);
		hcMetdata.put("WAContDivStyle"," harness-content-workarea-view workarea-flex");
		pzHarness.getBuilder().beginForm(pg_form);
		pzHarness.getBuilder().beginHarnessContent(hcMetdata);
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_2");
		}
		if(!"ACTION".equals(tools.getParamValue("HarnessMode"))){
try {
pzAuto.emitIncludeStreamReference("FormErrorMarker", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		}
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
	}
	processWorkAreaLayouts_1();
	if("".equals(tools.getParamValue("RenderSingle"))){
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_5");
		}
		if(!"ACTION".equals(tools.getParamValue("HarnessMode"))){
try {
pzAuto.emitIncludeStreamReference("FormErrorMarker", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		}
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
		pzHarness.getBuilder().endHarnessContent(hcMetdata);
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_6");
		}
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
		pzHarness.getBuilder().endForm(pg_form);
	}
}
public void pzAddCustomCSS2_1() {
}
private boolean when_1(String aTest, String aName, boolean aJava) throws Throwable {
	return (WhenTag.evaluateWhen(pega, aTest, aName, aJava));
}
public void updateClipboardModel_1() {
	StringMap parameters = new HashStringMap();
	parameters.putString("pyHarnessNameForUpdate","Onboarding");
	pzHarness.updateClipboardModels(parameters);
}
public void setHarnessConfigurations_1() {
	 tools.putSaveValue("bClientValidation", "true");
	tools.putParamValue("InHarness", "true");
	if(pzAuto.isAccessible()) tools.putSaveValue("bAccessible", "true");
	tools.putParamValue("FormError", "");
	tools.putParamValue("FieldError", "");
	tools.putParamValue("AlwaysShowFormLevelErrors", "false");
	tools.putParamValue("KeepFixedVisible", "true"); 
	tools.putParamValue("pyCustomError", "");
	tools.putParamValue("IgnoreDirty", "false");
	tools.putParamValue("enableTemplate", "default");
	pzHarness.getBuilder().setTarget();
	tools.putParamValue("bExcludeLegacyJS", "true");
}
public void pzAddHTMLHeader_1() {
try {
tools.appendString(" ");


	 boolean bDeveloperThread  =tools.findPage("pxThread").getString("pxThreadName").equalsIgnoreCase("Developer");
	 ClipboardPage appPage = tools.findPage("Application",true);
	 if(appPage!=null){

	 if(appPage.getStringIfPresent("pyUseWebstandardsUI")!=null){

	 if(appPage.getStringIfPresent("pyUseWebstandardsUI").equalsIgnoreCase("true") && !bDeveloperThread){
		 if(pega_uiengine_harness.pzDoctypeSupportedForBrowser(tools)) {
			 tools.appendString("<!DOCTYPE html>");
			tools.putParamValue("inStandardsMode", true);
		}
	}
}
}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void pzAddHTMLMeta_1() {
try {
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("pyMetaTags", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
/**
 * OnlyOnce condition: pzPortalFavIcon
 * @throws Throwable if there is a problem with a runtime tag handler
 */
private void onlyOnce_1() throws Throwable {
if (!pega.isResearchMode() && !pega.checkOnlyOnce("pzPortalFavIcon")) {
pzAuto.emitIncludeStreamReference("pzPortalIcon", null, null, null, null);
}
}
public void includeScripts_1() {
	String bRemoteCase = pzHarness.getBuilder().getParameterFromRootStackFrame("isRemoteCase");
	if(("").equals(bRemoteCase) || bRemoteCase == null) {
IStaticContentRuntime pzStatic__1 = pzAuto.getStaticBlock("script");
	}
}
public void includeStyles_1() {
	pzAddCustomCSS2_1();
}
public void pzGenerateDocStatetrack_1() {
try {
if("yes".equals(tools.getParamValue("topHarness"))){com.pega.pegarules.pub.context.PRAuthorization auth = tools.getAuthorizationHandle();com.pega.pegarules.pub.util.PRSystemSettings syssettings = tools.getSystemSettings();boolean hasPriv = auth.havePrivilege ( tools.getThread(), "pxClientActivityTracking",  "@baseclass", null);String strHasSut = syssettings.getDynamic("Pega-Rules", "pzPegaSUT");if (hasPriv || "true".equals(strHasSut)) { 
tools.appendString("<div class='document-statetracker' data-state-busy-status='busy'></div>");
}} 
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void createPegaHarnessDIV_1() {
	IUIComponentMetadata pg_harnesscnt = pzAuto.getUIComponentRuntime().createMetadata();
	if("".equals(tools.getParamValue("RenderSingle"))){
		if(pzAuto.isInspectMode()){
			pg_harnesscnt.put("liveUI",pzHarness.getInspectorData());
		}
		pg_harnesscnt.put("streamName","Onboarding");
		pg_harnesscnt.put("className",pzAuto.getClassName());
		pg_harnesscnt.put("insHandle",pzAuto.getHandle());
		pg_harnesscnt.put("primaryPageClass",tools.getStepPage().getClassName());
		if("true".equals(pzHarness.getBuilder().getParameterFromRootStackFrame("isRemoteCase"))){
			pg_harnesscnt.put("thread",tools.getThread().getName());
		}if(pzAuto.getUIComponentRuntime().isTemplateRendering()){
			pg_harnesscnt.put("primaryPage",tools.getPrimaryPage() == null ? "" : tools.getPrimaryPage().getName());
		} else {
			pg_harnesscnt.put("JSRCompliant",false);
		}
		pg_harnesscnt.put("CSSClass","workarea-view-harness ");
		pzHarness.getBuilder().beginHarnessDIV(pg_harnesscnt);
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplateComponent(pxUniqueStreamHash+"_1");
		}
		tools.appendString("<div id='HEADER_BUTTON_HTML' style='display:none'> </div>");
		if(pzHarness.getBuilder().isTemplatingEnabled()){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
		}
		tools.putParamValue("headerButtonsAdded","false");
	}
	createFormElement_1();
	if("".equals(tools.getParamValue("RenderSingle"))){
		pzHarness.getBuilder().endHarnessDIV(pg_harnesscnt);
	}
}
public void includePortalPanel_1(String position) {
	if(pzHarness.getBuilder().hasLayout(position)){
		ClipboardProperty cp_Layout = pzHarness.getBuilder().getLayout(position);
		pzHarness.getBuilder().createPortalChrome(cp_Layout,position,true, pzHarness.getInspectorDataForPanel(position));
		if(cp_Layout != null && cp_Layout.getPageValue().getBoolean("pyHasDynamicContainer")){
			createPegaHarnessDIV_1();
		}else{
	pzHarness.getBuilder().includePanelSection(cp_Layout);
}
pzHarness.getBuilder().createPortalChrome(cp_Layout,position,false, null);
}
}
public void includePegaHarnessContent_1() {
	if(pzHarness.getBuilder().isSDMSelfNavigation()){
		pzHarness.getBuilder().createHTMLElementForDataModel();
		ClipboardProperty pyLayouts = pzHarness.getBuilder().getPortalLayout();
		if(pyLayouts != null){
			pzHarness.getBuilder().createPortalChrome(null,"MAIN",true, pzHarness.getInspectorData());
			includePortalPanel_1("TOP");
			includePortalPanel_1("LEFT");
			includePortalPanel_1("CENTER");
			includePortalPanel_1("RIGHT");
			includePortalPanel_1("BOTTOM");
			pzHarness.getBuilder().createPortalChrome(null,"MAIN",false, null);
		}else{
			createPegaHarnessDIV_1();
		}
	}else{
		createPegaHarnessDIV_1();
	}
}
public void pzGenerateElementModel_1() {
try {
elementModel_1();
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
}
public void buildHarnessMarkup_1() {
	if(!pzHarness.getBuilder().canProcessStream()){
		return;
	}
	pzHarness.getBuilder().setTools();
	pzHarness.getBuilder().setAutoStream();
	if("true".equals(tools.findPage("pxRequestor").getString("pxIsUnsupportedBrowser"))) {
try {
pzAuto.emitIncludeStreamReference("pyUnsupportedBrowserLoginMessage", null, null, "Rule-HTML-Fragment", null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
		return;
	}
	String hID = pzAuto.createActionRequestRegistrar();
	tools.putParamValue("pzHarnessID",hID);
	pzHarness.resetQueryStringRegistration();
	pzHarness.getBuilder().setMashupProperty();
	pzHarness.setAjaxContainerProperties();
	pzHarness.getBuilder().initHarnessTracker();
	updateClipboardModel_1();
	setHarnessConfigurations_1();
	boolean pxIsMobileClient = pega.getUIEngine().getWhenEvaluator().evaluate("pxIsMobileClient");
		boolean isOfflineMobileClient = pzAuto.isOffline() && pxIsMobileClient;
			boolean isPMCScriptInclusion = pzAuto.isOffline() && pxIsMobileClient && !"true".equals(tools.getParamValue("isForPackagingTempWorkPage"));
			if(isOfflineMobileClient) {
			pzAuto.enableCacheManifest();
			}
			if("".equals(tools.getParamValue("RenderSingle"))){
				if("true".equals(tools.getParamValue("EnableDirectStreaming"))){
					pega.enableDirectStreaming();
				}
				if (!pzAuto.hasStaticContentJSOptimization()) {
					pzAuto.enableDeferredStaticContent();
				} else {
					oLog.debug("    JS Preflight Optimization is on: not calling pzAuto.enableDeferredStaticContent()");
				}
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion){
					pzAddHTMLHeader_1();
					tools.appendString("<html lang=\"");
					tools.appendString(tools.findPage("pxRequestor").getString("pxReqLocale").replace("_", "-"));
					tools.appendString("\"class=\"");
					tools.appendString(pzHarness.getBuilder().getClassStringForHeader());
					tools.appendString("\"");
					if(pzAuto.isOrientationRTL()){
					tools.appendString(" dir=\"rtl\"");
					}tools.appendString("><head>");
					pzAddHTMLMeta_1();
					tools.appendString("<title>");
					tools.appendString(pzHarness.getBuilder().getTitle("Onboarding",true));
					tools.appendString("</title>");
try {
	if (when_1("pxThread.pxLimitedAccess = \'Dev\'", null, false)) {
onlyOnce_1();
	}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				}else{
					tools.putParamValue("inStandardsMode", true);
				}
				boolean UseCompactStylesforPDF = tools.getParamAsBoolean(ImmutablePropertyInfo.MODE_STRING, "UseCompactStylesforPDF"); 
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion) {
					pzHarness.getBuilder().setTemplatingStatus("default");
				}
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion) {
					if(!UseCompactStylesforPDF){ 
try {
pzAuto.emitIncludeStreamReference("WorkFormStandard", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
					}else{ 
try {
pzAuto.emitIncludeStreamReference("pzCompactPDFStyles", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
					} 
				}
				pzAuto.getUIComponentRuntime().enableScriptCapturing();
				includeScripts_1();
				tools.appendString(pzHarness.getBuilder().processPortalHarness());
				pzAuto.getUIComponentRuntime().disableScriptCapturing();
				includeStyles_1();
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion) {
try {
pzAuto.emitIncludeStreamReference("pzCPMTheme", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
try {
pzAuto.emitIncludeStreamReference("pzRuntimeToolsInclude", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				}
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion) {
					tools.appendString(pzHarness.getCanonicalElement());
					tools.appendString("</head>");
					pega.flushToBrowser();
					tools.appendString("<body class=\"harnessBody");
					if(pzHarness.getBuilder().isSDMSelfNavigation()){
					tools.appendString(" screen-layout-body with-fixed-header ");
					}
					tools.appendString("\"");
					if("true".equals(tools.getParamValue("isDcStretch"))){
					tools.appendString(" style=\"overflow-y:hidden;\" ");
					}
					if(pzAuto.isOffline()){
					tools.appendString(" ng-app=\"PegaOffline\" ng-controller=\"OfflineController\"");
					}
					if(pzHarness.getBuilder().isSDMSelfNavigation()){
					tools.appendString(" onload=\"screenLayoutResize\"");
					} else {
					tools.appendString(" onload=\"checkContainersExpanded();\" onresize=\"doHarnessResize()\"");
					}
					tools.appendString(">");
					pzHarness.getBuilder().includeSkipLinks();
				} else {
try {
pzAuto.emitIncludeStreamReference("pzCPMTheme", null, null, null, null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				}
				pzGenerateDocStatetrack_1();
				if(pzHarness.canRecoverPassivatedData()){
					((PegaAPI)tools).getUIEngine().getDCInstance().createDataModel();
					tools.appendString(pzHarness.getHAMessage());
				}
				if(pzHarness.shouldSendAssociateReqData()){
					tools.appendString(pzHarness.getBuilder().getAssociateRequestorDataModel());
				}
				tools.appendString(pzHarness.getFormErrorMarkerDiv());
				tools.appendString("<script>pega.u.d.pyStreamNameForGadget=\"");
				tools.appendString(pzAuto.getRuleName());
				tools.appendString("\";</script>");
				pzAuto.getSection().includeShowMeHarnessInsert();
			}
			includePegaHarnessContent_1();
			pzGenerateElementModel_1();
			tools.putSaveValue("AutoDocInfoInclude", "true");
			pzHarness.getBuilder().includeLazyLoadInfo();
			if("".equals(tools.getParamValue("RenderSingle"))){
try {
boolean whenResult_2 = pega.invokeWhen("recordEvent", "", "");
	if (whenResult_2) {
pzAuto.emitIncludeStreamReference("pyIncludeUWT", null, null, "Rule-HTML-Fragment", null);
	}
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				String iconPath = pega_processengine_workutilities.pxGetWorkIcon(tools);
				if(iconPath != null && !iconPath.equals("")) {
					tools.appendString("<ins id=\"WAIcon\" data-WAIcon=\"");
					tools.appendString(iconPath);
					tools.appendString("\" style=\"display:none;\" ></ins>");
				}
				if(pzAuto.hasStaticContentJSOptimization()){
					if(pzAuto.doOnlyOnce("IncludeOptimizedStaticContentMiddle")){
try {
pzAuto.emitIncludeStreamReference("pzOptimizedMiddleStaticContent", null, null, "Rule-HTML-Fragment", null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
					}
				}
try {
pzAuto.emitIncludeStreamReference("pzOnlyOnceChanges", null, null, "Rule-Obj-HTML", null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				if(!"true".equals(tools.getParamValue("skipTrackerChanges"))){
					pzHarness.getBuilder().includeChangeTrackerContent();
				}
				if(pzAuto.getUIComponentRuntime().getScriptLoader().isTemplateScriptReorderEnabled()){
					pzAuto.getUIComponentRuntime().getScriptLoader().emitTemplateDeferedScripts();
				}
				if(pzAuto.hasStaticContentJSOptimization()){
					if(pzAuto.doOnlyOnce("IncludeOptimizedStaticContentBottom")){
try {
pzAuto.emitIncludeStreamReference("pzOptimizedBottomStaticContent", null, null, "Rule-HTML-Fragment", null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
					}
				}
try {
pzAuto.emitIncludeStreamReference("DocumentInfo", null, null, "Rule-HTML-Fragment", null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
				if(!pzAuto.getUIComponentRuntime().getScriptLoader().isTemplateScriptReorderEnabled()){
					pzAuto.getUIComponentRuntime().getScriptLoader().emitTemplateDeferedScripts();
				}
				if(!(pzAuto.isOffline() && pega.getPackageRuntime().canPackage()) || isPMCScriptInclusion){
try {
pzAuto.emitIncludeStreamReference("pzHarnessBodyScripts", null, null, "Rule-HTML-Fragment", null);
} catch(Throwable t) {
throw new RuntimeException("Problem in JSP fragment", t);
}
					tools.appendString("</body></html>");
					if(isOfflineMobileClient && pega.getPackageRuntime().canPackage()) {
					String portalAndAppDataIncludeUrl = tools.getSaveValue("portalAndAppDataIncludeURL");
						pzAuto.addCacheManifestURL(portalAndAppDataIncludeUrl);
						String manifestURLs = pzAuto.getCacheManifestURLs();
						pega.getPackageRuntime().packageHarnessStaticAssets(manifestURLs);
					}
				}
			}
		}
private void performStream_1() throws Throwable {
buildHarnessMarkup_1();
}
private static final Map oPropDefinitions_1 = null;
private static final Map oStreamProperties_1 = new HashMap();
static {
	oStreamProperties_1.put("pyRuleAvailable", "Yes");
	oStreamProperties_1.put("pyCircumstanceDateProp", "");
	oStreamProperties_1.put("pyCircumstanceVal", "");
	oStreamProperties_1.put("pyMethodStatus", "");
	oStreamProperties_1.put("pyClassName", "OFON2J-ProcessO-UIPages");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Harness");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "ProcessO");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "Onboarding");
	oStreamProperties_1.put("pyRuleSetVersion", "01-01-01");
}
public void cleanForReuse(PegaAPI aContext) {
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
	pzHarness = pzAuto.getHarness();
	pzSection = pzAuto.getSection();
	pzLayout = pzSection.getLayout();
	pzCell = pzLayout.getCell();
	pzControl = pzCell.getControl();
	pzPackageRuntime = pega.getPackageRuntime();
	}
	else {
		pzAuto = null;
	}
	mParentTag = null;
	mStreamResponse = (JSPResponse) tools;
	mHttpServlet = aContext == null ? null : (HttpServlet) aContext.getHttpServlet();
	request = aContext == null ? null : (HttpServletRequest)aContext.getHttpServletRequest();
	mParentStreamProperties = null;
	pz_CurrentRuleKey = null;
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Harness");
}
protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("generateWorkAreaLayouts_1", new String[][] {});
pzExternalMethodMapping.put("includeSectionBody_1", new String[][] {});
pzExternalMethodMapping.put("includeSectionBody_2", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("", "OFON2J-ProcessO-UIPages Onboarding", "ProcessO", "01-01-01", "20180713T135116.739 GMT");
}
