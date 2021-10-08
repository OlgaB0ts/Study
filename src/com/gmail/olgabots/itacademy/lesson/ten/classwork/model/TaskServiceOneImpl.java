package com.gmail.olgabots.itacademy.lesson.ten.classwork.model;

import com.gmail.olgabots.itacademy.lesson.ten.homework.model.Season;
import com.gmail.olgabots.itacademy.lesson.ten.homework.servises.TaskService;

import java.util.Random;

public class TaskServiceOneImpl implements TaskService {
    private Random random = new Random();

    @Override
    public void runService() {
        Season[] seasons = Season.values();
        for (Season season : seasons) {
            System.out.println(season);
        }

        int randomIndexOfSeason = random.nextInt(seasons.length);
        Season randomSeason = seasons[randomIndexOfSeason];
        System.out.println("Random Season" + randomSeason);

        Season nextSeason = getNextSeason(randomSeason);
        System.out.println("Next season " + nextSeason);

        printCountOfDaysOfTheSeason(randomSeason);

    }

    private void printCountOfDaysOfTheSeason(Season randomSeason) {
        System.out.println("In " + randomSeason.getDescription() + " is " + randomSeason.getCountOfDaysStr() + " days.");
    }

    private Season getNextSeason(Season season) {
        Season[] seasons = Season.values();
        for (int i = 0; i < seasons.length; i++) {
            if (seasons[i] == season) {
                int nextIndex = i + 1;
                return nextIndex < seasons.length ? seasons[nextIndex] : seasons[0];
            }
        }
        return null;
    }
}
