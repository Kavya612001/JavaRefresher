package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsRunner {

    static <X> X doubleValue(X value) {
        return value;
    }

    static <X extends List> void duplicate(X list) {
        list.addAll(list);
    }

    // any list that extends number
    // ? upper bounded wildcard
    static double sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for(Number num: numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // wildcard with lower bounds
    // accepts float, int, long, double...
    static void addCoupleOfValues(List<? super Number> numbers) {
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1.0f);
        numbers.add(1l);
    }


    public static void main(String[] args) {

        List emptyList = new ArrayList<Number>();
        addCoupleOfValues(emptyList);
        System.out.println(emptyList);

        System.out.println(sumOfNumberList(Arrays.asList(1,2,3)));
        System.out.println(sumOfNumberList(Arrays.asList(1.32,2.4,3.2)));

        String value2 = doubleValue(new String());
        System.out.println(value2);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3));
        duplicate(numbers);
        System.out.println(numbers);


        MyCustomList<Long> list = new MyCustomList();
        list.addElement(5l);
        list.addElement(8l);

        Long value = list.get(0);
        System.out.println(value);

        System.out.println(list);

        MyCustomList<Integer> list2 = new MyCustomList();
        list2.addElement(Integer.valueOf(5));
        list2.addElement(Integer.valueOf(10));

        Integer value1 = list2.get(0);
        System.out.println(value1);

        System.out.println(list2);

    }
}
