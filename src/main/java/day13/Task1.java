package day13;

import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");
        User user3 = new User("User3");

        user1.sendMessage(user2, "Привет!");
        user1.sendMessage(user2, "Привет!");




    }
}
