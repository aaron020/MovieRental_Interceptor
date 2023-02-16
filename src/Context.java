import java.util.ArrayList;
import java.util.List;

public class Context {
    Customer customer;


    public Context(String name, List<Rental> rentals){
        customer = new Customer(name);
        for (Rental rental : rentals){
            customer.addRental(rental);
        }
    }

    public Customer getCustomer() {
        return customer;
    }
}
