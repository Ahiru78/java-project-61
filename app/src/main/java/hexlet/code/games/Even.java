package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Even {
    public static void play() {
        Cli.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int winStreak = 0;

        while (winStreak < 3) {
            int quest = (int) (Math.random() * 101);
            var rightAnswer = (quest % 2 == 0) ? "yes" : "no";
            if (Engine.isWrong(quest, rightAnswer)) {
                break;
            }
            winStreak++;
        }
        Engine.isWin(winStreak);
    }
}
