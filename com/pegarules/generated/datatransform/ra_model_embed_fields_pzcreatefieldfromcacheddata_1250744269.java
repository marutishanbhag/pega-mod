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

public class ra_model_embed_fields_pzcreatefieldfromcacheddata_1250744269 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_35;

    private final ScalarValueQuery scalarValueQuery_32;

    private final ScalarValueQuery scalarValueQuery_30;

    private final ScalarValueQuery scalarValueQuery_27;

    private final ScalarValueQuery scalarValueQuery_22;

    private final ScalarValueQuery scalarValueQuery_17;

    private final ScalarValueQuery scalarValueQuery_16;

    private final ScalarValueQuery scalarValueQuery_6;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_10 = new String[] { "", "", "pxCreateDateTime", "" };

    private static final String [] pRef_31 = new String[] { "", "", "pyCategoryName", "" };

    private static final String [] pRef_34 = new String[] { "", "", "pyDataClass", "" };

    private static final String [] pRef_12 = new String[] { "", "", "pyIsReference", "" };

    private static final String [] pRef_33 = new String[] { "", "", "pyCategory", "" };

    private static final String [] pRef_11 = new String[] { "", "", "pyIsSpecial", "" };

    private static final String [] pRef_36 = new String[] { "", "", "pyDataClassLabel", "" };

    private static final String [] pRef_14 = new String[] { "", "", "pyMethodStatus", "" };

    private static final String [] pRef_13 = new String[] { "", "", "pyDescription", "" };

    private static final String [] pRef_8 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pyPropertyMode", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pxInsId", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pxInsName", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyPxInsName", "" };

    private static final String [] pRef_26 = new String[] { "", "", "pyTableClassLabel", "" };

    private static final String [] pRef_29 = new String[] { "", "", "pyPageClass", "" };

    private static final String [] pRef_28 = new String[] { "", "", "pyModeCalc", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pzInsKey", "" };

    private static final String [] pRef_21 = new String[] { "", "", "pyTempDataClassLabel", "" };

    private static final String [] pRef_20 = new String[] { "", "", "pyRuleSetVersion", "" };

    private static final String [] pRef_23 = new String[] { "", "", "pyMaxLength", "" };

    private static final String [] pRef_25 = new String[] { "", "", "pyTableValueForSecondaryKey", "" };

    private static final String [] pRef_24 = new String[] { "", "", "pyTableClass", "" };

    private static final String [] pRef_15 = new String[] { "", "", "pyStringType", "" };

    private static final String [] pRef_18 = new String[] { "", "", "pyStreamName", "" };

    private static final String [] pRef_19 = new String[] { "", "", "pyRuleSet", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-FIELDS PZCREATEFIELDFROMCACHEDDATA #20190724T221843.390 GMT", "Embed-Fields pzCreateFieldFromCachedData", "Pega-ProcessArchitect", "08-04-01", "20190724T221843.390 GMT");

    public ra_model_embed_fields_pzcreatefieldfromcacheddata_1250744269(final Loadtime loadtime) {
        super(ruleTracer, false);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyClassName").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyPropertyName").buildScalarValueQuery();
        scalarValueQuery_6 = queryBuilderFactory.create().scalarProperty("pxInsName").buildScalarValueQuery();
        scalarValueQuery_16 = queryBuilderFactory.create().scalarProperty("pyStringType").buildScalarValueQuery();
        scalarValueQuery_17 = queryBuilderFactory.create().scalarProperty("pyIsSystemField").buildScalarValueQuery();
        scalarValueQuery_22 = queryBuilderFactory.create().scalarProperty("pyPropertyMode").buildScalarValueQuery();
        scalarValueQuery_27 = queryBuilderFactory.create().scalarProperty("pyTableClass").buildScalarValueQuery();
        scalarValueQuery_30 = queryBuilderFactory.create().scalarProperty("pyPageClass").buildScalarValueQuery();
        scalarValueQuery_32 = queryBuilderFactory.create().scalarProperty("pyCategoryName").buildScalarValueQuery();
        scalarValueQuery_35 = queryBuilderFactory.create().scalarProperty("pyDataClass").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pzInsKey", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pzInsKey", pRef_1, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pzInsKey" }), "sIY", false, true);
            actionEpilog(runtime, "1", "Set .pzInsKey", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pxInsName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxInsName", pRef_4, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pxInsName" }), "sIY", false, true);
            actionEpilog(runtime, "2", "Set .pxInsName", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyPxInsName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyPxInsName", pRef_5, myStepPage, scalarValueQuery_6.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "3", "Set .pyPxInsName", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pxInsId", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxInsId", pRef_7, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pxInsId" }), "sTY", false, true);
            actionEpilog(runtime, "4", "Set .pxInsId", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set .pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyLabel", pRef_8, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyLabel" }), "sTN64", false, true);
            actionEpilog(runtime, "5", "Set .pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pyPropertyMode", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyPropertyMode", pRef_9, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyPropertyMode" }), "siN", false, true);
            actionEpilog(runtime, "6", "Set .pyPropertyMode", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set .pxCreateDateTime", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxCreateDateTime", pRef_10, myStepPage, com.pega.pegarules.priv.FUAUtil.parseStringAsDateTime(pega, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pxCreateDateTime" })), "sMY", false, true);
            actionEpilog(runtime, "7", "Set .pxCreateDateTime", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set .pyIsSpecial", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyIsSpecial", pRef_11, myStepPage, tools.interpretBoolean(pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pySpecial" })), "sSN", false, true);
            actionEpilog(runtime, "8", "Set .pyIsSpecial", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Set .pyIsReference", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyIsReference", pRef_12, myStepPage, tools.interpretBoolean(pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyIsReference" })), "sSN", false, true);
            actionEpilog(runtime, "9", "Set .pyIsReference", null, null, runtimeTraceContext);
            actionProlog(runtime, "10", "Set .pyDescription", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyDescription", pRef_13, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyDescription" }), "sTN", false, true);
            actionEpilog(runtime, "10", "Set .pyDescription", null, null, runtimeTraceContext);
            actionProlog(runtime, "11", "Set .pyMethodStatus", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyMethodStatus", pRef_14, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyMethodStatus" }), "sTN", false, true);
            actionEpilog(runtime, "11", "Set .pyMethodStatus", null, null, runtimeTraceContext);
            actionProlog(runtime, "13", "Set .pyStringType", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyStringType", pRef_15, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyStringType" }), "sTN", false, true);
            actionEpilog(runtime, "13", "Set .pyStringType", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("True-False"));
                }
            }, ".pyStringType==True-False")) {
                try {
                    actionProlog(runtime, "14", "When .pyStringType==True-False", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "14.1", "Set .pyStringType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyStringType", pRef_15, myStepPage, "TrueFalse", "sTN", false, true);
                        actionEpilog(runtime, "14.1", "Set .pyStringType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "14", "When .pyStringType==True-False", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Date Time"));
                }
            }, ".pyStringType==Date Time")) {
                try {
                    actionProlog(runtime, "15", "Otherwise When .pyStringType==Date Time", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "15.1", "Set .pyStringType", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyStringType", pRef_15, myStepPage, "DateTime", "sTN", false, true);
                        actionEpilog(runtime, "15.1", "Set .pyStringType", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "15", "Otherwise When .pyStringType==Date Time", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "16", "Set param.local_noop", null, null, runtimeTraceContext);
            tools.putParamValue("local_noop", PropertyInfo.TYPE_TEXT, scalarValueQuery_17.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE));
            actionEpilog(runtime, "16", "Set param.local_noop", null, null, runtimeTraceContext);
            actionProlog(runtime, "17", "Set .pyStreamName", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyStreamName", pRef_18, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyStreamName" }), "sIN", false, true);
            actionEpilog(runtime, "17", "Set .pyStreamName", null, null, runtimeTraceContext);
            actionProlog(runtime, "18", "Set .pyRuleSet", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyRuleSet", pRef_19, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyRuleSet" }), "sTN", false, true);
            actionEpilog(runtime, "18", "Set .pyRuleSet", null, null, runtimeTraceContext);
            actionProlog(runtime, "19", "Set .pyRuleSetVersion", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyRuleSetVersion", pRef_20, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyRuleSetVersion" }), "sTN", false, true);
            actionEpilog(runtime, "19", "Set .pyRuleSetVersion", null, null, runtimeTraceContext);
            actionProlog(runtime, "20", "Set .pyTempDataClassLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyTempDataClassLabel", pRef_21, myStepPage, pega.<String>resolveMethodCall("pzGetClassInfoFromDefinition--(String,String)", "pzGetClassInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyLabel" }), "sTN", false, true);
            actionEpilog(runtime, "20", "Set .pyTempDataClassLabel", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (((scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Page")) || (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("PageList"))) || (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("PageGroup")));
                }
            }, ".pyPropertyMode == Page || .pyPropertyMode == PageList || .pyPropertyMode == PageGroup")) {
                try {
                    actionProlog(runtime, "22", "When .pyPropertyMode == Page || .pyPropertyMode == PageList || .pyPropertyMode == PageGroup", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "22.1", "Set .pyModeCalc", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyModeCalc", pRef_28, myStepPage, false, "sSN", false, true);
                        actionEpilog(runtime, "22.1", "Set .pyModeCalc", null, null, runtimeTraceContext);
                        actionProlog(runtime, "22.2", "Set .pyPageClass", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyPageClass", pRef_29, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyPageClass" }), "sIN", false, true);
                        actionEpilog(runtime, "22.2", "Set .pyPageClass", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_30.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Embed-Attach-File"));
                            }
                        }, ".pyPageClass==Embed-Attach-File")) {
                            try {
                                actionProlog(runtime, "22.3", "When .pyPageClass==Embed-Attach-File", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "22.3.2", "Set .pyCategoryName", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyCategoryName", pRef_31, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyCategoryName" }), "sTN", false, true);
                                    actionEpilog(runtime, "22.3.2", "Set .pyCategoryName", null, null, runtimeTraceContext);
                                    if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                                        public Boolean apply(ClipboardPage myStepPage) {
                                            return (!(scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                                        }
                                    }, ".pyCategoryName!=")) {
                                        try {
                                            actionProlog(runtime, "22.3.3", "When .pyCategoryName!=", null, null, runtimeTraceContext);
                                            {
                                                actionProlog(runtime, "22.3.3.1", "Set .pyCategory", null, null, runtimeTraceContext);
                                                pega.setViaPropRef(".pyCategory", pRef_33, myStepPage, pega.<String>resolveMethodCall("lookup--(String,String,String,String,String)", "lookup", null, null, new Object[] { "pyLabel", "Rule-Obj-AttachmentCategory", "pyCategoryName", scalarValueQuery_32.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) }), "sTN", false, true);
                                                actionEpilog(runtime, "22.3.3.1", "Set .pyCategory", null, null, runtimeTraceContext);
                                            }
                                        } catch (Exception e_7) {
                                            runtimeTraceContext.setError(e_7);
                                            throw e_7;
                                        } finally {
                                            actionEpilog(runtime, "22.3.3", "When .pyCategoryName!=", null, null, runtimeTraceContext);
                                        }
                                    }
                                }
                            } catch (Exception e_8) {
                                runtimeTraceContext.setError(e_8);
                                throw e_8;
                            } finally {
                                actionEpilog(runtime, "22.3", "When .pyPageClass==Embed-Attach-File", null, null, runtimeTraceContext);
                            }
                        }
                        actionProlog(runtime, "22.4", "Set .pyDataClass", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDataClass", pRef_34, myStepPage, scalarValueQuery_30.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "22.4", "Set .pyDataClass", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equalsIgnoreCase("$ANY"));
                            }
                        }, ".pyDataClass~=$ANY")) {
                            try {
                                actionProlog(runtime, "22.6", "When .pyDataClass~=$ANY", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "22.6.1", "Set .pyDataClassLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyDataClassLabel", pRef_36, myStepPage, "$ANY", "sTN", false, true);
                                    actionEpilog(runtime, "22.6.1", "Set .pyDataClassLabel", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_12) {
                                runtimeTraceContext.setError(e_12);
                                throw e_12;
                            } finally {
                                actionEpilog(runtime, "22.6", "When .pyDataClass~=$ANY", null, null, runtimeTraceContext);
                            }
                        } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equalsIgnoreCase("$CLASS"));
                            }
                        }, ".pyDataClass~=$CLASS")) {
                            try {
                                actionProlog(runtime, "22.7", "Otherwise When .pyDataClass~=$CLASS", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "22.7.1", "Set .pyDataClassLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyDataClassLabel", pRef_36, myStepPage, "$CLASS", "sTN", false, true);
                                    actionEpilog(runtime, "22.7.1", "Set .pyDataClassLabel", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_11) {
                                runtimeTraceContext.setError(e_11);
                                throw e_11;
                            } finally {
                                actionEpilog(runtime, "22.7", "Otherwise When .pyDataClass~=$CLASS", null, null, runtimeTraceContext);
                            }
                        } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_35.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equalsIgnoreCase("$NONE"));
                            }
                        }, ".pyDataClass~=$NONE")) {
                            try {
                                actionProlog(runtime, "22.8", "Otherwise When .pyDataClass~=$NONE", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "22.8.1", "Set .pyDataClassLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyDataClassLabel", pRef_36, myStepPage, "$NONE", "sTN", false, true);
                                    actionEpilog(runtime, "22.8.1", "Set .pyDataClassLabel", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_9) {
                                runtimeTraceContext.setError(e_9);
                                throw e_9;
                            } finally {
                                actionEpilog(runtime, "22.8", "Otherwise When .pyDataClass~=$NONE", null, null, runtimeTraceContext);
                            }
                        } else {
                            try {
                                actionProlog(runtime, "22.9", "Otherwise ", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "22.9.1", "Set .pyDataClassLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyDataClassLabel", pRef_36, myStepPage, pega.<String>resolveMethodCall("pzGetClassInfoFromDefinition--(String,String)", "pzGetClassInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_30.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyLabel" }), "sTN", false, true);
                                    actionEpilog(runtime, "22.9.1", "Set .pyDataClassLabel", null, null, runtimeTraceContext);
                                    ParameterPage newParams_22_9_2 = runtime.parameterPageConstructor(null, null);
                                    {
                                        actionProlog(runtime, "22.9.2", "Apply Data Transform pzMapAutoPopulateInfoToEmbedField", null, null, runtimeTraceContext);
                                        pega.applyModel(myStepPage, "Embed-Fields", newParams_22_9_2, "pzMapAutoPopulateInfoToEmbedField");
                                        actionEpilog(runtime, "22.9.2", "Apply Data Transform pzMapAutoPopulateInfoToEmbedField", null, null, runtimeTraceContext);
                                    }
                                }
                            } catch (Exception e_10) {
                                runtimeTraceContext.setError(e_10);
                                throw e_10;
                            } finally {
                                actionEpilog(runtime, "22.9", "Otherwise ", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_13) {
                    runtimeTraceContext.setError(e_13);
                    throw e_13;
                } finally {
                    actionEpilog(runtime, "22", "When .pyPropertyMode == Page || .pyPropertyMode == PageList || .pyPropertyMode == PageGroup", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_22.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("String"));
                }
            }, ".pyPropertyMode==String")) {
                try {
                    actionProlog(runtime, "23", "Otherwise When .pyPropertyMode==String", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "23.1", "Set .pyMaxLength", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyMaxLength", pRef_23, myStepPage, com.pega.pegarules.priv.FUAUtil.parseInt(pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyMaxLength" })), "sNN", false, true);
                        actionEpilog(runtime, "23.1", "Set .pyMaxLength", null, null, runtimeTraceContext);
                        ParameterPage newParams_23_2 = runtime.parameterPageConstructor(Arrays.asList(new InputBinding("skipAddingEmptyRow", String.valueOf(true))), null);
                        {
                            actionProlog(runtime, "23.2", "Apply Data Transform pzMapPicklistInfoToField", null, null, runtimeTraceContext);
                            pega.applyModel(myStepPage, "Embed-Fields", newParams_23_2, "pzMapPicklistInfoToField");
                            actionEpilog(runtime, "23.2", "Apply Data Transform pzMapPicklistInfoToField", null, null, runtimeTraceContext);
                        }
                        ParameterPage newParams_23_3 = runtime.parameterPageConstructor(null, null);
                        {
                            actionProlog(runtime, "23.3", "Apply Data Transform pzInitializeCalculatedValueInfo", null, null, runtimeTraceContext);
                            pega.applyModel(myStepPage, "Embed-Fields", newParams_23_3, "pzInitializeCalculatedValueInfo");
                            actionEpilog(runtime, "23.3", "Apply Data Transform pzInitializeCalculatedValueInfo", null, null, runtimeTraceContext);
                        }
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyAdvancedPropType" }).equals("LINKED"));
                            }
                        }, "@pxRuleManagement.pzGetPropertyInfoFromDefinition(.pyClassName, .pyPropertyName, .pyAdvancedPropType) == LINKED")) {
                            try {
                                actionProlog(runtime, "23.4", "When @pxRuleManagement.pzGetPropertyInfoFromDefinition(.pyClassName, .pyPropertyName, .pyAdvancedPropType) == LINKED", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "23.4.1", "Set .pyTableClass", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyTableClass", pRef_24, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyGatewayClass" }), "sIN", false, true);
                                    actionEpilog(runtime, "23.4.1", "Set .pyTableClass", null, null, runtimeTraceContext);
                                    actionProlog(runtime, "23.4.2", "Set .pyTableValueForSecondaryKey", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyTableValueForSecondaryKey", pRef_25, myStepPage, "", "sTN", false, true);
                                    actionEpilog(runtime, "23.4.2", "Set .pyTableValueForSecondaryKey", null, null, runtimeTraceContext);
                                    actionProlog(runtime, "23.4.3", "Set .pyTableClassLabel", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyTableClassLabel", pRef_26, myStepPage, pega.<String>resolveMethodCall("pzGetClassInfoFromDefinition--(String,String)", "pzGetClassInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_27.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyLabel" }), "sTN", false, true);
                                    actionEpilog(runtime, "23.4.3", "Set .pyTableClassLabel", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_4) {
                                runtimeTraceContext.setError(e_4);
                                throw e_4;
                            } finally {
                                actionEpilog(runtime, "23.4", "When @pxRuleManagement.pzGetPropertyInfoFromDefinition(.pyClassName, .pyPropertyName, .pyAdvancedPropType) == LINKED", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_5) {
                    runtimeTraceContext.setError(e_5);
                    throw e_5;
                } finally {
                    actionEpilog(runtime, "23", "Otherwise When .pyPropertyMode==String", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "24", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "24.1", "Set .pyModeCalc", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyModeCalc", pRef_28, myStepPage, false, "sSN", false, true);
                        actionEpilog(runtime, "24.1", "Set .pyModeCalc", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_6) {
                    runtimeTraceContext.setError(e_6);
                    throw e_6;
                } finally {
                    actionEpilog(runtime, "24", "Otherwise ", null, null, runtimeTraceContext);
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
