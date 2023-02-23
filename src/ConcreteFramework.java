import java.util.ArrayList;
import java.util.List;


/*
    • Defines application services.
    • Integrates Dispatchers that allow applications to
    intercept events.
    • Delegates events to associated dispatchers
 */
public class ConcreteFramework {


    public static void main(String[] args){
        DispatcherOutGoing dispatcherOutGoing = DispatcherOutGoing.getInstance();
        DispatcherInComing dispatcherInComing = DispatcherInComing.getInstance();
        MovieRental movieRental = new MovieRental();
        List<Rental> rentals = new ArrayList<>();

        rentals.add(new Rental(new Movie("Harry Potter",Movie.CHILDRENS), 3));
        rentals.add(new Rental(new Movie("Lord of the rings",Movie.REGULAR), 5));
        rentals.add(new Rental(new Movie("Spider-man",Movie.NEW_RELEASE), 8));
        Customer customer1 = new Customer("John");
        for (Rental r : rentals){
            customer1.addRental(r);
        }
         Context context = new Context(customer1);


        movieRental.loadCustomer(context, dispatcherInComing);
        movieRental.loadStatement(context, dispatcherOutGoing);
        movieRental.loadFrequentRenterPoints(context, dispatcherOutGoing);

        List<Rental> rentals2 = new ArrayList<>();
        rentals2.add(new Rental(new Movie("Inception",Movie.REGULAR), 6));
        rentals2.add(new Rental(new Movie("Batman",Movie.CHILDRENS), 10));
        Customer customer2 = new Customer("Mark");
        for (Rental r : rentals){
            customer2.addRental(r);
        }

        Context context2 = new Context(customer2);

        movieRental.loadStatement(context2, dispatcherOutGoing);
    }
}
