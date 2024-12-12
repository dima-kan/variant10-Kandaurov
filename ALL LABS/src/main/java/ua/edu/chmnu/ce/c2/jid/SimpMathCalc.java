package ua.edu.chmnu.ce.c2.jid;

/*
variant 10

 */
public class SimpMathCalc {
    public static void main(String[] args) {
        double x = 8.1;
        double a = 2.5;
        double b = 7.7;
        double c = 4.32;

        double result = Math.exp( a*Math.cos(x + 2)) - Math.exp(-Math.sin(b*x)) / (c - Math.sqrt(x));

        System.out.printf("Результат: %.3f" , result);
    }
}