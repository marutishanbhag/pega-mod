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
public class ra_action_pzconvertcasetoclasstree_b3779ffb878a3a8f741cbfe9b3ba5715 extends com.pega.pegarules.pub.runtime.AbstractActivity implements com.pega.pegarules.pub.runtime.Activity, FUAReusable, FUASupport, WebAllowable, com.pega.pegarules.priv.runtime.ITracerMetaData {
	private static final LogHelper  oLog = new LogHelper("Rule_Obj_Activity.pzConvertCaseToClassTree.Code_Pega_List.Action");
	public ra_action_pzconvertcasetoclasstree_b3779ffb878a3a8f741cbfe9b3ba5715(PegaAPI aContext) {
		cleanForReuse(aContext);
	}

public void perform() {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCONVERTCASETOCLASSTREE #20210421T182715.956 GMT	Pega-ProcessArchitect:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
try {
pz_CurrentRuleKey = "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCONVERTCASETOCLASSTREE #20210421T182715.956 GMT";
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
ClipboardPage  myStepPage = tools.getStepPage();
thisStepPage = pega.findDataPage("D_pxGetCompleteClonableCaseTypes", false, "ApplicationPage", "tmpAppToBuildOn");
PRStackFrame pz_StackFrame1_circum0 = pega.pushStackFrame( null, thisStepPage, false, false, PRStackFrame.Type.ACTIVITY_STEP, "RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCONVERTCASETOCLASSTREE #20210421T182715.956 GMT Step: 1 Circum: 0" );
try {
pz_Status = step1_circum0();
} finally {
pega.popStackFrame(pz_StackFrame1_circum0, false);
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
	"Rule-Obj-Activity:PZCONVERTCASETOCLASSTREE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("PZCONVERTCASETOCLASSTREE","Rule-Obj-Activity","CODE-PEGA-LIST",false,"","Pega-ProcessArchitect","08-07-01","RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCONVERTCASETOCLASSTREE #20210421T182715.956 GMT","!PZCONVERTCASETOCLASSTREE",true,false,"ABSOLUTE_ULTIMATE_STEP_PAGE",-810106726)
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
//	RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCONVERTCASETOCLASSTREE #20210421T182715.956 GMT:20210421T182715.956 GMT

	/*	 *** Generated for use in a INTRANET Node	*/
	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "b0fbd062a97f03e78e541a028f5ff391";
	}

	public String getDefinitionAppliesToClass() {
		return "Code-Pega-List";
	}
public String getAspect() {
return "Action";
}
/**
 * Take list of case types and convert to class tree.
 * <p>
 * Step 1 <code>Java</code> [on page D_pxGetCompleteClonableCaseTypes[ApplicationPage:"tmpAppToBuildOn"]] <br>
 */
public boolean step1_circum0() {
ClipboardPage  myStepPage = tools.getStepPage();
boolean pz_StepStat = true; 
boolean pz_CheckMessage = true; 
boolean pz_AttemptedStep = false; 
pega.activityStepProlog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java");
try {
final PRStackFrame  methodFrame = pega.pushStackFrame("Java", null, false, true);
pz_AttemptedStep = true;
try {	// Method:  Java
//Debug variables
final boolean DEBUG = false;
final String DEBUGRS = "Pega-RULES";

//Top level properties / pages used to form the class tree
final ClipboardProperty caseTree = myStepPage.getProperty("pxResults");
final ClipboardPage buildAppPage = tools.findPage("D_pzBuildApplication");
final boolean isPegaDefinedTemplate = pega_rules_utilities.callWhen(tools, "pzIsPegaApplicationTemplate", buildAppPage);
final ClipboardPage classTreeMap = tools.findPage("D_pzBuildApplication.pyClassTreeForCaseTypes", true);
final ClipboardPage advancedSettings = tools.findPage("D_pzAdvancedApplicationSettings");
final String workPoolName = advancedSettings.getString("pyExpApplicationClassGroup");
final ClipboardPage primaryPage = tools.getPrimaryPage();
primaryPage.putObject("pyClassTreeMap", new java.util.HashMap<String, String>());

class Utility {
  //The starting location to look in...
  ClipboardPage rootNodeLocation = primaryPage.getProperty("pxResults").getPageValue(1);
  Map<String, String> mapOfCases = null;
  Map<String, String> classTreeMapLocations = null;

  /* 
  * Instantiate our utility class and intiialize our case tree map to be processed
  */
  Utility() {
    classTreeMapLocations = (java.util.Map) primaryPage.getObject("pyClassTreeMap");
    String rootNodeClass = workPoolName;
    ClipboardPage defaultWorkPool = tools.createPage("Embed-Rule-Obj-Class", "");
    defaultWorkPool.putString("pyLabel", tools.getLocalizedTextForString(".pyLabel", "pyApplicationCaseLayer"));
    defaultWorkPool.putString("pyExpanded", "true");
    defaultWorkPool.putString("pyIsImmutable", "true");
    rootNodeLocation.replace(defaultWorkPool);

    //Add to our hashmap the location of our root node and associated class
    classTreeMapLocations.put(rootNodeLocation.getReference(), rootNodeClass);

    //Initialize the case tree and assign it to class variable
    mapOfCases = initializeCaseTree();

    //Handle processing the case tree's class groups and update class tree accordingly
    processClassGroupsFromCaseTree();
  }

  /**
  * This method is repsonsibel for initializing the case tree to be converted and return it.
  * The case tree is initialized into a Map<String,String> structure.
  * The key to this map is the original class aas the key (guaranteed to be unique)
  * The value for each entry in the map is the new class based on what the function pzGenerateCaseClassname returns.
  */
  java.util.Map<String, String> initializeCaseTree() {
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("----------------------", DEBUGRS);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Initializing case tree.", DEBUGRS);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("----------------------", DEBUGRS);

    //For each case type, get the new class and add it map of cases
    java.util.Map<String, String> mapOfCasesTree = new HashStringMap();
    for(int i = 1; i <= caseTree.size(); i++) {
      ClipboardPage currentCase = caseTree.getPageValue(i);
      String originalClass = currentCase.getString("pyClassName");
      ClassInfo originalClassInfo = tools.getDictionary().getClassInfo(originalClass);
      //Only add case types that are concrete
      if(originalClassInfo.isConcrete()) {
        String newClass = pega_appdefinition_utilities.pzGenerateCaseClassname(workPoolName, originalClass);
        //Add the original class as the key (guaranteed to be unique, and the new class as the value)
        if(!mapOfCasesTree.containsKey(originalClass)) {
          mapOfCasesTree.put(originalClass, newClass);
        }
      } 
    }
    return mapOfCasesTree;
  }

  /**
  * This method is responsible for a few things:
  * 1) For each of the cases in the map of cases, separate the case class' classgroups into 2 groups.
  * 	- Class groups that end in -Work (Workpools)
  * 	- Class groups that don't end in -Work (additional classgroups)
  * 2) Based on the # of workpools, update the root node derives from
  * 3) If there are multiple workpools (class groups that end in -Work), then the following is performed:
  * 	- Class tree has new GRP(n) node(s) added per workpool where n is the number workpool being added to the tree
  * 	- Updates all "new" case type classes in the map of cases whose original class (key) in the map starts with the class group that now has a GRP node associated to it.
  * 		- An example of this would be Org-App-Work & Org-App2-Work. This results in NewO-NewA-Grp1-Work and NewO-NewA-Grp2-Work classgroups to be added to the class tree.
  			- Because the new class groups derive from Org-App-Work, any case types belonging to either of the original class groups will also have the resulting new class name updated.
            - This would result in: NewO-NewA-Grp1-Case1 and NewO-NewA-Grp2-Case1.
  * 4) Lastly, any additional class groups (class groups that didn't end in -Work) which are referenced by our map of case type classes are added as new nodes to our root node.
  */
  void processClassGroupsFromCaseTree() {
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Checking for multiple workpools..", DEBUGRS);
    Map<String,String> listOfWorkPools = new HashStringMap();
    Map<String, String> additionalClassGroups = new HashStringMap();

    //Add classgroups referenced by our casetree to "map of -Work classgroups" / "map of additional classgroups"
    Iterator<Map.Entry<String, String>> iter = this.mapOfCases.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<String, String> entry = iter.next();
      String derivesFrom = entry.getKey();
      String originalClassGroupName = tools.getDictionary().getClassInfo(derivesFrom).fromDefinition("pyClassGroup");
      String newClassGroupName = pega_appdefinition_utilities.pzGenerateCaseClassname(rootNodeLocation.getString("pyExpMyFullName"), originalClassGroupName);
      //If the class is a Work- classgroup, add it to list of workpools
      if(originalClassGroupName.endsWith("-Work") && !listOfWorkPools.containsKey(originalClassGroupName)) {
        if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Adding to list of class groups: " + originalClassGroupName, DEBUGRS);
        listOfWorkPools.put(originalClassGroupName, newClassGroupName);
      } else if(!originalClassGroupName.endsWith("-Work") && !additionalClassGroups.containsKey(originalClassGroupName)) {
        if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Adding to list of addtl class groups: " + originalClassGroupName, DEBUGRS);
        additionalClassGroups.put(originalClassGroupName, newClassGroupName);
      }
    }

    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("----------------------", DEBUGRS);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Adding class groups to class tree.", DEBUGRS);

    //If we had no -Work workpools, then derive from Work-Cover-
    if(listOfWorkPools.size() == 0 || isPegaDefinedTemplate) {
      rootNodeLocation.putString("pyDerivesFrom", "Work-Cover-");
      rootNodeLocation.putString("pyDerivesFromLabel", "Cover classes");
    } else if(listOfWorkPools.size() == 1) { //Otherwise, if we only had 1, then derive from that workpool
      String onlyClassGroup = listOfWorkPools.keySet().iterator().next();
      String onlyClassGroupLabel = tools.getDictionary().getClassInfo(onlyClassGroup).fromDefinition("pyLabel");
      rootNodeLocation.putString("pyDerivesFrom", onlyClassGroup);
      rootNodeLocation.putString("pyDerivesFromLabel", onlyClassGroupLabel);
    } else { //If we had more than 1 workpool, then create new node(s) with the naming of Grp#
      if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Multiple workpools found. Number of nodes to add to root is: " + listOfWorkPools.size(), DEBUGRS);

      //If there are multiple -Work workpools, then our default will derive from Work-Cover-
      rootNodeLocation.putString("pyDerivesFrom", "Work-Cover-");
      rootNodeLocation.putString("pyDerivesFromLabel", "Cover classes"); 

      Iterator<Map.Entry<String, String>> wpIter = listOfWorkPools.entrySet().iterator();
      int count = 0;
      //Create a new node in the tree for each -Work class group
      while(wpIter.hasNext()) {
        Map.Entry<String, String> entry = wpIter.next();
        String originalClassGroup = entry.getKey();
        String originalClassGroupLabel = tools.getDictionary().getClassInfo(originalClassGroup).fromDefinition("pyLabel");
        String nameNodeToken = "Grp" + (++count);
        String classGroupToAddToRoot = pega_appdefinition_utilities.pzGenerateCaseClassname(rootNodeLocation.getString("pyExpMyFullName"), originalClassGroup) + "-" + nameNodeToken; 
        addNodeToClassTree(nameNodeToken, classGroupToAddToRoot, originalClassGroupLabel, originalClassGroup, originalClassGroupLabel, true, false); 

        //Update the case tree if there are multiple work pools present
        updateCaseTreeNamesForClassGroup(originalClassGroup, classGroupToAddToRoot);

        //Update our map of workpools value with the new Grp layer included
        entry.setValue(classGroupToAddToRoot);

        //For each of our additional classgroups, check if we need to update the value if the key starts with the current -Work workpool we refactored into a new -Grp layer.
        Iterator<Map.Entry<String, String>> addtlIter = additionalClassGroups.entrySet().iterator();
        while(addtlIter.hasNext()) {
          Map.Entry<String, String> addtlEntry = addtlIter.next();
          String addtlClassGroup = addtlEntry.getKey();
          if(addtlClassGroup.startsWith(originalClassGroup)) {
            String whatComesAfter = addtlClassGroup.substring(originalClassGroup.length());
            addtlEntry.setValue(listOfWorkPools.get(originalClassGroup) + whatComesAfter);
          }
        }
      }
    }

    //Add the additional non -Work classgroups to the tree now that the -Work one's have been added
    Iterator<Map.Entry<String, String>> addtlIter = additionalClassGroups.entrySet().iterator();
    while(addtlIter.hasNext()) {
      Map.Entry<String, String> addtlEntry = addtlIter.next();
      String originalClassGroup = addtlEntry.getKey();
      String originalClassGroupLabel = tools.getDictionary().getClassInfo(originalClassGroup).fromDefinition("pyLabel");
      String classGroupToAddToRoot = addtlEntry.getValue();
      String nameNodeToken = pega_rules_string.whatComesAfterLast(classGroupToAddToRoot, '-');
      addNodeToClassTree(nameNodeToken, classGroupToAddToRoot, originalClassGroupLabel, originalClassGroup, originalClassGroupLabel, true, false);
    }                                                        
  }

  /**
  * This method is responsible for updating the case tree values for each entry whose original class belongs to the 'classGroupToCheck' parameter.
  * 
  * We iterate through our map of cases, and if the current entry's original class (the key) belongs to the classgroup that we want to check,
  * Then we need to recalculate the new class for the entry based on the 'newClassGroup' parameter provided.
  *
  * An example of this would be if a case type from our built on app Org-App-Work-Case1 results in NewO-NewA-Work-Case1 initially,
  * however the new classgroup NewO-NewA-Work gets renamed to NewO-NewA-Grp1-Work. In this scenario, NewO-NewA-Work-Case1 is no longer valid.
  * Instead, it should be renamed to NewO-NewA-Grp1-Work-Case1 to align with the renamed class group.
  */
  void updateCaseTreeNamesForClassGroup(String classGroupToCheck, String newClassGroup) {
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("----------------------", DEBUGRS);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Updating case tree classnames.", DEBUGRS);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("----------------------", DEBUGRS);
    Iterator<Map.Entry<String, String>> iter = this.mapOfCases.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<String, String> entry = iter.next();
      String originalClass = entry.getKey();
      String originalClassGroup = tools.getDictionary().getClassInfo(originalClass).fromDefinition("pyClassGroup");
      //If the original class (key) in the map starts with the class group, then remove it and add the new one
      if(originalClassGroup.startsWith(classGroupToCheck)) {
        String newClassName = pega_appdefinition_utilities.pzGenerateCaseClassname(newClassGroup, originalClass);
        if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("From: " + entry.getValue() + " to: " + newClassName, DEBUGRS);
        entry.setValue(newClassName);
      }
    }
  }

  /**
  * This method is responsible for recursively processing the case tree and converting each entry in the map to our class tree.
  *
  * We start out by caching the initial number of cases we are working with.
  * We then begin iterating through our map of cases (which was earlier intialized via 'initializeCaseTree' and then updated via 'processClassGroupsFromCaseTree'.
  * In each iteration, we take the current case class (the newly assigned class which is the value for the entry) as well as the derives from (which is the key for the entry),
  * and we attempt to create a new class node (see documentation for 'addNodeToClassTree' for further details on processing).
  * If the case is successfully added to the tree, we remove it from the map of cases.
  *
  * After iterating through all of our cases in the map, we check how many cases are left in the map of cases.
  * 	- If no cases remain, then all of the classes have been added to the class tree and we are done.
  * 	- If the initial number of cases and the ending number of cases match, then we were not able to add any cases to the class tree. This results in special handling via 'addSharedLayerToTree' method.
  *		- Otherwise, we added cases, so recurse and try to add more.
  			- The expectation here is if we have 2 case types 'Org-App-Work-Case1' and 'Org-App-Work-Case1-CaseChild', on the first iteration, the 'CaseChild' case type class can't be added to the tree.
            - However, the 'Case1' class can be. Hence, on the second iteration, because the class tree now contains 'Case1' class, the 'CaseChild' class can be added.
  * 
  * This method repeats until all case type classes have been added.
  */
  void createClassTree() {
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("----------------------", DEBUGRS);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Adding single layers classes to tree.", DEBUGRS);

    //Update Utility class variables with parameters passed in
    int initialNumCases = this.mapOfCases.size();

    Iterator<Map.Entry<String, String>> iter = this.mapOfCases.entrySet().iterator();
    while (iter.hasNext()) {
      Map.Entry<String, String> entry = iter.next();
      //Get the current case class
      String currCaseClass = entry.getValue();
      String currCaseBeginsWith = pega_rules_string.whatComesBeforeLast(currCaseClass, '-');
      String currCaseEndsWith = pega_rules_string.whatComesAfterLast(currCaseClass, '-');
      String derivesFrom = entry.getKey();
      String derivesFromLabel = tools.getDictionary().getClassInfo(derivesFrom).fromDefinition("pyLabel");

      //Attempt to add the case to the class tree
      boolean newClassAdded = addNodeToClassTree(currCaseEndsWith, currCaseClass, derivesFromLabel, derivesFrom, derivesFromLabel, true, false);

      //If it was added (or already exists in the tree), remove the case type from the map of cases
      if(newClassAdded) {
        iter.remove();
      }
    }
    //Used to determine if anything was added in this iteration
    int postNumCases = this.mapOfCases.size();

    //Break out if there are no more cases in the list
    if(postNumCases == 0) {
      if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("All classes have been added to the class tree.", DEBUGRS);
      return;
    } else if(initialNumCases == postNumCases) { //If no more case type classes can be added, then add shared layers to the tree
      if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("None of remaining classes can be added. Adding a shared layer before recursing.", DEBUGRS);
      addSharedLayerToTree();
    } else { //We had leftover case type classes which weren't added, and just finished adding some, so recurse to see if any others can be added now.
      if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Leftover classes: " + postNumCases +". Recursing to add more nodes", DEBUGRS);
      createClassTree();
    }
  }

  /**
  * This method is responsible for adding a case type class to the tree (including abstract (shared) layers, when the 'createClassTree' method is no longer able to add cases.
  * 	- An example of a shared layer would be:
  * 		- 'Org-App-Work-IntermediateLayer-CaseTypeName'. 'IntermediateLayer' is an abstract class and a case type exists in the class Org-App-Work-IntermediateLayer-CaseTypeName.
  * 		- Because Org-App-Work-IntermediateLayer won't be processed, through standard means, we need to add it as a shared layer to the tree first, and then we can add the CaseTypeName class layer underneath.
  *
  * This is accomplished by taking a substring of the root node class and the current case class.
  * Taking the example from above, where our root node class is 'Org-App-Work', this would give us 'IntermediateLayer-CaseTypeName'.
  * We then split apart the the result on each instance of a '-' (dash), which gives us individual layers that can be added to the root node.
  * Again, using the example from above, we add 'Org-App-Work-IntermediateLayer' to the class tree.
  * We then add 'Org-App-Work-IntermediateLayer-CaseTypeName' to the class tree.
  * 
  * The expectation after calling this method, is that a new class will always be added to the tree (however some of the intermediate layers may already exist, in which case we will not add duplicates).
  */  
  void addSharedLayerToTree() {
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("----------------------", DEBUGRS);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Adding a shared layer to the tree.", DEBUGRS);

    Iterator<Map.Entry<String, String>> iter = this.mapOfCases.entrySet().iterator();

    if (iter.hasNext()) {
      Map.Entry<String, String> entry = iter.next();

      //Get the current case class
      String currCaseClass = entry.getValue();    

      //Get the current case after the root node and split on each '-'
      String rootNodeClass = rootNodeLocation.getString("pyExpMyFullName");

      String[] layersToAdd = pega_rules_string.substring(currCaseClass, rootNodeClass.length()+1, currCaseClass.length()).split("-");

      //Get the current case derives from
      String currCaseDerives = entry.getKey();

      //Determine what the root derives from for this case class should start with
      int firstLayerIndex = -1;
      for(int i = 0; i < layersToAdd.length; i++) {
        String currLayer = "-"+layersToAdd[i];

        //Only mark the layer if it is in the current case derives from (handles -Grp1 insertion)
        if(currCaseDerives.contains(currLayer)) {
          firstLayerIndex = currCaseDerives.lastIndexOf(currLayer);
          break;
        }
      }

      //Set the initial derives to either the case class' derives appropriately
      String initialDerives = firstLayerIndex <= 0 ? currCaseDerives : currCaseDerives.substring(0, firstLayerIndex);

      String classForNode = rootNodeClass;

      //Use separate value to keep track of derivesFrom for each specific node of the shared layer
      String derivesForNode = initialDerives;

      //For each layer in the shared layer, append it as the name node token after the current class / derives from
      for(int i = 0; i < layersToAdd.length; i++) {
        String nameNodeToken = layersToAdd[i];
        String currentLayerClass = classForNode + "-" + nameNodeToken;
        String currentLayerDerives = derivesForNode;

        //Only add the name node token to the derives from if it was present in the original case class' derives from
        if(currCaseDerives.contains(nameNodeToken)) {
          currentLayerDerives = currentLayerDerives + "-" + nameNodeToken;
        }
        
        String currentLayerDerivesLabel = tools.getDictionary().getClassInfo(currentLayerDerives).fromDefinition("pyLabel");
        addNodeToClassTree(nameNodeToken, currentLayerClass, currentLayerDerivesLabel, currentLayerDerives, currentLayerDerivesLabel, true, false);
        classForNode = currentLayerClass;
        derivesForNode = currentLayerDerives;
      }

      //Always remove even we it couldn't be added.
      //The expectation is that something will always be added or that is has already been added to the tree
      iter.remove();
    }

    //Check if there are still cases that need to be added, in which case go back to our standard 'createClassTree' method.
    if(this.mapOfCases.size() > 0) {
      if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("There were " + this.mapOfCases.size() + " leftover classes.", DEBUGRS);
      createClassTree();
    } else { //Otherwise, this shared layer was the last class to add, so we are done.
      if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("All classes have been added to the class tree.", DEBUGRS);
    }
  }

  /**
  * This method is responsible for creating the new class node if possible and returning the 'null' or the ClipboardPage object that was added.
  *
  * We first determine whether the current class and derives from can be added to the class tree.
  * 	- If the class can be added, then we create a new page, set the appropriate values, add it under the appropriate location, then add the new page's location (page reference) to a map and return true.
  *		- If the class can't be added, then we return false.
  *		- Special case: If the class already exists in the tree, we return a true
  *			- This is for handling scenario where 'createClassTree' method attempts to add a class already in the tree, we still want to remove from the map of cases.
  */
  boolean addNodeToClassTree(String nameNodeToken, String className, String label, String derivesFrom, String derivesFromLabel, boolean expanded, boolean immutable) {
    //Find the page that we should be adding the class under
    ClipboardPage pageToAddUnder = findNodeToAddClassIn(className, derivesFrom);

    //If we had a page that the class could be added under
    if(pageToAddUnder != null) {
      //If the class already exists in the tree, pyDoClearActions should be set to true,
      //in which case, skip this logic and just return true so we know to remove this class from the case tree
      if(!pageToAddUnder.getString("pyDoClearActions").equals("true")) {
        if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Adding: " + className + " with derives: " + derivesFrom, DEBUGRS);      
        ClipboardPage newEntry = tools.createPage("Embed-Rule-Obj-Class", "");
        newEntry.putString("pyNameNodeToken", nameNodeToken);
        newEntry.putString("pyLabel", derivesFromLabel);
        newEntry.putString("pyDerivesFrom", derivesFrom);
        newEntry.putString("pyDerivesFromLabel", derivesFromLabel);
        newEntry.putString("pyExpanded", String.valueOf(expanded));
        newEntry.putString("pyIsImmutable", String.valueOf(immutable));
        pageToAddUnder.getProperty("pxResults").add(newEntry);
        if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("To parent node class: " + pageToAddUnder.getString("pyExpMyFullName") + " with derives: " + pageToAddUnder.getString("pyDerivesFrom"), DEBUGRS);
        ClipboardPage newClassNodePage = pageToAddUnder.getProperty(".pxResults(<LAST>)").getPageValue();
        //Add to our hashmap the location of our class
        this.classTreeMapLocations.put(newClassNodePage.getReference(), className);
      }
      return true;
    }

    return false;
  }

  /**
  * This method attempts to find the node for the class to be added into and return it.
  * The location for where the node should be appended is determined through a Map.
  * The map key is the location we want to add our current node under, and the new class is the value.
  * If the class can't be added to the tree, then a null ClipboardPage is returned.
  * How find is determined:
  * - If my immediate parent class is in the tree, then we should be able to add to the tree somewhere.
  * - If my class is already in the tree,
  *   - If the class I am trying to add has the same derives from as the node in the tree, don't add it.
  *   - Otherwise, determine the parent to add the class under since the derives from is different
  */
  ClipboardPage findNodeToAddClassIn(String classToBeAdded, String derivesFrom) {
    ClipboardPage pageToAddUnder = null;
    String classNameBeginsWith = pega_rules_string.whatComesBeforeLast(classToBeAdded, '-');
    //If the class tree contains the parent to the current class, and doesn't already contain my current class, then add it to the tree
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("----------------------", DEBUGRS);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Class to be added: " + classToBeAdded, DEBUGRS);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Derives from for class to be added: " + derivesFrom, DEBUGRS);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Looking for a node in tree with class: " + classNameBeginsWith + " to add under.", DEBUGRS);

    //If our classtree map contains a class with what comes before the last '-' in our current classname
    if(this.classTreeMapLocations.containsValue(classNameBeginsWith)) {
      if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Class can be added to the tree somewhere.", DEBUGRS);      
      //If the map already contains the actual class we want to add, check if the derives from for the current
      //matches the entry in the map with the derives from for the class we want to add
      if(this.classTreeMapLocations.containsValue(classToBeAdded)) {
        if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Class already exists somewhere in the tree possibly.", DEBUGRS);      
        boolean foundDerivesFromAlready = false;
        Iterator<String> iter = this.classTreeMapLocations.keySet().iterator();
        while (iter.hasNext()) {
          String currLocation = iter.next();
          String currClass = this.classTreeMapLocations.get(currLocation);
          //If my current class matches and my derives from matches
          if(currClass.equals(classToBeAdded)) {
            ClipboardPage currLocationPage = tools.findPage(currLocation);
            String currDerivesFrom = currLocationPage.getString("pyDerivesFrom");
            if(currDerivesFrom.equals(derivesFrom)) {
              foundDerivesFromAlready = true;
              break;
            }
          }
        }      
        //If the class is a duplicate name, but the derives from is different, then add it to the parent node anyway
        if(!foundDerivesFromAlready) {
          if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Class exists with different derives from in the tree. Still adding.", DEBUGRS);      
          pageToAddUnder = getParentNodeToAddClassUnder(classNameBeginsWith, derivesFrom);
        } else { //If the class already exists in the tree, setup a dummy page with pyDoClearActions so we know to still remove this case from the map of cases later
          if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Class already exists somewhere in the tree, not adding it.", DEBUGRS);
          pageToAddUnder = tools.createPage("Embed-Rule-Obj-Class", "");
          pageToAddUnder.putString("pyDoClearActions", "true");
        }
      } else { //If the map doesn't already contain the class we want to add, then just add it to the parent
        pageToAddUnder = getParentNodeToAddClassUnder(classNameBeginsWith, derivesFrom);
      }     
    } else {
      if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Tree cannot currently have the class added to it.", DEBUGRS);
    }

    return pageToAddUnder;
  }

  /**
  * Returns the parent node that this class node should be inserted under
  * Note: If you are calling this method, it is under the assumption that you are guaranteed a node
  * - If there are more than 1 possible parent node,
  *   - Determine the most appropriate parent to add the node to
  * - Otherwise, add it to the only possible parent
  */
  ClipboardPage getParentNodeToAddClassUnder(String parentClass, String derivesFrom) {
    ClipboardPage pageToAddUnder = null;
    ArrayList<ClipboardPage> possibleParents = new ArrayList<ClipboardPage>();
    Iterator<String> iter = this.classTreeMapLocations.keySet().iterator();
    //For each of the locations in our class tree map
    while (iter.hasNext()) {
      String currLocation = iter.next();
      String currClass = this.classTreeMapLocations.get(currLocation);
      //If my current class matches and my derives from matches, add to possibleParents
      if(currClass.equals(parentClass)) {
        possibleParents.add(tools.findPage(currLocation));
      }
    }
    int numPossibleParents = possibleParents.size();
    //If the tree had multiple possible parents
    if(numPossibleParents > 1) {
      if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Tree had multiple possible parents.", DEBUGRS);
      //For each possible parent, check if the derives from for my new class starts with the derives from for the parent
      for(int i = 0; i < numPossibleParents; i++) {
        ClipboardPage possibleParent = possibleParents.get(i);
        if(derivesFrom.startsWith(possibleParent.getString("pyDerivesFrom"))) {
          pageToAddUnder = possibleParents.get(i);
          break;
        }
      }
    } else { //Otherwise, there was only 1 possible parent
      if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Tree had single possible parent.", DEBUGRS);      
      pageToAddUnder = possibleParents.get(0);
    }
    return pageToAddUnder;
  }
}

//If we already have a class tree map, then use it
if(classTreeMap != null) {
  if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("Loading class tree from existing..", DEBUGRS);
  primaryPage.replace(classTreeMap);
} else { //Otherwise, instantiate inner class and construct the class tree
  Utility utility = new Utility();
  try {
    utility.createClassTree();
  } catch(Exception e) {
    oLog.error(e);
    if(DEBUG) pega_rules_utilities.sendDebugMessageToTracer("exception: " + e.getMessage(), DEBUGRS);
    throw new PRRuntimeException(e);
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
pz_CurrentStepNum = "1";
pega.activityStepEpilog(snapshotLocalVariables(), pz_CurrentTraceInfo, pz_CurrentStepNum, "Java",pz_AttemptedStep);
}	// end try block for prolog/epilog
return pz_StepStat;
} // end of step1_circum0 definition

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


private static final com.pega.pegarules.priv.tracer.ActivityTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.ActivityTraceInfo("RULE-OBJ-ACTIVITY CODE-PEGA-LIST PZCONVERTCASETOCLASSTREE #20210421T182715.956 GMT", "Code-Pega-List pzConvertCaseToClassTree", "Pega-ProcessArchitect", "08-07-01", false, true, "", "ACTIVITY", "20210421T182715.956 GMT" ,"Rule-Obj-Activity"); }
