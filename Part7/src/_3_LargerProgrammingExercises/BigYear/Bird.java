package _3_LargerProgrammingExercises.BigYear;

public class Bird {
    private String commonName;
    private String latinName;
    private int numberOfObservations;

    public Bird(String name, String latinName) {
        this.commonName = name;
        this.latinName = latinName;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getNumberOfObservations() {
        return numberOfObservations;
    }

    public void makeObservation() {
        numberOfObservations += 1;
    }

    @Override
    public String toString() {
        return this.getCommonName() + " (" + this.getLatinName() + "): " + this.getNumberOfObservations()
                + " observations";
    }
}
