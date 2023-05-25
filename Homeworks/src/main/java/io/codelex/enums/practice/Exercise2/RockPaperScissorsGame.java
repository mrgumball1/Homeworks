package io.codelex.enums.practice.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's begin...");
        System.out.println("Rock-Paper-Scissors");

        int trials = 0;
        int pcWins = 0;
        int playerWins = 0;

        while (true) {
            System.out.println("Your turn (Enter r for rock, p for paper, s for scissor, q to quit): ");
            String playerInput = scanner.nextLine().toLowerCase();

            if (playerInput.equals("q")) {
                break;
            } else if (!playerInput.matches("[rps]")) {
                System.out.println("READ THE SIGN CORRECT INPUT IS r , p , s");
                continue;
            }
            trials++;
            RockPaperScissors playerChoice = RockPaperScissors.values()[playerInput.charAt(0) - 's'];
            RockPaperScissors pcChoice = RockPaperScissors.values()[random.nextInt(3)];

            System.out.println("My turn: " + pcChoice);

            switch (playerChoice) {
                case SCISSORS -> {
                    switch (pcChoice) {
                        case SCISSORS -> System.out.println("Tie!");
                        case PAPER -> {
                            System.out.println("Scissors cuts paper, you won!");
                            playerWins++;
                        }
                        case ROCK -> {
                            System.out.println("Rock breaks scissor, I won!");
                            pcWins++;
                        }
                    }
                }
                case PAPER -> {
                    switch (pcChoice) {
                        case SCISSORS -> {
                            System.out.println("Scissors cuts paper, I won!");
                            playerWins++;
                        }
                        case PAPER -> System.out.println("Tie!");
                        case ROCK -> {
                            System.out.println("You won!");
                            playerWins++;
                        }
                    }
                }
                case ROCK -> {
                    switch (pcChoice) {
                        case SCISSORS -> {
                            System.out.println("You won!");
                            playerWins++;
                        }
                        case PAPER -> {
                            System.out.println("Rock breaks paper, I won!");
                            pcWins++;
                        }
                        case ROCK -> System.out.println("Tie!");
                    }
                }
            }
        }
        System.out.println("\nNumber of trials: " + trials);
        System.out.printf("I won %d (%.2f%%).%n", pcWins, ((double) pcWins / trials) * 100);
        System.out.printf("You won %d (%.2f%%).%n", playerWins, ((double) playerWins / trials) * 100);
        System.out.println("Bye!");
    }
}
