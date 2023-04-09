package simple;

import java.util.Arrays;

public class StringExerciseRunner {

    public static void main(String[] args) {
        String[] daysOfWeek = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(Arrays.toString(daysOfWeek));
        
        // to find the longest string
        /*
        int longLength = 0;
        int index = 0;
        for(int i = 0; i< daysOfWeek.length; i++) {
            if(daysOfWeek[i].length() > longLength) {
                longLength = daysOfWeek[i].length();
                index = i;
            }
        }
        System.out.println("Longest String: " +daysOfWeek[index]);
         */

        // instructors solution
        String longestString = "";
        for(String day: daysOfWeek) {
            if(day.length() > longestString.length()) {
                longestString = day;
            }
        }
        System.out.println("Longest String: " +longestString);

        // print string array in reverse order
        System.out.println("----Printing in reverse order----");
        for(int i = daysOfWeek.length-1; i >=0; i--) {
            System.out.println(daysOfWeek[i]);
        }
    }
}
