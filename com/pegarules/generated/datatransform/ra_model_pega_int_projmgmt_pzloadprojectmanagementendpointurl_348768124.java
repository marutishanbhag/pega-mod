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

public class ra_model_pega_int_projmgmt_pzloadprojectmanagementendpointurl_348768124 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_8 = new String[] { "", "", "pyProjectManagementUserStoryEndPoint", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pyProjectManagementFeedbackEndPoint", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pyProjectManagementReleaseEndPoint", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyProjectManagementBugEndPoint", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyProjectManagementProductEndPoint", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyProjectManagementEndPoint", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-INT-PROJMGMT PZLOADPROJECTMANAGEMENTENDPOINTURL #20210325T060026.034 GMT", "Pega-Int-ProjMgmt pzLoadProjectManagementEndPointURL", "Pega-AppDefinition", "08-07-01", "20210325T060026.034 GMT");

    public ra_model_pega_int_projmgmt_pzloadprojectmanagementendpointurl_348768124(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pyProjectManagementSystem").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().scalarProperty("pyProjectManagementURL").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().scalarProperty("pyProjectManagementEndPoint").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT).equals("AgileStudio"));
                }
            }, "Application.pyProjectManagementSystem==AgileStudio")) {
                try {
                    actionProlog(runtime, "1", "When Application.pyProjectManagementSystem==AgileStudio", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set .pyProjectManagementEndPoint", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyProjectManagementEndPoint", pRef_2, myStepPage, scalarValueQuery_3.resolveToString(tools, pega.findPageWithException("Application", "Rule-Application"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
                        actionEpilog(runtime, "1.1", "Set .pyProjectManagementEndPoint", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.2", "Set .pyProjectManagementProductEndPoint", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyProjectManagementProductEndPoint", pRef_4, myStepPage, (scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/products"), "sTN", false, true);
                        actionEpilog(runtime, "1.2", "Set .pyProjectManagementProductEndPoint", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.3", "Set .pyProjectManagementReleaseEndPoint", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyProjectManagementReleaseEndPoint", pRef_6, myStepPage, (scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/releases"), "sTN", false, true);
                        actionEpilog(runtime, "1.3", "Set .pyProjectManagementReleaseEndPoint", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.4", "Set .pyProjectManagementBugEndPoint", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyProjectManagementBugEndPoint", pRef_7, myStepPage, (scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/bugs"), "sTN", false, true);
                        actionEpilog(runtime, "1.4", "Set .pyProjectManagementBugEndPoint", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.5", "Set .pyProjectManagementUserStoryEndPoint", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyProjectManagementUserStoryEndPoint", pRef_8, myStepPage, (scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/userstories"), "sTN", false, true);
                        actionEpilog(runtime, "1.5", "Set .pyProjectManagementUserStoryEndPoint", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.6", "Set .pyProjectManagementFeedbackEndPoint", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyProjectManagementFeedbackEndPoint", pRef_9, myStepPage, (scalarValueQuery_5.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "/feedbacks"), "sTN", false, true);
                        actionEpilog(runtime, "1.6", "Set .pyProjectManagementFeedbackEndPoint", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "1", "When Application.pyProjectManagementSystem==AgileStudio", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "2", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        ParameterPage newParams_2_2 = runtime.parameterPageConstructor(null, null);
                        {
                            actionProlog(runtime, "2.2", "Apply Data Transform pyLoadProjectManagementEndPointURL", null, null, runtimeTraceContext);
                            pega.applyModel(myStepPage, "Pega-Int-ProjMgmt", newParams_2_2, "pyLoadProjectManagementEndPointURL");
                            actionEpilog(runtime, "2.2", "Apply Data Transform pyLoadProjectManagementEndPointURL", null, null, runtimeTraceContext);
                        }
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "2", "Otherwise ", null, null, runtimeTraceContext);
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
