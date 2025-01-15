package main.java.com.assignment.designPatterns.flyDecorator.chesOptFly.self;

import lombok.Getter;

@ExtrinsicState

public class UserExtrinsicState {
    public Colour getColour() {
        return colour;
    }

    public int getCurrentGameStreak() {
        return currentGameStreak;
    }

    public UserIntrinsicState getIntrinsicState() {
        return intrinsicState;
    }

    private Colour colour;
    private int currentGameStreak;
    UserIntrinsicState intrinsicState;
}