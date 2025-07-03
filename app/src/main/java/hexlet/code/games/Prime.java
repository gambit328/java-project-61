package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static void play(String userName) {
        String[][] result = new String[Engine.ROUNDS][2];
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < result.length; i++) {
            int randomNumber = Math.abs(Utils.getRandomNumber());
            String correctAnswer = (isPrime(randomNumber)) ? "yes" : "no";

            result[i] = new String[]{Integer.toString(randomNumber), correctAnswer};
        }

        Engine.run(result, userName);
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
