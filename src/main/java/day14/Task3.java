package day14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        List<Person> persons = parseFileToObjList(file);
        System.out.println(persons);

    }

    public static List<Person> parseFileToObjList (File file) {
        List<Person> persons = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                persons.add(new Person(person[0], Integer.parseInt(person[1])));
            }

        } catch (IOException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return persons;
    }
}
