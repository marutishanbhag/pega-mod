package com.pegarules.generated.html_property;
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
import javax.servlet.jsp.tagext.Tag;
/**
 * Builds JSP stream PZOPENRULESETVERSION.
 */
public class ra_stream_pzopenrulesetversion_94c2b48cc0e44004b0a2f73071bf70b1 extends StreamBuilderBase implements StreamBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pzOpenRuleSetVersion.Stream");
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
	public ra_stream_pzopenrulesetversion_94c2b48cc0e44004b0a2f73071bf70b1(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
	}
	 public boolean isAllowedInWeb() {
		 return true;
	}
private static String pxUniqueStreamHash = "3d7391f1cdaa83b365b42a570fa1b3db95a72339";
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
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT
 * Set up context.
 */
final String prevRuleKey_1 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT";final String prevClass_1 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_1 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_1);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_1);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_0)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_3();

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
/* end RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT */
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
	"Rule-HTML-Property:PZOPENRULESETVERSION", 
	"Rule-HTML-Property:PXLPOPENRULE", 
	"Rule-HTML-Property:PZRULEOPENER"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZASSEMBLEPREPROCESS","Rule-Obj-Activity","RULE-",true,"Rule-HTML-Property","Pega-RulesEngine","08-01-01","RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT","!PZASSEMBLEPREPROCESS",true,false,"ABSOLUTE_IS_NOT_PRIMARY",1), 
		new DependentRuleInfo("PZOPENRULESETVERSION","Rule-HTML-Property","",false,"","Pega-Desktop","08-01-01","RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT","PZOPENRULESETVERSION",true,false,"ABSOLUTE_CLASSLESS",849422873), 
		new DependentRuleInfo("PXLPOPENRULE","Rule-HTML-Property","",false,"","Pega-LP","08-01-01","RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT","PXLPOPENRULE",true,false,"ABSOLUTE_CLASSLESS",-1708729460), 
		new DependentRuleInfo("PZRULEOPENER","Rule-HTML-Property","",false,"","Pega-Desktop","08-06-01","RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT","PZRULEOPENER",true,false,"ABSOLUTE_CLASSLESS",1578879712)
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
//	RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT:20180713T135129.748 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT:20180713T142452.409 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT
//	RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT:20201127T105750.471 GMT
//	RULE-OBJ-ACTIVITY RULE- PZASSEMBLEPREPROCESS #20180713T132655.315 GMT:20180713T132655.315 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f793a64b53936fcaa0bcbb329bed20a3";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Stream";
}
private static final String[] showMeParams_1 = {
"", "", "", "", "", "", "04-02", "", "Rule-HTML-Property", "Final", "", "Pega-LP", "08-01-01", "", "pxLPOpenRule", "", "RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT" };
/**
 * Implements a p:r tag.
 */private boolean _jspx_meth_p_r__1(PageContext aPageContext, java.lang.String aN) throws Throwable {
/* p:r */
com.pega.pegarules.jsptags.ReferenceTag _jspx_th_p_r_ = (com.pega.pegarules.jsptags.ReferenceTag) JSPTagHandlerPool.getInstance().get(com.pega.pegarules.jsptags.ReferenceTag.class);
_jspx_th_p_r_.setPageContext(pageContext);
_jspx_th_p_r_.setParent(mParentTag);
_jspx_th_p_r_.setN(aN);
int _jspx_eval_p_r_ = _jspx_th_p_r_.doStartTag();
if (_jspx_th_p_r_.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
	return true;
}
JSPTagHandlerPool.getInstance().reuse(_jspx_th_p_r_);
return false;
}
private boolean when_2(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getParamValue(aParam1), aParam2)));
}
private void performStream_1() throws Throwable {
 	
	if (tools.getParamValue("ellipsis").equals("-1")) 
		tools.putParamValue("ellipsis", "true"); 

tools.appendString(" ");

	String paramCaption = tools.getParamValue("caption");
	//tools.putParamValue("pzButtonVisible", true);
	// Expect 'captionType' to be either 'Property', 'String', 'Image', or 'None'
	String paramCaptionType = tools.getParamValue("captionType");
	if(!(paramCaptionType.equalsIgnoreCase("Property") || paramCaptionType.equalsIgnoreCase("String") || paramCaptionType.equalsIgnoreCase("Image")))
		paramCaptionType = "";
	String displayString = "";
	String toolTipString = tools.getParamValue("captionTooltip").trim();
	if(toolTipString != null && toolTipString != "" && toolTipString.startsWith(".")){
				toolTipString = tools.getProperty(toolTipString).getStringValue();
	}
	if (paramCaptionType.equalsIgnoreCase("String")) {
		  if(!paramCaption.contains("<script>")) displayString = paramCaption;
	                      else displayString =  StringUtils.crossScriptingFilter(paramCaption);
		 } else if (paramCaptionType.equalsIgnoreCase("Property")) {			
			if(paramCaption != null && paramCaption != ""){
				displayString = tools.getProperty(paramCaption).getStringValue();
			}	
		} else if (paramCaptionType.equalsIgnoreCase("Image")) {
		if(paramCaption.equals("")) {
			displayString = "<img style= 'vertical-align: middle;' src='webwb/pzRuleOpenerButton.png' />";
		} else {
			displayString = "<img style= 'vertical-align: middle;' src='" + StringUtils.crossScriptingFilter(paramCaption) + "' />";
		}
	} else if(paramCaptionType.equals("") && paramCaption.equals("")){
		displayString = tools.getActiveValue();
		displayString = StringUtils.crossScriptingFilter(displayString);
	}
	String paramCaptionStyle = tools.getParamValue("captionStyle");
	String paramNoValueText = StringUtils.crossScriptingFilter(tools.getParamValue("noValueText"));

	boolean useNoValueText = false;
	useNoValueText = (displayString.equals("")) && (paramNoValueText != null) && (!paramNoValueText.equals(""));
	tools.putParamValue("pzHideButton", displayString.equals(""));


tools.appendString(" ");
	boolean foundChoice_4 = false;
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || ((tools.useModeInput())))) {
tools.appendString(" ");

			// Default to the HTML Property 'Default'
			
			if(tools.getParamValue("inputModeHtmlProperty").equals(""))
				tools.putParamValue("inputModeHtmlProperty", "Default");

			// Prepare the parameters for the custom input property
			// They should be in the format a=b,c=d,e=f where a, c and e are 
			// keys and b, d and f are their associated values.
			
			String arrParamPairs[] = null;
			try {
				String sParams = tools.getParamValue("inputModeParams");
				if(!sParams.equals("")) {
					// Save the array of 'key=value' pairs.
					arrParamPairs = sParams.split(",");
					
					// Loop through the 'key=value' pairs.
					for(int i = 0; i < arrParamPairs.length; i++) {
						// Get the key and value
						String arrKeyValue[] = arrParamPairs[i].split("=");
						try {
							// Add the param to the parampage
							tools.putParamValue(arrKeyValue[0], arrKeyValue[1]);
						}
						catch (Exception ex) {}
					}
				}
			}
			catch (Exception ex) {
				//TODO: Error Message
				tools.appendString("<script>alert('There was a problem using the specified parameters.');</script>");
			}
		
tools.appendString(" ");
pzAuto.emitIncludeStreamReference("param.inputModeHtmlProperty", null, null, "Rule-Html-Property", null);
tools.appendString(" ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4 && (pega.isPreviewMode() || useNoValueText)) {
tools.appendString(" <div ");
 
				String sNoValueStyle = StringUtils.crossScriptingFilter(tools.getParamValue("noValueStyle"));
				if(sNoValueStyle.indexOf(":") == -1)
					tools.appendString(" class=\""+sNoValueStyle+"\" style=\"display:inline;\" ");
				else
					tools.appendString(" style=\""+sNoValueStyle+";display:inline;\" ");
			
tools.appendString(" title=\"");
out.print(tools.getLocalizedTextForString("pxRequestor.pyCaption", "\t[@baseclass.pyCaption]" + StringUtils.crossScriptingFilter(tools.getParamValue("noValueTooltip"))) );
tools.appendString("\" > ");
out.print(paramNoValueText);
tools.appendString(" </div> ");

foundChoice_4 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_4) {
tools.appendString(" ");

			if(displayString==null || displayString.equals("") || displayString.equals(" ")) 
				displayString = "&nbsp;";
		
tools.appendString(" ");
	if (when_2("ellipsis", "true")) {
tools.appendString(" <table style=\"table-layout:fixed;width:100%;\"><tr><td class=\"ellipsis\" style=\"background-color:transparent;border:none\"> ");
	}
tools.appendString(" ");
	boolean foundChoice_5 = false;
tools.appendString(" ");
tools.appendString(" ");
if (!foundChoice_5 && (pega.isPreviewMode() || tools.getParamValue("showLabelWhenMissingKeys").equals("-1") && tools.getParamValue("openInsKeyProperty").equals("") && tools.getParamValue("openUrl").equals("") && (tools.getParamValue("openObjClass").equals("") || (tools.getParamValue("openRuleName").equals("") && tools.getParamValue("openKeys").equals(""))))) {
tools.appendString(" ");

/*
 * reference tag
 * Cannot inline because: cannot classify name "$this-value"
 */
if (_jspx_meth_p_r__1(pageContext, "$this-value")) {
	return;
}
tools.appendString(" ");

foundChoice_5 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_5) {
tools.appendString(" <a href=\"#\" onclick=\" ");

							ClipboardPage cpActivePage = tools.getActive().getParentPage();
							String sErrorMessage = "";
							boolean bOpenerAdded = false;
							boolean hasException = false;
							
							String sOpenInsKeyProperty = tools.getParamValue("openInsKeyProperty");
							String sOpenObjClass = tools.getParamValue("openObjClass");
							String sOpenUrl = tools.getParamValue("openUrl");
							// Check for the pzInsKey property.  If the param exists, get the specified property.

							if(!sOpenInsKeyProperty.equals("")) {
								try {
									if(sOpenInsKeyProperty.indexOf(" ") == -1)
										sOpenInsKeyProperty = cpActivePage.getString(sOpenInsKeyProperty);
										
									if(!sOpenInsKeyProperty.equals("")) {
										tools.appendString("openRule('"+StringUtils.crossScriptingFilter(sOpenInsKeyProperty)+"',true, false);return false;");
										bOpenerAdded = true;
									} else {
										sErrorMessage = "Unable to open by InsKey: ''";
									}
								} catch (Exception ex) { 	
									hasException = true;
									sErrorMessage = "Attempting to open by InsKey '"+sOpenInsKeyProperty+"':" + ex.toString();
								}
							} else if(!sOpenObjClass.equals("")) {
								try {
									if(sOpenObjClass.indexOf(".") != -1)
										sOpenObjClass = cpActivePage.getString(sOpenObjClass);
									
									String sOpenKeys = tools.getParamValue("openKeys");
									if(!sOpenKeys.equals("")){
										String arrOpenKeys[] = sOpenKeys.split(",");
										String sNewRuleKeys = "";
										
										for(int i=0; i<arrOpenKeys.length; i++){	// For each key specified
											String sKey = "", sValue = "";				// Set up params
											if(arrOpenKeys[i].indexOf("=") != -1) {		// If it is a key=value pair
												String arrPair[] = arrOpenKeys[i].split("=");
												sKey = arrPair[0]; sValue = arrPair[1];	// Get the key and value;
											} else {		// Otherwise, use the param as the key and value
												sKey = sValue = arrOpenKeys[i];
											}
											if(sValue.equals("$this-value")) {
												sValue = tools.getActive().getStringValue();
											} else if(sValue.indexOf(".") == 0) {
												sValue = cpActivePage.getString(sValue);
											} else if(sValue.indexOf(".") > 0) {
												ClipboardProperty cpValue = tools.getIfPresent(sValue);
												if(cpValue != null) sValue = cpValue.toString();
												else sValue = "";
											}
											if(sKey.indexOf(".") != -1)
												sKey = pega_rules_string.whatComesAfterLast(sKey, '.');
											sNewRuleKeys += "&" + sKey + "=" + sValue;
										}
										tools.appendString("openRuleByKeys('"+StringUtils.crossScriptingFilter(sOpenObjClass)+"','"+StringUtils.crossScriptingFilter(sNewRuleKeys)+"');return false;");
										bOpenerAdded = true;

									} else {
										String sOpenRuleName= tools.getParamValue("openRuleName");
										try {
											if(sOpenRuleName.startsWith(".")){
												sOpenRuleName = cpActivePage.getString(sOpenRuleName);
											} else if(sOpenRuleName.indexOf(".") >= 0) {
												sOpenRuleName = tools.getProperty(sOpenRuleName).getStringValue();
											} 
										} catch (Exception ex2) {} // If we can't resolve the property, it might just be a string with a '.' in it.  Give it a shot.
										tools.appendString("openRuleByClassAndName('"+(StringUtils.crossScriptingFilter(pega_rules_utilities.getJSEncodedValue(sOpenRuleName)))+"','"+StringUtils.crossScriptingFilter(sOpenObjClass)+"');return false;");
										bOpenerAdded = true;
									}
								} catch (Exception ex) {
									hasException = true;
									sErrorMessage = ex.toString();
								}
							} else if(!sOpenUrl.equals("")){
								try {
									String sOpenUrlWindowName = tools.getParamValue("openUrlWindowName");
									String sOpenUrlParams = tools.getParamValue("openUrlParams");

									tools.appendString("openUrlInWindow('" + StringUtils.crossScriptingFilter(sOpenUrl) + "','" + StringUtils.crossScriptingFilter(sOpenUrlWindowName) + "','" + StringUtils.crossScriptingFilter(sOpenUrlParams) +"');return false;");
									bOpenerAdded = true;
								}catch (Exception ex) {
									hasException = true;
									sErrorMessage = ex.toString();
								}

							} else {
								sErrorMessage = "A rule link could not be generated because incorrect (or insufficient) parameters were specified. Param page: " + tools.getParameterPage().toString();
							}
							if(sErrorMessage.equals("") && !bOpenerAdded) {
								sErrorMessage = "An unknown error has occured while displaying the rule opener.  Param page: " + tools.getParameterPage().toString();
							}


							tools.putParamValue("openButtonTooltip", tools.getParamValue("openButtonTooltip").replaceAll("\\\\t", "\t")); // Check for an overly escaped tab
						
tools.appendString("\" ");
	boolean foundChoice_6 = false;
tools.appendString(" ");
if (!foundChoice_6 && (pega.isPreviewMode() || !bOpenerAdded || !sErrorMessage.equals(""))) {
tools.appendString(" style= \"color:red\" title=\"There was a problem adding the rule opener: ");
out.print(sErrorMessage);
tools.appendString("\" ");

foundChoice_6 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_6) {
tools.appendString(" ");
	boolean foundChoice_7 = false;
tools.appendString(" ");
if (!foundChoice_7 && (pega.isPreviewMode() || !paramCaptionStyle.equals(""))) {
tools.appendString(" ");
	boolean foundChoice_8 = false;
tools.appendString(" ");
if (!foundChoice_8 && (pega.isPreviewMode() || paramCaptionStyle.indexOf(":") >= 0)) {
tools.appendString(" style=\"");
out.print(paramCaptionStyle);
tools.appendString("\" ");

foundChoice_8 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_8) {
tools.appendString(" class=\"");
out.print(paramCaptionStyle);
tools.appendString("\" ");
}
tools.appendString("  ");

foundChoice_7 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_7) {
tools.appendString(" class=\"custom_RuleOpener\" ");
}
tools.appendString("  ");
	boolean foundChoice_9 = false;
tools.appendString(" ");
if (!foundChoice_9 && (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("captionTooltip"), "")))) {
tools.appendString(" ");
	boolean foundChoice_10 = false;
tools.appendString(" ");
if (!foundChoice_10 && (pega.isPreviewMode() || (!areValsEqual(tools.getParamValue("captionTooltip"), "pxNoTooltip")))) {
tools.appendString(" title=\"");
out.print(tools.getLocalizedTextForString("pxRequestor.pyCaption", "\t[@baseclass.pyCaption]" + StringUtils.crossScriptingFilter(toolTipString.replaceAll("\\\\t", "\t"))));
tools.appendString("\" ");

foundChoice_10 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_10) {
tools.appendString(" title=\"\" ");
}
tools.appendString("  ");

foundChoice_9 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_9) {
tools.appendString(" title=\"");
out.print(displayString);
tools.appendString("\" ");
}
tools.appendString("  ");
}
tools.appendString("  ");
//title= "=tools.getLocalizedTextForString("pxRequestor.pyCaption", "\t[@baseclass.pyCaption]" + tools.getParamValue("openButtonTooltip")) "
tools.appendString(" >");
out.print(displayString);
tools.appendString("</a> ");
}
tools.appendString(" ");
	if (when_2("ellipsis", "true")) {
tools.appendString("</td></tr></table>");
	}
}
}
private static final Map oPropDefinitions_3 = null;
private static final Map oStreamProperties_3 = new HashMap();
static {
	oStreamProperties_3.put("pyRuleAvailable", "Final");
	oStreamProperties_3.put("pyCircumstanceDateProp", "");
	oStreamProperties_3.put("pyCircumstanceVal", "");
	oStreamProperties_3.put("pyMethodStatus", "Internal");
	oStreamProperties_3.put("pyClassName", "");
	oStreamProperties_3.put("pyCircumstanceProp", "");
	oStreamProperties_3.put("pzInsKey", "RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT");
	oStreamProperties_3.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_3.put("pyCircumstanceDate", "");
	oStreamProperties_3.put("pyRuleEnds", "");
	oStreamProperties_3.put("pyRuleStarts", "");
	oStreamProperties_3.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_3.put("pyXMLType", "");
	oStreamProperties_3.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_3.put("pyCorrType", "");
	oStreamProperties_3.put("pyStreamName", "pzRuleOpener");
	oStreamProperties_3.put("pyRuleSetVersion", "08-06-01");
}
/**
 * Generates stream property_Rule_Access_Role_Name_pzRuleOpener
 */
