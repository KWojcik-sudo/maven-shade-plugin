package org.apache.maven.its.shade.reloc.lambda;

/**
 * Main class that uses a method reference with a Serializable functional interface.
 * When compiled, this creates a serialized lambda that captures class metadata.
 */
public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor();
        DataHolder data = new DataHolder("test");
        
        // This method reference creates a serialized lambda
        String result = transform(data, processor::process);
        System.out.println(result);
    }

    public static String transform(DataHolder value, MapFunction<DataHolder, String> mapper) {
        return mapper.map(value);
    }
}
