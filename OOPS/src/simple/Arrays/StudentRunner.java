package simple.Arrays;

import java.math.BigDecimal;
import java.util.Arrays;

public class StudentRunner {

    public static void main(String[] args) {

        Student student = new Student("Kavya", new int[]{100, 70, 80});
        System.out.println("Marks array: " + Arrays.toString(student.getMarks()));

        int number = student.getNumberOfMarks();
        System.out.println("Number of marks in the array: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("Total sum of marks: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("Maximum mark: "+maximumMark);

        int minimumMark = student.getMinimumMark();
        System.out.println("Minimum mark: "+minimumMark);

        BigDecimal average = student.getAverageMarks();
        System.out.println("Average mark: "+ average);
    }
}
