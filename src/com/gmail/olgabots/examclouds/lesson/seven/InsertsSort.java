package com.gmail.olgabots.examclouds.lesson.seven;

public class InsertsSort {
    public static void main(String[] args) {
        int[][] massive = {{78, 2, 54},
                {12},
                {},
                {87, 0},
                {87, 3, 5, 23, 4, 54}};
//                {98, 76786, 7, 87, 76723, 2, 435, 23, 54, 2, 2, 3, 4, 12, 2, 2, 3434}};


        for (int[] mas : massive) {

            String[] columns = new String[5];
            columns[0] = "| i | ";
            columns[1] = "j |";
            String titleThirdColumn = "Array values ";
            titleThirdColumn += getSpace(getCountSpaces(getInputSizeForArray(mas), titleThirdColumn.length()));
            columns[2] = titleThirdColumn;
            columns[3] = "|";
            columns[4] = "If block IF executed?|";


            printLine(columns);
            printHeadTitle(columns);
            printLine(columns);

//            sortInsertFormatted(mas, columns);
            sortBubblesFormatted(mas, columns);
            printLine(columns);
        }


    }

    private static void printHeadTitle(String[] columns) {
        for (String column :
                columns) {
            System.out.print(column);
        }
        System.out.println();
    }

    private static void printLine(String[] columns) {
        int titleLength = 0;
        for (String column :
                columns) {
            titleLength += column.length();
        }

        if (titleLength > 0) {
            System.out.println(String.format("%0" + titleLength + "d", 0).replace('0', '_'));
        }
    }

    private static String getSpace(int cont) {
        String space = "";
        for (int i = 0; i < cont; i++) {
            space += " ";
        }
        return space;
    }

    private static void sort(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            int min = mas[i];
            int minIndex = i;
            for (int j = i; j < mas.length; j++) {
                if (mas[j] < min) {
                    min = mas[j];
                    minIndex = j;
                }
            }
            int temp = mas[i];
            mas[i] = min;
            mas[minIndex] = temp;
        }
    }

    private static void sortBubblesFormatted(int[] mas, String[] columns) {
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 1; j < mas.length - i; j++) {
                boolean isIfExecuted = false;
                if (mas[j - 1] > mas[j]) {
                    int temp = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = temp;
                    isIfExecuted = true;
                }
                printRow(mas, columns, i, j, isIfExecuted);
            }
        }
    }

    private static void sortInsertFormatted(int[] mas, String[] columns) {
        for (int i = 0; i < mas.length; i++) {
            int min = mas[i];
            int minIndex = i;

            for (int j = i; j < mas.length; j++) {
                boolean isIfExecuted = false;
                if (mas[j] < min) {
                    min = mas[j];
                    minIndex = j;
                    isIfExecuted = true;
                }

                printRow(mas, columns, i, j, isIfExecuted);

            }
            int temp = mas[i];
            mas[i] = min;
            mas[minIndex] = temp;
        }
    }

    private static void printRow(int[] mas, String[] columns, int i, int j, boolean isIfExecuted) {
        System.out.printf("| %d | %d |", i, j);

        for (int k = 0; k < mas.length; k++) {
            System.out.printf("%3d ", mas[k]);
        }

        int countSpaces = getCountSpaces(getInputSizeForArray(mas), columns[2].length() + columns[3].length());
        if (countSpaces < 0) {
            System.out.printf("%" + -countSpaces + "s", " ");
        }

        System.out.print("|" + isIfExecuted);
        countSpaces = getCountSpaces(Boolean.toString(isIfExecuted).length(), columns[4].length());
        if (countSpaces < 0) {
            System.out.printf("%" + -countSpaces + "s", " ");
        }

        System.out.print("|");
        System.out.println();
    }

    private static int getInputSizeForArray(int[] mas) {
        return mas.length * 4;
    }

    private static int getCountSpaces(int inputedlength, int thirdColumnLength) {
        return inputedlength - thirdColumnLength + 1;
    }
}
