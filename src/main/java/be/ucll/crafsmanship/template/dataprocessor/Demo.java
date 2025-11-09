package be.ucll.crafsmanship.template.dataprocessor;

public class Demo {
    public static void main(String[] args) {
       String inputFile = "data/input";
       String outputFile = "data/output";
       DataProcessor csvProcessor = new CSVProcessor(inputFile, outputFile);
       DataProcessor jsonProcessor = new JsonProcessor(inputFile, outputFile);

       System.out.println("\nProcessing CSV Data...");
       csvProcessor.processData();

       System.out.println("\nProcessing JSON Data...");
       jsonProcessor.processData();
    }
}
