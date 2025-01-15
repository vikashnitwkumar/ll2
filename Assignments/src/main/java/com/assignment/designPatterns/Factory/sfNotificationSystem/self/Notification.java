package main.java.com.assignment.designPatterns.Factory.sfNotificationSystem.self;

public abstract class Notification {
    protected String recipient;
    protected String message;
    public abstract NotificationType notificationType();
    public abstract void sendNotification() ;
}