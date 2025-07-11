package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static final int ROUNDS = 3;

    public static void run(String[][] gameData, String task) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = SCANNER.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println(task);
        for (String[] arr : gameData) {
            String question = arr[0];
            String correctAnswer = arr[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userInput = SCANNER.nextLine().toLowerCase().trim();

            if (!correctAnswer.equals(userInput)) {
                System.out.println("'" + userInput + "'" + " is wrong answer :(. Correct answer was " + "'"
                        + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}
