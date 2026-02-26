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
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.QueryBuilderFactory;
import com.pega.platform.clipboard.query.PropertyQuery;

public class ra_model_pega_fields_pzinitializecalculatedvalueinfo__913999405 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_11;

    private final ScalarValueQuery scalarValueQuery_10;

    private final ScalarValueQuery scalarValueQuery_9;

    private final ScalarValueQuery scalarValueQuery_8;

    private final ScalarValueQuery scalarValueQuery_7;

    private final PageQuery pageQuery_6;

    private final PropertyQuery propertyQuery_5;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_1 = new String[] { "", "", "pySupportsCalculation", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-FIELDS PZINITIALIZECALCULATEDVALUEINFO #20201218T230950.354 GMT", "Pega-Fields pzInitializeCalculatedValueInfo", "Pega-ProcessArchitect", "08-06-01", "20201218T230950.354 GMT");

    public ra_model_pega_fields_pzinitializecalculatedvalueinfo__913999405(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyPropertyType").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pySupportsCalculation").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().scalarProperty("pyHasExpression").buildScalarValueQuery();
        propertyQuery_5 = queryBuilderFactory.create().page("pyCalculatedFieldInfo").buildPropertyQuery();
        pageQuery_6 = queryBuilderFactory.create().page("pyCalculatedFieldInfo").buildPageQuery();
        scalarValueQuery_7 = queryBuilderFactory.create().scalarProperty("pyPropertyName").buildScalarValueQuery();
        scalarValueQuery_8 = queryBuilderFactory.create().scalarProperty("pyLabel").buildScalarValueQuery();
        scalarValueQuery_9 = queryBuilderFactory.create().scalarProperty("pyRelevantClass").buildScalarValueQuery();
        scalarValueQuery_10 = queryBuilderFactory.create().scalarProperty("pyClassName").buildScalarValueQuery();
        scalarValueQuery_11 = queryBuilderFactory.create().scalarProperty("pyStringType").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PropertyUtility propertyUtility = runtime.get(PropertyUtility.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pySupportsCalculation", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySupportsCalculation", pRef_1, myStepPage, ((!(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Fields-Scalar-Text-UserReference"))) && (!(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Pega-Fields-Scalar-Picklist")))), "sSN", false, true);
            actionEpilog(runtime, "1", "Set .pySupportsCalculation", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_3.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) && scalarValueQuery_4.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE));
                }
            }, ".pySupportsCalculation && .pyHasExpression")) {
                try {
                    actionProlog(runtime, "2", "When .pySupportsCalculation && .pyHasExpression", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Remove .pyCalculatedFieldInfo", null, null, runtimeTraceContext);
                        {
                            ClipboardProperty remove_1 = propertyQuery_5.resolve(tools, myStepPage);
                            propertyUtility.removePropertyFromClipboard(remove_1);
                        }
                        actionEpilog(runtime, "2.1", "Remove .pyCalculatedFieldInfo", null, null, runtimeTraceContext);
                        ClipboardPage sourcePage_1 = myStepPage;
                        ClipboardPage tmp_1 = myStepPage;
                        myStepPage = pageQuery_6.resolve(tools, myStepPage);
                        PRStackFrame stackFrame_1 = null;
                        try {
                            stackFrame_1 = pega.pushStackFrame("Pega-Calculation", null, myStepPage, false, false);
                            actionProlog(runtime, "2.2", "Update Page .pyCalculatedFieldInfo", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "2.2.1", "Set param.local_propname", sourcePage_1, myStepPage, runtimeTraceContext);
                            tools.putParamValue("local_propname", PropertyInfo.TYPE_TEXT, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return ((scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) ? pega.<String>resolveMethodCall("pzMakeRecordID--(String,String)", "pzMakeRecordID", null, "pxRuleManagement", new Object[] { scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" }) : scalarValueQuery_7.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                                }
                            }));
                            actionEpilog(runtime, "2.2.1", "Set param.local_propname", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "2.2.2", "Set param.local_proplabel", sourcePage_1, myStepPage, runtimeTraceContext);
                            tools.putParamValue("local_proplabel", PropertyInfo.TYPE_TEXT, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }));
                            actionEpilog(runtime, "2.2.2", "Set param.local_proplabel", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "2.2.3", "Set param.local_propclass", sourcePage_1, myStepPage, runtimeTraceContext);
                            tools.putParamValue("local_propclass", PropertyInfo.TYPE_TEXT, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return ((scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) ? scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) : scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                                }
                            }));
                            actionEpilog(runtime, "2.2.3", "Set param.local_propclass", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "2.2.4", "Set param.local_proptype", sourcePage_1, myStepPage, runtimeTraceContext);
                            tools.putParamValue("local_proptype", PropertyInfo.TYPE_TEXT, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }));
                            actionEpilog(runtime, "2.2.4", "Set param.local_proptype", sourcePage_1, myStepPage, runtimeTraceContext);
                            ParameterPage newParams_2_2_5 = runtime.parameterPageConstructor(Arrays.asList(new InputBinding("local_propname", tools.getParamValue("local_propname")), new InputBinding("local_propclass", tools.getParamValue("local_propclass")), new InputBinding("local_proplabel", tools.getParamValue("local_proplabel")), new InputBinding("local_proptype", tools.getParamValue("local_proptype")), new InputBinding("InitializeNewOnFailure", String.valueOf(true))), null);
                            {
                                actionProlog(runtime, "2.2.5", "Apply Data Transform pzInitializeCalculatedValueInfo", null, null, runtimeTraceContext);
                                pega.applyModel(myStepPage, "Pega-Fields", newParams_2_2_5, "pzInitializeCalculatedValueInfo");
                                actionEpilog(runtime, "2.2.5", "Apply Data Transform pzInitializeCalculatedValueInfo", null, null, runtimeTraceContext);
                            }
                        } catch (Exception e_2) {
                            runtimeTraceContext.setError(e_2);
                            throw e_2;
                        } finally {
                            actionEpilog(runtime, "2.2", "Update Page .pyCalculatedFieldInfo", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.popStackFrameAndReturnStepPage(stackFrame_1);
                            myStepPage = tmp_1;
                        }
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "2", "When .pySupportsCalculation && .pyHasExpression", null, null, runtimeTraceContext);
                }
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
