package exception.handling;

import java.util.Arrays;

public class ExceptionHandlingRunner2 {

    public static void main(String[] args) {
        method1();
        System.out.println("Main ended");
    }

    private static void method1() {
        method2();
        System.out.println("Method1 ended");
    }

    private static void method2() {
        try {
//            String str = null;
//            int length = str.length();
            int[] i = {1, 2};
            i[3] = 2;
        } catch(ArrayIndexOutOfBoundsException ae) {
            ae.printStackTrace();
            System.out.println(ae);
        }catch(NullPointerException ne) { // Most specific catch block is executed
            System.out.println("Null pointer Exception");
        } catch (Exception e) {
            System.out.println("Matched super class Exception");
            e.printStackTrace();
        }
        System.out.println("Method2 ended");
    }
}
