package ua.edu.chmnu.ce.c2.jid;
import java.util.Scanner;

public class SplitStringIntoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення стрічки користувачем
        System.out.print("Enter a string of numbers separated by spaces: ");
        String input = scanner.nextLine();

        // Розбиття стрічки на масив чисел
        String[] stringNumbers = input.split(" ");
        int[] numbers = new int[stringNumbers.length];

        try {
            for (int i = 0; i < stringNumbers.length; i++) {
                numbers[i] = Integer.parseInt(stringNumbers[i]);
            }

            // Виведення чисел
            System.out.println("Array of numbers:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: The input string contains non-numeric values.");
        }

        scanner.close();
    }
}

