public class MotorBike {

    public MotorBike(int speed) {
        this.speed = speed;
    }

    //    state
    private int speed; // member variable

    public MotorBike() {
        // calls the other parameterized constructor
        this(5);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) { // local variable
        if(speed > 0) {
            this.speed = speed;
        }
    }

    //    behavior
    void start() {
        System.out.println("Bike Started...");
    }

    public void increaseSpeed(int speed) {
        setSpeed(this.speed + speed);
    }

    public void decreaseSpeed(int speed) {
        setSpeed(this.speed - speed);
    }
}
