package org.apache.maven.its.shade.reloc.lambda;

/**
 * Processor class that contains a method used as a method reference.
 */
public class Processor {
    public String process(DataHolder data) {
        return "Processed: " + data.getValue();
    }
}
