package com.gmail.olgabots.itacademy.lesson.ten.homework.servises.impl;

import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.RandomService;
import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.TaskService;

import java.util.ArrayList;
import java.util.List;

public class TaskServiceThreeImpl implements TaskService {

    private static final int COUNT_OF_NUMBERS = 10;
    private static final int NUMBER_FROM = 2;
    private static final int NUMBER_TO = 98;
    private static final int COUNT_OF_MAX_VALUES = 2;

    private RandomService randomService;

    public TaskServiceThreeImpl(RandomService randomService) {
        this.randomService = randomService;
    }

    @Override
    public void runService() {
        System.out.println("__________Task three__________");

        List<Integer> randomNumbers = generateIntegerList(NUMBER_FROM, NUMBER_TO, COUNT_OF_NUMBERS);
        System.out.println("Random numbers" + randomNumbers);

        List<Integer> maxValuesOfList = getMaxValuesOfList(randomNumbers, COUNT_OF_MAX_VALUES);

        System.out.print(COUNT_OF_MAX_VALUES + " max values: " + maxValuesOfList);
    }

    private List<Integer> generateIntegerList(int numberFrom, int numberTo, int countOfNumbers) {
        List<Integer> randomNumbers = new ArrayList<>(countOfNumbers);
        for (int i = 0; i < countOfNumbers; i++) {
            randomNumbers.add(randomService.getNextInt(numberFrom, numberTo));
        }
        return randomNumbers;
    }

    private List<Integer> getMaxValuesOfList(List<Integer> numbers, int countOfMaxValues) {

        List<Integer> maxValuesOfList = new ArrayList<>(countOfMaxValues);
        List<Integer> numbersRemovedMax = new ArrayList<>(numbers);
        for (int i = 0; i < countOfMaxValues; i++) {
            Integer maxInteger = getMaxInteger(numbersRemovedMax);
            maxValuesOfList.add(maxInteger);
            numbersRemovedMax.remove(maxInteger);
        }
        return maxValuesOfList;
    }

    private Integer getMaxInteger(List<Integer> numbers) {
        if (numbers == null) {
            return null;
        }

        if (numbers.size() == 0) {
            return null;
        }

        Integer max = numbers.get(0);
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }
}
