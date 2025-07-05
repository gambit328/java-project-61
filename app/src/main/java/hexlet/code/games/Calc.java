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
        int number1 = Utils.getRandomNumber(MAX_NUMBER);
        int number2 = Utils.getRandomNumber(MAX_NUMBER);
        String randomOperation = operations[Utils.getRandomNumber(operations.length)];
        for (int i = 0; i < result.length; i++) {
            result[i] = expressionCalculation(randomOperation, number1, number2);
        }
        return result;
    }

    private static String[] expressionCalculation(String randomOperation, int number1, int number2) {
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
                System.out.println("[ERROR] > " + randomOperation + " is not correct input.");
        }

        return new String[]{question, Integer.toString(correctAnswer)};
    }
}
