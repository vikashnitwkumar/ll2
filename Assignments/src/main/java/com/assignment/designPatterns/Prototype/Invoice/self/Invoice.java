package main.java.com.assignment.designPatterns.Prototype.Invoice.self;

public class Invoice implements ClonableObject{
    private Long invoiceId;
    private String customerName;
    private Double amount;
    private String paymentMethod;
    private InvoiceType type;

    public Invoice(Long invoiceId, String customerName, Double amount, String paymentMethod, InvoiceType type) {
        this.invoiceId = invoiceId;
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.type = type;
    }
    private Invoice(Invoice invoice){
        this.invoiceId = invoice.invoiceId;
        this.customerName = invoice.customerName;
        this.amount = invoice.amount;
        this.paymentMethod = invoice.paymentMethod;
        this.type = invoice.type;
    }
    public Long getInvoiceId() {
        return invoiceId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public InvoiceType getType() {
        return type;
    }

    @Override
    public Invoice cloneObject() {
        return new Invoice(this);
    }
}
