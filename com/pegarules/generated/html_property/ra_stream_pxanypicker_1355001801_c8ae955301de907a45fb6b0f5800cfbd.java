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
import com.pega.pegarules.priv.generator.DependentRuleInfo;
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
import com.pega.pegarules.pub.runtime.IControlRuntimeUtilities.ExpressionPojo;
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
public class ra_stream_pxanypicker_1355001801_c8ae955301de907a45fb6b0f5800cfbd extends StreamBuilderSection implements ControlBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pxAnyPicker.Stream");
	private final int uniqueCounter = 4;
private IControlRuntimeUtilities controlRuntimeUtilities = null;
public void execute() {
	throw new PRRuntimeException("Unsupported Method");
}

public ra_stream_pxanypicker_1355001801_c8ae955301de907a45fb6b0f5800cfbd(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
}

	 public boolean isAllowedInWeb() {
		 return true;
	}
public void execute(ClipboardPage runTimeParamPage) {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-HTML-PROPERTY PXANYPICKER #20190806T142222.318 GMT	Pega-Gadgets:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=	baserule=true */
	ClipboardProperty modesProp = runTimeParamPage.getProperty("pyModes");
	ClipboardPage modePageData1 = modesProp.getPageValue(1);
	ClipboardPage modePageData2 = modesProp.getPageValue(2);
	ClipboardPage paramPage = runTimeParamPage.getPage("runTimeParamsPage");
	String sectionUniqueHash = paramPage.getString("pxUniqueStreamHash");
	String ctrlRunTimeSecStreamName = paramPage.getString("pySection");
	boolean localize = paramPage.getBoolean("bLocalize");
	String cellId = paramPage.getString("pyCellId");
	String controlUniqueHash = sectionUniqueHash + uniqueCounter + cellId;
	String propName = runTimeParamPage.getString("pyValue");
	if("true".equals(paramPage.getString("isValueList"))){
	propName = paramPage.getString("pzPLPropName");
	}
	boolean isDisplayTextWithParam = false;
	String displayTextParamName = "";
	String displayTextParamValue = "";
	if(propName.startsWith("param.") || propName.startsWith("Param.")){
	displayTextParamName = propName.substring(propName.indexOf(".")+1);
	displayTextParamValue = tools.getLocalizedTextForString("pyCaption",tools.getParamValue(displayTextParamName));
	isDisplayTextWithParam = true;
	propName = "";
	}
	if("".equals(propName)){
	}
	int maxLength = paramPage.getInteger("propMaxLength");
	String ctrlMaxChars = modePageData1.getStringIfPresent("pyMax");
	if(ctrlMaxChars != null && !ctrlMaxChars.equals("")){
	if(maxLength <= 0) {
	maxLength = Integer.parseInt(ctrlMaxChars);
	}
	}
	String pyOnInput = paramPage.getString("pyOnInput");
	String pyEditValidate = paramPage.getString("pyEditValidate");
	String pyStringType = paramPage.getString("pyStringType");
	String automationId = "";
	String ctrlLabelFieldValue = paramPage.getString("CtrlLabelFieldValue");
	if(ctrlLabelFieldValue != null && !"".equals(ctrlLabelFieldValue)) {
		tools.putParamValue("CtrlLabelFieldValue", ctrlLabelFieldValue);
	}
String textStyle1 = null;	textStyle1 = modePageData1.getStringIfPresent("pyStyleNameOther");
	if(textStyle1 == null) {
	textStyle1 = "";
	}
String cellReadOnly_cell = runTimeParamPage.getStringIfPresent("pyEditOptions"); 
	if (StringUtils.isBlank(cellReadOnly_cell)) { 

	cellReadOnly_cell = runTimeParamPage.getStringIfPresent("pyReadOnly"); 

	} 

	String cellReadOnlyCond_cell = runTimeParamPage.getPage("pyUserData").getString("pyReadOnlyCondition"); 

	ControlsInfo.ControlEditOption ctrlEditiablity = null;
	if(paramPage.getBoolean("bIsSpecialProp")) {
	ctrlEditiablity = ControlsInfo.ControlEditOption.READ_ONLY_ALWAYS;
	} else {
	ctrlEditiablity = ControlsInfo.ControlEditOption.computeControlEditOption(cellReadOnly_cell, cellReadOnly_cell, cellReadOnlyCond_cell);
	}

	StringBuffer pegaValidation = null;
boolean addedValidation = false;

	pegaValidation = com.pega.pegarules.priv.factory.StringBufferFactory.acquire(1024);
	try {

tools.putParamValue("isControlEditableOriginal", true);	boolean isEditable = controlRuntimeUtilities.isControlEditable(ctrlEditiablity, pzAuto, cellReadOnlyCond_cell, modePageData2, propName, tools);
	boolean isControlEditable = isEditable;
	String showReadOnlyFormatting = modePageData1.getStringIfPresent("pyShowReadonlyFormatting");
	if("true".equalsIgnoreCase(showReadOnlyFormatting)){
	if(isEditable && "true".equals(tools.getParamValue("getReadonlyFormat")) && !tools.getStepPage().getProperty(propName).hasAttrError()){
	isEditable = false;
	}
	}

	ClipboardProperty propActivePrev = tools.getActive();String sEntryHandle = "";if(paramPage.getBoolean("pzIsGridrRepeatWithRD")){
	propName = controlRuntimeUtilities.getActivePropertyName(propName, tools);}tools.putActive(tools.getStepPage().getProperty(propName));
		if(ctrlEditiablity == com.pega.pegarules.pub.runtime.ControlsInfo.ControlEditOption.READ_ONLY_CONDITION && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y') {
		String strROWhenCode = tools.getParamValue("editModeReadonlyCondition");
		if(strROWhenCode != null && !"".equals(strROWhenCode)) {
			boolean ROWhenResult = pzAuto.getUIComponentRuntime().getAutoRuntime().handleEvaluateWhen(strROWhenCode, strROWhenCode, "updateWhenInContextData", "");
			tools.putParamValue("isControlEditableOriginal", !ROWhenResult);
		}
	tools.putParamValue("editModeReadonlyCondition", "");
	}
	if(isEditable && !"true".equals(tools.getParamValue("isControlEditableOriginal"))){
		sEntryHandle = controlRuntimeUtilities.getEntryHandle(false, tools);
	} else{
	sEntryHandle = controlRuntimeUtilities.getEntryHandle(isEditable, tools);}
	 String securedPropValue = null;
	 String activePropValue = null;
	 boolean isSecuredProp = false;
	 try {
			 com.pega.pegarules.pub.security.PropertySecurityInfo propSecInfo = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().getPropertyInfoForDisplay(tools.getStepPage(), tools.getActive(), tools);
			 if(propSecInfo !=null && propSecInfo.isObfuscated()) {
					 securedPropValue = propSecInfo.getPropValue(); 
			 }else if ("ENCRYPTED".equalsIgnoreCase(propSecInfo.getPropType().toString())){
					 isSecuredProp = true;
					 activePropValue = propSecInfo.getPropValue();
			}
	 } catch(Exception e) { }
	 if(pzAuto.getSection().getControl().isExpTarget(sEntryHandle) ) {
	 pega_rules_utilities.pzRegisterActivity(tools,"GetTargets");
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(controlUniqueHash+ "_8")){	boolean isActionConfigured = false;
	String formatType = modePageData2.getStringIfPresent("pyFormatType");
	if(formatType == null){
	formatType = "text";
	}
	boolean willHaveTag = isActionConfigured || "number".equals(formatType);
	if(willHaveTag){

		textIncludes_1();	}
	String textAlign = modePageData2.getStringIfPresent("pyTextAlign");
	if(textAlign == null){
	textAlign = "Left";
	}
	String styleClass = tools.getControlUtilities().getClassForTextStyle(textStyle1, textAlign, false, formatType );
	if(styleClass == null){
	styleClass = "class = " + tools.getControlUtilities().getClassForTextAlign(textAlign);
	}
	String controlFormat = tools.getControlUtilities().getControlFormatForNone();
	if("text".equals(formatType)){
	String autoAppend = modePageData2.getStringIfPresent("pyAutoAppend");
	if(autoAppend == null){
	autoAppend = "";
	}
	String autoPrepend = modePageData2.getStringIfPresent("pyAutoPrepend");
	if(autoPrepend == null){
	autoPrepend = "";
	}
	boolean bObfuscate = modePageData2.getBoolean("pyObfuscated") ;
	boolean bLocalize = false ;
	if(localize && "localizevalue".equals(modePageData2.getStringIfPresent("pyContent"))){
	bLocalize = true ;
	}
	controlFormat = tools.getControlUtilities().getControlFormatForText(autoAppend, autoPrepend, bObfuscate, bLocalize, tools);
	}

inclCalVal_1("pxAnyPicker", controlFormat, styleClass);inclAction_1();
tools.appendString(">");
	if(securedPropValue == null){inclFormattedVal_1(runTimeParamPage, isSecuredProp, activePropValue, isDisplayTextWithParam, displayTextParamName);
	  } else  { 
		 tools.appendString(securedPropValue);
	 }
tools.appendString("</P>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();} else 
	  if(securedPropValue != null && pzAuto.getUIComponentRuntime().getTemplatingUIStatus() != 'Y') { 
			 if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(controlUniqueHash+ "_9")){
		 tools.appendString("<span>" + securedPropValue + "</span>");
			 }pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	  } else { 
	if(isEditable) {
	String validationString  = controlRuntimeUtilities.getValidationString(runTimeParamPage, modePageData1);
	if(validationString != null){
	pegaValidation.append(validationString);
	addedValidation = true;
	}	String requiredWhen = modePageData1.getString("pyRequiredWhen");
	String requiredWhenROC = modePageData1.getString("pyReqRunOnClient");
	controlRuntimeUtilities.generateCodeForAJAXTracking(requiredWhen, requiredWhenROC, tools, pzAuto);
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
		String PY_LIST_DATA_SOURCE = "pyListDataSource";
		String PY_REPORT_DEFINITION_PAGE = "pyReportDefinitionPage";
		String PY_REPORT_DEF_PARAMS = "pyReportDefParams";
		String PY_DATA_PAGE = "pyDataPage";
		String PY_DATA_PAGE_PARAMS = "pyDataPageParams";
		String PY_CB_PAGE = "pyCBPage";
		String PY_ACT_PARAMS = "pyActParams";
		String PY_DT_PARAMS = "pyDTParams";
		String pyEnableGrouping = "";
		String pyGroupLabel = "";
		String ctrlTooltip = modePageData1.getStringIfPresent("pyTooltip");
		if(ctrlTooltip == null) {
		ctrlTooltip = "";
		}
		String ctrlHelperTextType = modePageData1.getStringIfPresent("pyHelperTextType");
		if(ctrlHelperTextType == null) {
		ctrlHelperTextType = "";
		}
		String ctrlStyle = modePageData1.getStringIfPresent("pyStyleNameOther");
		if(ctrlStyle == null) {
		ctrlStyle = "";
		}
		String pyDisplayFullScreen = modePageData1.getStringIfPresent("pyDisplayFullScreen");
		if(pyDisplayFullScreen == null) {
		pyDisplayFullScreen = "";
		}
		String pyShowInputControl = modePageData1.getStringIfPresent("pyShowInputControl");
		if(pyShowInputControl == null) {
		pyShowInputControl = "true";
		}
		String pyDataSource = modePageData1.getPage("pyListDataSource").getStringIfPresent("pyListSource");
		if(pyDataSource == null) {
		pyDataSource = "associated";
		}
		String pyEnableCache = modePageData1.getPage("pyListDataSource").getStringIfPresent("pyEnableCaching");
		if(pyEnableCache == null) {
		pyEnableCache = "true";
		}
		String pyHighlightMatch = modePageData1.getStringIfPresent("pyHighlightMatch");
		if(pyHighlightMatch == null) {
		pyHighlightMatch = "true";
		}
		String pyMatchString = modePageData1.getStringIfPresent("pyMatchString");
		if(pyMatchString == null) {
		pyMatchString = "false";
		}
		String pyMaxResults = modePageData1.getStringIfPresent("pyMaxResults");
		if(pyMaxResults == null) {
		pyMaxResults = "0";
		}
		String pyMinSearch = modePageData1.getStringIfPresent("pyMinSearch");
		if(pyMinSearch == null) {
		pyMinSearch = "0";
		}
		ClipboardPage dsPage;
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
		java.util.List<String> ctPropRefs = new ArrayList<String>();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		String repeatIndx = "";
		automationId = runTimeParamPage.getString("pyAutomationID");
		cellPage.put("automationId",pzCell.getTestIdIfEnabled(automationId,true));
		String strPropName = ".pyBaseApplication";
		controlRuntimeUtilities.registerPropertyReference(".pyBaseApplication", ".pyCaption", localize, tools, pzAuto, repeatIndx, pega, false);
		cellPage.put("pyValue",".pyBaseApplication");
		String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
		modePage1.put("clintValidAttrs",clientValidationAttributes);
		pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(propName,controlUniqueHash + "_6");
		IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
		modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
		pxErrorIdentifiers.put("pyErrorId",controlUniqueHash + "_6");
		modePage1.put("pyID","pyBaseApplication");
		controlRuntimeUtilities.generateMetadataForTooltip(modePage1, localize, ctrlTooltip, pega, tools, repeatIndx, pzAuto);
		controlRuntimeUtilities.generateMetadataForHelperTextType(modePage1, localize, ctrlHelperTextType, pega, tools, repeatIndx, pzAuto);
		controlRuntimeUtilities.generateMetadataForTextStyle(modePage1, ctrlStyle);
		controlRuntimeUtilities.generateMetadatForOfflineDefault(modePage1,runTimeParamPage, pega, tools, repeatIndx, pzAuto, paramPage);
		String tPlaceHolderType  = modePageData1.getStringIfPresent("pyPlaceholderType") != null ? modePageData1.getStringIfPresent("pyPlaceholderType") : "none";
		String placeHolder = "";
		if ("other".equals(tPlaceHolderType)) {
		placeHolder = modePageData1.getStringIfPresent("pyPlaceholder") != null ? modePageData1.getStringIfPresent("pyPlaceholder") : "none";
		}
		placeHolder = controlRuntimeUtilities.getPlaceHolder(placeHolder);
		if (placeHolder != null) {
			String placeHolderR = controlRuntimeUtilities.registerPropertyReference(placeHolder, ".pyActionPrompt", localize, tools, pzAuto, repeatIndx, pega, true);
		modePage1.put("placeholder", placeHolderR);
		}
		String anyPickerDefaultPlaceHolder = tools.getLocalizedTextForString("pycaption" , "Select..." );
		modePage1.put("anyPickerDefaultPlaceHolder",anyPickerDefaultPlaceHolder);
		modePage1.put("pyDisplayFullScreen",pyDisplayFullScreen);
		String listingWidth = "";
		String pyWidth = modePageData1.getStringIfPresent("pyWidth");
		if(pyWidth == null) {
		pyWidth = "170";
		}
		String pyWidthUnits = modePageData1.getStringIfPresent("pyWidthUnits");
		if(pyWidthUnits == null) {
		pyWidthUnits = "columns";
		}
		String pyInputWidthOptions = modePageData1.getStringIfPresent("pyInputWidthOptions");
		if(pyInputWidthOptions == null) {
		pyInputWidthOptions = "auto";
		}
		modePage1.put("pyInputWidthOptions",pyInputWidthOptions);
		modePage1.put("pyShowInputControl",pyShowInputControl);
		if("true".equals(pyShowInputControl) && "custom".equals(pyInputWidthOptions)){
		modePage1.put("pyWidth",pyWidth);
		modePage1.put("pyWidthUnits",pyWidthUnits);
		listingWidth = pyWidth;
		}
		String pyPickerWidthOptions = modePageData1.getStringIfPresent("pyPickerWidthOptions");
		if(pyPickerWidthOptions == null) {
		pyPickerWidthOptions = "";
		}
		if("custom".equals(pyPickerWidthOptions)){
		listingWidth = modePageData1.getString("pyListingWidth");
		}
		modePage1.put("listingWidth",listingWidth);
		modePage1.put("pyHighlightMatch",pyHighlightMatch);
		modePage1.put("pyMatchString",pyMatchString);
		modePage1.put("pyMaxResults",pyMaxResults);
		modePage1.put("pyMinSearch",pyMinSearch);
		boolean ignoreRequiredWhen = false;
		ignoreRequiredWhen = controlRuntimeUtilities.getWhenIdentifierMetadata(modePage1, modePageData1, controlUniqueHash, pzAuto, ignoreRequiredWhen);
		ExpressionPojo expr = controlRuntimeUtilities.setExpressionId(modePage1, ignoreRequiredWhen, modePageData1, pzAuto, controlUniqueHash, expressionId);
		if(expr != null) {
		if(expr.expression != null) {
		expression = expr.expression;
		}
		if(expr.expressionId != null) {
		expressionId = expr.expressionId;
		}
		}
		if (!StringUtils.isBlank(ctrlRunTimeSecStreamName)) {
			tools.putParamValue("runTimeSecStreamName", ctrlRunTimeSecStreamName);
		} else {
			tools.putParamValue("runTimeSecStreamName", "");
		}
		String spxUniqueStreamHash2 = getUIActionsMetaData_1();
			tools.putParamValue("runTimeSecStreamName", "");
			if(spxUniqueStreamHash2 != null && !"".equals(spxUniqueStreamHash2)){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash2,controlUniqueHash+"_"+"1" + "_9");
			modePage1.put("pyActionStringID",controlUniqueHash+"_"+"1" + "_9");
			}
			boolean is4Offline = pega_uiengine_offlinesupport.pzIsForOfflineTemplate();
			IUIComponentMetadata pyListDataSource = pzAuto.getUIComponentRuntime().createMetadata();
			pyListDataSource.put("pyListSource",pyDataSource);
			String paramsObj = "{";
			StringBuffer whenCondition = new StringBuffer();
			if("reportdefinition".equals(pyDataSource)) {
			dsPage = modePageData1.getPage(PY_LIST_DATA_SOURCE).getPage(PY_REPORT_DEFINITION_PAGE);
			IUIComponentMetadata pyReportDefinitionPage = pzAuto.getUIComponentRuntime().createMetadata();
			String pyAppliesTo = dsPage.getString("pyAppliesTo");
			String pySourceName = dsPage.getString("pySourceName");
			modePage1.put("pySourceName",pySourceName);
			modePage1.put("pyAppliesTo",pyAppliesTo);
			ClipboardProperty rdParamesPage = dsPage.getProperty("pyReportDefParams");
			IUIComponentMetadata pyReportDefParams = null;  
			boolean useParameterForSearch = "true".equals(dsPage.getString("pyUseParameterForSearch"));
			pyListDataSource.put("pyUseParameterForSearch",useParameterForSearch);
			int paramIndexWithPropRef = 1;
			if(rdParamesPage != null && rdParamesPage.size()>0){
			for(int i=0;i<rdParamesPage.size();i++){
			pyReportDefParams = pzAuto.getUIComponentRuntime().createMetadata();  
			pyEnableGrouping  = dsPage.getStringIfPresent("pyEnableGrouping") != null ? dsPage.getStringIfPresent("pyEnableGrouping") : "false";
			pyReportDefinitionPage.put("pyEnableGrouping",pyEnableGrouping);
			if("true".equals(pyEnableGrouping)) {
			pyGroupLabel  = dsPage.getStringIfPresent("pyGroupLabel") != null ? dsPage.getStringIfPresent("pyGroupLabel") : "false";
			controlRuntimeUtilities.registerPropertyReference("pyGroupLabel", "pyGroupLabel", localize, tools, pzAuto, repeatIndx, pega, false);
			pyReportDefinitionPage.put("pyGroupLabel",pyGroupLabel);
			}
			String paramName = rdParamesPage.getStringValue(i+1, "pyName");
			String paramValue = rdParamesPage.getStringValue(i+1, "pyValue");
			String useForSearchParam = rdParamesPage.getStringValue(i+1, "pyUseForSearchParam");
			if(!"".equals(paramName)){
			if ("true".equals(useForSearchParam)) {
			 paramValue =  controlRuntimeUtilities.getFieldValueorPropValue(".pyBaseApplication", "pyCaption", false, tools, pzAuto, repeatIndx);
			} else {
			if (!paramValue.toLowerCase().startsWith("param.") && StringUtils.isLiteral(paramValue)) {
			if (paramIndexWithPropRef > 1) {
			paramsObj += ",";
			}
			paramsObj += "\"" + "AP_RD_param"+ paramIndexWithPropRef + "\" : \"" + paramValue.replace("\"", "") + "\"";
			paramIndexWithPropRef++;
			if(paramValue.startsWith(".")) {
			ctPropRefs.add(tools.getStepPage().getReference()+ paramValue);
			} else {
			ctPropRefs.add(paramValue);
			}
			}
			 paramValue=  controlRuntimeUtilities.getFieldValueorPropValue(paramValue, "pyCaption", false, tools, pzAuto, repeatIndx);
			}
			pyReportDefParams.put("pyName",paramName);
			pyReportDefParams.put("pyValue",paramValue);
			if (useParameterForSearch) {
			pyReportDefParams.put("pyUseForSearchParam",useForSearchParam);
			}
			pyReportDefinitionPage.addMetadataInArray("pyReportDefParams",pyReportDefParams);
			}
			}
			}
			ClipboardProperty additionalFields = dsPage.getProperty("pyAdditionalFields");
			if (additionalFields != null && additionalFields.size() > 0) {
			IUIComponentMetadata pyAdditionalField = null;  
			for(int i=0; i < additionalFields.size(); i++) {
			pyAdditionalField = pzAuto.getUIComponentRuntime().createMetadata();  
			String defaultAddParamValue="false";
			String defaultAssociatedPropValue="";
			if(i==0) {
			defaultAddParamValue = "true";
			defaultAssociatedPropValue="Associated property";
			};
			String displayProperty = additionalFields.getStringValue(i+1, "pyDisplayProperty").replaceAll("^\"|\"$", "");
			pyAdditionalField.put("pyDisplayProperty",displayProperty);
			String useForSearch = (additionalFields.getStringValue(i+1, "pyUseForSearch") != null && !"".equals(additionalFields.getStringValue(i+1, "pyUseForSearch"))) ? additionalFields.getStringValue(i+1, "pyUseForSearch") : defaultAddParamValue ;
			pyAdditionalField.put("pyUseForSearch",useForSearch);
			String show = (additionalFields.getStringValue(i+1, "pyShow") != null && !"".equals(additionalFields.getStringValue(i+1, "pyShow"))) ? additionalFields.getStringValue(i+1, "pyShow") : defaultAddParamValue ;
			pyAdditionalField.put("pyShow",show);
			String pySetValueOnSelect = (additionalFields.getStringValue(i+1, "pySetValueOnSelect") != null && !"".equals(additionalFields.getStringValue(i+1, "pySetValueOnSelect"))) ? additionalFields.getStringValue(i+1, "pySetValueOnSelect") : defaultAddParamValue ;
			pyAdditionalField.put("pySetValueOnSelect",pySetValueOnSelect);
			if ("true".equalsIgnoreCase(pySetValueOnSelect)) {
			String pyPropertyTarget="";
			pyPropertyTarget = (additionalFields.getStringValue(i+1, "pyPropertyTarget") != null && !"".equals(additionalFields.getStringValue(i+1, "pyPropertyTarget"))) ? additionalFields.getStringValue(i+1, "pyPropertyTarget") : defaultAssociatedPropValue ;
			if ("Associated property".equalsIgnoreCase(pyPropertyTarget)) {
			pyAdditionalField.put("pyPropertyTarget",pyPropertyTarget);
			} else {
			if(!"".equals(pyPropertyTarget)){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(pyPropertyTarget);
			pyAdditionalField.put("pyPropertyTarget",pyPropertyTarget);
			}
			}
			ctPropRefs.add("pyCell.pyModes(1).pyListDataSource.pyReportDefinitionPage.pyAdditionalFields("+(i+1)+").pyPropertyTarget");
			}
			pyReportDefinitionPage.addMetadataInArray("pyAdditionalFields",pyAdditionalField);
			}
			}
			pyListDataSource.putMetadata("pyReportDefinitionPage",pyReportDefinitionPage);
			
			
			}
			 	if("datapage".equals(pyDataSource)){  
			dsPage = modePageData1.getPage("pyListDataSource").getPage("pyDataPage");
			String dataPage = dsPage.getString("pySourceName");
			 if(dsPage != null) { 
			modePage1.put("pySourceName",dataPage);
			if(is4Offline) {
			tools.findPage( dataPage );
			}
			 ClipboardProperty dsParamPage = dsPage.getProperty(PY_DATA_PAGE_PARAMS); 
			IUIComponentMetadata pyDataPage = pzAuto.getUIComponentRuntime().createMetadata();
			IUIComponentMetadata pyDataPageParams = null;  
			pyEnableGrouping  = dsPage.getStringIfPresent("pyEnableGrouping") != null ? dsPage.getStringIfPresent("pyEnableGrouping") : "false";
			pyDataPage.put("pyEnableGrouping",pyEnableGrouping);
			if("true".equals(pyEnableGrouping)) {
			pyGroupLabel  = dsPage.getStringIfPresent("pyGroupLabel") != null ? dsPage.getStringIfPresent("pyGroupLabel") : "false";
			controlRuntimeUtilities.registerPropertyReference("pyGroupLabel", "pyGroupLabel", localize, tools, pzAuto, repeatIndx, pega, false);
			pyDataPage.put("pyGroupLabel",pyGroupLabel);
			}
			try{
			controlRuntimeUtilities.buildParameterPage( dsParamPage, "declarePageParams", whenCondition, tools); 
			}catch(Exception e){}
			boolean useParameterForSearch = "true".equals(dsPage.getString("pyUseParameterForSearch")); 
			pyListDataSource.put("pyUseParameterForSearch",useParameterForSearch);
			if(dsParamPage != null && dsParamPage.size()>0) { 
			boolean hasPropInDPParams = false; 
			try{ 
			for(int i=0;i<dsParamPage.size();i++) {  
			pyDataPageParams = pzAuto.getUIComponentRuntime().createMetadata();  
			String paramName =  dsParamPage.getStringValue(i+1, "pyName")  ;
			if(paramName == null) {
			paramName = "";
			}
			String paramValue =  dsParamPage.getStringValue(i+1, "pyValue") ;
			if(paramValue == null) {
			paramValue = "";
			}
			String useForSearchParam = dsParamPage.getStringValue(i+1, "pyUseForSearchParam") ;
			if(useForSearchParam == null) {
			useForSearchParam = "";
			}
			if(!"".equals(paramName)){ 
			 if ("true".equals(useForSearchParam)) {
			 paramValue =  controlRuntimeUtilities.getFieldValueorPropValue(".pyBaseApplication", "pyCaption", false, tools, pzAuto, repeatIndx);
				} else { 
			 if (!paramValue.toLowerCase().startsWith("param.")){
			 	if (hasPropInDPParams){
			 	paramsObj += ",";
			 }
			 	if( StringUtils.isLiteral(paramValue) ) { 
			 	paramValue = paramValue.replaceAll("^\"|\"$", ""); 
			 	paramsObj += "\"" + paramName + "\" : \"Literal_" + paramValue + "\""; 
			 	} else {
			 paramsObj += "\"" + paramName + "\" : \"" + paramValue.replaceAll("\"", "\\\"") + "\"";
			 	if(paramValue.startsWith(".")) {
			ctPropRefs.add(tools.getStepPage().getReference()+" " + paramValue + "");
				} else { 
			ctPropRefs.add(""+ paramValue + "");
			}  }  
			 	hasPropInDPParams = true; } 
			 paramValue =  controlRuntimeUtilities.getFieldValueorPropValue(paramValue, "pyCaption", false, tools, pzAuto, repeatIndx);
			 } 
			pyDataPageParams.put("pyName",paramName);
			pyDataPageParams.put("pyValue",paramValue);
			 	if (useParameterForSearch) { 
			pyDataPageParams.put("pyUseForSearchParam",useForSearchParam);
			 } 
			pyDataPage.addMetadataInArray("pyDataPageParams",pyDataPageParams);
			 } 
			 } 
			}catch(Exception e){}
			 } 
			ClipboardProperty additionalFields = dsPage.getProperty("pyAdditionalFields");
			if (additionalFields != null && additionalFields.size() > 0) {
			IUIComponentMetadata pyAdditionalField = null;  
			for(int i=0; i < additionalFields.size(); i++) {
			pyAdditionalField = pzAuto.getUIComponentRuntime().createMetadata();  
			String defaultAddParamValue="false";
			String defaultAssociatedPropValue="";
			if(i==0) {
			defaultAddParamValue = "true";
			defaultAssociatedPropValue="Associated property";
			};
			String displayProperty = additionalFields.getStringValue(i+1, "pyDisplayProperty").replaceAll("^\"|\"$", "");
			pyAdditionalField.put("pyDisplayProperty",displayProperty);
			String useForSearch = (additionalFields.getStringValue(i+1, "pyUseForSearch") != null && !"".equals(additionalFields.getStringValue(i+1, "pyUseForSearch"))) ? additionalFields.getStringValue(i+1, "pyUseForSearch") : defaultAddParamValue ;
			pyAdditionalField.put("pyUseForSearch",useForSearch);
			String show = (additionalFields.getStringValue(i+1, "pyShow") != null && !"".equals(additionalFields.getStringValue(i+1, "pyShow"))) ? additionalFields.getStringValue(i+1, "pyShow") : defaultAddParamValue ;
			pyAdditionalField.put("pyShow",show);
			String pySetValueOnSelect = (additionalFields.getStringValue(i+1, "pySetValueOnSelect") != null && !"".equals(additionalFields.getStringValue(i+1, "pySetValueOnSelect"))) ? additionalFields.getStringValue(i+1, "pySetValueOnSelect") : defaultAddParamValue ;
			pyAdditionalField.put("pySetValueOnSelect",pySetValueOnSelect);
			if ("true".equalsIgnoreCase(pySetValueOnSelect)) {
			String pyPropertyTarget="";
			pyPropertyTarget = (additionalFields.getStringValue(i+1, "pyPropertyTarget") != null && !"".equals(additionalFields.getStringValue(i+1, "pyPropertyTarget"))) ? additionalFields.getStringValue(i+1, "pyPropertyTarget") : defaultAssociatedPropValue ;
			if ("Associated property".equalsIgnoreCase(pyPropertyTarget)) {
			pyAdditionalField.put("pyPropertyTarget",pyPropertyTarget);
			} else {
			if(!"".equals(pyPropertyTarget)){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(pyPropertyTarget);
			pyAdditionalField.put("pyPropertyTarget",pyPropertyTarget);
			}
			}
			ctPropRefs.add("pyCell.pyModes(1).pyListDataSource.pyDataPage.pyAdditionalFields("+(i+1)+").pyPropertyTarget");
			}
			pyDataPage.addMetadataInArray("pyAdditionalFields",pyAdditionalField);
			}
			}
			pyListDataSource.putMetadata("pyDataPage",pyDataPage);
			 } 
			 } 
			if("pageList".equals(pyDataSource)) {
			dsPage = modePageData1.getPage(PY_LIST_DATA_SOURCE).getPage(PY_CB_PAGE);
			String cbPage = dsPage.getString("pySourceName");;
			if(cbPage == null) {
			cbPage = "";
			}
			if(dsPage != null) { 
			modePage1.put("pySourceName",cbPage);
			IUIComponentMetadata pyCBPage = pzAuto.getUIComponentRuntime().createMetadata();
			 boolean pyRunPreDT = dsPage.getBoolean("pyRunPreDT"); 
			String pyDTName = dsPage.getStringIfPresent("pyDTName");;
			if(pyDTName == null) {
			pyDTName = "";
			}
			boolean flag = false; 
			 if(pyRunPreDT && pyDTName != null && !"".equals(pyDTName)){ 
			pyCBPage.put("pyListPreDT",pyDTName);
			 ClipboardProperty dtParamsPage = dsPage.getProperty(PY_DT_PARAMS); 
			IUIComponentMetadata pyDTParams = null;  
			 for (int i = 0; i < dtParamsPage.size(); i++) { 
			String paramName = dtParamsPage.getStringValue(i+1, "pyName");;
			if(paramName == null) {
			paramName = "";
			}
			String paramValue = dtParamsPage.getStringValue(i+1, "pyValue");;
			if(paramValue == null) {
			paramValue = "";
			}
			 if (!"".equals(paramName) && !paramValue.toLowerCase().startsWith("param.")) {
			 if( StringUtils.isLiteral(paramValue) ) { 
			 if (flag){ 
			 paramsObj += ","; 
			 } 
			 paramsObj += "\\\"" + "DT_" + paramName + "\\\" : \\\"" + paramValue + "\\\""; 
			 flag = true; 
			 if(paramValue.startsWith(".")) { 
			ctPropRefs.add(tools.getStepPage().getReference()+"" + paramValue + "");
			 } else { 
			ctPropRefs.add(""+ paramValue + "");
			 } 
			 } 
			pyDTParams = pzAuto.getUIComponentRuntime().createMetadata();  
			 paramValue =  controlRuntimeUtilities.getFieldValueorPropValue(paramValue, "pyCaption", false, tools, pzAuto, repeatIndx);
			pyDTParams.put("pyName",paramName);
			pyDTParams.put("pyValue",paramValue);
			pyCBPage.addMetadataInArray("pyDTParams",pyDTParams);
			 } 
			 }
			 }
			 boolean pyRunPreActivity = dsPage.getBoolean("pyRunPreActivity"); 
			String pyListPreActivity = dsPage.getString("pyListPreActivity");;
			if(pyListPreActivity == null) {
			pyListPreActivity = "";
			}
			 if(pyRunPreActivity && pyListPreActivity != null && !"".equals(pyListPreActivity)){ 
			pyCBPage.put("pyListPreActivity",pyListPreActivity);
			 ClipboardProperty actParamsPage = dsPage.getProperty("pyParams"); 
			IUIComponentMetadata pyActParams = null;  
			 for (int i = 0; i < actParamsPage.size(); i++) { 
			String paramName = actParamsPage.getStringValue(i+1, "pyName");;
			if(paramName == null) {
			paramName = "";
			}
			String paramValue = actParamsPage.getStringValue(i+1, "pyValue");;
			if(paramValue == null) {
			paramValue = "";
			}
			 if (!"".equals(paramName) && !paramValue.toLowerCase().startsWith("param.")) { 
			 if( StringUtils.isLiteral(paramValue) ) { 
			 if (flag){ 
			 paramsObj += ","; 
			 } 
			 paramsObj += "\\\"" + "ACT_" + paramName + "\\\" : \\\"" + paramValue + "\\\""; 
			 flag = true; 
			if(paramValue.startsWith(".")) { 
			ctPropRefs.add(tools.getStepPage().getReference()+"" + paramValue + "");
			 } else { 
			ctPropRefs.add(""+ paramValue + "");
			 } 
			 } 
			pyActParams = pzAuto.getUIComponentRuntime().createMetadata();  
			 paramValue =  controlRuntimeUtilities.getFieldValueorPropValue(paramValue, "pyCaption", false, tools, pzAuto, repeatIndx);
			pyActParams.put("pyName",paramName);
			pyActParams.put("pyValue",paramValue);
			pyCBPage.addMetadataInArray("pyActParams",pyActParams);
			 } 
			 } 
			 } 
			ClipboardProperty additionalFields = dsPage.getProperty("pyAdditionalFields");
			if (additionalFields != null && additionalFields.size() > 0) {
			IUIComponentMetadata pyAdditionalField = null;  
			for(int i=0; i < additionalFields.size(); i++) {
			pyAdditionalField = pzAuto.getUIComponentRuntime().createMetadata();  
			String defaultAddParamValue="false";
			String defaultAssociatedPropValue="";
			if(i==0) {
			defaultAddParamValue = "true";
			defaultAssociatedPropValue="Associated property";
			};
			String displayProperty = additionalFields.getStringValue(i+1, "pyDisplayProperty").replaceAll("^\"|\"$", "");
			pyAdditionalField.put("pyDisplayProperty",displayProperty);
			String useForSearch = (additionalFields.getStringValue(i+1, "pyUseForSearch") != null && !"".equals(additionalFields.getStringValue(i+1, "pyUseForSearch"))) ? additionalFields.getStringValue(i+1, "pyUseForSearch") : defaultAddParamValue ;
			pyAdditionalField.put("pyUseForSearch",useForSearch);
			String show = (additionalFields.getStringValue(i+1, "pyShow") != null && !"".equals(additionalFields.getStringValue(i+1, "pyShow"))) ? additionalFields.getStringValue(i+1, "pyShow") : defaultAddParamValue ;
			pyAdditionalField.put("pyShow",show);
			String pySetValueOnSelect = (additionalFields.getStringValue(i+1, "pySetValueOnSelect") != null && !"".equals(additionalFields.getStringValue(i+1, "pySetValueOnSelect"))) ? additionalFields.getStringValue(i+1, "pySetValueOnSelect") : defaultAddParamValue ;
			pyAdditionalField.put("pySetValueOnSelect",pySetValueOnSelect);
			if ("true".equalsIgnoreCase(pySetValueOnSelect)) {
			String pyPropertyTarget="";
			pyPropertyTarget = (additionalFields.getStringValue(i+1, "pyPropertyTarget") != null && !"".equals(additionalFields.getStringValue(i+1, "pyPropertyTarget"))) ? additionalFields.getStringValue(i+1, "pyPropertyTarget") : defaultAssociatedPropValue ;
			if ("Associated property".equalsIgnoreCase(pyPropertyTarget)) {
			pyAdditionalField.put("pyPropertyTarget",pyPropertyTarget);
			} else {
			if(!"".equals(pyPropertyTarget)){
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addProperty(pyPropertyTarget);
			pyAdditionalField.put("pyPropertyTarget",pyPropertyTarget);
			}
			}
			ctPropRefs.add("pyCell.pyModes(1).pyListDataSource.pyCBPage.pyAdditionalFields("+(i+1)+").pyPropertyTarget");
			}
			pyCBPage.addMetadataInArray("pyAdditionalFields",pyAdditionalField);
			}
			}
			pyEnableGrouping  = dsPage.getStringIfPresent("pyEnableGrouping") != null ? dsPage.getStringIfPresent("pyEnableGrouping") : "false";
			pyCBPage.put("pyEnableGrouping",pyEnableGrouping);
			if("true".equals(pyEnableGrouping)) {
			pyGroupLabel  = dsPage.getStringIfPresent("pyGroupLabel") != null ? dsPage.getStringIfPresent("pyGroupLabel") : "false";
			controlRuntimeUtilities.registerPropertyReference("pyGroupLabel", "pyGroupLabel", localize, tools, pzAuto, repeatIndx, pega, false);
			pyCBPage.put("pyGroupLabel",pyGroupLabel);
			}
			pyListDataSource.putMetadata("pyCBPage",pyCBPage);
			 } 
			 } 
			paramsObj += "}";
			String anypickerDataAttr = pzAuto.getUIComponentRuntime().getRepeatingReference(tools.getStepPage().getReference(),"",false);
			String dataAttributes = "[\"EXPANDEDSubSectionpzDevelopmentAdvanced34_pyBaseApplication\"," + pyMinSearch + "," + listingWidth + "," + paramsObj + ", \"" + anypickerDataAttr + "\" , " + pyMaxResults + " , \"" + pyEnableCache + "\"]";
			modePage1.put("dataAttributes",dataAttributes);
			modePage1.putMetadata("pyListDataSource",pyListDataSource);
			String activeProp = propName;
			String originalPropValue = activeProp;
			boolean bLocalizedTemp = false;
			String pyContent =  modePageData2.getStringIfPresent("pyContent") != null ? modePageData2.getString("pyContent") :"associated";
			String pyFormatType_RO =  modePageData2.getStringIfPresent("pyFormatType") != null ? modePageData2.getString("pyFormatType") :"text";
			boolean bLocalize = paramPage.getBoolean("bLocalize");
			String pyObfuscated_RO =  modePageData2.getStringIfPresent("pyObfuscated") != null ? modePageData2.getString("pyObfuscated") :"false";
			if (!StringUtils.isBlank(pyContent) && "different".equalsIgnoreCase(pyContent)) {
				 activeProp = modePageData2.getString("pyDifferentProperty");
			}
			if (!StringUtils.isBlank(pyContent) && "constant".equalsIgnoreCase(pyContent)) {
				 activeProp = modePageData2.getString("pyConstant");
				 activeProp = activeProp.replaceAll("^\"(.*)\"$", "$1");
				 if (bLocalize) {
				 bLocalizedTemp = true;
			}
			}
			if (!StringUtils.isBlank(pyContent) && "localizevalue".equals(pyContent)) {
				 if (bLocalize) {
				 bLocalizedTemp = true;
			}
			}
			automationId = runTimeParamPage.getString("pyAutomationID");
			cellPage.put("automationId",pzCell.getTestIdIfEnabled(automationId,true));
			String pyValueR = "";
			String pyValueOrig = "";
			pyValueOrig = controlRuntimeUtilities.registerPropertyReference(originalPropValue, ".pyCaption", bLocalizedTemp, tools, pzAuto, repeatIndx, pega, true);
			if ("constant".equalsIgnoreCase(pyContent)) {
			pyValueR = controlRuntimeUtilities.registerLiteral(activeProp, ".pyCaption", bLocalizedTemp, pega,tools, repeatIndx, pzAuto, true);
			}else if("fieldvalue".equalsIgnoreCase(pyContent)){
			String pyFieldValueRef = modePageData2.getStringIfPresent("pyFieldValueRef");
			pyValueR = controlRuntimeUtilities.getParametersAppendedFieldValue(runTimeParamPage, pyFieldValueRef , "pyFieldValueRef", ".pyCaption", tools, bLocalize);
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(pyValueR ,"pyCaption" );
			} else {
			if( isDisplayTextWithParam ){
			pyValueR = displayTextParamValue;
			pyValueOrig = "";
			pyContent = "constant";
			}else{
			pyValueR = controlRuntimeUtilities.registerPropertyReference(activeProp, ".pyCaption", bLocalizedTemp, tools, pzAuto, repeatIndx, pega, true);
			}
			}
			cellPage.put("pyValue",pyValueOrig);
			cellPage.put("pyValueRO",pyValueR);
			modePage2.put("pyContent",pyContent);
			String pyStyleNameOther = modePageData1.getString("pyStyleNameOther").toLowerCase().replace(" ", "_");
			modePage2.put("styleOther",pyStyleNameOther);
			String pyAutoPrepend = "";
			String pyAutoAppend = "";
			 pyAutoPrepend = modePageData2.getStringIfPresent("pyAutoPrepend");
			 pyAutoAppend = modePageData2.getStringIfPresent("pyAutoAppend");
			if(pyAutoPrepend == null){
			pyAutoPrepend = "";
			}
			if(pyAutoAppend == null){
			pyAutoAppend = "";
			}
			if(pyAutoPrepend.startsWith("param.") || pyAutoPrepend.startsWith("Param.")){
			pyAutoPrepend = tools.getLocalizedTextForString("pyCaption" , tools.getParamValue(pyAutoPrepend.substring(pyAutoPrepend.indexOf(".")+1)));
			}else{
			pyAutoPrepend = controlRuntimeUtilities.getParametersAppendedFieldValue(runTimeParamPage, pyAutoPrepend , "pyAutoPrepend", ".pyCaption", tools, bLocalize);
			pyAutoPrepend = controlRuntimeUtilities.registerPropertyReference(pyAutoPrepend, ".pyCaption", bLocalize, tools, pzAuto, repeatIndx, pega, true);
			}
			if(pyAutoAppend.startsWith("param.") || pyAutoAppend.startsWith("Param.")){
			pyAutoAppend = tools.getLocalizedTextForString("pyCaption" , tools.getParamValue(pyAutoAppend.substring(pyAutoAppend.indexOf(".")+1)));
			}else{
			pyAutoAppend = controlRuntimeUtilities.getParametersAppendedFieldValue(runTimeParamPage, pyAutoAppend , "pyAutoAppend", ".pyCaption", tools, bLocalize);
			pyAutoAppend = controlRuntimeUtilities.registerPropertyReference(pyAutoAppend, ".pyCaption", bLocalize, tools, pzAuto, repeatIndx, pega, true);
			}
			modePage2.put("pyAutoPrepend",pyAutoPrepend);
			modePage2.put("pyAutoAppend",pyAutoAppend);
			modePage2.put("pyFormatType",pyFormatType_RO);
			String showReadonlyValidation = modePageData2.getStringIfPresent("pyReadonlyValidation");
			if(StringUtils.isNotBlank(showReadonlyValidation)) {
			modePage2.put("pyReadonlyValidation",showReadonlyValidation);
			}
			if (!"".equals(pyFormatType_RO) && !"none".equals(pyFormatType_RO) && "true".equals(pyObfuscated_RO)) {
			String pyObfuscatedWhen = modePageData2.getStringIfPresent("pyObfuscatedWhenCond");
			String strObfuscatedWhenCode = paramPage.getStringIfPresent("pyObfuscatedWhenCode_RO");
			controlRuntimeUtilities.registerObfuscatedWhen(modePage2, pyObfuscated_RO, pyObfuscatedWhen, strObfuscatedWhenCode,"","", controlUniqueHash, pzAuto);
			}
			if (!StringUtils.isBlank(ctrlRunTimeSecStreamName)) {
				tools.putParamValue("runTimeSecStreamName", ctrlRunTimeSecStreamName);
			} else {
				tools.putParamValue("runTimeSecStreamName", "");
			}
			String spxUniqueStreamHash3 = getUIActionsMetaData_1();
				tools.putParamValue("runTimeSecStreamName", "");
				if(spxUniqueStreamHash3 != null && !"".equals(spxUniqueStreamHash3)){
				pzAuto.getUIComponentRuntime().getRuntimeContextTree().addActionString(spxUniqueStreamHash3,controlUniqueHash+"_"+"2" + "_9");
				modePage2.put("pyActionStringID",controlUniqueHash+"_"+"2" + "_9");
				}
				cellPage.addMetadataInArray("pyModes",modePage1);
				cellPage.addMetadataInArray("pyModes",modePage2);
				metadataPage.putMetadata("pyCell",cellPage);
				ctrlComponent.addAdditionalScripts("pxDisplayText","pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
				ctrlComponent.addDependentScripts("pzpega_ui_template_anypicker.js","pzpega_ui_template_anypicker_results.js","pzpega_control_anypicker.js");
				ctrlComponent.beginComponent("pxAnyPicker",metadataPage);
				ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
				tools.putParamValue("isControlEditableOriginal", true);
				ctrlComponent.endComponent();
				}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");					
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxAnyPicker");
		}					String atmtionID = "";
					atmtionID = controlRuntimeUtilities.getAutomationID(runTimeParamPage, pzSection);
					String spantag = "";

	spantag += ((pzAuto.isAccessible() && (paramPage.getStringIfPresent("hasReadOnlyBehaviors") == null))?"tabindex='0' ":"");					spantag += atmtionID;
					String classValue = controlRuntimeUtilities.getClassForTextStyle(textStyle1, modePageData2.getStringIfPresent("pyTextAlign"), false, modePageData2.getStringIfPresent("pyFormatType"));
					if(classValue != null) {
					spantag += classValue;
					}
if(tools.getParamValue("bRDLShowDetails") != null && "true".equals(tools.getParamValue("bRDLShowDetails"))){
	 String readonlyContentType =  modePageData2.getStringIfPresent("pyContent");
	 if(readonlyContentType == null || StringUtils.isBlank(readonlyContentType) || !"constant".equalsIgnoreCase(readonlyContentType)) {
		 spantag += "data-propref='" + sEntryHandle + "'" ;
	}}tools.appendString("<span " + spantag + ">");
	controlRuntimeUtilities.setActivePropertyForReadOnly(modePageData2, tools);if(pzAuto.getUIComponentRuntime().getRuntimeContextTree().beginNonTemplate(controlUniqueHash+ "_7")){String pyTextAlign = modePageData2.getStringIfPresent("pyTextAlign");					String pyFormatType = modePageData2.getStringIfPresent("pyFormatType");
					if(pyFormatType == null){
					pyFormatType = "text";
					}
					if(pyTextAlign == null) {
					pyTextAlign = "Left";
					}
					boolean isActionConfigured = false;
					boolean willHaveTag = isActionConfigured || "number".equals(pyFormatType);
					if(willHaveTag){

		textIncludes_1();					
		tools.appendString("\n<span "+ controlRuntimeUtilities.getAutomationID(runTimeParamPage, pzSection)+ " data-ctl='Text' ");
					
		if(pzAuto.isAccessible() || paramPage.getStringIfPresent("hasReadOnlyBehaviors").equalsIgnoreCase("true")){
					tools.appendString(" tabindex='0' ");
					
		}
inclAction_1();
					
		tools.appendString(controlRuntimeUtilities.getTextAlign(pyTextAlign));

		tools.appendString(" >");inclFormattedVal_1(runTimeParamPage, isSecuredProp, activePropValue , isDisplayTextWithParam , displayTextParamName);

		tools.appendString("</span>");					} else {
inclFormattedVal_1(runTimeParamPage, isSecuredProp, activePropValue , isDisplayTextWithParam , displayTextParamName);
					}

		 tools.putParamValue("REQUIRED_WHEN","");
		 tools.putParamValue("REQUIRED_WHEN_ROC","");}pzAuto.getUIComponentRuntime().getRuntimeContextTree().endNonTemplateComponent();
	tools.appendString("</span>");					String readOnlyvalidation = modePageData2.getStringIfPresent("pyReadonlyValidation");
					if (readOnlyvalidation != null && "true".equals(readOnlyvalidation)) {
					String this_layoutType = paramPage.getString("pyLayoutFormatType");
					if (this_layoutType == null || !this_layoutType.toUpperCase().equals("SIMPLELAYOUT")) {
					this_layoutType = "";
					}
					pega_uiengine_pzcontrol.pzAddMessages(tools, this_layoutType, "true");
					}
					
	}
					tools.putParamValue("doAutoFormatting", "false");
					tools.putParamValue("isControlEditableOriginal", true);
if(pegaValidation != null) {
	com.pega.pegarules.priv.factory.StringBufferFactory.release(pegaValidation);
}
}


	tools.putActive(propActivePrev); 					} catch (Exception e) {

					
	 oLog.error(e.getMessage());

	 if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'					&& pzAuto.getUIComponentRuntime().getRuntimeContextTree().isLiveDesignViewMode()){


		IUIComponentMetadata metadata = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		metadata.put("cellInfo", "Base application");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }						}

}
				}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

				public boolean isDirectiveStream() {
					return true;
				}
