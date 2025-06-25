package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public interface Game {
    void play(Scanner scanner);
    default int randomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
