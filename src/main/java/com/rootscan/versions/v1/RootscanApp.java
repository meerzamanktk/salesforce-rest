
/**
 * Copyright (c) 2018, rootscan.net.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided
 * that the following conditions are met:
 *
 *    Redistributions of source code must retain the above copyright notice, this list of conditions and the
 *    following disclaimer.
 *
 *    Redistributions in binary form must reproduce the above copyright notice, this list of conditions and
 *    the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 *    Neither the name of salesforce.com, inc. nor the names of its contributors may be used to endorse or
 *    promote products derived from this software without specific prior written permission.
 * 
 * @author Unique IT Consulting 
 * @version 1.0
 */
package com.rootscan.versions.v1;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.salesforce.api.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

@SpringBootApplication 
@RestController
@EnableOAuth2Sso
/**
 * 
 * @author Unique IT Consulting 
 *
 */
public class RootscanApp {

    @Autowired
    private Force force;
   
    
    
    @RequestMapping(value = "{version}/mobile/sobjects/{sobjectname}", method = RequestMethod.GET)
    public String salesforceREST(OAuth2Authentication principal,HttpServletRequest request,
    		@PathVariable String version, @PathVariable String sobjectname) {
    	
    	if(Float.parseFloat(version.substring(1)) > 1)
    		return version+" is not supported ";
		ObjectMapper mapper = new ObjectMapper();    
	    
		String path = "sobjects/"+sobjectname+"/describe/compactLayouts/primary"; 
		
		
		String compact_layout_primary = force.getData(principal, path, "43.0");
		try { 
		 
			
			Primary primary = mapper.readValue(compact_layout_primary, Primary.class);
			
			List<ComponentLayoutFields> component_layout_fields = new LinkedList<ComponentLayoutFields>();
			HashMap<String, ComponentLayoutFields> comp_layout_hash = new HashMap<String, ComponentLayoutFields>();
			String fields = "";
			primary.getFieldItems().forEach(field->{
				field.getLayoutComponents().forEach(comp->{
					
					String field_api_name = comp.getDetails().getName();
					
					ComponentLayoutFields clf =  new ComponentLayoutFields();
					clf.setLabel(comp.getDetails().getLabel());
					
					clf.setName(field_api_name);
					clf.setTabOrder(comp.getTabOrder());
					component_layout_fields.add(clf);
					
					
					comp_layout_hash.put(field_api_name, clf);
					if(!fields.isEmpty())
					{
						fields.concat(",");
					}
					
					fields.concat(field_api_name);
					
				});
				
			});
			
			compact_layout_primary = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(component_layout_fields);
			
			String response = force.getRecords(principal, "query/?q=SELECT "+
					comp_layout_hash.keySet().toString().substring(1, comp_layout_hash.keySet().toString().length()-1)
					+" from "+sobjectname, "43.0");
			//List<ComponentLayoutFields> clfs = (List<ComponentLayoutFields>) mapper.readValue(response, ComponentLayoutFields.class);
			
			compact_layout_primary = response;//mapper.writerWithDefaultPrettyPrinter().writeValueAsString(clfs);
			
			//items.forEach(item->System.out.println(item));
			
		//path = request.getServletPath();
			
		//path = path.substring(9);
		 
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	return compact_layout_primary;//force.getData(principal, path, "43.0");

    	 
    	
    	 
    }
   

    public static void main(String[] args) {
    	
    	System.setProperty("server.servlet.context-path", "/doc/index");
    	
        SpringApplication.run(RootscanApp.class, args);
        
    }

}
