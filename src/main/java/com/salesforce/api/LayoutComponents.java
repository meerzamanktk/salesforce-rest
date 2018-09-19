/**
 * 
 */
package com.salesforce.api;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author Meer Zaman 
 * @version 43.0
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class LayoutComponents
{
    private Details details;

    private int displayLines;

    private int tabOrder;

    private String type;

    private String value;

    public void setDetails(Details details){
        this.details = details;
    }
    public Details getDetails(){
        return this.details;
    }
    public void setDisplayLines(int displayLines){
        this.displayLines = displayLines;
    }
    public int getDisplayLines(){
        return this.displayLines;
    }
    public void setTabOrder(int tabOrder){
        this.tabOrder = tabOrder;
    }
    public int getTabOrder(){
        return this.tabOrder;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setValue(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}

