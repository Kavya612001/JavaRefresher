package simple.loops;

public class MyNumber {

    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public boolean isPrime() {
       // Guard checks
        if(number <= 0) {
            System.out.println("Number cant be negative");
            return false;
        }
        else if(number == 1) {
            System.out.println("1 is neither prime nor composite");
            return false;
        } else {
            // 2 to number-1
            for(int i = 2; i < number-1; i++) {
                if(number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int sumUptoN() {
        int total = 0;
        for(int i = 1; i <= number; i++) {
            total += i;
        }
        return total;
    }

    public int sumOfDivisors() { // leaving 1 and itself
        int total = 0;
        for(int i = 2; i <= number-1; i++) {
            if(number % i ==0 ) {
                total += i;
            }
        }
        return total;
    }

    public void printANumberTriangle() {
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
