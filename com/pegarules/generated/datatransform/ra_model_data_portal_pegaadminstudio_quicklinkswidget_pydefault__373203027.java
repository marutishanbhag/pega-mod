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

public class ra_model_data_portal_pegaadminstudio_quicklinkswidget_pydefault__373203027 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_3 = new String[] { "", "", "pyExternalLogsLink", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyPDCLink", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL DATA-PORTAL-PEGAADMINSTUDIO-QUICKLINKSWIDGET PYDEFAULT #20190710T092723.899 GMT", "Data-Portal-PegaAdminStudio-QuickLinksWidget pyDefault", "Pega-Desktop", "08-04-01", "20190710T092723.899 GMT");

    public ra_model_data_portal_pegaadminstudio_quicklinkswidget_pydefault__373203027(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pyPDCLink").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().scalarProperty("pxExternalLogURL").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyPDCLink", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyPDCLink", pRef_1, myStepPage, pega.<String>resolveMethodCall("getDataSystemSetting--(String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-Engine", "prconfig/pdcconfig/altSOAPURL/default" }), "sTN", false, true);
            actionEpilog(runtime, "1", "Set .pyPDCLink", null, null, runtimeTraceContext);
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (!(scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
                }
            }, ".pyPDCLink!= ")) {
                try {
                    actionProlog(runtime, "2", "When .pyPDCLink!= ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set .pyPDCLink", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyPDCLink", pRef_1, myStepPage, pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, null, new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "PRSOAPServlet", "PRServlet" }), "sTN", false, true);
                        actionEpilog(runtime, "2.1", "Set .pyPDCLink", null, null, runtimeTraceContext);
                        actionProlog(runtime, "2.2", "Set .pyPDCLink", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyPDCLink", pRef_1, myStepPage, pega.<String>resolveMethodCall("replaceAll--(String,String,String)", "replaceAll", null, null, new Object[] { scalarValueQuery_2.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT), "/SOAP/PegaAES/Events", "/!STANDARD" }), "sTN", false, true);
                        actionEpilog(runtime, "2.2", "Set .pyPDCLink", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "2", "When .pyPDCLink!= ", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "3", "Otherwise ", null, null, runtimeTraceContext);
                    {
                    }
                } catch (Exception e_3) {
                    runtimeTraceContext.setError(e_3);
                    throw e_3;
                } finally {
                    actionEpilog(runtime, "3", "Otherwise ", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "4", "Set .pyExternalLogsLink", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyExternalLogsLink", pRef_3, myStepPage, scalarValueQuery_4.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT), "sTN", false, true);
            actionEpilog(runtime, "4", "Set .pyExternalLogsLink", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
