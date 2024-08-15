package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
                        1 - Greet
                        2 - Even
                        3 - Calc
                        4 - GCD
                        5 - Progression
                        6 - Prime
                        0 - Exit
                        """);
        Scanner scanChoice = new Scanner(System.in);
        int choice = scanChoice.nextInt();
        System.out.println("Your choice: " + choice);

        switch (choice) {
            case 0 -> System.out.println("Bye!");
            case 1 -> Cli.greet();
            case 2 -> Even.play();
            case 3 -> Calc.play();
            case 4 -> GCD.play();
            case 5 -> Progression.play();
            case 6 -> Prime.play();
            default -> System.out.println("There is no such game. Bye!");
        }
    }
}
