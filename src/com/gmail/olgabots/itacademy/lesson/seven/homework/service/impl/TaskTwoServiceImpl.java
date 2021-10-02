package com.gmail.olgabots.itacademy.lesson.seven.homework.service.impl;

import com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle.Automobile;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle.EnglandAutomobile;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle.GermanyAutomobile;
import com.gmail.olgabots.itacademy.lesson.seven.homework.model.vehicle.RussianAutomobile;
import com.gmail.olgabots.itacademy.lesson.seven.homework.service.TaskService;

public class TaskTwoServiceImpl implements TaskService {

    @Override
    public void runTask() {
        Automobile automobileOne = new GermanyAutomobile();
        Automobile automobileTwo = new EnglandAutomobile();
        Automobile automobileThree = new RussianAutomobile();

        Automobile[] automobiles = {automobileOne, automobileTwo, automobileThree};

        for (Automobile automobile : automobiles) {
            System.out.println(automobile.getDescription());
        }
    }

    @Override
    public String toString() {
        String info = "Task two\n\n" +
                "1. Create class Automobile.\n" +
                "2. Make it abstract.\n" +
                "3. Add an abstract method int getRate () to the class.\n" +
                "4. Add the String getDescription () method to the class, which returns the string \"Automobile:\".\n" +
                "5. Create class RussianAutomobile, which inherits from Automobile.\n" +
                "6. Create a class GermanyAutomobile that inherits from Automobile.\n" +
                "7. Create the EnglandAutomobile class that inherits from Automobile.\n" +
                "8. In each of the classes, write your own implementation of the getRate method. \n" +
                "   The method should return the rating of the car depending on the type.\n" +
                "9. In each of the classes, write your own implementation of the getDescription method. \n" +
                "   Methods should return a string of the form: <getDescription () of the parent class> + \n" +
                "   <\"My country is Sssss. Car rating N\">, where Sssss is the name of the country, where N is the car rating\n";
        return info;
    }
}
