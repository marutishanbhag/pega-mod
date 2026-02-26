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

public class ra_decision_data_mo_pygetsmartstepiconclass_763856876 extends AbstractDecisionTable {

    private final ScalarValueQuery scalarValueQuery_1;

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTABLE DATA-MO PYGETSMARTSTEPICONCLASS #20201217T191936.475 GMT", "Data-MO pyGetSmartStepIconClass", "Pega-ProcessArchitect", "08-06-01", "20201217T191936.475 GMT");

    public ra_decision_data_mo_pygetsmartstepiconclass_763856876(final Loadtime loadtime) {
        super(ruleTracer);
        final QueryBuilderFactory queryBuilderFactory = loadtime.get(QueryBuilderFactory.class);
        scalarValueQuery_1 = queryBuilderFactory.create().allowMissingPropertyException().scalarProperty("pyImplementation").buildScalarValueQuery();
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String var0 = scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
        if ((var0.equals("pzAttachContent"))) {
            return "pi pi-paper-clip";
        } else if ((var0.equals("pzSaveDataPage"))) {
            return "pi pi-case";
        } else if ((var0.equals("pzLoadDataPage"))) {
            return "pi pi-case";
        } else if ((var0.equals("pxChangeToSpecifiedStage"))) {
            return "pi pi-case";
        } else if ((var0.equals("pxChangeToNextStage"))) {
            return "pi pi-case";
        } else if ((var0.equals("pzCreateCase"))) {
            return "pi pi-case";
        } else if ((var0.equals("pxCreatePDF"))) {
            return "pi pi-case";
        } else if ((var0.equals("pxGenerateAndAttachDocument"))) {
            return "pi pi-document-data";
        } else if ((var0.equals("pxPersistCase"))) {
            return "pi pi-case";
        } else if ((var0.equals("pzPostSocial"))) {
            return "pi pi-chat-typing";
        } else if ((var0.equals("pySendPushNotification"))) {
            return "pi pi-mobile-phone";
        } else if ((var0.equals("pzSendEmail"))) {
            return "pi pi-mail";
        } else if ((var0.equals("pzUpdateWrapper"))) {
            return "pi pi-case";
        } else if ((var0.equals("pxCascadingApproval"))) {
            return "pi pi-check";
        } else if ((var0.equals("pxApproval"))) {
            return "pi pi-check";
        } else if ((var0.equals("pyDuplicateSearchCases"))) {
            return "pi pi-document-minus";
        } else if ((var0.equals("pzQuestionShape"))) {
            return "pi pi-chat-help";
        } else if ((var0.equals("pzQuestionShapeScr"))) {
            return "pi pi-chat-help";
        } else if ((var0.equals("pxSurveyDriver"))) {
            return "pi pi-check-circle";
        } else if ((var0.equals("pzQuestionPage"))) {
            return "pi pi-document";
        } else if ((var0.equals("pzQuestionPageScr"))) {
            return "pi pi-document";
        } else if ((var0.equals("pzNotifyWrapper"))) {
            return "pi pi-bell";
        } else if ((var0.equals("pzCreateSurvey"))) {
            return "pi pi-check-circle";
        } else if ((var0.equals("pzRunDataTransform"))) {
            return "pi pi-wrench";
        } else {
            return pega.<String>resolveMethodCall("ObtainValue--(PublicAPI,ClipboardPage,String,boolean)", "ObtainValue", null, "DecisionTable", new Object[] { tools, myStepPage, "pyGetSmartStepIconClassExtension", true });
        }
    }
}
