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

public class ra_model_pega_ext_expexplorer_newappwizard_pzsetuppages_131290866 extends AbstractDataTransform {

    private static final String [] pRef_2 = new String[] { "", "", "pyHideSwitchAppButton", "" };

    private static final String [] pRef_1 = new String[] { "", "", "pyShowDoneButton", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL PEGA-EXT-EXPEXPLORER-NEWAPPWIZARD PZSETUPPAGES #20210927T131612.925 GMT", "Pega-Ext-ExpExplorer-NewAppWizard pzSetupPages", "Pega-EndUserUI", "08-07-01", "20210927T150939.892 GMT");

    public ra_model_pega_ext_expexplorer_newappwizard_pzsetuppages_131290866(final Loadtime loadtime) {
        super(ruleTracer, true);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            ClipboardPage sourcePage_1 = myStepPage;
            ClipboardPage tmp_1 = myStepPage;
            myStepPage = runtime.safeFindPage("D_PortalContextGlobal", "Data-Portal");
            PRStackFrame stackFrame_1 = null;
            try {
                stackFrame_1 = pega.pushStackFrame("Data-Portal", null, myStepPage, false, false);
                actionProlog(runtime, "1", "Update Page D_PortalContextGlobal", sourcePage_1, myStepPage, runtimeTraceContext);
                ParameterPage newParams_1_1 = runtime.parameterPageConstructor(null, null);
                {
                    actionProlog(runtime, "1.1", "Apply Data Transform pzConfigureNewOrExistingApplication", null, null, runtimeTraceContext);
                    pega.applyModel(myStepPage, "Pega-Ext-ExpExplorer-NewAppWizard", newParams_1_1, "pzConfigureNewOrExistingApplication");
                    actionEpilog(runtime, "1.1", "Apply Data Transform pzConfigureNewOrExistingApplication", null, null, runtimeTraceContext);
                }
            } catch (Exception e_2) {
                runtimeTraceContext.setError(e_2);
                throw e_2;
            } finally {
                actionEpilog(runtime, "1", "Update Page D_PortalContextGlobal", sourcePage_1, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_1);
                myStepPage = tmp_1;
            }
            ClipboardPage sourcePage_2 = myStepPage;
            ClipboardPage tmp_2 = myStepPage;
            myStepPage = runtime.safeFindPage("D_pzBuildApplication", "PegaAccel-Task-BuildApplication");
            PRStackFrame stackFrame_2 = null;
            try {
                stackFrame_2 = pega.pushStackFrame("PegaAccel-Task-BuildApplication", null, myStepPage, false, false);
                actionProlog(runtime, "2", "Update Page D_pzBuildApplication", sourcePage_2, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "2.1", "Set .pyShowDoneButton", sourcePage_2, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyShowDoneButton", pRef_1, myStepPage, false, "sSN", false, true);
                actionEpilog(runtime, "2.1", "Set .pyShowDoneButton", sourcePage_2, myStepPage, runtimeTraceContext);
                actionProlog(runtime, "2.2", "Set .pyHideSwitchAppButton", sourcePage_2, myStepPage, runtimeTraceContext);
                pega.setViaPropRef(".pyHideSwitchAppButton", pRef_2, myStepPage, false, "sSN", false, true);
                actionEpilog(runtime, "2.2", "Set .pyHideSwitchAppButton", sourcePage_2, myStepPage, runtimeTraceContext);
            } catch (Exception e_3) {
                runtimeTraceContext.setError(e_3);
                throw e_3;
            } finally {
                actionEpilog(runtime, "2", "Update Page D_pzBuildApplication", sourcePage_2, myStepPage, runtimeTraceContext);
                pega.popStackFrameAndReturnStepPage(stackFrame_2);
                myStepPage = tmp_2;
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
