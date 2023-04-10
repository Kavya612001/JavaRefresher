package oops.advanced.interfaces;

public class Project {

    public static void main(String[] args) {

        ComplexAlgorithm algo = new DummyAlgorithm();
        System.out.println(algo.complexAlgorithm(20, 30));

        ComplexAlgorithm algo1 = new RealAlgorithm();
        System.out.println(algo1.complexAlgorithm(20, 30));
    }
}
