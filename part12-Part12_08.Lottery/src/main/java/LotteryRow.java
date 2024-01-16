
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here

        // create random object
        Random rand = new Random();

        // 7 loops
        while (this.numbers.size() < 7){
            int newNum = rand.nextInt(40) +1;

            if (this.containsNumber(newNum)) continue;
            this.numbers.add(newNum);
        }

    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) return true;
        return false;
    }
}

