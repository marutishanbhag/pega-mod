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

public class ra_model_embed_stage_pzsetflowmessagesstageinner__886888648 extends AbstractDataTransform {

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-STAGE PZSETFLOWMESSAGESSTAGEINNER #20200520T133429.596 GMT", "Embed-Stage pzSetFlowMessagesStageInner", "Pega-ProcessArchitect", "08-05-01", "20200520T133429.596 GMT");

    public ra_model_embed_stage_pzsetflowmessagesstageinner__886888648(final Loadtime loadtime) {
        super(ruleTracer, true);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().scalarProperty("pyStageName").buildScalarValueQuery();
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Set Param.StageName", null, null, runtimeTraceContext);
            tools.putParamValue("StageName", PropertyInfo.TYPE_TEXT, scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
            actionEpilog(runtime, "1", "Set Param.StageName", null, null, runtimeTraceContext);
            ClipboardPage tmp_1 = myStepPage;
            PageIterator iter_1 = runtime.createIterator(myStepPage.getProperty("pyProcesses"));
            try {
                int currentLoopOffset_1 = 0;
                actionProlog(runtime, "2", "For Each Page In .pyProcesses", null, iter_1.getSource(), runtimeTraceContext);
                while (iter_1.hasNext()) {
                    currentLoopOffset_1++;
                    pega.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset_1));
                    ClipboardPage currentExp_1 = iter_1.next();
                    {
                        ClipboardPage sourcePage_1 = currentExp_1;
                        ClipboardPage tmp_2 = myStepPage;
                        myStepPage = currentExp_1;
                        PRStackFrame stackFrame_1 = null;
                        try {
                            stackFrame_1 = pega.pushStackFrame("Embed-StageProcess", null, myStepPage, false, false);
                            actionProlog(runtime, "2.1", "Apply Data Transform pzSetFlowMessagesProcessInner", null, null, runtimeTraceContext);
                            pega.applyModel(myStepPage, "Embed-Stage", params, "pzSetFlowMessagesProcessInner");
                            actionEpilog(runtime, "2.1", "Apply Data Transform pzSetFlowMessagesProcessInner", null, null, runtimeTraceContext);
                        } catch (Exception e_3) {
                            runtimeTraceContext.setError(e_3);
                            throw e_3;
                        } finally {
                            pega.popStackFrameAndReturnStepPage(stackFrame_1);
                            myStepPage = tmp_2;
                        }
                    }
                }
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "2", "For Each Page In .pyProcesses", null, iter_1.getSource(), runtimeTraceContext);
                myStepPage = tmp_1;
            }
            ClipboardPage tmp_3 = myStepPage;
            PageIterator iter_2 = runtime.createIterator(myStepPage.getProperty("pyOptionalProcesses"));
            try {
                int currentLoopOffset_2 = 0;
                actionProlog(runtime, "3", "For Each Page In .pyOptionalProcesses", null, iter_2.getSource(), runtimeTraceContext);
                while (iter_2.hasNext()) {
                    currentLoopOffset_2++;
                    pega.putParamValue("pyForEachCount", Integer.toString(currentLoopOffset_2));
                    ClipboardPage currentExp_2 = iter_2.next();
                    {
                        ClipboardPage sourcePage_2 = currentExp_2;
                        ClipboardPage tmp_4 = myStepPage;
                        myStepPage = currentExp_2;
                        PRStackFrame stackFrame_2 = null;
                        try {
                            stackFrame_2 = pega.pushStackFrame("Embed-StageProcess", null, myStepPage, false, false);
                            actionProlog(runtime, "3.1", "Apply Data Transform pzSetFlowMessagesProcessInner", null, null, runtimeTraceContext);
                            pega.applyModel(myStepPage, "Embed-Stage", params, "pzSetFlowMessagesProcessInner");
                            actionEpilog(runtime, "3.1", "Apply Data Transform pzSetFlowMessagesProcessInner", null, null, runtimeTraceContext);
                        } catch (Exception e_5) {
                            runtimeTraceContext.setError(e_5);
                            throw e_5;
                        } finally {
                            pega.popStackFrameAndReturnStepPage(stackFrame_2);
                            myStepPage = tmp_4;
                        }
                    }
                }
            } catch (Exception e_4) {
                runtimeTraceContext.setError(e_4);
                throw e_4;
            } finally {
                actionEpilog(runtime, "3", "For Each Page In .pyOptionalProcesses", null, iter_2.getSource(), runtimeTraceContext);
                myStepPage = tmp_3;
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
