package functional.programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;

public class MethodReferencesRunner {

    public static void print(Integer num) {
        System.out.println(num);
    }

    public static boolean isEven(Integer i) {
        return  i % 2 == 0;
    }

    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Ant", "Bat", "Cat", "Dog", "Elephant");
        animals.stream().map(s -> s.length()).forEach(s -> System.out.println(s));

        animals.stream().map(s -> s.length()).forEach(System.out::println);

        // this is done to make the method more readable
        animals.stream().map(String::length).forEach(MethodReferencesRunner::print); //className::methodName - static methods

        // max using the terminal operator in streams - basic
        List<Integer> num = Arrays.asList(23,45,67,34);

        // storing function in variable
        Predicate<Integer> evenPredicate = n -> n % 2 == 0;
        Integer res = num.stream().filter(evenPredicate).max((n1, n2) -> Integer.compare(n1,n2)).orElse(0);
        System.out.println(res);

        Integer res1 = num.stream().filter(MethodReferencesRunner::isEven).max(Integer::compare).orElse(0);
        System.out.println("RES: " +res1);

    }
}
