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

public class ra_when__baseclass_pxrecentsreloadcondition_1611216132 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_2;

    private final PropertyQuery propertyQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN @BASECLASS PXRECENTSRELOADCONDITION #20180713T134945.698 GMT", "@baseclass pxRecentsReloadCondition", "Pega-EndUserUI", "08-01-01", "20180713T134945.698 GMT");

    public ra_when__baseclass_pxrecentsreloadcondition_1611216132(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        propertyQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pxUpdateDateTime").buildPropertyQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pxUpdateDateTime").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return ((pega.<Boolean>resolveMethodCall("PropertyHasValue--(ClipboardProperty)", "PropertyHasValue", "Pega-RULES", "Utilities", new Object[] { propertyQuery_1.resolve(tools, myStepPage) })).booleanValue() && (pega.<Boolean>resolveMethodCall("compareTwoDateTimes--(String,String,String)", "compareTwoDateTimes", "Pega-RULES", "ExpressionEvaluators", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("Declare_pzRecentsCache", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_DATETIME), "<=", scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DATETIME) })).booleanValue());
    }
}
