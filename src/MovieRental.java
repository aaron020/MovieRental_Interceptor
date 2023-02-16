
/*
    • Allows services to obtain state information from the concrete
    framework.
    • Allows services to control certain behaviours in the concrete
    framework.
 */
public class MovieRental {

    public void loadStatement(Context context, Dispatcher dispatcher){
        Interceptor moviesRented = ConcreteInterceptor.getInstance();

        dispatcher.register(moviesRented);
        dispatcher.interceptStatement(context);
    }

    public void loadFrequentRenterPoints(Context context, Dispatcher dispatcher){
        Interceptor moviesRented = ConcreteInterceptor.getInstance();

        dispatcher.register(moviesRented);
        dispatcher.interceptFrequentRenterPoints(context);
    }


}
