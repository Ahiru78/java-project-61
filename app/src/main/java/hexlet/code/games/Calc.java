package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Calc {
    public static void play() {
        Cli.greet();
        System.out.println("What is the result of the expression?");

        final int winMax = 3;
        int winStreak = 0;
        int rightAnswer;
        String quest;

        while (winStreak < winMax) {
            final int questNum1 = (int) (Math.random() * 11);
            final int questNum2 = (int) (Math.random() * 11);
            final int randExp = (int) (Math.random() * 3);

            switch (randExp) {
                case 0 -> {
                    rightAnswer = questNum1 + questNum2;
                    quest = questNum1 + " + " + questNum2;
                    break;
                }
                case 1 -> {
                    rightAnswer = questNum1 - questNum2;
                    quest = questNum1 + " - " + questNum2;
                    break;
                }
                case 2 -> {
                    rightAnswer = questNum1 * questNum2;
                    quest = questNum1 + " * " + questNum2;
                    break;
                }
                default -> {
                    System.out.println("Something goes wrong!");
                    rightAnswer = questNum1 + questNum2;
                    quest = questNum1 + " + " + questNum2;
                    break;
                }
            }

            if (Engine.isWrong(quest, rightAnswer)) {
                break;
            }
            winStreak++;
        }
        Engine.isWin(winStreak);
    }
}
