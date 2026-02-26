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

public class ra_when__baseclass_pzhasstaticcontentjsoptimization__258719618 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private final RuleHandle rule0;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN @BASECLASS PZHASSTATICCONTENTJSOPTIMIZATION #20220428T200548.636 GMT", "@baseclass pzHasStaticContentJSOptimization", "Pega-UIEngine", "08-08-01", "20220428T200548.636 GMT");

    public ra_when__baseclass_pzhasstaticcontentjsoptimization__258719618(final Loadtime loadtime) {
        super(ruleTracer);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PYENABLEPREFLIGHTOPTIMIZATION", "pyEnablePreflightOptimization");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().page("pyStaticContentOptimization").scalarProperty("pyUseOptimized").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().page("pyStaticContentOptimization").scalarProperty("pyOptimized").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.PUSH_PRIMARY_IF_NOT_NULL) && ((pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "pyPortal.pyStaticContentOptimization" })).booleanValue() && (((pega.<Boolean>resolveMethodCall("PropertyHasValue--(PublicAPI,String)", "PropertyHasValue", "Pega-RULES", "Utilities", new Object[] { tools, "pyPortal.pyStaticContentOptimization.pyUseOptimized" })).booleanValue() && FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.EQ, String.valueOf(true))) && (FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "JS") || FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("pyPortal", "Data-Portal"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "Both")))));
    }
}
