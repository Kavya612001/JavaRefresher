package extras;

public class ExampleClass {

    public void publicMethod() {}
    protected void protectedMethod() {}
    private void privateMethod() {}
    void defaultMethod() {}

    public static void main(String[] args) {

        ExampleClass e = new ExampleClass();

        // all methods can be called in the same class
        e.publicMethod();
        e.protectedMethod();
        e.privateMethod();
        e.defaultMethod();
    }
}
