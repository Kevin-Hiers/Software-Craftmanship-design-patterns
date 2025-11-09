package be.ucll.crafsmanship.template.dataprocessor;

import java.util.ArrayList;
import java.util.List;

public class JsonProcessor extends DataProcessor {
     private List<String> data;

    public JsonProcessor(String inputFile, String outputFile) {
        super(inputFile, outputFile);
        this.data = new ArrayList<>();
    }

    protected void load() {
        System.out.println(inputFile);
        System.out.println("loading JSON...");
        this.data.add("JSON line 1");
        this.data.add("JSON line 2");
        this.data.add("JSON line 3");
    }

    protected void transform() {
        System.out.println("transforming JSON...");
        data.replaceAll(String::toUpperCase);
    }

    protected void save() {
        System.out.println("saving JSON...");
        data.forEach(line -> System.out.println(line));
        System.out.println(outputFile);
    }
}
