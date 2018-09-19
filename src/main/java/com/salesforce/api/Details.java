/**
 * 
 */
package com.salesforce.api;

/**
 * @author Meer Zaman 
 * @version 43.0
 *
 */
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Details
{
    private boolean aggregatable;

    private boolean aiPredictionField;

    private boolean autoNumber;

    private int byteLength;

    private boolean calculated;

    private String calculatedFormula;

    private boolean cascadeDelete;

    private boolean caseSensitive;

    private String compoundFieldName;

    private String controllerName;

    private boolean createable;

    private boolean custom;

    private String defaultValue;

    private String defaultValueFormula;

    private boolean defaultedOnCreate;

    private boolean dependentPicklist;

    private boolean deprecatedAndHidden;

    private int digits;

    private boolean displayLocationInDecimal;

    private boolean encrypted;

    private boolean externalId;

    private String extraTypeInfo;

    private boolean filterable;

    private String filteredLookupInfo;

    private boolean formulaTreatNullNumberAsZero;

    private boolean groupable;

    private boolean highScaleNumber;

    private boolean htmlFormatted;

    private boolean idLookup;

    private String inlineHelpText;

    private String label;

    private int length;

    private String mask;

    private String maskType;

    private String name;

    private boolean nameField;

    private boolean namePointing;

    private boolean nillable;

    private boolean permissionable;

    private List<String> picklistValues;

    private boolean polymorphicForeignKey;

    private int precision;

    private boolean queryByDistance;

    private String referenceTargetField;

    private List<String> referenceTo;

    private String relationshipName;

    private String relationshipOrder;

    private boolean restrictedDelete;

    private boolean restrictedPicklist;

    private int scale;

    private boolean searchPrefilterable;

    private String soapType;

    private boolean sortable;

    private String type;

    private boolean unique;

    private boolean updateable;

    private boolean writeRequiresMasterRead;

    public void setAggregatable(boolean aggregatable){
        this.aggregatable = aggregatable;
    }
    public boolean getAggregatable(){
        return this.aggregatable;
    }
    public void setAiPredictionField(boolean aiPredictionField){
        this.aiPredictionField = aiPredictionField;
    }
    public boolean getAiPredictionField(){
        return this.aiPredictionField;
    }
    public void setAutoNumber(boolean autoNumber){
        this.autoNumber = autoNumber;
    }
    public boolean getAutoNumber(){
        return this.autoNumber;
    }
    public void setByteLength(int byteLength){
        this.byteLength = byteLength;
    }
    public int getByteLength(){
        return this.byteLength;
    }
    public void setCalculated(boolean calculated){
        this.calculated = calculated;
    }
    public boolean getCalculated(){
        return this.calculated;
    }
    public void setCalculatedFormula(String calculatedFormula){
        this.calculatedFormula = calculatedFormula;
    }
    public String getCalculatedFormula(){
        return this.calculatedFormula;
    }
    public void setCascadeDelete(boolean cascadeDelete){
        this.cascadeDelete = cascadeDelete;
    }
    public boolean getCascadeDelete(){
        return this.cascadeDelete;
    }
    public void setCaseSensitive(boolean caseSensitive){
        this.caseSensitive = caseSensitive;
    }
    public boolean getCaseSensitive(){
        return this.caseSensitive;
    }
    public void setCompoundFieldName(String compoundFieldName){
        this.compoundFieldName = compoundFieldName;
    }
    public String getCompoundFieldName(){
        return this.compoundFieldName;
    }
    public void setControllerName(String controllerName){
        this.controllerName = controllerName;
    }
    public String getControllerName(){
        return this.controllerName;
    }
    public void setCreateable(boolean createable){
        this.createable = createable;
    }
    public boolean getCreateable(){
        return this.createable;
    }
    public void setCustom(boolean custom){
        this.custom = custom;
    }
    public boolean getCustom(){
        return this.custom;
    }
    public void setDefaultValue(String defaultValue){
        this.defaultValue = defaultValue;
    }
    public String getDefaultValue(){
        return this.defaultValue;
    }
    public void setDefaultValueFormula(String defaultValueFormula){
        this.defaultValueFormula = defaultValueFormula;
    }
    public String getDefaultValueFormula(){
        return this.defaultValueFormula;
    }
    public void setDefaultedOnCreate(boolean defaultedOnCreate){
        this.defaultedOnCreate = defaultedOnCreate;
    }
    public boolean getDefaultedOnCreate(){
        return this.defaultedOnCreate;
    }
    public void setDependentPicklist(boolean dependentPicklist){
        this.dependentPicklist = dependentPicklist;
    }
    public boolean getDependentPicklist(){
        return this.dependentPicklist;
    }
    public void setDeprecatedAndHidden(boolean deprecatedAndHidden){
        this.deprecatedAndHidden = deprecatedAndHidden;
    }
    public boolean getDeprecatedAndHidden(){
        return this.deprecatedAndHidden;
    }
    public void setDigits(int digits){
        this.digits = digits;
    }
    public int getDigits(){
        return this.digits;
    }
    public void setDisplayLocationInDecimal(boolean displayLocationInDecimal){
        this.displayLocationInDecimal = displayLocationInDecimal;
    }
    public boolean getDisplayLocationInDecimal(){
        return this.displayLocationInDecimal;
    }
    public void setEncrypted(boolean encrypted){
        this.encrypted = encrypted;
    }
    public boolean getEncrypted(){
        return this.encrypted;
    }
    public void setExternalId(boolean externalId){
        this.externalId = externalId;
    }
    public boolean getExternalId(){
        return this.externalId;
    }
    public void setExtraTypeInfo(String extraTypeInfo){
        this.extraTypeInfo = extraTypeInfo;
    }
    public String getExtraTypeInfo(){
        return this.extraTypeInfo;
    }
    public void setFilterable(boolean filterable){
        this.filterable = filterable;
    }
    public boolean getFilterable(){
        return this.filterable;
    }
    public void setFilteredLookupInfo(String filteredLookupInfo){
        this.filteredLookupInfo = filteredLookupInfo;
    }
    public String getFilteredLookupInfo(){
        return this.filteredLookupInfo;
    }
    public void setFormulaTreatNullNumberAsZero(boolean formulaTreatNullNumberAsZero){
        this.formulaTreatNullNumberAsZero = formulaTreatNullNumberAsZero;
    }
    public boolean getFormulaTreatNullNumberAsZero(){
        return this.formulaTreatNullNumberAsZero;
    }
    public void setGroupable(boolean groupable){
        this.groupable = groupable;
    }
    public boolean getGroupable(){
        return this.groupable;
    }
    public void setHighScaleNumber(boolean highScaleNumber){
        this.highScaleNumber = highScaleNumber;
    }
    public boolean getHighScaleNumber(){
        return this.highScaleNumber;
    }
    public void setHtmlFormatted(boolean htmlFormatted){
        this.htmlFormatted = htmlFormatted;
    }
    public boolean getHtmlFormatted(){
        return this.htmlFormatted;
    }
    public void setIdLookup(boolean idLookup){
        this.idLookup = idLookup;
    }
    public boolean getIdLookup(){
        return this.idLookup;
    }
    public void setInlineHelpText(String inlineHelpText){
        this.inlineHelpText = inlineHelpText;
    }
    public String getInlineHelpText(){
        return this.inlineHelpText;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return this.length;
    }
    public void setMask(String mask){
        this.mask = mask;
    }
    public String getMask(){
        return this.mask;
    }
    public void setMaskType(String maskType){
        this.maskType = maskType;
    }
    public String getMaskType(){
        return this.maskType;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name; 
    }
    public void setNameField(boolean nameField){
        this.nameField = nameField;
    }
    public boolean getNameField(){
        return this.nameField;
    }
    public void setNamePointing(boolean namePointing){
        this.namePointing = namePointing;
    }
    public boolean getNamePointing(){
        return this.namePointing;
    }
    public void setNillable(boolean nillable){ 
        this.nillable = nillable;
    }
    public boolean getNillable(){
        return this.nillable;
    }
    public void setPermissionable(boolean permissionable){
        this.permissionable = permissionable;
    }
    public boolean getPermissionable(){
        return this.permissionable;
    }
    public void setPicklistValues(List<String> picklistValues){
        this.picklistValues = picklistValues;
    }
    public List<String> getPicklistValues(){
        return this.picklistValues;
    }
    public void setPolymorphicForeignKey(boolean polymorphicForeignKey){
        this.polymorphicForeignKey = polymorphicForeignKey;
    }
    public boolean getPolymorphicForeignKey(){
        return this.polymorphicForeignKey;
    }
    public void setPrecision(int precision){
        this.precision = precision;
    }
    public int getPrecision(){
        return this.precision;
    }
    public void setQueryByDistance(boolean queryByDistance){
        this.queryByDistance = queryByDistance;
    }
    public boolean getQueryByDistance(){
        return this.queryByDistance;
    }
    public void setReferenceTargetField(String referenceTargetField){
        this.referenceTargetField = referenceTargetField;
    }
    public String getReferenceTargetField(){
        return this.referenceTargetField;
    }
    public void setReferenceTo(List<String> referenceTo){
        this.referenceTo = referenceTo;
    }
    public List<String> getReferenceTo(){
        return this.referenceTo;
    }
    public void setRelationshipName(String relationshipName){
        this.relationshipName = relationshipName;
    }
    public String getRelationshipName(){
        return this.relationshipName;
    }
    public void setRelationshipOrder(String relationshipOrder){
        this.relationshipOrder = relationshipOrder;
    }
    public String getRelationshipOrder(){
        return this.relationshipOrder;
    }
    public void setRestrictedDelete(boolean restrictedDelete){
        this.restrictedDelete = restrictedDelete;
    }
    public boolean getRestrictedDelete(){
        return this.restrictedDelete;
    }
    public void setRestrictedPicklist(boolean restrictedPicklist){
        this.restrictedPicklist = restrictedPicklist;
    }
    public boolean getRestrictedPicklist(){
        return this.restrictedPicklist;
    }
    public void setScale(int scale){
        this.scale = scale;
    }
    public int getScale(){
        return this.scale;
    }
    public void setSearchPrefilterable(boolean searchPrefilterable){
        this.searchPrefilterable = searchPrefilterable;
    }
    public boolean getSearchPrefilterable(){
        return this.searchPrefilterable;
    }
    public void setSoapType(String soapType){
        this.soapType = soapType;
    }
    public String getSoapType(){
        return this.soapType;
    }
    public void setSortable(boolean sortable){
        this.sortable = sortable;
    }
    public boolean getSortable(){
        return this.sortable;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setUnique(boolean unique){
        this.unique = unique;
    }
    public boolean getUnique(){
        return this.unique;
    }
    public void setUpdateable(boolean updateable){
        this.updateable = updateable;
    }
    public boolean getUpdateable(){
        return this.updateable;
    }
    public void setWriteRequiresMasterRead(boolean writeRequiresMasterRead){
        this.writeRequiresMasterRead = writeRequiresMasterRead;
    }
    public boolean getWriteRequiresMasterRead(){
        return this.writeRequiresMasterRead;
    }
}