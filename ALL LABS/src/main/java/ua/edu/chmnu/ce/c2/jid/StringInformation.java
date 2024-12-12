package ua.edu.chmnu.ce.c2.jid;
import java.util.Scanner;

public class StringInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення стрічки користувачем
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Отримання інформації про стрічку
        System.out.println("\nString Information:");
        System.out.println("Original text: \"" + input + "\"");
        System.out.println("Length: " + input.length());
        System.out.println("Is empty: " + input.isEmpty());
        System.out.println("Trimmed text: \"" + input.trim() + "\"");

        if (!input.isEmpty()) {
            System.out.println("First character: " + input.charAt(0));
            System.out.println("Last character: " + input.charAt(input.length() - 1));
        }

        System.out.println("Contains 'Java': " + input.contains("Java"));
        System.out.println("Starts with 'Hello': " + input.startsWith("Hello"));
        System.out.println("Ends with 'world': " + input.endsWith("world"));

        if (input.length() >= 5) {
            System.out.println("Substring (0-5): \"" + input.substring(0, 5) + "\"");
        }

        System.out.println("Is blank: " + input.isBlank());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());

        scanner.close();
    }
}
