package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // size of Array
        int n = scanner.nextInt();
        if (n > 0) {
            int[] myArray = new int [n];

            for (n = 0; n < myArray.length; n++) {
                myArray[n] = (int) Math.ceil(Math.random() * 10);
            }
            System.out.println(Arrays.toString(myArray));
            System.out.println("Длина массива: " + myArray.length);

            int count = 0;


            for (int number:myArray) {
                if (number > 8) {
                    count++;
                }
            }
            System.out.println("Кол-во чисел больше 8: " + count);


            count = 0;
            for (int number:myArray) {
                if (number == 1) {
                    count++;
                }
            }
            System.out.println("Кол-во чисел равных 1: " + count);

            count = 0;
            for (int number:myArray) {
                if (number % 2 == 0) {
                    count++;
                }
            }
            System.out.println("Кол-во чётных чисел: " + count);

            count = 0;
            for (int number:myArray) {
                if (number % 2 != 0) {
                    count++;
                }
            }
            System.out.println("Кол-во нечётных чисел: " + count);

            count = 0;
            int sum =0;
            for (int number:myArray) {
                sum = sum + number;
            }

            System.out.println("Сумма всех элементов массива: " + sum);
        }

    }
}
