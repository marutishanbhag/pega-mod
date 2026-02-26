package com.pegarules.generated.when;

import com.pega.platform.coreassemblers.when.AbstractWhen;
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

public class ra_when_data_systemoperations_clustermanagement_pzhaenabled__116355606 extends AbstractWhen {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN DATA-SYSTEMOPERATIONS-CLUSTERMANAGEMENT PZHAENABLED #20190829T120154.927 GMT", "Data-SystemOperations-ClusterManagement pzHAEnabled", "Pega-SystemOperations", "08-04-01", "20190829T151510.853 GMT");

    public ra_when_data_systemoperations_clustermanagement_pzhaenabled__116355606(final Loadtime loadtime) {
        super(ruleTracer);
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return ((pega.<Boolean>resolveMethodCall("equalsIgnoreCase--(String,String)", "equalsIgnoreCase", "Pega-RULES", "String", new Object[] { pega.<String>resolveMethodCall("getDataSystemSetting--(String,String,String)", "getDataSystemSetting", null, null, new Object[] { "Pega-Engine", "session/ha/Enabled", "true" }), String.valueOf(true) })).booleanValue() && FUAUtil.compareTwoValues(String.valueOf((pega.<Boolean>resolveMethodCall("HavePrivilege--(Activity,String,String,Page)", "HavePrivilege", null, null, new Object[] { tools, "pxHighAvailabilityAdmin", "@baseclass", null })).booleanValue()), FUAUtil.C2VOp.EQ, String.valueOf(true)));
    }
}
