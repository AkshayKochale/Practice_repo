package com.practice.test.OAuth2;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class SendEmailWithOAuth2 
{
	
	  public static void main(String[] args) {
	        try {
	            // Replace these with your OAuth2 credentials
	            String accessToken = "TTW8Q~R4sD451.FxP8mxiHEiXJMijP4ijL4snbwd";
	            String fromEmail = "sr@globalvillage.ae";
	            String toEmail = "akshaykochale78@gmail.com";
	            String subject = "Your Subject";
	            String messageBody = "Your email content goes here.";

	            // Prepare the email message in MIME format
	            String rawMessage = createRawEmail(fromEmail, toEmail, subject, messageBody);

	            // Send the email using the Gmail API
	            sendEmailWithOAuth2(accessToken, rawMessage);
	            System.out.println("email send");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private static void sendEmailWithOAuth2(String accessToken, String rawMessage) throws Exception {
	        CloseableHttpClient httpClient = HttpClients.createDefault();

	        try {
	            // Create a POST request to the Gmail API's messages.send endpoint
	            URIBuilder uriBuilder = new URIBuilder("https://www.googleapis.com/gmail/v1/users/me/messages/send");
	            HttpPost httpPost = new HttpPost(uriBuilder.build());

	            // Set the OAuth2 access token in the request headers
	            httpPost.addHeader("Authorization", "Bearer " + accessToken);
	            httpPost.addHeader("Content-Type", "application/json");

	            // Set the email message as the request entity
	            httpPost.setEntity(new StringEntity(rawMessage));

	            // Execute the request
	            HttpResponse response = httpClient.execute(httpPost);
	            
	            // Handle the response as needed
	            
	            System.out.println(response);

	        } finally {
	            httpClient.close();
	        }
	    }

	    private static String createRawEmail(String from, String to, String subject, String messageBody) {
	        // Build a MIME-formatted email message
	        // (You can use a library like JavaMail for more complex messages)
	        StringBuilder email = new StringBuilder();
	        email.append("From: " + from + "\r\n");
	        email.append("To: " + to + "\r\n");
	        email.append("Subject: " + subject + "\r\n");
	        email.append("\r\n"); // Empty line to separate headers from the message body
	        email.append(messageBody);

	        return email.toString();
	    }

}
