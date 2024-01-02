
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printValues(HashMap<String, Book> hashmap){
        for (Book book : hashmap.values()){
            System.out.println(book.toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text){
        for (Book book : hashmap.values()){
            if (book.getName().contains(text)){
                System.out.println(book.toString());
            }
        }
    }


}

/*
public static void printValues(HashMap<String,Book> hashmap),
 which prints all the values in the hashmap given as a parameter using
the toString method of the Book objects.

public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text),
 which prints only the Books in the given hashmap which name contains the given string. 
 You can find out the name of a Book with the method getName.
 */
