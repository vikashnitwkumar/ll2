package main.java.com.assignment.designPatterns.AdaptorFacade.travelBooking.self;


import main.java.com.assignment.designPatterns.AdaptorFacade.travelBooking.self.models.*;
import main.java.com.assignment.designPatterns.AdaptorFacade.travelBooking.self.services.*;

import java.time.LocalDate;

public class BookingManager extends BookingFacade{

  BookingFacade bookingFacade;

    public BookingManager(AvailabilityService availabilityService, PaymentService paymentService, NotificationService notificationService, LoyaltyService loyaltyService, AccommodationDetailsService accommodationDetailsService) {
        super(availabilityService, paymentService, notificationService, loyaltyService, accommodationDetailsService);
    }


//    public BookingManager(BookingApi bookingApi){
//        this.availabilityService = bookingApi.getAvailabilityService();
//        this.paymentService = bookingApi.getPaymentService();
//        this.notificationService = bookingApi.getNotificationService();
//        this.loyaltyService = bookingApi.getLoyaltyService();
//        this.accommodationDetailsService = bookingApi.getAccommodationDetailsService();
//    }

    public BookingResult bookAccommodation(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        boolean isAvailable = availabilityService.checkAvailability(accommodationId, checkInDate, checkOutDate);

        if (!isAvailable) {
            return BookingResult.notAvailable("Accommodation not available for the given dates");
        }

        PaymentStatus paymentStatus = paymentService.makePayment(userId, accommodationId);
        if (paymentStatus != PaymentStatus.SUCCESS) {
            return BookingResult.paymentFailed("Payment failed with status: " + paymentStatus);
        }

        BookingConfirmation confirmation = new BookingConfirmation(userId, accommodationId, checkInDate, checkOutDate);
        notificationService.sendBookingConfirmation(confirmation);

        loyaltyService.updateLoyaltyPoints(userId, paymentService.calculatePaymentAmount(accommodationId));
        accommodationDetailsService.updateAccommodationDetails(accommodationId, checkInDate, checkOutDate);

        return BookingResult.success(confirmation);
    }

}