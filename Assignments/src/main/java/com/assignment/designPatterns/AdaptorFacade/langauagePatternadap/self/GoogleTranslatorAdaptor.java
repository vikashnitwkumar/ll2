package main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self;

import main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self.external.GoogleTranslateApi;
import main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslatorAdaptor implements TranslationProviderAdapter{
    private GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();
    @Override
    public List<String> getSupportedLanguage() {
        return googleTranslateApi.getLanguages();
    }

    @Override
    public String getTranslation(TranslationRequest translationRequest) {
        GoogleTranslationRequest request = new GoogleTranslationRequest(translationRequest.getText(),
                                                                        translationRequest.getSourceLanguage(),
                                                                        translationRequest.getTargetLanguage(),
                                                                         0.8);
        return googleTranslateApi.convert(request);
    }


}
