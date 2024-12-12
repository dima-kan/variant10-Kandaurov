package ua.edu.chmnu.ce.c2.jid;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class DigitIterator implements Iterable<Integer> {
    private int number;


    public DigitIterator(int number) {
        this.number = number;
    }


    @Override
    public Iterator<Integer> iterator() {

        List<Integer> digits = new ArrayList<>();
        int temp = number;


        while (temp > 0) {
            digits.add(temp % 10);
            temp /= 10;
        }


        List<Integer> reversedDigits = new ArrayList<>();
        for (int i = digits.size() - 1; i >= 0; i--) {
            reversedDigits.add(digits.get(i));
        }


        return reversedDigits.iterator();
    }

    public static void main(String[] args) {

        int number = 12345;
        DigitIterator digitIterator = new DigitIterator(number);


        for (int digit : digitIterator) {
            System.out.println(digit);
        }
    }
}

