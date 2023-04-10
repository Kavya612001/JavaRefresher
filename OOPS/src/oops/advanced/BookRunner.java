package oops.advanced;

public class BookRunner {

    public static void main(String[] args) {
        Book book = new Book(1, "Java book", "Kavya");
        book.addReview(new Review(5, "Nice book", 5));
        book.addReview(new Review(10, "Good book", 3));

        System.out.println(book);
    }
}
