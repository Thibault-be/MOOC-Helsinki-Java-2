
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers  = new ArrayList<>();

        while (true){

            Integer input = Integer.valueOf(scanner.nextLine());
            if(input < 0) break;

            numbers.add(input);

            
        }


        numbers.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(numer -> numer < 6)
            .forEach(i -> System.out.println(i));

    }
}
