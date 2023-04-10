package oops.advanced.abstraction;

public abstract class AbstractRecipe {

    // abstract class can have non-abstract methods also
    public void execute() {
        getReady();
        doTheDish();
        cleanup();
    }

    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanup();
}
