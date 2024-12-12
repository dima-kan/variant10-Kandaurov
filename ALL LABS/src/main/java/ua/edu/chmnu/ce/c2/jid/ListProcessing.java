package ua.edu.chmnu.ce.c2.jid;
import java.util.*;
import java.util.stream.*;

public class ListProcessing {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());


        List<Integer> doubledNumbers = filteredNumbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());


        List<Integer> sortedNumbers = doubledNumbers.stream()
                .sorted()
                .collect(Collectors.toList());


        System.out.println("Processed List:");
        for (int number : sortedNumbers) {
            System.out.println(number);
        }
    }
}
