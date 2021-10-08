package com.gmail.olgabots.itacademy.lesson.ten.homework.servises;

import java.util.Random;

public class RandomService {

    private static final String[] CUSTOM_FIRST_NAMES = {"Kendall ", "Kinsley ", "Madison ", "Marley ", "Peyton ", "Presley ", "Sutton ",
            "Willow ", "Winter ", "Archer ", "Brooks ", "Carter ", "Fletcher ", "Graham ", "Huxley ", "Mason ", "Reed ", "Sawyer"};

    private static final String[] CUSTOM_LAST_NAMES = {"Adams ", "Allen ", "Armstrong ", "Atkinson ", "Burton ", "Carter ", "Elliot ",
            "Fox ", "Gibson ", "Gray ", "Hill ", "Jackson ", "James"};


    private Random random = new Random();

    public Integer getNextInt(int numberFrom, int numberTo) {
        return random.nextInt(numberTo + 1 - numberFrom) + numberFrom;
    }

    public String getLastName() {
        int randomLastNameIndex = random.nextInt(CUSTOM_LAST_NAMES.length);
        return CUSTOM_LAST_NAMES[randomLastNameIndex];
    }

    public String getFirstName() {
        int randomFirstNameIndex = random.nextInt(CUSTOM_FIRST_NAMES.length);
        return CUSTOM_FIRST_NAMES[randomFirstNameIndex];
    }

}
