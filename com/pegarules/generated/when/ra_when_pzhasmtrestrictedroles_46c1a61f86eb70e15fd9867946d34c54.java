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
public class ra_when_pzhasmtrestrictedroles_46c1a61f86eb70e15fd9867946d34c54 extends com.pega.pegarules.priv.AbstractFUASupport implements WhenBlock, FUASupport, FUAReusable {
	private static final LogHelper  oLog = new LogHelper("Rule_Access_When.pzHasMTRestrictedRoles.Data_Admin_Operator_AccessGroup.When");
	public ra_when_pzhasmtrestrictedroles_46c1a61f86eb70e15fd9867946d34c54(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public boolean evaluate() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ACCESSGROUP PZHASMTRESTRICTEDROLES #20180713T131316.384 GMT	Pega-RULES:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
pega.activityStepWhenProlog(oTraceInfo_0);
try {
tools.getStepStatus().clear();
ClipboardPage myStepPage = tools.getStepPage();
// Expression: =(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@java("(((com.pega.pegarules.priv.context.PegaNode)tools.getRequestor().getNode()).isMultiTenantEnvironment()) ? Boolean.TRUE.toString() : Boolean.FALSE.toString()"), "=", true)))&&((!(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@HavePrivilege(tools, "pxAccessToMTRestrictedRules", "@baseclass", null), "=", true)))&&(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@CheckIfRoleListHasPrivilege(this, "pxAccessToMTRestrictedRules", "@baseclass"), "=", true))))||(!((true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@HaveRole(this, "PegaRULES:MultiTenantAdmin"), "=", true)))||(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@HaveRole(this, "PegaRULES:MTAdminProxy"), "=", true)))||(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@HavePrivilege(tools, "pxCanGrantMultitenantPrivs", "@baseclass", null), "=", true))))&&((true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@PropertyListContains(".pyUserRoles", "PegaRULES:MTAdminProxy",this), "=", true)))||(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@CheckIfRoleListHasPrivilege(this, "pxCanGrantMultitenantPrivs", "@baseclass"), "=", true)))))||(!(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@HaveRole(this, "PegaRULES:MultiTenantAdmin"), "=", true)))&&(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@PropertyListContains(".pyUserRoles", "PegaRULES:MultiTenantAdmin",this), "=", true))))||(!(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@HaveRole(this, "PegaRULES:MultiTenantAdmin"), "=", true)))&&(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@PropertyListContains(".pyUserRoles", "PegaRULES:HighAvailabilityAdministrator",this), "=", true))))||(!(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@HaveRole(this, "PegaRULES:MultiTenantAdmin"), "=", true)))&&(true=(@(Pega-RULES:ExpressionEvaluators).compareTwoValues(@PropertyListContains(".pyUserRoles", "PegaRULES:SysOpsAdministrator",this), "=", true)))))
boolean pz_1 = ((true == FUAUtil.compareTwoValues(((((com.pega.pegarules.priv.context.PegaNode)tools.getRequestor().getNode()).isMultiTenantEnvironment()) ? Boolean.TRUE.toString() : Boolean.FALSE.toString()), FUAUtil.C2VOp.EQ, String.valueOf(true))) && (((((((!(true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("HavePrivilege--(Activity,String,String,Page)", "HavePrivilege", null, null, new Object[] { tools, "pxAccessToMTRestrictedRules", "@baseclass", null })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))))) && (true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("CheckIfRoleListHasPrivilege--(Activity,String,String)", "CheckIfRoleListHasPrivilege", null, null, new Object[] { tools, "pxAccessToMTRestrictedRules", "@baseclass" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true)))) || (((!(((true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("HaveRole--(Activity,String)", "HaveRole", null, null, new Object[] { tools, "PegaRULES:MultiTenantAdmin" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))) || (true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("HaveRole--(Activity,String)", "HaveRole", null, null, new Object[] { tools, "PegaRULES:MTAdminProxy" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true)))) || (true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("HavePrivilege--(Activity,String,String,Page)", "HavePrivilege", null, null, new Object[] { tools, "pxCanGrantMultitenantPrivs", "@baseclass", null })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true)))))) && ((true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("PropertyListContains--(String,String,Activity)", "PropertyListContains", null, null, new Object[] { ".pyUserRoles", "PegaRULES:MTAdminProxy", tools })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))) || (true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("CheckIfRoleListHasPrivilege--(Activity,String,String)", "CheckIfRoleListHasPrivilege", null, null, new Object[] { tools, "pxCanGrantMultitenantPrivs", "@baseclass" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true)))))) || (((!(true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("HaveRole--(Activity,String)", "HaveRole", null, null, new Object[] { tools, "PegaRULES:MultiTenantAdmin" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))))) && (true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("PropertyListContains--(String,String,Activity)", "PropertyListContains", null, null, new Object[] { ".pyUserRoles", "PegaRULES:MultiTenantAdmin", tools })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))))) || (((!(true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("HaveRole--(Activity,String)", "HaveRole", null, null, new Object[] { tools, "PegaRULES:MultiTenantAdmin" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))))) && (true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("PropertyListContains--(String,String,Activity)", "PropertyListContains", null, null, new Object[] { ".pyUserRoles", "PegaRULES:HighAvailabilityAdministrator", tools })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))))) || (((!(true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("HaveRole--(Activity,String)", "HaveRole", null, null, new Object[] { tools, "PegaRULES:MultiTenantAdmin" })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))))) && (true == FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("PropertyListContains--(String,String,Activity)", "PropertyListContains", null, null, new Object[] { ".pyUserRoles", "PegaRULES:SysOpsAdministrator", tools })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true))))));
pega.activityStepWhenEpilog(oTraceInfo_0, pz_1, false);
	return pz_1;

} catch (ChainingException anyChainingException) {
  throw anyChainingException;

} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException("in RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ACCESSGROUP PZHASMTRESTRICTEDROLES #20180713T131316.384 GMT: " + anyException.getMessage(), anyException);
}
}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final RulePool<ra_when_pzhasmtrestrictedroles_46c1a61f86eb70e15fd9867946d34c54> oWhenPool = new RulePool<ra_when_pzhasmtrestrictedroles_46c1a61f86eb70e15fd9867946d34c54>();
public static boolean invoke(PegaAPI aTools) {
ra_when_pzhasmtrestrictedroles_46c1a61f86eb70e15fd9867946d34c54 when = oWhenPool.borrow();
if (when == null) {
when = new ra_when_pzhasmtrestrictedroles_46c1a61f86eb70e15fd9867946d34c54(aTools);
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
	"Rule-Access-When:PZHASMTRESTRICTEDROLES"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZHASMTRESTRICTEDROLES","Rule-Access-When","DATA-ADMIN-OPERATOR-ACCESSGROUP",false,"","Pega-RULES","08-01-01","RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ACCESSGROUP PZHASMTRESTRICTEDROLES #20180713T131316.384 GMT","!PZHASMTRESTRICTEDROLES",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-807779292)
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
//	RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ACCESSGROUP PZHASMTRESTRICTEDROLES #20180713T131316.384 GMT:20180713T131316.384 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "649e2a2492814e71f767ddf60f88cc15";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Operator-AccessGroup";
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


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-ACCESS-WHEN DATA-ADMIN-OPERATOR-ACCESSGROUP PZHASMTRESTRICTEDROLES #20180713T131316.384 GMT", "Data-Admin-Operator-AccessGroup pzHasMTRestrictedRoles", "Pega-RULES", "08-01-01", "20180713T131316.384 GMT");
}
