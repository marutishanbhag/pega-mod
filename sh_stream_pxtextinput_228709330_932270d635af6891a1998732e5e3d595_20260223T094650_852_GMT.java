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
public class sh_stream_pxtextinput_228709330_932270d635af6891a1998732e5e3d595_20260223T094650_852_GMT extends StreamBuilderSection implements ControlBuilder, FUASupport, FUAReusable, WebAllowable {
	private static final LogHelper  oLog = new LogHelper("Rule_HTML_Property.pxTextInput.Stream");
	private final int uniqueCounter = 4;
private IControlRuntimeUtilities controlRuntimeUtilities = null;
public void execute() {
	throw new PRRuntimeException("Unsupported Method");
}

public sh_stream_pxtextinput_228709330_932270d635af6891a1998732e5e3d595_20260223T094650_852_GMT(com.pega.pegarules.priv.PegaAPI aContext) {
		cleanForReuse(aContext);
controlRuntimeUtilities = tools.getControlUtilities();
}

	 public boolean isAllowedInWeb() {
		 return true;
	}
public void execute(ClipboardPage runTimeParamPage) {
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
	propName = ".pyTemplateInputBox";
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
	textStyle1 = "Standard";
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
	formatType = "none";
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

inclCalVal_1("pxTextInput", controlFormat, styleClass);inclAction_1();
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
	String ctrlMinChars = modePageData1.getStringIfPresent("pyMin");
	if(ctrlMinChars == null) {
	ctrlMinChars = "";
	}
	String ctrlTextAlign = modePageData1.getStringIfPresent("pyTextAlign");
	if(ctrlTextAlign == null) {
	ctrlTextAlign = "Left";
	}
	String textStyle = modePageData1.getStringIfPresent("pyStyleNameOther");
	if(textStyle == null) {
	textStyle = "Standard";
	}
boolean bRunOnClient = modePageData1.getBoolean("pyRunOnClient");	boolean pyObfuscated =  modePageData1.getStringIfPresent("pyObfuscated") != null ? modePageData1.getBoolean("pyObfuscated") : false;
	String formatType = modePageData1.getStringIfPresent("pyFormatType");
	if(formatType == null) {
	formatType = "none";
	}
String formatTypeTemp =  formatType;	String placeHolder = "";
	String tPlaceHolderType  = modePageData1.getStringIfPresent("pyPlaceholderType") != null ? modePageData1.getStringIfPresent("pyPlaceholderType") : "none";
	if ("other".equals(tPlaceHolderType)) {
	placeHolder = modePageData1.getStringIfPresent("pyPlaceholder") != null ? modePageData1.getStringIfPresent("pyPlaceholder") : "";
	}
	String ctrlTooltip = modePageData1.getStringIfPresent("pyTooltip");
	if(ctrlTooltip == null) {
	ctrlTooltip = "";
	}
	String ctrlHelperTextType = modePageData1.getStringIfPresent("pyHelperTextType");
	if(ctrlHelperTextType == null) {
	ctrlHelperTextType = null;
	}
	String ctrlSpecifySize = modePageData1.getStringIfPresent("pySpecifySize");
	if(ctrlSpecifySize == null) {
	ctrlSpecifySize = "auto";
	}
	String ctrlWidth = modePageData1.getStringIfPresent("pyWidth");
	if(ctrlWidth == null) {
	ctrlWidth = "170";
	}
	String ctrlWidthUnits = modePageData1.getStringIfPresent("pyWidthUnits");
	if(ctrlWidthUnits == null) {
	ctrlWidthUnits = "columns";
	}
	boolean pyDisplayReadOnlyFormatting = ("true".equalsIgnoreCase(
				modePageData1.getStringIfPresent("pyShowReadonlyFormatting")) && "number".equals(formatType));
	String propertyType = paramPage.getString("propertyType");
	boolean isPassword = pyObfuscated || controlRuntimeUtilities.isPassword(propertyType);
	String tooltipText = "";
	boolean isPlaceHolderConfigured = !StringUtils.isBlank(placeHolder);
	boolean isValueList = paramPage.getBoolean("isValueList");
	String propNameForOptimized = isValueList ? paramPage.getString("pzPLPropName") : propName;
	String tempProp =  propName;
	if(pzAuto.getUIComponentRuntime().getTemplatingUIStatus() == 'Y'){
		IUIComponentMetadata metadataPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata cellPage = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage1 = pzAuto.getUIComponentRuntime().createMetadata();
		IUIComponentMetadata modePage2 = pzAuto.getUIComponentRuntime().createMetadata();
		java.util.List<String> ctPropRefs = new ArrayList<String>();
		IUIComponent ctrlComponent = pzAuto.getUIComponent();
		String expressionId = null;
		com.pega.pegarules.priv.runtime.ui.IExpression expression = null;
		String repeatIndx = "";
		IUIComponentMetadata pyUserData = pzAuto.getUIComponentRuntime().createMetadata();
		automationId = runTimeParamPage.getString("pyAutomationID");
		cellPage.put("automationId",pzCell.getTestIdIfEnabled(automationId,true));
		cellPage.put("pyValue",propName);
		controlRuntimeUtilities.registerPropertyReference(propName, ".pyCaption", localize, tools, pzAuto, repeatIndx, pega, false);
		controlRuntimeUtilities.generateMetadataForTextStyle(modePage1, textStyle);
		boolean addErrorMsgFlag = true;
		if(ctrlEditiablity == ControlsInfo.ControlEditOption.READ_ONLY_ALWAYS) {
			String displayValidationOnReadOnly = modePageData2.getStringIfPresent("pyReadonlyValidation");
			if (displayValidationOnReadOnly == null || !"true".equals(displayValidationOnReadOnly)) {
				addErrorMsgFlag = false;
			}
		}
		if(addErrorMsgFlag) {
			pzAuto.getUIComponentRuntime().getRuntimeContextTree().addErrors(propName,controlUniqueHash + "_6");
			IUIComponentMetadata pxErrorIdentifiers = pzAuto.getUIComponentRuntime().createMetadata();
			modePage1.putMetadata("pxErrorIdentifiers",pxErrorIdentifiers);
			pxErrorIdentifiers.put("pyErrorId",controlUniqueHash + "_6");
		}
		placeHolder = controlRuntimeUtilities.getPlaceHolder(placeHolder);
		if (placeHolder != null) {
			String placeHolderR = controlRuntimeUtilities.registerPropertyReference(placeHolder, ".pyActionPrompt", localize, tools, pzAuto, repeatIndx, pega, true);
		modePage1.put("placeholder", placeHolderR);
		}
		addedValidation = controlRuntimeUtilities.registerMetadataForMinchars(modePage1, ctrlMinChars, pegaValidation, addedValidation);
		boolean isNumberFormatTemplateApplicable = controlRuntimeUtilities.isNumberFormatTemplateApplicable(propertyType,formatType,pyDisplayReadOnlyFormatting)
	;
		boolean isDecimalOrDouble = controlRuntimeUtilities.isDecimalOrDouble(propertyType);
		if(isNumberFormatTemplateApplicable && isDecimalOrDouble) {
		tools.putParamValue("forNumberFormatTemplate","true");
		pega_uiengine_formatter.pxFormatNumber("123450.6789", null,true,4,"none", null, null, null, null, "","associated",true,null);
		modePage1.put("pyNumberFormatForLocaleEditable",tools.getParamValue("localeNumFormat"));
		tools.putParamValue("localeNumFormat","false");
		tools.putParamValue("symbolValueCalc","false");
		tools.putParamValue("currencySymbolCalc","false");
		tools.putParamValue("forNumberFormatTemplate","false");
		}
		String pzPLPropName = paramPage.getString("pzPLPropName");
		if(isValueList){
pzAuto.getPropertyActionRequest().registerClientParameter(StringUtils.crossScriptingFilter(pega_uiengine_pzcontrol.pzGetActiveName((PegaStreamAPI)tools,true)));		} else {
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);		}
		String propID = controlRuntimeUtilities.getPropID(isValueList,pzPLPropName,propName);
		cellPage.put("pyID",propID);
		if(maxLength > 0){
		modePage1.put("pyMax","maxlength= '"+maxLength+"'");
		} else {
		modePage1.put("pyMax","");
		}
		controlRuntimeUtilities.generateMetadataForPatternAndFormat(modePage1, formatType, isPassword, pyDisplayReadOnlyFormatting);
		String clientValidationAttributes = pzAuto.getCell().getClientValidationAttributes(pyOnInput, pyEditValidate, pyStringType,pegaValidation.toString());
		modePage1.put("clintValidAttrs",clientValidationAttributes);
		if (pyDisplayReadOnlyFormatting) {

		String hasAttrError = tools.getActive().hasAttrError()+"";
		modePage1.put("hasAttrError", hasAttrError);
		}
		controlRuntimeUtilities.generateMetadataForTextAlign(modePage1, ctrlTextAlign);
		controlRuntimeUtilities.generateMetadatForOfflineDefault(modePage1,runTimeParamPage, pega, tools, repeatIndx, pzAuto, paramPage);
		controlRuntimeUtilities.generateMetadataForTooltip(modePage1, localize, ctrlTooltip, pega, tools, repeatIndx, pzAuto);
		controlRuntimeUtilities.generateMetadataForHelperTextType(modePage1, localize, ctrlHelperTextType, pega, tools, repeatIndx, pzAuto);
		controlRuntimeUtilities.generateMetaDataForWidth(modePage1, ctrlSpecifySize, ctrlWidth, ctrlWidthUnits);
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
			String activeProp = propName;
			String originalPropValue = activeProp;
			boolean bLocalizedTemp = false;
			String pyContent =  modePageData2.getStringIfPresent("pyContent") != null ? modePageData2.getString("pyContent") :"associated";
			String pyFormatType_RO =  modePageData2.getStringIfPresent("pyFormatType") != null ? modePageData2.getString("pyFormatType") :"none";
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
				if(ctrlEditiablity == ControlsInfo.ControlEditOption.READ_ONLY_ALWAYS){
				cellPage.addMetadataInArray("pyModes",modePage1);
				cellPage.addMetadataInArray("pyModes",modePage2);
				metadataPage.putMetadata("pyCell",cellPage);
				ctrlComponent.addDependentScripts("pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
				ctrlComponent.addAdditionalScripts("pzDecimalInclude","pzpega_ui_decimal.js");
				ctrlComponent.beginComponent("pxDisplayText",metadataPage);
				ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
				tools.putParamValue("isControlEditableOriginal", true);
				ctrlComponent.endComponent();
				}else{
				cellPage.addMetadataInArray("pyModes",modePage1);
				cellPage.addMetadataInArray("pyModes",modePage2);
				metadataPage.putMetadata("pyCell",cellPage);
				ctrlComponent.addAdditionalScripts("pxDisplayText","pzpega_ui_formatNumber.js","pzpega_ui_markdown_it.js","pzXss.js", "pzpega_ui_advancedtext.js","pzpega_ui_template_displayText.js","pzpega_ui_calendar_util.js","pzpega_ui_calendar_dbp.js","pzpega_ui_calendar.js","pzpega_ui_formatDateTime.js","pzpega_moment_with_locales.js","pzPega_moment_timezone_with_data.js");
				ctrlComponent.addDependentScripts("pzpega_control_textinput.js","pzpega_ui_template_textinput.js","pzpega_ui_formatNumber.js");
				ctrlComponent.addAdditionalScripts("pzDecimalInclude","pzpega_ui_decimal.js");
				ctrlComponent.beginComponent("pxTextInput",metadataPage);
				ctrlComponent.setTrackedProperties(ctPropRefs.toArray(new String[]{}));
				tools.putParamValue("isControlEditableOriginal", true);
				ctrlComponent.endComponent();
				}
				} else {
String methodName = paramPage.getString("FRMT_VAL_MTHD_NAME");
 String layoutFormatType = paramPage.getString("pyLayoutFormatType");
		textInputIncludes_1();boolean bOptimizedMarkup = pzAuto.getUIComponentRuntime().isTemplateRendering();					 boolean doAutoFormatting = false;
controlRuntimeUtilities.generateMarkupForTextStyle(textStyle, tools);
 if(!layoutFormatType.equalsIgnoreCase("SIMPLELAYOUT")) {
			pega_uiengine_pzcontrol.pzAddMessages(tools,"");}					
		String placeHolderR = "";
					if (!StringUtils.isLiteral(placeHolder) && StringUtils.isPropertyReference(placeHolder)) {

					ClipboardProperty placeholderProp = tools.getProperty(placeHolder);
					String classNameOfPlaceholderProp = placeholderProp.getParentPage().getClassName();
					boolean locSkippedForPlaceholderProp = "true".equals(tools.getDictionary().shouldSkipLocalization(classNameOfPlaceholderProp, placeholderProp.getName()));
					if (localize && !locSkippedForPlaceholderProp) {
					
		placeHolderR = tools.getLocalizedTextForString(".pyActionPrompt",tools.getProperty(placeHolder).getStringValue(),StreamBuilder.FMT_LITERAL);
					} else {
					
		placeHolderR = tools.getProperty(placeHolder).getStringValue();
					} 
					} else {
					if (localize) {
					placeHolder = controlRuntimeUtilities.unescapeString(placeHolder);
					
		placeHolderR = tools.getLocalizedTextForString(".pyActionPrompt",placeHolder.replaceAll("^\"(.*)\"$", "$1"),StreamBuilder.FMT_LITERAL);
					} else {
					
		placeHolderR = placeHolder.replaceAll("^\"(.*)\"$", "$1");
					}

					}
if (!StringUtils.isBlank(ctrlMinChars)) {
		if(addedValidation) {
			pegaValidation.append(",");addedValidation=true;
		} 
		pegaValidation.append("minchars");}					String activeValue = isSecuredProp ? activePropValue : pega_uiengine_pzcontrol.pzGetActiveValue((PegaStreamAPI)tools,true);
					List<String> unSupportedLocales = new ArrayList<String>();
					unSupportedLocales.add("hi_IN");
					boolean isNumberFormatTemplateApplicable = controlRuntimeUtilities.isNumberFormatTemplateApplicable(propertyType,formatType,pyDisplayReadOnlyFormatting);
					boolean isDecimalOrDouble = controlRuntimeUtilities.isDecimalOrDouble(propertyType);
					if(isNumberFormatTemplateApplicable) {
						String defaultLocale = tools.findPage("pxRequestor").getString(".pyUseLocale");
						if(unSupportedLocales.contains(defaultLocale)){
							isNumberFormatTemplateApplicable = false;
						}
					}
activeValue = controlRuntimeUtilities.getActiveValueAfterApplyingNumberFormt(isNumberFormatTemplateApplicable, isDecimalOrDouble , activeValue);					if (isValueList) {
pzAuto.getPropertyActionRequest().registerClientParameter(StringUtils.crossScriptingFilter(pega_uiengine_pzcontrol.pzGetActiveName((PegaStreamAPI)tools,true)));					} else {
pzAuto.getPropertyActionRequest().registerClientParameter(sEntryHandle);					}
							String classValue = controlRuntimeUtilities.getTextAlignValue(ctrlTextAlign);
					if (tools.getActive() != null && (tools.getActive().getMessageCount() > 0 || tools.getActive().isBad())) {
					classValue += " ErrorShade ";
					}
String disable_when = controlRuntimeUtilities.generateDisabledWhen(runTimeParamPage, modePageData1, paramPage, tools, pzAuto);					ctrlTooltip = controlRuntimeUtilities.unescapeString(ctrlTooltip);
String automationID = controlRuntimeUtilities.getAutomationID(runTimeParamPage, pzSection);tools.appendString(" <input " + automationID + " data-ctl='[\"TextInput\"]' ");
		tools.appendString(" id=\"");String bodyType = paramPage.getString("pyBodyType");boolean repeating = false;if("REPEATING".equals(bodyType) || "DYNAMICREPEATING".equals(bodyType)) {
	repeating = true;}
		tools.appendString(((PegaAPI) tools).getHTMLIDForProperty(repeating,"text"));
		tools.appendString("\"");if(ctrlTooltip != null && !ctrlTooltip.equals("")){
		tools.appendString(" title='");if (!StringUtils.isLiteral(ctrlTooltip) && StringUtils.isPropertyReference(ctrlTooltip)) {
ClipboardProperty tooltipProp = tools.getProperty(ctrlTooltip);String classNameOfTooltipProp = tooltipProp.getParentPage().getClassName();boolean locSkippedForTooltipProp = "true".equals(tools.getDictionary().shouldSkipLocalization(classNameOfTooltipProp, tooltipProp.getName()));if (localize && !locSkippedForTooltipProp) {
		tooltipText = StringUtils.crossScriptingFilter(tools.getLocalizedTextForString(".pyToolTip",tools.getProperty(ctrlTooltip).getStringValue(),StreamBuilder.FMT_LITERAL));} else {tooltipText = StringUtils.crossScriptingFilter(tools.getProperty(ctrlTooltip).getStringValue());}} else {if (localize) {tooltipText = tools.getLocalizedTextForString(".pyTooltip",ctrlTooltip.replaceAll("^\"(.*)\"$", "$1"),StreamBuilder.FMT_LITERAL);tooltipText = tooltipText.replaceAll("'", "&apos;");} else {tooltipText = ctrlTooltip.replaceAll("^\"(.*)\"$", "$1");}}
		tools.appendString(tooltipText+"'");}controlRuntimeUtilities.generateMarkupForControlWidth(ctrlSpecifySize, ctrlWidth, ctrlWidthUnits, tools);
		if(maxLength > 0) {tools.appendString(" maxLength='"+maxLength+"' ");}String type = controlRuntimeUtilities.getTypeForTextInput(formatType, pyDisplayReadOnlyFormatting, isPassword);
		tools.appendString(" type='" + type+ "' ");
		 if(type.equals("password")){
		tools.appendString(" autocomplete='off' ");
		 }
		pega_uiengine_pzcontrol.pzAddClientValidation(tools,pyOnInput,pyEditValidate,pyStringType,pegaValidation.toString());controlRuntimeUtilities.generateMarkupForCrossScripting(tools, pzAuto, activeValue, placeHolderR, isPlaceHolderConfigured);
		String propertyHandle =  "";String nameType = "";if (isValueList) {nameType = "reference";
		 propertyHandle =  pega_uiengine_pzcontrol.pzGetActiveName((PegaStreamAPI)tools,true);} else {nameType = "entryHandle";
		 propertyHandle =  sEntryHandle;}
		tools.appendString(pega_uiengine_offlinesupport.pzGetDataInitAttribute(propertyHandle,"property", null));
		tools.appendString(bOptimizedMarkup ? " data-cdb-value=\"" : " value=\"");String ref = isValueList ? propertyHandle : tools.getProperty(propNameForOptimized).getReference() ;
controlRuntimeUtilities.markUpForReadOnlyFormatting(bOptimizedMarkup, ref, activeValue, tools, pzAuto);if(bOptimizedMarkup){propertyHandle = pzAuto.getUIComponentRuntime().changeTrackProperty(propertyHandle,nameType);}
		tools.appendString("\" name=\"");
		tools.appendCSF(propertyHandle);
		tools.appendString("\" ");
		tools.appendString(" aria-describedby=\"");
		tools.appendCSF(propertyHandle);
		tools.appendString("Error\" ");
		tools.appendString(" class=\""+ classValue +"\" ");if(disable_when != null) {
		if(pzAuto.handleEvaluateWhen(paramPage.getString("expressionCode"),StringUtils.escapeIntoJavaString(disable_when),"cell", "disable")) {
			tools.appendString(" disabled  ");
			}
			}if (!StringUtils.isBlank(ctrlMinChars)) {
		tools.appendString(" minchars='"+ctrlMinChars+"'");}					if (!StringUtils.isBlank(ctrlRunTimeSecStreamName)) {
						tools.putParamValue("runTimeSecStreamName", ctrlRunTimeSecStreamName);
					} else {
						tools.putParamValue("runTimeSecStreamName", "");
					}
String defaultValue = StringUtils.escapeCrossScriptingFilter(runTimeParamPage.getPage("pyUserData").getString("pyDefaultValue"));if (!StringUtils.isBlank(defaultValue)) {
		 if(bOptimizedMarkup){					tools.appendString(" data-bindDefaultValue='defaultValue'");
}}
		 if(bOptimizedMarkup){ tools.appendString(" data-bindprops=\"title,data-value,data-cdb-value\" "); } 
		tools.appendString(">");
if(layoutFormatType.equalsIgnoreCase("SIMPLELAYOUT")) {
			pega_uiengine_pzcontrol.pzAddMessages(tools,layoutFormatType);}
		tools.appendString("</span>");if (disable_when != null && bRunOnClient) {
		tools.appendString(" </div> ");}					}

		pegaValidation.delete(0,pegaValidation.length());
		tools.putParamValue("pega_attributes","");					
	}

