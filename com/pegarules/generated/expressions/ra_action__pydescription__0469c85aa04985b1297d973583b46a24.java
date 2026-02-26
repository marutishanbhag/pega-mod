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
public class ra_action__pydescription__0469c85aa04985b1297d973583b46a24 extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Declare_Expressions._pyDescription..Embed_DeclarePageSource.Action");
	public ra_action__pydescription__0469c85aa04985b1297d973583b46a24(PegaAPI aContext) {
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
/* Instance RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT	Pega-SystemArchitect:08-04-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */

// Pega-RULES Declarative Processing Rule Instance

// Expression: .pyDescription
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, '=', Connector))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, \"=\", Connector))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, "=", Connector))

evaluationResult = FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "Connector");
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, '=', Connector))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, \"=\", Connector))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "@(Pega-RULES:Utilities).lookup('pyLabel','Rule-Obj-Class','','',.pyConnectorList) + (@equals(.pyConnectorName, '') ? '' : (' • ' + .pyConnectorClassName + ' • ' + .pyConnectorName))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("@(Pega-RULES:Utilities).lookup(\"pyLabel\",\"Rule-Obj-Class\",\"\",\"\",.pyConnectorList) + (@equals(.pyConnectorName, \"\") ? \"\" : (\" • \" + .pyConnectorClassName + \" • \" + .pyConnectorName))");
// Expression: @(Pega-RULES:Utilities).lookup("pyLabel","Rule-Obj-Class","","",.pyConnectorList) + (@equals(.pyConnectorName, "") ? "" : (" • " + .pyConnectorClassName + " • " + .pyConnectorName))
String pz_9 = (pega.<String>resolveMethodCall("lookup--(String,String,String,String,String)", "lookup", "Pega-RULES", "Utilities", new Object[] { "pyLabel", "Rule-Obj-Class", "", "", scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }) + ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue() ? "" : (((" • " + scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + " • ") + scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT))));
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, '=', ReportDefinition))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, \"=\", ReportDefinition))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, "=", ReportDefinition))

evaluationResult = FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "ReportDefinition");
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, '=', ReportDefinition))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, \"=\", ReportDefinition))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "'Report Definition' + (@equals(.pyLoadReportDefinition, '') ? '' : (' • ' + .pyReportDefinitionClass + ' • ' + .pyLoadReportDefinition))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("\"Report Definition\" + (@equals(.pyLoadReportDefinition, \"\") ? \"\" : (\" • \" + .pyReportDefinitionClass + \" • \" + .pyLoadReportDefinition))");
// Expression: "Report Definition" + (@equals(.pyLoadReportDefinition, "") ? "" : (" • " + .pyReportDefinitionClass + " • " + .pyLoadReportDefinition))
String pz_12 = ("Report Definition" + ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue() ? "" : (((" • " + scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + " • ") + scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT))));
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
if(!evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, '=', ObjOpen))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, \"=\", ObjOpen))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, "=", ObjOpen))

evaluationResult = FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "ObjOpen");
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, '=', ObjOpen))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, \"=\", ObjOpen))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "'Lookup' + (@equals(.pyLookupName, '') ? '' : (' • ' + .pyLookupName + ' (' + .pyLookupClassName + ')'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("\"Lookup\" + (@equals(.pyLookupName, \"\") ? \"\" : (\" • \" + .pyLookupName + \" (\" + .pyLookupClassName + \")\"))");
// Expression: "Lookup" + (@equals(.pyLookupName, "") ? "" : (" • " + .pyLookupName + " (" + .pyLookupClassName + ")"))
String pz_15 = ("Lookup" + ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue() ? "" : ((((" • " + scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + " (") + scalarValueQuery_14.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + ")")));
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, '=', DataTransform))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, \"=\", DataTransform))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, "=", DataTransform))

evaluationResult = FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "DataTransform");
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, '=', DataTransform))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, \"=\", DataTransform))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "'Data Transform' + (@equals(.pyDTName, '') ? '' : (' • ' + .pyClassName + ' • ' + .pyDTName))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("\"Data Transform\" + (@equals(.pyDTName, \"\") ? \"\" : (\" • \" + .pyClassName + \" • \" + .pyDTName))");
// Expression: "Data Transform" + (@equals(.pyDTName, "") ? "" : (" • " + .pyClassName + " • " + .pyDTName))
String pz_18 = ("Data Transform" + ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue() ? "" : (((" • " + scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + " • ") + scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT))));
pz_4.setValue(pz_18);
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, '=', AggregateSources))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, \"=\", AggregateSources))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, "=", AggregateSources))

