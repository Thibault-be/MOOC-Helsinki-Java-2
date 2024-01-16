
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        //what is the middle column?
        int startCol = size / 2;

        square.placeValue(startCol, 0, 1);

        int numberOfLoops = size * size - 1; 
        int startRow = 0;
        int startVal = 1;
        for (int i = 0; i < numberOfLoops; i++ ){

            startVal++;

            //place value in first square
            
            int nextLogicalRow = startRow - 1;
            if (nextLogicalRow < 0) nextLogicalRow = size-1;

            int nextLogicalCol = startCol + 1;          
            if (nextLogicalCol > size-1) nextLogicalCol = 0;
            
            if(square.readValue(nextLogicalCol, nextLogicalRow) != 0){
                startRow++; 
                              
            }else{
                startRow--;
                startCol++;
            }
            
            if (startRow < 0) startRow = size - 1;
            if (startCol > size - 1) startCol = 0;

            square.placeValue(startCol, startRow, startVal);

        }

        return square;
    }

}
