package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public final class GameRunner {

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
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

        switch (userChoice) {
            case "1":
                Cli.greeting();
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
                System.out.println("[ERROR] >" + userChoice + " incorrect entry. Try again.");
        }
        scanner.close();

    }

}
