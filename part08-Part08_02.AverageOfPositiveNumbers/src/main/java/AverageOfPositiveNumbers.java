
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while (true){
            String inputString = scanner.nextLine();

            try {
                int input = Integer.valueOf(inputString);

                if (input == 0) break;

                if (input > 0){
                    sum += input;
                    count++;
                }
            } catch (Exception e) {
                continue;
            }


        }
        if (count == 0){
            System.out.println("Could not calculate the average");
        }else {
            System.out.println(1.0 * sum / count);
        }

    }
}
