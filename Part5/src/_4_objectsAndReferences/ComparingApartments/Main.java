package _4_objectsAndReferences.ComparingApartments;

public class Main {
    public static void main(String[] args) {
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true

        System.out.println();

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));

        System.out.println();

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt)); // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt)); // true
    }
}
