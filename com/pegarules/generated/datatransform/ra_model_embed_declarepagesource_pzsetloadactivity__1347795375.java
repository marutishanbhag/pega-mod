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

public class ra_model_embed_declarepagesource_pzsetloadactivity__1347795375 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_1;

    private static final String [] pRef_2 = new String[] { "", "", "pyLoadActivity", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyPassCurrentParamPageForActivity", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-DECLAREPAGESOURCE PZSETLOADACTIVITY #20180713T135728.237 GMT", "Embed-DeclarePageSource pzSetLoadActivity", "Pega-SystemArchitect", "08-01-01", "20180713T135728.237 GMT");

    public ra_model_embed_declarepagesource_pzsetloadactivity__1347795375(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pyDeclarePagesDataSource").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("ObjOpen"));
                }
            }, ".pyDeclarePagesDataSource==ObjOpen")) {
                try {
                    actionProlog(runtime, "1", "When .pyDeclarePagesDataSource==ObjOpen", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyLoadActivity", pRef_2, myStepPage, "pxCallObjOpen", "sTN", false, true);
                        actionEpilog(runtime, "1.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.2", "Set param.paramList", null, null, runtimeTraceContext);
                        tools.putParamValue("paramList", PropertyInfo.TYPE_TEXT, "pyClassKeyValueList");
                        actionEpilog(runtime, "1.2", "Set param.paramList", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_9) {
                    runtimeTraceContext.setError(e_9);
                    throw e_9;
                } finally {
                    actionEpilog(runtime, "1", "When .pyDeclarePagesDataSource==ObjOpen", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("ReportDefinition"));
                }
            }, ".pyDeclarePagesDataSource==ReportDefinition")) {
                try {
                    actionProlog(runtime, "2", "Otherwise When .pyDeclarePagesDataSource==ReportDefinition", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyLoadActivity", pRef_2, myStepPage, "pxCallRetrieveReportData", "sTN", false, true);
                        actionEpilog(runtime, "2.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.2", "Set param.paramList", null, null, runtimeTraceContext);
                        tools.putParamValue("paramList", PropertyInfo.TYPE_TEXT, "pyActivityParams");
                        actionEpilog(runtime, "2.2", "Set param.paramList", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_8) {
                    runtimeTraceContext.setError(e_8);
                    throw e_8;
                } finally {
                    actionEpilog(runtime, "2", "Otherwise When .pyDeclarePagesDataSource==ReportDefinition", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("DataPage"));
                }
            }, ".pyDeclarePagesDataSource==DataPage")) {
                try {
                    actionProlog(runtime, "3", "Otherwise When .pyDeclarePagesDataSource==DataPage", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "3.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyLoadActivity", pRef_2, myStepPage, "pxCallDeclarePage", "sTN", false, true);
                        actionEpilog(runtime, "3.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        actionProlog(runtime, "3.2", "Set param.paramList", null, null, runtimeTraceContext);
                        tools.putParamValue("paramList", PropertyInfo.TYPE_TEXT, "pyDTParamList");
                        actionEpilog(runtime, "3.2", "Set param.paramList", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_7) {
                    runtimeTraceContext.setError(e_7);
                    throw e_7;
                } finally {
                    actionEpilog(runtime, "3", "Otherwise When .pyDeclarePagesDataSource==DataPage", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("Connector"));
                }
            }, ".pyDeclarePagesDataSource==Connector")) {
                try {
                    actionProlog(runtime, "4", "Otherwise When .pyDeclarePagesDataSource==Connector", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "4.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyLoadActivity", pRef_2, myStepPage, "pxCallConnector", "sTN", false, true);
                        actionEpilog(runtime, "4.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_6) {
                    runtimeTraceContext.setError(e_6);
                    throw e_6;
                } finally {
                    actionEpilog(runtime, "4", "Otherwise When .pyDeclarePagesDataSource==Connector", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("DataTransform"));
                }
            }, ".pyDeclarePagesDataSource==DataTransform")) {
                try {
                    actionProlog(runtime, "5", "Otherwise When .pyDeclarePagesDataSource==DataTransform", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "5.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyLoadActivity", pRef_2, myStepPage, "pxCallDataTransform", "sTN", false, true);
                        actionEpilog(runtime, "5.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        actionProlog(runtime, "5.2", "Set param.paramList", null, null, runtimeTraceContext);
                        tools.putParamValue("paramList", PropertyInfo.TYPE_TEXT, "pyDTParamList");
                        actionEpilog(runtime, "5.2", "Set param.paramList", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_5) {
                    runtimeTraceContext.setError(e_5);
                    throw e_5;
                } finally {
                    actionEpilog(runtime, "5", "Otherwise When .pyDeclarePagesDataSource==DataTransform", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("LoadActivity"));
                }
            }, ".pyDeclarePagesDataSource==LoadActivity")) {
                try {
                    actionProlog(runtime, "6", "Otherwise When .pyDeclarePagesDataSource==LoadActivity", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "6.1", "Set param.paramList", null, null, runtimeTraceContext);
                        tools.putParamValue("paramList", PropertyInfo.TYPE_TEXT, "pyActivityParams");
                        actionEpilog(runtime, "6.1", "Set param.paramList", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_4) {
                    runtimeTraceContext.setError(e_4);
                    throw e_4;
                } finally {
                    actionEpilog(runtime, "6", "Otherwise When .pyDeclarePagesDataSource==LoadActivity", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("RoboticAutomation"));
                }
            }, ".pyDeclarePagesDataSource==RoboticAutomation")) {
                try {
                    actionProlog(runtime, "7", "Otherwise When .pyDeclarePagesDataSource==RoboticAutomation", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "7.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyLoadActivity", pRef_2, myStepPage, "pxCallRoboticAutomation", "sTN", false, true);
                        actionEpilog(runtime, "7.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "7", "Otherwise When .pyDeclarePagesDataSource==RoboticAutomation", null, null, runtimeTraceContext);
                }
            } else if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("RoboticDesktopAutomation"));
                }
            }, ".pyDeclarePagesDataSource==RoboticDesktopAutomation")) {
                try {
                    actionProlog(runtime, "8", "Otherwise When .pyDeclarePagesDataSource==RoboticDesktopAutomation", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "8.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyLoadActivity", pRef_2, myStepPage, "pxCallRoboticDesktopAutomation", "sTN", false, true);
                        actionEpilog(runtime, "8.1", "Set .pyLoadActivity", null, null, runtimeTraceContext);
                        actionProlog(runtime, "8.2", "Set .pyPassCurrentParamPageForActivity", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyPassCurrentParamPageForActivity", pRef_3, myStepPage, true, "sSN", false, true);
                        actionEpilog(runtime, "8.2", "Set .pyPassCurrentParamPageForActivity", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "8", "Otherwise When .pyDeclarePagesDataSource==RoboticDesktopAutomation", null, null, runtimeTraceContext);
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
