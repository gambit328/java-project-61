package hexlet.code.Games;

import java.util.Scanner;

public class Greeting {

    public static String setUserName(Scanner scanner) {
        String userName;

        while (true) {
            System.out.print("May I have your name? ");
            userName = scanner.nextLine().trim();
            if (!userName.isEmpty()) {
                System.out.println("Hello, " + userName);
                return userName;
            }
        }
    }
}
