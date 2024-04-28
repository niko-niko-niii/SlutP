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
        new Book("a",100,"b","sci fi").filehandler();


    }
}
