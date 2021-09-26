package com.gmail.olgabots.examclouds.lesson.six.array;

import java.util.Arrays;

public class Comp2 {

    public static void main(String[] args) {
        float f1 = 2.3f;
        float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
        float[] f3 = {2.7f};
        long x = 42L;
        // if (f1 == f2)
        if (f1 == f2[2][1]) {
            if (x == f2[0][0])
                // if (f1 == f2[1,1])
                if (f3 == f2[2])
                    System.out.println("true");
        }
        float[] array1 = f2[0];
        float[] array2 = f2[1];

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        System.out.println(f2.length);

    }
}
