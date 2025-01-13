package main.java.com.assignment.designPatterns.flyDecorator.chesOptFly.self;

import java.util.HashMap;
import java.util.Map;

public class FlyweightRegistryImp implements FlyweightRegistry {
    Map<String, UserIntrinsicState> userRegistry = new HashMap<>();

    public void addFlyweight(UserIntrinsicState flyweight) {
        userRegistry.put(flyweight.getEmail(), flyweight);
    }

    @Override
    public UserIntrinsicState getFlyweight(String email) {
        userRegistry.getOrDefault(email, null);
    }
}
