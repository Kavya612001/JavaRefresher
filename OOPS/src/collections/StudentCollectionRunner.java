package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

public class StudentCollectionRunner {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student(10, "Kavya"), new Student(2, "Sampath"), new Student(13, "Latha"));
        System.out.println(students);

        // to use the sort method on the object we need to implement the comparable interface
//        Collections.sort(students);
//        System.out.println(students);

        Collections.sort(students, new AscendingStudentComparator());
        System.out.println(students);

        students.sort(new AscendingStudentComparator());
        System.out.println(students);
    }
}
