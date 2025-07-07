package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int MAX_NUMBER = 50;

    public static void play() {
        String[][] result = new String[Engine.ROUNDS][2];

        for (int i = 0; i < result.length; i++) {
            String question = "";
            int correctAnswer = 0;
            int number1 = Math.abs(Utils.getRandomNumber(MAX_NUMBER));
            int number2 = Math.abs(Utils.getRandomNumber(MAX_NUMBER));

            if (number1 < number2) {
                int tmp = number1;
                number1 = number2;
                number2 = tmp;
            }

            question += number1 + " " + number2;
            correctAnswer += gcd(number1, number2);

            result[i] = new String[]{question, Integer.toString(correctAnswer)};
        }

        String task = "Find the greatest common divisor of given numbers.";
        Engine.run(result, task);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
