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
        Dispatcher dispatcher = Dispatcher.getInstance();
        MovieRental movieRental = new MovieRental();
        List<Rental> rentals = new ArrayList<>();

        rentals.add(new Rental(new Movie("Harry Potter",Movie.CHILDRENS), 3));
        rentals.add(new Rental(new Movie("Lord of the rings",Movie.REGULAR), 5));
        rentals.add(new Rental(new Movie("Spider-man",Movie.NEW_RELEASE), 8));
        Context context = new Context("John", rentals);


        movieRental.loadStatement(context,dispatcher);
        movieRental.loadFrequentRenterPoints(context,dispatcher);

        List<Rental> rentals2 = new ArrayList<>();
        rentals2.add(new Rental(new Movie("Inception",Movie.REGULAR), 6));
        rentals2.add(new Rental(new Movie("Batman",Movie.CHILDRENS), 10));
        Context context2 = new Context("Mark", rentals2);

        movieRental.loadStatement(context2,dispatcher);
    }
}
