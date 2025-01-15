package main.java.com.assignment.designPatterns.Factory.sfDocumentProcessor.self;


public class DocumentProcessorFactory {
    public DocumentProcessor createDocuments(DocumentType documentType, String docName){
        String type =  documentType.toString();
        return switch (documentType) {
            case TEXT -> new TextDocumentProcessor(docName);
            case PRESENTATION -> new PresentationDocumentProcessor(docName);
            case SPREAD_SHEET -> new SpreadsheetDocumentProcessor(docName);
            default -> null;
        };

    }
}
