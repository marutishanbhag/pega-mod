package com.pegarules.generated.activity;
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
public class ra_action_pzsetinheritedformats_a7843cee314c9260d6bdc89aa589efff extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzSetInheritedFormats.Rule_PortalSkin.Action");
	public ra_action_pzsetinheritedformats_a7843cee314c9260d6bdc89aa589efff(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY RULE-PORTALSKIN PZSETINHERITEDFORMATS #20181206T120318.562 GMT	Pega-UIDesign:08-02-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY RULE-PORTALSKIN PZSETINHERITEDFORMATS #20181206T120318.562 GMT";
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
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-PORTALSKIN PZSETINHERITEDFORMATS #20181206T120318.562 GMT Step: 1 Circum: 0" );
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
ClipboardPage  myStepPage = tools.getStepPage();
if (tools.getPrimaryPage() == null) {
thisStepPage = null;
} else { 
ClipboardProperty embeddedPageProp = tools.getPrimaryPage().getIfPresent(".pxMessageSummary");
thisStepPage = embeddedPageProp == null ? null : embeddedPageProp.getPageValue();
}
PRStackFrame pz_StackFrame2_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-PORTALSKIN PZSETINHERITEDFORMATS #20181206T120318.562 GMT Step: 2 Circum: 0" );
try {
pz_Status = step2_circum0();
} finally {
pega.popStackFrame(pz_StackFrame2_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 3_circum0
pz_Status = true;
if (nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "3";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 3_circum0");
}
PRStackFrame pz_StackFrame3_circum0 = pega.pushStackFrame( null, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-PORTALSKIN PZSETINHERITEDFORMATS #20181206T120318.562 GMT Step: 3 Circum: 0" );
try {
pz_Status = step3_circum0();
} finally {
pega.popStackFrame(pz_StackFrame3_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock

// Code to call step 4_circum0
pz_Status = true;
if(nextBlock.equals("")) { 
ClipboardPage pzPrimPage = tools.getPrimaryPage();
if (pzPrimPage == null) {
pageRef = null;
} else { 
if (pzPrimPage == null) {
throw new InvalidReferenceException(".pyElements", "FUAInstance-NullMyStepPage");
}
ClipboardProperty pz_6 = pzPrimPage.getIfPresent("pyElements");
pageRef = pz_6;
} 
if (pageRef != null) {
myPageList = pageRef.iterator();
while (myPageList.hasNext() && (pz_Status == true)) 
{
forEachCounter++;
tools.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
nextPage = (ClipboardProperty) myPageList.next();
thisStepPage = nextPage.getPageValue();
{
if (pz_Status == true && nextBlock.equals("")) {
pz_methodStatusUpdated = false;
pz_CurrentStepNum = "4";
if( oLog.isDebugEnabled() ) {
	oLog.debug("Running step 4_circum0");
}
PRStackFrame pz_StackFrame4_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY RULE-PORTALSKIN PZSETINHERITEDFORMATS #20181206T120318.562 GMT Step: 4 Circum: 0" );
try {
pz_Status = step4_circum0();
} finally {
pega.popStackFrame(pz_StackFrame4_circum0, false);
pz_methodStatusUpdated = true;
}
} // end of if(pz_Status = true and/or nextBlock
} // close the if statement for valid class check
} // close the for loop for For Each Embedded Page
} // close the if statement for pageRef not null
forEachCounter = 0;
pz_forEachSkipClass = 0;
}	// end of if (nextBlock...
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
	"Rule-Obj-Activity:PZSETINHERITEDFORMATS"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZSETINHERITEDFORMATS","Rule-Obj-Activity","RULE-PORTALSKIN",false,"","Pega-UIDesign","08-02-01","RULE-OBJ-ACTIVITY RULE-PORTALSKIN PZSETINHERITEDFORMATS #20181206T120318.562 GMT","!PZSETINHERITEDFORMATS",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",1953588964)
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
//	RULE-OBJ-ACTIVITY RULE-PORTALSKIN PZSETINHERITEDFORMATS #20181206T120318.562 GMT:20181206T120318.562 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f0d440385c76b60e25a0144a185cdfe2";
	}

	public String getDefinitionAppliesToClass() {
		return "Rule-PortalSkin";
	}
public String getAspect() {
return "Action";
}
/**
 * Step 1 <code>Page-Clear-Messages</code><br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Clear-Messages", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Clear-Messages
if(myStepPage != null) {
myStepPage.clearMessages();
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Clear-Messages",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

/**
 * BUG-224342: Remove the pxMessageSummary page so that errors persists on the page during updates.
 * <p>
 * Step 2 <code>Page-Remove</code> [on page .pxMessageSummary] <br>
 */
public boolean step2_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Page-Remove", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Page-Remove
pageRemove(myStepPage);
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
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Page-Remove",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step2_circum0 definition

/**
 * Populate pyInheritedFormats.
 * <p>
 * Step 3 <code>Java</code><br>
 */
public boolean step3_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
// This steps opens all of this skin's ancestors and adds their formats to pyInheritedFormats.
// Keys to a skin's parents are found in pyInheritedSkins.
// The inheritance structure determines how formats are overridden.
// A skin overrides its parents' formats. A parent at a lower index in pyInheritedSkins overrides one at a higher index.
ClipboardPage primary = tools.getPrimaryPage();
String primaryName = primary.getString(".pyPurpose");

// Used to upgrade the parent skin
StringMap upgradeActivityKeys = new HashStringMap();
upgradeActivityKeys.putString("pyClassName", "Rule-PortalSkin");
upgradeActivityKeys.putString("pyActivityName", "UpgradeOnOpen");
ParameterPage upgradeParams = new ParameterPage();
upgradeParams.putString("isCalledDuringFUA", "true");

// The least pzSkinVersion value where mixins use the upgraded data model.
// Skins with incompatible data models can't be used for inheritance.
final int MIXIN_DM_UPGRADE = 46;

// all ancestors (that the DB could open) in DFS (depth-first search) order,
// so parents with lower indexes always override ones with higher indexes
java.util.LinkedList <ClipboardPage> ancestors = new java.util.LinkedList <ClipboardPage>();

// search this skin's ancestors in DFS order by looping these steps:
// 1. pop skin off toAdd
// 2. enqueue that skin to ancestors
// 3. push that skin's parents to toAdd in descending order (so the parent at index 1 resolves first)
java.util.Stack <ClipboardPage> toAdd = new java.util.Stack <ClipboardPage>();
toAdd.push(primary);
while (!toAdd.empty()) {

	// Filter out duplicates of current skin
	boolean isDuplicateFound = false;
	ClipboardPage skin = toAdd.pop();

	// Iterate through ancestor lists, check if current skin is already in the lists,
	// if so, don't add it or check its children
	for (ClipboardPage ancestor: ancestors) {
		if (skin.getString(".pyPurpose").equals(ancestor.getString(".pyPurpose"))) {
			isDuplicateFound = true;
			break;
		} 
	}

	// If we found a duplicate, continue iterating through the while loop
	if(isDuplicateFound) {
		continue;
	} else { // Otherwise, add the skin
		ancestors.add(skin);
	}

	// Push each parent skin in pyInheritedSkins onto the stack in reverse order,
	// so that lower-index parents are resolved first
	ClipboardProperty parents = skin.getProperty(".pyInheritedSkins");

	PARENT_LIST:
		for (int i = parents.size(); i > 0; i--) {
			ClipboardPage keys = parents.getPageValue(i);
			String parentName = keys.getString(".pyPurpose");

			if (parentName.isEmpty()) {
				primary.addMessage("pyParentSkinCannotBeBlank");
				continue;
			}

			// Do not add if skin has already been covered as an optimization and to avoid circular loops.
			// Note: Circular ancestry should normally fail validation, but if it doesn't we'll crash the node
			// if we ignore it here. This is important.
			for (ClipboardPage ancestor: ancestors) {
				if (parentName.equals(ancestor.getString(".pyPurpose"))) {
					continue PARENT_LIST;
				}
			}

			ClipboardPage opennedParent;
			try {
				opennedParent = tools.getDatabase().open(keys, false);
			} catch (DatabaseException e) {
				primary.addMessage("pyAncestorSkinCannotBeFound\t"+parentName+"\t"+primaryName);
				oLog.error("[pzSetInheritedFormats] DatabaseException thrown : " + e.getMessage());
				continue;
			}

			if (opennedParent == null) {
				primary.addMessage("pyAncestorSkinCannotBeFound\t"+parentName+"\t"+primaryName);
				continue;
			}
			
			// Upgrade the skin
			tools.doActivity(upgradeActivityKeys, opennedParent, upgradeParams);

			// If the skin is non auto generated flag with an error
			if (opennedParent.getBoolean("pyBrandingInUse") == false) {
			  primary.addMessage("pyUnsupportedAncestorSkin\t"+parentName+"\t"+primaryName);
			  continue;
			}

			// If opennedParent is using an old mixin dm, ignore it
			if (opennedParent.getInteger("pzSkinVersion") < MIXIN_DM_UPGRADE) {
				primary.addMessage("pyAncestorSkinNeedsUpgrade\t"+parentName+"\t"+primaryName);
				continue;
			}

			// We now know opennedParent is a valid ancestor
			toAdd.push(opennedParent);
		}
}

// Removes primary page from queue. We do not descend from ourselves.
ancestors.remove();

// Loop over ancestors and build the inheritance order pagelist
ClipboardProperty inheritanceOrder = primary.getProperty(".pyInheritanceOrder");
inheritanceOrder.clearValue(); // clear out previous list before recreating
for (ClipboardPage ancestor: ancestors) {
	ClipboardPage ancestorCopy = tools.createPage("Rule-PortalSkin", ancestor.getName());
	ancestorCopy.putString(".pyPurpose", ancestor.getString(".pyPurpose"));
	inheritanceOrder.add(ancestorCopy);
}

// for each element in the primary page
ClipboardProperty elements = primary.getProperty(".pyElements");
for (int i = 1; i <= elements.size(); i++) {
	// Add all inherited skins to pyInheritedFormats in DFS order
	java.util.Map < String, ClipboardPage > formatsMap = new java.util.LinkedHashMap < String, ClipboardPage > ();

	// for each ancestors
	Iterator ancestorIterator = ancestors.descendingIterator();
	while (ancestorIterator.hasNext()) {
		ClipboardPage ancestor = (ClipboardPage) ancestorIterator.next();

		// Get a handle on all the formats
		ClipboardPage ancestorElement = ancestor.getProperty(".pyElements").getPageValue(i);  
		String ancestorElementName = ancestorElement.getString("pyName");
		// Get a handle on the single componenet formats and check if they inherit       
		boolean isUserFormatsAllowed = ancestorElement.getBoolean(".pyAllowUserFormats");
		boolean isInheritingFromParent = ancestorElement.getBoolean(".pyInheritFromParent");

		if (isUserFormatsAllowed == false && isInheritingFromParent == true) {
			// Inheriting from the parent single format componenet so dont look at pyFormats
			continue;
		} else {
			ClipboardProperty ancestorFormats = ancestorElement.getProperty(".pyFormats");
			ClipboardProperty cp_disabledInheritedFormats = ancestorElement.getProperty(".pyDisabledInheritedFormats");
			/*
            	Get inherited formats as well if element is Screen Layout	
            */
          	if("Screen Layout".equals(ancestorElementName)){
              	ClipboardProperty ancestorInheritedFormats = ancestorElement.getProperty(".pyInheritedFormats");
              	for(int j=1; j<= ancestorInheritedFormats.size(); j++){
                	ClipboardPage format = ancestorInheritedFormats.getPageValue(j);
                    String name = format.getString(".pyName");
                    format.putString(".pySourceSkinLabel", ancestor.getString(".pyLabel"));
                    format.putString(".pySourceSkinPurpose", ancestor.getString(".pyPurpose"));
                    format.putString(".pySortFormatRef", "");
                    formatsMap.put(name, format);  
                }
            }
			for (int j = 1; j <= ancestorFormats.size(); j++) {
				// add that format to primary unless it was overridden
				ClipboardPage format = ancestorFormats.getPageValue(j);
				String name = format.getString(".pyName");		
				boolean isDisabled = format.getBoolean(".pyFormatDisabled");
				if (isDisabled == true && !"Screen Layout".equals(ancestorElementName)) {
					formatsMap.remove(name);
				} else {
					format.putString(".pySourceSkinLabel", ancestor.getString(".pyLabel"));
					format.putString(".pySourceSkinPurpose", ancestor.getString(".pyPurpose"));
          format.putString(".pySortFormatRef", "");
					formatsMap.put(name, format);
				}
			}

			// iterate through the disabled inherited formats
          if(!"Screen Layout".equals(ancestorElementName)){
          	  for (int k = 1; k <= cp_disabledInheritedFormats.size(); k++) {
                  String value = cp_disabledInheritedFormats.getPropertyValue(k).toString();
                  formatsMap.remove(value);  
              }
          }
		}
	}
	
    ClipboardPage currentElementPage = elements.getPageValue(i);
    ClipboardProperty myInheritedFormats = elements.getPageValue(i).getProperty(".pyInheritedFormats");
    myInheritedFormats.clearValue();
  	if("Screen Layout".equals(currentElementPage.getString("pyName"))){
        ClipboardProperty disabledParentFormats = currentElementPage.getProperty(".pyDisabledParentFormats");
        disabledParentFormats.clearValue();

        for (Map.Entry < String, ClipboardPage > entry: formatsMap.entrySet()) {
            ClipboardPage entryPage = entry.getValue();
            String formatName = entryPage.getString("pyName");
            myInheritedFormats.add(entryPage);

            if(entryPage.getBoolean("pyFormatDisabled") == true){
                disabledParentFormats.add(formatName);
            }
        }
    } else {
	  	// set pyInheritedFormats to formatsMap
        for (Map.Entry < String, ClipboardPage > entry: formatsMap.entrySet()) {
            myInheritedFormats.add(entry.getValue());
        }      	
    }
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
pz_CurrentStepNum = "3";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step3_circum0 definition

/**
 * Step 4 <code>Call pzSetInheritanceProperties</code> [on page .pyElements] <br>
 */
public boolean step4_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSetInheritanceProperties");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Call pzSetInheritanceProperties", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Call pzSetInheritanceProperties
// Calling Activity : pzSetInheritanceProperties

// processScalarParameters
ParameterPage newParamsPage = new ParameterPage();
newParamsPage.putParamValue("pyForEachCount", Integer.toString(forEachCounter));
newParamsPage.putParamValue("pyIterationType", "embedded");
newParamsPage.putParamValue("pyHowInvoked", "ForEach");
newParamsPage.putParamValue("pyIterationTarget", ".pyElements");
// Expression: TempPlaceHolder
newParamsPage.putParamValue("pyTempPlaceHolder", PropertyInfo.TYPE_TEXT, "TempPlaceHolder");
newParamsPage.putParamValue("pxObjClass", PropertyInfo.TYPE_TEXT, "");

pega.invokeActivity(myStepPage, newParamsPage, "pzSetInheritanceProperties", "Rule-PortalSkin", "");
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
pz_CurrentStepNum = "4";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Call pzSetInheritanceProperties",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step4_circum0 definition

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


public void initializeUserLocalVariables() {
}


public StringMap snapshotLocalVariables() {
	return null;
}

public void cleanForReuse(PegaAPI aContext) {
	tools = (PublicAPI)aContext;
	pega = aContext;
	initializeStandardLocalVariables();
	initializeUserLocalVariables();
	infEngine = pega == null ? null : pega.getInfEngUtils();
}

private static final PropertyQuery propertyQuery_4 = FUAUtil.createQueryBuilder().page("pxMessageSummary").ifPresent().buildPropertyQuery();
private static final PropertyQuery propertyQuery_1 = FUAUtil.createQueryBuilder().page("pxMessageSummary").buildPropertyQuery();

private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY RULE-PORTALSKIN PZSETINHERITEDFORMATS #20181206T120318.562 GMT", "Rule-PortalSkin pzSetInheritedFormats", "Pega-UIDesign", "08-02-01", false, true, "", "ACTIVITY", "20181206T120318.562 GMT" ,"Rule-Obj-Activity"); }
