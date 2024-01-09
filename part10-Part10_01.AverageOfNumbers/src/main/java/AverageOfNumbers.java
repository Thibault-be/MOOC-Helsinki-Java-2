
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        //Implement a program, which reads user input.
        // If the user input is "end", the program stops reading input. 
        //The rest of the input is numbers. When the user input is "end", the program prints the average of all of the numbers.

        ArrayList<String> line  = new ArrayList<>();

        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            line.add(input);
        }

        double average = line.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .average()
                            .getAsDouble();

        System.out.println(average);       
    }
    

}
