package main.java.com.assignment.designPatterns.flyDecorator.chesOptFly.self;

public interface FlyweightRegistry {

    void addFlyweight(UserIntrinsicState flyweight);

    UserIntrinsicState getFlyweight(String email);
}