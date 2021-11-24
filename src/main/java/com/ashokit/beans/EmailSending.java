package com.ashokit.beans;

import java.util.Properties;

import org.springframework.boot.web.servlet.server.Session;

public class EmailSending {
     public void needToSend()
     {
    	
      // email ID of Recipient.
      String recipient = "recipient@gmail.com";
 
      // email ID of  Sender.
      String sender = "sender@gmail.com";
 
      // using host as localhost
      String host = "127.0.0.1";
 
      // Getting system properties
      Properties properties = System.getProperties();
 
      // Setting up mail server
      properties.setProperty("mail.smtp.host", host);
 
      // creating session object to get properties
 
    
     }
}
