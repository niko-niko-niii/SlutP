public class customer extends user{

    @Override
    public void ping() {
        System.out.println("customer");
        super.ping();
    }
}
