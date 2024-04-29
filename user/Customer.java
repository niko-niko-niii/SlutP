import java.util.Scanner;

public class Customer extends User {
    //roll
    private final String ROLE = "c";

    public String getROLE() {
        return ROLE;
    }

    //Kund creator. Den skapar kunder
    Customer(String name, String password) {
        this.name = name;
        this.password = password;

    }
    public Customer() {
    }

    @Override
    protected void menu() {
        Scanner scanner = new Scanner(System.in);
        super.menu();
        //borrow a book
        // read a book
        // return book
        // log out
        loop:
        while (true) {
            String answer = scanner.nextLine();

            switch (answer.toLowerCase()) {
                case "borrow a book":addBook();
                    break;
                case "read a book": readBook();
                    break;
                case "return book":deleteBook();
                    break;
                case "see books": sortedBooks();
                    break;
                case "log out": break loop;
                default:
                    System.out.println("check your spelling please");
            }
            System.out.println(" borrow a book \n read a book \n return book \n log out \n see books");        }
    }
}
