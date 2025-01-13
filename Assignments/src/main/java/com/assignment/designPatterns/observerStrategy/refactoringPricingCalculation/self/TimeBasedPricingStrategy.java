package src.main.java.com.assignment.designPatterns.observerStrategy.refactoringPricingCalculation.self;

public class TimeBasedPricingStrategy implements PricingStrategy{
    private static final double PER_MINUTE_RATE = 0.5; // Rate per minute

    @Override
    public PricingType supportsType() {
        return PricingType.TIME_BASED;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return PER_MINUTE_RATE * rideDetails.getDuration();
    }
}
