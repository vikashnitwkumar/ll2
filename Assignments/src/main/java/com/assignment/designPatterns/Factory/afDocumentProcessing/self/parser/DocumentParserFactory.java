package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser;

import main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.DocumentType;

public class DocumentParserFactory  {
    public static DocumentParser getDocumentParser(String path ,DocumentType documentType){
        switch (documentType){
            case TEXT :
                return  new TextDocumentParser(path);
            case SPREAD_SHEET:
                return new SpreadsheetDocumentParser(path);
            case null, default:
                return null;
        }
    }
}
