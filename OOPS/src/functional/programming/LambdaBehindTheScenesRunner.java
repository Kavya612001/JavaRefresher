package functional.programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// filter method behind the scenes uses Predicate Interface
class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer n) {
        return n % 2 == 0;
    }
}

// forEach behind the scenes uses Consumer Interface
class SystemOutConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer n) {
        System.out.println(n);
    }
}

// map method behind the scene uses Function interface
class NumberSquareMapper implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return integer * integer;
    }
}

public class LambdaBehindTheScenesRunner {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23,43,34,45,36,48);
        numbers.stream()
                .filter( n -> n%2 == 0 )
                .map(n -> n*n)
                .forEach(n -> System.out.println(n));

        List<Integer> numbers1 = Arrays.asList(23,43,34,45,36,48);
        numbers1.stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSquareMapper())
                .forEach(new SystemOutConsumer());
    }
}