private static final String oDependencies [] = {
	"Rule-HTML-Property:PXANYPICKER"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PXANYPICKER","Rule-HTML-Property","",false,"","Pega-Gadgets","08-04-01","RULE-HTML-PROPERTY PXANYPICKER #20190806T142222.318 GMT","PXANYPICKER",true,false,"ABSOLUTE_CLASSLESS",-1355001801)
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
//	RULE-HTML-PROPERTY PXANYPICKER #20190806T142222.318 GMT:

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION HARNESS PZGENERATEINCLUDE #20180713T133339.786 GMT:20180713T133339.786 GMT
//	RULE-UTILITY-FUNCTION HARNESSVALIDATE PZVALIDATECONTROL--(CLIPBOARDPAGE,CLIPBOARDPROPERTY) #20190930T091802.162 GMT:20190930T091802.162 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECALCULATEDVALUE--(CLIP25E448149E37EDE02190B4A70F76AB5B #20210527T114234.915 GMT:20210527T114234.915 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATECONTROLACTION--(CLIPBOB48B86F24D2B45DD052F71A16FDC5D4F #20230618T001619.396 GMT:20230618T001619.396 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGENERATEFORMAT--(STRING,CLIPBOE3B9AB14D60C9BC144A59D967BEF48D3 #20231111T205726.843 GMT:20231111T205726.843 GMT
//	RULE-UTILITY-FUNCTION PZCONTROL PZGETPROPERTYCLASS #20180713T133346.414 GMT:20180713T133346.414 GMT
//	RULE-UTILITY-FUNCTION STRING STRIPSPECIALCHARS #20180713T131442.797 GMT:20180713T131442.797 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f13f2ca4c3292882d586b68a16b3a31c";
	}

	public String getDefinitionAppliesToClass() {
		return "null";
	}
