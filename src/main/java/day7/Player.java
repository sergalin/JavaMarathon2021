package day7;

public class Player {
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int stamina;

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public Player(int stamina) {
        if (stamina >= MIN_STAMINA && stamina <= MAX_STAMINA) {
            this.stamina = stamina;
        }
        if (countPlayers < 6) {
            countPlayers += 1;
        }
    }

    public void run() {
        if (this.stamina > MIN_STAMINA) {
            this.stamina -= 1;

            if (this.stamina == 0) {
                countPlayers -= 1;
            }
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }

    }
}
