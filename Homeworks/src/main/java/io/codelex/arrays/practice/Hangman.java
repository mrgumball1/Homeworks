package io.codelex.arrays.practice;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    private static String[] words = {"dolphin", "computer", "avocado", "jazz", "program"};
    private static Random random = new Random();
    private static String word;
    private static char[] guesses;
    private static StringBuilder misses;
    private static int maxTries = 5;
    private static int tries;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            resetGame();
            playGame(scanner);

            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine();
        } while (playAgain.equalsIgnoreCase("yes"));
    }

    private static void resetGame() {
        word = words[random.nextInt(words.length)];
        guesses = new char[word.length()];
        misses = new StringBuilder();
        tries = 0;
    }

    private static void playGame(Scanner scanner) {
        while (true) {
            displayGameState();

            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if (isAlreadyGuessed(guess)) {
                System.out.println("You've already guessed that letter.");
                continue;
            }

            if (isCorrectGuess(guess)) {
                System.out.println("Correct guess!");
                if (isWordGuessed()) {
                    displayGameState();
                    System.out.println("YOU GOT IT!");
                    break;
                }
            } else {
                System.out.println("Incorrect guess!");
                misses.append(guess);
                tries++;
                if (tries >= maxTries) {
                    displayGameState();
                    System.out.println("Sorry, you lose. The word was: " + word);
                    break;
                }
            }
        }
    }

    private static boolean isAlreadyGuessed(char guess) {
        for (char letter : guesses) {
            if (letter == guess) {
                return true;
            }
        }
        return false;
    }

    private static boolean isCorrectGuess(char guess) {
        boolean correctGuess = false;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guesses[i] = guess;
                correctGuess = true;
            }
        }
        return correctGuess;
    }

    private static boolean isWordGuessed() {
        for (char letter : guesses) {
            if (letter == 0) {
                return false;
            }
        }
        return true;
    }

    private static void displayGameState() {
        System.out.println("\nWord: " + getWordProgress());
        System.out.println("Misses: " + misses.toString());
    }

    private static String getWordProgress() {
        StringBuilder progress = new StringBuilder();
        for (char letter : guesses) {
            progress.append(letter == 0 ? "_ " : letter + " ");
        }
        return progress.toString();
    }

}
