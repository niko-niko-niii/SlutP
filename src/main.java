import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        loop:
       while (true){
           System.out.println("what do you want to do:");
           System.out.println("register \n log in \n exit");
           String input=scanner.nextLine();

           switch (input.toLowerCase() ){
               case"register":new UserCreator().createUser();
               break;
               case"log in": new UserLogin().loggIn();
               break;
               case"exit": break loop;
               default :
                   System.out.println("check your spelling");

           }

       }
    }
}
