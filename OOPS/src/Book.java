public class Book {

    private int noOfCopies;

    public Book(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        if(noOfCopies > 0) {
            this.noOfCopies = noOfCopies;
        }
    }

    public void increaseNoOfCopies(int count) {
        setNoOfCopies(this.noOfCopies + count);
    }

    public void decreaseNoOfCopies(int count) {
        setNoOfCopies(this.noOfCopies - count);
    }
}
