package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

public class Progression {
    public static void play() {
        String[][] result = new String[Engine.getRounds()][2];
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < result.length; i++) {
            String correctAnswer = "";
            String[] numbers = new String[8];
            int incrementNumber = Math.abs(Utils.getRandomNumber());
            numbers[0] = Integer.toString(Utils.getRandomNumber());
            int randomIndex = Utils.getRandomNumber(numbers.length);

            for (int j = 1; j < numbers.length; j++) {
                int prevNumber = Integer.parseInt(numbers[j - 1]);
                numbers[j] = Integer.toString(prevNumber + incrementNumber);
            }

            correctAnswer = numbers[randomIndex];
            numbers[randomIndex] = "..";

            result[i] = new String[]{
                    Arrays.toString(numbers)
                            .replaceAll("[\\[\\],]", ""), correctAnswer
            };
        }

        Engine.run(result);
    }
}
