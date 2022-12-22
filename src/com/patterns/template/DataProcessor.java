package com.patterns.template;

/**
 * Abstract class representing a general data processing algorithm.
 */
abstract class DataProcessor {
    /**
     * Template method that defines the overall structure of the data processing algorithm.
     */
    public void processData() {
        // Step 1: Read the data from a file
        String data = readData();
        
        // Step 2: Validate the data
        if (!validateData(data)) {
            System.out.println("Error: Invalid data.");
            return;
        }
        
        // Step 3: Process the data
        data = processData(data);
        
        // Step 4: Write the processed data to a file
        writeData(data);
    }
    
    /**
     * Abstract method that must be implemented by subclasses to read the data from a file.
     * @return the data read from the file
     */
    protected abstract String readData();
    
    /**
     * Abstract method that must be implemented by subclasses to validate the data.
     * @param data the data to validate
     * @return true if the data is valid, false otherwise
     */
    protected abstract boolean validateData(String data);
    
    /**
     * Abstract method that must be implemented by subclasses to process the data.
     * @param data the data to process
     * @return the processed data
     */
    protected abstract String processData(String data);
    
    /**
     * Abstract method that must be implemented by subclasses to write the processed data to a file.
     * @param data the processed data to write to the file
     */
    protected abstract void writeData(String data);
}
