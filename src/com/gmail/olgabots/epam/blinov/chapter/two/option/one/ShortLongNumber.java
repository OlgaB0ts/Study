package com.gmail.olgabots.epam.blinov.chapter.two.option.one;

import java.util.Arrays;
import java.util.Scanner;

public class ShortLongNumber {

    public static void main(String[] args) {
        System.out.println("Input numbers:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String[] numbers = scanner.nextLine().split(" ");
            String[] sortedByLength = getSortedByLength(numbers);

            String[] minLengths = getMinLengths(sortedByLength);
            System.out.println("Min length is " + minLengths[0].length() + ", numbers are:");
            System.out.println(Arrays.toString(minLengths));


            String[] maxLengths = getMaxLengths(sortedByLength);
            System.out.println("Max length is " + maxLengths[0].length() + ", numbers are:");
            System.out.println(Arrays.toString(maxLengths));


        }
    }

    private static String[] getMaxLengths(String[] sortedByLength) {
        String[] maxLengths = new String[getCountOfMaxLengths(sortedByLength)];
        int maxLength = sortedByLength[sortedByLength.length - 1].length();
        int maxLengthIndex = 0;
        for (int i = sortedByLength.length - 1; i > 0; i--) {
            int length = sortedByLength[i].length();
            if (maxLength == length) {
                maxLengths[maxLengthIndex++] = sortedByLength[i];
            } else if (maxLength < length) {
                break;
            }
        }

        return maxLengths;
    }

    private static String[] getMinLengths(String[] sortedByLength) {
        String[] minLengths = new String[getCountOfMinLengths(sortedByLength)];
        int minLength = 0;
        int minLengthIndex = 0;
        for (int i = 0; i < sortedByLength.length; i++) {
            int length = sortedByLength[i].length();
            if (i == 0) {
                minLength = length;
            }
            if (minLength == length) {
                minLengths[minLengthIndex++] = sortedByLength[i];
            } else if (minLength < length) {
                break;
            }
        }

        return minLengths;
    }

    private static int getCountOfMinLengths(String[] sortedByLength) {
        int countOfMinLengths = 0;

        int minLength = 0;
        for (int i = 0; i < sortedByLength.length; i++) {
            int length = sortedByLength[i].length();
            if (i == 0) {
                minLength = length;
            }
            if (minLength == length) {
                countOfMinLengths++;
            } else if (minLength < length) {
                break;
            }
        }
        return countOfMinLengths;
    }

    private static int getCountOfMaxLengths(String[] sortedByLength) {
        int countOfMaxLengths = 0;

        int maxLength = sortedByLength[sortedByLength.length - 1].length();
        for (int i = sortedByLength.length - 1; i > 0; i--) {
            int length = sortedByLength[i].length();
            if (maxLength == length) {
                countOfMaxLengths++;
            } else if (maxLength > length) {
                break;
            }
        }
        return countOfMaxLengths;
    }


    private static String[] getSortedByLength(String[] numbers) {
        int[] weights = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            weights[i] = numbers[i].length();
        }
        for (int i = 0; i < numbers.length; i++) {
            int minWeight = numbers[i].length();
            int minWeightIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (minWeight > weights[j]) {
                    minWeight = weights[j];
                    minWeightIndex = j;
                }
            }
            swapWeights(weights, i, minWeightIndex);
            swapNumbers(numbers, i, minWeightIndex);
        }
        return numbers;
    }

    private static void swapNumbers(String[] numbers, int i, int minWeightIndex) {
        String tempStr = numbers[i];
        numbers[i] = numbers[minWeightIndex];
        numbers[minWeightIndex] = tempStr;
    }

    private static void swapWeights(int[] weights, int i, int minWeightIndex) {
        int temp = weights[i];
        weights[i] = weights[minWeightIndex];
        weights[minWeightIndex] = temp;
    }

}
