package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static void play(String userName) {
        String[] operations = {"+", "-", "*"};
        String[][] result = new String[Engine.ROUNDS][2];

        for (int i = 0; i < result.length; i++) {
            String randomOperation = operations[Utils.getRandomNumber(operations.length)];
            int number1 = Utils.getRandomNumber();
            int number2 = Utils.getRandomNumber();
            int correctAnswer = 0;
            String question = "";

            switch (randomOperation) {
                case "+":
                    question += number1 + " + " + number2;
                    correctAnswer += number1 + number2;
                    break;
                case "-":
                    question += number1 + " - " + number2;
                    correctAnswer += (number1 - number2);
                    break;
                case "*":
                    question += number1 + " * " + number2;
                    correctAnswer += number1 * number2;
                    break;
                default:
                    System.out.println("Ooops. Something wrong");
            }

            result[i] = new String[]{question, Integer.toString(correctAnswer)};
        }

        String task = "What is the result of the expression?";
        Engine.run(result, userName, task);
    }
}
