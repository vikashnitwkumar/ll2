package main.java.com.assignment.designPatterns.Factory.afNotification.self.notification;


import main.java.com.assignment.designPatterns.Factory.afNotification.self.NotificationType;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.template.NotificationTemplate;

public abstract class Notification {

    private String recipient;
    private NotificationTemplate template;

    public Notification(String recipient, NotificationTemplate template) {
        this.recipient = recipient;
        this.template = template;
    }

    public String getRecipient() {
        return recipient;
    }

    public NotificationTemplate getTemplate() {
        return template;
    }

    public abstract NotificationType notificationType();

    public abstract void sendNotification();
}