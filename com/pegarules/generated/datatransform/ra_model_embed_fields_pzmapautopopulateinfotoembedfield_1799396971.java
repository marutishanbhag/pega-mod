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

public class ra_model_embed_fields_pzmapautopopulateinfotoembedfield_1799396971 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_18;

    private final ScalarValueQuery scalarValueQuery_15;

    private final ScalarValueQuery scalarValueQuery_13;

    private final ScalarValueQuery scalarValueQuery_10;

    private final ScalarValueQuery scalarValueQuery_9;

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_8 = new String[] { "", "", "pyDataPageLabel", "" };

    private static final String [] pRef_12 = new String[] { "", "", "pyDTName", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pyIsNonRefAutoProperty", "" };

    private static final String [] pRef_11 = new String[] { "", "", "pyDataClass", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyDataPageName", "" };

    private static final String [] pRef_14 = new String[] { "", "", "pyRuleParamsStreamName", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyAutoPopulate", "" };

    private static final String [] pRef_16 = new String[] { "", "", "pyIsRetrieveEachPageSeparately", "" };

    private static final String [] pRef_17 = new String[] { "", "", "pyDataReferenceMethod", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyUsesOldAutoPopulate", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-FIELDS PZMAPAUTOPOPULATEINFOTOEMBEDFIELD #20190305T194743.081 GMT", "Embed-Fields pzMapAutoPopulateInfoToEmbedField", "Pega-SystemArchitect", "08-03-01", "20190305T194743.081 GMT");

    public ra_model_embed_fields_pzmapautopopulateinfotoembedfield_1799396971(final Loadtime loadtime) {
        super(ruleTracer, false);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyClassName").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyPropertyName").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pyAutoPopulate").buildScalarValueQuery();
        scalarValueQuery_9 = queryBuilderFactory.create().scalarProperty("pyDataPageName").buildScalarValueQuery();
        scalarValueQuery_10 = queryBuilderFactory.create().scalarProperty("pyLabel").buildScalarValueQuery();
        scalarValueQuery_13 = queryBuilderFactory.create().scalarProperty("pyDTName").buildScalarValueQuery();
        scalarValueQuery_15 = queryBuilderFactory.create().scalarProperty("pyPropertyMode").buildScalarValueQuery();
        scalarValueQuery_18 = queryBuilderFactory.create().scalarProperty("pyIsRetrieveEachPageSeparately").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyUsesOldAutoPopulate", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyUsesOldAutoPopulate", pRef_1, myStepPage, tools.interpretBoolean(pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyUsesOldAutoPopulate" })), "sSN", false, true);
            actionEpilog(runtime, "1", "Set .pyUsesOldAutoPopulate", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set param.local_dataretrievaltype", null, null, runtimeTraceContext);
            tools.putParamValue("local_dataretrievaltype", PropertyInfo.TYPE_TEXT, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyDataRetrievalType" }));
            actionEpilog(runtime, "2", "Set param.local_dataretrievaltype", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyAutoPopulate", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyAutoPopulate", pRef_4, myStepPage, ((tools.getParamValue("local_dataretrievaltype").equals("AUTOMATIC")) || (tools.getParamValue("local_dataretrievaltype").equals("AUTOMATICNONREF"))), "sSN", false, true);
            actionEpilog(runtime, "3", "Set .pyAutoPopulate", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return scalarValueQuery_5.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE);
                }
            }, ".pyAutoPopulate")) {
                try {
                    actionProlog(runtime, "4", "When .pyAutoPopulate", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "4.1", "Set .pyIsNonRefAutoProperty", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyIsNonRefAutoProperty", pRef_6, myStepPage, (tools.getParamValue("local_dataretrievaltype").equals("AUTOMATICNONREF")), "sSN", false, true);
                        actionEpilog(runtime, "4.1", "Set .pyIsNonRefAutoProperty", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.2", "Set .pyDataPageName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDataPageName", pRef_7, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyDataObject" }), "sTN", false, true);
                        actionEpilog(runtime, "4.2", "Set .pyDataPageName", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.3", "Set .pyDataPageLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDataPageLabel", pRef_8, myStepPage, scalarValueQuery_10.resolveToString(tools, pega.findDataPage("D_pzDataPage", false, "datapageID", scalarValueQuery_9.resolveToString(tools, tools.getPrimaryPage(), ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "4.3", "Set .pyDataPageLabel", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.4", "Set .pyDataClass", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDataClass", pRef_11, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyPageClass" }), "sTN", false, true);
                        actionEpilog(runtime, "4.4", "Set .pyDataClass", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.5", "Set param.noop", null, null, runtimeTraceContext);
                        tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, Integer.toString((pega.<Integer>resolveMethodCall("pzGetPageListOfPropertyFromDef--a0d4374f2d364df465501676150fcd98", "pzGetPageListOfPropertyFromDef", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyDOParamList", ".pyValue,.pyIsActivityParameter,.pyParameterInOut,.pyName,.pyParameterRequired,.pyDescription,.pyParameterType", myStepPage.getProperty("pyDOParamList") })).intValue()));
                        actionEpilog(runtime, "4.5", "Set param.noop", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.6", "Set param.noop", null, null, runtimeTraceContext);
                        tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, Integer.toString((pega.<Integer>resolveMethodCall("pzGetPageListOfPropertyFromDef--a0d4374f2d364df465501676150fcd98", "pzGetPageListOfPropertyFromDef", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyDOKeyList", ".pyValue,.pyIsActivityParameter,.pyParameterInOut,.pyName,.pyParameterRequired,.pyDescription,.pyParameterType", myStepPage.getProperty("pyDOKeyList") })).intValue()));
                        actionEpilog(runtime, "4.6", "Set param.noop", null, null, runtimeTraceContext);
                        actionProlog(runtime, "4.7", "Set .pyDTName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyDTName", pRef_12, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyDTName" }), "sTN", false, true);
                        actionEpilog(runtime, "4.7", "Set .pyDTName", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (!(scalarValueQuery_13.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                            }
                        }, ".pyDTName != ")) {
                            try {
                                actionProlog(runtime, "4.8", "When .pyDTName != ", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "4.8.1", "Set param.noop", null, null, runtimeTraceContext);
                                    tools.putParamValue("noop", PropertyInfo.TYPE_TEXT, Integer.toString((pega.<Integer>resolveMethodCall("pzGetPageListOfPropertyFromDef--a0d4374f2d364df465501676150fcd98", "pzGetPageListOfPropertyFromDef", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyDTParamList", ".pyValue,.pyIsActivityParameter,.pyParameterInOut,.pyName,.pyParameterRequired,.pyDescription,.pyParameterType", myStepPage.getProperty("pyDTParamList") })).intValue()));
                                    actionEpilog(runtime, "4.8.1", "Set param.noop", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_2) {
                                runtimeTraceContext.setError(e_2);
                                throw e_2;
                            } finally {
                                actionEpilog(runtime, "4.8", "When .pyDTName != ", null, null, runtimeTraceContext);
                            }
                        }
                        actionProlog(runtime, "4.9", "Set .pyRuleParamsStreamName", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyRuleParamsStreamName", pRef_14, myStepPage, pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyRuleParamsStreamName" }), "sTN", false, true);
                        actionEpilog(runtime, "4.9", "Set .pyRuleParamsStreamName", null, null, runtimeTraceContext);
                        if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                            public Boolean apply(ClipboardPage myStepPage) {
                                return (scalarValueQuery_15.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("PageList"));
                            }
                        }, ".pyPropertyMode==PageList")) {
                            try {
                                actionProlog(runtime, "4.10", "When .pyPropertyMode==PageList", null, null, runtimeTraceContext);
                                {
                                    actionProlog(runtime, "4.10.1", "Set .pyIsRetrieveEachPageSeparately", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyIsRetrieveEachPageSeparately", pRef_16, myStepPage, tools.interpretBoolean(pega.<String>resolveMethodCall("pzGetPropertyInfoFromDefinition--(String,String,String)", "pzGetPropertyInfoFromDefinition", null, "pxRuleManagement", new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), scalarValueQuery_3.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), ".pyIsRetrieveEachPageSeparately" })), "sSN", false, true);
                                    actionEpilog(runtime, "4.10.1", "Set .pyIsRetrieveEachPageSeparately", null, null, runtimeTraceContext);
                                    actionProlog(runtime, "4.10.2", "Set .pyDataReferenceMethod", null, null, runtimeTraceContext);
                                    pega.setViaPropRef(".pyDataReferenceMethod", pRef_17, myStepPage, (scalarValueQuery_18.resolveToBoolean(tools, myStepPage, ImmutablePropertyInfo.TYPE_TRUEFALSE) ? "REFERINDIVIDUALOBJECT" : "REFERLIST"), "stN", false, true);
                                    actionEpilog(runtime, "4.10.2", "Set .pyDataReferenceMethod", null, null, runtimeTraceContext);
                                }
                            } catch (Exception e_3) {
                                runtimeTraceContext.setError(e_3);
                                throw e_3;
                            } finally {
                                actionEpilog(runtime, "4.10", "When .pyPropertyMode==PageList", null, null, runtimeTraceContext);
                            }
                        }
                    }
                } catch (Exception e_4) {
                    runtimeTraceContext.setError(e_4);
                    throw e_4;
                } finally {
                    actionEpilog(runtime, "4", "When .pyAutoPopulate", null, null, runtimeTraceContext);
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
