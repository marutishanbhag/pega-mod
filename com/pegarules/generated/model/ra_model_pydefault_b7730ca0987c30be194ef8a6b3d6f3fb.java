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
public class ra_model_pydefault_b7730ca0987c30be194ef8a6b3d6f3fb extends AbstractModel implements Activity, FUASupport, FUAReusable, MetadataAvail {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Model.pyDefault.Data_Portal_DesignerStudio.Model");
	public ra_model_pydefault_b7730ca0987c30be194ef8a6b3d6f3fb(PegaAPI aContext) {
		cleanForReuse(aContext);
	}
public void perform() {
	HashStringMap modelKeys = new HashStringMap();
	modelKeys.putString("pxObjClass", "Rule-Obj-Model");
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-MODEL DATA-PORTAL-DESIGNERSTUDIO PYDEFAULT #20180713T135510.468 GMT	Pega-Desktop:08-01-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
RuleTraceInfo pz_CurrentTraceInfo = oTraceInfo_0;
//For tracing data transform events
pega.modelProlog(pz_CurrentTraceInfo);
setDataTransformBeingTraced(pega.isTraceEnabled(EVENT_MODEL_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_MODEL_END, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_BEGIN, pz_CurrentTraceInfo) || pega.isTraceEnabled(EVENT_ACTION_END, pz_CurrentTraceInfo));

myStepPage = tools.getStepPage();
try {
ClipboardPage source_1 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_1 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"1", "Set .pzUserMenuActions", source_1, target_1);
{
    pega.setViaPropRef(".pzUserMenuActions", pRef_1, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"1", "Set .pzUserMenuActions", source_1, target_1);
ClipboardPage source_2 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_2 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"2", "Set .pyOwner", source_2, target_2);
{
    pega.setViaPropRef(".pyOwner", pRef_2, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"2", "Set .pyOwner", source_2, target_2);
ClipboardPage source_3 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_3 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"3", "Set .pyPortalPages(1).pyCaption", source_3, target_3);
{
    pega.setViaPropRef(".pyPortalPages(1).pyCaption", pRef_3, myStepPage, "Work", "sIN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"3", "Set .pyPortalPages(1).pyCaption", source_3, target_3);
ClipboardPage source_4 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_4 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"4", "Set .pyPortalPages(1).pyColumn(1).pyType", source_4, target_4);
{
    pega.setViaPropRef(".pyPortalPages(1).pyColumn(1).pyType", pRef_4, myStepPage, "NARROW", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"4", "Set .pyPortalPages(1).pyColumn(1).pyType", source_4, target_4);
ClipboardPage source_5 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_5 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"5", "Set .pyPortalPages(1).pyColumn(2).pyType", source_5, target_5);
{
    pega.setViaPropRef(".pyPortalPages(1).pyColumn(2).pyType", pRef_5, myStepPage, "WIDE", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"5", "Set .pyPortalPages(1).pyColumn(2).pyType", source_5, target_5);
ClipboardPage source_6 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_6 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"6", "Set .pyPortalPages(2).pyCaption", source_6, target_6);
{
    pega.setViaPropRef(".pyPortalPages(2).pyCaption", pRef_6, myStepPage, "Play", "sIN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"6", "Set .pyPortalPages(2).pyCaption", source_6, target_6);
ClipboardPage source_7 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_7 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"7", "Set .pyPortalPages(1).pyColumn(1).pyUseGadgets(1).pyGadgetCaption", source_7, target_7);
{
    pega.setViaPropRef(".pyPortalPages(1).pyColumn(1).pyUseGadgets(1).pyGadgetCaption", pRef_7, myStepPage, "Tools", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"7", "Set .pyPortalPages(1).pyColumn(1).pyUseGadgets(1).pyGadgetCaption", source_7, target_7);
ClipboardPage source_8 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_8 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"8", "Set .pyPortalPages(1).pyColumn(1).pyUseGadgets(1).pyGadgetName", source_8, target_8);
{
    pega.setViaPropRef(".pyPortalPages(1).pyColumn(1).pyUseGadgets(1).pyGadgetName", pRef_8, myStepPage, "Tools", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"8", "Set .pyPortalPages(1).pyColumn(1).pyUseGadgets(1).pyGadgetName", source_8, target_8);
ClipboardPage source_9 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_9 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"9", "Set .pyPortalPages(1).pyColumn(2).pyUseGadgets(1).pyGadgetCaption", source_9, target_9);
{
    pega.setViaPropRef(".pyPortalPages(1).pyColumn(2).pyUseGadgets(1).pyGadgetCaption", pRef_9, myStepPage, "Portal Error", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"9", "Set .pyPortalPages(1).pyColumn(2).pyUseGadgets(1).pyGadgetCaption", source_9, target_9);
ClipboardPage source_10 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_10 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"10", "Set .pyPortalPages(1).pyColumn(2).pyUseGadgets(1).pyGadgetName", source_10, target_10);
{
    pega.setViaPropRef(".pyPortalPages(1).pyColumn(2).pyUseGadgets(1).pyGadgetName", pRef_10, myStepPage, "PortalError", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"10", "Set .pyPortalPages(1).pyColumn(2).pyUseGadgets(1).pyGadgetName", source_10, target_10);
ClipboardPage source_11 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_11 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"11", "Set .pyPortalPages(1).pyColumn(2).pyUseGadgets(1).pyInitialOpenState", source_11, target_11);
{
    pega.setViaPropRef(".pyPortalPages(1).pyColumn(2).pyUseGadgets(1).pyInitialOpenState", pRef_11, myStepPage, true, "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"11", "Set .pyPortalPages(1).pyColumn(2).pyUseGadgets(1).pyInitialOpenState", source_11, target_11);
ClipboardPage source_12 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_12 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"12", "Set .pyStartPage", source_12, target_12);
{
    pega.setViaPropRef(".pyStartPage", pRef_12, myStepPage, "Work", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"12", "Set .pyStartPage", source_12, target_12);
ClipboardPage source_13 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_13 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"13", "Set .pyCurrentPage", source_13, target_13);
{
    pega.setViaPropRef(".pyCurrentPage", pRef_13, myStepPage, "Work", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"13", "Set .pyCurrentPage", source_13, target_13);
ClipboardPage source_14 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_14 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"14", "Set .pxCreateOpName", source_14, target_14);
{
    pega.setViaPropRef(".pxCreateOpName", pRef_14, myStepPage, scalarValueQuery_15.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"14", "Set .pxCreateOpName", source_14, target_14);
ClipboardPage source_15 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_15 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"15", "Set .pxCreateDateTime", source_15, target_15);
{
    pega.setViaPropRef(".pxCreateDateTime", pRef_16, myStepPage, PRDateFormat.formatIDT(System.currentTimeMillis()), "sMY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"15", "Set .pxCreateDateTime", source_15, target_15);
ClipboardPage source_16 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_16 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"16", "Set .pxCreateOperator", source_16, target_16);
{
    pega.setViaPropRef(".pxCreateOperator", pRef_17, myStepPage, scalarValueQuery_18.resolveToString(tools, pega.findPageWithException("pxRequestor", "Code-Pega-Requestor"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"16", "Set .pxCreateOperator", source_16, target_16);
ClipboardPage source_17 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_17 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"17", "Set .pxCreateSystemID", source_17, target_17);
{
    pega.setViaPropRef(".pxCreateSystemID", pRef_19, myStepPage, scalarValueQuery_20.resolveToString(tools, pega.findPageWithException("pxProcess", "Code-Pega-Process"), ImmutablePropertyInfo.TYPE_TEXT), "sTY", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"17", "Set .pxCreateSystemID", source_17, target_17);
ClipboardPage source_18 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_18 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"18", "Set .pyGadget(Worklist).pyName", source_18, target_18);
{
    pega.setViaPropRef(".pyGadget(Worklist).pyName", pRef_21, myStepPage, "Worklist", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"18", "Set .pyGadget(Worklist).pyName", source_18, target_18);
ClipboardPage source_19 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_19 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"19", "Set .pyGadget(Worklist).pyContentActivity", source_19, target_19);
{
    pega.setViaPropRef(".pyGadget(Worklist).pyContentActivity", pRef_22, myStepPage, "WideWorklist", "sIN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"19", "Set .pyGadget(Worklist).pyContentActivity", source_19, target_19);
ClipboardPage source_20 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_20 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"20", "Set .pyGadget(Worklist).pyContentClass", source_20, target_20);
{
    pega.setViaPropRef(".pyGadget(Worklist).pyContentClass", pRef_23, myStepPage, "Work-", "sIN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"20", "Set .pyGadget(Worklist).pyContentClass", source_20, target_20);
ClipboardPage source_21 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_21 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"21", "Set .pyGadget(Worklist).pyEnabled", source_21, target_21);
{
    pega.setViaPropRef(".pyGadget(Worklist).pyEnabled", pRef_24, myStepPage, "Y", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"21", "Set .pyGadget(Worklist).pyEnabled", source_21, target_21);
ClipboardPage source_22 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_22 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"22", "Set .pyGadget(Worklist).pyRefreshInterval", source_22, target_22);
{
    pega.setViaPropRef(".pyGadget(Worklist).pyRefreshInterval", pRef_25, myStepPage, "30", "sNN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"22", "Set .pyGadget(Worklist).pyRefreshInterval", source_22, target_22);
ClipboardPage source_23 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_23 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"23", "Set .pyGadget(Worklist).pyParams(1).pyPropertyName", source_23, target_23);
{
    pega.setViaPropRef(".pyGadget(Worklist).pyParams(1).pyPropertyName", pRef_26, myStepPage, "Param.UserIdentifier", "sIN100", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"23", "Set .pyGadget(Worklist).pyParams(1).pyPropertyName", source_23, target_23);
ClipboardPage source_24 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_24 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"24", "Set .pyGadget(Worklist).pyParams(1).pyParameterName", source_24, target_24);
{
    pega.setViaPropRef(".pyGadget(Worklist).pyParams(1).pyParameterName", pRef_27, myStepPage, "UserID", "siN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"24", "Set .pyGadget(Worklist).pyParams(1).pyParameterName", source_24, target_24);
ClipboardPage source_25 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_25 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"25", "Set .pyGadget(Worklist).pySelections(1)", source_25, target_25);
{
    pega.setViaPropRef(".pyGadget(Worklist).pySelections(1)", pRef_28, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"25", "Set .pyGadget(Worklist).pySelections(1)", source_25, target_25);
ClipboardPage source_26 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_26 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"26", "Set .pyRefreshInterval", source_26, target_26);
{
    pega.setViaPropRef(".pyRefreshInterval", pRef_29, myStepPage, "180", "sNN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"26", "Set .pyRefreshInterval", source_26, target_26);
ClipboardPage source_27 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_27 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"27", "Set .pyCommonParams.UserIdentifier", source_27, target_27);
{
    pega.setViaPropRef(".pyCommonParams.UserIdentifier", pRef_30, myStepPage, "", "s?N", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"27", "Set .pyCommonParams.UserIdentifier", source_27, target_27);
ClipboardPage source_28 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_28 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"28", "Set .pyLoadOCX", source_28, target_28);
{
    pega.setViaPropRef(".pyLoadOCX", pRef_31, myStepPage, "", "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"28", "Set .pyLoadOCX", source_28, target_28);
ClipboardPage source_29 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_29 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"29", "Set .pyWelcomeHTML", source_29, target_29);
{
    pega.setViaPropRef(".pyWelcomeHTML", pRef_32, myStepPage, "WelcomeScreen", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"29", "Set .pyWelcomeHTML", source_29, target_29);
ClipboardPage source_30 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_30 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"30", "Set .pyOverridePreferences", source_30, target_30);
{
    pega.setViaPropRef(".pyOverridePreferences", pRef_33, myStepPage, "false", "sSN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"30", "Set .pyOverridePreferences", source_30, target_30);
ClipboardPage source_31 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_31 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"31", "Set .pyCustomPortalActivity", source_31, target_31);
{
    pega.setViaPropRef(".pyCustomPortalActivity", pRef_34, myStepPage, "", "sTN", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"31", "Set .pyCustomPortalActivity", source_31, target_31);
ClipboardPage source_32 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_32 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"32", "Set .pyCustomPortalParams.pyTempPlaceHolder", source_32, target_32);
{
    pega.setViaPropRef(".pyCustomPortalParams.pyTempPlaceHolder", pRef_35, myStepPage, "", "s?N", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"32", "Set .pyCustomPortalParams.pyTempPlaceHolder", source_32, target_32);
ClipboardPage source_33 =pega.getScopedStepContextIfPresent("SOURCE");ClipboardPage target_33 =pega.getScopedStepContextIfPresent("TARGET");
actionProlog(pz_CurrentTraceInfo,"33", "Set .pyLandingMenu.pyLabel", source_33, target_33);
{
    pega.setViaPropRef(".pyLandingMenu.pyLabel", pRef_36, myStepPage, "", "sTN64", false, true);
}

actionEpilog(pz_CurrentTraceInfo,"33", "Set .pyLandingMenu.pyLabel", source_33, target_33);
}catch(RuntimeException e){ 
traceActionEnd(pz_CurrentTraceInfo,null,e);
throw e;} finally {
modelEpilog(pz_CurrentTraceInfo);
}
}
} // end of perform definition

/** Metadata for the rule */
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
	"Rule-Obj-Model:PYDEFAULT"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PYDEFAULT","Rule-Obj-Model","DATA-PORTAL-DESIGNERSTUDIO",false,"","Pega-Desktop","08-01-01","RULE-OBJ-MODEL DATA-PORTAL-DESIGNERSTUDIO PYDEFAULT #20180713T135510.468 GMT","!PYDEFAULT",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-562467472)
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
//	RULE-OBJ-MODEL DATA-PORTAL-DESIGNERSTUDIO PYDEFAULT #20180713T135510.468 GMT:20180713T135510.468 GMT

//	Functions used during this assembly :
//	RULE-UTILITY-FUNCTION UTILITIES PXGETTREESUBSCRIPT #20180713T132724.923 GMT:20180713T132724.923 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "1bc6a6b63e595ac634869420d81355bf";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Portal-DesignerStudio";
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

public static final String[] pRef_4 = new String[] { "", "", "pyPortalPages", "1", "pyColumn", "1", "pyType", "" };
public static final String[] pRef_11 = new String[] { "", "", "pyPortalPages", "1", "pyColumn", "2", "pyUseGadgets", "1", "pyInitialOpenState", "" };
public static final String[] pRef_24 = new String[] { "", "", "pyGadget", "Worklist", "pyEnabled", "" };
public static final String[] pRef_34 = new String[] { "", "", "pyCustomPortalActivity", "" };
public static final String[] pRef_7 = new String[] { "", "", "pyPortalPages", "1", "pyColumn", "1", "pyUseGadgets", "1", "pyGadgetCaption", "" };
public static final String[] pRef_31 = new String[] { "", "", "pyLoadOCX", "" };
public static final String[] pRef_23 = new String[] { "", "", "pyGadget", "Worklist", "pyContentClass", "" };
public static final String[] pRef_26 = new String[] { "", "", "pyGadget", "Worklist", "pyParams", "1", "pyPropertyName", "" };
public static final String[] pRef_10 = new String[] { "", "", "pyPortalPages", "1", "pyColumn", "2", "pyUseGadgets", "1", "pyGadgetName", "" };
public static final String[] pRef_16 = new String[] { "", "", "pxCreateDateTime", "" };
public static final String[] pRef_21 = new String[] { "", "", "pyGadget", "Worklist", "pyName", "" };
public static final String[] pRef_13 = new String[] { "", "", "pyCurrentPage", "" };
public static final String[] pRef_22 = new String[] { "", "", "pyGadget", "Worklist", "pyContentActivity", "" };
public static final String[] pRef_3 = new String[] { "", "", "pyPortalPages", "1", "pyCaption", "" };
public static final String[] pRef_32 = new String[] { "", "", "pyWelcomeHTML", "" };
public static final String[] pRef_33 = new String[] { "", "", "pyOverridePreferences", "" };
public static final String[] pRef_2 = new String[] { "", "", "pyOwner", "" };
public static final String[] pRef_12 = new String[] { "", "", "pyStartPage", "" };
public static final String[] pRef_19 = new String[] { "", "", "pxCreateSystemID", "" };
public static final String[] pRef_27 = new String[] { "", "", "pyGadget", "Worklist", "pyParams", "1", "pyParameterName", "" };
public static final String[] pRef_8 = new String[] { "", "", "pyPortalPages", "1", "pyColumn", "1", "pyUseGadgets", "1", "pyGadgetName", "" };
public static final String[] pRef_30 = new String[] { "", "", "pyCommonParams", "", "UserIdentifier", "" };
public static final String[] pRef_25 = new String[] { "", "", "pyGadget", "Worklist", "pyRefreshInterval", "" };
public static final String[] pRef_35 = new String[] { "", "", "pyCustomPortalParams", "", "pyTempPlaceHolder", "" };
public static final String[] pRef_28 = new String[] { "", "", "pyGadget", "Worklist", "pySelections", "1" };
public static final String[] pRef_5 = new String[] { "", "", "pyPortalPages", "1", "pyColumn", "2", "pyType", "" };
public static final String[] pRef_36 = new String[] { "", "", "pyLandingMenu", "", "pyLabel", "" };
public static final String[] pRef_6 = new String[] { "", "", "pyPortalPages", "2", "pyCaption", "" };
public static final String[] pRef_9 = new String[] { "", "", "pyPortalPages", "1", "pyColumn", "2", "pyUseGadgets", "1", "pyGadgetCaption", "" };
public static final String[] pRef_29 = new String[] { "", "", "pyRefreshInterval", "" };
public static final String[] pRef_1 = new String[] { "", "", "pzUserMenuActions", "" };
public static final String[] pRef_14 = new String[] { "", "", "pxCreateOpName", "" };
public static final String[] pRef_17 = new String[] { "", "", "pxCreateOperator", "" };
private static final ScalarValueQuery scalarValueQuery_15 = FUAUtil.createQueryBuilder().scalarProperty("pyUserName").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_18 = FUAUtil.createQueryBuilder().scalarProperty("pyUserIdentifier").buildScalarValueQuery();
private static final ScalarValueQuery scalarValueQuery_20 = FUAUtil.createQueryBuilder().scalarProperty("pxSystemName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-OBJ-MODEL DATA-PORTAL-DESIGNERSTUDIO PYDEFAULT #20180713T135510.468 GMT", "Data-Portal-DesignerStudio pyDefault", "Pega-Desktop", "08-01-01", "20180713T135510.468 GMT");
}
