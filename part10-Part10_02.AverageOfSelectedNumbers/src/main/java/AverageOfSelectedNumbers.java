
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne


/*
Implement a program, which reads user input. If the user input is "end", program stops reading input. 
The rest of the input is numbers.

Then user is asked if the program should print the average of all the positive numbers, 
or the average of all the negative numbers (n or p). If the user selects "n", 
the average of all the negative numbers is printed. Otherwise the average of all the positive numbers is printed.

*/
        ArrayList<String> numbers = new ArrayList<>();

        System.out.println("Put in some numbers. Type 'end' to quit.");

        
        while (true){

            String input = scanner.nextLine();
            if (input.equals("end")) break;
            numbers.add(input);

        }

        System.out.println("Print out average of positive or negative numbers. Choose n or p.");
        String  positiveOrNegative = scanner.nextLine();

        double average = 0.0;
        if (positiveOrNegative.equals("n")){
            average = numbers.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number < 0)
                        .average()
                        .getAsDouble();
        } else {
            average = numbers.stream()
                        .mapToInt(s -> Integer.valueOf(s))
                        .filter(number -> number > 0)
                        .average()
                        .getAsDouble();
        }
        


        System.out.println(average);


    }


}
