package functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExerciseRunner {

    public static void main(String[] args) {

        // print squares of 1st 10 numbers
        // IntStream - upperLimit is exclusive
        IntStream.range(1, 11)
                .map( n -> n * n)
                .forEach( n -> System.out.println(n));

        // map all of these to lowercase and print them
        List<String> words = new ArrayList<>(Arrays.asList("Apple", "Ant", "Bat"));
        words.stream().map(word -> word.toLowerCase()).forEach(w -> System.out.println(w));

        // print the length of each element
        words.stream().forEach(w -> System.out.println(w + " " + w.length()));
    }
}
