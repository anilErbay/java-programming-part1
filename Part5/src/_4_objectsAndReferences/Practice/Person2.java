package _4_objectsAndReferences.Practice;

public class Person2 {
    private String name;
    private SimpleDate birthday;
    private int weight = 0;
    private int length = 0;

    public Person2(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
