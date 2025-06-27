package hexlet.code;

import hexlet.code.Games.Greeting;

import java.util.Scanner;

public class Engine {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String username = Greeting.setUserName();
    private static final int rounds = 3;

    public static void run(String[][] gameData) {
        for (String[] arr : gameData) {
            String question = arr[0];
            String correctAnswer = arr[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userInput = scanner.nextLine().toLowerCase().trim();

            if (!checkAnswer(userInput, correctAnswer)) {
                System.out.println("'" + userInput + "'" + " is wrong answer :(. Correct answer was " + "'"
                        + correctAnswer + "'");
                System.out.println("Let's try again, " + username);
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + username);
    }

    private static boolean checkAnswer(String userInput, String correctAnswer) {
        return userInput.equals(correctAnswer);
    }

    public static int getRounds() {
        return rounds;
    }
}
