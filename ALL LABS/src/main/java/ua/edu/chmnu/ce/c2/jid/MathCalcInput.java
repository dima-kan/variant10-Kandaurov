package ua.edu.chmnu.ce.c2.jid;

/*
variant 10

 */
import java.util.Scanner;

public class MathCalcInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ведіть значення x: ");
        double x = scanner.nextDouble();

        System.out.print("Ведіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Ведіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Ведіть значення c: ");
        double c = scanner.nextDouble();

        double result = Math.exp( a*Math.cos(x + 2)) - Math.exp(-Math.sin(b*x)) / (c - Math.sqrt(x));

        System.out.printf("Результат: %.3f" , result);
    }
}

