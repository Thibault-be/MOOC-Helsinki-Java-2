
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userInput = new ArrayList<>();

        while (true){

            String input = scanner.nextLine();
            if (input.equals("")) break;

            userInput.add(input);
        }
        System.out.println("\n\n\n\n**************************");
        userInput.stream()
            .forEach(line -> System.out.println(line));

    }
}
