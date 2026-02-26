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
import com.pega.platform.clipboard.query.ScalarValueQuery;
import com.pega.platform.clipboard.query.QueryBuilderFactory;

public class ra_when_data_portal_pxshowswitchappsmenu__1591099220 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_1;

    private final RuleHandle rule0;

    private static final String [] pRef_2 = new String[] { "", "", "pxSecuritySnapshot", "", "pxAvailableApps", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN DATA-PORTAL PXSHOWSWITCHAPPSMENU #20180713T135547.021 GMT", "Data-Portal pxShowSwitchAppsMenu", "Pega-Desktop", "08-01-01", "20180713T135547.021 GMT");

    public ra_when_data_portal_pxshowswitchappsmenu__1591099220(final Loadtime loadtime) {
        super(ruleTracer);
        final RuleHandleFactory ruleHandleFactory = loadtime.get(RuleHandleFactory.class);
        rule0 = ruleHandleFactory.create("Rule-Obj-When", "!PZISPEGAEXPRESS", "pzIsPegaExpress");
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pxThreadName").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final RuleDispatcher ruleDispatcher = runtime.get(RuleDispatcher.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (((ruleDispatcher.invokeBoolean(runtime, rule0, myStepPage, params, Aspect.When, StackBehavior.PUSH_PRIMARY_IF_NOT_NULL) || (pega.<Boolean>resolveMethodCall("notEqualsIgnoreCase--(String,String)", "notEqualsIgnoreCase", "Pega-RULES", "String", new Object[] { scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("pxThread", "Code-Pega-Thread"), ImmutablePropertyInfo.TYPE_TEXT), "OpenPortal" })).booleanValue()) && (pega.<Boolean>resolveMethodCall("pxPageListLengthCompare--(ClipboardProperty,String,int)", "pxPageListLengthCompare", "Pega-RULES", "Page", new Object[] { pega.getViaPropRef(".pxSecuritySnapshot.pxAvailableApps", pRef_2, pega.findPageWithException("pxThread", "Code-Pega-Thread"), false, false), ">", 1 })).booleanValue()) && (pega.<Boolean>resolveMethodCall("pzevaluateWhenfalse--(String)", "pzevaluateWhenfalse", "Pega-RULES", "ExpressionEvaluators", new Object[] { "pzIsOfflineEnabled" })).booleanValue());
    }
}
