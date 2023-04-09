package simple.conditionals;

public class IfStatementRunner {

    public static void main(String[] args) {
        int i = 26;
        // only one block of code is executed
        if(i == 25) {
            System.out.println("i == 25");
        } else if(i == 24) {
            System.out.println("i == 24");
        } else {
            System.out.println("i != 24 and i != 25");
        }
    }
}
