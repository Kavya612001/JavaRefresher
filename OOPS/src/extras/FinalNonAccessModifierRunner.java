package extras;

final class FinalClass {

}

//class SomeClass extends FinalClass {} - Final class cannot be extended further

class SomeOther {
    final public void doSomething() {}
}

class ExtendingClass extends SomeOther {
//    public void doSomething() {} - error, final class cannot be overridden
}

public class FinalNonAccessModifierRunner {

    public static void main(String[] args) {

        final int i  = 3;
//        i = 8; error - final value cant be changed


    }
}
