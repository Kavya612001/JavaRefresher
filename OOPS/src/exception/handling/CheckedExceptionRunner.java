package exception.handling;

public class CheckedExceptionRunner {

    public static void main(String[] args) {

        someOtherMethod2();

//        try {
//            someOtherMethod();
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    private static void someOtherMethod2() throws RuntimeException{
    }

    private static void someOtherMethod() throws InterruptedException {
        Thread.sleep(2000);
    }
}
