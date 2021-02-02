package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> listCars = new ArrayList<>();
        listCars.add("Audi");
        listCars.add("BMW");
        listCars.add("Subaru");
        listCars.add("VAZ");
        listCars.add("Peugeot");

        listCars.add(3, "ZAZ");
        listCars.remove(0);

        for (String car : listCars) {
            System.out.println(car);
        }

    }
}
