package com.pegarules.generated.model;
/*
 * Copyright (c) 2024 Pegasystems Inc.
 * All rights reserved.
 *
 * This software is governed by a License Agreement that restricts its
 * use.  The software contains valuable trade secrets and proprietary
 * information of Pegasystems Inc and is protected by federal copyright
 * law.  It may not be copied, modified, translated or distributed in any
 * form or medium, disclosed to third parties or used in any manner not
 * expressly provided for in said License Agreement except with written
 * authorization from Pegasystems Inc.
*/
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
import com.pega.pegarules.priv.tracer.RuleTraceInfo;
import com.pega.pegarules.pub.*;
import com.pega.pegarules.pub.clipboard.*;
import com.pega.pegarules.pub.context.*;
import com.pega.pegarules.pub.database.*;
import com.pega.pegarules.pub.dictionary.*;
import com.pega.pegarules.pub.infengine.*;
import com.pega.pegarules.pub.presence.*;
import com.pega.pegarules.pub.runtime.*;
import com.pega.pegarules.pub.services.*;
import com.pega.pegarules.pub.util.*;
import com.pega.platform.clipboard.query.PageListQuery;
import com.pega.platform.clipboard.query.PageQuery;
import com.pega.platform.clipboard.query.PropertyQuery;
import com.pega.platform.clipboard.query.ScalarListQuery;
import com.pega.platform.clipboard.query.ScalarValueQuery;
import com.pega.platform.executionengine.runtime.Loadtime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class ra_model_pzbuildappinfo_bed12cd2e8ad8e0d46e7fe4aff4f5b9c extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pzBuildAppInfo._baseclass.Model");
	public ra_model_pzbuildappinfo_bed12cd2e8ad8e0d46e7fe4aff4f5b9c(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL @BASECLASS PZBUILDAPPINFO #20180713T131416.028 GMT	Pega-RULES:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
/* entering new scope */
boolean pop_ctxt_page_1 = false;
boolean pop_ctxt_page_2 = false;
try {
/* push '"Primary"' to scope TARGET */
ClipboardPage ctxt_page_1 = null;
ctxt_page_1 = tools.getPrimaryPage();
pop_ctxt_page_1 = pega.pushScopedStepContext("TARGET", "Primary", ctxt_page_1);
/* push '"TempAppPage"' to scope SOURCE */
ClipboardPage ctxt_page_2 = null;
String pz_1 = "TempAppPage";
ctxt_page_2 = tools.findPage(pz_1, true);
if (ctxt_page_2 == null) {
ctxt_page_2 = tools.findPage(pz_1, false);
ctxt_page_2.putString("pxObjClass", "Rule-Application");
}
pop_ctxt_page_2 = pega.pushScopedStepContext("SOURCE", "TempAppPage", ctxt_page_2);
ClipboardPage target_context_1 = pega.getScopedStepContext("TARGET");ClipboardPage source_context_1 = pega.getScopedStepContext("SOURCE");actionProlog(pz_CurrentTraceInfo,"1", "Update Page", source_context_1, target_context_1);
if (updatePage_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return;
}
actionEpilog(pz_CurrentTraceInfo,"1", "Update Page", source_context_1, target_context_1);
} finally {
if (pop_ctxt_page_1) {
pega.popScopedStepContext("TARGET");
}
if (pop_ctxt_page_2) {
pega.popScopedStepContext("SOURCE");
}
} // return to previous scope
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

private int updatePage_1(RuleTraceInfo pz_CurrentTraceInfo) {
// Acquire reference to the target property; we append to this list
ClipboardProperty targetProperty_1 = null;
ClipboardProperty pz_2 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_2 = null;
try {
ctxt_frame_2 = pega.pushStackFrame("Primary.pxResults", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_2.getStepPage();
pz_2 = tools.getPrimaryPage().getProperty("pxResults");
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_2);
} // return to previous step page

targetProperty_1 = pz_2;
/* entering new scope */
boolean pop_ctxt_page_3 = false;
try {
/* push '"Primary.pxResults"' to scope TARGET */
// switch step page to scope TARGET
PRStackFrame ctxt_frame_3 = null;
try {
ctxt_frame_3 = pega.pushStackFrame("\"switching to update TARGET\"", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_3.getStepPage();
ClipboardPage ctxt_page_3 = null;
ctxt_page_3 = targetProperty_1.getPageValue(ClipboardProperty.LIST_APPEND);
if("".equals(ctxt_page_3.getString("pxObjClass"))) {
	ctxt_page_3.putString("pxObjClass", "Rule-Application");
}
pop_ctxt_page_3 = pega.pushScopedStepContext("TARGET", "Primary.pxResults", ctxt_page_3);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_3);
} // return to previous step page
actionProlog(pz_CurrentTraceInfo,"1.1", "Append and Map to", null, targetProperty_1);
if (appendAndMapTo_1(pz_CurrentTraceInfo) == CODE_EXIT_MODEL) {
traceActionEnd(pz_CurrentTraceInfo, "Exit Data Transform", null);
return CODE_EXIT_MODEL;
}
actionEpilog(pz_CurrentTraceInfo,"1.1", "Append and Map to", null, targetProperty_1);
} finally {
if (pop_ctxt_page_3) {
pega.popScopedStepContext("TARGET");
}
} // return to previous scope
return CODE_CONTINUE;
}private int appendAndMapTo_1(RuleTraceInfo pz_CurrentTraceInfo) {
ClipboardPage source_1 =null;
ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.1", "Set .pxInsId", source_1, target_1);
{
    String pzSourceVar3 = "";
    PRStackFrame ctxt_frame_5 = null;
    try {
        ctxt_frame_5 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_5.getStepPage();
        pzSourceVar3 = scalarValueQuery_4.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_5);
    }
    PRStackFrame ctxt_frame_4 = null;
    try {
        ctxt_frame_4 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_4.getStepPage();
        pega.setViaPropRef(".pxInsId", pRef_5, myStepPage, pzSourceVar3, "sTY", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_4);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.1", "Set .pxInsId", source_1, target_1);
ClipboardPage source_2 =null;
ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.2", "Set .pyLabel", source_2, target_2);
{
    String pzSourceVar7 = "";
    PRStackFrame ctxt_frame_9 = null;
    try {
        ctxt_frame_9 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_9.getStepPage();
        pzSourceVar7 = scalarValueQuery_8.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_9);
    }
    PRStackFrame ctxt_frame_8 = null;
    try {
        ctxt_frame_8 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_8.getStepPage();
        pega.setViaPropRef(".pyLabel", pRef_9, myStepPage, pzSourceVar7, "sTN64", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_8);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.2", "Set .pyLabel", source_2, target_2);
ClipboardPage source_3 =null;
ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.3", "Set .pyProductVersion", source_3, target_3);
{
    String pzSourceVar11 = "";
    PRStackFrame ctxt_frame_13 = null;
    try {
        ctxt_frame_13 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_13.getStepPage();
        pzSourceVar11 = scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_13);
    }
    PRStackFrame ctxt_frame_12 = null;
    try {
        ctxt_frame_12 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_12.getStepPage();
        pega.setViaPropRef(".pyProductVersion", pRef_13, myStepPage, pzSourceVar11, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_12);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.3", "Set .pyProductVersion", source_3, target_3);
ClipboardPage source_4 =null;
ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.4", "Set .pyProductName", source_4, target_4);
{
    String pzSourceVar15 = "";
    PRStackFrame ctxt_frame_17 = null;
    try {
        ctxt_frame_17 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_17.getStepPage();
        pzSourceVar15 = scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_17);
    }
    PRStackFrame ctxt_frame_16 = null;
    try {
        ctxt_frame_16 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_16.getStepPage();
        pega.setViaPropRef(".pyProductName", pRef_17, myStepPage, pzSourceVar15, "sIN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_16);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.4", "Set .pyProductName", source_4, target_4);
ClipboardPage source_5 =null;
ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.5", "Set .pxObjClass", source_5, target_5);
// Change obj class
String pz_21 = "";
// switch step page to scope SOURCE
PRStackFrame ctxt_frame_21 = null;
try {
ctxt_frame_21 = pega.pushStackFrame("\"Rule-Application\"", null, pega.getScopedStepContext("SOURCE"), false, false);
myStepPage = ctxt_frame_21.getStepPage();
pz_21 = "Rule-Application";
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_21);
} // return to previous step page

ClipboardPage tempPage_1 = tools.createPage(pz_21, "");
ClipboardProperty pz_20 = (ClipboardProperty) null;
// switch step page to scope TARGET
PRStackFrame ctxt_frame_20 = null;
try {
ctxt_frame_20 = pega.pushStackFrame(".pxObjClass", null, pega.getScopedStepContext("TARGET"), false, false);
myStepPage = ctxt_frame_20.getStepPage();
pz_20 = propertyQuery_19.resolve(tools, myStepPage);
} finally {
	myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_20);
} // return to previous step page

ClipboardPage targetPage_1 = pz_20.getParentPage();
targetPage_1.putAll(tempPage_1, ClipboardPage.PUTALL_KEEPNEW);
tools.getDictionary().validate(targetPage_1, false);
actionEpilog(pz_CurrentTraceInfo,"1.1.5", "Set .pxObjClass", source_5, target_5);
ClipboardPage source_6 =null;
ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1.1.7", "Set .pyRAInsName", source_6, target_6);
{
    String pzSourceVar22 = "";
    PRStackFrame ctxt_frame_23 = null;
    try {
        ctxt_frame_23 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("SOURCE"), false, false);
        myStepPage = ctxt_frame_23.getStepPage();
        pzSourceVar22 = ((scalarValueQuery_16.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT) + "!") + scalarValueQuery_12.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT));
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_23);
    }
    PRStackFrame ctxt_frame_22 = null;
    try {
        ctxt_frame_22 = pega.pushStackFrame("Rule-Application", null, pega.getScopedStepContext("TARGET"), false, false);
        myStepPage = ctxt_frame_22.getStepPage();
        pega.setViaPropRef(".pyRAInsName", pRef_23, myStepPage, pzSourceVar22, "sTN", false, true);
    } finally {
        myStepPage = pega.popStackFrameAndReturnStepPage(ctxt_frame_22);
    }
}

