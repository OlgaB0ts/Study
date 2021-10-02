package com.gmail.olgabots.itacademy.lesson.seven.homework.model.figure;

public class Triangle extends Figure {
    private Integer firstSideLength;
    private Integer secondSideLength;
    private Integer thirdSideLength;

    @Override
    public double getPerimeter() {
        return firstSideLength
                + secondSideLength
                + thirdSideLength;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        double area = Math.sqrt(halfPerimeter
                * (halfPerimeter - firstSideLength)
                * (halfPerimeter - secondSideLength)
                * (halfPerimeter - thirdSideLength));
        return area;
    }

    public void setFirstSideLength(Integer firstSideLength) {
        this.firstSideLength = firstSideLength;
    }

    public void setSecondSideLength(Integer secondSideLength) {
        this.secondSideLength = secondSideLength;
    }

    public void setThirdSideLength(Integer thirdSideLength) {
        this.thirdSideLength = thirdSideLength;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSideLength +
                ", secondSide=" + secondSideLength +
                ", thirdSide=" + thirdSideLength +
                '}';
    }
}
