package com.gmail.olgabots.examclouds.lesson.seven;

public class Fibonachy {

    public static void main(String[] args) {
        int previousValue = 0;
        for (int i = -1, j = 1; i+j <= 1000; ) {
            int x = i + j;
            i = j;
            j = x;
            System.out.print(x + " ");
        }
    }
}
