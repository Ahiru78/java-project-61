package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void play() {
        final String description = "What is the result of the expression?";
        String[][] gameData = new String[Engine.GAME_ROUNDS][2];
        String[] operators = new String[]{" + ", " - ", " * "};

        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {
            int number1 = (int) (Math.random() * 11);
            int number2 = (int) (Math.random() * 11);
            final int operatorIndex = (int) (Math.random() * 3);
            gameData[i][0] = number1 + operators[operatorIndex] + number2;
            gameData[i][1] = String.valueOf(calculate(number1, number2, operators[operatorIndex]));
        }
        Engine.gameStart(description, gameData);
    }
    public static int calculate(int number1, int number2, String operator) {
        return switch (operator) {
            case " + " -> number1 + number2;
            case " - " -> number1 - number2;
            case " * " -> number1 * number2;
            default -> 0;
        };
    }
}
