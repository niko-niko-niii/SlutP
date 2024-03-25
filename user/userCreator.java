import java.util.Scanner;

public class userCreator {
    static Scanner scanner =new Scanner(System.in);
   public void createUser(){
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
            case"user": userCreate(true);
                break startloop;
            case"customer": userCreate(false);
            break startloop;
            default:
                System.out.println("something went wrong, try again");

        }

    }while(true);
    }
     void userCreate(boolean libarian){


    }

    private void createLibarian(){

    }
    private void createCustomer(){

    }
}
