package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int ROUNDS = 3;

    public static void run(String[][] gameData, String userName) {
        for (String[] arr : gameData) {
            String question = arr[0];
            String correctAnswer = arr[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userInput = SCANNER.nextLine().toLowerCase().trim();

            if (!checkAnswer(userInput, correctAnswer)) {
                System.out.println("'" + userInput + "'" + " is wrong answer :(. Correct answer was " + "'"
                        + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + userName + "!");
    }

    private static boolean checkAnswer(String userInput, String correctAnswer) {
        return userInput.equals(correctAnswer);
    }

    public static int getRounds() {
        return ROUNDS;
    }
}
