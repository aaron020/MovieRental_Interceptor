import java.util.ArrayList;
import java.util.List;

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
    }
}
