package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public interface Game {
    Random random = new Random();

    void play(Scanner scanner);
    default int randomNumber() {
        return random.nextInt(100) + 1;
    }
}
