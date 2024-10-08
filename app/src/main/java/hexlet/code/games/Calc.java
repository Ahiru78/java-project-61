package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static void play() {
        final String description = "What is the result of the expression?";
        String[][] gameData = new String[Engine.GAME_ROUNDS][2];
        String[] operators = new String[]{" + ", " - ", " * "};

        for (int i = 0; i < Engine.GAME_ROUNDS; i++) {
            final int number1 = Utils.getRandomInt(1, 10);
            final int number2 = Utils.getRandomInt(1, 10);
            final int operatorIndex = Utils.getRandomInt(0, 2);
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
            // У меня не вышло добавить break, так как метод должен что-то возвращать.
            default -> throw new IllegalStateException("Unexpected value");
        };
    }
}
