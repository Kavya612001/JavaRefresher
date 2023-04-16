package exception.handling;

import java.util.Scanner;

public class FinallyRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[]  numbers = {12,3,42};
            numbers[3] = 5;
        } catch(Exception e) {
            e.printStackTrace();
        } finally { // even when exception is not thrown, scanner.close() needs to be called, so we use finally block here
            // this needs to be called, otherwise there might be resource leakage
            System.out.println("Before scanner close");
            if(scanner != null) { // checks if the scanner has value
                scanner.close();
            }
        }
        System.out.println("Just before closing out main");
    }
}
