/**
 * Salesforce api
 * @author MZ-PC
 * 
 **/
package com.salesforce.api;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
/**
 * @author Meer Zaman 
 * @version 43.0
 *
 **/
@JsonIgnoreProperties(ignoreUnknown=true)
public class Primary
{
    private List<Object> actions;

    private List<FieldItems> fieldItems;

    private String id;

    private List<Object> imageItems;

    private String label;

    private String name;

    private String objectType;

    public void setActions(List<Object> actions){
        this.actions = actions;
    }
    public List<Object> getActions(){
        return this.actions;
    }
    public void setFieldItems(List<FieldItems> fieldItems){
        this.fieldItems = fieldItems;
    }
    public List<FieldItems> getFieldItems(){
        return this.fieldItems; 
    }
    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setImageItems(List<Object> imageItems){
        this.imageItems = imageItems;
    }
    public List<Object> getImageItems(){
        return this.imageItems;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setObjectType(String objectType){
        this.objectType = objectType;
    }
    public String getObjectType(){
        return this.objectType;
    }
}