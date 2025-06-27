package hexlet.code.Games;

import hexlet.code.GameRunner;
import hexlet.code.Game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Calc implements Game {
    private int countCorrectAnswers = 0;
    private String username = GameRunner.getUserName();
    private final Random random = new Random();

    @Override
    public void play(Scanner scanner) {
        String[] operations = {"+", "-", "*"};

        if (username == null) {
            username = Greeting.setUserName(scanner);
        }

        System.out.println("What is the result of the expression?");

        while (true) {
            int randomChoice = random.nextInt(operations.length);
            int userAnswer;
            int correctAnswer = 0;
            int number1 = randomNumber();
            int number2 = randomNumber();

            System.out.print("Question: ");
            switch (operations[randomChoice]) {
                case "+":
                    System.out.println(number1 + " + " + number2);
                    correctAnswer = number1 + number2;
                    break;
                case "-":
                    System.out.println(number1 + " - " + number2);
                    correctAnswer = (number1 - number2);
                    break;
                case "*":
                    System.out.println(number1 + " * " + number2);
                    correctAnswer = number1 * number2;
                    break;
                default:
                    System.out.println("Ooops. Something wrong");
            }

            System.out.print("Your answer: ");
            try {
                userAnswer = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("[ERROR] > need to enter number");
                return;
            }

            if (userAnswer != correctAnswer) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer :(. "
                        + "Correct answer was '" + correctAnswer + "'.");
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
