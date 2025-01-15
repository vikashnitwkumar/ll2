package main.java.com.assignment.designPatterns.Factory.sfDocumentProcessor.self;


public abstract class DocumentProcessor {
    protected String documentName;

    public abstract DocumentType supportsType();
    public abstract void processDocument() ;
}