private void property_Rule_Access_Role_Name_pzRuleOpener() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT	Pega-Desktop:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT
 * Set up context.
 */
final String prevRuleKey_3 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT";final String prevClass_3 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_3 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_3);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_3);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
try {
	if(((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamProlog(oTraceInfo_2)) {
if (!pzDispatchToInvokedMethod()) {

	performStream_1();

}
}
} catch (Throwable thr) {
	oLog.error(pzAuto.getException().getSectionMsg() , thr);
	throw new PRRuntimeException(pzAuto.getException().getSectionMsg()+" : " + thr.getMessage(), thr);
} finally { 
	mStreamResponse.setPropertyDefinitions(prevPropDefs_3);
	mStreamResponse.setJspBaseClass(prevClass_3);
	pz_CurrentRuleKey = prevRuleKey_3;
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_2,true);
}
/* end RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT
 */
private void include_1() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_Access_Role_Name_pzRuleOpener();
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private void performStream_2() throws Throwable {
/* Include stream RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT */
include_1();

}
private static final Map oPropDefinitions_2 = null;
private static final Map oStreamProperties_2 = new HashMap();
static {
	oStreamProperties_2.put("pyRuleAvailable", "Final");
	oStreamProperties_2.put("pyCircumstanceDateProp", "");
	oStreamProperties_2.put("pyCircumstanceVal", "");
	oStreamProperties_2.put("pyMethodStatus", "");
	oStreamProperties_2.put("pyClassName", "");
	oStreamProperties_2.put("pyCircumstanceProp", "");
	oStreamProperties_2.put("pzInsKey", "RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT");
	oStreamProperties_2.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_2.put("pyCircumstanceDate", "");
	oStreamProperties_2.put("pyRuleEnds", "");
	oStreamProperties_2.put("pyRuleStarts", "");
	oStreamProperties_2.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_2.put("pyXMLType", "");
	oStreamProperties_2.put("pyRuleSet", "Pega-LP");
	oStreamProperties_2.put("pyCorrType", "");
	oStreamProperties_2.put("pyStreamName", "pxLPOpenRule");
	oStreamProperties_2.put("pyRuleSetVersion", "08-01-01");
}
/**
 * Generates stream property_Rule_Access_Role_Name_pxLPOpenRule
 */
private void property_Rule_Access_Role_Name_pxLPOpenRule() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT	Pega-LP:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
/*
 * Begin RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT
 * Set up context.
 */
final String prevRuleKey_2 = pz_CurrentRuleKey;
pz_CurrentRuleKey = "RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT";final String prevClass_2 = mStreamResponse.getJspBaseClass();
mStreamResponse.setJspBaseClass("Rule-HTML-Property");
final Map prevPropDefs_2 = mStreamResponse.getPropertyDefinitions();
mStreamResponse.setPropertyDefinitions(oPropDefinitions_2);
if (mParentStreamProperties == null) {
mParentStreamProperties = pega.getStreamProperties();
	if (mParentStreamProperties == null) {
		mParentStreamProperties = Collections.EMPTY_MAP;
	}
}
pega.setStreamProperties(oStreamProperties_2);
	if(!tools.hasInputEnabled() && !tools.hasEditableEnabled()) {
		pega.setModeInput(false);
	}
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
	((com.pega.pegarules.priv.runtime.PegaStreamAPI)pega).streamEpilog(oTraceInfo_1,true);
}
/* end RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT */
}
}
/**
 * Build stream RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT
 */
