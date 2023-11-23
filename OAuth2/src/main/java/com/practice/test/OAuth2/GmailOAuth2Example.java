package com.practice.test.OAuth2;


import java.io.IOException;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.List;

import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.auth.oauth2.GoogleTokenResponse;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;

public class GmailOAuth2Example {
    private static final String APPLICATION_NAME = "TechnoPurple-SR-GV-Prod";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final List<String> SCOPES = Arrays.asList("https://www.googleapis.com/auth/gmail.send");
//    private static final String CREDENTIALS_FILE_PATH = "path/to/your/credentials.json";
    
    private static final String CLIENT_ID = "15039004-6de6-4a73-a8ca-dd6106343567";
    private static final String CLIENT_SECRET = "TTW8Q~R4sD451.FxP8mxiHEiXJMijP4ijL4snbwd";

    public static void main(String[] args) {
        try {
            final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();

            // Load the client secrets file (downloaded from the Google API Console)
            GoogleClientSecrets clientSecrets =  new GoogleClientSecrets();
            clientSecrets.getDetails().setClientId(CLIENT_ID);
            clientSecrets.getDetails().setClientSecret(CLIENT_SECRET);

            // Build the authorization flow and trigger the user's authorization request
            GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                    HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                    .setDataStoreFactory(new FileDataStoreFactory(new java.io.File("tokens")))
                    .setAccessType("offline")
                    .build();
            
            // Generate the URL for the user to authorize your application
            String authorizationUrl = flow.newAuthorizationUrl().setRedirectUri("urn:ietf:wg:oauth:2.0:oob").build();
            System.out.println("Go to the following link in your browser:");
            System.out.println(authorizationUrl);

            // Receive the authorization code from the user and exchange it for an access token
            System.out.println("Enter the authorization code:");
            String authorizationCode = ""/* Read the authorization code from the user input */;
            System.out.println("Received authorization code.");

            // Exchange the authorization code for an access token
            GoogleTokenResponse tokenResponse = flow.newTokenRequest(authorizationCode)
                    .setRedirectUri("urn:ietf:wg:oauth:2.0:oob")
                    .execute();

            // Now, you have the access token
            String accessToken = tokenResponse.getAccessToken();
            System.out.println("Access token: " + accessToken);
            System.out.println("done");
        } catch (IOException | GeneralSecurityException e) {
            e.printStackTrace();
        }
    }
}
