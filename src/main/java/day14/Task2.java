package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people2.txt");
        List<String> peoples = new ArrayList<>(parseFileToStringList(file));
        System.out.println(peoples);
    }

    public static List<String> parseFileToStringList(File file) {

        List<String> peoples  = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] people = line.split(" ");

                if (Integer.parseInt(people[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                peoples.add(line);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
            peoples.clear();
        }
        return peoples;
    }
}
