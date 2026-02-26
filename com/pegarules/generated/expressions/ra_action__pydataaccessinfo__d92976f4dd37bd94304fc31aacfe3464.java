package com.pegarules.generated.expressions;
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
public class ra_action__pydataaccessinfo__d92976f4dd37bd94304fc31aacfe3464 extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Declare_Expressions._pyDataAccessInfo..Rule_Obj_Property.Action");
	public ra_action__pydataaccessinfo__d92976f4dd37bd94304fc31aacfe3464(PegaAPI aContext) {
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
/* Instance RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT	Pega-SystemArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */

// Pega-RULES Declarative Processing Rule Instance

// Expression: .pyDataAccessInfo
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, '=', '')) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyGatewayClass, '!=', ''))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, \"=\", \"\")) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyGatewayClass, \"!=\", \"\"))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, "=", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, "=", "")) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyGatewayClass, "!=", ""))

evaluationResult = ((FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "String") && FUAUtil.compareTwoValues(scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "")) && FUAUtil.compareTwoValues(scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, ""));
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, '=', '')) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyGatewayClass, '!=', ''))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, \"=\", \"\")) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyGatewayClass, \"!=\", \"\"))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "@getLocalizedText('DataAccessLinked','.pyMessageLabel', tools) +'  (' +.pyGatewayClass + ')'", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("@getLocalizedText(\"DataAccessLinked\",\".pyMessageLabel\", tools) +\"  (\" +.pyGatewayClass + \")\"");
// Expression: @getLocalizedText("DataAccessLinked",".pyMessageLabel", tools) +"  (" +.pyGatewayClass + ")"
String pz_8 = (((pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "DataAccessLinked", ".pyMessageLabel", tools }) + "  (") + scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + ")");
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, '=', LINKED))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, \"=\", LINKED))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, "=", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, "=", LINKED))

evaluationResult = (FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "String") && FUAUtil.compareTwoValues(scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "LINKED"));
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, '=', LINKED))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, \"=\", LINKED))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "@getLocalizedText('DataAccessLinked','.pyMessageLabel', tools) +'  (' +.pyGatewayClass + ')'", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("@getLocalizedText(\"DataAccessLinked\",\".pyMessageLabel\", tools) +\"  (\" +.pyGatewayClass + \")\"");
// Expression: @getLocalizedText("DataAccessLinked",".pyMessageLabel", tools) +"  (" +.pyGatewayClass + ")"
String pz_9 = (((pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "DataAccessLinked", ".pyMessageLabel", tools }) + "  (") + scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + ")");
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, '=', MANUAL))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, \"=\", MANUAL))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, "=", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, "=", MANUAL))

evaluationResult = (FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "String") && FUAUtil.compareTwoValues(scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "MANUAL"));
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, '=', MANUAL))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyAdvancedPropType, \"=\", MANUAL))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "@getLocalizedText('DataAccessManual','.pyMessageLabel', tools)", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("@getLocalizedText(\"DataAccessManual\",\".pyMessageLabel\", tools)");
// Expression: @getLocalizedText("DataAccessManual",".pyMessageLabel", tools)
String pz_10 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "DataAccessManual", ".pyMessageLabel", tools });
pz_4.setValue(pz_10);
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '!=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, '=', AUTOMATIC))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"!=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, \"=\", AUTOMATIC))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, "!=", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, "=", AUTOMATIC))

evaluationResult = (FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "String") && FUAUtil.compareTwoValues(scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "AUTOMATIC"));
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '!=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, '=', AUTOMATIC))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"!=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, \"=\", AUTOMATIC))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "@getLocalizedText('DataAccessReference','.pyMessageLabel', tools) + ' ('+.pxPages(DP).pyLabel+')'", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("@getLocalizedText(\"DataAccessReference\",\".pyMessageLabel\", tools) + \" (\"+.pxPages(DP).pyLabel+\")\"");
// Expression: @getLocalizedText("DataAccessReference",".pyMessageLabel", tools) + " ("+.pxPages(DP).pyLabel+")"
String pz_14 = (((pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "DataAccessReference", ".pyMessageLabel", tools }) + " (") + scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + ")");
pz_4.setValue(pz_14);
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '!=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, '=', AUTOMATICNONREF))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"!=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, \"=\", AUTOMATICNONREF))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, "!=", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, "=", AUTOMATICNONREF))

