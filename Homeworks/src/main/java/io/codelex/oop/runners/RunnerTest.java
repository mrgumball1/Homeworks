package io.codelex.oop.runners;

public class RunnerTest {
    public static void main(String[] args) {
        int timeOfMarathon = 120;
        Runner runner = Runner.getFitnessLevel(timeOfMarathon);
        System.out.println(runner);
    }
}
