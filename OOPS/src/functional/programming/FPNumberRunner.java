package functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FPNumberRunner {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(4,6,8,9,1));

        // reducing pair by pair to a single value
        // 0 + 4 = 4; 4 + 6 = 10; 10+8 = 18; 18+9 = 27; 27+1 = 28
        int sum = numbers.stream().reduce(0, (number1, number2) -> {
            System.out.println(number1 + " " + number2);
            return number1 + number2;
        });
        System.out.println(sum);

        // sum of odd numbers
        int oddSum = numbers.stream().filter(n -> n % 2 == 0).reduce(0, (n1, n2) -> n1 + n2 );
        System.out.println("Sum of Odd numbers: "+oddSum);

        int evenSum = numbers.stream().filter(n -> n % 2 != 0).reduce(0, (n1, n2) -> n1 + n2 );
        System.out.println("Sum of Even numbers: "+evenSum);
    }
}
