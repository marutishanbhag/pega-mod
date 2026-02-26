package com.pegarules.generated.validate;
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
import com.pega.ibm.icu.math.BigDecimal;
import com.pega.pegarules.priv.AbstractFUASupport;
import com.pega.pegarules.priv.FUAUtil;
import com.pega.pegarules.priv.LogHelper;
import com.pega.pegarules.priv.PegaAPI;
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
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
public class ra_validate_validatefiltervalue_418b98b3129cadb7a3409a9cf3f99683  extends com.pega.pegarules.priv.AbstractFUASupport implements EditValidate, FUASupport {
	private static final LogHelper  oLog = new LogHelper("Rule_Edit_Validate.ValidateFilterValue.Validate");
	public ra_validate_validatefiltervalue_418b98b3129cadb7a3409a9cf3f99683(PegaAPI aContext) {
		tools = aContext;
		pega = aContext;
	}
public boolean evaluate(ClipboardProperty theProperty) {
	boolean isEncryptedProperty = tools.getAuthorizationHandle().getABACSecurityPolicyEngine().isPropertyEncrypted(theProperty, tools);
	String  theValue = theProperty.getStringValue();
	if(isEncryptedProperty) {
	theValue = tools.getPRCrypto().decryptPropertyValue(theValue);
	}
	char  itsType = theProperty.getType();
	try {
/* handling 1 of 1 definitions (isLast)  (isOnly) */
{
/* Instance RULE-EDIT-VALIDATE VALIDATEFILTERVALUE #20210930T104835.906 GMT	Pega-RulesEngine:08-07-01	<no Circumstance>	<no Circumstance Date>	<no date range>	available=Final	baserule=false */
String prefix = "";
    boolean bFound = false;
    String strDataType = "";
    String strMappedDataType = "";
    String strPropertyVal = "";
    String strParamType = "";
    String strDefaultParamVal = "";
    ClipboardPage myStepPage = tools.getStepPage();
    ClipboardPage topPage = myStepPage.getTopLevelPage();

    String className = myStepPage.getClassName();
    topPage = myStepPage;
    while(!(className.equals("Embed-ReportContent") || className.startsWith("Rule-Obj-Report-Definition") || className.equals("Rule-Obj-Association")))
    {
        topPage = topPage.getParentPage();
        className = topPage.getClassName();
    }
    strPropertyVal = myStepPage.getString(".pyFilterValue");
    String baseClassName = topPage.getString(".pyClassName");
    String databaseType =topPage.getString("pyDatabaseType");

    if(databaseType.equals("")) {
         databaseType = pega_rulesengine_reportingutils.pzGetDBTypeForClass(baseClassName,tools);
    }

    if(strPropertyVal.equals("")){
        bFound = true;
        return bFound;
    }

    if(strPropertyVal.equals(".")){
        bFound = false;
        return bFound;
    }

    String propertyRef = "";
    if(myStepPage.getIfPresent(".pyFilterName") != null){
        String strProp = myStepPage.getString(".pyFilterName");                         
        String strClassName = "";
        String strPage= "";
        String strFilterValType = "";
        String strFilter = "";
        String strFilterDBColType="";
        String strFilterDBColType1="";
        String strFilterValDBColType="";
        String strFilterValDBColType1="";
        
        boolean isFilterPropUnxposed = false;       
        boolean isFilterValUnxposed = false;
        boolean checkTypeCompatibility=false;

        String propInfo[]=new String[5];
        String propValInfo[]=new String[5];     
        if(!strProp.equals("")){
            //Check if the filtername is a function
                      
            if(myStepPage.getBoolean(".pyIsLeftOperandAFunction")){
                strDataType = myStepPage.getString(".pyLeftOperandFunction.pyReturnType");
                strFilterDBColType = pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType,strDataType);
                strFilterDBColType1 = strFilterDBColType;
            } else{
                String filterNameReferenceType=pega_rulesengine_reportingutils.pyIsPropertyReference(strProp,topPage);
                if(filterNameReferenceType.equalsIgnoreCase("SubReportColumnReference")) {
                    String colType[]=pega_rulesengine_reportingutils.pzGetDataTypeForSubReportAlias(strProp,topPage);
                    if(colType == null) {
                        return false;
                    }            
            
                    strDataType=colType[0].replaceAll(" ","");
                    strFilterDBColType=colType[1];
                    if(databaseType.equalsIgnoreCase("SQLSERVER") && !colType[6].equalsIgnoreCase("true")) {
                        String pyClassName = "";         
                        if(className.startsWith("Rule-Obj-Report-Definition")){
                            prefix = strProp.substring(0,strProp.indexOf("."));
                            java.util.Iterator itr_SubReports = topPage.getProperty(".pyUI.pySource.pySubReportInfo").iterator();
                            ClipboardPage pgSubReport = null;
                            while (itr_SubReports.hasNext()) {
                                pgSubReport = ((ClipboardProperty ) itr_SubReports.next()).getPageValue();
                                String strCurrentPrefix = pgSubReport.getString(".pyPrefix");
                                if (strCurrentPrefix.equals(prefix)){
                                    //pyClassName = pgSubReport.getString(".pyClassName");
                                    break;
                                }
                            }
                          if(pgSubReport != null){
                            pyClassName = pgSubReport.getString(".pyClassName");
                            if(colType[7] !=null && colType[8] == null && colType[7].indexOf(".") > 0){
                              //we need to load subreport to checkout join conditions and find join definition for given prefix
                              String joinPrefix = colType[7].substring(0, colType[7].indexOf("."));
                              com.pega.pegarules.pub.util.StringMap keys= new com.pega.pegarules.pub.util.HashStringMap();
                              keys.put("pyStreamName", pgSubReport.getString("pyReportName"));
                              keys.put("pyClassName", pyClassName);
                              keys.put("pxObjClass", "Rule-Obj-Report-Definition");
                              ClipboardPage supReportPage;
                              try{
                                supReportPage = tools.getThread().getDatabase().open(keys,false);
                              }catch(DatabaseException e){
	                              throw new PRRuntimeException(e);
	                            }
                              java.util.Iterator itr_SubJoins = supReportPage.getProperty(".pyUI.pySource.pyJoinInfo").iterator();
                              while(itr_SubJoins.hasNext()){
                                ClipboardPage subJoin= ((ClipboardProperty)itr_SubJoins.next()).getPageValue();
                                String strCurrentPrefix = subJoin.getString(".pyPrefix");
                                if(strCurrentPrefix!=null && strCurrentPrefix.equals(joinPrefix)){
                                  pyClassName = subJoin.getString("pyJoinClassName");
                                    break;
                                }
                              }
                            }
                           }
                        }
                        if(colType[7] != null) {
							if(colType[7].startsWith("@@")) {
								strFilterDBColType1 = strFilterDBColType;
							} else {
								if(colType[8] != null){
									strFilterDBColType1 = colType[8];
								}
								else{
									strFilterDBColType1 =  pyClassName + "#$" + colType[7];
								}
							}
                        } else {
                            strFilterDBColType1 =  pyClassName + "#$" + colType[3];
                        }
                    }
                    // BUG-56990
                    if(colType[6].equalsIgnoreCase("true")){
                        isFilterPropUnxposed = true;
                        strFilterDBColType = pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType, strDataType);
                        strFilterDBColType1 = strFilterDBColType;
                    }else if((databaseType.equalsIgnoreCase("DB2UDB") || databaseType.equalsIgnoreCase("DB2ZOS")) && (strDataType.equalsIgnoreCase("DATE"))){
                        String subRepFieldName = colType[7];
                        ClipboardProperty cp_subReportInfo= null;
                        String subRepPrefix = strProp.substring(0,strProp.indexOf("."));
                        if(subRepPrefix.startsWith("\"") && subRepPrefix.endsWith("\"")) {
                            subRepPrefix = subRepPrefix.substring(1,subRepPrefix.length() -1 ); 
                        }
                    
                        String alias = strProp.substring(strProp.indexOf(".")+1); 
                    
                        cp_subReportInfo = topPage.getIfPresent(".pyContent.pySource.pySubReportInfo");
                    
                        if(cp_subReportInfo==null){
                            cp_subReportInfo = topPage.getIfPresent(".pySource.pySubReportInfo");
                        }
                    
                        // In case of running through JUnit's, the topPage is Rule-Obj-Report-Definition
                        if(cp_subReportInfo == null){
                            cp_subReportInfo = topPage.getIfPresent(".pyUI.pySource.pySubReportInfo");
                        }
                    
                        if(cp_subReportInfo!=null){
                            java.util.Iterator enumSubReportInfo = cp_subReportInfo.iterator(); 
                            while (enumSubReportInfo.hasNext()) {
                                ClipboardProperty propSubReportInfo = (ClipboardProperty) enumSubReportInfo.next(); 
                                ClipboardPage pageSubReportInfo = propSubReportInfo.getPageValue();
                                String subReportPrefix = pageSubReportInfo.getString(".pyPrefix");
                                if(subReportPrefix.equals(subRepPrefix)) {
                                    strFilterDBColType = null;
                                    StringMap keys = new HashStringMap();
                                    keys.put("pxObjClass", "Rule-Obj-Report-Definition");
                                    keys.put("pyClassName", pageSubReportInfo.getString(".pySubClassName"));
                                    keys.put("pyStreamName", pageSubReportInfo.getString(".pyReportName"));
                        
                                    ClipboardPage subReportPage = null;
                                    try {
                                        subReportPage = tools.getThread().getDatabase().open(keys,false);
                                    } catch(DatabaseException de) {
                                        return false;
                                    }
                                    String subRepFilterNameDataType = "";
                                    String strSubRepClassName = "";
                                    //LinkPropertyInfo linkedFilterNameInfo = (LinkPropertyInfo) LinkPropertyHandler.getInstance(context).process(strProp, subReportPage);
                                    String[] linked = pega_rulesengine_reportingutils.pzParseLinkProperty(subRepFieldName, subReportPage ,tools);
                                    boolean isLinked = linked[0] != null && linked[0].equalsIgnoreCase("true");
                                    if(isLinked){
        
                                        //if(linkedFilterNameInfo != null && linkedFilterNameInfo.isValidLinkProperty()){
                                        strSubRepClassName = linked[2];
                                        String propertyName = linked[4];
                                        try{
                                            subRepFilterNameDataType = tools.getDictionary().fromDefinition(strSubRepClassName.trim(), propertyName ,"pyStringType");
                                            String columnName = tools.getDatabase().getColumnForProperty(strSubRepClassName,propertyName);
                                            if(columnName == null) {
                                                strFilterDBColType = pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType, subRepFilterNameDataType);
                                            } else {
                                                strFilterDBColType = tools.getThread().getDatabase().getColumnDataTypeForProperty(strSubRepClassName,propertyName);
                                            }
                                        }catch (DatabaseException dbex) { 
                                            oLog.debug("exception is " + dbex);
                                        }
                                    } else {  
                                        String[] unexpPropInfo = pega_rulesengine_reportingutils.pzIsValidUnexposedScalarProperty(subRepFieldName,subReportPage,tools);
                                        if(unexpPropInfo[0].equals("true")) {
                                            isFilterPropUnxposed = true;
                                            strDataType = (unexpPropInfo[1]).replaceAll(" ", "");
                                            strClassName = unexpPropInfo[4];
                                            strFilterDBColType = pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType,strDataType);
                                        } else {
                                            if(subRepFieldName.startsWith("@@")){
                                                         strFilterDBColType= pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType,strDataType);
                                                         strFilterDBColType1 = strFilterDBColType;
                                                   }
                                                  else{
                                                         propInfo = pega_rulesengine_reportingutils.pyGetClassColNameColTypeForFilterName(subRepFieldName,subReportPage);
                                                         strClassName=propInfo[0];
                                                         strFilterDBColType= propInfo[2];
                                                         strDataType=propInfo[4];
                                                         strDataType=strDataType.replaceAll(" ","");
                                                    }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    String[] linkedFilterNameInfo = pega_rulesengine_reportingutils.pzParseLinkProperty(strProp,topPage,tools);
              
                    if(linkedFilterNameInfo[0] != null && linkedFilterNameInfo[0].equalsIgnoreCase("true")) {
                        strClassName    = linkedFilterNameInfo[2];
                        String propertyName = linkedFilterNameInfo[4];
                        try {
                            strDataType = tools.getDictionary().fromDefinition(strClassName.trim(), propertyName ,"pyStringType");
                            String columnName = tools.getDatabase().getColumnForProperty(strClassName,propertyName);
                              
                            if(columnName == null) {
                                strFilterDBColType = pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType,strDataType);
                                strFilterDBColType1 = strFilterDBColType;
                            } else  {
                                strFilterDBColType = tools.getDatabase().getColumnDataTypeForProperty(strClassName,propertyName);
                                strFilterDBColType1 = strClassName + "#$" + propertyName;
                            }
                        } catch (DatabaseException dbex) { 
                            oLog.debug("exception is " + dbex);
                        }
                    } else {
                        // // GRP-39541
                        String[] unexpPropInfo = pega_rulesengine_reportingutils.pzIsValidUnexposedScalarProperty(strProp,topPage,tools);
                        if(unexpPropInfo[0].equals("true")) {
                            isFilterPropUnxposed = true;
                            strDataType = (unexpPropInfo[1]).replaceAll(" ", "");
                            strClassName = unexpPropInfo[4];
                            strFilterDBColType = pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType,strDataType);
                            strFilterDBColType1 = strFilterDBColType;
                        } else {
                            propInfo = pega_rulesengine_reportingutils.pyGetClassColNameColTypeForFilterName(strProp,topPage);
                            strClassName=propInfo[0];
                            strFilterDBColType=propInfo[2];
                            strDataType=propInfo[4];
                            strDataType=strDataType.replaceAll(" ","");
                            strFilterDBColType1 = propInfo[0] + "#$" + propInfo[7];
                        }
                    }
                }          
            }
            //Check if caseInsensitive is checked for non text properties
            strMappedDataType=pega_rulesengine_reportingutils.pzReturnMappedPRPCType(strDataType);
            //BUG-89356
            if( (myStepPage.getString(".pyCaseInsensitive").equals("true")) && !strMappedDataType.equalsIgnoreCase("text") &&  !strMappedDataType.equalsIgnoreCase("truefalse") && !strMappedDataType.equalsIgnoreCase("true-false")  ){
                myStepPage.addMessage(strProp+" "+tools.getLocalizedTextForString("pxRequestor.pyMessageLabel","pzIgnoreCaseTextProperty"));
            }
        }

        ClipboardProperty cp_Parameters = null;
        String strParamVal ="";
        String FilterClassName ="";

        String referenceType=pega_rulesengine_reportingutils.pyIsPropertyReference(strPropertyVal,topPage);
        strFilterValDBColType="Invalid"+referenceType;

        String[] linkedFilterValInfo = pega_rulesengine_reportingutils.pzParseLinkProperty(strPropertyVal,topPage,tools);
        if(linkedFilterValInfo[0] != null && linkedFilterValInfo[0].equalsIgnoreCase("true")) {
            checkTypeCompatibility=true;
            String strFilterValClassName    = linkedFilterValInfo[2];
            String propertyName = linkedFilterValInfo[4];
            try {
                strFilterValType = tools.getDictionary().fromDefinition(strFilterValClassName.trim(), propertyName ,"pyStringType");
                String columnName = tools.getDatabase().getColumnForProperty(strFilterValClassName,propertyName);
                if(columnName == null) {
                    strFilterValDBColType = pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType,strFilterValType);
                    strFilterValDBColType1 = strFilterValDBColType;
                } else {
                    strFilterValDBColType = tools.getDatabase().getColumnDataTypeForProperty(strFilterValClassName,propertyName);
                    strFilterValDBColType1 = strFilterValClassName + "#$" + propertyName;
                }
            } catch (DatabaseException dbex) { 
                oLog.debug("exception is " + dbex);
            }
        } else {    
            // GRP-39541
            String[] unexpPropInfo = pega_rulesengine_reportingutils.pzIsValidUnexposedScalarProperty(strPropertyVal,topPage,tools);
            if(unexpPropInfo[0].equals("true")) {
                // StandardReference, JoinReference, AssociationReference
                isFilterValUnxposed = true;
                myStepPage.putString("pzPropertyTypeRHS","unexposed");
                checkTypeCompatibility=true;
                strFilterValType = unexpPropInfo[1];
                strFilterValDBColType = pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType,strFilterValType);
                strFilterValDBColType1 = strFilterValDBColType;    
            } else if(referenceType.equalsIgnoreCase("StandardReference")) {
                checkTypeCompatibility=true;
                if(tools.getDictionary().getImmutablePropertyInfo(baseClassName,strPropertyVal) == null) {
                    return false;
                }
                propValInfo=pega_rulesengine_reportingutils.pyGetClassColNameColTypeForFilterName(strPropertyVal,topPage);
                strFilterValType=propValInfo[4];
                strFilterValDBColType=propValInfo[2];
                if(propValInfo[6] != null) {
                    strFilterValDBColType1 = propValInfo[0] + "#$" + propValInfo[7];
                } else {
                    strFilterValDBColType1 = strFilterValDBColType;
                }
            } else if(referenceType.equalsIgnoreCase("PropertyReference")) {
                checkTypeCompatibility=true;
                strFilterValType=pega_rulesengine_reportingutils.pyGetTypeForPropertyReference(strPropertyVal,topPage,tools);
                strFilterValDBColType=strFilterDBColType;
                if(strFilterValType==null){
                    topPage.addMessage(strPropertyVal+" "+tools.getLocalizedTextForString("pxRequestor.pyMessageLabel","pzIsNotDefined"));
                    return false;   //No property defined, validation error
                }
                java.util.StringTokenizer tempTokenizer=new java.util.StringTokenizer(strPropertyVal,".");
                String tempPrefix=tempTokenizer.nextToken();
                try {
                    String strtempPrefixClass=pega_rulesengine_reportingutils.pyGetClassNameForPrefix(tempPrefix,topPage);
                    String columnName = tools.getDatabase().getColumnForProperty(strtempPrefixClass, strPropertyVal);
                    if (columnName == null) {
                        strFilterValDBColType1 = strFilterValDBColType; 
                    } else {
                        strFilterValDBColType1 = strtempPrefixClass + "#$" + strPropertyVal;
                    }
                }catch (DatabaseException dbex) { 
                    oLog.debug("exception is " + dbex);
                }
            } else if(referenceType.equalsIgnoreCase("JoinReference") 
                || referenceType.equalsIgnoreCase("AssociationReference")
                || referenceType.equalsIgnoreCase("IndexReference")) { // BUG-53622         
                checkTypeCompatibility=true;
                prefix=strPropertyVal.substring(0,strPropertyVal.indexOf("."));
                strFilter=strPropertyVal.substring(strPropertyVal.lastIndexOf(".")+1);
                if(referenceType.equalsIgnoreCase("JoinReference")) {
                    FilterClassName=pega_rulesengine_reportingutils.pyGetClassNameForJoinPrefix(prefix,topPage);
                } else if(referenceType.equalsIgnoreCase("AssociationReference")) {
                    FilterClassName=pega_rulesengine_reportingutils.pyGetClassNameForAssociationPrefix(prefix,topPage);
                } else {
                    FilterClassName=pega_rulesengine_reportingutils.pyGetClassNameForIndexPrefix(prefix,topPage);
                }
                if(tools.getDictionary().getImmutablePropertyInfo(FilterClassName,strFilter) == null){
                    return false;
                }
                strFilterValType=pega_rules_utilities.getPropertyField(FilterClassName,strFilter,"pyStringType",tools);
                
                propValInfo = pega_rulesengine_reportingutils.pyGetClassColNameColTypeForFilterName(strPropertyVal,topPage);
                strFilterValDBColType=propValInfo[2];
                strFilterValDBColType1 = FilterClassName + "#$" + strPropertyVal;
            } else if(referenceType.equalsIgnoreCase("SubReportColumnReference")) {
                checkTypeCompatibility = true;
                String colType[]=pega_rulesengine_reportingutils.pzGetDataTypeForSubReportAlias(strPropertyVal,topPage);
                      
                if(colType == null) {
                    return false;
                }
                String pyClassName = "";         
                if(className.startsWith("Rule-Obj-Report-Definition")){
                    prefix = strPropertyVal.substring(0,strPropertyVal.indexOf("."));
                    java.util.Iterator itr_SubReports = topPage.getProperty(".pyUI.pySource.pySubReportInfo").iterator();
                    while (itr_SubReports.hasNext()) {
                        ClipboardPage pgSubReport = ((ClipboardProperty ) itr_SubReports.next()).getPageValue();
                        String strCurrentPrefix = pgSubReport.getString(".pyPrefix");
                        if (strCurrentPrefix.equals(prefix)){
                            if(!pgSubReport.getBoolean(".pyUsageInfo(RHSFilter)")){
                                return false;
                            }
                            pyClassName = pgSubReport.getString(".pyClassName");
                            break;
                        }
                    }
                }
                      
                strFilterValType=colType[0];
                strFilterValDBColType=colType[1];

                // BUG-56990
                if(colType[6].equalsIgnoreCase("true")){
                    isFilterValUnxposed = true;
                    strFilterValDBColType = pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType, strFilterValType);
                    strFilterValDBColType1 = strFilterValDBColType;
                } else {
                    if(colType[7] != null) {
					    if(colType[7].startsWith("@@")) {
						    strFilterValDBColType1 = strFilterValDBColType;
						} else {
							if(colType[8] != null){
								strFilterValDBColType1 = colType[8];
							}
							else{
								strFilterValDBColType1 =  pyClassName + "#$" + colType[7];
							}
						}
                    } else {
                        strFilterValDBColType1 =  pyClassName + "#$" + colType[3];
                    }
                }
            }
            /* If the filter value is referenced through parameter then get the param type */
            else if(strPropertyVal.toLowerCase().startsWith("param.")){
                strParamVal = strPropertyVal.substring(strPropertyVal.lastIndexOf(".")+1);
                cp_Parameters = topPage.getProperty("pyParameters");
                java.util.Iterator enumParameters = cp_Parameters.iterator();
                while (enumParameters.hasNext()) {
                    ClipboardProperty propParameters = (ClipboardProperty) enumParameters.next();
                    ClipboardPage pageParameters = propParameters.getPageValue();
                    String strParam = pageParameters.getString("pyParametersParamName");
                    if(strParamVal.equals(strParam)){
                        if(!pageParameters.getString("pyParametersParamType").equals("")){
                            strParamType = pageParameters.getString("pyParametersParamType");
                            strFilterValType=strParamType;
                            strDefaultParamVal = pageParameters.getString("pyParametersParamDefaultValue");
                            break;
                        }
                    }
                }
            }/* If the filter value is a sql function */
            else if(referenceType.equalsIgnoreCase("SQLFunctionReference") ){
                checkTypeCompatibility=true;
                strFilterValType = myStepPage.getString(".pyRightOperandFunction.pyReturnType");
                strFilterValDBColType = pega_rulesengine_reportingutils.pzFunctionRetTypeDBColMap(databaseType,strFilterValType);
                strFilterValDBColType1 = strFilterValDBColType;
            }
        }
        //bFound =true;
        /* Compare the datatypes */
        if(checkTypeCompatibility){
            strFilterValType=strFilterValType.replaceAll(" ","");
        
            String strMappedFilterValType= pega_rulesengine_reportingutils.pzReturnMappedPRPCType(strFilterValType);
            
            //US-30992             
            if(databaseType.equalsIgnoreCase("DB2UDB") || databaseType.equalsIgnoreCase("DB2ZOS")){
                if(strMappedDataType.equalsIgnoreCase("DATE") && strMappedFilterValType.equalsIgnoreCase("DATE")){
                    if((strFilterDBColType.equalsIgnoreCase("VARCHAR") && strFilterValDBColType.equalsIgnoreCase("DATE") && isFilterPropUnxposed) 
                            || (strFilterDBColType.equalsIgnoreCase("DATE") && strFilterValDBColType.equalsIgnoreCase("VARCHAR") && isFilterValUnxposed)){
                        bFound = true;
                        return bFound;
                    }
                }
            }
            
            if(strFilterDBColType == null || strFilterValDBColType == null) {
                return false;
            }
            if(databaseType.equalsIgnoreCase("ORACLE")) {
              if((strFilterDBColType.equalsIgnoreCase("DATE") && strFilterValDBColType.equalsIgnoreCase("TIMESTAMP(6)")
                    || ((strFilterDBColType.equalsIgnoreCase("TIMESTAMP(6)") && strFilterValDBColType.equalsIgnoreCase("DATE"))))) {
                strFilterDBColType = "DATE";
                strFilterValDBColType = "DATE";
                strFilterValDBColType1 = "DATE"; 
              }
            }     
            if(strMappedDataType.equals(strMappedFilterValType)) {
                //if(pega_rulesengine_reportingutils.pzCheckCompatibilityOfColumnTypes(strFilterDBColType,strFilterValDBColType)) {
                    if(pega.getRDCommonUtils().checkCompatibilityOfColumnTypes(databaseType.equalsIgnoreCase("SQLSERVER") ? strFilterDBColType1 : strFilterDBColType,     		 databaseType.equalsIgnoreCase("SQLSERVER") ? strFilterValDBColType1 : strFilterValDBColType)) {
                    bFound = true;
                    return bFound;
                }
                else{
              	String logLevel = pega.getSystemSettings().getDynamic("Pega-Reporting","reporting/validateColumnTypeMismatchAs");
             		 if("WARN".equalsIgnoreCase(logLevel)) {
                		HashStringMap parameters = new HashStringMap();
						parameters.put("FilterName" , strProp);
                		parameters.put("FnType" , strFilterDBColType);
                		parameters.put("FilterValue" , strPropertyVal);
                		parameters.put("FvType" , strFilterValDBColType);
						com.pegarules.generated.pega_wb_default.pxAddGuardrailMessage(null,"pxColumnTypeMismatchInFilters",parameters);
                		return true;
              		} else {
                		myStepPage.addMessage(strProp+"["+strFilterDBColType +"], "+ strPropertyVal + "["+ strFilterValDBColType + "]"+" 			          		 "+tools.getLocalizedTextForString("pxRequestor.pyMessageLabel","pzNotSameExposedType"));
                return bFound;
			}
                }
            }else{
                myStepPage.addMessage(strProp+"["+ strDataType +"], "+ strPropertyVal + "["+ strFilterValType + "]"+" "+tools.getLocalizedTextForString("pxRequestor.pyMessageLabel","pzNotSameType"));
                return bFound;
            }
        }
        if(strPropertyVal.indexOf(".") >0){/* If the filter value referenced through param, get the prefix */
            prefix=strPropertyVal.substring(0 , strPropertyVal.indexOf("."));
        }
    }

    if(!strPropertyVal.equals("")){
        if(prefix.equalsIgnoreCase("Param")){
            String strMappedParamDataType=pega_rulesengine_reportingutils.pzReturnMappedPRPCType(strParamType);
                            
            if(strMappedParamDataType.equalsIgnoreCase(strMappedDataType)){
                if(!strDefaultParamVal.equals("")){
                    strPropertyVal = strDefaultParamVal;
                }else{
                    bFound = true;
                    return bFound;
                }
            }else{
                bFound = false;
                return bFound;
            }
        }
        //get the requestor locale first..//
        String localeToUse = "";
        String strTimeZone = "";
        try{
            PRThread thread = tools.getThread();
            localeToUse = thread.getLocaleName(PRThread.LOCALE_DEFAULT);
        }catch(Exception ilEx){
            localeToUse = tools.findPage("pxRequestor").getString("pxReqLocale");
        }
        /* Check the datatype of the property is integer */
        if(strDataType.equalsIgnoreCase("Integer")){
            try{
                Integer.parseInt(""+PRNumberFormat.parseLocalizedAsInteger(localeToUse,strPropertyVal));
                bFound = true;
            } catch(Exception e){
                return bFound;
            }
        }else if(strDataType.equalsIgnoreCase("Double") || strDataType.equalsIgnoreCase("Decimal")){/* Check the datatype of the property is Double or Decimal */
            try{
                Double.parseDouble(""+PRNumberFormat.parseLocalizedAsDouble(localeToUse,strPropertyVal));
                bFound = true;
            }
            catch(Exception e){
                return bFound;
            }
        }else if(strDataType.equalsIgnoreCase("Date") || strDataType.equalsIgnoreCase("Date Time") || strDataType.equalsIgnoreCase("DateTime")){
          String regularExpression = null;
          String[] datewords = { "jan", "feb", "mar", "apr",
			"may", "jun", "jul", "aug", "sep", "oct", "nov", "dec", "january",
			"february", "march", "april", "may", "june", "july", "august",
			"september", "october", "november", "december"};
          for(int i=0;i<datewords.length;i++){
            if(strPropertyVal.toLowerCase().contains(datewords[i])){
              regularExpression = "\",\"";
              break;
            }
          }
          if(regularExpression==null){
          	regularExpression = ",(?!(?:[^\",]|[^\"],[^\"])+\")";
          }
		  java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regularExpression);
          //BIX Symbolic Last Extraction time
          if(topPage.getProperty(".pyStepPageReference").getStringValue().equalsIgnoreCase("pyRDPage")){
           String  symbolicDate = strPropertyVal.replaceAll(" ", "").toLowerCase();
           if(symbolicDate.startsWith("\"") && symbolicDate.endsWith("\"")){
	           symbolicDate=symbolicDate.substring(1,symbolicDate.length()-1);
            }
            if(symbolicDate.equals("lastextractiontime")){
                return true;
            }
          } 
            /* Check the property value is the symbolic date */
            if( pega_rulesengine_reportingutils.pyIsSymbolic(strPropertyVal)) {
                 return true;
            }
           /* Check the datatype of the property is Date */
            if(strDataType.equalsIgnoreCase("Date")){

                java.util.Date date = null;
                try{
                      bFound=pega_rulesengine_reportingutils.pzValidateMultiValuedFilters(strPropertyVal,false);
                      if(!bFound)
                       {
                          bFound = pega_rulesengine_reportingutils.pzValidateMultiValuedFilters(strPropertyVal,true);
                          if(bFound)
                          {
                            String replaceSpacesRegEx = "\\s+(?!(?:[^\",]|[^\"],[^\"])+\")";
                            strPropertyVal = strPropertyVal.replaceAll(replaceSpacesRegEx,"");
                          }
                      }
                       
                       String[] filteredValues = pattern.split(strPropertyVal);
                       for(int i=0;i<filteredValues.length;i++){
                          filteredValues[i]=filteredValues[i].replaceAll("\"","");
                          if(!pega_rulesengine_reportingutils.pyIsSymbolic(filteredValues[i])) {
                            date = PRDateFormat.parseAsDate(localeToUse,null,null,filteredValues[i]);
                            java.util.Calendar cal=java.util.Calendar.getInstance();
                            cal.setTime(date);
                            String year=cal.get(java.util.Calendar.YEAR)+"";
                            if(year.length()!=4){
                                bFound = false;
                                tools.getStepStatus().backoutWorst();
                                return bFound;
                            }
                          }
                       }
                } catch (InvalidValueException tfe) {
                    bFound = false;
                    tools.getStepStatus().backoutWorst();
                    return bFound;
                }
                bFound = true;
            }else if(strDataType.equalsIgnoreCase("Date Time") || strDataType.equalsIgnoreCase("DateTime")){
             /* Check the datatype of the property is DateTime */
                java.util.Date date = null;
                try{
              			bFound=pega_rulesengine_reportingutils.pzValidateMultiValuedFilters(strPropertyVal,false);
             			if(!bFound)
             			{
                          bFound = pega_rulesengine_reportingutils.pzValidateMultiValuedFilters(strPropertyVal,true);
                          if(bFound)
                          {
							String replaceSpacesRegEx = "\\s+(?!(?:[^\",]|[^\"],[^\"])+\")";
                            strPropertyVal = strPropertyVal.replaceAll(replaceSpacesRegEx,"");
                          }
                		}
                 		String[] filteredValues = pattern.split(strPropertyVal);
                  		for(int i=0;i<filteredValues.length;i++){
                          filteredValues[i]=filteredValues[i].replaceAll("\"","");
                          if(!pega_rulesengine_reportingutils.pyIsSymbolic(filteredValues[i])) {
                            date = PRDateFormat.parseAsDateTime(localeToUse,strTimeZone,null,filteredValues[i]);
                            java.util.Calendar cal=java.util.Calendar.getInstance();
                            cal.setTime(date);
                            String year=cal.get(java.util.Calendar.YEAR)+"";
                            if(year.length()!=4){
                                bFound = false;
                                tools.getStepStatus().backoutWorst();
                                return bFound;
                            }
                          }
                        }
                }catch(InvalidValueException ex){
                    bFound = false;
                    tools.getStepStatus().backoutWorst();
                    return bFound;

                }
                bFound = true;
            }
        }else if(strDataType.equalsIgnoreCase("TimeOfDay")){/* Check the datatype of the property is TimeOfDay */
			String regularExpression = ",(?!(?:[^\",]|[^\"],[^\"])+\")";
		    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regularExpression);
            java.util.Date date = null;
            try{
              		bFound=pega_rulesengine_reportingutils.pzValidateMultiValuedFilters(strPropertyVal,false);
             		if(!bFound)
             		{
                        bFound = pega_rulesengine_reportingutils.pzValidateMultiValuedFilters(strPropertyVal,true);
                        if(bFound)
                        {
                			String replaceSpacesRegEx = "\\s+(?!(?:[^\",]|[^\"],[^\"])+\")";
                            strPropertyVal = strPropertyVal.replaceAll(replaceSpacesRegEx,"");
                        }
                    }
              		String[] filteredValues = pattern.split(strPropertyVal);
                  	for(int i=0;i<filteredValues.length;i++){
                      filteredValues[i]=filteredValues[i].replaceAll("\"","");
             			date = PRDateFormat.parseAsTime(localeToUse,null,null,filteredValues[i]);
                    }
            }catch(Exception ex){
                bFound = false;
                tools.getStepStatus().backoutWorst();
                return bFound;
            }
            bFound = true;
        }
        else if(strDataType.equalsIgnoreCase("Text")){
                     bFound=     pega_rulesengine_reportingutils.pzValidateMultiValuedFilters(strPropertyVal,false);
                     if(!bFound)
                     {
                     //try with replacing spaces
                        bFound = pega_rulesengine_reportingutils.pzValidateMultiValuedFilters(strPropertyVal,true);
                        if(bFound)
                        {//removing spaces helped..so replace filter value with the trimmed version
                        String replaceSpacesRegEx = "\\s+(?!(?:[^\",]|[^\"],[^\"])+\")";
                        strPropertyVal = strPropertyVal.replaceAll(replaceSpacesRegEx,"");
                         myStepPage.putString(".pyFilterValue",strPropertyVal);
                         }
                    }   

        } else{
            bFound = true;
        }
    }

    return bFound;
}
	} catch (java.lang.SecurityException se) {
		throw se;
	}
	 catch (Throwable aThrown) {
		throw new IndeterminateConditionalException(aThrown);
	}
}
	public void fuaInit() {
	}

	public void fuaDestroy() {
	}

