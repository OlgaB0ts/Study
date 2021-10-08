package com.gmail.olgabots.examclouds.lesson.nine.homework;

public class Recursion {

    private static final int FROM = 3;
    private static final int TO = 20;

    public static void main(String[] args) {

        getNext(FROM, TO);
    }

    private static void getNext(int from, int to) {
        if (from < to) {
            getNext(from, to - 1);
        } else if (from > to) {
            getNext(from, to + 1);
        }
        System.out.println(to);
    }
}
