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

public class ra_when_work_projectmanagement_saveas_pzclearmethodstatus__836287359 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_8;

    private final ScalarValueQuery scalarValueQuery_7;

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN WORK-PROJECTMANAGEMENT-SAVEAS PZCLEARMETHODSTATUS #20180713T135609.600 GMT", "Work-ProjectManagement-SaveAs pzClearMethodStatus", "Pega-Desktop", "08-01-01", "20180713T135609.600 GMT");

    public ra_when_work_projectmanagement_saveas_pzclearmethodstatus__836287359(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().page("pyRulePage").scalarProperty("pyOriginalFocusKeyValue").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().page("pyRulePage").scalarProperty("pyRefToFocusKey").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().allowMissingPropertyException().page("pyRulePage").scalarProperty("pyMethodStatus").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().allowMissingPropertyException().page("pyRulePage").scalarProperty("pyRuleSet").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().allowMissingPropertyException().page("pyRulePage").scalarProperty("pxOriginalRuleSet").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().allowMissingPropertyException().page("pyRulePage").scalarProperty("pyRAOriginalClassName").buildScalarValueQuery();
        scalarValueQuery_7 = queryBuilderFactory.create().allowMissingPropertyException().page("pyRulePage").scalarProperty("pyClassName").buildScalarValueQuery();
        scalarValueQuery_8 = queryBuilderFactory.create().allowMissingPropertyException().page("pyRulePage").scalarProperty("pyRASpecializeBy").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (((FUAUtil.compareTwoValues(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.EQ, scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) && FUAUtil.compareTwoValues(scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "Internal")) && FUAUtil.compareTwoValues(scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "")) && (((FUAUtil.compareTwoValues(scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) && (!(pega.<String>resolveMethodCall("pzGetBranchOriginName--(String)", "pzGetBranchOriginName", "Pega-ProCom", "RuleManagement", new Object[] { scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }).equals(scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT))))) || FUAUtil.compareTwoValues(scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT))) || ((FUAUtil.compareTwoValues(scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "") && FUAUtil.compareTwoValues(scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "CLASS")) && FUAUtil.compareTwoValues(scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "duplicate"))));
    }
}
