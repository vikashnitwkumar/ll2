package main.java.com.assignment.designPatterns.AdaptorFacade.adapInsuranceProvider.self.external;


import main.java.com.assignment.designPatterns.AdaptorFacade.adapInsuranceProvider.self.ApiUtils;

public class AutoProtectApi {

    public void addClaim(Double amount) {
        ApiUtils.logAutoProtectClaimCall();
    }

    public AutoProtectStatus getStatus(String id) {
        ApiUtils.logAutoProtectStatusCall();
        return AutoProtectStatus.APPROVED;
    }
}