public class Librarian extends Customer {
    //roll
    private final String ROLE="l";
    public String getROLE() {
        return ROLE;
    }
 // Bibliotekarie creator. Den skapar bibliotekarier
    Librarian(String name, String password) {
        this.name=name;
        this.password=password;

    }



    @Override
    protected void menu() {
        System.out.println("hello"+name);
        System.out.println("hello Librarian");
    }
}
