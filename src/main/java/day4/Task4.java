package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] myArray = new int[100];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(myArray));

        int sumMax = 0;
        int maxVal = 0;

        for (int i = 0; i < myArray.length - 2; i++) {
            int sumRow = 0;

            for (int j = i; j < i + 3; j++) {
                sumRow += myArray[j];
            }

            if (sumRow > sumMax) {
                sumMax = sumRow;
                maxVal = i;
            }
        }

        System.out.println(sumMax);
        System.out.println(maxVal);
    }
}
