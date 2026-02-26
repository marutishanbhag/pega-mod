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

public class ra_model_code_pega_list_pzsetflowmessages__387347717 extends AbstractDataTransform {

    private static final String [] pRef_1 = new String[] { "", "", "pxResultCount", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL CODE-PEGA-LIST PZSETFLOWMESSAGES #20200520T133429.584 GMT", "Code-Pega-List pzSetFlowMessages", "Pega-ProcessArchitect", "08-05-01", "20200520T133429.584 GMT");

    public ra_model_code_pega_list_pzsetflowmessages__387347717(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "CaseTypeStages" })).booleanValue();
                }
            }, "@PageExists(CaseTypeStages)")) {
                try {
                    actionProlog(runtime, "1", "When @PageExists(CaseTypeStages)", null, null, runtimeTraceContext);
                    {
                        ClipboardPage tmp_1 = myStepPage;
                        PageIterator iter_1 = runtime.createIterator(pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType").getProperty("pyStages"));
                        try {
                            int currentLoopOffset_1 = 0;
                            actionProlog(runtime, "1.1", "For Each Page In CaseTypeStages.pyStages", null, iter_1.getSource(), runtimeTraceContext);
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
                                        stackFrame_1 = pega.pushStackFrame("Embed-Stage", null, myStepPage, false, false);
                                        ParameterPage newParams_1_1_1 = runtime.parameterPageConstructor(null, null);
                                        {
                                            actionProlog(runtime, "1.1.1", "Apply Data Transform pzSetFlowMessagesStageInner", null, null, runtimeTraceContext);
                                            pega.applyModel(myStepPage, "Code-Pega-List", newParams_1_1_1, "pzSetFlowMessagesStageInner");
                                            actionEpilog(runtime, "1.1.1", "Apply Data Transform pzSetFlowMessagesStageInner", null, null, runtimeTraceContext);
                                        }
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
                            actionEpilog(runtime, "1.1", "For Each Page In CaseTypeStages.pyStages", null, iter_1.getSource(), runtimeTraceContext);
                            myStepPage = tmp_1;
                        }
                        ClipboardPage tmp_3 = myStepPage;
                        PageIterator iter_2 = runtime.createIterator(pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType").getProperty("pyAlternateStages"));
                        try {
                            int currentLoopOffset_2 = 0;
                            actionProlog(runtime, "1.2", "For Each Page In CaseTypeStages.pyAlternateStages", null, iter_2.getSource(), runtimeTraceContext);
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
                                        stackFrame_2 = pega.pushStackFrame("Embed-Stage", null, myStepPage, false, false);
                                        ParameterPage newParams_1_2_1 = runtime.parameterPageConstructor(null, null);
                                        {
                                            actionProlog(runtime, "1.2.1", "Apply Data Transform pzSetFlowMessagesStageInner", null, null, runtimeTraceContext);
                                            pega.applyModel(myStepPage, "Code-Pega-List", newParams_1_2_1, "pzSetFlowMessagesStageInner");
                                            actionEpilog(runtime, "1.2.1", "Apply Data Transform pzSetFlowMessagesStageInner", null, null, runtimeTraceContext);
                                        }
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
                            actionEpilog(runtime, "1.2", "For Each Page In CaseTypeStages.pyAlternateStages", null, iter_2.getSource(), runtimeTraceContext);
                            myStepPage = tmp_3;
                        }
                        actionProlog(runtime, "1.3", "Set Primary.pxResultCount", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pxResultCount", pRef_1, tools.getPrimaryPage(), (pega.<Integer>resolveMethodCall("SizeOfPropertyList--(ClipboardProperty)", "SizeOfPropertyList", null, null, new Object[] { tools.getPrimaryPage().getProperty("pxResults") })).intValue(), "sNY", false, true);
                        actionEpilog(runtime, "1.3", "Set Primary.pxResultCount", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_6) {
                    runtimeTraceContext.setError(e_6);
                    throw e_6;
                } finally {
                    actionEpilog(runtime, "1", "When @PageExists(CaseTypeStages)", null, null, runtimeTraceContext);
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
