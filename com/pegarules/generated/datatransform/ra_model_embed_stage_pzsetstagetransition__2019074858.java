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

public class ra_model_embed_stage_pzsetstagetransition__2019074858 extends AbstractDataTransform {

    private static final String [] pRef_2 = new String[] { "", "", "pxResults", "<last>", "pyPromptValue", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pxResults", "<append>", "pyStandardValue", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL EMBED-STAGE PZSETSTAGETRANSITION #20180713T141238.978 GMT", "Embed-Stage pzSetStageTransition", "Pega-ProcessArchitect", "08-01-01", "20180713T141238.978 GMT");

    public ra_model_embed_stage_pzsetstagetransition__2019074858(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (pega.<Boolean>resolveMethodCall("contains--(String,String)", "contains", "Pega-RULES", "String", new Object[] { tools.getParamValue("StageReference"), "pyStages" })).booleanValue();
                }
            }, "@(Pega-RULES:String).contains(Param.StageReference,pyStages)")) {
                try {
                    actionProlog(runtime, "1", "When @(Pega-RULES:String).contains(Param.StageReference,pyStages)", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set D_pzGetStageTransitions.pxResults(<Append>).pyStandardValue", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pxResults(<append>).pyStandardValue", pRef_1, pega.findPageWithException("D_pzGetStageTransitions", "Embed-Stage"), "automatic", "sTN", false, true);
                        actionEpilog(runtime, "1.1", "Set D_pzGetStageTransitions.pxResults(<Append>).pyStandardValue", null, null, runtimeTraceContext);
                        actionProlog(runtime, "1.2", "Set D_pzGetStageTransitions.pxResults(<Last>).pyPromptValue", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pxResults(<last>).pyPromptValue", pRef_2, pega.findPageWithException("D_pzGetStageTransitions", "Embed-Stage"), "AutomaticallyMoveToNextStage", "sTN", false, true);
                        actionEpilog(runtime, "1.2", "Set D_pzGetStageTransitions.pxResults(<Last>).pyPromptValue", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "1", "When @(Pega-RULES:String).contains(Param.StageReference,pyStages)", null, null, runtimeTraceContext);
                }
            }
            actionProlog(runtime, "2", "Set D_pzGetStageTransitions.pxResults(<Append>).pyStandardValue", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyStandardValue", pRef_1, pega.findPageWithException("D_pzGetStageTransitions", "Embed-Stage"), "manual", "sTN", false, true);
            actionEpilog(runtime, "2", "Set D_pzGetStageTransitions.pxResults(<Append>).pyStandardValue", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set D_pzGetStageTransitions.pxResults(<Last>).pyPromptValue", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<last>).pyPromptValue", pRef_2, pega.findPageWithException("D_pzGetStageTransitions", "Embed-Stage"), "WaitForUserAction", "sTN", false, true);
            actionEpilog(runtime, "3", "Set D_pzGetStageTransitions.pxResults(<Last>).pyPromptValue", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set D_pzGetStageTransitions.pxResults(<Append>).pyStandardValue", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyStandardValue", pRef_1, pega.findPageWithException("D_pzGetStageTransitions", "Embed-Stage"), "resolution", "sTN", false, true);
            actionEpilog(runtime, "4", "Set D_pzGetStageTransitions.pxResults(<Append>).pyStandardValue", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set D_pzGetStageTransitions.pxResults(<Last>).pyPromptValue", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<last>).pyPromptValue", pRef_2, pega.findPageWithException("D_pzGetStageTransitions", "Embed-Stage"), "ResolveTheCase", "sTN", false, true);
            actionEpilog(runtime, "5", "Set D_pzGetStageTransitions.pxResults(<Last>).pyPromptValue", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
