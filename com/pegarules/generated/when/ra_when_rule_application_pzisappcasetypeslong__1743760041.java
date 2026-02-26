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

public class ra_when_rule_application_pzisappcasetypeslong__1743760041 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN RULE-APPLICATION PZISAPPCASETYPESLONG #20180713T142642.103 GMT", "Rule-Application pzIsAppCaseTypesLong", "Pega-LP-Application", "08-01-01", "20180713T142642.103 GMT");

    public ra_when_rule_application_pzisappcasetypeslong__1743760041(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().pageList("pxResults", 1).scalarProperty("pyDescription").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().pageList("pxResults", 1).scalarProperty("pyLabel").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().allowMissingPropertyException().pageList("pxResults", 2).scalarProperty("pyDescription").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().allowMissingPropertyException().pageList("pxResults", 2).scalarProperty("pyLabel").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, "Utilities", new Object[] { pega.findPageWithException("Declare_CaseTree", "Code-Pega-List").getProperty(pega, "pxResults") })).intValue() != 0) && ((((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, "Utilities", new Object[] { pega.findPageWithException("Declare_CaseTree", "Code-Pega-List").getProperty(pega, "pxResults") })).intValue() > 2) || (((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, "Utilities", new Object[] { pega.findPageWithException("Declare_CaseTree", "Code-Pega-List").getProperty(pega, "pxResults") })).intValue() == 1) && (((pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("Declare_CaseTree", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT) })).intValue() + (pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("Declare_CaseTree", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT) })).intValue()) > 200))) || (((pega.<Integer>resolveMethodCall("LengthOfPageList--(ClipboardProperty)", "LengthOfPageList", null, "Utilities", new Object[] { pega.findPageWithException("Declare_CaseTree", "Code-Pega-List").getProperty(pega, "pxResults") })).intValue() == 2) && (((((pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("Declare_CaseTree", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT) })).intValue() + (pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("Declare_CaseTree", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT) })).intValue()) + (pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("Declare_CaseTree", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT) })).intValue()) + (pega.<Integer>resolveMethodCall("length--(String)", "length", null, "String", new Object[] { scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("Declare_CaseTree", "Code-Pega-List"), ImmutablePropertyInfo.TYPE_TEXT) })).intValue()) > 200))));
    }
}