actionEpilog(pz_CurrentTraceInfo,"1.1.7", "Set .pyRAInsName", source_6, target_6);
return CODE_CONTINUE;
}/** Metadata for the rule */
private static final Map oMetaData;

// initialize metadata for the rule
static {
oMetaData = new HashMap(1);
oMetaData.put(".pyCallSuperClassModel", "true");
}

/** Returns metadata for this rule instance */
public Map getMetadata() {
return oMetaData;
}

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Obj-Model:PZBUILDAPPINFO"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZBUILDAPPINFO","Rule-Obj-Model","@BASECLASS",false,"","Pega-RULES","08-01-01","RULE-OBJ-MODEL @BASECLASS PZBUILDAPPINFO #20180713T131416.028 GMT","!PZBUILDAPPINFO",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",951061477)
	};

	 /**
	 * This method returns the set of dependent rules required to build
	 * the generated code and (possibly) whole classes that the rules assembler declared.
	 * @return array of <code>DependentRuleInfo</code> objects.
	 */
	public DependentRuleInfo[] getDependentRuleInfos() {
		return oDependentRuleInfos;
	}


//	Rules used in this assembly (order and duplicates ARE significant to hash code) :
//	RULE-OBJ-MODEL @BASECLASS PZBUILDAPPINFO #20180713T131416.028 GMT:20180713T131416.028 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "3be7ae6c9708276d6140d7756a3efb95";
	}

	public String getDefinitionAppliesToClass() {
		return "@baseclass";
	}
