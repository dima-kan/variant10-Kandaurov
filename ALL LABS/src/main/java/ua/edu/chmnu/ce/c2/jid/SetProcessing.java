package ua.edu.chmnu.ce.c2.jid;

import java.util.*;
import java.util.stream.*;

public class SetProcessing {
    public static void main(String[] args) {
        // Create a set of integers
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // 1. Filter: Remove numbers divisible by 3
        Set<Integer> filteredSet = numbers.stream()
                .filter(n -> n % 3 != 0)  // Only keep numbers not divisible by 3
                .collect(Collectors.toSet());

        // 2. Map: Multiply each element by 2
        Set<Integer> mappedSet = filteredSet.stream()
                .map(n -> n * 2)  // Double each number
                .collect(Collectors.toSet());

        // 3. Sort: Sort the set in ascending order (using TreeSet for sorting)
        Set<Integer> sortedSet = new TreeSet<>(mappedSet);  // TreeSet sorts elements

        // 4. Iterate: Print the final set
        System.out.println("Processed Set:");
        for (int number : sortedSet) {
            System.out.println(number);  // Output each element
        }
    }
}
