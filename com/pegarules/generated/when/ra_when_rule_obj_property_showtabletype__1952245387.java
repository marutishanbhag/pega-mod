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

public class ra_when_rule_obj_property_showtabletype__1952245387 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN RULE-OBJ-PROPERTY SHOWTABLETYPE #20180713T132431.695 GMT", "Rule-Obj-Property showTableType", "Pega-ProCom", "08-01-01", "20180807T111434.316 GMT");

    public ra_when_rule_obj_property_showtabletype__1952245387(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyPropertyMode").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyStringType").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (((((FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "String") || FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "StringList")) || FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "StringGroup")) || FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "JavaProperty")) || FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "JavaPropertyList")) && (((((FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "TrueFalse") && FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "Date")) && FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "DateTime")) && FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "Password")) && FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "TextEncrypted")) && FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "TimeOfDay")));
    }
}
