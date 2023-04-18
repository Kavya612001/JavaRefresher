package test.access.modifiers;

import extras.ExampleClass;

public class MethodAccessRunnerDiffPkg {

    public static void main(String[] args) {

        ExampleClass e = new ExampleClass();
        e.publicMethod();
//        e.protectedMethod(); - protected and default methods can be accessed only in the same package
//        e.defaultMethod();

//        e.privateMethod(); - error , private method can be accessed only in the same class
    }
}
