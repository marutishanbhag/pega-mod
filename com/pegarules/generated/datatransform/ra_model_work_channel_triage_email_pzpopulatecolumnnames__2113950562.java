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

public class ra_model_work_channel_triage_email_pzpopulatecolumnnames__2113950562 extends AbstractDataTransform {

    private static final String [] pRef_1 = new String[] { "", "", "pxResults", "<append>", "pyLabel", "" };

    private static final RuleTraceInfo ruleTracer = new RuleTraceInfo("RULE-OBJ-MODEL WORK-CHANNEL-TRIAGE-EMAIL PZPOPULATECOLUMNNAMES #20200824T062251.410 GMT", "Work-Channel-Triage-Email pzPopulateColumnNames", "Pega-ProcessEngine", "08-06-01", "20200824T062251.410 GMT");

    public ra_model_work_channel_triage_email_pzpopulatecolumnnames__2113950562(final Loadtime loadtime) {
        super(ruleTracer, false);
    }

    protected Object evaluate(final Runtime runtime, ClipboardPage myStepPage, final ParameterPage params) {
        final PageUtility pageUtility = runtime.get(PageUtility.class);
        final PegaAPI pega = runtime.getPega();
        final PublicAPI tools = runtime.getTools();
        final RuntimeTraceContext runtimeTraceContext = new RuntimeTraceContext(runtime, tracerInfo);
        try {
            actionProlog(runtime, "1", "Remove TempColumnPages", null, null, runtimeTraceContext);
            {
                ClipboardPage remove_1 = tools.findPage("TempColumnPages");
                pageUtility.removePageFromClipboard(remove_1);
            }
            actionEpilog(runtime, "1", "Remove TempColumnPages", null, null, runtimeTraceContext);
            actionProlog(runtime, "2", "Remove OptimizeColumnPages", null, null, runtimeTraceContext);
            {
                ClipboardPage remove_2 = tools.findPage("OptimizeColumnPages");
                pageUtility.removePageFromClipboard(remove_2);
            }
            actionEpilog(runtime, "2", "Remove OptimizeColumnPages", null, null, runtimeTraceContext);
            actionProlog(runtime, "3", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcommitdatetime", "s?N", false, true);
            actionEpilog(runtime, "3", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "4", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxsavedatetime", "s?N", false, true);
            actionEpilog(runtime, "4", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "5", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcoverinskey", "s?N", false, true);
            actionEpilog(runtime, "5", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "6", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcoveredcount", "s?N", false, true);
            actionEpilog(runtime, "6", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "7", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcoveredcountopen", "s?N", false, true);
            actionEpilog(runtime, "7", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "8", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcoveredcountunsatisfied", "s?N", false, true);
            actionEpilog(runtime, "8", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "9", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcreatedatetime", "s?N", false, true);
            actionEpilog(runtime, "9", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "10", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcreateopname", "s?N", false, true);
            actionEpilog(runtime, "10", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "11", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcreateoperator", "s?N", false, true);
            actionEpilog(runtime, "11", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "12", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcreatesystemid", "s?N", false, true);
            actionEpilog(runtime, "12", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "13", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxflowcount", "s?N", false, true);
            actionEpilog(runtime, "13", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "14", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxinsname", "s?N", false, true);
            actionEpilog(runtime, "14", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "15", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxobjclass", "s?N", false, true);
            actionEpilog(runtime, "15", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "16", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxupdatedatetime", "s?N", false, true);
            actionEpilog(runtime, "16", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "17", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxupdateopname", "s?N", false, true);
            actionEpilog(runtime, "17", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "18", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxupdateoperator", "s?N", false, true);
            actionEpilog(runtime, "18", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "19", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxupdatesystemid", "s?N", false, true);
            actionEpilog(runtime, "19", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "20", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxurgencywork", "s?N", false, true);
            actionEpilog(runtime, "20", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "21", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyagefromdate", "s?N", false, true);
            actionEpilog(runtime, "21", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "22", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pydescription", "s?N", false, true);
            actionEpilog(runtime, "22", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "23", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyeffortactual", "s?N", false, true);
            actionEpilog(runtime, "23", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "24", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyeffortestimate", "s?N", false, true);
            actionEpilog(runtime, "24", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "25", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyeffortestimatetimestamp", "s?N", false, true);
            actionEpilog(runtime, "25", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "26", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyelapsedpastdeadline", "s?N", false, true);
            actionEpilog(runtime, "26", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "27", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyelapsedpastgoal", "s?N", false, true);
            actionEpilog(runtime, "27", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "28", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyelapsedstatusnew", "s?N", false, true);
            actionEpilog(runtime, "28", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "29", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyelapsedstatusopen", "s?N", false, true);
            actionEpilog(runtime, "29", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "30", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyelapsedstatuspending", "s?N", false, true);
            actionEpilog(runtime, "30", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "31", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyeventid", "s?N", false, true);
            actionEpilog(runtime, "31", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "32", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyid", "s?N", false, true);
            actionEpilog(runtime, "32", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "33", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pylabel", "s?N", false, true);
            actionEpilog(runtime, "33", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "34", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyorigdivision", "s?N", false, true);
            actionEpilog(runtime, "34", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "35", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyorigorg", "s?N", false, true);
            actionEpilog(runtime, "35", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "36", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyorigorgunit", "s?N", false, true);
            actionEpilog(runtime, "36", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "37", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyoriguserdivision", "s?N", false, true);
            actionEpilog(runtime, "37", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "38", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyoriguserid", "s?N", false, true);
            actionEpilog(runtime, "38", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "39", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyoriguserworkgroup", "s?N", false, true);
            actionEpilog(runtime, "39", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "40", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyownerdivision", "s?N", false, true);
            actionEpilog(runtime, "40", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "41", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyownerorg", "s?N", false, true);
            actionEpilog(runtime, "41", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "42", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyownerorgunit", "s?N", false, true);
            actionEpilog(runtime, "42", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "43", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyreopencount", "s?N", false, true);
            actionEpilog(runtime, "43", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "44", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyreopentimestamp", "s?N", false, true);
            actionEpilog(runtime, "44", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "45", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyresolutioncost", "s?N", false, true);
            actionEpilog(runtime, "45", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "46", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyresolveddivision", "s?N", false, true);
            actionEpilog(runtime, "46", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "47", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyresolvedorg", "s?N", false, true);
            actionEpilog(runtime, "47", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "48", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyresolvedorgunit", "s?N", false, true);
            actionEpilog(runtime, "48", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "49", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyresolvedtime", "s?N", false, true);
            actionEpilog(runtime, "49", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "50", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyresolvedtimestamp", "s?N", false, true);
            actionEpilog(runtime, "50", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "51", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyresolveduserid", "s?N", false, true);
            actionEpilog(runtime, "51", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "52", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyresolveduserworkgroup", "s?N", false, true);
            actionEpilog(runtime, "52", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "53", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pysladeadline", "s?N", false, true);
            actionEpilog(runtime, "53", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "54", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyslagoal", "s?N", false, true);
            actionEpilog(runtime, "54", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "55", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pyslaname", "s?N", false, true);
            actionEpilog(runtime, "55", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "56", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pystatuswork", "s?N", false, true);
            actionEpilog(runtime, "56", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "57", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcurrentstagelabel", "s?N", false, true);
            actionEpilog(runtime, "57", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "58", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxcurrentstage", "s?N", false, true);
            actionEpilog(runtime, "58", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "59", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pzinskey", "s?N", false, true);
            actionEpilog(runtime, "59", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "60", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxapplication", "s?N", false, true);
            actionEpilog(runtime, "60", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "61", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pxapplicationversion", "s?N", false, true);
            actionEpilog(runtime, "61", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            actionProlog(runtime, "62", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            pega.setViaPropRef(".pxResults(<append>).pyLabel", pRef_1, pega.findPageWithException("TempColumnPages", "Code-Pega-List"), "pzpvstream", "s?N", false, true);
            actionEpilog(runtime, "62", "Set TempColumnPages.pxResults(<APPEND>).pyLabel", null, null, runtimeTraceContext);
            ParameterPage newParams_63 = runtime.parameterPageConstructor(null, null);
            {
                actionProlog(runtime, "63", "Apply Data Transform pyPopulateColumnNamesExtension", null, null, runtimeTraceContext);
                pega.applyModel(myStepPage, "Work-Channel-Triage-Email", newParams_63, "pyPopulateColumnNamesExtension");
                actionEpilog(runtime, "63", "Apply Data Transform pyPopulateColumnNamesExtension", null, null, runtimeTraceContext);
            }
            if (super.evaluateExpression(runtime, ruleTracer, myStepPage, new EvaluateFunction<Boolean>() {

                public Boolean apply(ClipboardPage myStepPage) {
                    return (pega.<Boolean>resolveMethodCall("PageExists--(String)", "PageExists", null, null, new Object[] { "OptimizeColumnPages" })).booleanValue();
                }
            }, "@PageExists(OptimizeColumnPages)")) {
                try {
                    actionProlog(runtime, "64", "When @PageExists(OptimizeColumnPages)", null, null, runtimeTraceContext);
                    {
                        actionProlog(runtime, "64.1", "Set Param.Dummy", null, null, runtimeTraceContext);
                        tools.putParamValue("Dummy", PropertyInfo.TYPE_TEXT, String.valueOf((pega.<Boolean>resolveMethodCall("pzRemoveDuplicatesFromListPage--(String,String)", "pzRemoveDuplicatesFromListPage", null, null, new Object[] { "OptimizeColumnPages", "pyLabel" })).booleanValue()));
                        actionEpilog(runtime, "64.1", "Set Param.Dummy", null, null, runtimeTraceContext);
                    }
                } catch (Exception e_2) {
                    runtimeTraceContext.setError(e_2);
                    throw e_2;
                } finally {
                    actionEpilog(runtime, "64", "When @PageExists(OptimizeColumnPages)", null, null, runtimeTraceContext);
                }
            }
            return null;
        } catch (Exception e_1) {
            runtimeTraceContext.setError(e_1);
            traceActionEnd(runtime, runtimeTraceContext);
            throw e_1;
        }
    }
}
