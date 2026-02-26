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

public class ra_when_system_user_recents_pzisfilteringenabled__1890625234 extends AbstractWhen {

    private final RuleHandle rule0;

    private final ScalarValueQuery scalarValueQuery_8;

    private final ScalarValueQuery scalarValueQuery_7;

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN SYSTEM-USER-RECENTS PZISFILTERINGENABLED #20180713T135609.543 GMT", "System-User-Recents pzIsFilteringEnabled", "Pega-Desktop", "08-01-01", "20180713T135609.543 GMT");

    public ra_when_system_user_recents_pzisfilteringenabled__1890625234(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyHideCases").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pySearchTextForRecents").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyContentType").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyLabel").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyDescription").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyRuleTypeLabel").buildScalarValueQuery();
        scalarValueQuery_7 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyRuleSet").buildScalarValueQuery();
        scalarValueQuery_8 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyClassName").buildScalarValueQuery();
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZSHOWRECORDDETAILS", "pzShowRecordDetails");
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return ((((FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.NE, String.valueOf(true)) && FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "")) || ((FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.EQ, String.valueOf(true)) && FUAUtil.compareTwoValues(scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "Work")) && (FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "") || (FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "") && ((((pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }) })).booleanValue() || (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }) })).booleanValue()) || (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }) })).booleanValue()) || (ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.PUSH_PRIMARY_IF_NOT_NULL) && (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }) })).booleanValue())))))) || (FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.NE, String.valueOf(true)) && (FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "") || (FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "") && (((pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }) })).booleanValue() || (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }) })).booleanValue()) || (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }) })).booleanValue()))))) || ((FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.EQ, String.valueOf(true)) && (FUAUtil.compareTwoValues(scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "Work-ProjectManagement-SaveAs") || FUAUtil.compareTwoValues(scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "Work-ProjectManagement-New"))) && (((pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }) })).booleanValue() || (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }) })).booleanValue()) || (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyDisplayHarness", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT) }) })).booleanValue())));
    }
}
