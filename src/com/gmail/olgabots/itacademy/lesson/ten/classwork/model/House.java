package com.gmail.olgabots.itacademy.lesson.ten.classwork.model;

public class House {
    private final Integer countOfRooms;
    private final String description;
    private  final Integer size;

    public House(Integer countOfRooms, String description, Integer size) {
        this.countOfRooms = countOfRooms;
        this.description = description;
        this.size = size;
    }

    public Integer getCountOfRooms() {
        return countOfRooms;
    }

    public String getDescription() {
        return description;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "House{" +
                "countOfRooms=" + countOfRooms +
                ", description='" + description + '\'' +
                '}';
    }
}
