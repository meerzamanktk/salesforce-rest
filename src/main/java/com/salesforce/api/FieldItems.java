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
public class FieldItems
{
    private boolean editableForNew;

    private boolean editableForUpdate;

    private String label;

    private List<LayoutComponents> layoutComponents;

    private boolean placeholder;

    private boolean required;

    public void setEditableForNew(boolean editableForNew){
        this.editableForNew = editableForNew;
    }
    public boolean getEditableForNew(){
        return this.editableForNew;
    }
    public void setEditableForUpdate(boolean editableForUpdate){
        this.editableForUpdate = editableForUpdate;
    }
    public boolean getEditableForUpdate(){
        return this.editableForUpdate;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }
    public void setLayoutComponents(List<LayoutComponents> layoutComponents){
        this.layoutComponents = layoutComponents;
    }
    public List<LayoutComponents> getLayoutComponents(){
        return this.layoutComponents;
    }
    public void setPlaceholder(boolean placeholder){
        this.placeholder = placeholder;
    }
    public boolean getPlaceholder(){
        return this.placeholder;
    }
    public void setRequired(boolean required){
        this.required = required;
    }
    public boolean getRequired(){
        return this.required;
    }
}
