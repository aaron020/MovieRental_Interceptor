import java.util.ArrayList;
import java.util.List;


/*
    • Allows services to obtain state information from the concrete
    framework.
    • Allows services to control certain behaviours in the concrete
    framework.
 */
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
