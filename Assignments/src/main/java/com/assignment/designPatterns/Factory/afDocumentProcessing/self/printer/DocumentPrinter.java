package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer;

import  main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.DocumentType;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor.*;


public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcessor() {
        return processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportsType();

}