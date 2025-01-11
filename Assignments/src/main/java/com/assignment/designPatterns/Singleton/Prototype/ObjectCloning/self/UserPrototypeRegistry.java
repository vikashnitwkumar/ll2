package main.java.com.assignment.designPatterns.Singleton.Prototype.ObjectCloning.self;

public interface UserPrototypeRegistry {

    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}