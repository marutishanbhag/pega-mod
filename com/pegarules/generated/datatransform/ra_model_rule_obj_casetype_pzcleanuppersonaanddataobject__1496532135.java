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

public class ra_model_rule_obj_casetype_pzcleanuppersonaanddataobject__1496532135 extends AbstractDataTransform {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL RULE-OBJ-CASETYPE PZCLEANUPPERSONAANDDATAOBJECT #20200511T122818.247 GMT", "Rule-Obj-CaseType pzCleanupPersonaAndDataObject", "Pega-ProcessArchitect", "08-05-01", "20200511T122818.247 GMT");

    public ra_model_rule_obj_casetype_pzcleanuppersonaanddataobject__1496532135(final Loadtime loadtime) {
        super(ruleTracer, false);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Remove D_pxPersonas", null, null, runtimeTraceContext);
            pega.removeDataPage("D_pxPersonas");
            actionEpilog(runtime, "1", "Remove D_pxPersonas", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Remove D_pxDataObjects", null, null, runtimeTraceContext);
            pega.removeDataPage("D_pxDataObjects");
            actionEpilog(runtime, "2", "Remove D_pxDataObjects", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Remove D_pzAppViews", null, null, runtimeTraceContext);
            pega.removeDataPage("D_pzAppViews");
            actionEpilog(runtime, "3", "Remove D_pzAppViews", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Remove D_pzAvailableAppViewTypes", null, null, runtimeTraceContext);
            pega.removeDataPage("D_pzAvailableAppViewTypes");
            actionEpilog(runtime, "4", "Remove D_pzAvailableAppViewTypes", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Remove D_pzCaseChannels", null, null, runtimeTraceContext);
            pega.removeDataPage("D_pzCaseChannels");
            actionEpilog(runtime, "5", "Remove D_pzCaseChannels", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set Param.RemovePersona", null, null, runtimeTraceContext);
            tools.putParamValue("RemovePersona", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pzDeleteAllInstancesOfDeclarativePage--(PublicAPI,String)", "pzDeleteAllInstancesOfDeclarativePage", null, null, new Object[] { tools, "D_pzGetAttachmentCategories" })).booleanValue()));
            actionEpilog(runtime, "6", "Set Param.RemovePersona", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set Param.RemovePersona", null, null, runtimeTraceContext);
            tools.putParamValue("RemovePersona", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pzDeleteAllInstancesOfDeclarativePage--(PublicAPI,String)", "pzDeleteAllInstancesOfDeclarativePage", null, null, new Object[] { tools, "D_pxPersonaDetails" })).booleanValue()));
            actionEpilog(runtime, "7", "Set Param.RemovePersona", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set Param.RemoveChannel", null, null, runtimeTraceContext);
            tools.putParamValue("RemoveChannel", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pzDeleteAllInstancesOfDeclarativePage--(PublicAPI,String)", "pzDeleteAllInstancesOfDeclarativePage", null, null, new Object[] { tools, "D_pzChannelsByType" })).booleanValue()));
            actionEpilog(runtime, "8", "Set Param.RemoveChannel", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Set Param.RemoveChannel", null, null, runtimeTraceContext);
            tools.putParamValue("RemoveChannel", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pzDeleteAllInstancesOfDeclarativePage--(PublicAPI,String)", "pzDeleteAllInstancesOfDeclarativePage", null, null, new Object[] { tools, "D_pzChannelDetails" })).booleanValue()));
            actionEpilog(runtime, "9", "Set Param.RemoveChannel", null, null, runtimeTraceContext);
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
