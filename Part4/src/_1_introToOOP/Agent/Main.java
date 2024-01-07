package _1_introToOOP.Agent;

public class Main {
    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");
        bond.toString(); // this prints nothing

        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }
}
