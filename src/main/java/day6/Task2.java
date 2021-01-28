package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeng", 1988, 6000, 3000);
        airplane.setYear(1999);
        airplane.setLength(5000);

        airplane.fillUp(300);
        airplane.fillUp(200);

        airplane.info();

    }
}
