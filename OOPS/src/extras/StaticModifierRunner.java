package extras;

class Player {
    String name;

    private static int count = 0; // static variable - one for each class

    public Player(String name) {
        this.name = name;
        count ++;
    }

    public static int getCount() {
//        System.out.println(name); error - in a static method, non static variables cant be accessed
        return count;
    }

    public static void setCount(int count) {
        Player.count = count;
    }

    public String getName() { // instance / member variables
        System.out.println(count); // here static variables can be accessed
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class StaticModifierRunner {

    public static void main(String[] args) {

        Player player1 = new Player("Sachin");
        System.out.println(Player.getCount());

        Player player2 = new Player("Kohli");
        System.out.println(Player.getCount());

    }
}
