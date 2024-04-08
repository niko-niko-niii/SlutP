public class customer extends user {
    customer(String name, String password,String ID){
        this.name=name;
        this.password=password;
        this.ID=ID;
    }
    public customer() {}

    @Override
    protected void menu() {
        super.menu();
        System.out.println("customer");
    }
}
