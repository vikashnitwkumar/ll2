package src.main.java.com.assignment.designPatterns.observerStrategy.refactoringPricingCalculation.self;

public class PricingManager {

    private static final double BASE_FARE = 5.0; // Base fare amount
    private PricingStrategy pricingStrategy;


    private PricingType pricingType;

    public PricingManager(PricingType pricingType, PricingStrategy pricingStrategy) {
        this.pricingType = pricingType;
        this.pricingStrategy = pricingStrategy;
    }

    public Double calculatePrice(RideDetails rideDetails) {
        if(pricingStrategy == null)
        throw new IllegalArgumentException("Invalid pricing type");
        return BASE_FARE + pricingStrategy.calculatePrice(rideDetails);
    }

}