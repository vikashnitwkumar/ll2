package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor;


import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    public abstract void processDocument();

    public abstract DocumentType supportsType();

}