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

public class ra_model_rule_application_pzsetselecteditemslist_1897637545 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_1 = new String[] { "", "", "pySelectedItemTypesLabel", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-APPLICATION PZSETSELECTEDITEMSLIST #20180713T142054.720 GMT", "Rule-Application pzSetSelectedItemsList", "Pega-AppDefinition", "08-01-01", "20180713T142054.720 GMT");

    public ra_model_rule_application_pzsetselecteditemslist_1897637545(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyShowStoryItems").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyShowBugItems").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().scalarProperty("pyShowFeedbackItems").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pySelectedItemTypesLabel").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySelectedItemTypesLabel", pRef_1, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), "", "sTN", false, true);
            actionEpilog(runtime, "1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (((scalarValueQuery_2.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == false) && (scalarValueQuery_3.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == false)) && (scalarValueQuery_4.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == false));
                }
            }, "D_pzInitialValues.pyShowStoryItems==false && D_pzInitialValues.pyShowBugItems==false && D_pzInitialValues.pyShowFeedbackItems==false")) {
                try {
                    actionProlog(runtime, "2", "When D_pzInitialValues.pyShowStoryItems==false && D_pzInitialValues.pyShowBugItems==false && D_pzInitialValues.pyShowFeedbackItems==false", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedItemTypesLabel", pRef_1, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "None", "pyCaption", tools }), "sTN", false, true);
                        actionEpilog(runtime, "2.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_8) {
                    runtimeTraceContext.setError(e_8);
                    throw e_8;
                } finally {
                    actionEpilog(runtime, "2", "When D_pzInitialValues.pyShowStoryItems==false && D_pzInitialValues.pyShowBugItems==false && D_pzInitialValues.pyShowFeedbackItems==false", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (((scalarValueQuery_2.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true) && (scalarValueQuery_3.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true)) && (scalarValueQuery_4.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true));
                }
            }, "D_pzInitialValues.pyShowStoryItems==true && D_pzInitialValues.pyShowBugItems==true && D_pzInitialValues.pyShowFeedbackItems==true")) {
                try {
                    actionProlog(runtime, "3", "Otherwise When D_pzInitialValues.pyShowStoryItems==true && D_pzInitialValues.pyShowBugItems==true && D_pzInitialValues.pyShowFeedbackItems==true", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "3.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedItemTypesLabel", pRef_1, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "All", "pyCaption", tools }), "sTN", false, true);
                        actionEpilog(runtime, "3.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "3", "Otherwise When D_pzInitialValues.pyShowStoryItems==true && D_pzInitialValues.pyShowBugItems==true && D_pzInitialValues.pyShowFeedbackItems==true", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "4", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_2.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
                            }
                        }, "D_pzInitialValues.pyShowStoryItems==true")) {
                            try {
                                actionProlog(runtime, "4.1", "When D_pzInitialValues.pyShowStoryItems==true", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "4.1.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pySelectedItemTypesLabel", pRef_1, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ((scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT) + pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "STORY", "pyCaption", tools })) + ","), "sTN", false, true);
                                    actionEpilog(runtime, "4.1.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_3) {
                                runtimeTraceContext.setError(e_3);
                                throw e_3;
                            } finally {
                                actionEpilog(runtime, "4.1", "When D_pzInitialValues.pyShowStoryItems==true", null, null, runtimeTraceContext);
                            }
                        }
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_3.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
                            }
                        }, "D_pzInitialValues.pyShowBugItems==true")) {
                            try {
                                actionProlog(runtime, "4.2", "When D_pzInitialValues.pyShowBugItems==true", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "4.2.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pySelectedItemTypesLabel", pRef_1, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ((scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT) + pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "Bug", "pyCaption", tools })) + ","), "sTN", false, true);
                                    actionEpilog(runtime, "4.2.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_4) {
                                runtimeTraceContext.setError(e_4);
                                throw e_4;
                            } finally {
                                actionEpilog(runtime, "4.2", "When D_pzInitialValues.pyShowBugItems==true", null, null, runtimeTraceContext);
                            }
                        }
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_4.resolveToBoolean(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TRUEFALSE) == true);
                            }
                        }, "D_pzInitialValues.pyShowFeedbackItems==true")) {
                            try {
                                actionProlog(runtime, "4.3", "When D_pzInitialValues.pyShowFeedbackItems==true", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "4.3.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pySelectedItemTypesLabel", pRef_1, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), (scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT) + pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, "Utilities", new Object[] { "FEEDBACK", "pyCaption", tools })), "sTN", false, true);
                                    actionEpilog(runtime, "4.3.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_5) {
                                runtimeTraceContext.setError(e_5);
                                throw e_5;
                            } finally {
                                actionEpilog(runtime, "4.3", "When D_pzInitialValues.pyShowFeedbackItems==true", null, null, runtimeTraceContext);
                            }
                        }
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (pega.<Boolean>resolveMethodCall("endsWith--(String,String)", "endsWith", null, null, new Object[] { scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "," })).booleanValue();
                            }
                        }, "@endsWith(D_pzInitialValues.pySelectedItemTypesLabel,,)")) {
                            try {
                                actionProlog(runtime, "4.4", "When @endsWith(D_pzInitialValues.pySelectedItemTypesLabel,,)", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "4.4.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pySelectedItemTypesLabel", pRef_1, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), pega.<String>resolveMethodCall("whatComesBeforeLast--(String,char)", "whatComesBeforeLast", null, null, new Object[] { scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("D_pzInitialValues", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), ',' }), "sTN", false, true);
                                    actionEpilog(runtime, "4.4.1", "Set D_pzInitialValues.pySelectedItemTypesLabel", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_6) {
                                runtimeTraceContext.setError(e_6);
                                throw e_6;
                            } finally {
                                actionEpilog(runtime, "4.4", "When @endsWith(D_pzInitialValues.pySelectedItemTypesLabel,,)", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "4", "Otherwise ", null, null, runtimeTraceContext);
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
