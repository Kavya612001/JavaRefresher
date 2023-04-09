public class MotorBikeRunner {

    public static void main(String[] args) {

        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);
        MotorBike someOther = new MotorBike();

        ducati.start();
        honda.start();

        ducati.setSpeed(100);
        honda.setSpeed(-50);

        // increase speed of ducati
//        int ducatiSpeed = ducati.getSpeed();
//        ducatiSpeed += 100;
        ducati.increaseSpeed(100);
        ducati.decreaseSpeed(30);

        honda.increaseSpeed(300);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(someOther.getSpeed());
    }
}
