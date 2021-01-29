package day11.task1;

public class Courier implements Worker {
    private double salary;
    private boolean isPayed;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
       this.salary = 0;
       this.isPayed = false;
       this.warehouse = warehouse;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Курьер, " +
                "Зарплата: " + salary +
                ", Бонус: " + isPayed;

    }

    @Override
    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(1);

    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() == 10000 && isPayed == false) {
            isPayed = true;
            salary += 50000;
        } else if (isPayed == true) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }

    }

}
