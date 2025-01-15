package main.java.com.assignment.designPatterns.AdaptorFacade.travelBooking.self;

import main.java.com.assignment.designPatterns.AdaptorFacade.travelBooking.self.services.*;

public class BookingFacade  {

    protected AvailabilityService availabilityService;
    protected PaymentService paymentService;
    protected NotificationService notificationService;
    protected LoyaltyService loyaltyService;
    protected AccommodationDetailsService accommodationDetailsService;

    public BookingFacade(AvailabilityService availabilityService, PaymentService paymentService,
                          NotificationService notificationService, LoyaltyService loyaltyService,
                          AccommodationDetailsService accommodationDetailsService) {
        this.availabilityService = availabilityService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.loyaltyService = loyaltyService;
        this.accommodationDetailsService = accommodationDetailsService;
    }

}