evaluationResult = FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "AggregateSources");
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, '=', AggregateSources))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyDeclarePagesDataSource, \"=\", AggregateSources))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "'Aggregate sources' + (@equals(.pyAggregatedDataSourcesLabel, '') ? '' : (' • ' + .pyAggregatedDataSourcesLabel))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("\"Aggregate sources\" + (@equals(.pyAggregatedDataSourcesLabel, \"\") ? \"\" : (\" • \" + .pyAggregatedDataSourcesLabel))");
// Expression: "Aggregate sources" + (@equals(.pyAggregatedDataSourcesLabel, "") ? "" : (" • " + .pyAggregatedDataSourcesLabel))
String pz_20 = ("Aggregate sources" + ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_19.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue() ? "" : (" • " + scalarValueQuery_19.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT))));
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "'Activity' + (@equals(.pyLoadActivity, '') ? '' : (' • ' + .pyClassName + ' • ' + .pyLoadActivity))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("\"Activity\" + (@equals(.pyLoadActivity, \"\") ? \"\" : (\" • \" + .pyClassName + \" • \" + .pyLoadActivity))");
// Expression: "Activity" + (@equals(.pyLoadActivity, "") ? "" : (" • " + .pyClassName + " • " + .pyLoadActivity))
String pz_22 = ("Activity" + ((pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", null, null, new Object[] { scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" })).booleanValue() ? "" : (((" • " + scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) + " • ") + scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT))));
pz_4.setValue(pz_22);
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
		cpPrimary.addMessage("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT\t" + thrCause.getMessage());
		if (oLog.isWarnEnabled()) {			oLog.warn("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT\t" + thrCause.getMessage(), ice);		}	} else {
		oLog.error("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT\t" + thrCause.getMessage(), ice);	}
}
} catch (RuntimeException re) {
if (currentProperty != null && pega.isInputProcessing() && (!tools.getInfEngUtils().ignoreArithmeticException() || !(re instanceof ArithmeticException))) {
String message = "ChainingException	Rule-Declare-Expressions	Embed-DeclarePageSource..pyDescription.	" + re.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, re);
} else { throw re;
}
} catch (PRSecurityException se) {
if (currentProperty != null && pega.isInputProcessing()) {
String message = "ChainingException	Rule-Declare-Expressions	Embed-DeclarePageSource..pyDescription.	" + se.toString();
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
	"Rule-Declare-Expressions:.PYDESCRIPTION!"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo(".PYDESCRIPTION!","Rule-Declare-Expressions","EMBED-DECLAREPAGESOURCE",false,"","Pega-SystemArchitect","08-04-01","RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT","!.PYDESCRIPTION!",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",627072560)
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
//	RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT:20190920T064624.734 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "ad4d70bbcd0e674bb99d88fb33362b9e";
	}

	public String getDefinitionAppliesToClass() {
		return "Embed-DeclarePageSource";
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

private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyDeclarePagesDataSource").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyConnectorName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_10 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyLoadReportDefinition").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyDTName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_14 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyLookupClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_13 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyLookupName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyConnectorClassName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyConnectorList").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyDescription").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_21 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyLoadActivity").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_17 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyClassName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyDescription").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_11 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyReportDefinitionClass").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_19 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyAggregatedDataSourcesLabel").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-DECLARE-EXPRESSIONS EMBED-DECLAREPAGESOURCE .PYDESCRIPTION! #20190920T064624.734 GMT", "Embed-DeclarePageSource .pyDescription ", "Pega-SystemArchitect", "08-04-01", "20190920T064624.734 GMT");
}
