public class BookRunner {

    public static void main(String[] args) {

        Book artOfComputeProgramming = new Book(1000);
        Book effectiveJave = new Book(1000);
        Book cleanCode = new Book(1000);

//        artOfComputeProgramming.setNoOfCopies(2);
//        effectiveJave.setNoOfCopies(3);
//        cleanCode.setNoOfCopies(1);

        cleanCode.increaseNoOfCopies(3);

        System.out.println(cleanCode.getNoOfCopies());

        System.out.println(artOfComputeProgramming.getNoOfCopies());
    }
}
