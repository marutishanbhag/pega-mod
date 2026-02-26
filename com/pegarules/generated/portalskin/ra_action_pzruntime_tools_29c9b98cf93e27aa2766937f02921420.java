package com.pegarules.generated.portalskin;
/*
 * Copyright (c) 2024 Pegasystems Inc.
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
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.ui.cssoptimization.*;
import com.pega.pegarules.priv.ui.skin.*;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
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
import java.util.*;
public class ra_action_pzruntime_tools_29c9b98cf93e27aa2766937f02921420  extends com.pega.pegarules.priv.runtime.AbstractSkin implements Activity, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_PortalSkin.pzruntime_tools.Action");
	public ra_action_pzruntime_tools_29c9b98cf93e27aa2766937f02921420(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}
static final String skinName = "pzruntime-tools";
static final String skinLabel = "pzruntime-tools";
static final Map<String, String> mapAppWorkStyles = new HashMap<String, String>();
static final Map<String, String> workStyleBases = new HashMap<String, String>(6);
static {
	workStyleBases.put("appWorkStyle", com.pega.pegarules.priv.web.StaticContentConstants.SKIN_GENERATED_CSS_STARTWITH+"pzruntime-tools");
	workStyleBases.put("appWorkStyle_rtl", com.pega.pegarules.priv.web.StaticContentConstants.SKIN_GENERATED_CSS_STARTWITH+"pzruntime-tools_rtl_");
	workStyleBases.put("appWorkStyle_legacy", com.pega.pegarules.priv.web.StaticContentConstants.SKIN_GENERATED_CSS_STARTWITH+"pzruntime-tools_legacy_");
	workStyleBases.put("appWorkStyle_workform", com.pega.pegarules.priv.web.StaticContentConstants.SKIN_GENERATED_CSS_STARTWITH+"pzruntime-tools_workform_");
	workStyleBases.put("appWorkStyle_workform_legacy", com.pega.pegarules.priv.web.StaticContentConstants.SKIN_GENERATED_CSS_STARTWITH+"pzruntime-tools_workform_legacy_");
}
protected List<String> getAdditionalCSS() {
	 List<String> additionalCSS = new ArrayList<String>(4);
	additionalCSS.add("pzruntime-tools-base");
	additionalCSS.add("pzruntime-tools-gap");
	additionalCSS.add("pzruntime-tools-guide");
	additionalCSS.add("pyPega_screen_cap_video_rec");
	additionalCSS.add("pzruntime-tools-developerAssistant");
	return additionalCSS;
}
protected String getSkinName() {
	return skinName;
}
protected String getSkinLabel() {
	return skinLabel;
}
protected List<String> getParentSkins() {
	 List<String> parentSkins = new ArrayList<String>(1);
	parentSkins.add("pzDesignerStudio");
	return parentSkins;
}
protected Map<String, String> getMapAppWorkStyles() {
	return mapAppWorkStyles;
}
protected String getWorkStyleBase(String key) {
	return workStyleBases.get(key);
}
private java.util.Set<String> setPzbaseToSkip = null;
private ArrayList cssFilesToRead = new ArrayList();

private void emitPzbase(String action, String inPzbaseName) {
		if ( !action.equalsIgnoreCase("generateCssOptimized") ) {
			cssFilesToRead.add(inPzbaseName);
		} else {
			boolean bSkipThis = false;
			bSkipThis = (setPzbaseToSkip != null) && (setPzbaseToSkip.contains(inPzbaseName));
			if (bSkipThis) {
				oLog.debug("  Skipping inclusion of " + inPzbaseName );
			} else {
				cssFilesToRead.add(inPzbaseName);
			}
		}
	}
	
	private ArrayList pruneFromPostFiles(String action, ArrayList cssFilesToReadPost) {
			ArrayList prunedCssFilesToReadPost = new ArrayList();
			oLog.debug("pruneFromPostFiles in: cssFilesToReadPost (" + cssFilesToReadPost.size() + "): " + cssFilesToReadPost );
			if ( action.equalsIgnoreCase("generateCssOptimized") && (setPzbaseToSkip != null) && (setPzbaseToSkip.size() > 0) ) {
				Iterator iter = cssFilesToReadPost.iterator();
				while (iter.hasNext()) {
					String thisFile = (String) iter.next();
					if (setPzbaseToSkip.contains(thisFile)) {
						oLog.debug("skipping: " + thisFile);
					} else {
						oLog.debug("keeping: " + thisFile);
						prunedCssFilesToReadPost.add(thisFile);
					}
				}
				oLog.debug("pruneFromPostFiles out: prunedCssFilesToReadPost (" + prunedCssFilesToReadPost.size() + "): " + prunedCssFilesToReadPost );
				return prunedCssFilesToReadPost;
			} else {
				return cssFilesToReadPost;
			}
		}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-PORTALSKIN PZRUNTIME-TOOLS #20220408T065527.100 GMT	Pega-UIEngine:08-08-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
		if (!pzDispatchToInvokedMethod()) {

		String className = this.getClass().getName();
		oLog.debug("isAutoGenerated: true");
		if (oLog.isDebugEnabled()) {

		oLog.debug("SKIN RUNTIME - START pyAppWorkStyle_legacy=" + getAppWorkStyle("_legacy") + " pyAppWorkStyle=" + getAppWorkStyle("") );
		}

		getDependencies();
		ParameterPage params = tools.getParameterPage();
		HashMap mixinMap = new HashMap();
		String optimizedStaticContent = null;
		String CSSAsJSONStaticContent = null;
		String skinHash = tools.getPRCrypto().digestString(((StringBuilder)params.get("parentSkins")).toString(), null);
		oLog.debug(" skinHash = " + skinHash +  " for " + params.get("parentSkins"));
		/* Additional Stylesheets */
		ArrayList cssFilesToReadPost = new ArrayList(getAdditionalCSS());
		params.remove("visitedSkins");
		String action = tools.getParamValue("pyAction");
		oLog.debug( "Performing skin action: " + action);
		if (action.equalsIgnoreCase("generateCssOptimized")) {
		String strPropName = OptimizedContent.PzbaseToSkipSetPropName;
		setPzbaseToSkip = (java.util.Set<String>) tools.getParameterPage().getObject( OptimizedContent.PzbaseToSkipSetPropName );
		if (setPzbaseToSkip == null) {
		oLog.error( action + " action called with setPzbaseToSkip: " + setPzbaseToSkip);
		}
		}
		if (oLog.isDebugEnabled()) {

		oLog.debug("pzSkinMethodBody FUA execution for '" + "RULE-PORTALSKIN PZRUNTIME-TOOLS #20220408T065527.100 GMT" + "' - pyAction='" + action + "'");
		}

		String implementationKey = pega_uiengine_pzcssengine.pzGetImplementationKey(this.getClass().getName());
 
		if (implementationKey.isEmpty() || implementationKey == null) {

		oLog.debug("SKIN Gen Log - SkinAssembler.java - methodBody: implementationKey is null");
		}
		StringMap skinRefPage = new HashStringMap();
		skinRefPage.putString("pzRefObjClass","Rule-PortalSkin");
		skinRefPage.putString("pzRefRuleSet","Pega-UIEngine");
		skinRefPage.putString("pzRefInsKey","RULE-PORTALSKIN PZRUNTIME-TOOLS #20220408T065527.100 GMT");
		skinRefPage.putString("pzImplementationKey",implementationKey);

		if (action.equalsIgnoreCase("") || action.equalsIgnoreCase("getStyleRuleName") || action.equalsIgnoreCase("generateCssOptimized") || action.equalsIgnoreCase("generateCssAsJSON")) {
		StringBuilder cssDoc = new StringBuilder();
		StringBuilder cssJSONDoc = new StringBuilder();
		boolean IsCSSAsJSON = false;
		String staticFile = null;
		String staticFileAsJSON = null;
		if (action.equalsIgnoreCase("generateCssAsJSON")) {
		IsCSSAsJSON = true;
		workStyleBases.put("appWorkStyle_json", com.pega.pegarules.priv.web.StaticContentConstants.SKIN_GENERATED_CSS_STARTWITH+"pzruntime-tools_json_");
		}
		oLog.debug("SKIN RUNTIME - START Calling CSS Getter for non legacy CSS");
		if (!action.equalsIgnoreCase("generateCssOptimized")) {
		staticFile = GenerateCSS.isStaticFileGenerated(cssFilesToRead, workStyleBases.get("appWorkStyle")+skinHash,cssFilesToReadPost); 
		oLog.debug("Calling isStaticFileGenerated to get staticFile if isAutoGenerated is true and appWorkStyle= " + staticFile);
		if(IsCSSAsJSON) {
		staticFileAsJSON = GenerateCSS.isStaticFileGenerated(null,workStyleBases.get("appWorkStyle_json")+skinHash,null); 
		}
		}
		if((staticFile != null)  && !(action.equalsIgnoreCase("generateCssOptimized"))) {
		setAppWorkStyle(staticFile, ""); 
		} else {
		oLog.debug("SKIN Gen Log - SkinAssembler.java - methodBody: appWorkStyle, staticFile is null, could not set to AppWorkStyle");
		if(cssDoc.length() == 0 || action.equalsIgnoreCase("generateCssOptimized")) {
		pzSkinProcess(cssDoc, mixinMap, cssJSONDoc, IsCSSAsJSON);
		if (cssDoc.length() == 0) {

		oLog.debug("SKIN Gen Log - SkinAssembler.java - methodBody: appWorkStyle, cssDoc is empty");
		}

		if (action.equalsIgnoreCase("generateCssOptimized")) {
		String cssHash = OptimizedContent.getMD5HashOfCss(cssDoc.toString());
		if (cssHash.isEmpty() || cssHash == null) {

		oLog.debug("SKIN Gen Log - SkinAssembler.java - methodBody: appWorkStyle, cssHash is null");
		}

		oLog.debug("generatedOptimizedCss - cssHash: " + cssHash );
		skinHash = cssHash + skinHash;
		oLog.debug("generatedOptimizedCss - skinHash: " + skinHash );
		cssFilesToReadPost = pruneFromPostFiles(action, cssFilesToReadPost);
		}
		}
		String strStaticContent = GenerateCSS.generateStaticContent(cssFilesToRead, workStyleBases.get("appWorkStyle")+skinHash, className, cssDoc, cssFilesToReadPost, false, mixinMap);
		if (strStaticContent.isEmpty() || strStaticContent == null) {

		oLog.debug("SKIN Gen Log - SkinAssembler.java - methodBody: appWorkStyle, strStaticContent is null");
		}

		setAppWorkStyle(strStaticContent, ""); 
		if (action.equalsIgnoreCase("generateCssOptimized")) {
		optimizedStaticContent = getAppWorkStyle("");
		}
		}
		if(IsCSSAsJSON) {
		if(staticFileAsJSON != null) {
		setAppWorkStyle(staticFileAsJSON, "_json"); 
		} else{
		if (cssJSONDoc.length() == 0 ) {
		pzSkinProcess(cssDoc, mixinMap, cssJSONDoc, IsCSSAsJSON);
		 }
		String strStaticJSONContent = GenerateCSS.generateStaticContent(null,workStyleBases.get("appWorkStyle_json")+skinHash, className, cssJSONDoc,null,false,null);
		setAppWorkStyle(strStaticJSONContent, "_json"); 
		 }
		CSSAsJSONStaticContent = getAppWorkStyle("_json");
		 }
		ArrayList cssFilesToReadInRTL = new ArrayList(cssFilesToRead);
		oLog.debug("SKIN RUNTIME - END Calling CSS Getter for non legacy CSS");
		if(tools.getRequestor().getTextOrientation() == PRRequestor.ORIENTATION_RIGHT_TO_LEFT){
		cssFilesToReadInRTL.add("pzDummyRTL");
		staticFile = GenerateCSS.isStaticFileGenerated(cssFilesToReadInRTL, workStyleBases.get("appWorkStyle_rtl")+skinHash,cssFilesToReadPost); 
		oLog.debug("Calling isStaticFileGenerated to get staticFile if isAutoGenerated is false and appWorkStyle_rtl = " + staticFile);
		if(IsCSSAsJSON) {
		staticFileAsJSON = GenerateCSS.isStaticFileGenerated(null,workStyleBases.get("appWorkStyle_json")+skinHash,null); 
		}
		if(staticFile != null) {
		setAppWorkStyle(staticFile, "_rtl"); 
		} else {
		oLog.debug("SKIN Gen Log - SkinAssembler.java - methodBody: appWorkStyle_rtl, staticFile is null");
		if(cssDoc.length() == 0) {
		pzSkinProcess(cssDoc, mixinMap,cssJSONDoc, IsCSSAsJSON);
		if(cssDoc.length() == 0) {
		oLog.debug("SKIN Gen Log - SkinAssembler.java - methodBody: cssDoc is null");
		}
		}
		String strStaticContentRtl = GenerateCSS.generateStaticContent(cssFilesToReadInRTL, workStyleBases.get("appWorkStyle_rtl")+skinHash, className, cssDoc, cssFilesToReadPost, true, mixinMap);
		if (strStaticContentRtl .isEmpty() || strStaticContentRtl == null) {

		oLog.debug("SKIN Gen Log - SkinAssembler.java - methodBody: appWorkStyle_rtl, strStaticContentRtl is null and could not set it");
		}

		setAppWorkStyle(strStaticContentRtl, "_rtl"); 
		}
		if(IsCSSAsJSON) {
		if(staticFileAsJSON != null) {
		setAppWorkStyle(staticFileAsJSON, "_json"); 
		} else {
		if (cssJSONDoc.length() == 0 ) {
		pzSkinProcess(cssDoc, mixinMap, cssJSONDoc, IsCSSAsJSON);
		if(cssDoc.length() == 0) {
		oLog.debug("SKIN Gen Log - SkinAssembler.java - methodBody: cssDoc is null");
		}
		 }
		String strStaticJSONContentRtl = GenerateCSS.generateStaticContent(null,workStyleBases.get("appWorkStyle_json")+skinHash, className, cssJSONDoc,null,true,null);
		setAppWorkStyle(strStaticJSONContentRtl, "_json"); 
		}
		CSSAsJSONStaticContent = getAppWorkStyle("_json");
		}
		}
		}
		if(action.equalsIgnoreCase("")) {
		if(tools.getStepPage().getString("pxObjClass").equals("Data-Portal")){
		ClipboardPage pg = tools.getStepPage().getProperty(".pyPortalSkin").getPageValue();
		pg.getProperty("pyDesktopStyle").setValue("");
		pg.getProperty("pyReportStyle").setValue("");
		pg.getProperty("pyRuleStyle").setValue("css/ruleformstyle_metal");
		pg.getProperty("pyWorkStyle").setValue("");
		pg.getProperty("pyWorkStyleLegacy").setValue(""); 
		pg.getProperty("pyWorkStyle_rtl").setValue(getAppWorkStyle("_rtl")); 
		pg.getProperty("pyAppWorkStyle").setValue(getAppWorkStyle(""));
		pg.getProperty("pyAppWorkStyleLegacy").setValue(getAppWorkStyle("_legacy")); 
		}
		}
		else if(action.equalsIgnoreCase("getStyleRuleName")){
		tools.putParamValue("pyWorkStyle_rtl", getAppWorkStyle("_rtl"));
		String styleType = tools.getParamValue("pyActionStyleType");
		if(styleType.equalsIgnoreCase("Desktop")){tools.putParamValue("pyActionStyleRuleName","");}
		else if(styleType.equalsIgnoreCase("Report")){tools.putParamValue("pyActionStyleRuleName","");}
		else if(styleType.equalsIgnoreCase("Work")){tools.putParamValue("pyActionStyleRuleName","");}
		else if(styleType.equalsIgnoreCase("Rule")){tools.putParamValue("pyActionStyleRuleName","css/ruleformstyle_metal");}
		else if(styleType.equalsIgnoreCase("AppWork")){tools.putParamValue("pyActionStyleRuleName",getAppWorkStyle(""));}
		else if(styleType.equalsIgnoreCase("AppWorkLegacy")){tools.putParamValue("pyActionStyleRuleName",getAppWorkStyle("_legacy"));}
		}
		else if (action.equalsIgnoreCase("showLegacyHeaderFormats")) {
		tools.putParamValue("legacyHeaderFlag", "false");
		}
		else if (action.equalsIgnoreCase("getFormatNames")) {
		String componentClass = tools.getParamValue("componentClass");
		String isStandard = tools.getParamValue("isStandard");
		String listAll = tools.getParamValue("listAll");
		String fetchedStdsForListAll = tools.getParamValue("fetchedStdsForListAll");
		String templateType = tools.getParamValue("templateType");
		ArrayList stdformats=null;
		if("-1".equals(listAll) && "".equals(fetchedStdsForListAll)){
		tools.putParamValue("isStandard","-1"); 
		tools.putParamValue("listAll","0");
		tools.putParamValue("nonLegacyFormats","false"); 
		getFormatNames();
		stdformats = new ArrayList((LinkedHashSet<String>)params.get("inheritedFormats"));
		params.remove("inheritedFormats") ;
		params.remove("visitedSkins");
		tools.putParamValue("fetchedStdsForListAll","true"); 
		tools.putParamValue("isStandard","0"); 
		tools.putParamValue("listAll","-1");
		tools.putParamValue("nonLegacyFormats","true"); 
		}
		if (oLog.isDebugEnabled()) {
		oLog.debug("Calling getFormatNames({componentClass: " + componentClass + " , isStandard: " + isStandard + " , listAll: " + listAll + ", templateType: " + templateType + "});");
		}
		getFormatNames();
		params.remove("visitedSkins");
		ArrayList listformats = new ArrayList((LinkedHashSet<String>)params.get("inheritedFormats"));
		if (listformats != null) {
		Collections.sort(listformats);
		if (stdformats != null) {
		for(int i = 0; i < stdformats.size();i++) {
		for (Iterator<String> iterator = listformats.iterator(); iterator.hasNext();) {
		   String str = iterator.next();
		 if (str.equals(stdformats.get(i))) {
		 iterator.remove();
		}
		}
		listformats.add(i,stdformats.get(i));
		}
		}
		ClipboardPage pgStepPage = tools.getStepPage();
		if (pgStepPage != null) { ClipboardProperty formatList = pgStepPage.getProperty("pxResults");

		pgStepPage.put(formatList);
		for (int i = 0; i < listformats.size(); i++) {
		formatList.getPageValue(ClipboardProperty.LIST_APPEND).getProperty("pyName").setValue("pz-"+ ((String) listformats.get(i)).trim().replace(" ","-").replace("(","").replace(")","").toLowerCase());}
		} else {
		StringBuilder retlist = new StringBuilder(64);
		for (int i = 0; i < listformats.size(); i++) {
		retlist.append("pz-"+  ((String) listformats.get(i)).trim().replace(" ","-").replace("(","").replace(")","").toLowerCase()).append(",");}
		tools.putParamValue("listFormats", retlist.toString());
		}
		}
		}
		else if (action.equalsIgnoreCase("generateExpressThemePage")) {
		String pageName = tools.getParamValue("pageName");
		if (oLog.isDebugEnabled()) {
		oLog.debug("Calling generateExpressThemePage({pageName: " + pageName + "});");
		}
		getExpressThemePage();
		}
		else if (action.equalsIgnoreCase("generateExpressPresetsList")) {
		String pageName = tools.getParamValue("pageName");
		if (oLog.isDebugEnabled()) {
		oLog.debug("Calling generateExpressPresetsList({pageName: " + pageName + "});");
		}
		generateExpressPresetsList();
		}
		else if (action.equalsIgnoreCase("generateCssAsJSON")) {
		//// Put output of generated JSON on Parameter page here...
		oLog.debug("putting param - pyCSSAsJSONStaticContent - on ParameterPage with value: " + CSSAsJSONStaticContent);
		String finalCSSAsJSON = "";
		if(CSSAsJSONStaticContent != null) {
		finalCSSAsJSON = fetchCSSAsJSON(CSSAsJSONStaticContent);
		}
		tools.putParamValue("pyCSSAsJSONStaticContent", finalCSSAsJSON);
		if(tools.getStepPage()!=null && tools.getStepPage().getString("pxObjClass").equals("Data-Portal")){
		ClipboardPage pg = tools.getStepPage().getProperty(".pyPortalSkin").getPageValue();
		pg.getProperty("pyAppWorkStyle_json").setValue(getAppWorkStyle("_json"));
		}
		}
		else if (action.equalsIgnoreCase("generateCssOptimized")) {
		//// Put output of optimized generation on Parameter page here...
		oLog.debug("putting param - pyCSSOptimizedStaticContent - on ParameterPage with value: " + optimizedStaticContent);
		tools.putParamValue("pyCSSOptimizedStaticContent", optimizedStaticContent);
		}
		else {
		oLog.error("perform method called for '" + skinName + "' with invalid action:" + action);
		}
		oLog.debug("SKIN RUNTIME - END");
		}
}
	} // end of perform definition

		protected boolean isUsingParentTheme() {
			return true;
		}
		protected String getThemeName() { return getThemeName("Default"); }
		protected String getThemeName(String themeFormat) {
			switch (themeFormat) {
				default:
					return null;
				}
			}
			protected String getFileWithThemeJson(){ return getFileWithThemeJson("Default"); }
			protected String getFileWithThemeJson(String themeFormat) {
				switch (themeFormat) {
					default:return null;}
			}
			protected List<String> getFormats(String key) {
				 Map<String, List<String>> formats = new HashMap<String, List<String>>(50);
				formats.put("Embed-Skin-Component-Themecustom", new ArrayList(Arrays.asList("Panel background","Notifications","Information","Warnings","Icon sphere red","Icon sphere purple","Icon sphere green","Icon sphere yellow","Panel Header","Panel Dark background","Divider dark","Icon sphere grey","Icon sphere dark grey","Icon sphere light red","Composer Bar","Icon sphere blue")));
				formats.put("Embed-Skin-Componentcustom", new ArrayList(Arrays.asList("")));
				formats.put("Embed-Skin-Component-LabelsdisabledInherited", new ArrayList(Arrays.asList("Overridden","Overriding","Disabled","Alert","Standard italic","Mobile Build Message","Application name","Popover title gray standard","dark background label large","Rule keys","Uber readable","heading for fat list","Announcement","Explorer heading","Helper text","dark background label")));
				formats.put("Embed-Skin-Component-Headercustom", new ArrayList(Arrays.asList("Runtime Panel","Runtime Panel Header","Nested","Information","Warnings","Notifications","Runtime Panel Footer","Runtime Top Bar")));
				formats.put("Embed-Skin-Component-HeaderdisabledInherited", new ArrayList(Arrays.asList("Overrides border","Breadcrumb","Combo group","Explorer list item","Drop zone","Simple combo group","Fat list item","Dashboard","Dashboard fat list item","Dashboard row label","Explorer header","Modal button array","Modal group","Whats new","Action set","Modal header","Action tile selected","Modal content","Action tile unselected","Content emphasis","Content emphasis standard","Content emphasis table standard","Column divider left","Skin override","Information mobile","Column divider right","Embedded explorer","Case details","Column","Square 160","header mobile build","Column emphasis 2","Default with padding top","Radio button left","Radio button right","Case designer process","Case Designer Tile","Selected list item","Case secondary content","Ruleform header","Vertical separator","Simple combo group child","Skinrule notice","Skinrule warning","Row divider","Distinguished","Tile","Errors","System message","Workarea header")));
				formats.put("Embed-Skin-Component-TabdisabledInherited", new ArrayList(Arrays.asList("Report editor tabs","Sidebar modal tabs","Temporary top tabs","Explorer nav","Repeating","Sub")));
				formats.put("Embed-Skin-Component-RepeatingdisabledInherited", new ArrayList(Arrays.asList("Default Multi Breakpoint","Feature Tree","Transparent Inactive Label","Standard tree","Column navigation","Column fat list","Fat list","Explorer List","Search Grid","Explorer Tree","Summarized report","List report","Spreadsheet","Transparent")));
				formats.put("Embed-Skin-Component-Buttoncustom", new ArrayList(Arrays.asList("Icon","Display as input")));
				formats.put("Embed-Skin-Component-ButtondisabledInherited", new ArrayList(Arrays.asList("Secondary","Icon light","Split button","Dropdown","Bold","Success","Error","System message","Banner","Inline task","Demure","Standard full width")));
				formats.put("Embed-Skin-Component-ButtonnonLegacyFormats", new ArrayList(Arrays.asList("Icon","Display as input")));
				formats.put("Embed-Skin-Component-InputdisabledInherited", new ArrayList(Arrays.asList("Bugs severity","Overflow text","Heading 3","Badge","Alert small","Warning small","Info small","Icon font big","Success small","Description secondary","Icon font","Description primary","Explorer ruletype family","Heading  4","Heading 2","Explorer heading","Primary heading","Heading supporting","Info heading","Article heading","Explorer primary","Explorer category","Explorer search","Disabled Link","FlowOutline","Always Active","Secondary header","Deleted","Bold","Success","Alert","Primary search","workarea header titles","Code","Strong")));
				formats.put("Embed-Skin-Component-LinkdisabledInherited", new ArrayList(Arrays.asList("Project work alert","Strong article heading","Disabled list item","Help link","Application name","Express mobile external","Explorer heading action","Explorer action","Footer PDN","Recents rule type","Standard label link","Standard Ellipsis","Article heading","Selected list item","list link","workarea header secondary","explorer primary","Footer nav","Horizontal menu items","Success","Alert","explorer secondary","workarea header primary","workarea header highlight","Header nav","Disabled")));
				formats.put("Embed-Skin-Component-MenuBardisabledInherited", new ArrayList(Arrays.asList("Standard Tabbed")));
				formats.put("Embed-Skin-Componentstandard", new ArrayList(Arrays.asList("")));
				formats.put("Embed-Skin-Componentstandard", new ArrayList(Arrays.asList("")));
				formats.put("Embed-Skin-Componentstandard", new ArrayList(Arrays.asList("")));
				formats.put("Embed-Skin-Componentstandard", new ArrayList(Arrays.asList("")));
				formats.put("Embed-Skin-Component-RadioButtoncustom", new ArrayList(Arrays.asList("Dark segmented")));
				formats.put("Embed-Skin-Component-RadioButtondisabledInherited", new ArrayList(Arrays.asList("Segmented","Only radio icon")));
				formats.put("Embed-Skin-Component-RadioButtonsegmented", new ArrayList(Arrays.asList("Dark segmented")));
				formats.put("Embed-Skin-Component-RadioButtoncustomsegmented", new ArrayList(Arrays.asList("Dark segmented")));
				formats.put("Embed-Skin-Component-SmartTipdisabledInherited", new ArrayList(Arrays.asList("Tour stop","Info Small")));
				formats.put("Embed-Skin-Component-SimpleLayoutcustom", new ArrayList(Arrays.asList("Inline grid double with labels top")));
				formats.put("Embed-Skin-Component-SimpleLayoutdisabledInherited", new ArrayList(Arrays.asList("Inline labels with space","Inline grid double 10 90","Inline top no spacing","Inline text","Simple list margin","Inline grid 20 80","Inline grid double no spacing 2","Stacked title and description","Inline middle no spacing","Inline grid double no spacing","Inline grid 30 70","QR code display","Inline grid 70 30","Work area","Header menu secondary","Header menu primary","Inline grid sextuple","Inline grid quintuple","Inline grid quadruple","Inline list","split button","Bulleted list","Simple Inline","Inline bottom","Footer menu")));
				formats.put("Embed-Skin-Component-ColumnLayoutdisabledInherited", new ArrayList(Arrays.asList("Icon content","Secondary content three col","Guardrail warnings chart","Mobile settings","Icon and field","System message","Field and icon","Skin styles menu","Skin styles and preview","Ruleform header","Explorer","Profile display","Action set columns","Skin mixins","Checkbox Row","Three Column (Sidebar - Main - Sidebar)","Two Column (Main - Sidebar)","Two Column (Sidebar - Main)")));
				formats.put("Embed-Skin-Component-ScreenLayoutdisabledInherited", new ArrayList(Arrays.asList("Header","Header Left","Header Right","Header Footer","Header Footer Left","Header Footer Right","Header Left Right","Header Footer Left Right","Left","Content Only","Footer")));
				formats.put("Embed-Skin-Component-LayoutGroupcustom", new ArrayList(Arrays.asList("Tab Dark")));
				formats.put("Embed-Skin-Component-LayoutGroupdisabledInherited", new ArrayList(Arrays.asList("Rule tabs","Split button tab left","Split button tab","Menu","Accordion","Stacked","Explorer sub tabs")));
				formats.put("Embed-Skin-Componentcustom", new ArrayList(Arrays.asList("")));
				formats.put("Embed-Skin-Component-Multiselectstandard", new ArrayList(Arrays.asList("Standard")));
				return formats.get(key);
			}
			protected ArrayList<HashMap<String,String>> getExpressThemes() {
				 ArrayList<HashMap<String,String>> expressThemes =new ArrayList<HashMap<String,String>>();
				expressThemes.add(new HashMap<String,String>(){{put("pyName","Page background");
					put("pyLabel","Page background");
					put("parentName","Colors");
					put("parentLabel","Colors");
					put("pxObjClass","Embed-Skin-Background");
					put("pyElementRef","1");
					put("pyColor","#404258");
					put("pyIsCreatedFromExpress","false");
					}});
					expressThemes.add(new HashMap<String,String>(){{put("pyName","Work area background");
						put("pyLabel","Tile background");
						put("parentName","Colors");
						put("parentLabel","Colors");
						put("pxObjClass","Embed-Skin-Background");
						put("pyElementRef","1");
						put("pyColor","#FFF");
						put("pyIsCreatedFromExpress","false");
						}});
						expressThemes.add(new HashMap<String,String>(){{put("pyName","Borders");
							put("pyLabel","Tile border");
							put("parentName","Colors");
							put("parentLabel","Colors");
							put("pxObjClass","Embed-Skin-Background");
							put("pyElementRef","1");
							put("pyColor","#CACDD6");
							put("pyWidth","1");
							put("pyIsCreatedFromExpress","false");
							}});
							expressThemes.add(new HashMap<String,String>(){{put("pyName","Strong");
								put("pyLabel","Strong");
								put("parentName","Colors");
								put("parentLabel","Colors");
								put("pxObjClass","Embed-Skin-Background");
								put("pyElementRef","16");
								put("pyColor","#0062E6");
								put("pyIsCreatedFromExpress","false");
								}});
								expressThemes.add(new HashMap<String,String>(){{put("pyName","Standard");
									put("pyLabel","Standard");
									put("parentName","Colors");
									put("parentLabel","Colors");
									put("pxObjClass","Embed-Skin-Background");
									put("pyElementRef","16");
									put("pyColor","#2B52FF");
									put("pyIsCreatedFromExpress","false");
									}});
									expressThemes.add(new HashMap<String,String>(){{put("pyName","Simple");
										put("pyLabel","Simple");
										put("parentName","Colors");
										put("parentLabel","Colors");
										put("pxObjClass","Embed-Skin-Background");
										put("pyElementRef","16");
										put("pyColor","#FFFFFF");
										put("pyIsCreatedFromExpress","false");
										}});
										expressThemes.add(new HashMap<String,String>(){{put("pyName","General");
											put("pyLabel","Main text");
											put("parentName","Colors");
											put("parentLabel","Colors");
											put("pxObjClass","Embed-Skin-Font");
											put("pyElementRef","1");
											put("pyColor","#10132E");
											put("pyIsCreatedFromExpress","false");
											}});
											expressThemes.add(new HashMap<String,String>(){{put("pyName","Heading 2");
												put("pyLabel","Tiles and headings");
												put("parentName","Colors");
												put("parentLabel","Colors");
												put("pxObjClass","Embed-Skin-Font");
												put("pyElementRef","1");
												put("pyColor","#10132E");
												put("pyIsCreatedFromExpress","false");
												}});
												expressThemes.add(new HashMap<String,String>(){{put("pyName","Link");
													put("pyLabel","Links");
													put("parentName","Colors");
													put("parentLabel","Colors");
													put("pxObjClass","Embed-Skin-Font");
													put("pyElementRef","1");
													put("pyColor","#2B52FF");
													put("pyIsCreatedFromExpress","false");
													}});
													expressThemes.add(new HashMap<String,String>(){{put("pyName","Base settings");
														put("pyLabel","Default");
														put("parentName","TextFamily");
														put("parentLabel","Text");
														put("pxObjClass","Embed-Skin-Font");
														put("pyElementRef","43");
														put("pySize","14");
														put("pySizeUnit","px");
														put("pyFontWeight","normal");
														put("pyFace","(use overall)");
														put("pyOther","");
														put("pyIsCreatedFromExpress","false");
														}});
														expressThemes.add(new HashMap<String,String>(){{put("pyName","General");
															put("pyLabel","Normal");
															put("parentName","TextFamily");
															put("parentLabel","Text");
															put("pxObjClass","Embed-Skin-Font");
															put("pyElementRef","1");
															put("pySize","14");
															put("pySizeUnit","px");
															put("pyFontWeight","normal");
															put("pyFace","(use overall)");
															put("pyOther","");
															put("pyIsCreatedFromExpress","false");
															}});
															expressThemes.add(new HashMap<String,String>(){{put("pyName","Heading 1");
																put("pyLabel","Heading 1");
																put("parentName","TextFamily");
																put("parentLabel","Text");
																put("pxObjClass","Embed-Skin-Font");
																put("pyElementRef","1");
																put("pySize","14");
																put("pySizeUnit","px");
																put("pyFontWeight","700");
																put("pyFace","(use overall)");
																put("pyOther","");
																put("pyIsCreatedFromExpress","false");
																}});
																expressThemes.add(new HashMap<String,String>(){{put("pyName","Heading 2");
																	put("pyLabel","Heading 2");
																	put("parentName","TextFamily");
																	put("parentLabel","Text");
																	put("pxObjClass","Embed-Skin-Font");
																	put("pyElementRef","1");
																	put("pySize","16");
																	put("pySizeUnit","px");
																	put("pyFontWeight","600");
																	put("pyFace","(use overall)");
																	put("pyOther","");
																	put("pyIsCreatedFromExpress","false");
																	}});
																	expressThemes.add(new HashMap<String,String>(){{put("pyName","Heading 3");
																		put("pyLabel","Heading 3");
																		put("parentName","TextFamily");
																		put("parentLabel","Text");
																		put("pxObjClass","Embed-Skin-Font");
																		put("pyElementRef","1");
																		put("pySize","15");
																		put("pySizeUnit","px");
																		put("pyFontWeight","600");
																		put("pyFace","(use overall)");
																		put("pyOther","");
																		put("pyIsCreatedFromExpress","false");
																		}});
																		expressThemes.add(new HashMap<String,String>(){{put("pyName","Heading 4");
																			put("pyLabel","Heading 4");
																			put("parentName","TextFamily");
																			put("parentLabel","Text");
																			put("pxObjClass","Embed-Skin-Font");
																			put("pyElementRef","1");
																			put("pySize","14");
																			put("pySizeUnit","px");
																			put("pyFontWeight","600");
																			put("pyFace","(use overall)");
																			put("pyOther","");
																			put("pyIsCreatedFromExpress","false");
																			}});
																			return expressThemes;
																		}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:DOFUASSEMBLY", 
	"Rule-Utility-Function:PZSKINFUA!PZSKINMETHODBODY", 
	"Rule-Utility-Function:PZSKINFUA!PZSKINMETHODCALL", 
	"Rule-Utility-Function:PZSKINFUA!PZSKINMETHODFINISH", 
	"Rule-Utility-Function:PZSKINFUA!PZSKINMETHODABSENT", 
	"Rule-Utility-Function:PZSKINFUA!PZSKINMETHODACCESS", 
	"Rule-Utility-Function:PZSKINFUA!PZSKINMETHODHEADER", 
	"Rule-PortalSkin:PZRUNTIME-TOOLS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("DOFUASSEMBLY","Rule-Obj-Activity","RULE-PORTALSKIN",true,"Rule-PortalSkin","Pega-UIEngine","08-01-01","RULE-OBJ-ACTIVITY RULE-PORTALSKIN DOFUASSEMBLY #20180713T133312.590 GMT","!DOFUASSEMBLY",true,false,"ABSOLUTE_IS_NOT_PRIMARY",-453485590), 
		new DependentRuleInfo("PZSKINFUA!PZSKINMETHODBODY","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODBODY #20180713T133348.023 GMT","PZSKINFUA!PZSKINMETHODBODY",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZSKINFUA!PZSKINMETHODCALL","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODCALL #20180713T133348.028 GMT","PZSKINFUA!PZSKINMETHODCALL",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZSKINFUA!PZSKINMETHODFINISH","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODFINISH #20180713T133348.036 GMT","PZSKINFUA!PZSKINMETHODFINISH",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZSKINFUA!PZSKINMETHODABSENT","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODABSENT #20180713T133348.016 GMT","PZSKINFUA!PZSKINMETHODABSENT",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZSKINFUA!PZSKINMETHODACCESS","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODACCESS #20180713T133348.019 GMT","PZSKINFUA!PZSKINMETHODACCESS",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZSKINFUA!PZSKINMETHODHEADER","Rule-Utility-Function","",false,"","Pega-UIEngine","08-01-01","RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODHEADER #20180713T133348.040 GMT","PZSKINFUA!PZSKINMETHODHEADER",true,false,"ABSOLUTE_CLASSLESS",1), 
		new DependentRuleInfo("PZRUNTIME-TOOLS","Rule-PortalSkin","",false,"","Pega-UIEngine","08-08-01","RULE-PORTALSKIN PZRUNTIME-TOOLS #20220408T065527.100 GMT","PZRUNTIME-TOOLS",true,false,"ABSOLUTE_CLASSLESS",1600573570)
	};

	 /**
	 * This method returns the set of dependent rules required to build
	 * the generated code and (possibly) whole classes that the rules assembler declared.
	 * @return array of <code>DependentRuleInfo</code> objects.
	 */
	public DependentRuleInfo[] getDependentRuleInfos() {
		return oDependentRuleInfos;
	}

