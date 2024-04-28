import java.util.ArrayList;

public class BookList {
   private static ArrayList<Book> books =new ArrayList<>();

    public static void addBook(Book x){
        books.add(x);
    }
}
