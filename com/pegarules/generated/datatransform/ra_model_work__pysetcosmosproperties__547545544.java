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
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.QueryBuilderFactory;

public class ra_model_work__pysetcosmosproperties__547545544 extends AbstractDataTransform {

    private final PageQuery pageQuery_1;

    private static final String [] pRef_6 = new String[] { "", "", "pyShowCaseIcon", "" };

    private static final String [] pRef_7 = new String[] { "", "", "pyShowCaseTypeLabel", "" };

    private static final String [] pRef_4 = new String[] { "", "", "pyToDoWidgetType", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyPostCreateCaseNav", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pyShowCaseID", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyStagesStepsWidgetType", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL WORK- PYSETCOSMOSPROPERTIES #20210211T083457.621 GMT", "Work- pySetCosmosProperties", "Pega-EndUserUI", "08-06-01", "20210211T083457.621 GMT");

    public ra_model_work__pysetcosmosproperties__547545544(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        pageQuery_1 = queryBuilderFactory.create().page("pyCosmosSettings").buildPageQuery();
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
                stackFrame_1 = pega.pushStackFrame("Pega-Case-Settings-Cosmos", null, myStepPage, false, false);
                actionProlog(runtime, "1", "Update Page .pyCosmosSettings", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.1", "Set .pyShowCaseID", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyShowCaseID", pRef_2, myStepPage, true, "sSN", false, true);
                actionEpilog(runtime, "1.1", "Set .pyShowCaseID", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.2", "Set .pyStagesStepsWidgetType", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyStagesStepsWidgetType", pRef_3, myStepPage, "overlay", "stN", false, true);
                actionEpilog(runtime, "1.2", "Set .pyStagesStepsWidgetType", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.3", "Set .pyToDoWidgetType", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyToDoWidgetType", pRef_4, myStepPage, "flat", "stN", false, true);
                actionEpilog(runtime, "1.3", "Set .pyToDoWidgetType", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.4", "Set .pyPostCreateCaseNav", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyPostCreateCaseNav", pRef_5, myStepPage, "open_case", "stN", false, true);
                actionEpilog(runtime, "1.4", "Set .pyPostCreateCaseNav", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.5", "Set .pyShowCaseIcon", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyShowCaseIcon", pRef_6, myStepPage, true, "sSN", false, true);
                actionEpilog(runtime, "1.5", "Set .pyShowCaseIcon", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.6", "Set .pyShowCaseTypeLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyShowCaseTypeLabel", pRef_7, myStepPage, false, "sSN", false, true);
                actionEpilog(runtime, "1.6", "Set .pyShowCaseTypeLabel", sourcePage_1, myStepPage, runtimeTraceContext);
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "1", "Update Page .pyCosmosSettings", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_1);
                myStepPage = tmp_1;
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
