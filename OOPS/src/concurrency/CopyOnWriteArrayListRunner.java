package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

    public static void main(String[] args) {

        // add operations is done by copying the entire array, switches the old array with the new one

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("Kavya");
        list.add("Premalatha");
        list.add("Sampath");

        for(String ele: list) {
            System.out.println(ele);
        }
    }
}
