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

public class ra_model_embed_fields_pzinitializecalculatedvalueinfo_1501277566 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_23;

    private final ScalarValueQuery scalarValueQuery_21;

    private final PageQuery pageQuery_19;

    private final ScalarValueQuery scalarValueQuery_18;

    private final ScalarValueQuery scalarValueQuery_17;

    private final ScalarValueQuery scalarValueQuery_16;

    private final ScalarValueQuery scalarValueQuery_13;

    private final ScalarValueQuery scalarValueQuery_11;

    private final ScalarValueQuery scalarValueQuery_10;

    private final ScalarValueQuery scalarValueQuery_8;

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final RuleHandle rule0;

    private static final String [] pRef_20 = new String[] { "", "", "pyFieldCalculation", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pyCalculationRuleSet", "" };

    private static final String [] pRef_12 = new String[] { "", "", "pyIsCalculationSimple", "" };

    private static final String [] pRef_22 = new String[] { "", "", "pyFunction", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyModeCalc", "" };

    private static final String [] pRef_25 = new String[] { "", "", "pyHasExpression", "" };

    private static final String [] pRef_14 = new String[] { "", "", "pyExpressionProperty", "" };

    private static final String [] pRef_24 = new String[] { "", "", "pyField", "" };

    private static final String [] pRef_15 = new String[] { "", "", "pyIsCalculationEditable", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyCalculationClass", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-FIELDS PZINITIALIZECALCULATEDVALUEINFO #20190718T103609.517 GMT", "Embed-Fields pzInitializeCalculatedValueInfo", "Pega-SystemArchitect", "08-04-01", "20190718T103609.517 GMT");

    public ra_model_embed_fields_pzinitializecalculatedvalueinfo_1501277566(final Loadtime loadtime) {
        super(ruleTracer, false);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZISRDEEDITABLE", "pzIsRDEEditable");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyRelevantClass").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyClassName").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().scalarProperty("pyPropertyName").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pyLabel").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().scalarProperty("pyCalculationClass").buildScalarValueQuery();
        scalarValueQuery_8 = queryBuilderFactory.create().scalarProperty("pzInsKey").buildScalarValueQuery();
        scalarValueQuery_10 = queryBuilderFactory.create().scalarProperty("pyRuleSet").buildScalarValueQuery();
        scalarValueQuery_11 = queryBuilderFactory.create().scalarProperty("pyModeCalc").buildScalarValueQuery();
        scalarValueQuery_13 = queryBuilderFactory.create().page("pyDefaultExpression").scalarProperty("pyExpression").buildScalarValueQuery();
        scalarValueQuery_16 = queryBuilderFactory.create().scalarProperty("pzIsAutoGenerated").buildScalarValueQuery();
        scalarValueQuery_17 = queryBuilderFactory.create().scalarProperty("pxInstanceLockedBy").buildScalarValueQuery();
        scalarValueQuery_18 = queryBuilderFactory.create().scalarProperty("pyIsCalculationSimple").buildScalarValueQuery();
        pageQuery_19 = queryBuilderFactory.create().page("pyDefaultExpression").buildPageQuery();
        scalarValueQuery_21 = queryBuilderFactory.create().scalarProperty("pyExpression").buildScalarValueQuery();
        scalarValueQuery_23 = queryBuilderFactory.create().scalarProperty("pyExpressionType").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyCalculationClass", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCalculationClass", pRef_1, myStepPage, ((scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) ? scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) : scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), "sTN", false, true);
            actionEpilog(runtime, "1", "Set .pyCalculationClass", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set param.local_propname", null, null, runtimeTraceContext);
            tools.putParamValue("local_propname", PropertyInfo.TYPE_TEXT, ((scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")) ? pega.<String>resolveMethodCall("pzMakeRecordID--(String,String)", "pzMakeRecordID", null, "pxRuleManagement", new Object[] { scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" }) : scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)));
            actionEpilog(runtime, "2", "Set param.local_propname", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (!(tools.getParamValue("local_propname").equals("")));
                }
            }, "param.local_propname != ")) {
                try {
                    actionProlog(runtime, "3", "When param.local_propname != ", null, null, runtimeTraceContext);
                    {
                        ClipboardPage sourcePage_1 = pega.findDataPage("D_pzExpressionDirectlyOnProperty", false, "PropertyName", tools.getParamValue("local_propname"), "AppliesTo", scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "InitializeNewOnFailure", tools.getParamValue("InitializeNewOnFailure"));
                        ClipboardPage tmp_1 = myStepPage;
                        myStepPage = tools.getPrimaryPage();
                        PRStackFrame stackFrame_2 = null;
                        try {
                            stackFrame_2 = pega.pushStackFrame("Embed-Fields", null, myStepPage, false, false);
                            actionProlog(runtime, "3.1", "Update Page Primary", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "3.1.1", "Set .pyModeCalc", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyModeCalc", pRef_7, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<Boolean>() {

                                public Boolean apply(ClipboardPage myStepPage) {
                                    return (!(scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                                }
                            }), "sSN", false, true);
                            actionEpilog(runtime, "3.1.1", "Set .pyModeCalc", sourcePage_1, myStepPage, runtimeTraceContext);
                            actionProlog(runtime, "3.1.2", "Set .pyCalculationRuleSet", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyCalculationRuleSet", pRef_9, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }), "sTN", false, true);
                            actionEpilog(runtime, "3.1.2", "Set .pyCalculationRuleSet", sourcePage_1, myStepPage, runtimeTraceContext);
                            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                public Boolean apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_11.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
                                }
                            }, ".pyModeCalc")) {
                                try {
                                    actionProlog(runtime, "3.1.3", "When .pyModeCalc", sourcePage_1, myStepPage, runtimeTraceContext);
                                    {
                                        actionProlog(runtime, "3.1.3.1", "Set .pyIsCalculationSimple", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyIsCalculationSimple", pRef_12, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<Boolean>() {

                                            public Boolean apply(ClipboardPage myStepPage) {
                                                return (ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.NONE) && ((!(pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", null, null, new Object[] { scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "@" })).booleanValue())));
                                            }
                                        }), "sSN", false, true);
                                        actionEpilog(runtime, "3.1.3.1", "Set .pyIsCalculationSimple", sourcePage_1, myStepPage, runtimeTraceContext);
                                        actionProlog(runtime, "3.1.3.2", "Set .pyExpressionProperty", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyExpressionProperty", pRef_14, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                            public String apply(ClipboardPage myStepPage) {
                                                return ("." + scalarValueQuery_4.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT));
                                            }
                                        }), "sTN", false, true);
                                        actionEpilog(runtime, "3.1.3.2", "Set .pyExpressionProperty", sourcePage_1, myStepPage, runtimeTraceContext);
                                        actionProlog(runtime, "3.1.3.3", "Set .pyIsCalculationEditable", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyIsCalculationEditable", pRef_15, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<Boolean>() {

                                            public Boolean apply(ClipboardPage myStepPage) {
                                                return (((scalarValueQuery_16.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) && (scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""))) && ((!(pega.<Boolean>resolveMethodCall("IsRuleSetLocked--(String,PublicAPI)", "IsRuleSetLocked", null, "RuleManagement", new Object[] { scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), tools })).booleanValue()))) && (pega.<Boolean>resolveMethodCall("pxIsRuleEditableByMe--(ClipboardPage)", "pxIsRuleEditableByMe", null, "pxRuleManagement", new Object[] { myStepPage })).booleanValue());
                                            }
                                        }), "sSN", false, true);
                                        actionEpilog(runtime, "3.1.3.3", "Set .pyIsCalculationEditable", sourcePage_1, myStepPage, runtimeTraceContext);
                                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                            public Boolean apply(ClipboardPage myStepPage) {
                                                return scalarValueQuery_18.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
                                            }
                                        }, ".pyIsCalculationSimple")) {
                                            try {
                                                actionProlog(runtime, "3.1.3.4", "When .pyIsCalculationSimple", sourcePage_1, myStepPage, runtimeTraceContext);
                                                {
                                                    ClipboardPage sourcePage_2 = pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<ClipboardPage>() {

                                                        public ClipboardPage apply(ClipboardPage myStepPage) {
                                                            return pageQuery_19.resolve(tools, myStepPage);
                                                        }
                                                    });
                                                    ClipboardPage tmp_2 = myStepPage;
                                                    myStepPage = tools.getPrimaryPage();
                                                    PRStackFrame stackFrame_1 = null;
                                                    try {
                                                        stackFrame_1 = pega.pushStackFrame("Embed-Fields", null, myStepPage, false, false);
                                                        actionProlog(runtime, "3.1.3.4.1", "Update Page Primary", sourcePage_2, myStepPage, runtimeTraceContext);
                                                        actionProlog(runtime, "3.1.3.4.1.1", "Set .pyFieldCalculation", sourcePage_2, myStepPage, runtimeTraceContext);
                                                        pega.setViaPropRef(".pyFieldCalculation", pRef_20, myStepPage, pega.evaluateWithPage(sourcePage_2, new EvaluateFunction<String>() {

                                                            public String apply(ClipboardPage myStepPage) {
                                                                return scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                                            }
                                                        }), "sTN", false, true);
                                                        actionEpilog(runtime, "3.1.3.4.1.1", "Set .pyFieldCalculation", sourcePage_2, myStepPage, runtimeTraceContext);
                                                        actionProlog(runtime, "3.1.3.4.1.2", "Set .pyFunction", sourcePage_2, myStepPage, runtimeTraceContext);
                                                        pega.setViaPropRef(".pyFunction", pRef_22, myStepPage, pega.evaluateWithPage(sourcePage_2, new EvaluateFunction<String>() {

                                                            public String apply(ClipboardPage myStepPage) {
                                                                return scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
                                                            }
                                                        }), "stN", false, true);
                                                        actionEpilog(runtime, "3.1.3.4.1.2", "Set .pyFunction", sourcePage_2, myStepPage, runtimeTraceContext);
                                                        actionProlog(runtime, "3.1.3.4.1.3", "Set .pyField", sourcePage_2, myStepPage, runtimeTraceContext);
                                                        pega.setViaPropRef(".pyField", pRef_24, myStepPage, pega.evaluateWithPage(sourcePage_2, new EvaluateFunction<String>() {

                                                            public String apply(ClipboardPage myStepPage) {
                                                                return (pega.<String>resolveMethodCall("whatComesBeforeFirst--(String,char)", "whatComesBeforeFirst", null, "String", new Object[] { scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), '(' }) + pega.<String>resolveMethodCall("whatComesAfterFirst--(String,char)", "whatComesAfterFirst", null, "String", new Object[] { scalarValueQuery_21.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ')' }));
                                                            }
                                                        }), "sTN", false, true);
                                                        actionEpilog(runtime, "3.1.3.4.1.3", "Set .pyField", sourcePage_2, myStepPage, runtimeTraceContext);
                                                    } catch (Exception e_3) {
                                                        runtimeTraceContext.setError(e_3);
                                                        throw e_3;
                                                    } finally {
                                                        actionEpilog(runtime, "3.1.3.4.1", "Update Page Primary", sourcePage_2, myStepPage, runtimeTraceContext);
                                                        pega.popStackFrameAndReturnStepPage(stackFrame_1);
                                                        myStepPage = tmp_2;
                                                    }
                                                }
                                            } catch (Exception e_4) {
                                                runtimeTraceContext.setError(e_4);
                                                throw e_4;
                                            } finally {
                                                actionEpilog(runtime, "3.1.3.4", "When .pyIsCalculationSimple", sourcePage_1, myStepPage, runtimeTraceContext);
                                            }
                                        }
                                    }
                                } catch (Exception e_5) {
                                    runtimeTraceContext.setError(e_5);
                                    throw e_5;
                                } finally {
                                    actionEpilog(runtime, "3.1.3", "When .pyModeCalc", sourcePage_1, myStepPage, runtimeTraceContext);
                                }
                            } else {
                                try {
                                    actionProlog(runtime, "3.1.4", "Otherwise ", sourcePage_1, myStepPage, runtimeTraceContext);
                                    {
                                        actionProlog(runtime, "3.1.4.1", "Set .pyIsCalculationSimple", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyIsCalculationSimple", pRef_12, myStepPage, true, "sSN", false, true);
                                        actionEpilog(runtime, "3.1.4.1", "Set .pyIsCalculationSimple", sourcePage_1, myStepPage, runtimeTraceContext);
                                        actionProlog(runtime, "3.1.4.2", "Set .pyIsCalculationEditable", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyIsCalculationEditable", pRef_15, myStepPage, true, "sSN", false, true);
                                        actionEpilog(runtime, "3.1.4.2", "Set .pyIsCalculationEditable", sourcePage_1, myStepPage, runtimeTraceContext);
                                        actionProlog(runtime, "3.1.4.3", "Set .pyFieldCalculation", sourcePage_1, myStepPage, runtimeTraceContext);
                                        pega.setViaPropRef(".pyFieldCalculation", pRef_20, myStepPage, "", "sTN", false, true);
                                        actionEpilog(runtime, "3.1.4.3", "Set .pyFieldCalculation", sourcePage_1, myStepPage, runtimeTraceContext);
                                    }
                                } catch (Exception e_6) {
                                    runtimeTraceContext.setError(e_6);
                                    throw e_6;
                                } finally {
                                    actionEpilog(runtime, "3.1.4", "Otherwise ", sourcePage_1, myStepPage, runtimeTraceContext);
                                }
                            }
                        } catch (Exception e_2) {
                            runtimeTraceContext.setError(e_2);
                            throw e_2;
                        } finally {
                            actionEpilog(runtime, "3.1", "Update Page Primary", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.popStackFrameAndReturnStepPage(stackFrame_2);
                            myStepPage = tmp_1;
                        }
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "3", "When param.local_propname != ", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "4", "Set .pyHasExpression", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyHasExpression", pRef_25, myStepPage, scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
            actionEpilog(runtime, "4", "Set .pyHasExpression", null, null, runtimeTraceContext);
            ParameterPage newParams_5 = runtime.parameterPageConstructor(null, null);
            {
                actionProlog(runtime, "5", "Apply Data Transform pzResetFunctionDetails", null, null, runtimeTraceContext);
                pega.applyModel(myStepPage, "Embed-Fields", newParams_5, "pzResetFunctionDetails");
                actionEpilog(runtime, "5", "Apply Data Transform pzResetFunctionDetails", null, null, runtimeTraceContext);
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
