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

public class ra_when_work__pxshowcompletestage__1170800442 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_8;

    private final ScalarValueQuery scalarValueQuery_7;

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private final RuleHandle rule0;

    private static final String [] pRef_5 = new String[] { "", "", "pxResults", "<last>", "pyStageID", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN WORK- PXSHOWCOMPLETESTAGE #20180713T134949.534 GMT", "Work- pxShowCompleteStage", "Pega-EndUserUI", "08-01-01", "20180713T134949.534 GMT");

    public ra_when_work__pxshowcompletestage__1170800442(final Loadtime loadtime) {
        super(ruleTracer);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!RESOLVED", "Resolved");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pzInsKey").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pxResultCount").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyPageIndex").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().allowMissingPropertyException().pageList("pxResults").scalarProperty("pyStageTransition").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pxCurrentStage").buildScalarValueQuery();
        scalarValueQuery_7 = queryBuilderFactory.create().allowMissingPropertyException().pageList("pxResults").scalarProperty("pyStageID").buildScalarValueQuery();
        scalarValueQuery_8 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pzNextPrimStage").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return ((((((scalarValueQuery_2.resolveToInt(tools, pega.findDataPage("D_CaseStages", false, "InsHandle", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_INTEGER) > 0) && ((scalarValueQuery_3.resolveToInt(tools, pega.findDataPage("D_CaseStages", false, "InsHandle", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_INTEGER) == ((-1))) ? false : (scalarValueQuery_4.resolveToString(tools, pega.findDataPage("D_CaseStages", false, "InsHandle", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TEXT, scalarValueQuery_3.resolveToInt(tools, pega.findDataPage("D_CaseStages", false, "InsHandle", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_INTEGER)).equals("manual")))) && ((!(pega.getStringValueViaPropRef(".pxResults(<last>).pyStageID", pRef_5, pega.findDataPage("D_CaseStages", false, "InsHandle", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), false, false, true).equals(scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)))))) && ((!ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.PUSH_PRIMARY_IF_NOT_NULL)))) && ((!(pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { scalarValueQuery_7.resolveToString(tools, pega.findDataPage("D_CaseStages", false, "InsHandle", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TEXT, scalarValueQuery_3.resolveToInt(tools, pega.findDataPage("D_CaseStages", false, "InsHandle", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_INTEGER)), "ALT" })).booleanValue()))) && FUAUtil.compareTwoValues(scalarValueQuery_8.resolveToString(tools, pega.findDataPage("D_CaseStages", false, "InsHandle", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, ""));
    }
}
