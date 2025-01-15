package main.java.com.assignment.designPatterns.Factory.sfNotificationSystem.self;

import java.util.Map;

public class SmsNotification extends Notification{
    private String recipient;
    private String message;

    public SmsNotification(String recipient,  String message) {
        this.recipient = recipient;
        this.message = message;
    }
    public SmsNotification(Map<String, String> map){
        this.recipient = map.get(recipient);
        this.message = map.get(message);
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public void sendNotification() {
        // Logic to send an SMS
        System.out.println("SMS sent to " + recipient);
        System.out.println("Message: " + message);
    }

    public NotificationType notificationType() {
        return NotificationType.SMS;
    }
}