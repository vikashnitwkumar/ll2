package main.java.com.assignment.designPatterns.AdaptorFacade.dataAnalysisService.self;

import main.java.com.assignment.designPatterns.AdaptorFacade.dataAnalysisService.self.services.*;
import main.java.com.assignment.designPatterns.AdaptorFacade.dataAnalysisService.self.models.*;

public class DataAnalysisManager extends DataAnalysisFacade {


    public DataAnalysisManager(DataCollectionService dataCollectionService, DataPreprocessingService dataPreprocessingService, AnalysisAlgorithmService analysisAlgorithmService, VisualizationService visualizationService) {
        super(dataCollectionService, dataPreprocessingService, analysisAlgorithmService, visualizationService);
    }

    public AnalysisResult performFullAnalysis(DataCollectionParams collectionParams,
                                              PreprocessingOptions preprocessingOptions,
                                              AnalysisAlgorithmConfig algorithmConfig) {
        // Step 1: Collect data
        DataCollectionResult collectionResult = dataCollectionService.collectData(collectionParams);

        // Step 2: Preprocess data
        PreprocessedData preprocessedData = dataPreprocessingService.preprocessData(collectionResult.getData(), preprocessingOptions);

        // Step 3: Apply analysis algorithms
        AnalysisResult analysisResult = analysisAlgorithmService.applyAnalysisAlgorithms(preprocessedData, algorithmConfig);

        // Step 4: Visualize results
        visualizationService.visualizeResults(analysisResult);

        return analysisResult;
    }

}
