package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static void play() {
        final String description = "What number is missing in the progression?";
        String[][] gameData = new String[Engine.GAME_ROUNDS][2];
        final int arrayLength = 10;


        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {
            final int firstNumber = Utils.getRandomInt(1, 9);
            final int step = Utils.getRandomInt(1, 10);
            final int missingNumber = Utils.getRandomInt(0, 9);

            var progression = createProgression(arrayLength, firstNumber, step);
            progression[missingNumber] = ".. ";
            gameData[i][0] = String.join("", progression);
            gameData[i][1] = String.valueOf(firstNumber + step * (missingNumber));
        }
        Engine.gameStart(description, gameData);
    }
    public static String[] createProgression(int arrayLength, int firstNumber, int step) {
        String[] progression = new String[arrayLength];
        progression[0] = firstNumber + " ";
        for (int i = 1; i < progression.length; i++) {
            var temp = Integer.parseInt(progression[i - 1].trim()) + step;
            progression[i] = temp + " ";
        }
        return progression;
    }
}
