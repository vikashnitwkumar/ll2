package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer;

import  main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.*;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor.*;


public class TextDocumentPrinter extends DocumentPrinter {

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print text document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }
}