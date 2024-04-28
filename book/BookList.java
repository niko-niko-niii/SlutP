import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookList implements Comparator<Book> {
   private static ArrayList<Book> books =new ArrayList<>();

    public static void addBook(Book x){
        books.add(x);
    }
    public static void bookList(){
        for (Book b: books) {
            System.out.println(b.getName());
        }
    }

    public static void bookDelete(String bName){
        for (Book b: books) {
            if (b.getName().equalsIgnoreCase(bName))
                b.deleteFile();
                books.remove(b);
            System.out.println("book *"+bName+"* was deleted" );
                break;
        }
    }

    public void sortBooks(){
        System.out.println("sort by");
        System.out.println("release date \nauthor name \ngenre");
        Scanner scanner= new Scanner(System.in);
        String answer = scanner.nextLine();
        loop:
        while(true) {
            switch (answer) {

                case "release date": dateSort();
                    break loop;
                case " author name": authorSort();
                    break loop;
                case "genre": genreSort();
                    break loop;
                case "exit": break loop;
                default:
                    System.out.println("you typed something wrong, try again");
            }
        }
    }



    private void dateSort()  {
        ArrayList<Book> sorted= (ArrayList<Book>) books.clone();
        Collections.sort(sorted ,new datesort


    }


    private void authorSort(){

    }
    private void genreSort(){

    }
}
