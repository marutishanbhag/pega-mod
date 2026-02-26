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

public class ra_model_pegaaccel_task_buildapplication_pzapplyadvancedsettings_1587587435 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_32;

    private final ScalarValueQuery scalarValueQuery_30;

    private final ScalarValueQuery scalarValueQuery_28;

    private final ScalarValueQuery scalarValueQuery_26;

    private final ScalarValueQuery scalarValueQuery_24;

    private final ScalarValueQuery scalarValueQuery_22;

    private final ScalarValueQuery scalarValueQuery_20;

    private final ScalarValueQuery scalarValueQuery_18;

    private final ScalarValueQuery scalarValueQuery_16;

    private final ScalarValueQuery scalarValueQuery_14;

    private final ScalarValueQuery scalarValueQuery_12;

    private final ScalarValueQuery scalarValueQuery_9;

    private final ScalarValueQuery scalarValueQuery_8;

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_21 = new String[] { "", "", "pyOrganizationExists", "" };

    private static final String [] pRef_10 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_31 = new String[] { "", "", "pyClassGroupName", "" };

    private static final String [] pRef_23 = new String[] { "", "", "pyOrgClassLayer", "" };

    private static final String [] pRef_11 = new String[] { "", "", "pyOrganizationName", "" };

    private static final String [] pRef_25 = new String[] { "", "", "pyDivClassLayer", "" };

    private static final String [] pRef_13 = new String[] { "", "", "pyDivisionName", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyBaseLocale", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyApplicationVersion", "" };

    private static final String [] pRef_27 = new String[] { "", "", "pyUnitClassLayer", "" };

    private static final String [] pRef_15 = new String[] { "", "", "pyUnitName", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyApplicationName", "" };

    private static final String [] pRef_29 = new String[] { "", "", "pyApplicationClassLayer", "" };

    private static final String [] pRef_17 = new String[] { "", "", "pyCreateDivClassLayer", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyCreateLayerOptionSelected", "" };

    private static final String [] pRef_19 = new String[] { "", "", "pyCreateUnitClassLayer", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGAACCEL-TASK-BUILDAPPLICATION PZAPPLYADVANCEDSETTINGS #20210915T152240.582 GMT", "PegaAccel-Task-BuildApplication pzApplyAdvancedSettings", "Pega-ProcessArchitect", "08-07-01", "20210915T152240.582 GMT");

    public ra_model_pegaaccel_task_buildapplication_pzapplyadvancedsettings_1587587435(final Loadtime loadtime) {
        super(ruleTracer, false);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyCreateLayerOptionSelected").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().scalarProperty("pyApplicationName").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().scalarProperty("pyApplicationVersion").buildScalarValueQuery();
        scalarValueQuery_8 = queryBuilderFactory.create().scalarProperty("pyBaseLocale").buildScalarValueQuery();
        scalarValueQuery_9 = queryBuilderFactory.create().scalarProperty("pyLabel").buildScalarValueQuery();
        scalarValueQuery_12 = queryBuilderFactory.create().scalarProperty("pyOrganizationName").buildScalarValueQuery();
        scalarValueQuery_14 = queryBuilderFactory.create().scalarProperty("pyDivisionName").buildScalarValueQuery();
        scalarValueQuery_16 = queryBuilderFactory.create().scalarProperty("pyUnitName").buildScalarValueQuery();
        scalarValueQuery_18 = queryBuilderFactory.create().scalarProperty("pyCreateDivClassLayer").buildScalarValueQuery();
        scalarValueQuery_20 = queryBuilderFactory.create().scalarProperty("pyCreateUnitClassLayer").buildScalarValueQuery();
        scalarValueQuery_22 = queryBuilderFactory.create().scalarProperty("pyOrganizationExists").buildScalarValueQuery();
        scalarValueQuery_24 = queryBuilderFactory.create().scalarProperty("pyOrgClassLayer").buildScalarValueQuery();
        scalarValueQuery_26 = queryBuilderFactory.create().scalarProperty("pyDivClassLayer").buildScalarValueQuery();
        scalarValueQuery_28 = queryBuilderFactory.create().scalarProperty("pyUnitClassLayer").buildScalarValueQuery();
        scalarValueQuery_30 = queryBuilderFactory.create().scalarProperty("pyApplicationClassLayer").buildScalarValueQuery();
        scalarValueQuery_32 = queryBuilderFactory.create().scalarProperty("pyClassGroupName").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "2", "Set D_pzBuildApplication.pyCreateLayerOptionSelected", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCreateLayerOptionSelected", pRef_1, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "stN", false, true);
            actionEpilog(runtime, "2", "Set D_pzBuildApplication.pyCreateLayerOptionSelected", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set D_pzBuildApplication.pyApplicationName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyApplicationName", pRef_3, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTI", false, true);
            actionEpilog(runtime, "3", "Set D_pzBuildApplication.pyApplicationName", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set D_pzBuildApplication.pyApplicationVersion", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyApplicationVersion", pRef_5, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_6.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "4", "Set D_pzBuildApplication.pyApplicationVersion", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set D_pzBuildApplication.pyBaseLocale", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyBaseLocale", pRef_7, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_8.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "5", "Set D_pzBuildApplication.pyBaseLocale", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_9.resolveToString(tools, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals(""));
                }
            }, "D_pzBuildApplication.pyLabel==")) {
                try {
                    actionProlog(runtime, "6", "When D_pzBuildApplication.pyLabel==", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "6.1", "Set D_pzBuildApplication.pyLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyLabel", pRef_10, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN64", false, true);
                        actionEpilog(runtime, "6.1", "Set D_pzBuildApplication.pyLabel", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "6", "When D_pzBuildApplication.pyLabel==", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "8", "Set D_pzBuildApplication.pyOrganizationName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyOrganizationName", pRef_11, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_12.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN32", false, true);
            actionEpilog(runtime, "8", "Set D_pzBuildApplication.pyOrganizationName", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Set D_pzBuildApplication.pyDivisionName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDivisionName", pRef_13, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_14.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "9", "Set D_pzBuildApplication.pyDivisionName", null, null, runtimeTraceContext);
            actionProlog(runtime, "10", "Set D_pzBuildApplication.pyUnitName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyUnitName", pRef_15, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_16.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "10", "Set D_pzBuildApplication.pyUnitName", null, null, runtimeTraceContext);
            actionProlog(runtime, "11", "Set D_pzBuildApplication.pyCreateDivClassLayer", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCreateDivClassLayer", pRef_17, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
            actionEpilog(runtime, "11", "Set D_pzBuildApplication.pyCreateDivClassLayer", null, null, runtimeTraceContext);
            actionProlog(runtime, "12", "Set D_pzBuildApplication.pyCreateUnitClassLayer", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCreateUnitClassLayer", pRef_19, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
            actionEpilog(runtime, "12", "Set D_pzBuildApplication.pyCreateUnitClassLayer", null, null, runtimeTraceContext);
            actionProlog(runtime, "13", "Set D_pzBuildApplication.pyOrganizationExists", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyOrganizationExists", pRef_21, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_22.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TRUEFALSE), "sSN", false, true);
            actionEpilog(runtime, "13", "Set D_pzBuildApplication.pyOrganizationExists", null, null, runtimeTraceContext);
            actionProlog(runtime, "15", "Set D_pzBuildApplication.pyOrgClassLayer", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyOrgClassLayer", pRef_23, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_24.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "15", "Set D_pzBuildApplication.pyOrgClassLayer", null, null, runtimeTraceContext);
            actionProlog(runtime, "16", "Set D_pzBuildApplication.pyDivClassLayer", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDivClassLayer", pRef_25, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_26.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "16", "Set D_pzBuildApplication.pyDivClassLayer", null, null, runtimeTraceContext);
            actionProlog(runtime, "17", "Set D_pzBuildApplication.pyUnitClassLayer", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyUnitClassLayer", pRef_27, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_28.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "17", "Set D_pzBuildApplication.pyUnitClassLayer", null, null, runtimeTraceContext);
            actionProlog(runtime, "18", "Set D_pzBuildApplication.pyApplicationClassLayer", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyApplicationClassLayer", pRef_29, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_30.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "18", "Set D_pzBuildApplication.pyApplicationClassLayer", null, null, runtimeTraceContext);
            actionProlog(runtime, "19", "Set D_pzBuildApplication.pyClassGroupName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyClassGroupName", pRef_31, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), scalarValueQuery_32.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT), "sTI", false, true);
            actionEpilog(runtime, "19", "Set D_pzBuildApplication.pyClassGroupName", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("D_pzAdvancedApplicationSettings", "PegaAccel-Task-BuildApplication"), ImmutablePropertyInfo.TYPE_TEXT).equals("Framework"));
                }
            }, "D_pzAdvancedApplicationSettings.pyCreateLayerOptionSelected==Framework")) {
                try {
                    actionProlog(runtime, "21", "When D_pzAdvancedApplicationSettings.pyCreateLayerOptionSelected==Framework", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "21.1", "Set D_pzBuildApplication.pyCreateDivClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyCreateDivClassLayer", pRef_17, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), false, "sSN", false, true);
                        actionEpilog(runtime, "21.1", "Set D_pzBuildApplication.pyCreateDivClassLayer", null, null, runtimeTraceContext);
                        actionProlog(runtime, "21.2", "Set D_pzBuildApplication.pyCreateUnitClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyCreateUnitClassLayer", pRef_19, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), false, "sSN", false, true);
                        actionEpilog(runtime, "21.2", "Set D_pzBuildApplication.pyCreateUnitClassLayer", null, null, runtimeTraceContext);
                        actionProlog(runtime, "21.3", "Set D_pzBuildApplication.pyDivClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDivClassLayer", pRef_25, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), "", "sTN", false, true);
                        actionEpilog(runtime, "21.3", "Set D_pzBuildApplication.pyDivClassLayer", null, null, runtimeTraceContext);
                        actionProlog(runtime, "21.4", "Set D_pzBuildApplication.pyUnitClassLayer", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyUnitClassLayer", pRef_27, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), "", "sTN", false, true);
                        actionEpilog(runtime, "21.4", "Set D_pzBuildApplication.pyUnitClassLayer", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "21", "When D_pzAdvancedApplicationSettings.pyCreateLayerOptionSelected==Framework", null, null, runtimeTraceContext);
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
