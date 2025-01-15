package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser;

import  main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}