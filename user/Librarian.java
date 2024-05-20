import java.util.Scanner;

public class Librarian extends User {
    //roll
    private final String ROLE = "l";

    public String getROLE() {
        return ROLE;
    }

    // Bibliotekarie creator. Den skapar bibliotekarier
    Librarian(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public void passwordTest(String password) {
        super.passwordTest(password);

    }

    @Override
    protected void menu() {
        System.out.println(" borrow a book \n read a book \n return book \n log out \n see books");
        Scanner scanner = new Scanner(System.in);
        loop:
        while (true) {
            String answer = scanner.nextLine();
            switch (answer.toLowerCase()) {
                case "borrow a book":
                    addBook();
                    break;
                case "read a book":
                    readBook();
                    break;
                case "return book":
                    deleteBook();
                    break;
                case "see books":
                    sortedBooks();
                    break;
                case "create book":
                    createBook();
                    break;
                case "delete book from libary":
                    deleteLibaryBook();
                    break;
                case "log out":
                    break loop;
                default:
                    System.out.println("check your spelling please");
                    break;
            }
            System.out.println(" borrow a book \n read a book \n return book \n log out \n see books \n create book\n delete book from libary  ");
        }
    }

    private void createBook() { //låter bibliotekarien skapa en ny bok
        new BookCreator().bCreate();
    }

    private void deleteLibaryBook() { // låter radera en bok
        BookList.bookDelete();
    }
}

