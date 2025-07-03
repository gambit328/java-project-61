package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RND = new Random();

    public static int getRandomNumber(int number) {
        return RND.nextInt(number);
    }

    public static int getRandomNumber(int min, int max) {
        return RND.nextInt(max - min) + min;
    }
}
