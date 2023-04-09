package simple.conditionals;

import java.util.Scanner;

public class SwitchExerciseRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a dayNumber: ");
        int dayNumber1 = scanner.nextInt();
        boolean res = isWeekDay(dayNumber1);
        System.out.println("Is weekday: "+res);
        System.out.print("Enter a month number from 1 - 12: ");
        int monthNumber = scanner.nextInt();
        String monthName = determineNameOfMonth(monthNumber);
        System.out.println(monthName);
        System.out.print("Enter a day number from 0 - 6: ");
        int dayNumber = scanner.nextInt();
        String dayName = determineNameOfDay(dayNumber);
        System.out.println(dayName);
    }

    public static boolean isWeekDay(int dayNumber) {
        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: return true;
            case 0:
            case 6: return false;
        }
        return false;
    }

    public static String determineNameOfMonth(int monthNumber) {
        switch (monthNumber) {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
            default: return "Enter a valid monthNumber";
        }
    }

    public static String determineNameOfDay(int dayNumber) {
        switch (dayNumber) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            default: return "Enter a valid dayNumber";
        }
    }
}
