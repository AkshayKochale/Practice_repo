package com.practice.test.OAuth2;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.codehaus.jettison.json.JSONObject;

/**
 * Hello world!
 *
 */
public class App 
{
	 public static void main(String[] args) {
	        // Replace these values with your actual credentials
	        String clientId = "15039004-6de6-4a73-a8ca-dd6106343567";
	        String scope = "https://graph.microsoft.com/.default";
	        String clientSecret = "TTW8Q~R4sD451.FxP8mxiHEiXJMijP4ijL4snbwd";
	        String tokenUrl = "https://login.microsoftonline.com/eee3385e-742f-4e2e-b130-e496ed7d6a49/oauth2/v2.0/token";

	        String access_Token=null;
	        
	        // Create an HTTP client
	        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
	            // Create a POST request
	            HttpPost httpPost = new HttpPost(tokenUrl);

	            // Set the Content-Type header
	            httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");

	            // Build the request body
	            String requestBody = "client_id=" + clientId + "&scope=" + scope + "&client_secret=" + clientSecret
	                    + "&grant_type=client_credentials";
	            httpPost.setEntity(new StringEntity(requestBody));

	            // Execute the request
	            try (CloseableHttpResponse response = httpclient.execute(httpPost)) {
	                HttpEntity entity = response.getEntity();
	                if (entity != null) {
	                    // Parse and handle the response, which contains the access token
	                    String responseText = EntityUtils.toString(entity);
	                    System.out.println(responseText);
	                    
	                    JSONObject resJson=new JSONObject(responseText);
	                    access_Token= resJson.getString("access_token");
	                    
	                    
	                    
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
