import java.util.ArrayList;
import java.util.Scanner;

public abstract class User {
protected String name;
protected String password;
protected ArrayList<Book> borrowed = new ArrayList<>(); //borrowed books list

    //abstrakta funktioner
    abstract String getROLE();


    //getters
    public String getName() {return name;}
    public ArrayList<Book> getBorrowed() {return borrowed;}

    // lösenord test
    public void passwordTest(String password){ //lösenord testare
        if (this.password.equals(password)){ //kollar om lösenordet är korrekt
            menu(); //anropar meny
        }else System.out.println("wrong password");
    }
    //meny
    protected void menu(){ //main menu
        System.out.println("welcome in "+name);
        System.out.println("what do you want to do");
        System.out.println(" borrow a book \n read a book \n return book \n log out \n see books");
    }


    //"book" array hanterare
    protected void addBook(){
        Book book =BookList.borrowBook();
        if (book!=null){
            borrowed.add(book);
            System.out.println("book "+book.getName()+" was added");
        }

    }
    protected void deleteBook(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Name of the book you want to return:");
        String delete= scanner.nextLine();// tar in namn på boken som ska bort
        for (Book b:borrowed) {// går igenom listan för att hitta boken
            if(b.getName().equalsIgnoreCase(delete)){// hittar boken som ska raderas
                borrowed.remove(b); //raderar boken
                break;//stänger ner funktionen
            }
        }
        System.out.println("book deleted");

    }
    protected void readBook(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Name of the book you want to read:");
        String read= scanner.nextLine();// tar in namn på boken som ska läsas
        for (Book b:borrowed) {// går igenom listan för att hitta boken
            if(b.getName().equalsIgnoreCase(read)){// hittar boken som ska läsas
               b.readFile(); //läser av filen
                break;//stänger ner funktionen
            }
        }
        System.out.println("book was not found");

    }

    //boksorterare
    void sortedBooks(){
    BookList.sortBooks();
    }
}
