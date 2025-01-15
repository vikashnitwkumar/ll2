package main.java.com.assignment.designPatterns.Factory.afNotification.self.sender;


import main.java.com.assignment.designPatterns.Factory.afNotification.self.NotificationType;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.notification.Notification;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.template.NotificationTemplate;

public abstract class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public abstract void send();

    public abstract NotificationType notificationType();

}