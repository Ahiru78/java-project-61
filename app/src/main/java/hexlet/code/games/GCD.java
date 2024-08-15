package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class GCD {
    public static void play() {
        Cli.greet();
        System.out.println("Find the greatest common divisor of given numbers.");

        int winStreak = 0;

        while (winStreak < 3) {
            int questNum1 = (int) (Math.random() * 101);
            int questNum2 = (int) (Math.random() * 101);

            var rightAnswer = findGCD(questNum1, questNum2);
            var quest =  questNum1 + " " + questNum2;

            if (Engine.isWrong(quest, rightAnswer)) {
                break;
            }
            winStreak++;
        }
        Engine.isWin(winStreak);
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
