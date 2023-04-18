package extras;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class LengthComparator implements Comparator<String> {
//
//    @Override
//    public int compare(String o1, String o2) {
//        return Integer.compare(o1.length(), o2.length());
//    }
//}

public class AnonymousClassRunner {

    public static void main(String[] args) {

        List<String> str = Arrays.asList("Apple", "Zebra", "Volacnooo" , "Orange");
        // Anonymous inner class - no className
        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };
        Collections.sort(str, comparator);
        System.out.println(str);
    }
}
