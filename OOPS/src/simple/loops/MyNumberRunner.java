package simple.loops;

public class MyNumberRunner {

    public static void main(String[] args) {
        MyNumber number = new MyNumber(9);

        boolean isPrime = number.isPrime();
        System.out.println("isPrime: "+isPrime);

        int sum = number.sumUptoN();
        System.out.println("Sum of n numbers: "+sum);

        int res = number.sumOfDivisors();
        System.out.println("Sum of divisors: "+res);

        number.printANumberTriangle();

    }
}
