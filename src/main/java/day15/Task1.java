package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        File inputFile = new File("src" + separator + "main" + separator + "resources" + separator + "shoes.csv");
        File outputFile = new File("src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt");

        try {
            Scanner scanner = new Scanner(inputFile);
            PrintWriter pw = new PrintWriter(outputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoesInfo = line.split(";");

                if (Integer.parseInt(shoesInfo[2]) == 0) {
                    pw.println(shoesInfo[0] + ", " + shoesInfo[1] + ", " + shoesInfo[2]);
                }
            }

            scanner.close();
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }
}
