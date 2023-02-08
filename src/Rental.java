/**
 * A rental of a movie by customer.
 * From Fowler's refactoring example.
 *
 * Rental should have fields and methods for the dates
 * that the movie was rented and returned, from which the
 * rental period is calculated.
 * But for simplicity of the example only a daysRented
 * field is shown.
 */
public class Rental {
    private Movie movie;
    private int daysRented;


    public int getFrequentRenterPoints(){
        int frequentRenterPoints = 1;
        if(getMovie().getPriceCode() == Movie.NEW_RELEASE
            && getDaysRented() > 1){
            frequentRenterPoints ++;
        }

        return frequentRenterPoints;

    }
    public double getCharge(){
        double thisAmount = 0;
        switch( getMovie().getPriceCode() ) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (getDaysRented() > 2) thisAmount += 1.5*(getDaysRented()-2);
                break;
            case Movie.CHILDRENS:
                thisAmount = 1.5;
                if (getDaysRented() > 3) thisAmount += 1.5*(getDaysRented()-3);
                break;
            case Movie.NEW_RELEASE:
                thisAmount = 3*getDaysRented();
                break;
        }

        return thisAmount;
    }


    /** Initialize a new movie rental object for
     * a movie with known rental period (daysRented).
     */
    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }


    /**
     * @return the movie
     */
    public Movie getMovie() {
        return movie;
    }


    /**
     * @return the daysRented
     */
    public int getDaysRented() {
        return daysRented;
    }



}