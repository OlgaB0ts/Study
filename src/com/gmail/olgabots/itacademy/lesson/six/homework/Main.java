package com.gmail.olgabots.itacademy.lesson.six.homework;

import com.gmail.olgabots.itacademy.lesson.six.homework.card.TaskThree;
import com.gmail.olgabots.itacademy.lesson.six.homework.string.TaskOne;
import com.gmail.olgabots.itacademy.lesson.six.homework.string.TaskTwo;

public class Main {
    public static void main(String[] args) {
        //task one
        System.out.println("_____________Task one_____________");
        new TaskOne().execute();
        System.out.println();



        //task two
        System.out.println("_____________Task two_____________");
        new TaskTwo().execute();
        System.out.println();

        //task three
        System.out.println("_____________Task three_____________");
        new TaskThree().process();
    }
}