public String getAspect() {
return "Stream";
}
public String 
getUIActionsMetaData_1() {
StringBuilder actionsStringBuilder = tools.pushStreamBody();
	((PegaStreamAPI)tools).disableDirectStreaming();
	String returnString = actionsStringBuilder.toString();
	tools.popStreamBody();
	return returnString;
}
public void inclFormattedVal_1(ClipboardPage runTimeParamPage, boolean isSecuredProp, String activePropValue, boolean isDisplayTextWithParam, String displayTextParamName) {ClipboardPage modePage2 = runTimeParamPage.getProperty("pyModes").getPageValue(2);
ClipboardPage paramPage = runTimeParamPage.getPage("runTimeParamsPage");
String ctrlContent = modePage2.getStringIfPresent("pyContent");
if(ctrlContent == null){
ctrlContent = "associated";
}
boolean bLocalize = paramPage.getBoolean("bLocalize");
String valueForGenerateFormat = "";
if("constant".equals(ctrlContent)){
String ctrlConstant = modePage2.getStringIfPresent("pyConstant");
if (ctrlConstant != null && !ctrlConstant.equals("")) {
if (ctrlConstant.charAt(0) == '"')
ctrlConstant = ctrlConstant.substring(1);
if (ctrlConstant.charAt(ctrlConstant.length() - 1) == '"')
ctrlConstant = ctrlConstant.substring(0, ctrlConstant.length() - 1);
ctrlConstant = ctrlConstant.replaceAll("\"", "\\\"");
}
valueForGenerateFormat = ctrlConstant;
} else if ("fieldvalue".equals(ctrlContent)) {
String pyFieldValueRef = modePage2.getStringIfPresent("pyFieldValueRef"); 
valueForGenerateFormat = tools.getControlUtilities().getParametersAppendedFieldValue(runTimeParamPage, pyFieldValueRef , "pyFieldValueRef", ".pyCaption", tools, bLocalize);
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(valueForGenerateFormat, ".pyCaption");
} else {
if("caption".equals(ctrlContent)){
valueForGenerateFormat = pega_uiengine_pzcontrol.pzGetCaptionValue("associated", "null","null", "", "", "", "null", "null", true,(PegaStreamAPI) tools);
} else {
valueForGenerateFormat = pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
if(isSecuredProp){
valueForGenerateFormat = activePropValue;
}
if(isDisplayTextWithParam){
valueForGenerateFormat = tools.getParamValue(displayTextParamName);
valueForGenerateFormat = tools.getLocalizedTextForString("pyCaption", valueForGenerateFormat);
}
}
}
String formatType = modePage2.getStringIfPresent("pyFormatType");
if(formatType == null){
formatType = "text";
}
String pyHighlight = modePage2.getStringIfPresent("pyHighlight");
if(pyHighlight == null){
pyHighlight = "";
}
boolean isCommonFormat = pyHighlight != null && !"".equals(pyHighlight.trim()) ? true : false;
HashStringMap commonData = new HashStringMap();
if(isCommonFormat){
String highlightValue = "";
if(!"none".equals(formatType)){
highlightValue = tools.getControlUtilities().getHighlightValue(pyHighlight);
if(pyHighlight != null && !"".equals(pyHighlight.trim())){
commonData.put("highlight",highlightValue);
}
}
}

		pega.checkIfActivePropertyMissing();boolean obfuscateWhenCondition = false;
String obfuscatedWhenOrExpCond = modePage2.getStringIfPresent("pyObfuscatedWhenCond");
String isObfuscatedChecked = modePage2.getStringIfPresent("pyObfuscated");
if(isObfuscatedChecked == null){
isObfuscatedChecked = "false";
}
if(obfuscatedWhenOrExpCond == null){
obfuscatedWhenOrExpCond = "false";
}
if("true".equals(isObfuscatedChecked) && obfuscatedWhenOrExpCond!=null){
obfuscatedWhenOrExpCond = obfuscatedWhenOrExpCond.replace("\"","'");
} else if("true".equals(isObfuscatedChecked)){
obfuscatedWhenOrExpCond="true";
} else {
obfuscatedWhenOrExpCond="false";
}
String obfuscateWhenExprCode = paramPage.getStringIfPresent("pyObfuscatedWhenCode_RO");
obfuscateWhenCondition = pzAuto.handleEvaluateWhen(obfuscateWhenExprCode, StringUtils.escapeIntoJavaString(obfuscatedWhenOrExpCond),"cell","disable");
String pyAutoAppend = "";
String pyAutoPrepend = "";
if("text".equals(formatType)){
pyAutoAppend = modePage2.getStringIfPresent("pyAutoAppend");
pyAutoPrepend = modePage2.getStringIfPresent("pyAutoPrepend");
if(pyAutoAppend == null){
pyAutoAppend = "";
}
if(pyAutoPrepend == null){
pyAutoPrepend = "";
}
if(pyAutoAppend.startsWith("Param.") || pyAutoAppend.startsWith("param.")){
pyAutoAppend = tools.getParamValue(pyAutoAppend.substring(pyAutoAppend.indexOf(".")+1));
pyAutoAppend = tools.getLocalizedTextForString("pyCaption", pyAutoAppend);
}else{
 pyAutoAppend = tools.getControlUtilities().getParametersAppendedFieldValue(runTimeParamPage, pyAutoAppend , "pyAutoAppend", ".pyCaption", tools, bLocalize); 
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(pyAutoAppend, ".pyCaption");
pyAutoAppend = tools.getControlUtilities().getPropertyOrLiteralValue(pyAutoAppend,tools, false);
}
if(pyAutoPrepend.startsWith("Param.") || pyAutoPrepend.startsWith("param.")){
pyAutoPrepend = tools.getParamValue(pyAutoPrepend.substring(pyAutoPrepend.indexOf(".")+1));
pyAutoPrepend = tools.getLocalizedTextForString("pyCaption", pyAutoPrepend);
}else{
pyAutoPrepend = tools.getControlUtilities().getPropertyOrLiteralValue(pyAutoPrepend,tools, false);
 pyAutoPrepend = tools.getControlUtilities().getParametersAppendedFieldValue(runTimeParamPage, pyAutoPrepend , "pyAutoPrepend", ".pyCaption", tools, bLocalize); 
pzAuto.getUIComponentRuntime().getRuntimeContextTree().addLocalizedValue(pyAutoPrepend, ".pyCaption");
}
if(isCommonFormat){
 tools.appendString(pega_uiengine_formatter.pxFormatCommon(commonData,pega_uiengine_formatter.pxFormatText(valueForGenerateFormat, obfuscateWhenCondition,pyAutoPrepend,pyAutoAppend, bLocalize,ctrlContent)));
} else {
tools.appendString(pega_uiengine_formatter.pxFormatText(valueForGenerateFormat,obfuscateWhenCondition,pyAutoPrepend,pyAutoAppend,bLocalize,ctrlContent));
}
}
if("none".equals(formatType)){
tools.appendString(pega_uiengine_formatter.pxFormatText(valueForGenerateFormat, false,"","", bLocalize,ctrlContent));
}

		if("".equals(valueForGenerateFormat) && "".equals(pyAutoAppend) && "".equals(pyAutoPrepend) && !"true".equals(tools.getParamValue("isControlEditableOriginal"))) {
		String noValue = tools.getLocalizedTextForString(".pyCaption","no value");
			tools.appendString("<span aria-label=\""+ noValue +"\"><span aria-hidden=\"true\">&ndash;&ndash;</span></span>");
		}
		if("".equals((isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true))) && !"true".equals(tools.getParamValue("FORMAT_PLAIN_TXT")) && ((pzAuto.getBrowserUtils().isIE() && !pega_uiengine_harness.pzInStandardsMode()) || "true".equals(tools.getParamValue("fromAPI"))) ){
			tools.appendString("&nbsp;");
		}
}
public void inclAction_1() {
}
public void inclCalVal_1(String controlName,String controlFormat, String styleClass) {tools.appendString("<P id=\"CV\" name=\"");tools.appendString(tools.getActive().getEntryHandle());tools.appendString("\" ");tools.appendString("RHP_NAME=\"");tools.appendString(controlName);tools.appendString(" \" ");tools.appendString(" data-ctl data-ctlformat=\"");tools.appendString(controlFormat);tools.appendString("\" ");
		tools.appendString(styleClass);if(tools.getParamValue("AJAXTrackID") != null){com.pega.pegarules.priv.runtime.IStreamChangeTracker changeTracker = pzAuto.getChangeTracker(tools.getParamValue("AJAXTrackID"));	changeTracker.trackValueChanges(tools.getActive(),-1);}
}


public void textIncludes_1() {
if (pzAuto.doOnlyOnce("pzTextIncludes")) {
pzAuto.emitIncludeStreamReference("pzTextIncludes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
	/**
	 * This is the cleanForReuse from the WhenAssembler
	 */
	public void cleanForReuse(PegaAPI aContext) {
		tools = (StreamBuilderToolKit)aContext;
		pega = (com.pega.pegarules.priv.runtime.PegaStreamAPI)aContext;
		if( pega != null ) {
		pzAuto = pega.getAutoStreamRuntime();
			pzSection = pzAuto.getSection();
			pzLayout = pzSection.getLayout();
			pzCell = pzLayout.getCell();
			pzControl = pzCell.getControl();
			pzPackageRuntime = pega.getPackageRuntime();
		} else {
			pzSection = null;
			pzAuto = null;
			pzLayout = null;
			pzCell = null;
			pzControl = null;
			pzPackageRuntime = null;
		}
	}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-HTML-PROPERTY PXANYPICKER #20190806T142222.318 GMT", "pxAnyPicker", "Pega-Gadgets", "08-04-01", null);
}
