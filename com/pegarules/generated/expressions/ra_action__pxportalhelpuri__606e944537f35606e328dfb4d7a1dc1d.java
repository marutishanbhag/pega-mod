package com.pegarules.generated.expressions;
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
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
public class ra_action__pxportalhelpuri__606e944537f35606e328dfb4d7a1dc1d extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Declare_Expressions._pxPortalHelpURI..Pega_HelpContent.Action");
	public ra_action__pxportalhelpuri__606e944537f35606e328dfb4d7a1dc1d(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
	public ClipboardPage myStepPage = null;
	String pz_CurrentRuleKey = "";
public void perform() {
String pzAllowMissingPropertiesString = (tools.getParameterPage() != null) ? tools.getParamValue("bAllowMissingProperties") : null;
boolean pzAllowMissingProperties = true;
if ((pzAllowMissingPropertiesString != null) && (pzAllowMissingPropertiesString.length() > 0)) pzAllowMissingProperties = tools.interpretBoolean(pzAllowMissingPropertiesString);
myStepPage = tools.getPrimaryPage();
ClipboardProperty pageRef;
ClipboardPage level0Page = null;
java.util.Iterator myPageList;
ClipboardPage thisStepPage;
ClipboardProperty currentProperty = null;
String thisPageClass = "";
boolean evaluationResult = false;
// Prepare to catch type conversion issues
try {

/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT	Pega-ProcessEngine:08-03-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */

// Pega-RULES Declarative Processing Rule Instance

// Expression: .pxPortalHelpURI
ClipboardProperty pz_4 = propertyQuery_3.resolve(tools, myStepPage);
currentProperty = pz_4;
tools.getInfEngUtils().setCurrentTargetProperty(currentProperty);
boolean pzOriginalBCValue = pega.isBackwardChaining();
if (!pzAllowMissingProperties) pega.setBackwardChaining(true);
try {
boolean varTrue;
boolean varFalse;
String useClass = null;
boolean varWhenName;
if(!evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).evaluateWhen('pzIsPegaExpress'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).evaluateWhen(\"pzIsPegaExpress\"))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).evaluateWhen("pzIsPegaExpress"))

evaluationResult = (pega.<Boolean>resolveMethodCall("evaluateWhen--(String)", "evaluateWhen", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pzIsPegaExpress" })).booleanValue();
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).evaluateWhen('pzIsPegaExpress'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).evaluateWhen(\"pzIsPegaExpress\"))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "pxRequestor.pxProComHelpURI + '/' + @Utilities.getDataSystemSetting('Pega-ProCom','ProComHelpURI/pxExpress','')", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("pxRequestor.pxProComHelpURI + \"/\" + @Utilities.getDataSystemSetting(\"Pega-ProCom\",\"ProComHelpURI/pxExpress\",\"\")");
// Expression: pxRequestor.pxProComHelpURI + "/" + @Utilities.getDataSystemSetting("Pega-ProCom","ProComHelpURI/pxExpress","")
String pz_6 = ((scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT) + "/") + pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, "Utilities", new Object[] { "Pega-ProCom", "ProComHelpURI/pxExpress", "" }));
pz_4.setValue(pz_6);
boolean isTargetValidationDisabled  = Boolean.valueOf(tools.getSystemSettings().getDynamic("Pega-Engine","declareexp/target/validation/disable"));
if( !isTargetValidationDisabled ) { 
oLog.debug("Declare Expression Validation Begins");
boolean isTargetValid = tools.getDictionary().validate(pz_4,false,true);
if (!isTargetValid) {
String propName = pz_4.getName();
String className = pz_4.getParentPage()!=null?pz_4.getParentPage().getClassName():"";
oLog.error(String.format(" Validation failed for property : '%s' of Class : '%s'", propName,className));
}
}

}
}
if(!evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyOwner, '=', 'Developer'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyOwner, \"=\", \"Developer\"))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyOwner, "=", "Developer"))

evaluationResult = FUAUtil.compareTwoValues(scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "Developer");
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyOwner, '=', 'Developer'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyOwner, \"=\", \"Developer\"))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "pxRequestor.pxProComHelpURI", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("pxRequestor.pxProComHelpURI");
// Expression: pxRequestor.pxProComHelpURI
String pz_8 = scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT);
pz_4.setValue(pz_8);
boolean isTargetValidationDisabled  = Boolean.valueOf(tools.getSystemSettings().getDynamic("Pega-Engine","declareexp/target/validation/disable"));
if( !isTargetValidationDisabled ) { 
oLog.debug("Declare Expression Validation Begins");
boolean isTargetValid = tools.getDictionary().validate(pz_4,false,true);
if (!isTargetValid) {
String propName = pz_4.getName();
String className = pz_4.getParentPage()!=null?pz_4.getParentPage().getClassName():"";
oLog.error(String.format(" Validation failed for property : '%s' of Class : '%s'", propName,className));
}
}

}
}
if(!evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyOwner, '=', 'pxPredictionStudio'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyOwner, \"=\", \"pxPredictionStudio\"))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyOwner, "=", "pxPredictionStudio"))

evaluationResult = FUAUtil.compareTwoValues(scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "pxPredictionStudio");
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyOwner, '=', 'pxPredictionStudio'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyOwner, \"=\", \"pxPredictionStudio\"))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "pxRequestor.pxProComHelpURI", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("pxRequestor.pxProComHelpURI");
// Expression: pxRequestor.pxProComHelpURI
String pz_9 = scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT);
pz_4.setValue(pz_9);
boolean isTargetValidationDisabled  = Boolean.valueOf(tools.getSystemSettings().getDynamic("Pega-Engine","declareexp/target/validation/disable"));
if( !isTargetValidationDisabled ) { 
oLog.debug("Declare Expression Validation Begins");
boolean isTargetValid = tools.getDictionary().validate(pz_4,false,true);
if (!isTargetValid) {
String propName = pz_4.getName();
String className = pz_4.getParentPage()!=null?pz_4.getParentPage().getClassName():"";
oLog.error(String.format(" Validation failed for property : '%s' of Class : '%s'", propName,className));
}
}

}
}
if(!evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyCategory, '=', 'workspace'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyCategory, \"=\", \"workspace\"))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyCategory, "=", "workspace"))

evaluationResult = FUAUtil.compareTwoValues(scalarValueQuery_10.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "workspace");
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyCategory, '=', 'workspace'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(pyPortal.pyCategory, \"=\", \"workspace\"))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "pxRequestor.pxProComHelpURI + '/' + @String.toLowerCase(pyPortal.pyOwner)", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("pxRequestor.pxProComHelpURI + \"/\" + @String.toLowerCase(pyPortal.pyOwner)");
// Expression: pxRequestor.pxProComHelpURI + "/" + @String.toLowerCase(pyPortal.pyOwner)
String pz_11 = ((scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT) + "/") + pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", null, "String", new Object[] { scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }));
pz_4.setValue(pz_11);
boolean isTargetValidationDisabled  = Boolean.valueOf(tools.getSystemSettings().getDynamic("Pega-Engine","declareexp/target/validation/disable"));
if( !isTargetValidationDisabled ) { 
oLog.debug("Declare Expression Validation Begins");
boolean isTargetValid = tools.getDictionary().validate(pz_4,false,true);
if (!isTargetValid) {
String propName = pz_4.getName();
String className = pz_4.getParentPage()!=null?pz_4.getParentPage().getClassName():"";
oLog.error(String.format(" Validation failed for property : '%s' of Class : '%s'", propName,className));
}
}

}
}
if(!evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "When = (@(Pega-RULES:String).equalsIgnoreCase(@Utilities.getDataSystemSetting('Pega-ProCom','ProComHelpURI/' + pyPortal.pyOwner,''), ''))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:String).equalsIgnoreCase(@Utilities.getDataSystemSetting(\"Pega-ProCom\",\"ProComHelpURI/\" + pyPortal.pyOwner,\"\"), \"\"))");
// Expression: = (@(Pega-RULES:String).equalsIgnoreCase(@Utilities.getDataSystemSetting("Pega-ProCom","ProComHelpURI/" + pyPortal.pyOwner,""), ""))

