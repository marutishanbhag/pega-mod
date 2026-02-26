package com.pegarules.generated.datatransform;

import com.pega.platform.coreassemblers.datatransform.AbstractDataTransform;
import com.pega.pegarules.priv.util.OutputType;
import com.pega.pegarules.priv.util.InputBinding;
import java.util.List;
import com.pega.pegarules.priv.util.ExceptionDescriptor;
import java.util.Arrays;
import java.util.Collections;
import com.pega.platform.executionengine.intrinsic.PropertyUtility;
import com.pega.platform.executionengine.intrinsic.PageUtility;
import com.pega.platform.executionengine.runtime.PageIterator;
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

public class ra_model_rule_obj__pzaddlabeltorulereferences_1547564894 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_6 = new String[] { "", "", "pxRuleReferences", "<last>", "pxRuleFamilyName", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pxRuleReferences", "<last>", "pyRuleName", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pxRuleReferences", "<last>", "pxRuleObjClass", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pxRuleReferences", "<append>", "pxRuleClassName", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ- PZADDLABELTORULEREFERENCES #20181025T180614.083 GMT", "Rule-Obj- pzAddLabelToRuleReferences", "Pega-ProcessEngine", "08-02-01", "20181025T180614.083 GMT");

    public ra_model_rule_obj__pzaddlabeltorulereferences_1547564894(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyClassName").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pyLabel").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pxRuleReferences(<APPEND>).pxRuleClassName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxRuleReferences(<append>).pxRuleClassName", pRef_1, myStepPage, scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
            actionEpilog(runtime, "1", "Set .pxRuleReferences(<APPEND>).pxRuleClassName", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pxRuleReferences(<LAST>).pxRuleObjClass", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxRuleReferences(<last>).pxRuleObjClass", pRef_3, myStepPage, "Rule-Obj-FieldValue", "sIY", false, true);
            actionEpilog(runtime, "2", "Set .pxRuleReferences(<LAST>).pxRuleObjClass", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pxRuleReferences(<LAST>).pyRuleName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxRuleReferences(<last>).pyRuleName", pRef_4, myStepPage, ("pyLabel " + scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN255", false, true);
            actionEpilog(runtime, "3", "Set .pxRuleReferences(<LAST>).pyRuleName", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pxRuleReferences(<LAST>).pxRuleFamilyName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxRuleReferences(<last>).pxRuleFamilyName", pRef_6, myStepPage, pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", "Pega-RULES", "String", new Object[] { ("pyLabel!" + scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) }), "sTY", false, true);
            actionEpilog(runtime, "4", "Set .pxRuleReferences(<LAST>).pxRuleFamilyName", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set .pxRuleReferences(<APPEND>).pxRuleClassName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxRuleReferences(<append>).pxRuleClassName", pRef_1, myStepPage, scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sIY", false, true);
            actionEpilog(runtime, "5", "Set .pxRuleReferences(<APPEND>).pxRuleClassName", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pxRuleReferences(<LAST>).pxRuleObjClass", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxRuleReferences(<last>).pxRuleObjClass", pRef_3, myStepPage, "Rule-Obj-FieldValue", "sIY", false, true);
            actionEpilog(runtime, "6", "Set .pxRuleReferences(<LAST>).pxRuleObjClass", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set .pxRuleReferences(<LAST>).pyRuleName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxRuleReferences(<last>).pyRuleName", pRef_4, myStepPage, ("pyCaption " + scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN255", false, true);
            actionEpilog(runtime, "7", "Set .pxRuleReferences(<LAST>).pyRuleName", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set .pxRuleReferences(<LAST>).pxRuleFamilyName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxRuleReferences(<last>).pxRuleFamilyName", pRef_6, myStepPage, pega.<String>resolveMethodCall("toUpperCase--(String)", "toUpperCase", "Pega-RULES", "String", new Object[] { ("pyCaption!" + scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)) }), "sTY", false, true);
            actionEpilog(runtime, "8", "Set .pxRuleReferences(<LAST>).pxRuleFamilyName", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
