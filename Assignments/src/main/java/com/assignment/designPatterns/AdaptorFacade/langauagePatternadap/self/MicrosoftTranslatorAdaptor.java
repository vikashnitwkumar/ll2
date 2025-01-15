package main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self;

import main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self.external.GoogleTranslationRequest;
import main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslatorAdaptor implements TranslationProviderAdapter{
    private MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();
    @Override
    public List<String> getSupportedLanguage() {
        return microsoftTranslateApi.getSupportedLanguages();
    }

    @Override
    public String getTranslation(TranslationRequest translationRequest) {
        return microsoftTranslateApi.translate(translationRequest.getText(),
                translationRequest.getSourceLanguage(),
                translationRequest.getTargetLanguage());
    }
}
