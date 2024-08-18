package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Progression {

    public static void play() {
        Cli.greet();
        System.out.println("What number is missing in the progression?");

        final int winMax = 3;
        int winStreak = 0;

        while (winStreak < winMax) {

            final int firstRan = (int) (Math.random() * 10);
            final int step = (int) (Math.random() * (11 - 1) + 1);
            final int missingNum = (int) (Math.random() * 10);
            String[] prog = new String[10];
            int firstNum = firstRan;
            prog[0] =  firstNum + " ";

            for (int i = 1; i < prog.length; i++) {
                var temp = Integer.parseInt(prog[i - 1].trim()) + step;
                prog[i] = temp + " ";
            }
            prog[missingNum] = ".. ";

            String quest = String.join("", prog);

            var rightAnswer = firstNum + step * (missingNum);
            if (Engine.isWrong(quest, rightAnswer)) {
                break;
            }
            winStreak++;
        }
        Engine.isWin(winStreak);
    }
}