evaluationResult = (FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "String") && FUAUtil.compareTwoValues(scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "AUTOMATICNONREF"));
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '!=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, '=', AUTOMATICNONREF))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"!=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, \"=\", AUTOMATICNONREF))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "@getLocalizedText('DataAccessCopy','.pyMessageLabel', tools) +'  ('+.pxPages(DP).pyLabel+')'", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("@getLocalizedText(\"DataAccessCopy\",\".pyMessageLabel\", tools) +\"  (\"+.pxPages(DP).pyLabel+\")\"");
// Expression: @getLocalizedText("DataAccessCopy",".pyMessageLabel", tools) +"  ("+.pxPages(DP).pyLabel+")"
String pz_15 = (((pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "DataAccessCopy", ".pyMessageLabel", tools }) + "  (") + scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + ")");
pz_4.setValue(pz_15);
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '!=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, '=', MANUAL))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"!=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, \"=\", MANUAL))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, "!=", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, "=", MANUAL))

evaluationResult = (FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "String") && FUAUtil.compareTwoValues(scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "MANUAL"));
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, '!=', String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, '=', MANUAL))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyPropertyMode, \"!=\", String)) && (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDataRetrievalType, \"=\", MANUAL))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "@getLocalizedText('DataAccessManual','.pyMessageLabel', tools)", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("@getLocalizedText(\"DataAccessManual\",\".pyMessageLabel\", tools)");
// Expression: @getLocalizedText("DataAccessManual",".pyMessageLabel", tools)
String pz_16 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "DataAccessManual", ".pyMessageLabel", tools });
pz_4.setValue(pz_16);
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyIsAssociation, '=', true)) || (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyIsReference, '=', true))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyIsAssociation, \"=\", true)) || (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyIsReference, \"=\", true))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyIsAssociation, "=", true)) || (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyIsReference, "=", true))

evaluationResult = (FUAUtil.compareTwoValues(scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.EQ, String.valueOf(true)) || FUAUtil.compareTwoValues(scalarValueQuery_18.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.EQ, String.valueOf(true)));
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyIsAssociation, '=', true)) || (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyIsReference, '=', true))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyIsAssociation, \"=\", true)) || (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyIsReference, \"=\", true))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "@getLocalizedText('DataAccessAdvance','.pyMessageLabel', tools)", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("@getLocalizedText(\"DataAccessAdvance\",\".pyMessageLabel\", tools)");
// Expression: @getLocalizedText("DataAccessAdvance",".pyMessageLabel", tools)
String pz_19 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "DataAccessAdvance", ".pyMessageLabel", tools });
pz_4.setValue(pz_19);
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "@getLocalizedText('DataAccessManual','.pyMessageLabel', tools)", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("@getLocalizedText(\"DataAccessManual\",\".pyMessageLabel\", tools)");
// Expression: @getLocalizedText("DataAccessManual",".pyMessageLabel", tools)
String pz_20 = pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "DataAccessManual", ".pyMessageLabel", tools });
pz_4.setValue(pz_20);
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
		cpPrimary.addMessage("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT\t" + thrCause.getMessage());
		if (oLog.isWarnEnabled()) {			oLog.warn("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT\t" + thrCause.getMessage(), ice);		}	} else {
		oLog.error("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT\t" + thrCause.getMessage(), ice);	}
}
} catch (RuntimeException re) {
if (currentProperty != null && pega.isInputProcessing() && (!tools.getInfEngUtils().ignoreArithmeticException() || !(re instanceof ArithmeticException))) {
String message = "ChainingException	Rule-Declare-Expressions	Rule-Obj-Property..pyDataAccessInfo.	" + re.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, re);
} else { throw re;
}
} catch (PRSecurityException se) {
if (currentProperty != null && pega.isInputProcessing()) {
String message = "ChainingException	Rule-Declare-Expressions	Rule-Obj-Property..pyDataAccessInfo.	" + se.toString();
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
	"Rule-Declare-Expressions:.PYDATAACCESSINFO!"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo(".PYDATAACCESSINFO!","Rule-Declare-Expressions","RULE-OBJ-PROPERTY",false,"","Pega-SystemArchitect","08-01-01","RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT","!.PYDATAACCESSINFO!",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-2023482515)
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
//	RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT:20190514T131034.457 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "23bd1d1ba140bbaac6de919c4e9495c3";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-Obj-Property";
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

public static final String[] pRef_13 = new String[] { "", "", "pxPages", "DP", "pyLabel", "" };
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().allowMissingPropertyException().pageGroup("pxPages", "DP").scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyPropertyMode").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyAdvancedPropType").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyDataAccessInfo").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyIsAssociation").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyIsReference").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyGatewayClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyDataRetrievalType").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyDataAccessInfo").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-DECLARE-EXPRESSIONS RULE-OBJ-PROPERTY .PYDATAACCESSINFO! #20180713T135632.762 GMT", "Rule-Obj-Property .pyDataAccessInfo ", "Pega-SystemArchitect", "08-01-01", "20190514T131034.457 GMT");
}
