package day6;

public class Motorbike {
    private int releaseDate;
    private String color;
    private String model;

    public Motorbike(String model,  String color, int releaseDate) {
        this.releaseDate = releaseDate;
        this.color = color;
        this.model = model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference (int inputYear) {
        return Math.abs(inputYear - releaseDate);

    }
}
