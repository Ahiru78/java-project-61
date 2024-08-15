package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    public static void play() {
        Cli.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        int winStreak = 0;

        while (winStreak < 3) {
            int quest = (int) (Math.random() * 101);
            var rightAnswer = isSimple(quest);
            if (Engine.isWrong(quest, rightAnswer)) {
                break;
            }
            winStreak++;
        }
        Engine.isWin(winStreak);
    }

    public static String isSimple(int number) {
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
