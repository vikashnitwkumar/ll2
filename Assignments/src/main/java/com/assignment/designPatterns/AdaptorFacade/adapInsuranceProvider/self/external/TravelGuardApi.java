package main.java.com.assignment.designPatterns.AdaptorFacade.adapInsuranceProvider.self.external;

import main.java.com.assignment.designPatterns.AdaptorFacade.adapInsuranceProvider.self.ApiUtils;

public class TravelGuardApi {
    
    public void submitClaim(String id, Double amount) {
        ApiUtils.logTravelGuardClaimCall();
    }

    public String getClaimStatus(String id) {
        ApiUtils.logTravelGuardStatusCall();
        return "SUCCESS";
    }
}