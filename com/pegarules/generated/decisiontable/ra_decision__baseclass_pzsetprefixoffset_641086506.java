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

public class ra_decision__baseclass_pzsetprefixoffset_641086506 extends AbstractDecisionTable {

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE @BASECLASS PZSETPREFIXOFFSET #20180713T135044.630 GMT", "@baseclass pzSetPrefixOffset", "Pega-Desktop", "08-01-01", "20180713T135044.630 GMT");

    public ra_decision__baseclass_pzsetprefixoffset_641086506(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().page("pyRulePage").scalarProperty("pxObjClass").buildScalarValueQuery();
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
        if ((var0.equals("Data-Admin-Operator-ID"))) {
            return Integer.toString(((-1)));
        } else if ((var0.equals("Data-Admin-Operator-AccessGroup"))) {
            return Integer.toString(((-1)));
        } else if ((var0.equals("Rule-Application"))) {
            return Integer.toString(((-1)));
        } else if ((var0.equals("Rule-RuleSet-Name"))) {
            return Integer.toString(((-1)));
        } else if ((var0.equals("Rule-RuleSet-Version"))) {
            return Integer.toString(((-1)));
        } else if ((var0.equals("Rule-Obj-Class"))) {
            return Integer.toString(((-1)));
        } else if ((var0.equals("Rule-Declare-Expression"))) {
            return Integer.toString(((-1)));
        } else if ((var0.equals("Rule-Declare-Pages"))) {
            return Integer.toString(2);
        } else {
            return Integer.toString(0);
        }
    }
}
