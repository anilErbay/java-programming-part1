package _4_objectsAndReferences.Practice;

public class Main2 {
    public static void main(String[] args) {
        SimpleDate johnsBirthday = new SimpleDate(1, 1, 1990);
        Person2 john = new Person2("John", johnsBirthday);
        System.out.println(john);
    }
}
