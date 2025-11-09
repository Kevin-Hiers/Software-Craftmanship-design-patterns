package be.ucll.crafsmanship.template.dataprocessor;

public abstract class DataProcessor {
    String inputFile;
    String outputFile;
    public DataProcessor(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public final void processData() {
       load();
       transform();
       save();
    }
    protected void load() {
       // Default load implementation
    }
    protected void transform() {
       // Default transform implementation
    }
    protected void save() {
       // Default save implementation
    }
}
