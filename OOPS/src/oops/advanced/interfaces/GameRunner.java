package oops.advanced.interfaces;

public class GameRunner {

    public static void main(String[] args) {

        MarioGame game = new MarioGame();
        game.up();
        game.down();
        game.left();
        game.right();

        ChessGame game1 = new ChessGame();
        game1.up();
        game1.right();

        // polymorphism
        GamingConsole game2 = new MarioGame();
        game2.up();
        game2.right();
    }
}
