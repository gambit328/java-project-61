package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {

    public static void play() {
        String[][] result = new String[Engine.getRounds()][2];
        System.out.println("What is the greatest common divisor of these numbers?");

        for (int i = 0; i < result.length; i++) {
            String question = "";
            int correctAnswer = 0;
            int number1 = Math.abs(Utils.getRandomNumber());
            int number2 = Math.abs(Utils.getRandomNumber());

            if (number1 < number2) {
                int tmp = number1;
                number1 = number2;
                number2 = tmp;
            }

            question += number1 + " and " + number2;
            correctAnswer += gcd(number1, number2);

            result[i] = new String[]{question, Integer.toString(correctAnswer)};
        }

        Engine.run(result);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
