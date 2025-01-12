package main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.parser;

import  main.java.com.assignment.designPatterns.Factory.afDocumentProcessing.self.DocumentType;


public class SpreadsheetDocumentParser extends DocumentParser {

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }

    public void parseDocument() {
        // Parse spreadsheet document
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }
}