package main.java.com.assignment.designPatterns.AdaptorFacade.adapInsuranceProvider.self;

public class InsuranceRequest {
    private Double amount;
    private String id;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InsuranceRequest(Double amount, String id) {
        this.amount = amount;
        this.id = id;
    }
}
