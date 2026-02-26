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

public class ra_when_work__pziscasewideaction_1366181493 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN WORK- PZISCASEWIDEACTION #20210310T094120.399 GMT", "Work- pzIsCaseWideAction", "Pega-RulesEngine", "08-06-01", "20210310T094120.399 GMT");

    public ra_when_work__pziscasewideaction_1366181493(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyDefaultTaskStatus").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().pageList("pyAssignActions").scalarProperty("pyActionType").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (((pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "newAssignPage" })).booleanValue() && ((pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", null, null, new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("newAssignPage", "Assign-Worklist"), ImmutablePropertyInfo.TYPE_TEXT), "pyActionName", pega.findPageWithException("newAssignPage", "Assign-Worklist").getProperty(pega, "pyAssignActions") })).intValue() > 0)) && (pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", null, null, new Object[] { "LocalCase", scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("newAssignPage", "Assign-Worklist"), ImmutablePropertyInfo.TYPE_TEXT, (pega.<Integer>resolveMethodCall("IndexInPageList--(String,String,ClipboardProperty)", "IndexInPageList", null, null, new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("newAssignPage", "Assign-Worklist"), ImmutablePropertyInfo.TYPE_TEXT), "pyActionName", pega.findPageWithException("newAssignPage", "Assign-Worklist").getProperty(pega, "pyAssignActions") })).intValue()) })).booleanValue());
    }
}
