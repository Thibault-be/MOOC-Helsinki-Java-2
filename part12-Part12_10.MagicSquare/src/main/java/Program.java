
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here

          MagicSquare ms = new MagicSquare(2);

          //ms.placeValue(0, 0, 1);
          //ms.placeValue(0 , 1, 2);
        //  ms.placeValue(0 , 2, 1);

         // ms.placeValue(1 , 0, 3);
         // ms.placeValue(1 , 1, 4);
        //  ms.placeValue(1 , 2, 2);

        //  ms.placeValue(2 , 0, 3);
        //  ms.placeValue(2 , 1, 3);
        //  ms.placeValue(2 , 2, 3);


        // System.out.println(ms);

        // System.out.println(ms.sumsOfRows());
        // System.out.println(ms.sumsOfColumns());
        // System.out.println(ms.sumsOfDiagonals());
        


        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(11));
    }
}
