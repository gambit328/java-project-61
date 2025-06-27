package hexlet.code;

import java.util.Scanner;
import hexlet.code.Games.Greeting;
import hexlet.code.Games.Even;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Gcd;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;

public class GameRunner {

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
                Greeting.setUserName();
                break;
            case "2":
                Even.play();
                break;
            case "3":
                Calc.play();
                break;
            case "4":
                Gcd.play();
                break;
            case "5":
                Progression.play();
                break;
            case "6":
                Prime.play();
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("[ERROR] > incorrect entry. Try again.");
        }
        scanner.close();

    }

}
