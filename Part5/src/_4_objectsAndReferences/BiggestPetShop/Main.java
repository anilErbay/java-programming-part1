package _4_objectsAndReferences.BiggestPetShop;

public class Main {
    public static void main(String[] args) {
        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        Pet floki = new Pet("Floki", "cat");
        Person walker = new Person("Walker", floki);

        System.out.println(leo);
        System.out.println(walker);
    }
}
