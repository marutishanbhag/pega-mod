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

public class ra_model_pegaaccel_task_buildapplication_pzprepareadvancedapplicationsettings_781354318 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_31;

    private final ScalarValueQuery scalarValueQuery_29;

    private final ScalarValueQuery scalarValueQuery_28;

    private final ScalarValueQuery scalarValueQuery_26;

    private final ScalarValueQuery scalarValueQuery_23;

    private final ScalarValueQuery scalarValueQuery_22;

    private final ScalarValueQuery scalarValueQuery_20;

    private final ScalarValueQuery scalarValueQuery_18;

    private final ScalarValueQuery scalarValueQuery_15;

    private final ScalarValueQuery scalarValueQuery_13;

    private final ScalarValueQuery scalarValueQuery_11;

    private final ScalarValueQuery scalarValueQuery_9;

    private final ScalarValueQuery scalarValueQuery_7;

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_30 = new String[] { "", "", "pyApplicationClassLayer", "" };

    private static final String [] pRef_32 = new String[] { "", "", "pyClassGroupName", "" };

    private static final String [] pRef_21 = new String[] { "", "", "pyOrganizationExists", "" };

    private static final String [] pRef_10 = new String[] { "", "", "pyApplicationVersion", "" };

    private static final String [] pRef_12 = new String[] { "", "", "pyOrganizationName", "" };

    private static final String [] pRef_25 = new String[] { "", "", "pyDivClassLayer", "" };

    private static final String [] pRef_14 = new String[] { "", "", "pyDivisionName", "" };

    private static final String [] pRef_24 = new String[] { "", "", "pyOrgClassLayer", "" };

    private static final String [] pRef_8 = new String[] { "", "", "pyBaseLocale", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pyApplicationName", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyCreateLayerOptionSelected", "" };

    private static final String [] pRef_27 = new String[] { "", "", "pyUnitClassLayer", "" };

    private static final String [] pRef_16 = new String[] { "", "", "pyUnitName", "" };

    private static final String [] pRef_17 = new String[] { "", "", "pyCreateDivClassLayer", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_19 = new String[] { "", "", "pyCreateUnitClassLayer", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGAACCEL-TASK-BUILDAPPLICATION PZPREPAREADVANCEDAPPLICATIONSETTINGS #20210915T152240.722 GMT", "PegaAccel-Task-BuildApplication pzPrepareAdvancedApplicationSettings", "Pega-ProcessArchitect", "08-07-01", "20210915T152240.722 GMT");

    public ra_model_pegaaccel_task_buildapplication_pzprepareadvancedapplicationsettings_781354318(final Loadtime loadtime) {
        super(ruleTracer, false);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyLabel").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyCreateLayerOptionSelected").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pyApplicationName").buildScalarValueQuery();
        scalarValueQuery_7 = queryBuilderFactory.create().scalarProperty("pyBaseLocale").buildScalarValueQuery();
        scalarValueQuery_9 = queryBuilderFactory.create().scalarProperty("pyApplicationVersion").buildScalarValueQuery();
        scalarValueQuery_11 = queryBuilderFactory.create().scalarProperty("pyOrganizationName").buildScalarValueQuery();
        scalarValueQuery_13 = queryBuilderFactory.create().scalarProperty("pyDivisionName").buildScalarValueQuery();
        scalarValueQuery_15 = queryBuilderFactory.create().scalarProperty("pyUnitName").buildScalarValueQuery();
        scalarValueQuery_18 = queryBuilderFactory.create().scalarProperty("pyCreateDivClassLayer").buildScalarValueQuery();
        scalarValueQuery_20 = queryBuilderFactory.create().scalarProperty("pyCreateUnitClassLayer").buildScalarValueQuery();
        scalarValueQuery_22 = queryBuilderFactory.create().scalarProperty("pyOrganizationExists").buildScalarValueQuery();
        scalarValueQuery_23 = queryBuilderFactory.create().scalarProperty("pyOrgClassLayer").buildScalarValueQuery();
        scalarValueQuery_26 = queryBuilderFactory.create().scalarProperty("pyDivClassLayer").buildScalarValueQuery();
        scalarValueQuery_28 = queryBuilderFactory.create().scalarProperty("pyUnitClassLayer").buildScalarValueQuery();
        scalarValueQuery_29 = queryBuilderFactory.create().scalarProperty("pyApplicationClassLayer").buildScalarValueQuery();
        scalarValueQuery_31 = queryBuilderFactory.create().scalarProperty("pyClassGroupName").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "2", "Set .pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyLabel", pRef_1, myStepPage, scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
            actionEpilog(runtime, "2", "Set .pyLabel", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyCreateLayerOptionSelected==")) {
                try {
                    actionProlog(runtime, "3", "When D_pzBuildApplication.pyCreateLayerOptionSelected==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "3.1", "Set .pyCreateLayerOptionSelected", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyCreateLayerOptionSelected", pRef_4, myStepPage, "Implementation", "stN", false, true);
                        actionEpilog(runtime, "3.1", "Set .pyCreateLayerOptionSelected", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "3", "When D_pzBuildApplication.pyCreateLayerOptionSelected==", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "4", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "4.1", "Set .pyCreateLayerOptionSelected", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyCreateLayerOptionSelected", pRef_4, myStepPage, scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
                        actionEpilog(runtime, "4.1", "Set .pyCreateLayerOptionSelected", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "4", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyApplicationName==")) {
                try {
                    actionProlog(runtime, "5", "When D_pzBuildApplication.pyApplicationName==", null, null, runtimeTraceContext);
                    {
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (!(scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                            }
                        }, "D_pzBuildApplication.pyLabel != ")) {
                            try {
                                actionProlog(runtime, "5.1", "When D_pzBuildApplication.pyLabel != ", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "5.1.1", "Set .pyApplicationName", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyApplicationName", pRef_6, myStepPage, pega.<String>resolveMethodCall("pzGenerateAppNickname--(String)", "pzGenerateAppNickname", null, "Utilities", new Object[] { scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT) }), "sTI", false, true);
                                    actionEpilog(runtime, "5.1.1", "Set .pyApplicationName", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_4) {
                                runtimeTraceContext.setError(e_4);
                                throw e_4;
                            } finally {
                                actionEpilog(runtime, "5.1", "When D_pzBuildApplication.pyLabel != ", null, null, runtimeTraceContext);
                            }
                        } else {
                            try {
                                actionProlog(runtime, "5.2", "Otherwise ", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "5.2.1", "Set .pyApplicationName", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyApplicationName", pRef_6, myStepPage, "", "sTI", false, true);
                                    actionEpilog(runtime, "5.2.1", "Set .pyApplicationName", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_5) {
                                runtimeTraceContext.setError(e_5);
                                throw e_5;
                            } finally {
                                actionEpilog(runtime, "5.2", "Otherwise ", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_6) {
                    runtimeTraceContext.setError(e_6);
                    throw e_6;
                } finally {
                    actionEpilog(runtime, "5", "When D_pzBuildApplication.pyApplicationName==", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "6", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "6.1", "Set .pyApplicationName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyApplicationName", pRef_6, myStepPage, scalarValueQuery_5.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTI", false, true);
                        actionEpilog(runtime, "6.1", "Set .pyApplicationName", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "6", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyBaseLocale==")) {
                try {
                    actionProlog(runtime, "7", "When D_pzBuildApplication.pyBaseLocale==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "7.1", "Set .pyBaseLocale", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyBaseLocale", pRef_8, myStepPage, "en-US", "sTN", false, true);
                        actionEpilog(runtime, "7.1", "Set .pyBaseLocale", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_8) {
                    runtimeTraceContext.setError(e_8);
                    throw e_8;
                } finally {
                    actionEpilog(runtime, "7", "When D_pzBuildApplication.pyBaseLocale==", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "8", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "8.1", "Set .pyBaseLocale", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyBaseLocale", pRef_8, myStepPage, scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "8.1", "Set .pyBaseLocale", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_9) {
                    runtimeTraceContext.setError(e_9);
                    throw e_9;
                } finally {
                    actionEpilog(runtime, "8", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyApplicationVersion==")) {
                try {
                    actionProlog(runtime, "9", "When D_pzBuildApplication.pyApplicationVersion==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "9.1", "Set .pyApplicationVersion", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyApplicationVersion", pRef_10, myStepPage, "01.01.01", "sTN", false, true);
                        actionEpilog(runtime, "9.1", "Set .pyApplicationVersion", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_10) {
                    runtimeTraceContext.setError(e_10);
                    throw e_10;
                } finally {
                    actionEpilog(runtime, "9", "When D_pzBuildApplication.pyApplicationVersion==", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "10", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "10.1", "Set .pyApplicationVersion", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyApplicationVersion", pRef_10, myStepPage, scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "10.1", "Set .pyApplicationVersion", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_11) {
                    runtimeTraceContext.setError(e_11);
                    throw e_11;
                } finally {
                    actionEpilog(runtime, "10", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_11.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyOrganizationName==")) {
                try {
                    actionProlog(runtime, "12", "When D_pzBuildApplication.pyOrganizationName==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "12.1", "Set .pyOrganizationName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyOrganizationName", pRef_12, myStepPage, pega.<String>resolveMethodCall("pxGetRandomName--(String,String)", "pxGetRandomName", null, "Utilities", new Object[] { "O", "5" }), "sTN32", false, true);
                        actionEpilog(runtime, "12.1", "Set .pyOrganizationName", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_12) {
                    runtimeTraceContext.setError(e_12);
                    throw e_12;
                } finally {
                    actionEpilog(runtime, "12", "When D_pzBuildApplication.pyOrganizationName==", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "13", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "13.1", "Set .pyOrganizationName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyOrganizationName", pRef_12, myStepPage, scalarValueQuery_11.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN32", false, true);
                        actionEpilog(runtime, "13.1", "Set .pyOrganizationName", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_13) {
                    runtimeTraceContext.setError(e_13);
                    throw e_13;
                } finally {
                    actionEpilog(runtime, "13", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_13.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyDivisionName==")) {
                try {
                    actionProlog(runtime, "14", "When D_pzBuildApplication.pyDivisionName==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "14.1", "Set .pyDivisionName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDivisionName", pRef_14, myStepPage, "Div", "sTN", false, true);
                        actionEpilog(runtime, "14.1", "Set .pyDivisionName", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_14) {
                    runtimeTraceContext.setError(e_14);
                    throw e_14;
                } finally {
                    actionEpilog(runtime, "14", "When D_pzBuildApplication.pyDivisionName==", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "15", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "15.1", "Set .pyDivisionName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDivisionName", pRef_14, myStepPage, scalarValueQuery_13.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "15.1", "Set .pyDivisionName", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_15) {
                    runtimeTraceContext.setError(e_15);
                    throw e_15;
                } finally {
                    actionEpilog(runtime, "15", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyUnitName==")) {
                try {
                    actionProlog(runtime, "16", "When D_pzBuildApplication.pyUnitName==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "16.1", "Set .pyUnitName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyUnitName", pRef_16, myStepPage, "Unit", "sTN", false, true);
                        actionEpilog(runtime, "16.1", "Set .pyUnitName", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_16) {
                    runtimeTraceContext.setError(e_16);
                    throw e_16;
                } finally {
                    actionEpilog(runtime, "16", "When D_pzBuildApplication.pyUnitName==", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "17", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "17.1", "Set .pyUnitName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyUnitName", pRef_16, myStepPage, scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "17.1", "Set .pyUnitName", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_17) {
                    runtimeTraceContext.setError(e_17);
                    throw e_17;
                } finally {
                    actionEpilog(runtime, "17", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "18", "Set .pyCreateDivClassLayer", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCreateDivClassLayer", pRef_17, myStepPage, scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
            actionEpilog(runtime, "18", "Set .pyCreateDivClassLayer", null, null, runtimeTraceContext);
            actionProlog(runtime, "19", "Set .pyCreateUnitClassLayer", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCreateUnitClassLayer", pRef_19, myStepPage, scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
            actionEpilog(runtime, "19", "Set .pyCreateUnitClassLayer", null, null, runtimeTraceContext);
            actionProlog(runtime, "20", "Set .pyOrganizationExists", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyOrganizationExists", pRef_21, myStepPage, scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
            actionEpilog(runtime, "20", "Set .pyOrganizationExists", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_23.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyOrgClassLayer==")) {
                try {
                    actionProlog(runtime, "22", "When D_pzBuildApplication.pyOrgClassLayer==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "22.1", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyOrgClassLayer", pRef_24, myStepPage, pega.<String>resolveMethodCall("whatComesBeforeFirst--(String,char)", "whatComesBeforeFirst", null, "String", new Object[] { scalarValueQuery_11.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), '.' }), "sTN", false, true);
                        actionEpilog(runtime, "22.1", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                        actionProlog(runtime, "22.2", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyOrgClassLayer", pRef_24, myStepPage, pega.<String>resolveMethodCall("pzMakeRecordID--(String,String)", "pzMakeRecordID", null, "pxRuleManagement", new Object[] { scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "" }), "sTN", false, true);
                        actionEpilog(runtime, "22.2", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                        actionProlog(runtime, "22.3", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyOrgClassLayer", pRef_24, myStepPage, pega.<String>resolveMethodCall("substring--(String,int,int)", "substring", null, "String", new Object[] { scalarValueQuery_23.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), 0, 6 }), "sTN", false, true);
                        actionEpilog(runtime, "22.3", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_18) {
                    runtimeTraceContext.setError(e_18);
                    throw e_18;
                } finally {
                    actionEpilog(runtime, "22", "When D_pzBuildApplication.pyOrgClassLayer==", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "23", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "23.1", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyOrgClassLayer", pRef_24, myStepPage, scalarValueQuery_23.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "23.1", "Set .pyOrgClassLayer", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_19) {
                    runtimeTraceContext.setError(e_19);
                    throw e_19;
                } finally {
                    actionEpilog(runtime, "23", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "24", "Set .pyDivClassLayer", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDivClassLayer", pRef_25, myStepPage, scalarValueQuery_26.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "24", "Set .pyDivClassLayer", null, null, runtimeTraceContext);
            actionProlog(runtime, "25", "Set .pyUnitClassLayer", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyUnitClassLayer", pRef_27, myStepPage, scalarValueQuery_28.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "25", "Set .pyUnitClassLayer", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_29.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyApplicationClassLayer==")) {
                try {
                    actionProlog(runtime, "26", "When D_pzBuildApplication.pyApplicationClassLayer==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "26.1", "Set .pyApplicationClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyApplicationClassLayer", pRef_30, myStepPage, scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "26.1", "Set .pyApplicationClassLayer", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_20) {
                    runtimeTraceContext.setError(e_20);
                    throw e_20;
                } finally {
                    actionEpilog(runtime, "26", "When D_pzBuildApplication.pyApplicationClassLayer==", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "27", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "27.1", "Set .pyApplicationClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyApplicationClassLayer", pRef_30, myStepPage, scalarValueQuery_29.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "27.1", "Set .pyApplicationClassLayer", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_21) {
                    runtimeTraceContext.setError(e_21);
                    throw e_21;
                } finally {
                    actionEpilog(runtime, "27", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_31.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyClassGroupName==")) {
                try {
                    actionProlog(runtime, "28", "When D_pzBuildApplication.pyClassGroupName==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "28.1", "Set .pyClassGroupName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyClassGroupName", pRef_32, myStepPage, "Work", "sTI", false, true);
                        actionEpilog(runtime, "28.1", "Set .pyClassGroupName", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_22) {
                    runtimeTraceContext.setError(e_22);
                    throw e_22;
                } finally {
                    actionEpilog(runtime, "28", "When D_pzBuildApplication.pyClassGroupName==", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "29", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "29.1", "Set .pyClassGroupName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyClassGroupName", pRef_32, myStepPage, scalarValueQuery_31.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTI", false, true);
                        actionEpilog(runtime, "29.1", "Set .pyClassGroupName", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_23) {
                    runtimeTraceContext.setError(e_23);
                    throw e_23;
                } finally {
                    actionEpilog(runtime, "29", "Otherwise ", null, null, runtimeTraceContext);
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
