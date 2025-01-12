package main.java.com.assignment.designPatterns.Factory.afNotification.self;

import main.java.com.assignment.designPatterns.Factory.afNotification.self.notification.Notification;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.sender.NotificationSender;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.template.NotificationTemplate;

public abstract class NotificationFactory {

    public abstract NotificationType notificationType();

    public abstract Notification getNotification(String recipient, String sender, NotificationTemplate template);
    public abstract NotificationSender getNotificationSender(Notification notification);
    public abstract NotificationTemplate getNotificationTemplate(String message);


}