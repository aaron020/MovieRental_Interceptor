import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 *
 * Page 34
 * A customer who rents movies.
 * The customer object holds information about the
 * movies rented for the current billing period,
 * and can print a statement of his rentals.
 */
public class Customer {
    /** Customer's name. */
    private String name;
    /** Customer's rentals for current billing period. */
    private List<Rental> rentals;

    /** Initialize a new customer. */
    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<Rental>();
    }

    public void addRental(Rental rental) {
        if (! rentals.contains(rental)) rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    /** Print all the rentals in current period,
     * along with total charges and reward points.
     * @return the statement as a String
     */
    public String statement() {
        double amount = 0; // total charges
        StringBuilder result = new StringBuilder("Rental Record for " + getName() + "\n\n");
        for(Rental rental: rentals) {
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(rental.getCharge()).append("\n");
        }
        // footer: summary of charges
        result.append("Amount owed ").append(getTotalCharge()).append("\n");
        result.append("You earned ").append(getTotalFrequentRenterPoints()).append("\n");
        return result.toString();
    }

    public String htmlStatement(){
        double amount = 0; // total charges
        StringBuilder result = new StringBuilder("<H1>Rental Record for " + getName() + "<H1>\n");
        for(Rental rental: rentals) {
            result.append("\t").append(rental.getMovie().getTitle()).append("\t").append(rental.getCharge()).append("\n");
        }
        // footer: summary of charges
        result.append("<P>Amount owed ").append(getTotalCharge()).append("<P>\n");
        result.append("<P>You earned ").append(getTotalFrequentRenterPoints()).append("<P>\n");
        return result.toString();
    }

    public int getTotalFrequentRenterPoints(){
        int result = 0;
        for(Rental rental : rentals){
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

    private double getTotalCharge(){
        double result = 0;
        for(Rental rental : rentals){
            result += rental.getCharge();
        }
        return result;
    }



    /** Get a logger object. */
    private static Logger getLogger() {
        return Logger.getLogger(Customer.class.getName());
    }

}