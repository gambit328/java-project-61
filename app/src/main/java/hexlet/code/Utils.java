package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random random = new Random();

    public static int getRandomNumber() {
        return random.nextInt(50) + 1;
    }

    public static int getRandomNumber(int number) {
        return random.nextInt(number);
    }
}
