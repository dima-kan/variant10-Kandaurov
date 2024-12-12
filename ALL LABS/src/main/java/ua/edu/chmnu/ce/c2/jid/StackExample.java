package ua.edu.chmnu.ce.c2.jid;
import java.util.*;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();


        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);


        System.out.println("Top element: " + stack.peek());


        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());


        System.out.println("Is the stack empty? " + stack.isEmpty());


        System.out.println("Remaining stack: " + stack);
    }
}

