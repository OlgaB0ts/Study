package com.gmail.olgabots.itacademy.lesson.six.homework.string;

public class StringMatch {

    public static void execute() {
        String[] strings = {"Zero", "First string dog", "Second and string", "Third string with cat",
                "Fourth string", "Fives string does good buy"};
        String[] matcherChars = {"cat", "dog"};

        int countOfMatch = 0;
        for (String str :
                strings) {

            for (String matcherChar :
                    matcherChars) {

                char[] chars = matcherChar.toCharArray();
                if (isContainedAllChars(str, chars)) {
                    printReport(str, chars);
                    countOfMatch++;
                    break;
                }
            }
        }
        int countNotMatched = strings.length - countOfMatch;
        System.out.println(countNotMatched + " string(s) do not meet the criterion");
    }

    private static void printReport(String str, char[] chars) {
        System.out.println("\'" + getStrWithHighlightedChars(str, chars) + "\' contains all chars [" + String.valueOf(chars) + "]. " +
                "String length is " + str.length());
    }

    private static boolean isContainedAllChars(String str, char[] chars) {
        boolean isContainedAllChars = true;
        for (int i = 0; i < chars.length; i++) {
            if (str.indexOf(chars[i]) == -1) {
                isContainedAllChars = false;
                break;
            }
        }
        return isContainedAllChars;
    }

    private static String getStrWithHighlightedChars(String str, char[] chars) {
        boolean isContainedAllChars = true;
        String highlightedStr = str;
        for (int i = 0; i < chars.length; i++) {
            int index = highlightedStr.indexOf(chars[i]);
            if (index > -1) {
                highlightedStr = highlightedStr.substring(0, index) +
                        "["+highlightedStr.substring(index, index + 1).toUpperCase()+"]" +
                        highlightedStr.substring(index + 1, highlightedStr.length());
            }
        }

        return highlightedStr;
    }
}
