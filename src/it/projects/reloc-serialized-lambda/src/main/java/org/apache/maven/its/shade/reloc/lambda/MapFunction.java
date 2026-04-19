package org.apache.maven.its.shade.reloc.lambda;

import java.io.Serializable;

/**
 * A serializable functional interface that will cause lambdas/method references
 * to have their class information stored in the serialized lambda metadata.
 */
@FunctionalInterface
public interface MapFunction<T, R> extends Serializable {
    R map(T t);
}
