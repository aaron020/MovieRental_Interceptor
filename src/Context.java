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


    public Context(Customer customer){
        this.customer = customer;
    }


    public int getTotalFrequentRenterPoints(){
        return customer.getTotalFrequentRenterPoints();
    }

    public String getStatement(){
        return customer.statement();
    }

    public String getName(){
        return customer.getName();
    }

    //Not needed - interceptor cant access anything from customer object
    //must be accessed through context
//    public Customer getCustomer() {
//        return customer;
//    }
}
