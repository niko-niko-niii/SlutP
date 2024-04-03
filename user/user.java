import java.util.ArrayList;

public class user {
protected String name;
protected String password;
protected String ID;
protected ArrayList<String> borrowed = new ArrayList<>(); //borrowed books list

    public String getName() {return name;}
    public ArrayList<String> getBorrowed() {return borrowed;}
    public String getID() {return ID;}

    public void passwordTest(String password){
        if (this.password.equals(password)){
            menu();
        }else System.out.println("wrong password");
    }
    protected void menu(){
        System.out.println("welcome in "+name);
    }

    public void ping(){
    System.out.println("ping");
}

}