evaluationResult = (pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, "Utilities", new Object[] { "Pega-ProCom", ("ProComHelpURI/" + scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT)), "" }), "" })).booleanValue();
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "When = (@(Pega-RULES:String).equalsIgnoreCase(@Utilities.getDataSystemSetting('Pega-ProCom','ProComHelpURI/' + pyPortal.pyOwner,''), ''))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:String).equalsIgnoreCase(@Utilities.getDataSystemSetting(\"Pega-ProCom\",\"ProComHelpURI/\" + pyPortal.pyOwner,\"\"), \"\"))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "pxRequestor.pxProComHelpURI", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("pxRequestor.pxProComHelpURI");
// Expression: pxRequestor.pxProComHelpURI
String pz_12 = scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT);
pz_4.setValue(pz_12);
boolean isTargetValidationDisabled  = Boolean.valueOf(tools.getSystemSettings().getDynamic("Pega-Engine","declareexp/target/validation/disable"));
if( !isTargetValidationDisabled ) { 
oLog.debug("Declare Expression Validation Begins");
boolean isTargetValid = tools.getDictionary().validate(pz_4,false,true);
if (!isTargetValid) {
String propName = pz_4.getName();
String className = pz_4.getParentPage()!=null?pz_4.getParentPage().getClassName():"";
oLog.error(String.format(" Validation failed for property : '%s' of Class : '%s'", propName,className));
}
}

}
}
} // End of try block
catch (com.pega.pegarules.pub.infengine.ChainingException ce) { evaluationResult = true;
if (!pzAllowMissingProperties) {
  pega.setBackwardChaining(pzOriginalBCValue);
  return;
} else {
  throw ce;
}
} catch (StalePropertyReferenceException ex) {
evaluationResult = false;
// Discard this exception and backout the worst step status
tools.getStepStatus().backoutWorst();
} catch (NoSuchParentForReferenceException ex) {
evaluationResult = false;
// Discard this exception and backout the worst step status
tools.getStepStatus().backoutWorst();
}catch (ActivityTerminateException ate) {
 evaluationResult = false;
	throw ate;
} catch (RuntimeException re) {
 evaluationResult = false;
	throw re;
} finally {
try {
if(!evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "pxRequestor.pxProComHelpURI + '/' + @Utilities.getDataSystemSetting('Pega-ProCom','ProComHelpURI/' + pyPortal.pyOwner,'')", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("pxRequestor.pxProComHelpURI + \"/\" + @Utilities.getDataSystemSetting(\"Pega-ProCom\",\"ProComHelpURI/\" + pyPortal.pyOwner,\"\")");
// Expression: pxRequestor.pxProComHelpURI + "/" + @Utilities.getDataSystemSetting("Pega-ProCom","ProComHelpURI/" + pyPortal.pyOwner,"")
String pz_13 = ((scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT) + "/") + pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, "Utilities", new Object[] { "Pega-ProCom", ("ProComHelpURI/" + scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT)), "" }));
pz_4.setValue(pz_13);
boolean isTargetValidationDisabled  = Boolean.valueOf(tools.getSystemSettings().getDynamic("Pega-Engine","declareexp/target/validation/disable"));
if( !isTargetValidationDisabled ) { 
oLog.debug("Declare Expression Validation Begins");
boolean isTargetValid = tools.getDictionary().validate(pz_4,false,true);
if (!isTargetValid) {
String propName = pz_4.getName();
String className = pz_4.getParentPage()!=null?pz_4.getParentPage().getClassName():"";
oLog.error(String.format(" Validation failed for property : '%s' of Class : '%s'", propName,className));
}
}
}
}
catch (com.pega.pegarules.pub.infengine.ChainingException ce) { evaluationResult = true;
if (!pzAllowMissingProperties) {
  pega.setBackwardChaining(pzOriginalBCValue);
} else {
  throw ce;
}
} catch (StalePropertyReferenceException ex) {
evaluationResult = false;
// Discard this exception and backout the worst step status
tools.getStepStatus().backoutWorst();
} catch (NoSuchParentForReferenceException ex) {
evaluationResult = false;
// Discard this exception and backout the worst step status
tools.getStepStatus().backoutWorst();
}catch (ActivityTerminateException ate) {
 evaluationResult = false;
	throw ate;
} catch (RuntimeException re) {
 evaluationResult = false;
	throw re;
}
}
}
} catch (InvalidValueException ive) {
// Discard this exception
} catch (ChainingException ce) {
// This exception must float
throw ce;
} catch (IndeterminateConditionalException ice) {
Throwable thrCause = ice.getCause();
if ((thrCause == null) || (!(thrCause instanceof InvalidValueException))) {
	throw ice;
} else {
	ClipboardPage cpPrimary = tools.getPrimaryPage();
	if (cpPrimary != null) {
		cpPrimary.addMessage("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT\t" + thrCause.getMessage());
		if (oLog.isWarnEnabled()) {			oLog.warn("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT\t" + thrCause.getMessage(), ice);		}	} else {
		oLog.error("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT\t" + thrCause.getMessage(), ice);	}
}
} catch (RuntimeException re) {
if (currentProperty != null && pega.isInputProcessing() && (!tools.getInfEngUtils().ignoreArithmeticException() || !(re instanceof ArithmeticException))) {
String message = "ChainingException	Rule-Declare-Expressions	Pega-HelpContent..pxPortalHelpURI.	" + re.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, re);
} else { throw re;
}
} catch (PRSecurityException se) {
if (currentProperty != null && pega.isInputProcessing()) {
String message = "ChainingException	Rule-Declare-Expressions	Pega-HelpContent..pxPortalHelpURI.	" + se.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, se);
} else { throw se;
}
} finally {
if (currentProperty != null && oLog.isDebugEnabled()) {
oLog.debug("Result = " + tools.getInfEngUtils().getTargetPropertyValue(currentProperty));
} // end if
} // end try
} // end perform() method
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Declare-Expressions:.PXPORTALHELPURI!"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo(".PXPORTALHELPURI!","Rule-Declare-Expressions","PEGA-HELPCONTENT",false,"","Pega-ProcessEngine","08-03-01","RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT","!.PXPORTALHELPURI!",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-888344483)
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
//	RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT:20190514T131122.287 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "e1983611e28859d0c4dddc053c7253a2";
	}

	public String getDefinitionAppliesToClass() {
		return "Pega-HelpContent";
	}
public String getAspect() {
return "Action";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}

/**
 * This is the cleanForReuse from the RuleDeclareConstraintsAssembler
 */
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	myStepPage = null;
	pz_CurrentRuleKey = "";
}

private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pxProComHelpURI").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyOwner").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pxPortalHelpURI").buildPropertyQuery();
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pxPortalHelpURI").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyCategory").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-DECLARE-EXPRESSIONS PEGA-HELPCONTENT .PXPORTALHELPURI! #20181220T120749.906 GMT", "Pega-HelpContent .pxPortalHelpURI ", "Pega-ProcessEngine", "08-03-01", "20190514T131122.287 GMT");
}
