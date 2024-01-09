
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();


        while (true){
            System.out.println("Input the name of the book, empty stops");
            String name = scanner.nextLine();

            if(name.isEmpty()) break;

            System.out.println("Input the age recommendation:");
            String age = scanner.nextLine();

            bookList.add(new Book(name, Integer.valueOf(age)));
        }

        
        
        Comparator<Book> comparator = Comparator
            .comparing(Book::getAge)
            .thenComparing(Book::getName);

        Collections.sort(bookList, comparator);

        System.out.println(bookList.size() + " books in total.");
        System.out.println("Books:");
        for (Book book : bookList){
            System.out.println(book);
        }

    }

}
