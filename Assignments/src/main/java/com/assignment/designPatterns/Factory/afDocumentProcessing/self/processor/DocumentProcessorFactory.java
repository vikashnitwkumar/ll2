package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor;

import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.DocumentType;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer.SpreadsheetDocumentPrinter;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer.TextDocumentPrinter;

public class DocumentProcessorFactory {
    public static DocumentProcessor getDocumentProcessor(String documentName, DocumentType documentType){
        switch (documentType){
            case TEXT :
                return new TextDocumentProcessor(documentName);
            case SPREAD_SHEET:
                return new SpreadsheetDocumentProcessor(documentName);
            case null, default:
                return null;
        }

    }
}