public String getAspect() {
return "Model";
}
private static final int CODE_CONTINUE = 0;
private static final int CODE_EXIT_ITERATION = 1;
private static final int CODE_EXIT_MODEL = 2;
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public void cleanForReuse(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
		myStepPage = null;
		pz_CurrentRuleKey = "";
}
private ClipboardPage myStepPage;
String pz_CurrentRuleKey = "";

public static final String[] pRef_9 = new String[] { "", "", "pyLabel", "" };
public static final String[] pRef_23 = new String[] { "", "", "pyRAInsName", "" };
public static final String[] pRef_5 = new String[] { "", "", "pxInsId", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyProductVersion", "" };
public static final String[] pRef_17 = new String[] { "", "", "pyProductName", "" };
private static final ScalarValueQuery scalarValueQuery_8 = FUAUtil.createQueryBuilder().scalarProperty("pyLabel").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_4 = FUAUtil.createQueryBuilder().scalarProperty("pxInsId").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_16 = FUAUtil.createQueryBuilder().scalarProperty("pyProductName").buildScalarValueQuery();
private static final PropertyQuery propertyQuery_19 = FUAUtil.createQueryBuilder().scalarProperty("pxObjClass").buildPropertyQuery();
private static final ScalarValueQuery scalarValueQuery_12 = FUAUtil.createQueryBuilder().scalarProperty("pyProductVersion").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL @BASECLASS PZBUILDAPPINFO #20180713T131416.028 GMT", "@baseclass pzBuildAppInfo", "Pega-RULES", "08-01-01", "20180713T131416.028 GMT");
}
