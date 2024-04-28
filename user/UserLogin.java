import java.util.Scanner;

public class UserLogin {
    static Scanner scanner = new Scanner(System.in);

    // funktion filtrerar kunder och bibliotekarier
    public void loggIn() {
        // oändlig loop så att kod kan inte gå sönder om man skriver in fell saker
        char u;
        loop:
        while (true) {
            System.out.println("Librarian or Customer?");
            // "answer" fångar in bara första bokstaven
            // för att då kan användaren ha stavfel och fortfarande komma till rätt plats
            String answer = String.valueOf(scanner.next().charAt(0));
            //switch kollar om svaret var gilltig
            switch (answer.toLowerCase()) {
                // om avändaren vill logga in som bliotekarie så används denna kodbit
                case "l":
                    u = 'l';
                    break loop;
                // om avändaren vill logga in som kund så används denna kodbit
                case "c":
                    u = 'c';
                    break loop;
                // om användare skriver något fel och koden ovan inte förstår vad användare vill
                // då får hen info om att de skrev fel prompt
                default:
                    System.out.println(answer + " is not a valid prompt");
            }
        }
        System.out.println("write your username:");
        String uName = scanner.next(); //användarnamn
        System.out.println("write your password:");
        String password = scanner.next(); //lösenord
        UserList.userLogin(uName, password, u);

    }
}



