import java.util.ArrayList;

public abstract class User {
protected String name;
protected String password;
protected ArrayList<String> borrowed = new ArrayList<>(); //borrowed books list

    //abstrakta funktioner
    abstract String getROLE();


    //getters
    public String getName() {return name;}
    public ArrayList<String> getBorrowed() {return borrowed;}

    // lösenord test
    public void passwordTest(String password){
        if (this.password.equals(password)){
            menu();
        }else System.out.println("wrong password");
    }
    //meny
    protected void menu(){ //main menu
        System.out.println("welcome in "+name);
    }

}
