package me.whiteship.designpatterns.facade.after;

public class Client {

    public static void main(String[] args) {

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);
        EmailMessage emailMessage = new EmailMessage();

        emailMessage.setFrom("hi");
        emailMessage.setTo("world");
        emailMessage.setSubject("abc");
        emailMessage.setText("test");
        emailSender.sendEmail(emailMessage);
    }
}
