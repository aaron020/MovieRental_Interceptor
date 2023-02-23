
/*
    • Defines an interface for out-of-band services.
 */

public interface InterceptorOutGoing {
    void interceptStatement(Context context);
    void interceptFrequentRenterPoints(Context context);
}
