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
public class ra_action__pytotalbrokenqueuecount__aa3aed5d31ee197cc95aaf59d935d5d3 extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Declare_Expressions._pyTotalBrokenQueueCount..Data_Portal_PegaAdminStudio.Action");
	public ra_action__pytotalbrokenqueuecount__aa3aed5d31ee197cc95aaf59d935d5d3(PegaAPI aContext) {
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
/* Instance RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYTOTALBROKENQUEUECOUNT! #20180713T135046.161 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */

// Pega-RULES Declarative Processing Rule Instance

// Expression: .pyTotalBrokenQueueCount
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
pega.logTraceEvent("Declare Expression", "Expression", null, oTraceInfo_0, "RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYTOTALBROKENQUEUECOUNT! #20180713T135046.161 GMT", "D_pzQueueProcessorSummaryInfo.pxQueueProcessorInfo().pxNumOfBrokenMessages", false, myStepPage, null, null);
}
if (oLog.isDebugEnabled()) oLog.debug("D_pzQueueProcessorSummaryInfo.pxQueueProcessorInfo().pxNumOfBrokenMessages");
// Expression: D_pzQueueProcessorSummaryInfo.pxQueueProcessorInfo().pxNumOfBrokenMessages
com.pega.pegarules.pub.clipboard.ClipboardPropertyCollection pz_5 = pega.propertyReferenceFilter(pega.findPageWithException("D_pzQueueProcessorSummaryInfo", null).getName()+".pxQueueProcessorInfo().pxNumOfBrokenMessages", pega.findPageWithException("D_pzQueueProcessorSummaryInfo", null), PropertyInfo.MODE_STRING);
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
		cpPrimary.addMessage("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYTOTALBROKENQUEUECOUNT! #20180713T135046.161 GMT\t" + thrCause.getMessage());
		if (oLog.isWarnEnabled()) {			oLog.warn("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYTOTALBROKENQUEUECOUNT! #20180713T135046.161 GMT\t" + thrCause.getMessage(), ice);		}	} else {
		oLog.error("Declarative-NotExecuted\tRULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYTOTALBROKENQUEUECOUNT! #20180713T135046.161 GMT\t" + thrCause.getMessage(), ice);	}
}
} catch (RuntimeException re) {
if (currentProperty != null && pega.isInputProcessing() && (!tools.getInfEngUtils().ignoreArithmeticException() || !(re instanceof ArithmeticException))) {
String message = "ChainingException	Rule-Declare-Expressions	Data-Portal-PegaAdminStudio..pyTotalBrokenQueueCount.	" + re.toString();
tools.getInfEngUtils().addConstraintMessage(currentProperty, null, message, null);
oLog.error(message, re);
} else { throw re;
}
} catch (PRSecurityException se) {
if (currentProperty != null && pega.isInputProcessing()) {
String message = "ChainingException	Rule-Declare-Expressions	Data-Portal-PegaAdminStudio..pyTotalBrokenQueueCount.	" + se.toString();
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
	"Rule-Declare-Expressions:.PYTOTALBROKENQUEUECOUNT!"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo(".PYTOTALBROKENQUEUECOUNT!","Rule-Declare-Expressions","DATA-PORTAL-PEGAADMINSTUDIO",false,"","Pega-Desktop","08-01-01","RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYTOTALBROKENQUEUECOUNT! #20180713T135046.161 GMT","!.PYTOTALBROKENQUEUECOUNT!",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",979835051)
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
//	RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYTOTALBROKENQUEUECOUNT! #20180713T135046.161 GMT:20190514T131100.842 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "3ab25ae9fd08899fd517da78ab809a7a";
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

private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyTotalBrokenQueueCount").buildPropertyQuery();
private static final PropertyQuery propertyQuery_3 = FUAUtil.createQueryBuilder().scalarProperty("pyTotalBrokenQueueCount").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-DECLARE-EXPRESSIONS DATA-PORTAL-PEGAADMINSTUDIO .PYTOTALBROKENQUEUECOUNT! #20180713T135046.161 GMT", "Data-Portal-PegaAdminStudio .pyTotalBrokenQueueCount ", "Pega-Desktop", "08-01-01", "20190514T131100.842 GMT");
}
