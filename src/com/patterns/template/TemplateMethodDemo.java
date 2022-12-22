package com.patterns.template;

public class TemplateMethodDemo {
    
    public static void main(String[] args) {
        // Create a new CSVDataProcessor object
        DataProcessor processor = new CSVDataProcessor();
        
        // Call the processData method to execute the data processing algorithm
        processor.processData();
    }
}