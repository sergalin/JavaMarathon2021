package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] myArray = new int[12][8];
        Random random = new Random();

        // Create new array
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int numRow = 0;
        for (int i = 0; i < myArray.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < myArray[i].length; j++) {
                rowSum += myArray[i][j];
            }
            if (maxSum < rowSum) {
                maxSum = rowSum;
                numRow = i;
            }
        }
        System.out.println("Ответ: " + numRow);

    }
}
