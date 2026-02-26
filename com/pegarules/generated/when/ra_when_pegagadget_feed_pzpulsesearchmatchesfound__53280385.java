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

public class ra_when_pegagadget_feed_pzpulsesearchmatchesfound__53280385 extends AbstractWhen {

    private final ScalarValueQuery scalarValueQuery_5;

    private final ScalarValueQuery scalarValueQuery_4;

    private final ScalarValueQuery scalarValueQuery_3;

    private final ScalarValueQuery scalarValueQuery_2;

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-WHEN PEGAGADGET-FEED PZPULSESEARCHMATCHESFOUND #20200409T055900.918 GMT", "PegaGadget-Feed pzPulseSearchMatchesFound", "Pega-Social", "08-05-01", "20200506T075455.904 GMT");

    public ra_when_pegagadget_feed_pzpulsesearchmatchesfound__53280385(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyID").buildScalarValueQuery();
        scalarValueQuery_2 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pySearchText").buildScalarValueQuery();
        scalarValueQuery_3 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pySearchFromDateTime").buildScalarValueQuery();
        scalarValueQuery_4 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pySearchToDateTime").buildScalarValueQuery();
        scalarValueQuery_5 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pysearchUserList").buildScalarValueQuery();
    }

    protected boolean evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        return ((pega.<Boolean>resolveMethodCall("pxPageListLengthCompare--(ClipboardProperty,String,int)", "pxPageListLengthCompare", "Pega-RULES", "Page", new Object[] { pega.findDataPage("D_pzFeed", false, "FeedLabel", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)).getProperty(pega, "pxResults"), ">", 0 })).booleanValue() && (((FUAUtil.compareTwoValues(scalarValueQuery_2.resolveToString(tools, pega.findDataPage("D_pzFeedParams", false, "FeedLabel", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "") || FUAUtil.compareTwoValues(scalarValueQuery_3.resolveToString(tools, pega.findDataPage("D_pzFeedParams", false, "FeedLabel", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_DATETIME), FUAUtil.C2VOp.NE, "")) || FUAUtil.compareTwoValues(scalarValueQuery_4.resolveToString(tools, pega.findDataPage("D_pzFeedParams", false, "FeedLabel", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_DATETIME), FUAUtil.C2VOp.NE, "")) || FUAUtil.compareTwoValues(scalarValueQuery_5.resolveToString(tools, pega.findDataPage("D_pzFeedParams", false, "FeedLabel", scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT)), ImmutablePropertyInfo.TYPE_TEXT), FUAUtil.C2VOp.NE, "")));
    }
}
