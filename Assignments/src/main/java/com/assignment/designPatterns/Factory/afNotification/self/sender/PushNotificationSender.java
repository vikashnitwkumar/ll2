package main.java.com.assignment.designPatterns.Factory.afNotification.self.sender;

import main.java.com.assignment.designPatterns.Factory.afNotification.self.NotificationType;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.notification.Notification;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.template.NotificationTemplate;

public class PushNotificationSender extends NotificationSender {

    public PushNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public void send() {
        System.out.println("Sending Push notification to " + getNotification().getRecipient());
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }
}