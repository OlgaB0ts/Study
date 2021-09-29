package com.gmail.olgabots.itacademy.lesson.seven.classwork;

public class Square extends Figure {
    public static final int COUNT_OF_SITES = 4;
    int weight;

    public Square(int weight) {
        this.weight = weight;
    }

    @Override
    public int getPerimeter() {
        return weight * COUNT_OF_SITES;
    }
}
