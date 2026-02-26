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

public class ra_model_data_dm_notificationconfig_pysetalertthresholds_1211312122 extends AbstractDataTransform {

    private final PageQuery pageQuery_50;

    private final PageQuery pageQuery_49;

    private final PageQuery pageQuery_48;

    private final PageQuery pageQuery_47;

    private final PageQuery pageQuery_46;

    private final PageQuery pageQuery_45;

    private final PageQuery pageQuery_44;

    private final PageQuery pageQuery_43;

    private final PageQuery pageQuery_42;

    private final PageQuery pageQuery_41;

    private final PageQuery pageQuery_40;

    private final PageQuery pageQuery_39;

    private final PageQuery pageQuery_38;

    private final PageQuery pageQuery_37;

    private final PageQuery pageQuery_36;

    private final PageQuery pageQuery_35;

    private final PageQuery pageQuery_34;

    private final PageQuery pageQuery_33;

    private final PageQuery pageQuery_32;

    private final PageQuery pageQuery_31;

    private final PageQuery pageQuery_30;

    private final PageQuery pageQuery_29;

    private final ScalarValueQuery scalarValueQuery_27;

    private final PageQuery pageQuery_26;

    private final ScalarValueQuery scalarValueQuery_24;

    private final ScalarValueQuery scalarValueQuery_22;

    private final ScalarValueQuery scalarValueQuery_20;

    private final PageQuery pageQuery_16;

    private final PageQuery pageQuery_12;

    private final ScalarValueQuery scalarValueQuery_10;

    private final ScalarValueQuery scalarValueQuery_8;

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_2;

    private final PageQuery pageQuery_1;

    private static final String [] pRef_21 = new String[] { "", "", "pyEnableNotification", "" };

    private static final String [] pRef_23 = new String[] { "", "", "pySendEmail", "" };

    private static final String [] pRef_11 = new String[] { "", "", "pyRecordMonitoringData", "" };

    private static final String [] pRef_25 = new String[] { "", "", "pyImpactLevel", "" };

    private static final String [] pRef_14 = new String[] { "", "", "pyDescription", "" };

    private static final String [] pRef_13 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pyGlobalEmailDigest", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyMonitorPercentage", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyMonitoringCoverage", "" };

