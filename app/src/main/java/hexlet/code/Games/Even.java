package hexlet.code.Games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void play() {
        String[][] result = new String[Engine.getRounds()][2];

        for (int i = 0; i < result.length; i++) {
            int number = Utils.getRandomNumber();

            result[i] = new String[]{Integer.toString(number), (isEvenNumber(number)) ? "yes" : "no"};
        }
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Engine.run(result);
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
