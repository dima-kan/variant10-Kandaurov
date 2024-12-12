package ua.edu.chmnu.ce.c2.jid;

/*
variant 10

 */

import java.util.Arrays;

public class ReverseArray
{
    public ReverseArray() {
    }

    public static void reverse(double[] array) {
        int left = 0;

        for(int right = array.length - 1; left < right; --right) {
            double temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            ++left;
        }

    }

    public static void main(String[] args) {
        double[] array = new double[]{1.1, 2.2, 3.3, 4.4, (double)5.5F};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
}

