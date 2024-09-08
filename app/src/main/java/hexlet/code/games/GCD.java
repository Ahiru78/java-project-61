package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void play() {
        final String description = "Find the greatest common divisor of given numbers.";
        String[][] gameData = new String[Engine.GAME_ROUNDS][2];

        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {
            final int number1 = (int) (Math.random() * 101);
            final int number2 = (int) (Math.random() * 101);
            gameData[i][0] = number1 + " " + number2;
            gameData[i][1] = String.valueOf(findGCD(number1, number2));
        }
        Engine.gameStart(description, gameData);
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
