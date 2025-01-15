package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self;

import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser.DocumentParser;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser.DocumentParserFactory;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser.SpreadsheetDocumentParser;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser.TextDocumentParser;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer.DocumentPrinter;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer.DocumentPrinterFactory;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer.SpreadsheetDocumentPrinter;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer.TextDocumentPrinter;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor.DocumentProcessor;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor.DocumentProcessorFactory;

public class TextDocumentFactory  extends DocumentFactory{

   public TextDocumentFactory( String documentName, String path){
       getRelatedObjects(documentName, path, DocumentType.TEXT);
   }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentPrinter getDocumentPrinter() {
        return documentPrinter = DocumentPrinterFactory.getDocumentPrinter(documentProcessor, DocumentType.TEXT);
    }

    @Override
    public DocumentParser getDocumentParser(String path) {
        return documentParser = DocumentParserFactory.getDocumentParser(path, DocumentType.TEXT);
    }

    @Override
    public DocumentProcessor getDocumentProcessor(String documentName) {
        return documentProcessor =  DocumentProcessorFactory.getDocumentProcessor(documentName, DocumentType.TEXT);
    }

}