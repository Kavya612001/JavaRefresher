package oops.advanced;

public class CustomerRunner {

    public static void main(String[] args) {

        Customer customer = new Customer("Kavya", new Address("3rd street", "VNR", "626001"));
        System.out.println(customer);

        customer.setWorkAddress(new Address("world trade center", "Chennai", "620000"));
        System.out.println(customer);
    }

}
