package oops.advanced.inheritance;

public class EmployeeRunner {

    public static void main(String[] args) {
        Employee e = new Employee("Kavya", "Engineer");

            e.setEmail("kaya612001@gmail.com");
            e.setPhoneNumber("9360249856");
            e.setEmployeeGrade('A');

            System.out.println(e);
    }
}
