import java.util.ArrayList;

public class userList {
    protected static ArrayList<customer> Customer =new ArrayList<>();
    protected static ArrayList<librarian> Librarian = new ArrayList<>();

    public static void customerList(){for (customer c :Customer) {System.out.println(c.getName());}}
    public static void librarianList(){for (librarian l: Librarian) {System.out.println(l.getName());}}

    public static void customerLoggin(String uName, String password){
        for (customer c:Customer) {
            if (uName.equalsIgnoreCase(c.getName())){
                c.passwordTest(password);
            }

        }

    }
    public static void librarianLoggin(String uName, String password){
        for (librarian l: Librarian){
            if (uName.equalsIgnoreCase(l.getName())){
                l.passwordTest(password);
            }
        }
    }

}
