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

public class ra_decision_code_pega_list_pzsupportedcontextclassfieldtypes__368388262 extends AbstractDecisionTable {

    private final RuleHandle rule0;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE CODE-PEGA-LIST PZSUPPORTEDCONTEXTCLASSFIELDTYPES #20230710T135641.613 GMT", "Code-Pega-List pzSupportedContextClassFieldTypes", "Pega-ProcessArchitect", "08-23-01", "20230710T135641.613 GMT");

    public ra_decision_code_pega_list_pzsupportedcontextclassfieldtypes__368388262(final Loadtime loadtime) {
        super(ruleTracer);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZCONSTELLATIONCASE", "pzConstellationCase");
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = tools.getParamValue("FieldClass");
        boolean var1 = (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, "String", new Object[] { tools.getParamValue("FieldClass"), "Pega-Fields-Complex" })).booleanValue();
        String var2 = tools.getParamValue("Mode");
        boolean var3 = (pega.<Boolean>resolveMethodCall("pxIsAncestorOf--(String,String)", "pxIsAncestorOf", null, "Default", new Object[] { tools.getParamValue("ContextClass"), "Pega-Configuration" })).booleanValue();
        boolean var4 = (pega.<Boolean>resolveMethodCall("pxIsAncestorOf--(String,String)", "pxIsAncestorOf", null, "Default", new Object[] { tools.getParamValue("ContextClass"), "Work-" })).booleanValue();
        boolean var5 = ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.STEP_AND_PRIMARY);
        if ((((((true && (var1 == tools.interpretBoolean("true"))) && ((var2.equals("Scalar")) || (var2.equals("ConversationBuilder")))) && true) && true) && true)) {
            return String.valueOf(false);
        } else if ((((((((var0.equals("Pega-Fields-Scalar-Text-UserReference")) || (var0.equals("Pega-Fields-Scalar-Picklist"))) && (var1 == tools.interpretBoolean("false"))) && (var2.equals("ConversationBuilder"))) && true) && true) && true)) {
            return String.valueOf(false);
        } else if ((((((true && (var1 == tools.interpretBoolean("true"))) && true) && (var3 == tools.interpretBoolean("true"))) && true) && true)) {
            return String.valueOf(false);
        } else if ((((((((((((((var0.equals("Pega-Fields-Scalar-DateTime")) || (var0.equals("Pega-Fields-Scalar-TimeOfDay"))) || (var0.equals("Pega-Fields-Scalar-Text-Email"))) || (var0.equals("Pega-Fields-Scalar-Text-Paragraph"))) || (var0.equals("Pega-Fields-Scalar-Text-Phone"))) || (var0.equals("Pega-Fields-Scalar-Text-URL"))) || (var0.equals("Pega-Fields-Scalar-Text-UserReference"))) || (var0.equals("Pega-Fields-Scalar-Decimal-Percentage"))) && true) && true) && (var3 == tools.interpretBoolean("true"))) && true) && true)) {
            return String.valueOf(false);
        } else if ((((((((var0.equals("Pega-Fields-Scalar-Identifier")) || (var0.equals("Pega-Fields-Scalar-Double"))) && true) && true) && true) && true) && true)) {
            return String.valueOf(false);
        } else if (((((((var0.equals("Pega-Fields-Complex-Page-Attachment")) && true) && true) && true) && (var4 == tools.interpretBoolean("false"))) && true)) {
            return String.valueOf(false);
        } else if (((((((var0.equals("Pega-Fields-Complex-Page-Address")) && true) && true) && true) && true) && (var5 != tools.interpretBoolean("true")))) {
            return String.valueOf(false);
        } else {
            return String.valueOf(true);
        }
    }
}
