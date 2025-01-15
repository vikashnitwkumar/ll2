package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self;

import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser.*;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer.*;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor.*;

public class SpreadsheetDocumentFactory extends DocumentFactory {

    public SpreadsheetDocumentFactory( String documentName, String path){
       getRelatedObjects(documentName, path, DocumentType.SPREAD_SHEET);
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentPrinter getDocumentPrinter( ) {
        return documentPrinter = DocumentPrinterFactory.getDocumentPrinter(documentProcessor, DocumentType.SPREAD_SHEET);
    }

    @Override
    public DocumentParser getDocumentParser(String path) {
        return documentParser = DocumentParserFactory.getDocumentParser(path, DocumentType.SPREAD_SHEET);
    }

    @Override
    public DocumentProcessor getDocumentProcessor(String documentName) {
        return documentProcessor =  DocumentProcessorFactory.getDocumentProcessor(documentName, DocumentType.SPREAD_SHEET);
    }
}