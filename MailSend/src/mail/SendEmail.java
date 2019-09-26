package mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public static void main(String[] args) {
		
		 // Recipient's email ID needs to be mentioned.
	      String to = "pkprawah@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "pawan.krit5@gmail.com";

	      // Assuming you are sending email from localhost
	      //String host = "localhost";

	      // Get system properties
	      Properties properties = System.getProperties();
	      final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	      // Setup mail server
	      properties.setProperty("mail.smtp.host", "smtp.gmail.com");
	      properties.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
	      properties.setProperty("mail.smtp.socketFactory.fallback", "false");
	      properties.setProperty("mail.smtp.port", "465");
	      properties.setProperty("mail.defaultEncoding", "UTF-8");
	      properties.setProperty("mail.smtp.socketFactory.port", "465");
	      properties.put("mail.smtp.auth", "true");
	      properties.put("mail.debug", "true");
	      properties.put("mail.store.protocol", "pop3");
	      properties.put("mail.transport.protocol", "smtp");
	      final String username = "pawan.krit5@gmail.com";
	      final String password = "HIMpkmca@#13";


	      try {
	    	  
	    	  Session session = Session.getDefaultInstance(properties, 
                      new Authenticator(){
                         protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                         }});

	    	  
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	         
	         message.addRecipient(Message.RecipientType.CC, new InternetAddress(to));
	        

	         // Set Subject: header field
	         message.setSubject("This is the Subject ");

	         // Send the actual HTML message, as big as you like
	         message.setContent("<h1>This is actual message</h1>", "text/html");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      } catch (MessagingException mex) {
	         mex.printStackTrace();
	      }

	}

}
