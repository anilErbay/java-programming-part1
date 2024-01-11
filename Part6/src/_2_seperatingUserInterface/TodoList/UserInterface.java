package _2_seperatingUserInterface.TodoList;

import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scan;

    public UserInterface(TodoList todoList, Scanner scan) {
        this.todoList = todoList;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("remove")) {
                remove();
            } else {
                System.out.println("Invalid option");
            }
        }
        scan.close();
    }

    public void add() {
        System.out.print("To add: ");
        String item = scan.nextLine();
        todoList.add(item);
    }

    public void list() {
        todoList.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int index = Integer.parseInt(scan.nextLine());
        todoList.remove(index);
    }
}
