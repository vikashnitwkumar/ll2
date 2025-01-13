package src.main.java.com.assignment.designPatterns.observerStrategy.refactoringPricingCalculation.self;

public class SurgePricingStrategy implements PricingStrategy{
    private static final double SURGE_MULTIPLIER = 2.0; // Surge pricing multiplier

    private static final double BASE_FARE = 5.0;
    @Override
    public PricingType supportsType() {
        return PricingType.SURGE;
    }

    @Override
    public Double calculatePrice(RideDetails rideDetails) {
        return  (SURGE_MULTIPLIER - 1) * BASE_FARE;
    }
}