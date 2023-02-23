

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
