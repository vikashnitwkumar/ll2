package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer;

import  main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.DocumentType;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor.*;

public class SpreadsheetDocumentPrinter extends DocumentPrinter {

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    public void printDocument() {
        // Print spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}