package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void play(String userName) {
        String[][] result = new String[Engine.ROUNDS][2];

        for (int i = 0; i < result.length; i++) {
            int number = Utils.getRandomNumber();

            result[i] = new String[]{Integer.toString(number), (isEvenNumber(number)) ? "yes" : "no"};
        }
        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.run(result, userName, task);
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
