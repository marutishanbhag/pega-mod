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

public class ra_when_pegaaccel_task_buildapplication_pzbuiltonpega_130922296 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN PEGAACCEL-TASK-BUILDAPPLICATION PZBUILTONPEGA #20180713T141318.078 GMT", "PegaAccel-Task-BuildApplication pzBuiltOnPega", "Pega-ProcessArchitect", "08-01-01", "20180713T141318.078 GMT");

    public ra_when_pegaaccel_task_buildapplication_pzbuiltonpega_130922296(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pySelectedApplicationTemplate").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (((FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "PegaRULES") || FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "PegaDM")) || FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "PegaMobile")) || FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, "PegaSocial"));
    }
}
