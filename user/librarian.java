public class librarian extends customer{
    librarian(String name, String password, String ID) {
        super();
        this.name=name;
        this.password=password;
        this.ID=ID;
    }

    @Override
    protected void menu() {
        super.menu();
        System.out.println("librarian");
    }
}
