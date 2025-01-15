package main.java.com.assignment.designPatterns.Prototype.Invoice.self;


public interface InvoicePrototypeRegistry {

    void addPrototype(Invoice user);

    Invoice getPrototype(InvoiceType type);

    Invoice clone(InvoiceType type);
}
