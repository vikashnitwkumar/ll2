package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self;

public class DocumentFactoryImp {
    public static DocumentFactory getDocumentFacotry(String name, String path, DocumentType documentType){
        switch (documentType){
            case TEXT :
                return new TextDocumentFactory(name, path);
            case SPREAD_SHEET:
                return new SpreadsheetDocumentFactory(name, path);
            case null, default:
                return null;
        }
    }
}
