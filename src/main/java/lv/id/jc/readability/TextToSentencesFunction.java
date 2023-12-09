package lv.id.jc.readability;

import java.util.function.Function;
import java.util.stream.Stream;


/**
 * This functional interface represents a text-to-sentences converter.
 * It takes a string as input and returns a stream of sentences.
 */
@FunctionalInterface
public interface TextToSentencesFunction extends Function<String, Stream<String>> {
}
