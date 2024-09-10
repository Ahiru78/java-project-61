package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void play() {
        final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] gameData = new String[Engine.GAME_ROUNDS][2];
        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {
            final int number = Utils.getRandomInt(1, 100);
            gameData[i][0] = String.valueOf(number);
            gameData[i][1] = isEven(number);
        }
        Engine.gameStart(description, gameData);
    }
    public static String isEven(int number) {
        return (number % 2 == 0) ? "yes" : "no";
    }
}
