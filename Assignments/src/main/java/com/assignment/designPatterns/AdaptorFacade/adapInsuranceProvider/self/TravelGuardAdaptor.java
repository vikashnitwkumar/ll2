package main.java.com.assignment.designPatterns.AdaptorFacade.adapInsuranceProvider.self;

import main.java.com.assignment.designPatterns.AdaptorFacade.adapInsuranceProvider.self.external.TravelGuardApi;

public class TravelGuardAdaptor implements TravelInsuranceAdapter {
    TravelGuardApi travelGuardApi = new TravelGuardApi();

    @Override
    public void submitClaim(InsuranceRequest insuranceRequest) {
        travelGuardApi.submitClaim(insuranceRequest.getId(), insuranceRequest.getAmount());
    }

    @Override
    public String getClaimStatus(InsuranceRequest insuranceRequest) {
        return travelGuardApi.getClaimStatus(insuranceRequest.getId());
    }
}