public static final DependentRuleInfo[] oTrackedDependencies = new DependentRuleInfo[]{oDependentRuleInfos[0]};

//	Rules used in this assembly (order and duplicates ARE significant to hash code) :
//	RULE-OBJ-ACTIVITY RULE-PORTALSKIN DOFUASSEMBLY #20180713T133312.590 GMT:crc:-453485590
//	RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODABSENT #20180713T133348.016 GMT:20180713T133348.016 GMT
//	RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODACCESS #20180713T133348.019 GMT:20180713T133348.019 GMT
//	RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODBODY #20180713T133348.023 GMT:20180713T133348.023 GMT
//	RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODCALL #20180713T133348.028 GMT:20180713T133348.028 GMT
//	RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODFINISH #20180713T133348.036 GMT:20180713T133348.036 GMT
//	RULE-UTILITY-FUNCTION PZSKINFUA PZSKINMETHODHEADER #20180713T133348.040 GMT:20180713T133348.040 GMT
//	RULE-PORTALSKIN PZRUNTIME-TOOLS #20220408T065527.100 GMT:20220408T065527.100 GMT
//	getParentSkinName(
//	getThemeData( {"format", "String", "Default"}
//	getFormatNames(
//	getAdditionalCSSFiles(
//	getDependencies(
//	getIconClasses(
//	getAdditionalCSSFilesHash(
//	getHelperClasses(

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION DEFAULT PROPERTYEXISTS--(STRING) #20180713T131438.135 GMT:20180713T131438.135 GMT
//	RULE-UTILITY-FUNCTION PAGE PAGEEXISTSWITHCLASS #20180713T131441.343 GMT:20180713T131441.343 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f6226d491734ecb5d16f8f7e082e8d8c";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Action";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
protected static final Map pzExternalMethodMapping = new HashMap();
protected static final Map pzExternalMethodCache = new Hashtable();
static {
pzExternalMethodMapping.put("getParentSkinName", new String[][] {});
pzExternalMethodMapping.put("getThemeData", new String[][] { {"format", "String", "Default"}});
pzExternalMethodMapping.put("getFormatNames", new String[][] {});
pzExternalMethodMapping.put("getAdditionalCSSFiles", new String[][] {});
pzExternalMethodMapping.put("getDependencies", new String[][] {});
pzExternalMethodMapping.put("getIconClasses", new String[][] {});
pzExternalMethodMapping.put("getAdditionalCSSFilesHash", new String[][] {});
pzExternalMethodMapping.put("getHelperClasses", new String[][] {});
}
protected boolean pzDispatchToInvokedMethod() {
return pega.dispatchToGeneratedMethodInRule(this, pzExternalMethodMapping, pzExternalMethodCache);
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-PORTALSKIN PZRUNTIME-TOOLS #20220408T065527.100 GMT", "pzruntime-tools", "Pega-UIEngine", "08-08-01", "20220408T065527.100 GMT");
}
