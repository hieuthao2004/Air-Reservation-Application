package Customer;

public class CustomerFactory {
    private CustomerFactory instance;

    public CustomerFactory() {}

    public CustomerFactory getInstance() {
        if (instance == null) {
            instance = new CustomerFactory();
        }
        return instance;
    }

    public Customer createProfile(long id, String name, String dob) throws Exception {
        return new Customer(id, name, dob);
    }
    
}
