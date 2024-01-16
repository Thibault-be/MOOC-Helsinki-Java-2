
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    // implement these three methods
    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> rowSumArray = new ArrayList<>();

        for (int row = 0; row <  this.square.length; row++){

            int colSum = 0;
            for (int col = 0; col < this.square[row].length; col++){
                colSum += this.square[row][col];
            }
            rowSumArray.add(colSum);
        }
        
        return rowSumArray;
    }

    public ArrayList<Integer> sumsOfColumns() {
         ArrayList<Integer> colSumArray = new ArrayList<>();

        for (int col = 0; col <  this.square[0].length; col++){

            int colSum = 0;
            for (int row = 0; row < this.square.length; row++){
                colSum += this.square[row][col];
            }
            colSumArray.add(colSum);
        }
        
        return colSumArray;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> diagonalSumArray = new ArrayList<>();

        int diagonalSum = 0;
        for (int i = 0; i < this.square.length; i++){
            diagonalSum += this.square[i][i];
        }
        diagonalSumArray.add(diagonalSum);

        int otherDiagonalSum = 0;
        int row = 0;
        int col = this.square.length-1;
        for (int j = this.square.length-1; j >= 0; j--){
            otherDiagonalSum += this.square[row][col];
            row++;
            col--;
        }
        diagonalSumArray.add(otherDiagonalSum);

        return diagonalSumArray;



    }
    

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
