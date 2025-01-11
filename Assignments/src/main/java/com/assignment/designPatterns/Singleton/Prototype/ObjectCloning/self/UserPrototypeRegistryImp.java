package main.java.com.assignment.designPatterns.Singleton.Prototype.ObjectCloning.self;

import java.util.HashMap;
import java.util.Map;

public class UserPrototypeRegistryImp implements UserPrototypeRegistry{
    private Map<UserType, User> userRegistry = new HashMap<>();

    @Override
    public void addPrototype(User user) {
        userRegistry.put(user.getType(), user);
    }

    @Override
    public User getPrototype(UserType type) {
        return userRegistry.getOrDefault(type, null);
    }

    @Override
    public User clone(UserType type) {
        if(userRegistry.containsKey(type)) return  userRegistry.get(type).cloneObject();
        return null;
    }
}
