package oops.advanced;

public class RectangleRunner {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(100,50);
        System.out.println(rec);

        rec.area();
        System.out.println(rec);

        rec.perimeter();
        System.out.println(rec);

        rec.setWidth(25);
        System.out.println(rec);
    }
}
