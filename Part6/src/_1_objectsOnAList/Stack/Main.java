package _1_objectsOnAList.Stack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);

        // ***
        System.out.println();
        Stack sa = new Stack();
        sa.add("1");
        sa.add("2");
        sa.add("3");
        sa.add("4");
        sa.add("5");

        while (!sa.isEmpty()) {
            System.out.println(sa.take());
        }
        System.out.println(sa.isEmpty());
    }
}
