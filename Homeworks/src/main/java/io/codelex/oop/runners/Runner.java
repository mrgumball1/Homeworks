package io.codelex.oop.runners;

public enum Runner {
    ADVANCED(180, 250),
    BEGINNER(240, 340),
    INTERMEDIATE(120, 200);
    int minimum;
    int maximum;

    Runner(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    static Runner getFitnessLevel(int timeOfMarathon) {
        for (Runner runner : Runner.values()) {
            if (timeOfMarathon >= runner.minimum && timeOfMarathon <= runner.maximum) {
                return runner;

            }
        }
        return null;
    }

}
