package day6;

public class Car {
    private int releaseDate;
    private String color;
    private String model;

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference (int inputYear) {
        return Math.abs(inputYear - releaseDate);

    }
}
