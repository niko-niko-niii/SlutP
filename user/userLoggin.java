import java.util.Scanner;

public class userLoggin {
    static Scanner scanner = new Scanner(System.in);

    public static void loggIn() {
         loop:
        while (true) {
            System.out.println("librarian or customer?");
            String answer = String.valueOf(scanner.next().charAt(0));
            switch (answer.toLowerCase()) {
                case "l":librarianLoggIn();
                    break loop;
                case "c":customerLoggIn();
                    break loop;
                default:
                    System.out.println("try again");
            }
        }
    }

    private static void librarianLoggIn() {
        System.out.println("all Librarians");
        userList.librarianList();

        System.out.println("write your username:");
        String uName= scanner.next();
        System.out.println("write your password:");
        String password=scanner.next();
        userList.librarianLoggin(uName,password);

    }

    private static void customerLoggIn(){
        System.out.println("all Customers");
        userList.customerList();

            System.out.println("write your username:");
            String uName= scanner.next();
            System.out.println("write your password:");
            String password=scanner.next();
            userList.customerLoggin(uName,password);



    }


}