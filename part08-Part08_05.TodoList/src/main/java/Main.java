
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();

        // list.add("iets doen");
        // list.add("nog iets doen");
        // list.add("andermaal iets doen");
        // list.add("een vierde taak");

        // list.print();

        // list.remove(3);
        // System.out.println("");
        // list.print();

    }
}
