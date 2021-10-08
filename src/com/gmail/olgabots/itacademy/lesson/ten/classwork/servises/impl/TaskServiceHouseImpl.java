package com.gmail.olgabots.itacademy.lesson.ten.classwork.servises.impl;

import com.gmail.olgabots.itacademy.lesson.ten.classwork.model.House;
import com.gmail.olgabots.itacademy.lesson.ten.classwork.servises.TaskService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskServiceHouseImpl implements TaskService {
    private static final Random random = new Random();
    public static final int MAX_COUNT = 5;
    public static final int MAX_SIZE = 10;

    @Override
    public void runTask() {
        List<House> houses = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            House house = new House(
                    random.nextInt(MAX_COUNT),
                    "description " + i,
                    random.nextInt(MAX_SIZE)
            );
            houses.add(house);
        }
        for (House house : houses) {
            System.out.println(house);
        }

        List<House> resultHouses = getHousesAccordingToCondition(houses);
        System.out.println("Houses according to condition:");
        for (House resultHouse : resultHouses) {
            System.out.println(resultHouse);
        }


        List<House> resultHousesAccordingNumbers = getHousesAccordingHouseNumberCondition(houses);

        System.out.println("Result houses according number:");
        for (House resultHousesAccordingNumber : resultHousesAccordingNumbers) {
            System.out.println(resultHousesAccordingNumber);
        }
    }

    private List<House> getHousesAccordingHouseNumberCondition(List<House> houses) {

        List<House> resultHouses = new ArrayList<>();
        for (House house : houses) {
            Integer countOfRooms = house.getCountOfRooms();
            if (countOfRooms != 2 && countOfRooms != 3) {
                resultHouses.add(house);
            }
        }
        return resultHouses;
    }

    private List<House> getHousesAccordingToCondition(List<House> houses) {
        List<House> resultHouses = new ArrayList<>(houses.size());

        for (House house : houses) {
            if (house.getSize() <= 50) {
                resultHouses.add(house);
            }
        }

        return resultHouses;
    }
}
