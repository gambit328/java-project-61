package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RND = new Random();

    public static int getRandomNumber() {
        return RND.nextInt(50) + 1;
    }

    public static int getRandomNumber(int number) {
        return RND.nextInt(number);
    }
}
