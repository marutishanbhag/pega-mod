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

public class ra_model_pega_landing_system_highavailability_pzloadhighavailabilitysettings_2040423039 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_7;

    private static final String [] pRef_8 = new String[] { "", "", "pyMinAccelerationThreshold", "" };

    private static final String [] pRef_9 = new String[] { "", "", "pyMaxAccelerationThreshold", "" };

    private static final String [] pRef_6 = new String[] { "", "", "pyUpgradingCluster", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyCrashMessageEnable", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyQuiesceAcceleration", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyPassivationQuiesce", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyRecordWorkForHighAvailability", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyEnableQuiesce", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-LANDING-SYSTEM-HIGHAVAILABILITY PZLOADHIGHAVAILABILITYSETTINGS #20180713T135519.289 GMT", "Pega-Landing-System-HighAvailability pzLoadHighAvailabilitySettings", "Pega-Desktop", "08-01-01", "20180713T135519.289 GMT");

    public ra_model_pega_landing_system_highavailability_pzloadhighavailabilitysettings_2040423039(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_7 = queryBuilderFactory.create().scalarProperty("pxClusterUpgradeState").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyEnableQuiesce", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyEnableQuiesce", pRef_1, myStepPage, tools.interpretBoolean(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-Engine", "session/ha/quiesce/landingPageVisible", "true" })), "sSN", false, true);
            actionEpilog(runtime, "1", "Set .pyEnableQuiesce", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pyPassivationQuiesce", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyPassivationQuiesce", pRef_2, myStepPage, tools.interpretBoolean(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-Engine", "session/ha/quiesce/passivation", "true" })), "sSN", false, true);
            actionEpilog(runtime, "2", "Set .pyPassivationQuiesce", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pyRecordWorkForHighAvailability", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyRecordWorkForHighAvailability", pRef_3, myStepPage, tools.interpretBoolean(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-Engine", "prconfig/session/ha/crash/recordWorkInProgress/default", "true" })), "sSN", false, true);
            actionEpilog(runtime, "3", "Set .pyRecordWorkForHighAvailability", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set .pyCrashMessageEnable", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyCrashMessageEnable", pRef_4, myStepPage, tools.interpretBoolean(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-ProcessEngine", "session/ha/crash/enableUserNotification", "true" })), "sSN", false, true);
            actionEpilog(runtime, "4", "Set .pyCrashMessageEnable", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set .pyQuiesceAcceleration", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyQuiesceAcceleration", pRef_5, myStepPage, com.pega.pegarules.priv.FUAUtil.parseInt(pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-Engine", "session/ha/quiesce/passivationTimeout", Integer.toString(20) })), "sNN", false, true);
            actionEpilog(runtime, "5", "Set .pyQuiesceAcceleration", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set .pyUpgradingCluster", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyUpgradingCluster", pRef_6, myStepPage, (scalarValueQuery_7.resolveToString(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_TEXT).equals("Upgrading")), "sSN", false, true);
            actionEpilog(runtime, "6", "Set .pyUpgradingCluster", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set .pyMinAccelerationThreshold", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyMinAccelerationThreshold", pRef_8, myStepPage, 5, "sNN", false, true);
            actionEpilog(runtime, "7", "Set .pyMinAccelerationThreshold", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set .pyMaxAccelerationThreshold", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyMaxAccelerationThreshold", pRef_9, myStepPage, 3600, "sNN", false, true);
            actionEpilog(runtime, "8", "Set .pyMaxAccelerationThreshold", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
