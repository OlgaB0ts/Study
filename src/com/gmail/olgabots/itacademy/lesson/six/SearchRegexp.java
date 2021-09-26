package com.gmail.olgabots.itacademy.lesson.six;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchRegexp {

    public static void main(String[] args) {
        Pattern regexp = Pattern.compile("<[a-z]+>");
        Matcher m = regexp.matcher("<a><b-><1><uy><c><d/>");
        while (m.find()) {
            System.out.println(m.group());
        }
    }

}
