package com.gmail.olgabots.examclouds.lesson.twelve;

import java.util.Objects;

public class Magazine implements Printable {
    private String name;

    public Magazine(String magazine) {
        this.name = magazine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Magazine magazine = (Magazine) o;
        return Objects.equals(name, magazine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Print magazine " + getName());
    }
}