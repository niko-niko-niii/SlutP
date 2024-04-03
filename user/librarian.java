public class librarian extends customer{
    librarian(String name, String password, String ID) {
        super(name, password, ID);
    }

    @Override
    public void ping() {
        System.out.println("librarian");
        super.ping();
    }
}
