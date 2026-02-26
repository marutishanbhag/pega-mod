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

public class ra_decision_rule_obj_property_pzgetcontrolforvirtualrd__1402271349 extends AbstractDecisionTable {

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE RULE-OBJ-PROPERTY PZGETCONTROLFORVIRTUALRD #20190829T134516.671 GMT", "Rule-Obj-Property pzGetControlForVirtualRD", "Pega-Reporting", "08-04-01", "20190829T134516.671 GMT");

    public ra_decision_rule_obj_property_pzgetcontrolforvirtualrd__1402271349(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyStreamName").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyStringType").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyGatewayClass").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyAutoHTML").buildScalarValueQuery();
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
        String var1 = scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
        String var2 = scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
        if (((((var0.equals("")) || (var0.equals("pxDateTime"))) && (var1.equals("Date"))) && true)) {
            return "Date";
        } else if ((((var0.equals("pxDateTime")) && (var1.equals("TimeOfDay"))) && true)) {
            return "Time";
        } else if (((((var0.equals("")) || (var0.equals("pxDateTime"))) && (var1.equals("DateTime"))) && true)) {
            return "DateTime";
        } else if (((((var0.equals("pxAutoComplete")) || (var0.equals("pxDropdown"))) && true) && (var2.equals("Data-Admin-Operator-ID")))) {
            return "pzOperatorsByWorkGroupDropdown";
        } else if ((((var0.equals("pxDropdown")) && true) && true)) {
            return "PromptSelect";
        } else if ((((var0.equals("pxCurrency")) && true) && true)) {
            return "CurrencyAmount";
        } else if ((((var0.equals("pxInteger")) && true) && true)) {
            return "Integer";
        } else if ((((var0.equals("pxNumber")) && true) && true)) {
            return "Decimal";
        } else if ((((var0.equals("pxCheckbox")) && true) && true)) {
            return "Checkbox";
        } else if ((((var0.equals("pxTextArea")) && true) && true)) {
            return "TextAreaSmall";
        } else if ((((var0.equals("pxRadioButtons")) && true) && true)) {
            return "RadioButtons";
        } else if ((((var0.equals("")) && true) && true)) {
            return "";
        } else {
            return (scalarValueQuery_4.resolveToBoolean(tools, pega.findDataPage("D_pzHTMLControl", false, ClipboardPage.DP_PARAMETER_NAME_NOT_AVAILABLE, scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TRUEFALSE) ? "" : scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
        }
    }
}
