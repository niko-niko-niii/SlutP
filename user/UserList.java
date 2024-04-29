import java.util.ArrayList;

public class UserList {

    private static ArrayList<User> users = new ArrayList<>();

    public static void userLogin(String uName, String password, char R) {
        loop:
        for (User u : users) {
            //kollar om rollen "user" har
            //om den är korekt fortsätter koden in annars

            if (u.getROLE().equalsIgnoreCase(String.valueOf(R))) {

                if (uName.equalsIgnoreCase(u.getName())) {
                    /* om användarnamnet passar då skickas koden
                     * till kundklassen för att se om den är korekt  */
                    u.passwordTest(password);
                    /* om allt är korekt då loggas användaren in och när
                     * an vändare loggar ut så stoppas loopen
                     */
                    break loop;
                }
            }
        }
    }

    static void addUser(User user) {
        users.add(user);
    }

}
