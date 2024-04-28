import java.util.Scanner;

public class UserCreator {
    static Scanner scanner =new Scanner(System.in);
   public void createUser(){
        startloop:
    do {
        // tar in kundens namn
        System.out.println("new User name:");
        String name=scanner.next();
        //tar in lösenord
        System.out.println("new User password:");
        scanner.nextLine();
        String password=scanner.nextLine();
        //frågar användare vilken roll den ska ha
        System.out.println("are you creating \"Librarian\" or \"Customer\"");
            //tar bara den första bokstaven i från scanner
       String answer= String.valueOf(scanner.next().charAt(0));
        switch (answer.toLowerCase()){
            //ifall användare skapar bibliotekarie körs detta:
            case"l": createLibrarian(name,password);
                break startloop;

                //ifal användare skapar kund körs detta:
            case"c": createCustomer(name,password);
            break startloop;

            //ifall något går fell eller användare skriver in fel komando så körs detta:
            default:
                System.out.println("something went wrong, try again");
        }

    }while(true);
    }
    //bibliotekariefabrik den skapar bibliotekarie och lägger dem i listan
    private void createLibrarian(String name, String password){
    Librarian librarian =new Librarian(name,password);// creates Librarian
     // adds Librarian to a list
     UserList.addUser(librarian);

    }
    //kundfabrik den skapar bibliotekarie och lägger dem i listan
    private void createCustomer(String name, String password){
    Customer customer =new Customer(name,password); //creates a Customer
        UserList.addUser(customer); // adds Customer to a list

    }
}
