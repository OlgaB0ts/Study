package com.gmail.olgabots.itacademy.lesson.six.homework.string;

public class TaskTwo {

    public void execute() {
        String[] strings = {"Zero", "First string dog", "Second and string", "Third string with cat",
                "Fourth string", "Fives string does good buy"};
        String[] matcherChars = {"cat", "dog"};

        int countOfMatch = 0;
        for (String str : strings) {
            for (String matcherChar : matcherChars) {
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

    private void printReport(String str, char[] chars) {
        String stringWithHighlightedChars = getStrWithHighlightedChars(str, chars);
        System.out.println(new StringBuilder()
                .append("'")
                .append(stringWithHighlightedChars)
                .append("' contains all chars [")
                .append(chars)
                .append("]. ")
                .append("String length is ")
                .append(str.length()));
    }

    private boolean isContainedAllChars(String str, char[] chars) {
        boolean isContainedAllChars = true;
        for (char aChar : chars) {
            if (str.indexOf(aChar) == -1) {
                isContainedAllChars = false;
                break;
            }
        }
        return isContainedAllChars;
    }

    private String getStrWithHighlightedChars(String str, char[] chars) {
        String stringWithHighlightedChars = str;
        for (int i = 0; i < chars.length; i++) {
            int index = stringWithHighlightedChars.indexOf(chars[i]);
            if (index > -1) {
                String foundCharInUpperCase = stringWithHighlightedChars.substring(index, index + 1).toUpperCase();
                String stringBeforeFoundedChar = stringWithHighlightedChars.substring(0, index);
                String stringAfterFoundedChar = stringWithHighlightedChars.substring(index + 1);
                stringWithHighlightedChars = stringBeforeFoundedChar
                        + "[" + foundCharInUpperCase + "]"
                        + stringAfterFoundedChar;
            }
        }
        return stringWithHighlightedChars;
    }
}
