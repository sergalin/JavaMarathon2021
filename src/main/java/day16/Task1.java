package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // byte short int long
        // float double
        String separator = File.separator;
        File inputFile = new File("src" + separator + "main" + separator + "resources" + separator + "numbers.txt");

        printResult(inputFile);

    }

    public static void printResult(File file) {
        try {
            int sum = 0;
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }

            double average = (double) sum / numbers.length;

            System.out.printf(average + " --> %.3f", average);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

