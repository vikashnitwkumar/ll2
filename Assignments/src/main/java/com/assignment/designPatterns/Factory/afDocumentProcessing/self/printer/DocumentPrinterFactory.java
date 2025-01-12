package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer;

import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.DocumentType;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser.DocumentParser;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor.DocumentProcessor;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor.SpreadsheetDocumentProcessor;

public class DocumentPrinterFactory {
    public static DocumentPrinter getDocumentPrinter(DocumentProcessor documentProcessor , DocumentType documentType){
        switch (documentType){
            case TEXT :
                return  new TextDocumentPrinter(documentProcessor);
            case SPREAD_SHEET:
                return new SpreadsheetDocumentPrinter(documentProcessor);
            case null, default:
                return null;
        }
    }
}
