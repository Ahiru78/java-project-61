package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    public static void play() {
        final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] gameData = new String[Engine.GAME_ROUNDS][2];

        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {
            final int number = (int) (Math.random() * 101);
            gameData[i][0] = String.valueOf(number);
            gameData[i][1] = isPrime(number);
        }
        Engine.gameStart(description, gameData);
    }
    public static String isPrime(int number) {
        if (number < 2) {
            return "no";
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
