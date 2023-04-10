package oops.advanced.abstraction;

public class RecipeWithMicrowave extends AbstractRecipe {


    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.print("put it in the microwave");
    }

    @Override
    void cleanup() {
        System.out.println("clean up the utensils");
        System.out.print("switch off the microwave");
    }
}
