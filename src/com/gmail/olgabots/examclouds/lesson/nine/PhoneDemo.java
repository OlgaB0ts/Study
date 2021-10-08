package com.gmail.olgabots.examclouds.lesson.nine;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone phone = new Phone("768768676", "Samsung", 7.8);

        System.out.println(phone.getModel());
        System.out.println(phone.getNumber());
        System.out.println(phone.getWeight());

        Phone phone2 = new Phone();
        phone2.setNumber("87676");
        phone2.setModel("Apple");
        phone2.setWeight(7.3);
        new Phone();

        System.out.println(phone2.getModel());
        System.out.println(phone2.getWeight());
        System.out.println(phone2.getNumber());

        phone.receiveCall("mother");
        phone.receiveCall("father");

        System.out.println(phone.getNumber());
        System.out.println(phone2.getNumber());

        System.out.println("Count of created phones = "+Phone.getCount());

    }
}
