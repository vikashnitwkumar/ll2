package main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self.external;

import java.util.List;

import static main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self.external.ApiUtils.*;

public class MicrosoftTranslateApi {
    public String translate(String text, String sourceLanguage, String targetLanguage) {
        // Implementation for translating text using Microsoft Translator API
        logMicrosoftTranslate();
        return "Translated text";
    }

    // Method to retrieve the list of supported languages from Microsoft Translator
    public List<String> getSupportedLanguages() {
        // Implementation for fetching supported languages from Microsoft Translator
        logMicrosoftGetSupportedLanguages();
        return List.of("hindi", "marathi", "kannada");
    }
}