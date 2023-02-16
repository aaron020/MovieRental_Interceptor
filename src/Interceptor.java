
/*
    • Defines an interface for out-of-band services.
 */

public interface Interceptor {
    void interceptStatement(Context context);
    void interceptFrequentRenterPoints(Context context);
}
