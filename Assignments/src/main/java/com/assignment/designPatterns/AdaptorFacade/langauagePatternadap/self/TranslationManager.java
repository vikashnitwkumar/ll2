package main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self;

import main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self.external.*;



public class TranslationManager {

    private GoogleTranslatorAdaptor googleTranslatorAdaptor = new GoogleTranslatorAdaptor();
    private MicrosoftTranslatorAdaptor microsoftTranslatorAdaptor = new MicrosoftTranslatorAdaptor();

    TranslationRequest translationRequest;

    public String translate(String text, String sourceLanguage, String targetLanguage, String provider) {

        translationRequest = new TranslationRequest(text, sourceLanguage, targetLanguage, 0.0);

        if (provider.equals("google")) {
            return googleTranslatorAdaptor.getTranslation(translationRequest);
        } else if (provider.equals("microsoft")) {
            return microsoftTranslatorAdaptor.getTranslation(translationRequest);
        } else {
            throw new RuntimeException("Invalid provider");
        }
    }


}