import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Customer customer =new Customer("vlad","123");
        UserList.addUser(customer);
        customer =new Customer("v1","321");
        UserList.addUser(customer);
        customer =new Customer("v3","234");
        UserList.addUser(customer);
        Librarian librarian =new Librarian("vlad","123");
        UserList.addUser(librarian);
        Scanner scanner =new Scanner(System.in);
        Book book =new Book("a",1,"j","horror");
        BookList.addBook(book);
        book.recieveBookText("funkar");
        BookList.bookDelete("a");



    }
}
