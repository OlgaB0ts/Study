package com.gmail.olgabots.examclouds.lesson.nine;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone phone = new Phone("768768676", "Samsung", 7.8);

        System.out.println(phone.model);
        System.out.println(phone.number);
        System.out.println(phone.weight);

        Phone phone2 = new Phone();
        phone2.number = "87676";
        phone2.model = "Apple";
        phone2.weight = 7.3;

        System.out.println(phone2.model);
        System.out.println(phone2.number);
        System.out.println(phone2.weight);

        phone.receiveCall("mother");
        phone.receiveCall("father");

        System.out.println(phone.getNumber());
        System.out.println(phone2.getNumber());

    }
}
