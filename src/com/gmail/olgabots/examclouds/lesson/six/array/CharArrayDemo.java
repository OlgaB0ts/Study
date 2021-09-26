package com.gmail.olgabots.examclouds.lesson.six.array;

import java.util.Arrays;

public class CharArrayDemo {
    public static void main(String[] args) {
        char[][] array = {{'r', 'h'},
                {'y', 'g'},
                {'b', 'f'},
                {'s', 'e'}};

        for (char[] row : array) {
            for (char value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        char[][] arrayDouble = new char[2][];
        arrayDouble[0] = new char[]{'k', 'u'};
        arrayDouble[1] = new char[]{'i', 'i'};

        System.out.println(Arrays.deepToString(arrayDouble));
    }
}
