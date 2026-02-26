package com.pegarules.generated.when;

import com.pega.platform.coreassemblers.when.AbstractWhen;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.EvaluateFunction;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.FUAUtil.C2VOp;
import com.pega.pegarules.priv.tracer.RuleTraceInfo;
import com.pega.pegarules.pub.clipboard.ClipboardPage;
import com.pega.pegarules.pub.clipboard.ClipboardProperty;
import com.pega.pegarules.pub.context.PRStackFrame;
import com.pega.pegarules.pub.dictionary.ImmutablePropertyInfo;
import com.pega.pegarules.pub.dictionary.PropertyInfo;
import com.pega.pegarules.pub.runtime.ParameterPage;
import com.pega.pegarules.pub.runtime.PublicAPI;
import com.pega.platform.coreassemblers.when.AbstractWhen;
import com.pega.platform.executionengine.intrinsic.PageListUtility;
import com.pega.platform.executionengine.runtime.Aspect;
import com.pega.platform.executionengine.runtime.Loadtime;
import com.pega.platform.executionengine.runtime.RuleDispatcher;
import com.pega.platform.executionengine.runtime.RuleDispatcher.StackBehavior;
import com.pega.platform.executionengine.runtime.RuleHandle;
import com.pega.platform.executionengine.runtime.RuleHandleFactory;
import com.pega.platform.executionengine.runtime.Runtime;
import com.pega.pegarules.pub.clipboard.PRStringFormat;
import java.util.Date;
import com.pega.pegarules.pub.util.*;
import com.pega.platform.clipboard.query.ScalarValueQuery;
import com.pega.platform.clipboard.query.QueryBuilderFactory;

public class ra_when_rule_ruleset_version_pzruleset_showupdateapp_2055280615 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private final RuleHandle rule0;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN RULE-RULESET-VERSION PZRULESET_SHOWUPDATEAPP #20180713T135742.894 GMT", "Rule-RuleSet-Version pzRuleSet_ShowUpdateApp", "Pega-SystemArchitect", "08-01-01", "20180713T135742.894 GMT");

    public ra_when_rule_ruleset_version_pzruleset_showupdateapp_2055280615(final Loadtime loadtime) {
        super(ruleTracer);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZFLOWISINMODAL", "pzFlowIsInModal");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyShowUpdateCheckbox").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyIsSecured").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyCountry").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyCity").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (((((pega.<Boolean>resolveMethodCall("compareTwoStrings--(String,String,String)", "compareTwoStrings", "Pega-RULES", "ExpressionEvaluators", new Object[] { scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "EQUALS", "true" })).booleanValue() && FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("locateAppPage", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.NE, String.valueOf(true))) && (pega.<Boolean>resolveMethodCall("compareTwoStrings--(String,String,String)", "compareTwoStrings", "Pega-RULES", "ExpressionEvaluators", new Object[] { scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("preTempPage", "Rule-RuleSet-Name"), ImmutablePropertyInfo.TYPE_TEXT), "DOES NOT EQUAL", "ApplicationError" })).booleanValue()) && ((!ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.PUSH_PRIMARY_IF_NOT_NULL)))) && (pega.<Boolean>resolveMethodCall("compareTwoStrings--(String,String,String)", "compareTwoStrings", "Pega-RULES", "ExpressionEvaluators", new Object[] { scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("preTempPage", "Rule-RuleSet-Name"), ImmutablePropertyInfo.TYPE_TEXT), "DOES NOT EQUAL", "InForm" })).booleanValue());
    }
}
