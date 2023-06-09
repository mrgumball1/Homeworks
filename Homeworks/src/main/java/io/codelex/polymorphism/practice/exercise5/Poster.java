package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    protected int dimensions;
    protected int numOfCopies;
    protected int costPerCopy;

    public Poster(int fee, int dimensions, int numOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numOfCopies = numOfCopies;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public int cost() {
        return fee + (costPerCopy * numOfCopies);
    }

    @Override
    public String toString() {
        return super.toString()
                + " Poster ad: dimensions = " + dimensions
                + " number of copies = " + numOfCopies
                + " cost per copy = " + costPerCopy;
    }
}
