package main.java.com.assignment.designPatterns.AdaptorFacade.langauagePatternadap.self;

import java.util.List;

public interface TranslationProviderAdapter {
    List<String> getSupportedLanguage();
    String getTranslation(TranslationRequest translationRequest);
}