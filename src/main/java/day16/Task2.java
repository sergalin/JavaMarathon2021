package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        File intFile = new File("file1.txt");

        try {
            PrintWriter pw = new PrintWriter(intFile);

            int i = 0;

            while (i < 1000) {
                //range = (max - min) + 1;
                int range = (100 - 0) + 1;
                pw.print(random.nextInt(100));
                i++;
            }

            pw.close();

            } catch (FileNotFoundException e) {
                System.out.println("Файл1 не найден");
            }

        File doubleFile = new File("file2.txt");

        try {
            PrintWriter pw = new PrintWriter(doubleFile);
            Scanner scanner = new Scanner(intFile);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            int i = 1;
            int sum = 0;
            int range = 20;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
                if (i % range == 0) {
                    pw.print((double) sum / range + " ");
                    sum =0;
                }
                i++;
            }
            scanner.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл2 не найден");

        }
        printResult(doubleFile);

    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            double sum = 0;
            for (String number : numbers) {
                sum += Double.parseDouble(number);
            }

            scanner.close();

            System.out.println((int) sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл2 не найден");
        }
    }
}
