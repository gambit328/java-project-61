package hexlet.code.Games;

import hexlet.code.GameRunner;
import hexlet.code.Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Gcd implements Game {
    private int countCorrectAnswers = 0;
    private String username = GameRunner.getUserName();

    @Override
    public void play(Scanner scanner) {
        if (username == null) {
            username = Greeting.setUserName(scanner);
        }
        System.out.println("What is the greatest common divisor of these numbers?");

        while (true) {
            int number1 = Math.abs(randomNumber());
            int number2 = Math.abs(randomNumber());
            int correctAnswer = 0;
            int userAnswer;

            if (number1 < number2) {
                int tmp = number1;
                number1 = number2;
                number2 = tmp;
            }

            System.out.println("Question: " + number1 + " and " + number2);
            System.out.print("Your answer: ");
            try {
                userAnswer = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("[ERROR] > need to enter number");
                return;
            }
            
            correctAnswer += gcd(number1, number2);
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

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private boolean checkCountAnswers() {
        return countCorrectAnswers == 3;
    }
}
