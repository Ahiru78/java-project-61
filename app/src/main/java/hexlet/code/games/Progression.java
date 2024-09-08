package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void play() {
        final String description = "What number is missing in the progression?";
        String[][] gameData = new String[Engine.GAME_ROUNDS][2];
        final int arrayLength = 10;


        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {
            final int firstNumber = (int) (Math.random() * 10);
            final int step = (int) (Math.random() * (11 - 1) + 1);
            final int missingNumber = (int) (Math.random() * 10);

            var progression = createProgression(arrayLength, firstNumber, step, missingNumber);
            gameData[i][0] = String.join("", progression);
            gameData[i][1] = String.valueOf(firstNumber + step * (missingNumber));
        }
        Engine.gameStart(description, gameData);
    }
    public static String[] createProgression(int arrayLength, int firstNumber, int step, int missingNumber) {
        String[] progression = new String[arrayLength];
        progression[0] = firstNumber + " ";
        for (int i = 1; i < progression.length; i++) {
            var temp = Integer.parseInt(progression[i - 1].trim()) + step;
            progression[i] = temp + " ";
        }
        progression[missingNumber] = ".. ";
        return progression;
    }
}
