package simple.Arrays;

import java.math.BigDecimal;
import java.util.Arrays;

public class StudentRunner {

    public static void main(String[] args) {

        // Student student = new Student("Kavya", new int[]{100, 70, 80});
        Student student = new Student("Kavya", 100, 70, 80);
        Student student1 = new Student("Latha", 90, 98, 99);
        Student student2 = new Student("Sampath", 90, 100);

        System.out.println(student);

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

        student.addNewMark(95);
        System.out.println(student);

        student.removeMarkAtIndex(1);
        System.out.println(student);
    }
}
