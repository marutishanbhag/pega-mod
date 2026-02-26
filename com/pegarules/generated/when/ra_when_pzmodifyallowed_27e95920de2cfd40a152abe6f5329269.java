package com.pegarules.generated.when;
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
import com.pega.pegarules.priv.util.RulePool;
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
public class ra_when_pzmodifyallowed_27e95920de2cfd40a152abe6f5329269 extends com.pega.pegarules.priv.AbstractFUASupport implements WhenBlock, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Access_When.pzModifyAllowed.Data_Admin_Operator_ID.When");
	public ra_when_pzmodifyallowed_27e95920de2cfd40a152abe6f5329269(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public boolean evaluate() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ID PZMODIFYALLOWED #20180713T132502.549 GMT	Pega-Engine:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pega.activityStepWhenProlog(oTraceInfo_0);
try {
tools.getStepStatus().clear();
ClipboardPage myStepPage = tools.getStepPage();
// Expression: =((true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@HaveRole(this, "PegaRULES:SysAdm5"), "=", true)))||((true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@CanEditThisOperator(this), "=", true)))&&(!((true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@startsWith(.pyAccessGroup, "PegaRULES:SysAdmin"), "=", true)))||(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@PropertyListContains(".pyAccessGroupsAdditional", "PegaRULES:SysAdmin",this), "=", true)))||(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(.pyUserIdentifier, "=", "Administrator@pega.com")))||(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@IsOperatorGrantedRole(this,"PegaRULES:SysAdm5"), "=", true)))||(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@callAccessWhen(this, pzHasMTRestrictedRoles ,"Data-Admin-Operator-ID", myStepPage), "=", true)))))))
boolean pz_3 = ((true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("HaveRole--(Activity,String)", "HaveRole", null, null, new Object[] { tools, "PegaRULES:SysAdm5" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))) || ((true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("CanEditThisOperator--(Activity)", "CanEditThisOperator", null, null, new Object[] { tools })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))) && ((!(((((true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, null, new Object[] { scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "PegaRULES:SysAdmin" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))) || (true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("PropertyListContains--(String,String,Activity)", "PropertyListContains", null, null, new Object[] { ".pyAccessGroupsAdditional", "PegaRULES:SysAdmin", tools })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true)))) || (true == FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "Administrator@pega.com"))) || (true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("IsOperatorGrantedRole--(Activity,String)", "IsOperatorGrantedRole", null, null, new Object[] { tools, "PegaRULES:SysAdm5" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true)))) || (true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("callAccessWhen--(PublicAPI,String,String,ClipboardPage)", "callAccessWhen", null, null, new Object[] { tools, "pzHasMTRestrictedRoles", "Data-Admin-Operator-ID", myStepPage })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))))))));
pega.activityStepWhenEpilog(oTraceInfo_0, pz_3, false);
	return pz_3;

} catch (ChainingException anyChainingException) {
  throw anyChainingException;

} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("in RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ID PZMODIFYALLOWED #20180713T132502.549 GMT: " + anyException.getMessage(), anyException);
}
}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final RulePool<ra_when_pzmodifyallowed_27e95920de2cfd40a152abe6f5329269> oWhenPool = new RulePool<ra_when_pzmodifyallowed_27e95920de2cfd40a152abe6f5329269>();
public static boolean invoke(PegaAPI aTools) {
ra_when_pzmodifyallowed_27e95920de2cfd40a152abe6f5329269 when = oWhenPool.borrow();
if (when == null) {
when = new ra_when_pzmodifyallowed_27e95920de2cfd40a152abe6f5329269(aTools);
} else {
when.cleanForReuse(aTools);
}
try {
aTools.beforeEvaluateWhen();
return when.evaluate();
} finally {
when.cleanForReuse(null);
oWhenPool.release(when);
}}
private static final String oDependencies [] = {
	"Rule-Access-When:PZMODIFYALLOWED"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZMODIFYALLOWED","Rule-Access-When","DATA-ADMIN-OPERATOR-ID",false,"","Pega-Engine","08-01-01","RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ID PZMODIFYALLOWED #20180713T132502.549 GMT","!PZMODIFYALLOWED",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1876059993)
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
//	RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ID PZMODIFYALLOWED #20180713T132502.549 GMT:20180713T132502.549 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "b6206ec6639d74f960116438a8372012";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Operator-ID";
	}
public String getAspect() {
return "When";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}

/**
 * This is the cleanForReuse from the WhenAssembler
 */
public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
}

private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyAccessGroup").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_2 = FUAUtil.createQueryBuilder().allowMissingPropertyException().scalarProperty("pyUserIdentifier").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ID PZMODIFYALLOWED #20180713T132502.549 GMT", "Data-Admin-Operator-ID pzModifyAllowed", "Pega-Engine", "08-01-01", "20180713T132502.549 GMT");
}
