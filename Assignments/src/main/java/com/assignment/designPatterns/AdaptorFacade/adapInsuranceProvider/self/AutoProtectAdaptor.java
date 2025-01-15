package main.java.com.assignment.designPatterns.AdaptorFacade.adapInsuranceProvider.self;

import main.java.com.assignment.designPatterns.AdaptorFacade.adapInsuranceProvider.self.external.AutoProtectApi;

public class AutoProtectAdaptor implements TravelInsuranceAdapter{
    AutoProtectApi autoProtectApi = new AutoProtectApi();

    @Override
    public void submitClaim(InsuranceRequest insuranceRequest) {
        autoProtectApi.addClaim(insuranceRequest.getAmount());
    }

    @Override
    public String getClaimStatus(InsuranceRequest insuranceRequest) {
        return  autoProtectApi.getStatus(insuranceRequest.getId()).toString();
    }
}
