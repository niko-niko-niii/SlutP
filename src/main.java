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
        Book book =new Book("a",5,"j","horror");
        BookList.addBook(book);
        book.recieveBookText("funkar");

        book =new Book("b",0,"f","horror");
        BookList.addBook(book);
        book.recieveBookText("funkar");

        book =new Book("c",3,"d","horror");
        BookList.addBook(book);
        book.recieveBookText("funkar");

        new UserLogin().loggIn();
    }
}
