package _1_objectsOnAList.HeightOrder;

import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    // shortest
    public Person shortest() {
        if (persons.isEmpty()) return null;

        Person shortestOne = persons.get(0);
        for (Person person : persons) {
            if (person.getHeight() < shortestOne.getHeight()) {
                shortestOne = person;
            }
        }
        return shortestOne;
    }

    // take
    public Person take() {
        if (persons.isEmpty()) return null;

        int shortestIndex = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (shortest().equals(persons.get(i))) {
                shortestIndex = i;
            }
        }
        return persons.remove(shortestIndex);
    }
}
