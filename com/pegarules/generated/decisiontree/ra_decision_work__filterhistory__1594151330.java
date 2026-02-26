package com.pegarules.generated.decisiontree;

import com.pega.platform.coreassemblers.decision.AbstractDecisionTree;
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

public class ra_decision_work__filterhistory__1594151330 extends AbstractDecisionTree {

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-DECLARE-DECISIONTREE WORK- FILTERHISTORY #20200805T111734.599 GMT", "Work- FilterHistory", "Pega-ProcessEngine", "08-06-01", "20200805T111734.599 GMT");

    public ra_decision_work__filterhistory__1594151330(final Loadtime loadtime) {
        super(ruleTracer);
    }

    protected String evaluate(final Runtime runtime, final ClipboardPage myStepPage, final ParameterPage params) {
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        String paramInputValue = ((((!StringUtils.isNotBlank(tools.getParamValue("DecisionTreeInput")))) || (tools.getParamValue("DecisionTreeInput").equals("none"))) ? "" : tools.getParamValue("DecisionTreeInput"));
        boolean allowMissingProperty = tools.getParamAsBoolean(PropertyInfo.TYPE_TEXT, "AllowMissingProperties");
        if ((paramInputValue.equals("AssignmentCompleted"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("AssignmentRouted"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ItemCreated"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ItemSaved"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("PerformedAction"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("PulledFromWorkbasket"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("Reassigned"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("SLAGoal"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("SLAExecuteActivity"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("StatusChanged"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ItemBulkCreated"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ItemBulkUpdated"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("AddedToCover"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("AddedToFolder"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("AssignmentInterrupted"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("AttachmentDeleted"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ChangeStageAutomatic"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ChangeStageFlowAction"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ChangeStageFlowShape"))) {
            return String.valueOf(false);
        }
        if ((paramInputValue.equals("ChangeStageInApprovalStep"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("CorrAttached"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("CorrFail"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("FileAttached"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("FileNotAttached"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("FirstStageStarted"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ItemCopied"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ItemReactivated"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ItemReopened"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ItemRevoked"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ItemSuspended"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("MarkedForSuspension"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("NoteAttached2"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("NotifyAssigneeFail"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("OverallSLADeadline"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("OverallSLAExecuteActivity"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("OverallSLAGoal"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("OverallSLALate"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("RemovedFromCover"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("RemovedFromFolder"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ScannedDocumentAttached"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ScreenShotAttached"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("SLADeadline"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("SLALate"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("StageSkipped"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("UrlAttached"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("WorkObjectAddedToCover"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("WorkObjectAddedToFolder"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("WorkObjectRemovedFromCover"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("WorkObjectRemovedFromFolder"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("pyCloseOpenAssignmentsOnResolution"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("AddedFollower"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("StartedFollowing"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("RemovedFollower"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("UnFollowing"))) {
            return String.valueOf(true);
        }
        if ((paramInputValue.equals("ChildCaseInsAudit"))) {
            return String.valueOf(true);
        }
        return String.valueOf(true);
    }
}
