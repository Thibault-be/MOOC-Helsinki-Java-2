
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        try{
            Files.lines(Paths.get("literacy.csv"))
            .map(line -> line.split(","))
            .sorted((line1, line2) -> Double.compare(Double.parseDouble(line1[5]), Double.parseDouble(line2[5])))
            .map(line -> line[3] + " (" + line[4]+"), " + line[2].replaceAll("[^a-zA-z]", "") + ", " + line[5])
            .forEach(line -> System.out.println(line));
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


//Create a program that first reads the file literacy.csv and 
//then prints the contents from the lowest to the highest ranked on the literacy rate. 
//The output must be exactly as in the following example. The example shows the first five of the expected rows.