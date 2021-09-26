package com.gmail.olgabots.itacademy.lesson.six.homework.string;


public class StringAnalyze {

    public static void execute() {
        String message = new String("This is very interesting topic to modify " +
                "strings and find characters in it to get its position");
        System.out.println("Message: " + message);

        char lastChar = message.trim().charAt(message.length() - 1);
        System.out.println("Find all \'" + lastChar + "\'.");

        String[] indexesString = getMatchedIndexes(message, lastChar);

        printResult(message, indexesString);
    }

    private static void printResult(String message, String[] indexesString) {
        int counter = 0;
        for (String index : indexesString) {
            System.out.println(++counter + " match found in " + index + " position: \"" +
                    getMessageWithHighlightedPosition(message, Integer.parseInt(index)) + "\"");
        }
    }

    private static String[] getMatchedIndexes(String message, char requiredChar) {
        int searchFrom = -1;
        String indexesList = "";
        do {
            searchFrom = message.indexOf(requiredChar, searchFrom + 1);
            if (searchFrom != -1) {
                indexesList = indexesList.concat(String.valueOf(searchFrom) + " ");
            }
        } while (searchFrom != -1);

        String[] indexesString = indexesList.split(" ");
        return indexesString;
    }

    private static String getMessageWithHighlightedPosition(String message, int index) {
        String wordWithUpperIndex = message.substring(0, index).
                concat("[").concat(message.substring(index, index + 1).toUpperCase()).concat("]").
                concat(message.substring(index + 1, message.length()));
        return wordWithUpperIndex;
    }
}
