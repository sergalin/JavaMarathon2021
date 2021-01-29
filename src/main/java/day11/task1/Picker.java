package day11.task1;

public class Picker implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.salary = 0;
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Сборщик, " +
                "Зарплата: " + salary +
                ", Бонус: " + isPayed;

    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(1);

    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() == 10000 && isPayed == false) {
            isPayed = true;
            salary += 70000;
        } else if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }

    }

}
