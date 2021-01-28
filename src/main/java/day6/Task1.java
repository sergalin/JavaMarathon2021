package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setReleaseDate(2018);
        car.setColor("Black");
        car.setModel("Subaru");

        Motorbike motorcycle = new Motorbike("Yawa", "White",2016);

        car.info();
        motorcycle.info();

        System.out.println(car.yearDifference(2011));
        System.out.println(motorcycle.yearDifference(2018));

    }
}
