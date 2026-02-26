package com.pegarules.generated.activity;
/*
 * Copyright (c) 2026 Pegasystems Inc.
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
import Pega.*;
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.*;
import com.pega.pegarules.priv.clipboard.PegaClipboardPage;
import com.pega.pegarules.priv.database.*;
import com.pega.pegarules.priv.generator.DependentRuleInfo;
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
import com.pegarules.generated.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class ra_action_pzvalidateproductionrs_5fb090eb27f3c812765e6947b0d3c4af extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzValidateProductionRS.Data_Admin_Operator_AccessGroup.Action");
	public ra_action_pzvalidateproductionrs_5fb090eb27f3c812765e6947b0d3c4af(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ACCESSGROUP PZVALIDATEPRODUCTIONRS #20201201T153339.509 GMT	Pega-Desktop:08-06-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ACCESSGROUP PZVALIDATEPRODUCTIONRS #20201201T153339.509 GMT";
pz_CurrentCircumstance = "0";
pz_CurrentTraceInfo = oTraceInfo_0;
if (pega.activityProlog(snapshotLocalVariables(), pz_CurrentTraceInfo)) {
ClipboardProperty pageRef = null;
ClipboardProperty nextPage = null;
java.util.Iterator myPageList = null;
ClipboardPage thisStepPage = null;
pz_Dictionary = tools.getThread().getDictionary();

// Code to call step 1_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "1";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 1_circum0");
}
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ACCESSGROUP PZVALIDATEPRODUCTIONRS #20201201T153339.509 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 2_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "2";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 2_circum0");
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ACCESSGROUP PZVALIDATEPRODUCTIONRS #20201201T153339.509 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} 
} catch (ActivityTerminateException ate) {
throw ate; // Terminate all activity processing
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (PRRuntimeException prre) {
if (!pz_methodStatusUpdated) {pega.setThreadPropertyValue(".pxMethodStatus", prre.toString());}
pega.activityStepExceptionHandler(prre, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw prre;
} catch (RuntimeException re) {
pega.setThreadPropertyValue(".pxMethodStatus", re.toString());
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pega.activityEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo);}
}
} // end of perform definition

	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

	public boolean isAllowedInWeb() {
	 return isAllowedInWeb;
	}

private static final String oDependencies [] = {
	"Rule-Obj-Activity:PZVALIDATEPRODUCTIONRS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZVALIDATEPRODUCTIONRS","Rule-Obj-Activity","DATA-ADMIN-OPERATOR-ACCESSGROUP",false,"","Pega-Desktop","08-06-01","RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ACCESSGROUP PZVALIDATEPRODUCTIONRS #20201201T153339.509 GMT","!PZVALIDATEPRODUCTIONRS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-1700822507)
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
//	RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ACCESSGROUP PZVALIDATEPRODUCTIONRS #20201201T153339.509 GMT:20201201T153339.509 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "84ab500d5f7c68febf38e97f2f6967f3";
	}

	public String getDefinitionAppliesToClass() {
		return "Data-Admin-Operator-AccessGroup";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1 <code>java</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
PRStackFrame pz_preStackFrame = pega.pushStackFrame("Preconditions", null, false, true);
try {	// Preconditions
pega.activityStepWhenExpressionProlog(pz_CurrentTraceInfo, ".pyDefaultAppName != \"\"");
try {
if (myStepPage == null) {
throw new InvalidReferenceException(".pyDefaultAppName != \"\"", "FUAInstance-NullMyStepPage");
}
boolean pz_2 = (!(scalarValueQuery_1.resolveToString(tools, myStepPage, ImmutablePropertyInfo.TYPE_TEXT).equals("")));
pega.activityStepWhenExpressionEpilog(pz_CurrentTraceInfo, ".pyDefaultAppName != \"\"",pz_2);
if (!pz_2) {
// skip step / stop remaining iterations
pega.activityStepSkipped("Skip Step / exit remaining iterations");
return false;
}
} catch (RuntimeException anyException) {
oLog.error("Exception caught while evaluating when", anyException);
throw new IndeterminateConditionalException(".pyDefaultAppName != \"\" " + anyException.getMessage(), anyException);
}
} finally {
FUAUtil.activityPreTranIndeterminateConditionalCheck(pega, pz_CheckMessage, pz_preStackFrame);
}
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
java.util.ArrayList alRuleSets = new java.util.ArrayList();
ClipboardProperty propRuleSets = myStepPage.getProperty("pyUserRuleSets");
String sAppName = myStepPage.getString("pyDefaultAppName");
String sAppVers = myStepPage.getString("pyDefaultAppVersion");

// Use the full Validation for Application-based Access Groups
// Scrub the list of Production RuleSet entries
for (int i = 1; i <= propRuleSets.size(); i++) {
    String sValue = propRuleSets.getStringValue(i).trim();
    if (sValue.equals("")) {
        if (propRuleSets.size() >= 1) {
            propRuleSets.remove(i);
            i--; // try this position again...
        }
    }
}

if (propRuleSets.size() == 1 && propRuleSets.getStringValue(1).trim().equals(""))
    return true; // one blank entry, thus we don't need to check

ClipboardProperty propAppRuleSets = pega.createRuleSetListFromApplication(sAppName, sAppVers);
if (propAppRuleSets == null)
    return false; // assume we caught the application error above...

bApplyReuseRestrictions = true;
// Assume Rule-Application is valid. Ensure any production rulesets are compatible definitions
// Open the Rule-Application referred-to definition
ClipboardPage cpRuleAppDef = null;

try {
    HashStringMap hsmKeys = new HashStringMap();
    hsmKeys.putString("pxObjClass", "Rule-Application");
    hsmKeys.putString("pyProductName", sAppName);
    hsmKeys.putString("pyProductVersion", sAppVers);
    cpRuleAppDef = tools.getThread().getDatabase().open(hsmKeys, true);
} catch (DatabaseException dbEx) {
    myStepPage.addMessage("Database-General\tError opening Rule-Application definition\tunknown\tunknown\t" + dbEx.getMessage());
    oLog.error("Database Exception opening Rule-Application Definition " + sAppName + " " + sAppVers, dbEx);
}

if (cpRuleAppDef != null) {
    // First, validate that entries that appear here are "compatable" with the ones in Rule-App. That means identical matches
    // for three-part definitions, or identical first-two parts, with an optional third part in the Access Group.
 
    for (int i = 1; i <= propRuleSets.size(); i++) {
        String sUserListEntry = propRuleSets.getStringValue(i).trim();
        if (sUserListEntry.equals("")) {
            if (propRuleSets.size() == 1) {
                // let this slide, it's a blank list
            } else {
                propRuleSets.getPropertyValue(i).addMessage("ValueRequired");
            }
        } else {
            RuleSetSpecification rssUserEntry = null;
            try {
                pega.validateRuleSetSpec(propRuleSets.getPropertyValue(i), null);
                rssUserEntry = pega.getRuleSetSpec(sUserListEntry);
            } catch (DatabaseException dbEx) {
                myStepPage.addMessage("Database-General\tError validating RuleSet specification\tunknown\tunknown\t" + dbEx.getMessage());
                oLog.error("Database Exception validating RuleSet Specification", dbEx);
            }

            if (rssUserEntry.isTypeBranch()) {
                propRuleSets.getPropertyValue(i).addMessage("pzValildate-NoBranchAllowed");
            }

            // Ensure this entry isn't specified earlier in the list, perhaps with a different version
            for (int j = i - 1; j >= 1; j--) {
                String sPrevEntry = propRuleSets.getStringValue(j);
                int nPrevEntrySep = sPrevEntry.indexOf(':');
                if (nPrevEntrySep != -1)
                    sPrevEntry = sPrevEntry.substring(0, nPrevEntrySep);
                if (rssUserEntry.getName().equals(sPrevEntry)) {
                    // Flag both as duplicates
                    propRuleSets.getPropertyValue(i).addMessage("Validate-DuplicateValue");
                    propRuleSets.getPropertyValue(j).addMessage("Validate-DuplicateValue");
                }
            }
        }
    }

  
    // At this point, look for pre-reqs for entries. We need to ensure the order is correct, as well.
    for (int i = 1; i <= propRuleSets.size(); i++) {
        alRuleSets.add(propRuleSets.getStringValue(i));
    }
    for (int i = 1; i <= propAppRuleSets.size(); i++) {
        alRuleSets.add(propAppRuleSets.getStringValue(i));
    }

    int nVersion = 0;
    for (int i = propRuleSets.size(); i >= 1; i--) {
        String sEntry = propRuleSets.getStringValue(i);

        RuleSetSpecification rssProdRuleset = null;
      
        try {
                rssProdRuleset = pega.getRuleSetSpec(sEntry);
        } catch (DatabaseException dbEx) {
                myStepPage.addMessage("Database-General\tError validating RuleSet specification\tunknown\tunknown\t" + dbEx.getMessage());
                oLog.error("Database Exception validating RuleSet Specification", dbEx);
        }
     
        // if this production ruleset is set to ABV don't check prereqs - BUG-558234  
        if (rssProdRuleset.isRulesetApplicationBasedValidation() ) {
          continue;
        }    
      
        // Code that checks ruleset prereqs
        java.util.Collection colPreReqs = null;
        try {
             // there is a potential issue with colPreReqs where the current users production rulesets get added which does not make any sense.
            colPreReqs = pega.getRuleSetPrerequisites(sEntry);
        
        } catch (DatabaseException dbEx) {
            oLog.error("Unable to to obtain RuleSet prerequisites", dbEx);
            tools.getPrimaryPage().addMessage("Database-General\tUnable to to obtain RuleSet prerequisites\tunknown\tunknown\t" + dbEx.getMessage());
            continue;
        }
        java.util.Iterator iterPreReqs = colPreReqs.iterator();
        while (iterPreReqs.hasNext()) {
            boolean bFoundMatch = false;
            RuleSetSpecification rssEntry = (RuleSetSpecification) iterPreReqs.next();
            String sPreReqEntry = rssEntry.toString();
            for (int j = i;
                (j < alRuleSets.size()) && (!bFoundMatch); j++) {
                String sRuleSetEntry = (String) alRuleSets.get(j);
                String sRuleSetName = sRuleSetEntry.substring(0, sRuleSetEntry.indexOf(':') + 1);
                String sRuleSetVers = sRuleSetEntry.substring(sRuleSetEntry.indexOf(':') + 1);
                if (sPreReqEntry.startsWith(sRuleSetName)) {
                    // great! we found our RuleSet! Now to verify the version...
                    // there are 4 formats we may encounter:
                    // ""
                    // "dd"
                    // "dd-dd"
                    // "dd-dd-dd"
                    // check Major version first
                    if (sRuleSetVers.length() > 0) {
                        nVersion = Integer.parseInt(sRuleSetVers.substring(0, 2));
                        if (nVersion > rssEntry.getMajorVersion())
                            bFoundMatch = true;
                    }
                    if (!bFoundMatch) {
                        switch (sRuleSetVers.length()) {
                            case 0:
                                bFoundMatch = true;
                                break;

                            case 2: // "dd"
                                bFoundMatch = rssEntry.getVersionString().startsWith(sRuleSetVers);
                                break;

                            case 5: // "dd-dd"
                                // Minor version must at least be at the same level as the spec, if not higher
                                nVersion = Integer.parseInt(sRuleSetVers.substring(3));
                                bFoundMatch = (nVersion >= rssEntry.getMinorVersion());
                                break;

                            case 8: // "dd-dd-dd"
                                // Minor version must at least be at the same level as the spec, if not higher
                                // If they match, the patch level must at least be at the same level as the spec, if not higher
                                int nMinorVersion = Integer.parseInt(sRuleSetVers.substring(3, 5));
                                int nPatchVersion = Integer.parseInt(sRuleSetVers.substring(6));
                                if (nMinorVersion == rssEntry.getMinorVersion()) {
                                    bFoundMatch = (nPatchVersion >= rssEntry.getRevision());
                                } else {
                                    bFoundMatch = (nMinorVersion > rssEntry.getMinorVersion());
                                }

                                break;

                            default:
                                tools.getPrimaryPage().addMessage("pyRuleSetSpecificationIncorrectLength\t" + sRuleSetVers);
                        }
                    }
                }
            }

            if (!bFoundMatch) {
                // Does it appear earlier on the list, and the order is simply wrong?
                int nMatchEarlierIndex = -1;
                for (int j = i - 1; j >= 0; j--) {
                    String sRuleSetEntry = (String) alRuleSets.get(j);
                    String sRuleSetName = sRuleSetEntry.substring(0, sRuleSetEntry.indexOf(':') + 1);
                    String sRuleSetVers = sRuleSetEntry.substring(sRuleSetEntry.indexOf(':') + 1);
                    if (sPreReqEntry.startsWith(sRuleSetName)) {
                        // great! we found our RuleSet! Now to verify the version...
                        // there are 4 formats we may encounter:
                        // ""
                        // "dd"
                        // "dd-dd"
                        // "dd-dd-dd"
                        // check Major version first
                        if (sRuleSetVers.length() > 0) {
                            nVersion = Integer.parseInt(sRuleSetVers.substring(0, 2));
                            if (nVersion > rssEntry.getMajorVersion())
                                nMatchEarlierIndex = j;
                        }
                        if (!bFoundMatch) {
                            switch (sRuleSetVers.length()) {
                                case 0:
                                    nMatchEarlierIndex = j;
                                    break;

                                case 2: // "dd"
                                    if (rssEntry.getVersionString().startsWith(sRuleSetVers))
                                        nMatchEarlierIndex = j;
                                    break;

                                case 5: // "dd-dd"
                                    // Minor version must at least be at the same level as the spec, if not higher
                                    nVersion = Integer.parseInt(sRuleSetVers.substring(3));
                                    if (nVersion >= rssEntry.getMinorVersion())
                                        nMatchEarlierIndex = j;
                                    break;

                                case 8: // "dd-dd-dd"
                                    // Minor version must at least be at the same level as the spec, if not higher
                                    // If they match, the patch level must at least be at the same level as the spec, if not higher
                                    int nMinorVersion = Integer.parseInt(sRuleSetVers.substring(3, 5));
                                    int nPatchVersion = Integer.parseInt(sRuleSetVers.substring(6));
                                    if (nMinorVersion == rssEntry.getMinorVersion()) {
                                        if (nPatchVersion >= rssEntry.getRevision())
                                            nMatchEarlierIndex = j;
                                    } else {
                                        if (nMinorVersion > rssEntry.getMinorVersion())
                                            nMatchEarlierIndex = j;
                                    }

                                    break;

                                default:
                                    tools.getPrimaryPage().addMessage("pyRuleSetSpecificationIncorrectLength\t" + sRuleSetVers);
                            }
                        }
                    }
                }

                if ((nMatchEarlierIndex != -1) && (nMatchEarlierIndex <= propRuleSets.size())) {
                    // We've got a previous match, and it's on the list we've got control over...
                    propRuleSets.getPropertyValue(nMatchEarlierIndex + 1).addMessage("pyEntryMustAppearBelow\t" + sEntry);
                    propRuleSets.getPropertyValue(i).addMessage("pyEntryMustAppearAbove\t" + sPreReqEntry);
                } else {
                    propRuleSets.getPropertyValue(i).addMessage("Application-RuleSet-PreReqMissing\t" + sEntry + "\t" + sPreReqEntry);
                }
            }
        }
    } // Old RSV preqs code 
  
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * Validate pega rulesets and setup client data.
 * <p>
 * Step 2 <code>java</code><br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  java
ClipboardProperty propRuleSets = myStepPage.getProperty("pyUserRuleSets");

com.pegarules.generated.pega_rules_utilities.ValidatePegaRuleSets(propRuleSets);


// Copy the production rulesets from primary page to pyReturnToClient
// So that, the "ruleset:version" is stored perfectly if user enters with spaces like "ruleset  :   version"
ClipboardPage cpReturnPage = tools.findPage("pyReturnToClient");
ClipboardPage cpPrimaryPage = tools.getPrimaryPage();

if (cpReturnPage != null) {
    ClipboardProperty propReturnRulesetList = cpReturnPage.getProperty(".pyUserRuleSets");
    ClipboardProperty propCorrectedRuleSetList = cpPrimaryPage.getProperty(".pyUserRuleSets");
    propReturnRulesetList.setValue(propCorrectedRuleSetList);
}
} finally {
	try{
		infEngine.forwardChain(tools);
}
	finally{pega.unwind(methodFrame, true);}
}
} catch (ActivityTerminateException ate) {
	throw ate;
} catch (com.pega.pegarules.pub.PRAppRuntimeException arte) {
throw arte;
} catch (RuntimeException re) {
FUAUtil.activityStepStatusUpdateForException(pega, re);
pega.activityStepExceptionHandler(re, snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum);
throw re;
} finally {
pz_CurrentStepNum = "2";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}
public String nextBlock="";
boolean pz_Status = true;
boolean pz_methodStatusUpdated = false;
private boolean debugIsOn=false;
private int forEachCounter = 0;
private int pz_forEachSkipClass = 0;
private InfEngUtils infEngine = null;
ClipboardProperty nextProperty = null;
String pz_CurrentRuleKey = "";
String pz_CurrentCircumstance = "";
String pz_CurrentStepNum = "";
com.pega.pegarules.priv.tracer.ActivityTraceInfo pz_CurrentTraceInfo = null;
String pz_thisPageClass = "";
Dictionary pz_Dictionary = null;
private static final boolean isAllowedInWeb = true;
String statusReturnedFromNestedLoop = "";

public void initializeStandardLocalVariables() {
	nextBlock="";
	pz_Status = true;
	pz_methodStatusUpdated = false;
	debugIsOn=false;
	forEachCounter = 0;
	pz_forEachSkipClass = 0;
	infEngine = null;
	nextProperty = null;
	pz_CurrentRuleKey = "";
	pz_CurrentCircumstance = "";
	pz_CurrentStepNum = "";
	pz_CurrentTraceInfo = null;
	pz_thisPageClass = "";
	pz_Dictionary = null;
	statusReturnedFromNestedLoop = "";
}

public boolean bApplyReuseRestrictions = false;

public void initializeUserLocalVariables() {
	bApplyReuseRestrictions = false;
}


public StringMap snapshotLocalVariables() {
	if (!pega.isLocalVariableCollectionEnabled()) {
		return null;
	}

	StringMap smRetVal = new HashStringMap();
	smRetVal.putString("bApplyReuseRestrictions", Boolean.toString(bApplyReuseRestrictions));
	return smRetVal;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

private static final ScalarValueQuery scalarValueQuery_1 = FUAUtil.createQueryBuilder().scalarProperty("pyDefaultAppName").buildScalarValueQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY DATA-ADMIN-OPERATOR-ACCESSGROUP PZVALIDATEPRODUCTIONRS #20201201T153339.509 GMT", "Data-Admin-Operator-AccessGroup pzValidateProductionRS", "Pega-Desktop", "08-06-01", false, true, "", "ACTIVITY", "20201201T153339.509 GMT" ,"Rule-Obj-Activity"); }
