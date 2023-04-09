package simple.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return  marks.length;
    }

    public int getTotalSumOfMarks() {
        int total = 0;
        for(int mark: marks) {
            total += mark;
        }
        return total;
    }

    public int getMaximumMark() {
        if (marks.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int maxMark = Integer.MIN_VALUE;
        for(int mark: marks) {
            if(mark > maxMark) {
                maxMark = mark;
            }
        }
        return maxMark;
    }

    public int getMinimumMark() {
        if (marks.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int minMark = Integer.MAX_VALUE;
        for(int mark: marks) {
            if(mark < minMark) {
                minMark = mark;
            }
        }
        return minMark;
    }

    public BigDecimal getAverageMarks() {

//        BigDecimal total = new BigDecimal("0");
//        BigDecimal numberOfMarks = new BigDecimal(Integer.toString(marks.length));
//        for(int i = 0; i< marks.length; i++) {
//            total = total.add(new BigDecimal(Integer.toString(marks[i])));
//        }
//        return total.divide(numberOfMarks, 2, RoundingMode.HALF_UP);

        // instructor solution
        int sum = getTotalSumOfMarks();
        int numberOfElements = getNumberOfMarks();
        // 2 - precision , Rounding mode, example:  83.3333333333333333333 => 83.33
        return (new BigDecimal(sum).divide(new BigDecimal(numberOfElements), 2, RoundingMode.HALF_UP));
    }
}
