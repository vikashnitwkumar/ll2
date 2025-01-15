package main.java.com.assignment.designPatterns.Factory.sfNotificationSystem.self;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {
    public Notification getNotification(NotificationType notificationType,
                                        String sender,
                                        String recipient,
                                        String message ){
        Map<String, String> map = new HashMap<>();
        map.put("sender",sender);
        map.put("recipient",recipient);
        map.put("message",message);
        switch (notificationType){
            case SMS :
                return new SmsNotification(map);
            case PUSH:
                return new PushNotification(map);
            case EMAIL:
                return new EmailNotification(map);
            default:
                return null;
        }
    }
}
