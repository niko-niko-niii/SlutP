import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookList {
   private static ArrayList<Book> books =new ArrayList<>();

    public static void addBook(Book x){
        books.add(x);
    }
    public static void bookList(){
        for (Book b: books) {
            System.out.println(b.getName());
        }
    }
    // funktion skickar ut boken
    public static Book borrowBook(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("wtrite name of the book:");
        String book= scanner.nextLine().toLowerCase(); //scanner tar in bokens namn
        for (Book b:books) { // foreach går igenom hela listan
            if (book.equalsIgnoreCase(b.getName())){ //if satsen hittar boken
                return(b); // och skickar den tillbaka
            }
        }
        System.out.println("book was not found");// om inget hittas
       return null;// skickas det ut null
    }

    public static void bookDelete(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("type book name you want to delete");
        String bName= scanner.nextLine();
        for (Book b: books) {
            if (b.getName().equalsIgnoreCase(bName))
                b.deleteFile();
                books.remove(b);
            System.out.println("book *"+bName+"* was deleted" );
                break;
        }
    }

    public static void sortBooks(){
        System.out.println("sort by");
        System.out.println("release date \nauthor name \ngenre");
        Scanner scanner= new Scanner(System.in);
        String answer = scanner.nextLine();
        loop:
        while(true) {
            switch (answer) {
                case" name":nameSort();
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


    //function under sorts books after genré
private static void genreSort(){
        ArrayList<Book>romance= new ArrayList<>();
        ArrayList<Book>horror=new ArrayList<>();
        ArrayList<Book>sciFi=new ArrayList<>();
        ArrayList<Book>cookBook=new ArrayList<>();
        ArrayList<Book>comics=new ArrayList<>();

        for (Book b:books) {
           String genre= b.getGenre();

           switch (genre){
               case "romance": romance.add(b);
                   break;
               case "horror": horror.add(b);
                   break;
               case "sci fi":sciFi.add(b);
                   break;
               case "cook book":cookBook.add(b);
                   break;
               case "comics":comics.add(b);
                   break;
           }
        }
        System.out.println("romance books:");
        for (Book b:romance) {
            System.out.println(b.getName());
        }
        System.out.println("horror books:");
        for (Book b:horror) {
            System.out.println(b.getName());
        }
        System.out.println("sci fi books:");
        for (Book b:sciFi) {
            System.out.println(b.getName());
        }
        System.out.println("cook books:");
        for (Book b:cookBook) {
            System.out.println(b.getName());
        }
        System.out.println("comics:");
        for (Book b:comics) {
            System.out.println(b.getName());
        }

    }

    //två funktioner nedan sorterar arraylist enligt author
private static class  authorSort implements Comparator<Book>{
        public int compare(Book a, Book b){
            return a.getAuthor().compareTo(b.getAuthor());
        }
}
    private static void authorSort()  {
        //klonar "books" array för att inte kunna skada listan
        ArrayList<Book> sorted=(ArrayList<Book>)books.clone();
        //sorterar listan
        Collections.sort(sorted, new nameSort());

        //skriver ut listan
        System.out.println("sorted list");
        for (Book b:sorted) {
            System.out.println(b.getName());
        }
    }

    //två funktioner nedan sorterar arraylist enligt namn
private static class  nameSort implements Comparator<Book>{
        public int compare(Book a, Book b){
            return a.getName().compareTo(b.getName());
        }
    }
    private static void nameSort()  {
        //klonar "books" array för att inte kunna skada listan
        ArrayList<Book> sorted=(ArrayList<Book>)books.clone();
        //sorterar listan
        Collections.sort(sorted, new nameSort());

        //skriver ut listan
        System.out.println("sorted list");
        for (Book b:sorted) {
            System.out.println(b.getName());
        }
    }


    //två funktioner nedan sorterar arraylist enligt datum
private static class  dateSort implements Comparator<Book>{
        public int compare(Book a, Book b){
            return a.getReleaseDate()-b.getReleaseDate();
        }
}
    private static void dateSort()  {
        //klonar "books" array för att inte kunna skada listan
        ArrayList<Book> sorted=(ArrayList<Book>)books.clone();
        //sorterar listan
        Collections.sort(sorted, new dateSort());

        //skriver ut listan
        System.out.println("sorted list");
        for (Book b:sorted) {
            System.out.println(b.getName());
        }
    }
}
