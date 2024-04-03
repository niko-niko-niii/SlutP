import java.util.Scanner;

public class userCreator {
    static Scanner scanner =new Scanner(System.in);
   public static void createUser(){
        startloop:
    do {
        System.out.println("new user name:");
        String name=scanner.next();
        System.out.println("new user password:");
        scanner.nextLine();
        String password=scanner.nextLine();
        System.out.println("are you creating \"Librarian\" or \"Customer\"");
        String answer="";
        try {
        answer= String.valueOf(scanner.next().charAt(0)); //Waay to long func that takes in only first char of the input
        }catch(Exception e){
            System.out.println("use only valid symbols");
        }
        switch (answer.toLowerCase()){
            case"l": userCreate(true,name,password);
                break startloop;
            case"c": userCreate(false,name,password);
            break startloop;
            default:
                System.out.println("something went wrong, try again");

        }

    }while(true);
    }
   private static void userCreate(boolean librarian, String name,String password){
       if(librarian){
       createLibrarian(name, password);
       }else{
       createCustomer(name, password);
       }
    }

    private static void createLibrarian(String name, String password){
    librarian librarian =new librarian(name,password,"1");// creates librarian
    userList.Librarian.add(librarian); // adds librarian to a list
    librarian.ping();

    }
    private static void createCustomer(String name, String password){
    customer customer =new customer(name,password,"1"); //creates a customer
    userList.Customer.add(customer); // adds customer to a list
    customer.ping();
    }
}
