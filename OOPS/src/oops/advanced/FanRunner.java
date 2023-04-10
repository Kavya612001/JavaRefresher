package oops.advanced;

public class FanRunner {

    public static void main(String[] args) {

        Fan fan = new Fan("Manufacturer1", 4.5, "white");
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte)3);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}
