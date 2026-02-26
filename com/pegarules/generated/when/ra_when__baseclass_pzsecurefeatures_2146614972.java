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

public class ra_when__baseclass_pzsecurefeatures_2146614972 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private final RuleHandle rule0;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN @BASECLASS PZSECUREFEATURES #20230618T001618.931 GMT", "@baseclass pzSecureFeatures", "Pega-UIEngine", "08-23-01", "20230618T001618.931 GMT");

    public ra_when__baseclass_pzsecurefeatures_2146614972(final Loadtime loadtime) {
        super(ruleTracer);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PXUSESOFFLINE", "pxUsesOffline");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyPortal").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyIsConstellationApp").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyIsConstellationBasedPortal").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (((((((((pega.<Boolean>resolveMethodCall("notEqualsIgnoreCase--(String,String)", "notEqualsIgnoreCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT), "Developer" })).booleanValue() && (pega.<Boolean>resolveMethodCall("notEqualsIgnoreCase--(String,String)", "notEqualsIgnoreCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT), "pxAdminStudio" })).booleanValue()) && (pega.<Boolean>resolveMethodCall("notEqualsIgnoreCase--(String,String)", "notEqualsIgnoreCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT), "pxExpress" })).booleanValue()) && (pega.<Boolean>resolveMethodCall("pzevaluateWhenfalse--(String)", "pzevaluateWhenfalse", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pyIsPegaElectronContainer" })).booleanValue()) && (pega.<Boolean>resolveMethodCall("notEqualsIgnoreCase--(String,String)", "notEqualsIgnoreCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT), "pxApplicationWizardPortal" })).booleanValue()) && (pega.<Boolean>resolveMethodCall("notEqualsIgnoreCase--(String,String)", "notEqualsIgnoreCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT), "pxPredictionStudio" })).booleanValue()) && (pega.<Boolean>resolveMethodCall("notEqualsIgnoreCase--(String,String)", "notEqualsIgnoreCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT), "pyDecisionPortal" })).booleanValue()) || ((pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "true" })).booleanValue() && (pega.<Boolean>resolveMethodCall("equals--(String,String)", "equals", "Pega-RULES", "String", new Object[] { scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("AccessGroup", "Data-Admin-Operator-AccessGroup"), ImmutablePropertyInfo.TYPE_TEXT), "true" })).booleanValue())) && ((!ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.PUSH_PRIMARY_IF_NOT_NULL))));
    }
}
