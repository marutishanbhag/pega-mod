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

public class ra_when_rule_obj_class_pzdisplayreusecaselifecycle_1798413068 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN RULE-OBJ-CLASS PZDISPLAYREUSECASELIFECYCLE #20191031T170931.442 GMT", "Rule-Obj-Class pzDisplayReuseCaseLifeCycle", "Pega-ProcessArchitect", "08-04-01", "20191031T170931.442 GMT");

    public ra_when_rule_obj_class_pzdisplayreusecaselifecycle_1798413068(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyPatternInheritsFrom").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyIsRemote").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("IsInPageList--(String,String,ClipboardProperty)", "IsInPageList", null, null, new Object[] { scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyMetadataKey", pega.findPageWithException("D_pxGetClassesFromApplication", "Data-Rule-AppMetadata").getProperty(pega, "pxResults") })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true)) && FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), FUAUtil.C2VOp.EQ, String.valueOf(false)));
    }
}
