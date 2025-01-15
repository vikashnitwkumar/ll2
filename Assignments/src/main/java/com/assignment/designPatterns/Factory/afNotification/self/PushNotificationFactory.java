package main.java.com.assignment.designPatterns.Factory.afNotification.self;

import main.java.com.assignment.designPatterns.Factory.afNotification.self.notification.Notification;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.notification.PushNotification;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.sender.NotificationSender;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.sender.PushNotificationSender;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.template.NotificationTemplate;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.template.PushNotificationTemplate;

public class PushNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public Notification getNotification(String recipient, String sender, NotificationTemplate template) {
        return new PushNotification(recipient, template);
    }

    @Override
    public NotificationSender getNotificationSender(Notification notification) {
        return new PushNotificationSender(notification);
    }

    @Override
    public NotificationTemplate getNotificationTemplate(String message) {
        return new PushNotificationTemplate(message);
    }
}