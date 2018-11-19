package miniproject;


import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
public class experiment {
   public static void main(String[] args) {
      // Recipient's email ID needs to be mentioned.
      String to = "varshitham.16cs@saividya.ac.in";
      // Sender's email ID needs to be mentioned
      String from = "varshitham.16cs@saividaya.ac.in";
      final String username = "varshitham.16cs@saividya.ac.in";//change accordingly
      final String password = "Varshitha123";//change accordingly
      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";
      Properties props = new Properties();  
      props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.socketFactory.port", "465");
    props.put("mail.smtp.socketFactory.class",
      "javax.net.ssl.SSLSocketFactory");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.port", "465");
      Session session = Session.getInstance(props,
         new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(username, password);
            }
         });
      try {
         // Create a default MimeMessage object.
         Message message = new MimeMessage(session);
         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));
         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,
            InternetAddress.parse(to));
         // Set Subject: header field
         message.setSubject(" bazinga ! ");
         // This mail has 2 part, the BODY and the embedded image
         MimeMultipart multipart = new MimeMultipart("related");
         // first part (the html)
         BodyPart messageBodyPart = new MimeBodyPart();
         String htmlText = "<H1><CENTER>WELCOME TO YTC </CENTER></H1><img src=\"cid:image\">";
         messageBodyPart.setContent(htmlText, "text/html");
         // add it
         multipart.addBodyPart(messageBodyPart);
         // second part (the image)
         messageBodyPart = new MimeBodyPart();
         DataSource fds = new FileDataSource(
            "C:/Users/acer/desktop/var.jpg");
         messageBodyPart.setDataHandler(new DataHandler(fds));
         messageBodyPart.setHeader("Content-ID", "<image>");
         // add image to the multipart
         multipart.addBodyPart(messageBodyPart);
         // put everything together
         message.setContent(multipart);
         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException e) {
         throw new RuntimeException(e);
      }
   }
}
