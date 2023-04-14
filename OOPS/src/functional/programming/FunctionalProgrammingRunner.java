package functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalProgrammingRunner {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cat", "Dog", "Bat"));
        // printBasic(list);
        // printWithFP(list);
        printWithFilteringStream(list);
        // printNumbersWithStream(new ArrayList<>(Arrays.asList(1,2,3,4)));

        List<Number> numbers = new ArrayList<>(Arrays.asList(1,4,7,9));
        filterOddNumbers(numbers);
        filterEvenNumbers(numbers);

    }

    private static void printBasic(List<String> list) {
        for(String string: list) {
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list) {
        // lambda expression
        list.stream().forEach(
                element -> System.out.println(element)
        );
    }

    private static void printNumbersWithStream(List<Number> numbers) {
        numbers.stream().forEach(element -> System.out.println(element));
    }

    private static void printWithFilteringStream(List<String> list) {
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println(element));
    }

    private static void filterOddNumbers(List<Number> numbers) {
        numbers.stream()
                .filter(num -> num.intValue()%2 != 0 )
                .forEach(num -> System.out.println("Even no: " + num));
    }

    private static void filterEvenNumbers(List<Number> numbers) {
        numbers.stream()
                .filter(num -> num.intValue()%2 == 0 )
                .forEach(num -> System.out.println("Odd no: " + num));
    }
}
