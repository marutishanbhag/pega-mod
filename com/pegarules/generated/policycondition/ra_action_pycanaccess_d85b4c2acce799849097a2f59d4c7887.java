package com.pegarules.generated.policycondition;
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
import java.util.Iterator;
import java.util.Set;
public class ra_action_pycanaccess_d85b4c2acce799849097a2f59d4c7887  extends com.pega.pegarules.priv.AbstractFUASupport implements Activity, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Access_PolicyCondition.pyCanAccess.Work_Cover_Task.Action");
	public ra_action_pycanaccess_d85b4c2acce799849097a2f59d4c7887(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
		cleanForReuse(aContext);
	}
public void getSQLFilters() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-ACCESS-POLICYCONDITION WORK-COVER-TASK PYCANACCESS #20180920T171624.811 GMT	Pega-ProcessEngine:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Yes	baserule=false */
try {
String fieldName = "";
String className = tools.getParamValue("pyReportClassName");
tools.getStepStatus().clear();
ClipboardPage myStepPage = tools.getStepPage();

if(!tools.getAuthorizationHandle().isTrustedContext()){
if( myStepPage != null && myStepPage.getClassName().equals("Embed-ReportContent")) {
/*Copy filters to pyFilters*/
ClipboardPage sqlFilter = tools.createPage("Embed-ReportFilters", "");

/*Copy appropriate Filter Logic to pyFilterLogic*/
if(getWhenEvaluationResult("pyCanAccessTask")){


/*No Filter logic is defined. So filters should not be added*/
return;
}

else{sqlFilter.putString(".pyFilterLogic","pyCanAccess_A OR pyCanAccess_B ");
}


sqlFilter.putString(".pyFilter(1).pyFilterName",".pxCreateOperator");
sqlFilter.putString(".pyFilter(1).pyFilterOperation","=");
sqlFilter.putString(".pyFilter(1).pyFilterValue","pyCanAccess$_OperatorID.pyUserIdentifier");
sqlFilter.putString(".pyFilter(1).pyLogicLabel","pyCanAccess_A");
sqlFilter.putString(".pyFilter(1).pyUseNullIfEmpty","true");


sqlFilter.putString(".pyFilter(2).pyFilterName",".pyAssignedTo");
sqlFilter.putString(".pyFilter(2).pyFilterOperation","=");
sqlFilter.putString(".pyFilter(2).pyFilterValue","pyCanAccess$_OperatorID.pyUserIdentifier");
sqlFilter.putString(".pyFilter(2).pyLogicLabel","pyCanAccess_B");
sqlFilter.putString(".pyFilter(2).pyUseNullIfEmpty","true");


 myStepPage.putPage(".pyFilters", sqlFilter);


}

/*Copy parameters to parameters Page*/
ClipboardProperty destParameters = myStepPage.getProperty(".pyParameters");
ClipboardPage destPage = null;
/*Copy pyPagesAndClasses to pyPagesAndClasses Page*/
ClipboardProperty destPagesAndClasses = myStepPage.getProperty(".pyPagesAndClasses");
destPage = tools.createPage("Embed-PagesAndClasses","");


destPage.putString(".pxObjClass","Embed-PagesAndClasses");
destPage.putString(".pyPagesAndClassesClass","Data-Admin-Operator-ID");
destPage.putString(".pyPagesAndClassesPage","pyCanAccess$_OperatorID");
destPagesAndClasses.add(1,destPage);
}

} catch (ChainingException anyChainingException) {
  throw anyChainingException;

} catch (RuntimeException anyException) {
oLog.error("Exception caught while getting SQL filters", anyException);
throw new IndeterminateConditionalException("in RULE-ACCESS-POLICYCONDITION WORK-COVER-TASK PYCANACCESS #20180920T171624.811 GMT: " + anyException.getMessage(), anyException);
}
}
}

/**
 * evaluation of when rule
 */
private boolean getWhenEvaluationResult(String whenName){
	StringMap whenRule = new HashStringMap();
	whenRule.put("pxObjClass","Rule-Access-When");
	whenRule.put("pyClassName","Work-Cover-Task");
	whenRule.put("pyBlockName", whenName);
	return tools.evaluateWhen(whenRule);
	}
public void perform() {getSQLFilters();}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Access-PolicyCondition:PYCANACCESS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYCANACCESS","Rule-Access-PolicyCondition","WORK-COVER-TASK",false,"","Pega-ProcessEngine","08-02-01","RULE-ACCESS-POLICYCONDITION WORK-COVER-TASK PYCANACCESS #20180920T171624.811 GMT","!PYCANACCESS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-216683574)
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
//	RULE-ACCESS-POLICYCONDITION WORK-COVER-TASK PYCANACCESS #20180920T171624.811 GMT:20180920T171624.811 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "9c6518adcc78de360d823a6a8a3c7c4a";
	}

	public String getDefinitionAppliesToClass() {
		return "Work-Cover-Task";
	}
public String getAspect() {
return "Action";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}

/**
 * This is the cleanForReuse from the PolicyConditionActionAssembler
 */
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ACCESS-POLICYCONDITION WORK-COVER-TASK PYCANACCESS #20180920T171624.811 GMT", "Work-Cover-Task pyCanAccess", "Pega-ProcessEngine", "08-02-01", "20180920T171624.811 GMT");
}
