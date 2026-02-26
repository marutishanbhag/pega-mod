package com.pegarules.generated.decisiontable;

import com.pega.platform.coreassemblers.decision.AbstractDecisionTable;
import java.util.List;
import com.pega.pegarules.priv.util.ExceptionDescriptor;
import java.util.Arrays;
import java.util.Collections;
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

public class ra_decision_pega_fields_pzispegapysystemfield_1572915737 extends AbstractDecisionTable {

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE PEGA-FIELDS PZISPEGAPYSYSTEMFIELD #20211213T193329.332 GMT", "Pega-Fields pzIsPegaPySystemField", "Pega-ProcessArchitect", "08-08-01", "20211213T193329.332 GMT");

    public ra_decision_pega_fields_pzispegapysystemfield_1572915737(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyPropertyName").buildScalarValueQuery();
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
        if ((var0.equals("pyEffortActual"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyEffortEstimate"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyElapsedStatusNew"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyElapsedStatusOpen"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyElapsedStatusPending"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyOwnerDivision"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyOwnerOrg"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyOwnerOrgUnit"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pySLAStartTime"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyResolvedTimestamp"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyResolvedDivision"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyResolvedOrg"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyResolvedOrgUnit"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyResolvedUserID"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pyResolvedUserWorkgroup"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pySLADeadline"))) {
            return String.valueOf(true);
        } else if ((var0.equals("pySLAGoal"))) {
            return String.valueOf(true);
        } else {
            return String.valueOf(false);
        }
    }
}
