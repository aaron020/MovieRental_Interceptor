import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 *
 * Page 28
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
        int frequentRenterPoints = 0; // frequent renter points
        StringBuilder stmt = new StringBuilder("Rental Report for "+getName()).append("\n\n");
        // header for details section
        stmt.append(String.format("%-40.40s %4s %-8s\n", "Movie Title", "Days", "Price"));

        for(Rental rental: rentals) {

            frequentRenterPoints += rental.getFrequentRenterPoints();

            // one line of detail for this movie
            stmt.append(String.format("%-40.40s %3d %8.2f\n", rental.getMovie().getTitle(), rental.getDaysRented(), rental.getCharge()));
            amount += rental.getCharge();
        }
        // footer: summary of charges
        stmt.append( String.format("%-44.44s %8.2f\n", "Total Charges", amount));
        stmt.append( String.format("%-44.44s %5d\n","Frequent Renter Points earned", frequentRenterPoints) );

        return stmt.toString();
    }



    /** Get a logger object. */
    private static Logger getLogger() {
        return Logger.getLogger(Customer.class.getName());
    }

}