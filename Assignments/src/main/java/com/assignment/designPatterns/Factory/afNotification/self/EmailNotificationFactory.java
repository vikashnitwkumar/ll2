package main.java.com.assignment.designPatterns.Factory.afNotification.self;

import main.java.com.assignment.designPatterns.Factory.afNotification.self.notification.EmailNotification;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.notification.Notification;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.sender.EmailNotificationSender;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.sender.NotificationSender;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.template.EmailNotificationTemplate;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.template.NotificationTemplate;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public Notification getNotification(String recipient, String sender, NotificationTemplate template) {
        return new EmailNotification(recipient, sender, template);
    }

    @Override
    public NotificationSender getNotificationSender(Notification notification) {
        return new EmailNotificationSender(notification);
    }

    @Override
    public NotificationTemplate getNotificationTemplate(String message) {
        return new EmailNotificationTemplate(message);
    }
}