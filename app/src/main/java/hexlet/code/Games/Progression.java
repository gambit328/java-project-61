package hexlet.code.Games;

import hexlet.code.GameRunner;
import hexlet.code.Game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Progression implements Game {
    private int countCorrectAnswers = 0;
    private String username = GameRunner.getUserName();

    @Override
    public void play(Scanner scanner) {
        Random random = new Random();
        if (username == null) {
            username = Greeting.setUserName(scanner);
        }
        System.out.println("What number is missing in this progression?");

        while (true) {
            int[] numbers = new int[8];
            int incrementNumber = Math.abs(randomNumber());
            numbers[0] = random.nextInt(10) + 1;
            int randomIndex = random.nextInt(numbers.length);
            int userAnswer;

            for (int i = 1; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + incrementNumber;
            }

            System.out.print("Question: ");
            for (int i = 0; i < numbers.length; i++) {
                if (i == randomIndex) {
                    System.out.print(".. ");
                } else {
                    System.out.print(numbers[i] + " ");
                }
            }

            System.out.print("\nYour answer: ");
            try {
                userAnswer = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("[ERROR] > need to enter number");
                return;
            }

            int correctAnswer = numbers[randomIndex];
            if (userAnswer != correctAnswer) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer :(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + username);
                return;
            }

            countCorrectAnswers++;
            System.out.println("Correct!");
            if (checkCountAnswers()) {
                System.out.println("Congratulations, " + username);
                return;
            }

        }
    }

    private boolean checkCountAnswers() {
        return countCorrectAnswers == 3;
    }
}
