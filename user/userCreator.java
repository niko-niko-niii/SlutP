import java.util.Scanner;

public class userCreator {
    static Scanner scanner =new Scanner(System.in);
   public static void createUser(){
        startloop:
    do {
        System.out.println("are you creating \"Libarian\" or \"Customer\"");
        String answer="";
        try {
        answer=scanner.next();
        }catch(Exception e){
            System.out.println("use only valid symbols");
        }
        switch (answer.toLowerCase()){
            case"libarian": userCreate(true);
                break startloop;
            case"customer": userCreate(false);
            break startloop;
            default:
                System.out.println("something went wrong, try again");

        }

    }while(true);
    }
   private static void userCreate(boolean libarian){
       if(libarian){
       createLibarian();

       }else{
       createCustomer();

       }



    }

    private static void createLibarian(){
    libarian libarian =new libarian();
    libarian.ping();

    }
    private static void createCustomer(){
    customer customer =new customer();
    customer.ping();
    }
}
