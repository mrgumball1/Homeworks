package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    static VideoStore store = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate a movie");
            System.out.println("Choose 5 to print storage");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    receiveRating(keyboard);
                case 5:
                    store.printOutInventory();
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String title = scanner.next();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            //todo - add video
            Video v = new Video(title);
            v.receiveRating(rating);
            store.addVideo(v);
        }
    }

    private static void rentVideo(Scanner scanner) {
        //todo - rent video
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter movie name to rent");
            String title = scanner.next();
            store.checkOut(title);
        }
    }

    private static void returnVideo(Scanner scanner) {
        //todo - return video
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter movie name to return video");
            String title = scanner.next();
            store.returnVideo(title);
        }
    }

    private static void receiveRating(Scanner scanner) {
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter movie name to rate");
            String title = scanner.next();
            System.out.println("Enter yours rating for the movie");
            int rating = scanner.nextInt();
            store.getRating(title, rating);
        }
    }
}
