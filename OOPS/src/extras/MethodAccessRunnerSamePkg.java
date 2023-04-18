package extras;

public class MethodAccessRunnerSamePkg {

    public static void main(String[] args) {

        ExampleClass e = new ExampleClass();
        e.publicMethod();
        e.protectedMethod();
        e.defaultMethod();

//        e.privateMethod(); - error , private method can be accessed only in the same class
    }
}
