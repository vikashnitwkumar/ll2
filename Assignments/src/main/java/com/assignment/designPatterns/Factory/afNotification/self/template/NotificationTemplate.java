package main.java.com.assignment.designPatterns.Factory.afNotification.self.template;

import main.java.com.assignment.designPatterns.Factory.afNotification.self.NotificationType;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.notification.Notification;
import main.java.com.assignment.designPatterns.Factory.afNotification.self.template.NotificationTemplate;

public abstract class NotificationTemplate {
    private String message;
    
    public NotificationTemplate(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
    
    public abstract String applyTemplate();
    public abstract NotificationType notificationType();

}