    private static final String [] pRef_15 = new String[] { "", "", "pyRank", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyEnableMonitoring", "" };

    private static final String [] pRef_18 = new String[] { "", "", "pyIsPercentage", "" };

    private static final String [] pRef_28 = new String[] { "", "", "pyThresholdValue", "" };

    private static final String [] pRef_17 = new String[] { "", "", "pyDisplayText", "" };

    private static final String [] pRef_19 = new String[] { "", "", "pyHasThreshold", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL DATA-DM-NOTIFICATIONCONFIG PYSETALERTTHRESHOLDS #20220214T131711.394 GMT", "Data-DM-NotificationConfig pySetAlertThresholds", "Pega-DecisionScience", "08-08-01", "20220613T073659.402 GMT");

    public ra_model_data_dm_notificationconfig_pysetalertthresholds_1211312122(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        pageQuery_1 = queryBuilderFactory.create().page("pyGlobalMonitorAndNotificationSettings").buildPageQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyEnableMonitoring").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().scalarProperty("pyMonitoringCoverage").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().scalarProperty("pyMonitorPercentage").buildScalarValueQuery();
        scalarValueQuery_8 = queryBuilderFactory.create().scalarProperty("pyGlobalEmailDigest").buildScalarValueQuery();
        scalarValueQuery_10 = queryBuilderFactory.create().scalarProperty("pyRecordMonitoringData").buildScalarValueQuery();
        pageQuery_12 = queryBuilderFactory.create().pageGroup("pyAlertThresholds", "Performance").buildPageQuery();
        pageQuery_16 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N3").buildPageQuery();
        scalarValueQuery_20 = queryBuilderFactory.create().scalarProperty("pyEnableNotification").buildScalarValueQuery();
        scalarValueQuery_22 = queryBuilderFactory.create().scalarProperty("pySendEmail").buildScalarValueQuery();
        scalarValueQuery_24 = queryBuilderFactory.create().scalarProperty("pyImpactLevel").buildScalarValueQuery();
        pageQuery_26 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N8").buildPageQuery();
        scalarValueQuery_27 = queryBuilderFactory.create().scalarProperty("pyThresholdValue").buildScalarValueQuery();
        pageQuery_29 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N9").buildPageQuery();
        pageQuery_30 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N10").buildPageQuery();
        pageQuery_31 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N11").buildPageQuery();
        pageQuery_32 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N12").buildPageQuery();
        pageQuery_33 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N13").buildPageQuery();
        pageQuery_34 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N14").buildPageQuery();
        pageQuery_35 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N15").buildPageQuery();
        pageQuery_36 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N16").buildPageQuery();
        pageQuery_37 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N17").buildPageQuery();
        pageQuery_38 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N18").buildPageQuery();
        pageQuery_39 = queryBuilderFactory.create().pageGroup("pyAlertThresholds", "Response").buildPageQuery();
        pageQuery_40 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N2").buildPageQuery();
        pageQuery_41 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N4").buildPageQuery();
        pageQuery_42 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N6").buildPageQuery();
        pageQuery_43 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N7").buildPageQuery();
        pageQuery_44 = queryBuilderFactory.create().pageGroup("pyAlertThresholds", "Output").buildPageQuery();
        pageQuery_45 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N30").buildPageQuery();
        pageQuery_46 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N31").buildPageQuery();
        pageQuery_47 = queryBuilderFactory.create().pageGroup("pyAlertThresholds", "Predictors").buildPageQuery();
        pageQuery_48 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N35").buildPageQuery();
        pageQuery_49 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N37").buildPageQuery();
        pageQuery_50 = queryBuilderFactory.create().pageGroup("pyAlertDetail", "N38").buildPageQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = pageQuery_1.resolve(tools, myStepPage);
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("Data-DM-NotificationConfig", null, myStepPage, false, false);
                actionProlog(runtime, "1", "Update Page .pyGlobalMonitorAndNotificationSettings", sourcePage_1, myStepPage, runtimeTraceContext);
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (!(scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("DSMConfig", "Data-Admin-Connect-DSMConfig"), ImmutablePropertyInfo.TYPE_TRUEFALSE).equals("")));
                    }
                }, "DSMConfig.pyEnableMonitoring!=")) {
                    try {
                        actionProlog(runtime, "1.1", "When DSMConfig.pyEnableMonitoring!=", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.1.1", "Set .pyEnableMonitoring", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyEnableMonitoring", pRef_3, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("DSMConfig", "Data-Admin-Connect-DSMConfig"), ImmutablePropertyInfo.TYPE_TRUEFALSE);
                                }
                            }), "sSN", false, true);
                            actionEpilog(runtime, "1.1.1", "Set .pyEnableMonitoring", sourcePage_1, myStepPage, runtimeTraceContext);
                        }
                    } catch (Exception e_3) {
                        runtimeTraceContext.setError(e_3);
                        throw e_3;
                    } finally {
                        actionEpilog(runtime, "1.1", "When DSMConfig.pyEnableMonitoring!=", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                    }
                }, ".pyEnableMonitoring==")) {
                    try {
                        actionProlog(runtime, "1.2", "When .pyEnableMonitoring==", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.2.1", "Set .pyEnableMonitoring", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyEnableMonitoring", pRef_3, myStepPage, true, "sSN", false, true);
                            actionEpilog(runtime, "1.2.1", "Set .pyEnableMonitoring", sourcePage_1, myStepPage, runtimeTraceContext);
                        }
                    } catch (Exception e_4) {
                        runtimeTraceContext.setError(e_4);
                        throw e_4;
                    } finally {
                        actionEpilog(runtime, "1.2", "When .pyEnableMonitoring==", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (!(scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("DSMConfig", "Data-Admin-Connect-DSMConfig"), ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                    }
                }, "DSMConfig.pyMonitoringCoverage!=")) {
                    try {
                        actionProlog(runtime, "1.3", "When DSMConfig.pyMonitoringCoverage!=", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.3.1", "Set .pyMonitoringCoverage", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyMonitoringCoverage", pRef_5, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("DSMConfig", "Data-Admin-Connect-DSMConfig"), ImmutablePropertyInfo.TYPE_TEXT);
                                }
                            }), "stN", false, true);
                            actionEpilog(runtime, "1.3.1", "Set .pyMonitoringCoverage", sourcePage_1, myStepPage, runtimeTraceContext);
                        }
                    } catch (Exception e_5) {
                        runtimeTraceContext.setError(e_5);
                        throw e_5;
                    } finally {
                        actionEpilog(runtime, "1.3", "When DSMConfig.pyMonitoringCoverage!=", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                    }
                }, ".pyMonitoringCoverage==")) {
                    try {
                        actionProlog(runtime, "1.4", "When .pyMonitoringCoverage==", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.4.1", "Set .pyMonitoringCoverage", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyMonitoringCoverage", pRef_5, myStepPage, "InputAndOutput", "stN", false, true);
                            actionEpilog(runtime, "1.4.1", "Set .pyMonitoringCoverage", sourcePage_1, myStepPage, runtimeTraceContext);
                        }
                    } catch (Exception e_6) {
                        runtimeTraceContext.setError(e_6);
                        throw e_6;
                    } finally {
                        actionEpilog(runtime, "1.4", "When .pyMonitoringCoverage==", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (!(scalarValueQuery_6.resolveToString(tools, pega.findPageWithException("DSMConfig", "Data-Admin-Connect-DSMConfig"), ImmutablePropertyInfo.TYPE_DOUBLE).equals("")));
                    }
                }, "DSMConfig.pyMonitorPercentage!=")) {
                    try {
                        actionProlog(runtime, "1.5", "When DSMConfig.pyMonitorPercentage!=", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.5.1", "Set .pyMonitorPercentage", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyMonitorPercentage", pRef_7, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_6.resolveToString(tools, pega.findPageWithException("DSMConfig", "Data-Admin-Connect-DSMConfig"), ImmutablePropertyInfo.TYPE_DOUBLE);
                                }
                            }), "sEN", false, true);
                            actionEpilog(runtime, "1.5.1", "Set .pyMonitorPercentage", sourcePage_1, myStepPage, runtimeTraceContext);
                        }
                    } catch (Exception e_7) {
                        runtimeTraceContext.setError(e_7);
                        throw e_7;
                    } finally {
                        actionEpilog(runtime, "1.5", "When DSMConfig.pyMonitorPercentage!=", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_DOUBLE).equals(""));
                    }
                }, ".pyMonitorPercentage==")) {
                    try {
                        actionProlog(runtime, "1.6", "When .pyMonitorPercentage==", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.6.1", "Set .pyMonitorPercentage", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyMonitorPercentage", pRef_7, myStepPage, 5.0, "sEN", false, true);
                            actionEpilog(runtime, "1.6.1", "Set .pyMonitorPercentage", sourcePage_1, myStepPage, runtimeTraceContext);
                        }
                    } catch (Exception e_8) {
                        runtimeTraceContext.setError(e_8);
                        throw e_8;
                    } finally {
                        actionEpilog(runtime, "1.6", "When .pyMonitorPercentage==", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                    }
                }, ".pyGlobalEmailDigest==")) {
                    try {
                        actionProlog(runtime, "1.7", "When .pyGlobalEmailDigest==", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.7.1", "Set .pyGlobalEmailDigest", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyGlobalEmailDigest", pRef_9, myStepPage, true, "sSN", false, true);
                            actionEpilog(runtime, "1.7.1", "Set .pyGlobalEmailDigest", sourcePage_1, myStepPage, runtimeTraceContext);
                        }
                    } catch (Exception e_9) {
                        runtimeTraceContext.setError(e_9);
                        throw e_9;
                    } finally {
                        actionEpilog(runtime, "1.7", "When .pyGlobalEmailDigest==", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (!(scalarValueQuery_10.resolveToString(tools, pega.findPageWithException("DSMConfig", "Data-Admin-Connect-DSMConfig"), ImmutablePropertyInfo.TYPE_TRUEFALSE).equals("")));
                    }
                }, "DSMConfig.pyRecordMonitoringData!=")) {
                    try {
                        actionProlog(runtime, "1.8", "When DSMConfig.pyRecordMonitoringData!=", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.8.1", "Set .pyRecordMonitoringData", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyRecordMonitoringData", pRef_11, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                                public String apply(ClipboardPage myStepPage) {
                                    return scalarValueQuery_10.resolveToString(tools, pega.findPageWithException("DSMConfig", "Data-Admin-Connect-DSMConfig"), ImmutablePropertyInfo.TYPE_TRUEFALSE);
                                }
                            }), "sSN", false, true);
                            actionEpilog(runtime, "1.8.1", "Set .pyRecordMonitoringData", sourcePage_1, myStepPage, runtimeTraceContext);
                        }
                    } catch (Exception e_10) {
                        runtimeTraceContext.setError(e_10);
                        throw e_10;
                    } finally {
                        actionEpilog(runtime, "1.8", "When DSMConfig.pyRecordMonitoringData!=", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
                if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return (scalarValueQuery_10.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                    }
                }, ".pyRecordMonitoringData==")) {
                    try {
                        actionProlog(runtime, "1.9", "When .pyRecordMonitoringData==", sourcePage_1, myStepPage, runtimeTraceContext);
                        {
                            actionProlog(runtime, "1.9.1", "Set .pyRecordMonitoringData", sourcePage_1, myStepPage, runtimeTraceContext);
                            pega.setViaPropRef(".pyRecordMonitoringData", pRef_11, myStepPage, false, "sSN", false, true);
                            actionEpilog(runtime, "1.9.1", "Set .pyRecordMonitoringData", sourcePage_1, myStepPage, runtimeTraceContext);
                        }
                    } catch (Exception e_11) {
                        runtimeTraceContext.setError(e_11);
                        throw e_11;
                    } finally {
                        actionEpilog(runtime, "1.9", "When .pyRecordMonitoringData==", sourcePage_1, myStepPage, runtimeTraceContext);
                    }
                }
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "1", "Update Page .pyGlobalMonitorAndNotificationSettings", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_1);
                myStepPage = tmp_1;
            }
            ClipboardPage sourcePage_2 = myStepPage;
            ClipboardPage tmp_2 = myStepPage;
            myStepPage = pageQuery_12.resolve(tools, myStepPage);
            PRStackFrame stackFrame_14 = null;
            try {
                stackFrame_14 = pega.pushStackFrame("Embed-NameValuePair", null, myStepPage, false, false);
                actionProlog(runtime, "2", "Update Page .pyAlertThresholds(Performance)", sourcePage_2, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "2.1", "Set .pyLabel", sourcePage_2, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, "PerformanceLabel", "sTN64", false, true);
                actionEpilog(runtime, "2.1", "Set .pyLabel", sourcePage_2, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "2.2", "Set .pyDescription", sourcePage_2, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "PerformanceAlertIntro", "sTN", false, true);
                actionEpilog(runtime, "2.2", "Set .pyDescription", sourcePage_2, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "2.3", "Set .pyRank", sourcePage_2, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyRank", pRef_15, myStepPage, 1, "sNN", false, true);
                actionEpilog(runtime, "2.3", "Set .pyRank", sourcePage_2, myStepPage, runtimeTraceContext);
                ClipboardPage sourcePage_3 = sourcePage_2;
                ClipboardPage tmp_3 = myStepPage;
                myStepPage = pageQuery_16.resolve(tools, myStepPage);
                PRStackFrame stackFrame_2 = null;
                try {
                    stackFrame_2 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.4", "Update Page .pyAlertDetail(N3)", sourcePage_3, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.4.1", "Set .pyDescription", sourcePage_3, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N3_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.4.1", "Set .pyDescription", sourcePage_3, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.4.2", "Set .pyDisplayText", sourcePage_3, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "2.4.2", "Set .pyDisplayText", sourcePage_3, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.4.3", "Set .pyIsPercentage", sourcePage_3, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.4.3", "Set .pyIsPercentage", sourcePage_3, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.4.4", "Set .pyHasThreshold", sourcePage_3, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.4.4", "Set .pyHasThreshold", sourcePage_3, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.4.5", "When .pyEnableNotification==", sourcePage_3, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.4.5.1", "Set .pyEnableNotification", sourcePage_3, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, true, "sSN", false, true);
                                actionEpilog(runtime, "2.4.5.1", "Set .pyEnableNotification", sourcePage_3, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_14) {
                            runtimeTraceContext.setError(e_14);
                            throw e_14;
                        } finally {
                            actionEpilog(runtime, "2.4.5", "When .pyEnableNotification==", sourcePage_3, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.4.6", "When .pySendEmail==", sourcePage_3, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.4.6.1", "Set .pySendEmail", sourcePage_3, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "Yes", "stN", false, true);
                                actionEpilog(runtime, "2.4.6.1", "Set .pySendEmail", sourcePage_3, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_15) {
                            runtimeTraceContext.setError(e_15);
                            throw e_15;
                        } finally {
                            actionEpilog(runtime, "2.4.6", "When .pySendEmail==", sourcePage_3, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.4.7", "When .pyImpactLevel==", sourcePage_3, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.4.7.1", "Set .pyImpactLevel", sourcePage_3, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "High", "stN", false, true);
                                actionEpilog(runtime, "2.4.7.1", "Set .pyImpactLevel", sourcePage_3, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_16) {
                            runtimeTraceContext.setError(e_16);
                            throw e_16;
                        } finally {
                            actionEpilog(runtime, "2.4.7", "When .pyImpactLevel==", sourcePage_3, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_13) {
                    runtimeTraceContext.setError(e_13);
                    throw e_13;
                } finally {
                    actionEpilog(runtime, "2.4", "Update Page .pyAlertDetail(N3)", sourcePage_3, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_2);
                    myStepPage = tmp_3;
                }
                ClipboardPage sourcePage_4 = sourcePage_2;
                ClipboardPage tmp_4 = myStepPage;
                myStepPage = pageQuery_26.resolve(tools, myStepPage);
                PRStackFrame stackFrame_3 = null;
                try {
                    stackFrame_3 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.5", "Update Page .pyAlertDetail(N8)", sourcePage_4, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.5.1", "Set .pyDescription", sourcePage_4, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N8_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.5.1", "Set .pyDescription", sourcePage_4, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.5.2", "Set .pyDisplayText", sourcePage_4, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "N8_AlertChangeMessage", "sTN64", false, true);
                    actionEpilog(runtime, "2.5.2", "Set .pyDisplayText", sourcePage_4, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.5.3", "Set .pyIsPercentage", sourcePage_4, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "2.5.3", "Set .pyIsPercentage", sourcePage_4, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.5.4", "Set .pyHasThreshold", sourcePage_4, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "2.5.4", "Set .pyHasThreshold", sourcePage_4, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER).equals(""));
                        }
                    }, ".pyThresholdValue==")) {
                        try {
                            actionProlog(runtime, "2.5.5", "When .pyThresholdValue==", sourcePage_4, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.5.5.1", "Set .pyThresholdValue", sourcePage_4, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyThresholdValue", pRef_28, myStepPage, 20, "sNN", false, true);
                                actionEpilog(runtime, "2.5.5.1", "Set .pyThresholdValue", sourcePage_4, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_18) {
                            runtimeTraceContext.setError(e_18);
                            throw e_18;
                        } finally {
                            actionEpilog(runtime, "2.5.5", "When .pyThresholdValue==", sourcePage_4, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.5.6", "When .pyEnableNotification==", sourcePage_4, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.5.6.1", "Set .pyEnableNotification", sourcePage_4, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "2.5.6.1", "Set .pyEnableNotification", sourcePage_4, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_19) {
                            runtimeTraceContext.setError(e_19);
                            throw e_19;
                        } finally {
                            actionEpilog(runtime, "2.5.6", "When .pyEnableNotification==", sourcePage_4, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.5.7", "When .pySendEmail==", sourcePage_4, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.5.7.1", "Set .pySendEmail", sourcePage_4, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "2.5.7.1", "Set .pySendEmail", sourcePage_4, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_20) {
                            runtimeTraceContext.setError(e_20);
                            throw e_20;
                        } finally {
                            actionEpilog(runtime, "2.5.7", "When .pySendEmail==", sourcePage_4, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.5.8", "When .pyImpactLevel==", sourcePage_4, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.5.8.1", "Set .pyImpactLevel", sourcePage_4, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Medium", "stN", false, true);
                                actionEpilog(runtime, "2.5.8.1", "Set .pyImpactLevel", sourcePage_4, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_21) {
                            runtimeTraceContext.setError(e_21);
                            throw e_21;
                        } finally {
                            actionEpilog(runtime, "2.5.8", "When .pyImpactLevel==", sourcePage_4, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_17) {
                    runtimeTraceContext.setError(e_17);
                    throw e_17;
                } finally {
                    actionEpilog(runtime, "2.5", "Update Page .pyAlertDetail(N8)", sourcePage_4, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_3);
                    myStepPage = tmp_4;
                }
                ClipboardPage sourcePage_5 = sourcePage_2;
                ClipboardPage tmp_5 = myStepPage;
                myStepPage = pageQuery_29.resolve(tools, myStepPage);
                PRStackFrame stackFrame_4 = null;
                try {
                    stackFrame_4 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.6", "Update Page .pyAlertDetail(N9)", sourcePage_5, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.6.1", "Set .pyDescription", sourcePage_5, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N9_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.6.1", "Set .pyDescription", sourcePage_5, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.6.2", "Set .pyDisplayText", sourcePage_5, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "N9_AlertChangeMessage", "sTN64", false, true);
                    actionEpilog(runtime, "2.6.2", "Set .pyDisplayText", sourcePage_5, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.6.3", "Set .pyIsPercentage", sourcePage_5, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "2.6.3", "Set .pyIsPercentage", sourcePage_5, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.6.4", "Set .pyHasThreshold", sourcePage_5, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "2.6.4", "Set .pyHasThreshold", sourcePage_5, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER).equals(""));
                        }
                    }, ".pyThresholdValue==")) {
                        try {
                            actionProlog(runtime, "2.6.5", "When .pyThresholdValue==", sourcePage_5, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.6.5.1", "Set .pyThresholdValue", sourcePage_5, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyThresholdValue", pRef_28, myStepPage, 50, "sNN", false, true);
                                actionEpilog(runtime, "2.6.5.1", "Set .pyThresholdValue", sourcePage_5, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_23) {
                            runtimeTraceContext.setError(e_23);
                            throw e_23;
                        } finally {
                            actionEpilog(runtime, "2.6.5", "When .pyThresholdValue==", sourcePage_5, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.6.6", "When .pyEnableNotification==", sourcePage_5, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.6.6.1", "Set .pyEnableNotification", sourcePage_5, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, true, "sSN", false, true);
                                actionEpilog(runtime, "2.6.6.1", "Set .pyEnableNotification", sourcePage_5, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_24) {
                            runtimeTraceContext.setError(e_24);
                            throw e_24;
                        } finally {
                            actionEpilog(runtime, "2.6.6", "When .pyEnableNotification==", sourcePage_5, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.6.7", "When .pySendEmail==", sourcePage_5, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.6.7.1", "Set .pySendEmail", sourcePage_5, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "2.6.7.1", "Set .pySendEmail", sourcePage_5, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_25) {
                            runtimeTraceContext.setError(e_25);
                            throw e_25;
                        } finally {
                            actionEpilog(runtime, "2.6.7", "When .pySendEmail==", sourcePage_5, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.6.8", "When .pyImpactLevel==", sourcePage_5, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.6.8.1", "Set .pyImpactLevel", sourcePage_5, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Medium", "stN", false, true);
                                actionEpilog(runtime, "2.6.8.1", "Set .pyImpactLevel", sourcePage_5, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_26) {
                            runtimeTraceContext.setError(e_26);
                            throw e_26;
                        } finally {
                            actionEpilog(runtime, "2.6.8", "When .pyImpactLevel==", sourcePage_5, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_22) {
                    runtimeTraceContext.setError(e_22);
                    throw e_22;
                } finally {
                    actionEpilog(runtime, "2.6", "Update Page .pyAlertDetail(N9)", sourcePage_5, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_4);
                    myStepPage = tmp_5;
                }
                ClipboardPage sourcePage_6 = sourcePage_2;
                ClipboardPage tmp_6 = myStepPage;
                myStepPage = pageQuery_30.resolve(tools, myStepPage);
                PRStackFrame stackFrame_5 = null;
                try {
                    stackFrame_5 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.7", "Update Page .pyAlertDetail(N10)", sourcePage_6, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.7.1", "Set .pyDescription", sourcePage_6, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N10_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.7.1", "Set .pyDescription", sourcePage_6, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.7.2", "Set .pyDisplayText", sourcePage_6, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "2.7.2", "Set .pyDisplayText", sourcePage_6, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.7.3", "Set .pyIsPercentage", sourcePage_6, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.7.3", "Set .pyIsPercentage", sourcePage_6, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.7.4", "Set .pyHasThreshold", sourcePage_6, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.7.4", "Set .pyHasThreshold", sourcePage_6, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.7.5", "When .pyEnableNotification==", sourcePage_6, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.7.5.1", "Set .pyEnableNotification", sourcePage_6, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "2.7.5.1", "Set .pyEnableNotification", sourcePage_6, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_28) {
                            runtimeTraceContext.setError(e_28);
                            throw e_28;
                        } finally {
                            actionEpilog(runtime, "2.7.5", "When .pyEnableNotification==", sourcePage_6, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.7.6", "When .pySendEmail==", sourcePage_6, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.7.6.1", "Set .pySendEmail", sourcePage_6, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "2.7.6.1", "Set .pySendEmail", sourcePage_6, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_29) {
                            runtimeTraceContext.setError(e_29);
                            throw e_29;
                        } finally {
                            actionEpilog(runtime, "2.7.6", "When .pySendEmail==", sourcePage_6, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.7.7", "When .pyImpactLevel==", sourcePage_6, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.7.7.1", "Set .pyImpactLevel", sourcePage_6, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Medium", "stN", false, true);
                                actionEpilog(runtime, "2.7.7.1", "Set .pyImpactLevel", sourcePage_6, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_30) {
                            runtimeTraceContext.setError(e_30);
                            throw e_30;
                        } finally {
                            actionEpilog(runtime, "2.7.7", "When .pyImpactLevel==", sourcePage_6, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_27) {
                    runtimeTraceContext.setError(e_27);
                    throw e_27;
                } finally {
                    actionEpilog(runtime, "2.7", "Update Page .pyAlertDetail(N10)", sourcePage_6, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_5);
                    myStepPage = tmp_6;
                }
                ClipboardPage sourcePage_7 = sourcePage_2;
                ClipboardPage tmp_7 = myStepPage;
                myStepPage = pageQuery_31.resolve(tools, myStepPage);
                PRStackFrame stackFrame_6 = null;
                try {
                    stackFrame_6 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.8", "Update Page .pyAlertDetail(N11)", sourcePage_7, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.8.1", "Set .pyDescription", sourcePage_7, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N11_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.8.1", "Set .pyDescription", sourcePage_7, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.8.2", "Set .pyDisplayText", sourcePage_7, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "2.8.2", "Set .pyDisplayText", sourcePage_7, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.8.3", "Set .pyIsPercentage", sourcePage_7, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.8.3", "Set .pyIsPercentage", sourcePage_7, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.8.4", "Set .pyHasThreshold", sourcePage_7, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.8.4", "Set .pyHasThreshold", sourcePage_7, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.8.5", "When .pyEnableNotification==", sourcePage_7, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.8.5.1", "Set .pyEnableNotification", sourcePage_7, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "2.8.5.1", "Set .pyEnableNotification", sourcePage_7, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_32) {
                            runtimeTraceContext.setError(e_32);
                            throw e_32;
                        } finally {
                            actionEpilog(runtime, "2.8.5", "When .pyEnableNotification==", sourcePage_7, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.8.6", "When .pySendEmail==", sourcePage_7, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.8.6.1", "Set .pySendEmail", sourcePage_7, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "2.8.6.1", "Set .pySendEmail", sourcePage_7, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_33) {
                            runtimeTraceContext.setError(e_33);
                            throw e_33;
                        } finally {
                            actionEpilog(runtime, "2.8.6", "When .pySendEmail==", sourcePage_7, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.8.7", "When .pyImpactLevel==", sourcePage_7, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.8.7.1", "Set .pyImpactLevel", sourcePage_7, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Medium", "stN", false, true);
                                actionEpilog(runtime, "2.8.7.1", "Set .pyImpactLevel", sourcePage_7, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_34) {
                            runtimeTraceContext.setError(e_34);
                            throw e_34;
                        } finally {
                            actionEpilog(runtime, "2.8.7", "When .pyImpactLevel==", sourcePage_7, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_31) {
                    runtimeTraceContext.setError(e_31);
                    throw e_31;
                } finally {
                    actionEpilog(runtime, "2.8", "Update Page .pyAlertDetail(N11)", sourcePage_7, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_6);
                    myStepPage = tmp_7;
                }
                ClipboardPage sourcePage_8 = sourcePage_2;
                ClipboardPage tmp_8 = myStepPage;
                myStepPage = pageQuery_32.resolve(tools, myStepPage);
                PRStackFrame stackFrame_7 = null;
                try {
                    stackFrame_7 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.9", "Update Page .pyAlertDetail(N12)", sourcePage_8, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.9.1", "Set .pyDescription", sourcePage_8, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N12_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.9.1", "Set .pyDescription", sourcePage_8, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.9.2", "Set .pyDisplayText", sourcePage_8, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "2.9.2", "Set .pyDisplayText", sourcePage_8, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.9.3", "Set .pyIsPercentage", sourcePage_8, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.9.3", "Set .pyIsPercentage", sourcePage_8, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.9.4", "Set .pyHasThreshold", sourcePage_8, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.9.4", "Set .pyHasThreshold", sourcePage_8, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.9.5", "When .pyEnableNotification==", sourcePage_8, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.9.5.1", "Set .pyEnableNotification", sourcePage_8, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, true, "sSN", false, true);
                                actionEpilog(runtime, "2.9.5.1", "Set .pyEnableNotification", sourcePage_8, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_36) {
                            runtimeTraceContext.setError(e_36);
                            throw e_36;
                        } finally {
                            actionEpilog(runtime, "2.9.5", "When .pyEnableNotification==", sourcePage_8, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.9.6", "When .pySendEmail==", sourcePage_8, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.9.6.1", "Set .pySendEmail", sourcePage_8, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "Yes", "stN", false, true);
                                actionEpilog(runtime, "2.9.6.1", "Set .pySendEmail", sourcePage_8, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_37) {
                            runtimeTraceContext.setError(e_37);
                            throw e_37;
                        } finally {
                            actionEpilog(runtime, "2.9.6", "When .pySendEmail==", sourcePage_8, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.9.7", "When .pyImpactLevel==", sourcePage_8, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.9.7.1", "Set .pyImpactLevel", sourcePage_8, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "High", "stN", false, true);
                                actionEpilog(runtime, "2.9.7.1", "Set .pyImpactLevel", sourcePage_8, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_38) {
                            runtimeTraceContext.setError(e_38);
                            throw e_38;
                        } finally {
                            actionEpilog(runtime, "2.9.7", "When .pyImpactLevel==", sourcePage_8, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_35) {
                    runtimeTraceContext.setError(e_35);
                    throw e_35;
                } finally {
                    actionEpilog(runtime, "2.9", "Update Page .pyAlertDetail(N12)", sourcePage_8, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_7);
                    myStepPage = tmp_8;
                }
                ClipboardPage sourcePage_9 = sourcePage_2;
                ClipboardPage tmp_9 = myStepPage;
                myStepPage = pageQuery_33.resolve(tools, myStepPage);
                PRStackFrame stackFrame_8 = null;
                try {
                    stackFrame_8 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.10", "Update Page .pyAlertDetail(N13)", sourcePage_9, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.10.1", "Set .pyDescription", sourcePage_9, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N13_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.10.1", "Set .pyDescription", sourcePage_9, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.10.2", "Set .pyDisplayText", sourcePage_9, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "N13_AlertChangeMessage", "sTN64", false, true);
                    actionEpilog(runtime, "2.10.2", "Set .pyDisplayText", sourcePage_9, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.10.3", "Set .pyIsPercentage", sourcePage_9, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "2.10.3", "Set .pyIsPercentage", sourcePage_9, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.10.4", "Set .pyHasThreshold", sourcePage_9, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "2.10.4", "Set .pyHasThreshold", sourcePage_9, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER).equals(""));
                        }
                    }, ".pyThresholdValue==")) {
                        try {
                            actionProlog(runtime, "2.10.5", "When .pyThresholdValue==", sourcePage_9, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.10.5.1", "Set .pyThresholdValue", sourcePage_9, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyThresholdValue", pRef_28, myStepPage, 20, "sNN", false, true);
                                actionEpilog(runtime, "2.10.5.1", "Set .pyThresholdValue", sourcePage_9, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_40) {
                            runtimeTraceContext.setError(e_40);
                            throw e_40;
                        } finally {
                            actionEpilog(runtime, "2.10.5", "When .pyThresholdValue==", sourcePage_9, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.10.6", "When .pyEnableNotification==", sourcePage_9, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.10.6.1", "Set .pyEnableNotification", sourcePage_9, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "2.10.6.1", "Set .pyEnableNotification", sourcePage_9, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_41) {
                            runtimeTraceContext.setError(e_41);
                            throw e_41;
                        } finally {
                            actionEpilog(runtime, "2.10.6", "When .pyEnableNotification==", sourcePage_9, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.10.7", "When .pySendEmail==", sourcePage_9, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.10.7.1", "Set .pySendEmail", sourcePage_9, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "2.10.7.1", "Set .pySendEmail", sourcePage_9, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_42) {
                            runtimeTraceContext.setError(e_42);
                            throw e_42;
                        } finally {
                            actionEpilog(runtime, "2.10.7", "When .pySendEmail==", sourcePage_9, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.10.8", "When .pyImpactLevel==", sourcePage_9, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.10.8.1", "Set .pyImpactLevel", sourcePage_9, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Medium", "stN", false, true);
                                actionEpilog(runtime, "2.10.8.1", "Set .pyImpactLevel", sourcePage_9, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_43) {
                            runtimeTraceContext.setError(e_43);
                            throw e_43;
                        } finally {
                            actionEpilog(runtime, "2.10.8", "When .pyImpactLevel==", sourcePage_9, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_39) {
                    runtimeTraceContext.setError(e_39);
                    throw e_39;
                } finally {
                    actionEpilog(runtime, "2.10", "Update Page .pyAlertDetail(N13)", sourcePage_9, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_8);
                    myStepPage = tmp_9;
                }
                ClipboardPage sourcePage_10 = sourcePage_2;
                ClipboardPage tmp_10 = myStepPage;
                myStepPage = pageQuery_34.resolve(tools, myStepPage);
                PRStackFrame stackFrame_9 = null;
                try {
                    stackFrame_9 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.11", "Update Page .pyAlertDetail(N14)", sourcePage_10, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.11.1", "Set .pyDescription", sourcePage_10, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N14_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.11.1", "Set .pyDescription", sourcePage_10, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.11.2", "Set .pyDisplayText", sourcePage_10, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "2.11.2", "Set .pyDisplayText", sourcePage_10, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.11.3", "Set .pyIsPercentage", sourcePage_10, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.11.3", "Set .pyIsPercentage", sourcePage_10, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.11.4", "Set .pyHasThreshold", sourcePage_10, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.11.4", "Set .pyHasThreshold", sourcePage_10, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.11.5", "When .pyEnableNotification==", sourcePage_10, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.11.5.1", "Set .pyEnableNotification", sourcePage_10, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "2.11.5.1", "Set .pyEnableNotification", sourcePage_10, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_45) {
                            runtimeTraceContext.setError(e_45);
                            throw e_45;
                        } finally {
                            actionEpilog(runtime, "2.11.5", "When .pyEnableNotification==", sourcePage_10, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.11.6", "When .pySendEmail==", sourcePage_10, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.11.6.1", "Set .pySendEmail", sourcePage_10, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "2.11.6.1", "Set .pySendEmail", sourcePage_10, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_46) {
                            runtimeTraceContext.setError(e_46);
                            throw e_46;
                        } finally {
                            actionEpilog(runtime, "2.11.6", "When .pySendEmail==", sourcePage_10, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.11.7", "When .pyImpactLevel==", sourcePage_10, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.11.7.1", "Set .pyImpactLevel", sourcePage_10, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "High", "stN", false, true);
                                actionEpilog(runtime, "2.11.7.1", "Set .pyImpactLevel", sourcePage_10, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_47) {
                            runtimeTraceContext.setError(e_47);
                            throw e_47;
                        } finally {
                            actionEpilog(runtime, "2.11.7", "When .pyImpactLevel==", sourcePage_10, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_44) {
                    runtimeTraceContext.setError(e_44);
                    throw e_44;
                } finally {
                    actionEpilog(runtime, "2.11", "Update Page .pyAlertDetail(N14)", sourcePage_10, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_9);
                    myStepPage = tmp_10;
                }
                ClipboardPage sourcePage_11 = sourcePage_2;
                ClipboardPage tmp_11 = myStepPage;
                myStepPage = pageQuery_35.resolve(tools, myStepPage);
                PRStackFrame stackFrame_10 = null;
                try {
                    stackFrame_10 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.12", "Update Page .pyAlertDetail(N15)", sourcePage_11, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.12.1", "Set .pyDescription", sourcePage_11, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N15_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.12.1", "Set .pyDescription", sourcePage_11, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.12.2", "Set .pyDisplayText", sourcePage_11, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "2.12.2", "Set .pyDisplayText", sourcePage_11, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.12.3", "Set .pyIsPercentage", sourcePage_11, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.12.3", "Set .pyIsPercentage", sourcePage_11, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.12.4", "Set .pyHasThreshold", sourcePage_11, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.12.4", "Set .pyHasThreshold", sourcePage_11, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.12.5", "When .pyEnableNotification==", sourcePage_11, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.12.5.1", "Set .pyEnableNotification", sourcePage_11, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "2.12.5.1", "Set .pyEnableNotification", sourcePage_11, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_49) {
                            runtimeTraceContext.setError(e_49);
                            throw e_49;
                        } finally {
                            actionEpilog(runtime, "2.12.5", "When .pyEnableNotification==", sourcePage_11, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.12.6", "When .pySendEmail==", sourcePage_11, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.12.6.1", "Set .pySendEmail", sourcePage_11, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "2.12.6.1", "Set .pySendEmail", sourcePage_11, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_50) {
                            runtimeTraceContext.setError(e_50);
                            throw e_50;
                        } finally {
                            actionEpilog(runtime, "2.12.6", "When .pySendEmail==", sourcePage_11, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.12.7", "When .pyImpactLevel==", sourcePage_11, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.12.7.1", "Set .pyImpactLevel", sourcePage_11, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Medium", "stN", false, true);
                                actionEpilog(runtime, "2.12.7.1", "Set .pyImpactLevel", sourcePage_11, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_51) {
                            runtimeTraceContext.setError(e_51);
                            throw e_51;
                        } finally {
                            actionEpilog(runtime, "2.12.7", "When .pyImpactLevel==", sourcePage_11, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_48) {
                    runtimeTraceContext.setError(e_48);
                    throw e_48;
                } finally {
                    actionEpilog(runtime, "2.12", "Update Page .pyAlertDetail(N15)", sourcePage_11, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_10);
                    myStepPage = tmp_11;
                }
                ClipboardPage sourcePage_12 = sourcePage_2;
                ClipboardPage tmp_12 = myStepPage;
                myStepPage = pageQuery_36.resolve(tools, myStepPage);
                PRStackFrame stackFrame_11 = null;
                try {
                    stackFrame_11 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.13", "Update Page .pyAlertDetail(N16)", sourcePage_12, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.13.1", "Set .pyDescription", sourcePage_12, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N16_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.13.1", "Set .pyDescription", sourcePage_12, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.13.2", "Set .pyDisplayText", sourcePage_12, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "2.13.2", "Set .pyDisplayText", sourcePage_12, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.13.3", "Set .pyIsPercentage", sourcePage_12, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.13.3", "Set .pyIsPercentage", sourcePage_12, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.13.4", "Set .pyHasThreshold", sourcePage_12, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.13.4", "Set .pyHasThreshold", sourcePage_12, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.13.5", "When .pyEnableNotification==", sourcePage_12, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.13.5.1", "Set .pyEnableNotification", sourcePage_12, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "2.13.5.1", "Set .pyEnableNotification", sourcePage_12, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_53) {
                            runtimeTraceContext.setError(e_53);
                            throw e_53;
                        } finally {
                            actionEpilog(runtime, "2.13.5", "When .pyEnableNotification==", sourcePage_12, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.13.6", "When .pySendEmail==", sourcePage_12, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.13.6.1", "Set .pySendEmail", sourcePage_12, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "2.13.6.1", "Set .pySendEmail", sourcePage_12, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_54) {
                            runtimeTraceContext.setError(e_54);
                            throw e_54;
                        } finally {
                            actionEpilog(runtime, "2.13.6", "When .pySendEmail==", sourcePage_12, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.13.7", "When .pyImpactLevel==", sourcePage_12, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.13.7.1", "Set .pyImpactLevel", sourcePage_12, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Low", "stN", false, true);
                                actionEpilog(runtime, "2.13.7.1", "Set .pyImpactLevel", sourcePage_12, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_55) {
                            runtimeTraceContext.setError(e_55);
                            throw e_55;
                        } finally {
                            actionEpilog(runtime, "2.13.7", "When .pyImpactLevel==", sourcePage_12, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_52) {
                    runtimeTraceContext.setError(e_52);
                    throw e_52;
                } finally {
                    actionEpilog(runtime, "2.13", "Update Page .pyAlertDetail(N16)", sourcePage_12, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_11);
                    myStepPage = tmp_12;
                }
                ClipboardPage sourcePage_13 = sourcePage_2;
                ClipboardPage tmp_13 = myStepPage;
                myStepPage = pageQuery_37.resolve(tools, myStepPage);
                PRStackFrame stackFrame_12 = null;
                try {
                    stackFrame_12 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.14", "Update Page .pyAlertDetail(N17)", sourcePage_13, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.14.1", "Set .pyDescription", sourcePage_13, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N17_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.14.1", "Set .pyDescription", sourcePage_13, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.14.2", "Set .pyDisplayText", sourcePage_13, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "2.14.2", "Set .pyDisplayText", sourcePage_13, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.14.3", "Set .pyIsPercentage", sourcePage_13, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.14.3", "Set .pyIsPercentage", sourcePage_13, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.14.4", "Set .pyHasThreshold", sourcePage_13, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "2.14.4", "Set .pyHasThreshold", sourcePage_13, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.14.5", "When .pyEnableNotification==", sourcePage_13, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.14.5.1", "Set .pyEnableNotification", sourcePage_13, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, true, "sSN", false, true);
                                actionEpilog(runtime, "2.14.5.1", "Set .pyEnableNotification", sourcePage_13, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_57) {
                            runtimeTraceContext.setError(e_57);
                            throw e_57;
                        } finally {
                            actionEpilog(runtime, "2.14.5", "When .pyEnableNotification==", sourcePage_13, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.14.6", "When .pySendEmail==", sourcePage_13, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.14.6.1", "Set .pySendEmail", sourcePage_13, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "Yes", "stN", false, true);
                                actionEpilog(runtime, "2.14.6.1", "Set .pySendEmail", sourcePage_13, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_58) {
                            runtimeTraceContext.setError(e_58);
                            throw e_58;
                        } finally {
                            actionEpilog(runtime, "2.14.6", "When .pySendEmail==", sourcePage_13, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.14.7", "When .pyImpactLevel==", sourcePage_13, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.14.7.1", "Set .pyImpactLevel", sourcePage_13, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "High", "stN", false, true);
                                actionEpilog(runtime, "2.14.7.1", "Set .pyImpactLevel", sourcePage_13, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_59) {
                            runtimeTraceContext.setError(e_59);
                            throw e_59;
                        } finally {
                            actionEpilog(runtime, "2.14.7", "When .pyImpactLevel==", sourcePage_13, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_56) {
                    runtimeTraceContext.setError(e_56);
                    throw e_56;
                } finally {
                    actionEpilog(runtime, "2.14", "Update Page .pyAlertDetail(N17)", sourcePage_13, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_12);
                    myStepPage = tmp_13;
                }
                ClipboardPage sourcePage_14 = sourcePage_2;
                ClipboardPage tmp_14 = myStepPage;
                myStepPage = pageQuery_38.resolve(tools, myStepPage);
                PRStackFrame stackFrame_13 = null;
                try {
                    stackFrame_13 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "2.15", "Update Page .pyAlertDetail(N18)", sourcePage_14, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.15.1", "Set .pyDescription", sourcePage_14, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N18_Description", "sTN", false, true);
                    actionEpilog(runtime, "2.15.1", "Set .pyDescription", sourcePage_14, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.15.2", "Set .pyDisplayText", sourcePage_14, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "N18_AlertChangeMessage", "sTN64", false, true);
                    actionEpilog(runtime, "2.15.2", "Set .pyDisplayText", sourcePage_14, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.15.3", "Set .pyIsPercentage", sourcePage_14, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "2.15.3", "Set .pyIsPercentage", sourcePage_14, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "2.15.4", "Set .pyHasThreshold", sourcePage_14, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "2.15.4", "Set .pyHasThreshold", sourcePage_14, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER).equals(""));
                        }
                    }, ".pyThresholdValue==")) {
                        try {
                            actionProlog(runtime, "2.15.5", "When .pyThresholdValue==", sourcePage_14, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.15.5.1", "Set .pyThresholdValue", sourcePage_14, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyThresholdValue", pRef_28, myStepPage, 10, "sNN", false, true);
                                actionEpilog(runtime, "2.15.5.1", "Set .pyThresholdValue", sourcePage_14, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_61) {
                            runtimeTraceContext.setError(e_61);
                            throw e_61;
                        } finally {
                            actionEpilog(runtime, "2.15.5", "When .pyThresholdValue==", sourcePage_14, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "2.15.6", "When .pyEnableNotification==", sourcePage_14, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.15.6.1", "Set .pyEnableNotification", sourcePage_14, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, true, "sSN", false, true);
                                actionEpilog(runtime, "2.15.6.1", "Set .pyEnableNotification", sourcePage_14, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_62) {
                            runtimeTraceContext.setError(e_62);
                            throw e_62;
                        } finally {
                            actionEpilog(runtime, "2.15.6", "When .pyEnableNotification==", sourcePage_14, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "2.15.7", "When .pySendEmail==", sourcePage_14, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.15.7.1", "Set .pySendEmail", sourcePage_14, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "Yes", "stN", false, true);
                                actionEpilog(runtime, "2.15.7.1", "Set .pySendEmail", sourcePage_14, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_63) {
                            runtimeTraceContext.setError(e_63);
                            throw e_63;
                        } finally {
                            actionEpilog(runtime, "2.15.7", "When .pySendEmail==", sourcePage_14, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "2.15.8", "When .pyImpactLevel==", sourcePage_14, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "2.15.8.1", "Set .pyImpactLevel", sourcePage_14, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "High", "stN", false, true);
                                actionEpilog(runtime, "2.15.8.1", "Set .pyImpactLevel", sourcePage_14, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_64) {
                            runtimeTraceContext.setError(e_64);
                            throw e_64;
                        } finally {
                            actionEpilog(runtime, "2.15.8", "When .pyImpactLevel==", sourcePage_14, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_60) {
                    runtimeTraceContext.setError(e_60);
                    throw e_60;
                } finally {
                    actionEpilog(runtime, "2.15", "Update Page .pyAlertDetail(N18)", sourcePage_14, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_13);
                    myStepPage = tmp_14;
                }
            } catch (Exception e_12) {
                runtimeTraceContext.setError(e_12);
                throw e_12;
            } finally {
                actionEpilog(runtime, "2", "Update Page .pyAlertThresholds(Performance)", sourcePage_2, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_14);
                myStepPage = tmp_2;
            }
            ClipboardPage sourcePage_15 = myStepPage;
            ClipboardPage tmp_15 = myStepPage;
            myStepPage = pageQuery_39.resolve(tools, myStepPage);
            PRStackFrame stackFrame_19 = null;
            try {
                stackFrame_19 = pega.pushStackFrame("Embed-NameValuePair", null, myStepPage, false, false);
                actionProlog(runtime, "3", "Update Page .pyAlertThresholds(Response)", sourcePage_15, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "3.1", "Set .pyLabel", sourcePage_15, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, "ResponseLabel", "sTN64", false, true);
                actionEpilog(runtime, "3.1", "Set .pyLabel", sourcePage_15, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "3.2", "Set .pyDescription", sourcePage_15, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "ResponseAlertIntro", "sTN", false, true);
                actionEpilog(runtime, "3.2", "Set .pyDescription", sourcePage_15, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "3.3", "Set .pyRank", sourcePage_15, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyRank", pRef_15, myStepPage, 2, "sNN", false, true);
                actionEpilog(runtime, "3.3", "Set .pyRank", sourcePage_15, myStepPage, runtimeTraceContext);
                ClipboardPage sourcePage_16 = sourcePage_15;
                ClipboardPage tmp_16 = myStepPage;
                myStepPage = pageQuery_40.resolve(tools, myStepPage);
                PRStackFrame stackFrame_15 = null;
                try {
                    stackFrame_15 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "3.4", "Update Page .pyAlertDetail(N2)", sourcePage_16, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.4.1", "Set .pyDescription", sourcePage_16, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N2_Description", "sTN", false, true);
                    actionEpilog(runtime, "3.4.1", "Set .pyDescription", sourcePage_16, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.4.2", "Set .pyDisplayText", sourcePage_16, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "3.4.2", "Set .pyDisplayText", sourcePage_16, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.4.3", "Set .pyIsPercentage", sourcePage_16, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "3.4.3", "Set .pyIsPercentage", sourcePage_16, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.4.4", "Set .pyHasThreshold", sourcePage_16, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "3.4.4", "Set .pyHasThreshold", sourcePage_16, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "3.4.5", "When .pyEnableNotification==", sourcePage_16, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.4.5.1", "Set .pyEnableNotification", sourcePage_16, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, true, "sSN", false, true);
                                actionEpilog(runtime, "3.4.5.1", "Set .pyEnableNotification", sourcePage_16, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_67) {
                            runtimeTraceContext.setError(e_67);
                            throw e_67;
                        } finally {
                            actionEpilog(runtime, "3.4.5", "When .pyEnableNotification==", sourcePage_16, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "3.4.6", "When .pySendEmail==", sourcePage_16, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.4.6.1", "Set .pySendEmail", sourcePage_16, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "Yes", "stN", false, true);
                                actionEpilog(runtime, "3.4.6.1", "Set .pySendEmail", sourcePage_16, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_68) {
                            runtimeTraceContext.setError(e_68);
                            throw e_68;
                        } finally {
                            actionEpilog(runtime, "3.4.6", "When .pySendEmail==", sourcePage_16, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "3.4.7", "When .pyImpactLevel==", sourcePage_16, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.4.7.1", "Set .pyImpactLevel", sourcePage_16, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "High", "stN", false, true);
                                actionEpilog(runtime, "3.4.7.1", "Set .pyImpactLevel", sourcePage_16, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_69) {
                            runtimeTraceContext.setError(e_69);
                            throw e_69;
                        } finally {
                            actionEpilog(runtime, "3.4.7", "When .pyImpactLevel==", sourcePage_16, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_66) {
                    runtimeTraceContext.setError(e_66);
                    throw e_66;
                } finally {
                    actionEpilog(runtime, "3.4", "Update Page .pyAlertDetail(N2)", sourcePage_16, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_15);
                    myStepPage = tmp_16;
                }
                ClipboardPage sourcePage_17 = sourcePage_15;
                ClipboardPage tmp_17 = myStepPage;
                myStepPage = pageQuery_41.resolve(tools, myStepPage);
                PRStackFrame stackFrame_16 = null;
                try {
                    stackFrame_16 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "3.5", "Update Page .pyAlertDetail(N4)", sourcePage_17, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.5.1", "Set .pyDescription", sourcePage_17, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N4_Description", "sTN", false, true);
                    actionEpilog(runtime, "3.5.1", "Set .pyDescription", sourcePage_17, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.5.2", "Set .pyDisplayText", sourcePage_17, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "3.5.2", "Set .pyDisplayText", sourcePage_17, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.5.3", "Set .pyIsPercentage", sourcePage_17, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "3.5.3", "Set .pyIsPercentage", sourcePage_17, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.5.4", "Set .pyHasThreshold", sourcePage_17, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "3.5.4", "Set .pyHasThreshold", sourcePage_17, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "3.5.5", "When .pyEnableNotification==", sourcePage_17, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.5.5.1", "Set .pyEnableNotification", sourcePage_17, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "3.5.5.1", "Set .pyEnableNotification", sourcePage_17, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_71) {
                            runtimeTraceContext.setError(e_71);
                            throw e_71;
                        } finally {
                            actionEpilog(runtime, "3.5.5", "When .pyEnableNotification==", sourcePage_17, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "3.5.6", "When .pySendEmail==", sourcePage_17, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.5.6.1", "Set .pySendEmail", sourcePage_17, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "3.5.6.1", "Set .pySendEmail", sourcePage_17, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_72) {
                            runtimeTraceContext.setError(e_72);
                            throw e_72;
                        } finally {
                            actionEpilog(runtime, "3.5.6", "When .pySendEmail==", sourcePage_17, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "3.5.7", "When .pyImpactLevel==", sourcePage_17, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.5.7.1", "Set .pyImpactLevel", sourcePage_17, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "High", "stN", false, true);
                                actionEpilog(runtime, "3.5.7.1", "Set .pyImpactLevel", sourcePage_17, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_73) {
                            runtimeTraceContext.setError(e_73);
                            throw e_73;
                        } finally {
                            actionEpilog(runtime, "3.5.7", "When .pyImpactLevel==", sourcePage_17, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_70) {
                    runtimeTraceContext.setError(e_70);
                    throw e_70;
                } finally {
                    actionEpilog(runtime, "3.5", "Update Page .pyAlertDetail(N4)", sourcePage_17, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_16);
                    myStepPage = tmp_17;
                }
                ClipboardPage sourcePage_18 = sourcePage_15;
                ClipboardPage tmp_18 = myStepPage;
                myStepPage = pageQuery_42.resolve(tools, myStepPage);
                PRStackFrame stackFrame_17 = null;
                try {
                    stackFrame_17 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "3.6", "Update Page .pyAlertDetail(N6)", sourcePage_18, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.6.1", "Set .pyDescription", sourcePage_18, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N6_Description", "sTN", false, true);
                    actionEpilog(runtime, "3.6.1", "Set .pyDescription", sourcePage_18, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.6.2", "Set .pyDisplayText", sourcePage_18, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "N6_AlertChangeMessage", "sTN64", false, true);
                    actionEpilog(runtime, "3.6.2", "Set .pyDisplayText", sourcePage_18, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.6.3", "Set .pyIsPercentage", sourcePage_18, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "3.6.3", "Set .pyIsPercentage", sourcePage_18, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.6.4", "Set .pyHasThreshold", sourcePage_18, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "3.6.4", "Set .pyHasThreshold", sourcePage_18, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER).equals(""));
                        }
                    }, ".pyThresholdValue==")) {
                        try {
                            actionProlog(runtime, "3.6.5", "When .pyThresholdValue==", sourcePage_18, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.6.5.1", "Set .pyThresholdValue", sourcePage_18, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyThresholdValue", pRef_28, myStepPage, 20, "sNN", false, true);
                                actionEpilog(runtime, "3.6.5.1", "Set .pyThresholdValue", sourcePage_18, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_75) {
                            runtimeTraceContext.setError(e_75);
                            throw e_75;
                        } finally {
                            actionEpilog(runtime, "3.6.5", "When .pyThresholdValue==", sourcePage_18, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "3.6.6", "When .pyEnableNotification==", sourcePage_18, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.6.6.1", "Set .pyEnableNotification", sourcePage_18, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "3.6.6.1", "Set .pyEnableNotification", sourcePage_18, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_76) {
                            runtimeTraceContext.setError(e_76);
                            throw e_76;
                        } finally {
                            actionEpilog(runtime, "3.6.6", "When .pyEnableNotification==", sourcePage_18, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "3.6.7", "When .pySendEmail==", sourcePage_18, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.6.7.1", "Set .pySendEmail", sourcePage_18, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "3.6.7.1", "Set .pySendEmail", sourcePage_18, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_77) {
                            runtimeTraceContext.setError(e_77);
                            throw e_77;
                        } finally {
                            actionEpilog(runtime, "3.6.7", "When .pySendEmail==", sourcePage_18, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "3.6.8", "When .pyImpactLevel==", sourcePage_18, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.6.8.1", "Set .pyImpactLevel", sourcePage_18, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Low", "stN", false, true);
                                actionEpilog(runtime, "3.6.8.1", "Set .pyImpactLevel", sourcePage_18, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_78) {
                            runtimeTraceContext.setError(e_78);
                            throw e_78;
                        } finally {
                            actionEpilog(runtime, "3.6.8", "When .pyImpactLevel==", sourcePage_18, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_74) {
                    runtimeTraceContext.setError(e_74);
                    throw e_74;
                } finally {
                    actionEpilog(runtime, "3.6", "Update Page .pyAlertDetail(N6)", sourcePage_18, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_17);
                    myStepPage = tmp_18;
                }
                ClipboardPage sourcePage_19 = sourcePage_15;
                ClipboardPage tmp_19 = myStepPage;
                myStepPage = pageQuery_43.resolve(tools, myStepPage);
                PRStackFrame stackFrame_18 = null;
                try {
                    stackFrame_18 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "3.7", "Update Page .pyAlertDetail(N7)", sourcePage_19, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.7.1", "Set .pyDescription", sourcePage_19, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N7_Description", "sTN", false, true);
                    actionEpilog(runtime, "3.7.1", "Set .pyDescription", sourcePage_19, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.7.2", "Set .pyDisplayText", sourcePage_19, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "3.7.2", "Set .pyDisplayText", sourcePage_19, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.7.3", "Set .pyIsPercentage", sourcePage_19, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "3.7.3", "Set .pyIsPercentage", sourcePage_19, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "3.7.4", "Set .pyHasThreshold", sourcePage_19, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "3.7.4", "Set .pyHasThreshold", sourcePage_19, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "3.7.5", "When .pyEnableNotification==", sourcePage_19, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.7.5.1", "Set .pyEnableNotification", sourcePage_19, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, true, "sSN", false, true);
                                actionEpilog(runtime, "3.7.5.1", "Set .pyEnableNotification", sourcePage_19, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_80) {
                            runtimeTraceContext.setError(e_80);
                            throw e_80;
                        } finally {
                            actionEpilog(runtime, "3.7.5", "When .pyEnableNotification==", sourcePage_19, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "3.7.6", "When .pySendEmail==", sourcePage_19, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.7.6.1", "Set .pySendEmail", sourcePage_19, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "Yes", "stN", false, true);
                                actionEpilog(runtime, "3.7.6.1", "Set .pySendEmail", sourcePage_19, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_81) {
                            runtimeTraceContext.setError(e_81);
                            throw e_81;
                        } finally {
                            actionEpilog(runtime, "3.7.6", "When .pySendEmail==", sourcePage_19, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "3.7.7", "When .pyImpactLevel==", sourcePage_19, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "3.7.7.1", "Set .pyImpactLevel", sourcePage_19, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "High", "stN", false, true);
                                actionEpilog(runtime, "3.7.7.1", "Set .pyImpactLevel", sourcePage_19, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_82) {
                            runtimeTraceContext.setError(e_82);
                            throw e_82;
                        } finally {
                            actionEpilog(runtime, "3.7.7", "When .pyImpactLevel==", sourcePage_19, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_79) {
                    runtimeTraceContext.setError(e_79);
                    throw e_79;
                } finally {
                    actionEpilog(runtime, "3.7", "Update Page .pyAlertDetail(N7)", sourcePage_19, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_18);
                    myStepPage = tmp_19;
                }
            } catch (Exception e_65) {
                runtimeTraceContext.setError(e_65);
                throw e_65;
            } finally {
                actionEpilog(runtime, "3", "Update Page .pyAlertThresholds(Response)", sourcePage_15, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_19);
                myStepPage = tmp_15;
            }
            ClipboardPage sourcePage_20 = myStepPage;
            ClipboardPage tmp_20 = myStepPage;
            myStepPage = pageQuery_44.resolve(tools, myStepPage);
            PRStackFrame stackFrame_22 = null;
            try {
                stackFrame_22 = pega.pushStackFrame("Embed-NameValuePair", null, myStepPage, false, false);
                actionProlog(runtime, "4", "Update Page .pyAlertThresholds(Output)", sourcePage_20, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "4.1", "Set .pyLabel", sourcePage_20, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, "OutputLabel", "sTN64", false, true);
                actionEpilog(runtime, "4.1", "Set .pyLabel", sourcePage_20, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "4.2", "Set .pyDescription", sourcePage_20, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "OutputAlertIntro", "sTN", false, true);
                actionEpilog(runtime, "4.2", "Set .pyDescription", sourcePage_20, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "4.3", "Set .pyRank", sourcePage_20, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyRank", pRef_15, myStepPage, 3, "sNN", false, true);
                actionEpilog(runtime, "4.3", "Set .pyRank", sourcePage_20, myStepPage, runtimeTraceContext);
                ClipboardPage sourcePage_21 = sourcePage_20;
                ClipboardPage tmp_21 = myStepPage;
                myStepPage = pageQuery_45.resolve(tools, myStepPage);
                PRStackFrame stackFrame_20 = null;
                try {
                    stackFrame_20 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "4.4", "Update Page .pyAlertDetail(N30)", sourcePage_21, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.4.1", "Set .pyDescription", sourcePage_21, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N30_Description", "sTN", false, true);
                    actionEpilog(runtime, "4.4.1", "Set .pyDescription", sourcePage_21, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.4.2", "Set .pyDisplayText", sourcePage_21, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "N30_AlertChangeMessage", "sTN64", false, true);
                    actionEpilog(runtime, "4.4.2", "Set .pyDisplayText", sourcePage_21, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.4.3", "Set .pyIsPercentage", sourcePage_21, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "4.4.3", "Set .pyIsPercentage", sourcePage_21, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.4.4", "Set .pyHasThreshold", sourcePage_21, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "4.4.4", "Set .pyHasThreshold", sourcePage_21, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER).equals(""));
                        }
                    }, ".pyThresholdValue==")) {
                        try {
                            actionProlog(runtime, "4.4.5", "When .pyThresholdValue==", sourcePage_21, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "4.4.5.1", "Set .pyThresholdValue", sourcePage_21, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyThresholdValue", pRef_28, myStepPage, 50, "sNN", false, true);
                                actionEpilog(runtime, "4.4.5.1", "Set .pyThresholdValue", sourcePage_21, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_85) {
                            runtimeTraceContext.setError(e_85);
                            throw e_85;
                        } finally {
                            actionEpilog(runtime, "4.4.5", "When .pyThresholdValue==", sourcePage_21, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "4.4.6", "When .pyEnableNotification==", sourcePage_21, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "4.4.6.1", "Set .pyEnableNotification", sourcePage_21, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "4.4.6.1", "Set .pyEnableNotification", sourcePage_21, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_86) {
                            runtimeTraceContext.setError(e_86);
                            throw e_86;
                        } finally {
                            actionEpilog(runtime, "4.4.6", "When .pyEnableNotification==", sourcePage_21, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "4.4.7", "When .pySendEmail==", sourcePage_21, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "4.4.7.1", "Set .pySendEmail", sourcePage_21, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "4.4.7.1", "Set .pySendEmail", sourcePage_21, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_87) {
                            runtimeTraceContext.setError(e_87);
                            throw e_87;
                        } finally {
                            actionEpilog(runtime, "4.4.7", "When .pySendEmail==", sourcePage_21, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "4.4.8", "When .pyImpactLevel==", sourcePage_21, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "4.4.8.1", "Set .pyImpactLevel", sourcePage_21, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Low", "stN", false, true);
                                actionEpilog(runtime, "4.4.8.1", "Set .pyImpactLevel", sourcePage_21, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_88) {
                            runtimeTraceContext.setError(e_88);
                            throw e_88;
                        } finally {
                            actionEpilog(runtime, "4.4.8", "When .pyImpactLevel==", sourcePage_21, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_84) {
                    runtimeTraceContext.setError(e_84);
                    throw e_84;
                } finally {
                    actionEpilog(runtime, "4.4", "Update Page .pyAlertDetail(N30)", sourcePage_21, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_20);
                    myStepPage = tmp_21;
                }
                ClipboardPage sourcePage_22 = sourcePage_20;
                ClipboardPage tmp_22 = myStepPage;
                myStepPage = pageQuery_46.resolve(tools, myStepPage);
                PRStackFrame stackFrame_21 = null;
                try {
                    stackFrame_21 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "4.5", "Update Page .pyAlertDetail(N31)", sourcePage_22, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.5.1", "Set .pyDescription", sourcePage_22, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N31_Description", "sTN", false, true);
                    actionEpilog(runtime, "4.5.1", "Set .pyDescription", sourcePage_22, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.5.2", "Set .pyDisplayText", sourcePage_22, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "4.5.2", "Set .pyDisplayText", sourcePage_22, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.5.3", "Set .pyIsPercentage", sourcePage_22, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "4.5.3", "Set .pyIsPercentage", sourcePage_22, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "4.5.4", "Set .pyHasThreshold", sourcePage_22, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "4.5.4", "Set .pyHasThreshold", sourcePage_22, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "4.5.5", "When .pyEnableNotification==", sourcePage_22, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "4.5.5.1", "Set .pyEnableNotification", sourcePage_22, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "4.5.5.1", "Set .pyEnableNotification", sourcePage_22, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_90) {
                            runtimeTraceContext.setError(e_90);
                            throw e_90;
                        } finally {
                            actionEpilog(runtime, "4.5.5", "When .pyEnableNotification==", sourcePage_22, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "4.5.6", "When .pySendEmail==", sourcePage_22, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "4.5.6.1", "Set .pySendEmail", sourcePage_22, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "4.5.6.1", "Set .pySendEmail", sourcePage_22, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_91) {
                            runtimeTraceContext.setError(e_91);
                            throw e_91;
                        } finally {
                            actionEpilog(runtime, "4.5.6", "When .pySendEmail==", sourcePage_22, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "4.5.7", "When .pyImpactLevel==", sourcePage_22, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "4.5.7.1", "Set .pyImpactLevel", sourcePage_22, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Low", "stN", false, true);
                                actionEpilog(runtime, "4.5.7.1", "Set .pyImpactLevel", sourcePage_22, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_92) {
                            runtimeTraceContext.setError(e_92);
                            throw e_92;
                        } finally {
                            actionEpilog(runtime, "4.5.7", "When .pyImpactLevel==", sourcePage_22, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_89) {
                    runtimeTraceContext.setError(e_89);
                    throw e_89;
                } finally {
                    actionEpilog(runtime, "4.5", "Update Page .pyAlertDetail(N31)", sourcePage_22, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_21);
                    myStepPage = tmp_22;
                }
            } catch (Exception e_83) {
                runtimeTraceContext.setError(e_83);
                throw e_83;
            } finally {
                actionEpilog(runtime, "4", "Update Page .pyAlertThresholds(Output)", sourcePage_20, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_22);
                myStepPage = tmp_20;
            }
            ClipboardPage sourcePage_23 = myStepPage;
            ClipboardPage tmp_23 = myStepPage;
            myStepPage = pageQuery_47.resolve(tools, myStepPage);
            PRStackFrame stackFrame_26 = null;
            try {
                stackFrame_26 = pega.pushStackFrame("Embed-NameValuePair", null, myStepPage, false, false);
                actionProlog(runtime, "5", "Update Page .pyAlertThresholds(Predictors)", sourcePage_23, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "5.1", "Set .pyLabel", sourcePage_23, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyLabel", pRef_13, myStepPage, "PredictorsLabel", "sTN64", false, true);
                actionEpilog(runtime, "5.1", "Set .pyLabel", sourcePage_23, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "5.2", "Set .pyDescription", sourcePage_23, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "PredictorAlertIntro", "sTN", false, true);
                actionEpilog(runtime, "5.2", "Set .pyDescription", sourcePage_23, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "5.3", "Set .pyRank", sourcePage_23, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyRank", pRef_15, myStepPage, 4, "sNN", false, true);
                actionEpilog(runtime, "5.3", "Set .pyRank", sourcePage_23, myStepPage, runtimeTraceContext);
                ClipboardPage sourcePage_24 = sourcePage_23;
                ClipboardPage tmp_24 = myStepPage;
                myStepPage = pageQuery_48.resolve(tools, myStepPage);
                PRStackFrame stackFrame_23 = null;
                try {
                    stackFrame_23 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "5.4", "Update Page .pyAlertDetail(N35)", sourcePage_24, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.4.1", "Set .pyDescription", sourcePage_24, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N35_Description", "sTN", false, true);
                    actionEpilog(runtime, "5.4.1", "Set .pyDescription", sourcePage_24, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.4.2", "Set .pyDisplayText", sourcePage_24, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "N35_AlertChangeMessage", "sTN64", false, true);
                    actionEpilog(runtime, "5.4.2", "Set .pyDisplayText", sourcePage_24, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.4.3", "Set .pyIsPercentage", sourcePage_24, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "5.4.3", "Set .pyIsPercentage", sourcePage_24, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.4.4", "Set .pyHasThreshold", sourcePage_24, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "5.4.4", "Set .pyHasThreshold", sourcePage_24, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER).equals(""));
                        }
                    }, ".pyThresholdValue==")) {
                        try {
                            actionProlog(runtime, "5.4.5", "When .pyThresholdValue==", sourcePage_24, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.4.5.1", "Set .pyThresholdValue", sourcePage_24, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyThresholdValue", pRef_28, myStepPage, (int) pega.evaluateWithPage(sourcePage_24, new EvaluateFunction<Integer>() {

                                    public Integer apply(ClipboardPage myStepPage) {
                                        return com.pega.pegarules.priv.FUAUtil.parseInt("100");
                                    }
                                }), "sNN", false, true);
                                actionEpilog(runtime, "5.4.5.1", "Set .pyThresholdValue", sourcePage_24, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_95) {
                            runtimeTraceContext.setError(e_95);
                            throw e_95;
                        } finally {
                            actionEpilog(runtime, "5.4.5", "When .pyThresholdValue==", sourcePage_24, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "5.4.6", "When .pyEnableNotification==", sourcePage_24, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.4.6.1", "Set .pyEnableNotification", sourcePage_24, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, true, "sSN", false, true);
                                actionEpilog(runtime, "5.4.6.1", "Set .pyEnableNotification", sourcePage_24, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_96) {
                            runtimeTraceContext.setError(e_96);
                            throw e_96;
                        } finally {
                            actionEpilog(runtime, "5.4.6", "When .pyEnableNotification==", sourcePage_24, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "5.4.7", "When .pySendEmail==", sourcePage_24, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.4.7.1", "Set .pySendEmail", sourcePage_24, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "5.4.7.1", "Set .pySendEmail", sourcePage_24, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_97) {
                            runtimeTraceContext.setError(e_97);
                            throw e_97;
                        } finally {
                            actionEpilog(runtime, "5.4.7", "When .pySendEmail==", sourcePage_24, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "5.4.8", "When .pyImpactLevel==", sourcePage_24, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.4.8.1", "Set .pyImpactLevel", sourcePage_24, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Medium", "stN", false, true);
                                actionEpilog(runtime, "5.4.8.1", "Set .pyImpactLevel", sourcePage_24, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_98) {
                            runtimeTraceContext.setError(e_98);
                            throw e_98;
                        } finally {
                            actionEpilog(runtime, "5.4.8", "When .pyImpactLevel==", sourcePage_24, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_94) {
                    runtimeTraceContext.setError(e_94);
                    throw e_94;
                } finally {
                    actionEpilog(runtime, "5.4", "Update Page .pyAlertDetail(N35)", sourcePage_24, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_23);
                    myStepPage = tmp_24;
                }
                ClipboardPage sourcePage_25 = sourcePage_23;
                ClipboardPage tmp_25 = myStepPage;
                myStepPage = pageQuery_49.resolve(tools, myStepPage);
                PRStackFrame stackFrame_24 = null;
                try {
                    stackFrame_24 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "5.5", "Update Page .pyAlertDetail(N37)", sourcePage_25, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.5.1", "Set .pyDescription", sourcePage_25, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N37_Description", "sTN", false, true);
                    actionEpilog(runtime, "5.5.1", "Set .pyDescription", sourcePage_25, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.5.2", "Set .pyDisplayText", sourcePage_25, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "", "sTN64", false, true);
                    actionEpilog(runtime, "5.5.2", "Set .pyDisplayText", sourcePage_25, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.5.3", "Set .pyIsPercentage", sourcePage_25, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "5.5.3", "Set .pyIsPercentage", sourcePage_25, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.5.4", "Set .pyHasThreshold", sourcePage_25, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, false, "sSN", false, true);
                    actionEpilog(runtime, "5.5.4", "Set .pyHasThreshold", sourcePage_25, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "5.5.5", "When .pyEnableNotification==", sourcePage_25, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.5.5.1", "Set .pyEnableNotification", sourcePage_25, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "5.5.5.1", "Set .pyEnableNotification", sourcePage_25, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_100) {
                            runtimeTraceContext.setError(e_100);
                            throw e_100;
                        } finally {
                            actionEpilog(runtime, "5.5.5", "When .pyEnableNotification==", sourcePage_25, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "5.5.6", "When .pySendEmail==", sourcePage_25, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.5.6.1", "Set .pySendEmail", sourcePage_25, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "5.5.6.1", "Set .pySendEmail", sourcePage_25, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_101) {
                            runtimeTraceContext.setError(e_101);
                            throw e_101;
                        } finally {
                            actionEpilog(runtime, "5.5.6", "When .pySendEmail==", sourcePage_25, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "5.5.7", "When .pyImpactLevel==", sourcePage_25, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.5.7.1", "Set .pyImpactLevel", sourcePage_25, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Low", "stN", false, true);
                                actionEpilog(runtime, "5.5.7.1", "Set .pyImpactLevel", sourcePage_25, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_102) {
                            runtimeTraceContext.setError(e_102);
                            throw e_102;
                        } finally {
                            actionEpilog(runtime, "5.5.7", "When .pyImpactLevel==", sourcePage_25, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_99) {
                    runtimeTraceContext.setError(e_99);
                    throw e_99;
                } finally {
                    actionEpilog(runtime, "5.5", "Update Page .pyAlertDetail(N37)", sourcePage_25, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_24);
                    myStepPage = tmp_25;
                }
                ClipboardPage sourcePage_26 = sourcePage_23;
                ClipboardPage tmp_26 = myStepPage;
                myStepPage = pageQuery_50.resolve(tools, myStepPage);
                PRStackFrame stackFrame_25 = null;
                try {
                    stackFrame_25 = pega.pushStackFrame("Embed-Message-Summary", null, myStepPage, false, false);
                    actionProlog(runtime, "5.6", "Update Page .pyAlertDetail(N38)", sourcePage_26, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.6.1", "Set .pyDescription", sourcePage_26, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDescription", pRef_14, myStepPage, "N38_Description", "sTN", false, true);
                    actionEpilog(runtime, "5.6.1", "Set .pyDescription", sourcePage_26, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.6.2", "Set .pyDisplayText", sourcePage_26, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyDisplayText", pRef_17, myStepPage, "N38_AlertChangeMessage", "sTN64", false, true);
                    actionEpilog(runtime, "5.6.2", "Set .pyDisplayText", sourcePage_26, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.6.3", "Set .pyIsPercentage", sourcePage_26, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyIsPercentage", pRef_18, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "5.6.3", "Set .pyIsPercentage", sourcePage_26, myStepPage, runtimeTraceContext);
                    actionProlog(runtime, "5.6.4", "Set .pyHasThreshold", sourcePage_26, myStepPage, runtimeTraceContext);
                    pega.setViaPropRef(".pyHasThreshold", pRef_19, myStepPage, true, "sSN", false, true);
                    actionEpilog(runtime, "5.6.4", "Set .pyHasThreshold", sourcePage_26, myStepPage, runtimeTraceContext);
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_INTEGER).equals(""));
                        }
                    }, ".pyThresholdValue==")) {
                        try {
                            actionProlog(runtime, "5.6.5", "When .pyThresholdValue==", sourcePage_26, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.6.5.1", "Set .pyThresholdValue", sourcePage_26, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyThresholdValue", pRef_28, myStepPage, 75, "sNN", false, true);
                                actionEpilog(runtime, "5.6.5.1", "Set .pyThresholdValue", sourcePage_26, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_104) {
                            runtimeTraceContext.setError(e_104);
                            throw e_104;
                        } finally {
                            actionEpilog(runtime, "5.6.5", "When .pyThresholdValue==", sourcePage_26, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_20.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE).equals(""));
                        }
                    }, ".pyEnableNotification==")) {
                        try {
                            actionProlog(runtime, "5.6.6", "When .pyEnableNotification==", sourcePage_26, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.6.6.1", "Set .pyEnableNotification", sourcePage_26, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyEnableNotification", pRef_21, myStepPage, false, "sSN", false, true);
                                actionEpilog(runtime, "5.6.6.1", "Set .pyEnableNotification", sourcePage_26, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_105) {
                            runtimeTraceContext.setError(e_105);
                            throw e_105;
                        } finally {
                            actionEpilog(runtime, "5.6.6", "When .pyEnableNotification==", sourcePage_26, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pySendEmail==")) {
                        try {
                            actionProlog(runtime, "5.6.7", "When .pySendEmail==", sourcePage_26, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.6.7.1", "Set .pySendEmail", sourcePage_26, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pySendEmail", pRef_23, myStepPage, "No", "stN", false, true);
                                actionEpilog(runtime, "5.6.7.1", "Set .pySendEmail", sourcePage_26, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_106) {
                            runtimeTraceContext.setError(e_106);
                            throw e_106;
                        } finally {
                            actionEpilog(runtime, "5.6.7", "When .pySendEmail==", sourcePage_26, myStepPage, runtimeTraceContext);
                        }
                    }
                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                        public Boolean apply(ClipboardPage myStepPage) {
                            return (scalarValueQuery_24.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                        }
                    }, ".pyImpactLevel==")) {
                        try {
                            actionProlog(runtime, "5.6.8", "When .pyImpactLevel==", sourcePage_26, myStepPage, runtimeTraceContext);
                            {
                                actionProlog(runtime, "5.6.8.1", "Set .pyImpactLevel", sourcePage_26, myStepPage, runtimeTraceContext);
                                pega.setViaPropRef(".pyImpactLevel", pRef_25, myStepPage, "Medium", "stN", false, true);
                                actionEpilog(runtime, "5.6.8.1", "Set .pyImpactLevel", sourcePage_26, myStepPage, runtimeTraceContext);
                            }
                        } catch (Exception e_107) {
                            runtimeTraceContext.setError(e_107);
                            throw e_107;
                        } finally {
                            actionEpilog(runtime, "5.6.8", "When .pyImpactLevel==", sourcePage_26, myStepPage, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_103) {
                    runtimeTraceContext.setError(e_103);
                    throw e_103;
                } finally {
                    actionEpilog(runtime, "5.6", "Update Page .pyAlertDetail(N38)", sourcePage_26, myStepPage, runtimeTraceContext);
                    pega.popStackFrameAndReturnStepPage(stackFrame_25);
                    myStepPage = tmp_26;
                }
            } catch (Exception e_93) {
                runtimeTraceContext.setError(e_93);
                throw e_93;
            } finally {
                actionEpilog(runtime, "5", "Update Page .pyAlertThresholds(Predictors)", sourcePage_23, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_26);
                myStepPage = tmp_23;
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
