package main.java.com.assignment.designPatterns.Prototype.ObjectCloning.self;

public interface UserPrototypeRegistry {

    void addPrototype(User user);

    User getPrototype(UserType type);

    User clone(UserType type);
}