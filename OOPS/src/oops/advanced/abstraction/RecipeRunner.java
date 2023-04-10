package oops.advanced.abstraction;

public class RecipeRunner {

    public static void main(String[] args) {

        // Recipe1 recipe1 = new Recipe1();
        // recipe1.execute();

        RecipeWithMicrowave microwave = new RecipeWithMicrowave();
        microwave.execute();
    }
}
