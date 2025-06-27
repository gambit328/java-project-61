package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RND = new Random();
    private static final int MAX_NUMBER_DEFAULT = 50;

    public static int getRandomNumber() {
        return RND.nextInt(MAX_NUMBER_DEFAULT) + 1;
    }

    public static int getRandomNumber(int number) {
        return RND.nextInt(number);
    }

    public static int getRandomNumber(int min, int max) {
        return RND.nextInt(max - min) + min;
    }
}
