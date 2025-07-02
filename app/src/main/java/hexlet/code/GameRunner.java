package hexlet.code;

import java.util.Scanner;

import hexlet.code.Games.Even;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Gcd;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;

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

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "!");

        switch (userChoice) {
            case "1":
                break;
            case "2":
                Even.play(userName);
                break;
            case "3":
                Calc.play(userName);
                break;
            case "4":
                Gcd.play(userName);
                break;
            case "5":
                Progression.play(userName);
                break;
            case "6":
                Prime.play(userName);
                break;
            case "0":
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("[ERROR] >" + userChoice +" incorrect entry. Try again.");
        }
        scanner.close();

    }

}
