package com.gmail.olgabots.examclouds.lesson.twelve;

public interface Printable {
    default void print(){
        System.out.println("print default");
    }
}
