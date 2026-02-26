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

public class ra_model_pega_fields_scalar_pzadditionalfieldpostprocessing__1982565531 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_11;

    private final ScalarValueQuery scalarValueQuery_10;

    private final ScalarValueQuery scalarValueQuery_9;

    private final ScalarValueQuery scalarValueQuery_8;

    private final ScalarValueQuery scalarValueQuery_6;

    private final PropertyQuery propertyQuery_5;

    private final PageQuery pageQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_7 = new String[] { "", "", "pyCommittedItems", "<append>" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-FIELDS-SCALAR PZADDITIONALFIELDPOSTPROCESSING #20210909T000519.098 GMT", "Pega-Fields-Scalar pzAdditionalFieldPostProcessing", "Pega-ProcessArchitect", "08-07-01", "20210909T163045.010 GMT");

    public ra_model_pega_fields_scalar_pzadditionalfieldpostprocessing__1982565531(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().page("pyCalculatedFieldInfo").scalarProperty("pzInsKey").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyPropertyName").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyClassName").buildScalarValueQuery();
        pageQuery_4 = queryBuilderFactory.create().page("pyCalculatedFieldInfo").buildPageQuery();
        propertyQuery_5 = queryBuilderFactory.create().page("pyCalculatedFieldInfo").buildPropertyQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().scalarProperty("pyHasExpression").buildScalarValueQuery();
        scalarValueQuery_8 = queryBuilderFactory.create().scalarProperty("pyIsNewProperty").buildScalarValueQuery();
        scalarValueQuery_9 = queryBuilderFactory.create().scalarProperty("pyPreviousPropertyType").buildScalarValueQuery();
        scalarValueQuery_10 = queryBuilderFactory.create().scalarProperty("pyPropertyType").buildScalarValueQuery();
        scalarValueQuery_11 = queryBuilderFactory.create().scalarProperty("pyRelevantClass").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PropertyUtility propertyUtility = runtime.get(PropertyUtility.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return scalarValueQuery_6.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
                }
            }, ".pyHasExpression")) {
                try {
                    actionProlog(runtime, "1", "When .pyHasExpression", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set param.noop", null, null, runtimeTraceContext);
                        tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxExecuteAnActivity--(ClipboardPage,String)", "pxExecuteAnActivity", null, null, new Object[] { pageQuery_4.resolve(tools, myStepPage), "pzCreateOrUpdateCalculation" })).booleanValue()));
                        actionEpilog(runtime, "1.1", "Set param.noop", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (!(tools.getParamValue("InsKey").equals("")));
                            }
                        }, "param.InsKey != ")) {
                            try {
                                actionProlog(runtime, "1.2", "When param.InsKey != ", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.2.1", "Set .pyCommittedItems(<APPEND>)", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyCommittedItems(<append>)", pRef_7, myStepPage, tools.getParamValue("InsKey"), "sTN", false, true);
                                    actionEpilog(runtime, "1.2.1", "Set .pyCommittedItems(<APPEND>)", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_3) {
                                runtimeTraceContext.setError(e_3);
                                throw e_3;
                            } finally {
                                actionEpilog(runtime, "1.2", "When param.InsKey != ", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_4) {
                    runtimeTraceContext.setError(e_4);
                    throw e_4;
                } finally {
                    actionEpilog(runtime, "1", "When .pyHasExpression", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (!(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                }
            }, ".pyCalculatedFieldInfo.pzInsKey != ")) {
                try {
                    actionProlog(runtime, "2", "Otherwise When .pyCalculatedFieldInfo.pzInsKey != ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set param.PropertyName", null, null, runtimeTraceContext);
                        tools.putParamValue("PropertyName", PropertyInfo.TYPE_TEXT, scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                        actionEpilog(runtime, "2.1", "Set param.PropertyName", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.2", "Set param.ClassName", null, null, runtimeTraceContext);
                        tools.putParamValue("ClassName", PropertyInfo.TYPE_TEXT, scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                        actionEpilog(runtime, "2.2", "Set param.ClassName", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.3", "Set param.noop", null, null, runtimeTraceContext);
                        tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxExecuteAnActivity--(ClipboardPage,String)", "pxExecuteAnActivity", null, null, new Object[] { pageQuery_4.resolve(tools, myStepPage), "pxDeleteCalculationRule" })).booleanValue()));
                        actionEpilog(runtime, "2.3", "Set param.noop", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.4", "Remove .pyCalculatedFieldInfo", null, null, runtimeTraceContext);
                        {
                            ClipboardProperty remove_1 = propertyQuery_5.resolve(tools, myStepPage);
                            propertyUtility.removePropertyFromClipboard(remove_1);
                        }
                        actionEpilog(runtime, "2.4", "Remove .pyCalculatedFieldInfo", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "2", "Otherwise When .pyCalculatedFieldInfo.pzInsKey != ", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "3", "Set param.noop", null, null, runtimeTraceContext);
            tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxExecuteAnActivity--(ClipboardPage,String)", "pxExecuteAnActivity", null, null, new Object[] { myStepPage, "pzOptimizePegaField" })).booleanValue()));
            actionEpilog(runtime, "3", "Set param.noop", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (((!scalarValueQuery_8.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE))) && (!(scalarValueQuery_9.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)))));
                }
            }, "!.pyIsNewProperty && .pyPreviousPropertyType != .pyPropertyType")) {
                try {
                    actionProlog(runtime, "4", "When !.pyIsNewProperty && .pyPreviousPropertyType != .pyPropertyType", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "4.1", "Set param.fieldName", null, null, runtimeTraceContext);
                        tools.putParamValue("fieldName", PropertyInfo.TYPE_TEXT, scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                        actionEpilog(runtime, "4.1", "Set param.fieldName", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.2", "Set param.viewClass", null, null, runtimeTraceContext);
                        tools.putParamValue("viewClass", PropertyInfo.TYPE_TEXT, scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
                        actionEpilog(runtime, "4.2", "Set param.viewClass", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.3", "Set param.fieldMode", null, null, runtimeTraceContext);
                        tools.putParamValue("fieldMode", PropertyInfo.TYPE_TEXT, "String");
                        actionEpilog(runtime, "4.3", "Set param.fieldMode", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.4", "Set param.action", null, null, runtimeTraceContext);
                        tools.putParamValue("action", PropertyInfo.TYPE_TEXT, "UPDATE");
                        actionEpilog(runtime, "4.4", "Set param.action", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.5", "Set param.noop", null, null, runtimeTraceContext);
                        tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxExecuteAnActivity--(ClipboardPage,String)", "pxExecuteAnActivity", null, null, new Object[] { myStepPage, "pzUpdatePrimaryFieldsView" })).booleanValue()));
                        actionEpilog(runtime, "4.5", "Set param.noop", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_5) {
                    runtimeTraceContext.setError(e_5);
                    throw e_5;
                } finally {
                    actionEpilog(runtime, "4", "When !.pyIsNewProperty && .pyPreviousPropertyType != .pyPropertyType", null, null, runtimeTraceContext);
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
