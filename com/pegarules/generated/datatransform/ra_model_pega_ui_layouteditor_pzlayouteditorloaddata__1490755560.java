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

public class ra_model_pega_ui_layouteditor_pzlayouteditorloaddata__1490755560 extends AbstractDataTransform {

    private final PageQuery pageQuery_4;

    private static final String [] pRef_6 = new String[] { "", "", "pyStreamName", "" };

    private static final String [] pRef_5 = new String[] { "", "", "pyLabel", "" };

    private static final String [] pRef_2 = new String[] { "", "", "pySelectedFieldID", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pySelectedTab", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyWasPropertyPanelSubmitted", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-UI-LAYOUTEDITOR PZLAYOUTEDITORLOADDATA #20180713T133325.165 GMT", "Pega-UI-LayoutEditor pzLayoutEditorLoadData", "Pega-UIEngine", "08-01-01", "20180713T133325.165 GMT");

    public ra_model_pega_ui_layouteditor_pzlayouteditorloaddata__1490755560(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        pageQuery_4 = queryBuilderFactory.create().pageList("pyBreadcrumb", 1).buildPageQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set .pyWasPropertyPanelSubmitted", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyWasPropertyPanelSubmitted", pRef_1, myStepPage, false, "sSN", false, true);
            actionEpilog(runtime, "1", "Set .pyWasPropertyPanelSubmitted", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set .pySelectedFieldID", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySelectedFieldID", pRef_2, myStepPage, "", "sTN", false, true);
            actionEpilog(runtime, "2", "Set .pySelectedFieldID", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set .pySelectedTab", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pySelectedTab", pRef_3, myStepPage, "fields", "stN", false, true);
            actionEpilog(runtime, "3", "Set .pySelectedTab", null, null, runtimeTraceContext);
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = pageQuery_4.resolve(tools, myStepPage);
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("Rule-HTML-Section", null, myStepPage, false, false);
                actionProlog(runtime, "4", "Update Page .pyBreadcrumb(1)", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "4.1", "Set .pyLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyLabel", pRef_5, myStepPage, "Top", "sTN64", false, true);
                actionEpilog(runtime, "4.1", "Set .pyLabel", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "4.2", "Set .pyStreamName", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyStreamName", pRef_6, myStepPage, "allFields", "sIN", false, true);
                actionEpilog(runtime, "4.2", "Set .pyStreamName", sourcePage_1, myStepPage, runtimeTraceContext);
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "4", "Update Page .pyBreadcrumb(1)", sourcePage_1, myStepPage, runtimeTraceContext);
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
