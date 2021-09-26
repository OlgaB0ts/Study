package com.gmail.olgabots.epam.blinov.chapter.two.option.one;

import java.util.Arrays;
import java.util.Scanner;

public class SortInAndBackOrder {

    public static void main(String[] args) {
        System.out.println("Input numbers:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String[] numbers = scanner.nextLine().split(" ");
            String[] sortedByLength = getSortedByLength(numbers);
            System.out.println(Arrays.toString(sortedByLength));

            String[] sortedByLengthBackOrder = getSortedByLengthBackOrder(numbers);
            System.out.println(Arrays.toString(sortedByLengthBackOrder));


        }

    }

    private static String[] getSortedByLengthBackOrder(String[] numbers) {
        int[] weights = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            weights[i] = numbers[i].length();
        }
        for (int i = 0; i < numbers.length; i++) {
            int maxWeight = numbers[i].length();
            int minWeightIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (maxWeight < weights[j]) {
                    maxWeight = weights[j];
                    minWeightIndex = j;
                }
            }
            swapWeights(weights, i, minWeightIndex);
            swapNumbers(numbers, i, minWeightIndex);
        }
        return numbers;
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
