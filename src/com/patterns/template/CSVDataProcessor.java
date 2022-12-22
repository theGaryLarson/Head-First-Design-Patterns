package com.patterns.template;

/**
 * Concrete subclass that provides the implementation for reading and writing CSV data.
 */
class CSVDataProcessor extends DataProcessor {
    @Override
    protected String readData() {
        // Read a single line of CSV data from a file
        return "1,2,3";
    }
    
    @Override
    protected boolean validateData(String data) {
        // Validate that the CSV data has at least one comma
        return data.contains(",");
    }
    
    @Override
    protected String processData(String data) {
        // Reverse the order of the CSV data
        String[] parts = data.split(",");
        StringBuilder sb = new StringBuilder();
        for (int i = parts.length - 1; i >= 0; i--) {
            sb.append(parts[i]);
            if (i > 0) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
    
    @Override
    protected void writeData(String data) {
        // Write the CSV data to a file
        System.out.println("Writing data to file: " + data);
    }
}