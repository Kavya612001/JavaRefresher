package extras;

class DefaultClass {

}

public class NestedClassRunner {

    int i;
    class InnerClas {

        public void method() {
            i = 5;
        }
    }

    static class StaticNestedClass {

        public void method() {
//            i = 5; - error
        }
    }

    public static void main(String[] args) {

//        InnerClas ic = new InnerClas(); error - inner class instance cant exist without the instance of enclosing class

        StaticNestedClass sic = new StaticNestedClass();

        NestedClassRunner ncr = new NestedClassRunner();
        InnerClas ic = ncr.new InnerClas();

    }
}
