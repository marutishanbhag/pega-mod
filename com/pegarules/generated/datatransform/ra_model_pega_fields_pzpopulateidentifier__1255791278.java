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
import com.pega.platform.clipboard.query.PropertyQuery;

public class ra_model_pega_fields_pzpopulateidentifier__1255791278 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_9;

    private final ScalarValueQuery scalarValueQuery_8;

    private final PropertyQuery propertyQuery_6;

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_7 = new String[] { "", "", "pyIsNewProperty", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyPropertyName", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-FIELDS PZPOPULATEIDENTIFIER #20230618T001815.800 GMT", "Pega-Fields pzPopulateIdentifier", "Pega-ProcessArchitect", "08-23-01", "20230618T001815.800 GMT");

    public ra_model_pega_fields_pzpopulateidentifier__1255791278(final Loadtime loadtime) {
        super(ruleTracer, false);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pzInsKey").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyPropertyName").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyActualValue").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pyLabel").buildScalarValueQuery();
        propertyQuery_6 = queryBuilderFactory.create().scalarProperty("pyLabel").buildPropertyQuery();
        scalarValueQuery_8 = queryBuilderFactory.create().scalarProperty("pyRuleSet").buildScalarValueQuery();
        scalarValueQuery_9 = queryBuilderFactory.create().scalarProperty("pyTypeManuallySet").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, ".pzInsKey==")) {
                try {
                    actionProlog(runtime, "1", "When .pzInsKey==", null, null, runtimeTraceContext);
                    {
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return ((scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) || (!(scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("true"))));
                            }
                        }, ".pyPropertyName ==  || .pyActualValue!=true")) {
                            try {
                                actionProlog(runtime, "1.2", "When .pyPropertyName ==  || .pyActualValue!=true", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.2.1", "Set .pyPropertyName", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyPropertyName", pRef_4, myStepPage, pega.<String>resolveMethodCall("pzMakeRecordID--(String,String,ClipboardProperty)", "pzMakeRecordID", null, "pxRuleManagement", new Object[] { scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "", propertyQuery_6.resolve(tools, myStepPage) }), "sTN", false, true);
                                    actionEpilog(runtime, "1.2.1", "Set .pyPropertyName", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_2) {
                                runtimeTraceContext.setError(e_2);
                                throw e_2;
                            } finally {
                                actionEpilog(runtime, "1.2", "When .pyPropertyName ==  || .pyActualValue!=true", null, null, runtimeTraceContext);
                            }
                        }
                        actionProlog(runtime, "1.3", "Set .pyIsNewProperty", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyIsNewProperty", pRef_7, myStepPage, true, "sSN", false, true);
                        actionEpilog(runtime, "1.3", "Set .pyIsNewProperty", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, "String", new Object[] { scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "Pega-" })).booleanValue();
                            }
                        }, "@String.startsWith(.pyRuleSet,Pega-)")) {
                            try {
                                actionProlog(runtime, "1.5", "When @String.startsWith(.pyRuleSet,Pega-)", null, null, runtimeTraceContext);
                                {
                                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                        public Boolean apply(ClipboardPage myStepPage) {
                                            return ((pega.<Integer>resolveMethodCall("length--(String)", "length", null, null, new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) })).intValue() >= 1);
                                        }
                                    }, "@length(.pyPropertyName) >= 1")) {
                                        try {
                                            actionProlog(runtime, "1.5.1", "When @length(.pyPropertyName) >= 1", null, null, runtimeTraceContext);
                                            {
                                                actionProlog(runtime, "1.5.1.1", "Set Param.lcl_sOrigPrefix", null, null, runtimeTraceContext);
                                                tools.putParamValue("lcl_sOrigPrefix", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, null, new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), 0, 2 }));
                                                actionEpilog(runtime, "1.5.1.1", "Set Param.lcl_sOrigPrefix", null, null, runtimeTraceContext);
                                                actionProlog(runtime, "1.5.1.2", "Set Param.sPrefix", null, null, runtimeTraceContext);
                                                tools.putParamValue("sPrefix", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("toLowerCase--(String)", "toLowerCase", null, null, new Object[] { tools.getParamValue("lcl_sOrigPrefix") }));
                                                actionEpilog(runtime, "1.5.1.2", "Set Param.sPrefix", null, null, runtimeTraceContext);
                                                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                                    public Boolean apply(ClipboardPage myStepPage) {
                                                        return (((tools.getParamValue("sPrefix").equals("px")) || (tools.getParamValue("sPrefix").equals("py"))) || (tools.getParamValue("sPrefix").equals("pz")));
                                                    }
                                                }, "Param.sPrefix == px || Param.sPrefix == py || Param.sPrefix == pz")) {
                                                    try {
                                                        actionProlog(runtime, "1.5.1.3", "When Param.sPrefix == px || Param.sPrefix == py || Param.sPrefix == pz", null, null, runtimeTraceContext);
                                                        {
                                                            actionProlog(runtime, "1.5.1.3.1", "Set Param.IdentFocusValue", null, null, runtimeTraceContext);
                                                            tools.putParamValue("IdentFocusValue", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("substring--(String,int)", "substring", null, null, new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), 2 }));
                                                            actionEpilog(runtime, "1.5.1.3.1", "Set Param.IdentFocusValue", null, null, runtimeTraceContext);
                                                            actionProlog(runtime, "1.5.1.3.2", "Set .pyPropertyName", null, null, runtimeTraceContext);
                                                            pega.setViaPropRef(".pyPropertyName", pRef_4, myStepPage, (tools.getParamValue("sPrefix") + tools.getParamValue("IdentFocusValue")), "sTN", false, true);
                                                            actionEpilog(runtime, "1.5.1.3.2", "Set .pyPropertyName", null, null, runtimeTraceContext);
                                                        }
                                                    } catch (Exception e_3) {
                                                        runtimeTraceContext.setError(e_3);
                                                        throw e_3;
                                                    } finally {
                                                        actionEpilog(runtime, "1.5.1.3", "When Param.sPrefix == px || Param.sPrefix == py || Param.sPrefix == pz", null, null, runtimeTraceContext);
                                                    }
                                                } else {
                                                    try {
                                                        actionProlog(runtime, "1.5.1.4", "Otherwise ", null, null, runtimeTraceContext);
                                                        {
                                                            actionProlog(runtime, "1.5.1.4.1", "Set .pyPropertyName", null, null, runtimeTraceContext);
                                                            pega.setViaPropRef(".pyPropertyName", pRef_4, myStepPage, ("py" + scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
                                                            actionEpilog(runtime, "1.5.1.4.1", "Set .pyPropertyName", null, null, runtimeTraceContext);
                                                        }
                                                    } catch (Exception e_4) {
                                                        runtimeTraceContext.setError(e_4);
                                                        throw e_4;
                                                    } finally {
                                                        actionEpilog(runtime, "1.5.1.4", "Otherwise ", null, null, runtimeTraceContext);
                                                    }
                                                }
                                            }
                                        } catch (Exception e_5) {
                                            runtimeTraceContext.setError(e_5);
                                            throw e_5;
                                        } finally {
                                            actionEpilog(runtime, "1.5.1", "When @length(.pyPropertyName) >= 1", null, null, runtimeTraceContext);
                                        }
                                    }
                                }
                            } catch (Exception e_6) {
                                runtimeTraceContext.setError(e_6);
                                throw e_6;
                            } finally {
                                actionEpilog(runtime, "1.5", "When @String.startsWith(.pyRuleSet,Pega-)", null, null, runtimeTraceContext);
                            }
                        }
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return ((tools.getParamAsBoolean(PropertyInfo.TYPE_TRUEFALSE, "DefaultFieldType") == true) && (scalarValueQuery_9.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) != true));
                            }
                        }, "param.DefaultFieldType == true && .pyTypeManuallySet != true")) {
                            try {
                                actionProlog(runtime, "1.6", "When param.DefaultFieldType == true && .pyTypeManuallySet != true", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "1.6.1", "Set param.noop", null, null, runtimeTraceContext);
                                    tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pxExecuteAnActivity--(ClipboardPage,String)", "pxExecuteAnActivity", null, null, new Object[] { myStepPage, "pzDefaultFieldTypeFromLabel" })).booleanValue()));
                                    actionEpilog(runtime, "1.6.1", "Set param.noop", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_7) {
                                runtimeTraceContext.setError(e_7);
                                throw e_7;
                            } finally {
                                actionEpilog(runtime, "1.6", "When param.DefaultFieldType == true && .pyTypeManuallySet != true", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_8) {
                    runtimeTraceContext.setError(e_8);
                    throw e_8;
                } finally {
                    actionEpilog(runtime, "1", "When .pzInsKey==", null, null, runtimeTraceContext);
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
