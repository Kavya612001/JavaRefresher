package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


class StringLenghtComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}

public class PriorityQueueRunner {

    public static void main(String[] args) {


        Queue<String> queue = new PriorityQueue<>(new StringLenghtComparator());
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        queue.offer("Apple");
        System.out.println(queue);

        queue.addAll(Arrays.asList("Zebra", "Monkey", "Cat"));
        System.out.println(queue); // returns in sorted order

        System.out.println(queue.poll());
        System.out.println(queue); // cat is printed since smaller length is processed first

        System.out.println(queue.poll());
        System.out.println(queue);


    }
}
