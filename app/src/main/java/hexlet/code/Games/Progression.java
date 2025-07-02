package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;

    public static void play(String userName) {
        String[][] result = new String[Engine.ROUNDS][2];
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < result.length; i++) {
            int length = Utils.getRandomNumber(MIN_LENGTH, MAX_LENGTH);
            int randomIndex = Utils.getRandomNumber(length);

            String[] numbers = generateProgression(new String[length], randomIndex);
            String correctAnswer = numbers[randomIndex];
            numbers[randomIndex] = "..";

            result[i] = new String[]{
                    Arrays.toString(numbers)
                            .replaceAll("[\\[\\],]", ""), correctAnswer
            };
        }

        Engine.run(result, userName);
    }

    private static String[] generateProgression(String[] numbers, int randomIndex) {
        int incrementNumber = Math.abs(Utils.getRandomNumber());
        numbers[0] = Integer.toString(Utils.getRandomNumber());

        for (int j = 1; j < numbers.length; j++) {
            int prevNumber = Integer.parseInt(numbers[j - 1]);
            numbers[j] = Integer.toString(prevNumber + incrementNumber);
        }

        return numbers;
    }
}
