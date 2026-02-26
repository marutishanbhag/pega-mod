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

public class ra_model_pegaaccel_task_buildapplication_pzselectapplicationtemplate__1083852026 extends AbstractDataTransform {

    private static final String [] pRef_8 = new String[] { "", "", "pySelectedApplicationBadgeImage", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pySelectedApplicationTemplateVersion", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pySelectedApplicationDesktopImage", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pySelectedApplicationTemplateDescription", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pySelectedApplicationTemplateIcon", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pySelectedApplicationTemplateLabel", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pySelectedApplicationBuildWithLabel", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pySelectedApplicationTemplate", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGAACCEL-TASK-BUILDAPPLICATION PZSELECTAPPLICATIONTEMPLATE #20230804T140013.103 GMT", "PegaAccel-Task-BuildApplication pzSelectApplicationTemplate", "Pega-ProcessArchitect", "08-23-01", "20230804T140013.103 GMT");

    public ra_model_pegaaccel_task_buildapplication_pzselectapplicationtemplate__1083852026(final Loadtime loadtime) {
        super(ruleTracer, false);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (((tools.getParamValue("selectedAppName").equals("")) || (tools.getParamValue("selectedAppVersion").equals(""))) || (tools.getParamValue("selectedAppLabel").equals("")));
                }
            }, "param.selectedAppName ==  || param.selectedAppVersion ==  || param.selectedAppLabel  == ")) {
                try {
                    actionProlog(runtime, "1", "When param.selectedAppName ==  || param.selectedAppVersion ==  || param.selectedAppLabel  == ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set .pySelectedApplicationTemplate", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationTemplate", pRef_1, myStepPage, "", "sTN", false, true);
                        actionEpilog(runtime, "1.1", "Set .pySelectedApplicationTemplate", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.2", "Set .pySelectedApplicationTemplateLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationTemplateLabel", pRef_2, myStepPage, "", "sTN", false, true);
                        actionEpilog(runtime, "1.2", "Set .pySelectedApplicationTemplateLabel", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.3", "Set .pySelectedApplicationBuildWithLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationBuildWithLabel", pRef_3, myStepPage, "", "sTN", false, true);
                        actionEpilog(runtime, "1.3", "Set .pySelectedApplicationBuildWithLabel", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.4", "Set .pySelectedApplicationTemplateDescription", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationTemplateDescription", pRef_4, myStepPage, "", "sTN", false, true);
                        actionEpilog(runtime, "1.4", "Set .pySelectedApplicationTemplateDescription", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.5", "Set .pySelectedApplicationTemplateIcon", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationTemplateIcon", pRef_5, myStepPage, "", "sTN", false, true);
                        actionEpilog(runtime, "1.5", "Set .pySelectedApplicationTemplateIcon", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.6", "Set .pySelectedApplicationDesktopImage", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationDesktopImage", pRef_6, myStepPage, "", "sTN", false, true);
                        actionEpilog(runtime, "1.6", "Set .pySelectedApplicationDesktopImage", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.7", "Set .pyLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyLabel", pRef_7, myStepPage, "", "sTN64", false, true);
                        actionEpilog(runtime, "1.7", "Set .pyLabel", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.8", "Set .pySelectedApplicationBadgeImage", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationBadgeImage", pRef_8, myStepPage, "AppTemplateBadge.png", "sTN", false, true);
                        actionEpilog(runtime, "1.8", "Set .pySelectedApplicationBadgeImage", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "1", "When param.selectedAppName ==  || param.selectedAppVersion ==  || param.selectedAppLabel  == ", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "2", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set .pySelectedApplicationTemplateVersion", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationTemplateVersion", pRef_9, myStepPage, tools.getParamValue("selectedAppVersion"), "sTN", false, true);
                        actionEpilog(runtime, "2.1", "Set .pySelectedApplicationTemplateVersion", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.2", "Set .pySelectedApplicationTemplate", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationTemplate", pRef_1, myStepPage, tools.getParamValue("selectedAppName"), "sTN", false, true);
                        actionEpilog(runtime, "2.2", "Set .pySelectedApplicationTemplate", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.3", "Set .pySelectedApplicationTemplateLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationTemplateLabel", pRef_2, myStepPage, "", "sTN", false, true);
                        actionEpilog(runtime, "2.3", "Set .pySelectedApplicationTemplateLabel", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.4", "Set .pySelectedApplicationBuildWithLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationBuildWithLabel", pRef_3, myStepPage, ((pega.<String>resolveMethodCall("getLocalizedText--(String,String,PublicAPI)", "getLocalizedText", null, null, new Object[] { "BuildApplicationType", ".pyButtonLabel", tools }) + " ") + tools.getParamValue("selectedAppLabel")), "sTN", false, true);
                        actionEpilog(runtime, "2.4", "Set .pySelectedApplicationBuildWithLabel", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.5", "Set .pySelectedApplicationTemplateLabel", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationTemplateLabel", pRef_2, myStepPage, tools.getParamValue("selectedAppLabel"), "sTN", false, true);
                        actionEpilog(runtime, "2.5", "Set .pySelectedApplicationTemplateLabel", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.6", "Set .pySelectedApplicationTemplateDescription", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationTemplateDescription", pRef_4, myStepPage, tools.getParamValue("selectedAppDescription"), "sTN", false, true);
                        actionEpilog(runtime, "2.6", "Set .pySelectedApplicationTemplateDescription", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.7", "Set .pySelectedApplicationTemplateIcon", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationTemplateIcon", pRef_5, myStepPage, tools.getParamValue("selectedAppIcon"), "sTN", false, true);
                        actionEpilog(runtime, "2.7", "Set .pySelectedApplicationTemplateIcon", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.8", "Set .pySelectedApplicationDesktopImage", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationDesktopImage", pRef_6, myStepPage, tools.getParamValue("selectedAppDesktopImage"), "sTN", false, true);
                        actionEpilog(runtime, "2.8", "Set .pySelectedApplicationDesktopImage", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.9", "Set .pySelectedApplicationBadgeImage", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pySelectedApplicationBadgeImage", pRef_8, myStepPage, tools.getParamValue("selectedAppBadgeImage"), "sTN", false, true);
                        actionEpilog(runtime, "2.9", "Set .pySelectedApplicationBadgeImage", null, null, runtimeTraceContext);
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
