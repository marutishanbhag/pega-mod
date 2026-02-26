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

public class ra_model_data_mo_pzsetdirtyflag__1178408230 extends AbstractDataTransform {

    private static final String [] pRef_2 = new String[] { "Top", "", "pyIsDirty", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyConversationEditor", "", "pyConversationFlow", "", "pyIsDirty", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL DATA-MO PZSETDIRTYFLAG #20210205T122409.297 GMT", "Data-MO pzSetDirtyFlag", "Pega-ProcessArchitect", "08-06-01", "20210205T122409.297 GMT");

    public ra_model_data_mo_pzsetdirtyflag__1178408230(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (pega.<Boolean>resolveMethodCall("startsWith--(String,String)", "startsWith", null, null, new Object[] { myStepPage.getString("Top.pxObjClass"), "Data-Channel-Configuration" })).booleanValue();
                }
            }, "@startsWith(Top.pxObjClass, Data-Channel-Configuration)")) {
                try {
                    actionProlog(runtime, "1", "When @startsWith(Top.pxObjClass, Data-Channel-Configuration)", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "1.1", "Set ChannelConfig.pyConversationEditor.pyConversationFlow.pyIsDirty", null, null, runtimeTraceContext);
                        pega.setViaPropRef(".pyConversationEditor.pyConversationFlow.pyIsDirty", pRef_1, pega.findPageWithException("ChannelConfig", "Data-Channel-Configuration"), true, "sSN", false, true);
                        actionEpilog(runtime, "1.1", "Set ChannelConfig.pyConversationEditor.pyConversationFlow.pyIsDirty", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "1", "When @startsWith(Top.pxObjClass, Data-Channel-Configuration)", null, null, runtimeTraceContext);
                }
            } else {
                try {
                    actionProlog(runtime, "2", "Otherwise ", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "2.1", "Set Top.pyIsDirty", null, null, runtimeTraceContext);
                        pega.setViaPropRef("Top.pyIsDirty", pRef_2, myStepPage, true, "sSN", false, true);
                        actionEpilog(runtime, "2.1", "Set Top.pyIsDirty", null, null, runtimeTraceContext);
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
