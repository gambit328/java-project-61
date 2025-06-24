package hexlet.code.Games;

import hexlet.code.Game;
import hexlet.code.GameRunner;
import java.util.Scanner;

public class Even implements Game {
    private int countCorrectAnswers = 0;
    private String username = GameRunner.getUserName();

    @Override
    public void play(Scanner scanner) {
        if (username == null) {
            username = Greeting.setUserName(scanner);
        }
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        while (true) {
            int number = randomNumber();
            String correctAnswer = (isEvenNumber(number)) ? "yes" : "no";

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (checkAnswer(correctAnswer, userAnswer)) {
                System.out.println("'" + userAnswer + "'" + " is wrong answer :(. Correct answer was " + "'"
                        + correctAnswer + "'");
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

    private boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    private boolean checkCountAnswers() {
        return countCorrectAnswers == 3;
    }

    private boolean checkAnswer(String correctAnswer, String userInput) {
        return !userInput.trim().toLowerCase().equals(correctAnswer);
    }
}
