package ua.edu.chmnu.ce.c2.jid;

import java.util.*;
import java.util.stream.*;

public class StreamListProcessing {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        int sum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .sorted(Comparator.reverseOrder())
                .peek(System.out::println)
                .mapToInt(Integer::intValue)
                .sum();


        System.out.println("Sum of processed numbers: " + sum);
    }
}
