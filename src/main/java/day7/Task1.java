package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeng", 1988, 6000, 3000);
        Airplane airplane2 = new Airplane("IL-86", 1988, 6000, 3000);

        Airplane.compareAirplanes(airplane, airplane2);

    }
}