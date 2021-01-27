package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setReleaseDate(2021);
        car.setModel("Subaru");
        car.setColor("Black");

        System.out.println(car.getReleaseDate());
        System.out.println(car.getModel());
        System.out.println(car.getColor());

    }
}
