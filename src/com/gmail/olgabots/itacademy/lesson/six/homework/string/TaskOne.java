package com.gmail.olgabots.itacademy.lesson.six.homework.string;


public class TaskOne {

    public void execute() {
        String message = "This is very interesting topic to modify " +
                "strings and find characters in it to get its position";
        System.out.println("Message: " + message);

        char lastChar = message.trim().charAt(message.length() - 1);
        System.out.println("Find all '" + lastChar + "'.");

        String[] indexesString = getMatchedIndexes(message, lastChar);

        printResult(message, indexesString);
    }

    private void printResult(String message, String[] indexesString) {
        int counter = 0;
        for (String index : indexesString) {
            ++counter;
            String messageWithHighlightedPosition = getMessageWithHighlightedPosition(message, Integer.parseInt(index));
            System.out.println(counter + " match found in " + index + " position: \""
                    + messageWithHighlightedPosition + "\"");
        }
    }

    private String[] getMatchedIndexes(String message, char requiredChar) {
        int searchFromIndex = -1;
        String indexesListString = "";
        do {
            int indexOfRequiredChar = message.indexOf(requiredChar, searchFromIndex + 1);
            if (indexOfRequiredChar != -1) {
                indexesListString = indexesListString.concat(String.valueOf(indexOfRequiredChar)).concat(" ");

            }
            searchFromIndex = indexOfRequiredChar;
        } while (searchFromIndex != -1);

        String[] indexesString = indexesListString.split(" ");
        return indexesString;
    }

    private String getMessageWithHighlightedPosition(String message, int index) {
        String wordWithUpperIndex = message.substring(0, index)
                .concat("[")
                .concat(message.substring(index, index + 1).toUpperCase())
                .concat("]")
                .concat(message.substring(index + 1));

        return wordWithUpperIndex;
    }
}
