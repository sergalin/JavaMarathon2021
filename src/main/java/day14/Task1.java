package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        String separator = File.separator;
        File file = new File("test1.txt");

        printSumDigits(file);

    }

    public static void printSumDigits (File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if (numbers.length != 10) {
                throw new IllegalArgumentException();
            }
            int sumNumbers = 0;

            for (String number : numbers) {
                sumNumbers += Integer.parseInt(number);
            }


            System.out.println(sumNumbers);

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

    }

}
