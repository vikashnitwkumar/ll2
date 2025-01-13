package src.main.java.com.assignment.designPatterns.observerStrategy.refactoringPricingCalculation.self;

public interface PricingStrategy {
    PricingType supportsType();
    Double calculatePrice(RideDetails rideDetails);
}