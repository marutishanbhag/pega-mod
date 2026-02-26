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
public class ra_action__pyrulecallparamsclass__737300540fa24ad1ce111d931aa67e5f extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Declare_Expressions._pyRuleCallParamsClass..Data_MO_Activity_Utility.Action");
	public ra_action__pyrulecallparamsclass__737300540fa24ad1ce111d931aa67e5f(PegaAPI aContext) {
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
/* Instance RULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT	Pega-ProcessArchitect:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */

// Pega-RULES Declarative Processing Rule Instance

// Expression: .pyRuleCallParamsClass
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyActivityTypeSelector, '=', 'AUTOMATION'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyActivityTypeSelector, \"=\", \"AUTOMATION\"))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyActivityTypeSelector, "=", "AUTOMATION"))

evaluationResult = FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "AUTOMATION");
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyActivityTypeSelector, '=', 'AUTOMATION'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyActivityTypeSelector, \"=\", \"AUTOMATION\"))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT", ".pyAutomationAppliesTo", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug(".pyAutomationAppliesTo");
// Expression: .pyAutomationAppliesTo
String pz_7 = scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
pz_4.setValue(pz_7);
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT", ".pyClassName", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug(".pyClassName");
// Expression: .pyClassName
String pz_9 = scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
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
		cpPrimary.addMessage("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT\t" + thrCause.getMessage());
		if (oLog.isWarnEnabled()) {			oLog.warn("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT\t" + thrCause.getMessage(), ice);		}	} else {
		oLog.error("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT\t" + thrCause.getMessage(), ice);	}
}
} catch (RuntimeException re) {
if (currentProperty != null && pega.isInputProcessing() && (!tools.getInfEngUtils().ignoreArithmeticException() || !(re instanceof ArithmeticException))) {
String message = "ChainingException	Rule-Declare-Expressions	Data-MO-Activity-Utility..pyRuleCallParamsClass.	" + re.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, re);
} else { throw re;
}
} catch (PRSecurityException se) {
if (currentProperty != null && pega.isInputProcessing()) {
String message = "ChainingException	Rule-Declare-Expressions	Data-MO-Activity-Utility..pyRuleCallParamsClass.	" + se.toString();
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
	"Rule-Declare-Expressions:.PYRULECALLPARAMSCLASS!"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo(".PYRULECALLPARAMSCLASS!","Rule-Declare-Expressions","DATA-MO-ACTIVITY-UTILITY",false,"","Pega-ProcessArchitect","08-01-01","RULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT","!.PYRULECALLPARAMSCLASS!",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-242431090)
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
//	RULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT:20190514T131046.481 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "80509d7fd25eae72c50e604ac0c5e12a";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-MO-Activity-Utility";
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

private static final ScalarValueQuery scalarValueQuery_5 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyActivityTypeSelector").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_6 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyAutomationAppliesTo").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyRuleCallParamsClass").buildPropertyQuery();
private static final PropertyQuery propertyQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyRuleCallParamsClass").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyClassName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-DECLARE-EXPRESSIONS DATA-MO-ACTIVITY-UTILITY .PYRULECALLPARAMSCLASS! #20180713T140736.153 GMT", "Data-MO-Activity-Utility .pyRuleCallParamsClass ", "Pega-ProcessArchitect", "08-01-01", "20190514T131046.481 GMT");
}
