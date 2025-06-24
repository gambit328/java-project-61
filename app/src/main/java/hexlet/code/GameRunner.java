package hexlet.code;

import java.util.Scanner;
import hexlet.code.Games.*;

public class GameRunner {
    private static String userName;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease enter the game number and press Enter.");
        System.out.println("""
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit
            """);

        System.out.print("Your choice: ");
        String userChoice = scanner.nextLine();

        System.out.println("Welcome to the Brain Games!");

        switch (userChoice) {
            case "1":
                userName = Greeting.setUserName(scanner);
                break;
            case "2":
                Even evenGame = new Even();
                evenGame.play(scanner);
                break;
            case "3":
                Calc calcGame = new Calc();
                calcGame.play(scanner);
                break;
            case "4":
                Gcd gcdGame = new Gcd();
                gcdGame.play(scanner);
                break;
            case "5":
                Progression progression = new Progression();
                progression.play(scanner);
                break;
            case "6":
                Prime prime = new Prime();
                prime.play(scanner);
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("[ERROR] > incorrect entry. Try again.");
        }
        scanner.close();

    }

    public static String getUserName() {
        return userName;
    }
}