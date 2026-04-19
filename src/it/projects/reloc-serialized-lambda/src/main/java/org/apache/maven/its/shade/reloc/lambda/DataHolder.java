package org.apache.maven.its.shade.reloc.lambda;

/**
 * A simple data class (record) used to demonstrate serialized lambda relocation.
 */
public class DataHolder {
    private final String value;

    public DataHolder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