	if(!isEditable) {
		if(!pzAuto.getBrowserUtils().isFF()) {
			tools.putParamValue("pxControlName", "pxTextInput");
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
					pyFormatType = "none";
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
		metadata.put("cellInfo", " FirstName");
		metadata.put("msgText", "config issue");
		ctrlComponent.addDependentScripts("pzpega_ui_template_designview.js");
		ctrlComponent.beginComponent("pxDesignViewError", metadata);
		tools.putParamValue("isControlEditableOriginal", true);
		ctrlComponent.endComponent();
	 }						}

				}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

				public boolean isDirectiveStream() {
					return true;
				}
private static final String oDependencies [] = {
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
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

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "fa7689ffb6d610cf098b8856ac848170";
	}

	public String getDefinitionAppliesToClass() {
		return "null";
	}
public String getAspect() {
return "Stream";
}


public void textInputIncludes_1() {
if (pzAuto.doOnlyOnce("TextInput")) {
pzAuto.emitIncludeStreamReference("pzTextinputIncludes", null, !tools.hasInputEnabled()?"NoInput":"NoInput", "Rule-HTML-Fragment", null);
}
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
formatType = "none";
}
String pyHighlight = modePage2.getStringIfPresent("pyHighlight");
if(pyHighlight == null){
pyHighlight = null;
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


}
