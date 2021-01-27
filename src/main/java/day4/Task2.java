package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] myArray = new int[100];
        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1000);
        }

        int maxValue = 0;
        for (int number:myArray) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        System.out.println("Максимальное значение: " + maxValue);

        int minValue = 1000;
        for (int number:myArray) {
            if (number < minValue) {
                minValue = number;
            }
        }
        System.out.println("Минимальное значение: " + minValue);

        int div10 = 0;
        int sumDiv10 =0;
        for (int number:myArray) {
            if (number % 10 == 0) {
                div10++;
                sumDiv10 += number;
            }
        }
        System.out.println("Кол-во элементов, оканчиващихся на 0: " + div10);
        System.out.println("Сумма элементов, оканчиващихся на 0: " + sumDiv10);

    }
}
