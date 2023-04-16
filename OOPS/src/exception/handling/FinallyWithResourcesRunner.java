package exception.handling;

import java.util.Scanner;

public class FinallyWithResourcesRunner {

    public static void main(String[] args) {
        // try with resources, resources will be closed automatically, we dont need to write catch and finally blocks
        try(Scanner scanner = new Scanner(System.in)) {
            int[] numbers = {12,3,4,5};
            int number = numbers[21];
        }
    }
}
