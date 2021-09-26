package com.gmail.olgabots.itacademy.lesson.six;

import java.util.Locale;

public class StringDemo {

    public static void main(String[] args) {
        String helloWorld = "Hello world";

        int indexOfSpace = helloWorld.indexOf(' ');

        String resultString = helloWorld.concat(" Belarus");
        indexOfSpace = helloWorld.indexOf(' ', indexOfSpace + 1);
        System.out.println(resultString);

//        String substringResult = helloWorld.substring(0, indexOfSpace);
//        System.out.println(substringResult);

        String auto = "auto";
        String mobile = "mobile";

        String automobile = auto.concat(mobile);
        System.out.println(automobile);

        String guidelines = "guidelines";
        String substringGuide = guidelines.substring(0, 5);
        System.out.println(substringGuide);

        String hamburger = "hamburger";
        String spaghetti = "spaghetti";
        String meatSauce = "meat sauce";

        //burguete



        String burguete = String.valueOf(new char[]{hamburger.charAt(3) , hamburger.charAt(4) , hamburger.charAt(5) , hamburger.charAt(6) ,
                spaghetti.charAt(5) , spaghetti.charAt(6) , meatSauce.charAt(1)});
        System.out.println(burguete);

        System.out.println(burguete.toUpperCase());

        int value = 384402;
        String message = "The mean semi-major axis has a value of "+ value+ " km";
        System.out.println(String.format(Locale.getDefault(), "The mean semi-major axis has a value of %,d km", value));
        message = message.toLowerCase();
        System.out.println(message);

        String messageWithNumber = "kljhkjh kjh k 23 23 4jh 23";
        for (int i = 0; i <10; i++) {
            messageWithNumber = messageWithNumber.replaceAll(String.valueOf(i), "");
        }

        System.out.println(messageWithNumber);

        String []mas = {"Hi", "my", "dear"};

        int wordLenght = 0;
        String maxWordLenght = "";
        for (String word: mas
             ) {
            if (word.length()>wordLenght) {
                wordLenght = word.length();
                maxWordLenght = word;
            }
        }
        System.out.println("Max length of words is '" + maxWordLenght + "'. word has "+wordLenght +" chars");
    }
}
