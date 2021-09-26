package com.gmail.olgabots.examclouds.lesson.seven;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[][] mas = {{78, 2, 54},
                {12},
                {},
                {87,0},
                {87, 3, 5, 23, 4, 54}};
        for (int[] indexMas :
                mas) {
            sort(indexMas);
            System.out.println(Arrays.toString(indexMas));
        }

    }

    private static void sort(int[] mas) {
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 1; j < mas.length - i; j++) {
                if (mas[j - 1] > mas[j]) {
                    int temp = mas[j];
                    mas[j] = mas[j - 1];
                    mas[j - 1] = temp;
                }
            }
        }
    }


}
