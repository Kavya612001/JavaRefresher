package oops.advanced.interfaces;

public class FlyableRunner {

    public static void main(String[] args) {

        Flyable[] flyableObjects = { new Bird(), new Aeroplane() };
        for(Flyable object: flyableObjects) {
            object.fly();
        }
    }
}
