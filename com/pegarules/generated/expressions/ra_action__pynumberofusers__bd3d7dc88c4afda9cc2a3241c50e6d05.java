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
public class ra_action__pynumberofusers__bd3d7dc88c4afda9cc2a3241c50e6d05 extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Declare_Expressions._pyNumberOfUsers..Data_Portal_PegaAdminStudio.Action");
	public ra_action__pynumberofusers__bd3d7dc88c4afda9cc2a3241c50e6d05(PegaAPI aContext) {
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
/* Instance RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */

// Pega-RULES Declarative Processing Rule Instance

// Expression: .pyNumberOfUsers
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).evaluateWhen('pzCanGetNodesInCluster'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).evaluateWhen(\"pzCanGetNodesInCluster\"))");
// Expression: = (@(Pega-RULES:ExpressionEvaluators).evaluateWhen("pzCanGetNodesInCluster"))

evaluationResult = (pega.<Boolean>resolveMethodCall("evaluateWhen--(String)", "evaluateWhen", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pzCanGetNodesInCluster" })).booleanValue();
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", String.valueOf(evaluationResult), oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT", "When = (@(Pega-RULES:ExpressionEvaluators).evaluateWhen('pzCanGetNodesInCluster'))", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("When = (@(Pega-RULES:ExpressionEvaluators).evaluateWhen(\"pzCanGetNodesInCluster\"))" + ".  Result: " + String.valueOf(evaluationResult));
if(evaluationResult){
if (pega.isTraceEnabled("Declare Expression", oTraceInfo_0)) {
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT", "D_pzClusterMembersInformation.pxNodeDetails().pxNumberUsers", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("D_pzClusterMembersInformation.pxNodeDetails().pxNumberUsers");
// Expression: D_pzClusterMembersInformation.pxNodeDetails().pxNumberUsers
com.pega.pegarules.pub.clipboard.ClipboardPropertyCollection pz_5 = pega.propertyReferenceFilter(pega.findPageWithException("D_pzClusterMembersInformation", null).getName()+".pxNodeDetails().pxNumberUsers", pega.findPageWithException("D_pzClusterMembersInformation", null), PropertyInfo.MODE_STRING);
if ((pz_5 == null) || (pz_5.size() == 0)) {
pz_4.setValue(BigDecimal.ZERO);
} else {
java.util.Iterator numericArgsIterator = pz_5.iterator();

BigDecimal sumOfVals = BigDecimal.valueOf(0.0);

while (numericArgsIterator.hasNext()) {
  ClipboardProperty prop = (ClipboardProperty)numericArgsIterator.next();
  double argVal = 0;
  myStepPage = prop.getParentPage();
{
PRStackFrame sf = pega.pushStackFrame("parentpage", null, myStepPage, false, false);
try {
  if (true) {
      sumOfVals = sumOfVals.add(prop.toBigDecimal());
  }
} finally {
  pega.popStackFrame(sf, false);
}
}
}
pz_4.setValue(sumOfVals);
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT", "@(Pega-RULES:ExpressionEvaluators).round(-1)", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("@(Pega-RULES:ExpressionEvaluators).round(-1)");
// Expression: @(Pega-RULES:ExpressionEvaluators).round(-1)
int pz_6 = FUAUtil.intValue(pega.<com.pega.ibm.icu.math.BigDecimal>resolveMethodCall("round--(BigDecimal)", "round", "Pega-RULES", "ExpressionEvaluators", new Object[] { BigDecimal.valueOf(((-1))) }));
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
		cpPrimary.addMessage("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT\t" + thrCause.getMessage());
		if (oLog.isWarnEnabled()) {			oLog.warn("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT\t" + thrCause.getMessage(), ice);		}	} else {
		oLog.error("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT\t" + thrCause.getMessage(), ice);	}
}
} catch (RuntimeException re) {
if (currentProperty != null && pega.isInputProcessing() && (!tools.getInfEngUtils().ignoreArithmeticException() || !(re instanceof ArithmeticException))) {
String message = "ChainingException	Rule-Declare-Expressions	Data-Portal-PegaAdminStudio..pyNumberOfUsers.	" + re.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, re);
} else { throw re;
}
} catch (PRSecurityException se) {
if (currentProperty != null && pega.isInputProcessing()) {
String message = "ChainingException	Rule-Declare-Expressions	Data-Portal-PegaAdminStudio..pyNumberOfUsers.	" + se.toString();
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
	"Rule-Declare-Expressions:.PYNUMBEROFUSERS!"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo(".PYNUMBEROFUSERS!","Rule-Declare-Expressions","DATA-PORTAL-PEGAADMINSTUDIO",false,"","Pega-Desktop","08-01-01","RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT","!.PYNUMBEROFUSERS!",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1338257248)
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
//	RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT:20190514T131100.383 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "d75bb663b15bbb7190b0c3eb526c063f";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal-PegaAdminStudio";
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

private static final PropertyQuery propertyQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyNumberOfUsers").buildPropertyQuery();
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyNumberOfUsers").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYNUMBEROFUSERS! #20180713T135046.136 GMT", "Data-Portal-PegaAdminStudio .pyNumberOfUsers ", "Pega-Desktop", "08-01-01", "20190514T131100.383 GMT");
}
