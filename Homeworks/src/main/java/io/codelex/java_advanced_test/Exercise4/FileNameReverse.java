package io.codelex.java_advanced_test.Exercise4;

import java.io.*;

public class FileNameReverse {
    private static final File file = new File("C:\\Users\\Jevgenijs\\Documents\\Folder For Exercise\\DocumentForExercise.txt");

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        StringBuilder originalName = new StringBuilder();
        while ((line = bufferedReader.readLine()) != null) {
            originalName.append(line);
        }
        bufferedReader.close();
        StringBuilder reverseName = originalName.reverse();
        StringBuilder fileName = new StringBuilder(file.getName());
        String nameReverse = fileName.reverse().toString().split("\\.")[1];
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("C:\\Users\\Jevgenijs\\Documents\\Folder For Exercise\\" + nameReverse + ".txt"));
        bufferedWriter.write(reverseName.toString());
        bufferedWriter.close();
        System.out.println(file.getName());
    }
}
