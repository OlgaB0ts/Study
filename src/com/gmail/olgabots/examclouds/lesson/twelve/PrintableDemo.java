package com.gmail.olgabots.examclouds.lesson.twelve;

public class PrintableDemo {

    public static void main(String[] args) {
        Book book = new Book("name1");
        Book bookTwo = new Book("name2");
        Magazine magazine = new Magazine("magazine1");
        Magazine magazineTwo = new Magazine("magazine2");

        Printable[] printables = {book, bookTwo, magazineTwo, magazine};

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
