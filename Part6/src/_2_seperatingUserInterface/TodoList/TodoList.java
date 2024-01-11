package _2_seperatingUserInterface.TodoList;

import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String task) {
        todoList.add(task);
    }

    public void remove(int number) {
        todoList.remove(number - 1);
    }

    public void print() {
        for (int i = 0; i < todoList.size(); i++) {
            int id = i + 1;
            System.out.println(id + ": " + todoList.get(i));
        }
    }
}
