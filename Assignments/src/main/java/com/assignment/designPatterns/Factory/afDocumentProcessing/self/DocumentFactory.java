package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self;

import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser.*;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.printer.*;
import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.processor.*;

public abstract class DocumentFactory {
    protected DocumentPrinter documentPrinter;
    protected DocumentProcessor documentProcessor;
    protected DocumentParser documentParser;
    public abstract DocumentType supportsType();
    public abstract DocumentPrinter getDocumentPrinter( );
    public abstract DocumentParser getDocumentParser(String path);
    public abstract DocumentProcessor getDocumentProcessor(String documentName);


    protected void getRelatedObjects(String documentName, String path,DocumentType documentType){
        documentProcessor = DocumentProcessorFactory.getDocumentProcessor(documentName, documentType);
        documentParser = DocumentParserFactory.getDocumentParser(path,documentType);
        documentPrinter = DocumentPrinterFactory.getDocumentPrinter(documentProcessor, documentType);
    }

}