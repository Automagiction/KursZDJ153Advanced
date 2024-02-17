package pl.sdacademy.java.advanced.exercises.day3.Task27;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner<T> {
    private final String delimiter;

    public Joiner(String delimiter) {
        this.delimiter = delimiter;
    }
    public String join(T... parts) {
        return Stream.of(parts)
                //.map(part -> part.toString())
                .map(Object::toString)
                .collect(Collectors.joining(delimiter));
    }
//    public String dummy(int first, int... second) {
//        return null;
//    }
//    public String dummy2(int... second, int first) {        //var Args nie może być na poczatku!
//        return null;
//    }
//    public String dummy2(int first, int... second, int... third) {        //var Args nie może wystąpić więcej niż jeden!
//        return null;
//    }
}
