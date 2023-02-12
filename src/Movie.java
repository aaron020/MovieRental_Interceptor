/**
 * A movie available for rent.
 */
public class Movie {
    /** The classes of movies. */
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;

    /** movie price code based on classification */
    private Price priceCode;
    /** the title, of course */
    private String title;

    /** Initialize a new movie. */
    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    /**
     * @return the priceCode
     */
    public int getPriceCode() {
        return priceCode.getPriceCode();
    }

    /**
     * @param arg the priceCode to set
     */
    public void setPriceCode(int arg) {
        switch (arg){
            case REGULAR -> priceCode = new RegularPrice();
            case CHILDRENS -> priceCode = new ChildrensPrice();
            case NEW_RELEASE -> priceCode = new NewReleasePrice();
            default -> throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    /** Return the movie title */
    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title;
    }


    public double getCharge(int daysRented){
        return priceCode.getCharge(daysRented);
    }


    public int getFrequentRenterPoints(int daysRented){
        return priceCode.getFrequentRenterPoints(daysRented);
    }
}
