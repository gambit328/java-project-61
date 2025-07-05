package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_NUMBER = 50;

    public static void play(String userName) {
        String[][] result = new String[Engine.ROUNDS][2];

        for (int i = 0; i < result.length; i++) {
            int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
            int startNumber = Utils.getRandomNumber(MAX_NUMBER);
            int stepProgression = Utils.getRandomNumber(MAX_NUMBER);
            int randomIndex = Utils.getRandomNumber(length);

            String[] numbers = generateProgression(length, startNumber, stepProgression);
            String correctAnswer = numbers[randomIndex];
            numbers[randomIndex] = "..";

            result[i] = new String[]{
                    Arrays.toString(numbers)
                            .replaceAll("[\\[\\],]", ""), correctAnswer
            };
        }

        String task = "What number is missing in the progression?";
        Engine.run(result, userName, task);
    }

    private static String[] generateProgression(int length, int startNumber, int stepProgression) {
        String[] numbers = new String[length];
        numbers[0] = Integer.toString(startNumber);

        for (int j = 1; j < numbers.length; j++) {
            int prevNumber = Integer.parseInt(numbers[j - 1]);
            numbers[j] = Integer.toString(prevNumber + stepProgression);
        }

        return numbers;
    }
}
