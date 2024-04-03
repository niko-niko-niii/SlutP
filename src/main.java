public class main {
    public static void main(String[] args) {
        customer customer =new customer("vlad","123","1"); //creates a customer
        userList.Customer.add(customer);
        customer =new customer("v1","321","2");
        userList.Customer.add(customer);
        customer =new customer("v3","234","3");
        userList.Customer.add(customer);

        while(true) {
            userLoggin.loggIn();
        }

    }
}
