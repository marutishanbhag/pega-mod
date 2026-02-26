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
public class ra_action__pynumberofactiveappfilters__612b3e8d710fd6709fb1b712e8c47cc1 extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Declare_Expressions._pyNumberOfActiveAppFilters..PegaGadget_Filter.Action");
	public ra_action__pynumberofactiveappfilters__612b3e8d710fd6709fb1b712e8c47cc1(PegaAPI aContext) {
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
/* Instance RULE-DECLARE-EXPRESSIONS PEGAGADGET-FILTER .PYNUMBEROFACTIVEAPPFILTERS! #20180713T133414.567 GMT	Pega-Gadgets:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */

// Pega-RULES Declarative Processing Rule Instance

// Expression: .pyNumberOfActiveAppFilters
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS PEGAGADGET-FILTER .PYNUMBEROFACTIVEAPPFILTERS! #20180713T133414.567 GMT", ".pyApplicationFilterChoicesCopy()", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug(".pyApplicationFilterChoicesCopy()");
// Expression: .pyApplicationFilterChoicesCopy()
com.pega.pegarules.pub.clipboard.ClipboardPropertyCollection pz_5 = pega.propertyReferenceFilter(".pyApplicationFilterChoicesCopy()", myStepPage, PropertyInfo.MODE_PAGE);
// Expression: .pyApplicationFilterChoicesCopy()
com.pega.pegarules.pub.clipboard.ClipboardPropertyCollection pz_6 = pega.propertyReferenceFilter(".pyApplicationFilterChoicesCopy()", myStepPage, PropertyInfo.MODE_PAGE);
// Expression: .pyFilterActive == "true"
if ((pz_5 == null) || ((pz_5).size() == 0)) {
pz_4.setValue(0);
} else {
java.util.Iterator numericArgsIterator = pz_5.iterator();

int argCount = 0;

while (numericArgsIterator.hasNext()) {
  myStepPage = ((ClipboardProperty)numericArgsIterator.next()).getPageValue();
{
PRStackFrame sf = pega.pushStackFrame("parentpage", null, myStepPage, false, false);
try {
  if ((scalarValueQuery_7.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) == tools.interpretBoolean("true"))) {
      argCount++;
  }
} finally {
  pega.popStackFrame(sf, false);
}
}
}
pz_4.setValue(argCount);
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
		cpPrimary.addMessage("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS PEGAGADGET-FILTER .PYNUMBEROFACTIVEAPPFILTERS! #20180713T133414.567 GMT\t" + thrCause.getMessage());
		if (oLog.isWarnEnabled()) {			oLog.warn("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS PEGAGADGET-FILTER .PYNUMBEROFACTIVEAPPFILTERS! #20180713T133414.567 GMT\t" + thrCause.getMessage(), ice);		}	} else {
		oLog.error("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS PEGAGADGET-FILTER .PYNUMBEROFACTIVEAPPFILTERS! #20180713T133414.567 GMT\t" + thrCause.getMessage(), ice);	}
}
} catch (RuntimeException re) {
if (currentProperty != null && pega.isInputProcessing() && (!tools.getInfEngUtils().ignoreArithmeticException() || !(re instanceof ArithmeticException))) {
String message = "ChainingException	Rule-Declare-Expressions	PegaGadget-Filter..pyNumberOfActiveAppFilters.	" + re.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, re);
} else { throw re;
}
} catch (PRSecurityException se) {
if (currentProperty != null && pega.isInputProcessing()) {
String message = "ChainingException	Rule-Declare-Expressions	PegaGadget-Filter..pyNumberOfActiveAppFilters.	" + se.toString();
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
	"Rule-Declare-Expressions:.PYNUMBEROFACTIVEAPPFILTERS!"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo(".PYNUMBEROFACTIVEAPPFILTERS!","Rule-Declare-Expressions","PEGAGADGET-FILTER",false,"","Pega-Gadgets","08-01-01","RULE-DECLARE-EXPRESSIONS PEGAGADGET-FILTER .PYNUMBEROFACTIVEAPPFILTERS! #20180713T133414.567 GMT","!.PYNUMBEROFACTIVEAPPFILTERS!",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1001467830)
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
//	RULE-DECLARE-EXPRESSIONS PEGAGADGET-FILTER .PYNUMBEROFACTIVEAPPFILTERS! #20180713T133414.567 GMT:20190514T131032.777 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "020c827b9f1e9312aa693e5c3ffe53c3";
	}

	public String getDefinitionAppliesToClass() {
		return "PegaGadget-Filter";
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

private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyNumberOfActiveAppFilters").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_7 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyFilterActive").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyNumberOfActiveAppFilters").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-DECLARE-EXPRESSIONS PEGAGADGET-FILTER .PYNUMBEROFACTIVEAPPFILTERS! #20180713T133414.567 GMT", "PegaGadget-Filter .pyNumberOfActiveAppFilters ", "Pega-Gadgets", "08-01-01", "20190514T131032.777 GMT");
}
