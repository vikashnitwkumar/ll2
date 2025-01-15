package main.java.com.assignment.designPatterns.Prototype.Invoice.self;

import java.util.HashMap;
import java.util.Map;

public class InvoicePrototypeRegistryImp implements  InvoicePrototypeRegistry{
    private Map<InvoiceType, Invoice> invoiceRegistry = new HashMap<>();
    @Override
    public void addPrototype(Invoice user) {
        invoiceRegistry.put(user.getType(), user);
    }

    @Override
    public Invoice getPrototype(InvoiceType type) {
        return invoiceRegistry.getOrDefault(type, null);
    }

    @Override
    public Invoice clone(InvoiceType type) {
        if(invoiceRegistry.containsKey(type)) return invoiceRegistry.get(type).cloneObject();
        return null;
    }
}
