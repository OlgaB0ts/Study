package com.gmail.olgabots.examclouds.lesson.six.array;

import java.util.Arrays;

public class MinMaxInArray {

    public static void main(String[] args) {
        int[][] arrays = new int[5][8];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = (int) (Math.random() * 20);
            }
        }

        System.out.println(Arrays.deepToString(arrays));

        int[][] result = new int[arrays.length][];
        for (int j = 0; j < arrays.length; j++) {
            int[] array = arrays[j];
            int minValue = 0;
            int maxValue = 0;
            for (int i = 0; i < array.length; i++) {
                int value = array[i];
                if (i == 0) {
                    minValue = value;
                    maxValue = value;
                }
                if (value < minValue) {
                    minValue = value;
                }

                if (value > maxValue) {
                    maxValue = value;
                }
            }

            result[j] = new int[]{minValue, maxValue};
        }

        System.out.println(Arrays.deepToString(result));
    }
}
