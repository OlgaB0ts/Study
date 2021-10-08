package com.gmail.olgabots.examclouds.lesson.nine;

public class Phone {
    private String number;
    private String model;
    private double weight;
    static int count;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    public Phone() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }


    String getNumber() {
        return number;
    }
}
