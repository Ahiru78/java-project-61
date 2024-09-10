package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int GAME_ROUNDS = 3;

    public static void gameStart(String description, String[][] gameData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scanName = new Scanner(System.in);
        var userName = scanName.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(description);
        for (int i = 0; i < GAME_ROUNDS; i++) {

            var question = gameData[i][0];
            var correctAnswer = gameData[i][1];
            System.out.println("Question: " + question);
            Scanner scanAnswer = new Scanner(System.in);
            String userAnswer = scanAnswer.next();
            System.out.println("Your answer: " + userAnswer);
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