private static final String oDependencies [] = {
	"Rule-Edit-Validate:VALIDATEFILTERVALUE"
	};

	public String[] getUsedRules() {
		return oDependencies;
	}

	private static final DependentRuleInfo[] oDependentRuleInfos = {
		new DependentRuleInfo("VALIDATEFILTERVALUE","Rule-Edit-Validate","",false,"","Pega-RulesEngine","08-07-01","RULE-EDIT-VALIDATE VALIDATEFILTERVALUE #20210930T104835.906 GMT","VALIDATEFILTERVALUE",true,false,"ABSOLUTE_CLASSLESS",-1557611895)
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
//	RULE-EDIT-VALIDATE VALIDATEFILTERVALUE #20210930T104835.906 GMT:20210930T104835.906 GMT

	/**
	 * provides a stand-in for uniqueness tests for the
	 * content of this stream. Created from list of rules
	 * and dates listed in the comment above this declaration.
	 * @return	32 byte hash of that list using MD5
	 */
	public static String getFUAContentHash() {
		return "f5113a947be99389e85072bd1b169457";
	}

	public String getDefinitionAppliesToClass() {
		return "";
	}
public String getAspect() {
return "Validate";
}
public com.pega.pegarules.priv.tracer.RuleTraceInfo getTraceInfoForUnqualifiedVersion() {
	return oTraceInfo_0;
}
public static String[] getRuleSetForUnqualifiedVersion() { return new String[] { oTraceInfo_0.getRuleSetName(), oTraceInfo_0.getRuleSetVersion() };}


private static final com.pega.pegarules.priv.tracer.RuleTraceInfo oTraceInfo_0 = new com.pega.pegarules.priv.tracer.RuleTraceInfo("RULE-EDIT-VALIDATE VALIDATEFILTERVALUE #20210930T104835.906 GMT", "ValidateFilterValue", "Pega-RulesEngine", "08-07-01", "20210930T104835.906 GMT");
}
