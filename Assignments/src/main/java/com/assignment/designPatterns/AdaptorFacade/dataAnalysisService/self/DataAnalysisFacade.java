package main.java.com.assignment.designPatterns.AdaptorFacade.dataAnalysisService.self;

import main.java.com.assignment.designPatterns.AdaptorFacade.dataAnalysisService.self.services.AnalysisAlgorithmService;
import main.java.com.assignment.designPatterns.AdaptorFacade.dataAnalysisService.self.services.DataCollectionService;
import main.java.com.assignment.designPatterns.AdaptorFacade.dataAnalysisService.self.services.DataPreprocessingService;
import main.java.com.assignment.designPatterns.AdaptorFacade.dataAnalysisService.self.services.VisualizationService;

public class DataAnalysisFacade {
    public DataCollectionService dataCollectionService;
    public DataPreprocessingService dataPreprocessingService;
    public AnalysisAlgorithmService analysisAlgorithmService;
    public VisualizationService visualizationService;

    public DataAnalysisFacade(DataCollectionService dataCollectionService,
                               DataPreprocessingService dataPreprocessingService,
                               AnalysisAlgorithmService analysisAlgorithmService,
                               VisualizationService visualizationService) {
        this.dataCollectionService = dataCollectionService;
        this.dataPreprocessingService = dataPreprocessingService;
        this.analysisAlgorithmService = analysisAlgorithmService;
        this.visualizationService = visualizationService;
    }
}
