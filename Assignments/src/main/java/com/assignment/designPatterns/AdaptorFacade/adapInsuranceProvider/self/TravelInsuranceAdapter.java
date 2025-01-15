package main.java.com.assignment.designPatterns.AdaptorFacade.adapInsuranceProvider.self;

public interface TravelInsuranceAdapter {
     void submitClaim(InsuranceRequest insuranceRequest) ;

    String getClaimStatus(InsuranceRequest insuranceRequest);
}