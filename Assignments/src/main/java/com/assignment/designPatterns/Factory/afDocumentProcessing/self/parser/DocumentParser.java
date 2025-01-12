package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser;


import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.DocumentType;

public abstract class DocumentParser {

    private final String path;

    public DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return path;
    }

    public abstract DocumentType supportsType();

}