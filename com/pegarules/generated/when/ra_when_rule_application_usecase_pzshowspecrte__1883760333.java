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
import com.pega.platform.clipboard.query.PropertyQuery;

public class ra_when_rule_application_usecase_pzshowspecrte__1883760333 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_4;

    private final PropertyQuery propertyQuery_3;

    private final PropertyQuery propertyQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private final RuleHandle rule0;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN RULE-APPLICATION-USECASE PZSHOWSPECRTE #20180713T141321.423 GMT", "Rule-Application-UseCase pzShowSpecRTE", "Pega-ProcessArchitect", "08-01-01", "20180713T141321.423 GMT");

    public ra_when_rule_application_usecase_pzshowspecrte__1883760333(final Loadtime loadtime) {
        super(ruleTracer);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZHASDESCRIPTIONATTACHMENT", "pzHasDescriptionAttachment");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyIsFlowReadOnly").buildScalarValueQuery();
        propertyQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pzInsKey").buildPropertyQuery();
        propertyQuery_3 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyDescription").buildPropertyQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pzInsKey").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyDescription").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (FUAUtil.compareTwoValues(String.valueOf(false), FUAUtil.C2VOp.EQ, String.valueOf(ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.PUSH_PRIMARY_IF_NOT_NULL))) && (((((FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.EQ, String.valueOf(true)) && (pega.<Boolean>resolveMethodCall("PropertyHasValue--(ClipboardProperty)", "PropertyHasValue", "Pega-RULES", "Utilities", new Object[] { propertyQuery_2.resolve(tools, myStepPage) })).booleanValue()) && (pega.<Boolean>resolveMethodCall("PropertyHasValue--(ClipboardProperty)", "PropertyHasValue", "Pega-RULES", "Utilities", new Object[] { propertyQuery_3.resolve(tools, myStepPage) })).booleanValue()) && FUAUtil.compareTwoValues(scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "")) && FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "")) || FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.NE, String.valueOf(true))));
    }
}
