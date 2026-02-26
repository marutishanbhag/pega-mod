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

public class ra_decision_embed_rule_navigation_element_pzenableshapeinpe_906416258 extends AbstractDecisionTable {

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE EMBED-RULE-NAVIGATION-ELEMENT PZENABLESHAPEINPE #20230618T001730.558 GMT", "Embed-Rule-Navigation-Element pzEnableShapeInPE", "Pega-ProcessArchitect", "08-23-01", "20230618T001730.558 GMT");

    public ra_decision_embed_rule_navigation_element_pzenableshapeinpe_906416258(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().page("pyExecute").page("pyCustom").pageList("pyParameters", 2).scalarProperty("pyValue").buildScalarValueQuery();
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
        if ((var0.equals("pzCreateCase"))) {
            return "true";
        } else if ((var0.equals("pzSendEmail"))) {
            return "true";
        } else if ((var0.equals("pxChangeToNextStage"))) {
            return "true";
        } else if ((var0.equals("pxChangeToSpecifiedStage"))) {
            return "true";
        } else if ((var0.equals("pxConnectToGenerativeAI"))) {
            return "true";
        } else if ((var0.equals("pzPostSocial"))) {
            return "true";
        } else if ((var0.equals("pySendPushNotification"))) {
            return "true";
        } else if ((var0.equals("pxPersistCase"))) {
            return "true";
        } else if ((var0.equals("pzUpdateWrapper"))) {
            return "true";
        } else if ((var0.equals("pxCreatePDF"))) {
            return "true";
        } else if ((var0.equals("pzNotifyWrapper"))) {
            return "true";
        } else if ((var0.equals("pzAttachContent"))) {
            return "true";
        } else if ((var0.equals("pxGenerateAndAttachDocument"))) {
            return "true";
        } else if ((var0.equals("pzCreateSurvey"))) {
            return "true";
        } else if ((var0.equals("pzRunDataTransform"))) {
            return "true";
        } else {
            return "false";
        }
    }
}
