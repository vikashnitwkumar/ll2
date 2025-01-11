package main.java.com.assignment.designPatterns.Factory.sfNotificationSystem.self;

import java.util.Map;

public class EmailNotification extends Notification{
    private String recipient;
    private String sender;
    private String message;

    public EmailNotification(String recipient, String sender, String message) {
        this.recipient = recipient;
        this.sender = sender;
        this.message = message;
    }
    public EmailNotification(Map<String, String> map){
        this.recipient = map.get(recipient);
        this.sender = map.get(sender);
        this.message = map.get(sender);
    }
    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public void sendNotification() {
        // Logic to send an email
        System.out.println("Email sent to " + recipient + " from " + sender);
        System.out.println("Message: " + message);
    }

    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }
}