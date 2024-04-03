public class customer extends user {
    customer(String name, String password,String ID){
        this.name=name;
        this.password=password;
        this.ID=ID;
    }

    @Override
    public void ping() {
        System.out.println("customer");
        super.ping();

        if (userList.Customer.contains(customer.this)) {
            System.out.println("found");

            for (customer c :userList.Customer) {
                System.out.println(c);
                System.out.print(c.name);
                System.out.println(" "+c.password);
            }
        }
    }
}
