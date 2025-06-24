package hexlet.code.Games;

import hexlet.code.GameRunner;
import hexlet.code.Game;

import java.util.Scanner;

public class Prime implements Game {
    private int countCorrectAnswers = 0;
    private String username = GameRunner.getUserName();

    @Override
    public void play(Scanner scanner) {
        if (username == null) {
            username = Greeting.setUserName(scanner);
        }
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (true) {
            int randomNumber = Math.abs(randomNumber());
            String correctAnswer = (isPrime(randomNumber)) ? "yes" : "no";

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
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

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean checkCountAnswers() {
        return countCorrectAnswers == 3;
    }
}
