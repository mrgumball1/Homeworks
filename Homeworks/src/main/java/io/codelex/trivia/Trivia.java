package io.codelex.trivia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class Trivia {
    private static final int TOTAL_ROUNDS = 20;

    public static void main(String[] args) {

        int correctAnswerCounter = 0;

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            try {
                int questionAnswer = generateQuestionAnswer();
                System.out.println("You need choose the right number instead of: ???");
                String question = getQuestionFromAPI(questionAnswer);
                System.out.println(question.replace(Integer.toString(questionAnswer), "???"));

                HashSet<Integer> answerSet = generateAnswerSet(questionAnswer);
                System.out.println(answerSet);
                System.out.println("Choose an answer!!");
                String playerAnswer = getPlayerAnswer();

                if (playerAnswer.equals(Integer.toString(questionAnswer))) {
                    correctAnswerCounter++;
                    System.out.println("Correct answer!");
                } else {
                    System.out.println("Incorrect answer!");
                    System.out.println("Correct answers: " + correctAnswerCounter + "/" + TOTAL_ROUNDS);
                    System.out.println("Last question with correct answer: " + question);
                    break;
                }
            } catch (IOException e) {
                System.out.println("Error: Failed to retrieve question from the API.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Incorrect input format.");
            }
        }
    }

    private static int generateQuestionAnswer() {
        Random random = new Random();
        return random.nextInt(150);
    }

    private static String getQuestionFromAPI(int questionAnswer) throws IOException {
        String apiURL = "http://numbersapi.com/" + questionAnswer;
        URL url = new URL(apiURL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            StringBuilder response = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            return response.toString();
        } else {
            throw new IOException("Error: " + responseCode);
        }
    }

    private static HashSet<Integer> generateAnswerSet(int questionAnswer) {
        HashSet<Integer> answerSet = new HashSet<>();
        answerSet.add(questionAnswer);

        Random random = new Random();
        for (int j = 0; j < 2; j++) {
            answerSet.add(random.nextInt(150));
        }

        return answerSet;
    }

    private static String getPlayerAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
