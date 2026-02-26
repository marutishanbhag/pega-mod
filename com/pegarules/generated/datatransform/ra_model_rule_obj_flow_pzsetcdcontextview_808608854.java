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
import com.pega.platform.clipboard.query.PropertyQuery;

public class ra_model_rule_obj_flow_pzsetcdcontextview_808608854 extends AbstractDataTransform {

    private final PropertyQuery propertyQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private static final String [] pRef_4 = new String[] { "", "", "pzIsProcessModelerView", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyPageName", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ-FLOW PZSETCDCONTEXTVIEW #20180713T141246.453 GMT", "Rule-Obj-Flow pzSetCDContextView", "Pega-ProcessArchitect", "08-01-01", "20180713T141246.453 GMT");

    public ra_model_rule_obj_flow_pzsetcdcontextview_808608854(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_2 = queryBuilderFactory.create().scalarProperty("pzProcessPageRefForPMView").buildScalarValueQuery();
        propertyQuery_3 = queryBuilderFactory.create().scalarProperty("pzProcessPageRefForPMView").buildPropertyQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PageUtility pageUtility = runtime.get(PageUtility.class);
        final PropertyUtility propertyUtility = runtime.get(PropertyUtility.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = runtime.safeFindPage("CaseTypeStages", "Rule-Obj-CaseType");
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("Rule-Obj-CaseType", null, myStepPage, false, false);
                actionProlog(runtime, "1", "Update Page CaseTypeStages", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.1", "Set .pyPageName", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyPageName", pRef_1, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<String>() {

                    public String apply(ClipboardPage myStepPage) {
                        return scalarValueQuery_2.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT);
                    }
                }), "sTN", false, true);
                actionEpilog(runtime, "1.1", "Set .pyPageName", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "1.2", "Remove .pzProcessPageRefForPMView", null, null, runtimeTraceContext);
                {
                    ClipboardProperty remove_1 = propertyQuery_3.resolve(tools, myStepPage);
                    propertyUtility.removePropertyFromClipboard(remove_1);
                }
                actionEpilog(runtime, "1.2", "Remove .pzProcessPageRefForPMView", null, null, runtimeTraceContext);
                actionProlog(runtime, "1.3", "Set .pzIsProcessModelerView", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pzIsProcessModelerView", pRef_4, myStepPage, false, "sSN", false, true);
                actionEpilog(runtime, "1.3", "Set .pzIsProcessModelerView", sourcePage_1, myStepPage, runtimeTraceContext);
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "1", "Update Page CaseTypeStages", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_1);
                myStepPage = tmp_1;
            }
            actionProlog(runtime, "2", "Remove SelectedFlowReferences", null, null, runtimeTraceContext);
            {
                ClipboardPage remove_2 = tools.findPage("SelectedFlowReferences");
                pageUtility.removePageFromClipboard(remove_2);
            }
            actionEpilog(runtime, "2", "Remove SelectedFlowReferences", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
