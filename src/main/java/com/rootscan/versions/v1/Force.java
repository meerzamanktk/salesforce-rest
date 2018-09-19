package com.rootscan.versions.v1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
/**
 * 
 * @author Meer Zaman 
 * @version 1.0
 *
 */
@Component
public class Force {

    private static String REST_VERSION = "43.0";

    @Bean
    private OAuth2RestTemplate oAuth2RestTemplate(OAuth2ProtectedResourceDetails resource, OAuth2ClientContext context) {
        return new OAuth2RestTemplate(resource, context);
    }

    @Autowired
    private OAuth2RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    private String restUrl(OAuth2Authentication principal) {
        HashMap<String, Object> details = (HashMap<String, Object>) principal.getUserAuthentication().getDetails();
        HashMap<String, String> urls = (HashMap<String, String>) details.get("urls");
        
        return urls.get("rest").replace("{version}", REST_VERSION);
    }
    
    public String getData(OAuth2Authentication principal, String path, String version) {
        REST_VERSION = version;
        String url = restUrl(principal) + path;

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        
        return responseEntity.getBody();// restTemplate.getForObject(url, QueryResultAccount.class, params).records;
    }
    
    public String getRecords(OAuth2Authentication principal, String path, String version) {
        REST_VERSION = version;
        String url = restUrl(principal) + path;

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        
        return responseEntity.getBody();//restTemplate.getForObject(url, QueryResultAccount.class,null).records;
    }

    private static class QueryResult<T> {
        public List<T> records;
    }

    private static class QueryResultAccount extends QueryResult<Object> {}

}
