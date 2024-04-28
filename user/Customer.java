public class Customer extends User {
    //roll
 private final String ROLE="c";
   public String getROLE(){
        return ROLE;
    }
    //Kund creator. Den skapar kunder
    Customer(String name, String password){
        this.name=name;
        this.password=password;

    }
    public Customer() {
    }


    @Override
    protected void menu() {
        super.menu();
        System.out.println("hello customer");
    }
}
