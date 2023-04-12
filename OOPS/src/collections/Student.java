package collections;

import java.util.Comparator;

public class Student implements Comparator<Student> {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return " { " + id + " " +name + " }";
    }

     // this is for Comparable interface
//    @Override
//    public int compareTo(Student s) {
//        return Integer.compare(this.id, s.id);
//    }

    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getId(), s1.getId());
    }
}
