package simple.loops;

public class WhileNumberPlayer {

    private int number;

    public WhileNumberPlayer(int number) {
        this.number = number;
    }

    public void printSquareUptoLimit() {
        int i = 1;
        while(i*i < number) {
            System.out.println(i*i);
            i++;
        }
        System.out.println();
    }

    public void printCubeUptoLimit() {
        int i = 1;
        while(i*i*i < number) {
            System.out.println(i*i*i);
            i++;
        }
        System.out.println();
    }
}
