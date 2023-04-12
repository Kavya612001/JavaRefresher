package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

    public static void main(String[] args) {

        List<Character> characters = Arrays.asList('A', 'Z', 'A', 'B', 'Z', 'F');

        // unique elements + sort them in the order they were inserted

        // Tree
        // Hash
        // LinkedHash

        Set<Character> treeSet = new TreeSet<>(characters); // unique and sorted
        System.out.println("TreeSet: " + treeSet);

        Set<Character> linkedSet = new LinkedHashSet<>(characters); // unique and preserves in the same insertion order
        System.out.println("LinkedHashSet: " + linkedSet);

        Set<Character> hashSet = new HashSet<>(characters); // unique
        System.out.println("HashSet: " + hashSet);
    }
}