private void include_2() {
	final Map streamProperties = pega.getStreamProperties();
	try {
property_Rule_Access_Role_Name_pxLPOpenRule();
	pzAuto.implementShowMe(IAutoStreamRuntime.SHOWME_INSERT, showMeParams_1);
	} finally {
		pega.setStreamProperties(streamProperties);
	}
}
private boolean when_1(String aParam1, String aParam2) throws Throwable {
	return (pega.isPreviewMode() || (areValsEqual(tools.getProperty(aParam1).getStringValue(), aParam2)));
}
private void performStream_3() throws Throwable {
	boolean foundChoice_1 = false;
tools.appendString(" ");
if (!foundChoice_1 && when_1("pxRequestor.pyPegaDesignMode", "true")) {
tools.appendString(" Rule Opener for RuleSet and RSV ");

foundChoice_1 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_1) {
tools.appendString(" ");

	String sCaption 		= "";
	String sRuleSetName  	= "";
	String sRuleSetVersion 	= "";
	String sRuleSetBranch 	= "";
	String sBranchedRuleSet	= "";
	String sCaptionType	= StringUtils.crossScriptingFilter(tools.getParamValue("captionType"));
	String sEllipsis	= StringUtils.crossScriptingFilter(tools.getParamValue("ellipsis"));
	boolean bDisableBranchLink = tools.getParameterPage().getAsBoolean("disableBranchLink");
	boolean bDisplayOnly = tools.getParameterPage().getAsBoolean("displayOnly");
	try {
		// Get the parameters
		String captionRuleSetProperty = StringUtils.crossScriptingFilter(tools.getParamValue("captionRuleSetProperty"));
		String captionVersionProperty = StringUtils.crossScriptingFilter(tools.getParamValue("captionVersionProperty"));

		// Get the values
		if(sCaptionType.equalsIgnoreCase("string")) {
			sRuleSetName = captionRuleSetProperty;
			sRuleSetVersion = captionVersionProperty;
		} else {
			// If the ruleset name is blank, use the current value
			if(captionRuleSetProperty.equals("")) 
				sRuleSetName = StringUtils.crossScriptingFilter(tools.getActiveValue());
			else
				sRuleSetName = tools.getActive().getParentPage().getString(captionRuleSetProperty);
			
			if(!captionVersionProperty.equals("")) 
				sRuleSetVersion = tools.getActive().getParentPage().getString(captionVersionProperty);
		}
		
			
	} catch (Exception e) { sRuleSetName = e.toString(); }
	

	if(sRuleSetName.indexOf("_Branch_") != -1) {
		String[] ruleSetNameArray = sRuleSetName.split("_Branch_");
		if( ruleSetNameArray.length == 2 ) {
			sBranchedRuleSet = ruleSetNameArray[0];
			sRuleSetBranch = ruleSetNameArray[1];
		}
	}

tools.appendString(" ");
	boolean foundChoice_2 = false;
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || (sRuleSetBranch.length() != 0))) {
tools.appendString(" ");

			/* 
			 * This is the second rule opener for the branch 
			 */
			sCaption = sBranchedRuleSet + " [Branch: " + sRuleSetBranch + "]";
			tools.putParamValue("caption", sCaption );
			//tools.putParamValue("openKeys", "pyRuleSetName="+sRuleSetName);
			tools.putParamValue("openObjClass", "Rule-RuleSet-Name");
			tools.putParamValue("captionTooltip", "LPOpenLabel\\t"+sCaption);
			tools.putParamValue("captionType", "String");
			tools.putParamValue("ellipsis", sEllipsis);
			
			tools.putParamValue("openRuleName",sRuleSetName);

		
tools.appendString(" ");
	boolean foundChoice_3 = false;
tools.appendString(" ");
if (!foundChoice_3 && (pega.isPreviewMode() || bDisplayOnly)) {
tools.appendString(" ");
out.print(sCaption );
tools.appendString(" ");

foundChoice_3 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_3) {
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT */
include_2();

tools.appendString(" ");
}
tools.appendString("  ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2 && (pega.isPreviewMode() || sRuleSetName.indexOf('@') == -1)) {
tools.appendString(" ");

			sCaption = sRuleSetName;
			if (!"".equals(sRuleSetVersion))  {
				if(!StringUtils.crossScriptingFilter(tools.getParamValue("versionSuffix")).equals("")) {
					sRuleSetVersion += "<span class=\""+StringUtils.crossScriptingFilter(tools.getParamValue("versionSuffixStyle"))+"\">" + StringUtils.crossScriptingFilter(tools.getParamValue("versionSuffix"))+ "</span>";
				}
				sCaption = sRuleSetName+":"+sRuleSetVersion;
			}
			tools.putParamValue("caption", sCaption);
			//tools.putParamValue("openKeys", "pyRuleSetName="+sRuleSetName);
			tools.putParamValue("openObjClass", "Rule-RuleSet-Name");
			tools.putParamValue("captionTooltip", "LPOpenLabel\\t"+sRuleSetName);
			tools.putParamValue("captionType", "String");
			//for BUG-48705
			tools.putParamValue("openRuleName",sRuleSetName);
		
tools.appendString(" ");
	boolean foundChoice_11 = false;
tools.appendString(" ");
if (!foundChoice_11 && (pega.isPreviewMode() || bDisplayOnly)) {
tools.appendString(" ");
out.print(sCaption);
tools.appendString(" ");

foundChoice_11 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_11) {
tools.appendString(" ");
/* Include stream RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT */
include_2();

tools.appendString(" ");
}
tools.appendString("  ");

foundChoice_2 = !pega.isPreviewMode();
}
tools.appendString(" ");
if (!foundChoice_2) {
tools.appendString(" ");
out.print(sRuleSetName );
tools.appendString(" ");
}
tools.appendString("  ");

// Restore the caption type
tools.putParamValue("captionType", sCaptionType);
tools.putParamValue("ellipsis", sEllipsis);

tools.appendString(" ");
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
	oStreamProperties_1.put("pyClassName", "");
	oStreamProperties_1.put("pyCircumstanceProp", "");
	oStreamProperties_1.put("pzInsKey", "RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT");
	oStreamProperties_1.put("pxObjClass", "Rule-HTML-Property");
	oStreamProperties_1.put("pyCircumstanceDate", "");
	oStreamProperties_1.put("pyRuleEnds", "");
	oStreamProperties_1.put("pyRuleStarts", "");
	oStreamProperties_1.put("pyJavaGenerateAPIVersion", "04-02");
	oStreamProperties_1.put("pyXMLType", "");
	oStreamProperties_1.put("pyRuleSet", "Pega-Desktop");
	oStreamProperties_1.put("pyCorrType", "");
	oStreamProperties_1.put("pyStreamName", "pzOpenRuleSetVersion");
	oStreamProperties_1.put("pyRuleSetVersion", "08-01-01");
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
	tools = (StreamBuilderToolKit)aContext;
	pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
	if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
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
	if( pega != null ) pega.setTrackMissingProperties("Rule-HTML-Property");
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZOPENRULESETVERSION #20180713T135129.748 GMT", "pzOpenRuleSetVersion", "Pega-Desktop", "08-01-01", "20180713T135129.748 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_2 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PZRULEOPENER #20201119T122721.658 GMT", "pzRuleOpener", "Pega-Desktop", "08-06-01", "20201127T105750.471 GMT");
private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_1 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PXLPOPENRULE #20180713T142452.409 GMT", "pxLPOpenRule", "Pega-LP", "08-01-01", "20180713T142452.409 GMT");
}
