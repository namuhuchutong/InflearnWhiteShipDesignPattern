package me.whiteship.designpatterns.facade.before;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class Client {

    public static void main(String[] args) {
        String to = "abc@abc.com";
        String from = "aaa@aaa.com";
        String host = "127.0.0.1";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(to)));
            message.setSubject("Test mail form java program");
            message.setText("mesage");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
