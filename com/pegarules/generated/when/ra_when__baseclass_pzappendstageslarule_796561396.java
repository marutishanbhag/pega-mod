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

public class ra_when__baseclass_pzappendstageslarule_796561396 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN @BASECLASS PZAPPENDSTAGESLARULE #20190318T071039.001 GMT", "@baseclass pzAppendStageSLARule", "Pega-ProcessArchitect", "08-03-01", "20190318T071039.001 GMT");

    public ra_when__baseclass_pzappendstageslarule_796561396(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyClassName").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return (pega.<Boolean>resolveMethodCall("pzAddToRRDataPage--(ClipboardPage,String,String,String,String)", "pzAddToRRDataPage", null, "Utilities", new Object[] { pega.findDataPage("D_pzGetRelRecordList", false, "RecordType", "Rule-Obj-ServiceLevel", "ClassName", scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT)), "pyStageSLA", "pyServiceLevelName", "pyLabel", scalarValueQuery_1.resolveToString(tools, pega.findPageWithException("CaseTypeStages", "Rule-Obj-CaseType"), ImmutablePropertyInfo.TYPE_TEXT) })).booleanValue();
    }
}
