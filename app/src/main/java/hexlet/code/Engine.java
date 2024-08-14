package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static boolean isWrong(Object questNum, Object rightAnswer) {
        System.out.println("Question: " + questNum);
        Scanner scanAnswer = new Scanner(System.in);
        String userAnswer = scanAnswer.next();
        System.out.println("Your answer: " + userAnswer);

        if (userAnswer.equals(rightAnswer.toString())) {
            System.out.println("Correct!");
            return false;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'.");
            return true;
        }
    }

    public static void isWin(int winStreak) {
        if (winStreak == 3) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        } else {
            System.out.println("Let's try again, " + Cli.getName() + "!");
        }
    }
}
