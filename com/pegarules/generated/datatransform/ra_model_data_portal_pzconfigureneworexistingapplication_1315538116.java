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

public class ra_model_data_portal_pzconfigureneworexistingapplication_1315538116 extends AbstractDataTransform {

    private final RuleHandle rule0;

    private static final String [] pRef_2 = new String[] { "", "", "pyShowDoneButton", "" };

    private static final String [] pRef_3 = new String[] { "", "", "pyHideSwitchAppButton", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyConfiguringCurrentApplication", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL DATA-PORTAL PZCONFIGURENEWOREXISTINGAPPLICATION #20210927T131613.181 GMT", "Data-Portal pzConfigureNewOrExistingApplication", "Pega-Desktop", "08-07-01", "20210927T150940.438 GMT");

    public ra_model_data_portal_pzconfigureneworexistingapplication_1315538116(final Loadtime loadtime) {
        super(ruleTracer, true);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZISAPPLICATIONSETUPUSER", "pzIsApplicationSetupUser");
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Remove D_pzBuildApplication", null, null, runtimeTraceContext);
            pega.removeDataPage("D_pzBuildApplication");
            actionEpilog(runtime, "1", "Remove D_pzBuildApplication", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Set D_pzBuildApplication.pyConfiguringCurrentApplication", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pyConfiguringCurrentApplication", pRef_1, pega.findPageWithException("D_pzBuildApplication", "PegaAccel-Task-BuildApplication"), tools.getParamValue("ConfigureCurrentApp"), "sSN", false, true);
            actionEpilog(runtime, "2", "Set D_pzBuildApplication.pyConfiguringCurrentApplication", null, null, runtimeTraceContext);
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = runtime.safeFindPage("D_pzBuildApplication", "PegaAccel-Task-BuildApplication");
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("PegaAccel-Task-BuildApplication", null, myStepPage, false, false);
                actionProlog(runtime, "3", "Update Page D_pzBuildApplication", sourcePage_1, myStepPage, runtimeTraceContext);
                ParameterPage newParams_3_1 = runtime.parameterPageConstructor(null, null);
                {
                    actionProlog(runtime, "3.1", "Apply Data Transform pzResetAdvancedApplicationSettings", null, null, runtimeTraceContext);
                    pega.applyModel(myStepPage, "Data-Portal", newParams_3_1, "pzResetAdvancedApplicationSettings");
                    actionEpilog(runtime, "3.1", "Apply Data Transform pzResetAdvancedApplicationSettings", null, null, runtimeTraceContext);
                }
                actionProlog(runtime, "3.2", "Set .pyShowDoneButton", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyShowDoneButton", pRef_2, myStepPage, pega.evaluateWithPage(sourcePage_1, new EvaluateFunction<Boolean>() {

                    public Boolean apply(ClipboardPage myStepPage) {
                        return ((!ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.NONE)));
                    }
                }), "sSN", false, true);
                actionEpilog(runtime, "3.2", "Set .pyShowDoneButton", sourcePage_1, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "3.3", "Set .pyHideSwitchAppButton", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyHideSwitchAppButton", pRef_3, myStepPage, false, "sSN", false, true);
                actionEpilog(runtime, "3.3", "Set .pyHideSwitchAppButton", sourcePage_1, myStepPage, runtimeTraceContext);
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "3", "Update Page D_pzBuildApplication", sourcePage_1, myStepPage, runtimeTraceContext);
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
