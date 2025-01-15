package main.java.com.assignment.designPatterns.AdaptorFacade.travelBooking.self.services;

public class BookingApi {
    private AccommodationDetailsService accommodationDetailsService;
    private AvailabilityService availabilityService;
     private LoyaltyService loyaltyService;
    private NotificationService notificationService;

    public AccommodationDetailsService getAccommodationDetailsService() {
        return accommodationDetailsService;
    }

    public void setAccommodationDetailsService(AccommodationDetailsService accommodationDetailsService) {
        this.accommodationDetailsService = accommodationDetailsService;
    }

    public AvailabilityService getAvailabilityService() {
        return availabilityService;
    }

    public void setAvailabilityService(AvailabilityService availabilityService) {
        this.availabilityService = availabilityService;
    }

    public LoyaltyService getLoyaltyService() {
        return loyaltyService;
    }

    public void setLoyaltyService(LoyaltyService loyaltyService) {
        this.loyaltyService = loyaltyService;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public PaymentService getPaymentService() {
        return paymentService;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    private  PaymentService paymentService;
}
