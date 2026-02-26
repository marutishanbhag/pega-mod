package com.pegarules.generated.decisiontable;

import com.pega.platform.coreassemblers.decision.AbstractDecisionTable;
import java.util.List;
import com.pega.pegarules.priv.util.ExceptionDescriptor;
import java.util.Arrays;
import java.util.Collections;
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

public class ra_decision_embed_fields_pzdeterminefieldmoderestrictions__1956932382 extends AbstractDecisionTable {

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private final RuleHandle rule1;

    private final RuleHandle rule0;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE EMBED-FIELDS PZDETERMINEFIELDMODERESTRICTIONS #20200828T171037.550 GMT", "Embed-Fields pzDetermineFieldModeRestrictions", "Pega-ProcessArchitect", "08-06-01", "20200828T171037.550 GMT");

    public ra_decision_embed_fields_pzdeterminefieldmoderestrictions__1956932382(final Loadtime loadtime) {
        super(ruleTracer);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZISREADONLYTHEONLYFIELDOPTION", "pzIsReadOnlyTheOnlyFieldOption");
        rule1 = ruleHandleFactory.create("Rule-Obj-When", "!PZISDATAREFERENCEFIELD", "pzIsDataReferenceField");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyPropertyType").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyIsClassKey").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyClassName").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyHasExpression").buildScalarValueQuery();
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
        boolean var1 = scalarValueQuery_2.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
        boolean var2 = (pega.<Boolean>resolveMethodCall("pxHasAutomaticallyGeneratedKeys--(String)", "pxHasAutomaticallyGeneratedKeys", null, "pxRuleManagement", new Object[] { scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
        boolean var3 = scalarValueQuery_4.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
        boolean var4 = ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY);
        boolean var5 = ruleDispatcher.invokeBoolean(runtime, rule1, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY);
        if ((((((true && (var1 == tools.interpretBoolean("true"))) && (var2 == tools.interpretBoolean("true"))) && true) && true) && true)) {
            return "OnlyReadOnly";
        } else if ((((((true && (var1 == tools.interpretBoolean("true"))) && (var2 == tools.interpretBoolean("false"))) && true) && true) && true)) {
            return "OnlyRequired";
        } else if ((((((true && true) && true) && (var3 == tools.interpretBoolean("true"))) && true) && true)) {
            return "OnlyCalculated";
        } else if ((((((true && true) && true) && true) && (var4 == tools.interpretBoolean("true"))) && true)) {
            return "OnlyReadOnly";
        } else if ((((((true && true) && true) && true) && true) && (var5 == tools.interpretBoolean("true")))) {
            return "NotCalculated";
        } else if (((((((var0.equals("TrueFalse:pxCheckbox")) && true) && true) && true) && true) && true)) {
            return "NotRequired";
        } else if (((((((((((((var0.equals("Page:Attachment")) || (var0.equals("Text:pxAutoComplete"))) || (var0.equals("Text:pxDropdown"))) || (var0.equals("Text:pxRadiobuttons"))) || (var0.equals("Text:Picklist"))) || (var0.equals("Page:pxAddressMap"))) || (var0.equals("Text:UserReference"))) && true) && true) && true) && true) && true)) {
            return "NotCalculated";
        } else if ((((((((var0.equals("Page:")) || (var0.equals("View"))) && true) && true) && true) && true) && true)) {
            return "AutoReadOnly";
        } else {
            return "None";
        }
    }
}
