package main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self.external;

import java.util.List;

import static main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self.external.ApiUtils.*;

public class GoogleTranslateApi {

    public String convert(GoogleTranslationRequest request) {
        // Implementation for translating text using Google Translate API
        logGoogleTranslate();
        return "Translated text";
    }

    public List<String> getLanguages() {
        // Implementation for fetching supported languages from Google Translate
        logGoogleGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}