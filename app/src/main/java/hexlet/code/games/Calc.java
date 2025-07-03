package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int MAX_NUMBER = 50;

    public static void play(String userName) {
        String[][] result = generateExercise(new String[Engine.ROUNDS][2]);

        String task = "What is the result of the expression?";
        Engine.run(result, userName, task);
    }

    private static String[][] generateExercise(String[][] result) {
        String[] operations = {"+", "-", "*"};

        for (int i = 0; i < result.length; i++) {
            String randomOperation = operations[Utils.getRandomNumber(operations.length)];
            int number1 = Utils.getRandomNumber(MAX_NUMBER);
            int number2 = Utils.getRandomNumber(MAX_NUMBER);
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

        return result;
    }
}
