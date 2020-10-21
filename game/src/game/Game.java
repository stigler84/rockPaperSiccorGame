package game;

import game.utils.Paper;
import game.utils.Rock;
import game.utils.Scissor;
import game.utils.Utils;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Utils[] utils = {new Rock(), new Paper(), new Scissor()};
    private Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void run() {
        Utils cpuChoice = utils[random.nextInt(utils.length)];
        String[] score = {"You lost", "Draw", "You won"};
        int userPoints = 0;
        int cpuPoints = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Choose 0 for rock, 1 for paper or 2 for scissors > ");
            int userInput = scanner.nextInt();
            Utils usersChoice = utils[userInput];
            System.out.println("You chose " + usersChoice.toString());
            System.out.println("CPU chose " + cpuChoice.toString());
            System.out.println(usersChoice.compareTo(cpuChoice));
            String outputScore = score[usersChoice.compareTo(cpuChoice) + 1];
            System.out.println(outputScore);
            if (usersChoice.compareTo(cpuChoice) == 1) {
                userPoints++;
            } else if (usersChoice.compareTo(cpuChoice) < 0) {
                cpuPoints++;
            }
        }
        if (userPoints > cpuPoints) {
            System.out.println("You won by "  + userPoints + ": " + cpuPoints);
        } else if (userPoints == cpuPoints) {
            System.out.println("It is a draw");
        } else {
            System.out.println("You lost by" + userPoints + ": " + cpuPoints);
        }

        scanner.close();
    }
}
